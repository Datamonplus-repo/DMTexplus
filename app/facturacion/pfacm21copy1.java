package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfacm21copy1 extends GXReport
{
   public pfacm21copy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacm21copy1.class ), "" );
   }

   public pfacm21copy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           byte[] aP7 ,
                           byte[] aP8 )
   {
      pfacm21copy1.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             byte[] aP9 )
   {
      pfacm21copy1.this.AV133ReportInPut = aP0;
      pfacm21copy1.this.A396EmprCod = aP1[0];
      this.aP1 = aP1;
      pfacm21copy1.this.A430FacCod = aP2[0];
      this.aP2 = aP2;
      pfacm21copy1.this.AV103ImpCod = aP3[0];
      this.aP3 = aP3;
      pfacm21copy1.this.AV162ValEuro = aP4[0];
      this.aP4 = aP4;
      pfacm21copy1.this.AV150TextoCopia = aP5[0];
      this.aP5 = aP5;
      pfacm21copy1.this.Gx_out = aP6[0];
      this.aP6 = aP6;
      pfacm21copy1.this.AV65F_header = aP7[0];
      this.aP7 = aP7;
      pfacm21copy1.this.AV8Agr_Fases = aP8[0];
      this.aP8 = aP8;
      pfacm21copy1.this.AV166VerSumTot = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 15 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV133ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*15)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV51ContDsc20 ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACMOD", ""), GXv_char1) ;
         pfacm21copy1.this.AV51ContDsc20 = GXv_char1[0] ;
         GXt_char2 = AV92FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDIG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pfacm21copy1.this.A396EmprCod = GXv_char1[0] ;
         pfacm21copy1.this.GXt_char2 = GXv_char4[0] ;
         AV92FirmaD = GXt_char2 ;
         GXt_int5 = AV64existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pfacm21copy1.this.GXt_int5 = GXv_int6[0] ;
         AV64existefirmad = GXt_int5 ;
         GXt_int5 = (byte)(AV95flax2) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FLAX2", ""), GXv_int6) ;
         pfacm21copy1.this.GXt_int5 = GXv_int6[0] ;
         AV95flax2 = GXt_int5 ;
         AV50Contdsc = GXutil.substring( AV51ContDsc20, 1, 14) ;
         AV135SumSig = DecimalUtil.doubleToDec(0) ;
         AV157TSumSig = DecimalUtil.doubleToDec(0) ;
         AV53CtrlPag = (byte)(0) ;
         AV122NumLin = (byte)(1) ;
         /* Using cursor P0ANX2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0ANX2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0ANX2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0ANX2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0ANX2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0ANX2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0ANX2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0ANX2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0ANX2_n8336EmpItm3[0] ;
            A395EmprCif = P0ANX2_A395EmprCif[0] ;
            n395EmprCif = P0ANX2_n395EmprCif[0] ;
            AV145Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV146Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV63EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_int5 = AV127PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pfacm21copy1.this.GXt_int5 = GXv_int6[0] ;
         AV127PQrcode = GXt_int5 ;
         AV115Linea_s = (byte)(26) ;
         if ( AV65F_header == 2 )
         {
            AV115Linea_s = (byte)(35) ;
         }
         AV49codValidacaoSerie = "" ;
         AV16atcud = "" ;
         GxHdr3 = true ;
         /* Using cursor P0ANX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A450FacPri = P0ANX3_A450FacPri[0] ;
            A14230FacIDATe = P0ANX3_A14230FacIDATe[0] ;
            A9605FacFirma = P0ANX3_A9605FacFirma[0] ;
            A437FacFpg = P0ANX3_A437FacFpg[0] ;
            A435FacEst = P0ANX3_A435FacEst[0] ;
            A9643FacLiq1 = P0ANX3_A9643FacLiq1[0] ;
            A9644FacLiq2 = P0ANX3_A9644FacLiq2[0] ;
            A9645FacIva1 = P0ANX3_A9645FacIva1[0] ;
            A9646FacTot1 = P0ANX3_A9646FacTot1[0] ;
            A436FacFch = P0ANX3_A436FacFch[0] ;
            A252CliCod = P0ANX3_A252CliCod[0] ;
            A11513FacRecIca = P0ANX3_A11513FacRecIca[0] ;
            A8346FacRecI = P0ANX3_A8346FacRecI[0] ;
            n8346FacRecI = P0ANX3_n8346FacRecI[0] ;
            A7212FacRect = P0ANX3_A7212FacRect[0] ;
            A453FacRECPor = P0ANX3_A453FacRECPor[0] ;
            A14224FacCostFac = P0ANX3_A14224FacCostFac[0] ;
            A14223FacCostKgs = P0ANX3_A14223FacCostKgs[0] ;
            A14222FacCostMts = P0ANX3_A14222FacCostMts[0] ;
            A434FacDtoPP = P0ANX3_A434FacDtoPP[0] ;
            A433FacDtoGen = P0ANX3_A433FacDtoGen[0] ;
            A443FacIVAPor = P0ANX3_A443FacIVAPor[0] ;
            A14219FacEnergia = P0ANX3_A14219FacEnergia[0] ;
            /* Using cursor P0ANX4 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A7209Colombia = P0ANX4_A7209Colombia[0] ;
            n7209Colombia = P0ANX4_n7209Colombia[0] ;
            /* Using cursor P0ANX6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(3) != 101) )
            {
               A3918FacImpTot1 = P0ANX6_A3918FacImpTot1[0] ;
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
            /* Using cursor P0ANX7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            A13236CliFacMtsP = P0ANX7_A13236CliFacMtsP[0] ;
            A13012CliImpReop = P0ANX7_A13012CliImpReop[0] ;
            A858ZonGeoCod = P0ANX7_A858ZonGeoCod[0] ;
            A4828CliCp2 = P0ANX7_A4828CliCp2[0] ;
            A256CliCp = P0ANX7_A256CliCp[0] ;
            A278CliNif = P0ANX7_A278CliNif[0] ;
            A295CliPob = P0ANX7_A295CliPob[0] ;
            A260CliDom = P0ANX7_A260CliDom[0] ;
            A279CliNom = P0ANX7_A279CliNom[0] ;
            if ( GXutil.strcmp(A450FacPri, "1") == 0 )
            {
               AV49codValidacaoSerie = A14230FacIDATe ;
               AV16atcud = ((GXutil.strcmp("", AV49codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV49codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A430FacCod, 8, 0))) ;
            }
            AV91Firma4dig = GXutil.substring( A9605FacFirma, 1, 1) + GXutil.substring( A9605FacFirma, 11, 1) + GXutil.substring( A9605FacFirma, 21, 1) + GXutil.substring( A9605FacFirma, 31, 1) ;
            AV151TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV63EmprCif) + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A278CliNif) + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "D:", "") + httpContext.getMessage( "FT", "") + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV15anyo = (short)(GXutil.year( A436FacFch)) ;
            AV118Mes = (byte)(GXutil.month( A436FacFch)) ;
            AV56dia = (byte)(GXutil.day( A436FacFch)) ;
            AV151TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV15anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV118Mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV56dia, 2, 0)), (short)(2), "0") + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "G:", "") + httpContext.getMessage( "FT", "") + "1" + "/" + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "H:", "") + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "I1:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "I2:", "") + "0" + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "I3:", "") + "0" + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "I4:", "") + "0" + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "I5:", "") + "0" + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "I6:", "") + "0" + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "I7:", "") + GXutil.trim( GXutil.str( A441FacImpTot, 13, 2)) + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "I8:", "") + GXutil.trim( GXutil.str( A442FacIVAImp, 11, 2)) + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "L:", "") + "0" + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "M:", "") + "0" + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "N:", "") + GXutil.trim( GXutil.str( A442FacIVAImp, 11, 2)) + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "O:", "") + GXutil.trim( GXutil.str( A455FacTot, 13, 2)) + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "P:", "") + "0" + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "Q:", "") + AV91Firma4dig + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV92FirmaD) + "*" ;
            AV151TextoGenerar += httpContext.getMessage( "S:", "") + GXutil.trim( GXutil.str( A455FacTot, 13, 2)) + "*" ;
            AV171Dpi = (short)(300) ;
            AV170Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV172Pixel = (short)(DecimalUtil.decToDouble(AV170Centimetos.multiply(DecimalUtil.doubleToDec(AV171Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV161Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV151TextoGenerar, AV172Pixel, AV172Pixel, GXv_char4) ;
            pfacm21copy1.this.GXt_char2 = GXv_char4[0] ;
            AV161Url = GXt_char2 ;
            AV102Imagen = AV161Url ;
            AV178Imagen_GXI = GXDbFile.pathToUrl( AV161Url, context.getHttpContext()) ;
            AV40CliFacMtsP = A13236CliFacMtsP ;
            AV42CliNif = A278CliNif ;
            AV97FpgCod = A437FacFpg ;
            AV41CliImpReop = A13012CliImpReop ;
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
            AV55DesPago = GXutil.substring( AV98FpgDsc, 1, 30) ;
            AV94FlagPag = (byte)(0) ;
            AV37CliCod = A252CliCod ;
            AV47CliPri = A450FacPri ;
            AV76FacFch = A436FacFch ;
            AV71FacCod = A430FacCod ;
            AV169ZONGEOCOD = A858ZonGeoCod ;
            if ( AV169ZONGEOCOD == 999 )
            {
               AV148Texto_i = httpContext.getMessage( "ISENTO IVA AO ABRIGO DA ALINEA a) DO ARTIGO 14 DO RITI", "") ;
            }
            else
            {
               AV148Texto_i = "" ;
            }
            AV123Paso = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV165Vencim[GX_I-1] = GXutil.nullDate() ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P0ANX8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A956FacVtoLin = P0ANX8_A956FacVtoLin[0] ;
               A957FacVtoFch = P0ANX8_A957FacVtoFch[0] ;
               n957FacVtoFch = P0ANX8_n957FacVtoFch[0] ;
               AV123Paso = (byte)(AV123Paso+1) ;
               AV165Vencim[AV123Paso-1] = A957FacVtoFch ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV75Facdtopp = A434FacDtoPP ;
            AV79FacImpTot = A441FacImpTot ;
            AV78FacImpPP = A440FacImpPP ;
            AV77FacImpGen = A439FacImpGen ;
            AV74FacDtoGen = A433FacDtoGen ;
            AV80FacIvaImp = A442FacIVAImp ;
            AV86FacTot = A455FacTot ;
            AV69FacBasImp = A429FacBasImp ;
            AV81FacIvaPor = A443FacIVAPor ;
            AV108ImpPenDto = DecimalUtil.doubleToDec(0) ;
            AV152TotFac = GXutil.roundDecimal( (A455FacTot.multiply(AV162ValEuro)), 0) ;
            AV38Clicp_t = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            AV52Cp_pob = GXutil.trim( AV38Clicp_t) + " " + GXutil.trim( A295CliPob) ;
            AV147Texto_fd = " " ;
            if ( GXutil.strcmp(A9605FacFirma, " ") != 0 )
            {
               AV91Firma4dig = GXutil.substring( A9605FacFirma, 1, 1) + GXutil.substring( A9605FacFirma, 11, 1) + GXutil.substring( A9605FacFirma, 21, 1) + GXutil.substring( A9605FacFirma, 31, 1) ;
               AV147Texto_fd = AV91Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV92FirmaD) + httpContext.getMessage( "/DGCI", "") ;
            }
            AV122NumLin = (byte)(0) ;
            AV93FlagNoFin = (byte)(0) ;
            /* Using cursor P0ANX9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               brkANX6 = false ;
               A427FacAlbCod = P0ANX9_A427FacAlbCod[0] ;
               A3397FacFasCod = P0ANX9_A3397FacFasCod[0] ;
               A444FacKgs = P0ANX9_A444FacKgs[0] ;
               A3878FacColNom = P0ANX9_A3878FacColNom[0] ;
               A3879FocColNum = P0ANX9_A3879FocColNum[0] ;
               A1498FacDisNum = P0ANX9_A1498FacDisNum[0] ;
               A428FacAlbTip = P0ANX9_A428FacAlbTip[0] ;
               A454FacSer = P0ANX9_A454FacSer[0] ;
               A3898FacPreKgsA = P0ANX9_A3898FacPreKgsA[0] ;
               A448FacPreKgs = P0ANX9_A448FacPreKgs[0] ;
               A5050FacBonLi = P0ANX9_A5050FacBonLi[0] ;
               A451FacRec = P0ANX9_A451FacRec[0] ;
               A5353FacImpMan = P0ANX9_A5353FacImpMan[0] ;
               A449FacPreMts = P0ANX9_A449FacPreMts[0] ;
               A447FacMts = P0ANX9_A447FacMts[0] ;
               A432FacDsc = P0ANX9_A432FacDsc[0] ;
               A1296FacBarPar = P0ANX9_A1296FacBarPar[0] ;
               A1295FacBarReo = P0ANX9_A1295FacBarReo[0] ;
               A1294FacBarCod = P0ANX9_A1294FacBarCod[0] ;
               A446FacLin = P0ANX9_A446FacLin[0] ;
               if ( AV122NumLin >= AV115Linea_s )
               {
                  AV93FlagNoFin = (byte)(1) ;
                  AV122NumLin = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV67FacAlbCod = A427FacAlbCod ;
               AV68FacAlbTip = A428FacAlbTip ;
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
               hANX0( false, 31) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "G.R.nº", ""), 174, Gx_line+6, 209, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9")), 240, Gx_line+6, 314, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 320, Gx_line+6, 336, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV13AlbProFch, "99/99/99"), 343, Gx_line+6, 394, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
               AV122NumLin = (byte)(AV122NumLin+2) ;
               AV67FacAlbCod = A427FacAlbCod ;
               AV113Last_hdr = "" ;
               while ( (pr_default.getStatus(6) != 101) && ( P0ANX9_A427FacAlbCod[0] == A427FacAlbCod ) )
               {
                  brkANX6 = false ;
                  A3397FacFasCod = P0ANX9_A3397FacFasCod[0] ;
                  A444FacKgs = P0ANX9_A444FacKgs[0] ;
                  A3878FacColNom = P0ANX9_A3878FacColNom[0] ;
                  A3879FocColNum = P0ANX9_A3879FocColNum[0] ;
                  A1498FacDisNum = P0ANX9_A1498FacDisNum[0] ;
                  A428FacAlbTip = P0ANX9_A428FacAlbTip[0] ;
                  A454FacSer = P0ANX9_A454FacSer[0] ;
                  A3898FacPreKgsA = P0ANX9_A3898FacPreKgsA[0] ;
                  A448FacPreKgs = P0ANX9_A448FacPreKgs[0] ;
                  A5050FacBonLi = P0ANX9_A5050FacBonLi[0] ;
                  A451FacRec = P0ANX9_A451FacRec[0] ;
                  A5353FacImpMan = P0ANX9_A5353FacImpMan[0] ;
                  A449FacPreMts = P0ANX9_A449FacPreMts[0] ;
                  A447FacMts = P0ANX9_A447FacMts[0] ;
                  A432FacDsc = P0ANX9_A432FacDsc[0] ;
                  A1296FacBarPar = P0ANX9_A1296FacBarPar[0] ;
                  A1295FacBarReo = P0ANX9_A1295FacBarReo[0] ;
                  A1294FacBarCod = P0ANX9_A1294FacBarCod[0] ;
                  A446FacLin = P0ANX9_A446FacLin[0] ;
                  if ( GXutil.strcmp(P0ANX9_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P0ANX9_A430FacCod[0] == A430FacCod )
                     {
                        if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
                        {
                           AV99Hdr = GXutil.str( A1294FacBarCod, 8, 0) + "-" + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                           AV100Hdri = ((GXutil.strcmp(AV41CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A1294FacBarCod, 8, 0) : ((A1295FacBarReo==0) ? GXutil.str( A1294FacBarCod, 8, 0) : GXutil.str( A1294FacBarCod, 8, 0)+" "+GXutil.str( A1295FacBarReo, 1, 0))) ;
                           AV82FacKgs = A444FacKgs ;
                           if ( ( GXutil.strcmp(AV99Hdr, AV113Last_hdr) != 0 ) && ! (GXutil.strcmp("", AV113Last_hdr)==0) )
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
                              if ( AV34BarPrioridad == 1 )
                              {
                                 if ( (0==AV95flax2) )
                                 {
                                    hANX0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "EUROPEAN FLAX® certified – certificate nº BVFR7338110", ""), 159, Gx_line+0, 493, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                 }
                                 else
                                 {
                                    hANX0( false, 21) ;
                                    getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "efb75222-fef4-40ba-b66f-a0dbfd02f4ba", "", context.getHttpContext().getTheme( )), 159, Gx_line+0, 553, Gx_line+18) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+21) ;
                                 }
                              }
                           }
                           AV35BarSerDsc = " " ;
                           AV23BarCod = A1294FacBarCod ;
                           AV27BarCodReo = A1295FacBarReo ;
                           AV25BarCodPar = A1296FacBarPar ;
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
                           AV29BarColNom = ((GXutil.strcmp("", A3878FacColNom)==0) ? AV29BarColNom : A3878FacColNom) ;
                           AV30BarColNum = ((0==A3879FocColNum) ? AV30BarColNum : A3879FocColNum) ;
                           AV72FacDisNum = GXutil.substring( A1498FacDisNum, 1, 6) ;
                           if ( A428FacAlbTip == 1 )
                           {
                              if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) != 0 )
                              {
                                 if ( AV122NumLin >= AV115Linea_s )
                                 {
                                    AV122NumLin = (byte)(1) ;
                                    AV93FlagNoFin = (byte)(1) ;
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                 }
                                 AV155TotLin2 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                                 AV154TotLin = GXutil.roundDecimal( AV155TotLin2, 2) ;
                                 AV129Precio = A448FacPreKgs ;
                                 AV62Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                 AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (A444FacKgs.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                 if ( A5353FacImpMan.doubleValue() > 0 )
                                 {
                                    AV154TotLin = A5353FacImpMan ;
                                    AV129Precio = DecimalUtil.doubleToDec(0) ;
                                 }
                                 if ( AV154TotLin.doubleValue() == 0 )
                                 {
                                    AV129Precio = DecimalUtil.doubleToDec(0) ;
                                    AV62Dto = DecimalUtil.doubleToDec(0) ;
                                 }
                                 if ( GXutil.strcmp(AV40CliFacMtsP, httpContext.getMessage( "S", "")) == 0 )
                                 {
                                 }
                                 else
                                 {
                                    hANX0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1498FacDisNum, "")), 35, Gx_line+0, 119, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Hdri, "")), 98, Gx_line+0, 156, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35BarSerDsc, "")), 179, Gx_line+0, 315, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29BarColNom, "")), 373, Gx_line+0, 426, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30BarColNum), "ZZZZZ9")), 449, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 556, Gx_line+0, 613, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31BarKgm, "ZZZZZ9.99")), 498, Gx_line+0, 555, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "kg", ""), 614, Gx_line+0, 629, Gx_line+14, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                    AV122NumLin = (byte)(AV122NumLin+1) ;
                                    if ( GXutil.strcmp(AV61Dsc_Idtx, " ") != 0 )
                                    {
                                       if ( AV122NumLin >= AV115Linea_s )
                                       {
                                          AV122NumLin = (byte)(1) ;
                                          AV93FlagNoFin = (byte)(1) ;
                                          /* Eject command */
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(P_lines+1) ;
                                       }
                                       hANX0( false, 18) ;
                                       getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Dsc_Idtx, "")), 179, Gx_line+2, 493, Gx_line+18, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+18) ;
                                       AV122NumLin = (byte)(AV122NumLin+1) ;
                                    }
                                 }
                                 AV135SumSig = AV135SumSig.add(AV154TotLin) ;
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV155TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                                    AV154TotLin = GXutil.roundDecimal( AV155TotLin2, 2) ;
                                    AV129Precio = A449FacPreMts ;
                                    AV62Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                    AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (A447FacMts.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                    if ( A5353FacImpMan.doubleValue() > 0 )
                                    {
                                       AV154TotLin = A5353FacImpMan ;
                                       AV129Precio = DecimalUtil.doubleToDec(0) ;
                                    }
                                    if ( AV122NumLin >= AV115Linea_s )
                                    {
                                       AV122NumLin = (byte)(1) ;
                                       AV93FlagNoFin = (byte)(1) ;
                                       /* Eject command */
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(P_lines+1) ;
                                    }
                                    if ( AV154TotLin.doubleValue() == 0 )
                                    {
                                       AV129Precio = DecimalUtil.doubleToDec(0) ;
                                       AV62Dto = DecimalUtil.doubleToDec(0) ;
                                    }
                                    hANX0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 556, Gx_line+0, 613, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32BarMtr, "ZZZZZ9.99")), 498, Gx_line+0, 555, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 614, Gx_line+0, 630, Gx_line+15, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                    AV135SumSig = AV135SumSig.add(AV154TotLin) ;
                                    AV122NumLin = (byte)(AV122NumLin+1) ;
                                 }
                                 if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                                 {
                                    AV155TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                                    AV154TotLin = GXutil.roundDecimal( AV155TotLin2, 2) ;
                                    AV129Precio = A449FacPreMts ;
                                    AV62Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                    AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (A447FacMts.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                    if ( A5353FacImpMan.doubleValue() > 0 )
                                    {
                                       AV154TotLin = A5353FacImpMan ;
                                       AV129Precio = DecimalUtil.doubleToDec(0) ;
                                    }
                                    if ( AV122NumLin >= AV115Linea_s )
                                    {
                                       AV122NumLin = (byte)(1) ;
                                       AV93FlagNoFin = (byte)(1) ;
                                       /* Eject command */
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(P_lines+1) ;
                                    }
                                    if ( AV154TotLin.doubleValue() == 0 )
                                    {
                                       AV129Precio = DecimalUtil.doubleToDec(0) ;
                                       AV62Dto = DecimalUtil.doubleToDec(0) ;
                                    }
                                    hANX0( false, 16) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 556, Gx_line+0, 613, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35BarSerDsc, "")), 179, Gx_line+0, 315, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29BarColNom, "")), 373, Gx_line+0, 426, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30BarColNum), "ZZZZZ9")), 449, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32BarMtr, "ZZZZZ9.99")), 498, Gx_line+0, 555, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1498FacDisNum, "")), 35, Gx_line+0, 119, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Hdri, "")), 98, Gx_line+0, 156, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 614, Gx_line+0, 630, Gx_line+14, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                    AV135SumSig = AV135SumSig.add(AV154TotLin) ;
                                    AV122NumLin = (byte)(AV122NumLin+1) ;
                                 }
                              }
                              if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) == 0 )
                              {
                                 AV155TotLin2 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                                 AV154TotLin = GXutil.roundDecimal( AV155TotLin2, 2) ;
                                 AV129Precio = A448FacPreKgs ;
                                 AV62Dto = A451FacRec.subtract(A5050FacBonLi) ;
                                 AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (A444FacKgs.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                                 AV82FacKgs = A444FacKgs ;
                                 if ( AV122NumLin >= AV115Linea_s )
                                 {
                                    AV122NumLin = (byte)(1) ;
                                    AV93FlagNoFin = (byte)(1) ;
                                    /* Eject command */
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(P_lines+1) ;
                                 }
                                 if ( AV154TotLin.doubleValue() == 0 )
                                 {
                                    AV129Precio = DecimalUtil.doubleToDec(0) ;
                                    AV62Dto = DecimalUtil.doubleToDec(0) ;
                                 }
                                 hANX0( false, 16) ;
                                 getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 179, Gx_line+0, 388, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82FacKgs, "Z,ZZZ.99")), 563, Gx_line+0, 614, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 617, Gx_line+0, 626, Gx_line+14, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+16) ;
                                 AV135SumSig = AV135SumSig.add(AV154TotLin) ;
                                 AV122NumLin = (byte)(AV122NumLin+1) ;
                              }
                           }
                           if ( A428FacAlbTip == 2 )
                           {
                              AV155TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                              AV154TotLin = GXutil.roundDecimal( AV155TotLin2, 2) ;
                              AV129Precio = A449FacPreMts ;
                              AV62Dto = A451FacRec.subtract(A5050FacBonLi) ;
                              AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (A447FacMts.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                              if ( AV122NumLin >= AV115Linea_s )
                              {
                                 AV93FlagNoFin = (byte)(1) ;
                                 AV122NumLin = (byte)(1) ;
                                 /* Eject command */
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(P_lines+1) ;
                              }
                              if ( AV154TotLin.doubleValue() == 0 )
                              {
                                 AV129Precio = DecimalUtil.doubleToDec(0) ;
                                 AV62Dto = DecimalUtil.doubleToDec(0) ;
                              }
                              hANX0( false, 16) ;
                              getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 179, Gx_line+0, 388, Gx_line+16, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 556, Gx_line+0, 613, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+16) ;
                              AV135SumSig = AV135SumSig.add(AV154TotLin) ;
                              AV122NumLin = (byte)(AV122NumLin+1) ;
                           }
                           AV113Last_hdr = AV99Hdr ;
                        }
                     }
                  }
                  brkANX6 = true ;
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
               if ( AV34BarPrioridad == 1 )
               {
                  if ( AV122NumLin >= AV115Linea_s )
                  {
                     AV122NumLin = (byte)(1) ;
                     AV93FlagNoFin = (byte)(1) ;
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                  }
                  hANX0( false, 16) ;
                  getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "EUROPEAN FLAX® certified – certificate nº BVFR7338110", ""), 159, Gx_line+0, 493, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
                  AV122NumLin = (byte)(AV122NumLin+1) ;
               }
               if ( ! brkANX6 )
               {
                  brkANX6 = true ;
                  pr_default.readNext(6);
               }
            }
            pr_default.close(6);
            if ( ( AV64existefirmad == 1 ) && (GXutil.strcmp("", A9605FacFirma)==0) )
            {
               hANX0( false, 31) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 183, Gx_line+0, 602, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            A9643FacLiq1 = AV79FacImpTot ;
            A9644FacLiq2 = GXutil.roundDecimal( AV21Aux4, 2) ;
            A9645FacIva1 = GXutil.roundDecimal( A9644FacLiq2.multiply(DecimalUtil.doubleToDec(AV81FacIvaPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            A9646FacTot1 = A9644FacLiq2.add(A9645FacIva1) ;
            /* Using cursor P0ANX10 */
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
         AV157TSumSig = AV157TSumSig.add(AV135SumSig) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hANX0( true, 0) ;
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
      AV24BarCodL = (int)(GXutil.lval( GXutil.substring( AV113Last_hdr, 1, 8))) ;
      AV28BarCodReoL = (byte)(GXutil.lval( GXutil.substring( AV113Last_hdr, 10, 1))) ;
      AV26BarCodParL = GXutil.substring( AV113Last_hdr, 11, 1) ;
      AV87FasesDsc = "" ;
      if ( AV8Agr_Fases == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A430FacCod ;
         GXv_int8[0] = AV67FacAlbCod ;
         GXv_int9[0] = AV24BarCodL ;
         GXv_int6[0] = AV28BarCodReoL ;
         GXv_char3[0] = AV26BarCodParL ;
         GXv_char1[0] = AV87FasesDsc ;
         GXv_decimal10[0] = AV129Precio ;
         GXv_decimal11[0] = AV82FacKgs ;
         GXv_decimal12[0] = AV154TotLin ;
         GXv_int13[0] = AV101i ;
         GXv_decimal14[0] = AV70FacBonLi ;
         GXv_decimal15[0] = AV85FacRec ;
         new app.pfacmod2(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_int9, GXv_int6, GXv_char3, GXv_char1, GXv_decimal10, GXv_decimal11, GXv_decimal12, AV138Tab_dsc, AV139Tab_imp, AV140Tab_kgs, AV142Tab_prec, GXv_int13, AV137Tab_Bon, AV143Tab_Rec, GXv_decimal14, GXv_decimal15) ;
         pfacm21copy1.this.A396EmprCod = GXv_char4[0] ;
         pfacm21copy1.this.A430FacCod = GXv_int7[0] ;
         pfacm21copy1.this.AV67FacAlbCod = GXv_int8[0] ;
         pfacm21copy1.this.AV24BarCodL = GXv_int9[0] ;
         pfacm21copy1.this.AV28BarCodReoL = GXv_int6[0] ;
         pfacm21copy1.this.AV26BarCodParL = GXv_char3[0] ;
         pfacm21copy1.this.AV87FasesDsc = GXv_char1[0] ;
         pfacm21copy1.this.AV129Precio = GXv_decimal10[0] ;
         pfacm21copy1.this.AV82FacKgs = GXv_decimal11[0] ;
         pfacm21copy1.this.AV154TotLin = GXv_decimal12[0] ;
         pfacm21copy1.this.AV101i = GXv_int13[0] ;
         pfacm21copy1.this.AV70FacBonLi = GXv_decimal14[0] ;
         pfacm21copy1.this.AV85FacRec = GXv_decimal15[0] ;
      }
      else
      {
         if ( AV8Agr_Fases == 2 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int9[0] = A430FacCod ;
            GXv_int8[0] = AV67FacAlbCod ;
            GXv_int7[0] = AV24BarCodL ;
            GXv_int13[0] = AV28BarCodReoL ;
            GXv_char3[0] = AV26BarCodParL ;
            GXv_char1[0] = AV87FasesDsc ;
            GXv_decimal15[0] = AV129Precio ;
            GXv_decimal14[0] = AV82FacKgs ;
            GXv_decimal12[0] = AV154TotLin ;
            GXv_int6[0] = AV101i ;
            GXv_decimal11[0] = AV70FacBonLi ;
            GXv_decimal10[0] = AV85FacRec ;
            new app.pfacmod1(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char1, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV138Tab_dsc, AV139Tab_imp, AV140Tab_kgs, AV142Tab_prec, GXv_int6, AV137Tab_Bon, AV143Tab_Rec, GXv_decimal11, GXv_decimal10) ;
            pfacm21copy1.this.A396EmprCod = GXv_char4[0] ;
            pfacm21copy1.this.A430FacCod = GXv_int9[0] ;
            pfacm21copy1.this.AV67FacAlbCod = GXv_int8[0] ;
            pfacm21copy1.this.AV24BarCodL = GXv_int7[0] ;
            pfacm21copy1.this.AV28BarCodReoL = GXv_int13[0] ;
            pfacm21copy1.this.AV26BarCodParL = GXv_char3[0] ;
            pfacm21copy1.this.AV87FasesDsc = GXv_char1[0] ;
            pfacm21copy1.this.AV129Precio = GXv_decimal15[0] ;
            pfacm21copy1.this.AV82FacKgs = GXv_decimal14[0] ;
            pfacm21copy1.this.AV154TotLin = GXv_decimal12[0] ;
            pfacm21copy1.this.AV101i = GXv_int6[0] ;
            pfacm21copy1.this.AV70FacBonLi = GXv_decimal11[0] ;
            pfacm21copy1.this.AV85FacRec = GXv_decimal10[0] ;
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int9[0] = A430FacCod ;
            GXv_int8[0] = AV67FacAlbCod ;
            GXv_int7[0] = AV24BarCodL ;
            GXv_int13[0] = AV28BarCodReoL ;
            GXv_char3[0] = AV26BarCodParL ;
            GXv_char1[0] = AV87FasesDsc ;
            GXv_decimal15[0] = AV129Precio ;
            GXv_decimal14[0] = AV82FacKgs ;
            GXv_decimal12[0] = AV154TotLin ;
            GXv_int6[0] = AV101i ;
            GXv_decimal11[0] = AV70FacBonLi ;
            GXv_decimal10[0] = AV85FacRec ;
            new app.pfacmod4(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char1, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV138Tab_dsc, AV139Tab_imp, AV140Tab_kgs, AV142Tab_prec, GXv_int6, AV137Tab_Bon, AV143Tab_Rec, GXv_decimal11, GXv_decimal10) ;
            pfacm21copy1.this.A396EmprCod = GXv_char4[0] ;
            pfacm21copy1.this.A430FacCod = GXv_int9[0] ;
            pfacm21copy1.this.AV67FacAlbCod = GXv_int8[0] ;
            pfacm21copy1.this.AV24BarCodL = GXv_int7[0] ;
            pfacm21copy1.this.AV28BarCodReoL = GXv_int13[0] ;
            pfacm21copy1.this.AV26BarCodParL = GXv_char3[0] ;
            pfacm21copy1.this.AV87FasesDsc = GXv_char1[0] ;
            pfacm21copy1.this.AV129Precio = GXv_decimal15[0] ;
            pfacm21copy1.this.AV82FacKgs = GXv_decimal14[0] ;
            pfacm21copy1.this.AV154TotLin = GXv_decimal12[0] ;
            pfacm21copy1.this.AV101i = GXv_int6[0] ;
            pfacm21copy1.this.AV70FacBonLi = GXv_decimal11[0] ;
            pfacm21copy1.this.AV85FacRec = GXv_decimal10[0] ;
         }
      }
      if ( ! (GXutil.strcmp("", AV87FasesDsc)==0) )
      {
         if ( AV101i == 1 )
         {
            AV87FasesDsc = GXutil.trim( AV87FasesDsc) ;
            if ( AV122NumLin >= AV115Linea_s )
            {
               AV122NumLin = (byte)(1) ;
               AV93FlagNoFin = (byte)(1) ;
               AV53CtrlPag = (byte)(1) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            AV62Dto = AV85FacRec.subtract(AV70FacBonLi) ;
            AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (AV82FacKgs.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
            if ( AV154TotLin.doubleValue() == 0 )
            {
               AV129Precio = DecimalUtil.doubleToDec(0) ;
               AV62Dto = DecimalUtil.doubleToDec(0) ;
            }
            hANX0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87FasesDsc, "")), 85, Gx_line+0, 425, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82FacKgs, "Z,ZZZ.99")), 564, Gx_line+0, 615, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "kg", ""), 614, Gx_line+0, 629, Gx_line+14, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV135SumSig = AV135SumSig.add(AV154TotLin) ;
            AV122NumLin = (byte)(AV122NumLin+1) ;
         }
         else
         {
            AV112j = (byte)(1) ;
            while ( AV112j <= AV101i )
            {
               AV87FasesDsc = AV138Tab_dsc[AV112j-1] ;
               AV82FacKgs = AV140Tab_kgs[AV112j-1] ;
               AV129Precio = AV142Tab_prec[AV112j-1] ;
               AV154TotLin = AV139Tab_imp[AV112j-1] ;
               AV70FacBonLi = AV137Tab_Bon[AV112j-1] ;
               AV85FacRec = AV143Tab_Rec[AV112j-1] ;
               if ( AV122NumLin >= AV115Linea_s )
               {
                  AV122NumLin = (byte)(1) ;
                  AV93FlagNoFin = (byte)(1) ;
                  AV53CtrlPag = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV62Dto = AV85FacRec.subtract(AV70FacBonLi) ;
               AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (AV82FacKgs.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
               if ( AV154TotLin.doubleValue() == 0 )
               {
                  AV129Precio = DecimalUtil.doubleToDec(0) ;
                  AV62Dto = DecimalUtil.doubleToDec(0) ;
               }
               hANX0( false, 17) ;
               getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87FasesDsc, "")), 85, Gx_line+0, 425, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82FacKgs, "Z,ZZZ.99")), 564, Gx_line+0, 615, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "kg", ""), 614, Gx_line+0, 629, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV135SumSig = AV135SumSig.add(AV154TotLin) ;
               AV122NumLin = (byte)(AV122NumLin+1) ;
               AV112j = (byte)(AV112j+1) ;
            }
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'LINEASFAS2' Routine */
      returnInSub = false ;
      AV24BarCodL = (int)(GXutil.lval( GXutil.substring( AV113Last_hdr, 1, 8))) ;
      AV28BarCodReoL = (byte)(GXutil.lval( GXutil.substring( AV113Last_hdr, 10, 1))) ;
      AV26BarCodParL = GXutil.substring( AV113Last_hdr, 11, 1) ;
      AV87FasesDsc = "" ;
      if ( AV8Agr_Fases == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A430FacCod ;
         GXv_int8[0] = AV67FacAlbCod ;
         GXv_int7[0] = AV24BarCodL ;
         GXv_int13[0] = AV28BarCodReoL ;
         GXv_char3[0] = AV26BarCodParL ;
         GXv_char1[0] = AV87FasesDsc ;
         GXv_decimal15[0] = AV129Precio ;
         GXv_decimal14[0] = AV83FacMts ;
         GXv_decimal12[0] = AV154TotLin ;
         GXv_int6[0] = AV101i ;
         GXv_decimal11[0] = AV70FacBonLi ;
         GXv_decimal10[0] = AV85FacRec ;
         new app.pfacmod3(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char1, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV138Tab_dsc, AV139Tab_imp, AV141Tab_mts, AV142Tab_prec, GXv_int6, AV137Tab_Bon, AV143Tab_Rec, GXv_decimal11, GXv_decimal10) ;
         pfacm21copy1.this.A396EmprCod = GXv_char4[0] ;
         pfacm21copy1.this.A430FacCod = GXv_int9[0] ;
         pfacm21copy1.this.AV67FacAlbCod = GXv_int8[0] ;
         pfacm21copy1.this.AV24BarCodL = GXv_int7[0] ;
         pfacm21copy1.this.AV28BarCodReoL = GXv_int13[0] ;
         pfacm21copy1.this.AV26BarCodParL = GXv_char3[0] ;
         pfacm21copy1.this.AV87FasesDsc = GXv_char1[0] ;
         pfacm21copy1.this.AV129Precio = GXv_decimal15[0] ;
         pfacm21copy1.this.AV83FacMts = GXv_decimal14[0] ;
         pfacm21copy1.this.AV154TotLin = GXv_decimal12[0] ;
         pfacm21copy1.this.AV101i = GXv_int6[0] ;
         pfacm21copy1.this.AV70FacBonLi = GXv_decimal11[0] ;
         pfacm21copy1.this.AV85FacRec = GXv_decimal10[0] ;
      }
      else
      {
         if ( AV8Agr_Fases == 2 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int9[0] = A430FacCod ;
            GXv_int8[0] = AV67FacAlbCod ;
            GXv_int7[0] = AV24BarCodL ;
            GXv_int13[0] = AV28BarCodReoL ;
            GXv_char3[0] = AV26BarCodParL ;
            GXv_char1[0] = AV87FasesDsc ;
            GXv_decimal15[0] = AV129Precio ;
            GXv_decimal14[0] = AV83FacMts ;
            GXv_decimal12[0] = AV154TotLin ;
            GXv_int6[0] = AV101i ;
            GXv_decimal11[0] = AV70FacBonLi ;
            GXv_decimal10[0] = AV85FacRec ;
            new app.pfacmod5(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char1, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV138Tab_dsc, AV139Tab_imp, AV141Tab_mts, AV142Tab_prec, GXv_int6, AV137Tab_Bon, AV143Tab_Rec, GXv_decimal11, GXv_decimal10) ;
            pfacm21copy1.this.A396EmprCod = GXv_char4[0] ;
            pfacm21copy1.this.A430FacCod = GXv_int9[0] ;
            pfacm21copy1.this.AV67FacAlbCod = GXv_int8[0] ;
            pfacm21copy1.this.AV24BarCodL = GXv_int7[0] ;
            pfacm21copy1.this.AV28BarCodReoL = GXv_int13[0] ;
            pfacm21copy1.this.AV26BarCodParL = GXv_char3[0] ;
            pfacm21copy1.this.AV87FasesDsc = GXv_char1[0] ;
            pfacm21copy1.this.AV129Precio = GXv_decimal15[0] ;
            pfacm21copy1.this.AV83FacMts = GXv_decimal14[0] ;
            pfacm21copy1.this.AV154TotLin = GXv_decimal12[0] ;
            pfacm21copy1.this.AV101i = GXv_int6[0] ;
            pfacm21copy1.this.AV70FacBonLi = GXv_decimal11[0] ;
            pfacm21copy1.this.AV85FacRec = GXv_decimal10[0] ;
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int9[0] = A430FacCod ;
            GXv_int8[0] = AV67FacAlbCod ;
            GXv_int7[0] = AV24BarCodL ;
            GXv_int13[0] = AV28BarCodReoL ;
            GXv_char3[0] = AV26BarCodParL ;
            GXv_char1[0] = AV87FasesDsc ;
            GXv_decimal15[0] = AV129Precio ;
            GXv_decimal14[0] = AV83FacMts ;
            GXv_decimal12[0] = AV154TotLin ;
            GXv_int6[0] = AV101i ;
            GXv_decimal11[0] = AV70FacBonLi ;
            GXv_decimal10[0] = AV85FacRec ;
            new app.pfacmod6(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_int7, GXv_int13, GXv_char3, GXv_char1, GXv_decimal15, GXv_decimal14, GXv_decimal12, AV138Tab_dsc, AV139Tab_imp, AV141Tab_mts, AV142Tab_prec, GXv_int6, AV137Tab_Bon, AV143Tab_Rec, GXv_decimal11, GXv_decimal10) ;
            pfacm21copy1.this.A396EmprCod = GXv_char4[0] ;
            pfacm21copy1.this.A430FacCod = GXv_int9[0] ;
            pfacm21copy1.this.AV67FacAlbCod = GXv_int8[0] ;
            pfacm21copy1.this.AV24BarCodL = GXv_int7[0] ;
            pfacm21copy1.this.AV28BarCodReoL = GXv_int13[0] ;
            pfacm21copy1.this.AV26BarCodParL = GXv_char3[0] ;
            pfacm21copy1.this.AV87FasesDsc = GXv_char1[0] ;
            pfacm21copy1.this.AV129Precio = GXv_decimal15[0] ;
            pfacm21copy1.this.AV83FacMts = GXv_decimal14[0] ;
            pfacm21copy1.this.AV154TotLin = GXv_decimal12[0] ;
            pfacm21copy1.this.AV101i = GXv_int6[0] ;
            pfacm21copy1.this.AV70FacBonLi = GXv_decimal11[0] ;
            pfacm21copy1.this.AV85FacRec = GXv_decimal10[0] ;
         }
      }
      if ( ! (GXutil.strcmp("", AV87FasesDsc)==0) )
      {
         if ( AV101i == 1 )
         {
            AV87FasesDsc = GXutil.trim( AV87FasesDsc) ;
            if ( AV122NumLin >= AV115Linea_s )
            {
               AV122NumLin = (byte)(1) ;
               AV93FlagNoFin = (byte)(1) ;
               AV53CtrlPag = (byte)(1) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            AV62Dto = AV85FacRec.subtract(AV70FacBonLi) ;
            AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (AV83FacMts.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
            if ( AV154TotLin.doubleValue() == 0 )
            {
               AV129Precio = DecimalUtil.doubleToDec(0) ;
               AV62Dto = DecimalUtil.doubleToDec(0) ;
            }
            hANX0( false, 17) ;
            getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87FasesDsc, "")), 85, Gx_line+0, 425, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83FacMts, "Z,ZZZ.99")), 564, Gx_line+0, 614, Gx_line+15, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 614, Gx_line+0, 630, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV135SumSig = AV135SumSig.add(AV154TotLin) ;
            AV122NumLin = (byte)(AV122NumLin+1) ;
         }
         else
         {
            AV112j = (byte)(1) ;
            while ( AV112j <= AV101i )
            {
               AV87FasesDsc = AV138Tab_dsc[AV112j-1] ;
               AV83FacMts = AV141Tab_mts[AV112j-1] ;
               AV129Precio = AV142Tab_prec[AV112j-1] ;
               AV154TotLin = AV139Tab_imp[AV112j-1] ;
               if ( AV122NumLin >= AV115Linea_s )
               {
                  AV122NumLin = (byte)(1) ;
                  AV93FlagNoFin = (byte)(1) ;
                  AV53CtrlPag = (byte)(1) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV62Dto = AV85FacRec.subtract(AV70FacBonLi) ;
               AV108ImpPenDto = AV108ImpPenDto.add(GXutil.roundDecimal( (AV83FacMts.multiply(AV129Precio).multiply(AV62Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
               if ( AV154TotLin.doubleValue() == 0 )
               {
                  AV129Precio = DecimalUtil.doubleToDec(0) ;
                  AV62Dto = DecimalUtil.doubleToDec(0) ;
               }
               hANX0( false, 17) ;
               getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87FasesDsc, "")), 85, Gx_line+0, 425, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83FacMts, "Z,ZZZ.99")), 564, Gx_line+0, 615, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129Precio, "ZZZ.ZZZ")), 628, Gx_line+0, 673, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TotLin, "ZZ,ZZ9.99")), 722, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 614, Gx_line+0, 630, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62Dto, "ZZZ.Z")), 683, Gx_line+0, 709, Gx_line+15, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV135SumSig = AV135SumSig.add(AV154TotLin) ;
               AV122NumLin = (byte)(AV122NumLin+1) ;
               AV112j = (byte)(AV112j+1) ;
            }
         }
      }
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV35BarSerDsc = "" ;
      AV29BarColNom = "" ;
      AV30BarColNum = 0 ;
      AV61Dsc_Idtx = " " ;
      AV34BarPrioridad = (byte)(0) ;
      /* Using cursor P0ANX12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV27BarCodReo), AV25BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P0ANX12_A130BarCodPar[0] ;
         A132BarCodReo = P0ANX12_A132BarCodReo[0] ;
         A129BarCod = P0ANX12_A129BarCod[0] ;
         A1652BarSerDsc = P0ANX12_A1652BarSerDsc[0] ;
         A135BarColNom = P0ANX12_A135BarColNom[0] ;
         A136BarColNum = P0ANX12_A136BarColNum[0] ;
         A2829BarProPer = P0ANX12_A2829BarProPer[0] ;
         A14330BarPriorid = P0ANX12_A14330BarPriorid[0] ;
         A166BarKgm = P0ANX12_A166BarKgm[0] ;
         A184BarMtr = P0ANX12_A184BarMtr[0] ;
         A166BarKgm = P0ANX12_A166BarKgm[0] ;
         A184BarMtr = P0ANX12_A184BarMtr[0] ;
         AV35BarSerDsc = A1652BarSerDsc ;
         AV29BarColNom = A135BarColNom ;
         AV30BarColNum = A136BarColNum ;
         AV31BarKgm = A166BarKgm ;
         AV32BarMtr = A184BarMtr ;
         AV48Cod_Idtx = GXutil.trim( A2829BarProPer) ;
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
         AV34BarPrioridad = A14330BarPriorid ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'FORPAG' Routine */
      returnInSub = false ;
      AV98FpgDsc = "" ;
      /* Using cursor P0ANX13 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV97FpgCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A497FpgCod = P0ANX13_A497FpgCod[0] ;
         A498FpgDsc = P0ANX13_A498FpgDsc[0] ;
         n498FpgDsc = P0ANX13_n498FpgDsc[0] ;
         AV98FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'FECHALB' Routine */
      returnInSub = false ;
      if ( AV68FacAlbTip == 1 )
      {
         /* Using cursor P0ANX14 */
         pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(AV67FacAlbCod)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A30AlbProCod = P0ANX14_A30AlbProCod[0] ;
            A34AlbProfch = P0ANX14_A34AlbProfch[0] ;
            AV13AlbProFch = A34AlbProfch ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
      if ( AV68FacAlbTip == 2 )
      {
         /* Using cursor P0ANX15 */
         pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(AV67FacAlbCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A14AlbComCod = P0ANX15_A14AlbComCod[0] ;
            A17AlbComFch = P0ANX15_A17AlbComFch[0] ;
            AV13AlbProFch = A17AlbComFch ;
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
      AV61Dsc_Idtx = "" ;
      /* Using cursor P0ANX16 */
      pr_default.execute(12, new Object[] {A396EmprCod, AV48Cod_Idtx});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A10887Cod_Idtx = P0ANX16_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0ANX16_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0ANX16_n10888Dsc_Idtx[0] ;
         A12703Imp_Idtx = P0ANX16_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P0ANX16_n12703Imp_Idtx[0] ;
         AV61Dsc_Idtx = ((GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", ""))==0) ? GXutil.trim( A10888Dsc_Idtx) : " ") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void hANX0( boolean bFoot ,
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
               if ( AV93FlagNoFin == 0 )
               {
                  if ( AV166VerSumTot == 0 )
                  {
                     AV157TSumSig = DecimalUtil.doubleToDec(0) ;
                  }
                  AV149Texto_pc = httpContext.getMessage( "Processado por computador", "") ;
                  if ( GXutil.strcmp(AV147Texto_fd, " ") != 0 )
                  {
                     AV149Texto_pc = " " ;
                  }
                  if ( AV65F_header == 1 )
                  {
                     getPrinter().GxDrawRect(519, Gx_line+27, 675, Gx_line+170, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81FacIvaPor), "Z9")), 43, Gx_line+75, 59, Gx_line+92, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(500, Gx_line+21, 785, Gx_line+175, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Mercadoria/Serviços", ""), 527, Gx_line+33, 644, Gx_line+49, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Descontos Comerciais", ""), 527, Gx_line+57, 660, Gx_line+73, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Total  (EUR)", ""), 527, Gx_line+143, 597, Gx_line+159, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(27, Gx_line+21, 309, Gx_line+104, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(32, Gx_line+27, 303, Gx_line+69, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Quadro Resumo do I.V.A.", ""), 103, Gx_line+31, 247, Gx_line+47, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Incidência", ""), 111, Gx_line+46, 170, Gx_line+62, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 43, Gx_line+46, 70, Gx_line+62, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 242, Gx_line+46, 271, Gx_line+62, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69FacBasImp, "ZZ,ZZZ,ZZ9.99")), 93, Gx_line+75, 189, Gx_line+92, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 208, Gx_line+75, 304, Gx_line+92, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("%", 63, Gx_line+76, 75, Gx_line+92, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(31, Gx_line+221, 785, Gx_line+221, 1, 0, 0, 128, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79FacImpTot, "ZZ,ZZZ,ZZ9.99")), 684, Gx_line+33, 780, Gx_line+50, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77FacImpGen, "ZZ,ZZZ,ZZ9.99")), 684, Gx_line+57, 780, Gx_line+74, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69FacBasImp, "ZZ,ZZZ,ZZ9.99")), 684, Gx_line+81, 780, Gx_line+98, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86FacTot, "ZZ,ZZZ,ZZ9.99")), 684, Gx_line+143, 780, Gx_line+160, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55DesPago, "")), 65, Gx_line+156, 222, Gx_line+173, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( AV165Vencim[1-1], "99/99/99"), 319, Gx_line+156, 370, Gx_line+173, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Condição Pagamento", ""), 53, Gx_line+131, 180, Gx_line+147, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Data de Vencimento", ""), 292, Gx_line+134, 411, Gx_line+150, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Sub Total", ""), 527, Gx_line+81, 581, Gx_line+97, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Valor do I.V.A.", ""), 527, Gx_line+106, 603, Gx_line+122, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 684, Gx_line+106, 780, Gx_line+123, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV148Texto_i, "")), 242, Gx_line+0, 608, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Os produtos foram entregues na data da Guia de Remessa.", ""), 31, Gx_line+185, 372, Gx_line+200, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(28, Gx_line+16, 785, Gx_line+16, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Contdsc, "")), 636, Gx_line+203, 782, Gx_line+218, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV145Texto_1, "")), 43, Gx_line+223, 665, Gx_line+240, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV146Texto_2, "")), 82, Gx_line+239, 625, Gx_line+256, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV149Texto_pc, "")), 31, Gx_line+203, 162, Gx_line+219, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+256) ;
                  }
                  else
                  {
                     if ( AV127PQrcode == 1 )
                     {
                        getPrinter().GxAttris("Arial", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151TextoGenerar, "")), 22, Gx_line+0, 802, Gx_line+19, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+21) ;
                     }
                     getPrinter().GxDrawRect(38, Gx_line+38, 309, Gx_line+80, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(520, Gx_line+30, 670, Gx_line+173, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(27, Gx_line+20, 784, Gx_line+183, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(513, Gx_line+24, 779, Gx_line+178, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Mercadoria/Serviços", ""), 528, Gx_line+36, 645, Gx_line+52, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Descontos Comerciais", ""), 528, Gx_line+60, 661, Gx_line+76, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Total  (EUR)", ""), 528, Gx_line+146, 598, Gx_line+162, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79FacImpTot, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+36, 773, Gx_line+53, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77FacImpGen, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+60, 773, Gx_line+77, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69FacBasImp, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+84, 773, Gx_line+101, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86FacTot, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+146, 773, Gx_line+163, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Sub Total", ""), 528, Gx_line+84, 582, Gx_line+100, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Valor do I.V.A.", ""), 528, Gx_line+109, 604, Gx_line+125, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 677, Gx_line+109, 773, Gx_line+126, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(506, Gx_line+20, 506, Gx_line+184, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81FacIvaPor), "Z9")), 48, Gx_line+85, 64, Gx_line+102, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(32, Gx_line+31, 314, Gx_line+114, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Quadro Resumo do I.V.A.", ""), 108, Gx_line+42, 252, Gx_line+58, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Incidência", ""), 134, Gx_line+56, 193, Gx_line+72, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 48, Gx_line+56, 75, Gx_line+72, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 267, Gx_line+56, 296, Gx_line+72, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69FacBasImp, "ZZ,ZZZ,ZZ9.99")), 98, Gx_line+85, 194, Gx_line+102, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV80FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 201, Gx_line+85, 297, Gx_line+102, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("%", 68, Gx_line+86, 78, Gx_line+100, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55DesPago, "")), 33, Gx_line+153, 190, Gx_line+170, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Condição Pagamento", ""), 33, Gx_line+128, 160, Gx_line+144, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Data de Vencimento", ""), 197, Gx_line+128, 316, Gx_line+144, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV165Vencim[1-1], "99/99/99"), 224, Gx_line+153, 275, Gx_line+170, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(319, Gx_line+20, 319, Gx_line+184, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(27, Gx_line+203, 781, Gx_line+203, 1, 0, 0, 128, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV148Texto_i, "")), 38, Gx_line+0, 404, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Contdsc, "")), 723, Gx_line+185, 782, Gx_line+199, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV157TSumSig, "ZZ,ZZZ,ZZZ.ZZ")), 690, Gx_line+0, 772, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV145Texto_1, "")), 43, Gx_line+205, 665, Gx_line+222, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV146Texto_2, "")), 82, Gx_line+222, 625, Gx_line+239, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV149Texto_pc, "")), 27, Gx_line+184, 158, Gx_line+200, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Os produtos foram postos à disposição do cliente na data da Guia de Remessa.", ""), 214, Gx_line+184, 669, Gx_line+199, 0+256, 0, 0, 0) ;
                     sImgUrl = ((GXutil.strcmp("", AV102Imagen)==0) ? AV178Imagen_GXI : AV102Imagen) ;
                     getPrinter().GxDrawBitMap(sImgUrl, 350, Gx_line+48, 475, Gx_line+173) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16atcud, "")), 334, Gx_line+29, 491, Gx_line+45, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+239) ;
                  }
               }
               else
               {
                  if ( AV65F_header == 1 )
                  {
                     getPrinter().GxDrawRect(519, Gx_line+27, 675, Gx_line+161, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(500, Gx_line+21, 785, Gx_line+170, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(28, Gx_line+16, 785, Gx_line+16, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Mercadoria/Serviços", ""), 527, Gx_line+33, 644, Gx_line+49, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Descontos Comerciais", ""), 527, Gx_line+57, 660, Gx_line+73, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Total  (EUR)", ""), 527, Gx_line+143, 597, Gx_line+159, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(27, Gx_line+21, 309, Gx_line+104, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(32, Gx_line+27, 303, Gx_line+69, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Quadro Resumo do I.V.A.", ""), 103, Gx_line+31, 247, Gx_line+47, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Incidência", ""), 111, Gx_line+46, 170, Gx_line+62, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 43, Gx_line+46, 70, Gx_line+62, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 242, Gx_line+46, 271, Gx_line+62, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Documento Processado por Computador", ""), 32, Gx_line+0, 228, Gx_line+13, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55DesPago, "")), 70, Gx_line+168, 227, Gx_line+185, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( AV165Vencim[1-1], "99/99/99"), 324, Gx_line+168, 375, Gx_line+185, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Condição Pagamento", ""), 58, Gx_line+143, 185, Gx_line+159, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Data de Vencimento", ""), 297, Gx_line+146, 416, Gx_line+162, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Sub Total", ""), 527, Gx_line+81, 581, Gx_line+97, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Valor do I.V.A.", ""), 527, Gx_line+106, 603, Gx_line+122, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "A TRANSPORTAR", ""), 505, Gx_line+197, 609, Gx_line+213, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135SumSig, "ZZ,ZZZ,ZZ9.99")), 684, Gx_line+197, 780, Gx_line+214, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV148Texto_i, "")), 242, Gx_line+0, 608, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Os produtos foram entregues na data da Guia de Remessa.", ""), 38, Gx_line+221, 379, Gx_line+236, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(29, Gx_line+242, 783, Gx_line+242, 1, 0, 0, 128, 0) ;
                     getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Contdsc, "")), 30, Gx_line+198, 176, Gx_line+213, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV145Texto_1, "")), 43, Gx_line+244, 665, Gx_line+261, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV146Texto_2, "")), 82, Gx_line+261, 625, Gx_line+278, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+278) ;
                  }
                  else
                  {
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
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55DesPago, "")), 32, Gx_line+148, 189, Gx_line+165, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Condição Pagamento", ""), 32, Gx_line+123, 159, Gx_line+139, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Data de Vencimento", ""), 196, Gx_line+123, 315, Gx_line+139, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV165Vencim[1-1], "99/99/99"), 223, Gx_line+148, 274, Gx_line+165, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(318, Gx_line+15, 318, Gx_line+179, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV148Texto_i, "")), 38, Gx_line+0, 404, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "A TRANSPORTAR", ""), 611, Gx_line+184, 715, Gx_line+200, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135SumSig, "ZZ,ZZZ,ZZ9.99")), 686, Gx_line+184, 782, Gx_line+201, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(29, Gx_line+202, 783, Gx_line+202, 1, 0, 0, 128, 0) ;
                     getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Contdsc, "")), 30, Gx_line+184, 89, Gx_line+198, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV145Texto_1, "")), 43, Gx_line+204, 665, Gx_line+221, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV146Texto_2, "")), 82, Gx_line+222, 625, Gx_line+239, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV149Texto_pc, "")), 653, Gx_line+0, 784, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Os produtos foram postos à disposição do cliente na data da Guia de Remessa.", ""), 125, Gx_line+183, 580, Gx_line+198, 0+256, 0, 0, 0) ;
                     sImgUrl = ((GXutil.strcmp("", AV102Imagen)==0) ? AV178Imagen_GXI : AV102Imagen) ;
                     getPrinter().GxDrawBitMap(sImgUrl, 350, Gx_line+44, 475, Gx_line+169) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16atcud, "")), 340, Gx_line+25, 497, Gx_line+41, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+239) ;
                  }
                  AV93FlagNoFin = (byte)(0) ;
               }
               AV157TSumSig = AV157TSumSig.add(AV135SumSig) ;
               AV135SumSig = DecimalUtil.doubleToDec(0) ;
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
               if ( AV65F_header == 1 )
               {
                  getPrinter().GxDrawRect(579, Gx_line+264, 771, Gx_line+288, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 382, Gx_line+167, 571, Gx_line+185, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 382, Gx_line+190, 596, Gx_line+208, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 451, Gx_line+213, 640, Gx_line+231, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 336, Gx_line+315, 381, Gx_line+332, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 585, Gx_line+315, 636, Gx_line+332, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 400, Gx_line+315, 505, Gx_line+332, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 651, Gx_line+315, 710, Gx_line+332, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 721, Gx_line+315, 766, Gx_line+332, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150TextoCopia, "")), 690, Gx_line+339, 769, Gx_line+355, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 403, Gx_line+268, 460, Gx_line+285, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Factura", ""), 650, Gx_line+268, 701, Gx_line+285, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 597, Gx_line+295, 625, Gx_line+311, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 673, Gx_line+295, 688, Gx_line+311, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 729, Gx_line+295, 756, Gx_line+311, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(579, Gx_line+288, 579, Gx_line+335, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(770, Gx_line+285, 770, Gx_line+334, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(580, Gx_line+333, 771, Gx_line+333, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(643, Gx_line+288, 643, Gx_line+335, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(719, Gx_line+288, 719, Gx_line+335, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 351, Gx_line+295, 366, Gx_line+311, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/Nº Contribuinte", ""), 403, Gx_line+295, 501, Gx_line+311, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Moeda", ""), 523, Gx_line+295, 563, Gx_line+311, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "EUR", ""), 530, Gx_line+315, 558, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Exmo.(s) Sr.(s)", ""), 382, Gx_line+145, 467, Gx_line+161, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(580, Gx_line+311, 771, Gx_line+311, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(338, Gx_line+311, 583, Gx_line+311, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(335, Gx_line+264, 580, Gx_line+288, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(335, Gx_line+288, 335, Gx_line+335, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(335, Gx_line+333, 580, Gx_line+333, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(504, Gx_line+288, 504, Gx_line+335, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(393, Gx_line+288, 393, Gx_line+335, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Clicp_t, "")), 382, Gx_line+213, 446, Gx_line+231, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Contdsc, "")), 625, Gx_line+63, 771, Gx_line+78, 2, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3c99144a-8aa9-43d5-8fce-801099ee2ac5", "", context.getHttpContext().getTheme( )), 26, Gx_line+63, 324, Gx_line+260) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "O. Serv", ""), 117, Gx_line+368, 159, Gx_line+384, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 227, Gx_line+368, 321, Gx_line+384, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "QT.Fact.", ""), 569, Gx_line+368, 616, Gx_line+384, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(26, Gx_line+359, 783, Gx_line+391, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 399, Gx_line+368, 421, Gx_line+384, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(179, Gx_line+359, 179, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(373, Gx_line+359, 373, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 453, Gx_line+368, 494, Gx_line+384, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(497, Gx_line+359, 497, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(449, Gx_line+359, 449, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/Enc.", ""), 47, Gx_line+368, 83, Gx_line+384, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(98, Gx_line+359, 98, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 634, Gx_line+368, 668, Gx_line+384, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(627, Gx_line+359, 627, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(673, Gx_line+359, 673, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 725, Gx_line+368, 753, Gx_line+384, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(555, Gx_line+359, 555, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "QT.Ent.", ""), 509, Gx_line+368, 551, Gx_line+384, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(720, Gx_line+359, 720, Gx_line+391, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Perc.%", ""), 677, Gx_line+368, 719, Gx_line+384, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+396) ;
               }
               else
               {
                  getPrinter().GxDrawRect(189, Gx_line+132, 299, Gx_line+156, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 27, Gx_line+183, 72, Gx_line+200, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 245, Gx_line+183, 296, Gx_line+200, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 81, Gx_line+183, 186, Gx_line+200, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 302, Gx_line+183, 361, Gx_line+200, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 368, Gx_line+183, 413, Gx_line+200, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "O. Serv", ""), 117, Gx_line+217, 159, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 227, Gx_line+217, 321, Gx_line+233, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "QT.Fact.", ""), 569, Gx_line+217, 616, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(26, Gx_line+208, 783, Gx_line+240, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 399, Gx_line+217, 421, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(179, Gx_line+208, 179, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(373, Gx_line+208, 373, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 453, Gx_line+217, 494, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(497, Gx_line+208, 497, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(449, Gx_line+208, 449, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/Enc.", ""), 47, Gx_line+217, 83, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(98, Gx_line+208, 98, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 634, Gx_line+217, 668, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(627, Gx_line+208, 627, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(673, Gx_line+208, 673, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 725, Gx_line+217, 753, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150TextoCopia, "")), 318, Gx_line+138, 397, Gx_line+155, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 79, Gx_line+136, 136, Gx_line+153, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Factura", ""), 219, Gx_line+136, 270, Gx_line+153, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 256, Gx_line+164, 284, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 324, Gx_line+164, 339, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 376, Gx_line+164, 403, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(239, Gx_line+156, 239, Gx_line+203, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(415, Gx_line+156, 415, Gx_line+203, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(189, Gx_line+202, 299, Gx_line+202, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(298, Gx_line+156, 298, Gx_line+203, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(364, Gx_line+156, 364, Gx_line+203, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 42, Gx_line+164, 57, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/Nº Contribuinte", ""), 81, Gx_line+164, 179, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Moeda", ""), 193, Gx_line+164, 233, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "EUR", ""), 200, Gx_line+183, 228, Gx_line+199, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(189, Gx_line+180, 299, Gx_line+180, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(28, Gx_line+180, 191, Gx_line+180, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(26, Gx_line+132, 189, Gx_line+156, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(26, Gx_line+156, 26, Gx_line+203, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(26, Gx_line+202, 189, Gx_line+202, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(189, Gx_line+156, 189, Gx_line+203, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(75, Gx_line+156, 75, Gx_line+203, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(555, Gx_line+208, 555, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "QT.Ent.", ""), 509, Gx_line+217, 551, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Exmo.(s) Sr.(s)", ""), 460, Gx_line+104, 545, Gx_line+120, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 460, Gx_line+151, 674, Gx_line+169, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 460, Gx_line+126, 649, Gx_line+144, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Cp_pob, "")), 460, Gx_line+177, 717, Gx_line+195, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(298, Gx_line+133, 416, Gx_line+157, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(298, Gx_line+202, 416, Gx_line+202, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(298, Gx_line+180, 416, Gx_line+180, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(448, Gx_line+96, 783, Gx_line+203, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 26, Gx_line+7, 783, Gx_line+93) ;
                  getPrinter().GxDrawLine(720, Gx_line+208, 720, Gx_line+240, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Perc.%", ""), 677, Gx_line+217, 719, Gx_line+233, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147Texto_fd, "")), 26, Gx_line+109, 313, Gx_line+125, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+245) ;
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
      this.aP1[0] = pfacm21copy1.this.A396EmprCod;
      this.aP2[0] = pfacm21copy1.this.A430FacCod;
      this.aP3[0] = pfacm21copy1.this.AV103ImpCod;
      this.aP4[0] = pfacm21copy1.this.AV162ValEuro;
      this.aP5[0] = pfacm21copy1.this.AV150TextoCopia;
      this.aP6[0] = pfacm21copy1.this.Gx_out;
      this.aP7[0] = pfacm21copy1.this.AV65F_header;
      this.aP8[0] = pfacm21copy1.this.AV8Agr_Fases;
      this.aP9[0] = pfacm21copy1.this.AV166VerSumTot;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pfacm21copy1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51ContDsc20 = "" ;
      AV92FirmaD = "" ;
      AV50Contdsc = "" ;
      AV135SumSig = DecimalUtil.ZERO ;
      AV157TSumSig = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ANX2_A396EmprCod = new String[] {""} ;
      P0ANX2_A8335EmpItm2 = new String[] {""} ;
      P0ANX2_n8335EmpItm2 = new boolean[] {false} ;
      P0ANX2_A8334EmpItm1 = new String[] {""} ;
      P0ANX2_n8334EmpItm1 = new boolean[] {false} ;
      P0ANX2_A8337EmpItm4 = new String[] {""} ;
      P0ANX2_n8337EmpItm4 = new boolean[] {false} ;
      P0ANX2_A8336EmpItm3 = new String[] {""} ;
      P0ANX2_n8336EmpItm3 = new boolean[] {false} ;
      P0ANX2_A395EmprCif = new String[] {""} ;
      P0ANX2_n395EmprCif = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV145Texto_1 = "" ;
      AV146Texto_2 = "" ;
      AV63EmprCif = "" ;
      AV49codValidacaoSerie = "" ;
      AV16atcud = "" ;
      P0ANX3_A396EmprCod = new String[] {""} ;
      P0ANX3_A430FacCod = new int[1] ;
      P0ANX3_A450FacPri = new String[] {""} ;
      P0ANX3_A14230FacIDATe = new String[] {""} ;
      P0ANX3_A9605FacFirma = new String[] {""} ;
      P0ANX3_A437FacFpg = new String[] {""} ;
      P0ANX3_A435FacEst = new byte[1] ;
      P0ANX3_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0ANX3_A252CliCod = new int[1] ;
      P0ANX3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_n8346FacRecI = new boolean[] {false} ;
      P0ANX3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX3_A443FacIVAPor = new byte[1] ;
      P0ANX3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A450FacPri = "" ;
      A14230FacIDATe = "" ;
      A9605FacFirma = "" ;
      A437FacFpg = "" ;
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
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      P0ANX4_A7209Colombia = new byte[1] ;
      P0ANX4_n7209Colombia = new boolean[] {false} ;
      P0ANX6_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      P0ANX7_A13236CliFacMtsP = new String[] {""} ;
      P0ANX7_A13012CliImpReop = new String[] {""} ;
      P0ANX7_A858ZonGeoCod = new short[1] ;
      P0ANX7_A4828CliCp2 = new String[] {""} ;
      P0ANX7_A256CliCp = new String[] {""} ;
      P0ANX7_A278CliNif = new String[] {""} ;
      P0ANX7_A295CliPob = new String[] {""} ;
      P0ANX7_A260CliDom = new String[] {""} ;
      P0ANX7_A279CliNom = new String[] {""} ;
      A13236CliFacMtsP = "" ;
      A13012CliImpReop = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      AV91Firma4dig = "" ;
      AV151TextoGenerar = "" ;
      AV170Centimetos = DecimalUtil.ZERO ;
      AV161Url = "" ;
      GXt_char2 = "" ;
      AV102Imagen = "" ;
      AV178Imagen_GXI = "" ;
      AV40CliFacMtsP = "" ;
      AV42CliNif = "" ;
      AV97FpgCod = "" ;
      AV41CliImpReop = "" ;
      AV55DesPago = "" ;
      AV98FpgDsc = "" ;
      AV47CliPri = "" ;
      AV76FacFch = GXutil.nullDate() ;
      AV148Texto_i = "" ;
      AV165Vencim = new java.util.Date[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV165Vencim[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      P0ANX8_A396EmprCod = new String[] {""} ;
      P0ANX8_A430FacCod = new int[1] ;
      P0ANX8_A956FacVtoLin = new byte[1] ;
      P0ANX8_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0ANX8_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV75Facdtopp = DecimalUtil.ZERO ;
      AV79FacImpTot = DecimalUtil.ZERO ;
      AV78FacImpPP = DecimalUtil.ZERO ;
      AV77FacImpGen = DecimalUtil.ZERO ;
      AV74FacDtoGen = DecimalUtil.ZERO ;
      AV80FacIvaImp = DecimalUtil.ZERO ;
      AV86FacTot = DecimalUtil.ZERO ;
      AV69FacBasImp = DecimalUtil.ZERO ;
      AV108ImpPenDto = DecimalUtil.ZERO ;
      AV152TotFac = DecimalUtil.ZERO ;
      AV38Clicp_t = "" ;
      AV52Cp_pob = "" ;
      AV147Texto_fd = "" ;
      P0ANX9_A396EmprCod = new String[] {""} ;
      P0ANX9_A430FacCod = new int[1] ;
      P0ANX9_A427FacAlbCod = new long[1] ;
      P0ANX9_A3397FacFasCod = new String[] {""} ;
      P0ANX9_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX9_A3878FacColNom = new String[] {""} ;
      P0ANX9_A3879FocColNum = new int[1] ;
      P0ANX9_A1498FacDisNum = new String[] {""} ;
      P0ANX9_A428FacAlbTip = new byte[1] ;
      P0ANX9_A454FacSer = new String[] {""} ;
      P0ANX9_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX9_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX9_A5050FacBonLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX9_A451FacRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX9_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX9_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX9_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX9_A432FacDsc = new String[] {""} ;
      P0ANX9_A1296FacBarPar = new String[] {""} ;
      P0ANX9_A1295FacBarReo = new byte[1] ;
      P0ANX9_A1294FacBarCod = new int[1] ;
      P0ANX9_A446FacLin = new int[1] ;
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
      A432FacDsc = "" ;
      A1296FacBarPar = "" ;
      AV13AlbProFch = GXutil.nullDate() ;
      AV113Last_hdr = "" ;
      AV99Hdr = "" ;
      AV100Hdri = "" ;
      AV82FacKgs = DecimalUtil.ZERO ;
      AV35BarSerDsc = "" ;
      AV25BarCodPar = "" ;
      AV29BarColNom = "" ;
      AV72FacDisNum = "" ;
      AV155TotLin2 = DecimalUtil.ZERO ;
      AV154TotLin = DecimalUtil.ZERO ;
      AV129Precio = DecimalUtil.ZERO ;
      AV62Dto = DecimalUtil.ZERO ;
      AV31BarKgm = DecimalUtil.ZERO ;
      AV61Dsc_Idtx = "" ;
      AV32BarMtr = DecimalUtil.ZERO ;
      AV21Aux4 = DecimalUtil.ZERO ;
      AV26BarCodParL = "" ;
      AV87FasesDsc = "" ;
      AV138Tab_dsc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV138Tab_dsc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV139Tab_imp = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV139Tab_imp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV140Tab_kgs = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV140Tab_kgs[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV142Tab_prec = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV142Tab_prec[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV137Tab_Bon = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV137Tab_Bon[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV143Tab_Rec = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV143Tab_Rec[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV70FacBonLi = DecimalUtil.ZERO ;
      AV85FacRec = DecimalUtil.ZERO ;
      AV83FacMts = DecimalUtil.ZERO ;
      AV141Tab_mts = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV141Tab_mts[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new long[1] ;
      GXv_int7 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      P0ANX12_A396EmprCod = new String[] {""} ;
      P0ANX12_A130BarCodPar = new String[] {""} ;
      P0ANX12_A132BarCodReo = new byte[1] ;
      P0ANX12_A129BarCod = new int[1] ;
      P0ANX12_A1652BarSerDsc = new String[] {""} ;
      P0ANX12_A135BarColNom = new String[] {""} ;
      P0ANX12_A136BarColNum = new int[1] ;
      P0ANX12_A2829BarProPer = new String[] {""} ;
      P0ANX12_A14330BarPriorid = new byte[1] ;
      P0ANX12_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANX12_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A2829BarProPer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV48Cod_Idtx = "" ;
      P0ANX13_A396EmprCod = new String[] {""} ;
      P0ANX13_A497FpgCod = new String[] {""} ;
      P0ANX13_A498FpgDsc = new String[] {""} ;
      P0ANX13_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      P0ANX14_A396EmprCod = new String[] {""} ;
      P0ANX14_A30AlbProCod = new long[1] ;
      P0ANX14_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      P0ANX15_A396EmprCod = new String[] {""} ;
      P0ANX15_A14AlbComCod = new int[1] ;
      P0ANX15_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A17AlbComFch = GXutil.nullDate() ;
      P0ANX16_A396EmprCod = new String[] {""} ;
      P0ANX16_A10887Cod_Idtx = new String[] {""} ;
      P0ANX16_A10888Dsc_Idtx = new String[] {""} ;
      P0ANX16_n10888Dsc_Idtx = new boolean[] {false} ;
      P0ANX16_A12703Imp_Idtx = new String[] {""} ;
      P0ANX16_n12703Imp_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      A12703Imp_Idtx = "" ;
      AV149Texto_pc = "" ;
      AV102Imagen = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacm21copy1__default(),
         new Object[] {
             new Object[] {
            P0ANX2_A396EmprCod, P0ANX2_A8335EmpItm2, P0ANX2_n8335EmpItm2, P0ANX2_A8334EmpItm1, P0ANX2_n8334EmpItm1, P0ANX2_A8337EmpItm4, P0ANX2_n8337EmpItm4, P0ANX2_A8336EmpItm3, P0ANX2_n8336EmpItm3, P0ANX2_A395EmprCif,
            P0ANX2_n395EmprCif
            }
            , new Object[] {
            P0ANX3_A396EmprCod, P0ANX3_A430FacCod, P0ANX3_A450FacPri, P0ANX3_A14230FacIDATe, P0ANX3_A9605FacFirma, P0ANX3_A437FacFpg, P0ANX3_A435FacEst, P0ANX3_A9643FacLiq1, P0ANX3_A9644FacLiq2, P0ANX3_A9645FacIva1,
            P0ANX3_A9646FacTot1, P0ANX3_A436FacFch, P0ANX3_A252CliCod, P0ANX3_A11513FacRecIca, P0ANX3_A8346FacRecI, P0ANX3_n8346FacRecI, P0ANX3_A7212FacRect, P0ANX3_A453FacRECPor, P0ANX3_A14224FacCostFac, P0ANX3_A14223FacCostKgs,
            P0ANX3_A14222FacCostMts, P0ANX3_A434FacDtoPP, P0ANX3_A433FacDtoGen, P0ANX3_A443FacIVAPor, P0ANX3_A14219FacEnergia
            }
            , new Object[] {
            P0ANX4_A7209Colombia, P0ANX4_n7209Colombia
            }
            , new Object[] {
            P0ANX6_A3918FacImpTot1
            }
            , new Object[] {
            P0ANX7_A13236CliFacMtsP, P0ANX7_A13012CliImpReop, P0ANX7_A858ZonGeoCod, P0ANX7_A4828CliCp2, P0ANX7_A256CliCp, P0ANX7_A278CliNif, P0ANX7_A295CliPob, P0ANX7_A260CliDom, P0ANX7_A279CliNom
            }
            , new Object[] {
            P0ANX8_A396EmprCod, P0ANX8_A430FacCod, P0ANX8_A956FacVtoLin, P0ANX8_A957FacVtoFch, P0ANX8_n957FacVtoFch
            }
            , new Object[] {
            P0ANX9_A396EmprCod, P0ANX9_A430FacCod, P0ANX9_A427FacAlbCod, P0ANX9_A3397FacFasCod, P0ANX9_A444FacKgs, P0ANX9_A3878FacColNom, P0ANX9_A3879FocColNum, P0ANX9_A1498FacDisNum, P0ANX9_A428FacAlbTip, P0ANX9_A454FacSer,
            P0ANX9_A3898FacPreKgsA, P0ANX9_A448FacPreKgs, P0ANX9_A5050FacBonLi, P0ANX9_A451FacRec, P0ANX9_A5353FacImpMan, P0ANX9_A449FacPreMts, P0ANX9_A447FacMts, P0ANX9_A432FacDsc, P0ANX9_A1296FacBarPar, P0ANX9_A1295FacBarReo,
            P0ANX9_A1294FacBarCod, P0ANX9_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            P0ANX12_A396EmprCod, P0ANX12_A130BarCodPar, P0ANX12_A132BarCodReo, P0ANX12_A129BarCod, P0ANX12_A1652BarSerDsc, P0ANX12_A135BarColNom, P0ANX12_A136BarColNum, P0ANX12_A2829BarProPer, P0ANX12_A14330BarPriorid, P0ANX12_A166BarKgm,
            P0ANX12_A184BarMtr
            }
            , new Object[] {
            P0ANX13_A396EmprCod, P0ANX13_A497FpgCod, P0ANX13_A498FpgDsc, P0ANX13_n498FpgDsc
            }
            , new Object[] {
            P0ANX14_A396EmprCod, P0ANX14_A30AlbProCod, P0ANX14_A34AlbProfch
            }
            , new Object[] {
            P0ANX15_A396EmprCod, P0ANX15_A14AlbComCod, P0ANX15_A17AlbComFch
            }
            , new Object[] {
            P0ANX16_A396EmprCod, P0ANX16_A10887Cod_Idtx, P0ANX16_A10888Dsc_Idtx, P0ANX16_n10888Dsc_Idtx, P0ANX16_A12703Imp_Idtx, P0ANX16_n12703Imp_Idtx
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV65F_header ;
   private byte AV8Agr_Fases ;
   private byte AV166VerSumTot ;
   private byte AV64existefirmad ;
   private byte AV53CtrlPag ;
   private byte AV122NumLin ;
   private byte AV127PQrcode ;
   private byte GXt_int5 ;
   private byte AV115Linea_s ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV118Mes ;
   private byte AV56dia ;
   private byte AV94FlagPag ;
   private byte AV123Paso ;
   private byte A956FacVtoLin ;
   private byte AV81FacIvaPor ;
   private byte AV93FlagNoFin ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private byte AV68FacAlbTip ;
   private byte AV34BarPrioridad ;
   private byte AV27BarCodReo ;
   private byte AV28BarCodReoL ;
   private byte AV101i ;
   private byte AV112j ;
   private byte GXv_int13[] ;
   private byte GXv_int6[] ;
   private byte A132BarCodReo ;
   private byte A14330BarPriorid ;
   private short AV95flax2 ;
   private short A858ZonGeoCod ;
   private short AV15anyo ;
   private short AV171Dpi ;
   private short AV172Pixel ;
   private short AV169ZONGEOCOD ;
   private short Gx_err ;
   private int A430FacCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV37CliCod ;
   private int AV71FacCod ;
   private int GX_I ;
   private int A3879FocColNum ;
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private int Gx_OldLine ;
   private int AV23BarCod ;
   private int AV30BarColNum ;
   private int AV24BarCodL ;
   private int GXv_int9[] ;
   private int GXv_int7[] ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A14AlbComCod ;
   private long A427FacAlbCod ;
   private long AV67FacAlbCod ;
   private long GXv_int8[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV162ValEuro ;
   private java.math.BigDecimal AV135SumSig ;
   private java.math.BigDecimal AV157TSumSig ;
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
   private java.math.BigDecimal AV170Centimetos ;
   private java.math.BigDecimal AV75Facdtopp ;
   private java.math.BigDecimal AV79FacImpTot ;
   private java.math.BigDecimal AV78FacImpPP ;
   private java.math.BigDecimal AV77FacImpGen ;
   private java.math.BigDecimal AV74FacDtoGen ;
   private java.math.BigDecimal AV80FacIvaImp ;
   private java.math.BigDecimal AV86FacTot ;
   private java.math.BigDecimal AV69FacBasImp ;
   private java.math.BigDecimal AV108ImpPenDto ;
   private java.math.BigDecimal AV152TotFac ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal AV82FacKgs ;
   private java.math.BigDecimal AV155TotLin2 ;
   private java.math.BigDecimal AV154TotLin ;
   private java.math.BigDecimal AV129Precio ;
   private java.math.BigDecimal AV62Dto ;
   private java.math.BigDecimal AV31BarKgm ;
   private java.math.BigDecimal AV32BarMtr ;
   private java.math.BigDecimal AV21Aux4 ;
   private java.math.BigDecimal AV139Tab_imp[] ;
   private java.math.BigDecimal AV140Tab_kgs[] ;
   private java.math.BigDecimal AV142Tab_prec[] ;
   private java.math.BigDecimal AV137Tab_Bon[] ;
   private java.math.BigDecimal AV143Tab_Rec[] ;
   private java.math.BigDecimal AV70FacBonLi ;
   private java.math.BigDecimal AV85FacRec ;
   private java.math.BigDecimal AV83FacMts ;
   private java.math.BigDecimal AV141Tab_mts[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String AV103ImpCod ;
   private String AV150TextoCopia ;
   private String Gx_out ;
   private String AV51ContDsc20 ;
   private String AV92FirmaD ;
   private String AV50Contdsc ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV145Texto_1 ;
   private String AV146Texto_2 ;
   private String AV63EmprCif ;
   private String AV49codValidacaoSerie ;
   private String AV16atcud ;
   private String A450FacPri ;
   private String A14230FacIDATe ;
   private String A9605FacFirma ;
   private String A437FacFpg ;
   private String A13236CliFacMtsP ;
   private String A13012CliImpReop ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String AV91Firma4dig ;
   private String GXt_char2 ;
   private String AV40CliFacMtsP ;
   private String AV42CliNif ;
   private String AV97FpgCod ;
   private String AV41CliImpReop ;
   private String AV55DesPago ;
   private String AV98FpgDsc ;
   private String AV47CliPri ;
   private String AV148Texto_i ;
   private String AV38Clicp_t ;
   private String AV52Cp_pob ;
   private String AV147Texto_fd ;
   private String A3397FacFasCod ;
   private String A3878FacColNom ;
   private String A1498FacDisNum ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1296FacBarPar ;
   private String AV113Last_hdr ;
   private String AV99Hdr ;
   private String AV100Hdri ;
   private String AV35BarSerDsc ;
   private String AV25BarCodPar ;
   private String AV29BarColNom ;
   private String AV72FacDisNum ;
   private String AV61Dsc_Idtx ;
   private String AV26BarCodParL ;
   private String AV87FasesDsc ;
   private String AV138Tab_dsc[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A2829BarProPer ;
   private String AV48Cod_Idtx ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A12703Imp_Idtx ;
   private String AV149Texto_pc ;
   private String sImgUrl ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV76FacFch ;
   private java.util.Date AV165Vencim[] ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date AV13AlbProFch ;
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
   private boolean brkANX6 ;
   private boolean n498FpgDsc ;
   private boolean n10888Dsc_Idtx ;
   private boolean n12703Imp_Idtx ;
   private String AV133ReportInPut ;
   private String AV151TextoGenerar ;
   private String AV161Url ;
   private String AV178Imagen_GXI ;
   private String AV102Imagen ;
   private String Imagen ;
   private byte[] aP9 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANX2_A396EmprCod ;
   private String[] P0ANX2_A8335EmpItm2 ;
   private boolean[] P0ANX2_n8335EmpItm2 ;
   private String[] P0ANX2_A8334EmpItm1 ;
   private boolean[] P0ANX2_n8334EmpItm1 ;
   private String[] P0ANX2_A8337EmpItm4 ;
   private boolean[] P0ANX2_n8337EmpItm4 ;
   private String[] P0ANX2_A8336EmpItm3 ;
   private boolean[] P0ANX2_n8336EmpItm3 ;
   private String[] P0ANX2_A395EmprCif ;
   private boolean[] P0ANX2_n395EmprCif ;
   private String[] P0ANX3_A396EmprCod ;
   private int[] P0ANX3_A430FacCod ;
   private String[] P0ANX3_A450FacPri ;
   private String[] P0ANX3_A14230FacIDATe ;
   private String[] P0ANX3_A9605FacFirma ;
   private String[] P0ANX3_A437FacFpg ;
   private byte[] P0ANX3_A435FacEst ;
   private java.math.BigDecimal[] P0ANX3_A9643FacLiq1 ;
   private java.math.BigDecimal[] P0ANX3_A9644FacLiq2 ;
   private java.math.BigDecimal[] P0ANX3_A9645FacIva1 ;
   private java.math.BigDecimal[] P0ANX3_A9646FacTot1 ;
   private java.util.Date[] P0ANX3_A436FacFch ;
   private int[] P0ANX3_A252CliCod ;
   private java.math.BigDecimal[] P0ANX3_A11513FacRecIca ;
   private java.math.BigDecimal[] P0ANX3_A8346FacRecI ;
   private boolean[] P0ANX3_n8346FacRecI ;
   private java.math.BigDecimal[] P0ANX3_A7212FacRect ;
   private java.math.BigDecimal[] P0ANX3_A453FacRECPor ;
   private java.math.BigDecimal[] P0ANX3_A14224FacCostFac ;
   private java.math.BigDecimal[] P0ANX3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P0ANX3_A14222FacCostMts ;
   private java.math.BigDecimal[] P0ANX3_A434FacDtoPP ;
   private java.math.BigDecimal[] P0ANX3_A433FacDtoGen ;
   private byte[] P0ANX3_A443FacIVAPor ;
   private java.math.BigDecimal[] P0ANX3_A14219FacEnergia ;
   private byte[] P0ANX4_A7209Colombia ;
   private boolean[] P0ANX4_n7209Colombia ;
   private java.math.BigDecimal[] P0ANX6_A3918FacImpTot1 ;
   private String[] P0ANX7_A13236CliFacMtsP ;
   private String[] P0ANX7_A13012CliImpReop ;
   private short[] P0ANX7_A858ZonGeoCod ;
   private String[] P0ANX7_A4828CliCp2 ;
   private String[] P0ANX7_A256CliCp ;
   private String[] P0ANX7_A278CliNif ;
   private String[] P0ANX7_A295CliPob ;
   private String[] P0ANX7_A260CliDom ;
   private String[] P0ANX7_A279CliNom ;
   private String[] P0ANX8_A396EmprCod ;
   private int[] P0ANX8_A430FacCod ;
   private byte[] P0ANX8_A956FacVtoLin ;
   private java.util.Date[] P0ANX8_A957FacVtoFch ;
   private boolean[] P0ANX8_n957FacVtoFch ;
   private String[] P0ANX9_A396EmprCod ;
   private int[] P0ANX9_A430FacCod ;
   private long[] P0ANX9_A427FacAlbCod ;
   private String[] P0ANX9_A3397FacFasCod ;
   private java.math.BigDecimal[] P0ANX9_A444FacKgs ;
   private String[] P0ANX9_A3878FacColNom ;
   private int[] P0ANX9_A3879FocColNum ;
   private String[] P0ANX9_A1498FacDisNum ;
   private byte[] P0ANX9_A428FacAlbTip ;
   private String[] P0ANX9_A454FacSer ;
   private java.math.BigDecimal[] P0ANX9_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P0ANX9_A448FacPreKgs ;
   private java.math.BigDecimal[] P0ANX9_A5050FacBonLi ;
   private java.math.BigDecimal[] P0ANX9_A451FacRec ;
   private java.math.BigDecimal[] P0ANX9_A5353FacImpMan ;
   private java.math.BigDecimal[] P0ANX9_A449FacPreMts ;
   private java.math.BigDecimal[] P0ANX9_A447FacMts ;
   private String[] P0ANX9_A432FacDsc ;
   private String[] P0ANX9_A1296FacBarPar ;
   private byte[] P0ANX9_A1295FacBarReo ;
   private int[] P0ANX9_A1294FacBarCod ;
   private int[] P0ANX9_A446FacLin ;
   private String[] P0ANX12_A396EmprCod ;
   private String[] P0ANX12_A130BarCodPar ;
   private byte[] P0ANX12_A132BarCodReo ;
   private int[] P0ANX12_A129BarCod ;
   private String[] P0ANX12_A1652BarSerDsc ;
   private String[] P0ANX12_A135BarColNom ;
   private int[] P0ANX12_A136BarColNum ;
   private String[] P0ANX12_A2829BarProPer ;
   private byte[] P0ANX12_A14330BarPriorid ;
   private java.math.BigDecimal[] P0ANX12_A166BarKgm ;
   private java.math.BigDecimal[] P0ANX12_A184BarMtr ;
   private String[] P0ANX13_A396EmprCod ;
   private String[] P0ANX13_A497FpgCod ;
   private String[] P0ANX13_A498FpgDsc ;
   private boolean[] P0ANX13_n498FpgDsc ;
   private String[] P0ANX14_A396EmprCod ;
   private long[] P0ANX14_A30AlbProCod ;
   private java.util.Date[] P0ANX14_A34AlbProfch ;
   private String[] P0ANX15_A396EmprCod ;
   private int[] P0ANX15_A14AlbComCod ;
   private java.util.Date[] P0ANX15_A17AlbComFch ;
   private String[] P0ANX16_A396EmprCod ;
   private String[] P0ANX16_A10887Cod_Idtx ;
   private String[] P0ANX16_A10888Dsc_Idtx ;
   private boolean[] P0ANX16_n10888Dsc_Idtx ;
   private String[] P0ANX16_A12703Imp_Idtx ;
   private boolean[] P0ANX16_n12703Imp_Idtx ;
}

final  class pfacm21copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANX2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX3", "SELECT EmprCod, FacCod, FacPri, FacIDATe, FacFirma, FacFpg, FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFch, CliCod, FacRecIca, FacRecI, FacRect, FacRECPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoPP, FacDtoGen, FacIVAPor, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst, FacLiq1, FacLiq2, FacIva1, FacTot1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX4", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX6", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) THEN 0 WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX7", "SELECT CliFacMtsP, CliImpReop, ZonGeoCod, CliCp2, CliCp, CliNif, CliPob, CliDom, CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX8", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ANX9", "SELECT EmprCod, FacCod, FacAlbCod, FacFasCod, FacKgs, FacColNom, FocColNum, FacDisNum, FacAlbTip, FacSer, FacPreKgsA, FacPreKgs, FacBonLi, FacRec, FacImpMan, FacPreMts, FacMts, FacDsc, FacBarPar, FacBarReo, FacBarCod, FacLin FROM TXPLFAVEN WHERE (EmprCod = ?) AND (FacCod = ?) ORDER BY FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0ANX10", "UPDATE TXPCFAVEN SET FacEst=?, FacLiq1=?, FacLiq2=?, FacIva1=?, FacTot1=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P0ANX12", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarProPer, T1.BarPriorid, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX13", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX14", "SELECT EmprCod, AlbProCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX15", "SELECT EmprCod, AlbComCod, AlbComFch FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANX16", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx, Imp_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 34);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
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
               ((String[]) buf[17])[0] = rslt.getString(18, 40);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
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
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
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

