package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfacetx extends GXReport
{
   public pfacetx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacetx.class ), "" );
   }

   public pfacetx( int remoteHandle ,
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
      pfacetx.this.aP5 = new String[] {""};
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
      pfacetx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacetx.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfacetx.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      pfacetx.this.AV16ValEuro = aP3[0];
      this.aP3 = aP3;
      pfacetx.this.AV93TextoCopia = aP4[0];
      this.aP4 = aP4;
      pfacetx.this.Gx_out = aP5[0];
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
         getPrinter().GxSetDocName("FACTURA CLIENTES, ENDUTEX") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*15)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV112ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACETX", ""), GXv_char1) ;
         pfacetx.this.AV112ContDsc = GXv_char1[0] ;
         AV49SumSig = DecimalUtil.doubleToDec(0) ;
         AV62CtrlPag = (byte)(0) ;
         AV80NumLin = (byte)(1) ;
         GxHdr2 = true ;
         /* Using cursor P01EO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A437FacFpg = P01EO2_A437FacFpg[0] ;
            A450FacPri = P01EO2_A450FacPri[0] ;
            A435FacEst = P01EO2_A435FacEst[0] ;
            A436FacFch = P01EO2_A436FacFch[0] ;
            A252CliCod = P01EO2_A252CliCod[0] ;
            A11513FacRecIca = P01EO2_A11513FacRecIca[0] ;
            A8346FacRecI = P01EO2_A8346FacRecI[0] ;
            n8346FacRecI = P01EO2_n8346FacRecI[0] ;
            A7212FacRect = P01EO2_A7212FacRect[0] ;
            A453FacRECPor = P01EO2_A453FacRECPor[0] ;
            A14224FacCostFac = P01EO2_A14224FacCostFac[0] ;
            A14223FacCostKgs = P01EO2_A14223FacCostKgs[0] ;
            A14222FacCostMts = P01EO2_A14222FacCostMts[0] ;
            A443FacIVAPor = P01EO2_A443FacIVAPor[0] ;
            A433FacDtoGen = P01EO2_A433FacDtoGen[0] ;
            A434FacDtoPP = P01EO2_A434FacDtoPP[0] ;
            A14219FacEnergia = P01EO2_A14219FacEnergia[0] ;
            /* Using cursor P01EO3 */
            pr_default.execute(1, new Object[] {A396EmprCod});
            A7209Colombia = P01EO3_A7209Colombia[0] ;
            n7209Colombia = P01EO3_n7209Colombia[0] ;
            /* Using cursor P01EO5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(2) != 101) )
            {
               A3918FacImpTot1 = P01EO5_A3918FacImpTot1[0] ;
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
            /* Using cursor P01EO6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            A278CliNif = P01EO6_A278CliNif[0] ;
            A295CliPob = P01EO6_A295CliPob[0] ;
            A260CliDom = P01EO6_A260CliDom[0] ;
            A279CliNom = P01EO6_A279CliNom[0] ;
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
            AV61DesPago = GXutil.substring( AV24FpgDsc, 1, 30) ;
            AV58FlagPag = (byte)(0) ;
            AV56CliCod = A252CliCod ;
            AV51CliPri = A450FacPri ;
            AV85FacFch = A436FacFch ;
            AV92Paso = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV37Vencim[GX_I-1] = GXutil.nullDate() ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P01EO7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A956FacVtoLin = P01EO7_A956FacVtoLin[0] ;
               A957FacVtoFch = P01EO7_A957FacVtoFch[0] ;
               n957FacVtoFch = P01EO7_n957FacVtoFch[0] ;
               AV92Paso = (byte)(AV92Paso+1) ;
               AV37Vencim[AV92Paso-1] = A957FacVtoFch ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV68FacImpTot = A441FacImpTot ;
            AV69FacImpPP = A440FacImpPP ;
            AV110FacImpGen = A439FacImpGen ;
            AV111FacDtoGen = A433FacDtoGen ;
            AV70FacIvaImp = A442FacIVAImp ;
            AV71FacTot = A455FacTot ;
            AV81FacBasImp = A429FacBasImp ;
            AV109FacIvaPor = A443FacIVAPor ;
            AV78TotFac = GXutil.roundDecimal( (A455FacTot.multiply(AV16ValEuro)), 0) ;
            AV80NumLin = (byte)(0) ;
            AV107FlagNoFin = (byte)(0) ;
            /* Using cursor P01EO8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               brk1EO5 = false ;
               A3397FacFasCod = P01EO8_A3397FacFasCod[0] ;
               A444FacKgs = P01EO8_A444FacKgs[0] ;
               A1498FacDisNum = P01EO8_A1498FacDisNum[0] ;
               A428FacAlbTip = P01EO8_A428FacAlbTip[0] ;
               A448FacPreKgs = P01EO8_A448FacPreKgs[0] ;
               A449FacPreMts = P01EO8_A449FacPreMts[0] ;
               A447FacMts = P01EO8_A447FacMts[0] ;
               A432FacDsc = P01EO8_A432FacDsc[0] ;
               A1296FacBarPar = P01EO8_A1296FacBarPar[0] ;
               A1295FacBarReo = P01EO8_A1295FacBarReo[0] ;
               A1294FacBarCod = P01EO8_A1294FacBarCod[0] ;
               A252CliCod = P01EO8_A252CliCod[0] ;
               A427FacAlbCod = P01EO8_A427FacAlbCod[0] ;
               A446FacLin = P01EO8_A446FacLin[0] ;
               A252CliCod = P01EO8_A252CliCod[0] ;
               if ( AV80NumLin > 29 )
               {
                  AV107FlagNoFin = (byte)(1) ;
                  AV80NumLin = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               /* Using cursor P01EO9 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Long.valueOf(A427FacAlbCod)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A1243GuiRemCli = P01EO9_A1243GuiRemCli[0] ;
                  A30AlbProCod = P01EO9_A30AlbProCod[0] ;
                  A34AlbProfch = P01EO9_A34AlbProfch[0] ;
                  AV105AlbProFch = A34AlbProfch ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               h1EO0( false, 31) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "G.R.nº", ""), 184, Gx_line+6, 219, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9")), 250, Gx_line+6, 324, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 330, Gx_line+6, 346, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV105AlbProFch, "99/99/99"), 353, Gx_line+6, 404, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
               AV80NumLin = (byte)(AV80NumLin+2) ;
               AV32FacAlbCod = A427FacAlbCod ;
               AV95Last_hdr = "" ;
               while ( (pr_default.getStatus(5) != 101) && ( P01EO8_A427FacAlbCod[0] == A427FacAlbCod ) )
               {
                  brk1EO5 = false ;
                  A3397FacFasCod = P01EO8_A3397FacFasCod[0] ;
                  A444FacKgs = P01EO8_A444FacKgs[0] ;
                  A1498FacDisNum = P01EO8_A1498FacDisNum[0] ;
                  A428FacAlbTip = P01EO8_A428FacAlbTip[0] ;
                  A448FacPreKgs = P01EO8_A448FacPreKgs[0] ;
                  A449FacPreMts = P01EO8_A449FacPreMts[0] ;
                  A447FacMts = P01EO8_A447FacMts[0] ;
                  A432FacDsc = P01EO8_A432FacDsc[0] ;
                  A1296FacBarPar = P01EO8_A1296FacBarPar[0] ;
                  A1295FacBarReo = P01EO8_A1295FacBarReo[0] ;
                  A1294FacBarCod = P01EO8_A1294FacBarCod[0] ;
                  A446FacLin = P01EO8_A446FacLin[0] ;
                  if ( GXutil.strcmp(P01EO8_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P01EO8_A430FacCod[0] == A430FacCod )
                     {
                        if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
                        {
                           AV88Hdr = GXutil.str( A1294FacBarCod, 8, 0) + "-" + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                           if ( A1295FacBarReo == 0 )
                           {
                              AV106Hdri = GXutil.str( A1294FacBarCod, 8, 0) + " " + " " + A1296FacBarPar ;
                           }
                           else
                           {
                              AV106Hdri = GXutil.str( A1294FacBarCod, 8, 0) + "-" + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                           }
                           AV97FacKgs = A444FacKgs ;
                           if ( ( GXutil.strcmp(AV88Hdr, AV95Last_hdr) != 0 ) && ! (GXutil.strcmp("", AV95Last_hdr)==0) )
                           {
                              /* Execute user subroutine: 'LINEASFAS' */
                              S111 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(5);
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
                           }
                           AV82BarSerDsc = " " ;
                           AV63BarCod = A1294FacBarCod ;
                           AV64BarCodReo = A1295FacBarReo ;
                           AV65BarCodPar = A1296FacBarPar ;
                           /* Execute user subroutine: 'BARCAD' */
                           S121 ();
                           if ( returnInSub )
                           {
                              pr_default.close(5);
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
                           AV94FacDisNum = GXutil.substring( A1498FacDisNum, 1, 6) ;
                           if ( A428FacAlbTip == 1 )
                           {
                              if ( AV80NumLin > 29 )
                              {
                                 AV80NumLin = (byte)(1) ;
                                 AV107FlagNoFin = (byte)(1) ;
                                 /* Eject command */
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(P_lines+1) ;
                              }
                              AV67TotLin = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                              AV91Precio = A448FacPreKgs ;
                              h1EO0( false, 15) ;
                              getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94FacDisNum, "")), 49, Gx_line+0, 113, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106Hdri, "")), 96, Gx_line+0, 154, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82BarSerDsc, "")), 190, Gx_line+0, 326, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 383, Gx_line+0, 436, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84BarColNum), "ZZZZZ9")), 459, Gx_line+0, 498, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 578, Gx_line+0, 635, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZ9.999")), 650, Gx_line+0, 695, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 706, Gx_line+0, 782, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103BarKgm, "ZZZZZ9.99")), 508, Gx_line+0, 565, Gx_line+16, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+15) ;
                              AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                              AV80NumLin = (byte)(AV80NumLin+1) ;
                              if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                              {
                                 AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                 AV91Precio = A449FacPreMts ;
                                 if ( AV80NumLin > 29 )
                                 {
                                    AV80NumLin = (byte)(1) ;
                                    AV107FlagNoFin = (byte)(1) ;
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                 }
                                 h1EO0( false, 15) ;
                                 getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 578, Gx_line+0, 635, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZ9.999")), 650, Gx_line+0, 695, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 706, Gx_line+0, 782, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV104BarMtr, "ZZZZZ9.99")), 508, Gx_line+0, 565, Gx_line+16, 2+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+15) ;
                                 AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                 AV80NumLin = (byte)(AV80NumLin+1) ;
                              }
                              if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                              {
                                 AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                                 AV91Precio = A449FacPreMts ;
                                 if ( AV80NumLin > 29 )
                                 {
                                    AV80NumLin = (byte)(1) ;
                                    AV107FlagNoFin = (byte)(1) ;
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                 }
                                 h1EO0( false, 15) ;
                                 getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 578, Gx_line+0, 635, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZ9.999")), 650, Gx_line+0, 695, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 706, Gx_line+0, 782, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94FacDisNum, "")), 49, Gx_line+0, 113, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82BarSerDsc, "")), 190, Gx_line+0, 326, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83BarColNom, "")), 383, Gx_line+0, 436, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84BarColNum), "ZZZZZ9")), 459, Gx_line+0, 498, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV104BarMtr, "ZZZZZ9.99")), 508, Gx_line+0, 565, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106Hdri, "")), 96, Gx_line+0, 154, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+15) ;
                                 AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                                 AV80NumLin = (byte)(AV80NumLin+1) ;
                              }
                           }
                           if ( A428FacAlbTip == 2 )
                           {
                              AV67TotLin = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                              AV91Precio = A449FacPreMts ;
                              if ( AV80NumLin > 29 )
                              {
                                 AV107FlagNoFin = (byte)(1) ;
                                 AV80NumLin = (byte)(1) ;
                                 /* Eject command */
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(P_lines+1) ;
                              }
                              h1EO0( false, 16) ;
                              getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 190, Gx_line+1, 399, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 578, Gx_line+0, 635, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 681, Gx_line+0, 689, Gx_line+15, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZ9.999")), 650, Gx_line+0, 695, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 706, Gx_line+0, 782, Gx_line+16, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+16) ;
                              AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                              AV80NumLin = (byte)(AV80NumLin+1) ;
                           }
                           AV95Last_hdr = AV88Hdr ;
                        }
                     }
                  }
                  brk1EO5 = true ;
                  pr_default.readNext(5);
               }
               /* Execute user subroutine: 'LINEASFAS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
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
               if ( ! brk1EO5 )
               {
                  brk1EO5 = true ;
                  pr_default.readNext(5);
               }
            }
            pr_default.close(5);
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            /* Using cursor P01EO10 */
            pr_default.execute(7, new Object[] {Byte.valueOf(A435FacEst), A396EmprCod, Integer.valueOf(A430FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.close(1);
         pr_default.close(3);
         pr_default.close(2);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1EO0( true, 0) ;
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
      /* 'LINEASFAS' Routine */
      returnInSub = false ;
      AV100BarCodL = (int)(GXutil.lval( GXutil.substring( AV95Last_hdr, 1, 8))) ;
      AV101BarCodReoL = (byte)(GXutil.lval( GXutil.substring( AV95Last_hdr, 10, 1))) ;
      AV102BarCodParL = GXutil.substring( AV95Last_hdr, 11, 1) ;
      AV96FasesDsc = "" ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = A430FacCod ;
      GXv_int3[0] = AV32FacAlbCod ;
      GXv_int4[0] = AV100BarCodL ;
      GXv_int5[0] = AV101BarCodReoL ;
      GXv_char6[0] = AV102BarCodParL ;
      GXv_char7[0] = AV96FasesDsc ;
      GXv_decimal8[0] = AV91Precio ;
      GXv_decimal9[0] = AV97FacKgs ;
      GXv_decimal10[0] = AV67TotLin ;
      GXv_int11[0] = AV117i ;
      GXv_decimal12[0] = AV114FacBonLi ;
      GXv_decimal13[0] = AV113FacRec ;
      new app.pfacmod2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_int5, GXv_char6, GXv_char7, GXv_decimal8, GXv_decimal9, GXv_decimal10, AV118Tab_dsc, AV119Tab_imp, AV120Tab_kgs, AV121Tab_prec, GXv_int11, AV116Tab_Bon, AV115Tab_Rec, GXv_decimal12, GXv_decimal13) ;
      pfacetx.this.A396EmprCod = GXv_char1[0] ;
      pfacetx.this.A430FacCod = GXv_int2[0] ;
      pfacetx.this.AV32FacAlbCod = GXv_int3[0] ;
      pfacetx.this.AV100BarCodL = GXv_int4[0] ;
      pfacetx.this.AV101BarCodReoL = GXv_int5[0] ;
      pfacetx.this.AV102BarCodParL = GXv_char6[0] ;
      pfacetx.this.AV96FasesDsc = GXv_char7[0] ;
      pfacetx.this.AV91Precio = GXv_decimal8[0] ;
      pfacetx.this.AV97FacKgs = GXv_decimal9[0] ;
      pfacetx.this.AV67TotLin = GXv_decimal10[0] ;
      pfacetx.this.AV117i = GXv_int11[0] ;
      pfacetx.this.AV114FacBonLi = GXv_decimal12[0] ;
      pfacetx.this.AV113FacRec = GXv_decimal13[0] ;
      if ( ! (GXutil.strcmp("", AV96FasesDsc)==0) )
      {
         if ( AV80NumLin > 29 )
         {
            AV80NumLin = (byte)(1) ;
            AV107FlagNoFin = (byte)(1) ;
            AV62CtrlPag = (byte)(1) ;
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
         }
         h1EO0( false, 15) ;
         getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96FasesDsc, "")), 190, Gx_line+0, 399, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV97FacKgs, "Z,ZZ9.99")), 585, Gx_line+0, 636, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Precio, "ZZ9.999")), 650, Gx_line+0, 695, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TotLin, "Z,ZZZ,ZZZ.ZZ")), 706, Gx_line+0, 782, Gx_line+16, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+15) ;
         AV49SumSig = AV49SumSig.add(AV67TotLin) ;
         AV80NumLin = (byte)(AV80NumLin+1) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV82BarSerDsc = "" ;
      AV83BarColNom = "" ;
      AV84BarColNum = 0 ;
      /* Using cursor P01EO12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV63BarCod), Byte.valueOf(AV64BarCodReo), AV65BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P01EO12_A130BarCodPar[0] ;
         A132BarCodReo = P01EO12_A132BarCodReo[0] ;
         A129BarCod = P01EO12_A129BarCod[0] ;
         A1652BarSerDsc = P01EO12_A1652BarSerDsc[0] ;
         A135BarColNom = P01EO12_A135BarColNom[0] ;
         A136BarColNum = P01EO12_A136BarColNum[0] ;
         A166BarKgm = P01EO12_A166BarKgm[0] ;
         A184BarMtr = P01EO12_A184BarMtr[0] ;
         A166BarKgm = P01EO12_A166BarKgm[0] ;
         A184BarMtr = P01EO12_A184BarMtr[0] ;
         AV82BarSerDsc = A1652BarSerDsc ;
         AV83BarColNom = A135BarColNom ;
         AV84BarColNum = A136BarColNum ;
         AV103BarKgm = A166BarKgm ;
         AV104BarMtr = A184BarMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'FORPAG' Routine */
      returnInSub = false ;
      AV24FpgDsc = "" ;
      /* Using cursor P01EO13 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV23FpgCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A497FpgCod = P01EO13_A497FpgCod[0] ;
         A498FpgDsc = P01EO13_A498FpgDsc[0] ;
         n498FpgDsc = P01EO13_n498FpgDsc[0] ;
         AV24FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void h1EO0( boolean bFoot ,
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
               if ( AV107FlagNoFin == 0 )
               {
                  getPrinter().GxDrawRect(527, Gx_line+27, 683, Gx_line+170, 1, 0, 0, 0, 1, 155, 155, 155, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV109FacIvaPor), "Z9")), 51, Gx_line+75, 67, Gx_line+92, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(508, Gx_line+21, 793, Gx_line+175, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(36, Gx_line+16, 793, Gx_line+16, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mercadoria/Serviços", ""), 535, Gx_line+33, 652, Gx_line+49, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Descontos Comerciais", ""), 535, Gx_line+57, 668, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total  (EUR)", ""), 535, Gx_line+143, 605, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(35, Gx_line+21, 317, Gx_line+104, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(41, Gx_line+27, 312, Gx_line+69, 1, 0, 0, 0, 1, 155, 155, 155, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quadro Resumo do I.V.A.", ""), 111, Gx_line+31, 255, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Incidência", ""), 120, Gx_line+46, 179, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 51, Gx_line+46, 78, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 250, Gx_line+46, 279, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81FacBasImp, "ZZ,ZZZ,ZZ9.99")), 101, Gx_line+75, 197, Gx_line+92, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 217, Gx_line+75, 313, Gx_line+92, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("%", 71, Gx_line+76, 83, Gx_line+92, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Documento Processado por Computador", ""), 35, Gx_line+0, 231, Gx_line+13, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68FacImpTot, "ZZ,ZZZ,ZZ9.99")), 693, Gx_line+33, 789, Gx_line+50, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV110FacImpGen, "ZZ,ZZZ,ZZ9.99")), 693, Gx_line+57, 789, Gx_line+74, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81FacBasImp, "ZZ,ZZZ,ZZ9.99")), 693, Gx_line+81, 789, Gx_line+98, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71FacTot, "ZZ,ZZZ,ZZ9.99")), 693, Gx_line+143, 789, Gx_line+160, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61DesPago, "")), 73, Gx_line+168, 230, Gx_line+185, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV37Vencim[1-1], "99/99/99"), 327, Gx_line+168, 378, Gx_line+185, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Condição Pagamento", ""), 61, Gx_line+143, 188, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data de Vencimento", ""), 300, Gx_line+146, 419, Gx_line+162, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Sub Total", ""), 535, Gx_line+81, 589, Gx_line+97, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor do I.V.A.", ""), 535, Gx_line+106, 611, Gx_line+122, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 693, Gx_line+106, 789, Gx_line+123, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112ContDsc, "")), 36, Gx_line+201, 182, Gx_line+216, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VILAR - S.JOÃO das CALDAS AP.90 CALDAS de VIZELA CODEX", ""), 246, Gx_line+202, 600, Gx_line+216, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(36, Gx_line+188, 793, Gx_line+188, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+217) ;
               }
               else
               {
                  getPrinter().GxDrawRect(527, Gx_line+27, 683, Gx_line+161, 1, 0, 0, 0, 1, 155, 155, 155, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(508, Gx_line+21, 793, Gx_line+170, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(36, Gx_line+16, 793, Gx_line+16, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mercadoria/Serviços", ""), 535, Gx_line+33, 652, Gx_line+49, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Descontos Comerciais", ""), 535, Gx_line+57, 668, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total  (EUR)", ""), 535, Gx_line+143, 605, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(35, Gx_line+21, 317, Gx_line+104, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(41, Gx_line+27, 312, Gx_line+69, 1, 0, 0, 0, 1, 155, 155, 155, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quadro Resumo do I.V.A.", ""), 111, Gx_line+31, 255, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Incidência", ""), 120, Gx_line+46, 179, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 51, Gx_line+46, 78, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 250, Gx_line+46, 279, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Documento Processado por Computador", ""), 41, Gx_line+0, 237, Gx_line+13, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61DesPago, "")), 78, Gx_line+168, 235, Gx_line+185, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV37Vencim[1-1], "99/99/99"), 332, Gx_line+168, 383, Gx_line+185, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Condição Pagamento", ""), 67, Gx_line+143, 194, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data de Vencimento", ""), 305, Gx_line+146, 424, Gx_line+162, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Sub Total", ""), 535, Gx_line+81, 589, Gx_line+97, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor do I.V.A.", ""), 535, Gx_line+106, 611, Gx_line+122, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "A TRANSPORTAR", ""), 514, Gx_line+197, 618, Gx_line+213, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49SumSig, "ZZ,ZZZ,ZZ9.99")), 693, Gx_line+197, 789, Gx_line+214, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112ContDsc, "")), 36, Gx_line+234, 182, Gx_line+249, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VILAR - S.JOÃO das CALDAS AP.90 CALDAS de VIZELA CODEX", ""), 253, Gx_line+235, 607, Gx_line+249, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(36, Gx_line+217, 793, Gx_line+217, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+251) ;
                  AV107FlagNoFin = (byte)(0) ;
               }
               AV49SumSig = DecimalUtil.doubleToDec(0) ;
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
               getPrinter().GxDrawRect(590, Gx_line+264, 782, Gx_line+288, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 393, Gx_line+167, 582, Gx_line+185, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 393, Gx_line+188, 607, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 393, Gx_line+210, 582, Gx_line+228, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 347, Gx_line+315, 392, Gx_line+332, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 596, Gx_line+315, 647, Gx_line+332, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 410, Gx_line+315, 515, Gx_line+332, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 661, Gx_line+315, 720, Gx_line+332, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 731, Gx_line+315, 776, Gx_line+332, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O. Serv", ""), 122, Gx_line+367, 164, Gx_line+383, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 238, Gx_line+367, 332, Gx_line+383, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "QT.Fact.", ""), 593, Gx_line+361, 640, Gx_line+377, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(36, Gx_line+358, 793, Gx_line+392, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 409, Gx_line+367, 431, Gx_line+383, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(188, Gx_line+358, 188, Gx_line+392, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(381, Gx_line+358, 381, Gx_line+392, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 461, Gx_line+367, 502, Gx_line+383, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(505, Gx_line+358, 505, Gx_line+392, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(457, Gx_line+358, 457, Gx_line+392, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Enc.", ""), 53, Gx_line+367, 89, Gx_line+383, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(96, Gx_line+358, 96, Gx_line+392, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 665, Gx_line+367, 699, Gx_line+383, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(647, Gx_line+358, 647, Gx_line+392, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(704, Gx_line+358, 704, Gx_line+392, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 735, Gx_line+367, 763, Gx_line+383, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TextoCopia, "")), 700, Gx_line+339, 779, Gx_line+355, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 414, Gx_line+268, 471, Gx_line+285, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factura", ""), 660, Gx_line+268, 711, Gx_line+285, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 607, Gx_line+295, 635, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 683, Gx_line+295, 698, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 740, Gx_line+295, 767, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(590, Gx_line+288, 590, Gx_line+335, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(780, Gx_line+285, 780, Gx_line+334, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(591, Gx_line+333, 782, Gx_line+333, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(653, Gx_line+288, 653, Gx_line+335, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(729, Gx_line+288, 729, Gx_line+335, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 361, Gx_line+295, 376, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Nº Contribuinte", ""), 414, Gx_line+295, 512, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Moeda", ""), 533, Gx_line+295, 573, Gx_line+311, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EUR", ""), 541, Gx_line+315, 569, Gx_line+331, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmo.(s) Sr.(s)", ""), 393, Gx_line+145, 478, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(591, Gx_line+311, 782, Gx_line+311, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(348, Gx_line+311, 593, Gx_line+311, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(346, Gx_line+264, 591, Gx_line+288, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(346, Gx_line+288, 346, Gx_line+335, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(346, Gx_line+333, 591, Gx_line+333, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(515, Gx_line+288, 515, Gx_line+335, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(403, Gx_line+288, 403, Gx_line+335, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(575, Gx_line+358, 575, Gx_line+392, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "QT.Ent.", ""), 520, Gx_line+361, 562, Gx_line+377, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(KG)", ""), 528, Gx_line+375, 553, Gx_line+390, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(KG)", ""), 604, Gx_line+375, 629, Gx_line+390, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+396) ;
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
      this.aP0[0] = pfacetx.this.A396EmprCod;
      this.aP1[0] = pfacetx.this.A430FacCod;
      this.aP2[0] = pfacetx.this.AV15ImpCod;
      this.aP3[0] = pfacetx.this.AV16ValEuro;
      this.aP4[0] = pfacetx.this.AV93TextoCopia;
      this.aP5[0] = pfacetx.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfacetx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV112ContDsc = "" ;
      AV49SumSig = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01EO2_A396EmprCod = new String[] {""} ;
      P01EO2_A430FacCod = new int[1] ;
      P01EO2_A437FacFpg = new String[] {""} ;
      P01EO2_A450FacPri = new String[] {""} ;
      P01EO2_A435FacEst = new byte[1] ;
      P01EO2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P01EO2_A252CliCod = new int[1] ;
      P01EO2_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_n8346FacRecI = new boolean[] {false} ;
      P01EO2_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_A443FacIVAPor = new byte[1] ;
      P01EO2_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO2_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A437FacFpg = "" ;
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
      P01EO3_A7209Colombia = new byte[1] ;
      P01EO3_n7209Colombia = new boolean[] {false} ;
      P01EO5_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      P01EO6_A278CliNif = new String[] {""} ;
      P01EO6_A295CliPob = new String[] {""} ;
      P01EO6_A260CliDom = new String[] {""} ;
      P01EO6_A279CliNom = new String[] {""} ;
      A278CliNif = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      AV79CliNif = "" ;
      AV23FpgCod = "" ;
      AV61DesPago = "" ;
      AV24FpgDsc = "" ;
      AV51CliPri = "" ;
      AV85FacFch = GXutil.nullDate() ;
      AV37Vencim = new java.util.Date[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV37Vencim[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      P01EO7_A396EmprCod = new String[] {""} ;
      P01EO7_A430FacCod = new int[1] ;
      P01EO7_A956FacVtoLin = new byte[1] ;
      P01EO7_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P01EO7_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV68FacImpTot = DecimalUtil.ZERO ;
      AV69FacImpPP = DecimalUtil.ZERO ;
      AV110FacImpGen = DecimalUtil.ZERO ;
      AV111FacDtoGen = DecimalUtil.ZERO ;
      AV70FacIvaImp = DecimalUtil.ZERO ;
      AV71FacTot = DecimalUtil.ZERO ;
      AV81FacBasImp = DecimalUtil.ZERO ;
      AV78TotFac = DecimalUtil.ZERO ;
      P01EO8_A396EmprCod = new String[] {""} ;
      P01EO8_A430FacCod = new int[1] ;
      P01EO8_A3397FacFasCod = new String[] {""} ;
      P01EO8_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO8_A1498FacDisNum = new String[] {""} ;
      P01EO8_A428FacAlbTip = new byte[1] ;
      P01EO8_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO8_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO8_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO8_A432FacDsc = new String[] {""} ;
      P01EO8_A1296FacBarPar = new String[] {""} ;
      P01EO8_A1295FacBarReo = new byte[1] ;
      P01EO8_A1294FacBarCod = new int[1] ;
      P01EO8_A252CliCod = new int[1] ;
      P01EO8_A427FacAlbCod = new long[1] ;
      P01EO8_A446FacLin = new int[1] ;
      A3397FacFasCod = "" ;
      A444FacKgs = DecimalUtil.ZERO ;
      A1498FacDisNum = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A1296FacBarPar = "" ;
      P01EO9_A396EmprCod = new String[] {""} ;
      P01EO9_A1243GuiRemCli = new int[1] ;
      P01EO9_A30AlbProCod = new long[1] ;
      P01EO9_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      AV105AlbProFch = GXutil.nullDate() ;
      AV95Last_hdr = "" ;
      AV88Hdr = "" ;
      AV106Hdri = "" ;
      AV97FacKgs = DecimalUtil.ZERO ;
      AV82BarSerDsc = "" ;
      AV65BarCodPar = "" ;
      AV94FacDisNum = "" ;
      AV67TotLin = DecimalUtil.ZERO ;
      AV91Precio = DecimalUtil.ZERO ;
      AV83BarColNom = "" ;
      AV103BarKgm = DecimalUtil.ZERO ;
      AV104BarMtr = DecimalUtil.ZERO ;
      AV102BarCodParL = "" ;
      AV96FasesDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV118Tab_dsc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV118Tab_dsc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV119Tab_imp = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV119Tab_imp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV120Tab_kgs = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV120Tab_kgs[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV121Tab_prec = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV121Tab_prec[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int11 = new byte[1] ;
      AV116Tab_Bon = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV116Tab_Bon[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV115Tab_Rec = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV115Tab_Rec[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV114FacBonLi = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV113FacRec = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      P01EO12_A396EmprCod = new String[] {""} ;
      P01EO12_A130BarCodPar = new String[] {""} ;
      P01EO12_A132BarCodReo = new byte[1] ;
      P01EO12_A129BarCod = new int[1] ;
      P01EO12_A1652BarSerDsc = new String[] {""} ;
      P01EO12_A135BarColNom = new String[] {""} ;
      P01EO12_A136BarColNum = new int[1] ;
      P01EO12_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EO12_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      P01EO13_A396EmprCod = new String[] {""} ;
      P01EO13_A497FpgCod = new String[] {""} ;
      P01EO13_A498FpgDsc = new String[] {""} ;
      P01EO13_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacetx__default(),
         new Object[] {
             new Object[] {
            P01EO2_A396EmprCod, P01EO2_A430FacCod, P01EO2_A437FacFpg, P01EO2_A450FacPri, P01EO2_A435FacEst, P01EO2_A436FacFch, P01EO2_A252CliCod, P01EO2_A11513FacRecIca, P01EO2_A8346FacRecI, P01EO2_n8346FacRecI,
            P01EO2_A7212FacRect, P01EO2_A453FacRECPor, P01EO2_A14224FacCostFac, P01EO2_A14223FacCostKgs, P01EO2_A14222FacCostMts, P01EO2_A443FacIVAPor, P01EO2_A433FacDtoGen, P01EO2_A434FacDtoPP, P01EO2_A14219FacEnergia
            }
            , new Object[] {
            P01EO3_A7209Colombia, P01EO3_n7209Colombia
            }
            , new Object[] {
            P01EO5_A3918FacImpTot1
            }
            , new Object[] {
            P01EO6_A278CliNif, P01EO6_A295CliPob, P01EO6_A260CliDom, P01EO6_A279CliNom
            }
            , new Object[] {
            P01EO7_A396EmprCod, P01EO7_A430FacCod, P01EO7_A956FacVtoLin, P01EO7_A957FacVtoFch, P01EO7_n957FacVtoFch
            }
            , new Object[] {
            P01EO8_A396EmprCod, P01EO8_A430FacCod, P01EO8_A3397FacFasCod, P01EO8_A444FacKgs, P01EO8_A1498FacDisNum, P01EO8_A428FacAlbTip, P01EO8_A448FacPreKgs, P01EO8_A449FacPreMts, P01EO8_A447FacMts, P01EO8_A432FacDsc,
            P01EO8_A1296FacBarPar, P01EO8_A1295FacBarReo, P01EO8_A1294FacBarCod, P01EO8_A252CliCod, P01EO8_A427FacAlbCod, P01EO8_A446FacLin
            }
            , new Object[] {
            P01EO9_A396EmprCod, P01EO9_A1243GuiRemCli, P01EO9_A30AlbProCod, P01EO9_A34AlbProfch
            }
            , new Object[] {
            }
            , new Object[] {
            P01EO12_A396EmprCod, P01EO12_A130BarCodPar, P01EO12_A132BarCodReo, P01EO12_A129BarCod, P01EO12_A1652BarSerDsc, P01EO12_A135BarColNom, P01EO12_A136BarColNum, P01EO12_A166BarKgm, P01EO12_A184BarMtr
            }
            , new Object[] {
            P01EO13_A396EmprCod, P01EO13_A497FpgCod, P01EO13_A498FpgDsc, P01EO13_n498FpgDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV62CtrlPag ;
   private byte AV80NumLin ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV58FlagPag ;
   private byte AV92Paso ;
   private byte A956FacVtoLin ;
   private byte AV109FacIvaPor ;
   private byte AV107FlagNoFin ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private byte AV64BarCodReo ;
   private byte AV101BarCodReoL ;
   private byte GXv_int5[] ;
   private byte AV117i ;
   private byte GXv_int11[] ;
   private byte A132BarCodReo ;
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
   private int A1243GuiRemCli ;
   private int AV63BarCod ;
   private int AV84BarColNum ;
   private int AV100BarCodL ;
   private int GXv_int2[] ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private long A427FacAlbCod ;
   private long A30AlbProCod ;
   private long AV32FacAlbCod ;
   private long GXv_int3[] ;
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
   private java.math.BigDecimal AV69FacImpPP ;
   private java.math.BigDecimal AV110FacImpGen ;
   private java.math.BigDecimal AV111FacDtoGen ;
   private java.math.BigDecimal AV70FacIvaImp ;
   private java.math.BigDecimal AV71FacTot ;
   private java.math.BigDecimal AV81FacBasImp ;
   private java.math.BigDecimal AV78TotFac ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal AV97FacKgs ;
   private java.math.BigDecimal AV67TotLin ;
   private java.math.BigDecimal AV91Precio ;
   private java.math.BigDecimal AV103BarKgm ;
   private java.math.BigDecimal AV104BarMtr ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV119Tab_imp[] ;
   private java.math.BigDecimal AV120Tab_kgs[] ;
   private java.math.BigDecimal AV121Tab_prec[] ;
   private java.math.BigDecimal AV116Tab_Bon[] ;
   private java.math.BigDecimal AV115Tab_Rec[] ;
   private java.math.BigDecimal AV114FacBonLi ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal AV113FacRec ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV93TextoCopia ;
   private String Gx_out ;
   private String AV112ContDsc ;
   private String scmdbuf ;
   private String A437FacFpg ;
   private String A450FacPri ;
   private String A278CliNif ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String AV79CliNif ;
   private String AV23FpgCod ;
   private String AV61DesPago ;
   private String AV24FpgDsc ;
   private String AV51CliPri ;
   private String A3397FacFasCod ;
   private String A1498FacDisNum ;
   private String A432FacDsc ;
   private String A1296FacBarPar ;
   private String AV95Last_hdr ;
   private String AV88Hdr ;
   private String AV106Hdri ;
   private String AV82BarSerDsc ;
   private String AV65BarCodPar ;
   private String AV94FacDisNum ;
   private String AV83BarColNom ;
   private String AV102BarCodParL ;
   private String AV96FasesDsc ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String AV118Tab_dsc[] ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV85FacFch ;
   private java.util.Date AV37Vencim[] ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV105AlbProFch ;
   private boolean GxHdr2 ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean brk1EO5 ;
   private boolean n498FpgDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01EO2_A396EmprCod ;
   private int[] P01EO2_A430FacCod ;
   private String[] P01EO2_A437FacFpg ;
   private String[] P01EO2_A450FacPri ;
   private byte[] P01EO2_A435FacEst ;
   private java.util.Date[] P01EO2_A436FacFch ;
   private int[] P01EO2_A252CliCod ;
   private java.math.BigDecimal[] P01EO2_A11513FacRecIca ;
   private java.math.BigDecimal[] P01EO2_A8346FacRecI ;
   private boolean[] P01EO2_n8346FacRecI ;
   private java.math.BigDecimal[] P01EO2_A7212FacRect ;
   private java.math.BigDecimal[] P01EO2_A453FacRECPor ;
   private java.math.BigDecimal[] P01EO2_A14224FacCostFac ;
   private java.math.BigDecimal[] P01EO2_A14223FacCostKgs ;
   private java.math.BigDecimal[] P01EO2_A14222FacCostMts ;
   private byte[] P01EO2_A443FacIVAPor ;
   private java.math.BigDecimal[] P01EO2_A433FacDtoGen ;
   private java.math.BigDecimal[] P01EO2_A434FacDtoPP ;
   private java.math.BigDecimal[] P01EO2_A14219FacEnergia ;
   private byte[] P01EO3_A7209Colombia ;
   private boolean[] P01EO3_n7209Colombia ;
   private java.math.BigDecimal[] P01EO5_A3918FacImpTot1 ;
   private String[] P01EO6_A278CliNif ;
   private String[] P01EO6_A295CliPob ;
   private String[] P01EO6_A260CliDom ;
   private String[] P01EO6_A279CliNom ;
   private String[] P01EO7_A396EmprCod ;
   private int[] P01EO7_A430FacCod ;
   private byte[] P01EO7_A956FacVtoLin ;
   private java.util.Date[] P01EO7_A957FacVtoFch ;
   private boolean[] P01EO7_n957FacVtoFch ;
   private String[] P01EO8_A396EmprCod ;
   private int[] P01EO8_A430FacCod ;
   private String[] P01EO8_A3397FacFasCod ;
   private java.math.BigDecimal[] P01EO8_A444FacKgs ;
   private String[] P01EO8_A1498FacDisNum ;
   private byte[] P01EO8_A428FacAlbTip ;
   private java.math.BigDecimal[] P01EO8_A448FacPreKgs ;
   private java.math.BigDecimal[] P01EO8_A449FacPreMts ;
   private java.math.BigDecimal[] P01EO8_A447FacMts ;
   private String[] P01EO8_A432FacDsc ;
   private String[] P01EO8_A1296FacBarPar ;
   private byte[] P01EO8_A1295FacBarReo ;
   private int[] P01EO8_A1294FacBarCod ;
   private int[] P01EO8_A252CliCod ;
   private long[] P01EO8_A427FacAlbCod ;
   private int[] P01EO8_A446FacLin ;
   private String[] P01EO9_A396EmprCod ;
   private int[] P01EO9_A1243GuiRemCli ;
   private long[] P01EO9_A30AlbProCod ;
   private java.util.Date[] P01EO9_A34AlbProfch ;
   private String[] P01EO12_A396EmprCod ;
   private String[] P01EO12_A130BarCodPar ;
   private byte[] P01EO12_A132BarCodReo ;
   private int[] P01EO12_A129BarCod ;
   private String[] P01EO12_A1652BarSerDsc ;
   private String[] P01EO12_A135BarColNom ;
   private int[] P01EO12_A136BarColNum ;
   private java.math.BigDecimal[] P01EO12_A166BarKgm ;
   private java.math.BigDecimal[] P01EO12_A184BarMtr ;
   private String[] P01EO13_A396EmprCod ;
   private String[] P01EO13_A497FpgCod ;
   private String[] P01EO13_A498FpgDsc ;
   private boolean[] P01EO13_n498FpgDsc ;
}

final  class pfacetx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01EO2", "SELECT EmprCod, FacCod, FacFpg, FacPri, FacEst, FacFch, CliCod, FacRecIca, FacRecI, FacRect, FacRECPor, FacCostFac, FacCostKgs, FacCostMts, FacIVAPor, FacDtoGen, FacDtoPP, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EO3", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EO5", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EO6", "SELECT CliNif, CliPob, CliDom, CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EO7", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01EO8", "SELECT T1.EmprCod, T1.FacCod, T1.FacFasCod, T1.FacKgs, T1.FacDisNum, T1.FacAlbTip, T1.FacPreKgs, T1.FacPreMts, T1.FacMts, T1.FacDsc, T1.FacBarPar, T1.FacBarReo, T1.FacBarCod, T2.CliCod, T1.FacAlbCod, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE (T1.EmprCod = ?) AND (T1.FacCod = ?) ORDER BY T1.FacAlbCod, T1.FacBarCod, T1.FacBarReo, T1.FacBarPar, T1.FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01EO9", "SELECT EmprCod, GuiRemCli, AlbProCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and GuiRemCli = ? and AlbProCod = ? ORDER BY EmprCod, GuiRemCli, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01EO10", "UPDATE TXPCFAVEN SET FacEst=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P01EO12", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01EO13", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 34);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
      }
   }

}

