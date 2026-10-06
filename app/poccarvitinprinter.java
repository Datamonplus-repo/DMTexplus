package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class poccarvitinprinter extends GXReport
{
   public poccarvitinprinter( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( poccarvitinprinter.class ), "" );
   }

   public poccarvitinprinter( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String aP2 )
   {
      poccarvitinprinter.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      poccarvitinprinter.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      poccarvitinprinter.this.AV12NombreArchivo = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 22 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      setPrintAtClient("ETIQUETA_IMPRESORA_001");
      try
      {
         Gx_out = "FIL";
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "ETIQUETA_IMPRESORA_001", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*22)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV10ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COMCVT", ""), GXv_char1) ;
         poccarvitinprinter.this.AV10ContDsc = GXv_char1[0] ;
         GxHdr2 = true ;
         /* Using cursor P08RC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A795PrvNum = P08RC2_A795PrvNum[0] ;
            A395EmprCif = P08RC2_A395EmprCif[0] ;
            n395EmprCif = P08RC2_n395EmprCif[0] ;
            A662PedFecEnt = P08RC2_A662PedFecEnt[0] ;
            A793PrvNif = P08RC2_A793PrvNif[0] ;
            n793PrvNif = P08RC2_n793PrvNif[0] ;
            A799PrvPob = P08RC2_A799PrvPob[0] ;
            n799PrvPob = P08RC2_n799PrvPob[0] ;
            A782PrvCpo = P08RC2_A782PrvCpo[0] ;
            n782PrvCpo = P08RC2_n782PrvCpo[0] ;
            A786PrvDir = P08RC2_A786PrvDir[0] ;
            n786PrvDir = P08RC2_n786PrvDir[0] ;
            A794PrvNom = P08RC2_A794PrvNom[0] ;
            n794PrvNom = P08RC2_n794PrvNom[0] ;
            A395EmprCif = P08RC2_A395EmprCif[0] ;
            n395EmprCif = P08RC2_n395EmprCif[0] ;
            A793PrvNif = P08RC2_A793PrvNif[0] ;
            n793PrvNif = P08RC2_n793PrvNif[0] ;
            A799PrvPob = P08RC2_A799PrvPob[0] ;
            n799PrvPob = P08RC2_n799PrvPob[0] ;
            A782PrvCpo = P08RC2_A782PrvCpo[0] ;
            n782PrvCpo = P08RC2_n782PrvCpo[0] ;
            A786PrvDir = P08RC2_A786PrvDir[0] ;
            n786PrvDir = P08RC2_n786PrvDir[0] ;
            A794PrvNom = P08RC2_A794PrvNom[0] ;
            n794PrvNom = P08RC2_n794PrvNom[0] ;
            AV8EmprCif = A395EmprCif ;
            AV11i = (short)(1) ;
            /* Using cursor P08RC3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2502PedObsTxt = P08RC3_A2502PedObsTxt[0] ;
               A2501PedObsLin = P08RC3_A2501PedObsLin[0] ;
               AV9Obs[AV11i-1] = A2502PedObsTxt ;
               AV11i = (short)(AV11i+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Using cursor P08RC4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A742PrdUniCom = P08RC4_A742PrdUniCom[0] ;
               A737PrdUcpDsc = P08RC4_A737PrdUcpDsc[0] ;
               n737PrdUcpDsc = P08RC4_n737PrdUcpDsc[0] ;
               A669PedUni = P08RC4_A669PedUni[0] ;
               A718PrdNom = P08RC4_A718PrdNom[0] ;
               A719PrdNum = P08RC4_A719PrdNum[0] ;
               A742PrdUniCom = P08RC4_A742PrdUniCom[0] ;
               A718PrdNom = P08RC4_A718PrdNom[0] ;
               A737PrdUcpDsc = P08RC4_A737PrdUcpDsc[0] ;
               n737PrdUcpDsc = P08RC4_n737PrdUcpDsc[0] ;
               h8RC0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 135, Gx_line+0, 180, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 188, Gx_line+0, 379, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A669PedUni, "ZZZZZ9.99")), 418, Gx_line+0, 485, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A737PrdUcpDsc, "")), 500, Gx_line+0, 559, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h8RC0( false, 17) ;
            getPrinter().GxDrawLine(21, Gx_line+0, 772, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h8RC0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h8RC0( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "Os produtos quimicos solicitados devem cumprir com requisitos da ultima versao de Clear to Wear (CTW) e da lista", ""), 21, Gx_line+16, 703, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de Substancias Restritas em Fabricaçao (MRSL).", ""), 21, Gx_line+31, 311, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Todos os artigos incluidos nesta encomenda devem ser fornecidos nas suas embalagens originales ( incluido no ", ""), 21, Gx_line+63, 690, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "rotulo nome do produto, fabricante, distribuidor e nº de lote do produto)", ""), 21, Gx_line+78, 439, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Caso algum dos produtos encomendados, contenha alguna das substaancias da lista SVHC candidatas a", ""), 21, Gx_line+109, 642, Gx_line+125, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "autorizaçao, no ambito do Regulamento REACH, em quantidades superiores a 0.1% devera informar qual o produto,", ""), 21, Gx_line+125, 697, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "o nome da SVHC e a quantidade presente nesse produto, o mais tardar na data de entrega da encomenda", ""), 21, Gx_line+141, 644, Gx_line+157, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Os produtos encomendados tem que cumprir com as restriçoes previstas no anexo XVII do regulamento REACH, ", ""), 21, Gx_line+172, 690, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "sendo da responsabilidade do fornecedor essa garantia", ""), 21, Gx_line+188, 352, Gx_line+204, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+203) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Soc. por quotas-Capital Social 200.000.00 Euros Reg na C.R.C. BRAGA Sob o nº 507975170 Parque Ind. Padim da Graça Lote 16 4700-670 PADIM DA GRAÇA", ""), 21, Gx_line+16, 717, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ContDsc, "")), 18, Gx_line+63, 164, Gx_line+78, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 289, Gx_line+61, 320, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 330, Gx_line+63, 381, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "José Marques/A.Ferreira", ""), 497, Gx_line+78, 638, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O RESPONSÁVEL", ""), 507, Gx_line+47, 612, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(486, Gx_line+94, 654, Gx_line+94, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+109) ;
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
            if ( GxHdr2 )
            {
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 22, Gx_line+16, 248, Gx_line+76) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PARQUE INDUTSRIAL PADIM DA GRAÇA - LOTE 16", ""), 21, Gx_line+78, 314, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TELEFONE 253 300 090", ""), 21, Gx_line+94, 163, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FAX Nº 253 622 428", ""), 21, Gx_line+109, 135, Gx_line+125, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "4700-670 BRAGA", ""), 21, Gx_line+125, 122, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Para:", ""), 396, Gx_line+63, 427, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 438, Gx_line+78, 595, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A786PrvDir, "")), 438, Gx_line+95, 595, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A782PrvCpo, "")), 438, Gx_line+111, 508, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A799PrvPob, "")), 507, Gx_line+111, 664, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem de Compra de P.Q nº", ""), 458, Gx_line+16, 620, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 635, Gx_line+16, 694, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(380, Gx_line+47, 720, Gx_line+142, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Nº de Contribuinte:", ""), 21, Gx_line+156, 142, Gx_line+172, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprCif, "")), 151, Gx_line+156, 230, Gx_line+173, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Nº de Contribuinte:", ""), 21, Gx_line+172, 140, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A793PrvNif, "")), 151, Gx_line+172, 256, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Talao nº:", ""), 47, Gx_line+203, 97, Gx_line+219, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Entrega:", ""), 47, Gx_line+219, 126, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A662PedFecEnt, "99/99/99"), 135, Gx_line+219, 186, Gx_line+236, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+250) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes:", ""), 47, Gx_line+0, 127, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Obs[1-1], "")), 151, Gx_line+0, 465, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Obs[2-1], "")), 151, Gx_line+16, 465, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Obs[3-1], "")), 151, Gx_line+31, 465, Gx_line+48, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+63) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Produtos", ""), 180, Gx_line+16, 233, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 417, Gx_line+16, 485, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Unid.", ""), 500, Gx_line+16, 531, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Entrega", ""), 641, Gx_line+16, 717, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(26, Gx_line+31, 386, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(417, Gx_line+31, 484, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(500, Gx_line+31, 530, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(639, Gx_line+31, 727, Gx_line+31, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+39) ;
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

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP0[0] = poccarvitinprinter.this.A396EmprCod;
      this.aP1[0] = poccarvitinprinter.this.A658PedCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ContDsc = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P08RC2_A795PrvNum = new int[1] ;
      P08RC2_A396EmprCod = new String[] {""} ;
      P08RC2_A658PedCod = new int[1] ;
      P08RC2_A395EmprCif = new String[] {""} ;
      P08RC2_n395EmprCif = new boolean[] {false} ;
      P08RC2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08RC2_A793PrvNif = new String[] {""} ;
      P08RC2_n793PrvNif = new boolean[] {false} ;
      P08RC2_A799PrvPob = new String[] {""} ;
      P08RC2_n799PrvPob = new boolean[] {false} ;
      P08RC2_A782PrvCpo = new String[] {""} ;
      P08RC2_n782PrvCpo = new boolean[] {false} ;
      P08RC2_A786PrvDir = new String[] {""} ;
      P08RC2_n786PrvDir = new boolean[] {false} ;
      P08RC2_A794PrvNom = new String[] {""} ;
      P08RC2_n794PrvNom = new boolean[] {false} ;
      A395EmprCif = "" ;
      A662PedFecEnt = GXutil.nullDate() ;
      A793PrvNif = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A786PrvDir = "" ;
      A794PrvNom = "" ;
      AV8EmprCif = "" ;
      P08RC3_A396EmprCod = new String[] {""} ;
      P08RC3_A658PedCod = new int[1] ;
      P08RC3_A2502PedObsTxt = new String[] {""} ;
      P08RC3_A2501PedObsLin = new byte[1] ;
      A2502PedObsTxt = "" ;
      AV9Obs = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV9Obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P08RC4_A742PrdUniCom = new byte[1] ;
      P08RC4_A396EmprCod = new String[] {""} ;
      P08RC4_A658PedCod = new int[1] ;
      P08RC4_A737PrdUcpDsc = new String[] {""} ;
      P08RC4_n737PrdUcpDsc = new boolean[] {false} ;
      P08RC4_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RC4_A718PrdNom = new String[] {""} ;
      P08RC4_A719PrdNum = new String[] {""} ;
      A737PrdUcpDsc = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.poccarvitinprinter__default(),
         new Object[] {
             new Object[] {
            P08RC2_A795PrvNum, P08RC2_A396EmprCod, P08RC2_A658PedCod, P08RC2_A395EmprCif, P08RC2_n395EmprCif, P08RC2_A662PedFecEnt, P08RC2_A793PrvNif, P08RC2_n793PrvNif, P08RC2_A799PrvPob, P08RC2_n799PrvPob,
            P08RC2_A782PrvCpo, P08RC2_n782PrvCpo, P08RC2_A786PrvDir, P08RC2_n786PrvDir, P08RC2_A794PrvNom, P08RC2_n794PrvNom
            }
            , new Object[] {
            P08RC3_A396EmprCod, P08RC3_A658PedCod, P08RC3_A2502PedObsTxt, P08RC3_A2501PedObsLin
            }
            , new Object[] {
            P08RC4_A742PrdUniCom, P08RC4_A396EmprCod, P08RC4_A658PedCod, P08RC4_A737PrdUcpDsc, P08RC4_n737PrdUcpDsc, P08RC4_A669PedUni, P08RC4_A718PrdNom, P08RC4_A719PrdNum
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A2501PedObsLin ;
   private byte A742PrdUniCom ;
   private short AV11i ;
   private short Gx_err ;
   private int A658PedCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int Gx_OldLine ;
   private int GX_I ;
   private java.math.BigDecimal A669PedUni ;
   private String A396EmprCod ;
   private String AV10ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A395EmprCif ;
   private String A793PrvNif ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A786PrvDir ;
   private String A794PrvNom ;
   private String AV8EmprCif ;
   private String A2502PedObsTxt ;
   private String AV9Obs[] ;
   private String A737PrdUcpDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date Gx_date ;
   private boolean GxHdr2 ;
   private boolean n395EmprCif ;
   private boolean n793PrvNif ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n737PrdUcpDsc ;
   private String AV12NombreArchivo ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P08RC2_A795PrvNum ;
   private String[] P08RC2_A396EmprCod ;
   private int[] P08RC2_A658PedCod ;
   private String[] P08RC2_A395EmprCif ;
   private boolean[] P08RC2_n395EmprCif ;
   private java.util.Date[] P08RC2_A662PedFecEnt ;
   private String[] P08RC2_A793PrvNif ;
   private boolean[] P08RC2_n793PrvNif ;
   private String[] P08RC2_A799PrvPob ;
   private boolean[] P08RC2_n799PrvPob ;
   private String[] P08RC2_A782PrvCpo ;
   private boolean[] P08RC2_n782PrvCpo ;
   private String[] P08RC2_A786PrvDir ;
   private boolean[] P08RC2_n786PrvDir ;
   private String[] P08RC2_A794PrvNom ;
   private boolean[] P08RC2_n794PrvNom ;
   private String[] P08RC3_A396EmprCod ;
   private int[] P08RC3_A658PedCod ;
   private String[] P08RC3_A2502PedObsTxt ;
   private byte[] P08RC3_A2501PedObsLin ;
   private byte[] P08RC4_A742PrdUniCom ;
   private String[] P08RC4_A396EmprCod ;
   private int[] P08RC4_A658PedCod ;
   private String[] P08RC4_A737PrdUcpDsc ;
   private boolean[] P08RC4_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P08RC4_A669PedUni ;
   private String[] P08RC4_A718PrdNom ;
   private String[] P08RC4_A719PrdNum ;
}

final  class poccarvitinprinter__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RC2", "SELECT T1.PrvNum, T1.EmprCod, T1.PedCod, T2.EmprCif, T1.PedFecEnt, T3.PrvNif, T3.PrvPob, T3.PrvCpo, T3.PrvDir, T3.PrvNom FROM ((TXPCPEDID T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08RC3", "SELECT EmprCod, PedCod, PedObsTxt, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PedObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RC4", "SELECT T2.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.PedCod, T3.UniDsc AS PrdUcpDsc, T1.PedUni, T2.PrdNom, T1.PrdNum FROM ((TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T2.PrdUniCom) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

