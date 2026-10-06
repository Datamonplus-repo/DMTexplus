package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prevreo extends GXProcedure
{
   public prevreo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prevreo.class ), "" );
   }

   public prevreo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      prevreo.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      prevreo.this.AV41EmprCod = aP0[0];
      this.aP0 = aP0;
      prevreo.this.AV42BarCod = aP1[0];
      this.aP1 = aP1;
      prevreo.this.AV21BarCodReo = aP2[0];
      this.aP2 = aP2;
      prevreo.this.AV43BarCodPar = aP3[0];
      this.aP3 = aP3;
      prevreo.this.AV35Error_l = aP4[0];
      this.aP4 = aP4;
      prevreo.this.AV38usurcod = aP5[0];
      this.aP5 = aP5;
      prevreo.this.AV39station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Error_l = (byte)(0) ;
      AV40Msg_tintaca = "" ;
      /* Using cursor P01LT2 */
      pr_default.execute(0, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV21BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P01LT2_A6039RecAcab[0] ;
         n6039RecAcab = P01LT2_n6039RecAcab[0] ;
         A130BarCodPar = P01LT2_A130BarCodPar[0] ;
         A132BarCodReo = P01LT2_A132BarCodReo[0] ;
         A129BarCod = P01LT2_A129BarCod[0] ;
         A396EmprCod = P01LT2_A396EmprCod[0] ;
         A2804RecLinMaq = P01LT2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) != 0 )
         {
            AV40Msg_tintaca = httpContext.getMessage( "Hay RECETA DE TINTE ¡¡¡¡¡. No es posible recuperar", "") + GXutil.newLine( ) ;
            AV35Error_l = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01LT3 */
      pr_default.execute(1, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV21BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6039RecAcab = P01LT3_A6039RecAcab[0] ;
         n6039RecAcab = P01LT3_n6039RecAcab[0] ;
         A130BarCodPar = P01LT3_A130BarCodPar[0] ;
         A132BarCodReo = P01LT3_A132BarCodReo[0] ;
         A129BarCod = P01LT3_A129BarCod[0] ;
         A396EmprCod = P01LT3_A396EmprCod[0] ;
         A2804RecLinMaq = P01LT3_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( (GXutil.strcmp("", AV40Msg_tintaca)==0) )
            {
               AV40Msg_tintaca = httpContext.getMessage( "Hay RECETA DE ACABADO ¡¡¡¡¡. No es posible recuperar", "") + GXutil.newLine( ) ;
            }
            else
            {
               AV40Msg_tintaca += httpContext.getMessage( "Hay RECETA DE ACABADO ¡¡¡¡¡. No es posible recuperar", "") + GXutil.newLine( ) ;
            }
            AV35Error_l = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV35Error_l == 1 )
      {
         httpContext.GX_msglist.addItem(AV40Msg_tintaca);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P01LT4 */
      pr_default.execute(2, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV21BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4494HreBarPar = P01LT4_A4494HreBarPar[0] ;
         A4493HreBarReo = P01LT4_A4493HreBarReo[0] ;
         A4492HreBarCod = P01LT4_A4492HreBarCod[0] ;
         A396EmprCod = P01LT4_A396EmprCod[0] ;
         A4495HreNumCie = P01LT4_A4495HreNumCie[0] ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta en HISTORICO de RECETAS ¡¡¡¡¡. No es posible recuperar", ""));
         AV35Error_l = (byte)(1) ;
         pr_default.close(2);
         returnInSub = true;
         cleanup();
         if (true) return;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV22ReoAnter = (byte)(AV21BarCodReo-1) ;
      AV35Error_l = (byte)(0) ;
      /* Using cursor P01LT5 */
      pr_default.execute(3, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), AV43BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P01LT5_A130BarCodPar[0] ;
         A132BarCodReo = P01LT5_A132BarCodReo[0] ;
         A129BarCod = P01LT5_A129BarCod[0] ;
         A396EmprCod = P01LT5_A396EmprCod[0] ;
         A138BarConReo = P01LT5_A138BarConReo[0] ;
         if ( A138BarConReo != AV21BarCodReo )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Hay reoperados posteriores. No es posible recuperar", ""));
            AV35Error_l = (byte)(1) ;
            pr_default.close(3);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV32Lhipro = (byte)(0) ;
      /* Using cursor P01LT6 */
      pr_default.execute(4, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), AV43BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = P01LT6_A130BarCodPar[0] ;
         A132BarCodReo = P01LT6_A132BarCodReo[0] ;
         A129BarCod = P01LT6_A129BarCod[0] ;
         A396EmprCod = P01LT6_A396EmprCod[0] ;
         A1525HisProKgr = P01LT6_A1525HisProKgr[0] ;
         A602MaqCod = P01LT6_A602MaqCod[0] ;
         A558HisProFec = P01LT6_A558HisProFec[0] ;
         A561HisProLin = P01LT6_A561HisProLin[0] ;
         Gx_msg = httpContext.getMessage( "AVISO.Hay informacion del LECTOR OPTICO de la PRINCIPAL", "") ;
         AV32Lhipro = (byte)(1) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV36FasePesada = (byte)(0) ;
      /* Using cursor P01LT7 */
      pr_default.execute(5, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV21BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A457FasCod = P01LT7_A457FasCod[0] ;
         A130BarCodPar = P01LT7_A130BarCodPar[0] ;
         A132BarCodReo = P01LT7_A132BarCodReo[0] ;
         A129BarCod = P01LT7_A129BarCod[0] ;
         A396EmprCod = P01LT7_A396EmprCod[0] ;
         A153BarFasEst = P01LT7_A153BarFasEst[0] ;
         A7059FasPesInt = P01LT7_A7059FasPesInt[0] ;
         n7059FasPesInt = P01LT7_n7059FasPesInt[0] ;
         A194BarOrdLin = P01LT7_A194BarOrdLin[0] ;
         A758ProCod = P01LT7_A758ProCod[0] ;
         A7059FasPesInt = P01LT7_A7059FasPesInt[0] ;
         n7059FasPesInt = P01LT7_n7059FasPesInt[0] ;
         if ( ( GXutil.strcmp(A7059FasPesInt, httpContext.getMessage( "S", "")) == 0 ) && ( A153BarFasEst > 0 ) )
         {
            AV36FasePesada = (byte)(1) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( AV36FasePesada == 1 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. Se ha realizado la FASE PESAR", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      if ( AV32Lhipro == 1 )
      {
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      /* Using cursor P01LT8 */
      pr_default.execute(6, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV21BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A544HisCodPar = P01LT8_A544HisCodPar[0] ;
         A545HisCodReo = P01LT8_A545HisCodReo[0] ;
         A539HisBarCod = P01LT8_A539HisBarCod[0] ;
         A396EmprCod = P01LT8_A396EmprCod[0] ;
         A2297HisReoTn = P01LT8_A2297HisReoTn[0] ;
         n2297HisReoTn = P01LT8_n2297HisReoTn[0] ;
         A833TipDefCod = P01LT8_A833TipDefCod[0] ;
         AV33HISREOTN = A2297HisReoTn ;
         /* Execute user subroutine: 'NC' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P01LT9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV54GXLvl109 = (byte)(0) ;
      /* Using cursor P01LT10 */
      pr_default.execute(8, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV21BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A205BarPieMet = P01LT10_A205BarPieMet[0] ;
         A203BarPieKil = P01LT10_A203BarPieKil[0] ;
         A132BarCodReo = P01LT10_A132BarCodReo[0] ;
         A13988BarPieVtx = P01LT10_A13988BarPieVtx[0] ;
         A13519BarPieMq = P01LT10_A13519BarPieMq[0] ;
         n13519BarPieMq = P01LT10_n13519BarPieMq[0] ;
         A13518BarPieTurn = P01LT10_A13518BarPieTurn[0] ;
         n13518BarPieTurn = P01LT10_n13518BarPieTurn[0] ;
         A13109BarPieST = P01LT10_A13109BarPieST[0] ;
         n13109BarPieST = P01LT10_n13109BarPieST[0] ;
         A13108BarPieLote = P01LT10_A13108BarPieLote[0] ;
         n13108BarPieLote = P01LT10_n13108BarPieLote[0] ;
         A13107BarPieEmp = P01LT10_A13107BarPieEmp[0] ;
         n13107BarPieEmp = P01LT10_n13107BarPieEmp[0] ;
         A13004BarPieDest = P01LT10_A13004BarPieDest[0] ;
         n13004BarPieDest = P01LT10_n13004BarPieDest[0] ;
         A12992BarPieOpe = P01LT10_A12992BarPieOpe[0] ;
         n12992BarPieOpe = P01LT10_n12992BarPieOpe[0] ;
         A12936BarPieSecu = P01LT10_A12936BarPieSecu[0] ;
         n12936BarPieSecu = P01LT10_n12936BarPieSecu[0] ;
         A12935BarPieTono = P01LT10_A12935BarPieTono[0] ;
         n12935BarPieTono = P01LT10_n12935BarPieTono[0] ;
         A12928BarPieEncC = P01LT10_A12928BarPieEncC[0] ;
         n12928BarPieEncC = P01LT10_n12928BarPieEncC[0] ;
         A12927BarPieCoCN = P01LT10_A12927BarPieCoCN[0] ;
         n12927BarPieCoCN = P01LT10_n12927BarPieCoCN[0] ;
         A12926BarPieCoCI = P01LT10_A12926BarPieCoCI[0] ;
         n12926BarPieCoCI = P01LT10_n12926BarPieCoCI[0] ;
         A12925BarPieCliN = P01LT10_A12925BarPieCliN[0] ;
         n12925BarPieCliN = P01LT10_n12925BarPieCliN[0] ;
         A12924BarPieCliI = P01LT10_A12924BarPieCliI[0] ;
         n12924BarPieCliI = P01LT10_n12924BarPieCliI[0] ;
         A12923BarPieArtD = P01LT10_A12923BarPieArtD[0] ;
         n12923BarPieArtD = P01LT10_n12923BarPieArtD[0] ;
         A12922BarPieArtI = P01LT10_A12922BarPieArtI[0] ;
         n12922BarPieArtI = P01LT10_n12922BarPieArtI[0] ;
         A12921BarPieColN = P01LT10_A12921BarPieColN[0] ;
         n12921BarPieColN = P01LT10_n12921BarPieColN[0] ;
         A12920BarPieColD = P01LT10_A12920BarPieColD[0] ;
         n12920BarPieColD = P01LT10_n12920BarPieColD[0] ;
         A12912BarPieUltD = P01LT10_A12912BarPieUltD[0] ;
         n12912BarPieUltD = P01LT10_n12912BarPieUltD[0] ;
         A12911BarPieFep = P01LT10_A12911BarPieFep[0] ;
         n12911BarPieFep = P01LT10_n12911BarPieFep[0] ;
         A12780BarPieUsu = P01LT10_A12780BarPieUsu[0] ;
         n12780BarPieUsu = P01LT10_n12780BarPieUsu[0] ;
         A12779BarPieFdv = P01LT10_A12779BarPieFdv[0] ;
         n12779BarPieFdv = P01LT10_n12779BarPieFdv[0] ;
         A12113BarPieCLd = P01LT10_A12113BarPieCLd[0] ;
         n12113BarPieCLd = P01LT10_n12113BarPieCLd[0] ;
         A1642BarPieOrd = P01LT10_A1642BarPieOrd[0] ;
         n1642BarPieOrd = P01LT10_n1642BarPieOrd[0] ;
         A6473BarUniB = P01LT10_A6473BarUniB[0] ;
         n6473BarUniB = P01LT10_n6473BarUniB[0] ;
         A6472BarTara = P01LT10_A6472BarTara[0] ;
         n6472BarTara = P01LT10_n6472BarTara[0] ;
         A1919BarPieObs = P01LT10_A1919BarPieObs[0] ;
         n1919BarPieObs = P01LT10_n1919BarPieObs[0] ;
         A9984BarPiePda = P01LT10_A9984BarPiePda[0] ;
         n9984BarPiePda = P01LT10_n9984BarPiePda[0] ;
         A9846BarPieAncc = P01LT10_A9846BarPieAncc[0] ;
         n9846BarPieAncc = P01LT10_n9846BarPieAncc[0] ;
         A9800BarNPes = P01LT10_A9800BarNPes[0] ;
         n9800BarNPes = P01LT10_n9800BarNPes[0] ;
         A9799BarPz2 = P01LT10_A9799BarPz2[0] ;
         n9799BarPz2 = P01LT10_n9799BarPz2[0] ;
         A9798BarPz1 = P01LT10_A9798BarPz1[0] ;
         n9798BarPz1 = P01LT10_n9798BarPz1[0] ;
         A9796BarPieK2 = P01LT10_A9796BarPieK2[0] ;
         n9796BarPieK2 = P01LT10_n9796BarPieK2[0] ;
         A9795BarPieK1 = P01LT10_A9795BarPieK1[0] ;
         n9795BarPieK1 = P01LT10_n9795BarPieK1[0] ;
         A8907PzaB80 = P01LT10_A8907PzaB80[0] ;
         n8907PzaB80 = P01LT10_n8907PzaB80[0] ;
         A8838CodBarPz = P01LT10_A8838CodBarPz[0] ;
         n8838CodBarPz = P01LT10_n8838CodBarPz[0] ;
         A8707BapieObs = P01LT10_A8707BapieObs[0] ;
         n8707BapieObs = P01LT10_n8707BapieObs[0] ;
         A6489BarPieIdPz = P01LT10_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = P01LT10_n6489BarPieIdPz[0] ;
         A6116BarPieImp = P01LT10_A6116BarPieImp[0] ;
         n6116BarPieImp = P01LT10_n6116BarPieImp[0] ;
         A3277BarPieAut = P01LT10_A3277BarPieAut[0] ;
         n3277BarPieAut = P01LT10_n3277BarPieAut[0] ;
         A3276BarMtsAut = P01LT10_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P01LT10_n3276BarMtsAut[0] ;
         A3275BarKgsAut = P01LT10_A3275BarKgsAut[0] ;
         n3275BarKgsAut = P01LT10_n3275BarKgsAut[0] ;
         A2186BarPieLoc = P01LT10_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P01LT10_n2186BarPieLoc[0] ;
         A1691BarPieAnc = P01LT10_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P01LT10_n1691BarPieAnc[0] ;
         A1501BarPiePie = P01LT10_A1501BarPiePie[0] ;
         A1271BarPieLzd = P01LT10_A1271BarPieLzd[0] ;
         A908PieOriCod = P01LT10_A908PieOriCod[0] ;
         A197BarPConTro = P01LT10_A197BarPConTro[0] ;
         A183BarMetLan = P01LT10_A183BarMetLan[0] ;
         A170BarKilLan = P01LT10_A170BarKilLan[0] ;
         A201BarPieEst = P01LT10_A201BarPieEst[0] ;
         A44AlbRecCod = P01LT10_A44AlbRecCod[0] ;
         A200BarPieCod = P01LT10_A200BarPieCod[0] ;
         A130BarCodPar = P01LT10_A130BarCodPar[0] ;
         A129BarCod = P01LT10_A129BarCod[0] ;
         A396EmprCod = P01LT10_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV54GXLvl109 = (byte)(1) ;
         AV23BarPieMtr = A205BarPieMet ;
         AV24BarPieKil = A203BarPieKil ;
         /*
            INSERT RECORD ON TABLE TXPBARPIE

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W44AlbRecCod = A44AlbRecCod ;
         W205BarPieMet = A205BarPieMet ;
         W203BarPieKil = A203BarPieKil ;
         A132BarCodReo = AV22ReoAnter ;
         A205BarPieMet = AV23BarPieMtr ;
         A203BarPieKil = AV24BarPieKil ;
         /* Using cursor P01LT11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, A13988BarPieVtx});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if ( (pr_default.getStatus(9) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Optimized UPDATE. */
            /* Using cursor P01LT12 */
            pr_default.execute(10, new Object[] {AV23BarPieMtr, AV24BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* End optimized UPDATE. */
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
         A44AlbRecCod = W44AlbRecCod ;
         A205BarPieMet = W205BarPieMet ;
         A203BarPieKil = W203BarPieKil ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( AV54GXLvl109 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pudo recuperar la HDR anterior", ""));
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P01LT13 */
      pr_default.execute(11, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV22ReoAnter), AV43BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = P01LT13_A130BarCodPar[0] ;
         A132BarCodReo = P01LT13_A132BarCodReo[0] ;
         A129BarCod = P01LT13_A129BarCod[0] ;
         A396EmprCod = P01LT13_A396EmprCod[0] ;
         A9795BarPieK1 = P01LT13_A9795BarPieK1[0] ;
         n9795BarPieK1 = P01LT13_n9795BarPieK1[0] ;
         A203BarPieKil = P01LT13_A203BarPieKil[0] ;
         A200BarPieCod = P01LT13_A200BarPieCod[0] ;
         if ( ( AV36FasePesada == 1 ) && ( A9795BarPieK1.doubleValue() > 0 ) )
         {
            AV37inc_obs = httpContext.getMessage( "Hdr PESADA.", "") + GXutil.newLine( ) ;
            AV37inc_obs += httpContext.getMessage( "Barpiekil = ", "") + GXutil.str( A203BarPieKil, 9, 2) + " <- " + GXutil.str( A9795BarPieK1, 9, 2) ;
            A203BarPieKil = A9795BarPieK1 ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV57Pgmname, AV38usurcod, AV39station, AV37inc_obs, A129BarCod, AV22ReoAnter, A130BarCodPar) ;
         }
         /* Using cursor P01LT14 */
         pr_default.execute(12, new Object[] {A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         pr_default.readNext(11);
      }
      pr_default.close(11);
      AV58GXLvl151 = (byte)(0) ;
      /* Using cursor P01LT15 */
      pr_default.execute(13, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV22ReoAnter), AV43BarCodPar});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A130BarCodPar = P01LT15_A130BarCodPar[0] ;
         A132BarCodReo = P01LT15_A132BarCodReo[0] ;
         A129BarCod = P01LT15_A129BarCod[0] ;
         A396EmprCod = P01LT15_A396EmprCod[0] ;
         A252CliCod = P01LT15_A252CliCod[0] ;
         n252CliCod = P01LT15_n252CliCod[0] ;
         A212BarSer = P01LT15_A212BarSer[0] ;
         A136BarColNum = P01LT15_A136BarColNum[0] ;
         A135BarColNom = P01LT15_A135BarColNom[0] ;
         A218BarTipCol = P01LT15_A218BarTipCol[0] ;
         A213BarSit = P01LT15_A213BarSit[0] ;
         AV58GXLvl151 = (byte)(1) ;
         AV27CliCod = A252CliCod ;
         AV28BarSer = A212BarSer ;
         AV29BarColNUm = A136BarColNum ;
         AV30BarColNom = A135BarColNom ;
         AV31BarTipCol = A218BarTipCol ;
         if ( A213BarSit == 9 )
         {
            /* Execute user subroutine: 'BUSCO_SIT' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(13);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A213BarSit = AV25NewBarSit ;
         }
         /* Using cursor P01LT16 */
         pr_default.execute(14, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
      if ( AV58GXLvl151 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pudo recuperar la HDR anterior", ""));
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Optimized UPDATE. */
      /* Using cursor P01LT17 */
      pr_default.execute(15, new Object[] {Byte.valueOf(AV22ReoAnter), AV41EmprCod, Integer.valueOf(AV42BarCod), AV43BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCO_SIT' Routine */
      returnInSub = false ;
      /* Using cursor P01LT18 */
      pr_default.execute(16, new Object[] {AV41EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV22ReoAnter), AV43BarCodPar});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A4494HreBarPar = P01LT18_A4494HreBarPar[0] ;
         A4493HreBarReo = P01LT18_A4493HreBarReo[0] ;
         A4492HreBarCod = P01LT18_A4492HreBarCod[0] ;
         A396EmprCod = P01LT18_A396EmprCod[0] ;
         A4495HreNumCie = P01LT18_A4495HreNumCie[0] ;
         AV26HayRec = httpContext.getMessage( "S", "") ;
         pr_default.readNext(16);
      }
      pr_default.close(16);
      if ( GXutil.strcmp(AV26HayRec, httpContext.getMessage( "S", "")) == 0 )
      {
         AV25NewBarSit = (byte)(5) ;
      }
      else
      {
         /* Execute user subroutine: 'CFORMU' */
         S121 ();
         if (returnInSub) return;
         if ( GXutil.strcmp(AV26HayRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV25NewBarSit = (byte)(1) ;
         }
         else
         {
            AV25NewBarSit = (byte)(2) ;
         }
      }
   }

   public void S121( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      GXv_char1[0] = AV41EmprCod ;
      GXv_int2[0] = AV27CliCod ;
      GXv_char3[0] = AV28BarSer ;
      GXv_char4[0] = AV30BarColNom ;
      GXv_int5[0] = AV29BarColNUm ;
      GXv_int6[0] = AV31BarTipCol ;
      GXv_int7[0] = AV34Cformu ;
      new app.pexicol(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7) ;
      prevreo.this.AV41EmprCod = GXv_char1[0] ;
      prevreo.this.AV27CliCod = GXv_int2[0] ;
      prevreo.this.AV28BarSer = GXv_char3[0] ;
      prevreo.this.AV30BarColNom = GXv_char4[0] ;
      prevreo.this.AV29BarColNUm = GXv_int5[0] ;
      prevreo.this.AV31BarTipCol = GXv_int6[0] ;
      prevreo.this.AV34Cformu = GXv_int7[0] ;
      if ( AV34Cformu == 1 )
      {
         AV26HayRec = httpContext.getMessage( "S", "") ;
      }
      else
      {
         AV26HayRec = httpContext.getMessage( "N", "") ;
      }
   }

   public void S131( )
   {
      /* 'NC' Routine */
      returnInSub = false ;
      /* Using cursor P01LT19 */
      pr_default.execute(17, new Object[] {AV41EmprCod, Integer.valueOf(AV33HISREOTN)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A5198Nr_codigo = P01LT19_A5198Nr_codigo[0] ;
         A396EmprCod = P01LT19_A396EmprCod[0] ;
         A5199Nr_albent = P01LT19_A5199Nr_albent[0] ;
         n5199Nr_albent = P01LT19_n5199Nr_albent[0] ;
         /* Optimized DELETE. */
         /* Using cursor P01LT20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRE1");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01LT21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRET");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01LT22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRTE");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01LT23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTRCO");
         /* End optimized DELETE. */
         /* Using cursor P01LT24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOTREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   protected void cleanup( )
   {
      this.aP0[0] = prevreo.this.AV41EmprCod;
      this.aP1[0] = prevreo.this.AV42BarCod;
      this.aP2[0] = prevreo.this.AV21BarCodReo;
      this.aP3[0] = prevreo.this.AV43BarCodPar;
      this.aP4[0] = prevreo.this.AV35Error_l;
      this.aP5[0] = prevreo.this.AV38usurcod;
      this.aP6[0] = prevreo.this.AV39station;
      Application.commitDataStores(context, remoteHandle, pr_default, "prevreo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40Msg_tintaca = "" ;
      scmdbuf = "" ;
      P01LT2_A6039RecAcab = new String[] {""} ;
      P01LT2_n6039RecAcab = new boolean[] {false} ;
      P01LT2_A130BarCodPar = new String[] {""} ;
      P01LT2_A132BarCodReo = new byte[1] ;
      P01LT2_A129BarCod = new int[1] ;
      P01LT2_A396EmprCod = new String[] {""} ;
      P01LT2_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P01LT3_A6039RecAcab = new String[] {""} ;
      P01LT3_n6039RecAcab = new boolean[] {false} ;
      P01LT3_A130BarCodPar = new String[] {""} ;
      P01LT3_A132BarCodReo = new byte[1] ;
      P01LT3_A129BarCod = new int[1] ;
      P01LT3_A396EmprCod = new String[] {""} ;
      P01LT3_A2804RecLinMaq = new short[1] ;
      P01LT4_A4494HreBarPar = new String[] {""} ;
      P01LT4_A4493HreBarReo = new byte[1] ;
      P01LT4_A4492HreBarCod = new int[1] ;
      P01LT4_A396EmprCod = new String[] {""} ;
      P01LT4_A4495HreNumCie = new byte[1] ;
      A4494HreBarPar = "" ;
      P01LT5_A130BarCodPar = new String[] {""} ;
      P01LT5_A132BarCodReo = new byte[1] ;
      P01LT5_A129BarCod = new int[1] ;
      P01LT5_A396EmprCod = new String[] {""} ;
      P01LT5_A138BarConReo = new byte[1] ;
      P01LT6_A130BarCodPar = new String[] {""} ;
      P01LT6_A132BarCodReo = new byte[1] ;
      P01LT6_A129BarCod = new int[1] ;
      P01LT6_A396EmprCod = new String[] {""} ;
      P01LT6_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT6_A602MaqCod = new String[] {""} ;
      P01LT6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01LT6_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gx_msg = "" ;
      P01LT7_A457FasCod = new String[] {""} ;
      P01LT7_A130BarCodPar = new String[] {""} ;
      P01LT7_A132BarCodReo = new byte[1] ;
      P01LT7_A129BarCod = new int[1] ;
      P01LT7_A396EmprCod = new String[] {""} ;
      P01LT7_A153BarFasEst = new byte[1] ;
      P01LT7_A7059FasPesInt = new String[] {""} ;
      P01LT7_n7059FasPesInt = new boolean[] {false} ;
      P01LT7_A194BarOrdLin = new short[1] ;
      P01LT7_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A7059FasPesInt = "" ;
      A758ProCod = "" ;
      P01LT8_A544HisCodPar = new String[] {""} ;
      P01LT8_A545HisCodReo = new byte[1] ;
      P01LT8_A539HisBarCod = new int[1] ;
      P01LT8_A396EmprCod = new String[] {""} ;
      P01LT8_A2297HisReoTn = new int[1] ;
      P01LT8_n2297HisReoTn = new boolean[] {false} ;
      P01LT8_A833TipDefCod = new short[1] ;
      A544HisCodPar = "" ;
      P01LT10_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_A132BarCodReo = new byte[1] ;
      P01LT10_A13988BarPieVtx = new String[] {""} ;
      P01LT10_A13519BarPieMq = new String[] {""} ;
      P01LT10_n13519BarPieMq = new boolean[] {false} ;
      P01LT10_A13518BarPieTurn = new byte[1] ;
      P01LT10_n13518BarPieTurn = new boolean[] {false} ;
      P01LT10_A13109BarPieST = new String[] {""} ;
      P01LT10_n13109BarPieST = new boolean[] {false} ;
      P01LT10_A13108BarPieLote = new String[] {""} ;
      P01LT10_n13108BarPieLote = new boolean[] {false} ;
      P01LT10_A13107BarPieEmp = new short[1] ;
      P01LT10_n13107BarPieEmp = new boolean[] {false} ;
      P01LT10_A13004BarPieDest = new byte[1] ;
      P01LT10_n13004BarPieDest = new boolean[] {false} ;
      P01LT10_A12992BarPieOpe = new int[1] ;
      P01LT10_n12992BarPieOpe = new boolean[] {false} ;
      P01LT10_A12936BarPieSecu = new String[] {""} ;
      P01LT10_n12936BarPieSecu = new boolean[] {false} ;
      P01LT10_A12935BarPieTono = new String[] {""} ;
      P01LT10_n12935BarPieTono = new boolean[] {false} ;
      P01LT10_A12928BarPieEncC = new String[] {""} ;
      P01LT10_n12928BarPieEncC = new boolean[] {false} ;
      P01LT10_A12927BarPieCoCN = new int[1] ;
      P01LT10_n12927BarPieCoCN = new boolean[] {false} ;
      P01LT10_A12926BarPieCoCI = new String[] {""} ;
      P01LT10_n12926BarPieCoCI = new boolean[] {false} ;
      P01LT10_A12925BarPieCliN = new String[] {""} ;
      P01LT10_n12925BarPieCliN = new boolean[] {false} ;
      P01LT10_A12924BarPieCliI = new int[1] ;
      P01LT10_n12924BarPieCliI = new boolean[] {false} ;
      P01LT10_A12923BarPieArtD = new String[] {""} ;
      P01LT10_n12923BarPieArtD = new boolean[] {false} ;
      P01LT10_A12922BarPieArtI = new String[] {""} ;
      P01LT10_n12922BarPieArtI = new boolean[] {false} ;
      P01LT10_A12921BarPieColN = new int[1] ;
      P01LT10_n12921BarPieColN = new boolean[] {false} ;
      P01LT10_A12920BarPieColD = new String[] {""} ;
      P01LT10_n12920BarPieColD = new boolean[] {false} ;
      P01LT10_A12912BarPieUltD = new short[1] ;
      P01LT10_n12912BarPieUltD = new boolean[] {false} ;
      P01LT10_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P01LT10_n12911BarPieFep = new boolean[] {false} ;
      P01LT10_A12780BarPieUsu = new String[] {""} ;
      P01LT10_n12780BarPieUsu = new boolean[] {false} ;
      P01LT10_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      P01LT10_n12779BarPieFdv = new boolean[] {false} ;
      P01LT10_A12113BarPieCLd = new byte[1] ;
      P01LT10_n12113BarPieCLd = new boolean[] {false} ;
      P01LT10_A1642BarPieOrd = new int[1] ;
      P01LT10_n1642BarPieOrd = new boolean[] {false} ;
      P01LT10_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_n6473BarUniB = new boolean[] {false} ;
      P01LT10_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_n6472BarTara = new boolean[] {false} ;
      P01LT10_A1919BarPieObs = new String[] {""} ;
      P01LT10_n1919BarPieObs = new boolean[] {false} ;
      P01LT10_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_n9984BarPiePda = new boolean[] {false} ;
      P01LT10_A9846BarPieAncc = new short[1] ;
      P01LT10_n9846BarPieAncc = new boolean[] {false} ;
      P01LT10_A9800BarNPes = new byte[1] ;
      P01LT10_n9800BarNPes = new boolean[] {false} ;
      P01LT10_A9799BarPz2 = new int[1] ;
      P01LT10_n9799BarPz2 = new boolean[] {false} ;
      P01LT10_A9798BarPz1 = new int[1] ;
      P01LT10_n9798BarPz1 = new boolean[] {false} ;
      P01LT10_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_n9796BarPieK2 = new boolean[] {false} ;
      P01LT10_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_n9795BarPieK1 = new boolean[] {false} ;
      P01LT10_A8907PzaB80 = new String[] {""} ;
      P01LT10_n8907PzaB80 = new boolean[] {false} ;
      P01LT10_A8838CodBarPz = new String[] {""} ;
      P01LT10_n8838CodBarPz = new boolean[] {false} ;
      P01LT10_A8707BapieObs = new String[] {""} ;
      P01LT10_n8707BapieObs = new boolean[] {false} ;
      P01LT10_A6489BarPieIdPz = new String[] {""} ;
      P01LT10_n6489BarPieIdPz = new boolean[] {false} ;
      P01LT10_A6116BarPieImp = new String[] {""} ;
      P01LT10_n6116BarPieImp = new boolean[] {false} ;
      P01LT10_A3277BarPieAut = new short[1] ;
      P01LT10_n3277BarPieAut = new boolean[] {false} ;
      P01LT10_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_n3276BarMtsAut = new boolean[] {false} ;
      P01LT10_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_n3275BarKgsAut = new boolean[] {false} ;
      P01LT10_A2186BarPieLoc = new String[] {""} ;
      P01LT10_n2186BarPieLoc = new boolean[] {false} ;
      P01LT10_A1691BarPieAnc = new short[1] ;
      P01LT10_n1691BarPieAnc = new boolean[] {false} ;
      P01LT10_A1501BarPiePie = new int[1] ;
      P01LT10_A1271BarPieLzd = new int[1] ;
      P01LT10_A908PieOriCod = new String[] {""} ;
      P01LT10_A197BarPConTro = new short[1] ;
      P01LT10_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT10_A201BarPieEst = new byte[1] ;
      P01LT10_A44AlbRecCod = new int[1] ;
      P01LT10_A200BarPieCod = new String[] {""} ;
      P01LT10_A130BarCodPar = new String[] {""} ;
      P01LT10_A129BarCod = new int[1] ;
      P01LT10_A396EmprCod = new String[] {""} ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
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
      A200BarPieCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      AV23BarPieMtr = DecimalUtil.ZERO ;
      AV24BarPieKil = DecimalUtil.ZERO ;
      W205BarPieMet = DecimalUtil.ZERO ;
      W203BarPieKil = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P01LT13_A130BarCodPar = new String[] {""} ;
      P01LT13_A132BarCodReo = new byte[1] ;
      P01LT13_A129BarCod = new int[1] ;
      P01LT13_A396EmprCod = new String[] {""} ;
      P01LT13_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT13_n9795BarPieK1 = new boolean[] {false} ;
      P01LT13_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01LT13_A200BarPieCod = new String[] {""} ;
      AV37inc_obs = "" ;
      AV57Pgmname = "" ;
      P01LT15_A130BarCodPar = new String[] {""} ;
      P01LT15_A132BarCodReo = new byte[1] ;
      P01LT15_A129BarCod = new int[1] ;
      P01LT15_A396EmprCod = new String[] {""} ;
      P01LT15_A252CliCod = new int[1] ;
      P01LT15_n252CliCod = new boolean[] {false} ;
      P01LT15_A212BarSer = new String[] {""} ;
      P01LT15_A136BarColNum = new int[1] ;
      P01LT15_A135BarColNom = new String[] {""} ;
      P01LT15_A218BarTipCol = new byte[1] ;
      P01LT15_A213BarSit = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV28BarSer = "" ;
      AV30BarColNom = "" ;
      P01LT18_A4494HreBarPar = new String[] {""} ;
      P01LT18_A4493HreBarReo = new byte[1] ;
      P01LT18_A4492HreBarCod = new int[1] ;
      P01LT18_A396EmprCod = new String[] {""} ;
      P01LT18_A4495HreNumCie = new byte[1] ;
      AV26HayRec = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      P01LT19_A5198Nr_codigo = new int[1] ;
      P01LT19_A396EmprCod = new String[] {""} ;
      P01LT19_A5199Nr_albent = new String[] {""} ;
      P01LT19_n5199Nr_albent = new boolean[] {false} ;
      A5199Nr_albent = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prevreo__default(),
         new Object[] {
             new Object[] {
            P01LT2_A6039RecAcab, P01LT2_n6039RecAcab, P01LT2_A130BarCodPar, P01LT2_A132BarCodReo, P01LT2_A129BarCod, P01LT2_A396EmprCod, P01LT2_A2804RecLinMaq
            }
            , new Object[] {
            P01LT3_A6039RecAcab, P01LT3_n6039RecAcab, P01LT3_A130BarCodPar, P01LT3_A132BarCodReo, P01LT3_A129BarCod, P01LT3_A396EmprCod, P01LT3_A2804RecLinMaq
            }
            , new Object[] {
            P01LT4_A4494HreBarPar, P01LT4_A4493HreBarReo, P01LT4_A4492HreBarCod, P01LT4_A396EmprCod, P01LT4_A4495HreNumCie
            }
            , new Object[] {
            P01LT5_A130BarCodPar, P01LT5_A132BarCodReo, P01LT5_A129BarCod, P01LT5_A396EmprCod, P01LT5_A138BarConReo
            }
            , new Object[] {
            P01LT6_A130BarCodPar, P01LT6_A132BarCodReo, P01LT6_A129BarCod, P01LT6_A396EmprCod, P01LT6_A1525HisProKgr, P01LT6_A602MaqCod, P01LT6_A558HisProFec, P01LT6_A561HisProLin
            }
            , new Object[] {
            P01LT7_A457FasCod, P01LT7_A130BarCodPar, P01LT7_A132BarCodReo, P01LT7_A129BarCod, P01LT7_A396EmprCod, P01LT7_A153BarFasEst, P01LT7_A7059FasPesInt, P01LT7_n7059FasPesInt, P01LT7_A194BarOrdLin, P01LT7_A758ProCod
            }
            , new Object[] {
            P01LT8_A544HisCodPar, P01LT8_A545HisCodReo, P01LT8_A539HisBarCod, P01LT8_A396EmprCod, P01LT8_A2297HisReoTn, P01LT8_n2297HisReoTn, P01LT8_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01LT10_A205BarPieMet, P01LT10_A203BarPieKil, P01LT10_A132BarCodReo, P01LT10_A13988BarPieVtx, P01LT10_A13519BarPieMq, P01LT10_n13519BarPieMq, P01LT10_A13518BarPieTurn, P01LT10_n13518BarPieTurn, P01LT10_A13109BarPieST, P01LT10_n13109BarPieST,
            P01LT10_A13108BarPieLote, P01LT10_n13108BarPieLote, P01LT10_A13107BarPieEmp, P01LT10_n13107BarPieEmp, P01LT10_A13004BarPieDest, P01LT10_n13004BarPieDest, P01LT10_A12992BarPieOpe, P01LT10_n12992BarPieOpe, P01LT10_A12936BarPieSecu, P01LT10_n12936BarPieSecu,
            P01LT10_A12935BarPieTono, P01LT10_n12935BarPieTono, P01LT10_A12928BarPieEncC, P01LT10_n12928BarPieEncC, P01LT10_A12927BarPieCoCN, P01LT10_n12927BarPieCoCN, P01LT10_A12926BarPieCoCI, P01LT10_n12926BarPieCoCI, P01LT10_A12925BarPieCliN, P01LT10_n12925BarPieCliN,
            P01LT10_A12924BarPieCliI, P01LT10_n12924BarPieCliI, P01LT10_A12923BarPieArtD, P01LT10_n12923BarPieArtD, P01LT10_A12922BarPieArtI, P01LT10_n12922BarPieArtI, P01LT10_A12921BarPieColN, P01LT10_n12921BarPieColN, P01LT10_A12920BarPieColD, P01LT10_n12920BarPieColD,
            P01LT10_A12912BarPieUltD, P01LT10_n12912BarPieUltD, P01LT10_A12911BarPieFep, P01LT10_n12911BarPieFep, P01LT10_A12780BarPieUsu, P01LT10_n12780BarPieUsu, P01LT10_A12779BarPieFdv, P01LT10_n12779BarPieFdv, P01LT10_A12113BarPieCLd, P01LT10_n12113BarPieCLd,
            P01LT10_A1642BarPieOrd, P01LT10_n1642BarPieOrd, P01LT10_A6473BarUniB, P01LT10_n6473BarUniB, P01LT10_A6472BarTara, P01LT10_n6472BarTara, P01LT10_A1919BarPieObs, P01LT10_n1919BarPieObs, P01LT10_A9984BarPiePda, P01LT10_n9984BarPiePda,
            P01LT10_A9846BarPieAncc, P01LT10_n9846BarPieAncc, P01LT10_A9800BarNPes, P01LT10_n9800BarNPes, P01LT10_A9799BarPz2, P01LT10_n9799BarPz2, P01LT10_A9798BarPz1, P01LT10_n9798BarPz1, P01LT10_A9796BarPieK2, P01LT10_n9796BarPieK2,
            P01LT10_A9795BarPieK1, P01LT10_n9795BarPieK1, P01LT10_A8907PzaB80, P01LT10_n8907PzaB80, P01LT10_A8838CodBarPz, P01LT10_n8838CodBarPz, P01LT10_A8707BapieObs, P01LT10_n8707BapieObs, P01LT10_A6489BarPieIdPz, P01LT10_n6489BarPieIdPz,
            P01LT10_A6116BarPieImp, P01LT10_n6116BarPieImp, P01LT10_A3277BarPieAut, P01LT10_n3277BarPieAut, P01LT10_A3276BarMtsAut, P01LT10_n3276BarMtsAut, P01LT10_A3275BarKgsAut, P01LT10_n3275BarKgsAut, P01LT10_A2186BarPieLoc, P01LT10_n2186BarPieLoc,
            P01LT10_A1691BarPieAnc, P01LT10_n1691BarPieAnc, P01LT10_A1501BarPiePie, P01LT10_A1271BarPieLzd, P01LT10_A908PieOriCod, P01LT10_A197BarPConTro, P01LT10_A183BarMetLan, P01LT10_A170BarKilLan, P01LT10_A201BarPieEst, P01LT10_A44AlbRecCod,
            P01LT10_A200BarPieCod, P01LT10_A130BarCodPar, P01LT10_A129BarCod, P01LT10_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01LT13_A130BarCodPar, P01LT13_A132BarCodReo, P01LT13_A129BarCod, P01LT13_A396EmprCod, P01LT13_A9795BarPieK1, P01LT13_n9795BarPieK1, P01LT13_A203BarPieKil, P01LT13_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01LT15_A130BarCodPar, P01LT15_A132BarCodReo, P01LT15_A129BarCod, P01LT15_A396EmprCod, P01LT15_A252CliCod, P01LT15_n252CliCod, P01LT15_A212BarSer, P01LT15_A136BarColNum, P01LT15_A135BarColNom, P01LT15_A218BarTipCol,
            P01LT15_A213BarSit
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01LT18_A4494HreBarPar, P01LT18_A4493HreBarReo, P01LT18_A4492HreBarCod, P01LT18_A396EmprCod, P01LT18_A4495HreNumCie
            }
            , new Object[] {
            P01LT19_A5198Nr_codigo, P01LT19_A396EmprCod, P01LT19_A5199Nr_albent, P01LT19_n5199Nr_albent
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
         }
      );
      AV57Pgmname = "PRevReo" ;
      /* GeneXus formulas. */
      AV57Pgmname = "PRevReo" ;
      Gx_err = (short)(0) ;
   }

   private byte AV21BarCodReo ;
   private byte AV35Error_l ;
   private byte A132BarCodReo ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte AV22ReoAnter ;
   private byte A138BarConReo ;
   private byte AV32Lhipro ;
   private byte AV36FasePesada ;
   private byte A153BarFasEst ;
   private byte A545HisCodReo ;
   private byte AV54GXLvl109 ;
   private byte A13518BarPieTurn ;
   private byte A13004BarPieDest ;
   private byte A12113BarPieCLd ;
   private byte A9800BarNPes ;
   private byte A201BarPieEst ;
   private byte W132BarCodReo ;
   private byte AV58GXLvl151 ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte AV31BarTipCol ;
   private byte AV25NewBarSit ;
   private byte GXv_int6[] ;
   private byte AV34Cformu ;
   private byte GXv_int7[] ;
   private short A2804RecLinMaq ;
   private short A194BarOrdLin ;
   private short A833TipDefCod ;
   private short A13107BarPieEmp ;
   private short A12912BarPieUltD ;
   private short A9846BarPieAncc ;
   private short A3277BarPieAut ;
   private short A1691BarPieAnc ;
   private short A197BarPConTro ;
   private short Gx_err ;
   private int AV42BarCod ;
   private int A129BarCod ;
   private int A4492HreBarCod ;
   private int A561HisProLin ;
   private int A539HisBarCod ;
   private int A2297HisReoTn ;
   private int AV33HISREOTN ;
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
   private int W129BarCod ;
   private int GX_INS18 ;
   private int W44AlbRecCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV27CliCod ;
   private int AV29BarColNUm ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int A5198Nr_codigo ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A6473BarUniB ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal AV23BarPieMtr ;
   private java.math.BigDecimal AV24BarPieKil ;
   private java.math.BigDecimal W205BarPieMet ;
   private java.math.BigDecimal W203BarPieKil ;
   private String AV41EmprCod ;
   private String AV43BarCodPar ;
   private String AV38usurcod ;
   private String AV39station ;
   private String AV40Msg_tintaca ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String A602MaqCod ;
   private String Gx_msg ;
   private String A457FasCod ;
   private String A7059FasPesInt ;
   private String A758ProCod ;
   private String A544HisCodPar ;
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
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String Gx_emsg ;
   private String AV57Pgmname ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV28BarSer ;
   private String AV30BarColNom ;
   private String AV26HayRec ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String A5199Nr_albent ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date A12779BarPieFdv ;
   private boolean n6039RecAcab ;
   private boolean returnInSub ;
   private boolean n7059FasPesInt ;
   private boolean n2297HisReoTn ;
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
   private boolean n252CliCod ;
   private boolean n5199Nr_albent ;
   private String AV37inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LT2_A6039RecAcab ;
   private boolean[] P01LT2_n6039RecAcab ;
   private String[] P01LT2_A130BarCodPar ;
   private byte[] P01LT2_A132BarCodReo ;
   private int[] P01LT2_A129BarCod ;
   private String[] P01LT2_A396EmprCod ;
   private short[] P01LT2_A2804RecLinMaq ;
   private String[] P01LT3_A6039RecAcab ;
   private boolean[] P01LT3_n6039RecAcab ;
   private String[] P01LT3_A130BarCodPar ;
   private byte[] P01LT3_A132BarCodReo ;
   private int[] P01LT3_A129BarCod ;
   private String[] P01LT3_A396EmprCod ;
   private short[] P01LT3_A2804RecLinMaq ;
   private String[] P01LT4_A4494HreBarPar ;
   private byte[] P01LT4_A4493HreBarReo ;
   private int[] P01LT4_A4492HreBarCod ;
   private String[] P01LT4_A396EmprCod ;
   private byte[] P01LT4_A4495HreNumCie ;
   private String[] P01LT5_A130BarCodPar ;
   private byte[] P01LT5_A132BarCodReo ;
   private int[] P01LT5_A129BarCod ;
   private String[] P01LT5_A396EmprCod ;
   private byte[] P01LT5_A138BarConReo ;
   private String[] P01LT6_A130BarCodPar ;
   private byte[] P01LT6_A132BarCodReo ;
   private int[] P01LT6_A129BarCod ;
   private String[] P01LT6_A396EmprCod ;
   private java.math.BigDecimal[] P01LT6_A1525HisProKgr ;
   private String[] P01LT6_A602MaqCod ;
   private java.util.Date[] P01LT6_A558HisProFec ;
   private int[] P01LT6_A561HisProLin ;
   private String[] P01LT7_A457FasCod ;
   private String[] P01LT7_A130BarCodPar ;
   private byte[] P01LT7_A132BarCodReo ;
   private int[] P01LT7_A129BarCod ;
   private String[] P01LT7_A396EmprCod ;
   private byte[] P01LT7_A153BarFasEst ;
   private String[] P01LT7_A7059FasPesInt ;
   private boolean[] P01LT7_n7059FasPesInt ;
   private short[] P01LT7_A194BarOrdLin ;
   private String[] P01LT7_A758ProCod ;
   private String[] P01LT8_A544HisCodPar ;
   private byte[] P01LT8_A545HisCodReo ;
   private int[] P01LT8_A539HisBarCod ;
   private String[] P01LT8_A396EmprCod ;
   private int[] P01LT8_A2297HisReoTn ;
   private boolean[] P01LT8_n2297HisReoTn ;
   private short[] P01LT8_A833TipDefCod ;
   private java.math.BigDecimal[] P01LT10_A205BarPieMet ;
   private java.math.BigDecimal[] P01LT10_A203BarPieKil ;
   private byte[] P01LT10_A132BarCodReo ;
   private String[] P01LT10_A13988BarPieVtx ;
   private String[] P01LT10_A13519BarPieMq ;
   private boolean[] P01LT10_n13519BarPieMq ;
   private byte[] P01LT10_A13518BarPieTurn ;
   private boolean[] P01LT10_n13518BarPieTurn ;
   private String[] P01LT10_A13109BarPieST ;
   private boolean[] P01LT10_n13109BarPieST ;
   private String[] P01LT10_A13108BarPieLote ;
   private boolean[] P01LT10_n13108BarPieLote ;
   private short[] P01LT10_A13107BarPieEmp ;
   private boolean[] P01LT10_n13107BarPieEmp ;
   private byte[] P01LT10_A13004BarPieDest ;
   private boolean[] P01LT10_n13004BarPieDest ;
   private int[] P01LT10_A12992BarPieOpe ;
   private boolean[] P01LT10_n12992BarPieOpe ;
   private String[] P01LT10_A12936BarPieSecu ;
   private boolean[] P01LT10_n12936BarPieSecu ;
   private String[] P01LT10_A12935BarPieTono ;
   private boolean[] P01LT10_n12935BarPieTono ;
   private String[] P01LT10_A12928BarPieEncC ;
   private boolean[] P01LT10_n12928BarPieEncC ;
   private int[] P01LT10_A12927BarPieCoCN ;
   private boolean[] P01LT10_n12927BarPieCoCN ;
   private String[] P01LT10_A12926BarPieCoCI ;
   private boolean[] P01LT10_n12926BarPieCoCI ;
   private String[] P01LT10_A12925BarPieCliN ;
   private boolean[] P01LT10_n12925BarPieCliN ;
   private int[] P01LT10_A12924BarPieCliI ;
   private boolean[] P01LT10_n12924BarPieCliI ;
   private String[] P01LT10_A12923BarPieArtD ;
   private boolean[] P01LT10_n12923BarPieArtD ;
   private String[] P01LT10_A12922BarPieArtI ;
   private boolean[] P01LT10_n12922BarPieArtI ;
   private int[] P01LT10_A12921BarPieColN ;
   private boolean[] P01LT10_n12921BarPieColN ;
   private String[] P01LT10_A12920BarPieColD ;
   private boolean[] P01LT10_n12920BarPieColD ;
   private short[] P01LT10_A12912BarPieUltD ;
   private boolean[] P01LT10_n12912BarPieUltD ;
   private java.util.Date[] P01LT10_A12911BarPieFep ;
   private boolean[] P01LT10_n12911BarPieFep ;
   private String[] P01LT10_A12780BarPieUsu ;
   private boolean[] P01LT10_n12780BarPieUsu ;
   private java.util.Date[] P01LT10_A12779BarPieFdv ;
   private boolean[] P01LT10_n12779BarPieFdv ;
   private byte[] P01LT10_A12113BarPieCLd ;
   private boolean[] P01LT10_n12113BarPieCLd ;
   private int[] P01LT10_A1642BarPieOrd ;
   private boolean[] P01LT10_n1642BarPieOrd ;
   private java.math.BigDecimal[] P01LT10_A6473BarUniB ;
   private boolean[] P01LT10_n6473BarUniB ;
   private java.math.BigDecimal[] P01LT10_A6472BarTara ;
   private boolean[] P01LT10_n6472BarTara ;
   private String[] P01LT10_A1919BarPieObs ;
   private boolean[] P01LT10_n1919BarPieObs ;
   private java.math.BigDecimal[] P01LT10_A9984BarPiePda ;
   private boolean[] P01LT10_n9984BarPiePda ;
   private short[] P01LT10_A9846BarPieAncc ;
   private boolean[] P01LT10_n9846BarPieAncc ;
   private byte[] P01LT10_A9800BarNPes ;
   private boolean[] P01LT10_n9800BarNPes ;
   private int[] P01LT10_A9799BarPz2 ;
   private boolean[] P01LT10_n9799BarPz2 ;
   private int[] P01LT10_A9798BarPz1 ;
   private boolean[] P01LT10_n9798BarPz1 ;
   private java.math.BigDecimal[] P01LT10_A9796BarPieK2 ;
   private boolean[] P01LT10_n9796BarPieK2 ;
   private java.math.BigDecimal[] P01LT10_A9795BarPieK1 ;
   private boolean[] P01LT10_n9795BarPieK1 ;
   private String[] P01LT10_A8907PzaB80 ;
   private boolean[] P01LT10_n8907PzaB80 ;
   private String[] P01LT10_A8838CodBarPz ;
   private boolean[] P01LT10_n8838CodBarPz ;
   private String[] P01LT10_A8707BapieObs ;
   private boolean[] P01LT10_n8707BapieObs ;
   private String[] P01LT10_A6489BarPieIdPz ;
   private boolean[] P01LT10_n6489BarPieIdPz ;
   private String[] P01LT10_A6116BarPieImp ;
   private boolean[] P01LT10_n6116BarPieImp ;
   private short[] P01LT10_A3277BarPieAut ;
   private boolean[] P01LT10_n3277BarPieAut ;
   private java.math.BigDecimal[] P01LT10_A3276BarMtsAut ;
   private boolean[] P01LT10_n3276BarMtsAut ;
   private java.math.BigDecimal[] P01LT10_A3275BarKgsAut ;
   private boolean[] P01LT10_n3275BarKgsAut ;
   private String[] P01LT10_A2186BarPieLoc ;
   private boolean[] P01LT10_n2186BarPieLoc ;
   private short[] P01LT10_A1691BarPieAnc ;
   private boolean[] P01LT10_n1691BarPieAnc ;
   private int[] P01LT10_A1501BarPiePie ;
   private int[] P01LT10_A1271BarPieLzd ;
   private String[] P01LT10_A908PieOriCod ;
   private short[] P01LT10_A197BarPConTro ;
   private java.math.BigDecimal[] P01LT10_A183BarMetLan ;
   private java.math.BigDecimal[] P01LT10_A170BarKilLan ;
   private byte[] P01LT10_A201BarPieEst ;
   private int[] P01LT10_A44AlbRecCod ;
   private String[] P01LT10_A200BarPieCod ;
   private String[] P01LT10_A130BarCodPar ;
   private int[] P01LT10_A129BarCod ;
   private String[] P01LT10_A396EmprCod ;
   private String[] P01LT13_A130BarCodPar ;
   private byte[] P01LT13_A132BarCodReo ;
   private int[] P01LT13_A129BarCod ;
   private String[] P01LT13_A396EmprCod ;
   private java.math.BigDecimal[] P01LT13_A9795BarPieK1 ;
   private boolean[] P01LT13_n9795BarPieK1 ;
   private java.math.BigDecimal[] P01LT13_A203BarPieKil ;
   private String[] P01LT13_A200BarPieCod ;
   private String[] P01LT15_A130BarCodPar ;
   private byte[] P01LT15_A132BarCodReo ;
   private int[] P01LT15_A129BarCod ;
   private String[] P01LT15_A396EmprCod ;
   private int[] P01LT15_A252CliCod ;
   private boolean[] P01LT15_n252CliCod ;
   private String[] P01LT15_A212BarSer ;
   private int[] P01LT15_A136BarColNum ;
   private String[] P01LT15_A135BarColNom ;
   private byte[] P01LT15_A218BarTipCol ;
   private byte[] P01LT15_A213BarSit ;
   private String[] P01LT18_A4494HreBarPar ;
   private byte[] P01LT18_A4493HreBarReo ;
   private int[] P01LT18_A4492HreBarCod ;
   private String[] P01LT18_A396EmprCod ;
   private byte[] P01LT18_A4495HreNumCie ;
   private int[] P01LT19_A5198Nr_codigo ;
   private String[] P01LT19_A396EmprCod ;
   private String[] P01LT19_A5199Nr_albent ;
   private boolean[] P01LT19_n5199Nr_albent ;
}

final  class prevreo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LT2", "SELECT RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01LT3", "SELECT RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01LT4", "SELECT * FROM (SELECT HreBarPar, HreBarReo, HreBarCod, EmprCod, HreNumCie FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01LT5", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarConReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01LT6", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, HisProKgr, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01LT7", "SELECT T1.FasCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarFasEst, T2.FasPesInt, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01LT8", "SELECT HisCodPar, HisCodReo, HisBarCod, EmprCod, HisReoTn, TipDefCod FROM TXPHISREO WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ? ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01LT9", "DELETE FROM TXPHISREO  WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P01LT10", "SELECT BarPieMet, BarPieKil, BarCodReo, BarPieVtx, BarPieMq, BarPieTurn, BarPieST, BarPieLote, BarPieEmp, BarPieDest, BarPieOpe, BarPieSecu, BarPieTono, BarPieEncC, BarPieCoCN, BarPieCoCI, BarPieCliN, BarPieCliI, BarPieArtD, BarPieArtI, BarPieColN, BarPieColD, BarPieUltD, BarPieFep, BarPieUsu, BarPieFdv, BarPieCLd, BarPieOrd, BarUniB, BarTara, BarPieObs, BarPiePda, BarPieAncc, BarNPes, BarPz2, BarPz1, BarPieK2, BarPieK1, PzaB80, CodBarPz, BapieObs, BarPieIdPz, BarPieImp, BarPieAut, BarMtsAut, BarKgsAut, BarPieLoc, BarPieAnc, BarPiePie, BarPieLzd, PieOriCod, BarPConTro, BarMetLan, BarKilLan, BarPieEst, AlbRecCod, BarPieCod, BarCodPar, BarCod, EmprCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01LT11", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P01LT12", "UPDATE TXPBARPIE SET BarPieMet=BarPieMet + ?, BarPieKil=BarPieKil + ?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P01LT13", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarPieK1, BarPieKil, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01LT14", "UPDATE TXPBARPIE SET BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P01LT15", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNum, BarColNom, BarTipCol, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01LT16", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P01LT17", "UPDATE TXPBARCAD SET BarConReo=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P01LT18", "SELECT HreBarPar, HreBarReo, HreBarCod, EmprCod, HreNumCie FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01LT19", "SELECT Nr_codigo, EmprCod, Nr_albent FROM TXPNOTREC WHERE EmprCod = ? and Nr_codigo = ? ORDER BY EmprCod, Nr_codigo ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01LT20", "DELETE FROM TXPNOTRE1  WHERE EmprCod = ? and Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTRE1")
         ,new UpdateCursor("P01LT21", "DELETE FROM TXPNOTRET  WHERE EmprCod = ? and Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTRET")
         ,new UpdateCursor("P01LT22", "DELETE FROM TXPNOTRTE  WHERE EmprCod = ? and Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTRTE")
         ,new UpdateCursor("P01LT23", "DELETE FROM TXPNOTRCO  WHERE EmprCod = ? and Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTRCO")
         ,new UpdateCursor("P01LT24", "DELETE FROM TXPNOTREC  WHERE EmprCod = ? AND Nr_codigo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOTREC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 60);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 26);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((byte[]) buf[48])[0] = rslt.getByte(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 60);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((byte[]) buf[62])[0] = rslt.getByte(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((int[]) buf[66])[0] = rslt.getInt(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 9);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 20);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 40);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(42, 15);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(47, 10);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((short[]) buf[90])[0] = rslt.getShort(48);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((int[]) buf[92])[0] = rslt.getInt(49);
               ((int[]) buf[93])[0] = rslt.getInt(50);
               ((String[]) buf[94])[0] = rslt.getString(51, 9);
               ((short[]) buf[95])[0] = rslt.getShort(52);
               ((java.math.BigDecimal[]) buf[96])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(54,2);
               ((byte[]) buf[98])[0] = rslt.getByte(55);
               ((int[]) buf[99])[0] = rslt.getInt(56);
               ((String[]) buf[100])[0] = rslt.getString(57, 9);
               ((String[]) buf[101])[0] = rslt.getString(58, 1);
               ((int[]) buf[102])[0] = rslt.getInt(59);
               ((String[]) buf[103])[0] = rslt.getString(60, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
            case 9 :
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
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

