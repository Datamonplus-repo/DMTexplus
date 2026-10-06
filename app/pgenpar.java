package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenpar extends GXProcedure
{
   public pgenpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenpar.class ), "" );
   }

   public pgenpar( int remoteHandle ,
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
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 )
   {
      pgenpar.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 )
   {
      pgenpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgenpar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pgenpar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pgenpar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pgenpar.this.AV15DisComLin = aP4[0];
      this.aP4 = aP4;
      pgenpar.this.AV16DisComCod = aP5[0];
      this.aP5 = aP5;
      pgenpar.this.AV17FonCod = aP6[0];
      this.aP6 = aP6;
      pgenpar.this.AV18RepComMtr = aP7[0];
      this.aP7 = aP7;
      pgenpar.this.AV19RecEstAnh = aP8[0];
      this.aP8 = aP8;
      pgenpar.this.AV20Principal = aP9[0];
      this.aP9 = aP9;
      pgenpar.this.AV21BarCodLan = aP10[0];
      this.aP10 = aP10;
      pgenpar.this.AV22ConStk = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV46TinEst ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int2) ;
      pgenpar.this.GXt_int1 = GXv_int2[0] ;
      AV46TinEst = GXt_int1 ;
      GXt_int1 = AV47CmpKil ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CMPKIL", ""), GXv_int2) ;
      pgenpar.this.GXt_int1 = GXv_int2[0] ;
      AV47CmpKil = GXt_int1 ;
      GXt_int3 = (int)(AV45DesEst) ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DESEST", ""), GXv_int4) ;
      pgenpar.this.GXt_int3 = GXv_int4[0] ;
      AV45DesEst = GXt_int3 ;
      GXt_int1 = AV66PLinea ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int2) ;
      pgenpar.this.GXt_int1 = GXv_int2[0] ;
      AV66PLinea = GXt_int1 ;
      GXt_int1 = AV81AgrEst ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AGREST", ""), GXv_int2) ;
      pgenpar.this.GXt_int1 = GXv_int2[0] ;
      AV81AgrEst = GXt_int1 ;
      GXt_int3 = AV76Color_Pas ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLPAS", ""), GXv_int4) ;
      pgenpar.this.GXt_int3 = GXv_int4[0] ;
      AV76Color_Pas = GXt_int3 ;
      /* Using cursor P028I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P028I2_A252CliCod[0] ;
         n252CliCod = P028I2_n252CliCod[0] ;
         A212BarSer = P028I2_A212BarSer[0] ;
         A1798BarDibCli = P028I2_A1798BarDibCli[0] ;
         A1799BarDibInt = P028I2_A1799BarDibInt[0] ;
         A213BarSit = P028I2_A213BarSit[0] ;
         A120BarAgrEst = P028I2_A120BarAgrEst[0] ;
         A4400BarSitEst = P028I2_A4400BarSitEst[0] ;
         AV25BarSer = A212BarSer ;
         AV23BarDibCli = A1798BarDibCli ;
         AV24BarDibInt = A1799BarDibInt ;
         AV33CliCod = A252CliCod ;
         /* Execute user subroutine: 'TIPMAQ' */
         S141 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV26RecMolLin = (byte)(0) ;
         /* Using cursor P028I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV25BarSer, AV23BarDibCli, Integer.valueOf(AV24BarDibInt), AV16DisComCod, AV17FonCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2076ColEstMba = P028I3_A2076ColEstMba[0] ;
            n2076ColEstMba = P028I3_n2076ColEstMba[0] ;
            A2078ColFon = P028I3_A2078ColFon[0] ;
            A2074ColCom = P028I3_A2074ColCom[0] ;
            A1014DibInt = P028I3_A1014DibInt[0] ;
            A1013DibCli = P028I3_A1013DibCli[0] ;
            A2141SerEst = P028I3_A2141SerEst[0] ;
            /* Using cursor P028I4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2648MolForEst = P028I4_A2648MolForEst[0] ;
               n2648MolForEst = P028I4_n2648MolForEst[0] ;
               A2098MolCod = P028I4_A2098MolCod[0] ;
               A2100MolCon = P028I4_A2100MolCon[0] ;
               n2100MolCon = P028I4_n2100MolCon[0] ;
               A2650MolPesMin = P028I4_A2650MolPesMin[0] ;
               n2650MolPesMin = P028I4_n2650MolPesMin[0] ;
               AV27ColEstMba = A2076ColEstMba ;
               AV28MolCon = A2100MolCon ;
               AV40MolPesMin = A2650MolPesMin ;
               AV71ParteColor = (byte)(0) ;
               AV72PartePasta = (byte)(0) ;
               /* Optimized group. */
               /* Using cursor P028I5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
               c6046PrdForPar = (byte)((byte)(P028I5_A6046PrdForPar[0])) ;
               n6046PrdForPar = P028I5_n6046PrdForPar[0] ;
               pr_default.close(3);
               AV71ParteColor = (byte)(AV71ParteColor+c6046PrdForPar) ;
               /* End optimized group. */
               /* Optimized group. */
               /* Using cursor P028I6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
               c6043PasForPar = (byte)((byte)(P028I6_A6043PasForPar[0])) ;
               n6043PasForPar = P028I6_n6043PasForPar[0] ;
               pr_default.close(4);
               AV72PartePasta = (byte)(AV72PartePasta+c6043PasForPar) ;
               /* End optimized group. */
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27ColEstMba)==0) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28MolCon)==0) )
                  {
                     AV29KilPas = AV18RepComMtr.multiply(A2650MolPesMin).divide(AV27ColEstMba, 18, java.math.RoundingMode.DOWN).add(DecimalUtil.doubleToDec(AV45DesEst)) ;
                  }
                  else
                  {
                     AV29KilPas = AV18RepComMtr.multiply(AV28MolCon).divide(AV27ColEstMba, 18, java.math.RoundingMode.DOWN).add(DecimalUtil.doubleToDec(AV45DesEst)) ;
                  }
                  if ( DecimalUtil.compareTo(AV29KilPas, AV40MolPesMin) < 0 )
                  {
                     AV29KilPas = AV40MolPesMin ;
                  }
               }
               else
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV38Molde = A2098MolCod ;
               /* Execute user subroutine: 'NOMMOL' */
               S151 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /*
                  INSERT RECORD ON TABLE TXPRECMOL

               */
               A2524DisComLin = AV15DisComLin ;
               A1056DisComCod = A2074ColCom ;
               A1032FonCod = A2078ColFon ;
               A2124RecMolCod = A2098MolCod ;
               if ( GXutil.strcmp(A2648MolForEst, httpContext.getMessage( "N", "")) == 0 )
               {
                  A2127RecMolNom = httpContext.getMessage( "Inactivo", "") ;
                  n2127RecMolNom = false ;
               }
               else
               {
                  A2127RecMolNom = AV37MolDib ;
                  n2127RecMolNom = false ;
               }
               A2128RecMolRep = httpContext.getMessage( "N", "") ;
               n2128RecMolRep = false ;
               A5103RecMolCns = httpContext.getMessage( "N", "") ;
               n5103RecMolCns = false ;
               A5102RecMolMtr = DecimalUtil.doubleToDec(0) ;
               n5102RecMolMtr = false ;
               /* Using cursor P028I7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Boolean.valueOf(n2127RecMolNom), A2127RecMolNom, Boolean.valueOf(n2128RecMolRep), A2128RecMolRep, Boolean.valueOf(n5102RecMolMtr), A5102RecMolMtr, Boolean.valueOf(n5103RecMolCns), A5103RecMolCns});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMOL");
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
               AV26RecMolLin = (byte)(AV26RecMolLin+1) ;
               AV67ColorMolde = DecimalUtil.doubleToDec(0) ;
               AV73TotalColor = DecimalUtil.doubleToDec(0) ;
               if ( GXutil.strcmp(A2648MolForEst, httpContext.getMessage( "S", "")) == 0 )
               {
                  /* Using cursor P028I8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A6046PrdForPar = P028I8_A6046PrdForPar[0] ;
                     n6046PrdForPar = P028I8_n6046PrdForPar[0] ;
                     A2116PrdForCan = P028I8_A2116PrdForCan[0] ;
                     n2116PrdForCan = P028I8_n2116PrdForCan[0] ;
                     A719PrdNum = P028I8_A719PrdNum[0] ;
                     n719PrdNum = P028I8_n719PrdNum[0] ;
                     A2144UniEstCod = P028I8_A2144UniEstCod[0] ;
                     n2144UniEstCod = P028I8_n2144UniEstCod[0] ;
                     A724PrdPreAct = P028I8_A724PrdPreAct[0] ;
                     A2535ForPrdLin = P028I8_A2535ForPrdLin[0] ;
                     A724PrdPreAct = P028I8_A724PrdPreAct[0] ;
                     AV30RecEstCP = GXutil.roundDecimal( (((AV29KilPas.multiply(DecimalUtil.doubleToDec(AV76Color_Pas))).divide(DecimalUtil.doubleToDec(AV72PartePasta), 18, java.math.RoundingMode.DOWN)).divide(DecimalUtil.doubleToDec(AV71ParteColor), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A6046PrdForPar)), 2) ;
                     AV73TotalColor = AV73TotalColor.add(AV30RecEstCP) ;
                     AV62RecEstGK = A2116PrdForCan ;
                     AV49PrdNum = A719PrdNum ;
                     GXv_char5[0] = A396EmprCod ;
                     GXv_char6[0] = AV49PrdNum ;
                     GXv_decimal7[0] = AV30RecEstCP ;
                     GXv_char8[0] = A2144UniEstCod ;
                     new app.palttes(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_decimal7, GXv_char8) ;
                     pgenpar.this.A396EmprCod = GXv_char5[0] ;
                     pgenpar.this.AV49PrdNum = GXv_char6[0] ;
                     pgenpar.this.AV30RecEstCP = GXv_decimal7[0] ;
                     pgenpar.this.A2144UniEstCod = GXv_char8[0] ;
                     AV67ColorMolde = AV67ColorMolde.add(AV62RecEstGK) ;
                     AV50ColCom = A2074ColCom ;
                     AV51ColFon = A2078ColFon ;
                     AV52MolCod1 = A2098MolCod ;
                     AV53ForPrdLin = A2535ForPrdLin ;
                     AV54UniEstCod = A2144UniEstCod ;
                     AV55PrdForCan = A2116PrdForCan ;
                     AV58PrdPreMed = A724PrdPreAct ;
                     AV69RecEstPar = A6046PrdForPar ;
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29KilPas)==0) )
                     {
                        AV80RecEstCosK = ((AV30RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(AV58PrdPreMed)).divide(AV29KilPas, 18, java.math.RoundingMode.DOWN) ;
                     }
                     /* Execute user subroutine: 'CREAR_LINEA_PROD' */
                     S161 ();
                     if ( returnInSub )
                     {
                        pr_default.close(6);
                        pr_default.close(6);
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     /* Execute user subroutine: 'ACTUALIZAR_RESERVA_PROD' */
                     S1314 ();
                     if ( returnInSub )
                     {
                        pr_default.close(6);
                        pr_default.close(6);
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     pr_default.readNext(6);
                  }
                  pr_default.close(6);
                  /* Using cursor P028I9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A2654PasForLin = P028I9_A2654PasForLin[0] ;
                     A2107PasCod = P028I9_A2107PasCod[0] ;
                     n2107PasCod = P028I9_n2107PasCod[0] ;
                     A2109PasForCan = P028I9_A2109PasForCan[0] ;
                     n2109PasForCan = P028I9_n2109PasForCan[0] ;
                     A6043PasForPar = P028I9_A6043PasForPar[0] ;
                     n6043PasForPar = P028I9_n6043PasForPar[0] ;
                     /* Using cursor P028I10 */
                     pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
                     A2656PasTotRes = P028I10_A2656PasTotRes[0] ;
                     n2656PasTotRes = P028I10_n2656PasTotRes[0] ;
                     AV31PasCod = A2107PasCod ;
                     AV34MolCod = A2098MolCod ;
                     AV35PasForLin = A2654PasForLin ;
                     AV39PasForCan = A2109PasForCan ;
                     AV77RecPasCanP = GXutil.roundDecimal( (AV29KilPas.divide(DecimalUtil.doubleToDec(AV72PartePasta), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(A6043PasForPar)), 2) ;
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29KilPas)==0) )
                     {
                        AV42RecPasCan = GXutil.roundDecimal( AV77RecPasCanP.multiply(((AV29KilPas.subtract((AV73TotalColor.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)))).divide(AV29KilPas, 18, java.math.RoundingMode.DOWN))), 2) ;
                     }
                     AV63RecPasGK = AV39PasForCan ;
                     AV70RecPasPar = A6043PasForPar ;
                     if ( GXutil.strcmp(AV22ConStk, httpContext.getMessage( "S", "")) == 0 )
                     {
                        A2656PasTotRes = A2656PasTotRes.add(AV42RecPasCan) ;
                        n2656PasTotRes = false ;
                     }
                     /* Execute user subroutine: 'MODRES' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(8);
                        pr_default.close(7);
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     /*
                        INSERT RECORD ON TABLE TXPRECPAS

                     */
                     A2524DisComLin = AV15DisComLin ;
                     A1056DisComCod = A2074ColCom ;
                     A1032FonCod = A2078ColFon ;
                     A2124RecMolCod = A2098MolCod ;
                     A2672RecPasLin = A2654PasForLin ;
                     A2132RecPasCan = AV42RecPasCan ;
                     n2132RecPasCan = false ;
                     A2133RecPasGK = AV63RecPasGK ;
                     n2133RecPasGK = false ;
                     A6064RecPasPar = AV70RecPasPar ;
                     n6064RecPasPar = false ;
                     A5108RecPasCPPa = DecimalUtil.doubleToDec(0) ;
                     n5108RecPasCPPa = false ;
                     /* Using cursor P028I11 */
                     pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin), Boolean.valueOf(n2107PasCod), A2107PasCod, Boolean.valueOf(n2132RecPasCan), A2132RecPasCan, Boolean.valueOf(n2133RecPasGK), A2133RecPasGK, Boolean.valueOf(n5108RecPasCPPa), A5108RecPasCPPa, Boolean.valueOf(n6064RecPasPar), Short.valueOf(A6064RecPasPar)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPAS");
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
                     /* End Insert */
                     /* Using cursor P028I12 */
                     pr_default.execute(10, new Object[] {Boolean.valueOf(n2656PasTotRes), A2656PasTotRes, A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPASTA");
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
                  pr_default.close(8);
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P028I13 */
            pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A2095ForObsLin = P028I13_A2095ForObsLin[0] ;
               A2096ForObsTxt = P028I13_A2096ForObsTxt[0] ;
               n2096ForObsTxt = P028I13_n2096ForObsTxt[0] ;
               /*
                  INSERT RECORD ON TABLE TXPRECOBS

               */
               A2524DisComLin = AV15DisComLin ;
               A1056DisComCod = A2074ColCom ;
               A1032FonCod = A2078ColFon ;
               A2129RecObsLin = A2095ForObsLin ;
               A2130RecObsTxt = A2096ForObsTxt ;
               n2130RecObsTxt = false ;
               /* Using cursor P028I14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2129RecObsLin), Boolean.valueOf(n2130RecObsTxt), A2130RecObsTxt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECOBS");
               if ( (pr_default.getStatus(12) == 1) )
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
               AV41RecObsULin = A2095ForObsLin ;
               pr_default.readNext(11);
            }
            pr_default.close(11);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27ColEstMba)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay metros base", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P028I15 */
            pr_default.execute(13, new Object[] {Byte.valueOf(A213BarSit), Byte.valueOf(A4400BarSitEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            if (true) break;
         }
         else
         {
            /* Using cursor P028I16 */
            pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(AV15DisComLin), AV16DisComCod, AV17FonCod});
            while ( (pr_default.getStatus(14) != 101) )
            {
               A1032FonCod = P028I16_A1032FonCod[0] ;
               A1056DisComCod = P028I16_A1056DisComCod[0] ;
               A2524DisComLin = P028I16_A2524DisComLin[0] ;
               A2070BarFecEst = P028I16_A2070BarFecEst[0] ;
               n2070BarFecEst = P028I16_n2070BarFecEst[0] ;
               A2073BarNumMol = P028I16_A2073BarNumMol[0] ;
               n2073BarNumMol = P028I16_n2073BarNumMol[0] ;
               A2117RecEstAnh = P028I16_A2117RecEstAnh[0] ;
               n2117RecEstAnh = P028I16_n2117RecEstAnh[0] ;
               A2122RecEstTMaq = P028I16_A2122RecEstTMaq[0] ;
               n2122RecEstTMaq = P028I16_n2122RecEstTMaq[0] ;
               A2069BarComEst = P028I16_A2069BarComEst[0] ;
               n2069BarComEst = P028I16_n2069BarComEst[0] ;
               A2509BarCodLan = P028I16_A2509BarCodLan[0] ;
               n2509BarCodLan = P028I16_n2509BarCodLan[0] ;
               A2510BarComPri = P028I16_A2510BarComPri[0] ;
               n2510BarComPri = P028I16_n2510BarComPri[0] ;
               A2131RecObsULin = P028I16_A2131RecObsULin[0] ;
               n2131RecObsULin = P028I16_n2131RecObsULin[0] ;
               A2070BarFecEst = GXutil.today( ) ;
               n2070BarFecEst = false ;
               A2073BarNumMol = AV26RecMolLin ;
               n2073BarNumMol = false ;
               A2117RecEstAnh = AV19RecEstAnh ;
               n2117RecEstAnh = false ;
               A2122RecEstTMaq = AV32DibTipMaq ;
               n2122RecEstTMaq = false ;
               A2069BarComEst = httpContext.getMessage( "S", "") ;
               n2069BarComEst = false ;
               A2509BarCodLan = AV21BarCodLan ;
               n2509BarCodLan = false ;
               A2510BarComPri = AV20Principal ;
               n2510BarComPri = false ;
               A2131RecObsULin = AV41RecObsULin ;
               n2131RecObsULin = false ;
               /* Using cursor P028I17 */
               pr_default.execute(15, new Object[] {Boolean.valueOf(n2070BarFecEst), A2070BarFecEst, Boolean.valueOf(n2073BarNumMol), Short.valueOf(A2073BarNumMol), Boolean.valueOf(n2117RecEstAnh), Short.valueOf(A2117RecEstAnh), Boolean.valueOf(n2122RecEstTMaq), A2122RecEstTMaq, Boolean.valueOf(n2069BarComEst), A2069BarComEst, Boolean.valueOf(n2509BarCodLan), Integer.valueOf(A2509BarCodLan), Boolean.valueOf(n2510BarComPri), A2510BarComPri, Boolean.valueOf(n2131RecObsULin), Byte.valueOf(A2131RecObsULin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(14);
            if ( AV46TinEst == 0 )
            {
               A213BarSit = (byte)(4) ;
               AV85BarAgrEst = A120BarAgrEst ;
               if ( AV66PLinea == 1 )
               {
                  A213BarSit = (byte)(4) ;
                  A4400BarSitEst = (byte)(4) ;
               }
            }
            else
            {
               A4400BarSitEst = (byte)(4) ;
            }
         }
         /* Using cursor P028I18 */
         pr_default.execute(16, new Object[] {Byte.valueOf(A213BarSit), Byte.valueOf(A4400BarSitEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV85BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && ( AV81AgrEst == 1 ) )
      {
         GXv_char8[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int2[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_int9[0] = AV15DisComLin ;
         GXv_char5[0] = AV16DisComCod ;
         GXv_char10[0] = AV17FonCod ;
         GXv_int11[0] = AV26RecMolLin ;
         GXv_int12[0] = AV19RecEstAnh ;
         GXv_char13[0] = AV32DibTipMaq ;
         GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int14[0] = (byte)(1) ;
         new app.pgenagp(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int2, GXv_char6, GXv_int9, GXv_char5, GXv_char10, GXv_int11, GXv_int12, GXv_char13, GXv_decimal7, GXv_int14) ;
         pgenpar.this.A396EmprCod = GXv_char8[0] ;
         pgenpar.this.A129BarCod = GXv_int4[0] ;
         pgenpar.this.A132BarCodReo = GXv_int2[0] ;
         pgenpar.this.A130BarCodPar = GXv_char6[0] ;
         pgenpar.this.AV15DisComLin = GXv_int9[0] ;
         pgenpar.this.AV16DisComCod = GXv_char5[0] ;
         pgenpar.this.AV17FonCod = GXv_char10[0] ;
         pgenpar.this.AV26RecMolLin = GXv_int11[0] ;
         pgenpar.this.AV19RecEstAnh = GXv_int12[0] ;
         pgenpar.this.AV32DibTipMaq = GXv_char13[0] ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'MODRES' Routine */
      returnInSub = false ;
      AV36RecPasPLi = (short)(0) ;
      /* Using cursor P028I19 */
      pr_default.execute(17, new Object[] {A396EmprCod, AV31PasCod});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A2107PasCod = P028I19_A2107PasCod[0] ;
         n2107PasCod = P028I19_n2107PasCod[0] ;
         A2106PasCanPrd = P028I19_A2106PasCanPrd[0] ;
         n2106PasCanPrd = P028I19_n2106PasCanPrd[0] ;
         A2144UniEstCod = P028I19_A2144UniEstCod[0] ;
         n2144UniEstCod = P028I19_n2144UniEstCod[0] ;
         A726PrdPreMed = P028I19_A726PrdPreMed[0] ;
         A719PrdNum = P028I19_A719PrdNum[0] ;
         n719PrdNum = P028I19_n719PrdNum[0] ;
         A726PrdPreMed = P028I19_A726PrdPreMed[0] ;
         AV36RecPasPLi = (short)(AV36RecPasPLi+1) ;
         AV56RecPasCP = AV42RecPasCan.multiply(A2106PasCanPrd) ;
         AV57PasCanPrd = A2106PasCanPrd ;
         AV49PrdNum = A719PrdNum ;
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = AV49PrdNum ;
         GXv_decimal7[0] = AV56RecPasCP ;
         GXv_char8[0] = A2144UniEstCod ;
         new app.palttes(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_decimal7, GXv_char8) ;
         pgenpar.this.A396EmprCod = GXv_char13[0] ;
         pgenpar.this.AV49PrdNum = GXv_char10[0] ;
         pgenpar.this.AV56RecPasCP = GXv_decimal7[0] ;
         pgenpar.this.A2144UniEstCod = GXv_char8[0] ;
         AV30RecEstCP = AV56RecPasCP ;
         AV54UniEstCod = A2144UniEstCod ;
         AV79RecPasPK = A2106PasCanPrd ;
         AV59PasPreMed = AV59PasPreMed.add((A2106PasCanPrd.multiply(A726PrdPreMed).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
         /* Execute user subroutine: 'CREAR_LINEA_PAS' */
         S1214 ();
         if ( returnInSub )
         {
            pr_default.close(17);
            pr_default.close(17);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'ACTUALIZAR_RESERVA_PROD' */
         S1314 ();
         if ( returnInSub )
         {
            pr_default.close(17);
            pr_default.close(17);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(17);
      }
      pr_default.close(17);
      n2679RecPasUL = false ;
      /* Optimized UPDATE. */
      /* Using cursor P028I20 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n2679RecPasUL), Short.valueOf(AV36RecPasPLi), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(AV15DisComLin), AV16DisComCod, AV17FonCod, Byte.valueOf(AV34MolCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMOL");
      /* End optimized UPDATE. */
   }

   public void S141( )
   {
      /* 'TIPMAQ' Routine */
      returnInSub = false ;
      /* Using cursor P028I21 */
      pr_default.execute(19, new Object[] {A396EmprCod, AV23BarDibCli, Integer.valueOf(AV33CliCod), Integer.valueOf(AV24BarDibInt)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A1014DibInt = P028I21_A1014DibInt[0] ;
         A1013DibCli = P028I21_A1013DibCli[0] ;
         A252CliCod = P028I21_A252CliCod[0] ;
         n252CliCod = P028I21_n252CliCod[0] ;
         A1823DibTipMaq = P028I21_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P028I21_n1823DibTipMaq[0] ;
         AV32DibTipMaq = A1823DibTipMaq ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
   }

   public void S151( )
   {
      /* 'NOMMOL' Routine */
      returnInSub = false ;
      AV37MolDib = "" ;
      /* Using cursor P028I22 */
      pr_default.execute(20, new Object[] {A396EmprCod, AV23BarDibCli, Integer.valueOf(AV33CliCod), Integer.valueOf(AV24BarDibInt)});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A1014DibInt = P028I22_A1014DibInt[0] ;
         A252CliCod = P028I22_A252CliCod[0] ;
         n252CliCod = P028I22_n252CliCod[0] ;
         A1013DibCli = P028I22_A1013DibCli[0] ;
         A1823DibTipMaq = P028I22_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P028I22_n1823DibTipMaq[0] ;
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
         {
            /* Using cursor P028I23 */
            pr_default.execute(21, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Byte.valueOf(AV38Molde)});
            while ( (pr_default.getStatus(21) != 101) )
            {
               A2088DibDibMol = P028I23_A2088DibDibMol[0] ;
               n2088DibDibMol = P028I23_n2088DibDibMol[0] ;
               A2092DibRelMC2 = P028I23_A2092DibRelMC2[0] ;
               n2092DibRelMC2 = P028I23_n2092DibRelMC2[0] ;
               A1029DibLin = P028I23_A1029DibLin[0] ;
               AV37MolDib = A2092DibRelMC2 ;
               pr_default.readNext(21);
            }
            pr_default.close(21);
         }
         else
         {
            if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
            {
               /* Using cursor P028I24 */
               pr_default.execute(22, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Byte.valueOf(AV38Molde)});
               while ( (pr_default.getStatus(22) != 101) )
               {
                  A2089DibLinMol = P028I24_A2089DibLinMol[0] ;
                  n2089DibLinMol = P028I24_n2089DibLinMol[0] ;
                  A1030DibRelMC = P028I24_A1030DibRelMC[0] ;
                  n1030DibRelMC = P028I24_n1030DibRelMC[0] ;
                  A1807DibLinCil = P028I24_A1807DibLinCil[0] ;
                  AV37MolDib = A1030DibRelMC ;
                  pr_default.readNext(22);
               }
               pr_default.close(22);
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
   }

   public void S161( )
   {
      /* 'CREAR_LINEA_PROD' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPRECPRD

      */
      A719PrdNum = AV49PrdNum ;
      n719PrdNum = false ;
      A2524DisComLin = AV15DisComLin ;
      A1056DisComCod = AV50ColCom ;
      A1032FonCod = AV51ColFon ;
      A2124RecMolCod = AV52MolCod1 ;
      A2126RecMolLin = (byte)(AV53ForPrdLin) ;
      A2134RecUniCod = AV54UniEstCod ;
      n2134RecUniCod = false ;
      A2119RecEstCP = AV30RecEstCP ;
      n2119RecEstCP = false ;
      A2120RecEstGK = AV62RecEstGK ;
      n2120RecEstGK = false ;
      A6063RecEstPar = AV69RecEstPar ;
      n6063RecEstPar = false ;
      A5105RecEstCPPa = DecimalUtil.doubleToDec(0) ;
      n5105RecEstCPPa = false ;
      A5106RecEstCosK = AV80RecEstCosK ;
      n5106RecEstCosK = false ;
      /* Using cursor P028I25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Byte.valueOf(A2126RecMolLin), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2134RecUniCod), A2134RecUniCod, Boolean.valueOf(n2120RecEstGK), A2120RecEstGK, Boolean.valueOf(n2119RecEstCP), A2119RecEstCP, Boolean.valueOf(n5105RecEstCPPa), A5105RecEstCPPa, Boolean.valueOf(n5106RecEstCosK), A5106RecEstCosK, Boolean.valueOf(n6063RecEstPar), Short.valueOf(A6063RecEstPar)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPRD");
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
      /* End Insert */
   }

   public void S1214( )
   {
      /* 'CREAR_LINEA_PAS' Routine */
      returnInSub = false ;
      /* Using cursor P028I26 */
      pr_default.execute(24, new Object[] {A396EmprCod, AV49PrdNum});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A719PrdNum = P028I26_A719PrdNum[0] ;
         n719PrdNum = P028I26_n719PrdNum[0] ;
         A724PrdPreAct = P028I26_A724PrdPreAct[0] ;
         AV64PrdPreAct = A724PrdPreAct ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(24);
      /*
         INSERT RECORD ON TABLE TXPRECDEP

      */
      A719PrdNum = AV49PrdNum ;
      n719PrdNum = false ;
      A2524DisComLin = AV15DisComLin ;
      A1056DisComCod = AV16DisComCod ;
      A1032FonCod = AV17FonCod ;
      A2124RecMolCod = AV34MolCod ;
      A2672RecPasLin = AV35PasForLin ;
      A2675RecPasPLi = AV36RecPasPLi ;
      A2678RecPasUC = AV54UniEstCod ;
      n2678RecPasUC = false ;
      A2674RecPasPK = AV79RecPasPK ;
      n2674RecPasPK = false ;
      A2670RecPasCP = AV30RecEstCP ;
      n2670RecPasCP = false ;
      A5470RecPasPre = AV64PrdPreAct ;
      n5470RecPasPre = false ;
      /* Using cursor P028I27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin), Short.valueOf(A2675RecPasPLi), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2678RecPasUC), A2678RecPasUC, Boolean.valueOf(n2674RecPasPK), A2674RecPasPK, Boolean.valueOf(n2670RecPasCP), A2670RecPasCP, Boolean.valueOf(n5470RecPasPre), A5470RecPasPre});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECDEP");
      if ( (pr_default.getStatus(25) == 1) )
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

   public void S1314( )
   {
      /* 'ACTUALIZAR_RESERVA_PROD' Routine */
      returnInSub = false ;
      /* Using cursor P028I28 */
      pr_default.execute(26, new Object[] {A396EmprCod, AV49PrdNum});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A719PrdNum = P028I28_A719PrdNum[0] ;
         n719PrdNum = P028I28_n719PrdNum[0] ;
         A707PrdFacCon = P028I28_A707PrdFacCon[0] ;
         A685PrdCanRes = P028I28_A685PrdCanRes[0] ;
         if ( GXutil.strcmp(AV22ConStk, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(AV54UniEstCod, httpContext.getMessage( "GRS", "")) == 0 )
            {
               AV30RecEstCP = AV30RecEstCP.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
            A685PrdCanRes = A685PrdCanRes.add((A707PrdFacCon.multiply(AV30RecEstCP))) ;
         }
         /* Using cursor P028I29 */
         pr_default.execute(27, new Object[] {A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(26);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgenpar.this.A396EmprCod;
      this.aP1[0] = pgenpar.this.A129BarCod;
      this.aP2[0] = pgenpar.this.A132BarCodReo;
      this.aP3[0] = pgenpar.this.A130BarCodPar;
      this.aP4[0] = pgenpar.this.AV15DisComLin;
      this.aP5[0] = pgenpar.this.AV16DisComCod;
      this.aP6[0] = pgenpar.this.AV17FonCod;
      this.aP7[0] = pgenpar.this.AV18RepComMtr;
      this.aP8[0] = pgenpar.this.AV19RecEstAnh;
      this.aP9[0] = pgenpar.this.AV20Principal;
      this.aP10[0] = pgenpar.this.AV21BarCodLan;
      this.aP11[0] = pgenpar.this.AV22ConStk;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgenpar");
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
      P028I2_A396EmprCod = new String[] {""} ;
      P028I2_A129BarCod = new int[1] ;
      P028I2_A132BarCodReo = new byte[1] ;
      P028I2_A130BarCodPar = new String[] {""} ;
      P028I2_A252CliCod = new int[1] ;
      P028I2_n252CliCod = new boolean[] {false} ;
      P028I2_A212BarSer = new String[] {""} ;
      P028I2_A1798BarDibCli = new String[] {""} ;
      P028I2_A1799BarDibInt = new int[1] ;
      P028I2_A213BarSit = new byte[1] ;
      P028I2_A120BarAgrEst = new String[] {""} ;
      P028I2_A4400BarSitEst = new byte[1] ;
      A212BarSer = "" ;
      A1798BarDibCli = "" ;
      A120BarAgrEst = "" ;
      AV25BarSer = "" ;
      AV23BarDibCli = "" ;
      P028I3_A396EmprCod = new String[] {""} ;
      P028I3_A252CliCod = new int[1] ;
      P028I3_n252CliCod = new boolean[] {false} ;
      P028I3_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I3_n2076ColEstMba = new boolean[] {false} ;
      P028I3_A2078ColFon = new String[] {""} ;
      P028I3_A2074ColCom = new String[] {""} ;
      P028I3_A1014DibInt = new int[1] ;
      P028I3_A1013DibCli = new String[] {""} ;
      P028I3_A2141SerEst = new String[] {""} ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      P028I4_A396EmprCod = new String[] {""} ;
      P028I4_A252CliCod = new int[1] ;
      P028I4_n252CliCod = new boolean[] {false} ;
      P028I4_A2141SerEst = new String[] {""} ;
      P028I4_A1013DibCli = new String[] {""} ;
      P028I4_A1014DibInt = new int[1] ;
      P028I4_A2074ColCom = new String[] {""} ;
      P028I4_A2078ColFon = new String[] {""} ;
      P028I4_A2648MolForEst = new String[] {""} ;
      P028I4_n2648MolForEst = new boolean[] {false} ;
      P028I4_A2098MolCod = new byte[1] ;
      P028I4_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I4_n2100MolCon = new boolean[] {false} ;
      P028I4_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I4_n2650MolPesMin = new boolean[] {false} ;
      A2648MolForEst = "" ;
      A2100MolCon = DecimalUtil.ZERO ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      AV27ColEstMba = DecimalUtil.ZERO ;
      AV28MolCon = DecimalUtil.ZERO ;
      AV40MolPesMin = DecimalUtil.ZERO ;
      P028I5_A6046PrdForPar = new short[1] ;
      P028I5_n6046PrdForPar = new boolean[] {false} ;
      P028I6_A6043PasForPar = new short[1] ;
      P028I6_n6043PasForPar = new boolean[] {false} ;
      AV29KilPas = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A2127RecMolNom = "" ;
      AV37MolDib = "" ;
      A2128RecMolRep = "" ;
      A5103RecMolCns = "" ;
      A5102RecMolMtr = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV67ColorMolde = DecimalUtil.ZERO ;
      AV73TotalColor = DecimalUtil.ZERO ;
      P028I8_A396EmprCod = new String[] {""} ;
      P028I8_A252CliCod = new int[1] ;
      P028I8_n252CliCod = new boolean[] {false} ;
      P028I8_A2141SerEst = new String[] {""} ;
      P028I8_A1013DibCli = new String[] {""} ;
      P028I8_A1014DibInt = new int[1] ;
      P028I8_A2074ColCom = new String[] {""} ;
      P028I8_A2078ColFon = new String[] {""} ;
      P028I8_A2098MolCod = new byte[1] ;
      P028I8_A6046PrdForPar = new short[1] ;
      P028I8_n6046PrdForPar = new boolean[] {false} ;
      P028I8_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I8_n2116PrdForCan = new boolean[] {false} ;
      P028I8_A719PrdNum = new String[] {""} ;
      P028I8_n719PrdNum = new boolean[] {false} ;
      P028I8_A2144UniEstCod = new String[] {""} ;
      P028I8_n2144UniEstCod = new boolean[] {false} ;
      P028I8_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I8_A2535ForPrdLin = new short[1] ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A2144UniEstCod = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV30RecEstCP = DecimalUtil.ZERO ;
      AV62RecEstGK = DecimalUtil.ZERO ;
      AV49PrdNum = "" ;
      AV50ColCom = "" ;
      AV51ColFon = "" ;
      AV54UniEstCod = "" ;
      AV55PrdForCan = DecimalUtil.ZERO ;
      AV58PrdPreMed = DecimalUtil.ZERO ;
      AV80RecEstCosK = DecimalUtil.ZERO ;
      P028I9_A396EmprCod = new String[] {""} ;
      P028I9_A252CliCod = new int[1] ;
      P028I9_n252CliCod = new boolean[] {false} ;
      P028I9_A2141SerEst = new String[] {""} ;
      P028I9_A1013DibCli = new String[] {""} ;
      P028I9_A1014DibInt = new int[1] ;
      P028I9_A2074ColCom = new String[] {""} ;
      P028I9_A2078ColFon = new String[] {""} ;
      P028I9_A2098MolCod = new byte[1] ;
      P028I9_A2654PasForLin = new short[1] ;
      P028I9_A2107PasCod = new String[] {""} ;
      P028I9_n2107PasCod = new boolean[] {false} ;
      P028I9_A2109PasForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I9_n2109PasForCan = new boolean[] {false} ;
      P028I9_A6043PasForPar = new short[1] ;
      P028I9_n6043PasForPar = new boolean[] {false} ;
      A2107PasCod = "" ;
      A2109PasForCan = DecimalUtil.ZERO ;
      P028I10_A2656PasTotRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I10_n2656PasTotRes = new boolean[] {false} ;
      A2656PasTotRes = DecimalUtil.ZERO ;
      AV31PasCod = "" ;
      AV39PasForCan = DecimalUtil.ZERO ;
      AV77RecPasCanP = DecimalUtil.ZERO ;
      AV42RecPasCan = DecimalUtil.ZERO ;
      AV63RecPasGK = DecimalUtil.ZERO ;
      A2132RecPasCan = DecimalUtil.ZERO ;
      A2133RecPasGK = DecimalUtil.ZERO ;
      A5108RecPasCPPa = DecimalUtil.ZERO ;
      P028I13_A396EmprCod = new String[] {""} ;
      P028I13_A252CliCod = new int[1] ;
      P028I13_n252CliCod = new boolean[] {false} ;
      P028I13_A2141SerEst = new String[] {""} ;
      P028I13_A1013DibCli = new String[] {""} ;
      P028I13_A1014DibInt = new int[1] ;
      P028I13_A2074ColCom = new String[] {""} ;
      P028I13_A2078ColFon = new String[] {""} ;
      P028I13_A2095ForObsLin = new byte[1] ;
      P028I13_A2096ForObsTxt = new String[] {""} ;
      P028I13_n2096ForObsTxt = new boolean[] {false} ;
      A2096ForObsTxt = "" ;
      A2130RecObsTxt = "" ;
      P028I16_A396EmprCod = new String[] {""} ;
      P028I16_A129BarCod = new int[1] ;
      P028I16_A132BarCodReo = new byte[1] ;
      P028I16_A130BarCodPar = new String[] {""} ;
      P028I16_A1032FonCod = new String[] {""} ;
      P028I16_A1056DisComCod = new String[] {""} ;
      P028I16_A2524DisComLin = new byte[1] ;
      P028I16_A2070BarFecEst = new java.util.Date[] {GXutil.nullDate()} ;
      P028I16_n2070BarFecEst = new boolean[] {false} ;
      P028I16_A2073BarNumMol = new short[1] ;
      P028I16_n2073BarNumMol = new boolean[] {false} ;
      P028I16_A2117RecEstAnh = new short[1] ;
      P028I16_n2117RecEstAnh = new boolean[] {false} ;
      P028I16_A2122RecEstTMaq = new String[] {""} ;
      P028I16_n2122RecEstTMaq = new boolean[] {false} ;
      P028I16_A2069BarComEst = new String[] {""} ;
      P028I16_n2069BarComEst = new boolean[] {false} ;
      P028I16_A2509BarCodLan = new int[1] ;
      P028I16_n2509BarCodLan = new boolean[] {false} ;
      P028I16_A2510BarComPri = new String[] {""} ;
      P028I16_n2510BarComPri = new boolean[] {false} ;
      P028I16_A2131RecObsULin = new byte[1] ;
      P028I16_n2131RecObsULin = new boolean[] {false} ;
      A2070BarFecEst = GXutil.nullDate() ;
      A2122RecEstTMaq = "" ;
      A2069BarComEst = "" ;
      A2510BarComPri = "" ;
      AV32DibTipMaq = "" ;
      AV85BarAgrEst = "" ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int12 = new short[1] ;
      GXv_int14 = new byte[1] ;
      P028I19_A396EmprCod = new String[] {""} ;
      P028I19_A2107PasCod = new String[] {""} ;
      P028I19_n2107PasCod = new boolean[] {false} ;
      P028I19_A2106PasCanPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I19_n2106PasCanPrd = new boolean[] {false} ;
      P028I19_A2144UniEstCod = new String[] {""} ;
      P028I19_n2144UniEstCod = new boolean[] {false} ;
      P028I19_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I19_A719PrdNum = new String[] {""} ;
      P028I19_n719PrdNum = new boolean[] {false} ;
      A2106PasCanPrd = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      AV56RecPasCP = DecimalUtil.ZERO ;
      AV57PasCanPrd = DecimalUtil.ZERO ;
      GXv_char13 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      AV79RecPasPK = DecimalUtil.ZERO ;
      AV59PasPreMed = DecimalUtil.ZERO ;
      P028I21_A396EmprCod = new String[] {""} ;
      P028I21_A1014DibInt = new int[1] ;
      P028I21_A1013DibCli = new String[] {""} ;
      P028I21_A252CliCod = new int[1] ;
      P028I21_n252CliCod = new boolean[] {false} ;
      P028I21_A1823DibTipMaq = new String[] {""} ;
      P028I21_n1823DibTipMaq = new boolean[] {false} ;
      A1823DibTipMaq = "" ;
      P028I22_A396EmprCod = new String[] {""} ;
      P028I22_A1014DibInt = new int[1] ;
      P028I22_A252CliCod = new int[1] ;
      P028I22_n252CliCod = new boolean[] {false} ;
      P028I22_A1013DibCli = new String[] {""} ;
      P028I22_A1823DibTipMaq = new String[] {""} ;
      P028I22_n1823DibTipMaq = new boolean[] {false} ;
      P028I23_A396EmprCod = new String[] {""} ;
      P028I23_A1013DibCli = new String[] {""} ;
      P028I23_A252CliCod = new int[1] ;
      P028I23_n252CliCod = new boolean[] {false} ;
      P028I23_A1014DibInt = new int[1] ;
      P028I23_A2088DibDibMol = new byte[1] ;
      P028I23_n2088DibDibMol = new boolean[] {false} ;
      P028I23_A2092DibRelMC2 = new String[] {""} ;
      P028I23_n2092DibRelMC2 = new boolean[] {false} ;
      P028I23_A1029DibLin = new short[1] ;
      A2092DibRelMC2 = "" ;
      P028I24_A396EmprCod = new String[] {""} ;
      P028I24_A1013DibCli = new String[] {""} ;
      P028I24_A252CliCod = new int[1] ;
      P028I24_n252CliCod = new boolean[] {false} ;
      P028I24_A1014DibInt = new int[1] ;
      P028I24_A2089DibLinMol = new byte[1] ;
      P028I24_n2089DibLinMol = new boolean[] {false} ;
      P028I24_A1030DibRelMC = new String[] {""} ;
      P028I24_n1030DibRelMC = new boolean[] {false} ;
      P028I24_A1807DibLinCil = new short[1] ;
      A1030DibRelMC = "" ;
      A2134RecUniCod = "" ;
      A2119RecEstCP = DecimalUtil.ZERO ;
      A2120RecEstGK = DecimalUtil.ZERO ;
      A5105RecEstCPPa = DecimalUtil.ZERO ;
      A5106RecEstCosK = DecimalUtil.ZERO ;
      P028I26_A396EmprCod = new String[] {""} ;
      P028I26_A719PrdNum = new String[] {""} ;
      P028I26_n719PrdNum = new boolean[] {false} ;
      P028I26_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV64PrdPreAct = DecimalUtil.ZERO ;
      A2678RecPasUC = "" ;
      A2674RecPasPK = DecimalUtil.ZERO ;
      A2670RecPasCP = DecimalUtil.ZERO ;
      A5470RecPasPre = DecimalUtil.ZERO ;
      P028I28_A396EmprCod = new String[] {""} ;
      P028I28_A719PrdNum = new String[] {""} ;
      P028I28_n719PrdNum = new boolean[] {false} ;
      P028I28_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028I28_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgenpar__default(),
         new Object[] {
             new Object[] {
            P028I2_A396EmprCod, P028I2_A129BarCod, P028I2_A132BarCodReo, P028I2_A130BarCodPar, P028I2_A252CliCod, P028I2_n252CliCod, P028I2_A212BarSer, P028I2_A1798BarDibCli, P028I2_A1799BarDibInt, P028I2_A213BarSit,
            P028I2_A120BarAgrEst, P028I2_A4400BarSitEst
            }
            , new Object[] {
            P028I3_A396EmprCod, P028I3_A252CliCod, P028I3_A2076ColEstMba, P028I3_n2076ColEstMba, P028I3_A2078ColFon, P028I3_A2074ColCom, P028I3_A1014DibInt, P028I3_A1013DibCli, P028I3_A2141SerEst
            }
            , new Object[] {
            P028I4_A396EmprCod, P028I4_A252CliCod, P028I4_A2141SerEst, P028I4_A1013DibCli, P028I4_A1014DibInt, P028I4_A2074ColCom, P028I4_A2078ColFon, P028I4_A2648MolForEst, P028I4_n2648MolForEst, P028I4_A2098MolCod,
            P028I4_A2100MolCon, P028I4_n2100MolCon, P028I4_A2650MolPesMin, P028I4_n2650MolPesMin
            }
            , new Object[] {
            P028I5_A6046PrdForPar, P028I5_n6046PrdForPar
            }
            , new Object[] {
            P028I6_A6043PasForPar, P028I6_n6043PasForPar
            }
            , new Object[] {
            }
            , new Object[] {
            P028I8_A396EmprCod, P028I8_A252CliCod, P028I8_A2141SerEst, P028I8_A1013DibCli, P028I8_A1014DibInt, P028I8_A2074ColCom, P028I8_A2078ColFon, P028I8_A2098MolCod, P028I8_A6046PrdForPar, P028I8_n6046PrdForPar,
            P028I8_A2116PrdForCan, P028I8_n2116PrdForCan, P028I8_A719PrdNum, P028I8_n719PrdNum, P028I8_A2144UniEstCod, P028I8_n2144UniEstCod, P028I8_A724PrdPreAct, P028I8_A2535ForPrdLin
            }
            , new Object[] {
            P028I9_A396EmprCod, P028I9_A252CliCod, P028I9_A2141SerEst, P028I9_A1013DibCli, P028I9_A1014DibInt, P028I9_A2074ColCom, P028I9_A2078ColFon, P028I9_A2098MolCod, P028I9_A2654PasForLin, P028I9_A2107PasCod,
            P028I9_n2107PasCod, P028I9_A2109PasForCan, P028I9_n2109PasForCan, P028I9_A6043PasForPar, P028I9_n6043PasForPar
            }
            , new Object[] {
            P028I10_A2656PasTotRes, P028I10_n2656PasTotRes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P028I13_A396EmprCod, P028I13_A252CliCod, P028I13_A2141SerEst, P028I13_A1013DibCli, P028I13_A1014DibInt, P028I13_A2074ColCom, P028I13_A2078ColFon, P028I13_A2095ForObsLin, P028I13_A2096ForObsTxt, P028I13_n2096ForObsTxt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P028I16_A396EmprCod, P028I16_A129BarCod, P028I16_A132BarCodReo, P028I16_A130BarCodPar, P028I16_A1032FonCod, P028I16_A1056DisComCod, P028I16_A2524DisComLin, P028I16_A2070BarFecEst, P028I16_n2070BarFecEst, P028I16_A2073BarNumMol,
            P028I16_n2073BarNumMol, P028I16_A2117RecEstAnh, P028I16_n2117RecEstAnh, P028I16_A2122RecEstTMaq, P028I16_n2122RecEstTMaq, P028I16_A2069BarComEst, P028I16_n2069BarComEst, P028I16_A2509BarCodLan, P028I16_n2509BarCodLan, P028I16_A2510BarComPri,
            P028I16_n2510BarComPri, P028I16_A2131RecObsULin, P028I16_n2131RecObsULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P028I19_A396EmprCod, P028I19_A2107PasCod, P028I19_A2106PasCanPrd, P028I19_n2106PasCanPrd, P028I19_A2144UniEstCod, P028I19_n2144UniEstCod, P028I19_A726PrdPreMed, P028I19_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P028I21_A396EmprCod, P028I21_A1014DibInt, P028I21_A1013DibCli, P028I21_A252CliCod, P028I21_A1823DibTipMaq, P028I21_n1823DibTipMaq
            }
            , new Object[] {
            P028I22_A396EmprCod, P028I22_A1014DibInt, P028I22_A252CliCod, P028I22_A1013DibCli, P028I22_A1823DibTipMaq, P028I22_n1823DibTipMaq
            }
            , new Object[] {
            P028I23_A396EmprCod, P028I23_A1013DibCli, P028I23_A252CliCod, P028I23_A1014DibInt, P028I23_A2088DibDibMol, P028I23_n2088DibDibMol, P028I23_A2092DibRelMC2, P028I23_n2092DibRelMC2, P028I23_A1029DibLin
            }
            , new Object[] {
            P028I24_A396EmprCod, P028I24_A1013DibCli, P028I24_A252CliCod, P028I24_A1014DibInt, P028I24_A2089DibLinMol, P028I24_n2089DibLinMol, P028I24_A1030DibRelMC, P028I24_n1030DibRelMC, P028I24_A1807DibLinCil
            }
            , new Object[] {
            }
            , new Object[] {
            P028I26_A396EmprCod, P028I26_A719PrdNum, P028I26_A724PrdPreAct
            }
            , new Object[] {
            }
            , new Object[] {
            P028I28_A396EmprCod, P028I28_A719PrdNum, P028I28_A707PrdFacCon, P028I28_A685PrdCanRes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15DisComLin ;
   private byte AV46TinEst ;
   private byte AV47CmpKil ;
   private byte AV66PLinea ;
   private byte AV81AgrEst ;
   private byte GXt_int1 ;
   private byte A213BarSit ;
   private byte A4400BarSitEst ;
   private byte AV26RecMolLin ;
   private byte A2098MolCod ;
   private byte AV71ParteColor ;
   private byte AV72PartePasta ;
   private byte c6046PrdForPar ;
   private byte c6043PasForPar ;
   private byte AV38Molde ;
   private byte A2524DisComLin ;
   private byte A2124RecMolCod ;
   private byte AV52MolCod1 ;
   private byte AV34MolCod ;
   private byte A2095ForObsLin ;
   private byte A2129RecObsLin ;
   private byte AV41RecObsULin ;
   private byte A2131RecObsULin ;
   private byte GXv_int2[] ;
   private byte GXv_int9[] ;
   private byte GXv_int11[] ;
   private byte GXv_int14[] ;
   private byte A2088DibDibMol ;
   private byte A2089DibLinMol ;
   private byte A2126RecMolLin ;
   private short AV19RecEstAnh ;
   private short Gx_err ;
   private short A6046PrdForPar ;
   private short A2535ForPrdLin ;
   private short AV53ForPrdLin ;
   private short AV69RecEstPar ;
   private short A2654PasForLin ;
   private short A6043PasForPar ;
   private short AV35PasForLin ;
   private short AV70RecPasPar ;
   private short A2672RecPasLin ;
   private short A6064RecPasPar ;
   private short A2073BarNumMol ;
   private short A2117RecEstAnh ;
   private short GXv_int12[] ;
   private short AV36RecPasPLi ;
   private short A2679RecPasUL ;
   private short A1029DibLin ;
   private short A1807DibLinCil ;
   private short A6063RecEstPar ;
   private short A2675RecPasPLi ;
   private int A129BarCod ;
   private int AV21BarCodLan ;
   private int AV76Color_Pas ;
   private int GXt_int3 ;
   private int A252CliCod ;
   private int A1799BarDibInt ;
   private int AV24BarDibInt ;
   private int AV33CliCod ;
   private int A1014DibInt ;
   private int GX_INS597 ;
   private int GX_INS592 ;
   private int GX_INS598 ;
   private int A2509BarCodLan ;
   private int GXv_int4[] ;
   private int GX_INS594 ;
   private int GX_INS596 ;
   private long AV45DesEst ;
   private java.math.BigDecimal AV18RepComMtr ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A2650MolPesMin ;
   private java.math.BigDecimal AV27ColEstMba ;
   private java.math.BigDecimal AV28MolCon ;
   private java.math.BigDecimal AV40MolPesMin ;
   private java.math.BigDecimal AV29KilPas ;
   private java.math.BigDecimal A5102RecMolMtr ;
   private java.math.BigDecimal AV67ColorMolde ;
   private java.math.BigDecimal AV73TotalColor ;
   private java.math.BigDecimal A2116PrdForCan ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV30RecEstCP ;
   private java.math.BigDecimal AV62RecEstGK ;
   private java.math.BigDecimal AV55PrdForCan ;
   private java.math.BigDecimal AV58PrdPreMed ;
   private java.math.BigDecimal AV80RecEstCosK ;
   private java.math.BigDecimal A2109PasForCan ;
   private java.math.BigDecimal A2656PasTotRes ;
   private java.math.BigDecimal AV39PasForCan ;
   private java.math.BigDecimal AV77RecPasCanP ;
   private java.math.BigDecimal AV42RecPasCan ;
   private java.math.BigDecimal AV63RecPasGK ;
   private java.math.BigDecimal A2132RecPasCan ;
   private java.math.BigDecimal A2133RecPasGK ;
   private java.math.BigDecimal A5108RecPasCPPa ;
   private java.math.BigDecimal A2106PasCanPrd ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV56RecPasCP ;
   private java.math.BigDecimal AV57PasCanPrd ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV79RecPasPK ;
   private java.math.BigDecimal AV59PasPreMed ;
   private java.math.BigDecimal A2119RecEstCP ;
   private java.math.BigDecimal A2120RecEstGK ;
   private java.math.BigDecimal A5105RecEstCPPa ;
   private java.math.BigDecimal A5106RecEstCosK ;
   private java.math.BigDecimal AV64PrdPreAct ;
   private java.math.BigDecimal A2674RecPasPK ;
   private java.math.BigDecimal A2670RecPasCP ;
   private java.math.BigDecimal A5470RecPasPre ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16DisComCod ;
   private String AV17FonCod ;
   private String AV20Principal ;
   private String AV22ConStk ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A1798BarDibCli ;
   private String A120BarAgrEst ;
   private String AV25BarSer ;
   private String AV23BarDibCli ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private String A2648MolForEst ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A2127RecMolNom ;
   private String AV37MolDib ;
   private String A2128RecMolRep ;
   private String A5103RecMolCns ;
   private String Gx_emsg ;
   private String A719PrdNum ;
   private String A2144UniEstCod ;
   private String AV49PrdNum ;
   private String AV50ColCom ;
   private String AV51ColFon ;
   private String AV54UniEstCod ;
   private String A2107PasCod ;
   private String AV31PasCod ;
   private String A2096ForObsTxt ;
   private String A2130RecObsTxt ;
   private String A2122RecEstTMaq ;
   private String A2069BarComEst ;
   private String A2510BarComPri ;
   private String AV32DibTipMaq ;
   private String AV85BarAgrEst ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char13[] ;
   private String GXv_char10[] ;
   private String GXv_char8[] ;
   private String A1823DibTipMaq ;
   private String A2092DibRelMC2 ;
   private String A1030DibRelMC ;
   private String A2134RecUniCod ;
   private String A2678RecPasUC ;
   private java.util.Date A2070BarFecEst ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n2076ColEstMba ;
   private boolean n2648MolForEst ;
   private boolean n2100MolCon ;
   private boolean n2650MolPesMin ;
   private boolean n6046PrdForPar ;
   private boolean n6043PasForPar ;
   private boolean n2127RecMolNom ;
   private boolean n2128RecMolRep ;
   private boolean n5103RecMolCns ;
   private boolean n5102RecMolMtr ;
   private boolean n2116PrdForCan ;
   private boolean n719PrdNum ;
   private boolean n2144UniEstCod ;
   private boolean n2107PasCod ;
   private boolean n2109PasForCan ;
   private boolean n2656PasTotRes ;
   private boolean n2132RecPasCan ;
   private boolean n2133RecPasGK ;
   private boolean n6064RecPasPar ;
   private boolean n5108RecPasCPPa ;
   private boolean n2096ForObsTxt ;
   private boolean n2130RecObsTxt ;
   private boolean n2070BarFecEst ;
   private boolean n2073BarNumMol ;
   private boolean n2117RecEstAnh ;
   private boolean n2122RecEstTMaq ;
   private boolean n2069BarComEst ;
   private boolean n2509BarCodLan ;
   private boolean n2510BarComPri ;
   private boolean n2131RecObsULin ;
   private boolean n2106PasCanPrd ;
   private boolean n2679RecPasUL ;
   private boolean n1823DibTipMaq ;
   private boolean n2088DibDibMol ;
   private boolean n2092DibRelMC2 ;
   private boolean n2089DibLinMol ;
   private boolean n1030DibRelMC ;
   private boolean n2134RecUniCod ;
   private boolean n2119RecEstCP ;
   private boolean n2120RecEstGK ;
   private boolean n6063RecEstPar ;
   private boolean n5105RecEstCPPa ;
   private boolean n5106RecEstCosK ;
   private boolean n2678RecPasUC ;
   private boolean n2674RecPasPK ;
   private boolean n2670RecPasCP ;
   private boolean n5470RecPasPre ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P028I2_A396EmprCod ;
   private int[] P028I2_A129BarCod ;
   private byte[] P028I2_A132BarCodReo ;
   private String[] P028I2_A130BarCodPar ;
   private int[] P028I2_A252CliCod ;
   private boolean[] P028I2_n252CliCod ;
   private String[] P028I2_A212BarSer ;
   private String[] P028I2_A1798BarDibCli ;
   private int[] P028I2_A1799BarDibInt ;
   private byte[] P028I2_A213BarSit ;
   private String[] P028I2_A120BarAgrEst ;
   private byte[] P028I2_A4400BarSitEst ;
   private String[] P028I3_A396EmprCod ;
   private int[] P028I3_A252CliCod ;
   private boolean[] P028I3_n252CliCod ;
   private java.math.BigDecimal[] P028I3_A2076ColEstMba ;
   private boolean[] P028I3_n2076ColEstMba ;
   private String[] P028I3_A2078ColFon ;
   private String[] P028I3_A2074ColCom ;
   private int[] P028I3_A1014DibInt ;
   private String[] P028I3_A1013DibCli ;
   private String[] P028I3_A2141SerEst ;
   private String[] P028I4_A396EmprCod ;
   private int[] P028I4_A252CliCod ;
   private boolean[] P028I4_n252CliCod ;
   private String[] P028I4_A2141SerEst ;
   private String[] P028I4_A1013DibCli ;
   private int[] P028I4_A1014DibInt ;
   private String[] P028I4_A2074ColCom ;
   private String[] P028I4_A2078ColFon ;
   private String[] P028I4_A2648MolForEst ;
   private boolean[] P028I4_n2648MolForEst ;
   private byte[] P028I4_A2098MolCod ;
   private java.math.BigDecimal[] P028I4_A2100MolCon ;
   private boolean[] P028I4_n2100MolCon ;
   private java.math.BigDecimal[] P028I4_A2650MolPesMin ;
   private boolean[] P028I4_n2650MolPesMin ;
   private short[] P028I5_A6046PrdForPar ;
   private boolean[] P028I5_n6046PrdForPar ;
   private short[] P028I6_A6043PasForPar ;
   private boolean[] P028I6_n6043PasForPar ;
   private String[] P028I8_A396EmprCod ;
   private int[] P028I8_A252CliCod ;
   private boolean[] P028I8_n252CliCod ;
   private String[] P028I8_A2141SerEst ;
   private String[] P028I8_A1013DibCli ;
   private int[] P028I8_A1014DibInt ;
   private String[] P028I8_A2074ColCom ;
   private String[] P028I8_A2078ColFon ;
   private byte[] P028I8_A2098MolCod ;
   private short[] P028I8_A6046PrdForPar ;
   private boolean[] P028I8_n6046PrdForPar ;
   private java.math.BigDecimal[] P028I8_A2116PrdForCan ;
   private boolean[] P028I8_n2116PrdForCan ;
   private String[] P028I8_A719PrdNum ;
   private boolean[] P028I8_n719PrdNum ;
   private String[] P028I8_A2144UniEstCod ;
   private boolean[] P028I8_n2144UniEstCod ;
   private java.math.BigDecimal[] P028I8_A724PrdPreAct ;
   private short[] P028I8_A2535ForPrdLin ;
   private String[] P028I9_A396EmprCod ;
   private int[] P028I9_A252CliCod ;
   private boolean[] P028I9_n252CliCod ;
   private String[] P028I9_A2141SerEst ;
   private String[] P028I9_A1013DibCli ;
   private int[] P028I9_A1014DibInt ;
   private String[] P028I9_A2074ColCom ;
   private String[] P028I9_A2078ColFon ;
   private byte[] P028I9_A2098MolCod ;
   private short[] P028I9_A2654PasForLin ;
   private String[] P028I9_A2107PasCod ;
   private boolean[] P028I9_n2107PasCod ;
   private java.math.BigDecimal[] P028I9_A2109PasForCan ;
   private boolean[] P028I9_n2109PasForCan ;
   private short[] P028I9_A6043PasForPar ;
   private boolean[] P028I9_n6043PasForPar ;
   private java.math.BigDecimal[] P028I10_A2656PasTotRes ;
   private boolean[] P028I10_n2656PasTotRes ;
   private String[] P028I13_A396EmprCod ;
   private int[] P028I13_A252CliCod ;
   private boolean[] P028I13_n252CliCod ;
   private String[] P028I13_A2141SerEst ;
   private String[] P028I13_A1013DibCli ;
   private int[] P028I13_A1014DibInt ;
   private String[] P028I13_A2074ColCom ;
   private String[] P028I13_A2078ColFon ;
   private byte[] P028I13_A2095ForObsLin ;
   private String[] P028I13_A2096ForObsTxt ;
   private boolean[] P028I13_n2096ForObsTxt ;
   private String[] P028I16_A396EmprCod ;
   private int[] P028I16_A129BarCod ;
   private byte[] P028I16_A132BarCodReo ;
   private String[] P028I16_A130BarCodPar ;
   private String[] P028I16_A1032FonCod ;
   private String[] P028I16_A1056DisComCod ;
   private byte[] P028I16_A2524DisComLin ;
   private java.util.Date[] P028I16_A2070BarFecEst ;
   private boolean[] P028I16_n2070BarFecEst ;
   private short[] P028I16_A2073BarNumMol ;
   private boolean[] P028I16_n2073BarNumMol ;
   private short[] P028I16_A2117RecEstAnh ;
   private boolean[] P028I16_n2117RecEstAnh ;
   private String[] P028I16_A2122RecEstTMaq ;
   private boolean[] P028I16_n2122RecEstTMaq ;
   private String[] P028I16_A2069BarComEst ;
   private boolean[] P028I16_n2069BarComEst ;
   private int[] P028I16_A2509BarCodLan ;
   private boolean[] P028I16_n2509BarCodLan ;
   private String[] P028I16_A2510BarComPri ;
   private boolean[] P028I16_n2510BarComPri ;
   private byte[] P028I16_A2131RecObsULin ;
   private boolean[] P028I16_n2131RecObsULin ;
   private String[] P028I19_A396EmprCod ;
   private String[] P028I19_A2107PasCod ;
   private boolean[] P028I19_n2107PasCod ;
   private java.math.BigDecimal[] P028I19_A2106PasCanPrd ;
   private boolean[] P028I19_n2106PasCanPrd ;
   private String[] P028I19_A2144UniEstCod ;
   private boolean[] P028I19_n2144UniEstCod ;
   private java.math.BigDecimal[] P028I19_A726PrdPreMed ;
   private String[] P028I19_A719PrdNum ;
   private boolean[] P028I19_n719PrdNum ;
   private String[] P028I21_A396EmprCod ;
   private int[] P028I21_A1014DibInt ;
   private String[] P028I21_A1013DibCli ;
   private int[] P028I21_A252CliCod ;
   private boolean[] P028I21_n252CliCod ;
   private String[] P028I21_A1823DibTipMaq ;
   private boolean[] P028I21_n1823DibTipMaq ;
   private String[] P028I22_A396EmprCod ;
   private int[] P028I22_A1014DibInt ;
   private int[] P028I22_A252CliCod ;
   private boolean[] P028I22_n252CliCod ;
   private String[] P028I22_A1013DibCli ;
   private String[] P028I22_A1823DibTipMaq ;
   private boolean[] P028I22_n1823DibTipMaq ;
   private String[] P028I23_A396EmprCod ;
   private String[] P028I23_A1013DibCli ;
   private int[] P028I23_A252CliCod ;
   private boolean[] P028I23_n252CliCod ;
   private int[] P028I23_A1014DibInt ;
   private byte[] P028I23_A2088DibDibMol ;
   private boolean[] P028I23_n2088DibDibMol ;
   private String[] P028I23_A2092DibRelMC2 ;
   private boolean[] P028I23_n2092DibRelMC2 ;
   private short[] P028I23_A1029DibLin ;
   private String[] P028I24_A396EmprCod ;
   private String[] P028I24_A1013DibCli ;
   private int[] P028I24_A252CliCod ;
   private boolean[] P028I24_n252CliCod ;
   private int[] P028I24_A1014DibInt ;
   private byte[] P028I24_A2089DibLinMol ;
   private boolean[] P028I24_n2089DibLinMol ;
   private String[] P028I24_A1030DibRelMC ;
   private boolean[] P028I24_n1030DibRelMC ;
   private short[] P028I24_A1807DibLinCil ;
   private String[] P028I26_A396EmprCod ;
   private String[] P028I26_A719PrdNum ;
   private boolean[] P028I26_n719PrdNum ;
   private java.math.BigDecimal[] P028I26_A724PrdPreAct ;
   private String[] P028I28_A396EmprCod ;
   private String[] P028I28_A719PrdNum ;
   private boolean[] P028I28_n719PrdNum ;
   private java.math.BigDecimal[] P028I28_A707PrdFacCon ;
   private java.math.BigDecimal[] P028I28_A685PrdCanRes ;
}

final  class pgenpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028I2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarSer, BarDibCli, BarDibInt, BarSit, BarAgrEst, BarSitEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028I3", "SELECT EmprCod, CliCod, ColEstMba, ColFon, ColCom, DibInt, DibCli, SerEst FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028I4", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolForEst, MolCod, MolCon, MolPesMin FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028I5", "SELECT SUM(PrdForPar) FROM TXPRECPR2 WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028I6", "SELECT SUM(PasForPar) FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028I7", "INSERT INTO TXPRECMOL(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolNom, RecMolRep, RecMolMtr, RecMolCns, RecMolDib, RecPasUL, RecMolTotK, RecMolNRep, RecMolCodC, RecMolCodD, RecMolCCOb, RecMolDgC, RecMolRec, RecPorCil) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMOL")
         ,new ForEachCursor("P028I8", "SELECT T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.PrdForPar, T1.PrdForCan, T1.PrdNum, T1.UniEstCod, T2.PrdPreAct, T1.ForPrdLin FROM (TXPRECPR2 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.ForPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028I9", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin, PasCod, PasForCan, PasForPar FROM TXPPASFOR WHERE (EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?) AND (EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ?) ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028I10", "SELECT PasTotRes FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028I11", "INSERT INTO TXPRECPAS(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, PasCod, RecPasCan, RecPasGK, RecPasCPPa, RecPasPar, RecPasUA, RecPasULP, RecPasCosK) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECPAS")
         ,new UpdateCursor("P028I12", "UPDATE TXPCPASTA SET PasTotRes=?  WHERE EmprCod = ? AND PasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPASTA")
         ,new ForEachCursor("P028I13", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsLin, ForObsTxt FROM TXPFOROBS WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028I14", "INSERT INTO TXPRECOBS(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecObsLin, RecObsTxt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECOBS")
         ,new UpdateCursor("P028I15", "UPDATE TXPBARCAD SET BarSit=?, BarSitEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P028I16", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FonCod, DisComCod, DisComLin, BarFecEst, BarNumMol, RecEstAnh, RecEstTMaq, BarComEst, BarCodLan, BarComPri, RecObsULin FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028I17", "UPDATE TXPBARCOM SET BarFecEst=?, BarNumMol=?, RecEstAnh=?, RecEstTMaq=?, BarComEst=?, BarCodLan=?, BarComPri=?, RecObsULin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new UpdateCursor("P028I18", "UPDATE TXPBARCAD SET BarSit=?, BarSitEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P028I19", "SELECT T1.EmprCod, T1.PasCod, T1.PasCanPrd, T1.UniEstCod, T2.PrdPreMed, T1.PrdNum FROM (TXPLPASTA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PasCod = ? ORDER BY T1.EmprCod, T1.PasCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028I20", "UPDATE TXPRECMOL SET RecPasUL=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMOL")
         ,new ForEachCursor("P028I21", "SELECT EmprCod, DibInt, DibCli, CliCod, DibTipMaq FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028I22", "SELECT EmprCod, DibInt, CliCod, DibCli, DibTipMaq FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028I23", "SELECT EmprCod, DibCli, CliCod, DibInt, DibDibMol, DibRelMC2, DibLin FROM TXPLDIBUJ WHERE (EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?) AND (DibDibMol = ?) ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028I24", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinMol, DibRelMC, DibLinCil FROM TXPLDIBUC WHERE (EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?) AND (DibLinMol = ?) ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028I25", "INSERT INTO TXPRECPRD(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin, PrdNum, RecUniCod, RecEstGK, RecEstCP, RecEstCPPa, RecEstCosK, RecEstPar, RecEstUan, RecEstFin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECPRD")
         ,new ForEachCursor("P028I26", "SELECT EmprCod, PrdNum, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028I27", "INSERT INTO TXPRECDEP(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi, PrdNum, RecPasUC, RecPasPK, RecPasCP, RecPasPre) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECDEP")
         ,new ForEachCursor("P028I28", "SELECT EmprCod, PrdNum, PrdFacCon, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028I29", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,5);
               ((short[]) buf[17])[0] = rslt.getShort(14);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
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
                  stmt.setString(9, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[11]).intValue());
               }
               stmt.setString(11, (String)parms[12], 16);
               stmt.setString(12, (String)parms[13], 16);
               stmt.setInt(13, ((Number) parms[14]).intValue());
               stmt.setString(14, (String)parms[15], 12);
               stmt.setString(15, (String)parms[16], 12);
               stmt.setByte(16, ((Number) parms[17]).byteValue());
               return;
            case 8 :
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
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[18]).shortValue());
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 12 :
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
                  stmt.setString(9, (String)parms[9], 40);
               }
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setByte(11, ((Number) parms[18]).byteValue());
               stmt.setString(12, (String)parms[19], 1);
               stmt.setByte(13, ((Number) parms[20]).byteValue());
               stmt.setString(14, (String)parms[21], 12);
               stmt.setString(15, (String)parms[22], 12);
               return;
            case 16 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[22]).shortValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
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
      }
   }

}

