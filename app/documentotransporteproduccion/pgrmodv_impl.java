package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pgrmodv_impl extends GXWebReport
{
   public pgrmodv_impl( com.genexus.internet.HttpContext context )
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
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV51TextoCopia = httpContext.GetPar( "TextoCopia") ;
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
      M_bot = 13 ;
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
         P_lines = (int)(gxYPage-(lineHeight*13)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV62ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRMODA", ""), GXv_char1) ;
         pgrmodv_impl.this.AV62ContDsc = GXv_char1[0] ;
         GXt_char2 = AV72Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pgrmodv_impl.this.A396EmprCod = GXv_char1[0] ;
         pgrmodv_impl.this.GXt_char2 = GXv_char4[0] ;
         AV72Firmad = GXt_char2 ;
         /* Using cursor P017Z2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P017Z2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P017Z2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P017Z2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P017Z2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P017Z2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P017Z2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P017Z2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P017Z2_n8336EmpItm3[0] ;
            AV69Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV70Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P017Z3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1259AlbDomEnv = P017Z3_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P017Z3_n1259AlbDomEnv[0] ;
            A39AlbProPri = P017Z3_A39AlbProPri[0] ;
            A10017AlbFmd = P017Z3_A10017AlbFmd[0] ;
            n10017AlbFmd = P017Z3_n10017AlbFmd[0] ;
            A7101AlbLic = P017Z3_A7101AlbLic[0] ;
            A407EmprNom = P017Z3_A407EmprNom[0] ;
            n407EmprNom = P017Z3_n407EmprNom[0] ;
            A5140AlbMarca = P017Z3_A5140AlbMarca[0] ;
            A1879AlbProEnt = P017Z3_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P017Z3_n1879AlbProEnt[0] ;
            A33AlbProEst = P017Z3_A33AlbProEst[0] ;
            A1782AlbProEso = P017Z3_A1782AlbProEso[0] ;
            A3865AlbHorSal = P017Z3_A3865AlbHorSal[0] ;
            A3868AlbMat = P017Z3_A3868AlbMat[0] ;
            A34AlbProfch = P017Z3_A34AlbProfch[0] ;
            A1243GuiRemCli = P017Z3_A1243GuiRemCli[0] ;
            A407EmprNom = P017Z3_A407EmprNom[0] ;
            n407EmprNom = P017Z3_n407EmprNom[0] ;
            AV16CliCod = A1243GuiRemCli ;
            AV22CliEnvDom = A1259AlbDomEnv ;
            AV29Prioridad = A39AlbProPri ;
            /* Execute user subroutine: 'CLIENTE' */
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
            AV71Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV73Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV71Texto_fd = AV73Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV72Firmad) ;
            }
            else
            {
               AV71Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV74AtId = " " ;
            if ( GXutil.strcmp(A7101AlbLic, " ") != 0 )
            {
               AV74AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            AV21EmprNom = A407EmprNom ;
            AV57VDoc = httpContext.getMessage( "Guia de Remessa Nº", "") ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV57VDoc = httpContext.getMessage( "Guia de Transito Nº", "") ;
            }
            if ( AV49Copias == 1 )
            {
               AV46vCopia = httpContext.getMessage( "DUPLICADO", "") ;
            }
            AV58i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV59vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Using cursor P017Z4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A916AlbPObs = P017Z4_A916AlbPObs[0] ;
                  A915AlbPObsLin = P017Z4_A915AlbPObsLin[0] ;
                  if ( AV58i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV59vObs[AV58i-1] = A916AlbPObs ;
                  AV58i = (byte)(AV58i+1) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            else
            {
               /* Using cursor P017Z5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A12184DltObs = P017Z5_A12184DltObs[0] ;
                  n12184DltObs = P017Z5_n12184DltObs[0] ;
                  A12185DltLinObs = P017Z5_A12185DltLinObs[0] ;
                  if ( AV58i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV59vObs[AV58i-1] = A12184DltObs ;
                  AV58i = (byte)(AV58i+1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            AV75TxtAnulado = "" ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
            {
               AV75TxtAnulado = httpContext.getMessage( "ANULADO", "") ;
            }
            AV48ContLine = (byte)(0) ;
            AV52Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            AV81Albprocod = A30AlbProCod ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Execute user subroutine: 'ALBBAR' */
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
            else
            {
               /* Execute user subroutine: 'DLT001' */
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
            }
            h17Z0( false, 26) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54TotKgs, "ZZZ,ZZ9.99")), 623, Gx_line+6, 697, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TotPzas), "ZZZZZ9")), 580, Gx_line+6, 625, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61TotVal, "ZZZ,ZZ9.99")), 701, Gx_line+6, 775, Gx_line+22, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+26) ;
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            /* Using cursor P017Z6 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h17Z0( true, 0) ;
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
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV54TotKgs = DecimalUtil.doubleToDec(0) ;
      AV53TotPzas = 0 ;
      AV61TotVal = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P017Z8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(AV81Albprocod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = P017Z8_A130BarCodPar[0] ;
         A132BarCodReo = P017Z8_A132BarCodReo[0] ;
         A129BarCod = P017Z8_A129BarCod[0] ;
         A136BarColNum = P017Z8_A136BarColNum[0] ;
         A252CliCod = P017Z8_A252CliCod[0] ;
         n252CliCod = P017Z8_n252CliCod[0] ;
         A143BarDisNum = P017Z8_A143BarDisNum[0] ;
         A1234BarNomCli = P017Z8_A1234BarNomCli[0] ;
         A135BarColNom = P017Z8_A135BarColNom[0] ;
         A1261BarAlbKgmE = P017Z8_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P017Z8_A1265BarAlbPie[0] ;
         A1652BarSerDsc = P017Z8_A1652BarSerDsc[0] ;
         A2243BarKgsCli = P017Z8_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P017Z8_n2243BarKgsCli[0] ;
         A1262BarPreKgm = P017Z8_A1262BarPreKgm[0] ;
         A1206TubCod = P017Z8_A1206TubCod[0] ;
         n1206TubCod = P017Z8_n1206TubCod[0] ;
         A1207TubNom = P017Z8_A1207TubNom[0] ;
         n1207TubNom = P017Z8_n1207TubNom[0] ;
         A166BarKgm = P017Z8_A166BarKgm[0] ;
         n166BarKgm = P017Z8_n166BarKgm[0] ;
         A3915EmpNumDec = P017Z8_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P017Z8_n3915EmpNumDec[0] ;
         A1208TubPre = P017Z8_A1208TubPre[0] ;
         n1208TubPre = P017Z8_n1208TubPre[0] ;
         A1266BarAlbTub = P017Z8_A1266BarAlbTub[0] ;
         A3915EmpNumDec = P017Z8_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P017Z8_n3915EmpNumDec[0] ;
         A136BarColNum = P017Z8_A136BarColNum[0] ;
         A252CliCod = P017Z8_A252CliCod[0] ;
         n252CliCod = P017Z8_n252CliCod[0] ;
         A143BarDisNum = P017Z8_A143BarDisNum[0] ;
         A1234BarNomCli = P017Z8_A1234BarNomCli[0] ;
         A135BarColNom = P017Z8_A135BarColNom[0] ;
         A1652BarSerDsc = P017Z8_A1652BarSerDsc[0] ;
         A1207TubNom = P017Z8_A1207TubNom[0] ;
         n1207TubNom = P017Z8_n1207TubNom[0] ;
         A1208TubPre = P017Z8_A1208TubPre[0] ;
         n1208TubPre = P017Z8_n1208TubPre[0] ;
         A166BarKgm = P017Z8_A166BarKgm[0] ;
         n166BarKgm = P017Z8_n166BarKgm[0] ;
         if ( A3915EmpNumDec == 2 )
         {
            A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 2) ;
         }
         else
         {
            if ( A3915EmpNumDec == 0 )
            {
               A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 0) ;
            }
            else
            {
               A1281TubImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         AV50barcolnum = A136BarColNum ;
         AV55Hdr = ((GXutil.strcmp(AV83CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A129BarCod, 8, 0) : ((A132BarCodReo>0) ? GXutil.str( A129BarCod, 8, 0)+" "+GXutil.str( A132BarCodReo, 1, 0) : GXutil.str( A129BarCod, 8, 0))) ;
         AV84Barcod = A129BarCod ;
         AV85Barcodreo = A132BarCodReo ;
         AV86Barcodpar = A130BarCodPar ;
         AV16CliCod = A252CliCod ;
         AV76Bardisnum = A143BarDisNum ;
         AV78BarNomCli = A1234BarNomCli ;
         AV79Barcolnom = A135BarColNom ;
         AV56KgsE = A166BarKgm ;
         AV66KgsS = A1261BarAlbKgmE ;
         AV80BarALbPie = (short)(A1265BarAlbPie) ;
         AV77BarSerDsc = A1652BarSerDsc ;
         if ( A2243BarKgsCli.doubleValue() != 0 )
         {
            AV66KgsS = A2243BarKgsCli ;
         }
         AV60vValor = A1262BarPreKgm ;
         h17Z0( false, 18) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Hdr, "")), 67, Gx_line+1, 148, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50barcolnum), "ZZZZZZ")), 544, Gx_line+0, 589, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80BarALbPie), "ZZZ9")), 595, Gx_line+0, 625, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66KgsS, "ZZZZZ9.99")), 630, Gx_line+0, 697, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Barcolnom, "")), 444, Gx_line+1, 540, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77BarSerDsc, "")), 153, Gx_line+1, 344, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Bardisnum, "")), 3, Gx_line+1, 62, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60vValor, "ZZZ,ZZ9.99")), 701, Gx_line+0, 775, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78BarNomCli, "")), 344, Gx_line+1, 440, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         AV48ContLine = (byte)(AV48ContLine+1) ;
         AV53TotPzas = (int)(AV53TotPzas+A1265BarAlbPie) ;
         AV54TotKgs = AV54TotKgs.add(AV66KgsS) ;
         AV61TotVal = AV61TotVal.add(AV60vValor) ;
         /* Using cursor P017Z9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A457FasCod = P017Z9_A457FasCod[0] ;
            A1276FasMtr = P017Z9_A1276FasMtr[0] ;
            A1242GuiFasPMt = P017Z9_A1242GuiFasPMt[0] ;
            A8195GuiFasPBM = P017Z9_A8195GuiFasPBM[0] ;
            n8195GuiFasPBM = P017Z9_n8195GuiFasPBM[0] ;
            A460FasDsc = P017Z9_A460FasDsc[0] ;
            A1241GuiFasPKg = P017Z9_A1241GuiFasPKg[0] ;
            A1275FasKgm = P017Z9_A1275FasKgm[0] ;
            A8194GuiFasPBK = P017Z9_A8194GuiFasPBK[0] ;
            n8194GuiFasPBK = P017Z9_n8194GuiFasPBK[0] ;
            A1240GuiFasLin = P017Z9_A1240GuiFasLin[0] ;
            A460FasDsc = P017Z9_A460FasDsc[0] ;
            AV65Uni = "" ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1242GuiFasPMt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) )
            {
               AV60vValor = A1242GuiFasPMt ;
               AV65Uni = httpContext.getMessage( "M", "") ;
               AV68FasMtr = A1276FasMtr ;
               if ( A8195GuiFasPBM.doubleValue() != 0 )
               {
                  AV68FasMtr = A8195GuiFasPBM ;
               }
               h17Z0( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 220, Gx_line+2, 425, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")), 630, Gx_line+0, 697, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60vValor, "ZZZ,ZZ9.99")), 701, Gx_line+0, 775, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Uni, "")), 699, Gx_line+0, 707, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               AV60vValor = A1241GuiFasPKg ;
               AV65Uni = httpContext.getMessage( "K", "") ;
               AV67KgsFasS = A1275FasKgm ;
               if ( A8194GuiFasPBK.doubleValue() != 0 )
               {
                  AV67KgsFasS = A8194GuiFasPBK ;
               }
               h17Z0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 220, Gx_line+0, 425, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67KgsFasS, "ZZZZZ9.99")), 630, Gx_line+0, 697, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60vValor, "ZZZ,ZZ9.99")), 701, Gx_line+0, 775, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Uni, "")), 701, Gx_line+0, 709, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV48ContLine = (byte)(AV48ContLine+1) ;
            AV61TotVal = AV61TotVal.add(AV60vValor) ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( ! (0==A1206TubCod) )
         {
            AV63TubImp = A1281TubImp ;
            AV64TubPre = A1208TubPre ;
            h17Z0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1207TubNom, "")), 220, Gx_line+0, 440, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9")), 652, Gx_line+0, 697, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 701, Gx_line+0, 709, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TubPre, "ZZ9.99")), 730, Gx_line+0, 775, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'DLT001' Routine */
      returnInSub = false ;
      AV54TotKgs = DecimalUtil.doubleToDec(0) ;
      AV53TotPzas = 0 ;
      AV61TotVal = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P017Z10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(AV81Albprocod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A12178DltP = P017Z10_A12178DltP[0] ;
         A12177DltR = P017Z10_A12177DltR[0] ;
         A12176DltHdr = P017Z10_A12176DltHdr[0] ;
         A12153DltColNum = P017Z10_A12153DltColNum[0] ;
         n12153DltColNum = P017Z10_n12153DltColNum[0] ;
         A12145DltKgs = P017Z10_A12145DltKgs[0] ;
         n12145DltKgs = P017Z10_n12145DltKgs[0] ;
         A12147DltPzs = P017Z10_A12147DltPzs[0] ;
         n12147DltPzs = P017Z10_n12147DltPzs[0] ;
         A12151DltArtDsc = P017Z10_A12151DltArtDsc[0] ;
         n12151DltArtDsc = P017Z10_n12151DltArtDsc[0] ;
         A12186DltKgsCli = P017Z10_A12186DltKgsCli[0] ;
         n12186DltKgsCli = P017Z10_n12186DltKgsCli[0] ;
         A12163DltPreKg = P017Z10_A12163DltPreKg[0] ;
         n12163DltPreKg = P017Z10_n12163DltPreKg[0] ;
         A12187DltTubo = P017Z10_A12187DltTubo[0] ;
         n12187DltTubo = P017Z10_n12187DltTubo[0] ;
         A12149DltTubos = P017Z10_A12149DltTubos[0] ;
         n12149DltTubos = P017Z10_n12149DltTubos[0] ;
         A12188DltTuboN = P017Z10_A12188DltTuboN[0] ;
         n12188DltTuboN = P017Z10_n12188DltTuboN[0] ;
         AV50barcolnum = A12153DltColNum ;
         AV55Hdr = ((GXutil.strcmp(AV83CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A12176DltHdr, 8, 0) : ((A12177DltR>0) ? GXutil.str( A12176DltHdr, 8, 0)+" "+GXutil.str( A12177DltR, 1, 0) : GXutil.str( A12176DltHdr, 8, 0))) ;
         AV84Barcod = A12176DltHdr ;
         AV85Barcodreo = A12177DltR ;
         AV86Barcodpar = A12178DltP ;
         /* Execute user subroutine: 'BARCAD' */
         S1310 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV56KgsE = AV82BarKgm ;
         AV66KgsS = A12145DltKgs ;
         AV80BarALbPie = (short)(A12147DltPzs) ;
         AV77BarSerDsc = A12151DltArtDsc ;
         if ( A12186DltKgsCli.doubleValue() != 0 )
         {
            AV66KgsS = A12186DltKgsCli ;
         }
         AV60vValor = A12163DltPreKg ;
         h17Z0( false, 18) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Hdr, "")), 67, Gx_line+1, 148, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50barcolnum), "ZZZZZZ")), 544, Gx_line+0, 589, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80BarALbPie), "ZZZ9")), 595, Gx_line+0, 625, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66KgsS, "ZZZZZ9.99")), 630, Gx_line+0, 697, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Barcolnom, "")), 444, Gx_line+1, 540, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77BarSerDsc, "")), 153, Gx_line+1, 344, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Bardisnum, "")), 3, Gx_line+1, 62, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60vValor, "ZZZ,ZZ9.99")), 701, Gx_line+0, 775, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78BarNomCli, "")), 344, Gx_line+1, 440, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         AV48ContLine = (byte)(AV48ContLine+1) ;
         AV53TotPzas = (int)(AV53TotPzas+A12147DltPzs) ;
         AV54TotKgs = AV54TotKgs.add(AV66KgsS) ;
         AV61TotVal = AV61TotVal.add(AV60vValor) ;
         /* Using cursor P017Z11 */
         pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A12175DltMtsFs = P017Z11_A12175DltMtsFs[0] ;
            n12175DltMtsFs = P017Z11_n12175DltMtsFs[0] ;
            A12190DltPrMFs = P017Z11_A12190DltPrMFs[0] ;
            n12190DltPrMFs = P017Z11_n12190DltPrMFs[0] ;
            A12192DltPrMBFs = P017Z11_A12192DltPrMBFs[0] ;
            n12192DltPrMBFs = P017Z11_n12192DltPrMBFs[0] ;
            A12173DltFasDsc = P017Z11_A12173DltFasDsc[0] ;
            n12173DltFasDsc = P017Z11_n12173DltFasDsc[0] ;
            A12189DltPrKFs = P017Z11_A12189DltPrKFs[0] ;
            n12189DltPrKFs = P017Z11_n12189DltPrKFs[0] ;
            A12174DltKgsFs = P017Z11_A12174DltKgsFs[0] ;
            n12174DltKgsFs = P017Z11_n12174DltKgsFs[0] ;
            A12191DltPrKBFs = P017Z11_A12191DltPrKBFs[0] ;
            n12191DltPrKBFs = P017Z11_n12191DltPrKBFs[0] ;
            A12182DltLin = P017Z11_A12182DltLin[0] ;
            AV65Uni = "" ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12190DltPrMFs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12175DltMtsFs)==0) )
            {
               AV60vValor = A12190DltPrMFs ;
               AV65Uni = httpContext.getMessage( "M", "") ;
               AV68FasMtr = A12175DltMtsFs ;
               if ( A12192DltPrMBFs.doubleValue() != 0 )
               {
                  AV68FasMtr = A12192DltPrMBFs ;
               }
               h17Z0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12173DltFasDsc, "")), 220, Gx_line+0, 425, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12175DltMtsFs, "ZZZZZ9.99")), 630, Gx_line+0, 697, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60vValor, "ZZZ,ZZ9.99")), 701, Gx_line+0, 775, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            else
            {
               AV60vValor = A12189DltPrKFs ;
               AV65Uni = httpContext.getMessage( "K", "") ;
               AV67KgsFasS = A12174DltKgsFs ;
               if ( A12191DltPrKBFs.doubleValue() != 0 )
               {
                  AV67KgsFasS = A12191DltPrKBFs ;
               }
               h17Z0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12173DltFasDsc, "")), 220, Gx_line+0, 425, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A12174DltKgsFs, "ZZZZZ9.99")), 630, Gx_line+0, 697, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60vValor, "ZZZ,ZZ9.99")), 701, Gx_line+0, 775, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            AV48ContLine = (byte)(AV48ContLine+1) ;
            AV61TotVal = AV61TotVal.add(AV60vValor) ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         if ( ! (0==A12187DltTubo) )
         {
            GXv_decimal5[0] = AV64TubPre ;
            new app.ppreciotubo(remoteHandle, context).execute( A396EmprCod, A12187DltTubo, GXv_decimal5) ;
            pgrmodv_impl.this.AV64TubPre = GXv_decimal5[0] ;
            AV63TubImp = GXutil.roundDecimal( AV64TubPre.multiply(DecimalUtil.doubleToDec(A12149DltTubos)), 2) ;
            h17Z0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12188DltTuboN, "")), 220, Gx_line+1, 440, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12149DltTubos), "ZZZZZ9")), 652, Gx_line+0, 697, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "U", ""), 701, Gx_line+0, 709, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TubPre, "ZZ9.99")), 730, Gx_line+0, 775, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S1310( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P017Z13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV84Barcod), Byte.valueOf(AV85Barcodreo), AV86Barcodpar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A130BarCodPar = P017Z13_A130BarCodPar[0] ;
         A132BarCodReo = P017Z13_A132BarCodReo[0] ;
         A129BarCod = P017Z13_A129BarCod[0] ;
         A252CliCod = P017Z13_A252CliCod[0] ;
         n252CliCod = P017Z13_n252CliCod[0] ;
         A143BarDisNum = P017Z13_A143BarDisNum[0] ;
         A1234BarNomCli = P017Z13_A1234BarNomCli[0] ;
         A135BarColNom = P017Z13_A135BarColNom[0] ;
         A166BarKgm = P017Z13_A166BarKgm[0] ;
         n166BarKgm = P017Z13_n166BarKgm[0] ;
         A166BarKgm = P017Z13_A166BarKgm[0] ;
         n166BarKgm = P017Z13_n166BarKgm[0] ;
         AV16CliCod = A252CliCod ;
         AV82BarKgm = A166BarKgm ;
         AV76Bardisnum = A143BarDisNum ;
         AV78BarNomCli = A1234BarNomCli ;
         AV79Barcolnom = A135BarColNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      AV83CliImpReop = httpContext.getMessage( "N", "") ;
      /* Using cursor P017Z14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A252CliCod = P017Z14_A252CliCod[0] ;
         n252CliCod = P017Z14_n252CliCod[0] ;
         A279CliNom = P017Z14_A279CliNom[0] ;
         A260CliDom = P017Z14_A260CliDom[0] ;
         A256CliCp = P017Z14_A256CliCp[0] ;
         A295CliPob = P017Z14_A295CliPob[0] ;
         A278CliNif = P017Z14_A278CliNif[0] ;
         A13012CliImpReop = P017Z14_A13012CliImpReop[0] ;
         AV17CliNom = A279CliNom ;
         AV18CliDom = A260CliDom ;
         AV19Clicp = A256CliCp ;
         AV20CliPob = A295CliPob ;
         AV47CliNif = A278CliNif ;
         AV83CliImpReop = A13012CliImpReop ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      /* Execute user subroutine: 'ENVIO' */
      S151 ();
      if (returnInSub) return;
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P017Z15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV22CliEnvDom)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A266CliEnvLin = P017Z15_A266CliEnvLin[0] ;
         A252CliCod = P017Z15_A252CliCod[0] ;
         n252CliCod = P017Z15_n252CliCod[0] ;
         A267CliEnvNom = P017Z15_A267CliEnvNom[0] ;
         A265CliEnvDom = P017Z15_A265CliEnvDom[0] ;
         A264CliEnvCp = P017Z15_A264CliEnvCp[0] ;
         A268CliEnvPob = P017Z15_A268CliEnvPob[0] ;
         AV23CliENom = A267CliEnvNom ;
         AV24CliEDom = A265CliEnvDom ;
         AV25CliEcp = A264CliEnvCp ;
         AV26CliEPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void h17Z0( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçôes:", ""), 52, Gx_line+4, 135, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[1-1], "")), 145, Gx_line+4, 511, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[2-1], "")), 145, Gx_line+20, 511, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nota: Eventuais reclamações apenas serão consideradas no prazo de 8 dias, não se aceitando devoluções de malha cortada ou manufacturada.", ""), 15, Gx_line+113, 774, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[3-1], "")), 145, Gx_line+35, 511, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[4-1], "")), 145, Gx_line+50, 511, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[5-1], "")), 145, Gx_line+66, 511, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+129, 780, Gx_line+129, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62ContDsc, "")), 694, Gx_line+97, 778, Gx_line+110, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Texto_1, "")), 60, Gx_line+132, 728, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Texto_2, "")), 80, Gx_line+149, 706, Gx_line+166, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Texto_fd, "")), 15, Gx_line+97, 245, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74AtId, "")), 288, Gx_line+97, 414, Gx_line+110, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+166) ;
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
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS.", ""), 100, Gx_line+376, 122, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 183, Gx_line+376, 277, Gx_line+392, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 594, Gx_line+378, 631, Gx_line+394, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qui./Mtr.", ""), 643, Gx_line+370, 689, Gx_line+386, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(6, Gx_line+275, 780, Gx_line+364, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(6, Gx_line+368, 780, Gx_line+402, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 30, Gx_line+284, 91, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 30, Gx_line+302, 122, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 30, Gx_line+320, 61, Gx_line+336, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora de Carga:", ""), 30, Gx_line+336, 119, Gx_line+352, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Contibuinte:", ""), 535, Gx_line+284, 621, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 535, Gx_line+302, 647, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 535, Gx_line+336, 590, Gx_line+352, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Cor", ""), 467, Gx_line+376, 501, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(154, Gx_line+368, 154, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(344, Gx_line+369, 344, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 549, Gx_line+377, 590, Gx_line+393, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+369, 592, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(548, Gx_line+369, 548, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 130, Gx_line+284, 175, Gx_line+301, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 130, Gx_line+320, 181, Gx_line+337, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 130, Gx_line+302, 213, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 664, Gx_line+284, 769, Gx_line+301, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalaçoes", ""), 664, Gx_line+302, 745, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Encom.", ""), 13, Gx_line+376, 68, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(66, Gx_line+369, 66, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3868AlbMat, "")), 605, Gx_line+336, 710, Gx_line+353, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), 130, Gx_line+336, 223, Gx_line+353, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(633, Gx_line+369, 633, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 646, Gx_line+385, 688, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(702, Gx_line+369, 702, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 733, Gx_line+370, 762, Gx_line+386, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Unitario", ""), 725, Gx_line+385, 771, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Cor", ""), 379, Gx_line+378, 411, Gx_line+394, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(444, Gx_line+369, 444, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17CliNom, "")), 467, Gx_line+188, 656, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CliDom, "")), 467, Gx_line+207, 681, Gx_line+225, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliPob, "")), 467, Gx_line+240, 656, Gx_line+258, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TextoCopia, "")), 686, Gx_line+147, 781, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 686, Gx_line+121, 781, Gx_line+142, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 467, Gx_line+121, 635, Gx_line+142, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(446, Gx_line+177, 780, Gx_line+267, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 6, Gx_line+15, 763, Gx_line+101) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "95455c83-4215-4a0c-83f2-f37dd13189ec", "", context.getHttpContext().getTheme( )), 6, Gx_line+229, 431, Gx_line+265) ;
               getPrinter().GxAttris("Arial", 28, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TxtAnulado, "")), 31, Gx_line+143, 407, Gx_line+190, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+409) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.pgrmodv");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.pgrmodv");
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
      AV15ImpCod = "" ;
      AV51TextoCopia = "" ;
      AV62ContDsc = "" ;
      AV72Firmad = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P017Z2_A396EmprCod = new String[] {""} ;
      P017Z2_A8335EmpItm2 = new String[] {""} ;
      P017Z2_n8335EmpItm2 = new boolean[] {false} ;
      P017Z2_A8334EmpItm1 = new String[] {""} ;
      P017Z2_n8334EmpItm1 = new boolean[] {false} ;
      P017Z2_A8337EmpItm4 = new String[] {""} ;
      P017Z2_n8337EmpItm4 = new boolean[] {false} ;
      P017Z2_A8336EmpItm3 = new String[] {""} ;
      P017Z2_n8336EmpItm3 = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      AV69Texto_1 = "" ;
      AV70Texto_2 = "" ;
      P017Z3_A396EmprCod = new String[] {""} ;
      P017Z3_A30AlbProCod = new long[1] ;
      P017Z3_A1259AlbDomEnv = new byte[1] ;
      P017Z3_n1259AlbDomEnv = new boolean[] {false} ;
      P017Z3_A39AlbProPri = new String[] {""} ;
      P017Z3_A10017AlbFmd = new String[] {""} ;
      P017Z3_n10017AlbFmd = new boolean[] {false} ;
      P017Z3_A7101AlbLic = new String[] {""} ;
      P017Z3_A407EmprNom = new String[] {""} ;
      P017Z3_n407EmprNom = new boolean[] {false} ;
      P017Z3_A5140AlbMarca = new String[] {""} ;
      P017Z3_A1879AlbProEnt = new String[] {""} ;
      P017Z3_n1879AlbProEnt = new boolean[] {false} ;
      P017Z3_A33AlbProEst = new byte[1] ;
      P017Z3_A1782AlbProEso = new byte[1] ;
      P017Z3_A3865AlbHorSal = new String[] {""} ;
      P017Z3_A3868AlbMat = new String[] {""} ;
      P017Z3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P017Z3_A1243GuiRemCli = new int[1] ;
      A39AlbProPri = "" ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      A407EmprNom = "" ;
      A5140AlbMarca = "" ;
      A1879AlbProEnt = "" ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV29Prioridad = "" ;
      AV71Texto_fd = "" ;
      AV73Firma4dig = "" ;
      AV74AtId = "" ;
      AV21EmprNom = "" ;
      AV57VDoc = "" ;
      AV46vCopia = "" ;
      AV59vObs = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV59vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P017Z4_A396EmprCod = new String[] {""} ;
      P017Z4_A30AlbProCod = new long[1] ;
      P017Z4_A916AlbPObs = new String[] {""} ;
      P017Z4_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      P017Z5_A396EmprCod = new String[] {""} ;
      P017Z5_A30AlbProCod = new long[1] ;
      P017Z5_A12184DltObs = new String[] {""} ;
      P017Z5_n12184DltObs = new boolean[] {false} ;
      P017Z5_A12185DltLinObs = new byte[1] ;
      A12184DltObs = "" ;
      AV75TxtAnulado = "" ;
      AV52Matricula = "" ;
      AV54TotKgs = DecimalUtil.ZERO ;
      AV61TotVal = DecimalUtil.ZERO ;
      P017Z8_A396EmprCod = new String[] {""} ;
      P017Z8_A130BarCodPar = new String[] {""} ;
      P017Z8_A132BarCodReo = new byte[1] ;
      P017Z8_A129BarCod = new int[1] ;
      P017Z8_A30AlbProCod = new long[1] ;
      P017Z8_A136BarColNum = new int[1] ;
      P017Z8_A252CliCod = new int[1] ;
      P017Z8_n252CliCod = new boolean[] {false} ;
      P017Z8_A143BarDisNum = new String[] {""} ;
      P017Z8_A1234BarNomCli = new String[] {""} ;
      P017Z8_A135BarColNom = new String[] {""} ;
      P017Z8_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z8_A1265BarAlbPie = new int[1] ;
      P017Z8_A1652BarSerDsc = new String[] {""} ;
      P017Z8_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z8_n2243BarKgsCli = new boolean[] {false} ;
      P017Z8_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z8_A1206TubCod = new short[1] ;
      P017Z8_n1206TubCod = new boolean[] {false} ;
      P017Z8_A1207TubNom = new String[] {""} ;
      P017Z8_n1207TubNom = new boolean[] {false} ;
      P017Z8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z8_n166BarKgm = new boolean[] {false} ;
      P017Z8_A3915EmpNumDec = new byte[1] ;
      P017Z8_n3915EmpNumDec = new boolean[] {false} ;
      P017Z8_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z8_n1208TubPre = new boolean[] {false} ;
      P017Z8_A1266BarAlbTub = new int[1] ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1207TubNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A1208TubPre = DecimalUtil.ZERO ;
      A1281TubImp = DecimalUtil.ZERO ;
      AV55Hdr = "" ;
      AV83CliImpReop = "" ;
      AV86Barcodpar = "" ;
      AV76Bardisnum = "" ;
      AV78BarNomCli = "" ;
      AV79Barcolnom = "" ;
      AV56KgsE = DecimalUtil.ZERO ;
      AV66KgsS = DecimalUtil.ZERO ;
      AV77BarSerDsc = "" ;
      AV60vValor = DecimalUtil.ZERO ;
      P017Z9_A457FasCod = new String[] {""} ;
      P017Z9_A396EmprCod = new String[] {""} ;
      P017Z9_A30AlbProCod = new long[1] ;
      P017Z9_A129BarCod = new int[1] ;
      P017Z9_A132BarCodReo = new byte[1] ;
      P017Z9_A130BarCodPar = new String[] {""} ;
      P017Z9_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z9_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z9_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z9_n8195GuiFasPBM = new boolean[] {false} ;
      P017Z9_A460FasDsc = new String[] {""} ;
      P017Z9_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z9_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z9_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z9_n8194GuiFasPBK = new boolean[] {false} ;
      P017Z9_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      AV65Uni = "" ;
      AV68FasMtr = DecimalUtil.ZERO ;
      AV67KgsFasS = DecimalUtil.ZERO ;
      AV63TubImp = DecimalUtil.ZERO ;
      AV64TubPre = DecimalUtil.ZERO ;
      P017Z10_A396EmprCod = new String[] {""} ;
      P017Z10_A12178DltP = new String[] {""} ;
      P017Z10_A12177DltR = new byte[1] ;
      P017Z10_A12176DltHdr = new int[1] ;
      P017Z10_A30AlbProCod = new long[1] ;
      P017Z10_A12153DltColNum = new int[1] ;
      P017Z10_n12153DltColNum = new boolean[] {false} ;
      P017Z10_A12145DltKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z10_n12145DltKgs = new boolean[] {false} ;
      P017Z10_A12147DltPzs = new int[1] ;
      P017Z10_n12147DltPzs = new boolean[] {false} ;
      P017Z10_A12151DltArtDsc = new String[] {""} ;
      P017Z10_n12151DltArtDsc = new boolean[] {false} ;
      P017Z10_A12186DltKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z10_n12186DltKgsCli = new boolean[] {false} ;
      P017Z10_A12163DltPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z10_n12163DltPreKg = new boolean[] {false} ;
      P017Z10_A12187DltTubo = new short[1] ;
      P017Z10_n12187DltTubo = new boolean[] {false} ;
      P017Z10_A12149DltTubos = new int[1] ;
      P017Z10_n12149DltTubos = new boolean[] {false} ;
      P017Z10_A12188DltTuboN = new String[] {""} ;
      P017Z10_n12188DltTuboN = new boolean[] {false} ;
      A12178DltP = "" ;
      A12145DltKgs = DecimalUtil.ZERO ;
      A12151DltArtDsc = "" ;
      A12186DltKgsCli = DecimalUtil.ZERO ;
      A12163DltPreKg = DecimalUtil.ZERO ;
      A12188DltTuboN = "" ;
      AV82BarKgm = DecimalUtil.ZERO ;
      P017Z11_A396EmprCod = new String[] {""} ;
      P017Z11_A30AlbProCod = new long[1] ;
      P017Z11_A12176DltHdr = new int[1] ;
      P017Z11_A12177DltR = new byte[1] ;
      P017Z11_A12178DltP = new String[] {""} ;
      P017Z11_A12175DltMtsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z11_n12175DltMtsFs = new boolean[] {false} ;
      P017Z11_A12190DltPrMFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z11_n12190DltPrMFs = new boolean[] {false} ;
      P017Z11_A12192DltPrMBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z11_n12192DltPrMBFs = new boolean[] {false} ;
      P017Z11_A12173DltFasDsc = new String[] {""} ;
      P017Z11_n12173DltFasDsc = new boolean[] {false} ;
      P017Z11_A12189DltPrKFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z11_n12189DltPrKFs = new boolean[] {false} ;
      P017Z11_A12174DltKgsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z11_n12174DltKgsFs = new boolean[] {false} ;
      P017Z11_A12191DltPrKBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z11_n12191DltPrKBFs = new boolean[] {false} ;
      P017Z11_A12182DltLin = new short[1] ;
      A12175DltMtsFs = DecimalUtil.ZERO ;
      A12190DltPrMFs = DecimalUtil.ZERO ;
      A12192DltPrMBFs = DecimalUtil.ZERO ;
      A12173DltFasDsc = "" ;
      A12189DltPrKFs = DecimalUtil.ZERO ;
      A12174DltKgsFs = DecimalUtil.ZERO ;
      A12191DltPrKBFs = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      P017Z13_A396EmprCod = new String[] {""} ;
      P017Z13_A130BarCodPar = new String[] {""} ;
      P017Z13_A132BarCodReo = new byte[1] ;
      P017Z13_A129BarCod = new int[1] ;
      P017Z13_A252CliCod = new int[1] ;
      P017Z13_n252CliCod = new boolean[] {false} ;
      P017Z13_A143BarDisNum = new String[] {""} ;
      P017Z13_A1234BarNomCli = new String[] {""} ;
      P017Z13_A135BarColNom = new String[] {""} ;
      P017Z13_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017Z13_n166BarKgm = new boolean[] {false} ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      P017Z14_A396EmprCod = new String[] {""} ;
      P017Z14_A252CliCod = new int[1] ;
      P017Z14_n252CliCod = new boolean[] {false} ;
      P017Z14_A279CliNom = new String[] {""} ;
      P017Z14_A260CliDom = new String[] {""} ;
      P017Z14_A256CliCp = new String[] {""} ;
      P017Z14_A295CliPob = new String[] {""} ;
      P017Z14_A278CliNif = new String[] {""} ;
      P017Z14_A13012CliImpReop = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A13012CliImpReop = "" ;
      P017Z15_A396EmprCod = new String[] {""} ;
      P017Z15_A266CliEnvLin = new byte[1] ;
      P017Z15_A252CliCod = new int[1] ;
      P017Z15_n252CliCod = new boolean[] {false} ;
      P017Z15_A267CliEnvNom = new String[] {""} ;
      P017Z15_A265CliEnvDom = new String[] {""} ;
      P017Z15_A264CliEnvCp = new String[] {""} ;
      P017Z15_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.pgrmodv__default(),
         new Object[] {
             new Object[] {
            P017Z2_A396EmprCod, P017Z2_A8335EmpItm2, P017Z2_n8335EmpItm2, P017Z2_A8334EmpItm1, P017Z2_n8334EmpItm1, P017Z2_A8337EmpItm4, P017Z2_n8337EmpItm4, P017Z2_A8336EmpItm3, P017Z2_n8336EmpItm3
            }
            , new Object[] {
            P017Z3_A396EmprCod, P017Z3_A30AlbProCod, P017Z3_A1259AlbDomEnv, P017Z3_n1259AlbDomEnv, P017Z3_A39AlbProPri, P017Z3_A10017AlbFmd, P017Z3_n10017AlbFmd, P017Z3_A7101AlbLic, P017Z3_A407EmprNom, P017Z3_n407EmprNom,
            P017Z3_A5140AlbMarca, P017Z3_A1879AlbProEnt, P017Z3_n1879AlbProEnt, P017Z3_A33AlbProEst, P017Z3_A1782AlbProEso, P017Z3_A3865AlbHorSal, P017Z3_A3868AlbMat, P017Z3_A34AlbProfch, P017Z3_A1243GuiRemCli
            }
            , new Object[] {
            P017Z4_A396EmprCod, P017Z4_A30AlbProCod, P017Z4_A916AlbPObs, P017Z4_A915AlbPObsLin
            }
            , new Object[] {
            P017Z5_A396EmprCod, P017Z5_A30AlbProCod, P017Z5_A12184DltObs, P017Z5_n12184DltObs, P017Z5_A12185DltLinObs
            }
            , new Object[] {
            }
            , new Object[] {
            P017Z8_A396EmprCod, P017Z8_A130BarCodPar, P017Z8_A132BarCodReo, P017Z8_A129BarCod, P017Z8_A30AlbProCod, P017Z8_A136BarColNum, P017Z8_A252CliCod, P017Z8_n252CliCod, P017Z8_A143BarDisNum, P017Z8_A1234BarNomCli,
            P017Z8_A135BarColNom, P017Z8_A1261BarAlbKgmE, P017Z8_A1265BarAlbPie, P017Z8_A1652BarSerDsc, P017Z8_A2243BarKgsCli, P017Z8_n2243BarKgsCli, P017Z8_A1262BarPreKgm, P017Z8_A1206TubCod, P017Z8_n1206TubCod, P017Z8_A1207TubNom,
            P017Z8_n1207TubNom, P017Z8_A166BarKgm, P017Z8_n166BarKgm, P017Z8_A3915EmpNumDec, P017Z8_n3915EmpNumDec, P017Z8_A1208TubPre, P017Z8_n1208TubPre, P017Z8_A1266BarAlbTub
            }
            , new Object[] {
            P017Z9_A457FasCod, P017Z9_A396EmprCod, P017Z9_A30AlbProCod, P017Z9_A129BarCod, P017Z9_A132BarCodReo, P017Z9_A130BarCodPar, P017Z9_A1276FasMtr, P017Z9_A1242GuiFasPMt, P017Z9_A8195GuiFasPBM, P017Z9_n8195GuiFasPBM,
            P017Z9_A460FasDsc, P017Z9_A1241GuiFasPKg, P017Z9_A1275FasKgm, P017Z9_A8194GuiFasPBK, P017Z9_n8194GuiFasPBK, P017Z9_A1240GuiFasLin
            }
            , new Object[] {
            P017Z10_A396EmprCod, P017Z10_A12178DltP, P017Z10_A12177DltR, P017Z10_A12176DltHdr, P017Z10_A30AlbProCod, P017Z10_A12153DltColNum, P017Z10_n12153DltColNum, P017Z10_A12145DltKgs, P017Z10_n12145DltKgs, P017Z10_A12147DltPzs,
            P017Z10_n12147DltPzs, P017Z10_A12151DltArtDsc, P017Z10_n12151DltArtDsc, P017Z10_A12186DltKgsCli, P017Z10_n12186DltKgsCli, P017Z10_A12163DltPreKg, P017Z10_n12163DltPreKg, P017Z10_A12187DltTubo, P017Z10_n12187DltTubo, P017Z10_A12149DltTubos,
            P017Z10_n12149DltTubos, P017Z10_A12188DltTuboN, P017Z10_n12188DltTuboN
            }
            , new Object[] {
            P017Z11_A396EmprCod, P017Z11_A30AlbProCod, P017Z11_A12176DltHdr, P017Z11_A12177DltR, P017Z11_A12178DltP, P017Z11_A12175DltMtsFs, P017Z11_n12175DltMtsFs, P017Z11_A12190DltPrMFs, P017Z11_n12190DltPrMFs, P017Z11_A12192DltPrMBFs,
            P017Z11_n12192DltPrMBFs, P017Z11_A12173DltFasDsc, P017Z11_n12173DltFasDsc, P017Z11_A12189DltPrKFs, P017Z11_n12189DltPrKFs, P017Z11_A12174DltKgsFs, P017Z11_n12174DltKgsFs, P017Z11_A12191DltPrKBFs, P017Z11_n12191DltPrKBFs, P017Z11_A12182DltLin
            }
            , new Object[] {
            P017Z13_A396EmprCod, P017Z13_A130BarCodPar, P017Z13_A132BarCodReo, P017Z13_A129BarCod, P017Z13_A252CliCod, P017Z13_n252CliCod, P017Z13_A143BarDisNum, P017Z13_A1234BarNomCli, P017Z13_A135BarColNom, P017Z13_A166BarKgm,
            P017Z13_n166BarKgm
            }
            , new Object[] {
            P017Z14_A396EmprCod, P017Z14_A252CliCod, P017Z14_A279CliNom, P017Z14_A260CliDom, P017Z14_A256CliCp, P017Z14_A295CliPob, P017Z14_A278CliNif, P017Z14_A13012CliImpReop
            }
            , new Object[] {
            P017Z15_A396EmprCod, P017Z15_A266CliEnvLin, P017Z15_A252CliCod, P017Z15_A267CliEnvNom, P017Z15_A265CliEnvDom, P017Z15_A264CliEnvCp, P017Z15_A268CliEnvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte AV22CliEnvDom ;
   private byte AV49Copias ;
   private byte AV58i ;
   private byte A915AlbPObsLin ;
   private byte A12185DltLinObs ;
   private byte AV48ContLine ;
   private byte A132BarCodReo ;
   private byte A3915EmpNumDec ;
   private byte AV85Barcodreo ;
   private byte A12177DltR ;
   private byte A266CliEnvLin ;
   private short gxcookieaux ;
   private short A1206TubCod ;
   private short AV80BarALbPie ;
   private short A1240GuiFasLin ;
   private short A12187DltTubo ;
   private short A12182DltLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV16CliCod ;
   private int GX_I ;
   private int AV53TotPzas ;
   private int Gx_OldLine ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int AV50barcolnum ;
   private int AV84Barcod ;
   private int A12176DltHdr ;
   private int A12153DltColNum ;
   private int A12147DltPzs ;
   private int A12149DltTubos ;
   private long A30AlbProCod ;
   private long AV81Albprocod ;
   private java.math.BigDecimal AV54TotKgs ;
   private java.math.BigDecimal AV61TotVal ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A1208TubPre ;
   private java.math.BigDecimal A1281TubImp ;
   private java.math.BigDecimal AV56KgsE ;
   private java.math.BigDecimal AV66KgsS ;
   private java.math.BigDecimal AV60vValor ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal AV68FasMtr ;
   private java.math.BigDecimal AV67KgsFasS ;
   private java.math.BigDecimal AV63TubImp ;
   private java.math.BigDecimal AV64TubPre ;
   private java.math.BigDecimal A12145DltKgs ;
   private java.math.BigDecimal A12186DltKgsCli ;
   private java.math.BigDecimal A12163DltPreKg ;
   private java.math.BigDecimal AV82BarKgm ;
   private java.math.BigDecimal A12175DltMtsFs ;
   private java.math.BigDecimal A12190DltPrMFs ;
   private java.math.BigDecimal A12192DltPrMBFs ;
   private java.math.BigDecimal A12189DltPrKFs ;
   private java.math.BigDecimal A12174DltKgsFs ;
   private java.math.BigDecimal A12191DltPrKBFs ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV51TextoCopia ;
   private String AV62ContDsc ;
   private String AV72Firmad ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String AV69Texto_1 ;
   private String AV70Texto_2 ;
   private String A39AlbProPri ;
   private String A7101AlbLic ;
   private String A407EmprNom ;
   private String A5140AlbMarca ;
   private String A1879AlbProEnt ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String AV29Prioridad ;
   private String AV71Texto_fd ;
   private String AV73Firma4dig ;
   private String AV74AtId ;
   private String AV21EmprNom ;
   private String AV57VDoc ;
   private String AV46vCopia ;
   private String AV59vObs[] ;
   private String A916AlbPObs ;
   private String A12184DltObs ;
   private String AV75TxtAnulado ;
   private String AV52Matricula ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A1207TubNom ;
   private String AV55Hdr ;
   private String AV83CliImpReop ;
   private String AV86Barcodpar ;
   private String AV76Bardisnum ;
   private String AV78BarNomCli ;
   private String AV79Barcolnom ;
   private String AV77BarSerDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV65Uni ;
   private String A12178DltP ;
   private String A12151DltArtDsc ;
   private String A12188DltTuboN ;
   private String A12173DltFasDsc ;
   private String AV17CliNom ;
   private String AV18CliDom ;
   private String AV19Clicp ;
   private String AV20CliPob ;
   private String AV47CliNif ;
   private String AV23CliENom ;
   private String AV24CliEDom ;
   private String AV25CliEcp ;
   private String AV26CliEPob ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A13012CliImpReop ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date A34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean GxHdr3 ;
   private boolean n1259AlbDomEnv ;
   private boolean n10017AlbFmd ;
   private boolean n407EmprNom ;
   private boolean n1879AlbProEnt ;
   private boolean returnInSub ;
   private boolean n12184DltObs ;
   private boolean n252CliCod ;
   private boolean n2243BarKgsCli ;
   private boolean n1206TubCod ;
   private boolean n1207TubNom ;
   private boolean n166BarKgm ;
   private boolean n3915EmpNumDec ;
   private boolean n1208TubPre ;
   private boolean n8195GuiFasPBM ;
   private boolean n8194GuiFasPBK ;
   private boolean n12153DltColNum ;
   private boolean n12145DltKgs ;
   private boolean n12147DltPzs ;
   private boolean n12151DltArtDsc ;
   private boolean n12186DltKgsCli ;
   private boolean n12163DltPreKg ;
   private boolean n12187DltTubo ;
   private boolean n12149DltTubos ;
   private boolean n12188DltTuboN ;
   private boolean n12175DltMtsFs ;
   private boolean n12190DltPrMFs ;
   private boolean n12192DltPrMBFs ;
   private boolean n12173DltFasDsc ;
   private boolean n12189DltPrKFs ;
   private boolean n12174DltKgsFs ;
   private boolean n12191DltPrKBFs ;
   private String A10017AlbFmd ;
   private IDataStoreProvider pr_default ;
   private String[] P017Z2_A396EmprCod ;
   private String[] P017Z2_A8335EmpItm2 ;
   private boolean[] P017Z2_n8335EmpItm2 ;
   private String[] P017Z2_A8334EmpItm1 ;
   private boolean[] P017Z2_n8334EmpItm1 ;
   private String[] P017Z2_A8337EmpItm4 ;
   private boolean[] P017Z2_n8337EmpItm4 ;
   private String[] P017Z2_A8336EmpItm3 ;
   private boolean[] P017Z2_n8336EmpItm3 ;
   private String[] P017Z3_A396EmprCod ;
   private long[] P017Z3_A30AlbProCod ;
   private byte[] P017Z3_A1259AlbDomEnv ;
   private boolean[] P017Z3_n1259AlbDomEnv ;
   private String[] P017Z3_A39AlbProPri ;
   private String[] P017Z3_A10017AlbFmd ;
   private boolean[] P017Z3_n10017AlbFmd ;
   private String[] P017Z3_A7101AlbLic ;
   private String[] P017Z3_A407EmprNom ;
   private boolean[] P017Z3_n407EmprNom ;
   private String[] P017Z3_A5140AlbMarca ;
   private String[] P017Z3_A1879AlbProEnt ;
   private boolean[] P017Z3_n1879AlbProEnt ;
   private byte[] P017Z3_A33AlbProEst ;
   private byte[] P017Z3_A1782AlbProEso ;
   private String[] P017Z3_A3865AlbHorSal ;
   private String[] P017Z3_A3868AlbMat ;
   private java.util.Date[] P017Z3_A34AlbProfch ;
   private int[] P017Z3_A1243GuiRemCli ;
   private String[] P017Z4_A396EmprCod ;
   private long[] P017Z4_A30AlbProCod ;
   private String[] P017Z4_A916AlbPObs ;
   private byte[] P017Z4_A915AlbPObsLin ;
   private String[] P017Z5_A396EmprCod ;
   private long[] P017Z5_A30AlbProCod ;
   private String[] P017Z5_A12184DltObs ;
   private boolean[] P017Z5_n12184DltObs ;
   private byte[] P017Z5_A12185DltLinObs ;
   private String[] P017Z8_A396EmprCod ;
   private String[] P017Z8_A130BarCodPar ;
   private byte[] P017Z8_A132BarCodReo ;
   private int[] P017Z8_A129BarCod ;
   private long[] P017Z8_A30AlbProCod ;
   private int[] P017Z8_A136BarColNum ;
   private int[] P017Z8_A252CliCod ;
   private boolean[] P017Z8_n252CliCod ;
   private String[] P017Z8_A143BarDisNum ;
   private String[] P017Z8_A1234BarNomCli ;
   private String[] P017Z8_A135BarColNom ;
   private java.math.BigDecimal[] P017Z8_A1261BarAlbKgmE ;
   private int[] P017Z8_A1265BarAlbPie ;
   private String[] P017Z8_A1652BarSerDsc ;
   private java.math.BigDecimal[] P017Z8_A2243BarKgsCli ;
   private boolean[] P017Z8_n2243BarKgsCli ;
   private java.math.BigDecimal[] P017Z8_A1262BarPreKgm ;
   private short[] P017Z8_A1206TubCod ;
   private boolean[] P017Z8_n1206TubCod ;
   private String[] P017Z8_A1207TubNom ;
   private boolean[] P017Z8_n1207TubNom ;
   private java.math.BigDecimal[] P017Z8_A166BarKgm ;
   private boolean[] P017Z8_n166BarKgm ;
   private byte[] P017Z8_A3915EmpNumDec ;
   private boolean[] P017Z8_n3915EmpNumDec ;
   private java.math.BigDecimal[] P017Z8_A1208TubPre ;
   private boolean[] P017Z8_n1208TubPre ;
   private int[] P017Z8_A1266BarAlbTub ;
   private String[] P017Z9_A457FasCod ;
   private String[] P017Z9_A396EmprCod ;
   private long[] P017Z9_A30AlbProCod ;
   private int[] P017Z9_A129BarCod ;
   private byte[] P017Z9_A132BarCodReo ;
   private String[] P017Z9_A130BarCodPar ;
   private java.math.BigDecimal[] P017Z9_A1276FasMtr ;
   private java.math.BigDecimal[] P017Z9_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P017Z9_A8195GuiFasPBM ;
   private boolean[] P017Z9_n8195GuiFasPBM ;
   private String[] P017Z9_A460FasDsc ;
   private java.math.BigDecimal[] P017Z9_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P017Z9_A1275FasKgm ;
   private java.math.BigDecimal[] P017Z9_A8194GuiFasPBK ;
   private boolean[] P017Z9_n8194GuiFasPBK ;
   private short[] P017Z9_A1240GuiFasLin ;
   private String[] P017Z10_A396EmprCod ;
   private String[] P017Z10_A12178DltP ;
   private byte[] P017Z10_A12177DltR ;
   private int[] P017Z10_A12176DltHdr ;
   private long[] P017Z10_A30AlbProCod ;
   private int[] P017Z10_A12153DltColNum ;
   private boolean[] P017Z10_n12153DltColNum ;
   private java.math.BigDecimal[] P017Z10_A12145DltKgs ;
   private boolean[] P017Z10_n12145DltKgs ;
   private int[] P017Z10_A12147DltPzs ;
   private boolean[] P017Z10_n12147DltPzs ;
   private String[] P017Z10_A12151DltArtDsc ;
   private boolean[] P017Z10_n12151DltArtDsc ;
   private java.math.BigDecimal[] P017Z10_A12186DltKgsCli ;
   private boolean[] P017Z10_n12186DltKgsCli ;
   private java.math.BigDecimal[] P017Z10_A12163DltPreKg ;
   private boolean[] P017Z10_n12163DltPreKg ;
   private short[] P017Z10_A12187DltTubo ;
   private boolean[] P017Z10_n12187DltTubo ;
   private int[] P017Z10_A12149DltTubos ;
   private boolean[] P017Z10_n12149DltTubos ;
   private String[] P017Z10_A12188DltTuboN ;
   private boolean[] P017Z10_n12188DltTuboN ;
   private String[] P017Z11_A396EmprCod ;
   private long[] P017Z11_A30AlbProCod ;
   private int[] P017Z11_A12176DltHdr ;
   private byte[] P017Z11_A12177DltR ;
   private String[] P017Z11_A12178DltP ;
   private java.math.BigDecimal[] P017Z11_A12175DltMtsFs ;
   private boolean[] P017Z11_n12175DltMtsFs ;
   private java.math.BigDecimal[] P017Z11_A12190DltPrMFs ;
   private boolean[] P017Z11_n12190DltPrMFs ;
   private java.math.BigDecimal[] P017Z11_A12192DltPrMBFs ;
   private boolean[] P017Z11_n12192DltPrMBFs ;
   private String[] P017Z11_A12173DltFasDsc ;
   private boolean[] P017Z11_n12173DltFasDsc ;
   private java.math.BigDecimal[] P017Z11_A12189DltPrKFs ;
   private boolean[] P017Z11_n12189DltPrKFs ;
   private java.math.BigDecimal[] P017Z11_A12174DltKgsFs ;
   private boolean[] P017Z11_n12174DltKgsFs ;
   private java.math.BigDecimal[] P017Z11_A12191DltPrKBFs ;
   private boolean[] P017Z11_n12191DltPrKBFs ;
   private short[] P017Z11_A12182DltLin ;
   private String[] P017Z13_A396EmprCod ;
   private String[] P017Z13_A130BarCodPar ;
   private byte[] P017Z13_A132BarCodReo ;
   private int[] P017Z13_A129BarCod ;
   private int[] P017Z13_A252CliCod ;
   private boolean[] P017Z13_n252CliCod ;
   private String[] P017Z13_A143BarDisNum ;
   private String[] P017Z13_A1234BarNomCli ;
   private String[] P017Z13_A135BarColNom ;
   private java.math.BigDecimal[] P017Z13_A166BarKgm ;
   private boolean[] P017Z13_n166BarKgm ;
   private String[] P017Z14_A396EmprCod ;
   private int[] P017Z14_A252CliCod ;
   private boolean[] P017Z14_n252CliCod ;
   private String[] P017Z14_A279CliNom ;
   private String[] P017Z14_A260CliDom ;
   private String[] P017Z14_A256CliCp ;
   private String[] P017Z14_A295CliPob ;
   private String[] P017Z14_A278CliNif ;
   private String[] P017Z14_A13012CliImpReop ;
   private String[] P017Z15_A396EmprCod ;
   private byte[] P017Z15_A266CliEnvLin ;
   private int[] P017Z15_A252CliCod ;
   private boolean[] P017Z15_n252CliCod ;
   private String[] P017Z15_A267CliEnvNom ;
   private String[] P017Z15_A265CliEnvDom ;
   private String[] P017Z15_A264CliEnvCp ;
   private String[] P017Z15_A268CliEnvPob ;
}

final  class pgrmodv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P017Z2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P017Z3", "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbDomEnv, T1.AlbProPri, T1.AlbFmd, T1.AlbLic, T2.EmprNom, T1.AlbMarca, T1.AlbProEnt, T1.AlbProEst, T1.AlbProEso, T1.AlbHorSal, T1.AlbMat, T1.AlbProfch, T1.GuiRemCli FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod  FOR UPDATE OF T1.AlbProEst, T1.AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P017Z4", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P017Z5", "SELECT EmprCod, AlbProCod, DltObs, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P017Z6", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P017Z8", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T3.BarColNum, T3.CliCod, T3.BarDisNum, T3.BarNomCli, T3.BarColNom, T1.BarAlbKgmE, T1.BarAlbPie, T3.BarSerDsc, T1.BarKgsCli, T1.BarPreKgm, T1.TubCod, T4.TubNom, COALESCE( T6.BarKgm, 0) AS BarKgm, T2.EmpNumDec, T4.TubPre, T1.BarAlbTub FROM (((((TXPALBBAR T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTUBOS T4 ON T4.EmprCod = T1.EmprCod AND T4.TubCod = T1.TubCod) INNER JOIN TXPCALPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.AlbProCod = T1.AlbProCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P017Z9", "SELECT T1.FasCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasMtr, T1.GuiFasPMt, T1.GuiFasPBM, T2.FasDsc, T1.GuiFasPKg, T1.FasKgm, T1.GuiFasPBK, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P017Z10", "SELECT EmprCod, DltP, DltR, DltHdr, AlbProCod, DltColNum, DltKgs, DltPzs, DltArtDsc, DltKgsCli, DltPreKg, DltTubo, DltTubos, DltTuboN FROM TXPDLT001 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P017Z11", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltMtsFs, DltPrMFs, DltPrMBFs, DltFasDsc, DltPrKFs, DltKgsFs, DltPrKBFs, DltLin FROM TXPDLT004 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P017Z13", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarDisNum, T1.BarNomCli, T1.BarColNom, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P017Z14", "SELECT EmprCod, CliCod, CliNom, CliDom, CliCp, CliPob, CliNif, CliImpReop FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P017Z15", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 8);
               ((String[]) buf[16])[0] = rslt.getString(13, 20);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((int[]) buf[18])[0] = rslt.getInt(15);
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
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 28);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(14);
               return;
            case 7 :
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
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 8 :
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
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               return;
            case 9 :
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
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

