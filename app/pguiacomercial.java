package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pguiacomercial extends GXReport
{
   public pguiacomercial( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pguiacomercial.class ), "" );
   }

   public pguiacomercial( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pguiacomercial.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pguiacomercial.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pguiacomercial.this.A14AlbComCod = aP1[0];
      this.aP1 = aP1;
      pguiacomercial.this.AV8ImpCod = aP2[0];
      this.aP2 = aP2;
      pguiacomercial.this.AV15Tex_Copia = aP3[0];
      this.aP3 = aP3;
      pguiacomercial.this.Gx_out = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 10 ;
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
         getPrinter().GxSetDocName("Guia Comercial") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*10)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV26ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRCOMC", ""), GXv_char1) ;
         pguiacomercial.this.AV26ContDsc = GXv_char1[0] ;
         GXt_char2 = AV38FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pguiacomercial.this.A396EmprCod = GXv_char1[0] ;
         pguiacomercial.this.GXt_char2 = GXv_char4[0] ;
         AV38FirmaD = GXt_char2 ;
         GxHdr2 = true ;
         /* Using cursor P052N2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A840TrnCod = P052N2_A840TrnCod[0] ;
            n840TrnCod = P052N2_n840TrnCod[0] ;
            A252CliCod = P052N2_A252CliCod[0] ;
            A22AlbComPri = P052N2_A22AlbComPri[0] ;
            A278CliNif = P052N2_A278CliNif[0] ;
            A841TrnNom = P052N2_A841TrnNom[0] ;
            n841TrnNom = P052N2_n841TrnNom[0] ;
            A4829AlbComHor = P052N2_A4829AlbComHor[0] ;
            A4830AlbComMat = P052N2_A4830AlbComMat[0] ;
            A4828CliCp2 = P052N2_A4828CliCp2[0] ;
            A256CliCp = P052N2_A256CliCp[0] ;
            A3644CliNom1 = P052N2_A3644CliNom1[0] ;
            A279CliNom = P052N2_A279CliNom[0] ;
            A5649CliDom2 = P052N2_A5649CliDom2[0] ;
            A260CliDom = P052N2_A260CliDom[0] ;
            A17AlbComFch = P052N2_A17AlbComFch[0] ;
            A10014AlbComFd = P052N2_A10014AlbComFd[0] ;
            A10740AlbComID = P052N2_A10740AlbComID[0] ;
            A16AlbComEst = P052N2_A16AlbComEst[0] ;
            A1783AlbComEso = P052N2_A1783AlbComEso[0] ;
            A295CliPob = P052N2_A295CliPob[0] ;
            A278CliNif = P052N2_A278CliNif[0] ;
            A4828CliCp2 = P052N2_A4828CliCp2[0] ;
            A256CliCp = P052N2_A256CliCp[0] ;
            A3644CliNom1 = P052N2_A3644CliNom1[0] ;
            A279CliNom = P052N2_A279CliNom[0] ;
            A5649CliDom2 = P052N2_A5649CliDom2[0] ;
            A260CliDom = P052N2_A260CliDom[0] ;
            A295CliPob = P052N2_A295CliPob[0] ;
            A841TrnNom = P052N2_A841TrnNom[0] ;
            n841TrnNom = P052N2_n841TrnNom[0] ;
            AV21CliCod = A252CliCod ;
            AV22Prioridad = A22AlbComPri ;
            AV11CliNif = A278CliNif ;
            AV20TransNom = A841TrnNom ;
            AV48AlbHorSal = localUtil.ttoc( A4829AlbComHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV49Albmat = A4830AlbComMat ;
            /* Execute user subroutine: 'PAGO' */
            S121 ();
            if ( returnInSub )
            {
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
            AV43Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            AV44CliNom3 = GXutil.trim( A279CliNom) + GXutil.trim( A3644CliNom1) ;
            AV45Clidom50 = GXutil.trim( A260CliDom) + GXutil.trim( A5649CliDom2) ;
            AV14vPob = GXutil.ltrim( A256CliCp) + " " + A295CliPob ;
            if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
            {
               AV34VDoc = httpContext.getMessage( "Guia de Transporte Nº ", "") ;
            }
            else
            {
               AV34VDoc = httpContext.getMessage( "Guia de Remessa Comercial ", "") ;
            }
            AV12FechaAlb = GXutil.str( GXutil.day( A17AlbComFch), 2, 0) + " " + localUtil.cmonth( A17AlbComFch, httpContext.getMessage( "por", "")) + " " + GXutil.str( GXutil.year( A17AlbComFch), 4, 0) ;
            AV25Num_alb = GXutil.trim( GXutil.str( A14AlbComCod, 8, 0)) ;
            AV40Texto_fd = " " ;
            if ( GXutil.strcmp(A10014AlbComFd, " ") != 0 )
            {
               AV41Firma4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
               AV40Texto_fd = AV41Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV38FirmaD) ;
            }
            else
            {
               AV40Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            if ( GXutil.strcmp(A10740AlbComID, " ") > 0 )
            {
               AV42AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A10740AlbComID, 1, 12)) ;
            }
            AV29Hh = (byte)(GXutil.hour( A4829AlbComHor)) ;
            AV30Mm = (byte)(GXutil.minute( A4829AlbComHor)) ;
            AV32Ceros2 = "00" ;
            AV27vHh = GXutil.trim( GXutil.str( AV29Hh, 2, 0)) ;
            AV31Lenvar = (byte)(GXutil.len( AV27vHh)) ;
            AV31Lenvar = (byte)(2-AV31Lenvar) ;
            AV27vHh = GXutil.substring( AV32Ceros2, 1, AV31Lenvar) + AV27vHh ;
            AV28vMm = GXutil.trim( GXutil.str( AV30Mm, 2, 0)) ;
            AV31Lenvar = (byte)(GXutil.len( AV28vMm)) ;
            AV31Lenvar = (byte)(2-AV31Lenvar) ;
            AV28vMm = GXutil.substring( AV32Ceros2, 1, AV31Lenvar) + AV28vMm ;
            AV33vHora = AV27vHh + ":" + AV28vMm ;
            /* Execute user subroutine: 'CARGA_OBS' */
            S111 ();
            if ( returnInSub )
            {
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
            /* Using cursor P052N3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4717AlbComUni = P052N3_A4717AlbComUni[0] ;
               A21AlbComPre = P052N3_A21AlbComPre[0] ;
               A13AlbComCnt = P052N3_A13AlbComCnt[0] ;
               A5144AlbUcoDsc = P052N3_A5144AlbUcoDsc[0] ;
               n5144AlbUcoDsc = P052N3_n5144AlbUcoDsc[0] ;
               A15AlbComDsc = P052N3_A15AlbComDsc[0] ;
               A20AlbComLin = P052N3_A20AlbComLin[0] ;
               A5144AlbUcoDsc = P052N3_A5144AlbUcoDsc[0] ;
               n5144AlbUcoDsc = P052N3_n5144AlbUcoDsc[0] ;
               if ( AV17NumLin > 35 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV17NumLin = (short)(0) ;
               }
               AV36Pre = A21AlbComPre ;
               AV37AlbComCnt = A13AlbComCnt ;
               AV35Imp = GXutil.roundDecimal( A21AlbComPre.multiply(A13AlbComCnt), 2) ;
               AV50Und = ((GXutil.strcmp("", A5144AlbUcoDsc)==0) ? " " : GXutil.substring( A5144AlbUcoDsc, 1, 3)) ;
               h52N0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A15AlbComDsc, "")), 78, Gx_line+1, 371, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37AlbComCnt, "ZZZZZZ.ZZ")), 563, Gx_line+0, 630, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36Pre, "ZZZZZ.ZZZ")), 676, Gx_line+0, 743, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Und, "")), 639, Gx_line+0, 662, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( A16AlbComEst == 0 )
            {
               A16AlbComEst = (byte)(1) ;
               A1783AlbComEso = (byte)(1) ;
            }
            /* Using cursor P052N4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A16AlbComEst), Byte.valueOf(A1783AlbComEso), A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h52N0( true, 0) ;
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
      /* 'CARGA_OBS' Routine */
      returnInSub = false ;
      AV18j = (byte)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV19vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P052N5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2384AlbCObs = P052N5_A2384AlbCObs[0] ;
         n2384AlbCObs = P052N5_n2384AlbCObs[0] ;
         A2386AlbCObsLin = P052N5_A2386AlbCObsLin[0] ;
         if ( AV18j <= 3 )
         {
            AV19vObs[AV18j-1] = A2384AlbCObs ;
         }
         else
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV18j = (byte)(AV18j+1) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PAGO' Routine */
      returnInSub = false ;
      /* Using cursor P052N6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV21CliCod), AV22Prioridad});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A497FpgCod = P052N6_A497FpgCod[0] ;
         A297CliPri = P052N6_A297CliPri[0] ;
         A252CliCod = P052N6_A252CliCod[0] ;
         A498FpgDsc = P052N6_A498FpgDsc[0] ;
         n498FpgDsc = P052N6_n498FpgDsc[0] ;
         A498FpgDsc = P052N6_A498FpgDsc[0] ;
         n498FpgDsc = P052N6_n498FpgDsc[0] ;
         AV13FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void h52N0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Carga", ""), 60, Gx_line+29, 94, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NOSSA MORADA", ""), 153, Gx_line+29, 243, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descarga", ""), 60, Gx_line+43, 114, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MORADA DO CLIENTE", ""), 153, Gx_line+43, 264, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Obs", ""), 60, Gx_line+59, 84, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19vObs[1-1], "")), 153, Gx_line+59, 414, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19vObs[2-1], "")), 153, Gx_line+73, 414, Gx_line+89, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Viatura", ""), 534, Gx_line+29, 576, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TransNom, "")), 603, Gx_line+28, 656, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(54, Gx_line+18, 769, Gx_line+102, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Texto_fd, "")), 54, Gx_line+105, 341, Gx_line+121, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42AtId, "")), 613, Gx_line+106, 770, Gx_line+122, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 534, Gx_line+43, 587, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Albmat, "")), 603, Gx_line+42, 708, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26ContDsc, "")), 54, Gx_line+127, 159, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(54, Gx_line+123, 769, Gx_line+123, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19vObs[3-1], "")), 153, Gx_line+86, 414, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(54, Gx_line+58, 769, Gx_line+58, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+144) ;
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
               getPrinter().GxDrawLine(54, Gx_line+378, 769, Gx_line+378, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Carvema Têxtil, Lda.", ""), 63, Gx_line+25, 392, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rua António Carvalho, 2", ""), 63, Gx_line+69, 179, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Perelhal - BARCELOS", ""), 63, Gx_line+82, 165, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "4750 - 625 Perelhal - PORTUGAL", ""), 63, Gx_line+95, 213, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TEL.: 351 253 860 030", ""), 63, Gx_line+107, 163, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FAX.: 351 253 860 039", ""), 63, Gx_line+119, 163, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "email: carvema@carvema.pt", ""), 63, Gx_line+131, 194, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "www.carvema.pt", ""), 63, Gx_line+145, 140, Gx_line+158, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE Nº PT 500 057 095 - SOCIEDADE POR QUOTAS", ""), 63, Gx_line+165, 353, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MATRICULADA NA CONS. R. C. DE BARCELOS SOB. O Nº 319", ""), 63, Gx_line+175, 349, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CAPITAL SOCIAL € 2.000.000,00 REALIZADO", ""), 63, Gx_line+186, 265, Gx_line+199, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmo.(s) Sr.(s)", ""), 389, Gx_line+165, 474, Gx_line+181, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44CliNom3, "")), 389, Gx_line+199, 703, Gx_line+217, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 473, Gx_line+238, 662, Gx_line+256, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Clidom50, "")), 389, Gx_line+219, 703, Gx_line+237, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Cp, "")), 389, Gx_line+238, 453, Gx_line+256, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Num_alb, "")), 620, Gx_line+331, 762, Gx_line+351, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(54, Gx_line+354, 769, Gx_line+380, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data de Emissão", ""), 64, Gx_line+358, 164, Gx_line+374, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Nº Contribuinte", ""), 523, Gx_line+358, 623, Gx_line+374, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11CliNif, "@!")), 510, Gx_line+383, 636, Gx_line+401, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FechaAlb, "")), 64, Gx_line+383, 221, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(768, Gx_line+379, 768, Gx_line+404, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(54, Gx_line+403, 768, Gx_line+403, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Tex_Copia, "")), 141, Gx_line+332, 236, Gx_line+350, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34VDoc, "")), 370, Gx_line+332, 604, Gx_line+352, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 54, Gx_line+333, 77, Gx_line+348, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 86, Gx_line+333, 131, Gx_line+350, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21CliCod), "ZZZZZ9")), 683, Gx_line+383, 728, Gx_line+401, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora de Carga", ""), 300, Gx_line+358, 385, Gx_line+374, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48AlbHorSal, "")), 289, Gx_line+384, 398, Gx_line+402, 1+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+406) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 78, Gx_line+3, 139, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 560, Gx_line+3, 629, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "P.Uni", ""), 711, Gx_line+3, 740, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(54, Gx_line+1, 769, Gx_line+21, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+23) ;
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
      this.aP0[0] = pguiacomercial.this.A396EmprCod;
      this.aP1[0] = pguiacomercial.this.A14AlbComCod;
      this.aP2[0] = pguiacomercial.this.AV8ImpCod;
      this.aP3[0] = pguiacomercial.this.AV15Tex_Copia;
      this.aP4[0] = pguiacomercial.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pguiacomercial");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26ContDsc = "" ;
      AV38FirmaD = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P052N2_A840TrnCod = new short[1] ;
      P052N2_n840TrnCod = new boolean[] {false} ;
      P052N2_A396EmprCod = new String[] {""} ;
      P052N2_A14AlbComCod = new int[1] ;
      P052N2_A252CliCod = new int[1] ;
      P052N2_A22AlbComPri = new String[] {""} ;
      P052N2_A278CliNif = new String[] {""} ;
      P052N2_A841TrnNom = new String[] {""} ;
      P052N2_n841TrnNom = new boolean[] {false} ;
      P052N2_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P052N2_A4830AlbComMat = new String[] {""} ;
      P052N2_A4828CliCp2 = new String[] {""} ;
      P052N2_A256CliCp = new String[] {""} ;
      P052N2_A3644CliNom1 = new String[] {""} ;
      P052N2_A279CliNom = new String[] {""} ;
      P052N2_A5649CliDom2 = new String[] {""} ;
      P052N2_A260CliDom = new String[] {""} ;
      P052N2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P052N2_A10014AlbComFd = new String[] {""} ;
      P052N2_A10740AlbComID = new String[] {""} ;
      P052N2_A16AlbComEst = new byte[1] ;
      P052N2_A1783AlbComEso = new byte[1] ;
      P052N2_A295CliPob = new String[] {""} ;
      A22AlbComPri = "" ;
      A278CliNif = "" ;
      A841TrnNom = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A4830AlbComMat = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A5649CliDom2 = "" ;
      A260CliDom = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A10014AlbComFd = "" ;
      A10740AlbComID = "" ;
      A295CliPob = "" ;
      AV22Prioridad = "" ;
      AV11CliNif = "" ;
      AV20TransNom = "" ;
      AV48AlbHorSal = "" ;
      AV49Albmat = "" ;
      AV43Cp = "" ;
      AV44CliNom3 = "" ;
      AV45Clidom50 = "" ;
      AV14vPob = "" ;
      AV34VDoc = "" ;
      AV12FechaAlb = "" ;
      AV25Num_alb = "" ;
      AV40Texto_fd = "" ;
      AV41Firma4dig = "" ;
      AV42AtId = "" ;
      AV32Ceros2 = "" ;
      AV27vHh = "" ;
      AV28vMm = "" ;
      AV33vHora = "" ;
      P052N3_A4717AlbComUni = new byte[1] ;
      P052N3_A396EmprCod = new String[] {""} ;
      P052N3_A14AlbComCod = new int[1] ;
      P052N3_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052N3_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052N3_A5144AlbUcoDsc = new String[] {""} ;
      P052N3_n5144AlbUcoDsc = new boolean[] {false} ;
      P052N3_A15AlbComDsc = new String[] {""} ;
      P052N3_A20AlbComLin = new short[1] ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A5144AlbUcoDsc = "" ;
      A15AlbComDsc = "" ;
      AV36Pre = DecimalUtil.ZERO ;
      AV37AlbComCnt = DecimalUtil.ZERO ;
      AV35Imp = DecimalUtil.ZERO ;
      AV50Und = "" ;
      AV19vObs = new String[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV19vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P052N5_A396EmprCod = new String[] {""} ;
      P052N5_A14AlbComCod = new int[1] ;
      P052N5_A2384AlbCObs = new String[] {""} ;
      P052N5_n2384AlbCObs = new boolean[] {false} ;
      P052N5_A2386AlbCObsLin = new byte[1] ;
      A2384AlbCObs = "" ;
      P052N6_A497FpgCod = new String[] {""} ;
      P052N6_A396EmprCod = new String[] {""} ;
      P052N6_A297CliPri = new String[] {""} ;
      P052N6_A252CliCod = new int[1] ;
      P052N6_A498FpgDsc = new String[] {""} ;
      P052N6_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A297CliPri = "" ;
      A498FpgDsc = "" ;
      AV13FpgDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pguiacomercial__default(),
         new Object[] {
             new Object[] {
            P052N2_A840TrnCod, P052N2_n840TrnCod, P052N2_A396EmprCod, P052N2_A14AlbComCod, P052N2_A252CliCod, P052N2_A22AlbComPri, P052N2_A278CliNif, P052N2_A841TrnNom, P052N2_n841TrnNom, P052N2_A4829AlbComHor,
            P052N2_A4830AlbComMat, P052N2_A4828CliCp2, P052N2_A256CliCp, P052N2_A3644CliNom1, P052N2_A279CliNom, P052N2_A5649CliDom2, P052N2_A260CliDom, P052N2_A17AlbComFch, P052N2_A10014AlbComFd, P052N2_A10740AlbComID,
            P052N2_A16AlbComEst, P052N2_A1783AlbComEso, P052N2_A295CliPob
            }
            , new Object[] {
            P052N3_A4717AlbComUni, P052N3_A396EmprCod, P052N3_A14AlbComCod, P052N3_A21AlbComPre, P052N3_A13AlbComCnt, P052N3_A5144AlbUcoDsc, P052N3_n5144AlbUcoDsc, P052N3_A15AlbComDsc, P052N3_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            P052N5_A396EmprCod, P052N5_A14AlbComCod, P052N5_A2384AlbCObs, P052N5_n2384AlbCObs, P052N5_A2386AlbCObsLin
            }
            , new Object[] {
            P052N6_A497FpgCod, P052N6_A396EmprCod, P052N6_A297CliPri, P052N6_A252CliCod, P052N6_A498FpgDsc, P052N6_n498FpgDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte AV29Hh ;
   private byte AV30Mm ;
   private byte AV31Lenvar ;
   private byte A4717AlbComUni ;
   private byte AV18j ;
   private byte A2386AlbCObsLin ;
   private short A840TrnCod ;
   private short A20AlbComLin ;
   private short AV17NumLin ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV21CliCod ;
   private int Gx_OldLine ;
   private int GX_I ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal AV36Pre ;
   private java.math.BigDecimal AV37AlbComCnt ;
   private java.math.BigDecimal AV35Imp ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV15Tex_Copia ;
   private String Gx_out ;
   private String AV26ContDsc ;
   private String AV38FirmaD ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A22AlbComPri ;
   private String A278CliNif ;
   private String A841TrnNom ;
   private String A4830AlbComMat ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A3644CliNom1 ;
   private String A279CliNom ;
   private String A5649CliDom2 ;
   private String A260CliDom ;
   private String A10014AlbComFd ;
   private String A10740AlbComID ;
   private String A295CliPob ;
   private String AV22Prioridad ;
   private String AV11CliNif ;
   private String AV20TransNom ;
   private String AV48AlbHorSal ;
   private String AV49Albmat ;
   private String AV43Cp ;
   private String AV44CliNom3 ;
   private String AV45Clidom50 ;
   private String AV14vPob ;
   private String AV34VDoc ;
   private String AV12FechaAlb ;
   private String AV25Num_alb ;
   private String AV40Texto_fd ;
   private String AV41Firma4dig ;
   private String AV42AtId ;
   private String AV32Ceros2 ;
   private String AV27vHh ;
   private String AV28vMm ;
   private String AV33vHora ;
   private String A5144AlbUcoDsc ;
   private String A15AlbComDsc ;
   private String AV50Und ;
   private String AV19vObs[] ;
   private String A2384AlbCObs ;
   private String A497FpgCod ;
   private String A297CliPri ;
   private String A498FpgDsc ;
   private String AV13FpgDsc ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A17AlbComFch ;
   private boolean GxHdr2 ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean n5144AlbUcoDsc ;
   private boolean n2384AlbCObs ;
   private boolean n498FpgDsc ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P052N2_A840TrnCod ;
   private boolean[] P052N2_n840TrnCod ;
   private String[] P052N2_A396EmprCod ;
   private int[] P052N2_A14AlbComCod ;
   private int[] P052N2_A252CliCod ;
   private String[] P052N2_A22AlbComPri ;
   private String[] P052N2_A278CliNif ;
   private String[] P052N2_A841TrnNom ;
   private boolean[] P052N2_n841TrnNom ;
   private java.util.Date[] P052N2_A4829AlbComHor ;
   private String[] P052N2_A4830AlbComMat ;
   private String[] P052N2_A4828CliCp2 ;
   private String[] P052N2_A256CliCp ;
   private String[] P052N2_A3644CliNom1 ;
   private String[] P052N2_A279CliNom ;
   private String[] P052N2_A5649CliDom2 ;
   private String[] P052N2_A260CliDom ;
   private java.util.Date[] P052N2_A17AlbComFch ;
   private String[] P052N2_A10014AlbComFd ;
   private String[] P052N2_A10740AlbComID ;
   private byte[] P052N2_A16AlbComEst ;
   private byte[] P052N2_A1783AlbComEso ;
   private String[] P052N2_A295CliPob ;
   private byte[] P052N3_A4717AlbComUni ;
   private String[] P052N3_A396EmprCod ;
   private int[] P052N3_A14AlbComCod ;
   private java.math.BigDecimal[] P052N3_A21AlbComPre ;
   private java.math.BigDecimal[] P052N3_A13AlbComCnt ;
   private String[] P052N3_A5144AlbUcoDsc ;
   private boolean[] P052N3_n5144AlbUcoDsc ;
   private String[] P052N3_A15AlbComDsc ;
   private short[] P052N3_A20AlbComLin ;
   private String[] P052N5_A396EmprCod ;
   private int[] P052N5_A14AlbComCod ;
   private String[] P052N5_A2384AlbCObs ;
   private boolean[] P052N5_n2384AlbCObs ;
   private byte[] P052N5_A2386AlbCObsLin ;
   private String[] P052N6_A497FpgCod ;
   private String[] P052N6_A396EmprCod ;
   private String[] P052N6_A297CliPri ;
   private int[] P052N6_A252CliCod ;
   private String[] P052N6_A498FpgDsc ;
   private boolean[] P052N6_n498FpgDsc ;
}

final  class pguiacomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P052N2", "SELECT T1.TrnCod, T1.EmprCod, T1.AlbComCod, T1.CliCod, T1.AlbComPri, T2.CliNif, T3.TrnNom, T1.AlbComHor, T1.AlbComMat, T2.CliCp2, T2.CliCp, T2.CliNom1, T2.CliNom, T2.CliDom2, T2.CliDom, T1.AlbComFch, T1.AlbComFd, T1.AlbComID, T1.AlbComEst, T1.AlbComEso, T2.CliPob FROM ((TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P052N3", "SELECT T1.AlbComUni AS AlbComUni, T1.EmprCod, T1.AlbComCod, T1.AlbComPre, T1.AlbComCnt, T2.UniDsc AS AlbUcoDsc, T1.AlbComDsc, T1.AlbComLin FROM (TXPLALCOM T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND T2.UniCod = T1.AlbComUni) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod, T1.AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P052N4", "UPDATE TXPCALCOM SET AlbComEst=?, AlbComEso=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P052N5", "SELECT EmprCod, AlbComCod, AlbCObs, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P052N6", "SELECT T1.FpgCod, T1.EmprCod, T1.CliPri, T1.CliCod, T2.FpgDsc FROM (TXPCLIFPG T1 INNER JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod = T1.FpgCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliPri = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((String[]) buf[15])[0] = rslt.getString(14, 34);
               ((String[]) buf[16])[0] = rslt.getString(15, 34);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 200);
               ((String[]) buf[19])[0] = rslt.getString(18, 20);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 30);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

