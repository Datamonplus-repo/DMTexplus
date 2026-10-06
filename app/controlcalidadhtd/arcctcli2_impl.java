package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class arcctcli2_impl extends GXWebReport
{
   public arcctcli2_impl( com.genexus.internet.HttpContext context )
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
            AV11CliIni = (int)(GXutil.lval( httpContext.GetPar( "CliIni"))) ;
            AV10CliFin = (int)(GXutil.lval( httpContext.GetPar( "CliFin"))) ;
            AV13ArtIni = httpContext.GetPar( "ArtIni") ;
            AV12ArtFin = httpContext.GetPar( "ArtFin") ;
            AV15ColNomIni = httpContext.GetPar( "ColNomIni") ;
            AV14ColNomFin = httpContext.GetPar( "ColNomFin") ;
            AV17ColNumIni = (int)(GXutil.lval( httpContext.GetPar( "ColNumIni"))) ;
            AV16ColNumFin = (int)(GXutil.lval( httpContext.GetPar( "ColNumFin"))) ;
            AV18CCtcodi = (int)(GXutil.lval( httpContext.GetPar( "CCtcodi"))) ;
            AV20Cctdsc = httpContext.GetPar( "Cctdsc") ;
            AV22Op = httpContext.GetPar( "Op") ;
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
         /* Using cursor P07SF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18CCtcodi), Integer.valueOf(AV11CliIni), Integer.valueOf(AV11CliIni), Integer.valueOf(AV10CliFin), Integer.valueOf(AV10CliFin), AV13ArtIni, AV13ArtIni, AV12ArtFin, AV12ArtFin, AV15ColNomIni, AV15ColNomIni, AV14ColNomFin, AV14ColNomFin, Integer.valueOf(AV17ColNumIni), Integer.valueOf(AV17ColNumIni), Integer.valueOf(AV16ColNumFin), Integer.valueOf(AV16ColNumFin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk7SF3 = false ;
            A4031CCTCod = P07SF2_A4031CCTCod[0] ;
            A252CliCod = P07SF2_A252CliCod[0] ;
            A4059CCFColNum = P07SF2_A4059CCFColNum[0] ;
            A4058CCFColNom = P07SF2_A4058CCFColNom[0] ;
            A65ArtCod = P07SF2_A65ArtCod[0] ;
            A279CliNom = P07SF2_A279CliNom[0] ;
            A69ArtDsc = P07SF2_A69ArtDsc[0] ;
            n69ArtDsc = P07SF2_n69ArtDsc[0] ;
            A279CliNom = P07SF2_A279CliNom[0] ;
            A69ArtDsc = P07SF2_A69ArtDsc[0] ;
            n69ArtDsc = P07SF2_n69ArtDsc[0] ;
            if ( GXutil.strcmp(AV22Op, httpContext.getMessage( "R", "")) == 0 )
            {
               AV21Nrgtos = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07SF2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P07SF2_A4031CCTCod[0] == A4031CCTCod ) && ( P07SF2_A252CliCod[0] == A252CliCod ) )
               {
                  brk7SF3 = false ;
                  A4059CCFColNum = P07SF2_A4059CCFColNum[0] ;
                  A4058CCFColNom = P07SF2_A4058CCFColNom[0] ;
                  A65ArtCod = P07SF2_A65ArtCod[0] ;
                  if ( ( A252CliCod >= AV11CliIni ) || (0==AV11CliIni) )
                  {
                     if ( ( A252CliCod <= AV10CliFin ) || (0==AV10CliFin) )
                     {
                        if ( A4031CCTCod == AV18CCtcodi )
                        {
                           if ( ( GXutil.strcmp(A65ArtCod, AV13ArtIni) >= 0 ) || (GXutil.strcmp("", AV13ArtIni)==0) )
                           {
                              if ( ( GXutil.strcmp(A65ArtCod, AV12ArtFin) <= 0 ) || (GXutil.strcmp("", AV12ArtFin)==0) )
                              {
                                 if ( ( GXutil.strcmp(A4058CCFColNom, AV15ColNomIni) >= 0 ) || (GXutil.strcmp("", AV15ColNomIni)==0) )
                                 {
                                    if ( ( GXutil.strcmp(A4058CCFColNom, AV14ColNomFin) <= 0 ) || (GXutil.strcmp("", AV14ColNomFin)==0) )
                                    {
                                       if ( ( A4059CCFColNum >= AV17ColNumIni ) || (0==AV17ColNumIni) )
                                       {
                                          if ( ( A4059CCFColNum <= AV16ColNumFin ) || (0==AV16ColNumFin) )
                                          {
                                             AV21Nrgtos = (int)(AV21Nrgtos+1) ;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
                  brk7SF3 = true ;
                  pr_default.readNext(0);
               }
               h7SF0( false, 19) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 11, Gx_line+0, 56, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 63, Gx_line+1, 252, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21Nrgtos), "ZZZZZZZ9")), 257, Gx_line+0, 316, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               h7SF0( false, 19) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 11, Gx_line+0, 56, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 63, Gx_line+1, 252, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 257, Gx_line+1, 358, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 363, Gx_line+1, 527, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4058CCFColNom, "")), 532, Gx_line+0, 614, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4059CCFColNum), "ZZZZZ9")), 621, Gx_line+0, 666, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            if ( ! brk7SF3 )
            {
               brk7SF3 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7SF0( true, 0) ;
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

   public void h7SF0( boolean bFoot ,
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
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TEXPLUS", ""), 21, Gx_line+1, 78, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Controles de Calidad por Cliente/Serie/Color", ""), 247, Gx_line+57, 548, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+65, 242, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(551, Gx_line+65, 793, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 621, Gx_line+1, 666, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 722, Gx_line+0, 777, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 621, Gx_line+17, 660, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 676, Gx_line+16, 777, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 621, Gx_line+32, 672, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 676, Gx_line+31, 712, Gx_line+48, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 718, Gx_line+31, 736, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 740, Gx_line+31, 776, Gx_line+48, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18CCtcodi), "ZZZZZ9")), 14, Gx_line+32, 59, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Cctdsc, "")), 63, Gx_line+32, 252, Gx_line+50, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+76) ;
            if ( ! ( (0==AV11CliIni) && (0==AV10CliFin) && (GXutil.strcmp("", AV13ArtIni)==0) && (GXutil.strcmp("", AV12ArtFin)==0) && (GXutil.strcmp("", AV15ColNomIni)==0) && (GXutil.strcmp("", AV14ColNomFin)==0) && (0==AV17ColNumIni) && (0==AV16ColNumFin) ) )
            {
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Filtros", ""), 376, Gx_line+0, 418, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+7, 373, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(420, Gx_line+7, 793, Gx_line+7, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               if ( ! ( (0==AV11CliIni) && (0==AV10CliFin) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 116, Gx_line+0, 163, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (0==AV11CliIni) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 201, Gx_line+0, 241, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11CliIni), "ZZZZZ9")), 272, Gx_line+0, 317, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (0==AV10CliFin) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 461, Gx_line+0, 491, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10CliFin), "ZZZZZ9")), 523, Gx_line+0, 568, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               if ( ! ( (GXutil.strcmp("", AV13ArtIni)==0) && (GXutil.strcmp("", AV12ArtFin)==0) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 116, Gx_line+0, 170, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (GXutil.strcmp("", AV13ArtIni)==0) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 201, Gx_line+0, 241, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13ArtIni, "")), 272, Gx_line+0, 373, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (GXutil.strcmp("", AV12ArtFin)==0) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 461, Gx_line+0, 491, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12ArtFin, "")), 523, Gx_line+0, 624, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 461, Gx_line+0, 491, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12ArtFin, "")), 523, Gx_line+0, 624, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               if ( ! ( (GXutil.strcmp("", AV15ColNomIni)==0) && (GXutil.strcmp("", AV14ColNomFin)==0) && (0==AV17ColNumIni) && (0==AV16ColNumFin) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 116, Gx_line+0, 151, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (GXutil.strcmp("", AV15ColNomIni)==0) && (0==AV17ColNumIni) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 201, Gx_line+0, 241, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15ColNomIni, "")), 272, Gx_line+0, 354, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17ColNumIni), "ZZZZZ9")), 385, Gx_line+0, 430, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (GXutil.strcmp("", AV14ColNomFin)==0) && (0==AV16ColNumFin) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 461, Gx_line+1, 491, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14ColNomFin, "")), 523, Gx_line+0, 605, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16ColNumFin), "ZZZZZ9")), 636, Gx_line+1, 681, Gx_line+19, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
            }
            if ( GXutil.strcmp(AV22Op, httpContext.getMessage( "R", "")) != 0 )
            {
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Control", ""), 269, Gx_line+0, 319, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+19, 793, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 13, Gx_line+29, 60, Gx_line+47, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 257, Gx_line+29, 311, Gx_line+47, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 359, Gx_line+29, 437, Gx_line+47, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 533, Gx_line+29, 568, Gx_line+47, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 620, Gx_line+29, 672, Gx_line+47, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+47, 248, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(257, Gx_line+47, 357, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(363, Gx_line+47, 526, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(532, Gx_line+47, 613, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(620, Gx_line+47, 671, Gx_line+47, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+52) ;
            }
            else
            {
               getPrinter().GxDrawLine(0, Gx_line+9, 793, Gx_line+9, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 13, Gx_line+20, 60, Gx_line+38, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NRegistros", ""), 257, Gx_line+20, 331, Gx_line+38, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+38, 248, Gx_line+38, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(257, Gx_line+38, 357, Gx_line+38, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+43) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Tahoma", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Tahoma", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV13ArtIni = "" ;
      AV12ArtFin = "" ;
      AV15ColNomIni = "" ;
      AV14ColNomFin = "" ;
      AV20Cctdsc = "" ;
      AV22Op = "" ;
      scmdbuf = "" ;
      P07SF2_A396EmprCod = new String[] {""} ;
      P07SF2_A4031CCTCod = new int[1] ;
      P07SF2_A252CliCod = new int[1] ;
      P07SF2_A4059CCFColNum = new int[1] ;
      P07SF2_A4058CCFColNom = new String[] {""} ;
      P07SF2_A65ArtCod = new String[] {""} ;
      P07SF2_A279CliNom = new String[] {""} ;
      P07SF2_A69ArtDsc = new String[] {""} ;
      P07SF2_n69ArtDsc = new boolean[] {false} ;
      A4058CCFColNom = "" ;
      A65ArtCod = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.arcctcli2__default(),
         new Object[] {
             new Object[] {
            P07SF2_A396EmprCod, P07SF2_A4031CCTCod, P07SF2_A252CliCod, P07SF2_A4059CCFColNum, P07SF2_A4058CCFColNom, P07SF2_A65ArtCod, P07SF2_A279CliNom, P07SF2_A69ArtDsc, P07SF2_n69ArtDsc
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV11CliIni ;
   private int AV10CliFin ;
   private int AV17ColNumIni ;
   private int AV16ColNumFin ;
   private int AV18CCtcodi ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int AV21Nrgtos ;
   private int Gx_OldLine ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV13ArtIni ;
   private String AV12ArtFin ;
   private String AV15ColNomIni ;
   private String AV14ColNomFin ;
   private String AV20Cctdsc ;
   private String AV22Op ;
   private String scmdbuf ;
   private String A4058CCFColNom ;
   private String A65ArtCod ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean brk7SF3 ;
   private boolean n69ArtDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P07SF2_A396EmprCod ;
   private int[] P07SF2_A4031CCTCod ;
   private int[] P07SF2_A252CliCod ;
   private int[] P07SF2_A4059CCFColNum ;
   private String[] P07SF2_A4058CCFColNom ;
   private String[] P07SF2_A65ArtCod ;
   private String[] P07SF2_A279CliNom ;
   private String[] P07SF2_A69ArtDsc ;
   private boolean[] P07SF2_n69ArtDsc ;
}

final  class arcctcli2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07SF2", "SELECT T1.EmprCod, T1.CCTCod, T1.CliCod, T1.CCFColNum, T1.CCFColNom, T1.ArtCod, T2.CliNom, T3.ArtDsc FROM ((TXPCCSer1 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod) WHERE (T1.EmprCod = ? and T1.CCTCod = ?) AND (T1.CliCod >= ? or (? = 0)) AND (T1.CliCod <= ? or (? = 0)) AND (T1.ArtCod >= ? or (rtrim(?) IS NULL)) AND (T1.ArtCod <= ? or (rtrim(?) IS NULL)) AND (T1.CCFColNom >= ? or (rtrim(?) IS NULL)) AND (T1.CCFColNom <= ? or (rtrim(?) IS NULL)) AND (T1.CCFColNum >= ? or (? = 0)) AND (T1.CCFColNum <= ? or (? = 0)) ORDER BY T1.EmprCod, T1.CCTCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 16);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 13);
               stmt.setString(13, (String)parms[12], 13);
               stmt.setString(14, (String)parms[13], 13);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               return;
      }
   }

}

