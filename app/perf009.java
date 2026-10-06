package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class perf009 extends GXProcedure
{
   public perf009( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( perf009.class ), "" );
   }

   public perf009( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      perf009.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      perf009.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      perf009.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      perf009.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      perf009.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      perf009.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03D93 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6489BarPieIdPz = P03D93_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = P03D93_n6489BarPieIdPz[0] ;
         A6116BarPieImp = P03D93_A6116BarPieImp[0] ;
         n6116BarPieImp = P03D93_n6116BarPieImp[0] ;
         A3277BarPieAut = P03D93_A3277BarPieAut[0] ;
         n3277BarPieAut = P03D93_n3277BarPieAut[0] ;
         A3276BarMtsAut = P03D93_A3276BarMtsAut[0] ;
         n3276BarMtsAut = P03D93_n3276BarMtsAut[0] ;
         A3275BarKgsAut = P03D93_A3275BarKgsAut[0] ;
         n3275BarKgsAut = P03D93_n3275BarKgsAut[0] ;
         A2186BarPieLoc = P03D93_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P03D93_n2186BarPieLoc[0] ;
         A1691BarPieAnc = P03D93_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P03D93_n1691BarPieAnc[0] ;
         A1271BarPieLzd = P03D93_A1271BarPieLzd[0] ;
         A908PieOriCod = P03D93_A908PieOriCod[0] ;
         A197BarPConTro = P03D93_A197BarPConTro[0] ;
         A183BarMetLan = P03D93_A183BarMetLan[0] ;
         A170BarKilLan = P03D93_A170BarKilLan[0] ;
         A201BarPieEst = P03D93_A201BarPieEst[0] ;
         A205BarPieMet = P03D93_A205BarPieMet[0] ;
         A44AlbRecCod = P03D93_A44AlbRecCod[0] ;
         A13988BarPieVtx = P03D93_A13988BarPieVtx[0] ;
         A13519BarPieMq = P03D93_A13519BarPieMq[0] ;
         n13519BarPieMq = P03D93_n13519BarPieMq[0] ;
         A13518BarPieTurn = P03D93_A13518BarPieTurn[0] ;
         n13518BarPieTurn = P03D93_n13518BarPieTurn[0] ;
         A13109BarPieST = P03D93_A13109BarPieST[0] ;
         n13109BarPieST = P03D93_n13109BarPieST[0] ;
         A13108BarPieLote = P03D93_A13108BarPieLote[0] ;
         n13108BarPieLote = P03D93_n13108BarPieLote[0] ;
         A13107BarPieEmp = P03D93_A13107BarPieEmp[0] ;
         n13107BarPieEmp = P03D93_n13107BarPieEmp[0] ;
         A13004BarPieDest = P03D93_A13004BarPieDest[0] ;
         n13004BarPieDest = P03D93_n13004BarPieDest[0] ;
         A12992BarPieOpe = P03D93_A12992BarPieOpe[0] ;
         n12992BarPieOpe = P03D93_n12992BarPieOpe[0] ;
         A12936BarPieSecu = P03D93_A12936BarPieSecu[0] ;
         n12936BarPieSecu = P03D93_n12936BarPieSecu[0] ;
         A12935BarPieTono = P03D93_A12935BarPieTono[0] ;
         n12935BarPieTono = P03D93_n12935BarPieTono[0] ;
         A12928BarPieEncC = P03D93_A12928BarPieEncC[0] ;
         n12928BarPieEncC = P03D93_n12928BarPieEncC[0] ;
         A12927BarPieCoCN = P03D93_A12927BarPieCoCN[0] ;
         n12927BarPieCoCN = P03D93_n12927BarPieCoCN[0] ;
         A12926BarPieCoCI = P03D93_A12926BarPieCoCI[0] ;
         n12926BarPieCoCI = P03D93_n12926BarPieCoCI[0] ;
         A12925BarPieCliN = P03D93_A12925BarPieCliN[0] ;
         n12925BarPieCliN = P03D93_n12925BarPieCliN[0] ;
         A12924BarPieCliI = P03D93_A12924BarPieCliI[0] ;
         n12924BarPieCliI = P03D93_n12924BarPieCliI[0] ;
         A12923BarPieArtD = P03D93_A12923BarPieArtD[0] ;
         n12923BarPieArtD = P03D93_n12923BarPieArtD[0] ;
         A12922BarPieArtI = P03D93_A12922BarPieArtI[0] ;
         n12922BarPieArtI = P03D93_n12922BarPieArtI[0] ;
         A12921BarPieColN = P03D93_A12921BarPieColN[0] ;
         n12921BarPieColN = P03D93_n12921BarPieColN[0] ;
         A12920BarPieColD = P03D93_A12920BarPieColD[0] ;
         n12920BarPieColD = P03D93_n12920BarPieColD[0] ;
         A12912BarPieUltD = P03D93_A12912BarPieUltD[0] ;
         n12912BarPieUltD = P03D93_n12912BarPieUltD[0] ;
         A12911BarPieFep = P03D93_A12911BarPieFep[0] ;
         n12911BarPieFep = P03D93_n12911BarPieFep[0] ;
         A12780BarPieUsu = P03D93_A12780BarPieUsu[0] ;
         n12780BarPieUsu = P03D93_n12780BarPieUsu[0] ;
         A12779BarPieFdv = P03D93_A12779BarPieFdv[0] ;
         n12779BarPieFdv = P03D93_n12779BarPieFdv[0] ;
         A12113BarPieCLd = P03D93_A12113BarPieCLd[0] ;
         n12113BarPieCLd = P03D93_n12113BarPieCLd[0] ;
         A1642BarPieOrd = P03D93_A1642BarPieOrd[0] ;
         n1642BarPieOrd = P03D93_n1642BarPieOrd[0] ;
         A6473BarUniB = P03D93_A6473BarUniB[0] ;
         n6473BarUniB = P03D93_n6473BarUniB[0] ;
         A6472BarTara = P03D93_A6472BarTara[0] ;
         n6472BarTara = P03D93_n6472BarTara[0] ;
         A1919BarPieObs = P03D93_A1919BarPieObs[0] ;
         n1919BarPieObs = P03D93_n1919BarPieObs[0] ;
         A9984BarPiePda = P03D93_A9984BarPiePda[0] ;
         n9984BarPiePda = P03D93_n9984BarPiePda[0] ;
         A9846BarPieAncc = P03D93_A9846BarPieAncc[0] ;
         n9846BarPieAncc = P03D93_n9846BarPieAncc[0] ;
         A9800BarNPes = P03D93_A9800BarNPes[0] ;
         n9800BarNPes = P03D93_n9800BarNPes[0] ;
         A9799BarPz2 = P03D93_A9799BarPz2[0] ;
         n9799BarPz2 = P03D93_n9799BarPz2[0] ;
         A9798BarPz1 = P03D93_A9798BarPz1[0] ;
         n9798BarPz1 = P03D93_n9798BarPz1[0] ;
         A9796BarPieK2 = P03D93_A9796BarPieK2[0] ;
         n9796BarPieK2 = P03D93_n9796BarPieK2[0] ;
         A9795BarPieK1 = P03D93_A9795BarPieK1[0] ;
         n9795BarPieK1 = P03D93_n9795BarPieK1[0] ;
         A8907PzaB80 = P03D93_A8907PzaB80[0] ;
         n8907PzaB80 = P03D93_n8907PzaB80[0] ;
         A8838CodBarPz = P03D93_A8838CodBarPz[0] ;
         n8838CodBarPz = P03D93_n8838CodBarPz[0] ;
         A8707BapieObs = P03D93_A8707BapieObs[0] ;
         n8707BapieObs = P03D93_n8707BapieObs[0] ;
         A1501BarPiePie = P03D93_A1501BarPiePie[0] ;
         A203BarPieKil = P03D93_A203BarPieKil[0] ;
         A199BarPie1 = P03D93_A199BarPie1[0] ;
         A365DisDes = P03D93_A365DisDes[0] ;
         A898BarPieNDes = P03D93_A898BarPieNDes[0] ;
         A365DisDes = P03D93_A365DisDes[0] ;
         A199BarPie1 = P03D93_A199BarPie1[0] ;
         A898BarPieNDes = P03D93_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         AV8Albreccod = (int)(GXutil.lval( GXutil.substring( A6489BarPieIdPz, 1, 8))) ;
         AV9Barpiekil = A203BarPieKil ;
         AV10Barpie = A198BarPie ;
         /*
            INSERT RECORD ON TABLE TXPBARPIE

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W200BarPieCod = A200BarPieCod ;
         W44AlbRecCod = A44AlbRecCod ;
         W203BarPieKil = A203BarPieKil ;
         W205BarPieMet = A205BarPieMet ;
         W201BarPieEst = A201BarPieEst ;
         W170BarKilLan = A170BarKilLan ;
         W183BarMetLan = A183BarMetLan ;
         W197BarPConTro = A197BarPConTro ;
         W908PieOriCod = A908PieOriCod ;
         W1271BarPieLzd = A1271BarPieLzd ;
         W1501BarPiePie = A1501BarPiePie ;
         W1691BarPieAnc = A1691BarPieAnc ;
         n1691BarPieAnc = false ;
         W2186BarPieLoc = A2186BarPieLoc ;
         n2186BarPieLoc = false ;
         W3275BarKgsAut = A3275BarKgsAut ;
         n3275BarKgsAut = false ;
         W3276BarMtsAut = A3276BarMtsAut ;
         n3276BarMtsAut = false ;
         W3277BarPieAut = A3277BarPieAut ;
         n3277BarPieAut = false ;
         W6116BarPieImp = A6116BarPieImp ;
         n6116BarPieImp = false ;
         W6489BarPieIdPz = A6489BarPieIdPz ;
         n6489BarPieIdPz = false ;
         A200BarPieCod = GXutil.str( AV8Albreccod, 8, 0) ;
         A44AlbRecCod = AV8Albreccod ;
         A205BarPieMet = DecimalUtil.doubleToDec(0) ;
         A201BarPieEst = (byte)(0) ;
         A170BarKilLan = DecimalUtil.doubleToDec(0) ;
         A183BarMetLan = DecimalUtil.doubleToDec(0) ;
         A197BarPConTro = (short)(0) ;
         A908PieOriCod = " " ;
         A1271BarPieLzd = 0 ;
         A1691BarPieAnc = (short)(0) ;
         n1691BarPieAnc = false ;
         A2186BarPieLoc = httpContext.getMessage( "Sem TELA", "") ;
         n2186BarPieLoc = false ;
         A3275BarKgsAut = DecimalUtil.doubleToDec(0) ;
         n3275BarKgsAut = false ;
         A3276BarMtsAut = DecimalUtil.doubleToDec(0) ;
         n3276BarMtsAut = false ;
         A3277BarPieAut = (short)(0) ;
         n3277BarPieAut = false ;
         A6116BarPieImp = " " ;
         n6116BarPieImp = false ;
         A6489BarPieIdPz = " " ;
         n6489BarPieIdPz = false ;
         /* Using cursor P03D94 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, A13988BarPieVtx});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Optimized UPDATE. */
            /* Using cursor P03D95 */
            pr_default.execute(2, new Object[] {Integer.valueOf(AV10Barpie), AV9Barpiekil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
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
         A200BarPieCod = W200BarPieCod ;
         A44AlbRecCod = W44AlbRecCod ;
         A203BarPieKil = W203BarPieKil ;
         A205BarPieMet = W205BarPieMet ;
         A201BarPieEst = W201BarPieEst ;
         A170BarKilLan = W170BarKilLan ;
         A183BarMetLan = W183BarMetLan ;
         A197BarPConTro = W197BarPConTro ;
         A908PieOriCod = W908PieOriCod ;
         A1271BarPieLzd = W1271BarPieLzd ;
         A1501BarPiePie = W1501BarPiePie ;
         A1691BarPieAnc = W1691BarPieAnc ;
         n1691BarPieAnc = false ;
         A2186BarPieLoc = W2186BarPieLoc ;
         n2186BarPieLoc = false ;
         A3275BarKgsAut = W3275BarKgsAut ;
         n3275BarKgsAut = false ;
         A3276BarMtsAut = W3276BarMtsAut ;
         n3276BarMtsAut = false ;
         A3277BarPieAut = W3277BarPieAut ;
         n3277BarPieAut = false ;
         A6116BarPieImp = W6116BarPieImp ;
         n6116BarPieImp = false ;
         A6489BarPieIdPz = W6489BarPieIdPz ;
         n6489BarPieIdPz = false ;
         /* End Insert */
         A908PieOriCod = httpContext.getMessage( "Eliminar", "") ;
         /* Using cursor P03D96 */
         pr_default.execute(3, new Object[] {A908PieOriCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A200BarPieCod = W200BarPieCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = perf009.this.A396EmprCod;
      this.aP1[0] = perf009.this.A129BarCod;
      this.aP2[0] = perf009.this.A132BarCodReo;
      this.aP3[0] = perf009.this.A130BarCodPar;
      this.aP4[0] = perf009.this.A200BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "perf009");
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
      P03D93_A396EmprCod = new String[] {""} ;
      P03D93_A129BarCod = new int[1] ;
      P03D93_A132BarCodReo = new byte[1] ;
      P03D93_A130BarCodPar = new String[] {""} ;
      P03D93_A200BarPieCod = new String[] {""} ;
      P03D93_A6489BarPieIdPz = new String[] {""} ;
      P03D93_n6489BarPieIdPz = new boolean[] {false} ;
      P03D93_A6116BarPieImp = new String[] {""} ;
      P03D93_n6116BarPieImp = new boolean[] {false} ;
      P03D93_A3277BarPieAut = new short[1] ;
      P03D93_n3277BarPieAut = new boolean[] {false} ;
      P03D93_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_n3276BarMtsAut = new boolean[] {false} ;
      P03D93_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_n3275BarKgsAut = new boolean[] {false} ;
      P03D93_A2186BarPieLoc = new String[] {""} ;
      P03D93_n2186BarPieLoc = new boolean[] {false} ;
      P03D93_A1691BarPieAnc = new short[1] ;
      P03D93_n1691BarPieAnc = new boolean[] {false} ;
      P03D93_A1271BarPieLzd = new int[1] ;
      P03D93_A908PieOriCod = new String[] {""} ;
      P03D93_A197BarPConTro = new short[1] ;
      P03D93_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_A201BarPieEst = new byte[1] ;
      P03D93_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_A44AlbRecCod = new int[1] ;
      P03D93_A13988BarPieVtx = new String[] {""} ;
      P03D93_A13519BarPieMq = new String[] {""} ;
      P03D93_n13519BarPieMq = new boolean[] {false} ;
      P03D93_A13518BarPieTurn = new byte[1] ;
      P03D93_n13518BarPieTurn = new boolean[] {false} ;
      P03D93_A13109BarPieST = new String[] {""} ;
      P03D93_n13109BarPieST = new boolean[] {false} ;
      P03D93_A13108BarPieLote = new String[] {""} ;
      P03D93_n13108BarPieLote = new boolean[] {false} ;
      P03D93_A13107BarPieEmp = new short[1] ;
      P03D93_n13107BarPieEmp = new boolean[] {false} ;
      P03D93_A13004BarPieDest = new byte[1] ;
      P03D93_n13004BarPieDest = new boolean[] {false} ;
      P03D93_A12992BarPieOpe = new int[1] ;
      P03D93_n12992BarPieOpe = new boolean[] {false} ;
      P03D93_A12936BarPieSecu = new String[] {""} ;
      P03D93_n12936BarPieSecu = new boolean[] {false} ;
      P03D93_A12935BarPieTono = new String[] {""} ;
      P03D93_n12935BarPieTono = new boolean[] {false} ;
      P03D93_A12928BarPieEncC = new String[] {""} ;
      P03D93_n12928BarPieEncC = new boolean[] {false} ;
      P03D93_A12927BarPieCoCN = new int[1] ;
      P03D93_n12927BarPieCoCN = new boolean[] {false} ;
      P03D93_A12926BarPieCoCI = new String[] {""} ;
      P03D93_n12926BarPieCoCI = new boolean[] {false} ;
      P03D93_A12925BarPieCliN = new String[] {""} ;
      P03D93_n12925BarPieCliN = new boolean[] {false} ;
      P03D93_A12924BarPieCliI = new int[1] ;
      P03D93_n12924BarPieCliI = new boolean[] {false} ;
      P03D93_A12923BarPieArtD = new String[] {""} ;
      P03D93_n12923BarPieArtD = new boolean[] {false} ;
      P03D93_A12922BarPieArtI = new String[] {""} ;
      P03D93_n12922BarPieArtI = new boolean[] {false} ;
      P03D93_A12921BarPieColN = new int[1] ;
      P03D93_n12921BarPieColN = new boolean[] {false} ;
      P03D93_A12920BarPieColD = new String[] {""} ;
      P03D93_n12920BarPieColD = new boolean[] {false} ;
      P03D93_A12912BarPieUltD = new short[1] ;
      P03D93_n12912BarPieUltD = new boolean[] {false} ;
      P03D93_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P03D93_n12911BarPieFep = new boolean[] {false} ;
      P03D93_A12780BarPieUsu = new String[] {""} ;
      P03D93_n12780BarPieUsu = new boolean[] {false} ;
      P03D93_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      P03D93_n12779BarPieFdv = new boolean[] {false} ;
      P03D93_A12113BarPieCLd = new byte[1] ;
      P03D93_n12113BarPieCLd = new boolean[] {false} ;
      P03D93_A1642BarPieOrd = new int[1] ;
      P03D93_n1642BarPieOrd = new boolean[] {false} ;
      P03D93_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_n6473BarUniB = new boolean[] {false} ;
      P03D93_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_n6472BarTara = new boolean[] {false} ;
      P03D93_A1919BarPieObs = new String[] {""} ;
      P03D93_n1919BarPieObs = new boolean[] {false} ;
      P03D93_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_n9984BarPiePda = new boolean[] {false} ;
      P03D93_A9846BarPieAncc = new short[1] ;
      P03D93_n9846BarPieAncc = new boolean[] {false} ;
      P03D93_A9800BarNPes = new byte[1] ;
      P03D93_n9800BarNPes = new boolean[] {false} ;
      P03D93_A9799BarPz2 = new int[1] ;
      P03D93_n9799BarPz2 = new boolean[] {false} ;
      P03D93_A9798BarPz1 = new int[1] ;
      P03D93_n9798BarPz1 = new boolean[] {false} ;
      P03D93_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_n9796BarPieK2 = new boolean[] {false} ;
      P03D93_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_n9795BarPieK1 = new boolean[] {false} ;
      P03D93_A8907PzaB80 = new String[] {""} ;
      P03D93_n8907PzaB80 = new boolean[] {false} ;
      P03D93_A8838CodBarPz = new String[] {""} ;
      P03D93_n8838CodBarPz = new boolean[] {false} ;
      P03D93_A8707BapieObs = new String[] {""} ;
      P03D93_n8707BapieObs = new boolean[] {false} ;
      P03D93_A1501BarPiePie = new int[1] ;
      P03D93_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03D93_A199BarPie1 = new short[1] ;
      P03D93_A365DisDes = new String[] {""} ;
      P03D93_A898BarPieNDes = new int[1] ;
      A6489BarPieIdPz = "" ;
      A6116BarPieImp = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A908PieOriCod = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
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
      A203BarPieKil = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W200BarPieCod = "" ;
      AV9Barpiekil = DecimalUtil.ZERO ;
      W203BarPieKil = DecimalUtil.ZERO ;
      W205BarPieMet = DecimalUtil.ZERO ;
      W170BarKilLan = DecimalUtil.ZERO ;
      W183BarMetLan = DecimalUtil.ZERO ;
      W908PieOriCod = "" ;
      W2186BarPieLoc = "" ;
      W3275BarKgsAut = DecimalUtil.ZERO ;
      W3276BarMtsAut = DecimalUtil.ZERO ;
      W6116BarPieImp = "" ;
      W6489BarPieIdPz = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.perf009__default(),
         new Object[] {
             new Object[] {
            P03D93_A396EmprCod, P03D93_A129BarCod, P03D93_A132BarCodReo, P03D93_A130BarCodPar, P03D93_A200BarPieCod, P03D93_A6489BarPieIdPz, P03D93_n6489BarPieIdPz, P03D93_A6116BarPieImp, P03D93_n6116BarPieImp, P03D93_A3277BarPieAut,
            P03D93_n3277BarPieAut, P03D93_A3276BarMtsAut, P03D93_n3276BarMtsAut, P03D93_A3275BarKgsAut, P03D93_n3275BarKgsAut, P03D93_A2186BarPieLoc, P03D93_n2186BarPieLoc, P03D93_A1691BarPieAnc, P03D93_n1691BarPieAnc, P03D93_A1271BarPieLzd,
            P03D93_A908PieOriCod, P03D93_A197BarPConTro, P03D93_A183BarMetLan, P03D93_A170BarKilLan, P03D93_A201BarPieEst, P03D93_A205BarPieMet, P03D93_A44AlbRecCod, P03D93_A13988BarPieVtx, P03D93_A13519BarPieMq, P03D93_n13519BarPieMq,
            P03D93_A13518BarPieTurn, P03D93_n13518BarPieTurn, P03D93_A13109BarPieST, P03D93_n13109BarPieST, P03D93_A13108BarPieLote, P03D93_n13108BarPieLote, P03D93_A13107BarPieEmp, P03D93_n13107BarPieEmp, P03D93_A13004BarPieDest, P03D93_n13004BarPieDest,
            P03D93_A12992BarPieOpe, P03D93_n12992BarPieOpe, P03D93_A12936BarPieSecu, P03D93_n12936BarPieSecu, P03D93_A12935BarPieTono, P03D93_n12935BarPieTono, P03D93_A12928BarPieEncC, P03D93_n12928BarPieEncC, P03D93_A12927BarPieCoCN, P03D93_n12927BarPieCoCN,
            P03D93_A12926BarPieCoCI, P03D93_n12926BarPieCoCI, P03D93_A12925BarPieCliN, P03D93_n12925BarPieCliN, P03D93_A12924BarPieCliI, P03D93_n12924BarPieCliI, P03D93_A12923BarPieArtD, P03D93_n12923BarPieArtD, P03D93_A12922BarPieArtI, P03D93_n12922BarPieArtI,
            P03D93_A12921BarPieColN, P03D93_n12921BarPieColN, P03D93_A12920BarPieColD, P03D93_n12920BarPieColD, P03D93_A12912BarPieUltD, P03D93_n12912BarPieUltD, P03D93_A12911BarPieFep, P03D93_n12911BarPieFep, P03D93_A12780BarPieUsu, P03D93_n12780BarPieUsu,
            P03D93_A12779BarPieFdv, P03D93_n12779BarPieFdv, P03D93_A12113BarPieCLd, P03D93_n12113BarPieCLd, P03D93_A1642BarPieOrd, P03D93_n1642BarPieOrd, P03D93_A6473BarUniB, P03D93_n6473BarUniB, P03D93_A6472BarTara, P03D93_n6472BarTara,
            P03D93_A1919BarPieObs, P03D93_n1919BarPieObs, P03D93_A9984BarPiePda, P03D93_n9984BarPiePda, P03D93_A9846BarPieAncc, P03D93_n9846BarPieAncc, P03D93_A9800BarNPes, P03D93_n9800BarNPes, P03D93_A9799BarPz2, P03D93_n9799BarPz2,
            P03D93_A9798BarPz1, P03D93_n9798BarPz1, P03D93_A9796BarPieK2, P03D93_n9796BarPieK2, P03D93_A9795BarPieK1, P03D93_n9795BarPieK1, P03D93_A8907PzaB80, P03D93_n8907PzaB80, P03D93_A8838CodBarPz, P03D93_n8838CodBarPz,
            P03D93_A8707BapieObs, P03D93_n8707BapieObs, P03D93_A1501BarPiePie, P03D93_A203BarPieKil, P03D93_A199BarPie1, P03D93_A365DisDes, P03D93_A898BarPieNDes
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

   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte A13518BarPieTurn ;
   private byte A13004BarPieDest ;
   private byte A12113BarPieCLd ;
   private byte A9800BarNPes ;
   private byte W132BarCodReo ;
   private byte W201BarPieEst ;
   private short A3277BarPieAut ;
   private short A1691BarPieAnc ;
   private short A197BarPConTro ;
   private short A13107BarPieEmp ;
   private short A12912BarPieUltD ;
   private short A9846BarPieAncc ;
   private short A199BarPie1 ;
   private short W197BarPConTro ;
   private short W1691BarPieAnc ;
   private short W3277BarPieAut ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1271BarPieLzd ;
   private int A44AlbRecCod ;
   private int A12992BarPieOpe ;
   private int A12927BarPieCoCN ;
   private int A12924BarPieCliI ;
   private int A12921BarPieColN ;
   private int A1642BarPieOrd ;
   private int A9799BarPz2 ;
   private int A9798BarPz1 ;
   private int A1501BarPiePie ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int W129BarCod ;
   private int AV8Albreccod ;
   private int AV10Barpie ;
   private int GX_INS18 ;
   private int W44AlbRecCod ;
   private int W1271BarPieLzd ;
   private int W1501BarPiePie ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A6473BarUniB ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal AV9Barpiekil ;
   private java.math.BigDecimal W203BarPieKil ;
   private java.math.BigDecimal W205BarPieMet ;
   private java.math.BigDecimal W170BarKilLan ;
   private java.math.BigDecimal W183BarMetLan ;
   private java.math.BigDecimal W3275BarKgsAut ;
   private java.math.BigDecimal W3276BarMtsAut ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String A6489BarPieIdPz ;
   private String A6116BarPieImp ;
   private String A2186BarPieLoc ;
   private String A908PieOriCod ;
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
   private String A365DisDes ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W200BarPieCod ;
   private String W908PieOriCod ;
   private String W2186BarPieLoc ;
   private String W6116BarPieImp ;
   private String W6489BarPieIdPz ;
   private String Gx_emsg ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date A12779BarPieFdv ;
   private boolean n6489BarPieIdPz ;
   private boolean n6116BarPieImp ;
   private boolean n3277BarPieAut ;
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
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03D93_A396EmprCod ;
   private int[] P03D93_A129BarCod ;
   private byte[] P03D93_A132BarCodReo ;
   private String[] P03D93_A130BarCodPar ;
   private String[] P03D93_A200BarPieCod ;
   private String[] P03D93_A6489BarPieIdPz ;
   private boolean[] P03D93_n6489BarPieIdPz ;
   private String[] P03D93_A6116BarPieImp ;
   private boolean[] P03D93_n6116BarPieImp ;
   private short[] P03D93_A3277BarPieAut ;
   private boolean[] P03D93_n3277BarPieAut ;
   private java.math.BigDecimal[] P03D93_A3276BarMtsAut ;
   private boolean[] P03D93_n3276BarMtsAut ;
   private java.math.BigDecimal[] P03D93_A3275BarKgsAut ;
   private boolean[] P03D93_n3275BarKgsAut ;
   private String[] P03D93_A2186BarPieLoc ;
   private boolean[] P03D93_n2186BarPieLoc ;
   private short[] P03D93_A1691BarPieAnc ;
   private boolean[] P03D93_n1691BarPieAnc ;
   private int[] P03D93_A1271BarPieLzd ;
   private String[] P03D93_A908PieOriCod ;
   private short[] P03D93_A197BarPConTro ;
   private java.math.BigDecimal[] P03D93_A183BarMetLan ;
   private java.math.BigDecimal[] P03D93_A170BarKilLan ;
   private byte[] P03D93_A201BarPieEst ;
   private java.math.BigDecimal[] P03D93_A205BarPieMet ;
   private int[] P03D93_A44AlbRecCod ;
   private String[] P03D93_A13988BarPieVtx ;
   private String[] P03D93_A13519BarPieMq ;
   private boolean[] P03D93_n13519BarPieMq ;
   private byte[] P03D93_A13518BarPieTurn ;
   private boolean[] P03D93_n13518BarPieTurn ;
   private String[] P03D93_A13109BarPieST ;
   private boolean[] P03D93_n13109BarPieST ;
   private String[] P03D93_A13108BarPieLote ;
   private boolean[] P03D93_n13108BarPieLote ;
   private short[] P03D93_A13107BarPieEmp ;
   private boolean[] P03D93_n13107BarPieEmp ;
   private byte[] P03D93_A13004BarPieDest ;
   private boolean[] P03D93_n13004BarPieDest ;
   private int[] P03D93_A12992BarPieOpe ;
   private boolean[] P03D93_n12992BarPieOpe ;
   private String[] P03D93_A12936BarPieSecu ;
   private boolean[] P03D93_n12936BarPieSecu ;
   private String[] P03D93_A12935BarPieTono ;
   private boolean[] P03D93_n12935BarPieTono ;
   private String[] P03D93_A12928BarPieEncC ;
   private boolean[] P03D93_n12928BarPieEncC ;
   private int[] P03D93_A12927BarPieCoCN ;
   private boolean[] P03D93_n12927BarPieCoCN ;
   private String[] P03D93_A12926BarPieCoCI ;
   private boolean[] P03D93_n12926BarPieCoCI ;
   private String[] P03D93_A12925BarPieCliN ;
   private boolean[] P03D93_n12925BarPieCliN ;
   private int[] P03D93_A12924BarPieCliI ;
   private boolean[] P03D93_n12924BarPieCliI ;
   private String[] P03D93_A12923BarPieArtD ;
   private boolean[] P03D93_n12923BarPieArtD ;
   private String[] P03D93_A12922BarPieArtI ;
   private boolean[] P03D93_n12922BarPieArtI ;
   private int[] P03D93_A12921BarPieColN ;
   private boolean[] P03D93_n12921BarPieColN ;
   private String[] P03D93_A12920BarPieColD ;
   private boolean[] P03D93_n12920BarPieColD ;
   private short[] P03D93_A12912BarPieUltD ;
   private boolean[] P03D93_n12912BarPieUltD ;
   private java.util.Date[] P03D93_A12911BarPieFep ;
   private boolean[] P03D93_n12911BarPieFep ;
   private String[] P03D93_A12780BarPieUsu ;
   private boolean[] P03D93_n12780BarPieUsu ;
   private java.util.Date[] P03D93_A12779BarPieFdv ;
   private boolean[] P03D93_n12779BarPieFdv ;
   private byte[] P03D93_A12113BarPieCLd ;
   private boolean[] P03D93_n12113BarPieCLd ;
   private int[] P03D93_A1642BarPieOrd ;
   private boolean[] P03D93_n1642BarPieOrd ;
   private java.math.BigDecimal[] P03D93_A6473BarUniB ;
   private boolean[] P03D93_n6473BarUniB ;
   private java.math.BigDecimal[] P03D93_A6472BarTara ;
   private boolean[] P03D93_n6472BarTara ;
   private String[] P03D93_A1919BarPieObs ;
   private boolean[] P03D93_n1919BarPieObs ;
   private java.math.BigDecimal[] P03D93_A9984BarPiePda ;
   private boolean[] P03D93_n9984BarPiePda ;
   private short[] P03D93_A9846BarPieAncc ;
   private boolean[] P03D93_n9846BarPieAncc ;
   private byte[] P03D93_A9800BarNPes ;
   private boolean[] P03D93_n9800BarNPes ;
   private int[] P03D93_A9799BarPz2 ;
   private boolean[] P03D93_n9799BarPz2 ;
   private int[] P03D93_A9798BarPz1 ;
   private boolean[] P03D93_n9798BarPz1 ;
   private java.math.BigDecimal[] P03D93_A9796BarPieK2 ;
   private boolean[] P03D93_n9796BarPieK2 ;
   private java.math.BigDecimal[] P03D93_A9795BarPieK1 ;
   private boolean[] P03D93_n9795BarPieK1 ;
   private String[] P03D93_A8907PzaB80 ;
   private boolean[] P03D93_n8907PzaB80 ;
   private String[] P03D93_A8838CodBarPz ;
   private boolean[] P03D93_n8838CodBarPz ;
   private String[] P03D93_A8707BapieObs ;
   private boolean[] P03D93_n8707BapieObs ;
   private int[] P03D93_A1501BarPiePie ;
   private java.math.BigDecimal[] P03D93_A203BarPieKil ;
   private short[] P03D93_A199BarPie1 ;
   private String[] P03D93_A365DisDes ;
   private int[] P03D93_A898BarPieNDes ;
}

final  class perf009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03D93", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.BarPieIdPz, T1.BarPieImp, T1.BarPieAut, T1.BarMtsAut, T1.BarKgsAut, T1.BarPieLoc, T1.BarPieAnc, T1.BarPieLzd, T1.PieOriCod, T1.BarPConTro, T1.BarMetLan, T1.BarKilLan, T1.BarPieEst, T1.BarPieMet, T1.AlbRecCod, T1.BarPieVtx, T1.BarPieMq, T1.BarPieTurn, T1.BarPieST, T1.BarPieLote, T1.BarPieEmp, T1.BarPieDest, T1.BarPieOpe, T1.BarPieSecu, T1.BarPieTono, T1.BarPieEncC, T1.BarPieCoCN, T1.BarPieCoCI, T1.BarPieCliN, T1.BarPieCliI, T1.BarPieArtD, T1.BarPieArtI, T1.BarPieColN, T1.BarPieColD, T1.BarPieUltD, T1.BarPieFep, T1.BarPieUsu, T1.BarPieFdv, T1.BarPieCLd, T1.BarPieOrd, T1.BarUniB, T1.BarTara, T1.BarPieObs, T1.BarPiePda, T1.BarPieAncc, T1.BarNPes, T1.BarPz2, T1.BarPz1, T1.BarPieK2, T1.BarPieK1, T1.PzaB80, T1.CodBarPz, T1.BapieObs, T1.BarPiePie, T1.BarPieKil, COALESCE( T3.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03D94", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P03D95", "UPDATE TXPBARPIE SET BarPiePie=BarPiePie + ?, BarPieKil=BarPieKil + ?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P03D96", "UPDATE TXPBARPIE SET PieOriCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((String[]) buf[20])[0] = rslt.getString(14, 9);
               ((short[]) buf[21])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[24])[0] = rslt.getByte(18);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[26])[0] = rslt.getInt(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 20);
               ((String[]) buf[28])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(23);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(26);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(27);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(28);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(29, 10);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(30, 10);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((int[]) buf[48])[0] = rslt.getInt(32);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(33, 13);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(34, 60);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(35);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(36, 26);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(37, 16);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(38);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(39, 13);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(40);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[66])[0] = rslt.getGXDate(41);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(42, 10);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDate(43);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((byte[]) buf[72])[0] = rslt.getByte(44);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((int[]) buf[74])[0] = rslt.getInt(45);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(48, 60);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((short[]) buf[84])[0] = rslt.getShort(50);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((byte[]) buf[86])[0] = rslt.getByte(51);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((int[]) buf[88])[0] = rslt.getInt(52);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((int[]) buf[90])[0] = rslt.getInt(53);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[92])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(56, 9);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(57, 20);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(58, 40);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((int[]) buf[102])[0] = rslt.getInt(59);
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(60,2);
               ((short[]) buf[104])[0] = rslt.getShort(61);
               ((String[]) buf[105])[0] = rslt.getString(62, 1);
               ((int[]) buf[106])[0] = rslt.getInt(63);
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
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

