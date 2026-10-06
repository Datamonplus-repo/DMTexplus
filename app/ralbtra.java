package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class ralbtra extends GXReport
{
   public ralbtra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ralbtra.class ), "" );
   }

   public ralbtra( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      ralbtra.this.aP1 = new long[] {0};
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
      ralbtra.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ralbtra.this.A3617AlbTrnCod = aP1[0];
      this.aP1 = aP1;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("IMPRESO ALBARAN TRANSPORTISTA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P06IA2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06IA2_A407EmprNom[0] ;
            n407EmprNom = P06IA2_n407EmprNom[0] ;
            A395EmprCif = P06IA2_A395EmprCif[0] ;
            n395EmprCif = P06IA2_n395EmprCif[0] ;
            A403EmprCpo = P06IA2_A403EmprCpo[0] ;
            n403EmprCpo = P06IA2_n403EmprCpo[0] ;
            A404EmprDir = P06IA2_A404EmprDir[0] ;
            n404EmprDir = P06IA2_n404EmprDir[0] ;
            A405EmprFax = P06IA2_A405EmprFax[0] ;
            n405EmprFax = P06IA2_n405EmprFax[0] ;
            A408EmprPob = P06IA2_A408EmprPob[0] ;
            n408EmprPob = P06IA2_n408EmprPob[0] ;
            A409EmprTel = P06IA2_A409EmprTel[0] ;
            n409EmprTel = P06IA2_n409EmprTel[0] ;
            AV19EmprNom = A407EmprNom ;
            AV25EmprCif = A395EmprCif ;
            AV21EmprCpo = A403EmprCpo ;
            AV20EmprDir = A404EmprDir ;
            AV24EmprFax = A405EmprFax ;
            AV22EmprPob = A408EmprPob ;
            AV23EmprTel = A409EmprTel ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06IA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A3617AlbTrnCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A781PrvCod = P06IA3_A781PrvCod[0] ;
            A3830AlbTrnUlin = P06IA3_A3830AlbTrnUlin[0] ;
            n3830AlbTrnUlin = P06IA3_n3830AlbTrnUlin[0] ;
            A787PrvDsc = P06IA3_A787PrvDsc[0] ;
            n787PrvDsc = P06IA3_n787PrvDsc[0] ;
            A3831AlbTrnEnv = P06IA3_A3831AlbTrnEnv[0] ;
            n3831AlbTrnEnv = P06IA3_n3831AlbTrnEnv[0] ;
            A841TrnNom = P06IA3_A841TrnNom[0] ;
            n841TrnNom = P06IA3_n841TrnNom[0] ;
            A840TrnCod = P06IA3_A840TrnCod[0] ;
            n840TrnCod = P06IA3_n840TrnCod[0] ;
            A295CliPob = P06IA3_A295CliPob[0] ;
            A260CliDom = P06IA3_A260CliDom[0] ;
            A256CliCp = P06IA3_A256CliCp[0] ;
            A279CliNom = P06IA3_A279CliNom[0] ;
            A252CliCod = P06IA3_A252CliCod[0] ;
            n252CliCod = P06IA3_n252CliCod[0] ;
            A3618AlbTrnFec = P06IA3_A3618AlbTrnFec[0] ;
            n3618AlbTrnFec = P06IA3_n3618AlbTrnFec[0] ;
            A781PrvCod = P06IA3_A781PrvCod[0] ;
            A295CliPob = P06IA3_A295CliPob[0] ;
            A260CliDom = P06IA3_A260CliDom[0] ;
            A256CliCp = P06IA3_A256CliCp[0] ;
            A279CliNom = P06IA3_A279CliNom[0] ;
            A787PrvDsc = P06IA3_A787PrvDsc[0] ;
            n787PrvDsc = P06IA3_n787PrvDsc[0] ;
            A841TrnNom = P06IA3_A841TrnNom[0] ;
            n841TrnNom = P06IA3_n841TrnNom[0] ;
            AV11CliENom = A279CliNom ;
            AV12CliEDom = A260CliDom ;
            AV13CliEcp = A256CliCp ;
            AV14CliEPob = A295CliPob ;
            AV15CliEPrv = A787PrvDsc ;
            AV17CliEnvDom = A3831AlbTrnEnv ;
            AV16CliCod = A252CliCod ;
            /* Execute user subroutine: 'DESTINOE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
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
            AV26ContLin = (short)(0) ;
            /* Optimized group. */
            /* Using cursor P06IA4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A3617AlbTrnCod)});
            c3833AlbTraKgB = P06IA4_A3833AlbTraKgB[0] ;
            n3833AlbTraKgB = P06IA4_n3833AlbTraKgB[0] ;
            c3832AlbTraKgN = P06IA4_A3832AlbTraKgN[0] ;
            n3832AlbTraKgN = P06IA4_n3832AlbTraKgN[0] ;
            c3834AlbTraBul = P06IA4_A3834AlbTraBul[0] ;
            n3834AlbTraBul = P06IA4_n3834AlbTraBul[0] ;
            pr_default.close(2);
            AV9TotalBruto = AV9TotalBruto.add(c3833AlbTraKgB) ;
            AV10TotalNeto = AV10TotalNeto.add(c3832AlbTraKgN) ;
            AV8TotalBul = (int)(AV8TotalBul+c3834AlbTraBul) ;
            /* End optimized group. */
            /* Using cursor P06IA5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A3617AlbTrnCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A3833AlbTraKgB = P06IA5_A3833AlbTraKgB[0] ;
               n3833AlbTraKgB = P06IA5_n3833AlbTraKgB[0] ;
               A30AlbProCod = P06IA5_A30AlbProCod[0] ;
               A129BarCod = P06IA5_A129BarCod[0] ;
               A132BarCodReo = P06IA5_A132BarCodReo[0] ;
               A130BarCodPar = P06IA5_A130BarCodPar[0] ;
               if ( AV26ContLin > 25 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV26ContLin = (short)(0) ;
               }
               h6IA0( false, 22) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 44, Gx_line+2, 118, Gx_line+20, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
               AV26ContLin = (short)(AV26ContLin+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            while ( AV26ContLin < 25 )
            {
               h6IA0( false, 18) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV26ContLin = (short)(AV26ContLin+1) ;
            }
            h6IA0( false, 18) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES:", ""), 18, Gx_line+4, 132, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            /* Using cursor P06IA6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A3617AlbTrnCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A3620AlbTrnObs = P06IA6_A3620AlbTrnObs[0] ;
               n3620AlbTrnObs = P06IA6_n3620AlbTrnObs[0] ;
               A3619AlbTrnLin = P06IA6_A3619AlbTrnLin[0] ;
               h6IA0( false, 18) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3620AlbTrnObs, "")), 133, Gx_line+1, 447, Gx_line+19, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6IA0( true, 0) ;
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
      /* 'DESTINOE' Routine */
      returnInSub = false ;
      /* Using cursor P06IA7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV17CliEnvDom)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A266CliEnvLin = P06IA7_A266CliEnvLin[0] ;
         A252CliCod = P06IA7_A252CliCod[0] ;
         n252CliCod = P06IA7_n252CliCod[0] ;
         A267CliEnvNom = P06IA7_A267CliEnvNom[0] ;
         A265CliEnvDom = P06IA7_A265CliEnvDom[0] ;
         A264CliEnvCp = P06IA7_A264CliEnvCp[0] ;
         A268CliEnvPob = P06IA7_A268CliEnvPob[0] ;
         A270CliEnvPrv = P06IA7_A270CliEnvPrv[0] ;
         AV11CliENom = A267CliEnvNom ;
         AV12CliEDom = A265CliEnvDom ;
         AV13CliEcp = A264CliEnvCp ;
         AV14CliEPob = A268CliEnvPob ;
         AV18CodPrv = A270CliEnvPrv ;
         /* Execute user subroutine: 'PROVIN' */
         S128 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S128( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P06IA8 */
      pr_default.execute(6, new Object[] {Short.valueOf(AV18CodPrv)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A781PrvCod = P06IA8_A781PrvCod[0] ;
         A787PrvDsc = P06IA8_A787PrvDsc[0] ;
         n787PrvDsc = P06IA8_n787PrvDsc[0] ;
         AV15CliEPrv = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void h6IA0( boolean bFoot ,
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
               getPrinter().GxDrawRect(470, Gx_line+133, 720, Gx_line+205, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19EmprNom, "")), 17, Gx_line+15, 299, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20EmprDir, "")), 17, Gx_line+44, 237, Gx_line+62, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21EmprCpo, "")), 17, Gx_line+70, 113, Gx_line+88, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22EmprPob, "")), 148, Gx_line+70, 368, Gx_line+88, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("-", 127, Gx_line+71, 132, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23EmprTel, "")), 55, Gx_line+96, 150, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tel.", ""), 17, Gx_line+96, 41, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fax.", ""), 193, Gx_line+96, 219, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24EmprFax, "")), 234, Gx_line+96, 329, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25EmprCif, "")), 60, Gx_line+120, 155, Gx_line+138, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N.I.F.:", ""), 17, Gx_line+121, 56, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "AGENCIA", ""), 530, Gx_line+103, 614, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Albaran", ""), 522, Gx_line+147, 601, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3617AlbTrnCod), "ZZZZZZZZZ9")), 607, Gx_line+147, 681, Gx_line+165, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 522, Gx_line+171, 568, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A3618AlbTrnFec, "99/99/99"), 624, Gx_line+171, 677, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ENTREGADO A:", ""), 17, Gx_line+229, 122, Gx_line+245, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 134, Gx_line+228, 179, Gx_line+246, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 191, Gx_line+228, 380, Gx_line+246, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 134, Gx_line+273, 216, Gx_line+291, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 134, Gx_line+251, 348, Gx_line+269, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 227, Gx_line+273, 416, Gx_line+291, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Numero Bultos.:", ""), 18, Gx_line+481, 133, Gx_line+499, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8TotalBul), "ZZZZZ9")), 135, Gx_line+483, 180, Gx_line+501, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso Bruto.:", ""), 230, Gx_line+483, 319, Gx_line+501, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9TotalBruto, "Z,ZZZ,ZZ9.99")), 322, Gx_line+483, 411, Gx_line+501, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso Neto.:", ""), 442, Gx_line+483, 527, Gx_line+501, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10TotalNeto, "Z,ZZZ,ZZ9.99")), 525, Gx_line+483, 614, Gx_line+501, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Albaranes", ""), 18, Gx_line+511, 115, Gx_line+529, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(18, Gx_line+531, 721, Gx_line+531, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11CliENom, "")), 134, Gx_line+319, 323, Gx_line+337, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12CliEDom, "")), 134, Gx_line+341, 348, Gx_line+359, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13CliEcp, "")), 134, Gx_line+363, 216, Gx_line+381, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14CliEPob, "")), 227, Gx_line+363, 416, Gx_line+381, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ENVIO PARA:", ""), 17, Gx_line+319, 106, Gx_line+335, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15CliEPrv, "@!")), 134, Gx_line+384, 323, Gx_line+402, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TRANSPORTISTA:", ""), 18, Gx_line+427, 139, Gx_line+443, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 134, Gx_line+426, 164, Gx_line+444, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 165, Gx_line+426, 354, Gx_line+444, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+536) ;
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
      this.aP0[0] = ralbtra.this.A396EmprCod;
      this.aP1[0] = ralbtra.this.A3617AlbTrnCod;
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
      P06IA2_A396EmprCod = new String[] {""} ;
      P06IA2_A407EmprNom = new String[] {""} ;
      P06IA2_n407EmprNom = new boolean[] {false} ;
      P06IA2_A395EmprCif = new String[] {""} ;
      P06IA2_n395EmprCif = new boolean[] {false} ;
      P06IA2_A403EmprCpo = new String[] {""} ;
      P06IA2_n403EmprCpo = new boolean[] {false} ;
      P06IA2_A404EmprDir = new String[] {""} ;
      P06IA2_n404EmprDir = new boolean[] {false} ;
      P06IA2_A405EmprFax = new String[] {""} ;
      P06IA2_n405EmprFax = new boolean[] {false} ;
      P06IA2_A408EmprPob = new String[] {""} ;
      P06IA2_n408EmprPob = new boolean[] {false} ;
      P06IA2_A409EmprTel = new String[] {""} ;
      P06IA2_n409EmprTel = new boolean[] {false} ;
      A407EmprNom = "" ;
      A395EmprCif = "" ;
      A403EmprCpo = "" ;
      A404EmprDir = "" ;
      A405EmprFax = "" ;
      A408EmprPob = "" ;
      A409EmprTel = "" ;
      AV19EmprNom = "" ;
      AV25EmprCif = "" ;
      AV21EmprCpo = "" ;
      AV20EmprDir = "" ;
      AV24EmprFax = "" ;
      AV22EmprPob = "" ;
      AV23EmprTel = "" ;
      P06IA3_A781PrvCod = new short[1] ;
      P06IA3_A396EmprCod = new String[] {""} ;
      P06IA3_A3617AlbTrnCod = new long[1] ;
      P06IA3_A3830AlbTrnUlin = new short[1] ;
      P06IA3_n3830AlbTrnUlin = new boolean[] {false} ;
      P06IA3_A787PrvDsc = new String[] {""} ;
      P06IA3_n787PrvDsc = new boolean[] {false} ;
      P06IA3_A3831AlbTrnEnv = new byte[1] ;
      P06IA3_n3831AlbTrnEnv = new boolean[] {false} ;
      P06IA3_A841TrnNom = new String[] {""} ;
      P06IA3_n841TrnNom = new boolean[] {false} ;
      P06IA3_A840TrnCod = new short[1] ;
      P06IA3_n840TrnCod = new boolean[] {false} ;
      P06IA3_A295CliPob = new String[] {""} ;
      P06IA3_A260CliDom = new String[] {""} ;
      P06IA3_A256CliCp = new String[] {""} ;
      P06IA3_A279CliNom = new String[] {""} ;
      P06IA3_A252CliCod = new int[1] ;
      P06IA3_n252CliCod = new boolean[] {false} ;
      P06IA3_A3618AlbTrnFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06IA3_n3618AlbTrnFec = new boolean[] {false} ;
      A787PrvDsc = "" ;
      A841TrnNom = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A256CliCp = "" ;
      A279CliNom = "" ;
      A3618AlbTrnFec = GXutil.nullDate() ;
      AV11CliENom = "" ;
      AV12CliEDom = "" ;
      AV13CliEcp = "" ;
      AV14CliEPob = "" ;
      AV15CliEPrv = "" ;
      c3833AlbTraKgB = DecimalUtil.ZERO ;
      c3832AlbTraKgN = DecimalUtil.ZERO ;
      P06IA4_A3833AlbTraKgB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06IA4_n3833AlbTraKgB = new boolean[] {false} ;
      P06IA4_A3832AlbTraKgN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06IA4_n3832AlbTraKgN = new boolean[] {false} ;
      P06IA4_A3834AlbTraBul = new short[1] ;
      P06IA4_n3834AlbTraBul = new boolean[] {false} ;
      AV9TotalBruto = DecimalUtil.ZERO ;
      AV10TotalNeto = DecimalUtil.ZERO ;
      P06IA5_A396EmprCod = new String[] {""} ;
      P06IA5_A3617AlbTrnCod = new long[1] ;
      P06IA5_A3833AlbTraKgB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06IA5_n3833AlbTraKgB = new boolean[] {false} ;
      P06IA5_A30AlbProCod = new long[1] ;
      P06IA5_A129BarCod = new int[1] ;
      P06IA5_A132BarCodReo = new byte[1] ;
      P06IA5_A130BarCodPar = new String[] {""} ;
      A3833AlbTraKgB = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      P06IA6_A396EmprCod = new String[] {""} ;
      P06IA6_A3617AlbTrnCod = new long[1] ;
      P06IA6_A3620AlbTrnObs = new String[] {""} ;
      P06IA6_n3620AlbTrnObs = new boolean[] {false} ;
      P06IA6_A3619AlbTrnLin = new byte[1] ;
      A3620AlbTrnObs = "" ;
      P06IA7_A396EmprCod = new String[] {""} ;
      P06IA7_A266CliEnvLin = new byte[1] ;
      P06IA7_A252CliCod = new int[1] ;
      P06IA7_n252CliCod = new boolean[] {false} ;
      P06IA7_A267CliEnvNom = new String[] {""} ;
      P06IA7_A265CliEnvDom = new String[] {""} ;
      P06IA7_A264CliEnvCp = new String[] {""} ;
      P06IA7_A268CliEnvPob = new String[] {""} ;
      P06IA7_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P06IA8_A781PrvCod = new short[1] ;
      P06IA8_A787PrvDsc = new String[] {""} ;
      P06IA8_n787PrvDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralbtra__default(),
         new Object[] {
             new Object[] {
            P06IA2_A396EmprCod, P06IA2_A407EmprNom, P06IA2_n407EmprNom, P06IA2_A395EmprCif, P06IA2_n395EmprCif, P06IA2_A403EmprCpo, P06IA2_n403EmprCpo, P06IA2_A404EmprDir, P06IA2_n404EmprDir, P06IA2_A405EmprFax,
            P06IA2_n405EmprFax, P06IA2_A408EmprPob, P06IA2_n408EmprPob, P06IA2_A409EmprTel, P06IA2_n409EmprTel
            }
            , new Object[] {
            P06IA3_A781PrvCod, P06IA3_A396EmprCod, P06IA3_A3617AlbTrnCod, P06IA3_A3830AlbTrnUlin, P06IA3_n3830AlbTrnUlin, P06IA3_A787PrvDsc, P06IA3_n787PrvDsc, P06IA3_A3831AlbTrnEnv, P06IA3_n3831AlbTrnEnv, P06IA3_A841TrnNom,
            P06IA3_n841TrnNom, P06IA3_A840TrnCod, P06IA3_n840TrnCod, P06IA3_A295CliPob, P06IA3_A260CliDom, P06IA3_A256CliCp, P06IA3_A279CliNom, P06IA3_A252CliCod, P06IA3_n252CliCod, P06IA3_A3618AlbTrnFec,
            P06IA3_n3618AlbTrnFec
            }
            , new Object[] {
            P06IA4_A3833AlbTraKgB, P06IA4_n3833AlbTraKgB, P06IA4_A3832AlbTraKgN, P06IA4_n3832AlbTraKgN, P06IA4_A3834AlbTraBul, P06IA4_n3834AlbTraBul
            }
            , new Object[] {
            P06IA5_A396EmprCod, P06IA5_A3617AlbTrnCod, P06IA5_A3833AlbTraKgB, P06IA5_n3833AlbTraKgB, P06IA5_A30AlbProCod, P06IA5_A129BarCod, P06IA5_A132BarCodReo, P06IA5_A130BarCodPar
            }
            , new Object[] {
            P06IA6_A396EmprCod, P06IA6_A3617AlbTrnCod, P06IA6_A3620AlbTrnObs, P06IA6_n3620AlbTrnObs, P06IA6_A3619AlbTrnLin
            }
            , new Object[] {
            P06IA7_A396EmprCod, P06IA7_A266CliEnvLin, P06IA7_A252CliCod, P06IA7_A267CliEnvNom, P06IA7_A265CliEnvDom, P06IA7_A264CliEnvCp, P06IA7_A268CliEnvPob, P06IA7_A270CliEnvPrv
            }
            , new Object[] {
            P06IA8_A781PrvCod, P06IA8_A787PrvDsc, P06IA8_n787PrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A3831AlbTrnEnv ;
   private byte AV17CliEnvDom ;
   private byte A132BarCodReo ;
   private byte A3619AlbTrnLin ;
   private byte A266CliEnvLin ;
   private short A781PrvCod ;
   private short A3830AlbTrnUlin ;
   private short A840TrnCod ;
   private short AV26ContLin ;
   private short A270CliEnvPrv ;
   private short AV18CodPrv ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV16CliCod ;
   private int c3834AlbTraBul ;
   private int AV8TotalBul ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private long A3617AlbTrnCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal c3833AlbTraKgB ;
   private java.math.BigDecimal c3832AlbTraKgN ;
   private java.math.BigDecimal AV9TotalBruto ;
   private java.math.BigDecimal AV10TotalNeto ;
   private java.math.BigDecimal A3833AlbTraKgB ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A395EmprCif ;
   private String A403EmprCpo ;
   private String A404EmprDir ;
   private String A405EmprFax ;
   private String A408EmprPob ;
   private String A409EmprTel ;
   private String AV19EmprNom ;
   private String AV25EmprCif ;
   private String AV21EmprCpo ;
   private String AV20EmprDir ;
   private String AV24EmprFax ;
   private String AV22EmprPob ;
   private String AV23EmprTel ;
   private String A787PrvDsc ;
   private String A841TrnNom ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A256CliCp ;
   private String A279CliNom ;
   private String AV11CliENom ;
   private String AV12CliEDom ;
   private String AV13CliEcp ;
   private String AV14CliEPob ;
   private String AV15CliEPrv ;
   private String A130BarCodPar ;
   private String A3620AlbTrnObs ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date A3618AlbTrnFec ;
   private boolean n407EmprNom ;
   private boolean n395EmprCif ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n405EmprFax ;
   private boolean n408EmprPob ;
   private boolean n409EmprTel ;
   private boolean GxHdr3 ;
   private boolean n3830AlbTrnUlin ;
   private boolean n787PrvDsc ;
   private boolean n3831AlbTrnEnv ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n252CliCod ;
   private boolean n3618AlbTrnFec ;
   private boolean returnInSub ;
   private boolean n3833AlbTraKgB ;
   private boolean n3832AlbTraKgN ;
   private boolean n3834AlbTraBul ;
   private boolean n3620AlbTrnObs ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P06IA2_A396EmprCod ;
   private String[] P06IA2_A407EmprNom ;
   private boolean[] P06IA2_n407EmprNom ;
   private String[] P06IA2_A395EmprCif ;
   private boolean[] P06IA2_n395EmprCif ;
   private String[] P06IA2_A403EmprCpo ;
   private boolean[] P06IA2_n403EmprCpo ;
   private String[] P06IA2_A404EmprDir ;
   private boolean[] P06IA2_n404EmprDir ;
   private String[] P06IA2_A405EmprFax ;
   private boolean[] P06IA2_n405EmprFax ;
   private String[] P06IA2_A408EmprPob ;
   private boolean[] P06IA2_n408EmprPob ;
   private String[] P06IA2_A409EmprTel ;
   private boolean[] P06IA2_n409EmprTel ;
   private short[] P06IA3_A781PrvCod ;
   private String[] P06IA3_A396EmprCod ;
   private long[] P06IA3_A3617AlbTrnCod ;
   private short[] P06IA3_A3830AlbTrnUlin ;
   private boolean[] P06IA3_n3830AlbTrnUlin ;
   private String[] P06IA3_A787PrvDsc ;
   private boolean[] P06IA3_n787PrvDsc ;
   private byte[] P06IA3_A3831AlbTrnEnv ;
   private boolean[] P06IA3_n3831AlbTrnEnv ;
   private String[] P06IA3_A841TrnNom ;
   private boolean[] P06IA3_n841TrnNom ;
   private short[] P06IA3_A840TrnCod ;
   private boolean[] P06IA3_n840TrnCod ;
   private String[] P06IA3_A295CliPob ;
   private String[] P06IA3_A260CliDom ;
   private String[] P06IA3_A256CliCp ;
   private String[] P06IA3_A279CliNom ;
   private int[] P06IA3_A252CliCod ;
   private boolean[] P06IA3_n252CliCod ;
   private java.util.Date[] P06IA3_A3618AlbTrnFec ;
   private boolean[] P06IA3_n3618AlbTrnFec ;
   private java.math.BigDecimal[] P06IA4_A3833AlbTraKgB ;
   private boolean[] P06IA4_n3833AlbTraKgB ;
   private java.math.BigDecimal[] P06IA4_A3832AlbTraKgN ;
   private boolean[] P06IA4_n3832AlbTraKgN ;
   private short[] P06IA4_A3834AlbTraBul ;
   private boolean[] P06IA4_n3834AlbTraBul ;
   private String[] P06IA5_A396EmprCod ;
   private long[] P06IA5_A3617AlbTrnCod ;
   private java.math.BigDecimal[] P06IA5_A3833AlbTraKgB ;
   private boolean[] P06IA5_n3833AlbTraKgB ;
   private long[] P06IA5_A30AlbProCod ;
   private int[] P06IA5_A129BarCod ;
   private byte[] P06IA5_A132BarCodReo ;
   private String[] P06IA5_A130BarCodPar ;
   private String[] P06IA6_A396EmprCod ;
   private long[] P06IA6_A3617AlbTrnCod ;
   private String[] P06IA6_A3620AlbTrnObs ;
   private boolean[] P06IA6_n3620AlbTrnObs ;
   private byte[] P06IA6_A3619AlbTrnLin ;
   private String[] P06IA7_A396EmprCod ;
   private byte[] P06IA7_A266CliEnvLin ;
   private int[] P06IA7_A252CliCod ;
   private boolean[] P06IA7_n252CliCod ;
   private String[] P06IA7_A267CliEnvNom ;
   private String[] P06IA7_A265CliEnvDom ;
   private String[] P06IA7_A264CliEnvCp ;
   private String[] P06IA7_A268CliEnvPob ;
   private short[] P06IA7_A270CliEnvPrv ;
   private short[] P06IA8_A781PrvCod ;
   private String[] P06IA8_A787PrvDsc ;
   private boolean[] P06IA8_n787PrvDsc ;
}

final  class ralbtra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06IA2", "SELECT EmprCod, EmprNom, EmprCif, EmprCpo, EmprDir, EmprFax, EmprPob, EmprTel FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06IA3", "SELECT T2.PrvCod, T1.EmprCod, T1.AlbTrnCod, T1.AlbTrnUlin, T3.PrvDsc, T1.AlbTrnEnv, T4.TrnNom, T1.TrnCod, T2.CliPob, T2.CliDom, T2.CliCp, T2.CliNom, T1.CliCod, T1.AlbTrnFec FROM (((TXPALBTRA T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = T2.PrvCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) WHERE T1.EmprCod = ? and T1.AlbTrnCod = ? ORDER BY T1.EmprCod, T1.AlbTrnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06IA4", "SELECT SUM(AlbTraKgB), SUM(AlbTraKgN), SUM(AlbTraBul) FROM TXPLALBTR WHERE EmprCod = ? and AlbTrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06IA5", "SELECT EmprCod, AlbTrnCod, AlbTraKgB, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? and AlbTrnCod = ? ORDER BY EmprCod, AlbTrnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06IA6", "SELECT EmprCod, AlbTrnCod, AlbTrnObs, AlbTrnLin FROM TXPALBTOB WHERE EmprCod = ? and AlbTrnCod = ? ORDER BY EmprCod, AlbTrnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06IA7", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06IA8", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 7);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 35);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 35);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 30);
               ((String[]) buf[14])[0] = rslt.getString(10, 34);
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

