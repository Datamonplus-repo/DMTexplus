package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class palb003_impl extends GXWebReport
{
   public palb003_impl( com.genexus.internet.HttpContext context )
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
            AV58ImpCod = httpContext.GetPar( "ImpCod") ;
            AV98Prio = httpContext.GetPar( "Prio") ;
            AV94PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV125UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV96PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV127UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV93PBarSer = httpContext.GetPar( "PBarSer") ;
            AV124UBarSer = httpContext.GetPar( "UBarSer") ;
            AV95PDisNum = httpContext.GetPar( "PDisNum") ;
            AV126UDisNum = httpContext.GetPar( "UDisNum") ;
            AV57Fuente = (byte)(GXutil.lval( httpContext.GetPar( "Fuente"))) ;
            AV17Barcodi = (int)(GXutil.lval( httpContext.GetPar( "Barcodi"))) ;
            AV21Barcodreof = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreof"))) ;
            AV19Barcodparf = httpContext.GetPar( "Barcodparf") ;
            AV24Barcolnomi = httpContext.GetPar( "Barcolnomi") ;
            AV23Barcolnomf = httpContext.GetPar( "Barcolnomf") ;
            AV27Barcolnumi = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumi"))) ;
            AV26Barcolnumf = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumf"))) ;
            AV35BarMaqEst1 = httpContext.GetPar( "BarMaqEst1") ;
            AV36BarMaqEst2 = httpContext.GetPar( "BarMaqEst2") ;
            AV100Serie = httpContext.GetPar( "Serie") ;
            AV91Nfi = (int)(GXutil.lval( httpContext.GetPar( "Nfi"))) ;
            AV90Nff = (int)(GXutil.lval( httpContext.GetPar( "Nff"))) ;
            AV33Barlar = httpContext.GetPar( "Barlar") ;
            AV107Tipdiscod = httpContext.GetPar( "Tipdiscod") ;
            AV29Barestreo = (byte)(GXutil.lval( httpContext.GetPar( "Barestreo"))) ;
            AV52DetalleRollos = (byte)(GXutil.lval( httpContext.GetPar( "DetalleRollos"))) ;
            AV11AlbProCod1 = GXutil.lval( httpContext.GetPar( "AlbProCod1")) ;
            AV10Albprocod_to = GXutil.lval( httpContext.GetPar( "Albprocod_to")) ;
            AV42Bartipart = (short)(GXutil.lval( httpContext.GetPar( "Bartipart"))) ;
            AV43Bartipart_to = (short)(GXutil.lval( httpContext.GetPar( "Bartipart_to"))) ;
            AV12BarAcaQuifrom = httpContext.GetPar( "BarAcaQuifrom") ;
            AV13BarAcaQuito = httpContext.GetPar( "BarAcaQuito") ;
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
      M_bot = 6 ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 256, 11909, 16963, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV88Moda21 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
         palb003_impl.this.GXt_int1 = GXv_int2[0] ;
         AV88Moda21 = GXt_int1 ;
         /* Using cursor P0AEQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0AEQ2_A407EmprNom[0] ;
            n407EmprNom = P0AEQ2_n407EmprNom[0] ;
            AV92NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV108TipDisDsc = httpContext.getMessage( "Todo", "") ;
         /* Using cursor P0AEQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV107Tipdiscod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5098TipDisCod = P0AEQ3_A5098TipDisCod[0] ;
            A5097TipDisDsc = P0AEQ3_A5097TipDisDsc[0] ;
            n5097TipDisDsc = P0AEQ3_n5097TipDisDsc[0] ;
            AV108TipDisDsc = A5097TipDisDsc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV29Barestreo == 0 )
         {
            AV109TipProd = httpContext.getMessage( "Prod Normal", "") ;
         }
         else if ( AV29Barestreo == 1 )
         {
            AV109TipProd = httpContext.getMessage( "Prod NC", "") ;
         }
         else if ( AV29Barestreo == 2 )
         {
            AV109TipProd = httpContext.getMessage( "Prod RC", "") ;
         }
         else if ( AV29Barestreo == 9 )
         {
            AV109TipProd = httpContext.getMessage( "Todo", "") ;
         }
         AV31Barestreoi = (byte)(0) ;
         AV30BarEstreof = (byte)(2) ;
         if ( AV29Barestreo == 2 )
         {
            AV31Barestreoi = (byte)(2) ;
            AV30BarEstreof = (byte)(2) ;
         }
         if ( AV29Barestreo == 1 )
         {
            AV31Barestreoi = (byte)(1) ;
            AV30BarEstreof = (byte)(1) ;
         }
         if ( AV29Barestreo == 0 )
         {
            AV31Barestreoi = (byte)(0) ;
            AV30BarEstreof = (byte)(0) ;
         }
         AV128last_clicod = 0 ;
         GxHdr4 = true ;
         /* Using cursor P0AEQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV94PCliCod), Long.valueOf(AV11AlbProCod1), AV96PFecha, AV127UFecha, AV98Prio, AV98Prio, Long.valueOf(AV10Albprocod_to), Integer.valueOf(AV125UCliCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A34AlbProfch = P0AEQ4_A34AlbProfch[0] ;
            A30AlbProCod = P0AEQ4_A30AlbProCod[0] ;
            A5140AlbMarca = P0AEQ4_A5140AlbMarca[0] ;
            A39AlbProPri = P0AEQ4_A39AlbProPri[0] ;
            A1243GuiRemCli = P0AEQ4_A1243GuiRemCli[0] ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               AV44CliCod = A1243GuiRemCli ;
               /* Execute user subroutine: 'CLIENTE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV128last_clicod != AV44CliCod )
               {
                  if ( ( AV128last_clicod != AV44CliCod ) && ( AV128last_clicod > 0 ) )
                  {
                     hAEQ0( false, 22) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV111TotKilC, "ZZZZZZ9.99")), 823, Gx_line+0, 897, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV115TotMetC, "ZZZZZZ9.99")), 897, Gx_line+0, 971, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV119TotPieC), "ZZZZZ9")), 978, Gx_line+3, 1023, Gx_line+20, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Total Cliente", ""), 605, Gx_line+3, 701, Gx_line+20, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV130totkilocrudoc, "ZZZZZZ9.99")), 749, Gx_line+0, 823, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+22) ;
                     AV111TotKilC = DecimalUtil.doubleToDec(0) ;
                     AV115TotMetC = DecimalUtil.doubleToDec(0) ;
                     AV119TotPieC = 0 ;
                     AV130totkilocrudoc = DecimalUtil.doubleToDec(0) ;
                  }
                  hAEQ0( false, 27) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44CliCod), "ZZZZZ9")), 36, Gx_line+6, 81, Gx_line+24, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49CliNom, "")), 88, Gx_line+6, 308, Gx_line+24, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
               /* Using cursor P0AEQ6 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), AV93PBarSer, AV124UBarSer, AV95PDisNum, AV126UDisNum, AV24Barcolnomi, AV23Barcolnomf, Integer.valueOf(AV27Barcolnumi), Integer.valueOf(AV26Barcolnumf), Integer.valueOf(AV17Barcodi), Integer.valueOf(AV17Barcodi), Byte.valueOf(AV21Barcodreof), Byte.valueOf(AV21Barcodreof), AV19Barcodparf, AV19Barcodparf, Byte.valueOf(AV31Barestreoi), Byte.valueOf(AV30BarEstreof), AV107Tipdiscod, AV107Tipdiscod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A2010BarTipDis = P0AEQ6_A2010BarTipDis[0] ;
                  A148BarEstReo = P0AEQ6_A148BarEstReo[0] ;
                  A136BarColNum = P0AEQ6_A136BarColNum[0] ;
                  A135BarColNom = P0AEQ6_A135BarColNom[0] ;
                  A143BarDisNum = P0AEQ6_A143BarDisNum[0] ;
                  A212BarSer = P0AEQ6_A212BarSer[0] ;
                  A1261BarAlbKgmE = P0AEQ6_A1261BarAlbKgmE[0] ;
                  A1263BarAlbMtrE = P0AEQ6_A1263BarAlbMtrE[0] ;
                  A2243BarKgsCli = P0AEQ6_A2243BarKgsCli[0] ;
                  n2243BarKgsCli = P0AEQ6_n2243BarKgsCli[0] ;
                  A1461BarAlbPN = P0AEQ6_A1461BarAlbPN[0] ;
                  A1234BarNomCli = P0AEQ6_A1234BarNomCli[0] ;
                  A4812BarEncCli = P0AEQ6_A4812BarEncCli[0] ;
                  A1265BarAlbPie = P0AEQ6_A1265BarAlbPie[0] ;
                  A155BarFecCli = P0AEQ6_A155BarFecCli[0] ;
                  A166BarKgm = P0AEQ6_A166BarKgm[0] ;
                  n166BarKgm = P0AEQ6_n166BarKgm[0] ;
                  A130BarCodPar = P0AEQ6_A130BarCodPar[0] ;
                  A132BarCodReo = P0AEQ6_A132BarCodReo[0] ;
                  A129BarCod = P0AEQ6_A129BarCod[0] ;
                  A2010BarTipDis = P0AEQ6_A2010BarTipDis[0] ;
                  A148BarEstReo = P0AEQ6_A148BarEstReo[0] ;
                  A136BarColNum = P0AEQ6_A136BarColNum[0] ;
                  A135BarColNom = P0AEQ6_A135BarColNom[0] ;
                  A143BarDisNum = P0AEQ6_A143BarDisNum[0] ;
                  A212BarSer = P0AEQ6_A212BarSer[0] ;
                  A1234BarNomCli = P0AEQ6_A1234BarNomCli[0] ;
                  A4812BarEncCli = P0AEQ6_A4812BarEncCli[0] ;
                  A155BarFecCli = P0AEQ6_A155BarFecCli[0] ;
                  A166BarKgm = P0AEQ6_A166BarKgm[0] ;
                  n166BarKgm = P0AEQ6_n166BarKgm[0] ;
                  A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                  AV14BarAlbKgmE = A1261BarAlbKgmE ;
                  AV15BarAlbMtrE = A1263BarAlbMtrE ;
                  if ( AV88Moda21 == 1 )
                  {
                     if ( A2243BarKgsCli.doubleValue() != 0 )
                     {
                        AV14BarAlbKgmE = A2243BarKgsCli ;
                     }
                     if ( A1461BarAlbPN.doubleValue() != 0 )
                     {
                        AV15BarAlbMtrE = A1461BarAlbPN ;
                     }
                  }
                  AV22BarColNom = A135BarColNom ;
                  AV25BarColNum = A136BarColNum ;
                  AV37barNomcli = A1234BarNomCli ;
                  AV32BarKgm = A166BarKgm ;
                  AV16Barcod = A129BarCod ;
                  AV20BarCodreo = A132BarCodReo ;
                  AV18Barcodpar = A130BarCodPar ;
                  AV9ALbProcod = A30AlbProCod ;
                  AV28Barenccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                  hAEQ0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 10, Gx_line+0, 84, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 92, Gx_line+0, 151, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 158, Gx_line+0, 217, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 225, Gx_line+0, 284, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), 292, Gx_line+0, 373, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 380, Gx_line+0, 498, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37barNomcli, "")), 505, Gx_line+0, 601, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22BarColNom, "")), 608, Gx_line+0, 704, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25BarColNum), "ZZZZZ9")), 711, Gx_line+0, 756, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32BarKgm, "ZZZZ9.99")), 764, Gx_line+0, 823, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14BarAlbKgmE, "ZZZZZ9.99")), 830, Gx_line+0, 897, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15BarAlbMtrE, "ZZZZZ9.99")), 904, Gx_line+0, 971, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 978, Gx_line+0, 1023, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  AV111TotKilC = AV111TotKilC.add(AV14BarAlbKgmE) ;
                  AV115TotMetC = AV115TotMetC.add(AV15BarAlbMtrE) ;
                  AV119TotPieC = (int)(AV119TotPieC+A1265BarAlbPie) ;
                  AV130totkilocrudoc = AV130totkilocrudoc.add(A166BarKgm) ;
                  AV110TotKil = AV110TotKil.add(AV14BarAlbKgmE) ;
                  AV114TotMet = AV114TotMet.add(AV15BarAlbMtrE) ;
                  AV118TotPie = (int)(AV118TotPie+A1265BarAlbPie) ;
                  AV129totkilocrudo = AV129totkilocrudo.add(A166BarKgm) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               AV128last_clicod = AV44CliCod ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         GxHdr4 = false ;
         hAEQ0( false, 22) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV111TotKilC, "ZZZZZZ9.99")), 823, Gx_line+0, 897, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV115TotMetC, "ZZZZZZ9.99")), 897, Gx_line+0, 971, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV119TotPieC), "ZZZZZ9")), 978, Gx_line+3, 1023, Gx_line+20, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Cliente", ""), 605, Gx_line+3, 701, Gx_line+20, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV130totkilocrudoc, "ZZZZZZ9.99")), 749, Gx_line+0, 823, Gx_line+17, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+22) ;
         hAEQ0( false, 34) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV110TotKil, "ZZZZZZ9.99")), 823, Gx_line+8, 897, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV114TotMet, "ZZZZZZ9.99")), 897, Gx_line+8, 971, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV118TotPie), "ZZZZZ9")), 978, Gx_line+8, 1023, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Informe", ""), 609, Gx_line+8, 705, Gx_line+25, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV129totkilocrudo, "ZZZZZZ9.99")), 749, Gx_line+8, 823, Gx_line+25, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+34) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAEQ0( true, 0) ;
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
      /* Using cursor P0AEQ7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV44CliCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A252CliCod = P0AEQ7_A252CliCod[0] ;
         A279CliNom = P0AEQ7_A279CliNom[0] ;
         AV49CliNom = A279CliNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void hAEQ0( boolean bFoot ,
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
            if ( GxHdr4 )
            {
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92NomEmp, "")), 14, Gx_line+14, 234, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108TipDisDsc, "")), 271, Gx_line+54, 491, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 1000, Gx_line+17, 1059, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1041, Gx_line+50, 1086, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1108, Gx_line+17, 1167, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit1, "")), 946, Gx_line+17, 983, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit2, "")), 1074, Gx_line+17, 1104, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Lit3, "")), 986, Gx_line+50, 1031, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109TipProd, "")), 515, Gx_line+54, 662, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV139Pgmname, "")), 683, Gx_line+50, 903, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+83, 1175, Gx_line+83, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV140Pgmdesc, "")), 14, Gx_line+54, 234, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 1092, Gx_line+50, 1159, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 1084, Gx_line+50, 1092, Gx_line+67, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+95) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Doc.", ""), 10, Gx_line+20, 62, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 92, Gx_line+20, 129, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ped.Cl.", ""), 158, Gx_line+20, 210, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 235, Gx_line+3, 272, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ped.Cl.", ""), 228, Gx_line+20, 280, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº HDR", ""), 295, Gx_line+20, 340, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 379, Gx_line+20, 438, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 505, Gx_line+20, 601, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 608, Gx_line+20, 645, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 711, Gx_line+20, 756, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 774, Gx_line+3, 811, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Crudo", ""), 774, Gx_line+20, 811, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 845, Gx_line+3, 882, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 916, Gx_line+3, 961, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 978, Gx_line+3, 1023, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ent.", ""), 849, Gx_line+20, 879, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ent", ""), 926, Gx_line+20, 949, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ent", ""), 989, Gx_line+20, 1012, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+35, 83, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(92, Gx_line+35, 150, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(158, Gx_line+35, 216, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(225, Gx_line+35, 283, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(292, Gx_line+35, 372, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(380, Gx_line+35, 497, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(505, Gx_line+35, 600, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(608, Gx_line+35, 703, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(711, Gx_line+35, 755, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(764, Gx_line+35, 822, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(838, Gx_line+35, 904, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(830, Gx_line+35, 896, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(904, Gx_line+35, 970, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(978, Gx_line+35, 1022, Gx_line+35, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+41) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV58ImpCod = "" ;
      AV98Prio = "" ;
      AV96PFecha = GXutil.nullDate() ;
      AV127UFecha = GXutil.nullDate() ;
      AV93PBarSer = "" ;
      AV124UBarSer = "" ;
      AV95PDisNum = "" ;
      AV126UDisNum = "" ;
      AV19Barcodparf = "" ;
      AV24Barcolnomi = "" ;
      AV23Barcolnomf = "" ;
      AV35BarMaqEst1 = "" ;
      AV36BarMaqEst2 = "" ;
      AV100Serie = "" ;
      AV33Barlar = "" ;
      AV107Tipdiscod = "" ;
      AV12BarAcaQuifrom = "" ;
      AV13BarAcaQuito = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P0AEQ2_A396EmprCod = new String[] {""} ;
      P0AEQ2_A407EmprNom = new String[] {""} ;
      P0AEQ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV92NomEmp = "" ;
      AV108TipDisDsc = "" ;
      P0AEQ3_A396EmprCod = new String[] {""} ;
      P0AEQ3_A5098TipDisCod = new String[] {""} ;
      P0AEQ3_A5097TipDisDsc = new String[] {""} ;
      P0AEQ3_n5097TipDisDsc = new boolean[] {false} ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      AV109TipProd = "" ;
      P0AEQ4_A396EmprCod = new String[] {""} ;
      P0AEQ4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AEQ4_A30AlbProCod = new long[1] ;
      P0AEQ4_A5140AlbMarca = new String[] {""} ;
      P0AEQ4_A39AlbProPri = new String[] {""} ;
      P0AEQ4_A1243GuiRemCli = new int[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      A5140AlbMarca = "" ;
      A39AlbProPri = "" ;
      AV111TotKilC = DecimalUtil.ZERO ;
      AV115TotMetC = DecimalUtil.ZERO ;
      AV130totkilocrudoc = DecimalUtil.ZERO ;
      AV49CliNom = "" ;
      P0AEQ6_A396EmprCod = new String[] {""} ;
      P0AEQ6_A30AlbProCod = new long[1] ;
      P0AEQ6_A2010BarTipDis = new String[] {""} ;
      P0AEQ6_A148BarEstReo = new byte[1] ;
      P0AEQ6_A136BarColNum = new int[1] ;
      P0AEQ6_A135BarColNom = new String[] {""} ;
      P0AEQ6_A143BarDisNum = new String[] {""} ;
      P0AEQ6_A212BarSer = new String[] {""} ;
      P0AEQ6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AEQ6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AEQ6_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AEQ6_n2243BarKgsCli = new boolean[] {false} ;
      P0AEQ6_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AEQ6_A1234BarNomCli = new String[] {""} ;
      P0AEQ6_A4812BarEncCli = new String[] {""} ;
      P0AEQ6_A1265BarAlbPie = new int[1] ;
      P0AEQ6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0AEQ6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AEQ6_n166BarKgm = new boolean[] {false} ;
      P0AEQ6_A130BarCodPar = new String[] {""} ;
      P0AEQ6_A132BarCodReo = new byte[1] ;
      P0AEQ6_A129BarCod = new int[1] ;
      A2010BarTipDis = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A4812BarEncCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV14BarAlbKgmE = DecimalUtil.ZERO ;
      AV15BarAlbMtrE = DecimalUtil.ZERO ;
      AV22BarColNom = "" ;
      AV37barNomcli = "" ;
      AV32BarKgm = DecimalUtil.ZERO ;
      AV18Barcodpar = "" ;
      AV28Barenccli = "" ;
      AV110TotKil = DecimalUtil.ZERO ;
      AV114TotMet = DecimalUtil.ZERO ;
      AV129totkilocrudo = DecimalUtil.ZERO ;
      P0AEQ7_A396EmprCod = new String[] {""} ;
      P0AEQ7_A252CliCod = new int[1] ;
      P0AEQ7_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV62Lit1 = "" ;
      AV73Lit2 = "" ;
      AV78Lit3 = "" ;
      AV139Pgmname = "" ;
      AV140Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.palb003__default(),
         new Object[] {
             new Object[] {
            P0AEQ2_A396EmprCod, P0AEQ2_A407EmprNom, P0AEQ2_n407EmprNom
            }
            , new Object[] {
            P0AEQ3_A396EmprCod, P0AEQ3_A5098TipDisCod, P0AEQ3_A5097TipDisDsc, P0AEQ3_n5097TipDisDsc
            }
            , new Object[] {
            P0AEQ4_A396EmprCod, P0AEQ4_A34AlbProfch, P0AEQ4_A30AlbProCod, P0AEQ4_A5140AlbMarca, P0AEQ4_A39AlbProPri, P0AEQ4_A1243GuiRemCli
            }
            , new Object[] {
            P0AEQ6_A396EmprCod, P0AEQ6_A30AlbProCod, P0AEQ6_A2010BarTipDis, P0AEQ6_A148BarEstReo, P0AEQ6_A136BarColNum, P0AEQ6_A135BarColNom, P0AEQ6_A143BarDisNum, P0AEQ6_A212BarSer, P0AEQ6_A1261BarAlbKgmE, P0AEQ6_A1263BarAlbMtrE,
            P0AEQ6_A2243BarKgsCli, P0AEQ6_n2243BarKgsCli, P0AEQ6_A1461BarAlbPN, P0AEQ6_A1234BarNomCli, P0AEQ6_A4812BarEncCli, P0AEQ6_A1265BarAlbPie, P0AEQ6_A155BarFecCli, P0AEQ6_A166BarKgm, P0AEQ6_n166BarKgm, P0AEQ6_A130BarCodPar,
            P0AEQ6_A132BarCodReo, P0AEQ6_A129BarCod
            }
            , new Object[] {
            P0AEQ7_A396EmprCod, P0AEQ7_A252CliCod, P0AEQ7_A279CliNom
            }
         }
      );
      AV140Pgmdesc = httpContext.getMessage( "Informe Albaranes Produccion", "") ;
      AV139Pgmname = "DocumentoTransporteProduccion.PAlb003" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV140Pgmdesc = httpContext.getMessage( "Informe Albaranes Produccion", "") ;
      AV139Pgmname = "DocumentoTransporteProduccion.PAlb003" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV57Fuente ;
   private byte AV21Barcodreof ;
   private byte AV29Barestreo ;
   private byte AV52DetalleRollos ;
   private byte AV88Moda21 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV31Barestreoi ;
   private byte AV30BarEstreof ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV20BarCodreo ;
   private short gxcookieaux ;
   private short AV42Bartipart ;
   private short AV43Bartipart_to ;
   private short Gx_err ;
   private int AV94PCliCod ;
   private int AV125UCliCod ;
   private int AV17Barcodi ;
   private int AV27Barcolnumi ;
   private int AV26Barcolnumf ;
   private int AV91Nfi ;
   private int AV90Nff ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV128last_clicod ;
   private int A1243GuiRemCli ;
   private int AV44CliCod ;
   private int AV119TotPieC ;
   private int Gx_OldLine ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int AV25BarColNum ;
   private int AV16Barcod ;
   private int AV118TotPie ;
   private int A252CliCod ;
   private long AV11AlbProCod1 ;
   private long AV10Albprocod_to ;
   private long A30AlbProCod ;
   private long AV9ALbProcod ;
   private java.math.BigDecimal AV111TotKilC ;
   private java.math.BigDecimal AV115TotMetC ;
   private java.math.BigDecimal AV130totkilocrudoc ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV14BarAlbKgmE ;
   private java.math.BigDecimal AV15BarAlbMtrE ;
   private java.math.BigDecimal AV32BarKgm ;
   private java.math.BigDecimal AV110TotKil ;
   private java.math.BigDecimal AV114TotMet ;
   private java.math.BigDecimal AV129totkilocrudo ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV58ImpCod ;
   private String AV98Prio ;
   private String AV93PBarSer ;
   private String AV124UBarSer ;
   private String AV95PDisNum ;
   private String AV126UDisNum ;
   private String AV19Barcodparf ;
   private String AV24Barcolnomi ;
   private String AV23Barcolnomf ;
   private String AV35BarMaqEst1 ;
   private String AV36BarMaqEst2 ;
   private String AV100Serie ;
   private String AV33Barlar ;
   private String AV107Tipdiscod ;
   private String AV12BarAcaQuifrom ;
   private String AV13BarAcaQuito ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV92NomEmp ;
   private String AV108TipDisDsc ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private String AV109TipProd ;
   private String A5140AlbMarca ;
   private String A39AlbProPri ;
   private String AV49CliNom ;
   private String A2010BarTipDis ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A1234BarNomCli ;
   private String A4812BarEncCli ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV22BarColNom ;
   private String AV37barNomcli ;
   private String AV18Barcodpar ;
   private String AV28Barenccli ;
   private String A279CliNom ;
   private String Gx_time ;
   private String AV62Lit1 ;
   private String AV73Lit2 ;
   private String AV78Lit3 ;
   private String AV139Pgmname ;
   private String AV140Pgmdesc ;
   private java.util.Date AV96PFecha ;
   private java.util.Date AV127UFecha ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n5097TipDisDsc ;
   private boolean GxHdr4 ;
   private boolean returnInSub ;
   private boolean n2243BarKgsCli ;
   private boolean n166BarKgm ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEQ2_A396EmprCod ;
   private String[] P0AEQ2_A407EmprNom ;
   private boolean[] P0AEQ2_n407EmprNom ;
   private String[] P0AEQ3_A396EmprCod ;
   private String[] P0AEQ3_A5098TipDisCod ;
   private String[] P0AEQ3_A5097TipDisDsc ;
   private boolean[] P0AEQ3_n5097TipDisDsc ;
   private String[] P0AEQ4_A396EmprCod ;
   private java.util.Date[] P0AEQ4_A34AlbProfch ;
   private long[] P0AEQ4_A30AlbProCod ;
   private String[] P0AEQ4_A5140AlbMarca ;
   private String[] P0AEQ4_A39AlbProPri ;
   private int[] P0AEQ4_A1243GuiRemCli ;
   private String[] P0AEQ6_A396EmprCod ;
   private long[] P0AEQ6_A30AlbProCod ;
   private String[] P0AEQ6_A2010BarTipDis ;
   private byte[] P0AEQ6_A148BarEstReo ;
   private int[] P0AEQ6_A136BarColNum ;
   private String[] P0AEQ6_A135BarColNom ;
   private String[] P0AEQ6_A143BarDisNum ;
   private String[] P0AEQ6_A212BarSer ;
   private java.math.BigDecimal[] P0AEQ6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AEQ6_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0AEQ6_A2243BarKgsCli ;
   private boolean[] P0AEQ6_n2243BarKgsCli ;
   private java.math.BigDecimal[] P0AEQ6_A1461BarAlbPN ;
   private String[] P0AEQ6_A1234BarNomCli ;
   private String[] P0AEQ6_A4812BarEncCli ;
   private int[] P0AEQ6_A1265BarAlbPie ;
   private java.util.Date[] P0AEQ6_A155BarFecCli ;
   private java.math.BigDecimal[] P0AEQ6_A166BarKgm ;
   private boolean[] P0AEQ6_n166BarKgm ;
   private String[] P0AEQ6_A130BarCodPar ;
   private byte[] P0AEQ6_A132BarCodReo ;
   private int[] P0AEQ6_A129BarCod ;
   private String[] P0AEQ7_A396EmprCod ;
   private int[] P0AEQ7_A252CliCod ;
   private String[] P0AEQ7_A279CliNom ;
}

final  class palb003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEQ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AEQ3", "SELECT EmprCod, TipDisCod, TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? and TipDisCod = ? ORDER BY EmprCod, TipDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AEQ4", "SELECT EmprCod, AlbProfch, AlbProCod, AlbMarca, AlbProPri, GuiRemCli FROM TXPCALPRD WHERE (EmprCod = ? and GuiRemCli >= ? and AlbProCod >= ? and AlbProfch >= ?) AND (AlbProfch <= ?) AND (AlbProPri = ? or ? = '2') AND (AlbProCod <= ?) AND (GuiRemCli <= ?) ORDER BY EmprCod, GuiRemCli, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AEQ6", "SELECT T1.EmprCod, T1.AlbProCod, T2.BarTipDis, T2.BarEstReo, T2.BarColNum, T2.BarColNom, T2.BarDisNum, T2.BarSer, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarKgsCli, T1.BarAlbPN, T2.BarNomCli, T2.BarEncCli, T1.BarAlbPie, T2.BarFecCli, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T2.BarSer >= ? and T2.BarSer <= ?) AND (T2.BarDisNum >= ? and T2.BarDisNum <= ?) AND (T2.BarColNom >= ? and T2.BarColNom <= ?) AND (T2.BarColNum >= ? and T2.BarColNum <= ?) AND (T1.BarCod = ? or (? = 0)) AND (T1.BarCodReo = ? or (? = 0)) AND (T1.BarCodPar = ? or (rtrim(?) IS NULL)) AND (T2.BarEstReo >= ?) AND (T2.BarEstReo <= ?) AND (T2.BarTipDis = ? or ? = '*') ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AEQ7", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 1);
               stmt.setString(20, (String)parms[19], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

