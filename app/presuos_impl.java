package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class presuos_impl extends GXWebReport
{
   public presuos_impl( com.genexus.internet.HttpContext context )
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
         n396EmprCod = false ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV65CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            AV66BarEncCli = httpContext.GetPar( "BarEncCli") ;
            AV55PBarCod = (int)(GXutil.lval( httpContext.GetPar( "PBarCod"))) ;
            AV57PBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "PBarCodReo"))) ;
            AV56PBarCodPar = httpContext.GetPar( "PBarCodPar") ;
            AV58UBarCod = (int)(GXutil.lval( httpContext.GetPar( "UBarCod"))) ;
            AV63UBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "UBarCodReo"))) ;
            AV61UBarCodPar = httpContext.GetPar( "UBarCodPar") ;
            AV25ImpCod = httpContext.GetPar( "ImpCod") ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
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
      M_bot = 3 ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV20ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRCVT", ""), GXv_char1) ;
         presuos_impl.this.AV20ContDsc = GXv_char1[0] ;
         GXt_char2 = AV26Station ;
         GXv_char1[0] = GXt_char2 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
         presuos_impl.this.GXt_char2 = GXv_char1[0] ;
         AV26Station = GXt_char2 ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = AV23EmprNom ;
         GXv_char4[0] = AV24UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char1, GXv_char3, GXv_char4) ;
         presuos_impl.this.A396EmprCod = GXv_char1[0] ;
         presuos_impl.this.AV23EmprNom = GXv_char3[0] ;
         presuos_impl.this.AV24UsurCod = GXv_char4[0] ;
         /* Using cursor P05MT2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05MT2_A407EmprNom[0] ;
            n407EmprNom = P05MT2_n407EmprNom[0] ;
            AV23EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_char2 = AV22Termin ;
         GXv_char4[0] = GXt_char2 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
         presuos_impl.this.GXt_char2 = GXv_char4[0] ;
         AV22Termin = GXt_char2 ;
         /* Using cursor P05MT3 */
         pr_default.execute(1, new Object[] {AV22Termin, Boolean.valueOf(n396EmprCod), A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A942TermCod = P05MT3_A942TermCod[0] ;
            A1189TermUsu = P05MT3_A1189TermUsu[0] ;
            n1189TermUsu = P05MT3_n1189TermUsu[0] ;
            AV21TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV27TotKgs = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P05MT5 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV65CliCod), AV66BarEncCli, Integer.valueOf(AV55PBarCod), AV56PBarCodPar, Byte.valueOf(AV57PBarCodReo), Integer.valueOf(AV58UBarCod), AV61UBarCodPar, Byte.valueOf(AV63UBarCodReo)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk5MT4 = false ;
            A833TipDefCod = P05MT5_A833TipDefCod[0] ;
            n833TipDefCod = P05MT5_n833TipDefCod[0] ;
            A252CliCod = P05MT5_A252CliCod[0] ;
            n252CliCod = P05MT5_n252CliCod[0] ;
            A4812BarEncCli = P05MT5_A4812BarEncCli[0] ;
            A1652BarSerDsc = P05MT5_A1652BarSerDsc[0] ;
            A361DisCod = P05MT5_A361DisCod[0] ;
            A834TipDefDsc = P05MT5_A834TipDefDsc[0] ;
            n834TipDefDsc = P05MT5_n834TipDefDsc[0] ;
            A148BarEstReo = P05MT5_A148BarEstReo[0] ;
            A4466BarAcaAnh = P05MT5_A4466BarAcaAnh[0] ;
            A5291BarTipCor = P05MT5_A5291BarTipCor[0] ;
            A3030BarPlf = P05MT5_A3030BarPlf[0] ;
            A2829BarProPer = P05MT5_A2829BarProPer[0] ;
            A11852Nxt_ArtCl2 = P05MT5_A11852Nxt_ArtCl2[0] ;
            A11850Nxt_Mdlo2 = P05MT5_A11850Nxt_Mdlo2[0] ;
            A11851Nxt_Sta2 = P05MT5_A11851Nxt_Sta2[0] ;
            A217BarTipArt = P05MT5_A217BarTipArt[0] ;
            n217BarTipArt = P05MT5_n217BarTipArt[0] ;
            A1909BarGraAca = P05MT5_A1909BarGraAca[0] ;
            A125BarAncAca1 = P05MT5_A125BarAncAca1[0] ;
            A135BarColNom = P05MT5_A135BarColNom[0] ;
            A1234BarNomCli = P05MT5_A1234BarNomCli[0] ;
            A155BarFecCli = P05MT5_A155BarFecCli[0] ;
            A279CliNom = P05MT5_A279CliNom[0] ;
            A4348DisUsrCod = P05MT5_A4348DisUsrCod[0] ;
            A159BarFecGen = P05MT5_A159BarFecGen[0] ;
            A11662BarOrdComp = P05MT5_A11662BarOrdComp[0] ;
            A1503BarPart = P05MT5_A1503BarPart[0] ;
            A9777BarItem3 = P05MT5_A9777BarItem3[0] ;
            A132BarCodReo = P05MT5_A132BarCodReo[0] ;
            A130BarCodPar = P05MT5_A130BarCodPar[0] ;
            A129BarCod = P05MT5_A129BarCod[0] ;
            A212BarSer = P05MT5_A212BarSer[0] ;
            A184BarMtr = P05MT5_A184BarMtr[0] ;
            A166BarKgm = P05MT5_A166BarKgm[0] ;
            A4348DisUsrCod = P05MT5_A4348DisUsrCod[0] ;
            A834TipDefDsc = P05MT5_A834TipDefDsc[0] ;
            n834TipDefDsc = P05MT5_n834TipDefDsc[0] ;
            A279CliNom = P05MT5_A279CliNom[0] ;
            A184BarMtr = P05MT5_A184BarMtr[0] ;
            A166BarKgm = P05MT5_A166BarKgm[0] ;
            AV48BarCod = A129BarCod ;
            AV49BarCodReo = A132BarCodReo ;
            AV50barCodPar = A130BarCodPar ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P05MT5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05MT5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P05MT5_A4812BarEncCli[0], A4812BarEncCli) == 0 ) )
            {
               brk5MT4 = false ;
               A833TipDefCod = P05MT5_A833TipDefCod[0] ;
               n833TipDefCod = P05MT5_n833TipDefCod[0] ;
               A1652BarSerDsc = P05MT5_A1652BarSerDsc[0] ;
               A361DisCod = P05MT5_A361DisCod[0] ;
               A834TipDefDsc = P05MT5_A834TipDefDsc[0] ;
               n834TipDefDsc = P05MT5_n834TipDefDsc[0] ;
               A148BarEstReo = P05MT5_A148BarEstReo[0] ;
               A4466BarAcaAnh = P05MT5_A4466BarAcaAnh[0] ;
               A5291BarTipCor = P05MT5_A5291BarTipCor[0] ;
               A3030BarPlf = P05MT5_A3030BarPlf[0] ;
               A2829BarProPer = P05MT5_A2829BarProPer[0] ;
               A11852Nxt_ArtCl2 = P05MT5_A11852Nxt_ArtCl2[0] ;
               A11850Nxt_Mdlo2 = P05MT5_A11850Nxt_Mdlo2[0] ;
               A11851Nxt_Sta2 = P05MT5_A11851Nxt_Sta2[0] ;
               A217BarTipArt = P05MT5_A217BarTipArt[0] ;
               n217BarTipArt = P05MT5_n217BarTipArt[0] ;
               A1909BarGraAca = P05MT5_A1909BarGraAca[0] ;
               A125BarAncAca1 = P05MT5_A125BarAncAca1[0] ;
               A135BarColNom = P05MT5_A135BarColNom[0] ;
               A1234BarNomCli = P05MT5_A1234BarNomCli[0] ;
               A155BarFecCli = P05MT5_A155BarFecCli[0] ;
               A279CliNom = P05MT5_A279CliNom[0] ;
               A4348DisUsrCod = P05MT5_A4348DisUsrCod[0] ;
               A159BarFecGen = P05MT5_A159BarFecGen[0] ;
               A11662BarOrdComp = P05MT5_A11662BarOrdComp[0] ;
               A1503BarPart = P05MT5_A1503BarPart[0] ;
               A9777BarItem3 = P05MT5_A9777BarItem3[0] ;
               A132BarCodReo = P05MT5_A132BarCodReo[0] ;
               A130BarCodPar = P05MT5_A130BarCodPar[0] ;
               A129BarCod = P05MT5_A129BarCod[0] ;
               A212BarSer = P05MT5_A212BarSer[0] ;
               A4348DisUsrCod = P05MT5_A4348DisUsrCod[0] ;
               A834TipDefDsc = P05MT5_A834TipDefDsc[0] ;
               n834TipDefDsc = P05MT5_n834TipDefDsc[0] ;
               A279CliNom = P05MT5_A279CliNom[0] ;
               if ( A252CliCod == AV65CliCod )
               {
                  if ( GXutil.strcmp(A4812BarEncCli, AV66BarEncCli) == 0 )
                  {
                     if ( A129BarCod >= AV55PBarCod )
                     {
                        if ( GXutil.strcmp(A130BarCodPar, AV56PBarCodPar) >= 0 )
                        {
                           if ( A132BarCodReo >= AV57PBarCodReo )
                           {
                              if ( A129BarCod <= AV58UBarCod )
                              {
                                 if ( GXutil.strcmp(A130BarCodPar, AV61UBarCodPar) <= 0 )
                                 {
                                    if ( A132BarCodReo <= AV63UBarCodReo )
                                    {
                                       /* Using cursor P05MT7 */
                                       pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                       if ( (pr_default.getStatus(3) != 101) )
                                       {
                                          A184BarMtr = P05MT7_A184BarMtr[0] ;
                                          A166BarKgm = P05MT7_A166BarKgm[0] ;
                                       }
                                       else
                                       {
                                          A184BarMtr = DecimalUtil.doubleToDec(0) ;
                                          A166BarKgm = DecimalUtil.doubleToDec(0) ;
                                       }
                                       pr_default.close(3);
                                       GxHdr6 = true ;
                                       while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P05MT5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05MT5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P05MT5_A4812BarEncCli[0], A4812BarEncCli) == 0 ) && ( P05MT5_A1503BarPart[0] == A1503BarPart ) )
                                       {
                                          brk5MT4 = false ;
                                          A833TipDefCod = P05MT5_A833TipDefCod[0] ;
                                          n833TipDefCod = P05MT5_n833TipDefCod[0] ;
                                          A1652BarSerDsc = P05MT5_A1652BarSerDsc[0] ;
                                          A361DisCod = P05MT5_A361DisCod[0] ;
                                          A834TipDefDsc = P05MT5_A834TipDefDsc[0] ;
                                          n834TipDefDsc = P05MT5_n834TipDefDsc[0] ;
                                          A148BarEstReo = P05MT5_A148BarEstReo[0] ;
                                          A4466BarAcaAnh = P05MT5_A4466BarAcaAnh[0] ;
                                          A5291BarTipCor = P05MT5_A5291BarTipCor[0] ;
                                          A3030BarPlf = P05MT5_A3030BarPlf[0] ;
                                          A2829BarProPer = P05MT5_A2829BarProPer[0] ;
                                          A11852Nxt_ArtCl2 = P05MT5_A11852Nxt_ArtCl2[0] ;
                                          A11850Nxt_Mdlo2 = P05MT5_A11850Nxt_Mdlo2[0] ;
                                          A11851Nxt_Sta2 = P05MT5_A11851Nxt_Sta2[0] ;
                                          A217BarTipArt = P05MT5_A217BarTipArt[0] ;
                                          n217BarTipArt = P05MT5_n217BarTipArt[0] ;
                                          A1909BarGraAca = P05MT5_A1909BarGraAca[0] ;
                                          A125BarAncAca1 = P05MT5_A125BarAncAca1[0] ;
                                          A135BarColNom = P05MT5_A135BarColNom[0] ;
                                          A1234BarNomCli = P05MT5_A1234BarNomCli[0] ;
                                          A155BarFecCli = P05MT5_A155BarFecCli[0] ;
                                          A279CliNom = P05MT5_A279CliNom[0] ;
                                          A4348DisUsrCod = P05MT5_A4348DisUsrCod[0] ;
                                          A159BarFecGen = P05MT5_A159BarFecGen[0] ;
                                          A11662BarOrdComp = P05MT5_A11662BarOrdComp[0] ;
                                          A9777BarItem3 = P05MT5_A9777BarItem3[0] ;
                                          A132BarCodReo = P05MT5_A132BarCodReo[0] ;
                                          A130BarCodPar = P05MT5_A130BarCodPar[0] ;
                                          A129BarCod = P05MT5_A129BarCod[0] ;
                                          A212BarSer = P05MT5_A212BarSer[0] ;
                                          A4348DisUsrCod = P05MT5_A4348DisUsrCod[0] ;
                                          A834TipDefDsc = P05MT5_A834TipDefDsc[0] ;
                                          n834TipDefDsc = P05MT5_n834TipDefDsc[0] ;
                                          A279CliNom = P05MT5_A279CliNom[0] ;
                                          if ( A252CliCod == AV65CliCod )
                                          {
                                             if ( GXutil.strcmp(A4812BarEncCli, AV66BarEncCli) == 0 )
                                             {
                                                if ( A129BarCod >= AV55PBarCod )
                                                {
                                                   if ( GXutil.strcmp(A130BarCodPar, AV56PBarCodPar) >= 0 )
                                                   {
                                                      if ( A132BarCodReo >= AV57PBarCodReo )
                                                      {
                                                         if ( A129BarCod <= AV58UBarCod )
                                                         {
                                                            if ( GXutil.strcmp(A130BarCodPar, AV61UBarCodPar) <= 0 )
                                                            {
                                                               if ( A132BarCodReo <= AV63UBarCodReo )
                                                               {
                                                                  /* Using cursor P05MT9 */
                                                                  pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                                  if ( (pr_default.getStatus(4) != 101) )
                                                                  {
                                                                     A184BarMtr = P05MT9_A184BarMtr[0] ;
                                                                     A166BarKgm = P05MT9_A166BarKgm[0] ;
                                                                  }
                                                                  else
                                                                  {
                                                                     A184BarMtr = DecimalUtil.doubleToDec(0) ;
                                                                     A166BarKgm = DecimalUtil.doubleToDec(0) ;
                                                                  }
                                                                  pr_default.close(4);
                                                                  if ( ( A166BarKgm.doubleValue() == 0 ) && ( A184BarMtr.doubleValue() == 0 ) )
                                                                  {
                                                                  }
                                                                  else
                                                                  {
                                                                     AV34Procenom = " " ;
                                                                     /* Using cursor P05MT10 */
                                                                     pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                                     while ( (pr_default.getStatus(5) != 101) )
                                                                     {
                                                                        A203BarPieKil = P05MT10_A203BarPieKil[0] ;
                                                                        A44AlbRecCod = P05MT10_A44AlbRecCod[0] ;
                                                                        A200BarPieCod = P05MT10_A200BarPieCod[0] ;
                                                                        AV36Albreccod = A44AlbRecCod ;
                                                                        /* Execute user subroutine: 'PROCEDENCIA' */
                                                                        S121 ();
                                                                        if ( returnInSub )
                                                                        {
                                                                           pr_default.close(5);
                                                                           pr_default.close(4);
                                                                           pr_default.close(3);
                                                                           pr_default.close(2);
                                                                           pr_default.close(2);
                                                                           pr_default.close(2);
                                                                           pr_default.close(2);
                                                                           pr_default.close(2);
                                                                           getPrinter().GxEndPage() ;
                                                                           /* Close printer file */
                                                                           getPrinter().GxEndDocument() ;
                                                                           endPrinter();
                                                                           returnInSub = true;
                                                                           cleanup();
                                                                           if (true) return;
                                                                        }
                                                                        pr_default.readNext(5);
                                                                     }
                                                                     pr_default.close(5);
                                                                     /* Execute user subroutine: 'NOTREC' */
                                                                     S131 ();
                                                                     if ( returnInSub )
                                                                     {
                                                                        pr_default.close(4);
                                                                        pr_default.close(3);
                                                                        pr_default.close(2);
                                                                        pr_default.close(2);
                                                                        pr_default.close(2);
                                                                        pr_default.close(2);
                                                                        pr_default.close(2);
                                                                        getPrinter().GxEndPage() ;
                                                                        /* Close printer file */
                                                                        getPrinter().GxEndDocument() ;
                                                                        endPrinter();
                                                                        returnInSub = true;
                                                                        cleanup();
                                                                        if (true) return;
                                                                     }
                                                                     AV42Remonta = ((A148BarEstReo==0) ? " " : ((A148BarEstReo==1) ? GXutil.substring( A834TipDefDsc, 1, 15) : GXutil.substring( A834TipDefDsc, 1, 15)+httpContext.getMessage( " O.S. Anterior ", "")+GXutil.str( AV51NR_BARCODA, 8, 0))) ;
                                                                     AV47TxtRC = ((A148BarEstReo==2) ? httpContext.getMessage( "DEVOLUÇÃO", "") : ((A148BarEstReo==1) ? httpContext.getMessage( "NÃO CONFORMIDADE", "") : "")) ;
                                                                     GXv_char4[0] = A396EmprCod ;
                                                                     GXv_int5[0] = A252CliCod ;
                                                                     GXv_int6[0] = A4466BarAcaAnh ;
                                                                     GXv_char3[0] = AV16Tb1_dscfb ;
                                                                     new app.pptable2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
                                                                     presuos_impl.this.A396EmprCod = GXv_char4[0] ;
                                                                     presuos_impl.this.A252CliCod = GXv_int5[0] ;
                                                                     presuos_impl.this.A4466BarAcaAnh = GXv_int6[0] ;
                                                                     presuos_impl.this.AV16Tb1_dscfb = GXv_char3[0] ;
                                                                     AV10DisEnt = GXutil.substring( AV16Tb1_dscfb, 1, 30) ;
                                                                     AV28Exportacion = ((GXutil.strcmp(A5291BarTipCor, httpContext.getMessage( "SI", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NAO", "")) ;
                                                                     AV29Muestras = ((GXutil.strcmp(A3030BarPlf, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "AMOSTRAS", "") : "") ;
                                                                     AV19Cod_Idtx = A2829BarProPer ;
                                                                     /* Execute user subroutine: 'INDITEX' */
                                                                     S111 ();
                                                                     if ( returnInSub )
                                                                     {
                                                                        pr_default.close(4);
                                                                        pr_default.close(3);
                                                                        pr_default.close(2);
                                                                        pr_default.close(2);
                                                                        pr_default.close(2);
                                                                        pr_default.close(2);
                                                                        pr_default.close(2);
                                                                        getPrinter().GxEndPage() ;
                                                                        /* Close printer file */
                                                                        getPrinter().GxEndDocument() ;
                                                                        endPrinter();
                                                                        returnInSub = true;
                                                                        cleanup();
                                                                        if (true) return;
                                                                     }
                                                                     GX_I = 1 ;
                                                                     while ( GX_I <= 10 )
                                                                     {
                                                                        AV31Tab_norma[GX_I-1] = " " ;
                                                                        GX_I = (int)(GX_I+1) ;
                                                                     }
                                                                     GX_I = 1 ;
                                                                     while ( GX_I <= 10 )
                                                                     {
                                                                        AV33Tab_normanc[GX_I-1] = " " ;
                                                                        GX_I = (int)(GX_I+1) ;
                                                                     }
                                                                     GX_I = 1 ;
                                                                     while ( GX_I <= 10 )
                                                                     {
                                                                        AV32Tab_normast[GX_I-1] = " " ;
                                                                        GX_I = (int)(GX_I+1) ;
                                                                     }
                                                                     GX_I = 1 ;
                                                                     while ( GX_I <= 5 )
                                                                     {
                                                                        AV43tab_nc[GX_I-1] = "" ;
                                                                        GX_I = (int)(GX_I+1) ;
                                                                     }
                                                                     AV35j = (byte)(1) ;
                                                                     GX_I = 1 ;
                                                                     while ( GX_I <= 5 )
                                                                     {
                                                                        AV39Tab_normas[GX_I-1] = " " ;
                                                                        GX_I = (int)(GX_I+1) ;
                                                                     }
                                                                     /* Using cursor P05MT11 */
                                                                     pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
                                                                     while ( (pr_default.getStatus(6) != 101) )
                                                                     {
                                                                        A13216DisNormDsc = P05MT11_A13216DisNormDsc[0] ;
                                                                        n13216DisNormDsc = P05MT11_n13216DisNormDsc[0] ;
                                                                        A13215DisNormNC = P05MT11_A13215DisNormNC[0] ;
                                                                        A13214DisNormSt = P05MT11_A13214DisNormSt[0] ;
                                                                        A13213DisNormID = P05MT11_A13213DisNormID[0] ;
                                                                        A13216DisNormDsc = P05MT11_A13216DisNormDsc[0] ;
                                                                        n13216DisNormDsc = P05MT11_n13216DisNormDsc[0] ;
                                                                        if ( AV35j <= 5 )
                                                                        {
                                                                           AV31Tab_norma[AV35j-1] = GXutil.substring( A13216DisNormDsc, 1, 15) ;
                                                                           AV33Tab_normanc[AV35j-1] = ((GXutil.strcmp(A13215DisNormNC, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                                                                           AV32Tab_normast[AV35j-1] = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                                                                           AV43tab_nc[AV35j-1] = httpContext.getMessage( "N/Conforme", "") ;
                                                                           AV40Norma = GXutil.substring( A13216DisNormDsc, 1, 15) ;
                                                                           AV41status = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                                                                           AV39Tab_normas[AV35j-1] = GXutil.padr( GXutil.trim( AV40Norma), 15, " ") + " " + AV41status + " " + httpContext.getMessage( "N/Conforme?: ", "") + ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
                                                                        }
                                                                        AV35j = (byte)(AV35j+1) ;
                                                                        pr_default.readNext(6);
                                                                     }
                                                                     pr_default.close(6);
                                                                     AV30Nxt_artcl2 = ((GXutil.strcmp(GXutil.trim( A11852Nxt_ArtCl2), httpContext.getMessage( "Sem Definir", ""))==0) ? " " : A11852Nxt_ArtCl2) ;
                                                                     AV37lista = ((GXutil.strcmp("", A11850Nxt_Mdlo2)==0) ? httpContext.getMessage( "NAO", "") : GXutil.substring( A11850Nxt_Mdlo2, 1, 3)) ;
                                                                     AV38relatorio = ((GXutil.strcmp("", A11851Nxt_Sta2)==0) ? httpContext.getMessage( "NAO", "") : GXutil.substring( A11851Nxt_Sta2, 1, 3)) ;
                                                                     AV17i = (short)(1) ;
                                                                     GX_I = 1 ;
                                                                     while ( GX_I <= 10 )
                                                                     {
                                                                        AV12Tab_obs[GX_I-1] = "" ;
                                                                        GX_I = (int)(GX_I+1) ;
                                                                     }
                                                                     /* Using cursor P05MT12 */
                                                                     pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
                                                                     while ( (pr_default.getStatus(7) != 101) )
                                                                     {
                                                                        A377DisObsTxt = P05MT12_A377DisObsTxt[0] ;
                                                                        A376DisObsLin = P05MT12_A376DisObsLin[0] ;
                                                                        if ( AV17i > 4 )
                                                                        {
                                                                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                                           if (true) break;
                                                                        }
                                                                        AV12Tab_obs[AV17i-1] = A377DisObsTxt ;
                                                                        AV17i = (short)(AV17i+1) ;
                                                                        pr_default.readNext(7);
                                                                     }
                                                                     pr_default.close(7);
                                                                     AV8Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                                                     GXt_char2 = AV13TipArtDsc ;
                                                                     GXv_char4[0] = GXt_char2 ;
                                                                     new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char4) ;
                                                                     presuos_impl.this.GXt_char2 = GXv_char4[0] ;
                                                                     AV13TipArtDsc = GXt_char2 ;
                                                                     AV14Bargraaca = A1909BarGraAca ;
                                                                     AV15Barancaca1 = A125BarAncAca1 ;
                                                                     AV46BarColNom = A135BarColNom ;
                                                                     AV45BarNomcli = A1234BarNomCli ;
                                                                     h5MT0( false, 43) ;
                                                                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 23, Gx_line+22, 59, Gx_line+38, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 425, Gx_line+22, 472, Gx_line+38, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "Un", ""), 501, Gx_line+22, 518, Gx_line+38, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 563, Gx_line+22, 587, Gx_line+38, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "Mts", ""), 634, Gx_line+22, 657, Gx_line+38, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "gr/m2", ""), 688, Gx_line+22, 723, Gx_line+38, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "Largura", ""), 735, Gx_line+22, 783, Gx_line+38, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxDrawLine(23, Gx_line+38, 294, Gx_line+38, 1, 0, 0, 0, 0) ;
                                                                     getPrinter().GxDrawLine(419, Gx_line+38, 477, Gx_line+38, 1, 0, 0, 0, 0) ;
                                                                     getPrinter().GxDrawLine(488, Gx_line+38, 532, Gx_line+38, 1, 0, 0, 0, 0) ;
                                                                     getPrinter().GxDrawLine(538, Gx_line+38, 604, Gx_line+38, 1, 0, 0, 0, 0) ;
                                                                     getPrinter().GxDrawLine(613, Gx_line+38, 679, Gx_line+38, 1, 0, 0, 0, 0) ;
                                                                     getPrinter().GxDrawLine(688, Gx_line+38, 722, Gx_line+38, 1, 0, 0, 0, 0) ;
                                                                     getPrinter().GxDrawLine(735, Gx_line+38, 782, Gx_line+38, 1, 0, 0, 0, 0) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "O. Serviço Nº", ""), 22, Gx_line+0, 99, Gx_line+16, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Hdr, "")), 109, Gx_line+0, 167, Gx_line+17, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                     getPrinter().GxDrawText(httpContext.getMessage( "Localização", ""), 339, Gx_line+23, 411, Gx_line+37, 0+256, 0, 0, 0) ;
                                                                     getPrinter().GxDrawLine(339, Gx_line+38, 411, Gx_line+38, 1, 0, 0, 0, 0) ;
                                                                     Gx_OldLine = Gx_line ;
                                                                     Gx_line = (int)(Gx_line+43) ;
                                                                     AV18Inicio = (byte)(0) ;
                                                                     /* Using cursor P05MT13 */
                                                                     pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                                     while ( (pr_default.getStatus(8) != 101) )
                                                                     {
                                                                        A44AlbRecCod = P05MT13_A44AlbRecCod[0] ;
                                                                        A205BarPieMet = P05MT13_A205BarPieMet[0] ;
                                                                        A203BarPieKil = P05MT13_A203BarPieKil[0] ;
                                                                        A1501BarPiePie = P05MT13_A1501BarPiePie[0] ;
                                                                        A200BarPieCod = P05MT13_A200BarPieCod[0] ;
                                                                        AV36Albreccod = A44AlbRecCod ;
                                                                        /* Execute user subroutine: 'LOCALIZACION' */
                                                                        S141 ();
                                                                        if ( returnInSub )
                                                                        {
                                                                           pr_default.close(8);
                                                                           pr_default.close(4);
                                                                           pr_default.close(3);
                                                                           pr_default.close(2);
                                                                           pr_default.close(2);
                                                                           pr_default.close(2);
                                                                           pr_default.close(2);
                                                                           pr_default.close(2);
                                                                           getPrinter().GxEndPage() ;
                                                                           /* Close printer file */
                                                                           getPrinter().GxEndDocument() ;
                                                                           endPrinter();
                                                                           returnInSub = true;
                                                                           cleanup();
                                                                           if (true) return;
                                                                        }
                                                                        if ( AV18Inicio == 0 )
                                                                        {
                                                                           h5MT0( false, 17) ;
                                                                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 22, Gx_line+0, 106, Gx_line+17, 0+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 109, Gx_line+0, 245, Gx_line+17, 0+256, 0, 0, 0) ;
                                                                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 418, Gx_line+0, 476, Gx_line+16, 2, 0, 0, 0) ;
                                                                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 486, Gx_line+0, 531, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 536, Gx_line+0, 603, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 611, Gx_line+0, 678, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Bargraaca), "ZZZ9")), 690, Gx_line+0, 720, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Barancaca1), "ZZ9")), 753, Gx_line+0, 776, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Localizacion, "")), 344, Gx_line+1, 408, Gx_line+18, 0+256, 0, 0, 0) ;
                                                                           Gx_OldLine = Gx_line ;
                                                                           Gx_line = (int)(Gx_line+17) ;
                                                                           AV18Inicio = (byte)(1) ;
                                                                        }
                                                                        else
                                                                        {
                                                                           h5MT0( false, 16) ;
                                                                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 418, Gx_line+0, 476, Gx_line+16, 2, 0, 0, 0) ;
                                                                           getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 486, Gx_line+0, 531, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 536, Gx_line+0, 603, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")), 611, Gx_line+0, 678, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Bargraaca), "ZZZ9")), 690, Gx_line+0, 720, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Barancaca1), "ZZ9")), 753, Gx_line+0, 776, Gx_line+17, 2+256, 0, 0, 0) ;
                                                                           getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Localizacion, "")), 344, Gx_line+0, 408, Gx_line+17, 0+256, 0, 0, 0) ;
                                                                           Gx_OldLine = Gx_line ;
                                                                           Gx_line = (int)(Gx_line+16) ;
                                                                        }
                                                                        pr_default.readNext(8);
                                                                     }
                                                                     pr_default.close(8);
                                                                     h5MT0( false, 9) ;
                                                                     getPrinter().GxDrawLine(15, Gx_line+5, 779, Gx_line+5, 1, 0, 0, 0, 0) ;
                                                                     Gx_OldLine = Gx_line ;
                                                                     Gx_line = (int)(Gx_line+9) ;
                                                                     /* Using cursor P05MT14 */
                                                                     pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                                     while ( (pr_default.getStatus(9) != 101) )
                                                                     {
                                                                        A460FasDsc = P05MT14_A460FasDsc[0] ;
                                                                        A457FasCod = P05MT14_A457FasCod[0] ;
                                                                        A194BarOrdLin = P05MT14_A194BarOrdLin[0] ;
                                                                        A758ProCod = P05MT14_A758ProCod[0] ;
                                                                        A460FasDsc = P05MT14_A460FasDsc[0] ;
                                                                        h5MT0( false, 17) ;
                                                                        getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                                                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 66, Gx_line+0, 124, Gx_line+16, 0, 0, 0, 0) ;
                                                                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 141, Gx_line+0, 345, Gx_line+16, 0, 0, 0, 0) ;
                                                                        Gx_OldLine = Gx_line ;
                                                                        Gx_line = (int)(Gx_line+17) ;
                                                                        pr_default.readNext(9);
                                                                     }
                                                                     pr_default.close(9);
                                                                     h5MT0( false, 9) ;
                                                                     getPrinter().GxDrawLine(15, Gx_line+5, 779, Gx_line+5, 1, 0, 0, 0, 0) ;
                                                                     Gx_OldLine = Gx_line ;
                                                                     Gx_line = (int)(Gx_line+9) ;
                                                                     AV27TotKgs = AV27TotKgs.add(A166BarKgm) ;
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                          brk5MT4 = true ;
                                          pr_default.readNext(2);
                                       }
                                       GxHdr6 = false ;
                                       if ( AV27TotKgs.doubleValue() > 0 )
                                       {
                                          h5MT0( false, 27) ;
                                          getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(httpContext.getMessage( "Total:", ""), 626, Gx_line+7, 661, Gx_line+21, 0+256, 0, 0, 0) ;
                                          getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TotKgs, "ZZZZZZ9.99")), 675, Gx_line+6, 749, Gx_line+23, 2+256, 0, 0, 0) ;
                                          getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(httpContext.getMessage( "kgs", ""), 758, Gx_line+7, 780, Gx_line+21, 0+256, 0, 0, 0) ;
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(Gx_line+27) ;
                                          AV27TotKgs = DecimalUtil.doubleToDec(0) ;
                                          /* Eject command */
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(P_lines+1) ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               if ( ! brk5MT4 )
               {
                  brk5MT4 = true ;
                  pr_default.readNext(2);
               }
            }
            if ( ! brk5MT4 )
            {
               brk5MT4 = true ;
               pr_default.readNext(2);
            }
         }
         pr_default.close(2);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5MT0( true, 0) ;
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
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P05MT15 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, AV19Cod_Idtx});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A10887Cod_Idtx = P05MT15_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P05MT15_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P05MT15_n10888Dsc_Idtx[0] ;
         AV11Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PROCEDENCIA' Routine */
      returnInSub = false ;
      AV34Procenom = " " ;
      /* Using cursor P05MT16 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV36Albreccod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A970ProceCod = P05MT16_A970ProceCod[0] ;
         n970ProceCod = P05MT16_n970ProceCod[0] ;
         A44AlbRecCod = P05MT16_A44AlbRecCod[0] ;
         A971ProceNom = P05MT16_A971ProceNom[0] ;
         n971ProceNom = P05MT16_n971ProceNom[0] ;
         A971ProceNom = P05MT16_A971ProceNom[0] ;
         n971ProceNom = P05MT16_n971ProceNom[0] ;
         AV34Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'NOTREC' Routine */
      returnInSub = false ;
      AV51NR_BARCODA = 0 ;
      AV52NR_BARREOA = (byte)(0) ;
      AV53NR_BARPARA = "" ;
      AV54Nr_codigo = 0 ;
      /* Using cursor P05MT17 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV36Albreccod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A5206Nr_albrecc = P05MT17_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P05MT17_n5206Nr_albrecc[0] ;
         A5222Nr_barcoda = P05MT17_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P05MT17_n5222Nr_barcoda[0] ;
         A5223Nr_barreoa = P05MT17_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P05MT17_n5223Nr_barreoa[0] ;
         A5224Nr_barpara = P05MT17_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P05MT17_n5224Nr_barpara[0] ;
         A5198Nr_codigo = P05MT17_A5198Nr_codigo[0] ;
         AV51NR_BARCODA = A5222Nr_barcoda ;
         AV52NR_BARREOA = A5223Nr_barreoa ;
         AV53NR_BARPARA = A5224Nr_barpara ;
         AV54Nr_codigo = A5198Nr_codigo ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'LOCALIZACION' Routine */
      returnInSub = false ;
      AV64Localizacion = "" ;
      /* Using cursor P05MT18 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV36Albreccod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A44AlbRecCod = P05MT18_A44AlbRecCod[0] ;
         A50AlbRLoc = P05MT18_A50AlbRLoc[0] ;
         AV64Localizacion = A50AlbRLoc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void h5MT0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20ContDsc, "")), 24, Gx_line+1, 170, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 636, Gx_line+1, 663, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 668, Gx_line+1, 713, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 724, Gx_line+1, 783, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 717, Gx_line+1, 721, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
            if ( GxHdr6 )
            {
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 15, Gx_line+16, 241, Gx_line+76) ;
               getPrinter().GxDrawLine(15, Gx_line+81, 779, Gx_line+81, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "IQ", ""), 681, Gx_line+35, 695, Gx_line+51, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia Interna", ""), 652, Gx_line+51, 723, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(577, Gx_line+16, 778, Gx_line+16, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 653, Gx_line+102, 684, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 692, Gx_line+102, 743, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Emissão:", ""), 629, Gx_line+134, 684, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4348DisUsrCod, "")), 692, Gx_line+134, 785, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Muestras, "")), 604, Gx_line+193, 772, Gx_line+214, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Remonta, "")), 246, Gx_line+57, 648, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(21, Gx_line+109, 516, Gx_line+212, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 26, Gx_line+118, 71, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 107, Gx_line+117, 158, Gx_line+137, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 226, Gx_line+115, 508, Gx_line+139, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Pedida:", ""), 26, Gx_line+139, 101, Gx_line+155, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 107, Gx_line+138, 166, Gx_line+158, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Talao:", ""), 26, Gx_line+159, 77, Gx_line+175, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 107, Gx_line+158, 254, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 26, Gx_line+180, 51, Gx_line+196, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45BarNomcli, "")), 264, Gx_line+179, 360, Gx_line+199, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46BarColNom, "")), 107, Gx_line+179, 203, Gx_line+199, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 18, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TxtRC, "")), 556, Gx_line+157, 786, Gx_line+186, 1+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+226) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Clear to Wear:", ""), 25, Gx_line+13, 110, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exportaçao:", ""), 25, Gx_line+34, 97, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Nxt_artcl2, "")), 117, Gx_line+33, 337, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Dsc_Idtx, "")), 117, Gx_line+11, 300, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc Cliente:", ""), 25, Gx_line+56, 110, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9777BarItem3, "")), 117, Gx_line+55, 264, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº da Partida:", ""), 25, Gx_line+78, 105, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9")), 117, Gx_line+77, 151, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 25, Gx_line+122, 67, Gx_line+138, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10DisEnt, "")), 117, Gx_line+121, 337, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "P.O.:", ""), 25, Gx_line+150, 51, Gx_line+166, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11662BarOrdComp, "")), 117, Gx_line+148, 469, Gx_line+164, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Malheiro:", ""), 25, Gx_line+100, 80, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Procenom, "")), 117, Gx_line+99, 337, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(21, Gx_line+5, 793, Gx_line+171, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lista de substâncias Restritas na Fabricação:", ""), 460, Gx_line+13, 731, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Relatorio de Analide da composição da Malha:", ""), 460, Gx_line+34, 732, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Motivo N/C:", ""), 506, Gx_line+148, 572, Gx_line+164, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37lista, "")), 735, Gx_line+13, 777, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38relatorio, "")), 735, Gx_line+33, 777, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Tab_norma[1-1], "")), 506, Gx_line+53, 585, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Tab_norma[2-1], "")), 506, Gx_line+69, 585, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Tab_norma[3-1], "")), 506, Gx_line+84, 585, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Tab_norma[4-1], "")), 506, Gx_line+100, 585, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Tab_norma[5-1], "")), 506, Gx_line+116, 585, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tab_normast[1-1], "")), 594, Gx_line+53, 633, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tab_normast[2-1], "")), 594, Gx_line+69, 633, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tab_normast[3-1], "")), 594, Gx_line+84, 633, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tab_normast[4-1], "")), 594, Gx_line+100, 633, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Tab_normast[5-1], "")), 594, Gx_line+116, 633, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43tab_nc[1-1], "")), 663, Gx_line+53, 727, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43tab_nc[2-1], "")), 663, Gx_line+69, 727, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43tab_nc[3-1], "")), 663, Gx_line+84, 727, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43tab_nc[4-1], "")), 663, Gx_line+100, 727, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43tab_nc[5-1], "")), 663, Gx_line+116, 727, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Tab_normanc[1-1], "")), 735, Gx_line+53, 777, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Tab_normanc[2-1], "")), 735, Gx_line+69, 777, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Tab_normanc[3-1], "")), 735, Gx_line+84, 777, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Tab_normanc[4-1], "")), 735, Gx_line+100, 777, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Tab_normanc[5-1], "")), 735, Gx_line+116, 777, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Motivo, "")), 577, Gx_line+148, 766, Gx_line+165, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+177) ;
               getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 22, Gx_line+0, 102, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_obs[1-1], "")), 123, Gx_line+0, 437, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_obs[2-1], "")), 123, Gx_line+16, 437, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_obs[3-1], "")), 123, Gx_line+31, 437, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+56, 779, Gx_line+56, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+59) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
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
      AV66BarEncCli = "" ;
      AV56PBarCodPar = "" ;
      AV61UBarCodPar = "" ;
      AV25ImpCod = "" ;
      AV20ContDsc = "" ;
      AV26Station = "" ;
      GXv_char1 = new String[1] ;
      AV23EmprNom = "" ;
      AV24UsurCod = "" ;
      scmdbuf = "" ;
      P05MT2_A396EmprCod = new String[] {""} ;
      P05MT2_n396EmprCod = new boolean[] {false} ;
      P05MT2_A407EmprNom = new String[] {""} ;
      P05MT2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV22Termin = "" ;
      P05MT3_A396EmprCod = new String[] {""} ;
      P05MT3_n396EmprCod = new boolean[] {false} ;
      P05MT3_A942TermCod = new String[] {""} ;
      P05MT3_A1189TermUsu = new String[] {""} ;
      P05MT3_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV21TermUsu = "" ;
      AV27TotKgs = DecimalUtil.ZERO ;
      P05MT5_A833TipDefCod = new short[1] ;
      P05MT5_n833TipDefCod = new boolean[] {false} ;
      P05MT5_A396EmprCod = new String[] {""} ;
      P05MT5_n396EmprCod = new boolean[] {false} ;
      P05MT5_A252CliCod = new int[1] ;
      P05MT5_n252CliCod = new boolean[] {false} ;
      P05MT5_A4812BarEncCli = new String[] {""} ;
      P05MT5_A1652BarSerDsc = new String[] {""} ;
      P05MT5_A361DisCod = new int[1] ;
      P05MT5_A834TipDefDsc = new String[] {""} ;
      P05MT5_n834TipDefDsc = new boolean[] {false} ;
      P05MT5_A148BarEstReo = new byte[1] ;
      P05MT5_A4466BarAcaAnh = new short[1] ;
      P05MT5_A5291BarTipCor = new String[] {""} ;
      P05MT5_A3030BarPlf = new String[] {""} ;
      P05MT5_A2829BarProPer = new String[] {""} ;
      P05MT5_A11852Nxt_ArtCl2 = new String[] {""} ;
      P05MT5_A11850Nxt_Mdlo2 = new String[] {""} ;
      P05MT5_A11851Nxt_Sta2 = new String[] {""} ;
      P05MT5_A217BarTipArt = new short[1] ;
      P05MT5_n217BarTipArt = new boolean[] {false} ;
      P05MT5_A1909BarGraAca = new short[1] ;
      P05MT5_A125BarAncAca1 = new short[1] ;
      P05MT5_A135BarColNom = new String[] {""} ;
      P05MT5_A1234BarNomCli = new String[] {""} ;
      P05MT5_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P05MT5_A279CliNom = new String[] {""} ;
      P05MT5_A4348DisUsrCod = new String[] {""} ;
      P05MT5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05MT5_A11662BarOrdComp = new String[] {""} ;
      P05MT5_A1503BarPart = new short[1] ;
      P05MT5_A9777BarItem3 = new String[] {""} ;
      P05MT5_A132BarCodReo = new byte[1] ;
      P05MT5_A130BarCodPar = new String[] {""} ;
      P05MT5_A129BarCod = new int[1] ;
      P05MT5_A212BarSer = new String[] {""} ;
      P05MT5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MT5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4812BarEncCli = "" ;
      A1652BarSerDsc = "" ;
      A834TipDefDsc = "" ;
      A5291BarTipCor = "" ;
      A3030BarPlf = "" ;
      A2829BarProPer = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A11850Nxt_Mdlo2 = "" ;
      A11851Nxt_Sta2 = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A279CliNom = "" ;
      A4348DisUsrCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A11662BarOrdComp = "" ;
      A9777BarItem3 = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV50barCodPar = "" ;
      P05MT7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MT7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MT9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MT9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV34Procenom = "" ;
      P05MT10_A396EmprCod = new String[] {""} ;
      P05MT10_n396EmprCod = new boolean[] {false} ;
      P05MT10_A129BarCod = new int[1] ;
      P05MT10_A132BarCodReo = new byte[1] ;
      P05MT10_A130BarCodPar = new String[] {""} ;
      P05MT10_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MT10_A44AlbRecCod = new int[1] ;
      P05MT10_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV42Remonta = "" ;
      AV47TxtRC = "" ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new short[1] ;
      AV16Tb1_dscfb = "" ;
      GXv_char3 = new String[1] ;
      AV10DisEnt = "" ;
      AV28Exportacion = "" ;
      AV29Muestras = "" ;
      AV19Cod_Idtx = "" ;
      AV31Tab_norma = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV31Tab_norma[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV33Tab_normanc = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV33Tab_normanc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV32Tab_normast = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV32Tab_normast[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV43tab_nc = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV43tab_nc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV39Tab_normas = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV39Tab_normas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05MT11_A396EmprCod = new String[] {""} ;
      P05MT11_n396EmprCod = new boolean[] {false} ;
      P05MT11_A361DisCod = new int[1] ;
      P05MT11_A13216DisNormDsc = new String[] {""} ;
      P05MT11_n13216DisNormDsc = new boolean[] {false} ;
      P05MT11_A13215DisNormNC = new String[] {""} ;
      P05MT11_A13214DisNormSt = new String[] {""} ;
      P05MT11_A13213DisNormID = new String[] {""} ;
      A13216DisNormDsc = "" ;
      A13215DisNormNC = "" ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      AV40Norma = "" ;
      AV41status = "" ;
      AV30Nxt_artcl2 = "" ;
      AV37lista = "" ;
      AV38relatorio = "" ;
      AV12Tab_obs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV12Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05MT12_A396EmprCod = new String[] {""} ;
      P05MT12_n396EmprCod = new boolean[] {false} ;
      P05MT12_A361DisCod = new int[1] ;
      P05MT12_A377DisObsTxt = new String[] {""} ;
      P05MT12_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV8Hdr = "" ;
      AV13TipArtDsc = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV46BarColNom = "" ;
      AV45BarNomcli = "" ;
      P05MT13_A396EmprCod = new String[] {""} ;
      P05MT13_n396EmprCod = new boolean[] {false} ;
      P05MT13_A129BarCod = new int[1] ;
      P05MT13_A132BarCodReo = new byte[1] ;
      P05MT13_A130BarCodPar = new String[] {""} ;
      P05MT13_A44AlbRecCod = new int[1] ;
      P05MT13_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MT13_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MT13_A1501BarPiePie = new int[1] ;
      P05MT13_A200BarPieCod = new String[] {""} ;
      A205BarPieMet = DecimalUtil.ZERO ;
      AV64Localizacion = "" ;
      P05MT14_A396EmprCod = new String[] {""} ;
      P05MT14_n396EmprCod = new boolean[] {false} ;
      P05MT14_A129BarCod = new int[1] ;
      P05MT14_A132BarCodReo = new byte[1] ;
      P05MT14_A130BarCodPar = new String[] {""} ;
      P05MT14_A460FasDsc = new String[] {""} ;
      P05MT14_A457FasCod = new String[] {""} ;
      P05MT14_A194BarOrdLin = new short[1] ;
      P05MT14_A758ProCod = new String[] {""} ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P05MT15_A396EmprCod = new String[] {""} ;
      P05MT15_n396EmprCod = new boolean[] {false} ;
      P05MT15_A10887Cod_Idtx = new String[] {""} ;
      P05MT15_A10888Dsc_Idtx = new String[] {""} ;
      P05MT15_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV11Dsc_Idtx = "" ;
      P05MT16_A970ProceCod = new short[1] ;
      P05MT16_n970ProceCod = new boolean[] {false} ;
      P05MT16_A396EmprCod = new String[] {""} ;
      P05MT16_n396EmprCod = new boolean[] {false} ;
      P05MT16_A44AlbRecCod = new int[1] ;
      P05MT16_A971ProceNom = new String[] {""} ;
      P05MT16_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      AV53NR_BARPARA = "" ;
      P05MT17_A396EmprCod = new String[] {""} ;
      P05MT17_n396EmprCod = new boolean[] {false} ;
      P05MT17_A5206Nr_albrecc = new int[1] ;
      P05MT17_n5206Nr_albrecc = new boolean[] {false} ;
      P05MT17_A5222Nr_barcoda = new int[1] ;
      P05MT17_n5222Nr_barcoda = new boolean[] {false} ;
      P05MT17_A5223Nr_barreoa = new byte[1] ;
      P05MT17_n5223Nr_barreoa = new boolean[] {false} ;
      P05MT17_A5224Nr_barpara = new String[] {""} ;
      P05MT17_n5224Nr_barpara = new boolean[] {false} ;
      P05MT17_A5198Nr_codigo = new int[1] ;
      A5224Nr_barpara = "" ;
      P05MT18_A396EmprCod = new String[] {""} ;
      P05MT18_n396EmprCod = new boolean[] {false} ;
      P05MT18_A44AlbRecCod = new int[1] ;
      P05MT18_A50AlbRLoc = new String[] {""} ;
      A50AlbRLoc = "" ;
      AV44Motivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.presuos__default(),
         new Object[] {
             new Object[] {
            P05MT2_A396EmprCod, P05MT2_A407EmprNom, P05MT2_n407EmprNom
            }
            , new Object[] {
            P05MT3_A396EmprCod, P05MT3_n396EmprCod, P05MT3_A942TermCod, P05MT3_A1189TermUsu, P05MT3_n1189TermUsu
            }
            , new Object[] {
            P05MT5_A833TipDefCod, P05MT5_n833TipDefCod, P05MT5_A396EmprCod, P05MT5_A252CliCod, P05MT5_n252CliCod, P05MT5_A4812BarEncCli, P05MT5_A1652BarSerDsc, P05MT5_A361DisCod, P05MT5_A834TipDefDsc, P05MT5_n834TipDefDsc,
            P05MT5_A148BarEstReo, P05MT5_A4466BarAcaAnh, P05MT5_A5291BarTipCor, P05MT5_A3030BarPlf, P05MT5_A2829BarProPer, P05MT5_A11852Nxt_ArtCl2, P05MT5_A11850Nxt_Mdlo2, P05MT5_A11851Nxt_Sta2, P05MT5_A217BarTipArt, P05MT5_n217BarTipArt,
            P05MT5_A1909BarGraAca, P05MT5_A125BarAncAca1, P05MT5_A135BarColNom, P05MT5_A1234BarNomCli, P05MT5_A155BarFecCli, P05MT5_A279CliNom, P05MT5_A4348DisUsrCod, P05MT5_A159BarFecGen, P05MT5_A11662BarOrdComp, P05MT5_A1503BarPart,
            P05MT5_A9777BarItem3, P05MT5_A132BarCodReo, P05MT5_A130BarCodPar, P05MT5_A129BarCod, P05MT5_A212BarSer, P05MT5_A184BarMtr, P05MT5_A166BarKgm
            }
            , new Object[] {
            P05MT7_A184BarMtr, P05MT7_A166BarKgm
            }
            , new Object[] {
            P05MT9_A184BarMtr, P05MT9_A166BarKgm
            }
            , new Object[] {
            P05MT10_A396EmprCod, P05MT10_A129BarCod, P05MT10_A132BarCodReo, P05MT10_A130BarCodPar, P05MT10_A203BarPieKil, P05MT10_A44AlbRecCod, P05MT10_A200BarPieCod
            }
            , new Object[] {
            P05MT11_A396EmprCod, P05MT11_A361DisCod, P05MT11_A13216DisNormDsc, P05MT11_n13216DisNormDsc, P05MT11_A13215DisNormNC, P05MT11_A13214DisNormSt, P05MT11_A13213DisNormID
            }
            , new Object[] {
            P05MT12_A396EmprCod, P05MT12_A361DisCod, P05MT12_A377DisObsTxt, P05MT12_A376DisObsLin
            }
            , new Object[] {
            P05MT13_A396EmprCod, P05MT13_A129BarCod, P05MT13_A132BarCodReo, P05MT13_A130BarCodPar, P05MT13_A44AlbRecCod, P05MT13_A205BarPieMet, P05MT13_A203BarPieKil, P05MT13_A1501BarPiePie, P05MT13_A200BarPieCod
            }
            , new Object[] {
            P05MT14_A396EmprCod, P05MT14_A129BarCod, P05MT14_A132BarCodReo, P05MT14_A130BarCodPar, P05MT14_A460FasDsc, P05MT14_A457FasCod, P05MT14_A194BarOrdLin, P05MT14_A758ProCod
            }
            , new Object[] {
            P05MT15_A396EmprCod, P05MT15_A10887Cod_Idtx, P05MT15_A10888Dsc_Idtx, P05MT15_n10888Dsc_Idtx
            }
            , new Object[] {
            P05MT16_A970ProceCod, P05MT16_n970ProceCod, P05MT16_A396EmprCod, P05MT16_A44AlbRecCod, P05MT16_A971ProceNom, P05MT16_n971ProceNom
            }
            , new Object[] {
            P05MT17_A396EmprCod, P05MT17_A5206Nr_albrecc, P05MT17_n5206Nr_albrecc, P05MT17_A5222Nr_barcoda, P05MT17_n5222Nr_barcoda, P05MT17_A5223Nr_barreoa, P05MT17_n5223Nr_barreoa, P05MT17_A5224Nr_barpara, P05MT17_n5224Nr_barpara, P05MT17_A5198Nr_codigo
            }
            , new Object[] {
            P05MT18_A396EmprCod, P05MT18_A44AlbRecCod, P05MT18_A50AlbRLoc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV57PBarCodReo ;
   private byte AV63UBarCodReo ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV49BarCodReo ;
   private byte AV35j ;
   private byte A376DisObsLin ;
   private byte AV18Inicio ;
   private byte AV52NR_BARREOA ;
   private byte A5223Nr_barreoa ;
   private short gxcookieaux ;
   private short A833TipDefCod ;
   private short A4466BarAcaAnh ;
   private short A217BarTipArt ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A1503BarPart ;
   private short GXv_int6[] ;
   private short AV17i ;
   private short AV14Bargraaca ;
   private short AV15Barancaca1 ;
   private short A194BarOrdLin ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int AV65CliCod ;
   private int AV55PBarCod ;
   private int AV58UBarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int AV48BarCod ;
   private int A44AlbRecCod ;
   private int AV36Albreccod ;
   private int AV51NR_BARCODA ;
   private int GXv_int5[] ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A1501BarPiePie ;
   private int AV54Nr_codigo ;
   private int A5206Nr_albrecc ;
   private int A5222Nr_barcoda ;
   private int A5198Nr_codigo ;
   private java.math.BigDecimal AV27TotKgs ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV66BarEncCli ;
   private String AV56PBarCodPar ;
   private String AV61UBarCodPar ;
   private String AV25ImpCod ;
   private String AV20ContDsc ;
   private String AV26Station ;
   private String GXv_char1[] ;
   private String AV23EmprNom ;
   private String AV24UsurCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV22Termin ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV21TermUsu ;
   private String A4812BarEncCli ;
   private String A1652BarSerDsc ;
   private String A834TipDefDsc ;
   private String A5291BarTipCor ;
   private String A3030BarPlf ;
   private String A2829BarProPer ;
   private String A11852Nxt_ArtCl2 ;
   private String A11850Nxt_Mdlo2 ;
   private String A11851Nxt_Sta2 ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A279CliNom ;
   private String A4348DisUsrCod ;
   private String A9777BarItem3 ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String AV50barCodPar ;
   private String AV34Procenom ;
   private String A200BarPieCod ;
   private String AV42Remonta ;
   private String AV47TxtRC ;
   private String AV16Tb1_dscfb ;
   private String GXv_char3[] ;
   private String AV10DisEnt ;
   private String AV28Exportacion ;
   private String AV29Muestras ;
   private String AV19Cod_Idtx ;
   private String AV31Tab_norma[] ;
   private String AV33Tab_normanc[] ;
   private String AV32Tab_normast[] ;
   private String AV43tab_nc[] ;
   private String AV39Tab_normas[] ;
   private String A13216DisNormDsc ;
   private String A13215DisNormNC ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String AV40Norma ;
   private String AV41status ;
   private String AV30Nxt_artcl2 ;
   private String AV37lista ;
   private String AV38relatorio ;
   private String AV12Tab_obs[] ;
   private String A377DisObsTxt ;
   private String AV8Hdr ;
   private String AV13TipArtDsc ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV46BarColNom ;
   private String AV45BarNomcli ;
   private String AV64Localizacion ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV11Dsc_Idtx ;
   private String A971ProceNom ;
   private String AV53NR_BARPARA ;
   private String A5224Nr_barpara ;
   private String A50AlbRLoc ;
   private String AV44Motivo ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A159BarFecGen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n407EmprNom ;
   private boolean n1189TermUsu ;
   private boolean brk5MT4 ;
   private boolean n833TipDefCod ;
   private boolean n252CliCod ;
   private boolean n834TipDefDsc ;
   private boolean n217BarTipArt ;
   private boolean GxHdr6 ;
   private boolean returnInSub ;
   private boolean n13216DisNormDsc ;
   private boolean n10888Dsc_Idtx ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n5206Nr_albrecc ;
   private boolean n5222Nr_barcoda ;
   private boolean n5223Nr_barreoa ;
   private boolean n5224Nr_barpara ;
   private String A11662BarOrdComp ;
   private IDataStoreProvider pr_default ;
   private String[] P05MT2_A396EmprCod ;
   private boolean[] P05MT2_n396EmprCod ;
   private String[] P05MT2_A407EmprNom ;
   private boolean[] P05MT2_n407EmprNom ;
   private String[] P05MT3_A396EmprCod ;
   private boolean[] P05MT3_n396EmprCod ;
   private String[] P05MT3_A942TermCod ;
   private String[] P05MT3_A1189TermUsu ;
   private boolean[] P05MT3_n1189TermUsu ;
   private short[] P05MT5_A833TipDefCod ;
   private boolean[] P05MT5_n833TipDefCod ;
   private String[] P05MT5_A396EmprCod ;
   private boolean[] P05MT5_n396EmprCod ;
   private int[] P05MT5_A252CliCod ;
   private boolean[] P05MT5_n252CliCod ;
   private String[] P05MT5_A4812BarEncCli ;
   private String[] P05MT5_A1652BarSerDsc ;
   private int[] P05MT5_A361DisCod ;
   private String[] P05MT5_A834TipDefDsc ;
   private boolean[] P05MT5_n834TipDefDsc ;
   private byte[] P05MT5_A148BarEstReo ;
   private short[] P05MT5_A4466BarAcaAnh ;
   private String[] P05MT5_A5291BarTipCor ;
   private String[] P05MT5_A3030BarPlf ;
   private String[] P05MT5_A2829BarProPer ;
   private String[] P05MT5_A11852Nxt_ArtCl2 ;
   private String[] P05MT5_A11850Nxt_Mdlo2 ;
   private String[] P05MT5_A11851Nxt_Sta2 ;
   private short[] P05MT5_A217BarTipArt ;
   private boolean[] P05MT5_n217BarTipArt ;
   private short[] P05MT5_A1909BarGraAca ;
   private short[] P05MT5_A125BarAncAca1 ;
   private String[] P05MT5_A135BarColNom ;
   private String[] P05MT5_A1234BarNomCli ;
   private java.util.Date[] P05MT5_A155BarFecCli ;
   private String[] P05MT5_A279CliNom ;
   private String[] P05MT5_A4348DisUsrCod ;
   private java.util.Date[] P05MT5_A159BarFecGen ;
   private String[] P05MT5_A11662BarOrdComp ;
   private short[] P05MT5_A1503BarPart ;
   private String[] P05MT5_A9777BarItem3 ;
   private byte[] P05MT5_A132BarCodReo ;
   private String[] P05MT5_A130BarCodPar ;
   private int[] P05MT5_A129BarCod ;
   private String[] P05MT5_A212BarSer ;
   private java.math.BigDecimal[] P05MT5_A184BarMtr ;
   private java.math.BigDecimal[] P05MT5_A166BarKgm ;
   private java.math.BigDecimal[] P05MT7_A184BarMtr ;
   private java.math.BigDecimal[] P05MT7_A166BarKgm ;
   private java.math.BigDecimal[] P05MT9_A184BarMtr ;
   private java.math.BigDecimal[] P05MT9_A166BarKgm ;
   private String[] P05MT10_A396EmprCod ;
   private boolean[] P05MT10_n396EmprCod ;
   private int[] P05MT10_A129BarCod ;
   private byte[] P05MT10_A132BarCodReo ;
   private String[] P05MT10_A130BarCodPar ;
   private java.math.BigDecimal[] P05MT10_A203BarPieKil ;
   private int[] P05MT10_A44AlbRecCod ;
   private String[] P05MT10_A200BarPieCod ;
   private String[] P05MT11_A396EmprCod ;
   private boolean[] P05MT11_n396EmprCod ;
   private int[] P05MT11_A361DisCod ;
   private String[] P05MT11_A13216DisNormDsc ;
   private boolean[] P05MT11_n13216DisNormDsc ;
   private String[] P05MT11_A13215DisNormNC ;
   private String[] P05MT11_A13214DisNormSt ;
   private String[] P05MT11_A13213DisNormID ;
   private String[] P05MT12_A396EmprCod ;
   private boolean[] P05MT12_n396EmprCod ;
   private int[] P05MT12_A361DisCod ;
   private String[] P05MT12_A377DisObsTxt ;
   private byte[] P05MT12_A376DisObsLin ;
   private String[] P05MT13_A396EmprCod ;
   private boolean[] P05MT13_n396EmprCod ;
   private int[] P05MT13_A129BarCod ;
   private byte[] P05MT13_A132BarCodReo ;
   private String[] P05MT13_A130BarCodPar ;
   private int[] P05MT13_A44AlbRecCod ;
   private java.math.BigDecimal[] P05MT13_A205BarPieMet ;
   private java.math.BigDecimal[] P05MT13_A203BarPieKil ;
   private int[] P05MT13_A1501BarPiePie ;
   private String[] P05MT13_A200BarPieCod ;
   private String[] P05MT14_A396EmprCod ;
   private boolean[] P05MT14_n396EmprCod ;
   private int[] P05MT14_A129BarCod ;
   private byte[] P05MT14_A132BarCodReo ;
   private String[] P05MT14_A130BarCodPar ;
   private String[] P05MT14_A460FasDsc ;
   private String[] P05MT14_A457FasCod ;
   private short[] P05MT14_A194BarOrdLin ;
   private String[] P05MT14_A758ProCod ;
   private String[] P05MT15_A396EmprCod ;
   private boolean[] P05MT15_n396EmprCod ;
   private String[] P05MT15_A10887Cod_Idtx ;
   private String[] P05MT15_A10888Dsc_Idtx ;
   private boolean[] P05MT15_n10888Dsc_Idtx ;
   private short[] P05MT16_A970ProceCod ;
   private boolean[] P05MT16_n970ProceCod ;
   private String[] P05MT16_A396EmprCod ;
   private boolean[] P05MT16_n396EmprCod ;
   private int[] P05MT16_A44AlbRecCod ;
   private String[] P05MT16_A971ProceNom ;
   private boolean[] P05MT16_n971ProceNom ;
   private String[] P05MT17_A396EmprCod ;
   private boolean[] P05MT17_n396EmprCod ;
   private int[] P05MT17_A5206Nr_albrecc ;
   private boolean[] P05MT17_n5206Nr_albrecc ;
   private int[] P05MT17_A5222Nr_barcoda ;
   private boolean[] P05MT17_n5222Nr_barcoda ;
   private byte[] P05MT17_A5223Nr_barreoa ;
   private boolean[] P05MT17_n5223Nr_barreoa ;
   private String[] P05MT17_A5224Nr_barpara ;
   private boolean[] P05MT17_n5224Nr_barpara ;
   private int[] P05MT17_A5198Nr_codigo ;
   private String[] P05MT18_A396EmprCod ;
   private boolean[] P05MT18_n396EmprCod ;
   private int[] P05MT18_A44AlbRecCod ;
   private String[] P05MT18_A50AlbRLoc ;
}

final  class presuos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05MT2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MT3", "SELECT EmprCod, TermCod, TermUsu FROM TXPTERMIN WHERE (TermCod = ?) AND (EmprCod = ?) ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MT5", "SELECT T1.TipDefCod, T1.EmprCod, T1.CliCod, T1.BarEncCli, T1.BarSerDsc, T1.DisCod, T3.TipDefDsc, T1.BarEstReo, T1.BarAcaAnh, T1.BarTipCor, T1.BarPlf, T1.BarProPer, T1.Nxt_ArtCl2, T1.Nxt_Mdlo2, T1.Nxt_Sta2, T1.BarTipArt, T1.BarGraAca, T1.BarAncAca1, T1.BarColNom, T1.BarNomCli, T1.BarFecCli, T4.CliNom, T2.DisUsrCod, T1.BarFecGen, T1.BarOrdComp, T1.BarPart, T1.BarItem3, T1.BarCodReo, T1.BarCodPar, T1.BarCod, T1.BarSer, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T5.BarKgm, 0) AS BarKgm FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.BarEncCli = ?) AND (T1.BarCod >= ?) AND (T1.BarCodPar >= ?) AND (T1.BarCodReo >= ?) AND (T1.BarCod <= ?) AND (T1.BarCodPar <= ?) AND (T1.BarCodReo <= ?) AND (COALESCE( T5.BarKgm, 0) > 0) ORDER BY T1.EmprCod, T1.CliCod, T1.BarEncCli, T1.BarPart ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT7", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT9", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT11", "SELECT T1.EmprCod, T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormNC, T1.DisNormSt, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT12", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT13", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieMet, BarPieKil, BarPiePie, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT14", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT15", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MT16", "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MT17", "SELECT EmprCod, Nr_albrecc, Nr_barcoda, Nr_barreoa, Nr_barpara, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MT18", "SELECT EmprCod, AlbRecCod, AlbRLoc FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 2);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((String[]) buf[17])[0] = rslt.getString(15, 4);
               ((short[]) buf[18])[0] = rslt.getShort(16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(17);
               ((short[]) buf[21])[0] = rslt.getShort(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 13);
               ((String[]) buf[23])[0] = rslt.getString(20, 13);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 30);
               ((String[]) buf[26])[0] = rslt.getString(23, 8);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(24);
               ((String[]) buf[28])[0] = rslt.getVarchar(25);
               ((short[]) buf[29])[0] = rslt.getShort(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 20);
               ((byte[]) buf[31])[0] = rslt.getByte(28);
               ((String[]) buf[32])[0] = rslt.getString(29, 1);
               ((int[]) buf[33])[0] = rslt.getInt(30);
               ((String[]) buf[34])[0] = rslt.getString(31, 16);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(33,2);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 20);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 4);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
      }
   }

}

