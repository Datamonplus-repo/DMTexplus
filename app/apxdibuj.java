package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apxdibuj extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apxdibuj pgm = new apxdibuj (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apxdibuj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apxdibuj.class ), "" );
   }

   public apxdibuj( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      /* Using cursor P049U2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P049U2_A396EmprCod[0] ;
         n396EmprCod = P049U2_n396EmprCod[0] ;
         A407EmprNom = P049U2_A407EmprNom[0] ;
         n407EmprNom = P049U2_n407EmprNom[0] ;
         AV26Emprnom = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P049U3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P049U3_A396EmprCod[0] ;
         n396EmprCod = P049U3_n396EmprCod[0] ;
         A10924XID = P049U3_A10924XID[0] ;
         A252CliCod = P049U3_A252CliCod[0] ;
         n252CliCod = P049U3_n252CliCod[0] ;
         A10925XDibCli = P049U3_A10925XDibCli[0] ;
         n10925XDibCli = P049U3_n10925XDibCli[0] ;
         A10926XDibInt = P049U3_A10926XDibInt[0] ;
         n10926XDibInt = P049U3_n10926XDibInt[0] ;
         A10927XDibMolCil = P049U3_A10927XDibMolCil[0] ;
         n10927XDibMolCil = P049U3_n10927XDibMolCil[0] ;
         A10928XDibObs = P049U3_A10928XDibObs[0] ;
         n10928XDibObs = P049U3_n10928XDibObs[0] ;
         A10930XDibAct = P049U3_A10930XDibAct[0] ;
         n10930XDibAct = P049U3_n10930XDibAct[0] ;
         AV17Emprcod = A396EmprCod ;
         AV18Clicod = A252CliCod ;
         AV19XDibCli = A10925XDibCli ;
         AV20XDibInt = A10926XDibInt ;
         AV21XDibMolCil = A10927XDibMolCil ;
         AV22XDibObs = A10928XDibObs ;
         AV25XdibAct = A10930XDibAct ;
         AV23DibCli = GXutil.trim( A10925XDibCli) + "-" + GXutil.padl( GXutil.trim( GXutil.str( A10927XDibMolCil, 2, 0)), (short)(2), "0") ;
         Gx_msg = httpContext.getMessage( "Procesando..", "") + GXutil.trim( AV26Emprnom) + " " + GXutil.str( AV18Clicod, 6, 0) + " " + GXutil.trim( AV19XDibCli) ;
         System.out.println( Gx_msg );
         /* Execute user subroutine: 'CDIBUJ' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Proceso...", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'CDIBUJ' Routine */
      returnInSub = false ;
      AV24Tcdibuj = (byte)(0) ;
      /* Using cursor P049U4 */
      pr_default.execute(2, new Object[] {AV17Emprcod, AV23DibCli, Integer.valueOf(AV18Clicod), Integer.valueOf(AV20XDibInt)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1014DibInt = P049U4_A1014DibInt[0] ;
         A252CliCod = P049U4_A252CliCod[0] ;
         n252CliCod = P049U4_n252CliCod[0] ;
         A1013DibCli = P049U4_A1013DibCli[0] ;
         A396EmprCod = P049U4_A396EmprCod[0] ;
         n396EmprCod = P049U4_n396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         n396EmprCod = false ;
         W1013DibCli = A1013DibCli ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         W1014DibInt = A1014DibInt ;
         AV24Tcdibuj = (byte)(1) ;
         /* Using cursor P049U5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A10793DibCilUlt = P049U5_A10793DibCilUlt[0] ;
            n10793DibCilUlt = P049U5_n10793DibCilUlt[0] ;
            A10788DibCilMts = P049U5_A10788DibCilMts[0] ;
            n10788DibCilMts = P049U5_n10788DibCilMts[0] ;
            A10787DibCilStF = P049U5_A10787DibCilStF[0] ;
            n10787DibCilStF = P049U5_n10787DibCilStF[0] ;
            A10786DibCilSt = P049U5_A10786DibCilSt[0] ;
            n10786DibCilSt = P049U5_n10786DibCilSt[0] ;
            A10785DibCilMesh = P049U5_A10785DibCilMesh[0] ;
            n10785DibCilMesh = P049U5_n10785DibCilMesh[0] ;
            A10772DibPres = P049U5_A10772DibPres[0] ;
            n10772DibPres = P049U5_n10772DibPres[0] ;
            A10771DibDm = P049U5_A10771DibDm[0] ;
            n10771DibDm = P049U5_n10771DibDm[0] ;
            A10511DibOrgClid = P049U5_A10511DibOrgClid[0] ;
            n10511DibOrgClid = P049U5_n10511DibOrgClid[0] ;
            A10510DibOrgLi = P049U5_A10510DibOrgLi[0] ;
            n10510DibOrgLi = P049U5_n10510DibOrgLi[0] ;
            A10509DibOrgCl = P049U5_A10509DibOrgCl[0] ;
            n10509DibOrgCl = P049U5_n10509DibOrgCl[0] ;
            A10508DibOrgIn = P049U5_A10508DibOrgIn[0] ;
            n10508DibOrgIn = P049U5_n10508DibOrgIn[0] ;
            A8658DibIntSp = P049U5_A8658DibIntSp[0] ;
            n8658DibIntSp = P049U5_n8658DibIntSp[0] ;
            A8415DibActivo = P049U5_A8415DibActivo[0] ;
            n8415DibActivo = P049U5_n8415DibActivo[0] ;
            A7027DibLinMalC = P049U5_A7027DibLinMalC[0] ;
            n7027DibLinMalC = P049U5_n7027DibLinMalC[0] ;
            A7026DibCilCod = P049U5_A7026DibCilCod[0] ;
            n7026DibCilCod = P049U5_n7026DibCilCod[0] ;
            A4860DibPrcCob = P049U5_A4860DibPrcCob[0] ;
            n4860DibPrcCob = P049U5_n4860DibPrcCob[0] ;
            A1810DibPosCil = P049U5_A1810DibPosCil[0] ;
            n1810DibPosCil = P049U5_n1810DibPosCil[0] ;
            A1826TipCilCod = P049U5_A1826TipCilCod[0] ;
            n1826TipCilCod = P049U5_n1826TipCilCod[0] ;
            A1808DibOrdCil = P049U5_A1808DibOrdCil[0] ;
            n1808DibOrdCil = P049U5_n1808DibOrdCil[0] ;
            A1030DibRelMC = P049U5_A1030DibRelMC[0] ;
            n1030DibRelMC = P049U5_n1030DibRelMC[0] ;
            A2089DibLinMol = P049U5_A2089DibLinMol[0] ;
            n2089DibLinMol = P049U5_n2089DibLinMol[0] ;
            A1807DibLinCil = P049U5_A1807DibLinCil[0] ;
            W396EmprCod = A396EmprCod ;
            n396EmprCod = false ;
            W1013DibCli = A1013DibCli ;
            W252CliCod = A252CliCod ;
            n252CliCod = false ;
            W1014DibInt = A1014DibInt ;
            /*
               INSERT RECORD ON TABLE TXPLDIBUC

            */
            W396EmprCod = A396EmprCod ;
            n396EmprCod = false ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W252CliCod = A252CliCod ;
            n252CliCod = false ;
            W1807DibLinCil = A1807DibLinCil ;
            n396EmprCod = false ;
            A1013DibCli = AV19XDibCli ;
            A1014DibInt = AV20XDibInt ;
            A252CliCod = AV18Clicod ;
            n252CliCod = false ;
            /* Using cursor P049U6 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil), Boolean.valueOf(n2089DibLinMol), Byte.valueOf(A2089DibLinMol), Boolean.valueOf(n1030DibRelMC), A1030DibRelMC, Boolean.valueOf(n1808DibOrdCil), Byte.valueOf(A1808DibOrdCil), Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod), Boolean.valueOf(n1810DibPosCil), Byte.valueOf(A1810DibPosCil), Boolean.valueOf(n4860DibPrcCob), A4860DibPrcCob, Boolean.valueOf(n7026DibCilCod), A7026DibCilCod, Boolean.valueOf(n7027DibLinMalC), A7027DibLinMalC, Boolean.valueOf(n8415DibActivo), A8415DibActivo, Boolean.valueOf(n8658DibIntSp), Integer.valueOf(A8658DibIntSp), Boolean.valueOf(n10508DibOrgIn), Integer.valueOf(A10508DibOrgIn), Boolean.valueOf(n10509DibOrgCl), A10509DibOrgCl, Boolean.valueOf(n10510DibOrgLi), Short.valueOf(A10510DibOrgLi), Boolean.valueOf(n10511DibOrgClid), Integer.valueOf(A10511DibOrgClid), Boolean.valueOf(n10771DibDm), Byte.valueOf(A10771DibDm), Boolean.valueOf(n10772DibPres), A10772DibPres, Boolean.valueOf(n10785DibCilMesh), Short.valueOf(A10785DibCilMesh), Boolean.valueOf(n10786DibCilSt), Byte.valueOf(A10786DibCilSt), Boolean.valueOf(n10787DibCilStF), A10787DibCilStF, Boolean.valueOf(n10788DibCilMts), A10788DibCilMts, Boolean.valueOf(n10793DibCilUlt), Integer.valueOf(A10793DibCilUlt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
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
            A396EmprCod = W396EmprCod ;
            n396EmprCod = false ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A252CliCod = W252CliCod ;
            n252CliCod = false ;
            A1807DibLinCil = W1807DibLinCil ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            n396EmprCod = false ;
            A1013DibCli = W1013DibCli ;
            A252CliCod = W252CliCod ;
            n252CliCod = false ;
            A1014DibInt = W1014DibInt ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A396EmprCod = W396EmprCod ;
         n396EmprCod = false ;
         A1013DibCli = W1013DibCli ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         A1014DibInt = W1014DibInt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /*
         INSERT RECORD ON TABLE TXPCDIBUJ

      */
      n396EmprCod = false ;
      A1013DibCli = AV19XDibCli ;
      A1014DibInt = AV20XDibInt ;
      A252CliCod = AV18Clicod ;
      n252CliCod = false ;
      A1005GrabCod = (short)(1) ;
      n1005GrabCod = false ;
      A1015DibFecUlt = GXutil.nullDate() ;
      n1015DibFecUlt = false ;
      A1016DibFecPed = GXutil.nullDate() ;
      n1016DibFecPed = false ;
      A1017DibFecEnt = GXutil.nullDate() ;
      n1017DibFecEnt = false ;
      A1018DibMetRea = DecimalUtil.doubleToDec(0) ;
      n1018DibMetRea = false ;
      A1605DibLocal = " " ;
      n1605DibLocal = false ;
      A1020DibObs = AV22XDibObs ;
      n1020DibObs = false ;
      A1609DibObs2 = " " ;
      n1609DibObs2 = false ;
      A1021DibCar = (byte)(0) ;
      n1021DibCar = false ;
      A1022DibImp = DecimalUtil.doubleToDec(0) ;
      n1022DibImp = false ;
      A1023DibMot = " " ;
      n1023DibMot = false ;
      A1823DibTipMaq = httpContext.getMessage( "R", "") ;
      n1823DibTipMaq = false ;
      A1880DibGraNum = " " ;
      n1880DibGraNum = false ;
      A3911TipMqnCod = (byte)(0) ;
      n3911TipMqnCod = false ;
      A2523DibObsUL = (byte)(0) ;
      n2523DibObsUL = false ;
      A1019DibMolCil = AV21XDibMolCil ;
      n1019DibMolCil = false ;
      A1607DibMed = " " ;
      n1607DibMed = false ;
      A1811DibPosVor = " " ;
      n1811DibPosVor = false ;
      A1806DibLevMaq = " " ;
      n1806DibLevMaq = false ;
      A1881DibPreAy1 = DecimalUtil.doubleToDec(0) ;
      n1881DibPreAy1 = false ;
      A1883DibPreAy2 = DecimalUtil.doubleToDec(0) ;
      n1883DibPreAy2 = false ;
      A1884DibPreAy3 = DecimalUtil.doubleToDec(0) ;
      n1884DibPreAy3 = false ;
      A1885DibPreAy4 = DecimalUtil.doubleToDec(0) ;
      n1885DibPreAy4 = false ;
      A1886DibPreAy5 = DecimalUtil.doubleToDec(0) ;
      n1886DibPreAy5 = false ;
      A1887DibPreAy6 = DecimalUtil.doubleToDec(0) ;
      n1887DibPreAy6 = false ;
      A1888DibPreAy7 = DecimalUtil.doubleToDec(0) ;
      n1888DibPreAy7 = false ;
      A1889DibPreAy8 = DecimalUtil.doubleToDec(0) ;
      n1889DibPreAy8 = false ;
      A1890DibPreAy9 = DecimalUtil.doubleToDec(0) ;
      n1890DibPreAy9 = false ;
      A1882DibPreAy10 = DecimalUtil.doubleToDec(0) ;
      n1882DibPreAy10 = false ;
      A1891DibPreOf1 = DecimalUtil.doubleToDec(0) ;
      n1891DibPreOf1 = false ;
      A1893DibPreOf2 = DecimalUtil.doubleToDec(0) ;
      n1893DibPreOf2 = false ;
      A1894DibPreOf3 = DecimalUtil.doubleToDec(0) ;
      n1894DibPreOf3 = false ;
      A1895DibPreOf4 = DecimalUtil.doubleToDec(0) ;
      n1895DibPreOf4 = false ;
      A1896DibPreOf5 = DecimalUtil.doubleToDec(0) ;
      n1896DibPreOf5 = false ;
      A1897DibPreOf6 = DecimalUtil.doubleToDec(0) ;
      n1897DibPreOf6 = false ;
      A1898DibPreOf7 = DecimalUtil.doubleToDec(0) ;
      n1898DibPreOf7 = false ;
      A1899DibPreOf8 = DecimalUtil.doubleToDec(0) ;
      n1899DibPreOf8 = false ;
      A1900DibPreOf9 = DecimalUtil.doubleToDec(0) ;
      n1900DibPreOf9 = false ;
      A1892DibPreOf10 = DecimalUtil.doubleToDec(0) ;
      n1892DibPreOf10 = false ;
      A1825DibVelMaq = (short)(0) ;
      n1825DibVelMaq = false ;
      A1813DibTemQm1 = (short)(0) ;
      n1813DibTemQm1 = false ;
      A1815DibTemQm2 = (short)(0) ;
      n1815DibTemQm2 = false ;
      A1816DibTemQm3 = (short)(0) ;
      n1816DibTemQm3 = false ;
      A1817DibTemQm4 = (short)(0) ;
      n1817DibTemQm4 = false ;
      A1818DibTemQm5 = (short)(0) ;
      n1818DibTemQm5 = false ;
      A1819DibTemQm6 = (short)(0) ;
      n1819DibTemQm6 = false ;
      A1820DibTemQm7 = (short)(0) ;
      n1820DibTemQm7 = false ;
      A1821DibTemQm8 = (short)(0) ;
      n1821DibTemQm8 = false ;
      A1822DibTemQm9 = (short)(0) ;
      n1822DibTemQm9 = false ;
      A1814DibTemQm10 = (short)(0) ;
      n1814DibTemQm10 = false ;
      A1824DibUltCil = (short)(0) ;
      n1824DibUltCil = false ;
      A2090DibMolCi2 = (short)(0) ;
      n2090DibMolCi2 = false ;
      A1606DibTipRas = " " ;
      n1606DibTipRas = false ;
      A1610DibPosRas = " " ;
      n1610DibPosRas = false ;
      A1608DibRap = DecimalUtil.doubleToDec(0) ;
      n1608DibRap = false ;
      A1024DibUltLin = (short)(0) ;
      n1024DibUltLin = false ;
      A4480DibPreAy11 = DecimalUtil.doubleToDec(0) ;
      n4480DibPreAy11 = false ;
      A4481DibPreAy12 = DecimalUtil.doubleToDec(0) ;
      n4481DibPreAy12 = false ;
      A4482DibPreAy13 = DecimalUtil.doubleToDec(0) ;
      n4482DibPreAy13 = false ;
      A4483DibPreAy14 = DecimalUtil.doubleToDec(0) ;
      n4483DibPreAy14 = false ;
      A4484DibPreAy15 = DecimalUtil.doubleToDec(0) ;
      n4484DibPreAy15 = false ;
      A4485DibPreAy16 = DecimalUtil.doubleToDec(0) ;
      n4485DibPreAy16 = false ;
      A4486DibPreOf11 = DecimalUtil.doubleToDec(0) ;
      n4486DibPreOf11 = false ;
      A4487DibPreOf12 = DecimalUtil.doubleToDec(0) ;
      n4487DibPreOf12 = false ;
      A4488DibPreOf13 = DecimalUtil.doubleToDec(0) ;
      n4488DibPreOf13 = false ;
      A4489DibPreOf14 = DecimalUtil.doubleToDec(0) ;
      n4489DibPreOf14 = false ;
      A4490DibPreOf15 = DecimalUtil.doubleToDec(0) ;
      n4490DibPreOf15 = false ;
      A4491DibPreOf16 = DecimalUtil.doubleToDec(0) ;
      n4491DibPreOf16 = false ;
      A4861DibCob = DecimalUtil.doubleToDec(100) ;
      n4861DibCob = false ;
      A6841DibDsc = httpContext.getMessage( "DATAMON+", "") ;
      n6841DibDsc = false ;
      A7140DibBmp = " " ;
      n7140DibBmp = false ;
      A7509DibFecBor = GXutil.nullDate() ;
      n7509DibFecBor = false ;
      A8192DibGra = " " ;
      n8192DibGra = false ;
      A8193DibSep = " " ;
      n8193DibSep = false ;
      A10884DibUltUti = GXutil.nullDate() ;
      n10884DibUltUti = false ;
      A10929DibAct = AV25XdibAct ;
      n10929DibAct = false ;
      /* Using cursor P049U7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod), Boolean.valueOf(n1015DibFecUlt), A1015DibFecUlt, Boolean.valueOf(n1016DibFecPed), A1016DibFecPed, Boolean.valueOf(n1017DibFecEnt), A1017DibFecEnt, Boolean.valueOf(n1018DibMetRea), A1018DibMetRea, Boolean.valueOf(n1605DibLocal), A1605DibLocal, Boolean.valueOf(n1020DibObs), A1020DibObs, Boolean.valueOf(n1609DibObs2), A1609DibObs2, Boolean.valueOf(n1021DibCar), Byte.valueOf(A1021DibCar), Boolean.valueOf(n1022DibImp), A1022DibImp, Boolean.valueOf(n1023DibMot), A1023DibMot, Boolean.valueOf(n1823DibTipMaq), A1823DibTipMaq, Boolean.valueOf(n1880DibGraNum), A1880DibGraNum, Boolean.valueOf(n3911TipMqnCod), Byte.valueOf(A3911TipMqnCod), Boolean.valueOf(n2523DibObsUL), Byte.valueOf(A2523DibObsUL), Boolean.valueOf(n1019DibMolCil), Short.valueOf(A1019DibMolCil), Boolean.valueOf(n1607DibMed), A1607DibMed, Boolean.valueOf(n1811DibPosVor), A1811DibPosVor, Boolean.valueOf(n1806DibLevMaq), A1806DibLevMaq, Boolean.valueOf(n1881DibPreAy1), A1881DibPreAy1, Boolean.valueOf(n1883DibPreAy2), A1883DibPreAy2, Boolean.valueOf(n1884DibPreAy3), A1884DibPreAy3, Boolean.valueOf(n1885DibPreAy4), A1885DibPreAy4, Boolean.valueOf(n1886DibPreAy5), A1886DibPreAy5, Boolean.valueOf(n1887DibPreAy6), A1887DibPreAy6, Boolean.valueOf(n1888DibPreAy7), A1888DibPreAy7, Boolean.valueOf(n1889DibPreAy8), A1889DibPreAy8, Boolean.valueOf(n1890DibPreAy9), A1890DibPreAy9, Boolean.valueOf(n1882DibPreAy10), A1882DibPreAy10, Boolean.valueOf(n1891DibPreOf1), A1891DibPreOf1, Boolean.valueOf(n1893DibPreOf2), A1893DibPreOf2, Boolean.valueOf(n1894DibPreOf3), A1894DibPreOf3, Boolean.valueOf(n1895DibPreOf4), A1895DibPreOf4, Boolean.valueOf(n1896DibPreOf5), A1896DibPreOf5, Boolean.valueOf(n1897DibPreOf6), A1897DibPreOf6, Boolean.valueOf(n1898DibPreOf7), A1898DibPreOf7, Boolean.valueOf(n1899DibPreOf8), A1899DibPreOf8, Boolean.valueOf(n1900DibPreOf9), A1900DibPreOf9, Boolean.valueOf(n1892DibPreOf10), A1892DibPreOf10, Boolean.valueOf(n1825DibVelMaq), Short.valueOf(A1825DibVelMaq), Boolean.valueOf(n1813DibTemQm1), Short.valueOf(A1813DibTemQm1), Boolean.valueOf(n1815DibTemQm2), Short.valueOf(A1815DibTemQm2), Boolean.valueOf(n1816DibTemQm3), Short.valueOf(A1816DibTemQm3), Boolean.valueOf(n1817DibTemQm4), Short.valueOf(A1817DibTemQm4), Boolean.valueOf(n1818DibTemQm5), Short.valueOf(A1818DibTemQm5), Boolean.valueOf(n1819DibTemQm6), Short.valueOf(A1819DibTemQm6), Boolean.valueOf(n1820DibTemQm7), Short.valueOf(A1820DibTemQm7), Boolean.valueOf(n1821DibTemQm8), Short.valueOf(A1821DibTemQm8), Boolean.valueOf(n1822DibTemQm9), Short.valueOf(A1822DibTemQm9), Boolean.valueOf(n1814DibTemQm10), Short.valueOf(A1814DibTemQm10), Boolean.valueOf(n1824DibUltCil), Short.valueOf(A1824DibUltCil), Boolean.valueOf(n2090DibMolCi2), Short.valueOf(A2090DibMolCi2), Boolean.valueOf(n1606DibTipRas), A1606DibTipRas, Boolean.valueOf(n1610DibPosRas), A1610DibPosRas, Boolean.valueOf(n1608DibRap), A1608DibRap, Boolean.valueOf(n1024DibUltLin), Short.valueOf(A1024DibUltLin), Boolean.valueOf(n4480DibPreAy11), A4480DibPreAy11, Boolean.valueOf(n4481DibPreAy12), A4481DibPreAy12,
      Boolean.valueOf(n4482DibPreAy13), A4482DibPreAy13, Boolean.valueOf(n4483DibPreAy14), A4483DibPreAy14, Boolean.valueOf(n4484DibPreAy15), A4484DibPreAy15, Boolean.valueOf(n4485DibPreAy16), A4485DibPreAy16, Boolean.valueOf(n4486DibPreOf11), A4486DibPreOf11, Boolean.valueOf(n4487DibPreOf12), A4487DibPreOf12, Boolean.valueOf(n4488DibPreOf13), A4488DibPreOf13, Boolean.valueOf(n4489DibPreOf14), A4489DibPreOf14, Boolean.valueOf(n4490DibPreOf15), A4490DibPreOf15, Boolean.valueOf(n4491DibPreOf16), A4491DibPreOf16, Boolean.valueOf(n4861DibCob), A4861DibCob, Boolean.valueOf(n6841DibDsc), A6841DibDsc, Boolean.valueOf(n7140DibBmp), A7140DibBmp, Boolean.valueOf(n7509DibFecBor), A7509DibFecBor, Boolean.valueOf(n8192DibGra), A8192DibGra, Boolean.valueOf(n8193DibSep), A8193DibSep, Boolean.valueOf(n10884DibUltUti), A10884DibUltUti, Boolean.valueOf(n10929DibAct), A10929DibAct});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
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
      /* End Insert */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pxdibuj.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apxdibuj");
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
      P049U2_A396EmprCod = new String[] {""} ;
      P049U2_n396EmprCod = new boolean[] {false} ;
      P049U2_A407EmprNom = new String[] {""} ;
      P049U2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV26Emprnom = "" ;
      P049U3_A396EmprCod = new String[] {""} ;
      P049U3_n396EmprCod = new boolean[] {false} ;
      P049U3_A10924XID = new int[1] ;
      P049U3_A252CliCod = new int[1] ;
      P049U3_n252CliCod = new boolean[] {false} ;
      P049U3_A10925XDibCli = new String[] {""} ;
      P049U3_n10925XDibCli = new boolean[] {false} ;
      P049U3_A10926XDibInt = new int[1] ;
      P049U3_n10926XDibInt = new boolean[] {false} ;
      P049U3_A10927XDibMolCil = new short[1] ;
      P049U3_n10927XDibMolCil = new boolean[] {false} ;
      P049U3_A10928XDibObs = new String[] {""} ;
      P049U3_n10928XDibObs = new boolean[] {false} ;
      P049U3_A10930XDibAct = new String[] {""} ;
      P049U3_n10930XDibAct = new boolean[] {false} ;
      A10925XDibCli = "" ;
      A10928XDibObs = "" ;
      A10930XDibAct = "" ;
      AV17Emprcod = "" ;
      AV19XDibCli = "" ;
      AV22XDibObs = "" ;
      AV25XdibAct = "" ;
      AV23DibCli = "" ;
      Gx_msg = "" ;
      P049U4_A1014DibInt = new int[1] ;
      P049U4_A252CliCod = new int[1] ;
      P049U4_n252CliCod = new boolean[] {false} ;
      P049U4_A1013DibCli = new String[] {""} ;
      P049U4_A396EmprCod = new String[] {""} ;
      P049U4_n396EmprCod = new boolean[] {false} ;
      A1013DibCli = "" ;
      W396EmprCod = "" ;
      W1013DibCli = "" ;
      P049U5_A396EmprCod = new String[] {""} ;
      P049U5_n396EmprCod = new boolean[] {false} ;
      P049U5_A1013DibCli = new String[] {""} ;
      P049U5_A252CliCod = new int[1] ;
      P049U5_n252CliCod = new boolean[] {false} ;
      P049U5_A1014DibInt = new int[1] ;
      P049U5_A10793DibCilUlt = new int[1] ;
      P049U5_n10793DibCilUlt = new boolean[] {false} ;
      P049U5_A10788DibCilMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P049U5_n10788DibCilMts = new boolean[] {false} ;
      P049U5_A10787DibCilStF = new java.util.Date[] {GXutil.nullDate()} ;
      P049U5_n10787DibCilStF = new boolean[] {false} ;
      P049U5_A10786DibCilSt = new byte[1] ;
      P049U5_n10786DibCilSt = new boolean[] {false} ;
      P049U5_A10785DibCilMesh = new short[1] ;
      P049U5_n10785DibCilMesh = new boolean[] {false} ;
      P049U5_A10772DibPres = new String[] {""} ;
      P049U5_n10772DibPres = new boolean[] {false} ;
      P049U5_A10771DibDm = new byte[1] ;
      P049U5_n10771DibDm = new boolean[] {false} ;
      P049U5_A10511DibOrgClid = new int[1] ;
      P049U5_n10511DibOrgClid = new boolean[] {false} ;
      P049U5_A10510DibOrgLi = new short[1] ;
      P049U5_n10510DibOrgLi = new boolean[] {false} ;
      P049U5_A10509DibOrgCl = new String[] {""} ;
      P049U5_n10509DibOrgCl = new boolean[] {false} ;
      P049U5_A10508DibOrgIn = new int[1] ;
      P049U5_n10508DibOrgIn = new boolean[] {false} ;
      P049U5_A8658DibIntSp = new int[1] ;
      P049U5_n8658DibIntSp = new boolean[] {false} ;
      P049U5_A8415DibActivo = new String[] {""} ;
      P049U5_n8415DibActivo = new boolean[] {false} ;
      P049U5_A7027DibLinMalC = new String[] {""} ;
      P049U5_n7027DibLinMalC = new boolean[] {false} ;
      P049U5_A7026DibCilCod = new String[] {""} ;
      P049U5_n7026DibCilCod = new boolean[] {false} ;
      P049U5_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P049U5_n4860DibPrcCob = new boolean[] {false} ;
      P049U5_A1810DibPosCil = new byte[1] ;
      P049U5_n1810DibPosCil = new boolean[] {false} ;
      P049U5_A1826TipCilCod = new byte[1] ;
      P049U5_n1826TipCilCod = new boolean[] {false} ;
      P049U5_A1808DibOrdCil = new byte[1] ;
      P049U5_n1808DibOrdCil = new boolean[] {false} ;
      P049U5_A1030DibRelMC = new String[] {""} ;
      P049U5_n1030DibRelMC = new boolean[] {false} ;
      P049U5_A2089DibLinMol = new byte[1] ;
      P049U5_n2089DibLinMol = new boolean[] {false} ;
      P049U5_A1807DibLinCil = new short[1] ;
      A10788DibCilMts = DecimalUtil.ZERO ;
      A10787DibCilStF = GXutil.nullDate() ;
      A10772DibPres = "" ;
      A10509DibOrgCl = "" ;
      A8415DibActivo = "" ;
      A7027DibLinMalC = "" ;
      A7026DibCilCod = "" ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      A1030DibRelMC = "" ;
      Gx_emsg = "" ;
      A1015DibFecUlt = GXutil.nullDate() ;
      A1016DibFecPed = GXutil.nullDate() ;
      A1017DibFecEnt = GXutil.nullDate() ;
      A1018DibMetRea = DecimalUtil.ZERO ;
      A1605DibLocal = "" ;
      A1020DibObs = "" ;
      A1609DibObs2 = "" ;
      A1022DibImp = DecimalUtil.ZERO ;
      A1023DibMot = "" ;
      A1823DibTipMaq = "" ;
      A1880DibGraNum = "" ;
      A1607DibMed = "" ;
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
      A1606DibTipRas = "" ;
      A1610DibPosRas = "" ;
      A1608DibRap = DecimalUtil.ZERO ;
      A4480DibPreAy11 = DecimalUtil.ZERO ;
      A4481DibPreAy12 = DecimalUtil.ZERO ;
      A4482DibPreAy13 = DecimalUtil.ZERO ;
      A4483DibPreAy14 = DecimalUtil.ZERO ;
      A4484DibPreAy15 = DecimalUtil.ZERO ;
      A4485DibPreAy16 = DecimalUtil.ZERO ;
      A4486DibPreOf11 = DecimalUtil.ZERO ;
      A4487DibPreOf12 = DecimalUtil.ZERO ;
      A4488DibPreOf13 = DecimalUtil.ZERO ;
      A4489DibPreOf14 = DecimalUtil.ZERO ;
      A4490DibPreOf15 = DecimalUtil.ZERO ;
      A4491DibPreOf16 = DecimalUtil.ZERO ;
      A4861DibCob = DecimalUtil.ZERO ;
      A6841DibDsc = "" ;
      A7140DibBmp = "" ;
      A7509DibFecBor = GXutil.nullDate() ;
      A8192DibGra = "" ;
      A8193DibSep = "" ;
      A10884DibUltUti = GXutil.nullDate() ;
      A10929DibAct = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apxdibuj__default(),
         new Object[] {
             new Object[] {
            P049U2_A396EmprCod, P049U2_A407EmprNom, P049U2_n407EmprNom
            }
            , new Object[] {
            P049U3_A396EmprCod, P049U3_n396EmprCod, P049U3_A10924XID, P049U3_A252CliCod, P049U3_n252CliCod, P049U3_A10925XDibCli, P049U3_n10925XDibCli, P049U3_A10926XDibInt, P049U3_n10926XDibInt, P049U3_A10927XDibMolCil,
            P049U3_n10927XDibMolCil, P049U3_A10928XDibObs, P049U3_n10928XDibObs, P049U3_A10930XDibAct, P049U3_n10930XDibAct
            }
            , new Object[] {
            P049U4_A1014DibInt, P049U4_A252CliCod, P049U4_A1013DibCli, P049U4_A396EmprCod
            }
            , new Object[] {
            P049U5_A396EmprCod, P049U5_A1013DibCli, P049U5_A252CliCod, P049U5_A1014DibInt, P049U5_A10793DibCilUlt, P049U5_n10793DibCilUlt, P049U5_A10788DibCilMts, P049U5_n10788DibCilMts, P049U5_A10787DibCilStF, P049U5_n10787DibCilStF,
            P049U5_A10786DibCilSt, P049U5_n10786DibCilSt, P049U5_A10785DibCilMesh, P049U5_n10785DibCilMesh, P049U5_A10772DibPres, P049U5_n10772DibPres, P049U5_A10771DibDm, P049U5_n10771DibDm, P049U5_A10511DibOrgClid, P049U5_n10511DibOrgClid,
            P049U5_A10510DibOrgLi, P049U5_n10510DibOrgLi, P049U5_A10509DibOrgCl, P049U5_n10509DibOrgCl, P049U5_A10508DibOrgIn, P049U5_n10508DibOrgIn, P049U5_A8658DibIntSp, P049U5_n8658DibIntSp, P049U5_A8415DibActivo, P049U5_n8415DibActivo,
            P049U5_A7027DibLinMalC, P049U5_n7027DibLinMalC, P049U5_A7026DibCilCod, P049U5_n7026DibCilCod, P049U5_A4860DibPrcCob, P049U5_n4860DibPrcCob, P049U5_A1810DibPosCil, P049U5_n1810DibPosCil, P049U5_A1826TipCilCod, P049U5_n1826TipCilCod,
            P049U5_A1808DibOrdCil, P049U5_n1808DibOrdCil, P049U5_A1030DibRelMC, P049U5_n1030DibRelMC, P049U5_A2089DibLinMol, P049U5_n2089DibLinMol, P049U5_A1807DibLinCil
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

   private byte AV24Tcdibuj ;
   private byte A10786DibCilSt ;
   private byte A10771DibDm ;
   private byte A1810DibPosCil ;
   private byte A1826TipCilCod ;
   private byte A1808DibOrdCil ;
   private byte A2089DibLinMol ;
   private byte A1021DibCar ;
   private byte A3911TipMqnCod ;
   private byte A2523DibObsUL ;
   private short A10927XDibMolCil ;
   private short AV21XDibMolCil ;
   private short A10785DibCilMesh ;
   private short A10510DibOrgLi ;
   private short A1807DibLinCil ;
   private short W1807DibLinCil ;
   private short Gx_err ;
   private short A1005GrabCod ;
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
   private short A2090DibMolCi2 ;
   private short A1024DibUltLin ;
   private int A10924XID ;
   private int A252CliCod ;
   private int A10926XDibInt ;
   private int AV18Clicod ;
   private int AV20XDibInt ;
   private int A1014DibInt ;
   private int W252CliCod ;
   private int W1014DibInt ;
   private int A10793DibCilUlt ;
   private int A10511DibOrgClid ;
   private int A10508DibOrgIn ;
   private int A8658DibIntSp ;
   private int GX_INS549 ;
   private int GX_INS545 ;
   private java.math.BigDecimal A10788DibCilMts ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private java.math.BigDecimal A1018DibMetRea ;
   private java.math.BigDecimal A1022DibImp ;
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
   private java.math.BigDecimal A1608DibRap ;
   private java.math.BigDecimal A4480DibPreAy11 ;
   private java.math.BigDecimal A4481DibPreAy12 ;
   private java.math.BigDecimal A4482DibPreAy13 ;
   private java.math.BigDecimal A4483DibPreAy14 ;
   private java.math.BigDecimal A4484DibPreAy15 ;
   private java.math.BigDecimal A4485DibPreAy16 ;
   private java.math.BigDecimal A4486DibPreOf11 ;
   private java.math.BigDecimal A4487DibPreOf12 ;
   private java.math.BigDecimal A4488DibPreOf13 ;
   private java.math.BigDecimal A4489DibPreOf14 ;
   private java.math.BigDecimal A4490DibPreOf15 ;
   private java.math.BigDecimal A4491DibPreOf16 ;
   private java.math.BigDecimal A4861DibCob ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV26Emprnom ;
   private String A10925XDibCli ;
   private String A10928XDibObs ;
   private String A10930XDibAct ;
   private String AV17Emprcod ;
   private String AV19XDibCli ;
   private String AV22XDibObs ;
   private String AV25XdibAct ;
   private String AV23DibCli ;
   private String Gx_msg ;
   private String A1013DibCli ;
   private String W396EmprCod ;
   private String W1013DibCli ;
   private String A10772DibPres ;
   private String A10509DibOrgCl ;
   private String A8415DibActivo ;
   private String A7027DibLinMalC ;
   private String A7026DibCilCod ;
   private String A1030DibRelMC ;
   private String Gx_emsg ;
   private String A1605DibLocal ;
   private String A1020DibObs ;
   private String A1609DibObs2 ;
   private String A1023DibMot ;
   private String A1823DibTipMaq ;
   private String A1880DibGraNum ;
   private String A1607DibMed ;
   private String A1811DibPosVor ;
   private String A1806DibLevMaq ;
   private String A1606DibTipRas ;
   private String A1610DibPosRas ;
   private String A6841DibDsc ;
   private String A7140DibBmp ;
   private String A8192DibGra ;
   private String A8193DibSep ;
   private String A10929DibAct ;
   private java.util.Date A10787DibCilStF ;
   private java.util.Date A1015DibFecUlt ;
   private java.util.Date A1016DibFecPed ;
   private java.util.Date A1017DibFecEnt ;
   private java.util.Date A7509DibFecBor ;
   private java.util.Date A10884DibUltUti ;
   private boolean n396EmprCod ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n10925XDibCli ;
   private boolean n10926XDibInt ;
   private boolean n10927XDibMolCil ;
   private boolean n10928XDibObs ;
   private boolean n10930XDibAct ;
   private boolean returnInSub ;
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
   private boolean n1005GrabCod ;
   private boolean n1015DibFecUlt ;
   private boolean n1016DibFecPed ;
   private boolean n1017DibFecEnt ;
   private boolean n1018DibMetRea ;
   private boolean n1605DibLocal ;
   private boolean n1020DibObs ;
   private boolean n1609DibObs2 ;
   private boolean n1021DibCar ;
   private boolean n1022DibImp ;
   private boolean n1023DibMot ;
   private boolean n1823DibTipMaq ;
   private boolean n1880DibGraNum ;
   private boolean n3911TipMqnCod ;
   private boolean n2523DibObsUL ;
   private boolean n1019DibMolCil ;
   private boolean n1607DibMed ;
   private boolean n1811DibPosVor ;
   private boolean n1806DibLevMaq ;
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
   private boolean n2090DibMolCi2 ;
   private boolean n1606DibTipRas ;
   private boolean n1610DibPosRas ;
   private boolean n1608DibRap ;
   private boolean n1024DibUltLin ;
   private boolean n4480DibPreAy11 ;
   private boolean n4481DibPreAy12 ;
   private boolean n4482DibPreAy13 ;
   private boolean n4483DibPreAy14 ;
   private boolean n4484DibPreAy15 ;
   private boolean n4485DibPreAy16 ;
   private boolean n4486DibPreOf11 ;
   private boolean n4487DibPreOf12 ;
   private boolean n4488DibPreOf13 ;
   private boolean n4489DibPreOf14 ;
   private boolean n4490DibPreOf15 ;
   private boolean n4491DibPreOf16 ;
   private boolean n4861DibCob ;
   private boolean n6841DibDsc ;
   private boolean n7140DibBmp ;
   private boolean n7509DibFecBor ;
   private boolean n8192DibGra ;
   private boolean n8193DibSep ;
   private boolean n10884DibUltUti ;
   private boolean n10929DibAct ;
   private IDataStoreProvider pr_default ;
   private String[] P049U2_A396EmprCod ;
   private boolean[] P049U2_n396EmprCod ;
   private String[] P049U2_A407EmprNom ;
   private boolean[] P049U2_n407EmprNom ;
   private String[] P049U3_A396EmprCod ;
   private boolean[] P049U3_n396EmprCod ;
   private int[] P049U3_A10924XID ;
   private int[] P049U3_A252CliCod ;
   private boolean[] P049U3_n252CliCod ;
   private String[] P049U3_A10925XDibCli ;
   private boolean[] P049U3_n10925XDibCli ;
   private int[] P049U3_A10926XDibInt ;
   private boolean[] P049U3_n10926XDibInt ;
   private short[] P049U3_A10927XDibMolCil ;
   private boolean[] P049U3_n10927XDibMolCil ;
   private String[] P049U3_A10928XDibObs ;
   private boolean[] P049U3_n10928XDibObs ;
   private String[] P049U3_A10930XDibAct ;
   private boolean[] P049U3_n10930XDibAct ;
   private int[] P049U4_A1014DibInt ;
   private int[] P049U4_A252CliCod ;
   private boolean[] P049U4_n252CliCod ;
   private String[] P049U4_A1013DibCli ;
   private String[] P049U4_A396EmprCod ;
   private boolean[] P049U4_n396EmprCod ;
   private String[] P049U5_A396EmprCod ;
   private boolean[] P049U5_n396EmprCod ;
   private String[] P049U5_A1013DibCli ;
   private int[] P049U5_A252CliCod ;
   private boolean[] P049U5_n252CliCod ;
   private int[] P049U5_A1014DibInt ;
   private int[] P049U5_A10793DibCilUlt ;
   private boolean[] P049U5_n10793DibCilUlt ;
   private java.math.BigDecimal[] P049U5_A10788DibCilMts ;
   private boolean[] P049U5_n10788DibCilMts ;
   private java.util.Date[] P049U5_A10787DibCilStF ;
   private boolean[] P049U5_n10787DibCilStF ;
   private byte[] P049U5_A10786DibCilSt ;
   private boolean[] P049U5_n10786DibCilSt ;
   private short[] P049U5_A10785DibCilMesh ;
   private boolean[] P049U5_n10785DibCilMesh ;
   private String[] P049U5_A10772DibPres ;
   private boolean[] P049U5_n10772DibPres ;
   private byte[] P049U5_A10771DibDm ;
   private boolean[] P049U5_n10771DibDm ;
   private int[] P049U5_A10511DibOrgClid ;
   private boolean[] P049U5_n10511DibOrgClid ;
   private short[] P049U5_A10510DibOrgLi ;
   private boolean[] P049U5_n10510DibOrgLi ;
   private String[] P049U5_A10509DibOrgCl ;
   private boolean[] P049U5_n10509DibOrgCl ;
   private int[] P049U5_A10508DibOrgIn ;
   private boolean[] P049U5_n10508DibOrgIn ;
   private int[] P049U5_A8658DibIntSp ;
   private boolean[] P049U5_n8658DibIntSp ;
   private String[] P049U5_A8415DibActivo ;
   private boolean[] P049U5_n8415DibActivo ;
   private String[] P049U5_A7027DibLinMalC ;
   private boolean[] P049U5_n7027DibLinMalC ;
   private String[] P049U5_A7026DibCilCod ;
   private boolean[] P049U5_n7026DibCilCod ;
   private java.math.BigDecimal[] P049U5_A4860DibPrcCob ;
   private boolean[] P049U5_n4860DibPrcCob ;
   private byte[] P049U5_A1810DibPosCil ;
   private boolean[] P049U5_n1810DibPosCil ;
   private byte[] P049U5_A1826TipCilCod ;
   private boolean[] P049U5_n1826TipCilCod ;
   private byte[] P049U5_A1808DibOrdCil ;
   private boolean[] P049U5_n1808DibOrdCil ;
   private String[] P049U5_A1030DibRelMC ;
   private boolean[] P049U5_n1030DibRelMC ;
   private byte[] P049U5_A2089DibLinMol ;
   private boolean[] P049U5_n2089DibLinMol ;
   private short[] P049U5_A1807DibLinCil ;
}

final  class apxdibuj__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P049U2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = '001' ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P049U3", "SELECT EmprCod, XID, CliCod, XDibCli, XDibInt, XDibMolCil, XDibObs, XDibAct FROM TXPXDIBUJ WHERE (XID > 0) AND (EmprCod = '001') ORDER BY XID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P049U4", "SELECT DibInt, CliCod, DibCli, EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P049U5", "SELECT EmprCod, DibCli, CliCod, DibInt, DibCilUlt, DibCilMts, DibCilStF, DibCilSt, DibCilMesh, DibPres, DibDm, DibOrgClid, DibOrgLi, DibOrgCl, DibOrgIn, DibIntSp, DibActivo, DibLinMalC, DibCilCod, DibPrcCob, DibPosCil, TipCilCod, DibOrdCil, DibRelMC, DibLinMol, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P049U6", "INSERT INTO TXPLDIBUC(EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibLinMol, DibRelMC, DibOrdCil, TipCilCod, DibPosCil, DibPrcCob, DibCilCod, DibLinMalC, DibActivo, DibIntSp, DibOrgIn, DibOrgCl, DibOrgLi, DibOrgClid, DibDm, DibPres, DibCilMesh, DibCilSt, DibCilStF, DibCilMts, DibCilUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
         ,new UpdateCursor("P049U7", "INSERT INTO TXPCDIBUJ(EmprCod, DibCli, CliCod, DibInt, GrabCod, DibFecUlt, DibFecPed, DibFecEnt, DibMetRea, DibLocal, DibObs, DibObs2, DibCar, DibImp, DibMot, DibTipMaq, DibGraNum, TipMqnCod, DibObsUL, DibMolCil, DibMed, DibPosVor, DibLevMaq, DibPreAy1, DibPreAy2, DibPreAy3, DibPreAy4, DibPreAy5, DibPreAy6, DibPreAy7, DibPreAy8, DibPreAy9, DibPreAy10, DibPreOf1, DibPreOf2, DibPreOf3, DibPreOf4, DibPreOf5, DibPreOf6, DibPreOf7, DibPreOf8, DibPreOf9, DibPreOf10, DibVelMaq, DibTemQm1, DibTemQm2, DibTemQm3, DibTemQm4, DibTemQm5, DibTemQm6, DibTemQm7, DibTemQm8, DibTemQm9, DibTemQm10, DibUltCil, DibMolCi2, DibTipRas, DibPosRas, DibRap, DibUltLin, DibPreAy11, DibPreAy12, DibPreAy13, DibPreAy14, DibPreAy15, DibPreAy16, DibPreOf11, DibPreOf12, DibPreOf13, DibPreOf14, DibPreOf15, DibPreOf16, DibCob, DibDsc, DibBmp, DibFecBor, DibGra, DibSep, DibUltUti, DibAct, DibSentido) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 5);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(26);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 20);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 5);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 10);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 16);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[34]).intValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[36]).byteValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[38], 10);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[42]).byteValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DATE );
               }
               else
               {
                  stmt.setDate(24, (java.util.Date)parms[44]);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[48]).intValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 15);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 10);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[39], 10);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[41], 3);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[43], 8);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[87]).shortValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[93]).shortValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[95]).shortValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(50, ((Number) parms[97]).shortValue());
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[99]).shortValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(52, ((Number) parms[101]).shortValue());
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[103]).shortValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(54, ((Number) parms[105]).shortValue());
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[107]).shortValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[109]).shortValue());
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[111], 15);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[113], 15);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(59, (java.math.BigDecimal)parms[115], 2);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(60, ((Number) parms[117]).shortValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(61, (java.math.BigDecimal)parms[119], 2);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(62, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(63, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(64, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(65, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(66, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(67, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(68, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(69, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(70, (java.math.BigDecimal)parms[137], 2);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(71, (java.math.BigDecimal)parms[139], 2);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(72, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(73, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[145], 30);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[147], 128);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.DATE );
               }
               else
               {
                  stmt.setDate(76, (java.util.Date)parms[149]);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[151], 1);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[153], 1);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.DATE );
               }
               else
               {
                  stmt.setDate(79, (java.util.Date)parms[155]);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[157], 1);
               }
               return;
      }
   }

}

