package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pgrcomm_impl extends GXWebReport
{
   public pgrcomm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
            AV8ImpCod = httpContext.GetPar( "ImpCod") ;
            AV15Tex_Copia = httpContext.GetPar( "Tex_Copia") ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
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
      getPrinter().GxSetDocName("") ;
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
         GXv_char1[0] = AV26ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRCOMM", ""), GXv_char1) ;
         pgrcomm_impl.this.AV26ContDsc = GXv_char1[0] ;
         GXt_char2 = AV35Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pgrcomm_impl.this.A396EmprCod = GXv_char1[0] ;
         pgrcomm_impl.this.GXt_char2 = GXv_char4[0] ;
         AV35Firmad = GXt_char2 ;
         GXt_int5 = AV59PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pgrcomm_impl.this.GXt_int5 = GXv_int6[0] ;
         AV59PQrcode = GXt_int5 ;
         /* Using cursor P01DH2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P01DH2_A407EmprNom[0] ;
            n407EmprNom = P01DH2_n407EmprNom[0] ;
            A8335EmpItm2 = P01DH2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P01DH2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P01DH2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P01DH2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P01DH2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P01DH2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P01DH2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P01DH2_n8336EmpItm3[0] ;
            A395EmprCif = P01DH2_A395EmprCif[0] ;
            n395EmprCif = P01DH2_n395EmprCif[0] ;
            AV69EmprNom = A407EmprNom ;
            AV37Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV38Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV55EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P01DH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14248AlbComATCU = P01DH3_A14248AlbComATCU[0] ;
            A252CliCod = P01DH3_A252CliCod[0] ;
            A22AlbComPri = P01DH3_A22AlbComPri[0] ;
            A5142AlcDomEnv = P01DH3_A5142AlcDomEnv[0] ;
            A295CliPob = P01DH3_A295CliPob[0] ;
            A256CliCp = P01DH3_A256CliCp[0] ;
            A17AlbComFch = P01DH3_A17AlbComFch[0] ;
            A4829AlbComHor = P01DH3_A4829AlbComHor[0] ;
            A10014AlbComFd = P01DH3_A10014AlbComFd[0] ;
            A10740AlbComID = P01DH3_A10740AlbComID[0] ;
            A278CliNif = P01DH3_A278CliNif[0] ;
            A4830AlbComMat = P01DH3_A4830AlbComMat[0] ;
            A260CliDom = P01DH3_A260CliDom[0] ;
            A279CliNom = P01DH3_A279CliNom[0] ;
            A16AlbComEst = P01DH3_A16AlbComEst[0] ;
            A1783AlbComEso = P01DH3_A1783AlbComEso[0] ;
            A295CliPob = P01DH3_A295CliPob[0] ;
            A256CliCp = P01DH3_A256CliCp[0] ;
            A278CliNif = P01DH3_A278CliNif[0] ;
            A260CliDom = P01DH3_A260CliDom[0] ;
            A279CliNom = P01DH3_A279CliNom[0] ;
            AV66codValidacaoSerie = A14248AlbComATCU ;
            AV67atcud = ((GXutil.strcmp("", AV66codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV66codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A14AlbComCod, 8, 0))) ;
            AV21CliCod = A252CliCod ;
            AV22Prioridad = A22AlbComPri ;
            AV46CliEnvDom = A5142AlcDomEnv ;
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
            AV14vPob = GXutil.ltrim( A256CliCp) + " " + A295CliPob ;
            AV16DocNom = httpContext.getMessage( "Guia de Transporte (DV) Nº", "") ;
            if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
            {
               AV16DocNom = httpContext.getMessage( "Guia de Transporte (DV) Nº", "") ;
            }
            AV12FechaAlb = GXutil.str( GXutil.day( A17AlbComFch), 2, 0) + " " + localUtil.cmonth( A17AlbComFch, httpContext.getMessage( "por", "")) + " " + GXutil.str( GXutil.year( A17AlbComFch), 4, 0) ;
            AV25Num_alb = GXutil.trim( GXutil.str( A14AlbComCod, 8, 0)) ;
            AV42DiaHora = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV43DiaCarga = localUtil.ctod( GXutil.substring( AV42DiaHora, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV44HoraCarga = GXutil.substring( AV42DiaHora, 12, 8) ;
            AV34Texto_fd = " " ;
            if ( GXutil.strcmp(A10014AlbComFd, " ") != 0 )
            {
               AV36Firma4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
               AV34Texto_fd = AV36Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV35Firmad) ;
            }
            else
            {
               AV34Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV41AtId = " " ;
            if ( GXutil.strcmp(A10740AlbComID, " ") != 0 )
            {
               AV41AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A10740AlbComID, 1, 12)) ;
            }
            AV36Firma4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
            AV60TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV55EmprCif) + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A278CliNif) + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV60TextoGenerar += ((GXutil.strcmp(A22AlbComPri, "1")==0) ? httpContext.getMessage( "D:", "")+httpContext.getMessage( "GR", "")+"*" : httpContext.getMessage( "D:", "")+httpContext.getMessage( "GT", "")+"*") ;
            AV60TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV56anyo = (short)(GXutil.year( A17AlbComFch)) ;
            AV57mes = (byte)(GXutil.month( A17AlbComFch)) ;
            AV58dia = (byte)(GXutil.day( A17AlbComFch)) ;
            AV60TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV56anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV57mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV58dia, 2, 0)), (short)(2), "0") + "*" ;
            AV60TextoGenerar += ((GXutil.strcmp(A22AlbComPri, "1")==0) ? httpContext.getMessage( "G:", "")+httpContext.getMessage( "GR 3/", "")+GXutil.trim( GXutil.str( A14AlbComCod, 8, 0))+"*" : httpContext.getMessage( "G:", "")+httpContext.getMessage( "GT 4/", "")+GXutil.trim( GXutil.str( A14AlbComCod, 8, 0))+"*") ;
            AV60TextoGenerar += httpContext.getMessage( "H:", "") + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "Q:", "") + AV36Firma4dig + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV35Firmad) + "*" ;
            AV70Dpi = (short)(300) ;
            AV71Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV72Pixel = (short)(DecimalUtil.decToDouble(AV71Centimetos.multiply(DecimalUtil.doubleToDec(AV70Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV68Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV60TextoGenerar, AV72Pixel, AV72Pixel, GXv_char4) ;
            pgrcomm_impl.this.GXt_char2 = GXv_char4[0] ;
            AV68Url = GXt_char2 ;
            AV61Imagen = AV68Url ;
            AV78Imagen_GXI = GXDbFile.pathToUrl( AV68Url, context.getHttpContext()) ;
            AV29Hh = (byte)(GXutil.hour( A4829AlbComHor)) ;
            AV30Mm = (byte)(GXutil.minute( A4829AlbComHor)) ;
            AV32Ceros2 = "00" ;
            AV27vHh = GXutil.trim( GXutil.str( AV29Hh, 2, 0)) ;
            AV31Lenvar = (byte)(GXutil.len( AV27vHh)) ;
            AV31Lenvar = (byte)(2-AV31Lenvar) ;
            AV27vHh = GXutil.substring( AV32Ceros2, 1, AV31Lenvar) + AV27vHh ;
            AV28vMm = GXutil.trim( GXutil.str( AV30Mm, 2, 0)) ;
            AV31Lenvar = (byte)(GXutil.len( AV28vMm)) ;
            AV31Lenvar = (byte)(2-AV31Lenvar) ;
            AV28vMm = GXutil.substring( AV32Ceros2, 1, AV31Lenvar) + AV28vMm ;
            AV33vHora = AV27vHh + ":" + AV28vMm ;
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
            h1DH0( false, 407) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 386, Gx_line+181, 575, Gx_line+199, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 386, Gx_line+201, 600, Gx_line+219, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 386, Gx_line+233, 575, Gx_line+251, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(54, Gx_line+274, 768, Gx_line+363, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16DocNom, "")), 384, Gx_line+113, 618, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 78, Gx_line+283, 139, Gx_line+299, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 78, Gx_line+301, 170, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 78, Gx_line+319, 179, Gx_line+335, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 77, Gx_line+338, 147, Gx_line+354, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Contibuinte:", ""), 456, Gx_line+283, 542, Gx_line+299, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 488, Gx_line+338, 543, Gx_line+354, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 178, Gx_line+283, 223, Gx_line+300, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A17AlbComFch, "99/99/99"), 178, Gx_line+319, 229, Gx_line+336, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 178, Gx_line+302, 261, Gx_line+318, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 547, Gx_line+283, 652, Gx_line+300, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Num_alb, "")), 627, Gx_line+113, 769, Gx_line+134, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(54, Gx_line+370, 769, Gx_line+403, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 195, Gx_line+378, 256, Gx_line+394, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 661, Gx_line+378, 730, Gx_line+394, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Tex_Copia, "")), 716, Gx_line+143, 769, Gx_line+159, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4830AlbComMat, "")), 547, Gx_line+338, 652, Gx_line+355, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV43DiaCarga, "99/99/99"), 177, Gx_line+338, 228, Gx_line+355, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(373, Gx_line+167, 768, Gx_line+270, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 25, Gx_line+8, 782, Gx_line+94) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora Carga:", ""), 247, Gx_line+338, 318, Gx_line+354, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44HoraCarga, "")), 318, Gx_line+338, 411, Gx_line+355, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 430, Gx_line+302, 542, Gx_line+318, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51CliEDom, "")), 547, Gx_line+302, 725, Gx_line+319, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49CliEcp12, "")), 547, Gx_line+319, 600, Gx_line+336, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52CliEPob, "")), 607, Gx_line+319, 764, Gx_line+336, 0+256, 0, 0, 0) ;
            sImgUrl = ((GXutil.strcmp("", AV61Imagen)==0) ? AV78Imagen_GXI : AV61Imagen) ;
            getPrinter().GxDrawBitMap(sImgUrl, 224, Gx_line+126, 357, Gx_line+264) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67atcud, "")), 210, Gx_line+102, 367, Gx_line+119, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+407) ;
            /* Using cursor P01DH4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4717AlbComUni = P01DH4_A4717AlbComUni[0] ;
               A5144AlbUcoDsc = P01DH4_A5144AlbUcoDsc[0] ;
               n5144AlbUcoDsc = P01DH4_n5144AlbUcoDsc[0] ;
               A13AlbComCnt = P01DH4_A13AlbComCnt[0] ;
               A10806AlbComDc2 = P01DH4_A10806AlbComDc2[0] ;
               A15AlbComDsc = P01DH4_A15AlbComDsc[0] ;
               A20AlbComLin = P01DH4_A20AlbComLin[0] ;
               A5144AlbUcoDsc = P01DH4_A5144AlbUcoDsc[0] ;
               n5144AlbUcoDsc = P01DH4_n5144AlbUcoDsc[0] ;
               AV39AlbUcodsc = A5144AlbUcoDsc ;
               AV40AlbComcnt = A13AlbComCnt ;
               AV45Text_l = A15AlbComDsc + GXutil.substring( A10806AlbComDc2, 1, 40) ;
               h1DH0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40AlbComcnt, "ZZZZZZ.ZZ")), 672, Gx_line+0, 739, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39AlbUcodsc, "")), 746, Gx_line+1, 765, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Text_l, "")), 59, Gx_line+0, 643, Gx_line+17, 0+256, 0, 0, 0) ;
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
            if ( AV59PQrcode == 1 )
            {
               h1DH0( false, 30) ;
               getPrinter().GxAttris("Arial", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TextoGenerar, "")), 8, Gx_line+5, 776, Gx_line+24, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+30) ;
            }
            /* Using cursor P01DH5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A16AlbComEst), Byte.valueOf(A1783AlbComEso), A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1DH0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'CARGA_OBS' Routine */
      returnInSub = false ;
      AV18j = (byte)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV19vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P01DH6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A2384AlbCObs = P01DH6_A2384AlbCObs[0] ;
         n2384AlbCObs = P01DH6_n2384AlbCObs[0] ;
         A2386AlbCObsLin = P01DH6_A2386AlbCObsLin[0] ;
         if ( AV18j <= 6 )
         {
            AV19vObs[AV18j-1] = A2384AlbCObs ;
         }
         else
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV18j = (byte)(AV18j+1) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PAGO' Routine */
      returnInSub = false ;
      /* Using cursor P01DH7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV21CliCod), AV22Prioridad});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A497FpgCod = P01DH7_A497FpgCod[0] ;
         A297CliPri = P01DH7_A297CliPri[0] ;
         A252CliCod = P01DH7_A252CliCod[0] ;
         A498FpgDsc = P01DH7_A498FpgDsc[0] ;
         n498FpgDsc = P01DH7_n498FpgDsc[0] ;
         A498FpgDsc = P01DH7_A498FpgDsc[0] ;
         n498FpgDsc = P01DH7_n498FpgDsc[0] ;
         AV13FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      AV49CliEcp12 = " " ;
      AV51CliEDom = httpContext.getMessage( "V/ Instalaçoes", "") ;
      AV48CliEcp = " " ;
      AV52CliEPob = " " ;
      /* Using cursor P01DH8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV21CliCod), Byte.valueOf(AV46CliEnvDom)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A266CliEnvLin = P01DH8_A266CliEnvLin[0] ;
         A252CliCod = P01DH8_A252CliCod[0] ;
         A267CliEnvNom = P01DH8_A267CliEnvNom[0] ;
         A265CliEnvDom = P01DH8_A265CliEnvDom[0] ;
         A264CliEnvCp = P01DH8_A264CliEnvCp[0] ;
         A10775CliEnvCp2 = P01DH8_A10775CliEnvCp2[0] ;
         A268CliEnvPob = P01DH8_A268CliEnvPob[0] ;
         AV47CliENom = A267CliEnvNom ;
         AV51CliEDom = A265CliEnvDom ;
         AV48CliEcp = A264CliEnvCp ;
         AV50CliEcp2 = GXutil.trim( A10775CliEnvCp2) ;
         AV52CliEPob = A268CliEnvPob ;
         AV49CliEcp12 = GXutil.trim( A264CliEnvCp) ;
         AV49CliEcp12 += ((GXutil.strcmp(A10775CliEnvCp2, " ")!=0) ? "-"+GXutil.trim( AV50CliEcp2) : "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void h1DH0( boolean bFoot ,
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19vObs[1-1], "")), 147, Gx_line+16, 513, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19vObs[2-1], "")), 147, Gx_line+31, 513, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19vObs[3-1], "")), 147, Gx_line+47, 513, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19vObs[4-1], "")), 147, Gx_line+63, 513, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19vObs[5-1], "")), 147, Gx_line+78, 513, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(46, Gx_line+132, 776, Gx_line+132, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26ContDsc, "")), 688, Gx_line+117, 772, Gx_line+130, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Texto_fd, "")), 46, Gx_line+117, 276, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Texto_1, "")), 78, Gx_line+134, 746, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Texto_2, "")), 99, Gx_line+153, 725, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41AtId, "")), 328, Gx_line+117, 454, Gx_line+130, 0+256, 0, 0, 0) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "albaranescomerciales.pgrcomm");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "albaranescomerciales.pgrcomm");
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV8ImpCod = "" ;
      AV15Tex_Copia = "" ;
      AV26ContDsc = "" ;
      AV35Firmad = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P01DH2_A396EmprCod = new String[] {""} ;
      P01DH2_A407EmprNom = new String[] {""} ;
      P01DH2_n407EmprNom = new boolean[] {false} ;
      P01DH2_A8335EmpItm2 = new String[] {""} ;
      P01DH2_n8335EmpItm2 = new boolean[] {false} ;
      P01DH2_A8334EmpItm1 = new String[] {""} ;
      P01DH2_n8334EmpItm1 = new boolean[] {false} ;
      P01DH2_A8337EmpItm4 = new String[] {""} ;
      P01DH2_n8337EmpItm4 = new boolean[] {false} ;
      P01DH2_A8336EmpItm3 = new String[] {""} ;
      P01DH2_n8336EmpItm3 = new boolean[] {false} ;
      P01DH2_A395EmprCif = new String[] {""} ;
      P01DH2_n395EmprCif = new boolean[] {false} ;
      A407EmprNom = "" ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV69EmprNom = "" ;
      AV37Texto_1 = "" ;
      AV38Texto_2 = "" ;
      AV55EmprCif = "" ;
      P01DH3_A396EmprCod = new String[] {""} ;
      P01DH3_A14AlbComCod = new int[1] ;
      P01DH3_A14248AlbComATCU = new String[] {""} ;
      P01DH3_A252CliCod = new int[1] ;
      P01DH3_A22AlbComPri = new String[] {""} ;
      P01DH3_A5142AlcDomEnv = new byte[1] ;
      P01DH3_A295CliPob = new String[] {""} ;
      P01DH3_A256CliCp = new String[] {""} ;
      P01DH3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P01DH3_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P01DH3_A10014AlbComFd = new String[] {""} ;
      P01DH3_A10740AlbComID = new String[] {""} ;
      P01DH3_A278CliNif = new String[] {""} ;
      P01DH3_A4830AlbComMat = new String[] {""} ;
      P01DH3_A260CliDom = new String[] {""} ;
      P01DH3_A279CliNom = new String[] {""} ;
      P01DH3_A16AlbComEst = new byte[1] ;
      P01DH3_A1783AlbComEso = new byte[1] ;
      A14248AlbComATCU = "" ;
      A22AlbComPri = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10014AlbComFd = "" ;
      A10740AlbComID = "" ;
      A278CliNif = "" ;
      A4830AlbComMat = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      AV66codValidacaoSerie = "" ;
      AV67atcud = "" ;
      AV22Prioridad = "" ;
      AV14vPob = "" ;
      AV16DocNom = "" ;
      AV12FechaAlb = "" ;
      AV25Num_alb = "" ;
      AV42DiaHora = "" ;
      AV43DiaCarga = GXutil.nullDate() ;
      AV44HoraCarga = "" ;
      AV34Texto_fd = "" ;
      AV36Firma4dig = "" ;
      AV41AtId = "" ;
      AV60TextoGenerar = "" ;
      AV71Centimetos = DecimalUtil.ZERO ;
      AV68Url = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV61Imagen = "" ;
      AV78Imagen_GXI = "" ;
      AV32Ceros2 = "" ;
      AV27vHh = "" ;
      AV28vMm = "" ;
      AV33vHora = "" ;
      AV51CliEDom = "" ;
      AV49CliEcp12 = "" ;
      AV52CliEPob = "" ;
      AV61Imagen = "" ;
      sImgUrl = "" ;
      P01DH4_A4717AlbComUni = new byte[1] ;
      P01DH4_A396EmprCod = new String[] {""} ;
      P01DH4_A14AlbComCod = new int[1] ;
      P01DH4_A5144AlbUcoDsc = new String[] {""} ;
      P01DH4_n5144AlbUcoDsc = new boolean[] {false} ;
      P01DH4_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01DH4_A10806AlbComDc2 = new String[] {""} ;
      P01DH4_A15AlbComDsc = new String[] {""} ;
      P01DH4_A20AlbComLin = new short[1] ;
      A5144AlbUcoDsc = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A10806AlbComDc2 = "" ;
      A15AlbComDsc = "" ;
      AV39AlbUcodsc = "" ;
      AV40AlbComcnt = DecimalUtil.ZERO ;
      AV45Text_l = "" ;
      AV19vObs = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV19vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P01DH6_A396EmprCod = new String[] {""} ;
      P01DH6_A14AlbComCod = new int[1] ;
      P01DH6_A2384AlbCObs = new String[] {""} ;
      P01DH6_n2384AlbCObs = new boolean[] {false} ;
      P01DH6_A2386AlbCObsLin = new byte[1] ;
      A2384AlbCObs = "" ;
      P01DH7_A497FpgCod = new String[] {""} ;
      P01DH7_A396EmprCod = new String[] {""} ;
      P01DH7_A297CliPri = new String[] {""} ;
      P01DH7_A252CliCod = new int[1] ;
      P01DH7_A498FpgDsc = new String[] {""} ;
      P01DH7_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A297CliPri = "" ;
      A498FpgDsc = "" ;
      AV13FpgDsc = "" ;
      AV48CliEcp = "" ;
      P01DH8_A396EmprCod = new String[] {""} ;
      P01DH8_A266CliEnvLin = new byte[1] ;
      P01DH8_A252CliCod = new int[1] ;
      P01DH8_A267CliEnvNom = new String[] {""} ;
      P01DH8_A265CliEnvDom = new String[] {""} ;
      P01DH8_A264CliEnvCp = new String[] {""} ;
      P01DH8_A10775CliEnvCp2 = new String[] {""} ;
      P01DH8_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A268CliEnvPob = "" ;
      AV47CliENom = "" ;
      AV50CliEcp2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranescomerciales.pgrcomm__default(),
         new Object[] {
             new Object[] {
            P01DH2_A396EmprCod, P01DH2_A407EmprNom, P01DH2_n407EmprNom, P01DH2_A8335EmpItm2, P01DH2_n8335EmpItm2, P01DH2_A8334EmpItm1, P01DH2_n8334EmpItm1, P01DH2_A8337EmpItm4, P01DH2_n8337EmpItm4, P01DH2_A8336EmpItm3,
            P01DH2_n8336EmpItm3, P01DH2_A395EmprCif, P01DH2_n395EmprCif
            }
            , new Object[] {
            P01DH3_A396EmprCod, P01DH3_A14AlbComCod, P01DH3_A14248AlbComATCU, P01DH3_A252CliCod, P01DH3_A22AlbComPri, P01DH3_A5142AlcDomEnv, P01DH3_A295CliPob, P01DH3_A256CliCp, P01DH3_A17AlbComFch, P01DH3_A4829AlbComHor,
            P01DH3_A10014AlbComFd, P01DH3_A10740AlbComID, P01DH3_A278CliNif, P01DH3_A4830AlbComMat, P01DH3_A260CliDom, P01DH3_A279CliNom, P01DH3_A16AlbComEst, P01DH3_A1783AlbComEso
            }
            , new Object[] {
            P01DH4_A4717AlbComUni, P01DH4_A396EmprCod, P01DH4_A14AlbComCod, P01DH4_A5144AlbUcoDsc, P01DH4_n5144AlbUcoDsc, P01DH4_A13AlbComCnt, P01DH4_A10806AlbComDc2, P01DH4_A15AlbComDsc, P01DH4_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            P01DH6_A396EmprCod, P01DH6_A14AlbComCod, P01DH6_A2384AlbCObs, P01DH6_n2384AlbCObs, P01DH6_A2386AlbCObsLin
            }
            , new Object[] {
            P01DH7_A497FpgCod, P01DH7_A396EmprCod, P01DH7_A297CliPri, P01DH7_A252CliCod, P01DH7_A498FpgDsc, P01DH7_n498FpgDsc
            }
            , new Object[] {
            P01DH8_A396EmprCod, P01DH8_A266CliEnvLin, P01DH8_A252CliCod, P01DH8_A267CliEnvNom, P01DH8_A265CliEnvDom, P01DH8_A264CliEnvCp, P01DH8_A10775CliEnvCp2, P01DH8_A268CliEnvPob
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
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte AV46CliEnvDom ;
   private byte AV57mes ;
   private byte AV58dia ;
   private byte AV29Hh ;
   private byte AV30Mm ;
   private byte AV31Lenvar ;
   private byte A4717AlbComUni ;
   private byte AV18j ;
   private byte A2386AlbCObsLin ;
   private byte A266CliEnvLin ;
   private short gxcookieaux ;
   private short AV56anyo ;
   private short AV70Dpi ;
   private short AV72Pixel ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV21CliCod ;
   private int Gx_OldLine ;
   private int GX_I ;
   private java.math.BigDecimal AV71Centimetos ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal AV40AlbComcnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV15Tex_Copia ;
   private String AV26ContDsc ;
   private String AV35Firmad ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV69EmprNom ;
   private String AV37Texto_1 ;
   private String AV38Texto_2 ;
   private String AV55EmprCif ;
   private String A14248AlbComATCU ;
   private String A22AlbComPri ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A10014AlbComFd ;
   private String A10740AlbComID ;
   private String A278CliNif ;
   private String A4830AlbComMat ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String AV66codValidacaoSerie ;
   private String AV67atcud ;
   private String AV22Prioridad ;
   private String AV14vPob ;
   private String AV16DocNom ;
   private String AV12FechaAlb ;
   private String AV25Num_alb ;
   private String AV42DiaHora ;
   private String AV44HoraCarga ;
   private String AV34Texto_fd ;
   private String AV36Firma4dig ;
   private String AV41AtId ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV32Ceros2 ;
   private String AV27vHh ;
   private String AV28vMm ;
   private String AV33vHora ;
   private String AV51CliEDom ;
   private String AV49CliEcp12 ;
   private String AV52CliEPob ;
   private String sImgUrl ;
   private String A5144AlbUcoDsc ;
   private String A10806AlbComDc2 ;
   private String A15AlbComDsc ;
   private String AV39AlbUcodsc ;
   private String AV45Text_l ;
   private String AV19vObs[] ;
   private String A2384AlbCObs ;
   private String A497FpgCod ;
   private String A297CliPri ;
   private String A498FpgDsc ;
   private String AV13FpgDsc ;
   private String AV48CliEcp ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A10775CliEnvCp2 ;
   private String A268CliEnvPob ;
   private String AV47CliENom ;
   private String AV50CliEcp2 ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV43DiaCarga ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private String AV60TextoGenerar ;
   private String AV68Url ;
   private String AV78Imagen_GXI ;
   private String AV61Imagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P01DH2_A396EmprCod ;
   private String[] P01DH2_A407EmprNom ;
   private boolean[] P01DH2_n407EmprNom ;
   private String[] P01DH2_A8335EmpItm2 ;
   private boolean[] P01DH2_n8335EmpItm2 ;
   private String[] P01DH2_A8334EmpItm1 ;
   private boolean[] P01DH2_n8334EmpItm1 ;
   private String[] P01DH2_A8337EmpItm4 ;
   private boolean[] P01DH2_n8337EmpItm4 ;
   private String[] P01DH2_A8336EmpItm3 ;
   private boolean[] P01DH2_n8336EmpItm3 ;
   private String[] P01DH2_A395EmprCif ;
   private boolean[] P01DH2_n395EmprCif ;
   private String[] P01DH3_A396EmprCod ;
   private int[] P01DH3_A14AlbComCod ;
   private String[] P01DH3_A14248AlbComATCU ;
   private int[] P01DH3_A252CliCod ;
   private String[] P01DH3_A22AlbComPri ;
   private byte[] P01DH3_A5142AlcDomEnv ;
   private String[] P01DH3_A295CliPob ;
   private String[] P01DH3_A256CliCp ;
   private java.util.Date[] P01DH3_A17AlbComFch ;
   private java.util.Date[] P01DH3_A4829AlbComHor ;
   private String[] P01DH3_A10014AlbComFd ;
   private String[] P01DH3_A10740AlbComID ;
   private String[] P01DH3_A278CliNif ;
   private String[] P01DH3_A4830AlbComMat ;
   private String[] P01DH3_A260CliDom ;
   private String[] P01DH3_A279CliNom ;
   private byte[] P01DH3_A16AlbComEst ;
   private byte[] P01DH3_A1783AlbComEso ;
   private byte[] P01DH4_A4717AlbComUni ;
   private String[] P01DH4_A396EmprCod ;
   private int[] P01DH4_A14AlbComCod ;
   private String[] P01DH4_A5144AlbUcoDsc ;
   private boolean[] P01DH4_n5144AlbUcoDsc ;
   private java.math.BigDecimal[] P01DH4_A13AlbComCnt ;
   private String[] P01DH4_A10806AlbComDc2 ;
   private String[] P01DH4_A15AlbComDsc ;
   private short[] P01DH4_A20AlbComLin ;
   private String[] P01DH6_A396EmprCod ;
   private int[] P01DH6_A14AlbComCod ;
   private String[] P01DH6_A2384AlbCObs ;
   private boolean[] P01DH6_n2384AlbCObs ;
   private byte[] P01DH6_A2386AlbCObsLin ;
   private String[] P01DH7_A497FpgCod ;
   private String[] P01DH7_A396EmprCod ;
   private String[] P01DH7_A297CliPri ;
   private int[] P01DH7_A252CliCod ;
   private String[] P01DH7_A498FpgDsc ;
   private boolean[] P01DH7_n498FpgDsc ;
   private String[] P01DH8_A396EmprCod ;
   private byte[] P01DH8_A266CliEnvLin ;
   private int[] P01DH8_A252CliCod ;
   private String[] P01DH8_A267CliEnvNom ;
   private String[] P01DH8_A265CliEnvDom ;
   private String[] P01DH8_A264CliEnvCp ;
   private String[] P01DH8_A10775CliEnvCp2 ;
   private String[] P01DH8_A268CliEnvPob ;
}

final  class pgrcomm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01DH2", "SELECT EmprCod, EmprNom, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01DH3", "SELECT T1.EmprCod, T1.AlbComCod, T1.AlbComATCU, T1.CliCod, T1.AlbComPri, T1.AlcDomEnv, T2.CliPob, T2.CliCp, T1.AlbComFch, T1.AlbComHor, T1.AlbComFd, T1.AlbComID, T2.CliNif, T1.AlbComMat, T2.CliDom, T2.CliNom, T1.AlbComEst, T1.AlbComEso FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod  FOR UPDATE OF T1.AlbComEst, T1.AlbComEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01DH4", "SELECT T1.AlbComUni AS AlbComUni, T1.EmprCod, T1.AlbComCod, T2.UniDsc AS AlbUcoDsc, T1.AlbComCnt, T1.AlbComDc2, T1.AlbComDsc, T1.AlbComLin FROM (TXPLALCOM T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01DH5", "UPDATE TXPCALCOM SET AlbComEst=?, AlbComEso=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P01DH6", "SELECT EmprCod, AlbComCod, AlbCObs, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01DH7", "SELECT T1.FpgCod, T1.EmprCod, T1.CliPri, T1.CliCod, T2.FpgDsc FROM (TXPCLIFPG T1 INNER JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod = T1.FpgCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliPri = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01DH8", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvCp2, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 200);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 34);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
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

