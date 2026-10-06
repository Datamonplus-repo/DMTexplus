package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rpr0021_impl extends GXWebReport
{
   public rpr0021_impl( com.genexus.internet.HttpContext context )
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         GXv_int1[0] = AV64F_timer2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int1) ;
         rpr0021_impl.this.AV64F_timer2 = GXv_int1[0] ;
         GXt_char2 = AV28Lit0 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2349_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV28Lit0 = GXt_char2 ;
         GXt_char2 = AV29Lit1 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV29Lit1 = GXt_char2 ;
         GXt_char2 = AV30Lit2 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV30Lit2 = GXt_char2 ;
         GXt_char2 = AV31Lit3 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV31Lit3 = GXt_char2 ;
         GXt_char2 = AV32Lit4 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV32Lit4 = GXt_char2 ;
         GXt_char2 = AV33Lit5 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV33Lit5 = GXt_char2 ;
         GXt_char2 = AV34Lit6 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV34Lit6 = GXt_char2 ;
         GXt_char2 = AV35Lit7 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV35Lit7 = GXt_char2 ;
         GXt_char2 = AV36Lit8 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1294_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV36Lit8 = GXt_char2 ;
         GXt_char2 = AV37Lit9 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN465_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV37Lit9 = GXt_char2 ;
         GXt_char2 = AV38Lit10 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV38Lit10 = GXt_char2 ;
         GXt_char2 = AV39Lit11 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV39Lit11 = GXt_char2 ;
         GXt_char2 = AV40Lit12 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV40Lit12 = GXt_char2 ;
         GXt_char2 = AV41Lit13 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV41Lit13 = GXt_char2 ;
         GXt_char2 = AV42Lit14 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN467_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV42Lit14 = GXt_char2 ;
         GXt_char2 = AV43Lit15 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2203_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV43Lit15 = GXt_char2 ;
         GXt_char2 = AV44Lit16 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN469_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV44Lit16 = GXt_char2 ;
         GXt_char2 = AV45Lit17 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN471_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV45Lit17 = GXt_char2 ;
         GXt_char2 = AV46Lit18 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV46Lit18 = GXt_char2 ;
         GXt_char2 = AV47Lit19 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV47Lit19 = GXt_char2 ;
         GXt_char2 = AV48Lit20 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2506_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV48Lit20 = GXt_char2 ;
         GXt_char2 = AV49Lit21 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2505_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV49Lit21 = GXt_char2 ;
         GXt_char2 = AV50Lit22 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2504_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV50Lit22 = GXt_char2 ;
         GXt_char2 = AV51Lit23 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV51Lit23 = GXt_char2 ;
         GXt_char2 = AV52Lit24 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV52Lit24 = GXt_char2 ;
         GXt_char2 = AV53Lit25 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2491_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV53Lit25 = GXt_char2 ;
         GXt_char2 = AV54Lit26 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2497_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV54Lit26 = GXt_char2 ;
         GXt_char2 = AV59Lit27 ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1372_", ""), (byte)(99), GXv_char3) ;
         rpr0021_impl.this.GXt_char2 = GXv_char3[0] ;
         AV59Lit27 = GXt_char2 ;
         AV59Lit27 = GXutil.substring( AV59Lit27, 1, 6) ;
         /* Using cursor P06OU2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06OU2_A407EmprNom[0] ;
            n407EmprNom = P06OU2_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV55TotKgs = DecimalUtil.doubleToDec(0) ;
         AV56TotMts = DecimalUtil.doubleToDec(0) ;
         AV21TotRea = 0 ;
         AV20TotPar = 0 ;
         /* Using cursor P06OU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A568HisProUni = P06OU3_A568HisProUni[0] ;
            A1525HisProKgr = P06OU3_A1525HisProKgr[0] ;
            A1526HisProMtr = P06OU3_A1526HisProMtr[0] ;
            A461Fase = P06OU3_A461Fase[0] ;
            A130BarCodPar = P06OU3_A130BarCodPar[0] ;
            A132BarCodReo = P06OU3_A132BarCodReo[0] ;
            A129BarCod = P06OU3_A129BarCod[0] ;
            A3610HisProLot = P06OU3_A3610HisProLot[0] ;
            A656ParCod = P06OU3_A656ParCod[0] ;
            n656ParCod = P06OU3_n656ParCod[0] ;
            A556HisProEst = P06OU3_A556HisProEst[0] ;
            A867ParCodNom = P06OU3_A867ParCodNom[0] ;
            n867ParCodNom = P06OU3_n867ParCodNom[0] ;
            A566HisProTur = P06OU3_A566HisProTur[0] ;
            A136BarColNum = P06OU3_A136BarColNum[0] ;
            A135BarColNom = P06OU3_A135BarColNom[0] ;
            A279CliNom = P06OU3_A279CliNom[0] ;
            A252CliCod = P06OU3_A252CliCod[0] ;
            n252CliCod = P06OU3_n252CliCod[0] ;
            A194BarOrdLin = P06OU3_A194BarOrdLin[0] ;
            A503GruOpeCod = P06OU3_A503GruOpeCod[0] ;
            A561HisProLin = P06OU3_A561HisProLin[0] ;
            A4440HisProDTI = P06OU3_A4440HisProDTI[0] ;
            n4440HisProDTI = P06OU3_n4440HisProDTI[0] ;
            A4441HisProDTF = P06OU3_A4441HisProDTF[0] ;
            n4441HisProDTF = P06OU3_n4441HisProDTF[0] ;
            A563HisProMin = P06OU3_A563HisProMin[0] ;
            A560HisProHin = P06OU3_A560HisProHin[0] ;
            A562HisProMfi = P06OU3_A562HisProMfi[0] ;
            A559HisProHfi = P06OU3_A559HisProHfi[0] ;
            A136BarColNum = P06OU3_A136BarColNum[0] ;
            A135BarColNom = P06OU3_A135BarColNom[0] ;
            A252CliCod = P06OU3_A252CliCod[0] ;
            n252CliCod = P06OU3_n252CliCod[0] ;
            A279CliNom = P06OU3_A279CliNom[0] ;
            A867ParCodNom = P06OU3_A867ParCodNom[0] ;
            n867ParCodNom = P06OU3_n867ParCodNom[0] ;
            if ( A560HisProHin <= A559HisProHfi )
            {
               A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            }
            else
            {
               A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            }
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            AV19TotUni = AV19TotUni.add(A568HisProUni) ;
            AV55TotKgs = AV55TotKgs.add(A1525HisProKgr) ;
            AV56TotMts = AV56TotMts.add(A1526HisProMtr) ;
            GXv_char3[0] = A396EmprCod ;
            GXv_char4[0] = A461Fase ;
            GXv_char5[0] = AV60FasActTin ;
            new app.pfasest(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
            rpr0021_impl.this.A396EmprCod = GXv_char3[0] ;
            rpr0021_impl.this.A461Fase = GXv_char4[0] ;
            rpr0021_impl.this.AV60FasActTin = GXv_char5[0] ;
            AV62HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            if ( GXutil.strcmp(AV60FasActTin, httpContext.getMessage( "N", "")) == 0 )
            {
               AV61FlagMarca = (byte)(1) ;
            }
            AV61FlagMarca = (byte)(0) ;
            if ( GXutil.strcmp(A3610HisProLot, AV62HisProLot) == 0 )
            {
               AV61FlagMarca = (byte)(1) ;
            }
            AV58HisProTre = (short)(0) ;
            if ( (0==A656ParCod) )
            {
               if ( ! (0==A556HisProEst) )
               {
                  if ( AV61FlagMarca == 0 )
                  {
                     if ( AV64F_timer2 == 0 )
                     {
                        AV21TotRea = (int)(AV21TotRea+A564HisProTre) ;
                     }
                     else
                     {
                        AV21TotRea = (int)(AV21TotRea+A5605HisProTr2) ;
                     }
                  }
                  if ( AV64F_timer2 == 0 )
                  {
                     AV58HisProTre = A564HisProTre ;
                  }
                  else
                  {
                     AV58HisProTre = A5605HisProTr2 ;
                  }
               }
            }
            else
            {
               if ( ! (0==A556HisProEst) )
               {
                  if ( AV61FlagMarca == 0 )
                  {
                     if ( AV64F_timer2 == 0 )
                     {
                        AV20TotPar = (int)(AV20TotPar+A564HisProTre) ;
                     }
                     else
                     {
                        AV20TotPar = (int)(AV20TotPar+A5605HisProTr2) ;
                     }
                  }
                  if ( AV64F_timer2 == 0 )
                  {
                     AV58HisProTre = A564HisProTre ;
                  }
                  else
                  {
                     AV58HisProTre = A5605HisProTr2 ;
                  }
               }
            }
            AV57ParDsc = GXutil.substring( A867ParCodNom, 1, 15) ;
            if ( (0==A656ParCod) )
            {
               h6OU0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 871, Gx_line+0, 879, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 917, Gx_line+0, 925, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 7, Gx_line+0, 66, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 68, Gx_line+0, 76, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 77, Gx_line+0, 85, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")), 97, Gx_line+0, 142, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), 154, Gx_line+0, 184, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A461Fase, "")), 196, Gx_line+0, 255, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 263, Gx_line+0, 308, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 314, Gx_line+0, 534, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 540, Gx_line+0, 636, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 636, Gx_line+0, 681, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")), 693, Gx_line+0, 760, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")), 761, Gx_line+0, 828, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9")), 839, Gx_line+0, 847, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9")), 856, Gx_line+0, 872, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99")), 878, Gx_line+0, 894, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9")), 901, Gx_line+0, 917, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99")), 924, Gx_line+0, 940, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9")), 997, Gx_line+0, 1027, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57ParDsc, "")), 1033, Gx_line+0, 1143, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58HisProTre), "ZZZ9")), 953, Gx_line+0, 983, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               h6OU0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9")), 997, Gx_line+0, 1027, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 871, Gx_line+0, 879, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 917, Gx_line+0, 925, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 7, Gx_line+0, 66, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 68, Gx_line+0, 76, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 77, Gx_line+0, 85, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")), 97, Gx_line+0, 142, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), 154, Gx_line+0, 184, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A461Fase, "")), 196, Gx_line+0, 255, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 263, Gx_line+0, 308, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 314, Gx_line+0, 534, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 540, Gx_line+0, 636, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 636, Gx_line+0, 681, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9")), 839, Gx_line+0, 847, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9")), 856, Gx_line+0, 872, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99")), 878, Gx_line+0, 894, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9")), 901, Gx_line+0, 917, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99")), 924, Gx_line+0, 940, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58HisProTre), "ZZZ9")), 953, Gx_line+0, 983, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57ParDsc, "")), 1033, Gx_line+0, 1143, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV65LotLector = A3610HisProLot ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV22HorRea = (byte)(AV21TotRea/ (double) (60)) ;
         AV23HorReaint = (byte)(GXutil.Int( AV22HorRea)) ;
         AV24MinRea = (byte)(AV21TotRea-(AV23HorReaint*60)) ;
         AV25HorPar = (byte)(AV20TotPar/ (double) (60)) ;
         AV26HorParint = (byte)(GXutil.Int( AV25HorPar)) ;
         AV27MinPar = (byte)(AV20TotPar-(AV26HorParint*60)) ;
         h6OU0( false, 80) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit25, "")), 485, Gx_line+10, 599, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55TotKgs, "ZZZZZ9.99")), 675, Gx_line+9, 742, Gx_line+27, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit26, "")), 485, Gx_line+27, 599, Gx_line+44, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56TotMts, "ZZZZZ9.99")), 675, Gx_line+26, 742, Gx_line+44, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(":", 711, Gx_line+43, 719, Gx_line+60, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("(", 748, Gx_line+43, 756, Gx_line+60, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(")", 799, Gx_line+43, 807, Gx_line+60, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit21, "")), 485, Gx_line+44, 592, Gx_line+61, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22HorRea), "Z9")), 690, Gx_line+43, 706, Gx_line+61, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24MinRea), "Z9")), 719, Gx_line+43, 735, Gx_line+61, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TotRea), "ZZZZZ9")), 755, Gx_line+43, 800, Gx_line+61, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(":", 711, Gx_line+59, 719, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText("(", 748, Gx_line+59, 756, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(")", 799, Gx_line+59, 807, Gx_line+76, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit22, "")), 485, Gx_line+60, 592, Gx_line+77, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25HorPar), "Z9")), 690, Gx_line+59, 706, Gx_line+77, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27MinPar), "Z9")), 719, Gx_line+59, 735, Gx_line+77, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TotPar), "ZZZZZ9")), 755, Gx_line+59, 800, Gx_line+77, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(605, Gx_line+25, 670, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(605, Gx_line+58, 670, Gx_line+58, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(605, Gx_line+42, 670, Gx_line+42, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(605, Gx_line+75, 670, Gx_line+75, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(7, Gx_line+4, 1131, Gx_line+4, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+80) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6OU0( true, 0) ;
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

   public void h6OU0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit4, "")), 7, Gx_line+73, 65, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 80, Gx_line+73, 125, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit5, "")), 150, Gx_line+73, 186, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A558HisProFec, "99/99/99"), 202, Gx_line+73, 261, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit18, "")), 860, Gx_line+90, 889, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit19, "")), 906, Gx_line+90, 935, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit6, "")), 7, Gx_line+106, 88, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit7, "")), 93, Gx_line+106, 145, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit8, "")), 150, Gx_line+106, 186, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit9, "")), 196, Gx_line+106, 235, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit10, "")), 263, Gx_line+106, 314, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit11, "")), 540, Gx_line+106, 576, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit12, "")), 636, Gx_line+106, 682, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit23, "")), 715, Gx_line+106, 759, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit24, "")), 783, Gx_line+106, 827, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit14, "")), 839, Gx_line+106, 846, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit15, "")), 853, Gx_line+106, 897, Gx_line+122, 1, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit16, "")), 909, Gx_line+106, 931, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit17, "")), 997, Gx_line+106, 1026, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit27, "")), 946, Gx_line+106, 990, Gx_line+122, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+125, 1131, Gx_line+125, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 8, Gx_line+11, 410, Gx_line+31, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit0, "")), 8, Gx_line+36, 430, Gx_line+53, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 799, Gx_line+14, 850, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 976, Gx_line+38, 1021, Gx_line+55, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit1, "")), 748, Gx_line+14, 792, Gx_line+30, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit2, "")), 889, Gx_line+14, 942, Gx_line+30, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit3, "")), 889, Gx_line+38, 942, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Pgmname, "")), 748, Gx_line+36, 806, Gx_line+52, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 794, Gx_line+14, 798, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 945, Gx_line+35, 949, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 945, Gx_line+14, 949, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 952, Gx_line+14, 1045, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+4, 1129, Gx_line+4, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+58, 1129, Gx_line+58, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 70, Gx_line+73, 74, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 190, Gx_line+73, 194, Gx_line+89, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+128) ;
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
      add_metrics6( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Arial", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      GXv_int1 = new byte[1] ;
      AV28Lit0 = "" ;
      AV29Lit1 = "" ;
      AV30Lit2 = "" ;
      AV31Lit3 = "" ;
      AV32Lit4 = "" ;
      AV33Lit5 = "" ;
      AV34Lit6 = "" ;
      AV35Lit7 = "" ;
      AV36Lit8 = "" ;
      AV37Lit9 = "" ;
      AV38Lit10 = "" ;
      AV39Lit11 = "" ;
      AV40Lit12 = "" ;
      AV41Lit13 = "" ;
      AV42Lit14 = "" ;
      AV43Lit15 = "" ;
      AV44Lit16 = "" ;
      AV45Lit17 = "" ;
      AV46Lit18 = "" ;
      AV47Lit19 = "" ;
      AV48Lit20 = "" ;
      AV49Lit21 = "" ;
      AV50Lit22 = "" ;
      AV51Lit23 = "" ;
      AV52Lit24 = "" ;
      AV53Lit25 = "" ;
      AV54Lit26 = "" ;
      AV59Lit27 = "" ;
      GXt_char2 = "" ;
      scmdbuf = "" ;
      P06OU2_A396EmprCod = new String[] {""} ;
      P06OU2_A407EmprNom = new String[] {""} ;
      P06OU2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      AV55TotKgs = DecimalUtil.ZERO ;
      AV56TotMts = DecimalUtil.ZERO ;
      P06OU3_A396EmprCod = new String[] {""} ;
      P06OU3_A602MaqCod = new String[] {""} ;
      P06OU3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06OU3_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OU3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OU3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06OU3_A461Fase = new String[] {""} ;
      P06OU3_A130BarCodPar = new String[] {""} ;
      P06OU3_A132BarCodReo = new byte[1] ;
      P06OU3_A129BarCod = new int[1] ;
      P06OU3_A3610HisProLot = new String[] {""} ;
      P06OU3_A656ParCod = new short[1] ;
      P06OU3_n656ParCod = new boolean[] {false} ;
      P06OU3_A556HisProEst = new byte[1] ;
      P06OU3_A867ParCodNom = new String[] {""} ;
      P06OU3_n867ParCodNom = new boolean[] {false} ;
      P06OU3_A566HisProTur = new byte[1] ;
      P06OU3_A136BarColNum = new int[1] ;
      P06OU3_A135BarColNom = new String[] {""} ;
      P06OU3_A279CliNom = new String[] {""} ;
      P06OU3_A252CliCod = new int[1] ;
      P06OU3_n252CliCod = new boolean[] {false} ;
      P06OU3_A194BarOrdLin = new short[1] ;
      P06OU3_A503GruOpeCod = new int[1] ;
      P06OU3_A561HisProLin = new int[1] ;
      P06OU3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P06OU3_n4440HisProDTI = new boolean[] {false} ;
      P06OU3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P06OU3_n4441HisProDTF = new boolean[] {false} ;
      P06OU3_A563HisProMin = new byte[1] ;
      P06OU3_A560HisProHin = new byte[1] ;
      P06OU3_A562HisProMfi = new byte[1] ;
      P06OU3_A559HisProHfi = new byte[1] ;
      A568HisProUni = DecimalUtil.ZERO ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A461Fase = "" ;
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      A867ParCodNom = "" ;
      A135BarColNom = "" ;
      A279CliNom = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV19TotUni = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV60FasActTin = "" ;
      GXv_char5 = new String[1] ;
      AV62HisProLot = "" ;
      AV57ParDsc = "" ;
      AV65LotLector = "" ;
      Gx_date = GXutil.nullDate() ;
      AV71Pgmname = "" ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rpr0021__default(),
         new Object[] {
             new Object[] {
            P06OU2_A396EmprCod, P06OU2_A407EmprNom, P06OU2_n407EmprNom
            }
            , new Object[] {
            P06OU3_A396EmprCod, P06OU3_A602MaqCod, P06OU3_A558HisProFec, P06OU3_A568HisProUni, P06OU3_A1525HisProKgr, P06OU3_A1526HisProMtr, P06OU3_A461Fase, P06OU3_A130BarCodPar, P06OU3_A132BarCodReo, P06OU3_A129BarCod,
            P06OU3_A3610HisProLot, P06OU3_A656ParCod, P06OU3_n656ParCod, P06OU3_A556HisProEst, P06OU3_A867ParCodNom, P06OU3_n867ParCodNom, P06OU3_A566HisProTur, P06OU3_A136BarColNum, P06OU3_A135BarColNom, P06OU3_A279CliNom,
            P06OU3_A252CliCod, P06OU3_n252CliCod, P06OU3_A194BarOrdLin, P06OU3_A503GruOpeCod, P06OU3_A561HisProLin, P06OU3_A4440HisProDTI, P06OU3_n4440HisProDTI, P06OU3_A4441HisProDTF, P06OU3_n4441HisProDTF, P06OU3_A563HisProMin,
            P06OU3_A560HisProHin, P06OU3_A562HisProMfi, P06OU3_A559HisProHfi
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      AV71Pgmname = "RPR0021" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      AV71Pgmname = "RPR0021" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV64F_timer2 ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A556HisProEst ;
   private byte A566HisProTur ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV61FlagMarca ;
   private byte AV22HorRea ;
   private byte AV23HorReaint ;
   private byte AV24MinRea ;
   private byte AV25HorPar ;
   private byte AV26HorParint ;
   private byte AV27MinPar ;
   private short gxcookieaux ;
   private short A656ParCod ;
   private short A194BarOrdLin ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short AV58HisProTre ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV21TotRea ;
   private int AV20TotPar ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV55TotKgs ;
   private java.math.BigDecimal AV56TotMts ;
   private java.math.BigDecimal A568HisProUni ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV19TotUni ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV28Lit0 ;
   private String AV29Lit1 ;
   private String AV30Lit2 ;
   private String AV31Lit3 ;
   private String AV32Lit4 ;
   private String AV33Lit5 ;
   private String AV34Lit6 ;
   private String AV35Lit7 ;
   private String AV36Lit8 ;
   private String AV37Lit9 ;
   private String AV38Lit10 ;
   private String AV39Lit11 ;
   private String AV40Lit12 ;
   private String AV41Lit13 ;
   private String AV42Lit14 ;
   private String AV43Lit15 ;
   private String AV44Lit16 ;
   private String AV45Lit17 ;
   private String AV46Lit18 ;
   private String AV47Lit19 ;
   private String AV48Lit20 ;
   private String AV49Lit21 ;
   private String AV50Lit22 ;
   private String AV51Lit23 ;
   private String AV52Lit24 ;
   private String AV53Lit25 ;
   private String AV54Lit26 ;
   private String AV59Lit27 ;
   private String GXt_char2 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A461Fase ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A867ParCodNom ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV60FasActTin ;
   private String GXv_char5[] ;
   private String AV62HisProLot ;
   private String AV57ParDsc ;
   private String AV65LotLector ;
   private String AV71Pgmname ;
   private String Gx_time ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n252CliCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private IDataStoreProvider pr_default ;
   private String[] P06OU2_A396EmprCod ;
   private String[] P06OU2_A407EmprNom ;
   private boolean[] P06OU2_n407EmprNom ;
   private String[] P06OU3_A396EmprCod ;
   private String[] P06OU3_A602MaqCod ;
   private java.util.Date[] P06OU3_A558HisProFec ;
   private java.math.BigDecimal[] P06OU3_A568HisProUni ;
   private java.math.BigDecimal[] P06OU3_A1525HisProKgr ;
   private java.math.BigDecimal[] P06OU3_A1526HisProMtr ;
   private String[] P06OU3_A461Fase ;
   private String[] P06OU3_A130BarCodPar ;
   private byte[] P06OU3_A132BarCodReo ;
   private int[] P06OU3_A129BarCod ;
   private String[] P06OU3_A3610HisProLot ;
   private short[] P06OU3_A656ParCod ;
   private boolean[] P06OU3_n656ParCod ;
   private byte[] P06OU3_A556HisProEst ;
   private String[] P06OU3_A867ParCodNom ;
   private boolean[] P06OU3_n867ParCodNom ;
   private byte[] P06OU3_A566HisProTur ;
   private int[] P06OU3_A136BarColNum ;
   private String[] P06OU3_A135BarColNom ;
   private String[] P06OU3_A279CliNom ;
   private int[] P06OU3_A252CliCod ;
   private boolean[] P06OU3_n252CliCod ;
   private short[] P06OU3_A194BarOrdLin ;
   private int[] P06OU3_A503GruOpeCod ;
   private int[] P06OU3_A561HisProLin ;
   private java.util.Date[] P06OU3_A4440HisProDTI ;
   private boolean[] P06OU3_n4440HisProDTI ;
   private java.util.Date[] P06OU3_A4441HisProDTF ;
   private boolean[] P06OU3_n4441HisProDTF ;
   private byte[] P06OU3_A563HisProMin ;
   private byte[] P06OU3_A560HisProHin ;
   private byte[] P06OU3_A562HisProMfi ;
   private byte[] P06OU3_A559HisProHfi ;
}

final  class rpr0021__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06OU2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06OU3", "SELECT T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProUni, T1.HisProKgr, T1.HisProMtr, T1.Fase, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLot, T1.ParCod, T1.HisProEst, T4.ParCodNom, T1.HisProTur, T2.BarColNum, T2.BarColNom, T3.CliNom, T2.CliCod, T1.BarOrdLin, T1.GruOpeCod, T1.HisProLin, T1.HisProDTI, T1.HisProDTF, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod) WHERE T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ? ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((String[]) buf[19])[0] = rslt.getString(18, 30);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((int[]) buf[23])[0] = rslt.getInt(21);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(24);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(25);
               ((byte[]) buf[30])[0] = rslt.getByte(26);
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((byte[]) buf[32])[0] = rslt.getByte(28);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

