package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmovpie extends GXProcedure
{
   public pmovpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmovpie.class ), "" );
   }

   public pmovpie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          int[] aP5 ,
                          byte[] aP6 ,
                          String[] aP7 ,
                          java.math.BigDecimal[] aP8 ,
                          java.math.BigDecimal[] aP9 ,
                          String[] aP10 ,
                          String[] aP11 )
   {
      pmovpie.this.aP12 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 )
   {
      pmovpie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmovpie.this.AV18BarCod = aP1[0];
      this.aP1 = aP1;
      pmovpie.this.AV19BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmovpie.this.AV20BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmovpie.this.AV21BarPieCod = aP4[0];
      this.aP4 = aP4;
      pmovpie.this.AV15BarCodDes = aP5[0];
      this.aP5 = aP5;
      pmovpie.this.AV16BarReoDes = aP6[0];
      this.aP6 = aP6;
      pmovpie.this.AV17BarParDes = aP7[0];
      this.aP7 = aP7;
      pmovpie.this.AV22Kilos = aP8[0];
      this.aP8 = aP8;
      pmovpie.this.AV23Metros = aP9[0];
      this.aP9 = aP9;
      pmovpie.this.AV24Tipo = aP10[0];
      this.aP10 = aP10;
      pmovpie.this.AV25BarPieDes = aP11[0];
      this.aP11 = aP11;
      pmovpie.this.AV26DisCod = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV36Vincolor ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int2) ;
      pmovpie.this.GXt_int1 = GXv_int2[0] ;
      AV36Vincolor = GXt_int1 ;
      GXt_int1 = AV38Artextil ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      pmovpie.this.GXt_int1 = GXv_int2[0] ;
      AV38Artextil = GXt_int1 ;
      GXt_int1 = AV42Torient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      pmovpie.this.GXt_int1 = GXv_int2[0] ;
      AV42Torient = GXt_int1 ;
      GXt_int1 = AV43IniDatosPzaExpAut ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INIEPA", ""), GXv_int2) ;
      pmovpie.this.GXt_int1 = GXv_int2[0] ;
      AV43IniDatosPzaExpAut = GXt_int1 ;
      AV29KilPas = DecimalUtil.doubleToDec(0) ;
      AV30MetPas = DecimalUtil.doubleToDec(0) ;
      AV33Flag = (byte)(0) ;
      /* Using cursor P002P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV21BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12927BarPieCoCN = P002P2_A12927BarPieCoCN[0] ;
         n12927BarPieCoCN = P002P2_n12927BarPieCoCN[0] ;
         A12926BarPieCoCI = P002P2_A12926BarPieCoCI[0] ;
         n12926BarPieCoCI = P002P2_n12926BarPieCoCI[0] ;
         A12925BarPieCliN = P002P2_A12925BarPieCliN[0] ;
         n12925BarPieCliN = P002P2_n12925BarPieCliN[0] ;
         A12924BarPieCliI = P002P2_A12924BarPieCliI[0] ;
         n12924BarPieCliI = P002P2_n12924BarPieCliI[0] ;
         A12923BarPieArtD = P002P2_A12923BarPieArtD[0] ;
         n12923BarPieArtD = P002P2_n12923BarPieArtD[0] ;
         A12922BarPieArtI = P002P2_A12922BarPieArtI[0] ;
         n12922BarPieArtI = P002P2_n12922BarPieArtI[0] ;
         A12921BarPieColN = P002P2_A12921BarPieColN[0] ;
         n12921BarPieColN = P002P2_n12921BarPieColN[0] ;
         A12920BarPieColD = P002P2_A12920BarPieColD[0] ;
         n12920BarPieColD = P002P2_n12920BarPieColD[0] ;
         A12911BarPieFep = P002P2_A12911BarPieFep[0] ;
         n12911BarPieFep = P002P2_n12911BarPieFep[0] ;
         A12113BarPieCLd = P002P2_A12113BarPieCLd[0] ;
         n12113BarPieCLd = P002P2_n12113BarPieCLd[0] ;
         A1642BarPieOrd = P002P2_A1642BarPieOrd[0] ;
         n1642BarPieOrd = P002P2_n1642BarPieOrd[0] ;
         A1919BarPieObs = P002P2_A1919BarPieObs[0] ;
         n1919BarPieObs = P002P2_n1919BarPieObs[0] ;
         A9800BarNPes = P002P2_A9800BarNPes[0] ;
         n9800BarNPes = P002P2_n9800BarNPes[0] ;
         A8907PzaB80 = P002P2_A8907PzaB80[0] ;
         n8907PzaB80 = P002P2_n8907PzaB80[0] ;
         A8838CodBarPz = P002P2_A8838CodBarPz[0] ;
         n8838CodBarPz = P002P2_n8838CodBarPz[0] ;
         A8707BapieObs = P002P2_A8707BapieObs[0] ;
         n8707BapieObs = P002P2_n8707BapieObs[0] ;
         A6489BarPieIdPz = P002P2_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = P002P2_n6489BarPieIdPz[0] ;
         A3276BarMtsAut = P002P2_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P002P2_n3276BarMtsAut[0] ;
         A3275BarKgsAut = P002P2_A3275BarKgsAut[0] ;
         n3275BarKgsAut = P002P2_n3275BarKgsAut[0] ;
         A2186BarPieLoc = P002P2_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P002P2_n2186BarPieLoc[0] ;
         A1691BarPieAnc = P002P2_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P002P2_n1691BarPieAnc[0] ;
         A1501BarPiePie = P002P2_A1501BarPiePie[0] ;
         A197BarPConTro = P002P2_A197BarPConTro[0] ;
         A183BarMetLan = P002P2_A183BarMetLan[0] ;
         A170BarKilLan = P002P2_A170BarKilLan[0] ;
         A201BarPieEst = P002P2_A201BarPieEst[0] ;
         A205BarPieMet = P002P2_A205BarPieMet[0] ;
         A203BarPieKil = P002P2_A203BarPieKil[0] ;
         A130BarCodPar = P002P2_A130BarCodPar[0] ;
         A132BarCodReo = P002P2_A132BarCodReo[0] ;
         A129BarCod = P002P2_A129BarCod[0] ;
         A13988BarPieVtx = P002P2_A13988BarPieVtx[0] ;
         A13519BarPieMq = P002P2_A13519BarPieMq[0] ;
         n13519BarPieMq = P002P2_n13519BarPieMq[0] ;
         A13518BarPieTurn = P002P2_A13518BarPieTurn[0] ;
         n13518BarPieTurn = P002P2_n13518BarPieTurn[0] ;
         A13109BarPieST = P002P2_A13109BarPieST[0] ;
         n13109BarPieST = P002P2_n13109BarPieST[0] ;
         A13108BarPieLote = P002P2_A13108BarPieLote[0] ;
         n13108BarPieLote = P002P2_n13108BarPieLote[0] ;
         A13107BarPieEmp = P002P2_A13107BarPieEmp[0] ;
         n13107BarPieEmp = P002P2_n13107BarPieEmp[0] ;
         A13004BarPieDest = P002P2_A13004BarPieDest[0] ;
         n13004BarPieDest = P002P2_n13004BarPieDest[0] ;
         A12992BarPieOpe = P002P2_A12992BarPieOpe[0] ;
         n12992BarPieOpe = P002P2_n12992BarPieOpe[0] ;
         A12936BarPieSecu = P002P2_A12936BarPieSecu[0] ;
         n12936BarPieSecu = P002P2_n12936BarPieSecu[0] ;
         A12935BarPieTono = P002P2_A12935BarPieTono[0] ;
         n12935BarPieTono = P002P2_n12935BarPieTono[0] ;
         A12928BarPieEncC = P002P2_A12928BarPieEncC[0] ;
         n12928BarPieEncC = P002P2_n12928BarPieEncC[0] ;
         A12912BarPieUltD = P002P2_A12912BarPieUltD[0] ;
         n12912BarPieUltD = P002P2_n12912BarPieUltD[0] ;
         A12780BarPieUsu = P002P2_A12780BarPieUsu[0] ;
         n12780BarPieUsu = P002P2_n12780BarPieUsu[0] ;
         A12779BarPieFdv = P002P2_A12779BarPieFdv[0] ;
         n12779BarPieFdv = P002P2_n12779BarPieFdv[0] ;
         A6473BarUniB = P002P2_A6473BarUniB[0] ;
         n6473BarUniB = P002P2_n6473BarUniB[0] ;
         A6472BarTara = P002P2_A6472BarTara[0] ;
         n6472BarTara = P002P2_n6472BarTara[0] ;
         A9984BarPiePda = P002P2_A9984BarPiePda[0] ;
         n9984BarPiePda = P002P2_n9984BarPiePda[0] ;
         A9846BarPieAncc = P002P2_A9846BarPieAncc[0] ;
         n9846BarPieAncc = P002P2_n9846BarPieAncc[0] ;
         A9799BarPz2 = P002P2_A9799BarPz2[0] ;
         n9799BarPz2 = P002P2_n9799BarPz2[0] ;
         A9798BarPz1 = P002P2_A9798BarPz1[0] ;
         n9798BarPz1 = P002P2_n9798BarPz1[0] ;
         A9796BarPieK2 = P002P2_A9796BarPieK2[0] ;
         n9796BarPieK2 = P002P2_n9796BarPieK2[0] ;
         A9795BarPieK1 = P002P2_A9795BarPieK1[0] ;
         n9795BarPieK1 = P002P2_n9795BarPieK1[0] ;
         A6116BarPieImp = P002P2_A6116BarPieImp[0] ;
         n6116BarPieImp = P002P2_n6116BarPieImp[0] ;
         A3277BarPieAut = P002P2_A3277BarPieAut[0] ;
         n3277BarPieAut = P002P2_n3277BarPieAut[0] ;
         A1271BarPieLzd = P002P2_A1271BarPieLzd[0] ;
         A908PieOriCod = P002P2_A908PieOriCod[0] ;
         A361DisCod = P002P2_A361DisCod[0] ;
         A200BarPieCod = P002P2_A200BarPieCod[0] ;
         A392DisUniMed = P002P2_A392DisUniMed[0] ;
         A375DisNumUni = P002P2_A375DisNumUni[0] ;
         A374DisNumPie = P002P2_A374DisNumPie[0] ;
         A44AlbRecCod = P002P2_A44AlbRecCod[0] ;
         A361DisCod = P002P2_A361DisCod[0] ;
         A392DisUniMed = P002P2_A392DisUniMed[0] ;
         A375DisNumUni = P002P2_A375DisNumUni[0] ;
         A374DisNumPie = P002P2_A374DisNumPie[0] ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         if ( GXutil.strcmp(AV24Tipo, httpContext.getMessage( "P", "")) == 0 )
         {
            AV27KilTras = AV22Kilos ;
            AV28MtrTras = AV23Metros ;
            if ( ( DecimalUtil.compareTo(A203BarPieKil, AV22Kilos) == 0 ) && ( DecimalUtil.compareTo(A205BarPieMet, AV23Metros) == 0 ) )
            {
               /* Using cursor P002P3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            }
            else
            {
               A203BarPieKil = A203BarPieKil.subtract(AV22Kilos) ;
               A205BarPieMet = A205BarPieMet.subtract(AV23Metros) ;
            }
         }
         else
         {
            AV27KilTras = A203BarPieKil ;
            AV28MtrTras = A205BarPieMet ;
            /* Using cursor P002P4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         }
         AV34DisCod_o = A361DisCod ;
         AV31AlbRecCod = A44AlbRecCod ;
         AV32Pieza = A200BarPieCod ;
         /* Using cursor P002P5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A200BarPieCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A380DisPieCod = P002P5_A380DisPieCod[0] ;
            A382DisPieKil = P002P5_A382DisPieKil[0] ;
            A384DisPieMet = P002P5_A384DisPieMet[0] ;
            O375DisNumUni = A375DisNumUni ;
            O374DisNumPie = A374DisNumPie ;
            if ( GXutil.strcmp(AV24Tipo, httpContext.getMessage( "P", "")) == 0 )
            {
               A382DisPieKil = A382DisPieKil.subtract(AV27KilTras) ;
               A384DisPieMet = A384DisPieMet.subtract(AV28MtrTras) ;
               if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
               {
                  A375DisNumUni = A375DisNumUni.subtract(AV27KilTras) ;
               }
               else
               {
                  A375DisNumUni = A375DisNumUni.subtract(AV28MtrTras) ;
               }
               A374DisNumPie = (short)(A374DisNumPie-1) ;
               if ( ( A382DisPieKil.doubleValue() <= 0 ) && ( A384DisPieMet.doubleValue() <= 0 ) )
               {
                  /* Using cursor P002P6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               }
            }
            else
            {
               if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
               {
                  A375DisNumUni = A375DisNumUni.subtract(A382DisPieKil) ;
               }
               else
               {
                  A375DisNumUni = A375DisNumUni.subtract(A384DisPieMet) ;
               }
               A374DisNumPie = (short)(A374DisNumPie-1) ;
               /* Using cursor P002P7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            }
            /* Using cursor P002P8 */
            pr_default.execute(6, new Object[] {A382DisPieKil, A384DisPieMet, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV33Flag = (byte)(1) ;
         /*
            INSERT RECORD ON TABLE TXPDISALD

         */
         W361DisCod = A361DisCod ;
         W44AlbRecCod = A44AlbRecCod ;
         A361DisCod = AV26DisCod ;
         A44AlbRecCod = AV31AlbRecCod ;
         A380DisPieCod = AV32Pieza ;
         A382DisPieKil = AV27KilTras ;
         A384DisPieMet = AV28MtrTras ;
         A5099DisPieEst = (byte)(1) ;
         /* Using cursor P002P9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, Byte.valueOf(A5099DisPieEst)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
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
         A361DisCod = W361DisCod ;
         A44AlbRecCod = W44AlbRecCod ;
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TXPBARPIE

         */
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         W203BarPieKil = A203BarPieKil ;
         W205BarPieMet = A205BarPieMet ;
         W201BarPieEst = A201BarPieEst ;
         W170BarKilLan = A170BarKilLan ;
         W183BarMetLan = A183BarMetLan ;
         W197BarPConTro = A197BarPConTro ;
         W1501BarPiePie = A1501BarPiePie ;
         W6489BarPieIdPz = A6489BarPieIdPz ;
         n6489BarPieIdPz = false ;
         W8907PzaB80 = A8907PzaB80 ;
         n8907PzaB80 = false ;
         W3275BarKgsAut = A3275BarKgsAut ;
         n3275BarKgsAut = false ;
         W3276BarMtsAut = A3276BarMtsAut ;
         n3276BarMtsAut = false ;
         W8707BapieObs = A8707BapieObs ;
         n8707BapieObs = false ;
         W8838CodBarPz = A8838CodBarPz ;
         n8838CodBarPz = false ;
         W9800BarNPes = A9800BarNPes ;
         n9800BarNPes = false ;
         W6489BarPieIdPz = A6489BarPieIdPz ;
         n6489BarPieIdPz = false ;
         W1691BarPieAnc = A1691BarPieAnc ;
         n1691BarPieAnc = false ;
         W8707BapieObs = A8707BapieObs ;
         n8707BapieObs = false ;
         W1919BarPieObs = A1919BarPieObs ;
         n1919BarPieObs = false ;
         W1642BarPieOrd = A1642BarPieOrd ;
         n1642BarPieOrd = false ;
         W12911BarPieFep = A12911BarPieFep ;
         n12911BarPieFep = false ;
         W2186BarPieLoc = A2186BarPieLoc ;
         n2186BarPieLoc = false ;
         W12113BarPieCLd = A12113BarPieCLd ;
         n12113BarPieCLd = false ;
         W12920BarPieColD = A12920BarPieColD ;
         n12920BarPieColD = false ;
         W12921BarPieColN = A12921BarPieColN ;
         n12921BarPieColN = false ;
         W12926BarPieCoCI = A12926BarPieCoCI ;
         n12926BarPieCoCI = false ;
         W12927BarPieCoCN = A12927BarPieCoCN ;
         n12927BarPieCoCN = false ;
         W12923BarPieArtD = A12923BarPieArtD ;
         n12923BarPieArtD = false ;
         W12922BarPieArtI = A12922BarPieArtI ;
         n12922BarPieArtI = false ;
         W12924BarPieCliI = A12924BarPieCliI ;
         n12924BarPieCliI = false ;
         W12925BarPieCliN = A12925BarPieCliN ;
         n12925BarPieCliN = false ;
         W3275BarKgsAut = A3275BarKgsAut ;
         n3275BarKgsAut = false ;
         W3276BarMtsAut = A3276BarMtsAut ;
         n3276BarMtsAut = false ;
         W9800BarNPes = A9800BarNPes ;
         n9800BarNPes = false ;
         W8838CodBarPz = A8838CodBarPz ;
         n8838CodBarPz = false ;
         A129BarCod = AV15BarCodDes ;
         A132BarCodReo = AV16BarReoDes ;
         A130BarCodPar = AV17BarParDes ;
         A200BarPieCod = AV25BarPieDes ;
         A203BarPieKil = AV27KilTras ;
         A205BarPieMet = AV28MtrTras ;
         A201BarPieEst = (byte)(0) ;
         if ( AV38Artextil == 0 )
         {
            A170BarKilLan = DecimalUtil.ZERO ;
            A183BarMetLan = DecimalUtil.ZERO ;
         }
         A197BarPConTro = (short)(0) ;
         A1501BarPiePie = 0 ;
         AV37BarPieIdpz = "" ;
         if ( AV36Vincolor == 1 )
         {
            AV37BarPieIdpz = GXutil.str( AV15BarCodDes, 8, 0) + GXutil.str( AV16BarReoDes, 1, 0) + AV17BarParDes ;
         }
         A6489BarPieIdPz = GXutil.trim( AV37BarPieIdpz) ;
         n6489BarPieIdPz = false ;
         A8907PzaB80 = AV41Pzab80 ;
         n8907PzaB80 = false ;
         if ( AV42Torient == 1 )
         {
            A3275BarKgsAut = DecimalUtil.doubleToDec(0) ;
            n3275BarKgsAut = false ;
            A3276BarMtsAut = DecimalUtil.doubleToDec(0) ;
            n3276BarMtsAut = false ;
            A8707BapieObs = " " ;
            n8707BapieObs = false ;
            A8838CodBarPz = " " ;
            n8838CodBarPz = false ;
            A9800BarNPes = (byte)(0) ;
            n9800BarNPes = false ;
         }
         if ( AV43IniDatosPzaExpAut == 1 )
         {
            A6489BarPieIdPz = "" ;
            n6489BarPieIdPz = false ;
            A1691BarPieAnc = (short)(0) ;
            n1691BarPieAnc = false ;
            A8707BapieObs = " " ;
            n8707BapieObs = false ;
            A1919BarPieObs = " " ;
            n1919BarPieObs = false ;
            A1642BarPieOrd = 0 ;
            n1642BarPieOrd = false ;
            A12911BarPieFep = GXutil.nullDate() ;
            n12911BarPieFep = false ;
            A2186BarPieLoc = " " ;
            n2186BarPieLoc = false ;
            A12113BarPieCLd = (byte)(0) ;
            n12113BarPieCLd = false ;
            A12920BarPieColD = " " ;
            n12920BarPieColD = false ;
            A12921BarPieColN = 0 ;
            n12921BarPieColN = false ;
            A12926BarPieCoCI = " " ;
            n12926BarPieCoCI = false ;
            A12927BarPieCoCN = 0 ;
            n12927BarPieCoCN = false ;
            A12923BarPieArtD = " " ;
            n12923BarPieArtD = false ;
            A12922BarPieArtI = " " ;
            n12922BarPieArtI = false ;
            A12924BarPieCliI = 0 ;
            n12924BarPieCliI = false ;
            A12925BarPieCliN = " " ;
            n12925BarPieCliN = false ;
            A3275BarKgsAut = DecimalUtil.doubleToDec(0) ;
            n3275BarKgsAut = false ;
            A3276BarMtsAut = DecimalUtil.doubleToDec(0) ;
            n3276BarMtsAut = false ;
            A9800BarNPes = (byte)(0) ;
            n9800BarNPes = false ;
            A8838CodBarPz = " " ;
            n8838CodBarPz = false ;
         }
         /* Using cursor P002P10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, A13988BarPieVtx});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A200BarPieCod = W200BarPieCod ;
         A203BarPieKil = W203BarPieKil ;
         A205BarPieMet = W205BarPieMet ;
         A201BarPieEst = W201BarPieEst ;
         A170BarKilLan = W170BarKilLan ;
         A183BarMetLan = W183BarMetLan ;
         A197BarPConTro = W197BarPConTro ;
         A1501BarPiePie = W1501BarPiePie ;
         A6489BarPieIdPz = W6489BarPieIdPz ;
         n6489BarPieIdPz = false ;
         A8907PzaB80 = W8907PzaB80 ;
         n8907PzaB80 = false ;
         A3275BarKgsAut = W3275BarKgsAut ;
         n3275BarKgsAut = false ;
         A3276BarMtsAut = W3276BarMtsAut ;
         n3276BarMtsAut = false ;
         A8707BapieObs = W8707BapieObs ;
         n8707BapieObs = false ;
         A8838CodBarPz = W8838CodBarPz ;
         n8838CodBarPz = false ;
         A9800BarNPes = W9800BarNPes ;
         n9800BarNPes = false ;
         A6489BarPieIdPz = W6489BarPieIdPz ;
         n6489BarPieIdPz = false ;
         A1691BarPieAnc = W1691BarPieAnc ;
         n1691BarPieAnc = false ;
         A8707BapieObs = W8707BapieObs ;
         n8707BapieObs = false ;
         A1919BarPieObs = W1919BarPieObs ;
         n1919BarPieObs = false ;
         A1642BarPieOrd = W1642BarPieOrd ;
         n1642BarPieOrd = false ;
         A12911BarPieFep = W12911BarPieFep ;
         n12911BarPieFep = false ;
         A2186BarPieLoc = W2186BarPieLoc ;
         n2186BarPieLoc = false ;
         A12113BarPieCLd = W12113BarPieCLd ;
         n12113BarPieCLd = false ;
         A12920BarPieColD = W12920BarPieColD ;
         n12920BarPieColD = false ;
         A12921BarPieColN = W12921BarPieColN ;
         n12921BarPieColN = false ;
         A12926BarPieCoCI = W12926BarPieCoCI ;
         n12926BarPieCoCI = false ;
         A12927BarPieCoCN = W12927BarPieCoCN ;
         n12927BarPieCoCN = false ;
         A12923BarPieArtD = W12923BarPieArtD ;
         n12923BarPieArtD = false ;
         A12922BarPieArtI = W12922BarPieArtI ;
         n12922BarPieArtI = false ;
         A12924BarPieCliI = W12924BarPieCliI ;
         n12924BarPieCliI = false ;
         A12925BarPieCliN = W12925BarPieCliN ;
         n12925BarPieCliN = false ;
         A3275BarKgsAut = W3275BarKgsAut ;
         n3275BarKgsAut = false ;
         A3276BarMtsAut = W3276BarMtsAut ;
         n3276BarMtsAut = false ;
         A9800BarNPes = W9800BarNPes ;
         n9800BarNPes = false ;
         A8838CodBarPz = W8838CodBarPz ;
         n8838CodBarPz = false ;
         /* End Insert */
         AV29KilPas = AV27KilTras ;
         AV30MetPas = AV28MtrTras ;
         /* Using cursor P002P11 */
         pr_default.execute(9, new Object[] {A375DisNumUni, Short.valueOf(A374DisNumPie), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Using cursor P002P12 */
         pr_default.execute(10, new Object[] {A205BarPieMet, A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A200BarPieCod = W200BarPieCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV33Flag == 1 )
      {
         /* Using cursor P002P13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodDes), Byte.valueOf(AV16BarReoDes), AV17BarParDes, A396EmprCod, Integer.valueOf(AV15BarCodDes), Byte.valueOf(AV16BarReoDes), AV17BarParDes});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A361DisCod = P002P13_A361DisCod[0] ;
            A130BarCodPar = P002P13_A130BarCodPar[0] ;
            A132BarCodReo = P002P13_A132BarCodReo[0] ;
            A129BarCod = P002P13_A129BarCod[0] ;
            /* Using cursor P002P14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            A374DisNumPie = P002P14_A374DisNumPie[0] ;
            A392DisUniMed = P002P14_A392DisUniMed[0] ;
            A375DisNumUni = P002P14_A375DisNumUni[0] ;
            A374DisNumPie = (short)(A374DisNumPie+1) ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A375DisNumUni = A375DisNumUni.add(AV27KilTras) ;
            }
            else
            {
               A375DisNumUni = A375DisNumUni.add(AV28MtrTras) ;
            }
            /* Using cursor P002P15 */
            pr_default.execute(13, new Object[] {Short.valueOf(A374DisNumPie), A375DisNumUni, A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
         pr_default.close(12);
      }
      AV22Kilos = AV29KilPas ;
      AV23Metros = AV30MetPas ;
      AV35Pz_DisAld = (byte)(0) ;
      /* Optimized group. */
      /* Using cursor P002P16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV34DisCod_o), Integer.valueOf(AV31AlbRecCod)});
      cV35Pz_DisAld = P002P16_AV35Pz_DisAld[0] ;
      pr_default.close(14);
      AV35Pz_DisAld = (byte)(AV35Pz_DisAld+cV35Pz_DisAld*1) ;
      /* End optimized group. */
      if ( AV35Pz_DisAld == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P002P17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV34DisCod_o), Integer.valueOf(AV31AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* End optimized DELETE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmovpie.this.A396EmprCod;
      this.aP1[0] = pmovpie.this.AV18BarCod;
      this.aP2[0] = pmovpie.this.AV19BarCodReo;
      this.aP3[0] = pmovpie.this.AV20BarCodPar;
      this.aP4[0] = pmovpie.this.AV21BarPieCod;
      this.aP5[0] = pmovpie.this.AV15BarCodDes;
      this.aP6[0] = pmovpie.this.AV16BarReoDes;
      this.aP7[0] = pmovpie.this.AV17BarParDes;
      this.aP8[0] = pmovpie.this.AV22Kilos;
      this.aP9[0] = pmovpie.this.AV23Metros;
      this.aP10[0] = pmovpie.this.AV24Tipo;
      this.aP11[0] = pmovpie.this.AV25BarPieDes;
      this.aP12[0] = pmovpie.this.AV26DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmovpie");
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
      AV29KilPas = DecimalUtil.ZERO ;
      AV30MetPas = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P002P2_A396EmprCod = new String[] {""} ;
      P002P2_A12927BarPieCoCN = new int[1] ;
      P002P2_n12927BarPieCoCN = new boolean[] {false} ;
      P002P2_A12926BarPieCoCI = new String[] {""} ;
      P002P2_n12926BarPieCoCI = new boolean[] {false} ;
      P002P2_A12925BarPieCliN = new String[] {""} ;
      P002P2_n12925BarPieCliN = new boolean[] {false} ;
      P002P2_A12924BarPieCliI = new int[1] ;
      P002P2_n12924BarPieCliI = new boolean[] {false} ;
      P002P2_A12923BarPieArtD = new String[] {""} ;
      P002P2_n12923BarPieArtD = new boolean[] {false} ;
      P002P2_A12922BarPieArtI = new String[] {""} ;
      P002P2_n12922BarPieArtI = new boolean[] {false} ;
      P002P2_A12921BarPieColN = new int[1] ;
      P002P2_n12921BarPieColN = new boolean[] {false} ;
      P002P2_A12920BarPieColD = new String[] {""} ;
      P002P2_n12920BarPieColD = new boolean[] {false} ;
      P002P2_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P002P2_n12911BarPieFep = new boolean[] {false} ;
      P002P2_A12113BarPieCLd = new byte[1] ;
      P002P2_n12113BarPieCLd = new boolean[] {false} ;
      P002P2_A1642BarPieOrd = new int[1] ;
      P002P2_n1642BarPieOrd = new boolean[] {false} ;
      P002P2_A1919BarPieObs = new String[] {""} ;
      P002P2_n1919BarPieObs = new boolean[] {false} ;
      P002P2_A9800BarNPes = new byte[1] ;
      P002P2_n9800BarNPes = new boolean[] {false} ;
      P002P2_A8907PzaB80 = new String[] {""} ;
      P002P2_n8907PzaB80 = new boolean[] {false} ;
      P002P2_A8838CodBarPz = new String[] {""} ;
      P002P2_n8838CodBarPz = new boolean[] {false} ;
      P002P2_A8707BapieObs = new String[] {""} ;
      P002P2_n8707BapieObs = new boolean[] {false} ;
      P002P2_A6489BarPieIdPz = new String[] {""} ;
      P002P2_n6489BarPieIdPz = new boolean[] {false} ;
      P002P2_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_n3276BarMtsAut = new boolean[] {false} ;
      P002P2_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_n3275BarKgsAut = new boolean[] {false} ;
      P002P2_A2186BarPieLoc = new String[] {""} ;
      P002P2_n2186BarPieLoc = new boolean[] {false} ;
      P002P2_A1691BarPieAnc = new short[1] ;
      P002P2_n1691BarPieAnc = new boolean[] {false} ;
      P002P2_A1501BarPiePie = new int[1] ;
      P002P2_A197BarPConTro = new short[1] ;
      P002P2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_A201BarPieEst = new byte[1] ;
      P002P2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_A130BarCodPar = new String[] {""} ;
      P002P2_A132BarCodReo = new byte[1] ;
      P002P2_A129BarCod = new int[1] ;
      P002P2_A13988BarPieVtx = new String[] {""} ;
      P002P2_A13519BarPieMq = new String[] {""} ;
      P002P2_n13519BarPieMq = new boolean[] {false} ;
      P002P2_A13518BarPieTurn = new byte[1] ;
      P002P2_n13518BarPieTurn = new boolean[] {false} ;
      P002P2_A13109BarPieST = new String[] {""} ;
      P002P2_n13109BarPieST = new boolean[] {false} ;
      P002P2_A13108BarPieLote = new String[] {""} ;
      P002P2_n13108BarPieLote = new boolean[] {false} ;
      P002P2_A13107BarPieEmp = new short[1] ;
      P002P2_n13107BarPieEmp = new boolean[] {false} ;
      P002P2_A13004BarPieDest = new byte[1] ;
      P002P2_n13004BarPieDest = new boolean[] {false} ;
      P002P2_A12992BarPieOpe = new int[1] ;
      P002P2_n12992BarPieOpe = new boolean[] {false} ;
      P002P2_A12936BarPieSecu = new String[] {""} ;
      P002P2_n12936BarPieSecu = new boolean[] {false} ;
      P002P2_A12935BarPieTono = new String[] {""} ;
      P002P2_n12935BarPieTono = new boolean[] {false} ;
      P002P2_A12928BarPieEncC = new String[] {""} ;
      P002P2_n12928BarPieEncC = new boolean[] {false} ;
      P002P2_A12912BarPieUltD = new short[1] ;
      P002P2_n12912BarPieUltD = new boolean[] {false} ;
      P002P2_A12780BarPieUsu = new String[] {""} ;
      P002P2_n12780BarPieUsu = new boolean[] {false} ;
      P002P2_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      P002P2_n12779BarPieFdv = new boolean[] {false} ;
      P002P2_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_n6473BarUniB = new boolean[] {false} ;
      P002P2_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_n6472BarTara = new boolean[] {false} ;
      P002P2_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_n9984BarPiePda = new boolean[] {false} ;
      P002P2_A9846BarPieAncc = new short[1] ;
      P002P2_n9846BarPieAncc = new boolean[] {false} ;
      P002P2_A9799BarPz2 = new int[1] ;
      P002P2_n9799BarPz2 = new boolean[] {false} ;
      P002P2_A9798BarPz1 = new int[1] ;
      P002P2_n9798BarPz1 = new boolean[] {false} ;
      P002P2_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_n9796BarPieK2 = new boolean[] {false} ;
      P002P2_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_n9795BarPieK1 = new boolean[] {false} ;
      P002P2_A6116BarPieImp = new String[] {""} ;
      P002P2_n6116BarPieImp = new boolean[] {false} ;
      P002P2_A3277BarPieAut = new short[1] ;
      P002P2_n3277BarPieAut = new boolean[] {false} ;
      P002P2_A1271BarPieLzd = new int[1] ;
      P002P2_A908PieOriCod = new String[] {""} ;
      P002P2_A361DisCod = new int[1] ;
      P002P2_A200BarPieCod = new String[] {""} ;
      P002P2_A392DisUniMed = new String[] {""} ;
      P002P2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P2_A374DisNumPie = new short[1] ;
      P002P2_A44AlbRecCod = new int[1] ;
      A12926BarPieCoCI = "" ;
      A12925BarPieCliN = "" ;
      A12923BarPieArtD = "" ;
      A12922BarPieArtI = "" ;
      A12920BarPieColD = "" ;
      A12911BarPieFep = GXutil.nullDate() ;
      A1919BarPieObs = "" ;
      A8907PzaB80 = "" ;
      A8838CodBarPz = "" ;
      A8707BapieObs = "" ;
      A6489BarPieIdPz = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A13988BarPieVtx = "" ;
      A13519BarPieMq = "" ;
      A13109BarPieST = "" ;
      A13108BarPieLote = "" ;
      A12936BarPieSecu = "" ;
      A12935BarPieTono = "" ;
      A12928BarPieEncC = "" ;
      A12780BarPieUsu = "" ;
      A12779BarPieFdv = GXutil.nullDate() ;
      A6473BarUniB = DecimalUtil.ZERO ;
      A6472BarTara = DecimalUtil.ZERO ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      A6116BarPieImp = "" ;
      A908PieOriCod = "" ;
      A200BarPieCod = "" ;
      A392DisUniMed = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      W130BarCodPar = "" ;
      W200BarPieCod = "" ;
      AV27KilTras = DecimalUtil.ZERO ;
      AV28MtrTras = DecimalUtil.ZERO ;
      AV32Pieza = "" ;
      AV41Pzab80 = "" ;
      P002P5_A396EmprCod = new String[] {""} ;
      P002P5_A361DisCod = new int[1] ;
      P002P5_A44AlbRecCod = new int[1] ;
      P002P5_A380DisPieCod = new String[] {""} ;
      P002P5_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P5_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      O375DisNumUni = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      W203BarPieKil = DecimalUtil.ZERO ;
      W205BarPieMet = DecimalUtil.ZERO ;
      W170BarKilLan = DecimalUtil.ZERO ;
      W183BarMetLan = DecimalUtil.ZERO ;
      W6489BarPieIdPz = "" ;
      W8907PzaB80 = "" ;
      W3275BarKgsAut = DecimalUtil.ZERO ;
      W3276BarMtsAut = DecimalUtil.ZERO ;
      W8707BapieObs = "" ;
      W8838CodBarPz = "" ;
      W1919BarPieObs = "" ;
      W12911BarPieFep = GXutil.nullDate() ;
      W2186BarPieLoc = "" ;
      W12920BarPieColD = "" ;
      W12926BarPieCoCI = "" ;
      W12923BarPieArtD = "" ;
      W12922BarPieArtI = "" ;
      W12925BarPieCliN = "" ;
      AV37BarPieIdpz = "" ;
      P002P13_A361DisCod = new int[1] ;
      P002P13_A396EmprCod = new String[] {""} ;
      P002P13_A130BarCodPar = new String[] {""} ;
      P002P13_A132BarCodReo = new byte[1] ;
      P002P13_A129BarCod = new int[1] ;
      P002P14_A374DisNumPie = new short[1] ;
      P002P14_A392DisUniMed = new String[] {""} ;
      P002P14_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002P16_AV35Pz_DisAld = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmovpie__default(),
         new Object[] {
             new Object[] {
            P002P2_A396EmprCod, P002P2_A12927BarPieCoCN, P002P2_n12927BarPieCoCN, P002P2_A12926BarPieCoCI, P002P2_n12926BarPieCoCI, P002P2_A12925BarPieCliN, P002P2_n12925BarPieCliN, P002P2_A12924BarPieCliI, P002P2_n12924BarPieCliI, P002P2_A12923BarPieArtD,
            P002P2_n12923BarPieArtD, P002P2_A12922BarPieArtI, P002P2_n12922BarPieArtI, P002P2_A12921BarPieColN, P002P2_n12921BarPieColN, P002P2_A12920BarPieColD, P002P2_n12920BarPieColD, P002P2_A12911BarPieFep, P002P2_n12911BarPieFep, P002P2_A12113BarPieCLd,
            P002P2_n12113BarPieCLd, P002P2_A1642BarPieOrd, P002P2_n1642BarPieOrd, P002P2_A1919BarPieObs, P002P2_n1919BarPieObs, P002P2_A9800BarNPes, P002P2_n9800BarNPes, P002P2_A8907PzaB80, P002P2_n8907PzaB80, P002P2_A8838CodBarPz,
            P002P2_n8838CodBarPz, P002P2_A8707BapieObs, P002P2_n8707BapieObs, P002P2_A6489BarPieIdPz, P002P2_n6489BarPieIdPz, P002P2_A3276BarMtsAut, P002P2_n3276BarMtsAut, P002P2_A3275BarKgsAut, P002P2_n3275BarKgsAut, P002P2_A2186BarPieLoc,
            P002P2_n2186BarPieLoc, P002P2_A1691BarPieAnc, P002P2_n1691BarPieAnc, P002P2_A1501BarPiePie, P002P2_A197BarPConTro, P002P2_A183BarMetLan, P002P2_A170BarKilLan, P002P2_A201BarPieEst, P002P2_A205BarPieMet, P002P2_A203BarPieKil,
            P002P2_A130BarCodPar, P002P2_A132BarCodReo, P002P2_A129BarCod, P002P2_A13988BarPieVtx, P002P2_A13519BarPieMq, P002P2_n13519BarPieMq, P002P2_A13518BarPieTurn, P002P2_n13518BarPieTurn, P002P2_A13109BarPieST, P002P2_n13109BarPieST,
            P002P2_A13108BarPieLote, P002P2_n13108BarPieLote, P002P2_A13107BarPieEmp, P002P2_n13107BarPieEmp, P002P2_A13004BarPieDest, P002P2_n13004BarPieDest, P002P2_A12992BarPieOpe, P002P2_n12992BarPieOpe, P002P2_A12936BarPieSecu, P002P2_n12936BarPieSecu,
            P002P2_A12935BarPieTono, P002P2_n12935BarPieTono, P002P2_A12928BarPieEncC, P002P2_n12928BarPieEncC, P002P2_A12912BarPieUltD, P002P2_n12912BarPieUltD, P002P2_A12780BarPieUsu, P002P2_n12780BarPieUsu, P002P2_A12779BarPieFdv, P002P2_n12779BarPieFdv,
            P002P2_A6473BarUniB, P002P2_n6473BarUniB, P002P2_A6472BarTara, P002P2_n6472BarTara, P002P2_A9984BarPiePda, P002P2_n9984BarPiePda, P002P2_A9846BarPieAncc, P002P2_n9846BarPieAncc, P002P2_A9799BarPz2, P002P2_n9799BarPz2,
            P002P2_A9798BarPz1, P002P2_n9798BarPz1, P002P2_A9796BarPieK2, P002P2_n9796BarPieK2, P002P2_A9795BarPieK1, P002P2_n9795BarPieK1, P002P2_A6116BarPieImp, P002P2_n6116BarPieImp, P002P2_A3277BarPieAut, P002P2_n3277BarPieAut,
            P002P2_A1271BarPieLzd, P002P2_A908PieOriCod, P002P2_A361DisCod, P002P2_A200BarPieCod, P002P2_A392DisUniMed, P002P2_A375DisNumUni, P002P2_A374DisNumPie, P002P2_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P002P5_A396EmprCod, P002P5_A361DisCod, P002P5_A44AlbRecCod, P002P5_A380DisPieCod, P002P5_A382DisPieKil, P002P5_A384DisPieMet
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
            P002P13_A361DisCod, P002P13_A396EmprCod, P002P13_A130BarCodPar, P002P13_A132BarCodReo, P002P13_A129BarCod
            }
            , new Object[] {
            P002P14_A374DisNumPie, P002P14_A392DisUniMed, P002P14_A375DisNumUni
            }
            , new Object[] {
            }
            , new Object[] {
            P002P16_AV35Pz_DisAld
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19BarCodReo ;
   private byte AV16BarReoDes ;
   private byte AV36Vincolor ;
   private byte AV38Artextil ;
   private byte AV42Torient ;
   private byte AV43IniDatosPzaExpAut ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV33Flag ;
   private byte A12113BarPieCLd ;
   private byte A9800BarNPes ;
   private byte A201BarPieEst ;
   private byte A132BarCodReo ;
   private byte A13518BarPieTurn ;
   private byte A13004BarPieDest ;
   private byte W132BarCodReo ;
   private byte A5099DisPieEst ;
   private byte W201BarPieEst ;
   private byte W9800BarNPes ;
   private byte W12113BarPieCLd ;
   private byte AV35Pz_DisAld ;
   private byte cV35Pz_DisAld ;
   private short A1691BarPieAnc ;
   private short A197BarPConTro ;
   private short A13107BarPieEmp ;
   private short A12912BarPieUltD ;
   private short A9846BarPieAncc ;
   private short A3277BarPieAut ;
   private short A374DisNumPie ;
   private short O374DisNumPie ;
   private short Gx_err ;
   private short W197BarPConTro ;
   private short W1691BarPieAnc ;
   private int AV18BarCod ;
   private int AV15BarCodDes ;
   private int AV26DisCod ;
   private int A12927BarPieCoCN ;
   private int A12924BarPieCliI ;
   private int A12921BarPieColN ;
   private int A1642BarPieOrd ;
   private int A1501BarPiePie ;
   private int A129BarCod ;
   private int A12992BarPieOpe ;
   private int A9799BarPz2 ;
   private int A9798BarPz1 ;
   private int A1271BarPieLzd ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int W129BarCod ;
   private int AV34DisCod_o ;
   private int AV31AlbRecCod ;
   private int GX_INS36 ;
   private int W361DisCod ;
   private int W44AlbRecCod ;
   private int GX_INS18 ;
   private int W1501BarPiePie ;
   private int W1642BarPieOrd ;
   private int W12921BarPieColN ;
   private int W12927BarPieCoCN ;
   private int W12924BarPieCliI ;
   private java.math.BigDecimal AV22Kilos ;
   private java.math.BigDecimal AV23Metros ;
   private java.math.BigDecimal AV29KilPas ;
   private java.math.BigDecimal AV30MetPas ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A6473BarUniB ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV27KilTras ;
   private java.math.BigDecimal AV28MtrTras ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal O375DisNumUni ;
   private java.math.BigDecimal W203BarPieKil ;
   private java.math.BigDecimal W205BarPieMet ;
   private java.math.BigDecimal W170BarKilLan ;
   private java.math.BigDecimal W183BarMetLan ;
   private java.math.BigDecimal W3275BarKgsAut ;
   private java.math.BigDecimal W3276BarMtsAut ;
   private String A396EmprCod ;
   private String AV20BarCodPar ;
   private String AV21BarPieCod ;
   private String AV17BarParDes ;
   private String AV24Tipo ;
   private String AV25BarPieDes ;
   private String scmdbuf ;
   private String A12926BarPieCoCI ;
   private String A12925BarPieCliN ;
   private String A12923BarPieArtD ;
   private String A12922BarPieArtI ;
   private String A12920BarPieColD ;
   private String A1919BarPieObs ;
   private String A8907PzaB80 ;
   private String A8838CodBarPz ;
   private String A8707BapieObs ;
   private String A6489BarPieIdPz ;
   private String A2186BarPieLoc ;
   private String A130BarCodPar ;
   private String A13988BarPieVtx ;
   private String A13519BarPieMq ;
   private String A13109BarPieST ;
   private String A13108BarPieLote ;
   private String A12936BarPieSecu ;
   private String A12935BarPieTono ;
   private String A12928BarPieEncC ;
   private String A12780BarPieUsu ;
   private String A6116BarPieImp ;
   private String A908PieOriCod ;
   private String A200BarPieCod ;
   private String A392DisUniMed ;
   private String W130BarCodPar ;
   private String W200BarPieCod ;
   private String AV32Pieza ;
   private String AV41Pzab80 ;
   private String A380DisPieCod ;
   private String Gx_emsg ;
   private String W6489BarPieIdPz ;
   private String W8907PzaB80 ;
   private String W8707BapieObs ;
   private String W8838CodBarPz ;
   private String W1919BarPieObs ;
   private String W2186BarPieLoc ;
   private String W12920BarPieColD ;
   private String W12926BarPieCoCI ;
   private String W12923BarPieArtD ;
   private String W12922BarPieArtI ;
   private String W12925BarPieCliN ;
   private String AV37BarPieIdpz ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date A12779BarPieFdv ;
   private java.util.Date W12911BarPieFep ;
   private boolean n12927BarPieCoCN ;
   private boolean n12926BarPieCoCI ;
   private boolean n12925BarPieCliN ;
   private boolean n12924BarPieCliI ;
   private boolean n12923BarPieArtD ;
   private boolean n12922BarPieArtI ;
   private boolean n12921BarPieColN ;
   private boolean n12920BarPieColD ;
   private boolean n12911BarPieFep ;
   private boolean n12113BarPieCLd ;
   private boolean n1642BarPieOrd ;
   private boolean n1919BarPieObs ;
   private boolean n9800BarNPes ;
   private boolean n8907PzaB80 ;
   private boolean n8838CodBarPz ;
   private boolean n8707BapieObs ;
   private boolean n6489BarPieIdPz ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private boolean n2186BarPieLoc ;
   private boolean n1691BarPieAnc ;
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
   private boolean n12912BarPieUltD ;
   private boolean n12780BarPieUsu ;
   private boolean n12779BarPieFdv ;
   private boolean n6473BarUniB ;
   private boolean n6472BarTara ;
   private boolean n9984BarPiePda ;
   private boolean n9846BarPieAncc ;
   private boolean n9799BarPz2 ;
   private boolean n9798BarPz1 ;
   private boolean n9796BarPieK2 ;
   private boolean n9795BarPieK1 ;
   private boolean n6116BarPieImp ;
   private boolean n3277BarPieAut ;
   private int[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P002P2_A396EmprCod ;
   private int[] P002P2_A12927BarPieCoCN ;
   private boolean[] P002P2_n12927BarPieCoCN ;
   private String[] P002P2_A12926BarPieCoCI ;
   private boolean[] P002P2_n12926BarPieCoCI ;
   private String[] P002P2_A12925BarPieCliN ;
   private boolean[] P002P2_n12925BarPieCliN ;
   private int[] P002P2_A12924BarPieCliI ;
   private boolean[] P002P2_n12924BarPieCliI ;
   private String[] P002P2_A12923BarPieArtD ;
   private boolean[] P002P2_n12923BarPieArtD ;
   private String[] P002P2_A12922BarPieArtI ;
   private boolean[] P002P2_n12922BarPieArtI ;
   private int[] P002P2_A12921BarPieColN ;
   private boolean[] P002P2_n12921BarPieColN ;
   private String[] P002P2_A12920BarPieColD ;
   private boolean[] P002P2_n12920BarPieColD ;
   private java.util.Date[] P002P2_A12911BarPieFep ;
   private boolean[] P002P2_n12911BarPieFep ;
   private byte[] P002P2_A12113BarPieCLd ;
   private boolean[] P002P2_n12113BarPieCLd ;
   private int[] P002P2_A1642BarPieOrd ;
   private boolean[] P002P2_n1642BarPieOrd ;
   private String[] P002P2_A1919BarPieObs ;
   private boolean[] P002P2_n1919BarPieObs ;
   private byte[] P002P2_A9800BarNPes ;
   private boolean[] P002P2_n9800BarNPes ;
   private String[] P002P2_A8907PzaB80 ;
   private boolean[] P002P2_n8907PzaB80 ;
   private String[] P002P2_A8838CodBarPz ;
   private boolean[] P002P2_n8838CodBarPz ;
   private String[] P002P2_A8707BapieObs ;
   private boolean[] P002P2_n8707BapieObs ;
   private String[] P002P2_A6489BarPieIdPz ;
   private boolean[] P002P2_n6489BarPieIdPz ;
   private java.math.BigDecimal[] P002P2_A3276BarMtsAut ;
   private boolean[] P002P2_n3276BarMtsAut ;
   private java.math.BigDecimal[] P002P2_A3275BarKgsAut ;
   private boolean[] P002P2_n3275BarKgsAut ;
   private String[] P002P2_A2186BarPieLoc ;
   private boolean[] P002P2_n2186BarPieLoc ;
   private short[] P002P2_A1691BarPieAnc ;
   private boolean[] P002P2_n1691BarPieAnc ;
   private int[] P002P2_A1501BarPiePie ;
   private short[] P002P2_A197BarPConTro ;
   private java.math.BigDecimal[] P002P2_A183BarMetLan ;
   private java.math.BigDecimal[] P002P2_A170BarKilLan ;
   private byte[] P002P2_A201BarPieEst ;
   private java.math.BigDecimal[] P002P2_A205BarPieMet ;
   private java.math.BigDecimal[] P002P2_A203BarPieKil ;
   private String[] P002P2_A130BarCodPar ;
   private byte[] P002P2_A132BarCodReo ;
   private int[] P002P2_A129BarCod ;
   private String[] P002P2_A13988BarPieVtx ;
   private String[] P002P2_A13519BarPieMq ;
   private boolean[] P002P2_n13519BarPieMq ;
   private byte[] P002P2_A13518BarPieTurn ;
   private boolean[] P002P2_n13518BarPieTurn ;
   private String[] P002P2_A13109BarPieST ;
   private boolean[] P002P2_n13109BarPieST ;
   private String[] P002P2_A13108BarPieLote ;
   private boolean[] P002P2_n13108BarPieLote ;
   private short[] P002P2_A13107BarPieEmp ;
   private boolean[] P002P2_n13107BarPieEmp ;
   private byte[] P002P2_A13004BarPieDest ;
   private boolean[] P002P2_n13004BarPieDest ;
   private int[] P002P2_A12992BarPieOpe ;
   private boolean[] P002P2_n12992BarPieOpe ;
   private String[] P002P2_A12936BarPieSecu ;
   private boolean[] P002P2_n12936BarPieSecu ;
   private String[] P002P2_A12935BarPieTono ;
   private boolean[] P002P2_n12935BarPieTono ;
   private String[] P002P2_A12928BarPieEncC ;
   private boolean[] P002P2_n12928BarPieEncC ;
   private short[] P002P2_A12912BarPieUltD ;
   private boolean[] P002P2_n12912BarPieUltD ;
   private String[] P002P2_A12780BarPieUsu ;
   private boolean[] P002P2_n12780BarPieUsu ;
   private java.util.Date[] P002P2_A12779BarPieFdv ;
   private boolean[] P002P2_n12779BarPieFdv ;
   private java.math.BigDecimal[] P002P2_A6473BarUniB ;
   private boolean[] P002P2_n6473BarUniB ;
   private java.math.BigDecimal[] P002P2_A6472BarTara ;
   private boolean[] P002P2_n6472BarTara ;
   private java.math.BigDecimal[] P002P2_A9984BarPiePda ;
   private boolean[] P002P2_n9984BarPiePda ;
   private short[] P002P2_A9846BarPieAncc ;
   private boolean[] P002P2_n9846BarPieAncc ;
   private int[] P002P2_A9799BarPz2 ;
   private boolean[] P002P2_n9799BarPz2 ;
   private int[] P002P2_A9798BarPz1 ;
   private boolean[] P002P2_n9798BarPz1 ;
   private java.math.BigDecimal[] P002P2_A9796BarPieK2 ;
   private boolean[] P002P2_n9796BarPieK2 ;
   private java.math.BigDecimal[] P002P2_A9795BarPieK1 ;
   private boolean[] P002P2_n9795BarPieK1 ;
   private String[] P002P2_A6116BarPieImp ;
   private boolean[] P002P2_n6116BarPieImp ;
   private short[] P002P2_A3277BarPieAut ;
   private boolean[] P002P2_n3277BarPieAut ;
   private int[] P002P2_A1271BarPieLzd ;
   private String[] P002P2_A908PieOriCod ;
   private int[] P002P2_A361DisCod ;
   private String[] P002P2_A200BarPieCod ;
   private String[] P002P2_A392DisUniMed ;
   private java.math.BigDecimal[] P002P2_A375DisNumUni ;
   private short[] P002P2_A374DisNumPie ;
   private int[] P002P2_A44AlbRecCod ;
   private String[] P002P5_A396EmprCod ;
   private int[] P002P5_A361DisCod ;
   private int[] P002P5_A44AlbRecCod ;
   private String[] P002P5_A380DisPieCod ;
   private java.math.BigDecimal[] P002P5_A382DisPieKil ;
   private java.math.BigDecimal[] P002P5_A384DisPieMet ;
   private int[] P002P13_A361DisCod ;
   private String[] P002P13_A396EmprCod ;
   private String[] P002P13_A130BarCodPar ;
   private byte[] P002P13_A132BarCodReo ;
   private int[] P002P13_A129BarCod ;
   private short[] P002P14_A374DisNumPie ;
   private String[] P002P14_A392DisUniMed ;
   private java.math.BigDecimal[] P002P14_A375DisNumUni ;
   private byte[] P002P16_AV35Pz_DisAld ;
}

final  class pmovpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002P2", "SELECT T1.EmprCod, T1.BarPieCoCN, T1.BarPieCoCI, T1.BarPieCliN, T1.BarPieCliI, T1.BarPieArtD, T1.BarPieArtI, T1.BarPieColN, T1.BarPieColD, T1.BarPieFep, T1.BarPieCLd, T1.BarPieOrd, T1.BarPieObs, T1.BarNPes, T1.PzaB80, T1.CodBarPz, T1.BapieObs, T1.BarPieIdPz, T1.BarMtsAut, T1.BarKgsAut, T1.BarPieLoc, T1.BarPieAnc, T1.BarPiePie, T1.BarPConTro, T1.BarMetLan, T1.BarKilLan, T1.BarPieEst, T1.BarPieMet, T1.BarPieKil, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarPieVtx, T1.BarPieMq, T1.BarPieTurn, T1.BarPieST, T1.BarPieLote, T1.BarPieEmp, T1.BarPieDest, T1.BarPieOpe, T1.BarPieSecu, T1.BarPieTono, T1.BarPieEncC, T1.BarPieUltD, T1.BarPieUsu, T1.BarPieFdv, T1.BarUniB, T1.BarTara, T1.BarPiePda, T1.BarPieAncc, T1.BarPz2, T1.BarPz1, T1.BarPieK2, T1.BarPieK1, T1.BarPieImp, T1.BarPieAut, T1.BarPieLzd, T1.PieOriCod, T2.DisCod, T1.BarPieCod, T3.DisUniMed, T3.DisNumUni, T3.DisNumPie, T1.AlbRecCod FROM ((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P002P3", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P002P4", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P002P5", "SELECT EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet FROM TXPDISALD WHERE (EmprCod = ? and DisCod = ? and AlbRecCod = ?) AND (DisPieCod = SUBSTR(?, 1, 8)) ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002P6", "DELETE FROM TXPDISALD  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P002P7", "DELETE FROM TXPDISALD  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P002P8", "UPDATE TXPDISALD SET DisPieKil=?, DisPieMet=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P002P9", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieEst, DisPieLoc, DisPieAnc, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P002P10", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P002P11", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P002P12", "UPDATE TXPBARPIE SET BarPieMet=?, BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P002P13", "SELECT DisCod, EmprCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002P14", "SELECT DisNumPie, DisUniMed, DisNumUni FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P002P15", "UPDATE TXPDISPOS SET DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P002P16", "SELECT COUNT(*) FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002P17", "DELETE FROM TXPDISALB  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 60);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 9);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 15);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((short[]) buf[44])[0] = rslt.getShort(24);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(26,2);
               ((byte[]) buf[47])[0] = rslt.getByte(27);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(29,2);
               ((String[]) buf[50])[0] = rslt.getString(30, 1);
               ((byte[]) buf[51])[0] = rslt.getByte(31);
               ((int[]) buf[52])[0] = rslt.getInt(32);
               ((String[]) buf[53])[0] = rslt.getString(33, 20);
               ((String[]) buf[54])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(35);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(36, 20);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(37, 20);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(38);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((byte[]) buf[64])[0] = rslt.getByte(39);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((int[]) buf[66])[0] = rslt.getInt(40);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(41, 10);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(42, 10);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(43, 20);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(44);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(45, 10);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[78])[0] = rslt.getGXDate(46);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(48,2);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((short[]) buf[86])[0] = rslt.getShort(50);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((int[]) buf[88])[0] = rslt.getInt(51);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((int[]) buf[90])[0] = rslt.getInt(52);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[92])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(56);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((int[]) buf[100])[0] = rslt.getInt(57);
               ((String[]) buf[101])[0] = rslt.getString(58, 9);
               ((int[]) buf[102])[0] = rslt.getInt(59);
               ((String[]) buf[103])[0] = rslt.getString(60, 9);
               ((String[]) buf[104])[0] = rslt.getString(61, 1);
               ((java.math.BigDecimal[]) buf[105])[0] = rslt.getBigDecimal(62,2);
               ((short[]) buf[106])[0] = rslt.getShort(63);
               ((int[]) buf[107])[0] = rslt.getInt(64);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 14 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 8 :
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
            case 9 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

