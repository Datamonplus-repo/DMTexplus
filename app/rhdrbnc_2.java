package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrbnc_2 extends GXReport
{
   public rhdrbnc_2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrbnc_2.class ), "" );
   }

   public rhdrbnc_2( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 )
   {
      rhdrbnc_2.this.AV16ReportInPut = aP0;
      rhdrbnc_2.this.A396EmprCod = aP1;
      rhdrbnc_2.this.A129BarCod = aP2;
      rhdrbnc_2.this.A132BarCodReo = aP3;
      rhdrbnc_2.this.A130BarCodPar = aP4;
      rhdrbnc_2.this.AV8ImpCod = aP5;
      rhdrbnc_2.this.Gx_out = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 2 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV16ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV9ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRBNC", ""), GXv_char1) ;
         rhdrbnc_2.this.AV9ContDsc = GXv_char1[0] ;
         /* Using cursor P0AJ92 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0AJ92_A407EmprNom[0] ;
            n407EmprNom = P0AJ92_n407EmprNom[0] ;
            AV11EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P0AJ94 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1652BarSerDsc = P0AJ94_A1652BarSerDsc[0] ;
            A212BarSer = P0AJ94_A212BarSer[0] ;
            A136BarColNum = P0AJ94_A136BarColNum[0] ;
            A135BarColNom = P0AJ94_A135BarColNom[0] ;
            A159BarFecGen = P0AJ94_A159BarFecGen[0] ;
            A279CliNom = P0AJ94_A279CliNom[0] ;
            A252CliCod = P0AJ94_A252CliCod[0] ;
            n252CliCod = P0AJ94_n252CliCod[0] ;
            A166BarKgm = P0AJ94_A166BarKgm[0] ;
            n166BarKgm = P0AJ94_n166BarKgm[0] ;
            A279CliNom = P0AJ94_A279CliNom[0] ;
            A166BarKgm = P0AJ94_A166BarKgm[0] ;
            n166BarKgm = P0AJ94_n166BarKgm[0] ;
            AV10Hdr = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV12MacCod = 0 ;
            AV13TotKgs = DecimalUtil.doubleToDec(0) ;
            GXv_int2[0] = AV12MacCod ;
            new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
            rhdrbnc_2.this.AV12MacCod = GXv_int2[0] ;
            if ( AV12MacCod > 0 )
            {
               /* Execute user subroutine: 'ACCESORIOS' */
               S111 ();
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
            }
            else
            {
               AV13TotKgs = A166BarKgm ;
            }
            AV15Texto_a = GXutil.trim( A212BarSer) + " " + GXutil.trim( A1652BarSerDsc) ;
            hAJ90( false, 1073) ;
            getPrinter().GxAttris("Arial", 21, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "B  O  L  E  T  I  M    D  E    N  Ã  O", ""), 294, Gx_line+46, 747, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Hdr, "")), 107, Gx_line+155, 177, Gx_line+173, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 55, Gx_line+188, 100, Gx_line+203, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 107, Gx_line+186, 152, Gx_line+203, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 159, Gx_line+186, 316, Gx_line+203, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 391, Gx_line+186, 419, Gx_line+201, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 423, Gx_line+185, 474, Gx_line+202, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade:", ""), 536, Gx_line+186, 605, Gx_line+201, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 609, Gx_line+185, 676, Gx_line+202, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 55, Gx_line+219, 80, Gx_line+234, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 107, Gx_line+218, 176, Gx_line+235, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 193, Gx_line+218, 238, Gx_line+235, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 21, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C O N F O R M I D A D E   -   BNC", ""), 294, Gx_line+92, 745, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.S:", ""), 55, Gx_line+155, 84, Gx_line+172, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+147, 788, Gx_line+179, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+29, 260, Gx_line+148, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+178, 788, Gx_line+210, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+209, 788, Gx_line+242, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 685, Gx_line+155, 701, Gx_line+172, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(670, Gx_line+148, 670, Gx_line+178, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+243, 788, Gx_line+645, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+670, 788, Gx_line+698, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+670, 788, Gx_line+858, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9ContDsc, "")), 43, Gx_line+1045, 148, Gx_line+1062, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 682, Gx_line+185, 687, Gx_line+200, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13TotKgs, "ZZZ,ZZ9.99")), 693, Gx_line+184, 767, Gx_line+201, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(")", 772, Gx_line+185, 777, Gx_line+200, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 344, Gx_line+219, 384, Gx_line+234, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Texto_a, "")), 401, Gx_line+218, 590, Gx_line+235, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+28, 788, Gx_line+244, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(42, Gx_line+147, 787, Gx_line+147, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+243, 788, Gx_line+270, 1, 0, 0, 0, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CARACTERIZAÇÃO DA RECLAMAÇÃO E ANÁLISE DA CAUSA", ""), 52, Gx_line+249, 383, Gx_line+264, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(40, Gx_line+269, 784, Gx_line+269, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+457, 788, Gx_line+484, 1, 0, 0, 0, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(40, Gx_line+483, 784, Gx_line+483, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(42, Gx_line+457, 786, Gx_line+457, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ACÇÕES DE CORRECÇÃO A IMPLEMENTAR E ANÁLISE DA SUA EFICACIA", ""), 52, Gx_line+466, 446, Gx_line+481, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(40, Gx_line+616, 785, Gx_line+616, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data: ______/______/______", ""), 50, Gx_line+626, 200, Gx_line+641, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rubrica: ________________________", ""), 259, Gx_line+626, 459, Gx_line+641, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+670, 788, Gx_line+697, 1, 0, 0, 0, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ACÇÕES CORRECTIVAS A IMPLEMENTAR E ANÁLISE DA SUA EFICACIA", ""), 55, Gx_line+676, 440, Gx_line+691, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(42, Gx_line+829, 787, Gx_line+829, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data: ______/______/______", ""), 50, Gx_line+840, 200, Gx_line+855, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rubrica: ________________________", ""), 259, Gx_line+840, 459, Gx_line+855, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+871, 788, Gx_line+901, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(40, Gx_line+871, 788, Gx_line+1040, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(42, Gx_line+1009, 787, Gx_line+1009, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data: ______/______/______", ""), 50, Gx_line+1021, 200, Gx_line+1036, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rubrica: ________________________", ""), 259, Gx_line+1021, 459, Gx_line+1036, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Encerramento:", ""), 55, Gx_line+879, 140, Gx_line+894, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(256, Gx_line+871, 256, Gx_line+1011, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(566, Gx_line+871, 566, Gx_line+1011, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observações:", ""), 267, Gx_line+879, 347, Gx_line+894, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Documentos associados:", ""), 577, Gx_line+879, 723, Gx_line+894, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SIM ", ""), 56, Gx_line+924, 82, Gx_line+940, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NÃO", ""), 58, Gx_line+968, 85, Gx_line+984, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(98, Gx_line+968, 111, Gx_line+984, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(98, Gx_line+924, 111, Gx_line+940, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3c99144a-8aa9-43d5-8fce-801099ee2ac5", "", context.getHttpContext().getTheme( )), 43, Gx_line+32, 258, Gx_line+143) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1073) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAJ90( true, 0) ;
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
      /* 'ACCESORIOS' Routine */
      returnInSub = false ;
      /* Using cursor P0AJ95 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV12MacCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1199MacCod = P0AJ95_A1199MacCod[0] ;
         A1203MacBarCod = P0AJ95_A1203MacBarCod[0] ;
         A1204MacBarReo = P0AJ95_A1204MacBarReo[0] ;
         A1205MacBarPar = P0AJ95_A1205MacBarPar[0] ;
         A1201MacLin = P0AJ95_A1201MacLin[0] ;
         GXv_decimal3[0] = AV14Kgmagr ;
         GXv_char1[0] = "" ;
         GXv_char4[0] = "" ;
         GXv_int2[0] = 0 ;
         new app.pobsagr(remoteHandle, context).execute( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, GXv_decimal3, GXv_char1, GXv_char4, GXv_int2) ;
         rhdrbnc_2.this.AV14Kgmagr = GXv_decimal3[0] ;
         AV13TotKgs = AV13TotKgs.add(AV14Kgmagr) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void hAJ90( boolean bFoot ,
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
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV9ContDsc = "" ;
      scmdbuf = "" ;
      P0AJ92_A396EmprCod = new String[] {""} ;
      P0AJ92_A407EmprNom = new String[] {""} ;
      P0AJ92_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV11EmprNom = "" ;
      P0AJ94_A396EmprCod = new String[] {""} ;
      P0AJ94_A129BarCod = new int[1] ;
      P0AJ94_A132BarCodReo = new byte[1] ;
      P0AJ94_A130BarCodPar = new String[] {""} ;
      P0AJ94_A1652BarSerDsc = new String[] {""} ;
      P0AJ94_A212BarSer = new String[] {""} ;
      P0AJ94_A136BarColNum = new int[1] ;
      P0AJ94_A135BarColNom = new String[] {""} ;
      P0AJ94_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJ94_A279CliNom = new String[] {""} ;
      P0AJ94_A252CliCod = new int[1] ;
      P0AJ94_n252CliCod = new boolean[] {false} ;
      P0AJ94_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ94_n166BarKgm = new boolean[] {false} ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A279CliNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV10Hdr = "" ;
      AV13TotKgs = DecimalUtil.ZERO ;
      AV15Texto_a = "" ;
      P0AJ95_A396EmprCod = new String[] {""} ;
      P0AJ95_A1199MacCod = new int[1] ;
      P0AJ95_A1203MacBarCod = new int[1] ;
      P0AJ95_A1204MacBarReo = new byte[1] ;
      P0AJ95_A1205MacBarPar = new String[] {""} ;
      P0AJ95_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV14Kgmagr = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrbnc_2__default(),
         new Object[] {
             new Object[] {
            P0AJ92_A396EmprCod, P0AJ92_A407EmprNom, P0AJ92_n407EmprNom
            }
            , new Object[] {
            P0AJ94_A396EmprCod, P0AJ94_A129BarCod, P0AJ94_A132BarCodReo, P0AJ94_A130BarCodPar, P0AJ94_A1652BarSerDsc, P0AJ94_A212BarSer, P0AJ94_A136BarColNum, P0AJ94_A135BarColNom, P0AJ94_A159BarFecGen, P0AJ94_A279CliNom,
            P0AJ94_A252CliCod, P0AJ94_n252CliCod, P0AJ94_A166BarKgm, P0AJ94_n166BarKgm
            }
            , new Object[] {
            P0AJ95_A396EmprCod, P0AJ95_A1199MacCod, P0AJ95_A1203MacBarCod, P0AJ95_A1204MacBarReo, P0AJ95_A1205MacBarPar, P0AJ95_A1201MacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1204MacBarReo ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV12MacCod ;
   private int Gx_OldLine ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV13TotKgs ;
   private java.math.BigDecimal AV14Kgmagr ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8ImpCod ;
   private String Gx_out ;
   private String AV9ContDsc ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV11EmprNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String AV10Hdr ;
   private String AV15Texto_a ;
   private String A1205MacBarPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private java.util.Date A159BarFecGen ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private String AV16ReportInPut ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJ92_A396EmprCod ;
   private String[] P0AJ92_A407EmprNom ;
   private boolean[] P0AJ92_n407EmprNom ;
   private String[] P0AJ94_A396EmprCod ;
   private int[] P0AJ94_A129BarCod ;
   private byte[] P0AJ94_A132BarCodReo ;
   private String[] P0AJ94_A130BarCodPar ;
   private String[] P0AJ94_A1652BarSerDsc ;
   private String[] P0AJ94_A212BarSer ;
   private int[] P0AJ94_A136BarColNum ;
   private String[] P0AJ94_A135BarColNom ;
   private java.util.Date[] P0AJ94_A159BarFecGen ;
   private String[] P0AJ94_A279CliNom ;
   private int[] P0AJ94_A252CliCod ;
   private boolean[] P0AJ94_n252CliCod ;
   private java.math.BigDecimal[] P0AJ94_A166BarKgm ;
   private boolean[] P0AJ94_n166BarKgm ;
   private String[] P0AJ95_A396EmprCod ;
   private int[] P0AJ95_A1199MacCod ;
   private int[] P0AJ95_A1203MacBarCod ;
   private byte[] P0AJ95_A1204MacBarReo ;
   private String[] P0AJ95_A1205MacBarPar ;
   private short[] P0AJ95_A1201MacLin ;
}

final  class rhdrbnc_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJ92", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ94", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSerDsc, T1.BarSer, T1.BarColNum, T1.BarColNom, T1.BarFecGen, T2.CliNom, T1.CliCod, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ95", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
      }
   }

}

