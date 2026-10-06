package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pcamcli_impl extends GXWebReport
{
   public pcamcli_impl( com.genexus.internet.HttpContext context )
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
            AV20MRCodIni = (int)(GXutil.lval( httpContext.GetPar( "MRCodIni"))) ;
            AV25MRCodFin = (int)(GXutil.lval( httpContext.GetPar( "MRCodFin"))) ;
            AV22OMFchIni = localUtil.parseDateParm( httpContext.GetPar( "OMFchIni")) ;
            AV21OMFchFin = localUtil.parseDateParm( httpContext.GetPar( "OMFchFin")) ;
            AV23OMMaqIni = httpContext.GetPar( "OMMaqIni") ;
            AV24OMMaqFin = httpContext.GetPar( "OMMaqFin") ;
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
         /* Using cursor P00CE2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P00CE2_A407EmprNom[0] ;
            n407EmprNom = P00CE2_n407EmprNom[0] ;
            AV19NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV15Lit0 = AV35Pgmdesc ;
         /* Using cursor P00CE3 */
         pr_default.execute(1, new Object[] {AV23OMMaqIni, Integer.valueOf(AV20MRCodIni), A396EmprCod, Integer.valueOf(AV25MRCodFin), AV24OMMaqFin});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkCE4 = false ;
            A9449OMRTpo = P00CE3_A9449OMRTpo[0] ;
            A9445OMEst = P00CE3_A9445OMEst[0] ;
            A9426OMMaqCod = P00CE3_A9426OMMaqCod[0] ;
            A9439OMFchCer = P00CE3_A9439OMFchCer[0] ;
            A9425OMCod = P00CE3_A9425OMCod[0] ;
            A9447OMRepNom = P00CE3_A9447OMRepNom[0] ;
            n9447OMRepNom = P00CE3_n9447OMRepNom[0] ;
            A9446OMRepCod = P00CE3_A9446OMRepCod[0] ;
            A9427OMMaqDsc = P00CE3_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P00CE3_n9427OMMaqDsc[0] ;
            A9453OMRCPre = P00CE3_A9453OMRCPre[0] ;
            A9452OMRCCnt = P00CE3_A9452OMRCCnt[0] ;
            A9445OMEst = P00CE3_A9445OMEst[0] ;
            A9426OMMaqCod = P00CE3_A9426OMMaqCod[0] ;
            A9439OMFchCer = P00CE3_A9439OMFchCer[0] ;
            A9427OMMaqDsc = P00CE3_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P00CE3_n9427OMMaqDsc[0] ;
            A9447OMRepNom = P00CE3_A9447OMRepNom[0] ;
            n9447OMRepNom = P00CE3_n9447OMRepNom[0] ;
            if ( (( A9439OMFchCer.after( localUtil.ctot( localUtil.dtoc( AV22OMFchIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) ) || ( GXutil.dateCompare(A9439OMFchCer, localUtil.ctot( localUtil.dtoc( AV22OMFchIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) )) )
            {
               if ( (( A9439OMFchCer.before( localUtil.ctot( localUtil.dtoc( AV21OMFchFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) ) || ( GXutil.dateCompare(A9439OMFchCer, localUtil.ctot( localUtil.dtoc( AV21OMFchFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) )) )
               {
                  A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
                  hCE0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), 14, Gx_line+0, 59, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), 69, Gx_line+0, 187, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  AV26RepCont = DecimalUtil.doubleToDec(0) ;
                  AV30OMRCCos1 = DecimalUtil.doubleToDec(0) ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P00CE3_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
                  {
                     brkCE4 = false ;
                     A9449OMRTpo = P00CE3_A9449OMRTpo[0] ;
                     A9445OMEst = P00CE3_A9445OMEst[0] ;
                     A9439OMFchCer = P00CE3_A9439OMFchCer[0] ;
                     A9425OMCod = P00CE3_A9425OMCod[0] ;
                     A9447OMRepNom = P00CE3_A9447OMRepNom[0] ;
                     n9447OMRepNom = P00CE3_n9447OMRepNom[0] ;
                     A9446OMRepCod = P00CE3_A9446OMRepCod[0] ;
                     A9453OMRCPre = P00CE3_A9453OMRCPre[0] ;
                     A9452OMRCCnt = P00CE3_A9452OMRCCnt[0] ;
                     A9445OMEst = P00CE3_A9445OMEst[0] ;
                     A9439OMFchCer = P00CE3_A9439OMFchCer[0] ;
                     A9447OMRepNom = P00CE3_A9447OMRepNom[0] ;
                     n9447OMRepNom = P00CE3_n9447OMRepNom[0] ;
                     if ( (( A9439OMFchCer.after( localUtil.ctot( localUtil.dtoc( AV22OMFchIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) ) || ( GXutil.dateCompare(A9439OMFchCer, localUtil.ctot( localUtil.dtoc( AV22OMFchIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) )) )
                     {
                        if ( (( A9439OMFchCer.before( localUtil.ctot( localUtil.dtoc( AV21OMFchFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) ) || ( GXutil.dateCompare(A9439OMFchCer, localUtil.ctot( localUtil.dtoc( AV21OMFchFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) )) )
                        {
                           if ( A9446OMRepCod <= AV25MRCodFin )
                           {
                              if ( A9446OMRepCod >= AV20MRCodIni )
                              {
                                 if ( GXutil.strcmp(P00CE3_A396EmprCod[0], A396EmprCod) == 0 )
                                 {
                                    if ( GXutil.strcmp(A9426OMMaqCod, AV23OMMaqIni) >= 0 )
                                    {
                                       if ( GXutil.strcmp(A9426OMMaqCod, AV24OMMaqFin) <= 0 )
                                       {
                                          A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
                                          W9426OMMaqCod = A9426OMMaqCod ;
                                          AV26RepCont = AV26RepCont.add(DecimalUtil.doubleToDec(1)) ;
                                          hCE0( false, 18) ;
                                          getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9446OMRepCod), "ZZZZZZZ9")), 198, Gx_line+0, 257, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9447OMRepNom, "")), 268, Gx_line+0, 998, Gx_line+17, 0+256, 0, 0, 0) ;
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(Gx_line+18) ;
                                          /* Noskip command */
                                          Gx_line = Gx_OldLine ;
                                          AV27OMCont = DecimalUtil.doubleToDec(0) ;
                                          AV28OMRCCnt = DecimalUtil.doubleToDec(0) ;
                                          AV29OMRCCos = DecimalUtil.doubleToDec(0) ;
                                          while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P00CE3_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) && ( P00CE3_A9446OMRepCod[0] == A9446OMRepCod ) )
                                          {
                                             brkCE4 = false ;
                                             A9449OMRTpo = P00CE3_A9449OMRTpo[0] ;
                                             A9445OMEst = P00CE3_A9445OMEst[0] ;
                                             A9439OMFchCer = P00CE3_A9439OMFchCer[0] ;
                                             A9425OMCod = P00CE3_A9425OMCod[0] ;
                                             A9453OMRCPre = P00CE3_A9453OMRCPre[0] ;
                                             A9452OMRCCnt = P00CE3_A9452OMRCCnt[0] ;
                                             A9445OMEst = P00CE3_A9445OMEst[0] ;
                                             A9439OMFchCer = P00CE3_A9439OMFchCer[0] ;
                                             if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                                             {
                                                if ( (( A9439OMFchCer.after( localUtil.ctot( localUtil.dtoc( AV22OMFchIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) ) || ( GXutil.dateCompare(A9439OMFchCer, localUtil.ctot( localUtil.dtoc( AV22OMFchIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) )) )
                                                {
                                                   if ( (( A9439OMFchCer.before( localUtil.ctot( localUtil.dtoc( AV21OMFchFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ) ) || ( GXutil.dateCompare(A9439OMFchCer, localUtil.ctot( localUtil.dtoc( AV21OMFchFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) )) )
                                                   {
                                                      if ( GXutil.strcmp(P00CE3_A396EmprCod[0], A396EmprCod) == 0 )
                                                      {
                                                         if ( A9446OMRepCod >= AV20MRCodIni )
                                                         {
                                                            if ( A9446OMRepCod <= AV25MRCodFin )
                                                            {
                                                               if ( GXutil.strcmp(A9426OMMaqCod, AV23OMMaqIni) >= 0 )
                                                               {
                                                                  if ( GXutil.strcmp(A9426OMMaqCod, AV24OMMaqFin) <= 0 )
                                                                  {
                                                                     if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "C", "")) == 0 )
                                                                     {
                                                                        A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
                                                                        AV27OMCont = AV27OMCont.add(DecimalUtil.doubleToDec(1)) ;
                                                                        hCE0( false, 18) ;
                                                                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9454OMRCCos, "ZZZZZZZ9.999")), 1054, Gx_line+0, 1143, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9452OMRCCnt, "ZZ,ZZZ,ZZ9.999")), 826, Gx_line+0, 929, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9453OMRCPre, "ZZ,ZZZ,ZZ9.999")), 940, Gx_line+0, 1043, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 643, Gx_line+0, 702, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                        getPrinter().GxDrawText(localUtil.format( A9439OMFchCer, "99/99/99 99:99"), 713, Gx_line+0, 816, Gx_line+17, 0+256, 0, 0, 0) ;
                                                                        Gx_OldLine = Gx_line ;
                                                                        Gx_line = (int)(Gx_line+18) ;
                                                                        AV28OMRCCnt = AV28OMRCCnt.add(A9452OMRCCnt) ;
                                                                        AV29OMRCCos = AV29OMRCCos.add(A9454OMRCCos) ;
                                                                        AV30OMRCCos1 = AV30OMRCCos1.add(A9454OMRCCos) ;
                                                                     }
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                             brkCE4 = true ;
                                             pr_default.readNext(1);
                                          }
                                          if ( AV27OMCont.doubleValue() > 1 )
                                          {
                                             hCE0( false, 23) ;
                                             getPrinter().GxDrawLine(784, Gx_line+1, 1157, Gx_line+1, 1, 0, 0, 0, 0) ;
                                             getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29OMRCCos, "ZZZZZZZ9.999")), 1054, Gx_line+4, 1143, Gx_line+21, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28OMRCCnt, "ZZ,ZZZ,ZZ9.999")), 826, Gx_line+4, 929, Gx_line+21, 2+256, 0, 0, 0) ;
                                             Gx_OldLine = Gx_line ;
                                             Gx_line = (int)(Gx_line+23) ;
                                          }
                                          A9426OMMaqCod = W9426OMMaqCod ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                     if ( ! brkCE4 )
                     {
                        brkCE4 = true ;
                        pr_default.readNext(1);
                     }
                  }
                  if ( AV26RepCont.doubleValue() > 1 )
                  {
                     hCE0( false, 23) ;
                     getPrinter().GxDrawLine(784, Gx_line+1, 1157, Gx_line+1, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30OMRCCos1, "ZZZZZZZ9.999")), 1054, Gx_line+4, 1143, Gx_line+21, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+23) ;
                  }
               }
            }
            if ( ! brkCE4 )
            {
               brkCE4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hCE0( true, 0) ;
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

   public void hCE0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25MRCodFin), "ZZZZZZZ9")), 280, Gx_line+59, 339, Gx_line+76, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit0, "")), 14, Gx_line+29, 181, Gx_line+49, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit1, "")), 888, Gx_line+10, 952, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 955, Gx_line+10, 1006, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit2, "")), 1009, Gx_line+10, 1060, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1064, Gx_line+10, 1157, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit3, "")), 996, Gx_line+33, 1072, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1077, Gx_line+33, 1104, Gx_line+49, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19NomEmp, "")), 14, Gx_line+9, 234, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Pgmname, "")), 888, Gx_line+33, 1045, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+50, 1156, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 1108, Gx_line+33, 1115, Gx_line+49, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 1120, Gx_line+33, 1147, Gx_line+49, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+83, 1156, Gx_line+83, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20MRCodIni), "ZZZZZZZ9")), 215, Gx_line+59, 274, Gx_line+76, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 347, Gx_line+60, 384, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV21OMFchFin, "99/99/99"), 456, Gx_line+59, 515, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV22OMFchIni, "99/99/99"), 391, Gx_line+59, 450, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 523, Gx_line+60, 574, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23OMMaqIni, "")), 581, Gx_line+59, 626, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24OMMaqFin, "")), 632, Gx_line+59, 677, Gx_line+76, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+117, 1156, Gx_line+117, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 69, Gx_line+94, 120, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 268, Gx_line+94, 325, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 1003, Gx_line+94, 1042, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 1107, Gx_line+94, 1141, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 150, Gx_line+60, 207, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 875, Gx_line+94, 928, Gx_line+108, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+120) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV22OMFchIni = GXutil.nullDate() ;
      AV21OMFchFin = GXutil.nullDate() ;
      AV23OMMaqIni = "" ;
      AV24OMMaqFin = "" ;
      scmdbuf = "" ;
      P00CE2_A396EmprCod = new String[] {""} ;
      P00CE2_A407EmprNom = new String[] {""} ;
      P00CE2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV19NomEmp = "" ;
      AV15Lit0 = "" ;
      AV35Pgmdesc = "" ;
      P00CE3_A396EmprCod = new String[] {""} ;
      P00CE3_A9449OMRTpo = new String[] {""} ;
      P00CE3_A9445OMEst = new String[] {""} ;
      P00CE3_A9426OMMaqCod = new String[] {""} ;
      P00CE3_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P00CE3_A9425OMCod = new int[1] ;
      P00CE3_A9447OMRepNom = new String[] {""} ;
      P00CE3_n9447OMRepNom = new boolean[] {false} ;
      P00CE3_A9446OMRepCod = new int[1] ;
      P00CE3_A9427OMMaqDsc = new String[] {""} ;
      P00CE3_n9427OMMaqDsc = new boolean[] {false} ;
      P00CE3_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CE3_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9449OMRTpo = "" ;
      A9445OMEst = "" ;
      A9426OMMaqCod = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9447OMRepNom = "" ;
      A9427OMMaqDsc = "" ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      AV26RepCont = DecimalUtil.ZERO ;
      AV30OMRCCos1 = DecimalUtil.ZERO ;
      W9426OMMaqCod = "" ;
      AV27OMCont = DecimalUtil.ZERO ;
      AV28OMRCCnt = DecimalUtil.ZERO ;
      AV29OMRCCos = DecimalUtil.ZERO ;
      AV16Lit1 = "" ;
      Gx_date = GXutil.nullDate() ;
      AV17Lit2 = "" ;
      Gx_time = "" ;
      AV18Lit3 = "" ;
      AV31Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pcamcli__default(),
         new Object[] {
             new Object[] {
            P00CE2_A396EmprCod, P00CE2_A407EmprNom, P00CE2_n407EmprNom
            }
            , new Object[] {
            P00CE3_A396EmprCod, P00CE3_A9449OMRTpo, P00CE3_A9445OMEst, P00CE3_A9426OMMaqCod, P00CE3_A9439OMFchCer, P00CE3_A9425OMCod, P00CE3_A9447OMRepNom, P00CE3_n9447OMRepNom, P00CE3_A9446OMRepCod, P00CE3_A9427OMMaqDsc,
            P00CE3_n9427OMMaqDsc, P00CE3_A9453OMRCPre, P00CE3_A9452OMRCCnt
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV35Pgmdesc = httpContext.getMessage( "Repuestos consumidos x máquina", "") ;
      AV31Pgmname = "MantenimientoMaquina.Pcamcli" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV35Pgmdesc = httpContext.getMessage( "Repuestos consumidos x máquina", "") ;
      Gx_err = (short)(0) ;
      AV31Pgmname = "MantenimientoMaquina.Pcamcli" ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV20MRCodIni ;
   private int AV25MRCodFin ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9425OMCod ;
   private int A9446OMRepCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9454OMRCCos ;
   private java.math.BigDecimal AV26RepCont ;
   private java.math.BigDecimal AV30OMRCCos1 ;
   private java.math.BigDecimal AV27OMCont ;
   private java.math.BigDecimal AV28OMRCCnt ;
   private java.math.BigDecimal AV29OMRCCos ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV23OMMaqIni ;
   private String AV24OMMaqFin ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV19NomEmp ;
   private String AV15Lit0 ;
   private String AV35Pgmdesc ;
   private String A9449OMRTpo ;
   private String A9445OMEst ;
   private String A9426OMMaqCod ;
   private String A9447OMRepNom ;
   private String A9427OMMaqDsc ;
   private String W9426OMMaqCod ;
   private String AV16Lit1 ;
   private String AV17Lit2 ;
   private String Gx_time ;
   private String AV18Lit3 ;
   private String AV31Pgmname ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date AV22OMFchIni ;
   private java.util.Date AV21OMFchFin ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brkCE4 ;
   private boolean n9447OMRepNom ;
   private boolean n9427OMMaqDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P00CE2_A396EmprCod ;
   private String[] P00CE2_A407EmprNom ;
   private boolean[] P00CE2_n407EmprNom ;
   private String[] P00CE3_A396EmprCod ;
   private String[] P00CE3_A9449OMRTpo ;
   private String[] P00CE3_A9445OMEst ;
   private String[] P00CE3_A9426OMMaqCod ;
   private java.util.Date[] P00CE3_A9439OMFchCer ;
   private int[] P00CE3_A9425OMCod ;
   private String[] P00CE3_A9447OMRepNom ;
   private boolean[] P00CE3_n9447OMRepNom ;
   private int[] P00CE3_A9446OMRepCod ;
   private String[] P00CE3_A9427OMMaqDsc ;
   private boolean[] P00CE3_n9427OMMaqDsc ;
   private java.math.BigDecimal[] P00CE3_A9453OMRCPre ;
   private java.math.BigDecimal[] P00CE3_A9452OMRCCnt ;
}

final  class pcamcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CE2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CE3", "SELECT T1.EmprCod, T1.OMRTpo, T2.OMEst, T2.OMMaqCod AS OMMaqCod, T2.OMFchCer, T1.OMCod, T4.MRNom AS OMRepNom, T1.OMRepCod AS OMRepCod, T3.MaqDsc AS OMMaqDsc, T1.OMRCPre, T1.OMRCCnt FROM (((TXPMOrRep T1 INNER JOIN TXPMORDEN T2 ON T2.EmprCod = T1.EmprCod AND T2.OMCod = T1.OMCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T2.OMMaqCod) INNER JOIN TXPMREPUE T4 ON T4.EmprCod = T1.EmprCod AND T4.MRCod = T1.OMRepCod) WHERE (T2.OMMaqCod >= ? and T1.OMRepCod >= ?) AND (T1.EmprCod = ?) AND (T1.OMRepCod <= ?) AND (T2.OMMaqCod <= ?) ORDER BY T2.OMMaqCod, T1.OMRepCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

