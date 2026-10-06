package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pgrtinan_impl extends GXWebReport
{
   public pgrtinan_impl( com.genexus.internet.HttpContext context )
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
      M_bot = 9 ;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*9)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV60ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRTINA", ""), GXv_char1) ;
         pgrtinan_impl.this.AV60ContDsc = GXv_char1[0] ;
         GXt_char2 = AV76FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pgrtinan_impl.this.A396EmprCod = GXv_char1[0] ;
         pgrtinan_impl.this.GXt_char2 = GXv_char4[0] ;
         AV76FirmaD = GXt_char2 ;
         GXt_int5 = AV81existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pgrtinan_impl.this.GXt_int5 = GXv_int6[0] ;
         AV81existefirmad = GXt_int5 ;
         /* Using cursor P01S82 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8334EmpItm1 = P01S82_A8334EmpItm1[0] ;
            n8334EmpItm1 = P01S82_n8334EmpItm1[0] ;
            A8337EmpItm4 = P01S82_A8337EmpItm4[0] ;
            n8337EmpItm4 = P01S82_n8337EmpItm4[0] ;
            A8336EmpItm3 = P01S82_A8336EmpItm3[0] ;
            n8336EmpItm3 = P01S82_n8336EmpItm3[0] ;
            AV79Texto_1 = GXutil.trim( A8334EmpItm1) + "€" ;
            AV80Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P01S83 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1253EmprGuiRem = P01S83_A1253EmprGuiRem[0] ;
            A1259AlbDomEnv = P01S83_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P01S83_n1259AlbDomEnv[0] ;
            A39AlbProPri = P01S83_A39AlbProPri[0] ;
            A3865AlbHorSal = P01S83_A3865AlbHorSal[0] ;
            A4023AlbFecSal = P01S83_A4023AlbFecSal[0] ;
            A10017AlbFmd = P01S83_A10017AlbFmd[0] ;
            n10017AlbFmd = P01S83_n10017AlbFmd[0] ;
            A7101AlbLic = P01S83_A7101AlbLic[0] ;
            A1879AlbProEnt = P01S83_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P01S83_n1879AlbProEnt[0] ;
            A33AlbProEst = P01S83_A33AlbProEst[0] ;
            A1782AlbProEso = P01S83_A1782AlbProEso[0] ;
            A34AlbProfch = P01S83_A34AlbProfch[0] ;
            A1243GuiRemCli = P01S83_A1243GuiRemCli[0] ;
            /* Using cursor P01S84 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A407EmprNom = P01S84_A407EmprNom[0] ;
            n407EmprNom = P01S84_n407EmprNom[0] ;
            /* Using cursor P01S85 */
            pr_default.execute(3, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
            A781PrvCod = P01S85_A781PrvCod[0] ;
            n781PrvCod = P01S85_n781PrvCod[0] ;
            A4828CliCp2 = P01S85_A4828CliCp2[0] ;
            n4828CliCp2 = P01S85_n4828CliCp2[0] ;
            A256CliCp = P01S85_A256CliCp[0] ;
            n256CliCp = P01S85_n256CliCp[0] ;
            A295CliPob = P01S85_A295CliPob[0] ;
            n295CliPob = P01S85_n295CliPob[0] ;
            A260CliDom = P01S85_A260CliDom[0] ;
            n260CliDom = P01S85_n260CliDom[0] ;
            /* Using cursor P01S86 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
            A787PrvDsc = P01S86_A787PrvDsc[0] ;
            n787PrvDsc = P01S86_n787PrvDsc[0] ;
            AV16CliCod = A1243GuiRemCli ;
            AV22CliEnvDom = A1259AlbDomEnv ;
            AV29Prioridad = A39AlbProPri ;
            AV69ALbHorSal = A3865AlbHorSal ;
            AV82ALbFecsal = A4023AlbFecSal ;
            AV74Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV75Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV74Texto_fd = AV75Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV76FirmaD) ;
            }
            else
            {
               AV74Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            if ( GXutil.strcmp(A7101AlbLic, " ") > 0 )
            {
               AV78AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            /* Execute user subroutine: 'CLIENTE' */
            S111 ();
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
            AV21EmprNom = A407EmprNom ;
            AV57VDoc = httpContext.getMessage( "Guia de Remessa", "") ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV57VDoc = httpContext.getMessage( "Guia de Transito", "") ;
            }
            if ( AV49Copias == 1 )
            {
               AV46vCopia = httpContext.getMessage( "DUPLICADO", "") ;
            }
            AV58i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV59vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P01S87 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A916AlbPObs = P01S87_A916AlbPObs[0] ;
               A915AlbPObsLin = P01S87_A915AlbPObsLin[0] ;
               if ( AV58i > 2 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV59vObs[AV58i-1] = A916AlbPObs ;
               AV58i = (byte)(AV58i+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( (GXutil.strcmp("", A4828CliCp2)==0) )
            {
               AV61Cpostal = A256CliCp ;
            }
            else
            {
               AV61Cpostal = A256CliCp + "-" + A4828CliCp2 ;
            }
            AV48ContLine = (byte)(0) ;
            AV52Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            /* Using cursor P01S88 */
            pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A130BarCodPar = P01S88_A130BarCodPar[0] ;
               A132BarCodReo = P01S88_A132BarCodReo[0] ;
               A129BarCod = P01S88_A129BarCod[0] ;
               A218BarTipCol = P01S88_A218BarTipCol[0] ;
               A136BarColNum = P01S88_A136BarColNum[0] ;
               A1261BarAlbKgmE = P01S88_A1261BarAlbKgmE[0] ;
               A1263BarAlbMtrE = P01S88_A1263BarAlbMtrE[0] ;
               A217BarTipArt = P01S88_A217BarTipArt[0] ;
               n217BarTipArt = P01S88_n217BarTipArt[0] ;
               A1652BarSerDsc = P01S88_A1652BarSerDsc[0] ;
               A1234BarNomCli = P01S88_A1234BarNomCli[0] ;
               A1265BarAlbPie = P01S88_A1265BarAlbPie[0] ;
               A4815AlbEncCli = P01S88_A4815AlbEncCli[0] ;
               A218BarTipCol = P01S88_A218BarTipCol[0] ;
               A136BarColNum = P01S88_A136BarColNum[0] ;
               A217BarTipArt = P01S88_A217BarTipArt[0] ;
               n217BarTipArt = P01S88_n217BarTipArt[0] ;
               A1652BarSerDsc = P01S88_A1652BarSerDsc[0] ;
               A1234BarNomCli = P01S88_A1234BarNomCli[0] ;
               AV64BarTipCol = A218BarTipCol ;
               /* Execute user subroutine: 'TIPCOL' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(4);
                  pr_default.close(3);
                  pr_default.close(2);
                  pr_default.close(6);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV62BarDisNum = GXutil.substring( A4815AlbEncCli, 1, 8) ;
               AV50barcolnum = A136BarColNum ;
               AV55Hdr = GXutil.str( A129BarCod, 8, 0) ;
               AV56KgsE = A1261BarAlbKgmE ;
               AV63MtsE = A1263BarAlbMtrE ;
               AV73BarTipArt = A217BarTipArt ;
               /* Execute user subroutine: 'TIPART' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(4);
                  pr_default.close(3);
                  pr_default.close(2);
                  pr_default.close(6);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV66Dsc = GXutil.trim( GXutil.substring( A1652BarSerDsc, 1, 15)) + " " + AV72TipArtDsc + " " + AV65ColDsc ;
               h1S80( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 555, Gx_line+0, 600, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 401, Gx_line+0, 497, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Dsc, "")), 153, Gx_line+0, 395, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62BarDisNum, "")), 46, Gx_line+0, 105, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56KgsE, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63MtsE, "ZZZZ.ZZ")), 674, Gx_line+0, 726, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV48ContLine = (byte)(AV48ContLine+1) ;
               AV53TotPzas = (int)(AV53TotPzas+A1265BarAlbPie) ;
               AV54TotKgs = AV54TotKgs.add(A1261BarAlbKgmE) ;
               /* Using cursor P01S89 */
               pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A457FasCod = P01S89_A457FasCod[0] ;
                  A1275FasKgm = P01S89_A1275FasKgm[0] ;
                  A1276FasMtr = P01S89_A1276FasMtr[0] ;
                  A460FasDsc = P01S89_A460FasDsc[0] ;
                  A1240GuiFasLin = P01S89_A1240GuiFasLin[0] ;
                  A460FasDsc = P01S89_A460FasDsc[0] ;
                  AV56KgsE = A1275FasKgm ;
                  AV63MtsE = A1276FasMtr ;
                  h1S80( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 153, Gx_line+0, 358, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56KgsE, "ZZZZ.ZZ")), 616, Gx_line+0, 668, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63MtsE, "ZZZZ.ZZ")), 674, Gx_line+0, 726, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV48ContLine = (byte)(AV48ContLine+1) ;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               /* Using cursor P01S810 */
               pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A2768AlbHdrKgs = P01S810_A2768AlbHdrKgs[0] ;
                  A2765AlbHdrTxt = P01S810_A2765AlbHdrTxt[0] ;
                  A2764AlbHdrLin = P01S810_A2764AlbHdrLin[0] ;
                  h1S80( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2765AlbHdrTxt, "")), 153, Gx_line+0, 373, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2768AlbHdrKgs, "ZZZZZ9.99")), 601, Gx_line+1, 668, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV70BarAlbTub = 0 ;
            AV71TubNom = "" ;
            /* Using cursor P01S811 */
            pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A1206TubCod = P01S811_A1206TubCod[0] ;
               n1206TubCod = P01S811_n1206TubCod[0] ;
               A1266BarAlbTub = P01S811_A1266BarAlbTub[0] ;
               A1207TubNom = P01S811_A1207TubNom[0] ;
               n1207TubNom = P01S811_n1207TubNom[0] ;
               A129BarCod = P01S811_A129BarCod[0] ;
               A132BarCodReo = P01S811_A132BarCodReo[0] ;
               A130BarCodPar = P01S811_A130BarCodPar[0] ;
               A1207TubNom = P01S811_A1207TubNom[0] ;
               n1207TubNom = P01S811_n1207TubNom[0] ;
               AV70BarAlbTub = (int)(AV70BarAlbTub+A1266BarAlbTub) ;
               AV71TubNom = A1207TubNom ;
               pr_default.readNext(9);
            }
            pr_default.close(9);
            if ( AV70BarAlbTub > 0 )
            {
               h1S80( false, 22) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TubNom, "")), 153, Gx_line+6, 373, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV70BarAlbTub), "ZZZ9")), 555, Gx_line+6, 600, Gx_line+23, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Un.", ""), 599, Gx_line+6, 619, Gx_line+22, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
            }
            if ( ( AV81existefirmad == 1 ) && (GXutil.strcmp("", A10017AlbFmd)==0) )
            {
               h1S80( false, 41) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 160, Gx_line+14, 579, Gx_line+37, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+41) ;
            }
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            /* Using cursor P01S812 */
            pr_default.execute(10, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(4);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h1S80( true, 0) ;
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
      /* Using cursor P01S813 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A252CliCod = P01S813_A252CliCod[0] ;
         A279CliNom = P01S813_A279CliNom[0] ;
         A3644CliNom1 = P01S813_A3644CliNom1[0] ;
         A260CliDom = P01S813_A260CliDom[0] ;
         n260CliDom = P01S813_n260CliDom[0] ;
         A256CliCp = P01S813_A256CliCp[0] ;
         n256CliCp = P01S813_n256CliCp[0] ;
         A295CliPob = P01S813_A295CliPob[0] ;
         n295CliPob = P01S813_n295CliPob[0] ;
         A278CliNif = P01S813_A278CliNif[0] ;
         AV17CliNom = A279CliNom ;
         AV67CliNom1 = A3644CliNom1 ;
         AV68CliNom3 = GXutil.trim( A279CliNom) + GXutil.trim( AV67CliNom1) ;
         AV18CliDom = A260CliDom ;
         AV19Clicp = A256CliCp ;
         AV20CliPob = A295CliPob ;
         AV47CliNif = A278CliNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      /* Execute user subroutine: 'ENVIO' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P01S814 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV22CliEnvDom)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A266CliEnvLin = P01S814_A266CliEnvLin[0] ;
         A252CliCod = P01S814_A252CliCod[0] ;
         A267CliEnvNom = P01S814_A267CliEnvNom[0] ;
         A265CliEnvDom = P01S814_A265CliEnvDom[0] ;
         A264CliEnvCp = P01S814_A264CliEnvCp[0] ;
         A268CliEnvPob = P01S814_A268CliEnvPob[0] ;
         AV23CliENom = A267CliEnvNom ;
         AV24CliEDom = A265CliEnvDom ;
         AV25CliEcp = A264CliEnvCp ;
         AV26CliEPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      AV65ColDsc = "" ;
      /* Using cursor P01S815 */
      pr_default.execute(13, new Object[] {A396EmprCod, Byte.valueOf(AV64BarTipCol)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A831TipColCod = P01S815_A831TipColCod[0] ;
         A832TipColDsc = P01S815_A832TipColDsc[0] ;
         n832TipColDsc = P01S815_n832TipColDsc[0] ;
         AV65ColDsc = GXutil.substring( A832TipColDsc, 1, 10) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV72TipArtDsc = "" ;
      /* Using cursor P01S816 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(AV73BarTipArt)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A829TipArtCod = P01S816_A829TipArtCod[0] ;
         A830TipArtDsc = P01S816_A830TipArtDsc[0] ;
         n830TipArtDsc = P01S816_n830TipArtDsc[0] ;
         AV72TipArtDsc = GXutil.substring( A830TipArtDsc, 1, 6) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void h1S80( boolean bFoot ,
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
               AV77Textopc = httpContext.getMessage( "Processado por Computador", "") ;
               if ( GXutil.strcmp(AV74Texto_fd, " ") != 0 )
               {
                  AV77Textopc = " " ;
               }
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçôes:", ""), 44, Gx_line+5, 127, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[1-1], "")), 140, Gx_line+5, 506, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[2-1], "")), 140, Gx_line+24, 506, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 44, Gx_line+48, 136, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 143, Gx_line+48, 226, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora de Carga:", ""), 243, Gx_line+48, 355, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69ALbHorSal, "")), 426, Gx_line+48, 519, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 531, Gx_line+48, 643, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalaçoes", ""), 651, Gx_line+48, 732, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60ContDsc, "")), 39, Gx_line+133, 123, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Texto_fd, "")), 199, Gx_line+133, 513, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78AtId, "")), 627, Gx_line+133, 753, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Texto_1, "")), 168, Gx_line+100, 773, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Texto_2, "")), 51, Gx_line+114, 677, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Apenas se aceitam reclamações no prazo de 10 dias e nunca depois da malha utilizada.", ""), 44, Gx_line+69, 426, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(39, Gx_line+96, 753, Gx_line+96, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Apenas é garantido o cumprimento do Oko-Tex quando solicitado na nota de encomenda.", ""), 44, Gx_line+81, 431, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(36, Gx_line+44, 750, Gx_line+44, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV82ALbFecsal, "99/99/99"), 359, Gx_line+48, 410, Gx_line+65, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+150) ;
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
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68CliNom3, "")), 340, Gx_line+189, 654, Gx_line+207, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 340, Gx_line+213, 554, Gx_line+231, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 340, Gx_line+235, 529, Gx_line+253, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Cpostal, "")), 340, Gx_line+258, 409, Gx_line+275, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 429, Gx_line+258, 586, Gx_line+275, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EXMO(S) SR(S)", ""), 340, Gx_line+159, 410, Gx_line+172, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE Nº", ""), 640, Gx_line+171, 705, Gx_line+185, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 701, Gx_line+171, 733, Gx_line+185, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(311, Gx_line+151, 311, Gx_line+161, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(311, Gx_line+151, 324, Gx_line+151, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(311, Gx_line+283, 324, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(311, Gx_line+274, 311, Gx_line+284, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(739, Gx_line+150, 739, Gx_line+160, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(727, Gx_line+150, 740, Gx_line+150, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(739, Gx_line+274, 739, Gx_line+284, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(727, Gx_line+283, 740, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(32, Gx_line+321, 484, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DOCUMENTO", ""), 72, Gx_line+305, 155, Gx_line+319, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 66, Gx_line+330, 150, Gx_line+346, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 185, Gx_line+330, 249, Gx_line+346, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NÚMERO", ""), 193, Gx_line+305, 250, Gx_line+319, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 288, Gx_line+305, 323, Gx_line+319, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 281, Gx_line+330, 326, Gx_line+346, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Nº CONTRIBUINTE", ""), 359, Gx_line+305, 469, Gx_line+320, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 361, Gx_line+330, 466, Gx_line+346, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Talão", ""), 60, Gx_line+354, 92, Gx_line+370, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 301, Gx_line+354, 360, Gx_line+370, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pc", ""), 571, Gx_line+354, 587, Gx_line+370, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qt", ""), 683, Gx_line+338, 697, Gx_line+354, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 652, Gx_line+354, 669, Gx_line+370, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mt.", ""), 710, Gx_line+354, 727, Gx_line+370, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TextoCopia, "")), 32, Gx_line+279, 111, Gx_line+295, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(31, Gx_line+373, 745, Gx_line+373, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "12e1e5ca-1044-41b1-82f4-bceb0981594d", "", context.getHttpContext().getTheme( )), 32, Gx_line+15, 214, Gx_line+67) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+376) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "pgrtinan");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "pgrtinan");
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
      AV60ContDsc = "" ;
      AV76FirmaD = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P01S82_A396EmprCod = new String[] {""} ;
      P01S82_A8334EmpItm1 = new String[] {""} ;
      P01S82_n8334EmpItm1 = new boolean[] {false} ;
      P01S82_A8337EmpItm4 = new String[] {""} ;
      P01S82_n8337EmpItm4 = new boolean[] {false} ;
      P01S82_A8336EmpItm3 = new String[] {""} ;
      P01S82_n8336EmpItm3 = new boolean[] {false} ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      AV79Texto_1 = "" ;
      AV80Texto_2 = "" ;
      P01S83_A1253EmprGuiRem = new String[] {""} ;
      P01S83_A396EmprCod = new String[] {""} ;
      P01S83_A30AlbProCod = new long[1] ;
      P01S83_A1259AlbDomEnv = new byte[1] ;
      P01S83_n1259AlbDomEnv = new boolean[] {false} ;
      P01S83_A39AlbProPri = new String[] {""} ;
      P01S83_A3865AlbHorSal = new String[] {""} ;
      P01S83_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P01S83_A10017AlbFmd = new String[] {""} ;
      P01S83_n10017AlbFmd = new boolean[] {false} ;
      P01S83_A7101AlbLic = new String[] {""} ;
      P01S83_A1879AlbProEnt = new String[] {""} ;
      P01S83_n1879AlbProEnt = new boolean[] {false} ;
      P01S83_A33AlbProEst = new byte[1] ;
      P01S83_A1782AlbProEso = new byte[1] ;
      P01S83_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P01S83_A1243GuiRemCli = new int[1] ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A3865AlbHorSal = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      A1879AlbProEnt = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P01S84_A407EmprNom = new String[] {""} ;
      P01S84_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      P01S85_A781PrvCod = new short[1] ;
      P01S85_n781PrvCod = new boolean[] {false} ;
      P01S85_A4828CliCp2 = new String[] {""} ;
      P01S85_n4828CliCp2 = new boolean[] {false} ;
      P01S85_A256CliCp = new String[] {""} ;
      P01S85_n256CliCp = new boolean[] {false} ;
      P01S85_A295CliPob = new String[] {""} ;
      P01S85_n295CliPob = new boolean[] {false} ;
      P01S85_A260CliDom = new String[] {""} ;
      P01S85_n260CliDom = new boolean[] {false} ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      P01S86_A787PrvDsc = new String[] {""} ;
      P01S86_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      AV29Prioridad = "" ;
      AV69ALbHorSal = "" ;
      AV82ALbFecsal = GXutil.nullDate() ;
      AV74Texto_fd = "" ;
      AV75Firma4dig = "" ;
      AV78AtId = "" ;
      AV21EmprNom = "" ;
      AV57VDoc = "" ;
      AV46vCopia = "" ;
      AV59vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV59vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P01S87_A396EmprCod = new String[] {""} ;
      P01S87_A30AlbProCod = new long[1] ;
      P01S87_A916AlbPObs = new String[] {""} ;
      P01S87_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      AV61Cpostal = "" ;
      AV52Matricula = "" ;
      P01S88_A396EmprCod = new String[] {""} ;
      P01S88_A30AlbProCod = new long[1] ;
      P01S88_A130BarCodPar = new String[] {""} ;
      P01S88_A132BarCodReo = new byte[1] ;
      P01S88_A129BarCod = new int[1] ;
      P01S88_A218BarTipCol = new byte[1] ;
      P01S88_A136BarColNum = new int[1] ;
      P01S88_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01S88_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01S88_A217BarTipArt = new short[1] ;
      P01S88_n217BarTipArt = new boolean[] {false} ;
      P01S88_A1652BarSerDsc = new String[] {""} ;
      P01S88_A1234BarNomCli = new String[] {""} ;
      P01S88_A1265BarAlbPie = new int[1] ;
      P01S88_A4815AlbEncCli = new String[] {""} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A4815AlbEncCli = "" ;
      AV62BarDisNum = "" ;
      AV55Hdr = "" ;
      AV56KgsE = DecimalUtil.ZERO ;
      AV63MtsE = DecimalUtil.ZERO ;
      AV66Dsc = "" ;
      AV72TipArtDsc = "" ;
      AV65ColDsc = "" ;
      AV54TotKgs = DecimalUtil.ZERO ;
      P01S89_A457FasCod = new String[] {""} ;
      P01S89_A396EmprCod = new String[] {""} ;
      P01S89_A30AlbProCod = new long[1] ;
      P01S89_A129BarCod = new int[1] ;
      P01S89_A132BarCodReo = new byte[1] ;
      P01S89_A130BarCodPar = new String[] {""} ;
      P01S89_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01S89_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01S89_A460FasDsc = new String[] {""} ;
      P01S89_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      P01S810_A396EmprCod = new String[] {""} ;
      P01S810_A30AlbProCod = new long[1] ;
      P01S810_A129BarCod = new int[1] ;
      P01S810_A132BarCodReo = new byte[1] ;
      P01S810_A130BarCodPar = new String[] {""} ;
      P01S810_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01S810_A2765AlbHdrTxt = new String[] {""} ;
      P01S810_A2764AlbHdrLin = new short[1] ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2765AlbHdrTxt = "" ;
      AV71TubNom = "" ;
      P01S811_A396EmprCod = new String[] {""} ;
      P01S811_A30AlbProCod = new long[1] ;
      P01S811_A1206TubCod = new short[1] ;
      P01S811_n1206TubCod = new boolean[] {false} ;
      P01S811_A1266BarAlbTub = new int[1] ;
      P01S811_A1207TubNom = new String[] {""} ;
      P01S811_n1207TubNom = new boolean[] {false} ;
      P01S811_A129BarCod = new int[1] ;
      P01S811_A132BarCodReo = new byte[1] ;
      P01S811_A130BarCodPar = new String[] {""} ;
      A1207TubNom = "" ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      P01S813_A396EmprCod = new String[] {""} ;
      P01S813_A252CliCod = new int[1] ;
      P01S813_A279CliNom = new String[] {""} ;
      P01S813_A3644CliNom1 = new String[] {""} ;
      P01S813_A260CliDom = new String[] {""} ;
      P01S813_n260CliDom = new boolean[] {false} ;
      P01S813_A256CliCp = new String[] {""} ;
      P01S813_n256CliCp = new boolean[] {false} ;
      P01S813_A295CliPob = new String[] {""} ;
      P01S813_n295CliPob = new boolean[] {false} ;
      P01S813_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A3644CliNom1 = "" ;
      A278CliNif = "" ;
      AV67CliNom1 = "" ;
      AV68CliNom3 = "" ;
      P01S814_A396EmprCod = new String[] {""} ;
      P01S814_A266CliEnvLin = new byte[1] ;
      P01S814_A252CliCod = new int[1] ;
      P01S814_A267CliEnvNom = new String[] {""} ;
      P01S814_A265CliEnvDom = new String[] {""} ;
      P01S814_A264CliEnvCp = new String[] {""} ;
      P01S814_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P01S815_A396EmprCod = new String[] {""} ;
      P01S815_A831TipColCod = new byte[1] ;
      P01S815_A832TipColDsc = new String[] {""} ;
      P01S815_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P01S816_A396EmprCod = new String[] {""} ;
      P01S816_A829TipArtCod = new short[1] ;
      P01S816_A830TipArtDsc = new String[] {""} ;
      P01S816_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      AV77Textopc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgrtinan__default(),
         new Object[] {
             new Object[] {
            P01S82_A396EmprCod, P01S82_A8334EmpItm1, P01S82_n8334EmpItm1, P01S82_A8337EmpItm4, P01S82_n8337EmpItm4, P01S82_A8336EmpItm3, P01S82_n8336EmpItm3
            }
            , new Object[] {
            P01S83_A1253EmprGuiRem, P01S83_A396EmprCod, P01S83_A30AlbProCod, P01S83_A1259AlbDomEnv, P01S83_n1259AlbDomEnv, P01S83_A39AlbProPri, P01S83_A3865AlbHorSal, P01S83_A4023AlbFecSal, P01S83_A10017AlbFmd, P01S83_n10017AlbFmd,
            P01S83_A7101AlbLic, P01S83_A1879AlbProEnt, P01S83_n1879AlbProEnt, P01S83_A33AlbProEst, P01S83_A1782AlbProEso, P01S83_A34AlbProfch, P01S83_A1243GuiRemCli
            }
            , new Object[] {
            P01S84_A407EmprNom, P01S84_n407EmprNom
            }
            , new Object[] {
            P01S85_A781PrvCod, P01S85_n781PrvCod, P01S85_A4828CliCp2, P01S85_n4828CliCp2, P01S85_A256CliCp, P01S85_n256CliCp, P01S85_A295CliPob, P01S85_n295CliPob, P01S85_A260CliDom, P01S85_n260CliDom
            }
            , new Object[] {
            P01S86_A787PrvDsc, P01S86_n787PrvDsc
            }
            , new Object[] {
            P01S87_A396EmprCod, P01S87_A30AlbProCod, P01S87_A916AlbPObs, P01S87_A915AlbPObsLin
            }
            , new Object[] {
            P01S88_A396EmprCod, P01S88_A30AlbProCod, P01S88_A130BarCodPar, P01S88_A132BarCodReo, P01S88_A129BarCod, P01S88_A218BarTipCol, P01S88_A136BarColNum, P01S88_A1261BarAlbKgmE, P01S88_A1263BarAlbMtrE, P01S88_A217BarTipArt,
            P01S88_n217BarTipArt, P01S88_A1652BarSerDsc, P01S88_A1234BarNomCli, P01S88_A1265BarAlbPie, P01S88_A4815AlbEncCli
            }
            , new Object[] {
            P01S89_A457FasCod, P01S89_A396EmprCod, P01S89_A30AlbProCod, P01S89_A129BarCod, P01S89_A132BarCodReo, P01S89_A130BarCodPar, P01S89_A1275FasKgm, P01S89_A1276FasMtr, P01S89_A460FasDsc, P01S89_A1240GuiFasLin
            }
            , new Object[] {
            P01S810_A396EmprCod, P01S810_A30AlbProCod, P01S810_A129BarCod, P01S810_A132BarCodReo, P01S810_A130BarCodPar, P01S810_A2768AlbHdrKgs, P01S810_A2765AlbHdrTxt, P01S810_A2764AlbHdrLin
            }
            , new Object[] {
            P01S811_A396EmprCod, P01S811_A30AlbProCod, P01S811_A1206TubCod, P01S811_n1206TubCod, P01S811_A1266BarAlbTub, P01S811_A1207TubNom, P01S811_n1207TubNom, P01S811_A129BarCod, P01S811_A132BarCodReo, P01S811_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            P01S813_A396EmprCod, P01S813_A252CliCod, P01S813_A279CliNom, P01S813_A3644CliNom1, P01S813_A260CliDom, P01S813_A256CliCp, P01S813_A295CliPob, P01S813_A278CliNif
            }
            , new Object[] {
            P01S814_A396EmprCod, P01S814_A266CliEnvLin, P01S814_A252CliCod, P01S814_A267CliEnvNom, P01S814_A265CliEnvDom, P01S814_A264CliEnvCp, P01S814_A268CliEnvPob
            }
            , new Object[] {
            P01S815_A396EmprCod, P01S815_A831TipColCod, P01S815_A832TipColDsc, P01S815_n832TipColDsc
            }
            , new Object[] {
            P01S816_A396EmprCod, P01S816_A829TipArtCod, P01S816_A830TipArtDsc, P01S816_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV81existefirmad ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte AV22CliEnvDom ;
   private byte AV49Copias ;
   private byte AV58i ;
   private byte A915AlbPObsLin ;
   private byte AV48ContLine ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV64BarTipCol ;
   private byte A266CliEnvLin ;
   private byte A831TipColCod ;
   private short gxcookieaux ;
   private short A781PrvCod ;
   private short A217BarTipArt ;
   private short AV73BarTipArt ;
   private short A1240GuiFasLin ;
   private short A2764AlbHdrLin ;
   private short A1206TubCod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV16CliCod ;
   private int GX_I ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int AV50barcolnum ;
   private int Gx_OldLine ;
   private int AV53TotPzas ;
   private int AV70BarAlbTub ;
   private int A1266BarAlbTub ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV56KgsE ;
   private java.math.BigDecimal AV63MtsE ;
   private java.math.BigDecimal AV54TotKgs ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV51TextoCopia ;
   private String AV60ContDsc ;
   private String AV76FirmaD ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String AV79Texto_1 ;
   private String AV80Texto_2 ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A3865AlbHorSal ;
   private String A7101AlbLic ;
   private String A1879AlbProEnt ;
   private String A407EmprNom ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A787PrvDsc ;
   private String AV29Prioridad ;
   private String AV69ALbHorSal ;
   private String AV74Texto_fd ;
   private String AV75Firma4dig ;
   private String AV78AtId ;
   private String AV21EmprNom ;
   private String AV57VDoc ;
   private String AV46vCopia ;
   private String AV59vObs[] ;
   private String A916AlbPObs ;
   private String AV61Cpostal ;
   private String AV52Matricula ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A4815AlbEncCli ;
   private String AV62BarDisNum ;
   private String AV55Hdr ;
   private String AV66Dsc ;
   private String AV72TipArtDsc ;
   private String AV65ColDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A2765AlbHdrTxt ;
   private String AV71TubNom ;
   private String A1207TubNom ;
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
   private String A3644CliNom1 ;
   private String A278CliNif ;
   private String AV67CliNom1 ;
   private String AV68CliNom3 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String A832TipColDsc ;
   private String A830TipArtDsc ;
   private String AV77Textopc ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV82ALbFecsal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean GxHdr3 ;
   private boolean n1259AlbDomEnv ;
   private boolean n10017AlbFmd ;
   private boolean n1879AlbProEnt ;
   private boolean n407EmprNom ;
   private boolean n781PrvCod ;
   private boolean n4828CliCp2 ;
   private boolean n256CliCp ;
   private boolean n295CliPob ;
   private boolean n260CliDom ;
   private boolean n787PrvDsc ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n1206TubCod ;
   private boolean n1207TubNom ;
   private boolean n832TipColDsc ;
   private boolean n830TipArtDsc ;
   private String A10017AlbFmd ;
   private IDataStoreProvider pr_default ;
   private String[] P01S82_A396EmprCod ;
   private String[] P01S82_A8334EmpItm1 ;
   private boolean[] P01S82_n8334EmpItm1 ;
   private String[] P01S82_A8337EmpItm4 ;
   private boolean[] P01S82_n8337EmpItm4 ;
   private String[] P01S82_A8336EmpItm3 ;
   private boolean[] P01S82_n8336EmpItm3 ;
   private String[] P01S83_A1253EmprGuiRem ;
   private String[] P01S83_A396EmprCod ;
   private long[] P01S83_A30AlbProCod ;
   private byte[] P01S83_A1259AlbDomEnv ;
   private boolean[] P01S83_n1259AlbDomEnv ;
   private String[] P01S83_A39AlbProPri ;
   private String[] P01S83_A3865AlbHorSal ;
   private java.util.Date[] P01S83_A4023AlbFecSal ;
   private String[] P01S83_A10017AlbFmd ;
   private boolean[] P01S83_n10017AlbFmd ;
   private String[] P01S83_A7101AlbLic ;
   private String[] P01S83_A1879AlbProEnt ;
   private boolean[] P01S83_n1879AlbProEnt ;
   private byte[] P01S83_A33AlbProEst ;
   private byte[] P01S83_A1782AlbProEso ;
   private java.util.Date[] P01S83_A34AlbProfch ;
   private int[] P01S83_A1243GuiRemCli ;
   private String[] P01S84_A407EmprNom ;
   private boolean[] P01S84_n407EmprNom ;
   private short[] P01S85_A781PrvCod ;
   private boolean[] P01S85_n781PrvCod ;
   private String[] P01S85_A4828CliCp2 ;
   private boolean[] P01S85_n4828CliCp2 ;
   private String[] P01S85_A256CliCp ;
   private boolean[] P01S85_n256CliCp ;
   private String[] P01S85_A295CliPob ;
   private boolean[] P01S85_n295CliPob ;
   private String[] P01S85_A260CliDom ;
   private boolean[] P01S85_n260CliDom ;
   private String[] P01S86_A787PrvDsc ;
   private boolean[] P01S86_n787PrvDsc ;
   private String[] P01S87_A396EmprCod ;
   private long[] P01S87_A30AlbProCod ;
   private String[] P01S87_A916AlbPObs ;
   private byte[] P01S87_A915AlbPObsLin ;
   private String[] P01S88_A396EmprCod ;
   private long[] P01S88_A30AlbProCod ;
   private String[] P01S88_A130BarCodPar ;
   private byte[] P01S88_A132BarCodReo ;
   private int[] P01S88_A129BarCod ;
   private byte[] P01S88_A218BarTipCol ;
   private int[] P01S88_A136BarColNum ;
   private java.math.BigDecimal[] P01S88_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P01S88_A1263BarAlbMtrE ;
   private short[] P01S88_A217BarTipArt ;
   private boolean[] P01S88_n217BarTipArt ;
   private String[] P01S88_A1652BarSerDsc ;
   private String[] P01S88_A1234BarNomCli ;
   private int[] P01S88_A1265BarAlbPie ;
   private String[] P01S88_A4815AlbEncCli ;
   private String[] P01S89_A457FasCod ;
   private String[] P01S89_A396EmprCod ;
   private long[] P01S89_A30AlbProCod ;
   private int[] P01S89_A129BarCod ;
   private byte[] P01S89_A132BarCodReo ;
   private String[] P01S89_A130BarCodPar ;
   private java.math.BigDecimal[] P01S89_A1275FasKgm ;
   private java.math.BigDecimal[] P01S89_A1276FasMtr ;
   private String[] P01S89_A460FasDsc ;
   private short[] P01S89_A1240GuiFasLin ;
   private String[] P01S810_A396EmprCod ;
   private long[] P01S810_A30AlbProCod ;
   private int[] P01S810_A129BarCod ;
   private byte[] P01S810_A132BarCodReo ;
   private String[] P01S810_A130BarCodPar ;
   private java.math.BigDecimal[] P01S810_A2768AlbHdrKgs ;
   private String[] P01S810_A2765AlbHdrTxt ;
   private short[] P01S810_A2764AlbHdrLin ;
   private String[] P01S811_A396EmprCod ;
   private long[] P01S811_A30AlbProCod ;
   private short[] P01S811_A1206TubCod ;
   private boolean[] P01S811_n1206TubCod ;
   private int[] P01S811_A1266BarAlbTub ;
   private String[] P01S811_A1207TubNom ;
   private boolean[] P01S811_n1207TubNom ;
   private int[] P01S811_A129BarCod ;
   private byte[] P01S811_A132BarCodReo ;
   private String[] P01S811_A130BarCodPar ;
   private String[] P01S813_A396EmprCod ;
   private int[] P01S813_A252CliCod ;
   private String[] P01S813_A279CliNom ;
   private String[] P01S813_A3644CliNom1 ;
   private String[] P01S813_A260CliDom ;
   private boolean[] P01S813_n260CliDom ;
   private String[] P01S813_A256CliCp ;
   private boolean[] P01S813_n256CliCp ;
   private String[] P01S813_A295CliPob ;
   private boolean[] P01S813_n295CliPob ;
   private String[] P01S813_A278CliNif ;
   private String[] P01S814_A396EmprCod ;
   private byte[] P01S814_A266CliEnvLin ;
   private int[] P01S814_A252CliCod ;
   private String[] P01S814_A267CliEnvNom ;
   private String[] P01S814_A265CliEnvDom ;
   private String[] P01S814_A264CliEnvCp ;
   private String[] P01S814_A268CliEnvPob ;
   private String[] P01S815_A396EmprCod ;
   private byte[] P01S815_A831TipColCod ;
   private String[] P01S815_A832TipColDsc ;
   private boolean[] P01S815_n832TipColDsc ;
   private String[] P01S816_A396EmprCod ;
   private short[] P01S816_A829TipArtCod ;
   private String[] P01S816_A830TipArtDsc ;
   private boolean[] P01S816_n830TipArtDsc ;
}

final  class pgrtinan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01S82", "SELECT EmprCod, EmpItm1, EmpItm4, EmpItm3 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01S83", "SELECT EmprGuiRem, EmprCod, AlbProCod, AlbDomEnv, AlbProPri, AlbHorSal, AlbFecSal, AlbFmd, AlbLic, AlbProEnt, AlbProEst, AlbProEso, AlbProfch, GuiRemCli FROM TXPCALPRD WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?)  FOR UPDATE OF AlbProEst, AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01S84", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01S85", "SELECT PrvCod, CliCp2, CliCp, CliPob, CliDom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01S86", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01S87", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01S88", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T3.BarTipCol, T3.BarColNum, T1.BarAlbKgmE, T1.BarAlbMtrE, T3.BarTipArt, T3.BarSerDsc, T3.BarNomCli, T1.BarAlbPie, T1.AlbEncCli FROM ((TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.AlbProCod = ?) ORDER BY T1.AlbEncCli, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01S89", "SELECT T1.FasCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasKgm, T1.FasMtr, T2.FasDsc, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01S810", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrKgs, AlbHdrTxt, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01S811", "SELECT T1.EmprCod, T1.AlbProCod, T1.TubCod, T1.BarAlbTub, T2.TubNom, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPALBBAR T1 LEFT JOIN TXPTUBOS T2 ON T2.EmprCod = T1.EmprCod AND T2.TubCod = T1.TubCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (Not (T1.TubCod = 0)) ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01S812", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P01S813", "SELECT EmprCod, CliCod, CliNom, CliNom1, CliDom, CliCp, CliPob, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01S814", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01S815", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01S816", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 34);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

