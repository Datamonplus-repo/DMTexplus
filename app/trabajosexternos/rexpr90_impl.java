package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rexpr90_impl extends GXWebReport
{
   public rexpr90_impl( com.genexus.internet.HttpContext context )
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
            AV15Pman = (short)(GXutil.lval( httpContext.GetPar( "Pman"))) ;
            AV16Uman2 = (short)(GXutil.lval( httpContext.GetPar( "Uman2"))) ;
            AV17PAlbFch = localUtil.parseDateParm( httpContext.GetPar( "PAlbFch")) ;
            AV18UFecha2 = localUtil.parseDateParm( httpContext.GetPar( "UFecha2")) ;
            AV19POpe = httpContext.GetPar( "POpe") ;
            AV20UOpe2 = httpContext.GetPar( "UOpe2") ;
            AV21TipPapel = httpContext.GetPar( "TipPapel") ;
            AV22Fuente = (byte)(GXutil.lval( httpContext.GetPar( "Fuente"))) ;
            AV23Trab = httpContext.GetPar( "Trab") ;
            AV24ImpCod = httpContext.GetPar( "ImpCod") ;
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
         Gx_out = "SCR" ;
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
         GXt_char1 = AV48Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV69Pgmdesc, (byte)(99), GXv_char2) ;
         rexpr90_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit0 = GXt_char1 ;
         GXt_char1 = AV49Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rexpr90_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit1 = GXt_char1 ;
         GXt_char1 = AV50Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rexpr90_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit2 = GXt_char1 ;
         GXt_char1 = AV51Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rexpr90_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit3 = GXt_char1 ;
         /* Using cursor P07Q92 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07Q92_A407EmprNom[0] ;
            n407EmprNom = P07Q92_n407EmprNom[0] ;
            AV25NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV60Manf = (byte)(0) ;
         AV61Fas = (byte)(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV15Pman) ,
                                              Short.valueOf(AV16Uman2) ,
                                              AV19POpe ,
                                              AV20UOpe2 ,
                                              Short.valueOf(A2248ManCod) ,
                                              A2689ExHdrFas ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P07Q93 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV15Pman), Short.valueOf(AV16Uman2), AV19POpe, AV20UOpe2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk7Q94 = false ;
            A2248ManCod = P07Q93_A2248ManCod[0] ;
            A2691ExHdrUln = P07Q93_A2691ExHdrUln[0] ;
            n2691ExHdrUln = P07Q93_n2691ExHdrUln[0] ;
            A2689ExHdrFas = P07Q93_A2689ExHdrFas[0] ;
            A2249ManNom = P07Q93_A2249ManNom[0] ;
            n2249ManNom = P07Q93_n2249ManNom[0] ;
            A2249ManNom = P07Q93_A2249ManNom[0] ;
            n2249ManNom = P07Q93_n2249ManNom[0] ;
            AV62ManCod = A2248ManCod ;
            AV52ManNom = A2249ManNom ;
            AV60Manf = (byte)(0) ;
            AV38FlagL = (byte)(0) ;
            AV45FlagM = (byte)(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07Q93_A396EmprCod[0], A396EmprCod) == 0 ) && ( P07Q93_A2248ManCod[0] == A2248ManCod ) )
            {
               brk7Q94 = false ;
               A2691ExHdrUln = P07Q93_A2691ExHdrUln[0] ;
               n2691ExHdrUln = P07Q93_n2691ExHdrUln[0] ;
               A2689ExHdrFas = P07Q93_A2689ExHdrFas[0] ;
               AV36FechaE = GXutil.nullDate() ;
               AV37FechaR = GXutil.nullDate() ;
               AV46FlagO = (byte)(0) ;
               AV61Fas = (byte)(0) ;
               AV63Fascod = A2689ExHdrFas ;
               GXv_char2[0] = AV53fasdsc ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A2689ExHdrFas, GXv_char2) ;
               rexpr90_impl.this.AV53fasdsc = GXv_char2[0] ;
               pr_default.dynParam(2, new Object[]{ new Object[]{
                                                    AV17PAlbFch ,
                                                    AV18UFecha2 ,
                                                    A2700ExHdrFeR ,
                                                    A396EmprCod ,
                                                    Short.valueOf(A2248ManCod) ,
                                                    A2689ExHdrFas } ,
                                                    new int[]{
                                                    TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING
                                                    }
               });
               /* Using cursor P07Q94 */
               pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, AV17PAlbFch, AV18UFecha2});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  brk7Q96 = false ;
                  A2693ExHdrTip = P07Q94_A2693ExHdrTip[0] ;
                  n2693ExHdrTip = P07Q94_n2693ExHdrTip[0] ;
                  A129BarCod = P07Q94_A129BarCod[0] ;
                  n129BarCod = P07Q94_n129BarCod[0] ;
                  A132BarCodReo = P07Q94_A132BarCodReo[0] ;
                  n132BarCodReo = P07Q94_n132BarCodReo[0] ;
                  A130BarCodPar = P07Q94_A130BarCodPar[0] ;
                  n130BarCodPar = P07Q94_n130BarCodPar[0] ;
                  A2694ExHdrAlb = P07Q94_A2694ExHdrAlb[0] ;
                  n2694ExHdrAlb = P07Q94_n2694ExHdrAlb[0] ;
                  A228BarUniMed = P07Q94_A228BarUniMed[0] ;
                  A143BarDisNum = P07Q94_A143BarDisNum[0] ;
                  A4812BarEncCli = P07Q94_A4812BarEncCli[0] ;
                  A2748CliAlias = P07Q94_A2748CliAlias[0] ;
                  A279CliNom = P07Q94_A279CliNom[0] ;
                  A2845ExHdrMtR = P07Q94_A2845ExHdrMtR[0] ;
                  n2845ExHdrMtR = P07Q94_n2845ExHdrMtR[0] ;
                  A2700ExHdrFeR = P07Q94_A2700ExHdrFeR[0] ;
                  n2700ExHdrFeR = P07Q94_n2700ExHdrFeR[0] ;
                  A2698ExHdrKgR = P07Q94_A2698ExHdrKgR[0] ;
                  n2698ExHdrKgR = P07Q94_n2698ExHdrKgR[0] ;
                  A2699ExHdrCnR = P07Q94_A2699ExHdrCnR[0] ;
                  n2699ExHdrCnR = P07Q94_n2699ExHdrCnR[0] ;
                  A212BarSer = P07Q94_A212BarSer[0] ;
                  A252CliCod = P07Q94_A252CliCod[0] ;
                  n252CliCod = P07Q94_n252CliCod[0] ;
                  A2692ExHdrLin = P07Q94_A2692ExHdrLin[0] ;
                  A228BarUniMed = P07Q94_A228BarUniMed[0] ;
                  A143BarDisNum = P07Q94_A143BarDisNum[0] ;
                  A4812BarEncCli = P07Q94_A4812BarEncCli[0] ;
                  A212BarSer = P07Q94_A212BarSer[0] ;
                  A252CliCod = P07Q94_A252CliCod[0] ;
                  n252CliCod = P07Q94_n252CliCod[0] ;
                  A2748CliAlias = P07Q94_A2748CliAlias[0] ;
                  A279CliNom = P07Q94_A279CliNom[0] ;
                  AV34TotKgsR = DecimalUtil.ZERO ;
                  while ( (pr_default.getStatus(2) != 101) && ( P07Q94_A129BarCod[0] == A129BarCod ) && ( P07Q94_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P07Q94_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P07Q94_A2693ExHdrTip[0], A2693ExHdrTip) == 0 ) )
                  {
                     brk7Q96 = false ;
                     A2694ExHdrAlb = P07Q94_A2694ExHdrAlb[0] ;
                     n2694ExHdrAlb = P07Q94_n2694ExHdrAlb[0] ;
                     A228BarUniMed = P07Q94_A228BarUniMed[0] ;
                     A143BarDisNum = P07Q94_A143BarDisNum[0] ;
                     A4812BarEncCli = P07Q94_A4812BarEncCli[0] ;
                     A2748CliAlias = P07Q94_A2748CliAlias[0] ;
                     A279CliNom = P07Q94_A279CliNom[0] ;
                     A2845ExHdrMtR = P07Q94_A2845ExHdrMtR[0] ;
                     n2845ExHdrMtR = P07Q94_n2845ExHdrMtR[0] ;
                     A2700ExHdrFeR = P07Q94_A2700ExHdrFeR[0] ;
                     n2700ExHdrFeR = P07Q94_n2700ExHdrFeR[0] ;
                     A2698ExHdrKgR = P07Q94_A2698ExHdrKgR[0] ;
                     n2698ExHdrKgR = P07Q94_n2698ExHdrKgR[0] ;
                     A2699ExHdrCnR = P07Q94_A2699ExHdrCnR[0] ;
                     n2699ExHdrCnR = P07Q94_n2699ExHdrCnR[0] ;
                     A212BarSer = P07Q94_A212BarSer[0] ;
                     A252CliCod = P07Q94_A252CliCod[0] ;
                     n252CliCod = P07Q94_n252CliCod[0] ;
                     A2692ExHdrLin = P07Q94_A2692ExHdrLin[0] ;
                     A228BarUniMed = P07Q94_A228BarUniMed[0] ;
                     A143BarDisNum = P07Q94_A143BarDisNum[0] ;
                     A4812BarEncCli = P07Q94_A4812BarEncCli[0] ;
                     A212BarSer = P07Q94_A212BarSer[0] ;
                     A252CliCod = P07Q94_A252CliCod[0] ;
                     n252CliCod = P07Q94_n252CliCod[0] ;
                     A2748CliAlias = P07Q94_A2748CliAlias[0] ;
                     A279CliNom = P07Q94_A279CliNom[0] ;
                     if ( GXutil.strcmp(P07Q94_A396EmprCod[0], A396EmprCod) == 0 )
                     {
                        if ( P07Q94_A2248ManCod[0] == A2248ManCod )
                        {
                           if ( GXutil.strcmp(P07Q94_A2689ExHdrFas[0], A2689ExHdrFas) == 0 )
                           {
                              if ( (0==AV15Pman) || ( ( A2248ManCod >= AV15Pman ) ) )
                              {
                                 if ( (0==AV16Uman2) || ( ( A2248ManCod <= AV16Uman2 ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV19POpe)==0) || ( ( GXutil.strcmp(A2689ExHdrFas, AV19POpe) >= 0 ) ) )
                                    {
                                       if ( (GXutil.strcmp("", AV20UOpe2)==0) || ( ( GXutil.strcmp(A2689ExHdrFas, AV20UOpe2) <= 0 ) ) )
                                       {
                                          AV40BarCod = A129BarCod ;
                                          AV41BarCodReo = A132BarCodReo ;
                                          AV42BarCodPar = A130BarCodPar ;
                                          AV43SalExtAlb = A2694ExHdrAlb ;
                                          AV59BarUnimed = A228BarUniMed ;
                                          AV66Barenccli = A143BarDisNum ;
                                          if ( GXutil.strcmp(A143BarDisNum, " ") == 0 )
                                          {
                                             AV66Barenccli = A4812BarEncCli ;
                                          }
                                          /* Execute user subroutine: 'LEOSTA' */
                                          S111 ();
                                          if ( returnInSub )
                                          {
                                             pr_default.close(2);
                                             pr_default.close(2);
                                             pr_default.close(2);
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
                                          if ( ( ( GXutil.strcmp(AV23Trab, httpContext.getMessage( "A", "")) == 0 ) && ( ( AV44SalExtEsB == 1 ) || (0==AV44SalExtEsB) ) ) || ( ( GXutil.strcmp(AV23Trab, httpContext.getMessage( "C", "")) == 0 ) && ( AV44SalExtEsB == 2 ) ) || ( ( GXutil.strcmp(AV23Trab, httpContext.getMessage( "T", "")) == 0 ) ) )
                                          {
                                             if ( AV60Manf == 0 )
                                             {
                                                AV60Manf = (byte)(1) ;
                                                h7Q90( false, 38) ;
                                                getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                getPrinter().GxDrawText(httpContext.getMessage( "Manufacturador", ""), 10, Gx_line+13, 84, Gx_line+26, 0+256, 0, 0, 0) ;
                                                getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV62ManCod), "ZZZ9")), 94, Gx_line+13, 116, Gx_line+27, 2+256, 0, 0, 0) ;
                                                getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52ManNom, "")), 120, Gx_line+13, 277, Gx_line+27, 0+256, 0, 0, 0) ;
                                                Gx_OldLine = Gx_line ;
                                                Gx_line = (int)(Gx_line+38) ;
                                             }
                                             if ( AV61Fas == 0 )
                                             {
                                                AV61Fas = (byte)(1) ;
                                                h7Q90( false, 33) ;
                                                getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                getPrinter().GxDrawText(httpContext.getMessage( "Operaçao", ""), 42, Gx_line+13, 85, Gx_line+26, 0+256, 0, 0, 0) ;
                                                getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Fascod, "@!")), 94, Gx_line+13, 137, Gx_line+27, 0+256, 0, 0, 0) ;
                                                getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53fasdsc, "")), 141, Gx_line+13, 288, Gx_line+27, 0+256, 0, 0, 0) ;
                                                Gx_OldLine = Gx_line ;
                                                Gx_line = (int)(Gx_line+33) ;
                                             }
                                             AV26HojaRuta = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                             if ( ! (GXutil.strcmp("", A2748CliAlias)==0) )
                                             {
                                                AV47NomCli = A2748CliAlias ;
                                             }
                                             else
                                             {
                                                AV47NomCli = GXutil.substring( A279CliNom, 1, 16) ;
                                             }
                                             GXv_date3[0] = AV54EXHDRFEE ;
                                             GXv_decimal4[0] = AV55EXHDRKGE ;
                                             GXv_decimal5[0] = AV56EXHDRMTE ;
                                             GXv_int6[0] = AV57EXHDRCNE ;
                                             new app.trabajosexternos.pexpr01(remoteHandle, context).execute( A396EmprCod, A2248ManCod, A2689ExHdrFas, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_date3, GXv_decimal4, GXv_decimal5, GXv_int6) ;
                                             rexpr90_impl.this.AV54EXHDRFEE = GXv_date3[0] ;
                                             rexpr90_impl.this.AV55EXHDRKGE = GXv_decimal4[0] ;
                                             rexpr90_impl.this.AV56EXHDRMTE = GXv_decimal5[0] ;
                                             rexpr90_impl.this.AV57EXHDRCNE = GXv_int6[0] ;
                                             AV36FechaE = AV54EXHDRFEE ;
                                             h7Q90( false, 15) ;
                                             getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26HojaRuta, "")), 5, Gx_line+0, 63, Gx_line+14, 0+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 68, Gx_line+0, 100, Gx_line+14, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47NomCli, "")), 100, Gx_line+0, 184, Gx_line+14, 0+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 193, Gx_line+0, 277, Gx_line+14, 0+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57EXHDRCNE), "ZZZ9")), 453, Gx_line+0, 475, Gx_line+14, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55EXHDRKGE, "ZZZZZ9.99")), 479, Gx_line+0, 527, Gx_line+14, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56EXHDRMTE, "ZZZZZ9.99")), 536, Gx_line+0, 584, Gx_line+14, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(localUtil.format( AV54EXHDRFEE, "99/99/99"), 589, Gx_line+0, 632, Gx_line+14, 0+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2699ExHdrCnR), "ZZZ9")), 661, Gx_line+0, 683, Gx_line+14, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2698ExHdrKgR, "ZZZZZ9.99")), 688, Gx_line+0, 736, Gx_line+14, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(localUtil.format( A2700ExHdrFeR, "99/99/99"), 797, Gx_line+0, 840, Gx_line+14, 0+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2845ExHdrMtR, "ZZZZZ9.99")), 740, Gx_line+1, 788, Gx_line+15, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59BarUnimed, "@!")), 995, Gx_line+0, 1001, Gx_line+14, 0+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Sta, "")), 1016, Gx_line+0, 1022, Gx_line+14, 0+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43SalExtAlb), "ZZZZZZZ9")), 286, Gx_line+0, 329, Gx_line+14, 2+256, 0, 0, 0) ;
                                             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Barenccli, "")), 333, Gx_line+0, 438, Gx_line+14, 0+256, 0, 0, 0) ;
                                             Gx_OldLine = Gx_line ;
                                             Gx_line = (int)(Gx_line+15) ;
                                             AV37FechaR = A2700ExHdrFeR ;
                                             AV34TotKgsR = AV34TotKgsR.add(A2698ExHdrKgR) ;
                                             AV58TotMtsr = AV58TotMtsr.add(A2845ExHdrMtR) ;
                                             AV35TotConR = (short)(AV35TotConR+A2699ExHdrCnR) ;
                                             AV38FlagL = (byte)(1) ;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                     brk7Q96 = true ;
                     pr_default.readNext(2);
                  }
                  AV30DifKgs = DecimalUtil.ZERO ;
                  AV31MerKgs = DecimalUtil.ZERO ;
                  AV32DiasSer = (short)(0) ;
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TotKgsR)==0) && ( GXutil.strcmp(AV59BarUnimed, httpContext.getMessage( "K", "")) == 0 ) )
                  {
                     AV30DifKgs = AV55EXHDRKGE.subtract(AV34TotKgsR) ;
                     AV31MerKgs = ((AV55EXHDRKGE.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : ((AV34TotKgsR.subtract(AV55EXHDRKGE)).divide(AV55EXHDRKGE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
                     AV32DiasSer = (short)(GXutil.ddiff(AV37FechaR,AV36FechaE)) ;
                  }
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TotMtsr)==0) && ( GXutil.strcmp(AV59BarUnimed, httpContext.getMessage( "M", "")) == 0 ) )
                  {
                     AV30DifKgs = AV56EXHDRMTE.subtract(AV58TotMtsr) ;
                     AV31MerKgs = ((AV56EXHDRMTE.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : ((AV58TotMtsr.subtract(AV56EXHDRMTE)).divide(AV56EXHDRMTE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
                     AV32DiasSer = (short)(GXutil.ddiff(AV37FechaR,AV36FechaE)) ;
                  }
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30DifKgs)==0) )
                  {
                     h7Q90( false, 15) ;
                     getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30DifKgs, "ZZZZZ9.99")), 854, Gx_line+1, 902, Gx_line+15, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31MerKgs, "ZZ9.99")), 906, Gx_line+0, 938, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32DiasSer), "ZZ9")), 954, Gx_line+0, 971, Gx_line+14, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+15) ;
                  }
                  if ( ! brk7Q96 )
                  {
                     brk7Q96 = true ;
                     pr_default.readNext(2);
                  }
               }
               pr_default.close(2);
               brk7Q94 = true ;
               pr_default.readNext(1);
            }
            if ( ! brk7Q94 )
            {
               brk7Q94 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7Q90( true, 0) ;
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
      /* 'LEOSTA' Routine */
      returnInSub = false ;
      AV39Sta = "" ;
      AV44SalExtEsB = (byte)(0) ;
      AV64SalExtFen = GXutil.nullDate() ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV15Pman) ,
                                           Short.valueOf(AV16Uman2) ,
                                           Short.valueOf(A2248ManCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV43SalExtAlb) ,
                                           Integer.valueOf(AV40BarCod) ,
                                           Byte.valueOf(AV41BarCodReo) ,
                                           AV42BarCodPar ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P07Q95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV43SalExtAlb), Integer.valueOf(AV40BarCod), Byte.valueOf(AV41BarCodReo), AV42BarCodPar, Short.valueOf(AV15Pman), Short.valueOf(AV16Uman2)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2248ManCod = P07Q95_A2248ManCod[0] ;
         A130BarCodPar = P07Q95_A130BarCodPar[0] ;
         n130BarCodPar = P07Q95_n130BarCodPar[0] ;
         A132BarCodReo = P07Q95_A132BarCodReo[0] ;
         n132BarCodReo = P07Q95_n132BarCodReo[0] ;
         A129BarCod = P07Q95_A129BarCod[0] ;
         n129BarCod = P07Q95_n129BarCod[0] ;
         A2253SalExtAlb = P07Q95_A2253SalExtAlb[0] ;
         A2262SalExtEsB = P07Q95_A2262SalExtEsB[0] ;
         n2262SalExtEsB = P07Q95_n2262SalExtEsB[0] ;
         A11317SalExtFt = P07Q95_A11317SalExtFt[0] ;
         n11317SalExtFt = P07Q95_n11317SalExtFt[0] ;
         A2248ManCod = P07Q95_A2248ManCod[0] ;
         AV44SalExtEsB = A2262SalExtEsB ;
         AV64SalExtFen = A11317SalExtFt ;
         if ( ( A2262SalExtEsB == 1 ) || (0==A2262SalExtEsB) )
         {
            AV39Sta = httpContext.getMessage( "A", "") ;
         }
         if ( A2262SalExtEsB == 2 )
         {
            AV39Sta = httpContext.getMessage( "C", "") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void h7Q90( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25NomEmp, "")), 5, Gx_line+13, 162, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit1, "")), 906, Gx_line+13, 933, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 957, Gx_line+13, 1000, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit2, "")), 1038, Gx_line+13, 1060, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1073, Gx_line+13, 1116, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit0, "")), 5, Gx_line+38, 339, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Trab, "")), 349, Gx_line+38, 355, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+63, 1124, Gx_line+63, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit3, "")), 1026, Gx_line+38, 1058, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1079, Gx_line+38, 1111, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem S.", ""), 5, Gx_line+88, 48, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 68, Gx_line+88, 105, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+100, 62, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(68, Gx_line+100, 184, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 193, Gx_line+88, 225, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(193, Gx_line+100, 276, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 448, Gx_line+88, 475, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 495, Gx_line+88, 527, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 552, Gx_line+88, 584, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 589, Gx_line+88, 611, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(448, Gx_line+100, 474, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(479, Gx_line+100, 526, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(536, Gx_line+100, 583, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(589, Gx_line+100, 631, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Envio", ""), 523, Gx_line+75, 550, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(448, Gx_line+82, 505, Gx_line+82, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(568, Gx_line+82, 631, Gx_line+82, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 656, Gx_line+88, 683, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 703, Gx_line+88, 735, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 755, Gx_line+88, 787, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 797, Gx_line+88, 819, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(656, Gx_line+100, 682, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(688, Gx_line+100, 735, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(740, Gx_line+100, 787, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(797, Gx_line+100, 839, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(656, Gx_line+82, 699, Gx_line+82, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recepçao", ""), 708, Gx_line+75, 751, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(769, Gx_line+80, 839, Gx_line+80, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Qtd.", ""), 868, Gx_line+88, 890, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quebra", ""), 906, Gx_line+88, 938, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dias", ""), 954, Gx_line+88, 976, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Difer", ""), 865, Gx_line+75, 892, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 919, Gx_line+75, 925, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(854, Gx_line+100, 901, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(906, Gx_line+100, 937, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(954, Gx_line+100, 975, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Guia", ""), 286, Gx_line+88, 318, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(286, Gx_line+100, 328, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Enc Cli", ""), 333, Gx_line+88, 370, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(333, Gx_line+100, 437, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Pgmname, "")), 625, Gx_line+38, 782, Gx_line+52, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+106) ;
            AV46FlagO = (byte)(0) ;
            AV45FlagM = (byte)(0) ;
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
      AV17PAlbFch = GXutil.nullDate() ;
      AV18UFecha2 = GXutil.nullDate() ;
      AV19POpe = "" ;
      AV20UOpe2 = "" ;
      AV21TipPapel = "" ;
      AV23Trab = "" ;
      AV24ImpCod = "" ;
      AV48Lit0 = "" ;
      AV69Pgmdesc = "" ;
      AV49Lit1 = "" ;
      AV50Lit2 = "" ;
      AV51Lit3 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P07Q92_A396EmprCod = new String[] {""} ;
      P07Q92_A407EmprNom = new String[] {""} ;
      P07Q92_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV25NomEmp = "" ;
      A2689ExHdrFas = "" ;
      P07Q93_A396EmprCod = new String[] {""} ;
      P07Q93_A2248ManCod = new short[1] ;
      P07Q93_A2691ExHdrUln = new int[1] ;
      P07Q93_n2691ExHdrUln = new boolean[] {false} ;
      P07Q93_A2689ExHdrFas = new String[] {""} ;
      P07Q93_A2249ManNom = new String[] {""} ;
      P07Q93_n2249ManNom = new boolean[] {false} ;
      A2249ManNom = "" ;
      AV52ManNom = "" ;
      AV36FechaE = GXutil.nullDate() ;
      AV37FechaR = GXutil.nullDate() ;
      AV63Fascod = "" ;
      AV53fasdsc = "" ;
      GXv_char2 = new String[1] ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      P07Q94_A396EmprCod = new String[] {""} ;
      P07Q94_A2248ManCod = new short[1] ;
      P07Q94_A2689ExHdrFas = new String[] {""} ;
      P07Q94_A2693ExHdrTip = new String[] {""} ;
      P07Q94_n2693ExHdrTip = new boolean[] {false} ;
      P07Q94_A129BarCod = new int[1] ;
      P07Q94_n129BarCod = new boolean[] {false} ;
      P07Q94_A132BarCodReo = new byte[1] ;
      P07Q94_n132BarCodReo = new boolean[] {false} ;
      P07Q94_A130BarCodPar = new String[] {""} ;
      P07Q94_n130BarCodPar = new boolean[] {false} ;
      P07Q94_A2694ExHdrAlb = new int[1] ;
      P07Q94_n2694ExHdrAlb = new boolean[] {false} ;
      P07Q94_A228BarUniMed = new String[] {""} ;
      P07Q94_A143BarDisNum = new String[] {""} ;
      P07Q94_A4812BarEncCli = new String[] {""} ;
      P07Q94_A2748CliAlias = new String[] {""} ;
      P07Q94_A279CliNom = new String[] {""} ;
      P07Q94_A2845ExHdrMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07Q94_n2845ExHdrMtR = new boolean[] {false} ;
      P07Q94_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P07Q94_n2700ExHdrFeR = new boolean[] {false} ;
      P07Q94_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07Q94_n2698ExHdrKgR = new boolean[] {false} ;
      P07Q94_A2699ExHdrCnR = new short[1] ;
      P07Q94_n2699ExHdrCnR = new boolean[] {false} ;
      P07Q94_A212BarSer = new String[] {""} ;
      P07Q94_A252CliCod = new int[1] ;
      P07Q94_n252CliCod = new boolean[] {false} ;
      P07Q94_A2692ExHdrLin = new int[1] ;
      A2693ExHdrTip = "" ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A2748CliAlias = "" ;
      A279CliNom = "" ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      AV34TotKgsR = DecimalUtil.ZERO ;
      AV42BarCodPar = "" ;
      AV59BarUnimed = "" ;
      AV66Barenccli = "" ;
      AV26HojaRuta = "" ;
      AV47NomCli = "" ;
      AV54EXHDRFEE = GXutil.nullDate() ;
      GXv_date3 = new java.util.Date[1] ;
      AV55EXHDRKGE = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV56EXHDRMTE = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int6 = new short[1] ;
      AV39Sta = "" ;
      AV58TotMtsr = DecimalUtil.ZERO ;
      AV30DifKgs = DecimalUtil.ZERO ;
      AV31MerKgs = DecimalUtil.ZERO ;
      AV64SalExtFen = GXutil.nullDate() ;
      P07Q95_A396EmprCod = new String[] {""} ;
      P07Q95_A2248ManCod = new short[1] ;
      P07Q95_A130BarCodPar = new String[] {""} ;
      P07Q95_n130BarCodPar = new boolean[] {false} ;
      P07Q95_A132BarCodReo = new byte[1] ;
      P07Q95_n132BarCodReo = new boolean[] {false} ;
      P07Q95_A129BarCod = new int[1] ;
      P07Q95_n129BarCod = new boolean[] {false} ;
      P07Q95_A2253SalExtAlb = new int[1] ;
      P07Q95_A2262SalExtEsB = new byte[1] ;
      P07Q95_n2262SalExtEsB = new boolean[] {false} ;
      P07Q95_A11317SalExtFt = new java.util.Date[] {GXutil.nullDate()} ;
      P07Q95_n11317SalExtFt = new boolean[] {false} ;
      A11317SalExtFt = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV74Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.rexpr90__default(),
         new Object[] {
             new Object[] {
            P07Q92_A396EmprCod, P07Q92_A407EmprNom, P07Q92_n407EmprNom
            }
            , new Object[] {
            P07Q93_A396EmprCod, P07Q93_A2248ManCod, P07Q93_A2691ExHdrUln, P07Q93_n2691ExHdrUln, P07Q93_A2689ExHdrFas, P07Q93_A2249ManNom, P07Q93_n2249ManNom
            }
            , new Object[] {
            P07Q94_A396EmprCod, P07Q94_A2248ManCod, P07Q94_A2689ExHdrFas, P07Q94_A2693ExHdrTip, P07Q94_n2693ExHdrTip, P07Q94_A129BarCod, P07Q94_n129BarCod, P07Q94_A132BarCodReo, P07Q94_n132BarCodReo, P07Q94_A130BarCodPar,
            P07Q94_n130BarCodPar, P07Q94_A2694ExHdrAlb, P07Q94_n2694ExHdrAlb, P07Q94_A228BarUniMed, P07Q94_A143BarDisNum, P07Q94_A4812BarEncCli, P07Q94_A2748CliAlias, P07Q94_A279CliNom, P07Q94_A2845ExHdrMtR, P07Q94_n2845ExHdrMtR,
            P07Q94_A2700ExHdrFeR, P07Q94_n2700ExHdrFeR, P07Q94_A2698ExHdrKgR, P07Q94_n2698ExHdrKgR, P07Q94_A2699ExHdrCnR, P07Q94_n2699ExHdrCnR, P07Q94_A212BarSer, P07Q94_A252CliCod, P07Q94_n252CliCod, P07Q94_A2692ExHdrLin
            }
            , new Object[] {
            P07Q95_A396EmprCod, P07Q95_A2248ManCod, P07Q95_A130BarCodPar, P07Q95_A132BarCodReo, P07Q95_A129BarCod, P07Q95_A2253SalExtAlb, P07Q95_A2262SalExtEsB, P07Q95_n2262SalExtEsB, P07Q95_A11317SalExtFt, P07Q95_n11317SalExtFt
            }
         }
      );
      AV74Pgmname = "TrabajosExternos.REXPR90" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV69Pgmdesc = httpContext.getMessage( "INFORME TRABAJO EXTERNOS RECEPCION", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV74Pgmname = "TrabajosExternos.REXPR90" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV69Pgmdesc = httpContext.getMessage( "INFORME TRABAJO EXTERNOS RECEPCION", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV22Fuente ;
   private byte AV60Manf ;
   private byte AV61Fas ;
   private byte AV38FlagL ;
   private byte AV45FlagM ;
   private byte AV46FlagO ;
   private byte A132BarCodReo ;
   private byte AV41BarCodReo ;
   private byte AV44SalExtEsB ;
   private byte A2262SalExtEsB ;
   private short gxcookieaux ;
   private short AV15Pman ;
   private short AV16Uman2 ;
   private short A2248ManCod ;
   private short AV62ManCod ;
   private short A2699ExHdrCnR ;
   private short AV57EXHDRCNE ;
   private short GXv_int6[] ;
   private short AV35TotConR ;
   private short AV32DiasSer ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A2691ExHdrUln ;
   private int A129BarCod ;
   private int A2694ExHdrAlb ;
   private int A252CliCod ;
   private int A2692ExHdrLin ;
   private int AV40BarCod ;
   private int AV43SalExtAlb ;
   private int Gx_OldLine ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private java.math.BigDecimal AV34TotKgsR ;
   private java.math.BigDecimal AV55EXHDRKGE ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal AV56EXHDRMTE ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV58TotMtsr ;
   private java.math.BigDecimal AV30DifKgs ;
   private java.math.BigDecimal AV31MerKgs ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV19POpe ;
   private String AV20UOpe2 ;
   private String AV21TipPapel ;
   private String AV23Trab ;
   private String AV24ImpCod ;
   private String AV48Lit0 ;
   private String AV69Pgmdesc ;
   private String AV49Lit1 ;
   private String AV50Lit2 ;
   private String AV51Lit3 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV25NomEmp ;
   private String A2689ExHdrFas ;
   private String A2249ManNom ;
   private String AV52ManNom ;
   private String AV63Fascod ;
   private String AV53fasdsc ;
   private String GXv_char2[] ;
   private String A2693ExHdrTip ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A2748CliAlias ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String AV42BarCodPar ;
   private String AV59BarUnimed ;
   private String AV66Barenccli ;
   private String AV26HojaRuta ;
   private String AV47NomCli ;
   private String AV39Sta ;
   private String Gx_time ;
   private String AV74Pgmname ;
   private java.util.Date AV17PAlbFch ;
   private java.util.Date AV18UFecha2 ;
   private java.util.Date AV36FechaE ;
   private java.util.Date AV37FechaR ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date AV54EXHDRFEE ;
   private java.util.Date GXv_date3[] ;
   private java.util.Date AV64SalExtFen ;
   private java.util.Date A11317SalExtFt ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk7Q94 ;
   private boolean n2691ExHdrUln ;
   private boolean n2249ManNom ;
   private boolean brk7Q96 ;
   private boolean n2693ExHdrTip ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n2694ExHdrAlb ;
   private boolean n2845ExHdrMtR ;
   private boolean n2700ExHdrFeR ;
   private boolean n2698ExHdrKgR ;
   private boolean n2699ExHdrCnR ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n2262SalExtEsB ;
   private boolean n11317SalExtFt ;
   private IDataStoreProvider pr_default ;
   private String[] P07Q92_A396EmprCod ;
   private String[] P07Q92_A407EmprNom ;
   private boolean[] P07Q92_n407EmprNom ;
   private String[] P07Q93_A396EmprCod ;
   private short[] P07Q93_A2248ManCod ;
   private int[] P07Q93_A2691ExHdrUln ;
   private boolean[] P07Q93_n2691ExHdrUln ;
   private String[] P07Q93_A2689ExHdrFas ;
   private String[] P07Q93_A2249ManNom ;
   private boolean[] P07Q93_n2249ManNom ;
   private String[] P07Q94_A396EmprCod ;
   private short[] P07Q94_A2248ManCod ;
   private String[] P07Q94_A2689ExHdrFas ;
   private String[] P07Q94_A2693ExHdrTip ;
   private boolean[] P07Q94_n2693ExHdrTip ;
   private int[] P07Q94_A129BarCod ;
   private boolean[] P07Q94_n129BarCod ;
   private byte[] P07Q94_A132BarCodReo ;
   private boolean[] P07Q94_n132BarCodReo ;
   private String[] P07Q94_A130BarCodPar ;
   private boolean[] P07Q94_n130BarCodPar ;
   private int[] P07Q94_A2694ExHdrAlb ;
   private boolean[] P07Q94_n2694ExHdrAlb ;
   private String[] P07Q94_A228BarUniMed ;
   private String[] P07Q94_A143BarDisNum ;
   private String[] P07Q94_A4812BarEncCli ;
   private String[] P07Q94_A2748CliAlias ;
   private String[] P07Q94_A279CliNom ;
   private java.math.BigDecimal[] P07Q94_A2845ExHdrMtR ;
   private boolean[] P07Q94_n2845ExHdrMtR ;
   private java.util.Date[] P07Q94_A2700ExHdrFeR ;
   private boolean[] P07Q94_n2700ExHdrFeR ;
   private java.math.BigDecimal[] P07Q94_A2698ExHdrKgR ;
   private boolean[] P07Q94_n2698ExHdrKgR ;
   private short[] P07Q94_A2699ExHdrCnR ;
   private boolean[] P07Q94_n2699ExHdrCnR ;
   private String[] P07Q94_A212BarSer ;
   private int[] P07Q94_A252CliCod ;
   private boolean[] P07Q94_n252CliCod ;
   private int[] P07Q94_A2692ExHdrLin ;
   private String[] P07Q95_A396EmprCod ;
   private short[] P07Q95_A2248ManCod ;
   private String[] P07Q95_A130BarCodPar ;
   private boolean[] P07Q95_n130BarCodPar ;
   private byte[] P07Q95_A132BarCodReo ;
   private boolean[] P07Q95_n132BarCodReo ;
   private int[] P07Q95_A129BarCod ;
   private boolean[] P07Q95_n129BarCod ;
   private int[] P07Q95_A2253SalExtAlb ;
   private byte[] P07Q95_A2262SalExtEsB ;
   private boolean[] P07Q95_n2262SalExtEsB ;
   private java.util.Date[] P07Q95_A11317SalExtFt ;
   private boolean[] P07Q95_n11317SalExtFt ;
}

final  class rexpr90__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07Q93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV15Pman ,
                                          short AV16Uman2 ,
                                          String AV19POpe ,
                                          String AV20UOpe2 ,
                                          short A2248ManCod ,
                                          String A2689ExHdrFas ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[5];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ManCod, T1.ExHdrUln, T1.ExHdrFas, T2.ManNom FROM (TXPCEXMVH T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV15Pman) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( ! (0==AV16Uman2) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19POpe)==0) )
      {
         addWhere(sWhereString, "(T1.ExHdrFas >= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV20UOpe2)==0) )
      {
         addWhere(sWhereString, "(T1.ExHdrFas <= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ManCod, T1.ExHdrFas" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P07Q94( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV17PAlbFch ,
                                          java.util.Date AV18UFecha2 ,
                                          java.util.Date A2700ExHdrFeR ,
                                          String A396EmprCod ,
                                          short A2248ManCod ,
                                          String A2689ExHdrFas )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[5];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ManCod, T1.ExHdrFas, T1.ExHdrTip, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ExHdrAlb, T2.BarUniMed, T2.BarDisNum, T2.BarEncCli, T3.CliAlias," ;
      scmdbuf += " T3.CliNom, T1.ExHdrMtR, T1.ExHdrFeR, T1.ExHdrKgR, T1.ExHdrCnR, T2.BarSer, T2.CliCod, T1.ExHdrLin FROM ((TXPLEXMVH T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ManCod = ?)");
      addWhere(sWhereString, "(T1.ExHdrFas = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17PAlbFch)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeR >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18UFecha2)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeR <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ExHdrTip" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P07Q95( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV15Pman ,
                                          short AV16Uman2 ,
                                          short A2248ManCod ,
                                          String A396EmprCod ,
                                          int AV43SalExtAlb ,
                                          int AV40BarCod ,
                                          byte AV41BarCodReo ,
                                          String AV42BarCodPar ,
                                          int A2253SalExtAlb ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[7];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ManCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExtAlb, T1.SalExtEsB, T1.SalExtFt FROM (TXPLEXTSA T1 INNER JOIN TXPCEXTSA T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.SalExtAlb = T1.SalExtAlb)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SalExtAlb = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV15Pman) )
      {
         addWhere(sWhereString, "(T2.ManCod >= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (0==AV16Uman2) )
      {
         addWhere(sWhereString, "(T2.ManCod <= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P07Q93(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 2 :
                  return conditional_P07Q94(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] );
            case 3 :
                  return conditional_P07Q95(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07Q92", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07Q93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07Q94", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07Q95", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((String[]) buf[14])[0] = rslt.getString(10, 8);
               ((String[]) buf[15])[0] = rslt.getString(11, 20);
               ((String[]) buf[16])[0] = rslt.getString(12, 16);
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((int[]) buf[27])[0] = rslt.getInt(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(20);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

