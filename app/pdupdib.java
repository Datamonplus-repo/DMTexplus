package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdupdib extends GXProcedure
{
   public pdupdib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdupdib.class ), "" );
   }

   public pdupdib( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          int[] aP3 ,
                          String[] aP4 ,
                          int[] aP5 )
   {
      pdupdib.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 )
   {
      pdupdib.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdupdib.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      pdupdib.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pdupdib.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      pdupdib.this.AV15DibCli = aP4[0];
      this.aP4 = aP4;
      pdupdib.this.AV16CliCod = aP5[0];
      this.aP5 = aP5;
      pdupdib.this.AV17DibInt = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV22Artextil ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      pdupdib.this.GXt_int1 = GXv_int2[0] ;
      AV22Artextil = GXt_int1 ;
      /* Using cursor P00YS4 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2090DibMolCi2 = P00YS4_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = P00YS4_n2090DibMolCi2[0] ;
         A1019DibMolCil = P00YS4_A1019DibMolCil[0] ;
         n1019DibMolCil = P00YS4_n1019DibMolCil[0] ;
         A1823DibTipMaq = P00YS4_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P00YS4_n1823DibTipMaq[0] ;
         A1018DibMetRea = P00YS4_A1018DibMetRea[0] ;
         n1018DibMetRea = P00YS4_n1018DibMetRea[0] ;
         A1017DibFecEnt = P00YS4_A1017DibFecEnt[0] ;
         n1017DibFecEnt = P00YS4_n1017DibFecEnt[0] ;
         A1015DibFecUlt = P00YS4_A1015DibFecUlt[0] ;
         n1015DibFecUlt = P00YS4_n1015DibFecUlt[0] ;
         A13116DibSentido = P00YS4_A13116DibSentido[0] ;
         n13116DibSentido = P00YS4_n13116DibSentido[0] ;
         A10929DibAct = P00YS4_A10929DibAct[0] ;
         n10929DibAct = P00YS4_n10929DibAct[0] ;
         A10884DibUltUti = P00YS4_A10884DibUltUti[0] ;
         n10884DibUltUti = P00YS4_n10884DibUltUti[0] ;
         A8193DibSep = P00YS4_A8193DibSep[0] ;
         n8193DibSep = P00YS4_n8193DibSep[0] ;
         A8192DibGra = P00YS4_A8192DibGra[0] ;
         n8192DibGra = P00YS4_n8192DibGra[0] ;
         A7509DibFecBor = P00YS4_A7509DibFecBor[0] ;
         n7509DibFecBor = P00YS4_n7509DibFecBor[0] ;
         A7140DibBmp = P00YS4_A7140DibBmp[0] ;
         n7140DibBmp = P00YS4_n7140DibBmp[0] ;
         A6841DibDsc = P00YS4_A6841DibDsc[0] ;
         n6841DibDsc = P00YS4_n6841DibDsc[0] ;
         A4861DibCob = P00YS4_A4861DibCob[0] ;
         n4861DibCob = P00YS4_n4861DibCob[0] ;
         A4491DibPreOf16 = P00YS4_A4491DibPreOf16[0] ;
         n4491DibPreOf16 = P00YS4_n4491DibPreOf16[0] ;
         A4490DibPreOf15 = P00YS4_A4490DibPreOf15[0] ;
         n4490DibPreOf15 = P00YS4_n4490DibPreOf15[0] ;
         A4489DibPreOf14 = P00YS4_A4489DibPreOf14[0] ;
         n4489DibPreOf14 = P00YS4_n4489DibPreOf14[0] ;
         A4488DibPreOf13 = P00YS4_A4488DibPreOf13[0] ;
         n4488DibPreOf13 = P00YS4_n4488DibPreOf13[0] ;
         A4487DibPreOf12 = P00YS4_A4487DibPreOf12[0] ;
         n4487DibPreOf12 = P00YS4_n4487DibPreOf12[0] ;
         A4486DibPreOf11 = P00YS4_A4486DibPreOf11[0] ;
         n4486DibPreOf11 = P00YS4_n4486DibPreOf11[0] ;
         A4485DibPreAy16 = P00YS4_A4485DibPreAy16[0] ;
         n4485DibPreAy16 = P00YS4_n4485DibPreAy16[0] ;
         A4484DibPreAy15 = P00YS4_A4484DibPreAy15[0] ;
         n4484DibPreAy15 = P00YS4_n4484DibPreAy15[0] ;
         A4483DibPreAy14 = P00YS4_A4483DibPreAy14[0] ;
         n4483DibPreAy14 = P00YS4_n4483DibPreAy14[0] ;
         A4482DibPreAy13 = P00YS4_A4482DibPreAy13[0] ;
         n4482DibPreAy13 = P00YS4_n4482DibPreAy13[0] ;
         A4481DibPreAy12 = P00YS4_A4481DibPreAy12[0] ;
         n4481DibPreAy12 = P00YS4_n4481DibPreAy12[0] ;
         A4480DibPreAy11 = P00YS4_A4480DibPreAy11[0] ;
         n4480DibPreAy11 = P00YS4_n4480DibPreAy11[0] ;
         A1024DibUltLin = P00YS4_A1024DibUltLin[0] ;
         n1024DibUltLin = P00YS4_n1024DibUltLin[0] ;
         A1608DibRap = P00YS4_A1608DibRap[0] ;
         n1608DibRap = P00YS4_n1608DibRap[0] ;
         A1610DibPosRas = P00YS4_A1610DibPosRas[0] ;
         n1610DibPosRas = P00YS4_n1610DibPosRas[0] ;
         A1606DibTipRas = P00YS4_A1606DibTipRas[0] ;
         n1606DibTipRas = P00YS4_n1606DibTipRas[0] ;
         A1824DibUltCil = P00YS4_A1824DibUltCil[0] ;
         n1824DibUltCil = P00YS4_n1824DibUltCil[0] ;
         A1814DibTemQm10 = P00YS4_A1814DibTemQm10[0] ;
         n1814DibTemQm10 = P00YS4_n1814DibTemQm10[0] ;
         A1822DibTemQm9 = P00YS4_A1822DibTemQm9[0] ;
         n1822DibTemQm9 = P00YS4_n1822DibTemQm9[0] ;
         A1821DibTemQm8 = P00YS4_A1821DibTemQm8[0] ;
         n1821DibTemQm8 = P00YS4_n1821DibTemQm8[0] ;
         A1820DibTemQm7 = P00YS4_A1820DibTemQm7[0] ;
         n1820DibTemQm7 = P00YS4_n1820DibTemQm7[0] ;
         A1819DibTemQm6 = P00YS4_A1819DibTemQm6[0] ;
         n1819DibTemQm6 = P00YS4_n1819DibTemQm6[0] ;
         A1818DibTemQm5 = P00YS4_A1818DibTemQm5[0] ;
         n1818DibTemQm5 = P00YS4_n1818DibTemQm5[0] ;
         A1817DibTemQm4 = P00YS4_A1817DibTemQm4[0] ;
         n1817DibTemQm4 = P00YS4_n1817DibTemQm4[0] ;
         A1816DibTemQm3 = P00YS4_A1816DibTemQm3[0] ;
         n1816DibTemQm3 = P00YS4_n1816DibTemQm3[0] ;
         A1815DibTemQm2 = P00YS4_A1815DibTemQm2[0] ;
         n1815DibTemQm2 = P00YS4_n1815DibTemQm2[0] ;
         A1813DibTemQm1 = P00YS4_A1813DibTemQm1[0] ;
         n1813DibTemQm1 = P00YS4_n1813DibTemQm1[0] ;
         A1825DibVelMaq = P00YS4_A1825DibVelMaq[0] ;
         n1825DibVelMaq = P00YS4_n1825DibVelMaq[0] ;
         A1892DibPreOf10 = P00YS4_A1892DibPreOf10[0] ;
         n1892DibPreOf10 = P00YS4_n1892DibPreOf10[0] ;
         A1900DibPreOf9 = P00YS4_A1900DibPreOf9[0] ;
         n1900DibPreOf9 = P00YS4_n1900DibPreOf9[0] ;
         A1899DibPreOf8 = P00YS4_A1899DibPreOf8[0] ;
         n1899DibPreOf8 = P00YS4_n1899DibPreOf8[0] ;
         A1898DibPreOf7 = P00YS4_A1898DibPreOf7[0] ;
         n1898DibPreOf7 = P00YS4_n1898DibPreOf7[0] ;
         A1897DibPreOf6 = P00YS4_A1897DibPreOf6[0] ;
         n1897DibPreOf6 = P00YS4_n1897DibPreOf6[0] ;
         A1896DibPreOf5 = P00YS4_A1896DibPreOf5[0] ;
         n1896DibPreOf5 = P00YS4_n1896DibPreOf5[0] ;
         A1895DibPreOf4 = P00YS4_A1895DibPreOf4[0] ;
         n1895DibPreOf4 = P00YS4_n1895DibPreOf4[0] ;
         A1894DibPreOf3 = P00YS4_A1894DibPreOf3[0] ;
         n1894DibPreOf3 = P00YS4_n1894DibPreOf3[0] ;
         A1893DibPreOf2 = P00YS4_A1893DibPreOf2[0] ;
         n1893DibPreOf2 = P00YS4_n1893DibPreOf2[0] ;
         A1891DibPreOf1 = P00YS4_A1891DibPreOf1[0] ;
         n1891DibPreOf1 = P00YS4_n1891DibPreOf1[0] ;
         A1882DibPreAy10 = P00YS4_A1882DibPreAy10[0] ;
         n1882DibPreAy10 = P00YS4_n1882DibPreAy10[0] ;
         A1890DibPreAy9 = P00YS4_A1890DibPreAy9[0] ;
         n1890DibPreAy9 = P00YS4_n1890DibPreAy9[0] ;
         A1889DibPreAy8 = P00YS4_A1889DibPreAy8[0] ;
         n1889DibPreAy8 = P00YS4_n1889DibPreAy8[0] ;
         A1888DibPreAy7 = P00YS4_A1888DibPreAy7[0] ;
         n1888DibPreAy7 = P00YS4_n1888DibPreAy7[0] ;
         A1887DibPreAy6 = P00YS4_A1887DibPreAy6[0] ;
         n1887DibPreAy6 = P00YS4_n1887DibPreAy6[0] ;
         A1886DibPreAy5 = P00YS4_A1886DibPreAy5[0] ;
         n1886DibPreAy5 = P00YS4_n1886DibPreAy5[0] ;
         A1885DibPreAy4 = P00YS4_A1885DibPreAy4[0] ;
         n1885DibPreAy4 = P00YS4_n1885DibPreAy4[0] ;
         A1884DibPreAy3 = P00YS4_A1884DibPreAy3[0] ;
         n1884DibPreAy3 = P00YS4_n1884DibPreAy3[0] ;
         A1883DibPreAy2 = P00YS4_A1883DibPreAy2[0] ;
         n1883DibPreAy2 = P00YS4_n1883DibPreAy2[0] ;
         A1881DibPreAy1 = P00YS4_A1881DibPreAy1[0] ;
         n1881DibPreAy1 = P00YS4_n1881DibPreAy1[0] ;
         A1806DibLevMaq = P00YS4_A1806DibLevMaq[0] ;
         n1806DibLevMaq = P00YS4_n1806DibLevMaq[0] ;
         A1811DibPosVor = P00YS4_A1811DibPosVor[0] ;
         n1811DibPosVor = P00YS4_n1811DibPosVor[0] ;
         A1607DibMed = P00YS4_A1607DibMed[0] ;
         n1607DibMed = P00YS4_n1607DibMed[0] ;
         A2523DibObsUL = P00YS4_A2523DibObsUL[0] ;
         n2523DibObsUL = P00YS4_n2523DibObsUL[0] ;
         A3911TipMqnCod = P00YS4_A3911TipMqnCod[0] ;
         n3911TipMqnCod = P00YS4_n3911TipMqnCod[0] ;
         A1880DibGraNum = P00YS4_A1880DibGraNum[0] ;
         n1880DibGraNum = P00YS4_n1880DibGraNum[0] ;
         A1023DibMot = P00YS4_A1023DibMot[0] ;
         n1023DibMot = P00YS4_n1023DibMot[0] ;
         A1022DibImp = P00YS4_A1022DibImp[0] ;
         n1022DibImp = P00YS4_n1022DibImp[0] ;
         A1021DibCar = P00YS4_A1021DibCar[0] ;
         n1021DibCar = P00YS4_n1021DibCar[0] ;
         A1609DibObs2 = P00YS4_A1609DibObs2[0] ;
         n1609DibObs2 = P00YS4_n1609DibObs2[0] ;
         A1020DibObs = P00YS4_A1020DibObs[0] ;
         n1020DibObs = P00YS4_n1020DibObs[0] ;
         A1605DibLocal = P00YS4_A1605DibLocal[0] ;
         n1605DibLocal = P00YS4_n1605DibLocal[0] ;
         A1016DibFecPed = P00YS4_A1016DibFecPed[0] ;
         n1016DibFecPed = P00YS4_n1016DibFecPed[0] ;
         A1005GrabCod = P00YS4_A1005GrabCod[0] ;
         n1005GrabCod = P00YS4_n1005GrabCod[0] ;
         A1025DibNumLin = P00YS4_A1025DibNumLin[0] ;
         A2091DibNumLi2 = P00YS4_A2091DibNumLi2[0] ;
         n2091DibNumLi2 = P00YS4_n2091DibNumLi2[0] ;
         A4902DibCobTot = P00YS4_A4902DibCobTot[0] ;
         A1025DibNumLin = P00YS4_A1025DibNumLin[0] ;
         A4902DibCobTot = P00YS4_A4902DibCobTot[0] ;
         A2091DibNumLi2 = P00YS4_A2091DibNumLi2[0] ;
         n2091DibNumLi2 = P00YS4_n2091DibNumLi2[0] ;
         W1013DibCli = A1013DibCli ;
         W252CliCod = A252CliCod ;
         W1014DibInt = A1014DibInt ;
         if ( AV22Artextil == 1 )
         {
            AV23DibTipMaq = GXutil.substring( A1013DibCli, 1, 1) ;
            Gx_msg = httpContext.getMessage( "Artextil, tipo : ", "") + AV23DibTipMaq + GXutil.newLine( ) ;
            if ( GXutil.strcmp(AV23DibTipMaq, GXutil.substring( AV15DibCli, 1, 1)) != 0 )
            {
               Gx_msg += httpContext.getMessage( "Cambio de tipo", "") + GXutil.newLine( ) ;
               if ( GXutil.strcmp(AV23DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
               {
                  AV29DibMolCil = A2090DibMolCi2 ;
                  AV30DibMolCi2 = (short)(0) ;
                  Gx_msg += GXutil.trim( GXutil.str( A2090DibMolCi2, 10, 0)) + httpContext.getMessage( " marcos pasan a ", "") + GXutil.trim( GXutil.str( AV29DibMolCil, 10, 0)) + httpContext.getMessage( " cilindros.", "") + GXutil.newLine( ) ;
               }
               else
               {
                  AV29DibMolCil = (short)(0) ;
                  AV30DibMolCi2 = A1019DibMolCil ;
                  Gx_msg += GXutil.trim( GXutil.str( A1019DibMolCil, 10, 0)) + httpContext.getMessage( " cilindros pasan a ", "") + GXutil.trim( GXutil.str( AV30DibMolCi2, 10, 0)) + httpContext.getMessage( " marcos.", "") + GXutil.newLine( ) ;
               }
            }
            else
            {
               AV30DibMolCi2 = A2090DibMolCi2 ;
               AV29DibMolCil = A1019DibMolCil ;
               Gx_msg += httpContext.getMessage( "Sin cambio de tipo", "") + GXutil.newLine( ) ;
            }
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            AV23DibTipMaq = A1823DibTipMaq ;
         }
         /*
            INSERT RECORD ON TABLE TXPCDIBUJ

         */
         W1013DibCli = A1013DibCli ;
         W252CliCod = A252CliCod ;
         W1014DibInt = A1014DibInt ;
         W1017DibFecEnt = A1017DibFecEnt ;
         n1017DibFecEnt = false ;
         W1018DibMetRea = A1018DibMetRea ;
         n1018DibMetRea = false ;
         W1823DibTipMaq = A1823DibTipMaq ;
         n1823DibTipMaq = false ;
         W1019DibMolCil = A1019DibMolCil ;
         n1019DibMolCil = false ;
         W2090DibMolCi2 = A2090DibMolCi2 ;
         n2090DibMolCi2 = false ;
         W1823DibTipMaq = A1823DibTipMaq ;
         n1823DibTipMaq = false ;
         W1015DibFecUlt = A1015DibFecUlt ;
         n1015DibFecUlt = false ;
         A1013DibCli = AV15DibCli ;
         A252CliCod = AV16CliCod ;
         A1014DibInt = AV17DibInt ;
         A1017DibFecEnt = Gx_date ;
         n1017DibFecEnt = false ;
         A1018DibMetRea = DecimalUtil.doubleToDec(0) ;
         n1018DibMetRea = false ;
         if ( AV22Artextil == 1 )
         {
            A1823DibTipMaq = GXutil.substring( AV15DibCli, 1, 1) ;
            n1823DibTipMaq = false ;
            A1019DibMolCil = AV29DibMolCil ;
            n1019DibMolCil = false ;
            A2090DibMolCi2 = AV30DibMolCi2 ;
            n2090DibMolCi2 = false ;
         }
         else
         {
            A1823DibTipMaq = AV23DibTipMaq ;
            n1823DibTipMaq = false ;
         }
         A1015DibFecUlt = GXutil.nullDate() ;
         n1015DibFecUlt = false ;
         /* Using cursor P00YS5 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod), Boolean.valueOf(n1015DibFecUlt), A1015DibFecUlt, Boolean.valueOf(n1016DibFecPed), A1016DibFecPed, Boolean.valueOf(n1017DibFecEnt), A1017DibFecEnt, Boolean.valueOf(n1018DibMetRea), A1018DibMetRea, Boolean.valueOf(n1605DibLocal), A1605DibLocal, Boolean.valueOf(n1020DibObs), A1020DibObs, Boolean.valueOf(n1609DibObs2), A1609DibObs2, Boolean.valueOf(n1021DibCar), Byte.valueOf(A1021DibCar), Boolean.valueOf(n1022DibImp), A1022DibImp, Boolean.valueOf(n1023DibMot), A1023DibMot, Boolean.valueOf(n1823DibTipMaq), A1823DibTipMaq, Boolean.valueOf(n1880DibGraNum), A1880DibGraNum, Boolean.valueOf(n3911TipMqnCod), Byte.valueOf(A3911TipMqnCod), Boolean.valueOf(n2523DibObsUL), Byte.valueOf(A2523DibObsUL), Boolean.valueOf(n1019DibMolCil), Short.valueOf(A1019DibMolCil), Boolean.valueOf(n1607DibMed), A1607DibMed, Boolean.valueOf(n1811DibPosVor), A1811DibPosVor, Boolean.valueOf(n1806DibLevMaq), A1806DibLevMaq, Boolean.valueOf(n1881DibPreAy1), A1881DibPreAy1, Boolean.valueOf(n1883DibPreAy2), A1883DibPreAy2, Boolean.valueOf(n1884DibPreAy3), A1884DibPreAy3, Boolean.valueOf(n1885DibPreAy4), A1885DibPreAy4, Boolean.valueOf(n1886DibPreAy5), A1886DibPreAy5, Boolean.valueOf(n1887DibPreAy6), A1887DibPreAy6, Boolean.valueOf(n1888DibPreAy7), A1888DibPreAy7, Boolean.valueOf(n1889DibPreAy8), A1889DibPreAy8, Boolean.valueOf(n1890DibPreAy9), A1890DibPreAy9, Boolean.valueOf(n1882DibPreAy10), A1882DibPreAy10, Boolean.valueOf(n1891DibPreOf1), A1891DibPreOf1, Boolean.valueOf(n1893DibPreOf2), A1893DibPreOf2, Boolean.valueOf(n1894DibPreOf3), A1894DibPreOf3, Boolean.valueOf(n1895DibPreOf4), A1895DibPreOf4, Boolean.valueOf(n1896DibPreOf5), A1896DibPreOf5, Boolean.valueOf(n1897DibPreOf6), A1897DibPreOf6, Boolean.valueOf(n1898DibPreOf7), A1898DibPreOf7, Boolean.valueOf(n1899DibPreOf8), A1899DibPreOf8, Boolean.valueOf(n1900DibPreOf9), A1900DibPreOf9, Boolean.valueOf(n1892DibPreOf10), A1892DibPreOf10, Boolean.valueOf(n1825DibVelMaq), Short.valueOf(A1825DibVelMaq), Boolean.valueOf(n1813DibTemQm1), Short.valueOf(A1813DibTemQm1), Boolean.valueOf(n1815DibTemQm2), Short.valueOf(A1815DibTemQm2), Boolean.valueOf(n1816DibTemQm3), Short.valueOf(A1816DibTemQm3), Boolean.valueOf(n1817DibTemQm4), Short.valueOf(A1817DibTemQm4), Boolean.valueOf(n1818DibTemQm5), Short.valueOf(A1818DibTemQm5), Boolean.valueOf(n1819DibTemQm6), Short.valueOf(A1819DibTemQm6), Boolean.valueOf(n1820DibTemQm7), Short.valueOf(A1820DibTemQm7), Boolean.valueOf(n1821DibTemQm8), Short.valueOf(A1821DibTemQm8), Boolean.valueOf(n1822DibTemQm9), Short.valueOf(A1822DibTemQm9), Boolean.valueOf(n1814DibTemQm10), Short.valueOf(A1814DibTemQm10), Boolean.valueOf(n1824DibUltCil), Short.valueOf(A1824DibUltCil), Boolean.valueOf(n2090DibMolCi2), Short.valueOf(A2090DibMolCi2), Boolean.valueOf(n1606DibTipRas), A1606DibTipRas, Boolean.valueOf(n1610DibPosRas), A1610DibPosRas, Boolean.valueOf(n1608DibRap), A1608DibRap, Boolean.valueOf(n1024DibUltLin), Short.valueOf(A1024DibUltLin), Boolean.valueOf(n4480DibPreAy11), A4480DibPreAy11, Boolean.valueOf(n4481DibPreAy12), A4481DibPreAy12, Boolean.valueOf(n4482DibPreAy13), A4482DibPreAy13,
         Boolean.valueOf(n4483DibPreAy14), A4483DibPreAy14, Boolean.valueOf(n4484DibPreAy15), A4484DibPreAy15, Boolean.valueOf(n4485DibPreAy16), A4485DibPreAy16, Boolean.valueOf(n4486DibPreOf11), A4486DibPreOf11, Boolean.valueOf(n4487DibPreOf12), A4487DibPreOf12, Boolean.valueOf(n4488DibPreOf13), A4488DibPreOf13, Boolean.valueOf(n4489DibPreOf14), A4489DibPreOf14, Boolean.valueOf(n4490DibPreOf15), A4490DibPreOf15, Boolean.valueOf(n4491DibPreOf16), A4491DibPreOf16, Boolean.valueOf(n4861DibCob), A4861DibCob, Boolean.valueOf(n6841DibDsc), A6841DibDsc, Boolean.valueOf(n7140DibBmp), A7140DibBmp, Boolean.valueOf(n7509DibFecBor), A7509DibFecBor, Boolean.valueOf(n8192DibGra), A8192DibGra, Boolean.valueOf(n8193DibSep), A8193DibSep, Boolean.valueOf(n10884DibUltUti), A10884DibUltUti, Boolean.valueOf(n10929DibAct), A10929DibAct, Boolean.valueOf(n13116DibSentido), Byte.valueOf(A13116DibSentido)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
         if ( (pr_default.getStatus(1) == 1) )
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
         A1017DibFecEnt = W1017DibFecEnt ;
         n1017DibFecEnt = false ;
         A1018DibMetRea = W1018DibMetRea ;
         n1018DibMetRea = false ;
         A1823DibTipMaq = W1823DibTipMaq ;
         n1823DibTipMaq = false ;
         A1019DibMolCil = W1019DibMolCil ;
         n1019DibMolCil = false ;
         A2090DibMolCi2 = W2090DibMolCi2 ;
         n2090DibMolCi2 = false ;
         A1823DibTipMaq = W1823DibTipMaq ;
         n1823DibTipMaq = false ;
         A1015DibFecUlt = W1015DibFecUlt ;
         n1015DibFecUlt = false ;
         /* End Insert */
         if ( ( ( GXutil.strcmp(GXutil.substring( A1013DibCli, 1, 1), GXutil.substring( AV15DibCli, 1, 1)) == 0 ) ) || ( AV22Artextil == 0 ) )
         {
            /* Using cursor P00YS6 */
            pr_default.execute(2, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1807DibLinCil = P00YS6_A1807DibLinCil[0] ;
               A10793DibCilUlt = P00YS6_A10793DibCilUlt[0] ;
               n10793DibCilUlt = P00YS6_n10793DibCilUlt[0] ;
               A10788DibCilMts = P00YS6_A10788DibCilMts[0] ;
               n10788DibCilMts = P00YS6_n10788DibCilMts[0] ;
               A10787DibCilStF = P00YS6_A10787DibCilStF[0] ;
               n10787DibCilStF = P00YS6_n10787DibCilStF[0] ;
               A10786DibCilSt = P00YS6_A10786DibCilSt[0] ;
               n10786DibCilSt = P00YS6_n10786DibCilSt[0] ;
               A10785DibCilMesh = P00YS6_A10785DibCilMesh[0] ;
               n10785DibCilMesh = P00YS6_n10785DibCilMesh[0] ;
               A10772DibPres = P00YS6_A10772DibPres[0] ;
               n10772DibPres = P00YS6_n10772DibPres[0] ;
               A10771DibDm = P00YS6_A10771DibDm[0] ;
               n10771DibDm = P00YS6_n10771DibDm[0] ;
               A10511DibOrgClid = P00YS6_A10511DibOrgClid[0] ;
               n10511DibOrgClid = P00YS6_n10511DibOrgClid[0] ;
               A10510DibOrgLi = P00YS6_A10510DibOrgLi[0] ;
               n10510DibOrgLi = P00YS6_n10510DibOrgLi[0] ;
               A10509DibOrgCl = P00YS6_A10509DibOrgCl[0] ;
               n10509DibOrgCl = P00YS6_n10509DibOrgCl[0] ;
               A10508DibOrgIn = P00YS6_A10508DibOrgIn[0] ;
               n10508DibOrgIn = P00YS6_n10508DibOrgIn[0] ;
               A8658DibIntSp = P00YS6_A8658DibIntSp[0] ;
               n8658DibIntSp = P00YS6_n8658DibIntSp[0] ;
               A8415DibActivo = P00YS6_A8415DibActivo[0] ;
               n8415DibActivo = P00YS6_n8415DibActivo[0] ;
               A7027DibLinMalC = P00YS6_A7027DibLinMalC[0] ;
               n7027DibLinMalC = P00YS6_n7027DibLinMalC[0] ;
               A7026DibCilCod = P00YS6_A7026DibCilCod[0] ;
               n7026DibCilCod = P00YS6_n7026DibCilCod[0] ;
               A4860DibPrcCob = P00YS6_A4860DibPrcCob[0] ;
               n4860DibPrcCob = P00YS6_n4860DibPrcCob[0] ;
               A1810DibPosCil = P00YS6_A1810DibPosCil[0] ;
               n1810DibPosCil = P00YS6_n1810DibPosCil[0] ;
               A1826TipCilCod = P00YS6_A1826TipCilCod[0] ;
               n1826TipCilCod = P00YS6_n1826TipCilCod[0] ;
               A1808DibOrdCil = P00YS6_A1808DibOrdCil[0] ;
               n1808DibOrdCil = P00YS6_n1808DibOrdCil[0] ;
               A1030DibRelMC = P00YS6_A1030DibRelMC[0] ;
               n1030DibRelMC = P00YS6_n1030DibRelMC[0] ;
               A2089DibLinMol = P00YS6_A2089DibLinMol[0] ;
               n2089DibLinMol = P00YS6_n2089DibLinMol[0] ;
               W1013DibCli = A1013DibCli ;
               W252CliCod = A252CliCod ;
               W1014DibInt = A1014DibInt ;
               AV18DibLinCil = A1807DibLinCil ;
               /*
                  INSERT RECORD ON TABLE TXPLDIBUC

               */
               W1013DibCli = A1013DibCli ;
               W252CliCod = A252CliCod ;
               W1014DibInt = A1014DibInt ;
               W1807DibLinCil = A1807DibLinCil ;
               A1013DibCli = AV15DibCli ;
               A252CliCod = AV16CliCod ;
               A1014DibInt = AV17DibInt ;
               A1807DibLinCil = AV18DibLinCil ;
               /* Using cursor P00YS7 */
               pr_default.execute(3, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Boolean.valueOf(n2089DibLinMol), Byte.valueOf(A2089DibLinMol), Boolean.valueOf(n1030DibRelMC), A1030DibRelMC, Boolean.valueOf(n1808DibOrdCil), Byte.valueOf(A1808DibOrdCil), Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod), Boolean.valueOf(n1810DibPosCil), Byte.valueOf(A1810DibPosCil), Boolean.valueOf(n4860DibPrcCob), A4860DibPrcCob, Boolean.valueOf(n7026DibCilCod), A7026DibCilCod, Boolean.valueOf(n7027DibLinMalC), A7027DibLinMalC, Boolean.valueOf(n8415DibActivo), A8415DibActivo, Boolean.valueOf(n8658DibIntSp), Integer.valueOf(A8658DibIntSp), Boolean.valueOf(n10508DibOrgIn), Integer.valueOf(A10508DibOrgIn), Boolean.valueOf(n10509DibOrgCl), A10509DibOrgCl, Boolean.valueOf(n10510DibOrgLi), Short.valueOf(A10510DibOrgLi), Boolean.valueOf(n10511DibOrgClid), Integer.valueOf(A10511DibOrgClid), Boolean.valueOf(n10771DibDm), Byte.valueOf(A10771DibDm), Boolean.valueOf(n10772DibPres), A10772DibPres, Boolean.valueOf(n10785DibCilMesh), Short.valueOf(A10785DibCilMesh), Boolean.valueOf(n10786DibCilSt), Byte.valueOf(A10786DibCilSt), Boolean.valueOf(n10787DibCilStF), A10787DibCilStF, Boolean.valueOf(n10788DibCilMts), A10788DibCilMts, Boolean.valueOf(n10793DibCilUlt), Integer.valueOf(A10793DibCilUlt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
               if ( (pr_default.getStatus(3) == 1) )
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
               /* End Insert */
               A1013DibCli = W1013DibCli ;
               A252CliCod = W252CliCod ;
               A1014DibInt = W1014DibInt ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P00YS8 */
            pr_default.execute(4, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1029DibLin = P00YS8_A1029DibLin[0] ;
               A7508DibOrgCliC = P00YS8_A7508DibOrgCliC[0] ;
               n7508DibOrgCliC = P00YS8_n7508DibOrgCliC[0] ;
               A7507DibOrgLin = P00YS8_A7507DibOrgLin[0] ;
               n7507DibOrgLin = P00YS8_n7507DibOrgLin[0] ;
               A7506DibOrgCli = P00YS8_A7506DibOrgCli[0] ;
               n7506DibOrgCli = P00YS8_n7506DibOrgCli[0] ;
               A7505DibOrgInt = P00YS8_A7505DibOrgInt[0] ;
               n7505DibOrgInt = P00YS8_n7505DibOrgInt[0] ;
               A6840DibLinMal = P00YS8_A6840DibLinMal[0] ;
               n6840DibLinMal = P00YS8_n6840DibLinMal[0] ;
               A6839DibMolCod = P00YS8_A6839DibMolCod[0] ;
               n6839DibMolCod = P00YS8_n6839DibMolCod[0] ;
               A5381DibPrcCobM = P00YS8_A5381DibPrcCobM[0] ;
               n5381DibPrcCobM = P00YS8_n5381DibPrcCobM[0] ;
               A1828TipGomCod = P00YS8_A1828TipGomCod[0] ;
               n1828TipGomCod = P00YS8_n1828TipGomCod[0] ;
               A1830TipPasCod = P00YS8_A1830TipPasCod[0] ;
               n1830TipPasCod = P00YS8_n1830TipPasCod[0] ;
               A1809DibOrdMol = P00YS8_A1809DibOrdMol[0] ;
               n1809DibOrdMol = P00YS8_n1809DibOrdMol[0] ;
               A2092DibRelMC2 = P00YS8_A2092DibRelMC2[0] ;
               n2092DibRelMC2 = P00YS8_n2092DibRelMC2[0] ;
               A2088DibDibMol = P00YS8_A2088DibDibMol[0] ;
               n2088DibDibMol = P00YS8_n2088DibDibMol[0] ;
               W1013DibCli = A1013DibCli ;
               W252CliCod = A252CliCod ;
               W1014DibInt = A1014DibInt ;
               AV20DibLin = A1029DibLin ;
               /*
                  INSERT RECORD ON TABLE TXPLDIBUJ

               */
               W1013DibCli = A1013DibCli ;
               W252CliCod = A252CliCod ;
               W1014DibInt = A1014DibInt ;
               W1029DibLin = A1029DibLin ;
               A1013DibCli = AV15DibCli ;
               A252CliCod = AV16CliCod ;
               A1014DibInt = AV17DibInt ;
               A1029DibLin = AV20DibLin ;
               /* Using cursor P00YS9 */
               pr_default.execute(5, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1029DibLin), Boolean.valueOf(n2088DibDibMol), Byte.valueOf(A2088DibDibMol), Boolean.valueOf(n2092DibRelMC2), A2092DibRelMC2, Boolean.valueOf(n1809DibOrdMol), Byte.valueOf(A1809DibOrdMol), Boolean.valueOf(n1830TipPasCod), Byte.valueOf(A1830TipPasCod), Boolean.valueOf(n1828TipGomCod), Byte.valueOf(A1828TipGomCod), Boolean.valueOf(n5381DibPrcCobM), A5381DibPrcCobM, Boolean.valueOf(n6839DibMolCod), A6839DibMolCod, Boolean.valueOf(n6840DibLinMal), A6840DibLinMal, Boolean.valueOf(n7505DibOrgInt), Integer.valueOf(A7505DibOrgInt), Boolean.valueOf(n7506DibOrgCli), A7506DibOrgCli, Boolean.valueOf(n7507DibOrgLin), Short.valueOf(A7507DibOrgLin), Boolean.valueOf(n7508DibOrgCliC), Integer.valueOf(A7508DibOrgCliC)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUJ");
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
               A1013DibCli = W1013DibCli ;
               A252CliCod = W252CliCod ;
               A1014DibInt = W1014DibInt ;
               A1029DibLin = W1029DibLin ;
               /* End Insert */
               A1013DibCli = W1013DibCli ;
               A252CliCod = W252CliCod ;
               A1014DibInt = W1014DibInt ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( A1013DibCli, 1, 1), httpContext.getMessage( "R", "")) == 0 )
            {
               /* Using cursor P00YS10 */
               pr_default.execute(6, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A1807DibLinCil = P00YS10_A1807DibLinCil[0] ;
                  A7027DibLinMalC = P00YS10_A7027DibLinMalC[0] ;
                  n7027DibLinMalC = P00YS10_n7027DibLinMalC[0] ;
                  A1808DibOrdCil = P00YS10_A1808DibOrdCil[0] ;
                  n1808DibOrdCil = P00YS10_n1808DibOrdCil[0] ;
                  A4860DibPrcCob = P00YS10_A4860DibPrcCob[0] ;
                  n4860DibPrcCob = P00YS10_n4860DibPrcCob[0] ;
                  A1030DibRelMC = P00YS10_A1030DibRelMC[0] ;
                  n1030DibRelMC = P00YS10_n1030DibRelMC[0] ;
                  A1826TipCilCod = P00YS10_A1826TipCilCod[0] ;
                  n1826TipCilCod = P00YS10_n1826TipCilCod[0] ;
                  A1810DibPosCil = P00YS10_A1810DibPosCil[0] ;
                  n1810DibPosCil = P00YS10_n1810DibPosCil[0] ;
                  A2089DibLinMol = P00YS10_A2089DibLinMol[0] ;
                  n2089DibLinMol = P00YS10_n2089DibLinMol[0] ;
                  A7026DibCilCod = P00YS10_A7026DibCilCod[0] ;
                  n7026DibCilCod = P00YS10_n7026DibCilCod[0] ;
                  W1013DibCli = A1013DibCli ;
                  W252CliCod = A252CliCod ;
                  W1014DibInt = A1014DibInt ;
                  /*
                     INSERT RECORD ON TABLE TXPLDIBUJ

                  */
                  W1013DibCli = A1013DibCli ;
                  W252CliCod = A252CliCod ;
                  W1014DibInt = A1014DibInt ;
                  A1013DibCli = AV15DibCli ;
                  A252CliCod = AV16CliCod ;
                  A1014DibInt = AV17DibInt ;
                  A1029DibLin = A1807DibLinCil ;
                  A2088DibDibMol = (byte)(A1807DibLinCil) ;
                  n2088DibDibMol = false ;
                  A6840DibLinMal = A7027DibLinMalC ;
                  n6840DibLinMal = false ;
                  A1809DibOrdMol = A1808DibOrdCil ;
                  n1809DibOrdMol = false ;
                  A5381DibPrcCobM = A4860DibPrcCob ;
                  n5381DibPrcCobM = false ;
                  A2092DibRelMC2 = A1030DibRelMC ;
                  n2092DibRelMC2 = false ;
                  A1828TipGomCod = (byte)(0) ;
                  n1828TipGomCod = false ;
                  A1830TipPasCod = A1826TipCilCod ;
                  n1830TipPasCod = false ;
                  /* Using cursor P00YS11 */
                  pr_default.execute(7, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1029DibLin), Boolean.valueOf(n2088DibDibMol), Byte.valueOf(A2088DibDibMol), Boolean.valueOf(n2092DibRelMC2), A2092DibRelMC2, Boolean.valueOf(n1809DibOrdMol), Byte.valueOf(A1809DibOrdMol), Boolean.valueOf(n1830TipPasCod), Byte.valueOf(A1830TipPasCod), Boolean.valueOf(n1828TipGomCod), Byte.valueOf(A1828TipGomCod), Boolean.valueOf(n5381DibPrcCobM), A5381DibPrcCobM, Boolean.valueOf(n6840DibLinMal), A6840DibLinMal});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUJ");
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
                  A1013DibCli = W1013DibCli ;
                  A252CliCod = W252CliCod ;
                  A1014DibInt = W1014DibInt ;
                  /* End Insert */
                  A1013DibCli = W1013DibCli ;
                  A252CliCod = W252CliCod ;
                  A1014DibInt = W1014DibInt ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
            }
            else
            {
               /* Using cursor P00YS12 */
               pr_default.execute(8, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A1029DibLin = P00YS12_A1029DibLin[0] ;
                  A2088DibDibMol = P00YS12_A2088DibDibMol[0] ;
                  n2088DibDibMol = P00YS12_n2088DibDibMol[0] ;
                  A6840DibLinMal = P00YS12_A6840DibLinMal[0] ;
                  n6840DibLinMal = P00YS12_n6840DibLinMal[0] ;
                  A1809DibOrdMol = P00YS12_A1809DibOrdMol[0] ;
                  n1809DibOrdMol = P00YS12_n1809DibOrdMol[0] ;
                  A5381DibPrcCobM = P00YS12_A5381DibPrcCobM[0] ;
                  n5381DibPrcCobM = P00YS12_n5381DibPrcCobM[0] ;
                  A2092DibRelMC2 = P00YS12_A2092DibRelMC2[0] ;
                  n2092DibRelMC2 = P00YS12_n2092DibRelMC2[0] ;
                  A1830TipPasCod = P00YS12_A1830TipPasCod[0] ;
                  n1830TipPasCod = P00YS12_n1830TipPasCod[0] ;
                  A1828TipGomCod = P00YS12_A1828TipGomCod[0] ;
                  n1828TipGomCod = P00YS12_n1828TipGomCod[0] ;
                  A6839DibMolCod = P00YS12_A6839DibMolCod[0] ;
                  n6839DibMolCod = P00YS12_n6839DibMolCod[0] ;
                  W1013DibCli = A1013DibCli ;
                  W252CliCod = A252CliCod ;
                  W1014DibInt = A1014DibInt ;
                  /*
                     INSERT RECORD ON TABLE TXPLDIBUC

                  */
                  W1013DibCli = A1013DibCli ;
                  W252CliCod = A252CliCod ;
                  W1014DibInt = A1014DibInt ;
                  A1013DibCli = AV15DibCli ;
                  A252CliCod = AV16CliCod ;
                  A1014DibInt = AV17DibInt ;
                  A1807DibLinCil = A1029DibLin ;
                  A1807DibLinCil = A2088DibDibMol ;
                  A7027DibLinMalC = A6840DibLinMal ;
                  n7027DibLinMalC = false ;
                  A1808DibOrdCil = A1809DibOrdMol ;
                  n1808DibOrdCil = false ;
                  A4860DibPrcCob = A5381DibPrcCobM ;
                  n4860DibPrcCob = false ;
                  A1030DibRelMC = A2092DibRelMC2 ;
                  n1030DibRelMC = false ;
                  A1826TipCilCod = A1830TipPasCod ;
                  n1826TipCilCod = false ;
                  /* Using cursor P00YS13 */
                  pr_default.execute(9, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Boolean.valueOf(n1030DibRelMC), A1030DibRelMC, Boolean.valueOf(n1808DibOrdCil), Byte.valueOf(A1808DibOrdCil), Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod), Boolean.valueOf(n4860DibPrcCob), A4860DibPrcCob, Boolean.valueOf(n7027DibLinMalC), A7027DibLinMalC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
                  if ( (pr_default.getStatus(9) == 1) )
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
                  /* End Insert */
                  A1013DibCli = W1013DibCli ;
                  A252CliCod = W252CliCod ;
                  A1014DibInt = W1014DibInt ;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
            }
         }
         /* Using cursor P00YS14 */
         pr_default.execute(10, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A2521DibObsLin = P00YS14_A2521DibObsLin[0] ;
            A2522DibObsTxt = P00YS14_A2522DibObsTxt[0] ;
            n2522DibObsTxt = P00YS14_n2522DibObsTxt[0] ;
            W1013DibCli = A1013DibCli ;
            W252CliCod = A252CliCod ;
            W1014DibInt = A1014DibInt ;
            AV19DibObsLin = A2521DibObsLin ;
            /*
               INSERT RECORD ON TABLE TXPDIBOBS

            */
            W1013DibCli = A1013DibCli ;
            W252CliCod = A252CliCod ;
            W1014DibInt = A1014DibInt ;
            W2521DibObsLin = A2521DibObsLin ;
            A1013DibCli = AV15DibCli ;
            A252CliCod = AV16CliCod ;
            A1014DibInt = AV17DibInt ;
            A2521DibObsLin = AV19DibObsLin ;
            /* Using cursor P00YS15 */
            pr_default.execute(11, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Byte.valueOf(A2521DibObsLin), Boolean.valueOf(n2522DibObsTxt), A2522DibObsTxt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBOBS");
            if ( (pr_default.getStatus(11) == 1) )
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
            A2521DibObsLin = W2521DibObsLin ;
            /* End Insert */
            A1013DibCli = W1013DibCli ;
            A252CliCod = W252CliCod ;
            A1014DibInt = W1014DibInt ;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         A1013DibCli = W1013DibCli ;
         A252CliCod = W252CliCod ;
         A1014DibInt = W1014DibInt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00YS16 */
      pr_default.execute(12, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A1014DibInt), Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A7675AMOrden = P00YS16_A7675AMOrden[0] ;
         n7675AMOrden = P00YS16_n7675AMOrden[0] ;
         A7504AMCliCod = P00YS16_A7504AMCliCod[0] ;
         A7503AMDibInt = P00YS16_A7503AMDibInt[0] ;
         A7502AMDibCli = P00YS16_A7502AMDibCli[0] ;
         W396EmprCod = A396EmprCod ;
         W1013DibCli = A1013DibCli ;
         W1014DibInt = A1014DibInt ;
         W252CliCod = A252CliCod ;
         AV28EmprCod = A396EmprCod ;
         AV24AMCliCod = A7504AMCliCod ;
         AV25AMDibCli = A7502AMDibCli ;
         AV26AMDibInt = A7503AMDibInt ;
         AV27AMOrden = A7675AMOrden ;
         /*
            INSERT RECORD ON TABLE TXPARTMZA

         */
         W1013DibCli = A1013DibCli ;
         W252CliCod = A252CliCod ;
         W1014DibInt = A1014DibInt ;
         W396EmprCod = A396EmprCod ;
         W7504AMCliCod = A7504AMCliCod ;
         W7502AMDibCli = A7502AMDibCli ;
         W7503AMDibInt = A7503AMDibInt ;
         W7675AMOrden = A7675AMOrden ;
         n7675AMOrden = false ;
         A1013DibCli = AV15DibCli ;
         A252CliCod = AV16CliCod ;
         A1014DibInt = AV17DibInt ;
         A396EmprCod = AV28EmprCod ;
         A7504AMCliCod = AV24AMCliCod ;
         A7502AMDibCli = AV25AMDibCli ;
         A7503AMDibInt = AV26AMDibInt ;
         A7675AMOrden = AV27AMOrden ;
         n7675AMOrden = false ;
         /* Using cursor P00YS17 */
         pr_default.execute(13, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A1014DibInt), Integer.valueOf(A252CliCod), A7502AMDibCli, Integer.valueOf(A7503AMDibInt), Integer.valueOf(A7504AMCliCod), Boolean.valueOf(n7675AMOrden), Byte.valueOf(A7675AMOrden)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMZA");
         if ( (pr_default.getStatus(13) == 1) )
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
         A396EmprCod = W396EmprCod ;
         A7504AMCliCod = W7504AMCliCod ;
         A7502AMDibCli = W7502AMDibCli ;
         A7503AMDibInt = W7503AMDibInt ;
         A7675AMOrden = W7675AMOrden ;
         n7675AMOrden = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A1013DibCli = W1013DibCli ;
         A1014DibInt = W1014DibInt ;
         A252CliCod = W252CliCod ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdupdib.this.A396EmprCod;
      this.aP1[0] = pdupdib.this.A1013DibCli;
      this.aP2[0] = pdupdib.this.A252CliCod;
      this.aP3[0] = pdupdib.this.A1014DibInt;
      this.aP4[0] = pdupdib.this.AV15DibCli;
      this.aP5[0] = pdupdib.this.AV16CliCod;
      this.aP6[0] = pdupdib.this.AV17DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdupdib");
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
      P00YS4_A396EmprCod = new String[] {""} ;
      P00YS4_A1013DibCli = new String[] {""} ;
      P00YS4_A252CliCod = new int[1] ;
      P00YS4_A1014DibInt = new int[1] ;
      P00YS4_A2090DibMolCi2 = new short[1] ;
      P00YS4_n2090DibMolCi2 = new boolean[] {false} ;
      P00YS4_A1019DibMolCil = new short[1] ;
      P00YS4_n1019DibMolCil = new boolean[] {false} ;
      P00YS4_A1823DibTipMaq = new String[] {""} ;
      P00YS4_n1823DibTipMaq = new boolean[] {false} ;
      P00YS4_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1018DibMetRea = new boolean[] {false} ;
      P00YS4_A1017DibFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P00YS4_n1017DibFecEnt = new boolean[] {false} ;
      P00YS4_A1015DibFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P00YS4_n1015DibFecUlt = new boolean[] {false} ;
      P00YS4_A13116DibSentido = new byte[1] ;
      P00YS4_n13116DibSentido = new boolean[] {false} ;
      P00YS4_A10929DibAct = new String[] {""} ;
      P00YS4_n10929DibAct = new boolean[] {false} ;
      P00YS4_A10884DibUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P00YS4_n10884DibUltUti = new boolean[] {false} ;
      P00YS4_A8193DibSep = new String[] {""} ;
      P00YS4_n8193DibSep = new boolean[] {false} ;
      P00YS4_A8192DibGra = new String[] {""} ;
      P00YS4_n8192DibGra = new boolean[] {false} ;
      P00YS4_A7509DibFecBor = new java.util.Date[] {GXutil.nullDate()} ;
      P00YS4_n7509DibFecBor = new boolean[] {false} ;
      P00YS4_A7140DibBmp = new String[] {""} ;
      P00YS4_n7140DibBmp = new boolean[] {false} ;
      P00YS4_A6841DibDsc = new String[] {""} ;
      P00YS4_n6841DibDsc = new boolean[] {false} ;
      P00YS4_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4861DibCob = new boolean[] {false} ;
      P00YS4_A4491DibPreOf16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4491DibPreOf16 = new boolean[] {false} ;
      P00YS4_A4490DibPreOf15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4490DibPreOf15 = new boolean[] {false} ;
      P00YS4_A4489DibPreOf14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4489DibPreOf14 = new boolean[] {false} ;
      P00YS4_A4488DibPreOf13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4488DibPreOf13 = new boolean[] {false} ;
      P00YS4_A4487DibPreOf12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4487DibPreOf12 = new boolean[] {false} ;
      P00YS4_A4486DibPreOf11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4486DibPreOf11 = new boolean[] {false} ;
      P00YS4_A4485DibPreAy16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4485DibPreAy16 = new boolean[] {false} ;
      P00YS4_A4484DibPreAy15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4484DibPreAy15 = new boolean[] {false} ;
      P00YS4_A4483DibPreAy14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4483DibPreAy14 = new boolean[] {false} ;
      P00YS4_A4482DibPreAy13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4482DibPreAy13 = new boolean[] {false} ;
      P00YS4_A4481DibPreAy12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4481DibPreAy12 = new boolean[] {false} ;
      P00YS4_A4480DibPreAy11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n4480DibPreAy11 = new boolean[] {false} ;
      P00YS4_A1024DibUltLin = new short[1] ;
      P00YS4_n1024DibUltLin = new boolean[] {false} ;
      P00YS4_A1608DibRap = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1608DibRap = new boolean[] {false} ;
      P00YS4_A1610DibPosRas = new String[] {""} ;
      P00YS4_n1610DibPosRas = new boolean[] {false} ;
      P00YS4_A1606DibTipRas = new String[] {""} ;
      P00YS4_n1606DibTipRas = new boolean[] {false} ;
      P00YS4_A1824DibUltCil = new short[1] ;
      P00YS4_n1824DibUltCil = new boolean[] {false} ;
      P00YS4_A1814DibTemQm10 = new short[1] ;
      P00YS4_n1814DibTemQm10 = new boolean[] {false} ;
      P00YS4_A1822DibTemQm9 = new short[1] ;
      P00YS4_n1822DibTemQm9 = new boolean[] {false} ;
      P00YS4_A1821DibTemQm8 = new short[1] ;
      P00YS4_n1821DibTemQm8 = new boolean[] {false} ;
      P00YS4_A1820DibTemQm7 = new short[1] ;
      P00YS4_n1820DibTemQm7 = new boolean[] {false} ;
      P00YS4_A1819DibTemQm6 = new short[1] ;
      P00YS4_n1819DibTemQm6 = new boolean[] {false} ;
      P00YS4_A1818DibTemQm5 = new short[1] ;
      P00YS4_n1818DibTemQm5 = new boolean[] {false} ;
      P00YS4_A1817DibTemQm4 = new short[1] ;
      P00YS4_n1817DibTemQm4 = new boolean[] {false} ;
      P00YS4_A1816DibTemQm3 = new short[1] ;
      P00YS4_n1816DibTemQm3 = new boolean[] {false} ;
      P00YS4_A1815DibTemQm2 = new short[1] ;
      P00YS4_n1815DibTemQm2 = new boolean[] {false} ;
      P00YS4_A1813DibTemQm1 = new short[1] ;
      P00YS4_n1813DibTemQm1 = new boolean[] {false} ;
      P00YS4_A1825DibVelMaq = new short[1] ;
      P00YS4_n1825DibVelMaq = new boolean[] {false} ;
      P00YS4_A1892DibPreOf10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1892DibPreOf10 = new boolean[] {false} ;
      P00YS4_A1900DibPreOf9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1900DibPreOf9 = new boolean[] {false} ;
      P00YS4_A1899DibPreOf8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1899DibPreOf8 = new boolean[] {false} ;
      P00YS4_A1898DibPreOf7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1898DibPreOf7 = new boolean[] {false} ;
      P00YS4_A1897DibPreOf6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1897DibPreOf6 = new boolean[] {false} ;
      P00YS4_A1896DibPreOf5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1896DibPreOf5 = new boolean[] {false} ;
      P00YS4_A1895DibPreOf4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1895DibPreOf4 = new boolean[] {false} ;
      P00YS4_A1894DibPreOf3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1894DibPreOf3 = new boolean[] {false} ;
      P00YS4_A1893DibPreOf2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1893DibPreOf2 = new boolean[] {false} ;
      P00YS4_A1891DibPreOf1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1891DibPreOf1 = new boolean[] {false} ;
      P00YS4_A1882DibPreAy10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1882DibPreAy10 = new boolean[] {false} ;
      P00YS4_A1890DibPreAy9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1890DibPreAy9 = new boolean[] {false} ;
      P00YS4_A1889DibPreAy8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1889DibPreAy8 = new boolean[] {false} ;
      P00YS4_A1888DibPreAy7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1888DibPreAy7 = new boolean[] {false} ;
      P00YS4_A1887DibPreAy6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1887DibPreAy6 = new boolean[] {false} ;
      P00YS4_A1886DibPreAy5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1886DibPreAy5 = new boolean[] {false} ;
      P00YS4_A1885DibPreAy4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1885DibPreAy4 = new boolean[] {false} ;
      P00YS4_A1884DibPreAy3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1884DibPreAy3 = new boolean[] {false} ;
      P00YS4_A1883DibPreAy2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1883DibPreAy2 = new boolean[] {false} ;
      P00YS4_A1881DibPreAy1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1881DibPreAy1 = new boolean[] {false} ;
      P00YS4_A1806DibLevMaq = new String[] {""} ;
      P00YS4_n1806DibLevMaq = new boolean[] {false} ;
      P00YS4_A1811DibPosVor = new String[] {""} ;
      P00YS4_n1811DibPosVor = new boolean[] {false} ;
      P00YS4_A1607DibMed = new String[] {""} ;
      P00YS4_n1607DibMed = new boolean[] {false} ;
      P00YS4_A2523DibObsUL = new byte[1] ;
      P00YS4_n2523DibObsUL = new boolean[] {false} ;
      P00YS4_A3911TipMqnCod = new byte[1] ;
      P00YS4_n3911TipMqnCod = new boolean[] {false} ;
      P00YS4_A1880DibGraNum = new String[] {""} ;
      P00YS4_n1880DibGraNum = new boolean[] {false} ;
      P00YS4_A1023DibMot = new String[] {""} ;
      P00YS4_n1023DibMot = new boolean[] {false} ;
      P00YS4_A1022DibImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS4_n1022DibImp = new boolean[] {false} ;
      P00YS4_A1021DibCar = new byte[1] ;
      P00YS4_n1021DibCar = new boolean[] {false} ;
      P00YS4_A1609DibObs2 = new String[] {""} ;
      P00YS4_n1609DibObs2 = new boolean[] {false} ;
      P00YS4_A1020DibObs = new String[] {""} ;
      P00YS4_n1020DibObs = new boolean[] {false} ;
      P00YS4_A1605DibLocal = new String[] {""} ;
      P00YS4_n1605DibLocal = new boolean[] {false} ;
      P00YS4_A1016DibFecPed = new java.util.Date[] {GXutil.nullDate()} ;
      P00YS4_n1016DibFecPed = new boolean[] {false} ;
      P00YS4_A1005GrabCod = new short[1] ;
      P00YS4_n1005GrabCod = new boolean[] {false} ;
      P00YS4_A1025DibNumLin = new short[1] ;
      P00YS4_A2091DibNumLi2 = new short[1] ;
      P00YS4_n2091DibNumLi2 = new boolean[] {false} ;
      P00YS4_A4902DibCobTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1823DibTipMaq = "" ;
      A1018DibMetRea = DecimalUtil.ZERO ;
      A1017DibFecEnt = GXutil.nullDate() ;
      A1015DibFecUlt = GXutil.nullDate() ;
      A10929DibAct = "" ;
      A10884DibUltUti = GXutil.nullDate() ;
      A8193DibSep = "" ;
      A8192DibGra = "" ;
      A7509DibFecBor = GXutil.nullDate() ;
      A7140DibBmp = "" ;
      A6841DibDsc = "" ;
      A4861DibCob = DecimalUtil.ZERO ;
      A4491DibPreOf16 = DecimalUtil.ZERO ;
      A4490DibPreOf15 = DecimalUtil.ZERO ;
      A4489DibPreOf14 = DecimalUtil.ZERO ;
      A4488DibPreOf13 = DecimalUtil.ZERO ;
      A4487DibPreOf12 = DecimalUtil.ZERO ;
      A4486DibPreOf11 = DecimalUtil.ZERO ;
      A4485DibPreAy16 = DecimalUtil.ZERO ;
      A4484DibPreAy15 = DecimalUtil.ZERO ;
      A4483DibPreAy14 = DecimalUtil.ZERO ;
      A4482DibPreAy13 = DecimalUtil.ZERO ;
      A4481DibPreAy12 = DecimalUtil.ZERO ;
      A4480DibPreAy11 = DecimalUtil.ZERO ;
      A1608DibRap = DecimalUtil.ZERO ;
      A1610DibPosRas = "" ;
      A1606DibTipRas = "" ;
      A1892DibPreOf10 = DecimalUtil.ZERO ;
      A1900DibPreOf9 = DecimalUtil.ZERO ;
      A1899DibPreOf8 = DecimalUtil.ZERO ;
      A1898DibPreOf7 = DecimalUtil.ZERO ;
      A1897DibPreOf6 = DecimalUtil.ZERO ;
      A1896DibPreOf5 = DecimalUtil.ZERO ;
      A1895DibPreOf4 = DecimalUtil.ZERO ;
      A1894DibPreOf3 = DecimalUtil.ZERO ;
      A1893DibPreOf2 = DecimalUtil.ZERO ;
      A1891DibPreOf1 = DecimalUtil.ZERO ;
      A1882DibPreAy10 = DecimalUtil.ZERO ;
      A1890DibPreAy9 = DecimalUtil.ZERO ;
      A1889DibPreAy8 = DecimalUtil.ZERO ;
      A1888DibPreAy7 = DecimalUtil.ZERO ;
      A1887DibPreAy6 = DecimalUtil.ZERO ;
      A1886DibPreAy5 = DecimalUtil.ZERO ;
      A1885DibPreAy4 = DecimalUtil.ZERO ;
      A1884DibPreAy3 = DecimalUtil.ZERO ;
      A1883DibPreAy2 = DecimalUtil.ZERO ;
      A1881DibPreAy1 = DecimalUtil.ZERO ;
      A1806DibLevMaq = "" ;
      A1811DibPosVor = "" ;
      A1607DibMed = "" ;
      A1880DibGraNum = "" ;
      A1023DibMot = "" ;
      A1022DibImp = DecimalUtil.ZERO ;
      A1609DibObs2 = "" ;
      A1020DibObs = "" ;
      A1605DibLocal = "" ;
      A1016DibFecPed = GXutil.nullDate() ;
      A4902DibCobTot = DecimalUtil.ZERO ;
      W1013DibCli = "" ;
      AV23DibTipMaq = "" ;
      Gx_msg = "" ;
      W1017DibFecEnt = GXutil.nullDate() ;
      W1018DibMetRea = DecimalUtil.ZERO ;
      W1823DibTipMaq = "" ;
      W1015DibFecUlt = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      Gx_emsg = "" ;
      P00YS6_A396EmprCod = new String[] {""} ;
      P00YS6_A1013DibCli = new String[] {""} ;
      P00YS6_A252CliCod = new int[1] ;
      P00YS6_A1014DibInt = new int[1] ;
      P00YS6_A1807DibLinCil = new short[1] ;
      P00YS6_A10793DibCilUlt = new int[1] ;
      P00YS6_n10793DibCilUlt = new boolean[] {false} ;
      P00YS6_A10788DibCilMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS6_n10788DibCilMts = new boolean[] {false} ;
      P00YS6_A10787DibCilStF = new java.util.Date[] {GXutil.nullDate()} ;
      P00YS6_n10787DibCilStF = new boolean[] {false} ;
      P00YS6_A10786DibCilSt = new byte[1] ;
      P00YS6_n10786DibCilSt = new boolean[] {false} ;
      P00YS6_A10785DibCilMesh = new short[1] ;
      P00YS6_n10785DibCilMesh = new boolean[] {false} ;
      P00YS6_A10772DibPres = new String[] {""} ;
      P00YS6_n10772DibPres = new boolean[] {false} ;
      P00YS6_A10771DibDm = new byte[1] ;
      P00YS6_n10771DibDm = new boolean[] {false} ;
      P00YS6_A10511DibOrgClid = new int[1] ;
      P00YS6_n10511DibOrgClid = new boolean[] {false} ;
      P00YS6_A10510DibOrgLi = new short[1] ;
      P00YS6_n10510DibOrgLi = new boolean[] {false} ;
      P00YS6_A10509DibOrgCl = new String[] {""} ;
      P00YS6_n10509DibOrgCl = new boolean[] {false} ;
      P00YS6_A10508DibOrgIn = new int[1] ;
      P00YS6_n10508DibOrgIn = new boolean[] {false} ;
      P00YS6_A8658DibIntSp = new int[1] ;
      P00YS6_n8658DibIntSp = new boolean[] {false} ;
      P00YS6_A8415DibActivo = new String[] {""} ;
      P00YS6_n8415DibActivo = new boolean[] {false} ;
      P00YS6_A7027DibLinMalC = new String[] {""} ;
      P00YS6_n7027DibLinMalC = new boolean[] {false} ;
      P00YS6_A7026DibCilCod = new String[] {""} ;
      P00YS6_n7026DibCilCod = new boolean[] {false} ;
      P00YS6_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS6_n4860DibPrcCob = new boolean[] {false} ;
      P00YS6_A1810DibPosCil = new byte[1] ;
      P00YS6_n1810DibPosCil = new boolean[] {false} ;
      P00YS6_A1826TipCilCod = new byte[1] ;
      P00YS6_n1826TipCilCod = new boolean[] {false} ;
      P00YS6_A1808DibOrdCil = new byte[1] ;
      P00YS6_n1808DibOrdCil = new boolean[] {false} ;
      P00YS6_A1030DibRelMC = new String[] {""} ;
      P00YS6_n1030DibRelMC = new boolean[] {false} ;
      P00YS6_A2089DibLinMol = new byte[1] ;
      P00YS6_n2089DibLinMol = new boolean[] {false} ;
      A10788DibCilMts = DecimalUtil.ZERO ;
      A10787DibCilStF = GXutil.nullDate() ;
      A10772DibPres = "" ;
      A10509DibOrgCl = "" ;
      A8415DibActivo = "" ;
      A7027DibLinMalC = "" ;
      A7026DibCilCod = "" ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      A1030DibRelMC = "" ;
      P00YS8_A396EmprCod = new String[] {""} ;
      P00YS8_A1013DibCli = new String[] {""} ;
      P00YS8_A252CliCod = new int[1] ;
      P00YS8_A1014DibInt = new int[1] ;
      P00YS8_A1029DibLin = new short[1] ;
      P00YS8_A7508DibOrgCliC = new int[1] ;
      P00YS8_n7508DibOrgCliC = new boolean[] {false} ;
      P00YS8_A7507DibOrgLin = new short[1] ;
      P00YS8_n7507DibOrgLin = new boolean[] {false} ;
      P00YS8_A7506DibOrgCli = new String[] {""} ;
      P00YS8_n7506DibOrgCli = new boolean[] {false} ;
      P00YS8_A7505DibOrgInt = new int[1] ;
      P00YS8_n7505DibOrgInt = new boolean[] {false} ;
      P00YS8_A6840DibLinMal = new String[] {""} ;
      P00YS8_n6840DibLinMal = new boolean[] {false} ;
      P00YS8_A6839DibMolCod = new String[] {""} ;
      P00YS8_n6839DibMolCod = new boolean[] {false} ;
      P00YS8_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS8_n5381DibPrcCobM = new boolean[] {false} ;
      P00YS8_A1828TipGomCod = new byte[1] ;
      P00YS8_n1828TipGomCod = new boolean[] {false} ;
      P00YS8_A1830TipPasCod = new byte[1] ;
      P00YS8_n1830TipPasCod = new boolean[] {false} ;
      P00YS8_A1809DibOrdMol = new byte[1] ;
      P00YS8_n1809DibOrdMol = new boolean[] {false} ;
      P00YS8_A2092DibRelMC2 = new String[] {""} ;
      P00YS8_n2092DibRelMC2 = new boolean[] {false} ;
      P00YS8_A2088DibDibMol = new byte[1] ;
      P00YS8_n2088DibDibMol = new boolean[] {false} ;
      A7506DibOrgCli = "" ;
      A6840DibLinMal = "" ;
      A6839DibMolCod = "" ;
      A5381DibPrcCobM = DecimalUtil.ZERO ;
      A2092DibRelMC2 = "" ;
      P00YS10_A396EmprCod = new String[] {""} ;
      P00YS10_A1013DibCli = new String[] {""} ;
      P00YS10_A252CliCod = new int[1] ;
      P00YS10_A1014DibInt = new int[1] ;
      P00YS10_A1807DibLinCil = new short[1] ;
      P00YS10_A7027DibLinMalC = new String[] {""} ;
      P00YS10_n7027DibLinMalC = new boolean[] {false} ;
      P00YS10_A1808DibOrdCil = new byte[1] ;
      P00YS10_n1808DibOrdCil = new boolean[] {false} ;
      P00YS10_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS10_n4860DibPrcCob = new boolean[] {false} ;
      P00YS10_A1030DibRelMC = new String[] {""} ;
      P00YS10_n1030DibRelMC = new boolean[] {false} ;
      P00YS10_A1826TipCilCod = new byte[1] ;
      P00YS10_n1826TipCilCod = new boolean[] {false} ;
      P00YS10_A1810DibPosCil = new byte[1] ;
      P00YS10_n1810DibPosCil = new boolean[] {false} ;
      P00YS10_A2089DibLinMol = new byte[1] ;
      P00YS10_n2089DibLinMol = new boolean[] {false} ;
      P00YS10_A7026DibCilCod = new String[] {""} ;
      P00YS10_n7026DibCilCod = new boolean[] {false} ;
      P00YS12_A396EmprCod = new String[] {""} ;
      P00YS12_A1013DibCli = new String[] {""} ;
      P00YS12_A252CliCod = new int[1] ;
      P00YS12_A1014DibInt = new int[1] ;
      P00YS12_A1029DibLin = new short[1] ;
      P00YS12_A2088DibDibMol = new byte[1] ;
      P00YS12_n2088DibDibMol = new boolean[] {false} ;
      P00YS12_A6840DibLinMal = new String[] {""} ;
      P00YS12_n6840DibLinMal = new boolean[] {false} ;
      P00YS12_A1809DibOrdMol = new byte[1] ;
      P00YS12_n1809DibOrdMol = new boolean[] {false} ;
      P00YS12_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YS12_n5381DibPrcCobM = new boolean[] {false} ;
      P00YS12_A2092DibRelMC2 = new String[] {""} ;
      P00YS12_n2092DibRelMC2 = new boolean[] {false} ;
      P00YS12_A1830TipPasCod = new byte[1] ;
      P00YS12_n1830TipPasCod = new boolean[] {false} ;
      P00YS12_A1828TipGomCod = new byte[1] ;
      P00YS12_n1828TipGomCod = new boolean[] {false} ;
      P00YS12_A6839DibMolCod = new String[] {""} ;
      P00YS12_n6839DibMolCod = new boolean[] {false} ;
      P00YS14_A396EmprCod = new String[] {""} ;
      P00YS14_A1013DibCli = new String[] {""} ;
      P00YS14_A252CliCod = new int[1] ;
      P00YS14_A1014DibInt = new int[1] ;
      P00YS14_A2521DibObsLin = new byte[1] ;
      P00YS14_A2522DibObsTxt = new String[] {""} ;
      P00YS14_n2522DibObsTxt = new boolean[] {false} ;
      A2522DibObsTxt = "" ;
      P00YS16_A396EmprCod = new String[] {""} ;
      P00YS16_A1013DibCli = new String[] {""} ;
      P00YS16_A1014DibInt = new int[1] ;
      P00YS16_A252CliCod = new int[1] ;
      P00YS16_A7675AMOrden = new byte[1] ;
      P00YS16_n7675AMOrden = new boolean[] {false} ;
      P00YS16_A7504AMCliCod = new int[1] ;
      P00YS16_A7503AMDibInt = new int[1] ;
      P00YS16_A7502AMDibCli = new String[] {""} ;
      A7502AMDibCli = "" ;
      W396EmprCod = "" ;
      AV28EmprCod = "" ;
      AV25AMDibCli = "" ;
      W7502AMDibCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdupdib__default(),
         new Object[] {
             new Object[] {
            P00YS4_A396EmprCod, P00YS4_A1013DibCli, P00YS4_A252CliCod, P00YS4_A1014DibInt, P00YS4_A2090DibMolCi2, P00YS4_n2090DibMolCi2, P00YS4_A1019DibMolCil, P00YS4_n1019DibMolCil, P00YS4_A1823DibTipMaq, P00YS4_n1823DibTipMaq,
            P00YS4_A1018DibMetRea, P00YS4_n1018DibMetRea, P00YS4_A1017DibFecEnt, P00YS4_n1017DibFecEnt, P00YS4_A1015DibFecUlt, P00YS4_n1015DibFecUlt, P00YS4_A13116DibSentido, P00YS4_n13116DibSentido, P00YS4_A10929DibAct, P00YS4_n10929DibAct,
            P00YS4_A10884DibUltUti, P00YS4_n10884DibUltUti, P00YS4_A8193DibSep, P00YS4_n8193DibSep, P00YS4_A8192DibGra, P00YS4_n8192DibGra, P00YS4_A7509DibFecBor, P00YS4_n7509DibFecBor, P00YS4_A7140DibBmp, P00YS4_n7140DibBmp,
            P00YS4_A6841DibDsc, P00YS4_n6841DibDsc, P00YS4_A4861DibCob, P00YS4_n4861DibCob, P00YS4_A4491DibPreOf16, P00YS4_n4491DibPreOf16, P00YS4_A4490DibPreOf15, P00YS4_n4490DibPreOf15, P00YS4_A4489DibPreOf14, P00YS4_n4489DibPreOf14,
            P00YS4_A4488DibPreOf13, P00YS4_n4488DibPreOf13, P00YS4_A4487DibPreOf12, P00YS4_n4487DibPreOf12, P00YS4_A4486DibPreOf11, P00YS4_n4486DibPreOf11, P00YS4_A4485DibPreAy16, P00YS4_n4485DibPreAy16, P00YS4_A4484DibPreAy15, P00YS4_n4484DibPreAy15,
            P00YS4_A4483DibPreAy14, P00YS4_n4483DibPreAy14, P00YS4_A4482DibPreAy13, P00YS4_n4482DibPreAy13, P00YS4_A4481DibPreAy12, P00YS4_n4481DibPreAy12, P00YS4_A4480DibPreAy11, P00YS4_n4480DibPreAy11, P00YS4_A1024DibUltLin, P00YS4_n1024DibUltLin,
            P00YS4_A1608DibRap, P00YS4_n1608DibRap, P00YS4_A1610DibPosRas, P00YS4_n1610DibPosRas, P00YS4_A1606DibTipRas, P00YS4_n1606DibTipRas, P00YS4_A1824DibUltCil, P00YS4_n1824DibUltCil, P00YS4_A1814DibTemQm10, P00YS4_n1814DibTemQm10,
            P00YS4_A1822DibTemQm9, P00YS4_n1822DibTemQm9, P00YS4_A1821DibTemQm8, P00YS4_n1821DibTemQm8, P00YS4_A1820DibTemQm7, P00YS4_n1820DibTemQm7, P00YS4_A1819DibTemQm6, P00YS4_n1819DibTemQm6, P00YS4_A1818DibTemQm5, P00YS4_n1818DibTemQm5,
            P00YS4_A1817DibTemQm4, P00YS4_n1817DibTemQm4, P00YS4_A1816DibTemQm3, P00YS4_n1816DibTemQm3, P00YS4_A1815DibTemQm2, P00YS4_n1815DibTemQm2, P00YS4_A1813DibTemQm1, P00YS4_n1813DibTemQm1, P00YS4_A1825DibVelMaq, P00YS4_n1825DibVelMaq,
            P00YS4_A1892DibPreOf10, P00YS4_n1892DibPreOf10, P00YS4_A1900DibPreOf9, P00YS4_n1900DibPreOf9, P00YS4_A1899DibPreOf8, P00YS4_n1899DibPreOf8, P00YS4_A1898DibPreOf7, P00YS4_n1898DibPreOf7, P00YS4_A1897DibPreOf6, P00YS4_n1897DibPreOf6,
            P00YS4_A1896DibPreOf5, P00YS4_n1896DibPreOf5, P00YS4_A1895DibPreOf4, P00YS4_n1895DibPreOf4, P00YS4_A1894DibPreOf3, P00YS4_n1894DibPreOf3, P00YS4_A1893DibPreOf2, P00YS4_n1893DibPreOf2, P00YS4_A1891DibPreOf1, P00YS4_n1891DibPreOf1,
            P00YS4_A1882DibPreAy10, P00YS4_n1882DibPreAy10, P00YS4_A1890DibPreAy9, P00YS4_n1890DibPreAy9, P00YS4_A1889DibPreAy8, P00YS4_n1889DibPreAy8, P00YS4_A1888DibPreAy7, P00YS4_n1888DibPreAy7, P00YS4_A1887DibPreAy6, P00YS4_n1887DibPreAy6,
            P00YS4_A1886DibPreAy5, P00YS4_n1886DibPreAy5, P00YS4_A1885DibPreAy4, P00YS4_n1885DibPreAy4, P00YS4_A1884DibPreAy3, P00YS4_n1884DibPreAy3, P00YS4_A1883DibPreAy2, P00YS4_n1883DibPreAy2, P00YS4_A1881DibPreAy1, P00YS4_n1881DibPreAy1,
            P00YS4_A1806DibLevMaq, P00YS4_n1806DibLevMaq, P00YS4_A1811DibPosVor, P00YS4_n1811DibPosVor, P00YS4_A1607DibMed, P00YS4_n1607DibMed, P00YS4_A2523DibObsUL, P00YS4_n2523DibObsUL, P00YS4_A3911TipMqnCod, P00YS4_n3911TipMqnCod,
            P00YS4_A1880DibGraNum, P00YS4_n1880DibGraNum, P00YS4_A1023DibMot, P00YS4_n1023DibMot, P00YS4_A1022DibImp, P00YS4_n1022DibImp, P00YS4_A1021DibCar, P00YS4_n1021DibCar, P00YS4_A1609DibObs2, P00YS4_n1609DibObs2,
            P00YS4_A1020DibObs, P00YS4_n1020DibObs, P00YS4_A1605DibLocal, P00YS4_n1605DibLocal, P00YS4_A1016DibFecPed, P00YS4_n1016DibFecPed, P00YS4_A1005GrabCod, P00YS4_n1005GrabCod, P00YS4_A1025DibNumLin, P00YS4_A2091DibNumLi2,
            P00YS4_n2091DibNumLi2, P00YS4_A4902DibCobTot
            }
            , new Object[] {
            }
            , new Object[] {
            P00YS6_A396EmprCod, P00YS6_A1013DibCli, P00YS6_A252CliCod, P00YS6_A1014DibInt, P00YS6_A1807DibLinCil, P00YS6_A10793DibCilUlt, P00YS6_n10793DibCilUlt, P00YS6_A10788DibCilMts, P00YS6_n10788DibCilMts, P00YS6_A10787DibCilStF,
            P00YS6_n10787DibCilStF, P00YS6_A10786DibCilSt, P00YS6_n10786DibCilSt, P00YS6_A10785DibCilMesh, P00YS6_n10785DibCilMesh, P00YS6_A10772DibPres, P00YS6_n10772DibPres, P00YS6_A10771DibDm, P00YS6_n10771DibDm, P00YS6_A10511DibOrgClid,
            P00YS6_n10511DibOrgClid, P00YS6_A10510DibOrgLi, P00YS6_n10510DibOrgLi, P00YS6_A10509DibOrgCl, P00YS6_n10509DibOrgCl, P00YS6_A10508DibOrgIn, P00YS6_n10508DibOrgIn, P00YS6_A8658DibIntSp, P00YS6_n8658DibIntSp, P00YS6_A8415DibActivo,
            P00YS6_n8415DibActivo, P00YS6_A7027DibLinMalC, P00YS6_n7027DibLinMalC, P00YS6_A7026DibCilCod, P00YS6_n7026DibCilCod, P00YS6_A4860DibPrcCob, P00YS6_n4860DibPrcCob, P00YS6_A1810DibPosCil, P00YS6_n1810DibPosCil, P00YS6_A1826TipCilCod,
            P00YS6_n1826TipCilCod, P00YS6_A1808DibOrdCil, P00YS6_n1808DibOrdCil, P00YS6_A1030DibRelMC, P00YS6_n1030DibRelMC, P00YS6_A2089DibLinMol, P00YS6_n2089DibLinMol
            }
            , new Object[] {
            }
            , new Object[] {
            P00YS8_A396EmprCod, P00YS8_A1013DibCli, P00YS8_A252CliCod, P00YS8_A1014DibInt, P00YS8_A1029DibLin, P00YS8_A7508DibOrgCliC, P00YS8_n7508DibOrgCliC, P00YS8_A7507DibOrgLin, P00YS8_n7507DibOrgLin, P00YS8_A7506DibOrgCli,
            P00YS8_n7506DibOrgCli, P00YS8_A7505DibOrgInt, P00YS8_n7505DibOrgInt, P00YS8_A6840DibLinMal, P00YS8_n6840DibLinMal, P00YS8_A6839DibMolCod, P00YS8_n6839DibMolCod, P00YS8_A5381DibPrcCobM, P00YS8_n5381DibPrcCobM, P00YS8_A1828TipGomCod,
            P00YS8_n1828TipGomCod, P00YS8_A1830TipPasCod, P00YS8_n1830TipPasCod, P00YS8_A1809DibOrdMol, P00YS8_n1809DibOrdMol, P00YS8_A2092DibRelMC2, P00YS8_n2092DibRelMC2, P00YS8_A2088DibDibMol, P00YS8_n2088DibDibMol
            }
            , new Object[] {
            }
            , new Object[] {
            P00YS10_A396EmprCod, P00YS10_A1013DibCli, P00YS10_A252CliCod, P00YS10_A1014DibInt, P00YS10_A1807DibLinCil, P00YS10_A7027DibLinMalC, P00YS10_n7027DibLinMalC, P00YS10_A1808DibOrdCil, P00YS10_n1808DibOrdCil, P00YS10_A4860DibPrcCob,
            P00YS10_n4860DibPrcCob, P00YS10_A1030DibRelMC, P00YS10_n1030DibRelMC, P00YS10_A1826TipCilCod, P00YS10_n1826TipCilCod, P00YS10_A1810DibPosCil, P00YS10_n1810DibPosCil, P00YS10_A2089DibLinMol, P00YS10_n2089DibLinMol, P00YS10_A7026DibCilCod,
            P00YS10_n7026DibCilCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00YS12_A396EmprCod, P00YS12_A1013DibCli, P00YS12_A252CliCod, P00YS12_A1014DibInt, P00YS12_A1029DibLin, P00YS12_A2088DibDibMol, P00YS12_n2088DibDibMol, P00YS12_A6840DibLinMal, P00YS12_n6840DibLinMal, P00YS12_A1809DibOrdMol,
            P00YS12_n1809DibOrdMol, P00YS12_A5381DibPrcCobM, P00YS12_n5381DibPrcCobM, P00YS12_A2092DibRelMC2, P00YS12_n2092DibRelMC2, P00YS12_A1830TipPasCod, P00YS12_n1830TipPasCod, P00YS12_A1828TipGomCod, P00YS12_n1828TipGomCod, P00YS12_A6839DibMolCod,
            P00YS12_n6839DibMolCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00YS14_A396EmprCod, P00YS14_A1013DibCli, P00YS14_A252CliCod, P00YS14_A1014DibInt, P00YS14_A2521DibObsLin, P00YS14_A2522DibObsTxt, P00YS14_n2522DibObsTxt
            }
            , new Object[] {
            }
            , new Object[] {
            P00YS16_A396EmprCod, P00YS16_A1013DibCli, P00YS16_A1014DibInt, P00YS16_A252CliCod, P00YS16_A7675AMOrden, P00YS16_n7675AMOrden, P00YS16_A7504AMCliCod, P00YS16_A7503AMDibInt, P00YS16_A7502AMDibCli
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV22Artextil ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A13116DibSentido ;
   private byte A2523DibObsUL ;
   private byte A3911TipMqnCod ;
   private byte A1021DibCar ;
   private byte A10786DibCilSt ;
   private byte A10771DibDm ;
   private byte A1810DibPosCil ;
   private byte A1826TipCilCod ;
   private byte A1808DibOrdCil ;
   private byte A2089DibLinMol ;
   private byte A1828TipGomCod ;
   private byte A1830TipPasCod ;
   private byte A1809DibOrdMol ;
   private byte A2088DibDibMol ;
   private byte A2521DibObsLin ;
   private byte AV19DibObsLin ;
   private byte W2521DibObsLin ;
   private byte A7675AMOrden ;
   private byte AV27AMOrden ;
   private byte W7675AMOrden ;
   private short A2090DibMolCi2 ;
   private short A1019DibMolCil ;
   private short A1024DibUltLin ;
   private short A1824DibUltCil ;
   private short A1814DibTemQm10 ;
   private short A1822DibTemQm9 ;
   private short A1821DibTemQm8 ;
   private short A1820DibTemQm7 ;
   private short A1819DibTemQm6 ;
   private short A1818DibTemQm5 ;
   private short A1817DibTemQm4 ;
   private short A1816DibTemQm3 ;
   private short A1815DibTemQm2 ;
   private short A1813DibTemQm1 ;
   private short A1825DibVelMaq ;
   private short A1005GrabCod ;
   private short A1025DibNumLin ;
   private short A2091DibNumLi2 ;
   private short AV29DibMolCil ;
   private short AV30DibMolCi2 ;
   private short W1019DibMolCil ;
   private short W2090DibMolCi2 ;
   private short Gx_err ;
   private short A1807DibLinCil ;
   private short A10785DibCilMesh ;
   private short A10510DibOrgLi ;
   private short AV18DibLinCil ;
   private short W1807DibLinCil ;
   private short A1029DibLin ;
   private short A7507DibOrgLin ;
   private short AV20DibLin ;
   private short W1029DibLin ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV16CliCod ;
   private int AV17DibInt ;
   private int W252CliCod ;
   private int W1014DibInt ;
   private int GX_INS545 ;
   private int A10793DibCilUlt ;
   private int A10511DibOrgClid ;
   private int A10508DibOrgIn ;
   private int A8658DibIntSp ;
   private int GX_INS549 ;
   private int A7508DibOrgCliC ;
   private int A7505DibOrgInt ;
   private int GX_INS550 ;
   private int GX_INS548 ;
   private int A7504AMCliCod ;
   private int A7503AMDibInt ;
   private int AV24AMCliCod ;
   private int AV26AMDibInt ;
   private int GX_INS1055 ;
   private int W7504AMCliCod ;
   private int W7503AMDibInt ;
   private java.math.BigDecimal A1018DibMetRea ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A4491DibPreOf16 ;
   private java.math.BigDecimal A4490DibPreOf15 ;
   private java.math.BigDecimal A4489DibPreOf14 ;
   private java.math.BigDecimal A4488DibPreOf13 ;
   private java.math.BigDecimal A4487DibPreOf12 ;
   private java.math.BigDecimal A4486DibPreOf11 ;
   private java.math.BigDecimal A4485DibPreAy16 ;
   private java.math.BigDecimal A4484DibPreAy15 ;
   private java.math.BigDecimal A4483DibPreAy14 ;
   private java.math.BigDecimal A4482DibPreAy13 ;
   private java.math.BigDecimal A4481DibPreAy12 ;
   private java.math.BigDecimal A4480DibPreAy11 ;
   private java.math.BigDecimal A1608DibRap ;
   private java.math.BigDecimal A1892DibPreOf10 ;
   private java.math.BigDecimal A1900DibPreOf9 ;
   private java.math.BigDecimal A1899DibPreOf8 ;
   private java.math.BigDecimal A1898DibPreOf7 ;
   private java.math.BigDecimal A1897DibPreOf6 ;
   private java.math.BigDecimal A1896DibPreOf5 ;
   private java.math.BigDecimal A1895DibPreOf4 ;
   private java.math.BigDecimal A1894DibPreOf3 ;
   private java.math.BigDecimal A1893DibPreOf2 ;
   private java.math.BigDecimal A1891DibPreOf1 ;
   private java.math.BigDecimal A1882DibPreAy10 ;
   private java.math.BigDecimal A1890DibPreAy9 ;
   private java.math.BigDecimal A1889DibPreAy8 ;
   private java.math.BigDecimal A1888DibPreAy7 ;
   private java.math.BigDecimal A1887DibPreAy6 ;
   private java.math.BigDecimal A1886DibPreAy5 ;
   private java.math.BigDecimal A1885DibPreAy4 ;
   private java.math.BigDecimal A1884DibPreAy3 ;
   private java.math.BigDecimal A1883DibPreAy2 ;
   private java.math.BigDecimal A1881DibPreAy1 ;
   private java.math.BigDecimal A1022DibImp ;
   private java.math.BigDecimal A4902DibCobTot ;
   private java.math.BigDecimal W1018DibMetRea ;
   private java.math.BigDecimal A10788DibCilMts ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private java.math.BigDecimal A5381DibPrcCobM ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String AV15DibCli ;
   private String scmdbuf ;
   private String A1823DibTipMaq ;
   private String A10929DibAct ;
   private String A8193DibSep ;
   private String A8192DibGra ;
   private String A7140DibBmp ;
   private String A6841DibDsc ;
   private String A1610DibPosRas ;
   private String A1606DibTipRas ;
   private String A1806DibLevMaq ;
   private String A1811DibPosVor ;
   private String A1607DibMed ;
   private String A1880DibGraNum ;
   private String A1023DibMot ;
   private String A1609DibObs2 ;
   private String A1020DibObs ;
   private String A1605DibLocal ;
   private String W1013DibCli ;
   private String AV23DibTipMaq ;
   private String Gx_msg ;
   private String W1823DibTipMaq ;
   private String Gx_emsg ;
   private String A10772DibPres ;
   private String A10509DibOrgCl ;
   private String A8415DibActivo ;
   private String A7027DibLinMalC ;
   private String A7026DibCilCod ;
   private String A1030DibRelMC ;
   private String A7506DibOrgCli ;
   private String A6840DibLinMal ;
   private String A6839DibMolCod ;
   private String A2092DibRelMC2 ;
   private String A2522DibObsTxt ;
   private String A7502AMDibCli ;
   private String W396EmprCod ;
   private String AV28EmprCod ;
   private String AV25AMDibCli ;
   private String W7502AMDibCli ;
   private java.util.Date A1017DibFecEnt ;
   private java.util.Date A1015DibFecUlt ;
   private java.util.Date A10884DibUltUti ;
   private java.util.Date A7509DibFecBor ;
   private java.util.Date A1016DibFecPed ;
   private java.util.Date W1017DibFecEnt ;
   private java.util.Date W1015DibFecUlt ;
   private java.util.Date Gx_date ;
   private java.util.Date A10787DibCilStF ;
   private boolean n2090DibMolCi2 ;
   private boolean n1019DibMolCil ;
   private boolean n1823DibTipMaq ;
   private boolean n1018DibMetRea ;
   private boolean n1017DibFecEnt ;
   private boolean n1015DibFecUlt ;
   private boolean n13116DibSentido ;
   private boolean n10929DibAct ;
   private boolean n10884DibUltUti ;
   private boolean n8193DibSep ;
   private boolean n8192DibGra ;
   private boolean n7509DibFecBor ;
   private boolean n7140DibBmp ;
   private boolean n6841DibDsc ;
   private boolean n4861DibCob ;
   private boolean n4491DibPreOf16 ;
   private boolean n4490DibPreOf15 ;
   private boolean n4489DibPreOf14 ;
   private boolean n4488DibPreOf13 ;
   private boolean n4487DibPreOf12 ;
   private boolean n4486DibPreOf11 ;
   private boolean n4485DibPreAy16 ;
   private boolean n4484DibPreAy15 ;
   private boolean n4483DibPreAy14 ;
   private boolean n4482DibPreAy13 ;
   private boolean n4481DibPreAy12 ;
   private boolean n4480DibPreAy11 ;
   private boolean n1024DibUltLin ;
   private boolean n1608DibRap ;
   private boolean n1610DibPosRas ;
   private boolean n1606DibTipRas ;
   private boolean n1824DibUltCil ;
   private boolean n1814DibTemQm10 ;
   private boolean n1822DibTemQm9 ;
   private boolean n1821DibTemQm8 ;
   private boolean n1820DibTemQm7 ;
   private boolean n1819DibTemQm6 ;
   private boolean n1818DibTemQm5 ;
   private boolean n1817DibTemQm4 ;
   private boolean n1816DibTemQm3 ;
   private boolean n1815DibTemQm2 ;
   private boolean n1813DibTemQm1 ;
   private boolean n1825DibVelMaq ;
   private boolean n1892DibPreOf10 ;
   private boolean n1900DibPreOf9 ;
   private boolean n1899DibPreOf8 ;
   private boolean n1898DibPreOf7 ;
   private boolean n1897DibPreOf6 ;
   private boolean n1896DibPreOf5 ;
   private boolean n1895DibPreOf4 ;
   private boolean n1894DibPreOf3 ;
   private boolean n1893DibPreOf2 ;
   private boolean n1891DibPreOf1 ;
   private boolean n1882DibPreAy10 ;
   private boolean n1890DibPreAy9 ;
   private boolean n1889DibPreAy8 ;
   private boolean n1888DibPreAy7 ;
   private boolean n1887DibPreAy6 ;
   private boolean n1886DibPreAy5 ;
   private boolean n1885DibPreAy4 ;
   private boolean n1884DibPreAy3 ;
   private boolean n1883DibPreAy2 ;
   private boolean n1881DibPreAy1 ;
   private boolean n1806DibLevMaq ;
   private boolean n1811DibPosVor ;
   private boolean n1607DibMed ;
   private boolean n2523DibObsUL ;
   private boolean n3911TipMqnCod ;
   private boolean n1880DibGraNum ;
   private boolean n1023DibMot ;
   private boolean n1022DibImp ;
   private boolean n1021DibCar ;
   private boolean n1609DibObs2 ;
   private boolean n1020DibObs ;
   private boolean n1605DibLocal ;
   private boolean n1016DibFecPed ;
   private boolean n1005GrabCod ;
   private boolean n2091DibNumLi2 ;
   private boolean n10793DibCilUlt ;
   private boolean n10788DibCilMts ;
   private boolean n10787DibCilStF ;
   private boolean n10786DibCilSt ;
   private boolean n10785DibCilMesh ;
   private boolean n10772DibPres ;
   private boolean n10771DibDm ;
   private boolean n10511DibOrgClid ;
   private boolean n10510DibOrgLi ;
   private boolean n10509DibOrgCl ;
   private boolean n10508DibOrgIn ;
   private boolean n8658DibIntSp ;
   private boolean n8415DibActivo ;
   private boolean n7027DibLinMalC ;
   private boolean n7026DibCilCod ;
   private boolean n4860DibPrcCob ;
   private boolean n1810DibPosCil ;
   private boolean n1826TipCilCod ;
   private boolean n1808DibOrdCil ;
   private boolean n1030DibRelMC ;
   private boolean n2089DibLinMol ;
   private boolean n7508DibOrgCliC ;
   private boolean n7507DibOrgLin ;
   private boolean n7506DibOrgCli ;
   private boolean n7505DibOrgInt ;
   private boolean n6840DibLinMal ;
   private boolean n6839DibMolCod ;
   private boolean n5381DibPrcCobM ;
   private boolean n1828TipGomCod ;
   private boolean n1830TipPasCod ;
   private boolean n1809DibOrdMol ;
   private boolean n2092DibRelMC2 ;
   private boolean n2088DibDibMol ;
   private boolean n2522DibObsTxt ;
   private boolean n7675AMOrden ;
   private int[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YS4_A396EmprCod ;
   private String[] P00YS4_A1013DibCli ;
   private int[] P00YS4_A252CliCod ;
   private int[] P00YS4_A1014DibInt ;
   private short[] P00YS4_A2090DibMolCi2 ;
   private boolean[] P00YS4_n2090DibMolCi2 ;
   private short[] P00YS4_A1019DibMolCil ;
   private boolean[] P00YS4_n1019DibMolCil ;
   private String[] P00YS4_A1823DibTipMaq ;
   private boolean[] P00YS4_n1823DibTipMaq ;
   private java.math.BigDecimal[] P00YS4_A1018DibMetRea ;
   private boolean[] P00YS4_n1018DibMetRea ;
   private java.util.Date[] P00YS4_A1017DibFecEnt ;
   private boolean[] P00YS4_n1017DibFecEnt ;
   private java.util.Date[] P00YS4_A1015DibFecUlt ;
   private boolean[] P00YS4_n1015DibFecUlt ;
   private byte[] P00YS4_A13116DibSentido ;
   private boolean[] P00YS4_n13116DibSentido ;
   private String[] P00YS4_A10929DibAct ;
   private boolean[] P00YS4_n10929DibAct ;
   private java.util.Date[] P00YS4_A10884DibUltUti ;
   private boolean[] P00YS4_n10884DibUltUti ;
   private String[] P00YS4_A8193DibSep ;
   private boolean[] P00YS4_n8193DibSep ;
   private String[] P00YS4_A8192DibGra ;
   private boolean[] P00YS4_n8192DibGra ;
   private java.util.Date[] P00YS4_A7509DibFecBor ;
   private boolean[] P00YS4_n7509DibFecBor ;
   private String[] P00YS4_A7140DibBmp ;
   private boolean[] P00YS4_n7140DibBmp ;
   private String[] P00YS4_A6841DibDsc ;
   private boolean[] P00YS4_n6841DibDsc ;
   private java.math.BigDecimal[] P00YS4_A4861DibCob ;
   private boolean[] P00YS4_n4861DibCob ;
   private java.math.BigDecimal[] P00YS4_A4491DibPreOf16 ;
   private boolean[] P00YS4_n4491DibPreOf16 ;
   private java.math.BigDecimal[] P00YS4_A4490DibPreOf15 ;
   private boolean[] P00YS4_n4490DibPreOf15 ;
   private java.math.BigDecimal[] P00YS4_A4489DibPreOf14 ;
   private boolean[] P00YS4_n4489DibPreOf14 ;
   private java.math.BigDecimal[] P00YS4_A4488DibPreOf13 ;
   private boolean[] P00YS4_n4488DibPreOf13 ;
   private java.math.BigDecimal[] P00YS4_A4487DibPreOf12 ;
   private boolean[] P00YS4_n4487DibPreOf12 ;
   private java.math.BigDecimal[] P00YS4_A4486DibPreOf11 ;
   private boolean[] P00YS4_n4486DibPreOf11 ;
   private java.math.BigDecimal[] P00YS4_A4485DibPreAy16 ;
   private boolean[] P00YS4_n4485DibPreAy16 ;
   private java.math.BigDecimal[] P00YS4_A4484DibPreAy15 ;
   private boolean[] P00YS4_n4484DibPreAy15 ;
   private java.math.BigDecimal[] P00YS4_A4483DibPreAy14 ;
   private boolean[] P00YS4_n4483DibPreAy14 ;
   private java.math.BigDecimal[] P00YS4_A4482DibPreAy13 ;
   private boolean[] P00YS4_n4482DibPreAy13 ;
   private java.math.BigDecimal[] P00YS4_A4481DibPreAy12 ;
   private boolean[] P00YS4_n4481DibPreAy12 ;
   private java.math.BigDecimal[] P00YS4_A4480DibPreAy11 ;
   private boolean[] P00YS4_n4480DibPreAy11 ;
   private short[] P00YS4_A1024DibUltLin ;
   private boolean[] P00YS4_n1024DibUltLin ;
   private java.math.BigDecimal[] P00YS4_A1608DibRap ;
   private boolean[] P00YS4_n1608DibRap ;
   private String[] P00YS4_A1610DibPosRas ;
   private boolean[] P00YS4_n1610DibPosRas ;
   private String[] P00YS4_A1606DibTipRas ;
   private boolean[] P00YS4_n1606DibTipRas ;
   private short[] P00YS4_A1824DibUltCil ;
   private boolean[] P00YS4_n1824DibUltCil ;
   private short[] P00YS4_A1814DibTemQm10 ;
   private boolean[] P00YS4_n1814DibTemQm10 ;
   private short[] P00YS4_A1822DibTemQm9 ;
   private boolean[] P00YS4_n1822DibTemQm9 ;
   private short[] P00YS4_A1821DibTemQm8 ;
   private boolean[] P00YS4_n1821DibTemQm8 ;
   private short[] P00YS4_A1820DibTemQm7 ;
   private boolean[] P00YS4_n1820DibTemQm7 ;
   private short[] P00YS4_A1819DibTemQm6 ;
   private boolean[] P00YS4_n1819DibTemQm6 ;
   private short[] P00YS4_A1818DibTemQm5 ;
   private boolean[] P00YS4_n1818DibTemQm5 ;
   private short[] P00YS4_A1817DibTemQm4 ;
   private boolean[] P00YS4_n1817DibTemQm4 ;
   private short[] P00YS4_A1816DibTemQm3 ;
   private boolean[] P00YS4_n1816DibTemQm3 ;
   private short[] P00YS4_A1815DibTemQm2 ;
   private boolean[] P00YS4_n1815DibTemQm2 ;
   private short[] P00YS4_A1813DibTemQm1 ;
   private boolean[] P00YS4_n1813DibTemQm1 ;
   private short[] P00YS4_A1825DibVelMaq ;
   private boolean[] P00YS4_n1825DibVelMaq ;
   private java.math.BigDecimal[] P00YS4_A1892DibPreOf10 ;
   private boolean[] P00YS4_n1892DibPreOf10 ;
   private java.math.BigDecimal[] P00YS4_A1900DibPreOf9 ;
   private boolean[] P00YS4_n1900DibPreOf9 ;
   private java.math.BigDecimal[] P00YS4_A1899DibPreOf8 ;
   private boolean[] P00YS4_n1899DibPreOf8 ;
   private java.math.BigDecimal[] P00YS4_A1898DibPreOf7 ;
   private boolean[] P00YS4_n1898DibPreOf7 ;
   private java.math.BigDecimal[] P00YS4_A1897DibPreOf6 ;
   private boolean[] P00YS4_n1897DibPreOf6 ;
   private java.math.BigDecimal[] P00YS4_A1896DibPreOf5 ;
   private boolean[] P00YS4_n1896DibPreOf5 ;
   private java.math.BigDecimal[] P00YS4_A1895DibPreOf4 ;
   private boolean[] P00YS4_n1895DibPreOf4 ;
   private java.math.BigDecimal[] P00YS4_A1894DibPreOf3 ;
   private boolean[] P00YS4_n1894DibPreOf3 ;
   private java.math.BigDecimal[] P00YS4_A1893DibPreOf2 ;
   private boolean[] P00YS4_n1893DibPreOf2 ;
   private java.math.BigDecimal[] P00YS4_A1891DibPreOf1 ;
   private boolean[] P00YS4_n1891DibPreOf1 ;
   private java.math.BigDecimal[] P00YS4_A1882DibPreAy10 ;
   private boolean[] P00YS4_n1882DibPreAy10 ;
   private java.math.BigDecimal[] P00YS4_A1890DibPreAy9 ;
   private boolean[] P00YS4_n1890DibPreAy9 ;
   private java.math.BigDecimal[] P00YS4_A1889DibPreAy8 ;
   private boolean[] P00YS4_n1889DibPreAy8 ;
   private java.math.BigDecimal[] P00YS4_A1888DibPreAy7 ;
   private boolean[] P00YS4_n1888DibPreAy7 ;
   private java.math.BigDecimal[] P00YS4_A1887DibPreAy6 ;
   private boolean[] P00YS4_n1887DibPreAy6 ;
   private java.math.BigDecimal[] P00YS4_A1886DibPreAy5 ;
   private boolean[] P00YS4_n1886DibPreAy5 ;
   private java.math.BigDecimal[] P00YS4_A1885DibPreAy4 ;
   private boolean[] P00YS4_n1885DibPreAy4 ;
   private java.math.BigDecimal[] P00YS4_A1884DibPreAy3 ;
   private boolean[] P00YS4_n1884DibPreAy3 ;
   private java.math.BigDecimal[] P00YS4_A1883DibPreAy2 ;
   private boolean[] P00YS4_n1883DibPreAy2 ;
   private java.math.BigDecimal[] P00YS4_A1881DibPreAy1 ;
   private boolean[] P00YS4_n1881DibPreAy1 ;
   private String[] P00YS4_A1806DibLevMaq ;
   private boolean[] P00YS4_n1806DibLevMaq ;
   private String[] P00YS4_A1811DibPosVor ;
   private boolean[] P00YS4_n1811DibPosVor ;
   private String[] P00YS4_A1607DibMed ;
   private boolean[] P00YS4_n1607DibMed ;
   private byte[] P00YS4_A2523DibObsUL ;
   private boolean[] P00YS4_n2523DibObsUL ;
   private byte[] P00YS4_A3911TipMqnCod ;
   private boolean[] P00YS4_n3911TipMqnCod ;
   private String[] P00YS4_A1880DibGraNum ;
   private boolean[] P00YS4_n1880DibGraNum ;
   private String[] P00YS4_A1023DibMot ;
   private boolean[] P00YS4_n1023DibMot ;
   private java.math.BigDecimal[] P00YS4_A1022DibImp ;
   private boolean[] P00YS4_n1022DibImp ;
   private byte[] P00YS4_A1021DibCar ;
   private boolean[] P00YS4_n1021DibCar ;
   private String[] P00YS4_A1609DibObs2 ;
   private boolean[] P00YS4_n1609DibObs2 ;
   private String[] P00YS4_A1020DibObs ;
   private boolean[] P00YS4_n1020DibObs ;
   private String[] P00YS4_A1605DibLocal ;
   private boolean[] P00YS4_n1605DibLocal ;
   private java.util.Date[] P00YS4_A1016DibFecPed ;
   private boolean[] P00YS4_n1016DibFecPed ;
   private short[] P00YS4_A1005GrabCod ;
   private boolean[] P00YS4_n1005GrabCod ;
   private short[] P00YS4_A1025DibNumLin ;
   private short[] P00YS4_A2091DibNumLi2 ;
   private boolean[] P00YS4_n2091DibNumLi2 ;
   private java.math.BigDecimal[] P00YS4_A4902DibCobTot ;
   private String[] P00YS6_A396EmprCod ;
   private String[] P00YS6_A1013DibCli ;
   private int[] P00YS6_A252CliCod ;
   private int[] P00YS6_A1014DibInt ;
   private short[] P00YS6_A1807DibLinCil ;
   private int[] P00YS6_A10793DibCilUlt ;
   private boolean[] P00YS6_n10793DibCilUlt ;
   private java.math.BigDecimal[] P00YS6_A10788DibCilMts ;
   private boolean[] P00YS6_n10788DibCilMts ;
   private java.util.Date[] P00YS6_A10787DibCilStF ;
   private boolean[] P00YS6_n10787DibCilStF ;
   private byte[] P00YS6_A10786DibCilSt ;
   private boolean[] P00YS6_n10786DibCilSt ;
   private short[] P00YS6_A10785DibCilMesh ;
   private boolean[] P00YS6_n10785DibCilMesh ;
   private String[] P00YS6_A10772DibPres ;
   private boolean[] P00YS6_n10772DibPres ;
   private byte[] P00YS6_A10771DibDm ;
   private boolean[] P00YS6_n10771DibDm ;
   private int[] P00YS6_A10511DibOrgClid ;
   private boolean[] P00YS6_n10511DibOrgClid ;
   private short[] P00YS6_A10510DibOrgLi ;
   private boolean[] P00YS6_n10510DibOrgLi ;
   private String[] P00YS6_A10509DibOrgCl ;
   private boolean[] P00YS6_n10509DibOrgCl ;
   private int[] P00YS6_A10508DibOrgIn ;
   private boolean[] P00YS6_n10508DibOrgIn ;
   private int[] P00YS6_A8658DibIntSp ;
   private boolean[] P00YS6_n8658DibIntSp ;
   private String[] P00YS6_A8415DibActivo ;
   private boolean[] P00YS6_n8415DibActivo ;
   private String[] P00YS6_A7027DibLinMalC ;
   private boolean[] P00YS6_n7027DibLinMalC ;
   private String[] P00YS6_A7026DibCilCod ;
   private boolean[] P00YS6_n7026DibCilCod ;
   private java.math.BigDecimal[] P00YS6_A4860DibPrcCob ;
   private boolean[] P00YS6_n4860DibPrcCob ;
   private byte[] P00YS6_A1810DibPosCil ;
   private boolean[] P00YS6_n1810DibPosCil ;
   private byte[] P00YS6_A1826TipCilCod ;
   private boolean[] P00YS6_n1826TipCilCod ;
   private byte[] P00YS6_A1808DibOrdCil ;
   private boolean[] P00YS6_n1808DibOrdCil ;
   private String[] P00YS6_A1030DibRelMC ;
   private boolean[] P00YS6_n1030DibRelMC ;
   private byte[] P00YS6_A2089DibLinMol ;
   private boolean[] P00YS6_n2089DibLinMol ;
   private String[] P00YS8_A396EmprCod ;
   private String[] P00YS8_A1013DibCli ;
   private int[] P00YS8_A252CliCod ;
   private int[] P00YS8_A1014DibInt ;
   private short[] P00YS8_A1029DibLin ;
   private int[] P00YS8_A7508DibOrgCliC ;
   private boolean[] P00YS8_n7508DibOrgCliC ;
   private short[] P00YS8_A7507DibOrgLin ;
   private boolean[] P00YS8_n7507DibOrgLin ;
   private String[] P00YS8_A7506DibOrgCli ;
   private boolean[] P00YS8_n7506DibOrgCli ;
   private int[] P00YS8_A7505DibOrgInt ;
   private boolean[] P00YS8_n7505DibOrgInt ;
   private String[] P00YS8_A6840DibLinMal ;
   private boolean[] P00YS8_n6840DibLinMal ;
   private String[] P00YS8_A6839DibMolCod ;
   private boolean[] P00YS8_n6839DibMolCod ;
   private java.math.BigDecimal[] P00YS8_A5381DibPrcCobM ;
   private boolean[] P00YS8_n5381DibPrcCobM ;
   private byte[] P00YS8_A1828TipGomCod ;
   private boolean[] P00YS8_n1828TipGomCod ;
   private byte[] P00YS8_A1830TipPasCod ;
   private boolean[] P00YS8_n1830TipPasCod ;
   private byte[] P00YS8_A1809DibOrdMol ;
   private boolean[] P00YS8_n1809DibOrdMol ;
   private String[] P00YS8_A2092DibRelMC2 ;
   private boolean[] P00YS8_n2092DibRelMC2 ;
   private byte[] P00YS8_A2088DibDibMol ;
   private boolean[] P00YS8_n2088DibDibMol ;
   private String[] P00YS10_A396EmprCod ;
   private String[] P00YS10_A1013DibCli ;
   private int[] P00YS10_A252CliCod ;
   private int[] P00YS10_A1014DibInt ;
   private short[] P00YS10_A1807DibLinCil ;
   private String[] P00YS10_A7027DibLinMalC ;
   private boolean[] P00YS10_n7027DibLinMalC ;
   private byte[] P00YS10_A1808DibOrdCil ;
   private boolean[] P00YS10_n1808DibOrdCil ;
   private java.math.BigDecimal[] P00YS10_A4860DibPrcCob ;
   private boolean[] P00YS10_n4860DibPrcCob ;
   private String[] P00YS10_A1030DibRelMC ;
   private boolean[] P00YS10_n1030DibRelMC ;
   private byte[] P00YS10_A1826TipCilCod ;
   private boolean[] P00YS10_n1826TipCilCod ;
   private byte[] P00YS10_A1810DibPosCil ;
   private boolean[] P00YS10_n1810DibPosCil ;
   private byte[] P00YS10_A2089DibLinMol ;
   private boolean[] P00YS10_n2089DibLinMol ;
   private String[] P00YS10_A7026DibCilCod ;
   private boolean[] P00YS10_n7026DibCilCod ;
   private String[] P00YS12_A396EmprCod ;
   private String[] P00YS12_A1013DibCli ;
   private int[] P00YS12_A252CliCod ;
   private int[] P00YS12_A1014DibInt ;
   private short[] P00YS12_A1029DibLin ;
   private byte[] P00YS12_A2088DibDibMol ;
   private boolean[] P00YS12_n2088DibDibMol ;
   private String[] P00YS12_A6840DibLinMal ;
   private boolean[] P00YS12_n6840DibLinMal ;
   private byte[] P00YS12_A1809DibOrdMol ;
   private boolean[] P00YS12_n1809DibOrdMol ;
   private java.math.BigDecimal[] P00YS12_A5381DibPrcCobM ;
   private boolean[] P00YS12_n5381DibPrcCobM ;
   private String[] P00YS12_A2092DibRelMC2 ;
   private boolean[] P00YS12_n2092DibRelMC2 ;
   private byte[] P00YS12_A1830TipPasCod ;
   private boolean[] P00YS12_n1830TipPasCod ;
   private byte[] P00YS12_A1828TipGomCod ;
   private boolean[] P00YS12_n1828TipGomCod ;
   private String[] P00YS12_A6839DibMolCod ;
   private boolean[] P00YS12_n6839DibMolCod ;
   private String[] P00YS14_A396EmprCod ;
   private String[] P00YS14_A1013DibCli ;
   private int[] P00YS14_A252CliCod ;
   private int[] P00YS14_A1014DibInt ;
   private byte[] P00YS14_A2521DibObsLin ;
   private String[] P00YS14_A2522DibObsTxt ;
   private boolean[] P00YS14_n2522DibObsTxt ;
   private String[] P00YS16_A396EmprCod ;
   private String[] P00YS16_A1013DibCli ;
   private int[] P00YS16_A1014DibInt ;
   private int[] P00YS16_A252CliCod ;
   private byte[] P00YS16_A7675AMOrden ;
   private boolean[] P00YS16_n7675AMOrden ;
   private int[] P00YS16_A7504AMCliCod ;
   private int[] P00YS16_A7503AMDibInt ;
   private String[] P00YS16_A7502AMDibCli ;
}

final  class pdupdib__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YS4", "SELECT T1.EmprCod, T1.DibCli, T1.CliCod, T1.DibInt, T1.DibMolCi2, T1.DibMolCil, T1.DibTipMaq, T1.DibMetRea, T1.DibFecEnt, T1.DibFecUlt, T1.DibSentido, T1.DibAct, T1.DibUltUti, T1.DibSep, T1.DibGra, T1.DibFecBor, T1.DibBmp, T1.DibDsc, T1.DibCob, T1.DibPreOf16, T1.DibPreOf15, T1.DibPreOf14, T1.DibPreOf13, T1.DibPreOf12, T1.DibPreOf11, T1.DibPreAy16, T1.DibPreAy15, T1.DibPreAy14, T1.DibPreAy13, T1.DibPreAy12, T1.DibPreAy11, T1.DibUltLin, T1.DibRap, T1.DibPosRas, T1.DibTipRas, T1.DibUltCil, T1.DibTemQm10, T1.DibTemQm9, T1.DibTemQm8, T1.DibTemQm7, T1.DibTemQm6, T1.DibTemQm5, T1.DibTemQm4, T1.DibTemQm3, T1.DibTemQm2, T1.DibTemQm1, T1.DibVelMaq, T1.DibPreOf10, T1.DibPreOf9, T1.DibPreOf8, T1.DibPreOf7, T1.DibPreOf6, T1.DibPreOf5, T1.DibPreOf4, T1.DibPreOf3, T1.DibPreOf2, T1.DibPreOf1, T1.DibPreAy10, T1.DibPreAy9, T1.DibPreAy8, T1.DibPreAy7, T1.DibPreAy6, T1.DibPreAy5, T1.DibPreAy4, T1.DibPreAy3, T1.DibPreAy2, T1.DibPreAy1, T1.DibLevMaq, T1.DibPosVor, T1.DibMed, T1.DibObsUL, T1.TipMqnCod, T1.DibGraNum, T1.DibMot, T1.DibImp, T1.DibCar, T1.DibObs2, T1.DibObs, T1.DibLocal, T1.DibFecPed, T1.GrabCod, COALESCE( T2.DibNumLin, 0) AS DibNumLin, COALESCE( T3.DibNumLi2, 0) AS DibNumLi2, COALESCE( T2.DibCobTot, 0) AS DibCobTot FROM ((TXPCDIBUJ T1 LEFT JOIN (SELECT COUNT(*) AS DibNumLin, EmprCod, DibCli, CliCod, DibInt, SUM(DibPrcCob) AS DibCobTot FROM TXPLDIBUC GROUP BY EmprCod, DibCli, CliCod, DibInt ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DibCli = T1.DibCli AND T2.CliCod = T1.CliCod AND T2.DibInt = T1.DibInt) LEFT JOIN (SELECT COUNT(*) AS DibNumLi2, EmprCod, DibCli, CliCod, DibInt FROM TXPLDIBUJ GROUP BY EmprCod, DibCli, CliCod, DibInt ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DibCli = T1.DibCli AND T3.CliCod = T1.CliCod AND T3.DibInt = T1.DibInt) WHERE T1.EmprCod = ? and T1.DibCli = ? and T1.CliCod = ? and T1.DibInt = ? ORDER BY T1.EmprCod, T1.DibCli, T1.CliCod, T1.DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00YS5", "INSERT INTO TXPCDIBUJ(EmprCod, DibCli, CliCod, DibInt, GrabCod, DibFecUlt, DibFecPed, DibFecEnt, DibMetRea, DibLocal, DibObs, DibObs2, DibCar, DibImp, DibMot, DibTipMaq, DibGraNum, TipMqnCod, DibObsUL, DibMolCil, DibMed, DibPosVor, DibLevMaq, DibPreAy1, DibPreAy2, DibPreAy3, DibPreAy4, DibPreAy5, DibPreAy6, DibPreAy7, DibPreAy8, DibPreAy9, DibPreAy10, DibPreOf1, DibPreOf2, DibPreOf3, DibPreOf4, DibPreOf5, DibPreOf6, DibPreOf7, DibPreOf8, DibPreOf9, DibPreOf10, DibVelMaq, DibTemQm1, DibTemQm2, DibTemQm3, DibTemQm4, DibTemQm5, DibTemQm6, DibTemQm7, DibTemQm8, DibTemQm9, DibTemQm10, DibUltCil, DibMolCi2, DibTipRas, DibPosRas, DibRap, DibUltLin, DibPreAy11, DibPreAy12, DibPreAy13, DibPreAy14, DibPreAy15, DibPreAy16, DibPreOf11, DibPreOf12, DibPreOf13, DibPreOf14, DibPreOf15, DibPreOf16, DibCob, DibDsc, DibBmp, DibFecBor, DibGra, DibSep, DibUltUti, DibAct, DibSentido) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
         ,new ForEachCursor("P00YS6", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibCilUlt, DibCilMts, DibCilStF, DibCilSt, DibCilMesh, DibPres, DibDm, DibOrgClid, DibOrgLi, DibOrgCl, DibOrgIn, DibIntSp, DibActivo, DibLinMalC, DibCilCod, DibPrcCob, DibPosCil, TipCilCod, DibOrdCil, DibRelMC, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YS7", "INSERT INTO TXPLDIBUC(EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibLinMol, DibRelMC, DibOrdCil, TipCilCod, DibPosCil, DibPrcCob, DibCilCod, DibLinMalC, DibActivo, DibIntSp, DibOrgIn, DibOrgCl, DibOrgLi, DibOrgClid, DibDm, DibPres, DibCilMesh, DibCilSt, DibCilStF, DibCilMts, DibCilUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
         ,new ForEachCursor("P00YS8", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibOrgCliC, DibOrgLin, DibOrgCli, DibOrgInt, DibLinMal, DibMolCod, DibPrcCobM, TipGomCod, TipPasCod, DibOrdMol, DibRelMC2, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YS9", "INSERT INTO TXPLDIBUJ(EmprCod, DibCli, CliCod, DibInt, DibLin, DibDibMol, DibRelMC2, DibOrdMol, TipPasCod, TipGomCod, DibPrcCobM, DibMolCod, DibLinMal, DibOrgInt, DibOrgCli, DibOrgLin, DibOrgCliC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUJ")
         ,new ForEachCursor("P00YS10", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibLinMalC, DibOrdCil, DibPrcCob, DibRelMC, TipCilCod, DibPosCil, DibLinMol, DibCilCod FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YS11", "INSERT INTO TXPLDIBUJ(EmprCod, DibCli, CliCod, DibInt, DibLin, DibDibMol, DibRelMC2, DibOrdMol, TipPasCod, TipGomCod, DibPrcCobM, DibLinMal, DibMolCod, DibOrgInt, DibOrgCli, DibOrgLin, DibOrgCliC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUJ")
         ,new ForEachCursor("P00YS12", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibDibMol, DibLinMal, DibOrdMol, DibPrcCobM, DibRelMC2, TipPasCod, TipGomCod, DibMolCod FROM TXPLDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YS13", "INSERT INTO TXPLDIBUC(EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibRelMC, DibOrdCil, TipCilCod, DibPrcCob, DibLinMalC, DibLinMol, DibPosCil, DibCilCod, DibActivo, DibIntSp, DibOrgIn, DibOrgCl, DibOrgLi, DibOrgClid, DibDm, DibPres, DibCilMesh, DibCilSt, DibCilStF, DibCilMts, DibCilUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
         ,new ForEachCursor("P00YS14", "SELECT EmprCod, DibCli, CliCod, DibInt, DibObsLin, DibObsTxt FROM TXPDIBOBS WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YS15", "INSERT INTO TXPDIBOBS(EmprCod, DibCli, CliCod, DibInt, DibObsLin, DibObsTxt) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDIBOBS")
         ,new ForEachCursor("P00YS16", "SELECT EmprCod, DibCli, DibInt, CliCod, AMOrden, AMCliCod, AMDibInt, AMDibCli FROM TXPARTMZA WHERE EmprCod = ? and DibCli = ? and DibInt = ? and CliCod = ? ORDER BY EmprCod, DibCli, DibInt, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YS17", "INSERT INTO TXPARTMZA(EmprCod, DibCli, DibInt, CliCod, AMDibCli, AMDibInt, AMCliCod, AMOrden) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTMZA")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 128);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(21,2);
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
               ((short[]) buf[58])[0] = rslt.getShort(32);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 15);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 15);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(37);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(38);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(39);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((short[]) buf[76])[0] = rslt.getShort(41);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((short[]) buf[80])[0] = rslt.getShort(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((short[]) buf[84])[0] = rslt.getShort(45);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((short[]) buf[86])[0] = rslt.getShort(46);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
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
               ((java.math.BigDecimal[]) buf[124])[0] = rslt.getBigDecimal(65,2);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[126])[0] = rslt.getBigDecimal(66,2);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[128])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getString(68, 8);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(69, 3);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(70, 10);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((byte[]) buf[136])[0] = rslt.getByte(71);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((byte[]) buf[138])[0] = rslt.getByte(72);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getString(73, 10);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((String[]) buf[142])[0] = rslt.getString(74, 2);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[144])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((byte[]) buf[146])[0] = rslt.getByte(76);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(77, 40);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(78, 40);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(79, 15);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[154])[0] = rslt.getGXDate(80);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((short[]) buf[156])[0] = rslt.getShort(81);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((short[]) buf[158])[0] = rslt.getShort(82);
               ((short[]) buf[159])[0] = rslt.getShort(83);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[161])[0] = rslt.getBigDecimal(84,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 5);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 15);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[37], 10);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 3);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 8);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[87]).shortValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[93]).shortValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(50, ((Number) parms[95]).shortValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[97]).shortValue());
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(52, ((Number) parms[99]).shortValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[101]).shortValue());
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(54, ((Number) parms[103]).shortValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[105]).shortValue());
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[107]).shortValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[109], 15);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[111], 15);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(59, (java.math.BigDecimal)parms[113], 2);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(60, ((Number) parms[115]).shortValue());
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(61, (java.math.BigDecimal)parms[117], 2);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(62, (java.math.BigDecimal)parms[119], 2);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(63, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(64, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(66, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(67, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(68, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(69, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(70, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(71, (java.math.BigDecimal)parms[137], 2);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(72, (java.math.BigDecimal)parms[139], 2);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(73, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[143], 30);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[145], 128);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.DATE );
               }
               else
               {
                  stmt.setDate(76, (java.util.Date)parms[147]);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[149], 1);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[151], 1);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.DATE );
               }
               else
               {
                  stmt.setDate(79, (java.util.Date)parms[153]);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[155], 1);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(81, ((Number) parms[157]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
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
                  stmt.setString(12, (String)parms[18], 10);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 20);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 10);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 60);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[8]).byteValue());
               }
               return;
      }
   }

}

