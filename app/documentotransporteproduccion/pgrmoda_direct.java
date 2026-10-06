package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pgrmoda_direct extends GXReport
{
   public pgrmoda_direct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrmoda_direct.class ), "" );
   }

   public pgrmoda_direct( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          long aP1 ,
                          String aP2 ,
                          String aP3 ,
                          int[] aP4 ,
                          int[] aP5 )
   {
      pgrmoda_direct.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        IReportHandler reportHandler )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             IReportHandler reportHandler )
   {
      pgrmoda_direct.this.A396EmprCod = aP0;
      pgrmoda_direct.this.A30AlbProCod = aP1;
      pgrmoda_direct.this.AV56ImpCod = aP2;
      pgrmoda_direct.this.AV76TextoCopia = aP3;
      pgrmoda_direct.this.Gx_page = aP4[0];
      this.aP4 = aP4;
      pgrmoda_direct.this.Gx_line = aP5[0];
      this.aP5 = aP5;
      this.reportHandler = reportHandler;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 11 ;
      M_bot = 4 ;
      P_lines = (int)(66-M_bot) ;
      try
      {
         setPrinter(reportHandler);
         P_lines = getPrinter().getPageLines();
         lineHeight = getPrinter().getLineHeight();
         M_top = getPrinter().getM_top();
         M_bot = getPrinter().getM_bot();
         Gx_page = getPrinter().getPage();
         GXv_char1[0] = AV39ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRMODA", ""), GXv_char1) ;
         pgrmoda_direct.this.AV39ContDsc = GXv_char1[0] ;
         GXt_char2 = AV51Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pgrmoda_direct.this.A396EmprCod = GXv_char1[0] ;
         pgrmoda_direct.this.GXt_char2 = GXv_char4[0] ;
         AV51Firmad = GXt_char2 ;
         GXt_int5 = AV47existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pgrmoda_direct.this.GXt_int5 = GXv_int6[0] ;
         AV47existefirmad = GXt_int5 ;
         GXt_int5 = AV71PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pgrmoda_direct.this.GXt_int5 = GXv_int6[0] ;
         AV71PQrcode = GXt_int5 ;
         GXt_int5 = (byte)(AV52flax2) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FLAX2", ""), GXv_int6) ;
         pgrmoda_direct.this.GXt_int5 = GXv_int6[0] ;
         AV52flax2 = GXt_int5 ;
         /* Using cursor P0AFC2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0AFC2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AFC2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0AFC2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AFC2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0AFC2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AFC2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AFC2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AFC2_n8336EmpItm3[0] ;
            A395EmprCif = P0AFC2_A395EmprCif[0] ;
            n395EmprCif = P0AFC2_n395EmprCif[0] ;
            AV73Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV74Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV45EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P0AFC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14069AlbPdATCUD = P0AFC3_A14069AlbPdATCUD[0] ;
            A1259AlbDomEnv = P0AFC3_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P0AFC3_n1259AlbDomEnv[0] ;
            A39AlbProPri = P0AFC3_A39AlbProPri[0] ;
            A10017AlbFmd = P0AFC3_A10017AlbFmd[0] ;
            n10017AlbFmd = P0AFC3_n10017AlbFmd[0] ;
            A7101AlbLic = P0AFC3_A7101AlbLic[0] ;
            A407EmprNom = P0AFC3_A407EmprNom[0] ;
            n407EmprNom = P0AFC3_n407EmprNom[0] ;
            A5140AlbMarca = P0AFC3_A5140AlbMarca[0] ;
            A1879AlbProEnt = P0AFC3_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P0AFC3_n1879AlbProEnt[0] ;
            A33AlbProEst = P0AFC3_A33AlbProEst[0] ;
            A1782AlbProEso = P0AFC3_A1782AlbProEso[0] ;
            A4023AlbFecSal = P0AFC3_A4023AlbFecSal[0] ;
            A3865AlbHorSal = P0AFC3_A3865AlbHorSal[0] ;
            A3868AlbMat = P0AFC3_A3868AlbMat[0] ;
            A34AlbProfch = P0AFC3_A34AlbProfch[0] ;
            A1243GuiRemCli = P0AFC3_A1243GuiRemCli[0] ;
            A407EmprNom = P0AFC3_A407EmprNom[0] ;
            n407EmprNom = P0AFC3_n407EmprNom[0] ;
            AV38codValidacaoSerie = A14069AlbPdATCUD ;
            AV10atcud = ((GXutil.strcmp("", AV38codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV38codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))) ;
            AV23CliCod = A1243GuiRemCli ;
            AV31CliEnvDom = A1259AlbDomEnv ;
            AV72Prioridad = A39AlbProPri ;
            /* Execute user subroutine: 'CLIENTE' */
            S171 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV75Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV50Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV75Texto_fd = AV50Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV51Firmad) ;
            }
            else
            {
               AV75Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV11AtId = " " ;
            if ( GXutil.strcmp(A7101AlbLic, " ") != 0 )
            {
               AV11AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            AV50Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
            AV77TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV45EmprCif) + "*" ;
            AV77TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( AV34CliNif) + "*" ;
            AV77TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV77TextoGenerar += ((GXutil.strcmp(A39AlbProPri, "1")==0) ? httpContext.getMessage( "D:", "")+httpContext.getMessage( "GR", "")+"*" : httpContext.getMessage( "D:", "")+httpContext.getMessage( "GT", "")+"*") ;
            AV77TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV9anyo = (short)(GXutil.year( A34AlbProfch)) ;
            AV67mes = (byte)(GXutil.month( A34AlbProfch)) ;
            AV42dia = (byte)(GXutil.day( A34AlbProfch)) ;
            AV77TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV9anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV67mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV42dia, 2, 0)), (short)(2), "0") + "*" ;
            AV77TextoGenerar += ((GXutil.strcmp(A39AlbProPri, "1")==0) ? httpContext.getMessage( "G:", "")+httpContext.getMessage( "GR 1/", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+"*" : httpContext.getMessage( "G:", "")+httpContext.getMessage( "GT 2/", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+"*") ;
            AV77TextoGenerar += httpContext.getMessage( "H:", "") + "*" ;
            AV77TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV77TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV77TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV77TextoGenerar += httpContext.getMessage( "Q:", "") + AV50Firma4dig + "*" ;
            AV77TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV51Firmad) + "*" ;
            AV43Dpi = (short)(300) ;
            AV22Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV70Pixel = (short)(DecimalUtil.decToDouble(AV22Centimetos.multiply(DecimalUtil.doubleToDec(AV43Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV82Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV77TextoGenerar, AV70Pixel, AV70Pixel, GXv_char4) ;
            pgrmoda_direct.this.GXt_char2 = GXv_char4[0] ;
            AV82Url = GXt_char2 ;
            AV55Imagen = AV82Url ;
            AV97Imagen_GXI = GXDbFile.pathToUrl( AV82Url, context.getHttpContext()) ;
            AV46EmprNom = A407EmprNom ;
            AV84VDoc = httpContext.getMessage( "Guia de Remessa Nº", "") ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV84VDoc = httpContext.getMessage( "Guia Transporte(NCON) Nº", "") ;
            }
            if ( AV41Copias == 1 )
            {
               AV83vCopia = httpContext.getMessage( "DUPLICADO", "") ;
            }
            AV54i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV86vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Using cursor P0AFC4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A916AlbPObs = P0AFC4_A916AlbPObs[0] ;
                  A915AlbPObsLin = P0AFC4_A915AlbPObsLin[0] ;
                  if ( AV54i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV86vObs[AV54i-1] = A916AlbPObs ;
                  AV54i = (byte)(AV54i+1) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            else
            {
               /* Using cursor P0AFC5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A12184DltObs = P0AFC5_A12184DltObs[0] ;
                  n12184DltObs = P0AFC5_n12184DltObs[0] ;
                  A12185DltLinObs = P0AFC5_A12185DltLinObs[0] ;
                  if ( AV54i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV86vObs[AV54i-1] = A12184DltObs ;
                  AV54i = (byte)(AV54i+1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            AV80TxtAnulado = "" ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
            {
               AV80TxtAnulado = httpContext.getMessage( "ANULADO", "") ;
            }
            AV40ContLine = (byte)(0) ;
            AV65Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            AV87Albprocod = A30AlbProCod ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Execute user subroutine: 'ALBBAR' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /* Execute user subroutine: 'DLT001' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            hAFC0( false, 26) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV78TotKgs, "ZZZZZZ9.99")), 630, Gx_line+6, 704, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV79TotPzas), "ZZZZZ9")), 545, Gx_line+6, 590, Gx_line+24, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+26) ;
            if ( ( AV47existefirmad == 1 ) && (GXutil.strcmp("", A10017AlbFmd)==0) )
            {
               hAFC0( false, 29) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 178, Gx_line+6, 597, Gx_line+29, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+29) ;
            }
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            if ( AV71PQrcode == 1 )
            {
               hAFC0( false, 21) ;
               getPrinter().GxAttris("Arial", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TextoGenerar, "")), 3, Gx_line+0, 771, Gx_line+19, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
            }
            /* Using cursor P0AFC6 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer */
         ToSkip = (int)(P_lines+1) ;
         hAFC0( true, 0) ;
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'DLT001' Routine */
      returnInSub = false ;
      /* Using cursor P0AFC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(AV87Albprocod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A12178DltP = P0AFC7_A12178DltP[0] ;
         A12177DltR = P0AFC7_A12177DltR[0] ;
         A12176DltHdr = P0AFC7_A12176DltHdr[0] ;
         A12153DltColNum = P0AFC7_A12153DltColNum[0] ;
         n12153DltColNum = P0AFC7_n12153DltColNum[0] ;
         A12145DltKgs = P0AFC7_A12145DltKgs[0] ;
         n12145DltKgs = P0AFC7_n12145DltKgs[0] ;
         A12147DltPzs = P0AFC7_A12147DltPzs[0] ;
         n12147DltPzs = P0AFC7_n12147DltPzs[0] ;
         A12150DltArtCod = P0AFC7_A12150DltArtCod[0] ;
         n12150DltArtCod = P0AFC7_n12150DltArtCod[0] ;
         A12186DltKgsCli = P0AFC7_A12186DltKgsCli[0] ;
         n12186DltKgsCli = P0AFC7_n12186DltKgsCli[0] ;
         A12151DltArtDsc = P0AFC7_A12151DltArtDsc[0] ;
         n12151DltArtDsc = P0AFC7_n12151DltArtDsc[0] ;
         A12187DltTubo = P0AFC7_A12187DltTubo[0] ;
         n12187DltTubo = P0AFC7_n12187DltTubo[0] ;
         A12149DltTubos = P0AFC7_A12149DltTubos[0] ;
         n12149DltTubos = P0AFC7_n12149DltTubos[0] ;
         A12188DltTuboN = P0AFC7_A12188DltTuboN[0] ;
         n12188DltTuboN = P0AFC7_n12188DltTuboN[0] ;
         AV17barcolnum = A12153DltColNum ;
         AV53Hdr = ((GXutil.strcmp(AV33CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A12176DltHdr, 8, 0) : ((A12177DltR>0) ? GXutil.str( A12176DltHdr, 8, 0)+" "+GXutil.str( A12177DltR, 1, 0) : GXutil.str( A12176DltHdr, 8, 0))) ;
         AV13Barcod = A12176DltHdr ;
         AV15Barcodreo = A12177DltR ;
         AV14Barcodpar = A12178DltP ;
         /* Execute user subroutine: 'BARCAD' */
         S128 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            getPrinter().GxEndPage() ;
            returnInSub = true;
            if (true) return;
         }
         AV58KgsE = AV8BarKgm ;
         AV60KgsS = A12145DltKgs ;
         AV12baralbpie = A12147DltPzs ;
         AV68MtsS = DecimalUtil.doubleToDec(0) ;
         if ( ( AV23CliCod == 310 ) || ( AV23CliCod == 320 ) )
         {
            if ( ( GXutil.strcmp(A12150DltArtCod, "20000") >= 0 ) && ( GXutil.strcmp(A12150DltArtCod, "29999") <= 0 ) )
            {
               AV68MtsS = A12145DltKgs ;
            }
         }
         if ( A12186DltKgsCli.doubleValue() != 0 )
         {
            AV60KgsS = A12186DltKgsCli ;
         }
         AV21BarSerDsc = GXutil.substring( A12151DltArtDsc, 1, 20) ;
         hAFC0( false, 17) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Bardisnum, "")), 0, Gx_line+1, 59, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Hdr, "")), 61, Gx_line+1, 142, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21BarSerDsc, "")), 144, Gx_line+1, 291, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20barnomcli, "")), 295, Gx_line+1, 391, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16barcolnom, "")), 395, Gx_line+1, 491, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17barcolnum), "ZZZZZZ")), 496, Gx_line+1, 541, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12baralbpie), "ZZZZZ9")), 545, Gx_line+1, 590, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58KgsE, "ZZZ9.99")), 592, Gx_line+1, 644, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60KgsS, "ZZZZ9.99")), 644, Gx_line+1, 703, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68MtsS, "ZZZZZZ.ZZ")), 707, Gx_line+1, 774, Gx_line+17, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV40ContLine = (byte)(AV40ContLine+1) ;
         AV79TotPzas = (int)(AV79TotPzas+A12147DltPzs) ;
         AV78TotKgs = AV78TotKgs.add(AV60KgsS) ;
         /* Using cursor P0AFC8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A12175DltMtsFs = P0AFC8_A12175DltMtsFs[0] ;
            n12175DltMtsFs = P0AFC8_n12175DltMtsFs[0] ;
            A12190DltPrMFs = P0AFC8_A12190DltPrMFs[0] ;
            n12190DltPrMFs = P0AFC8_n12190DltPrMFs[0] ;
            A12192DltPrMBFs = P0AFC8_A12192DltPrMBFs[0] ;
            n12192DltPrMBFs = P0AFC8_n12192DltPrMBFs[0] ;
            A12173DltFasDsc = P0AFC8_A12173DltFasDsc[0] ;
            n12173DltFasDsc = P0AFC8_n12173DltFasDsc[0] ;
            A12172DltFascod = P0AFC8_A12172DltFascod[0] ;
            n12172DltFascod = P0AFC8_n12172DltFascod[0] ;
            A12174DltKgsFs = P0AFC8_A12174DltKgsFs[0] ;
            n12174DltKgsFs = P0AFC8_n12174DltKgsFs[0] ;
            A12191DltPrKBFs = P0AFC8_A12191DltPrKBFs[0] ;
            n12191DltPrKBFs = P0AFC8_n12191DltPrKBFs[0] ;
            A12182DltLin = P0AFC8_A12182DltLin[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12190DltPrMFs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12175DltMtsFs)==0) )
            {
               AV48FasMtr = A12175DltMtsFs ;
               if ( A12192DltPrMBFs.doubleValue() != 0 )
               {
                  AV48FasMtr = A12192DltPrMBFs ;
               }
               hAFC0( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12172DltFascod, "")), 156, Gx_line+2, 215, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12173DltFasDsc, "")), 220, Gx_line+2, 425, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48FasMtr, "ZZZZZ9.99")), 707, Gx_line+2, 774, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               AV59KgsFasS = A12174DltKgsFs ;
               if ( A12191DltPrKBFs.doubleValue() != 0 )
               {
                  AV59KgsFasS = A12191DltPrKBFs ;
               }
               hAFC0( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12172DltFascod, "")), 156, Gx_line+2, 215, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12173DltFasDsc, "")), 220, Gx_line+2, 425, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59KgsFasS, "ZZZZZ9.99")), 638, Gx_line+2, 705, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            AV40ContLine = (byte)(AV40ContLine+1) ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( ! (0==A12187DltTubo) )
         {
            hAFC0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12188DltTuboN, "")), 156, Gx_line+1, 376, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12149DltTubos), "ZZZZZ9")), 658, Gx_line+1, 703, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Un.", ""), 707, Gx_line+1, 730, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         /* Execute user subroutine: 'LOTES' */
         S138 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            getPrinter().GxEndPage() ;
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV63Lotes, " ") != 0 )
         {
            AV85Vlote = httpContext.getMessage( "Lote : ", "") + GXutil.trim( AV63Lotes) ;
            hAFC0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Vlote, "")), 61, Gx_line+0, 281, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fio:", ""), 288, Gx_line+0, 318, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Fio5, "")), 321, Gx_line+0, 358, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Jogo:", ""), 367, Gx_line+0, 404, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Jogo3, "")), 404, Gx_line+0, 427, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pol:", ""), 433, Gx_line+0, 463, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV69Pgadas), "ZZZZZZ")), 464, Gx_line+0, 509, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LFA:", ""), 511, Gx_line+0, 541, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 591, Gx_line+0, 621, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Maq6, "")), 621, Gx_line+0, 666, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61Lfa, "ZZZ.ZZ")), 540, Gx_line+0, 585, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81txtmerma, "")), 671, Gx_line+0, 774, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S128( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P0AFC10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV15Barcodreo), AV14Barcodpar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A130BarCodPar = P0AFC10_A130BarCodPar[0] ;
         A132BarCodReo = P0AFC10_A132BarCodReo[0] ;
         A129BarCod = P0AFC10_A129BarCod[0] ;
         A252CliCod = P0AFC10_A252CliCod[0] ;
         n252CliCod = P0AFC10_n252CliCod[0] ;
         A143BarDisNum = P0AFC10_A143BarDisNum[0] ;
         A1234BarNomCli = P0AFC10_A1234BarNomCli[0] ;
         A135BarColNom = P0AFC10_A135BarColNom[0] ;
         A166BarKgm = P0AFC10_A166BarKgm[0] ;
         n166BarKgm = P0AFC10_n166BarKgm[0] ;
         A166BarKgm = P0AFC10_A166BarKgm[0] ;
         n166BarKgm = P0AFC10_n166BarKgm[0] ;
         AV23CliCod = A252CliCod ;
         AV8BarKgm = A166BarKgm ;
         AV18Bardisnum = A143BarDisNum ;
         AV20barnomcli = A1234BarNomCli ;
         AV16barcolnom = A135BarColNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      /* Using cursor P0AFC12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(AV87Albprocod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P0AFC12_A130BarCodPar[0] ;
         A132BarCodReo = P0AFC12_A132BarCodReo[0] ;
         A129BarCod = P0AFC12_A129BarCod[0] ;
         A2829BarProPer = P0AFC12_A2829BarProPer[0] ;
         A136BarColNum = P0AFC12_A136BarColNum[0] ;
         A1261BarAlbKgmE = P0AFC12_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P0AFC12_A1265BarAlbPie[0] ;
         A213BarSit = P0AFC12_A213BarSit[0] ;
         A12909CliImpMerm = P0AFC12_A12909CliImpMerm[0] ;
         A13236CliFacMtsP = P0AFC12_A13236CliFacMtsP[0] ;
         A1263BarAlbMtrE = P0AFC12_A1263BarAlbMtrE[0] ;
         A252CliCod = P0AFC12_A252CliCod[0] ;
         n252CliCod = P0AFC12_n252CliCod[0] ;
         A212BarSer = P0AFC12_A212BarSer[0] ;
         A2243BarKgsCli = P0AFC12_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P0AFC12_n2243BarKgsCli[0] ;
         A1652BarSerDsc = P0AFC12_A1652BarSerDsc[0] ;
         A143BarDisNum = P0AFC12_A143BarDisNum[0] ;
         A1234BarNomCli = P0AFC12_A1234BarNomCli[0] ;
         A135BarColNom = P0AFC12_A135BarColNom[0] ;
         A1206TubCod = P0AFC12_A1206TubCod[0] ;
         n1206TubCod = P0AFC12_n1206TubCod[0] ;
         A1266BarAlbTub = P0AFC12_A1266BarAlbTub[0] ;
         A1207TubNom = P0AFC12_A1207TubNom[0] ;
         n1207TubNom = P0AFC12_n1207TubNom[0] ;
         A14330BarPriorid = P0AFC12_A14330BarPriorid[0] ;
         A166BarKgm = P0AFC12_A166BarKgm[0] ;
         n166BarKgm = P0AFC12_n166BarKgm[0] ;
         A2829BarProPer = P0AFC12_A2829BarProPer[0] ;
         A136BarColNum = P0AFC12_A136BarColNum[0] ;
         A213BarSit = P0AFC12_A213BarSit[0] ;
         A252CliCod = P0AFC12_A252CliCod[0] ;
         n252CliCod = P0AFC12_n252CliCod[0] ;
         A212BarSer = P0AFC12_A212BarSer[0] ;
         A1652BarSerDsc = P0AFC12_A1652BarSerDsc[0] ;
         A143BarDisNum = P0AFC12_A143BarDisNum[0] ;
         A1234BarNomCli = P0AFC12_A1234BarNomCli[0] ;
         A135BarColNom = P0AFC12_A135BarColNom[0] ;
         A14330BarPriorid = P0AFC12_A14330BarPriorid[0] ;
         A1207TubNom = P0AFC12_A1207TubNom[0] ;
         n1207TubNom = P0AFC12_n1207TubNom[0] ;
         A12909CliImpMerm = P0AFC12_A12909CliImpMerm[0] ;
         A13236CliFacMtsP = P0AFC12_A13236CliFacMtsP[0] ;
         A166BarKgm = P0AFC12_A166BarKgm[0] ;
         n166BarKgm = P0AFC12_n166BarKgm[0] ;
         AV44Dsc_Idtx = "" ;
         AV37Cod_Idtx = GXutil.trim( A2829BarProPer) ;
         /* Execute user subroutine: 'INDITEX' */
         S1511 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            pr_default.close(8);
            pr_default.close(8);
            pr_default.close(8);
            pr_default.close(8);
            getPrinter().GxEndPage() ;
            returnInSub = true;
            if (true) return;
         }
         AV17barcolnum = A136BarColNum ;
         AV53Hdr = ((GXutil.strcmp(AV33CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A129BarCod, 8, 0) : ((A132BarCodReo>0) ? GXutil.str( A129BarCod, 8, 0)+" "+GXutil.str( A132BarCodReo, 1, 0) : GXutil.str( A129BarCod, 8, 0))) ;
         AV13Barcod = A129BarCod ;
         AV15Barcodreo = A132BarCodReo ;
         AV14Barcodpar = A130BarCodPar ;
         AV58KgsE = A166BarKgm ;
         AV60KgsS = A1261BarAlbKgmE ;
         AV12baralbpie = A1265BarAlbPie ;
         AV66merma = (short)(0) ;
         AV81txtmerma = "" ;
         if ( A213BarSit > 6 )
         {
            /* Execute user subroutine: 'MERMA' */
            S1611 ();
            if ( returnInSub )
            {
               pr_default.close(8);
               pr_default.close(8);
               pr_default.close(8);
               pr_default.close(8);
               pr_default.close(8);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               if (true) return;
            }
            AV66merma = (short)(DecimalUtil.decToDouble(((A166BarKgm.doubleValue()>0) ? ((AV19BarKilLan.subtract(A166BarKgm)).divide(A166BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)))) ;
            AV81txtmerma = ((AV66merma==0)||(GXutil.strcmp(A12909CliImpMerm, httpContext.getMessage( "N", ""))==0) ? " " : httpContext.getMessage( "Quebra:", "")+GXutil.trim( GXutil.str( AV66merma, 3, 0))) ;
         }
         AV68MtsS = DecimalUtil.doubleToDec(0) ;
         if ( GXutil.strcmp(A13236CliFacMtsP, httpContext.getMessage( "S", "")) == 0 )
         {
            AV68MtsS = A1263BarAlbMtrE ;
         }
         else
         {
            if ( ( A252CliCod == 310 ) || ( A252CliCod == 320 ) )
            {
               if ( ( GXutil.strcmp(A212BarSer, "20000") >= 0 ) && ( GXutil.strcmp(A212BarSer, "29999") <= 0 ) )
               {
                  AV68MtsS = A1263BarAlbMtrE ;
               }
            }
         }
         if ( A2243BarKgsCli.doubleValue() != 0 )
         {
            AV60KgsS = A2243BarKgsCli ;
         }
         AV21BarSerDsc = GXutil.substring( A1652BarSerDsc, 1, 20) ;
         AV18Bardisnum = A143BarDisNum ;
         AV20barnomcli = A1234BarNomCli ;
         AV16barcolnom = A135BarColNom ;
         hAFC0( false, 17) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Bardisnum, "")), 0, Gx_line+1, 59, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Hdr, "")), 61, Gx_line+1, 142, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21BarSerDsc, "")), 144, Gx_line+1, 291, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20barnomcli, "")), 295, Gx_line+1, 391, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16barcolnom, "")), 395, Gx_line+1, 491, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17barcolnum), "ZZZZZZ")), 496, Gx_line+1, 541, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12baralbpie), "ZZZZZ9")), 545, Gx_line+1, 590, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58KgsE, "ZZZ9.99")), 592, Gx_line+1, 644, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60KgsS, "ZZZZ9.99")), 644, Gx_line+1, 703, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68MtsS, "ZZZZZZ.ZZ")), 707, Gx_line+1, 774, Gx_line+17, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV40ContLine = (byte)(AV40ContLine+1) ;
         if ( GXutil.strcmp(AV44Dsc_Idtx, " ") != 0 )
         {
            hAFC0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Dsc_Idtx, "")), 144, Gx_line+1, 291, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV40ContLine = (byte)(AV40ContLine+1) ;
         }
         AV79TotPzas = (int)(AV79TotPzas+A1265BarAlbPie) ;
         AV78TotKgs = AV78TotKgs.add(AV60KgsS) ;
         /* Using cursor P0AFC13 */
         pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A1276FasMtr = P0AFC13_A1276FasMtr[0] ;
            A1242GuiFasPMt = P0AFC13_A1242GuiFasPMt[0] ;
            A8195GuiFasPBM = P0AFC13_A8195GuiFasPBM[0] ;
            n8195GuiFasPBM = P0AFC13_n8195GuiFasPBM[0] ;
            A460FasDsc = P0AFC13_A460FasDsc[0] ;
            A457FasCod = P0AFC13_A457FasCod[0] ;
            A1275FasKgm = P0AFC13_A1275FasKgm[0] ;
            A8194GuiFasPBK = P0AFC13_A8194GuiFasPBK[0] ;
            n8194GuiFasPBK = P0AFC13_n8194GuiFasPBK[0] ;
            A1240GuiFasLin = P0AFC13_A1240GuiFasLin[0] ;
            A460FasDsc = P0AFC13_A460FasDsc[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1242GuiFasPMt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) )
            {
               AV48FasMtr = A1276FasMtr ;
               if ( A8195GuiFasPBM.doubleValue() != 0 )
               {
                  AV48FasMtr = A8195GuiFasPBM ;
               }
               hAFC0( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 156, Gx_line+2, 215, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 220, Gx_line+2, 425, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48FasMtr, "ZZZZZ9.99")), 707, Gx_line+2, 774, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               AV59KgsFasS = A1275FasKgm ;
               if ( A8194GuiFasPBK.doubleValue() != 0 )
               {
                  AV59KgsFasS = A8194GuiFasPBK ;
               }
               hAFC0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 220, Gx_line+1, 425, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59KgsFasS, "ZZZZZ9.99")), 638, Gx_line+0, 705, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 156, Gx_line+1, 215, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            AV40ContLine = (byte)(AV40ContLine+1) ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         if ( ! (0==A1206TubCod) )
         {
            hAFC0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1207TubNom, "")), 156, Gx_line+0, 376, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9")), 658, Gx_line+0, 703, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Un.", ""), 707, Gx_line+0, 730, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         /* Execute user subroutine: 'LOTES' */
         S138 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            pr_default.close(8);
            pr_default.close(8);
            pr_default.close(8);
            pr_default.close(8);
            getPrinter().GxEndPage() ;
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV63Lotes, " ") != 0 )
         {
            AV85Vlote = httpContext.getMessage( "Lote : ", "") + GXutil.trim( AV63Lotes) ;
            hAFC0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Vlote, "")), 61, Gx_line+0, 281, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fio:", ""), 288, Gx_line+0, 318, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Fio5, "")), 321, Gx_line+0, 358, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Jogo:", ""), 367, Gx_line+0, 404, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Jogo3, "")), 404, Gx_line+0, 427, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pol:", ""), 433, Gx_line+0, 463, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV69Pgadas), "ZZZZZZ")), 464, Gx_line+0, 509, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LFA:", ""), 511, Gx_line+0, 541, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 591, Gx_line+0, 621, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Maq6, "")), 621, Gx_line+0, 666, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61Lfa, "ZZZ.ZZ")), 540, Gx_line+0, 585, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81txtmerma, "")), 671, Gx_line+0, 774, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         if ( A14330BarPriorid == 1 )
         {
            if ( (0==AV52flax2) )
            {
               hAFC0( false, 17) ;
               getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EUROPEAN FLAX® certified – certificate nº BVFR7338110", ""), 154, Gx_line+1, 488, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
            }
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S138( ) throws ProcessInterruptedException
   {
      /* 'LOTES' Routine */
      returnInSub = false ;
      AV63Lotes = "" ;
      AV62LoteLast = " " ;
      AV69Pgadas = 0 ;
      AV57Jogo3 = " " ;
      AV49Fio5 = " " ;
      AV64Maq6 = " " ;
      AV61Lfa = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AFC14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV15Barcodreo), AV14Barcodpar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A44AlbRecCod = P0AFC14_A44AlbRecCod[0] ;
         A130BarCodPar = P0AFC14_A130BarCodPar[0] ;
         A132BarCodReo = P0AFC14_A132BarCodReo[0] ;
         A129BarCod = P0AFC14_A129BarCod[0] ;
         A6463AlbRLote = P0AFC14_A6463AlbRLote[0] ;
         A6465AlbRLu = P0AFC14_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0AFC14_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0AFC14_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AFC14_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AFC14_A6470AlbRTara[0] ;
         A200BarPieCod = P0AFC14_A200BarPieCod[0] ;
         A6463AlbRLote = P0AFC14_A6463AlbRLote[0] ;
         A6465AlbRLu = P0AFC14_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0AFC14_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0AFC14_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AFC14_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AFC14_A6470AlbRTara[0] ;
         if ( GXutil.strcmp(AV63Lotes, " ") == 0 )
         {
            AV63Lotes = GXutil.trim( A6463AlbRLote) ;
         }
         else
         {
            if ( GXutil.strcmp(A6463AlbRLote, AV62LoteLast) != 0 )
            {
               AV63Lotes += " / " + GXutil.trim( A6463AlbRLote) ;
            }
         }
         AV62LoteLast = A6463AlbRLote ;
         AV69Pgadas = (int)(DecimalUtil.decToDouble(A6465AlbRLu)) ;
         AV57Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
         AV49Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
         AV64Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
         AV61Lfa = A6470AlbRTara ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV35CliNom = "" ;
      AV25CliDom = "" ;
      AV24Clicp = "" ;
      AV36CliPob = "" ;
      AV34CliNif = "" ;
      AV30CliENom = "" ;
      AV29CliEDom = "" ;
      AV26CliEcp = "" ;
      AV32CliEPob = "" ;
      AV33CliImpReop = httpContext.getMessage( "N", "") ;
      /* Using cursor P0AFC15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV23CliCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A252CliCod = P0AFC15_A252CliCod[0] ;
         n252CliCod = P0AFC15_n252CliCod[0] ;
         A279CliNom = P0AFC15_A279CliNom[0] ;
         A260CliDom = P0AFC15_A260CliDom[0] ;
         A256CliCp = P0AFC15_A256CliCp[0] ;
         A295CliPob = P0AFC15_A295CliPob[0] ;
         A278CliNif = P0AFC15_A278CliNif[0] ;
         A13012CliImpReop = P0AFC15_A13012CliImpReop[0] ;
         AV35CliNom = A279CliNom ;
         AV25CliDom = A260CliDom ;
         AV24Clicp = A256CliCp ;
         AV36CliPob = A295CliPob ;
         AV34CliNif = A278CliNif ;
         AV33CliImpReop = A13012CliImpReop ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      /* Execute user subroutine: 'ENVIO' */
      S181 ();
      if (returnInSub) return;
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      AV27CliEcp12 = " " ;
      AV29CliEDom = httpContext.getMessage( "V/ Instalaçoes", "") ;
      AV26CliEcp = " " ;
      AV32CliEPob = " " ;
      /* Using cursor P0AFC16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV23CliCod), Byte.valueOf(AV31CliEnvDom)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A266CliEnvLin = P0AFC16_A266CliEnvLin[0] ;
         A252CliCod = P0AFC16_A252CliCod[0] ;
         n252CliCod = P0AFC16_n252CliCod[0] ;
         A267CliEnvNom = P0AFC16_A267CliEnvNom[0] ;
         A265CliEnvDom = P0AFC16_A265CliEnvDom[0] ;
         A264CliEnvCp = P0AFC16_A264CliEnvCp[0] ;
         A10775CliEnvCp2 = P0AFC16_A10775CliEnvCp2[0] ;
         A268CliEnvPob = P0AFC16_A268CliEnvPob[0] ;
         AV30CliENom = A267CliEnvNom ;
         AV29CliEDom = A265CliEnvDom ;
         AV26CliEcp = A264CliEnvCp ;
         AV28CliEcp2 = GXutil.trim( A10775CliEnvCp2) ;
         AV32CliEPob = A268CliEnvPob ;
         AV27CliEcp12 = GXutil.trim( A264CliEnvCp) ;
         AV27CliEcp12 += ((GXutil.strcmp(A10775CliEnvCp2, " ")!=0) ? "-"+GXutil.trim( AV28CliEcp2) : "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S1511( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      AV44Dsc_Idtx = "" ;
      /* Using cursor P0AFC17 */
      pr_default.execute(13, new Object[] {A396EmprCod, AV37Cod_Idtx});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A10887Cod_Idtx = P0AFC17_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0AFC17_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0AFC17_n10888Dsc_Idtx[0] ;
         A12703Imp_Idtx = P0AFC17_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P0AFC17_n12703Imp_Idtx[0] ;
         AV44Dsc_Idtx = ((GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", ""))==0) ? GXutil.trim( A10888Dsc_Idtx) : " ") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S1611( ) throws ProcessInterruptedException
   {
      /* 'MERMA' Routine */
      returnInSub = false ;
      AV19BarKilLan = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P0AFC18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV15Barcodreo), AV14Barcodpar});
      c170BarKilLan = P0AFC18_A170BarKilLan[0] ;
      pr_default.close(14);
      AV19BarKilLan = AV19BarKilLan.add(c170BarKilLan) ;
      /* End optimized group. */
   }

   public void hAFC0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçôes:", ""), 58, Gx_line+6, 141, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86vObs[1-1], "")), 150, Gx_line+6, 516, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86vObs[2-1], "")), 150, Gx_line+22, 516, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nota: Eventuais reclamações apenas serão consideradas no prazo de 8 dias, não se aceitando devoluções de malha cortada ou manufacturada.", ""), 13, Gx_line+90, 772, Gx_line+104, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(3, Gx_line+109, 775, Gx_line+109, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86vObs[3-1], "")), 150, Gx_line+38, 516, Gx_line+55, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86vObs[4-1], "")), 150, Gx_line+53, 516, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39ContDsc, "")), 686, Gx_line+74, 770, Gx_line+87, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Texto_1, "")), 56, Gx_line+111, 724, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Texto_2, "")), 77, Gx_line+130, 703, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Texto_fd, "")), 13, Gx_line+74, 243, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11AtId, "")), 308, Gx_line+74, 434, Gx_line+87, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+147) ;
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
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35CliNom, "")), 457, Gx_line+201, 646, Gx_line+219, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25CliDom, "")), 458, Gx_line+223, 672, Gx_line+241, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS.", ""), 100, Gx_line+400, 122, Gx_line+416, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 175, Gx_line+400, 269, Gx_line+416, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 550, Gx_line+400, 587, Gx_line+416, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 633, Gx_line+383, 672, Gx_line+399, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36CliPob, "")), 458, Gx_line+256, 647, Gx_line+274, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(0, Gx_line+300, 775, Gx_line+385, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(0, Gx_line+383, 775, Gx_line+417, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TextoCopia, "")), 679, Gx_line+149, 774, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 25, Gx_line+300, 86, Gx_line+316, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 25, Gx_line+317, 117, Gx_line+333, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 25, Gx_line+333, 126, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 25, Gx_line+350, 95, Gx_line+366, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Contibuinte:", ""), 450, Gx_line+300, 533, Gx_line+316, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 417, Gx_line+317, 529, Gx_line+333, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 475, Gx_line+350, 530, Gx_line+366, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Cor", ""), 425, Gx_line+400, 459, Gx_line+416, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(142, Gx_line+383, 142, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(292, Gx_line+383, 292, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 500, Gx_line+400, 541, Gx_line+416, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(542, Gx_line+383, 542, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(492, Gx_line+383, 492, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 125, Gx_line+300, 170, Gx_line+317, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 125, Gx_line+333, 176, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 125, Gx_line+317, 208, Gx_line+333, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34CliNif, "@!")), 533, Gx_line+300, 638, Gx_line+317, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 679, Gx_line+123, 774, Gx_line+144, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Encom.", ""), 8, Gx_line+400, 63, Gx_line+416, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(58, Gx_line+383, 58, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3868AlbMat, "")), 533, Gx_line+350, 638, Gx_line+367, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), 225, Gx_line+350, 318, Gx_line+367, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+383, 592, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 600, Gx_line+400, 653, Gx_line+416, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 658, Gx_line+400, 700, Gx_line+416, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+400, 775, Gx_line+400, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(650, Gx_line+400, 650, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84VDoc, "")), 457, Gx_line+123, 625, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Cor", ""), 333, Gx_line+400, 365, Gx_line+416, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(392, Gx_line+383, 392, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(433, Gx_line+195, 775, Gx_line+285, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 0, Gx_line+4, 775, Gx_line+90) ;
               getPrinter().GxDrawLine(700, Gx_line+383, 700, Gx_line+416, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 717, Gx_line+383, 757, Gx_line+399, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 708, Gx_line+400, 750, Gx_line+416, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A4023AlbFecSal, "99/99/99"), 125, Gx_line+350, 176, Gx_line+367, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 183, Gx_line+350, 215, Gx_line+366, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TxtAnulado, "")), 9, Gx_line+202, 281, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27CliEcp12, "")), 533, Gx_line+333, 586, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32CliEPob, "")), 608, Gx_line+333, 765, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29CliEDom, "")), 533, Gx_line+317, 711, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10atcud, "")), 263, Gx_line+93, 420, Gx_line+110, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV55Imagen)==0) ? AV97Imagen_GXI : AV55Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 286, Gx_line+110, 419, Gx_line+248) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "95455c83-4215-4a0c-83f2-f37dd13189ec", "", context.getHttpContext().getTheme( )), 0, Gx_line+250, 425, Gx_line+286) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+422) ;
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
      this.aP4[0] = pgrmoda_direct.this.Gx_page;
      this.aP5[0] = pgrmoda_direct.this.Gx_line;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39ContDsc = "" ;
      AV51Firmad = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P0AFC2_A396EmprCod = new String[] {""} ;
      P0AFC2_A8335EmpItm2 = new String[] {""} ;
      P0AFC2_n8335EmpItm2 = new boolean[] {false} ;
      P0AFC2_A8334EmpItm1 = new String[] {""} ;
      P0AFC2_n8334EmpItm1 = new boolean[] {false} ;
      P0AFC2_A8337EmpItm4 = new String[] {""} ;
      P0AFC2_n8337EmpItm4 = new boolean[] {false} ;
      P0AFC2_A8336EmpItm3 = new String[] {""} ;
      P0AFC2_n8336EmpItm3 = new boolean[] {false} ;
      P0AFC2_A395EmprCif = new String[] {""} ;
      P0AFC2_n395EmprCif = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV73Texto_1 = "" ;
      AV74Texto_2 = "" ;
      AV45EmprCif = "" ;
      P0AFC3_A396EmprCod = new String[] {""} ;
      P0AFC3_A30AlbProCod = new long[1] ;
      P0AFC3_A14069AlbPdATCUD = new String[] {""} ;
      P0AFC3_A1259AlbDomEnv = new byte[1] ;
      P0AFC3_n1259AlbDomEnv = new boolean[] {false} ;
      P0AFC3_A39AlbProPri = new String[] {""} ;
      P0AFC3_A10017AlbFmd = new String[] {""} ;
      P0AFC3_n10017AlbFmd = new boolean[] {false} ;
      P0AFC3_A7101AlbLic = new String[] {""} ;
      P0AFC3_A407EmprNom = new String[] {""} ;
      P0AFC3_n407EmprNom = new boolean[] {false} ;
      P0AFC3_A5140AlbMarca = new String[] {""} ;
      P0AFC3_A1879AlbProEnt = new String[] {""} ;
      P0AFC3_n1879AlbProEnt = new boolean[] {false} ;
      P0AFC3_A33AlbProEst = new byte[1] ;
      P0AFC3_A1782AlbProEso = new byte[1] ;
      P0AFC3_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFC3_A3865AlbHorSal = new String[] {""} ;
      P0AFC3_A3868AlbMat = new String[] {""} ;
      P0AFC3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFC3_A1243GuiRemCli = new int[1] ;
      A14069AlbPdATCUD = "" ;
      A39AlbProPri = "" ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      A407EmprNom = "" ;
      A5140AlbMarca = "" ;
      A1879AlbProEnt = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV38codValidacaoSerie = "" ;
      AV10atcud = "" ;
      AV72Prioridad = "" ;
      AV75Texto_fd = "" ;
      AV50Firma4dig = "" ;
      AV11AtId = "" ;
      AV77TextoGenerar = "" ;
      AV34CliNif = "" ;
      AV22Centimetos = DecimalUtil.ZERO ;
      AV82Url = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV55Imagen = "" ;
      AV97Imagen_GXI = "" ;
      AV46EmprNom = "" ;
      AV84VDoc = "" ;
      AV83vCopia = "" ;
      AV86vObs = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV86vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AFC4_A396EmprCod = new String[] {""} ;
      P0AFC4_A30AlbProCod = new long[1] ;
      P0AFC4_A916AlbPObs = new String[] {""} ;
      P0AFC4_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      P0AFC5_A396EmprCod = new String[] {""} ;
      P0AFC5_A30AlbProCod = new long[1] ;
      P0AFC5_A12184DltObs = new String[] {""} ;
      P0AFC5_n12184DltObs = new boolean[] {false} ;
      P0AFC5_A12185DltLinObs = new byte[1] ;
      A12184DltObs = "" ;
      AV80TxtAnulado = "" ;
      AV65Matricula = "" ;
      AV78TotKgs = DecimalUtil.ZERO ;
      P0AFC7_A396EmprCod = new String[] {""} ;
      P0AFC7_A12178DltP = new String[] {""} ;
      P0AFC7_A12177DltR = new byte[1] ;
      P0AFC7_A12176DltHdr = new int[1] ;
      P0AFC7_A30AlbProCod = new long[1] ;
      P0AFC7_A12153DltColNum = new int[1] ;
      P0AFC7_n12153DltColNum = new boolean[] {false} ;
      P0AFC7_A12145DltKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC7_n12145DltKgs = new boolean[] {false} ;
      P0AFC7_A12147DltPzs = new int[1] ;
      P0AFC7_n12147DltPzs = new boolean[] {false} ;
      P0AFC7_A12150DltArtCod = new String[] {""} ;
      P0AFC7_n12150DltArtCod = new boolean[] {false} ;
      P0AFC7_A12186DltKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC7_n12186DltKgsCli = new boolean[] {false} ;
      P0AFC7_A12151DltArtDsc = new String[] {""} ;
      P0AFC7_n12151DltArtDsc = new boolean[] {false} ;
      P0AFC7_A12187DltTubo = new short[1] ;
      P0AFC7_n12187DltTubo = new boolean[] {false} ;
      P0AFC7_A12149DltTubos = new int[1] ;
      P0AFC7_n12149DltTubos = new boolean[] {false} ;
      P0AFC7_A12188DltTuboN = new String[] {""} ;
      P0AFC7_n12188DltTuboN = new boolean[] {false} ;
      A12178DltP = "" ;
      A12145DltKgs = DecimalUtil.ZERO ;
      A12150DltArtCod = "" ;
      A12186DltKgsCli = DecimalUtil.ZERO ;
      A12151DltArtDsc = "" ;
      A12188DltTuboN = "" ;
      AV53Hdr = "" ;
      AV33CliImpReop = "" ;
      AV14Barcodpar = "" ;
      AV58KgsE = DecimalUtil.ZERO ;
      AV8BarKgm = DecimalUtil.ZERO ;
      AV60KgsS = DecimalUtil.ZERO ;
      AV68MtsS = DecimalUtil.ZERO ;
      AV21BarSerDsc = "" ;
      AV18Bardisnum = "" ;
      AV20barnomcli = "" ;
      AV16barcolnom = "" ;
      P0AFC8_A396EmprCod = new String[] {""} ;
      P0AFC8_A30AlbProCod = new long[1] ;
      P0AFC8_A12176DltHdr = new int[1] ;
      P0AFC8_A12177DltR = new byte[1] ;
      P0AFC8_A12178DltP = new String[] {""} ;
      P0AFC8_A12175DltMtsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC8_n12175DltMtsFs = new boolean[] {false} ;
      P0AFC8_A12190DltPrMFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC8_n12190DltPrMFs = new boolean[] {false} ;
      P0AFC8_A12192DltPrMBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC8_n12192DltPrMBFs = new boolean[] {false} ;
      P0AFC8_A12173DltFasDsc = new String[] {""} ;
      P0AFC8_n12173DltFasDsc = new boolean[] {false} ;
      P0AFC8_A12172DltFascod = new String[] {""} ;
      P0AFC8_n12172DltFascod = new boolean[] {false} ;
      P0AFC8_A12174DltKgsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC8_n12174DltKgsFs = new boolean[] {false} ;
      P0AFC8_A12191DltPrKBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC8_n12191DltPrKBFs = new boolean[] {false} ;
      P0AFC8_A12182DltLin = new short[1] ;
      A12175DltMtsFs = DecimalUtil.ZERO ;
      A12190DltPrMFs = DecimalUtil.ZERO ;
      A12192DltPrMBFs = DecimalUtil.ZERO ;
      A12173DltFasDsc = "" ;
      A12172DltFascod = "" ;
      A12174DltKgsFs = DecimalUtil.ZERO ;
      A12191DltPrKBFs = DecimalUtil.ZERO ;
      AV48FasMtr = DecimalUtil.ZERO ;
      AV59KgsFasS = DecimalUtil.ZERO ;
      AV63Lotes = "" ;
      AV85Vlote = "" ;
      AV49Fio5 = "" ;
      AV57Jogo3 = "" ;
      AV64Maq6 = "" ;
      AV61Lfa = DecimalUtil.ZERO ;
      AV81txtmerma = "" ;
      P0AFC10_A396EmprCod = new String[] {""} ;
      P0AFC10_A130BarCodPar = new String[] {""} ;
      P0AFC10_A132BarCodReo = new byte[1] ;
      P0AFC10_A129BarCod = new int[1] ;
      P0AFC10_A252CliCod = new int[1] ;
      P0AFC10_n252CliCod = new boolean[] {false} ;
      P0AFC10_A143BarDisNum = new String[] {""} ;
      P0AFC10_A1234BarNomCli = new String[] {""} ;
      P0AFC10_A135BarColNom = new String[] {""} ;
      P0AFC10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC10_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      P0AFC12_A396EmprCod = new String[] {""} ;
      P0AFC12_A130BarCodPar = new String[] {""} ;
      P0AFC12_A132BarCodReo = new byte[1] ;
      P0AFC12_A129BarCod = new int[1] ;
      P0AFC12_A30AlbProCod = new long[1] ;
      P0AFC12_A2829BarProPer = new String[] {""} ;
      P0AFC12_A136BarColNum = new int[1] ;
      P0AFC12_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC12_A1265BarAlbPie = new int[1] ;
      P0AFC12_A213BarSit = new byte[1] ;
      P0AFC12_A12909CliImpMerm = new String[] {""} ;
      P0AFC12_A13236CliFacMtsP = new String[] {""} ;
      P0AFC12_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC12_A252CliCod = new int[1] ;
      P0AFC12_n252CliCod = new boolean[] {false} ;
      P0AFC12_A212BarSer = new String[] {""} ;
      P0AFC12_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC12_n2243BarKgsCli = new boolean[] {false} ;
      P0AFC12_A1652BarSerDsc = new String[] {""} ;
      P0AFC12_A143BarDisNum = new String[] {""} ;
      P0AFC12_A1234BarNomCli = new String[] {""} ;
      P0AFC12_A135BarColNom = new String[] {""} ;
      P0AFC12_A1206TubCod = new short[1] ;
      P0AFC12_n1206TubCod = new boolean[] {false} ;
      P0AFC12_A1266BarAlbTub = new int[1] ;
      P0AFC12_A1207TubNom = new String[] {""} ;
      P0AFC12_n1207TubNom = new boolean[] {false} ;
      P0AFC12_A14330BarPriorid = new byte[1] ;
      P0AFC12_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC12_n166BarKgm = new boolean[] {false} ;
      A2829BarProPer = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A12909CliImpMerm = "" ;
      A13236CliFacMtsP = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A1207TubNom = "" ;
      AV44Dsc_Idtx = "" ;
      AV37Cod_Idtx = "" ;
      AV19BarKilLan = DecimalUtil.ZERO ;
      P0AFC13_A396EmprCod = new String[] {""} ;
      P0AFC13_A30AlbProCod = new long[1] ;
      P0AFC13_A129BarCod = new int[1] ;
      P0AFC13_A132BarCodReo = new byte[1] ;
      P0AFC13_A130BarCodPar = new String[] {""} ;
      P0AFC13_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC13_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC13_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC13_n8195GuiFasPBM = new boolean[] {false} ;
      P0AFC13_A460FasDsc = new String[] {""} ;
      P0AFC13_A457FasCod = new String[] {""} ;
      P0AFC13_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC13_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC13_n8194GuiFasPBK = new boolean[] {false} ;
      P0AFC13_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      AV62LoteLast = "" ;
      P0AFC14_A44AlbRecCod = new int[1] ;
      P0AFC14_A396EmprCod = new String[] {""} ;
      P0AFC14_A130BarCodPar = new String[] {""} ;
      P0AFC14_A132BarCodReo = new byte[1] ;
      P0AFC14_A129BarCod = new int[1] ;
      P0AFC14_A6463AlbRLote = new String[] {""} ;
      P0AFC14_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC14_A4602AlbRMdlCod = new String[] {""} ;
      P0AFC14_A6464AlbRTelar = new String[] {""} ;
      P0AFC14_A8035AlbMaqTej = new String[] {""} ;
      P0AFC14_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFC14_A200BarPieCod = new String[] {""} ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV35CliNom = "" ;
      AV25CliDom = "" ;
      AV24Clicp = "" ;
      AV36CliPob = "" ;
      AV30CliENom = "" ;
      AV29CliEDom = "" ;
      AV26CliEcp = "" ;
      AV32CliEPob = "" ;
      P0AFC15_A396EmprCod = new String[] {""} ;
      P0AFC15_A252CliCod = new int[1] ;
      P0AFC15_n252CliCod = new boolean[] {false} ;
      P0AFC15_A279CliNom = new String[] {""} ;
      P0AFC15_A260CliDom = new String[] {""} ;
      P0AFC15_A256CliCp = new String[] {""} ;
      P0AFC15_A295CliPob = new String[] {""} ;
      P0AFC15_A278CliNif = new String[] {""} ;
      P0AFC15_A13012CliImpReop = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A13012CliImpReop = "" ;
      AV27CliEcp12 = "" ;
      P0AFC16_A396EmprCod = new String[] {""} ;
      P0AFC16_A266CliEnvLin = new byte[1] ;
      P0AFC16_A252CliCod = new int[1] ;
      P0AFC16_n252CliCod = new boolean[] {false} ;
      P0AFC16_A267CliEnvNom = new String[] {""} ;
      P0AFC16_A265CliEnvDom = new String[] {""} ;
      P0AFC16_A264CliEnvCp = new String[] {""} ;
      P0AFC16_A10775CliEnvCp2 = new String[] {""} ;
      P0AFC16_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A268CliEnvPob = "" ;
      AV28CliEcp2 = "" ;
      P0AFC17_A396EmprCod = new String[] {""} ;
      P0AFC17_A10887Cod_Idtx = new String[] {""} ;
      P0AFC17_A10888Dsc_Idtx = new String[] {""} ;
      P0AFC17_n10888Dsc_Idtx = new boolean[] {false} ;
      P0AFC17_A12703Imp_Idtx = new String[] {""} ;
      P0AFC17_n12703Imp_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      A12703Imp_Idtx = "" ;
      c170BarKilLan = DecimalUtil.ZERO ;
      P0AFC18_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV55Imagen = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.pgrmoda_direct__default(),
         new Object[] {
             new Object[] {
            P0AFC2_A396EmprCod, P0AFC2_A8335EmpItm2, P0AFC2_n8335EmpItm2, P0AFC2_A8334EmpItm1, P0AFC2_n8334EmpItm1, P0AFC2_A8337EmpItm4, P0AFC2_n8337EmpItm4, P0AFC2_A8336EmpItm3, P0AFC2_n8336EmpItm3, P0AFC2_A395EmprCif,
            P0AFC2_n395EmprCif
            }
            , new Object[] {
            P0AFC3_A396EmprCod, P0AFC3_A30AlbProCod, P0AFC3_A14069AlbPdATCUD, P0AFC3_A1259AlbDomEnv, P0AFC3_n1259AlbDomEnv, P0AFC3_A39AlbProPri, P0AFC3_A10017AlbFmd, P0AFC3_n10017AlbFmd, P0AFC3_A7101AlbLic, P0AFC3_A407EmprNom,
            P0AFC3_n407EmprNom, P0AFC3_A5140AlbMarca, P0AFC3_A1879AlbProEnt, P0AFC3_n1879AlbProEnt, P0AFC3_A33AlbProEst, P0AFC3_A1782AlbProEso, P0AFC3_A4023AlbFecSal, P0AFC3_A3865AlbHorSal, P0AFC3_A3868AlbMat, P0AFC3_A34AlbProfch,
            P0AFC3_A1243GuiRemCli
            }
            , new Object[] {
            P0AFC4_A396EmprCod, P0AFC4_A30AlbProCod, P0AFC4_A916AlbPObs, P0AFC4_A915AlbPObsLin
            }
            , new Object[] {
            P0AFC5_A396EmprCod, P0AFC5_A30AlbProCod, P0AFC5_A12184DltObs, P0AFC5_n12184DltObs, P0AFC5_A12185DltLinObs
            }
            , new Object[] {
            }
            , new Object[] {
            P0AFC7_A396EmprCod, P0AFC7_A12178DltP, P0AFC7_A12177DltR, P0AFC7_A12176DltHdr, P0AFC7_A30AlbProCod, P0AFC7_A12153DltColNum, P0AFC7_n12153DltColNum, P0AFC7_A12145DltKgs, P0AFC7_n12145DltKgs, P0AFC7_A12147DltPzs,
            P0AFC7_n12147DltPzs, P0AFC7_A12150DltArtCod, P0AFC7_n12150DltArtCod, P0AFC7_A12186DltKgsCli, P0AFC7_n12186DltKgsCli, P0AFC7_A12151DltArtDsc, P0AFC7_n12151DltArtDsc, P0AFC7_A12187DltTubo, P0AFC7_n12187DltTubo, P0AFC7_A12149DltTubos,
            P0AFC7_n12149DltTubos, P0AFC7_A12188DltTuboN, P0AFC7_n12188DltTuboN
            }
            , new Object[] {
            P0AFC8_A396EmprCod, P0AFC8_A30AlbProCod, P0AFC8_A12176DltHdr, P0AFC8_A12177DltR, P0AFC8_A12178DltP, P0AFC8_A12175DltMtsFs, P0AFC8_n12175DltMtsFs, P0AFC8_A12190DltPrMFs, P0AFC8_n12190DltPrMFs, P0AFC8_A12192DltPrMBFs,
            P0AFC8_n12192DltPrMBFs, P0AFC8_A12173DltFasDsc, P0AFC8_n12173DltFasDsc, P0AFC8_A12172DltFascod, P0AFC8_n12172DltFascod, P0AFC8_A12174DltKgsFs, P0AFC8_n12174DltKgsFs, P0AFC8_A12191DltPrKBFs, P0AFC8_n12191DltPrKBFs, P0AFC8_A12182DltLin
            }
            , new Object[] {
            P0AFC10_A396EmprCod, P0AFC10_A130BarCodPar, P0AFC10_A132BarCodReo, P0AFC10_A129BarCod, P0AFC10_A252CliCod, P0AFC10_n252CliCod, P0AFC10_A143BarDisNum, P0AFC10_A1234BarNomCli, P0AFC10_A135BarColNom, P0AFC10_A166BarKgm,
            P0AFC10_n166BarKgm
            }
            , new Object[] {
            P0AFC12_A396EmprCod, P0AFC12_A130BarCodPar, P0AFC12_A132BarCodReo, P0AFC12_A129BarCod, P0AFC12_A30AlbProCod, P0AFC12_A2829BarProPer, P0AFC12_A136BarColNum, P0AFC12_A1261BarAlbKgmE, P0AFC12_A1265BarAlbPie, P0AFC12_A213BarSit,
            P0AFC12_A12909CliImpMerm, P0AFC12_A13236CliFacMtsP, P0AFC12_A1263BarAlbMtrE, P0AFC12_A252CliCod, P0AFC12_n252CliCod, P0AFC12_A212BarSer, P0AFC12_A2243BarKgsCli, P0AFC12_n2243BarKgsCli, P0AFC12_A1652BarSerDsc, P0AFC12_A143BarDisNum,
            P0AFC12_A1234BarNomCli, P0AFC12_A135BarColNom, P0AFC12_A1206TubCod, P0AFC12_n1206TubCod, P0AFC12_A1266BarAlbTub, P0AFC12_A1207TubNom, P0AFC12_n1207TubNom, P0AFC12_A14330BarPriorid, P0AFC12_A166BarKgm, P0AFC12_n166BarKgm
            }
            , new Object[] {
            P0AFC13_A396EmprCod, P0AFC13_A30AlbProCod, P0AFC13_A129BarCod, P0AFC13_A132BarCodReo, P0AFC13_A130BarCodPar, P0AFC13_A1276FasMtr, P0AFC13_A1242GuiFasPMt, P0AFC13_A8195GuiFasPBM, P0AFC13_n8195GuiFasPBM, P0AFC13_A460FasDsc,
            P0AFC13_A457FasCod, P0AFC13_A1275FasKgm, P0AFC13_A8194GuiFasPBK, P0AFC13_n8194GuiFasPBK, P0AFC13_A1240GuiFasLin
            }
            , new Object[] {
            P0AFC14_A44AlbRecCod, P0AFC14_A396EmprCod, P0AFC14_A130BarCodPar, P0AFC14_A132BarCodReo, P0AFC14_A129BarCod, P0AFC14_A6463AlbRLote, P0AFC14_A6465AlbRLu, P0AFC14_A4602AlbRMdlCod, P0AFC14_A6464AlbRTelar, P0AFC14_A8035AlbMaqTej,
            P0AFC14_A6470AlbRTara, P0AFC14_A200BarPieCod
            }
            , new Object[] {
            P0AFC15_A396EmprCod, P0AFC15_A252CliCod, P0AFC15_A279CliNom, P0AFC15_A260CliDom, P0AFC15_A256CliCp, P0AFC15_A295CliPob, P0AFC15_A278CliNif, P0AFC15_A13012CliImpReop
            }
            , new Object[] {
            P0AFC16_A396EmprCod, P0AFC16_A266CliEnvLin, P0AFC16_A252CliCod, P0AFC16_A267CliEnvNom, P0AFC16_A265CliEnvDom, P0AFC16_A264CliEnvCp, P0AFC16_A10775CliEnvCp2, P0AFC16_A268CliEnvPob
            }
            , new Object[] {
            P0AFC17_A396EmprCod, P0AFC17_A10887Cod_Idtx, P0AFC17_A10888Dsc_Idtx, P0AFC17_n10888Dsc_Idtx, P0AFC17_A12703Imp_Idtx, P0AFC17_n12703Imp_Idtx
            }
            , new Object[] {
            P0AFC18_A170BarKilLan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV47existefirmad ;
   private byte AV71PQrcode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte AV31CliEnvDom ;
   private byte AV67mes ;
   private byte AV42dia ;
   private byte AV41Copias ;
   private byte AV54i ;
   private byte A915AlbPObsLin ;
   private byte A12185DltLinObs ;
   private byte AV40ContLine ;
   private byte A12177DltR ;
   private byte AV15Barcodreo ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A14330BarPriorid ;
   private byte A266CliEnvLin ;
   private short AV52flax2 ;
   private short AV9anyo ;
   private short AV43Dpi ;
   private short AV70Pixel ;
   private short A12187DltTubo ;
   private short A12182DltLin ;
   private short A1206TubCod ;
   private short AV66merma ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int Gx_page ;
   private int Gx_line ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV23CliCod ;
   private int GX_I ;
   private int AV79TotPzas ;
   private int Gx_OldLine ;
   private int A12176DltHdr ;
   private int A12153DltColNum ;
   private int A12147DltPzs ;
   private int A12149DltTubos ;
   private int AV17barcolnum ;
   private int AV13Barcod ;
   private int AV12baralbpie ;
   private int AV69Pgadas ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int A44AlbRecCod ;
   private long A30AlbProCod ;
   private long AV87Albprocod ;
   private java.math.BigDecimal AV22Centimetos ;
   private java.math.BigDecimal AV78TotKgs ;
   private java.math.BigDecimal A12145DltKgs ;
   private java.math.BigDecimal A12186DltKgsCli ;
   private java.math.BigDecimal AV58KgsE ;
   private java.math.BigDecimal AV8BarKgm ;
   private java.math.BigDecimal AV60KgsS ;
   private java.math.BigDecimal AV68MtsS ;
   private java.math.BigDecimal A12175DltMtsFs ;
   private java.math.BigDecimal A12190DltPrMFs ;
   private java.math.BigDecimal A12192DltPrMBFs ;
   private java.math.BigDecimal A12174DltKgsFs ;
   private java.math.BigDecimal A12191DltPrKBFs ;
   private java.math.BigDecimal AV48FasMtr ;
   private java.math.BigDecimal AV59KgsFasS ;
   private java.math.BigDecimal AV61Lfa ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal AV19BarKilLan ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal c170BarKilLan ;
   private String A396EmprCod ;
   private String AV56ImpCod ;
   private String AV76TextoCopia ;
   private String AV39ContDsc ;
   private String AV51Firmad ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV73Texto_1 ;
   private String AV74Texto_2 ;
   private String AV45EmprCif ;
   private String A14069AlbPdATCUD ;
   private String A39AlbProPri ;
   private String A7101AlbLic ;
   private String A407EmprNom ;
   private String A5140AlbMarca ;
   private String A1879AlbProEnt ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String AV38codValidacaoSerie ;
   private String AV10atcud ;
   private String AV72Prioridad ;
   private String AV75Texto_fd ;
   private String AV50Firma4dig ;
   private String AV11AtId ;
   private String AV34CliNif ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV46EmprNom ;
   private String AV84VDoc ;
   private String AV83vCopia ;
   private String AV86vObs[] ;
   private String A916AlbPObs ;
   private String A12184DltObs ;
   private String AV80TxtAnulado ;
   private String AV65Matricula ;
   private String A12178DltP ;
   private String A12150DltArtCod ;
   private String A12151DltArtDsc ;
   private String A12188DltTuboN ;
   private String AV53Hdr ;
   private String AV33CliImpReop ;
   private String AV14Barcodpar ;
   private String AV21BarSerDsc ;
   private String AV18Bardisnum ;
   private String AV20barnomcli ;
   private String AV16barcolnom ;
   private String A12173DltFasDsc ;
   private String A12172DltFascod ;
   private String AV63Lotes ;
   private String AV85Vlote ;
   private String AV49Fio5 ;
   private String AV57Jogo3 ;
   private String AV64Maq6 ;
   private String AV81txtmerma ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A2829BarProPer ;
   private String A12909CliImpMerm ;
   private String A13236CliFacMtsP ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A1207TubNom ;
   private String AV44Dsc_Idtx ;
   private String AV37Cod_Idtx ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV62LoteLast ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String A200BarPieCod ;
   private String AV35CliNom ;
   private String AV25CliDom ;
   private String AV24Clicp ;
   private String AV36CliPob ;
   private String AV30CliENom ;
   private String AV29CliEDom ;
   private String AV26CliEcp ;
   private String AV32CliEPob ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A13012CliImpReop ;
   private String AV27CliEcp12 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A10775CliEnvCp2 ;
   private String A268CliEnvPob ;
   private String AV28CliEcp2 ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A12703Imp_Idtx ;
   private String sImgUrl ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date A34AlbProfch ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean GxHdr3 ;
   private boolean n1259AlbDomEnv ;
   private boolean n10017AlbFmd ;
   private boolean n407EmprNom ;
   private boolean n1879AlbProEnt ;
   private boolean returnInSub ;
   private boolean n12184DltObs ;
   private boolean n12153DltColNum ;
   private boolean n12145DltKgs ;
   private boolean n12147DltPzs ;
   private boolean n12150DltArtCod ;
   private boolean n12186DltKgsCli ;
   private boolean n12151DltArtDsc ;
   private boolean n12187DltTubo ;
   private boolean n12149DltTubos ;
   private boolean n12188DltTuboN ;
   private boolean n12175DltMtsFs ;
   private boolean n12190DltPrMFs ;
   private boolean n12192DltPrMBFs ;
   private boolean n12173DltFasDsc ;
   private boolean n12172DltFascod ;
   private boolean n12174DltKgsFs ;
   private boolean n12191DltPrKBFs ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean n2243BarKgsCli ;
   private boolean n1206TubCod ;
   private boolean n1207TubNom ;
   private boolean n8195GuiFasPBM ;
   private boolean n8194GuiFasPBK ;
   private boolean n10888Dsc_Idtx ;
   private boolean n12703Imp_Idtx ;
   private String A10017AlbFmd ;
   private String AV77TextoGenerar ;
   private String AV82Url ;
   private String AV97Imagen_GXI ;
   private String AV55Imagen ;
   private String Imagen ;
   private IReportHandler reportHandler ;
   private int[] aP5 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AFC2_A396EmprCod ;
   private String[] P0AFC2_A8335EmpItm2 ;
   private boolean[] P0AFC2_n8335EmpItm2 ;
   private String[] P0AFC2_A8334EmpItm1 ;
   private boolean[] P0AFC2_n8334EmpItm1 ;
   private String[] P0AFC2_A8337EmpItm4 ;
   private boolean[] P0AFC2_n8337EmpItm4 ;
   private String[] P0AFC2_A8336EmpItm3 ;
   private boolean[] P0AFC2_n8336EmpItm3 ;
   private String[] P0AFC2_A395EmprCif ;
   private boolean[] P0AFC2_n395EmprCif ;
   private String[] P0AFC3_A396EmprCod ;
   private long[] P0AFC3_A30AlbProCod ;
   private String[] P0AFC3_A14069AlbPdATCUD ;
   private byte[] P0AFC3_A1259AlbDomEnv ;
   private boolean[] P0AFC3_n1259AlbDomEnv ;
   private String[] P0AFC3_A39AlbProPri ;
   private String[] P0AFC3_A10017AlbFmd ;
   private boolean[] P0AFC3_n10017AlbFmd ;
   private String[] P0AFC3_A7101AlbLic ;
   private String[] P0AFC3_A407EmprNom ;
   private boolean[] P0AFC3_n407EmprNom ;
   private String[] P0AFC3_A5140AlbMarca ;
   private String[] P0AFC3_A1879AlbProEnt ;
   private boolean[] P0AFC3_n1879AlbProEnt ;
   private byte[] P0AFC3_A33AlbProEst ;
   private byte[] P0AFC3_A1782AlbProEso ;
   private java.util.Date[] P0AFC3_A4023AlbFecSal ;
   private String[] P0AFC3_A3865AlbHorSal ;
   private String[] P0AFC3_A3868AlbMat ;
   private java.util.Date[] P0AFC3_A34AlbProfch ;
   private int[] P0AFC3_A1243GuiRemCli ;
   private String[] P0AFC4_A396EmprCod ;
   private long[] P0AFC4_A30AlbProCod ;
   private String[] P0AFC4_A916AlbPObs ;
   private byte[] P0AFC4_A915AlbPObsLin ;
   private String[] P0AFC5_A396EmprCod ;
   private long[] P0AFC5_A30AlbProCod ;
   private String[] P0AFC5_A12184DltObs ;
   private boolean[] P0AFC5_n12184DltObs ;
   private byte[] P0AFC5_A12185DltLinObs ;
   private String[] P0AFC7_A396EmprCod ;
   private String[] P0AFC7_A12178DltP ;
   private byte[] P0AFC7_A12177DltR ;
   private int[] P0AFC7_A12176DltHdr ;
   private long[] P0AFC7_A30AlbProCod ;
   private int[] P0AFC7_A12153DltColNum ;
   private boolean[] P0AFC7_n12153DltColNum ;
   private java.math.BigDecimal[] P0AFC7_A12145DltKgs ;
   private boolean[] P0AFC7_n12145DltKgs ;
   private int[] P0AFC7_A12147DltPzs ;
   private boolean[] P0AFC7_n12147DltPzs ;
   private String[] P0AFC7_A12150DltArtCod ;
   private boolean[] P0AFC7_n12150DltArtCod ;
   private java.math.BigDecimal[] P0AFC7_A12186DltKgsCli ;
   private boolean[] P0AFC7_n12186DltKgsCli ;
   private String[] P0AFC7_A12151DltArtDsc ;
   private boolean[] P0AFC7_n12151DltArtDsc ;
   private short[] P0AFC7_A12187DltTubo ;
   private boolean[] P0AFC7_n12187DltTubo ;
   private int[] P0AFC7_A12149DltTubos ;
   private boolean[] P0AFC7_n12149DltTubos ;
   private String[] P0AFC7_A12188DltTuboN ;
   private boolean[] P0AFC7_n12188DltTuboN ;
   private String[] P0AFC8_A396EmprCod ;
   private long[] P0AFC8_A30AlbProCod ;
   private int[] P0AFC8_A12176DltHdr ;
   private byte[] P0AFC8_A12177DltR ;
   private String[] P0AFC8_A12178DltP ;
   private java.math.BigDecimal[] P0AFC8_A12175DltMtsFs ;
   private boolean[] P0AFC8_n12175DltMtsFs ;
   private java.math.BigDecimal[] P0AFC8_A12190DltPrMFs ;
   private boolean[] P0AFC8_n12190DltPrMFs ;
   private java.math.BigDecimal[] P0AFC8_A12192DltPrMBFs ;
   private boolean[] P0AFC8_n12192DltPrMBFs ;
   private String[] P0AFC8_A12173DltFasDsc ;
   private boolean[] P0AFC8_n12173DltFasDsc ;
   private String[] P0AFC8_A12172DltFascod ;
   private boolean[] P0AFC8_n12172DltFascod ;
   private java.math.BigDecimal[] P0AFC8_A12174DltKgsFs ;
   private boolean[] P0AFC8_n12174DltKgsFs ;
   private java.math.BigDecimal[] P0AFC8_A12191DltPrKBFs ;
   private boolean[] P0AFC8_n12191DltPrKBFs ;
   private short[] P0AFC8_A12182DltLin ;
   private String[] P0AFC10_A396EmprCod ;
   private String[] P0AFC10_A130BarCodPar ;
   private byte[] P0AFC10_A132BarCodReo ;
   private int[] P0AFC10_A129BarCod ;
   private int[] P0AFC10_A252CliCod ;
   private boolean[] P0AFC10_n252CliCod ;
   private String[] P0AFC10_A143BarDisNum ;
   private String[] P0AFC10_A1234BarNomCli ;
   private String[] P0AFC10_A135BarColNom ;
   private java.math.BigDecimal[] P0AFC10_A166BarKgm ;
   private boolean[] P0AFC10_n166BarKgm ;
   private String[] P0AFC12_A396EmprCod ;
   private String[] P0AFC12_A130BarCodPar ;
   private byte[] P0AFC12_A132BarCodReo ;
   private int[] P0AFC12_A129BarCod ;
   private long[] P0AFC12_A30AlbProCod ;
   private String[] P0AFC12_A2829BarProPer ;
   private int[] P0AFC12_A136BarColNum ;
   private java.math.BigDecimal[] P0AFC12_A1261BarAlbKgmE ;
   private int[] P0AFC12_A1265BarAlbPie ;
   private byte[] P0AFC12_A213BarSit ;
   private String[] P0AFC12_A12909CliImpMerm ;
   private String[] P0AFC12_A13236CliFacMtsP ;
   private java.math.BigDecimal[] P0AFC12_A1263BarAlbMtrE ;
   private int[] P0AFC12_A252CliCod ;
   private boolean[] P0AFC12_n252CliCod ;
   private String[] P0AFC12_A212BarSer ;
   private java.math.BigDecimal[] P0AFC12_A2243BarKgsCli ;
   private boolean[] P0AFC12_n2243BarKgsCli ;
   private String[] P0AFC12_A1652BarSerDsc ;
   private String[] P0AFC12_A143BarDisNum ;
   private String[] P0AFC12_A1234BarNomCli ;
   private String[] P0AFC12_A135BarColNom ;
   private short[] P0AFC12_A1206TubCod ;
   private boolean[] P0AFC12_n1206TubCod ;
   private int[] P0AFC12_A1266BarAlbTub ;
   private String[] P0AFC12_A1207TubNom ;
   private boolean[] P0AFC12_n1207TubNom ;
   private byte[] P0AFC12_A14330BarPriorid ;
   private java.math.BigDecimal[] P0AFC12_A166BarKgm ;
   private boolean[] P0AFC12_n166BarKgm ;
   private String[] P0AFC13_A396EmprCod ;
   private long[] P0AFC13_A30AlbProCod ;
   private int[] P0AFC13_A129BarCod ;
   private byte[] P0AFC13_A132BarCodReo ;
   private String[] P0AFC13_A130BarCodPar ;
   private java.math.BigDecimal[] P0AFC13_A1276FasMtr ;
   private java.math.BigDecimal[] P0AFC13_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0AFC13_A8195GuiFasPBM ;
   private boolean[] P0AFC13_n8195GuiFasPBM ;
   private String[] P0AFC13_A460FasDsc ;
   private String[] P0AFC13_A457FasCod ;
   private java.math.BigDecimal[] P0AFC13_A1275FasKgm ;
   private java.math.BigDecimal[] P0AFC13_A8194GuiFasPBK ;
   private boolean[] P0AFC13_n8194GuiFasPBK ;
   private short[] P0AFC13_A1240GuiFasLin ;
   private int[] P0AFC14_A44AlbRecCod ;
   private String[] P0AFC14_A396EmprCod ;
   private String[] P0AFC14_A130BarCodPar ;
   private byte[] P0AFC14_A132BarCodReo ;
   private int[] P0AFC14_A129BarCod ;
   private String[] P0AFC14_A6463AlbRLote ;
   private java.math.BigDecimal[] P0AFC14_A6465AlbRLu ;
   private String[] P0AFC14_A4602AlbRMdlCod ;
   private String[] P0AFC14_A6464AlbRTelar ;
   private String[] P0AFC14_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AFC14_A6470AlbRTara ;
   private String[] P0AFC14_A200BarPieCod ;
   private String[] P0AFC15_A396EmprCod ;
   private int[] P0AFC15_A252CliCod ;
   private boolean[] P0AFC15_n252CliCod ;
   private String[] P0AFC15_A279CliNom ;
   private String[] P0AFC15_A260CliDom ;
   private String[] P0AFC15_A256CliCp ;
   private String[] P0AFC15_A295CliPob ;
   private String[] P0AFC15_A278CliNif ;
   private String[] P0AFC15_A13012CliImpReop ;
   private String[] P0AFC16_A396EmprCod ;
   private byte[] P0AFC16_A266CliEnvLin ;
   private int[] P0AFC16_A252CliCod ;
   private boolean[] P0AFC16_n252CliCod ;
   private String[] P0AFC16_A267CliEnvNom ;
   private String[] P0AFC16_A265CliEnvDom ;
   private String[] P0AFC16_A264CliEnvCp ;
   private String[] P0AFC16_A10775CliEnvCp2 ;
   private String[] P0AFC16_A268CliEnvPob ;
   private String[] P0AFC17_A396EmprCod ;
   private String[] P0AFC17_A10887Cod_Idtx ;
   private String[] P0AFC17_A10888Dsc_Idtx ;
   private boolean[] P0AFC17_n10888Dsc_Idtx ;
   private String[] P0AFC17_A12703Imp_Idtx ;
   private boolean[] P0AFC17_n12703Imp_Idtx ;
   private java.math.BigDecimal[] P0AFC18_A170BarKilLan ;
}

final  class pgrmoda_direct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFC2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFC3", "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbPdATCUD, T1.AlbDomEnv, T1.AlbProPri, T1.AlbFmd, T1.AlbLic, T2.EmprNom, T1.AlbMarca, T1.AlbProEnt, T1.AlbProEst, T1.AlbProEso, T1.AlbFecSal, T1.AlbHorSal, T1.AlbMat, T1.AlbProfch, T1.GuiRemCli FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod  FOR UPDATE OF T1.AlbProEst, T1.AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFC4", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFC5", "SELECT EmprCod, AlbProCod, DltObs, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AFC6", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P0AFC7", "SELECT EmprCod, DltP, DltR, DltHdr, AlbProCod, DltColNum, DltKgs, DltPzs, DltArtCod, DltKgsCli, DltArtDsc, DltTubo, DltTubos, DltTuboN FROM TXPDLT001 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFC8", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltMtsFs, DltPrMFs, DltPrMBFs, DltFasDsc, DltFascod, DltKgsFs, DltPrKBFs, DltLin FROM TXPDLT004 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFC10", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarDisNum, T1.BarNomCli, T1.BarColNom, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFC12", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.BarProPer, T2.BarColNum, T1.BarAlbKgmE, T1.BarAlbPie, T2.BarSit, T5.CliImpMerm, T5.CliFacMtsP, T1.BarAlbMtrE, T2.CliCod, T2.BarSer, T1.BarKgsCli, T2.BarSerDsc, T2.BarDisNum, T2.BarNomCli, T2.BarColNom, T1.TubCod, T1.BarAlbTub, T3.TubNom, T2.BarPriorid, COALESCE( T6.BarKgm, 0) AS BarKgm FROM (((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T2.CliCod) LEFT JOIN TXPTUBOS T3 ON T3.EmprCod = T1.EmprCod AND T3.TubCod = T1.TubCod) INNER JOIN TXPCALPRD T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFC13", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasMtr, T1.GuiFasPMt, T1.GuiFasPBM, T2.FasDsc, T1.FasCod, T1.FasKgm, T1.GuiFasPBK, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFC14", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T2.AlbRTara, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AFC15", "SELECT EmprCod, CliCod, CliNom, CliDom, CliCp, CliPob, CliNif, CliImpReop FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFC16", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvCp2, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFC17", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx, Imp_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AFC18", "SELECT SUM(BarKilLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((String[]) buf[12])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 8);
               ((String[]) buf[18])[0] = rslt.getString(15, 20);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 28);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((String[]) buf[20])[0] = rslt.getString(19, 13);
               ((String[]) buf[21])[0] = rslt.getString(20, 13);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((String[]) buf[25])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 28);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

