package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoplin extends GXProcedure
{
   public pcoplin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoplin.class ), "" );
   }

   public pcoplin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 ,
                           int[] aP5 ,
                           int[] aP6 )
   {
      pcoplin.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pcoplin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoplin.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      pcoplin.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pcoplin.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      pcoplin.this.AV29Dibcli = aP4[0];
      this.aP4 = aP4;
      pcoplin.this.AV30CliCod = aP5[0];
      this.aP5 = aP5;
      pcoplin.this.AV31DibInt = aP6[0];
      this.aP6 = aP6;
      pcoplin.this.AV38Orden = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02XU4 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3911TipMqnCod = P02XU4_A3911TipMqnCod[0] ;
         n3911TipMqnCod = P02XU4_n3911TipMqnCod[0] ;
         A1005GrabCod = P02XU4_A1005GrabCod[0] ;
         n1005GrabCod = P02XU4_n1005GrabCod[0] ;
         A1825DibVelMaq = P02XU4_A1825DibVelMaq[0] ;
         n1825DibVelMaq = P02XU4_n1825DibVelMaq[0] ;
         A1024DibUltLin = P02XU4_A1024DibUltLin[0] ;
         n1024DibUltLin = P02XU4_n1024DibUltLin[0] ;
         A1824DibUltCil = P02XU4_A1824DibUltCil[0] ;
         n1824DibUltCil = P02XU4_n1824DibUltCil[0] ;
         A1606DibTipRas = P02XU4_A1606DibTipRas[0] ;
         n1606DibTipRas = P02XU4_n1606DibTipRas[0] ;
         A1823DibTipMaq = P02XU4_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P02XU4_n1823DibTipMaq[0] ;
         A1822DibTemQm9 = P02XU4_A1822DibTemQm9[0] ;
         n1822DibTemQm9 = P02XU4_n1822DibTemQm9[0] ;
         A1821DibTemQm8 = P02XU4_A1821DibTemQm8[0] ;
         n1821DibTemQm8 = P02XU4_n1821DibTemQm8[0] ;
         A1820DibTemQm7 = P02XU4_A1820DibTemQm7[0] ;
         n1820DibTemQm7 = P02XU4_n1820DibTemQm7[0] ;
         A1819DibTemQm6 = P02XU4_A1819DibTemQm6[0] ;
         n1819DibTemQm6 = P02XU4_n1819DibTemQm6[0] ;
         A1818DibTemQm5 = P02XU4_A1818DibTemQm5[0] ;
         n1818DibTemQm5 = P02XU4_n1818DibTemQm5[0] ;
         A1817DibTemQm4 = P02XU4_A1817DibTemQm4[0] ;
         n1817DibTemQm4 = P02XU4_n1817DibTemQm4[0] ;
         A1816DibTemQm3 = P02XU4_A1816DibTemQm3[0] ;
         n1816DibTemQm3 = P02XU4_n1816DibTemQm3[0] ;
         A1815DibTemQm2 = P02XU4_A1815DibTemQm2[0] ;
         n1815DibTemQm2 = P02XU4_n1815DibTemQm2[0] ;
         A1814DibTemQm10 = P02XU4_A1814DibTemQm10[0] ;
         n1814DibTemQm10 = P02XU4_n1814DibTemQm10[0] ;
         A1813DibTemQm1 = P02XU4_A1813DibTemQm1[0] ;
         n1813DibTemQm1 = P02XU4_n1813DibTemQm1[0] ;
         A1608DibRap = P02XU4_A1608DibRap[0] ;
         n1608DibRap = P02XU4_n1608DibRap[0] ;
         A1900DibPreOf9 = P02XU4_A1900DibPreOf9[0] ;
         n1900DibPreOf9 = P02XU4_n1900DibPreOf9[0] ;
         A1899DibPreOf8 = P02XU4_A1899DibPreOf8[0] ;
         n1899DibPreOf8 = P02XU4_n1899DibPreOf8[0] ;
         A1898DibPreOf7 = P02XU4_A1898DibPreOf7[0] ;
         n1898DibPreOf7 = P02XU4_n1898DibPreOf7[0] ;
         A1897DibPreOf6 = P02XU4_A1897DibPreOf6[0] ;
         n1897DibPreOf6 = P02XU4_n1897DibPreOf6[0] ;
         A1896DibPreOf5 = P02XU4_A1896DibPreOf5[0] ;
         n1896DibPreOf5 = P02XU4_n1896DibPreOf5[0] ;
         A1895DibPreOf4 = P02XU4_A1895DibPreOf4[0] ;
         n1895DibPreOf4 = P02XU4_n1895DibPreOf4[0] ;
         A1894DibPreOf3 = P02XU4_A1894DibPreOf3[0] ;
         n1894DibPreOf3 = P02XU4_n1894DibPreOf3[0] ;
         A1893DibPreOf2 = P02XU4_A1893DibPreOf2[0] ;
         n1893DibPreOf2 = P02XU4_n1893DibPreOf2[0] ;
         A4491DibPreOf16 = P02XU4_A4491DibPreOf16[0] ;
         n4491DibPreOf16 = P02XU4_n4491DibPreOf16[0] ;
         A4490DibPreOf15 = P02XU4_A4490DibPreOf15[0] ;
         n4490DibPreOf15 = P02XU4_n4490DibPreOf15[0] ;
         A4489DibPreOf14 = P02XU4_A4489DibPreOf14[0] ;
         n4489DibPreOf14 = P02XU4_n4489DibPreOf14[0] ;
         A4488DibPreOf13 = P02XU4_A4488DibPreOf13[0] ;
         n4488DibPreOf13 = P02XU4_n4488DibPreOf13[0] ;
         A4487DibPreOf12 = P02XU4_A4487DibPreOf12[0] ;
         n4487DibPreOf12 = P02XU4_n4487DibPreOf12[0] ;
         A4486DibPreOf11 = P02XU4_A4486DibPreOf11[0] ;
         n4486DibPreOf11 = P02XU4_n4486DibPreOf11[0] ;
         A1892DibPreOf10 = P02XU4_A1892DibPreOf10[0] ;
         n1892DibPreOf10 = P02XU4_n1892DibPreOf10[0] ;
         A1891DibPreOf1 = P02XU4_A1891DibPreOf1[0] ;
         n1891DibPreOf1 = P02XU4_n1891DibPreOf1[0] ;
         A1890DibPreAy9 = P02XU4_A1890DibPreAy9[0] ;
         n1890DibPreAy9 = P02XU4_n1890DibPreAy9[0] ;
         A1889DibPreAy8 = P02XU4_A1889DibPreAy8[0] ;
         n1889DibPreAy8 = P02XU4_n1889DibPreAy8[0] ;
         A1888DibPreAy7 = P02XU4_A1888DibPreAy7[0] ;
         n1888DibPreAy7 = P02XU4_n1888DibPreAy7[0] ;
         A1887DibPreAy6 = P02XU4_A1887DibPreAy6[0] ;
         n1887DibPreAy6 = P02XU4_n1887DibPreAy6[0] ;
         A1886DibPreAy5 = P02XU4_A1886DibPreAy5[0] ;
         n1886DibPreAy5 = P02XU4_n1886DibPreAy5[0] ;
         A1885DibPreAy4 = P02XU4_A1885DibPreAy4[0] ;
         n1885DibPreAy4 = P02XU4_n1885DibPreAy4[0] ;
         A1884DibPreAy3 = P02XU4_A1884DibPreAy3[0] ;
         n1884DibPreAy3 = P02XU4_n1884DibPreAy3[0] ;
         A1883DibPreAy2 = P02XU4_A1883DibPreAy2[0] ;
         n1883DibPreAy2 = P02XU4_n1883DibPreAy2[0] ;
         A4485DibPreAy16 = P02XU4_A4485DibPreAy16[0] ;
         n4485DibPreAy16 = P02XU4_n4485DibPreAy16[0] ;
         A4484DibPreAy15 = P02XU4_A4484DibPreAy15[0] ;
         n4484DibPreAy15 = P02XU4_n4484DibPreAy15[0] ;
         A4483DibPreAy14 = P02XU4_A4483DibPreAy14[0] ;
         n4483DibPreAy14 = P02XU4_n4483DibPreAy14[0] ;
         A4482DibPreAy13 = P02XU4_A4482DibPreAy13[0] ;
         n4482DibPreAy13 = P02XU4_n4482DibPreAy13[0] ;
         A4481DibPreAy12 = P02XU4_A4481DibPreAy12[0] ;
         n4481DibPreAy12 = P02XU4_n4481DibPreAy12[0] ;
         A4480DibPreAy11 = P02XU4_A4480DibPreAy11[0] ;
         n4480DibPreAy11 = P02XU4_n4480DibPreAy11[0] ;
         A1882DibPreAy10 = P02XU4_A1882DibPreAy10[0] ;
         n1882DibPreAy10 = P02XU4_n1882DibPreAy10[0] ;
         A1881DibPreAy1 = P02XU4_A1881DibPreAy1[0] ;
         n1881DibPreAy1 = P02XU4_n1881DibPreAy1[0] ;
         A1811DibPosVor = P02XU4_A1811DibPosVor[0] ;
         n1811DibPosVor = P02XU4_n1811DibPosVor[0] ;
         A1610DibPosRas = P02XU4_A1610DibPosRas[0] ;
         n1610DibPosRas = P02XU4_n1610DibPosRas[0] ;
         A2523DibObsUL = P02XU4_A2523DibObsUL[0] ;
         n2523DibObsUL = P02XU4_n2523DibObsUL[0] ;
         A1609DibObs2 = P02XU4_A1609DibObs2[0] ;
         n1609DibObs2 = P02XU4_n1609DibObs2[0] ;
         A1020DibObs = P02XU4_A1020DibObs[0] ;
         n1020DibObs = P02XU4_n1020DibObs[0] ;
         A1023DibMot = P02XU4_A1023DibMot[0] ;
         n1023DibMot = P02XU4_n1023DibMot[0] ;
         A1019DibMolCil = P02XU4_A1019DibMolCil[0] ;
         n1019DibMolCil = P02XU4_n1019DibMolCil[0] ;
         A2090DibMolCi2 = P02XU4_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = P02XU4_n2090DibMolCi2[0] ;
         A1018DibMetRea = P02XU4_A1018DibMetRea[0] ;
         n1018DibMetRea = P02XU4_n1018DibMetRea[0] ;
         A1607DibMed = P02XU4_A1607DibMed[0] ;
         n1607DibMed = P02XU4_n1607DibMed[0] ;
         A1605DibLocal = P02XU4_A1605DibLocal[0] ;
         n1605DibLocal = P02XU4_n1605DibLocal[0] ;
         A1806DibLevMaq = P02XU4_A1806DibLevMaq[0] ;
         n1806DibLevMaq = P02XU4_n1806DibLevMaq[0] ;
         A1022DibImp = P02XU4_A1022DibImp[0] ;
         n1022DibImp = P02XU4_n1022DibImp[0] ;
         A1880DibGraNum = P02XU4_A1880DibGraNum[0] ;
         n1880DibGraNum = P02XU4_n1880DibGraNum[0] ;
         A1015DibFecUlt = P02XU4_A1015DibFecUlt[0] ;
         n1015DibFecUlt = P02XU4_n1015DibFecUlt[0] ;
         A1016DibFecPed = P02XU4_A1016DibFecPed[0] ;
         n1016DibFecPed = P02XU4_n1016DibFecPed[0] ;
         A1017DibFecEnt = P02XU4_A1017DibFecEnt[0] ;
         n1017DibFecEnt = P02XU4_n1017DibFecEnt[0] ;
         A6841DibDsc = P02XU4_A6841DibDsc[0] ;
         n6841DibDsc = P02XU4_n6841DibDsc[0] ;
         A4861DibCob = P02XU4_A4861DibCob[0] ;
         n4861DibCob = P02XU4_n4861DibCob[0] ;
         A1021DibCar = P02XU4_A1021DibCar[0] ;
         n1021DibCar = P02XU4_n1021DibCar[0] ;
         A7140DibBmp = P02XU4_A7140DibBmp[0] ;
         n7140DibBmp = P02XU4_n7140DibBmp[0] ;
         A1025DibNumLin = P02XU4_A1025DibNumLin[0] ;
         A2091DibNumLi2 = P02XU4_A2091DibNumLi2[0] ;
         n2091DibNumLi2 = P02XU4_n2091DibNumLi2[0] ;
         A4902DibCobTot = P02XU4_A4902DibCobTot[0] ;
         A1025DibNumLin = P02XU4_A1025DibNumLin[0] ;
         A4902DibCobTot = P02XU4_A4902DibCobTot[0] ;
         A2091DibNumLi2 = P02XU4_A2091DibNumLi2[0] ;
         n2091DibNumLi2 = P02XU4_n2091DibNumLi2[0] ;
         W1013DibCli = A1013DibCli ;
         W252CliCod = A252CliCod ;
         W1014DibInt = A1014DibInt ;
         /* Using cursor P02XU5 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A10511DibOrgClid = P02XU5_A10511DibOrgClid[0] ;
            n10511DibOrgClid = P02XU5_n10511DibOrgClid[0] ;
            A10510DibOrgLi = P02XU5_A10510DibOrgLi[0] ;
            n10510DibOrgLi = P02XU5_n10510DibOrgLi[0] ;
            A10509DibOrgCl = P02XU5_A10509DibOrgCl[0] ;
            n10509DibOrgCl = P02XU5_n10509DibOrgCl[0] ;
            A10508DibOrgIn = P02XU5_A10508DibOrgIn[0] ;
            n10508DibOrgIn = P02XU5_n10508DibOrgIn[0] ;
            A1808DibOrdCil = P02XU5_A1808DibOrdCil[0] ;
            n1808DibOrdCil = P02XU5_n1808DibOrdCil[0] ;
            A2089DibLinMol = P02XU5_A2089DibLinMol[0] ;
            n2089DibLinMol = P02XU5_n2089DibLinMol[0] ;
            A1807DibLinCil = P02XU5_A1807DibLinCil[0] ;
            A10793DibCilUlt = P02XU5_A10793DibCilUlt[0] ;
            n10793DibCilUlt = P02XU5_n10793DibCilUlt[0] ;
            A10788DibCilMts = P02XU5_A10788DibCilMts[0] ;
            n10788DibCilMts = P02XU5_n10788DibCilMts[0] ;
            A10787DibCilStF = P02XU5_A10787DibCilStF[0] ;
            n10787DibCilStF = P02XU5_n10787DibCilStF[0] ;
            A10786DibCilSt = P02XU5_A10786DibCilSt[0] ;
            n10786DibCilSt = P02XU5_n10786DibCilSt[0] ;
            A10785DibCilMesh = P02XU5_A10785DibCilMesh[0] ;
            n10785DibCilMesh = P02XU5_n10785DibCilMesh[0] ;
            A10772DibPres = P02XU5_A10772DibPres[0] ;
            n10772DibPres = P02XU5_n10772DibPres[0] ;
            A10771DibDm = P02XU5_A10771DibDm[0] ;
            n10771DibDm = P02XU5_n10771DibDm[0] ;
            A8658DibIntSp = P02XU5_A8658DibIntSp[0] ;
            n8658DibIntSp = P02XU5_n8658DibIntSp[0] ;
            A8415DibActivo = P02XU5_A8415DibActivo[0] ;
            n8415DibActivo = P02XU5_n8415DibActivo[0] ;
            A7027DibLinMalC = P02XU5_A7027DibLinMalC[0] ;
            n7027DibLinMalC = P02XU5_n7027DibLinMalC[0] ;
            A7026DibCilCod = P02XU5_A7026DibCilCod[0] ;
            n7026DibCilCod = P02XU5_n7026DibCilCod[0] ;
            A4860DibPrcCob = P02XU5_A4860DibPrcCob[0] ;
            n4860DibPrcCob = P02XU5_n4860DibPrcCob[0] ;
            A1810DibPosCil = P02XU5_A1810DibPosCil[0] ;
            n1810DibPosCil = P02XU5_n1810DibPosCil[0] ;
            A1826TipCilCod = P02XU5_A1826TipCilCod[0] ;
            n1826TipCilCod = P02XU5_n1826TipCilCod[0] ;
            A1030DibRelMC = P02XU5_A1030DibRelMC[0] ;
            n1030DibRelMC = P02XU5_n1030DibRelMC[0] ;
            W1013DibCli = A1013DibCli ;
            W252CliCod = A252CliCod ;
            W1014DibInt = A1014DibInt ;
            AV27DibLinCil = A1807DibLinCil ;
            AV44DibLinAux = A1807DibLinCil ;
            AV33DibIntAux = A1014DibInt ;
            AV34DibCliAux = A1013DibCli ;
            AV35Clicodaux = A252CliCod ;
            AV40DibOrdCil = (byte)(AV38Orden+A1808DibOrdCil) ;
            AV42DibLinMol = A2089DibLinMol ;
            /*
               INSERT RECORD ON TABLE TXPLDIBUC

            */
            W1013DibCli = A1013DibCli ;
            W252CliCod = A252CliCod ;
            W1014DibInt = A1014DibInt ;
            W1807DibLinCil = A1807DibLinCil ;
            W10508DibOrgIn = A10508DibOrgIn ;
            n10508DibOrgIn = false ;
            W10509DibOrgCl = A10509DibOrgCl ;
            n10509DibOrgCl = false ;
            W10510DibOrgLi = A10510DibOrgLi ;
            n10510DibOrgLi = false ;
            W10511DibOrgClid = A10511DibOrgClid ;
            n10511DibOrgClid = false ;
            W1808DibOrdCil = A1808DibOrdCil ;
            n1808DibOrdCil = false ;
            W2089DibLinMol = A2089DibLinMol ;
            n2089DibLinMol = false ;
            A1013DibCli = AV29Dibcli ;
            A252CliCod = AV30CliCod ;
            A1014DibInt = AV31DibInt ;
            if ( ( GXutil.like( AV29Dibcli , GXutil.padr( httpContext.getMessage( "_MX", "") , 254 , "%"),  ' ' ) ) )
            {
               GXt_int1 = AV27DibLinCil ;
               GXv_char2[0] = A396EmprCod ;
               GXv_char3[0] = AV29Dibcli ;
               GXv_int4[0] = AV30CliCod ;
               GXv_int5[0] = AV31DibInt ;
               GXv_int6[0] = GXt_int1 ;
               new app.pnumcil(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_int6) ;
               pcoplin.this.A396EmprCod = GXv_char2[0] ;
               pcoplin.this.AV29Dibcli = GXv_char3[0] ;
               pcoplin.this.AV30CliCod = GXv_int4[0] ;
               pcoplin.this.AV31DibInt = GXv_int5[0] ;
               pcoplin.this.GXt_int1 = GXv_int6[0] ;
               AV27DibLinCil = (short)(GXt_int1) ;
               AV42DibLinMol = AV40DibOrdCil ;
            }
            A1807DibLinCil = AV27DibLinCil ;
            A10508DibOrgIn = AV33DibIntAux ;
            n10508DibOrgIn = false ;
            A10509DibOrgCl = AV34DibCliAux ;
            n10509DibOrgCl = false ;
            A10510DibOrgLi = AV44DibLinAux ;
            n10510DibOrgLi = false ;
            A10511DibOrgClid = AV35Clicodaux ;
            n10511DibOrgClid = false ;
            A1808DibOrdCil = AV40DibOrdCil ;
            n1808DibOrdCil = false ;
            A2089DibLinMol = AV42DibLinMol ;
            n2089DibLinMol = false ;
            /* Using cursor P02XU6 */
            pr_default.execute(2, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Boolean.valueOf(n2089DibLinMol), Byte.valueOf(A2089DibLinMol), Boolean.valueOf(n1030DibRelMC), A1030DibRelMC, Boolean.valueOf(n1808DibOrdCil), Byte.valueOf(A1808DibOrdCil), Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod), Boolean.valueOf(n1810DibPosCil), Byte.valueOf(A1810DibPosCil), Boolean.valueOf(n4860DibPrcCob), A4860DibPrcCob, Boolean.valueOf(n7026DibCilCod), A7026DibCilCod, Boolean.valueOf(n7027DibLinMalC), A7027DibLinMalC, Boolean.valueOf(n8415DibActivo), A8415DibActivo, Boolean.valueOf(n8658DibIntSp), Integer.valueOf(A8658DibIntSp), Boolean.valueOf(n10508DibOrgIn), Integer.valueOf(A10508DibOrgIn), Boolean.valueOf(n10509DibOrgCl), A10509DibOrgCl, Boolean.valueOf(n10510DibOrgLi), Short.valueOf(A10510DibOrgLi), Boolean.valueOf(n10511DibOrgClid), Integer.valueOf(A10511DibOrgClid), Boolean.valueOf(n10771DibDm), Byte.valueOf(A10771DibDm), Boolean.valueOf(n10772DibPres), A10772DibPres, Boolean.valueOf(n10785DibCilMesh), Short.valueOf(A10785DibCilMesh), Boolean.valueOf(n10786DibCilSt), Byte.valueOf(A10786DibCilSt), Boolean.valueOf(n10787DibCilStF), A10787DibCilStF, Boolean.valueOf(n10788DibCilMts), A10788DibCilMts, Boolean.valueOf(n10793DibCilUlt), Integer.valueOf(A10793DibCilUlt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A1013DibCli = W1013DibCli ;
            A252CliCod = W252CliCod ;
            A1014DibInt = W1014DibInt ;
            A1807DibLinCil = W1807DibLinCil ;
            A10508DibOrgIn = W10508DibOrgIn ;
            n10508DibOrgIn = false ;
            A10509DibOrgCl = W10509DibOrgCl ;
            n10509DibOrgCl = false ;
            A10510DibOrgLi = W10510DibOrgLi ;
            n10510DibOrgLi = false ;
            A10511DibOrgClid = W10511DibOrgClid ;
            n10511DibOrgClid = false ;
            A1808DibOrdCil = W1808DibOrdCil ;
            n1808DibOrdCil = false ;
            A2089DibLinMol = W2089DibLinMol ;
            n2089DibLinMol = false ;
            /* End Insert */
            A1013DibCli = W1013DibCli ;
            A252CliCod = W252CliCod ;
            A1014DibInt = W1014DibInt ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P02XU7 */
         pr_default.execute(3, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A7508DibOrgCliC = P02XU7_A7508DibOrgCliC[0] ;
            n7508DibOrgCliC = P02XU7_n7508DibOrgCliC[0] ;
            A7507DibOrgLin = P02XU7_A7507DibOrgLin[0] ;
            n7507DibOrgLin = P02XU7_n7507DibOrgLin[0] ;
            A7506DibOrgCli = P02XU7_A7506DibOrgCli[0] ;
            n7506DibOrgCli = P02XU7_n7506DibOrgCli[0] ;
            A7505DibOrgInt = P02XU7_A7505DibOrgInt[0] ;
            n7505DibOrgInt = P02XU7_n7505DibOrgInt[0] ;
            A1809DibOrdMol = P02XU7_A1809DibOrdMol[0] ;
            n1809DibOrdMol = P02XU7_n1809DibOrdMol[0] ;
            A2088DibDibMol = P02XU7_A2088DibDibMol[0] ;
            n2088DibDibMol = P02XU7_n2088DibDibMol[0] ;
            A1029DibLin = P02XU7_A1029DibLin[0] ;
            A6840DibLinMal = P02XU7_A6840DibLinMal[0] ;
            n6840DibLinMal = P02XU7_n6840DibLinMal[0] ;
            A6839DibMolCod = P02XU7_A6839DibMolCod[0] ;
            n6839DibMolCod = P02XU7_n6839DibMolCod[0] ;
            A5381DibPrcCobM = P02XU7_A5381DibPrcCobM[0] ;
            n5381DibPrcCobM = P02XU7_n5381DibPrcCobM[0] ;
            A1828TipGomCod = P02XU7_A1828TipGomCod[0] ;
            n1828TipGomCod = P02XU7_n1828TipGomCod[0] ;
            A1830TipPasCod = P02XU7_A1830TipPasCod[0] ;
            n1830TipPasCod = P02XU7_n1830TipPasCod[0] ;
            A2092DibRelMC2 = P02XU7_A2092DibRelMC2[0] ;
            n2092DibRelMC2 = P02XU7_n2092DibRelMC2[0] ;
            W1013DibCli = A1013DibCli ;
            W252CliCod = A252CliCod ;
            W1014DibInt = A1014DibInt ;
            AV28DibLin = A1029DibLin ;
            AV44DibLinAux = A1029DibLin ;
            AV33DibIntAux = A1014DibInt ;
            AV34DibCliAux = A1013DibCli ;
            AV35Clicodaux = A252CliCod ;
            AV41DibOrdMol = (byte)(A1809DibOrdMol+AV38Orden) ;
            AV43DibDibMol = A2088DibDibMol ;
            /*
               INSERT RECORD ON TABLE TXPLDIBUJ

            */
            W1013DibCli = A1013DibCli ;
            W252CliCod = A252CliCod ;
            W1014DibInt = A1014DibInt ;
            W1029DibLin = A1029DibLin ;
            W7505DibOrgInt = A7505DibOrgInt ;
            n7505DibOrgInt = false ;
            W7506DibOrgCli = A7506DibOrgCli ;
            n7506DibOrgCli = false ;
            W7507DibOrgLin = A7507DibOrgLin ;
            n7507DibOrgLin = false ;
            W7508DibOrgCliC = A7508DibOrgCliC ;
            n7508DibOrgCliC = false ;
            W1809DibOrdMol = A1809DibOrdMol ;
            n1809DibOrdMol = false ;
            W2088DibDibMol = A2088DibDibMol ;
            n2088DibDibMol = false ;
            A1013DibCli = AV29Dibcli ;
            A252CliCod = AV30CliCod ;
            A1014DibInt = AV31DibInt ;
            if ( ( GXutil.like( AV29Dibcli , GXutil.padr( httpContext.getMessage( "_MX", "") , 254 , "%"),  ' ' ) ) )
            {
               GXt_int1 = AV28DibLin ;
               GXv_char3[0] = A396EmprCod ;
               GXv_char2[0] = AV29Dibcli ;
               GXv_int6[0] = AV30CliCod ;
               GXv_int5[0] = AV31DibInt ;
               GXv_int4[0] = GXt_int1 ;
               new app.pnummol(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int6, GXv_int5, GXv_int4) ;
               pcoplin.this.A396EmprCod = GXv_char3[0] ;
               pcoplin.this.AV29Dibcli = GXv_char2[0] ;
               pcoplin.this.AV30CliCod = GXv_int6[0] ;
               pcoplin.this.AV31DibInt = GXv_int5[0] ;
               pcoplin.this.GXt_int1 = GXv_int4[0] ;
               AV28DibLin = (short)(GXt_int1) ;
               AV43DibDibMol = AV41DibOrdMol ;
            }
            A1029DibLin = AV28DibLin ;
            A7505DibOrgInt = AV33DibIntAux ;
            n7505DibOrgInt = false ;
            A7506DibOrgCli = AV34DibCliAux ;
            n7506DibOrgCli = false ;
            A7507DibOrgLin = AV44DibLinAux ;
            n7507DibOrgLin = false ;
            A7508DibOrgCliC = AV35Clicodaux ;
            n7508DibOrgCliC = false ;
            A1809DibOrdMol = AV41DibOrdMol ;
            n1809DibOrdMol = false ;
            A2088DibDibMol = AV43DibDibMol ;
            n2088DibDibMol = false ;
            /* Using cursor P02XU8 */
            pr_default.execute(4, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1029DibLin), Boolean.valueOf(n2088DibDibMol), Byte.valueOf(A2088DibDibMol), Boolean.valueOf(n2092DibRelMC2), A2092DibRelMC2, Boolean.valueOf(n1809DibOrdMol), Byte.valueOf(A1809DibOrdMol), Boolean.valueOf(n1830TipPasCod), Byte.valueOf(A1830TipPasCod), Boolean.valueOf(n1828TipGomCod), Byte.valueOf(A1828TipGomCod), Boolean.valueOf(n5381DibPrcCobM), A5381DibPrcCobM, Boolean.valueOf(n6839DibMolCod), A6839DibMolCod, Boolean.valueOf(n6840DibLinMal), A6840DibLinMal, Boolean.valueOf(n7505DibOrgInt), Integer.valueOf(A7505DibOrgInt), Boolean.valueOf(n7506DibOrgCli), A7506DibOrgCli, Boolean.valueOf(n7507DibOrgLin), Short.valueOf(A7507DibOrgLin), Boolean.valueOf(n7508DibOrgCliC), Integer.valueOf(A7508DibOrgCliC)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUJ");
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A1013DibCli = W1013DibCli ;
            A252CliCod = W252CliCod ;
            A1014DibInt = W1014DibInt ;
            A1029DibLin = W1029DibLin ;
            A7505DibOrgInt = W7505DibOrgInt ;
            n7505DibOrgInt = false ;
            A7506DibOrgCli = W7506DibOrgCli ;
            n7506DibOrgCli = false ;
            A7507DibOrgLin = W7507DibOrgLin ;
            n7507DibOrgLin = false ;
            A7508DibOrgCliC = W7508DibOrgCliC ;
            n7508DibOrgCliC = false ;
            A1809DibOrdMol = W1809DibOrdMol ;
            n1809DibOrdMol = false ;
            A2088DibDibMol = W2088DibDibMol ;
            n2088DibDibMol = false ;
            /* End Insert */
            A1013DibCli = W1013DibCli ;
            A252CliCod = W252CliCod ;
            A1014DibInt = W1014DibInt ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A1013DibCli = W1013DibCli ;
         A252CliCod = W252CliCod ;
         A1014DibInt = W1014DibInt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoplin.this.A396EmprCod;
      this.aP1[0] = pcoplin.this.A1013DibCli;
      this.aP2[0] = pcoplin.this.A252CliCod;
      this.aP3[0] = pcoplin.this.A1014DibInt;
      this.aP4[0] = pcoplin.this.AV29Dibcli;
      this.aP5[0] = pcoplin.this.AV30CliCod;
      this.aP6[0] = pcoplin.this.AV31DibInt;
      this.aP7[0] = pcoplin.this.AV38Orden;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcoplin");
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
      P02XU4_A396EmprCod = new String[] {""} ;
      P02XU4_A1013DibCli = new String[] {""} ;
      P02XU4_A252CliCod = new int[1] ;
      P02XU4_A1014DibInt = new int[1] ;
      P02XU4_A3911TipMqnCod = new byte[1] ;
      P02XU4_n3911TipMqnCod = new boolean[] {false} ;
      P02XU4_A1005GrabCod = new short[1] ;
      P02XU4_n1005GrabCod = new boolean[] {false} ;
      P02XU4_A1825DibVelMaq = new short[1] ;
      P02XU4_n1825DibVelMaq = new boolean[] {false} ;
      P02XU4_A1024DibUltLin = new short[1] ;
      P02XU4_n1024DibUltLin = new boolean[] {false} ;
      P02XU4_A1824DibUltCil = new short[1] ;
      P02XU4_n1824DibUltCil = new boolean[] {false} ;
      P02XU4_A1606DibTipRas = new String[] {""} ;
      P02XU4_n1606DibTipRas = new boolean[] {false} ;
      P02XU4_A1823DibTipMaq = new String[] {""} ;
      P02XU4_n1823DibTipMaq = new boolean[] {false} ;
      P02XU4_A1822DibTemQm9 = new short[1] ;
      P02XU4_n1822DibTemQm9 = new boolean[] {false} ;
      P02XU4_A1821DibTemQm8 = new short[1] ;
      P02XU4_n1821DibTemQm8 = new boolean[] {false} ;
      P02XU4_A1820DibTemQm7 = new short[1] ;
      P02XU4_n1820DibTemQm7 = new boolean[] {false} ;
      P02XU4_A1819DibTemQm6 = new short[1] ;
      P02XU4_n1819DibTemQm6 = new boolean[] {false} ;
      P02XU4_A1818DibTemQm5 = new short[1] ;
      P02XU4_n1818DibTemQm5 = new boolean[] {false} ;
      P02XU4_A1817DibTemQm4 = new short[1] ;
      P02XU4_n1817DibTemQm4 = new boolean[] {false} ;
      P02XU4_A1816DibTemQm3 = new short[1] ;
      P02XU4_n1816DibTemQm3 = new boolean[] {false} ;
      P02XU4_A1815DibTemQm2 = new short[1] ;
      P02XU4_n1815DibTemQm2 = new boolean[] {false} ;
      P02XU4_A1814DibTemQm10 = new short[1] ;
      P02XU4_n1814DibTemQm10 = new boolean[] {false} ;
      P02XU4_A1813DibTemQm1 = new short[1] ;
      P02XU4_n1813DibTemQm1 = new boolean[] {false} ;
      P02XU4_A1608DibRap = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1608DibRap = new boolean[] {false} ;
      P02XU4_A1900DibPreOf9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1900DibPreOf9 = new boolean[] {false} ;
      P02XU4_A1899DibPreOf8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1899DibPreOf8 = new boolean[] {false} ;
      P02XU4_A1898DibPreOf7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1898DibPreOf7 = new boolean[] {false} ;
      P02XU4_A1897DibPreOf6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1897DibPreOf6 = new boolean[] {false} ;
      P02XU4_A1896DibPreOf5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1896DibPreOf5 = new boolean[] {false} ;
      P02XU4_A1895DibPreOf4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1895DibPreOf4 = new boolean[] {false} ;
      P02XU4_A1894DibPreOf3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1894DibPreOf3 = new boolean[] {false} ;
      P02XU4_A1893DibPreOf2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1893DibPreOf2 = new boolean[] {false} ;
      P02XU4_A4491DibPreOf16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4491DibPreOf16 = new boolean[] {false} ;
      P02XU4_A4490DibPreOf15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4490DibPreOf15 = new boolean[] {false} ;
      P02XU4_A4489DibPreOf14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4489DibPreOf14 = new boolean[] {false} ;
      P02XU4_A4488DibPreOf13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4488DibPreOf13 = new boolean[] {false} ;
      P02XU4_A4487DibPreOf12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4487DibPreOf12 = new boolean[] {false} ;
      P02XU4_A4486DibPreOf11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4486DibPreOf11 = new boolean[] {false} ;
      P02XU4_A1892DibPreOf10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1892DibPreOf10 = new boolean[] {false} ;
      P02XU4_A1891DibPreOf1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1891DibPreOf1 = new boolean[] {false} ;
      P02XU4_A1890DibPreAy9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1890DibPreAy9 = new boolean[] {false} ;
      P02XU4_A1889DibPreAy8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1889DibPreAy8 = new boolean[] {false} ;
      P02XU4_A1888DibPreAy7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1888DibPreAy7 = new boolean[] {false} ;
      P02XU4_A1887DibPreAy6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1887DibPreAy6 = new boolean[] {false} ;
      P02XU4_A1886DibPreAy5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1886DibPreAy5 = new boolean[] {false} ;
      P02XU4_A1885DibPreAy4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1885DibPreAy4 = new boolean[] {false} ;
      P02XU4_A1884DibPreAy3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1884DibPreAy3 = new boolean[] {false} ;
      P02XU4_A1883DibPreAy2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1883DibPreAy2 = new boolean[] {false} ;
      P02XU4_A4485DibPreAy16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4485DibPreAy16 = new boolean[] {false} ;
      P02XU4_A4484DibPreAy15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4484DibPreAy15 = new boolean[] {false} ;
      P02XU4_A4483DibPreAy14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4483DibPreAy14 = new boolean[] {false} ;
      P02XU4_A4482DibPreAy13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4482DibPreAy13 = new boolean[] {false} ;
      P02XU4_A4481DibPreAy12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4481DibPreAy12 = new boolean[] {false} ;
      P02XU4_A4480DibPreAy11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4480DibPreAy11 = new boolean[] {false} ;
      P02XU4_A1882DibPreAy10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1882DibPreAy10 = new boolean[] {false} ;
      P02XU4_A1881DibPreAy1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1881DibPreAy1 = new boolean[] {false} ;
      P02XU4_A1811DibPosVor = new String[] {""} ;
      P02XU4_n1811DibPosVor = new boolean[] {false} ;
      P02XU4_A1610DibPosRas = new String[] {""} ;
      P02XU4_n1610DibPosRas = new boolean[] {false} ;
      P02XU4_A2523DibObsUL = new byte[1] ;
      P02XU4_n2523DibObsUL = new boolean[] {false} ;
      P02XU4_A1609DibObs2 = new String[] {""} ;
      P02XU4_n1609DibObs2 = new boolean[] {false} ;
      P02XU4_A1020DibObs = new String[] {""} ;
      P02XU4_n1020DibObs = new boolean[] {false} ;
      P02XU4_A1023DibMot = new String[] {""} ;
      P02XU4_n1023DibMot = new boolean[] {false} ;
      P02XU4_A1019DibMolCil = new short[1] ;
      P02XU4_n1019DibMolCil = new boolean[] {false} ;
      P02XU4_A2090DibMolCi2 = new short[1] ;
      P02XU4_n2090DibMolCi2 = new boolean[] {false} ;
      P02XU4_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1018DibMetRea = new boolean[] {false} ;
      P02XU4_A1607DibMed = new String[] {""} ;
      P02XU4_n1607DibMed = new boolean[] {false} ;
      P02XU4_A1605DibLocal = new String[] {""} ;
      P02XU4_n1605DibLocal = new boolean[] {false} ;
      P02XU4_A1806DibLevMaq = new String[] {""} ;
      P02XU4_n1806DibLevMaq = new boolean[] {false} ;
      P02XU4_A1022DibImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n1022DibImp = new boolean[] {false} ;
      P02XU4_A1880DibGraNum = new String[] {""} ;
      P02XU4_n1880DibGraNum = new boolean[] {false} ;
      P02XU4_A1015DibFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P02XU4_n1015DibFecUlt = new boolean[] {false} ;
      P02XU4_A1016DibFecPed = new java.util.Date[] {GXutil.nullDate()} ;
      P02XU4_n1016DibFecPed = new boolean[] {false} ;
      P02XU4_A1017DibFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02XU4_n1017DibFecEnt = new boolean[] {false} ;
      P02XU4_A6841DibDsc = new String[] {""} ;
      P02XU4_n6841DibDsc = new boolean[] {false} ;
      P02XU4_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU4_n4861DibCob = new boolean[] {false} ;
      P02XU4_A1021DibCar = new byte[1] ;
      P02XU4_n1021DibCar = new boolean[] {false} ;
      P02XU4_A7140DibBmp = new String[] {""} ;
      P02XU4_n7140DibBmp = new boolean[] {false} ;
      P02XU4_A1025DibNumLin = new short[1] ;
      P02XU4_A2091DibNumLi2 = new short[1] ;
      P02XU4_n2091DibNumLi2 = new boolean[] {false} ;
      P02XU4_A4902DibCobTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1606DibTipRas = "" ;
      A1823DibTipMaq = "" ;
      A1608DibRap = DecimalUtil.ZERO ;
      A1900DibPreOf9 = DecimalUtil.ZERO ;
      A1899DibPreOf8 = DecimalUtil.ZERO ;
      A1898DibPreOf7 = DecimalUtil.ZERO ;
      A1897DibPreOf6 = DecimalUtil.ZERO ;
      A1896DibPreOf5 = DecimalUtil.ZERO ;
      A1895DibPreOf4 = DecimalUtil.ZERO ;
      A1894DibPreOf3 = DecimalUtil.ZERO ;
      A1893DibPreOf2 = DecimalUtil.ZERO ;
      A4491DibPreOf16 = DecimalUtil.ZERO ;
      A4490DibPreOf15 = DecimalUtil.ZERO ;
      A4489DibPreOf14 = DecimalUtil.ZERO ;
      A4488DibPreOf13 = DecimalUtil.ZERO ;
      A4487DibPreOf12 = DecimalUtil.ZERO ;
      A4486DibPreOf11 = DecimalUtil.ZERO ;
      A1892DibPreOf10 = DecimalUtil.ZERO ;
      A1891DibPreOf1 = DecimalUtil.ZERO ;
      A1890DibPreAy9 = DecimalUtil.ZERO ;
      A1889DibPreAy8 = DecimalUtil.ZERO ;
      A1888DibPreAy7 = DecimalUtil.ZERO ;
      A1887DibPreAy6 = DecimalUtil.ZERO ;
      A1886DibPreAy5 = DecimalUtil.ZERO ;
      A1885DibPreAy4 = DecimalUtil.ZERO ;
      A1884DibPreAy3 = DecimalUtil.ZERO ;
      A1883DibPreAy2 = DecimalUtil.ZERO ;
      A4485DibPreAy16 = DecimalUtil.ZERO ;
      A4484DibPreAy15 = DecimalUtil.ZERO ;
      A4483DibPreAy14 = DecimalUtil.ZERO ;
      A4482DibPreAy13 = DecimalUtil.ZERO ;
      A4481DibPreAy12 = DecimalUtil.ZERO ;
      A4480DibPreAy11 = DecimalUtil.ZERO ;
      A1882DibPreAy10 = DecimalUtil.ZERO ;
      A1881DibPreAy1 = DecimalUtil.ZERO ;
      A1811DibPosVor = "" ;
      A1610DibPosRas = "" ;
      A1609DibObs2 = "" ;
      A1020DibObs = "" ;
      A1023DibMot = "" ;
      A1018DibMetRea = DecimalUtil.ZERO ;
      A1607DibMed = "" ;
      A1605DibLocal = "" ;
      A1806DibLevMaq = "" ;
      A1022DibImp = DecimalUtil.ZERO ;
      A1880DibGraNum = "" ;
      A1015DibFecUlt = GXutil.nullDate() ;
      A1016DibFecPed = GXutil.nullDate() ;
      A1017DibFecEnt = GXutil.nullDate() ;
      A6841DibDsc = "" ;
      A4861DibCob = DecimalUtil.ZERO ;
      A7140DibBmp = "" ;
      A4902DibCobTot = DecimalUtil.ZERO ;
      W1013DibCli = "" ;
      P02XU5_A396EmprCod = new String[] {""} ;
      P02XU5_A1013DibCli = new String[] {""} ;
      P02XU5_A252CliCod = new int[1] ;
      P02XU5_A1014DibInt = new int[1] ;
      P02XU5_A10511DibOrgClid = new int[1] ;
      P02XU5_n10511DibOrgClid = new boolean[] {false} ;
      P02XU5_A10510DibOrgLi = new short[1] ;
      P02XU5_n10510DibOrgLi = new boolean[] {false} ;
      P02XU5_A10509DibOrgCl = new String[] {""} ;
      P02XU5_n10509DibOrgCl = new boolean[] {false} ;
      P02XU5_A10508DibOrgIn = new int[1] ;
      P02XU5_n10508DibOrgIn = new boolean[] {false} ;
      P02XU5_A1808DibOrdCil = new byte[1] ;
      P02XU5_n1808DibOrdCil = new boolean[] {false} ;
      P02XU5_A2089DibLinMol = new byte[1] ;
      P02XU5_n2089DibLinMol = new boolean[] {false} ;
      P02XU5_A1807DibLinCil = new short[1] ;
      P02XU5_A10793DibCilUlt = new int[1] ;
      P02XU5_n10793DibCilUlt = new boolean[] {false} ;
      P02XU5_A10788DibCilMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU5_n10788DibCilMts = new boolean[] {false} ;
      P02XU5_A10787DibCilStF = new java.util.Date[] {GXutil.nullDate()} ;
      P02XU5_n10787DibCilStF = new boolean[] {false} ;
      P02XU5_A10786DibCilSt = new byte[1] ;
      P02XU5_n10786DibCilSt = new boolean[] {false} ;
      P02XU5_A10785DibCilMesh = new short[1] ;
      P02XU5_n10785DibCilMesh = new boolean[] {false} ;
      P02XU5_A10772DibPres = new String[] {""} ;
      P02XU5_n10772DibPres = new boolean[] {false} ;
      P02XU5_A10771DibDm = new byte[1] ;
      P02XU5_n10771DibDm = new boolean[] {false} ;
      P02XU5_A8658DibIntSp = new int[1] ;
      P02XU5_n8658DibIntSp = new boolean[] {false} ;
      P02XU5_A8415DibActivo = new String[] {""} ;
      P02XU5_n8415DibActivo = new boolean[] {false} ;
      P02XU5_A7027DibLinMalC = new String[] {""} ;
      P02XU5_n7027DibLinMalC = new boolean[] {false} ;
      P02XU5_A7026DibCilCod = new String[] {""} ;
      P02XU5_n7026DibCilCod = new boolean[] {false} ;
      P02XU5_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU5_n4860DibPrcCob = new boolean[] {false} ;
      P02XU5_A1810DibPosCil = new byte[1] ;
      P02XU5_n1810DibPosCil = new boolean[] {false} ;
      P02XU5_A1826TipCilCod = new byte[1] ;
      P02XU5_n1826TipCilCod = new boolean[] {false} ;
      P02XU5_A1030DibRelMC = new String[] {""} ;
      P02XU5_n1030DibRelMC = new boolean[] {false} ;
      A10509DibOrgCl = "" ;
      A10788DibCilMts = DecimalUtil.ZERO ;
      A10787DibCilStF = GXutil.nullDate() ;
      A10772DibPres = "" ;
      A8415DibActivo = "" ;
      A7027DibLinMalC = "" ;
      A7026DibCilCod = "" ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      A1030DibRelMC = "" ;
      AV34DibCliAux = "" ;
      W10509DibOrgCl = "" ;
      Gx_emsg = "" ;
      P02XU7_A396EmprCod = new String[] {""} ;
      P02XU7_A1013DibCli = new String[] {""} ;
      P02XU7_A252CliCod = new int[1] ;
      P02XU7_A1014DibInt = new int[1] ;
      P02XU7_A7508DibOrgCliC = new int[1] ;
      P02XU7_n7508DibOrgCliC = new boolean[] {false} ;
      P02XU7_A7507DibOrgLin = new short[1] ;
      P02XU7_n7507DibOrgLin = new boolean[] {false} ;
      P02XU7_A7506DibOrgCli = new String[] {""} ;
      P02XU7_n7506DibOrgCli = new boolean[] {false} ;
      P02XU7_A7505DibOrgInt = new int[1] ;
      P02XU7_n7505DibOrgInt = new boolean[] {false} ;
      P02XU7_A1809DibOrdMol = new byte[1] ;
      P02XU7_n1809DibOrdMol = new boolean[] {false} ;
      P02XU7_A2088DibDibMol = new byte[1] ;
      P02XU7_n2088DibDibMol = new boolean[] {false} ;
      P02XU7_A1029DibLin = new short[1] ;
      P02XU7_A6840DibLinMal = new String[] {""} ;
      P02XU7_n6840DibLinMal = new boolean[] {false} ;
      P02XU7_A6839DibMolCod = new String[] {""} ;
      P02XU7_n6839DibMolCod = new boolean[] {false} ;
      P02XU7_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XU7_n5381DibPrcCobM = new boolean[] {false} ;
      P02XU7_A1828TipGomCod = new byte[1] ;
      P02XU7_n1828TipGomCod = new boolean[] {false} ;
      P02XU7_A1830TipPasCod = new byte[1] ;
      P02XU7_n1830TipPasCod = new boolean[] {false} ;
      P02XU7_A2092DibRelMC2 = new String[] {""} ;
      P02XU7_n2092DibRelMC2 = new boolean[] {false} ;
      A7506DibOrgCli = "" ;
      A6840DibLinMal = "" ;
      A6839DibMolCod = "" ;
      A5381DibPrcCobM = DecimalUtil.ZERO ;
      A2092DibRelMC2 = "" ;
      W7506DibOrgCli = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int4 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoplin__default(),
         new Object[] {
             new Object[] {
            P02XU4_A396EmprCod, P02XU4_A1013DibCli, P02XU4_A252CliCod, P02XU4_A1014DibInt, P02XU4_A3911TipMqnCod, P02XU4_n3911TipMqnCod, P02XU4_A1005GrabCod, P02XU4_n1005GrabCod, P02XU4_A1825DibVelMaq, P02XU4_n1825DibVelMaq,
            P02XU4_A1024DibUltLin, P02XU4_n1024DibUltLin, P02XU4_A1824DibUltCil, P02XU4_n1824DibUltCil, P02XU4_A1606DibTipRas, P02XU4_n1606DibTipRas, P02XU4_A1823DibTipMaq, P02XU4_n1823DibTipMaq, P02XU4_A1822DibTemQm9, P02XU4_n1822DibTemQm9,
            P02XU4_A1821DibTemQm8, P02XU4_n1821DibTemQm8, P02XU4_A1820DibTemQm7, P02XU4_n1820DibTemQm7, P02XU4_A1819DibTemQm6, P02XU4_n1819DibTemQm6, P02XU4_A1818DibTemQm5, P02XU4_n1818DibTemQm5, P02XU4_A1817DibTemQm4, P02XU4_n1817DibTemQm4,
            P02XU4_A1816DibTemQm3, P02XU4_n1816DibTemQm3, P02XU4_A1815DibTemQm2, P02XU4_n1815DibTemQm2, P02XU4_A1814DibTemQm10, P02XU4_n1814DibTemQm10, P02XU4_A1813DibTemQm1, P02XU4_n1813DibTemQm1, P02XU4_A1608DibRap, P02XU4_n1608DibRap,
            P02XU4_A1900DibPreOf9, P02XU4_n1900DibPreOf9, P02XU4_A1899DibPreOf8, P02XU4_n1899DibPreOf8, P02XU4_A1898DibPreOf7, P02XU4_n1898DibPreOf7, P02XU4_A1897DibPreOf6, P02XU4_n1897DibPreOf6, P02XU4_A1896DibPreOf5, P02XU4_n1896DibPreOf5,
            P02XU4_A1895DibPreOf4, P02XU4_n1895DibPreOf4, P02XU4_A1894DibPreOf3, P02XU4_n1894DibPreOf3, P02XU4_A1893DibPreOf2, P02XU4_n1893DibPreOf2, P02XU4_A4491DibPreOf16, P02XU4_n4491DibPreOf16, P02XU4_A4490DibPreOf15, P02XU4_n4490DibPreOf15,
            P02XU4_A4489DibPreOf14, P02XU4_n4489DibPreOf14, P02XU4_A4488DibPreOf13, P02XU4_n4488DibPreOf13, P02XU4_A4487DibPreOf12, P02XU4_n4487DibPreOf12, P02XU4_A4486DibPreOf11, P02XU4_n4486DibPreOf11, P02XU4_A1892DibPreOf10, P02XU4_n1892DibPreOf10,
            P02XU4_A1891DibPreOf1, P02XU4_n1891DibPreOf1, P02XU4_A1890DibPreAy9, P02XU4_n1890DibPreAy9, P02XU4_A1889DibPreAy8, P02XU4_n1889DibPreAy8, P02XU4_A1888DibPreAy7, P02XU4_n1888DibPreAy7, P02XU4_A1887DibPreAy6, P02XU4_n1887DibPreAy6,
            P02XU4_A1886DibPreAy5, P02XU4_n1886DibPreAy5, P02XU4_A1885DibPreAy4, P02XU4_n1885DibPreAy4, P02XU4_A1884DibPreAy3, P02XU4_n1884DibPreAy3, P02XU4_A1883DibPreAy2, P02XU4_n1883DibPreAy2, P02XU4_A4485DibPreAy16, P02XU4_n4485DibPreAy16,
            P02XU4_A4484DibPreAy15, P02XU4_n4484DibPreAy15, P02XU4_A4483DibPreAy14, P02XU4_n4483DibPreAy14, P02XU4_A4482DibPreAy13, P02XU4_n4482DibPreAy13, P02XU4_A4481DibPreAy12, P02XU4_n4481DibPreAy12, P02XU4_A4480DibPreAy11, P02XU4_n4480DibPreAy11,
            P02XU4_A1882DibPreAy10, P02XU4_n1882DibPreAy10, P02XU4_A1881DibPreAy1, P02XU4_n1881DibPreAy1, P02XU4_A1811DibPosVor, P02XU4_n1811DibPosVor, P02XU4_A1610DibPosRas, P02XU4_n1610DibPosRas, P02XU4_A2523DibObsUL, P02XU4_n2523DibObsUL,
            P02XU4_A1609DibObs2, P02XU4_n1609DibObs2, P02XU4_A1020DibObs, P02XU4_n1020DibObs, P02XU4_A1023DibMot, P02XU4_n1023DibMot, P02XU4_A1019DibMolCil, P02XU4_n1019DibMolCil, P02XU4_A2090DibMolCi2, P02XU4_n2090DibMolCi2,
            P02XU4_A1018DibMetRea, P02XU4_n1018DibMetRea, P02XU4_A1607DibMed, P02XU4_n1607DibMed, P02XU4_A1605DibLocal, P02XU4_n1605DibLocal, P02XU4_A1806DibLevMaq, P02XU4_n1806DibLevMaq, P02XU4_A1022DibImp, P02XU4_n1022DibImp,
            P02XU4_A1880DibGraNum, P02XU4_n1880DibGraNum, P02XU4_A1015DibFecUlt, P02XU4_n1015DibFecUlt, P02XU4_A1016DibFecPed, P02XU4_n1016DibFecPed, P02XU4_A1017DibFecEnt, P02XU4_n1017DibFecEnt, P02XU4_A6841DibDsc, P02XU4_n6841DibDsc,
            P02XU4_A4861DibCob, P02XU4_n4861DibCob, P02XU4_A1021DibCar, P02XU4_n1021DibCar, P02XU4_A7140DibBmp, P02XU4_n7140DibBmp, P02XU4_A1025DibNumLin, P02XU4_A2091DibNumLi2, P02XU4_n2091DibNumLi2, P02XU4_A4902DibCobTot
            }
            , new Object[] {
            P02XU5_A396EmprCod, P02XU5_A1013DibCli, P02XU5_A252CliCod, P02XU5_A1014DibInt, P02XU5_A10511DibOrgClid, P02XU5_n10511DibOrgClid, P02XU5_A10510DibOrgLi, P02XU5_n10510DibOrgLi, P02XU5_A10509DibOrgCl, P02XU5_n10509DibOrgCl,
            P02XU5_A10508DibOrgIn, P02XU5_n10508DibOrgIn, P02XU5_A1808DibOrdCil, P02XU5_n1808DibOrdCil, P02XU5_A2089DibLinMol, P02XU5_n2089DibLinMol, P02XU5_A1807DibLinCil, P02XU5_A10793DibCilUlt, P02XU5_n10793DibCilUlt, P02XU5_A10788DibCilMts,
            P02XU5_n10788DibCilMts, P02XU5_A10787DibCilStF, P02XU5_n10787DibCilStF, P02XU5_A10786DibCilSt, P02XU5_n10786DibCilSt, P02XU5_A10785DibCilMesh, P02XU5_n10785DibCilMesh, P02XU5_A10772DibPres, P02XU5_n10772DibPres, P02XU5_A10771DibDm,
            P02XU5_n10771DibDm, P02XU5_A8658DibIntSp, P02XU5_n8658DibIntSp, P02XU5_A8415DibActivo, P02XU5_n8415DibActivo, P02XU5_A7027DibLinMalC, P02XU5_n7027DibLinMalC, P02XU5_A7026DibCilCod, P02XU5_n7026DibCilCod, P02XU5_A4860DibPrcCob,
            P02XU5_n4860DibPrcCob, P02XU5_A1810DibPosCil, P02XU5_n1810DibPosCil, P02XU5_A1826TipCilCod, P02XU5_n1826TipCilCod, P02XU5_A1030DibRelMC, P02XU5_n1030DibRelMC
            }
            , new Object[] {
            }
            , new Object[] {
            P02XU7_A396EmprCod, P02XU7_A1013DibCli, P02XU7_A252CliCod, P02XU7_A1014DibInt, P02XU7_A7508DibOrgCliC, P02XU7_n7508DibOrgCliC, P02XU7_A7507DibOrgLin, P02XU7_n7507DibOrgLin, P02XU7_A7506DibOrgCli, P02XU7_n7506DibOrgCli,
            P02XU7_A7505DibOrgInt, P02XU7_n7505DibOrgInt, P02XU7_A1809DibOrdMol, P02XU7_n1809DibOrdMol, P02XU7_A2088DibDibMol, P02XU7_n2088DibDibMol, P02XU7_A1029DibLin, P02XU7_A6840DibLinMal, P02XU7_n6840DibLinMal, P02XU7_A6839DibMolCod,
            P02XU7_n6839DibMolCod, P02XU7_A5381DibPrcCobM, P02XU7_n5381DibPrcCobM, P02XU7_A1828TipGomCod, P02XU7_n1828TipGomCod, P02XU7_A1830TipPasCod, P02XU7_n1830TipPasCod, P02XU7_A2092DibRelMC2, P02XU7_n2092DibRelMC2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38Orden ;
   private byte A3911TipMqnCod ;
   private byte A2523DibObsUL ;
   private byte A1021DibCar ;
   private byte A1808DibOrdCil ;
   private byte A2089DibLinMol ;
   private byte A10786DibCilSt ;
   private byte A10771DibDm ;
   private byte A1810DibPosCil ;
   private byte A1826TipCilCod ;
   private byte AV40DibOrdCil ;
   private byte AV42DibLinMol ;
   private byte W1808DibOrdCil ;
   private byte W2089DibLinMol ;
   private byte A1809DibOrdMol ;
   private byte A2088DibDibMol ;
   private byte A1828TipGomCod ;
   private byte A1830TipPasCod ;
   private byte AV41DibOrdMol ;
   private byte AV43DibDibMol ;
   private byte W1809DibOrdMol ;
   private byte W2088DibDibMol ;
   private short A1005GrabCod ;
   private short A1825DibVelMaq ;
   private short A1024DibUltLin ;
   private short A1824DibUltCil ;
   private short A1822DibTemQm9 ;
   private short A1821DibTemQm8 ;
   private short A1820DibTemQm7 ;
   private short A1819DibTemQm6 ;
   private short A1818DibTemQm5 ;
   private short A1817DibTemQm4 ;
   private short A1816DibTemQm3 ;
   private short A1815DibTemQm2 ;
   private short A1814DibTemQm10 ;
   private short A1813DibTemQm1 ;
   private short A1019DibMolCil ;
   private short A2090DibMolCi2 ;
   private short A1025DibNumLin ;
   private short A2091DibNumLi2 ;
   private short A10510DibOrgLi ;
   private short A1807DibLinCil ;
   private short A10785DibCilMesh ;
   private short AV27DibLinCil ;
   private short AV44DibLinAux ;
   private short W1807DibLinCil ;
   private short W10510DibOrgLi ;
   private short Gx_err ;
   private short A7507DibOrgLin ;
   private short A1029DibLin ;
   private short AV28DibLin ;
   private short W1029DibLin ;
   private short W7507DibOrgLin ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV30CliCod ;
   private int AV31DibInt ;
   private int W252CliCod ;
   private int W1014DibInt ;
   private int A10511DibOrgClid ;
   private int A10508DibOrgIn ;
   private int A10793DibCilUlt ;
   private int A8658DibIntSp ;
   private int AV33DibIntAux ;
   private int AV35Clicodaux ;
   private int GX_INS549 ;
   private int W10508DibOrgIn ;
   private int W10511DibOrgClid ;
   private int A7508DibOrgCliC ;
   private int A7505DibOrgInt ;
   private int GX_INS550 ;
   private int W7505DibOrgInt ;
   private int W7508DibOrgCliC ;
   private int GXt_int1 ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal A1608DibRap ;
   private java.math.BigDecimal A1900DibPreOf9 ;
   private java.math.BigDecimal A1899DibPreOf8 ;
   private java.math.BigDecimal A1898DibPreOf7 ;
   private java.math.BigDecimal A1897DibPreOf6 ;
   private java.math.BigDecimal A1896DibPreOf5 ;
   private java.math.BigDecimal A1895DibPreOf4 ;
   private java.math.BigDecimal A1894DibPreOf3 ;
   private java.math.BigDecimal A1893DibPreOf2 ;
   private java.math.BigDecimal A4491DibPreOf16 ;
   private java.math.BigDecimal A4490DibPreOf15 ;
   private java.math.BigDecimal A4489DibPreOf14 ;
   private java.math.BigDecimal A4488DibPreOf13 ;
   private java.math.BigDecimal A4487DibPreOf12 ;
   private java.math.BigDecimal A4486DibPreOf11 ;
   private java.math.BigDecimal A1892DibPreOf10 ;
   private java.math.BigDecimal A1891DibPreOf1 ;
   private java.math.BigDecimal A1890DibPreAy9 ;
   private java.math.BigDecimal A1889DibPreAy8 ;
   private java.math.BigDecimal A1888DibPreAy7 ;
   private java.math.BigDecimal A1887DibPreAy6 ;
   private java.math.BigDecimal A1886DibPreAy5 ;
   private java.math.BigDecimal A1885DibPreAy4 ;
   private java.math.BigDecimal A1884DibPreAy3 ;
   private java.math.BigDecimal A1883DibPreAy2 ;
   private java.math.BigDecimal A4485DibPreAy16 ;
   private java.math.BigDecimal A4484DibPreAy15 ;
   private java.math.BigDecimal A4483DibPreAy14 ;
   private java.math.BigDecimal A4482DibPreAy13 ;
   private java.math.BigDecimal A4481DibPreAy12 ;
   private java.math.BigDecimal A4480DibPreAy11 ;
   private java.math.BigDecimal A1882DibPreAy10 ;
   private java.math.BigDecimal A1881DibPreAy1 ;
   private java.math.BigDecimal A1018DibMetRea ;
   private java.math.BigDecimal A1022DibImp ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A4902DibCobTot ;
   private java.math.BigDecimal A10788DibCilMts ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private java.math.BigDecimal A5381DibPrcCobM ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String AV29Dibcli ;
   private String scmdbuf ;
   private String A1606DibTipRas ;
   private String A1823DibTipMaq ;
   private String A1811DibPosVor ;
   private String A1610DibPosRas ;
   private String A1609DibObs2 ;
   private String A1020DibObs ;
   private String A1023DibMot ;
   private String A1607DibMed ;
   private String A1605DibLocal ;
   private String A1806DibLevMaq ;
   private String A1880DibGraNum ;
   private String A6841DibDsc ;
   private String A7140DibBmp ;
   private String W1013DibCli ;
   private String A10509DibOrgCl ;
   private String A10772DibPres ;
   private String A8415DibActivo ;
   private String A7027DibLinMalC ;
   private String A7026DibCilCod ;
   private String A1030DibRelMC ;
   private String AV34DibCliAux ;
   private String W10509DibOrgCl ;
   private String Gx_emsg ;
   private String A7506DibOrgCli ;
   private String A6840DibLinMal ;
   private String A6839DibMolCod ;
   private String A2092DibRelMC2 ;
   private String W7506DibOrgCli ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date A1015DibFecUlt ;
   private java.util.Date A1016DibFecPed ;
   private java.util.Date A1017DibFecEnt ;
   private java.util.Date A10787DibCilStF ;
   private boolean n3911TipMqnCod ;
   private boolean n1005GrabCod ;
   private boolean n1825DibVelMaq ;
   private boolean n1024DibUltLin ;
   private boolean n1824DibUltCil ;
   private boolean n1606DibTipRas ;
   private boolean n1823DibTipMaq ;
   private boolean n1822DibTemQm9 ;
   private boolean n1821DibTemQm8 ;
   private boolean n1820DibTemQm7 ;
   private boolean n1819DibTemQm6 ;
   private boolean n1818DibTemQm5 ;
   private boolean n1817DibTemQm4 ;
   private boolean n1816DibTemQm3 ;
   private boolean n1815DibTemQm2 ;
   private boolean n1814DibTemQm10 ;
   private boolean n1813DibTemQm1 ;
   private boolean n1608DibRap ;
   private boolean n1900DibPreOf9 ;
   private boolean n1899DibPreOf8 ;
   private boolean n1898DibPreOf7 ;
   private boolean n1897DibPreOf6 ;
   private boolean n1896DibPreOf5 ;
   private boolean n1895DibPreOf4 ;
   private boolean n1894DibPreOf3 ;
   private boolean n1893DibPreOf2 ;
   private boolean n4491DibPreOf16 ;
   private boolean n4490DibPreOf15 ;
   private boolean n4489DibPreOf14 ;
   private boolean n4488DibPreOf13 ;
   private boolean n4487DibPreOf12 ;
   private boolean n4486DibPreOf11 ;
   private boolean n1892DibPreOf10 ;
   private boolean n1891DibPreOf1 ;
   private boolean n1890DibPreAy9 ;
   private boolean n1889DibPreAy8 ;
   private boolean n1888DibPreAy7 ;
   private boolean n1887DibPreAy6 ;
   private boolean n1886DibPreAy5 ;
   private boolean n1885DibPreAy4 ;
   private boolean n1884DibPreAy3 ;
   private boolean n1883DibPreAy2 ;
   private boolean n4485DibPreAy16 ;
   private boolean n4484DibPreAy15 ;
   private boolean n4483DibPreAy14 ;
   private boolean n4482DibPreAy13 ;
   private boolean n4481DibPreAy12 ;
   private boolean n4480DibPreAy11 ;
   private boolean n1882DibPreAy10 ;
   private boolean n1881DibPreAy1 ;
   private boolean n1811DibPosVor ;
   private boolean n1610DibPosRas ;
   private boolean n2523DibObsUL ;
   private boolean n1609DibObs2 ;
   private boolean n1020DibObs ;
   private boolean n1023DibMot ;
   private boolean n1019DibMolCil ;
   private boolean n2090DibMolCi2 ;
   private boolean n1018DibMetRea ;
   private boolean n1607DibMed ;
   private boolean n1605DibLocal ;
   private boolean n1806DibLevMaq ;
   private boolean n1022DibImp ;
   private boolean n1880DibGraNum ;
   private boolean n1015DibFecUlt ;
   private boolean n1016DibFecPed ;
   private boolean n1017DibFecEnt ;
   private boolean n6841DibDsc ;
   private boolean n4861DibCob ;
   private boolean n1021DibCar ;
   private boolean n7140DibBmp ;
   private boolean n2091DibNumLi2 ;
   private boolean n10511DibOrgClid ;
   private boolean n10510DibOrgLi ;
   private boolean n10509DibOrgCl ;
   private boolean n10508DibOrgIn ;
   private boolean n1808DibOrdCil ;
   private boolean n2089DibLinMol ;
   private boolean n10793DibCilUlt ;
   private boolean n10788DibCilMts ;
   private boolean n10787DibCilStF ;
   private boolean n10786DibCilSt ;
   private boolean n10785DibCilMesh ;
   private boolean n10772DibPres ;
   private boolean n10771DibDm ;
   private boolean n8658DibIntSp ;
   private boolean n8415DibActivo ;
   private boolean n7027DibLinMalC ;
   private boolean n7026DibCilCod ;
   private boolean n4860DibPrcCob ;
   private boolean n1810DibPosCil ;
   private boolean n1826TipCilCod ;
   private boolean n1030DibRelMC ;
   private boolean n7508DibOrgCliC ;
   private boolean n7507DibOrgLin ;
   private boolean n7506DibOrgCli ;
   private boolean n7505DibOrgInt ;
   private boolean n1809DibOrdMol ;
   private boolean n2088DibDibMol ;
   private boolean n6840DibLinMal ;
   private boolean n6839DibMolCod ;
   private boolean n5381DibPrcCobM ;
   private boolean n1828TipGomCod ;
   private boolean n1830TipPasCod ;
   private boolean n2092DibRelMC2 ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XU4_A396EmprCod ;
   private String[] P02XU4_A1013DibCli ;
   private int[] P02XU4_A252CliCod ;
   private int[] P02XU4_A1014DibInt ;
   private byte[] P02XU4_A3911TipMqnCod ;
   private boolean[] P02XU4_n3911TipMqnCod ;
   private short[] P02XU4_A1005GrabCod ;
   private boolean[] P02XU4_n1005GrabCod ;
   private short[] P02XU4_A1825DibVelMaq ;
   private boolean[] P02XU4_n1825DibVelMaq ;
   private short[] P02XU4_A1024DibUltLin ;
   private boolean[] P02XU4_n1024DibUltLin ;
   private short[] P02XU4_A1824DibUltCil ;
   private boolean[] P02XU4_n1824DibUltCil ;
   private String[] P02XU4_A1606DibTipRas ;
   private boolean[] P02XU4_n1606DibTipRas ;
   private String[] P02XU4_A1823DibTipMaq ;
   private boolean[] P02XU4_n1823DibTipMaq ;
   private short[] P02XU4_A1822DibTemQm9 ;
   private boolean[] P02XU4_n1822DibTemQm9 ;
   private short[] P02XU4_A1821DibTemQm8 ;
   private boolean[] P02XU4_n1821DibTemQm8 ;
   private short[] P02XU4_A1820DibTemQm7 ;
   private boolean[] P02XU4_n1820DibTemQm7 ;
   private short[] P02XU4_A1819DibTemQm6 ;
   private boolean[] P02XU4_n1819DibTemQm6 ;
   private short[] P02XU4_A1818DibTemQm5 ;
   private boolean[] P02XU4_n1818DibTemQm5 ;
   private short[] P02XU4_A1817DibTemQm4 ;
   private boolean[] P02XU4_n1817DibTemQm4 ;
   private short[] P02XU4_A1816DibTemQm3 ;
   private boolean[] P02XU4_n1816DibTemQm3 ;
   private short[] P02XU4_A1815DibTemQm2 ;
   private boolean[] P02XU4_n1815DibTemQm2 ;
   private short[] P02XU4_A1814DibTemQm10 ;
   private boolean[] P02XU4_n1814DibTemQm10 ;
   private short[] P02XU4_A1813DibTemQm1 ;
   private boolean[] P02XU4_n1813DibTemQm1 ;
   private java.math.BigDecimal[] P02XU4_A1608DibRap ;
   private boolean[] P02XU4_n1608DibRap ;
   private java.math.BigDecimal[] P02XU4_A1900DibPreOf9 ;
   private boolean[] P02XU4_n1900DibPreOf9 ;
   private java.math.BigDecimal[] P02XU4_A1899DibPreOf8 ;
   private boolean[] P02XU4_n1899DibPreOf8 ;
   private java.math.BigDecimal[] P02XU4_A1898DibPreOf7 ;
   private boolean[] P02XU4_n1898DibPreOf7 ;
   private java.math.BigDecimal[] P02XU4_A1897DibPreOf6 ;
   private boolean[] P02XU4_n1897DibPreOf6 ;
   private java.math.BigDecimal[] P02XU4_A1896DibPreOf5 ;
   private boolean[] P02XU4_n1896DibPreOf5 ;
   private java.math.BigDecimal[] P02XU4_A1895DibPreOf4 ;
   private boolean[] P02XU4_n1895DibPreOf4 ;
   private java.math.BigDecimal[] P02XU4_A1894DibPreOf3 ;
   private boolean[] P02XU4_n1894DibPreOf3 ;
   private java.math.BigDecimal[] P02XU4_A1893DibPreOf2 ;
   private boolean[] P02XU4_n1893DibPreOf2 ;
   private java.math.BigDecimal[] P02XU4_A4491DibPreOf16 ;
   private boolean[] P02XU4_n4491DibPreOf16 ;
   private java.math.BigDecimal[] P02XU4_A4490DibPreOf15 ;
   private boolean[] P02XU4_n4490DibPreOf15 ;
   private java.math.BigDecimal[] P02XU4_A4489DibPreOf14 ;
   private boolean[] P02XU4_n4489DibPreOf14 ;
   private java.math.BigDecimal[] P02XU4_A4488DibPreOf13 ;
   private boolean[] P02XU4_n4488DibPreOf13 ;
   private java.math.BigDecimal[] P02XU4_A4487DibPreOf12 ;
   private boolean[] P02XU4_n4487DibPreOf12 ;
   private java.math.BigDecimal[] P02XU4_A4486DibPreOf11 ;
   private boolean[] P02XU4_n4486DibPreOf11 ;
   private java.math.BigDecimal[] P02XU4_A1892DibPreOf10 ;
   private boolean[] P02XU4_n1892DibPreOf10 ;
   private java.math.BigDecimal[] P02XU4_A1891DibPreOf1 ;
   private boolean[] P02XU4_n1891DibPreOf1 ;
   private java.math.BigDecimal[] P02XU4_A1890DibPreAy9 ;
   private boolean[] P02XU4_n1890DibPreAy9 ;
   private java.math.BigDecimal[] P02XU4_A1889DibPreAy8 ;
   private boolean[] P02XU4_n1889DibPreAy8 ;
   private java.math.BigDecimal[] P02XU4_A1888DibPreAy7 ;
   private boolean[] P02XU4_n1888DibPreAy7 ;
   private java.math.BigDecimal[] P02XU4_A1887DibPreAy6 ;
   private boolean[] P02XU4_n1887DibPreAy6 ;
   private java.math.BigDecimal[] P02XU4_A1886DibPreAy5 ;
   private boolean[] P02XU4_n1886DibPreAy5 ;
   private java.math.BigDecimal[] P02XU4_A1885DibPreAy4 ;
   private boolean[] P02XU4_n1885DibPreAy4 ;
   private java.math.BigDecimal[] P02XU4_A1884DibPreAy3 ;
   private boolean[] P02XU4_n1884DibPreAy3 ;
   private java.math.BigDecimal[] P02XU4_A1883DibPreAy2 ;
   private boolean[] P02XU4_n1883DibPreAy2 ;
   private java.math.BigDecimal[] P02XU4_A4485DibPreAy16 ;
   private boolean[] P02XU4_n4485DibPreAy16 ;
   private java.math.BigDecimal[] P02XU4_A4484DibPreAy15 ;
   private boolean[] P02XU4_n4484DibPreAy15 ;
   private java.math.BigDecimal[] P02XU4_A4483DibPreAy14 ;
   private boolean[] P02XU4_n4483DibPreAy14 ;
   private java.math.BigDecimal[] P02XU4_A4482DibPreAy13 ;
   private boolean[] P02XU4_n4482DibPreAy13 ;
   private java.math.BigDecimal[] P02XU4_A4481DibPreAy12 ;
   private boolean[] P02XU4_n4481DibPreAy12 ;
   private java.math.BigDecimal[] P02XU4_A4480DibPreAy11 ;
   private boolean[] P02XU4_n4480DibPreAy11 ;
   private java.math.BigDecimal[] P02XU4_A1882DibPreAy10 ;
   private boolean[] P02XU4_n1882DibPreAy10 ;
   private java.math.BigDecimal[] P02XU4_A1881DibPreAy1 ;
   private boolean[] P02XU4_n1881DibPreAy1 ;
   private String[] P02XU4_A1811DibPosVor ;
   private boolean[] P02XU4_n1811DibPosVor ;
   private String[] P02XU4_A1610DibPosRas ;
   private boolean[] P02XU4_n1610DibPosRas ;
   private byte[] P02XU4_A2523DibObsUL ;
   private boolean[] P02XU4_n2523DibObsUL ;
   private String[] P02XU4_A1609DibObs2 ;
   private boolean[] P02XU4_n1609DibObs2 ;
   private String[] P02XU4_A1020DibObs ;
   private boolean[] P02XU4_n1020DibObs ;
   private String[] P02XU4_A1023DibMot ;
   private boolean[] P02XU4_n1023DibMot ;
   private short[] P02XU4_A1019DibMolCil ;
   private boolean[] P02XU4_n1019DibMolCil ;
   private short[] P02XU4_A2090DibMolCi2 ;
   private boolean[] P02XU4_n2090DibMolCi2 ;
   private java.math.BigDecimal[] P02XU4_A1018DibMetRea ;
   private boolean[] P02XU4_n1018DibMetRea ;
   private String[] P02XU4_A1607DibMed ;
   private boolean[] P02XU4_n1607DibMed ;
   private String[] P02XU4_A1605DibLocal ;
   private boolean[] P02XU4_n1605DibLocal ;
   private String[] P02XU4_A1806DibLevMaq ;
   private boolean[] P02XU4_n1806DibLevMaq ;
   private java.math.BigDecimal[] P02XU4_A1022DibImp ;
   private boolean[] P02XU4_n1022DibImp ;
   private String[] P02XU4_A1880DibGraNum ;
   private boolean[] P02XU4_n1880DibGraNum ;
   private java.util.Date[] P02XU4_A1015DibFecUlt ;
   private boolean[] P02XU4_n1015DibFecUlt ;
   private java.util.Date[] P02XU4_A1016DibFecPed ;
   private boolean[] P02XU4_n1016DibFecPed ;
   private java.util.Date[] P02XU4_A1017DibFecEnt ;
   private boolean[] P02XU4_n1017DibFecEnt ;
   private String[] P02XU4_A6841DibDsc ;
   private boolean[] P02XU4_n6841DibDsc ;
   private java.math.BigDecimal[] P02XU4_A4861DibCob ;
   private boolean[] P02XU4_n4861DibCob ;
   private byte[] P02XU4_A1021DibCar ;
   private boolean[] P02XU4_n1021DibCar ;
   private String[] P02XU4_A7140DibBmp ;
   private boolean[] P02XU4_n7140DibBmp ;
   private short[] P02XU4_A1025DibNumLin ;
   private short[] P02XU4_A2091DibNumLi2 ;
   private boolean[] P02XU4_n2091DibNumLi2 ;
   private java.math.BigDecimal[] P02XU4_A4902DibCobTot ;
   private String[] P02XU5_A396EmprCod ;
   private String[] P02XU5_A1013DibCli ;
   private int[] P02XU5_A252CliCod ;
   private int[] P02XU5_A1014DibInt ;
   private int[] P02XU5_A10511DibOrgClid ;
   private boolean[] P02XU5_n10511DibOrgClid ;
   private short[] P02XU5_A10510DibOrgLi ;
   private boolean[] P02XU5_n10510DibOrgLi ;
   private String[] P02XU5_A10509DibOrgCl ;
   private boolean[] P02XU5_n10509DibOrgCl ;
   private int[] P02XU5_A10508DibOrgIn ;
   private boolean[] P02XU5_n10508DibOrgIn ;
   private byte[] P02XU5_A1808DibOrdCil ;
   private boolean[] P02XU5_n1808DibOrdCil ;
   private byte[] P02XU5_A2089DibLinMol ;
   private boolean[] P02XU5_n2089DibLinMol ;
   private short[] P02XU5_A1807DibLinCil ;
   private int[] P02XU5_A10793DibCilUlt ;
   private boolean[] P02XU5_n10793DibCilUlt ;
   private java.math.BigDecimal[] P02XU5_A10788DibCilMts ;
   private boolean[] P02XU5_n10788DibCilMts ;
   private java.util.Date[] P02XU5_A10787DibCilStF ;
   private boolean[] P02XU5_n10787DibCilStF ;
   private byte[] P02XU5_A10786DibCilSt ;
   private boolean[] P02XU5_n10786DibCilSt ;
   private short[] P02XU5_A10785DibCilMesh ;
   private boolean[] P02XU5_n10785DibCilMesh ;
   private String[] P02XU5_A10772DibPres ;
   private boolean[] P02XU5_n10772DibPres ;
   private byte[] P02XU5_A10771DibDm ;
   private boolean[] P02XU5_n10771DibDm ;
   private int[] P02XU5_A8658DibIntSp ;
   private boolean[] P02XU5_n8658DibIntSp ;
   private String[] P02XU5_A8415DibActivo ;
   private boolean[] P02XU5_n8415DibActivo ;
   private String[] P02XU5_A7027DibLinMalC ;
   private boolean[] P02XU5_n7027DibLinMalC ;
   private String[] P02XU5_A7026DibCilCod ;
   private boolean[] P02XU5_n7026DibCilCod ;
   private java.math.BigDecimal[] P02XU5_A4860DibPrcCob ;
   private boolean[] P02XU5_n4860DibPrcCob ;
   private byte[] P02XU5_A1810DibPosCil ;
   private boolean[] P02XU5_n1810DibPosCil ;
   private byte[] P02XU5_A1826TipCilCod ;
   private boolean[] P02XU5_n1826TipCilCod ;
   private String[] P02XU5_A1030DibRelMC ;
   private boolean[] P02XU5_n1030DibRelMC ;
   private String[] P02XU7_A396EmprCod ;
   private String[] P02XU7_A1013DibCli ;
   private int[] P02XU7_A252CliCod ;
   private int[] P02XU7_A1014DibInt ;
   private int[] P02XU7_A7508DibOrgCliC ;
   private boolean[] P02XU7_n7508DibOrgCliC ;
   private short[] P02XU7_A7507DibOrgLin ;
   private boolean[] P02XU7_n7507DibOrgLin ;
   private String[] P02XU7_A7506DibOrgCli ;
   private boolean[] P02XU7_n7506DibOrgCli ;
   private int[] P02XU7_A7505DibOrgInt ;
   private boolean[] P02XU7_n7505DibOrgInt ;
   private byte[] P02XU7_A1809DibOrdMol ;
   private boolean[] P02XU7_n1809DibOrdMol ;
   private byte[] P02XU7_A2088DibDibMol ;
   private boolean[] P02XU7_n2088DibDibMol ;
   private short[] P02XU7_A1029DibLin ;
   private String[] P02XU7_A6840DibLinMal ;
   private boolean[] P02XU7_n6840DibLinMal ;
   private String[] P02XU7_A6839DibMolCod ;
   private boolean[] P02XU7_n6839DibMolCod ;
   private java.math.BigDecimal[] P02XU7_A5381DibPrcCobM ;
   private boolean[] P02XU7_n5381DibPrcCobM ;
   private byte[] P02XU7_A1828TipGomCod ;
   private boolean[] P02XU7_n1828TipGomCod ;
   private byte[] P02XU7_A1830TipPasCod ;
   private boolean[] P02XU7_n1830TipPasCod ;
   private String[] P02XU7_A2092DibRelMC2 ;
   private boolean[] P02XU7_n2092DibRelMC2 ;
}

final  class pcoplin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XU4", "SELECT T1.EmprCod, T1.DibCli, T1.CliCod, T1.DibInt, T1.TipMqnCod, T1.GrabCod, T1.DibVelMaq, T1.DibUltLin, T1.DibUltCil, T1.DibTipRas, T1.DibTipMaq, T1.DibTemQm9, T1.DibTemQm8, T1.DibTemQm7, T1.DibTemQm6, T1.DibTemQm5, T1.DibTemQm4, T1.DibTemQm3, T1.DibTemQm2, T1.DibTemQm10, T1.DibTemQm1, T1.DibRap, T1.DibPreOf9, T1.DibPreOf8, T1.DibPreOf7, T1.DibPreOf6, T1.DibPreOf5, T1.DibPreOf4, T1.DibPreOf3, T1.DibPreOf2, T1.DibPreOf16, T1.DibPreOf15, T1.DibPreOf14, T1.DibPreOf13, T1.DibPreOf12, T1.DibPreOf11, T1.DibPreOf10, T1.DibPreOf1, T1.DibPreAy9, T1.DibPreAy8, T1.DibPreAy7, T1.DibPreAy6, T1.DibPreAy5, T1.DibPreAy4, T1.DibPreAy3, T1.DibPreAy2, T1.DibPreAy16, T1.DibPreAy15, T1.DibPreAy14, T1.DibPreAy13, T1.DibPreAy12, T1.DibPreAy11, T1.DibPreAy10, T1.DibPreAy1, T1.DibPosVor, T1.DibPosRas, T1.DibObsUL, T1.DibObs2, T1.DibObs, T1.DibMot, T1.DibMolCil, T1.DibMolCi2, T1.DibMetRea, T1.DibMed, T1.DibLocal, T1.DibLevMaq, T1.DibImp, T1.DibGraNum, T1.DibFecUlt, T1.DibFecPed, T1.DibFecEnt, T1.DibDsc, T1.DibCob, T1.DibCar, T1.DibBmp, COALESCE( T2.DibNumLin, 0) AS DibNumLin, COALESCE( T3.DibNumLi2, 0) AS DibNumLi2, COALESCE( T2.DibCobTot, 0) AS DibCobTot FROM ((TXPCDIBUJ T1 LEFT JOIN (SELECT COUNT(*) AS DibNumLin, EmprCod, DibCli, CliCod, DibInt, SUM(DibPrcCob) AS DibCobTot FROM TXPLDIBUC GROUP BY EmprCod, DibCli, CliCod, DibInt ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DibCli = T1.DibCli AND T2.CliCod = T1.CliCod AND T2.DibInt = T1.DibInt) LEFT JOIN (SELECT COUNT(*) AS DibNumLi2, EmprCod, DibCli, CliCod, DibInt FROM TXPLDIBUJ GROUP BY EmprCod, DibCli, CliCod, DibInt ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DibCli = T1.DibCli AND T3.CliCod = T1.CliCod AND T3.DibInt = T1.DibInt) WHERE T1.EmprCod = ? and T1.DibCli = ? and T1.CliCod = ? and T1.DibInt = ? ORDER BY T1.EmprCod, T1.DibCli, T1.CliCod, T1.DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XU5", "SELECT EmprCod, DibCli, CliCod, DibInt, DibOrgClid, DibOrgLi, DibOrgCl, DibOrgIn, DibOrdCil, DibLinMol, DibLinCil, DibCilUlt, DibCilMts, DibCilStF, DibCilSt, DibCilMesh, DibPres, DibDm, DibIntSp, DibActivo, DibLinMalC, DibCilCod, DibPrcCob, DibPosCil, TipCilCod, DibRelMC FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XU6", "INSERT INTO TXPLDIBUC(EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibLinMol, DibRelMC, DibOrdCil, TipCilCod, DibPosCil, DibPrcCob, DibCilCod, DibLinMalC, DibActivo, DibIntSp, DibOrgIn, DibOrgCl, DibOrgLi, DibOrgClid, DibDm, DibPres, DibCilMesh, DibCilSt, DibCilStF, DibCilMts, DibCilUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
         ,new ForEachCursor("P02XU7", "SELECT EmprCod, DibCli, CliCod, DibInt, DibOrgCliC, DibOrgLin, DibOrgCli, DibOrgInt, DibOrdMol, DibDibMol, DibLin, DibLinMal, DibMolCod, DibPrcCobM, TipGomCod, TipPasCod, DibRelMC2 FROM TXPLDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XU8", "INSERT INTO TXPLDIBUJ(EmprCod, DibCli, CliCod, DibInt, DibLin, DibDibMol, DibRelMC2, DibOrdMol, TipPasCod, TipGomCod, DibPrcCobM, DibMolCod, DibLinMal, DibOrgInt, DibOrgCli, DibOrgLin, DibOrgCliC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUJ")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(41,2);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[90])[0] = rslt.getBigDecimal(48,2);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[92])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[96])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[102])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(55, 3);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 15);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((byte[]) buf[108])[0] = rslt.getByte(57);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 40);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(59, 40);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(60, 2);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((short[]) buf[116])[0] = rslt.getShort(61);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((short[]) buf[118])[0] = rslt.getShort(62);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(63,2);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(64, 10);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(65, 15);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((String[]) buf[126])[0] = rslt.getString(66, 8);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[128])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getString(68, 10);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[132])[0] = rslt.getGXDate(69);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[134])[0] = rslt.getGXDate(70);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[136])[0] = rslt.getGXDate(71);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(72, 30);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[140])[0] = rslt.getBigDecimal(73,2);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((byte[]) buf[142])[0] = rslt.getByte(74);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((String[]) buf[144])[0] = rslt.getString(75, 128);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((short[]) buf[146])[0] = rslt.getShort(76);
               ((short[]) buf[147])[0] = rslt.getShort(77);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[149])[0] = rslt.getBigDecimal(78,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 5);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 5);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[24]).intValue());
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
                  stmt.setString(17, (String)parms[28], 16);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[32]).intValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[34]).byteValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[36], 10);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[38]).shortValue());
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
                  stmt.setNull( 24 , Types.DATE );
               }
               else
               {
                  stmt.setDate(24, (java.util.Date)parms[42]);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[46]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 5);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 16);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[28]).intValue());
               }
               return;
      }
   }

}

