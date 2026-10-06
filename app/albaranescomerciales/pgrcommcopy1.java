package app.albaranescomerciales ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pgrcommcopy1 extends GXReport
{
   public pgrcommcopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrcommcopy1.class ), "" );
   }

   public pgrcommcopy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      pgrcommcopy1.this.AV61ReportInPut = aP0;
      pgrcommcopy1.this.A396EmprCod = aP1;
      pgrcommcopy1.this.A14AlbComCod = aP2;
      pgrcommcopy1.this.AV46ImpCod = aP3;
      pgrcommcopy1.this.AV63Tex_Copia = aP4;
      pgrcommcopy1.this.Gx_out = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 12 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV61ReportInPut) ;
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
         P_lines = (int)(gxYPage-(lineHeight*12)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV29ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRCOMM", ""), GXv_char1) ;
         pgrcommcopy1.this.AV29ContDsc = GXv_char1[0] ;
         GXt_char2 = AV41Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pgrcommcopy1.this.A396EmprCod = GXv_char1[0] ;
         pgrcommcopy1.this.GXt_char2 = GXv_char4[0] ;
         AV41Firmad = GXt_char2 ;
         GXt_int5 = AV59PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pgrcommcopy1.this.GXt_int5 = GXv_int6[0] ;
         AV59PQrcode = GXt_int5 ;
         /* Using cursor P0AKC2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0AKC2_A407EmprNom[0] ;
            n407EmprNom = P0AKC2_n407EmprNom[0] ;
            A8335EmpItm2 = P0AKC2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AKC2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0AKC2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AKC2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0AKC2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AKC2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AKC2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AKC2_n8336EmpItm3[0] ;
            A395EmprCif = P0AKC2_A395EmprCif[0] ;
            n395EmprCif = P0AKC2_n395EmprCif[0] ;
            AV8EmprNom = A407EmprNom ;
            AV65Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV66Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV38EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P0AKC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A10738AlbComSt = P0AKC3_A10738AlbComSt[0] ;
            A14248AlbComATCU = P0AKC3_A14248AlbComATCU[0] ;
            A252CliCod = P0AKC3_A252CliCod[0] ;
            A22AlbComPri = P0AKC3_A22AlbComPri[0] ;
            A5142AlcDomEnv = P0AKC3_A5142AlcDomEnv[0] ;
            A4828CliCp2 = P0AKC3_A4828CliCp2[0] ;
            A256CliCp = P0AKC3_A256CliCp[0] ;
            A295CliPob = P0AKC3_A295CliPob[0] ;
            A17AlbComFch = P0AKC3_A17AlbComFch[0] ;
            A14249AlbComSerA = P0AKC3_A14249AlbComSerA[0] ;
            A14250AlbComTipA = P0AKC3_A14250AlbComTipA[0] ;
            A4829AlbComHor = P0AKC3_A4829AlbComHor[0] ;
            A10014AlbComFd = P0AKC3_A10014AlbComFd[0] ;
            A10740AlbComID = P0AKC3_A10740AlbComID[0] ;
            A278CliNif = P0AKC3_A278CliNif[0] ;
            A10739AlbComEAT = P0AKC3_A10739AlbComEAT[0] ;
            A4830AlbComMat = P0AKC3_A4830AlbComMat[0] ;
            A260CliDom = P0AKC3_A260CliDom[0] ;
            A279CliNom = P0AKC3_A279CliNom[0] ;
            A16AlbComEst = P0AKC3_A16AlbComEst[0] ;
            A1783AlbComEso = P0AKC3_A1783AlbComEso[0] ;
            A4828CliCp2 = P0AKC3_A4828CliCp2[0] ;
            A256CliCp = P0AKC3_A256CliCp[0] ;
            A295CliPob = P0AKC3_A295CliPob[0] ;
            A278CliNif = P0AKC3_A278CliNif[0] ;
            A260CliDom = P0AKC3_A260CliDom[0] ;
            A279CliNom = P0AKC3_A279CliNom[0] ;
            AV68TextoAnulado = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? httpContext.getMessage( "ANULADO", "") : " ") ;
            AV27codValidacaoSerie = A14248AlbComATCU ;
            AV12atcud = ((GXutil.strcmp("", AV27codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV27codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A14AlbComCod, 8, 0))) ;
            AV16CliCod = A252CliCod ;
            AV60Prioridad = A22AlbComPri ;
            AV23CliEnvDom = A5142AlcDomEnv ;
            AV79codigopostal = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            /* Execute user subroutine: 'ENVIO' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'PAGO' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV77vPob = GXutil.ltrim( A256CliCp) + " " + A295CliPob ;
            AV35DocNom = httpContext.getMessage( "Guia de Remessa Nº", "") ;
            if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
            {
               AV35DocNom = httpContext.getMessage( "Guia de Transporte Nº", "") ;
            }
            AV39FechaAlb = GXutil.str( GXutil.day( A17AlbComFch), 2, 0) + " " + localUtil.cmonth( A17AlbComFch, httpContext.getMessage( "por", "")) + " " + GXutil.str( GXutil.year( A17AlbComFch), 4, 0) ;
            AV36documento = GXutil.trim( A14250AlbComTipA) + " " + GXutil.trim( A14249AlbComSerA) + "/" + GXutil.trim( GXutil.str( A14AlbComCod, 8, 0)) ;
            AV33DiaHora = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV31DiaCarga = localUtil.ctod( GXutil.substring( AV33DiaHora, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV44HoraCarga = GXutil.substring( AV33DiaHora, 12, 8) ;
            AV67Texto_fd = " " ;
            if ( GXutil.strcmp(A10014AlbComFd, " ") != 0 )
            {
               AV40Firma4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
               AV67Texto_fd = AV40Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV41Firmad) ;
            }
            else
            {
               AV67Texto_fd = httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            AV13AtId = " " ;
            if ( GXutil.strcmp(A10740AlbComID, " ") != 0 )
            {
               AV13AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A10740AlbComID, 1, 12)) ;
            }
            AV40Firma4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
            AV70TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV38EmprCif) + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A278CliNif) + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "D:", "") + GXutil.trim( A14250AlbComTipA) + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV11anyo = (short)(GXutil.year( A17AlbComFch)) ;
            AV51mes = (byte)(GXutil.month( A17AlbComFch)) ;
            AV30dia = (byte)(GXutil.day( A17AlbComFch)) ;
            AV70TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV11anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV51mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV30dia, 2, 0)), (short)(2), "0") + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "G:", "") + GXutil.trim( A14250AlbComTipA) + " " + GXutil.trim( A14249AlbComSerA) + "/" + GXutil.trim( GXutil.str( A14AlbComCod, 8, 0)) + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "H:", "") + GXutil.trim( A14248AlbComATCU) + "-" + GXutil.trim( GXutil.str( A14AlbComCod, 8, 0)) + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "Q:", "") + AV40Firma4dig + "*" ;
            AV70TextoGenerar += httpContext.getMessage( "R:", "") + "1208" ;
            AV37Dpi = (short)(300) ;
            AV14Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV58Pixel = (short)(DecimalUtil.decToDouble(AV14Centimetos.multiply(DecimalUtil.doubleToDec(AV37Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV72Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV70TextoGenerar, AV58Pixel, AV58Pixel, GXv_char4) ;
            pgrcommcopy1.this.GXt_char2 = GXv_char4[0] ;
            AV72Url = GXt_char2 ;
            AV45Imagen = AV72Url ;
            AV86Imagen_GXI = GXDbFile.pathToUrl( AV72Url, context.getHttpContext()) ;
            AV11anyo = (short)(GXutil.year( A17AlbComFch)) ;
            AV51mes = (byte)(GXutil.month( A17AlbComFch)) ;
            AV30dia = (byte)(GXutil.day( A17AlbComFch)) ;
            AV32DiaGuia = GXutil.str( AV11anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV51mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV30dia, 2, 0)), (short)(2), "0") ;
            AV33DiaHora = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV31DiaCarga = localUtil.ctod( GXutil.substring( AV33DiaHora, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV11anyo = (short)(GXutil.year( AV31DiaCarga)) ;
            AV51mes = (byte)(GXutil.month( AV31DiaCarga)) ;
            AV30dia = (byte)(GXutil.day( AV31DiaCarga)) ;
            AV34Diasalida = GXutil.str( AV11anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV51mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV30dia, 2, 0)), (short)(2), "0") ;
            AV44HoraCarga = GXutil.substring( AV33DiaHora, 12, 8) ;
            /* Execute user subroutine: 'CARGA_OBS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV62RutaImagenMarcaAgua = "" ;
            AV78textoNOAT = "" ;
            if ( (GXutil.strcmp("", A10740AlbComID)==0) )
            {
               AV78textoNOAT = httpContext.getMessage( "Este documento não serve de documento de transporte", "") ;
            }
            if ( A10739AlbComEAT == 0 )
            {
               AV49MarcaAguaImagen = context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )) ;
               AV87Marcaaguaimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               hAKC0( false, 1078) ;
               sImgUrl = ((GXutil.strcmp("", AV49MarcaAguaImagen)==0) ? AV87Marcaaguaimagen_GXI : AV49MarcaAguaImagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 14, Gx_line+1, 815, Gx_line+1052) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1078) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
            }
            else
            {
               hAKC0( false, 1052) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1052) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
            }
            hAKC0( false, 440) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 386, Gx_line+214, 758, Gx_line+231, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 386, Gx_line+234, 758, Gx_line+251, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 458, Gx_line+267, 758, Gx_line+284, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(28, Gx_line+307, 768, Gx_line+396, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 42, Gx_line+317, 103, Gx_line+331, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 42, Gx_line+334, 134, Gx_line+348, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 42, Gx_line+352, 143, Gx_line+366, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 40, Gx_line+372, 110, Gx_line+386, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Contibuinte:", ""), 456, Gx_line+316, 542, Gx_line+330, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 442, Gx_line+372, 497, Gx_line+386, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 142, Gx_line+317, 187, Gx_line+332, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32DiaGuia, "")), 142, Gx_line+354, 247, Gx_line+369, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 142, Gx_line+334, 225, Gx_line+348, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 547, Gx_line+316, 652, Gx_line+331, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(28, Gx_line+402, 768, Gx_line+435, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 195, Gx_line+411, 256, Gx_line+426, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 661, Gx_line+411, 730, Gx_line+426, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Tex_Copia, "")), 716, Gx_line+179, 769, Gx_line+193, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4830AlbComMat, "")), 501, Gx_line+372, 606, Gx_line+387, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Diasalida, "")), 142, Gx_line+372, 247, Gx_line+387, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(373, Gx_line+199, 768, Gx_line+302, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 25, Gx_line+8, 782, Gx_line+94) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora Carga:", ""), 258, Gx_line+372, 329, Gx_line+386, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44HoraCarga, "")), 330, Gx_line+372, 423, Gx_line+387, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 430, Gx_line+334, 542, Gx_line+348, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21CliEDom, "")), 547, Gx_line+334, 764, Gx_line+349, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19CliEcp12, "")), 547, Gx_line+352, 600, Gx_line+367, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24CliEPob, "")), 607, Gx_line+352, 764, Gx_line+367, 0, 0, 0, 0) ;
            sImgUrl = ((GXutil.strcmp("", AV45Imagen)==0) ? AV86Imagen_GXI : AV45Imagen) ;
            getPrinter().GxDrawBitMap(sImgUrl, 168, Gx_line+162, 301, Gx_line+300) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12atcud, "")), 147, Gx_line+145, 304, Gx_line+160, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36documento, "")), 607, Gx_line+152, 775, Gx_line+173, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35DocNom, "")), 407, Gx_line+152, 583, Gx_line+173, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 724, Gx_line+372, 781, Gx_line+385, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 674, Gx_line+372, 713, Gx_line+386, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 714, Gx_line+373, 720, Gx_line+384, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina:", ""), 623, Gx_line+372, 668, Gx_line+385, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 22, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TextoAnulado, "")), 242, Gx_line+98, 535, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79codigopostal, "")), 386, Gx_line+267, 450, Gx_line+285, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+440) ;
            /* Using cursor P0AKC4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4717AlbComUni = P0AKC4_A4717AlbComUni[0] ;
               A5144AlbUcoDsc = P0AKC4_A5144AlbUcoDsc[0] ;
               n5144AlbUcoDsc = P0AKC4_n5144AlbUcoDsc[0] ;
               A13AlbComCnt = P0AKC4_A13AlbComCnt[0] ;
               A10806AlbComDc2 = P0AKC4_A10806AlbComDc2[0] ;
               A15AlbComDsc = P0AKC4_A15AlbComDsc[0] ;
               A20AlbComLin = P0AKC4_A20AlbComLin[0] ;
               A5144AlbUcoDsc = P0AKC4_A5144AlbUcoDsc[0] ;
               n5144AlbUcoDsc = P0AKC4_n5144AlbUcoDsc[0] ;
               AV10AlbUcodsc = A5144AlbUcoDsc ;
               AV9AlbComcnt = A13AlbComCnt ;
               AV64Text_l = A15AlbComDsc + GXutil.substring( A10806AlbComDc2, 1, 40) ;
               hAKC0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9AlbComcnt, "ZZZZZZ.ZZ")), 672, Gx_line+0, 739, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10AlbUcodsc, "")), 746, Gx_line+1, 765, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Text_l, "")), 59, Gx_line+0, 643, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( A16AlbComEst == 0 )
            {
               A16AlbComEst = (byte)(1) ;
               A1783AlbComEso = (byte)(1) ;
            }
            /* Using cursor P0AKC5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A16AlbComEst), Byte.valueOf(A1783AlbComEso), A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV80WEBSession.setValue(httpContext.getMessage( "PGRCOMMCopy1_Clicod", ""), localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9"));
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAKC0( true, 0) ;
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
      /* 'CARGA_OBS' Routine */
      returnInSub = false ;
      AV47j = (byte)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV76vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P0AKC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A2384AlbCObs = P0AKC6_A2384AlbCObs[0] ;
         n2384AlbCObs = P0AKC6_n2384AlbCObs[0] ;
         A2386AlbCObsLin = P0AKC6_A2386AlbCObsLin[0] ;
         if ( AV47j <= 6 )
         {
            AV76vObs[AV47j-1] = A2384AlbCObs ;
         }
         else
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV47j = (byte)(AV47j+1) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PAGO' Routine */
      returnInSub = false ;
      /* Using cursor P0AKC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV60Prioridad});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A497FpgCod = P0AKC7_A497FpgCod[0] ;
         A297CliPri = P0AKC7_A297CliPri[0] ;
         A252CliCod = P0AKC7_A252CliCod[0] ;
         A498FpgDsc = P0AKC7_A498FpgDsc[0] ;
         n498FpgDsc = P0AKC7_n498FpgDsc[0] ;
         A498FpgDsc = P0AKC7_A498FpgDsc[0] ;
         n498FpgDsc = P0AKC7_n498FpgDsc[0] ;
         AV42FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      AV19CliEcp12 = " " ;
      AV21CliEDom = httpContext.getMessage( "V/ Instalaçoes", "") ;
      AV18CliEcp = " " ;
      AV24CliEPob = " " ;
      /* Using cursor P0AKC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV23CliEnvDom)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A266CliEnvLin = P0AKC8_A266CliEnvLin[0] ;
         A252CliCod = P0AKC8_A252CliCod[0] ;
         A267CliEnvNom = P0AKC8_A267CliEnvNom[0] ;
         A265CliEnvDom = P0AKC8_A265CliEnvDom[0] ;
         A264CliEnvCp = P0AKC8_A264CliEnvCp[0] ;
         A10775CliEnvCp2 = P0AKC8_A10775CliEnvCp2[0] ;
         A268CliEnvPob = P0AKC8_A268CliEnvPob[0] ;
         AV22CliENom = A267CliEnvNom ;
         AV21CliEDom = A265CliEnvDom ;
         AV18CliEcp = A264CliEnvCp ;
         AV20CliEcp2 = GXutil.trim( A10775CliEnvCp2) ;
         AV24CliEPob = A268CliEnvPob ;
         AV19CliEcp12 = GXutil.trim( A264CliEnvCp) ;
         AV19CliEcp12 += ((GXutil.strcmp(A10775CliEnvCp2, " ")!=0) ? "-"+GXutil.trim( AV20CliEcp2) : "") ;
         AV79codigopostal = AV19CliEcp12 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void hAKC0( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçôes:", ""), 54, Gx_line+16, 137, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76vObs[1-1], "")), 147, Gx_line+16, 513, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76vObs[2-1], "")), 147, Gx_line+31, 513, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76vObs[3-1], "")), 147, Gx_line+47, 513, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76vObs[4-1], "")), 147, Gx_line+63, 513, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76vObs[5-1], "")), 147, Gx_line+78, 513, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(28, Gx_line+116, 768, Gx_line+116, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29ContDsc, "")), 708, Gx_line+101, 772, Gx_line+114, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Texto_1, "")), 64, Gx_line+134, 732, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Texto_2, "")), 85, Gx_line+153, 711, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Este documento não serve de fatura", ""), 312, Gx_line+122, 490, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Texto_fd, "")), 28, Gx_line+101, 300, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13AtId, "")), 298, Gx_line+101, 429, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78textoNOAT, "")), 433, Gx_line+101, 710, Gx_line+114, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+170) ;
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
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "albaranescomerciales.pgrcommcopy1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29ContDsc = "" ;
      AV41Firmad = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P0AKC2_A396EmprCod = new String[] {""} ;
      P0AKC2_A407EmprNom = new String[] {""} ;
      P0AKC2_n407EmprNom = new boolean[] {false} ;
      P0AKC2_A8335EmpItm2 = new String[] {""} ;
      P0AKC2_n8335EmpItm2 = new boolean[] {false} ;
      P0AKC2_A8334EmpItm1 = new String[] {""} ;
      P0AKC2_n8334EmpItm1 = new boolean[] {false} ;
      P0AKC2_A8337EmpItm4 = new String[] {""} ;
      P0AKC2_n8337EmpItm4 = new boolean[] {false} ;
      P0AKC2_A8336EmpItm3 = new String[] {""} ;
      P0AKC2_n8336EmpItm3 = new boolean[] {false} ;
      P0AKC2_A395EmprCif = new String[] {""} ;
      P0AKC2_n395EmprCif = new boolean[] {false} ;
      A407EmprNom = "" ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV8EmprNom = "" ;
      AV65Texto_1 = "" ;
      AV66Texto_2 = "" ;
      AV38EmprCif = "" ;
      P0AKC3_A396EmprCod = new String[] {""} ;
      P0AKC3_A14AlbComCod = new int[1] ;
      P0AKC3_A10738AlbComSt = new String[] {""} ;
      P0AKC3_A14248AlbComATCU = new String[] {""} ;
      P0AKC3_A252CliCod = new int[1] ;
      P0AKC3_A22AlbComPri = new String[] {""} ;
      P0AKC3_A5142AlcDomEnv = new byte[1] ;
      P0AKC3_A4828CliCp2 = new String[] {""} ;
      P0AKC3_A256CliCp = new String[] {""} ;
      P0AKC3_A295CliPob = new String[] {""} ;
      P0AKC3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AKC3_A14249AlbComSerA = new String[] {""} ;
      P0AKC3_A14250AlbComTipA = new String[] {""} ;
      P0AKC3_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0AKC3_A10014AlbComFd = new String[] {""} ;
      P0AKC3_A10740AlbComID = new String[] {""} ;
      P0AKC3_A278CliNif = new String[] {""} ;
      P0AKC3_A10739AlbComEAT = new byte[1] ;
      P0AKC3_A4830AlbComMat = new String[] {""} ;
      P0AKC3_A260CliDom = new String[] {""} ;
      P0AKC3_A279CliNom = new String[] {""} ;
      P0AKC3_A16AlbComEst = new byte[1] ;
      P0AKC3_A1783AlbComEso = new byte[1] ;
      A10738AlbComSt = "" ;
      A14248AlbComATCU = "" ;
      A22AlbComPri = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A14249AlbComSerA = "" ;
      A14250AlbComTipA = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10014AlbComFd = "" ;
      A10740AlbComID = "" ;
      A278CliNif = "" ;
      A4830AlbComMat = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      AV68TextoAnulado = "" ;
      AV27codValidacaoSerie = "" ;
      AV12atcud = "" ;
      AV60Prioridad = "" ;
      AV79codigopostal = "" ;
      AV77vPob = "" ;
      AV35DocNom = "" ;
      AV39FechaAlb = "" ;
      AV36documento = "" ;
      AV33DiaHora = "" ;
      AV31DiaCarga = GXutil.nullDate() ;
      AV44HoraCarga = "" ;
      AV67Texto_fd = "" ;
      AV40Firma4dig = "" ;
      AV13AtId = "" ;
      AV70TextoGenerar = "" ;
      AV14Centimetos = DecimalUtil.ZERO ;
      AV72Url = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV45Imagen = "" ;
      AV86Imagen_GXI = "" ;
      AV32DiaGuia = "" ;
      AV34Diasalida = "" ;
      AV62RutaImagenMarcaAgua = "" ;
      AV78textoNOAT = "" ;
      AV49MarcaAguaImagen = "" ;
      AV87Marcaaguaimagen_GXI = "" ;
      AV49MarcaAguaImagen = "" ;
      sImgUrl = "" ;
      AV21CliEDom = "" ;
      AV19CliEcp12 = "" ;
      AV24CliEPob = "" ;
      AV45Imagen = "" ;
      P0AKC4_A4717AlbComUni = new byte[1] ;
      P0AKC4_A396EmprCod = new String[] {""} ;
      P0AKC4_A14AlbComCod = new int[1] ;
      P0AKC4_A5144AlbUcoDsc = new String[] {""} ;
      P0AKC4_n5144AlbUcoDsc = new boolean[] {false} ;
      P0AKC4_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKC4_A10806AlbComDc2 = new String[] {""} ;
      P0AKC4_A15AlbComDsc = new String[] {""} ;
      P0AKC4_A20AlbComLin = new short[1] ;
      A5144AlbUcoDsc = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A10806AlbComDc2 = "" ;
      A15AlbComDsc = "" ;
      AV10AlbUcodsc = "" ;
      AV9AlbComcnt = DecimalUtil.ZERO ;
      AV64Text_l = "" ;
      AV80WEBSession = httpContext.getWebSession();
      AV76vObs = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV76vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AKC6_A396EmprCod = new String[] {""} ;
      P0AKC6_A14AlbComCod = new int[1] ;
      P0AKC6_A2384AlbCObs = new String[] {""} ;
      P0AKC6_n2384AlbCObs = new boolean[] {false} ;
      P0AKC6_A2386AlbCObsLin = new byte[1] ;
      A2384AlbCObs = "" ;
      P0AKC7_A497FpgCod = new String[] {""} ;
      P0AKC7_A396EmprCod = new String[] {""} ;
      P0AKC7_A297CliPri = new String[] {""} ;
      P0AKC7_A252CliCod = new int[1] ;
      P0AKC7_A498FpgDsc = new String[] {""} ;
      P0AKC7_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A297CliPri = "" ;
      A498FpgDsc = "" ;
      AV42FpgDsc = "" ;
      AV18CliEcp = "" ;
      P0AKC8_A396EmprCod = new String[] {""} ;
      P0AKC8_A266CliEnvLin = new byte[1] ;
      P0AKC8_A252CliCod = new int[1] ;
      P0AKC8_A267CliEnvNom = new String[] {""} ;
      P0AKC8_A265CliEnvDom = new String[] {""} ;
      P0AKC8_A264CliEnvCp = new String[] {""} ;
      P0AKC8_A10775CliEnvCp2 = new String[] {""} ;
      P0AKC8_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A268CliEnvPob = "" ;
      AV22CliENom = "" ;
      AV20CliEcp2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranescomerciales.pgrcommcopy1__default(),
         new Object[] {
             new Object[] {
            P0AKC2_A396EmprCod, P0AKC2_A407EmprNom, P0AKC2_n407EmprNom, P0AKC2_A8335EmpItm2, P0AKC2_n8335EmpItm2, P0AKC2_A8334EmpItm1, P0AKC2_n8334EmpItm1, P0AKC2_A8337EmpItm4, P0AKC2_n8337EmpItm4, P0AKC2_A8336EmpItm3,
            P0AKC2_n8336EmpItm3, P0AKC2_A395EmprCif, P0AKC2_n395EmprCif
            }
            , new Object[] {
            P0AKC3_A396EmprCod, P0AKC3_A14AlbComCod, P0AKC3_A10738AlbComSt, P0AKC3_A14248AlbComATCU, P0AKC3_A252CliCod, P0AKC3_A22AlbComPri, P0AKC3_A5142AlcDomEnv, P0AKC3_A4828CliCp2, P0AKC3_A256CliCp, P0AKC3_A295CliPob,
            P0AKC3_A17AlbComFch, P0AKC3_A14249AlbComSerA, P0AKC3_A14250AlbComTipA, P0AKC3_A4829AlbComHor, P0AKC3_A10014AlbComFd, P0AKC3_A10740AlbComID, P0AKC3_A278CliNif, P0AKC3_A10739AlbComEAT, P0AKC3_A4830AlbComMat, P0AKC3_A260CliDom,
            P0AKC3_A279CliNom, P0AKC3_A16AlbComEst, P0AKC3_A1783AlbComEso
            }
            , new Object[] {
            P0AKC4_A4717AlbComUni, P0AKC4_A396EmprCod, P0AKC4_A14AlbComCod, P0AKC4_A5144AlbUcoDsc, P0AKC4_n5144AlbUcoDsc, P0AKC4_A13AlbComCnt, P0AKC4_A10806AlbComDc2, P0AKC4_A15AlbComDsc, P0AKC4_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            P0AKC6_A396EmprCod, P0AKC6_A14AlbComCod, P0AKC6_A2384AlbCObs, P0AKC6_n2384AlbCObs, P0AKC6_A2386AlbCObsLin
            }
            , new Object[] {
            P0AKC7_A497FpgCod, P0AKC7_A396EmprCod, P0AKC7_A297CliPri, P0AKC7_A252CliCod, P0AKC7_A498FpgDsc, P0AKC7_n498FpgDsc
            }
            , new Object[] {
            P0AKC8_A396EmprCod, P0AKC8_A266CliEnvLin, P0AKC8_A252CliCod, P0AKC8_A267CliEnvNom, P0AKC8_A265CliEnvDom, P0AKC8_A264CliEnvCp, P0AKC8_A10775CliEnvCp2, P0AKC8_A268CliEnvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV59PQrcode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A5142AlcDomEnv ;
   private byte A10739AlbComEAT ;
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte AV23CliEnvDom ;
   private byte AV51mes ;
   private byte AV30dia ;
   private byte A4717AlbComUni ;
   private byte AV47j ;
   private byte A2386AlbCObsLin ;
   private byte A266CliEnvLin ;
   private short AV11anyo ;
   private short AV37Dpi ;
   private short AV58Pixel ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV16CliCod ;
   private int Gx_OldLine ;
   private int GX_I ;
   private java.math.BigDecimal AV14Centimetos ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal AV9AlbComcnt ;
   private String A396EmprCod ;
   private String AV46ImpCod ;
   private String AV63Tex_Copia ;
   private String Gx_out ;
   private String AV29ContDsc ;
   private String AV41Firmad ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV8EmprNom ;
   private String AV65Texto_1 ;
   private String AV66Texto_2 ;
   private String AV38EmprCif ;
   private String A10738AlbComSt ;
   private String A14248AlbComATCU ;
   private String A22AlbComPri ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A14249AlbComSerA ;
   private String A14250AlbComTipA ;
   private String A10014AlbComFd ;
   private String A10740AlbComID ;
   private String A278CliNif ;
   private String A4830AlbComMat ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String AV27codValidacaoSerie ;
   private String AV12atcud ;
   private String AV60Prioridad ;
   private String AV79codigopostal ;
   private String AV77vPob ;
   private String AV35DocNom ;
   private String AV39FechaAlb ;
   private String AV36documento ;
   private String AV33DiaHora ;
   private String AV44HoraCarga ;
   private String AV67Texto_fd ;
   private String AV40Firma4dig ;
   private String AV13AtId ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV32DiaGuia ;
   private String AV34Diasalida ;
   private String AV78textoNOAT ;
   private String sImgUrl ;
   private String AV21CliEDom ;
   private String AV19CliEcp12 ;
   private String AV24CliEPob ;
   private String A5144AlbUcoDsc ;
   private String A10806AlbComDc2 ;
   private String A15AlbComDsc ;
   private String AV10AlbUcodsc ;
   private String AV64Text_l ;
   private String AV76vObs[] ;
   private String A2384AlbCObs ;
   private String A497FpgCod ;
   private String A297CliPri ;
   private String A498FpgDsc ;
   private String AV42FpgDsc ;
   private String AV18CliEcp ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A10775CliEnvCp2 ;
   private String A268CliEnvPob ;
   private String AV22CliENom ;
   private String AV20CliEcp2 ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV31DiaCarga ;
   private boolean n407EmprNom ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean returnInSub ;
   private boolean n5144AlbUcoDsc ;
   private boolean n2384AlbCObs ;
   private boolean n498FpgDsc ;
   private String AV61ReportInPut ;
   private String AV68TextoAnulado ;
   private String AV70TextoGenerar ;
   private String AV72Url ;
   private String AV86Imagen_GXI ;
   private String AV62RutaImagenMarcaAgua ;
   private String AV87Marcaaguaimagen_GXI ;
   private String AV45Imagen ;
   private String AV49MarcaAguaImagen ;
   private String Marcaaguaimagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKC2_A396EmprCod ;
   private String[] P0AKC2_A407EmprNom ;
   private boolean[] P0AKC2_n407EmprNom ;
   private String[] P0AKC2_A8335EmpItm2 ;
   private boolean[] P0AKC2_n8335EmpItm2 ;
   private String[] P0AKC2_A8334EmpItm1 ;
   private boolean[] P0AKC2_n8334EmpItm1 ;
   private String[] P0AKC2_A8337EmpItm4 ;
   private boolean[] P0AKC2_n8337EmpItm4 ;
   private String[] P0AKC2_A8336EmpItm3 ;
   private boolean[] P0AKC2_n8336EmpItm3 ;
   private String[] P0AKC2_A395EmprCif ;
   private boolean[] P0AKC2_n395EmprCif ;
   private String[] P0AKC3_A396EmprCod ;
   private int[] P0AKC3_A14AlbComCod ;
   private String[] P0AKC3_A10738AlbComSt ;
   private String[] P0AKC3_A14248AlbComATCU ;
   private int[] P0AKC3_A252CliCod ;
   private String[] P0AKC3_A22AlbComPri ;
   private byte[] P0AKC3_A5142AlcDomEnv ;
   private String[] P0AKC3_A4828CliCp2 ;
   private String[] P0AKC3_A256CliCp ;
   private String[] P0AKC3_A295CliPob ;
   private java.util.Date[] P0AKC3_A17AlbComFch ;
   private String[] P0AKC3_A14249AlbComSerA ;
   private String[] P0AKC3_A14250AlbComTipA ;
   private java.util.Date[] P0AKC3_A4829AlbComHor ;
   private String[] P0AKC3_A10014AlbComFd ;
   private String[] P0AKC3_A10740AlbComID ;
   private String[] P0AKC3_A278CliNif ;
   private byte[] P0AKC3_A10739AlbComEAT ;
   private String[] P0AKC3_A4830AlbComMat ;
   private String[] P0AKC3_A260CliDom ;
   private String[] P0AKC3_A279CliNom ;
   private byte[] P0AKC3_A16AlbComEst ;
   private byte[] P0AKC3_A1783AlbComEso ;
   private byte[] P0AKC4_A4717AlbComUni ;
   private String[] P0AKC4_A396EmprCod ;
   private int[] P0AKC4_A14AlbComCod ;
   private String[] P0AKC4_A5144AlbUcoDsc ;
   private boolean[] P0AKC4_n5144AlbUcoDsc ;
   private java.math.BigDecimal[] P0AKC4_A13AlbComCnt ;
   private String[] P0AKC4_A10806AlbComDc2 ;
   private String[] P0AKC4_A15AlbComDsc ;
   private short[] P0AKC4_A20AlbComLin ;
   private String[] P0AKC6_A396EmprCod ;
   private int[] P0AKC6_A14AlbComCod ;
   private String[] P0AKC6_A2384AlbCObs ;
   private boolean[] P0AKC6_n2384AlbCObs ;
   private byte[] P0AKC6_A2386AlbCObsLin ;
   private String[] P0AKC7_A497FpgCod ;
   private String[] P0AKC7_A396EmprCod ;
   private String[] P0AKC7_A297CliPri ;
   private int[] P0AKC7_A252CliCod ;
   private String[] P0AKC7_A498FpgDsc ;
   private boolean[] P0AKC7_n498FpgDsc ;
   private String[] P0AKC8_A396EmprCod ;
   private byte[] P0AKC8_A266CliEnvLin ;
   private int[] P0AKC8_A252CliCod ;
   private String[] P0AKC8_A267CliEnvNom ;
   private String[] P0AKC8_A265CliEnvDom ;
   private String[] P0AKC8_A264CliEnvCp ;
   private String[] P0AKC8_A10775CliEnvCp2 ;
   private String[] P0AKC8_A268CliEnvPob ;
   private com.genexus.webpanels.WebSession AV80WEBSession ;
}

final  class pgrcommcopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKC2", "SELECT EmprCod, EmprNom, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AKC3", "SELECT T1.EmprCod, T1.AlbComCod, T1.AlbComSt, T1.AlbComATCU, T1.CliCod, T1.AlbComPri, T1.AlcDomEnv, T2.CliCp2, T2.CliCp, T2.CliPob, T1.AlbComFch, T1.AlbComSerA, T1.AlbComTipA, T1.AlbComHor, T1.AlbComFd, T1.AlbComID, T2.CliNif, T1.AlbComEAT, T1.AlbComMat, T2.CliDom, T2.CliNom, T1.AlbComEst, T1.AlbComEso FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod  FOR UPDATE OF T1.AlbComEst, T1.AlbComEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AKC4", "SELECT T1.AlbComUni AS AlbComUni, T1.EmprCod, T1.AlbComCod, T2.UniDsc AS AlbUcoDsc, T1.AlbComCnt, T1.AlbComDc2, T1.AlbComDsc, T1.AlbComLin FROM (TXPLALCOM T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AKC5", "UPDATE TXPCALCOM SET AlbComEst=?, AlbComEso=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P0AKC6", "SELECT EmprCod, AlbComCod, AlbCObs, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AKC7", "SELECT T1.FpgCod, T1.EmprCod, T1.CliPri, T1.CliCod, T2.FpgDsc FROM (TXPCLIFPG T1 INNER JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod = T1.FpgCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliPri = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AKC8", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvCp2, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 4);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 200);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 20);
               ((String[]) buf[19])[0] = rslt.getString(20, 34);
               ((String[]) buf[20])[0] = rslt.getString(21, 30);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 100);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

