package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ral0004_impl extends GXWebReport
{
   public ral0004_impl( com.genexus.internet.HttpContext context )
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
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV16Prio = httpContext.GetPar( "Prio") ;
            AV17PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV18UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV19PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV20UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV65PBarSer = httpContext.GetPar( "PBarSer") ;
            AV66UBarSer = httpContext.GetPar( "UBarSer") ;
            AV67PDisNum = httpContext.GetPar( "PDisNum") ;
            AV68UDisNum = httpContext.GetPar( "UDisNum") ;
            AV48Fuente = (byte)(GXutil.lval( httpContext.GetPar( "Fuente"))) ;
            AV69BarMaqEst1 = httpContext.GetPar( "BarMaqEst1") ;
            AV70BarMaqEst2 = httpContext.GetPar( "BarMaqEst2") ;
            AV72Serie = httpContext.GetPar( "Serie") ;
            AV79clicod1 = (int)(GXutil.lval( httpContext.GetPar( "clicod1"))) ;
            AV80clicod2 = (int)(GXutil.lval( httpContext.GetPar( "clicod2"))) ;
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
      M_bot = 1 ;
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
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV25Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2240_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit0 = GXt_char1 ;
         GXt_char1 = AV26Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit1 = GXt_char1 ;
         GXt_char1 = AV27Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit2 = GXt_char1 ;
         GXt_char1 = AV28Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit3 = GXt_char1 ;
         GXt_char1 = AV29Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit4 = GXt_char1 ;
         GXt_char1 = AV30Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit5 = GXt_char1 ;
         GXt_char1 = AV31Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit6 = GXt_char1 ;
         GXt_char1 = AV32Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit7 = GXt_char1 ;
         GXt_char1 = AV33Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit8 = GXt_char1 ;
         GXt_char1 = AV34Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit9 = GXt_char1 ;
         GXt_char1 = AV35Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit10 = GXt_char1 ;
         GXt_char1 = AV36Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit11 = GXt_char1 ;
         GXt_char1 = AV37Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit12 = GXt_char1 ;
         GXt_char1 = AV38Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit13 = GXt_char1 ;
         GXt_char1 = AV39Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit14 = GXt_char1 ;
         GXt_char1 = AV40Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1498_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit15 = GXt_char1 ;
         GXt_char1 = AV41Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit16 = GXt_char1 ;
         GXt_char1 = AV46Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN206_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit17 = GXt_char1 ;
         GXt_char1 = AV47Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN323_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit18 = GXt_char1 ;
         GXt_char1 = AV58Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN279_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit21 = GXt_char1 ;
         GXt_char1 = AV62Lit30 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2491_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV62Lit30 = GXt_char1 ;
         GXt_char1 = AV63Lit31 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2497_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV63Lit31 = GXt_char1 ;
         GXt_char1 = AV64Lit32 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2499_", ""), (byte)(99), GXv_char2) ;
         ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
         AV64Lit32 = GXt_char1 ;
         AV59FlagTtx = (byte)(0) ;
         GXv_int3[0] = AV59FlagTtx ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int3) ;
         ral0004_impl.this.AV59FlagTtx = GXv_int3[0] ;
         GXt_int4 = AV76Moda21 ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
         ral0004_impl.this.GXt_int4 = GXv_int3[0] ;
         AV76Moda21 = GXt_int4 ;
         AV51FlagPT = (byte)(0) ;
         GXv_int3[0] = AV51FlagPT ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIETRZ", ""), GXv_int3) ;
         ral0004_impl.this.AV51FlagPT = GXv_int3[0] ;
         AV52Lit19 = "" ;
         AV53Lit20 = "" ;
         if ( AV51FlagPT == 1 )
         {
            GXt_char1 = AV52Lit19 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGINGPIE02", ""), (byte)(99), GXv_char2) ;
            ral0004_impl.this.GXt_char1 = GXv_char2[0] ;
            AV52Lit19 = GXt_char1 ;
         }
         /* Using cursor P06LW2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06LW2_A407EmprNom[0] ;
            n407EmprNom = P06LW2_n407EmprNom[0] ;
            AV44NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV21TotKil = DecimalUtil.doubleToDec(0) ;
         AV22TotMet = DecimalUtil.doubleToDec(0) ;
         AV49TotPie = 0 ;
         AV54TotTrz = 0 ;
         /* Using cursor P06LW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV17PCliCod), AV19PFecha, AV20UFecha, AV16Prio, AV16Prio, Integer.valueOf(AV18UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6LW4 = false ;
            A30AlbProCod = P06LW3_A30AlbProCod[0] ;
            A39AlbProPri = P06LW3_A39AlbProPri[0] ;
            A34AlbProfch = P06LW3_A34AlbProfch[0] ;
            A1243GuiRemCli = P06LW3_A1243GuiRemCli[0] ;
            AV43CliCod = A1243GuiRemCli ;
            /* Execute user subroutine: 'CLIENTE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06LW3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06LW3_A1243GuiRemCli[0] == A1243GuiRemCli ) )
            {
               brk6LW4 = false ;
               A30AlbProCod = P06LW3_A30AlbProCod[0] ;
               A39AlbProPri = P06LW3_A39AlbProPri[0] ;
               A34AlbProfch = P06LW3_A34AlbProfch[0] ;
               if ( (( GXutil.resetTime(A34AlbProfch).before( GXutil.resetTime( AV20UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV20UFecha)) )) )
               {
                  if ( (( GXutil.resetTime(A34AlbProfch).after( GXutil.resetTime( AV19PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV19PFecha)) )) )
                  {
                     if ( ( A1243GuiRemCli >= AV17PCliCod ) && ( A1243GuiRemCli <= AV18UCliCod ) )
                     {
                        if ( ( GXutil.strcmp(A39AlbProPri, AV16Prio) == 0 ) || ( GXutil.strcmp(AV16Prio, "2") == 0 ) )
                        {
                           AV73Serie2 = "%" + AV72Serie ;
                           lV73Serie2 = GXutil.padr( GXutil.rtrim( AV73Serie2), 16, "%") ;
                           /* Using cursor P06LW4 */
                           pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), AV65PBarSer, AV66UBarSer, AV72Serie, lV73Serie2, AV72Serie, AV67PDisNum, AV68UDisNum, AV69BarMaqEst1, AV69BarMaqEst1, Byte.valueOf(AV59FlagTtx), Byte.valueOf(AV59FlagTtx), AV70BarMaqEst2, AV70BarMaqEst2, Byte.valueOf(AV59FlagTtx), Byte.valueOf(AV59FlagTtx)});
                           while ( (pr_default.getStatus(2) != 101) )
                           {
                              A130BarCodPar = P06LW4_A130BarCodPar[0] ;
                              A132BarCodReo = P06LW4_A132BarCodReo[0] ;
                              A129BarCod = P06LW4_A129BarCod[0] ;
                              A7733BarMaqEst = P06LW4_A7733BarMaqEst[0] ;
                              A143BarDisNum = P06LW4_A143BarDisNum[0] ;
                              A212BarSer = P06LW4_A212BarSer[0] ;
                              A1261BarAlbKgmE = P06LW4_A1261BarAlbKgmE[0] ;
                              A1263BarAlbMtrE = P06LW4_A1263BarAlbMtrE[0] ;
                              A2243BarKgsCli = P06LW4_A2243BarKgsCli[0] ;
                              n2243BarKgsCli = P06LW4_n2243BarKgsCli[0] ;
                              A1461BarAlbPN = P06LW4_A1461BarAlbPN[0] ;
                              A1265BarAlbPie = P06LW4_A1265BarAlbPie[0] ;
                              A135BarColNom = P06LW4_A135BarColNom[0] ;
                              A136BarColNum = P06LW4_A136BarColNum[0] ;
                              A1234BarNomCli = P06LW4_A1234BarNomCli[0] ;
                              A1235BarNumCli = P06LW4_A1235BarNumCli[0] ;
                              A7733BarMaqEst = P06LW4_A7733BarMaqEst[0] ;
                              A143BarDisNum = P06LW4_A143BarDisNum[0] ;
                              A212BarSer = P06LW4_A212BarSer[0] ;
                              A135BarColNom = P06LW4_A135BarColNom[0] ;
                              A136BarColNum = P06LW4_A136BarColNum[0] ;
                              A1234BarNomCli = P06LW4_A1234BarNomCli[0] ;
                              A1235BarNumCli = P06LW4_A1235BarNumCli[0] ;
                              if ( (0==A132BarCodReo) )
                              {
                                 AV45BarNum = GXutil.str( A129BarCod, 8, 0) + "  " + A130BarCodPar ;
                              }
                              else
                              {
                                 AV45BarNum = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                              }
                              AV56Trozos = (short)(0) ;
                              if ( AV51FlagPT == 1 )
                              {
                                 /* Optimized group. */
                                 /* Using cursor P06LW5 */
                                 pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                 cV56Trozos = P06LW5_AV56Trozos[0] ;
                                 pr_default.close(3);
                                 AV56Trozos = (short)(AV56Trozos+cV56Trozos*1) ;
                                 /* End optimized group. */
                              }
                              AV77BarAlbKgmE = A1261BarAlbKgmE ;
                              AV78BarAlbMtrE = A1263BarAlbMtrE ;
                              if ( AV76Moda21 == 1 )
                              {
                                 if ( A2243BarKgsCli.doubleValue() != 0 )
                                 {
                                    AV77BarAlbKgmE = A2243BarKgsCli ;
                                 }
                                 if ( A1461BarAlbPN.doubleValue() != 0 )
                                 {
                                    AV78BarAlbMtrE = A1461BarAlbPN ;
                                 }
                              }
                              AV23TotKilC = AV23TotKilC.add(AV77BarAlbKgmE) ;
                              AV24TotMetC = AV24TotMetC.add(AV78BarAlbMtrE) ;
                              AV50TotPieC = (int)(AV50TotPieC+A1265BarAlbPie) ;
                              AV55TotTrzC = (short)(AV55TotTrzC+AV56Trozos) ;
                              AV21TotKil = AV21TotKil.add(AV77BarAlbKgmE) ;
                              AV22TotMet = AV22TotMet.add(AV78BarAlbMtrE) ;
                              AV49TotPie = (int)(AV49TotPie+A1265BarAlbPie) ;
                              AV54TotTrz = (int)(AV54TotTrz+AV56Trozos) ;
                              if ( AV59FlagTtx == 0 )
                              {
                                 AV60BarColNom = A135BarColNom ;
                                 AV61BarColNum = A136BarColNum ;
                              }
                              else
                              {
                                 AV60BarColNom = A1234BarNomCli ;
                                 AV61BarColNum = A1235BarNumCli ;
                              }
                              pr_default.readNext(2);
                           }
                           pr_default.close(2);
                        }
                     }
                  }
               }
               brk6LW4 = true ;
               pr_default.readNext(1);
            }
            h6LW0( false, 16) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotKilC, "ZZ,ZZZ,ZZ9.99")), 378, Gx_line+0, 474, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotMetC, "ZZ,ZZZ,ZZ9.99")), 493, Gx_line+0, 589, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TotPieC), "ZZZZZ9")), 628, Gx_line+0, 673, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TotTrzC), "ZZZZ")), 731, Gx_line+0, 761, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 19, Gx_line+0, 64, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42CliNom, "")), 91, Gx_line+0, 248, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+16) ;
            AV23TotKilC = DecimalUtil.doubleToDec(0) ;
            AV24TotMetC = DecimalUtil.doubleToDec(0) ;
            AV50TotPieC = 0 ;
            AV55TotTrzC = (short)(0) ;
            if ( ! brk6LW4 )
            {
               brk6LW4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         h6LW0( false, 24) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit16, "")), 298, Gx_line+6, 362, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotKil, "ZZ,ZZZ,ZZ9.99")), 378, Gx_line+6, 474, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotMet, "ZZ,ZZZ,ZZ9.99")), 493, Gx_line+6, 589, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TotPie), "ZZZZZ9")), 609, Gx_line+6, 672, Gx_line+22, 2, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54TotTrz), "ZZZZZ")), 724, Gx_line+6, 761, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(374, Gx_line+2, 473, Gx_line+2, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(383, Gx_line+2, 773, Gx_line+2, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+24) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6LW0( true, 0) ;
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
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      /* Using cursor P06LW6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV43CliCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A252CliCod = P06LW6_A252CliCod[0] ;
         A279CliNom = P06LW6_A279CliNom[0] ;
         AV42CliNom = A279CliNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void h6LW0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit0, "")), 6, Gx_line+35, 174, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit1, "")), 529, Gx_line+2, 593, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 580, Gx_line+2, 631, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit2, "")), 653, Gx_line+2, 704, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 693, Gx_line+2, 786, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit3, "")), 655, Gx_line+38, 731, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 717, Gx_line+38, 762, Gx_line+55, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit4, "")), 239, Gx_line+38, 303, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV19PFecha, "99/99/99"), 283, Gx_line+38, 334, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit5, "")), 370, Gx_line+38, 434, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV20UFecha, "99/99/99"), 410, Gx_line+38, 461, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44NomEmp, "")), 6, Gx_line+3, 226, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Pgmname, "")), 528, Gx_line+38, 685, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+58, 804, Gx_line+58, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+88, 773, Gx_line+88, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit7, "")), 19, Gx_line+70, 108, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit30, "")), 410, Gx_line+70, 474, Gx_line+87, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit31, "")), 525, Gx_line+70, 589, Gx_line+87, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit32, "")), 609, Gx_line+70, 673, Gx_line+87, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit19, "")), 685, Gx_line+70, 761, Gx_line+87, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+93) ;
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
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
      AV15ImpCod = "" ;
      AV16Prio = "" ;
      AV19PFecha = GXutil.nullDate() ;
      AV20UFecha = GXutil.nullDate() ;
      AV65PBarSer = "" ;
      AV66UBarSer = "" ;
      AV67PDisNum = "" ;
      AV68UDisNum = "" ;
      AV69BarMaqEst1 = "" ;
      AV70BarMaqEst2 = "" ;
      AV72Serie = "" ;
      AV25Lit0 = "" ;
      AV26Lit1 = "" ;
      AV27Lit2 = "" ;
      AV28Lit3 = "" ;
      AV29Lit4 = "" ;
      AV30Lit5 = "" ;
      AV31Lit6 = "" ;
      AV32Lit7 = "" ;
      AV33Lit8 = "" ;
      AV34Lit9 = "" ;
      AV35Lit10 = "" ;
      AV36Lit11 = "" ;
      AV37Lit12 = "" ;
      AV38Lit13 = "" ;
      AV39Lit14 = "" ;
      AV40Lit15 = "" ;
      AV41Lit16 = "" ;
      AV46Lit17 = "" ;
      AV47Lit18 = "" ;
      AV58Lit21 = "" ;
      AV62Lit30 = "" ;
      AV63Lit31 = "" ;
      AV64Lit32 = "" ;
      GXv_int3 = new byte[1] ;
      AV52Lit19 = "" ;
      AV53Lit20 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06LW2_A396EmprCod = new String[] {""} ;
      P06LW2_A407EmprNom = new String[] {""} ;
      P06LW2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV44NomEmp = "" ;
      AV21TotKil = DecimalUtil.ZERO ;
      AV22TotMet = DecimalUtil.ZERO ;
      P06LW3_A396EmprCod = new String[] {""} ;
      P06LW3_A30AlbProCod = new long[1] ;
      P06LW3_A39AlbProPri = new String[] {""} ;
      P06LW3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P06LW3_A1243GuiRemCli = new int[1] ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV73Serie2 = "" ;
      lV73Serie2 = "" ;
      P06LW4_A396EmprCod = new String[] {""} ;
      P06LW4_A30AlbProCod = new long[1] ;
      P06LW4_A130BarCodPar = new String[] {""} ;
      P06LW4_A132BarCodReo = new byte[1] ;
      P06LW4_A129BarCod = new int[1] ;
      P06LW4_A7733BarMaqEst = new String[] {""} ;
      P06LW4_A143BarDisNum = new String[] {""} ;
      P06LW4_A212BarSer = new String[] {""} ;
      P06LW4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LW4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LW4_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LW4_n2243BarKgsCli = new boolean[] {false} ;
      P06LW4_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LW4_A1265BarAlbPie = new int[1] ;
      P06LW4_A135BarColNom = new String[] {""} ;
      P06LW4_A136BarColNum = new int[1] ;
      P06LW4_A1234BarNomCli = new String[] {""} ;
      P06LW4_A1235BarNumCli = new int[1] ;
      A130BarCodPar = "" ;
      A7733BarMaqEst = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      AV45BarNum = "" ;
      P06LW5_AV56Trozos = new short[1] ;
      AV77BarAlbKgmE = DecimalUtil.ZERO ;
      AV78BarAlbMtrE = DecimalUtil.ZERO ;
      AV23TotKilC = DecimalUtil.ZERO ;
      AV24TotMetC = DecimalUtil.ZERO ;
      AV60BarColNom = "" ;
      AV42CliNom = "" ;
      P06LW6_A396EmprCod = new String[] {""} ;
      P06LW6_A252CliCod = new int[1] ;
      P06LW6_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV87Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ral0004__default(),
         new Object[] {
             new Object[] {
            P06LW2_A396EmprCod, P06LW2_A407EmprNom, P06LW2_n407EmprNom
            }
            , new Object[] {
            P06LW3_A396EmprCod, P06LW3_A30AlbProCod, P06LW3_A39AlbProPri, P06LW3_A34AlbProfch, P06LW3_A1243GuiRemCli
            }
            , new Object[] {
            P06LW4_A396EmprCod, P06LW4_A30AlbProCod, P06LW4_A130BarCodPar, P06LW4_A132BarCodReo, P06LW4_A129BarCod, P06LW4_A7733BarMaqEst, P06LW4_A143BarDisNum, P06LW4_A212BarSer, P06LW4_A1261BarAlbKgmE, P06LW4_A1263BarAlbMtrE,
            P06LW4_A2243BarKgsCli, P06LW4_n2243BarKgsCli, P06LW4_A1461BarAlbPN, P06LW4_A1265BarAlbPie, P06LW4_A135BarColNom, P06LW4_A136BarColNum, P06LW4_A1234BarNomCli, P06LW4_A1235BarNumCli
            }
            , new Object[] {
            P06LW5_AV56Trozos
            }
            , new Object[] {
            P06LW6_A396EmprCod, P06LW6_A252CliCod, P06LW6_A279CliNom
            }
         }
      );
      AV87Pgmname = "RAL0004" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV87Pgmname = "RAL0004" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV48Fuente ;
   private byte AV59FlagTtx ;
   private byte AV76Moda21 ;
   private byte GXt_int4 ;
   private byte AV51FlagPT ;
   private byte GXv_int3[] ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV56Trozos ;
   private short cV56Trozos ;
   private short AV55TotTrzC ;
   private short Gx_err ;
   private int AV17PCliCod ;
   private int AV18UCliCod ;
   private int AV79clicod1 ;
   private int AV80clicod2 ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV49TotPie ;
   private int AV54TotTrz ;
   private int A1243GuiRemCli ;
   private int AV43CliCod ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int AV50TotPieC ;
   private int AV61BarColNum ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV22TotMet ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV77BarAlbKgmE ;
   private java.math.BigDecimal AV78BarAlbMtrE ;
   private java.math.BigDecimal AV23TotKilC ;
   private java.math.BigDecimal AV24TotMetC ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16Prio ;
   private String AV65PBarSer ;
   private String AV66UBarSer ;
   private String AV67PDisNum ;
   private String AV68UDisNum ;
   private String AV69BarMaqEst1 ;
   private String AV70BarMaqEst2 ;
   private String AV72Serie ;
   private String AV25Lit0 ;
   private String AV26Lit1 ;
   private String AV27Lit2 ;
   private String AV28Lit3 ;
   private String AV29Lit4 ;
   private String AV30Lit5 ;
   private String AV31Lit6 ;
   private String AV32Lit7 ;
   private String AV33Lit8 ;
   private String AV34Lit9 ;
   private String AV35Lit10 ;
   private String AV36Lit11 ;
   private String AV37Lit12 ;
   private String AV38Lit13 ;
   private String AV39Lit14 ;
   private String AV40Lit15 ;
   private String AV41Lit16 ;
   private String AV46Lit17 ;
   private String AV47Lit18 ;
   private String AV58Lit21 ;
   private String AV62Lit30 ;
   private String AV63Lit31 ;
   private String AV64Lit32 ;
   private String AV52Lit19 ;
   private String AV53Lit20 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV44NomEmp ;
   private String A39AlbProPri ;
   private String AV73Serie2 ;
   private String lV73Serie2 ;
   private String A130BarCodPar ;
   private String A7733BarMaqEst ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String AV45BarNum ;
   private String AV60BarColNom ;
   private String AV42CliNom ;
   private String A279CliNom ;
   private String Gx_time ;
   private String AV87Pgmname ;
   private java.util.Date AV19PFecha ;
   private java.util.Date AV20UFecha ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6LW4 ;
   private boolean returnInSub ;
   private boolean n2243BarKgsCli ;
   private IDataStoreProvider pr_default ;
   private String[] P06LW2_A396EmprCod ;
   private String[] P06LW2_A407EmprNom ;
   private boolean[] P06LW2_n407EmprNom ;
   private String[] P06LW3_A396EmprCod ;
   private long[] P06LW3_A30AlbProCod ;
   private String[] P06LW3_A39AlbProPri ;
   private java.util.Date[] P06LW3_A34AlbProfch ;
   private int[] P06LW3_A1243GuiRemCli ;
   private String[] P06LW4_A396EmprCod ;
   private long[] P06LW4_A30AlbProCod ;
   private String[] P06LW4_A130BarCodPar ;
   private byte[] P06LW4_A132BarCodReo ;
   private int[] P06LW4_A129BarCod ;
   private String[] P06LW4_A7733BarMaqEst ;
   private String[] P06LW4_A143BarDisNum ;
   private String[] P06LW4_A212BarSer ;
   private java.math.BigDecimal[] P06LW4_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P06LW4_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P06LW4_A2243BarKgsCli ;
   private boolean[] P06LW4_n2243BarKgsCli ;
   private java.math.BigDecimal[] P06LW4_A1461BarAlbPN ;
   private int[] P06LW4_A1265BarAlbPie ;
   private String[] P06LW4_A135BarColNom ;
   private int[] P06LW4_A136BarColNum ;
   private String[] P06LW4_A1234BarNomCli ;
   private int[] P06LW4_A1235BarNumCli ;
   private short[] P06LW5_AV56Trozos ;
   private String[] P06LW6_A396EmprCod ;
   private int[] P06LW6_A252CliCod ;
   private String[] P06LW6_A279CliNom ;
}

final  class ral0004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06LW2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LW3", "SELECT EmprCod, AlbProCod, AlbProPri, AlbProfch, GuiRemCli FROM TXPCALPRD WHERE (EmprCod = ? and GuiRemCli >= ? and AlbProfch >= ?) AND (AlbProfch <= ?) AND (AlbProPri = ? or ? = '2') AND (GuiRemCli <= ?) ORDER BY EmprCod, GuiRemCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LW4", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarMaqEst, T2.BarDisNum, T2.BarSer, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarKgsCli, T1.BarAlbPN, T1.BarAlbPie, T2.BarColNom, T2.BarColNum, T2.BarNomCli, T2.BarNumCli FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (( ( T2.BarSer >= ? and T2.BarSer <= ?) and (rtrim(?) IS NULL)) or ( T2.BarSer like ? and Not (rtrim(?) IS NULL))) AND (T2.BarDisNum >= ? and T2.BarDisNum <= ?) AND (( ( T2.BarMaqEst >= ? or (rtrim(?) IS NULL)) and ? = 1) or ( ? = 0)) AND (( ( T2.BarMaqEst <= ? or (rtrim(?) IS NULL)) and ? = 1) or ( ? = 0)) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LW5", "SELECT COUNT(*) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LW6", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setString(11, (String)parms[10], 6);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 6);
               stmt.setString(15, (String)parms[14], 6);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

