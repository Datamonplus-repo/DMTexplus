package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfactinr extends GXReport
{
   public pfactinr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfactinr.class ), "" );
   }

   public pfactinr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 )
   {
      pfactinr.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pfactinr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfactinr.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfactinr.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      pfactinr.this.AV16ValEuro = aP3[0];
      this.aP3 = aP3;
      pfactinr.this.AV93TextoCopia = aP4[0];
      this.aP4 = aP4;
      pfactinr.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 15 ;
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
         getPrinter().GxSetDocName("FACT. RECTIFICACION") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*15)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV114ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACTIR", ""), GXv_char1) ;
         pfactinr.this.AV114ContDsc = GXv_char1[0] ;
         GXt_char2 = AV124FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDIG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pfactinr.this.A396EmprCod = GXv_char1[0] ;
         pfactinr.this.GXt_char2 = GXv_char4[0] ;
         AV124FirmaD = GXt_char2 ;
         GXt_int5 = AV138ExisteFirmaD ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int6) ;
         pfactinr.this.GXt_int5 = GXv_int6[0] ;
         AV138ExisteFirmaD = GXt_int5 ;
         /* Using cursor P030A2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8334EmpItm1 = P030A2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P030A2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P030A2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P030A2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P030A2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P030A2_n8336EmpItm3[0] ;
            A8338EmpItm5 = P030A2_A8338EmpItm5[0] ;
            n8338EmpItm5 = P030A2_n8338EmpItm5[0] ;
            A8335EmpItm2 = P030A2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P030A2_n8335EmpItm2[0] ;
            AV132Texto_1 = GXutil.trim( A8334EmpItm1) + "€" ;
            AV133Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV134EmpItm5 = GXutil.trim( A8335EmpItm2) + " " + GXutil.trim( A8338EmpItm5) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV49SumSig = DecimalUtil.doubleToDec(0) ;
         AV62CtrlPag = (byte)(0) ;
         AV80NumLin = (byte)(1) ;
         AV108Mas_i = (byte)(0) ;
         GxHdr3 = true ;
         /* Using cursor P030A3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A437FacFpg = P030A3_A437FacFpg[0] ;
            A450FacPri = P030A3_A450FacPri[0] ;
            A1153FacTipFac = P030A3_A1153FacTipFac[0] ;
            A9605FacFirma = P030A3_A9605FacFirma[0] ;
            A435FacEst = P030A3_A435FacEst[0] ;
            A9643FacLiq1 = P030A3_A9643FacLiq1[0] ;
            A9644FacLiq2 = P030A3_A9644FacLiq2[0] ;
            A9645FacIva1 = P030A3_A9645FacIva1[0] ;
            A9646FacTot1 = P030A3_A9646FacTot1[0] ;
            A252CliCod = P030A3_A252CliCod[0] ;
            A436FacFch = P030A3_A436FacFch[0] ;
            A11513FacRecIca = P030A3_A11513FacRecIca[0] ;
            A8346FacRecI = P030A3_A8346FacRecI[0] ;
            n8346FacRecI = P030A3_n8346FacRecI[0] ;
            A7212FacRect = P030A3_A7212FacRect[0] ;
            A453FacRECPor = P030A3_A453FacRECPor[0] ;
            A14224FacCostFac = P030A3_A14224FacCostFac[0] ;
            A14223FacCostKgs = P030A3_A14223FacCostKgs[0] ;
            A14222FacCostMts = P030A3_A14222FacCostMts[0] ;
            A443FacIVAPor = P030A3_A443FacIVAPor[0] ;
            A433FacDtoGen = P030A3_A433FacDtoGen[0] ;
            A434FacDtoPP = P030A3_A434FacDtoPP[0] ;
            A14219FacEnergia = P030A3_A14219FacEnergia[0] ;
            /* Using cursor P030A4 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A395EmprCif = P030A4_A395EmprCif[0] ;
            n395EmprCif = P030A4_n395EmprCif[0] ;
            A7209Colombia = P030A4_A7209Colombia[0] ;
            n7209Colombia = P030A4_n7209Colombia[0] ;
            /* Using cursor P030A6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(3) != 101) )
            {
               A3918FacImpTot1 = P030A6_A3918FacImpTot1[0] ;
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
            /* Using cursor P030A7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            A781PrvCod = P030A7_A781PrvCod[0] ;
            A278CliNif = P030A7_A278CliNif[0] ;
            A858ZonGeoCod = P030A7_A858ZonGeoCod[0] ;
            A3644CliNom1 = P030A7_A3644CliNom1[0] ;
            A279CliNom = P030A7_A279CliNom[0] ;
            A4828CliCp2 = P030A7_A4828CliCp2[0] ;
            A256CliCp = P030A7_A256CliCp[0] ;
            A295CliPob = P030A7_A295CliPob[0] ;
            A260CliDom = P030A7_A260CliDom[0] ;
            /* Using cursor P030A8 */
            pr_default.execute(5, new Object[] {Short.valueOf(A781PrvCod)});
            A787PrvDsc = P030A8_A787PrvDsc[0] ;
            n787PrvDsc = P030A8_n787PrvDsc[0] ;
            AV79CliNif = A278CliNif ;
            AV23FpgCod = A437FacFpg ;
            AV118EmprCif = A395EmprCif ;
            AV61DesPago = GXutil.substring( AV24FpgDsc, 1, 16) ;
            AV97IvaPor = A443FacIVAPor ;
            if ( GXutil.strcmp(A450FacPri, "0") == 0 )
            {
               AV97IvaPor = (byte)(0) ;
               AV114ContDsc = "" ;
            }
            AV117Texto_sp = "" ;
            if ( A858ZonGeoCod == 999 )
            {
               AV117Texto_sp = httpContext.getMessage( "Isento de IVA ao abrigo da alínea a) do nº 1 art. 14 do RITI", "") ;
               AV117Texto_sp = httpContext.getMessage( "Nao sujeiçao do nº 20 art. 6 do CIVA", "") ;
               AV97IvaPor = (byte)(0) ;
            }
            AV58FlagPag = (byte)(0) ;
            AV110CliNom3 = GXutil.trim( A279CliNom) + GXutil.trim( A3644CliNom1) ;
            AV56CliCod = A252CliCod ;
            AV51CliPri = A450FacPri ;
            AV85FacFch = A436FacFch ;
            if ( (GXutil.strcmp("", A4828CliCp2)==0) )
            {
               AV102Cpostal = A256CliCp ;
            }
            else
            {
               AV102Cpostal = A256CliCp + "-" + A4828CliCp2 ;
            }
            AV92Paso = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV37Vencim[GX_I-1] = GXutil.nullDate() ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P030A9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A956FacVtoLin = P030A9_A956FacVtoLin[0] ;
               A957FacVtoFch = P030A9_A957FacVtoFch[0] ;
               n957FacVtoFch = P030A9_n957FacVtoFch[0] ;
               AV92Paso = (byte)(AV92Paso+1) ;
               AV37Vencim[AV92Paso-1] = A957FacVtoFch ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( A1153FacTipFac == 2 )
            {
               AV68FacImpTot = A441FacImpTot.multiply(DecimalUtil.doubleToDec(-1)) ;
               AV69FacImpPP = A440FacImpPP.multiply(DecimalUtil.doubleToDec(-1)) ;
               AV121FacImpGen = A439FacImpGen.multiply(DecimalUtil.doubleToDec(-1)) ;
               AV120FacDtoPP = A434FacDtoPP.multiply(DecimalUtil.doubleToDec(-1)) ;
               AV126FacIvaPor = (byte)(A443FacIVAPor*-1) ;
               AV70FacIvaImp = A442FacIVAImp.multiply(DecimalUtil.doubleToDec(-1)) ;
               AV71FacTot = A455FacTot.multiply(DecimalUtil.doubleToDec(-1)) ;
               AV81FacBasImp = A429FacBasImp.multiply(DecimalUtil.doubleToDec(-1)) ;
            }
            else
            {
               AV68FacImpTot = A441FacImpTot ;
               AV69FacImpPP = A440FacImpPP ;
               AV121FacImpGen = A439FacImpGen ;
               AV120FacDtoPP = A434FacDtoPP ;
               AV126FacIvaPor = A443FacIVAPor ;
               AV70FacIvaImp = A442FacIVAImp ;
               AV71FacTot = A455FacTot ;
               AV81FacBasImp = A429FacBasImp ;
            }
            AV78TotFac = A455FacTot ;
            if ( A1153FacTipFac == 1 )
            {
               AV119TipoFac = httpContext.getMessage( "Fatura", "") + httpContext.getMessage( " ND", "") + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) ;
            }
            else
            {
               AV119TipoFac = httpContext.getMessage( "Fatura", "") + httpContext.getMessage( " NC", "") + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) ;
            }
            AV137FacFirma = A9605FacFirma ;
            AV123Texto_fd = " " ;
            if ( GXutil.strcmp(A9605FacFirma, " ") != 0 )
            {
               AV125Firma4dig = GXutil.substring( A9605FacFirma, 1, 1) + GXutil.substring( A9605FacFirma, 11, 1) + GXutil.substring( A9605FacFirma, 21, 1) + GXutil.substring( A9605FacFirma, 31, 1) ;
               AV123Texto_fd = AV125Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV124FirmaD) + httpContext.getMessage( "/DGCI", "") ;
            }
            else
            {
               AV123Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV96FlagNoFin = (byte)(1) ;
            /* Using cursor P030A10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A448FacPreKgs = P030A10_A448FacPreKgs[0] ;
               A444FacKgs = P030A10_A444FacKgs[0] ;
               A432FacDsc = P030A10_A432FacDsc[0] ;
               A9649FacPKDto = P030A10_A9649FacPKDto[0] ;
               A9650FacPMdto = P030A10_A9650FacPMdto[0] ;
               A9648FacDtoL = P030A10_A9648FacDtoL[0] ;
               A9647FacImpdto = P030A10_A9647FacImpdto[0] ;
               A9651FacImpd = P030A10_A9651FacImpd[0] ;
               A9708FacDscII = P030A10_A9708FacDscII[0] ;
               A449FacPreMts = P030A10_A449FacPreMts[0] ;
               A447FacMts = P030A10_A447FacMts[0] ;
               A446FacLin = P030A10_A446FacLin[0] ;
               if ( AV80NumLin >= 24 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV80NumLin = (byte)(1) ;
               }
               if ( A448FacPreKgs.doubleValue() != 0 )
               {
                  AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                  AV91Precio = A448FacPreKgs ;
                  AV95FacKgs = A444FacKgs ;
                  if ( AV80NumLin >= 24 )
                  {
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                     AV80NumLin = (byte)(1) ;
                  }
                  h30A0( false, 15) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 98, Gx_line+0, 391, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95FacKgs, "ZZZZZZ.ZZ")), 483, Gx_line+0, 550, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 570, Gx_line+0, 622, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "ZZZZZZZZ9.99")), 642, Gx_line+0, 731, Gx_line+16, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
                  AV116Flag_linea = (byte)(1) ;
                  AV80NumLin = (byte)(AV80NumLin+1) ;
                  AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                  AV128Aux1 = AV67TotLin.subtract((AV67TotLin.multiply(AV120FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                  AV131Aux2 = AV128Aux1 ;
                  if ( A444FacKgs.doubleValue() > 0 )
                  {
                     AV129Aux3 = AV131Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                  }
                  A9649FacPKDto = AV129Aux3 ;
                  A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                  A9648FacDtoL = AV120FacDtoPP ;
                  A9647FacImpdto = AV129Aux3.multiply(A444FacKgs) ;
                  AV127Aux0 = AV67TotLin.multiply(AV120FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  A9651FacImpd = AV127Aux0 ;
                  AV130Aux4 = AV130Aux4.add((AV129Aux3.multiply(A444FacKgs))) ;
                  A9708FacDscII = A432FacDsc ;
               }
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) )
               {
                  AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                  AV91Precio = A449FacPreMts ;
                  AV122FacMts = A447FacMts ;
                  if ( AV80NumLin >= 24 )
                  {
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                     AV80NumLin = (byte)(1) ;
                  }
                  h30A0( false, 15) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 98, Gx_line+0, 391, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "ZZZZZZZZ9.99")), 642, Gx_line+0, 731, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 570, Gx_line+0, 622, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV122FacMts, "ZZZZZ9.99")), 483, Gx_line+0, 550, Gx_line+16, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
                  AV116Flag_linea = (byte)(1) ;
                  AV80NumLin = (byte)(AV80NumLin+1) ;
                  AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                  AV128Aux1 = AV67TotLin.subtract((AV67TotLin.multiply(AV120FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                  AV131Aux2 = AV128Aux1 ;
                  if ( A447FacMts.doubleValue() > 0 )
                  {
                     AV129Aux3 = AV131Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                  }
                  A9650FacPMdto = AV129Aux3 ;
                  A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                  A9648FacDtoL = AV120FacDtoPP ;
                  A9647FacImpdto = AV129Aux3.multiply(A447FacMts) ;
                  AV127Aux0 = AV67TotLin.multiply(AV120FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  A9651FacImpd = AV127Aux0 ;
                  AV130Aux4 = AV130Aux4.add((AV129Aux3.multiply(A447FacMts))) ;
                  A9708FacDscII = A432FacDsc ;
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (GXutil.strcmp("", A432FacDsc)==0) )
               {
                  if ( AV80NumLin >= 24 )
                  {
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                     AV80NumLin = (byte)(1) ;
                  }
                  h30A0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 98, Gx_line+0, 391, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  A9708FacDscII = A432FacDsc ;
                  AV116Flag_linea = (byte)(1) ;
                  AV80NumLin = (byte)(AV80NumLin+1) ;
               }
               /* Using cursor P030A11 */
               pr_default.execute(8, new Object[] {A9649FacPKDto, A9650FacPMdto, A9648FacDtoL, A9647FacImpdto, A9651FacImpd, A9708FacDscII, A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
               pr_default.readNext(7);
            }
            pr_default.close(7);
            if ( ! (0==AV138ExisteFirmaD) && (GXutil.strcmp("", A9605FacFirma)==0) )
            {
               h30A0( false, 33) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 190, Gx_line+0, 609, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
            }
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            AV96FlagNoFin = (byte)(0) ;
            if ( A1153FacTipFac == 2 )
            {
               AV135TotImp = AV68FacImpTot.multiply(DecimalUtil.doubleToDec(-1)) ;
               AV136PorIva = (byte)(AV126FacIvaPor*-1) ;
            }
            else
            {
               AV135TotImp = AV68FacImpTot ;
               AV136PorIva = AV126FacIvaPor ;
            }
            A9643FacLiq1 = AV135TotImp ;
            A9644FacLiq2 = GXutil.roundDecimal( AV130Aux4, 2) ;
            A9645FacIva1 = GXutil.roundDecimal( AV130Aux4.multiply(DecimalUtil.doubleToDec(AV136PorIva)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            A9646FacTot1 = A9644FacLiq2.add(A9645FacIva1) ;
            /* Using cursor P030A12 */
            pr_default.execute(9, new Object[] {Byte.valueOf(A435FacEst), A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A396EmprCod, Integer.valueOf(A430FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.close(2);
         pr_default.close(4);
         pr_default.close(5);
         pr_default.close(3);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h30A0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h30A0( boolean bFoot ,
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
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 459, Gx_line+120, 492, Gx_line+137, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68FacImpTot, "ZZZZZZZZZ9.99")), 621, Gx_line+3, 730, Gx_line+21, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Desconto Pag.", ""), 459, Gx_line+25, 555, Gx_line+42, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total Líquido", ""), 459, Gx_line+3, 546, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69FacImpPP, "ZZZZZZZZZ9.99")), 621, Gx_line+25, 730, Gx_line+43, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81FacBasImp, "ZZZZZZZZZ9.99")), 621, Gx_line+74, 730, Gx_line+92, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("%", 571, Gx_line+96, 582, Gx_line+113, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV97IvaPor), "Z9")), 544, Gx_line+96, 562, Gx_line+114, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor  IVA", ""), 459, Gx_line+96, 525, Gx_line+113, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70FacIvaImp, "ZZZZZZZZZ9.99")), 621, Gx_line+96, 730, Gx_line+114, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71FacTot, "ZZZZZZZZZ9.99")), 621, Gx_line+120, 730, Gx_line+138, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Texto_sp, "")), 40, Gx_line+2, 359, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV121FacImpGen, "ZZZZZZZ9.99")), 638, Gx_line+49, 731, Gx_line+67, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Desconto Gen.", ""), 459, Gx_line+49, 556, Gx_line+66, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114ContDsc, "")), 40, Gx_line+219, 124, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123Texto_fd, "")), 463, Gx_line+219, 693, Gx_line+232, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV132Texto_1, "")), 171, Gx_line+183, 776, Gx_line+196, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133Texto_2, "")), 63, Gx_line+197, 689, Gx_line+210, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134EmpItm5, "")), 40, Gx_line+150, 645, Gx_line+164, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(14, Gx_line+150, 742, Gx_line+150, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+250) ;
               }
               else
               {
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Texto_sp, "")), 40, Gx_line+3, 359, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114ContDsc, "")), 40, Gx_line+135, 124, Gx_line+149, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123Texto_fd, "")), 463, Gx_line+135, 693, Gx_line+148, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV132Texto_1, "")), 171, Gx_line+100, 776, Gx_line+113, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133Texto_2, "")), 63, Gx_line+114, 689, Gx_line+127, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134EmpItm5, "")), 40, Gx_line+67, 645, Gx_line+81, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(14, Gx_line+67, 742, Gx_line+67, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+150) ;
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
            if ( GxHdr3 )
            {
               getPrinter().GxDrawRect(15, Gx_line+343, 743, Gx_line+399, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+371, 743, Gx_line+371, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 175, Gx_line+377, 234, Gx_line+393, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79CliNif, "")), 393, Gx_line+350, 467, Gx_line+366, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(249, Gx_line+343, 249, Gx_line+399, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(522, Gx_line+343, 522, Gx_line+399, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TextoCopia, "")), 633, Gx_line+317, 743, Gx_line+333, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV37Vencim[1-1], "99/99/99"), 651, Gx_line+378, 710, Gx_line+394, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 27, Gx_line+419, 63, Gx_line+434, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 98, Gx_line+419, 155, Gx_line+434, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qtd.", ""), 526, Gx_line+419, 550, Gx_line+434, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 588, Gx_line+419, 622, Gx_line+434, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 702, Gx_line+419, 730, Gx_line+434, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(14, Gx_line+415, 742, Gx_line+441, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110CliNom3, "")), 373, Gx_line+189, 687, Gx_line+207, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 373, Gx_line+213, 587, Gx_line+231, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 373, Gx_line+235, 562, Gx_line+253, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Cpostal, "")), 373, Gx_line+258, 442, Gx_line+275, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 515, Gx_line+260, 672, Gx_line+277, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EXMO(S) SR(S)", ""), 373, Gx_line+159, 443, Gx_line+172, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente Nº :", ""), 26, Gx_line+350, 115, Gx_line+365, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 190, Gx_line+352, 235, Gx_line+368, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(343, Gx_line+150, 343, Gx_line+160, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(343, Gx_line+150, 356, Gx_line+150, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(343, Gx_line+283, 356, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(343, Gx_line+274, 343, Gx_line+284, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(738, Gx_line+150, 738, Gx_line+160, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(726, Gx_line+150, 739, Gx_line+150, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(738, Gx_line+274, 738, Gx_line+284, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(726, Gx_line+283, 739, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/NIF :", ""), 272, Gx_line+350, 324, Gx_line+365, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Vencimento:", ""), 528, Gx_line+378, 646, Gx_line+393, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118EmprCif, "")), 393, Gx_line+376, 503, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data.Doc.:", ""), 26, Gx_line+378, 100, Gx_line+393, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/NIF :", ""), 272, Gx_line+378, 324, Gx_line+393, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119TipoFac, "")), 578, Gx_line+350, 725, Gx_line+366, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "12e1e5ca-1044-41b1-82f4-bceb0981594d", "", context.getHttpContext().getTheme( )), 15, Gx_line+17, 212, Gx_line+117) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+450) ;
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
      this.aP0[0] = pfactinr.this.A396EmprCod;
      this.aP1[0] = pfactinr.this.A430FacCod;
      this.aP2[0] = pfactinr.this.AV15ImpCod;
      this.aP3[0] = pfactinr.this.AV16ValEuro;
      this.aP4[0] = pfactinr.this.AV93TextoCopia;
      this.aP5[0] = pfactinr.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfactinr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV114ContDsc = "" ;
      AV124FirmaD = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P030A2_A396EmprCod = new String[] {""} ;
      P030A2_A8334EmpItm1 = new String[] {""} ;
      P030A2_n8334EmpItm1 = new boolean[] {false} ;
      P030A2_A8337EmpItm4 = new String[] {""} ;
      P030A2_n8337EmpItm4 = new boolean[] {false} ;
      P030A2_A8336EmpItm3 = new String[] {""} ;
      P030A2_n8336EmpItm3 = new boolean[] {false} ;
      P030A2_A8338EmpItm5 = new String[] {""} ;
      P030A2_n8338EmpItm5 = new boolean[] {false} ;
      P030A2_A8335EmpItm2 = new String[] {""} ;
      P030A2_n8335EmpItm2 = new boolean[] {false} ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A8338EmpItm5 = "" ;
      A8335EmpItm2 = "" ;
      AV132Texto_1 = "" ;
      AV133Texto_2 = "" ;
      AV134EmpItm5 = "" ;
      AV49SumSig = DecimalUtil.ZERO ;
      P030A3_A396EmprCod = new String[] {""} ;
      P030A3_A430FacCod = new int[1] ;
      P030A3_A437FacFpg = new String[] {""} ;
      P030A3_A450FacPri = new String[] {""} ;
      P030A3_A1153FacTipFac = new byte[1] ;
      P030A3_A9605FacFirma = new String[] {""} ;
      P030A3_A435FacEst = new byte[1] ;
      P030A3_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A252CliCod = new int[1] ;
      P030A3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P030A3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_n8346FacRecI = new boolean[] {false} ;
      P030A3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A443FacIVAPor = new byte[1] ;
      P030A3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A437FacFpg = "" ;
      A450FacPri = "" ;
      A9605FacFirma = "" ;
      A9643FacLiq1 = DecimalUtil.ZERO ;
      A9644FacLiq2 = DecimalUtil.ZERO ;
      A9645FacIva1 = DecimalUtil.ZERO ;
      A9646FacTot1 = DecimalUtil.ZERO ;
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
      P030A4_A395EmprCif = new String[] {""} ;
      P030A4_n395EmprCif = new boolean[] {false} ;
      P030A4_A7209Colombia = new byte[1] ;
      P030A4_n7209Colombia = new boolean[] {false} ;
      A395EmprCif = "" ;
      P030A6_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      P030A7_A781PrvCod = new short[1] ;
      P030A7_A278CliNif = new String[] {""} ;
      P030A7_A858ZonGeoCod = new short[1] ;
      P030A7_A3644CliNom1 = new String[] {""} ;
      P030A7_A279CliNom = new String[] {""} ;
      P030A7_A4828CliCp2 = new String[] {""} ;
      P030A7_A256CliCp = new String[] {""} ;
      P030A7_A295CliPob = new String[] {""} ;
      P030A7_A260CliDom = new String[] {""} ;
      A278CliNif = "" ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      P030A8_A787PrvDsc = new String[] {""} ;
      P030A8_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      AV79CliNif = "" ;
      AV23FpgCod = "" ;
      AV118EmprCif = "" ;
      AV61DesPago = "" ;
      AV24FpgDsc = "" ;
      AV117Texto_sp = "" ;
      AV110CliNom3 = "" ;
      AV51CliPri = "" ;
      AV85FacFch = GXutil.nullDate() ;
      AV102Cpostal = "" ;
      AV37Vencim = new java.util.Date[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV37Vencim[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      P030A9_A396EmprCod = new String[] {""} ;
      P030A9_A430FacCod = new int[1] ;
      P030A9_A956FacVtoLin = new byte[1] ;
      P030A9_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P030A9_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV68FacImpTot = DecimalUtil.ZERO ;
      AV69FacImpPP = DecimalUtil.ZERO ;
      AV121FacImpGen = DecimalUtil.ZERO ;
      AV120FacDtoPP = DecimalUtil.ZERO ;
      AV70FacIvaImp = DecimalUtil.ZERO ;
      AV71FacTot = DecimalUtil.ZERO ;
      AV81FacBasImp = DecimalUtil.ZERO ;
      AV78TotFac = DecimalUtil.ZERO ;
      AV119TipoFac = "" ;
      AV137FacFirma = "" ;
      AV123Texto_fd = "" ;
      AV125Firma4dig = "" ;
      P030A10_A396EmprCod = new String[] {""} ;
      P030A10_A430FacCod = new int[1] ;
      P030A10_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A432FacDsc = new String[] {""} ;
      P030A10_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A9648FacDtoL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A9651FacImpd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A9708FacDscII = new String[] {""} ;
      P030A10_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P030A10_A446FacLin = new int[1] ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A9649FacPKDto = DecimalUtil.ZERO ;
      A9650FacPMdto = DecimalUtil.ZERO ;
      A9648FacDtoL = DecimalUtil.ZERO ;
      A9647FacImpdto = DecimalUtil.ZERO ;
      A9651FacImpd = DecimalUtil.ZERO ;
      A9708FacDscII = "" ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      AV67TotLin = DecimalUtil.ZERO ;
      AV91Precio = DecimalUtil.ZERO ;
      AV95FacKgs = DecimalUtil.ZERO ;
      AV128Aux1 = DecimalUtil.ZERO ;
      AV131Aux2 = DecimalUtil.ZERO ;
      AV129Aux3 = DecimalUtil.ZERO ;
      AV127Aux0 = DecimalUtil.ZERO ;
      AV130Aux4 = DecimalUtil.ZERO ;
      AV122FacMts = DecimalUtil.ZERO ;
      AV135TotImp = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfactinr__default(),
         new Object[] {
             new Object[] {
            P030A2_A396EmprCod, P030A2_A8334EmpItm1, P030A2_n8334EmpItm1, P030A2_A8337EmpItm4, P030A2_n8337EmpItm4, P030A2_A8336EmpItm3, P030A2_n8336EmpItm3, P030A2_A8338EmpItm5, P030A2_n8338EmpItm5, P030A2_A8335EmpItm2,
            P030A2_n8335EmpItm2
            }
            , new Object[] {
            P030A3_A396EmprCod, P030A3_A430FacCod, P030A3_A437FacFpg, P030A3_A450FacPri, P030A3_A1153FacTipFac, P030A3_A9605FacFirma, P030A3_A435FacEst, P030A3_A9643FacLiq1, P030A3_A9644FacLiq2, P030A3_A9645FacIva1,
            P030A3_A9646FacTot1, P030A3_A252CliCod, P030A3_A436FacFch, P030A3_A11513FacRecIca, P030A3_A8346FacRecI, P030A3_n8346FacRecI, P030A3_A7212FacRect, P030A3_A453FacRECPor, P030A3_A14224FacCostFac, P030A3_A14223FacCostKgs,
            P030A3_A14222FacCostMts, P030A3_A443FacIVAPor, P030A3_A433FacDtoGen, P030A3_A434FacDtoPP, P030A3_A14219FacEnergia
            }
            , new Object[] {
            P030A4_A395EmprCif, P030A4_n395EmprCif, P030A4_A7209Colombia, P030A4_n7209Colombia
            }
            , new Object[] {
            P030A6_A3918FacImpTot1
            }
            , new Object[] {
            P030A7_A781PrvCod, P030A7_A278CliNif, P030A7_A858ZonGeoCod, P030A7_A3644CliNom1, P030A7_A279CliNom, P030A7_A4828CliCp2, P030A7_A256CliCp, P030A7_A295CliPob, P030A7_A260CliDom
            }
            , new Object[] {
            P030A8_A787PrvDsc, P030A8_n787PrvDsc
            }
            , new Object[] {
            P030A9_A396EmprCod, P030A9_A430FacCod, P030A9_A956FacVtoLin, P030A9_A957FacVtoFch, P030A9_n957FacVtoFch
            }
            , new Object[] {
            P030A10_A396EmprCod, P030A10_A430FacCod, P030A10_A448FacPreKgs, P030A10_A444FacKgs, P030A10_A432FacDsc, P030A10_A9649FacPKDto, P030A10_A9650FacPMdto, P030A10_A9648FacDtoL, P030A10_A9647FacImpdto, P030A10_A9651FacImpd,
            P030A10_A9708FacDscII, P030A10_A449FacPreMts, P030A10_A447FacMts, P030A10_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV138ExisteFirmaD ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV62CtrlPag ;
   private byte AV80NumLin ;
   private byte AV108Mas_i ;
   private byte A1153FacTipFac ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV97IvaPor ;
   private byte AV58FlagPag ;
   private byte AV92Paso ;
   private byte A956FacVtoLin ;
   private byte AV126FacIvaPor ;
   private byte AV96FlagNoFin ;
   private byte AV116Flag_linea ;
   private byte AV136PorIva ;
   private short A781PrvCod ;
   private short A858ZonGeoCod ;
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
   private int Gx_OldLine ;
   private java.math.BigDecimal AV16ValEuro ;
   private java.math.BigDecimal AV49SumSig ;
   private java.math.BigDecimal A9643FacLiq1 ;
   private java.math.BigDecimal A9644FacLiq2 ;
   private java.math.BigDecimal A9645FacIva1 ;
   private java.math.BigDecimal A9646FacTot1 ;
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
   private java.math.BigDecimal AV69FacImpPP ;
   private java.math.BigDecimal AV121FacImpGen ;
   private java.math.BigDecimal AV120FacDtoPP ;
   private java.math.BigDecimal AV70FacIvaImp ;
   private java.math.BigDecimal AV71FacTot ;
   private java.math.BigDecimal AV81FacBasImp ;
   private java.math.BigDecimal AV78TotFac ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A9649FacPKDto ;
   private java.math.BigDecimal A9650FacPMdto ;
   private java.math.BigDecimal A9648FacDtoL ;
   private java.math.BigDecimal A9647FacImpdto ;
   private java.math.BigDecimal A9651FacImpd ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal AV67TotLin ;
   private java.math.BigDecimal AV91Precio ;
   private java.math.BigDecimal AV95FacKgs ;
   private java.math.BigDecimal AV128Aux1 ;
   private java.math.BigDecimal AV131Aux2 ;
   private java.math.BigDecimal AV129Aux3 ;
   private java.math.BigDecimal AV127Aux0 ;
   private java.math.BigDecimal AV130Aux4 ;
   private java.math.BigDecimal AV122FacMts ;
   private java.math.BigDecimal AV135TotImp ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV93TextoCopia ;
   private String Gx_out ;
   private String AV114ContDsc ;
   private String AV124FirmaD ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A8338EmpItm5 ;
   private String A8335EmpItm2 ;
   private String AV132Texto_1 ;
   private String AV133Texto_2 ;
   private String AV134EmpItm5 ;
   private String A437FacFpg ;
   private String A450FacPri ;
   private String A9605FacFirma ;
   private String A395EmprCif ;
   private String A278CliNif ;
   private String A3644CliNom1 ;
   private String A279CliNom ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A787PrvDsc ;
   private String AV79CliNif ;
   private String AV23FpgCod ;
   private String AV118EmprCif ;
   private String AV61DesPago ;
   private String AV24FpgDsc ;
   private String AV117Texto_sp ;
   private String AV110CliNom3 ;
   private String AV51CliPri ;
   private String AV102Cpostal ;
   private String AV119TipoFac ;
   private String AV137FacFirma ;
   private String AV123Texto_fd ;
   private String AV125Firma4dig ;
   private String A432FacDsc ;
   private String A9708FacDscII ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV85FacFch ;
   private java.util.Date AV37Vencim[] ;
   private java.util.Date A957FacVtoFch ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n8338EmpItm5 ;
   private boolean n8335EmpItm2 ;
   private boolean GxHdr3 ;
   private boolean n8346FacRecI ;
   private boolean n395EmprCif ;
   private boolean n7209Colombia ;
   private boolean n787PrvDsc ;
   private boolean n957FacVtoFch ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P030A2_A396EmprCod ;
   private String[] P030A2_A8334EmpItm1 ;
   private boolean[] P030A2_n8334EmpItm1 ;
   private String[] P030A2_A8337EmpItm4 ;
   private boolean[] P030A2_n8337EmpItm4 ;
   private String[] P030A2_A8336EmpItm3 ;
   private boolean[] P030A2_n8336EmpItm3 ;
   private String[] P030A2_A8338EmpItm5 ;
   private boolean[] P030A2_n8338EmpItm5 ;
   private String[] P030A2_A8335EmpItm2 ;
   private boolean[] P030A2_n8335EmpItm2 ;
   private String[] P030A3_A396EmprCod ;
   private int[] P030A3_A430FacCod ;
   private String[] P030A3_A437FacFpg ;
   private String[] P030A3_A450FacPri ;
   private byte[] P030A3_A1153FacTipFac ;
   private String[] P030A3_A9605FacFirma ;
   private byte[] P030A3_A435FacEst ;
   private java.math.BigDecimal[] P030A3_A9643FacLiq1 ;
   private java.math.BigDecimal[] P030A3_A9644FacLiq2 ;
   private java.math.BigDecimal[] P030A3_A9645FacIva1 ;
   private java.math.BigDecimal[] P030A3_A9646FacTot1 ;
   private int[] P030A3_A252CliCod ;
   private java.util.Date[] P030A3_A436FacFch ;
   private java.math.BigDecimal[] P030A3_A11513FacRecIca ;
   private java.math.BigDecimal[] P030A3_A8346FacRecI ;
   private boolean[] P030A3_n8346FacRecI ;
   private java.math.BigDecimal[] P030A3_A7212FacRect ;
   private java.math.BigDecimal[] P030A3_A453FacRECPor ;
   private java.math.BigDecimal[] P030A3_A14224FacCostFac ;
   private java.math.BigDecimal[] P030A3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P030A3_A14222FacCostMts ;
   private byte[] P030A3_A443FacIVAPor ;
   private java.math.BigDecimal[] P030A3_A433FacDtoGen ;
   private java.math.BigDecimal[] P030A3_A434FacDtoPP ;
   private java.math.BigDecimal[] P030A3_A14219FacEnergia ;
   private String[] P030A4_A395EmprCif ;
   private boolean[] P030A4_n395EmprCif ;
   private byte[] P030A4_A7209Colombia ;
   private boolean[] P030A4_n7209Colombia ;
   private java.math.BigDecimal[] P030A6_A3918FacImpTot1 ;
   private short[] P030A7_A781PrvCod ;
   private String[] P030A7_A278CliNif ;
   private short[] P030A7_A858ZonGeoCod ;
   private String[] P030A7_A3644CliNom1 ;
   private String[] P030A7_A279CliNom ;
   private String[] P030A7_A4828CliCp2 ;
   private String[] P030A7_A256CliCp ;
   private String[] P030A7_A295CliPob ;
   private String[] P030A7_A260CliDom ;
   private String[] P030A8_A787PrvDsc ;
   private boolean[] P030A8_n787PrvDsc ;
   private String[] P030A9_A396EmprCod ;
   private int[] P030A9_A430FacCod ;
   private byte[] P030A9_A956FacVtoLin ;
   private java.util.Date[] P030A9_A957FacVtoFch ;
   private boolean[] P030A9_n957FacVtoFch ;
   private String[] P030A10_A396EmprCod ;
   private int[] P030A10_A430FacCod ;
   private java.math.BigDecimal[] P030A10_A448FacPreKgs ;
   private java.math.BigDecimal[] P030A10_A444FacKgs ;
   private String[] P030A10_A432FacDsc ;
   private java.math.BigDecimal[] P030A10_A9649FacPKDto ;
   private java.math.BigDecimal[] P030A10_A9650FacPMdto ;
   private java.math.BigDecimal[] P030A10_A9648FacDtoL ;
   private java.math.BigDecimal[] P030A10_A9647FacImpdto ;
   private java.math.BigDecimal[] P030A10_A9651FacImpd ;
   private String[] P030A10_A9708FacDscII ;
   private java.math.BigDecimal[] P030A10_A449FacPreMts ;
   private java.math.BigDecimal[] P030A10_A447FacMts ;
   private int[] P030A10_A446FacLin ;
}

final  class pfactinr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P030A2", "SELECT EmprCod, EmpItm1, EmpItm4, EmpItm3, EmpItm5, EmpItm2 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P030A3", "SELECT EmprCod, FacCod, FacFpg, FacPri, FacTipFac, FacFirma, FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1, CliCod, FacFch, FacRecIca, FacRecI, FacRect, FacRECPor, FacCostFac, FacCostKgs, FacCostMts, FacIVAPor, FacDtoGen, FacDtoPP, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P030A4", "SELECT EmprCif, Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P030A6", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P030A7", "SELECT PrvCod, CliNif, ZonGeoCod, CliNom1, CliNom, CliCp2, CliCp, CliPob, CliDom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P030A8", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P030A9", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P030A10", "SELECT EmprCod, FacCod, FacPreKgs, FacKgs, FacDsc, FacPKDto, FacPMdto, FacDtoL, FacImpdto, FacImpd, FacDscII, FacPreMts, FacMts, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin  FOR UPDATE OF FacPKDto, FacPMdto, FacDtoL, FacImpdto, FacImpd, FacDscII NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P030A11", "UPDATE TXPLFAVEN SET FacPKDto=?, FacPMdto=?, FacDtoL=?, FacImpdto=?, FacImpd=?, FacDscII=?  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P030A12", "UPDATE TXPCFAVEN SET FacEst=?, FacLiq1=?, FacLiq2=?, FacIva1=?, FacTot1=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 34);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 200);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 200);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

