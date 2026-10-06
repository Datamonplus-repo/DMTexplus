package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactdib extends GXProcedure
{
   public pactdib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactdib.class ), "" );
   }

   public pactdib( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      pactdib.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      pactdib.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactdib.this.AV82DibCli = aP1[0];
      this.aP1 = aP1;
      pactdib.this.AV83CliCod = aP2[0];
      this.aP2 = aP2;
      pactdib.this.AV81DibInt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02XK3 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV82DibCli, Integer.valueOf(AV83CliCod), Integer.valueOf(AV81DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02XK3_A252CliCod[0] ;
         A1013DibCli = P02XK3_A1013DibCli[0] ;
         A1014DibInt = P02XK3_A1014DibInt[0] ;
         A6841DibDsc = P02XK3_A6841DibDsc[0] ;
         n6841DibDsc = P02XK3_n6841DibDsc[0] ;
         A407EmprNom = P02XK3_A407EmprNom[0] ;
         n407EmprNom = P02XK3_n407EmprNom[0] ;
         A1005GrabCod = P02XK3_A1005GrabCod[0] ;
         n1005GrabCod = P02XK3_n1005GrabCod[0] ;
         A1006GrabNom = P02XK3_A1006GrabNom[0] ;
         n1006GrabNom = P02XK3_n1006GrabNom[0] ;
         A1016DibFecPed = P02XK3_A1016DibFecPed[0] ;
         n1016DibFecPed = P02XK3_n1016DibFecPed[0] ;
         A1017DibFecEnt = P02XK3_A1017DibFecEnt[0] ;
         n1017DibFecEnt = P02XK3_n1017DibFecEnt[0] ;
         A1018DibMetRea = P02XK3_A1018DibMetRea[0] ;
         n1018DibMetRea = P02XK3_n1018DibMetRea[0] ;
         A1605DibLocal = P02XK3_A1605DibLocal[0] ;
         n1605DibLocal = P02XK3_n1605DibLocal[0] ;
         A1020DibObs = P02XK3_A1020DibObs[0] ;
         n1020DibObs = P02XK3_n1020DibObs[0] ;
         A1609DibObs2 = P02XK3_A1609DibObs2[0] ;
         n1609DibObs2 = P02XK3_n1609DibObs2[0] ;
         A1021DibCar = P02XK3_A1021DibCar[0] ;
         n1021DibCar = P02XK3_n1021DibCar[0] ;
         A1023DibMot = P02XK3_A1023DibMot[0] ;
         n1023DibMot = P02XK3_n1023DibMot[0] ;
         A1823DibTipMaq = P02XK3_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P02XK3_n1823DibTipMaq[0] ;
         A1880DibGraNum = P02XK3_A1880DibGraNum[0] ;
         n1880DibGraNum = P02XK3_n1880DibGraNum[0] ;
         A3911TipMqnCod = P02XK3_A3911TipMqnCod[0] ;
         n3911TipMqnCod = P02XK3_n3911TipMqnCod[0] ;
         A3912TipMqnDsc = P02XK3_A3912TipMqnDsc[0] ;
         n3912TipMqnDsc = P02XK3_n3912TipMqnDsc[0] ;
         A4861DibCob = P02XK3_A4861DibCob[0] ;
         n4861DibCob = P02XK3_n4861DibCob[0] ;
         A7140DibBmp = P02XK3_A7140DibBmp[0] ;
         n7140DibBmp = P02XK3_n7140DibBmp[0] ;
         A1015DibFecUlt = P02XK3_A1015DibFecUlt[0] ;
         n1015DibFecUlt = P02XK3_n1015DibFecUlt[0] ;
         A2090DibMolCi2 = P02XK3_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = P02XK3_n2090DibMolCi2[0] ;
         A1606DibTipRas = P02XK3_A1606DibTipRas[0] ;
         n1606DibTipRas = P02XK3_n1606DibTipRas[0] ;
         A1610DibPosRas = P02XK3_A1610DibPosRas[0] ;
         n1610DibPosRas = P02XK3_n1610DibPosRas[0] ;
         A1607DibMed = P02XK3_A1607DibMed[0] ;
         n1607DibMed = P02XK3_n1607DibMed[0] ;
         A1608DibRap = P02XK3_A1608DibRap[0] ;
         n1608DibRap = P02XK3_n1608DibRap[0] ;
         A1811DibPosVor = P02XK3_A1811DibPosVor[0] ;
         n1811DibPosVor = P02XK3_n1811DibPosVor[0] ;
         A1806DibLevMaq = P02XK3_A1806DibLevMaq[0] ;
         n1806DibLevMaq = P02XK3_n1806DibLevMaq[0] ;
         A1024DibUltLin = P02XK3_A1024DibUltLin[0] ;
         n1024DibUltLin = P02XK3_n1024DibUltLin[0] ;
         A1019DibMolCil = P02XK3_A1019DibMolCil[0] ;
         n1019DibMolCil = P02XK3_n1019DibMolCil[0] ;
         A1881DibPreAy1 = P02XK3_A1881DibPreAy1[0] ;
         n1881DibPreAy1 = P02XK3_n1881DibPreAy1[0] ;
         A1883DibPreAy2 = P02XK3_A1883DibPreAy2[0] ;
         n1883DibPreAy2 = P02XK3_n1883DibPreAy2[0] ;
         A1884DibPreAy3 = P02XK3_A1884DibPreAy3[0] ;
         n1884DibPreAy3 = P02XK3_n1884DibPreAy3[0] ;
         A1885DibPreAy4 = P02XK3_A1885DibPreAy4[0] ;
         n1885DibPreAy4 = P02XK3_n1885DibPreAy4[0] ;
         A1886DibPreAy5 = P02XK3_A1886DibPreAy5[0] ;
         n1886DibPreAy5 = P02XK3_n1886DibPreAy5[0] ;
         A1887DibPreAy6 = P02XK3_A1887DibPreAy6[0] ;
         n1887DibPreAy6 = P02XK3_n1887DibPreAy6[0] ;
         A1888DibPreAy7 = P02XK3_A1888DibPreAy7[0] ;
         n1888DibPreAy7 = P02XK3_n1888DibPreAy7[0] ;
         A1889DibPreAy8 = P02XK3_A1889DibPreAy8[0] ;
         n1889DibPreAy8 = P02XK3_n1889DibPreAy8[0] ;
         A1890DibPreAy9 = P02XK3_A1890DibPreAy9[0] ;
         n1890DibPreAy9 = P02XK3_n1890DibPreAy9[0] ;
         A1882DibPreAy10 = P02XK3_A1882DibPreAy10[0] ;
         n1882DibPreAy10 = P02XK3_n1882DibPreAy10[0] ;
         A4480DibPreAy11 = P02XK3_A4480DibPreAy11[0] ;
         n4480DibPreAy11 = P02XK3_n4480DibPreAy11[0] ;
         A4481DibPreAy12 = P02XK3_A4481DibPreAy12[0] ;
         n4481DibPreAy12 = P02XK3_n4481DibPreAy12[0] ;
         A4482DibPreAy13 = P02XK3_A4482DibPreAy13[0] ;
         n4482DibPreAy13 = P02XK3_n4482DibPreAy13[0] ;
         A4483DibPreAy14 = P02XK3_A4483DibPreAy14[0] ;
         n4483DibPreAy14 = P02XK3_n4483DibPreAy14[0] ;
         A4484DibPreAy15 = P02XK3_A4484DibPreAy15[0] ;
         n4484DibPreAy15 = P02XK3_n4484DibPreAy15[0] ;
         A4485DibPreAy16 = P02XK3_A4485DibPreAy16[0] ;
         n4485DibPreAy16 = P02XK3_n4485DibPreAy16[0] ;
         A1891DibPreOf1 = P02XK3_A1891DibPreOf1[0] ;
         n1891DibPreOf1 = P02XK3_n1891DibPreOf1[0] ;
         A1893DibPreOf2 = P02XK3_A1893DibPreOf2[0] ;
         n1893DibPreOf2 = P02XK3_n1893DibPreOf2[0] ;
         A1894DibPreOf3 = P02XK3_A1894DibPreOf3[0] ;
         n1894DibPreOf3 = P02XK3_n1894DibPreOf3[0] ;
         A1895DibPreOf4 = P02XK3_A1895DibPreOf4[0] ;
         n1895DibPreOf4 = P02XK3_n1895DibPreOf4[0] ;
         A1896DibPreOf5 = P02XK3_A1896DibPreOf5[0] ;
         n1896DibPreOf5 = P02XK3_n1896DibPreOf5[0] ;
         A1897DibPreOf6 = P02XK3_A1897DibPreOf6[0] ;
         n1897DibPreOf6 = P02XK3_n1897DibPreOf6[0] ;
         A1898DibPreOf7 = P02XK3_A1898DibPreOf7[0] ;
         n1898DibPreOf7 = P02XK3_n1898DibPreOf7[0] ;
         A1899DibPreOf8 = P02XK3_A1899DibPreOf8[0] ;
         n1899DibPreOf8 = P02XK3_n1899DibPreOf8[0] ;
         A1900DibPreOf9 = P02XK3_A1900DibPreOf9[0] ;
         n1900DibPreOf9 = P02XK3_n1900DibPreOf9[0] ;
         A1892DibPreOf10 = P02XK3_A1892DibPreOf10[0] ;
         n1892DibPreOf10 = P02XK3_n1892DibPreOf10[0] ;
         A4486DibPreOf11 = P02XK3_A4486DibPreOf11[0] ;
         n4486DibPreOf11 = P02XK3_n4486DibPreOf11[0] ;
         A4487DibPreOf12 = P02XK3_A4487DibPreOf12[0] ;
         n4487DibPreOf12 = P02XK3_n4487DibPreOf12[0] ;
         A4488DibPreOf13 = P02XK3_A4488DibPreOf13[0] ;
         n4488DibPreOf13 = P02XK3_n4488DibPreOf13[0] ;
         A4489DibPreOf14 = P02XK3_A4489DibPreOf14[0] ;
         n4489DibPreOf14 = P02XK3_n4489DibPreOf14[0] ;
         A4490DibPreOf15 = P02XK3_A4490DibPreOf15[0] ;
         n4490DibPreOf15 = P02XK3_n4490DibPreOf15[0] ;
         A4491DibPreOf16 = P02XK3_A4491DibPreOf16[0] ;
         n4491DibPreOf16 = P02XK3_n4491DibPreOf16[0] ;
         A1825DibVelMaq = P02XK3_A1825DibVelMaq[0] ;
         n1825DibVelMaq = P02XK3_n1825DibVelMaq[0] ;
         A1813DibTemQm1 = P02XK3_A1813DibTemQm1[0] ;
         n1813DibTemQm1 = P02XK3_n1813DibTemQm1[0] ;
         A1815DibTemQm2 = P02XK3_A1815DibTemQm2[0] ;
         n1815DibTemQm2 = P02XK3_n1815DibTemQm2[0] ;
         A1816DibTemQm3 = P02XK3_A1816DibTemQm3[0] ;
         n1816DibTemQm3 = P02XK3_n1816DibTemQm3[0] ;
         A1817DibTemQm4 = P02XK3_A1817DibTemQm4[0] ;
         n1817DibTemQm4 = P02XK3_n1817DibTemQm4[0] ;
         A1818DibTemQm5 = P02XK3_A1818DibTemQm5[0] ;
         n1818DibTemQm5 = P02XK3_n1818DibTemQm5[0] ;
         A1819DibTemQm6 = P02XK3_A1819DibTemQm6[0] ;
         n1819DibTemQm6 = P02XK3_n1819DibTemQm6[0] ;
         A1820DibTemQm7 = P02XK3_A1820DibTemQm7[0] ;
         n1820DibTemQm7 = P02XK3_n1820DibTemQm7[0] ;
         A1821DibTemQm8 = P02XK3_A1821DibTemQm8[0] ;
         n1821DibTemQm8 = P02XK3_n1821DibTemQm8[0] ;
         A1822DibTemQm9 = P02XK3_A1822DibTemQm9[0] ;
         n1822DibTemQm9 = P02XK3_n1822DibTemQm9[0] ;
         A1814DibTemQm10 = P02XK3_A1814DibTemQm10[0] ;
         n1814DibTemQm10 = P02XK3_n1814DibTemQm10[0] ;
         A1824DibUltCil = P02XK3_A1824DibUltCil[0] ;
         n1824DibUltCil = P02XK3_n1824DibUltCil[0] ;
         A2091DibNumLi2 = P02XK3_A2091DibNumLi2[0] ;
         n2091DibNumLi2 = P02XK3_n2091DibNumLi2[0] ;
         A407EmprNom = P02XK3_A407EmprNom[0] ;
         n407EmprNom = P02XK3_n407EmprNom[0] ;
         A1006GrabNom = P02XK3_A1006GrabNom[0] ;
         n1006GrabNom = P02XK3_n1006GrabNom[0] ;
         A3912TipMqnDsc = P02XK3_A3912TipMqnDsc[0] ;
         n3912TipMqnDsc = P02XK3_n3912TipMqnDsc[0] ;
         A2091DibNumLi2 = P02XK3_A2091DibNumLi2[0] ;
         n2091DibNumLi2 = P02XK3_n2091DibNumLi2[0] ;
         AV8DibDsc = A6841DibDsc ;
         AV9EmprNom = A407EmprNom ;
         AV11GrabCod = A1005GrabCod ;
         AV12GrabNom = A1006GrabNom ;
         AV14DibFecPed = A1016DibFecPed ;
         AV15DibFecEnt = A1017DibFecEnt ;
         AV16DibMetRea = A1018DibMetRea ;
         AV17DibLocal = A1605DibLocal ;
         AV18DibObs = A1020DibObs ;
         AV19DibObs2 = A1609DibObs2 ;
         AV20DibCar = A1021DibCar ;
         AV22DibMot = A1023DibMot ;
         AV23DibTipMaq = A1823DibTipMaq ;
         AV24DibGraNum = A1880DibGraNum ;
         AV25TipMqnCod = A3911TipMqnCod ;
         AV26TipMqnDsc = A3912TipMqnDsc ;
         AV27DibCob = A4861DibCob ;
         AV28DibBmp = A7140DibBmp ;
         AV13DibFecUlt = A1015DibFecUlt ;
         AV84Dibmolci2 = A2090DibMolCi2 ;
         AV29DibTipRas = A1606DibTipRas ;
         AV30DibPosRas = A1610DibPosRas ;
         AV31DibMed = A1607DibMed ;
         AV32DibRap = A1608DibRap ;
         AV85Dibnumli2 = A2091DibNumLi2 ;
         AV33DibPosVor = A1811DibPosVor ;
         AV34DibLevMaq = A1806DibLevMaq ;
         AV23DibTipMaq = A1823DibTipMaq ;
         AV88dIBuLTlIN = A1024DibUltLin ;
         AV16DibMetRea = A1018DibMetRea ;
         AV35DibMolCil = A1019DibMolCil ;
         AV31DibMed = A1607DibMed ;
         AV33DibPosVor = A1811DibPosVor ;
         AV34DibLevMaq = A1806DibLevMaq ;
         AV23DibTipMaq = A1823DibTipMaq ;
         AV36DibPreAy1 = A1881DibPreAy1 ;
         AV37DibPreAy2 = A1883DibPreAy2 ;
         AV38DibPreAy3 = A1884DibPreAy3 ;
         AV39DibPreAy4 = A1885DibPreAy4 ;
         AV40DibPreAy5 = A1886DibPreAy5 ;
         AV41DibPreAy6 = A1887DibPreAy6 ;
         AV86Dibpreay7 = A1888DibPreAy7 ;
         AV43DibPreAy8 = A1889DibPreAy8 ;
         AV44DibPreAy9 = A1890DibPreAy9 ;
         AV45DibPreAy10 = A1882DibPreAy10 ;
         AV46DibPreAy11 = A4480DibPreAy11 ;
         AV47DibPreAy12 = A4481DibPreAy12 ;
         AV48DibPreAy13 = A4482DibPreAy13 ;
         AV49DibPreAy14 = A4483DibPreAy14 ;
         AV50DibPreAy15 = A4484DibPreAy15 ;
         AV51DibPreAy16 = A4485DibPreAy16 ;
         AV52DibPreOf1 = A1891DibPreOf1 ;
         AV53DibPreOf2 = A1893DibPreOf2 ;
         AV54DibPreOf3 = A1894DibPreOf3 ;
         AV55DibPreOf4 = A1895DibPreOf4 ;
         AV56DibPreOf5 = A1896DibPreOf5 ;
         AV57DibPreOf6 = A1897DibPreOf6 ;
         AV58DibPreOf7 = A1898DibPreOf7 ;
         AV59DibPreOf8 = A1899DibPreOf8 ;
         AV60DibPreOf9 = A1900DibPreOf9 ;
         AV61DibPreOf10 = A1892DibPreOf10 ;
         AV62DibPreOf11 = A4486DibPreOf11 ;
         AV63DibPreOf12 = A4487DibPreOf12 ;
         AV64DibPreOf13 = A4488DibPreOf13 ;
         AV65DibPreOf14 = A4489DibPreOf14 ;
         AV66DibPreOf15 = A4490DibPreOf15 ;
         AV67DibPreOf16 = A4491DibPreOf16 ;
         AV68DibVelMaq = A1825DibVelMaq ;
         AV69DibTemQm1 = A1813DibTemQm1 ;
         AV70DibTemQm2 = A1815DibTemQm2 ;
         AV71DibTemQm3 = A1816DibTemQm3 ;
         AV72DibTemQm4 = A1817DibTemQm4 ;
         AV87Dibtemqm5 = A1818DibTemQm5 ;
         AV74DibTemQm6 = A1819DibTemQm6 ;
         AV75DibTemQm7 = A1820DibTemQm7 ;
         AV76DibTemQm8 = A1821DibTemQm8 ;
         AV78DibTemQm9 = A1822DibTemQm9 ;
         AV79DibTemQm10 = A1814DibTemQm10 ;
         AV89dIBuLTcIL = A1824DibUltCil ;
         /* Execute user subroutine: 'COPIAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'COPIAR' Routine */
      returnInSub = false ;
      /* Using cursor P02XK4 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV82DibCli, Integer.valueOf(AV81DibInt), A396EmprCod, AV82DibCli, Integer.valueOf(AV81DibInt), Integer.valueOf(AV83CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P02XK4_A252CliCod[0] ;
         A1013DibCli = P02XK4_A1013DibCli[0] ;
         A1014DibInt = P02XK4_A1014DibInt[0] ;
         A6841DibDsc = P02XK4_A6841DibDsc[0] ;
         n6841DibDsc = P02XK4_n6841DibDsc[0] ;
         A1005GrabCod = P02XK4_A1005GrabCod[0] ;
         n1005GrabCod = P02XK4_n1005GrabCod[0] ;
         A1016DibFecPed = P02XK4_A1016DibFecPed[0] ;
         n1016DibFecPed = P02XK4_n1016DibFecPed[0] ;
         A1017DibFecEnt = P02XK4_A1017DibFecEnt[0] ;
         n1017DibFecEnt = P02XK4_n1017DibFecEnt[0] ;
         A1018DibMetRea = P02XK4_A1018DibMetRea[0] ;
         n1018DibMetRea = P02XK4_n1018DibMetRea[0] ;
         A1605DibLocal = P02XK4_A1605DibLocal[0] ;
         n1605DibLocal = P02XK4_n1605DibLocal[0] ;
         A1020DibObs = P02XK4_A1020DibObs[0] ;
         n1020DibObs = P02XK4_n1020DibObs[0] ;
         A1609DibObs2 = P02XK4_A1609DibObs2[0] ;
         n1609DibObs2 = P02XK4_n1609DibObs2[0] ;
         A1021DibCar = P02XK4_A1021DibCar[0] ;
         n1021DibCar = P02XK4_n1021DibCar[0] ;
         A1022DibImp = P02XK4_A1022DibImp[0] ;
         n1022DibImp = P02XK4_n1022DibImp[0] ;
         A1023DibMot = P02XK4_A1023DibMot[0] ;
         n1023DibMot = P02XK4_n1023DibMot[0] ;
         A1823DibTipMaq = P02XK4_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P02XK4_n1823DibTipMaq[0] ;
         A1880DibGraNum = P02XK4_A1880DibGraNum[0] ;
         n1880DibGraNum = P02XK4_n1880DibGraNum[0] ;
         A3911TipMqnCod = P02XK4_A3911TipMqnCod[0] ;
         n3911TipMqnCod = P02XK4_n3911TipMqnCod[0] ;
         A4861DibCob = P02XK4_A4861DibCob[0] ;
         n4861DibCob = P02XK4_n4861DibCob[0] ;
         A7140DibBmp = P02XK4_A7140DibBmp[0] ;
         n7140DibBmp = P02XK4_n7140DibBmp[0] ;
         A1015DibFecUlt = P02XK4_A1015DibFecUlt[0] ;
         n1015DibFecUlt = P02XK4_n1015DibFecUlt[0] ;
         A2090DibMolCi2 = P02XK4_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = P02XK4_n2090DibMolCi2[0] ;
         A1606DibTipRas = P02XK4_A1606DibTipRas[0] ;
         n1606DibTipRas = P02XK4_n1606DibTipRas[0] ;
         A1610DibPosRas = P02XK4_A1610DibPosRas[0] ;
         n1610DibPosRas = P02XK4_n1610DibPosRas[0] ;
         A1607DibMed = P02XK4_A1607DibMed[0] ;
         n1607DibMed = P02XK4_n1607DibMed[0] ;
         A1608DibRap = P02XK4_A1608DibRap[0] ;
         n1608DibRap = P02XK4_n1608DibRap[0] ;
         A1811DibPosVor = P02XK4_A1811DibPosVor[0] ;
         n1811DibPosVor = P02XK4_n1811DibPosVor[0] ;
         A1806DibLevMaq = P02XK4_A1806DibLevMaq[0] ;
         n1806DibLevMaq = P02XK4_n1806DibLevMaq[0] ;
         A1024DibUltLin = P02XK4_A1024DibUltLin[0] ;
         n1024DibUltLin = P02XK4_n1024DibUltLin[0] ;
         A1019DibMolCil = P02XK4_A1019DibMolCil[0] ;
         n1019DibMolCil = P02XK4_n1019DibMolCil[0] ;
         A1881DibPreAy1 = P02XK4_A1881DibPreAy1[0] ;
         n1881DibPreAy1 = P02XK4_n1881DibPreAy1[0] ;
         A1883DibPreAy2 = P02XK4_A1883DibPreAy2[0] ;
         n1883DibPreAy2 = P02XK4_n1883DibPreAy2[0] ;
         A1884DibPreAy3 = P02XK4_A1884DibPreAy3[0] ;
         n1884DibPreAy3 = P02XK4_n1884DibPreAy3[0] ;
         A1885DibPreAy4 = P02XK4_A1885DibPreAy4[0] ;
         n1885DibPreAy4 = P02XK4_n1885DibPreAy4[0] ;
         A1886DibPreAy5 = P02XK4_A1886DibPreAy5[0] ;
         n1886DibPreAy5 = P02XK4_n1886DibPreAy5[0] ;
         A1887DibPreAy6 = P02XK4_A1887DibPreAy6[0] ;
         n1887DibPreAy6 = P02XK4_n1887DibPreAy6[0] ;
         A1888DibPreAy7 = P02XK4_A1888DibPreAy7[0] ;
         n1888DibPreAy7 = P02XK4_n1888DibPreAy7[0] ;
         A1889DibPreAy8 = P02XK4_A1889DibPreAy8[0] ;
         n1889DibPreAy8 = P02XK4_n1889DibPreAy8[0] ;
         A1890DibPreAy9 = P02XK4_A1890DibPreAy9[0] ;
         n1890DibPreAy9 = P02XK4_n1890DibPreAy9[0] ;
         A1882DibPreAy10 = P02XK4_A1882DibPreAy10[0] ;
         n1882DibPreAy10 = P02XK4_n1882DibPreAy10[0] ;
         A4480DibPreAy11 = P02XK4_A4480DibPreAy11[0] ;
         n4480DibPreAy11 = P02XK4_n4480DibPreAy11[0] ;
         A4481DibPreAy12 = P02XK4_A4481DibPreAy12[0] ;
         n4481DibPreAy12 = P02XK4_n4481DibPreAy12[0] ;
         A4482DibPreAy13 = P02XK4_A4482DibPreAy13[0] ;
         n4482DibPreAy13 = P02XK4_n4482DibPreAy13[0] ;
         A4483DibPreAy14 = P02XK4_A4483DibPreAy14[0] ;
         n4483DibPreAy14 = P02XK4_n4483DibPreAy14[0] ;
         A4484DibPreAy15 = P02XK4_A4484DibPreAy15[0] ;
         n4484DibPreAy15 = P02XK4_n4484DibPreAy15[0] ;
         A4485DibPreAy16 = P02XK4_A4485DibPreAy16[0] ;
         n4485DibPreAy16 = P02XK4_n4485DibPreAy16[0] ;
         A1891DibPreOf1 = P02XK4_A1891DibPreOf1[0] ;
         n1891DibPreOf1 = P02XK4_n1891DibPreOf1[0] ;
         A1893DibPreOf2 = P02XK4_A1893DibPreOf2[0] ;
         n1893DibPreOf2 = P02XK4_n1893DibPreOf2[0] ;
         A1894DibPreOf3 = P02XK4_A1894DibPreOf3[0] ;
         n1894DibPreOf3 = P02XK4_n1894DibPreOf3[0] ;
         A1895DibPreOf4 = P02XK4_A1895DibPreOf4[0] ;
         n1895DibPreOf4 = P02XK4_n1895DibPreOf4[0] ;
         A1896DibPreOf5 = P02XK4_A1896DibPreOf5[0] ;
         n1896DibPreOf5 = P02XK4_n1896DibPreOf5[0] ;
         A1897DibPreOf6 = P02XK4_A1897DibPreOf6[0] ;
         n1897DibPreOf6 = P02XK4_n1897DibPreOf6[0] ;
         A1898DibPreOf7 = P02XK4_A1898DibPreOf7[0] ;
         n1898DibPreOf7 = P02XK4_n1898DibPreOf7[0] ;
         A1899DibPreOf8 = P02XK4_A1899DibPreOf8[0] ;
         n1899DibPreOf8 = P02XK4_n1899DibPreOf8[0] ;
         A1900DibPreOf9 = P02XK4_A1900DibPreOf9[0] ;
         n1900DibPreOf9 = P02XK4_n1900DibPreOf9[0] ;
         A1892DibPreOf10 = P02XK4_A1892DibPreOf10[0] ;
         n1892DibPreOf10 = P02XK4_n1892DibPreOf10[0] ;
         A4486DibPreOf11 = P02XK4_A4486DibPreOf11[0] ;
         n4486DibPreOf11 = P02XK4_n4486DibPreOf11[0] ;
         A4487DibPreOf12 = P02XK4_A4487DibPreOf12[0] ;
         n4487DibPreOf12 = P02XK4_n4487DibPreOf12[0] ;
         A4488DibPreOf13 = P02XK4_A4488DibPreOf13[0] ;
         n4488DibPreOf13 = P02XK4_n4488DibPreOf13[0] ;
         A4489DibPreOf14 = P02XK4_A4489DibPreOf14[0] ;
         n4489DibPreOf14 = P02XK4_n4489DibPreOf14[0] ;
         A4490DibPreOf15 = P02XK4_A4490DibPreOf15[0] ;
         n4490DibPreOf15 = P02XK4_n4490DibPreOf15[0] ;
         A4491DibPreOf16 = P02XK4_A4491DibPreOf16[0] ;
         n4491DibPreOf16 = P02XK4_n4491DibPreOf16[0] ;
         A1825DibVelMaq = P02XK4_A1825DibVelMaq[0] ;
         n1825DibVelMaq = P02XK4_n1825DibVelMaq[0] ;
         A1813DibTemQm1 = P02XK4_A1813DibTemQm1[0] ;
         n1813DibTemQm1 = P02XK4_n1813DibTemQm1[0] ;
         A1815DibTemQm2 = P02XK4_A1815DibTemQm2[0] ;
         n1815DibTemQm2 = P02XK4_n1815DibTemQm2[0] ;
         A1816DibTemQm3 = P02XK4_A1816DibTemQm3[0] ;
         n1816DibTemQm3 = P02XK4_n1816DibTemQm3[0] ;
         A1817DibTemQm4 = P02XK4_A1817DibTemQm4[0] ;
         n1817DibTemQm4 = P02XK4_n1817DibTemQm4[0] ;
         A1818DibTemQm5 = P02XK4_A1818DibTemQm5[0] ;
         n1818DibTemQm5 = P02XK4_n1818DibTemQm5[0] ;
         A1819DibTemQm6 = P02XK4_A1819DibTemQm6[0] ;
         n1819DibTemQm6 = P02XK4_n1819DibTemQm6[0] ;
         A1820DibTemQm7 = P02XK4_A1820DibTemQm7[0] ;
         n1820DibTemQm7 = P02XK4_n1820DibTemQm7[0] ;
         A1821DibTemQm8 = P02XK4_A1821DibTemQm8[0] ;
         n1821DibTemQm8 = P02XK4_n1821DibTemQm8[0] ;
         A1822DibTemQm9 = P02XK4_A1822DibTemQm9[0] ;
         n1822DibTemQm9 = P02XK4_n1822DibTemQm9[0] ;
         A1814DibTemQm10 = P02XK4_A1814DibTemQm10[0] ;
         n1814DibTemQm10 = P02XK4_n1814DibTemQm10[0] ;
         A1824DibUltCil = P02XK4_A1824DibUltCil[0] ;
         n1824DibUltCil = P02XK4_n1824DibUltCil[0] ;
         if ( A252CliCod != AV83CliCod )
         {
            /* Using cursor P02XK5 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A407EmprNom = P02XK5_A407EmprNom[0] ;
            n407EmprNom = P02XK5_n407EmprNom[0] ;
            /* Using cursor P02XK6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n3911TipMqnCod), Byte.valueOf(A3911TipMqnCod)});
            A3912TipMqnDsc = P02XK6_A3912TipMqnDsc[0] ;
            n3912TipMqnDsc = P02XK6_n3912TipMqnDsc[0] ;
            /* Using cursor P02XK7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod)});
            A1006GrabNom = P02XK7_A1006GrabNom[0] ;
            n1006GrabNom = P02XK7_n1006GrabNom[0] ;
            A6841DibDsc = AV8DibDsc ;
            n6841DibDsc = false ;
            A407EmprNom = AV9EmprNom ;
            n407EmprNom = false ;
            A1005GrabCod = AV11GrabCod ;
            n1005GrabCod = false ;
            A1006GrabNom = AV12GrabNom ;
            n1006GrabNom = false ;
            A1016DibFecPed = AV14DibFecPed ;
            n1016DibFecPed = false ;
            A1017DibFecEnt = AV15DibFecEnt ;
            n1017DibFecEnt = false ;
            A1018DibMetRea = AV16DibMetRea ;
            n1018DibMetRea = false ;
            A1605DibLocal = AV17DibLocal ;
            n1605DibLocal = false ;
            A1020DibObs = AV18DibObs ;
            n1020DibObs = false ;
            A1609DibObs2 = AV19DibObs2 ;
            n1609DibObs2 = false ;
            A1021DibCar = AV20DibCar ;
            n1021DibCar = false ;
            A1022DibImp = AV21DibImp ;
            n1022DibImp = false ;
            A1023DibMot = AV22DibMot ;
            n1023DibMot = false ;
            A1823DibTipMaq = AV23DibTipMaq ;
            n1823DibTipMaq = false ;
            A1880DibGraNum = AV24DibGraNum ;
            n1880DibGraNum = false ;
            A3911TipMqnCod = AV25TipMqnCod ;
            n3911TipMqnCod = false ;
            A3912TipMqnDsc = AV26TipMqnDsc ;
            n3912TipMqnDsc = false ;
            A4861DibCob = AV27DibCob ;
            n4861DibCob = false ;
            A7140DibBmp = AV28DibBmp ;
            n7140DibBmp = false ;
            A1015DibFecUlt = AV13DibFecUlt ;
            n1015DibFecUlt = false ;
            A2090DibMolCi2 = AV84Dibmolci2 ;
            n2090DibMolCi2 = false ;
            A1606DibTipRas = AV29DibTipRas ;
            n1606DibTipRas = false ;
            A1610DibPosRas = AV30DibPosRas ;
            n1610DibPosRas = false ;
            A1607DibMed = AV31DibMed ;
            n1607DibMed = false ;
            A1608DibRap = AV32DibRap ;
            n1608DibRap = false ;
            A1811DibPosVor = AV33DibPosVor ;
            n1811DibPosVor = false ;
            A1806DibLevMaq = AV34DibLevMaq ;
            n1806DibLevMaq = false ;
            A1024DibUltLin = AV88dIBuLTlIN ;
            n1024DibUltLin = false ;
            A1018DibMetRea = AV16DibMetRea ;
            n1018DibMetRea = false ;
            A1019DibMolCil = AV35DibMolCil ;
            n1019DibMolCil = false ;
            A1881DibPreAy1 = AV36DibPreAy1 ;
            n1881DibPreAy1 = false ;
            A1883DibPreAy2 = AV37DibPreAy2 ;
            n1883DibPreAy2 = false ;
            A1884DibPreAy3 = AV38DibPreAy3 ;
            n1884DibPreAy3 = false ;
            A1885DibPreAy4 = AV39DibPreAy4 ;
            n1885DibPreAy4 = false ;
            A1886DibPreAy5 = AV40DibPreAy5 ;
            n1886DibPreAy5 = false ;
            A1887DibPreAy6 = AV41DibPreAy6 ;
            n1887DibPreAy6 = false ;
            A1888DibPreAy7 = AV86Dibpreay7 ;
            n1888DibPreAy7 = false ;
            A1889DibPreAy8 = AV43DibPreAy8 ;
            n1889DibPreAy8 = false ;
            A1890DibPreAy9 = AV44DibPreAy9 ;
            n1890DibPreAy9 = false ;
            A1882DibPreAy10 = AV45DibPreAy10 ;
            n1882DibPreAy10 = false ;
            A4480DibPreAy11 = AV46DibPreAy11 ;
            n4480DibPreAy11 = false ;
            A4481DibPreAy12 = AV47DibPreAy12 ;
            n4481DibPreAy12 = false ;
            A4482DibPreAy13 = AV48DibPreAy13 ;
            n4482DibPreAy13 = false ;
            A4483DibPreAy14 = AV49DibPreAy14 ;
            n4483DibPreAy14 = false ;
            A4484DibPreAy15 = AV50DibPreAy15 ;
            n4484DibPreAy15 = false ;
            A4485DibPreAy16 = AV51DibPreAy16 ;
            n4485DibPreAy16 = false ;
            A1891DibPreOf1 = AV52DibPreOf1 ;
            n1891DibPreOf1 = false ;
            A1893DibPreOf2 = AV53DibPreOf2 ;
            n1893DibPreOf2 = false ;
            A1894DibPreOf3 = AV54DibPreOf3 ;
            n1894DibPreOf3 = false ;
            A1895DibPreOf4 = AV55DibPreOf4 ;
            n1895DibPreOf4 = false ;
            A1896DibPreOf5 = AV56DibPreOf5 ;
            n1896DibPreOf5 = false ;
            A1897DibPreOf6 = AV57DibPreOf6 ;
            n1897DibPreOf6 = false ;
            A1898DibPreOf7 = AV58DibPreOf7 ;
            n1898DibPreOf7 = false ;
            A1899DibPreOf8 = AV59DibPreOf8 ;
            n1899DibPreOf8 = false ;
            A1900DibPreOf9 = AV60DibPreOf9 ;
            n1900DibPreOf9 = false ;
            A1892DibPreOf10 = AV61DibPreOf10 ;
            n1892DibPreOf10 = false ;
            A4486DibPreOf11 = AV62DibPreOf11 ;
            n4486DibPreOf11 = false ;
            A4487DibPreOf12 = AV63DibPreOf12 ;
            n4487DibPreOf12 = false ;
            A4488DibPreOf13 = AV64DibPreOf13 ;
            n4488DibPreOf13 = false ;
            A4489DibPreOf14 = AV65DibPreOf14 ;
            n4489DibPreOf14 = false ;
            A4490DibPreOf15 = AV66DibPreOf15 ;
            n4490DibPreOf15 = false ;
            A4491DibPreOf16 = AV67DibPreOf16 ;
            n4491DibPreOf16 = false ;
            A1825DibVelMaq = AV68DibVelMaq ;
            n1825DibVelMaq = false ;
            A1813DibTemQm1 = AV69DibTemQm1 ;
            n1813DibTemQm1 = false ;
            A1815DibTemQm2 = AV70DibTemQm2 ;
            n1815DibTemQm2 = false ;
            A1816DibTemQm3 = AV71DibTemQm3 ;
            n1816DibTemQm3 = false ;
            A1817DibTemQm4 = AV72DibTemQm4 ;
            n1817DibTemQm4 = false ;
            A1818DibTemQm5 = AV87Dibtemqm5 ;
            n1818DibTemQm5 = false ;
            A1819DibTemQm6 = AV74DibTemQm6 ;
            n1819DibTemQm6 = false ;
            A1820DibTemQm7 = AV75DibTemQm7 ;
            n1820DibTemQm7 = false ;
            A1821DibTemQm8 = AV76DibTemQm8 ;
            n1821DibTemQm8 = false ;
            A1822DibTemQm9 = AV78DibTemQm9 ;
            n1822DibTemQm9 = false ;
            A1814DibTemQm10 = AV79DibTemQm10 ;
            n1814DibTemQm10 = false ;
            A1824DibUltCil = AV89dIBuLTcIL ;
            n1824DibUltCil = false ;
            /* Using cursor P02XK8 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n407EmprNom), A407EmprNom, A396EmprCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
            /* Using cursor P02XK9 */
            pr_default.execute(6, new Object[] {Boolean.valueOf(n1006GrabNom), A1006GrabNom, A396EmprCod, Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRABAD");
            /* Using cursor P02XK10 */
            pr_default.execute(7, new Object[] {Boolean.valueOf(n3912TipMqnDsc), A3912TipMqnDsc, A396EmprCod, Boolean.valueOf(n3911TipMqnCod), Byte.valueOf(A3911TipMqnCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPMQN");
            /* Using cursor P02XK11 */
            pr_default.execute(8, new Object[] {Boolean.valueOf(n6841DibDsc), A6841DibDsc, Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod), Boolean.valueOf(n1016DibFecPed), A1016DibFecPed, Boolean.valueOf(n1017DibFecEnt), A1017DibFecEnt, Boolean.valueOf(n1018DibMetRea), A1018DibMetRea, Boolean.valueOf(n1605DibLocal), A1605DibLocal, Boolean.valueOf(n1020DibObs), A1020DibObs, Boolean.valueOf(n1609DibObs2), A1609DibObs2, Boolean.valueOf(n1021DibCar), Byte.valueOf(A1021DibCar), Boolean.valueOf(n1022DibImp), A1022DibImp, Boolean.valueOf(n1023DibMot), A1023DibMot, Boolean.valueOf(n1823DibTipMaq), A1823DibTipMaq, Boolean.valueOf(n1880DibGraNum), A1880DibGraNum, Boolean.valueOf(n3911TipMqnCod), Byte.valueOf(A3911TipMqnCod), Boolean.valueOf(n4861DibCob), A4861DibCob, Boolean.valueOf(n7140DibBmp), A7140DibBmp, Boolean.valueOf(n1015DibFecUlt), A1015DibFecUlt, Boolean.valueOf(n2090DibMolCi2), Short.valueOf(A2090DibMolCi2), Boolean.valueOf(n1606DibTipRas), A1606DibTipRas, Boolean.valueOf(n1610DibPosRas), A1610DibPosRas, Boolean.valueOf(n1607DibMed), A1607DibMed, Boolean.valueOf(n1608DibRap), A1608DibRap, Boolean.valueOf(n1811DibPosVor), A1811DibPosVor, Boolean.valueOf(n1806DibLevMaq), A1806DibLevMaq, Boolean.valueOf(n1024DibUltLin), Short.valueOf(A1024DibUltLin), Boolean.valueOf(n1019DibMolCil), Short.valueOf(A1019DibMolCil), Boolean.valueOf(n1881DibPreAy1), A1881DibPreAy1, Boolean.valueOf(n1883DibPreAy2), A1883DibPreAy2, Boolean.valueOf(n1884DibPreAy3), A1884DibPreAy3, Boolean.valueOf(n1885DibPreAy4), A1885DibPreAy4, Boolean.valueOf(n1886DibPreAy5), A1886DibPreAy5, Boolean.valueOf(n1887DibPreAy6), A1887DibPreAy6, Boolean.valueOf(n1888DibPreAy7), A1888DibPreAy7, Boolean.valueOf(n1889DibPreAy8), A1889DibPreAy8, Boolean.valueOf(n1890DibPreAy9), A1890DibPreAy9, Boolean.valueOf(n1882DibPreAy10), A1882DibPreAy10, Boolean.valueOf(n4480DibPreAy11), A4480DibPreAy11, Boolean.valueOf(n4481DibPreAy12), A4481DibPreAy12, Boolean.valueOf(n4482DibPreAy13), A4482DibPreAy13, Boolean.valueOf(n4483DibPreAy14), A4483DibPreAy14, Boolean.valueOf(n4484DibPreAy15), A4484DibPreAy15, Boolean.valueOf(n4485DibPreAy16), A4485DibPreAy16, Boolean.valueOf(n1891DibPreOf1), A1891DibPreOf1, Boolean.valueOf(n1893DibPreOf2), A1893DibPreOf2, Boolean.valueOf(n1894DibPreOf3), A1894DibPreOf3, Boolean.valueOf(n1895DibPreOf4), A1895DibPreOf4, Boolean.valueOf(n1896DibPreOf5), A1896DibPreOf5, Boolean.valueOf(n1897DibPreOf6), A1897DibPreOf6, Boolean.valueOf(n1898DibPreOf7), A1898DibPreOf7, Boolean.valueOf(n1899DibPreOf8), A1899DibPreOf8, Boolean.valueOf(n1900DibPreOf9), A1900DibPreOf9, Boolean.valueOf(n1892DibPreOf10), A1892DibPreOf10, Boolean.valueOf(n4486DibPreOf11), A4486DibPreOf11, Boolean.valueOf(n4487DibPreOf12), A4487DibPreOf12, Boolean.valueOf(n4488DibPreOf13), A4488DibPreOf13, Boolean.valueOf(n4489DibPreOf14), A4489DibPreOf14, Boolean.valueOf(n4490DibPreOf15), A4490DibPreOf15, Boolean.valueOf(n4491DibPreOf16), A4491DibPreOf16, Boolean.valueOf(n1825DibVelMaq), Short.valueOf(A1825DibVelMaq), Boolean.valueOf(n1813DibTemQm1), Short.valueOf(A1813DibTemQm1), Boolean.valueOf(n1815DibTemQm2), Short.valueOf(A1815DibTemQm2),
            Boolean.valueOf(n1816DibTemQm3), Short.valueOf(A1816DibTemQm3), Boolean.valueOf(n1817DibTemQm4), Short.valueOf(A1817DibTemQm4), Boolean.valueOf(n1818DibTemQm5), Short.valueOf(A1818DibTemQm5), Boolean.valueOf(n1819DibTemQm6), Short.valueOf(A1819DibTemQm6), Boolean.valueOf(n1820DibTemQm7), Short.valueOf(A1820DibTemQm7), Boolean.valueOf(n1821DibTemQm8), Short.valueOf(A1821DibTemQm8), Boolean.valueOf(n1822DibTemQm9), Short.valueOf(A1822DibTemQm9), Boolean.valueOf(n1814DibTemQm10), Short.valueOf(A1814DibTemQm10), Boolean.valueOf(n1824DibUltCil), Short.valueOf(A1824DibUltCil), A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactdib.this.A396EmprCod;
      this.aP1[0] = pactdib.this.AV82DibCli;
      this.aP2[0] = pactdib.this.AV83CliCod;
      this.aP3[0] = pactdib.this.AV81DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactdib");
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
      P02XK3_A396EmprCod = new String[] {""} ;
      P02XK3_A252CliCod = new int[1] ;
      P02XK3_A1013DibCli = new String[] {""} ;
      P02XK3_A1014DibInt = new int[1] ;
      P02XK3_A6841DibDsc = new String[] {""} ;
      P02XK3_n6841DibDsc = new boolean[] {false} ;
      P02XK3_A407EmprNom = new String[] {""} ;
      P02XK3_n407EmprNom = new boolean[] {false} ;
      P02XK3_A1005GrabCod = new short[1] ;
      P02XK3_n1005GrabCod = new boolean[] {false} ;
      P02XK3_A1006GrabNom = new String[] {""} ;
      P02XK3_n1006GrabNom = new boolean[] {false} ;
      P02XK3_A1016DibFecPed = new java.util.Date[] {GXutil.nullDate()} ;
      P02XK3_n1016DibFecPed = new boolean[] {false} ;
      P02XK3_A1017DibFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02XK3_n1017DibFecEnt = new boolean[] {false} ;
      P02XK3_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1018DibMetRea = new boolean[] {false} ;
      P02XK3_A1605DibLocal = new String[] {""} ;
      P02XK3_n1605DibLocal = new boolean[] {false} ;
      P02XK3_A1020DibObs = new String[] {""} ;
      P02XK3_n1020DibObs = new boolean[] {false} ;
      P02XK3_A1609DibObs2 = new String[] {""} ;
      P02XK3_n1609DibObs2 = new boolean[] {false} ;
      P02XK3_A1021DibCar = new byte[1] ;
      P02XK3_n1021DibCar = new boolean[] {false} ;
      P02XK3_A1023DibMot = new String[] {""} ;
      P02XK3_n1023DibMot = new boolean[] {false} ;
      P02XK3_A1823DibTipMaq = new String[] {""} ;
      P02XK3_n1823DibTipMaq = new boolean[] {false} ;
      P02XK3_A1880DibGraNum = new String[] {""} ;
      P02XK3_n1880DibGraNum = new boolean[] {false} ;
      P02XK3_A3911TipMqnCod = new byte[1] ;
      P02XK3_n3911TipMqnCod = new boolean[] {false} ;
      P02XK3_A3912TipMqnDsc = new String[] {""} ;
      P02XK3_n3912TipMqnDsc = new boolean[] {false} ;
      P02XK3_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4861DibCob = new boolean[] {false} ;
      P02XK3_A7140DibBmp = new String[] {""} ;
      P02XK3_n7140DibBmp = new boolean[] {false} ;
      P02XK3_A1015DibFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P02XK3_n1015DibFecUlt = new boolean[] {false} ;
      P02XK3_A2090DibMolCi2 = new short[1] ;
      P02XK3_n2090DibMolCi2 = new boolean[] {false} ;
      P02XK3_A1606DibTipRas = new String[] {""} ;
      P02XK3_n1606DibTipRas = new boolean[] {false} ;
      P02XK3_A1610DibPosRas = new String[] {""} ;
      P02XK3_n1610DibPosRas = new boolean[] {false} ;
      P02XK3_A1607DibMed = new String[] {""} ;
      P02XK3_n1607DibMed = new boolean[] {false} ;
      P02XK3_A1608DibRap = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1608DibRap = new boolean[] {false} ;
      P02XK3_A1811DibPosVor = new String[] {""} ;
      P02XK3_n1811DibPosVor = new boolean[] {false} ;
      P02XK3_A1806DibLevMaq = new String[] {""} ;
      P02XK3_n1806DibLevMaq = new boolean[] {false} ;
      P02XK3_A1024DibUltLin = new short[1] ;
      P02XK3_n1024DibUltLin = new boolean[] {false} ;
      P02XK3_A1019DibMolCil = new short[1] ;
      P02XK3_n1019DibMolCil = new boolean[] {false} ;
      P02XK3_A1881DibPreAy1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1881DibPreAy1 = new boolean[] {false} ;
      P02XK3_A1883DibPreAy2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1883DibPreAy2 = new boolean[] {false} ;
      P02XK3_A1884DibPreAy3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1884DibPreAy3 = new boolean[] {false} ;
      P02XK3_A1885DibPreAy4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1885DibPreAy4 = new boolean[] {false} ;
      P02XK3_A1886DibPreAy5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1886DibPreAy5 = new boolean[] {false} ;
      P02XK3_A1887DibPreAy6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1887DibPreAy6 = new boolean[] {false} ;
      P02XK3_A1888DibPreAy7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1888DibPreAy7 = new boolean[] {false} ;
      P02XK3_A1889DibPreAy8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1889DibPreAy8 = new boolean[] {false} ;
      P02XK3_A1890DibPreAy9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1890DibPreAy9 = new boolean[] {false} ;
      P02XK3_A1882DibPreAy10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1882DibPreAy10 = new boolean[] {false} ;
      P02XK3_A4480DibPreAy11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4480DibPreAy11 = new boolean[] {false} ;
      P02XK3_A4481DibPreAy12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4481DibPreAy12 = new boolean[] {false} ;
      P02XK3_A4482DibPreAy13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4482DibPreAy13 = new boolean[] {false} ;
      P02XK3_A4483DibPreAy14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4483DibPreAy14 = new boolean[] {false} ;
      P02XK3_A4484DibPreAy15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4484DibPreAy15 = new boolean[] {false} ;
      P02XK3_A4485DibPreAy16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4485DibPreAy16 = new boolean[] {false} ;
      P02XK3_A1891DibPreOf1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1891DibPreOf1 = new boolean[] {false} ;
      P02XK3_A1893DibPreOf2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1893DibPreOf2 = new boolean[] {false} ;
      P02XK3_A1894DibPreOf3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1894DibPreOf3 = new boolean[] {false} ;
      P02XK3_A1895DibPreOf4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1895DibPreOf4 = new boolean[] {false} ;
      P02XK3_A1896DibPreOf5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1896DibPreOf5 = new boolean[] {false} ;
      P02XK3_A1897DibPreOf6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1897DibPreOf6 = new boolean[] {false} ;
      P02XK3_A1898DibPreOf7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1898DibPreOf7 = new boolean[] {false} ;
      P02XK3_A1899DibPreOf8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1899DibPreOf8 = new boolean[] {false} ;
      P02XK3_A1900DibPreOf9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1900DibPreOf9 = new boolean[] {false} ;
      P02XK3_A1892DibPreOf10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n1892DibPreOf10 = new boolean[] {false} ;
      P02XK3_A4486DibPreOf11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4486DibPreOf11 = new boolean[] {false} ;
      P02XK3_A4487DibPreOf12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4487DibPreOf12 = new boolean[] {false} ;
      P02XK3_A4488DibPreOf13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4488DibPreOf13 = new boolean[] {false} ;
      P02XK3_A4489DibPreOf14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4489DibPreOf14 = new boolean[] {false} ;
      P02XK3_A4490DibPreOf15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4490DibPreOf15 = new boolean[] {false} ;
      P02XK3_A4491DibPreOf16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK3_n4491DibPreOf16 = new boolean[] {false} ;
      P02XK3_A1825DibVelMaq = new short[1] ;
      P02XK3_n1825DibVelMaq = new boolean[] {false} ;
      P02XK3_A1813DibTemQm1 = new short[1] ;
      P02XK3_n1813DibTemQm1 = new boolean[] {false} ;
      P02XK3_A1815DibTemQm2 = new short[1] ;
      P02XK3_n1815DibTemQm2 = new boolean[] {false} ;
      P02XK3_A1816DibTemQm3 = new short[1] ;
      P02XK3_n1816DibTemQm3 = new boolean[] {false} ;
      P02XK3_A1817DibTemQm4 = new short[1] ;
      P02XK3_n1817DibTemQm4 = new boolean[] {false} ;
      P02XK3_A1818DibTemQm5 = new short[1] ;
      P02XK3_n1818DibTemQm5 = new boolean[] {false} ;
      P02XK3_A1819DibTemQm6 = new short[1] ;
      P02XK3_n1819DibTemQm6 = new boolean[] {false} ;
      P02XK3_A1820DibTemQm7 = new short[1] ;
      P02XK3_n1820DibTemQm7 = new boolean[] {false} ;
      P02XK3_A1821DibTemQm8 = new short[1] ;
      P02XK3_n1821DibTemQm8 = new boolean[] {false} ;
      P02XK3_A1822DibTemQm9 = new short[1] ;
      P02XK3_n1822DibTemQm9 = new boolean[] {false} ;
      P02XK3_A1814DibTemQm10 = new short[1] ;
      P02XK3_n1814DibTemQm10 = new boolean[] {false} ;
      P02XK3_A1824DibUltCil = new short[1] ;
      P02XK3_n1824DibUltCil = new boolean[] {false} ;
      P02XK3_A2091DibNumLi2 = new short[1] ;
      P02XK3_n2091DibNumLi2 = new boolean[] {false} ;
      A1013DibCli = "" ;
      A6841DibDsc = "" ;
      A407EmprNom = "" ;
      A1006GrabNom = "" ;
      A1016DibFecPed = GXutil.nullDate() ;
      A1017DibFecEnt = GXutil.nullDate() ;
      A1018DibMetRea = DecimalUtil.ZERO ;
      A1605DibLocal = "" ;
      A1020DibObs = "" ;
      A1609DibObs2 = "" ;
      A1023DibMot = "" ;
      A1823DibTipMaq = "" ;
      A1880DibGraNum = "" ;
      A3912TipMqnDsc = "" ;
      A4861DibCob = DecimalUtil.ZERO ;
      A7140DibBmp = "" ;
      A1015DibFecUlt = GXutil.nullDate() ;
      A1606DibTipRas = "" ;
      A1610DibPosRas = "" ;
      A1607DibMed = "" ;
      A1608DibRap = DecimalUtil.ZERO ;
      A1811DibPosVor = "" ;
      A1806DibLevMaq = "" ;
      A1881DibPreAy1 = DecimalUtil.ZERO ;
      A1883DibPreAy2 = DecimalUtil.ZERO ;
      A1884DibPreAy3 = DecimalUtil.ZERO ;
      A1885DibPreAy4 = DecimalUtil.ZERO ;
      A1886DibPreAy5 = DecimalUtil.ZERO ;
      A1887DibPreAy6 = DecimalUtil.ZERO ;
      A1888DibPreAy7 = DecimalUtil.ZERO ;
      A1889DibPreAy8 = DecimalUtil.ZERO ;
      A1890DibPreAy9 = DecimalUtil.ZERO ;
      A1882DibPreAy10 = DecimalUtil.ZERO ;
      A4480DibPreAy11 = DecimalUtil.ZERO ;
      A4481DibPreAy12 = DecimalUtil.ZERO ;
      A4482DibPreAy13 = DecimalUtil.ZERO ;
      A4483DibPreAy14 = DecimalUtil.ZERO ;
      A4484DibPreAy15 = DecimalUtil.ZERO ;
      A4485DibPreAy16 = DecimalUtil.ZERO ;
      A1891DibPreOf1 = DecimalUtil.ZERO ;
      A1893DibPreOf2 = DecimalUtil.ZERO ;
      A1894DibPreOf3 = DecimalUtil.ZERO ;
      A1895DibPreOf4 = DecimalUtil.ZERO ;
      A1896DibPreOf5 = DecimalUtil.ZERO ;
      A1897DibPreOf6 = DecimalUtil.ZERO ;
      A1898DibPreOf7 = DecimalUtil.ZERO ;
      A1899DibPreOf8 = DecimalUtil.ZERO ;
      A1900DibPreOf9 = DecimalUtil.ZERO ;
      A1892DibPreOf10 = DecimalUtil.ZERO ;
      A4486DibPreOf11 = DecimalUtil.ZERO ;
      A4487DibPreOf12 = DecimalUtil.ZERO ;
      A4488DibPreOf13 = DecimalUtil.ZERO ;
      A4489DibPreOf14 = DecimalUtil.ZERO ;
      A4490DibPreOf15 = DecimalUtil.ZERO ;
      A4491DibPreOf16 = DecimalUtil.ZERO ;
      AV8DibDsc = "" ;
      AV9EmprNom = "" ;
      AV12GrabNom = "" ;
      AV14DibFecPed = GXutil.nullDate() ;
      AV15DibFecEnt = GXutil.nullDate() ;
      AV16DibMetRea = DecimalUtil.ZERO ;
      AV17DibLocal = "" ;
      AV18DibObs = "" ;
      AV19DibObs2 = "" ;
      AV21DibImp = DecimalUtil.ZERO ;
      AV22DibMot = "" ;
      AV23DibTipMaq = "" ;
      AV24DibGraNum = "" ;
      AV26TipMqnDsc = "" ;
      AV27DibCob = DecimalUtil.ZERO ;
      AV28DibBmp = "" ;
      AV13DibFecUlt = GXutil.nullDate() ;
      AV29DibTipRas = "" ;
      AV30DibPosRas = "" ;
      AV31DibMed = "" ;
      AV32DibRap = DecimalUtil.ZERO ;
      AV33DibPosVor = "" ;
      AV34DibLevMaq = "" ;
      AV36DibPreAy1 = DecimalUtil.ZERO ;
      AV37DibPreAy2 = DecimalUtil.ZERO ;
      AV38DibPreAy3 = DecimalUtil.ZERO ;
      AV39DibPreAy4 = DecimalUtil.ZERO ;
      AV40DibPreAy5 = DecimalUtil.ZERO ;
      AV41DibPreAy6 = DecimalUtil.ZERO ;
      AV86Dibpreay7 = DecimalUtil.ZERO ;
      AV43DibPreAy8 = DecimalUtil.ZERO ;
      AV44DibPreAy9 = DecimalUtil.ZERO ;
      AV45DibPreAy10 = DecimalUtil.ZERO ;
      AV46DibPreAy11 = DecimalUtil.ZERO ;
      AV47DibPreAy12 = DecimalUtil.ZERO ;
      AV48DibPreAy13 = DecimalUtil.ZERO ;
      AV49DibPreAy14 = DecimalUtil.ZERO ;
      AV50DibPreAy15 = DecimalUtil.ZERO ;
      AV51DibPreAy16 = DecimalUtil.ZERO ;
      AV52DibPreOf1 = DecimalUtil.ZERO ;
      AV53DibPreOf2 = DecimalUtil.ZERO ;
      AV54DibPreOf3 = DecimalUtil.ZERO ;
      AV55DibPreOf4 = DecimalUtil.ZERO ;
      AV56DibPreOf5 = DecimalUtil.ZERO ;
      AV57DibPreOf6 = DecimalUtil.ZERO ;
      AV58DibPreOf7 = DecimalUtil.ZERO ;
      AV59DibPreOf8 = DecimalUtil.ZERO ;
      AV60DibPreOf9 = DecimalUtil.ZERO ;
      AV61DibPreOf10 = DecimalUtil.ZERO ;
      AV62DibPreOf11 = DecimalUtil.ZERO ;
      AV63DibPreOf12 = DecimalUtil.ZERO ;
      AV64DibPreOf13 = DecimalUtil.ZERO ;
      AV65DibPreOf14 = DecimalUtil.ZERO ;
      AV66DibPreOf15 = DecimalUtil.ZERO ;
      AV67DibPreOf16 = DecimalUtil.ZERO ;
      P02XK4_A396EmprCod = new String[] {""} ;
      P02XK4_A252CliCod = new int[1] ;
      P02XK4_A1013DibCli = new String[] {""} ;
      P02XK4_A1014DibInt = new int[1] ;
      P02XK4_A6841DibDsc = new String[] {""} ;
      P02XK4_n6841DibDsc = new boolean[] {false} ;
      P02XK4_A1005GrabCod = new short[1] ;
      P02XK4_n1005GrabCod = new boolean[] {false} ;
      P02XK4_A1016DibFecPed = new java.util.Date[] {GXutil.nullDate()} ;
      P02XK4_n1016DibFecPed = new boolean[] {false} ;
      P02XK4_A1017DibFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02XK4_n1017DibFecEnt = new boolean[] {false} ;
      P02XK4_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1018DibMetRea = new boolean[] {false} ;
      P02XK4_A1605DibLocal = new String[] {""} ;
      P02XK4_n1605DibLocal = new boolean[] {false} ;
      P02XK4_A1020DibObs = new String[] {""} ;
      P02XK4_n1020DibObs = new boolean[] {false} ;
      P02XK4_A1609DibObs2 = new String[] {""} ;
      P02XK4_n1609DibObs2 = new boolean[] {false} ;
      P02XK4_A1021DibCar = new byte[1] ;
      P02XK4_n1021DibCar = new boolean[] {false} ;
      P02XK4_A1022DibImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1022DibImp = new boolean[] {false} ;
      P02XK4_A1023DibMot = new String[] {""} ;
      P02XK4_n1023DibMot = new boolean[] {false} ;
      P02XK4_A1823DibTipMaq = new String[] {""} ;
      P02XK4_n1823DibTipMaq = new boolean[] {false} ;
      P02XK4_A1880DibGraNum = new String[] {""} ;
      P02XK4_n1880DibGraNum = new boolean[] {false} ;
      P02XK4_A3911TipMqnCod = new byte[1] ;
      P02XK4_n3911TipMqnCod = new boolean[] {false} ;
      P02XK4_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4861DibCob = new boolean[] {false} ;
      P02XK4_A7140DibBmp = new String[] {""} ;
      P02XK4_n7140DibBmp = new boolean[] {false} ;
      P02XK4_A1015DibFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P02XK4_n1015DibFecUlt = new boolean[] {false} ;
      P02XK4_A2090DibMolCi2 = new short[1] ;
      P02XK4_n2090DibMolCi2 = new boolean[] {false} ;
      P02XK4_A1606DibTipRas = new String[] {""} ;
      P02XK4_n1606DibTipRas = new boolean[] {false} ;
      P02XK4_A1610DibPosRas = new String[] {""} ;
      P02XK4_n1610DibPosRas = new boolean[] {false} ;
      P02XK4_A1607DibMed = new String[] {""} ;
      P02XK4_n1607DibMed = new boolean[] {false} ;
      P02XK4_A1608DibRap = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1608DibRap = new boolean[] {false} ;
      P02XK4_A1811DibPosVor = new String[] {""} ;
      P02XK4_n1811DibPosVor = new boolean[] {false} ;
      P02XK4_A1806DibLevMaq = new String[] {""} ;
      P02XK4_n1806DibLevMaq = new boolean[] {false} ;
      P02XK4_A1024DibUltLin = new short[1] ;
      P02XK4_n1024DibUltLin = new boolean[] {false} ;
      P02XK4_A1019DibMolCil = new short[1] ;
      P02XK4_n1019DibMolCil = new boolean[] {false} ;
      P02XK4_A1881DibPreAy1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1881DibPreAy1 = new boolean[] {false} ;
      P02XK4_A1883DibPreAy2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1883DibPreAy2 = new boolean[] {false} ;
      P02XK4_A1884DibPreAy3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1884DibPreAy3 = new boolean[] {false} ;
      P02XK4_A1885DibPreAy4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1885DibPreAy4 = new boolean[] {false} ;
      P02XK4_A1886DibPreAy5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1886DibPreAy5 = new boolean[] {false} ;
      P02XK4_A1887DibPreAy6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1887DibPreAy6 = new boolean[] {false} ;
      P02XK4_A1888DibPreAy7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1888DibPreAy7 = new boolean[] {false} ;
      P02XK4_A1889DibPreAy8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1889DibPreAy8 = new boolean[] {false} ;
      P02XK4_A1890DibPreAy9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1890DibPreAy9 = new boolean[] {false} ;
      P02XK4_A1882DibPreAy10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1882DibPreAy10 = new boolean[] {false} ;
      P02XK4_A4480DibPreAy11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4480DibPreAy11 = new boolean[] {false} ;
      P02XK4_A4481DibPreAy12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4481DibPreAy12 = new boolean[] {false} ;
      P02XK4_A4482DibPreAy13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4482DibPreAy13 = new boolean[] {false} ;
      P02XK4_A4483DibPreAy14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4483DibPreAy14 = new boolean[] {false} ;
      P02XK4_A4484DibPreAy15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4484DibPreAy15 = new boolean[] {false} ;
      P02XK4_A4485DibPreAy16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4485DibPreAy16 = new boolean[] {false} ;
      P02XK4_A1891DibPreOf1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1891DibPreOf1 = new boolean[] {false} ;
      P02XK4_A1893DibPreOf2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1893DibPreOf2 = new boolean[] {false} ;
      P02XK4_A1894DibPreOf3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1894DibPreOf3 = new boolean[] {false} ;
      P02XK4_A1895DibPreOf4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1895DibPreOf4 = new boolean[] {false} ;
      P02XK4_A1896DibPreOf5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1896DibPreOf5 = new boolean[] {false} ;
      P02XK4_A1897DibPreOf6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1897DibPreOf6 = new boolean[] {false} ;
      P02XK4_A1898DibPreOf7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1898DibPreOf7 = new boolean[] {false} ;
      P02XK4_A1899DibPreOf8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1899DibPreOf8 = new boolean[] {false} ;
      P02XK4_A1900DibPreOf9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1900DibPreOf9 = new boolean[] {false} ;
      P02XK4_A1892DibPreOf10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n1892DibPreOf10 = new boolean[] {false} ;
      P02XK4_A4486DibPreOf11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4486DibPreOf11 = new boolean[] {false} ;
      P02XK4_A4487DibPreOf12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4487DibPreOf12 = new boolean[] {false} ;
      P02XK4_A4488DibPreOf13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4488DibPreOf13 = new boolean[] {false} ;
      P02XK4_A4489DibPreOf14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4489DibPreOf14 = new boolean[] {false} ;
      P02XK4_A4490DibPreOf15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4490DibPreOf15 = new boolean[] {false} ;
      P02XK4_A4491DibPreOf16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XK4_n4491DibPreOf16 = new boolean[] {false} ;
      P02XK4_A1825DibVelMaq = new short[1] ;
      P02XK4_n1825DibVelMaq = new boolean[] {false} ;
      P02XK4_A1813DibTemQm1 = new short[1] ;
      P02XK4_n1813DibTemQm1 = new boolean[] {false} ;
      P02XK4_A1815DibTemQm2 = new short[1] ;
      P02XK4_n1815DibTemQm2 = new boolean[] {false} ;
      P02XK4_A1816DibTemQm3 = new short[1] ;
      P02XK4_n1816DibTemQm3 = new boolean[] {false} ;
      P02XK4_A1817DibTemQm4 = new short[1] ;
      P02XK4_n1817DibTemQm4 = new boolean[] {false} ;
      P02XK4_A1818DibTemQm5 = new short[1] ;
      P02XK4_n1818DibTemQm5 = new boolean[] {false} ;
      P02XK4_A1819DibTemQm6 = new short[1] ;
      P02XK4_n1819DibTemQm6 = new boolean[] {false} ;
      P02XK4_A1820DibTemQm7 = new short[1] ;
      P02XK4_n1820DibTemQm7 = new boolean[] {false} ;
      P02XK4_A1821DibTemQm8 = new short[1] ;
      P02XK4_n1821DibTemQm8 = new boolean[] {false} ;
      P02XK4_A1822DibTemQm9 = new short[1] ;
      P02XK4_n1822DibTemQm9 = new boolean[] {false} ;
      P02XK4_A1814DibTemQm10 = new short[1] ;
      P02XK4_n1814DibTemQm10 = new boolean[] {false} ;
      P02XK4_A1824DibUltCil = new short[1] ;
      P02XK4_n1824DibUltCil = new boolean[] {false} ;
      A1022DibImp = DecimalUtil.ZERO ;
      P02XK5_A407EmprNom = new String[] {""} ;
      P02XK5_n407EmprNom = new boolean[] {false} ;
      P02XK6_A3912TipMqnDsc = new String[] {""} ;
      P02XK6_n3912TipMqnDsc = new boolean[] {false} ;
      P02XK7_A1006GrabNom = new String[] {""} ;
      P02XK7_n1006GrabNom = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactdib__default(),
         new Object[] {
             new Object[] {
            P02XK3_A396EmprCod, P02XK3_A252CliCod, P02XK3_A1013DibCli, P02XK3_A1014DibInt, P02XK3_A6841DibDsc, P02XK3_n6841DibDsc, P02XK3_A407EmprNom, P02XK3_n407EmprNom, P02XK3_A1005GrabCod, P02XK3_n1005GrabCod,
            P02XK3_A1006GrabNom, P02XK3_n1006GrabNom, P02XK3_A1016DibFecPed, P02XK3_n1016DibFecPed, P02XK3_A1017DibFecEnt, P02XK3_n1017DibFecEnt, P02XK3_A1018DibMetRea, P02XK3_n1018DibMetRea, P02XK3_A1605DibLocal, P02XK3_n1605DibLocal,
            P02XK3_A1020DibObs, P02XK3_n1020DibObs, P02XK3_A1609DibObs2, P02XK3_n1609DibObs2, P02XK3_A1021DibCar, P02XK3_n1021DibCar, P02XK3_A1023DibMot, P02XK3_n1023DibMot, P02XK3_A1823DibTipMaq, P02XK3_n1823DibTipMaq,
            P02XK3_A1880DibGraNum, P02XK3_n1880DibGraNum, P02XK3_A3911TipMqnCod, P02XK3_n3911TipMqnCod, P02XK3_A3912TipMqnDsc, P02XK3_n3912TipMqnDsc, P02XK3_A4861DibCob, P02XK3_n4861DibCob, P02XK3_A7140DibBmp, P02XK3_n7140DibBmp,
            P02XK3_A1015DibFecUlt, P02XK3_n1015DibFecUlt, P02XK3_A2090DibMolCi2, P02XK3_n2090DibMolCi2, P02XK3_A1606DibTipRas, P02XK3_n1606DibTipRas, P02XK3_A1610DibPosRas, P02XK3_n1610DibPosRas, P02XK3_A1607DibMed, P02XK3_n1607DibMed,
            P02XK3_A1608DibRap, P02XK3_n1608DibRap, P02XK3_A1811DibPosVor, P02XK3_n1811DibPosVor, P02XK3_A1806DibLevMaq, P02XK3_n1806DibLevMaq, P02XK3_A1024DibUltLin, P02XK3_n1024DibUltLin, P02XK3_A1019DibMolCil, P02XK3_n1019DibMolCil,
            P02XK3_A1881DibPreAy1, P02XK3_n1881DibPreAy1, P02XK3_A1883DibPreAy2, P02XK3_n1883DibPreAy2, P02XK3_A1884DibPreAy3, P02XK3_n1884DibPreAy3, P02XK3_A1885DibPreAy4, P02XK3_n1885DibPreAy4, P02XK3_A1886DibPreAy5, P02XK3_n1886DibPreAy5,
            P02XK3_A1887DibPreAy6, P02XK3_n1887DibPreAy6, P02XK3_A1888DibPreAy7, P02XK3_n1888DibPreAy7, P02XK3_A1889DibPreAy8, P02XK3_n1889DibPreAy8, P02XK3_A1890DibPreAy9, P02XK3_n1890DibPreAy9, P02XK3_A1882DibPreAy10, P02XK3_n1882DibPreAy10,
            P02XK3_A4480DibPreAy11, P02XK3_n4480DibPreAy11, P02XK3_A4481DibPreAy12, P02XK3_n4481DibPreAy12, P02XK3_A4482DibPreAy13, P02XK3_n4482DibPreAy13, P02XK3_A4483DibPreAy14, P02XK3_n4483DibPreAy14, P02XK3_A4484DibPreAy15, P02XK3_n4484DibPreAy15,
            P02XK3_A4485DibPreAy16, P02XK3_n4485DibPreAy16, P02XK3_A1891DibPreOf1, P02XK3_n1891DibPreOf1, P02XK3_A1893DibPreOf2, P02XK3_n1893DibPreOf2, P02XK3_A1894DibPreOf3, P02XK3_n1894DibPreOf3, P02XK3_A1895DibPreOf4, P02XK3_n1895DibPreOf4,
            P02XK3_A1896DibPreOf5, P02XK3_n1896DibPreOf5, P02XK3_A1897DibPreOf6, P02XK3_n1897DibPreOf6, P02XK3_A1898DibPreOf7, P02XK3_n1898DibPreOf7, P02XK3_A1899DibPreOf8, P02XK3_n1899DibPreOf8, P02XK3_A1900DibPreOf9, P02XK3_n1900DibPreOf9,
            P02XK3_A1892DibPreOf10, P02XK3_n1892DibPreOf10, P02XK3_A4486DibPreOf11, P02XK3_n4486DibPreOf11, P02XK3_A4487DibPreOf12, P02XK3_n4487DibPreOf12, P02XK3_A4488DibPreOf13, P02XK3_n4488DibPreOf13, P02XK3_A4489DibPreOf14, P02XK3_n4489DibPreOf14,
            P02XK3_A4490DibPreOf15, P02XK3_n4490DibPreOf15, P02XK3_A4491DibPreOf16, P02XK3_n4491DibPreOf16, P02XK3_A1825DibVelMaq, P02XK3_n1825DibVelMaq, P02XK3_A1813DibTemQm1, P02XK3_n1813DibTemQm1, P02XK3_A1815DibTemQm2, P02XK3_n1815DibTemQm2,
            P02XK3_A1816DibTemQm3, P02XK3_n1816DibTemQm3, P02XK3_A1817DibTemQm4, P02XK3_n1817DibTemQm4, P02XK3_A1818DibTemQm5, P02XK3_n1818DibTemQm5, P02XK3_A1819DibTemQm6, P02XK3_n1819DibTemQm6, P02XK3_A1820DibTemQm7, P02XK3_n1820DibTemQm7,
            P02XK3_A1821DibTemQm8, P02XK3_n1821DibTemQm8, P02XK3_A1822DibTemQm9, P02XK3_n1822DibTemQm9, P02XK3_A1814DibTemQm10, P02XK3_n1814DibTemQm10, P02XK3_A1824DibUltCil, P02XK3_n1824DibUltCil, P02XK3_A2091DibNumLi2, P02XK3_n2091DibNumLi2
            }
            , new Object[] {
            P02XK4_A396EmprCod, P02XK4_A252CliCod, P02XK4_A1013DibCli, P02XK4_A1014DibInt, P02XK4_A6841DibDsc, P02XK4_n6841DibDsc, P02XK4_A1005GrabCod, P02XK4_n1005GrabCod, P02XK4_A1016DibFecPed, P02XK4_n1016DibFecPed,
            P02XK4_A1017DibFecEnt, P02XK4_n1017DibFecEnt, P02XK4_A1018DibMetRea, P02XK4_n1018DibMetRea, P02XK4_A1605DibLocal, P02XK4_n1605DibLocal, P02XK4_A1020DibObs, P02XK4_n1020DibObs, P02XK4_A1609DibObs2, P02XK4_n1609DibObs2,
            P02XK4_A1021DibCar, P02XK4_n1021DibCar, P02XK4_A1022DibImp, P02XK4_n1022DibImp, P02XK4_A1023DibMot, P02XK4_n1023DibMot, P02XK4_A1823DibTipMaq, P02XK4_n1823DibTipMaq, P02XK4_A1880DibGraNum, P02XK4_n1880DibGraNum,
            P02XK4_A3911TipMqnCod, P02XK4_n3911TipMqnCod, P02XK4_A4861DibCob, P02XK4_n4861DibCob, P02XK4_A7140DibBmp, P02XK4_n7140DibBmp, P02XK4_A1015DibFecUlt, P02XK4_n1015DibFecUlt, P02XK4_A2090DibMolCi2, P02XK4_n2090DibMolCi2,
            P02XK4_A1606DibTipRas, P02XK4_n1606DibTipRas, P02XK4_A1610DibPosRas, P02XK4_n1610DibPosRas, P02XK4_A1607DibMed, P02XK4_n1607DibMed, P02XK4_A1608DibRap, P02XK4_n1608DibRap, P02XK4_A1811DibPosVor, P02XK4_n1811DibPosVor,
            P02XK4_A1806DibLevMaq, P02XK4_n1806DibLevMaq, P02XK4_A1024DibUltLin, P02XK4_n1024DibUltLin, P02XK4_A1019DibMolCil, P02XK4_n1019DibMolCil, P02XK4_A1881DibPreAy1, P02XK4_n1881DibPreAy1, P02XK4_A1883DibPreAy2, P02XK4_n1883DibPreAy2,
            P02XK4_A1884DibPreAy3, P02XK4_n1884DibPreAy3, P02XK4_A1885DibPreAy4, P02XK4_n1885DibPreAy4, P02XK4_A1886DibPreAy5, P02XK4_n1886DibPreAy5, P02XK4_A1887DibPreAy6, P02XK4_n1887DibPreAy6, P02XK4_A1888DibPreAy7, P02XK4_n1888DibPreAy7,
            P02XK4_A1889DibPreAy8, P02XK4_n1889DibPreAy8, P02XK4_A1890DibPreAy9, P02XK4_n1890DibPreAy9, P02XK4_A1882DibPreAy10, P02XK4_n1882DibPreAy10, P02XK4_A4480DibPreAy11, P02XK4_n4480DibPreAy11, P02XK4_A4481DibPreAy12, P02XK4_n4481DibPreAy12,
            P02XK4_A4482DibPreAy13, P02XK4_n4482DibPreAy13, P02XK4_A4483DibPreAy14, P02XK4_n4483DibPreAy14, P02XK4_A4484DibPreAy15, P02XK4_n4484DibPreAy15, P02XK4_A4485DibPreAy16, P02XK4_n4485DibPreAy16, P02XK4_A1891DibPreOf1, P02XK4_n1891DibPreOf1,
            P02XK4_A1893DibPreOf2, P02XK4_n1893DibPreOf2, P02XK4_A1894DibPreOf3, P02XK4_n1894DibPreOf3, P02XK4_A1895DibPreOf4, P02XK4_n1895DibPreOf4, P02XK4_A1896DibPreOf5, P02XK4_n1896DibPreOf5, P02XK4_A1897DibPreOf6, P02XK4_n1897DibPreOf6,
            P02XK4_A1898DibPreOf7, P02XK4_n1898DibPreOf7, P02XK4_A1899DibPreOf8, P02XK4_n1899DibPreOf8, P02XK4_A1900DibPreOf9, P02XK4_n1900DibPreOf9, P02XK4_A1892DibPreOf10, P02XK4_n1892DibPreOf10, P02XK4_A4486DibPreOf11, P02XK4_n4486DibPreOf11,
            P02XK4_A4487DibPreOf12, P02XK4_n4487DibPreOf12, P02XK4_A4488DibPreOf13, P02XK4_n4488DibPreOf13, P02XK4_A4489DibPreOf14, P02XK4_n4489DibPreOf14, P02XK4_A4490DibPreOf15, P02XK4_n4490DibPreOf15, P02XK4_A4491DibPreOf16, P02XK4_n4491DibPreOf16,
            P02XK4_A1825DibVelMaq, P02XK4_n1825DibVelMaq, P02XK4_A1813DibTemQm1, P02XK4_n1813DibTemQm1, P02XK4_A1815DibTemQm2, P02XK4_n1815DibTemQm2, P02XK4_A1816DibTemQm3, P02XK4_n1816DibTemQm3, P02XK4_A1817DibTemQm4, P02XK4_n1817DibTemQm4,
            P02XK4_A1818DibTemQm5, P02XK4_n1818DibTemQm5, P02XK4_A1819DibTemQm6, P02XK4_n1819DibTemQm6, P02XK4_A1820DibTemQm7, P02XK4_n1820DibTemQm7, P02XK4_A1821DibTemQm8, P02XK4_n1821DibTemQm8, P02XK4_A1822DibTemQm9, P02XK4_n1822DibTemQm9,
            P02XK4_A1814DibTemQm10, P02XK4_n1814DibTemQm10, P02XK4_A1824DibUltCil, P02XK4_n1824DibUltCil
            }
            , new Object[] {
            P02XK5_A407EmprNom, P02XK5_n407EmprNom
            }
            , new Object[] {
            P02XK6_A3912TipMqnDsc, P02XK6_n3912TipMqnDsc
            }
            , new Object[] {
            P02XK7_A1006GrabNom, P02XK7_n1006GrabNom
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
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1021DibCar ;
   private byte A3911TipMqnCod ;
   private byte AV20DibCar ;
   private byte AV25TipMqnCod ;
   private short A1005GrabCod ;
   private short A2090DibMolCi2 ;
   private short A1024DibUltLin ;
   private short A1019DibMolCil ;
   private short A1825DibVelMaq ;
   private short A1813DibTemQm1 ;
   private short A1815DibTemQm2 ;
   private short A1816DibTemQm3 ;
   private short A1817DibTemQm4 ;
   private short A1818DibTemQm5 ;
   private short A1819DibTemQm6 ;
   private short A1820DibTemQm7 ;
   private short A1821DibTemQm8 ;
   private short A1822DibTemQm9 ;
   private short A1814DibTemQm10 ;
   private short A1824DibUltCil ;
   private short A2091DibNumLi2 ;
   private short AV11GrabCod ;
   private short AV84Dibmolci2 ;
   private short AV85Dibnumli2 ;
   private short AV88dIBuLTlIN ;
   private short AV35DibMolCil ;
   private short AV68DibVelMaq ;
   private short AV69DibTemQm1 ;
   private short AV70DibTemQm2 ;
   private short AV71DibTemQm3 ;
   private short AV72DibTemQm4 ;
   private short AV87Dibtemqm5 ;
   private short AV74DibTemQm6 ;
   private short AV75DibTemQm7 ;
   private short AV76DibTemQm8 ;
   private short AV78DibTemQm9 ;
   private short AV79DibTemQm10 ;
   private short AV89dIBuLTcIL ;
   private short Gx_err ;
   private int AV83CliCod ;
   private int AV81DibInt ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private java.math.BigDecimal A1018DibMetRea ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A1608DibRap ;
   private java.math.BigDecimal A1881DibPreAy1 ;
   private java.math.BigDecimal A1883DibPreAy2 ;
   private java.math.BigDecimal A1884DibPreAy3 ;
   private java.math.BigDecimal A1885DibPreAy4 ;
   private java.math.BigDecimal A1886DibPreAy5 ;
   private java.math.BigDecimal A1887DibPreAy6 ;
   private java.math.BigDecimal A1888DibPreAy7 ;
   private java.math.BigDecimal A1889DibPreAy8 ;
   private java.math.BigDecimal A1890DibPreAy9 ;
   private java.math.BigDecimal A1882DibPreAy10 ;
   private java.math.BigDecimal A4480DibPreAy11 ;
   private java.math.BigDecimal A4481DibPreAy12 ;
   private java.math.BigDecimal A4482DibPreAy13 ;
   private java.math.BigDecimal A4483DibPreAy14 ;
   private java.math.BigDecimal A4484DibPreAy15 ;
   private java.math.BigDecimal A4485DibPreAy16 ;
   private java.math.BigDecimal A1891DibPreOf1 ;
   private java.math.BigDecimal A1893DibPreOf2 ;
   private java.math.BigDecimal A1894DibPreOf3 ;
   private java.math.BigDecimal A1895DibPreOf4 ;
   private java.math.BigDecimal A1896DibPreOf5 ;
   private java.math.BigDecimal A1897DibPreOf6 ;
   private java.math.BigDecimal A1898DibPreOf7 ;
   private java.math.BigDecimal A1899DibPreOf8 ;
   private java.math.BigDecimal A1900DibPreOf9 ;
   private java.math.BigDecimal A1892DibPreOf10 ;
   private java.math.BigDecimal A4486DibPreOf11 ;
   private java.math.BigDecimal A4487DibPreOf12 ;
   private java.math.BigDecimal A4488DibPreOf13 ;
   private java.math.BigDecimal A4489DibPreOf14 ;
   private java.math.BigDecimal A4490DibPreOf15 ;
   private java.math.BigDecimal A4491DibPreOf16 ;
   private java.math.BigDecimal AV16DibMetRea ;
   private java.math.BigDecimal AV21DibImp ;
   private java.math.BigDecimal AV27DibCob ;
   private java.math.BigDecimal AV32DibRap ;
   private java.math.BigDecimal AV36DibPreAy1 ;
   private java.math.BigDecimal AV37DibPreAy2 ;
   private java.math.BigDecimal AV38DibPreAy3 ;
   private java.math.BigDecimal AV39DibPreAy4 ;
   private java.math.BigDecimal AV40DibPreAy5 ;
   private java.math.BigDecimal AV41DibPreAy6 ;
   private java.math.BigDecimal AV86Dibpreay7 ;
   private java.math.BigDecimal AV43DibPreAy8 ;
   private java.math.BigDecimal AV44DibPreAy9 ;
   private java.math.BigDecimal AV45DibPreAy10 ;
   private java.math.BigDecimal AV46DibPreAy11 ;
   private java.math.BigDecimal AV47DibPreAy12 ;
   private java.math.BigDecimal AV48DibPreAy13 ;
   private java.math.BigDecimal AV49DibPreAy14 ;
   private java.math.BigDecimal AV50DibPreAy15 ;
   private java.math.BigDecimal AV51DibPreAy16 ;
   private java.math.BigDecimal AV52DibPreOf1 ;
   private java.math.BigDecimal AV53DibPreOf2 ;
   private java.math.BigDecimal AV54DibPreOf3 ;
   private java.math.BigDecimal AV55DibPreOf4 ;
   private java.math.BigDecimal AV56DibPreOf5 ;
   private java.math.BigDecimal AV57DibPreOf6 ;
   private java.math.BigDecimal AV58DibPreOf7 ;
   private java.math.BigDecimal AV59DibPreOf8 ;
   private java.math.BigDecimal AV60DibPreOf9 ;
   private java.math.BigDecimal AV61DibPreOf10 ;
   private java.math.BigDecimal AV62DibPreOf11 ;
   private java.math.BigDecimal AV63DibPreOf12 ;
   private java.math.BigDecimal AV64DibPreOf13 ;
   private java.math.BigDecimal AV65DibPreOf14 ;
   private java.math.BigDecimal AV66DibPreOf15 ;
   private java.math.BigDecimal AV67DibPreOf16 ;
   private java.math.BigDecimal A1022DibImp ;
   private String A396EmprCod ;
   private String AV82DibCli ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A6841DibDsc ;
   private String A407EmprNom ;
   private String A1006GrabNom ;
   private String A1605DibLocal ;
   private String A1020DibObs ;
   private String A1609DibObs2 ;
   private String A1023DibMot ;
   private String A1823DibTipMaq ;
   private String A1880DibGraNum ;
   private String A3912TipMqnDsc ;
   private String A7140DibBmp ;
   private String A1606DibTipRas ;
   private String A1610DibPosRas ;
   private String A1607DibMed ;
   private String A1811DibPosVor ;
   private String A1806DibLevMaq ;
   private String AV8DibDsc ;
   private String AV9EmprNom ;
   private String AV12GrabNom ;
   private String AV17DibLocal ;
   private String AV18DibObs ;
   private String AV19DibObs2 ;
   private String AV22DibMot ;
   private String AV23DibTipMaq ;
   private String AV24DibGraNum ;
   private String AV26TipMqnDsc ;
   private String AV28DibBmp ;
   private String AV29DibTipRas ;
   private String AV30DibPosRas ;
   private String AV31DibMed ;
   private String AV33DibPosVor ;
   private String AV34DibLevMaq ;
   private java.util.Date A1016DibFecPed ;
   private java.util.Date A1017DibFecEnt ;
   private java.util.Date A1015DibFecUlt ;
   private java.util.Date AV14DibFecPed ;
   private java.util.Date AV15DibFecEnt ;
   private java.util.Date AV13DibFecUlt ;
   private boolean n6841DibDsc ;
   private boolean n407EmprNom ;
   private boolean n1005GrabCod ;
   private boolean n1006GrabNom ;
   private boolean n1016DibFecPed ;
   private boolean n1017DibFecEnt ;
   private boolean n1018DibMetRea ;
   private boolean n1605DibLocal ;
   private boolean n1020DibObs ;
   private boolean n1609DibObs2 ;
   private boolean n1021DibCar ;
   private boolean n1023DibMot ;
   private boolean n1823DibTipMaq ;
   private boolean n1880DibGraNum ;
   private boolean n3911TipMqnCod ;
   private boolean n3912TipMqnDsc ;
   private boolean n4861DibCob ;
   private boolean n7140DibBmp ;
   private boolean n1015DibFecUlt ;
   private boolean n2090DibMolCi2 ;
   private boolean n1606DibTipRas ;
   private boolean n1610DibPosRas ;
   private boolean n1607DibMed ;
   private boolean n1608DibRap ;
   private boolean n1811DibPosVor ;
   private boolean n1806DibLevMaq ;
   private boolean n1024DibUltLin ;
   private boolean n1019DibMolCil ;
   private boolean n1881DibPreAy1 ;
   private boolean n1883DibPreAy2 ;
   private boolean n1884DibPreAy3 ;
   private boolean n1885DibPreAy4 ;
   private boolean n1886DibPreAy5 ;
   private boolean n1887DibPreAy6 ;
   private boolean n1888DibPreAy7 ;
   private boolean n1889DibPreAy8 ;
   private boolean n1890DibPreAy9 ;
   private boolean n1882DibPreAy10 ;
   private boolean n4480DibPreAy11 ;
   private boolean n4481DibPreAy12 ;
   private boolean n4482DibPreAy13 ;
   private boolean n4483DibPreAy14 ;
   private boolean n4484DibPreAy15 ;
   private boolean n4485DibPreAy16 ;
   private boolean n1891DibPreOf1 ;
   private boolean n1893DibPreOf2 ;
   private boolean n1894DibPreOf3 ;
   private boolean n1895DibPreOf4 ;
   private boolean n1896DibPreOf5 ;
   private boolean n1897DibPreOf6 ;
   private boolean n1898DibPreOf7 ;
   private boolean n1899DibPreOf8 ;
   private boolean n1900DibPreOf9 ;
   private boolean n1892DibPreOf10 ;
   private boolean n4486DibPreOf11 ;
   private boolean n4487DibPreOf12 ;
   private boolean n4488DibPreOf13 ;
   private boolean n4489DibPreOf14 ;
   private boolean n4490DibPreOf15 ;
   private boolean n4491DibPreOf16 ;
   private boolean n1825DibVelMaq ;
   private boolean n1813DibTemQm1 ;
   private boolean n1815DibTemQm2 ;
   private boolean n1816DibTemQm3 ;
   private boolean n1817DibTemQm4 ;
   private boolean n1818DibTemQm5 ;
   private boolean n1819DibTemQm6 ;
   private boolean n1820DibTemQm7 ;
   private boolean n1821DibTemQm8 ;
   private boolean n1822DibTemQm9 ;
   private boolean n1814DibTemQm10 ;
   private boolean n1824DibUltCil ;
   private boolean n2091DibNumLi2 ;
   private boolean returnInSub ;
   private boolean n1022DibImp ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XK3_A396EmprCod ;
   private int[] P02XK3_A252CliCod ;
   private String[] P02XK3_A1013DibCli ;
   private int[] P02XK3_A1014DibInt ;
   private String[] P02XK3_A6841DibDsc ;
   private boolean[] P02XK3_n6841DibDsc ;
   private String[] P02XK3_A407EmprNom ;
   private boolean[] P02XK3_n407EmprNom ;
   private short[] P02XK3_A1005GrabCod ;
   private boolean[] P02XK3_n1005GrabCod ;
   private String[] P02XK3_A1006GrabNom ;
   private boolean[] P02XK3_n1006GrabNom ;
   private java.util.Date[] P02XK3_A1016DibFecPed ;
   private boolean[] P02XK3_n1016DibFecPed ;
   private java.util.Date[] P02XK3_A1017DibFecEnt ;
   private boolean[] P02XK3_n1017DibFecEnt ;
   private java.math.BigDecimal[] P02XK3_A1018DibMetRea ;
   private boolean[] P02XK3_n1018DibMetRea ;
   private String[] P02XK3_A1605DibLocal ;
   private boolean[] P02XK3_n1605DibLocal ;
   private String[] P02XK3_A1020DibObs ;
   private boolean[] P02XK3_n1020DibObs ;
   private String[] P02XK3_A1609DibObs2 ;
   private boolean[] P02XK3_n1609DibObs2 ;
   private byte[] P02XK3_A1021DibCar ;
   private boolean[] P02XK3_n1021DibCar ;
   private String[] P02XK3_A1023DibMot ;
   private boolean[] P02XK3_n1023DibMot ;
   private String[] P02XK3_A1823DibTipMaq ;
   private boolean[] P02XK3_n1823DibTipMaq ;
   private String[] P02XK3_A1880DibGraNum ;
   private boolean[] P02XK3_n1880DibGraNum ;
   private byte[] P02XK3_A3911TipMqnCod ;
   private boolean[] P02XK3_n3911TipMqnCod ;
   private String[] P02XK3_A3912TipMqnDsc ;
   private boolean[] P02XK3_n3912TipMqnDsc ;
   private java.math.BigDecimal[] P02XK3_A4861DibCob ;
   private boolean[] P02XK3_n4861DibCob ;
   private String[] P02XK3_A7140DibBmp ;
   private boolean[] P02XK3_n7140DibBmp ;
   private java.util.Date[] P02XK3_A1015DibFecUlt ;
   private boolean[] P02XK3_n1015DibFecUlt ;
   private short[] P02XK3_A2090DibMolCi2 ;
   private boolean[] P02XK3_n2090DibMolCi2 ;
   private String[] P02XK3_A1606DibTipRas ;
   private boolean[] P02XK3_n1606DibTipRas ;
   private String[] P02XK3_A1610DibPosRas ;
   private boolean[] P02XK3_n1610DibPosRas ;
   private String[] P02XK3_A1607DibMed ;
   private boolean[] P02XK3_n1607DibMed ;
   private java.math.BigDecimal[] P02XK3_A1608DibRap ;
   private boolean[] P02XK3_n1608DibRap ;
   private String[] P02XK3_A1811DibPosVor ;
   private boolean[] P02XK3_n1811DibPosVor ;
   private String[] P02XK3_A1806DibLevMaq ;
   private boolean[] P02XK3_n1806DibLevMaq ;
   private short[] P02XK3_A1024DibUltLin ;
   private boolean[] P02XK3_n1024DibUltLin ;
   private short[] P02XK3_A1019DibMolCil ;
   private boolean[] P02XK3_n1019DibMolCil ;
   private java.math.BigDecimal[] P02XK3_A1881DibPreAy1 ;
   private boolean[] P02XK3_n1881DibPreAy1 ;
   private java.math.BigDecimal[] P02XK3_A1883DibPreAy2 ;
   private boolean[] P02XK3_n1883DibPreAy2 ;
   private java.math.BigDecimal[] P02XK3_A1884DibPreAy3 ;
   private boolean[] P02XK3_n1884DibPreAy3 ;
   private java.math.BigDecimal[] P02XK3_A1885DibPreAy4 ;
   private boolean[] P02XK3_n1885DibPreAy4 ;
   private java.math.BigDecimal[] P02XK3_A1886DibPreAy5 ;
   private boolean[] P02XK3_n1886DibPreAy5 ;
   private java.math.BigDecimal[] P02XK3_A1887DibPreAy6 ;
   private boolean[] P02XK3_n1887DibPreAy6 ;
   private java.math.BigDecimal[] P02XK3_A1888DibPreAy7 ;
   private boolean[] P02XK3_n1888DibPreAy7 ;
   private java.math.BigDecimal[] P02XK3_A1889DibPreAy8 ;
   private boolean[] P02XK3_n1889DibPreAy8 ;
   private java.math.BigDecimal[] P02XK3_A1890DibPreAy9 ;
   private boolean[] P02XK3_n1890DibPreAy9 ;
   private java.math.BigDecimal[] P02XK3_A1882DibPreAy10 ;
   private boolean[] P02XK3_n1882DibPreAy10 ;
   private java.math.BigDecimal[] P02XK3_A4480DibPreAy11 ;
   private boolean[] P02XK3_n4480DibPreAy11 ;
   private java.math.BigDecimal[] P02XK3_A4481DibPreAy12 ;
   private boolean[] P02XK3_n4481DibPreAy12 ;
   private java.math.BigDecimal[] P02XK3_A4482DibPreAy13 ;
   private boolean[] P02XK3_n4482DibPreAy13 ;
   private java.math.BigDecimal[] P02XK3_A4483DibPreAy14 ;
   private boolean[] P02XK3_n4483DibPreAy14 ;
   private java.math.BigDecimal[] P02XK3_A4484DibPreAy15 ;
   private boolean[] P02XK3_n4484DibPreAy15 ;
   private java.math.BigDecimal[] P02XK3_A4485DibPreAy16 ;
   private boolean[] P02XK3_n4485DibPreAy16 ;
   private java.math.BigDecimal[] P02XK3_A1891DibPreOf1 ;
   private boolean[] P02XK3_n1891DibPreOf1 ;
   private java.math.BigDecimal[] P02XK3_A1893DibPreOf2 ;
   private boolean[] P02XK3_n1893DibPreOf2 ;
   private java.math.BigDecimal[] P02XK3_A1894DibPreOf3 ;
   private boolean[] P02XK3_n1894DibPreOf3 ;
   private java.math.BigDecimal[] P02XK3_A1895DibPreOf4 ;
   private boolean[] P02XK3_n1895DibPreOf4 ;
   private java.math.BigDecimal[] P02XK3_A1896DibPreOf5 ;
   private boolean[] P02XK3_n1896DibPreOf5 ;
   private java.math.BigDecimal[] P02XK3_A1897DibPreOf6 ;
   private boolean[] P02XK3_n1897DibPreOf6 ;
   private java.math.BigDecimal[] P02XK3_A1898DibPreOf7 ;
   private boolean[] P02XK3_n1898DibPreOf7 ;
   private java.math.BigDecimal[] P02XK3_A1899DibPreOf8 ;
   private boolean[] P02XK3_n1899DibPreOf8 ;
   private java.math.BigDecimal[] P02XK3_A1900DibPreOf9 ;
   private boolean[] P02XK3_n1900DibPreOf9 ;
   private java.math.BigDecimal[] P02XK3_A1892DibPreOf10 ;
   private boolean[] P02XK3_n1892DibPreOf10 ;
   private java.math.BigDecimal[] P02XK3_A4486DibPreOf11 ;
   private boolean[] P02XK3_n4486DibPreOf11 ;
   private java.math.BigDecimal[] P02XK3_A4487DibPreOf12 ;
   private boolean[] P02XK3_n4487DibPreOf12 ;
   private java.math.BigDecimal[] P02XK3_A4488DibPreOf13 ;
   private boolean[] P02XK3_n4488DibPreOf13 ;
   private java.math.BigDecimal[] P02XK3_A4489DibPreOf14 ;
   private boolean[] P02XK3_n4489DibPreOf14 ;
   private java.math.BigDecimal[] P02XK3_A4490DibPreOf15 ;
   private boolean[] P02XK3_n4490DibPreOf15 ;
   private java.math.BigDecimal[] P02XK3_A4491DibPreOf16 ;
   private boolean[] P02XK3_n4491DibPreOf16 ;
   private short[] P02XK3_A1825DibVelMaq ;
   private boolean[] P02XK3_n1825DibVelMaq ;
   private short[] P02XK3_A1813DibTemQm1 ;
   private boolean[] P02XK3_n1813DibTemQm1 ;
   private short[] P02XK3_A1815DibTemQm2 ;
   private boolean[] P02XK3_n1815DibTemQm2 ;
   private short[] P02XK3_A1816DibTemQm3 ;
   private boolean[] P02XK3_n1816DibTemQm3 ;
   private short[] P02XK3_A1817DibTemQm4 ;
   private boolean[] P02XK3_n1817DibTemQm4 ;
   private short[] P02XK3_A1818DibTemQm5 ;
   private boolean[] P02XK3_n1818DibTemQm5 ;
   private short[] P02XK3_A1819DibTemQm6 ;
   private boolean[] P02XK3_n1819DibTemQm6 ;
   private short[] P02XK3_A1820DibTemQm7 ;
   private boolean[] P02XK3_n1820DibTemQm7 ;
   private short[] P02XK3_A1821DibTemQm8 ;
   private boolean[] P02XK3_n1821DibTemQm8 ;
   private short[] P02XK3_A1822DibTemQm9 ;
   private boolean[] P02XK3_n1822DibTemQm9 ;
   private short[] P02XK3_A1814DibTemQm10 ;
   private boolean[] P02XK3_n1814DibTemQm10 ;
   private short[] P02XK3_A1824DibUltCil ;
   private boolean[] P02XK3_n1824DibUltCil ;
   private short[] P02XK3_A2091DibNumLi2 ;
   private boolean[] P02XK3_n2091DibNumLi2 ;
   private String[] P02XK4_A396EmprCod ;
   private int[] P02XK4_A252CliCod ;
   private String[] P02XK4_A1013DibCli ;
   private int[] P02XK4_A1014DibInt ;
   private String[] P02XK4_A6841DibDsc ;
   private boolean[] P02XK4_n6841DibDsc ;
   private short[] P02XK4_A1005GrabCod ;
   private boolean[] P02XK4_n1005GrabCod ;
   private java.util.Date[] P02XK4_A1016DibFecPed ;
   private boolean[] P02XK4_n1016DibFecPed ;
   private java.util.Date[] P02XK4_A1017DibFecEnt ;
   private boolean[] P02XK4_n1017DibFecEnt ;
   private java.math.BigDecimal[] P02XK4_A1018DibMetRea ;
   private boolean[] P02XK4_n1018DibMetRea ;
   private String[] P02XK4_A1605DibLocal ;
   private boolean[] P02XK4_n1605DibLocal ;
   private String[] P02XK4_A1020DibObs ;
   private boolean[] P02XK4_n1020DibObs ;
   private String[] P02XK4_A1609DibObs2 ;
   private boolean[] P02XK4_n1609DibObs2 ;
   private byte[] P02XK4_A1021DibCar ;
   private boolean[] P02XK4_n1021DibCar ;
   private java.math.BigDecimal[] P02XK4_A1022DibImp ;
   private boolean[] P02XK4_n1022DibImp ;
   private String[] P02XK4_A1023DibMot ;
   private boolean[] P02XK4_n1023DibMot ;
   private String[] P02XK4_A1823DibTipMaq ;
   private boolean[] P02XK4_n1823DibTipMaq ;
   private String[] P02XK4_A1880DibGraNum ;
   private boolean[] P02XK4_n1880DibGraNum ;
   private byte[] P02XK4_A3911TipMqnCod ;
   private boolean[] P02XK4_n3911TipMqnCod ;
   private java.math.BigDecimal[] P02XK4_A4861DibCob ;
   private boolean[] P02XK4_n4861DibCob ;
   private String[] P02XK4_A7140DibBmp ;
   private boolean[] P02XK4_n7140DibBmp ;
   private java.util.Date[] P02XK4_A1015DibFecUlt ;
   private boolean[] P02XK4_n1015DibFecUlt ;
   private short[] P02XK4_A2090DibMolCi2 ;
   private boolean[] P02XK4_n2090DibMolCi2 ;
   private String[] P02XK4_A1606DibTipRas ;
   private boolean[] P02XK4_n1606DibTipRas ;
   private String[] P02XK4_A1610DibPosRas ;
   private boolean[] P02XK4_n1610DibPosRas ;
   private String[] P02XK4_A1607DibMed ;
   private boolean[] P02XK4_n1607DibMed ;
   private java.math.BigDecimal[] P02XK4_A1608DibRap ;
   private boolean[] P02XK4_n1608DibRap ;
   private String[] P02XK4_A1811DibPosVor ;
   private boolean[] P02XK4_n1811DibPosVor ;
   private String[] P02XK4_A1806DibLevMaq ;
   private boolean[] P02XK4_n1806DibLevMaq ;
   private short[] P02XK4_A1024DibUltLin ;
   private boolean[] P02XK4_n1024DibUltLin ;
   private short[] P02XK4_A1019DibMolCil ;
   private boolean[] P02XK4_n1019DibMolCil ;
   private java.math.BigDecimal[] P02XK4_A1881DibPreAy1 ;
   private boolean[] P02XK4_n1881DibPreAy1 ;
   private java.math.BigDecimal[] P02XK4_A1883DibPreAy2 ;
   private boolean[] P02XK4_n1883DibPreAy2 ;
   private java.math.BigDecimal[] P02XK4_A1884DibPreAy3 ;
   private boolean[] P02XK4_n1884DibPreAy3 ;
   private java.math.BigDecimal[] P02XK4_A1885DibPreAy4 ;
   private boolean[] P02XK4_n1885DibPreAy4 ;
   private java.math.BigDecimal[] P02XK4_A1886DibPreAy5 ;
   private boolean[] P02XK4_n1886DibPreAy5 ;
   private java.math.BigDecimal[] P02XK4_A1887DibPreAy6 ;
   private boolean[] P02XK4_n1887DibPreAy6 ;
   private java.math.BigDecimal[] P02XK4_A1888DibPreAy7 ;
   private boolean[] P02XK4_n1888DibPreAy7 ;
   private java.math.BigDecimal[] P02XK4_A1889DibPreAy8 ;
   private boolean[] P02XK4_n1889DibPreAy8 ;
   private java.math.BigDecimal[] P02XK4_A1890DibPreAy9 ;
   private boolean[] P02XK4_n1890DibPreAy9 ;
   private java.math.BigDecimal[] P02XK4_A1882DibPreAy10 ;
   private boolean[] P02XK4_n1882DibPreAy10 ;
   private java.math.BigDecimal[] P02XK4_A4480DibPreAy11 ;
   private boolean[] P02XK4_n4480DibPreAy11 ;
   private java.math.BigDecimal[] P02XK4_A4481DibPreAy12 ;
   private boolean[] P02XK4_n4481DibPreAy12 ;
   private java.math.BigDecimal[] P02XK4_A4482DibPreAy13 ;
   private boolean[] P02XK4_n4482DibPreAy13 ;
   private java.math.BigDecimal[] P02XK4_A4483DibPreAy14 ;
   private boolean[] P02XK4_n4483DibPreAy14 ;
   private java.math.BigDecimal[] P02XK4_A4484DibPreAy15 ;
   private boolean[] P02XK4_n4484DibPreAy15 ;
   private java.math.BigDecimal[] P02XK4_A4485DibPreAy16 ;
   private boolean[] P02XK4_n4485DibPreAy16 ;
   private java.math.BigDecimal[] P02XK4_A1891DibPreOf1 ;
   private boolean[] P02XK4_n1891DibPreOf1 ;
   private java.math.BigDecimal[] P02XK4_A1893DibPreOf2 ;
   private boolean[] P02XK4_n1893DibPreOf2 ;
   private java.math.BigDecimal[] P02XK4_A1894DibPreOf3 ;
   private boolean[] P02XK4_n1894DibPreOf3 ;
   private java.math.BigDecimal[] P02XK4_A1895DibPreOf4 ;
   private boolean[] P02XK4_n1895DibPreOf4 ;
   private java.math.BigDecimal[] P02XK4_A1896DibPreOf5 ;
   private boolean[] P02XK4_n1896DibPreOf5 ;
   private java.math.BigDecimal[] P02XK4_A1897DibPreOf6 ;
   private boolean[] P02XK4_n1897DibPreOf6 ;
   private java.math.BigDecimal[] P02XK4_A1898DibPreOf7 ;
   private boolean[] P02XK4_n1898DibPreOf7 ;
   private java.math.BigDecimal[] P02XK4_A1899DibPreOf8 ;
   private boolean[] P02XK4_n1899DibPreOf8 ;
   private java.math.BigDecimal[] P02XK4_A1900DibPreOf9 ;
   private boolean[] P02XK4_n1900DibPreOf9 ;
   private java.math.BigDecimal[] P02XK4_A1892DibPreOf10 ;
   private boolean[] P02XK4_n1892DibPreOf10 ;
   private java.math.BigDecimal[] P02XK4_A4486DibPreOf11 ;
   private boolean[] P02XK4_n4486DibPreOf11 ;
   private java.math.BigDecimal[] P02XK4_A4487DibPreOf12 ;
   private boolean[] P02XK4_n4487DibPreOf12 ;
   private java.math.BigDecimal[] P02XK4_A4488DibPreOf13 ;
   private boolean[] P02XK4_n4488DibPreOf13 ;
   private java.math.BigDecimal[] P02XK4_A4489DibPreOf14 ;
   private boolean[] P02XK4_n4489DibPreOf14 ;
   private java.math.BigDecimal[] P02XK4_A4490DibPreOf15 ;
   private boolean[] P02XK4_n4490DibPreOf15 ;
   private java.math.BigDecimal[] P02XK4_A4491DibPreOf16 ;
   private boolean[] P02XK4_n4491DibPreOf16 ;
   private short[] P02XK4_A1825DibVelMaq ;
   private boolean[] P02XK4_n1825DibVelMaq ;
   private short[] P02XK4_A1813DibTemQm1 ;
   private boolean[] P02XK4_n1813DibTemQm1 ;
   private short[] P02XK4_A1815DibTemQm2 ;
   private boolean[] P02XK4_n1815DibTemQm2 ;
   private short[] P02XK4_A1816DibTemQm3 ;
   private boolean[] P02XK4_n1816DibTemQm3 ;
   private short[] P02XK4_A1817DibTemQm4 ;
   private boolean[] P02XK4_n1817DibTemQm4 ;
   private short[] P02XK4_A1818DibTemQm5 ;
   private boolean[] P02XK4_n1818DibTemQm5 ;
   private short[] P02XK4_A1819DibTemQm6 ;
   private boolean[] P02XK4_n1819DibTemQm6 ;
   private short[] P02XK4_A1820DibTemQm7 ;
   private boolean[] P02XK4_n1820DibTemQm7 ;
   private short[] P02XK4_A1821DibTemQm8 ;
   private boolean[] P02XK4_n1821DibTemQm8 ;
   private short[] P02XK4_A1822DibTemQm9 ;
   private boolean[] P02XK4_n1822DibTemQm9 ;
   private short[] P02XK4_A1814DibTemQm10 ;
   private boolean[] P02XK4_n1814DibTemQm10 ;
   private short[] P02XK4_A1824DibUltCil ;
   private boolean[] P02XK4_n1824DibUltCil ;
   private String[] P02XK5_A407EmprNom ;
   private boolean[] P02XK5_n407EmprNom ;
   private String[] P02XK6_A3912TipMqnDsc ;
   private boolean[] P02XK6_n3912TipMqnDsc ;
   private String[] P02XK7_A1006GrabNom ;
   private boolean[] P02XK7_n1006GrabNom ;
}

final  class pactdib__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XK3", "SELECT T1.EmprCod, T1.CliCod, T1.DibCli, T1.DibInt, T1.DibDsc, T2.EmprNom, T1.GrabCod, T3.GrabNom, T1.DibFecPed, T1.DibFecEnt, T1.DibMetRea, T1.DibLocal, T1.DibObs, T1.DibObs2, T1.DibCar, T1.DibMot, T1.DibTipMaq, T1.DibGraNum, T1.TipMqnCod, T4.TipMqnDsc, T1.DibCob, T1.DibBmp, T1.DibFecUlt, T1.DibMolCi2, T1.DibTipRas, T1.DibPosRas, T1.DibMed, T1.DibRap, T1.DibPosVor, T1.DibLevMaq, T1.DibUltLin, T1.DibMolCil, T1.DibPreAy1, T1.DibPreAy2, T1.DibPreAy3, T1.DibPreAy4, T1.DibPreAy5, T1.DibPreAy6, T1.DibPreAy7, T1.DibPreAy8, T1.DibPreAy9, T1.DibPreAy10, T1.DibPreAy11, T1.DibPreAy12, T1.DibPreAy13, T1.DibPreAy14, T1.DibPreAy15, T1.DibPreAy16, T1.DibPreOf1, T1.DibPreOf2, T1.DibPreOf3, T1.DibPreOf4, T1.DibPreOf5, T1.DibPreOf6, T1.DibPreOf7, T1.DibPreOf8, T1.DibPreOf9, T1.DibPreOf10, T1.DibPreOf11, T1.DibPreOf12, T1.DibPreOf13, T1.DibPreOf14, T1.DibPreOf15, T1.DibPreOf16, T1.DibVelMaq, T1.DibTemQm1, T1.DibTemQm2, T1.DibTemQm3, T1.DibTemQm4, T1.DibTemQm5, T1.DibTemQm6, T1.DibTemQm7, T1.DibTemQm8, T1.DibTemQm9, T1.DibTemQm10, T1.DibUltCil, COALESCE( T5.DibNumLi2, 0) AS DibNumLi2 FROM ((((TXPCDIBUJ T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPGRABAD T3 ON T3.EmprCod = T1.EmprCod AND T3.GrabCod = T1.GrabCod) LEFT JOIN TXPTIPMQN T4 ON T4.EmprCod = T1.EmprCod AND T4.TipMqnCod = T1.TipMqnCod) LEFT JOIN (SELECT COUNT(*) AS DibNumLi2, EmprCod, DibCli, CliCod, DibInt FROM TXPLDIBUJ GROUP BY EmprCod, DibCli, CliCod, DibInt ) T5 ON T5.EmprCod = T1.EmprCod AND T5.DibCli = T1.DibCli AND T5.CliCod = T1.CliCod AND T5.DibInt = T1.DibInt) WHERE T1.EmprCod = ? and T1.DibCli = ? and T1.CliCod = ? and T1.DibInt = ? ORDER BY T1.EmprCod, T1.DibCli, T1.CliCod, T1.DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XK4", "SELECT EmprCod, CliCod, DibCli, DibInt, DibDsc, GrabCod, DibFecPed, DibFecEnt, DibMetRea, DibLocal, DibObs, DibObs2, DibCar, DibImp, DibMot, DibTipMaq, DibGraNum, TipMqnCod, DibCob, DibBmp, DibFecUlt, DibMolCi2, DibTipRas, DibPosRas, DibMed, DibRap, DibPosVor, DibLevMaq, DibUltLin, DibMolCil, DibPreAy1, DibPreAy2, DibPreAy3, DibPreAy4, DibPreAy5, DibPreAy6, DibPreAy7, DibPreAy8, DibPreAy9, DibPreAy10, DibPreAy11, DibPreAy12, DibPreAy13, DibPreAy14, DibPreAy15, DibPreAy16, DibPreOf1, DibPreOf2, DibPreOf3, DibPreOf4, DibPreOf5, DibPreOf6, DibPreOf7, DibPreOf8, DibPreOf9, DibPreOf10, DibPreOf11, DibPreOf12, DibPreOf13, DibPreOf14, DibPreOf15, DibPreOf16, DibVelMaq, DibTemQm1, DibTemQm2, DibTemQm3, DibTemQm4, DibTemQm5, DibTemQm6, DibTemQm7, DibTemQm8, DibTemQm9, DibTemQm10, DibUltCil FROM TXPCDIBUJ WHERE (EmprCod = ? AND DibCli = ? AND DibInt = ?) AND ((EmprCod = ? and DibCli = ? and DibInt = ?) AND (CliCod <> ?)) ORDER BY EmprCod, DibCli, DibInt  FOR UPDATE OF DibDsc, GrabCod, DibFecPed, DibFecEnt, DibMetRea, DibLocal, DibObs, DibObs2, DibCar, DibImp, DibMot, DibTipMaq, DibGraNum, TipMqnCod, DibCob, DibBmp, DibFecUlt, DibMolCi2, DibTipRas, DibPosRas, DibMed, DibRap, DibPosVor, DibLevMaq, DibUltLin, DibMolCil, DibPreAy1, DibPreAy2, DibPreAy3, DibPreAy4, DibPreAy5, DibPreAy6, DibPreAy7, DibPreAy8, DibPreAy9, DibPreAy10, DibPreAy11, DibPreAy12, DibPreAy13, DibPreAy14, DibPreAy15, DibPreAy16, DibPreOf1, DibPreOf2, DibPreOf3, DibPreOf4, DibPreOf5, DibPreOf6, DibPreOf7, DibPreOf8, DibPreOf9, DibPreOf10, DibPreOf11, DibPreOf12, DibPreOf13, DibPreOf14, DibPreOf15, DibPreOf16, DibVelMaq, DibTemQm1, DibTemQm2, DibTemQm3, DibTemQm4, DibTemQm5, DibTemQm6, DibTemQm7, DibTemQm8, DibTemQm9, DibTemQm10, DibUltCil NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XK5", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprNom NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XK6", "SELECT TipMqnDsc FROM TXPTIPMQN WHERE EmprCod = ? AND TipMqnCod = ?  FOR UPDATE OF TipMqnDsc NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XK7", "SELECT GrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ?  FOR UPDATE OF GrabNom NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XK8", "UPDATE TXPEMPRES SET EmprNom=?  WHERE EmprCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPRES")
         ,new UpdateCursor("P02XK9", "UPDATE TXPGRABAD SET GrabNom=?  WHERE EmprCod = ? AND GrabCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRABAD")
         ,new UpdateCursor("P02XK10", "UPDATE TXPTIPMQN SET TipMqnDsc=?  WHERE EmprCod = ? AND TipMqnCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIPMQN")
         ,new UpdateCursor("P02XK11", "UPDATE TXPCDIBUJ SET DibDsc=?, GrabCod=?, DibFecPed=?, DibFecEnt=?, DibMetRea=?, DibLocal=?, DibObs=?, DibObs2=?, DibCar=?, DibImp=?, DibMot=?, DibTipMaq=?, DibGraNum=?, TipMqnCod=?, DibCob=?, DibBmp=?, DibFecUlt=?, DibMolCi2=?, DibTipRas=?, DibPosRas=?, DibMed=?, DibRap=?, DibPosVor=?, DibLevMaq=?, DibUltLin=?, DibMolCil=?, DibPreAy1=?, DibPreAy2=?, DibPreAy3=?, DibPreAy4=?, DibPreAy5=?, DibPreAy6=?, DibPreAy7=?, DibPreAy8=?, DibPreAy9=?, DibPreAy10=?, DibPreAy11=?, DibPreAy12=?, DibPreAy13=?, DibPreAy14=?, DibPreAy15=?, DibPreAy16=?, DibPreOf1=?, DibPreOf2=?, DibPreOf3=?, DibPreOf4=?, DibPreOf5=?, DibPreOf6=?, DibPreOf7=?, DibPreOf8=?, DibPreOf9=?, DibPreOf10=?, DibPreOf11=?, DibPreOf12=?, DibPreOf13=?, DibPreOf14=?, DibPreOf15=?, DibPreOf16=?, DibVelMaq=?, DibTemQm1=?, DibTemQm2=?, DibTemQm3=?, DibTemQm4=?, DibTemQm5=?, DibTemQm6=?, DibTemQm7=?, DibTemQm8=?, DibTemQm9=?, DibTemQm10=?, DibUltCil=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 128);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 15);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 15);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 3);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 8);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(32);
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
               ((java.math.BigDecimal[]) buf[104])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[106])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[108])[0] = rslt.getBigDecimal(57,2);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[110])[0] = rslt.getBigDecimal(58,2);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[112])[0] = rslt.getBigDecimal(59,2);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[114])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[118])[0] = rslt.getBigDecimal(62,2);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(63,2);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(64,2);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((short[]) buf[124])[0] = rslt.getShort(65);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(66);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((short[]) buf[128])[0] = rslt.getShort(67);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((short[]) buf[130])[0] = rslt.getShort(68);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((short[]) buf[132])[0] = rslt.getShort(69);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((short[]) buf[134])[0] = rslt.getShort(70);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((short[]) buf[136])[0] = rslt.getShort(71);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(72);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((short[]) buf[140])[0] = rslt.getShort(73);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((short[]) buf[142])[0] = rslt.getShort(74);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((short[]) buf[144])[0] = rslt.getShort(75);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((short[]) buf[146])[0] = rslt.getShort(76);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((short[]) buf[148])[0] = rslt.getShort(77);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 128);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 15);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 15);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 3);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 8);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((short[]) buf[54])[0] = rslt.getShort(30);
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
               ((java.math.BigDecimal[]) buf[104])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[106])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[108])[0] = rslt.getBigDecimal(57,2);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[110])[0] = rslt.getBigDecimal(58,2);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[112])[0] = rslt.getBigDecimal(59,2);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[114])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[118])[0] = rslt.getBigDecimal(62,2);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(63);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((short[]) buf[122])[0] = rslt.getShort(64);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((short[]) buf[124])[0] = rslt.getShort(65);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(66);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((short[]) buf[128])[0] = rslt.getShort(67);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((short[]) buf[130])[0] = rslt.getShort(68);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((short[]) buf[132])[0] = rslt.getShort(69);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((short[]) buf[134])[0] = rslt.getShort(70);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((short[]) buf[136])[0] = rslt.getShort(71);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((short[]) buf[138])[0] = rslt.getShort(72);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((short[]) buf[140])[0] = rslt.getShort(73);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((short[]) buf[142])[0] = rslt.getShort(74);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 15);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 10);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 128);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[33]);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 15);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 15);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 10);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 3);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 8);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[85], 2);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(45, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(47, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(48, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(52, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(53, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(55, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(56, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(57, (java.math.BigDecimal)parms[113], 2);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[115], 2);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(59, ((Number) parms[117]).shortValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(60, ((Number) parms[119]).shortValue());
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(61, ((Number) parms[121]).shortValue());
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(62, ((Number) parms[123]).shortValue());
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[125]).shortValue());
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[127]).shortValue());
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[129]).shortValue());
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[131]).shortValue());
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[133]).shortValue());
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(68, ((Number) parms[135]).shortValue());
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[137]).shortValue());
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[139]).shortValue());
               }
               stmt.setString(71, (String)parms[140], 3);
               stmt.setString(72, (String)parms[141], 16);
               stmt.setInt(73, ((Number) parms[142]).intValue());
               stmt.setInt(74, ((Number) parms[143]).intValue());
               return;
      }
   }

}

