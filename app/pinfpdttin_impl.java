package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pinfpdttin_impl extends GXWebReport
{
   public pinfpdttin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV45EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV29Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
            AV30Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
            AV44CliCodIN = (int)(GXutil.lval( httpContext.GetPar( "CliCodIN"))) ;
            AV26BarColNomIn = httpContext.GetPar( "BarColNomIn") ;
            AV27BarEnccliIN = httpContext.GetPar( "BarEnccliIN") ;
            AV23BarcodIn = (int)(GXutil.lval( httpContext.GetPar( "BarcodIn"))) ;
            AV25BarcodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIN"))) ;
            AV24BarcodparIN = httpContext.GetPar( "BarcodparIN") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "SCR" ;
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
         /* Using cursor P05YN2 */
         pr_default.execute(0, new Object[] {AV45EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P05YN2_A396EmprCod[0] ;
            A407EmprNom = P05YN2_A407EmprNom[0] ;
            n407EmprNom = P05YN2_n407EmprNom[0] ;
            AV48Emprnom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV46Nhdrs = 0 ;
         AV47TotKgs = DecimalUtil.doubleToDec(0) ;
         AV30Fec2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30Fec2)) ? GXutil.today( ) : AV30Fec2) ;
         System.out.println( httpContext.getMessage( "Lectura de HDRs pendientes de Planificar", "") );
         lV26BarColNomIn = GXutil.padr( GXutil.rtrim( AV26BarColNomIn), 13, "%") ;
         /* Using cursor P05YN5 */
         pr_default.execute(1, new Object[] {AV45EmprCod, AV29Fec1, Integer.valueOf(AV44CliCodIN), Integer.valueOf(AV44CliCodIN), lV26BarColNomIn, AV26BarColNomIn, AV27BarEnccliIN, AV27BarEnccliIN, AV27BarEnccliIN, Integer.valueOf(AV23BarcodIn), Integer.valueOf(AV23BarcodIn), Byte.valueOf(AV25BarcodreoIN), Byte.valueOf(AV25BarcodreoIN), AV24BarcodparIN, AV24BarcodparIN, AV30Fec2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P05YN5_A396EmprCod[0] ;
            A130BarCodPar = P05YN5_A130BarCodPar[0] ;
            A132BarCodReo = P05YN5_A132BarCodReo[0] ;
            A129BarCod = P05YN5_A129BarCod[0] ;
            A143BarDisNum = P05YN5_A143BarDisNum[0] ;
            A4812BarEncCli = P05YN5_A4812BarEncCli[0] ;
            A135BarColNom = P05YN5_A135BarColNom[0] ;
            A252CliCod = P05YN5_A252CliCod[0] ;
            n252CliCod = P05YN5_n252CliCod[0] ;
            A159BarFecGen = P05YN5_A159BarFecGen[0] ;
            A180BarMaqCod = P05YN5_A180BarMaqCod[0] ;
            A213BarSit = P05YN5_A213BarSit[0] ;
            A120BarAgrEst = P05YN5_A120BarAgrEst[0] ;
            A1652BarSerDsc = P05YN5_A1652BarSerDsc[0] ;
            A1234BarNomCli = P05YN5_A1234BarNomCli[0] ;
            A279CliNom = P05YN5_A279CliNom[0] ;
            A166BarKgm = P05YN5_A166BarKgm[0] ;
            A219BarTotAgr = P05YN5_A219BarTotAgr[0] ;
            n219BarTotAgr = P05YN5_n219BarTotAgr[0] ;
            A166BarKgm = P05YN5_A166BarKgm[0] ;
            A219BarTotAgr = P05YN5_A219BarTotAgr[0] ;
            n219BarTotAgr = P05YN5_n219BarTotAgr[0] ;
            A279CliNom = P05YN5_A279CliNom[0] ;
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            AV31Barcodm = A129BarCod ;
            AV33Barcodreom = A132BarCodReo ;
            AV32Barcodparm = A130BarCodPar ;
            AV58Op = "" ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV31Barcodm, AV33Barcodreom, AV32Barcodparm) ;
               if ( ( A129BarCod == AV31Barcodm ) && ( A132BarCodReo == AV33Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV32Barcodparm) == 0 ) )
               {
                  AV58Op = "*" ;
               }
            }
            else
            {
               AV58Op = "*" ;
            }
            AV34Barcod = A129BarCod ;
            AV36Barcodreo = A132BarCodReo ;
            AV35Barcodpar = A130BarCodPar ;
            /* Execute user subroutine: 'BARFAS' */
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
            GXv_char1[0] = AV45EmprCod ;
            GXv_int2[0] = AV34Barcod ;
            GXv_int3[0] = AV36Barcodreo ;
            GXv_char4[0] = AV35Barcodpar ;
            GXv_int5[0] = AV40Barordlin ;
            GXv_char6[0] = " " ;
            GXv_int7[0] = (byte)(0) ;
            GXv_char8[0] = " " ;
            GXv_int9[0] = (short)(0) ;
            GXv_char10[0] = " " ;
            GXv_int11[0] = AV39BarFasEstSig ;
            GXv_char12[0] = " " ;
            GXv_int13[0] = (short)(0) ;
            new app.pprc39(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_int7, GXv_char8, GXv_int9, GXv_char10, GXv_int11, GXv_char12, GXv_int13) ;
            pinfpdttin_impl.this.AV45EmprCod = GXv_char1[0] ;
            pinfpdttin_impl.this.AV34Barcod = GXv_int2[0] ;
            pinfpdttin_impl.this.AV36Barcodreo = GXv_int3[0] ;
            pinfpdttin_impl.this.AV35Barcodpar = GXv_char4[0] ;
            pinfpdttin_impl.this.AV40Barordlin = GXv_int5[0] ;
            pinfpdttin_impl.this.AV39BarFasEstSig = GXv_int11[0] ;
            GXv_char12[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int11[0] = A132BarCodReo ;
            GXv_char10[0] = A130BarCodPar ;
            GXv_int7[0] = AV38BarFasEstgrid ;
            GXv_date14[0] = AV41fecha ;
            GXv_char8[0] = " " ;
            GXv_char6[0] = AV37BarFacTingrid ;
            new app.ptintefase(remoteHandle, context).execute( GXv_char12, GXv_int2, GXv_int11, GXv_char10, GXv_int7, GXv_date14, GXv_char8, GXv_char6) ;
            pinfpdttin_impl.this.A396EmprCod = GXv_char12[0] ;
            pinfpdttin_impl.this.A129BarCod = GXv_int2[0] ;
            pinfpdttin_impl.this.A132BarCodReo = GXv_int11[0] ;
            pinfpdttin_impl.this.A130BarCodPar = GXv_char10[0] ;
            pinfpdttin_impl.this.AV38BarFasEstgrid = GXv_int7[0] ;
            pinfpdttin_impl.this.AV41fecha = GXv_date14[0] ;
            pinfpdttin_impl.this.AV37BarFacTingrid = GXv_char6[0] ;
            AV42Hdrmngrid = GXutil.str( AV31Barcodm, 8, 0) + "-" + GXutil.str( AV33Barcodreom, 1, 0) + AV32Barcodparm ;
            GXv_int2[0] = AV43Maccod ;
            new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
            pinfpdttin_impl.this.AV43Maccod = GXv_int2[0] ;
            if ( GXutil.strcmp(AV58Op, "*") == 0 )
            {
               if ( GXutil.strcmp(AV37BarFacTingrid, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( AV38BarFasEstgrid == 0 )
                  {
                     if ( AV39BarFasEstSig == 0 )
                     {
                        h5YN0( false, 18) ;
                        getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 15, Gx_line+0, 62, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 63, Gx_line+0, 252, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 256, Gx_line+0, 338, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A812RecTotKgm, "ZZZZZZ9.99")), 575, Gx_line+0, 639, Gx_line+15, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Hdrmngrid, "")), 644, Gx_line+0, 714, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 513, Gx_line+0, 570, Gx_line+15, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 344, Gx_line+0, 508, Gx_line+15, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+18) ;
                        AV47TotKgs = AV47TotKgs.add(A812RecTotKgm) ;
                        AV46Nhdrs = (long)(AV46Nhdrs+1) ;
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV47TotKgs.doubleValue() > 0 )
         {
            h5YN0( false, 27) ;
            getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TotKgs, "ZZZZZZ9.99")), 575, Gx_line+14, 639, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total OSs", ""), 450, Gx_line+14, 493, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46Nhdrs), "ZZZZZZZZZ9")), 500, Gx_line+14, 564, Gx_line+29, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5YN0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV40Barordlin = (short)(0) ;
      /* Using cursor P05YN6 */
      pr_default.execute(2, new Object[] {AV45EmprCod, Integer.valueOf(AV34Barcod), Byte.valueOf(AV36Barcodreo), AV35Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A150BarFacTin = P05YN6_A150BarFacTin[0] ;
         A130BarCodPar = P05YN6_A130BarCodPar[0] ;
         A132BarCodReo = P05YN6_A132BarCodReo[0] ;
         A129BarCod = P05YN6_A129BarCod[0] ;
         A396EmprCod = P05YN6_A396EmprCod[0] ;
         A194BarOrdLin = P05YN6_A194BarOrdLin[0] ;
         A758ProCod = P05YN6_A758ProCod[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV40Barordlin = A194BarOrdLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void h5YN0( boolean bFoot ,
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
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data OS", ""), 15, Gx_line+67, 52, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 63, Gx_line+68, 99, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor Cliente", ""), 256, Gx_line+68, 311, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 553, Gx_line+68, 570, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 672, Gx_line+68, 686, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs Tot", ""), 605, Gx_line+68, 638, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+81, 61, Gx_line+81, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(63, Gx_line+81, 251, Gx_line+81, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(256, Gx_line+81, 337, Gx_line+81, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(513, Gx_line+81, 569, Gx_line+81, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(575, Gx_line+81, 638, Gx_line+81, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(644, Gx_line+81, 713, Gx_line+81, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Emprnom, "")), 6, Gx_line+0, 257, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 669, Gx_line+14, 753, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 619, Gx_line+14, 666, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 619, Gx_line+41, 658, Gx_line+56, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 663, Gx_line+41, 708, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 656, Gx_line+41, 662, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+60, 782, Gx_line+60, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Pgmdesc, "")), 6, Gx_line+41, 195, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 344, Gx_line+67, 374, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(344, Gx_line+80, 507, Gx_line+80, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora", ""), 563, Gx_line+14, 606, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Paginas", ""), 569, Gx_line+41, 605, Gx_line+55, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+84) ;
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
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV45EmprCod = "" ;
      AV29Fec1 = GXutil.nullDate() ;
      AV30Fec2 = GXutil.nullDate() ;
      AV26BarColNomIn = "" ;
      AV27BarEnccliIN = "" ;
      AV24BarcodparIN = "" ;
      scmdbuf = "" ;
      P05YN2_A396EmprCod = new String[] {""} ;
      P05YN2_A407EmprNom = new String[] {""} ;
      P05YN2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV48Emprnom = "" ;
      AV47TotKgs = DecimalUtil.ZERO ;
      lV26BarColNomIn = "" ;
      P05YN5_A396EmprCod = new String[] {""} ;
      P05YN5_A130BarCodPar = new String[] {""} ;
      P05YN5_A132BarCodReo = new byte[1] ;
      P05YN5_A129BarCod = new int[1] ;
      P05YN5_A143BarDisNum = new String[] {""} ;
      P05YN5_A4812BarEncCli = new String[] {""} ;
      P05YN5_A135BarColNom = new String[] {""} ;
      P05YN5_A252CliCod = new int[1] ;
      P05YN5_n252CliCod = new boolean[] {false} ;
      P05YN5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05YN5_A180BarMaqCod = new String[] {""} ;
      P05YN5_A213BarSit = new byte[1] ;
      P05YN5_A120BarAgrEst = new String[] {""} ;
      P05YN5_A1652BarSerDsc = new String[] {""} ;
      P05YN5_A1234BarNomCli = new String[] {""} ;
      P05YN5_A279CliNom = new String[] {""} ;
      P05YN5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05YN5_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05YN5_n219BarTotAgr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A279CliNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV32Barcodparm = "" ;
      AV58Op = "" ;
      AV35Barcodpar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_int9 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_char12 = new String[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_int7 = new byte[1] ;
      AV41fecha = GXutil.nullDate() ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_char8 = new String[1] ;
      AV37BarFacTingrid = "" ;
      GXv_char6 = new String[1] ;
      AV42Hdrmngrid = "" ;
      GXv_int2 = new int[1] ;
      P05YN6_A150BarFacTin = new String[] {""} ;
      P05YN6_A130BarCodPar = new String[] {""} ;
      P05YN6_A132BarCodReo = new byte[1] ;
      P05YN6_A129BarCod = new int[1] ;
      P05YN6_A396EmprCod = new String[] {""} ;
      P05YN6_A194BarOrdLin = new short[1] ;
      P05YN6_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV56Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinfpdttin__default(),
         new Object[] {
             new Object[] {
            P05YN2_A396EmprCod, P05YN2_A407EmprNom, P05YN2_n407EmprNom
            }
            , new Object[] {
            P05YN5_A396EmprCod, P05YN5_A130BarCodPar, P05YN5_A132BarCodReo, P05YN5_A129BarCod, P05YN5_A143BarDisNum, P05YN5_A4812BarEncCli, P05YN5_A135BarColNom, P05YN5_A252CliCod, P05YN5_n252CliCod, P05YN5_A159BarFecGen,
            P05YN5_A180BarMaqCod, P05YN5_A213BarSit, P05YN5_A120BarAgrEst, P05YN5_A1652BarSerDsc, P05YN5_A1234BarNomCli, P05YN5_A279CliNom, P05YN5_A166BarKgm, P05YN5_A219BarTotAgr, P05YN5_n219BarTotAgr
            }
            , new Object[] {
            P05YN6_A150BarFacTin, P05YN6_A130BarCodPar, P05YN6_A132BarCodReo, P05YN6_A129BarCod, P05YN6_A396EmprCod, P05YN6_A194BarOrdLin, P05YN6_A758ProCod
            }
         }
      );
      AV56Pgmdesc = httpContext.getMessage( "Informe HDRs pendientes TINTE", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV56Pgmdesc = httpContext.getMessage( "Informe HDRs pendientes TINTE", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
      AV49NomInf = httpContext.getMessage( httpContext.getMessage( "Informe de Hdrs", ""), "") + httpContext.getMessage( httpContext.getMessage( ".pdf", ""), "") ;
   }

   private byte AV25BarcodreoIN ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV33Barcodreom ;
   private byte AV36Barcodreo ;
   private byte GXv_int3[] ;
   private byte AV39BarFasEstSig ;
   private byte GXv_int11[] ;
   private byte AV38BarFasEstgrid ;
   private byte GXv_int7[] ;
   private short gxcookieaux ;
   private short AV40Barordlin ;
   private short GXv_int5[] ;
   private short GXv_int9[] ;
   private short GXv_int13[] ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV44CliCodIN ;
   private int AV23BarcodIn ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV31Barcodm ;
   private int AV34Barcod ;
   private int AV43Maccod ;
   private int GXv_int2[] ;
   private int Gx_OldLine ;
   private long AV46Nhdrs ;
   private java.math.BigDecimal AV47TotKgs ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV45EmprCod ;
   private String AV26BarColNomIn ;
   private String AV27BarEnccliIN ;
   private String AV24BarcodparIN ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV48Emprnom ;
   private String lV26BarColNomIn ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A135BarColNom ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A279CliNom ;
   private String AV32Barcodparm ;
   private String AV58Op ;
   private String AV35Barcodpar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char12[] ;
   private String GXv_char10[] ;
   private String GXv_char8[] ;
   private String AV37BarFacTingrid ;
   private String GXv_char6[] ;
   private String AV42Hdrmngrid ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String Gx_time ;
   private String AV56Pgmdesc ;
   private String AV49NomInf ;
   private java.util.Date AV29Fec1 ;
   private java.util.Date AV30Fec2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV41fecha ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n219BarTotAgr ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P05YN2_A396EmprCod ;
   private String[] P05YN2_A407EmprNom ;
   private boolean[] P05YN2_n407EmprNom ;
   private String[] P05YN5_A396EmprCod ;
   private String[] P05YN5_A130BarCodPar ;
   private byte[] P05YN5_A132BarCodReo ;
   private int[] P05YN5_A129BarCod ;
   private String[] P05YN5_A143BarDisNum ;
   private String[] P05YN5_A4812BarEncCli ;
   private String[] P05YN5_A135BarColNom ;
   private int[] P05YN5_A252CliCod ;
   private boolean[] P05YN5_n252CliCod ;
   private java.util.Date[] P05YN5_A159BarFecGen ;
   private String[] P05YN5_A180BarMaqCod ;
   private byte[] P05YN5_A213BarSit ;
   private String[] P05YN5_A120BarAgrEst ;
   private String[] P05YN5_A1652BarSerDsc ;
   private String[] P05YN5_A1234BarNomCli ;
   private String[] P05YN5_A279CliNom ;
   private java.math.BigDecimal[] P05YN5_A166BarKgm ;
   private java.math.BigDecimal[] P05YN5_A219BarTotAgr ;
   private boolean[] P05YN5_n219BarTotAgr ;
   private String[] P05YN6_A150BarFacTin ;
   private String[] P05YN6_A130BarCodPar ;
   private byte[] P05YN6_A132BarCodReo ;
   private int[] P05YN6_A129BarCod ;
   private String[] P05YN6_A396EmprCod ;
   private short[] P05YN6_A194BarOrdLin ;
   private String[] P05YN6_A758ProCod ;
}

final  class pinfpdttin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05YN2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05YN5", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.BarColNom, T1.CliCod, T1.BarFecGen, T1.BarMaqCod, T1.BarSit, T1.BarAgrEst, T1.BarSerDsc, T1.BarNomCli, T4.CliNom, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr FROM (((TXPBARCAD T1 LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.BarFecGen >= ?) AND (T1.BarSit < 4) AND ((rtrim(T1.BarMaqCod) IS NULL AND NOT(T1.BarMaqCod IS NULL))) AND (T1.CliCod = ? or (? = 0)) AND (T1.BarColNom like ? or (rtrim(?) IS NULL)) AND (( ( T1.BarEncCli = ? and Not (rtrim(T1.BarEncCli) IS NULL AND NOT(T1.BarEncCli IS NULL))) or ( T1.BarDisNum = ? and (rtrim(T1.BarEncCli) IS NULL AND NOT(T1.BarEncCli IS NULL)))) or (rtrim(?) IS NULL)) AND (T1.BarCod = ? or (? = 0)) AND (T1.BarCodReo = ? or (? = 0)) AND (T1.BarCodPar = ? or (rtrim(?) IS NULL)) AND (T1.BarFecGen <= ?) ORDER BY T1.EmprCod, T1.BarFecGen, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05YN6", "SELECT BarFacTin, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 30);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 20);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setDate(16, (java.util.Date)parms[15]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

