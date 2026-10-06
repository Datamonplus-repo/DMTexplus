package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfactinse extends GXReport
{
   public pfactinse( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfactinse.class ), "" );
   }

   public pfactinse( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pfactinse.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pfactinse.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfactinse.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfactinse.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      pfactinse.this.AV16ValEuro = aP3[0];
      this.aP3 = aP3;
      pfactinse.this.AV93TextoCopia = aP4[0];
      this.aP4 = aP4;
      pfactinse.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      pfactinse.this.AV111Agrupo_f = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 12 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FACTURA SEM ENCOMENDA*") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*12)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV49SumSig = DecimalUtil.doubleToDec(0) ;
         AV62CtrlPag = (byte)(0) ;
         AV80NumLin = (byte)(1) ;
         GXt_char1 = AV129FirmaD ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char1 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         pfactinse.this.A396EmprCod = GXv_char2[0] ;
         pfactinse.this.GXt_char1 = GXv_char4[0] ;
         AV129FirmaD = GXt_char1 ;
         GXt_char1 = AV130NumCer ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "CERNUM", "") ;
         GXv_char2[0] = GXt_char1 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         pfactinse.this.A396EmprCod = GXv_char4[0] ;
         pfactinse.this.GXt_char1 = GXv_char2[0] ;
         AV130NumCer = GXt_char1 ;
         GxHdr2 = true ;
         /* Using cursor P02LJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7210FacObs = P02LJ2_A7210FacObs[0] ;
            A1153FacTipFac = P02LJ2_A1153FacTipFac[0] ;
            A9605FacFirma = P02LJ2_A9605FacFirma[0] ;
            A437FacFpg = P02LJ2_A437FacFpg[0] ;
            A450FacPri = P02LJ2_A450FacPri[0] ;
            A2739FacSerNum = P02LJ2_A2739FacSerNum[0] ;
            A435FacEst = P02LJ2_A435FacEst[0] ;
            A11273FacObs2 = P02LJ2_A11273FacObs2[0] ;
            A252CliCod = P02LJ2_A252CliCod[0] ;
            A436FacFch = P02LJ2_A436FacFch[0] ;
            A11513FacRecIca = P02LJ2_A11513FacRecIca[0] ;
            A8346FacRecI = P02LJ2_A8346FacRecI[0] ;
            n8346FacRecI = P02LJ2_n8346FacRecI[0] ;
            A7212FacRect = P02LJ2_A7212FacRect[0] ;
            A453FacRECPor = P02LJ2_A453FacRECPor[0] ;
            A14224FacCostFac = P02LJ2_A14224FacCostFac[0] ;
            A14223FacCostKgs = P02LJ2_A14223FacCostKgs[0] ;
            A14222FacCostMts = P02LJ2_A14222FacCostMts[0] ;
            A433FacDtoGen = P02LJ2_A433FacDtoGen[0] ;
            A443FacIVAPor = P02LJ2_A443FacIVAPor[0] ;
            A434FacDtoPP = P02LJ2_A434FacDtoPP[0] ;
            A14219FacEnergia = P02LJ2_A14219FacEnergia[0] ;
            /* Using cursor P02LJ3 */
            pr_default.execute(1, new Object[] {A396EmprCod});
            A7209Colombia = P02LJ3_A7209Colombia[0] ;
            n7209Colombia = P02LJ3_n7209Colombia[0] ;
            /* Using cursor P02LJ5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(2) != 101) )
            {
               A3918FacImpTot1 = P02LJ5_A3918FacImpTot1[0] ;
            }
            else
            {
               A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
            }
            A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
            A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
               }
               else
               {
                  A440FacImpPP = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               }
               else
               {
                  A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               }
            }
            A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
            A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
            A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
            A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
               }
               else
               {
                  A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
               }
               else
               {
                  A452FacRecImp = DecimalUtil.doubleToDec(0) ;
               }
            }
            A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
               }
               else
               {
                  A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
               }
            }
            A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
               }
               else
               {
                  A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
               }
            }
            A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
            A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
            /* Using cursor P02LJ6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            A4828CliCp2 = P02LJ6_A4828CliCp2[0] ;
            A256CliCp = P02LJ6_A256CliCp[0] ;
            A278CliNif = P02LJ6_A278CliNif[0] ;
            A295CliPob = P02LJ6_A295CliPob[0] ;
            A260CliDom = P02LJ6_A260CliDom[0] ;
            A279CliNom = P02LJ6_A279CliNom[0] ;
            AV131Texto_fd = " " ;
            if ( GXutil.strcmp(A9605FacFirma, " ") != 0 )
            {
               AV132Firma4dig = GXutil.substring( A9605FacFirma, 1, 1) + GXutil.substring( A9605FacFirma, 11, 1) + GXutil.substring( A9605FacFirma, 21, 1) + GXutil.substring( A9605FacFirma, 31, 1) ;
               AV131Texto_fd = AV132Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV129FirmaD) + httpContext.getMessage( "/DGCI", "") ;
            }
            else
            {
               if ( GXutil.strcmp(AV130NumCer, " ") != 0 )
               {
                  AV131Texto_fd = httpContext.getMessage( "Processado por Computador,", "") + httpContext.getMessage( "Certificado nº. ", "") + GXutil.trim( AV130NumCer) ;
               }
               else
               {
                  AV131Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
               }
            }
            AV79CliNif = A278CliNif ;
            AV23FpgCod = A437FacFpg ;
            /* Execute user subroutine: 'FORPAG' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV61DesPago = GXutil.substring( AV24FpgDsc, 1, 16) ;
            AV97IvaPor = A443FacIVAPor ;
            AV58FlagPag = (byte)(0) ;
            AV56CliCod = A252CliCod ;
            AV51CliPri = A450FacPri ;
            AV85FacFch = A436FacFch ;
            if ( (GXutil.strcmp("", A4828CliCp2)==0) )
            {
               AV128Cpostal = A256CliCp ;
            }
            else
            {
               AV128Cpostal = A256CliCp + "-" + A4828CliCp2 ;
            }
            AV92Paso = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV37Vencim[GX_I-1] = GXutil.nullDate() ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P02LJ7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A956FacVtoLin = P02LJ7_A956FacVtoLin[0] ;
               A957FacVtoFch = P02LJ7_A957FacVtoFch[0] ;
               n957FacVtoFch = P02LJ7_n957FacVtoFch[0] ;
               AV92Paso = (byte)(AV92Paso+1) ;
               AV37Vencim[AV92Paso-1] = A957FacVtoFch ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV68FacImpTot = A441FacImpTot ;
            AV69FacImpPP = (long)(DecimalUtil.decToDouble(A440FacImpPP)) ;
            AV70FacIvaImp = A442FacIVAImp ;
            AV71FacTot = A455FacTot ;
            AV81FacBasImp = A429FacBasImp ;
            AV78TotFac = GXutil.roundDecimal( (A455FacTot.multiply(AV16ValEuro)), 0) ;
            AV124FraMan = A2739FacSerNum ;
            if ( A1153FacTipFac == 0 )
            {
               AV125ContCod = "040200" ;
            }
            else if ( A1153FacTipFac == 1 )
            {
               AV125ContCod = "050200" ;
            }
            else if ( A1153FacTipFac == 2 )
            {
               AV125ContCod = "050300" ;
            }
            else
            {
            }
            GXt_char1 = AV126ContDsc3 ;
            GXv_char4[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, AV125ContCod, GXv_char4) ;
            pfactinse.this.GXt_char1 = GXv_char4[0] ;
            AV126ContDsc3 = GXt_char1 ;
            if ( GXutil.strcmp(AV126ContDsc3, " ") == 0 )
            {
               if ( A1153FacTipFac == 0 )
               {
                  AV126ContDsc3 = httpContext.getMessage( "Fatura Nº ", "") ;
               }
               else if ( A1153FacTipFac == 1 )
               {
                  AV126ContDsc3 = httpContext.getMessage( "Nota Debito Nº ", "") ;
               }
               else if ( A1153FacTipFac == 2 )
               {
                  AV126ContDsc3 = httpContext.getMessage( "Nota Credito Nº ", "") ;
               }
               else
               {
               }
            }
            AV126ContDsc3 = GXutil.trim( AV126ContDsc3) ;
            AV80NumLin = (byte)(0) ;
            AV96FlagNoFin = (byte)(1) ;
            /* Using cursor P02LJ8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               brk2LJ5 = false ;
               A427FacAlbCod = P02LJ8_A427FacAlbCod[0] ;
               A1498FacDisNum = P02LJ8_A1498FacDisNum[0] ;
               A454FacSer = P02LJ8_A454FacSer[0] ;
               A428FacAlbTip = P02LJ8_A428FacAlbTip[0] ;
               A448FacPreKgs = P02LJ8_A448FacPreKgs[0] ;
               A444FacKgs = P02LJ8_A444FacKgs[0] ;
               A449FacPreMts = P02LJ8_A449FacPreMts[0] ;
               A447FacMts = P02LJ8_A447FacMts[0] ;
               A432FacDsc = P02LJ8_A432FacDsc[0] ;
               A446FacLin = P02LJ8_A446FacLin[0] ;
               A3397FacFasCod = P02LJ8_A3397FacFasCod[0] ;
               A1296FacBarPar = P02LJ8_A1296FacBarPar[0] ;
               A1295FacBarReo = P02LJ8_A1295FacBarReo[0] ;
               A1294FacBarCod = P02LJ8_A1294FacBarCod[0] ;
               A4814FacEncCli = P02LJ8_A4814FacEncCli[0] ;
               if ( ( GXutil.strcmp(AV124FraMan, httpContext.getMessage( "M", "")) != 0 ) && ( A1153FacTipFac == 0 ) )
               {
                  if ( AV80NumLin >= 30 )
                  {
                     /* Execute user subroutine: 'PIE' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(3);
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(0);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                     AV80NumLin = (byte)(1) ;
                  }
                  AV103AlbProCod = A427FacAlbCod ;
                  if ( A428FacAlbTip == 1 )
                  {
                     GXt_char1 = AV123VarAux ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, "666666", GXv_char4) ;
                     pfactinse.this.GXt_char1 = GXv_char4[0] ;
                     AV123VarAux = GXt_char1 ;
                     AV121Contdsc2 = GXutil.trim( GXutil.substring( AV123VarAux, 1, 30)) ;
                     if ( GXutil.strcmp(AV121Contdsc2, " ") == 0 )
                     {
                        AV121Contdsc2 = httpContext.getMessage( "Guia de Remessa Nº ", "") ;
                     }
                     /* Execute user subroutine: 'CALPRD' */
                     S141 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(3);
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(0);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  else
                  {
                     GXt_char1 = AV123VarAux ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, "100011", GXv_char4) ;
                     pfactinse.this.GXt_char1 = GXv_char4[0] ;
                     AV123VarAux = GXt_char1 ;
                     AV121Contdsc2 = GXutil.trim( GXutil.substring( AV123VarAux, 1, 30)) ;
                     if ( GXutil.strcmp(AV121Contdsc2, " ") == 0 )
                     {
                        AV121Contdsc2 = httpContext.getMessage( "Saidas Diversas Nº ", "") ;
                     }
                     /* Execute user subroutine: 'CALCOM' */
                     S151 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(3);
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(0);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  if ( GXutil.strcmp(AV124FraMan, httpContext.getMessage( "M", "")) != 0 )
                  {
                     h2LJ0( false, 19) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9")), 333, Gx_line+0, 407, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 425, Gx_line+0, 441, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV102AlbProFch, "99/99/99"), 451, Gx_line+0, 510, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Contdsc2, "")), 109, Gx_line+0, 329, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                     AV80NumLin = (byte)(AV80NumLin+1) ;
                  }
                  AV98Last_Enc = GXutil.space( (short)(20)) ;
                  AV32FacAlbCod = A427FacAlbCod ;
                  AV116Last_hdr = "" ;
               }
               while ( (pr_default.getStatus(5) != 101) && ( P02LJ8_A427FacAlbCod[0] == A427FacAlbCod ) )
               {
                  brk2LJ5 = false ;
                  A1498FacDisNum = P02LJ8_A1498FacDisNum[0] ;
                  A454FacSer = P02LJ8_A454FacSer[0] ;
                  A428FacAlbTip = P02LJ8_A428FacAlbTip[0] ;
                  A448FacPreKgs = P02LJ8_A448FacPreKgs[0] ;
                  A444FacKgs = P02LJ8_A444FacKgs[0] ;
                  A449FacPreMts = P02LJ8_A449FacPreMts[0] ;
                  A447FacMts = P02LJ8_A447FacMts[0] ;
                  A432FacDsc = P02LJ8_A432FacDsc[0] ;
                  A446FacLin = P02LJ8_A446FacLin[0] ;
                  A3397FacFasCod = P02LJ8_A3397FacFasCod[0] ;
                  A1296FacBarPar = P02LJ8_A1296FacBarPar[0] ;
                  A1295FacBarReo = P02LJ8_A1295FacBarReo[0] ;
                  A1294FacBarCod = P02LJ8_A1294FacBarCod[0] ;
                  A4814FacEncCli = P02LJ8_A4814FacEncCli[0] ;
                  if ( GXutil.strcmp(P02LJ8_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P02LJ8_A430FacCod[0] == A430FacCod )
                     {
                        /* Using cursor P02LJ9 */
                        pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
                        A1153FacTipFac = P02LJ9_A1153FacTipFac[0] ;
                        pr_default.close(6);
                        if ( ( GXutil.strcmp(AV124FraMan, httpContext.getMessage( "M", "")) != 0 ) && ( A1153FacTipFac == 0 ) )
                        {
                           AV99Nueves9 = "99999999" ;
                           AV101Hdr_8 = GXutil.str( A1294FacBarCod, 8, 0) ;
                           AV101Hdr_8 = GXutil.ltrim( GXutil.rtrim( AV101Hdr_8)) ;
                           AV100LenVar = (byte)(GXutil.len( AV101Hdr_8)) ;
                           AV100LenVar = (byte)(8-AV100LenVar) ;
                           AV101Hdr_8 = GXutil.substring( AV99Nueves9, 1, AV100LenVar) + AV101Hdr_8 ;
                           AV88Hdr = AV101Hdr_8 + "-" + GXutil.str( A1295FacBarReo, 1, 0) + GXutil.ltrim( A1296FacBarPar) ;
                           AV118Hdr11 = GXutil.str( A1294FacBarCod, 8, 0) + "-" + GXutil.str( A1295FacBarReo, 1, 0) + GXutil.ltrim( A1296FacBarPar) ;
                           AV104BarEncCli = GXutil.substring( A4814FacEncCli, 1, 12) ;
                           AV82BarSerDsc = " " ;
                           AV63BarCod = A1294FacBarCod ;
                           AV64BarCodReo = A1295FacBarReo ;
                           AV65BarCodPar = A1296FacBarPar ;
                           /* Execute user subroutine: 'BARCAD' */
                           S121 ();
                           if ( returnInSub )
                           {
                              pr_default.close(6);
                              pr_default.close(5);
                              pr_default.close(3);
                              pr_default.close(2);
                              pr_default.close(1);
                              getPrinter().GxEndPage() ;
                              /* Close printer file */
                              getPrinter().GxEndDocument() ;
                              endPrinter();
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                           /* Using cursor P02LJ10 */
                           pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar});
                           while ( (pr_default.getStatus(7) != 101) )
                           {
                              A129BarCod = P02LJ10_A129BarCod[0] ;
                              A132BarCodReo = P02LJ10_A132BarCodReo[0] ;
                              A130BarCodPar = P02LJ10_A130BarCodPar[0] ;
                              A30AlbProCod = P02LJ10_A30AlbProCod[0] ;
                              A1265BarAlbPie = P02LJ10_A1265BarAlbPie[0] ;
                              AV89Piezas = A1265BarAlbPie ;
                              /* Exiting from a For First loop. */
                              if (true) break;
                           }
                           pr_default.close(7);
                           AV94FacDisNum = GXutil.substring( A1498FacDisNum, 1, 6) ;
                           AV105L_Artigo = GXutil.trim( A454FacSer) + " " + GXutil.trim( AV82BarSerDsc) ;
                           if ( A428FacAlbTip == 1 )
                           {
                              if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
                              {
                                 AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                 AV91Precio = A448FacPreKgs ;
                                 AV95FacKgs = A444FacKgs ;
                                 if ( AV80NumLin >= 30 )
                                 {
                                    /* Execute user subroutine: 'PIE' */
                                    S111 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(6);
                                       pr_default.close(5);
                                       pr_default.close(3);
                                       pr_default.close(2);
                                       pr_default.close(1);
                                       getPrinter().GxEndPage() ;
                                       /* Close printer file */
                                       getPrinter().GxEndDocument() ;
                                       endPrinter();
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                    AV80NumLin = (byte)(1) ;
                                 }
                                 AV133ImpLineaKilos = (byte)(0) ;
                                 if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() > 0 ) )
                                 {
                                    h2LJ0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Hdr, "")), 44, Gx_line+0, 125, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105L_Artigo, "")), 126, Gx_line+0, 390, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 392, Gx_line+0, 488, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84BarColNum), "ZZZZZZ")), 490, Gx_line+0, 535, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95FacKgs, "ZZZZZZ.ZZ")), 543, Gx_line+0, 610, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "K", ""), 609, Gx_line+0, 617, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 691, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                    AV80NumLin = (byte)(AV80NumLin+1) ;
                                    AV133ImpLineaKilos = (byte)(1) ;
                                 }
                                 if ( ( A449FacPreMts.doubleValue() > 0 ) && ( AV133ImpLineaKilos == 1 ) )
                                 {
                                    AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV91Precio = A449FacPreMts ;
                                    AV122FacMts = A447FacMts ;
                                    if ( AV80NumLin >= 30 )
                                    {
                                       /* Execute user subroutine: 'PIE' */
                                       S111 ();
                                       if ( returnInSub )
                                       {
                                          pr_default.close(6);
                                          pr_default.close(5);
                                          pr_default.close(3);
                                          pr_default.close(2);
                                          pr_default.close(1);
                                          getPrinter().GxEndPage() ;
                                          /* Close printer file */
                                          getPrinter().GxEndDocument() ;
                                          endPrinter();
                                          returnInSub = true;
                                          cleanup();
                                          if (true) return;
                                       }
                                       /* Eject command */
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(P_lines+1) ;
                                       AV80NumLin = (byte)(1) ;
                                    }
                                    h2LJ0( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV122FacMts, "ZZZZZZ.ZZ")), 543, Gx_line+0, 610, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 609, Gx_line+0, 617, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 691, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                                 if ( A444FacKgs.doubleValue() == 0 )
                                 {
                                    if ( A449FacPreMts.doubleValue() > 0 )
                                    {
                                       AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                       AV91Precio = A449FacPreMts ;
                                       AV122FacMts = A447FacMts ;
                                       h2LJ0( false, 18) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Hdr, "")), 44, Gx_line+0, 125, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105L_Artigo, "")), 126, Gx_line+0, 390, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 392, Gx_line+0, 488, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84BarColNum), "ZZZZZZ")), 490, Gx_line+0, 535, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV122FacMts, "ZZZZZZ.ZZ")), 543, Gx_line+0, 610, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 691, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 609, Gx_line+0, 617, Gx_line+15, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+18) ;
                                    }
                                    else
                                    {
                                       h2LJ0( false, 16) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Hdr, "")), 44, Gx_line+0, 125, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105L_Artigo, "")), 126, Gx_line+0, 390, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 392, Gx_line+0, 488, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84BarColNum), "ZZZZZZ")), 490, Gx_line+0, 535, Gx_line+16, 2+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+16) ;
                                    }
                                    AV80NumLin = (byte)(AV80NumLin+1) ;
                                 }
                              }
                           }
                           if ( ! (GXutil.strcmp("", A3397FacFasCod)==0) )
                           {
                              /* Using cursor P02LJ11 */
                              pr_default.execute(8, new Object[] {A396EmprCod, A3397FacFasCod});
                              while ( (pr_default.getStatus(8) != 101) )
                              {
                                 A457FasCod = P02LJ11_A457FasCod[0] ;
                                 AV90FacDsc = A432FacDsc ;
                                 /* Exiting from a For First loop. */
                                 if (true) break;
                              }
                              pr_default.close(8);
                              if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                              {
                                 AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                 AV91Precio = A448FacPreKgs ;
                                 if ( AV80NumLin >= 30 )
                                 {
                                    /* Execute user subroutine: 'PIE' */
                                    S111 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(6);
                                       pr_default.close(5);
                                       pr_default.close(3);
                                       pr_default.close(2);
                                       pr_default.close(1);
                                       getPrinter().GxEndPage() ;
                                       /* Close printer file */
                                       getPrinter().GxEndDocument() ;
                                       endPrinter();
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                    AV80NumLin = (byte)(1) ;
                                 }
                                 h2LJ0( false, 15) ;
                                 getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90FacDsc, "")), 126, Gx_line+0, 419, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 543, Gx_line+0, 610, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "K", ""), 609, Gx_line+0, 617, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 691, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+15) ;
                                 AV80NumLin = (byte)(AV80NumLin+1) ;
                              }
                              if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) )
                              {
                                 AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                 AV91Precio = A449FacPreMts ;
                                 if ( AV80NumLin >= 30 )
                                 {
                                    /* Execute user subroutine: 'PIE' */
                                    S111 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(6);
                                       pr_default.close(5);
                                       pr_default.close(3);
                                       pr_default.close(2);
                                       pr_default.close(1);
                                       getPrinter().GxEndPage() ;
                                       /* Close printer file */
                                       getPrinter().GxEndDocument() ;
                                       endPrinter();
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                    AV80NumLin = (byte)(1) ;
                                 }
                                 h2LJ0( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90FacDsc, "")), 126, Gx_line+0, 419, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 543, Gx_line+0, 610, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 609, Gx_line+0, 617, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 691, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                                 AV80NumLin = (byte)(AV80NumLin+1) ;
                              }
                           }
                           if ( A428FacAlbTip == 2 )
                           {
                              AV67TotLin = DecimalUtil.doubleToDec(0) ;
                              AV91Precio = DecimalUtil.doubleToDec(0) ;
                              AV122FacMts = DecimalUtil.doubleToDec(0) ;
                              AV127Un = "" ;
                              if ( A449FacPreMts.doubleValue() > 0 )
                              {
                                 AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                 AV91Precio = A449FacPreMts ;
                                 AV122FacMts = A447FacMts ;
                                 AV127Un = httpContext.getMessage( "M", "") ;
                              }
                              if ( A448FacPreKgs.doubleValue() > 0 )
                              {
                                 AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                 AV91Precio = A448FacPreKgs ;
                                 AV122FacMts = A444FacKgs ;
                                 AV127Un = httpContext.getMessage( "K", "") ;
                              }
                              if ( AV80NumLin >= 30 )
                              {
                                 /* Execute user subroutine: 'PIE' */
                                 S111 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(6);
                                    pr_default.close(5);
                                    pr_default.close(3);
                                    pr_default.close(2);
                                    pr_default.close(1);
                                    getPrinter().GxEndPage() ;
                                    /* Close printer file */
                                    getPrinter().GxEndDocument() ;
                                    endPrinter();
                                    returnInSub = true;
                                    cleanup();
                                    if (true) return;
                                 }
                                 /* Eject command */
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(P_lines+1) ;
                                 AV80NumLin = (byte)(1) ;
                              }
                              AV122FacMts = A447FacMts ;
                              h2LJ0( false, 16) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 126, Gx_line+0, 419, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV122FacMts, "ZZZZZZ.ZZ")), 543, Gx_line+0, 610, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 645, Gx_line+0, 653, Gx_line+15, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 691, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+16) ;
                              AV80NumLin = (byte)(AV80NumLin+1) ;
                           }
                           AV98Last_Enc = A4814FacEncCli ;
                           AV116Last_hdr = AV118Hdr11 ;
                        }
                        else
                        {
                           AV67TotLin = DecimalUtil.doubleToDec(0) ;
                           AV91Precio = DecimalUtil.doubleToDec(0) ;
                           AV122FacMts = DecimalUtil.doubleToDec(0) ;
                           AV127Un = "" ;
                           if ( AV80NumLin >= 30 )
                           {
                              /* Execute user subroutine: 'PIE' */
                              S111 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(6);
                                 pr_default.close(5);
                                 pr_default.close(3);
                                 pr_default.close(2);
                                 pr_default.close(1);
                                 getPrinter().GxEndPage() ;
                                 /* Close printer file */
                                 getPrinter().GxEndDocument() ;
                                 endPrinter();
                                 returnInSub = true;
                                 cleanup();
                                 if (true) return;
                              }
                              /* Eject command */
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(P_lines+1) ;
                              AV80NumLin = (byte)(1) ;
                           }
                           if ( A449FacPreMts.doubleValue() > 0 )
                           {
                              AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                              AV91Precio = A449FacPreMts ;
                              AV122FacMts = A447FacMts ;
                              AV127Un = httpContext.getMessage( "M", "") ;
                           }
                           if ( A448FacPreKgs.doubleValue() > 0 )
                           {
                              AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                              AV91Precio = A448FacPreKgs ;
                              AV122FacMts = A444FacKgs ;
                              AV127Un = httpContext.getMessage( "K", "") ;
                           }
                           if ( A1153FacTipFac > 0 )
                           {
                              AV127Un = "" ;
                           }
                           h2LJ0( false, 15) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 126, Gx_line+0, 419, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV122FacMts, "ZZZZZZ.ZZ")), 543, Gx_line+0, 610, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 691, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Un, "")), 609, Gx_line+0, 617, Gx_line+16, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+15) ;
                        }
                     }
                  }
                  brk2LJ5 = true ;
                  pr_default.readNext(5);
               }
               if ( ! brk2LJ5 )
               {
                  brk2LJ5 = true ;
                  pr_default.readNext(5);
               }
            }
            pr_default.close(5);
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            AV96FlagNoFin = (byte)(0) ;
            if ( GXutil.strcmp(A9605FacFirma, " ") != 0 )
            {
               AV115i = (short)(1) ;
               AV120Nlin = (short)(GXutil.gxmlines( A11273FacObs2, (short)(60))) ;
               while ( AV115i <= AV120Nlin )
               {
                  AV119Obsf[AV115i-1] = GXutil.gxgetmli( A11273FacObs2, AV115i, (short)(60)) ;
                  AV115i = (short)(AV115i+1) ;
                  if ( AV115i == 6 )
                  {
                     if (true) break;
                  }
               }
            }
            else
            {
               AV115i = (short)(1) ;
               AV120Nlin = (short)(GXutil.gxmlines( A7210FacObs, (short)(60))) ;
               while ( AV115i <= AV120Nlin )
               {
                  AV119Obsf[AV115i-1] = GXutil.gxgetmli( A7210FacObs, AV115i, (short)(60)) ;
                  AV115i = (short)(AV115i+1) ;
                  if ( AV115i == 6 )
                  {
                     if (true) break;
                  }
               }
            }
            /* Using cursor P02LJ12 */
            pr_default.execute(9, new Object[] {Byte.valueOf(A435FacEst), A396EmprCod, Integer.valueOf(A430FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         pr_default.close(1);
         pr_default.close(3);
         pr_default.close(2);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2LJ0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PIE' Routine */
      returnInSub = false ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV82BarSerDsc = "" ;
      AV83BarColNom = "" ;
      AV84BarColNum = 0 ;
      AV104BarEncCli = " " ;
      /* Using cursor P02LJ13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV63BarCod), Byte.valueOf(AV64BarCodReo), AV65BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A130BarCodPar = P02LJ13_A130BarCodPar[0] ;
         A132BarCodReo = P02LJ13_A132BarCodReo[0] ;
         A129BarCod = P02LJ13_A129BarCod[0] ;
         A1652BarSerDsc = P02LJ13_A1652BarSerDsc[0] ;
         A135BarColNom = P02LJ13_A135BarColNom[0] ;
         A136BarColNum = P02LJ13_A136BarColNum[0] ;
         A4812BarEncCli = P02LJ13_A4812BarEncCli[0] ;
         AV82BarSerDsc = A1652BarSerDsc ;
         AV83BarColNom = A135BarColNom ;
         AV84BarColNum = A136BarColNum ;
         AV104BarEncCli = GXutil.substring( A4812BarEncCli, 1, 12) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'FORPAG' Routine */
      returnInSub = false ;
      AV24FpgDsc = "" ;
      /* Using cursor P02LJ14 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV23FpgCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A497FpgCod = P02LJ14_A497FpgCod[0] ;
         A498FpgDsc = P02LJ14_A498FpgDsc[0] ;
         n498FpgDsc = P02LJ14_n498FpgDsc[0] ;
         AV24FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'CALPRD' Routine */
      returnInSub = false ;
      /* Using cursor P02LJ15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(AV103AlbProCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A30AlbProCod = P02LJ15_A30AlbProCod[0] ;
         A34AlbProfch = P02LJ15_A34AlbProfch[0] ;
         AV102AlbProFch = A34AlbProfch ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'CALCOM' Routine */
      returnInSub = false ;
      /* Using cursor P02LJ16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(AV103AlbProCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A14AlbComCod = P02LJ16_A14AlbComCod[0] ;
         A17AlbComFch = P02LJ16_A17AlbComFch[0] ;
         AV102AlbProFch = A17AlbComFch ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void h2LJ0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               if ( AV96FlagNoFin == 0 )
               {
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68FacImpTot, "ZZ,ZZZ,ZZ9.99")), 691, Gx_line+13, 773, Gx_line+29, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71FacTot, "ZZ,ZZZ,ZZ9.99")), 609, Gx_line+130, 773, Gx_line+156, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(475, Gx_line+7, 791, Gx_line+158, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total Iliquido", ""), 483, Gx_line+14, 556, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Desconto Financeiro", ""), 483, Gx_line+39, 601, Gx_line+54, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV69FacImpPP), "ZZ,ZZZ,ZZ9")), 709, Gx_line+39, 773, Gx_line+55, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Base de incidencia de IVA", ""), 483, Gx_line+67, 630, Gx_line+82, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81FacBasImp, "ZZ,ZZZ,ZZ9.99")), 691, Gx_line+67, 773, Gx_line+83, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total de IVA", ""), 483, Gx_line+94, 551, Gx_line+109, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 691, Gx_line+94, 773, Gx_line+110, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 483, Gx_line+132, 538, Gx_line+152, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV97IvaPor), "Z9")), 565, Gx_line+94, 579, Gx_line+110, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("(", 559, Gx_line+94, 564, Gx_line+109, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(")", 589, Gx_line+94, 594, Gx_line+109, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("%", 578, Gx_line+94, 588, Gx_line+109, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("€", 775, Gx_line+131, 787, Gx_line+154, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "f0b5ec6d-9e09-4154-aeb4-96c6278ce3e7", "", context.getHttpContext().getTheme( )), 82, Gx_line+99, 207, Gx_line+158) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "de7fa58a-a50a-431d-823e-699909c78607", "", context.getHttpContext().getTheme( )), 215, Gx_line+99, 263, Gx_line+158) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Obsf[1-1], "")), 24, Gx_line+18, 463, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Obsf[2-1], "")), 24, Gx_line+33, 463, Gx_line+49, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Obsf[3-1], "")), 24, Gx_line+49, 463, Gx_line+65, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Obsf[4-1], "")), 24, Gx_line+65, 463, Gx_line+81, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observações:", ""), 24, Gx_line+3, 104, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Obsf[5-1], "")), 24, Gx_line+80, 463, Gx_line+96, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+200) ;
               }
               else
               {
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+200) ;
               }
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 438, Gx_line+167, 627, Gx_line+185, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 438, Gx_line+186, 652, Gx_line+204, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 510, Gx_line+217, 699, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 678, Gx_line+63, 729, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 653, Gx_line+32, 729, Gx_line+53, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(36, Gx_line+317, 781, Gx_line+351, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página", ""), 685, Gx_line+300, 724, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 739, Gx_line+300, 778, Gx_line+316, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TextoCopia, "")), 561, Gx_line+65, 640, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126ContDsc3, "")), 438, Gx_line+33, 539, Gx_line+54, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128Cpostal, "")), 438, Gx_line+217, 507, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tintutex - Tinturaria e Acabamentos Texteis, Lda", ""), 36, Gx_line+133, 261, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rua Dr. Alberto Sampaio, nº 508, Apartado 287", ""), 36, Gx_line+149, 255, Gx_line+162, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "4760-292 Calendário VILA NOVA DE FAMALICÃO", ""), 36, Gx_line+165, 258, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIF nº 503343102", ""), 36, Gx_line+180, 116, Gx_line+193, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 5, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Soc. quotas-Cap. Social 800.000€ - C.R.C. V.N. FAMALICÃO nº 3659", ""), 36, Gx_line+196, 268, Gx_line+203, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entidade:", ""), 58, Gx_line+333, 113, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Nº Cont.:", ""), 274, Gx_line+333, 335, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 117, Gx_line+333, 162, Gx_line+350, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 341, Gx_line+333, 446, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cond. Pagamento:", ""), 485, Gx_line+333, 593, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61DesPago, "")), 603, Gx_line+333, 708, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131Texto_fd, "")), 36, Gx_line+301, 287, Gx_line+314, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+354) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 235, Gx_line+8, 329, Gx_line+24, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quant.", ""), 561, Gx_line+8, 600, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(36, Gx_line+0, 781, Gx_line+34, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(538, Gx_line+0, 538, Gx_line+34, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 632, Gx_line+8, 666, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(622, Gx_line+0, 622, Gx_line+34, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(685, Gx_line+0, 685, Gx_line+34, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 714, Gx_line+8, 742, Gx_line+24, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+35) ;
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfactinse.this.A396EmprCod;
      this.aP1[0] = pfactinse.this.A430FacCod;
      this.aP2[0] = pfactinse.this.AV15ImpCod;
      this.aP3[0] = pfactinse.this.AV16ValEuro;
      this.aP4[0] = pfactinse.this.AV93TextoCopia;
      this.aP5[0] = pfactinse.this.Gx_out;
      this.aP6[0] = pfactinse.this.AV111Agrupo_f;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfactinse");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV49SumSig = DecimalUtil.ZERO ;
      AV129FirmaD = "" ;
      AV130NumCer = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P02LJ2_A7210FacObs = new String[] {""} ;
      P02LJ2_A396EmprCod = new String[] {""} ;
      P02LJ2_A430FacCod = new int[1] ;
      P02LJ2_A1153FacTipFac = new byte[1] ;
      P02LJ2_A9605FacFirma = new String[] {""} ;
      P02LJ2_A437FacFpg = new String[] {""} ;
      P02LJ2_A450FacPri = new String[] {""} ;
      P02LJ2_A2739FacSerNum = new String[] {""} ;
      P02LJ2_A435FacEst = new byte[1] ;
      P02LJ2_A11273FacObs2 = new String[] {""} ;
      P02LJ2_A252CliCod = new int[1] ;
      P02LJ2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P02LJ2_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_n8346FacRecI = new boolean[] {false} ;
      P02LJ2_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_A443FacIVAPor = new byte[1] ;
      P02LJ2_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ2_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A7210FacObs = "" ;
      A9605FacFirma = "" ;
      A437FacFpg = "" ;
      A450FacPri = "" ;
      A2739FacSerNum = "" ;
      A11273FacObs2 = "" ;
      A436FacFch = GXutil.nullDate() ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      P02LJ3_A7209Colombia = new byte[1] ;
      P02LJ3_n7209Colombia = new boolean[] {false} ;
      P02LJ5_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      P02LJ6_A4828CliCp2 = new String[] {""} ;
      P02LJ6_A256CliCp = new String[] {""} ;
      P02LJ6_A278CliNif = new String[] {""} ;
      P02LJ6_A295CliPob = new String[] {""} ;
      P02LJ6_A260CliDom = new String[] {""} ;
      P02LJ6_A279CliNom = new String[] {""} ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      AV131Texto_fd = "" ;
      AV132Firma4dig = "" ;
      AV79CliNif = "" ;
      AV23FpgCod = "" ;
      AV61DesPago = "" ;
      AV24FpgDsc = "" ;
      AV51CliPri = "" ;
      AV85FacFch = GXutil.nullDate() ;
      AV128Cpostal = "" ;
      AV37Vencim = new java.util.Date[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV37Vencim[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      P02LJ7_A396EmprCod = new String[] {""} ;
      P02LJ7_A430FacCod = new int[1] ;
      P02LJ7_A956FacVtoLin = new byte[1] ;
      P02LJ7_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P02LJ7_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV68FacImpTot = DecimalUtil.ZERO ;
      AV70FacIvaImp = DecimalUtil.ZERO ;
      AV71FacTot = DecimalUtil.ZERO ;
      AV81FacBasImp = DecimalUtil.ZERO ;
      AV78TotFac = DecimalUtil.ZERO ;
      AV124FraMan = "" ;
      AV125ContCod = "" ;
      AV126ContDsc3 = "" ;
      P02LJ8_A396EmprCod = new String[] {""} ;
      P02LJ8_A430FacCod = new int[1] ;
      P02LJ8_A427FacAlbCod = new long[1] ;
      P02LJ8_A1498FacDisNum = new String[] {""} ;
      P02LJ8_A454FacSer = new String[] {""} ;
      P02LJ8_A428FacAlbTip = new byte[1] ;
      P02LJ8_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ8_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ8_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ8_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LJ8_A432FacDsc = new String[] {""} ;
      P02LJ8_A446FacLin = new int[1] ;
      P02LJ8_A3397FacFasCod = new String[] {""} ;
      P02LJ8_A1296FacBarPar = new String[] {""} ;
      P02LJ8_A1295FacBarReo = new byte[1] ;
      P02LJ8_A1294FacBarCod = new int[1] ;
      P02LJ8_A4814FacEncCli = new String[] {""} ;
      A1498FacDisNum = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A3397FacFasCod = "" ;
      A1296FacBarPar = "" ;
      A4814FacEncCli = "" ;
      AV123VarAux = "" ;
      AV121Contdsc2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV102AlbProFch = GXutil.nullDate() ;
      AV98Last_Enc = "" ;
      AV116Last_hdr = "" ;
      P02LJ9_A1153FacTipFac = new byte[1] ;
      AV99Nueves9 = "" ;
      AV101Hdr_8 = "" ;
      AV88Hdr = "" ;
      AV118Hdr11 = "" ;
      AV104BarEncCli = "" ;
      AV82BarSerDsc = "" ;
      AV65BarCodPar = "" ;
      P02LJ10_A396EmprCod = new String[] {""} ;
      P02LJ10_A129BarCod = new int[1] ;
      P02LJ10_A132BarCodReo = new byte[1] ;
      P02LJ10_A130BarCodPar = new String[] {""} ;
      P02LJ10_A30AlbProCod = new long[1] ;
      P02LJ10_A1265BarAlbPie = new int[1] ;
      A130BarCodPar = "" ;
      AV94FacDisNum = "" ;
      AV105L_Artigo = "" ;
      AV67TotLin = DecimalUtil.ZERO ;
      AV91Precio = DecimalUtil.ZERO ;
      AV95FacKgs = DecimalUtil.ZERO ;
      AV83BarColNom = "" ;
      AV122FacMts = DecimalUtil.ZERO ;
      P02LJ11_A396EmprCod = new String[] {""} ;
      P02LJ11_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      AV90FacDsc = "" ;
      AV127Un = "" ;
      AV119Obsf = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV119Obsf[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P02LJ13_A396EmprCod = new String[] {""} ;
      P02LJ13_A130BarCodPar = new String[] {""} ;
      P02LJ13_A132BarCodReo = new byte[1] ;
      P02LJ13_A129BarCod = new int[1] ;
      P02LJ13_A1652BarSerDsc = new String[] {""} ;
      P02LJ13_A135BarColNom = new String[] {""} ;
      P02LJ13_A136BarColNum = new int[1] ;
      P02LJ13_A4812BarEncCli = new String[] {""} ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A4812BarEncCli = "" ;
      P02LJ14_A396EmprCod = new String[] {""} ;
      P02LJ14_A497FpgCod = new String[] {""} ;
      P02LJ14_A498FpgDsc = new String[] {""} ;
      P02LJ14_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      P02LJ15_A396EmprCod = new String[] {""} ;
      P02LJ15_A30AlbProCod = new long[1] ;
      P02LJ15_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      P02LJ16_A396EmprCod = new String[] {""} ;
      P02LJ16_A14AlbComCod = new int[1] ;
      P02LJ16_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A17AlbComFch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfactinse__default(),
         new Object[] {
             new Object[] {
            P02LJ2_A7210FacObs, P02LJ2_A396EmprCod, P02LJ2_A430FacCod, P02LJ2_A1153FacTipFac, P02LJ2_A9605FacFirma, P02LJ2_A437FacFpg, P02LJ2_A450FacPri, P02LJ2_A2739FacSerNum, P02LJ2_A435FacEst, P02LJ2_A11273FacObs2,
            P02LJ2_A252CliCod, P02LJ2_A436FacFch, P02LJ2_A11513FacRecIca, P02LJ2_A8346FacRecI, P02LJ2_n8346FacRecI, P02LJ2_A7212FacRect, P02LJ2_A453FacRECPor, P02LJ2_A14224FacCostFac, P02LJ2_A14223FacCostKgs, P02LJ2_A14222FacCostMts,
            P02LJ2_A433FacDtoGen, P02LJ2_A443FacIVAPor, P02LJ2_A434FacDtoPP, P02LJ2_A14219FacEnergia
            }
            , new Object[] {
            P02LJ3_A7209Colombia, P02LJ3_n7209Colombia
            }
            , new Object[] {
            P02LJ5_A3918FacImpTot1
            }
            , new Object[] {
            P02LJ6_A4828CliCp2, P02LJ6_A256CliCp, P02LJ6_A278CliNif, P02LJ6_A295CliPob, P02LJ6_A260CliDom, P02LJ6_A279CliNom
            }
            , new Object[] {
            P02LJ7_A396EmprCod, P02LJ7_A430FacCod, P02LJ7_A956FacVtoLin, P02LJ7_A957FacVtoFch, P02LJ7_n957FacVtoFch
            }
            , new Object[] {
            P02LJ8_A396EmprCod, P02LJ8_A430FacCod, P02LJ8_A427FacAlbCod, P02LJ8_A1498FacDisNum, P02LJ8_A454FacSer, P02LJ8_A428FacAlbTip, P02LJ8_A448FacPreKgs, P02LJ8_A444FacKgs, P02LJ8_A449FacPreMts, P02LJ8_A447FacMts,
            P02LJ8_A432FacDsc, P02LJ8_A446FacLin, P02LJ8_A3397FacFasCod, P02LJ8_A1296FacBarPar, P02LJ8_A1295FacBarReo, P02LJ8_A1294FacBarCod, P02LJ8_A4814FacEncCli
            }
            , new Object[] {
            P02LJ9_A1153FacTipFac
            }
            , new Object[] {
            P02LJ10_A396EmprCod, P02LJ10_A129BarCod, P02LJ10_A132BarCodReo, P02LJ10_A130BarCodPar, P02LJ10_A30AlbProCod, P02LJ10_A1265BarAlbPie
            }
            , new Object[] {
            P02LJ11_A396EmprCod, P02LJ11_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02LJ13_A396EmprCod, P02LJ13_A130BarCodPar, P02LJ13_A132BarCodReo, P02LJ13_A129BarCod, P02LJ13_A1652BarSerDsc, P02LJ13_A135BarColNom, P02LJ13_A136BarColNum, P02LJ13_A4812BarEncCli
            }
            , new Object[] {
            P02LJ14_A396EmprCod, P02LJ14_A497FpgCod, P02LJ14_A498FpgDsc, P02LJ14_n498FpgDsc
            }
            , new Object[] {
            P02LJ15_A396EmprCod, P02LJ15_A30AlbProCod, P02LJ15_A34AlbProfch
            }
            , new Object[] {
            P02LJ16_A396EmprCod, P02LJ16_A14AlbComCod, P02LJ16_A17AlbComFch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV62CtrlPag ;
   private byte AV80NumLin ;
   private byte A1153FacTipFac ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV97IvaPor ;
   private byte AV58FlagPag ;
   private byte AV92Paso ;
   private byte A956FacVtoLin ;
   private byte AV96FlagNoFin ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private byte AV100LenVar ;
   private byte AV64BarCodReo ;
   private byte A132BarCodReo ;
   private byte AV133ImpLineaKilos ;
   private short AV115i ;
   private short AV120Nlin ;
   private short Gx_err ;
   private int A430FacCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV56CliCod ;
   private int GX_I ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int Gx_OldLine ;
   private int AV63BarCod ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV89Piezas ;
   private int AV84BarColNum ;
   private int A136BarColNum ;
   private int A14AlbComCod ;
   private long AV69FacImpPP ;
   private long A427FacAlbCod ;
   private long AV103AlbProCod ;
   private long AV32FacAlbCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV16ValEuro ;
   private java.math.BigDecimal AV49SumSig ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV68FacImpTot ;
   private java.math.BigDecimal AV70FacIvaImp ;
   private java.math.BigDecimal AV71FacTot ;
   private java.math.BigDecimal AV81FacBasImp ;
   private java.math.BigDecimal AV78TotFac ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal AV67TotLin ;
   private java.math.BigDecimal AV91Precio ;
   private java.math.BigDecimal AV95FacKgs ;
   private java.math.BigDecimal AV122FacMts ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV93TextoCopia ;
   private String Gx_out ;
   private String AV111Agrupo_f ;
   private String AV129FirmaD ;
   private String AV130NumCer ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A9605FacFirma ;
   private String A437FacFpg ;
   private String A450FacPri ;
   private String A2739FacSerNum ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String AV131Texto_fd ;
   private String AV132Firma4dig ;
   private String AV79CliNif ;
   private String AV23FpgCod ;
   private String AV61DesPago ;
   private String AV24FpgDsc ;
   private String AV51CliPri ;
   private String AV128Cpostal ;
   private String AV124FraMan ;
   private String AV125ContCod ;
   private String AV126ContDsc3 ;
   private String A1498FacDisNum ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A3397FacFasCod ;
   private String A1296FacBarPar ;
   private String A4814FacEncCli ;
   private String AV123VarAux ;
   private String AV121Contdsc2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV98Last_Enc ;
   private String AV116Last_hdr ;
   private String AV99Nueves9 ;
   private String AV101Hdr_8 ;
   private String AV88Hdr ;
   private String AV118Hdr11 ;
   private String AV104BarEncCli ;
   private String AV82BarSerDsc ;
   private String AV65BarCodPar ;
   private String A130BarCodPar ;
   private String AV94FacDisNum ;
   private String AV105L_Artigo ;
   private String AV83BarColNom ;
   private String A457FasCod ;
   private String AV90FacDsc ;
   private String AV127Un ;
   private String AV119Obsf[] ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A4812BarEncCli ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV85FacFch ;
   private java.util.Date AV37Vencim[] ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date AV102AlbProFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private boolean GxHdr2 ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean brk2LJ5 ;
   private boolean n498FpgDsc ;
   private String A7210FacObs ;
   private String A11273FacObs2 ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LJ2_A7210FacObs ;
   private String[] P02LJ2_A396EmprCod ;
   private int[] P02LJ2_A430FacCod ;
   private byte[] P02LJ2_A1153FacTipFac ;
   private String[] P02LJ2_A9605FacFirma ;
   private String[] P02LJ2_A437FacFpg ;
   private String[] P02LJ2_A450FacPri ;
   private String[] P02LJ2_A2739FacSerNum ;
   private byte[] P02LJ2_A435FacEst ;
   private String[] P02LJ2_A11273FacObs2 ;
   private int[] P02LJ2_A252CliCod ;
   private java.util.Date[] P02LJ2_A436FacFch ;
   private java.math.BigDecimal[] P02LJ2_A11513FacRecIca ;
   private java.math.BigDecimal[] P02LJ2_A8346FacRecI ;
   private boolean[] P02LJ2_n8346FacRecI ;
   private java.math.BigDecimal[] P02LJ2_A7212FacRect ;
   private java.math.BigDecimal[] P02LJ2_A453FacRECPor ;
   private java.math.BigDecimal[] P02LJ2_A14224FacCostFac ;
   private java.math.BigDecimal[] P02LJ2_A14223FacCostKgs ;
   private java.math.BigDecimal[] P02LJ2_A14222FacCostMts ;
   private java.math.BigDecimal[] P02LJ2_A433FacDtoGen ;
   private byte[] P02LJ2_A443FacIVAPor ;
   private java.math.BigDecimal[] P02LJ2_A434FacDtoPP ;
   private java.math.BigDecimal[] P02LJ2_A14219FacEnergia ;
   private byte[] P02LJ3_A7209Colombia ;
   private boolean[] P02LJ3_n7209Colombia ;
   private java.math.BigDecimal[] P02LJ5_A3918FacImpTot1 ;
   private String[] P02LJ6_A4828CliCp2 ;
   private String[] P02LJ6_A256CliCp ;
   private String[] P02LJ6_A278CliNif ;
   private String[] P02LJ6_A295CliPob ;
   private String[] P02LJ6_A260CliDom ;
   private String[] P02LJ6_A279CliNom ;
   private String[] P02LJ7_A396EmprCod ;
   private int[] P02LJ7_A430FacCod ;
   private byte[] P02LJ7_A956FacVtoLin ;
   private java.util.Date[] P02LJ7_A957FacVtoFch ;
   private boolean[] P02LJ7_n957FacVtoFch ;
   private String[] P02LJ8_A396EmprCod ;
   private int[] P02LJ8_A430FacCod ;
   private long[] P02LJ8_A427FacAlbCod ;
   private String[] P02LJ8_A1498FacDisNum ;
   private String[] P02LJ8_A454FacSer ;
   private byte[] P02LJ8_A428FacAlbTip ;
   private java.math.BigDecimal[] P02LJ8_A448FacPreKgs ;
   private java.math.BigDecimal[] P02LJ8_A444FacKgs ;
   private java.math.BigDecimal[] P02LJ8_A449FacPreMts ;
   private java.math.BigDecimal[] P02LJ8_A447FacMts ;
   private String[] P02LJ8_A432FacDsc ;
   private int[] P02LJ8_A446FacLin ;
   private String[] P02LJ8_A3397FacFasCod ;
   private String[] P02LJ8_A1296FacBarPar ;
   private byte[] P02LJ8_A1295FacBarReo ;
   private int[] P02LJ8_A1294FacBarCod ;
   private String[] P02LJ8_A4814FacEncCli ;
   private byte[] P02LJ9_A1153FacTipFac ;
   private String[] P02LJ10_A396EmprCod ;
   private int[] P02LJ10_A129BarCod ;
   private byte[] P02LJ10_A132BarCodReo ;
   private String[] P02LJ10_A130BarCodPar ;
   private long[] P02LJ10_A30AlbProCod ;
   private int[] P02LJ10_A1265BarAlbPie ;
   private String[] P02LJ11_A396EmprCod ;
   private String[] P02LJ11_A457FasCod ;
   private String[] P02LJ13_A396EmprCod ;
   private String[] P02LJ13_A130BarCodPar ;
   private byte[] P02LJ13_A132BarCodReo ;
   private int[] P02LJ13_A129BarCod ;
   private String[] P02LJ13_A1652BarSerDsc ;
   private String[] P02LJ13_A135BarColNom ;
   private int[] P02LJ13_A136BarColNum ;
   private String[] P02LJ13_A4812BarEncCli ;
   private String[] P02LJ14_A396EmprCod ;
   private String[] P02LJ14_A497FpgCod ;
   private String[] P02LJ14_A498FpgDsc ;
   private boolean[] P02LJ14_n498FpgDsc ;
   private String[] P02LJ15_A396EmprCod ;
   private long[] P02LJ15_A30AlbProCod ;
   private java.util.Date[] P02LJ15_A34AlbProfch ;
   private String[] P02LJ16_A396EmprCod ;
   private int[] P02LJ16_A14AlbComCod ;
   private java.util.Date[] P02LJ16_A17AlbComFch ;
}

final  class pfactinse__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LJ2", "SELECT FacObs, EmprCod, FacCod, FacTipFac, FacFirma, FacFpg, FacPri, FacSerNum, FacEst, FacObs2, CliCod, FacFch, FacRecIca, FacRecI, FacRect, FacRECPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoGen, FacIVAPor, FacDtoPP, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LJ3", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LJ5", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LJ6", "SELECT CliCp2, CliCp, CliNif, CliPob, CliDom, CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LJ7", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02LJ8", "SELECT EmprCod, FacCod, FacAlbCod, FacDisNum, FacSer, FacAlbTip, FacPreKgs, FacKgs, FacPreMts, FacMts, FacDsc, FacLin, FacFasCod, FacBarPar, FacBarReo, FacBarCod, FacEncCli FROM TXPLFAVEN WHERE (EmprCod = ?) AND (FacCod = ?) ORDER BY FacAlbCod, FacEncCli, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02LJ9", "SELECT FacTipFac FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02LJ10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LJ11", "SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02LJ12", "UPDATE TXPCFAVEN SET FacEst=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P02LJ13", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSerDsc, BarColNom, BarColNum, BarEncCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LJ14", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LJ15", "SELECT EmprCod, AlbProCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LJ16", "SELECT EmprCod, AlbComCod, AlbComFch FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

