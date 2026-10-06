package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0000_impl extends GXWebReport
{
   public rfa0000_impl( com.genexus.internet.HttpContext context )
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
            AV8PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV9UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV25PalbProCod = GXutil.lval( httpContext.GetPar( "PalbProCod")) ;
            AV26UAlbProCod = GXutil.lval( httpContext.GetPar( "UAlbProCod")) ;
            AV10PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV11UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV27Prior = httpContext.GetPar( "Prior") ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV13Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2346_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit0 = GXt_char1 ;
         GXt_char1 = AV14Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2021_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit1 = GXt_char1 ;
         GXt_char1 = AV15Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV15Lit2 = GXt_char1 ;
         GXt_char1 = AV16Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2191_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit3 = GXt_char1 ;
         GXt_char1 = AV39Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit4 = GXt_char1 ;
         GXt_char1 = AV40Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit5 = GXt_char1 ;
         GXt_char1 = AV41Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit6 = GXt_char1 ;
         GXt_char1 = AV42Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1355_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit7 = GXt_char1 ;
         GXt_char1 = AV44Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2065_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit8 = GXt_char1 ;
         GXt_char1 = AV43Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit9 = GXt_char1 ;
         GXt_char1 = AV34Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit10 = GXt_char1 ;
         GXt_char1 = AV35Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit11 = GXt_char1 ;
         GXt_char1 = AV36Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit12 = GXt_char1 ;
         GXt_char1 = AV37Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit13 = GXt_char1 ;
         GXt_char1 = AV38Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1189_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit14 = GXt_char1 ;
         GXt_char1 = AV47Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char2) ;
         rfa0000_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit19 = GXt_char1 ;
         AV48Lit16 = httpContext.getMessage( "Operaciones Hdr", "") ;
         if ( AV49FlagIdioma == 1 )
         {
            AV48Lit16 = httpContext.getMessage( "Serviços O.S.", "") ;
         }
         AV31FlagTtx = (byte)(0) ;
         GXv_int3[0] = AV31FlagTtx ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int3) ;
         rfa0000_impl.this.AV31FlagTtx = GXv_int3[0] ;
         AV50FlagTexk = (byte)(0) ;
         GXv_int3[0] = AV50FlagTexk ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int3) ;
         rfa0000_impl.this.AV50FlagTexk = GXv_int3[0] ;
         GXt_int4 = AV52Refugio ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REFUGI", ""), GXv_int3) ;
         rfa0000_impl.this.GXt_int4 = GXv_int3[0] ;
         AV52Refugio = GXt_int4 ;
         /* Using cursor P06H82 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06H82_A407EmprNom[0] ;
            n407EmprNom = P06H82_n407EmprNom[0] ;
            AV12EmpNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV28PPrior, "0") == 0 )
         {
            AV28PPrior = "0" ;
            AV29UPrior = "0" ;
         }
         if ( GXutil.strcmp(AV28PPrior, "1") == 0 )
         {
            AV28PPrior = "1" ;
            AV29UPrior = "1" ;
         }
         AV24TotInf = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06H83 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8PCliCod), Integer.valueOf(AV9UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A279CliNom = P06H83_A279CliNom[0] ;
            A252CliCod = P06H83_A252CliCod[0] ;
            A10045CliAct = P06H83_A10045CliAct[0] ;
            AV17CliCod = A252CliCod ;
            AV18FlagCliCod = (byte)(0) ;
            AV21TotCli = DecimalUtil.doubleToDec(0) ;
            AV30FlagHdr = (byte)(0) ;
            /* Using cursor P06H84 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV25PalbProCod), Long.valueOf(AV26UAlbProCod), AV10PFecha, AV11UFecha, AV27Prior, Integer.valueOf(AV17CliCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1253EmprGuiRem = P06H84_A1253EmprGuiRem[0] ;
               A3915EmpNumDec = P06H84_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P06H84_n3915EmpNumDec[0] ;
               A34AlbProfch = P06H84_A34AlbProfch[0] ;
               A30AlbProCod = P06H84_A30AlbProCod[0] ;
               A1243GuiRemCli = P06H84_A1243GuiRemCli[0] ;
               A33AlbProEst = P06H84_A33AlbProEst[0] ;
               A39AlbProPri = P06H84_A39AlbProPri[0] ;
               A3915EmpNumDec = P06H84_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P06H84_n3915EmpNumDec[0] ;
               AV30FlagHdr = (byte)(0) ;
               /* Using cursor P06H85 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A130BarCodPar = P06H85_A130BarCodPar[0] ;
                  A132BarCodReo = P06H85_A132BarCodReo[0] ;
                  A129BarCod = P06H85_A129BarCod[0] ;
                  A2839AlbProVal = P06H85_A2839AlbProVal[0] ;
                  A32AlbProEsp = P06H85_A32AlbProEsp[0] ;
                  A1262BarPreKgm = P06H85_A1262BarPreKgm[0] ;
                  A1264BarPreMtr = P06H85_A1264BarPreMtr[0] ;
                  A1263BarAlbMtrE = P06H85_A1263BarAlbMtrE[0] ;
                  A1261BarAlbKgmE = P06H85_A1261BarAlbKgmE[0] ;
                  A5354AlbImpMan = P06H85_A5354AlbImpMan[0] ;
                  A135BarColNom = P06H85_A135BarColNom[0] ;
                  A136BarColNum = P06H85_A136BarColNum[0] ;
                  A1234BarNomCli = P06H85_A1234BarNomCli[0] ;
                  A1235BarNumCli = P06H85_A1235BarNumCli[0] ;
                  A217BarTipArt = P06H85_A217BarTipArt[0] ;
                  n217BarTipArt = P06H85_n217BarTipArt[0] ;
                  A218BarTipCol = P06H85_A218BarTipCol[0] ;
                  A212BarSer = P06H85_A212BarSer[0] ;
                  A135BarColNom = P06H85_A135BarColNom[0] ;
                  A136BarColNum = P06H85_A136BarColNum[0] ;
                  A1234BarNomCli = P06H85_A1234BarNomCli[0] ;
                  A1235BarNumCli = P06H85_A1235BarNumCli[0] ;
                  A217BarTipArt = P06H85_A217BarTipArt[0] ;
                  n217BarTipArt = P06H85_n217BarTipArt[0] ;
                  A218BarTipCol = P06H85_A218BarTipCol[0] ;
                  A212BarSer = P06H85_A212BarSer[0] ;
                  if ( ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) || ( AV52Refugio == 0 ) )
                  {
                     if ( AV18FlagCliCod == 0 )
                     {
                        AV18FlagCliCod = (byte)(1) ;
                        h6H80( false, 23) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 38, Gx_line+4, 83, Gx_line+19, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 94, Gx_line+4, 283, Gx_line+19, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+23) ;
                     }
                     AV45PrecioK = A1262BarPreKgm ;
                     AV46PrecioM = A1264BarPreMtr ;
                     if ( A3915EmpNumDec == 0 )
                     {
                        AV19ImpLinea = GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 0).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 0)) ;
                     }
                     else
                     {
                        AV19ImpLinea = GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 2).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 2)) ;
                     }
                     if ( AV19ImpLinea.doubleValue() == 0 )
                     {
                        AV19ImpLinea = A5354AlbImpMan ;
                     }
                     AV23Marca = " " ;
                     if ( ( AV19ImpLinea.doubleValue() == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5354AlbImpMan)==0) )
                     {
                        AV23Marca = "<-" ;
                     }
                     AV22Hdr = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 0, 0) + A130BarCodPar ;
                     AV30FlagHdr = (byte)(1) ;
                     AV32BarColNom = A135BarColNom ;
                     AV33BarColNum = A136BarColNum ;
                     if ( AV31FlagTtx == 1 )
                     {
                        AV32BarColNom = A1234BarNomCli ;
                        AV33BarColNum = A1235BarNumCli ;
                     }
                     GXv_char2[0] = A396EmprCod ;
                     GXv_int5[0] = A217BarTipArt ;
                     GXv_char6[0] = AV51TipArtDsc ;
                     new app.pbustad(remoteHandle, context).execute( GXv_char2, GXv_int5, GXv_char6) ;
                     rfa0000_impl.this.A396EmprCod = GXv_char2[0] ;
                     rfa0000_impl.this.A217BarTipArt = GXv_int5[0] ;
                     rfa0000_impl.this.AV51TipArtDsc = GXv_char6[0] ;
                     h6H80( false, 17) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 96, Gx_line+1, 155, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 11, Gx_line+1, 85, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 161, Gx_line+1, 220, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 232, Gx_line+1, 240, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 223, Gx_line+1, 231, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 249, Gx_line+1, 367, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32BarColNom, "")), 372, Gx_line+1, 468, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33BarColNum), "ZZZZZ9")), 473, Gx_line+1, 518, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 526, Gx_line+1, 542, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")), 551, Gx_line+1, 618, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45PrecioK, "ZZZ9.99")), 636, Gx_line+1, 688, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99")), 708, Gx_line+1, 775, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46PrecioM, "ZZZ9.99")), 795, Gx_line+1, 847, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+1, 955, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 974, Gx_line+0, 990, Gx_line+16, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     if ( AV50FlagTexk == 1 )
                     {
                        h6H80( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TipArtDsc, "")), 249, Gx_line+0, 469, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                     AV20FlagAlbFas = (byte)(0) ;
                     /* Using cursor P06H86 */
                     pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     while ( (pr_default.getStatus(4) != 101) )
                     {
                        A1241GuiFasPKg = P06H86_A1241GuiFasPKg[0] ;
                        A1242GuiFasPMt = P06H86_A1242GuiFasPMt[0] ;
                        A1276FasMtr = P06H86_A1276FasMtr[0] ;
                        A1275FasKgm = P06H86_A1275FasKgm[0] ;
                        A457FasCod = P06H86_A457FasCod[0] ;
                        A460FasDsc = P06H86_A460FasDsc[0] ;
                        A1240GuiFasLin = P06H86_A1240GuiFasLin[0] ;
                        A460FasDsc = P06H86_A460FasDsc[0] ;
                        AV45PrecioK = A1241GuiFasPKg ;
                        AV46PrecioM = A1242GuiFasPMt ;
                        if ( A3915EmpNumDec == 0 )
                        {
                           AV19ImpLinea = GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 0).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 0)) ;
                        }
                        else
                        {
                           AV19ImpLinea = GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)) ;
                        }
                        AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                        AV23Marca = " " ;
                        if ( AV19ImpLinea.doubleValue() == 0 )
                        {
                           AV23Marca = "<-" ;
                        }
                        if ( AV20FlagAlbFas == 0 )
                        {
                           AV20FlagAlbFas = (byte)(1) ;
                           h6H80( false, 38) ;
                           getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Hdr, "")), 163, Gx_line+5, 233, Gx_line+20, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 310, Gx_line+21, 515, Gx_line+37, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")), 551, Gx_line+21, 618, Gx_line+37, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45PrecioK, "ZZZ9.99")), 636, Gx_line+21, 688, Gx_line+37, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")), 708, Gx_line+21, 775, Gx_line+37, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46PrecioM, "ZZZ9.99")), 795, Gx_line+21, 847, Gx_line+37, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+21, 955, Gx_line+37, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 974, Gx_line+21, 990, Gx_line+37, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit16, "")), 56, Gx_line+5, 161, Gx_line+20, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 249, Gx_line+21, 308, Gx_line+37, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+38) ;
                        }
                        else
                        {
                           h6H80( false, 16) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 310, Gx_line+0, 515, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")), 551, Gx_line+0, 618, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45PrecioK, "ZZZ9.99")), 636, Gx_line+0, 688, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")), 708, Gx_line+0, 775, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46PrecioM, "ZZZ9.99")), 795, Gx_line+0, 847, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+0, 955, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 974, Gx_line+0, 990, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 249, Gx_line+0, 308, Gx_line+16, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+16) ;
                        }
                        pr_default.readNext(4);
                     }
                     pr_default.close(4);
                     /* Using cursor P06H87 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     while ( (pr_default.getStatus(5) != 101) )
                     {
                        A1469AlbPrdPKg = P06H87_A1469AlbPrdPKg[0] ;
                        n1469AlbPrdPKg = P06H87_n1469AlbPrdPKg[0] ;
                        A1470AlbPrdPMt = P06H87_A1470AlbPrdPMt[0] ;
                        n1470AlbPrdPMt = P06H87_n1470AlbPrdPMt[0] ;
                        A1472PrdMtr = P06H87_A1472PrdMtr[0] ;
                        n1472PrdMtr = P06H87_n1472PrdMtr[0] ;
                        A1471PrdKgm = P06H87_A1471PrdKgm[0] ;
                        n1471PrdKgm = P06H87_n1471PrdKgm[0] ;
                        A759ProDsc = P06H87_A759ProDsc[0] ;
                        A758ProCod = P06H87_A758ProCod[0] ;
                        n758ProCod = P06H87_n758ProCod[0] ;
                        A1468AlbPrdLin = P06H87_A1468AlbPrdLin[0] ;
                        A759ProDsc = P06H87_A759ProDsc[0] ;
                        AV20FlagAlbFas = (byte)(1) ;
                        AV45PrecioK = A1469AlbPrdPKg ;
                        AV46PrecioM = A1470AlbPrdPMt ;
                        if ( A3915EmpNumDec == 0 )
                        {
                           AV19ImpLinea = GXutil.roundDecimal( A1471PrdKgm.multiply(A1469AlbPrdPKg), 0).add(GXutil.roundDecimal( A1472PrdMtr.multiply(A1470AlbPrdPMt), 0)) ;
                        }
                        else
                        {
                           AV19ImpLinea = GXutil.roundDecimal( A1471PrdKgm.multiply(A1469AlbPrdPKg), 2).add(GXutil.roundDecimal( A1472PrdMtr.multiply(A1470AlbPrdPMt), 2)) ;
                        }
                        AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                        AV23Marca = " " ;
                        if ( AV19ImpLinea.doubleValue() == 0 )
                        {
                           AV23Marca = "<-" ;
                        }
                        h6H80( false, 26) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 151, Gx_line+6, 210, Gx_line+22, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 249, Gx_line+6, 542, Gx_line+22, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1471PrdKgm, "ZZZZZ9.99")), 551, Gx_line+6, 618, Gx_line+22, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+6, 955, Gx_line+22, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 974, Gx_line+6, 990, Gx_line+22, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45PrecioK, "ZZZ9.99")), 636, Gx_line+6, 688, Gx_line+22, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1472PrdMtr, "ZZZZZ9.99")), 708, Gx_line+6, 775, Gx_line+22, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46PrecioM, "ZZZ9.99")), 795, Gx_line+6, 847, Gx_line+22, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit19, "")), 84, Gx_line+7, 137, Gx_line+22, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+26) ;
                        pr_default.readNext(5);
                     }
                     pr_default.close(5);
                     /* Using cursor P06H88 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     while ( (pr_default.getStatus(6) != 101) )
                     {
                        A2767AlbHdrPKg = P06H88_A2767AlbHdrPKg[0] ;
                        A2769AlbHdrPMt = P06H88_A2769AlbHdrPMt[0] ;
                        A2770ALbHdrMts = P06H88_A2770ALbHdrMts[0] ;
                        A2768AlbHdrKgs = P06H88_A2768AlbHdrKgs[0] ;
                        A2765AlbHdrTxt = P06H88_A2765AlbHdrTxt[0] ;
                        A2764AlbHdrLin = P06H88_A2764AlbHdrLin[0] ;
                        AV45PrecioK = A2767AlbHdrPKg ;
                        AV46PrecioM = A2769AlbHdrPMt ;
                        if ( A3915EmpNumDec == 0 )
                        {
                           AV19ImpLinea = GXutil.roundDecimal( A2768AlbHdrKgs.multiply(A2767AlbHdrPKg), 0).add(GXutil.roundDecimal( A2770ALbHdrMts.multiply(A2769AlbHdrPMt), 0)) ;
                        }
                        else
                        {
                           AV19ImpLinea = GXutil.roundDecimal( A2768AlbHdrKgs.multiply(A2767AlbHdrPKg), 2).add(GXutil.roundDecimal( A2770ALbHdrMts.multiply(A2769AlbHdrPMt), 2)) ;
                        }
                        AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                        AV23Marca = " " ;
                        if ( AV19ImpLinea.doubleValue() == 0 )
                        {
                           AV23Marca = "<-" ;
                        }
                        h6H80( false, 24) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2765AlbHdrTxt, "")), 249, Gx_line+4, 469, Gx_line+20, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2768AlbHdrKgs, "ZZZZZ9.99")), 551, Gx_line+4, 618, Gx_line+20, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19ImpLinea, "ZZ,ZZZ,ZZ9.99")), 859, Gx_line+4, 955, Gx_line+20, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Marca, "")), 974, Gx_line+4, 990, Gx_line+20, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45PrecioK, "ZZZ9.99")), 636, Gx_line+4, 688, Gx_line+20, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2770ALbHdrMts, "ZZZZZ9.99")), 708, Gx_line+5, 775, Gx_line+21, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46PrecioM, "ZZZ9.99")), 795, Gx_line+5, 847, Gx_line+21, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+24) ;
                        pr_default.readNext(6);
                     }
                     pr_default.close(6);
                     if ( AV20FlagAlbFas == 1 )
                     {
                        h6H80( false, 15) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+15) ;
                     }
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV24TotInf = AV24TotInf.add(AV21TotCli) ;
            if ( AV30FlagHdr > 0 )
            {
               h6H80( false, 33) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotCli, "ZZ,ZZZ,ZZ9.99")), 872, Gx_line+10, 968, Gx_line+25, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Cliente..", ""), 57, Gx_line+10, 141, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 151, Gx_line+10, 196, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 208, Gx_line+10, 428, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+29, 991, Gx_line+29, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+4, 991, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TotInf)==0) )
         {
            h6H80( false, 39) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total Informe..", ""), 59, Gx_line+14, 163, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotInf, "ZZ,ZZZ,ZZ9.99")), 858, Gx_line+14, 967, Gx_line+32, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+39) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6H80( true, 0) ;
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

   public void h6H80( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12EmpNom, "")), 11, Gx_line+11, 231, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit1, "")), 11, Gx_line+44, 200, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit0, "")), 830, Gx_line+45, 894, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 899, Gx_line+44, 944, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit2, "")), 694, Gx_line+13, 758, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 760, Gx_line+11, 819, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit3, "")), 823, Gx_line+13, 887, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 889, Gx_line+11, 948, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+68, 961, Gx_line+68, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit10, "")), 560, Gx_line+79, 616, Gx_line+93, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit11, "")), 625, Gx_line+79, 688, Gx_line+93, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit12, "")), 718, Gx_line+79, 774, Gx_line+93, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit13, "")), 783, Gx_line+79, 846, Gx_line+93, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit14, "")), 892, Gx_line+79, 955, Gx_line+93, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit4, "")), 11, Gx_line+79, 74, Gx_line+93, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit5, "")), 96, Gx_line+79, 140, Gx_line+93, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit6, "")), 161, Gx_line+79, 230, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit7, "")), 249, Gx_line+79, 325, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit9, "")), 479, Gx_line+79, 517, Gx_line+93, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit8, "")), 372, Gx_line+79, 425, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 526, Gx_line+79, 542, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(3, Gx_line+97, 962, Gx_line+97, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+100) ;
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
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
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
      AV10PFecha = GXutil.nullDate() ;
      AV11UFecha = GXutil.nullDate() ;
      AV27Prior = "" ;
      AV13Lit0 = "" ;
      AV14Lit1 = "" ;
      AV15Lit2 = "" ;
      AV16Lit3 = "" ;
      AV39Lit4 = "" ;
      AV40Lit5 = "" ;
      AV41Lit6 = "" ;
      AV42Lit7 = "" ;
      AV44Lit8 = "" ;
      AV43Lit9 = "" ;
      AV34Lit10 = "" ;
      AV35Lit11 = "" ;
      AV36Lit12 = "" ;
      AV37Lit13 = "" ;
      AV38Lit14 = "" ;
      AV47Lit19 = "" ;
      GXt_char1 = "" ;
      AV48Lit16 = "" ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P06H82_A396EmprCod = new String[] {""} ;
      P06H82_A407EmprNom = new String[] {""} ;
      P06H82_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV12EmpNom = "" ;
      AV28PPrior = "" ;
      AV29UPrior = "" ;
      AV24TotInf = DecimalUtil.ZERO ;
      P06H83_A396EmprCod = new String[] {""} ;
      P06H83_A279CliNom = new String[] {""} ;
      P06H83_A252CliCod = new int[1] ;
      P06H83_A10045CliAct = new String[] {""} ;
      A279CliNom = "" ;
      A10045CliAct = "" ;
      AV21TotCli = DecimalUtil.ZERO ;
      P06H84_A396EmprCod = new String[] {""} ;
      P06H84_A1253EmprGuiRem = new String[] {""} ;
      P06H84_A3915EmpNumDec = new byte[1] ;
      P06H84_n3915EmpNumDec = new boolean[] {false} ;
      P06H84_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P06H84_A30AlbProCod = new long[1] ;
      P06H84_A1243GuiRemCli = new int[1] ;
      P06H84_A33AlbProEst = new byte[1] ;
      P06H84_A39AlbProPri = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A39AlbProPri = "" ;
      P06H85_A396EmprCod = new String[] {""} ;
      P06H85_A30AlbProCod = new long[1] ;
      P06H85_A130BarCodPar = new String[] {""} ;
      P06H85_A132BarCodReo = new byte[1] ;
      P06H85_A129BarCod = new int[1] ;
      P06H85_A2839AlbProVal = new String[] {""} ;
      P06H85_A32AlbProEsp = new byte[1] ;
      P06H85_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H85_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H85_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H85_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H85_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H85_A135BarColNom = new String[] {""} ;
      P06H85_A136BarColNum = new int[1] ;
      P06H85_A1234BarNomCli = new String[] {""} ;
      P06H85_A1235BarNumCli = new int[1] ;
      P06H85_A217BarTipArt = new short[1] ;
      P06H85_n217BarTipArt = new boolean[] {false} ;
      P06H85_A218BarTipCol = new byte[1] ;
      P06H85_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A2839AlbProVal = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A212BarSer = "" ;
      AV45PrecioK = DecimalUtil.ZERO ;
      AV46PrecioM = DecimalUtil.ZERO ;
      AV19ImpLinea = DecimalUtil.ZERO ;
      AV23Marca = "" ;
      AV22Hdr = "" ;
      AV32BarColNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new short[1] ;
      AV51TipArtDsc = "" ;
      GXv_char6 = new String[1] ;
      P06H86_A396EmprCod = new String[] {""} ;
      P06H86_A30AlbProCod = new long[1] ;
      P06H86_A129BarCod = new int[1] ;
      P06H86_A132BarCodReo = new byte[1] ;
      P06H86_A130BarCodPar = new String[] {""} ;
      P06H86_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H86_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H86_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H86_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H86_A457FasCod = new String[] {""} ;
      P06H86_A460FasDsc = new String[] {""} ;
      P06H86_A1240GuiFasLin = new short[1] ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      P06H87_A396EmprCod = new String[] {""} ;
      P06H87_A30AlbProCod = new long[1] ;
      P06H87_A129BarCod = new int[1] ;
      P06H87_A132BarCodReo = new byte[1] ;
      P06H87_A130BarCodPar = new String[] {""} ;
      P06H87_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H87_n1469AlbPrdPKg = new boolean[] {false} ;
      P06H87_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H87_n1470AlbPrdPMt = new boolean[] {false} ;
      P06H87_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H87_n1472PrdMtr = new boolean[] {false} ;
      P06H87_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H87_n1471PrdKgm = new boolean[] {false} ;
      P06H87_A759ProDsc = new String[] {""} ;
      P06H87_A758ProCod = new String[] {""} ;
      P06H87_n758ProCod = new boolean[] {false} ;
      P06H87_A1468AlbPrdLin = new short[1] ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      P06H88_A396EmprCod = new String[] {""} ;
      P06H88_A30AlbProCod = new long[1] ;
      P06H88_A129BarCod = new int[1] ;
      P06H88_A132BarCodReo = new byte[1] ;
      P06H88_A130BarCodPar = new String[] {""} ;
      P06H88_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H88_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H88_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H88_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06H88_A2765AlbHdrTxt = new String[] {""} ;
      P06H88_A2764AlbHdrLin = new short[1] ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2765AlbHdrTxt = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rfa0000__default(),
         new Object[] {
             new Object[] {
            P06H82_A396EmprCod, P06H82_A407EmprNom, P06H82_n407EmprNom
            }
            , new Object[] {
            P06H83_A396EmprCod, P06H83_A279CliNom, P06H83_A252CliCod, P06H83_A10045CliAct
            }
            , new Object[] {
            P06H84_A396EmprCod, P06H84_A1253EmprGuiRem, P06H84_A3915EmpNumDec, P06H84_n3915EmpNumDec, P06H84_A34AlbProfch, P06H84_A30AlbProCod, P06H84_A1243GuiRemCli, P06H84_A33AlbProEst, P06H84_A39AlbProPri
            }
            , new Object[] {
            P06H85_A396EmprCod, P06H85_A30AlbProCod, P06H85_A130BarCodPar, P06H85_A132BarCodReo, P06H85_A129BarCod, P06H85_A2839AlbProVal, P06H85_A32AlbProEsp, P06H85_A1262BarPreKgm, P06H85_A1264BarPreMtr, P06H85_A1263BarAlbMtrE,
            P06H85_A1261BarAlbKgmE, P06H85_A5354AlbImpMan, P06H85_A135BarColNom, P06H85_A136BarColNum, P06H85_A1234BarNomCli, P06H85_A1235BarNumCli, P06H85_A217BarTipArt, P06H85_n217BarTipArt, P06H85_A218BarTipCol, P06H85_A212BarSer
            }
            , new Object[] {
            P06H86_A396EmprCod, P06H86_A30AlbProCod, P06H86_A129BarCod, P06H86_A132BarCodReo, P06H86_A130BarCodPar, P06H86_A1241GuiFasPKg, P06H86_A1242GuiFasPMt, P06H86_A1276FasMtr, P06H86_A1275FasKgm, P06H86_A457FasCod,
            P06H86_A460FasDsc, P06H86_A1240GuiFasLin
            }
            , new Object[] {
            P06H87_A396EmprCod, P06H87_A30AlbProCod, P06H87_A129BarCod, P06H87_A132BarCodReo, P06H87_A130BarCodPar, P06H87_A1469AlbPrdPKg, P06H87_n1469AlbPrdPKg, P06H87_A1470AlbPrdPMt, P06H87_n1470AlbPrdPMt, P06H87_A1472PrdMtr,
            P06H87_n1472PrdMtr, P06H87_A1471PrdKgm, P06H87_n1471PrdKgm, P06H87_A759ProDsc, P06H87_A758ProCod, P06H87_n758ProCod, P06H87_A1468AlbPrdLin
            }
            , new Object[] {
            P06H88_A396EmprCod, P06H88_A30AlbProCod, P06H88_A129BarCod, P06H88_A132BarCodReo, P06H88_A130BarCodPar, P06H88_A2767AlbHdrPKg, P06H88_A2769AlbHdrPMt, P06H88_A2770ALbHdrMts, P06H88_A2768AlbHdrKgs, P06H88_A2765AlbHdrTxt,
            P06H88_A2764AlbHdrLin
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

   private byte AV49FlagIdioma ;
   private byte AV31FlagTtx ;
   private byte AV50FlagTexk ;
   private byte AV52Refugio ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte AV18FlagCliCod ;
   private byte AV30FlagHdr ;
   private byte A3915EmpNumDec ;
   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte A218BarTipCol ;
   private byte AV20FlagAlbFas ;
   private short gxcookieaux ;
   private short A217BarTipArt ;
   private short GXv_int5[] ;
   private short A1240GuiFasLin ;
   private short A1468AlbPrdLin ;
   private short A2764AlbHdrLin ;
   private short Gx_err ;
   private int AV8PCliCod ;
   private int AV9UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV17CliCod ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int Gx_OldLine ;
   private int AV33BarColNum ;
   private long AV25PalbProCod ;
   private long AV26UAlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV24TotInf ;
   private java.math.BigDecimal AV21TotCli ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal AV45PrecioK ;
   private java.math.BigDecimal AV46PrecioM ;
   private java.math.BigDecimal AV19ImpLinea ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV27Prior ;
   private String AV13Lit0 ;
   private String AV14Lit1 ;
   private String AV15Lit2 ;
   private String AV16Lit3 ;
   private String AV39Lit4 ;
   private String AV40Lit5 ;
   private String AV41Lit6 ;
   private String AV42Lit7 ;
   private String AV44Lit8 ;
   private String AV43Lit9 ;
   private String AV34Lit10 ;
   private String AV35Lit11 ;
   private String AV36Lit12 ;
   private String AV37Lit13 ;
   private String AV38Lit14 ;
   private String AV47Lit19 ;
   private String GXt_char1 ;
   private String AV48Lit16 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV12EmpNom ;
   private String AV28PPrior ;
   private String AV29UPrior ;
   private String A279CliNom ;
   private String A10045CliAct ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A130BarCodPar ;
   private String A2839AlbProVal ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A212BarSer ;
   private String AV23Marca ;
   private String AV22Hdr ;
   private String AV32BarColNom ;
   private String GXv_char2[] ;
   private String AV51TipArtDsc ;
   private String GXv_char6[] ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A2765AlbHdrTxt ;
   private String Gx_time ;
   private java.util.Date AV10PFecha ;
   private java.util.Date AV11UFecha ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n217BarTipArt ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1470AlbPrdPMt ;
   private boolean n1472PrdMtr ;
   private boolean n1471PrdKgm ;
   private boolean n758ProCod ;
   private IDataStoreProvider pr_default ;
   private String[] P06H82_A396EmprCod ;
   private String[] P06H82_A407EmprNom ;
   private boolean[] P06H82_n407EmprNom ;
   private String[] P06H83_A396EmprCod ;
   private String[] P06H83_A279CliNom ;
   private int[] P06H83_A252CliCod ;
   private String[] P06H83_A10045CliAct ;
   private String[] P06H84_A396EmprCod ;
   private String[] P06H84_A1253EmprGuiRem ;
   private byte[] P06H84_A3915EmpNumDec ;
   private boolean[] P06H84_n3915EmpNumDec ;
   private java.util.Date[] P06H84_A34AlbProfch ;
   private long[] P06H84_A30AlbProCod ;
   private int[] P06H84_A1243GuiRemCli ;
   private byte[] P06H84_A33AlbProEst ;
   private String[] P06H84_A39AlbProPri ;
   private String[] P06H85_A396EmprCod ;
   private long[] P06H85_A30AlbProCod ;
   private String[] P06H85_A130BarCodPar ;
   private byte[] P06H85_A132BarCodReo ;
   private int[] P06H85_A129BarCod ;
   private String[] P06H85_A2839AlbProVal ;
   private byte[] P06H85_A32AlbProEsp ;
   private java.math.BigDecimal[] P06H85_A1262BarPreKgm ;
   private java.math.BigDecimal[] P06H85_A1264BarPreMtr ;
   private java.math.BigDecimal[] P06H85_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P06H85_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P06H85_A5354AlbImpMan ;
   private String[] P06H85_A135BarColNom ;
   private int[] P06H85_A136BarColNum ;
   private String[] P06H85_A1234BarNomCli ;
   private int[] P06H85_A1235BarNumCli ;
   private short[] P06H85_A217BarTipArt ;
   private boolean[] P06H85_n217BarTipArt ;
   private byte[] P06H85_A218BarTipCol ;
   private String[] P06H85_A212BarSer ;
   private String[] P06H86_A396EmprCod ;
   private long[] P06H86_A30AlbProCod ;
   private int[] P06H86_A129BarCod ;
   private byte[] P06H86_A132BarCodReo ;
   private String[] P06H86_A130BarCodPar ;
   private java.math.BigDecimal[] P06H86_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P06H86_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P06H86_A1276FasMtr ;
   private java.math.BigDecimal[] P06H86_A1275FasKgm ;
   private String[] P06H86_A457FasCod ;
   private String[] P06H86_A460FasDsc ;
   private short[] P06H86_A1240GuiFasLin ;
   private String[] P06H87_A396EmprCod ;
   private long[] P06H87_A30AlbProCod ;
   private int[] P06H87_A129BarCod ;
   private byte[] P06H87_A132BarCodReo ;
   private String[] P06H87_A130BarCodPar ;
   private java.math.BigDecimal[] P06H87_A1469AlbPrdPKg ;
   private boolean[] P06H87_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] P06H87_A1470AlbPrdPMt ;
   private boolean[] P06H87_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] P06H87_A1472PrdMtr ;
   private boolean[] P06H87_n1472PrdMtr ;
   private java.math.BigDecimal[] P06H87_A1471PrdKgm ;
   private boolean[] P06H87_n1471PrdKgm ;
   private String[] P06H87_A759ProDsc ;
   private String[] P06H87_A758ProCod ;
   private boolean[] P06H87_n758ProCod ;
   private short[] P06H87_A1468AlbPrdLin ;
   private String[] P06H88_A396EmprCod ;
   private long[] P06H88_A30AlbProCod ;
   private int[] P06H88_A129BarCod ;
   private byte[] P06H88_A132BarCodReo ;
   private String[] P06H88_A130BarCodPar ;
   private java.math.BigDecimal[] P06H88_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P06H88_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] P06H88_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P06H88_A2768AlbHdrKgs ;
   private String[] P06H88_A2765AlbHdrTxt ;
   private short[] P06H88_A2764AlbHdrLin ;
}

final  class rfa0000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06H82", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06H83", "SELECT EmprCod, CliNom, CliCod, CliAct FROM TXPCLIENT WHERE (EmprCod = ? and CliCod >= ?) AND (CliAct = 'S') AND (CliCod <= ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06H84", "SELECT T1.EmprCod, T1.EmprGuiRem, T2.EmpNumDec, T1.AlbProfch, T1.AlbProCod, T1.GuiRemCli, T1.AlbProEst, T1.AlbProPri FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE (T1.EmprGuiRem = ?) AND (T1.AlbProCod >= ? and T1.AlbProCod <= ?) AND (T1.AlbProfch >= ? and T1.AlbProfch <= ?) AND (T1.AlbProPri = ?) AND (T1.AlbProEst = 1) AND (T1.GuiRemCli = ?) ORDER BY T1.EmprCod, T1.GuiRemCli, T1.AlbProEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06H85", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProVal, T1.AlbProEsp, T1.BarPreKgm, T1.BarPreMtr, T1.BarAlbMtrE, T1.BarAlbKgmE, T1.AlbImpMan, T2.BarColNom, T2.BarColNum, T2.BarNomCli, T2.BarNumCli, T2.BarTipArt, T2.BarTipCol, T2.BarSer FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T1.AlbProEsp < 10) ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06H86", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasPKg, T1.GuiFasPMt, T1.FasMtr, T1.FasKgm, T1.FasCod, T2.FasDsc, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06H87", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPrdPKg, T1.AlbPrdPMt, T1.PrdMtr, T1.PrdKgm, T2.ProDsc, T1.ProCod, T1.AlbPrdLin FROM ((TXPALBPRD T1 LEFT JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06H88", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrPKg, AlbHdrPMt, ALbHdrMts, AlbHdrKgs, AlbHdrTxt, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((long[]) buf[5])[0] = rslt.getLong(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 28);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 40);
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((short[]) buf[10])[0] = rslt.getShort(11);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

