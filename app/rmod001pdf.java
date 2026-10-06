package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rmod001pdf extends GXReport
{
   public rmod001pdf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rmod001pdf.class ), "" );
   }

   public rmod001pdf( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal aP3 ,
                             String aP4 )
   {
      rmod001pdf.this.A396EmprCod = aP0;
      rmod001pdf.this.A658PedCod = aP1;
      rmod001pdf.this.AV8ImpCod = aP2;
      rmod001pdf.this.AV9TotPed = aP3;
      rmod001pdf.this.AV61NombreArchivo = aP4;
      initialize();
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
      getPrinter().GxSetDocName("Orden de compra") ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
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
         GXv_char1[0] = AV40ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD001", ""), GXv_char1) ;
         rmod001pdf.this.AV40ContDsc = GXv_char1[0] ;
         /* Using cursor P09DG2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P09DG2_A407EmprNom[0] ;
            n407EmprNom = P09DG2_n407EmprNom[0] ;
            AV11NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV32Flag = (byte)(0) ;
         GXv_int2[0] = AV32Flag ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100010", GXv_int2) ;
         rmod001pdf.this.AV32Flag = GXv_int2[0] ;
         AV37NumLineas = (short)(1) ;
         GxHdr3 = true ;
         /* Using cursor P09DG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A798PrvPlaEnt = P09DG3_A798PrvPlaEnt[0] ;
            n798PrvPlaEnt = P09DG3_n798PrvPlaEnt[0] ;
            A797PrvPer = P09DG3_A797PrvPer[0] ;
            n797PrvPer = P09DG3_n797PrvPer[0] ;
            A662PedFecEnt = P09DG3_A662PedFecEnt[0] ;
            A801PrvRep = P09DG3_A801PrvRep[0] ;
            n801PrvRep = P09DG3_n801PrvRep[0] ;
            A804PrvTlx = P09DG3_A804PrvTlx[0] ;
            n804PrvTlx = P09DG3_n804PrvTlx[0] ;
            A795PrvNum = P09DG3_A795PrvNum[0] ;
            A799PrvPob = P09DG3_A799PrvPob[0] ;
            n799PrvPob = P09DG3_n799PrvPob[0] ;
            A782PrvCpo = P09DG3_A782PrvCpo[0] ;
            n782PrvCpo = P09DG3_n782PrvCpo[0] ;
            A786PrvDir = P09DG3_A786PrvDir[0] ;
            n786PrvDir = P09DG3_n786PrvDir[0] ;
            A794PrvNom = P09DG3_A794PrvNom[0] ;
            n794PrvNom = P09DG3_n794PrvNom[0] ;
            A661PedFec = P09DG3_A661PedFec[0] ;
            A798PrvPlaEnt = P09DG3_A798PrvPlaEnt[0] ;
            n798PrvPlaEnt = P09DG3_n798PrvPlaEnt[0] ;
            A797PrvPer = P09DG3_A797PrvPer[0] ;
            n797PrvPer = P09DG3_n797PrvPer[0] ;
            A801PrvRep = P09DG3_A801PrvRep[0] ;
            n801PrvRep = P09DG3_n801PrvRep[0] ;
            A804PrvTlx = P09DG3_A804PrvTlx[0] ;
            n804PrvTlx = P09DG3_n804PrvTlx[0] ;
            A799PrvPob = P09DG3_A799PrvPob[0] ;
            n799PrvPob = P09DG3_n799PrvPob[0] ;
            A782PrvCpo = P09DG3_A782PrvCpo[0] ;
            n782PrvCpo = P09DG3_n782PrvCpo[0] ;
            A786PrvDir = P09DG3_A786PrvDir[0] ;
            n786PrvDir = P09DG3_n786PrvDir[0] ;
            A794PrvNom = P09DG3_A794PrvNom[0] ;
            n794PrvNom = P09DG3_n794PrvNom[0] ;
            AV34PrvPlaEnt = A798PrvPlaEnt ;
            AV35PrvPer = A797PrvPer ;
            AV42PedFecEnt = A662PedFecEnt ;
            AV53Total_l = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P09DG4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A665PedPre = P09DG4_A665PedPre[0] ;
               A728PrdRefPrv = P09DG4_A728PrdRefPrv[0] ;
               A670PedVal = P09DG4_A670PedVal[0] ;
               A669PedUni = P09DG4_A669PedUni[0] ;
               A719PrdNum = P09DG4_A719PrdNum[0] ;
               A728PrdRefPrv = P09DG4_A728PrdRefPrv[0] ;
               if ( AV37NumLineas > 20 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV37NumLineas = (short)(1) ;
               }
               AV48PedPre = A665PedPre ;
               AV51PrdRefprv = A728PrdRefPrv ;
               AV52Valor_l = A670PedVal ;
               h9DG0( false, 18) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 55, Gx_line+0, 112, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51PrdRefprv, "")), 111, Gx_line+0, 393, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A669PedUni, "ZZZZZ9.99")), 342, Gx_line+0, 427, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48PedPre, "ZZZZZZZ9.999")), 414, Gx_line+0, 546, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52Valor_l, "Z,ZZZ,ZZ9.99")), 534, Gx_line+0, 648, Gx_line+19, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV37NumLineas = (short)(AV37NumLineas+1) ;
               AV53Total_l = AV53Total_l.add(A670PedVal) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h9DG0( false, 22) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Total_l, "Z,ZZZ,ZZ9.99")), 534, Gx_line+4, 648, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 486, Gx_line+5, 523, Gx_line+22, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+22) ;
            AV37NumLineas = (short)(AV37NumLineas+1) ;
            while ( AV37NumLineas < 20 )
            {
               h9DG0( false, 14) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+14) ;
               AV37NumLineas = (short)(AV37NumLineas+1) ;
            }
            h9DG0( false, 135) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Antecipadamente gratos pela rapidez e empenho que possam dedicar", ""), 94, Gx_line+78, 695, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "na execução deste nosso pedido,", ""), 29, Gx_line+92, 321, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Atentamente", ""), 353, Gx_line+102, 457, Gx_line+120, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MODA 21, Tinturaria e Acabamentos Têxteis, SA", ""), 248, Gx_line+118, 624, Gx_line+135, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Todos os artigos incluídos nesta encomenda devem cumprir com a última versão do CTW e da MRSL; ", ""), 29, Gx_line+3, 723, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "devem ser entregues na sua embalagem original, com o rótulo original, incluindo no mínimo", ""), 29, Gx_line+19, 723, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "o nome do produto, o nome do fabricante distribuidor; o número de lote do produto químico e ", ""), 29, Gx_line+30, 701, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "o prazo de validade; devem ainda ser acompanhados do certificado de análise de arilaminas, ", ""), 29, Gx_line+46, 701, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "formaldeído, APEO’S ou PFC’s quando devido.", ""), 29, Gx_line+62, 701, Gx_line+78, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+135) ;
            AV36FlagObs = (byte)(0) ;
            AV50ContObs = (byte)(1) ;
            /* Using cursor P09DG5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A2502PedObsTxt = P09DG5_A2502PedObsTxt[0] ;
               A2501PedObsLin = P09DG5_A2501PedObsLin[0] ;
               if ( AV50ContObs > 3 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               if ( AV36FlagObs == 0 )
               {
                  h9DG0( false, 26) ;
                  getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observações:", ""), 38, Gx_line+8, 152, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2502PedObsTxt, "")), 142, Gx_line+8, 706, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(30, Gx_line+4, 623, Gx_line+4, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(30, Gx_line+4, 30, Gx_line+26, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(623, Gx_line+4, 623, Gx_line+26, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+26) ;
                  AV36FlagObs = (byte)(1) ;
               }
               else
               {
                  h9DG0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2502PedObsTxt, "")), 115, Gx_line+0, 679, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(30, Gx_line+0, 30, Gx_line+18, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(623, Gx_line+0, 623, Gx_line+18, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV50ContObs = (byte)(AV50ContObs+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV36FlagObs == 1 )
            {
               h9DG0( false, 4) ;
               getPrinter().GxDrawLine(30, Gx_line+1, 623, Gx_line+1, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+4) ;
            }
            h9DG0( false, 40) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data de Entrega...........:", ""), 38, Gx_line+13, 292, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(30, Gx_line+3, 623, Gx_line+3, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV42PedFecEnt, "99/99/99"), 248, Gx_line+13, 332, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(30, Gx_line+3, 30, Gx_line+40, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(623, Gx_line+3, 623, Gx_line+40, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+40) ;
            h9DG0( false, 23) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transporte................: V/ camiao", ""), 38, Gx_line+0, 386, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(30, Gx_line+19, 623, Gx_line+19, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(30, Gx_line+0, 30, Gx_line+20, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(623, Gx_line+0, 623, Gx_line+20, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h9DG0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h9DG0( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "Processado por Computador", ""), 32, Gx_line+0, 171, Gx_line+13, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MODA 21, Tinturaria e Acabamentos Têxteis, SA - Ruães - Mire de Tibães - 4700-565 Braga   Telef: 253 300390   Fax: 253 300399 E-mail: moda21@moda21.pt", ""), 34, Gx_line+11, 765, Gx_line+27, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Capital Social 3.250.000 € - Contribuinte nº 504 304 640-Matriculada na Conservatória do Registo Comercial de Braga sob o nº 7402", ""), 78, Gx_line+25, 700, Gx_line+41, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(30, Gx_line+9, 623, Gx_line+9, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40ContDsc, "")), 549, Gx_line+0, 633, Gx_line+13, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+39) ;
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
               getPrinter().GxDrawRect(30, Gx_line+137, 333, Gx_line+200, 1, 182, 182, 182, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(405, Gx_line+120, 630, Gx_line+210, 1, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag", ""), 548, Gx_line+281, 571, Gx_line+295, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 420, Gx_line+126, 454, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 578, Gx_line+281, 623, Gx_line+295, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem de Compra", ""), 420, Gx_line+143, 546, Gx_line+160, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A661PedFec, "99/99/99"), 567, Gx_line+126, 635, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 37, Gx_line+146, 319, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 553, Gx_line+142, 637, Gx_line+162, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A786PrvDir, "")), 37, Gx_line+159, 319, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fornecedor", ""), 420, Gx_line+158, 504, Gx_line+175, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A782PrvCpo, "")), 37, Gx_line+173, 94, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A799PrvPob, "")), 77, Gx_line+173, 359, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fax", ""), 420, Gx_line+173, 446, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 580, Gx_line+158, 631, Gx_line+176, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atn", ""), 420, Gx_line+189, 446, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmos. Senhores,", ""), 95, Gx_line+228, 246, Gx_line+246, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A804PrvTlx, "")), 533, Gx_line+173, 651, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A801PrvRep, "")), 493, Gx_line+189, 661, Gx_line+207, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Vimos por este meio encomendar a V. Exas. os seguintes produtos", ""), 95, Gx_line+254, 687, Gx_line+272, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de acordo com as condições que indicamos:", ""), 30, Gx_line+268, 415, Gx_line+286, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PRODUTO", ""), 51, Gx_line+311, 118, Gx_line+329, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REFERÊNCIA", ""), 126, Gx_line+311, 221, Gx_line+329, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "QTD(Kgs)", ""), 349, Gx_line+311, 425, Gx_line+329, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PREÇO(€)", ""), 459, Gx_line+311, 535, Gx_line+329, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(30, Gx_line+303, 623, Gx_line+332, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "VALOR", ""), 572, Gx_line+311, 620, Gx_line+329, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 30, Gx_line+9, 636, Gx_line+78) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+338) ;
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

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40ContDsc = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P09DG2_A396EmprCod = new String[] {""} ;
      P09DG2_A407EmprNom = new String[] {""} ;
      P09DG2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV11NomEmp = "" ;
      GXv_int2 = new byte[1] ;
      P09DG3_A396EmprCod = new String[] {""} ;
      P09DG3_A658PedCod = new int[1] ;
      P09DG3_A798PrvPlaEnt = new short[1] ;
      P09DG3_n798PrvPlaEnt = new boolean[] {false} ;
      P09DG3_A797PrvPer = new int[1] ;
      P09DG3_n797PrvPer = new boolean[] {false} ;
      P09DG3_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09DG3_A801PrvRep = new String[] {""} ;
      P09DG3_n801PrvRep = new boolean[] {false} ;
      P09DG3_A804PrvTlx = new String[] {""} ;
      P09DG3_n804PrvTlx = new boolean[] {false} ;
      P09DG3_A795PrvNum = new int[1] ;
      P09DG3_A799PrvPob = new String[] {""} ;
      P09DG3_n799PrvPob = new boolean[] {false} ;
      P09DG3_A782PrvCpo = new String[] {""} ;
      P09DG3_n782PrvCpo = new boolean[] {false} ;
      P09DG3_A786PrvDir = new String[] {""} ;
      P09DG3_n786PrvDir = new boolean[] {false} ;
      P09DG3_A794PrvNom = new String[] {""} ;
      P09DG3_n794PrvNom = new boolean[] {false} ;
      P09DG3_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      A662PedFecEnt = GXutil.nullDate() ;
      A801PrvRep = "" ;
      A804PrvTlx = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A786PrvDir = "" ;
      A794PrvNom = "" ;
      A661PedFec = GXutil.nullDate() ;
      AV42PedFecEnt = GXutil.nullDate() ;
      AV53Total_l = DecimalUtil.ZERO ;
      P09DG4_A396EmprCod = new String[] {""} ;
      P09DG4_A658PedCod = new int[1] ;
      P09DG4_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DG4_A728PrdRefPrv = new String[] {""} ;
      P09DG4_A670PedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DG4_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DG4_A719PrdNum = new String[] {""} ;
      A665PedPre = DecimalUtil.ZERO ;
      A728PrdRefPrv = "" ;
      A670PedVal = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV48PedPre = DecimalUtil.ZERO ;
      AV51PrdRefprv = "" ;
      AV52Valor_l = DecimalUtil.ZERO ;
      P09DG5_A396EmprCod = new String[] {""} ;
      P09DG5_A658PedCod = new int[1] ;
      P09DG5_A2502PedObsTxt = new String[] {""} ;
      P09DG5_A2501PedObsLin = new byte[1] ;
      A2502PedObsTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rmod001pdf__default(),
         new Object[] {
             new Object[] {
            P09DG2_A396EmprCod, P09DG2_A407EmprNom, P09DG2_n407EmprNom
            }
            , new Object[] {
            P09DG3_A396EmprCod, P09DG3_A658PedCod, P09DG3_A798PrvPlaEnt, P09DG3_n798PrvPlaEnt, P09DG3_A797PrvPer, P09DG3_n797PrvPer, P09DG3_A662PedFecEnt, P09DG3_A801PrvRep, P09DG3_n801PrvRep, P09DG3_A804PrvTlx,
            P09DG3_n804PrvTlx, P09DG3_A795PrvNum, P09DG3_A799PrvPob, P09DG3_n799PrvPob, P09DG3_A782PrvCpo, P09DG3_n782PrvCpo, P09DG3_A786PrvDir, P09DG3_n786PrvDir, P09DG3_A794PrvNom, P09DG3_n794PrvNom,
            P09DG3_A661PedFec
            }
            , new Object[] {
            P09DG4_A396EmprCod, P09DG4_A658PedCod, P09DG4_A665PedPre, P09DG4_A728PrdRefPrv, P09DG4_A670PedVal, P09DG4_A669PedUni, P09DG4_A719PrdNum
            }
            , new Object[] {
            P09DG5_A396EmprCod, P09DG5_A658PedCod, P09DG5_A2502PedObsTxt, P09DG5_A2501PedObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV32Flag ;
   private byte GXv_int2[] ;
   private byte AV36FlagObs ;
   private byte AV50ContObs ;
   private byte A2501PedObsLin ;
   private short AV37NumLineas ;
   private short A798PrvPlaEnt ;
   private short AV34PrvPlaEnt ;
   private short Gx_err ;
   private int A658PedCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A797PrvPer ;
   private int A795PrvNum ;
   private int AV35PrvPer ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV9TotPed ;
   private java.math.BigDecimal AV53Total_l ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A670PedVal ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal AV48PedPre ;
   private java.math.BigDecimal AV52Valor_l ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV40ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV11NomEmp ;
   private String A801PrvRep ;
   private String A804PrvTlx ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A786PrvDir ;
   private String A794PrvNom ;
   private String A728PrdRefPrv ;
   private String A719PrdNum ;
   private String AV51PrdRefprv ;
   private String A2502PedObsTxt ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date A661PedFec ;
   private java.util.Date AV42PedFecEnt ;
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
   private String AV61NombreArchivo ;
   private IDataStoreProvider pr_default ;
   private String[] P09DG2_A396EmprCod ;
   private String[] P09DG2_A407EmprNom ;
   private boolean[] P09DG2_n407EmprNom ;
   private String[] P09DG3_A396EmprCod ;
   private int[] P09DG3_A658PedCod ;
   private short[] P09DG3_A798PrvPlaEnt ;
   private boolean[] P09DG3_n798PrvPlaEnt ;
   private int[] P09DG3_A797PrvPer ;
   private boolean[] P09DG3_n797PrvPer ;
   private java.util.Date[] P09DG3_A662PedFecEnt ;
   private String[] P09DG3_A801PrvRep ;
   private boolean[] P09DG3_n801PrvRep ;
   private String[] P09DG3_A804PrvTlx ;
   private boolean[] P09DG3_n804PrvTlx ;
   private int[] P09DG3_A795PrvNum ;
   private String[] P09DG3_A799PrvPob ;
   private boolean[] P09DG3_n799PrvPob ;
   private String[] P09DG3_A782PrvCpo ;
   private boolean[] P09DG3_n782PrvCpo ;
   private String[] P09DG3_A786PrvDir ;
   private boolean[] P09DG3_n786PrvDir ;
   private String[] P09DG3_A794PrvNom ;
   private boolean[] P09DG3_n794PrvNom ;
   private java.util.Date[] P09DG3_A661PedFec ;
   private String[] P09DG4_A396EmprCod ;
   private int[] P09DG4_A658PedCod ;
   private java.math.BigDecimal[] P09DG4_A665PedPre ;
   private String[] P09DG4_A728PrdRefPrv ;
   private java.math.BigDecimal[] P09DG4_A670PedVal ;
   private java.math.BigDecimal[] P09DG4_A669PedUni ;
   private String[] P09DG4_A719PrdNum ;
   private String[] P09DG5_A396EmprCod ;
   private int[] P09DG5_A658PedCod ;
   private String[] P09DG5_A2502PedObsTxt ;
   private byte[] P09DG5_A2501PedObsLin ;
}

final  class rmod001pdf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DG2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09DG3", "SELECT T1.EmprCod, T1.PedCod, T2.PrvPlaEnt, T2.PrvPer, T1.PedFecEnt, T2.PrvRep, T2.PrvTlx, T1.PrvNum, T2.PrvPob, T2.PrvCpo, T2.PrvDir, T2.PrvNom, T1.PedFec FROM (TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09DG4", "SELECT T1.EmprCod, T1.PedCod, T1.PedPre, T2.PrdRefPrv, T1.PedVal, T1.PedUni, T1.PrdNum FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DG5", "SELECT EmprCod, PedCod, PedObsTxt, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PedObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

