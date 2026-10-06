package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pprc178 extends GXReport
{
   public pprc178( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc178.class ), "" );
   }

   public pprc178( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pprc178.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pprc178.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc178.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pprc178.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Informe N Recepcion") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P05PS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A840TrnCod = P05PS2_A840TrnCod[0] ;
            n840TrnCod = P05PS2_n840TrnCod[0] ;
            A970ProceCod = P05PS2_A970ProceCod[0] ;
            n970ProceCod = P05PS2_n970ProceCod[0] ;
            A1211TipEntCod = P05PS2_A1211TipEntCod[0] ;
            n1211TipEntCod = P05PS2_n1211TipEntCod[0] ;
            A252CliCod = P05PS2_A252CliCod[0] ;
            A45AlbRef = P05PS2_A45AlbRef[0] ;
            A52AlbRPieEnt = P05PS2_A52AlbRPieEnt[0] ;
            A56AlbRUni = P05PS2_A56AlbRUni[0] ;
            A58AlbRUniEnt = P05PS2_A58AlbRUniEnt[0] ;
            A8029AlbNumM = P05PS2_A8029AlbNumM[0] ;
            A6181AlbrPieC = P05PS2_A6181AlbrPieC[0] ;
            A2748CliAlias = P05PS2_A2748CliAlias[0] ;
            A13243AlbRRTrans = P05PS2_A13243AlbRRTrans[0] ;
            n13243AlbRRTrans = P05PS2_n13243AlbRRTrans[0] ;
            A13242AlbRRLong = P05PS2_A13242AlbRRLong[0] ;
            n13242AlbRRLong = P05PS2_n13242AlbRRLong[0] ;
            A13241AlbRPh = P05PS2_A13241AlbRPh[0] ;
            n13241AlbRPh = P05PS2_n13241AlbRPh[0] ;
            A1212TipEntNom = P05PS2_A1212TipEntNom[0] ;
            n1212TipEntNom = P05PS2_n1212TipEntNom[0] ;
            A4921AlbRAnc = P05PS2_A4921AlbRAnc[0] ;
            A4920AlbRGrm2 = P05PS2_A4920AlbRGrm2[0] ;
            A971ProceNom = P05PS2_A971ProceNom[0] ;
            n971ProceNom = P05PS2_n971ProceNom[0] ;
            A841TrnNom = P05PS2_A841TrnNom[0] ;
            n841TrnNom = P05PS2_n841TrnNom[0] ;
            A49AlbRFen = P05PS2_A49AlbRFen[0] ;
            A5806AlbREnt2 = P05PS2_A5806AlbREnt2[0] ;
            A2748CliAlias = P05PS2_A2748CliAlias[0] ;
            A841TrnNom = P05PS2_A841TrnNom[0] ;
            n841TrnNom = P05PS2_n841TrnNom[0] ;
            A971ProceNom = P05PS2_A971ProceNom[0] ;
            n971ProceNom = P05PS2_n971ProceNom[0] ;
            A1212TipEntNom = P05PS2_A1212TipEntNom[0] ;
            n1212TipEntNom = P05PS2_n1212TipEntNom[0] ;
            AV12clicod = A252CliCod ;
            AV13artcod = A45AlbRef ;
            /* Execute user subroutine: 'ARTICU' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV9albreccod = GXutil.padl( GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)), (short)(8), "0") ;
            AV10Unidadestxt = ((A6181AlbrPieC>0) ? GXutil.trim( GXutil.str( A6181AlbrPieC, 6, 0))+" "+GXutil.trim( A8029AlbNumM)+"                    "+GXutil.trim( GXutil.str( A58AlbRUniEnt, 9, 2))+" "+((GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", ""))==0) ? httpContext.getMessage( "kgs", "") : httpContext.getMessage( "mts", "")) : GXutil.trim( GXutil.str( A52AlbRPieEnt, 6, 0))+httpContext.getMessage( " Piezas             ", "")+GXutil.trim( GXutil.str( A58AlbRUniEnt, 9, 2))+" "+((GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", ""))==0) ? httpContext.getMessage( "kgs", "") : httpContext.getMessage( "mts", ""))) ;
            h5PS0( false, 189) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Numero Partida:", ""), 22, Gx_line+16, 119, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 70, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9albreccod, "")), 52, Gx_line+47, 753, Gx_line+167, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 774, Gx_line+184, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+189) ;
            h5PS0( false, 109) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente Propietario:", ""), 22, Gx_line+17, 136, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 22, Gx_line+31, 173, Gx_line+94, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 774, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2748CliAlias, "")), 211, Gx_line+31, 645, Gx_line+94, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+109) ;
            h5PS0( false, 184) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre del crudo:", ""), 22, Gx_line+17, 131, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 22, Gx_line+31, 387, Gx_line+92, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 774, Gx_line+181, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho:", ""), 721, Gx_line+94, 762, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9")), 660, Gx_line+109, 761, Gx_line+172, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), 22, Gx_line+94, 439, Gx_line+155, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13241AlbRPh, "ZZ9.99")), 409, Gx_line+36, 523, Gx_line+81, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PH", ""), 443, Gx_line+15, 460, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13242AlbRRLong, "ZZ9.99")), 525, Gx_line+39, 639, Gx_line+84, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13243AlbRRTrans, "ZZ9.99")), 642, Gx_line+39, 756, Gx_line+84, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Resistencias", ""), 606, Gx_line+5, 675, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Longitudinal", ""), 546, Gx_line+18, 617, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transversal", ""), 667, Gx_line+18, 731, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(407, Gx_line+3, 771, Gx_line+86, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(523, Gx_line+3, 523, Gx_line+86, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(408, Gx_line+32, 768, Gx_line+32, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(639, Gx_line+32, 639, Gx_line+86, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+184) ;
            h5PS0( false, 96) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cantidad y Unidades de Recepcion:", ""), 22, Gx_line+7, 220, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Unidadestxt, "")), 22, Gx_line+26, 700, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 774, Gx_line+95, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+96) ;
            h5PS0( false, 109) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estructura tejido:", ""), 22, Gx_line+17, 122, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Clasdsc, "")), 22, Gx_line+33, 429, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gramaje:", ""), 708, Gx_line+17, 761, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9")), 660, Gx_line+33, 761, Gx_line+96, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 774, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Tipartdsc, "")), 438, Gx_line+52, 647, Gx_line+77, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+109) ;
            h5PS0( false, 183) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Numero albaran:", ""), 22, Gx_line+19, 120, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), 146, Gx_line+9, 439, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha Recepcion:", ""), 22, Gx_line+55, 120, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 146, Gx_line+46, 260, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista:", ""), 22, Gx_line+91, 101, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 146, Gx_line+81, 585, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tejedor:", ""), 22, Gx_line+126, 70, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 146, Gx_line+117, 585, Gx_line+152, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones:", ""), 22, Gx_line+167, 109, Gx_line+185, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 774, Gx_line+183, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+183) ;
            /* Using cursor P05PS3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1300AlbRObs = P05PS3_A1300AlbRObs[0] ;
               A1299AlbRLin = P05PS3_A1299AlbRLin[0] ;
               h5PS0( false, 28) ;
               getPrinter().GxAttris("Calibri", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 61, Gx_line+4, 687, Gx_line+29, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5PS0( true, 0) ;
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
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV8Clasdsc = "" ;
      AV11Tipartdsc = " " ;
      /* Using cursor P05PS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV12clicod), AV13artcod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A829TipArtCod = P05PS4_A829TipArtCod[0] ;
         A4295ClasCod = P05PS4_A4295ClasCod[0] ;
         n4295ClasCod = P05PS4_n4295ClasCod[0] ;
         A65ArtCod = P05PS4_A65ArtCod[0] ;
         A252CliCod = P05PS4_A252CliCod[0] ;
         A4296ClasDsc = P05PS4_A4296ClasDsc[0] ;
         n4296ClasDsc = P05PS4_n4296ClasDsc[0] ;
         A830TipArtDsc = P05PS4_A830TipArtDsc[0] ;
         n830TipArtDsc = P05PS4_n830TipArtDsc[0] ;
         A830TipArtDsc = P05PS4_A830TipArtDsc[0] ;
         n830TipArtDsc = P05PS4_n830TipArtDsc[0] ;
         A4296ClasDsc = P05PS4_A4296ClasDsc[0] ;
         n4296ClasDsc = P05PS4_n4296ClasDsc[0] ;
         AV8Clasdsc = A4296ClasDsc ;
         AV11Tipartdsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h5PS0( boolean bFoot ,
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

   protected void cleanup( )
   {
      this.aP0[0] = pprc178.this.A396EmprCod;
      this.aP1[0] = pprc178.this.A44AlbRecCod;
      this.aP2[0] = pprc178.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05PS2_A840TrnCod = new short[1] ;
      P05PS2_n840TrnCod = new boolean[] {false} ;
      P05PS2_A970ProceCod = new short[1] ;
      P05PS2_n970ProceCod = new boolean[] {false} ;
      P05PS2_A1211TipEntCod = new short[1] ;
      P05PS2_n1211TipEntCod = new boolean[] {false} ;
      P05PS2_A396EmprCod = new String[] {""} ;
      P05PS2_A44AlbRecCod = new int[1] ;
      P05PS2_A252CliCod = new int[1] ;
      P05PS2_A45AlbRef = new String[] {""} ;
      P05PS2_A52AlbRPieEnt = new int[1] ;
      P05PS2_A56AlbRUni = new String[] {""} ;
      P05PS2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PS2_A8029AlbNumM = new String[] {""} ;
      P05PS2_A6181AlbrPieC = new int[1] ;
      P05PS2_A2748CliAlias = new String[] {""} ;
      P05PS2_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PS2_n13243AlbRRTrans = new boolean[] {false} ;
      P05PS2_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PS2_n13242AlbRRLong = new boolean[] {false} ;
      P05PS2_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PS2_n13241AlbRPh = new boolean[] {false} ;
      P05PS2_A1212TipEntNom = new String[] {""} ;
      P05PS2_n1212TipEntNom = new boolean[] {false} ;
      P05PS2_A4921AlbRAnc = new short[1] ;
      P05PS2_A4920AlbRGrm2 = new short[1] ;
      P05PS2_A971ProceNom = new String[] {""} ;
      P05PS2_n971ProceNom = new boolean[] {false} ;
      P05PS2_A841TrnNom = new String[] {""} ;
      P05PS2_n841TrnNom = new boolean[] {false} ;
      P05PS2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P05PS2_A5806AlbREnt2 = new String[] {""} ;
      A45AlbRef = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A8029AlbNumM = "" ;
      A2748CliAlias = "" ;
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      A13242AlbRRLong = DecimalUtil.ZERO ;
      A13241AlbRPh = DecimalUtil.ZERO ;
      A1212TipEntNom = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A5806AlbREnt2 = "" ;
      AV13artcod = "" ;
      AV9albreccod = "" ;
      AV10Unidadestxt = "" ;
      AV8Clasdsc = "" ;
      AV11Tipartdsc = "" ;
      P05PS3_A396EmprCod = new String[] {""} ;
      P05PS3_A44AlbRecCod = new int[1] ;
      P05PS3_A1300AlbRObs = new String[] {""} ;
      P05PS3_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      P05PS4_A829TipArtCod = new short[1] ;
      P05PS4_A4295ClasCod = new short[1] ;
      P05PS4_n4295ClasCod = new boolean[] {false} ;
      P05PS4_A396EmprCod = new String[] {""} ;
      P05PS4_A65ArtCod = new String[] {""} ;
      P05PS4_A252CliCod = new int[1] ;
      P05PS4_A4296ClasDsc = new String[] {""} ;
      P05PS4_n4296ClasDsc = new boolean[] {false} ;
      P05PS4_A830TipArtDsc = new String[] {""} ;
      P05PS4_n830TipArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A4296ClasDsc = "" ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc178__default(),
         new Object[] {
             new Object[] {
            P05PS2_A840TrnCod, P05PS2_n840TrnCod, P05PS2_A970ProceCod, P05PS2_n970ProceCod, P05PS2_A1211TipEntCod, P05PS2_n1211TipEntCod, P05PS2_A396EmprCod, P05PS2_A44AlbRecCod, P05PS2_A252CliCod, P05PS2_A45AlbRef,
            P05PS2_A52AlbRPieEnt, P05PS2_A56AlbRUni, P05PS2_A58AlbRUniEnt, P05PS2_A8029AlbNumM, P05PS2_A6181AlbrPieC, P05PS2_A2748CliAlias, P05PS2_A13243AlbRRTrans, P05PS2_n13243AlbRRTrans, P05PS2_A13242AlbRRLong, P05PS2_n13242AlbRRLong,
            P05PS2_A13241AlbRPh, P05PS2_n13241AlbRPh, P05PS2_A1212TipEntNom, P05PS2_n1212TipEntNom, P05PS2_A4921AlbRAnc, P05PS2_A4920AlbRGrm2, P05PS2_A971ProceNom, P05PS2_n971ProceNom, P05PS2_A841TrnNom, P05PS2_n841TrnNom,
            P05PS2_A49AlbRFen, P05PS2_A5806AlbREnt2
            }
            , new Object[] {
            P05PS3_A396EmprCod, P05PS3_A44AlbRecCod, P05PS3_A1300AlbRObs, P05PS3_A1299AlbRLin
            }
            , new Object[] {
            P05PS4_A829TipArtCod, P05PS4_A4295ClasCod, P05PS4_n4295ClasCod, P05PS4_A396EmprCod, P05PS4_A65ArtCod, P05PS4_A252CliCod, P05PS4_A4296ClasDsc, P05PS4_n4296ClasDsc, P05PS4_A830TipArtDsc, P05PS4_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A1299AlbRLin ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short A4921AlbRAnc ;
   private short A4920AlbRGrm2 ;
   private short A829TipArtCod ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A6181AlbrPieC ;
   private int AV12clicod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A13243AlbRRTrans ;
   private java.math.BigDecimal A13242AlbRRLong ;
   private java.math.BigDecimal A13241AlbRPh ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A45AlbRef ;
   private String A56AlbRUni ;
   private String A8029AlbNumM ;
   private String A2748CliAlias ;
   private String A1212TipEntNom ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A5806AlbREnt2 ;
   private String AV13artcod ;
   private String AV9albreccod ;
   private String AV10Unidadestxt ;
   private String AV8Clasdsc ;
   private String AV11Tipartdsc ;
   private String A1300AlbRObs ;
   private String A65ArtCod ;
   private String A4296ClasDsc ;
   private String A830TipArtDsc ;
   private java.util.Date A49AlbRFen ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n13243AlbRRTrans ;
   private boolean n13242AlbRRLong ;
   private boolean n13241AlbRPh ;
   private boolean n1212TipEntNom ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n830TipArtDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P05PS2_A840TrnCod ;
   private boolean[] P05PS2_n840TrnCod ;
   private short[] P05PS2_A970ProceCod ;
   private boolean[] P05PS2_n970ProceCod ;
   private short[] P05PS2_A1211TipEntCod ;
   private boolean[] P05PS2_n1211TipEntCod ;
   private String[] P05PS2_A396EmprCod ;
   private int[] P05PS2_A44AlbRecCod ;
   private int[] P05PS2_A252CliCod ;
   private String[] P05PS2_A45AlbRef ;
   private int[] P05PS2_A52AlbRPieEnt ;
   private String[] P05PS2_A56AlbRUni ;
   private java.math.BigDecimal[] P05PS2_A58AlbRUniEnt ;
   private String[] P05PS2_A8029AlbNumM ;
   private int[] P05PS2_A6181AlbrPieC ;
   private String[] P05PS2_A2748CliAlias ;
   private java.math.BigDecimal[] P05PS2_A13243AlbRRTrans ;
   private boolean[] P05PS2_n13243AlbRRTrans ;
   private java.math.BigDecimal[] P05PS2_A13242AlbRRLong ;
   private boolean[] P05PS2_n13242AlbRRLong ;
   private java.math.BigDecimal[] P05PS2_A13241AlbRPh ;
   private boolean[] P05PS2_n13241AlbRPh ;
   private String[] P05PS2_A1212TipEntNom ;
   private boolean[] P05PS2_n1212TipEntNom ;
   private short[] P05PS2_A4921AlbRAnc ;
   private short[] P05PS2_A4920AlbRGrm2 ;
   private String[] P05PS2_A971ProceNom ;
   private boolean[] P05PS2_n971ProceNom ;
   private String[] P05PS2_A841TrnNom ;
   private boolean[] P05PS2_n841TrnNom ;
   private java.util.Date[] P05PS2_A49AlbRFen ;
   private String[] P05PS2_A5806AlbREnt2 ;
   private String[] P05PS3_A396EmprCod ;
   private int[] P05PS3_A44AlbRecCod ;
   private String[] P05PS3_A1300AlbRObs ;
   private byte[] P05PS3_A1299AlbRLin ;
   private short[] P05PS4_A829TipArtCod ;
   private short[] P05PS4_A4295ClasCod ;
   private boolean[] P05PS4_n4295ClasCod ;
   private String[] P05PS4_A396EmprCod ;
   private String[] P05PS4_A65ArtCod ;
   private int[] P05PS4_A252CliCod ;
   private String[] P05PS4_A4296ClasDsc ;
   private boolean[] P05PS4_n4296ClasDsc ;
   private String[] P05PS4_A830TipArtDsc ;
   private boolean[] P05PS4_n830TipArtDsc ;
}

final  class pprc178__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PS2", "SELECT T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.EmprCod, T1.AlbRecCod, T1.CliCod, T1.AlbRef, T1.AlbRPieEnt, T1.AlbRUni, T1.AlbRUniEnt, T1.AlbNumM, T1.AlbrPieC, T2.CliAlias, T1.AlbRRTrans, T1.AlbRRLong, T1.AlbRPh, T5.TipEntNom, T1.AlbRAnc, T1.AlbRGrm2, T4.ProceNom, T3.TrnNom, T1.AlbRFen, T1.AlbREnt2 FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05PS3", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05PS4", "SELECT T1.TipArtCod, T1.ClasCod, T1.EmprCod, T1.ArtCod, T1.CliCod, T3.ClasDsc, T2.TipArtDsc FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T1.ClasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 10);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 25);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(18);
               ((short[]) buf[25])[0] = rslt.getShort(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(22);
               ((String[]) buf[31])[0] = rslt.getString(23, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

