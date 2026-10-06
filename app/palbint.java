package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class palbint extends GXReport
{
   public palbint( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbint.class ), "" );
   }

   public palbint( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      palbint.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      palbint.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbint.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 2 ;
      M_bot = 2 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Albarán de Expedición -Intexco") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P02RL2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A404EmprDir = P02RL2_A404EmprDir[0] ;
            n404EmprDir = P02RL2_n404EmprDir[0] ;
            A407EmprNom = P02RL2_A407EmprNom[0] ;
            n407EmprNom = P02RL2_n407EmprNom[0] ;
            A409EmprTel = P02RL2_A409EmprTel[0] ;
            n409EmprTel = P02RL2_n409EmprTel[0] ;
            AV9EmprDir = A404EmprDir ;
            AV8EmprNom = A407EmprNom ;
            AV10EmprTel = A409EmprTel ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr4 = true ;
         /* Using cursor P02RL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1253EmprGuiRem = P02RL3_A1253EmprGuiRem[0] ;
            A1243GuiRemCli = P02RL3_A1243GuiRemCli[0] ;
            A33AlbProEst = P02RL3_A33AlbProEst[0] ;
            A34AlbProfch = P02RL3_A34AlbProfch[0] ;
            /* Using cursor P02RL5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            if ( (pr_default.getStatus(2) != 101) )
            {
               A37AlbProMet = P02RL5_A37AlbProMet[0] ;
               A35AlbProKgs = P02RL5_A35AlbProKgs[0] ;
               A38AlbProPie = P02RL5_A38AlbProPie[0] ;
            }
            else
            {
               A37AlbProMet = DecimalUtil.doubleToDec(0) ;
               A35AlbProKgs = DecimalUtil.doubleToDec(0) ;
               A38AlbProPie = (short)(0) ;
            }
            /* Using cursor P02RL6 */
            pr_default.execute(3, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
            A260CliDom = P02RL6_A260CliDom[0] ;
            n260CliDom = P02RL6_n260CliDom[0] ;
            A295CliPob = P02RL6_A295CliPob[0] ;
            n295CliPob = P02RL6_n295CliPob[0] ;
            A1244GuiRemCln = P02RL6_A1244GuiRemCln[0] ;
            /* Using cursor P02RL7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A130BarCodPar = P02RL7_A130BarCodPar[0] ;
               A132BarCodReo = P02RL7_A132BarCodReo[0] ;
               A129BarCod = P02RL7_A129BarCod[0] ;
               A143BarDisNum = P02RL7_A143BarDisNum[0] ;
               A1263BarAlbMtrE = P02RL7_A1263BarAlbMtrE[0] ;
               A1261BarAlbKgmE = P02RL7_A1261BarAlbKgmE[0] ;
               A1265BarAlbPie = P02RL7_A1265BarAlbPie[0] ;
               A136BarColNum = P02RL7_A136BarColNum[0] ;
               A135BarColNom = P02RL7_A135BarColNom[0] ;
               A1652BarSerDsc = P02RL7_A1652BarSerDsc[0] ;
               A143BarDisNum = P02RL7_A143BarDisNum[0] ;
               A136BarColNum = P02RL7_A136BarColNum[0] ;
               A135BarColNom = P02RL7_A135BarColNom[0] ;
               A1652BarSerDsc = P02RL7_A1652BarSerDsc[0] ;
               h2RL0( false, 17) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 68, Gx_line+0, 204, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 202, Gx_line+0, 253, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 255, Gx_line+0, 262, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 264, Gx_line+0, 275, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 488, Gx_line+0, 557, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 557, Gx_line+0, 596, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 596, Gx_line+0, 635, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")), 631, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")), 691, Gx_line+0, 748, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 0, Gx_line+0, 61, Gx_line+15, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               AV19GXLvl25 = (byte)(0) ;
               /* Using cursor P02RL8 */
               pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A758ProCod = P02RL8_A758ProCod[0] ;
                  n758ProCod = P02RL8_n758ProCod[0] ;
                  A759ProDsc = P02RL8_A759ProDsc[0] ;
                  A1468AlbPrdLin = P02RL8_A1468AlbPrdLin[0] ;
                  A759ProDsc = P02RL8_A759ProDsc[0] ;
                  AV19GXLvl25 = (byte)(1) ;
                  h2RL0( false, 21) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 277, Gx_line+0, 485, Gx_line+15, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               if ( AV19GXLvl25 == 0 )
               {
                  h2RL0( false, 21) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Desconocido", ""), 277, Gx_line+0, 344, Gx_line+15, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h2RL0( false, 59) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 438, Gx_line+26, 472, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A38AlbProPie), "ZZZ9")), 496, Gx_line+25, 535, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A35AlbProKgs, "ZZZZZ9.99")), 555, Gx_line+25, 640, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A37AlbProMet, "ZZZZZ9.99")), 663, Gx_line+25, 748, Gx_line+46, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+59) ;
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
            }
            /* Using cursor P02RL9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               brk2RL8 = false ;
               A916AlbPObs = P02RL9_A916AlbPObs[0] ;
               A915AlbPObsLin = P02RL9_A915AlbPObsLin[0] ;
               h2RL0( false, 24) ;
               getPrinter().GxAttris("Arial", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 177, Gx_line+0, 311, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
               GxHdr9 = true ;
               while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P02RL9_A396EmprCod[0], A396EmprCod) == 0 ) && ( P02RL9_A30AlbProCod[0] == A30AlbProCod ) && ( P02RL9_A915AlbPObsLin[0] == A915AlbPObsLin ) )
               {
                  brk2RL8 = false ;
                  A916AlbPObs = P02RL9_A916AlbPObs[0] ;
                  h2RL0( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A916AlbPObs, "")), 177, Gx_line+1, 491, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  brk2RL8 = true ;
                  pr_default.readNext(6);
               }
               GxHdr9 = false ;
               if ( ! brk2RL8 )
               {
                  brk2RL8 = true ;
                  pr_default.readNext(6);
               }
            }
            pr_default.close(6);
            /* Using cursor P02RL10 */
            pr_default.execute(7, new Object[] {Byte.valueOf(A33AlbProEst), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.close(3);
         pr_default.close(2);
         GxHdr4 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2RL0( true, 0) ;
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
      /* 'RECEPCION' Routine */
      returnInSub = false ;
      AV22GXLvl52 = (byte)(0) ;
      /* Using cursor P02RL11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A44AlbRecCod = P02RL11_A44AlbRecCod[0] ;
         A130BarCodPar = P02RL11_A130BarCodPar[0] ;
         A132BarCodReo = P02RL11_A132BarCodReo[0] ;
         A129BarCod = P02RL11_A129BarCod[0] ;
         A46AlbREnt = P02RL11_A46AlbREnt[0] ;
         A200BarPieCod = P02RL11_A200BarPieCod[0] ;
         A46AlbREnt = P02RL11_A46AlbREnt[0] ;
         AV22GXLvl52 = (byte)(1) ;
         h2RL0( false, 24) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 0, Gx_line+0, 61, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+24) ;
         /* Noskip command */
         Gx_line = Gx_OldLine ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( AV22GXLvl52 == 0 )
      {
         h2RL0( false, 24) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Desconocido", ""), 0, Gx_line+0, 67, Gx_line+15, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+24) ;
         /* Noskip command */
         Gx_line = Gx_OldLine ;
      }
   }

   public void h2RL0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 53, Gx_line+0, 367, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A404EmprDir, "")), 53, Gx_line+29, 346, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A409EmprTel, "")), 53, Gx_line+52, 179, Gx_line+73, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+116) ;
            if ( GxHdr4 )
            {
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REMISION", ""), 530, Gx_line+14, 609, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 623, Gx_line+13, 718, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DE FECHA", ""), 530, Gx_line+38, 616, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 623, Gx_line+36, 689, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SEÑORES", ""), 30, Gx_line+13, 114, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), 30, Gx_line+36, 281, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(19, Gx_line+8, 729, Gx_line+103, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 30, Gx_line+81, 219, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 30, Gx_line+60, 244, Gx_line+78, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+116) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 68, Gx_line+0, 141, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 211, Gx_line+0, 253, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Remisión", ""), 0, Gx_line+0, 62, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 277, Gx_line+0, 355, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 488, Gx_line+0, 524, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pzas", ""), 590, Gx_line+0, 622, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 655, Gx_line+0, 688, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 703, Gx_line+0, 748, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+17, 800, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
            }
            if ( GxHdr9 )
            {
               getPrinter().GxAttris("Arial", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 177, Gx_line+0, 311, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
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
      this.aP0[0] = palbint.this.A396EmprCod;
      this.aP1[0] = palbint.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbint");
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
      P02RL2_A396EmprCod = new String[] {""} ;
      P02RL2_A404EmprDir = new String[] {""} ;
      P02RL2_n404EmprDir = new boolean[] {false} ;
      P02RL2_A407EmprNom = new String[] {""} ;
      P02RL2_n407EmprNom = new boolean[] {false} ;
      P02RL2_A409EmprTel = new String[] {""} ;
      P02RL2_n409EmprTel = new boolean[] {false} ;
      A404EmprDir = "" ;
      A407EmprNom = "" ;
      A409EmprTel = "" ;
      AV9EmprDir = "" ;
      AV8EmprNom = "" ;
      AV10EmprTel = "" ;
      P02RL3_A1253EmprGuiRem = new String[] {""} ;
      P02RL3_A1243GuiRemCli = new int[1] ;
      P02RL3_A396EmprCod = new String[] {""} ;
      P02RL3_A30AlbProCod = new long[1] ;
      P02RL3_A33AlbProEst = new byte[1] ;
      P02RL3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1253EmprGuiRem = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P02RL5_A37AlbProMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RL5_A35AlbProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RL5_A38AlbProPie = new short[1] ;
      A37AlbProMet = DecimalUtil.ZERO ;
      A35AlbProKgs = DecimalUtil.ZERO ;
      P02RL6_A260CliDom = new String[] {""} ;
      P02RL6_n260CliDom = new boolean[] {false} ;
      P02RL6_A295CliPob = new String[] {""} ;
      P02RL6_n295CliPob = new boolean[] {false} ;
      P02RL6_A1244GuiRemCln = new String[] {""} ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A1244GuiRemCln = "" ;
      P02RL7_A396EmprCod = new String[] {""} ;
      P02RL7_A30AlbProCod = new long[1] ;
      P02RL7_A130BarCodPar = new String[] {""} ;
      P02RL7_A132BarCodReo = new byte[1] ;
      P02RL7_A129BarCod = new int[1] ;
      P02RL7_A143BarDisNum = new String[] {""} ;
      P02RL7_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RL7_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RL7_A1265BarAlbPie = new int[1] ;
      P02RL7_A136BarColNum = new int[1] ;
      P02RL7_A135BarColNom = new String[] {""} ;
      P02RL7_A1652BarSerDsc = new String[] {""} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      P02RL8_A758ProCod = new String[] {""} ;
      P02RL8_n758ProCod = new boolean[] {false} ;
      P02RL8_A396EmprCod = new String[] {""} ;
      P02RL8_A30AlbProCod = new long[1] ;
      P02RL8_A129BarCod = new int[1] ;
      P02RL8_A132BarCodReo = new byte[1] ;
      P02RL8_A130BarCodPar = new String[] {""} ;
      P02RL8_A759ProDsc = new String[] {""} ;
      P02RL8_A1468AlbPrdLin = new short[1] ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      P02RL9_A396EmprCod = new String[] {""} ;
      P02RL9_A30AlbProCod = new long[1] ;
      P02RL9_A916AlbPObs = new String[] {""} ;
      P02RL9_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      A46AlbREnt = "" ;
      AV13BarCodPar = "" ;
      P02RL11_A44AlbRecCod = new int[1] ;
      P02RL11_A396EmprCod = new String[] {""} ;
      P02RL11_A130BarCodPar = new String[] {""} ;
      P02RL11_A132BarCodReo = new byte[1] ;
      P02RL11_A129BarCod = new int[1] ;
      P02RL11_A46AlbREnt = new String[] {""} ;
      P02RL11_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbint__default(),
         new Object[] {
             new Object[] {
            P02RL2_A396EmprCod, P02RL2_A404EmprDir, P02RL2_n404EmprDir, P02RL2_A407EmprNom, P02RL2_n407EmprNom, P02RL2_A409EmprTel, P02RL2_n409EmprTel
            }
            , new Object[] {
            P02RL3_A1253EmprGuiRem, P02RL3_A1243GuiRemCli, P02RL3_A396EmprCod, P02RL3_A30AlbProCod, P02RL3_A33AlbProEst, P02RL3_A34AlbProfch
            }
            , new Object[] {
            P02RL5_A37AlbProMet, P02RL5_A35AlbProKgs, P02RL5_A38AlbProPie
            }
            , new Object[] {
            P02RL6_A260CliDom, P02RL6_n260CliDom, P02RL6_A295CliPob, P02RL6_n295CliPob, P02RL6_A1244GuiRemCln
            }
            , new Object[] {
            P02RL7_A396EmprCod, P02RL7_A30AlbProCod, P02RL7_A130BarCodPar, P02RL7_A132BarCodReo, P02RL7_A129BarCod, P02RL7_A143BarDisNum, P02RL7_A1263BarAlbMtrE, P02RL7_A1261BarAlbKgmE, P02RL7_A1265BarAlbPie, P02RL7_A136BarColNum,
            P02RL7_A135BarColNom, P02RL7_A1652BarSerDsc
            }
            , new Object[] {
            P02RL8_A758ProCod, P02RL8_n758ProCod, P02RL8_A396EmprCod, P02RL8_A30AlbProCod, P02RL8_A129BarCod, P02RL8_A132BarCodReo, P02RL8_A130BarCodPar, P02RL8_A759ProDsc, P02RL8_A1468AlbPrdLin
            }
            , new Object[] {
            P02RL9_A396EmprCod, P02RL9_A30AlbProCod, P02RL9_A916AlbPObs, P02RL9_A915AlbPObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02RL11_A44AlbRecCod, P02RL11_A396EmprCod, P02RL11_A130BarCodPar, P02RL11_A132BarCodReo, P02RL11_A129BarCod, P02RL11_A46AlbREnt, P02RL11_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private byte AV19GXLvl25 ;
   private byte A915AlbPObsLin ;
   private byte AV22GXLvl52 ;
   private byte AV12BarCodReo ;
   private short A38AlbProPie ;
   private short A1468AlbPrdLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A136BarColNum ;
   private int Gx_OldLine ;
   private int AV11BarCod ;
   private int A44AlbRecCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A37AlbProMet ;
   private java.math.BigDecimal A35AlbProKgs ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A404EmprDir ;
   private String A407EmprNom ;
   private String A409EmprTel ;
   private String AV9EmprDir ;
   private String AV8EmprNom ;
   private String AV10EmprTel ;
   private String A1253EmprGuiRem ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A1244GuiRemCln ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A916AlbPObs ;
   private String A46AlbREnt ;
   private String AV13BarCodPar ;
   private String A200BarPieCod ;
   private java.util.Date A34AlbProfch ;
   private boolean n404EmprDir ;
   private boolean n407EmprNom ;
   private boolean n409EmprTel ;
   private boolean GxHdr4 ;
   private boolean n260CliDom ;
   private boolean n295CliPob ;
   private boolean n758ProCod ;
   private boolean brk2RL8 ;
   private boolean GxHdr9 ;
   private boolean returnInSub ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02RL2_A396EmprCod ;
   private String[] P02RL2_A404EmprDir ;
   private boolean[] P02RL2_n404EmprDir ;
   private String[] P02RL2_A407EmprNom ;
   private boolean[] P02RL2_n407EmprNom ;
   private String[] P02RL2_A409EmprTel ;
   private boolean[] P02RL2_n409EmprTel ;
   private String[] P02RL3_A1253EmprGuiRem ;
   private int[] P02RL3_A1243GuiRemCli ;
   private String[] P02RL3_A396EmprCod ;
   private long[] P02RL3_A30AlbProCod ;
   private byte[] P02RL3_A33AlbProEst ;
   private java.util.Date[] P02RL3_A34AlbProfch ;
   private java.math.BigDecimal[] P02RL5_A37AlbProMet ;
   private java.math.BigDecimal[] P02RL5_A35AlbProKgs ;
   private short[] P02RL5_A38AlbProPie ;
   private String[] P02RL6_A260CliDom ;
   private boolean[] P02RL6_n260CliDom ;
   private String[] P02RL6_A295CliPob ;
   private boolean[] P02RL6_n295CliPob ;
   private String[] P02RL6_A1244GuiRemCln ;
   private String[] P02RL7_A396EmprCod ;
   private long[] P02RL7_A30AlbProCod ;
   private String[] P02RL7_A130BarCodPar ;
   private byte[] P02RL7_A132BarCodReo ;
   private int[] P02RL7_A129BarCod ;
   private String[] P02RL7_A143BarDisNum ;
   private java.math.BigDecimal[] P02RL7_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P02RL7_A1261BarAlbKgmE ;
   private int[] P02RL7_A1265BarAlbPie ;
   private int[] P02RL7_A136BarColNum ;
   private String[] P02RL7_A135BarColNom ;
   private String[] P02RL7_A1652BarSerDsc ;
   private String[] P02RL8_A758ProCod ;
   private boolean[] P02RL8_n758ProCod ;
   private String[] P02RL8_A396EmprCod ;
   private long[] P02RL8_A30AlbProCod ;
   private int[] P02RL8_A129BarCod ;
   private byte[] P02RL8_A132BarCodReo ;
   private String[] P02RL8_A130BarCodPar ;
   private String[] P02RL8_A759ProDsc ;
   private short[] P02RL8_A1468AlbPrdLin ;
   private String[] P02RL9_A396EmprCod ;
   private long[] P02RL9_A30AlbProCod ;
   private String[] P02RL9_A916AlbPObs ;
   private byte[] P02RL9_A915AlbPObsLin ;
   private int[] P02RL11_A44AlbRecCod ;
   private String[] P02RL11_A396EmprCod ;
   private String[] P02RL11_A130BarCodPar ;
   private byte[] P02RL11_A132BarCodReo ;
   private int[] P02RL11_A129BarCod ;
   private String[] P02RL11_A46AlbREnt ;
   private String[] P02RL11_A200BarPieCod ;
}

final  class palbint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RL2", "SELECT EmprCod, EmprDir, EmprNom, EmprTel FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RL3", "SELECT EmprGuiRem, GuiRemCli, EmprCod, AlbProCod, AlbProEst, AlbProfch FROM TXPCALPRD WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?)  FOR UPDATE OF AlbProEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RL5", "SELECT COALESCE( T1.AlbProMet, 0) AS AlbProMet, COALESCE( T1.AlbProKgs, 0) AS AlbProKgs, COALESCE( T1.AlbProPie, 0) AS AlbProPie FROM (SELECT SUM(BarAlbMtrE) AS AlbProMet, EmprCod, AlbProCod, SUM(BarAlbKgmE) AS AlbProKgs, SUM(BarAlbPie) AS AlbProPie FROM TXPALBBAR GROUP BY EmprCod, AlbProCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RL6", "SELECT CliDom, CliPob, CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RL7", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T1.BarAlbMtrE, T1.BarAlbKgmE, T1.BarAlbPie, T2.BarColNum, T2.BarColNom, T2.BarSerDsc FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RL8", "SELECT * FROM (SELECT T1.ProCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ProDsc, T1.AlbPrdLin FROM ((TXPALBPRD T1 LEFT JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RL9", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02RL10", "UPDATE TXPCALPRD SET AlbProEst=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P02RL11", "SELECT * FROM (SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbREnt, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

