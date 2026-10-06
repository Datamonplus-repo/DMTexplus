package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rlalcfeg_impl extends GXWebReport
{
   public rlalcfeg_impl( com.genexus.internet.HttpContext context )
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
            AV16PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV17UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV18PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV19UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV20Prio = httpContext.GetPar( "Prio") ;
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 17280, 12240, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV23Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1019_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit0 = GXt_char1 ;
         GXt_char1 = AV24Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit1 = GXt_char1 ;
         GXt_char1 = AV25Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit2 = GXt_char1 ;
         GXt_char1 = AV26Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit3 = GXt_char1 ;
         GXt_char1 = AV27Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit4 = GXt_char1 ;
         GXt_char1 = AV28Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit5 = GXt_char1 ;
         GXt_char1 = AV29Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit6 = GXt_char1 ;
         GXt_char1 = AV30Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit7 = GXt_char1 ;
         GXt_char1 = AV31Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN634_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit8 = GXt_char1 ;
         GXt_char1 = AV32Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit9 = GXt_char1 ;
         GXt_char1 = AV33Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1189_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit10 = GXt_char1 ;
         GXt_char1 = AV34Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit11 = GXt_char1 ;
         GXt_char1 = AV35Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2486_", ""), (byte)(99), GXv_char2) ;
         rlalcfeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit12 = GXt_char1 ;
         /* Using cursor P070B2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P070B2_A407EmprNom[0] ;
            n407EmprNom = P070B2_n407EmprNom[0] ;
            AV36NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV22TotTot = DecimalUtil.doubleToDec(0) ;
         GxHdr3 = true ;
         /* Using cursor P070B4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PCliCod), Integer.valueOf(AV17UCliCod), AV18PFecha, AV19UFecha, AV20Prio, AV20Prio});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk70B3 = false ;
            A14AlbComCod = P070B4_A14AlbComCod[0] ;
            A279CliNom = P070B4_A279CliNom[0] ;
            A22AlbComPri = P070B4_A22AlbComPri[0] ;
            A17AlbComFch = P070B4_A17AlbComFch[0] ;
            A252CliCod = P070B4_A252CliCod[0] ;
            A18AlbComImp = P070B4_A18AlbComImp[0] ;
            n18AlbComImp = P070B4_n18AlbComImp[0] ;
            A18AlbComImp = P070B4_A18AlbComImp[0] ;
            n18AlbComImp = P070B4_n18AlbComImp[0] ;
            A279CliNom = P070B4_A279CliNom[0] ;
            AV21TotPri = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P070B4_A22AlbComPri[0], A22AlbComPri) == 0 ) )
            {
               brk70B3 = false ;
               A14AlbComCod = P070B4_A14AlbComCod[0] ;
               A279CliNom = P070B4_A279CliNom[0] ;
               A17AlbComFch = P070B4_A17AlbComFch[0] ;
               A252CliCod = P070B4_A252CliCod[0] ;
               A18AlbComImp = P070B4_A18AlbComImp[0] ;
               n18AlbComImp = P070B4_n18AlbComImp[0] ;
               A18AlbComImp = P070B4_A18AlbComImp[0] ;
               n18AlbComImp = P070B4_n18AlbComImp[0] ;
               A279CliNom = P070B4_A279CliNom[0] ;
               if ( (( GXutil.resetTime(A17AlbComFch).before( GXutil.resetTime( AV19UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A17AlbComFch), GXutil.resetTime(AV19UFecha)) )) )
               {
                  if ( (( GXutil.resetTime(A17AlbComFch).after( GXutil.resetTime( AV18PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A17AlbComFch), GXutil.resetTime(AV18PFecha)) )) )
                  {
                     if ( A252CliCod >= AV16PCliCod )
                     {
                        if ( GXutil.strcmp(P070B4_A396EmprCod[0], A396EmprCod) == 0 )
                        {
                           if ( A252CliCod <= AV17UCliCod )
                           {
                              h70B0( false, 17) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(localUtil.format( A17AlbComFch, "99/99/99"), 7, Gx_line+0, 66, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                              /* Noskip command */
                              Gx_line = Gx_OldLine ;
                              while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P070B4_A22AlbComPri[0], A22AlbComPri) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P070B4_A17AlbComFch[0]), GXutil.resetTime(A17AlbComFch)) )
                              {
                                 brk70B3 = false ;
                                 A14AlbComCod = P070B4_A14AlbComCod[0] ;
                                 A279CliNom = P070B4_A279CliNom[0] ;
                                 A252CliCod = P070B4_A252CliCod[0] ;
                                 A18AlbComImp = P070B4_A18AlbComImp[0] ;
                                 n18AlbComImp = P070B4_n18AlbComImp[0] ;
                                 A18AlbComImp = P070B4_A18AlbComImp[0] ;
                                 n18AlbComImp = P070B4_n18AlbComImp[0] ;
                                 A279CliNom = P070B4_A279CliNom[0] ;
                                 if ( A252CliCod <= AV17UCliCod )
                                 {
                                    if ( A252CliCod >= AV16PCliCod )
                                    {
                                       if ( GXutil.strcmp(P070B4_A396EmprCod[0], A396EmprCod) == 0 )
                                       {
                                          h70B0( false, 17) ;
                                          getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 73, Gx_line+0, 118, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 124, Gx_line+0, 344, Gx_line+17, 0+256, 0, 0, 0) ;
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(Gx_line+17) ;
                                          /* Noskip command */
                                          Gx_line = Gx_OldLine ;
                                          while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P070B4_A22AlbComPri[0], A22AlbComPri) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P070B4_A17AlbComFch[0]), GXutil.resetTime(A17AlbComFch)) && ( P070B4_A252CliCod[0] == A252CliCod ) )
                                          {
                                             brk70B3 = false ;
                                             A14AlbComCod = P070B4_A14AlbComCod[0] ;
                                             A18AlbComImp = P070B4_A18AlbComImp[0] ;
                                             n18AlbComImp = P070B4_n18AlbComImp[0] ;
                                             A18AlbComImp = P070B4_A18AlbComImp[0] ;
                                             n18AlbComImp = P070B4_n18AlbComImp[0] ;
                                             if ( GXutil.strcmp(P070B4_A396EmprCod[0], A396EmprCod) == 0 )
                                             {
                                                h70B0( false, 17) ;
                                                getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), 350, Gx_line+0, 409, Gx_line+17, 2+256, 0, 0, 0) ;
                                                getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A18AlbComImp, "ZZZZZZZZZ9.99")), 416, Gx_line+0, 512, Gx_line+17, 2+256, 0, 0, 0) ;
                                                Gx_OldLine = Gx_line ;
                                                Gx_line = (int)(Gx_line+17) ;
                                                AV21TotPri = AV21TotPri.add(A18AlbComImp) ;
                                             }
                                             brk70B3 = true ;
                                             pr_default.readNext(1);
                                          }
                                       }
                                    }
                                 }
                                 if ( ! brk70B3 )
                                 {
                                    brk70B3 = true ;
                                    pr_default.readNext(1);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               if ( ! brk70B3 )
               {
                  brk70B3 = true ;
                  pr_default.readNext(1);
               }
            }
            if ( GXutil.strcmp(AV20Prio, "2") == 0 )
            {
               h70B0( false, 43) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit11, "")), 66, Gx_line+17, 102, Gx_line+33, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotPri, "ZZZZZZZZZZ.ZZ")), 416, Gx_line+7, 512, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(416, Gx_line+3, 511, Gx_line+3, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+43) ;
               if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
            }
            AV22TotTot = AV22TotTot.add(AV21TotPri) ;
            if ( ! brk70B3 )
            {
               brk70B3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GxHdr3 = false ;
         h70B0( false, 33) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("* * *", 57, Gx_line+6, 94, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit12, "")), 116, Gx_line+6, 211, Gx_line+22, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotTot, "ZZZZZZZZZZ.ZZ")), 416, Gx_line+6, 512, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(416, Gx_line+2, 511, Gx_line+2, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h70B0( true, 0) ;
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

   public void h70B0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 391, Gx_line+11, 399, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 526, Gx_line+11, 534, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit1, "")), 344, Gx_line+11, 380, Gx_line+27, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 405, Gx_line+11, 464, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit2, "")), 478, Gx_line+11, 507, Gx_line+27, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 544, Gx_line+11, 603, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 526, Gx_line+36, 534, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit0, "")), 4, Gx_line+36, 193, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit3, "")), 475, Gx_line+36, 519, Gx_line+52, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 548, Gx_line+36, 593, Gx_line+53, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 92, Gx_line+73, 100, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A22AlbComPri, "9")), 4, Gx_line+73, 12, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit4, "")), 36, Gx_line+73, 84, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV18PFecha, "99/99/99"), 106, Gx_line+73, 165, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit5, "")), 172, Gx_line+73, 208, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV19UFecha, "99/99/99"), 216, Gx_line+73, 275, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit6, "")), 7, Gx_line+103, 63, Gx_line+119, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit7, "")), 73, Gx_line+103, 124, Gx_line+119, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit9, "")), 357, Gx_line+103, 408, Gx_line+119, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit10, "")), 459, Gx_line+103, 510, Gx_line+119, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36NomEmp, "")), 4, Gx_line+11, 223, Gx_line+27, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Pgmname, "")), 344, Gx_line+36, 402, Gx_line+52, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+4, 627, Gx_line+4, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+59, 627, Gx_line+59, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+123, 65, Gx_line+123, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(73, Gx_line+123, 341, Gx_line+123, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(350, Gx_line+123, 408, Gx_line+123, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(416, Gx_line+123, 511, Gx_line+123, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+126) ;
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
      add_metrics2( ) ;
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
      AV18PFecha = GXutil.nullDate() ;
      AV19UFecha = GXutil.nullDate() ;
      AV20Prio = "" ;
      AV23Lit0 = "" ;
      AV24Lit1 = "" ;
      AV25Lit2 = "" ;
      AV26Lit3 = "" ;
      AV27Lit4 = "" ;
      AV28Lit5 = "" ;
      AV29Lit6 = "" ;
      AV30Lit7 = "" ;
      AV31Lit8 = "" ;
      AV32Lit9 = "" ;
      AV33Lit10 = "" ;
      AV34Lit11 = "" ;
      AV35Lit12 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P070B2_A396EmprCod = new String[] {""} ;
      P070B2_A407EmprNom = new String[] {""} ;
      P070B2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV36NomEmp = "" ;
      AV22TotTot = DecimalUtil.ZERO ;
      P070B4_A396EmprCod = new String[] {""} ;
      P070B4_A14AlbComCod = new int[1] ;
      P070B4_A279CliNom = new String[] {""} ;
      P070B4_A22AlbComPri = new String[] {""} ;
      P070B4_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P070B4_A252CliCod = new int[1] ;
      P070B4_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P070B4_n18AlbComImp = new boolean[] {false} ;
      A279CliNom = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A18AlbComImp = DecimalUtil.ZERO ;
      AV21TotPri = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV45Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranescomerciales.rlalcfeg__default(),
         new Object[] {
             new Object[] {
            P070B2_A396EmprCod, P070B2_A407EmprNom, P070B2_n407EmprNom
            }
            , new Object[] {
            P070B4_A396EmprCod, P070B4_A14AlbComCod, P070B4_A279CliNom, P070B4_A22AlbComPri, P070B4_A17AlbComFch, P070B4_A252CliCod, P070B4_A18AlbComImp, P070B4_n18AlbComImp
            }
         }
      );
      AV45Pgmname = "AlbaranesComerciales.RLALCFEG" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV45Pgmname = "AlbaranesComerciales.RLALCFEG" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV16PCliCod ;
   private int AV17UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV22TotTot ;
   private java.math.BigDecimal A18AlbComImp ;
   private java.math.BigDecimal AV21TotPri ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV20Prio ;
   private String AV23Lit0 ;
   private String AV24Lit1 ;
   private String AV25Lit2 ;
   private String AV26Lit3 ;
   private String AV27Lit4 ;
   private String AV28Lit5 ;
   private String AV29Lit6 ;
   private String AV30Lit7 ;
   private String AV31Lit8 ;
   private String AV32Lit9 ;
   private String AV33Lit10 ;
   private String AV34Lit11 ;
   private String AV35Lit12 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV36NomEmp ;
   private String A279CliNom ;
   private String A22AlbComPri ;
   private String Gx_time ;
   private String AV45Pgmname ;
   private java.util.Date AV18PFecha ;
   private java.util.Date AV19UFecha ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean brk70B3 ;
   private boolean n18AlbComImp ;
   private IDataStoreProvider pr_default ;
   private String[] P070B2_A396EmprCod ;
   private String[] P070B2_A407EmprNom ;
   private boolean[] P070B2_n407EmprNom ;
   private String[] P070B4_A396EmprCod ;
   private int[] P070B4_A14AlbComCod ;
   private String[] P070B4_A279CliNom ;
   private String[] P070B4_A22AlbComPri ;
   private java.util.Date[] P070B4_A17AlbComFch ;
   private int[] P070B4_A252CliCod ;
   private java.math.BigDecimal[] P070B4_A18AlbComImp ;
   private boolean[] P070B4_n18AlbComImp ;
}

final  class rlalcfeg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P070B2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P070B4", "SELECT T1.EmprCod, T1.AlbComCod, T3.CliNom, T1.AlbComPri, T1.AlbComFch, T1.CliCod, COALESCE( T2.AlbComImp, 0) AS AlbComImp FROM ((TXPCALCOM T1 LEFT JOIN (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbComCod = T1.AlbComCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ? and T1.CliCod <= ?) AND (T1.AlbComFch >= ? and T1.AlbComFch <= ?) AND (T1.AlbComPri = ? or ? = '2') ORDER BY T1.AlbComPri, T1.AlbComFch, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

