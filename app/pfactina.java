package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfactina extends GXReport
{
   public pfactina( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfactina.class ), "" );
   }

   public pfactina( int remoteHandle ,
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
      pfactina.this.aP5 = new String[] {""};
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
      pfactina.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfactina.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfactina.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      pfactina.this.AV16ValEuro = aP3[0];
      this.aP3 = aP3;
      pfactina.this.AV93TextoCopia = aP4[0];
      this.aP4 = aP4;
      pfactina.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 8 ;
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
         getPrinter().GxSetDocName("FACTURA CLIENTES") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*8)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV114ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACTIN", ""), GXv_char1) ;
         pfactina.this.AV114ContDsc = GXv_char1[0] ;
         GXt_char2 = AV120FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDIG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pfactina.this.A396EmprCod = GXv_char1[0] ;
         pfactina.this.GXt_char2 = GXv_char4[0] ;
         AV120FirmaD = GXt_char2 ;
         GXt_int5 = AV137existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int6) ;
         pfactina.this.GXt_int5 = GXv_int6[0] ;
         AV137existefirmad = GXt_int5 ;
         /* Using cursor P01SA2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8334EmpItm1 = P01SA2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P01SA2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P01SA2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P01SA2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P01SA2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P01SA2_n8336EmpItm3[0] ;
            A8338EmpItm5 = P01SA2_A8338EmpItm5[0] ;
            n8338EmpItm5 = P01SA2_n8338EmpItm5[0] ;
            A8335EmpItm2 = P01SA2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P01SA2_n8335EmpItm2[0] ;
            A12702EmpItm7 = P01SA2_A12702EmpItm7[0] ;
            n12702EmpItm7 = P01SA2_n12702EmpItm7[0] ;
            AV131Texto_1 = GXutil.trim( A8334EmpItm1) + "€" ;
            AV132Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV133EmpItm5 = GXutil.trim( A8335EmpItm2) + " " + GXutil.trim( A8338EmpItm5) ;
            AV138EmpItm7 = A12702EmpItm7 ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV49SumSig = DecimalUtil.doubleToDec(0) ;
         AV62CtrlPag = (byte)(0) ;
         AV80NumLin = (byte)(1) ;
         AV108Mas_i = (byte)(0) ;
         AV127Aux4 = DecimalUtil.doubleToDec(0) ;
         GxHdr3 = true ;
         /* Using cursor P01SA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A437FacFpg = P01SA3_A437FacFpg[0] ;
            A9605FacFirma = P01SA3_A9605FacFirma[0] ;
            A435FacEst = P01SA3_A435FacEst[0] ;
            A9643FacLiq1 = P01SA3_A9643FacLiq1[0] ;
            A9644FacLiq2 = P01SA3_A9644FacLiq2[0] ;
            A9645FacIva1 = P01SA3_A9645FacIva1[0] ;
            A9646FacTot1 = P01SA3_A9646FacTot1[0] ;
            A450FacPri = P01SA3_A450FacPri[0] ;
            A252CliCod = P01SA3_A252CliCod[0] ;
            A436FacFch = P01SA3_A436FacFch[0] ;
            A11513FacRecIca = P01SA3_A11513FacRecIca[0] ;
            A8346FacRecI = P01SA3_A8346FacRecI[0] ;
            n8346FacRecI = P01SA3_n8346FacRecI[0] ;
            A7212FacRect = P01SA3_A7212FacRect[0] ;
            A453FacRECPor = P01SA3_A453FacRECPor[0] ;
            A14224FacCostFac = P01SA3_A14224FacCostFac[0] ;
            A14223FacCostKgs = P01SA3_A14223FacCostKgs[0] ;
            A14222FacCostMts = P01SA3_A14222FacCostMts[0] ;
            A433FacDtoGen = P01SA3_A433FacDtoGen[0] ;
            A443FacIVAPor = P01SA3_A443FacIVAPor[0] ;
            A434FacDtoPP = P01SA3_A434FacDtoPP[0] ;
            A14219FacEnergia = P01SA3_A14219FacEnergia[0] ;
            /* Using cursor P01SA4 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A7209Colombia = P01SA4_A7209Colombia[0] ;
            n7209Colombia = P01SA4_n7209Colombia[0] ;
            /* Using cursor P01SA6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(3) != 101) )
            {
               A3918FacImpTot1 = P01SA6_A3918FacImpTot1[0] ;
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
            /* Using cursor P01SA7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            A781PrvCod = P01SA7_A781PrvCod[0] ;
            A278CliNif = P01SA7_A278CliNif[0] ;
            A858ZonGeoCod = P01SA7_A858ZonGeoCod[0] ;
            A3644CliNom1 = P01SA7_A3644CliNom1[0] ;
            A279CliNom = P01SA7_A279CliNom[0] ;
            A4828CliCp2 = P01SA7_A4828CliCp2[0] ;
            A256CliCp = P01SA7_A256CliCp[0] ;
            A295CliPob = P01SA7_A295CliPob[0] ;
            A260CliDom = P01SA7_A260CliDom[0] ;
            /* Using cursor P01SA8 */
            pr_default.execute(5, new Object[] {Short.valueOf(A781PrvCod)});
            A787PrvDsc = P01SA8_A787PrvDsc[0] ;
            n787PrvDsc = P01SA8_n787PrvDsc[0] ;
            AV79CliNif = A278CliNif ;
            AV23FpgCod = A437FacFpg ;
            /* Execute user subroutine: 'FORPAG' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               pr_default.close(4);
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
            AV61DesPago = GXutil.substring( AV24FpgDsc, 1, 16) ;
            AV97IvaPor = A443FacIVAPor ;
            if ( GXutil.strcmp(A450FacPri, "0") == 0 )
            {
               AV97IvaPor = (byte)(0) ;
               AV114ContDsc = "" ;
               AV131Texto_1 = "" ;
               AV132Texto_2 = "" ;
               AV133EmpItm5 = "" ;
               AV138EmpItm7 = "" ;
            }
            AV118ZonGeoCod = A858ZonGeoCod ;
            AV117Texto_sp = "" ;
            if ( A858ZonGeoCod == 999 )
            {
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
            /* Using cursor P01SA9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A956FacVtoLin = P01SA9_A956FacVtoLin[0] ;
               A957FacVtoFch = P01SA9_A957FacVtoFch[0] ;
               n957FacVtoFch = P01SA9_n957FacVtoFch[0] ;
               AV92Paso = (byte)(AV92Paso+1) ;
               AV37Vencim[AV92Paso-1] = A957FacVtoFch ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV68FacImpTot = A441FacImpTot ;
            AV69FacImpPP = A440FacImpPP ;
            AV70FacIvaImp = A442FacIVAImp ;
            AV71FacTot = A455FacTot ;
            AV81FacBasImp = A429FacBasImp ;
            AV122Facdtopp = A434FacDtoPP ;
            AV123FacIvaPor = A443FacIVAPor ;
            AV78TotFac = GXutil.roundDecimal( (A455FacTot.multiply(AV16ValEuro)), 0) ;
            AV119Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            AV136FacFirma = A9605FacFirma ;
            if ( GXutil.strcmp(A450FacPri, "1") == 0 )
            {
               if ( GXutil.strcmp(A9605FacFirma, " ") != 0 )
               {
                  AV121Firma4dig = GXutil.substring( A9605FacFirma, 1, 1) + GXutil.substring( A9605FacFirma, 11, 1) + GXutil.substring( A9605FacFirma, 21, 1) + GXutil.substring( A9605FacFirma, 31, 1) ;
                  AV119Texto_fd = AV121Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV120FirmaD) + httpContext.getMessage( "/DGCI", "") ;
               }
               else
               {
                  AV119Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
               }
            }
            AV127Aux4 = DecimalUtil.doubleToDec(0) ;
            if ( AV108Mas_i == 1 )
            {
               AV80NumLin = (byte)(1) ;
            }
            else
            {
               AV80NumLin = (byte)(0) ;
            }
            AV96FlagNoFin = (byte)(1) ;
            /* Using cursor P01SA10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               brk1SA6 = false ;
               A427FacAlbCod = P01SA10_A427FacAlbCod[0] ;
               A428FacAlbTip = P01SA10_A428FacAlbTip[0] ;
               A448FacPreKgs = P01SA10_A448FacPreKgs[0] ;
               A444FacKgs = P01SA10_A444FacKgs[0] ;
               A9649FacPKDto = P01SA10_A9649FacPKDto[0] ;
               A9650FacPMdto = P01SA10_A9650FacPMdto[0] ;
               A9648FacDtoL = P01SA10_A9648FacDtoL[0] ;
               A9647FacImpdto = P01SA10_A9647FacImpdto[0] ;
               A9651FacImpd = P01SA10_A9651FacImpd[0] ;
               A9708FacDscII = P01SA10_A9708FacDscII[0] ;
               A449FacPreMts = P01SA10_A449FacPreMts[0] ;
               A447FacMts = P01SA10_A447FacMts[0] ;
               A432FacDsc = P01SA10_A432FacDsc[0] ;
               A4814FacEncCli = P01SA10_A4814FacEncCli[0] ;
               A3397FacFasCod = P01SA10_A3397FacFasCod[0] ;
               A1296FacBarPar = P01SA10_A1296FacBarPar[0] ;
               A1295FacBarReo = P01SA10_A1295FacBarReo[0] ;
               A1294FacBarCod = P01SA10_A1294FacBarCod[0] ;
               A1498FacDisNum = P01SA10_A1498FacDisNum[0] ;
               A454FacSer = P01SA10_A454FacSer[0] ;
               A446FacLin = P01SA10_A446FacLin[0] ;
               if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) != 0 )
               {
                  if ( AV80NumLin >= 36 )
                  {
                     /* Execute user subroutine: 'PIE' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(7);
                        pr_default.close(5);
                        pr_default.close(4);
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
                  AV113ALbProCod = A427FacAlbCod ;
                  /* Execute user subroutine: 'CALPRD' */
                  S151 ();
                  if ( returnInSub )
                  {
                     pr_default.close(7);
                     pr_default.close(5);
                     pr_default.close(4);
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
                  h1SA0( false, 26) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Guia de Remessa nº", ""), 171, Gx_line+6, 292, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9")), 307, Gx_line+6, 381, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 401, Gx_line+6, 417, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( AV112AlbProFch, "99/99/99"), 435, Gx_line+6, 486, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115Texto_m, "")), 642, Gx_line+6, 721, Gx_line+22, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+26) ;
                  AV80NumLin = (byte)(AV80NumLin+2) ;
                  AV98Last_Enc = GXutil.space( (short)(20)) ;
                  AV116Flag_linea = (byte)(0) ;
                  AV135VarCtrl = " " ;
                  while ( (pr_default.getStatus(7) != 101) && ( P01SA10_A427FacAlbCod[0] == A427FacAlbCod ) )
                  {
                     brk1SA6 = false ;
                     A428FacAlbTip = P01SA10_A428FacAlbTip[0] ;
                     A448FacPreKgs = P01SA10_A448FacPreKgs[0] ;
                     A444FacKgs = P01SA10_A444FacKgs[0] ;
                     A9649FacPKDto = P01SA10_A9649FacPKDto[0] ;
                     A9650FacPMdto = P01SA10_A9650FacPMdto[0] ;
                     A9648FacDtoL = P01SA10_A9648FacDtoL[0] ;
                     A9647FacImpdto = P01SA10_A9647FacImpdto[0] ;
                     A9651FacImpd = P01SA10_A9651FacImpd[0] ;
                     A9708FacDscII = P01SA10_A9708FacDscII[0] ;
                     A449FacPreMts = P01SA10_A449FacPreMts[0] ;
                     A447FacMts = P01SA10_A447FacMts[0] ;
                     A432FacDsc = P01SA10_A432FacDsc[0] ;
                     A4814FacEncCli = P01SA10_A4814FacEncCli[0] ;
                     A3397FacFasCod = P01SA10_A3397FacFasCod[0] ;
                     A1296FacBarPar = P01SA10_A1296FacBarPar[0] ;
                     A1295FacBarReo = P01SA10_A1295FacBarReo[0] ;
                     A1294FacBarCod = P01SA10_A1294FacBarCod[0] ;
                     A1498FacDisNum = P01SA10_A1498FacDisNum[0] ;
                     A446FacLin = P01SA10_A446FacLin[0] ;
                     if ( GXutil.strcmp(P01SA10_A396EmprCod[0], A396EmprCod) == 0 )
                     {
                        if ( P01SA10_A430FacCod[0] == A430FacCod )
                        {
                           if ( GXutil.strcmp(A1498FacDisNum+GXutil.str( A1294FacBarCod, 8, 0)+GXutil.str( A1295FacBarReo, 1, 0)+A1296FacBarPar, AV135VarCtrl) != 0 )
                           {
                              AV116Flag_linea = (byte)(0) ;
                           }
                           AV104EncCli = GXutil.substring( A1498FacDisNum, 1, 8) ;
                           AV99Nueves9 = "99999999" ;
                           AV101Hdr_8 = GXutil.str( A1294FacBarCod, 8, 0) ;
                           AV101Hdr_8 = GXutil.ltrim( GXutil.rtrim( AV101Hdr_8)) ;
                           AV100LenVar = (byte)(GXutil.len( AV101Hdr_8)) ;
                           AV100LenVar = (byte)(8-AV100LenVar) ;
                           AV101Hdr_8 = GXutil.substring( AV99Nueves9, 1, AV100LenVar) + AV101Hdr_8 ;
                           AV88Hdr = AV101Hdr_8 + "-" + GXutil.str( A1295FacBarReo, 1, 0) + GXutil.ltrim( A1296FacBarPar) ;
                           AV82BarSerDsc = " " ;
                           AV63BarCod = A1294FacBarCod ;
                           AV64BarCodReo = A1295FacBarReo ;
                           AV65BarCodPar = A1296FacBarPar ;
                           /* Execute user subroutine: 'BARCAD' */
                           S121 ();
                           if ( returnInSub )
                           {
                              pr_default.close(7);
                              pr_default.close(5);
                              pr_default.close(4);
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
                           AV130AlbBarRec = (byte)(0) ;
                           /* Using cursor P01SA11 */
                           pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar});
                           while ( (pr_default.getStatus(8) != 101) )
                           {
                              A129BarCod = P01SA11_A129BarCod[0] ;
                              A132BarCodReo = P01SA11_A132BarCodReo[0] ;
                              A130BarCodPar = P01SA11_A130BarCodPar[0] ;
                              A30AlbProCod = P01SA11_A30AlbProCod[0] ;
                              A1265BarAlbPie = P01SA11_A1265BarAlbPie[0] ;
                              A2761AlbBarRec = P01SA11_A2761AlbBarRec[0] ;
                              AV89Piezas = (short)(A1265BarAlbPie) ;
                              AV130AlbBarRec = (byte)(DecimalUtil.decToDouble(A2761AlbBarRec)) ;
                              /* Exiting from a For First loop. */
                              if (true) break;
                           }
                           pr_default.close(8);
                           if ( A428FacAlbTip == 1 )
                           {
                              if ( GXutil.strcmp(A3397FacFasCod, " ") == 0 )
                              {
                                 AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                 AV91Precio = A448FacPreKgs ;
                                 AV95FacKgs = A444FacKgs ;
                                 if ( AV80NumLin >= 36 )
                                 {
                                    /* Execute user subroutine: 'PIE' */
                                    S111 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(7);
                                       pr_default.close(5);
                                       pr_default.close(4);
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
                                 if ( A448FacPreKgs.doubleValue() > 0 )
                                 {
                                    h1SA0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Dsc, "")), 110, Gx_line+0, 403, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 409, Gx_line+0, 483, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95FacKgs, "ZZZZZZ.ZZ")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 598, Gx_line+0, 614, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104EncCli, "")), 40, Gx_line+0, 99, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV89Piezas), "ZZZ9")), 491, Gx_line+0, 521, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV130AlbBarRec), "ZZ")), 765, Gx_line+1, 776, Gx_line+15, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                    AV116Flag_linea = (byte)(1) ;
                                    AV80NumLin = (byte)(AV80NumLin+1) ;
                                    AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                    AV128Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                    AV124Aux1 = AV128Aux5.subtract((AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                                    AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                    AV125Aux2 = AV124Aux1 ;
                                    if ( A444FacKgs.doubleValue() > 0 )
                                    {
                                       AV126Aux3 = AV125Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                                    }
                                    A9649FacPKDto = AV126Aux3 ;
                                    A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                                    A9648FacDtoL = AV122Facdtopp ;
                                    A9647FacImpdto = AV126Aux3.multiply(A444FacKgs) ;
                                    AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                    A9651FacImpd = AV129Aux0 ;
                                    AV127Aux4 = AV127Aux4.add((AV126Aux3.multiply(A444FacKgs))) ;
                                    A9708FacDscII = AV104EncCli + "-" + AV105Dsc + "-" + AV83BarColNom + "-" + GXutil.str( AV89Piezas, 6, 0) ;
                                 }
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV91Precio = A449FacPreMts ;
                                    if ( AV80NumLin >= 36 )
                                    {
                                       /* Execute user subroutine: 'PIE' */
                                       S111 ();
                                       if ( returnInSub )
                                       {
                                          pr_default.close(7);
                                          pr_default.close(5);
                                          pr_default.close(4);
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
                                    h1SA0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 598, Gx_line+0, 614, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                    AV80NumLin = (byte)(AV80NumLin+1) ;
                                    AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                    AV128Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV124Aux1 = AV128Aux5.subtract((AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                                    AV125Aux2 = AV124Aux1 ;
                                    if ( A447FacMts.doubleValue() > 0 )
                                    {
                                       AV126Aux3 = AV125Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                                    }
                                    A9650FacPMdto = AV126Aux3 ;
                                    A9648FacDtoL = AV122Facdtopp ;
                                    A9647FacImpdto = A9647FacImpdto.add(((AV126Aux3.multiply(A447FacMts)))) ;
                                    AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                    A9651FacImpd = AV129Aux0 ;
                                    AV127Aux4 = AV127Aux4.add((AV126Aux3.multiply(A447FacMts))) ;
                                 }
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV91Precio = A449FacPreMts ;
                                    if ( AV80NumLin >= 36 )
                                    {
                                       /* Execute user subroutine: 'PIE' */
                                       S111 ();
                                       if ( returnInSub )
                                       {
                                          pr_default.close(7);
                                          pr_default.close(5);
                                          pr_default.close(4);
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
                                    h1SA0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 598, Gx_line+0, 614, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 409, Gx_line+0, 483, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104EncCli, "")), 40, Gx_line+0, 99, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Dsc, "")), 110, Gx_line+0, 403, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV89Piezas), "ZZZ9")), 491, Gx_line+0, 521, Gx_line+17, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                    AV116Flag_linea = (byte)(1) ;
                                    AV80NumLin = (byte)(AV80NumLin+1) ;
                                    AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                    AV128Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV124Aux1 = AV128Aux5.subtract((AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                                    AV125Aux2 = AV124Aux1 ;
                                    if ( A447FacMts.doubleValue() > 0 )
                                    {
                                       AV126Aux3 = AV125Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                                    }
                                    A9650FacPMdto = AV126Aux3 ;
                                    A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                                    A9648FacDtoL = AV122Facdtopp ;
                                    A9647FacImpdto = AV126Aux3.multiply(A447FacMts) ;
                                    AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                    A9651FacImpd = AV129Aux0 ;
                                    AV127Aux4 = AV127Aux4.add((AV126Aux3.multiply(A447FacMts))) ;
                                    A9708FacDscII = AV104EncCli + "-" + AV105Dsc + "-" + AV83BarColNom + "-" + GXutil.str( AV89Piezas, 6, 0) ;
                                 }
                              }
                           }
                           if ( ! (GXutil.strcmp("", A3397FacFasCod)==0) )
                           {
                              if ( ( ( GXutil.strcmp(A3397FacFasCod, httpContext.getMessage( "ZZZZZZZZ", "")) != 0 ) ) && ( ( GXutil.strcmp(A3397FacFasCod, httpContext.getMessage( "FASE25", "")) != 0 ) ) )
                              {
                                 /* Using cursor P01SA12 */
                                 pr_default.execute(9, new Object[] {A396EmprCod, A3397FacFasCod});
                                 while ( (pr_default.getStatus(9) != 101) )
                                 {
                                    A457FasCod = P01SA12_A457FasCod[0] ;
                                    AV90FacDsc = A432FacDsc ;
                                    /* Exiting from a For First loop. */
                                    if (true) break;
                                 }
                                 pr_default.close(9);
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                    AV91Precio = A448FacPreKgs ;
                                    if ( AV80NumLin >= 36 )
                                    {
                                       /* Execute user subroutine: 'PIE' */
                                       S111 ();
                                       if ( returnInSub )
                                       {
                                          pr_default.close(7);
                                          pr_default.close(5);
                                          pr_default.close(4);
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
                                    if ( AV116Flag_linea == 0 )
                                    {
                                       h1SA0( false, 16) ;
                                       getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90FacDsc, "")), 110, Gx_line+0, 403, Gx_line+17, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 598, Gx_line+0, 614, Gx_line+15, 0+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104EncCli, "")), 40, Gx_line+0, 99, Gx_line+17, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+16) ;
                                       AV116Flag_linea = (byte)(1) ;
                                    }
                                    else
                                    {
                                       h1SA0( false, 17) ;
                                       getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90FacDsc, "")), 110, Gx_line+0, 403, Gx_line+17, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 598, Gx_line+0, 614, Gx_line+15, 0+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+17) ;
                                    }
                                    AV80NumLin = (byte)(AV80NumLin+1) ;
                                    AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                    AV128Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                    AV124Aux1 = AV128Aux5.subtract((AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                                    AV125Aux2 = AV124Aux1 ;
                                    if ( A444FacKgs.doubleValue() > 0 )
                                    {
                                       AV126Aux3 = AV125Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                                    }
                                    A9649FacPKDto = AV126Aux3 ;
                                    A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                                    A9648FacDtoL = AV122Facdtopp ;
                                    A9647FacImpdto = AV126Aux3.multiply(A444FacKgs) ;
                                    AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                    A9651FacImpd = AV129Aux0 ;
                                    AV127Aux4 = AV127Aux4.add((AV126Aux3.multiply(A444FacKgs))) ;
                                    A9708FacDscII = AV104EncCli + "-" + AV90FacDsc ;
                                 }
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV91Precio = A449FacPreMts ;
                                    if ( AV80NumLin >= 36 )
                                    {
                                       /* Execute user subroutine: 'PIE' */
                                       S111 ();
                                       if ( returnInSub )
                                       {
                                          pr_default.close(7);
                                          pr_default.close(5);
                                          pr_default.close(4);
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
                                    h1SA0( false, 16) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 598, Gx_line+1, 614, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                    AV80NumLin = (byte)(AV80NumLin+1) ;
                                    AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                    AV128Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV124Aux1 = AV128Aux5.subtract((AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                                    AV125Aux2 = AV124Aux1 ;
                                    if ( A447FacMts.doubleValue() > 0 )
                                    {
                                       AV126Aux3 = AV125Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                                    }
                                    A9650FacPMdto = AV126Aux3 ;
                                    A9648FacDtoL = AV122Facdtopp ;
                                    A9647FacImpdto = A9647FacImpdto.add((AV126Aux3.multiply(A447FacMts))) ;
                                    AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                    A9651FacImpd = AV129Aux0 ;
                                    AV127Aux4 = AV127Aux4.add((AV126Aux3.multiply(A447FacMts))) ;
                                 }
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV91Precio = A449FacPreMts ;
                                    if ( AV80NumLin >= 36 )
                                    {
                                       /* Execute user subroutine: 'PIE' */
                                       S111 ();
                                       if ( returnInSub )
                                       {
                                          pr_default.close(7);
                                          pr_default.close(5);
                                          pr_default.close(4);
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
                                    if ( AV116Flag_linea == 0 )
                                    {
                                       h1SA0( false, 16) ;
                                       getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 598, Gx_line+0, 614, Gx_line+15, 0+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90FacDsc, "")), 110, Gx_line+0, 403, Gx_line+17, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104EncCli, "")), 47, Gx_line+0, 106, Gx_line+17, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+16) ;
                                       AV116Flag_linea = (byte)(1) ;
                                    }
                                    else
                                    {
                                       h1SA0( false, 16) ;
                                       getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(httpContext.getMessage( "Mt", ""), 598, Gx_line+0, 614, Gx_line+15, 0+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90FacDsc, "")), 110, Gx_line+0, 403, Gx_line+17, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+16) ;
                                    }
                                    AV80NumLin = (byte)(AV80NumLin+1) ;
                                    AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                    AV128Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                    AV124Aux1 = AV128Aux5.subtract((AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                                    AV125Aux2 = AV124Aux1 ;
                                    if ( A447FacMts.doubleValue() > 0 )
                                    {
                                       AV126Aux3 = AV125Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                                    }
                                    A9650FacPMdto = AV126Aux3 ;
                                    A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                                    A9648FacDtoL = AV122Facdtopp ;
                                    A9647FacImpdto = AV126Aux3.multiply(A447FacMts) ;
                                    AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                    A9651FacImpd = AV129Aux0 ;
                                    AV127Aux4 = AV127Aux4.add((AV126Aux3.multiply(A447FacMts))) ;
                                    A9708FacDscII = AV104EncCli + "-" + AV90FacDsc ;
                                 }
                              }
                              else
                              {
                                 AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                 AV91Precio = A448FacPreKgs ;
                                 if ( AV80NumLin >= 36 )
                                 {
                                    /* Execute user subroutine: 'PIE' */
                                    S111 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(7);
                                       pr_default.close(5);
                                       pr_default.close(4);
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
                                 if ( GXutil.strcmp(A3397FacFasCod, httpContext.getMessage( "FASE25", "")) == 0 )
                                 {
                                    h1SA0( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 110, Gx_line+2, 403, Gx_line+19, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+2, 763, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 409, Gx_line+2, 483, Gx_line+19, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                                 else
                                 {
                                    h1SA0( false, 16) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 110, Gx_line+0, 403, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 598, Gx_line+0, 614, Gx_line+15, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                 }
                                 AV80NumLin = (byte)(AV80NumLin+1) ;
                                 AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                 AV128Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                                 AV124Aux1 = AV128Aux5.subtract((AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                                 AV125Aux2 = AV124Aux1 ;
                                 if ( A444FacKgs.doubleValue() > 0 )
                                 {
                                    AV126Aux3 = AV125Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                                 }
                                 A9649FacPKDto = AV126Aux3 ;
                                 A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                                 A9648FacDtoL = AV122Facdtopp ;
                                 A9647FacImpdto = AV126Aux3.multiply(A444FacKgs) ;
                                 AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                 A9651FacImpd = AV129Aux0 ;
                                 AV127Aux4 = AV127Aux4.add((AV126Aux3.multiply(A444FacKgs))) ;
                                 A9708FacDscII = A432FacDsc ;
                              }
                           }
                           if ( A428FacAlbTip == 2 )
                           {
                              AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                              AV91Precio = A449FacPreMts ;
                              if ( AV80NumLin >= 36 )
                              {
                                 /* Execute user subroutine: 'PIE' */
                                 S111 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(7);
                                    pr_default.close(5);
                                    pr_default.close(4);
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
                              h1SA0( false, 16) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 110, Gx_line+0, 403, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 529, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 605, Gx_line+0, 613, Gx_line+15, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 674, Gx_line+0, 763, Gx_line+17, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+16) ;
                              AV80NumLin = (byte)(AV80NumLin+1) ;
                              AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                              AV128Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                              AV124Aux1 = AV128Aux5.subtract((AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                              AV125Aux2 = AV124Aux1 ;
                              if ( A447FacMts.doubleValue() > 0 )
                              {
                                 AV126Aux3 = AV125Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                              }
                              A9650FacPMdto = AV126Aux3 ;
                              A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                              A9648FacDtoL = AV122Facdtopp ;
                              A9647FacImpdto = AV126Aux3.multiply(A447FacMts) ;
                              AV129Aux0 = AV128Aux5.multiply(AV122Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                              A9651FacImpd = AV129Aux0 ;
                              AV127Aux4 = AV127Aux4.add((AV126Aux3.multiply(A447FacMts))) ;
                              A9708FacDscII = A432FacDsc ;
                           }
                           AV98Last_Enc = A4814FacEncCli ;
                           AV135VarCtrl = A1498FacDisNum + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                           /* Using cursor P01SA13 */
                           pr_default.execute(10, new Object[] {A9649FacPKDto, A9650FacPMdto, A9648FacDtoL, A9647FacImpdto, A9651FacImpd, A9708FacDscII, A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                        }
                     }
                     brk1SA6 = true ;
                     pr_default.readNext(7);
                  }
               }
               if ( ! brk1SA6 )
               {
                  brk1SA6 = true ;
                  pr_default.readNext(7);
               }
            }
            pr_default.close(7);
            if ( ( AV137existefirmad == 1 ) && (GXutil.strcmp("", A9605FacFirma)==0) )
            {
               h1SA0( false, 33) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 182, Gx_line+0, 601, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
            }
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            AV96FlagNoFin = (byte)(0) ;
            A9643FacLiq1 = AV68FacImpTot ;
            A9644FacLiq2 = GXutil.roundDecimal( AV127Aux4, 2) ;
            A9645FacIva1 = GXutil.roundDecimal( A9644FacLiq2.multiply(DecimalUtil.doubleToDec(AV123FacIvaPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            A9646FacTot1 = A9644FacLiq2.add(A9645FacIva1) ;
            /* Using cursor P01SA14 */
            pr_default.execute(11, new Object[] {Byte.valueOf(A435FacEst), A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A396EmprCod, Integer.valueOf(A430FacCod)});
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
         h1SA0( true, 0) ;
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
      AV108Mas_i = (byte)(1) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV82BarSerDsc = "" ;
      AV83BarColNom = "" ;
      AV84BarColNum = 0 ;
      /* Using cursor P01SA15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV63BarCod), Byte.valueOf(AV64BarCodReo), AV65BarCodPar});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A130BarCodPar = P01SA15_A130BarCodPar[0] ;
         A132BarCodReo = P01SA15_A132BarCodReo[0] ;
         A129BarCod = P01SA15_A129BarCod[0] ;
         A1652BarSerDsc = P01SA15_A1652BarSerDsc[0] ;
         A1234BarNomCli = P01SA15_A1234BarNomCli[0] ;
         A136BarColNum = P01SA15_A136BarColNum[0] ;
         A218BarTipCol = P01SA15_A218BarTipCol[0] ;
         A221BarTra1 = P01SA15_A221BarTra1[0] ;
         A222BarTra2 = P01SA15_A222BarTra2[0] ;
         A223BarTra3 = P01SA15_A223BarTra3[0] ;
         AV82BarSerDsc = A1652BarSerDsc ;
         AV83BarColNom = GXutil.substring( A1234BarNomCli, 1, 10) ;
         AV84BarColNum = A136BarColNum ;
         AV106BarTipCol = A218BarTipCol ;
         /* Execute user subroutine: 'TIPCOL' */
         S1311 ();
         if ( returnInSub )
         {
            pr_default.close(12);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV109Compos = "" ;
         if ( ! (GXutil.strcmp("", A221BarTra1)==0) )
         {
            AV109Compos = GXutil.trim( GXutil.substring( A221BarTra1, 1, 3)) ;
         }
         if ( ! (GXutil.strcmp("", A222BarTra2)==0) )
         {
            AV109Compos += " " + GXutil.trim( GXutil.substring( A222BarTra2, 1, 3)) ;
         }
         if ( ! (GXutil.strcmp("", A223BarTra3)==0) )
         {
            AV109Compos += " " + GXutil.trim( GXutil.substring( A223BarTra3, 1, 3)) ;
         }
         AV105Dsc = GXutil.trim( GXutil.substring( A1652BarSerDsc, 1, 10)) ;
         AV105Dsc += " " + AV109Compos ;
         AV105Dsc += " " + AV107ColDsc ;
         AV134Barfactin = httpContext.getMessage( "N", "") ;
         /* Using cursor P01SA16 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A150BarFacTin = P01SA16_A150BarFacTin[0] ;
            A758ProCod = P01SA16_A758ProCod[0] ;
            A194BarOrdLin = P01SA16_A194BarOrdLin[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV134Barfactin = A150BarFacTin ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(13);
         }
         pr_default.close(13);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'FORPAG' Routine */
      returnInSub = false ;
      AV24FpgDsc = "" ;
      /* Using cursor P01SA17 */
      pr_default.execute(14, new Object[] {A396EmprCod, AV23FpgCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A497FpgCod = P01SA17_A497FpgCod[0] ;
         A498FpgDsc = P01SA17_A498FpgDsc[0] ;
         n498FpgDsc = P01SA17_n498FpgDsc[0] ;
         AV24FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S1311( ) throws ProcessInterruptedException
   {
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      AV107ColDsc = "" ;
      /* Using cursor P01SA18 */
      pr_default.execute(15, new Object[] {A396EmprCod, Byte.valueOf(AV106BarTipCol)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A831TipColCod = P01SA18_A831TipColCod[0] ;
         A832TipColDsc = P01SA18_A832TipColDsc[0] ;
         n832TipColDsc = P01SA18_n832TipColDsc[0] ;
         AV107ColDsc = GXutil.substring( A832TipColDsc, 1, 17) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'CALPRD' Routine */
      returnInSub = false ;
      AV115Texto_m = "" ;
      /* Using cursor P01SA19 */
      pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(AV113ALbProCod)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A30AlbProCod = P01SA19_A30AlbProCod[0] ;
         A34AlbProfch = P01SA19_A34AlbProfch[0] ;
         A2242AlbSec = P01SA19_A2242AlbSec[0] ;
         AV112AlbProFch = A34AlbProfch ;
         if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV115Texto_m = httpContext.getMessage( "Malha Acabada", "") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      AV117Texto_sp = "" ;
      if ( AV118ZonGeoCod == 999 )
      {
         AV117Texto_sp = httpContext.getMessage( "Isento de IVA ao abrigo da alínea a) do nº 1 art. 14 do RITI", "") ;
         if ( GXutil.strcmp(AV115Texto_m, httpContext.getMessage( "Malha Acabada", "")) != 0 )
         {
            AV117Texto_sp = httpContext.getMessage( "Não sujeiçao nº 20 art. 6 do CIVA", "") ;
         }
      }
   }

   public void h1SA0( boolean bFoot ,
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
                  getPrinter().GxDrawText(httpContext.getMessage( "Total Ilíquido", ""), 68, Gx_line+39, 155, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68FacImpTot, "ZZ,ZZZ,ZZ9.99")), 57, Gx_line+57, 166, Gx_line+75, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Desconto", ""), 209, Gx_line+39, 270, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total Líquido", ""), 316, Gx_line+39, 403, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69FacImpPP, "ZZZZZZZZZ9.99")), 185, Gx_line+57, 294, Gx_line+75, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81FacBasImp, "ZZ,ZZZ,ZZ9.99")), 305, Gx_line+57, 414, Gx_line+75, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("%", 447, Gx_line+39, 458, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV97IvaPor), "Z9")), 444, Gx_line+56, 462, Gx_line+74, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor  IVA", ""), 509, Gx_line+39, 575, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 488, Gx_line+56, 597, Gx_line+74, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total Factura", ""), 671, Gx_line+39, 758, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71FacTot, "ZZ,ZZZ,ZZ9.99")), 660, Gx_line+56, 769, Gx_line+74, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Texto_sp, "")), 41, Gx_line+23, 360, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131Texto_1, "")), 202, Gx_line+89, 807, Gx_line+102, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV132Texto_2, "")), 85, Gx_line+101, 711, Gx_line+114, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(23, Gx_line+83, 772, Gx_line+83, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114ContDsc, "")), 23, Gx_line+117, 107, Gx_line+131, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Texto_fd, "")), 485, Gx_line+117, 715, Gx_line+130, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133EmpItm5, "")), 23, Gx_line+0, 628, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV138EmpItm7, "")), 129, Gx_line+117, 463, Gx_line+130, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+133) ;
               }
               else
               {
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "A Transportar", ""), 522, Gx_line+29, 618, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49SumSig, "ZZ,ZZZ,ZZ9.99")), 673, Gx_line+30, 769, Gx_line+47, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Texto_sp, "")), 44, Gx_line+30, 363, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(23, Gx_line+47, 772, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114ContDsc, "")), 23, Gx_line+85, 107, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Texto_fd, "")), 485, Gx_line+85, 715, Gx_line+98, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133EmpItm5, "")), 23, Gx_line+0, 628, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131Texto_1, "")), 202, Gx_line+50, 807, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV132Texto_2, "")), 85, Gx_line+64, 711, Gx_line+77, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV138EmpItm7, "")), 129, Gx_line+85, 463, Gx_line+98, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+100) ;
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
               if ( GXutil.strcmp(A450FacPri, "1") == 0 )
               {
                  getPrinter().GxDrawLine(40, Gx_line+320, 411, Gx_line+320, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 53, Gx_line+329, 112, Gx_line+346, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FACTURA Nº", ""), 49, Gx_line+304, 128, Gx_line+318, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "EMISSAO", ""), 129, Gx_line+304, 187, Gx_line+318, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 126, Gx_line+329, 185, Gx_line+346, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/ Nº CONTRIBUINTE", ""), 278, Gx_line+304, 388, Gx_line+319, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79CliNif, "@!")), 278, Gx_line+329, 425, Gx_line+346, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TextoCopia, "")), 661, Gx_line+329, 771, Gx_line+346, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV37Vencim[1-1], "99/99/99"), 195, Gx_line+329, 254, Gx_line+346, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VENCIMENTO", ""), 195, Gx_line+304, 280, Gx_line+318, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Talão Nº", ""), 40, Gx_line+354, 85, Gx_line+369, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 110, Gx_line+354, 167, Gx_line+369, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 485, Gx_line+354, 520, Gx_line+369, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Qtd.", ""), 572, Gx_line+354, 596, Gx_line+369, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 633, Gx_line+354, 667, Gx_line+369, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 734, Gx_line+354, 762, Gx_line+369, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Via", ""), 578, Gx_line+329, 598, Gx_line+345, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 610, Gx_line+329, 655, Gx_line+346, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110CliNom3, "")), 374, Gx_line+189, 688, Gx_line+207, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 374, Gx_line+213, 588, Gx_line+231, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 374, Gx_line+235, 563, Gx_line+253, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Cpostal, "")), 374, Gx_line+258, 443, Gx_line+275, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 516, Gx_line+260, 673, Gx_line+277, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "EXMO(S) SR(S)", ""), 374, Gx_line+159, 444, Gx_line+172, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE Nº", ""), 640, Gx_line+171, 705, Gx_line+185, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 701, Gx_line+171, 733, Gx_line+185, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(344, Gx_line+150, 344, Gx_line+160, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(344, Gx_line+150, 357, Gx_line+150, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(344, Gx_line+283, 357, Gx_line+283, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(344, Gx_line+274, 344, Gx_line+284, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(739, Gx_line+150, 739, Gx_line+160, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(727, Gx_line+150, 740, Gx_line+150, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(739, Gx_line+274, 739, Gx_line+284, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(727, Gx_line+283, 740, Gx_line+283, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(22, Gx_line+371, 771, Gx_line+371, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "12e1e5ca-1044-41b1-82f4-bceb0981594d", "", context.getHttpContext().getTheme( )), 22, Gx_line+15, 204, Gx_line+67) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+374) ;
               }
               else
               {
                  getPrinter().GxDrawRect(40, Gx_line+250, 216, Gx_line+306, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(41, Gx_line+270, 217, Gx_line+270, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 59, Gx_line+279, 118, Gx_line+296, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FACTURA Nº", ""), 54, Gx_line+254, 133, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 159, Gx_line+254, 194, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 146, Gx_line+279, 205, Gx_line+296, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(135, Gx_line+250, 135, Gx_line+306, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TextoCopia, "")), 661, Gx_line+307, 771, Gx_line+324, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Talão Nº", ""), 40, Gx_line+331, 85, Gx_line+346, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 110, Gx_line+331, 167, Gx_line+346, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 485, Gx_line+331, 520, Gx_line+346, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Qtd.", ""), 572, Gx_line+331, 596, Gx_line+346, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 633, Gx_line+331, 667, Gx_line+346, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 734, Gx_line+331, 762, Gx_line+346, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(22, Gx_line+327, 771, Gx_line+353, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Via", ""), 574, Gx_line+306, 594, Gx_line+322, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 606, Gx_line+307, 651, Gx_line+324, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 701, Gx_line+179, 733, Gx_line+193, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+373) ;
               }
               if ( AV108Mas_i == 1 )
               {
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Transporte", ""), 540, Gx_line+0, 614, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49SumSig, "ZZ,ZZZ,ZZ9.99")), 664, Gx_line+1, 760, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
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
      this.aP0[0] = pfactina.this.A396EmprCod;
      this.aP1[0] = pfactina.this.A430FacCod;
      this.aP2[0] = pfactina.this.AV15ImpCod;
      this.aP3[0] = pfactina.this.AV16ValEuro;
      this.aP4[0] = pfactina.this.AV93TextoCopia;
      this.aP5[0] = pfactina.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfactina");
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
      AV120FirmaD = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P01SA2_A396EmprCod = new String[] {""} ;
      P01SA2_A8334EmpItm1 = new String[] {""} ;
      P01SA2_n8334EmpItm1 = new boolean[] {false} ;
      P01SA2_A8337EmpItm4 = new String[] {""} ;
      P01SA2_n8337EmpItm4 = new boolean[] {false} ;
      P01SA2_A8336EmpItm3 = new String[] {""} ;
      P01SA2_n8336EmpItm3 = new boolean[] {false} ;
      P01SA2_A8338EmpItm5 = new String[] {""} ;
      P01SA2_n8338EmpItm5 = new boolean[] {false} ;
      P01SA2_A8335EmpItm2 = new String[] {""} ;
      P01SA2_n8335EmpItm2 = new boolean[] {false} ;
      P01SA2_A12702EmpItm7 = new String[] {""} ;
      P01SA2_n12702EmpItm7 = new boolean[] {false} ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A8338EmpItm5 = "" ;
      A8335EmpItm2 = "" ;
      A12702EmpItm7 = "" ;
      AV131Texto_1 = "" ;
      AV132Texto_2 = "" ;
      AV133EmpItm5 = "" ;
      AV138EmpItm7 = "" ;
      AV49SumSig = DecimalUtil.ZERO ;
      AV127Aux4 = DecimalUtil.ZERO ;
      P01SA3_A396EmprCod = new String[] {""} ;
      P01SA3_A430FacCod = new int[1] ;
      P01SA3_A437FacFpg = new String[] {""} ;
      P01SA3_A9605FacFirma = new String[] {""} ;
      P01SA3_A435FacEst = new byte[1] ;
      P01SA3_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A450FacPri = new String[] {""} ;
      P01SA3_A252CliCod = new int[1] ;
      P01SA3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P01SA3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_n8346FacRecI = new boolean[] {false} ;
      P01SA3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A443FacIVAPor = new byte[1] ;
      P01SA3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A437FacFpg = "" ;
      A9605FacFirma = "" ;
      A9643FacLiq1 = DecimalUtil.ZERO ;
      A9644FacLiq2 = DecimalUtil.ZERO ;
      A9645FacIva1 = DecimalUtil.ZERO ;
      A9646FacTot1 = DecimalUtil.ZERO ;
      A450FacPri = "" ;
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
      P01SA4_A7209Colombia = new byte[1] ;
      P01SA4_n7209Colombia = new boolean[] {false} ;
      P01SA6_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      P01SA7_A781PrvCod = new short[1] ;
      P01SA7_A278CliNif = new String[] {""} ;
      P01SA7_A858ZonGeoCod = new short[1] ;
      P01SA7_A3644CliNom1 = new String[] {""} ;
      P01SA7_A279CliNom = new String[] {""} ;
      P01SA7_A4828CliCp2 = new String[] {""} ;
      P01SA7_A256CliCp = new String[] {""} ;
      P01SA7_A295CliPob = new String[] {""} ;
      P01SA7_A260CliDom = new String[] {""} ;
      A278CliNif = "" ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      P01SA8_A787PrvDsc = new String[] {""} ;
      P01SA8_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      AV79CliNif = "" ;
      AV23FpgCod = "" ;
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
      P01SA9_A396EmprCod = new String[] {""} ;
      P01SA9_A430FacCod = new int[1] ;
      P01SA9_A956FacVtoLin = new byte[1] ;
      P01SA9_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P01SA9_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV68FacImpTot = DecimalUtil.ZERO ;
      AV69FacImpPP = DecimalUtil.ZERO ;
      AV70FacIvaImp = DecimalUtil.ZERO ;
      AV71FacTot = DecimalUtil.ZERO ;
      AV81FacBasImp = DecimalUtil.ZERO ;
      AV122Facdtopp = DecimalUtil.ZERO ;
      AV78TotFac = DecimalUtil.ZERO ;
      AV119Texto_fd = "" ;
      AV136FacFirma = "" ;
      AV121Firma4dig = "" ;
      P01SA10_A396EmprCod = new String[] {""} ;
      P01SA10_A430FacCod = new int[1] ;
      P01SA10_A427FacAlbCod = new long[1] ;
      P01SA10_A428FacAlbTip = new byte[1] ;
      P01SA10_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A9648FacDtoL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A9651FacImpd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A9708FacDscII = new String[] {""} ;
      P01SA10_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SA10_A432FacDsc = new String[] {""} ;
      P01SA10_A4814FacEncCli = new String[] {""} ;
      P01SA10_A3397FacFasCod = new String[] {""} ;
      P01SA10_A1296FacBarPar = new String[] {""} ;
      P01SA10_A1295FacBarReo = new byte[1] ;
      P01SA10_A1294FacBarCod = new int[1] ;
      P01SA10_A1498FacDisNum = new String[] {""} ;
      P01SA10_A454FacSer = new String[] {""} ;
      P01SA10_A446FacLin = new int[1] ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A9649FacPKDto = DecimalUtil.ZERO ;
      A9650FacPMdto = DecimalUtil.ZERO ;
      A9648FacDtoL = DecimalUtil.ZERO ;
      A9647FacImpdto = DecimalUtil.ZERO ;
      A9651FacImpd = DecimalUtil.ZERO ;
      A9708FacDscII = "" ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A4814FacEncCli = "" ;
      A3397FacFasCod = "" ;
      A1296FacBarPar = "" ;
      A1498FacDisNum = "" ;
      A454FacSer = "" ;
      AV112AlbProFch = GXutil.nullDate() ;
      AV115Texto_m = "" ;
      AV98Last_Enc = "" ;
      AV135VarCtrl = "" ;
      AV104EncCli = "" ;
      AV99Nueves9 = "" ;
      AV101Hdr_8 = "" ;
      AV88Hdr = "" ;
      AV82BarSerDsc = "" ;
      AV65BarCodPar = "" ;
      P01SA11_A396EmprCod = new String[] {""} ;
      P01SA11_A129BarCod = new int[1] ;
      P01SA11_A132BarCodReo = new byte[1] ;
      P01SA11_A130BarCodPar = new String[] {""} ;
      P01SA11_A30AlbProCod = new long[1] ;
      P01SA11_A1265BarAlbPie = new int[1] ;
      P01SA11_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      AV67TotLin = DecimalUtil.ZERO ;
      AV91Precio = DecimalUtil.ZERO ;
      AV95FacKgs = DecimalUtil.ZERO ;
      AV105Dsc = "" ;
      AV83BarColNom = "" ;
      AV128Aux5 = DecimalUtil.ZERO ;
      AV124Aux1 = DecimalUtil.ZERO ;
      AV129Aux0 = DecimalUtil.ZERO ;
      AV125Aux2 = DecimalUtil.ZERO ;
      AV126Aux3 = DecimalUtil.ZERO ;
      P01SA12_A396EmprCod = new String[] {""} ;
      P01SA12_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      AV90FacDsc = "" ;
      P01SA15_A396EmprCod = new String[] {""} ;
      P01SA15_A130BarCodPar = new String[] {""} ;
      P01SA15_A132BarCodReo = new byte[1] ;
      P01SA15_A129BarCod = new int[1] ;
      P01SA15_A1652BarSerDsc = new String[] {""} ;
      P01SA15_A1234BarNomCli = new String[] {""} ;
      P01SA15_A136BarColNum = new int[1] ;
      P01SA15_A218BarTipCol = new byte[1] ;
      P01SA15_A221BarTra1 = new String[] {""} ;
      P01SA15_A222BarTra2 = new String[] {""} ;
      P01SA15_A223BarTra3 = new String[] {""} ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      AV109Compos = "" ;
      AV107ColDsc = "" ;
      AV134Barfactin = "" ;
      P01SA16_A396EmprCod = new String[] {""} ;
      P01SA16_A129BarCod = new int[1] ;
      P01SA16_A132BarCodReo = new byte[1] ;
      P01SA16_A130BarCodPar = new String[] {""} ;
      P01SA16_A150BarFacTin = new String[] {""} ;
      P01SA16_A758ProCod = new String[] {""} ;
      P01SA16_A194BarOrdLin = new short[1] ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      P01SA17_A396EmprCod = new String[] {""} ;
      P01SA17_A497FpgCod = new String[] {""} ;
      P01SA17_A498FpgDsc = new String[] {""} ;
      P01SA17_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      P01SA18_A396EmprCod = new String[] {""} ;
      P01SA18_A831TipColCod = new byte[1] ;
      P01SA18_A832TipColDsc = new String[] {""} ;
      P01SA18_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P01SA19_A396EmprCod = new String[] {""} ;
      P01SA19_A30AlbProCod = new long[1] ;
      P01SA19_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P01SA19_A2242AlbSec = new String[] {""} ;
      A34AlbProfch = GXutil.nullDate() ;
      A2242AlbSec = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfactina__default(),
         new Object[] {
             new Object[] {
            P01SA2_A396EmprCod, P01SA2_A8334EmpItm1, P01SA2_n8334EmpItm1, P01SA2_A8337EmpItm4, P01SA2_n8337EmpItm4, P01SA2_A8336EmpItm3, P01SA2_n8336EmpItm3, P01SA2_A8338EmpItm5, P01SA2_n8338EmpItm5, P01SA2_A8335EmpItm2,
            P01SA2_n8335EmpItm2, P01SA2_A12702EmpItm7, P01SA2_n12702EmpItm7
            }
            , new Object[] {
            P01SA3_A396EmprCod, P01SA3_A430FacCod, P01SA3_A437FacFpg, P01SA3_A9605FacFirma, P01SA3_A435FacEst, P01SA3_A9643FacLiq1, P01SA3_A9644FacLiq2, P01SA3_A9645FacIva1, P01SA3_A9646FacTot1, P01SA3_A450FacPri,
            P01SA3_A252CliCod, P01SA3_A436FacFch, P01SA3_A11513FacRecIca, P01SA3_A8346FacRecI, P01SA3_n8346FacRecI, P01SA3_A7212FacRect, P01SA3_A453FacRECPor, P01SA3_A14224FacCostFac, P01SA3_A14223FacCostKgs, P01SA3_A14222FacCostMts,
            P01SA3_A433FacDtoGen, P01SA3_A443FacIVAPor, P01SA3_A434FacDtoPP, P01SA3_A14219FacEnergia
            }
            , new Object[] {
            P01SA4_A7209Colombia, P01SA4_n7209Colombia
            }
            , new Object[] {
            P01SA6_A3918FacImpTot1
            }
            , new Object[] {
            P01SA7_A781PrvCod, P01SA7_A278CliNif, P01SA7_A858ZonGeoCod, P01SA7_A3644CliNom1, P01SA7_A279CliNom, P01SA7_A4828CliCp2, P01SA7_A256CliCp, P01SA7_A295CliPob, P01SA7_A260CliDom
            }
            , new Object[] {
            P01SA8_A787PrvDsc, P01SA8_n787PrvDsc
            }
            , new Object[] {
            P01SA9_A396EmprCod, P01SA9_A430FacCod, P01SA9_A956FacVtoLin, P01SA9_A957FacVtoFch, P01SA9_n957FacVtoFch
            }
            , new Object[] {
            P01SA10_A396EmprCod, P01SA10_A430FacCod, P01SA10_A427FacAlbCod, P01SA10_A428FacAlbTip, P01SA10_A448FacPreKgs, P01SA10_A444FacKgs, P01SA10_A9649FacPKDto, P01SA10_A9650FacPMdto, P01SA10_A9648FacDtoL, P01SA10_A9647FacImpdto,
            P01SA10_A9651FacImpd, P01SA10_A9708FacDscII, P01SA10_A449FacPreMts, P01SA10_A447FacMts, P01SA10_A432FacDsc, P01SA10_A4814FacEncCli, P01SA10_A3397FacFasCod, P01SA10_A1296FacBarPar, P01SA10_A1295FacBarReo, P01SA10_A1294FacBarCod,
            P01SA10_A1498FacDisNum, P01SA10_A454FacSer, P01SA10_A446FacLin
            }
            , new Object[] {
            P01SA11_A396EmprCod, P01SA11_A129BarCod, P01SA11_A132BarCodReo, P01SA11_A130BarCodPar, P01SA11_A30AlbProCod, P01SA11_A1265BarAlbPie, P01SA11_A2761AlbBarRec
            }
            , new Object[] {
            P01SA12_A396EmprCod, P01SA12_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01SA15_A396EmprCod, P01SA15_A130BarCodPar, P01SA15_A132BarCodReo, P01SA15_A129BarCod, P01SA15_A1652BarSerDsc, P01SA15_A1234BarNomCli, P01SA15_A136BarColNum, P01SA15_A218BarTipCol, P01SA15_A221BarTra1, P01SA15_A222BarTra2,
            P01SA15_A223BarTra3
            }
            , new Object[] {
            P01SA16_A396EmprCod, P01SA16_A129BarCod, P01SA16_A132BarCodReo, P01SA16_A130BarCodPar, P01SA16_A150BarFacTin, P01SA16_A758ProCod, P01SA16_A194BarOrdLin
            }
            , new Object[] {
            P01SA17_A396EmprCod, P01SA17_A497FpgCod, P01SA17_A498FpgDsc, P01SA17_n498FpgDsc
            }
            , new Object[] {
            P01SA18_A396EmprCod, P01SA18_A831TipColCod, P01SA18_A832TipColDsc, P01SA18_n832TipColDsc
            }
            , new Object[] {
            P01SA19_A396EmprCod, P01SA19_A30AlbProCod, P01SA19_A34AlbProfch, P01SA19_A2242AlbSec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV137existefirmad ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV62CtrlPag ;
   private byte AV80NumLin ;
   private byte AV108Mas_i ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV97IvaPor ;
   private byte AV58FlagPag ;
   private byte AV92Paso ;
   private byte A956FacVtoLin ;
   private byte AV123FacIvaPor ;
   private byte AV96FlagNoFin ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private byte AV116Flag_linea ;
   private byte AV100LenVar ;
   private byte AV64BarCodReo ;
   private byte AV130AlbBarRec ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV106BarTipCol ;
   private byte A831TipColCod ;
   private short A781PrvCod ;
   private short A858ZonGeoCod ;
   private short AV118ZonGeoCod ;
   private short AV89Piezas ;
   private short A194BarOrdLin ;
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
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private int Gx_OldLine ;
   private int AV63BarCod ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV84BarColNum ;
   private int A136BarColNum ;
   private long A427FacAlbCod ;
   private long AV113ALbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV16ValEuro ;
   private java.math.BigDecimal AV49SumSig ;
   private java.math.BigDecimal AV127Aux4 ;
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
   private java.math.BigDecimal AV70FacIvaImp ;
   private java.math.BigDecimal AV71FacTot ;
   private java.math.BigDecimal AV81FacBasImp ;
   private java.math.BigDecimal AV122Facdtopp ;
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
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal AV67TotLin ;
   private java.math.BigDecimal AV91Precio ;
   private java.math.BigDecimal AV95FacKgs ;
   private java.math.BigDecimal AV128Aux5 ;
   private java.math.BigDecimal AV124Aux1 ;
   private java.math.BigDecimal AV129Aux0 ;
   private java.math.BigDecimal AV125Aux2 ;
   private java.math.BigDecimal AV126Aux3 ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV93TextoCopia ;
   private String Gx_out ;
   private String AV114ContDsc ;
   private String AV120FirmaD ;
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
   private String A12702EmpItm7 ;
   private String AV131Texto_1 ;
   private String AV132Texto_2 ;
   private String AV133EmpItm5 ;
   private String AV138EmpItm7 ;
   private String A437FacFpg ;
   private String A9605FacFirma ;
   private String A450FacPri ;
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
   private String AV61DesPago ;
   private String AV24FpgDsc ;
   private String AV117Texto_sp ;
   private String AV110CliNom3 ;
   private String AV51CliPri ;
   private String AV102Cpostal ;
   private String AV119Texto_fd ;
   private String AV136FacFirma ;
   private String AV121Firma4dig ;
   private String A9708FacDscII ;
   private String A432FacDsc ;
   private String A4814FacEncCli ;
   private String A3397FacFasCod ;
   private String A1296FacBarPar ;
   private String A1498FacDisNum ;
   private String A454FacSer ;
   private String AV115Texto_m ;
   private String AV98Last_Enc ;
   private String AV135VarCtrl ;
   private String AV104EncCli ;
   private String AV99Nueves9 ;
   private String AV101Hdr_8 ;
   private String AV88Hdr ;
   private String AV82BarSerDsc ;
   private String AV65BarCodPar ;
   private String A130BarCodPar ;
   private String AV105Dsc ;
   private String AV83BarColNom ;
   private String A457FasCod ;
   private String AV90FacDsc ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String AV109Compos ;
   private String AV107ColDsc ;
   private String AV134Barfactin ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A832TipColDsc ;
   private String A2242AlbSec ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV85FacFch ;
   private java.util.Date AV37Vencim[] ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date AV112AlbProFch ;
   private java.util.Date A34AlbProfch ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n8338EmpItm5 ;
   private boolean n8335EmpItm2 ;
   private boolean n12702EmpItm7 ;
   private boolean GxHdr3 ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean n787PrvDsc ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean brk1SA6 ;
   private boolean n498FpgDsc ;
   private boolean n832TipColDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01SA2_A396EmprCod ;
   private String[] P01SA2_A8334EmpItm1 ;
   private boolean[] P01SA2_n8334EmpItm1 ;
   private String[] P01SA2_A8337EmpItm4 ;
   private boolean[] P01SA2_n8337EmpItm4 ;
   private String[] P01SA2_A8336EmpItm3 ;
   private boolean[] P01SA2_n8336EmpItm3 ;
   private String[] P01SA2_A8338EmpItm5 ;
   private boolean[] P01SA2_n8338EmpItm5 ;
   private String[] P01SA2_A8335EmpItm2 ;
   private boolean[] P01SA2_n8335EmpItm2 ;
   private String[] P01SA2_A12702EmpItm7 ;
   private boolean[] P01SA2_n12702EmpItm7 ;
   private String[] P01SA3_A396EmprCod ;
   private int[] P01SA3_A430FacCod ;
   private String[] P01SA3_A437FacFpg ;
   private String[] P01SA3_A9605FacFirma ;
   private byte[] P01SA3_A435FacEst ;
   private java.math.BigDecimal[] P01SA3_A9643FacLiq1 ;
   private java.math.BigDecimal[] P01SA3_A9644FacLiq2 ;
   private java.math.BigDecimal[] P01SA3_A9645FacIva1 ;
   private java.math.BigDecimal[] P01SA3_A9646FacTot1 ;
   private String[] P01SA3_A450FacPri ;
   private int[] P01SA3_A252CliCod ;
   private java.util.Date[] P01SA3_A436FacFch ;
   private java.math.BigDecimal[] P01SA3_A11513FacRecIca ;
   private java.math.BigDecimal[] P01SA3_A8346FacRecI ;
   private boolean[] P01SA3_n8346FacRecI ;
   private java.math.BigDecimal[] P01SA3_A7212FacRect ;
   private java.math.BigDecimal[] P01SA3_A453FacRECPor ;
   private java.math.BigDecimal[] P01SA3_A14224FacCostFac ;
   private java.math.BigDecimal[] P01SA3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P01SA3_A14222FacCostMts ;
   private java.math.BigDecimal[] P01SA3_A433FacDtoGen ;
   private byte[] P01SA3_A443FacIVAPor ;
   private java.math.BigDecimal[] P01SA3_A434FacDtoPP ;
   private java.math.BigDecimal[] P01SA3_A14219FacEnergia ;
   private byte[] P01SA4_A7209Colombia ;
   private boolean[] P01SA4_n7209Colombia ;
   private java.math.BigDecimal[] P01SA6_A3918FacImpTot1 ;
   private short[] P01SA7_A781PrvCod ;
   private String[] P01SA7_A278CliNif ;
   private short[] P01SA7_A858ZonGeoCod ;
   private String[] P01SA7_A3644CliNom1 ;
   private String[] P01SA7_A279CliNom ;
   private String[] P01SA7_A4828CliCp2 ;
   private String[] P01SA7_A256CliCp ;
   private String[] P01SA7_A295CliPob ;
   private String[] P01SA7_A260CliDom ;
   private String[] P01SA8_A787PrvDsc ;
   private boolean[] P01SA8_n787PrvDsc ;
   private String[] P01SA9_A396EmprCod ;
   private int[] P01SA9_A430FacCod ;
   private byte[] P01SA9_A956FacVtoLin ;
   private java.util.Date[] P01SA9_A957FacVtoFch ;
   private boolean[] P01SA9_n957FacVtoFch ;
   private String[] P01SA10_A396EmprCod ;
   private int[] P01SA10_A430FacCod ;
   private long[] P01SA10_A427FacAlbCod ;
   private byte[] P01SA10_A428FacAlbTip ;
   private java.math.BigDecimal[] P01SA10_A448FacPreKgs ;
   private java.math.BigDecimal[] P01SA10_A444FacKgs ;
   private java.math.BigDecimal[] P01SA10_A9649FacPKDto ;
   private java.math.BigDecimal[] P01SA10_A9650FacPMdto ;
   private java.math.BigDecimal[] P01SA10_A9648FacDtoL ;
   private java.math.BigDecimal[] P01SA10_A9647FacImpdto ;
   private java.math.BigDecimal[] P01SA10_A9651FacImpd ;
   private String[] P01SA10_A9708FacDscII ;
   private java.math.BigDecimal[] P01SA10_A449FacPreMts ;
   private java.math.BigDecimal[] P01SA10_A447FacMts ;
   private String[] P01SA10_A432FacDsc ;
   private String[] P01SA10_A4814FacEncCli ;
   private String[] P01SA10_A3397FacFasCod ;
   private String[] P01SA10_A1296FacBarPar ;
   private byte[] P01SA10_A1295FacBarReo ;
   private int[] P01SA10_A1294FacBarCod ;
   private String[] P01SA10_A1498FacDisNum ;
   private String[] P01SA10_A454FacSer ;
   private int[] P01SA10_A446FacLin ;
   private String[] P01SA11_A396EmprCod ;
   private int[] P01SA11_A129BarCod ;
   private byte[] P01SA11_A132BarCodReo ;
   private String[] P01SA11_A130BarCodPar ;
   private long[] P01SA11_A30AlbProCod ;
   private int[] P01SA11_A1265BarAlbPie ;
   private java.math.BigDecimal[] P01SA11_A2761AlbBarRec ;
   private String[] P01SA12_A396EmprCod ;
   private String[] P01SA12_A457FasCod ;
   private String[] P01SA15_A396EmprCod ;
   private String[] P01SA15_A130BarCodPar ;
   private byte[] P01SA15_A132BarCodReo ;
   private int[] P01SA15_A129BarCod ;
   private String[] P01SA15_A1652BarSerDsc ;
   private String[] P01SA15_A1234BarNomCli ;
   private int[] P01SA15_A136BarColNum ;
   private byte[] P01SA15_A218BarTipCol ;
   private String[] P01SA15_A221BarTra1 ;
   private String[] P01SA15_A222BarTra2 ;
   private String[] P01SA15_A223BarTra3 ;
   private String[] P01SA16_A396EmprCod ;
   private int[] P01SA16_A129BarCod ;
   private byte[] P01SA16_A132BarCodReo ;
   private String[] P01SA16_A130BarCodPar ;
   private String[] P01SA16_A150BarFacTin ;
   private String[] P01SA16_A758ProCod ;
   private short[] P01SA16_A194BarOrdLin ;
   private String[] P01SA17_A396EmprCod ;
   private String[] P01SA17_A497FpgCod ;
   private String[] P01SA17_A498FpgDsc ;
   private boolean[] P01SA17_n498FpgDsc ;
   private String[] P01SA18_A396EmprCod ;
   private byte[] P01SA18_A831TipColCod ;
   private String[] P01SA18_A832TipColDsc ;
   private boolean[] P01SA18_n832TipColDsc ;
   private String[] P01SA19_A396EmprCod ;
   private long[] P01SA19_A30AlbProCod ;
   private java.util.Date[] P01SA19_A34AlbProfch ;
   private String[] P01SA19_A2242AlbSec ;
}

final  class pfactina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01SA2", "SELECT EmprCod, EmpItm1, EmpItm4, EmpItm3, EmpItm5, EmpItm2, EmpItm7 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA3", "SELECT EmprCod, FacCod, FacFpg, FacFirma, FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1, FacPri, CliCod, FacFch, FacRecIca, FacRecI, FacRect, FacRECPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoGen, FacIVAPor, FacDtoPP, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA4", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA6", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA7", "SELECT PrvCod, CliNif, ZonGeoCod, CliNom1, CliNom, CliCp2, CliCp, CliPob, CliDom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA8", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA9", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01SA10", "SELECT EmprCod, FacCod, FacAlbCod, FacAlbTip, FacPreKgs, FacKgs, FacPKDto, FacPMdto, FacDtoL, FacImpdto, FacImpd, FacDscII, FacPreMts, FacMts, FacDsc, FacEncCli, FacFasCod, FacBarPar, FacBarReo, FacBarCod, FacDisNum, FacSer, FacLin FROM TXPLFAVEN WHERE (EmprCod = ?) AND (FacCod = ?) ORDER BY FacAlbCod, FacDisNum, FacBarCod, FacBarReo, FacBarPar, FacFasCod  FOR UPDATE OF FacPKDto, FacPMdto, FacDtoL, FacImpdto, FacImpd, FacDscII NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01SA11", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, BarAlbPie, AlbBarRec FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA12", "SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01SA13", "UPDATE TXPLFAVEN SET FacPKDto=?, FacPMdto=?, FacDtoL=?, FacImpdto=?, FacImpd=?, FacDscII=?  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P01SA14", "UPDATE TXPCFAVEN SET FacEst=?, FacLiq1=?, FacLiq2=?, FacIva1=?, FacTot1=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P01SA15", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSerDsc, BarNomCli, BarColNum, BarTipCol, BarTra1, BarTra2, BarTra3 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA16", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01SA17", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA18", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01SA19", "SELECT EmprCod, AlbProCod, AlbProfch, AlbSec FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[11])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
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
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 200);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 8);
               ((String[]) buf[21])[0] = rslt.getString(22, 16);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((String[]) buf[10])[0] = rslt.getString(11, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
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
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

