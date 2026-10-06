package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmod001_impl extends GXWebReport
{
   public rmod001_impl( com.genexus.internet.HttpContext context )
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
            A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV16TotPed = CommonUtil.decimalVal( httpContext.GetPar( "TotPed"), ".") ;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 12082, 0, 1, 1, 0, 1, 1) )
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
         GXv_char1[0] = AV47ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD001", ""), GXv_char1) ;
         rmod001_impl.this.AV47ContDsc = GXv_char1[0] ;
         AV39Flag = (byte)(0) ;
         GXv_int2[0] = AV39Flag ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100010", GXv_int2) ;
         rmod001_impl.this.AV39Flag = GXv_int2[0] ;
         /* Using cursor P06NL2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06NL2_A407EmprNom[0] ;
            n407EmprNom = P06NL2_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV44NumLineas = (short)(1) ;
         GxHdr3 = true ;
         /* Using cursor P06NL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A798PrvPlaEnt = P06NL3_A798PrvPlaEnt[0] ;
            n798PrvPlaEnt = P06NL3_n798PrvPlaEnt[0] ;
            A797PrvPer = P06NL3_A797PrvPer[0] ;
            n797PrvPer = P06NL3_n797PrvPer[0] ;
            A662PedFecEnt = P06NL3_A662PedFecEnt[0] ;
            A801PrvRep = P06NL3_A801PrvRep[0] ;
            n801PrvRep = P06NL3_n801PrvRep[0] ;
            A804PrvTlx = P06NL3_A804PrvTlx[0] ;
            n804PrvTlx = P06NL3_n804PrvTlx[0] ;
            A795PrvNum = P06NL3_A795PrvNum[0] ;
            A799PrvPob = P06NL3_A799PrvPob[0] ;
            n799PrvPob = P06NL3_n799PrvPob[0] ;
            A782PrvCpo = P06NL3_A782PrvCpo[0] ;
            n782PrvCpo = P06NL3_n782PrvCpo[0] ;
            A786PrvDir = P06NL3_A786PrvDir[0] ;
            n786PrvDir = P06NL3_n786PrvDir[0] ;
            A794PrvNom = P06NL3_A794PrvNom[0] ;
            n794PrvNom = P06NL3_n794PrvNom[0] ;
            A661PedFec = P06NL3_A661PedFec[0] ;
            A798PrvPlaEnt = P06NL3_A798PrvPlaEnt[0] ;
            n798PrvPlaEnt = P06NL3_n798PrvPlaEnt[0] ;
            A797PrvPer = P06NL3_A797PrvPer[0] ;
            n797PrvPer = P06NL3_n797PrvPer[0] ;
            A801PrvRep = P06NL3_A801PrvRep[0] ;
            n801PrvRep = P06NL3_n801PrvRep[0] ;
            A804PrvTlx = P06NL3_A804PrvTlx[0] ;
            n804PrvTlx = P06NL3_n804PrvTlx[0] ;
            A799PrvPob = P06NL3_A799PrvPob[0] ;
            n799PrvPob = P06NL3_n799PrvPob[0] ;
            A782PrvCpo = P06NL3_A782PrvCpo[0] ;
            n782PrvCpo = P06NL3_n782PrvCpo[0] ;
            A786PrvDir = P06NL3_A786PrvDir[0] ;
            n786PrvDir = P06NL3_n786PrvDir[0] ;
            A794PrvNom = P06NL3_A794PrvNom[0] ;
            n794PrvNom = P06NL3_n794PrvNom[0] ;
            AV41PrvPlaEnt = A798PrvPlaEnt ;
            AV42PrvPer = A797PrvPer ;
            AV49PedFecEnt = A662PedFecEnt ;
            AV60Total_l = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P06NL4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A665PedPre = P06NL4_A665PedPre[0] ;
               A728PrdRefPrv = P06NL4_A728PrdRefPrv[0] ;
               A670PedVal = P06NL4_A670PedVal[0] ;
               A669PedUni = P06NL4_A669PedUni[0] ;
               A719PrdNum = P06NL4_A719PrdNum[0] ;
               A728PrdRefPrv = P06NL4_A728PrdRefPrv[0] ;
               if ( AV44NumLineas > 20 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV44NumLineas = (short)(1) ;
               }
               AV55PedPre = A665PedPre ;
               AV58PrdRefprv = A728PrdRefPrv ;
               AV59Valor_l = A670PedVal ;
               h6NL0( false, 19) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 69, Gx_line+0, 126, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58PrdRefprv, "")), 139, Gx_line+0, 421, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A669PedUni, "ZZZZZ9.99")), 427, Gx_line+0, 512, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55PedPre, "ZZZZZZZ9.999")), 518, Gx_line+0, 650, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59Valor_l, "Z,ZZZ,ZZ9.99")), 668, Gx_line+0, 782, Gx_line+19, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               AV44NumLineas = (short)(AV44NumLineas+1) ;
               AV60Total_l = AV60Total_l.add(A670PedVal) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6NL0( false, 24) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60Total_l, "Z,ZZZ,ZZ9.99")), 668, Gx_line+5, 782, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 607, Gx_line+6, 644, Gx_line+23, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+24) ;
            AV44NumLineas = (short)(AV44NumLineas+1) ;
            while ( AV44NumLineas < 20 )
            {
               h6NL0( false, 18) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV44NumLineas = (short)(AV44NumLineas+1) ;
            }
            h6NL0( false, 168) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Antecipadamente gratos pela rapidez e empenho que possam dedicar", ""), 118, Gx_line+98, 719, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "na execução deste nosso pedido,", ""), 36, Gx_line+115, 328, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Atentamente", ""), 441, Gx_line+127, 545, Gx_line+145, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MODA 21, Tinturaria e Acabamentos Têxteis, SA", ""), 309, Gx_line+148, 685, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Todos os artigos incluídos nesta encomenda devem cumprir com a última versão do CTW e da MRSL; ", ""), 36, Gx_line+4, 730, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "devem ser entregues na sua embalagem original, com o rótulo original, incluindo no mínimo", ""), 36, Gx_line+20, 730, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "o nome do produto, o nome do fabricante distribuidor; o número de lote do produto químico e ", ""), 36, Gx_line+38, 708, Gx_line+54, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "o prazo de validade; devem ainda ser acompanhados do certificado de análise de arilaminas, ", ""), 36, Gx_line+54, 708, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "formaldeído, APEO’S ou PFC’s quando devido.", ""), 36, Gx_line+70, 708, Gx_line+86, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+168) ;
            AV43FlagObs = (byte)(0) ;
            AV57ContObs = (byte)(1) ;
            /* Using cursor P06NL5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A2502PedObsTxt = P06NL5_A2502PedObsTxt[0] ;
               A2501PedObsLin = P06NL5_A2501PedObsLin[0] ;
               if ( AV57ContObs > 3 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               if ( AV43FlagObs == 0 )
               {
                  h6NL0( false, 32) ;
                  getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observações:", ""), 48, Gx_line+9, 162, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2502PedObsTxt, "")), 177, Gx_line+10, 741, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(38, Gx_line+5, 780, Gx_line+5, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(38, Gx_line+5, 38, Gx_line+32, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+5, 778, Gx_line+32, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+32) ;
                  AV43FlagObs = (byte)(1) ;
               }
               else
               {
                  h6NL0( false, 23) ;
                  getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2502PedObsTxt, "")), 144, Gx_line+0, 708, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(38, Gx_line+0, 38, Gx_line+23, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+23, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+23) ;
               }
               AV57ContObs = (byte)(AV57ContObs+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV43FlagObs == 1 )
            {
               h6NL0( false, 5) ;
               getPrinter().GxDrawLine(38, Gx_line+1, 780, Gx_line+1, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+5) ;
            }
            h6NL0( false, 50) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data de Entrega...........:", ""), 48, Gx_line+16, 302, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(38, Gx_line+4, 780, Gx_line+4, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV49PedFecEnt, "99/99/99"), 310, Gx_line+16, 394, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(38, Gx_line+4, 38, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(778, Gx_line+4, 778, Gx_line+50, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
            h6NL0( false, 28) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transporte................: V/ camiao", ""), 48, Gx_line+0, 396, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(38, Gx_line+24, 780, Gx_line+24, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(38, Gx_line+0, 38, Gx_line+25, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+25, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+28) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6NL0( true, 0) ;
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

   public void h6NL0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processado por Computador", ""), 40, Gx_line+0, 179, Gx_line+13, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MODA 21, Tinturaria e Acabamentos Têxteis, SA - Ruães - Mire de Tibães - 4700-565 Braga   Telef: 253 300390   Fax: 253 300399 E-mail: moda21@moda21.pt", ""), 43, Gx_line+14, 774, Gx_line+30, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Capital Social 3.250.000 € - Contribuinte nº 504 304 640-Matriculada na Conservatória do Registo Comercial de Braga sob o nº 7402", ""), 98, Gx_line+31, 720, Gx_line+47, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(38, Gx_line+11, 780, Gx_line+11, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47ContDsc, "")), 686, Gx_line+0, 770, Gx_line+13, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+47) ;
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
               getPrinter().GxDrawRect(38, Gx_line+171, 417, Gx_line+249, 1, 182, 182, 182, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(506, Gx_line+150, 787, Gx_line+263, 1, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag", ""), 685, Gx_line+351, 713, Gx_line+369, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 525, Gx_line+157, 559, Gx_line+174, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 722, Gx_line+351, 778, Gx_line+369, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem de Compra", ""), 525, Gx_line+178, 651, Gx_line+195, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A661PedFec, "99/99/99"), 708, Gx_line+157, 776, Gx_line+175, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 46, Gx_line+182, 328, Gx_line+201, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 692, Gx_line+177, 776, Gx_line+197, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A786PrvDir, "")), 46, Gx_line+199, 328, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fornecedor", ""), 525, Gx_line+197, 609, Gx_line+214, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A782PrvCpo, "")), 46, Gx_line+216, 103, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A799PrvPob, "")), 96, Gx_line+216, 378, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 525, Gx_line+216, 551, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 725, Gx_line+197, 776, Gx_line+215, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atn", ""), 525, Gx_line+236, 551, Gx_line+253, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmos. Senhores,", ""), 119, Gx_line+284, 270, Gx_line+302, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A804PrvTlx, "")), 667, Gx_line+216, 785, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A801PrvRep, "")), 617, Gx_line+236, 785, Gx_line+254, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Vimos por este meio encomendar a V. Exas. os seguintes produtos", ""), 119, Gx_line+318, 711, Gx_line+336, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de acordo com as condições que indicamos:", ""), 38, Gx_line+334, 423, Gx_line+352, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PRODUTO", ""), 64, Gx_line+389, 131, Gx_line+407, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REFERÊNCIA", ""), 157, Gx_line+389, 252, Gx_line+407, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "QTD(Kgs)", ""), 436, Gx_line+389, 512, Gx_line+407, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PREÇO(€)", ""), 574, Gx_line+389, 650, Gx_line+407, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(38, Gx_line+379, 780, Gx_line+415, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "VALOR", ""), 715, Gx_line+389, 763, Gx_line+407, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 38, Gx_line+11, 795, Gx_line+97) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+423) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV15ImpCod = "" ;
      AV16TotPed = DecimalUtil.ZERO ;
      AV47ContDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P06NL2_A396EmprCod = new String[] {""} ;
      P06NL2_A407EmprNom = new String[] {""} ;
      P06NL2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      P06NL3_A396EmprCod = new String[] {""} ;
      P06NL3_A658PedCod = new int[1] ;
      P06NL3_A798PrvPlaEnt = new short[1] ;
      P06NL3_n798PrvPlaEnt = new boolean[] {false} ;
      P06NL3_A797PrvPer = new int[1] ;
      P06NL3_n797PrvPer = new boolean[] {false} ;
      P06NL3_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P06NL3_A801PrvRep = new String[] {""} ;
      P06NL3_n801PrvRep = new boolean[] {false} ;
      P06NL3_A804PrvTlx = new String[] {""} ;
      P06NL3_n804PrvTlx = new boolean[] {false} ;
      P06NL3_A795PrvNum = new int[1] ;
      P06NL3_A799PrvPob = new String[] {""} ;
      P06NL3_n799PrvPob = new boolean[] {false} ;
      P06NL3_A782PrvCpo = new String[] {""} ;
      P06NL3_n782PrvCpo = new boolean[] {false} ;
      P06NL3_A786PrvDir = new String[] {""} ;
      P06NL3_n786PrvDir = new boolean[] {false} ;
      P06NL3_A794PrvNom = new String[] {""} ;
      P06NL3_n794PrvNom = new boolean[] {false} ;
      P06NL3_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      A662PedFecEnt = GXutil.nullDate() ;
      A801PrvRep = "" ;
      A804PrvTlx = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A786PrvDir = "" ;
      A794PrvNom = "" ;
      A661PedFec = GXutil.nullDate() ;
      AV49PedFecEnt = GXutil.nullDate() ;
      AV60Total_l = DecimalUtil.ZERO ;
      P06NL4_A396EmprCod = new String[] {""} ;
      P06NL4_A658PedCod = new int[1] ;
      P06NL4_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NL4_A728PrdRefPrv = new String[] {""} ;
      P06NL4_A670PedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NL4_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NL4_A719PrdNum = new String[] {""} ;
      A665PedPre = DecimalUtil.ZERO ;
      A728PrdRefPrv = "" ;
      A670PedVal = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV55PedPre = DecimalUtil.ZERO ;
      AV58PrdRefprv = "" ;
      AV59Valor_l = DecimalUtil.ZERO ;
      P06NL5_A396EmprCod = new String[] {""} ;
      P06NL5_A658PedCod = new int[1] ;
      P06NL5_A2502PedObsTxt = new String[] {""} ;
      P06NL5_A2501PedObsLin = new byte[1] ;
      A2502PedObsTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rmod001__default(),
         new Object[] {
             new Object[] {
            P06NL2_A396EmprCod, P06NL2_A407EmprNom, P06NL2_n407EmprNom
            }
            , new Object[] {
            P06NL3_A396EmprCod, P06NL3_A658PedCod, P06NL3_A798PrvPlaEnt, P06NL3_n798PrvPlaEnt, P06NL3_A797PrvPer, P06NL3_n797PrvPer, P06NL3_A662PedFecEnt, P06NL3_A801PrvRep, P06NL3_n801PrvRep, P06NL3_A804PrvTlx,
            P06NL3_n804PrvTlx, P06NL3_A795PrvNum, P06NL3_A799PrvPob, P06NL3_n799PrvPob, P06NL3_A782PrvCpo, P06NL3_n782PrvCpo, P06NL3_A786PrvDir, P06NL3_n786PrvDir, P06NL3_A794PrvNom, P06NL3_n794PrvNom,
            P06NL3_A661PedFec
            }
            , new Object[] {
            P06NL4_A396EmprCod, P06NL4_A658PedCod, P06NL4_A665PedPre, P06NL4_A728PrdRefPrv, P06NL4_A670PedVal, P06NL4_A669PedUni, P06NL4_A719PrdNum
            }
            , new Object[] {
            P06NL5_A396EmprCod, P06NL5_A658PedCod, P06NL5_A2502PedObsTxt, P06NL5_A2501PedObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV39Flag ;
   private byte GXv_int2[] ;
   private byte AV43FlagObs ;
   private byte AV57ContObs ;
   private byte A2501PedObsLin ;
   private short gxcookieaux ;
   private short AV44NumLineas ;
   private short A798PrvPlaEnt ;
   private short AV41PrvPlaEnt ;
   private short Gx_err ;
   private int A658PedCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A797PrvPer ;
   private int A795PrvNum ;
   private int AV42PrvPer ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV16TotPed ;
   private java.math.BigDecimal AV60Total_l ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A670PedVal ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal AV55PedPre ;
   private java.math.BigDecimal AV59Valor_l ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV47ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A801PrvRep ;
   private String A804PrvTlx ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A786PrvDir ;
   private String A794PrvNom ;
   private String A728PrdRefPrv ;
   private String A719PrdNum ;
   private String AV58PrdRefprv ;
   private String A2502PedObsTxt ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date A661PedFec ;
   private java.util.Date AV49PedFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n798PrvPlaEnt ;
   private boolean n797PrvPer ;
   private boolean n801PrvRep ;
   private boolean n804PrvTlx ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06NL2_A396EmprCod ;
   private String[] P06NL2_A407EmprNom ;
   private boolean[] P06NL2_n407EmprNom ;
   private String[] P06NL3_A396EmprCod ;
   private int[] P06NL3_A658PedCod ;
   private short[] P06NL3_A798PrvPlaEnt ;
   private boolean[] P06NL3_n798PrvPlaEnt ;
   private int[] P06NL3_A797PrvPer ;
   private boolean[] P06NL3_n797PrvPer ;
   private java.util.Date[] P06NL3_A662PedFecEnt ;
   private String[] P06NL3_A801PrvRep ;
   private boolean[] P06NL3_n801PrvRep ;
   private String[] P06NL3_A804PrvTlx ;
   private boolean[] P06NL3_n804PrvTlx ;
   private int[] P06NL3_A795PrvNum ;
   private String[] P06NL3_A799PrvPob ;
   private boolean[] P06NL3_n799PrvPob ;
   private String[] P06NL3_A782PrvCpo ;
   private boolean[] P06NL3_n782PrvCpo ;
   private String[] P06NL3_A786PrvDir ;
   private boolean[] P06NL3_n786PrvDir ;
   private String[] P06NL3_A794PrvNom ;
   private boolean[] P06NL3_n794PrvNom ;
   private java.util.Date[] P06NL3_A661PedFec ;
   private String[] P06NL4_A396EmprCod ;
   private int[] P06NL4_A658PedCod ;
   private java.math.BigDecimal[] P06NL4_A665PedPre ;
   private String[] P06NL4_A728PrdRefPrv ;
   private java.math.BigDecimal[] P06NL4_A670PedVal ;
   private java.math.BigDecimal[] P06NL4_A669PedUni ;
   private String[] P06NL4_A719PrdNum ;
   private String[] P06NL5_A396EmprCod ;
   private int[] P06NL5_A658PedCod ;
   private String[] P06NL5_A2502PedObsTxt ;
   private byte[] P06NL5_A2501PedObsLin ;
}

final  class rmod001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06NL2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06NL3", "SELECT T1.EmprCod, T1.PedCod, T2.PrvPlaEnt, T2.PrvPer, T1.PedFecEnt, T2.PrvRep, T2.PrvTlx, T1.PrvNum, T2.PrvPob, T2.PrvCpo, T2.PrvDir, T2.PrvNom, T1.PedFec FROM (TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06NL4", "SELECT T1.EmprCod, T1.PedCod, T1.PedPre, T2.PrdRefPrv, T1.PedVal, T1.PedUni, T1.PrdNum FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NL5", "SELECT EmprCod, PedCod, PedObsTxt, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PedObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 14);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

