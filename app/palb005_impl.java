package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class palb005_impl extends GXWebReport
{
   public palb005_impl( com.genexus.internet.HttpContext context )
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         palb005_impl.this.GXt_int1 = GXv_int2[0] ;
         AV88Moda21 = GXt_int1 ;
         AV133UFecha2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127UFecha)) ? GXutil.today( ) : AV127UFecha) ;
         /* Using cursor P0AGY2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0AGY2_A407EmprNom[0] ;
            n407EmprNom = P0AGY2_n407EmprNom[0] ;
            AV92NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV128last_clicod = 0 ;
         GxHdr3 = true ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV94PCliCod) ,
                                              Integer.valueOf(AV125UCliCod) ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              A5140AlbMarca ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P0AGY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV94PCliCod), Integer.valueOf(AV125UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkAGY3 = false ;
            A1253EmprGuiRem = P0AGY3_A1253EmprGuiRem[0] ;
            A30AlbProCod = P0AGY3_A30AlbProCod[0] ;
            A5140AlbMarca = P0AGY3_A5140AlbMarca[0] ;
            A39AlbProPri = P0AGY3_A39AlbProPri[0] ;
            A34AlbProfch = P0AGY3_A34AlbProfch[0] ;
            A1243GuiRemCli = P0AGY3_A1243GuiRemCli[0] ;
            A1244GuiRemCln = P0AGY3_A1244GuiRemCln[0] ;
            A1244GuiRemCln = P0AGY3_A1244GuiRemCln[0] ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               AV111TotKilC = DecimalUtil.doubleToDec(0) ;
               AV115TotMetC = DecimalUtil.doubleToDec(0) ;
               AV119TotPieC = 0 ;
               AV44CliCod = A1243GuiRemCli ;
               AV49CliNom = A1244GuiRemCln ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AGY3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AGY3_A1243GuiRemCli[0] == A1243GuiRemCli ) )
               {
                  brkAGY3 = false ;
                  A30AlbProCod = P0AGY3_A30AlbProCod[0] ;
                  A5140AlbMarca = P0AGY3_A5140AlbMarca[0] ;
                  A39AlbProPri = P0AGY3_A39AlbProPri[0] ;
                  A34AlbProfch = P0AGY3_A34AlbProfch[0] ;
                  if ( (( GXutil.resetTime(A34AlbProfch).before( GXutil.resetTime( AV133UFecha2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV133UFecha2)) )) )
                  {
                     if ( (( GXutil.resetTime(A34AlbProfch).after( GXutil.resetTime( AV96PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV96PFecha)) )) )
                     {
                        if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
                        {
                           if ( ( GXutil.strcmp(A39AlbProPri, AV98Prio) == 0 ) || ( GXutil.strcmp(AV98Prio, "2") == 0 ) )
                           {
                              AV110TotKil = DecimalUtil.doubleToDec(0) ;
                              AV114TotMet = DecimalUtil.doubleToDec(0) ;
                              AV118TotPie = 0 ;
                              pr_default.dynParam(2, new Object[]{ new Object[]{
                                                                   AV93PBarSer ,
                                                                   AV124UBarSer ,
                                                                   AV95PDisNum ,
                                                                   AV126UDisNum ,
                                                                   A212BarSer ,
                                                                   A143BarDisNum ,
                                                                   A396EmprCod ,
                                                                   Long.valueOf(A30AlbProCod) } ,
                                                                   new int[]{
                                                                   TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG
                                                                   }
                              });
                              /* Using cursor P0AGY4 */
                              pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), AV93PBarSer, AV124UBarSer, AV95PDisNum, AV126UDisNum});
                              while ( (pr_default.getStatus(2) != 101) )
                              {
                                 A143BarDisNum = P0AGY4_A143BarDisNum[0] ;
                                 A212BarSer = P0AGY4_A212BarSer[0] ;
                                 A1261BarAlbKgmE = P0AGY4_A1261BarAlbKgmE[0] ;
                                 A1263BarAlbMtrE = P0AGY4_A1263BarAlbMtrE[0] ;
                                 A2243BarKgsCli = P0AGY4_A2243BarKgsCli[0] ;
                                 n2243BarKgsCli = P0AGY4_n2243BarKgsCli[0] ;
                                 A1461BarAlbPN = P0AGY4_A1461BarAlbPN[0] ;
                                 A135BarColNom = P0AGY4_A135BarColNom[0] ;
                                 A136BarColNum = P0AGY4_A136BarColNum[0] ;
                                 A1234BarNomCli = P0AGY4_A1234BarNomCli[0] ;
                                 A129BarCod = P0AGY4_A129BarCod[0] ;
                                 A132BarCodReo = P0AGY4_A132BarCodReo[0] ;
                                 A130BarCodPar = P0AGY4_A130BarCodPar[0] ;
                                 A4812BarEncCli = P0AGY4_A4812BarEncCli[0] ;
                                 A1265BarAlbPie = P0AGY4_A1265BarAlbPie[0] ;
                                 A143BarDisNum = P0AGY4_A143BarDisNum[0] ;
                                 A212BarSer = P0AGY4_A212BarSer[0] ;
                                 A135BarColNom = P0AGY4_A135BarColNom[0] ;
                                 A136BarColNum = P0AGY4_A136BarColNum[0] ;
                                 A1234BarNomCli = P0AGY4_A1234BarNomCli[0] ;
                                 A4812BarEncCli = P0AGY4_A4812BarEncCli[0] ;
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
                                 AV16Barcod = A129BarCod ;
                                 AV20BarCodreo = A132BarCodReo ;
                                 AV18Barcodpar = A130BarCodPar ;
                                 /* Execute user subroutine: 'KILOS' */
                                 S111 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(2);
                                    pr_default.close(2);
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
                                 AV32BarKgm = AV129barpiekil ;
                                 AV16Barcod = A129BarCod ;
                                 AV20BarCodreo = A132BarCodReo ;
                                 AV18Barcodpar = A130BarCodPar ;
                                 AV9ALbProcod = A30AlbProCod ;
                                 AV28Barenccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                                 AV110TotKil = AV110TotKil.add(AV14BarAlbKgmE) ;
                                 AV114TotMet = AV114TotMet.add(AV15BarAlbMtrE) ;
                                 AV118TotPie = (int)(AV118TotPie+A1265BarAlbPie) ;
                                 pr_default.readNext(2);
                              }
                              pr_default.close(2);
                              AV111TotKilC = AV111TotKilC.add(AV110TotKil) ;
                              AV115TotMetC = AV115TotMetC.add(AV114TotMet) ;
                              AV119TotPieC = (int)(AV119TotPieC+AV118TotPie) ;
                              AV130TotKilG = AV130TotKilG.add(AV110TotKil) ;
                              AV131TotMetG = AV131TotMetG.add(AV114TotMet) ;
                              AV132TotPieG = (int)(AV132TotPieG+AV118TotPie) ;
                           }
                        }
                     }
                  }
                  brkAGY3 = true ;
                  pr_default.readNext(1);
               }
               if ( ( AV111TotKilC.doubleValue() == 0 ) && ( AV115TotMetC.doubleValue() == 0 ) && ( AV119TotPieC == 0 ) )
               {
               }
               else
               {
                  hAGY0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44CliCod), "ZZZZZ9")), 36, Gx_line+0, 81, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49CliNom, "")), 88, Gx_line+0, 308, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV111TotKilC, "ZZZZZZ9.99")), 496, Gx_line+0, 570, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV115TotMetC, "ZZZZZZ9.99")), 570, Gx_line+0, 644, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV119TotPieC), "ZZZZZ9")), 651, Gx_line+0, 696, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
            }
            if ( ! brkAGY3 )
            {
               brkAGY3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GxHdr3 = false ;
         hAGY0( false, 31) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV130TotKilG, "ZZZZZZ9.99")), 496, Gx_line+8, 570, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV131TotMetG, "ZZZZZZ9.99")), 570, Gx_line+8, 644, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV132TotPieG), "ZZZZZ9")), 651, Gx_line+8, 696, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Informe", ""), 363, Gx_line+8, 459, Gx_line+25, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+31) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAGY0( true, 0) ;
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
      /* 'KILOS' Routine */
      returnInSub = false ;
      AV129barpiekil = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P0AGY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV16Barcod), Byte.valueOf(AV20BarCodreo), AV18Barcodpar});
      c203BarPieKil = P0AGY5_A203BarPieKil[0] ;
      pr_default.close(3);
      AV129barpiekil = AV129barpiekil.add(c203BarPieKil) ;
      /* End optimized group. */
   }

   public void hAGY0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92NomEmp, "")), 14, Gx_line+14, 234, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 521, Gx_line+17, 580, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 681, Gx_line+54, 726, Gx_line+71, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 704, Gx_line+17, 763, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit1, "")), 467, Gx_line+17, 504, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit2, "")), 670, Gx_line+17, 700, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Lit3, "")), 627, Gx_line+54, 672, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV141Pgmname, "")), 267, Gx_line+50, 487, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+83, 803, Gx_line+83, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV142Pgmdesc, "")), 14, Gx_line+54, 234, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 732, Gx_line+54, 799, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 725, Gx_line+54, 733, Gx_line+71, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+95) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 518, Gx_line+3, 555, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 589, Gx_line+3, 634, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 651, Gx_line+3, 696, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ent.", ""), 522, Gx_line+20, 552, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ent", ""), 599, Gx_line+20, 622, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ent", ""), 661, Gx_line+20, 684, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(510, Gx_line+35, 576, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(503, Gx_line+35, 569, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(577, Gx_line+35, 643, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(651, Gx_line+35, 695, Gx_line+35, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 31, Gx_line+19, 83, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 88, Gx_line+19, 133, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(88, Gx_line+33, 307, Gx_line+33, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(31, Gx_line+33, 82, Gx_line+33, 1, 0, 0, 0, 0) ;
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
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV133UFecha2 = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0AGY2_A396EmprCod = new String[] {""} ;
      P0AGY2_A407EmprNom = new String[] {""} ;
      P0AGY2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV92NomEmp = "" ;
      A5140AlbMarca = "" ;
      P0AGY3_A1253EmprGuiRem = new String[] {""} ;
      P0AGY3_A396EmprCod = new String[] {""} ;
      P0AGY3_A30AlbProCod = new long[1] ;
      P0AGY3_A5140AlbMarca = new String[] {""} ;
      P0AGY3_A39AlbProPri = new String[] {""} ;
      P0AGY3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGY3_A1243GuiRemCli = new int[1] ;
      P0AGY3_A1244GuiRemCln = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      AV111TotKilC = DecimalUtil.ZERO ;
      AV115TotMetC = DecimalUtil.ZERO ;
      AV49CliNom = "" ;
      AV110TotKil = DecimalUtil.ZERO ;
      AV114TotMet = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A143BarDisNum = "" ;
      P0AGY4_A396EmprCod = new String[] {""} ;
      P0AGY4_A30AlbProCod = new long[1] ;
      P0AGY4_A143BarDisNum = new String[] {""} ;
      P0AGY4_A212BarSer = new String[] {""} ;
      P0AGY4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGY4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGY4_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGY4_n2243BarKgsCli = new boolean[] {false} ;
      P0AGY4_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGY4_A135BarColNom = new String[] {""} ;
      P0AGY4_A136BarColNum = new int[1] ;
      P0AGY4_A1234BarNomCli = new String[] {""} ;
      P0AGY4_A129BarCod = new int[1] ;
      P0AGY4_A132BarCodReo = new byte[1] ;
      P0AGY4_A130BarCodPar = new String[] {""} ;
      P0AGY4_A4812BarEncCli = new String[] {""} ;
      P0AGY4_A1265BarAlbPie = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A130BarCodPar = "" ;
      A4812BarEncCli = "" ;
      AV14BarAlbKgmE = DecimalUtil.ZERO ;
      AV15BarAlbMtrE = DecimalUtil.ZERO ;
      AV22BarColNom = "" ;
      AV37barNomcli = "" ;
      AV18Barcodpar = "" ;
      AV32BarKgm = DecimalUtil.ZERO ;
      AV129barpiekil = DecimalUtil.ZERO ;
      AV28Barenccli = "" ;
      AV130TotKilG = DecimalUtil.ZERO ;
      AV131TotMetG = DecimalUtil.ZERO ;
      c203BarPieKil = DecimalUtil.ZERO ;
      P0AGY5_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV62Lit1 = "" ;
      AV73Lit2 = "" ;
      AV78Lit3 = "" ;
      AV141Pgmname = "" ;
      AV142Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palb005__default(),
         new Object[] {
             new Object[] {
            P0AGY2_A396EmprCod, P0AGY2_A407EmprNom, P0AGY2_n407EmprNom
            }
            , new Object[] {
            P0AGY3_A1253EmprGuiRem, P0AGY3_A396EmprCod, P0AGY3_A30AlbProCod, P0AGY3_A5140AlbMarca, P0AGY3_A39AlbProPri, P0AGY3_A34AlbProfch, P0AGY3_A1243GuiRemCli, P0AGY3_A1244GuiRemCln
            }
            , new Object[] {
            P0AGY4_A396EmprCod, P0AGY4_A30AlbProCod, P0AGY4_A143BarDisNum, P0AGY4_A212BarSer, P0AGY4_A1261BarAlbKgmE, P0AGY4_A1263BarAlbMtrE, P0AGY4_A2243BarKgsCli, P0AGY4_n2243BarKgsCli, P0AGY4_A1461BarAlbPN, P0AGY4_A135BarColNom,
            P0AGY4_A136BarColNum, P0AGY4_A1234BarNomCli, P0AGY4_A129BarCod, P0AGY4_A132BarCodReo, P0AGY4_A130BarCodPar, P0AGY4_A4812BarEncCli, P0AGY4_A1265BarAlbPie
            }
            , new Object[] {
            P0AGY5_A203BarPieKil
            }
         }
      );
      AV142Pgmdesc = httpContext.getMessage( "Resumen por Cliente", "") ;
      AV141Pgmname = "PAlb005" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV142Pgmdesc = httpContext.getMessage( "Resumen por Cliente", "") ;
      AV141Pgmname = "PAlb005" ;
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
   private int AV119TotPieC ;
   private int AV44CliCod ;
   private int AV118TotPie ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV25BarColNum ;
   private int AV16Barcod ;
   private int AV132TotPieG ;
   private int Gx_OldLine ;
   private long AV11AlbProCod1 ;
   private long AV10Albprocod_to ;
   private long A30AlbProCod ;
   private long AV9ALbProcod ;
   private java.math.BigDecimal AV111TotKilC ;
   private java.math.BigDecimal AV115TotMetC ;
   private java.math.BigDecimal AV110TotKil ;
   private java.math.BigDecimal AV114TotMet ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV14BarAlbKgmE ;
   private java.math.BigDecimal AV15BarAlbMtrE ;
   private java.math.BigDecimal AV32BarKgm ;
   private java.math.BigDecimal AV129barpiekil ;
   private java.math.BigDecimal AV130TotKilG ;
   private java.math.BigDecimal AV131TotMetG ;
   private java.math.BigDecimal c203BarPieKil ;
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
   private String A5140AlbMarca ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A1244GuiRemCln ;
   private String AV49CliNom ;
   private String A212BarSer ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String AV22BarColNom ;
   private String AV37barNomcli ;
   private String AV18Barcodpar ;
   private String AV28Barenccli ;
   private String Gx_time ;
   private String AV62Lit1 ;
   private String AV73Lit2 ;
   private String AV78Lit3 ;
   private String AV141Pgmname ;
   private String AV142Pgmdesc ;
   private java.util.Date AV96PFecha ;
   private java.util.Date AV127UFecha ;
   private java.util.Date AV133UFecha2 ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean brkAGY3 ;
   private boolean n2243BarKgsCli ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGY2_A396EmprCod ;
   private String[] P0AGY2_A407EmprNom ;
   private boolean[] P0AGY2_n407EmprNom ;
   private String[] P0AGY3_A1253EmprGuiRem ;
   private String[] P0AGY3_A396EmprCod ;
   private long[] P0AGY3_A30AlbProCod ;
   private String[] P0AGY3_A5140AlbMarca ;
   private String[] P0AGY3_A39AlbProPri ;
   private java.util.Date[] P0AGY3_A34AlbProfch ;
   private int[] P0AGY3_A1243GuiRemCli ;
   private String[] P0AGY3_A1244GuiRemCln ;
   private String[] P0AGY4_A396EmprCod ;
   private long[] P0AGY4_A30AlbProCod ;
   private String[] P0AGY4_A143BarDisNum ;
   private String[] P0AGY4_A212BarSer ;
   private java.math.BigDecimal[] P0AGY4_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AGY4_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0AGY4_A2243BarKgsCli ;
   private boolean[] P0AGY4_n2243BarKgsCli ;
   private java.math.BigDecimal[] P0AGY4_A1461BarAlbPN ;
   private String[] P0AGY4_A135BarColNom ;
   private int[] P0AGY4_A136BarColNum ;
   private String[] P0AGY4_A1234BarNomCli ;
   private int[] P0AGY4_A129BarCod ;
   private byte[] P0AGY4_A132BarCodReo ;
   private String[] P0AGY4_A130BarCodPar ;
   private String[] P0AGY4_A4812BarEncCli ;
   private int[] P0AGY4_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0AGY5_A203BarPieKil ;
}

final  class palb005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AGY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV94PCliCod ,
                                          int AV125UCliCod ,
                                          int A1243GuiRemCli ,
                                          String A5140AlbMarca ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[3];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.AlbMarca, T1.AlbProPri, T1.AlbProfch, T1.GuiRemCli AS GuiRemCli, T2.CliNom AS GuiRemCln FROM (TXPCALPRD" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV94PCliCod) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV125UCliCod) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.GuiRemCli" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P0AGY4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV93PBarSer ,
                                          String AV124UBarSer ,
                                          String AV95PDisNum ,
                                          String AV126UDisNum ,
                                          String A212BarSer ,
                                          String A143BarDisNum ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[6];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T2.BarDisNum, T2.BarSer, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarKgsCli, T1.BarAlbPN, T2.BarColNom, T2.BarColNum, T2.BarNomCli, T1.BarCod," ;
      scmdbuf += " T1.BarCodReo, T1.BarCodPar, T2.BarEncCli, T1.BarAlbPie FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( ! (GXutil.strcmp("", AV93PBarSer)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124UBarSer)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95PDisNum)==0) )
      {
         addWhere(sWhereString, "(T2.BarDisNum >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126UDisNum)==0) )
      {
         addWhere(sWhereString, "(T2.BarDisNum <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P0AGY3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 2 :
                  return conditional_P0AGY4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGY2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGY4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGY5", "SELECT SUM(BarPieKil) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 20);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

