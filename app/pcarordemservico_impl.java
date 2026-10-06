package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pcarordemservico_impl extends GXWebReport
{
   public pcarordemservico_impl( com.genexus.internet.HttpContext context )
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            AV8ImpCod = httpContext.GetPar( "ImpCod") ;
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
      M_bot = 3 ;
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
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV17ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRCVT", ""), GXv_char1) ;
         pcarordemservico_impl.this.AV17ContDsc = GXv_char1[0] ;
         /* Using cursor P05TP2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05TP2_A407EmprNom[0] ;
            n407EmprNom = P05TP2_n407EmprNom[0] ;
            AV18EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P05TP4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P05TP4_A833TipDefCod[0] ;
            n833TipDefCod = P05TP4_n833TipDefCod[0] ;
            A1652BarSerDsc = P05TP4_A1652BarSerDsc[0] ;
            A212BarSer = P05TP4_A212BarSer[0] ;
            A361DisCod = P05TP4_A361DisCod[0] ;
            A1909BarGraAca = P05TP4_A1909BarGraAca[0] ;
            A125BarAncAca1 = P05TP4_A125BarAncAca1[0] ;
            A4466BarAcaAnh = P05TP4_A4466BarAcaAnh[0] ;
            A224BarTraP1 = P05TP4_A224BarTraP1[0] ;
            A225BarTraP2 = P05TP4_A225BarTraP2[0] ;
            A226BarTraP3 = P05TP4_A226BarTraP3[0] ;
            A217BarTipArt = P05TP4_A217BarTipArt[0] ;
            n217BarTipArt = P05TP4_n217BarTipArt[0] ;
            A3030BarPlf = P05TP4_A3030BarPlf[0] ;
            A834TipDefDsc = P05TP4_A834TipDefDsc[0] ;
            n834TipDefDsc = P05TP4_n834TipDefDsc[0] ;
            A148BarEstReo = P05TP4_A148BarEstReo[0] ;
            A5291BarTipCor = P05TP4_A5291BarTipCor[0] ;
            A2829BarProPer = P05TP4_A2829BarProPer[0] ;
            A11852Nxt_ArtCl2 = P05TP4_A11852Nxt_ArtCl2[0] ;
            A11850Nxt_Mdlo2 = P05TP4_A11850Nxt_Mdlo2[0] ;
            A11851Nxt_Sta2 = P05TP4_A11851Nxt_Sta2[0] ;
            A4348DisUsrCod = P05TP4_A4348DisUsrCod[0] ;
            A135BarColNom = P05TP4_A135BarColNom[0] ;
            A1234BarNomCli = P05TP4_A1234BarNomCli[0] ;
            A4812BarEncCli = P05TP4_A4812BarEncCli[0] ;
            A155BarFecCli = P05TP4_A155BarFecCli[0] ;
            A279CliNom = P05TP4_A279CliNom[0] ;
            A252CliCod = P05TP4_A252CliCod[0] ;
            n252CliCod = P05TP4_n252CliCod[0] ;
            A159BarFecGen = P05TP4_A159BarFecGen[0] ;
            A11662BarOrdComp = P05TP4_A11662BarOrdComp[0] ;
            A1503BarPart = P05TP4_A1503BarPart[0] ;
            A9777BarItem3 = P05TP4_A9777BarItem3[0] ;
            A166BarKgm = P05TP4_A166BarKgm[0] ;
            A199BarPie1 = P05TP4_A199BarPie1[0] ;
            A365DisDes = P05TP4_A365DisDes[0] ;
            A898BarPieNDes = P05TP4_A898BarPieNDes[0] ;
            A4348DisUsrCod = P05TP4_A4348DisUsrCod[0] ;
            A834TipDefDsc = P05TP4_A834TipDefDsc[0] ;
            n834TipDefDsc = P05TP4_n834TipDefDsc[0] ;
            A279CliNom = P05TP4_A279CliNom[0] ;
            A166BarKgm = P05TP4_A166BarKgm[0] ;
            A199BarPie1 = P05TP4_A199BarPie1[0] ;
            A898BarPieNDes = P05TP4_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV63TotKgs = A166BarKgm ;
            AV64TotPzs = A198BarPie ;
            AV12Bargraaca = A1909BarGraAca ;
            AV13Barancaca1 = A125BarAncAca1 ;
            GXv_int2[0] = AV22MacCod ;
            new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
            pcarordemservico_impl.this.AV22MacCod = GXv_int2[0] ;
            AV24DisCod = A361DisCod ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_int3[0] = A4466BarAcaAnh ;
            GXv_char4[0] = AV23Tb1_dscfb ;
            new app.pptable2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
            pcarordemservico_impl.this.A396EmprCod = GXv_char1[0] ;
            pcarordemservico_impl.this.A252CliCod = GXv_int2[0] ;
            pcarordemservico_impl.this.A4466BarAcaAnh = GXv_int3[0] ;
            pcarordemservico_impl.this.AV23Tb1_dscfb = GXv_char4[0] ;
            AV40DisEnt = GXutil.substring( AV23Tb1_dscfb, 1, 30) ;
            if ( A224BarTraP1 > 0 )
            {
               AV15VCompo = GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" ;
               if ( A225BarTraP2 > 0 )
               {
                  AV15VCompo += GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" ;
               }
               if ( A226BarTraP3 > 0 )
               {
                  AV15VCompo += GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
               }
            }
            AV25i = (short)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV10Tab_obs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05TP5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A377DisObsTxt = P05TP5_A377DisObsTxt[0] ;
               A376DisObsLin = P05TP5_A376DisObsLin[0] ;
               if ( AV25i > 4 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV10Tab_obs[AV25i-1] = A377DisObsTxt ;
               AV25i = (short)(AV25i+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GXv_int5[0] = AV26HayReceta ;
            new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
            pcarordemservico_impl.this.AV26HayReceta = GXv_int5[0] ;
            AV27TxtReceta = ((AV26HayReceta==1) ? httpContext.getMessage( "EMITIDO", "") : httpContext.getMessage( "NÃO EMITIDO", "")) ;
            AV9Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV14HojRut = "*" + GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 8, 0)), (short)(8), "0") + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            GXt_char6 = AV11TipArtDsc ;
            GXv_char4[0] = GXt_char6 ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char4) ;
            pcarordemservico_impl.this.GXt_char6 = GXv_char4[0] ;
            AV11TipArtDsc = GXt_char6 ;
            AV50Muestras = ((GXutil.strcmp(A3030BarPlf, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "AMOSTRAS", "") : "") ;
            AV47BarCod = A129BarCod ;
            AV48BarCodReo = A132BarCodReo ;
            AV49barCodPar = A130BarCodPar ;
            AV55Procenom = " " ;
            /* Using cursor P05TP6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A203BarPieKil = P05TP6_A203BarPieKil[0] ;
               A44AlbRecCod = P05TP6_A44AlbRecCod[0] ;
               A200BarPieCod = P05TP6_A200BarPieCod[0] ;
               AV57Albreccod = A44AlbRecCod ;
               /* Execute user subroutine: 'PROCEDENCIA' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(1);
                  pr_default.close(1);
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
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Execute user subroutine: 'NOTREC' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
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
            AV45Remonta = ((A148BarEstReo==0) ? " " : ((A148BarEstReo==1) ? GXutil.substring( A834TipDefDsc, 1, 15) : GXutil.substring( A834TipDefDsc, 1, 15)+httpContext.getMessage( " O.S. Anterior ", "")+GXutil.str( AV41NR_BARCODA, 8, 0))) ;
            AV67TxtRC = ((A148BarEstReo==2) ? httpContext.getMessage( "DEVOLUÇÃO", "") : ((A148BarEstReo==1) ? httpContext.getMessage( "NÃO CONFORMIDADE", "") : "")) ;
            AV46Exportacion = ((GXutil.strcmp(A5291BarTipCor, httpContext.getMessage( "SI", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NAO", "")) ;
            AV39Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
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
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV51Tab_norma[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV53Tab_normanc[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV52Tab_normast[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV65tab_nc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV54j = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV60Tab_normas[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05TP7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A13216DisNormDsc = P05TP7_A13216DisNormDsc[0] ;
               n13216DisNormDsc = P05TP7_n13216DisNormDsc[0] ;
               A13215DisNormNC = P05TP7_A13215DisNormNC[0] ;
               A13214DisNormSt = P05TP7_A13214DisNormSt[0] ;
               A13213DisNormID = P05TP7_A13213DisNormID[0] ;
               A13216DisNormDsc = P05TP7_A13216DisNormDsc[0] ;
               n13216DisNormDsc = P05TP7_n13216DisNormDsc[0] ;
               if ( AV54j <= 5 )
               {
                  AV51Tab_norma[AV54j-1] = GXutil.substring( A13216DisNormDsc, 1, 15) ;
                  AV53Tab_normanc[AV54j-1] = ((GXutil.strcmp(A13215DisNormNC, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV65tab_nc[AV54j-1] = httpContext.getMessage( "N/Conforme", "") ;
                  AV52Tab_normast[AV54j-1] = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV61Norma = GXutil.substring( A13216DisNormDsc, 1, 15) ;
                  AV62status = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV60Tab_normas[AV54j-1] = GXutil.padr( GXutil.trim( AV61Norma), 15, " ") + " " + AV62status + " " + httpContext.getMessage( "N/Conforme?: ", "") + ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
               }
               AV54j = (byte)(AV54j+1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV56Nxt_artcl2 = ((GXutil.strcmp(GXutil.trim( A11852Nxt_ArtCl2), httpContext.getMessage( "Sem Definir", ""))==0) ? " " : A11852Nxt_ArtCl2) ;
            AV58lista = ((GXutil.strcmp("", A11850Nxt_Mdlo2)==0) ? httpContext.getMessage( "NAO", "") : GXutil.substring( A11850Nxt_Mdlo2, 1, 3)) ;
            AV59relatorio = ((GXutil.strcmp("", A11851Nxt_Sta2)==0) ? httpContext.getMessage( "NAO", "") : GXutil.substring( A11851Nxt_Sta2, 1, 3)) ;
            h5TP0( false, 35) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 19, Gx_line+16, 55, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 422, Gx_line+16, 469, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Un", ""), 498, Gx_line+16, 515, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 559, Gx_line+16, 583, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mts", ""), 631, Gx_line+16, 654, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "gr/m2", ""), 684, Gx_line+16, 719, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Largura", ""), 731, Gx_line+16, 779, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(19, Gx_line+31, 297, Gx_line+31, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(416, Gx_line+31, 474, Gx_line+31, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(484, Gx_line+31, 528, Gx_line+31, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(534, Gx_line+31, 600, Gx_line+31, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(609, Gx_line+31, 675, Gx_line+31, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(684, Gx_line+31, 718, Gx_line+31, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(731, Gx_line+31, 778, Gx_line+31, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localização", ""), 330, Gx_line+16, 402, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(330, Gx_line+31, 401, Gx_line+31, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+35) ;
            AV16Inicio = (byte)(0) ;
            /* Using cursor P05TP8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A50AlbRLoc = P05TP8_A50AlbRLoc[0] ;
               A205BarPieMet = P05TP8_A205BarPieMet[0] ;
               A203BarPieKil = P05TP8_A203BarPieKil[0] ;
               A1501BarPiePie = P05TP8_A1501BarPiePie[0] ;
               A44AlbRecCod = P05TP8_A44AlbRecCod[0] ;
               A200BarPieCod = P05TP8_A200BarPieCod[0] ;
               A50AlbRLoc = P05TP8_A50AlbRLoc[0] ;
               if ( AV16Inicio == 0 )
               {
                  h5TP0( false, 18) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 19, Gx_line+0, 103, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 106, Gx_line+0, 242, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 416, Gx_line+0, 474, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 484, Gx_line+0, 529, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 534, Gx_line+0, 601, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 609, Gx_line+0, 676, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Bargraaca), "ZZZ9")), 688, Gx_line+0, 718, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13Barancaca1), "ZZ9")), 750, Gx_line+0, 773, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 340, Gx_line+1, 404, Gx_line+18, 1+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  AV16Inicio = (byte)(1) ;
               }
               else
               {
                  h5TP0( false, 17) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 416, Gx_line+0, 474, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 484, Gx_line+0, 529, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 534, Gx_line+0, 601, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 609, Gx_line+0, 676, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Bargraaca), "ZZZ9")), 688, Gx_line+0, 718, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13Barancaca1), "ZZ9")), 750, Gx_line+0, 773, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 340, Gx_line+0, 404, Gx_line+17, 1+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            h5TP0( false, 41) ;
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operações", ""), 108, Gx_line+21, 190, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rubrica", ""), 689, Gx_line+23, 733, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+17, 771, Gx_line+17, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(416, Gx_line+16, 416, Gx_line+40, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(770, Gx_line+16, 770, Gx_line+40, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(647, Gx_line+16, 647, Gx_line+40, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Anotações", ""), 469, Gx_line+23, 531, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+16, 13, Gx_line+40, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+39, 771, Gx_line+39, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+41) ;
            /* Using cursor P05TP9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A457FasCod = P05TP9_A457FasCod[0] ;
               A194BarOrdLin = P05TP9_A194BarOrdLin[0] ;
               A758ProCod = P05TP9_A758ProCod[0] ;
               A460FasDsc = P05TP9_A460FasDsc[0] ;
               A9842BarObsF = P05TP9_A9842BarObsF[0] ;
               n9842BarObsF = P05TP9_n9842BarObsF[0] ;
               A460FasDsc = P05TP9_A460FasDsc[0] ;
               h5TP0( false, 33) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 26, Gx_line+8, 84, Gx_line+24, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 101, Gx_line+8, 305, Gx_line+24, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(416, Gx_line+0, 416, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(647, Gx_line+0, 647, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+31, 771, Gx_line+31, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
               AV16Inicio = (byte)(0) ;
               AV29BarParObs = " " ;
               /* Using cursor P05TP10 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A3296BarParObs = P05TP10_A3296BarParObs[0] ;
                  A1664ParFasCod = P05TP10_A1664ParFasCod[0] ;
                  AV16Inicio = (byte)(1) ;
                  AV29BarParObs = A3296BarParObs ;
                  h5TP0( false, 17) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29BarParObs, "")), 64, Gx_line+0, 430, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Obs:", ""), 31, Gx_line+0, 58, Gx_line+14, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               if ( GXutil.strcmp(A9842BarObsF, " ") != 0 )
               {
                  AV29BarParObs = GXutil.substring( A9842BarObsF, 1, 60) ;
                  if ( AV16Inicio == 1 )
                  {
                     h5TP0( false, 17) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29BarParObs, "")), 64, Gx_line+0, 430, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     h5TP0( false, 17) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29BarParObs, "")), 64, Gx_line+0, 430, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Obs:", ""), 31, Gx_line+0, 58, Gx_line+14, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  AV16Inicio = (byte)(1) ;
               }
               /* Using cursor P05TP11 */
               pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A465FasObs = P05TP11_A465FasObs[0] ;
                  A463FasNumLin = P05TP11_A463FasNumLin[0] ;
                  AV29BarParObs = A465FasObs ;
                  if ( AV16Inicio == 0 )
                  {
                     h5TP0( false, 17) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29BarParObs, "")), 64, Gx_line+0, 430, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Obs:", ""), 31, Gx_line+0, 58, Gx_line+14, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     h5TP0( false, 17) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29BarParObs, "")), 64, Gx_line+0, 430, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV16Inicio = (byte)(0) ;
            AV33fec1 = GXutil.nullDate() ;
            /* Using cursor P05TP12 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV22MacCod)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A1199MacCod = P05TP12_A1199MacCod[0] ;
               A1205MacBarPar = P05TP12_A1205MacBarPar[0] ;
               A1204MacBarReo = P05TP12_A1204MacBarReo[0] ;
               A1203MacBarCod = P05TP12_A1203MacBarCod[0] ;
               A1201MacLin = P05TP12_A1201MacLin[0] ;
               if ( AV16Inicio == 0 )
               {
                  AV16Inicio = (byte)(1) ;
                  h5TP0( false, 50) ;
                  getPrinter().GxDrawRect(14, Gx_line+8, 778, Gx_line+26, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigos que Fazem Parte da Mesma Orden de Serviço (", ""), 201, Gx_line+9, 524, Gx_line+25, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22MacCod), "ZZZZZZZ9")), 529, Gx_line+9, 588, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(")", 598, Gx_line+9, 603, Gx_line+25, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 31, Gx_line+31, 67, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 419, Gx_line+31, 438, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Un", ""), 495, Gx_line+31, 512, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 556, Gx_line+31, 580, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mts", ""), 628, Gx_line+31, 651, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(31, Gx_line+47, 338, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(413, Gx_line+47, 471, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(481, Gx_line+47, 525, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(531, Gx_line+47, 597, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(606, Gx_line+47, 672, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(13, Gx_line+6, 777, Gx_line+6, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+50) ;
               }
               if ( ( A129BarCod == A1203MacBarCod ) && ( A132BarCodReo == A1204MacBarReo ) && ( GXutil.strcmp(A1205MacBarPar, A130BarCodPar) == 0 ) )
               {
               }
               else
               {
                  AV37HdrAgr = GXutil.str( A1203MacBarCod, 8, 0) + "-" + GXutil.str( A1204MacBarReo, 1, 0) + A1205MacBarPar ;
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int2[0] = A1203MacBarCod ;
                  GXv_int5[0] = A1204MacBarReo ;
                  GXv_char1[0] = A1205MacBarPar ;
                  GXv_decimal7[0] = AV32KgmAgr ;
                  GXv_decimal8[0] = AV36mTRagR ;
                  GXv_int9[0] = AV31Pecas ;
                  GXv_char10[0] = AV35BarserAgr ;
                  GXv_char11[0] = " " ;
                  GXv_int12[0] = 0 ;
                  GXv_int13[0] = (byte)(0) ;
                  GXv_char14[0] = " " ;
                  GXv_date15[0] = AV33fec1 ;
                  GXv_int16[0] = (byte)(0) ;
                  GXv_char17[0] = " " ;
                  GXv_char18[0] = " " ;
                  GXv_int19[0] = 0 ;
                  GXv_date20[0] = AV33fec1 ;
                  GXv_char21[0] = " " ;
                  GXv_char22[0] = AV34BarserDscAGr ;
                  GXv_int23[0] = 0 ;
                  GXv_date24[0] = AV33fec1 ;
                  GXv_char25[0] = "" ;
                  new app.pinfagr(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int5, GXv_char1, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char10, GXv_char11, GXv_int12, GXv_int13, GXv_char14, GXv_date15, GXv_int16, GXv_char17, GXv_char18, GXv_int19, GXv_date20, GXv_char21, GXv_char22, GXv_int23, GXv_date24, GXv_char25) ;
                  pcarordemservico_impl.this.A396EmprCod = GXv_char4[0] ;
                  pcarordemservico_impl.this.A1203MacBarCod = GXv_int2[0] ;
                  pcarordemservico_impl.this.A1204MacBarReo = GXv_int5[0] ;
                  pcarordemservico_impl.this.A1205MacBarPar = GXv_char1[0] ;
                  pcarordemservico_impl.this.AV32KgmAgr = GXv_decimal7[0] ;
                  pcarordemservico_impl.this.AV36mTRagR = GXv_decimal8[0] ;
                  pcarordemservico_impl.this.AV31Pecas = (short)((short)(GXv_int9[0])) ;
                  pcarordemservico_impl.this.AV35BarserAgr = GXv_char10[0] ;
                  pcarordemservico_impl.this.AV33fec1 = GXv_date15[0] ;
                  pcarordemservico_impl.this.AV33fec1 = GXv_date20[0] ;
                  pcarordemservico_impl.this.AV34BarserDscAGr = GXv_char22[0] ;
                  pcarordemservico_impl.this.AV33fec1 = GXv_date24[0] ;
                  h5TP0( false, 17) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35BarserAgr, "")), 31, Gx_line+0, 115, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31Pecas), "ZZZ9")), 494, Gx_line+0, 524, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32KgmAgr, "ZZZZZ9.99")), 531, Gx_line+0, 598, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34BarserDscAGr, "")), 119, Gx_line+0, 255, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37HdrAgr, "")), 413, Gx_line+0, 471, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36mTRagR, "ZZZZZ9.99")), 606, Gx_line+0, 673, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV63TotKgs = AV63TotKgs.add(AV32KgmAgr) ;
                  AV64TotPzs = (int)(AV64TotPzs+AV31Pecas) ;
               }
               pr_default.readNext(9);
            }
            pr_default.close(9);
            if ( AV16Inicio == 1 )
            {
               h5TP0( false, 22) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63TotKgs, "ZZZZZ9.99")), 531, Gx_line+5, 598, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64TotPzs), "ZZZZZ9")), 479, Gx_line+5, 524, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Totais.:", ""), 346, Gx_line+5, 389, Gx_line+21, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5TP0( true, 0) ;
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
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P05TP13 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV39Cod_Idtx});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A10887Cod_Idtx = P05TP13_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P05TP13_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P05TP13_n10888Dsc_Idtx[0] ;
         AV38Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'NOTREC' Routine */
      returnInSub = false ;
      AV41NR_BARCODA = 0 ;
      AV42NR_BARREOA = (byte)(0) ;
      AV43NR_BARPARA = "" ;
      AV44Nr_codigo = 0 ;
      /* Using cursor P05TP14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV57Albreccod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A5206Nr_albrecc = P05TP14_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P05TP14_n5206Nr_albrecc[0] ;
         A5222Nr_barcoda = P05TP14_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P05TP14_n5222Nr_barcoda[0] ;
         A5223Nr_barreoa = P05TP14_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P05TP14_n5223Nr_barreoa[0] ;
         A5224Nr_barpara = P05TP14_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P05TP14_n5224Nr_barpara[0] ;
         A5198Nr_codigo = P05TP14_A5198Nr_codigo[0] ;
         AV41NR_BARCODA = A5222Nr_barcoda ;
         AV42NR_BARREOA = A5223Nr_barreoa ;
         AV43NR_BARPARA = A5224Nr_barpara ;
         AV44Nr_codigo = A5198Nr_codigo ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PROCEDENCIA' Routine */
      returnInSub = false ;
      AV55Procenom = " " ;
      /* Using cursor P05TP15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV57Albreccod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A970ProceCod = P05TP15_A970ProceCod[0] ;
         n970ProceCod = P05TP15_n970ProceCod[0] ;
         A44AlbRecCod = P05TP15_A44AlbRecCod[0] ;
         A971ProceNom = P05TP15_A971ProceNom[0] ;
         n971ProceNom = P05TP15_n971ProceNom[0] ;
         A971ProceNom = P05TP15_A971ProceNom[0] ;
         n971ProceNom = P05TP15_n971ProceNom[0] ;
         AV55Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void h5TP0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17ContDsc, "")), 19, Gx_line+0, 165, Gx_line+15, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 631, Gx_line+0, 658, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 663, Gx_line+0, 708, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 719, Gx_line+0, 778, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 711, Gx_line+0, 715, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
               getPrinter().GxDrawRect(16, Gx_line+120, 511, Gx_line+223, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O. Serviço Nº", ""), 16, Gx_line+97, 93, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Hdr, "")), 103, Gx_line+97, 161, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 16, Gx_line+16, 242, Gx_line+76) ;
               getPrinter().GxDrawLine(16, Gx_line+81, 780, Gx_line+81, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 648, Gx_line+97, 679, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 686, Gx_line+97, 737, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 22, Gx_line+128, 67, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 103, Gx_line+127, 154, Gx_line+147, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 222, Gx_line+125, 504, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Pedida:", ""), 22, Gx_line+149, 97, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 103, Gx_line+148, 162, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Talao:", ""), 22, Gx_line+170, 73, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 103, Gx_line+169, 250, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 22, Gx_line+191, 47, Gx_line+207, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 259, Gx_line+191, 355, Gx_line+211, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 103, Gx_line+190, 199, Gx_line+210, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Emissão:", ""), 624, Gx_line+129, 679, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4348DisUsrCod, "")), 686, Gx_line+129, 779, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14HojRut, "")), 246, Gx_line+91, 485, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "IQ", ""), 728, Gx_line+32, 742, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia Interna", ""), 699, Gx_line+48, 770, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(578, Gx_line+16, 779, Gx_line+16, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Remonta, "")), 246, Gx_line+57, 648, Gx_line+77, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Muestras, "")), 599, Gx_line+203, 767, Gx_line+224, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 18, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TxtRC, "")), 554, Gx_line+161, 784, Gx_line+190, 1+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+234) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Clear to Wear:", ""), 22, Gx_line+16, 107, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exportaçao:", ""), 22, Gx_line+38, 94, Gx_line+54, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Nxt_artcl2, "")), 114, Gx_line+36, 334, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Dsc_Idtx, "")), 114, Gx_line+15, 297, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc Cliente:", ""), 22, Gx_line+59, 107, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9777BarItem3, "")), 114, Gx_line+58, 261, Gx_line+78, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº da Partida:", ""), 22, Gx_line+81, 102, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9")), 114, Gx_line+80, 148, Gx_line+100, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 22, Gx_line+125, 64, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40DisEnt, "")), 114, Gx_line+124, 334, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "P.O.:", ""), 22, Gx_line+153, 48, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11662BarOrdComp, "")), 114, Gx_line+151, 466, Gx_line+167, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Malheiro:", ""), 22, Gx_line+103, 77, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Procenom, "")), 114, Gx_line+102, 334, Gx_line+122, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(16, Gx_line+8, 788, Gx_line+174, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lista de substâncias Restritas na Fabricação:", ""), 457, Gx_line+16, 728, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Relatorio de Analide da composição da Malha:", ""), 457, Gx_line+38, 729, Gx_line+54, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Motivo N/C:", ""), 503, Gx_line+151, 569, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58lista, "")), 732, Gx_line+16, 774, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59relatorio, "")), 732, Gx_line+36, 774, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Tab_norma[1-1], "")), 503, Gx_line+56, 582, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Tab_norma[2-1], "")), 503, Gx_line+72, 582, Gx_line+89, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Tab_norma[3-1], "")), 503, Gx_line+88, 582, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Tab_norma[4-1], "")), 503, Gx_line+103, 582, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Tab_norma[5-1], "")), 503, Gx_line+119, 582, Gx_line+136, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_normast[1-1], "")), 591, Gx_line+56, 630, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_normast[2-1], "")), 591, Gx_line+72, 630, Gx_line+89, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_normast[3-1], "")), 591, Gx_line+88, 630, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_normast[4-1], "")), 591, Gx_line+103, 630, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_normast[5-1], "")), 591, Gx_line+119, 630, Gx_line+136, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65tab_nc[1-1], "")), 659, Gx_line+56, 723, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65tab_nc[2-1], "")), 659, Gx_line+72, 723, Gx_line+89, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65tab_nc[3-1], "")), 659, Gx_line+88, 723, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65tab_nc[4-1], "")), 659, Gx_line+103, 723, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65tab_nc[5-1], "")), 659, Gx_line+119, 723, Gx_line+136, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Tab_normanc[1-1], "")), 732, Gx_line+56, 774, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Tab_normanc[2-1], "")), 732, Gx_line+72, 774, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Tab_normanc[3-1], "")), 732, Gx_line+88, 774, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Tab_normanc[4-1], "")), 732, Gx_line+103, 774, Gx_line+121, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Tab_normanc[5-1], "")), 732, Gx_line+119, 774, Gx_line+137, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Motivo, "")), 577, Gx_line+151, 766, Gx_line+168, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+179) ;
               getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 19, Gx_line+16, 99, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Tab_obs[1-1], "")), 120, Gx_line+16, 434, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Tab_obs[2-1], "")), 120, Gx_line+31, 434, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Tab_obs[3-1], "")), 120, Gx_line+47, 434, Gx_line+64, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+69) ;
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
      getPrinter().setMetrics("Arial", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("3 of 9 Barcode", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      CloseOpenCursors();
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
      A130BarCodPar = "" ;
      AV8ImpCod = "" ;
      AV17ContDsc = "" ;
      scmdbuf = "" ;
      P05TP2_A396EmprCod = new String[] {""} ;
      P05TP2_A407EmprNom = new String[] {""} ;
      P05TP2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18EmprNom = "" ;
      P05TP4_A833TipDefCod = new short[1] ;
      P05TP4_n833TipDefCod = new boolean[] {false} ;
      P05TP4_A396EmprCod = new String[] {""} ;
      P05TP4_A129BarCod = new int[1] ;
      P05TP4_A132BarCodReo = new byte[1] ;
      P05TP4_A130BarCodPar = new String[] {""} ;
      P05TP4_A1652BarSerDsc = new String[] {""} ;
      P05TP4_A212BarSer = new String[] {""} ;
      P05TP4_A361DisCod = new int[1] ;
      P05TP4_A1909BarGraAca = new short[1] ;
      P05TP4_A125BarAncAca1 = new short[1] ;
      P05TP4_A4466BarAcaAnh = new short[1] ;
      P05TP4_A224BarTraP1 = new short[1] ;
      P05TP4_A225BarTraP2 = new short[1] ;
      P05TP4_A226BarTraP3 = new short[1] ;
      P05TP4_A217BarTipArt = new short[1] ;
      P05TP4_n217BarTipArt = new boolean[] {false} ;
      P05TP4_A3030BarPlf = new String[] {""} ;
      P05TP4_A834TipDefDsc = new String[] {""} ;
      P05TP4_n834TipDefDsc = new boolean[] {false} ;
      P05TP4_A148BarEstReo = new byte[1] ;
      P05TP4_A5291BarTipCor = new String[] {""} ;
      P05TP4_A2829BarProPer = new String[] {""} ;
      P05TP4_A11852Nxt_ArtCl2 = new String[] {""} ;
      P05TP4_A11850Nxt_Mdlo2 = new String[] {""} ;
      P05TP4_A11851Nxt_Sta2 = new String[] {""} ;
      P05TP4_A4348DisUsrCod = new String[] {""} ;
      P05TP4_A135BarColNom = new String[] {""} ;
      P05TP4_A1234BarNomCli = new String[] {""} ;
      P05TP4_A4812BarEncCli = new String[] {""} ;
      P05TP4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P05TP4_A279CliNom = new String[] {""} ;
      P05TP4_A252CliCod = new int[1] ;
      P05TP4_n252CliCod = new boolean[] {false} ;
      P05TP4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05TP4_A11662BarOrdComp = new String[] {""} ;
      P05TP4_A1503BarPart = new short[1] ;
      P05TP4_A9777BarItem3 = new String[] {""} ;
      P05TP4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TP4_A199BarPie1 = new short[1] ;
      P05TP4_A365DisDes = new String[] {""} ;
      P05TP4_A898BarPieNDes = new int[1] ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A3030BarPlf = "" ;
      A834TipDefDsc = "" ;
      A5291BarTipCor = "" ;
      A2829BarProPer = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A11850Nxt_Mdlo2 = "" ;
      A11851Nxt_Sta2 = "" ;
      A4348DisUsrCod = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A4812BarEncCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A279CliNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A11662BarOrdComp = "" ;
      A9777BarItem3 = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV63TotKgs = DecimalUtil.ZERO ;
      GXv_int3 = new short[1] ;
      AV23Tb1_dscfb = "" ;
      AV40DisEnt = "" ;
      AV15VCompo = "" ;
      AV10Tab_obs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV10Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05TP5_A396EmprCod = new String[] {""} ;
      P05TP5_A361DisCod = new int[1] ;
      P05TP5_A377DisObsTxt = new String[] {""} ;
      P05TP5_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV27TxtReceta = "" ;
      AV9Hdr = "" ;
      AV14HojRut = "" ;
      AV11TipArtDsc = "" ;
      GXt_char6 = "" ;
      AV50Muestras = "" ;
      AV49barCodPar = "" ;
      AV55Procenom = "" ;
      P05TP6_A396EmprCod = new String[] {""} ;
      P05TP6_A129BarCod = new int[1] ;
      P05TP6_A132BarCodReo = new byte[1] ;
      P05TP6_A130BarCodPar = new String[] {""} ;
      P05TP6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TP6_A44AlbRecCod = new int[1] ;
      P05TP6_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV45Remonta = "" ;
      AV67TxtRC = "" ;
      AV46Exportacion = "" ;
      AV39Cod_Idtx = "" ;
      AV51Tab_norma = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV51Tab_norma[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV53Tab_normanc = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV53Tab_normanc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV52Tab_normast = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV52Tab_normast[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV65tab_nc = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV65tab_nc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV60Tab_normas = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV60Tab_normas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05TP7_A396EmprCod = new String[] {""} ;
      P05TP7_A361DisCod = new int[1] ;
      P05TP7_A13216DisNormDsc = new String[] {""} ;
      P05TP7_n13216DisNormDsc = new boolean[] {false} ;
      P05TP7_A13215DisNormNC = new String[] {""} ;
      P05TP7_A13214DisNormSt = new String[] {""} ;
      P05TP7_A13213DisNormID = new String[] {""} ;
      A13216DisNormDsc = "" ;
      A13215DisNormNC = "" ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      AV61Norma = "" ;
      AV62status = "" ;
      AV56Nxt_artcl2 = "" ;
      AV58lista = "" ;
      AV59relatorio = "" ;
      P05TP8_A396EmprCod = new String[] {""} ;
      P05TP8_A129BarCod = new int[1] ;
      P05TP8_A132BarCodReo = new byte[1] ;
      P05TP8_A130BarCodPar = new String[] {""} ;
      P05TP8_A50AlbRLoc = new String[] {""} ;
      P05TP8_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TP8_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TP8_A1501BarPiePie = new int[1] ;
      P05TP8_A44AlbRecCod = new int[1] ;
      P05TP8_A200BarPieCod = new String[] {""} ;
      A50AlbRLoc = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      P05TP9_A396EmprCod = new String[] {""} ;
      P05TP9_A129BarCod = new int[1] ;
      P05TP9_A132BarCodReo = new byte[1] ;
      P05TP9_A130BarCodPar = new String[] {""} ;
      P05TP9_A457FasCod = new String[] {""} ;
      P05TP9_A194BarOrdLin = new short[1] ;
      P05TP9_A758ProCod = new String[] {""} ;
      P05TP9_A460FasDsc = new String[] {""} ;
      P05TP9_A9842BarObsF = new String[] {""} ;
      P05TP9_n9842BarObsF = new boolean[] {false} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A460FasDsc = "" ;
      A9842BarObsF = "" ;
      AV29BarParObs = "" ;
      P05TP10_A396EmprCod = new String[] {""} ;
      P05TP10_A129BarCod = new int[1] ;
      P05TP10_A132BarCodReo = new byte[1] ;
      P05TP10_A130BarCodPar = new String[] {""} ;
      P05TP10_A758ProCod = new String[] {""} ;
      P05TP10_A194BarOrdLin = new short[1] ;
      P05TP10_A3296BarParObs = new String[] {""} ;
      P05TP10_A1664ParFasCod = new short[1] ;
      A3296BarParObs = "" ;
      P05TP11_A396EmprCod = new String[] {""} ;
      P05TP11_A457FasCod = new String[] {""} ;
      P05TP11_A465FasObs = new String[] {""} ;
      P05TP11_A463FasNumLin = new byte[1] ;
      A465FasObs = "" ;
      AV33fec1 = GXutil.nullDate() ;
      P05TP12_A396EmprCod = new String[] {""} ;
      P05TP12_A1199MacCod = new int[1] ;
      P05TP12_A1205MacBarPar = new String[] {""} ;
      P05TP12_A1204MacBarReo = new byte[1] ;
      P05TP12_A1203MacBarCod = new int[1] ;
      P05TP12_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV37HdrAgr = "" ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char1 = new String[1] ;
      AV32KgmAgr = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV36mTRagR = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      AV35BarserAgr = "" ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int19 = new int[1] ;
      GXv_date20 = new java.util.Date[1] ;
      GXv_char21 = new String[1] ;
      AV34BarserDscAGr = "" ;
      GXv_char22 = new String[1] ;
      GXv_int23 = new int[1] ;
      GXv_date24 = new java.util.Date[1] ;
      GXv_char25 = new String[1] ;
      P05TP13_A396EmprCod = new String[] {""} ;
      P05TP13_A10887Cod_Idtx = new String[] {""} ;
      P05TP13_A10888Dsc_Idtx = new String[] {""} ;
      P05TP13_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV38Dsc_Idtx = "" ;
      AV43NR_BARPARA = "" ;
      P05TP14_A396EmprCod = new String[] {""} ;
      P05TP14_A5206Nr_albrecc = new int[1] ;
      P05TP14_n5206Nr_albrecc = new boolean[] {false} ;
      P05TP14_A5222Nr_barcoda = new int[1] ;
      P05TP14_n5222Nr_barcoda = new boolean[] {false} ;
      P05TP14_A5223Nr_barreoa = new byte[1] ;
      P05TP14_n5223Nr_barreoa = new boolean[] {false} ;
      P05TP14_A5224Nr_barpara = new String[] {""} ;
      P05TP14_n5224Nr_barpara = new boolean[] {false} ;
      P05TP14_A5198Nr_codigo = new int[1] ;
      A5224Nr_barpara = "" ;
      P05TP15_A970ProceCod = new short[1] ;
      P05TP15_n970ProceCod = new boolean[] {false} ;
      P05TP15_A396EmprCod = new String[] {""} ;
      P05TP15_A44AlbRecCod = new int[1] ;
      P05TP15_A971ProceNom = new String[] {""} ;
      P05TP15_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      AV66Motivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcarordemservico__default(),
         new Object[] {
             new Object[] {
            P05TP2_A396EmprCod, P05TP2_A407EmprNom, P05TP2_n407EmprNom
            }
            , new Object[] {
            P05TP4_A833TipDefCod, P05TP4_n833TipDefCod, P05TP4_A396EmprCod, P05TP4_A129BarCod, P05TP4_A132BarCodReo, P05TP4_A130BarCodPar, P05TP4_A1652BarSerDsc, P05TP4_A212BarSer, P05TP4_A361DisCod, P05TP4_A1909BarGraAca,
            P05TP4_A125BarAncAca1, P05TP4_A4466BarAcaAnh, P05TP4_A224BarTraP1, P05TP4_A225BarTraP2, P05TP4_A226BarTraP3, P05TP4_A217BarTipArt, P05TP4_n217BarTipArt, P05TP4_A3030BarPlf, P05TP4_A834TipDefDsc, P05TP4_n834TipDefDsc,
            P05TP4_A148BarEstReo, P05TP4_A5291BarTipCor, P05TP4_A2829BarProPer, P05TP4_A11852Nxt_ArtCl2, P05TP4_A11850Nxt_Mdlo2, P05TP4_A11851Nxt_Sta2, P05TP4_A4348DisUsrCod, P05TP4_A135BarColNom, P05TP4_A1234BarNomCli, P05TP4_A4812BarEncCli,
            P05TP4_A155BarFecCli, P05TP4_A279CliNom, P05TP4_A252CliCod, P05TP4_n252CliCod, P05TP4_A159BarFecGen, P05TP4_A11662BarOrdComp, P05TP4_A1503BarPart, P05TP4_A9777BarItem3, P05TP4_A166BarKgm, P05TP4_A199BarPie1,
            P05TP4_A365DisDes, P05TP4_A898BarPieNDes
            }
            , new Object[] {
            P05TP5_A396EmprCod, P05TP5_A361DisCod, P05TP5_A377DisObsTxt, P05TP5_A376DisObsLin
            }
            , new Object[] {
            P05TP6_A396EmprCod, P05TP6_A129BarCod, P05TP6_A132BarCodReo, P05TP6_A130BarCodPar, P05TP6_A203BarPieKil, P05TP6_A44AlbRecCod, P05TP6_A200BarPieCod
            }
            , new Object[] {
            P05TP7_A396EmprCod, P05TP7_A361DisCod, P05TP7_A13216DisNormDsc, P05TP7_n13216DisNormDsc, P05TP7_A13215DisNormNC, P05TP7_A13214DisNormSt, P05TP7_A13213DisNormID
            }
            , new Object[] {
            P05TP8_A396EmprCod, P05TP8_A129BarCod, P05TP8_A132BarCodReo, P05TP8_A130BarCodPar, P05TP8_A50AlbRLoc, P05TP8_A205BarPieMet, P05TP8_A203BarPieKil, P05TP8_A1501BarPiePie, P05TP8_A44AlbRecCod, P05TP8_A200BarPieCod
            }
            , new Object[] {
            P05TP9_A396EmprCod, P05TP9_A129BarCod, P05TP9_A132BarCodReo, P05TP9_A130BarCodPar, P05TP9_A457FasCod, P05TP9_A194BarOrdLin, P05TP9_A758ProCod, P05TP9_A460FasDsc, P05TP9_A9842BarObsF, P05TP9_n9842BarObsF
            }
            , new Object[] {
            P05TP10_A396EmprCod, P05TP10_A129BarCod, P05TP10_A132BarCodReo, P05TP10_A130BarCodPar, P05TP10_A758ProCod, P05TP10_A194BarOrdLin, P05TP10_A3296BarParObs, P05TP10_A1664ParFasCod
            }
            , new Object[] {
            P05TP11_A396EmprCod, P05TP11_A457FasCod, P05TP11_A465FasObs, P05TP11_A463FasNumLin
            }
            , new Object[] {
            P05TP12_A396EmprCod, P05TP12_A1199MacCod, P05TP12_A1205MacBarPar, P05TP12_A1204MacBarReo, P05TP12_A1203MacBarCod, P05TP12_A1201MacLin
            }
            , new Object[] {
            P05TP13_A396EmprCod, P05TP13_A10887Cod_Idtx, P05TP13_A10888Dsc_Idtx, P05TP13_n10888Dsc_Idtx
            }
            , new Object[] {
            P05TP14_A396EmprCod, P05TP14_A5206Nr_albrecc, P05TP14_n5206Nr_albrecc, P05TP14_A5222Nr_barcoda, P05TP14_n5222Nr_barcoda, P05TP14_A5223Nr_barreoa, P05TP14_n5223Nr_barreoa, P05TP14_A5224Nr_barpara, P05TP14_n5224Nr_barpara, P05TP14_A5198Nr_codigo
            }
            , new Object[] {
            P05TP15_A970ProceCod, P05TP15_n970ProceCod, P05TP15_A396EmprCod, P05TP15_A44AlbRecCod, P05TP15_A971ProceNom, P05TP15_n971ProceNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A376DisObsLin ;
   private byte AV26HayReceta ;
   private byte AV48BarCodReo ;
   private byte AV54j ;
   private byte AV16Inicio ;
   private byte A463FasNumLin ;
   private byte A1204MacBarReo ;
   private byte GXv_int5[] ;
   private byte GXv_int13[] ;
   private byte GXv_int16[] ;
   private byte AV42NR_BARREOA ;
   private byte A5223Nr_barreoa ;
   private short gxcookieaux ;
   private short A833TipDefCod ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A4466BarAcaAnh ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A217BarTipArt ;
   private short A1503BarPart ;
   private short A199BarPie1 ;
   private short AV12Bargraaca ;
   private short AV13Barancaca1 ;
   private short GXv_int3[] ;
   private short AV25i ;
   private short A194BarOrdLin ;
   private short A1664ParFasCod ;
   private short A1201MacLin ;
   private short AV31Pecas ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV64TotPzs ;
   private int AV22MacCod ;
   private int AV24DisCod ;
   private int GX_I ;
   private int AV47BarCod ;
   private int A44AlbRecCod ;
   private int AV57Albreccod ;
   private int AV41NR_BARCODA ;
   private int Gx_OldLine ;
   private int A1501BarPiePie ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int GXv_int2[] ;
   private int GXv_int9[] ;
   private int GXv_int12[] ;
   private int GXv_int19[] ;
   private int GXv_int23[] ;
   private int AV44Nr_codigo ;
   private int A5206Nr_albrecc ;
   private int A5222Nr_barcoda ;
   private int A5198Nr_codigo ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV63TotKgs ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV32KgmAgr ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV36mTRagR ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8ImpCod ;
   private String AV17ContDsc ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18EmprNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A3030BarPlf ;
   private String A834TipDefDsc ;
   private String A5291BarTipCor ;
   private String A2829BarProPer ;
   private String A11852Nxt_ArtCl2 ;
   private String A11850Nxt_Mdlo2 ;
   private String A11851Nxt_Sta2 ;
   private String A4348DisUsrCod ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A4812BarEncCli ;
   private String A279CliNom ;
   private String A9777BarItem3 ;
   private String A365DisDes ;
   private String AV23Tb1_dscfb ;
   private String AV40DisEnt ;
   private String AV15VCompo ;
   private String AV10Tab_obs[] ;
   private String A377DisObsTxt ;
   private String AV27TxtReceta ;
   private String AV9Hdr ;
   private String AV14HojRut ;
   private String AV11TipArtDsc ;
   private String GXt_char6 ;
   private String AV50Muestras ;
   private String AV49barCodPar ;
   private String AV55Procenom ;
   private String A200BarPieCod ;
   private String AV45Remonta ;
   private String AV67TxtRC ;
   private String AV46Exportacion ;
   private String AV39Cod_Idtx ;
   private String AV51Tab_norma[] ;
   private String AV53Tab_normanc[] ;
   private String AV52Tab_normast[] ;
   private String AV65tab_nc[] ;
   private String AV60Tab_normas[] ;
   private String A13216DisNormDsc ;
   private String A13215DisNormNC ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String AV61Norma ;
   private String AV62status ;
   private String AV56Nxt_artcl2 ;
   private String AV58lista ;
   private String AV59relatorio ;
   private String A50AlbRLoc ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A460FasDsc ;
   private String AV29BarParObs ;
   private String A3296BarParObs ;
   private String A465FasObs ;
   private String A1205MacBarPar ;
   private String AV37HdrAgr ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String AV35BarserAgr ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char14[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char21[] ;
   private String AV34BarserDscAGr ;
   private String GXv_char22[] ;
   private String GXv_char25[] ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV38Dsc_Idtx ;
   private String AV43NR_BARPARA ;
   private String A5224Nr_barpara ;
   private String A971ProceNom ;
   private String AV66Motivo ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV33fec1 ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date GXv_date20[] ;
   private java.util.Date GXv_date24[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n833TipDefCod ;
   private boolean n217BarTipArt ;
   private boolean n834TipDefDsc ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n13216DisNormDsc ;
   private boolean n9842BarObsF ;
   private boolean n10888Dsc_Idtx ;
   private boolean n5206Nr_albrecc ;
   private boolean n5222Nr_barcoda ;
   private boolean n5223Nr_barreoa ;
   private boolean n5224Nr_barpara ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private String A11662BarOrdComp ;
   private String A9842BarObsF ;
   private IDataStoreProvider pr_default ;
   private String[] P05TP2_A396EmprCod ;
   private String[] P05TP2_A407EmprNom ;
   private boolean[] P05TP2_n407EmprNom ;
   private short[] P05TP4_A833TipDefCod ;
   private boolean[] P05TP4_n833TipDefCod ;
   private String[] P05TP4_A396EmprCod ;
   private int[] P05TP4_A129BarCod ;
   private byte[] P05TP4_A132BarCodReo ;
   private String[] P05TP4_A130BarCodPar ;
   private String[] P05TP4_A1652BarSerDsc ;
   private String[] P05TP4_A212BarSer ;
   private int[] P05TP4_A361DisCod ;
   private short[] P05TP4_A1909BarGraAca ;
   private short[] P05TP4_A125BarAncAca1 ;
   private short[] P05TP4_A4466BarAcaAnh ;
   private short[] P05TP4_A224BarTraP1 ;
   private short[] P05TP4_A225BarTraP2 ;
   private short[] P05TP4_A226BarTraP3 ;
   private short[] P05TP4_A217BarTipArt ;
   private boolean[] P05TP4_n217BarTipArt ;
   private String[] P05TP4_A3030BarPlf ;
   private String[] P05TP4_A834TipDefDsc ;
   private boolean[] P05TP4_n834TipDefDsc ;
   private byte[] P05TP4_A148BarEstReo ;
   private String[] P05TP4_A5291BarTipCor ;
   private String[] P05TP4_A2829BarProPer ;
   private String[] P05TP4_A11852Nxt_ArtCl2 ;
   private String[] P05TP4_A11850Nxt_Mdlo2 ;
   private String[] P05TP4_A11851Nxt_Sta2 ;
   private String[] P05TP4_A4348DisUsrCod ;
   private String[] P05TP4_A135BarColNom ;
   private String[] P05TP4_A1234BarNomCli ;
   private String[] P05TP4_A4812BarEncCli ;
   private java.util.Date[] P05TP4_A155BarFecCli ;
   private String[] P05TP4_A279CliNom ;
   private int[] P05TP4_A252CliCod ;
   private boolean[] P05TP4_n252CliCod ;
   private java.util.Date[] P05TP4_A159BarFecGen ;
   private String[] P05TP4_A11662BarOrdComp ;
   private short[] P05TP4_A1503BarPart ;
   private String[] P05TP4_A9777BarItem3 ;
   private java.math.BigDecimal[] P05TP4_A166BarKgm ;
   private short[] P05TP4_A199BarPie1 ;
   private String[] P05TP4_A365DisDes ;
   private int[] P05TP4_A898BarPieNDes ;
   private String[] P05TP5_A396EmprCod ;
   private int[] P05TP5_A361DisCod ;
   private String[] P05TP5_A377DisObsTxt ;
   private byte[] P05TP5_A376DisObsLin ;
   private String[] P05TP6_A396EmprCod ;
   private int[] P05TP6_A129BarCod ;
   private byte[] P05TP6_A132BarCodReo ;
   private String[] P05TP6_A130BarCodPar ;
   private java.math.BigDecimal[] P05TP6_A203BarPieKil ;
   private int[] P05TP6_A44AlbRecCod ;
   private String[] P05TP6_A200BarPieCod ;
   private String[] P05TP7_A396EmprCod ;
   private int[] P05TP7_A361DisCod ;
   private String[] P05TP7_A13216DisNormDsc ;
   private boolean[] P05TP7_n13216DisNormDsc ;
   private String[] P05TP7_A13215DisNormNC ;
   private String[] P05TP7_A13214DisNormSt ;
   private String[] P05TP7_A13213DisNormID ;
   private String[] P05TP8_A396EmprCod ;
   private int[] P05TP8_A129BarCod ;
   private byte[] P05TP8_A132BarCodReo ;
   private String[] P05TP8_A130BarCodPar ;
   private String[] P05TP8_A50AlbRLoc ;
   private java.math.BigDecimal[] P05TP8_A205BarPieMet ;
   private java.math.BigDecimal[] P05TP8_A203BarPieKil ;
   private int[] P05TP8_A1501BarPiePie ;
   private int[] P05TP8_A44AlbRecCod ;
   private String[] P05TP8_A200BarPieCod ;
   private String[] P05TP9_A396EmprCod ;
   private int[] P05TP9_A129BarCod ;
   private byte[] P05TP9_A132BarCodReo ;
   private String[] P05TP9_A130BarCodPar ;
   private String[] P05TP9_A457FasCod ;
   private short[] P05TP9_A194BarOrdLin ;
   private String[] P05TP9_A758ProCod ;
   private String[] P05TP9_A460FasDsc ;
   private String[] P05TP9_A9842BarObsF ;
   private boolean[] P05TP9_n9842BarObsF ;
   private String[] P05TP10_A396EmprCod ;
   private int[] P05TP10_A129BarCod ;
   private byte[] P05TP10_A132BarCodReo ;
   private String[] P05TP10_A130BarCodPar ;
   private String[] P05TP10_A758ProCod ;
   private short[] P05TP10_A194BarOrdLin ;
   private String[] P05TP10_A3296BarParObs ;
   private short[] P05TP10_A1664ParFasCod ;
   private String[] P05TP11_A396EmprCod ;
   private String[] P05TP11_A457FasCod ;
   private String[] P05TP11_A465FasObs ;
   private byte[] P05TP11_A463FasNumLin ;
   private String[] P05TP12_A396EmprCod ;
   private int[] P05TP12_A1199MacCod ;
   private String[] P05TP12_A1205MacBarPar ;
   private byte[] P05TP12_A1204MacBarReo ;
   private int[] P05TP12_A1203MacBarCod ;
   private short[] P05TP12_A1201MacLin ;
   private String[] P05TP13_A396EmprCod ;
   private String[] P05TP13_A10887Cod_Idtx ;
   private String[] P05TP13_A10888Dsc_Idtx ;
   private boolean[] P05TP13_n10888Dsc_Idtx ;
   private String[] P05TP14_A396EmprCod ;
   private int[] P05TP14_A5206Nr_albrecc ;
   private boolean[] P05TP14_n5206Nr_albrecc ;
   private int[] P05TP14_A5222Nr_barcoda ;
   private boolean[] P05TP14_n5222Nr_barcoda ;
   private byte[] P05TP14_A5223Nr_barreoa ;
   private boolean[] P05TP14_n5223Nr_barreoa ;
   private String[] P05TP14_A5224Nr_barpara ;
   private boolean[] P05TP14_n5224Nr_barpara ;
   private int[] P05TP14_A5198Nr_codigo ;
   private short[] P05TP15_A970ProceCod ;
   private boolean[] P05TP15_n970ProceCod ;
   private String[] P05TP15_A396EmprCod ;
   private int[] P05TP15_A44AlbRecCod ;
   private String[] P05TP15_A971ProceNom ;
   private boolean[] P05TP15_n971ProceNom ;
}

final  class pcarordemservico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05TP2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TP4", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSerDsc, T1.BarSer, T1.DisCod, T1.BarGraAca, T1.BarAncAca1, T1.BarAcaAnh, T1.BarTraP1, T1.BarTraP2, T1.BarTraP3, T1.BarTipArt, T1.BarPlf, T3.TipDefDsc, T1.BarEstReo, T1.BarTipCor, T1.BarProPer, T1.Nxt_ArtCl2, T1.Nxt_Mdlo2, T1.Nxt_Sta2, T2.DisUsrCod, T1.BarColNom, T1.BarNomCli, T1.BarEncCli, T1.BarFecCli, T4.CliNom, T1.CliCod, T1.BarFecGen, T1.BarOrdComp, T1.BarPart, T1.BarItem3, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TP5", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TP6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TP7", "SELECT T1.EmprCod, T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormNC, T1.DisNormSt, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TP8", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRLoc, T1.BarPieMet, T1.BarPieKil, T1.BarPiePie, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TP9", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T1.BarOrdLin, T1.ProCod, T2.FasDsc, T1.BarObsF FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TP10", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarParObs, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TP11", "SELECT EmprCod, FasCod, FasObs, FasNumLin FROM TXPFASLIN WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TP12", "SELECT EmprCod, MacCod, MacBarPar, MacBarReo, MacBarCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TP13", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05TP14", "SELECT EmprCod, Nr_albrecc, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05TP15", "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 2);
               ((String[]) buf[22])[0] = rslt.getString(20, 8);
               ((String[]) buf[23])[0] = rslt.getString(21, 30);
               ((String[]) buf[24])[0] = rslt.getString(22, 30);
               ((String[]) buf[25])[0] = rslt.getString(23, 4);
               ((String[]) buf[26])[0] = rslt.getString(24, 8);
               ((String[]) buf[27])[0] = rslt.getString(25, 13);
               ((String[]) buf[28])[0] = rslt.getString(26, 13);
               ((String[]) buf[29])[0] = rslt.getString(27, 20);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 30);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(31);
               ((String[]) buf[35])[0] = rslt.getVarchar(32);
               ((short[]) buf[36])[0] = rslt.getShort(33);
               ((String[]) buf[37])[0] = rslt.getString(34, 20);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[39])[0] = rslt.getShort(36);
               ((String[]) buf[40])[0] = rslt.getString(37, 1);
               ((int[]) buf[41])[0] = rslt.getInt(38);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 70);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

