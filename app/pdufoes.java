package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdufoes extends GXProcedure
{
   public pdufoes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdufoes.class ), "" );
   }

   public pdufoes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 )
   {
      pdufoes.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      pdufoes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdufoes.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdufoes.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      pdufoes.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      pdufoes.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      pdufoes.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      pdufoes.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      pdufoes.this.AV15CliCod = aP7[0];
      this.aP7 = aP7;
      pdufoes.this.AV16SerEst = aP8[0];
      this.aP8 = aP8;
      pdufoes.this.AV17DibCli = aP9[0];
      this.aP9 = aP9;
      pdufoes.this.AV18DibInt = aP10[0];
      this.aP10 = aP10;
      pdufoes.this.AV19ColCom = aP11[0];
      this.aP11 = aP11;
      pdufoes.this.AV20ColFon = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV28EmprNom ;
      GXv_char3[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char1, GXv_char2, GXv_char3) ;
      pdufoes.this.A396EmprCod = GXv_char1[0] ;
      pdufoes.this.AV28EmprNom = GXv_char2[0] ;
      pdufoes.this.AV29UsurCod = GXv_char3[0] ;
      /* Using cursor P00YR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13123DGAltCab = P00YR2_A13123DGAltCab[0] ;
         n13123DGAltCab = P00YR2_n13123DGAltCab[0] ;
         A13121DGDespID = P00YR2_A13121DGDespID[0] ;
         n13121DGDespID = P00YR2_n13121DGDespID[0] ;
         A13119DGPerfID = P00YR2_A13119DGPerfID[0] ;
         n13119DGPerfID = P00YR2_n13119DGPerfID[0] ;
         A13117DGCalID = P00YR2_A13117DGCalID[0] ;
         n13117DGCalID = P00YR2_n13117DGCalID[0] ;
         A11717ClaveIdUlt = P00YR2_A11717ClaveIdUlt[0] ;
         n11717ClaveIdUlt = P00YR2_n11717ClaveIdUlt[0] ;
         A10770ColGrm2 = P00YR2_A10770ColGrm2[0] ;
         n10770ColGrm2 = P00YR2_n10770ColGrm2[0] ;
         A8419ColNomCol = P00YR2_A8419ColNomCol[0] ;
         n8419ColNomCol = P00YR2_n8419ColNomCol[0] ;
         A499GrpFamCod = P00YR2_A499GrpFamCod[0] ;
         n499GrpFamCod = P00YR2_n499GrpFamCod[0] ;
         A7028ColBmp = P00YR2_A7028ColBmp[0] ;
         n7028ColBmp = P00YR2_n7028ColBmp[0] ;
         A5336ColCodExt = P00YR2_A5336ColCodExt[0] ;
         n5336ColCodExt = P00YR2_n5336ColCodExt[0] ;
         A583IntCod = P00YR2_A583IntCod[0] ;
         n583IntCod = P00YR2_n583IntCod[0] ;
         A2097ForObsULin = P00YR2_A2097ForObsULin[0] ;
         n2097ForObsULin = P00YR2_n2097ForObsULin[0] ;
         A2076ColEstMba = P00YR2_A2076ColEstMba[0] ;
         n2076ColEstMba = P00YR2_n2076ColEstMba[0] ;
         A2079ColMolCil = P00YR2_A2079ColMolCil[0] ;
         n2079ColMolCil = P00YR2_n2079ColMolCil[0] ;
         W252CliCod = A252CliCod ;
         W2141SerEst = A2141SerEst ;
         W1013DibCli = A1013DibCli ;
         W1014DibInt = A1014DibInt ;
         W2074ColCom = A2074ColCom ;
         W2078ColFon = A2078ColFon ;
         /*
            INSERT RECORD ON TABLE TXPCFORES

         */
         W252CliCod = A252CliCod ;
         W2141SerEst = A2141SerEst ;
         W1013DibCli = A1013DibCli ;
         W1014DibInt = A1014DibInt ;
         W2074ColCom = A2074ColCom ;
         W2078ColFon = A2078ColFon ;
         A252CliCod = AV15CliCod ;
         A2141SerEst = AV16SerEst ;
         A1013DibCli = AV17DibCli ;
         A1014DibInt = AV18DibInt ;
         A2074ColCom = AV19ColCom ;
         A2078ColFon = AV20ColFon ;
         AV30Inc_obs = httpContext.getMessage( "Duplicacion CFORES", "") + GXutil.newLine( ) + httpContext.getMessage( "Cliente=", "") + GXutil.str( AV15CliCod, 6, 0) + httpContext.getMessage( "Art=", "") + AV16SerEst + httpContext.getMessage( "DibCli=", "") + AV17DibCli + httpContext.getMessage( "DibInt=", "") + GXutil.str( AV18DibInt, 8, 0) + httpContext.getMessage( "Var=", "") + AV19ColCom + httpContext.getMessage( "Fondo=", "") + AV20ColFon + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV29UsurCod, AV27Station, AV30Inc_obs, 99999999, (byte)(0), "@") ;
         /* Using cursor P00YR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Boolean.valueOf(n2079ColMolCil), Short.valueOf(A2079ColMolCil), Boolean.valueOf(n2076ColEstMba), A2076ColEstMba, Boolean.valueOf(n2097ForObsULin), Byte.valueOf(A2097ForObsULin), Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n5336ColCodExt), A5336ColCodExt, Boolean.valueOf(n7028ColBmp), A7028ColBmp, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod), Boolean.valueOf(n8419ColNomCol), A8419ColNomCol, Boolean.valueOf(n10770ColGrm2), A10770ColGrm2, Boolean.valueOf(n11717ClaveIdUlt), Short.valueOf(A11717ClaveIdUlt), Boolean.valueOf(n13117DGCalID), Short.valueOf(A13117DGCalID), Boolean.valueOf(n13119DGPerfID), Short.valueOf(A13119DGPerfID), Boolean.valueOf(n13121DGDespID), Short.valueOf(A13121DGDespID), Boolean.valueOf(n13123DGAltCab), A13123DGAltCab});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
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
         A252CliCod = W252CliCod ;
         A2141SerEst = W2141SerEst ;
         A1013DibCli = W1013DibCli ;
         A1014DibInt = W1014DibInt ;
         A2074ColCom = W2074ColCom ;
         A2078ColFon = W2078ColFon ;
         /* End Insert */
         /* Using cursor P00YR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2098MolCod = P00YR4_A2098MolCod[0] ;
            A11759TaesId2 = P00YR4_A11759TaesId2[0] ;
            n11759TaesId2 = P00YR4_n11759TaesId2[0] ;
            A9608MolPorVar = P00YR4_A9608MolPorVar[0] ;
            n9608MolPorVar = P00YR4_n9608MolPorVar[0] ;
            A8052Dg_codigo = P00YR4_A8052Dg_codigo[0] ;
            n8052Dg_codigo = P00YR4_n8052Dg_codigo[0] ;
            A4420MolCol = P00YR4_A4420MolCol[0] ;
            n4420MolCol = P00YR4_n4420MolCol[0] ;
            A2655PasForUL = P00YR4_A2655PasForUL[0] ;
            n2655PasForUL = P00YR4_n2655PasForUL[0] ;
            A2649MolPesMax = P00YR4_A2649MolPesMax[0] ;
            n2649MolPesMax = P00YR4_n2649MolPesMax[0] ;
            A2648MolForEst = P00YR4_A2648MolForEst[0] ;
            n2648MolForEst = P00YR4_n2648MolForEst[0] ;
            A2650MolPesMin = P00YR4_A2650MolPesMin[0] ;
            n2650MolPesMin = P00YR4_n2650MolPesMin[0] ;
            A2536ForPrdUL = P00YR4_A2536ForPrdUL[0] ;
            n2536ForPrdUL = P00YR4_n2536ForPrdUL[0] ;
            A2100MolCon = P00YR4_A2100MolCon[0] ;
            n2100MolCon = P00YR4_n2100MolCon[0] ;
            W252CliCod = A252CliCod ;
            W2141SerEst = A2141SerEst ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W2074ColCom = A2074ColCom ;
            W2078ColFon = A2078ColFon ;
            AV22MolCod = A2098MolCod ;
            /*
               INSERT RECORD ON TABLE TXPMFORES

            */
            W252CliCod = A252CliCod ;
            W2141SerEst = A2141SerEst ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W2074ColCom = A2074ColCom ;
            W2078ColFon = A2078ColFon ;
            W2098MolCod = A2098MolCod ;
            A252CliCod = AV15CliCod ;
            A2141SerEst = AV16SerEst ;
            A1013DibCli = AV17DibCli ;
            A1014DibInt = AV18DibInt ;
            A2074ColCom = AV19ColCom ;
            A2078ColFon = AV20ColFon ;
            A2098MolCod = AV22MolCod ;
            /* Using cursor P00YR5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Boolean.valueOf(n2100MolCon), A2100MolCon, Boolean.valueOf(n2536ForPrdUL), Short.valueOf(A2536ForPrdUL), Boolean.valueOf(n2650MolPesMin), A2650MolPesMin, Boolean.valueOf(n2648MolForEst), A2648MolForEst, Boolean.valueOf(n2649MolPesMax), A2649MolPesMax, Boolean.valueOf(n2655PasForUL), Short.valueOf(A2655PasForUL), Boolean.valueOf(n4420MolCol), A4420MolCol, Boolean.valueOf(n8052Dg_codigo), Short.valueOf(A8052Dg_codigo), Boolean.valueOf(n9608MolPorVar), Short.valueOf(A9608MolPorVar), Boolean.valueOf(n11759TaesId2), A11759TaesId2});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
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
            A252CliCod = W252CliCod ;
            A2141SerEst = W2141SerEst ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A2074ColCom = W2074ColCom ;
            A2078ColFon = W2078ColFon ;
            A2098MolCod = W2098MolCod ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A2141SerEst = W2141SerEst ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A2074ColCom = W2074ColCom ;
            A2078ColFon = W2078ColFon ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P00YR6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A2535ForPrdLin = P00YR6_A2535ForPrdLin[0] ;
            A2098MolCod = P00YR6_A2098MolCod[0] ;
            A6046PrdForPar = P00YR6_A6046PrdForPar[0] ;
            n6046PrdForPar = P00YR6_n6046PrdForPar[0] ;
            A2116PrdForCan = P00YR6_A2116PrdForCan[0] ;
            n2116PrdForCan = P00YR6_n2116PrdForCan[0] ;
            A2144UniEstCod = P00YR6_A2144UniEstCod[0] ;
            n2144UniEstCod = P00YR6_n2144UniEstCod[0] ;
            A719PrdNum = P00YR6_A719PrdNum[0] ;
            n719PrdNum = P00YR6_n719PrdNum[0] ;
            W252CliCod = A252CliCod ;
            W2141SerEst = A2141SerEst ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W2074ColCom = A2074ColCom ;
            W2078ColFon = A2078ColFon ;
            AV22MolCod = A2098MolCod ;
            AV23ForPrdLin = A2535ForPrdLin ;
            /*
               INSERT RECORD ON TABLE TXPRECPR2

            */
            W252CliCod = A252CliCod ;
            W2141SerEst = A2141SerEst ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W2074ColCom = A2074ColCom ;
            W2078ColFon = A2078ColFon ;
            W2098MolCod = A2098MolCod ;
            W2535ForPrdLin = A2535ForPrdLin ;
            A252CliCod = AV15CliCod ;
            A2141SerEst = AV16SerEst ;
            A1013DibCli = AV17DibCli ;
            A1014DibInt = AV18DibInt ;
            A2074ColCom = AV19ColCom ;
            A2078ColFon = AV20ColFon ;
            A2098MolCod = AV22MolCod ;
            A2535ForPrdLin = AV23ForPrdLin ;
            /* Using cursor P00YR7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, Boolean.valueOf(n2116PrdForCan), A2116PrdForCan, Boolean.valueOf(n6046PrdForPar), Short.valueOf(A6046PrdForPar)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPR2");
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
            A252CliCod = W252CliCod ;
            A2141SerEst = W2141SerEst ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A2074ColCom = W2074ColCom ;
            A2078ColFon = W2078ColFon ;
            A2098MolCod = W2098MolCod ;
            A2535ForPrdLin = W2535ForPrdLin ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A2141SerEst = W2141SerEst ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A2074ColCom = W2074ColCom ;
            A2078ColFon = W2078ColFon ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P00YR8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A2654PasForLin = P00YR8_A2654PasForLin[0] ;
            A2098MolCod = P00YR8_A2098MolCod[0] ;
            A6050PasForCanP = P00YR8_A6050PasForCanP[0] ;
            n6050PasForCanP = P00YR8_n6050PasForCanP[0] ;
            A6043PasForPar = P00YR8_A6043PasForPar[0] ;
            n6043PasForPar = P00YR8_n6043PasForPar[0] ;
            A2110PasForCon = P00YR8_A2110PasForCon[0] ;
            n2110PasForCon = P00YR8_n2110PasForCon[0] ;
            A2112PasForSob = P00YR8_A2112PasForSob[0] ;
            n2112PasForSob = P00YR8_n2112PasForSob[0] ;
            A2111PasForPre = P00YR8_A2111PasForPre[0] ;
            n2111PasForPre = P00YR8_n2111PasForPre[0] ;
            A2109PasForCan = P00YR8_A2109PasForCan[0] ;
            n2109PasForCan = P00YR8_n2109PasForCan[0] ;
            A2144UniEstCod = P00YR8_A2144UniEstCod[0] ;
            n2144UniEstCod = P00YR8_n2144UniEstCod[0] ;
            A2107PasCod = P00YR8_A2107PasCod[0] ;
            n2107PasCod = P00YR8_n2107PasCod[0] ;
            W252CliCod = A252CliCod ;
            W2141SerEst = A2141SerEst ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W2074ColCom = A2074ColCom ;
            W2078ColFon = A2078ColFon ;
            AV22MolCod = A2098MolCod ;
            AV24PasForLin = A2654PasForLin ;
            /*
               INSERT RECORD ON TABLE TXPPASFOR

            */
            W252CliCod = A252CliCod ;
            W2141SerEst = A2141SerEst ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W2074ColCom = A2074ColCom ;
            W2078ColFon = A2078ColFon ;
            W2098MolCod = A2098MolCod ;
            W2654PasForLin = A2654PasForLin ;
            A252CliCod = AV15CliCod ;
            A2141SerEst = AV16SerEst ;
            A1013DibCli = AV17DibCli ;
            A1014DibInt = AV18DibInt ;
            A2074ColCom = AV19ColCom ;
            A2078ColFon = AV20ColFon ;
            A2098MolCod = AV22MolCod ;
            A2654PasForLin = AV24PasForLin ;
            /* Using cursor P00YR9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin), Boolean.valueOf(n2107PasCod), A2107PasCod, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, Boolean.valueOf(n2109PasForCan), A2109PasForCan, Boolean.valueOf(n2111PasForPre), A2111PasForPre, Boolean.valueOf(n2112PasForSob), A2112PasForSob, Boolean.valueOf(n2110PasForCon), A2110PasForCon, Boolean.valueOf(n6043PasForPar), Short.valueOf(A6043PasForPar), Boolean.valueOf(n6050PasForCanP), A6050PasForCanP});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPASFOR");
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
            A252CliCod = W252CliCod ;
            A2141SerEst = W2141SerEst ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A2074ColCom = W2074ColCom ;
            A2078ColFon = W2078ColFon ;
            A2098MolCod = W2098MolCod ;
            A2654PasForLin = W2654PasForLin ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A2141SerEst = W2141SerEst ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A2074ColCom = W2074ColCom ;
            A2078ColFon = W2078ColFon ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Using cursor P00YR10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A2096ForObsTxt = P00YR10_A2096ForObsTxt[0] ;
            n2096ForObsTxt = P00YR10_n2096ForObsTxt[0] ;
            A2095ForObsLin = P00YR10_A2095ForObsLin[0] ;
            W252CliCod = A252CliCod ;
            W2141SerEst = A2141SerEst ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W2074ColCom = A2074ColCom ;
            W2078ColFon = A2078ColFon ;
            AV25ForObsLin = A2095ForObsLin ;
            AV26ForObsTxt = A2096ForObsTxt ;
            /*
               INSERT RECORD ON TABLE TXPFOROBS

            */
            W252CliCod = A252CliCod ;
            W2141SerEst = A2141SerEst ;
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            W2074ColCom = A2074ColCom ;
            W2078ColFon = A2078ColFon ;
            W2095ForObsLin = A2095ForObsLin ;
            W2096ForObsTxt = A2096ForObsTxt ;
            n2096ForObsTxt = false ;
            A252CliCod = AV15CliCod ;
            A2141SerEst = AV16SerEst ;
            A1013DibCli = AV17DibCli ;
            A1014DibInt = AV18DibInt ;
            A2074ColCom = AV19ColCom ;
            A2078ColFon = AV20ColFon ;
            A2095ForObsLin = AV25ForObsLin ;
            A2096ForObsTxt = AV26ForObsTxt ;
            n2096ForObsTxt = false ;
            /* Using cursor P00YR11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2095ForObsLin), Boolean.valueOf(n2096ForObsTxt), A2096ForObsTxt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFOROBS");
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
            A252CliCod = W252CliCod ;
            A2141SerEst = W2141SerEst ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A2074ColCom = W2074ColCom ;
            A2078ColFon = W2078ColFon ;
            A2095ForObsLin = W2095ForObsLin ;
            A2096ForObsTxt = W2096ForObsTxt ;
            n2096ForObsTxt = false ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A2141SerEst = W2141SerEst ;
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            A2074ColCom = W2074ColCom ;
            A2078ColFon = W2078ColFon ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         A252CliCod = W252CliCod ;
         A2141SerEst = W2141SerEst ;
         A1013DibCli = W1013DibCli ;
         A1014DibInt = W1014DibInt ;
         A2074ColCom = W2074ColCom ;
         A2078ColFon = W2078ColFon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdufoes.this.A396EmprCod;
      this.aP1[0] = pdufoes.this.A252CliCod;
      this.aP2[0] = pdufoes.this.A2141SerEst;
      this.aP3[0] = pdufoes.this.A1013DibCli;
      this.aP4[0] = pdufoes.this.A1014DibInt;
      this.aP5[0] = pdufoes.this.A2074ColCom;
      this.aP6[0] = pdufoes.this.A2078ColFon;
      this.aP7[0] = pdufoes.this.AV15CliCod;
      this.aP8[0] = pdufoes.this.AV16SerEst;
      this.aP9[0] = pdufoes.this.AV17DibCli;
      this.aP10[0] = pdufoes.this.AV18DibInt;
      this.aP11[0] = pdufoes.this.AV19ColCom;
      this.aP12[0] = pdufoes.this.AV20ColFon;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdufoes");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Station = "" ;
      GXv_char1 = new String[1] ;
      AV28EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV29UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P00YR2_A396EmprCod = new String[] {""} ;
      P00YR2_A252CliCod = new int[1] ;
      P00YR2_A2141SerEst = new String[] {""} ;
      P00YR2_A1013DibCli = new String[] {""} ;
      P00YR2_A1014DibInt = new int[1] ;
      P00YR2_A2074ColCom = new String[] {""} ;
      P00YR2_A2078ColFon = new String[] {""} ;
      P00YR2_A13123DGAltCab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR2_n13123DGAltCab = new boolean[] {false} ;
      P00YR2_A13121DGDespID = new short[1] ;
      P00YR2_n13121DGDespID = new boolean[] {false} ;
      P00YR2_A13119DGPerfID = new short[1] ;
      P00YR2_n13119DGPerfID = new boolean[] {false} ;
      P00YR2_A13117DGCalID = new short[1] ;
      P00YR2_n13117DGCalID = new boolean[] {false} ;
      P00YR2_A11717ClaveIdUlt = new short[1] ;
      P00YR2_n11717ClaveIdUlt = new boolean[] {false} ;
      P00YR2_A10770ColGrm2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR2_n10770ColGrm2 = new boolean[] {false} ;
      P00YR2_A8419ColNomCol = new String[] {""} ;
      P00YR2_n8419ColNomCol = new boolean[] {false} ;
      P00YR2_A499GrpFamCod = new byte[1] ;
      P00YR2_n499GrpFamCod = new boolean[] {false} ;
      P00YR2_A7028ColBmp = new String[] {""} ;
      P00YR2_n7028ColBmp = new boolean[] {false} ;
      P00YR2_A5336ColCodExt = new String[] {""} ;
      P00YR2_n5336ColCodExt = new boolean[] {false} ;
      P00YR2_A583IntCod = new byte[1] ;
      P00YR2_n583IntCod = new boolean[] {false} ;
      P00YR2_A2097ForObsULin = new byte[1] ;
      P00YR2_n2097ForObsULin = new boolean[] {false} ;
      P00YR2_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR2_n2076ColEstMba = new boolean[] {false} ;
      P00YR2_A2079ColMolCil = new short[1] ;
      P00YR2_n2079ColMolCil = new boolean[] {false} ;
      A13123DGAltCab = DecimalUtil.ZERO ;
      A10770ColGrm2 = DecimalUtil.ZERO ;
      A8419ColNomCol = "" ;
      A7028ColBmp = "" ;
      A5336ColCodExt = "" ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      W2141SerEst = "" ;
      W1013DibCli = "" ;
      W2074ColCom = "" ;
      W2078ColFon = "" ;
      AV30Inc_obs = "" ;
      AV34Pgmname = "" ;
      Gx_emsg = "" ;
      P00YR4_A396EmprCod = new String[] {""} ;
      P00YR4_A252CliCod = new int[1] ;
      P00YR4_A2141SerEst = new String[] {""} ;
      P00YR4_A1013DibCli = new String[] {""} ;
      P00YR4_A1014DibInt = new int[1] ;
      P00YR4_A2074ColCom = new String[] {""} ;
      P00YR4_A2078ColFon = new String[] {""} ;
      P00YR4_A2098MolCod = new byte[1] ;
      P00YR4_A11759TaesId2 = new String[] {""} ;
      P00YR4_n11759TaesId2 = new boolean[] {false} ;
      P00YR4_A9608MolPorVar = new short[1] ;
      P00YR4_n9608MolPorVar = new boolean[] {false} ;
      P00YR4_A8052Dg_codigo = new short[1] ;
      P00YR4_n8052Dg_codigo = new boolean[] {false} ;
      P00YR4_A4420MolCol = new String[] {""} ;
      P00YR4_n4420MolCol = new boolean[] {false} ;
      P00YR4_A2655PasForUL = new short[1] ;
      P00YR4_n2655PasForUL = new boolean[] {false} ;
      P00YR4_A2649MolPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR4_n2649MolPesMax = new boolean[] {false} ;
      P00YR4_A2648MolForEst = new String[] {""} ;
      P00YR4_n2648MolForEst = new boolean[] {false} ;
      P00YR4_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR4_n2650MolPesMin = new boolean[] {false} ;
      P00YR4_A2536ForPrdUL = new short[1] ;
      P00YR4_n2536ForPrdUL = new boolean[] {false} ;
      P00YR4_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR4_n2100MolCon = new boolean[] {false} ;
      A11759TaesId2 = "" ;
      A4420MolCol = "" ;
      A2649MolPesMax = DecimalUtil.ZERO ;
      A2648MolForEst = "" ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      A2100MolCon = DecimalUtil.ZERO ;
      P00YR6_A396EmprCod = new String[] {""} ;
      P00YR6_A252CliCod = new int[1] ;
      P00YR6_A2141SerEst = new String[] {""} ;
      P00YR6_A1013DibCli = new String[] {""} ;
      P00YR6_A1014DibInt = new int[1] ;
      P00YR6_A2074ColCom = new String[] {""} ;
      P00YR6_A2078ColFon = new String[] {""} ;
      P00YR6_A2535ForPrdLin = new short[1] ;
      P00YR6_A2098MolCod = new byte[1] ;
      P00YR6_A6046PrdForPar = new short[1] ;
      P00YR6_n6046PrdForPar = new boolean[] {false} ;
      P00YR6_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR6_n2116PrdForCan = new boolean[] {false} ;
      P00YR6_A2144UniEstCod = new String[] {""} ;
      P00YR6_n2144UniEstCod = new boolean[] {false} ;
      P00YR6_A719PrdNum = new String[] {""} ;
      P00YR6_n719PrdNum = new boolean[] {false} ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A719PrdNum = "" ;
      P00YR8_A396EmprCod = new String[] {""} ;
      P00YR8_A252CliCod = new int[1] ;
      P00YR8_A2141SerEst = new String[] {""} ;
      P00YR8_A1013DibCli = new String[] {""} ;
      P00YR8_A1014DibInt = new int[1] ;
      P00YR8_A2074ColCom = new String[] {""} ;
      P00YR8_A2078ColFon = new String[] {""} ;
      P00YR8_A2654PasForLin = new short[1] ;
      P00YR8_A2098MolCod = new byte[1] ;
      P00YR8_A6050PasForCanP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR8_n6050PasForCanP = new boolean[] {false} ;
      P00YR8_A6043PasForPar = new short[1] ;
      P00YR8_n6043PasForPar = new boolean[] {false} ;
      P00YR8_A2110PasForCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR8_n2110PasForCon = new boolean[] {false} ;
      P00YR8_A2112PasForSob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR8_n2112PasForSob = new boolean[] {false} ;
      P00YR8_A2111PasForPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR8_n2111PasForPre = new boolean[] {false} ;
      P00YR8_A2109PasForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YR8_n2109PasForCan = new boolean[] {false} ;
      P00YR8_A2144UniEstCod = new String[] {""} ;
      P00YR8_n2144UniEstCod = new boolean[] {false} ;
      P00YR8_A2107PasCod = new String[] {""} ;
      P00YR8_n2107PasCod = new boolean[] {false} ;
      A6050PasForCanP = DecimalUtil.ZERO ;
      A2110PasForCon = DecimalUtil.ZERO ;
      A2112PasForSob = DecimalUtil.ZERO ;
      A2111PasForPre = DecimalUtil.ZERO ;
      A2109PasForCan = DecimalUtil.ZERO ;
      A2107PasCod = "" ;
      P00YR10_A396EmprCod = new String[] {""} ;
      P00YR10_A252CliCod = new int[1] ;
      P00YR10_A2141SerEst = new String[] {""} ;
      P00YR10_A1013DibCli = new String[] {""} ;
      P00YR10_A1014DibInt = new int[1] ;
      P00YR10_A2074ColCom = new String[] {""} ;
      P00YR10_A2078ColFon = new String[] {""} ;
      P00YR10_A2096ForObsTxt = new String[] {""} ;
      P00YR10_n2096ForObsTxt = new boolean[] {false} ;
      P00YR10_A2095ForObsLin = new byte[1] ;
      A2096ForObsTxt = "" ;
      AV26ForObsTxt = "" ;
      W2096ForObsTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdufoes__default(),
         new Object[] {
             new Object[] {
            P00YR2_A396EmprCod, P00YR2_A252CliCod, P00YR2_A2141SerEst, P00YR2_A1013DibCli, P00YR2_A1014DibInt, P00YR2_A2074ColCom, P00YR2_A2078ColFon, P00YR2_A13123DGAltCab, P00YR2_n13123DGAltCab, P00YR2_A13121DGDespID,
            P00YR2_n13121DGDespID, P00YR2_A13119DGPerfID, P00YR2_n13119DGPerfID, P00YR2_A13117DGCalID, P00YR2_n13117DGCalID, P00YR2_A11717ClaveIdUlt, P00YR2_n11717ClaveIdUlt, P00YR2_A10770ColGrm2, P00YR2_n10770ColGrm2, P00YR2_A8419ColNomCol,
            P00YR2_n8419ColNomCol, P00YR2_A499GrpFamCod, P00YR2_n499GrpFamCod, P00YR2_A7028ColBmp, P00YR2_n7028ColBmp, P00YR2_A5336ColCodExt, P00YR2_n5336ColCodExt, P00YR2_A583IntCod, P00YR2_n583IntCod, P00YR2_A2097ForObsULin,
            P00YR2_n2097ForObsULin, P00YR2_A2076ColEstMba, P00YR2_n2076ColEstMba, P00YR2_A2079ColMolCil, P00YR2_n2079ColMolCil
            }
            , new Object[] {
            }
            , new Object[] {
            P00YR4_A396EmprCod, P00YR4_A252CliCod, P00YR4_A2141SerEst, P00YR4_A1013DibCli, P00YR4_A1014DibInt, P00YR4_A2074ColCom, P00YR4_A2078ColFon, P00YR4_A2098MolCod, P00YR4_A11759TaesId2, P00YR4_n11759TaesId2,
            P00YR4_A9608MolPorVar, P00YR4_n9608MolPorVar, P00YR4_A8052Dg_codigo, P00YR4_n8052Dg_codigo, P00YR4_A4420MolCol, P00YR4_n4420MolCol, P00YR4_A2655PasForUL, P00YR4_n2655PasForUL, P00YR4_A2649MolPesMax, P00YR4_n2649MolPesMax,
            P00YR4_A2648MolForEst, P00YR4_n2648MolForEst, P00YR4_A2650MolPesMin, P00YR4_n2650MolPesMin, P00YR4_A2536ForPrdUL, P00YR4_n2536ForPrdUL, P00YR4_A2100MolCon, P00YR4_n2100MolCon
            }
            , new Object[] {
            }
            , new Object[] {
            P00YR6_A396EmprCod, P00YR6_A252CliCod, P00YR6_A2141SerEst, P00YR6_A1013DibCli, P00YR6_A1014DibInt, P00YR6_A2074ColCom, P00YR6_A2078ColFon, P00YR6_A2535ForPrdLin, P00YR6_A2098MolCod, P00YR6_A6046PrdForPar,
            P00YR6_n6046PrdForPar, P00YR6_A2116PrdForCan, P00YR6_n2116PrdForCan, P00YR6_A2144UniEstCod, P00YR6_n2144UniEstCod, P00YR6_A719PrdNum, P00YR6_n719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P00YR8_A396EmprCod, P00YR8_A252CliCod, P00YR8_A2141SerEst, P00YR8_A1013DibCli, P00YR8_A1014DibInt, P00YR8_A2074ColCom, P00YR8_A2078ColFon, P00YR8_A2654PasForLin, P00YR8_A2098MolCod, P00YR8_A6050PasForCanP,
            P00YR8_n6050PasForCanP, P00YR8_A6043PasForPar, P00YR8_n6043PasForPar, P00YR8_A2110PasForCon, P00YR8_n2110PasForCon, P00YR8_A2112PasForSob, P00YR8_n2112PasForSob, P00YR8_A2111PasForPre, P00YR8_n2111PasForPre, P00YR8_A2109PasForCan,
            P00YR8_n2109PasForCan, P00YR8_A2144UniEstCod, P00YR8_n2144UniEstCod, P00YR8_A2107PasCod, P00YR8_n2107PasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00YR10_A396EmprCod, P00YR10_A252CliCod, P00YR10_A2141SerEst, P00YR10_A1013DibCli, P00YR10_A1014DibInt, P00YR10_A2074ColCom, P00YR10_A2078ColFon, P00YR10_A2096ForObsTxt, P00YR10_n2096ForObsTxt, P00YR10_A2095ForObsLin
            }
            , new Object[] {
            }
         }
      );
      AV34Pgmname = "Pdufoes" ;
      /* GeneXus formulas. */
      AV34Pgmname = "Pdufoes" ;
      Gx_err = (short)(0) ;
   }

   private byte A499GrpFamCod ;
   private byte A583IntCod ;
   private byte A2097ForObsULin ;
   private byte A2098MolCod ;
   private byte AV22MolCod ;
   private byte W2098MolCod ;
   private byte A2095ForObsLin ;
   private byte AV25ForObsLin ;
   private byte W2095ForObsLin ;
   private short A13121DGDespID ;
   private short A13119DGPerfID ;
   private short A13117DGCalID ;
   private short A11717ClaveIdUlt ;
   private short A2079ColMolCil ;
   private short Gx_err ;
   private short A9608MolPorVar ;
   private short A8052Dg_codigo ;
   private short A2655PasForUL ;
   private short A2536ForPrdUL ;
   private short A2535ForPrdLin ;
   private short A6046PrdForPar ;
   private short AV23ForPrdLin ;
   private short W2535ForPrdLin ;
   private short A2654PasForLin ;
   private short A6043PasForPar ;
   private short AV24PasForLin ;
   private short W2654PasForLin ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV15CliCod ;
   private int AV18DibInt ;
   private int W252CliCod ;
   private int W1014DibInt ;
   private int GX_INS556 ;
   private int GX_INS557 ;
   private int GX_INS558 ;
   private int GX_INS581 ;
   private int GX_INS559 ;
   private java.math.BigDecimal A13123DGAltCab ;
   private java.math.BigDecimal A10770ColGrm2 ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal A2649MolPesMax ;
   private java.math.BigDecimal A2650MolPesMin ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A2116PrdForCan ;
   private java.math.BigDecimal A6050PasForCanP ;
   private java.math.BigDecimal A2110PasForCon ;
   private java.math.BigDecimal A2112PasForSob ;
   private java.math.BigDecimal A2111PasForPre ;
   private java.math.BigDecimal A2109PasForCan ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String AV16SerEst ;
   private String AV17DibCli ;
   private String AV19ColCom ;
   private String AV20ColFon ;
   private String AV27Station ;
   private String GXv_char1[] ;
   private String AV28EmprNom ;
   private String GXv_char2[] ;
   private String AV29UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A8419ColNomCol ;
   private String A7028ColBmp ;
   private String A5336ColCodExt ;
   private String W2141SerEst ;
   private String W1013DibCli ;
   private String W2074ColCom ;
   private String W2078ColFon ;
   private String AV34Pgmname ;
   private String Gx_emsg ;
   private String A11759TaesId2 ;
   private String A4420MolCol ;
   private String A2648MolForEst ;
   private String A2144UniEstCod ;
   private String A719PrdNum ;
   private String A2107PasCod ;
   private String A2096ForObsTxt ;
   private String AV26ForObsTxt ;
   private String W2096ForObsTxt ;
   private boolean n13123DGAltCab ;
   private boolean n13121DGDespID ;
   private boolean n13119DGPerfID ;
   private boolean n13117DGCalID ;
   private boolean n11717ClaveIdUlt ;
   private boolean n10770ColGrm2 ;
   private boolean n8419ColNomCol ;
   private boolean n499GrpFamCod ;
   private boolean n7028ColBmp ;
   private boolean n5336ColCodExt ;
   private boolean n583IntCod ;
   private boolean n2097ForObsULin ;
   private boolean n2076ColEstMba ;
   private boolean n2079ColMolCil ;
   private boolean n11759TaesId2 ;
   private boolean n9608MolPorVar ;
   private boolean n8052Dg_codigo ;
   private boolean n4420MolCol ;
   private boolean n2655PasForUL ;
   private boolean n2649MolPesMax ;
   private boolean n2648MolForEst ;
   private boolean n2650MolPesMin ;
   private boolean n2536ForPrdUL ;
   private boolean n2100MolCon ;
   private boolean n6046PrdForPar ;
   private boolean n2116PrdForCan ;
   private boolean n2144UniEstCod ;
   private boolean n719PrdNum ;
   private boolean n6050PasForCanP ;
   private boolean n6043PasForPar ;
   private boolean n2110PasForCon ;
   private boolean n2112PasForSob ;
   private boolean n2111PasForPre ;
   private boolean n2109PasForCan ;
   private boolean n2107PasCod ;
   private boolean n2096ForObsTxt ;
   private String AV30Inc_obs ;
   private String[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YR2_A396EmprCod ;
   private int[] P00YR2_A252CliCod ;
   private String[] P00YR2_A2141SerEst ;
   private String[] P00YR2_A1013DibCli ;
   private int[] P00YR2_A1014DibInt ;
   private String[] P00YR2_A2074ColCom ;
   private String[] P00YR2_A2078ColFon ;
   private java.math.BigDecimal[] P00YR2_A13123DGAltCab ;
   private boolean[] P00YR2_n13123DGAltCab ;
   private short[] P00YR2_A13121DGDespID ;
   private boolean[] P00YR2_n13121DGDespID ;
   private short[] P00YR2_A13119DGPerfID ;
   private boolean[] P00YR2_n13119DGPerfID ;
   private short[] P00YR2_A13117DGCalID ;
   private boolean[] P00YR2_n13117DGCalID ;
   private short[] P00YR2_A11717ClaveIdUlt ;
   private boolean[] P00YR2_n11717ClaveIdUlt ;
   private java.math.BigDecimal[] P00YR2_A10770ColGrm2 ;
   private boolean[] P00YR2_n10770ColGrm2 ;
   private String[] P00YR2_A8419ColNomCol ;
   private boolean[] P00YR2_n8419ColNomCol ;
   private byte[] P00YR2_A499GrpFamCod ;
   private boolean[] P00YR2_n499GrpFamCod ;
   private String[] P00YR2_A7028ColBmp ;
   private boolean[] P00YR2_n7028ColBmp ;
   private String[] P00YR2_A5336ColCodExt ;
   private boolean[] P00YR2_n5336ColCodExt ;
   private byte[] P00YR2_A583IntCod ;
   private boolean[] P00YR2_n583IntCod ;
   private byte[] P00YR2_A2097ForObsULin ;
   private boolean[] P00YR2_n2097ForObsULin ;
   private java.math.BigDecimal[] P00YR2_A2076ColEstMba ;
   private boolean[] P00YR2_n2076ColEstMba ;
   private short[] P00YR2_A2079ColMolCil ;
   private boolean[] P00YR2_n2079ColMolCil ;
   private String[] P00YR4_A396EmprCod ;
   private int[] P00YR4_A252CliCod ;
   private String[] P00YR4_A2141SerEst ;
   private String[] P00YR4_A1013DibCli ;
   private int[] P00YR4_A1014DibInt ;
   private String[] P00YR4_A2074ColCom ;
   private String[] P00YR4_A2078ColFon ;
   private byte[] P00YR4_A2098MolCod ;
   private String[] P00YR4_A11759TaesId2 ;
   private boolean[] P00YR4_n11759TaesId2 ;
   private short[] P00YR4_A9608MolPorVar ;
   private boolean[] P00YR4_n9608MolPorVar ;
   private short[] P00YR4_A8052Dg_codigo ;
   private boolean[] P00YR4_n8052Dg_codigo ;
   private String[] P00YR4_A4420MolCol ;
   private boolean[] P00YR4_n4420MolCol ;
   private short[] P00YR4_A2655PasForUL ;
   private boolean[] P00YR4_n2655PasForUL ;
   private java.math.BigDecimal[] P00YR4_A2649MolPesMax ;
   private boolean[] P00YR4_n2649MolPesMax ;
   private String[] P00YR4_A2648MolForEst ;
   private boolean[] P00YR4_n2648MolForEst ;
   private java.math.BigDecimal[] P00YR4_A2650MolPesMin ;
   private boolean[] P00YR4_n2650MolPesMin ;
   private short[] P00YR4_A2536ForPrdUL ;
   private boolean[] P00YR4_n2536ForPrdUL ;
   private java.math.BigDecimal[] P00YR4_A2100MolCon ;
   private boolean[] P00YR4_n2100MolCon ;
   private String[] P00YR6_A396EmprCod ;
   private int[] P00YR6_A252CliCod ;
   private String[] P00YR6_A2141SerEst ;
   private String[] P00YR6_A1013DibCli ;
   private int[] P00YR6_A1014DibInt ;
   private String[] P00YR6_A2074ColCom ;
   private String[] P00YR6_A2078ColFon ;
   private short[] P00YR6_A2535ForPrdLin ;
   private byte[] P00YR6_A2098MolCod ;
   private short[] P00YR6_A6046PrdForPar ;
   private boolean[] P00YR6_n6046PrdForPar ;
   private java.math.BigDecimal[] P00YR6_A2116PrdForCan ;
   private boolean[] P00YR6_n2116PrdForCan ;
   private String[] P00YR6_A2144UniEstCod ;
   private boolean[] P00YR6_n2144UniEstCod ;
   private String[] P00YR6_A719PrdNum ;
   private boolean[] P00YR6_n719PrdNum ;
   private String[] P00YR8_A396EmprCod ;
   private int[] P00YR8_A252CliCod ;
   private String[] P00YR8_A2141SerEst ;
   private String[] P00YR8_A1013DibCli ;
   private int[] P00YR8_A1014DibInt ;
   private String[] P00YR8_A2074ColCom ;
   private String[] P00YR8_A2078ColFon ;
   private short[] P00YR8_A2654PasForLin ;
   private byte[] P00YR8_A2098MolCod ;
   private java.math.BigDecimal[] P00YR8_A6050PasForCanP ;
   private boolean[] P00YR8_n6050PasForCanP ;
   private short[] P00YR8_A6043PasForPar ;
   private boolean[] P00YR8_n6043PasForPar ;
   private java.math.BigDecimal[] P00YR8_A2110PasForCon ;
   private boolean[] P00YR8_n2110PasForCon ;
   private java.math.BigDecimal[] P00YR8_A2112PasForSob ;
   private boolean[] P00YR8_n2112PasForSob ;
   private java.math.BigDecimal[] P00YR8_A2111PasForPre ;
   private boolean[] P00YR8_n2111PasForPre ;
   private java.math.BigDecimal[] P00YR8_A2109PasForCan ;
   private boolean[] P00YR8_n2109PasForCan ;
   private String[] P00YR8_A2144UniEstCod ;
   private boolean[] P00YR8_n2144UniEstCod ;
   private String[] P00YR8_A2107PasCod ;
   private boolean[] P00YR8_n2107PasCod ;
   private String[] P00YR10_A396EmprCod ;
   private int[] P00YR10_A252CliCod ;
   private String[] P00YR10_A2141SerEst ;
   private String[] P00YR10_A1013DibCli ;
   private int[] P00YR10_A1014DibInt ;
   private String[] P00YR10_A2074ColCom ;
   private String[] P00YR10_A2078ColFon ;
   private String[] P00YR10_A2096ForObsTxt ;
   private boolean[] P00YR10_n2096ForObsTxt ;
   private byte[] P00YR10_A2095ForObsLin ;
}

final  class pdufoes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YR2", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, DGAltCab, DGDespID, DGPerfID, DGCalID, ClaveIdUlt, ColGrm2, ColNomCol, GrpFamCod, ColBmp, ColCodExt, IntCod, ForObsULin, ColEstMba, ColMolCil FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00YR3", "INSERT INTO TXPCFORES(EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ColMolCil, ColEstMba, ForObsULin, IntCod, ColCodExt, ColBmp, GrpFamCod, ColNomCol, ColGrm2, ClaveIdUlt, DGCalID, DGPerfID, DGDespID, DGAltCab) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORES")
         ,new ForEachCursor("P00YR4", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, TaesId2, MolPorVar, Dg_codigo, MolCol, PasForUL, MolPesMax, MolForEst, MolPesMin, ForPrdUL, MolCon FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YR5", "INSERT INTO TXPMFORES(EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolCon, ForPrdUL, MolPesMin, MolForEst, MolPesMax, PasForUL, MolCol, Dg_codigo, MolPorVar, TaesId2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFORES")
         ,new ForEachCursor("P00YR6", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForPrdLin, MolCod, PrdForPar, PrdForCan, UniEstCod, PrdNum FROM TXPRECPR2 WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YR7", "INSERT INTO TXPRECPR2(EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin, PrdNum, UniEstCod, PrdForCan, PrdForPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECPR2")
         ,new ForEachCursor("P00YR8", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, PasForLin, MolCod, PasForCanP, PasForPar, PasForCon, PasForSob, PasForPre, PasForCan, UniEstCod, PasCod FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YR9", "INSERT INTO TXPPASFOR(EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin, PasCod, UniEstCod, PasForCan, PasForPre, PasForSob, PasForCon, PasForPar, PasForCanP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPASFOR")
         ,new ForEachCursor("P00YR10", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsTxt, ForObsLin FROM TXPFOROBS WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YR11", "INSERT INTO TXPFOROBS(EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsLin, ForObsTxt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFOROBS")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 128);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(21);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 128);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[22], 40);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[34], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[11]).shortValue());
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
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[27], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
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
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[16]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
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
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[18], 3);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[20], 3);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[24], 3);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
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
      }
   }

}

