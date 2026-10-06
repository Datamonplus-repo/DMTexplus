package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rconprc1_impl extends GXWebReport
{
   public rconprc1_impl( com.genexus.internet.HttpContext context )
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
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
         GXt_char1 = AV8Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV8Lit2 = GXt_char1 ;
         GXt_char1 = AV10Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit3 = GXt_char1 ;
         GXt_char1 = AV12Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV12Lit4 = GXt_char1 ;
         GXt_char1 = AV15Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV15Lit5 = GXt_char1 ;
         GXt_char1 = AV13Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit6 = GXt_char1 ;
         GXt_char1 = AV16Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit7 = GXt_char1 ;
         GXt_char1 = AV9Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN416_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit8 = GXt_char1 ;
         GXt_char1 = AV11Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN245_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit9 = GXt_char1 ;
         GXt_char1 = AV14Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2186_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit10 = GXt_char1 ;
         GXt_char1 = AV17Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit11 = GXt_char1 ;
         GXt_char1 = AV23Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN465_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit12 = GXt_char1 ;
         GXt_char1 = AV37Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN359_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit13 = GXt_char1 ;
         GXt_char1 = AV24Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN480_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit14 = GXt_char1 ;
         GXt_char1 = AV25Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN481_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit15 = GXt_char1 ;
         GXt_char1 = AV26Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit18 = GXt_char1 ;
         GXt_char1 = AV27Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN484_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit19 = GXt_char1 ;
         GXt_char1 = AV18Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "BARCOSPROC", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit20 = GXt_char1 ;
         GXt_char1 = AV19Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "BARCOSANYC", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit21 = GXt_char1 ;
         GXt_char1 = AV20Lit22 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WDHRCOS", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit22 = GXt_char1 ;
         GXt_char1 = AV21Lit33 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit33 = GXt_char1 ;
         GXt_char1 = AV22Lit34 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit34 = GXt_char1 ;
         GXt_char1 = AV28Lit35 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN463_", ""), (byte)(99), GXv_char2) ;
         rconprc1_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit35 = GXt_char1 ;
         GXt_int3 = AV42Plannc ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLANNC", ""), GXv_int4) ;
         rconprc1_impl.this.GXt_int3 = GXv_int4[0] ;
         AV42Plannc = GXt_int3 ;
         GxHdr2 = true ;
         /* Using cursor P06Q52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P06Q52_A361DisCod[0] ;
            A966PartCod = P06Q52_A966PartCod[0] ;
            n966PartCod = P06Q52_n966PartCod[0] ;
            A141BarCosPro = P06Q52_A141BarCosPro[0] ;
            A1235BarNumCli = P06Q52_A1235BarNumCli[0] ;
            A1234BarNomCli = P06Q52_A1234BarNomCli[0] ;
            A136BarColNum = P06Q52_A136BarColNum[0] ;
            A135BarColNom = P06Q52_A135BarColNom[0] ;
            A1652BarSerDsc = P06Q52_A1652BarSerDsc[0] ;
            A212BarSer = P06Q52_A212BarSer[0] ;
            A155BarFecCli = P06Q52_A155BarFecCli[0] ;
            A143BarDisNum = P06Q52_A143BarDisNum[0] ;
            A279CliNom = P06Q52_A279CliNom[0] ;
            A252CliCod = P06Q52_A252CliCod[0] ;
            n252CliCod = P06Q52_n252CliCod[0] ;
            A140BarCosAny = P06Q52_A140BarCosAny[0] ;
            A966PartCod = P06Q52_A966PartCod[0] ;
            n966PartCod = P06Q52_n966PartCod[0] ;
            A279CliNom = P06Q52_A279CliNom[0] ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int5[0] = A129BarCod ;
            GXv_int4[0] = A132BarCodReo ;
            GXv_char6[0] = A130BarCodPar ;
            GXv_decimal7[0] = AV38Barkgm ;
            GXv_decimal8[0] = AV39BarMtr ;
            GXv_int9[0] = AV40BarPiepie ;
            new app.pbuskmp(remoteHandle, context).execute( GXv_char2, GXv_int5, GXv_int4, GXv_char6, GXv_decimal7, GXv_decimal8, GXv_int9) ;
            rconprc1_impl.this.A396EmprCod = GXv_char2[0] ;
            rconprc1_impl.this.A129BarCod = GXv_int5[0] ;
            rconprc1_impl.this.A132BarCodReo = GXv_int4[0] ;
            rconprc1_impl.this.A130BarCodPar = GXv_char6[0] ;
            rconprc1_impl.this.AV38Barkgm = GXv_decimal7[0] ;
            rconprc1_impl.this.AV39BarMtr = GXv_decimal8[0] ;
            rconprc1_impl.this.AV40BarPiepie = GXv_int9[0] ;
            if ( ! (GXutil.strcmp("", A966PartCod)==0) )
            {
               GXt_char1 = AV17Lit11 ;
               GXv_char6[0] = GXt_char1 ;
               new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2060_", ""), (byte)(99), GXv_char6) ;
               rconprc1_impl.this.GXt_char1 = GXv_char6[0] ;
               AV17Lit11 = GXt_char1 ;
               AV16Lit7 = " " ;
               AV39BarMtr = DecimalUtil.doubleToDec(0) ;
            }
            /* Using cursor P06Q53 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A165BarHorIni = P06Q53_A165BarHorIni[0] ;
               A164BarHorFin = P06Q53_A164BarHorFin[0] ;
               A160BarFecRea = P06Q53_A160BarFecRea[0] ;
               A4443BarFasDTF = P06Q53_A4443BarFasDTF[0] ;
               n4443BarFasDTF = P06Q53_n4443BarFasDTF[0] ;
               A153BarFasEst = P06Q53_A153BarFasEst[0] ;
               A3836BarFasPri = P06Q53_A3836BarFasPri[0] ;
               A460FasDsc = P06Q53_A460FasDsc[0] ;
               A4442BarFasDTI = P06Q53_A4442BarFasDTI[0] ;
               n4442BarFasDTI = P06Q53_n4442BarFasDTI[0] ;
               A457FasCod = P06Q53_A457FasCod[0] ;
               A227BarUni = P06Q53_A227BarUni[0] ;
               A603MaqCodBis = P06Q53_A603MaqCodBis[0] ;
               A194BarOrdLin = P06Q53_A194BarOrdLin[0] ;
               A758ProCod = P06Q53_A758ProCod[0] ;
               A460FasDsc = P06Q53_A460FasDsc[0] ;
               AV29HorIni = GXutil.str( A165BarHorIni, 4, 0) ;
               AV30HorFin = GXutil.str( A164BarHorFin, 4, 0) ;
               AV31Hini = GXutil.substring( AV29HorIni, 1, 2) ;
               AV32Mini = GXutil.substring( AV29HorIni, 3, 2) ;
               AV33Hfin = GXutil.substring( AV30HorFin, 1, 2) ;
               AV34Mfin = GXutil.substring( AV30HorFin, 3, 2) ;
               AV41Fecha_p = localUtil.dtoc( A160BarFecRea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               if ( AV42Plannc == 1 )
               {
                  AV41Fecha_p = localUtil.ttoc( A4443BarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
               if ( A153BarFasEst == 2 )
               {
                  AV35Situacion = httpContext.getMessage( "C", "") ;
               }
               else
               {
                  if ( A153BarFasEst == 1 )
                  {
                     AV35Situacion = httpContext.getMessage( "P", "") ;
                  }
                  else
                  {
                     if ( A153BarFasEst == 0 )
                     {
                        AV35Situacion = " " ;
                     }
                  }
               }
               GXv_char6[0] = A396EmprCod ;
               GXv_int9[0] = A129BarCod ;
               GXv_int4[0] = A132BarCodReo ;
               GXv_char2[0] = A130BarCodPar ;
               GXv_int10[0] = A194BarOrdLin ;
               GXv_char11[0] = AV36OpeNom ;
               new app.pjln001(remoteHandle, context).execute( GXv_char6, GXv_int9, GXv_int4, GXv_char2, GXv_int10, GXv_char11) ;
               rconprc1_impl.this.A396EmprCod = GXv_char6[0] ;
               rconprc1_impl.this.A129BarCod = GXv_int9[0] ;
               rconprc1_impl.this.A132BarCodReo = GXv_int4[0] ;
               rconprc1_impl.this.A130BarCodPar = GXv_char2[0] ;
               rconprc1_impl.this.A194BarOrdLin = GXv_int10[0] ;
               rconprc1_impl.this.AV36OpeNom = GXv_char11[0] ;
               AV36OpeNom = GXutil.substring( AV36OpeNom, 1, 25) ;
               AV36OpeNom = ((GXutil.strcmp(AV36OpeNom, "????")==0)&&(A3836BarFasPri>0)&&(A153BarFasEst==0)&&!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? httpContext.getMessage( "PLANIFICACION", "") : AV36OpeNom) ;
               AV43FasDsc = GXutil.substring( A460FasDsc, 1, 25) ;
               h6Q50( false, 18) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43FasDsc, "")), 98, Gx_line+0, 307, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), 319, Gx_line+1, 370, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A227BarUni, "ZZZZZ9.99")), 730, Gx_line+0, 806, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Situacion, "")), 818, Gx_line+0, 827, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(308, Gx_line+0, 308, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(17, Gx_line+0, 17, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(396, Gx_line+0, 396, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(809, Gx_line+0, 809, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(833, Gx_line+0, 833, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(725, Gx_line+0, 725, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1058, Gx_line+0, 1058, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36OpeNom, "")), 840, Gx_line+0, 1049, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 23, Gx_line+0, 91, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"), 406, Gx_line+1, 549, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4443BarFasDTF, "99/99/99 99:99:99"), 575, Gx_line+0, 718, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(559, Gx_line+0, 559, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            h6Q50( false, 3) ;
            getPrinter().GxDrawLine(17, Gx_line+0, 1014, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+3) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6Q50( true, 0) ;
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

   public void h6Q50( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lit2, "")), 18, Gx_line+59, 150, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A140BarCosAny, "ZZZZZZ9.99")), 908, Gx_line+239, 992, Gx_line+257, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit10, "")), 27, Gx_line+18, 130, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 150, Gx_line+18, 218, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 245, Gx_line+18, 254, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 224, Gx_line+18, 233, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 154, Gx_line+59, 205, Gx_line+77, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 213, Gx_line+59, 464, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit8, "")), 549, Gx_line+59, 659, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 691, Gx_line+59, 759, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 691, Gx_line+90, 759, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit9, "")), 549, Gx_line+90, 659, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 156, Gx_line+90, 290, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit3, "")), 18, Gx_line+90, 150, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 298, Gx_line+90, 516, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lit4, "")), 18, Gx_line+120, 150, Gx_line+138, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 154, Gx_line+120, 263, Gx_line+138, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit6, "")), 271, Gx_line+120, 374, Gx_line+138, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 388, Gx_line+120, 439, Gx_line+138, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit33, "")), 18, Gx_line+151, 92, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 154, Gx_line+151, 263, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit34, "")), 271, Gx_line+151, 360, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), 388, Gx_line+151, 439, Gx_line+169, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit5, "")), 26, Gx_line+190, 124, Gx_line+207, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38Barkgm, "ZZZZZ9.99")), 152, Gx_line+190, 228, Gx_line+208, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit7, "")), 26, Gx_line+211, 124, Gx_line+228, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39BarMtr, "ZZZZZZ.ZZ")), 152, Gx_line+211, 228, Gx_line+229, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit11, "")), 26, Gx_line+233, 124, Gx_line+250, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40BarPiepie), "ZZZZZ9")), 152, Gx_line+233, 203, Gx_line+251, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit20, "")), 807, Gx_line+217, 881, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit21, "")), 807, Gx_line+239, 881, Gx_line+257, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(17, Gx_line+267, 1060, Gx_line+301, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit12, "")), 23, Gx_line+276, 112, Gx_line+294, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit13, "")), 313, Gx_line+275, 392, Gx_line+291, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit18, "")), 730, Gx_line+276, 805, Gx_line+293, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit19, "")), 814, Gx_line+276, 830, Gx_line+294, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit35, "")), 923, Gx_line+276, 997, Gx_line+294, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(308, Gx_line+267, 308, Gx_line+306, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(396, Gx_line+267, 396, Gx_line+306, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(559, Gx_line+267, 559, Gx_line+306, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(725, Gx_line+267, 725, Gx_line+306, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(809, Gx_line+267, 809, Gx_line+306, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(833, Gx_line+267, 833, Gx_line+306, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A141BarCosPro, "ZZZZZZ9.99")), 908, Gx_line+217, 992, Gx_line+235, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(17, Gx_line+298, 17, Gx_line+305, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1058, Gx_line+298, 1058, Gx_line+305, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(17, Gx_line+181, 249, Gx_line+263, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(791, Gx_line+208, 1013, Gx_line+263, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+5, 289, Gx_line+47, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 457, Gx_line+275, 497, Gx_line+293, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 634, Gx_line+275, 657, Gx_line+293, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+305) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
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
      A130BarCodPar = "" ;
      AV8Lit2 = "" ;
      AV10Lit3 = "" ;
      AV12Lit4 = "" ;
      AV15Lit5 = "" ;
      AV13Lit6 = "" ;
      AV16Lit7 = "" ;
      AV9Lit8 = "" ;
      AV11Lit9 = "" ;
      AV14Lit10 = "" ;
      AV17Lit11 = "" ;
      AV23Lit12 = "" ;
      AV37Lit13 = "" ;
      AV24Lit14 = "" ;
      AV25Lit15 = "" ;
      AV26Lit18 = "" ;
      AV27Lit19 = "" ;
      AV18Lit20 = "" ;
      AV19Lit21 = "" ;
      AV20Lit22 = "" ;
      AV21Lit33 = "" ;
      AV22Lit34 = "" ;
      AV28Lit35 = "" ;
      scmdbuf = "" ;
      P06Q52_A361DisCod = new int[1] ;
      P06Q52_A396EmprCod = new String[] {""} ;
      P06Q52_A129BarCod = new int[1] ;
      P06Q52_A132BarCodReo = new byte[1] ;
      P06Q52_A130BarCodPar = new String[] {""} ;
      P06Q52_A966PartCod = new String[] {""} ;
      P06Q52_n966PartCod = new boolean[] {false} ;
      P06Q52_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06Q52_A1235BarNumCli = new int[1] ;
      P06Q52_A1234BarNomCli = new String[] {""} ;
      P06Q52_A136BarColNum = new int[1] ;
      P06Q52_A135BarColNom = new String[] {""} ;
      P06Q52_A1652BarSerDsc = new String[] {""} ;
      P06Q52_A212BarSer = new String[] {""} ;
      P06Q52_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P06Q52_A143BarDisNum = new String[] {""} ;
      P06Q52_A279CliNom = new String[] {""} ;
      P06Q52_A252CliCod = new int[1] ;
      P06Q52_n252CliCod = new boolean[] {false} ;
      P06Q52_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A966PartCod = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A143BarDisNum = "" ;
      A279CliNom = "" ;
      A140BarCosAny = DecimalUtil.ZERO ;
      GXv_int5 = new int[1] ;
      AV38Barkgm = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV39BarMtr = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXt_char1 = "" ;
      P06Q53_A396EmprCod = new String[] {""} ;
      P06Q53_A129BarCod = new int[1] ;
      P06Q53_A132BarCodReo = new byte[1] ;
      P06Q53_A130BarCodPar = new String[] {""} ;
      P06Q53_A165BarHorIni = new short[1] ;
      P06Q53_A164BarHorFin = new short[1] ;
      P06Q53_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P06Q53_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P06Q53_n4443BarFasDTF = new boolean[] {false} ;
      P06Q53_A153BarFasEst = new byte[1] ;
      P06Q53_A3836BarFasPri = new byte[1] ;
      P06Q53_A460FasDsc = new String[] {""} ;
      P06Q53_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P06Q53_n4442BarFasDTI = new boolean[] {false} ;
      P06Q53_A457FasCod = new String[] {""} ;
      P06Q53_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06Q53_A603MaqCodBis = new String[] {""} ;
      P06Q53_A194BarOrdLin = new short[1] ;
      P06Q53_A758ProCod = new String[] {""} ;
      A160BarFecRea = GXutil.nullDate() ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A460FasDsc = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A457FasCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      AV29HorIni = "" ;
      AV30HorFin = "" ;
      AV31Hini = "" ;
      AV32Mini = "" ;
      AV33Hfin = "" ;
      AV34Mfin = "" ;
      AV41Fecha_p = "" ;
      AV35Situacion = "" ;
      GXv_char6 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new short[1] ;
      AV36OpeNom = "" ;
      GXv_char11 = new String[1] ;
      AV43FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rconprc1__default(),
         new Object[] {
             new Object[] {
            P06Q52_A361DisCod, P06Q52_A396EmprCod, P06Q52_A129BarCod, P06Q52_A132BarCodReo, P06Q52_A130BarCodPar, P06Q52_A966PartCod, P06Q52_n966PartCod, P06Q52_A141BarCosPro, P06Q52_A1235BarNumCli, P06Q52_A1234BarNomCli,
            P06Q52_A136BarColNum, P06Q52_A135BarColNom, P06Q52_A1652BarSerDsc, P06Q52_A212BarSer, P06Q52_A155BarFecCli, P06Q52_A143BarDisNum, P06Q52_A279CliNom, P06Q52_A252CliCod, P06Q52_n252CliCod, P06Q52_A140BarCosAny
            }
            , new Object[] {
            P06Q53_A396EmprCod, P06Q53_A129BarCod, P06Q53_A132BarCodReo, P06Q53_A130BarCodPar, P06Q53_A165BarHorIni, P06Q53_A164BarHorFin, P06Q53_A160BarFecRea, P06Q53_A4443BarFasDTF, P06Q53_n4443BarFasDTF, P06Q53_A153BarFasEst,
            P06Q53_A3836BarFasPri, P06Q53_A460FasDsc, P06Q53_A4442BarFasDTI, P06Q53_n4442BarFasDTI, P06Q53_A457FasCod, P06Q53_A227BarUni, P06Q53_A603MaqCodBis, P06Q53_A194BarOrdLin, P06Q53_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV42Plannc ;
   private byte GXt_int3 ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte GXv_int4[] ;
   private short gxcookieaux ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A194BarOrdLin ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A1235BarNumCli ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int GXv_int5[] ;
   private int AV40BarPiepie ;
   private int GXv_int9[] ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV38Barkgm ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV39BarMtr ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A227BarUni ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Lit2 ;
   private String AV10Lit3 ;
   private String AV12Lit4 ;
   private String AV15Lit5 ;
   private String AV13Lit6 ;
   private String AV16Lit7 ;
   private String AV9Lit8 ;
   private String AV11Lit9 ;
   private String AV14Lit10 ;
   private String AV17Lit11 ;
   private String AV23Lit12 ;
   private String AV37Lit13 ;
   private String AV24Lit14 ;
   private String AV25Lit15 ;
   private String AV26Lit18 ;
   private String AV27Lit19 ;
   private String AV18Lit20 ;
   private String AV19Lit21 ;
   private String AV20Lit22 ;
   private String AV21Lit33 ;
   private String AV22Lit34 ;
   private String AV28Lit35 ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A143BarDisNum ;
   private String A279CliNom ;
   private String GXt_char1 ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String AV29HorIni ;
   private String AV30HorFin ;
   private String AV31Hini ;
   private String AV32Mini ;
   private String AV33Hfin ;
   private String AV34Mfin ;
   private String AV41Fecha_p ;
   private String AV35Situacion ;
   private String GXv_char6[] ;
   private String GXv_char2[] ;
   private String AV36OpeNom ;
   private String GXv_char11[] ;
   private String AV43FasDsc ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A160BarFecRea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private IDataStoreProvider pr_default ;
   private int[] P06Q52_A361DisCod ;
   private String[] P06Q52_A396EmprCod ;
   private int[] P06Q52_A129BarCod ;
   private byte[] P06Q52_A132BarCodReo ;
   private String[] P06Q52_A130BarCodPar ;
   private String[] P06Q52_A966PartCod ;
   private boolean[] P06Q52_n966PartCod ;
   private java.math.BigDecimal[] P06Q52_A141BarCosPro ;
   private int[] P06Q52_A1235BarNumCli ;
   private String[] P06Q52_A1234BarNomCli ;
   private int[] P06Q52_A136BarColNum ;
   private String[] P06Q52_A135BarColNom ;
   private String[] P06Q52_A1652BarSerDsc ;
   private String[] P06Q52_A212BarSer ;
   private java.util.Date[] P06Q52_A155BarFecCli ;
   private String[] P06Q52_A143BarDisNum ;
   private String[] P06Q52_A279CliNom ;
   private int[] P06Q52_A252CliCod ;
   private boolean[] P06Q52_n252CliCod ;
   private java.math.BigDecimal[] P06Q52_A140BarCosAny ;
   private String[] P06Q53_A396EmprCod ;
   private int[] P06Q53_A129BarCod ;
   private byte[] P06Q53_A132BarCodReo ;
   private String[] P06Q53_A130BarCodPar ;
   private short[] P06Q53_A165BarHorIni ;
   private short[] P06Q53_A164BarHorFin ;
   private java.util.Date[] P06Q53_A160BarFecRea ;
   private java.util.Date[] P06Q53_A4443BarFasDTF ;
   private boolean[] P06Q53_n4443BarFasDTF ;
   private byte[] P06Q53_A153BarFasEst ;
   private byte[] P06Q53_A3836BarFasPri ;
   private String[] P06Q53_A460FasDsc ;
   private java.util.Date[] P06Q53_A4442BarFasDTI ;
   private boolean[] P06Q53_n4442BarFasDTI ;
   private String[] P06Q53_A457FasCod ;
   private java.math.BigDecimal[] P06Q53_A227BarUni ;
   private String[] P06Q53_A603MaqCodBis ;
   private short[] P06Q53_A194BarOrdLin ;
   private String[] P06Q53_A758ProCod ;
}

final  class rconprc1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06Q52", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.PartCod, T1.BarCosPro, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarFecCli, T1.BarDisNum, T3.CliNom, T1.CliCod, T1.BarCosAny FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06Q53", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarHorIni, T1.BarHorFin, T1.BarFecRea, T1.BarFasDTF, T1.BarFasEst, T1.BarFasPri, T2.FasDsc, T1.BarFasDTI, T1.FasCod, T1.BarUni, T1.MaqCodBis, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 28);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 8);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

