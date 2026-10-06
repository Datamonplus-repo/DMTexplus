package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdespie extends GXProcedure
{
   public pdespie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdespie.class ), "" );
   }

   public pdespie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 ,
                          String[] aP6 ,
                          int[] aP7 ,
                          java.math.BigDecimal[] aP8 ,
                          java.math.BigDecimal[] aP9 ,
                          String[] aP10 )
   {
      pdespie.this.aP11 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 )
   {
      pdespie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdespie.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pdespie.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdespie.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdespie.this.AV18BarCodDes = aP4[0];
      this.aP4 = aP4;
      pdespie.this.AV19BarReoDes = aP5[0];
      this.aP5 = aP5;
      pdespie.this.AV20BarParDes = aP6[0];
      this.aP6 = aP6;
      pdespie.this.AV21BarPie = aP7[0];
      this.aP7 = aP7;
      pdespie.this.AV22BarKgm = aP8[0];
      this.aP8 = aP8;
      pdespie.this.AV23BarMtr = aP9[0];
      this.aP9 = aP9;
      pdespie.this.AV24Tipo = aP10[0];
      this.aP10 = aP10;
      pdespie.this.AV25DisCod = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV60Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pdespie.this.GXt_char1 = GXv_char2[0] ;
      AV60Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV61EmprNom ;
      GXv_char4[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV60Station, GXv_char2, GXv_char3, GXv_char4) ;
      pdespie.this.A396EmprCod = GXv_char2[0] ;
      pdespie.this.AV61EmprNom = GXv_char3[0] ;
      pdespie.this.AV62UsurCod = GXv_char4[0] ;
      AV44FlagHil = (byte)(0) ;
      GXv_int5[0] = AV44FlagHil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILO", ""), GXv_int5) ;
      pdespie.this.AV44FlagHil = GXv_int5[0] ;
      GXv_int5[0] = AV51FlagJBP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBP", ""), GXv_int5) ;
      pdespie.this.AV51FlagJBP = GXv_int5[0] ;
      GXv_int5[0] = AV52F_induyco ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int5) ;
      pdespie.this.AV52F_induyco = GXv_int5[0] ;
      GXt_char1 = AV55ContDsc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      pdespie.this.A396EmprCod = GXv_char4[0] ;
      pdespie.this.GXt_char1 = GXv_char2[0] ;
      AV55ContDsc = GXt_char1 ;
      AV54CliPropio = (int)(GXutil.lval( GXutil.trim( AV55ContDsc))) ;
      AV40PiezasR = 0 ;
      AV30KilosR = DecimalUtil.doubleToDec(0) ;
      AV31MetrosR = DecimalUtil.doubleToDec(0) ;
      AV39Flag = (byte)(0) ;
      AV28Kilos2 = AV22BarKgm ;
      AV29Metros2 = AV23BarMtr ;
      AV34Piezas2 = AV21BarPie ;
      AV41Piezas3 = AV21BarPie ;
      AV65deletebarpie = (short)(0) ;
      AV67disalb = (short)(0) ;
      AV68tbarpie = (short)(0) ;
      AV69mbarpie = (short)(0) ;
      /* Using cursor P009A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1501BarPiePie = P009A2_A1501BarPiePie[0] ;
         A205BarPieMet = P009A2_A205BarPieMet[0] ;
         A203BarPieKil = P009A2_A203BarPieKil[0] ;
         A130BarCodPar = P009A2_A130BarCodPar[0] ;
         A132BarCodReo = P009A2_A132BarCodReo[0] ;
         A129BarCod = P009A2_A129BarCod[0] ;
         A13988BarPieVtx = P009A2_A13988BarPieVtx[0] ;
         A13519BarPieMq = P009A2_A13519BarPieMq[0] ;
         n13519BarPieMq = P009A2_n13519BarPieMq[0] ;
         A13518BarPieTurn = P009A2_A13518BarPieTurn[0] ;
         n13518BarPieTurn = P009A2_n13518BarPieTurn[0] ;
         A13109BarPieST = P009A2_A13109BarPieST[0] ;
         n13109BarPieST = P009A2_n13109BarPieST[0] ;
         A13108BarPieLote = P009A2_A13108BarPieLote[0] ;
         n13108BarPieLote = P009A2_n13108BarPieLote[0] ;
         A13107BarPieEmp = P009A2_A13107BarPieEmp[0] ;
         n13107BarPieEmp = P009A2_n13107BarPieEmp[0] ;
         A13004BarPieDest = P009A2_A13004BarPieDest[0] ;
         n13004BarPieDest = P009A2_n13004BarPieDest[0] ;
         A12992BarPieOpe = P009A2_A12992BarPieOpe[0] ;
         n12992BarPieOpe = P009A2_n12992BarPieOpe[0] ;
         A12936BarPieSecu = P009A2_A12936BarPieSecu[0] ;
         n12936BarPieSecu = P009A2_n12936BarPieSecu[0] ;
         A12935BarPieTono = P009A2_A12935BarPieTono[0] ;
         n12935BarPieTono = P009A2_n12935BarPieTono[0] ;
         A12928BarPieEncC = P009A2_A12928BarPieEncC[0] ;
         n12928BarPieEncC = P009A2_n12928BarPieEncC[0] ;
         A12927BarPieCoCN = P009A2_A12927BarPieCoCN[0] ;
         n12927BarPieCoCN = P009A2_n12927BarPieCoCN[0] ;
         A12926BarPieCoCI = P009A2_A12926BarPieCoCI[0] ;
         n12926BarPieCoCI = P009A2_n12926BarPieCoCI[0] ;
         A12925BarPieCliN = P009A2_A12925BarPieCliN[0] ;
         n12925BarPieCliN = P009A2_n12925BarPieCliN[0] ;
         A12924BarPieCliI = P009A2_A12924BarPieCliI[0] ;
         n12924BarPieCliI = P009A2_n12924BarPieCliI[0] ;
         A12923BarPieArtD = P009A2_A12923BarPieArtD[0] ;
         n12923BarPieArtD = P009A2_n12923BarPieArtD[0] ;
         A12922BarPieArtI = P009A2_A12922BarPieArtI[0] ;
         n12922BarPieArtI = P009A2_n12922BarPieArtI[0] ;
         A12921BarPieColN = P009A2_A12921BarPieColN[0] ;
         n12921BarPieColN = P009A2_n12921BarPieColN[0] ;
         A12920BarPieColD = P009A2_A12920BarPieColD[0] ;
         n12920BarPieColD = P009A2_n12920BarPieColD[0] ;
         A12912BarPieUltD = P009A2_A12912BarPieUltD[0] ;
         n12912BarPieUltD = P009A2_n12912BarPieUltD[0] ;
         A12911BarPieFep = P009A2_A12911BarPieFep[0] ;
         n12911BarPieFep = P009A2_n12911BarPieFep[0] ;
         A12780BarPieUsu = P009A2_A12780BarPieUsu[0] ;
         n12780BarPieUsu = P009A2_n12780BarPieUsu[0] ;
         A12779BarPieFdv = P009A2_A12779BarPieFdv[0] ;
         n12779BarPieFdv = P009A2_n12779BarPieFdv[0] ;
         A12113BarPieCLd = P009A2_A12113BarPieCLd[0] ;
         n12113BarPieCLd = P009A2_n12113BarPieCLd[0] ;
         A1642BarPieOrd = P009A2_A1642BarPieOrd[0] ;
         n1642BarPieOrd = P009A2_n1642BarPieOrd[0] ;
         A6473BarUniB = P009A2_A6473BarUniB[0] ;
         n6473BarUniB = P009A2_n6473BarUniB[0] ;
         A6472BarTara = P009A2_A6472BarTara[0] ;
         n6472BarTara = P009A2_n6472BarTara[0] ;
         A1919BarPieObs = P009A2_A1919BarPieObs[0] ;
         n1919BarPieObs = P009A2_n1919BarPieObs[0] ;
         A9984BarPiePda = P009A2_A9984BarPiePda[0] ;
         n9984BarPiePda = P009A2_n9984BarPiePda[0] ;
         A9846BarPieAncc = P009A2_A9846BarPieAncc[0] ;
         n9846BarPieAncc = P009A2_n9846BarPieAncc[0] ;
         A9800BarNPes = P009A2_A9800BarNPes[0] ;
         n9800BarNPes = P009A2_n9800BarNPes[0] ;
         A9799BarPz2 = P009A2_A9799BarPz2[0] ;
         n9799BarPz2 = P009A2_n9799BarPz2[0] ;
         A9798BarPz1 = P009A2_A9798BarPz1[0] ;
         n9798BarPz1 = P009A2_n9798BarPz1[0] ;
         A9796BarPieK2 = P009A2_A9796BarPieK2[0] ;
         n9796BarPieK2 = P009A2_n9796BarPieK2[0] ;
         A9795BarPieK1 = P009A2_A9795BarPieK1[0] ;
         n9795BarPieK1 = P009A2_n9795BarPieK1[0] ;
         A8907PzaB80 = P009A2_A8907PzaB80[0] ;
         n8907PzaB80 = P009A2_n8907PzaB80[0] ;
         A8838CodBarPz = P009A2_A8838CodBarPz[0] ;
         n8838CodBarPz = P009A2_n8838CodBarPz[0] ;
         A8707BapieObs = P009A2_A8707BapieObs[0] ;
         n8707BapieObs = P009A2_n8707BapieObs[0] ;
         A6489BarPieIdPz = P009A2_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = P009A2_n6489BarPieIdPz[0] ;
         A6116BarPieImp = P009A2_A6116BarPieImp[0] ;
         n6116BarPieImp = P009A2_n6116BarPieImp[0] ;
         A3277BarPieAut = P009A2_A3277BarPieAut[0] ;
         n3277BarPieAut = P009A2_n3277BarPieAut[0] ;
         A3276BarMtsAut = P009A2_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P009A2_n3276BarMtsAut[0] ;
         A3275BarKgsAut = P009A2_A3275BarKgsAut[0] ;
         n3275BarKgsAut = P009A2_n3275BarKgsAut[0] ;
         A2186BarPieLoc = P009A2_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P009A2_n2186BarPieLoc[0] ;
         A1691BarPieAnc = P009A2_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P009A2_n1691BarPieAnc[0] ;
         A1271BarPieLzd = P009A2_A1271BarPieLzd[0] ;
         A908PieOriCod = P009A2_A908PieOriCod[0] ;
         A197BarPConTro = P009A2_A197BarPConTro[0] ;
         A183BarMetLan = P009A2_A183BarMetLan[0] ;
         A170BarKilLan = P009A2_A170BarKilLan[0] ;
         A201BarPieEst = P009A2_A201BarPieEst[0] ;
         A44AlbRecCod = P009A2_A44AlbRecCod[0] ;
         A200BarPieCod = P009A2_A200BarPieCod[0] ;
         A3701PiezasUti = P009A2_A3701PiezasUti[0] ;
         n3701PiezasUti = P009A2_n3701PiezasUti[0] ;
         A3700MetrosUti = P009A2_A3700MetrosUti[0] ;
         n3700MetrosUti = P009A2_n3700MetrosUti[0] ;
         A3699KilosUti = P009A2_A3699KilosUti[0] ;
         n3699KilosUti = P009A2_n3699KilosUti[0] ;
         A361DisCod = P009A2_A361DisCod[0] ;
         A228BarUniMed = P009A2_A228BarUniMed[0] ;
         A361DisCod = P009A2_A361DisCod[0] ;
         A228BarUniMed = P009A2_A228BarUniMed[0] ;
         A3701PiezasUti = P009A2_A3701PiezasUti[0] ;
         n3701PiezasUti = P009A2_n3701PiezasUti[0] ;
         A3700MetrosUti = P009A2_A3700MetrosUti[0] ;
         n3700MetrosUti = P009A2_n3700MetrosUti[0] ;
         A3699KilosUti = P009A2_A3699KilosUti[0] ;
         n3699KilosUti = P009A2_n3699KilosUti[0] ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         if ( GXutil.strcmp(AV24Tipo, httpContext.getMessage( "T", "")) == 0 )
         {
            AV26Kilos = A203BarPieKil ;
            AV27Metros = A205BarPieMet ;
            AV65deletebarpie = (short)(1) ;
            /* Using cursor P009A3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         }
         else
         {
            if ( DecimalUtil.compareTo(A203BarPieKil, AV28Kilos2) <= 0 )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A203BarPieKil)==0) )
               {
                  AV26Kilos = A203BarPieKil ;
                  AV28Kilos2 = AV28Kilos2.subtract(AV26Kilos) ;
                  AV65deletebarpie = (short)(1) ;
                  /* Using cursor P009A4 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               }
            }
            else
            {
               AV26Kilos = AV28Kilos2 ;
               AV28Kilos2 = AV28Kilos2.subtract(AV26Kilos) ;
               A203BarPieKil = A203BarPieKil.subtract(AV26Kilos) ;
               AV69mbarpie = (short)(1) ;
            }
            if ( DecimalUtil.compareTo(A205BarPieMet, AV29Metros2) <= 0 )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A205BarPieMet)==0) )
               {
                  AV27Metros = A205BarPieMet ;
                  AV29Metros2 = AV29Metros2.subtract(AV27Metros) ;
                  AV65deletebarpie = (short)(1) ;
                  /* Using cursor P009A5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               }
            }
            else
            {
               AV27Metros = AV29Metros2 ;
               AV29Metros2 = AV29Metros2.subtract(AV27Metros) ;
               A205BarPieMet = A205BarPieMet.subtract(AV27Metros) ;
               AV69mbarpie = (short)(1) ;
            }
            if ( ( A1501BarPiePie <= AV34Piezas2 ) && ( A1501BarPiePie > 1 ) && ( AV34Piezas2 > 1 ) )
            {
               if ( ! (0==A1501BarPiePie) )
               {
                  AV21BarPie = A1501BarPiePie ;
                  AV34Piezas2 = (int)(AV34Piezas2-AV21BarPie) ;
                  AV65deletebarpie = (short)(1) ;
                  /* Using cursor P009A6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               }
            }
            else
            {
               if ( ( A1501BarPiePie > 1 ) && ( AV34Piezas2 > 1 ) )
               {
                  AV21BarPie = AV34Piezas2 ;
                  AV34Piezas2 = (int)(AV34Piezas2-AV21BarPie) ;
                  A1501BarPiePie = (int)(A1501BarPiePie-AV21BarPie) ;
                  AV69mbarpie = (short)(1) ;
               }
            }
         }
         AV32AlbRecCod = A44AlbRecCod ;
         AV35DisAct = A361DisCod ;
         /* Execute user subroutine: 'MODDIS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV39Flag = (byte)(1) ;
         /*
            INSERT RECORD ON TABLE TXPDISALB

         */
         W361DisCod = A361DisCod ;
         W44AlbRecCod = A44AlbRecCod ;
         W595Kilos = A595Kilos ;
         W631Metros = A631Metros ;
         W673Piezas = A673Piezas ;
         A361DisCod = AV25DisCod ;
         A44AlbRecCod = AV32AlbRecCod ;
         A595Kilos = AV26Kilos ;
         A631Metros = AV27Metros ;
         A673Piezas = AV21BarPie ;
         /* Using cursor P009A7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros, Boolean.valueOf(n3699KilosUti), A3699KilosUti, Boolean.valueOf(n3700MetrosUti), A3700MetrosUti, Boolean.valueOf(n3701PiezasUti), Short.valueOf(A3701PiezasUti)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( (pr_default.getStatus(5) == 1) )
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
         A595Kilos = W595Kilos ;
         A631Metros = W631Metros ;
         A673Piezas = W673Piezas ;
         /* End Insert */
         AV67disalb = (short)(1) ;
         /*
            INSERT RECORD ON TABLE TXPBARPIE

         */
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W203BarPieKil = A203BarPieKil ;
         W205BarPieMet = A205BarPieMet ;
         W1501BarPiePie = A1501BarPiePie ;
         A129BarCod = AV18BarCodDes ;
         A132BarCodReo = AV19BarReoDes ;
         A130BarCodPar = AV20BarParDes ;
         A203BarPieKil = AV26Kilos ;
         A205BarPieMet = AV27Metros ;
         A1501BarPiePie = AV21BarPie ;
         /* Using cursor P009A8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, A13988BarPieVtx});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A203BarPieKil = W203BarPieKil ;
         A205BarPieMet = W205BarPieMet ;
         A1501BarPiePie = W1501BarPiePie ;
         /* End Insert */
         AV68tbarpie = (short)(1) ;
         AV30KilosR = AV30KilosR.add(AV26Kilos) ;
         AV31MetrosR = AV31MetrosR.add(AV27Metros) ;
         AV40PiezasR = (int)(AV40PiezasR+AV21BarPie) ;
         if ( ( ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28Kilos2)==0) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) ) || ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29Metros2)==0) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) ) ) && ( GXutil.strcmp(AV24Tipo, httpContext.getMessage( "P", "")) == 0 ) )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P009A9 */
            pr_default.execute(7, new Object[] {Integer.valueOf(A1501BarPiePie), A205BarPieMet, A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            if (true) break;
         }
         /* Using cursor P009A10 */
         pr_default.execute(8, new Object[] {Integer.valueOf(A1501BarPiePie), A205BarPieMet, A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "&flag=", "")+GXutil.str( AV39Flag, 1, 0) );
      if ( AV39Flag == 1 )
      {
         AV59Inc_obs = " " ;
         if ( AV65deletebarpie == 1 )
         {
            AV59Inc_obs = httpContext.getMessage( "Se aplico DELETE BARPIE ", "") ;
         }
         if ( AV69mbarpie == 1 )
         {
            AV59Inc_obs = httpContext.getMessage( "Se aplico UPDATE BARPIE ", "") ;
         }
         if ( AV67disalb == 1 )
         {
            if ( GXutil.strcmp(AV59Inc_obs, " ") != 0 )
            {
               AV59Inc_obs += httpContext.getMessage( "/IN DISALB", "") ;
            }
            else
            {
               AV59Inc_obs = httpContext.getMessage( "IN DISALB", "") ;
            }
         }
         if ( AV68tbarpie == 1 )
         {
            if ( GXutil.strcmp(AV59Inc_obs, " ") != 0 )
            {
               AV59Inc_obs += httpContext.getMessage( "/IN BARPIE", "") ;
            }
            else
            {
               AV59Inc_obs = httpContext.getMessage( "IN BARPIE", "") ;
            }
         }
         if ( GXutil.strcmp(AV59Inc_obs, " ") != 0 )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV73Pgmname, AV62UsurCod, AV60Station, AV59Inc_obs, AV15BarCod, AV16BarCodReo, AV17BarCodPar) ;
         }
      }
      if ( AV44FlagHil == 1 )
      {
         /* Using cursor P009A11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A130BarCodPar = P009A11_A130BarCodPar[0] ;
            A132BarCodReo = P009A11_A132BarCodReo[0] ;
            A129BarCod = P009A11_A129BarCod[0] ;
            A212BarSer = P009A11_A212BarSer[0] ;
            A252CliCod = P009A11_A252CliCod[0] ;
            n252CliCod = P009A11_n252CliCod[0] ;
            A966PartCod = P009A11_A966PartCod[0] ;
            n966PartCod = P009A11_n966PartCod[0] ;
            A361DisCod = P009A11_A361DisCod[0] ;
            A5253BarAcc = P009A11_A5253BarAcc[0] ;
            A966PartCod = P009A11_A966PartCod[0] ;
            n966PartCod = P009A11_n966PartCod[0] ;
            AV48CliCod = A252CliCod ;
            AV49PartCod = A966PartCod ;
            AV50DisCod1 = A361DisCod ;
            if ( ! (0==AV54CliPropio) && ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "P", "")) == 0 ) )
            {
               AV53CliPdo = AV54CliPropio ;
            }
            else
            {
               AV53CliPdo = A252CliCod ;
            }
            /* Execute user subroutine: 'ACTPDO1' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(9);
               pr_default.close(9);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
         /* Using cursor P009A12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodDes), Byte.valueOf(AV19BarReoDes), AV20BarParDes});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A130BarCodPar = P009A12_A130BarCodPar[0] ;
            A132BarCodReo = P009A12_A132BarCodReo[0] ;
            A129BarCod = P009A12_A129BarCod[0] ;
            A212BarSer = P009A12_A212BarSer[0] ;
            A252CliCod = P009A12_A252CliCod[0] ;
            n252CliCod = P009A12_n252CliCod[0] ;
            A966PartCod = P009A12_A966PartCod[0] ;
            n966PartCod = P009A12_n966PartCod[0] ;
            A361DisCod = P009A12_A361DisCod[0] ;
            A5253BarAcc = P009A12_A5253BarAcc[0] ;
            A966PartCod = P009A12_A966PartCod[0] ;
            n966PartCod = P009A12_n966PartCod[0] ;
            AV48CliCod = A252CliCod ;
            AV49PartCod = A966PartCod ;
            AV50DisCod1 = A361DisCod ;
            if ( ! (0==AV54CliPropio) && ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "P", "")) == 0 ) )
            {
               AV53CliPdo = AV54CliPropio ;
            }
            else
            {
               AV53CliPdo = A252CliCod ;
            }
            /* Execute user subroutine: 'ACTPDO2' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(10);
               pr_default.close(10);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
      if ( AV39Flag == 1 )
      {
         /* Using cursor P009A13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodDes), Byte.valueOf(AV19BarReoDes), AV20BarParDes, A396EmprCod, Integer.valueOf(AV18BarCodDes), Byte.valueOf(AV19BarReoDes), AV20BarParDes});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A361DisCod = P009A13_A361DisCod[0] ;
            A130BarCodPar = P009A13_A130BarCodPar[0] ;
            A132BarCodReo = P009A13_A132BarCodReo[0] ;
            A129BarCod = P009A13_A129BarCod[0] ;
            /* Using cursor P009A14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            A374DisNumPie = P009A14_A374DisNumPie[0] ;
            A392DisUniMed = P009A14_A392DisUniMed[0] ;
            A375DisNumUni = P009A14_A375DisNumUni[0] ;
            A374DisNumPie = (short)(AV40PiezasR) ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A375DisNumUni = AV30KilosR ;
            }
            else
            {
               A375DisNumUni = AV31MetrosR ;
            }
            /* Using cursor P009A15 */
            pr_default.execute(13, new Object[] {Short.valueOf(A374DisNumPie), A375DisNumUni, A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
         pr_default.close(12);
      }
      AV22BarKgm = AV30KilosR ;
      AV23BarMtr = AV31MetrosR ;
      AV21BarPie = AV40PiezasR ;
      if ( ( AV51FlagJBP == 1 ) || ( AV52F_induyco == 1 ) )
      {
         /* Using cursor P009A16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodDes), Byte.valueOf(AV19BarReoDes), AV20BarParDes});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A130BarCodPar = P009A16_A130BarCodPar[0] ;
            A132BarCodReo = P009A16_A132BarCodReo[0] ;
            A129BarCod = P009A16_A129BarCod[0] ;
            A228BarUniMed = P009A16_A228BarUniMed[0] ;
            A192BarNumUni = P009A16_A192BarNumUni[0] ;
            if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A192BarNumUni = AV22BarKgm ;
            }
            else
            {
               A192BarNumUni = AV23BarMtr ;
            }
            /* Using cursor P009A17 */
            pr_default.execute(15, new Object[] {A192BarNumUni, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(14);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'MODDIS' Routine */
      returnInSub = false ;
      /* Using cursor P009A18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV35DisAct), Integer.valueOf(AV32AlbRecCod), A396EmprCod, Integer.valueOf(AV35DisAct), Integer.valueOf(AV32AlbRecCod)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A44AlbRecCod = P009A18_A44AlbRecCod[0] ;
         A361DisCod = P009A18_A361DisCod[0] ;
         A631Metros = P009A18_A631Metros[0] ;
         A595Kilos = P009A18_A595Kilos[0] ;
         A673Piezas = P009A18_A673Piezas[0] ;
         /* Using cursor P009A19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A392DisUniMed = P009A19_A392DisUniMed[0] ;
         A375DisNumUni = P009A19_A375DisNumUni[0] ;
         A374DisNumPie = P009A19_A374DisNumPie[0] ;
         if ( ( DecimalUtil.compareTo(A595Kilos, AV26Kilos) == 0 ) && ( DecimalUtil.compareTo(A631Metros, AV27Metros) == 0 ) )
         {
            AV41Piezas3 = (int)(AV41Piezas3-A673Piezas) ;
            AV38PieSal = A673Piezas ;
            /* Using cursor P009A20 */
            pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A375DisNumUni = A375DisNumUni.subtract(AV26Kilos) ;
            }
            else
            {
               A375DisNumUni = A375DisNumUni.subtract(AV27Metros) ;
            }
            A374DisNumPie = (short)(A374DisNumPie-A673Piezas) ;
         }
         else
         {
            A595Kilos = A595Kilos.subtract(AV26Kilos) ;
            A631Metros = A631Metros.subtract(AV27Metros) ;
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               A375DisNumUni = A375DisNumUni.subtract(AV26Kilos) ;
            }
            else
            {
               A375DisNumUni = A375DisNumUni.subtract(AV27Metros) ;
            }
            if ( A673Piezas > AV41Piezas3 )
            {
               A673Piezas = (int)(A673Piezas-AV41Piezas3) ;
               AV38PieSal = AV41Piezas3 ;
               A374DisNumPie = (short)(A374DisNumPie-AV41Piezas3) ;
            }
            else
            {
               AV41Piezas3 = (int)(AV41Piezas3-A673Piezas) ;
               AV38PieSal = AV41Piezas3 ;
               A374DisNumPie = (short)(A374DisNumPie-A673Piezas) ;
               /* Using cursor P009A21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            }
         }
         /* Using cursor P009A22 */
         pr_default.execute(20, new Object[] {A375DisNumUni, Short.valueOf(A374DisNumPie), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Using cursor P009A23 */
         pr_default.execute(21, new Object[] {A631Metros, A595Kilos, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      pr_default.close(17);
   }

   public void S121( )
   {
      /* 'ACTPDO1' Routine */
      returnInSub = false ;
      /* Using cursor P009A24 */
      pr_default.execute(22, new Object[] {A396EmprCod, AV49PartCod, Integer.valueOf(AV53CliPdo), Integer.valueOf(AV50DisCod1)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A981PartAlbDis = P009A24_A981PartAlbDis[0] ;
         n981PartAlbDis = P009A24_n981PartAlbDis[0] ;
         A980PartLinTip = P009A24_A980PartLinTip[0] ;
         n980PartLinTip = P009A24_n980PartLinTip[0] ;
         A252CliCod = P009A24_A252CliCod[0] ;
         n252CliCod = P009A24_n252CliCod[0] ;
         A966PartCod = P009A24_A966PartCod[0] ;
         n966PartCod = P009A24_n966PartCod[0] ;
         A986KilUti = P009A24_A986KilUti[0] ;
         n986KilUti = P009A24_n986KilUti[0] ;
         A987ConUti = P009A24_A987ConUti[0] ;
         n987ConUti = P009A24_n987ConUti[0] ;
         A979PartLin = P009A24_A979PartLin[0] ;
         if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 )
         {
            A986KilUti = A986KilUti.subtract(AV26Kilos) ;
            n986KilUti = false ;
            A987ConUti = (short)(A987ConUti-AV21BarPie) ;
            n987ConUti = false ;
            /* Using cursor P009A25 */
            pr_default.execute(23, new Object[] {Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
         }
         pr_default.readNext(22);
      }
      pr_default.close(22);
   }

   public void S131( )
   {
      /* 'ACTPDO2' Routine */
      returnInSub = false ;
      /* Using cursor P009A26 */
      pr_default.execute(24, new Object[] {A396EmprCod, AV49PartCod, Integer.valueOf(AV53CliPdo), Integer.valueOf(AV50DisCod1)});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A981PartAlbDis = P009A26_A981PartAlbDis[0] ;
         n981PartAlbDis = P009A26_n981PartAlbDis[0] ;
         A980PartLinTip = P009A26_A980PartLinTip[0] ;
         n980PartLinTip = P009A26_n980PartLinTip[0] ;
         A252CliCod = P009A26_A252CliCod[0] ;
         n252CliCod = P009A26_n252CliCod[0] ;
         A966PartCod = P009A26_A966PartCod[0] ;
         n966PartCod = P009A26_n966PartCod[0] ;
         A986KilUti = P009A26_A986KilUti[0] ;
         n986KilUti = P009A26_n986KilUti[0] ;
         A987ConUti = P009A26_A987ConUti[0] ;
         n987ConUti = P009A26_n987ConUti[0] ;
         A979PartLin = P009A26_A979PartLin[0] ;
         if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 )
         {
            A986KilUti = AV26Kilos ;
            n986KilUti = false ;
            A987ConUti = (short)(AV21BarPie) ;
            n987ConUti = false ;
            /* Using cursor P009A27 */
            pr_default.execute(25, new Object[] {Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
         }
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdespie.this.A396EmprCod;
      this.aP1[0] = pdespie.this.AV15BarCod;
      this.aP2[0] = pdespie.this.AV16BarCodReo;
      this.aP3[0] = pdespie.this.AV17BarCodPar;
      this.aP4[0] = pdespie.this.AV18BarCodDes;
      this.aP5[0] = pdespie.this.AV19BarReoDes;
      this.aP6[0] = pdespie.this.AV20BarParDes;
      this.aP7[0] = pdespie.this.AV21BarPie;
      this.aP8[0] = pdespie.this.AV22BarKgm;
      this.aP9[0] = pdespie.this.AV23BarMtr;
      this.aP10[0] = pdespie.this.AV24Tipo;
      this.aP11[0] = pdespie.this.AV25DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdespie");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60Station = "" ;
      AV61EmprNom = "" ;
      AV62UsurCod = "" ;
      GXv_int5 = new byte[1] ;
      AV55ContDsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV30KilosR = DecimalUtil.ZERO ;
      AV31MetrosR = DecimalUtil.ZERO ;
      AV28Kilos2 = DecimalUtil.ZERO ;
      AV29Metros2 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P009A2_A396EmprCod = new String[] {""} ;
      P009A2_A1501BarPiePie = new int[1] ;
      P009A2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_A130BarCodPar = new String[] {""} ;
      P009A2_A132BarCodReo = new byte[1] ;
      P009A2_A129BarCod = new int[1] ;
      P009A2_A13988BarPieVtx = new String[] {""} ;
      P009A2_A13519BarPieMq = new String[] {""} ;
      P009A2_n13519BarPieMq = new boolean[] {false} ;
      P009A2_A13518BarPieTurn = new byte[1] ;
      P009A2_n13518BarPieTurn = new boolean[] {false} ;
      P009A2_A13109BarPieST = new String[] {""} ;
      P009A2_n13109BarPieST = new boolean[] {false} ;
      P009A2_A13108BarPieLote = new String[] {""} ;
      P009A2_n13108BarPieLote = new boolean[] {false} ;
      P009A2_A13107BarPieEmp = new short[1] ;
      P009A2_n13107BarPieEmp = new boolean[] {false} ;
      P009A2_A13004BarPieDest = new byte[1] ;
      P009A2_n13004BarPieDest = new boolean[] {false} ;
      P009A2_A12992BarPieOpe = new int[1] ;
      P009A2_n12992BarPieOpe = new boolean[] {false} ;
      P009A2_A12936BarPieSecu = new String[] {""} ;
      P009A2_n12936BarPieSecu = new boolean[] {false} ;
      P009A2_A12935BarPieTono = new String[] {""} ;
      P009A2_n12935BarPieTono = new boolean[] {false} ;
      P009A2_A12928BarPieEncC = new String[] {""} ;
      P009A2_n12928BarPieEncC = new boolean[] {false} ;
      P009A2_A12927BarPieCoCN = new int[1] ;
      P009A2_n12927BarPieCoCN = new boolean[] {false} ;
      P009A2_A12926BarPieCoCI = new String[] {""} ;
      P009A2_n12926BarPieCoCI = new boolean[] {false} ;
      P009A2_A12925BarPieCliN = new String[] {""} ;
      P009A2_n12925BarPieCliN = new boolean[] {false} ;
      P009A2_A12924BarPieCliI = new int[1] ;
      P009A2_n12924BarPieCliI = new boolean[] {false} ;
      P009A2_A12923BarPieArtD = new String[] {""} ;
      P009A2_n12923BarPieArtD = new boolean[] {false} ;
      P009A2_A12922BarPieArtI = new String[] {""} ;
      P009A2_n12922BarPieArtI = new boolean[] {false} ;
      P009A2_A12921BarPieColN = new int[1] ;
      P009A2_n12921BarPieColN = new boolean[] {false} ;
      P009A2_A12920BarPieColD = new String[] {""} ;
      P009A2_n12920BarPieColD = new boolean[] {false} ;
      P009A2_A12912BarPieUltD = new short[1] ;
      P009A2_n12912BarPieUltD = new boolean[] {false} ;
      P009A2_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P009A2_n12911BarPieFep = new boolean[] {false} ;
      P009A2_A12780BarPieUsu = new String[] {""} ;
      P009A2_n12780BarPieUsu = new boolean[] {false} ;
      P009A2_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      P009A2_n12779BarPieFdv = new boolean[] {false} ;
      P009A2_A12113BarPieCLd = new byte[1] ;
      P009A2_n12113BarPieCLd = new boolean[] {false} ;
      P009A2_A1642BarPieOrd = new int[1] ;
      P009A2_n1642BarPieOrd = new boolean[] {false} ;
      P009A2_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n6473BarUniB = new boolean[] {false} ;
      P009A2_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n6472BarTara = new boolean[] {false} ;
      P009A2_A1919BarPieObs = new String[] {""} ;
      P009A2_n1919BarPieObs = new boolean[] {false} ;
      P009A2_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n9984BarPiePda = new boolean[] {false} ;
      P009A2_A9846BarPieAncc = new short[1] ;
      P009A2_n9846BarPieAncc = new boolean[] {false} ;
      P009A2_A9800BarNPes = new byte[1] ;
      P009A2_n9800BarNPes = new boolean[] {false} ;
      P009A2_A9799BarPz2 = new int[1] ;
      P009A2_n9799BarPz2 = new boolean[] {false} ;
      P009A2_A9798BarPz1 = new int[1] ;
      P009A2_n9798BarPz1 = new boolean[] {false} ;
      P009A2_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n9796BarPieK2 = new boolean[] {false} ;
      P009A2_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n9795BarPieK1 = new boolean[] {false} ;
      P009A2_A8907PzaB80 = new String[] {""} ;
      P009A2_n8907PzaB80 = new boolean[] {false} ;
      P009A2_A8838CodBarPz = new String[] {""} ;
      P009A2_n8838CodBarPz = new boolean[] {false} ;
      P009A2_A8707BapieObs = new String[] {""} ;
      P009A2_n8707BapieObs = new boolean[] {false} ;
      P009A2_A6489BarPieIdPz = new String[] {""} ;
      P009A2_n6489BarPieIdPz = new boolean[] {false} ;
      P009A2_A6116BarPieImp = new String[] {""} ;
      P009A2_n6116BarPieImp = new boolean[] {false} ;
      P009A2_A3277BarPieAut = new short[1] ;
      P009A2_n3277BarPieAut = new boolean[] {false} ;
      P009A2_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n3276BarMtsAut = new boolean[] {false} ;
      P009A2_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n3275BarKgsAut = new boolean[] {false} ;
      P009A2_A2186BarPieLoc = new String[] {""} ;
      P009A2_n2186BarPieLoc = new boolean[] {false} ;
      P009A2_A1691BarPieAnc = new short[1] ;
      P009A2_n1691BarPieAnc = new boolean[] {false} ;
      P009A2_A1271BarPieLzd = new int[1] ;
      P009A2_A908PieOriCod = new String[] {""} ;
      P009A2_A197BarPConTro = new short[1] ;
      P009A2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_A201BarPieEst = new byte[1] ;
      P009A2_A44AlbRecCod = new int[1] ;
      P009A2_A200BarPieCod = new String[] {""} ;
      P009A2_A3701PiezasUti = new short[1] ;
      P009A2_n3701PiezasUti = new boolean[] {false} ;
      P009A2_A3700MetrosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n3700MetrosUti = new boolean[] {false} ;
      P009A2_A3699KilosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A2_n3699KilosUti = new boolean[] {false} ;
      P009A2_A361DisCod = new int[1] ;
      P009A2_A228BarUniMed = new String[] {""} ;
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
      A3700MetrosUti = DecimalUtil.ZERO ;
      A3699KilosUti = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      W130BarCodPar = "" ;
      AV26Kilos = DecimalUtil.ZERO ;
      AV27Metros = DecimalUtil.ZERO ;
      W595Kilos = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      W631Metros = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      W203BarPieKil = DecimalUtil.ZERO ;
      W205BarPieMet = DecimalUtil.ZERO ;
      AV59Inc_obs = "" ;
      AV73Pgmname = "" ;
      P009A11_A396EmprCod = new String[] {""} ;
      P009A11_A130BarCodPar = new String[] {""} ;
      P009A11_A132BarCodReo = new byte[1] ;
      P009A11_A129BarCod = new int[1] ;
      P009A11_A212BarSer = new String[] {""} ;
      P009A11_A252CliCod = new int[1] ;
      P009A11_n252CliCod = new boolean[] {false} ;
      P009A11_A966PartCod = new String[] {""} ;
      P009A11_n966PartCod = new boolean[] {false} ;
      P009A11_A361DisCod = new int[1] ;
      P009A11_A5253BarAcc = new String[] {""} ;
      A212BarSer = "" ;
      A966PartCod = "" ;
      A5253BarAcc = "" ;
      AV49PartCod = "" ;
      P009A12_A396EmprCod = new String[] {""} ;
      P009A12_A130BarCodPar = new String[] {""} ;
      P009A12_A132BarCodReo = new byte[1] ;
      P009A12_A129BarCod = new int[1] ;
      P009A12_A212BarSer = new String[] {""} ;
      P009A12_A252CliCod = new int[1] ;
      P009A12_n252CliCod = new boolean[] {false} ;
      P009A12_A966PartCod = new String[] {""} ;
      P009A12_n966PartCod = new boolean[] {false} ;
      P009A12_A361DisCod = new int[1] ;
      P009A12_A5253BarAcc = new String[] {""} ;
      P009A13_A361DisCod = new int[1] ;
      P009A13_A396EmprCod = new String[] {""} ;
      P009A13_A130BarCodPar = new String[] {""} ;
      P009A13_A132BarCodReo = new byte[1] ;
      P009A13_A129BarCod = new int[1] ;
      P009A14_A374DisNumPie = new short[1] ;
      P009A14_A392DisUniMed = new String[] {""} ;
      P009A14_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A392DisUniMed = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      P009A16_A396EmprCod = new String[] {""} ;
      P009A16_A130BarCodPar = new String[] {""} ;
      P009A16_A132BarCodReo = new byte[1] ;
      P009A16_A129BarCod = new int[1] ;
      P009A16_A228BarUniMed = new String[] {""} ;
      P009A16_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A192BarNumUni = DecimalUtil.ZERO ;
      P009A18_A396EmprCod = new String[] {""} ;
      P009A18_A44AlbRecCod = new int[1] ;
      P009A18_A361DisCod = new int[1] ;
      P009A18_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A18_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A18_A673Piezas = new int[1] ;
      P009A19_A392DisUniMed = new String[] {""} ;
      P009A19_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A19_A374DisNumPie = new short[1] ;
      P009A24_A396EmprCod = new String[] {""} ;
      P009A24_A981PartAlbDis = new int[1] ;
      P009A24_n981PartAlbDis = new boolean[] {false} ;
      P009A24_A980PartLinTip = new String[] {""} ;
      P009A24_n980PartLinTip = new boolean[] {false} ;
      P009A24_A252CliCod = new int[1] ;
      P009A24_n252CliCod = new boolean[] {false} ;
      P009A24_A966PartCod = new String[] {""} ;
      P009A24_n966PartCod = new boolean[] {false} ;
      P009A24_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A24_n986KilUti = new boolean[] {false} ;
      P009A24_A987ConUti = new short[1] ;
      P009A24_n987ConUti = new boolean[] {false} ;
      P009A24_A979PartLin = new int[1] ;
      A980PartLinTip = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      P009A26_A396EmprCod = new String[] {""} ;
      P009A26_A981PartAlbDis = new int[1] ;
      P009A26_n981PartAlbDis = new boolean[] {false} ;
      P009A26_A980PartLinTip = new String[] {""} ;
      P009A26_n980PartLinTip = new boolean[] {false} ;
      P009A26_A252CliCod = new int[1] ;
      P009A26_n252CliCod = new boolean[] {false} ;
      P009A26_A966PartCod = new String[] {""} ;
      P009A26_n966PartCod = new boolean[] {false} ;
      P009A26_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009A26_n986KilUti = new boolean[] {false} ;
      P009A26_A987ConUti = new short[1] ;
      P009A26_n987ConUti = new boolean[] {false} ;
      P009A26_A979PartLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdespie__default(),
         new Object[] {
             new Object[] {
            P009A2_A396EmprCod, P009A2_A1501BarPiePie, P009A2_A205BarPieMet, P009A2_A203BarPieKil, P009A2_A130BarCodPar, P009A2_A132BarCodReo, P009A2_A129BarCod, P009A2_A13988BarPieVtx, P009A2_A13519BarPieMq, P009A2_n13519BarPieMq,
            P009A2_A13518BarPieTurn, P009A2_n13518BarPieTurn, P009A2_A13109BarPieST, P009A2_n13109BarPieST, P009A2_A13108BarPieLote, P009A2_n13108BarPieLote, P009A2_A13107BarPieEmp, P009A2_n13107BarPieEmp, P009A2_A13004BarPieDest, P009A2_n13004BarPieDest,
            P009A2_A12992BarPieOpe, P009A2_n12992BarPieOpe, P009A2_A12936BarPieSecu, P009A2_n12936BarPieSecu, P009A2_A12935BarPieTono, P009A2_n12935BarPieTono, P009A2_A12928BarPieEncC, P009A2_n12928BarPieEncC, P009A2_A12927BarPieCoCN, P009A2_n12927BarPieCoCN,
            P009A2_A12926BarPieCoCI, P009A2_n12926BarPieCoCI, P009A2_A12925BarPieCliN, P009A2_n12925BarPieCliN, P009A2_A12924BarPieCliI, P009A2_n12924BarPieCliI, P009A2_A12923BarPieArtD, P009A2_n12923BarPieArtD, P009A2_A12922BarPieArtI, P009A2_n12922BarPieArtI,
            P009A2_A12921BarPieColN, P009A2_n12921BarPieColN, P009A2_A12920BarPieColD, P009A2_n12920BarPieColD, P009A2_A12912BarPieUltD, P009A2_n12912BarPieUltD, P009A2_A12911BarPieFep, P009A2_n12911BarPieFep, P009A2_A12780BarPieUsu, P009A2_n12780BarPieUsu,
            P009A2_A12779BarPieFdv, P009A2_n12779BarPieFdv, P009A2_A12113BarPieCLd, P009A2_n12113BarPieCLd, P009A2_A1642BarPieOrd, P009A2_n1642BarPieOrd, P009A2_A6473BarUniB, P009A2_n6473BarUniB, P009A2_A6472BarTara, P009A2_n6472BarTara,
            P009A2_A1919BarPieObs, P009A2_n1919BarPieObs, P009A2_A9984BarPiePda, P009A2_n9984BarPiePda, P009A2_A9846BarPieAncc, P009A2_n9846BarPieAncc, P009A2_A9800BarNPes, P009A2_n9800BarNPes, P009A2_A9799BarPz2, P009A2_n9799BarPz2,
            P009A2_A9798BarPz1, P009A2_n9798BarPz1, P009A2_A9796BarPieK2, P009A2_n9796BarPieK2, P009A2_A9795BarPieK1, P009A2_n9795BarPieK1, P009A2_A8907PzaB80, P009A2_n8907PzaB80, P009A2_A8838CodBarPz, P009A2_n8838CodBarPz,
            P009A2_A8707BapieObs, P009A2_n8707BapieObs, P009A2_A6489BarPieIdPz, P009A2_n6489BarPieIdPz, P009A2_A6116BarPieImp, P009A2_n6116BarPieImp, P009A2_A3277BarPieAut, P009A2_n3277BarPieAut, P009A2_A3276BarMtsAut, P009A2_n3276BarMtsAut,
            P009A2_A3275BarKgsAut, P009A2_n3275BarKgsAut, P009A2_A2186BarPieLoc, P009A2_n2186BarPieLoc, P009A2_A1691BarPieAnc, P009A2_n1691BarPieAnc, P009A2_A1271BarPieLzd, P009A2_A908PieOriCod, P009A2_A197BarPConTro, P009A2_A183BarMetLan,
            P009A2_A170BarKilLan, P009A2_A201BarPieEst, P009A2_A44AlbRecCod, P009A2_A200BarPieCod, P009A2_A3701PiezasUti, P009A2_n3701PiezasUti, P009A2_A3700MetrosUti, P009A2_n3700MetrosUti, P009A2_A3699KilosUti, P009A2_n3699KilosUti,
            P009A2_A361DisCod, P009A2_A228BarUniMed
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
            P009A11_A396EmprCod, P009A11_A130BarCodPar, P009A11_A132BarCodReo, P009A11_A129BarCod, P009A11_A212BarSer, P009A11_A252CliCod, P009A11_n252CliCod, P009A11_A966PartCod, P009A11_n966PartCod, P009A11_A361DisCod,
            P009A11_A5253BarAcc
            }
            , new Object[] {
            P009A12_A396EmprCod, P009A12_A130BarCodPar, P009A12_A132BarCodReo, P009A12_A129BarCod, P009A12_A212BarSer, P009A12_A252CliCod, P009A12_n252CliCod, P009A12_A966PartCod, P009A12_n966PartCod, P009A12_A361DisCod,
            P009A12_A5253BarAcc
            }
            , new Object[] {
            P009A13_A361DisCod, P009A13_A396EmprCod, P009A13_A130BarCodPar, P009A13_A132BarCodReo, P009A13_A129BarCod
            }
            , new Object[] {
            P009A14_A374DisNumPie, P009A14_A392DisUniMed, P009A14_A375DisNumUni
            }
            , new Object[] {
            }
            , new Object[] {
            P009A16_A396EmprCod, P009A16_A130BarCodPar, P009A16_A132BarCodReo, P009A16_A129BarCod, P009A16_A228BarUniMed, P009A16_A192BarNumUni
            }
            , new Object[] {
            }
            , new Object[] {
            P009A18_A396EmprCod, P009A18_A44AlbRecCod, P009A18_A361DisCod, P009A18_A631Metros, P009A18_A595Kilos, P009A18_A673Piezas
            }
            , new Object[] {
            P009A19_A392DisUniMed, P009A19_A375DisNumUni, P009A19_A374DisNumPie
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
            P009A24_A396EmprCod, P009A24_A981PartAlbDis, P009A24_n981PartAlbDis, P009A24_A980PartLinTip, P009A24_n980PartLinTip, P009A24_A252CliCod, P009A24_A966PartCod, P009A24_A986KilUti, P009A24_n986KilUti, P009A24_A987ConUti,
            P009A24_n987ConUti, P009A24_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P009A26_A396EmprCod, P009A26_A981PartAlbDis, P009A26_n981PartAlbDis, P009A26_A980PartLinTip, P009A26_n980PartLinTip, P009A26_A252CliCod, P009A26_A966PartCod, P009A26_A986KilUti, P009A26_n986KilUti, P009A26_A987ConUti,
            P009A26_n987ConUti, P009A26_A979PartLin
            }
            , new Object[] {
            }
         }
      );
      AV73Pgmname = "PDESPIE" ;
      /* GeneXus formulas. */
      AV73Pgmname = "PDESPIE" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV19BarReoDes ;
   private byte AV44FlagHil ;
   private byte AV51FlagJBP ;
   private byte AV52F_induyco ;
   private byte GXv_int5[] ;
   private byte AV39Flag ;
   private byte A132BarCodReo ;
   private byte A13518BarPieTurn ;
   private byte A13004BarPieDest ;
   private byte A12113BarPieCLd ;
   private byte A9800BarNPes ;
   private byte A201BarPieEst ;
   private byte W132BarCodReo ;
   private short AV65deletebarpie ;
   private short AV67disalb ;
   private short AV68tbarpie ;
   private short AV69mbarpie ;
   private short A13107BarPieEmp ;
   private short A12912BarPieUltD ;
   private short A9846BarPieAncc ;
   private short A3277BarPieAut ;
   private short A1691BarPieAnc ;
   private short A197BarPConTro ;
   private short A3701PiezasUti ;
   private short Gx_err ;
   private short A374DisNumPie ;
   private short A987ConUti ;
   private int AV15BarCod ;
   private int AV18BarCodDes ;
   private int AV21BarPie ;
   private int AV25DisCod ;
   private int AV54CliPropio ;
   private int AV40PiezasR ;
   private int AV34Piezas2 ;
   private int AV41Piezas3 ;
   private int A1501BarPiePie ;
   private int A129BarCod ;
   private int A12992BarPieOpe ;
   private int A12927BarPieCoCN ;
   private int A12924BarPieCliI ;
   private int A12921BarPieColN ;
   private int A1642BarPieOrd ;
   private int A9799BarPz2 ;
   private int A9798BarPz1 ;
   private int A1271BarPieLzd ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private int W129BarCod ;
   private int AV32AlbRecCod ;
   private int AV35DisAct ;
   private int GX_INS35 ;
   private int W361DisCod ;
   private int W44AlbRecCod ;
   private int W673Piezas ;
   private int A673Piezas ;
   private int GX_INS18 ;
   private int W1501BarPiePie ;
   private int A252CliCod ;
   private int AV48CliCod ;
   private int AV50DisCod1 ;
   private int AV53CliPdo ;
   private int AV38PieSal ;
   private int A981PartAlbDis ;
   private int A979PartLin ;
   private java.math.BigDecimal AV22BarKgm ;
   private java.math.BigDecimal AV23BarMtr ;
   private java.math.BigDecimal AV30KilosR ;
   private java.math.BigDecimal AV31MetrosR ;
   private java.math.BigDecimal AV28Kilos2 ;
   private java.math.BigDecimal AV29Metros2 ;
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
   private java.math.BigDecimal A3700MetrosUti ;
   private java.math.BigDecimal A3699KilosUti ;
   private java.math.BigDecimal AV26Kilos ;
   private java.math.BigDecimal AV27Metros ;
   private java.math.BigDecimal W595Kilos ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal W631Metros ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal W203BarPieKil ;
   private java.math.BigDecimal W205BarPieMet ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A986KilUti ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV20BarParDes ;
   private String AV24Tipo ;
   private String AV60Station ;
   private String AV61EmprNom ;
   private String AV62UsurCod ;
   private String AV55ContDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
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
   private String A228BarUniMed ;
   private String W130BarCodPar ;
   private String Gx_emsg ;
   private String AV73Pgmname ;
   private String A212BarSer ;
   private String A966PartCod ;
   private String A5253BarAcc ;
   private String AV49PartCod ;
   private String A392DisUniMed ;
   private String A980PartLinTip ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date A12779BarPieFdv ;
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
   private boolean n3701PiezasUti ;
   private boolean n3700MetrosUti ;
   private boolean n3699KilosUti ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n981PartAlbDis ;
   private boolean n980PartLinTip ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private String AV59Inc_obs ;
   private int[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P009A2_A396EmprCod ;
   private int[] P009A2_A1501BarPiePie ;
   private java.math.BigDecimal[] P009A2_A205BarPieMet ;
   private java.math.BigDecimal[] P009A2_A203BarPieKil ;
   private String[] P009A2_A130BarCodPar ;
   private byte[] P009A2_A132BarCodReo ;
   private int[] P009A2_A129BarCod ;
   private String[] P009A2_A13988BarPieVtx ;
   private String[] P009A2_A13519BarPieMq ;
   private boolean[] P009A2_n13519BarPieMq ;
   private byte[] P009A2_A13518BarPieTurn ;
   private boolean[] P009A2_n13518BarPieTurn ;
   private String[] P009A2_A13109BarPieST ;
   private boolean[] P009A2_n13109BarPieST ;
   private String[] P009A2_A13108BarPieLote ;
   private boolean[] P009A2_n13108BarPieLote ;
   private short[] P009A2_A13107BarPieEmp ;
   private boolean[] P009A2_n13107BarPieEmp ;
   private byte[] P009A2_A13004BarPieDest ;
   private boolean[] P009A2_n13004BarPieDest ;
   private int[] P009A2_A12992BarPieOpe ;
   private boolean[] P009A2_n12992BarPieOpe ;
   private String[] P009A2_A12936BarPieSecu ;
   private boolean[] P009A2_n12936BarPieSecu ;
   private String[] P009A2_A12935BarPieTono ;
   private boolean[] P009A2_n12935BarPieTono ;
   private String[] P009A2_A12928BarPieEncC ;
   private boolean[] P009A2_n12928BarPieEncC ;
   private int[] P009A2_A12927BarPieCoCN ;
   private boolean[] P009A2_n12927BarPieCoCN ;
   private String[] P009A2_A12926BarPieCoCI ;
   private boolean[] P009A2_n12926BarPieCoCI ;
   private String[] P009A2_A12925BarPieCliN ;
   private boolean[] P009A2_n12925BarPieCliN ;
   private int[] P009A2_A12924BarPieCliI ;
   private boolean[] P009A2_n12924BarPieCliI ;
   private String[] P009A2_A12923BarPieArtD ;
   private boolean[] P009A2_n12923BarPieArtD ;
   private String[] P009A2_A12922BarPieArtI ;
   private boolean[] P009A2_n12922BarPieArtI ;
   private int[] P009A2_A12921BarPieColN ;
   private boolean[] P009A2_n12921BarPieColN ;
   private String[] P009A2_A12920BarPieColD ;
   private boolean[] P009A2_n12920BarPieColD ;
   private short[] P009A2_A12912BarPieUltD ;
   private boolean[] P009A2_n12912BarPieUltD ;
   private java.util.Date[] P009A2_A12911BarPieFep ;
   private boolean[] P009A2_n12911BarPieFep ;
   private String[] P009A2_A12780BarPieUsu ;
   private boolean[] P009A2_n12780BarPieUsu ;
   private java.util.Date[] P009A2_A12779BarPieFdv ;
   private boolean[] P009A2_n12779BarPieFdv ;
   private byte[] P009A2_A12113BarPieCLd ;
   private boolean[] P009A2_n12113BarPieCLd ;
   private int[] P009A2_A1642BarPieOrd ;
   private boolean[] P009A2_n1642BarPieOrd ;
   private java.math.BigDecimal[] P009A2_A6473BarUniB ;
   private boolean[] P009A2_n6473BarUniB ;
   private java.math.BigDecimal[] P009A2_A6472BarTara ;
   private boolean[] P009A2_n6472BarTara ;
   private String[] P009A2_A1919BarPieObs ;
   private boolean[] P009A2_n1919BarPieObs ;
   private java.math.BigDecimal[] P009A2_A9984BarPiePda ;
   private boolean[] P009A2_n9984BarPiePda ;
   private short[] P009A2_A9846BarPieAncc ;
   private boolean[] P009A2_n9846BarPieAncc ;
   private byte[] P009A2_A9800BarNPes ;
   private boolean[] P009A2_n9800BarNPes ;
   private int[] P009A2_A9799BarPz2 ;
   private boolean[] P009A2_n9799BarPz2 ;
   private int[] P009A2_A9798BarPz1 ;
   private boolean[] P009A2_n9798BarPz1 ;
   private java.math.BigDecimal[] P009A2_A9796BarPieK2 ;
   private boolean[] P009A2_n9796BarPieK2 ;
   private java.math.BigDecimal[] P009A2_A9795BarPieK1 ;
   private boolean[] P009A2_n9795BarPieK1 ;
   private String[] P009A2_A8907PzaB80 ;
   private boolean[] P009A2_n8907PzaB80 ;
   private String[] P009A2_A8838CodBarPz ;
   private boolean[] P009A2_n8838CodBarPz ;
   private String[] P009A2_A8707BapieObs ;
   private boolean[] P009A2_n8707BapieObs ;
   private String[] P009A2_A6489BarPieIdPz ;
   private boolean[] P009A2_n6489BarPieIdPz ;
   private String[] P009A2_A6116BarPieImp ;
   private boolean[] P009A2_n6116BarPieImp ;
   private short[] P009A2_A3277BarPieAut ;
   private boolean[] P009A2_n3277BarPieAut ;
   private java.math.BigDecimal[] P009A2_A3276BarMtsAut ;
   private boolean[] P009A2_n3276BarMtsAut ;
   private java.math.BigDecimal[] P009A2_A3275BarKgsAut ;
   private boolean[] P009A2_n3275BarKgsAut ;
   private String[] P009A2_A2186BarPieLoc ;
   private boolean[] P009A2_n2186BarPieLoc ;
   private short[] P009A2_A1691BarPieAnc ;
   private boolean[] P009A2_n1691BarPieAnc ;
   private int[] P009A2_A1271BarPieLzd ;
   private String[] P009A2_A908PieOriCod ;
   private short[] P009A2_A197BarPConTro ;
   private java.math.BigDecimal[] P009A2_A183BarMetLan ;
   private java.math.BigDecimal[] P009A2_A170BarKilLan ;
   private byte[] P009A2_A201BarPieEst ;
   private int[] P009A2_A44AlbRecCod ;
   private String[] P009A2_A200BarPieCod ;
   private short[] P009A2_A3701PiezasUti ;
   private boolean[] P009A2_n3701PiezasUti ;
   private java.math.BigDecimal[] P009A2_A3700MetrosUti ;
   private boolean[] P009A2_n3700MetrosUti ;
   private java.math.BigDecimal[] P009A2_A3699KilosUti ;
   private boolean[] P009A2_n3699KilosUti ;
   private int[] P009A2_A361DisCod ;
   private String[] P009A2_A228BarUniMed ;
   private String[] P009A11_A396EmprCod ;
   private String[] P009A11_A130BarCodPar ;
   private byte[] P009A11_A132BarCodReo ;
   private int[] P009A11_A129BarCod ;
   private String[] P009A11_A212BarSer ;
   private int[] P009A11_A252CliCod ;
   private boolean[] P009A11_n252CliCod ;
   private String[] P009A11_A966PartCod ;
   private boolean[] P009A11_n966PartCod ;
   private int[] P009A11_A361DisCod ;
   private String[] P009A11_A5253BarAcc ;
   private String[] P009A12_A396EmprCod ;
   private String[] P009A12_A130BarCodPar ;
   private byte[] P009A12_A132BarCodReo ;
   private int[] P009A12_A129BarCod ;
   private String[] P009A12_A212BarSer ;
   private int[] P009A12_A252CliCod ;
   private boolean[] P009A12_n252CliCod ;
   private String[] P009A12_A966PartCod ;
   private boolean[] P009A12_n966PartCod ;
   private int[] P009A12_A361DisCod ;
   private String[] P009A12_A5253BarAcc ;
   private int[] P009A13_A361DisCod ;
   private String[] P009A13_A396EmprCod ;
   private String[] P009A13_A130BarCodPar ;
   private byte[] P009A13_A132BarCodReo ;
   private int[] P009A13_A129BarCod ;
   private short[] P009A14_A374DisNumPie ;
   private String[] P009A14_A392DisUniMed ;
   private java.math.BigDecimal[] P009A14_A375DisNumUni ;
   private String[] P009A16_A396EmprCod ;
   private String[] P009A16_A130BarCodPar ;
   private byte[] P009A16_A132BarCodReo ;
   private int[] P009A16_A129BarCod ;
   private String[] P009A16_A228BarUniMed ;
   private java.math.BigDecimal[] P009A16_A192BarNumUni ;
   private String[] P009A18_A396EmprCod ;
   private int[] P009A18_A44AlbRecCod ;
   private int[] P009A18_A361DisCod ;
   private java.math.BigDecimal[] P009A18_A631Metros ;
   private java.math.BigDecimal[] P009A18_A595Kilos ;
   private int[] P009A18_A673Piezas ;
   private String[] P009A19_A392DisUniMed ;
   private java.math.BigDecimal[] P009A19_A375DisNumUni ;
   private short[] P009A19_A374DisNumPie ;
   private String[] P009A24_A396EmprCod ;
   private int[] P009A24_A981PartAlbDis ;
   private boolean[] P009A24_n981PartAlbDis ;
   private String[] P009A24_A980PartLinTip ;
   private boolean[] P009A24_n980PartLinTip ;
   private int[] P009A24_A252CliCod ;
   private boolean[] P009A24_n252CliCod ;
   private String[] P009A24_A966PartCod ;
   private boolean[] P009A24_n966PartCod ;
   private java.math.BigDecimal[] P009A24_A986KilUti ;
   private boolean[] P009A24_n986KilUti ;
   private short[] P009A24_A987ConUti ;
   private boolean[] P009A24_n987ConUti ;
   private int[] P009A24_A979PartLin ;
   private String[] P009A26_A396EmprCod ;
   private int[] P009A26_A981PartAlbDis ;
   private boolean[] P009A26_n981PartAlbDis ;
   private String[] P009A26_A980PartLinTip ;
   private boolean[] P009A26_n980PartLinTip ;
   private int[] P009A26_A252CliCod ;
   private boolean[] P009A26_n252CliCod ;
   private String[] P009A26_A966PartCod ;
   private boolean[] P009A26_n966PartCod ;
   private java.math.BigDecimal[] P009A26_A986KilUti ;
   private boolean[] P009A26_n986KilUti ;
   private short[] P009A26_A987ConUti ;
   private boolean[] P009A26_n987ConUti ;
   private int[] P009A26_A979PartLin ;
}

final  class pdespie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P009A2", "SELECT T1.EmprCod, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarPieVtx, T1.BarPieMq, T1.BarPieTurn, T1.BarPieST, T1.BarPieLote, T1.BarPieEmp, T1.BarPieDest, T1.BarPieOpe, T1.BarPieSecu, T1.BarPieTono, T1.BarPieEncC, T1.BarPieCoCN, T1.BarPieCoCI, T1.BarPieCliN, T1.BarPieCliI, T1.BarPieArtD, T1.BarPieArtI, T1.BarPieColN, T1.BarPieColD, T1.BarPieUltD, T1.BarPieFep, T1.BarPieUsu, T1.BarPieFdv, T1.BarPieCLd, T1.BarPieOrd, T1.BarUniB, T1.BarTara, T1.BarPieObs, T1.BarPiePda, T1.BarPieAncc, T1.BarNPes, T1.BarPz2, T1.BarPz1, T1.BarPieK2, T1.BarPieK1, T1.PzaB80, T1.CodBarPz, T1.BapieObs, T1.BarPieIdPz, T1.BarPieImp, T1.BarPieAut, T1.BarMtsAut, T1.BarKgsAut, T1.BarPieLoc, T1.BarPieAnc, T1.BarPieLzd, T1.PieOriCod, T1.BarPConTro, T1.BarMetLan, T1.BarKilLan, T1.BarPieEst, T1.AlbRecCod, T1.BarPieCod, T3.PiezasUti, T3.MetrosUti, T3.KilosUti, T2.DisCod, T2.BarUniMed FROM ((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISALB T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod AND T3.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009A3", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009A4", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009A5", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009A6", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009A7", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P009A8", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009A9", "UPDATE TXPBARPIE SET BarPiePie=?, BarPieMet=?, BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009A10", "UPDATE TXPBARPIE SET BarPiePie=?, BarPieMet=?, BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P009A11", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSer, T1.CliCod, T2.PartCod, T1.DisCod, T1.BarAcc FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009A12", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSer, T1.CliCod, T2.PartCod, T1.DisCod, T1.BarAcc FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009A13", "SELECT DisCod, EmprCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009A14", "SELECT DisNumPie, DisUniMed, DisNumUni FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009A15", "UPDATE TXPDISPOS SET DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P009A16", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarUniMed, BarNumUni FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009A17", "UPDATE TXPBARCAD SET BarNumUni=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P009A18", "SELECT EmprCod, AlbRecCod, DisCod, Metros, Kilos, Piezas FROM TXPDISALB WHERE (EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) AND (EmprCod = ? and DisCod = ? and AlbRecCod = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P009A19", "SELECT DisUniMed, DisNumUni, DisNumPie FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009A20", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P009A21", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P009A22", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P009A23", "UPDATE TXPDISALB SET Metros=?, Kilos=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P009A24", "SELECT EmprCod, PartAlbDis, PartLinTip, CliCod, PartCod, KilUti, ConUti, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod, PartLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009A25", "UPDATE TXPLPARTI SET KilUti=?, ConUti=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P009A26", "SELECT EmprCod, PartAlbDis, PartLinTip, CliCod, PartCod, KilUti, ConUti, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod, PartLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009A27", "UPDATE TXPLPARTI SET KilUti=?, ConUti=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 13);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(21, 60);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(22);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(23, 26);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(25);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(26, 13);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(27);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(29, 10);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDate(30);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((byte[]) buf[52])[0] = rslt.getByte(31);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(32);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(35, 60);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(37);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(38);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((int[]) buf[68])[0] = rslt.getInt(39);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(40);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(41,2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(43, 9);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(44, 20);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(45, 40);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(46, 15);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((short[]) buf[86])[0] = rslt.getShort(48);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[90])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(51, 10);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((short[]) buf[94])[0] = rslt.getShort(52);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((int[]) buf[96])[0] = rslt.getInt(53);
               ((String[]) buf[97])[0] = rslt.getString(54, 9);
               ((short[]) buf[98])[0] = rslt.getShort(55);
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(56,2);
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(57,2);
               ((byte[]) buf[101])[0] = rslt.getByte(58);
               ((int[]) buf[102])[0] = rslt.getInt(59);
               ((String[]) buf[103])[0] = rslt.getString(60, 9);
               ((short[]) buf[104])[0] = rslt.getShort(61);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[106])[0] = rslt.getBigDecimal(62,2);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[108])[0] = rslt.getBigDecimal(63,2);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((int[]) buf[110])[0] = rslt.getInt(64);
               ((String[]) buf[111])[0] = rslt.getString(65, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               return;
            case 6 :
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
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 21 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
      }
   }

}

