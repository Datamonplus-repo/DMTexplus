package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ptrafin_impl extends GXWebReport
{
   public ptrafin_impl( com.genexus.internet.HttpContext context )
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
            AV21OMCodi = (int)(GXutil.lval( httpContext.GetPar( "OMCodi"))) ;
            AV22OMCodf = (int)(GXutil.lval( httpContext.GetPar( "OMCodf"))) ;
            AV23OMMaqCodi = httpContext.GetPar( "OMMaqCodi") ;
            AV24OMMaqCodf = httpContext.GetPar( "OMMaqCodf") ;
            AV19OMMCIni = localUtil.parseDTimeParm( httpContext.GetPar( "OMMCIni")) ;
            AV20OMMCFin = localUtil.parseDTimeParm( httpContext.GetPar( "OMMCFin")) ;
            AV17OMOpeCodi = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCodi"))) ;
            AV18OMOpeCodf = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCodf"))) ;
            AV25Detalle = httpContext.GetPar( "Detalle") ;
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
         /* Using cursor P00M42 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P00M42_A407EmprNom[0] ;
            n407EmprNom = P00M42_n407EmprNom[0] ;
            AV13NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV12Lit0 = AV37Pgmdesc ;
         AV14Lit1 = httpContext.getMessage( "Fecha", "") ;
         AV15Lit2 = httpContext.getMessage( "Hora", "") ;
         AV16Lit3 = httpContext.getMessage( "Pagina", "") ;
         AV20OMMCFin = (GXutil.dateCompare(GXutil.nullDate(), AV20OMMCFin) ? localUtil.ymdhmsToT( (short)(2050), (byte)(12), (byte)(31), (byte)(0), (byte)(0), (byte)(0)) : AV20OMMCFin) ;
         /* Using cursor P00M43 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV17OMOpeCodi), A396EmprCod, Integer.valueOf(AV21OMCodi), Integer.valueOf(AV22OMCodf), Integer.valueOf(AV22OMCodf), AV23OMMaqCodi, AV24OMMaqCodf, AV24OMMaqCodf, Integer.valueOf(AV18OMOpeCodf), Integer.valueOf(AV18OMOpeCodf)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brkM44 = false ;
            A9425OMCod = P00M43_A9425OMCod[0] ;
            A9426OMMaqCod = P00M43_A9426OMMaqCod[0] ;
            A9455OMOpeCod = P00M43_A9455OMOpeCod[0] ;
            A9468OMMCIni = P00M43_A9468OMMCIni[0] ;
            A9467OMMCEst = P00M43_A9467OMMCEst[0] ;
            A9456OMOpeNom = P00M43_A9456OMOpeNom[0] ;
            n9456OMOpeNom = P00M43_n9456OMOpeNom[0] ;
            A9458OMMTpo = P00M43_A9458OMMTpo[0] ;
            A9466OMMCLin = P00M43_A9466OMMCLin[0] ;
            A9426OMMaqCod = P00M43_A9426OMMaqCod[0] ;
            A9456OMOpeNom = P00M43_A9456OMOpeNom[0] ;
            n9456OMOpeNom = P00M43_n9456OMOpeNom[0] ;
            if ( GXutil.strcmp(A9467OMMCEst, httpContext.getMessage( "T", "")) == 0 )
            {
               hM40( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9")), 80, Gx_line+0, 125, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9456OMOpeNom, "")), 139, Gx_line+0, 359, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 15, Gx_line+0, 74, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV32OMOpeCod = A9455OMOpeCod ;
               AV29OMMCFin1 = GXutil.resetTime( GXutil.nullDate() );
               while ( (pr_default.getStatus(1) != 101) && ( P00M43_A9455OMOpeCod[0] == A9455OMOpeCod ) )
               {
                  brkM44 = false ;
                  A9425OMCod = P00M43_A9425OMCod[0] ;
                  A9426OMMaqCod = P00M43_A9426OMMaqCod[0] ;
                  A9468OMMCIni = P00M43_A9468OMMCIni[0] ;
                  A9458OMMTpo = P00M43_A9458OMMTpo[0] ;
                  A9466OMMCLin = P00M43_A9466OMMCLin[0] ;
                  A9426OMMaqCod = P00M43_A9426OMMaqCod[0] ;
                  if ( A9468OMMCIni.before( AV20OMMCFin ) )
                  {
                     if ( (( A9468OMMCIni.after( AV19OMMCIni ) ) || ( GXutil.dateCompare(A9468OMMCIni, AV19OMMCIni) )) )
                     {
                        if ( GXutil.strcmp(P00M43_A396EmprCod[0], A396EmprCod) == 0 )
                        {
                           if ( GXutil.strcmp(A9426OMMaqCod, AV23OMMaqCodi) >= 0 )
                           {
                              if ( ( GXutil.strcmp(A9426OMMaqCod, AV24OMMaqCodf) <= 0 ) || (GXutil.strcmp("", AV24OMMaqCodf)==0) )
                              {
                                 if ( A9455OMOpeCod >= AV17OMOpeCodi )
                                 {
                                    if ( ( A9455OMOpeCod <= AV18OMOpeCodf ) || (0==AV18OMOpeCodf) )
                                    {
                                       if ( A9425OMCod >= AV21OMCodi )
                                       {
                                          if ( ( A9425OMCod <= AV22OMCodf ) || (0==AV22OMCodf) )
                                          {
                                             if ( (( A9468OMMCIni.after( AV29OMMCFin1 ) ) || ( GXutil.dateCompare(A9468OMMCIni, AV29OMMCFin1) )) )
                                             {
                                                AV31OMMCIni1 = A9468OMMCIni ;
                                                AV29OMMCFin1 = GXutil.dtadd( localUtil.ymdhmsToT( (short)(GXutil.year( A9468OMMCIni)), (byte)(GXutil.month( A9468OMMCIni)), (byte)(GXutil.day( A9468OMMCIni)), (byte)(0), (byte)(0), (byte)(0)), 86400) ;
                                                AV30OMMCTie = DecimalUtil.doubleToDec(0) ;
                                                /* Execute user subroutine: 'LINEAS' */
                                                S111 ();
                                                if ( returnInSub )
                                                {
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
                                                hM40( false, 33) ;
                                                getPrinter().GxAttris("Courier New", 10, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30OMMCTie, "ZZ,ZZZ,ZZ9.999")), 233, Gx_line+9, 351, Gx_line+27, 2+256, 0, 0, 0) ;
                                                getPrinter().GxDrawText(localUtil.format( AV29OMMCFin1, "99/99/99 99:99"), 117, Gx_line+9, 235, Gx_line+27, 0+256, 0, 0, 0) ;
                                                Gx_OldLine = Gx_line ;
                                                Gx_line = (int)(Gx_line+33) ;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
                  brkM44 = true ;
                  pr_default.readNext(1);
               }
            }
            if ( ! brkM44 )
            {
               brkM44 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hM40( true, 0) ;
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
      /* 'LINEAS' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Detalle, httpContext.getMessage( "N", "")) == 0 )
      {
         hM40( false, 18) ;
         getPrinter().GxDrawLine(15, Gx_line+17, 810, Gx_line+17, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
      }
      /* Using cursor P00M44 */
      pr_default.execute(2, new Object[] {AV31OMMCIni1, A396EmprCod, Integer.valueOf(AV32OMOpeCod), Integer.valueOf(AV21OMCodi), Integer.valueOf(AV22OMCodf), Integer.valueOf(AV22OMCodf), AV23OMMaqCodi, AV24OMMaqCodf, AV24OMMaqCodf, Integer.valueOf(AV17OMOpeCodi), Integer.valueOf(AV18OMOpeCodf), Integer.valueOf(AV18OMOpeCodf), AV29OMMCFin1});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9455OMOpeCod = P00M44_A9455OMOpeCod[0] ;
         A9426OMMaqCod = P00M44_A9426OMMaqCod[0] ;
         A9433OMTxt = P00M44_A9433OMTxt[0] ;
         A9427OMMaqDsc = P00M44_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P00M44_n9427OMMaqDsc[0] ;
         A9425OMCod = P00M44_A9425OMCod[0] ;
         A9467OMMCEst = P00M44_A9467OMMCEst[0] ;
         A9468OMMCIni = P00M44_A9468OMMCIni[0] ;
         A9469OMMCFin = P00M44_A9469OMMCFin[0] ;
         A9458OMMTpo = P00M44_A9458OMMTpo[0] ;
         A9466OMMCLin = P00M44_A9466OMMCLin[0] ;
         A9426OMMaqCod = P00M44_A9426OMMaqCod[0] ;
         A9433OMTxt = P00M44_A9433OMTxt[0] ;
         A9427OMMaqDsc = P00M44_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P00M44_n9427OMMaqDsc[0] ;
         if ( GXutil.strcmp(A9467OMMCEst, httpContext.getMessage( "T", "")) == 0 )
         {
            A9470OMMCTie = DecimalUtil.doubleToDec(GXutil.dtdiff( A9469OMMCFin, A9468OMMCIni)/ (double) (3600)) ;
         }
         else
         {
            A9470OMMCTie = DecimalUtil.doubleToDec(0) ;
         }
         if ( GXutil.strcmp(AV25Detalle, httpContext.getMessage( "S", "")) == 0 )
         {
            AV26n = (short)(GXutil.gxmlines( A9433OMTxt, (short)(80))) ;
            if ( AV26n > 0 )
            {
               hM40( false, 17) ;
               getPrinter().GxDrawLine(15, Gx_line+16, 810, Gx_line+16, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hM40( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Texto", ""), 22, Gx_line+0, 59, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               AV28i = (short)(1) ;
               while ( AV28i <= AV26n )
               {
                  AV27t = GXutil.gxgetmli( A9433OMTxt, AV28i, (short)(80)) ;
                  hM40( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27t, "")), 131, Gx_line+2, 715, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  AV28i = (short)(AV28i+1) ;
               }
            }
         }
         hM40( false, 18) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A9469OMMCFin, "99/99/99 99:99"), 131, Gx_line+2, 234, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9470OMMCTie, "ZZ,ZZZ,ZZ9.999")), 248, Gx_line+2, 351, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A9468OMMCIni, "99/99/99 99:99"), 15, Gx_line+2, 118, Gx_line+19, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 365, Gx_line+2, 424, Gx_line+19, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), 430, Gx_line+2, 548, Gx_line+19, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         /* Noskip command */
         Gx_line = Gx_OldLine ;
         AV44GXLvl56 = (byte)(0) ;
         /* Using cursor P00M45 */
         pr_default.execute(3, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A9431TMDsc = P00M45_A9431TMDsc[0] ;
            n9431TMDsc = P00M45_n9431TMDsc[0] ;
            A9430TMCod = P00M45_A9430TMCod[0] ;
            AV44GXLvl56 = (byte)(1) ;
            hM40( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9431TMDsc, "")), 554, Gx_line+0, 774, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV44GXLvl56 == 0 )
         {
            Gx_line = (int)(Gx_line+17) ;
         }
         AV30OMMCTie = AV30OMMCTie.add(A9470OMMCTie) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void hM40( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lit0, "")), 15, Gx_line+36, 182, Gx_line+56, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13NomEmp, "")), 15, Gx_line+17, 235, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit1, "")), 540, Gx_line+17, 604, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 607, Gx_line+17, 658, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit2, "")), 661, Gx_line+17, 712, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 716, Gx_line+17, 809, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit3, "")), 648, Gx_line+40, 724, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 729, Gx_line+40, 756, Gx_line+56, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Pgmname, "")), 540, Gx_line+40, 697, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 760, Gx_line+40, 767, Gx_line+56, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 772, Gx_line+40, 799, Gx_line+56, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+67, 810, Gx_line+67, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+100, 810, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 15, Gx_line+109, 60, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 131, Gx_line+109, 154, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 306, Gx_line+109, 351, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 386, Gx_line+109, 423, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 430, Gx_line+109, 482, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tarea", ""), 554, Gx_line+109, 591, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+133, 810, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 36, Gx_line+76, 95, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 200, Gx_line+76, 237, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 371, Gx_line+76, 408, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 629, Gx_line+76, 681, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22OMCodf), "ZZZZZZZ9")), 306, Gx_line+76, 365, Gx_line+93, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21OMCodi), "ZZZZZZZ9")), 242, Gx_line+76, 301, Gx_line+93, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24OMMaqCodf, "")), 736, Gx_line+76, 781, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23OMMaqCodi, "")), 686, Gx_line+76, 731, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV20OMMCFin, "99/99/99 99:99"), 521, Gx_line+76, 624, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV19OMMCIni, "99/99/99 99:99"), 414, Gx_line+76, 517, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18OMOpeCodf), "ZZZZZ9")), 150, Gx_line+76, 195, Gx_line+93, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17OMOpeCodi), "ZZZZZ9")), 100, Gx_line+76, 145, Gx_line+93, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+150) ;
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
      add_metrics4( ) ;
      add_metrics5( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics5( )
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
      AV23OMMaqCodi = "" ;
      AV24OMMaqCodf = "" ;
      AV19OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      AV20OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      AV25Detalle = "" ;
      scmdbuf = "" ;
      P00M42_A396EmprCod = new String[] {""} ;
      P00M42_A407EmprNom = new String[] {""} ;
      P00M42_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV13NomEmp = "" ;
      AV12Lit0 = "" ;
      AV37Pgmdesc = "" ;
      AV14Lit1 = "" ;
      AV15Lit2 = "" ;
      AV16Lit3 = "" ;
      P00M43_A396EmprCod = new String[] {""} ;
      P00M43_A9425OMCod = new int[1] ;
      P00M43_A9426OMMaqCod = new String[] {""} ;
      P00M43_A9455OMOpeCod = new int[1] ;
      P00M43_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      P00M43_A9467OMMCEst = new String[] {""} ;
      P00M43_A9456OMOpeNom = new String[] {""} ;
      P00M43_n9456OMOpeNom = new boolean[] {false} ;
      P00M43_A9458OMMTpo = new String[] {""} ;
      P00M43_A9466OMMCLin = new short[1] ;
      A9426OMMaqCod = "" ;
      A9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      A9467OMMCEst = "" ;
      A9456OMOpeNom = "" ;
      A9458OMMTpo = "" ;
      AV29OMMCFin1 = GXutil.resetTime( GXutil.nullDate() );
      AV31OMMCIni1 = GXutil.resetTime( GXutil.nullDate() );
      AV30OMMCTie = DecimalUtil.ZERO ;
      A9470OMMCTie = DecimalUtil.ZERO ;
      P00M44_A396EmprCod = new String[] {""} ;
      P00M44_A9455OMOpeCod = new int[1] ;
      P00M44_A9426OMMaqCod = new String[] {""} ;
      P00M44_A9433OMTxt = new String[] {""} ;
      P00M44_A9427OMMaqDsc = new String[] {""} ;
      P00M44_n9427OMMaqDsc = new boolean[] {false} ;
      P00M44_A9425OMCod = new int[1] ;
      P00M44_A9467OMMCEst = new String[] {""} ;
      P00M44_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      P00M44_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      P00M44_A9458OMMTpo = new String[] {""} ;
      P00M44_A9466OMMCLin = new short[1] ;
      A9433OMTxt = "" ;
      A9427OMMaqDsc = "" ;
      A9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      AV27t = "" ;
      P00M45_A396EmprCod = new String[] {""} ;
      P00M45_A9431TMDsc = new String[] {""} ;
      P00M45_n9431TMDsc = new boolean[] {false} ;
      P00M45_A9430TMCod = new int[1] ;
      A9431TMDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV33Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.ptrafin__default(),
         new Object[] {
             new Object[] {
            P00M42_A396EmprCod, P00M42_A407EmprNom, P00M42_n407EmprNom
            }
            , new Object[] {
            P00M43_A396EmprCod, P00M43_A9425OMCod, P00M43_A9426OMMaqCod, P00M43_A9455OMOpeCod, P00M43_A9468OMMCIni, P00M43_A9467OMMCEst, P00M43_A9456OMOpeNom, P00M43_n9456OMOpeNom, P00M43_A9458OMMTpo, P00M43_A9466OMMCLin
            }
            , new Object[] {
            P00M44_A396EmprCod, P00M44_A9455OMOpeCod, P00M44_A9426OMMaqCod, P00M44_A9433OMTxt, P00M44_A9427OMMaqDsc, P00M44_n9427OMMaqDsc, P00M44_A9425OMCod, P00M44_A9467OMMCEst, P00M44_A9468OMMCIni, P00M44_A9469OMMCFin,
            P00M44_A9458OMMTpo, P00M44_A9466OMMCLin
            }
            , new Object[] {
            P00M45_A396EmprCod, P00M45_A9431TMDsc, P00M45_n9431TMDsc, P00M45_A9430TMCod
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV37Pgmdesc = httpContext.getMessage( "Trabajos por Operario (Mantto)", "") ;
      AV33Pgmname = "MantenimientoMaquina.PTraFIN" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV37Pgmdesc = httpContext.getMessage( "Trabajos por Operario (Mantto)", "") ;
      Gx_err = (short)(0) ;
      AV33Pgmname = "MantenimientoMaquina.PTraFIN" ;
   }

   private byte AV44GXLvl56 ;
   private short gxcookieaux ;
   private short A9466OMMCLin ;
   private short AV26n ;
   private short AV28i ;
   private short Gx_err ;
   private int AV21OMCodi ;
   private int AV22OMCodf ;
   private int AV17OMOpeCodi ;
   private int AV18OMOpeCodf ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int Gx_OldLine ;
   private int AV32OMOpeCod ;
   private int A9430TMCod ;
   private java.math.BigDecimal AV30OMMCTie ;
   private java.math.BigDecimal A9470OMMCTie ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV23OMMaqCodi ;
   private String AV24OMMaqCodf ;
   private String AV25Detalle ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV13NomEmp ;
   private String AV12Lit0 ;
   private String AV37Pgmdesc ;
   private String AV14Lit1 ;
   private String AV15Lit2 ;
   private String AV16Lit3 ;
   private String A9426OMMaqCod ;
   private String A9467OMMCEst ;
   private String A9456OMOpeNom ;
   private String A9458OMMTpo ;
   private String A9427OMMaqDsc ;
   private String AV27t ;
   private String A9431TMDsc ;
   private String Gx_time ;
   private String AV33Pgmname ;
   private java.util.Date AV19OMMCIni ;
   private java.util.Date AV20OMMCFin ;
   private java.util.Date A9468OMMCIni ;
   private java.util.Date AV29OMMCFin1 ;
   private java.util.Date AV31OMMCIni1 ;
   private java.util.Date A9469OMMCFin ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brkM44 ;
   private boolean n9456OMOpeNom ;
   private boolean returnInSub ;
   private boolean n9427OMMaqDsc ;
   private boolean n9431TMDsc ;
   private String A9433OMTxt ;
   private IDataStoreProvider pr_default ;
   private String[] P00M42_A396EmprCod ;
   private String[] P00M42_A407EmprNom ;
   private boolean[] P00M42_n407EmprNom ;
   private String[] P00M43_A396EmprCod ;
   private int[] P00M43_A9425OMCod ;
   private String[] P00M43_A9426OMMaqCod ;
   private int[] P00M43_A9455OMOpeCod ;
   private java.util.Date[] P00M43_A9468OMMCIni ;
   private String[] P00M43_A9467OMMCEst ;
   private String[] P00M43_A9456OMOpeNom ;
   private boolean[] P00M43_n9456OMOpeNom ;
   private String[] P00M43_A9458OMMTpo ;
   private short[] P00M43_A9466OMMCLin ;
   private String[] P00M44_A396EmprCod ;
   private int[] P00M44_A9455OMOpeCod ;
   private String[] P00M44_A9426OMMaqCod ;
   private String[] P00M44_A9433OMTxt ;
   private String[] P00M44_A9427OMMaqDsc ;
   private boolean[] P00M44_n9427OMMaqDsc ;
   private int[] P00M44_A9425OMCod ;
   private String[] P00M44_A9467OMMCEst ;
   private java.util.Date[] P00M44_A9468OMMCIni ;
   private java.util.Date[] P00M44_A9469OMMCFin ;
   private String[] P00M44_A9458OMMTpo ;
   private short[] P00M44_A9466OMMCLin ;
   private String[] P00M45_A396EmprCod ;
   private String[] P00M45_A9431TMDsc ;
   private boolean[] P00M45_n9431TMDsc ;
   private int[] P00M45_A9430TMCod ;
}

final  class ptrafin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00M42", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00M43", "SELECT T1.EmprCod, T1.OMCod, T2.OMMaqCod AS OMMaqCod, T1.OMOpeCod AS OMOpeCod, T1.OMMCIni, T1.OMMCEst, T3.OpeNom AS OMOpeNom, T1.OMMTpo, T1.OMMCLin FROM ((TXPMOrMCo T1 INNER JOIN TXPMORDEN T2 ON T2.EmprCod = T1.EmprCod AND T2.OMCod = T1.OMCod) INNER JOIN TXPOPERAR T3 ON T3.EmprCod = T1.EmprCod AND T3.OpeCod = T1.OMOpeCod) WHERE (T1.OMOpeCod >= ?) AND (T1.EmprCod = ?) AND (T1.OMCod >= ?) AND (T1.OMCod <= ? or (? = 0)) AND (T2.OMMaqCod >= ?) AND (T2.OMMaqCod <= ? or (rtrim(?) IS NULL)) AND (T1.OMOpeCod <= ? or (? = 0)) ORDER BY T1.OMOpeCod, T1.OMMCIni ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00M44", "SELECT T1.EmprCod, T1.OMOpeCod AS OMOpeCod, T2.OMMaqCod AS OMMaqCod, T2.OMTxt, T3.MaqDsc AS OMMaqDsc, T1.OMCod, T1.OMMCEst, T1.OMMCIni, T1.OMMCFin, T1.OMMTpo, T1.OMMCLin FROM ((TXPMOrMCo T1 INNER JOIN TXPMORDEN T2 ON T2.EmprCod = T1.EmprCod AND T2.OMCod = T1.OMCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T2.OMMaqCod) WHERE (T1.OMMCIni >= ?) AND (T1.EmprCod = ?) AND (T1.OMOpeCod = ?) AND (T1.OMCod >= ?) AND (T1.OMCod <= ? or (? = 0)) AND (T2.OMMaqCod >= ?) AND (T2.OMMaqCod <= ? or (rtrim(?) IS NULL)) AND (T1.OMOpeCod >= ?) AND (T1.OMOpeCod <= ? or (? = 0)) AND (T1.OMMCIni < ?) ORDER BY T1.OMMCIni ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00M45", "SELECT EmprCod, TMDsc, TMCod FROM TXPMTAREA WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 2 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

