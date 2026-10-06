package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pwfacm21 extends GXReport
{
   public pwfacm21( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwfacm21.class ), "" );
   }

   public pwfacm21( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String aP3 ,
                        java.math.BigDecimal aP4 ,
                        String aP5 ,
                        String aP6 ,
                        byte aP7 ,
                        byte aP8 ,
                        byte aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String aP3 ,
                             java.math.BigDecimal aP4 ,
                             String aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             byte aP9 )
   {
      pwfacm21.this.AV139ReportInPut = aP0;
      pwfacm21.this.A396EmprCod = aP1;
      pwfacm21.this.A430FacCod = aP2;
      pwfacm21.this.AV107ImpCod = aP3;
      pwfacm21.this.AV168ValEuro = aP4;
      pwfacm21.this.AV156TextoCopia = aP5;
      pwfacm21.this.Gx_out = aP6;
      pwfacm21.this.AV67F_header = aP7;
      pwfacm21.this.AV9Agr_Fases = aP8;
      pwfacm21.this.AV172VerSumTot = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = -3 ;
      M_bot = 18 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV139ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11390, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*18)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV52ContDsc20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACMOD", ""), GXv_char2) ;
         pwfacm21.this.GXt_char1 = GXv_char2[0] ;
         AV52ContDsc20 = GXt_char1 ;
         GXt_char1 = AV96FirmaD ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDIG", "") ;
         GXv_char4[0] = GXt_char1 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         pwfacm21.this.A396EmprCod = GXv_char2[0] ;
         pwfacm21.this.GXt_char1 = GXv_char4[0] ;
         AV96FirmaD = GXt_char1 ;
         GXt_int5 = AV66existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pwfacm21.this.GXt_int5 = GXv_int6[0] ;
         AV66existefirmad = GXt_int5 ;
         GXt_int5 = AV99flax2 ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FLAX2", ""), GXv_int6) ;
         pwfacm21.this.GXt_int5 = GXv_int6[0] ;
         AV99flax2 = GXt_int5 ;
         AV51Contdsc = GXutil.substring( AV52ContDsc20, 1, 14) ;
         /* Using cursor P0APS2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0APS2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0APS2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0APS2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0APS2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0APS2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0APS2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0APS2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0APS2_n8336EmpItm3[0] ;
            A395EmprCif = P0APS2_A395EmprCif[0] ;
            n395EmprCif = P0APS2_n395EmprCif[0] ;
            AV151Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV152Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV65EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV119Linea_s = (byte)(35) ;
         GxHdr3 = true ;
         /* Using cursor P0APS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A450FacPri = P0APS3_A450FacPri[0] ;
            A14230FacIDATe = P0APS3_A14230FacIDATe[0] ;
            A436FacFch = P0APS3_A436FacFch[0] ;
            A9605FacFirma = P0APS3_A9605FacFirma[0] ;
            A14236FacSerAT = P0APS3_A14236FacSerAT[0] ;
            A14237FacTipAT = P0APS3_A14237FacTipAT[0] ;
            A437FacFpg = P0APS3_A437FacFpg[0] ;
            A435FacEst = P0APS3_A435FacEst[0] ;
            A9643FacLiq1 = P0APS3_A9643FacLiq1[0] ;
            A9644FacLiq2 = P0APS3_A9644FacLiq2[0] ;
            A9645FacIva1 = P0APS3_A9645FacIva1[0] ;
            A9646FacTot1 = P0APS3_A9646FacTot1[0] ;
            A252CliCod = P0APS3_A252CliCod[0] ;
            A11513FacRecIca = P0APS3_A11513FacRecIca[0] ;
            A8346FacRecI = P0APS3_A8346FacRecI[0] ;
            n8346FacRecI = P0APS3_n8346FacRecI[0] ;
            A7212FacRect = P0APS3_A7212FacRect[0] ;
            A453FacRECPor = P0APS3_A453FacRECPor[0] ;
            A14224FacCostFac = P0APS3_A14224FacCostFac[0] ;
            A14223FacCostKgs = P0APS3_A14223FacCostKgs[0] ;
            A14222FacCostMts = P0APS3_A14222FacCostMts[0] ;
            A434FacDtoPP = P0APS3_A434FacDtoPP[0] ;
            A433FacDtoGen = P0APS3_A433FacDtoGen[0] ;
            A443FacIVAPor = P0APS3_A443FacIVAPor[0] ;
            A14219FacEnergia = P0APS3_A14219FacEnergia[0] ;
            /* Using cursor P0APS4 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A7209Colombia = P0APS4_A7209Colombia[0] ;
            n7209Colombia = P0APS4_n7209Colombia[0] ;
            /* Using cursor P0APS6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(3) != 101) )
            {
               A3918FacImpTot1 = P0APS6_A3918FacImpTot1[0] ;
            }
            else
            {
               A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
            }
            A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
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
            /* Using cursor P0APS7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            A278CliNif = P0APS7_A278CliNif[0] ;
            A13236CliFacMtsP = P0APS7_A13236CliFacMtsP[0] ;
            A13012CliImpReop = P0APS7_A13012CliImpReop[0] ;
            A858ZonGeoCod = P0APS7_A858ZonGeoCod[0] ;
            A4828CliCp2 = P0APS7_A4828CliCp2[0] ;
            A256CliCp = P0APS7_A256CliCp[0] ;
            A295CliPob = P0APS7_A295CliPob[0] ;
            A279CliNom = P0APS7_A279CliNom[0] ;
            A260CliDom = P0APS7_A260CliDom[0] ;
            AV43CliNif = GXutil.trim( A278CliNif) ;
            if ( GXutil.strcmp(A450FacPri, "1") == 0 )
            {
               AV50codValidacaoSerie = A14230FacIDATe ;
               AV17atcud = ((GXutil.strcmp("", AV50codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV50codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A430FacCod, 8, 0))) ;
            }
            AV175year = (short)(GXutil.year( A436FacFch)) ;
            AV55day = (byte)(GXutil.day( A436FacFch)) ;
            AV123month = (byte)(GXutil.month( A436FacFch)) ;
            AV92fechafra = GXutil.trim( GXutil.str( AV175year, 4, 0)) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV123month, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV55day, 2, 0)), (short)(2), "0") ;
            AV43CliNif = GXutil.trim( A278CliNif) ;
            AV95Firma4dig = GXutil.substring( A9605FacFirma, 1, 1) + GXutil.substring( A9605FacFirma, 11, 1) + GXutil.substring( A9605FacFirma, 21, 1) + GXutil.substring( A9605FacFirma, 31, 1) ;
            AV127numeroFra = GXutil.trim( A14237FacTipAT) + " " + GXutil.trim( A14236FacSerAT) + "/" + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) ;
            AV157TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV65EmprCif) + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A278CliNif) + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "D:", "") + httpContext.getMessage( "FT", "") + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV16anyo = (short)(GXutil.year( A436FacFch)) ;
            AV122Mes = (byte)(GXutil.month( A436FacFch)) ;
            AV58dia = (byte)(GXutil.day( A436FacFch)) ;
            AV157TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV16anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV122Mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV58dia, 2, 0)), (short)(2), "0") + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "G:", "") + GXutil.trim( A14237FacTipAT) + " " + GXutil.trim( A14236FacSerAT) + "/" + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "H:", "") + GXutil.trim( A14230FacIDATe) + "-" + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "I1:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "I7:", "") + GXutil.trim( GXutil.str( A441FacImpTot, 13, 2)) + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "I8:", "") + GXutil.trim( GXutil.str( A442FacIVAImp, 11, 2)) + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "N:", "") + GXutil.trim( GXutil.str( A442FacIVAImp, 11, 2)) + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "O:", "") + GXutil.trim( GXutil.str( A455FacTot, 13, 2)) + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "Q:", "") + AV95Firma4dig + "*" ;
            AV157TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV96FirmaD) ;
            AV178Dpi = (short)(300) ;
            AV177Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV179Pixel = (short)(DecimalUtil.decToDouble(AV177Centimetos.multiply(DecimalUtil.doubleToDec(AV178Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char1 = AV8Url ;
            GXv_char4[0] = GXt_char1 ;
            new app.qr_obtener(remoteHandle, context).execute( AV157TextoGenerar, AV179Pixel, AV179Pixel, GXv_char4) ;
            pwfacm21.this.GXt_char1 = GXv_char4[0] ;
            AV8Url = GXt_char1 ;
            AV106Imagen = AV8Url ;
            AV193Imagen_GXI = GXDbFile.pathToUrl( AV8Url, context.getHttpContext()) ;
            AV41CliFacMtsP = A13236CliFacMtsP ;
            AV43CliNif = A278CliNif ;
            AV101FpgCod = A437FacFpg ;
            AV42CliImpReop = A13012CliImpReop ;
            /* Execute user subroutine: 'FORPAG' */
            S151 ();
            if ( returnInSub )
            {
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
            AV57DesPago = GXutil.substring( AV102FpgDsc, 1, 30) ;
            AV98FlagPag = (byte)(0) ;
            AV38CliCod = A252CliCod ;
            AV48CliPri = A450FacPri ;
            AV78FacFch = A436FacFch ;
            AV73FacCod = A430FacCod ;
            AV176ZONGEOCOD = A858ZonGeoCod ;
            if ( AV176ZONGEOCOD == 999 )
            {
               AV154Texto_i = httpContext.getMessage( "ISENTO IVA AO ABRIGO DA ALINEA a) DO ARTIGO 14 DO RITI", "") ;
            }
            else
            {
               AV154Texto_i = "" ;
            }
            AV129Paso = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV171Vencim[GX_I-1] = GXutil.nullDate() ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P0APS8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A956FacVtoLin = P0APS8_A956FacVtoLin[0] ;
               A957FacVtoFch = P0APS8_A957FacVtoFch[0] ;
               n957FacVtoFch = P0APS8_n957FacVtoFch[0] ;
               AV129Paso = (byte)(AV129Paso+1) ;
               AV171Vencim[AV129Paso-1] = A957FacVtoFch ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV175year = (short)(GXutil.year( AV171Vencim[1-1])) ;
            AV55day = (byte)(GXutil.day( AV171Vencim[1-1])) ;
            AV123month = (byte)(GXutil.month( AV171Vencim[1-1])) ;
            AV93fechaVTO = ((AV129Paso==0) ? " " : GXutil.trim( GXutil.str( AV175year, 4, 0))+"/"+GXutil.padl( GXutil.trim( GXutil.str( AV123month, 2, 0)), (short)(2), "0")+"/"+GXutil.padl( GXutil.trim( GXutil.str( AV55day, 2, 0)), (short)(2), "0")) ;
            AV77Facdtopp = A434FacDtoPP ;
            AV81FacImpTot = A441FacImpTot ;
            AV80FacImpPP = A440FacImpPP ;
            AV79FacImpGen = A439FacImpGen ;
            AV76FacDtoGen = A433FacDtoGen ;
            AV82FacIvaImp = A442FacIVAImp ;
            AV88FacTot = A455FacTot ;
            AV71FacBasImp = A429FacBasImp ;
            AV83FacIvaPor = A443FacIVAPor ;
            AV112ImpPenDto = DecimalUtil.doubleToDec(0) ;
            AV158TotFac = GXutil.roundDecimal( (A455FacTot.multiply(AV168ValEuro)), 0) ;
            AV39Clicp_t = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            AV53Cp_pob = GXutil.trim( AV39Clicp_t) + " " + GXutil.trim( A295CliPob) ;
            AV153Texto_fd = " " ;
            if ( GXutil.strcmp(A9605FacFirma, " ") != 0 )
            {
               AV95Firma4dig = GXutil.substring( A9605FacFirma, 1, 1) + GXutil.substring( A9605FacFirma, 11, 1) + GXutil.substring( A9605FacFirma, 21, 1) + GXutil.substring( A9605FacFirma, 31, 1) ;
               AV153Texto_fd = AV95Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV96FirmaD) + httpContext.getMessage( "/AT", "") ;
            }
            AV128NumLin = (byte)(0) ;
            AV97FlagNoFin = (byte)(0) ;
            /* Using cursor P0APS9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               brkAPS6 = false ;
               A427FacAlbCod = P0APS9_A427FacAlbCod[0] ;
               A3397FacFasCod = P0APS9_A3397FacFasCod[0] ;
               A444FacKgs = P0APS9_A444FacKgs[0] ;
               A3878FacColNom = P0APS9_A3878FacColNom[0] ;
               A3879FocColNum = P0APS9_A3879FocColNum[0] ;
               A1498FacDisNum = P0APS9_A1498FacDisNum[0] ;
               A428FacAlbTip = P0APS9_A428FacAlbTip[0] ;
               A454FacSer = P0APS9_A454FacSer[0] ;
               A3898FacPreKgsA = P0APS9_A3898FacPreKgsA[0] ;
               A448FacPreKgs = P0APS9_A448FacPreKgs[0] ;
               A5050FacBonLi = P0APS9_A5050FacBonLi[0] ;
               A451FacRec = P0APS9_A451FacRec[0] ;
               A5353FacImpMan = P0APS9_A5353FacImpMan[0] ;
               A449FacPreMts = P0APS9_A449FacPreMts[0] ;
               A447FacMts = P0APS9_A447FacMts[0] ;
               A12197FacUnds = P0APS9_A12197FacUnds[0] ;
               A12198FacPreUnd = P0APS9_A12198FacPreUnd[0] ;
               A432FacDsc = P0APS9_A432FacDsc[0] ;
               A1296FacBarPar = P0APS9_A1296FacBarPar[0] ;
               A1295FacBarReo = P0APS9_A1295FacBarReo[0] ;
               A1294FacBarCod = P0APS9_A1294FacBarCod[0] ;
               A446FacLin = P0APS9_A446FacLin[0] ;
               AV69FacAlbCod = A427FacAlbCod ;
               AV70FacAlbTip = A428FacAlbTip ;
               /* Execute user subroutine: 'FECHALB' */
               S161 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
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
               if ( AV128NumLin > AV119Linea_s )
               {
                  AV97FlagNoFin = (byte)(1) ;
                  AV128NumLin = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               hAPS0( false, 18) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "G.R.nº", ""), 174, Gx_line+1, 209, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9")), 240, Gx_line+1, 314, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 320, Gx_line+1, 336, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV14AlbProFch, "99/99/99"), 343, Gx_line+1, 394, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV128NumLin = (byte)(AV128NumLin+1) ;
               AV69FacAlbCod = A427FacAlbCod ;
               AV117Last_hdr = "" ;
               while ( (pr_default.getStatus(6) != 101) && ( P0APS9_A427FacAlbCod[0] == A427FacAlbCod ) )
               {
                  brkAPS6 = false ;
                  A3397FacFasCod = P0APS9_A3397FacFasCod[0] ;
                  A444FacKgs = P0APS9_A444FacKgs[0] ;
                  A3878FacColNom = P0APS9_A3878FacColNom[0] ;
                  A3879FocColNum = P0APS9_A3879FocColNum[0] ;
                  A1498FacDisNum = P0APS9_A1498FacDisNum[0] ;
                  A428FacAlbTip = P0APS9_A428FacAlbTip[0] ;
                  A454FacSer = P0APS9_A454FacSer[0] ;
                  A3898FacPreKgsA = P0APS9_A3898FacPreKgsA[0] ;
                  A448FacPreKgs = P0APS9_A448FacPreKgs[0] ;
                  A5050FacBonLi = P0APS9_A5050FacBonLi[0] ;
                  A451FacRec = P0APS9_A451FacRec[0] ;
                  A5353FacImpMan = P0APS9_A5353FacImpMan[0] ;
                  A449FacPreMts = P0APS9_A449FacPreMts[0] ;
                  A447FacMts = P0APS9_A447FacMts[0] ;
                  A12197FacUnds = P0APS9_A12197FacUnds[0] ;
                  A12198FacPreUnd = P0APS9_A12198FacPreUnd[0] ;
                  A432FacDsc = P0APS9_A432FacDsc[0] ;
                  A1296FacBarPar = P0APS9_A1296FacBarPar[0] ;
                  A1295FacBarReo = P0APS9_A1295FacBarReo[0] ;
                  A1294FacBarCod = P0APS9_A1294FacBarCod[0] ;
                  A446FacLin = P0APS9_A446FacLin[0] ;
                  if ( GXutil.strcmp(P0APS9_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P0APS9_A430FacCod[0] == A430FacCod )
                     {
                        if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
                        {
                           AV103Hdr = GXutil.str( A1294FacBarCod, 8, 0) + "-" + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                           AV104Hdri = ((GXutil.strcmp(AV42CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A1294FacBarCod, 8, 0) : ((A1295FacBarReo==0) ? GXutil.str( A1294FacBarCod, 8, 0) : GXutil.str( A1294FacBarCod, 8, 0)+" "+GXutil.str( A1295FacBarReo, 1, 0))) ;
                           AV84FacKgs = A444FacKgs ;
                           if ( ( GXutil.strcmp(AV103Hdr, AV117Last_hdr) != 0 ) && ! (GXutil.strcmp("", AV117Last_hdr)==0) )
                           {
                              /* Execute user subroutine: 'LINEASFAS' */
                              S111 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(6);
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
                              /* Execute user subroutine: 'LINEASFAS2' */
                              S121 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(6);
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
                              if ( AV35BarPrioridad == 1 )
                              {
                                 if ( AV128NumLin > AV119Linea_s )
                                 {
                                    AV97FlagNoFin = (byte)(1) ;
                                    AV128NumLin = (byte)(1) ;
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                 }
                                 if ( (0==AV99flax2) )
                                 {
                                    hAPS0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "EUROPEAN FLAX® certified – certificate nº BVFR7338110", ""), 159, Gx_line+0, 493, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                 }
                                 else
                                 {
                                    hAPS0( false, 22) ;
                                    getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "efb75222-fef4-40ba-b66f-a0dbfd02f4ba", "", context.getHttpContext().getTheme( )), 159, Gx_line+2, 569, Gx_line+21) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+22) ;
                                 }
                              }
                           }
                           AV36BarSerDsc = " " ;
                           AV24BarCod = A1294FacBarCod ;
                           AV28BarCodReo = A1295FacBarReo ;
                           AV26BarCodPar = A1296FacBarPar ;
                           /* Execute user subroutine: 'BARCAD' */
                           S131 ();
                           if ( returnInSub )
                           {
                              pr_default.close(6);
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
                           AV30BarColNom = ((GXutil.strcmp("", A3878FacColNom)==0) ? AV30BarColNom : A3878FacColNom) ;
                           AV31BarColNum = ((0==A3879FocColNum) ? AV31BarColNum : A3879FocColNum) ;
                           AV74FacDisNum = GXutil.substring( A1498FacDisNum, 1, 6) ;
                           if ( A428FacAlbTip == 1 )
                           {
                              if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) != 0 )
                              {
                                 AV161TotLin2 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                                 AV160TotLin = GXutil.roundDecimal( AV161TotLin2, 2) ;
                                 AV135Precio = A448FacPreKgs ;
                                 AV64Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                 AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (A444FacKgs.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                 if ( A5353FacImpMan.doubleValue() > 0 )
                                 {
                                    AV160TotLin = A5353FacImpMan ;
                                    AV135Precio = DecimalUtil.doubleToDec(0) ;
                                 }
                                 if ( AV160TotLin.doubleValue() == 0 )
                                 {
                                    AV135Precio = DecimalUtil.doubleToDec(0) ;
                                    AV64Dto = DecimalUtil.doubleToDec(0) ;
                                 }
                                 if ( ( GXutil.strcmp(AV41CliFacMtsP, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(AV187Bartipdis, "L") == 0 ) )
                                 {
                                 }
                                 else
                                 {
                                    if ( AV128NumLin > AV119Linea_s )
                                    {
                                       AV97FlagNoFin = (byte)(1) ;
                                       AV128NumLin = (byte)(1) ;
                                       /* Eject command */
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(P_lines+1) ;
                                    }
                                    AV141SumSig = AV141SumSig.add(AV160TotLin) ;
                                    hAPS0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1498FacDisNum, "")), 18, Gx_line+0, 102, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Hdri, "")), 80, Gx_line+0, 138, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36BarSerDsc, "")), 161, Gx_line+0, 297, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30BarColNom, "")), 350, Gx_line+0, 423, Gx_line+16, 1, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarColNum), "ZZZZZ9")), 438, Gx_line+0, 477, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 539, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32BarKgm, "ZZZZZ9.99")), 480, Gx_line+0, 537, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "kg", ""), 596, Gx_line+0, 611, Gx_line+14, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                    AV160TotLin = DecimalUtil.doubleToDec(0) ;
                                    AV128NumLin = (byte)(AV128NumLin+1) ;
                                    if ( GXutil.strcmp(AV63Dsc_Idtx, " ") != 0 )
                                    {
                                       if ( AV128NumLin > AV119Linea_s )
                                       {
                                          AV97FlagNoFin = (byte)(1) ;
                                          AV128NumLin = (byte)(1) ;
                                          /* Eject command */
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(P_lines+1) ;
                                       }
                                       hAPS0( false, 18) ;
                                       getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Dsc_Idtx, "")), 46, Gx_line+2, 481, Gx_line+18, 0+16, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+18) ;
                                       AV128NumLin = (byte)(AV128NumLin+1) ;
                                    }
                                 }
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV161TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                                    AV160TotLin = GXutil.roundDecimal( AV161TotLin2, 2) ;
                                    AV135Precio = A449FacPreMts ;
                                    AV64Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                    AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (A447FacMts.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                    if ( A5353FacImpMan.doubleValue() > 0 )
                                    {
                                       AV160TotLin = A5353FacImpMan ;
                                       AV135Precio = DecimalUtil.doubleToDec(0) ;
                                    }
                                    if ( AV160TotLin.doubleValue() == 0 )
                                    {
                                       AV135Precio = DecimalUtil.doubleToDec(0) ;
                                       AV64Dto = DecimalUtil.doubleToDec(0) ;
                                    }
                                    if ( AV128NumLin > AV119Linea_s )
                                    {
                                       AV97FlagNoFin = (byte)(1) ;
                                       AV128NumLin = (byte)(1) ;
                                       /* Eject command */
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(P_lines+1) ;
                                    }
                                    AV141SumSig = AV141SumSig.add(AV160TotLin) ;
                                    hAPS0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 539, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33BarMtr, "ZZZZZ9.99")), 480, Gx_line+0, 537, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 594, Gx_line+0, 610, Gx_line+15, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                    AV160TotLin = DecimalUtil.doubleToDec(0) ;
                                    AV128NumLin = (byte)(AV128NumLin+1) ;
                                 }
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV161TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                                    AV160TotLin = GXutil.roundDecimal( AV161TotLin2, 2) ;
                                    AV135Precio = A449FacPreMts ;
                                    AV64Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                    AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (A447FacMts.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                    if ( A5353FacImpMan.doubleValue() > 0 )
                                    {
                                       AV160TotLin = A5353FacImpMan ;
                                       AV135Precio = DecimalUtil.doubleToDec(0) ;
                                    }
                                    if ( AV160TotLin.doubleValue() == 0 )
                                    {
                                       AV135Precio = DecimalUtil.doubleToDec(0) ;
                                       AV64Dto = DecimalUtil.doubleToDec(0) ;
                                    }
                                    if ( AV128NumLin > AV119Linea_s )
                                    {
                                       AV97FlagNoFin = (byte)(1) ;
                                       AV128NumLin = (byte)(1) ;
                                       /* Eject command */
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(P_lines+1) ;
                                    }
                                    AV141SumSig = AV141SumSig.add(AV160TotLin) ;
                                    hAPS0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 539, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36BarSerDsc, "")), 161, Gx_line+0, 297, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30BarColNom, "")), 350, Gx_line+0, 423, Gx_line+16, 1, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarColNum), "ZZZZZ9")), 438, Gx_line+0, 477, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33BarMtr, "ZZZZZ9.99")), 480, Gx_line+0, 537, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1498FacDisNum, "")), 18, Gx_line+0, 102, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Hdri, "")), 80, Gx_line+0, 138, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 595, Gx_line+0, 611, Gx_line+14, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                    AV160TotLin = DecimalUtil.doubleToDec(0) ;
                                    AV128NumLin = (byte)(AV128NumLin+1) ;
                                 }
                                 if ( ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) && ! (0==A12197FacUnds) ) || ( ( GXutil.strcmp(AV187Bartipdis, "L") == 0 ) && ( A12198FacPreUnd.doubleValue() == 0 ) && ! (0==A12197FacUnds) ) )
                                 {
                                    AV161TotLin2 = (DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd)) ;
                                    AV160TotLin = GXutil.roundDecimal( AV161TotLin2, 2) ;
                                    AV135Precio = A12198FacPreUnd ;
                                    AV64Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                    AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A12197FacUnds).multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                    if ( A5353FacImpMan.doubleValue() > 0 )
                                    {
                                       AV160TotLin = A5353FacImpMan ;
                                       AV135Precio = DecimalUtil.doubleToDec(0) ;
                                    }
                                    if ( AV160TotLin.doubleValue() == 0 )
                                    {
                                       AV135Precio = DecimalUtil.doubleToDec(0) ;
                                       AV64Dto = DecimalUtil.doubleToDec(0) ;
                                    }
                                    if ( AV128NumLin > AV119Linea_s )
                                    {
                                       AV97FlagNoFin = (byte)(1) ;
                                       AV128NumLin = (byte)(1) ;
                                       /* Eject command */
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(P_lines+1) ;
                                    }
                                    AV141SumSig = AV141SumSig.add(AV160TotLin) ;
                                    hAPS0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1498FacDisNum, "")), 17, Gx_line+0, 101, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36BarSerDsc, "")), 183, Gx_line+0, 319, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Hdri, "")), 108, Gx_line+0, 166, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 708, Gx_line+0, 772, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 675, Gx_line+0, 701, Gx_line+15, 2, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "un", ""), 595, Gx_line+0, 611, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12197FacUnds), "ZZZZZ9")), 557, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12197FacUnds), "ZZZZZ9")), 498, Gx_line+0, 537, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31BarColNum), "ZZZZZ9")), 442, Gx_line+0, 481, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30BarColNom, "")), 358, Gx_line+0, 431, Gx_line+16, 1, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                    AV160TotLin = DecimalUtil.doubleToDec(0) ;
                                    AV128NumLin = (byte)(AV128NumLin+1) ;
                                 }
                              }
                              if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) == 0 )
                              {
                                 AV161TotLin2 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                                 AV160TotLin = GXutil.roundDecimal( AV161TotLin2, 2) ;
                                 AV135Precio = A448FacPreKgs ;
                                 AV64Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                 AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (A444FacKgs.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                 AV84FacKgs = A444FacKgs ;
                                 if ( AV160TotLin.doubleValue() == 0 )
                                 {
                                    AV135Precio = DecimalUtil.doubleToDec(0) ;
                                    AV64Dto = DecimalUtil.doubleToDec(0) ;
                                 }
                                 if ( AV128NumLin > AV119Linea_s )
                                 {
                                    AV97FlagNoFin = (byte)(1) ;
                                    AV128NumLin = (byte)(1) ;
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                 }
                                 AV141SumSig = AV141SumSig.add(AV160TotLin) ;
                                 hAPS0( false, 16) ;
                                 getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 44, Gx_line+0, 512, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84FacKgs, "Z,ZZZ.99")), 545, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 601, Gx_line+0, 610, Gx_line+14, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+16) ;
                                 AV160TotLin = DecimalUtil.doubleToDec(0) ;
                                 AV128NumLin = (byte)(AV128NumLin+1) ;
                              }
                           }
                           if ( A428FacAlbTip == 2 )
                           {
                              AV161TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                              AV160TotLin = GXutil.roundDecimal( AV161TotLin2, 2) ;
                              AV135Precio = A449FacPreMts ;
                              AV64Dto = A451FacRec.subtract(A5050FacBonLi) ;
                              AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (A447FacMts.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                              if ( AV160TotLin.doubleValue() == 0 )
                              {
                                 AV135Precio = DecimalUtil.doubleToDec(0) ;
                                 AV64Dto = DecimalUtil.doubleToDec(0) ;
                              }
                              if ( AV128NumLin > AV119Linea_s )
                              {
                                 AV97FlagNoFin = (byte)(1) ;
                                 AV128NumLin = (byte)(1) ;
                                 /* Eject command */
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(P_lines+1) ;
                              }
                              AV141SumSig = AV141SumSig.add(AV160TotLin) ;
                              hAPS0( false, 16) ;
                              getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 44, Gx_line+0, 512, Gx_line+16, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 539, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+16) ;
                              AV160TotLin = DecimalUtil.doubleToDec(0) ;
                              AV128NumLin = (byte)(AV128NumLin+1) ;
                           }
                           AV117Last_hdr = AV103Hdr ;
                        }
                     }
                  }
                  brkAPS6 = true ;
                  pr_default.readNext(6);
               }
               /* Execute user subroutine: 'LINEASFAS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
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
               /* Execute user subroutine: 'LINEASFAS2' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
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
               if ( AV35BarPrioridad == 1 )
               {
                  if ( AV128NumLin > AV119Linea_s )
                  {
                     AV97FlagNoFin = (byte)(1) ;
                     AV128NumLin = (byte)(1) ;
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                  }
                  hAPS0( false, 16) ;
                  getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "EUROPEAN FLAX® certified – certificate nº BVFR7338110", ""), 159, Gx_line+0, 493, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
                  AV128NumLin = (byte)(AV128NumLin+1) ;
               }
               if ( ! brkAPS6 )
               {
                  brkAPS6 = true ;
                  pr_default.readNext(6);
               }
            }
            pr_default.close(6);
            if ( ( AV66existefirmad == 1 ) && (GXutil.strcmp("", A9605FacFirma)==0) )
            {
               if ( AV128NumLin > AV119Linea_s )
               {
                  AV97FlagNoFin = (byte)(1) ;
                  AV128NumLin = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               hAPS0( false, 31) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 183, Gx_line+0, 602, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
               AV128NumLin = (byte)(AV128NumLin+1) ;
            }
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            A9643FacLiq1 = AV81FacImpTot ;
            A9644FacLiq2 = GXutil.roundDecimal( AV22Aux4, 2) ;
            A9645FacIva1 = GXutil.roundDecimal( A9644FacLiq2.multiply(DecimalUtil.doubleToDec(AV83FacIvaPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            A9646FacTot1 = A9644FacLiq2.add(A9645FacIva1) ;
            /* Using cursor P0APS10 */
            pr_default.execute(7, new Object[] {Byte.valueOf(A435FacEst), A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A396EmprCod, Integer.valueOf(A430FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.close(2);
         pr_default.close(4);
         pr_default.close(3);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAPS0( true, 0) ;
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
      AV25BarCodL = (int)(GXutil.lval( GXutil.substring( AV117Last_hdr, 1, 8))) ;
      AV29BarCodReoL = (byte)(GXutil.lval( GXutil.substring( AV117Last_hdr, 10, 1))) ;
      AV27BarCodParL = GXutil.substring( AV117Last_hdr, 11, 1) ;
      AV89FasesDsc = "" ;
      if ( AV9Agr_Fases == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A430FacCod ;
         GXv_int8[0] = AV69FacAlbCod ;
         GXv_int9[0] = AV25BarCodL ;
         GXv_int6[0] = AV29BarCodReoL ;
         GXv_char3[0] = AV27BarCodParL ;
         GXv_char2[0] = AV89FasesDsc ;
         GXv_decimal10[0] = AV135Precio ;
         GXv_decimal11[0] = AV84FacKgs ;
         GXv_decimal12[0] = AV160TotLin ;
         GXv_int13[0] = AV105i ;
         GXv_decimal14[0] = AV72FacBonLi ;
         GXv_decimal15[0] = AV87FacRec ;
         new app.pfacmod2(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_int9, GXv_int6, GXv_char3, GXv_char2, GXv_decimal10, GXv_decimal11, GXv_decimal12, AV144Tab_dsc, AV145Tab_imp, AV146Tab_kgs, AV148Tab_prec, GXv_int13, AV143Tab_Bon, AV149Tab_Rec, GXv_decimal14, GXv_decimal15) ;
         pwfacm21.this.A396EmprCod = GXv_char4[0] ;
         pwfacm21.this.A430FacCod = GXv_int7[0] ;
         pwfacm21.this.AV69FacAlbCod = GXv_int8[0] ;
         pwfacm21.this.AV25BarCodL = GXv_int9[0] ;
         pwfacm21.this.AV29BarCodReoL = GXv_int6[0] ;
         pwfacm21.this.AV27BarCodParL = GXv_char3[0] ;
         pwfacm21.this.AV89FasesDsc = GXv_char2[0] ;
         pwfacm21.this.AV135Precio = GXv_decimal10[0] ;
         pwfacm21.this.AV84FacKgs = GXv_decimal11[0] ;
         pwfacm21.this.AV160TotLin = GXv_decimal12[0] ;
         pwfacm21.this.AV105i = GXv_int13[0] ;
         pwfacm21.this.AV72FacBonLi = GXv_decimal14[0] ;
         pwfacm21.this.AV87FacRec = GXv_decimal15[0] ;
      }
      else
      {
         if ( AV9Agr_Fases == 2 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int9[0] = A430FacCod ;
            GXv_int8[0] = AV69FacAlbCod ;
            GXv_int7[0] = AV25BarCodL ;
            GXv_int13[0] = AV29BarCodReoL ;
            GXv_char3[0] = AV27BarCodParL ;
            GXv_char2[0] = AV89FasesDsc ;
            GXv_decimal15[0] = AV135Precio ;
            GXv_decimal14[0] = AV84FacKgs ;
            GXv_decimal12[0] = AV160TotLin ;
            GXv_int6[0] = AV105i ;
            GXv_decimal11[0] = AV72FacBonLi ;
            GXv_decimal10[0] = AV87FacRec ;
            new app.pfacmod1(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV144Tab_dsc, AV145Tab_imp, AV146Tab_kgs, AV148Tab_prec, GXv_int6, AV143Tab_Bon, AV149Tab_Rec, GXv_decimal11, GXv_decimal10) ;
            pwfacm21.this.A396EmprCod = GXv_char4[0] ;
            pwfacm21.this.A430FacCod = GXv_int9[0] ;
            pwfacm21.this.AV69FacAlbCod = GXv_int8[0] ;
            pwfacm21.this.AV25BarCodL = GXv_int7[0] ;
            pwfacm21.this.AV29BarCodReoL = GXv_int13[0] ;
            pwfacm21.this.AV27BarCodParL = GXv_char3[0] ;
            pwfacm21.this.AV89FasesDsc = GXv_char2[0] ;
            pwfacm21.this.AV135Precio = GXv_decimal15[0] ;
            pwfacm21.this.AV84FacKgs = GXv_decimal14[0] ;
            pwfacm21.this.AV160TotLin = GXv_decimal12[0] ;
            pwfacm21.this.AV105i = GXv_int6[0] ;
            pwfacm21.this.AV72FacBonLi = GXv_decimal11[0] ;
            pwfacm21.this.AV87FacRec = GXv_decimal10[0] ;
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int9[0] = A430FacCod ;
            GXv_int8[0] = AV69FacAlbCod ;
            GXv_int7[0] = AV25BarCodL ;
            GXv_int13[0] = AV29BarCodReoL ;
            GXv_char3[0] = AV27BarCodParL ;
            GXv_char2[0] = AV89FasesDsc ;
            GXv_decimal15[0] = AV135Precio ;
            GXv_decimal14[0] = AV84FacKgs ;
            GXv_decimal12[0] = AV160TotLin ;
            GXv_int6[0] = AV105i ;
            GXv_decimal11[0] = AV72FacBonLi ;
            GXv_decimal10[0] = AV87FacRec ;
            new app.pfacmod4(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV144Tab_dsc, AV145Tab_imp, AV146Tab_kgs, AV148Tab_prec, GXv_int6, AV143Tab_Bon, AV149Tab_Rec, GXv_decimal11, GXv_decimal10) ;
            pwfacm21.this.A396EmprCod = GXv_char4[0] ;
            pwfacm21.this.A430FacCod = GXv_int9[0] ;
            pwfacm21.this.AV69FacAlbCod = GXv_int8[0] ;
            pwfacm21.this.AV25BarCodL = GXv_int7[0] ;
            pwfacm21.this.AV29BarCodReoL = GXv_int13[0] ;
            pwfacm21.this.AV27BarCodParL = GXv_char3[0] ;
            pwfacm21.this.AV89FasesDsc = GXv_char2[0] ;
            pwfacm21.this.AV135Precio = GXv_decimal15[0] ;
            pwfacm21.this.AV84FacKgs = GXv_decimal14[0] ;
            pwfacm21.this.AV160TotLin = GXv_decimal12[0] ;
            pwfacm21.this.AV105i = GXv_int6[0] ;
            pwfacm21.this.AV72FacBonLi = GXv_decimal11[0] ;
            pwfacm21.this.AV87FacRec = GXv_decimal10[0] ;
         }
      }
      if ( ! (GXutil.strcmp("", AV89FasesDsc)==0) )
      {
         if ( AV105i == 1 )
         {
            AV89FasesDsc = GXutil.trim( AV89FasesDsc) ;
            AV64Dto = AV87FacRec.subtract(AV72FacBonLi) ;
            AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (AV84FacKgs.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
            if ( AV160TotLin.doubleValue() == 0 )
            {
               AV135Precio = DecimalUtil.doubleToDec(0) ;
               AV64Dto = DecimalUtil.doubleToDec(0) ;
            }
            AV141SumSig = AV141SumSig.add(AV160TotLin) ;
            hAPS0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84FacKgs, "Z,ZZZ.99")), 545, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "kg", ""), 596, Gx_line+0, 611, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89FasesDsc, "")), 33, Gx_line+0, 516, Gx_line+16, 0+16, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV160TotLin = DecimalUtil.doubleToDec(0) ;
            AV128NumLin = (byte)(AV128NumLin+1) ;
         }
         else
         {
            AV116j = (byte)(1) ;
            while ( AV116j <= AV105i )
            {
               AV89FasesDsc = AV144Tab_dsc[AV116j-1] ;
               AV84FacKgs = AV146Tab_kgs[AV116j-1] ;
               AV135Precio = AV148Tab_prec[AV116j-1] ;
               AV160TotLin = AV145Tab_imp[AV116j-1] ;
               AV72FacBonLi = AV143Tab_Bon[AV116j-1] ;
               AV87FacRec = AV149Tab_Rec[AV116j-1] ;
               AV64Dto = AV87FacRec.subtract(AV72FacBonLi) ;
               AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (AV84FacKgs.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
               if ( AV160TotLin.doubleValue() == 0 )
               {
                  AV135Precio = DecimalUtil.doubleToDec(0) ;
                  AV64Dto = DecimalUtil.doubleToDec(0) ;
               }
               if ( AV128NumLin > AV119Linea_s )
               {
                  AV97FlagNoFin = (byte)(1) ;
                  AV128NumLin = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV141SumSig = AV141SumSig.add(AV160TotLin) ;
               hAPS0( false, 19) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84FacKgs, "Z,ZZZ.99")), 545, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "kg", ""), 596, Gx_line+0, 611, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89FasesDsc, "")), 33, Gx_line+3, 516, Gx_line+19, 0+16, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               AV160TotLin = DecimalUtil.doubleToDec(0) ;
               AV128NumLin = (byte)(AV128NumLin+1) ;
               AV116j = (byte)(AV116j+1) ;
            }
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'LINEASFAS2' Routine */
      returnInSub = false ;
      AV25BarCodL = (int)(GXutil.lval( GXutil.substring( AV117Last_hdr, 1, 8))) ;
      AV29BarCodReoL = (byte)(GXutil.lval( GXutil.substring( AV117Last_hdr, 10, 1))) ;
      AV27BarCodParL = GXutil.substring( AV117Last_hdr, 11, 1) ;
      AV89FasesDsc = "" ;
      if ( AV9Agr_Fases == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A430FacCod ;
         GXv_int8[0] = AV69FacAlbCod ;
         GXv_int7[0] = AV25BarCodL ;
         GXv_int13[0] = AV29BarCodReoL ;
         GXv_char3[0] = AV27BarCodParL ;
         GXv_char2[0] = AV89FasesDsc ;
         GXv_decimal15[0] = AV135Precio ;
         GXv_decimal14[0] = AV85FacMts ;
         GXv_decimal12[0] = AV160TotLin ;
         GXv_int6[0] = AV105i ;
         GXv_decimal11[0] = AV72FacBonLi ;
         GXv_decimal10[0] = AV87FacRec ;
         new app.pfacmod3(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV144Tab_dsc, AV145Tab_imp, AV147Tab_mts, AV148Tab_prec, GXv_int6, AV143Tab_Bon, AV149Tab_Rec, GXv_decimal11, GXv_decimal10) ;
         pwfacm21.this.A396EmprCod = GXv_char4[0] ;
         pwfacm21.this.A430FacCod = GXv_int9[0] ;
         pwfacm21.this.AV69FacAlbCod = GXv_int8[0] ;
         pwfacm21.this.AV25BarCodL = GXv_int7[0] ;
         pwfacm21.this.AV29BarCodReoL = GXv_int13[0] ;
         pwfacm21.this.AV27BarCodParL = GXv_char3[0] ;
         pwfacm21.this.AV89FasesDsc = GXv_char2[0] ;
         pwfacm21.this.AV135Precio = GXv_decimal15[0] ;
         pwfacm21.this.AV85FacMts = GXv_decimal14[0] ;
         pwfacm21.this.AV160TotLin = GXv_decimal12[0] ;
         pwfacm21.this.AV105i = GXv_int6[0] ;
         pwfacm21.this.AV72FacBonLi = GXv_decimal11[0] ;
         pwfacm21.this.AV87FacRec = GXv_decimal10[0] ;
      }
      else
      {
         if ( AV9Agr_Fases == 2 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int9[0] = A430FacCod ;
            GXv_int8[0] = AV69FacAlbCod ;
            GXv_int7[0] = AV25BarCodL ;
            GXv_int13[0] = AV29BarCodReoL ;
            GXv_char3[0] = AV27BarCodParL ;
            GXv_char2[0] = AV89FasesDsc ;
            GXv_decimal15[0] = AV135Precio ;
            GXv_decimal14[0] = AV85FacMts ;
            GXv_decimal12[0] = AV160TotLin ;
            GXv_int6[0] = AV105i ;
            GXv_decimal11[0] = AV72FacBonLi ;
            GXv_decimal10[0] = AV87FacRec ;
            new app.pfacmod5(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV144Tab_dsc, AV145Tab_imp, AV147Tab_mts, AV148Tab_prec, GXv_int6, AV143Tab_Bon, AV149Tab_Rec, GXv_decimal11, GXv_decimal10) ;
            pwfacm21.this.A396EmprCod = GXv_char4[0] ;
            pwfacm21.this.A430FacCod = GXv_int9[0] ;
            pwfacm21.this.AV69FacAlbCod = GXv_int8[0] ;
            pwfacm21.this.AV25BarCodL = GXv_int7[0] ;
            pwfacm21.this.AV29BarCodReoL = GXv_int13[0] ;
            pwfacm21.this.AV27BarCodParL = GXv_char3[0] ;
            pwfacm21.this.AV89FasesDsc = GXv_char2[0] ;
            pwfacm21.this.AV135Precio = GXv_decimal15[0] ;
            pwfacm21.this.AV85FacMts = GXv_decimal14[0] ;
            pwfacm21.this.AV160TotLin = GXv_decimal12[0] ;
            pwfacm21.this.AV105i = GXv_int6[0] ;
            pwfacm21.this.AV72FacBonLi = GXv_decimal11[0] ;
            pwfacm21.this.AV87FacRec = GXv_decimal10[0] ;
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int9[0] = A430FacCod ;
            GXv_int8[0] = AV69FacAlbCod ;
            GXv_int7[0] = AV25BarCodL ;
            GXv_int13[0] = AV29BarCodReoL ;
            GXv_char3[0] = AV27BarCodParL ;
            GXv_char2[0] = AV89FasesDsc ;
            GXv_decimal15[0] = AV135Precio ;
            GXv_decimal14[0] = AV85FacMts ;
            GXv_decimal12[0] = AV160TotLin ;
            GXv_int6[0] = AV105i ;
            GXv_decimal11[0] = AV72FacBonLi ;
            GXv_decimal10[0] = AV87FacRec ;
            new app.pfacmod6(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV144Tab_dsc, AV145Tab_imp, AV147Tab_mts, AV148Tab_prec, GXv_int6, AV143Tab_Bon, AV149Tab_Rec, GXv_decimal11, GXv_decimal10) ;
            pwfacm21.this.A396EmprCod = GXv_char4[0] ;
            pwfacm21.this.A430FacCod = GXv_int9[0] ;
            pwfacm21.this.AV69FacAlbCod = GXv_int8[0] ;
            pwfacm21.this.AV25BarCodL = GXv_int7[0] ;
            pwfacm21.this.AV29BarCodReoL = GXv_int13[0] ;
            pwfacm21.this.AV27BarCodParL = GXv_char3[0] ;
            pwfacm21.this.AV89FasesDsc = GXv_char2[0] ;
            pwfacm21.this.AV135Precio = GXv_decimal15[0] ;
            pwfacm21.this.AV85FacMts = GXv_decimal14[0] ;
            pwfacm21.this.AV160TotLin = GXv_decimal12[0] ;
            pwfacm21.this.AV105i = GXv_int6[0] ;
            pwfacm21.this.AV72FacBonLi = GXv_decimal11[0] ;
            pwfacm21.this.AV87FacRec = GXv_decimal10[0] ;
         }
      }
      if ( ! (GXutil.strcmp("", AV89FasesDsc)==0) )
      {
         if ( AV105i == 1 )
         {
            AV89FasesDsc = GXutil.trim( AV89FasesDsc) ;
            AV64Dto = AV87FacRec.subtract(AV72FacBonLi) ;
            AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (AV85FacMts.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
            if ( AV160TotLin.doubleValue() == 0 )
            {
               AV135Precio = DecimalUtil.doubleToDec(0) ;
               AV64Dto = DecimalUtil.doubleToDec(0) ;
            }
            if ( AV128NumLin > AV119Linea_s )
            {
               AV97FlagNoFin = (byte)(1) ;
               AV128NumLin = (byte)(1) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            AV141SumSig = AV141SumSig.add(AV160TotLin) ;
            hAPS0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85FacMts, "Z,ZZZ.99")), 545, Gx_line+0, 595, Gx_line+15, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 595, Gx_line+0, 611, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89FasesDsc, "")), 33, Gx_line+0, 516, Gx_line+16, 0+16, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV160TotLin = DecimalUtil.doubleToDec(0) ;
            AV128NumLin = (byte)(AV128NumLin+1) ;
         }
         else
         {
            AV116j = (byte)(1) ;
            while ( AV116j <= AV105i )
            {
               AV89FasesDsc = AV144Tab_dsc[AV116j-1] ;
               AV85FacMts = AV147Tab_mts[AV116j-1] ;
               AV135Precio = AV148Tab_prec[AV116j-1] ;
               AV160TotLin = AV145Tab_imp[AV116j-1] ;
               AV64Dto = AV87FacRec.subtract(AV72FacBonLi) ;
               AV112ImpPenDto = AV112ImpPenDto.add(GXutil.roundDecimal( (AV85FacMts.multiply(AV135Precio).multiply(AV64Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
               if ( AV160TotLin.doubleValue() == 0 )
               {
                  AV135Precio = DecimalUtil.doubleToDec(0) ;
                  AV64Dto = DecimalUtil.doubleToDec(0) ;
               }
               if ( AV128NumLin > AV119Linea_s )
               {
                  AV97FlagNoFin = (byte)(1) ;
                  AV128NumLin = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV141SumSig = AV141SumSig.add(AV160TotLin) ;
               hAPS0( false, 17) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85FacMts, "Z,ZZZ.99")), 545, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Precio, "ZZZ.ZZZ")), 610, Gx_line+0, 655, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160TotLin, "ZZZZZZ9.99")), 701, Gx_line+0, 765, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 595, Gx_line+0, 611, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Dto, "ZZZ.Z")), 666, Gx_line+0, 692, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89FasesDsc, "")), 33, Gx_line+0, 516, Gx_line+16, 0+16, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV160TotLin = DecimalUtil.doubleToDec(0) ;
               AV128NumLin = (byte)(AV128NumLin+1) ;
               AV116j = (byte)(AV116j+1) ;
            }
         }
      }
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV36BarSerDsc = "" ;
      AV30BarColNom = "" ;
      AV31BarColNum = 0 ;
      AV63Dsc_Idtx = " " ;
      AV35BarPrioridad = (byte)(0) ;
      AV187Bartipdis = " " ;
      /* Using cursor P0APS12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV24BarCod), Byte.valueOf(AV28BarCodReo), AV26BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P0APS12_A130BarCodPar[0] ;
         A132BarCodReo = P0APS12_A132BarCodReo[0] ;
         A129BarCod = P0APS12_A129BarCod[0] ;
         A1652BarSerDsc = P0APS12_A1652BarSerDsc[0] ;
         A135BarColNom = P0APS12_A135BarColNom[0] ;
         A136BarColNum = P0APS12_A136BarColNum[0] ;
         A2829BarProPer = P0APS12_A2829BarProPer[0] ;
         A14330BarPriorid = P0APS12_A14330BarPriorid[0] ;
         A2010BarTipDis = P0APS12_A2010BarTipDis[0] ;
         A166BarKgm = P0APS12_A166BarKgm[0] ;
         A184BarMtr = P0APS12_A184BarMtr[0] ;
         A166BarKgm = P0APS12_A166BarKgm[0] ;
         A184BarMtr = P0APS12_A184BarMtr[0] ;
         AV36BarSerDsc = A1652BarSerDsc ;
         AV30BarColNom = A135BarColNom ;
         AV31BarColNum = A136BarColNum ;
         AV32BarKgm = A166BarKgm ;
         AV33BarMtr = A184BarMtr ;
         AV49Cod_Idtx = GXutil.trim( A2829BarProPer) ;
         /* Execute user subroutine: 'INDITEX' */
         S149 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            pr_default.close(8);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV35BarPrioridad = A14330BarPriorid ;
         AV187Bartipdis = A2010BarTipDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'FORPAG' Routine */
      returnInSub = false ;
      AV102FpgDsc = "" ;
      /* Using cursor P0APS13 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV101FpgCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A497FpgCod = P0APS13_A497FpgCod[0] ;
         A498FpgDsc = P0APS13_A498FpgDsc[0] ;
         n498FpgDsc = P0APS13_n498FpgDsc[0] ;
         AV102FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'FECHALB' Routine */
      returnInSub = false ;
      if ( AV70FacAlbTip == 1 )
      {
         /* Using cursor P0APS14 */
         pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(AV69FacAlbCod)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A30AlbProCod = P0APS14_A30AlbProCod[0] ;
            A34AlbProfch = P0APS14_A34AlbProfch[0] ;
            AV14AlbProFch = A34AlbProfch ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
      if ( AV70FacAlbTip == 2 )
      {
         /* Using cursor P0APS15 */
         pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(AV69FacAlbCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A14AlbComCod = P0APS15_A14AlbComCod[0] ;
            A17AlbComFch = P0APS15_A17AlbComFch[0] ;
            AV14AlbProFch = A17AlbComFch ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
   }

   public void S149( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      AV63Dsc_Idtx = "" ;
      /* Using cursor P0APS16 */
      pr_default.execute(12, new Object[] {A396EmprCod, AV49Cod_Idtx});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A10887Cod_Idtx = P0APS16_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0APS16_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0APS16_n10888Dsc_Idtx[0] ;
         A12703Imp_Idtx = P0APS16_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P0APS16_n12703Imp_Idtx[0] ;
         AV63Dsc_Idtx = ((GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", ""))==0) ? GXutil.trim( A10888Dsc_Idtx) : " ") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void hAPS0( boolean bFoot ,
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
               if ( AV97FlagNoFin == 0 )
               {
                  AV155Texto_pc = httpContext.getMessage( "Processado por computador", "") ;
                  AV155Texto_pc = ((GXutil.strcmp(AV153Texto_fd, " ")!=0) ? " " : AV155Texto_pc) ;
                  getPrinter().GxDrawRect(38, Gx_line+38, 309, Gx_line+80, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(520, Gx_line+30, 670, Gx_line+173, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(27, Gx_line+20, 784, Gx_line+183, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(513, Gx_line+24, 779, Gx_line+178, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mercadoria/Serviços", ""), 528, Gx_line+36, 645, Gx_line+52, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Descontos Comerciais", ""), 528, Gx_line+60, 661, Gx_line+76, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total  (EUR)", ""), 528, Gx_line+146, 598, Gx_line+162, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81FacImpTot, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+36, 773, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79FacImpGen, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+60, 773, Gx_line+77, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71FacBasImp, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+84, 773, Gx_line+101, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88FacTot, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+146, 773, Gx_line+163, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Sub Total", ""), 528, Gx_line+84, 582, Gx_line+100, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor do I.V.A.", ""), 528, Gx_line+109, 604, Gx_line+125, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+109, 773, Gx_line+126, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(506, Gx_line+20, 506, Gx_line+184, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV83FacIvaPor), "Z9")), 48, Gx_line+85, 64, Gx_line+102, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(32, Gx_line+31, 314, Gx_line+114, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quadro Resumo do I.V.A.", ""), 108, Gx_line+42, 252, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Incidência", ""), 134, Gx_line+56, 193, Gx_line+72, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 48, Gx_line+56, 75, Gx_line+72, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 267, Gx_line+56, 296, Gx_line+72, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71FacBasImp, "ZZ,ZZZ,ZZ9.99")), 98, Gx_line+85, 194, Gx_line+102, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 201, Gx_line+85, 297, Gx_line+102, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("%", 68, Gx_line+86, 78, Gx_line+100, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57DesPago, "")), 33, Gx_line+153, 190, Gx_line+170, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Condição Pagamento", ""), 33, Gx_line+128, 160, Gx_line+144, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data de Vencimento", ""), 197, Gx_line+128, 316, Gx_line+144, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(319, Gx_line+20, 319, Gx_line+184, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(27, Gx_line+203, 781, Gx_line+203, 1, 0, 0, 128, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV154Texto_i, "")), 38, Gx_line+0, 404, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Contdsc, "")), 723, Gx_line+185, 782, Gx_line+199, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Texto_1, "")), 93, Gx_line+205, 715, Gx_line+222, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV152Texto_2, "")), 132, Gx_line+222, 675, Gx_line+239, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV155Texto_pc, "")), 27, Gx_line+184, 158, Gx_line+200, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Os produtos foram postos à disposição do cliente na data da Guia de Remessa.", ""), 214, Gx_line+184, 669, Gx_line+199, 0+256, 0, 0, 0) ;
                  sImgUrl = ((GXutil.strcmp("", AV106Imagen)==0) ? AV193Imagen_GXI : AV106Imagen) ;
                  getPrinter().GxDrawBitMap(sImgUrl, 338, Gx_line+32, 483, Gx_line+177) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17atcud, "")), 335, Gx_line+24, 492, Gx_line+40, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93fechaVTO, "")), 230, Gx_line+153, 283, Gx_line+170, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+239) ;
               }
               else
               {
                  AV141SumSig = AV141SumSig.subtract(AV160TotLin) ;
                  getPrinter().GxDrawRect(36, Gx_line+32, 307, Gx_line+74, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(519, Gx_line+25, 669, Gx_line+168, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(26, Gx_line+15, 783, Gx_line+178, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(511, Gx_line+19, 777, Gx_line+173, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mercadoria/Serviços", ""), 527, Gx_line+31, 644, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Descontos Comerciais", ""), 527, Gx_line+55, 660, Gx_line+71, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total  (EUR)", ""), 527, Gx_line+141, 597, Gx_line+157, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Sub Total", ""), 527, Gx_line+79, 581, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor do I.V.A.", ""), 527, Gx_line+104, 603, Gx_line+120, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(505, Gx_line+15, 505, Gx_line+179, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(31, Gx_line+26, 313, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quadro Resumo do I.V.A.", ""), 107, Gx_line+36, 251, Gx_line+52, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Incidência", ""), 133, Gx_line+51, 192, Gx_line+67, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 47, Gx_line+51, 74, Gx_line+67, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 266, Gx_line+51, 295, Gx_line+67, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57DesPago, "")), 32, Gx_line+148, 189, Gx_line+165, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Condição Pagamento", ""), 32, Gx_line+123, 159, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data de Vencimento", ""), 196, Gx_line+123, 315, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(318, Gx_line+15, 318, Gx_line+179, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV154Texto_i, "")), 38, Gx_line+0, 404, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "A TRANSPORTAR", ""), 574, Gx_line+182, 678, Gx_line+198, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV141SumSig, "ZZZZZZZZZ9.99")), 666, Gx_line+182, 767, Gx_line+199, 2, 0, 0, 0) ;
                  getPrinter().GxDrawLine(29, Gx_line+202, 783, Gx_line+202, 1, 0, 0, 128, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Contdsc, "")), 30, Gx_line+184, 89, Gx_line+198, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Texto_1, "")), 95, Gx_line+204, 717, Gx_line+221, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV152Texto_2, "")), 134, Gx_line+222, 677, Gx_line+239, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV155Texto_pc, "")), 653, Gx_line+0, 784, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Os produtos foram postos à disposição do cliente na data da Guia de Remessa.", ""), 102, Gx_line+183, 557, Gx_line+198, 0+256, 0, 0, 0) ;
                  sImgUrl = ((GXutil.strcmp("", AV106Imagen)==0) ? AV193Imagen_GXI : AV106Imagen) ;
                  getPrinter().GxDrawBitMap(sImgUrl, 338, Gx_line+32, 483, Gx_line+177) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17atcud, "")), 335, Gx_line+24, 492, Gx_line+40, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93fechaVTO, "")), 217, Gx_line+148, 270, Gx_line+165, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+239) ;
                  AV97FlagNoFin = (byte)(0) ;
               }
               AV163transporte = (byte)(1) ;
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
               getPrinter().GxDrawRect(162, Gx_line+132, 279, Gx_line+156, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 9, Gx_line+183, 54, Gx_line+200, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43CliNif, "")), 64, Gx_line+183, 148, Gx_line+200, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 372, Gx_line+184, 411, Gx_line+200, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O. Serv", ""), 99, Gx_line+217, 141, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 209, Gx_line+217, 303, Gx_line+233, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "QT.Fact.", ""), 551, Gx_line+217, 598, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(8, Gx_line+208, 775, Gx_line+240, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 381, Gx_line+217, 403, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(161, Gx_line+208, 161, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(355, Gx_line+208, 355, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 435, Gx_line+217, 476, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(479, Gx_line+208, 479, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(431, Gx_line+208, 431, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Enc.", ""), 29, Gx_line+217, 65, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(80, Gx_line+208, 80, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 617, Gx_line+217, 651, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(609, Gx_line+208, 609, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(655, Gx_line+208, 655, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 707, Gx_line+217, 735, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156TextoCopia, "")), 300, Gx_line+138, 379, Gx_line+155, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 61, Gx_line+136, 118, Gx_line+153, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factura", ""), 197, Gx_line+136, 248, Gx_line+153, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 231, Gx_line+164, 259, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 320, Gx_line+164, 335, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 407, Gx_line+164, 434, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(208, Gx_line+156, 208, Gx_line+203, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(467, Gx_line+152, 467, Gx_line+203, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(171, Gx_line+202, 281, Gx_line+202, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(280, Gx_line+156, 280, Gx_line+203, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(369, Gx_line+156, 369, Gx_line+203, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 24, Gx_line+164, 39, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Nº Contribuinte", ""), 59, Gx_line+164, 157, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Moeda", ""), 165, Gx_line+164, 205, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EUR", ""), 175, Gx_line+183, 197, Gx_line+198, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(171, Gx_line+180, 281, Gx_line+180, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+180, 173, Gx_line+180, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(8, Gx_line+132, 162, Gx_line+156, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+156, 8, Gx_line+203, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+202, 171, Gx_line+202, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(161, Gx_line+156, 161, Gx_line+203, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(57, Gx_line+156, 57, Gx_line+203, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(538, Gx_line+208, 538, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "QT.Ent.", ""), 492, Gx_line+217, 534, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmo.(s) Sr.(s)", ""), 474, Gx_line+104, 559, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 474, Gx_line+151, 688, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 474, Gx_line+126, 663, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Cp_pob, "")), 474, Gx_line+177, 731, Gx_line+195, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(279, Gx_line+133, 467, Gx_line+157, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(280, Gx_line+202, 466, Gx_line+202, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(280, Gx_line+180, 468, Gx_line+180, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(470, Gx_line+96, 775, Gx_line+203, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 26, Gx_line+3, 783, Gx_line+89) ;
               getPrinter().GxDrawLine(702, Gx_line+208, 702, Gx_line+240, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Perc.%", ""), 659, Gx_line+217, 701, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153Texto_fd, "")), 26, Gx_line+109, 313, Gx_line+125, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 423, Gx_line+184, 472, Gx_line+199, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 415, Gx_line+184, 419, Gx_line+199, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127numeroFra, "")), 288, Gx_line+183, 367, Gx_line+199, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92fechafra, "")), 219, Gx_line+183, 272, Gx_line+199, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+250) ;
               if ( AV163transporte == 1 )
               {
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Transporte", ""), 606, Gx_line+3, 672, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV141SumSig, "ZZZZZZZZZ9.99")), 682, Gx_line+4, 764, Gx_line+20, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
                  AV141SumSig = AV141SumSig.add(AV160TotLin) ;
                  AV128NumLin = (byte)(AV128NumLin+1) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pwfacm21");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV52ContDsc20 = "" ;
      AV96FirmaD = "" ;
      AV51Contdsc = "" ;
      scmdbuf = "" ;
      P0APS2_A396EmprCod = new String[] {""} ;
      P0APS2_A8335EmpItm2 = new String[] {""} ;
      P0APS2_n8335EmpItm2 = new boolean[] {false} ;
      P0APS2_A8334EmpItm1 = new String[] {""} ;
      P0APS2_n8334EmpItm1 = new boolean[] {false} ;
      P0APS2_A8337EmpItm4 = new String[] {""} ;
      P0APS2_n8337EmpItm4 = new boolean[] {false} ;
      P0APS2_A8336EmpItm3 = new String[] {""} ;
      P0APS2_n8336EmpItm3 = new boolean[] {false} ;
      P0APS2_A395EmprCif = new String[] {""} ;
      P0APS2_n395EmprCif = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV151Texto_1 = "" ;
      AV152Texto_2 = "" ;
      AV65EmprCif = "" ;
      P0APS3_A396EmprCod = new String[] {""} ;
      P0APS3_A430FacCod = new int[1] ;
      P0APS3_A450FacPri = new String[] {""} ;
      P0APS3_A14230FacIDATe = new String[] {""} ;
      P0APS3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0APS3_A9605FacFirma = new String[] {""} ;
      P0APS3_A14236FacSerAT = new String[] {""} ;
      P0APS3_A14237FacTipAT = new String[] {""} ;
      P0APS3_A437FacFpg = new String[] {""} ;
      P0APS3_A435FacEst = new byte[1] ;
      P0APS3_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A252CliCod = new int[1] ;
      P0APS3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_n8346FacRecI = new boolean[] {false} ;
      P0APS3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS3_A443FacIVAPor = new byte[1] ;
      P0APS3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A450FacPri = "" ;
      A14230FacIDATe = "" ;
      A436FacFch = GXutil.nullDate() ;
      A9605FacFirma = "" ;
      A14236FacSerAT = "" ;
      A14237FacTipAT = "" ;
      A437FacFpg = "" ;
      A9643FacLiq1 = DecimalUtil.ZERO ;
      A9644FacLiq2 = DecimalUtil.ZERO ;
      A9645FacIva1 = DecimalUtil.ZERO ;
      A9646FacTot1 = DecimalUtil.ZERO ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      P0APS4_A7209Colombia = new byte[1] ;
      P0APS4_n7209Colombia = new boolean[] {false} ;
      P0APS6_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
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
      P0APS7_A278CliNif = new String[] {""} ;
      P0APS7_A13236CliFacMtsP = new String[] {""} ;
      P0APS7_A13012CliImpReop = new String[] {""} ;
      P0APS7_A858ZonGeoCod = new short[1] ;
      P0APS7_A4828CliCp2 = new String[] {""} ;
      P0APS7_A256CliCp = new String[] {""} ;
      P0APS7_A295CliPob = new String[] {""} ;
      P0APS7_A279CliNom = new String[] {""} ;
      P0APS7_A260CliDom = new String[] {""} ;
      A278CliNif = "" ;
      A13236CliFacMtsP = "" ;
      A13012CliImpReop = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      AV43CliNif = "" ;
      AV50codValidacaoSerie = "" ;
      AV17atcud = "" ;
      AV92fechafra = "" ;
      AV95Firma4dig = "" ;
      AV127numeroFra = "" ;
      AV157TextoGenerar = "" ;
      AV177Centimetos = DecimalUtil.ZERO ;
      AV8Url = "" ;
      GXt_char1 = "" ;
      AV106Imagen = "" ;
      AV193Imagen_GXI = "" ;
      AV41CliFacMtsP = "" ;
      AV101FpgCod = "" ;
      AV42CliImpReop = "" ;
      AV57DesPago = "" ;
      AV102FpgDsc = "" ;
      AV48CliPri = "" ;
      AV78FacFch = GXutil.nullDate() ;
      AV154Texto_i = "" ;
      AV171Vencim = new java.util.Date[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV171Vencim[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      P0APS8_A396EmprCod = new String[] {""} ;
      P0APS8_A430FacCod = new int[1] ;
      P0APS8_A956FacVtoLin = new byte[1] ;
      P0APS8_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0APS8_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV93fechaVTO = "" ;
      AV77Facdtopp = DecimalUtil.ZERO ;
      AV81FacImpTot = DecimalUtil.ZERO ;
      AV80FacImpPP = DecimalUtil.ZERO ;
      AV79FacImpGen = DecimalUtil.ZERO ;
      AV76FacDtoGen = DecimalUtil.ZERO ;
      AV82FacIvaImp = DecimalUtil.ZERO ;
      AV88FacTot = DecimalUtil.ZERO ;
      AV71FacBasImp = DecimalUtil.ZERO ;
      AV112ImpPenDto = DecimalUtil.ZERO ;
      AV158TotFac = DecimalUtil.ZERO ;
      AV39Clicp_t = "" ;
      AV53Cp_pob = "" ;
      AV153Texto_fd = "" ;
      P0APS9_A396EmprCod = new String[] {""} ;
      P0APS9_A430FacCod = new int[1] ;
      P0APS9_A427FacAlbCod = new long[1] ;
      P0APS9_A3397FacFasCod = new String[] {""} ;
      P0APS9_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A3878FacColNom = new String[] {""} ;
      P0APS9_A3879FocColNum = new int[1] ;
      P0APS9_A1498FacDisNum = new String[] {""} ;
      P0APS9_A428FacAlbTip = new byte[1] ;
      P0APS9_A454FacSer = new String[] {""} ;
      P0APS9_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A5050FacBonLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A451FacRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A12197FacUnds = new int[1] ;
      P0APS9_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS9_A432FacDsc = new String[] {""} ;
      P0APS9_A1296FacBarPar = new String[] {""} ;
      P0APS9_A1295FacBarReo = new byte[1] ;
      P0APS9_A1294FacBarCod = new int[1] ;
      P0APS9_A446FacLin = new int[1] ;
      A3397FacFasCod = "" ;
      A444FacKgs = DecimalUtil.ZERO ;
      A3878FacColNom = "" ;
      A1498FacDisNum = "" ;
      A454FacSer = "" ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A1296FacBarPar = "" ;
      AV14AlbProFch = GXutil.nullDate() ;
      AV117Last_hdr = "" ;
      AV103Hdr = "" ;
      AV104Hdri = "" ;
      AV84FacKgs = DecimalUtil.ZERO ;
      AV36BarSerDsc = "" ;
      AV26BarCodPar = "" ;
      AV30BarColNom = "" ;
      AV74FacDisNum = "" ;
      AV161TotLin2 = DecimalUtil.ZERO ;
      AV160TotLin = DecimalUtil.ZERO ;
      AV135Precio = DecimalUtil.ZERO ;
      AV64Dto = DecimalUtil.ZERO ;
      AV187Bartipdis = "" ;
      AV141SumSig = DecimalUtil.ZERO ;
      AV32BarKgm = DecimalUtil.ZERO ;
      AV63Dsc_Idtx = "" ;
      AV33BarMtr = DecimalUtil.ZERO ;
      AV22Aux4 = DecimalUtil.ZERO ;
      AV27BarCodParL = "" ;
      AV89FasesDsc = "" ;
      AV144Tab_dsc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV144Tab_dsc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV145Tab_imp = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV145Tab_imp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV146Tab_kgs = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV146Tab_kgs[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV148Tab_prec = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV148Tab_prec[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV143Tab_Bon = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV143Tab_Bon[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV149Tab_Rec = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV149Tab_Rec[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV72FacBonLi = DecimalUtil.ZERO ;
      AV87FacRec = DecimalUtil.ZERO ;
      AV85FacMts = DecimalUtil.ZERO ;
      AV147Tab_mts = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV147Tab_mts[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new long[1] ;
      GXv_int7 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      P0APS12_A396EmprCod = new String[] {""} ;
      P0APS12_A130BarCodPar = new String[] {""} ;
      P0APS12_A132BarCodReo = new byte[1] ;
      P0APS12_A129BarCod = new int[1] ;
      P0APS12_A1652BarSerDsc = new String[] {""} ;
      P0APS12_A135BarColNom = new String[] {""} ;
      P0APS12_A136BarColNum = new int[1] ;
      P0APS12_A2829BarProPer = new String[] {""} ;
      P0APS12_A14330BarPriorid = new byte[1] ;
      P0APS12_A2010BarTipDis = new String[] {""} ;
      P0APS12_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0APS12_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A2829BarProPer = "" ;
      A2010BarTipDis = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV49Cod_Idtx = "" ;
      P0APS13_A396EmprCod = new String[] {""} ;
      P0APS13_A497FpgCod = new String[] {""} ;
      P0APS13_A498FpgDsc = new String[] {""} ;
      P0APS13_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      P0APS14_A396EmprCod = new String[] {""} ;
      P0APS14_A30AlbProCod = new long[1] ;
      P0APS14_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      P0APS15_A396EmprCod = new String[] {""} ;
      P0APS15_A14AlbComCod = new int[1] ;
      P0APS15_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A17AlbComFch = GXutil.nullDate() ;
      P0APS16_A396EmprCod = new String[] {""} ;
      P0APS16_A10887Cod_Idtx = new String[] {""} ;
      P0APS16_A10888Dsc_Idtx = new String[] {""} ;
      P0APS16_n10888Dsc_Idtx = new boolean[] {false} ;
      P0APS16_A12703Imp_Idtx = new String[] {""} ;
      P0APS16_n12703Imp_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      A12703Imp_Idtx = "" ;
      AV155Texto_pc = "" ;
      AV106Imagen = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pwfacm21__default(),
         new Object[] {
             new Object[] {
            P0APS2_A396EmprCod, P0APS2_A8335EmpItm2, P0APS2_n8335EmpItm2, P0APS2_A8334EmpItm1, P0APS2_n8334EmpItm1, P0APS2_A8337EmpItm4, P0APS2_n8337EmpItm4, P0APS2_A8336EmpItm3, P0APS2_n8336EmpItm3, P0APS2_A395EmprCif,
            P0APS2_n395EmprCif
            }
            , new Object[] {
            P0APS3_A396EmprCod, P0APS3_A430FacCod, P0APS3_A450FacPri, P0APS3_A14230FacIDATe, P0APS3_A436FacFch, P0APS3_A9605FacFirma, P0APS3_A14236FacSerAT, P0APS3_A14237FacTipAT, P0APS3_A437FacFpg, P0APS3_A435FacEst,
            P0APS3_A9643FacLiq1, P0APS3_A9644FacLiq2, P0APS3_A9645FacIva1, P0APS3_A9646FacTot1, P0APS3_A252CliCod, P0APS3_A11513FacRecIca, P0APS3_A8346FacRecI, P0APS3_n8346FacRecI, P0APS3_A7212FacRect, P0APS3_A453FacRECPor,
            P0APS3_A14224FacCostFac, P0APS3_A14223FacCostKgs, P0APS3_A14222FacCostMts, P0APS3_A434FacDtoPP, P0APS3_A433FacDtoGen, P0APS3_A443FacIVAPor, P0APS3_A14219FacEnergia
            }
            , new Object[] {
            P0APS4_A7209Colombia, P0APS4_n7209Colombia
            }
            , new Object[] {
            P0APS6_A3918FacImpTot1
            }
            , new Object[] {
            P0APS7_A278CliNif, P0APS7_A13236CliFacMtsP, P0APS7_A13012CliImpReop, P0APS7_A858ZonGeoCod, P0APS7_A4828CliCp2, P0APS7_A256CliCp, P0APS7_A295CliPob, P0APS7_A279CliNom, P0APS7_A260CliDom
            }
            , new Object[] {
            P0APS8_A396EmprCod, P0APS8_A430FacCod, P0APS8_A956FacVtoLin, P0APS8_A957FacVtoFch, P0APS8_n957FacVtoFch
            }
            , new Object[] {
            P0APS9_A396EmprCod, P0APS9_A430FacCod, P0APS9_A427FacAlbCod, P0APS9_A3397FacFasCod, P0APS9_A444FacKgs, P0APS9_A3878FacColNom, P0APS9_A3879FocColNum, P0APS9_A1498FacDisNum, P0APS9_A428FacAlbTip, P0APS9_A454FacSer,
            P0APS9_A3898FacPreKgsA, P0APS9_A448FacPreKgs, P0APS9_A5050FacBonLi, P0APS9_A451FacRec, P0APS9_A5353FacImpMan, P0APS9_A449FacPreMts, P0APS9_A447FacMts, P0APS9_A12197FacUnds, P0APS9_A12198FacPreUnd, P0APS9_A432FacDsc,
            P0APS9_A1296FacBarPar, P0APS9_A1295FacBarReo, P0APS9_A1294FacBarCod, P0APS9_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            P0APS12_A396EmprCod, P0APS12_A130BarCodPar, P0APS12_A132BarCodReo, P0APS12_A129BarCod, P0APS12_A1652BarSerDsc, P0APS12_A135BarColNom, P0APS12_A136BarColNum, P0APS12_A2829BarProPer, P0APS12_A14330BarPriorid, P0APS12_A2010BarTipDis,
            P0APS12_A166BarKgm, P0APS12_A184BarMtr
            }
            , new Object[] {
            P0APS13_A396EmprCod, P0APS13_A497FpgCod, P0APS13_A498FpgDsc, P0APS13_n498FpgDsc
            }
            , new Object[] {
            P0APS14_A396EmprCod, P0APS14_A30AlbProCod, P0APS14_A34AlbProfch
            }
            , new Object[] {
            P0APS15_A396EmprCod, P0APS15_A14AlbComCod, P0APS15_A17AlbComFch
            }
            , new Object[] {
            P0APS16_A396EmprCod, P0APS16_A10887Cod_Idtx, P0APS16_A10888Dsc_Idtx, P0APS16_n10888Dsc_Idtx, P0APS16_A12703Imp_Idtx, P0APS16_n12703Imp_Idtx
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV67F_header ;
   private byte AV9Agr_Fases ;
   private byte AV172VerSumTot ;
   private byte AV66existefirmad ;
   private byte AV99flax2 ;
   private byte GXt_int5 ;
   private byte AV119Linea_s ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV55day ;
   private byte AV123month ;
   private byte AV122Mes ;
   private byte AV58dia ;
   private byte AV98FlagPag ;
   private byte AV129Paso ;
   private byte A956FacVtoLin ;
   private byte AV83FacIvaPor ;
   private byte AV128NumLin ;
   private byte AV97FlagNoFin ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private byte AV70FacAlbTip ;
   private byte AV35BarPrioridad ;
   private byte AV28BarCodReo ;
   private byte AV29BarCodReoL ;
   private byte AV105i ;
   private byte AV116j ;
   private byte GXv_int13[] ;
   private byte GXv_int6[] ;
   private byte A132BarCodReo ;
   private byte A14330BarPriorid ;
   private byte AV163transporte ;
   private short A858ZonGeoCod ;
   private short AV175year ;
   private short AV16anyo ;
   private short AV178Dpi ;
   private short AV179Pixel ;
   private short AV176ZONGEOCOD ;
   private short Gx_err ;
   private int A430FacCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV38CliCod ;
   private int AV73FacCod ;
   private int GX_I ;
   private int A3879FocColNum ;
   private int A12197FacUnds ;
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private int Gx_OldLine ;
   private int AV24BarCod ;
   private int AV31BarColNum ;
   private int AV25BarCodL ;
   private int GXv_int9[] ;
   private int GXv_int7[] ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A14AlbComCod ;
   private long A427FacAlbCod ;
   private long AV69FacAlbCod ;
   private long GXv_int8[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV168ValEuro ;
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
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
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
   private java.math.BigDecimal AV177Centimetos ;
   private java.math.BigDecimal AV77Facdtopp ;
   private java.math.BigDecimal AV81FacImpTot ;
   private java.math.BigDecimal AV80FacImpPP ;
   private java.math.BigDecimal AV79FacImpGen ;
   private java.math.BigDecimal AV76FacDtoGen ;
   private java.math.BigDecimal AV82FacIvaImp ;
   private java.math.BigDecimal AV88FacTot ;
   private java.math.BigDecimal AV71FacBasImp ;
   private java.math.BigDecimal AV112ImpPenDto ;
   private java.math.BigDecimal AV158TotFac ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal AV84FacKgs ;
   private java.math.BigDecimal AV161TotLin2 ;
   private java.math.BigDecimal AV160TotLin ;
   private java.math.BigDecimal AV135Precio ;
   private java.math.BigDecimal AV64Dto ;
   private java.math.BigDecimal AV141SumSig ;
   private java.math.BigDecimal AV32BarKgm ;
   private java.math.BigDecimal AV33BarMtr ;
   private java.math.BigDecimal AV22Aux4 ;
   private java.math.BigDecimal AV145Tab_imp[] ;
   private java.math.BigDecimal AV146Tab_kgs[] ;
   private java.math.BigDecimal AV148Tab_prec[] ;
   private java.math.BigDecimal AV143Tab_Bon[] ;
   private java.math.BigDecimal AV149Tab_Rec[] ;
   private java.math.BigDecimal AV72FacBonLi ;
   private java.math.BigDecimal AV87FacRec ;
   private java.math.BigDecimal AV85FacMts ;
   private java.math.BigDecimal AV147Tab_mts[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String AV107ImpCod ;
   private String AV156TextoCopia ;
   private String Gx_out ;
   private String AV52ContDsc20 ;
   private String AV96FirmaD ;
   private String AV51Contdsc ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV151Texto_1 ;
   private String AV152Texto_2 ;
   private String AV65EmprCif ;
   private String A450FacPri ;
   private String A14230FacIDATe ;
   private String A9605FacFirma ;
   private String A14236FacSerAT ;
   private String A14237FacTipAT ;
   private String A437FacFpg ;
   private String A278CliNif ;
   private String A13236CliFacMtsP ;
   private String A13012CliImpReop ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String AV43CliNif ;
   private String AV50codValidacaoSerie ;
   private String AV17atcud ;
   private String AV92fechafra ;
   private String AV95Firma4dig ;
   private String AV127numeroFra ;
   private String GXt_char1 ;
   private String AV41CliFacMtsP ;
   private String AV101FpgCod ;
   private String AV42CliImpReop ;
   private String AV57DesPago ;
   private String AV102FpgDsc ;
   private String AV48CliPri ;
   private String AV154Texto_i ;
   private String AV93fechaVTO ;
   private String AV39Clicp_t ;
   private String AV53Cp_pob ;
   private String AV153Texto_fd ;
   private String A3397FacFasCod ;
   private String A3878FacColNom ;
   private String A1498FacDisNum ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1296FacBarPar ;
   private String AV117Last_hdr ;
   private String AV103Hdr ;
   private String AV104Hdri ;
   private String AV36BarSerDsc ;
   private String AV26BarCodPar ;
   private String AV30BarColNom ;
   private String AV74FacDisNum ;
   private String AV187Bartipdis ;
   private String AV27BarCodParL ;
   private String AV144Tab_dsc[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A2829BarProPer ;
   private String A2010BarTipDis ;
   private String AV49Cod_Idtx ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A12703Imp_Idtx ;
   private String AV155Texto_pc ;
   private String sImgUrl ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV78FacFch ;
   private java.util.Date AV171Vencim[] ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date AV14AlbProFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean GxHdr3 ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean brkAPS6 ;
   private boolean n498FpgDsc ;
   private boolean n10888Dsc_Idtx ;
   private boolean n12703Imp_Idtx ;
   private String AV139ReportInPut ;
   private String AV157TextoGenerar ;
   private String AV8Url ;
   private String AV193Imagen_GXI ;
   private String AV63Dsc_Idtx ;
   private String AV89FasesDsc ;
   private String AV106Imagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P0APS2_A396EmprCod ;
   private String[] P0APS2_A8335EmpItm2 ;
   private boolean[] P0APS2_n8335EmpItm2 ;
   private String[] P0APS2_A8334EmpItm1 ;
   private boolean[] P0APS2_n8334EmpItm1 ;
   private String[] P0APS2_A8337EmpItm4 ;
   private boolean[] P0APS2_n8337EmpItm4 ;
   private String[] P0APS2_A8336EmpItm3 ;
   private boolean[] P0APS2_n8336EmpItm3 ;
   private String[] P0APS2_A395EmprCif ;
   private boolean[] P0APS2_n395EmprCif ;
   private String[] P0APS3_A396EmprCod ;
   private int[] P0APS3_A430FacCod ;
   private String[] P0APS3_A450FacPri ;
   private String[] P0APS3_A14230FacIDATe ;
   private java.util.Date[] P0APS3_A436FacFch ;
   private String[] P0APS3_A9605FacFirma ;
   private String[] P0APS3_A14236FacSerAT ;
   private String[] P0APS3_A14237FacTipAT ;
   private String[] P0APS3_A437FacFpg ;
   private byte[] P0APS3_A435FacEst ;
   private java.math.BigDecimal[] P0APS3_A9643FacLiq1 ;
   private java.math.BigDecimal[] P0APS3_A9644FacLiq2 ;
   private java.math.BigDecimal[] P0APS3_A9645FacIva1 ;
   private java.math.BigDecimal[] P0APS3_A9646FacTot1 ;
   private int[] P0APS3_A252CliCod ;
   private java.math.BigDecimal[] P0APS3_A11513FacRecIca ;
   private java.math.BigDecimal[] P0APS3_A8346FacRecI ;
   private boolean[] P0APS3_n8346FacRecI ;
   private java.math.BigDecimal[] P0APS3_A7212FacRect ;
   private java.math.BigDecimal[] P0APS3_A453FacRECPor ;
   private java.math.BigDecimal[] P0APS3_A14224FacCostFac ;
   private java.math.BigDecimal[] P0APS3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P0APS3_A14222FacCostMts ;
   private java.math.BigDecimal[] P0APS3_A434FacDtoPP ;
   private java.math.BigDecimal[] P0APS3_A433FacDtoGen ;
   private byte[] P0APS3_A443FacIVAPor ;
   private java.math.BigDecimal[] P0APS3_A14219FacEnergia ;
   private byte[] P0APS4_A7209Colombia ;
   private boolean[] P0APS4_n7209Colombia ;
   private java.math.BigDecimal[] P0APS6_A3918FacImpTot1 ;
   private String[] P0APS7_A278CliNif ;
   private String[] P0APS7_A13236CliFacMtsP ;
   private String[] P0APS7_A13012CliImpReop ;
   private short[] P0APS7_A858ZonGeoCod ;
   private String[] P0APS7_A4828CliCp2 ;
   private String[] P0APS7_A256CliCp ;
   private String[] P0APS7_A295CliPob ;
   private String[] P0APS7_A279CliNom ;
   private String[] P0APS7_A260CliDom ;
   private String[] P0APS8_A396EmprCod ;
   private int[] P0APS8_A430FacCod ;
   private byte[] P0APS8_A956FacVtoLin ;
   private java.util.Date[] P0APS8_A957FacVtoFch ;
   private boolean[] P0APS8_n957FacVtoFch ;
   private String[] P0APS9_A396EmprCod ;
   private int[] P0APS9_A430FacCod ;
   private long[] P0APS9_A427FacAlbCod ;
   private String[] P0APS9_A3397FacFasCod ;
   private java.math.BigDecimal[] P0APS9_A444FacKgs ;
   private String[] P0APS9_A3878FacColNom ;
   private int[] P0APS9_A3879FocColNum ;
   private String[] P0APS9_A1498FacDisNum ;
   private byte[] P0APS9_A428FacAlbTip ;
   private String[] P0APS9_A454FacSer ;
   private java.math.BigDecimal[] P0APS9_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P0APS9_A448FacPreKgs ;
   private java.math.BigDecimal[] P0APS9_A5050FacBonLi ;
   private java.math.BigDecimal[] P0APS9_A451FacRec ;
   private java.math.BigDecimal[] P0APS9_A5353FacImpMan ;
   private java.math.BigDecimal[] P0APS9_A449FacPreMts ;
   private java.math.BigDecimal[] P0APS9_A447FacMts ;
   private int[] P0APS9_A12197FacUnds ;
   private java.math.BigDecimal[] P0APS9_A12198FacPreUnd ;
   private String[] P0APS9_A432FacDsc ;
   private String[] P0APS9_A1296FacBarPar ;
   private byte[] P0APS9_A1295FacBarReo ;
   private int[] P0APS9_A1294FacBarCod ;
   private int[] P0APS9_A446FacLin ;
   private String[] P0APS12_A396EmprCod ;
   private String[] P0APS12_A130BarCodPar ;
   private byte[] P0APS12_A132BarCodReo ;
   private int[] P0APS12_A129BarCod ;
   private String[] P0APS12_A1652BarSerDsc ;
   private String[] P0APS12_A135BarColNom ;
   private int[] P0APS12_A136BarColNum ;
   private String[] P0APS12_A2829BarProPer ;
   private byte[] P0APS12_A14330BarPriorid ;
   private String[] P0APS12_A2010BarTipDis ;
   private java.math.BigDecimal[] P0APS12_A166BarKgm ;
   private java.math.BigDecimal[] P0APS12_A184BarMtr ;
   private String[] P0APS13_A396EmprCod ;
   private String[] P0APS13_A497FpgCod ;
   private String[] P0APS13_A498FpgDsc ;
   private boolean[] P0APS13_n498FpgDsc ;
   private String[] P0APS14_A396EmprCod ;
   private long[] P0APS14_A30AlbProCod ;
   private java.util.Date[] P0APS14_A34AlbProfch ;
   private String[] P0APS15_A396EmprCod ;
   private int[] P0APS15_A14AlbComCod ;
   private java.util.Date[] P0APS15_A17AlbComFch ;
   private String[] P0APS16_A396EmprCod ;
   private String[] P0APS16_A10887Cod_Idtx ;
   private String[] P0APS16_A10888Dsc_Idtx ;
   private boolean[] P0APS16_n10888Dsc_Idtx ;
   private String[] P0APS16_A12703Imp_Idtx ;
   private boolean[] P0APS16_n12703Imp_Idtx ;
}

final  class pwfacm21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APS2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS3", "SELECT EmprCod, FacCod, FacPri, FacIDATe, FacFch, FacFirma, FacSerAT, FacTipAT, FacFpg, FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1, CliCod, FacRecIca, FacRecI, FacRect, FacRECPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoPP, FacDtoGen, FacIVAPor, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS4", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS6", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS7", "SELECT CliNif, CliFacMtsP, CliImpReop, ZonGeoCod, CliCp2, CliCp, CliPob, CliNom, CliDom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS8", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0APS9", "SELECT EmprCod, FacCod, FacAlbCod, FacFasCod, FacKgs, FacColNom, FocColNum, FacDisNum, FacAlbTip, FacSer, FacPreKgsA, FacPreKgs, FacBonLi, FacRec, FacImpMan, FacPreMts, FacMts, FacUnds, FacPreUnd, FacDsc, FacBarPar, FacBarReo, FacBarCod, FacLin FROM TXPLFAVEN WHERE (EmprCod = ?) AND (FacCod = ?) ORDER BY FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0APS10", "UPDATE TXPCFAVEN SET FacEst=?, FacLiq1=?, FacLiq2=?, FacIva1=?, FacTot1=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P0APS12", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarProPer, T1.BarPriorid, T1.BarTipDis, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS13", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS14", "SELECT EmprCod, AlbProCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS15", "SELECT EmprCod, AlbComCod, AlbComFch FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0APS16", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx, Imp_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((byte[]) buf[25])[0] = rslt.getByte(25);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 34);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,5);
               ((String[]) buf[19])[0] = rslt.getString(20, 40);
               ((String[]) buf[20])[0] = rslt.getString(21, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

