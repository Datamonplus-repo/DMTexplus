package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfo0009_impl extends GXWebReport
{
   public rfo0009_impl( com.genexus.internet.HttpContext context )
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
            AV29ImpCod = httpContext.GetPar( "ImpCod") ;
            AV8PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV13UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV12PSerie = httpContext.GetPar( "PSerie") ;
            AV17USerie = httpContext.GetPar( "USerie") ;
            AV9PColor = (int)(GXutil.lval( httpContext.GetPar( "PColor"))) ;
            AV14UColor = (int)(GXutil.lval( httpContext.GetPar( "UColor"))) ;
            AV11PNumCol = httpContext.GetPar( "PNumCol") ;
            AV16UNumCol = httpContext.GetPar( "UNumCol") ;
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
      M_bot = 31 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*31)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV21Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN068_", ""), (byte)(99), GXv_char2) ;
         rfo0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit0 = GXt_char1 ;
         GXt_char1 = AV19Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfo0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit1 = GXt_char1 ;
         GXt_char1 = AV20Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfo0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit2 = GXt_char1 ;
         GXt_char1 = AV22Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfo0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit3 = GXt_char1 ;
         GXt_char1 = AV24Lit25 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN813_", ""), (byte)(99), GXv_char2) ;
         rfo0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit25 = GXt_char1 ;
         AV26Station = context.getWorkstationId( remoteHandle) ;
         GXv_char2[0] = AV27EmprCod ;
         GXv_char3[0] = AV28EmprNom ;
         GXv_char4[0] = AV25UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
         rfo0009_impl.this.AV27EmprCod = GXv_char2[0] ;
         rfo0009_impl.this.AV28EmprNom = GXv_char3[0] ;
         rfo0009_impl.this.AV25UsurCod = GXv_char4[0] ;
         GXv_char4[0] = AV23ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "FO0009", ""), GXv_char4) ;
         rfo0009_impl.this.AV23ContDsc = GXv_char4[0] ;
         /* Using cursor P06KE2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06KE2_A407EmprNom[0] ;
            n407EmprNom = P06KE2_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV30Flag1 = (byte)(0) ;
         AV37Flag2 = (byte)(0) ;
         GxHdr3 = true ;
         /* Using cursor P06KE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8PCliCod), AV12PSerie, AV11PNumCol, Integer.valueOf(AV9PColor), AV17USerie, Integer.valueOf(AV14UColor), AV16UNumCol, Integer.valueOf(AV13UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A831TipColCod = P06KE3_A831TipColCod[0] ;
            A483ForColNum = P06KE3_A483ForColNum[0] ;
            A482ForColNom = P06KE3_A482ForColNom[0] ;
            A494ForSer = P06KE3_A494ForSer[0] ;
            A252CliCod = P06KE3_A252CliCod[0] ;
            A486ForNumCol = P06KE3_A486ForNumCol[0] ;
            A2838ForRelBan = P06KE3_A2838ForRelBan[0] ;
            n2838ForRelBan = P06KE3_n2838ForRelBan[0] ;
            A132BarCodReo = P06KE3_A132BarCodReo[0] ;
            n132BarCodReo = P06KE3_n132BarCodReo[0] ;
            A130BarCodPar = P06KE3_A130BarCodPar[0] ;
            n130BarCodPar = P06KE3_n130BarCodPar[0] ;
            A129BarCod = P06KE3_A129BarCod[0] ;
            n129BarCod = P06KE3_n129BarCod[0] ;
            A832TipColDsc = P06KE3_A832TipColDsc[0] ;
            n832TipColDsc = P06KE3_n832TipColDsc[0] ;
            A1192ForNumCli = P06KE3_A1192ForNumCli[0] ;
            n1192ForNumCli = P06KE3_n1192ForNumCli[0] ;
            A1191ForNomCli = P06KE3_A1191ForNomCli[0] ;
            n1191ForNomCli = P06KE3_n1191ForNomCli[0] ;
            A279CliNom = P06KE3_A279CliNom[0] ;
            A279CliNom = P06KE3_A279CliNom[0] ;
            A832TipColDsc = P06KE3_A832TipColDsc[0] ;
            n832TipColDsc = P06KE3_n832TipColDsc[0] ;
            AV31Cont1 = (byte)(0) ;
            AV33ForNumCol = A486ForNumCol ;
            /* Using cursor P06KE4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A764ProForCod = P06KE4_A764ProForCod[0] ;
               A1160ProForL = P06KE4_A1160ProForL[0] ;
               A766ProForDsc = P06KE4_A766ProForDsc[0] ;
               A766ProForDsc = P06KE4_A766ProForDsc[0] ;
               if ( ( AV31Cont1 >= 11 ) && ( AV30Flag1 == 0 ) )
               {
                  AV30Flag1 = (byte)(1) ;
                  AV37Flag2 = (byte)(1) ;
                  AV31Cont1 = (byte)(1) ;
                  h6KE0( false, 36) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Processo", ""), 155, Gx_line+9, 202, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 218, Gx_line+8, 263, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 269, Gx_line+8, 489, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(121, Gx_line+2, 466, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "APROVADA", ""), 611, Gx_line+1, 682, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(569, Gx_line+20, 594, Gx_line+37, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "REPETIÇÃO", ""), 611, Gx_line+21, 685, Gx_line+35, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+36) ;
               }
               else
               {
                  h6KE0( false, 36) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Processo", ""), 153, Gx_line+10, 200, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 216, Gx_line+9, 261, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 267, Gx_line+9, 487, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(119, Gx_line+3, 464, Gx_line+32, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+36) ;
                  AV31Cont1 = (byte)(AV31Cont1+1) ;
               }
               /* Using cursor P06KE5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A764ProForCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A490ForPrdUMe = P06KE5_A490ForPrdUMe[0] ;
                  A1645ProForNro = P06KE5_A1645ProForNro[0] ;
                  A770ProForPrd = P06KE5_A770ProForPrd[0] ;
                  A765ProForDes = P06KE5_A765ProForDes[0] ;
                  A762ProForCan = P06KE5_A762ProForCan[0] ;
                  A763ProForCla = P06KE5_A763ProForCla[0] ;
                  A488ForPrdDsc = P06KE5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P06KE5_n488ForPrdDsc[0] ;
                  A767ProForLin = P06KE5_A767ProForLin[0] ;
                  A488ForPrdDsc = P06KE5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P06KE5_n488ForPrdDsc[0] ;
                  AV36NroInt = A1645ProForNro ;
                  if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
                  {
                     AV34ProForPrd = A770ProForPrd ;
                     /* Execute user subroutine: 'ESPECIAL' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(2);
                        pr_default.close(2);
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
                  else
                  {
                     if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                     {
                        AV34ProForPrd = A770ProForPrd ;
                        /* Execute user subroutine: 'COLORANTE' */
                        S121 ();
                        if ( returnInSub )
                        {
                           pr_default.close(3);
                           pr_default.close(3);
                           pr_default.close(2);
                           pr_default.close(2);
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
                     else
                     {
                        if ( (GXutil.strcmp("", A770ProForPrd)==0) && ! (GXutil.strcmp("", A765ProForDes)==0) )
                        {
                           if ( ( AV31Cont1 >= 11 ) && ( AV30Flag1 == 0 ) )
                           {
                              AV30Flag1 = (byte)(1) ;
                              AV31Cont1 = (byte)(1) ;
                              h6KE0( false, 20) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "APROVADA", ""), 611, Gx_line+1, 682, Gx_line+15, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+20) ;
                           }
                           else
                           {
                              if ( ( AV30Flag1 == 1 ) && ( AV37Flag2 == 0 ) )
                              {
                                 AV37Flag2 = (byte)(1) ;
                                 h6KE0( false, 17) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "REPETIÇÃO", ""), 608, Gx_line+1, 682, Gx_line+15, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                              else
                              {
                                 h6KE0( false, 17) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                           }
                           AV31Cont1 = (byte)(AV31Cont1+1) ;
                        }
                        else
                        {
                           if ( ! (GXutil.strcmp("", A770ProForPrd)==0) )
                           {
                              if ( ( AV31Cont1 >= 11 ) && ( AV30Flag1 == 0 ) )
                              {
                                 AV30Flag1 = (byte)(1) ;
                                 AV31Cont1 = (byte)(1) ;
                                 h6KE0( false, 21) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 35, Gx_line+1, 80, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A763ProForCla, "")), 441, Gx_line+1, 559, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")), 313, Gx_line+0, 402, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "APROVADA", ""), 611, Gx_line+1, 682, Gx_line+15, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+21) ;
                              }
                              else
                              {
                                 if ( ( AV30Flag1 == 1 ) && ( AV37Flag2 == 0 ) )
                                 {
                                    AV37Flag2 = (byte)(1) ;
                                    h6KE0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 35, Gx_line+1, 80, Gx_line+18, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")), 313, Gx_line+0, 402, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A763ProForCla, "")), 441, Gx_line+1, 559, Gx_line+18, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(httpContext.getMessage( "REPETIÇÃO", ""), 608, Gx_line+1, 682, Gx_line+15, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                                 else
                                 {
                                    h6KE0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 35, Gx_line+1, 80, Gx_line+18, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A763ProForCla, "")), 441, Gx_line+1, 559, Gx_line+18, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A762ProForCan, "ZZZZZ9.9999")), 313, Gx_line+0, 402, Gx_line+17, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                              }
                              AV31Cont1 = (byte)(AV31Cont1+1) ;
                           }
                        }
                     }
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         if ( AV31Cont1 <= 11 )
         {
            while ( AV31Cont1 <= 11 )
            {
               h6KE0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV31Cont1 = (byte)(AV31Cont1+1) ;
            }
            h6KE0( false, 35) ;
            getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "APROVADA", ""), 617, Gx_line+1, 688, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(569, Gx_line+19, 594, Gx_line+36, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REPETIÇÃO", ""), 617, Gx_line+21, 691, Gx_line+35, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+35) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6KE0( true, 0) ;
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
      /* 'ESPECIAL' Routine */
      returnInSub = false ;
      /* Using cursor P06KE6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV33ForNumCol), AV34ProForPrd});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A490ForPrdUMe = P06KE6_A490ForPrdUMe[0] ;
         A489ForPrdNor = P06KE6_A489ForPrdNor[0] ;
         A486ForNumCol = P06KE6_A486ForNumCol[0] ;
         A488ForPrdDsc = P06KE6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P06KE6_n488ForPrdDsc[0] ;
         A487ForPrdCan = P06KE6_A487ForPrdCan[0] ;
         A718PrdNom = P06KE6_A718PrdNom[0] ;
         A719PrdNum = P06KE6_A719PrdNum[0] ;
         A715PrdLin = P06KE6_A715PrdLin[0] ;
         A718PrdNom = P06KE6_A718PrdNom[0] ;
         A488ForPrdDsc = P06KE6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P06KE6_n488ForPrdDsc[0] ;
         if ( ( AV31Cont1 >= 11 ) && ( AV30Flag1 == 0 ) )
         {
            AV30Flag1 = (byte)(1) ;
            AV31Cont1 = (byte)(1) ;
            h6KE0( false, 21) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 35, Gx_line+1, 80, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A487ForPrdCan, "ZZZZ9.99999")), 305, Gx_line+1, 386, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+1, 432, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "APROVADA", ""), 617, Gx_line+1, 688, Gx_line+15, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+21) ;
         }
         else
         {
            if ( ( AV30Flag1 == 1 ) && ( AV37Flag2 == 0 ) )
            {
               AV37Flag2 = (byte)(1) ;
               h6KE0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 35, Gx_line+1, 80, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A487ForPrdCan, "ZZZZ9.99999")), 305, Gx_line+1, 386, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+1, 432, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REPETIÇÃO", ""), 617, Gx_line+1, 691, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               h6KE0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 35, Gx_line+1, 80, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 85, Gx_line+1, 276, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A487ForPrdCan, "ZZZZ9.99999")), 305, Gx_line+1, 386, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+1, 432, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
         }
         AV31Cont1 = (byte)(AV31Cont1+1) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'COLORANTE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.substring( AV34ProForPrd, 2, 1), " ") == 0 )
      {
         AV35Ncar = (byte)(1) ;
      }
      else
      {
         AV35Ncar = (byte)(2) ;
      }
      /* Using cursor P06KE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV33ForNumCol), Byte.valueOf(AV35Ncar), AV34ProForPrd, Byte.valueOf(AV35Ncar)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A490ForPrdUMe = P06KE7_A490ForPrdUMe[0] ;
         A719PrdNum = P06KE7_A719PrdNum[0] ;
         A486ForNumCol = P06KE7_A486ForNumCol[0] ;
         A488ForPrdDsc = P06KE7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P06KE7_n488ForPrdDsc[0] ;
         A481ForCan = P06KE7_A481ForCan[0] ;
         A718PrdNom = P06KE7_A718PrdNom[0] ;
         A309ColLin = P06KE7_A309ColLin[0] ;
         A718PrdNom = P06KE7_A718PrdNom[0] ;
         A488ForPrdDsc = P06KE7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P06KE7_n488ForPrdDsc[0] ;
         if ( ( AV31Cont1 >= 11 ) && ( AV30Flag1 == 0 ) )
         {
            AV30Flag1 = (byte)(1) ;
            AV31Cont1 = (byte)(1) ;
            h6KE0( false, 20) ;
            getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 35, Gx_line+0, 80, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 85, Gx_line+0, 276, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A481ForCan, "ZZZZ9.99999")), 305, Gx_line+0, 386, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+0, 432, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "APROVADA", ""), 617, Gx_line+1, 688, Gx_line+15, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
         else
         {
            if ( ( AV30Flag1 == 1 ) && ( AV37Flag2 == 0 ) )
            {
               AV37Flag2 = (byte)(1) ;
               h6KE0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 35, Gx_line+0, 80, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 85, Gx_line+0, 276, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A481ForCan, "ZZZZ9.99999")), 305, Gx_line+0, 386, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+0, 432, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(569, Gx_line+0, 594, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REPETIÇÃO", ""), 614, Gx_line+1, 688, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               h6KE0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 35, Gx_line+0, 80, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 85, Gx_line+0, 276, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A481ForCan, "ZZZZ9.99999")), 305, Gx_line+0, 386, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 395, Gx_line+0, 432, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
         }
         AV31Cont1 = (byte)(AV31Cont1+1) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void h6KE0( boolean bFoot ,
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
               getPrinter().GxDrawLine(4, Gx_line+77, 344, Gx_line+77, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TINTURARIA", ""), 353, Gx_line+71, 433, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(446, Gx_line+77, 796, Gx_line+77, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(14, Gx_line+14, 482, Gx_line+61, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Resp. Lab. __________________________", ""), 504, Gx_line+47, 763, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OBS:", ""), 17, Gx_line+25, 48, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(4, Gx_line+94, 797, Gx_line+408, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(5, Gx_line+121, 797, Gx_line+121, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 14, Gx_line+102, 33, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 208, Gx_line+102, 227, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 404, Gx_line+102, 423, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 605, Gx_line+102, 624, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(203, Gx_line+94, 203, Gx_line+408, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(395, Gx_line+94, 395, Gx_line+408, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(593, Gx_line+94, 593, Gx_line+408, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 14, Gx_line+127, 43, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 208, Gx_line+126, 237, Gx_line+140, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 404, Gx_line+125, 433, Gx_line+139, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 605, Gx_line+129, 634, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(5, Gx_line+148, 797, Gx_line+148, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(4, Gx_line+175, 796, Gx_line+175, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Maq.", ""), 14, Gx_line+153, 44, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Maq.", ""), 208, Gx_line+153, 238, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Maq.", ""), 404, Gx_line+153, 434, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Maq.", ""), 605, Gx_line+153, 635, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Resp.", ""), 14, Gx_line+389, 49, Gx_line+403, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Resp.", ""), 208, Gx_line+389, 243, Gx_line+403, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Resp.", ""), 404, Gx_line+389, 439, Gx_line+403, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Resp.", ""), 605, Gx_line+389, 640, Gx_line+403, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+421) ;
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
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 16, Gx_line+15, 330, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit1, "")), 516, Gx_line+16, 574, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 585, Gx_line+16, 636, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit2, "")), 646, Gx_line+16, 693, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 698, Gx_line+16, 799, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 652, Gx_line+43, 722, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 727, Gx_line+43, 772, Gx_line+60, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+61, 800, Gx_line+61, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FICHA TÉCNICA DE COR", ""), 16, Gx_line+44, 167, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ContDsc, "")), 710, Gx_line+0, 774, Gx_line+11, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit25, "")), 357, Gx_line+43, 421, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25UsurCod, "")), 429, Gx_line+43, 493, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 21, Gx_line+92, 63, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo Malha", ""), 21, Gx_line+113, 88, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor Cliente", ""), 21, Gx_line+133, 87, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 99, Gx_line+91, 144, Gx_line+108, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 152, Gx_line+91, 341, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 99, Gx_line+111, 200, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), 99, Gx_line+132, 181, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9")), 211, Gx_line+132, 256, Gx_line+149, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 419, Gx_line+92, 440, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 420, Gx_line+113, 437, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 420, Gx_line+136, 447, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 448, Gx_line+88, 571, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 610, Gx_line+88, 680, Gx_line+112, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 448, Gx_line+111, 464, Gx_line+128, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 475, Gx_line+111, 664, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 456, Gx_line+135, 515, Gx_line+152, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 541, Gx_line+135, 555, Gx_line+152, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 524, Gx_line+135, 532, Gx_line+152, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(2, Gx_line+80, 800, Gx_line+155, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+168, 342, Gx_line+168, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "LABORATÓRIO", ""), 351, Gx_line+161, 444, Gx_line+175, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(447, Gx_line+168, 797, Gx_line+168, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R.B.", ""), 31, Gx_line+177, 58, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2838ForRelBan, "ZZZ9.99")), 102, Gx_line+176, 154, Gx_line+193, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("1:", 86, Gx_line+176, 102, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(2, Gx_line+170, 178, Gx_line+196, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "AMOSTRAS:", ""), 569, Gx_line+176, 645, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PADRÃO (CLIENTE)", ""), 590, Gx_line+192, 711, Gx_line+206, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+205) ;
               AV31Cont1 = (byte)(0) ;
               AV30Flag1 = (byte)(0) ;
               AV37Flag2 = (byte)(0) ;
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
      add_metrics3( ) ;
      add_metrics4( ) ;
      add_metrics5( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics5( )
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
      AV29ImpCod = "" ;
      AV12PSerie = "" ;
      AV17USerie = "" ;
      AV11PNumCol = "" ;
      AV16UNumCol = "" ;
      AV21Lit0 = "" ;
      AV19Lit1 = "" ;
      AV20Lit2 = "" ;
      AV22Lit3 = "" ;
      AV24Lit25 = "" ;
      GXt_char1 = "" ;
      AV26Station = "" ;
      AV27EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV28EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV25UsurCod = "" ;
      AV23ContDsc = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P06KE2_A396EmprCod = new String[] {""} ;
      P06KE2_A407EmprNom = new String[] {""} ;
      P06KE2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      P06KE3_A396EmprCod = new String[] {""} ;
      P06KE3_A831TipColCod = new byte[1] ;
      P06KE3_A483ForColNum = new int[1] ;
      P06KE3_A482ForColNom = new String[] {""} ;
      P06KE3_A494ForSer = new String[] {""} ;
      P06KE3_A252CliCod = new int[1] ;
      P06KE3_A486ForNumCol = new int[1] ;
      P06KE3_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KE3_n2838ForRelBan = new boolean[] {false} ;
      P06KE3_A132BarCodReo = new byte[1] ;
      P06KE3_n132BarCodReo = new boolean[] {false} ;
      P06KE3_A130BarCodPar = new String[] {""} ;
      P06KE3_n130BarCodPar = new boolean[] {false} ;
      P06KE3_A129BarCod = new int[1] ;
      P06KE3_n129BarCod = new boolean[] {false} ;
      P06KE3_A832TipColDsc = new String[] {""} ;
      P06KE3_n832TipColDsc = new boolean[] {false} ;
      P06KE3_A1192ForNumCli = new int[1] ;
      P06KE3_n1192ForNumCli = new boolean[] {false} ;
      P06KE3_A1191ForNomCli = new String[] {""} ;
      P06KE3_n1191ForNomCli = new boolean[] {false} ;
      P06KE3_A279CliNom = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A832TipColDsc = "" ;
      A1191ForNomCli = "" ;
      A279CliNom = "" ;
      P06KE4_A396EmprCod = new String[] {""} ;
      P06KE4_A252CliCod = new int[1] ;
      P06KE4_A494ForSer = new String[] {""} ;
      P06KE4_A482ForColNom = new String[] {""} ;
      P06KE4_A483ForColNum = new int[1] ;
      P06KE4_A831TipColCod = new byte[1] ;
      P06KE4_A764ProForCod = new String[] {""} ;
      P06KE4_A1160ProForL = new short[1] ;
      P06KE4_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P06KE5_A490ForPrdUMe = new byte[1] ;
      P06KE5_A396EmprCod = new String[] {""} ;
      P06KE5_A764ProForCod = new String[] {""} ;
      P06KE5_A1645ProForNro = new byte[1] ;
      P06KE5_A770ProForPrd = new String[] {""} ;
      P06KE5_A765ProForDes = new String[] {""} ;
      P06KE5_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KE5_A763ProForCla = new String[] {""} ;
      P06KE5_A488ForPrdDsc = new String[] {""} ;
      P06KE5_n488ForPrdDsc = new boolean[] {false} ;
      P06KE5_A767ProForLin = new short[1] ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A488ForPrdDsc = "" ;
      AV34ProForPrd = "" ;
      P06KE6_A490ForPrdUMe = new byte[1] ;
      P06KE6_A396EmprCod = new String[] {""} ;
      P06KE6_A489ForPrdNor = new short[1] ;
      P06KE6_A486ForNumCol = new int[1] ;
      P06KE6_A488ForPrdDsc = new String[] {""} ;
      P06KE6_n488ForPrdDsc = new boolean[] {false} ;
      P06KE6_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KE6_A718PrdNom = new String[] {""} ;
      P06KE6_A719PrdNum = new String[] {""} ;
      P06KE6_A715PrdLin = new short[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      P06KE7_A490ForPrdUMe = new byte[1] ;
      P06KE7_A396EmprCod = new String[] {""} ;
      P06KE7_A719PrdNum = new String[] {""} ;
      P06KE7_A486ForNumCol = new int[1] ;
      P06KE7_A488ForPrdDsc = new String[] {""} ;
      P06KE7_n488ForPrdDsc = new boolean[] {false} ;
      P06KE7_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KE7_A718PrdNom = new String[] {""} ;
      P06KE7_A309ColLin = new short[1] ;
      A481ForCan = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rfo0009__default(),
         new Object[] {
             new Object[] {
            P06KE2_A396EmprCod, P06KE2_A407EmprNom, P06KE2_n407EmprNom
            }
            , new Object[] {
            P06KE3_A396EmprCod, P06KE3_A831TipColCod, P06KE3_A483ForColNum, P06KE3_A482ForColNom, P06KE3_A494ForSer, P06KE3_A252CliCod, P06KE3_A486ForNumCol, P06KE3_A2838ForRelBan, P06KE3_n2838ForRelBan, P06KE3_A132BarCodReo,
            P06KE3_n132BarCodReo, P06KE3_A130BarCodPar, P06KE3_n130BarCodPar, P06KE3_A129BarCod, P06KE3_n129BarCod, P06KE3_A832TipColDsc, P06KE3_n832TipColDsc, P06KE3_A1192ForNumCli, P06KE3_n1192ForNumCli, P06KE3_A1191ForNomCli,
            P06KE3_n1191ForNomCli, P06KE3_A279CliNom
            }
            , new Object[] {
            P06KE4_A396EmprCod, P06KE4_A252CliCod, P06KE4_A494ForSer, P06KE4_A482ForColNom, P06KE4_A483ForColNum, P06KE4_A831TipColCod, P06KE4_A764ProForCod, P06KE4_A1160ProForL, P06KE4_A766ProForDsc
            }
            , new Object[] {
            P06KE5_A490ForPrdUMe, P06KE5_A396EmprCod, P06KE5_A764ProForCod, P06KE5_A1645ProForNro, P06KE5_A770ProForPrd, P06KE5_A765ProForDes, P06KE5_A762ProForCan, P06KE5_A763ProForCla, P06KE5_A488ForPrdDsc, P06KE5_n488ForPrdDsc,
            P06KE5_A767ProForLin
            }
            , new Object[] {
            P06KE6_A490ForPrdUMe, P06KE6_A396EmprCod, P06KE6_A489ForPrdNor, P06KE6_A486ForNumCol, P06KE6_A488ForPrdDsc, P06KE6_n488ForPrdDsc, P06KE6_A487ForPrdCan, P06KE6_A718PrdNom, P06KE6_A719PrdNum, P06KE6_A715PrdLin
            }
            , new Object[] {
            P06KE7_A490ForPrdUMe, P06KE7_A396EmprCod, P06KE7_A719PrdNum, P06KE7_A486ForNumCol, P06KE7_A488ForPrdDsc, P06KE7_n488ForPrdDsc, P06KE7_A481ForCan, P06KE7_A718PrdNom, P06KE7_A309ColLin
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

   private byte AV30Flag1 ;
   private byte AV37Flag2 ;
   private byte A831TipColCod ;
   private byte A132BarCodReo ;
   private byte AV31Cont1 ;
   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private byte AV36NroInt ;
   private byte AV35Ncar ;
   private short gxcookieaux ;
   private short A1160ProForL ;
   private short A767ProForLin ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV8PCliCod ;
   private int AV13UCliCod ;
   private int AV9PColor ;
   private int AV14UColor ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int A129BarCod ;
   private int A1192ForNumCli ;
   private int AV33ForNumCol ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal A481ForCan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV29ImpCod ;
   private String AV12PSerie ;
   private String AV17USerie ;
   private String AV11PNumCol ;
   private String AV16UNumCol ;
   private String AV21Lit0 ;
   private String AV19Lit1 ;
   private String AV20Lit2 ;
   private String AV22Lit3 ;
   private String AV24Lit25 ;
   private String GXt_char1 ;
   private String AV26Station ;
   private String AV27EmprCod ;
   private String GXv_char2[] ;
   private String AV28EmprNom ;
   private String GXv_char3[] ;
   private String AV25UsurCod ;
   private String AV23ContDsc ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A130BarCodPar ;
   private String A832TipColDsc ;
   private String A1191ForNomCli ;
   private String A279CliNom ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A763ProForCla ;
   private String A488ForPrdDsc ;
   private String AV34ProForPrd ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n2838ForRelBan ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n129BarCod ;
   private boolean n832TipColDsc ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P06KE2_A396EmprCod ;
   private String[] P06KE2_A407EmprNom ;
   private boolean[] P06KE2_n407EmprNom ;
   private String[] P06KE3_A396EmprCod ;
   private byte[] P06KE3_A831TipColCod ;
   private int[] P06KE3_A483ForColNum ;
   private String[] P06KE3_A482ForColNom ;
   private String[] P06KE3_A494ForSer ;
   private int[] P06KE3_A252CliCod ;
   private int[] P06KE3_A486ForNumCol ;
   private java.math.BigDecimal[] P06KE3_A2838ForRelBan ;
   private boolean[] P06KE3_n2838ForRelBan ;
   private byte[] P06KE3_A132BarCodReo ;
   private boolean[] P06KE3_n132BarCodReo ;
   private String[] P06KE3_A130BarCodPar ;
   private boolean[] P06KE3_n130BarCodPar ;
   private int[] P06KE3_A129BarCod ;
   private boolean[] P06KE3_n129BarCod ;
   private String[] P06KE3_A832TipColDsc ;
   private boolean[] P06KE3_n832TipColDsc ;
   private int[] P06KE3_A1192ForNumCli ;
   private boolean[] P06KE3_n1192ForNumCli ;
   private String[] P06KE3_A1191ForNomCli ;
   private boolean[] P06KE3_n1191ForNomCli ;
   private String[] P06KE3_A279CliNom ;
   private String[] P06KE4_A396EmprCod ;
   private int[] P06KE4_A252CliCod ;
   private String[] P06KE4_A494ForSer ;
   private String[] P06KE4_A482ForColNom ;
   private int[] P06KE4_A483ForColNum ;
   private byte[] P06KE4_A831TipColCod ;
   private String[] P06KE4_A764ProForCod ;
   private short[] P06KE4_A1160ProForL ;
   private String[] P06KE4_A766ProForDsc ;
   private byte[] P06KE5_A490ForPrdUMe ;
   private String[] P06KE5_A396EmprCod ;
   private String[] P06KE5_A764ProForCod ;
   private byte[] P06KE5_A1645ProForNro ;
   private String[] P06KE5_A770ProForPrd ;
   private String[] P06KE5_A765ProForDes ;
   private java.math.BigDecimal[] P06KE5_A762ProForCan ;
   private String[] P06KE5_A763ProForCla ;
   private String[] P06KE5_A488ForPrdDsc ;
   private boolean[] P06KE5_n488ForPrdDsc ;
   private short[] P06KE5_A767ProForLin ;
   private byte[] P06KE6_A490ForPrdUMe ;
   private String[] P06KE6_A396EmprCod ;
   private short[] P06KE6_A489ForPrdNor ;
   private int[] P06KE6_A486ForNumCol ;
   private String[] P06KE6_A488ForPrdDsc ;
   private boolean[] P06KE6_n488ForPrdDsc ;
   private java.math.BigDecimal[] P06KE6_A487ForPrdCan ;
   private String[] P06KE6_A718PrdNom ;
   private String[] P06KE6_A719PrdNum ;
   private short[] P06KE6_A715PrdLin ;
   private byte[] P06KE7_A490ForPrdUMe ;
   private String[] P06KE7_A396EmprCod ;
   private String[] P06KE7_A719PrdNum ;
   private int[] P06KE7_A486ForNumCol ;
   private String[] P06KE7_A488ForPrdDsc ;
   private boolean[] P06KE7_n488ForPrdDsc ;
   private java.math.BigDecimal[] P06KE7_A481ForCan ;
   private String[] P06KE7_A718PrdNom ;
   private short[] P06KE7_A309ColLin ;
}

final  class rfo0009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06KE2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06KE3", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForNumCol, T1.ForRelBan, T1.BarCodReo, T1.BarCodPar, T1.BarCod, T3.TipColDsc, T1.ForNumCli, T1.ForNomCli, T2.CliNom FROM ((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod = T1.TipColCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.ForSer >= ? and T1.ForColNom >= ? and T1.ForColNum >= ?) AND (T1.ForSer <= ?) AND (T1.ForColNum <= ?) AND (T1.ForColNom <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06KE4", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForCod, T1.ProForL, T2.ProForDsc FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06KE5", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForNro, T1.ProForPrd, T1.ProForDes, T1.ProForCan, T1.ProForCla, T2.ForPrdDsc, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06KE6", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForPrdNor, T1.ForNumCol, T3.ForPrdDsc, T1.ForPrdCan, T2.PrdNom, T1.PrdNum, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (T1.ForPrdNor = TO_NUMBER(NVL(TRIM(SUBSTR(?, 2, 4)), '0'))) ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06KE7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.PrdNum, T1.ForNumCol, T3.ForPrdDsc, T1.ForCan, T2.PrdNom, T1.ColLin FROM ((TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (SUBSTR(T1.PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

