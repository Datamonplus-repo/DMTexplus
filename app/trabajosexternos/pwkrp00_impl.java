package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pwkrp00_impl extends GXWebReport
{
   public pwkrp00_impl( com.genexus.internet.HttpContext context )
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
            AV88Pman = (short)(GXutil.lval( httpContext.GetPar( "Pman"))) ;
            AV101Uman2 = (short)(GXutil.lval( httpContext.GetPar( "Uman2"))) ;
            AV87PAlbFch = localUtil.parseDateParm( httpContext.GetPar( "PAlbFch")) ;
            AV99UFecha2 = localUtil.parseDateParm( httpContext.GetPar( "UFecha2")) ;
            AV89POpe = httpContext.GetPar( "POpe") ;
            AV103UOpe2 = httpContext.GetPar( "UOpe2") ;
            AV94TipPapel = httpContext.GetPar( "TipPapel") ;
            AV72Fuente = (byte)(GXutil.lval( httpContext.GetPar( "Fuente"))) ;
            AV97Trab = httpContext.GetPar( "Trab") ;
            AV75ImpCod = httpContext.GetPar( "ImpCod") ;
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
      M_bot = 6 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         /* Using cursor P05WZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05WZ2_A407EmprNom[0] ;
            n407EmprNom = P05WZ2_n407EmprNom[0] ;
            AV60EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV96TotKgsR = DecimalUtil.ZERO ;
         AV69FlagL = (byte)(0) ;
         AV70FlagM = (byte)(0) ;
         AV66FechaE = GXutil.nullDate() ;
         AV67FechaR = GXutil.nullDate() ;
         AV71FlagO = (byte)(0) ;
         AV108LastMancod = (short)(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV88Pman) ,
                                              Short.valueOf(AV101Uman2) ,
                                              AV89POpe ,
                                              AV103UOpe2 ,
                                              AV87PAlbFch ,
                                              AV99UFecha2 ,
                                              Short.valueOf(A2248ManCod) ,
                                              A2689ExHdrFas ,
                                              A2700ExHdrFeR ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING
                                              }
         });
         /* Using cursor P05WZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV88Pman), Short.valueOf(AV101Uman2), AV89POpe, AV103UOpe2, AV87PAlbFch, AV99UFecha2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2249ManNom = P05WZ3_A2249ManNom[0] ;
            n2249ManNom = P05WZ3_n2249ManNom[0] ;
            A2694ExHdrAlb = P05WZ3_A2694ExHdrAlb[0] ;
            n2694ExHdrAlb = P05WZ3_n2694ExHdrAlb[0] ;
            A228BarUniMed = P05WZ3_A228BarUniMed[0] ;
            A279CliNom = P05WZ3_A279CliNom[0] ;
            A2748CliAlias = P05WZ3_A2748CliAlias[0] ;
            A2700ExHdrFeR = P05WZ3_A2700ExHdrFeR[0] ;
            n2700ExHdrFeR = P05WZ3_n2700ExHdrFeR[0] ;
            A2845ExHdrMtR = P05WZ3_A2845ExHdrMtR[0] ;
            n2845ExHdrMtR = P05WZ3_n2845ExHdrMtR[0] ;
            A2698ExHdrKgR = P05WZ3_A2698ExHdrKgR[0] ;
            n2698ExHdrKgR = P05WZ3_n2698ExHdrKgR[0] ;
            A2699ExHdrCnR = P05WZ3_A2699ExHdrCnR[0] ;
            n2699ExHdrCnR = P05WZ3_n2699ExHdrCnR[0] ;
            A212BarSer = P05WZ3_A212BarSer[0] ;
            A252CliCod = P05WZ3_A252CliCod[0] ;
            n252CliCod = P05WZ3_n252CliCod[0] ;
            A4812BarEncCli = P05WZ3_A4812BarEncCli[0] ;
            A2693ExHdrTip = P05WZ3_A2693ExHdrTip[0] ;
            n2693ExHdrTip = P05WZ3_n2693ExHdrTip[0] ;
            A130BarCodPar = P05WZ3_A130BarCodPar[0] ;
            n130BarCodPar = P05WZ3_n130BarCodPar[0] ;
            A132BarCodReo = P05WZ3_A132BarCodReo[0] ;
            n132BarCodReo = P05WZ3_n132BarCodReo[0] ;
            A129BarCod = P05WZ3_A129BarCod[0] ;
            n129BarCod = P05WZ3_n129BarCod[0] ;
            A2689ExHdrFas = P05WZ3_A2689ExHdrFas[0] ;
            A2248ManCod = P05WZ3_A2248ManCod[0] ;
            A2692ExHdrLin = P05WZ3_A2692ExHdrLin[0] ;
            A228BarUniMed = P05WZ3_A228BarUniMed[0] ;
            A212BarSer = P05WZ3_A212BarSer[0] ;
            A252CliCod = P05WZ3_A252CliCod[0] ;
            n252CliCod = P05WZ3_n252CliCod[0] ;
            A4812BarEncCli = P05WZ3_A4812BarEncCli[0] ;
            A279CliNom = P05WZ3_A279CliNom[0] ;
            A2748CliAlias = P05WZ3_A2748CliAlias[0] ;
            A2249ManNom = P05WZ3_A2249ManNom[0] ;
            n2249ManNom = P05WZ3_n2249ManNom[0] ;
            AV83ManNom = A2249ManNom ;
            if ( A2248ManCod != AV108LastMancod )
            {
               h5WZ0( false, 14) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")), 135, Gx_line+0, 157, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83ManNom, "")), 163, Gx_line+0, 320, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Manufacturador", ""), 54, Gx_line+0, 128, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+14) ;
            }
            AV74HojaRuta = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            if ( ( GXutil.strcmp(AV74HojaRuta, AV76LastHdr) != 0 ) && ( GXutil.strcmp(AV76LastHdr, " ") != 0 ) )
            {
               /* Execute user subroutine: 'DIF' */
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
            }
            AV52BarCod = A129BarCod ;
            AV54BarCodReo = A132BarCodReo ;
            AV53BarCodPar = A130BarCodPar ;
            AV90SalExtAlb = A2694ExHdrAlb ;
            AV106BarUnimed = A228BarUniMed ;
            GXv_char1[0] = AV64fasdsc ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A2689ExHdrFas, GXv_char1) ;
            pwkrp00_impl.this.AV64fasdsc = GXv_char1[0] ;
            AV56Ctrl_1 = GXutil.str( A2248ManCod, 4, 0) + A2689ExHdrFas + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            if ( ( ( GXutil.strcmp(AV97Trab, httpContext.getMessage( "A", "")) == 0 ) && ( ( AV91SalExtEsB == 1 ) || (0==AV91SalExtEsB) ) ) || ( ( GXutil.strcmp(AV97Trab, httpContext.getMessage( "C", "")) == 0 ) && ( AV91SalExtEsB == 2 ) ) || ( ( GXutil.strcmp(AV97Trab, httpContext.getMessage( "T", "")) == 0 ) ) )
            {
               AV85NomCli = (!(GXutil.strcmp("", A2748CliAlias)==0) ? A2748CliAlias : GXutil.substring( A279CliNom, 1, 16)) ;
               GXv_date2[0] = AV105ExHdrFeE ;
               GXv_decimal3[0] = AV61EXHDRKGE ;
               GXv_decimal4[0] = AV62EXHDRMTE ;
               GXv_int5[0] = AV104ExHdrCnE ;
               new app.trabajosexternos.pexpr01(remoteHandle, context).execute( A396EmprCod, A2248ManCod, A2689ExHdrFas, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_date2, GXv_decimal3, GXv_decimal4, GXv_int5) ;
               pwkrp00_impl.this.AV105ExHdrFeE = GXv_date2[0] ;
               pwkrp00_impl.this.AV61EXHDRKGE = GXv_decimal3[0] ;
               pwkrp00_impl.this.AV62EXHDRMTE = GXv_decimal4[0] ;
               pwkrp00_impl.this.AV104ExHdrCnE = GXv_int5[0] ;
               AV66FechaE = AV105ExHdrFeE ;
               h5WZ0( false, 14) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64fasdsc, "")), 54, Gx_line+0, 201, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74HojaRuta, "")), 230, Gx_line+0, 288, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 298, Gx_line+0, 403, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 406, Gx_line+0, 438, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85NomCli, "")), 447, Gx_line+0, 531, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 542, Gx_line+0, 626, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV104ExHdrCnE), "ZZZ9")), 636, Gx_line+0, 658, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61EXHDRKGE, "ZZZZZ9.99")), 677, Gx_line+0, 725, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62EXHDRMTE, "ZZZZZ9.99")), 731, Gx_line+0, 779, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV105ExHdrFeE, "99/99/99"), 785, Gx_line+0, 828, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2699ExHdrCnR), "ZZZ9")), 840, Gx_line+0, 862, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2698ExHdrKgR, "ZZZZZ9.99")), 867, Gx_line+0, 915, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2845ExHdrMtR, "ZZZZZ9.99")), 921, Gx_line+0, 969, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A2700ExHdrFeR, "99/99/99"), 975, Gx_line+0, 1018, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2689ExHdrFas, "")), 14, Gx_line+0, 57, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+14) ;
               AV69FlagL = (byte)(1) ;
               AV67FechaR = A2700ExHdrFeR ;
               AV96TotKgsR = AV96TotKgsR.add(A2698ExHdrKgR) ;
               AV107TotmtsR = AV107TotmtsR.add(A2845ExHdrMtR) ;
               AV95TotConR = (short)(AV95TotConR+A2699ExHdrCnR) ;
               AV76LastHdr = AV74HojaRuta ;
               AV108LastMancod = A2248ManCod ;
               AV57Ctrl_2 = GXutil.str( A2248ManCod, 4, 0) + A2689ExHdrFas + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'DIF' */
         S111 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5WZ0( true, 0) ;
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
      /* 'DIF' Routine */
      returnInSub = false ;
      AV59DifKgs = DecimalUtil.ZERO ;
      AV84MerKgs = DecimalUtil.ZERO ;
      AV58DiasSer = (short)(0) ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TotKgsR)==0) && ( GXutil.strcmp(AV106BarUnimed, httpContext.getMessage( "K", "")) == 0 ) )
      {
         AV59DifKgs = AV61EXHDRKGE.subtract(AV96TotKgsR) ;
         AV84MerKgs = ((AV96TotKgsR.subtract(AV61EXHDRKGE)).divide(AV61EXHDRKGE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         AV58DiasSer = (short)(GXutil.ddiff(AV67FechaR,AV66FechaE)) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TotmtsR)==0) && ( GXutil.strcmp(AV106BarUnimed, httpContext.getMessage( "M", "")) == 0 ) )
      {
         AV59DifKgs = AV62EXHDRMTE.subtract(AV107TotmtsR) ;
         AV84MerKgs = ((AV107TotmtsR.subtract(AV62EXHDRMTE)).divide(AV62EXHDRMTE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         AV58DiasSer = (short)(GXutil.ddiff(AV67FechaR,AV66FechaE)) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TotKgsR)==0) )
      {
      }
      AV95TotConR = (short)(0) ;
      AV96TotKgsR = DecimalUtil.doubleToDec(0) ;
   }

   public void h5WZ0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60EmprNom, "")), 14, Gx_line+14, 171, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112Pgmdesc, "")), 14, Gx_line+41, 171, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 961, Gx_line+41, 993, Gx_line+55, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Paginas:", ""), 899, Gx_line+41, 942, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 1016, Gx_line+41, 1064, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 1002, Gx_line+41, 1008, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 961, Gx_line+14, 1004, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1016, Gx_line+14, 1059, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora:", ""), 894, Gx_line+14, 942, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+67, 1085, Gx_line+67, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Pgmname, "")), 642, Gx_line+41, 799, Gx_line+55, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+68) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENVIO", ""), 719, Gx_line+0, 746, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(636, Gx_line+5, 691, Gx_line+5, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(772, Gx_line+5, 827, Gx_line+5, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(840, Gx_line+5, 895, Gx_line+5, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RECEPCION", ""), 905, Gx_line+0, 953, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(961, Gx_line+5, 1016, Gx_line+5, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+14) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 14, Gx_line+0, 36, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 230, Gx_line+0, 247, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ped Cli", ""), 298, Gx_line+1, 335, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 406, Gx_line+0, 443, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 542, Gx_line+0, 585, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pzs", ""), 636, Gx_line+0, 653, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 698, Gx_line+0, 725, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 747, Gx_line+0, 779, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 801, Gx_line+0, 828, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pzs", ""), 840, Gx_line+0, 857, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 888, Gx_line+0, 915, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 936, Gx_line+0, 968, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 991, Gx_line+0, 1018, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+14, 205, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(230, Gx_line+14, 287, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(298, Gx_line+14, 402, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(406, Gx_line+14, 529, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(542, Gx_line+14, 624, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(636, Gx_line+14, 657, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(677, Gx_line+14, 724, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(731, Gx_line+14, 778, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(785, Gx_line+14, 827, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(840, Gx_line+14, 861, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(867, Gx_line+14, 914, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(921, Gx_line+14, 968, Gx_line+14, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(975, Gx_line+14, 1017, Gx_line+14, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+19) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV87PAlbFch = GXutil.nullDate() ;
      AV99UFecha2 = GXutil.nullDate() ;
      AV89POpe = "" ;
      AV103UOpe2 = "" ;
      AV94TipPapel = "" ;
      AV97Trab = "" ;
      AV75ImpCod = "" ;
      scmdbuf = "" ;
      P05WZ2_A396EmprCod = new String[] {""} ;
      P05WZ2_A407EmprNom = new String[] {""} ;
      P05WZ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV60EmprNom = "" ;
      AV96TotKgsR = DecimalUtil.ZERO ;
      AV66FechaE = GXutil.nullDate() ;
      AV67FechaR = GXutil.nullDate() ;
      A2689ExHdrFas = "" ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      P05WZ3_A396EmprCod = new String[] {""} ;
      P05WZ3_A2249ManNom = new String[] {""} ;
      P05WZ3_n2249ManNom = new boolean[] {false} ;
      P05WZ3_A2694ExHdrAlb = new int[1] ;
      P05WZ3_n2694ExHdrAlb = new boolean[] {false} ;
      P05WZ3_A228BarUniMed = new String[] {""} ;
      P05WZ3_A279CliNom = new String[] {""} ;
      P05WZ3_A2748CliAlias = new String[] {""} ;
      P05WZ3_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P05WZ3_n2700ExHdrFeR = new boolean[] {false} ;
      P05WZ3_A2845ExHdrMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05WZ3_n2845ExHdrMtR = new boolean[] {false} ;
      P05WZ3_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05WZ3_n2698ExHdrKgR = new boolean[] {false} ;
      P05WZ3_A2699ExHdrCnR = new short[1] ;
      P05WZ3_n2699ExHdrCnR = new boolean[] {false} ;
      P05WZ3_A212BarSer = new String[] {""} ;
      P05WZ3_A252CliCod = new int[1] ;
      P05WZ3_n252CliCod = new boolean[] {false} ;
      P05WZ3_A4812BarEncCli = new String[] {""} ;
      P05WZ3_A2693ExHdrTip = new String[] {""} ;
      P05WZ3_n2693ExHdrTip = new boolean[] {false} ;
      P05WZ3_A130BarCodPar = new String[] {""} ;
      P05WZ3_n130BarCodPar = new boolean[] {false} ;
      P05WZ3_A132BarCodReo = new byte[1] ;
      P05WZ3_n132BarCodReo = new boolean[] {false} ;
      P05WZ3_A129BarCod = new int[1] ;
      P05WZ3_n129BarCod = new boolean[] {false} ;
      P05WZ3_A2689ExHdrFas = new String[] {""} ;
      P05WZ3_A2248ManCod = new short[1] ;
      P05WZ3_A2692ExHdrLin = new int[1] ;
      A2249ManNom = "" ;
      A228BarUniMed = "" ;
      A279CliNom = "" ;
      A2748CliAlias = "" ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A4812BarEncCli = "" ;
      A2693ExHdrTip = "" ;
      A130BarCodPar = "" ;
      AV83ManNom = "" ;
      AV74HojaRuta = "" ;
      AV76LastHdr = "" ;
      AV53BarCodPar = "" ;
      AV106BarUnimed = "" ;
      AV64fasdsc = "" ;
      GXv_char1 = new String[1] ;
      AV56Ctrl_1 = "" ;
      AV85NomCli = "" ;
      AV105ExHdrFeE = GXutil.nullDate() ;
      GXv_date2 = new java.util.Date[1] ;
      AV61EXHDRKGE = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      AV62EXHDRMTE = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_int5 = new short[1] ;
      AV107TotmtsR = DecimalUtil.ZERO ;
      AV57Ctrl_2 = "" ;
      AV59DifKgs = DecimalUtil.ZERO ;
      AV84MerKgs = DecimalUtil.ZERO ;
      AV112Pgmdesc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV116Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pwkrp00__default(),
         new Object[] {
             new Object[] {
            P05WZ2_A396EmprCod, P05WZ2_A407EmprNom, P05WZ2_n407EmprNom
            }
            , new Object[] {
            P05WZ3_A396EmprCod, P05WZ3_A2249ManNom, P05WZ3_n2249ManNom, P05WZ3_A2694ExHdrAlb, P05WZ3_n2694ExHdrAlb, P05WZ3_A228BarUniMed, P05WZ3_A279CliNom, P05WZ3_A2748CliAlias, P05WZ3_A2700ExHdrFeR, P05WZ3_n2700ExHdrFeR,
            P05WZ3_A2845ExHdrMtR, P05WZ3_n2845ExHdrMtR, P05WZ3_A2698ExHdrKgR, P05WZ3_n2698ExHdrKgR, P05WZ3_A2699ExHdrCnR, P05WZ3_n2699ExHdrCnR, P05WZ3_A212BarSer, P05WZ3_A252CliCod, P05WZ3_n252CliCod, P05WZ3_A4812BarEncCli,
            P05WZ3_A2693ExHdrTip, P05WZ3_n2693ExHdrTip, P05WZ3_A130BarCodPar, P05WZ3_n130BarCodPar, P05WZ3_A132BarCodReo, P05WZ3_n132BarCodReo, P05WZ3_A129BarCod, P05WZ3_n129BarCod, P05WZ3_A2689ExHdrFas, P05WZ3_A2248ManCod,
            P05WZ3_A2692ExHdrLin
            }
         }
      );
      AV116Pgmname = "TrabajosExternos.PWkRp00" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV112Pgmdesc = httpContext.getMessage( "Informe Trabajos Externos (Recepcion)", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV116Pgmname = "TrabajosExternos.PWkRp00" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV112Pgmdesc = httpContext.getMessage( "Informe Trabajos Externos (Recepcion)", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV72Fuente ;
   private byte AV69FlagL ;
   private byte AV70FlagM ;
   private byte AV71FlagO ;
   private byte A132BarCodReo ;
   private byte AV54BarCodReo ;
   private byte AV91SalExtEsB ;
   private short gxcookieaux ;
   private short AV88Pman ;
   private short AV101Uman2 ;
   private short AV108LastMancod ;
   private short A2248ManCod ;
   private short A2699ExHdrCnR ;
   private short AV104ExHdrCnE ;
   private short GXv_int5[] ;
   private short AV95TotConR ;
   private short AV58DiasSer ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A2694ExHdrAlb ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A2692ExHdrLin ;
   private int Gx_OldLine ;
   private int AV52BarCod ;
   private int AV90SalExtAlb ;
   private java.math.BigDecimal AV96TotKgsR ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private java.math.BigDecimal AV61EXHDRKGE ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal AV62EXHDRMTE ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal AV107TotmtsR ;
   private java.math.BigDecimal AV59DifKgs ;
   private java.math.BigDecimal AV84MerKgs ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV89POpe ;
   private String AV103UOpe2 ;
   private String AV94TipPapel ;
   private String AV97Trab ;
   private String AV75ImpCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV60EmprNom ;
   private String A2689ExHdrFas ;
   private String A2249ManNom ;
   private String A228BarUniMed ;
   private String A279CliNom ;
   private String A2748CliAlias ;
   private String A212BarSer ;
   private String A4812BarEncCli ;
   private String A2693ExHdrTip ;
   private String A130BarCodPar ;
   private String AV83ManNom ;
   private String AV74HojaRuta ;
   private String AV76LastHdr ;
   private String AV53BarCodPar ;
   private String AV106BarUnimed ;
   private String AV64fasdsc ;
   private String GXv_char1[] ;
   private String AV56Ctrl_1 ;
   private String AV85NomCli ;
   private String AV57Ctrl_2 ;
   private String AV112Pgmdesc ;
   private String Gx_time ;
   private String AV116Pgmname ;
   private java.util.Date AV87PAlbFch ;
   private java.util.Date AV99UFecha2 ;
   private java.util.Date AV66FechaE ;
   private java.util.Date AV67FechaR ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date AV105ExHdrFeE ;
   private java.util.Date GXv_date2[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n2249ManNom ;
   private boolean n2694ExHdrAlb ;
   private boolean n2700ExHdrFeR ;
   private boolean n2845ExHdrMtR ;
   private boolean n2698ExHdrKgR ;
   private boolean n2699ExHdrCnR ;
   private boolean n252CliCod ;
   private boolean n2693ExHdrTip ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P05WZ2_A396EmprCod ;
   private String[] P05WZ2_A407EmprNom ;
   private boolean[] P05WZ2_n407EmprNom ;
   private String[] P05WZ3_A396EmprCod ;
   private String[] P05WZ3_A2249ManNom ;
   private boolean[] P05WZ3_n2249ManNom ;
   private int[] P05WZ3_A2694ExHdrAlb ;
   private boolean[] P05WZ3_n2694ExHdrAlb ;
   private String[] P05WZ3_A228BarUniMed ;
   private String[] P05WZ3_A279CliNom ;
   private String[] P05WZ3_A2748CliAlias ;
   private java.util.Date[] P05WZ3_A2700ExHdrFeR ;
   private boolean[] P05WZ3_n2700ExHdrFeR ;
   private java.math.BigDecimal[] P05WZ3_A2845ExHdrMtR ;
   private boolean[] P05WZ3_n2845ExHdrMtR ;
   private java.math.BigDecimal[] P05WZ3_A2698ExHdrKgR ;
   private boolean[] P05WZ3_n2698ExHdrKgR ;
   private short[] P05WZ3_A2699ExHdrCnR ;
   private boolean[] P05WZ3_n2699ExHdrCnR ;
   private String[] P05WZ3_A212BarSer ;
   private int[] P05WZ3_A252CliCod ;
   private boolean[] P05WZ3_n252CliCod ;
   private String[] P05WZ3_A4812BarEncCli ;
   private String[] P05WZ3_A2693ExHdrTip ;
   private boolean[] P05WZ3_n2693ExHdrTip ;
   private String[] P05WZ3_A130BarCodPar ;
   private boolean[] P05WZ3_n130BarCodPar ;
   private byte[] P05WZ3_A132BarCodReo ;
   private boolean[] P05WZ3_n132BarCodReo ;
   private int[] P05WZ3_A129BarCod ;
   private boolean[] P05WZ3_n129BarCod ;
   private String[] P05WZ3_A2689ExHdrFas ;
   private short[] P05WZ3_A2248ManCod ;
   private int[] P05WZ3_A2692ExHdrLin ;
}

final  class pwkrp00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P05WZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV88Pman ,
                                          short AV101Uman2 ,
                                          String AV89POpe ,
                                          String AV103UOpe2 ,
                                          java.util.Date AV87PAlbFch ,
                                          java.util.Date AV99UFecha2 ,
                                          short A2248ManCod ,
                                          String A2689ExHdrFas ,
                                          java.util.Date A2700ExHdrFeR ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[7];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T4.ManNom, T1.ExHdrAlb, T2.BarUniMed, T3.CliNom, T3.CliAlias, T1.ExHdrFeR, T1.ExHdrMtR, T1.ExHdrKgR, T1.ExHdrCnR, T2.BarSer, T2.CliCod, T2.BarEncCli," ;
      scmdbuf += " T1.ExHdrTip, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.ExHdrFas, T1.ManCod, T1.ExHdrLin FROM (((TXPLEXMVH T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      scmdbuf += " INNER JOIN TXPMANUFA T4 ON T4.EmprCod = T1.EmprCod AND T4.ManCod = T1.ManCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV88Pman) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV101Uman2) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89POpe)==0) )
      {
         addWhere(sWhereString, "(T1.ExHdrFas >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103UOpe2)==0) )
      {
         addWhere(sWhereString, "(T1.ExHdrFas <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87PAlbFch)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeR >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99UFecha2)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeR <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ManCod, T1.ExHdrFas, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ExHdrTip" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P05WZ3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05WZ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05WZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 16);
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 20);
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 8);
               ((short[]) buf[29])[0] = rslt.getShort(19);
               ((int[]) buf[30])[0] = rslt.getInt(20);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
      }
   }

}

