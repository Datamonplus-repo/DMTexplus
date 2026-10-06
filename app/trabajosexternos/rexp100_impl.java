package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rexp100_impl extends GXWebReport
{
   public rexp100_impl( com.genexus.internet.HttpContext context )
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
            AV73Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
            AV74Clicod2 = (int)(GXutil.lval( httpContext.GetPar( "Clicod2"))) ;
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
         /* Using cursor P07P92 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07P92_A407EmprNom[0] ;
            n407EmprNom = P07P92_n407EmprNom[0] ;
            AV64EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_int1 = AV71Enc20c ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int2) ;
         rexp100_impl.this.GXt_int1 = GXv_int2[0] ;
         AV71Enc20c = GXt_int1 ;
         GXt_char3 = AV72Lit10 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1098_", ""), (byte)(99), GXv_char4) ;
         rexp100_impl.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV72Lit10 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "20ENCO01", ""), (byte)(99), GXv_char6) ;
         rexp100_impl.this.GXt_char5 = GXv_char6[0] ;
         AV72Lit10 = ((AV71Enc20c==0) ? GXt_char3 : GXt_char5) ;
         AV69Tit1 = httpContext.getMessage( "Articulo", "") ;
         GXt_int1 = AV70Erfoc ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
         rexp100_impl.this.GXt_int1 = GXv_int2[0] ;
         AV70Erfoc = GXt_int1 ;
         if ( AV70Erfoc == 1 )
         {
            AV69Tit1 = httpContext.getMessage( "Articulo                   Modelo", "") ;
         }
         AV38FlagL = (byte)(0) ;
         AV45FlagM = (byte)(0) ;
         AV36FechaE = GXutil.nullDate() ;
         AV37FechaR = GXutil.nullDate() ;
         AV46FlagO = (byte)(0) ;
         AV34TotKgsR = DecimalUtil.ZERO ;
         AV68ManCod = (short)(0) ;
         GxHdr3 = true ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Short.valueOf(AV15Pman) ,
                                              Short.valueOf(AV16Uman2) ,
                                              AV19POpe ,
                                              AV20UOpe2 ,
                                              AV17PAlbFch ,
                                              AV18UFecha2 ,
                                              Integer.valueOf(AV73Clicod1) ,
                                              Integer.valueOf(AV74Clicod2) ,
                                              Short.valueOf(A2248ManCod) ,
                                              A2689ExHdrFas ,
                                              A2697ExHdrFeE ,
                                              Integer.valueOf(A252CliCod) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         /* Using cursor P07P93 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV15Pman), Short.valueOf(AV16Uman2), AV19POpe, AV20UOpe2, AV17PAlbFch, AV18UFecha2, Integer.valueOf(AV73Clicod1), Integer.valueOf(AV74Clicod2)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2694ExHdrAlb = P07P93_A2694ExHdrAlb[0] ;
            n2694ExHdrAlb = P07P93_n2694ExHdrAlb[0] ;
            A2249ManNom = P07P93_A2249ManNom[0] ;
            n2249ManNom = P07P93_n2249ManNom[0] ;
            A143BarDisNum = P07P93_A143BarDisNum[0] ;
            A4812BarEncCli = P07P93_A4812BarEncCli[0] ;
            A2697ExHdrFeE = P07P93_A2697ExHdrFeE[0] ;
            n2697ExHdrFeE = P07P93_n2697ExHdrFeE[0] ;
            A2748CliAlias = P07P93_A2748CliAlias[0] ;
            A279CliNom = P07P93_A279CliNom[0] ;
            A2695ExHdrKgE = P07P93_A2695ExHdrKgE[0] ;
            n2695ExHdrKgE = P07P93_n2695ExHdrKgE[0] ;
            A2844ExHdrMtE = P07P93_A2844ExHdrMtE[0] ;
            n2844ExHdrMtE = P07P93_n2844ExHdrMtE[0] ;
            A1652BarSerDsc = P07P93_A1652BarSerDsc[0] ;
            A2696ExHdrCnE = P07P93_A2696ExHdrCnE[0] ;
            n2696ExHdrCnE = P07P93_n2696ExHdrCnE[0] ;
            A212BarSer = P07P93_A212BarSer[0] ;
            A252CliCod = P07P93_A252CliCod[0] ;
            n252CliCod = P07P93_n252CliCod[0] ;
            A4609BarMdlCod = P07P93_A4609BarMdlCod[0] ;
            A2700ExHdrFeR = P07P93_A2700ExHdrFeR[0] ;
            n2700ExHdrFeR = P07P93_n2700ExHdrFeR[0] ;
            A2845ExHdrMtR = P07P93_A2845ExHdrMtR[0] ;
            n2845ExHdrMtR = P07P93_n2845ExHdrMtR[0] ;
            A2698ExHdrKgR = P07P93_A2698ExHdrKgR[0] ;
            n2698ExHdrKgR = P07P93_n2698ExHdrKgR[0] ;
            A2699ExHdrCnR = P07P93_A2699ExHdrCnR[0] ;
            n2699ExHdrCnR = P07P93_n2699ExHdrCnR[0] ;
            A2693ExHdrTip = P07P93_A2693ExHdrTip[0] ;
            n2693ExHdrTip = P07P93_n2693ExHdrTip[0] ;
            A130BarCodPar = P07P93_A130BarCodPar[0] ;
            n130BarCodPar = P07P93_n130BarCodPar[0] ;
            A132BarCodReo = P07P93_A132BarCodReo[0] ;
            n132BarCodReo = P07P93_n132BarCodReo[0] ;
            A129BarCod = P07P93_A129BarCod[0] ;
            n129BarCod = P07P93_n129BarCod[0] ;
            A2689ExHdrFas = P07P93_A2689ExHdrFas[0] ;
            A2248ManCod = P07P93_A2248ManCod[0] ;
            A2692ExHdrLin = P07P93_A2692ExHdrLin[0] ;
            A143BarDisNum = P07P93_A143BarDisNum[0] ;
            A4812BarEncCli = P07P93_A4812BarEncCli[0] ;
            A1652BarSerDsc = P07P93_A1652BarSerDsc[0] ;
            A212BarSer = P07P93_A212BarSer[0] ;
            A252CliCod = P07P93_A252CliCod[0] ;
            n252CliCod = P07P93_n252CliCod[0] ;
            A4609BarMdlCod = P07P93_A4609BarMdlCod[0] ;
            A2748CliAlias = P07P93_A2748CliAlias[0] ;
            A279CliNom = P07P93_A279CliNom[0] ;
            A2249ManNom = P07P93_A2249ManNom[0] ;
            n2249ManNom = P07P93_n2249ManNom[0] ;
            AV26HojaRuta = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            if ( ( GXutil.strcmp(AV26HojaRuta, AV56LastHdr) != 0 ) && ( GXutil.strcmp(AV56LastHdr, " ") != 0 ) )
            {
               /* Execute user subroutine: 'DIF' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
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
            AV40BarCod = A129BarCod ;
            AV41BarCodReo = A132BarCodReo ;
            AV42BarCodPar = A130BarCodPar ;
            AV43SalExtAlb = A2694ExHdrAlb ;
            /* Execute user subroutine: 'LEOSTA' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
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
            GXv_char6[0] = AV53fasdsc ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A2689ExHdrFas, GXv_char6) ;
            rexp100_impl.this.AV53fasdsc = GXv_char6[0] ;
            AV65Ctrl_1 = GXutil.str( A2248ManCod, 4, 0) + A2689ExHdrFas + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            if ( ( ( GXutil.strcmp(AV23Trab, httpContext.getMessage( "A", "")) == 0 ) && ( ( AV44SalExtEsB == 1 ) || (0==AV44SalExtEsB) ) ) || ( ( GXutil.strcmp(AV23Trab, httpContext.getMessage( "C", "")) == 0 ) && ( AV44SalExtEsB == 2 ) ) || ( ( GXutil.strcmp(AV23Trab, httpContext.getMessage( "T", "")) == 0 ) ) )
            {
               if ( AV68ManCod != A2248ManCod )
               {
                  h7P90( false, 15) ;
                  getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")), 10, Gx_line+1, 32, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2249ManNom, "")), 36, Gx_line+1, 193, Gx_line+15, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
               }
               AV67Enccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
               if ( GXutil.strcmp(A2693ExHdrTip, httpContext.getMessage( "E", "")) == 0 )
               {
                  AV36FechaE = A2697ExHdrFeE ;
                  if ( ! (GXutil.strcmp("", A2748CliAlias)==0) )
                  {
                     AV47NomCli = A2748CliAlias ;
                  }
                  else
                  {
                     AV47NomCli = GXutil.substring( A279CliNom, 1, 15) ;
                  }
                  AV54EXHDRKGE = A2695ExHdrKgE ;
                  AV55EXHDRMTE = A2844ExHdrMtE ;
                  if ( AV70Erfoc == 0 )
                  {
                     h7P90( false, 14) ;
                     getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53fasdsc, "")), 5, Gx_line+0, 84, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26HojaRuta, "")), 94, Gx_line+0, 152, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Enccli, "")), 156, Gx_line+0, 235, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 240, Gx_line+0, 272, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47NomCli, "")), 272, Gx_line+0, 351, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 365, Gx_line+0, 449, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2696ExHdrCnE), "ZZZ9")), 641, Gx_line+0, 663, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2695ExHdrKgE, "ZZZZZ9.99")), 667, Gx_line+0, 715, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2844ExHdrMtE, "ZZZZZ9.99")), 719, Gx_line+0, 767, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A2697ExHdrFeE, "99/99/99"), 771, Gx_line+0, 814, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 453, Gx_line+0, 589, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2694ExHdrAlb), "ZZZZZZZ9")), 594, Gx_line+0, 637, Gx_line+14, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+14) ;
                  }
                  else
                  {
                     h7P90( false, 14) ;
                     getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53fasdsc, "")), 5, Gx_line+0, 84, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26HojaRuta, "")), 94, Gx_line+0, 152, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Enccli, "")), 156, Gx_line+0, 235, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 240, Gx_line+0, 272, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47NomCli, "")), 272, Gx_line+0, 351, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2696ExHdrCnE), "ZZZ9")), 641, Gx_line+0, 663, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2695ExHdrKgE, "ZZZZZ9.99")), 667, Gx_line+0, 715, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2844ExHdrMtE, "ZZZZZ9.99")), 719, Gx_line+0, 767, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A2697ExHdrFeE, "99/99/99"), 771, Gx_line+0, 814, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 365, Gx_line+0, 501, Gx_line+14, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2694ExHdrAlb), "ZZZZZZZ9")), 594, Gx_line+0, 637, Gx_line+14, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4609BarMdlCod, "")), 505, Gx_line+0, 574, Gx_line+14, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+14) ;
                  }
               }
               else
               {
                  h7P90( false, 15) ;
                  getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53fasdsc, "")), 5, Gx_line+0, 84, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26HojaRuta, "")), 94, Gx_line+0, 152, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Enccli, "")), 156, Gx_line+0, 235, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 240, Gx_line+0, 272, Gx_line+14, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47NomCli, "")), 272, Gx_line+0, 351, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 365, Gx_line+0, 449, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2699ExHdrCnR), "ZZZ9")), 823, Gx_line+1, 845, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2698ExHdrKgR, "ZZZZZ9.99")), 849, Gx_line+0, 897, Gx_line+14, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2845ExHdrMtR, "ZZZZZ9.99")), 901, Gx_line+0, 949, Gx_line+14, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A2700ExHdrFeR, "99/99/99"), 953, Gx_line+0, 996, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2694ExHdrAlb), "ZZZZZZZ9")), 594, Gx_line+0, 637, Gx_line+14, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 453, Gx_line+0, 589, Gx_line+14, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
                  AV38FlagL = (byte)(1) ;
                  AV37FechaR = A2700ExHdrFeR ;
                  AV34TotKgsR = AV34TotKgsR.add(A2698ExHdrKgR) ;
                  AV35TotConR = (short)(AV35TotConR+A2699ExHdrCnR) ;
               }
            }
            AV57ExHdrTip = A2693ExHdrTip ;
            AV56LastHdr = AV26HojaRuta ;
            AV66Ctrl_2 = GXutil.str( A2248ManCod, 4, 0) + A2689ExHdrFas + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV68ManCod = A2248ManCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7P90( true, 0) ;
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
      /* 'DIF' Routine */
      returnInSub = false ;
      AV30DifKgs = DecimalUtil.ZERO ;
      AV31MerKgs = DecimalUtil.ZERO ;
      AV32DiasSer = (short)(0) ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TotKgsR)==0) )
      {
         AV30DifKgs = AV54EXHDRKGE.subtract(AV34TotKgsR) ;
         AV31MerKgs = ((AV34TotKgsR.subtract(AV54EXHDRKGE)).divide(AV54EXHDRKGE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         AV32DiasSer = (short)(GXutil.ddiff(AV37FechaR,AV36FechaE)) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TotKgsR)==0) )
      {
         h7P90( false, 14) ;
         getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30DifKgs, "ZZZZZ9.99")), 1010, Gx_line+0, 1058, Gx_line+14, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31MerKgs, "ZZ9.99")), 1068, Gx_line+0, 1100, Gx_line+14, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32DiasSer), "ZZ9")), 1115, Gx_line+0, 1132, Gx_line+14, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+14) ;
      }
      AV34TotKgsR = DecimalUtil.doubleToDec(0) ;
      AV35TotConR = (short)(0) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'LEOSTA' Routine */
      returnInSub = false ;
      AV39Sta = "" ;
      AV44SalExtEsB = (byte)(0) ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV15Pman) ,
                                           Short.valueOf(AV16Uman2) ,
                                           Integer.valueOf(AV73Clicod1) ,
                                           Integer.valueOf(AV74Clicod2) ,
                                           Short.valueOf(A2248ManCod) ,
                                           Integer.valueOf(A252CliCod) ,
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
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P07P94 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV43SalExtAlb), Integer.valueOf(AV40BarCod), Byte.valueOf(AV41BarCodReo), AV42BarCodPar, Short.valueOf(AV15Pman), Short.valueOf(AV16Uman2), Integer.valueOf(AV73Clicod1), Integer.valueOf(AV74Clicod2)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2248ManCod = P07P94_A2248ManCod[0] ;
         A252CliCod = P07P94_A252CliCod[0] ;
         n252CliCod = P07P94_n252CliCod[0] ;
         A130BarCodPar = P07P94_A130BarCodPar[0] ;
         n130BarCodPar = P07P94_n130BarCodPar[0] ;
         A132BarCodReo = P07P94_A132BarCodReo[0] ;
         n132BarCodReo = P07P94_n132BarCodReo[0] ;
         A129BarCod = P07P94_A129BarCod[0] ;
         n129BarCod = P07P94_n129BarCod[0] ;
         A2253SalExtAlb = P07P94_A2253SalExtAlb[0] ;
         A2255SalExtObs1 = P07P94_A2255SalExtObs1[0] ;
         n2255SalExtObs1 = P07P94_n2255SalExtObs1[0] ;
         A2262SalExtEsB = P07P94_A2262SalExtEsB[0] ;
         n2262SalExtEsB = P07P94_n2262SalExtEsB[0] ;
         A252CliCod = P07P94_A252CliCod[0] ;
         n252CliCod = P07P94_n252CliCod[0] ;
         A2248ManCod = P07P94_A2248ManCod[0] ;
         AV44SalExtEsB = A2262SalExtEsB ;
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
      pr_default.close(2);
   }

   public void h7P90( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64EmprNom, "")), 5, Gx_line+13, 162, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 5, Gx_line+63, 27, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 94, Gx_line+63, 111, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 240, Gx_line+63, 277, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(5, Gx_line+75, 83, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(94, Gx_line+75, 151, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(156, Gx_line+75, 208, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(240, Gx_line+75, 356, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(365, Gx_line+75, 585, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pzs", ""), 646, Gx_line+63, 663, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 698, Gx_line+63, 715, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mts", ""), 750, Gx_line+63, 767, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(641, Gx_line+75, 662, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(667, Gx_line+75, 714, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(719, Gx_line+75, 766, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 786, Gx_line+63, 813, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(771, Gx_line+75, 813, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Envio", ""), 714, Gx_line+50, 741, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(641, Gx_line+55, 689, Gx_line+55, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(765, Gx_line+55, 813, Gx_line+55, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(5, Gx_line+50, 1131, Gx_line+50, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pzs", ""), 828, Gx_line+63, 845, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 880, Gx_line+63, 897, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mts", ""), 932, Gx_line+63, 949, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(823, Gx_line+75, 844, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(849, Gx_line+75, 896, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(901, Gx_line+75, 948, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 969, Gx_line+63, 996, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(953, Gx_line+75, 995, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Recepcion", ""), 885, Gx_line+50, 933, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(823, Gx_line+55, 871, Gx_line+55, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(947, Gx_line+55, 995, Gx_line+55, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dif", ""), 1026, Gx_line+50, 1043, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 1026, Gx_line+63, 1043, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1010, Gx_line+75, 1057, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("%", 1080, Gx_line+50, 1086, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Merma", ""), 1070, Gx_line+63, 1097, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1068, Gx_line+75, 1099, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dias", ""), 1113, Gx_line+63, 1135, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1113, Gx_line+75, 1134, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Pgmdesc, "")), 5, Gx_line+35, 162, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1021, Gx_line+35, 1053, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 1010, Gx_line+13, 1053, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1057, Gx_line+13, 1100, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Albar.", ""), 594, Gx_line+63, 637, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(594, Gx_line+75, 636, Gx_line+75, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Trab, "")), 167, Gx_line+35, 173, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Pgmname, "")), 675, Gx_line+33, 832, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 995, Gx_line+35, 1017, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tit1, "")), 365, Gx_line+63, 574, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit10, "")), 156, Gx_line+63, 209, Gx_line+77, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+81) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      scmdbuf = "" ;
      P07P92_A396EmprCod = new String[] {""} ;
      P07P92_A407EmprNom = new String[] {""} ;
      P07P92_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV64EmprNom = "" ;
      AV72Lit10 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char5 = "" ;
      AV69Tit1 = "" ;
      GXv_int2 = new byte[1] ;
      AV36FechaE = GXutil.nullDate() ;
      AV37FechaR = GXutil.nullDate() ;
      AV34TotKgsR = DecimalUtil.ZERO ;
      A2689ExHdrFas = "" ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      P07P93_A396EmprCod = new String[] {""} ;
      P07P93_A2694ExHdrAlb = new int[1] ;
      P07P93_n2694ExHdrAlb = new boolean[] {false} ;
      P07P93_A2249ManNom = new String[] {""} ;
      P07P93_n2249ManNom = new boolean[] {false} ;
      P07P93_A143BarDisNum = new String[] {""} ;
      P07P93_A4812BarEncCli = new String[] {""} ;
      P07P93_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P07P93_n2697ExHdrFeE = new boolean[] {false} ;
      P07P93_A2748CliAlias = new String[] {""} ;
      P07P93_A279CliNom = new String[] {""} ;
      P07P93_A2695ExHdrKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07P93_n2695ExHdrKgE = new boolean[] {false} ;
      P07P93_A2844ExHdrMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07P93_n2844ExHdrMtE = new boolean[] {false} ;
      P07P93_A1652BarSerDsc = new String[] {""} ;
      P07P93_A2696ExHdrCnE = new short[1] ;
      P07P93_n2696ExHdrCnE = new boolean[] {false} ;
      P07P93_A212BarSer = new String[] {""} ;
      P07P93_A252CliCod = new int[1] ;
      P07P93_n252CliCod = new boolean[] {false} ;
      P07P93_A4609BarMdlCod = new String[] {""} ;
      P07P93_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P07P93_n2700ExHdrFeR = new boolean[] {false} ;
      P07P93_A2845ExHdrMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07P93_n2845ExHdrMtR = new boolean[] {false} ;
      P07P93_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07P93_n2698ExHdrKgR = new boolean[] {false} ;
      P07P93_A2699ExHdrCnR = new short[1] ;
      P07P93_n2699ExHdrCnR = new boolean[] {false} ;
      P07P93_A2693ExHdrTip = new String[] {""} ;
      P07P93_n2693ExHdrTip = new boolean[] {false} ;
      P07P93_A130BarCodPar = new String[] {""} ;
      P07P93_n130BarCodPar = new boolean[] {false} ;
      P07P93_A132BarCodReo = new byte[1] ;
      P07P93_n132BarCodReo = new boolean[] {false} ;
      P07P93_A129BarCod = new int[1] ;
      P07P93_n129BarCod = new boolean[] {false} ;
      P07P93_A2689ExHdrFas = new String[] {""} ;
      P07P93_A2248ManCod = new short[1] ;
      P07P93_A2692ExHdrLin = new int[1] ;
      A2249ManNom = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A2748CliAlias = "" ;
      A279CliNom = "" ;
      A2695ExHdrKgE = DecimalUtil.ZERO ;
      A2844ExHdrMtE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A4609BarMdlCod = "" ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      A2693ExHdrTip = "" ;
      A130BarCodPar = "" ;
      AV26HojaRuta = "" ;
      AV56LastHdr = "" ;
      AV42BarCodPar = "" ;
      AV53fasdsc = "" ;
      GXv_char6 = new String[1] ;
      AV65Ctrl_1 = "" ;
      AV67Enccli = "" ;
      AV47NomCli = "" ;
      AV54EXHDRKGE = DecimalUtil.ZERO ;
      AV55EXHDRMTE = DecimalUtil.ZERO ;
      AV57ExHdrTip = "" ;
      AV66Ctrl_2 = "" ;
      AV30DifKgs = DecimalUtil.ZERO ;
      AV31MerKgs = DecimalUtil.ZERO ;
      AV39Sta = "" ;
      P07P94_A396EmprCod = new String[] {""} ;
      P07P94_A2248ManCod = new short[1] ;
      P07P94_A252CliCod = new int[1] ;
      P07P94_n252CliCod = new boolean[] {false} ;
      P07P94_A130BarCodPar = new String[] {""} ;
      P07P94_n130BarCodPar = new boolean[] {false} ;
      P07P94_A132BarCodReo = new byte[1] ;
      P07P94_n132BarCodReo = new boolean[] {false} ;
      P07P94_A129BarCod = new int[1] ;
      P07P94_n129BarCod = new boolean[] {false} ;
      P07P94_A2253SalExtAlb = new int[1] ;
      P07P94_A2255SalExtObs1 = new String[] {""} ;
      P07P94_n2255SalExtObs1 = new boolean[] {false} ;
      P07P94_A2262SalExtEsB = new byte[1] ;
      P07P94_n2262SalExtEsB = new boolean[] {false} ;
      A2255SalExtObs1 = "" ;
      AV79Pgmdesc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV83Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.rexp100__default(),
         new Object[] {
             new Object[] {
            P07P92_A396EmprCod, P07P92_A407EmprNom, P07P92_n407EmprNom
            }
            , new Object[] {
            P07P93_A396EmprCod, P07P93_A2694ExHdrAlb, P07P93_n2694ExHdrAlb, P07P93_A2249ManNom, P07P93_n2249ManNom, P07P93_A143BarDisNum, P07P93_A4812BarEncCli, P07P93_A2697ExHdrFeE, P07P93_n2697ExHdrFeE, P07P93_A2748CliAlias,
            P07P93_A279CliNom, P07P93_A2695ExHdrKgE, P07P93_n2695ExHdrKgE, P07P93_A2844ExHdrMtE, P07P93_n2844ExHdrMtE, P07P93_A1652BarSerDsc, P07P93_A2696ExHdrCnE, P07P93_n2696ExHdrCnE, P07P93_A212BarSer, P07P93_A252CliCod,
            P07P93_n252CliCod, P07P93_A4609BarMdlCod, P07P93_A2700ExHdrFeR, P07P93_n2700ExHdrFeR, P07P93_A2845ExHdrMtR, P07P93_n2845ExHdrMtR, P07P93_A2698ExHdrKgR, P07P93_n2698ExHdrKgR, P07P93_A2699ExHdrCnR, P07P93_n2699ExHdrCnR,
            P07P93_A2693ExHdrTip, P07P93_n2693ExHdrTip, P07P93_A130BarCodPar, P07P93_n130BarCodPar, P07P93_A132BarCodReo, P07P93_n132BarCodReo, P07P93_A129BarCod, P07P93_n129BarCod, P07P93_A2689ExHdrFas, P07P93_A2248ManCod,
            P07P93_A2692ExHdrLin
            }
            , new Object[] {
            P07P94_A396EmprCod, P07P94_A2248ManCod, P07P94_A252CliCod, P07P94_n252CliCod, P07P94_A130BarCodPar, P07P94_A132BarCodReo, P07P94_A129BarCod, P07P94_A2253SalExtAlb, P07P94_A2255SalExtObs1, P07P94_n2255SalExtObs1,
            P07P94_A2262SalExtEsB, P07P94_n2262SalExtEsB
            }
         }
      );
      AV83Pgmname = "TrabajosExternos.REXP100" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV79Pgmdesc = httpContext.getMessage( "INFORME TRABAJOS EXTERNOS", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV83Pgmname = "TrabajosExternos.REXP100" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV79Pgmdesc = httpContext.getMessage( "INFORME TRABAJOS EXTERNOS", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV22Fuente ;
   private byte AV71Enc20c ;
   private byte AV70Erfoc ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
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
   private short AV68ManCod ;
   private short A2248ManCod ;
   private short A2696ExHdrCnE ;
   private short A2699ExHdrCnR ;
   private short AV35TotConR ;
   private short AV32DiasSer ;
   private short Gx_err ;
   private int AV73Clicod1 ;
   private int AV74Clicod2 ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A2694ExHdrAlb ;
   private int A129BarCod ;
   private int A2692ExHdrLin ;
   private int AV40BarCod ;
   private int AV43SalExtAlb ;
   private int Gx_OldLine ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal AV34TotKgsR ;
   private java.math.BigDecimal A2695ExHdrKgE ;
   private java.math.BigDecimal A2844ExHdrMtE ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private java.math.BigDecimal AV54EXHDRKGE ;
   private java.math.BigDecimal AV55EXHDRMTE ;
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
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV64EmprNom ;
   private String AV72Lit10 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char5 ;
   private String AV69Tit1 ;
   private String A2689ExHdrFas ;
   private String A2249ManNom ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A2748CliAlias ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A4609BarMdlCod ;
   private String A2693ExHdrTip ;
   private String A130BarCodPar ;
   private String AV26HojaRuta ;
   private String AV56LastHdr ;
   private String AV42BarCodPar ;
   private String AV53fasdsc ;
   private String GXv_char6[] ;
   private String AV65Ctrl_1 ;
   private String AV67Enccli ;
   private String AV47NomCli ;
   private String AV57ExHdrTip ;
   private String AV66Ctrl_2 ;
   private String AV39Sta ;
   private String A2255SalExtObs1 ;
   private String AV79Pgmdesc ;
   private String Gx_time ;
   private String AV83Pgmname ;
   private java.util.Date AV17PAlbFch ;
   private java.util.Date AV18UFecha2 ;
   private java.util.Date AV36FechaE ;
   private java.util.Date AV37FechaR ;
   private java.util.Date A2697ExHdrFeE ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n2694ExHdrAlb ;
   private boolean n2249ManNom ;
   private boolean n2697ExHdrFeE ;
   private boolean n2695ExHdrKgE ;
   private boolean n2844ExHdrMtE ;
   private boolean n2696ExHdrCnE ;
   private boolean n252CliCod ;
   private boolean n2700ExHdrFeR ;
   private boolean n2845ExHdrMtR ;
   private boolean n2698ExHdrKgR ;
   private boolean n2699ExHdrCnR ;
   private boolean n2693ExHdrTip ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean returnInSub ;
   private boolean n2255SalExtObs1 ;
   private boolean n2262SalExtEsB ;
   private IDataStoreProvider pr_default ;
   private String[] P07P92_A396EmprCod ;
   private String[] P07P92_A407EmprNom ;
   private boolean[] P07P92_n407EmprNom ;
   private String[] P07P93_A396EmprCod ;
   private int[] P07P93_A2694ExHdrAlb ;
   private boolean[] P07P93_n2694ExHdrAlb ;
   private String[] P07P93_A2249ManNom ;
   private boolean[] P07P93_n2249ManNom ;
   private String[] P07P93_A143BarDisNum ;
   private String[] P07P93_A4812BarEncCli ;
   private java.util.Date[] P07P93_A2697ExHdrFeE ;
   private boolean[] P07P93_n2697ExHdrFeE ;
   private String[] P07P93_A2748CliAlias ;
   private String[] P07P93_A279CliNom ;
   private java.math.BigDecimal[] P07P93_A2695ExHdrKgE ;
   private boolean[] P07P93_n2695ExHdrKgE ;
   private java.math.BigDecimal[] P07P93_A2844ExHdrMtE ;
   private boolean[] P07P93_n2844ExHdrMtE ;
   private String[] P07P93_A1652BarSerDsc ;
   private short[] P07P93_A2696ExHdrCnE ;
   private boolean[] P07P93_n2696ExHdrCnE ;
   private String[] P07P93_A212BarSer ;
   private int[] P07P93_A252CliCod ;
   private boolean[] P07P93_n252CliCod ;
   private String[] P07P93_A4609BarMdlCod ;
   private java.util.Date[] P07P93_A2700ExHdrFeR ;
   private boolean[] P07P93_n2700ExHdrFeR ;
   private java.math.BigDecimal[] P07P93_A2845ExHdrMtR ;
   private boolean[] P07P93_n2845ExHdrMtR ;
   private java.math.BigDecimal[] P07P93_A2698ExHdrKgR ;
   private boolean[] P07P93_n2698ExHdrKgR ;
   private short[] P07P93_A2699ExHdrCnR ;
   private boolean[] P07P93_n2699ExHdrCnR ;
   private String[] P07P93_A2693ExHdrTip ;
   private boolean[] P07P93_n2693ExHdrTip ;
   private String[] P07P93_A130BarCodPar ;
   private boolean[] P07P93_n130BarCodPar ;
   private byte[] P07P93_A132BarCodReo ;
   private boolean[] P07P93_n132BarCodReo ;
   private int[] P07P93_A129BarCod ;
   private boolean[] P07P93_n129BarCod ;
   private String[] P07P93_A2689ExHdrFas ;
   private short[] P07P93_A2248ManCod ;
   private int[] P07P93_A2692ExHdrLin ;
   private String[] P07P94_A396EmprCod ;
   private short[] P07P94_A2248ManCod ;
   private int[] P07P94_A252CliCod ;
   private boolean[] P07P94_n252CliCod ;
   private String[] P07P94_A130BarCodPar ;
   private boolean[] P07P94_n130BarCodPar ;
   private byte[] P07P94_A132BarCodReo ;
   private boolean[] P07P94_n132BarCodReo ;
   private int[] P07P94_A129BarCod ;
   private boolean[] P07P94_n129BarCod ;
   private int[] P07P94_A2253SalExtAlb ;
   private String[] P07P94_A2255SalExtObs1 ;
   private boolean[] P07P94_n2255SalExtObs1 ;
   private byte[] P07P94_A2262SalExtEsB ;
   private boolean[] P07P94_n2262SalExtEsB ;
}

final  class rexp100__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07P93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV15Pman ,
                                          short AV16Uman2 ,
                                          String AV19POpe ,
                                          String AV20UOpe2 ,
                                          java.util.Date AV17PAlbFch ,
                                          java.util.Date AV18UFecha2 ,
                                          int AV73Clicod1 ,
                                          int AV74Clicod2 ,
                                          short A2248ManCod ,
                                          String A2689ExHdrFas ,
                                          java.util.Date A2697ExHdrFeE ,
                                          int A252CliCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[9];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ExHdrAlb, T4.ManNom, T2.BarDisNum, T2.BarEncCli, T1.ExHdrFeE, T3.CliAlias, T3.CliNom, T1.ExHdrKgE, T1.ExHdrMtE, T2.BarSerDsc, T1.ExHdrCnE," ;
      scmdbuf += " T2.BarSer, T2.CliCod, T2.BarMdlCod, T1.ExHdrFeR, T1.ExHdrMtR, T1.ExHdrKgR, T1.ExHdrCnR, T1.ExHdrTip, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.ExHdrFas, T1.ManCod," ;
      scmdbuf += " T1.ExHdrLin FROM (((TXPLEXMVH T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMANUFA T4 ON T4.EmprCod = T1.EmprCod AND T4.ManCod = T1.ManCod)" ;
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
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17PAlbFch)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeE >= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18UFecha2)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeE <= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (0==AV73Clicod1) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (0==AV74Clicod2) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ManCod, T1.ExHdrFas, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ExHdrTip" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P07P94( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV15Pman ,
                                          short AV16Uman2 ,
                                          int AV73Clicod1 ,
                                          int AV74Clicod2 ,
                                          short A2248ManCod ,
                                          int A252CliCod ,
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
      byte[] GXv_int9 = new byte[9];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.ManCod, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExtAlb, T1.SalExtObs1, T1.SalExtEsB FROM ((TXPLEXTSA T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCEXTSA T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.SalExtAlb = T1.SalExtAlb)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SalExtAlb = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV15Pman) )
      {
         addWhere(sWhereString, "(T3.ManCod >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV16Uman2) )
      {
         addWhere(sWhereString, "(T3.ManCod <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV73Clicod1) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV74Clicod2) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P07P93(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P07P94(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07P92", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07P93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07P94", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((int[]) buf[19])[0] = rslt.getInt(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 13);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(22);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(23);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(24, 8);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((int[]) buf[40])[0] = rslt.getInt(26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
      }
   }

}

