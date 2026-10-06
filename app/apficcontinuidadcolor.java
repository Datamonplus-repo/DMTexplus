package app ;
import com.genexus.reports.*;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apficcontinuidadcolor extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apficcontinuidadcolor pgm = new apficcontinuidadcolor (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public apficcontinuidadcolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apficcontinuidadcolor.class ), "" );
   }

   public apficcontinuidadcolor( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      apficcontinuidadcolor.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      apficcontinuidadcolor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apficcontinuidadcolor.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      apficcontinuidadcolor.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      apficcontinuidadcolor.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("continuidadColor.pdf") ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV23ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FICCON", ""), GXv_char1) ;
         apficcontinuidadcolor.this.AV23ContDsc = GXv_char1[0] ;
         /* Using cursor P05VQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P05VQ2_A361DisCod[0] ;
            A252CliCod = P05VQ2_A252CliCod[0] ;
            n252CliCod = P05VQ2_n252CliCod[0] ;
            A4466BarAcaAnh = P05VQ2_A4466BarAcaAnh[0] ;
            A5291BarTipCor = P05VQ2_A5291BarTipCor[0] ;
            A2829BarProPer = P05VQ2_A2829BarProPer[0] ;
            A11852Nxt_ArtCl2 = P05VQ2_A11852Nxt_ArtCl2[0] ;
            A11850Nxt_Mdlo2 = P05VQ2_A11850Nxt_Mdlo2[0] ;
            A11851Nxt_Sta2 = P05VQ2_A11851Nxt_Sta2[0] ;
            A1234BarNomCli = P05VQ2_A1234BarNomCli[0] ;
            A135BarColNom = P05VQ2_A135BarColNom[0] ;
            A1652BarSerDsc = P05VQ2_A1652BarSerDsc[0] ;
            A212BarSer = P05VQ2_A212BarSer[0] ;
            A4812BarEncCli = P05VQ2_A4812BarEncCli[0] ;
            A279CliNom = P05VQ2_A279CliNom[0] ;
            A279CliNom = P05VQ2_A279CliNom[0] ;
            AV8Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_int3[0] = A4466BarAcaAnh ;
            GXv_char4[0] = AV17Tb1_dscfb ;
            new app.pptable2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
            apficcontinuidadcolor.this.A396EmprCod = GXv_char1[0] ;
            apficcontinuidadcolor.this.A252CliCod = GXv_int2[0] ;
            apficcontinuidadcolor.this.A4466BarAcaAnh = GXv_int3[0] ;
            apficcontinuidadcolor.this.AV17Tb1_dscfb = GXv_char4[0] ;
            AV12DisEnt = GXutil.substring( AV17Tb1_dscfb, 1, 30) ;
            AV18i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV9Tab_obs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05VQ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A377DisObsTxt = P05VQ3_A377DisObsTxt[0] ;
               A376DisObsLin = P05VQ3_A376DisObsLin[0] ;
               if ( AV18i > 4 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV9Tab_obs[AV18i-1] = A377DisObsTxt ;
               AV18i = (byte)(AV18i+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV26Exportacion = ((GXutil.strcmp(A5291BarTipCor, httpContext.getMessage( "SI", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NAO", "")) ;
            AV25Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S111 ();
            if ( returnInSub )
            {
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
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV19Tab_norma[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV20Tab_normanc[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV21Tab_normast[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            AV24j = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV16Tab_normas[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05VQ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13216DisNormDsc = P05VQ4_A13216DisNormDsc[0] ;
               n13216DisNormDsc = P05VQ4_n13216DisNormDsc[0] ;
               A13215DisNormNC = P05VQ4_A13215DisNormNC[0] ;
               A13214DisNormSt = P05VQ4_A13214DisNormSt[0] ;
               A13213DisNormID = P05VQ4_A13213DisNormID[0] ;
               A13216DisNormDsc = P05VQ4_A13216DisNormDsc[0] ;
               n13216DisNormDsc = P05VQ4_n13216DisNormDsc[0] ;
               if ( AV24j <= 5 )
               {
                  AV19Tab_norma[AV24j-1] = GXutil.substring( A13216DisNormDsc, 1, 15) ;
                  AV20Tab_normanc[AV24j-1] = ((GXutil.strcmp(A13215DisNormNC, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV21Tab_normast[AV24j-1] = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV22Norma = GXutil.substring( A13216DisNormDsc, 1, 15) ;
                  AV27status = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                  AV16Tab_normas[AV24j-1] = GXutil.padr( GXutil.trim( AV22Norma), 15, " ") + " " + AV27status + " " + httpContext.getMessage( "N/Conforme?: ", "") + ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
               }
               AV24j = (byte)(AV24j+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV10Nxt_artcl2 = ((GXutil.strcmp(GXutil.trim( A11852Nxt_ArtCl2), httpContext.getMessage( "Sem Definir", ""))==0) ? " " : A11852Nxt_ArtCl2) ;
            AV13Procenom = " " ;
            /* Using cursor P05VQ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A203BarPieKil = P05VQ5_A203BarPieKil[0] ;
               A44AlbRecCod = P05VQ5_A44AlbRecCod[0] ;
               A200BarPieCod = P05VQ5_A200BarPieCod[0] ;
               AV28Albreccod = A44AlbRecCod ;
               /* Execute user subroutine: 'PROCEDENCIA' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
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
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV14lista = GXutil.substring( A11850Nxt_Mdlo2, 1, 3) ;
            AV15relatorio = GXutil.substring( A11851Nxt_Sta2, 1, 3) ;
            h5VQ0( false, 134) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 14, Gx_line+14, 240, Gx_line+74) ;
            getPrinter().GxDrawRect(7, Gx_line+103, 759, Gx_line+131, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "IDENTIFICAÇÃO DO ARTIGO", ""), 290, Gx_line+109, 449, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(318, Gx_line+16, 760, Gx_line+67, 3, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 338, Gx_line+30, 363, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 622, Gx_line+27, 745, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 385, Gx_line+30, 454, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE CONTINUIDADE DE COR", ""), 252, Gx_line+82, 516, Gx_line+100, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+134) ;
            h5VQ0( false, 149) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 14, Gx_line+14, 59, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 67, Gx_line+14, 112, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 124, Gx_line+14, 281, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Obs", ""), 386, Gx_line+94, 411, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_obs[1-1], "")), 441, Gx_line+94, 755, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_obs[2-1], "")), 441, Gx_line+109, 755, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_obs[3-1], "")), 441, Gx_line+125, 755, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Largura:", ""), 639, Gx_line+59, 690, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gramagem:", ""), 439, Gx_line+59, 509, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 14, Gx_line+59, 56, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12DisEnt, "")), 67, Gx_line+59, 224, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Talao:", ""), 439, Gx_line+14, 490, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 493, Gx_line+14, 598, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cm", ""), 725, Gx_line+59, 746, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "gr", ""), 543, Gx_line+59, 557, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 14, Gx_line+96, 50, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 67, Gx_line+96, 151, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 163, Gx_line+96, 299, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+143, 759, Gx_line+143, 3, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+149) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5VQ0( true, 0) ;
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
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P05VQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV25Cod_Idtx});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A10887Cod_Idtx = P05VQ6_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P05VQ6_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P05VQ6_n10888Dsc_Idtx[0] ;
         AV11Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PROCEDENCIA' Routine */
      returnInSub = false ;
      AV13Procenom = " " ;
      /* Using cursor P05VQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV28Albreccod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A970ProceCod = P05VQ7_A970ProceCod[0] ;
         n970ProceCod = P05VQ7_n970ProceCod[0] ;
         A44AlbRecCod = P05VQ7_A44AlbRecCod[0] ;
         A971ProceNom = P05VQ7_A971ProceNom[0] ;
         n971ProceNom = P05VQ7_n971ProceNom[0] ;
         A971ProceNom = P05VQ7_A971ProceNom[0] ;
         n971ProceNom = P05VQ7_n971ProceNom[0] ;
         AV13Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void h5VQ0( boolean bFoot ,
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
      add_metrics2( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pficcontinuidadcolor.class);
      return new app.GXcfg();
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP0[0] = apficcontinuidadcolor.this.A396EmprCod;
      this.aP1[0] = apficcontinuidadcolor.this.A129BarCod;
      this.aP2[0] = apficcontinuidadcolor.this.A132BarCodReo;
      this.aP3[0] = apficcontinuidadcolor.this.A130BarCodPar;
      if (Application.realMainProgram == this)	waitPrinterEnd();
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23ContDsc = "" ;
      scmdbuf = "" ;
      P05VQ2_A396EmprCod = new String[] {""} ;
      P05VQ2_A129BarCod = new int[1] ;
      P05VQ2_A132BarCodReo = new byte[1] ;
      P05VQ2_A130BarCodPar = new String[] {""} ;
      P05VQ2_A361DisCod = new int[1] ;
      P05VQ2_A252CliCod = new int[1] ;
      P05VQ2_n252CliCod = new boolean[] {false} ;
      P05VQ2_A4466BarAcaAnh = new short[1] ;
      P05VQ2_A5291BarTipCor = new String[] {""} ;
      P05VQ2_A2829BarProPer = new String[] {""} ;
      P05VQ2_A11852Nxt_ArtCl2 = new String[] {""} ;
      P05VQ2_A11850Nxt_Mdlo2 = new String[] {""} ;
      P05VQ2_A11851Nxt_Sta2 = new String[] {""} ;
      P05VQ2_A1234BarNomCli = new String[] {""} ;
      P05VQ2_A135BarColNom = new String[] {""} ;
      P05VQ2_A1652BarSerDsc = new String[] {""} ;
      P05VQ2_A212BarSer = new String[] {""} ;
      P05VQ2_A4812BarEncCli = new String[] {""} ;
      P05VQ2_A279CliNom = new String[] {""} ;
      A5291BarTipCor = "" ;
      A2829BarProPer = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A11850Nxt_Mdlo2 = "" ;
      A11851Nxt_Sta2 = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A4812BarEncCli = "" ;
      A279CliNom = "" ;
      AV8Hdr = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new short[1] ;
      AV17Tb1_dscfb = "" ;
      GXv_char4 = new String[1] ;
      AV12DisEnt = "" ;
      AV9Tab_obs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV9Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05VQ3_A396EmprCod = new String[] {""} ;
      P05VQ3_A361DisCod = new int[1] ;
      P05VQ3_A377DisObsTxt = new String[] {""} ;
      P05VQ3_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV26Exportacion = "" ;
      AV25Cod_Idtx = "" ;
      AV19Tab_norma = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV19Tab_norma[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV20Tab_normanc = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV20Tab_normanc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV21Tab_normast = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV21Tab_normast[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16Tab_normas = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV16Tab_normas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05VQ4_A396EmprCod = new String[] {""} ;
      P05VQ4_A361DisCod = new int[1] ;
      P05VQ4_A13216DisNormDsc = new String[] {""} ;
      P05VQ4_n13216DisNormDsc = new boolean[] {false} ;
      P05VQ4_A13215DisNormNC = new String[] {""} ;
      P05VQ4_A13214DisNormSt = new String[] {""} ;
      P05VQ4_A13213DisNormID = new String[] {""} ;
      A13216DisNormDsc = "" ;
      A13215DisNormNC = "" ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      AV22Norma = "" ;
      AV27status = "" ;
      AV10Nxt_artcl2 = "" ;
      AV13Procenom = "" ;
      P05VQ5_A396EmprCod = new String[] {""} ;
      P05VQ5_A129BarCod = new int[1] ;
      P05VQ5_A132BarCodReo = new byte[1] ;
      P05VQ5_A130BarCodPar = new String[] {""} ;
      P05VQ5_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05VQ5_A44AlbRecCod = new int[1] ;
      P05VQ5_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV14lista = "" ;
      AV15relatorio = "" ;
      P05VQ6_A396EmprCod = new String[] {""} ;
      P05VQ6_A10887Cod_Idtx = new String[] {""} ;
      P05VQ6_A10888Dsc_Idtx = new String[] {""} ;
      P05VQ6_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV11Dsc_Idtx = "" ;
      P05VQ7_A970ProceCod = new short[1] ;
      P05VQ7_n970ProceCod = new boolean[] {false} ;
      P05VQ7_A396EmprCod = new String[] {""} ;
      P05VQ7_A44AlbRecCod = new int[1] ;
      P05VQ7_A971ProceNom = new String[] {""} ;
      P05VQ7_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apficcontinuidadcolor__default(),
         new Object[] {
             new Object[] {
            P05VQ2_A396EmprCod, P05VQ2_A129BarCod, P05VQ2_A132BarCodReo, P05VQ2_A130BarCodPar, P05VQ2_A361DisCod, P05VQ2_A252CliCod, P05VQ2_n252CliCod, P05VQ2_A4466BarAcaAnh, P05VQ2_A5291BarTipCor, P05VQ2_A2829BarProPer,
            P05VQ2_A11852Nxt_ArtCl2, P05VQ2_A11850Nxt_Mdlo2, P05VQ2_A11851Nxt_Sta2, P05VQ2_A1234BarNomCli, P05VQ2_A135BarColNom, P05VQ2_A1652BarSerDsc, P05VQ2_A212BarSer, P05VQ2_A4812BarEncCli, P05VQ2_A279CliNom
            }
            , new Object[] {
            P05VQ3_A396EmprCod, P05VQ3_A361DisCod, P05VQ3_A377DisObsTxt, P05VQ3_A376DisObsLin
            }
            , new Object[] {
            P05VQ4_A396EmprCod, P05VQ4_A361DisCod, P05VQ4_A13216DisNormDsc, P05VQ4_n13216DisNormDsc, P05VQ4_A13215DisNormNC, P05VQ4_A13214DisNormSt, P05VQ4_A13213DisNormID
            }
            , new Object[] {
            P05VQ5_A396EmprCod, P05VQ5_A129BarCod, P05VQ5_A132BarCodReo, P05VQ5_A130BarCodPar, P05VQ5_A203BarPieKil, P05VQ5_A44AlbRecCod, P05VQ5_A200BarPieCod
            }
            , new Object[] {
            P05VQ6_A396EmprCod, P05VQ6_A10887Cod_Idtx, P05VQ6_A10888Dsc_Idtx, P05VQ6_n10888Dsc_Idtx
            }
            , new Object[] {
            P05VQ7_A970ProceCod, P05VQ7_n970ProceCod, P05VQ7_A396EmprCod, P05VQ7_A44AlbRecCod, P05VQ7_A971ProceNom, P05VQ7_n971ProceNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18i ;
   private byte A376DisObsLin ;
   private byte AV24j ;
   private short A4466BarAcaAnh ;
   private short GXv_int3[] ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int GXv_int2[] ;
   private int GX_I ;
   private int A44AlbRecCod ;
   private int AV28Albreccod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV23ContDsc ;
   private String scmdbuf ;
   private String A5291BarTipCor ;
   private String A2829BarProPer ;
   private String A11852Nxt_ArtCl2 ;
   private String A11850Nxt_Mdlo2 ;
   private String A11851Nxt_Sta2 ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A4812BarEncCli ;
   private String A279CliNom ;
   private String AV8Hdr ;
   private String GXv_char1[] ;
   private String AV17Tb1_dscfb ;
   private String GXv_char4[] ;
   private String AV12DisEnt ;
   private String AV9Tab_obs[] ;
   private String A377DisObsTxt ;
   private String AV26Exportacion ;
   private String AV25Cod_Idtx ;
   private String AV19Tab_norma[] ;
   private String AV20Tab_normanc[] ;
   private String AV21Tab_normast[] ;
   private String AV16Tab_normas[] ;
   private String A13216DisNormDsc ;
   private String A13215DisNormNC ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String AV22Norma ;
   private String AV27status ;
   private String AV10Nxt_artcl2 ;
   private String AV13Procenom ;
   private String A200BarPieCod ;
   private String AV14lista ;
   private String AV15relatorio ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV11Dsc_Idtx ;
   private String A971ProceNom ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n13216DisNormDsc ;
   private boolean n10888Dsc_Idtx ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05VQ2_A396EmprCod ;
   private int[] P05VQ2_A129BarCod ;
   private byte[] P05VQ2_A132BarCodReo ;
   private String[] P05VQ2_A130BarCodPar ;
   private int[] P05VQ2_A361DisCod ;
   private int[] P05VQ2_A252CliCod ;
   private boolean[] P05VQ2_n252CliCod ;
   private short[] P05VQ2_A4466BarAcaAnh ;
   private String[] P05VQ2_A5291BarTipCor ;
   private String[] P05VQ2_A2829BarProPer ;
   private String[] P05VQ2_A11852Nxt_ArtCl2 ;
   private String[] P05VQ2_A11850Nxt_Mdlo2 ;
   private String[] P05VQ2_A11851Nxt_Sta2 ;
   private String[] P05VQ2_A1234BarNomCli ;
   private String[] P05VQ2_A135BarColNom ;
   private String[] P05VQ2_A1652BarSerDsc ;
   private String[] P05VQ2_A212BarSer ;
   private String[] P05VQ2_A4812BarEncCli ;
   private String[] P05VQ2_A279CliNom ;
   private String[] P05VQ3_A396EmprCod ;
   private int[] P05VQ3_A361DisCod ;
   private String[] P05VQ3_A377DisObsTxt ;
   private byte[] P05VQ3_A376DisObsLin ;
   private String[] P05VQ4_A396EmprCod ;
   private int[] P05VQ4_A361DisCod ;
   private String[] P05VQ4_A13216DisNormDsc ;
   private boolean[] P05VQ4_n13216DisNormDsc ;
   private String[] P05VQ4_A13215DisNormNC ;
   private String[] P05VQ4_A13214DisNormSt ;
   private String[] P05VQ4_A13213DisNormID ;
   private String[] P05VQ5_A396EmprCod ;
   private int[] P05VQ5_A129BarCod ;
   private byte[] P05VQ5_A132BarCodReo ;
   private String[] P05VQ5_A130BarCodPar ;
   private java.math.BigDecimal[] P05VQ5_A203BarPieKil ;
   private int[] P05VQ5_A44AlbRecCod ;
   private String[] P05VQ5_A200BarPieCod ;
   private String[] P05VQ6_A396EmprCod ;
   private String[] P05VQ6_A10887Cod_Idtx ;
   private String[] P05VQ6_A10888Dsc_Idtx ;
   private boolean[] P05VQ6_n10888Dsc_Idtx ;
   private short[] P05VQ7_A970ProceCod ;
   private boolean[] P05VQ7_n970ProceCod ;
   private String[] P05VQ7_A396EmprCod ;
   private int[] P05VQ7_A44AlbRecCod ;
   private String[] P05VQ7_A971ProceNom ;
   private boolean[] P05VQ7_n971ProceNom ;
}

final  class apficcontinuidadcolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05VQ2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.CliCod, T1.BarAcaAnh, T1.BarTipCor, T1.BarProPer, T1.Nxt_ArtCl2, T1.Nxt_Mdlo2, T1.Nxt_Sta2, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarEncCli, T2.CliNom FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05VQ3", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VQ4", "SELECT T1.EmprCod, T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormNC, T1.DisNormSt, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VQ5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VQ6", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05VQ7", "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 2);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getString(18, 30);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

