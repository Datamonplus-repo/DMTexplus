package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class paguagrmoda_impl extends GXWebReport
{
   public paguagrmoda_impl( com.genexus.internet.HttpContext context )
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            AV8ImpCod = httpContext.GetPar( "ImpCod") ;
            AV44TextoCopia = httpContext.GetPar( "TextoCopia") ;
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
      M_bot = 10 ;
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*10)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV53ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRMODA", ""), GXv_char1) ;
         paguagrmoda_impl.this.AV53ContDsc = GXv_char1[0] ;
         GXt_char2 = AV62Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         paguagrmoda_impl.this.A396EmprCod = GXv_char1[0] ;
         paguagrmoda_impl.this.GXt_char2 = GXv_char4[0] ;
         AV62Firmad = GXt_char2 ;
         GXt_int5 = AV90existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         paguagrmoda_impl.this.GXt_int5 = GXv_int6[0] ;
         AV90existefirmad = GXt_int5 ;
         GXt_int5 = AV97PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         paguagrmoda_impl.this.GXt_int5 = GXv_int6[0] ;
         AV97PQrcode = GXt_int5 ;
         GXt_int5 = AV107flax2 ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FLAX2", ""), GXv_int6) ;
         paguagrmoda_impl.this.GXt_int5 = GXv_int6[0] ;
         AV107flax2 = GXt_int5 ;
         /* Using cursor P0AH72 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0AH72_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AH72_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0AH72_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AH72_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0AH72_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AH72_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AH72_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AH72_n8336EmpItm3[0] ;
            A395EmprCif = P0AH72_A395EmprCif[0] ;
            n395EmprCif = P0AH72_n395EmprCif[0] ;
            AV58Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV59Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV92EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P0AH73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14069AlbPdATCUD = P0AH73_A14069AlbPdATCUD[0] ;
            A1259AlbDomEnv = P0AH73_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P0AH73_n1259AlbDomEnv[0] ;
            A39AlbProPri = P0AH73_A39AlbProPri[0] ;
            A407EmprNom = P0AH73_A407EmprNom[0] ;
            n407EmprNom = P0AH73_n407EmprNom[0] ;
            A5140AlbMarca = P0AH73_A5140AlbMarca[0] ;
            A1879AlbProEnt = P0AH73_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P0AH73_n1879AlbProEnt[0] ;
            A33AlbProEst = P0AH73_A33AlbProEst[0] ;
            A1782AlbProEso = P0AH73_A1782AlbProEso[0] ;
            A7101AlbLic = P0AH73_A7101AlbLic[0] ;
            A10017AlbFmd = P0AH73_A10017AlbFmd[0] ;
            n10017AlbFmd = P0AH73_n10017AlbFmd[0] ;
            A4023AlbFecSal = P0AH73_A4023AlbFecSal[0] ;
            A3865AlbHorSal = P0AH73_A3865AlbHorSal[0] ;
            A3868AlbMat = P0AH73_A3868AlbMat[0] ;
            A34AlbProfch = P0AH73_A34AlbProfch[0] ;
            A1243GuiRemCli = P0AH73_A1243GuiRemCli[0] ;
            A407EmprNom = P0AH73_A407EmprNom[0] ;
            n407EmprNom = P0AH73_n407EmprNom[0] ;
            AV105codValidacaoSerie = A14069AlbPdATCUD ;
            AV106atcud = ((GXutil.strcmp("", AV105codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV105codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))) ;
            AV9CliCod = A1243GuiRemCli ;
            AV15CliEnvDom = A1259AlbDomEnv ;
            AV22Prioridad = A39AlbProPri ;
            /* Execute user subroutine: 'CLIENTE' */
            S171 ();
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
            AV61Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV64Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV61Texto_fd = AV64Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV62Firmad) ;
            }
            else
            {
               AV61Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV65AtId = " " ;
            if ( GXutil.strcmp(A7101AlbLic, " ") != 0 )
            {
               AV65AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            AV64Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
            AV91TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV92EmprCif) + "*" ;
            AV91TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( AV40CliNif) + "*" ;
            AV91TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV91TextoGenerar += ((GXutil.strcmp(A39AlbProPri, "1")==0) ? httpContext.getMessage( "D:", "")+httpContext.getMessage( "GR", "")+"*" : httpContext.getMessage( "D:", "")+httpContext.getMessage( "GT", "")+"*") ;
            AV91TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV93anyo = (short)(GXutil.year( A34AlbProfch)) ;
            AV95mes = (byte)(GXutil.month( A34AlbProfch)) ;
            AV96dia = (byte)(GXutil.day( A34AlbProfch)) ;
            AV91TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV93anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV95mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV96dia, 2, 0)), (short)(2), "0") + "*" ;
            AV91TextoGenerar += ((GXutil.strcmp(A39AlbProPri, "1")==0) ? httpContext.getMessage( "G:", "")+httpContext.getMessage( "GR 1/", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+"*" : httpContext.getMessage( "G:", "")+httpContext.getMessage( "GT 2/", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+"*") ;
            AV91TextoGenerar += httpContext.getMessage( "H:", "") + "*" ;
            AV91TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV91TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV91TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV91TextoGenerar += httpContext.getMessage( "Q:", "") + AV64Firma4dig + "*" ;
            AV91TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV62Firmad) + "*" ;
            AV113Dpi = (short)(300) ;
            AV114Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV115Pixel = (short)(DecimalUtil.decToDouble(AV114Centimetos.multiply(DecimalUtil.doubleToDec(AV113Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV116Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV91TextoGenerar, AV115Pixel, AV115Pixel, GXv_char4) ;
            paguagrmoda_impl.this.GXt_char2 = GXv_char4[0] ;
            AV116Url = GXt_char2 ;
            AV94Imagen = AV116Url ;
            AV121Imagen_GXI = GXDbFile.pathToUrl( AV116Url, context.getHttpContext()) ;
            AV14EmprNom = A407EmprNom ;
            AV50VDoc = httpContext.getMessage( "Guia de Remessa Nº", "") ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV50VDoc = httpContext.getMessage( "Guia Transporte(NCON) Nº", "") ;
            }
            if ( AV42Copias == 1 )
            {
               AV39vCopia = httpContext.getMessage( "DUPLICADO", "") ;
            }
            AV51i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV52vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Using cursor P0AH74 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A916AlbPObs = P0AH74_A916AlbPObs[0] ;
                  A915AlbPObsLin = P0AH74_A915AlbPObsLin[0] ;
                  if ( AV51i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV52vObs[AV51i-1] = A916AlbPObs ;
                  AV51i = (byte)(AV51i+1) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            else
            {
               /* Using cursor P0AH75 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A12184DltObs = P0AH75_A12184DltObs[0] ;
                  n12184DltObs = P0AH75_n12184DltObs[0] ;
                  A12185DltLinObs = P0AH75_A12185DltLinObs[0] ;
                  if ( AV51i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV52vObs[AV51i-1] = A12184DltObs ;
                  AV51i = (byte)(AV51i+1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            AV77TxtAnulado = "" ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
            {
               AV77TxtAnulado = httpContext.getMessage( "ANULADO", "") ;
            }
            AV41ContLine = (byte)(0) ;
            AV45Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            AV111Albprocod = A30AlbProCod ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Execute user subroutine: 'ALBBAR' */
               S141 ();
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
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            hAH70( false, 26) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TotKgs, "ZZZZZZ9.99")), 630, Gx_line+6, 704, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TotPzas), "ZZZZZ9")), 545, Gx_line+6, 590, Gx_line+24, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+26) ;
            if ( ( AV90existefirmad == 1 ) && (GXutil.strcmp("", A10017AlbFmd)==0) )
            {
               hAH70( false, 29) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 178, Gx_line+6, 597, Gx_line+29, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+29) ;
            }
            A33AlbProEst = (byte)(((A33AlbProEst==0) ? 1 : A33AlbProEst)) ;
            A1782AlbProEso = (byte)(((A1782AlbProEso==0) ? 1 : A1782AlbProEso)) ;
            if ( AV97PQrcode == 1 )
            {
               hAH70( false, 21) ;
               getPrinter().GxAttris("Arial", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91TextoGenerar, "")), 3, Gx_line+0, 771, Gx_line+19, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
            }
            /* Using cursor P0AH76 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAH70( true, 0) ;
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
      /* 'DLT001' Routine */
      returnInSub = false ;
      /* Using cursor P0AH77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(AV111Albprocod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A12178DltP = P0AH77_A12178DltP[0] ;
         A12177DltR = P0AH77_A12177DltR[0] ;
         A12176DltHdr = P0AH77_A12176DltHdr[0] ;
         A12153DltColNum = P0AH77_A12153DltColNum[0] ;
         n12153DltColNum = P0AH77_n12153DltColNum[0] ;
         A12145DltKgs = P0AH77_A12145DltKgs[0] ;
         n12145DltKgs = P0AH77_n12145DltKgs[0] ;
         A12147DltPzs = P0AH77_A12147DltPzs[0] ;
         n12147DltPzs = P0AH77_n12147DltPzs[0] ;
         A12150DltArtCod = P0AH77_A12150DltArtCod[0] ;
         n12150DltArtCod = P0AH77_n12150DltArtCod[0] ;
         A12186DltKgsCli = P0AH77_A12186DltKgsCli[0] ;
         n12186DltKgsCli = P0AH77_n12186DltKgsCli[0] ;
         A12151DltArtDsc = P0AH77_A12151DltArtDsc[0] ;
         n12151DltArtDsc = P0AH77_n12151DltArtDsc[0] ;
         A12187DltTubo = P0AH77_A12187DltTubo[0] ;
         n12187DltTubo = P0AH77_n12187DltTubo[0] ;
         A12149DltTubos = P0AH77_A12149DltTubos[0] ;
         n12149DltTubos = P0AH77_n12149DltTubos[0] ;
         A12188DltTuboN = P0AH77_A12188DltTuboN[0] ;
         n12188DltTuboN = P0AH77_n12188DltTuboN[0] ;
         AV43barcolnum = A12153DltColNum ;
         AV48Hdr = ((GXutil.strcmp(AV89CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A12176DltHdr, 8, 0) : ((A12177DltR>0) ? GXutil.str( A12176DltHdr, 8, 0)+" "+GXutil.str( A12177DltR, 1, 0) : GXutil.str( A12176DltHdr, 8, 0))) ;
         AV67Barcod = A12176DltHdr ;
         AV68Barcodreo = A12177DltR ;
         AV69Barcodpar = A12178DltP ;
         /* Execute user subroutine: 'BARCAD' */
         S128 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV49KgsE = AV112BarKgm ;
         AV55KgsS = A12145DltKgs ;
         AV81baralbpie = A12147DltPzs ;
         AV60MtsS = DecimalUtil.doubleToDec(0) ;
         if ( ( AV9CliCod == 310 ) || ( AV9CliCod == 320 ) )
         {
            if ( ( GXutil.strcmp(A12150DltArtCod, "20000") >= 0 ) && ( GXutil.strcmp(A12150DltArtCod, "29999") <= 0 ) )
            {
               AV60MtsS = A12145DltKgs ;
            }
         }
         if ( A12186DltKgsCli.doubleValue() != 0 )
         {
            AV55KgsS = A12186DltKgsCli ;
         }
         AV54BarSerDsc = GXutil.substring( A12151DltArtDsc, 1, 20) ;
         hAH70( false, 17) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Bardisnum, "")), 0, Gx_line+1, 59, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Hdr, "")), 61, Gx_line+1, 142, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54BarSerDsc, "")), 144, Gx_line+1, 291, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79barnomcli, "")), 295, Gx_line+1, 391, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80barcolnom, "")), 395, Gx_line+1, 491, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43barcolnum), "ZZZZZZ")), 496, Gx_line+1, 541, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81baralbpie), "ZZZZZ9")), 545, Gx_line+1, 590, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49KgsE, "ZZZ9.99")), 592, Gx_line+1, 644, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55KgsS, "ZZZZ9.99")), 644, Gx_line+1, 703, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60MtsS, "ZZZZZZ.ZZ")), 707, Gx_line+1, 774, Gx_line+17, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV41ContLine = (byte)(AV41ContLine+1) ;
         AV46TotPzas = (int)(AV46TotPzas+A12147DltPzs) ;
         AV47TotKgs = AV47TotKgs.add(AV55KgsS) ;
         /* Using cursor P0AH78 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A12175DltMtsFs = P0AH78_A12175DltMtsFs[0] ;
            n12175DltMtsFs = P0AH78_n12175DltMtsFs[0] ;
            A12190DltPrMFs = P0AH78_A12190DltPrMFs[0] ;
            n12190DltPrMFs = P0AH78_n12190DltPrMFs[0] ;
            A12192DltPrMBFs = P0AH78_A12192DltPrMBFs[0] ;
            n12192DltPrMBFs = P0AH78_n12192DltPrMBFs[0] ;
            A12173DltFasDsc = P0AH78_A12173DltFasDsc[0] ;
            n12173DltFasDsc = P0AH78_n12173DltFasDsc[0] ;
            A12172DltFascod = P0AH78_A12172DltFascod[0] ;
            n12172DltFascod = P0AH78_n12172DltFascod[0] ;
            A12174DltKgsFs = P0AH78_A12174DltKgsFs[0] ;
            n12174DltKgsFs = P0AH78_n12174DltKgsFs[0] ;
            A12191DltPrKBFs = P0AH78_A12191DltPrKBFs[0] ;
            n12191DltPrKBFs = P0AH78_n12191DltPrKBFs[0] ;
            A12182DltLin = P0AH78_A12182DltLin[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12190DltPrMFs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12175DltMtsFs)==0) )
            {
               AV57FasMtr = A12175DltMtsFs ;
               if ( A12192DltPrMBFs.doubleValue() != 0 )
               {
                  AV57FasMtr = A12192DltPrMBFs ;
               }
               hAH70( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12172DltFascod, "")), 156, Gx_line+2, 215, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12173DltFasDsc, "")), 220, Gx_line+2, 425, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57FasMtr, "ZZZZZ9.99")), 707, Gx_line+2, 774, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               AV56KgsFasS = A12174DltKgsFs ;
               if ( A12191DltPrKBFs.doubleValue() != 0 )
               {
                  AV56KgsFasS = A12191DltPrKBFs ;
               }
               hAH70( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12172DltFascod, "")), 156, Gx_line+2, 215, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12173DltFasDsc, "")), 220, Gx_line+2, 425, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56KgsFasS, "ZZZZZ9.99")), 638, Gx_line+2, 705, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            AV41ContLine = (byte)(AV41ContLine+1) ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( ! (0==A12187DltTubo) )
         {
            hAH70( false, 18) ;
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
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV66Lotes, " ") != 0 )
         {
            AV70Vlote = httpContext.getMessage( "Lote : ", "") + GXutil.trim( AV66Lotes) ;
            hAH70( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Vlote, "")), 61, Gx_line+0, 281, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fio:", ""), 288, Gx_line+0, 318, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Fio5, "")), 321, Gx_line+0, 358, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Jogo:", ""), 367, Gx_line+0, 404, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Jogo3, "")), 404, Gx_line+0, 427, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pol:", ""), 433, Gx_line+0, 463, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72Pgadas), "ZZZZZZ")), 464, Gx_line+0, 509, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LFA:", ""), 511, Gx_line+0, 541, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 591, Gx_line+0, 621, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Maq6, "")), 621, Gx_line+0, 666, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76Lfa, "ZZZ.ZZ")), 540, Gx_line+0, 585, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88txtmerma, "")), 671, Gx_line+0, 774, Gx_line+17, 0+256, 0, 0, 0) ;
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
      /* Using cursor P0AH710 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV67Barcod), Byte.valueOf(AV68Barcodreo), AV69Barcodpar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A130BarCodPar = P0AH710_A130BarCodPar[0] ;
         A132BarCodReo = P0AH710_A132BarCodReo[0] ;
         A129BarCod = P0AH710_A129BarCod[0] ;
         A252CliCod = P0AH710_A252CliCod[0] ;
         n252CliCod = P0AH710_n252CliCod[0] ;
         A143BarDisNum = P0AH710_A143BarDisNum[0] ;
         A1234BarNomCli = P0AH710_A1234BarNomCli[0] ;
         A135BarColNom = P0AH710_A135BarColNom[0] ;
         A166BarKgm = P0AH710_A166BarKgm[0] ;
         n166BarKgm = P0AH710_n166BarKgm[0] ;
         A166BarKgm = P0AH710_A166BarKgm[0] ;
         n166BarKgm = P0AH710_n166BarKgm[0] ;
         AV9CliCod = A252CliCod ;
         AV112BarKgm = A166BarKgm ;
         AV78Bardisnum = A143BarDisNum ;
         AV79barnomcli = A1234BarNomCli ;
         AV80barcolnom = A135BarColNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      /* Using cursor P0AH712 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(AV111Albprocod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P0AH712_A130BarCodPar[0] ;
         A132BarCodReo = P0AH712_A132BarCodReo[0] ;
         A129BarCod = P0AH712_A129BarCod[0] ;
         A2829BarProPer = P0AH712_A2829BarProPer[0] ;
         A136BarColNum = P0AH712_A136BarColNum[0] ;
         A1261BarAlbKgmE = P0AH712_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P0AH712_A1265BarAlbPie[0] ;
         A213BarSit = P0AH712_A213BarSit[0] ;
         A12909CliImpMerm = P0AH712_A12909CliImpMerm[0] ;
         A13236CliFacMtsP = P0AH712_A13236CliFacMtsP[0] ;
         A1263BarAlbMtrE = P0AH712_A1263BarAlbMtrE[0] ;
         A252CliCod = P0AH712_A252CliCod[0] ;
         n252CliCod = P0AH712_n252CliCod[0] ;
         A212BarSer = P0AH712_A212BarSer[0] ;
         A2243BarKgsCli = P0AH712_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P0AH712_n2243BarKgsCli[0] ;
         A1652BarSerDsc = P0AH712_A1652BarSerDsc[0] ;
         A143BarDisNum = P0AH712_A143BarDisNum[0] ;
         A1234BarNomCli = P0AH712_A1234BarNomCli[0] ;
         A135BarColNom = P0AH712_A135BarColNom[0] ;
         A1206TubCod = P0AH712_A1206TubCod[0] ;
         n1206TubCod = P0AH712_n1206TubCod[0] ;
         A1266BarAlbTub = P0AH712_A1266BarAlbTub[0] ;
         A1207TubNom = P0AH712_A1207TubNom[0] ;
         n1207TubNom = P0AH712_n1207TubNom[0] ;
         A14330BarPriorid = P0AH712_A14330BarPriorid[0] ;
         A166BarKgm = P0AH712_A166BarKgm[0] ;
         n166BarKgm = P0AH712_n166BarKgm[0] ;
         A2829BarProPer = P0AH712_A2829BarProPer[0] ;
         A136BarColNum = P0AH712_A136BarColNum[0] ;
         A213BarSit = P0AH712_A213BarSit[0] ;
         A252CliCod = P0AH712_A252CliCod[0] ;
         n252CliCod = P0AH712_n252CliCod[0] ;
         A212BarSer = P0AH712_A212BarSer[0] ;
         A1652BarSerDsc = P0AH712_A1652BarSerDsc[0] ;
         A143BarDisNum = P0AH712_A143BarDisNum[0] ;
         A1234BarNomCli = P0AH712_A1234BarNomCli[0] ;
         A135BarColNom = P0AH712_A135BarColNom[0] ;
         A14330BarPriorid = P0AH712_A14330BarPriorid[0] ;
         A1207TubNom = P0AH712_A1207TubNom[0] ;
         n1207TubNom = P0AH712_n1207TubNom[0] ;
         A12909CliImpMerm = P0AH712_A12909CliImpMerm[0] ;
         A13236CliFacMtsP = P0AH712_A13236CliFacMtsP[0] ;
         A166BarKgm = P0AH712_A166BarKgm[0] ;
         n166BarKgm = P0AH712_n166BarKgm[0] ;
         AV85Dsc_Idtx = "" ;
         AV84Cod_Idtx = GXutil.trim( A2829BarProPer) ;
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
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV43barcolnum = A136BarColNum ;
         AV48Hdr = ((GXutil.strcmp(AV89CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A129BarCod, 8, 0) : ((A132BarCodReo>0) ? GXutil.str( A129BarCod, 8, 0)+" "+GXutil.str( A132BarCodReo, 1, 0) : GXutil.str( A129BarCod, 8, 0))) ;
         AV67Barcod = A129BarCod ;
         AV68Barcodreo = A132BarCodReo ;
         AV69Barcodpar = A130BarCodPar ;
         AV49KgsE = A166BarKgm ;
         AV55KgsS = A1261BarAlbKgmE ;
         AV81baralbpie = A1265BarAlbPie ;
         AV87merma = (short)(0) ;
         AV88txtmerma = "" ;
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
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            AV87merma = (short)(DecimalUtil.decToDouble(((A166BarKgm.doubleValue()>0) ? ((AV86BarKilLan.subtract(A166BarKgm)).divide(A166BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)))) ;
            AV88txtmerma = ((AV87merma==0)||(GXutil.strcmp(A12909CliImpMerm, httpContext.getMessage( "N", ""))==0) ? " " : httpContext.getMessage( "Quebra:", "")+GXutil.trim( GXutil.str( AV87merma, 3, 0))) ;
         }
         AV60MtsS = DecimalUtil.doubleToDec(0) ;
         if ( GXutil.strcmp(A13236CliFacMtsP, httpContext.getMessage( "S", "")) == 0 )
         {
            AV60MtsS = A1263BarAlbMtrE ;
         }
         else
         {
            if ( ( A252CliCod == 310 ) || ( A252CliCod == 320 ) )
            {
               if ( ( GXutil.strcmp(A212BarSer, "20000") >= 0 ) && ( GXutil.strcmp(A212BarSer, "29999") <= 0 ) )
               {
                  AV60MtsS = A1263BarAlbMtrE ;
               }
            }
         }
         if ( A2243BarKgsCli.doubleValue() != 0 )
         {
            AV55KgsS = A2243BarKgsCli ;
         }
         AV54BarSerDsc = GXutil.substring( A1652BarSerDsc, 1, 20) ;
         AV78Bardisnum = A143BarDisNum ;
         AV79barnomcli = A1234BarNomCli ;
         AV80barcolnom = A135BarColNom ;
         hAH70( false, 17) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Bardisnum, "")), 0, Gx_line+1, 59, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Hdr, "")), 61, Gx_line+1, 142, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54BarSerDsc, "")), 144, Gx_line+1, 291, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79barnomcli, "")), 295, Gx_line+1, 391, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80barcolnom, "")), 395, Gx_line+1, 491, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43barcolnum), "ZZZZZZ")), 496, Gx_line+1, 541, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81baralbpie), "ZZZZZ9")), 545, Gx_line+1, 590, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49KgsE, "ZZZ9.99")), 592, Gx_line+1, 644, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55KgsS, "ZZZZ9.99")), 644, Gx_line+1, 703, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60MtsS, "ZZZZZZ.ZZ")), 707, Gx_line+1, 774, Gx_line+17, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV41ContLine = (byte)(AV41ContLine+1) ;
         if ( GXutil.strcmp(AV85Dsc_Idtx, " ") != 0 )
         {
            hAH70( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Dsc_Idtx, "")), 144, Gx_line+1, 291, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV41ContLine = (byte)(AV41ContLine+1) ;
         }
         AV46TotPzas = (int)(AV46TotPzas+A1265BarAlbPie) ;
         AV47TotKgs = AV47TotKgs.add(AV55KgsS) ;
         /* Using cursor P0AH713 */
         pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A1276FasMtr = P0AH713_A1276FasMtr[0] ;
            A1242GuiFasPMt = P0AH713_A1242GuiFasPMt[0] ;
            A8195GuiFasPBM = P0AH713_A8195GuiFasPBM[0] ;
            n8195GuiFasPBM = P0AH713_n8195GuiFasPBM[0] ;
            A460FasDsc = P0AH713_A460FasDsc[0] ;
            A457FasCod = P0AH713_A457FasCod[0] ;
            A1275FasKgm = P0AH713_A1275FasKgm[0] ;
            A8194GuiFasPBK = P0AH713_A8194GuiFasPBK[0] ;
            n8194GuiFasPBK = P0AH713_n8194GuiFasPBK[0] ;
            A1240GuiFasLin = P0AH713_A1240GuiFasLin[0] ;
            A460FasDsc = P0AH713_A460FasDsc[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1242GuiFasPMt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) )
            {
               AV57FasMtr = A1276FasMtr ;
               if ( A8195GuiFasPBM.doubleValue() != 0 )
               {
                  AV57FasMtr = A8195GuiFasPBM ;
               }
               hAH70( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 156, Gx_line+2, 215, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 220, Gx_line+2, 425, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57FasMtr, "ZZZZZ9.99")), 707, Gx_line+2, 774, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               AV56KgsFasS = A1275FasKgm ;
               if ( A8194GuiFasPBK.doubleValue() != 0 )
               {
                  AV56KgsFasS = A8194GuiFasPBK ;
               }
               hAH70( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 220, Gx_line+1, 425, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56KgsFasS, "ZZZZZ9.99")), 638, Gx_line+0, 705, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 156, Gx_line+1, 215, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            AV41ContLine = (byte)(AV41ContLine+1) ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         if ( ! (0==A1206TubCod) )
         {
            hAH70( false, 18) ;
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
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV66Lotes, " ") != 0 )
         {
            AV70Vlote = httpContext.getMessage( "Lote : ", "") + GXutil.trim( AV66Lotes) ;
            hAH70( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Vlote, "")), 61, Gx_line+0, 281, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fio:", ""), 288, Gx_line+0, 318, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Fio5, "")), 321, Gx_line+0, 358, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Jogo:", ""), 367, Gx_line+0, 404, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Jogo3, "")), 404, Gx_line+0, 427, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pol:", ""), 433, Gx_line+0, 463, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72Pgadas), "ZZZZZZ")), 464, Gx_line+0, 509, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LFA:", ""), 511, Gx_line+0, 541, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 591, Gx_line+0, 621, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Maq6, "")), 621, Gx_line+0, 666, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76Lfa, "ZZZ.ZZ")), 540, Gx_line+0, 585, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88txtmerma, "")), 671, Gx_line+0, 774, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         if ( A14330BarPriorid == 1 )
         {
            if ( (0==AV107flax2) )
            {
               hAH70( false, 17) ;
               getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EUROPEAN FLAX® certified – certificate nº BVFR7338110", ""), 154, Gx_line+1, 488, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               hAH70( false, 22) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "efb75222-fef4-40ba-b66f-a0dbfd02f4ba", "", context.getHttpContext().getTheme( )), 154, Gx_line+1, 564, Gx_line+20) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
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
      AV66Lotes = "" ;
      AV71LoteLast = " " ;
      AV72Pgadas = 0 ;
      AV73Jogo3 = " " ;
      AV74Fio5 = " " ;
      AV75Maq6 = " " ;
      AV76Lfa = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AH714 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV67Barcod), Byte.valueOf(AV68Barcodreo), AV69Barcodpar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A44AlbRecCod = P0AH714_A44AlbRecCod[0] ;
         A130BarCodPar = P0AH714_A130BarCodPar[0] ;
         A132BarCodReo = P0AH714_A132BarCodReo[0] ;
         A129BarCod = P0AH714_A129BarCod[0] ;
         A6463AlbRLote = P0AH714_A6463AlbRLote[0] ;
         A6465AlbRLu = P0AH714_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0AH714_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0AH714_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AH714_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AH714_A6470AlbRTara[0] ;
         A200BarPieCod = P0AH714_A200BarPieCod[0] ;
         A6463AlbRLote = P0AH714_A6463AlbRLote[0] ;
         A6465AlbRLu = P0AH714_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0AH714_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0AH714_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AH714_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AH714_A6470AlbRTara[0] ;
         if ( GXutil.strcmp(AV66Lotes, " ") == 0 )
         {
            AV66Lotes = GXutil.trim( A6463AlbRLote) ;
         }
         else
         {
            if ( GXutil.strcmp(A6463AlbRLote, AV71LoteLast) != 0 )
            {
               AV66Lotes += " / " + GXutil.trim( A6463AlbRLote) ;
            }
         }
         AV71LoteLast = A6463AlbRLote ;
         AV72Pgadas = (int)(DecimalUtil.decToDouble(A6465AlbRLu)) ;
         AV73Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
         AV74Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
         AV75Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
         AV76Lfa = A6470AlbRTara ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV10CliNom = "" ;
      AV11CliDom = "" ;
      AV12Clicp = "" ;
      AV13CliPob = "" ;
      AV40CliNif = "" ;
      AV16CliENom = "" ;
      AV17CliEDom = "" ;
      AV18CliEcp = "" ;
      AV19CliEPob = "" ;
      AV89CliImpReop = httpContext.getMessage( "N", "") ;
      /* Using cursor P0AH715 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A252CliCod = P0AH715_A252CliCod[0] ;
         n252CliCod = P0AH715_n252CliCod[0] ;
         A279CliNom = P0AH715_A279CliNom[0] ;
         A260CliDom = P0AH715_A260CliDom[0] ;
         A256CliCp = P0AH715_A256CliCp[0] ;
         A295CliPob = P0AH715_A295CliPob[0] ;
         A278CliNif = P0AH715_A278CliNif[0] ;
         A13012CliImpReop = P0AH715_A13012CliImpReop[0] ;
         AV10CliNom = A279CliNom ;
         AV11CliDom = A260CliDom ;
         AV12Clicp = A256CliCp ;
         AV13CliPob = A295CliPob ;
         AV40CliNif = A278CliNif ;
         AV89CliImpReop = A13012CliImpReop ;
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
      AV82CliEcp12 = " " ;
      AV17CliEDom = httpContext.getMessage( "V/ Instalaçoes", "") ;
      AV18CliEcp = " " ;
      AV19CliEPob = " " ;
      /* Using cursor P0AH716 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), Byte.valueOf(AV15CliEnvDom)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A266CliEnvLin = P0AH716_A266CliEnvLin[0] ;
         A252CliCod = P0AH716_A252CliCod[0] ;
         n252CliCod = P0AH716_n252CliCod[0] ;
         A267CliEnvNom = P0AH716_A267CliEnvNom[0] ;
         A265CliEnvDom = P0AH716_A265CliEnvDom[0] ;
         A264CliEnvCp = P0AH716_A264CliEnvCp[0] ;
         A10775CliEnvCp2 = P0AH716_A10775CliEnvCp2[0] ;
         A268CliEnvPob = P0AH716_A268CliEnvPob[0] ;
         AV16CliENom = A267CliEnvNom ;
         AV17CliEDom = A265CliEnvDom ;
         AV18CliEcp = A264CliEnvCp ;
         AV83CliEcp2 = GXutil.trim( A10775CliEnvCp2) ;
         AV19CliEPob = A268CliEnvPob ;
         AV82CliEcp12 = GXutil.trim( A264CliEnvCp) ;
         AV82CliEcp12 += ((GXutil.strcmp(A10775CliEnvCp2, " ")!=0) ? "-"+GXutil.trim( AV83CliEcp2) : "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S1511( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      AV85Dsc_Idtx = "" ;
      /* Using cursor P0AH717 */
      pr_default.execute(13, new Object[] {A396EmprCod, AV84Cod_Idtx});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A10887Cod_Idtx = P0AH717_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0AH717_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0AH717_n10888Dsc_Idtx[0] ;
         A12703Imp_Idtx = P0AH717_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P0AH717_n12703Imp_Idtx[0] ;
         AV85Dsc_Idtx = ((GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", ""))==0) ? GXutil.trim( A10888Dsc_Idtx) : " ") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S1611( ) throws ProcessInterruptedException
   {
      /* 'MERMA' Routine */
      returnInSub = false ;
      AV86BarKilLan = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P0AH718 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV67Barcod), Byte.valueOf(AV68Barcodreo), AV69Barcodpar});
      c170BarKilLan = P0AH718_A170BarKilLan[0] ;
      pr_default.close(14);
      AV86BarKilLan = AV86BarKilLan.add(c170BarKilLan) ;
      /* End optimized group. */
   }

   public void hAH70( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçôes:", ""), 58, Gx_line+2, 141, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52vObs[1-1], "")), 150, Gx_line+2, 516, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52vObs[2-1], "")), 150, Gx_line+18, 516, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nota: Eventuais reclamações apenas serão consideradas no prazo de 8 dias, não se aceitando devoluções de malha cortada ou manufacturada.", ""), 13, Gx_line+81, 772, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(3, Gx_line+109, 775, Gx_line+109, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52vObs[3-1], "")), 150, Gx_line+33, 516, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52vObs[4-1], "")), 150, Gx_line+49, 516, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53ContDsc, "")), 688, Gx_line+68, 772, Gx_line+82, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Texto_1, "")), 56, Gx_line+111, 724, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Texto_2, "")), 77, Gx_line+130, 703, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Texto_fd, "")), 13, Gx_line+68, 243, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65AtId, "")), 415, Gx_line+68, 541, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110textoNOAT, "")), 246, Gx_line+96, 476, Gx_line+110, 0+256, 0, 0, 0) ;
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
               AV109RutaImagenMarcaAgua = "" ;
               AV110textoNOAT = "" ;
               if ( (GXutil.strcmp("", A7101AlbLic)==0) )
               {
                  AV110textoNOAT = httpContext.getMessage( "Este documento não serve como documento de transporte", "") ;
               }
               if ( (GXutil.strcmp("", A10017AlbFmd)==0) )
               {
                  AV108MarcaAguaImagen = context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )) ;
                  AV124Marcaaguaimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
                  sImgUrl = ((GXutil.strcmp("", AV108MarcaAguaImagen)==0) ? AV124Marcaaguaimagen_GXI : AV108MarcaAguaImagen) ;
                  getPrinter().GxDrawBitMap(sImgUrl, 14, Gx_line+1, 815, Gx_line+1052) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1055) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               else
               {
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1052) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10CliNom, "")), 457, Gx_line+190, 646, Gx_line+208, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11CliDom, "")), 457, Gx_line+209, 671, Gx_line+227, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS.", ""), 99, Gx_line+376, 121, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 172, Gx_line+376, 266, Gx_line+392, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 552, Gx_line+376, 589, Gx_line+392, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 633, Gx_line+369, 672, Gx_line+385, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13CliPob, "")), 457, Gx_line+242, 646, Gx_line+260, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(0, Gx_line+277, 775, Gx_line+362, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(0, Gx_line+367, 775, Gx_line+401, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TextoCopia, "")), 679, Gx_line+149, 774, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 25, Gx_line+281, 86, Gx_line+297, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 25, Gx_line+299, 117, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 25, Gx_line+317, 126, Gx_line+333, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 25, Gx_line+333, 95, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Contibuinte:", ""), 450, Gx_line+281, 533, Gx_line+297, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 421, Gx_line+299, 533, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 478, Gx_line+333, 533, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Cor", ""), 423, Gx_line+376, 457, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(145, Gx_line+368, 145, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(292, Gx_line+367, 292, Gx_line+400, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 498, Gx_line+376, 539, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(544, Gx_line+368, 544, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(493, Gx_line+367, 493, Gx_line+400, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 125, Gx_line+281, 170, Gx_line+298, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 125, Gx_line+317, 176, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 125, Gx_line+299, 208, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40CliNif, "@!")), 538, Gx_line+281, 643, Gx_line+298, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 679, Gx_line+123, 774, Gx_line+144, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Encom.", ""), 5, Gx_line+376, 60, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(61, Gx_line+368, 61, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3868AlbMat, "")), 538, Gx_line+333, 643, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), 223, Gx_line+333, 316, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+368, 592, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 599, Gx_line+385, 652, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 661, Gx_line+385, 703, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+384, 775, Gx_line+384, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(654, Gx_line+384, 654, Gx_line+400, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50VDoc, "")), 457, Gx_line+123, 625, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Cor", ""), 336, Gx_line+376, 368, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(393, Gx_line+368, 393, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(433, Gx_line+179, 775, Gx_line+269, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 0, Gx_line+4, 775, Gx_line+90) ;
               getPrinter().GxDrawLine(704, Gx_line+368, 704, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 713, Gx_line+369, 753, Gx_line+385, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 711, Gx_line+385, 753, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "20d61268-15be-4900-a597-cdd98f06ade9", "", context.getHttpContext().getTheme( )), 4, Gx_line+240, 429, Gx_line+276) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A4023AlbFecSal, "99/99/99"), 125, Gx_line+333, 176, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 188, Gx_line+333, 220, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TxtAnulado, "")), 9, Gx_line+202, 281, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82CliEcp12, "")), 538, Gx_line+317, 591, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19CliEPob, "")), 610, Gx_line+317, 767, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17CliEDom, "")), 538, Gx_line+299, 716, Gx_line+316, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV94Imagen)==0) ? AV121Imagen_GXI : AV94Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 290, Gx_line+110, 415, Gx_line+235) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106atcud, "")), 274, Gx_line+93, 431, Gx_line+110, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+401) ;
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
      add_metrics5( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "paguagrmoda");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "paguagrmoda");
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
      AV44TextoCopia = "" ;
      AV53ContDsc = "" ;
      AV62Firmad = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P0AH72_A396EmprCod = new String[] {""} ;
      P0AH72_A8335EmpItm2 = new String[] {""} ;
      P0AH72_n8335EmpItm2 = new boolean[] {false} ;
      P0AH72_A8334EmpItm1 = new String[] {""} ;
      P0AH72_n8334EmpItm1 = new boolean[] {false} ;
      P0AH72_A8337EmpItm4 = new String[] {""} ;
      P0AH72_n8337EmpItm4 = new boolean[] {false} ;
      P0AH72_A8336EmpItm3 = new String[] {""} ;
      P0AH72_n8336EmpItm3 = new boolean[] {false} ;
      P0AH72_A395EmprCif = new String[] {""} ;
      P0AH72_n395EmprCif = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV58Texto_1 = "" ;
      AV59Texto_2 = "" ;
      AV92EmprCif = "" ;
      P0AH73_A396EmprCod = new String[] {""} ;
      P0AH73_A30AlbProCod = new long[1] ;
      P0AH73_A14069AlbPdATCUD = new String[] {""} ;
      P0AH73_A1259AlbDomEnv = new byte[1] ;
      P0AH73_n1259AlbDomEnv = new boolean[] {false} ;
      P0AH73_A39AlbProPri = new String[] {""} ;
      P0AH73_A407EmprNom = new String[] {""} ;
      P0AH73_n407EmprNom = new boolean[] {false} ;
      P0AH73_A5140AlbMarca = new String[] {""} ;
      P0AH73_A1879AlbProEnt = new String[] {""} ;
      P0AH73_n1879AlbProEnt = new boolean[] {false} ;
      P0AH73_A33AlbProEst = new byte[1] ;
      P0AH73_A1782AlbProEso = new byte[1] ;
      P0AH73_A7101AlbLic = new String[] {""} ;
      P0AH73_A10017AlbFmd = new String[] {""} ;
      P0AH73_n10017AlbFmd = new boolean[] {false} ;
      P0AH73_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AH73_A3865AlbHorSal = new String[] {""} ;
      P0AH73_A3868AlbMat = new String[] {""} ;
      P0AH73_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AH73_A1243GuiRemCli = new int[1] ;
      A14069AlbPdATCUD = "" ;
      A39AlbProPri = "" ;
      A407EmprNom = "" ;
      A5140AlbMarca = "" ;
      A1879AlbProEnt = "" ;
      A7101AlbLic = "" ;
      A10017AlbFmd = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV105codValidacaoSerie = "" ;
      AV106atcud = "" ;
      AV22Prioridad = "" ;
      AV61Texto_fd = "" ;
      AV64Firma4dig = "" ;
      AV65AtId = "" ;
      AV91TextoGenerar = "" ;
      AV40CliNif = "" ;
      AV114Centimetos = DecimalUtil.ZERO ;
      AV116Url = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV94Imagen = "" ;
      AV121Imagen_GXI = "" ;
      AV14EmprNom = "" ;
      AV50VDoc = "" ;
      AV39vCopia = "" ;
      AV52vObs = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV52vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AH74_A396EmprCod = new String[] {""} ;
      P0AH74_A30AlbProCod = new long[1] ;
      P0AH74_A916AlbPObs = new String[] {""} ;
      P0AH74_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      P0AH75_A396EmprCod = new String[] {""} ;
      P0AH75_A30AlbProCod = new long[1] ;
      P0AH75_A12184DltObs = new String[] {""} ;
      P0AH75_n12184DltObs = new boolean[] {false} ;
      P0AH75_A12185DltLinObs = new byte[1] ;
      A12184DltObs = "" ;
      AV77TxtAnulado = "" ;
      AV45Matricula = "" ;
      AV47TotKgs = DecimalUtil.ZERO ;
      P0AH77_A396EmprCod = new String[] {""} ;
      P0AH77_A12178DltP = new String[] {""} ;
      P0AH77_A12177DltR = new byte[1] ;
      P0AH77_A12176DltHdr = new int[1] ;
      P0AH77_A30AlbProCod = new long[1] ;
      P0AH77_A12153DltColNum = new int[1] ;
      P0AH77_n12153DltColNum = new boolean[] {false} ;
      P0AH77_A12145DltKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH77_n12145DltKgs = new boolean[] {false} ;
      P0AH77_A12147DltPzs = new int[1] ;
      P0AH77_n12147DltPzs = new boolean[] {false} ;
      P0AH77_A12150DltArtCod = new String[] {""} ;
      P0AH77_n12150DltArtCod = new boolean[] {false} ;
      P0AH77_A12186DltKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH77_n12186DltKgsCli = new boolean[] {false} ;
      P0AH77_A12151DltArtDsc = new String[] {""} ;
      P0AH77_n12151DltArtDsc = new boolean[] {false} ;
      P0AH77_A12187DltTubo = new short[1] ;
      P0AH77_n12187DltTubo = new boolean[] {false} ;
      P0AH77_A12149DltTubos = new int[1] ;
      P0AH77_n12149DltTubos = new boolean[] {false} ;
      P0AH77_A12188DltTuboN = new String[] {""} ;
      P0AH77_n12188DltTuboN = new boolean[] {false} ;
      A12178DltP = "" ;
      A12145DltKgs = DecimalUtil.ZERO ;
      A12150DltArtCod = "" ;
      A12186DltKgsCli = DecimalUtil.ZERO ;
      A12151DltArtDsc = "" ;
      A12188DltTuboN = "" ;
      AV48Hdr = "" ;
      AV89CliImpReop = "" ;
      AV69Barcodpar = "" ;
      AV49KgsE = DecimalUtil.ZERO ;
      AV112BarKgm = DecimalUtil.ZERO ;
      AV55KgsS = DecimalUtil.ZERO ;
      AV60MtsS = DecimalUtil.ZERO ;
      AV54BarSerDsc = "" ;
      AV78Bardisnum = "" ;
      AV79barnomcli = "" ;
      AV80barcolnom = "" ;
      P0AH78_A396EmprCod = new String[] {""} ;
      P0AH78_A30AlbProCod = new long[1] ;
      P0AH78_A12176DltHdr = new int[1] ;
      P0AH78_A12177DltR = new byte[1] ;
      P0AH78_A12178DltP = new String[] {""} ;
      P0AH78_A12175DltMtsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH78_n12175DltMtsFs = new boolean[] {false} ;
      P0AH78_A12190DltPrMFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH78_n12190DltPrMFs = new boolean[] {false} ;
      P0AH78_A12192DltPrMBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH78_n12192DltPrMBFs = new boolean[] {false} ;
      P0AH78_A12173DltFasDsc = new String[] {""} ;
      P0AH78_n12173DltFasDsc = new boolean[] {false} ;
      P0AH78_A12172DltFascod = new String[] {""} ;
      P0AH78_n12172DltFascod = new boolean[] {false} ;
      P0AH78_A12174DltKgsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH78_n12174DltKgsFs = new boolean[] {false} ;
      P0AH78_A12191DltPrKBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH78_n12191DltPrKBFs = new boolean[] {false} ;
      P0AH78_A12182DltLin = new short[1] ;
      A12175DltMtsFs = DecimalUtil.ZERO ;
      A12190DltPrMFs = DecimalUtil.ZERO ;
      A12192DltPrMBFs = DecimalUtil.ZERO ;
      A12173DltFasDsc = "" ;
      A12172DltFascod = "" ;
      A12174DltKgsFs = DecimalUtil.ZERO ;
      A12191DltPrKBFs = DecimalUtil.ZERO ;
      AV57FasMtr = DecimalUtil.ZERO ;
      AV56KgsFasS = DecimalUtil.ZERO ;
      AV66Lotes = "" ;
      AV70Vlote = "" ;
      AV74Fio5 = "" ;
      AV73Jogo3 = "" ;
      AV75Maq6 = "" ;
      AV76Lfa = DecimalUtil.ZERO ;
      AV88txtmerma = "" ;
      P0AH710_A396EmprCod = new String[] {""} ;
      P0AH710_A130BarCodPar = new String[] {""} ;
      P0AH710_A132BarCodReo = new byte[1] ;
      P0AH710_A129BarCod = new int[1] ;
      P0AH710_A252CliCod = new int[1] ;
      P0AH710_n252CliCod = new boolean[] {false} ;
      P0AH710_A143BarDisNum = new String[] {""} ;
      P0AH710_A1234BarNomCli = new String[] {""} ;
      P0AH710_A135BarColNom = new String[] {""} ;
      P0AH710_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH710_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      P0AH712_A396EmprCod = new String[] {""} ;
      P0AH712_A130BarCodPar = new String[] {""} ;
      P0AH712_A132BarCodReo = new byte[1] ;
      P0AH712_A129BarCod = new int[1] ;
      P0AH712_A30AlbProCod = new long[1] ;
      P0AH712_A2829BarProPer = new String[] {""} ;
      P0AH712_A136BarColNum = new int[1] ;
      P0AH712_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH712_A1265BarAlbPie = new int[1] ;
      P0AH712_A213BarSit = new byte[1] ;
      P0AH712_A12909CliImpMerm = new String[] {""} ;
      P0AH712_A13236CliFacMtsP = new String[] {""} ;
      P0AH712_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH712_A252CliCod = new int[1] ;
      P0AH712_n252CliCod = new boolean[] {false} ;
      P0AH712_A212BarSer = new String[] {""} ;
      P0AH712_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH712_n2243BarKgsCli = new boolean[] {false} ;
      P0AH712_A1652BarSerDsc = new String[] {""} ;
      P0AH712_A143BarDisNum = new String[] {""} ;
      P0AH712_A1234BarNomCli = new String[] {""} ;
      P0AH712_A135BarColNom = new String[] {""} ;
      P0AH712_A1206TubCod = new short[1] ;
      P0AH712_n1206TubCod = new boolean[] {false} ;
      P0AH712_A1266BarAlbTub = new int[1] ;
      P0AH712_A1207TubNom = new String[] {""} ;
      P0AH712_n1207TubNom = new boolean[] {false} ;
      P0AH712_A14330BarPriorid = new byte[1] ;
      P0AH712_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH712_n166BarKgm = new boolean[] {false} ;
      A2829BarProPer = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A12909CliImpMerm = "" ;
      A13236CliFacMtsP = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A1207TubNom = "" ;
      AV85Dsc_Idtx = "" ;
      AV84Cod_Idtx = "" ;
      AV86BarKilLan = DecimalUtil.ZERO ;
      P0AH713_A396EmprCod = new String[] {""} ;
      P0AH713_A30AlbProCod = new long[1] ;
      P0AH713_A129BarCod = new int[1] ;
      P0AH713_A132BarCodReo = new byte[1] ;
      P0AH713_A130BarCodPar = new String[] {""} ;
      P0AH713_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH713_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH713_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH713_n8195GuiFasPBM = new boolean[] {false} ;
      P0AH713_A460FasDsc = new String[] {""} ;
      P0AH713_A457FasCod = new String[] {""} ;
      P0AH713_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH713_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH713_n8194GuiFasPBK = new boolean[] {false} ;
      P0AH713_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      AV71LoteLast = "" ;
      P0AH714_A44AlbRecCod = new int[1] ;
      P0AH714_A396EmprCod = new String[] {""} ;
      P0AH714_A130BarCodPar = new String[] {""} ;
      P0AH714_A132BarCodReo = new byte[1] ;
      P0AH714_A129BarCod = new int[1] ;
      P0AH714_A6463AlbRLote = new String[] {""} ;
      P0AH714_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH714_A4602AlbRMdlCod = new String[] {""} ;
      P0AH714_A6464AlbRTelar = new String[] {""} ;
      P0AH714_A8035AlbMaqTej = new String[] {""} ;
      P0AH714_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AH714_A200BarPieCod = new String[] {""} ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV10CliNom = "" ;
      AV11CliDom = "" ;
      AV12Clicp = "" ;
      AV13CliPob = "" ;
      AV16CliENom = "" ;
      AV17CliEDom = "" ;
      AV18CliEcp = "" ;
      AV19CliEPob = "" ;
      P0AH715_A396EmprCod = new String[] {""} ;
      P0AH715_A252CliCod = new int[1] ;
      P0AH715_n252CliCod = new boolean[] {false} ;
      P0AH715_A279CliNom = new String[] {""} ;
      P0AH715_A260CliDom = new String[] {""} ;
      P0AH715_A256CliCp = new String[] {""} ;
      P0AH715_A295CliPob = new String[] {""} ;
      P0AH715_A278CliNif = new String[] {""} ;
      P0AH715_A13012CliImpReop = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A13012CliImpReop = "" ;
      AV82CliEcp12 = "" ;
      P0AH716_A396EmprCod = new String[] {""} ;
      P0AH716_A266CliEnvLin = new byte[1] ;
      P0AH716_A252CliCod = new int[1] ;
      P0AH716_n252CliCod = new boolean[] {false} ;
      P0AH716_A267CliEnvNom = new String[] {""} ;
      P0AH716_A265CliEnvDom = new String[] {""} ;
      P0AH716_A264CliEnvCp = new String[] {""} ;
      P0AH716_A10775CliEnvCp2 = new String[] {""} ;
      P0AH716_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A268CliEnvPob = "" ;
      AV83CliEcp2 = "" ;
      P0AH717_A396EmprCod = new String[] {""} ;
      P0AH717_A10887Cod_Idtx = new String[] {""} ;
      P0AH717_A10888Dsc_Idtx = new String[] {""} ;
      P0AH717_n10888Dsc_Idtx = new boolean[] {false} ;
      P0AH717_A12703Imp_Idtx = new String[] {""} ;
      P0AH717_n12703Imp_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      A12703Imp_Idtx = "" ;
      c170BarKilLan = DecimalUtil.ZERO ;
      P0AH718_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV110textoNOAT = "" ;
      AV109RutaImagenMarcaAgua = "" ;
      AV108MarcaAguaImagen = "" ;
      AV124Marcaaguaimagen_GXI = "" ;
      AV108MarcaAguaImagen = "" ;
      sImgUrl = "" ;
      AV94Imagen = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paguagrmoda__default(),
         new Object[] {
             new Object[] {
            P0AH72_A396EmprCod, P0AH72_A8335EmpItm2, P0AH72_n8335EmpItm2, P0AH72_A8334EmpItm1, P0AH72_n8334EmpItm1, P0AH72_A8337EmpItm4, P0AH72_n8337EmpItm4, P0AH72_A8336EmpItm3, P0AH72_n8336EmpItm3, P0AH72_A395EmprCif,
            P0AH72_n395EmprCif
            }
            , new Object[] {
            P0AH73_A396EmprCod, P0AH73_A30AlbProCod, P0AH73_A14069AlbPdATCUD, P0AH73_A1259AlbDomEnv, P0AH73_n1259AlbDomEnv, P0AH73_A39AlbProPri, P0AH73_A407EmprNom, P0AH73_n407EmprNom, P0AH73_A5140AlbMarca, P0AH73_A1879AlbProEnt,
            P0AH73_n1879AlbProEnt, P0AH73_A33AlbProEst, P0AH73_A1782AlbProEso, P0AH73_A7101AlbLic, P0AH73_A10017AlbFmd, P0AH73_n10017AlbFmd, P0AH73_A4023AlbFecSal, P0AH73_A3865AlbHorSal, P0AH73_A3868AlbMat, P0AH73_A34AlbProfch,
            P0AH73_A1243GuiRemCli
            }
            , new Object[] {
            P0AH74_A396EmprCod, P0AH74_A30AlbProCod, P0AH74_A916AlbPObs, P0AH74_A915AlbPObsLin
            }
            , new Object[] {
            P0AH75_A396EmprCod, P0AH75_A30AlbProCod, P0AH75_A12184DltObs, P0AH75_n12184DltObs, P0AH75_A12185DltLinObs
            }
            , new Object[] {
            }
            , new Object[] {
            P0AH77_A396EmprCod, P0AH77_A12178DltP, P0AH77_A12177DltR, P0AH77_A12176DltHdr, P0AH77_A30AlbProCod, P0AH77_A12153DltColNum, P0AH77_n12153DltColNum, P0AH77_A12145DltKgs, P0AH77_n12145DltKgs, P0AH77_A12147DltPzs,
            P0AH77_n12147DltPzs, P0AH77_A12150DltArtCod, P0AH77_n12150DltArtCod, P0AH77_A12186DltKgsCli, P0AH77_n12186DltKgsCli, P0AH77_A12151DltArtDsc, P0AH77_n12151DltArtDsc, P0AH77_A12187DltTubo, P0AH77_n12187DltTubo, P0AH77_A12149DltTubos,
            P0AH77_n12149DltTubos, P0AH77_A12188DltTuboN, P0AH77_n12188DltTuboN
            }
            , new Object[] {
            P0AH78_A396EmprCod, P0AH78_A30AlbProCod, P0AH78_A12176DltHdr, P0AH78_A12177DltR, P0AH78_A12178DltP, P0AH78_A12175DltMtsFs, P0AH78_n12175DltMtsFs, P0AH78_A12190DltPrMFs, P0AH78_n12190DltPrMFs, P0AH78_A12192DltPrMBFs,
            P0AH78_n12192DltPrMBFs, P0AH78_A12173DltFasDsc, P0AH78_n12173DltFasDsc, P0AH78_A12172DltFascod, P0AH78_n12172DltFascod, P0AH78_A12174DltKgsFs, P0AH78_n12174DltKgsFs, P0AH78_A12191DltPrKBFs, P0AH78_n12191DltPrKBFs, P0AH78_A12182DltLin
            }
            , new Object[] {
            P0AH710_A396EmprCod, P0AH710_A130BarCodPar, P0AH710_A132BarCodReo, P0AH710_A129BarCod, P0AH710_A252CliCod, P0AH710_n252CliCod, P0AH710_A143BarDisNum, P0AH710_A1234BarNomCli, P0AH710_A135BarColNom, P0AH710_A166BarKgm,
            P0AH710_n166BarKgm
            }
            , new Object[] {
            P0AH712_A396EmprCod, P0AH712_A130BarCodPar, P0AH712_A132BarCodReo, P0AH712_A129BarCod, P0AH712_A30AlbProCod, P0AH712_A2829BarProPer, P0AH712_A136BarColNum, P0AH712_A1261BarAlbKgmE, P0AH712_A1265BarAlbPie, P0AH712_A213BarSit,
            P0AH712_A12909CliImpMerm, P0AH712_A13236CliFacMtsP, P0AH712_A1263BarAlbMtrE, P0AH712_A252CliCod, P0AH712_n252CliCod, P0AH712_A212BarSer, P0AH712_A2243BarKgsCli, P0AH712_n2243BarKgsCli, P0AH712_A1652BarSerDsc, P0AH712_A143BarDisNum,
            P0AH712_A1234BarNomCli, P0AH712_A135BarColNom, P0AH712_A1206TubCod, P0AH712_n1206TubCod, P0AH712_A1266BarAlbTub, P0AH712_A1207TubNom, P0AH712_n1207TubNom, P0AH712_A14330BarPriorid, P0AH712_A166BarKgm, P0AH712_n166BarKgm
            }
            , new Object[] {
            P0AH713_A396EmprCod, P0AH713_A30AlbProCod, P0AH713_A129BarCod, P0AH713_A132BarCodReo, P0AH713_A130BarCodPar, P0AH713_A1276FasMtr, P0AH713_A1242GuiFasPMt, P0AH713_A8195GuiFasPBM, P0AH713_n8195GuiFasPBM, P0AH713_A460FasDsc,
            P0AH713_A457FasCod, P0AH713_A1275FasKgm, P0AH713_A8194GuiFasPBK, P0AH713_n8194GuiFasPBK, P0AH713_A1240GuiFasLin
            }
            , new Object[] {
            P0AH714_A44AlbRecCod, P0AH714_A396EmprCod, P0AH714_A130BarCodPar, P0AH714_A132BarCodReo, P0AH714_A129BarCod, P0AH714_A6463AlbRLote, P0AH714_A6465AlbRLu, P0AH714_A4602AlbRMdlCod, P0AH714_A6464AlbRTelar, P0AH714_A8035AlbMaqTej,
            P0AH714_A6470AlbRTara, P0AH714_A200BarPieCod
            }
            , new Object[] {
            P0AH715_A396EmprCod, P0AH715_A252CliCod, P0AH715_A279CliNom, P0AH715_A260CliDom, P0AH715_A256CliCp, P0AH715_A295CliPob, P0AH715_A278CliNif, P0AH715_A13012CliImpReop
            }
            , new Object[] {
            P0AH716_A396EmprCod, P0AH716_A266CliEnvLin, P0AH716_A252CliCod, P0AH716_A267CliEnvNom, P0AH716_A265CliEnvDom, P0AH716_A264CliEnvCp, P0AH716_A10775CliEnvCp2, P0AH716_A268CliEnvPob
            }
            , new Object[] {
            P0AH717_A396EmprCod, P0AH717_A10887Cod_Idtx, P0AH717_A10888Dsc_Idtx, P0AH717_n10888Dsc_Idtx, P0AH717_A12703Imp_Idtx, P0AH717_n12703Imp_Idtx
            }
            , new Object[] {
            P0AH718_A170BarKilLan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV90existefirmad ;
   private byte AV97PQrcode ;
   private byte AV107flax2 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte AV15CliEnvDom ;
   private byte AV95mes ;
   private byte AV96dia ;
   private byte AV42Copias ;
   private byte AV51i ;
   private byte A915AlbPObsLin ;
   private byte A12185DltLinObs ;
   private byte AV41ContLine ;
   private byte A12177DltR ;
   private byte AV68Barcodreo ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A14330BarPriorid ;
   private byte A266CliEnvLin ;
   private short gxcookieaux ;
   private short AV93anyo ;
   private short AV113Dpi ;
   private short AV115Pixel ;
   private short A12187DltTubo ;
   private short A12182DltLin ;
   private short A1206TubCod ;
   private short AV87merma ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV9CliCod ;
   private int GX_I ;
   private int AV46TotPzas ;
   private int Gx_OldLine ;
   private int A12176DltHdr ;
   private int A12153DltColNum ;
   private int A12147DltPzs ;
   private int A12149DltTubos ;
   private int AV43barcolnum ;
   private int AV67Barcod ;
   private int AV81baralbpie ;
   private int AV72Pgadas ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int A44AlbRecCod ;
   private long A30AlbProCod ;
   private long AV111Albprocod ;
   private java.math.BigDecimal AV114Centimetos ;
   private java.math.BigDecimal AV47TotKgs ;
   private java.math.BigDecimal A12145DltKgs ;
   private java.math.BigDecimal A12186DltKgsCli ;
   private java.math.BigDecimal AV49KgsE ;
   private java.math.BigDecimal AV112BarKgm ;
   private java.math.BigDecimal AV55KgsS ;
   private java.math.BigDecimal AV60MtsS ;
   private java.math.BigDecimal A12175DltMtsFs ;
   private java.math.BigDecimal A12190DltPrMFs ;
   private java.math.BigDecimal A12192DltPrMBFs ;
   private java.math.BigDecimal A12174DltKgsFs ;
   private java.math.BigDecimal A12191DltPrKBFs ;
   private java.math.BigDecimal AV57FasMtr ;
   private java.math.BigDecimal AV56KgsFasS ;
   private java.math.BigDecimal AV76Lfa ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal AV86BarKilLan ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal c170BarKilLan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV44TextoCopia ;
   private String AV53ContDsc ;
   private String AV62Firmad ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV58Texto_1 ;
   private String AV59Texto_2 ;
   private String AV92EmprCif ;
   private String A14069AlbPdATCUD ;
   private String A39AlbProPri ;
   private String A407EmprNom ;
   private String A5140AlbMarca ;
   private String A1879AlbProEnt ;
   private String A7101AlbLic ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String AV105codValidacaoSerie ;
   private String AV106atcud ;
   private String AV22Prioridad ;
   private String AV61Texto_fd ;
   private String AV64Firma4dig ;
   private String AV65AtId ;
   private String AV40CliNif ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV14EmprNom ;
   private String AV50VDoc ;
   private String AV39vCopia ;
   private String AV52vObs[] ;
   private String A916AlbPObs ;
   private String A12184DltObs ;
   private String AV77TxtAnulado ;
   private String AV45Matricula ;
   private String A12178DltP ;
   private String A12150DltArtCod ;
   private String A12151DltArtDsc ;
   private String A12188DltTuboN ;
   private String AV48Hdr ;
   private String AV89CliImpReop ;
   private String AV69Barcodpar ;
   private String AV54BarSerDsc ;
   private String AV78Bardisnum ;
   private String AV79barnomcli ;
   private String AV80barcolnom ;
   private String A12173DltFasDsc ;
   private String A12172DltFascod ;
   private String AV66Lotes ;
   private String AV70Vlote ;
   private String AV74Fio5 ;
   private String AV73Jogo3 ;
   private String AV75Maq6 ;
   private String AV88txtmerma ;
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
   private String AV85Dsc_Idtx ;
   private String AV84Cod_Idtx ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV71LoteLast ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String A200BarPieCod ;
   private String AV10CliNom ;
   private String AV11CliDom ;
   private String AV12Clicp ;
   private String AV13CliPob ;
   private String AV16CliENom ;
   private String AV17CliEDom ;
   private String AV18CliEcp ;
   private String AV19CliEPob ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A13012CliImpReop ;
   private String AV82CliEcp12 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A10775CliEnvCp2 ;
   private String A268CliEnvPob ;
   private String AV83CliEcp2 ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A12703Imp_Idtx ;
   private String AV110textoNOAT ;
   private String sImgUrl ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date A34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean GxHdr3 ;
   private boolean n1259AlbDomEnv ;
   private boolean n407EmprNom ;
   private boolean n1879AlbProEnt ;
   private boolean n10017AlbFmd ;
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
   private String AV91TextoGenerar ;
   private String AV116Url ;
   private String AV121Imagen_GXI ;
   private String AV109RutaImagenMarcaAgua ;
   private String AV124Marcaaguaimagen_GXI ;
   private String AV94Imagen ;
   private String AV108MarcaAguaImagen ;
   private String Marcaaguaimagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P0AH72_A396EmprCod ;
   private String[] P0AH72_A8335EmpItm2 ;
   private boolean[] P0AH72_n8335EmpItm2 ;
   private String[] P0AH72_A8334EmpItm1 ;
   private boolean[] P0AH72_n8334EmpItm1 ;
   private String[] P0AH72_A8337EmpItm4 ;
   private boolean[] P0AH72_n8337EmpItm4 ;
   private String[] P0AH72_A8336EmpItm3 ;
   private boolean[] P0AH72_n8336EmpItm3 ;
   private String[] P0AH72_A395EmprCif ;
   private boolean[] P0AH72_n395EmprCif ;
   private String[] P0AH73_A396EmprCod ;
   private long[] P0AH73_A30AlbProCod ;
   private String[] P0AH73_A14069AlbPdATCUD ;
   private byte[] P0AH73_A1259AlbDomEnv ;
   private boolean[] P0AH73_n1259AlbDomEnv ;
   private String[] P0AH73_A39AlbProPri ;
   private String[] P0AH73_A407EmprNom ;
   private boolean[] P0AH73_n407EmprNom ;
   private String[] P0AH73_A5140AlbMarca ;
   private String[] P0AH73_A1879AlbProEnt ;
   private boolean[] P0AH73_n1879AlbProEnt ;
   private byte[] P0AH73_A33AlbProEst ;
   private byte[] P0AH73_A1782AlbProEso ;
   private String[] P0AH73_A7101AlbLic ;
   private String[] P0AH73_A10017AlbFmd ;
   private boolean[] P0AH73_n10017AlbFmd ;
   private java.util.Date[] P0AH73_A4023AlbFecSal ;
   private String[] P0AH73_A3865AlbHorSal ;
   private String[] P0AH73_A3868AlbMat ;
   private java.util.Date[] P0AH73_A34AlbProfch ;
   private int[] P0AH73_A1243GuiRemCli ;
   private String[] P0AH74_A396EmprCod ;
   private long[] P0AH74_A30AlbProCod ;
   private String[] P0AH74_A916AlbPObs ;
   private byte[] P0AH74_A915AlbPObsLin ;
   private String[] P0AH75_A396EmprCod ;
   private long[] P0AH75_A30AlbProCod ;
   private String[] P0AH75_A12184DltObs ;
   private boolean[] P0AH75_n12184DltObs ;
   private byte[] P0AH75_A12185DltLinObs ;
   private String[] P0AH77_A396EmprCod ;
   private String[] P0AH77_A12178DltP ;
   private byte[] P0AH77_A12177DltR ;
   private int[] P0AH77_A12176DltHdr ;
   private long[] P0AH77_A30AlbProCod ;
   private int[] P0AH77_A12153DltColNum ;
   private boolean[] P0AH77_n12153DltColNum ;
   private java.math.BigDecimal[] P0AH77_A12145DltKgs ;
   private boolean[] P0AH77_n12145DltKgs ;
   private int[] P0AH77_A12147DltPzs ;
   private boolean[] P0AH77_n12147DltPzs ;
   private String[] P0AH77_A12150DltArtCod ;
   private boolean[] P0AH77_n12150DltArtCod ;
   private java.math.BigDecimal[] P0AH77_A12186DltKgsCli ;
   private boolean[] P0AH77_n12186DltKgsCli ;
   private String[] P0AH77_A12151DltArtDsc ;
   private boolean[] P0AH77_n12151DltArtDsc ;
   private short[] P0AH77_A12187DltTubo ;
   private boolean[] P0AH77_n12187DltTubo ;
   private int[] P0AH77_A12149DltTubos ;
   private boolean[] P0AH77_n12149DltTubos ;
   private String[] P0AH77_A12188DltTuboN ;
   private boolean[] P0AH77_n12188DltTuboN ;
   private String[] P0AH78_A396EmprCod ;
   private long[] P0AH78_A30AlbProCod ;
   private int[] P0AH78_A12176DltHdr ;
   private byte[] P0AH78_A12177DltR ;
   private String[] P0AH78_A12178DltP ;
   private java.math.BigDecimal[] P0AH78_A12175DltMtsFs ;
   private boolean[] P0AH78_n12175DltMtsFs ;
   private java.math.BigDecimal[] P0AH78_A12190DltPrMFs ;
   private boolean[] P0AH78_n12190DltPrMFs ;
   private java.math.BigDecimal[] P0AH78_A12192DltPrMBFs ;
   private boolean[] P0AH78_n12192DltPrMBFs ;
   private String[] P0AH78_A12173DltFasDsc ;
   private boolean[] P0AH78_n12173DltFasDsc ;
   private String[] P0AH78_A12172DltFascod ;
   private boolean[] P0AH78_n12172DltFascod ;
   private java.math.BigDecimal[] P0AH78_A12174DltKgsFs ;
   private boolean[] P0AH78_n12174DltKgsFs ;
   private java.math.BigDecimal[] P0AH78_A12191DltPrKBFs ;
   private boolean[] P0AH78_n12191DltPrKBFs ;
   private short[] P0AH78_A12182DltLin ;
   private String[] P0AH710_A396EmprCod ;
   private String[] P0AH710_A130BarCodPar ;
   private byte[] P0AH710_A132BarCodReo ;
   private int[] P0AH710_A129BarCod ;
   private int[] P0AH710_A252CliCod ;
   private boolean[] P0AH710_n252CliCod ;
   private String[] P0AH710_A143BarDisNum ;
   private String[] P0AH710_A1234BarNomCli ;
   private String[] P0AH710_A135BarColNom ;
   private java.math.BigDecimal[] P0AH710_A166BarKgm ;
   private boolean[] P0AH710_n166BarKgm ;
   private String[] P0AH712_A396EmprCod ;
   private String[] P0AH712_A130BarCodPar ;
   private byte[] P0AH712_A132BarCodReo ;
   private int[] P0AH712_A129BarCod ;
   private long[] P0AH712_A30AlbProCod ;
   private String[] P0AH712_A2829BarProPer ;
   private int[] P0AH712_A136BarColNum ;
   private java.math.BigDecimal[] P0AH712_A1261BarAlbKgmE ;
   private int[] P0AH712_A1265BarAlbPie ;
   private byte[] P0AH712_A213BarSit ;
   private String[] P0AH712_A12909CliImpMerm ;
   private String[] P0AH712_A13236CliFacMtsP ;
   private java.math.BigDecimal[] P0AH712_A1263BarAlbMtrE ;
   private int[] P0AH712_A252CliCod ;
   private boolean[] P0AH712_n252CliCod ;
   private String[] P0AH712_A212BarSer ;
   private java.math.BigDecimal[] P0AH712_A2243BarKgsCli ;
   private boolean[] P0AH712_n2243BarKgsCli ;
   private String[] P0AH712_A1652BarSerDsc ;
   private String[] P0AH712_A143BarDisNum ;
   private String[] P0AH712_A1234BarNomCli ;
   private String[] P0AH712_A135BarColNom ;
   private short[] P0AH712_A1206TubCod ;
   private boolean[] P0AH712_n1206TubCod ;
   private int[] P0AH712_A1266BarAlbTub ;
   private String[] P0AH712_A1207TubNom ;
   private boolean[] P0AH712_n1207TubNom ;
   private byte[] P0AH712_A14330BarPriorid ;
   private java.math.BigDecimal[] P0AH712_A166BarKgm ;
   private boolean[] P0AH712_n166BarKgm ;
   private String[] P0AH713_A396EmprCod ;
   private long[] P0AH713_A30AlbProCod ;
   private int[] P0AH713_A129BarCod ;
   private byte[] P0AH713_A132BarCodReo ;
   private String[] P0AH713_A130BarCodPar ;
   private java.math.BigDecimal[] P0AH713_A1276FasMtr ;
   private java.math.BigDecimal[] P0AH713_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0AH713_A8195GuiFasPBM ;
   private boolean[] P0AH713_n8195GuiFasPBM ;
   private String[] P0AH713_A460FasDsc ;
   private String[] P0AH713_A457FasCod ;
   private java.math.BigDecimal[] P0AH713_A1275FasKgm ;
   private java.math.BigDecimal[] P0AH713_A8194GuiFasPBK ;
   private boolean[] P0AH713_n8194GuiFasPBK ;
   private short[] P0AH713_A1240GuiFasLin ;
   private int[] P0AH714_A44AlbRecCod ;
   private String[] P0AH714_A396EmprCod ;
   private String[] P0AH714_A130BarCodPar ;
   private byte[] P0AH714_A132BarCodReo ;
   private int[] P0AH714_A129BarCod ;
   private String[] P0AH714_A6463AlbRLote ;
   private java.math.BigDecimal[] P0AH714_A6465AlbRLu ;
   private String[] P0AH714_A4602AlbRMdlCod ;
   private String[] P0AH714_A6464AlbRTelar ;
   private String[] P0AH714_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AH714_A6470AlbRTara ;
   private String[] P0AH714_A200BarPieCod ;
   private String[] P0AH715_A396EmprCod ;
   private int[] P0AH715_A252CliCod ;
   private boolean[] P0AH715_n252CliCod ;
   private String[] P0AH715_A279CliNom ;
   private String[] P0AH715_A260CliDom ;
   private String[] P0AH715_A256CliCp ;
   private String[] P0AH715_A295CliPob ;
   private String[] P0AH715_A278CliNif ;
   private String[] P0AH715_A13012CliImpReop ;
   private String[] P0AH716_A396EmprCod ;
   private byte[] P0AH716_A266CliEnvLin ;
   private int[] P0AH716_A252CliCod ;
   private boolean[] P0AH716_n252CliCod ;
   private String[] P0AH716_A267CliEnvNom ;
   private String[] P0AH716_A265CliEnvDom ;
   private String[] P0AH716_A264CliEnvCp ;
   private String[] P0AH716_A10775CliEnvCp2 ;
   private String[] P0AH716_A268CliEnvPob ;
   private String[] P0AH717_A396EmprCod ;
   private String[] P0AH717_A10887Cod_Idtx ;
   private String[] P0AH717_A10888Dsc_Idtx ;
   private boolean[] P0AH717_n10888Dsc_Idtx ;
   private String[] P0AH717_A12703Imp_Idtx ;
   private boolean[] P0AH717_n12703Imp_Idtx ;
   private java.math.BigDecimal[] P0AH718_A170BarKilLan ;
}

final  class paguagrmoda__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AH72", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AH73", "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbPdATCUD, T1.AlbDomEnv, T1.AlbProPri, T2.EmprNom, T1.AlbMarca, T1.AlbProEnt, T1.AlbProEst, T1.AlbProEso, T1.AlbLic, T1.AlbFmd, T1.AlbFecSal, T1.AlbHorSal, T1.AlbMat, T1.AlbProfch, T1.GuiRemCli FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod  FOR UPDATE OF T1.AlbProEst, T1.AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AH74", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH75", "SELECT EmprCod, AlbProCod, DltObs, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AH76", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P0AH77", "SELECT EmprCod, DltP, DltR, DltHdr, AlbProCod, DltColNum, DltKgs, DltPzs, DltArtCod, DltKgsCli, DltArtDsc, DltTubo, DltTubos, DltTuboN FROM TXPDLT001 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH78", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltMtsFs, DltPrMFs, DltPrMBFs, DltFasDsc, DltFascod, DltKgsFs, DltPrKBFs, DltLin FROM TXPDLT004 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH710", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarDisNum, T1.BarNomCli, T1.BarColNom, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AH712", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.BarProPer, T2.BarColNum, T1.BarAlbKgmE, T1.BarAlbPie, T2.BarSit, T5.CliImpMerm, T5.CliFacMtsP, T1.BarAlbMtrE, T2.CliCod, T2.BarSer, T1.BarKgsCli, T2.BarSerDsc, T2.BarDisNum, T2.BarNomCli, T2.BarColNom, T1.TubCod, T1.BarAlbTub, T3.TubNom, T2.BarPriorid, COALESCE( T6.BarKgm, 0) AS BarKgm FROM (((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T2.CliCod) LEFT JOIN TXPTUBOS T3 ON T3.EmprCod = T1.EmprCod AND T3.TubCod = T1.TubCod) INNER JOIN TXPCALPRD T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH713", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasMtr, T1.GuiFasPMt, T1.GuiFasPBM, T2.FasDsc, T1.FasCod, T1.FasKgm, T1.GuiFasPBK, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH714", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T2.AlbRTara, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AH715", "SELECT EmprCod, CliCod, CliNom, CliDom, CliCp, CliPob, CliNif, CliImpReop FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AH716", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvCp2, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AH717", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx, Imp_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AH718", "SELECT SUM(BarKilLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((String[]) buf[14])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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

