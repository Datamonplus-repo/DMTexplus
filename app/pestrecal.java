package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestrecal extends GXProcedure
{
   public pestrecal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestrecal.class ), "" );
   }

   public pestrecal( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           byte[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      pestrecal.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pestrecal.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestrecal.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pestrecal.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pestrecal.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pestrecal.this.A2524DisComLin = aP4[0];
      this.aP4 = aP4;
      pestrecal.this.A1056DisComCod = aP5[0];
      this.aP5 = aP5;
      pestrecal.this.A1032FonCod = aP6[0];
      this.aP6 = aP6;
      pestrecal.this.A2124RecMolCod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV36StkEst ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STKEST", ""), GXv_int2) ;
      pestrecal.this.GXt_int1 = GXv_int2[0] ;
      AV36StkEst = GXt_int1 ;
      GXt_int3 = (int)(DecimalUtil.decToDouble(AV48IncRot)) ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ROTINC", ""), GXv_int4) ;
      pestrecal.this.GXt_int3 = GXv_int4[0] ;
      AV48IncRot = DecimalUtil.doubleToDec(GXt_int3) ;
      GXt_int1 = AV43Artextil ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      pestrecal.this.GXt_int1 = GXv_int2[0] ;
      AV43Artextil = GXt_int1 ;
      /* Using cursor P01MK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5104RecMolTotK = P01MK2_A5104RecMolTotK[0] ;
         n5104RecMolTotK = P01MK2_n5104RecMolTotK[0] ;
         A252CliCod = P01MK2_A252CliCod[0] ;
         n252CliCod = P01MK2_n252CliCod[0] ;
         A1798BarDibCli = P01MK2_A1798BarDibCli[0] ;
         A1799BarDibInt = P01MK2_A1799BarDibInt[0] ;
         A252CliCod = P01MK2_A252CliCod[0] ;
         n252CliCod = P01MK2_n252CliCod[0] ;
         A1798BarDibCli = P01MK2_A1798BarDibCli[0] ;
         A1799BarDibInt = P01MK2_A1799BarDibInt[0] ;
         AV24PasTot = DecimalUtil.doubleToDec(0) ;
         AV25PrdTot = DecimalUtil.doubleToDec(0) ;
         AV44CliCod = A252CliCod ;
         AV45BarDibCli = A1798BarDibCli ;
         AV46BarDibInt = A1799BarDibInt ;
         /* Execute user subroutine: 'TIPMAQ' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P01MK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2107PasCod = P01MK3_A2107PasCod[0] ;
            n2107PasCod = P01MK3_n2107PasCod[0] ;
            A2132RecPasCan = P01MK3_A2132RecPasCan[0] ;
            n2132RecPasCan = P01MK3_n2132RecPasCan[0] ;
            A7775PasTipBC = P01MK3_A7775PasTipBC[0] ;
            n7775PasTipBC = P01MK3_n7775PasTipBC[0] ;
            A2672RecPasLin = P01MK3_A2672RecPasLin[0] ;
            A7775PasTipBC = P01MK3_A7775PasTipBC[0] ;
            n7775PasTipBC = P01MK3_n7775PasTipBC[0] ;
            AV24PasTot = AV24PasTot.add(A2132RecPasCan) ;
            AV42PasTipBC = ((GXutil.strcmp(A7775PasTipBC, httpContext.getMessage( "S", ""))==0) ? A7775PasTipBC : AV42PasTipBC) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized group. */
         /* Using cursor P01MK4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
         c2119RecEstCP = P01MK4_A2119RecEstCP[0] ;
         n2119RecEstCP = P01MK4_n2119RecEstCP[0] ;
         pr_default.close(2);
         AV25PrdTot = AV25PrdTot.add(c2119RecEstCP) ;
         /* End optimized group. */
         A5104RecMolTotK = AV24PasTot.add(AV25PrdTot.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
         n5104RecMolTotK = false ;
         /* Using cursor P01MK5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2132RecPasCan = P01MK5_A2132RecPasCan[0] ;
            n2132RecPasCan = P01MK5_n2132RecPasCan[0] ;
            A2672RecPasLin = P01MK5_A2672RecPasLin[0] ;
            A2680RecPasULP = P01MK5_A2680RecPasULP[0] ;
            n2680RecPasULP = P01MK5_n2680RecPasULP[0] ;
            A2107PasCod = P01MK5_A2107PasCod[0] ;
            n2107PasCod = P01MK5_n2107PasCod[0] ;
            A2133RecPasGK = P01MK5_A2133RecPasGK[0] ;
            n2133RecPasGK = P01MK5_n2133RecPasGK[0] ;
            A5107RecPasCosK = P01MK5_A5107RecPasCosK[0] ;
            n5107RecPasCosK = P01MK5_n5107RecPasCosK[0] ;
            if ( A5104RecMolTotK.doubleValue() != 0 )
            {
               A2133RecPasGK = A2132RecPasCan.multiply(DecimalUtil.doubleToDec(1000)).divide(A5104RecMolTotK, 18, java.math.RoundingMode.DOWN) ;
               n2133RecPasGK = false ;
            }
            else
            {
               A2133RecPasGK = DecimalUtil.doubleToDec(0) ;
               n2133RecPasGK = false ;
            }
            AV32RecPasCosK = DecimalUtil.doubleToDec(0) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV26PrdNum[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV35Cont = DecimalUtil.doubleToDec(0) ;
            AV27RecPasLin = A2672RecPasLin ;
            AV39RecPasCan = A2132RecPasCan ;
            AV40Recmolcod = A2124RecMolCod ;
            /* Using cursor P01MK6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A719PrdNum = P01MK6_A719PrdNum[0] ;
               n719PrdNum = P01MK6_n719PrdNum[0] ;
               A707PrdFacCon = P01MK6_A707PrdFacCon[0] ;
               A685PrdCanRes = P01MK6_A685PrdCanRes[0] ;
               A2106PasCanPrd = P01MK6_A2106PasCanPrd[0] ;
               n2106PasCanPrd = P01MK6_n2106PasCanPrd[0] ;
               A724PrdPreAct = P01MK6_A724PrdPreAct[0] ;
               A2144UniEstCod = P01MK6_A2144UniEstCod[0] ;
               n2144UniEstCod = P01MK6_n2144UniEstCod[0] ;
               A707PrdFacCon = P01MK6_A707PrdFacCon[0] ;
               A685PrdCanRes = P01MK6_A685PrdCanRes[0] ;
               A724PrdPreAct = P01MK6_A724PrdPreAct[0] ;
               O2680RecPasULP = A2680RecPasULP ;
               n2680RecPasULP = false ;
               W2107PasCod = A2107PasCod ;
               n2107PasCod = false ;
               AV33PasCanPrd = A2106PasCanPrd ;
               AV37PrdnumAux = A719PrdNum ;
               AV38PrdFacCon = A707PrdFacCon ;
               AV34PrdPreAct = A724PrdPreAct ;
               AV29UniEstCod = A2144UniEstCod ;
               AV56GXLvl74 = (byte)(0) ;
               /* Using cursor P01MK7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Boolean.valueOf(n2107PasCod), A2107PasCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A2672RecPasLin = P01MK7_A2672RecPasLin[0] ;
                  A2670RecPasCP = P01MK7_A2670RecPasCP[0] ;
                  n2670RecPasCP = P01MK7_n2670RecPasCP[0] ;
                  A2674RecPasPK = P01MK7_A2674RecPasPK[0] ;
                  n2674RecPasPK = P01MK7_n2674RecPasPK[0] ;
                  A5470RecPasPre = P01MK7_A5470RecPasPre[0] ;
                  n5470RecPasPre = P01MK7_n5470RecPasPre[0] ;
                  A2675RecPasPLi = P01MK7_A2675RecPasPLi[0] ;
                  O685PrdCanRes = A685PrdCanRes ;
                  AV56GXLvl74 = (byte)(1) ;
                  AV35Cont = AV35Cont.add(DecimalUtil.doubleToDec(1)) ;
                  AV26PrdNum[(int)(DecimalUtil.decToDouble(AV35Cont))-1] = A719PrdNum ;
                  if ( AV36StkEst == 1 )
                  {
                     A685PrdCanRes = A685PrdCanRes.subtract((A2670RecPasCP.multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                  }
                  if ( DecimalUtil.compareTo((A2132RecPasCan.multiply(AV33PasCanPrd)), DecimalUtil.stringToDec("999999.99")) > 0 )
                  {
                     A2670RecPasCP = DecimalUtil.doubleToDec(0) ;
                     n2670RecPasCP = false ;
                  }
                  else
                  {
                     A2670RecPasCP = A2132RecPasCan.multiply(AV33PasCanPrd) ;
                     n2670RecPasCP = false ;
                  }
                  if ( AV36StkEst == 1 )
                  {
                     A685PrdCanRes = A685PrdCanRes.add((A2670RecPasCP.multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                  }
                  A2674RecPasPK = AV33PasCanPrd ;
                  n2674RecPasPK = false ;
                  AV32RecPasCosK = AV32RecPasCosK.add((A2670RecPasCP.multiply(A5470RecPasPre))) ;
                  /* Using cursor P01MK8 */
                  pr_default.execute(6, new Object[] {Boolean.valueOf(n2670RecPasCP), A2670RecPasCP, Boolean.valueOf(n2674RecPasPK), A2674RecPasPK, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin), Short.valueOf(A2675RecPasPLi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECDEP");
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               if ( AV56GXLvl74 == 0 )
               {
                  System.out.println( httpContext.getMessage( "Creo Registro RECDEP", "") );
                  A2680RecPasULP = (short)(A2680RecPasULP+1) ;
                  n2680RecPasULP = false ;
                  AV28RecPasPli = A2680RecPasULP ;
                  /* Execute user subroutine: 'RECDEP_ALTA' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(4);
                     pr_default.close(4);
                     pr_default.close(3);
                     pr_default.close(0);
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               /* Using cursor P01MK9 */
               pr_default.execute(7, new Object[] {A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
               A2107PasCod = W2107PasCod ;
               n2107PasCod = false ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P01MK10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A719PrdNum = P01MK10_A719PrdNum[0] ;
               n719PrdNum = P01MK10_n719PrdNum[0] ;
               A2675RecPasPLi = P01MK10_A2675RecPasPLi[0] ;
               if ( new app.core.ascan(remoteHandle, context).executeUdp( AV26PrdNum, A719PrdNum) == 0 )
               {
                  /* Using cursor P01MK11 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin), Short.valueOf(A2675RecPasPLi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECDEP");
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
            if ( ( DecimalUtil.compareTo(AV32RecPasCosK, DecimalUtil.stringToDec("99999.9999")) > 0 ) || ( AV32RecPasCosK.doubleValue() < 0 ) )
            {
               AV32RecPasCosK = DecimalUtil.doubleToDec(0) ;
            }
            A5107RecPasCosK = AV32RecPasCosK ;
            n5107RecPasCosK = false ;
            /* Using cursor P01MK12 */
            pr_default.execute(10, new Object[] {Boolean.valueOf(n2133RecPasGK), A2133RecPasGK, Boolean.valueOf(n5107RecPasCosK), A5107RecPasCosK, Boolean.valueOf(n2680RecPasULP), Short.valueOf(A2680RecPasULP), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPAS");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV43Artextil == 1 )
         {
            if ( GXutil.strcmp(AV47DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
            {
               AV48IncRot = ((GXutil.strcmp(AV42PasTipBC, httpContext.getMessage( "S", ""))==0) ? AV48IncRot : DecimalUtil.doubleToDec(0)) ;
            }
         }
         else
         {
            AV48IncRot = DecimalUtil.doubleToDec(0) ;
         }
         /* Using cursor P01MK13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A719PrdNum = P01MK13_A719PrdNum[0] ;
            n719PrdNum = P01MK13_n719PrdNum[0] ;
            A2119RecEstCP = P01MK13_A2119RecEstCP[0] ;
            n2119RecEstCP = P01MK13_n2119RecEstCP[0] ;
            A2120RecEstGK = P01MK13_A2120RecEstGK[0] ;
            n2120RecEstGK = P01MK13_n2120RecEstGK[0] ;
            A724PrdPreAct = P01MK13_A724PrdPreAct[0] ;
            A5106RecEstCosK = P01MK13_A5106RecEstCosK[0] ;
            n5106RecEstCosK = P01MK13_n5106RecEstCosK[0] ;
            A2126RecMolLin = P01MK13_A2126RecMolLin[0] ;
            A724PrdPreAct = P01MK13_A724PrdPreAct[0] ;
            if ( A5104RecMolTotK.doubleValue() != 0 )
            {
               A2120RecEstGK = A2119RecEstCP.divide(A5104RecMolTotK, 18, java.math.RoundingMode.DOWN) ;
               n2120RecEstGK = false ;
               A5106RecEstCosK = A724PrdPreAct.multiply(A2120RecEstGK).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               n5106RecEstCosK = false ;
            }
            else
            {
               A2120RecEstGK = DecimalUtil.doubleToDec(0) ;
               n2120RecEstGK = false ;
               A5106RecEstCosK = DecimalUtil.doubleToDec(0) ;
               n5106RecEstCosK = false ;
            }
            /* Using cursor P01MK14 */
            pr_default.execute(12, new Object[] {Boolean.valueOf(n2120RecEstGK), A2120RecEstGK, Boolean.valueOf(n5106RecEstCosK), A5106RecEstCosK, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPRD");
            pr_default.readNext(11);
         }
         pr_default.close(11);
         /* Using cursor P01MK15 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n5104RecMolTotK), A5104RecMolTotK, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMOL");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'RECDEP_ALTA' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPRECDEP

      */
      A2124RecMolCod = AV40Recmolcod ;
      A2672RecPasLin = AV27RecPasLin ;
      A2675RecPasPLi = AV28RecPasPli ;
      A719PrdNum = AV37PrdnumAux ;
      n719PrdNum = false ;
      /* Execute user subroutine: 'PRODUC' */
      S1210 ();
      if (returnInSub) return;
      A2670RecPasCP = AV39RecPasCan.multiply(AV33PasCanPrd) ;
      n2670RecPasCP = false ;
      AV30RecPasCP = AV39RecPasCan.multiply(AV33PasCanPrd) ;
      A2674RecPasPK = AV33PasCanPrd ;
      n2674RecPasPK = false ;
      A5470RecPasPre = AV34PrdPreAct ;
      n5470RecPasPre = false ;
      A2678RecPasUC = AV29UniEstCod ;
      n2678RecPasUC = false ;
      AV32RecPasCosK = AV32RecPasCosK.add((A2670RecPasCP.multiply(A5470RecPasPre))) ;
      /* Using cursor P01MK16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin), Short.valueOf(A2675RecPasPLi), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2678RecPasUC), A2678RecPasUC, Boolean.valueOf(n2674RecPasPK), A2674RecPasPK, Boolean.valueOf(n2670RecPasCP), A2670RecPasCP, Boolean.valueOf(n5470RecPasPre), A5470RecPasPre});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECDEP");
      if ( (pr_default.getStatus(14) == 1) )
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

   public void S1210( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      /* Using cursor P01MK17 */
      pr_default.execute(15, new Object[] {A396EmprCod, AV37PrdnumAux});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A719PrdNum = P01MK17_A719PrdNum[0] ;
         n719PrdNum = P01MK17_n719PrdNum[0] ;
         A707PrdFacCon = P01MK17_A707PrdFacCon[0] ;
         A685PrdCanRes = P01MK17_A685PrdCanRes[0] ;
         A724PrdPreAct = P01MK17_A724PrdPreAct[0] ;
         if ( AV36StkEst == 1 )
         {
            A685PrdCanRes = A685PrdCanRes.add((AV30RecPasCP.multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
         }
         AV34PrdPreAct = A724PrdPreAct ;
         /* Using cursor P01MK18 */
         pr_default.execute(16, new Object[] {A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S131( )
   {
      /* 'TIPMAQ' Routine */
      returnInSub = false ;
      /* Using cursor P01MK19 */
      pr_default.execute(17, new Object[] {A396EmprCod, AV45BarDibCli, Integer.valueOf(AV44CliCod), Integer.valueOf(AV46BarDibInt)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A1014DibInt = P01MK19_A1014DibInt[0] ;
         A1013DibCli = P01MK19_A1013DibCli[0] ;
         A252CliCod = P01MK19_A252CliCod[0] ;
         n252CliCod = P01MK19_n252CliCod[0] ;
         A1823DibTipMaq = P01MK19_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P01MK19_n1823DibTipMaq[0] ;
         AV47DibTipMaq = A1823DibTipMaq ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestrecal.this.A396EmprCod;
      this.aP1[0] = pestrecal.this.A129BarCod;
      this.aP2[0] = pestrecal.this.A132BarCodReo;
      this.aP3[0] = pestrecal.this.A130BarCodPar;
      this.aP4[0] = pestrecal.this.A2524DisComLin;
      this.aP5[0] = pestrecal.this.A1056DisComCod;
      this.aP6[0] = pestrecal.this.A1032FonCod;
      this.aP7[0] = pestrecal.this.A2124RecMolCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48IncRot = DecimalUtil.ZERO ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P01MK2_A396EmprCod = new String[] {""} ;
      P01MK2_A129BarCod = new int[1] ;
      P01MK2_A132BarCodReo = new byte[1] ;
      P01MK2_A130BarCodPar = new String[] {""} ;
      P01MK2_A2524DisComLin = new byte[1] ;
      P01MK2_A1056DisComCod = new String[] {""} ;
      P01MK2_A1032FonCod = new String[] {""} ;
      P01MK2_A2124RecMolCod = new byte[1] ;
      P01MK2_A5104RecMolTotK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK2_n5104RecMolTotK = new boolean[] {false} ;
      P01MK2_A252CliCod = new int[1] ;
      P01MK2_n252CliCod = new boolean[] {false} ;
      P01MK2_A1798BarDibCli = new String[] {""} ;
      P01MK2_A1799BarDibInt = new int[1] ;
      A5104RecMolTotK = DecimalUtil.ZERO ;
      A1798BarDibCli = "" ;
      AV24PasTot = DecimalUtil.ZERO ;
      AV25PrdTot = DecimalUtil.ZERO ;
      AV45BarDibCli = "" ;
      P01MK3_A2107PasCod = new String[] {""} ;
      P01MK3_n2107PasCod = new boolean[] {false} ;
      P01MK3_A396EmprCod = new String[] {""} ;
      P01MK3_A129BarCod = new int[1] ;
      P01MK3_A132BarCodReo = new byte[1] ;
      P01MK3_A130BarCodPar = new String[] {""} ;
      P01MK3_A2524DisComLin = new byte[1] ;
      P01MK3_A1056DisComCod = new String[] {""} ;
      P01MK3_A1032FonCod = new String[] {""} ;
      P01MK3_A2124RecMolCod = new byte[1] ;
      P01MK3_A2132RecPasCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK3_n2132RecPasCan = new boolean[] {false} ;
      P01MK3_A7775PasTipBC = new String[] {""} ;
      P01MK3_n7775PasTipBC = new boolean[] {false} ;
      P01MK3_A2672RecPasLin = new short[1] ;
      A2107PasCod = "" ;
      A2132RecPasCan = DecimalUtil.ZERO ;
      A7775PasTipBC = "" ;
      AV42PasTipBC = "" ;
      c2119RecEstCP = DecimalUtil.ZERO ;
      P01MK4_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK4_n2119RecEstCP = new boolean[] {false} ;
      P01MK5_A396EmprCod = new String[] {""} ;
      P01MK5_A129BarCod = new int[1] ;
      P01MK5_A132BarCodReo = new byte[1] ;
      P01MK5_A130BarCodPar = new String[] {""} ;
      P01MK5_A2524DisComLin = new byte[1] ;
      P01MK5_A1056DisComCod = new String[] {""} ;
      P01MK5_A1032FonCod = new String[] {""} ;
      P01MK5_A2124RecMolCod = new byte[1] ;
      P01MK5_A2132RecPasCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK5_n2132RecPasCan = new boolean[] {false} ;
      P01MK5_A2672RecPasLin = new short[1] ;
      P01MK5_A2680RecPasULP = new short[1] ;
      P01MK5_n2680RecPasULP = new boolean[] {false} ;
      P01MK5_A2107PasCod = new String[] {""} ;
      P01MK5_n2107PasCod = new boolean[] {false} ;
      P01MK5_A2133RecPasGK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK5_n2133RecPasGK = new boolean[] {false} ;
      P01MK5_A5107RecPasCosK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK5_n5107RecPasCosK = new boolean[] {false} ;
      A2133RecPasGK = DecimalUtil.ZERO ;
      A5107RecPasCosK = DecimalUtil.ZERO ;
      AV32RecPasCosK = DecimalUtil.ZERO ;
      AV26PrdNum = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV26PrdNum[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV35Cont = DecimalUtil.ZERO ;
      AV39RecPasCan = DecimalUtil.ZERO ;
      P01MK6_A396EmprCod = new String[] {""} ;
      P01MK6_A2107PasCod = new String[] {""} ;
      P01MK6_n2107PasCod = new boolean[] {false} ;
      P01MK6_A719PrdNum = new String[] {""} ;
      P01MK6_n719PrdNum = new boolean[] {false} ;
      P01MK6_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK6_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK6_A2106PasCanPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK6_n2106PasCanPrd = new boolean[] {false} ;
      P01MK6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK6_A2144UniEstCod = new String[] {""} ;
      P01MK6_n2144UniEstCod = new boolean[] {false} ;
      A719PrdNum = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A2106PasCanPrd = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      W2107PasCod = "" ;
      AV33PasCanPrd = DecimalUtil.ZERO ;
      AV37PrdnumAux = "" ;
      AV38PrdFacCon = DecimalUtil.ZERO ;
      AV34PrdPreAct = DecimalUtil.ZERO ;
      AV29UniEstCod = "" ;
      P01MK7_A2672RecPasLin = new short[1] ;
      P01MK7_A396EmprCod = new String[] {""} ;
      P01MK7_A2107PasCod = new String[] {""} ;
      P01MK7_n2107PasCod = new boolean[] {false} ;
      P01MK7_A719PrdNum = new String[] {""} ;
      P01MK7_n719PrdNum = new boolean[] {false} ;
      P01MK7_A129BarCod = new int[1] ;
      P01MK7_A132BarCodReo = new byte[1] ;
      P01MK7_A130BarCodPar = new String[] {""} ;
      P01MK7_A2524DisComLin = new byte[1] ;
      P01MK7_A1056DisComCod = new String[] {""} ;
      P01MK7_A1032FonCod = new String[] {""} ;
      P01MK7_A2124RecMolCod = new byte[1] ;
      P01MK7_A2670RecPasCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK7_n2670RecPasCP = new boolean[] {false} ;
      P01MK7_A2674RecPasPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK7_n2674RecPasPK = new boolean[] {false} ;
      P01MK7_A5470RecPasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK7_n5470RecPasPre = new boolean[] {false} ;
      P01MK7_A2675RecPasPLi = new short[1] ;
      A2670RecPasCP = DecimalUtil.ZERO ;
      A2674RecPasPK = DecimalUtil.ZERO ;
      A5470RecPasPre = DecimalUtil.ZERO ;
      O685PrdCanRes = DecimalUtil.ZERO ;
      P01MK10_A396EmprCod = new String[] {""} ;
      P01MK10_A129BarCod = new int[1] ;
      P01MK10_A132BarCodReo = new byte[1] ;
      P01MK10_A130BarCodPar = new String[] {""} ;
      P01MK10_A2524DisComLin = new byte[1] ;
      P01MK10_A1056DisComCod = new String[] {""} ;
      P01MK10_A1032FonCod = new String[] {""} ;
      P01MK10_A2124RecMolCod = new byte[1] ;
      P01MK10_A2672RecPasLin = new short[1] ;
      P01MK10_A719PrdNum = new String[] {""} ;
      P01MK10_n719PrdNum = new boolean[] {false} ;
      P01MK10_A2675RecPasPLi = new short[1] ;
      AV47DibTipMaq = "" ;
      P01MK13_A719PrdNum = new String[] {""} ;
      P01MK13_n719PrdNum = new boolean[] {false} ;
      P01MK13_A396EmprCod = new String[] {""} ;
      P01MK13_A129BarCod = new int[1] ;
      P01MK13_A132BarCodReo = new byte[1] ;
      P01MK13_A130BarCodPar = new String[] {""} ;
      P01MK13_A2524DisComLin = new byte[1] ;
      P01MK13_A1056DisComCod = new String[] {""} ;
      P01MK13_A1032FonCod = new String[] {""} ;
      P01MK13_A2124RecMolCod = new byte[1] ;
      P01MK13_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK13_n2119RecEstCP = new boolean[] {false} ;
      P01MK13_A2120RecEstGK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK13_n2120RecEstGK = new boolean[] {false} ;
      P01MK13_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK13_A5106RecEstCosK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK13_n5106RecEstCosK = new boolean[] {false} ;
      P01MK13_A2126RecMolLin = new byte[1] ;
      A2119RecEstCP = DecimalUtil.ZERO ;
      A2120RecEstGK = DecimalUtil.ZERO ;
      A5106RecEstCosK = DecimalUtil.ZERO ;
      AV30RecPasCP = DecimalUtil.ZERO ;
      A2678RecPasUC = "" ;
      Gx_emsg = "" ;
      P01MK17_A396EmprCod = new String[] {""} ;
      P01MK17_A719PrdNum = new String[] {""} ;
      P01MK17_n719PrdNum = new boolean[] {false} ;
      P01MK17_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK17_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK17_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01MK19_A396EmprCod = new String[] {""} ;
      P01MK19_A1014DibInt = new int[1] ;
      P01MK19_A1013DibCli = new String[] {""} ;
      P01MK19_A252CliCod = new int[1] ;
      P01MK19_n252CliCod = new boolean[] {false} ;
      P01MK19_A1823DibTipMaq = new String[] {""} ;
      P01MK19_n1823DibTipMaq = new boolean[] {false} ;
      A1013DibCli = "" ;
      A1823DibTipMaq = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestrecal__default(),
         new Object[] {
             new Object[] {
            P01MK2_A396EmprCod, P01MK2_A129BarCod, P01MK2_A132BarCodReo, P01MK2_A130BarCodPar, P01MK2_A2524DisComLin, P01MK2_A1056DisComCod, P01MK2_A1032FonCod, P01MK2_A2124RecMolCod, P01MK2_A5104RecMolTotK, P01MK2_n5104RecMolTotK,
            P01MK2_A252CliCod, P01MK2_n252CliCod, P01MK2_A1798BarDibCli, P01MK2_A1799BarDibInt
            }
            , new Object[] {
            P01MK3_A2107PasCod, P01MK3_n2107PasCod, P01MK3_A396EmprCod, P01MK3_A129BarCod, P01MK3_A132BarCodReo, P01MK3_A130BarCodPar, P01MK3_A2524DisComLin, P01MK3_A1056DisComCod, P01MK3_A1032FonCod, P01MK3_A2124RecMolCod,
            P01MK3_A2132RecPasCan, P01MK3_n2132RecPasCan, P01MK3_A7775PasTipBC, P01MK3_n7775PasTipBC, P01MK3_A2672RecPasLin
            }
            , new Object[] {
            P01MK4_A2119RecEstCP, P01MK4_n2119RecEstCP
            }
            , new Object[] {
            P01MK5_A396EmprCod, P01MK5_A129BarCod, P01MK5_A132BarCodReo, P01MK5_A130BarCodPar, P01MK5_A2524DisComLin, P01MK5_A1056DisComCod, P01MK5_A1032FonCod, P01MK5_A2124RecMolCod, P01MK5_A2132RecPasCan, P01MK5_n2132RecPasCan,
            P01MK5_A2672RecPasLin, P01MK5_A2680RecPasULP, P01MK5_n2680RecPasULP, P01MK5_A2107PasCod, P01MK5_n2107PasCod, P01MK5_A2133RecPasGK, P01MK5_n2133RecPasGK, P01MK5_A5107RecPasCosK, P01MK5_n5107RecPasCosK
            }
            , new Object[] {
            P01MK6_A396EmprCod, P01MK6_A2107PasCod, P01MK6_A719PrdNum, P01MK6_A707PrdFacCon, P01MK6_A685PrdCanRes, P01MK6_A2106PasCanPrd, P01MK6_n2106PasCanPrd, P01MK6_A724PrdPreAct, P01MK6_A2144UniEstCod, P01MK6_n2144UniEstCod
            }
            , new Object[] {
            P01MK7_A2672RecPasLin, P01MK7_A396EmprCod, P01MK7_A2107PasCod, P01MK7_n2107PasCod, P01MK7_A719PrdNum, P01MK7_n719PrdNum, P01MK7_A129BarCod, P01MK7_A132BarCodReo, P01MK7_A130BarCodPar, P01MK7_A2524DisComLin,
            P01MK7_A1056DisComCod, P01MK7_A1032FonCod, P01MK7_A2124RecMolCod, P01MK7_A2670RecPasCP, P01MK7_n2670RecPasCP, P01MK7_A2674RecPasPK, P01MK7_n2674RecPasPK, P01MK7_A5470RecPasPre, P01MK7_n5470RecPasPre, P01MK7_A2675RecPasPLi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01MK10_A396EmprCod, P01MK10_A129BarCod, P01MK10_A132BarCodReo, P01MK10_A130BarCodPar, P01MK10_A2524DisComLin, P01MK10_A1056DisComCod, P01MK10_A1032FonCod, P01MK10_A2124RecMolCod, P01MK10_A2672RecPasLin, P01MK10_A719PrdNum,
            P01MK10_n719PrdNum, P01MK10_A2675RecPasPLi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01MK13_A719PrdNum, P01MK13_n719PrdNum, P01MK13_A396EmprCod, P01MK13_A129BarCod, P01MK13_A132BarCodReo, P01MK13_A130BarCodPar, P01MK13_A2524DisComLin, P01MK13_A1056DisComCod, P01MK13_A1032FonCod, P01MK13_A2124RecMolCod,
            P01MK13_A2119RecEstCP, P01MK13_n2119RecEstCP, P01MK13_A2120RecEstGK, P01MK13_n2120RecEstGK, P01MK13_A724PrdPreAct, P01MK13_A5106RecEstCosK, P01MK13_n5106RecEstCosK, P01MK13_A2126RecMolLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01MK17_A396EmprCod, P01MK17_A719PrdNum, P01MK17_A707PrdFacCon, P01MK17_A685PrdCanRes, P01MK17_A724PrdPreAct
            }
            , new Object[] {
            }
            , new Object[] {
            P01MK19_A396EmprCod, P01MK19_A1014DibInt, P01MK19_A1013DibCli, P01MK19_A252CliCod, P01MK19_A1823DibTipMaq, P01MK19_n1823DibTipMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte A2124RecMolCod ;
   private byte AV36StkEst ;
   private byte AV43Artextil ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV40Recmolcod ;
   private byte AV56GXLvl74 ;
   private byte A2126RecMolLin ;
   private short A2672RecPasLin ;
   private short A2680RecPasULP ;
   private short AV27RecPasLin ;
   private short O2680RecPasULP ;
   private short A2675RecPasPLi ;
   private short AV28RecPasPli ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int A252CliCod ;
   private int A1799BarDibInt ;
   private int AV44CliCod ;
   private int AV46BarDibInt ;
   private int GX_I ;
   private int GX_INS596 ;
   private int A1014DibInt ;
   private java.math.BigDecimal AV48IncRot ;
   private java.math.BigDecimal A5104RecMolTotK ;
   private java.math.BigDecimal AV24PasTot ;
   private java.math.BigDecimal AV25PrdTot ;
   private java.math.BigDecimal A2132RecPasCan ;
   private java.math.BigDecimal c2119RecEstCP ;
   private java.math.BigDecimal A2133RecPasGK ;
   private java.math.BigDecimal A5107RecPasCosK ;
   private java.math.BigDecimal AV32RecPasCosK ;
   private java.math.BigDecimal AV35Cont ;
   private java.math.BigDecimal AV39RecPasCan ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A2106PasCanPrd ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV33PasCanPrd ;
   private java.math.BigDecimal AV38PrdFacCon ;
   private java.math.BigDecimal AV34PrdPreAct ;
   private java.math.BigDecimal A2670RecPasCP ;
   private java.math.BigDecimal A2674RecPasPK ;
   private java.math.BigDecimal A5470RecPasPre ;
   private java.math.BigDecimal O685PrdCanRes ;
   private java.math.BigDecimal A2119RecEstCP ;
   private java.math.BigDecimal A2120RecEstGK ;
   private java.math.BigDecimal A5106RecEstCosK ;
   private java.math.BigDecimal AV30RecPasCP ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String scmdbuf ;
   private String A1798BarDibCli ;
   private String AV45BarDibCli ;
   private String A2107PasCod ;
   private String A7775PasTipBC ;
   private String AV42PasTipBC ;
   private String AV26PrdNum[] ;
   private String A719PrdNum ;
   private String A2144UniEstCod ;
   private String W2107PasCod ;
   private String AV37PrdnumAux ;
   private String AV29UniEstCod ;
   private String AV47DibTipMaq ;
   private String A2678RecPasUC ;
   private String Gx_emsg ;
   private String A1013DibCli ;
   private String A1823DibTipMaq ;
   private boolean n5104RecMolTotK ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n2107PasCod ;
   private boolean n2132RecPasCan ;
   private boolean n7775PasTipBC ;
   private boolean n2119RecEstCP ;
   private boolean n2680RecPasULP ;
   private boolean n2133RecPasGK ;
   private boolean n5107RecPasCosK ;
   private boolean n719PrdNum ;
   private boolean n2106PasCanPrd ;
   private boolean n2144UniEstCod ;
   private boolean n2670RecPasCP ;
   private boolean n2674RecPasPK ;
   private boolean n5470RecPasPre ;
   private boolean n2120RecEstGK ;
   private boolean n5106RecEstCosK ;
   private boolean n2678RecPasUC ;
   private boolean n1823DibTipMaq ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01MK2_A396EmprCod ;
   private int[] P01MK2_A129BarCod ;
   private byte[] P01MK2_A132BarCodReo ;
   private String[] P01MK2_A130BarCodPar ;
   private byte[] P01MK2_A2524DisComLin ;
   private String[] P01MK2_A1056DisComCod ;
   private String[] P01MK2_A1032FonCod ;
   private byte[] P01MK2_A2124RecMolCod ;
   private java.math.BigDecimal[] P01MK2_A5104RecMolTotK ;
   private boolean[] P01MK2_n5104RecMolTotK ;
   private int[] P01MK2_A252CliCod ;
   private boolean[] P01MK2_n252CliCod ;
   private String[] P01MK2_A1798BarDibCli ;
   private int[] P01MK2_A1799BarDibInt ;
   private String[] P01MK3_A2107PasCod ;
   private boolean[] P01MK3_n2107PasCod ;
   private String[] P01MK3_A396EmprCod ;
   private int[] P01MK3_A129BarCod ;
   private byte[] P01MK3_A132BarCodReo ;
   private String[] P01MK3_A130BarCodPar ;
   private byte[] P01MK3_A2524DisComLin ;
   private String[] P01MK3_A1056DisComCod ;
   private String[] P01MK3_A1032FonCod ;
   private byte[] P01MK3_A2124RecMolCod ;
   private java.math.BigDecimal[] P01MK3_A2132RecPasCan ;
   private boolean[] P01MK3_n2132RecPasCan ;
   private String[] P01MK3_A7775PasTipBC ;
   private boolean[] P01MK3_n7775PasTipBC ;
   private short[] P01MK3_A2672RecPasLin ;
   private java.math.BigDecimal[] P01MK4_A2119RecEstCP ;
   private boolean[] P01MK4_n2119RecEstCP ;
   private String[] P01MK5_A396EmprCod ;
   private int[] P01MK5_A129BarCod ;
   private byte[] P01MK5_A132BarCodReo ;
   private String[] P01MK5_A130BarCodPar ;
   private byte[] P01MK5_A2524DisComLin ;
   private String[] P01MK5_A1056DisComCod ;
   private String[] P01MK5_A1032FonCod ;
   private byte[] P01MK5_A2124RecMolCod ;
   private java.math.BigDecimal[] P01MK5_A2132RecPasCan ;
   private boolean[] P01MK5_n2132RecPasCan ;
   private short[] P01MK5_A2672RecPasLin ;
   private short[] P01MK5_A2680RecPasULP ;
   private boolean[] P01MK5_n2680RecPasULP ;
   private String[] P01MK5_A2107PasCod ;
   private boolean[] P01MK5_n2107PasCod ;
   private java.math.BigDecimal[] P01MK5_A2133RecPasGK ;
   private boolean[] P01MK5_n2133RecPasGK ;
   private java.math.BigDecimal[] P01MK5_A5107RecPasCosK ;
   private boolean[] P01MK5_n5107RecPasCosK ;
   private String[] P01MK6_A396EmprCod ;
   private String[] P01MK6_A2107PasCod ;
   private boolean[] P01MK6_n2107PasCod ;
   private String[] P01MK6_A719PrdNum ;
   private boolean[] P01MK6_n719PrdNum ;
   private java.math.BigDecimal[] P01MK6_A707PrdFacCon ;
   private java.math.BigDecimal[] P01MK6_A685PrdCanRes ;
   private java.math.BigDecimal[] P01MK6_A2106PasCanPrd ;
   private boolean[] P01MK6_n2106PasCanPrd ;
   private java.math.BigDecimal[] P01MK6_A724PrdPreAct ;
   private String[] P01MK6_A2144UniEstCod ;
   private boolean[] P01MK6_n2144UniEstCod ;
   private short[] P01MK7_A2672RecPasLin ;
   private String[] P01MK7_A396EmprCod ;
   private String[] P01MK7_A2107PasCod ;
   private boolean[] P01MK7_n2107PasCod ;
   private String[] P01MK7_A719PrdNum ;
   private boolean[] P01MK7_n719PrdNum ;
   private int[] P01MK7_A129BarCod ;
   private byte[] P01MK7_A132BarCodReo ;
   private String[] P01MK7_A130BarCodPar ;
   private byte[] P01MK7_A2524DisComLin ;
   private String[] P01MK7_A1056DisComCod ;
   private String[] P01MK7_A1032FonCod ;
   private byte[] P01MK7_A2124RecMolCod ;
   private java.math.BigDecimal[] P01MK7_A2670RecPasCP ;
   private boolean[] P01MK7_n2670RecPasCP ;
   private java.math.BigDecimal[] P01MK7_A2674RecPasPK ;
   private boolean[] P01MK7_n2674RecPasPK ;
   private java.math.BigDecimal[] P01MK7_A5470RecPasPre ;
   private boolean[] P01MK7_n5470RecPasPre ;
   private short[] P01MK7_A2675RecPasPLi ;
   private String[] P01MK10_A396EmprCod ;
   private int[] P01MK10_A129BarCod ;
   private byte[] P01MK10_A132BarCodReo ;
   private String[] P01MK10_A130BarCodPar ;
   private byte[] P01MK10_A2524DisComLin ;
   private String[] P01MK10_A1056DisComCod ;
   private String[] P01MK10_A1032FonCod ;
   private byte[] P01MK10_A2124RecMolCod ;
   private short[] P01MK10_A2672RecPasLin ;
   private String[] P01MK10_A719PrdNum ;
   private boolean[] P01MK10_n719PrdNum ;
   private short[] P01MK10_A2675RecPasPLi ;
   private String[] P01MK13_A719PrdNum ;
   private boolean[] P01MK13_n719PrdNum ;
   private String[] P01MK13_A396EmprCod ;
   private int[] P01MK13_A129BarCod ;
   private byte[] P01MK13_A132BarCodReo ;
   private String[] P01MK13_A130BarCodPar ;
   private byte[] P01MK13_A2524DisComLin ;
   private String[] P01MK13_A1056DisComCod ;
   private String[] P01MK13_A1032FonCod ;
   private byte[] P01MK13_A2124RecMolCod ;
   private java.math.BigDecimal[] P01MK13_A2119RecEstCP ;
   private boolean[] P01MK13_n2119RecEstCP ;
   private java.math.BigDecimal[] P01MK13_A2120RecEstGK ;
   private boolean[] P01MK13_n2120RecEstGK ;
   private java.math.BigDecimal[] P01MK13_A724PrdPreAct ;
   private java.math.BigDecimal[] P01MK13_A5106RecEstCosK ;
   private boolean[] P01MK13_n5106RecEstCosK ;
   private byte[] P01MK13_A2126RecMolLin ;
   private String[] P01MK17_A396EmprCod ;
   private String[] P01MK17_A719PrdNum ;
   private boolean[] P01MK17_n719PrdNum ;
   private java.math.BigDecimal[] P01MK17_A707PrdFacCon ;
   private java.math.BigDecimal[] P01MK17_A685PrdCanRes ;
   private java.math.BigDecimal[] P01MK17_A724PrdPreAct ;
   private String[] P01MK19_A396EmprCod ;
   private int[] P01MK19_A1014DibInt ;
   private String[] P01MK19_A1013DibCli ;
   private int[] P01MK19_A252CliCod ;
   private boolean[] P01MK19_n252CliCod ;
   private String[] P01MK19_A1823DibTipMaq ;
   private boolean[] P01MK19_n1823DibTipMaq ;
}

final  class pestrecal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01MK2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecMolTotK, T2.CliCod, T2.BarDibCli, T2.BarDibInt FROM (TXPRECMOL T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? and T1.RecMolCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01MK3", "SELECT T1.PasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecPasCan, T2.PasTipBC, T1.RecPasLin FROM (TXPRECPAS T1 LEFT JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? and T1.RecMolCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01MK4", "SELECT SUM(RecEstCP) FROM TXPRECPRD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01MK5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasCan, RecPasLin, RecPasULP, PasCod, RecPasGK, RecPasCosK FROM TXPRECPAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01MK6", "SELECT T1.EmprCod, T1.PasCod, T1.PrdNum, T2.PrdFacCon, T2.PrdCanRes, T1.PasCanPrd, T2.PrdPreAct, T1.UniEstCod FROM (TXPLPASTA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PasCod = ? ORDER BY T1.EmprCod, T1.PasCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01MK7", "SELECT T1.RecPasLin, T1.EmprCod, T2.PasCod, T1.PrdNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecPasCP, T1.RecPasPK, T1.RecPasPre, T1.RecPasPLi FROM (TXPRECDEP T1 INNER JOIN TXPRECPAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.DisComLin = T1.DisComLin AND T2.DisComCod = T1.DisComCod AND T2.FonCod = T1.FonCod AND T2.RecMolCod = T1.RecMolCod AND T2.RecPasLin = T1.RecPasLin) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? and T1.RecMolCod = ?) AND (T2.PasCod = ?) AND (T1.PrdNum = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01MK8", "UPDATE TXPRECDEP SET RecPasCP=?, RecPasPK=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecPasLin = ? AND RecPasPLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECDEP")
         ,new UpdateCursor("P01MK9", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P01MK10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, PrdNum, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? and RecPasLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01MK11", "DELETE FROM TXPRECDEP  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecPasLin = ? AND RecPasPLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECDEP")
         ,new UpdateCursor("P01MK12", "UPDATE TXPRECPAS SET RecPasGK=?, RecPasCosK=?, RecPasULP=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecPasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECPAS")
         ,new ForEachCursor("P01MK13", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecEstCP, T1.RecEstGK, T2.PrdPreAct, T1.RecEstCosK, T1.RecMolLin FROM (TXPRECPRD T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? and T1.RecMolCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01MK14", "UPDATE TXPRECPRD SET RecEstGK=?, RecEstCosK=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecMolLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECPRD")
         ,new UpdateCursor("P01MK15", "UPDATE TXPRECMOL SET RecMolTotK=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMOL")
         ,new UpdateCursor("P01MK16", "INSERT INTO TXPRECDEP(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi, PrdNum, RecPasUC, RecPasPK, RecPasCP, RecPasPre) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECDEP")
         ,new ForEachCursor("P01MK17", "SELECT EmprCod, PrdNum, PrdFacCon, PrdCanRes, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01MK18", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P01MK19", "SELECT EmprCod, DibInt, DibCli, CliCod, DibTipMaq FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(15);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(14);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 6);
               }
               return;
            case 6 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 12);
               stmt.setString(9, (String)parms[10], 12);
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               stmt.setShort(12, ((Number) parms[13]).shortValue());
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               stmt.setString(9, (String)parms[11], 12);
               stmt.setString(10, (String)parms[12], 12);
               stmt.setByte(11, ((Number) parms[13]).byteValue());
               stmt.setShort(12, ((Number) parms[14]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 12);
               stmt.setString(9, (String)parms[10], 12);
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               stmt.setByte(11, ((Number) parms[12]).byteValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[19], 5);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

