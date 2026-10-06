package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class paguagrmodacopy1 extends GXReport
{
   public paguagrmodacopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paguagrmodacopy1.class ), "" );
   }

   public paguagrmodacopy1( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      paguagrmodacopy1.this.AV105ReportInPut = aP0;
      paguagrmodacopy1.this.A396EmprCod = aP1;
      paguagrmodacopy1.this.A30AlbProCod = aP2;
      paguagrmodacopy1.this.AV80ImpCod = aP3;
      paguagrmodacopy1.this.AV113TextoCopia = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 11 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV105ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*11)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV49ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRMODA", ""), GXv_char1) ;
         paguagrmodacopy1.this.AV49ContDsc = GXv_char1[0] ;
         GXt_char2 = AV71Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         paguagrmodacopy1.this.A396EmprCod = GXv_char1[0] ;
         paguagrmodacopy1.this.GXt_char2 = GXv_char4[0] ;
         AV71Firmad = GXt_char2 ;
         GXt_int5 = AV66existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         paguagrmodacopy1.this.GXt_int5 = GXv_int6[0] ;
         AV66existefirmad = GXt_int5 ;
         GXt_int5 = AV100PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         paguagrmodacopy1.this.GXt_int5 = GXv_int6[0] ;
         AV100PQrcode = GXt_int5 ;
         GXt_int5 = AV72flax2 ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FLAX2", ""), GXv_int6) ;
         paguagrmodacopy1.this.GXt_int5 = GXv_int6[0] ;
         AV72flax2 = GXt_int5 ;
         /* Using cursor P0AJS2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0AJS2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AJS2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0AJS2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AJS2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0AJS2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AJS2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AJS2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AJS2_n8336EmpItm3[0] ;
            A395EmprCif = P0AJS2_A395EmprCif[0] ;
            n395EmprCif = P0AJS2_n395EmprCif[0] ;
            AV110Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV111Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV63EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P0AJS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1253EmprGuiRem = P0AJS3_A1253EmprGuiRem[0] ;
            A39AlbProPri = P0AJS3_A39AlbProPri[0] ;
            A4828CliCp2 = P0AJS3_A4828CliCp2[0] ;
            n4828CliCp2 = P0AJS3_n4828CliCp2[0] ;
            A256CliCp = P0AJS3_A256CliCp[0] ;
            n256CliCp = P0AJS3_n256CliCp[0] ;
            A14074AlbPdTipAT = P0AJS3_A14074AlbPdTipAT[0] ;
            A34AlbProfch = P0AJS3_A34AlbProfch[0] ;
            A4023AlbFecSal = P0AJS3_A4023AlbFecSal[0] ;
            A14069AlbPdATCUD = P0AJS3_A14069AlbPdATCUD[0] ;
            A1259AlbDomEnv = P0AJS3_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P0AJS3_n1259AlbDomEnv[0] ;
            A14073AlbPdSerAT = P0AJS3_A14073AlbPdSerAT[0] ;
            A407EmprNom = P0AJS3_A407EmprNom[0] ;
            n407EmprNom = P0AJS3_n407EmprNom[0] ;
            A5140AlbMarca = P0AJS3_A5140AlbMarca[0] ;
            A1879AlbProEnt = P0AJS3_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P0AJS3_n1879AlbProEnt[0] ;
            A33AlbProEst = P0AJS3_A33AlbProEst[0] ;
            A1782AlbProEso = P0AJS3_A1782AlbProEso[0] ;
            A7101AlbLic = P0AJS3_A7101AlbLic[0] ;
            A10017AlbFmd = P0AJS3_A10017AlbFmd[0] ;
            n10017AlbFmd = P0AJS3_n10017AlbFmd[0] ;
            A3865AlbHorSal = P0AJS3_A3865AlbHorSal[0] ;
            A3868AlbMat = P0AJS3_A3868AlbMat[0] ;
            A1243GuiRemCli = P0AJS3_A1243GuiRemCli[0] ;
            A4828CliCp2 = P0AJS3_A4828CliCp2[0] ;
            n4828CliCp2 = P0AJS3_n4828CliCp2[0] ;
            A256CliCp = P0AJS3_A256CliCp[0] ;
            n256CliCp = P0AJS3_n256CliCp[0] ;
            A407EmprNom = P0AJS3_A407EmprNom[0] ;
            n407EmprNom = P0AJS3_n407EmprNom[0] ;
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               GXv_char4[0] = AV50contidsernew ;
               new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( A396EmprCod, "666666", GXv_char4) ;
               paguagrmodacopy1.this.AV50contidsernew = GXv_char4[0] ;
               AV108SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GR1" : AV50contidsernew) ;
            }
            else
            {
               GXv_char4[0] = AV50contidsernew ;
               new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV64EmprCod, "555555", GXv_char4) ;
               paguagrmodacopy1.this.AV50contidsernew = GXv_char4[0] ;
               AV108SerieAT = ((GXutil.strcmp("", AV50contidsernew)==0) ? "GT2" : AV50contidsernew) ;
            }
            AV45codigopostal = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            AV60documento = GXutil.trim( A14074AlbPdTipAT) + " " + GXutil.trim( AV108SerieAT) + "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
            AV13albprofch = A34AlbProfch ;
            AV16anyo = (short)(GXutil.year( A34AlbProfch)) ;
            AV93mes = (byte)(GXutil.month( A34AlbProfch)) ;
            AV56dia = (byte)(GXutil.day( A34AlbProfch)) ;
            AV14albprofchcalfa = GXutil.str( AV16anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV93mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV56dia, 2, 0)), (short)(2), "0") ;
            AV16anyo = (short)(GXutil.year( A4023AlbFecSal)) ;
            AV93mes = (byte)(GXutil.month( A4023AlbFecSal)) ;
            AV56dia = (byte)(GXutil.day( A4023AlbFecSal)) ;
            AV57DiaCargaalfa = GXutil.str( AV16anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV93mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV56dia, 2, 0)), (short)(2), "0") ;
            AV57DiaCargaalfa = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) ? " " : AV57DiaCargaalfa) ;
            AV46codValidacaoSerie = A14069AlbPdATCUD ;
            AV17atcud = ((GXutil.strcmp("", AV46codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV46codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))) ;
            AV30CliCod = A1243GuiRemCli ;
            AV38CliEnvDom = A1259AlbDomEnv ;
            AV101Prioridad = A39AlbProPri ;
            /* Execute user subroutine: 'CLIENTE' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(1);
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
            AV112Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV70Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV112Texto_fd = AV70Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV71Firmad) ;
            }
            else
            {
               AV112Texto_fd = httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            AV18AtId = " " ;
            if ( GXutil.strcmp(A7101AlbLic, " ") != 0 )
            {
               AV18AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            AV70Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
            AV114TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV63EmprCif) + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( AV41CliNif) + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "D:", "") + GXutil.trim( A14074AlbPdTipAT) + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV16anyo = (short)(GXutil.year( A34AlbProfch)) ;
            AV93mes = (byte)(GXutil.month( A34AlbProfch)) ;
            AV56dia = (byte)(GXutil.day( A34AlbProfch)) ;
            AV114TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV16anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV93mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV56dia, 2, 0)), (short)(2), "0") + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "G:", "") + GXutil.trim( A14074AlbPdTipAT) + " " + GXutil.trim( A14073AlbPdSerAT) + "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "H:", "") + GXutil.trim( A14069AlbPdATCUD) + "-" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "Q:", "") + AV70Firma4dig + "*" ;
            AV114TextoGenerar += httpContext.getMessage( "R:", "") + "1208" ;
            AV61Dpi = (short)(300) ;
            AV29Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV99Pixel = (short)(DecimalUtil.decToDouble(AV29Centimetos.multiply(DecimalUtil.doubleToDec(AV61Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV10Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV114TextoGenerar, AV99Pixel, AV99Pixel, GXv_char4) ;
            paguagrmodacopy1.this.GXt_char2 = GXv_char4[0] ;
            AV10Url = GXt_char2 ;
            AV76Imagen = AV10Url ;
            AV139Imagen_GXI = GXDbFile.pathToUrl( AV10Url, context.getHttpContext()) ;
            AV65EmprNom = A407EmprNom ;
            AV122VDoc = httpContext.getMessage( "Guia de Remessa Nº", "") ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV122VDoc = httpContext.getMessage( "Guia Transporte Nº", "") ;
            }
            if ( AV52Copias == 1 )
            {
               AV121vCopia = httpContext.getMessage( "DUPLICADO", "") ;
            }
            AV75i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV124vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Using cursor P0AJS4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A916AlbPObs = P0AJS4_A916AlbPObs[0] ;
                  A915AlbPObsLin = P0AJS4_A915AlbPObsLin[0] ;
                  if ( AV75i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV124vObs[AV75i-1] = A916AlbPObs ;
                  AV75i = (byte)(AV75i+1) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            else
            {
               /* Using cursor P0AJS5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A12184DltObs = P0AJS5_A12184DltObs[0] ;
                  n12184DltObs = P0AJS5_n12184DltObs[0] ;
                  A12185DltLinObs = P0AJS5_A12185DltLinObs[0] ;
                  if ( AV75i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV124vObs[AV75i-1] = A12184DltObs ;
                  AV75i = (byte)(AV75i+1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            AV119TxtAnulado = "" ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
            {
               AV119TxtAnulado = httpContext.getMessage( "ANULADO", "") ;
            }
            AV51ContLine = (byte)(0) ;
            AV91Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            AV8Albprocod = A30AlbProCod ;
            /* Execute user subroutine: 'ALBBAR' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
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
            hAJS0( false, 26) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV117TotKgs, "ZZZZZZ9.99")), 630, Gx_line+6, 704, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV118TotPzas), "ZZZZZ9")), 545, Gx_line+6, 590, Gx_line+24, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+26) ;
            A33AlbProEst = (byte)(((A33AlbProEst==0) ? 1 : A33AlbProEst)) ;
            A1782AlbProEso = (byte)(((A1782AlbProEso==0) ? 1 : A1782AlbProEso)) ;
            /* Using cursor P0AJS6 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         AV132WEBSession.setValue(httpContext.getMessage( "PAguaGRMODACopy1_Clicod", ""), localUtil.format( DecimalUtil.doubleToDec(AV30CliCod), "ZZZZZ9"));
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAJS0( true, 0) ;
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
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P0AJS8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV20Barcod), Byte.valueOf(AV22Barcodreo), AV21Barcodpar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = P0AJS8_A130BarCodPar[0] ;
         A132BarCodReo = P0AJS8_A132BarCodReo[0] ;
         A129BarCod = P0AJS8_A129BarCod[0] ;
         A252CliCod = P0AJS8_A252CliCod[0] ;
         n252CliCod = P0AJS8_n252CliCod[0] ;
         A143BarDisNum = P0AJS8_A143BarDisNum[0] ;
         A1234BarNomCli = P0AJS8_A1234BarNomCli[0] ;
         A135BarColNom = P0AJS8_A135BarColNom[0] ;
         A166BarKgm = P0AJS8_A166BarKgm[0] ;
         n166BarKgm = P0AJS8_n166BarKgm[0] ;
         A166BarKgm = P0AJS8_A166BarKgm[0] ;
         n166BarKgm = P0AJS8_n166BarKgm[0] ;
         AV30CliCod = A252CliCod ;
         AV9BarKgm = A166BarKgm ;
         AV25Bardisnum = A143BarDisNum ;
         AV27barnomcli = A1234BarNomCli ;
         AV23barcolnom = A135BarColNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      /* Using cursor P0AJS10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(AV8Albprocod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P0AJS10_A130BarCodPar[0] ;
         A132BarCodReo = P0AJS10_A132BarCodReo[0] ;
         A129BarCod = P0AJS10_A129BarCod[0] ;
         A2829BarProPer = P0AJS10_A2829BarProPer[0] ;
         A136BarColNum = P0AJS10_A136BarColNum[0] ;
         A1261BarAlbKgmE = P0AJS10_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P0AJS10_A1265BarAlbPie[0] ;
         A3271AlbHdrAnc = P0AJS10_A3271AlbHdrAnc[0] ;
         A5019AlbHdrgm2 = P0AJS10_A5019AlbHdrgm2[0] ;
         A213BarSit = P0AJS10_A213BarSit[0] ;
         A12909CliImpMerm = P0AJS10_A12909CliImpMerm[0] ;
         A13236CliFacMtsP = P0AJS10_A13236CliFacMtsP[0] ;
         A1263BarAlbMtrE = P0AJS10_A1263BarAlbMtrE[0] ;
         A252CliCod = P0AJS10_A252CliCod[0] ;
         n252CliCod = P0AJS10_n252CliCod[0] ;
         A212BarSer = P0AJS10_A212BarSer[0] ;
         A2243BarKgsCli = P0AJS10_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P0AJS10_n2243BarKgsCli[0] ;
         A1652BarSerDsc = P0AJS10_A1652BarSerDsc[0] ;
         A143BarDisNum = P0AJS10_A143BarDisNum[0] ;
         A1234BarNomCli = P0AJS10_A1234BarNomCli[0] ;
         A135BarColNom = P0AJS10_A135BarColNom[0] ;
         A2010BarTipDis = P0AJS10_A2010BarTipDis[0] ;
         A1206TubCod = P0AJS10_A1206TubCod[0] ;
         n1206TubCod = P0AJS10_n1206TubCod[0] ;
         A1266BarAlbTub = P0AJS10_A1266BarAlbTub[0] ;
         A1207TubNom = P0AJS10_A1207TubNom[0] ;
         n1207TubNom = P0AJS10_n1207TubNom[0] ;
         A2441AlbHdrObs = P0AJS10_A2441AlbHdrObs[0] ;
         A14330BarPriorid = P0AJS10_A14330BarPriorid[0] ;
         A166BarKgm = P0AJS10_A166BarKgm[0] ;
         n166BarKgm = P0AJS10_n166BarKgm[0] ;
         A2829BarProPer = P0AJS10_A2829BarProPer[0] ;
         A136BarColNum = P0AJS10_A136BarColNum[0] ;
         A213BarSit = P0AJS10_A213BarSit[0] ;
         A252CliCod = P0AJS10_A252CliCod[0] ;
         n252CliCod = P0AJS10_n252CliCod[0] ;
         A212BarSer = P0AJS10_A212BarSer[0] ;
         A1652BarSerDsc = P0AJS10_A1652BarSerDsc[0] ;
         A143BarDisNum = P0AJS10_A143BarDisNum[0] ;
         A1234BarNomCli = P0AJS10_A1234BarNomCli[0] ;
         A135BarColNom = P0AJS10_A135BarColNom[0] ;
         A2010BarTipDis = P0AJS10_A2010BarTipDis[0] ;
         A14330BarPriorid = P0AJS10_A14330BarPriorid[0] ;
         A1207TubNom = P0AJS10_A1207TubNom[0] ;
         n1207TubNom = P0AJS10_n1207TubNom[0] ;
         A12909CliImpMerm = P0AJS10_A12909CliImpMerm[0] ;
         A13236CliFacMtsP = P0AJS10_A13236CliFacMtsP[0] ;
         A166BarKgm = P0AJS10_A166BarKgm[0] ;
         n166BarKgm = P0AJS10_n166BarKgm[0] ;
         AV62Dsc_Idtx = "" ;
         AV44Cod_Idtx = GXutil.trim( A2829BarProPer) ;
         /* Execute user subroutine: 'INDITEX' */
         S139 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            pr_default.close(6);
            pr_default.close(6);
            pr_default.close(6);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV24barcolnum = A136BarColNum ;
         AV74Hdr = ((GXutil.strcmp(AV40CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A129BarCod, 8, 0) : ((A132BarCodReo>0) ? GXutil.str( A129BarCod, 8, 0)+" "+GXutil.str( A132BarCodReo, 1, 0) : GXutil.str( A129BarCod, 8, 0))) ;
         AV20Barcod = A129BarCod ;
         AV22Barcodreo = A132BarCodReo ;
         AV21Barcodpar = A130BarCodPar ;
         AV82KgsE = A166BarKgm ;
         AV84KgsS = A1261BarAlbKgmE ;
         AV19baralbpie = A1265BarAlbPie ;
         AV133AlbHdrAnc = A3271AlbHdrAnc ;
         AV134AlbHdrGm2 = A5019AlbHdrgm2 ;
         AV92merma = (short)(0) ;
         AV120txtmerma = "" ;
         if ( A213BarSit > 6 )
         {
            /* Execute user subroutine: 'MERMA' */
            S149 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            AV92merma = (short)(DecimalUtil.decToDouble(((A166BarKgm.doubleValue()>0) ? ((AV26BarKilLan.subtract(A166BarKgm)).divide(A166BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)))) ;
            AV120txtmerma = ((AV92merma==0)||(GXutil.strcmp(A12909CliImpMerm, httpContext.getMessage( "N", ""))==0) ? " " : httpContext.getMessage( "Quebra:", "")+GXutil.trim( GXutil.str( AV92merma, 3, 0))) ;
         }
         AV94MtsS = DecimalUtil.doubleToDec(0) ;
         if ( GXutil.strcmp(A13236CliFacMtsP, httpContext.getMessage( "S", "")) == 0 )
         {
            AV94MtsS = A1263BarAlbMtrE ;
         }
         else
         {
            if ( ( A252CliCod == 310 ) || ( A252CliCod == 320 ) )
            {
               if ( ( GXutil.strcmp(A212BarSer, "20000") >= 0 ) && ( GXutil.strcmp(A212BarSer, "29999") <= 0 ) )
               {
                  AV94MtsS = A1263BarAlbMtrE ;
               }
            }
         }
         if ( A2243BarKgsCli.doubleValue() != 0 )
         {
            AV84KgsS = A2243BarKgsCli ;
         }
         AV28BarSerDsc = GXutil.substring( A1652BarSerDsc, 1, 20) ;
         AV25Bardisnum = A143BarDisNum ;
         AV27barnomcli = A1234BarNomCli ;
         AV23barcolnom = A135BarColNom ;
         if ( GXutil.strcmp(A2010BarTipDis, "L") == 0 )
         {
            hAJS0( false, 17) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19baralbpie), "ZZZZZ9")), 542, Gx_line+0, 587, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24barcolnum), "ZZZZZZ")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23barcolnom, "")), 392, Gx_line+0, 488, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27barnomcli, "")), 292, Gx_line+0, 388, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28BarSerDsc, "")), 142, Gx_line+0, 289, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Hdr, "")), 58, Gx_line+0, 139, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Bardisnum, "")), 0, Gx_line+0, 59, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
         else
         {
            hAJS0( false, 17) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Bardisnum, "")), 0, Gx_line+1, 59, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Hdr, "")), 61, Gx_line+1, 142, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28BarSerDsc, "")), 144, Gx_line+1, 291, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27barnomcli, "")), 295, Gx_line+1, 391, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23barcolnom, "")), 395, Gx_line+1, 491, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24barcolnum), "ZZZZZZ")), 496, Gx_line+1, 541, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19baralbpie), "ZZZZZ9")), 545, Gx_line+1, 590, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82KgsE, "ZZZ9.99")), 592, Gx_line+1, 644, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84KgsS, "ZZZZ9.99")), 644, Gx_line+1, 703, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV94MtsS, "ZZZZZZ.ZZ")), 707, Gx_line+1, 774, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
         AV51ContLine = (byte)(AV51ContLine+1) ;
         if ( GXutil.strcmp(AV62Dsc_Idtx, " ") != 0 )
         {
            hAJS0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Dsc_Idtx, "")), 144, Gx_line+1, 291, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV51ContLine = (byte)(AV51ContLine+1) ;
         }
         AV118TotPzas = (int)(AV118TotPzas+A1265BarAlbPie) ;
         if ( GXutil.strcmp(A2010BarTipDis, "L") == 0 )
         {
         }
         else
         {
            AV117TotKgs = AV117TotKgs.add(AV84KgsS) ;
         }
         /* Using cursor P0AJS11 */
         pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A1276FasMtr = P0AJS11_A1276FasMtr[0] ;
            A1242GuiFasPMt = P0AJS11_A1242GuiFasPMt[0] ;
            A8195GuiFasPBM = P0AJS11_A8195GuiFasPBM[0] ;
            n8195GuiFasPBM = P0AJS11_n8195GuiFasPBM[0] ;
            A460FasDsc = P0AJS11_A460FasDsc[0] ;
            A457FasCod = P0AJS11_A457FasCod[0] ;
            A1275FasKgm = P0AJS11_A1275FasKgm[0] ;
            A8194GuiFasPBK = P0AJS11_A8194GuiFasPBK[0] ;
            n8194GuiFasPBK = P0AJS11_n8194GuiFasPBK[0] ;
            A1240GuiFasLin = P0AJS11_A1240GuiFasLin[0] ;
            A460FasDsc = P0AJS11_A460FasDsc[0] ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1242GuiFasPMt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) )
            {
               AV67FasMtr = A1276FasMtr ;
               if ( A8195GuiFasPBM.doubleValue() != 0 )
               {
                  AV67FasMtr = A8195GuiFasPBM ;
               }
               hAJS0( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 156, Gx_line+2, 215, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 220, Gx_line+2, 425, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67FasMtr, "ZZZZZ9.99")), 707, Gx_line+2, 774, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               AV83KgsFasS = A1275FasKgm ;
               if ( A8194GuiFasPBK.doubleValue() != 0 )
               {
                  AV83KgsFasS = A8194GuiFasPBK ;
               }
               hAJS0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 220, Gx_line+1, 425, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83KgsFasS, "ZZZZZ9.99")), 638, Gx_line+0, 705, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 156, Gx_line+1, 215, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            AV51ContLine = (byte)(AV51ContLine+1) ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         if ( ! (0==A1206TubCod) )
         {
            hAJS0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1207TubNom, "")), 156, Gx_line+0, 376, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9")), 658, Gx_line+0, 703, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Un.", ""), 707, Gx_line+0, 730, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         /* Execute user subroutine: 'LOTES' */
         S159 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            pr_default.close(6);
            pr_default.close(6);
            pr_default.close(6);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV88Lotes, " ") != 0 )
         {
            AV123Vlote = httpContext.getMessage( "Lote : ", "") + GXutil.trim( AV88Lotes) ;
            hAJS0( false, 19) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123Vlote, "")), 0, Gx_line+0, 220, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "F:", ""), 234, Gx_line+0, 250, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Fio5, "")), 259, Gx_line+0, 296, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "J:", ""), 304, Gx_line+0, 320, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Jogo3, "")), 331, Gx_line+0, 354, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P:", ""), 367, Gx_line+0, 383, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV98Pgadas), "ZZZZZZ")), 392, Gx_line+0, 437, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq:", ""), 446, Gx_line+0, 476, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Maq6, "")), 479, Gx_line+0, 524, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120txtmerma, "")), 691, Gx_line+0, 794, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV133AlbHdrAnc), "ZZZ9")), 575, Gx_line+0, 605, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV134AlbHdrGm2), "ZZZ9")), 650, Gx_line+0, 680, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Larg:", ""), 533, Gx_line+0, 570, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Grm:", ""), 618, Gx_line+0, 648, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+19) ;
         }
         if ( GXutil.strcmp(A2441AlbHdrObs, " ") != 0 )
         {
            hAJS0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2441AlbHdrObs, "")), 150, Gx_line+0, 589, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 58, Gx_line+0, 139, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV51ContLine = (byte)(AV51ContLine+1) ;
         }
         if ( A14330BarPriorid == 1 )
         {
            if ( (0==AV72flax2) )
            {
               hAJS0( false, 17) ;
               getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EUROPEAN FLAX® certified – certificate nº BVFR7338110", ""), 154, Gx_line+1, 488, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               hAJS0( false, 22) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "efb75222-fef4-40ba-b66f-a0dbfd02f4ba", "", context.getHttpContext().getTheme( )), 154, Gx_line+1, 564, Gx_line+20) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S159( ) throws ProcessInterruptedException
   {
      /* 'LOTES' Routine */
      returnInSub = false ;
      AV88Lotes = "" ;
      AV87LoteLast = " " ;
      AV98Pgadas = 0 ;
      AV81Jogo3 = " " ;
      AV68Fio5 = " " ;
      AV89Maq6 = " " ;
      AV86Lfa = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AJS12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV20Barcod), Byte.valueOf(AV22Barcodreo), AV21Barcodpar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A44AlbRecCod = P0AJS12_A44AlbRecCod[0] ;
         A130BarCodPar = P0AJS12_A130BarCodPar[0] ;
         A132BarCodReo = P0AJS12_A132BarCodReo[0] ;
         A129BarCod = P0AJS12_A129BarCod[0] ;
         A6463AlbRLote = P0AJS12_A6463AlbRLote[0] ;
         A6465AlbRLu = P0AJS12_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0AJS12_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0AJS12_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AJS12_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AJS12_A6470AlbRTara[0] ;
         A200BarPieCod = P0AJS12_A200BarPieCod[0] ;
         A6463AlbRLote = P0AJS12_A6463AlbRLote[0] ;
         A6465AlbRLu = P0AJS12_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0AJS12_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0AJS12_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AJS12_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AJS12_A6470AlbRTara[0] ;
         if ( GXutil.strcmp(AV88Lotes, " ") == 0 )
         {
            AV88Lotes = GXutil.trim( A6463AlbRLote) ;
         }
         else
         {
            if ( GXutil.strcmp(A6463AlbRLote, AV87LoteLast) != 0 )
            {
               AV88Lotes += " / " + GXutil.trim( A6463AlbRLote) ;
            }
         }
         AV87LoteLast = A6463AlbRLote ;
         AV98Pgadas = (int)(DecimalUtil.decToDouble(A6465AlbRLu)) ;
         AV81Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
         AV68Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
         AV89Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
         AV86Lfa = A6470AlbRTara ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV42CliNom = "" ;
      AV32CliDom = "" ;
      AV31Clicp = "" ;
      AV43CliPob = "" ;
      AV41CliNif = "" ;
      AV37CliENom = "" ;
      AV36CliEDom = "" ;
      AV33CliEcp = "" ;
      AV39CliEPob = "" ;
      AV40CliImpReop = httpContext.getMessage( "N", "") ;
      /* Using cursor P0AJS13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV30CliCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A252CliCod = P0AJS13_A252CliCod[0] ;
         n252CliCod = P0AJS13_n252CliCod[0] ;
         A279CliNom = P0AJS13_A279CliNom[0] ;
         A260CliDom = P0AJS13_A260CliDom[0] ;
         A256CliCp = P0AJS13_A256CliCp[0] ;
         n256CliCp = P0AJS13_n256CliCp[0] ;
         A295CliPob = P0AJS13_A295CliPob[0] ;
         A278CliNif = P0AJS13_A278CliNif[0] ;
         A13012CliImpReop = P0AJS13_A13012CliImpReop[0] ;
         AV42CliNom = A279CliNom ;
         AV32CliDom = A260CliDom ;
         AV31Clicp = A256CliCp ;
         AV43CliPob = A295CliPob ;
         AV41CliNif = A278CliNif ;
         AV40CliImpReop = A13012CliImpReop ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      /* Execute user subroutine: 'ENVIO' */
      S171 ();
      if (returnInSub) return;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      AV34CliEcp12 = " " ;
      AV36CliEDom = httpContext.getMessage( "V/ Instalaçoes", "") ;
      AV33CliEcp = " " ;
      AV39CliEPob = " " ;
      /* Using cursor P0AJS14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV30CliCod), Byte.valueOf(AV38CliEnvDom)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A266CliEnvLin = P0AJS14_A266CliEnvLin[0] ;
         A252CliCod = P0AJS14_A252CliCod[0] ;
         n252CliCod = P0AJS14_n252CliCod[0] ;
         A267CliEnvNom = P0AJS14_A267CliEnvNom[0] ;
         A265CliEnvDom = P0AJS14_A265CliEnvDom[0] ;
         A264CliEnvCp = P0AJS14_A264CliEnvCp[0] ;
         A10775CliEnvCp2 = P0AJS14_A10775CliEnvCp2[0] ;
         A268CliEnvPob = P0AJS14_A268CliEnvPob[0] ;
         AV37CliENom = A267CliEnvNom ;
         AV36CliEDom = A265CliEnvDom ;
         AV33CliEcp = A264CliEnvCp ;
         AV35CliEcp2 = GXutil.trim( A10775CliEnvCp2) ;
         AV39CliEPob = A268CliEnvPob ;
         AV34CliEcp12 = GXutil.trim( A264CliEnvCp) ;
         AV34CliEcp12 += ((GXutil.strcmp(A10775CliEnvCp2, " ")!=0) ? "-"+GXutil.trim( AV35CliEcp2) : "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S139( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      AV62Dsc_Idtx = "" ;
      /* Using cursor P0AJS15 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV44Cod_Idtx});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A10887Cod_Idtx = P0AJS15_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0AJS15_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0AJS15_n10888Dsc_Idtx[0] ;
         A12703Imp_Idtx = P0AJS15_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P0AJS15_n12703Imp_Idtx[0] ;
         AV62Dsc_Idtx = ((GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", ""))==0) ? GXutil.trim( A10888Dsc_Idtx) : " ") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S149( ) throws ProcessInterruptedException
   {
      /* 'MERMA' Routine */
      returnInSub = false ;
      AV26BarKilLan = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P0AJS16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV20Barcod), Byte.valueOf(AV22Barcodreo), AV21Barcodpar});
      c170BarKilLan = P0AJS16_A170BarKilLan[0] ;
      pr_default.close(12);
      AV26BarKilLan = AV26BarKilLan.add(c170BarKilLan) ;
      /* End optimized group. */
   }

   public void hAJS0( boolean bFoot ,
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124vObs[1-1], "")), 150, Gx_line+2, 516, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124vObs[2-1], "")), 150, Gx_line+18, 516, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nota: Eventuais reclamações apenas serão consideradas no prazo de 8 dias, não se aceitando devoluções de malha cortada ou manufacturada.", ""), 13, Gx_line+81, 772, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(3, Gx_line+109, 775, Gx_line+109, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124vObs[3-1], "")), 150, Gx_line+33, 516, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124vObs[4-1], "")), 150, Gx_line+49, 516, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Texto_1, "")), 55, Gx_line+110, 723, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Texto_2, "")), 76, Gx_line+130, 702, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112Texto_fd, "")), 13, Gx_line+68, 285, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18AtId, "")), 288, Gx_line+67, 419, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49ContDsc, "")), 712, Gx_line+67, 776, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115textoNOAT, "")), 422, Gx_line+67, 709, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Este documento não serve de fatura", ""), 300, Gx_line+97, 478, Gx_line+108, 0+256, 0, 0, 0) ;
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
               AV106RutaImagenMarcaAgua = "" ;
               AV115textoNOAT = "" ;
               if ( (GXutil.strcmp("", A7101AlbLic)==0) )
               {
                  AV115textoNOAT = httpContext.getMessage( "Este documento não serve de documento de transporte", "") ;
               }
               if ( (GXutil.strcmp("", A10017AlbFmd)==0) )
               {
                  AV90MarcaAguaImagen = context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )) ;
                  AV142Marcaaguaimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
                  sImgUrl = ((GXutil.strcmp("", AV90MarcaAguaImagen)==0) ? AV142Marcaaguaimagen_GXI : AV90MarcaAguaImagen) ;
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42CliNom, "")), 457, Gx_line+190, 646, Gx_line+208, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32CliDom, "")), 457, Gx_line+209, 671, Gx_line+227, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS.", ""), 99, Gx_line+376, 121, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 172, Gx_line+376, 266, Gx_line+392, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 552, Gx_line+376, 589, Gx_line+392, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 633, Gx_line+369, 672, Gx_line+385, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43CliPob, "")), 558, Gx_line+233, 747, Gx_line+251, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(0, Gx_line+277, 775, Gx_line+367, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(0, Gx_line+367, 775, Gx_line+401, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113TextoCopia, "")), 679, Gx_line+149, 774, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 25, Gx_line+281, 86, Gx_line+297, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 25, Gx_line+299, 117, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 25, Gx_line+317, 126, Gx_line+333, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 25, Gx_line+333, 95, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Contibuinte:", ""), 414, Gx_line+281, 497, Gx_line+300, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 384, Gx_line+299, 496, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 442, Gx_line+333, 497, Gx_line+350, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Cor", ""), 423, Gx_line+376, 457, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(145, Gx_line+368, 145, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(292, Gx_line+367, 292, Gx_line+400, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 498, Gx_line+376, 539, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(544, Gx_line+368, 544, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(493, Gx_line+367, 493, Gx_line+400, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 133, Gx_line+281, 178, Gx_line+298, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14albprofchcalfa, "")), 133, Gx_line+317, 238, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 133, Gx_line+299, 216, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41CliNif, "@!")), 501, Gx_line+281, 606, Gx_line+300, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Encom.", ""), 5, Gx_line+376, 60, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(61, Gx_line+368, 61, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3868AlbMat, "")), 501, Gx_line+333, 606, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), 292, Gx_line+333, 385, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+368, 592, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 599, Gx_line+385, 652, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 661, Gx_line+385, 703, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+384, 775, Gx_line+384, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(654, Gx_line+384, 654, Gx_line+400, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122VDoc, "")), 433, Gx_line+123, 592, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Cor", ""), 336, Gx_line+376, 368, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(393, Gx_line+368, 393, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(433, Gx_line+179, 775, Gx_line+269, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 0, Gx_line+4, 775, Gx_line+90) ;
               getPrinter().GxDrawLine(704, Gx_line+368, 704, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 713, Gx_line+369, 753, Gx_line+385, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 711, Gx_line+385, 753, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "95455c83-4215-4a0c-83f2-f37dd13189ec", "", context.getHttpContext().getTheme( )), 4, Gx_line+240, 429, Gx_line+276) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57DiaCargaalfa, "")), 133, Gx_line+333, 238, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 250, Gx_line+333, 282, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119TxtAnulado, "")), 9, Gx_line+202, 281, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34CliEcp12, "")), 501, Gx_line+317, 554, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39CliEPob, "")), 574, Gx_line+317, 731, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36CliEDom, "")), 501, Gx_line+299, 679, Gx_line+317, 0, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV76Imagen)==0) ? AV139Imagen_GXI : AV76Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 290, Gx_line+111, 415, Gx_line+236) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17atcud, "")), 274, Gx_line+92, 431, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60documento, "")), 607, Gx_line+123, 775, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45codigopostal, "")), 458, Gx_line+233, 534, Gx_line+251, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina:", ""), 625, Gx_line+333, 661, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 667, Gx_line+333, 706, Gx_line+349, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 726, Gx_line+333, 767, Gx_line+349, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 714, Gx_line+333, 718, Gx_line+348, 0+256, 0, 0, 0) ;
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
      add_metrics6( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Arial Narrow", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "paguagrmodacopy1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV49ContDsc = "" ;
      AV71Firmad = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P0AJS2_A396EmprCod = new String[] {""} ;
      P0AJS2_A8335EmpItm2 = new String[] {""} ;
      P0AJS2_n8335EmpItm2 = new boolean[] {false} ;
      P0AJS2_A8334EmpItm1 = new String[] {""} ;
      P0AJS2_n8334EmpItm1 = new boolean[] {false} ;
      P0AJS2_A8337EmpItm4 = new String[] {""} ;
      P0AJS2_n8337EmpItm4 = new boolean[] {false} ;
      P0AJS2_A8336EmpItm3 = new String[] {""} ;
      P0AJS2_n8336EmpItm3 = new boolean[] {false} ;
      P0AJS2_A395EmprCif = new String[] {""} ;
      P0AJS2_n395EmprCif = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV110Texto_1 = "" ;
      AV111Texto_2 = "" ;
      AV63EmprCif = "" ;
      P0AJS3_A1253EmprGuiRem = new String[] {""} ;
      P0AJS3_A396EmprCod = new String[] {""} ;
      P0AJS3_A30AlbProCod = new long[1] ;
      P0AJS3_A39AlbProPri = new String[] {""} ;
      P0AJS3_A4828CliCp2 = new String[] {""} ;
      P0AJS3_n4828CliCp2 = new boolean[] {false} ;
      P0AJS3_A256CliCp = new String[] {""} ;
      P0AJS3_n256CliCp = new boolean[] {false} ;
      P0AJS3_A14074AlbPdTipAT = new String[] {""} ;
      P0AJS3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJS3_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJS3_A14069AlbPdATCUD = new String[] {""} ;
      P0AJS3_A1259AlbDomEnv = new byte[1] ;
      P0AJS3_n1259AlbDomEnv = new boolean[] {false} ;
      P0AJS3_A14073AlbPdSerAT = new String[] {""} ;
      P0AJS3_A407EmprNom = new String[] {""} ;
      P0AJS3_n407EmprNom = new boolean[] {false} ;
      P0AJS3_A5140AlbMarca = new String[] {""} ;
      P0AJS3_A1879AlbProEnt = new String[] {""} ;
      P0AJS3_n1879AlbProEnt = new boolean[] {false} ;
      P0AJS3_A33AlbProEst = new byte[1] ;
      P0AJS3_A1782AlbProEso = new byte[1] ;
      P0AJS3_A7101AlbLic = new String[] {""} ;
      P0AJS3_A10017AlbFmd = new String[] {""} ;
      P0AJS3_n10017AlbFmd = new boolean[] {false} ;
      P0AJS3_A3865AlbHorSal = new String[] {""} ;
      P0AJS3_A3868AlbMat = new String[] {""} ;
      P0AJS3_A1243GuiRemCli = new int[1] ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A14074AlbPdTipAT = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A14069AlbPdATCUD = "" ;
      A14073AlbPdSerAT = "" ;
      A407EmprNom = "" ;
      A5140AlbMarca = "" ;
      A1879AlbProEnt = "" ;
      A7101AlbLic = "" ;
      A10017AlbFmd = "" ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      AV50contidsernew = "" ;
      AV108SerieAT = "" ;
      AV64EmprCod = "" ;
      AV45codigopostal = "" ;
      AV60documento = "" ;
      AV13albprofch = GXutil.nullDate() ;
      AV14albprofchcalfa = "" ;
      AV57DiaCargaalfa = "" ;
      AV46codValidacaoSerie = "" ;
      AV17atcud = "" ;
      AV101Prioridad = "" ;
      AV112Texto_fd = "" ;
      AV70Firma4dig = "" ;
      AV18AtId = "" ;
      AV114TextoGenerar = "" ;
      AV41CliNif = "" ;
      AV29Centimetos = DecimalUtil.ZERO ;
      AV10Url = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV76Imagen = "" ;
      AV139Imagen_GXI = "" ;
      AV65EmprNom = "" ;
      AV122VDoc = "" ;
      AV121vCopia = "" ;
      AV124vObs = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV124vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AJS4_A396EmprCod = new String[] {""} ;
      P0AJS4_A30AlbProCod = new long[1] ;
      P0AJS4_A916AlbPObs = new String[] {""} ;
      P0AJS4_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      P0AJS5_A396EmprCod = new String[] {""} ;
      P0AJS5_A30AlbProCod = new long[1] ;
      P0AJS5_A12184DltObs = new String[] {""} ;
      P0AJS5_n12184DltObs = new boolean[] {false} ;
      P0AJS5_A12185DltLinObs = new byte[1] ;
      A12184DltObs = "" ;
      AV119TxtAnulado = "" ;
      AV91Matricula = "" ;
      AV117TotKgs = DecimalUtil.ZERO ;
      AV132WEBSession = httpContext.getWebSession();
      AV21Barcodpar = "" ;
      P0AJS8_A396EmprCod = new String[] {""} ;
      P0AJS8_A130BarCodPar = new String[] {""} ;
      P0AJS8_A132BarCodReo = new byte[1] ;
      P0AJS8_A129BarCod = new int[1] ;
      P0AJS8_A252CliCod = new int[1] ;
      P0AJS8_n252CliCod = new boolean[] {false} ;
      P0AJS8_A143BarDisNum = new String[] {""} ;
      P0AJS8_A1234BarNomCli = new String[] {""} ;
      P0AJS8_A135BarColNom = new String[] {""} ;
      P0AJS8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS8_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV9BarKgm = DecimalUtil.ZERO ;
      AV25Bardisnum = "" ;
      AV27barnomcli = "" ;
      AV23barcolnom = "" ;
      P0AJS10_A396EmprCod = new String[] {""} ;
      P0AJS10_A130BarCodPar = new String[] {""} ;
      P0AJS10_A132BarCodReo = new byte[1] ;
      P0AJS10_A129BarCod = new int[1] ;
      P0AJS10_A30AlbProCod = new long[1] ;
      P0AJS10_A2829BarProPer = new String[] {""} ;
      P0AJS10_A136BarColNum = new int[1] ;
      P0AJS10_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS10_A1265BarAlbPie = new int[1] ;
      P0AJS10_A3271AlbHdrAnc = new short[1] ;
      P0AJS10_A5019AlbHdrgm2 = new short[1] ;
      P0AJS10_A213BarSit = new byte[1] ;
      P0AJS10_A12909CliImpMerm = new String[] {""} ;
      P0AJS10_A13236CliFacMtsP = new String[] {""} ;
      P0AJS10_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS10_A252CliCod = new int[1] ;
      P0AJS10_n252CliCod = new boolean[] {false} ;
      P0AJS10_A212BarSer = new String[] {""} ;
      P0AJS10_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS10_n2243BarKgsCli = new boolean[] {false} ;
      P0AJS10_A1652BarSerDsc = new String[] {""} ;
      P0AJS10_A143BarDisNum = new String[] {""} ;
      P0AJS10_A1234BarNomCli = new String[] {""} ;
      P0AJS10_A135BarColNom = new String[] {""} ;
      P0AJS10_A2010BarTipDis = new String[] {""} ;
      P0AJS10_A1206TubCod = new short[1] ;
      P0AJS10_n1206TubCod = new boolean[] {false} ;
      P0AJS10_A1266BarAlbTub = new int[1] ;
      P0AJS10_A1207TubNom = new String[] {""} ;
      P0AJS10_n1207TubNom = new boolean[] {false} ;
      P0AJS10_A2441AlbHdrObs = new String[] {""} ;
      P0AJS10_A14330BarPriorid = new byte[1] ;
      P0AJS10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS10_n166BarKgm = new boolean[] {false} ;
      A2829BarProPer = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A12909CliImpMerm = "" ;
      A13236CliFacMtsP = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A2010BarTipDis = "" ;
      A1207TubNom = "" ;
      A2441AlbHdrObs = "" ;
      AV62Dsc_Idtx = "" ;
      AV44Cod_Idtx = "" ;
      AV74Hdr = "" ;
      AV40CliImpReop = "" ;
      AV82KgsE = DecimalUtil.ZERO ;
      AV84KgsS = DecimalUtil.ZERO ;
      AV120txtmerma = "" ;
      AV26BarKilLan = DecimalUtil.ZERO ;
      AV94MtsS = DecimalUtil.ZERO ;
      AV28BarSerDsc = "" ;
      P0AJS11_A396EmprCod = new String[] {""} ;
      P0AJS11_A30AlbProCod = new long[1] ;
      P0AJS11_A129BarCod = new int[1] ;
      P0AJS11_A132BarCodReo = new byte[1] ;
      P0AJS11_A130BarCodPar = new String[] {""} ;
      P0AJS11_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS11_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS11_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS11_n8195GuiFasPBM = new boolean[] {false} ;
      P0AJS11_A460FasDsc = new String[] {""} ;
      P0AJS11_A457FasCod = new String[] {""} ;
      P0AJS11_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS11_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS11_n8194GuiFasPBK = new boolean[] {false} ;
      P0AJS11_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      AV67FasMtr = DecimalUtil.ZERO ;
      AV83KgsFasS = DecimalUtil.ZERO ;
      AV88Lotes = "" ;
      AV123Vlote = "" ;
      AV68Fio5 = "" ;
      AV81Jogo3 = "" ;
      AV89Maq6 = "" ;
      AV87LoteLast = "" ;
      AV86Lfa = DecimalUtil.ZERO ;
      P0AJS12_A44AlbRecCod = new int[1] ;
      P0AJS12_A396EmprCod = new String[] {""} ;
      P0AJS12_A130BarCodPar = new String[] {""} ;
      P0AJS12_A132BarCodReo = new byte[1] ;
      P0AJS12_A129BarCod = new int[1] ;
      P0AJS12_A6463AlbRLote = new String[] {""} ;
      P0AJS12_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS12_A4602AlbRMdlCod = new String[] {""} ;
      P0AJS12_A6464AlbRTelar = new String[] {""} ;
      P0AJS12_A8035AlbMaqTej = new String[] {""} ;
      P0AJS12_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJS12_A200BarPieCod = new String[] {""} ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV42CliNom = "" ;
      AV32CliDom = "" ;
      AV31Clicp = "" ;
      AV43CliPob = "" ;
      AV37CliENom = "" ;
      AV36CliEDom = "" ;
      AV33CliEcp = "" ;
      AV39CliEPob = "" ;
      P0AJS13_A396EmprCod = new String[] {""} ;
      P0AJS13_A252CliCod = new int[1] ;
      P0AJS13_n252CliCod = new boolean[] {false} ;
      P0AJS13_A279CliNom = new String[] {""} ;
      P0AJS13_A260CliDom = new String[] {""} ;
      P0AJS13_A256CliCp = new String[] {""} ;
      P0AJS13_n256CliCp = new boolean[] {false} ;
      P0AJS13_A295CliPob = new String[] {""} ;
      P0AJS13_A278CliNif = new String[] {""} ;
      P0AJS13_A13012CliImpReop = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A13012CliImpReop = "" ;
      AV34CliEcp12 = "" ;
      P0AJS14_A396EmprCod = new String[] {""} ;
      P0AJS14_A266CliEnvLin = new byte[1] ;
      P0AJS14_A252CliCod = new int[1] ;
      P0AJS14_n252CliCod = new boolean[] {false} ;
      P0AJS14_A267CliEnvNom = new String[] {""} ;
      P0AJS14_A265CliEnvDom = new String[] {""} ;
      P0AJS14_A264CliEnvCp = new String[] {""} ;
      P0AJS14_A10775CliEnvCp2 = new String[] {""} ;
      P0AJS14_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A268CliEnvPob = "" ;
      AV35CliEcp2 = "" ;
      P0AJS15_A396EmprCod = new String[] {""} ;
      P0AJS15_A10887Cod_Idtx = new String[] {""} ;
      P0AJS15_A10888Dsc_Idtx = new String[] {""} ;
      P0AJS15_n10888Dsc_Idtx = new boolean[] {false} ;
      P0AJS15_A12703Imp_Idtx = new String[] {""} ;
      P0AJS15_n12703Imp_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      A12703Imp_Idtx = "" ;
      c170BarKilLan = DecimalUtil.ZERO ;
      P0AJS16_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV115textoNOAT = "" ;
      AV106RutaImagenMarcaAgua = "" ;
      AV90MarcaAguaImagen = "" ;
      AV142Marcaaguaimagen_GXI = "" ;
      AV90MarcaAguaImagen = "" ;
      sImgUrl = "" ;
      AV76Imagen = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.paguagrmodacopy1__default(),
         new Object[] {
             new Object[] {
            P0AJS2_A396EmprCod, P0AJS2_A8335EmpItm2, P0AJS2_n8335EmpItm2, P0AJS2_A8334EmpItm1, P0AJS2_n8334EmpItm1, P0AJS2_A8337EmpItm4, P0AJS2_n8337EmpItm4, P0AJS2_A8336EmpItm3, P0AJS2_n8336EmpItm3, P0AJS2_A395EmprCif,
            P0AJS2_n395EmprCif
            }
            , new Object[] {
            P0AJS3_A1253EmprGuiRem, P0AJS3_A396EmprCod, P0AJS3_A30AlbProCod, P0AJS3_A39AlbProPri, P0AJS3_A4828CliCp2, P0AJS3_n4828CliCp2, P0AJS3_A256CliCp, P0AJS3_n256CliCp, P0AJS3_A14074AlbPdTipAT, P0AJS3_A34AlbProfch,
            P0AJS3_A4023AlbFecSal, P0AJS3_A14069AlbPdATCUD, P0AJS3_A1259AlbDomEnv, P0AJS3_n1259AlbDomEnv, P0AJS3_A14073AlbPdSerAT, P0AJS3_A407EmprNom, P0AJS3_n407EmprNom, P0AJS3_A5140AlbMarca, P0AJS3_A1879AlbProEnt, P0AJS3_n1879AlbProEnt,
            P0AJS3_A33AlbProEst, P0AJS3_A1782AlbProEso, P0AJS3_A7101AlbLic, P0AJS3_A10017AlbFmd, P0AJS3_n10017AlbFmd, P0AJS3_A3865AlbHorSal, P0AJS3_A3868AlbMat, P0AJS3_A1243GuiRemCli
            }
            , new Object[] {
            P0AJS4_A396EmprCod, P0AJS4_A30AlbProCod, P0AJS4_A916AlbPObs, P0AJS4_A915AlbPObsLin
            }
            , new Object[] {
            P0AJS5_A396EmprCod, P0AJS5_A30AlbProCod, P0AJS5_A12184DltObs, P0AJS5_n12184DltObs, P0AJS5_A12185DltLinObs
            }
            , new Object[] {
            }
            , new Object[] {
            P0AJS8_A396EmprCod, P0AJS8_A130BarCodPar, P0AJS8_A132BarCodReo, P0AJS8_A129BarCod, P0AJS8_A252CliCod, P0AJS8_n252CliCod, P0AJS8_A143BarDisNum, P0AJS8_A1234BarNomCli, P0AJS8_A135BarColNom, P0AJS8_A166BarKgm,
            P0AJS8_n166BarKgm
            }
            , new Object[] {
            P0AJS10_A396EmprCod, P0AJS10_A130BarCodPar, P0AJS10_A132BarCodReo, P0AJS10_A129BarCod, P0AJS10_A30AlbProCod, P0AJS10_A2829BarProPer, P0AJS10_A136BarColNum, P0AJS10_A1261BarAlbKgmE, P0AJS10_A1265BarAlbPie, P0AJS10_A3271AlbHdrAnc,
            P0AJS10_A5019AlbHdrgm2, P0AJS10_A213BarSit, P0AJS10_A12909CliImpMerm, P0AJS10_A13236CliFacMtsP, P0AJS10_A1263BarAlbMtrE, P0AJS10_A252CliCod, P0AJS10_n252CliCod, P0AJS10_A212BarSer, P0AJS10_A2243BarKgsCli, P0AJS10_n2243BarKgsCli,
            P0AJS10_A1652BarSerDsc, P0AJS10_A143BarDisNum, P0AJS10_A1234BarNomCli, P0AJS10_A135BarColNom, P0AJS10_A2010BarTipDis, P0AJS10_A1206TubCod, P0AJS10_n1206TubCod, P0AJS10_A1266BarAlbTub, P0AJS10_A1207TubNom, P0AJS10_n1207TubNom,
            P0AJS10_A2441AlbHdrObs, P0AJS10_A14330BarPriorid, P0AJS10_A166BarKgm, P0AJS10_n166BarKgm
            }
            , new Object[] {
            P0AJS11_A396EmprCod, P0AJS11_A30AlbProCod, P0AJS11_A129BarCod, P0AJS11_A132BarCodReo, P0AJS11_A130BarCodPar, P0AJS11_A1276FasMtr, P0AJS11_A1242GuiFasPMt, P0AJS11_A8195GuiFasPBM, P0AJS11_n8195GuiFasPBM, P0AJS11_A460FasDsc,
            P0AJS11_A457FasCod, P0AJS11_A1275FasKgm, P0AJS11_A8194GuiFasPBK, P0AJS11_n8194GuiFasPBK, P0AJS11_A1240GuiFasLin
            }
            , new Object[] {
            P0AJS12_A44AlbRecCod, P0AJS12_A396EmprCod, P0AJS12_A130BarCodPar, P0AJS12_A132BarCodReo, P0AJS12_A129BarCod, P0AJS12_A6463AlbRLote, P0AJS12_A6465AlbRLu, P0AJS12_A4602AlbRMdlCod, P0AJS12_A6464AlbRTelar, P0AJS12_A8035AlbMaqTej,
            P0AJS12_A6470AlbRTara, P0AJS12_A200BarPieCod
            }
            , new Object[] {
            P0AJS13_A396EmprCod, P0AJS13_A252CliCod, P0AJS13_A279CliNom, P0AJS13_A260CliDom, P0AJS13_A256CliCp, P0AJS13_A295CliPob, P0AJS13_A278CliNif, P0AJS13_A13012CliImpReop
            }
            , new Object[] {
            P0AJS14_A396EmprCod, P0AJS14_A266CliEnvLin, P0AJS14_A252CliCod, P0AJS14_A267CliEnvNom, P0AJS14_A265CliEnvDom, P0AJS14_A264CliEnvCp, P0AJS14_A10775CliEnvCp2, P0AJS14_A268CliEnvPob
            }
            , new Object[] {
            P0AJS15_A396EmprCod, P0AJS15_A10887Cod_Idtx, P0AJS15_A10888Dsc_Idtx, P0AJS15_n10888Dsc_Idtx, P0AJS15_A12703Imp_Idtx, P0AJS15_n12703Imp_Idtx
            }
            , new Object[] {
            P0AJS16_A170BarKilLan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV66existefirmad ;
   private byte AV100PQrcode ;
   private byte AV72flax2 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte AV93mes ;
   private byte AV56dia ;
   private byte AV38CliEnvDom ;
   private byte AV52Copias ;
   private byte AV75i ;
   private byte A915AlbPObsLin ;
   private byte A12185DltLinObs ;
   private byte AV51ContLine ;
   private byte AV22Barcodreo ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A14330BarPriorid ;
   private byte A266CliEnvLin ;
   private short AV16anyo ;
   private short AV61Dpi ;
   private short AV99Pixel ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short AV133AlbHdrAnc ;
   private short AV134AlbHdrGm2 ;
   private short AV92merma ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV30CliCod ;
   private int GX_I ;
   private int AV118TotPzas ;
   private int Gx_OldLine ;
   private int AV20Barcod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int AV24barcolnum ;
   private int AV19baralbpie ;
   private int AV98Pgadas ;
   private int A44AlbRecCod ;
   private long A30AlbProCod ;
   private long AV8Albprocod ;
   private java.math.BigDecimal AV29Centimetos ;
   private java.math.BigDecimal AV117TotKgs ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV9BarKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal AV82KgsE ;
   private java.math.BigDecimal AV84KgsS ;
   private java.math.BigDecimal AV26BarKilLan ;
   private java.math.BigDecimal AV94MtsS ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal AV67FasMtr ;
   private java.math.BigDecimal AV83KgsFasS ;
   private java.math.BigDecimal AV86Lfa ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal c170BarKilLan ;
   private String A396EmprCod ;
   private String AV80ImpCod ;
   private String AV113TextoCopia ;
   private String AV49ContDsc ;
   private String AV71Firmad ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV110Texto_1 ;
   private String AV111Texto_2 ;
   private String AV63EmprCif ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A14074AlbPdTipAT ;
   private String A14069AlbPdATCUD ;
   private String A14073AlbPdSerAT ;
   private String A407EmprNom ;
   private String A5140AlbMarca ;
   private String A1879AlbProEnt ;
   private String A7101AlbLic ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String AV50contidsernew ;
   private String AV64EmprCod ;
   private String AV45codigopostal ;
   private String AV60documento ;
   private String AV14albprofchcalfa ;
   private String AV57DiaCargaalfa ;
   private String AV46codValidacaoSerie ;
   private String AV17atcud ;
   private String AV101Prioridad ;
   private String AV112Texto_fd ;
   private String AV70Firma4dig ;
   private String AV18AtId ;
   private String AV41CliNif ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV65EmprNom ;
   private String AV122VDoc ;
   private String AV121vCopia ;
   private String AV124vObs[] ;
   private String A916AlbPObs ;
   private String A12184DltObs ;
   private String AV119TxtAnulado ;
   private String AV91Matricula ;
   private String AV21Barcodpar ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String AV25Bardisnum ;
   private String AV27barnomcli ;
   private String AV23barcolnom ;
   private String A2829BarProPer ;
   private String A12909CliImpMerm ;
   private String A13236CliFacMtsP ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A2010BarTipDis ;
   private String A1207TubNom ;
   private String A2441AlbHdrObs ;
   private String AV62Dsc_Idtx ;
   private String AV44Cod_Idtx ;
   private String AV74Hdr ;
   private String AV40CliImpReop ;
   private String AV120txtmerma ;
   private String AV28BarSerDsc ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV88Lotes ;
   private String AV123Vlote ;
   private String AV68Fio5 ;
   private String AV81Jogo3 ;
   private String AV89Maq6 ;
   private String AV87LoteLast ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String A200BarPieCod ;
   private String AV42CliNom ;
   private String AV32CliDom ;
   private String AV31Clicp ;
   private String AV43CliPob ;
   private String AV37CliENom ;
   private String AV36CliEDom ;
   private String AV33CliEcp ;
   private String AV39CliEPob ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A13012CliImpReop ;
   private String AV34CliEcp12 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A10775CliEnvCp2 ;
   private String A268CliEnvPob ;
   private String AV35CliEcp2 ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A12703Imp_Idtx ;
   private String AV115textoNOAT ;
   private String sImgUrl ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV13albprofch ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean GxHdr3 ;
   private boolean n4828CliCp2 ;
   private boolean n256CliCp ;
   private boolean n1259AlbDomEnv ;
   private boolean n407EmprNom ;
   private boolean n1879AlbProEnt ;
   private boolean n10017AlbFmd ;
   private boolean returnInSub ;
   private boolean n12184DltObs ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean n2243BarKgsCli ;
   private boolean n1206TubCod ;
   private boolean n1207TubNom ;
   private boolean n8195GuiFasPBM ;
   private boolean n8194GuiFasPBK ;
   private boolean n10888Dsc_Idtx ;
   private boolean n12703Imp_Idtx ;
   private String AV105ReportInPut ;
   private String A10017AlbFmd ;
   private String AV108SerieAT ;
   private String AV114TextoGenerar ;
   private String AV10Url ;
   private String AV139Imagen_GXI ;
   private String AV106RutaImagenMarcaAgua ;
   private String AV142Marcaaguaimagen_GXI ;
   private String AV76Imagen ;
   private String AV90MarcaAguaImagen ;
   private String Marcaaguaimagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJS2_A396EmprCod ;
   private String[] P0AJS2_A8335EmpItm2 ;
   private boolean[] P0AJS2_n8335EmpItm2 ;
   private String[] P0AJS2_A8334EmpItm1 ;
   private boolean[] P0AJS2_n8334EmpItm1 ;
   private String[] P0AJS2_A8337EmpItm4 ;
   private boolean[] P0AJS2_n8337EmpItm4 ;
   private String[] P0AJS2_A8336EmpItm3 ;
   private boolean[] P0AJS2_n8336EmpItm3 ;
   private String[] P0AJS2_A395EmprCif ;
   private boolean[] P0AJS2_n395EmprCif ;
   private String[] P0AJS3_A1253EmprGuiRem ;
   private String[] P0AJS3_A396EmprCod ;
   private long[] P0AJS3_A30AlbProCod ;
   private String[] P0AJS3_A39AlbProPri ;
   private String[] P0AJS3_A4828CliCp2 ;
   private boolean[] P0AJS3_n4828CliCp2 ;
   private String[] P0AJS3_A256CliCp ;
   private boolean[] P0AJS3_n256CliCp ;
   private String[] P0AJS3_A14074AlbPdTipAT ;
   private java.util.Date[] P0AJS3_A34AlbProfch ;
   private java.util.Date[] P0AJS3_A4023AlbFecSal ;
   private String[] P0AJS3_A14069AlbPdATCUD ;
   private byte[] P0AJS3_A1259AlbDomEnv ;
   private boolean[] P0AJS3_n1259AlbDomEnv ;
   private String[] P0AJS3_A14073AlbPdSerAT ;
   private String[] P0AJS3_A407EmprNom ;
   private boolean[] P0AJS3_n407EmprNom ;
   private String[] P0AJS3_A5140AlbMarca ;
   private String[] P0AJS3_A1879AlbProEnt ;
   private boolean[] P0AJS3_n1879AlbProEnt ;
   private byte[] P0AJS3_A33AlbProEst ;
   private byte[] P0AJS3_A1782AlbProEso ;
   private String[] P0AJS3_A7101AlbLic ;
   private String[] P0AJS3_A10017AlbFmd ;
   private boolean[] P0AJS3_n10017AlbFmd ;
   private String[] P0AJS3_A3865AlbHorSal ;
   private String[] P0AJS3_A3868AlbMat ;
   private int[] P0AJS3_A1243GuiRemCli ;
   private String[] P0AJS4_A396EmprCod ;
   private long[] P0AJS4_A30AlbProCod ;
   private String[] P0AJS4_A916AlbPObs ;
   private byte[] P0AJS4_A915AlbPObsLin ;
   private String[] P0AJS5_A396EmprCod ;
   private long[] P0AJS5_A30AlbProCod ;
   private String[] P0AJS5_A12184DltObs ;
   private boolean[] P0AJS5_n12184DltObs ;
   private byte[] P0AJS5_A12185DltLinObs ;
   private String[] P0AJS8_A396EmprCod ;
   private String[] P0AJS8_A130BarCodPar ;
   private byte[] P0AJS8_A132BarCodReo ;
   private int[] P0AJS8_A129BarCod ;
   private int[] P0AJS8_A252CliCod ;
   private boolean[] P0AJS8_n252CliCod ;
   private String[] P0AJS8_A143BarDisNum ;
   private String[] P0AJS8_A1234BarNomCli ;
   private String[] P0AJS8_A135BarColNom ;
   private java.math.BigDecimal[] P0AJS8_A166BarKgm ;
   private boolean[] P0AJS8_n166BarKgm ;
   private String[] P0AJS10_A396EmprCod ;
   private String[] P0AJS10_A130BarCodPar ;
   private byte[] P0AJS10_A132BarCodReo ;
   private int[] P0AJS10_A129BarCod ;
   private long[] P0AJS10_A30AlbProCod ;
   private String[] P0AJS10_A2829BarProPer ;
   private int[] P0AJS10_A136BarColNum ;
   private java.math.BigDecimal[] P0AJS10_A1261BarAlbKgmE ;
   private int[] P0AJS10_A1265BarAlbPie ;
   private short[] P0AJS10_A3271AlbHdrAnc ;
   private short[] P0AJS10_A5019AlbHdrgm2 ;
   private byte[] P0AJS10_A213BarSit ;
   private String[] P0AJS10_A12909CliImpMerm ;
   private String[] P0AJS10_A13236CliFacMtsP ;
   private java.math.BigDecimal[] P0AJS10_A1263BarAlbMtrE ;
   private int[] P0AJS10_A252CliCod ;
   private boolean[] P0AJS10_n252CliCod ;
   private String[] P0AJS10_A212BarSer ;
   private java.math.BigDecimal[] P0AJS10_A2243BarKgsCli ;
   private boolean[] P0AJS10_n2243BarKgsCli ;
   private String[] P0AJS10_A1652BarSerDsc ;
   private String[] P0AJS10_A143BarDisNum ;
   private String[] P0AJS10_A1234BarNomCli ;
   private String[] P0AJS10_A135BarColNom ;
   private String[] P0AJS10_A2010BarTipDis ;
   private short[] P0AJS10_A1206TubCod ;
   private boolean[] P0AJS10_n1206TubCod ;
   private int[] P0AJS10_A1266BarAlbTub ;
   private String[] P0AJS10_A1207TubNom ;
   private boolean[] P0AJS10_n1207TubNom ;
   private String[] P0AJS10_A2441AlbHdrObs ;
   private byte[] P0AJS10_A14330BarPriorid ;
   private java.math.BigDecimal[] P0AJS10_A166BarKgm ;
   private boolean[] P0AJS10_n166BarKgm ;
   private String[] P0AJS11_A396EmprCod ;
   private long[] P0AJS11_A30AlbProCod ;
   private int[] P0AJS11_A129BarCod ;
   private byte[] P0AJS11_A132BarCodReo ;
   private String[] P0AJS11_A130BarCodPar ;
   private java.math.BigDecimal[] P0AJS11_A1276FasMtr ;
   private java.math.BigDecimal[] P0AJS11_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0AJS11_A8195GuiFasPBM ;
   private boolean[] P0AJS11_n8195GuiFasPBM ;
   private String[] P0AJS11_A460FasDsc ;
   private String[] P0AJS11_A457FasCod ;
   private java.math.BigDecimal[] P0AJS11_A1275FasKgm ;
   private java.math.BigDecimal[] P0AJS11_A8194GuiFasPBK ;
   private boolean[] P0AJS11_n8194GuiFasPBK ;
   private short[] P0AJS11_A1240GuiFasLin ;
   private int[] P0AJS12_A44AlbRecCod ;
   private String[] P0AJS12_A396EmprCod ;
   private String[] P0AJS12_A130BarCodPar ;
   private byte[] P0AJS12_A132BarCodReo ;
   private int[] P0AJS12_A129BarCod ;
   private String[] P0AJS12_A6463AlbRLote ;
   private java.math.BigDecimal[] P0AJS12_A6465AlbRLu ;
   private String[] P0AJS12_A4602AlbRMdlCod ;
   private String[] P0AJS12_A6464AlbRTelar ;
   private String[] P0AJS12_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AJS12_A6470AlbRTara ;
   private String[] P0AJS12_A200BarPieCod ;
   private String[] P0AJS13_A396EmprCod ;
   private int[] P0AJS13_A252CliCod ;
   private boolean[] P0AJS13_n252CliCod ;
   private String[] P0AJS13_A279CliNom ;
   private String[] P0AJS13_A260CliDom ;
   private String[] P0AJS13_A256CliCp ;
   private boolean[] P0AJS13_n256CliCp ;
   private String[] P0AJS13_A295CliPob ;
   private String[] P0AJS13_A278CliNif ;
   private String[] P0AJS13_A13012CliImpReop ;
   private String[] P0AJS14_A396EmprCod ;
   private byte[] P0AJS14_A266CliEnvLin ;
   private int[] P0AJS14_A252CliCod ;
   private boolean[] P0AJS14_n252CliCod ;
   private String[] P0AJS14_A267CliEnvNom ;
   private String[] P0AJS14_A265CliEnvDom ;
   private String[] P0AJS14_A264CliEnvCp ;
   private String[] P0AJS14_A10775CliEnvCp2 ;
   private String[] P0AJS14_A268CliEnvPob ;
   private String[] P0AJS15_A396EmprCod ;
   private String[] P0AJS15_A10887Cod_Idtx ;
   private String[] P0AJS15_A10888Dsc_Idtx ;
   private boolean[] P0AJS15_n10888Dsc_Idtx ;
   private String[] P0AJS15_A12703Imp_Idtx ;
   private boolean[] P0AJS15_n12703Imp_Idtx ;
   private java.math.BigDecimal[] P0AJS16_A170BarKilLan ;
   private com.genexus.webpanels.WebSession AV132WEBSession ;
}

final  class paguagrmodacopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJS2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJS3", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.AlbProPri, T2.CliCp2, T2.CliCp, T1.AlbPdTipAT, T1.AlbProfch, T1.AlbFecSal, T1.AlbPdATCUD, T1.AlbDomEnv, T1.AlbPdSerAT, T3.EmprNom, T1.AlbMarca, T1.AlbProEnt, T1.AlbProEst, T1.AlbProEso, T1.AlbLic, T1.AlbFmd, T1.AlbHorSal, T1.AlbMat, T1.GuiRemCli AS GuiRemCli FROM ((TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod  FOR UPDATE OF T1.AlbProEst, T1.AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJS4", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJS5", "SELECT EmprCod, AlbProCod, DltObs, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AJS6", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P0AJS8", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarDisNum, T1.BarNomCli, T1.BarColNom, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJS10", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.BarProPer, T2.BarColNum, T1.BarAlbKgmE, T1.BarAlbPie, T1.AlbHdrAnc, T1.AlbHdrgm2, T2.BarSit, T5.CliImpMerm, T5.CliFacMtsP, T1.BarAlbMtrE, T2.CliCod, T2.BarSer, T1.BarKgsCli, T2.BarSerDsc, T2.BarDisNum, T2.BarNomCli, T2.BarColNom, T2.BarTipDis, T1.TubCod, T1.BarAlbTub, T3.TubNom, T1.AlbHdrObs, T2.BarPriorid, COALESCE( T6.BarKgm, 0) AS BarKgm FROM (((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T2.CliCod) LEFT JOIN TXPTUBOS T3 ON T3.EmprCod = T1.EmprCod AND T3.TubCod = T1.TubCod) INNER JOIN TXPCALPRD T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJS11", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasMtr, T1.GuiFasPMt, T1.GuiFasPBM, T2.FasDsc, T1.FasCod, T1.FasKgm, T1.GuiFasPBK, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJS12", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T2.AlbRTara, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJS13", "SELECT EmprCod, CliCod, CliNom, CliDom, CliCp, CliPob, CliNif, CliImpReop FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJS14", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvCp2, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJS15", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx, Imp_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJS16", "SELECT SUM(BarKilLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((String[]) buf[18])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 20);
               ((String[]) buf[23])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(20, 8);
               ((String[]) buf[26])[0] = rslt.getString(21, 20);
               ((int[]) buf[27])[0] = rslt.getInt(22);
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((String[]) buf[21])[0] = rslt.getString(20, 8);
               ((String[]) buf[22])[0] = rslt.getString(21, 13);
               ((String[]) buf[23])[0] = rslt.getString(22, 13);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 60);
               ((byte[]) buf[31])[0] = rslt.getByte(28);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 7 :
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
            case 8 :
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
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

