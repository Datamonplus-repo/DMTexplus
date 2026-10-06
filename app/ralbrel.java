package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralbrel extends GXReport
{
   public ralbrel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralbrel.class ), "" );
   }

   public ralbrel( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      ralbrel.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      ralbrel.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ralbrel.this.AV8AlbRecIni = aP1[0];
      this.aP1 = aP1;
      ralbrel.this.AV9AlbRecFin = aP2[0];
      this.aP2 = aP2;
      ralbrel.this.Gx_out = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
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
         getPrinter().GxSetDocName("Albarán de Entrada") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P06QF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8AlbRecIni), Integer.valueOf(AV9AlbRecFin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A44AlbRecCod = P06QF2_A44AlbRecCod[0] ;
            A52AlbRPieEnt = P06QF2_A52AlbRPieEnt[0] ;
            A4290AlbPmPPza = P06QF2_A4290AlbPmPPza[0] ;
            A58AlbRUniEnt = P06QF2_A58AlbRUniEnt[0] ;
            if ( A4290AlbPmPPza.doubleValue() > 0 )
            {
               A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
            }
            else
            {
               A4291AlbPzaEst = 0 ;
            }
            AV10AlbRUniEnt = AV10AlbRUniEnt.add(A58AlbRUniEnt) ;
            AV12AlbRPieEnt = (int)(AV12AlbRPieEnt+A52AlbRPieEnt) ;
            AV11AlbPzaEst = (int)(AV11AlbPzaEst+A4291AlbPzaEst) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06QF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8AlbRecIni), Integer.valueOf(AV9AlbRecFin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6QF3 = false ;
            A52AlbRPieEnt = P06QF3_A52AlbRPieEnt[0] ;
            A58AlbRUniEnt = P06QF3_A58AlbRUniEnt[0] ;
            A4601AlbRTam = P06QF3_A4601AlbRTam[0] ;
            A44AlbRecCod = P06QF3_A44AlbRecCod[0] ;
            A55AlbRReo = P06QF3_A55AlbRReo[0] ;
            A4602AlbRMdlCod = P06QF3_A4602AlbRMdlCod[0] ;
            A407EmprNom = P06QF3_A407EmprNom[0] ;
            n407EmprNom = P06QF3_n407EmprNom[0] ;
            A279CliNom = P06QF3_A279CliNom[0] ;
            A252CliCod = P06QF3_A252CliCod[0] ;
            A1212TipEntNom = P06QF3_A1212TipEntNom[0] ;
            n1212TipEntNom = P06QF3_n1212TipEntNom[0] ;
            A1211TipEntCod = P06QF3_A1211TipEntCod[0] ;
            n1211TipEntCod = P06QF3_n1211TipEntCod[0] ;
            A49AlbRFen = P06QF3_A49AlbRFen[0] ;
            A46AlbREnt = P06QF3_A46AlbREnt[0] ;
            A3613AlbRefDsc = P06QF3_A3613AlbRefDsc[0] ;
            A45AlbRef = P06QF3_A45AlbRef[0] ;
            A1291AlbRDes = P06QF3_A1291AlbRDes[0] ;
            A4603AlbRMdlDsc = P06QF3_A4603AlbRMdlDsc[0] ;
            n4603AlbRMdlDsc = P06QF3_n4603AlbRMdlDsc[0] ;
            A407EmprNom = P06QF3_A407EmprNom[0] ;
            n407EmprNom = P06QF3_n407EmprNom[0] ;
            A279CliNom = P06QF3_A279CliNom[0] ;
            A1212TipEntNom = P06QF3_A1212TipEntNom[0] ;
            n1212TipEntNom = P06QF3_n1212TipEntNom[0] ;
            A4603AlbRMdlDsc = P06QF3_A4603AlbRMdlDsc[0] ;
            n4603AlbRMdlDsc = P06QF3_n4603AlbRMdlDsc[0] ;
            if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 )
            {
               h6QF0( false, 27) ;
               getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Defeito", ""), 372, Gx_line+7, 420, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 556, Gx_line+7, 592, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 680, Gx_line+7, 711, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("%", 750, Gx_line+7, 766, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+0, 547, Gx_line+28, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(626, Gx_line+0, 626, Gx_line+28, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(728, Gx_line+0, 728, Gx_line+28, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
            }
            h6QF0( false, 27) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+28, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+28, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+26, 787, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ficha Nº", ""), 41, Gx_line+7, 92, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tamanho", ""), 119, Gx_line+7, 178, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Peças", ""), 203, Gx_line+7, 258, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 306, Gx_line+7, 337, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(108, Gx_line+0, 108, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(274, Gx_line+0, 274, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(195, Gx_line+0, 195, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(353, Gx_line+0, 353, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+26, 787, Gx_line+26, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06QF3_A396EmprCod[0], A396EmprCod) == 0 ) )
            {
               brk6QF3 = false ;
               A52AlbRPieEnt = P06QF3_A52AlbRPieEnt[0] ;
               A58AlbRUniEnt = P06QF3_A58AlbRUniEnt[0] ;
               A4601AlbRTam = P06QF3_A4601AlbRTam[0] ;
               A44AlbRecCod = P06QF3_A44AlbRecCod[0] ;
               if ( A44AlbRecCod <= AV9AlbRecFin )
               {
                  if ( A44AlbRecCod >= AV8AlbRecIni )
                  {
                     AV15QuantEnt = A52AlbRPieEnt ;
                     h6QF0( false, 17) ;
                     getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 32, Gx_line+0, 91, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4601AlbRTam, "")), 127, Gx_line+0, 178, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 281, Gx_line+0, 348, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15QuantEnt), "ZZZZZ9")), 200, Gx_line+0, 258, Gx_line+15, 2, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                     AV22GXLvl22 = (byte)(0) ;
                     /* Using cursor P06QF4 */
                     pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                     while ( (pr_default.getStatus(2) != 101) )
                     {
                        A4596AlbRDefCod = P06QF4_A4596AlbRDefCod[0] ;
                        A4600AlbRDefUni = P06QF4_A4600AlbRDefUni[0] ;
                        n4600AlbRDefUni = P06QF4_n4600AlbRDefUni[0] ;
                        A4599AlbRDefPza = P06QF4_A4599AlbRDefPza[0] ;
                        n4599AlbRDefPza = P06QF4_n4599AlbRDefPza[0] ;
                        A4598AlbRDefPor = P06QF4_A4598AlbRDefPor[0] ;
                        n4598AlbRDefPor = P06QF4_n4598AlbRDefPor[0] ;
                        A4597AlbRDefDsc = P06QF4_A4597AlbRDefDsc[0] ;
                        n4597AlbRDefDsc = P06QF4_n4597AlbRDefDsc[0] ;
                        A4597AlbRDefDsc = P06QF4_A4597AlbRDefDsc[0] ;
                        n4597AlbRDefDsc = P06QF4_n4597AlbRDefDsc[0] ;
                        AV22GXLvl22 = (byte)(1) ;
                        h6QF0( false, 16) ;
                        getPrinter().GxDrawLine(547, Gx_line+0, 547, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(626, Gx_line+0, 626, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(728, Gx_line+0, 728, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4597AlbRDefDsc, "")), 372, Gx_line+0, 529, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4598AlbRDefPor), "ZZ9")), 746, Gx_line+0, 769, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4599AlbRDefPza), "ZZZZZ9")), 565, Gx_line+0, 610, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4600AlbRDefUni, "ZZZZZ9.99")), 645, Gx_line+0, 712, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 3, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 3, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(108, Gx_line+0, 108, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(195, Gx_line+0, 195, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(353, Gx_line+0, 353, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(274, Gx_line+0, 274, Gx_line+17, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+16) ;
                        pr_default.readNext(2);
                     }
                     pr_default.close(2);
                     if ( AV22GXLvl22 == 0 )
                     {
                        h6QF0( false, 17) ;
                        getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 3, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 3, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(108, Gx_line+0, 108, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(195, Gx_line+0, 195, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(353, Gx_line+0, 353, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(274, Gx_line+0, 274, Gx_line+17, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                  }
               }
               brk6QF3 = true ;
               pr_default.readNext(1);
            }
            h6QF0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 787, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            if ( ! brk6QF3 )
            {
               brk6QF3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GxHdr3 = false ;
         while ( Gx_line <= 738 )
         {
            h6QF0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+1, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+1, 3, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
         }
         AV14Lin = 0 ;
         /* Using cursor P06QF5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8AlbRecIni), Integer.valueOf(AV9AlbRecFin)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A44AlbRecCod = P06QF5_A44AlbRecCod[0] ;
            /* Using cursor P06QF6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1300AlbRObs = P06QF6_A1300AlbRObs[0] ;
               A1299AlbRLin = P06QF6_A1299AlbRLin[0] ;
               AV14Lin = (long)(AV14Lin+1) ;
               AV13AlbRObs[(int)(AV14Lin)-1] = A1300AlbRObs ;
               if ( AV14Lin == 10 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         h6QF0( false, 16) ;
         getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Obs.", ""), 27, Gx_line+0, 56, Gx_line+15, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(14, Gx_line+0, 787, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+16) ;
         /* Noskip command */
         Gx_line = Gx_OldLine ;
         AV14Lin = 0 ;
         while ( ( AV14Lin <= 10 ) && ( Gx_line < 901 ) )
         {
            AV14Lin = (long)(AV14Lin+1) ;
            h6QF0( false, 16) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+17, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 3, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13AlbRObs[(int)(AV14Lin)-1], "")), 81, Gx_line+1, 395, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+16) ;
         }
         while ( Gx_line <= 901 )
         {
            h6QF0( false, 1) ;
            getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+1, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+1, 3, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
         }
         h6QF0( false, 122) ;
         getPrinter().GxDrawLine(15, Gx_line+108, 786, Gx_line+108, 3, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(14, Gx_line+0, 14, Gx_line+108, 3, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "P/A.", ""), 27, Gx_line+0, 57, Gx_line+15, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+108, 3, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(14, Gx_line+0, 787, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+122) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6QF0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6QF0( boolean bFoot ,
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
               if ( GxHdr3 )
               {
                  getPrinter().GxDrawLine(14, Gx_line+0, 787, Gx_line+0, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1) ;
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
            if ( GxHdr3 )
            {
               getPrinter().GxDrawLine(14, Gx_line+82, 787, Gx_line+82, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+123, 787, Gx_line+123, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+191, 787, Gx_line+191, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(609, Gx_line+42, 609, Gx_line+192, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(393, Gx_line+123, 393, Gx_line+192, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(393, Gx_line+164, 611, Gx_line+164, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(501, Gx_line+164, 501, Gx_line+192, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 27, Gx_line+55, 72, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referência", ""), 27, Gx_line+96, 95, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mercadoria Recebida em", ""), 46, Gx_line+136, 201, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso Total", ""), 271, Gx_line+136, 339, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº de Peças Totales", ""), 440, Gx_line+128, 565, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Estimado", ""), 420, Gx_line+146, 479, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia", ""), 542, Gx_line+146, 570, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Doc. Cliente", ""), 651, Gx_line+136, 747, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mod.", ""), 27, Gx_line+199, 60, Gx_line+214, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 623, Gx_line+55, 646, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11AlbPzaEst), "ZZZZZZZ9")), 420, Gx_line+170, 479, Gx_line+186, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 650, Gx_line+55, 755, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 108, Gx_line+96, 192, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 203, Gx_line+96, 339, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 650, Gx_line+164, 751, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 96, Gx_line+164, 151, Gx_line+180, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9")), 106, Gx_line+221, 136, Gx_line+237, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), 149, Gx_line+221, 280, Gx_line+237, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12AlbRPieEnt), "ZZZZZ9")), 542, Gx_line+170, 587, Gx_line+186, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10AlbRUniEnt, "ZZZZZ9.99")), 271, Gx_line+164, 338, Gx_line+180, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 81, Gx_line+55, 126, Gx_line+71, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 135, Gx_line+55, 292, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+41, 14, Gx_line+244, 3, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(785, Gx_line+42, 785, Gx_line+244, 3, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+42, 786, Gx_line+42, 3, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 14, Gx_line+14, 296, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4603AlbRMdlDsc, "")), 149, Gx_line+199, 358, Gx_line+215, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), 68, Gx_line+199, 137, Gx_line+215, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Prod", ""), 27, Gx_line+221, 58, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+243, 787, Gx_line+243, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+244) ;
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
      this.aP0[0] = ralbrel.this.A396EmprCod;
      this.aP1[0] = ralbrel.this.AV8AlbRecIni;
      this.aP2[0] = ralbrel.this.AV9AlbRecFin;
      this.aP3[0] = ralbrel.this.Gx_out;
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
      P06QF2_A396EmprCod = new String[] {""} ;
      P06QF2_A44AlbRecCod = new int[1] ;
      P06QF2_A52AlbRPieEnt = new int[1] ;
      P06QF2_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QF2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV10AlbRUniEnt = DecimalUtil.ZERO ;
      P06QF3_A65ArtCod = new String[] {""} ;
      P06QF3_A4658MdlCod = new String[] {""} ;
      P06QF3_A396EmprCod = new String[] {""} ;
      P06QF3_A52AlbRPieEnt = new int[1] ;
      P06QF3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QF3_A4601AlbRTam = new String[] {""} ;
      P06QF3_A44AlbRecCod = new int[1] ;
      P06QF3_A55AlbRReo = new String[] {""} ;
      P06QF3_A4602AlbRMdlCod = new String[] {""} ;
      P06QF3_A407EmprNom = new String[] {""} ;
      P06QF3_n407EmprNom = new boolean[] {false} ;
      P06QF3_A279CliNom = new String[] {""} ;
      P06QF3_A252CliCod = new int[1] ;
      P06QF3_A1212TipEntNom = new String[] {""} ;
      P06QF3_n1212TipEntNom = new boolean[] {false} ;
      P06QF3_A1211TipEntCod = new short[1] ;
      P06QF3_n1211TipEntCod = new boolean[] {false} ;
      P06QF3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06QF3_A46AlbREnt = new String[] {""} ;
      P06QF3_A3613AlbRefDsc = new String[] {""} ;
      P06QF3_A45AlbRef = new String[] {""} ;
      P06QF3_A1291AlbRDes = new String[] {""} ;
      P06QF3_A4603AlbRMdlDsc = new String[] {""} ;
      P06QF3_n4603AlbRMdlDsc = new boolean[] {false} ;
      A4601AlbRTam = "" ;
      A55AlbRReo = "" ;
      A4602AlbRMdlCod = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A1212TipEntNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A46AlbREnt = "" ;
      A3613AlbRefDsc = "" ;
      A45AlbRef = "" ;
      A1291AlbRDes = "" ;
      A4603AlbRMdlDsc = "" ;
      P06QF4_A4596AlbRDefCod = new short[1] ;
      P06QF4_A396EmprCod = new String[] {""} ;
      P06QF4_A44AlbRecCod = new int[1] ;
      P06QF4_A4600AlbRDefUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QF4_n4600AlbRDefUni = new boolean[] {false} ;
      P06QF4_A4599AlbRDefPza = new int[1] ;
      P06QF4_n4599AlbRDefPza = new boolean[] {false} ;
      P06QF4_A4598AlbRDefPor = new short[1] ;
      P06QF4_n4598AlbRDefPor = new boolean[] {false} ;
      P06QF4_A4597AlbRDefDsc = new String[] {""} ;
      P06QF4_n4597AlbRDefDsc = new boolean[] {false} ;
      A4600AlbRDefUni = DecimalUtil.ZERO ;
      A4597AlbRDefDsc = "" ;
      P06QF5_A396EmprCod = new String[] {""} ;
      P06QF5_A44AlbRecCod = new int[1] ;
      P06QF6_A396EmprCod = new String[] {""} ;
      P06QF6_A44AlbRecCod = new int[1] ;
      P06QF6_A1300AlbRObs = new String[] {""} ;
      P06QF6_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      AV13AlbRObs = new String[15] ;
      GX_I = 1 ;
      while ( GX_I <= 15 )
      {
         AV13AlbRObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralbrel__default(),
         new Object[] {
             new Object[] {
            P06QF2_A396EmprCod, P06QF2_A44AlbRecCod, P06QF2_A52AlbRPieEnt, P06QF2_A4290AlbPmPPza, P06QF2_A58AlbRUniEnt
            }
            , new Object[] {
            P06QF3_A65ArtCod, P06QF3_A4658MdlCod, P06QF3_A396EmprCod, P06QF3_A52AlbRPieEnt, P06QF3_A58AlbRUniEnt, P06QF3_A4601AlbRTam, P06QF3_A44AlbRecCod, P06QF3_A55AlbRReo, P06QF3_A4602AlbRMdlCod, P06QF3_A407EmprNom,
            P06QF3_n407EmprNom, P06QF3_A279CliNom, P06QF3_A252CliCod, P06QF3_A1212TipEntNom, P06QF3_n1212TipEntNom, P06QF3_A1211TipEntCod, P06QF3_n1211TipEntCod, P06QF3_A49AlbRFen, P06QF3_A46AlbREnt, P06QF3_A3613AlbRefDsc,
            P06QF3_A45AlbRef, P06QF3_A1291AlbRDes, P06QF3_A4603AlbRMdlDsc, P06QF3_n4603AlbRMdlDsc
            }
            , new Object[] {
            P06QF4_A4596AlbRDefCod, P06QF4_A396EmprCod, P06QF4_A44AlbRecCod, P06QF4_A4600AlbRDefUni, P06QF4_n4600AlbRDefUni, P06QF4_A4599AlbRDefPza, P06QF4_n4599AlbRDefPza, P06QF4_A4598AlbRDefPor, P06QF4_n4598AlbRDefPor, P06QF4_A4597AlbRDefDsc,
            P06QF4_n4597AlbRDefDsc
            }
            , new Object[] {
            P06QF5_A396EmprCod, P06QF5_A44AlbRecCod
            }
            , new Object[] {
            P06QF6_A396EmprCod, P06QF6_A44AlbRecCod, P06QF6_A1300AlbRObs, P06QF6_A1299AlbRLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl22 ;
   private byte A1299AlbRLin ;
   private short A1211TipEntCod ;
   private short A4596AlbRDefCod ;
   private short A4598AlbRDefPor ;
   private short Gx_err ;
   private int AV8AlbRecIni ;
   private int AV9AlbRecFin ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A4291AlbPzaEst ;
   private int AV12AlbRPieEnt ;
   private int AV11AlbPzaEst ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private int AV15QuantEnt ;
   private int A4599AlbRDefPza ;
   private int GX_I ;
   private long AV14Lin ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV10AlbRUniEnt ;
   private java.math.BigDecimal A4600AlbRDefUni ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A4601AlbRTam ;
   private String A55AlbRReo ;
   private String A4602AlbRMdlCod ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A1212TipEntNom ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
   private String A45AlbRef ;
   private String A1291AlbRDes ;
   private String A4603AlbRMdlDsc ;
   private String A4597AlbRDefDsc ;
   private String A1300AlbRObs ;
   private String AV13AlbRObs[] ;
   private java.util.Date A49AlbRFen ;
   private boolean GxHdr3 ;
   private boolean brk6QF3 ;
   private boolean n407EmprNom ;
   private boolean n1212TipEntNom ;
   private boolean n1211TipEntCod ;
   private boolean n4603AlbRMdlDsc ;
   private boolean n4600AlbRDefUni ;
   private boolean n4599AlbRDefPza ;
   private boolean n4598AlbRDefPor ;
   private boolean n4597AlbRDefDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P06QF2_A396EmprCod ;
   private int[] P06QF2_A44AlbRecCod ;
   private int[] P06QF2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P06QF2_A4290AlbPmPPza ;
   private java.math.BigDecimal[] P06QF2_A58AlbRUniEnt ;
   private String[] P06QF3_A65ArtCod ;
   private String[] P06QF3_A4658MdlCod ;
   private String[] P06QF3_A396EmprCod ;
   private int[] P06QF3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P06QF3_A58AlbRUniEnt ;
   private String[] P06QF3_A4601AlbRTam ;
   private int[] P06QF3_A44AlbRecCod ;
   private String[] P06QF3_A55AlbRReo ;
   private String[] P06QF3_A4602AlbRMdlCod ;
   private String[] P06QF3_A407EmprNom ;
   private boolean[] P06QF3_n407EmprNom ;
   private String[] P06QF3_A279CliNom ;
   private int[] P06QF3_A252CliCod ;
   private String[] P06QF3_A1212TipEntNom ;
   private boolean[] P06QF3_n1212TipEntNom ;
   private short[] P06QF3_A1211TipEntCod ;
   private boolean[] P06QF3_n1211TipEntCod ;
   private java.util.Date[] P06QF3_A49AlbRFen ;
   private String[] P06QF3_A46AlbREnt ;
   private String[] P06QF3_A3613AlbRefDsc ;
   private String[] P06QF3_A45AlbRef ;
   private String[] P06QF3_A1291AlbRDes ;
   private String[] P06QF3_A4603AlbRMdlDsc ;
   private boolean[] P06QF3_n4603AlbRMdlDsc ;
   private short[] P06QF4_A4596AlbRDefCod ;
   private String[] P06QF4_A396EmprCod ;
   private int[] P06QF4_A44AlbRecCod ;
   private java.math.BigDecimal[] P06QF4_A4600AlbRDefUni ;
   private boolean[] P06QF4_n4600AlbRDefUni ;
   private int[] P06QF4_A4599AlbRDefPza ;
   private boolean[] P06QF4_n4599AlbRDefPza ;
   private short[] P06QF4_A4598AlbRDefPor ;
   private boolean[] P06QF4_n4598AlbRDefPor ;
   private String[] P06QF4_A4597AlbRDefDsc ;
   private boolean[] P06QF4_n4597AlbRDefDsc ;
   private String[] P06QF5_A396EmprCod ;
   private int[] P06QF5_A44AlbRecCod ;
   private String[] P06QF6_A396EmprCod ;
   private int[] P06QF6_A44AlbRecCod ;
   private String[] P06QF6_A1300AlbRObs ;
   private byte[] P06QF6_A1299AlbRLin ;
}

final  class ralbrel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06QF2", "SELECT EmprCod, AlbRecCod, AlbRPieEnt, AlbPmPPza, AlbRUniEnt FROM TXPALBREC WHERE (EmprCod = ? and AlbRecCod >= ?) AND (AlbRecCod <= ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QF3", "SELECT T5.ArtCod, T5.MdlCod, T1.EmprCod, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRTam, T1.AlbRecCod, T1.AlbRReo, T1.AlbRMdlCod, T2.EmprNom, T3.CliNom, T1.CliCod, T4.TipEntNom, T1.TipEntCod, T1.AlbRFen, T1.AlbREnt, T1.AlbRefDsc, T1.AlbRef, T1.AlbRDes, COALESCE( T5.MdlDsc, 'No Existe Modelo.') AS AlbRMdlDsc FROM ((((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPENTRAD T4 ON T4.EmprCod = T1.EmprCod AND T4.TipEntCod = T1.TipEntCod) LEFT JOIN TXPModels T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.AlbRef AND T5.MdlCod = T1.AlbRMdlCod) WHERE (T1.EmprCod = ? and T1.AlbRecCod >= ?) AND (T1.AlbRecCod <= ?) ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QF4", "SELECT T1.AlbRDefCod AS AlbRDefCod, T1.EmprCod, T1.AlbRecCod, T1.AlbRDefUni, T1.AlbRDefPza, T1.AlbRDefPor, T2.TipDefDsc AS AlbRDefDsc FROM (TXPALBRDF T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.AlbRDefCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QF5", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE (EmprCod = ? and AlbRecCod >= ?) AND (AlbRecCod <= ?) ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QF6", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 25);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 8);
               ((String[]) buf[19])[0] = rslt.getString(17, 26);
               ((String[]) buf[20])[0] = rslt.getString(18, 16);
               ((String[]) buf[21])[0] = rslt.getString(19, 20);
               ((String[]) buf[22])[0] = rslt.getString(20, 40);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

