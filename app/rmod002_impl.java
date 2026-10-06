package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmod002_impl extends GXWebReport
{
   public rmod002_impl( com.genexus.internet.HttpContext context )
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
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV8PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV9UProv = (int)(GXutil.lval( httpContext.GetPar( "UProv"))) ;
            AV17PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV18Ufecha = localUtil.parseDateParm( httpContext.GetPar( "Ufecha")) ;
            AV23Prdnum1 = httpContext.GetPar( "Prdnum1") ;
            AV24Prdnum2 = httpContext.GetPar( "Prdnum2") ;
            AV15Producto = httpContext.GetPar( "Producto") ;
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
         Gx_out = "FIL" ;
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
         /* Using cursor P06P52 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06P52_A407EmprNom[0] ;
            n407EmprNom = P06P52_n407EmprNom[0] ;
            AV22NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV14TotG = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06P53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8PProv), Integer.valueOf(AV9UProv)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A795PrvNum = P06P53_A795PrvNum[0] ;
            A794PrvNom = P06P53_A794PrvNom[0] ;
            n794PrvNom = P06P53_n794PrvNom[0] ;
            A783PrvCta = P06P53_A783PrvCta[0] ;
            n783PrvCta = P06P53_n783PrvCta[0] ;
            AV10PrvNum = A795PrvNum ;
            AV12PrvNom = A794PrvNom ;
            if ( GXutil.strcmp(AV15Producto, httpContext.getMessage( "B", "")) == 0 )
            {
               AV19Cuenta = GXutil.substring( A783PrvCta, 1, 9) ;
            }
            else
            {
               AV19Cuenta = GXutil.str( AV10PrvNum, 6, 0) ;
            }
            AV11FlagProv = (byte)(0) ;
            AV13TotCant = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P06P54 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV10PrvNum), AV23Prdnum1, AV24Prdnum2});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A718PrdNom = P06P54_A718PrdNom[0] ;
               A728PrdRefPrv = P06P54_A728PrdRefPrv[0] ;
               A719PrdNum = P06P54_A719PrdNum[0] ;
               A795PrvNum = P06P54_A795PrvNum[0] ;
               A704PrdExiAlm = P06P54_A704PrdExiAlm[0] ;
               /* Using cursor P06P55 */
               pr_default.execute(3, new Object[] {A396EmprCod, AV23Prdnum1, AV17PFecha, AV18Ufecha, AV24Prdnum2});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  brk6P56 = false ;
                  A3839CcoCod = P06P55_A3839CcoCod[0] ;
                  A719PrdNum = P06P55_A719PrdNum[0] ;
                  A3345TipMovCc = P06P55_A3345TipMovCc[0] ;
                  A3353CCStkPed = P06P55_A3353CCStkPed[0] ;
                  A3840CcoDsc = P06P55_A3840CcoDsc[0] ;
                  n3840CcoDsc = P06P55_n3840CcoDsc[0] ;
                  A3348CCStkFec = P06P55_A3348CCStkFec[0] ;
                  A3344CCStkCanS = P06P55_A3344CCStkCanS[0] ;
                  A3352CCStkPar = P06P55_A3352CCStkPar[0] ;
                  A3351CCStkReo = P06P55_A3351CCStkReo[0] ;
                  A3350CCStkBar = P06P55_A3350CCStkBar[0] ;
                  A3346TipMovCn = P06P55_A3346TipMovCn[0] ;
                  n3346TipMovCn = P06P55_n3346TipMovCn[0] ;
                  A3342CCStkLin = P06P55_A3342CCStkLin[0] ;
                  A3840CcoDsc = P06P55_A3840CcoDsc[0] ;
                  n3840CcoDsc = P06P55_n3840CcoDsc[0] ;
                  A3346TipMovCn = P06P55_A3346TipMovCn[0] ;
                  n3346TipMovCn = P06P55_n3346TipMovCn[0] ;
                  if ( AV11FlagProv == 0 )
                  {
                     AV11FlagProv = (byte)(1) ;
                     h6P50( false, 38) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Fornecedor:", ""), 57, Gx_line+11, 129, Gx_line+25, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12PrvNom, "")), 211, Gx_line+10, 431, Gx_line+27, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Cuenta, "")), 133, Gx_line+10, 205, Gx_line+26, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+38) ;
                  }
                  AV16PrdNum = A719PrdNum ;
                  AV21PrdNom = A718PrdNom ;
                  if ( GXutil.strcmp(AV15Producto, httpContext.getMessage( "B", "")) == 0 )
                  {
                     AV16PrdNum = GXutil.substring( A728PrdRefPrv, 1, 6) ;
                  }
                  AV20TotPrd = DecimalUtil.doubleToDec(0) ;
                  while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P06P55_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06P55_A719PrdNum[0], A719PrdNum) == 0 ) )
                  {
                     brk6P56 = false ;
                     A3839CcoCod = P06P55_A3839CcoCod[0] ;
                     A3345TipMovCc = P06P55_A3345TipMovCc[0] ;
                     A3353CCStkPed = P06P55_A3353CCStkPed[0] ;
                     A3840CcoDsc = P06P55_A3840CcoDsc[0] ;
                     n3840CcoDsc = P06P55_n3840CcoDsc[0] ;
                     A3348CCStkFec = P06P55_A3348CCStkFec[0] ;
                     A3344CCStkCanS = P06P55_A3344CCStkCanS[0] ;
                     A3352CCStkPar = P06P55_A3352CCStkPar[0] ;
                     A3351CCStkReo = P06P55_A3351CCStkReo[0] ;
                     A3350CCStkBar = P06P55_A3350CCStkBar[0] ;
                     A3346TipMovCn = P06P55_A3346TipMovCn[0] ;
                     n3346TipMovCn = P06P55_n3346TipMovCn[0] ;
                     A3342CCStkLin = P06P55_A3342CCStkLin[0] ;
                     A3840CcoDsc = P06P55_A3840CcoDsc[0] ;
                     n3840CcoDsc = P06P55_n3840CcoDsc[0] ;
                     A3346TipMovCn = P06P55_A3346TipMovCn[0] ;
                     n3346TipMovCn = P06P55_n3346TipMovCn[0] ;
                     if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
                     {
                        h6P50( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16PrdNum, "")), 22, Gx_line+0, 67, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21PrdNom, "")), 79, Gx_line+1, 270, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999")), 280, Gx_line+0, 369, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A3348CCStkFec, "99/99/99"), 374, Gx_line+1, 433, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3840CcoDsc, "")), 530, Gx_line+1, 750, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3353CCStkPed), "ZZZZZZZ9")), 436, Gx_line+1, 495, Gx_line+18, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        h6P50( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16PrdNum, "")), 20, Gx_line+0, 65, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21PrdNom, "")), 77, Gx_line+1, 268, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999")), 278, Gx_line+0, 367, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A3348CCStkFec, "99/99/99"), 372, Gx_line+1, 431, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3346TipMovCn, "")), 528, Gx_line+1, 748, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3350CCStkBar), "ZZZZZZZ9")), 436, Gx_line+1, 495, Gx_line+18, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3351CCStkReo), "9")), 501, Gx_line+1, 509, Gx_line+18, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3352CCStkPar, "")), 515, Gx_line+1, 523, Gx_line+18, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     AV20TotPrd = AV20TotPrd.add(A3344CCStkCanS) ;
                     brk6P56 = true ;
                     pr_default.readNext(3);
                  }
                  h6P50( false, 27) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TotPrd, "Z,ZZZ,ZZ9.9999")), 264, Gx_line+6, 367, Gx_line+23, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
                  AV13TotCant = AV13TotCant.add(AV20TotPrd) ;
                  AV14TotG = AV14TotG.add(AV20TotPrd) ;
                  if ( ! brk6P56 )
                  {
                     brk6P56 = true ;
                     pr_default.readNext(3);
                  }
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV13TotCant.doubleValue() > 0 )
            {
               h6P50( false, 36) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SUB TOTAL", ""), 115, Gx_line+14, 188, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13TotCant, "Z,ZZZ,ZZ9.9999")), 264, Gx_line+13, 367, Gx_line+30, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+36) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV14TotG.doubleValue() > 0 )
         {
            h6P50( false, 33) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 145, Gx_line+16, 188, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14TotG, "Z,ZZZ,ZZ9.9999")), 264, Gx_line+15, 367, Gx_line+32, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6P50( true, 0) ;
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

   public void h6P50( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SAIDA DE PRODUTOS DE STOCK", ""), 24, Gx_line+50, 203, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DATA:", ""), 638, Gx_line+14, 678, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 686, Gx_line+14, 745, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PAGINA:", ""), 580, Gx_line+50, 633, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 642, Gx_line+49, 687, Gx_line+66, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+76, 749, Gx_line+76, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 20, Gx_line+91, 67, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 77, Gx_line+91, 137, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 297, Gx_line+91, 366, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 401, Gx_line+91, 430, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Movimento", ""), 521, Gx_line+91, 616, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+104, 746, Gx_line+104, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº O.S.", ""), 449, Gx_line+91, 495, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 708, Gx_line+49, 744, Gx_line+66, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 694, Gx_line+50, 701, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22NomEmp, "")), 14, Gx_line+14, 265, Gx_line+35, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+113) ;
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
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      A396EmprCod = "" ;
      AV17PFecha = GXutil.nullDate() ;
      AV18Ufecha = GXutil.nullDate() ;
      AV23Prdnum1 = "" ;
      AV24Prdnum2 = "" ;
      AV15Producto = "" ;
      scmdbuf = "" ;
      P06P52_A396EmprCod = new String[] {""} ;
      P06P52_A407EmprNom = new String[] {""} ;
      P06P52_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV22NomEmp = "" ;
      AV14TotG = DecimalUtil.ZERO ;
      P06P53_A396EmprCod = new String[] {""} ;
      P06P53_A795PrvNum = new int[1] ;
      P06P53_A794PrvNom = new String[] {""} ;
      P06P53_n794PrvNom = new boolean[] {false} ;
      P06P53_A783PrvCta = new String[] {""} ;
      P06P53_n783PrvCta = new boolean[] {false} ;
      A794PrvNom = "" ;
      A783PrvCta = "" ;
      AV12PrvNom = "" ;
      AV19Cuenta = "" ;
      AV13TotCant = DecimalUtil.ZERO ;
      P06P54_A396EmprCod = new String[] {""} ;
      P06P54_A718PrdNom = new String[] {""} ;
      P06P54_A728PrdRefPrv = new String[] {""} ;
      P06P54_A719PrdNum = new String[] {""} ;
      P06P54_A795PrvNum = new int[1] ;
      P06P54_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A718PrdNom = "" ;
      A728PrdRefPrv = "" ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      P06P55_A3839CcoCod = new short[1] ;
      P06P55_A396EmprCod = new String[] {""} ;
      P06P55_A719PrdNum = new String[] {""} ;
      P06P55_A3345TipMovCc = new String[] {""} ;
      P06P55_A3353CCStkPed = new int[1] ;
      P06P55_A3840CcoDsc = new String[] {""} ;
      P06P55_n3840CcoDsc = new boolean[] {false} ;
      P06P55_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06P55_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P55_A3352CCStkPar = new String[] {""} ;
      P06P55_A3351CCStkReo = new byte[1] ;
      P06P55_A3350CCStkBar = new int[1] ;
      P06P55_A3346TipMovCn = new String[] {""} ;
      P06P55_n3346TipMovCn = new boolean[] {false} ;
      P06P55_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3840CcoDsc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3346TipMovCn = "" ;
      AV16PrdNum = "" ;
      AV21PrdNom = "" ;
      AV20TotPrd = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rmod002__default(),
         new Object[] {
             new Object[] {
            P06P52_A396EmprCod, P06P52_A407EmprNom, P06P52_n407EmprNom
            }
            , new Object[] {
            P06P53_A396EmprCod, P06P53_A795PrvNum, P06P53_A794PrvNom, P06P53_n794PrvNom, P06P53_A783PrvCta, P06P53_n783PrvCta
            }
            , new Object[] {
            P06P54_A396EmprCod, P06P54_A718PrdNom, P06P54_A728PrdRefPrv, P06P54_A719PrdNum, P06P54_A795PrvNum, P06P54_A704PrdExiAlm
            }
            , new Object[] {
            P06P55_A3839CcoCod, P06P55_A396EmprCod, P06P55_A719PrdNum, P06P55_A3345TipMovCc, P06P55_A3353CCStkPed, P06P55_A3840CcoDsc, P06P55_n3840CcoDsc, P06P55_A3348CCStkFec, P06P55_A3344CCStkCanS, P06P55_A3352CCStkPar,
            P06P55_A3351CCStkReo, P06P55_A3350CCStkBar, P06P55_A3346TipMovCn, P06P55_n3346TipMovCn, P06P55_A3342CCStkLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV11FlagProv ;
   private byte A3351CCStkReo ;
   private short gxcookieaux ;
   private short A3839CcoCod ;
   private short Gx_err ;
   private int AV8PProv ;
   private int AV9UProv ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int AV10PrvNum ;
   private int A3353CCStkPed ;
   private int A3350CCStkBar ;
   private int Gx_OldLine ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV14TotG ;
   private java.math.BigDecimal AV13TotCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV20TotPrd ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV23Prdnum1 ;
   private String AV24Prdnum2 ;
   private String AV15Producto ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV22NomEmp ;
   private String A794PrvNom ;
   private String A783PrvCta ;
   private String AV12PrvNom ;
   private String AV19Cuenta ;
   private String A718PrdNom ;
   private String A728PrdRefPrv ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3840CcoDsc ;
   private String A3352CCStkPar ;
   private String A3346TipMovCn ;
   private String AV16PrdNum ;
   private String AV21PrdNom ;
   private java.util.Date AV17PFecha ;
   private java.util.Date AV18Ufecha ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean n783PrvCta ;
   private boolean brk6P56 ;
   private boolean n3840CcoDsc ;
   private boolean n3346TipMovCn ;
   private IDataStoreProvider pr_default ;
   private String[] P06P52_A396EmprCod ;
   private String[] P06P52_A407EmprNom ;
   private boolean[] P06P52_n407EmprNom ;
   private String[] P06P53_A396EmprCod ;
   private int[] P06P53_A795PrvNum ;
   private String[] P06P53_A794PrvNom ;
   private boolean[] P06P53_n794PrvNom ;
   private String[] P06P53_A783PrvCta ;
   private boolean[] P06P53_n783PrvCta ;
   private String[] P06P54_A396EmprCod ;
   private String[] P06P54_A718PrdNom ;
   private String[] P06P54_A728PrdRefPrv ;
   private String[] P06P54_A719PrdNum ;
   private int[] P06P54_A795PrvNum ;
   private java.math.BigDecimal[] P06P54_A704PrdExiAlm ;
   private short[] P06P55_A3839CcoCod ;
   private String[] P06P55_A396EmprCod ;
   private String[] P06P55_A719PrdNum ;
   private String[] P06P55_A3345TipMovCc ;
   private int[] P06P55_A3353CCStkPed ;
   private String[] P06P55_A3840CcoDsc ;
   private boolean[] P06P55_n3840CcoDsc ;
   private java.util.Date[] P06P55_A3348CCStkFec ;
   private java.math.BigDecimal[] P06P55_A3344CCStkCanS ;
   private String[] P06P55_A3352CCStkPar ;
   private byte[] P06P55_A3351CCStkReo ;
   private int[] P06P55_A3350CCStkBar ;
   private String[] P06P55_A3346TipMovCn ;
   private boolean[] P06P55_n3346TipMovCn ;
   private long[] P06P55_A3342CCStkLin ;
}

final  class rmod002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06P52", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06P53", "SELECT EmprCod, PrvNum, PrvNom, PrvCta FROM TXPPRVGEN WHERE (EmprCod = ? and PrvNum >= ?) AND (PrvNum <= ?) ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P54", "SELECT EmprCod, PrdNom, PrdRefPrv, PrdNum, PrvNum, PrdExiAlm FROM TXPPRODUC WHERE (EmprCod = ? and PrvNum = ?) AND (PrdNum >= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P55", "SELECT T1.CcoCod, T1.EmprCod, T1.PrdNum, T1.TipMovCc, T1.CCStkPed, T2.CcoDsc, T1.CCStkFec, T1.CCStkCanS, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T3.TipMovCn, T1.CCStkLin FROM ((TXPCCSTKS T1 INNER JOIN TXPCENTCO T2 ON T2.CcoCod = T1.CcoCod) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) WHERE (T1.EmprCod = ? and T1.PrdNum >= ?) AND (T1.CCStkFec >= ? and T1.CCStkFec <= ?) AND (T1.CCStkCanS > 0) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(13);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

