package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfaccarv extends GXReport
{
   public pfaccarv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfaccarv.class ), "" );
   }

   public pfaccarv( int remoteHandle ,
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
      pfaccarv.this.aP5 = new String[] {""};
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
      pfaccarv.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfaccarv.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfaccarv.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      pfaccarv.this.AV16ValEuro = aP3[0];
      this.aP3 = aP3;
      pfaccarv.this.AV93TextoCopia = aP4[0];
      this.aP4 = aP4;
      pfaccarv.this.Gx_out = aP5[0];
      this.aP5 = aP5;
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
         getPrinter().GxSetDocName("FACTURA") ;
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
         GXv_char1[0] = AV102ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACCAR", ""), GXv_char1) ;
         pfaccarv.this.AV102ContDsc = GXv_char1[0] ;
         GXt_char2 = AV122FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDIG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pfaccarv.this.A396EmprCod = GXv_char1[0] ;
         pfaccarv.this.GXt_char2 = GXv_char4[0] ;
         AV122FirmaD = GXt_char2 ;
         AV80NumLin = (byte)(0) ;
         AV96FlagNoFin = (byte)(1) ;
         AV49SumSig = DecimalUtil.doubleToDec(0) ;
         AV112Aux4 = DecimalUtil.doubleToDec(0) ;
         GxHdr2 = true ;
         /* Using cursor P01QX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A11629MeivaId = P01QX2_A11629MeivaId[0] ;
            n11629MeivaId = P01QX2_n11629MeivaId[0] ;
            A437FacFpg = P01QX2_A437FacFpg[0] ;
            A450FacPri = P01QX2_A450FacPri[0] ;
            A11273FacObs2 = P01QX2_A11273FacObs2[0] ;
            A9605FacFirma = P01QX2_A9605FacFirma[0] ;
            A2739FacSerNum = P01QX2_A2739FacSerNum[0] ;
            A435FacEst = P01QX2_A435FacEst[0] ;
            A9643FacLiq1 = P01QX2_A9643FacLiq1[0] ;
            A9644FacLiq2 = P01QX2_A9644FacLiq2[0] ;
            A9645FacIva1 = P01QX2_A9645FacIva1[0] ;
            A9646FacTot1 = P01QX2_A9646FacTot1[0] ;
            A252CliCod = P01QX2_A252CliCod[0] ;
            n252CliCod = P01QX2_n252CliCod[0] ;
            A436FacFch = P01QX2_A436FacFch[0] ;
            A11513FacRecIca = P01QX2_A11513FacRecIca[0] ;
            A8346FacRecI = P01QX2_A8346FacRecI[0] ;
            n8346FacRecI = P01QX2_n8346FacRecI[0] ;
            A7212FacRect = P01QX2_A7212FacRect[0] ;
            A453FacRECPor = P01QX2_A453FacRECPor[0] ;
            A14224FacCostFac = P01QX2_A14224FacCostFac[0] ;
            A14223FacCostKgs = P01QX2_A14223FacCostKgs[0] ;
            A14222FacCostMts = P01QX2_A14222FacCostMts[0] ;
            A433FacDtoGen = P01QX2_A433FacDtoGen[0] ;
            A443FacIVAPor = P01QX2_A443FacIVAPor[0] ;
            A434FacDtoPP = P01QX2_A434FacDtoPP[0] ;
            A14219FacEnergia = P01QX2_A14219FacEnergia[0] ;
            /* Using cursor P01QX3 */
            pr_default.execute(1, new Object[] {A396EmprCod});
            A7209Colombia = P01QX3_A7209Colombia[0] ;
            n7209Colombia = P01QX3_n7209Colombia[0] ;
            /* Using cursor P01QX5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(2) != 101) )
            {
               A3918FacImpTot1 = P01QX5_A3918FacImpTot1[0] ;
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
            /* Using cursor P01QX6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
            A781PrvCod = P01QX6_A781PrvCod[0] ;
            A278CliNif = P01QX6_A278CliNif[0] ;
            A858ZonGeoCod = P01QX6_A858ZonGeoCod[0] ;
            A4828CliCp2 = P01QX6_A4828CliCp2[0] ;
            A3644CliNom1 = P01QX6_A3644CliNom1[0] ;
            A5649CliDom2 = P01QX6_A5649CliDom2[0] ;
            A295CliPob = P01QX6_A295CliPob[0] ;
            A256CliCp = P01QX6_A256CliCp[0] ;
            A260CliDom = P01QX6_A260CliDom[0] ;
            A279CliNom = P01QX6_A279CliNom[0] ;
            /* Using cursor P01QX7 */
            pr_default.execute(4, new Object[] {Short.valueOf(A781PrvCod)});
            A787PrvDsc = P01QX7_A787PrvDsc[0] ;
            n787PrvDsc = P01QX7_n787PrvDsc[0] ;
            /* Using cursor P01QX8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
            A11630MeivaDsc = P01QX8_A11630MeivaDsc[0] ;
            n11630MeivaDsc = P01QX8_n11630MeivaDsc[0] ;
            AV79CliNif = A278CliNif ;
            AV23FpgCod = A437FacFpg ;
            AV114Facdtopp = A434FacDtoPP ;
            AV115fACiVApOR = A443FacIVAPor ;
            AV133MeivaDsc = A11630MeivaDsc ;
            AV56CliCod = A252CliCod ;
            AV60CliPagLin = (byte)(GXutil.lval( A450FacPri)) ;
            /* Execute user subroutine: 'CLIPAG' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               pr_default.close(4);
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
            /* Execute user subroutine: 'FORPAG' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               pr_default.close(4);
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
            AV61DesPago = AV24FpgDsc ;
            AV97IvaPor = A443FacIVAPor ;
            AV106Texto_siva = "" ;
            if ( A858ZonGeoCod == 999 )
            {
               AV97IvaPor = (byte)(0) ;
               AV106Texto_siva = httpContext.getMessage( "ISENTO DE IVA - a) Nº6 - ARTIGO 6º.CIVA", "") ;
            }
            AV130Obs1 = GXutil.substring( A11273FacObs2, 1, 100) ;
            AV58FlagPag = (byte)(0) ;
            AV127Cpostal = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            AV128CliNom3 = GXutil.trim( A279CliNom) + GXutil.trim( A3644CliNom1) ;
            AV129Clidom50 = GXutil.trim( A260CliDom) + GXutil.trim( A5649CliDom2) ;
            AV79CliNif = A278CliNif ;
            AV51CliPri = A450FacPri ;
            AV85FacFch = A436FacFch ;
            AV103Texto_i = "" ;
            if ( GXutil.strcmp(A450FacPri, "0") == 0 )
            {
               AV103Texto_i = httpContext.getMessage( "Venda a Dinheiro", "") ;
            }
            else
            {
               AV103Texto_i = httpContext.getMessage( "Factura Nº", "") ;
            }
            AV92Paso = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV37Vencim[GX_I-1] = GXutil.nullDate() ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P01QX9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A956FacVtoLin = P01QX9_A956FacVtoLin[0] ;
               A957FacVtoFch = P01QX9_A957FacVtoFch[0] ;
               n957FacVtoFch = P01QX9_n957FacVtoFch[0] ;
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
            AV78TotFac = GXutil.roundDecimal( (A455FacTot.multiply(AV16ValEuro)), 0) ;
            AV119Texto_fd = " " ;
            if ( GXutil.strcmp(A9605FacFirma, " ") != 0 )
            {
               AV120Firma4dig = GXutil.substring( A9605FacFirma, 1, 1) + GXutil.substring( A9605FacFirma, 11, 1) + GXutil.substring( A9605FacFirma, 21, 1) + GXutil.substring( A9605FacFirma, 31, 1) ;
               AV119Texto_fd = AV120Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV122FirmaD) + httpContext.getMessage( "/DGCI", "") ;
            }
            else
            {
               AV119Texto_fd = httpContext.getMessage( "Processado por computador", "") ;
            }
            AV124FraMan = GXutil.substring( A2739FacSerNum, 1, 1) ;
            /* Using cursor P01QX10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A3397FacFasCod = P01QX10_A3397FacFasCod[0] ;
               A432FacDsc = P01QX10_A432FacDsc[0] ;
               A427FacAlbCod = P01QX10_A427FacAlbCod[0] ;
               A1296FacBarPar = P01QX10_A1296FacBarPar[0] ;
               A1295FacBarReo = P01QX10_A1295FacBarReo[0] ;
               A1294FacBarCod = P01QX10_A1294FacBarCod[0] ;
               A428FacAlbTip = P01QX10_A428FacAlbTip[0] ;
               A448FacPreKgs = P01QX10_A448FacPreKgs[0] ;
               A444FacKgs = P01QX10_A444FacKgs[0] ;
               A454FacSer = P01QX10_A454FacSer[0] ;
               A9649FacPKDto = P01QX10_A9649FacPKDto[0] ;
               A9650FacPMdto = P01QX10_A9650FacPMdto[0] ;
               A9648FacDtoL = P01QX10_A9648FacDtoL[0] ;
               A9647FacImpdto = P01QX10_A9647FacImpdto[0] ;
               A9651FacImpd = P01QX10_A9651FacImpd[0] ;
               A9708FacDscII = P01QX10_A9708FacDscII[0] ;
               A449FacPreMts = P01QX10_A449FacPreMts[0] ;
               A447FacMts = P01QX10_A447FacMts[0] ;
               A446FacLin = P01QX10_A446FacLin[0] ;
               A1498FacDisNum = P01QX10_A1498FacDisNum[0] ;
               AV32FacAlbCod = (int)(A427FacAlbCod) ;
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
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV117EncCli = GXutil.substring( A1498FacDisNum, 1, 8) ;
               /* Using cursor P01QX11 */
               pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A129BarCod = P01QX11_A129BarCod[0] ;
                  A132BarCodReo = P01QX11_A132BarCodReo[0] ;
                  A130BarCodPar = P01QX11_A130BarCodPar[0] ;
                  A30AlbProCod = P01QX11_A30AlbProCod[0] ;
                  A1265BarAlbPie = P01QX11_A1265BarAlbPie[0] ;
                  A34AlbProfch = P01QX11_A34AlbProfch[0] ;
                  A34AlbProfch = P01QX11_A34AlbProfch[0] ;
                  AV89Piezas = (short)(A1265BarAlbPie) ;
                  AV105AlbProFch = A34AlbProfch ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(8);
               if ( A428FacAlbTip == 1 )
               {
                  if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
                  {
                     AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                     AV91Precio = A448FacPreKgs ;
                     AV95FacKgs = A444FacKgs ;
                     if ( AV80NumLin >= 40 )
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
                     AV151Op = " " ;
                     if ( A444FacKgs.doubleValue() > 0 )
                     {
                        h1QX0( false, 15) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A454FacSer, "")), 264, Gx_line+0, 382, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 415, Gx_line+0, 511, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95FacKgs, "ZZZZZZ.ZZ")), 516, Gx_line+0, 583, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "K", ""), 589, Gx_line+0, 597, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ.ZZ")), 611, Gx_line+0, 670, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 682, Gx_line+0, 771, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32FacAlbCod), "ZZZZZ9")), 42, Gx_line+0, 87, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1498FacDisNum, "")), 163, Gx_line+0, 222, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV89Piezas), "ZZZ9")), 229, Gx_line+0, 259, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( AV105AlbProFch, "99/99/99"), 100, Gx_line+0, 159, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV142Norm, "")), 383, Gx_line+0, 413, Gx_line+16, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+15) ;
                        if ( GXutil.strcmp(AV107barNomcli, " ") != 0 )
                        {
                           h1QX0( false, 18) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107barNomcli, "")), 415, Gx_line+2, 511, Gx_line+18, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                           AV80NumLin = (byte)(AV80NumLin+1) ;
                        }
                        AV109Aux1 = AV67TotLin.subtract((AV67TotLin.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV110Aux2 = AV109Aux1 ;
                        AV111Aux3 = AV110Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                        A9649FacPKDto = AV111Aux3 ;
                        A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                        A9648FacDtoL = AV114Facdtopp ;
                        A9647FacImpdto = AV111Aux3.multiply(A444FacKgs) ;
                        AV108Aux0 = AV67TotLin.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV108Aux0 ;
                        AV112Aux4 = AV112Aux4.add((AV111Aux3.multiply(A444FacKgs))) ;
                        A9708FacDscII = A432FacDsc ;
                        AV151Op = httpContext.getMessage( "A", "") ;
                     }
                     AV80NumLin = (byte)(AV80NumLin+1) ;
                     AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                        AV91Precio = A449FacPreMts ;
                        if ( AV80NumLin >= 40 )
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
                        h1QX0( false, 15) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 516, Gx_line+0, 583, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 589, Gx_line+0, 597, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ.ZZ")), 611, Gx_line+0, 670, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 682, Gx_line+0, 771, Gx_line+16, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+15) ;
                        AV80NumLin = (byte)(AV80NumLin+1) ;
                        AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                        AV113Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                        AV109Aux1 = AV113Aux5.subtract((AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV110Aux2 = AV109Aux1 ;
                        AV111Aux3 = AV110Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                        A9650FacPMdto = AV111Aux3 ;
                        A9648FacDtoL = AV114Facdtopp ;
                        A9647FacImpdto = A9647FacImpdto.add(((AV111Aux3.multiply(A447FacMts)))) ;
                        AV108Aux0 = AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV108Aux0 ;
                        AV112Aux4 = AV112Aux4.add((AV111Aux3.multiply(A447FacMts))) ;
                        AV151Op = httpContext.getMessage( "B", "") ;
                     }
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                        AV91Precio = A449FacPreMts ;
                        if ( AV80NumLin >= 40 )
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
                        h1QX0( false, 15) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 516, Gx_line+0, 583, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 589, Gx_line+0, 597, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ.ZZ")), 611, Gx_line+0, 670, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 682, Gx_line+0, 771, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32FacAlbCod), "ZZZZZ9")), 42, Gx_line+0, 87, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1498FacDisNum, "")), 163, Gx_line+0, 222, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV89Piezas), "ZZZ9")), 230, Gx_line+0, 260, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A454FacSer, "")), 264, Gx_line+0, 382, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 415, Gx_line+0, 511, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( AV105AlbProFch, "99/99/99"), 100, Gx_line+0, 159, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV142Norm, "")), 383, Gx_line+0, 413, Gx_line+16, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+15) ;
                        if ( GXutil.strcmp(AV107barNomcli, " ") != 0 )
                        {
                           h1QX0( false, 18) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107barNomcli, "")), 415, Gx_line+2, 511, Gx_line+18, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                           AV80NumLin = (byte)(AV80NumLin+1) ;
                        }
                        AV80NumLin = (byte)(AV80NumLin+1) ;
                        AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                        AV113Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                        AV109Aux1 = AV113Aux5.subtract((AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV110Aux2 = AV109Aux1 ;
                        AV111Aux3 = AV110Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                        A9650FacPMdto = AV111Aux3 ;
                        A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                        A9648FacDtoL = AV114Facdtopp ;
                        A9647FacImpdto = AV111Aux3.multiply(A447FacMts) ;
                        AV108Aux0 = AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV108Aux0 ;
                        AV112Aux4 = AV112Aux4.add((AV111Aux3.multiply(A447FacMts))) ;
                        A9708FacDscII = AV117EncCli + "-" + AV116dSC + "-" + AV83BarColNom + "-" + GXutil.str( AV89Piezas, 6, 0) ;
                        AV151Op = httpContext.getMessage( "C", "") ;
                     }
                     if ( GXutil.strcmp(AV151Op, " ") == 0 )
                     {
                        if ( AV80NumLin >= 40 )
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
                        h1QX0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32FacAlbCod), "ZZZZZ9")), 42, Gx_line+0, 87, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( AV105AlbProFch, "99/99/99"), 100, Gx_line+0, 159, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1498FacDisNum, "")), 163, Gx_line+0, 222, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV89Piezas), "ZZZ9")), 230, Gx_line+0, 260, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A454FacSer, "")), 264, Gx_line+0, 382, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 415, Gx_line+0, 511, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV142Norm, "")), 383, Gx_line+0, 413, Gx_line+16, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                        AV80NumLin = +1 ;
                     }
                  }
               }
               if ( ! (GXutil.strcmp("", A3397FacFasCod)==0) )
               {
                  /* Using cursor P01QX12 */
                  pr_default.execute(9, new Object[] {A396EmprCod, A3397FacFasCod});
                  while ( (pr_default.getStatus(9) != 101) )
                  {
                     A457FasCod = P01QX12_A457FasCod[0] ;
                     AV90FacDsc = A432FacDsc ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(9);
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                  {
                     AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                     AV91Precio = A448FacPreKgs ;
                     if ( AV80NumLin >= 40 )
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
                     h1QX0( false, 15) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90FacDsc, "")), 264, Gx_line+0, 462, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 516, Gx_line+0, 583, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "K", ""), 589, Gx_line+0, 597, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ.ZZ")), 611, Gx_line+0, 670, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 682, Gx_line+0, 771, Gx_line+16, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+15) ;
                     AV80NumLin = (byte)(AV80NumLin+1) ;
                     AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                     AV113Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                     AV109Aux1 = AV113Aux5.subtract((AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                     AV110Aux2 = AV109Aux1 ;
                     AV111Aux3 = AV110Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                     A9649FacPKDto = AV111Aux3 ;
                     A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                     A9648FacDtoL = AV114Facdtopp ;
                     A9647FacImpdto = AV111Aux3.multiply(A444FacKgs) ;
                     AV108Aux0 = AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     A9651FacImpd = AV108Aux0 ;
                     AV112Aux4 = AV112Aux4.add((AV111Aux3.multiply(A444FacKgs))) ;
                     A9708FacDscII = AV117EncCli + "-" + AV90FacDsc ;
                  }
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                  {
                     AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                     AV91Precio = A449FacPreMts ;
                     if ( AV80NumLin >= 40 )
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
                     h1QX0( false, 16) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 516, Gx_line+0, 583, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 589, Gx_line+0, 597, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ.ZZ")), 611, Gx_line+0, 670, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 682, Gx_line+0, 771, Gx_line+16, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+16) ;
                     AV80NumLin = (byte)(AV80NumLin+1) ;
                     AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                     AV113Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                     AV109Aux1 = AV113Aux5.subtract((AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                     AV110Aux2 = AV109Aux1 ;
                     AV111Aux3 = AV110Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                     A9650FacPMdto = AV111Aux3 ;
                     A9648FacDtoL = AV114Facdtopp ;
                     A9647FacImpdto = A9647FacImpdto.add((AV111Aux3.multiply(A447FacMts))) ;
                     AV108Aux0 = AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     A9651FacImpd = AV108Aux0 ;
                     AV112Aux4 = AV112Aux4.add((AV111Aux3.multiply(A447FacMts))) ;
                  }
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                  {
                     AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                     AV91Precio = A449FacPreMts ;
                     if ( AV80NumLin >= 40 )
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
                     h1QX0( false, 16) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 516, Gx_line+0, 583, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 589, Gx_line+0, 597, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ.ZZ")), 611, Gx_line+0, 670, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 682, Gx_line+0, 771, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90FacDsc, "")), 264, Gx_line+0, 462, Gx_line+16, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+16) ;
                     AV80NumLin = (byte)(AV80NumLin+1) ;
                     AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                     AV113Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                     AV109Aux1 = AV113Aux5.subtract((AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                     AV110Aux2 = AV109Aux1 ;
                     AV111Aux3 = AV110Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                     A9650FacPMdto = AV111Aux3 ;
                     A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                     A9648FacDtoL = AV114Facdtopp ;
                     A9647FacImpdto = AV111Aux3.multiply(A447FacMts) ;
                     AV108Aux0 = AV113Aux5.multiply(AV114Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     A9651FacImpd = AV108Aux0 ;
                     AV112Aux4 = AV112Aux4.add((AV111Aux3.multiply(A447FacMts))) ;
                     A9708FacDscII = AV117EncCli + "-" + AV90FacDsc ;
                  }
               }
               if ( A428FacAlbTip == 2 )
               {
                  if ( AV80NumLin >= 40 )
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
                  AV67TotLin = DecimalUtil.doubleToDec(0) ;
                  AV91Precio = DecimalUtil.doubleToDec(0) ;
                  AV123FacMts = DecimalUtil.doubleToDec(0) ;
                  AV125Cant = DecimalUtil.doubleToDec(0) ;
                  if ( A449FacPreMts.doubleValue() > 0 )
                  {
                     AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                     AV91Precio = A449FacPreMts ;
                     AV123FacMts = A447FacMts ;
                     AV125Cant = A447FacMts ;
                     AV126Un = httpContext.getMessage( "M", "") ;
                  }
                  if ( A448FacPreKgs.doubleValue() > 0 )
                  {
                     AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                     AV91Precio = A448FacPreKgs ;
                     AV123FacMts = A444FacKgs ;
                     AV125Cant = A444FacKgs ;
                     AV126Un = httpContext.getMessage( "K", "") ;
                  }
                  AV90FacDsc = A432FacDsc ;
                  h1QX0( false, 16) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 77, Gx_line+0, 370, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 632, Gx_line+0, 721, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV125Cant, "ZZZZZZ.ZZ")), 445, Gx_line+1, 512, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZZZZ.ZZ")), 553, Gx_line+0, 612, Gx_line+16, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
                  AV80NumLin = (byte)(AV80NumLin+1) ;
                  AV49SumSig = AV49SumSig.add(AV67TotLin) ;
               }
               /* Using cursor P01QX13 */
               pr_default.execute(10, new Object[] {A9649FacPKDto, A9650FacPMdto, A9648FacDtoL, A9647FacImpdto, A9651FacImpd, A9708FacDscII, A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
               pr_default.readNext(7);
            }
            pr_default.close(7);
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            AV96FlagNoFin = (byte)(0) ;
            A9643FacLiq1 = AV68FacImpTot ;
            A9644FacLiq2 = GXutil.roundDecimal( AV112Aux4, 2) ;
            A9645FacIva1 = GXutil.roundDecimal( A9644FacLiq2.multiply(DecimalUtil.doubleToDec(AV115fACiVApOR)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            A9646FacTot1 = A9644FacLiq2.add(A9645FacIva1) ;
            /* Using cursor P01QX14 */
            pr_default.execute(11, new Object[] {Byte.valueOf(A435FacEst), A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A396EmprCod, Integer.valueOf(A430FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.close(1);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(4);
         pr_default.close(2);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1QX0( true, 0) ;
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
      AV107barNomcli = " " ;
      /* Using cursor P01QX15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV63BarCod), Byte.valueOf(AV64BarCodReo), AV65BarCodPar});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A361DisCod = P01QX15_A361DisCod[0] ;
         A130BarCodPar = P01QX15_A130BarCodPar[0] ;
         A132BarCodReo = P01QX15_A132BarCodReo[0] ;
         A129BarCod = P01QX15_A129BarCod[0] ;
         A1652BarSerDsc = P01QX15_A1652BarSerDsc[0] ;
         A135BarColNom = P01QX15_A135BarColNom[0] ;
         A136BarColNum = P01QX15_A136BarColNum[0] ;
         A252CliCod = P01QX15_A252CliCod[0] ;
         n252CliCod = P01QX15_n252CliCod[0] ;
         A1234BarNomCli = P01QX15_A1234BarNomCli[0] ;
         A221BarTra1 = P01QX15_A221BarTra1[0] ;
         A222BarTra2 = P01QX15_A222BarTra2[0] ;
         A223BarTra3 = P01QX15_A223BarTra3[0] ;
         AV82BarSerDsc = A1652BarSerDsc ;
         AV83BarColNom = A135BarColNom ;
         AV84BarColNum = A136BarColNum ;
         if ( ( A252CliCod == 211331 ) || ( A252CliCod == 211335 ) )
         {
            AV107barNomcli = A1234BarNomCli ;
         }
         AV118Compos = "" ;
         if ( ! (GXutil.strcmp("", A221BarTra1)==0) )
         {
            AV118Compos = GXutil.trim( GXutil.substring( A221BarTra1, 1, 3)) ;
         }
         if ( ! (GXutil.strcmp("", A222BarTra2)==0) )
         {
            AV118Compos += " " + GXutil.trim( GXutil.substring( A222BarTra2, 1, 3)) ;
         }
         if ( ! (GXutil.strcmp("", A223BarTra3)==0) )
         {
            AV118Compos += " " + GXutil.trim( GXutil.substring( A223BarTra3, 1, 3)) ;
         }
         AV116dSC = GXutil.trim( GXutil.substring( A1652BarSerDsc, 1, 10)) ;
         AV116dSC += " " + AV118Compos ;
         AV116dSC += " " ;
         AV142Norm = "" ;
         /* Using cursor P01QX16 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A13213DisNormID = P01QX16_A13213DisNormID[0] ;
            if ( GXutil.strcmp(AV142Norm, "") == 0 )
            {
               AV142Norm = GXutil.trim( A13213DisNormID) ;
            }
            else
            {
               AV142Norm += "/" + GXutil.trim( A13213DisNormID) ;
            }
            pr_default.readNext(13);
         }
         pr_default.close(13);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'FORPAG' Routine */
      returnInSub = false ;
      AV24FpgDsc = "" ;
      /* Using cursor P01QX17 */
      pr_default.execute(14, new Object[] {A396EmprCod, AV23FpgCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A497FpgCod = P01QX17_A497FpgCod[0] ;
         A498FpgDsc = P01QX17_A498FpgDsc[0] ;
         n498FpgDsc = P01QX17_n498FpgDsc[0] ;
         AV24FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'CLIPAG' Routine */
      returnInSub = false ;
      AV134Clipagnom = " " ;
      AV137CliPagDom = " " ;
      AV138CliPagPob = " " ;
      AV139CliPagCp = " " ;
      AV135CliPagiban = " " ;
      AV136Cliswift = " " ;
      AV140CliNib = " " ;
      AV141CliPagCue = " " ;
      /* Using cursor P01QX18 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV56CliCod), Byte.valueOf(AV60CliPagLin)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A287CliPagLin = P01QX18_A287CliPagLin[0] ;
         A252CliCod = P01QX18_A252CliCod[0] ;
         n252CliCod = P01QX18_n252CliCod[0] ;
         A288CliPagNom = P01QX18_A288CliPagNom[0] ;
         A286CliPagDom = P01QX18_A286CliPagDom[0] ;
         A289CliPagPob = P01QX18_A289CliPagPob[0] ;
         A2326CliPagCp = P01QX18_A2326CliPagCp[0] ;
         A10060CliPagIban = P01QX18_A10060CliPagIban[0] ;
         A10416CliSwift = P01QX18_A10416CliSwift[0] ;
         A10415CliNIB = P01QX18_A10415CliNIB[0] ;
         A284CliPagCue = P01QX18_A284CliPagCue[0] ;
         AV134Clipagnom = A288CliPagNom ;
         AV137CliPagDom = A286CliPagDom ;
         AV138CliPagPob = A289CliPagPob ;
         AV139CliPagCp = A2326CliPagCp ;
         AV135CliPagiban = A10060CliPagIban ;
         AV136Cliswift = A10416CliSwift ;
         AV140CliNib = A10415CliNIB ;
         AV141CliPagCue = A284CliPagCue ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void h1QX0( boolean bFoot ,
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
               AV121Texto_pc = httpContext.getMessage( "Processado por computador", "") ;
               if ( GXutil.strcmp(AV119Texto_fd, " ") != 0 )
               {
                  AV121Texto_pc = " " ;
               }
               if ( AV96FlagNoFin == 1 )
               {
                  AV104Suma_s = (byte)(1) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "A TRANSPORTAR:", ""), 542, Gx_line+7, 647, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49SumSig, "ZZ,ZZZ,ZZ9.99")), 651, Gx_line+7, 747, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102ContDsc, "")), 38, Gx_line+30, 122, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Texto_fd, "")), 495, Gx_line+30, 782, Gx_line+44, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+47) ;
               }
               else
               {
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106Texto_siva, "")), 38, Gx_line+0, 299, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
                  if ( GXutil.strcmp(AV133MeivaDsc, " ") != 0 )
                  {
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133MeivaDsc, "")), 38, Gx_line+0, 560, Gx_line+16, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+15) ;
                  }
                  if ( GXutil.strcmp(AV130Obs1, " ") != 0 )
                  {
                     AV132Obs = AV130Obs1 ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV132Obs, "")), 38, Gx_line+2, 560, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  getPrinter().GxDrawRect(38, Gx_line+11, 782, Gx_line+57, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TOTAL ILíQUIDO", ""), 56, Gx_line+15, 138, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68FacImpTot, "ZZ,ZZZ,ZZ9.99")), 47, Gx_line+35, 143, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A434FacDtoPP, "Z9.99")), 176, Gx_line+35, 213, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "% DESC.", ""), 169, Gx_line+15, 215, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69FacImpPP, "ZZZZZZZZZ9.99")), 251, Gx_line+35, 347, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TOTAL DESCONTOS", ""), 247, Gx_line+15, 351, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VALOR LIQUIDO", ""), 383, Gx_line+15, 466, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("%", 500, Gx_line+15, 511, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV97IvaPor), "ZZ")), 498, Gx_line+35, 514, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81FacBasImp, "ZZ,ZZZ,ZZ9.99")), 377, Gx_line+35, 473, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VALOR DO I.V.A.", ""), 543, Gx_line+15, 630, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 540, Gx_line+35, 636, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TOTAL FACTURA", ""), 665, Gx_line+15, 754, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71FacTot, "ZZ,ZZZ,ZZ9.99")), 666, Gx_line+35, 762, Gx_line+53, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(38, Gx_line+29, 782, Gx_line+29, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(157, Gx_line+13, 157, Gx_line+57, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(228, Gx_line+13, 228, Gx_line+57, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(368, Gx_line+13, 368, Gx_line+57, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(481, Gx_line+13, 481, Gx_line+57, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(646, Gx_line+13, 646, Gx_line+57, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(532, Gx_line+13, 532, Gx_line+57, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102ContDsc, "")), 36, Gx_line+144, 120, Gx_line+157, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RECLAMAÇÕES:", ""), 42, Gx_line+63, 117, Gx_line+76, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Só se aceitam no prazo de 15 dias. Chamamos a atenção para verificarem a qualidade", ""), 42, Gx_line+77, 447, Gx_line+90, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(38, Gx_line+59, 782, Gx_line+102, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61DesPago, "")), 44, Gx_line+122, 201, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Condições de Pagamento", ""), 44, Gx_line+105, 192, Gx_line+120, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(36, Gx_line+140, 780, Gx_line+140, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Texto_fd, "")), 494, Gx_line+144, 781, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "do tingimento, visto que não aceitamos reclamações depois da malha utilizada.", ""), 42, Gx_line+89, 419, Gx_line+102, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entidade Bancaria", ""), 254, Gx_line+106, 355, Gx_line+121, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "IBAN Code:", ""), 254, Gx_line+123, 318, Gx_line+138, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "SWIFT code:", ""), 544, Gx_line+123, 614, Gx_line+138, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134Clipagnom, "")), 361, Gx_line+106, 518, Gx_line+122, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV135CliPagiban, "")), 319, Gx_line+123, 528, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV136Cliswift, "")), 617, Gx_line+123, 722, Gx_line+139, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+156) ;
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
               if ( GXutil.strcmp(A5649CliDom2, " ") == 0 )
               {
                  getPrinter().GxDrawRect(36, Gx_line+216, 179, Gx_line+264, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(36, Gx_line+235, 179, Gx_line+235, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 60, Gx_line+239, 128, Gx_line+259, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(194, Gx_line+216, 309, Gx_line+264, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(194, Gx_line+235, 309, Gx_line+235, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 225, Gx_line+218, 256, Gx_line+234, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 213, Gx_line+240, 272, Gx_line+259, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(323, Gx_line+216, 438, Gx_line+264, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(323, Gx_line+235, 438, Gx_line+235, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº CLIENTE", ""), 347, Gx_line+217, 413, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 354, Gx_line+238, 405, Gx_line+257, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(167, Gx_line+266, 438, Gx_line+318, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(167, Gx_line+284, 438, Gx_line+284, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("500057095", 190, Gx_line+292, 257, Gx_line+308, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(301, Gx_line+266, 301, Gx_line+317, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N/ CONTRIBUINTE", ""), 178, Gx_line+269, 265, Gx_line+283, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/ CONTRIBUINTE", ""), 318, Gx_line+269, 404, Gx_line+283, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(449, Gx_line+188, 781, Gx_line+319, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ILMO(S). SR(S).", ""), 456, Gx_line+192, 528, Gx_line+206, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 552, Gx_line+256, 741, Gx_line+274, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TextoCopia, "")), 703, Gx_line+167, 782, Gx_line+184, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Folha", ""), 452, Gx_line+167, 483, Gx_line+182, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103Texto_i, "")), 44, Gx_line+218, 169, Gx_line+234, 1, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 486, Gx_line+167, 525, Gx_line+183, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79CliNif, "@!")), 317, Gx_line+292, 422, Gx_line+309, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Carvema Têxtil, Lda.", ""), 36, Gx_line+17, 365, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rua António Carvalho, 2", ""), 36, Gx_line+60, 152, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Perelhal - BARCELOS", ""), 36, Gx_line+74, 138, Gx_line+87, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "4750 - 625 Perelhal - PORTUGAL", ""), 36, Gx_line+86, 186, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TEL.: 351 253 860 030", ""), 36, Gx_line+99, 136, Gx_line+112, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FAX.: 351 253 860 039", ""), 36, Gx_line+110, 136, Gx_line+123, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "email: carvema@carvema.pt", ""), 36, Gx_line+123, 167, Gx_line+136, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "www.carvema.pt", ""), 36, Gx_line+136, 113, Gx_line+149, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE Nº PT 500 057 095 - SOCIEDADE POR QUOTAS", ""), 36, Gx_line+156, 326, Gx_line+169, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "MATRICULADA NA CONS. R. C. DE BARCELOS SOB. O Nº 319", ""), 36, Gx_line+167, 322, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CAPITAL SOCIAL € 2.000.000,00 REALIZADO", ""), 36, Gx_line+178, 238, Gx_line+191, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Cpostal, "")), 456, Gx_line+256, 537, Gx_line+273, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128CliNom3, "")), 456, Gx_line+217, 770, Gx_line+235, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Clidom50, "")), 456, Gx_line+236, 770, Gx_line+254, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+332) ;
                  if ( GXutil.strcmp(AV124FraMan, httpContext.getMessage( "M", "")) != 0 )
                  {
                     getPrinter().GxDrawRect(38, Gx_line+6, 782, Gx_line+54, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº GUIA", ""), 48, Gx_line+9, 91, Gx_line+24, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "DE", ""), 61, Gx_line+24, 76, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "REMESSA", ""), 43, Gx_line+36, 95, Gx_line+51, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº  TALAO", ""), 164, Gx_line+9, 220, Gx_line+24, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "DO", ""), 183, Gx_line+24, 200, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 171, Gx_line+36, 214, Gx_line+51, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PEÇAS", ""), 226, Gx_line+24, 262, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "TIPO DE MALHA", ""), 285, Gx_line+24, 367, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "CÔR", ""), 417, Gx_line+24, 441, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PESO", ""), 520, Gx_line+24, 549, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PREÇO", ""), 596, Gx_line+24, 632, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "VALOR", ""), 682, Gx_line+24, 721, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(98, Gx_line+6, 98, Gx_line+54, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(222, Gx_line+6, 222, Gx_line+54, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(264, Gx_line+6, 264, Gx_line+54, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(389, Gx_line+6, 389, Gx_line+54, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(490, Gx_line+6, 490, Gx_line+54, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(577, Gx_line+6, 577, Gx_line+54, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(652, Gx_line+6, 652, Gx_line+54, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 114, Gx_line+9, 143, Gx_line+24, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "REMESSA", ""), 103, Gx_line+36, 155, Gx_line+51, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(155, Gx_line+6, 155, Gx_line+54, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "GUIA", ""), 116, Gx_line+24, 143, Gx_line+39, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+60) ;
                  }
                  else
                  {
                     getPrinter().GxDrawRect(38, Gx_line+0, 782, Gx_line+48, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 214, Gx_line+4, 275, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 690, Gx_line+13, 721, Gx_line+30, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(534, Gx_line+1, 534, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(38, Gx_line+24, 451, Gx_line+24, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(448, Gx_line+1, 448, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Quant", ""), 474, Gx_line+13, 511, Gx_line+30, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "V. Unit", ""), 564, Gx_line+13, 606, Gx_line+30, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(632, Gx_line+1, 632, Gx_line+48, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+57) ;
                  }
               }
               else
               {
                  getPrinter().GxDrawRect(36, Gx_line+220, 179, Gx_line+268, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(36, Gx_line+240, 179, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 67, Gx_line+243, 135, Gx_line+263, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(194, Gx_line+220, 309, Gx_line+268, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(194, Gx_line+240, 309, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 231, Gx_line+222, 262, Gx_line+238, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 219, Gx_line+244, 278, Gx_line+263, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(323, Gx_line+220, 438, Gx_line+268, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(323, Gx_line+240, 438, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº CLIENTE", ""), 353, Gx_line+221, 419, Gx_line+237, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 360, Gx_line+242, 411, Gx_line+261, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(167, Gx_line+270, 438, Gx_line+322, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(167, Gx_line+289, 438, Gx_line+289, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("500057095", 196, Gx_line+296, 263, Gx_line+312, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(307, Gx_line+270, 307, Gx_line+321, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N/ CONTRIBUINTE", ""), 184, Gx_line+273, 271, Gx_line+287, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/ CONTRIBUINTE", ""), 324, Gx_line+273, 410, Gx_line+287, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 456, Gx_line+214, 645, Gx_line+232, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 456, Gx_line+233, 670, Gx_line+251, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 456, Gx_line+279, 645, Gx_line+297, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(449, Gx_line+192, 781, Gx_line+323, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ILMO(S). SR(S).", ""), 456, Gx_line+196, 528, Gx_line+210, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 456, Gx_line+300, 538, Gx_line+318, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 543, Gx_line+300, 732, Gx_line+318, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TextoCopia, "")), 703, Gx_line+171, 782, Gx_line+188, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Folha", ""), 452, Gx_line+171, 483, Gx_line+186, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103Texto_i, "")), 50, Gx_line+222, 175, Gx_line+238, 1, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 486, Gx_line+171, 525, Gx_line+187, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79CliNif, "@!")), 323, Gx_line+296, 428, Gx_line+313, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5649CliDom2, "")), 456, Gx_line+252, 670, Gx_line+270, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Carvema Têxtil, Lda.", ""), 36, Gx_line+17, 365, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rua António Carvalho, 2", ""), 36, Gx_line+60, 152, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Perelhal - BARCELOS", ""), 36, Gx_line+74, 138, Gx_line+87, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "4750 - 625 Perelhal - PORTUGAL", ""), 36, Gx_line+86, 186, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TEL.: 351 253 860 030", ""), 36, Gx_line+99, 136, Gx_line+112, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FAX.: 351 253 860 039", ""), 36, Gx_line+110, 136, Gx_line+123, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "email: carvema@carvema.pt", ""), 36, Gx_line+123, 167, Gx_line+136, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "www.carvema.pt", ""), 36, Gx_line+136, 113, Gx_line+149, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE Nº PT 500 057 095 - SOCIEDADE POR QUOTAS", ""), 36, Gx_line+156, 326, Gx_line+169, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "MATRICULADA NA CONS. R. C. DE BARCELOS SOB. O Nº 319", ""), 36, Gx_line+167, 322, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CAPITAL SOCIAL € 2.000.000,00 REALIZADO", ""), 36, Gx_line+178, 238, Gx_line+191, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+333) ;
                  if ( GXutil.strcmp(AV124FraMan, httpContext.getMessage( "M", "")) != 0 )
                  {
                     getPrinter().GxDrawRect(38, Gx_line+0, 782, Gx_line+48, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº GUIA", ""), 43, Gx_line+3, 86, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "DE", ""), 61, Gx_line+18, 76, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "REMESSA", ""), 43, Gx_line+30, 95, Gx_line+45, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº  TALAO", ""), 164, Gx_line+3, 220, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "DO", ""), 183, Gx_line+18, 200, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 171, Gx_line+30, 214, Gx_line+45, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PEÇAS", ""), 226, Gx_line+18, 262, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "TIPO DE MALHA", ""), 285, Gx_line+18, 367, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "CÔR", ""), 440, Gx_line+18, 464, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PESO", ""), 546, Gx_line+18, 575, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PREÇO", ""), 624, Gx_line+19, 660, Gx_line+34, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "VALOR", ""), 708, Gx_line+19, 747, Gx_line+34, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(98, Gx_line+0, 98, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(222, Gx_line+0, 222, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(264, Gx_line+0, 264, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(389, Gx_line+0, 389, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(513, Gx_line+0, 513, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(606, Gx_line+0, 606, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(676, Gx_line+0, 676, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 114, Gx_line+3, 143, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "REMESSA", ""), 103, Gx_line+30, 155, Gx_line+45, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(155, Gx_line+0, 155, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "GUIA", ""), 116, Gx_line+18, 143, Gx_line+33, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+50) ;
                  }
                  else
                  {
                     getPrinter().GxDrawRect(38, Gx_line+0, 782, Gx_line+48, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 219, Gx_line+4, 280, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 690, Gx_line+13, 721, Gx_line+30, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(534, Gx_line+1, 534, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(38, Gx_line+24, 451, Gx_line+24, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(453, Gx_line+1, 453, Gx_line+48, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Quant", ""), 474, Gx_line+13, 511, Gx_line+30, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "V. Unit", ""), 564, Gx_line+13, 606, Gx_line+30, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(632, Gx_line+1, 632, Gx_line+48, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+50) ;
                  }
               }
               if ( AV104Suma_s == 1 )
               {
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TRANSPORTE:", ""), 559, Gx_line+1, 644, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49SumSig, "ZZ,ZZZ,ZZ9.99")), 651, Gx_line+1, 747, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  AV104Suma_s = (byte)(0) ;
                  AV80NumLin = (byte)(2) ;
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
      this.aP0[0] = pfaccarv.this.A396EmprCod;
      this.aP1[0] = pfaccarv.this.A430FacCod;
      this.aP2[0] = pfaccarv.this.AV15ImpCod;
      this.aP3[0] = pfaccarv.this.AV16ValEuro;
      this.aP4[0] = pfaccarv.this.AV93TextoCopia;
      this.aP5[0] = pfaccarv.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfaccarv");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV49SumSig = DecimalUtil.ZERO ;
      AV102ContDsc = "" ;
      AV122FirmaD = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV112Aux4 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01QX2_A11629MeivaId = new String[] {""} ;
      P01QX2_n11629MeivaId = new boolean[] {false} ;
      P01QX2_A396EmprCod = new String[] {""} ;
      P01QX2_A430FacCod = new int[1] ;
      P01QX2_A437FacFpg = new String[] {""} ;
      P01QX2_A450FacPri = new String[] {""} ;
      P01QX2_A11273FacObs2 = new String[] {""} ;
      P01QX2_A9605FacFirma = new String[] {""} ;
      P01QX2_A2739FacSerNum = new String[] {""} ;
      P01QX2_A435FacEst = new byte[1] ;
      P01QX2_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A252CliCod = new int[1] ;
      P01QX2_n252CliCod = new boolean[] {false} ;
      P01QX2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P01QX2_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_n8346FacRecI = new boolean[] {false} ;
      P01QX2_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A443FacIVAPor = new byte[1] ;
      P01QX2_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX2_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A11629MeivaId = "" ;
      A437FacFpg = "" ;
      A450FacPri = "" ;
      A11273FacObs2 = "" ;
      A9605FacFirma = "" ;
      A2739FacSerNum = "" ;
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
      P01QX3_A7209Colombia = new byte[1] ;
      P01QX3_n7209Colombia = new boolean[] {false} ;
      P01QX5_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      P01QX6_A781PrvCod = new short[1] ;
      P01QX6_A278CliNif = new String[] {""} ;
      P01QX6_A858ZonGeoCod = new short[1] ;
      P01QX6_A4828CliCp2 = new String[] {""} ;
      P01QX6_A3644CliNom1 = new String[] {""} ;
      P01QX6_A5649CliDom2 = new String[] {""} ;
      P01QX6_A295CliPob = new String[] {""} ;
      P01QX6_A256CliCp = new String[] {""} ;
      P01QX6_A260CliDom = new String[] {""} ;
      P01QX6_A279CliNom = new String[] {""} ;
      A278CliNif = "" ;
      A4828CliCp2 = "" ;
      A3644CliNom1 = "" ;
      A5649CliDom2 = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      P01QX7_A787PrvDsc = new String[] {""} ;
      P01QX7_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      P01QX8_A11630MeivaDsc = new String[] {""} ;
      P01QX8_n11630MeivaDsc = new boolean[] {false} ;
      A11630MeivaDsc = "" ;
      AV79CliNif = "" ;
      AV23FpgCod = "" ;
      AV114Facdtopp = DecimalUtil.ZERO ;
      AV133MeivaDsc = "" ;
      AV61DesPago = "" ;
      AV24FpgDsc = "" ;
      AV106Texto_siva = "" ;
      AV130Obs1 = "" ;
      AV127Cpostal = "" ;
      AV128CliNom3 = "" ;
      AV129Clidom50 = "" ;
      AV51CliPri = "" ;
      AV85FacFch = GXutil.nullDate() ;
      AV103Texto_i = "" ;
      AV37Vencim = new java.util.Date[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV37Vencim[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      P01QX9_A396EmprCod = new String[] {""} ;
      P01QX9_A430FacCod = new int[1] ;
      P01QX9_A956FacVtoLin = new byte[1] ;
      P01QX9_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P01QX9_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV68FacImpTot = DecimalUtil.ZERO ;
      AV69FacImpPP = DecimalUtil.ZERO ;
      AV70FacIvaImp = DecimalUtil.ZERO ;
      AV71FacTot = DecimalUtil.ZERO ;
      AV81FacBasImp = DecimalUtil.ZERO ;
      AV78TotFac = DecimalUtil.ZERO ;
      AV119Texto_fd = "" ;
      AV120Firma4dig = "" ;
      AV124FraMan = "" ;
      P01QX10_A396EmprCod = new String[] {""} ;
      P01QX10_A430FacCod = new int[1] ;
      P01QX10_A3397FacFasCod = new String[] {""} ;
      P01QX10_A432FacDsc = new String[] {""} ;
      P01QX10_A427FacAlbCod = new long[1] ;
      P01QX10_A1296FacBarPar = new String[] {""} ;
      P01QX10_A1295FacBarReo = new byte[1] ;
      P01QX10_A1294FacBarCod = new int[1] ;
      P01QX10_A428FacAlbTip = new byte[1] ;
      P01QX10_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A454FacSer = new String[] {""} ;
      P01QX10_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A9648FacDtoL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A9651FacImpd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A9708FacDscII = new String[] {""} ;
      P01QX10_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QX10_A446FacLin = new int[1] ;
      P01QX10_A1498FacDisNum = new String[] {""} ;
      A3397FacFasCod = "" ;
      A432FacDsc = "" ;
      A1296FacBarPar = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A454FacSer = "" ;
      A9649FacPKDto = DecimalUtil.ZERO ;
      A9650FacPMdto = DecimalUtil.ZERO ;
      A9648FacDtoL = DecimalUtil.ZERO ;
      A9647FacImpdto = DecimalUtil.ZERO ;
      A9651FacImpd = DecimalUtil.ZERO ;
      A9708FacDscII = "" ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A1498FacDisNum = "" ;
      AV99Nueves9 = "" ;
      AV101Hdr_8 = "" ;
      AV88Hdr = "" ;
      AV82BarSerDsc = "" ;
      AV65BarCodPar = "" ;
      AV117EncCli = "" ;
      P01QX11_A396EmprCod = new String[] {""} ;
      P01QX11_A129BarCod = new int[1] ;
      P01QX11_A132BarCodReo = new byte[1] ;
      P01QX11_A130BarCodPar = new String[] {""} ;
      P01QX11_A30AlbProCod = new long[1] ;
      P01QX11_A1265BarAlbPie = new int[1] ;
      P01QX11_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV105AlbProFch = GXutil.nullDate() ;
      AV67TotLin = DecimalUtil.ZERO ;
      AV91Precio = DecimalUtil.ZERO ;
      AV95FacKgs = DecimalUtil.ZERO ;
      AV151Op = "" ;
      AV83BarColNom = "" ;
      AV142Norm = "" ;
      AV107barNomcli = "" ;
      AV109Aux1 = DecimalUtil.ZERO ;
      AV110Aux2 = DecimalUtil.ZERO ;
      AV111Aux3 = DecimalUtil.ZERO ;
      AV108Aux0 = DecimalUtil.ZERO ;
      AV113Aux5 = DecimalUtil.ZERO ;
      AV116dSC = "" ;
      P01QX12_A396EmprCod = new String[] {""} ;
      P01QX12_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      AV90FacDsc = "" ;
      AV123FacMts = DecimalUtil.ZERO ;
      AV125Cant = DecimalUtil.ZERO ;
      AV126Un = "" ;
      P01QX15_A396EmprCod = new String[] {""} ;
      P01QX15_A361DisCod = new int[1] ;
      P01QX15_A130BarCodPar = new String[] {""} ;
      P01QX15_A132BarCodReo = new byte[1] ;
      P01QX15_A129BarCod = new int[1] ;
      P01QX15_A1652BarSerDsc = new String[] {""} ;
      P01QX15_A135BarColNom = new String[] {""} ;
      P01QX15_A136BarColNum = new int[1] ;
      P01QX15_A252CliCod = new int[1] ;
      P01QX15_n252CliCod = new boolean[] {false} ;
      P01QX15_A1234BarNomCli = new String[] {""} ;
      P01QX15_A221BarTra1 = new String[] {""} ;
      P01QX15_A222BarTra2 = new String[] {""} ;
      P01QX15_A223BarTra3 = new String[] {""} ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      AV118Compos = "" ;
      P01QX16_A396EmprCod = new String[] {""} ;
      P01QX16_A361DisCod = new int[1] ;
      P01QX16_A13213DisNormID = new String[] {""} ;
      A13213DisNormID = "" ;
      P01QX17_A396EmprCod = new String[] {""} ;
      P01QX17_A497FpgCod = new String[] {""} ;
      P01QX17_A498FpgDsc = new String[] {""} ;
      P01QX17_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      AV134Clipagnom = "" ;
      AV137CliPagDom = "" ;
      AV138CliPagPob = "" ;
      AV139CliPagCp = "" ;
      AV135CliPagiban = "" ;
      AV136Cliswift = "" ;
      AV140CliNib = "" ;
      AV141CliPagCue = "" ;
      P01QX18_A396EmprCod = new String[] {""} ;
      P01QX18_A287CliPagLin = new byte[1] ;
      P01QX18_A252CliCod = new int[1] ;
      P01QX18_n252CliCod = new boolean[] {false} ;
      P01QX18_A288CliPagNom = new String[] {""} ;
      P01QX18_A286CliPagDom = new String[] {""} ;
      P01QX18_A289CliPagPob = new String[] {""} ;
      P01QX18_A2326CliPagCp = new String[] {""} ;
      P01QX18_A10060CliPagIban = new String[] {""} ;
      P01QX18_A10416CliSwift = new String[] {""} ;
      P01QX18_A10415CliNIB = new String[] {""} ;
      P01QX18_A284CliPagCue = new String[] {""} ;
      A288CliPagNom = "" ;
      A286CliPagDom = "" ;
      A289CliPagPob = "" ;
      A2326CliPagCp = "" ;
      A10060CliPagIban = "" ;
      A10416CliSwift = "" ;
      A10415CliNIB = "" ;
      A284CliPagCue = "" ;
      AV121Texto_pc = "" ;
      AV132Obs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfaccarv__default(),
         new Object[] {
             new Object[] {
            P01QX2_A11629MeivaId, P01QX2_n11629MeivaId, P01QX2_A396EmprCod, P01QX2_A430FacCod, P01QX2_A437FacFpg, P01QX2_A450FacPri, P01QX2_A11273FacObs2, P01QX2_A9605FacFirma, P01QX2_A2739FacSerNum, P01QX2_A435FacEst,
            P01QX2_A9643FacLiq1, P01QX2_A9644FacLiq2, P01QX2_A9645FacIva1, P01QX2_A9646FacTot1, P01QX2_A252CliCod, P01QX2_A436FacFch, P01QX2_A11513FacRecIca, P01QX2_A8346FacRecI, P01QX2_n8346FacRecI, P01QX2_A7212FacRect,
            P01QX2_A453FacRECPor, P01QX2_A14224FacCostFac, P01QX2_A14223FacCostKgs, P01QX2_A14222FacCostMts, P01QX2_A433FacDtoGen, P01QX2_A443FacIVAPor, P01QX2_A434FacDtoPP, P01QX2_A14219FacEnergia
            }
            , new Object[] {
            P01QX3_A7209Colombia, P01QX3_n7209Colombia
            }
            , new Object[] {
            P01QX5_A3918FacImpTot1
            }
            , new Object[] {
            P01QX6_A781PrvCod, P01QX6_A278CliNif, P01QX6_A858ZonGeoCod, P01QX6_A4828CliCp2, P01QX6_A3644CliNom1, P01QX6_A5649CliDom2, P01QX6_A295CliPob, P01QX6_A256CliCp, P01QX6_A260CliDom, P01QX6_A279CliNom
            }
            , new Object[] {
            P01QX7_A787PrvDsc, P01QX7_n787PrvDsc
            }
            , new Object[] {
            P01QX8_A11630MeivaDsc, P01QX8_n11630MeivaDsc
            }
            , new Object[] {
            P01QX9_A396EmprCod, P01QX9_A430FacCod, P01QX9_A956FacVtoLin, P01QX9_A957FacVtoFch, P01QX9_n957FacVtoFch
            }
            , new Object[] {
            P01QX10_A396EmprCod, P01QX10_A430FacCod, P01QX10_A3397FacFasCod, P01QX10_A432FacDsc, P01QX10_A427FacAlbCod, P01QX10_A1296FacBarPar, P01QX10_A1295FacBarReo, P01QX10_A1294FacBarCod, P01QX10_A428FacAlbTip, P01QX10_A448FacPreKgs,
            P01QX10_A444FacKgs, P01QX10_A454FacSer, P01QX10_A9649FacPKDto, P01QX10_A9650FacPMdto, P01QX10_A9648FacDtoL, P01QX10_A9647FacImpdto, P01QX10_A9651FacImpd, P01QX10_A9708FacDscII, P01QX10_A449FacPreMts, P01QX10_A447FacMts,
            P01QX10_A446FacLin, P01QX10_A1498FacDisNum
            }
            , new Object[] {
            P01QX11_A396EmprCod, P01QX11_A129BarCod, P01QX11_A132BarCodReo, P01QX11_A130BarCodPar, P01QX11_A30AlbProCod, P01QX11_A1265BarAlbPie, P01QX11_A34AlbProfch
            }
            , new Object[] {
            P01QX12_A396EmprCod, P01QX12_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01QX15_A396EmprCod, P01QX15_A361DisCod, P01QX15_A130BarCodPar, P01QX15_A132BarCodReo, P01QX15_A129BarCod, P01QX15_A1652BarSerDsc, P01QX15_A135BarColNom, P01QX15_A136BarColNum, P01QX15_A252CliCod, P01QX15_n252CliCod,
            P01QX15_A1234BarNomCli, P01QX15_A221BarTra1, P01QX15_A222BarTra2, P01QX15_A223BarTra3
            }
            , new Object[] {
            P01QX16_A396EmprCod, P01QX16_A361DisCod, P01QX16_A13213DisNormID
            }
            , new Object[] {
            P01QX17_A396EmprCod, P01QX17_A497FpgCod, P01QX17_A498FpgDsc, P01QX17_n498FpgDsc
            }
            , new Object[] {
            P01QX18_A396EmprCod, P01QX18_A287CliPagLin, P01QX18_A252CliCod, P01QX18_A288CliPagNom, P01QX18_A286CliPagDom, P01QX18_A289CliPagPob, P01QX18_A2326CliPagCp, P01QX18_A10060CliPagIban, P01QX18_A10416CliSwift, P01QX18_A10415CliNIB,
            P01QX18_A284CliPagCue
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV62CtrlPag ;
   private byte AV80NumLin ;
   private byte AV96FlagNoFin ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV115fACiVApOR ;
   private byte AV60CliPagLin ;
   private byte AV97IvaPor ;
   private byte AV58FlagPag ;
   private byte AV92Paso ;
   private byte A956FacVtoLin ;
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private byte AV100LenVar ;
   private byte AV64BarCodReo ;
   private byte A132BarCodReo ;
   private byte A287CliPagLin ;
   private byte AV104Suma_s ;
   private short A781PrvCod ;
   private short A858ZonGeoCod ;
   private short AV89Piezas ;
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
   private int AV32FacAlbCod ;
   private int AV63BarCod ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int Gx_OldLine ;
   private int AV84BarColNum ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private long A427FacAlbCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV16ValEuro ;
   private java.math.BigDecimal AV49SumSig ;
   private java.math.BigDecimal AV112Aux4 ;
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
   private java.math.BigDecimal AV114Facdtopp ;
   private java.math.BigDecimal AV68FacImpTot ;
   private java.math.BigDecimal AV69FacImpPP ;
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
   private java.math.BigDecimal AV109Aux1 ;
   private java.math.BigDecimal AV110Aux2 ;
   private java.math.BigDecimal AV111Aux3 ;
   private java.math.BigDecimal AV108Aux0 ;
   private java.math.BigDecimal AV113Aux5 ;
   private java.math.BigDecimal AV123FacMts ;
   private java.math.BigDecimal AV125Cant ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV93TextoCopia ;
   private String Gx_out ;
   private String AV102ContDsc ;
   private String AV122FirmaD ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A11629MeivaId ;
   private String A437FacFpg ;
   private String A450FacPri ;
   private String A9605FacFirma ;
   private String A2739FacSerNum ;
   private String A278CliNif ;
   private String A4828CliCp2 ;
   private String A3644CliNom1 ;
   private String A5649CliDom2 ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String A787PrvDsc ;
   private String AV79CliNif ;
   private String AV23FpgCod ;
   private String AV61DesPago ;
   private String AV24FpgDsc ;
   private String AV106Texto_siva ;
   private String AV130Obs1 ;
   private String AV127Cpostal ;
   private String AV128CliNom3 ;
   private String AV129Clidom50 ;
   private String AV51CliPri ;
   private String AV103Texto_i ;
   private String AV119Texto_fd ;
   private String AV120Firma4dig ;
   private String AV124FraMan ;
   private String A3397FacFasCod ;
   private String A432FacDsc ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A9708FacDscII ;
   private String A1498FacDisNum ;
   private String AV99Nueves9 ;
   private String AV101Hdr_8 ;
   private String AV88Hdr ;
   private String AV82BarSerDsc ;
   private String AV65BarCodPar ;
   private String AV117EncCli ;
   private String A130BarCodPar ;
   private String AV151Op ;
   private String AV83BarColNom ;
   private String AV142Norm ;
   private String AV107barNomcli ;
   private String AV116dSC ;
   private String A457FasCod ;
   private String AV90FacDsc ;
   private String AV126Un ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String AV118Compos ;
   private String A13213DisNormID ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String AV134Clipagnom ;
   private String AV137CliPagDom ;
   private String AV138CliPagPob ;
   private String AV139CliPagCp ;
   private String AV135CliPagiban ;
   private String AV136Cliswift ;
   private String AV140CliNib ;
   private String AV141CliPagCue ;
   private String A288CliPagNom ;
   private String A286CliPagDom ;
   private String A289CliPagPob ;
   private String A2326CliPagCp ;
   private String A10060CliPagIban ;
   private String A10416CliSwift ;
   private String A10415CliNIB ;
   private String A284CliPagCue ;
   private String AV121Texto_pc ;
   private String AV132Obs ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV85FacFch ;
   private java.util.Date AV37Vencim[] ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV105AlbProFch ;
   private boolean GxHdr2 ;
   private boolean n11629MeivaId ;
   private boolean n252CliCod ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean n787PrvDsc ;
   private boolean n11630MeivaDsc ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean n498FpgDsc ;
   private String A11273FacObs2 ;
   private String A11630MeivaDsc ;
   private String AV133MeivaDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01QX2_A11629MeivaId ;
   private boolean[] P01QX2_n11629MeivaId ;
   private String[] P01QX2_A396EmprCod ;
   private int[] P01QX2_A430FacCod ;
   private String[] P01QX2_A437FacFpg ;
   private String[] P01QX2_A450FacPri ;
   private String[] P01QX2_A11273FacObs2 ;
   private String[] P01QX2_A9605FacFirma ;
   private String[] P01QX2_A2739FacSerNum ;
   private byte[] P01QX2_A435FacEst ;
   private java.math.BigDecimal[] P01QX2_A9643FacLiq1 ;
   private java.math.BigDecimal[] P01QX2_A9644FacLiq2 ;
   private java.math.BigDecimal[] P01QX2_A9645FacIva1 ;
   private java.math.BigDecimal[] P01QX2_A9646FacTot1 ;
   private int[] P01QX2_A252CliCod ;
   private boolean[] P01QX2_n252CliCod ;
   private java.util.Date[] P01QX2_A436FacFch ;
   private java.math.BigDecimal[] P01QX2_A11513FacRecIca ;
   private java.math.BigDecimal[] P01QX2_A8346FacRecI ;
   private boolean[] P01QX2_n8346FacRecI ;
   private java.math.BigDecimal[] P01QX2_A7212FacRect ;
   private java.math.BigDecimal[] P01QX2_A453FacRECPor ;
   private java.math.BigDecimal[] P01QX2_A14224FacCostFac ;
   private java.math.BigDecimal[] P01QX2_A14223FacCostKgs ;
   private java.math.BigDecimal[] P01QX2_A14222FacCostMts ;
   private java.math.BigDecimal[] P01QX2_A433FacDtoGen ;
   private byte[] P01QX2_A443FacIVAPor ;
   private java.math.BigDecimal[] P01QX2_A434FacDtoPP ;
   private java.math.BigDecimal[] P01QX2_A14219FacEnergia ;
   private byte[] P01QX3_A7209Colombia ;
   private boolean[] P01QX3_n7209Colombia ;
   private java.math.BigDecimal[] P01QX5_A3918FacImpTot1 ;
   private short[] P01QX6_A781PrvCod ;
   private String[] P01QX6_A278CliNif ;
   private short[] P01QX6_A858ZonGeoCod ;
   private String[] P01QX6_A4828CliCp2 ;
   private String[] P01QX6_A3644CliNom1 ;
   private String[] P01QX6_A5649CliDom2 ;
   private String[] P01QX6_A295CliPob ;
   private String[] P01QX6_A256CliCp ;
   private String[] P01QX6_A260CliDom ;
   private String[] P01QX6_A279CliNom ;
   private String[] P01QX7_A787PrvDsc ;
   private boolean[] P01QX7_n787PrvDsc ;
   private String[] P01QX8_A11630MeivaDsc ;
   private boolean[] P01QX8_n11630MeivaDsc ;
   private String[] P01QX9_A396EmprCod ;
   private int[] P01QX9_A430FacCod ;
   private byte[] P01QX9_A956FacVtoLin ;
   private java.util.Date[] P01QX9_A957FacVtoFch ;
   private boolean[] P01QX9_n957FacVtoFch ;
   private String[] P01QX10_A396EmprCod ;
   private int[] P01QX10_A430FacCod ;
   private String[] P01QX10_A3397FacFasCod ;
   private String[] P01QX10_A432FacDsc ;
   private long[] P01QX10_A427FacAlbCod ;
   private String[] P01QX10_A1296FacBarPar ;
   private byte[] P01QX10_A1295FacBarReo ;
   private int[] P01QX10_A1294FacBarCod ;
   private byte[] P01QX10_A428FacAlbTip ;
   private java.math.BigDecimal[] P01QX10_A448FacPreKgs ;
   private java.math.BigDecimal[] P01QX10_A444FacKgs ;
   private String[] P01QX10_A454FacSer ;
   private java.math.BigDecimal[] P01QX10_A9649FacPKDto ;
   private java.math.BigDecimal[] P01QX10_A9650FacPMdto ;
   private java.math.BigDecimal[] P01QX10_A9648FacDtoL ;
   private java.math.BigDecimal[] P01QX10_A9647FacImpdto ;
   private java.math.BigDecimal[] P01QX10_A9651FacImpd ;
   private String[] P01QX10_A9708FacDscII ;
   private java.math.BigDecimal[] P01QX10_A449FacPreMts ;
   private java.math.BigDecimal[] P01QX10_A447FacMts ;
   private int[] P01QX10_A446FacLin ;
   private String[] P01QX10_A1498FacDisNum ;
   private String[] P01QX11_A396EmprCod ;
   private int[] P01QX11_A129BarCod ;
   private byte[] P01QX11_A132BarCodReo ;
   private String[] P01QX11_A130BarCodPar ;
   private long[] P01QX11_A30AlbProCod ;
   private int[] P01QX11_A1265BarAlbPie ;
   private java.util.Date[] P01QX11_A34AlbProfch ;
   private String[] P01QX12_A396EmprCod ;
   private String[] P01QX12_A457FasCod ;
   private String[] P01QX15_A396EmprCod ;
   private int[] P01QX15_A361DisCod ;
   private String[] P01QX15_A130BarCodPar ;
   private byte[] P01QX15_A132BarCodReo ;
   private int[] P01QX15_A129BarCod ;
   private String[] P01QX15_A1652BarSerDsc ;
   private String[] P01QX15_A135BarColNom ;
   private int[] P01QX15_A136BarColNum ;
   private int[] P01QX15_A252CliCod ;
   private boolean[] P01QX15_n252CliCod ;
   private String[] P01QX15_A1234BarNomCli ;
   private String[] P01QX15_A221BarTra1 ;
   private String[] P01QX15_A222BarTra2 ;
   private String[] P01QX15_A223BarTra3 ;
   private String[] P01QX16_A396EmprCod ;
   private int[] P01QX16_A361DisCod ;
   private String[] P01QX16_A13213DisNormID ;
   private String[] P01QX17_A396EmprCod ;
   private String[] P01QX17_A497FpgCod ;
   private String[] P01QX17_A498FpgDsc ;
   private boolean[] P01QX17_n498FpgDsc ;
   private String[] P01QX18_A396EmprCod ;
   private byte[] P01QX18_A287CliPagLin ;
   private int[] P01QX18_A252CliCod ;
   private boolean[] P01QX18_n252CliCod ;
   private String[] P01QX18_A288CliPagNom ;
   private String[] P01QX18_A286CliPagDom ;
   private String[] P01QX18_A289CliPagPob ;
   private String[] P01QX18_A2326CliPagCp ;
   private String[] P01QX18_A10060CliPagIban ;
   private String[] P01QX18_A10416CliSwift ;
   private String[] P01QX18_A10415CliNIB ;
   private String[] P01QX18_A284CliPagCue ;
}

final  class pfaccarv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01QX2", "SELECT MeivaId, EmprCod, FacCod, FacFpg, FacPri, FacObs2, FacFirma, FacSerNum, FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1, CliCod, FacFch, FacRecIca, FacRecI, FacRect, FacRECPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoGen, FacIVAPor, FacDtoPP, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX3", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX5", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX6", "SELECT PrvCod, CliNif, ZonGeoCod, CliCp2, CliNom1, CliDom2, CliPob, CliCp, CliDom, CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX7", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX8", "SELECT MeivaDsc FROM TXPMEIVA WHERE EmprCod = ? AND MeivaId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX9", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01QX10", "SELECT EmprCod, FacCod, FacFasCod, FacDsc, FacAlbCod, FacBarPar, FacBarReo, FacBarCod, FacAlbTip, FacPreKgs, FacKgs, FacSer, FacPKDto, FacPMdto, FacDtoL, FacImpdto, FacImpd, FacDscII, FacPreMts, FacMts, FacLin, FacDisNum FROM TXPLFAVEN WHERE (EmprCod = ?) AND (FacCod = ?) ORDER BY FacAlbCod, FacDisNum, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacLin  FOR UPDATE OF FacPKDto, FacPMdto, FacDtoL, FacImpdto, FacImpd, FacDscII NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01QX11", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProCod, T1.BarAlbPie, T2.AlbProfch FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX12", "SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01QX13", "UPDATE TXPLFAVEN SET FacPKDto=?, FacPMdto=?, FacDtoL=?, FacImpdto=?, FacImpd=?, FacDscII=?  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P01QX14", "UPDATE TXPCFAVEN SET FacEst=?, FacLiq1=?, FacLiq2=?, FacIva1=?, FacTot1=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P01QX15", "SELECT EmprCod, DisCod, BarCodPar, BarCodReo, BarCod, BarSerDsc, BarColNom, BarColNum, CliCod, BarNomCli, BarTra1, BarTra2, BarTra3 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX16", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01QX17", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QX18", "SELECT EmprCod, CliPagLin, CliCod, CliPagNom, CliPagDom, CliPagPob, CliPagCp, CliPagIban, CliSwift, CliNIB, CliPagCue FROM TXPCLIPAG WHERE EmprCod = ? and CliCod = ? and CliPagLin = ? ORDER BY EmprCod, CliCod, CliPagLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 2);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 200);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,5);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,2);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 34);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[17])[0] = rslt.getString(18, 200);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 4);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((String[]) buf[13])[0] = rslt.getString(13, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
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
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

