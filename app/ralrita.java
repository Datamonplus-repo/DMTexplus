package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralrita extends GXReport
{
   public ralrita( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralrita.class ), "" );
   }

   public ralrita( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      ralrita.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      ralrita.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ralrita.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Albaran de Recep. (Italcolore)") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GxHdr2 = true ;
         /* Using cursor P076E2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P076E2_A407EmprNom[0] ;
            n407EmprNom = P076E2_n407EmprNom[0] ;
            A60AlbRUniUti = P076E2_A60AlbRUniUti[0] ;
            A841TrnNom = P076E2_A841TrnNom[0] ;
            n841TrnNom = P076E2_n841TrnNom[0] ;
            A56AlbRUni = P076E2_A56AlbRUni[0] ;
            A971ProceNom = P076E2_A971ProceNom[0] ;
            n971ProceNom = P076E2_n971ProceNom[0] ;
            A279CliNom = P076E2_A279CliNom[0] ;
            A52AlbRPieEnt = P076E2_A52AlbRPieEnt[0] ;
            A840TrnCod = P076E2_A840TrnCod[0] ;
            n840TrnCod = P076E2_n840TrnCod[0] ;
            A970ProceCod = P076E2_A970ProceCod[0] ;
            n970ProceCod = P076E2_n970ProceCod[0] ;
            A252CliCod = P076E2_A252CliCod[0] ;
            A58AlbRUniEnt = P076E2_A58AlbRUniEnt[0] ;
            A55AlbRReo = P076E2_A55AlbRReo[0] ;
            A54AlbRPieUti = P076E2_A54AlbRPieUti[0] ;
            A50AlbRLoc = P076E2_A50AlbRLoc[0] ;
            A49AlbRFen = P076E2_A49AlbRFen[0] ;
            A48AlbRFecUlt = P076E2_A48AlbRFecUlt[0] ;
            A47AlbREst = P076E2_A47AlbREst[0] ;
            A46AlbREnt = P076E2_A46AlbREnt[0] ;
            A45AlbRef = P076E2_A45AlbRef[0] ;
            A1291AlbRDes = P076E2_A1291AlbRDes[0] ;
            A407EmprNom = P076E2_A407EmprNom[0] ;
            n407EmprNom = P076E2_n407EmprNom[0] ;
            A279CliNom = P076E2_A279CliNom[0] ;
            A841TrnNom = P076E2_A841TrnNom[0] ;
            n841TrnNom = P076E2_n841TrnNom[0] ;
            A971ProceNom = P076E2_A971ProceNom[0] ;
            n971ProceNom = P076E2_n971ProceNom[0] ;
            GxHdr4 = true ;
            /* Using cursor P076E3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1300AlbRObs = P076E3_A1300AlbRObs[0] ;
               A1299AlbRLin = P076E3_A1299AlbRLin[0] ;
               h76E0( false, 16) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 199, Gx_line+0, 638, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GxHdr4 = false ;
            /* Using cursor P076E4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               brk76E7 = false ;
               A2158AlbRecMtrU = P076E4_A2158AlbRecMtrU[0] ;
               A2157AlbRecMtr = P076E4_A2157AlbRecMtr[0] ;
               A2156AlbRecKgmU = P076E4_A2156AlbRecKgmU[0] ;
               A2155AlbRecKgm = P076E4_A2155AlbRecKgm[0] ;
               A2154AlbRecAnh = P076E4_A2154AlbRecAnh[0] ;
               A2159AlbRecPie = P076E4_A2159AlbRecPie[0] ;
               A6615AlbRecPar = P076E4_A6615AlbRecPar[0] ;
               n6615AlbRecPar = P076E4_n6615AlbRecPar[0] ;
               A6616AlbRecCue = P076E4_A6616AlbRecCue[0] ;
               n6616AlbRecCue = P076E4_n6616AlbRecCue[0] ;
               h76E0( false, 27) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PIEZA", ""), 22, Gx_line+0, 61, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 100, Gx_line+0, 139, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 250, Gx_line+0, 303, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 335, Gx_line+0, 393, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "KILOS:", ""), 173, Gx_line+0, 216, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "METROS:", ""), 417, Gx_line+0, 476, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 511, Gx_line+0, 564, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 595, Gx_line+0, 653, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+20, 815, Gx_line+20, 3, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Partida", ""), 676, Gx_line+0, 719, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cuerda", ""), 743, Gx_line+0, 786, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
               AV11AlbRecParK = DecimalUtil.doubleToDec(0) ;
               AV8AlbRecParM = DecimalUtil.doubleToDec(0) ;
               while ( (pr_default.getStatus(2) != 101) && ( P076E4_A6615AlbRecPar[0] == A6615AlbRecPar ) )
               {
                  brk76E7 = false ;
                  A2158AlbRecMtrU = P076E4_A2158AlbRecMtrU[0] ;
                  A2157AlbRecMtr = P076E4_A2157AlbRecMtr[0] ;
                  A2156AlbRecKgmU = P076E4_A2156AlbRecKgmU[0] ;
                  A2155AlbRecKgm = P076E4_A2155AlbRecKgm[0] ;
                  A2154AlbRecAnh = P076E4_A2154AlbRecAnh[0] ;
                  A2159AlbRecPie = P076E4_A2159AlbRecPie[0] ;
                  A6616AlbRecCue = P076E4_A6616AlbRecCue[0] ;
                  n6616AlbRecCue = P076E4_n6616AlbRecCue[0] ;
                  if ( GXutil.strcmp(P076E4_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P076E4_A44AlbRecCod[0] == A44AlbRecCod )
                     {
                        AV10AlbRecCueK = DecimalUtil.doubleToDec(0) ;
                        AV9AlbRecCueM = DecimalUtil.doubleToDec(0) ;
                        while ( (pr_default.getStatus(2) != 101) && ( P076E4_A6615AlbRecPar[0] == A6615AlbRecPar ) && ( P076E4_A6616AlbRecCue[0] == A6616AlbRecCue ) )
                        {
                           brk76E7 = false ;
                           A2158AlbRecMtrU = P076E4_A2158AlbRecMtrU[0] ;
                           A2157AlbRecMtr = P076E4_A2157AlbRecMtr[0] ;
                           A2156AlbRecKgmU = P076E4_A2156AlbRecKgmU[0] ;
                           A2155AlbRecKgm = P076E4_A2155AlbRecKgm[0] ;
                           A2154AlbRecAnh = P076E4_A2154AlbRecAnh[0] ;
                           A2159AlbRecPie = P076E4_A2159AlbRecPie[0] ;
                           if ( GXutil.strcmp(P076E4_A396EmprCod[0], A396EmprCod) == 0 )
                           {
                              if ( P076E4_A44AlbRecCod[0] == A44AlbRecCod )
                              {
                                 h76E0( false, 16) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")), 117, Gx_line+0, 140, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 238, Gx_line+0, 305, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")), 328, Gx_line+0, 395, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 499, Gx_line+0, 566, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")), 588, Gx_line+0, 655, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), 22, Gx_line+0, 89, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6616AlbRecCue), "ZZZ9")), 756, Gx_line+0, 786, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6615AlbRecPar), "ZZZ9")), 690, Gx_line+0, 720, Gx_line+17, 2+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+16) ;
                                 AV10AlbRecCueK = AV10AlbRecCueK.add(A2155AlbRecKgm) ;
                                 AV9AlbRecCueM = AV9AlbRecCueM.add(A2157AlbRecMtr) ;
                                 AV11AlbRecParK = AV11AlbRecParK.add(A2155AlbRecKgm) ;
                                 AV8AlbRecParM = AV8AlbRecParM.add(A2157AlbRecMtr) ;
                              }
                           }
                           brk76E7 = true ;
                           pr_default.readNext(2);
                        }
                        h76E0( false, 28) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6616AlbRecCue), "ZZZ9")), 186, Gx_line+7, 216, Gx_line+22, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Total Cuerda", ""), 100, Gx_line+7, 177, Gx_line+21, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10AlbRecCueK, "ZZZZZZ9.99")), 230, Gx_line+6, 304, Gx_line+23, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9AlbRecCueM, "ZZZZZZ9.99")), 492, Gx_line+6, 566, Gx_line+23, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(0, Gx_line+0, 815, Gx_line+0, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+28) ;
                     }
                  }
                  if ( ! brk76E7 )
                  {
                     brk76E7 = true ;
                     pr_default.readNext(2);
                  }
               }
               h76E0( false, 27) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Partida", ""), 100, Gx_line+1, 177, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11AlbRecParK, "ZZZZZZ9.99")), 230, Gx_line+0, 304, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV8AlbRecParM, "ZZZZZZ9.99")), 492, Gx_line+0, 566, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6615AlbRecPar), "ZZZ9")), 186, Gx_line+1, 216, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+22, 815, Gx_line+22, 3, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
               if ( ! brk76E7 )
               {
                  brk76E7 = true ;
                  pr_default.readNext(2);
               }
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h76E0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h76E0( boolean bFoot ,
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
               if ( GxHdr4 )
               {
                  getPrinter().GxDrawLine(0, Gx_line+7, 815, Gx_line+7, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
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
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 396, Gx_line+173, 543, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 192, Gx_line+64, 251, Gx_line+81, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 192, Gx_line+95, 310, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 454, Gx_line+64, 513, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47AlbREst), "9")), 544, Gx_line+250, 552, Gx_line+267, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A48AlbRFecUlt, "99/99/99"), 449, Gx_line+266, 508, Gx_line+283, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 449, Gx_line+250, 508, Gx_line+267, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 192, Gx_line+173, 266, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 379, Gx_line+266, 424, Gx_line+283, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")), 644, Gx_line+173, 660, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 265, Gx_line+250, 332, Gx_line+267, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 396, Gx_line+95, 441, Gx_line+112, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 192, Gx_line+146, 222, Gx_line+163, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 192, Gx_line+126, 222, Gx_line+143, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Destino :", ""), 323, Gx_line+174, 377, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N.Recepcion   :", ""), 75, Gx_line+65, 170, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referencia    :", ""), 75, Gx_line+96, 161, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Albaran Entrega :", ""), 323, Gx_line+65, 427, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 529, Gx_line+219, 571, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha  :", ""), 578, Gx_line+65, 628, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Localización  :", ""), 75, Gx_line+174, 162, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PIEZAS", ""), 376, Gx_line+219, 423, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 379, Gx_line+250, 424, Gx_line+267, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Reoperado :", ""), 556, Gx_line+174, 630, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Transportista :", ""), 75, Gx_line+127, 161, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente :", ""), 323, Gx_line+96, 373, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Procedencia   :", ""), 75, Gx_line+147, 167, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrado   :", ""), 163, Gx_line+252, 227, Gx_line+266, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 461, Gx_line+95, 681, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 644, Gx_line+16, 703, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 644, Gx_line+0, 703, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha : ", ""), 578, Gx_line+0, 628, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora  :", ""), 578, Gx_line+16, 620, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ALBARAN DE RECEPCION", ""), 316, Gx_line+16, 476, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 243, Gx_line+146, 463, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Utilizado :", ""), 163, Gx_line+268, 223, Gx_line+282, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CANTIDAD", ""), 264, Gx_line+219, 331, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 345, Gx_line+250, 353, Gx_line+267, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 243, Gx_line+126, 463, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 265, Gx_line+266, 332, Gx_line+283, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA", ""), 449, Gx_line+219, 492, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 651, Gx_line+64, 710, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 68, Gx_line+0, 288, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(316, Gx_line+34, 476, Gx_line+34, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(265, Gx_line+238, 331, Gx_line+238, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(449, Gx_line+238, 507, Gx_line+238, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(376, Gx_line+238, 423, Gx_line+238, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(529, Gx_line+238, 575, Gx_line+238, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(75, Gx_line+202, 727, Gx_line+300, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+313) ;
            }
            if ( GxHdr4 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 73, Gx_line+0, 170, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
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

   protected void cleanup( )
   {
      this.aP0[0] = ralrita.this.A396EmprCod;
      this.aP1[0] = ralrita.this.A44AlbRecCod;
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
      P076E2_A396EmprCod = new String[] {""} ;
      P076E2_A44AlbRecCod = new int[1] ;
      P076E2_A407EmprNom = new String[] {""} ;
      P076E2_n407EmprNom = new boolean[] {false} ;
      P076E2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076E2_A841TrnNom = new String[] {""} ;
      P076E2_n841TrnNom = new boolean[] {false} ;
      P076E2_A56AlbRUni = new String[] {""} ;
      P076E2_A971ProceNom = new String[] {""} ;
      P076E2_n971ProceNom = new boolean[] {false} ;
      P076E2_A279CliNom = new String[] {""} ;
      P076E2_A52AlbRPieEnt = new int[1] ;
      P076E2_A840TrnCod = new short[1] ;
      P076E2_n840TrnCod = new boolean[] {false} ;
      P076E2_A970ProceCod = new short[1] ;
      P076E2_n970ProceCod = new boolean[] {false} ;
      P076E2_A252CliCod = new int[1] ;
      P076E2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076E2_A55AlbRReo = new String[] {""} ;
      P076E2_A54AlbRPieUti = new int[1] ;
      P076E2_A50AlbRLoc = new String[] {""} ;
      P076E2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P076E2_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P076E2_A47AlbREst = new byte[1] ;
      P076E2_A46AlbREnt = new String[] {""} ;
      P076E2_A45AlbRef = new String[] {""} ;
      P076E2_A1291AlbRDes = new String[] {""} ;
      A407EmprNom = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A841TrnNom = "" ;
      A56AlbRUni = "" ;
      A971ProceNom = "" ;
      A279CliNom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
      A50AlbRLoc = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A1291AlbRDes = "" ;
      P076E3_A396EmprCod = new String[] {""} ;
      P076E3_A44AlbRecCod = new int[1] ;
      P076E3_A1300AlbRObs = new String[] {""} ;
      P076E3_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      P076E4_A396EmprCod = new String[] {""} ;
      P076E4_A44AlbRecCod = new int[1] ;
      P076E4_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076E4_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076E4_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076E4_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076E4_A2154AlbRecAnh = new short[1] ;
      P076E4_A2159AlbRecPie = new String[] {""} ;
      P076E4_A6615AlbRecPar = new short[1] ;
      P076E4_n6615AlbRecPar = new boolean[] {false} ;
      P076E4_A6616AlbRecCue = new short[1] ;
      P076E4_n6616AlbRecCue = new boolean[] {false} ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      AV11AlbRecParK = DecimalUtil.ZERO ;
      AV8AlbRecParM = DecimalUtil.ZERO ;
      AV10AlbRecCueK = DecimalUtil.ZERO ;
      AV9AlbRecCueM = DecimalUtil.ZERO ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralrita__default(),
         new Object[] {
             new Object[] {
            P076E2_A396EmprCod, P076E2_A44AlbRecCod, P076E2_A407EmprNom, P076E2_n407EmprNom, P076E2_A60AlbRUniUti, P076E2_A841TrnNom, P076E2_n841TrnNom, P076E2_A56AlbRUni, P076E2_A971ProceNom, P076E2_n971ProceNom,
            P076E2_A279CliNom, P076E2_A52AlbRPieEnt, P076E2_A840TrnCod, P076E2_n840TrnCod, P076E2_A970ProceCod, P076E2_n970ProceCod, P076E2_A252CliCod, P076E2_A58AlbRUniEnt, P076E2_A55AlbRReo, P076E2_A54AlbRPieUti,
            P076E2_A50AlbRLoc, P076E2_A49AlbRFen, P076E2_A48AlbRFecUlt, P076E2_A47AlbREst, P076E2_A46AlbREnt, P076E2_A45AlbRef, P076E2_A1291AlbRDes
            }
            , new Object[] {
            P076E3_A396EmprCod, P076E3_A44AlbRecCod, P076E3_A1300AlbRObs, P076E3_A1299AlbRLin
            }
            , new Object[] {
            P076E4_A396EmprCod, P076E4_A44AlbRecCod, P076E4_A2158AlbRecMtrU, P076E4_A2157AlbRecMtr, P076E4_A2156AlbRecKgmU, P076E4_A2155AlbRecKgm, P076E4_A2154AlbRecAnh, P076E4_A2159AlbRecPie, P076E4_A6615AlbRecPar, P076E4_n6615AlbRecPar,
            P076E4_A6616AlbRecCue, P076E4_n6616AlbRecCue
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private byte A1299AlbRLin ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A2154AlbRecAnh ;
   private short A6615AlbRecPar ;
   private short A6616AlbRecCue ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A52AlbRPieEnt ;
   private int A252CliCod ;
   private int A54AlbRPieUti ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal AV11AlbRecParK ;
   private java.math.BigDecimal AV8AlbRecParM ;
   private java.math.BigDecimal AV10AlbRecCueK ;
   private java.math.BigDecimal AV9AlbRecCueM ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A56AlbRUni ;
   private String A971ProceNom ;
   private String A279CliNom ;
   private String A55AlbRReo ;
   private String A50AlbRLoc ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A1291AlbRDes ;
   private String A1300AlbRObs ;
   private String A2159AlbRecPie ;
   private String Gx_time ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date Gx_date ;
   private boolean GxHdr2 ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean GxHdr4 ;
   private boolean brk76E7 ;
   private boolean n6615AlbRecPar ;
   private boolean n6616AlbRecCue ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P076E2_A396EmprCod ;
   private int[] P076E2_A44AlbRecCod ;
   private String[] P076E2_A407EmprNom ;
   private boolean[] P076E2_n407EmprNom ;
   private java.math.BigDecimal[] P076E2_A60AlbRUniUti ;
   private String[] P076E2_A841TrnNom ;
   private boolean[] P076E2_n841TrnNom ;
   private String[] P076E2_A56AlbRUni ;
   private String[] P076E2_A971ProceNom ;
   private boolean[] P076E2_n971ProceNom ;
   private String[] P076E2_A279CliNom ;
   private int[] P076E2_A52AlbRPieEnt ;
   private short[] P076E2_A840TrnCod ;
   private boolean[] P076E2_n840TrnCod ;
   private short[] P076E2_A970ProceCod ;
   private boolean[] P076E2_n970ProceCod ;
   private int[] P076E2_A252CliCod ;
   private java.math.BigDecimal[] P076E2_A58AlbRUniEnt ;
   private String[] P076E2_A55AlbRReo ;
   private int[] P076E2_A54AlbRPieUti ;
   private String[] P076E2_A50AlbRLoc ;
   private java.util.Date[] P076E2_A49AlbRFen ;
   private java.util.Date[] P076E2_A48AlbRFecUlt ;
   private byte[] P076E2_A47AlbREst ;
   private String[] P076E2_A46AlbREnt ;
   private String[] P076E2_A45AlbRef ;
   private String[] P076E2_A1291AlbRDes ;
   private String[] P076E3_A396EmprCod ;
   private int[] P076E3_A44AlbRecCod ;
   private String[] P076E3_A1300AlbRObs ;
   private byte[] P076E3_A1299AlbRLin ;
   private String[] P076E4_A396EmprCod ;
   private int[] P076E4_A44AlbRecCod ;
   private java.math.BigDecimal[] P076E4_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P076E4_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P076E4_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P076E4_A2155AlbRecKgm ;
   private short[] P076E4_A2154AlbRecAnh ;
   private String[] P076E4_A2159AlbRecPie ;
   private short[] P076E4_A6615AlbRecPar ;
   private boolean[] P076E4_n6615AlbRecPar ;
   private short[] P076E4_A6616AlbRecCue ;
   private boolean[] P076E4_n6616AlbRecCue ;
}

final  class ralrita__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P076E2", "SELECT T1.EmprCod, T1.AlbRecCod, T2.EmprNom, T1.AlbRUniUti, T4.TrnNom, T1.AlbRUni, T5.ProceNom, T3.CliNom, T1.AlbRPieEnt, T1.TrnCod, T1.ProceCod, T1.CliCod, T1.AlbRUniEnt, T1.AlbRReo, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRFen, T1.AlbRFecUlt, T1.AlbREst, T1.AlbREnt, T1.AlbRef, T1.AlbRDes FROM ((((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P076E3", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P076E4", "SELECT EmprCod, AlbRecCod, AlbRecMtrU, AlbRecMtr, AlbRecKgmU, AlbRecKgm, AlbRecAnh, AlbRecPie, AlbRecPar, AlbRecCue FROM TXPALBDET WHERE (EmprCod = ?) AND (AlbRecCod = ?) ORDER BY AlbRecPar, AlbRecCue, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[18])[0] = rslt.getString(14, 2);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((String[]) buf[20])[0] = rslt.getString(16, 10);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(18);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((String[]) buf[24])[0] = rslt.getString(20, 8);
               ((String[]) buf[25])[0] = rslt.getString(21, 16);
               ((String[]) buf[26])[0] = rslt.getString(22, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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

