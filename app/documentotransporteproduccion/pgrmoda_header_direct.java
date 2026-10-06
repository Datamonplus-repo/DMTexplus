package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pgrmoda_header_direct extends GXReport
{
   public pgrmoda_header_direct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrmoda_header_direct.class ), "" );
   }

   public pgrmoda_header_direct( int remoteHandle ,
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
      pgrmoda_header_direct.this.aP5 = new int[] {0};
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
      pgrmoda_header_direct.this.A396EmprCod = aP0;
      pgrmoda_header_direct.this.A30AlbProCod = aP1;
      pgrmoda_header_direct.this.AV56ImpCod = aP2;
      pgrmoda_header_direct.this.AV76TextoCopia = aP3;
      pgrmoda_header_direct.this.Gx_page = aP4[0];
      this.aP4 = aP4;
      pgrmoda_header_direct.this.Gx_line = aP5[0];
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
      M_bot = 0 ;
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
         pgrmoda_header_direct.this.AV39ContDsc = GXv_char1[0] ;
         GXt_char2 = AV51Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pgrmoda_header_direct.this.A396EmprCod = GXv_char1[0] ;
         pgrmoda_header_direct.this.GXt_char2 = GXv_char4[0] ;
         AV51Firmad = GXt_char2 ;
         GXt_int5 = AV47existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pgrmoda_header_direct.this.GXt_int5 = GXv_int6[0] ;
         AV47existefirmad = GXt_int5 ;
         GXt_int5 = AV71PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pgrmoda_header_direct.this.GXt_int5 = GXv_int6[0] ;
         AV71PQrcode = GXt_int5 ;
         GXt_int5 = (byte)(AV52flax2) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FLAX2", ""), GXv_int6) ;
         pgrmoda_header_direct.this.GXt_int5 = GXv_int6[0] ;
         AV52flax2 = GXt_int5 ;
         /* Using cursor P0AGP2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0AGP2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AGP2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0AGP2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AGP2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0AGP2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AGP2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AGP2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AGP2_n8336EmpItm3[0] ;
            A395EmprCif = P0AGP2_A395EmprCif[0] ;
            n395EmprCif = P0AGP2_n395EmprCif[0] ;
            AV73Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV74Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV45EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P0AGP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14069AlbPdATCUD = P0AGP3_A14069AlbPdATCUD[0] ;
            A1243GuiRemCli = P0AGP3_A1243GuiRemCli[0] ;
            A1259AlbDomEnv = P0AGP3_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P0AGP3_n1259AlbDomEnv[0] ;
            A39AlbProPri = P0AGP3_A39AlbProPri[0] ;
            A10017AlbFmd = P0AGP3_A10017AlbFmd[0] ;
            n10017AlbFmd = P0AGP3_n10017AlbFmd[0] ;
            A7101AlbLic = P0AGP3_A7101AlbLic[0] ;
            A34AlbProfch = P0AGP3_A34AlbProfch[0] ;
            A407EmprNom = P0AGP3_A407EmprNom[0] ;
            n407EmprNom = P0AGP3_n407EmprNom[0] ;
            A5140AlbMarca = P0AGP3_A5140AlbMarca[0] ;
            A4023AlbFecSal = P0AGP3_A4023AlbFecSal[0] ;
            A3865AlbHorSal = P0AGP3_A3865AlbHorSal[0] ;
            A3868AlbMat = P0AGP3_A3868AlbMat[0] ;
            A1879AlbProEnt = P0AGP3_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P0AGP3_n1879AlbProEnt[0] ;
            A33AlbProEst = P0AGP3_A33AlbProEst[0] ;
            A1782AlbProEso = P0AGP3_A1782AlbProEso[0] ;
            A407EmprNom = P0AGP3_A407EmprNom[0] ;
            n407EmprNom = P0AGP3_n407EmprNom[0] ;
            AV38codValidacaoSerie = A14069AlbPdATCUD ;
            AV10atcud = ((GXutil.strcmp("", AV38codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV38codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))) ;
            AV23CliCod = A1243GuiRemCli ;
            AV31CliEnvDom = A1259AlbDomEnv ;
            AV72Prioridad = A39AlbProPri ;
            /* Execute user subroutine: 'CLIENTE' */
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
            pgrmoda_header_direct.this.GXt_char2 = GXv_char4[0] ;
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
               /* Using cursor P0AGP4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A916AlbPObs = P0AGP4_A916AlbPObs[0] ;
                  A915AlbPObsLin = P0AGP4_A915AlbPObsLin[0] ;
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
               /* Using cursor P0AGP5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A12184DltObs = P0AGP5_A12184DltObs[0] ;
                  n12184DltObs = P0AGP5_n12184DltObs[0] ;
                  A12185DltLinObs = P0AGP5_A12185DltLinObs[0] ;
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
            hAGP0( false, 422) ;
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
            AV40ContLine = (byte)(0) ;
            AV65Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            AV87Albprocod = A30AlbProCod ;
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            /* Using cursor P0AGP6 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Force skipping of lines */
         hAGP0( false, 0) ;
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
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
      /* Using cursor P0AGP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV23CliCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A252CliCod = P0AGP7_A252CliCod[0] ;
         A279CliNom = P0AGP7_A279CliNom[0] ;
         A260CliDom = P0AGP7_A260CliDom[0] ;
         A256CliCp = P0AGP7_A256CliCp[0] ;
         A295CliPob = P0AGP7_A295CliPob[0] ;
         A278CliNif = P0AGP7_A278CliNif[0] ;
         A13012CliImpReop = P0AGP7_A13012CliImpReop[0] ;
         AV35CliNom = A279CliNom ;
         AV25CliDom = A260CliDom ;
         AV24Clicp = A256CliCp ;
         AV36CliPob = A295CliPob ;
         AV34CliNif = A278CliNif ;
         AV33CliImpReop = A13012CliImpReop ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      /* Execute user subroutine: 'ENVIO' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      AV27CliEcp12 = " " ;
      AV29CliEDom = httpContext.getMessage( "V/ Instalaçoes", "") ;
      AV26CliEcp = " " ;
      AV32CliEPob = " " ;
      /* Using cursor P0AGP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV23CliCod), Byte.valueOf(AV31CliEnvDom)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A266CliEnvLin = P0AGP8_A266CliEnvLin[0] ;
         A252CliCod = P0AGP8_A252CliCod[0] ;
         A267CliEnvNom = P0AGP8_A267CliEnvNom[0] ;
         A265CliEnvDom = P0AGP8_A265CliEnvDom[0] ;
         A264CliEnvCp = P0AGP8_A264CliEnvCp[0] ;
         A10775CliEnvCp2 = P0AGP8_A10775CliEnvCp2[0] ;
         A268CliEnvPob = P0AGP8_A268CliEnvPob[0] ;
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
      pr_default.close(6);
   }

   public void hAGP0( boolean bFoot ,
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
      this.aP4[0] = pgrmoda_header_direct.this.Gx_page;
      this.aP5[0] = pgrmoda_header_direct.this.Gx_line;
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
      P0AGP2_A396EmprCod = new String[] {""} ;
      P0AGP2_A8335EmpItm2 = new String[] {""} ;
      P0AGP2_n8335EmpItm2 = new boolean[] {false} ;
      P0AGP2_A8334EmpItm1 = new String[] {""} ;
      P0AGP2_n8334EmpItm1 = new boolean[] {false} ;
      P0AGP2_A8337EmpItm4 = new String[] {""} ;
      P0AGP2_n8337EmpItm4 = new boolean[] {false} ;
      P0AGP2_A8336EmpItm3 = new String[] {""} ;
      P0AGP2_n8336EmpItm3 = new boolean[] {false} ;
      P0AGP2_A395EmprCif = new String[] {""} ;
      P0AGP2_n395EmprCif = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV73Texto_1 = "" ;
      AV74Texto_2 = "" ;
      AV45EmprCif = "" ;
      P0AGP3_A396EmprCod = new String[] {""} ;
      P0AGP3_A30AlbProCod = new long[1] ;
      P0AGP3_A14069AlbPdATCUD = new String[] {""} ;
      P0AGP3_A1243GuiRemCli = new int[1] ;
      P0AGP3_A1259AlbDomEnv = new byte[1] ;
      P0AGP3_n1259AlbDomEnv = new boolean[] {false} ;
      P0AGP3_A39AlbProPri = new String[] {""} ;
      P0AGP3_A10017AlbFmd = new String[] {""} ;
      P0AGP3_n10017AlbFmd = new boolean[] {false} ;
      P0AGP3_A7101AlbLic = new String[] {""} ;
      P0AGP3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGP3_A407EmprNom = new String[] {""} ;
      P0AGP3_n407EmprNom = new boolean[] {false} ;
      P0AGP3_A5140AlbMarca = new String[] {""} ;
      P0AGP3_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGP3_A3865AlbHorSal = new String[] {""} ;
      P0AGP3_A3868AlbMat = new String[] {""} ;
      P0AGP3_A1879AlbProEnt = new String[] {""} ;
      P0AGP3_n1879AlbProEnt = new boolean[] {false} ;
      P0AGP3_A33AlbProEst = new byte[1] ;
      P0AGP3_A1782AlbProEso = new byte[1] ;
      A14069AlbPdATCUD = "" ;
      A39AlbProPri = "" ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A407EmprNom = "" ;
      A5140AlbMarca = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      A1879AlbProEnt = "" ;
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
      P0AGP4_A396EmprCod = new String[] {""} ;
      P0AGP4_A30AlbProCod = new long[1] ;
      P0AGP4_A916AlbPObs = new String[] {""} ;
      P0AGP4_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      P0AGP5_A396EmprCod = new String[] {""} ;
      P0AGP5_A30AlbProCod = new long[1] ;
      P0AGP5_A12184DltObs = new String[] {""} ;
      P0AGP5_n12184DltObs = new boolean[] {false} ;
      P0AGP5_A12185DltLinObs = new byte[1] ;
      A12184DltObs = "" ;
      AV80TxtAnulado = "" ;
      AV35CliNom = "" ;
      AV25CliDom = "" ;
      AV36CliPob = "" ;
      AV27CliEcp12 = "" ;
      AV32CliEPob = "" ;
      AV29CliEDom = "" ;
      AV55Imagen = "" ;
      sImgUrl = "" ;
      AV65Matricula = "" ;
      AV24Clicp = "" ;
      AV30CliENom = "" ;
      AV26CliEcp = "" ;
      AV33CliImpReop = "" ;
      P0AGP7_A396EmprCod = new String[] {""} ;
      P0AGP7_A252CliCod = new int[1] ;
      P0AGP7_A279CliNom = new String[] {""} ;
      P0AGP7_A260CliDom = new String[] {""} ;
      P0AGP7_A256CliCp = new String[] {""} ;
      P0AGP7_A295CliPob = new String[] {""} ;
      P0AGP7_A278CliNif = new String[] {""} ;
      P0AGP7_A13012CliImpReop = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A13012CliImpReop = "" ;
      P0AGP8_A396EmprCod = new String[] {""} ;
      P0AGP8_A266CliEnvLin = new byte[1] ;
      P0AGP8_A252CliCod = new int[1] ;
      P0AGP8_A267CliEnvNom = new String[] {""} ;
      P0AGP8_A265CliEnvDom = new String[] {""} ;
      P0AGP8_A264CliEnvCp = new String[] {""} ;
      P0AGP8_A10775CliEnvCp2 = new String[] {""} ;
      P0AGP8_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A268CliEnvPob = "" ;
      AV28CliEcp2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.pgrmoda_header_direct__default(),
         new Object[] {
             new Object[] {
            P0AGP2_A396EmprCod, P0AGP2_A8335EmpItm2, P0AGP2_n8335EmpItm2, P0AGP2_A8334EmpItm1, P0AGP2_n8334EmpItm1, P0AGP2_A8337EmpItm4, P0AGP2_n8337EmpItm4, P0AGP2_A8336EmpItm3, P0AGP2_n8336EmpItm3, P0AGP2_A395EmprCif,
            P0AGP2_n395EmprCif
            }
            , new Object[] {
            P0AGP3_A396EmprCod, P0AGP3_A30AlbProCod, P0AGP3_A14069AlbPdATCUD, P0AGP3_A1243GuiRemCli, P0AGP3_A1259AlbDomEnv, P0AGP3_n1259AlbDomEnv, P0AGP3_A39AlbProPri, P0AGP3_A10017AlbFmd, P0AGP3_n10017AlbFmd, P0AGP3_A7101AlbLic,
            P0AGP3_A34AlbProfch, P0AGP3_A407EmprNom, P0AGP3_n407EmprNom, P0AGP3_A5140AlbMarca, P0AGP3_A4023AlbFecSal, P0AGP3_A3865AlbHorSal, P0AGP3_A3868AlbMat, P0AGP3_A1879AlbProEnt, P0AGP3_n1879AlbProEnt, P0AGP3_A33AlbProEst,
            P0AGP3_A1782AlbProEso
            }
            , new Object[] {
            P0AGP4_A396EmprCod, P0AGP4_A30AlbProCod, P0AGP4_A916AlbPObs, P0AGP4_A915AlbPObsLin
            }
            , new Object[] {
            P0AGP5_A396EmprCod, P0AGP5_A30AlbProCod, P0AGP5_A12184DltObs, P0AGP5_n12184DltObs, P0AGP5_A12185DltLinObs
            }
            , new Object[] {
            }
            , new Object[] {
            P0AGP7_A396EmprCod, P0AGP7_A252CliCod, P0AGP7_A279CliNom, P0AGP7_A260CliDom, P0AGP7_A256CliCp, P0AGP7_A295CliPob, P0AGP7_A278CliNif, P0AGP7_A13012CliImpReop
            }
            , new Object[] {
            P0AGP8_A396EmprCod, P0AGP8_A266CliEnvLin, P0AGP8_A252CliCod, P0AGP8_A267CliEnvNom, P0AGP8_A265CliEnvDom, P0AGP8_A264CliEnvCp, P0AGP8_A10775CliEnvCp2, P0AGP8_A268CliEnvPob
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
   private byte A266CliEnvLin ;
   private short AV52flax2 ;
   private short AV9anyo ;
   private short AV43Dpi ;
   private short AV70Pixel ;
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
   private int Gx_OldLine ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private long AV87Albprocod ;
   private java.math.BigDecimal AV22Centimetos ;
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
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String A1879AlbProEnt ;
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
   private String AV35CliNom ;
   private String AV25CliDom ;
   private String AV36CliPob ;
   private String AV27CliEcp12 ;
   private String AV32CliEPob ;
   private String AV29CliEDom ;
   private String sImgUrl ;
   private String AV65Matricula ;
   private String AV24Clicp ;
   private String AV30CliENom ;
   private String AV26CliEcp ;
   private String AV33CliImpReop ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A13012CliImpReop ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A10775CliEnvCp2 ;
   private String A268CliEnvPob ;
   private String AV28CliEcp2 ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean n1259AlbDomEnv ;
   private boolean n10017AlbFmd ;
   private boolean n407EmprNom ;
   private boolean n1879AlbProEnt ;
   private boolean returnInSub ;
   private boolean n12184DltObs ;
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
   private String[] P0AGP2_A396EmprCod ;
   private String[] P0AGP2_A8335EmpItm2 ;
   private boolean[] P0AGP2_n8335EmpItm2 ;
   private String[] P0AGP2_A8334EmpItm1 ;
   private boolean[] P0AGP2_n8334EmpItm1 ;
   private String[] P0AGP2_A8337EmpItm4 ;
   private boolean[] P0AGP2_n8337EmpItm4 ;
   private String[] P0AGP2_A8336EmpItm3 ;
   private boolean[] P0AGP2_n8336EmpItm3 ;
   private String[] P0AGP2_A395EmprCif ;
   private boolean[] P0AGP2_n395EmprCif ;
   private String[] P0AGP3_A396EmprCod ;
   private long[] P0AGP3_A30AlbProCod ;
   private String[] P0AGP3_A14069AlbPdATCUD ;
   private int[] P0AGP3_A1243GuiRemCli ;
   private byte[] P0AGP3_A1259AlbDomEnv ;
   private boolean[] P0AGP3_n1259AlbDomEnv ;
   private String[] P0AGP3_A39AlbProPri ;
   private String[] P0AGP3_A10017AlbFmd ;
   private boolean[] P0AGP3_n10017AlbFmd ;
   private String[] P0AGP3_A7101AlbLic ;
   private java.util.Date[] P0AGP3_A34AlbProfch ;
   private String[] P0AGP3_A407EmprNom ;
   private boolean[] P0AGP3_n407EmprNom ;
   private String[] P0AGP3_A5140AlbMarca ;
   private java.util.Date[] P0AGP3_A4023AlbFecSal ;
   private String[] P0AGP3_A3865AlbHorSal ;
   private String[] P0AGP3_A3868AlbMat ;
   private String[] P0AGP3_A1879AlbProEnt ;
   private boolean[] P0AGP3_n1879AlbProEnt ;
   private byte[] P0AGP3_A33AlbProEst ;
   private byte[] P0AGP3_A1782AlbProEso ;
   private String[] P0AGP4_A396EmprCod ;
   private long[] P0AGP4_A30AlbProCod ;
   private String[] P0AGP4_A916AlbPObs ;
   private byte[] P0AGP4_A915AlbPObsLin ;
   private String[] P0AGP5_A396EmprCod ;
   private long[] P0AGP5_A30AlbProCod ;
   private String[] P0AGP5_A12184DltObs ;
   private boolean[] P0AGP5_n12184DltObs ;
   private byte[] P0AGP5_A12185DltLinObs ;
   private String[] P0AGP7_A396EmprCod ;
   private int[] P0AGP7_A252CliCod ;
   private String[] P0AGP7_A279CliNom ;
   private String[] P0AGP7_A260CliDom ;
   private String[] P0AGP7_A256CliCp ;
   private String[] P0AGP7_A295CliPob ;
   private String[] P0AGP7_A278CliNif ;
   private String[] P0AGP7_A13012CliImpReop ;
   private String[] P0AGP8_A396EmprCod ;
   private byte[] P0AGP8_A266CliEnvLin ;
   private int[] P0AGP8_A252CliCod ;
   private String[] P0AGP8_A267CliEnvNom ;
   private String[] P0AGP8_A265CliEnvDom ;
   private String[] P0AGP8_A264CliEnvCp ;
   private String[] P0AGP8_A10775CliEnvCp2 ;
   private String[] P0AGP8_A268CliEnvPob ;
}

final  class pgrmoda_header_direct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGP2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGP3", "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbPdATCUD, T1.GuiRemCli, T1.AlbDomEnv, T1.AlbProPri, T1.AlbFmd, T1.AlbLic, T1.AlbProfch, T2.EmprNom, T1.AlbMarca, T1.AlbFecSal, T1.AlbHorSal, T1.AlbMat, T1.AlbProEnt, T1.AlbProEst, T1.AlbProEso FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod  FOR UPDATE OF T1.AlbProEst, T1.AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGP4", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGP5", "SELECT EmprCod, AlbProCod, DltObs, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AGP6", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P0AGP7", "SELECT EmprCod, CliCod, CliNom, CliDom, CliCp, CliPob, CliNif, CliImpReop FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGP8", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvCp2, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((String[]) buf[16])[0] = rslt.getString(14, 20);
               ((String[]) buf[17])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

