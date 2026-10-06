package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rens025_impl extends GXWebReport
{
   public rens025_impl( com.genexus.internet.HttpContext context )
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
            AV10Cartazi = httpContext.GetPar( "Cartazi") ;
            AV11Cartazf = httpContext.GetPar( "Cartazf") ;
            AV46ArtCodi = httpContext.GetPar( "ArtCodi") ;
            AV47ArtCodf = httpContext.GetPar( "ArtCodf") ;
            AV12Fechaei = localUtil.parseDateParm( httpContext.GetPar( "Fechaei")) ;
            AV13Fechaef = localUtil.parseDateParm( httpContext.GetPar( "Fechaef")) ;
            AV14Fechaeni = localUtil.parseDateParm( httpContext.GetPar( "Fechaeni")) ;
            AV15Fechaenf = localUtil.parseDateParm( httpContext.GetPar( "Fechaenf")) ;
            AV19Fechari = localUtil.parseDateParm( httpContext.GetPar( "Fechari")) ;
            AV20Fecharf = localUtil.parseDateParm( httpContext.GetPar( "Fecharf")) ;
            AV60PTipo = httpContext.GetPar( "PTipo") ;
            AV61UTipo = httpContext.GetPar( "UTipo") ;
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
         GXt_int1 = AV64WEns017 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS017", ""), GXv_int2) ;
         rens025_impl.this.GXt_int1 = GXv_int2[0] ;
         AV64WEns017 = GXt_int1 ;
         GXt_char3 = AV34Lit1 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV34Lit1 = GXt_char3 ;
         GXt_char3 = AV35Lit2 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV35Lit2 = GXt_char3 ;
         AV24Lit3 = GXutil.trim( AV34Lit1) + "-" + GXutil.trim( AV35Lit2) ;
         GXt_char3 = AV23Lit4 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "RENS025", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV23Lit4 = GXt_char3 ;
         GXt_char3 = AV25Lit5 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV25Lit5 = GXt_char3 ;
         GXt_char3 = AV26Lit6 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV26Lit6 = GXt_char3 ;
         GXt_char3 = AV27Lit7 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV27Lit7 = GXt_char3 ;
         GXt_char3 = AV28Lit8 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT40_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV28Lit8 = GXt_char3 ;
         GXt_char3 = AV29Lit9 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV29Lit9 = GXt_char3 ;
         if ( GXutil.strcmp(AV29Lit9, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char3 = AV29Lit9 ;
            GXv_char4[0] = GXt_char3 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char4) ;
            rens025_impl.this.GXt_char3 = GXv_char4[0] ;
            AV29Lit9 = GXt_char3 ;
         }
         GXt_char3 = AV30Lit10 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV30Lit10 = GXt_char3 ;
         GXt_char3 = AV31Lit11 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN407_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV31Lit11 = GXt_char3 ;
         GXt_char3 = AV32Lit12 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1607_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV32Lit12 = GXt_char3 ;
         GXt_char3 = AV33Lit13 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN229", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV33Lit13 = GXt_char3 ;
         GXt_char3 = AV49Lit14 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV49Lit14 = GXt_char3 ;
         GXt_char3 = AV57Lit15 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN530_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV57Lit15 = GXt_char3 ;
         GXt_char3 = AV58Lit16 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1106_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV58Lit16 = httpContext.getMessage( "N.", "") + GXt_char3 ;
         GXt_char3 = AV59Lit17 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT682_", ""), (byte)(99), GXv_char4) ;
         rens025_impl.this.GXt_char3 = GXv_char4[0] ;
         AV59Lit17 = GXt_char3 ;
         GXt_int1 = AV65Carvema ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
         rens025_impl.this.GXt_int1 = GXv_int2[0] ;
         AV65Carvema = GXt_int1 ;
         /* Using cursor P06XK2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06XK2_A407EmprNom[0] ;
            n407EmprNom = P06XK2_n407EmprNom[0] ;
            AV16EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV42Num_rat = 0 ;
         AV43Num_ret = 0 ;
         AV54Num_rtt = 0 ;
         AV44Num_dat = 0 ;
         AV45Num_det = 0 ;
         AV52Num_dtt = 0 ;
         /* Using cursor P06XK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8PCliCod), AV10Cartazi, AV46ArtCodi, AV47ArtCodf, AV60PTipo, AV61UTipo, AV12Fechaei, AV13Fechaef, AV11Cartazf, Integer.valueOf(AV9UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6XK4 = false ;
            A5541Lb_FechaE = P06XK3_A5541Lb_FechaE[0] ;
            A5570Lb_Tipo = P06XK3_A5570Lb_Tipo[0] ;
            A5540Lb_Cartaz = P06XK3_A5540Lb_Cartaz[0] ;
            A5533Lb_ArtCod = P06XK3_A5533Lb_ArtCod[0] ;
            A252CliCod = P06XK3_A252CliCod[0] ;
            A5538Lb_ColNomC = P06XK3_A5538Lb_ColNomC[0] ;
            A5536Lb_ColNom = P06XK3_A5536Lb_ColNom[0] ;
            A5532Lb_numero = P06XK3_A5532Lb_numero[0] ;
            A279CliNom = P06XK3_A279CliNom[0] ;
            A279CliNom = P06XK3_A279CliNom[0] ;
            AV36Num_ra = 0 ;
            AV39Num_re = 0 ;
            AV53Num_rt = 0 ;
            AV37Num_da = 0 ;
            AV38Num_de = 0 ;
            AV51Num_dt = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06XK3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06XK3_A252CliCod[0] == A252CliCod ) )
            {
               brk6XK4 = false ;
               A5541Lb_FechaE = P06XK3_A5541Lb_FechaE[0] ;
               A5570Lb_Tipo = P06XK3_A5570Lb_Tipo[0] ;
               A5540Lb_Cartaz = P06XK3_A5540Lb_Cartaz[0] ;
               A5533Lb_ArtCod = P06XK3_A5533Lb_ArtCod[0] ;
               A5538Lb_ColNomC = P06XK3_A5538Lb_ColNomC[0] ;
               A5536Lb_ColNom = P06XK3_A5536Lb_ColNom[0] ;
               A5532Lb_numero = P06XK3_A5532Lb_numero[0] ;
               A279CliNom = P06XK3_A279CliNom[0] ;
               A279CliNom = P06XK3_A279CliNom[0] ;
               if ( GXutil.strcmp(A5540Lb_Cartaz, AV11Cartazf) <= 0 )
               {
                  if ( GXutil.strcmp(A5540Lb_Cartaz, AV10Cartazi) >= 0 )
                  {
                     if ( ( A252CliCod >= AV8PCliCod ) && ( A252CliCod <= AV9UCliCod ) )
                     {
                        if ( ( GXutil.strcmp(A5533Lb_ArtCod, AV46ArtCodi) >= 0 ) && ( GXutil.strcmp(A5533Lb_ArtCod, AV47ArtCodf) <= 0 ) )
                        {
                           if ( ( GXutil.strcmp(A5570Lb_Tipo, AV60PTipo) >= 0 ) && ( GXutil.strcmp(A5570Lb_Tipo, AV61UTipo) <= 0 ) )
                           {
                              if ( (( GXutil.resetTime(A5541Lb_FechaE).after( GXutil.resetTime( AV12Fechaei )) ) || ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV12Fechaei)) )) && (( GXutil.resetTime(A5541Lb_FechaE).before( GXutil.resetTime( AV13Fechaef )) ) || ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV13Fechaef)) )) )
                              {
                                 AV17Lb_fechaen = GXutil.nullDate() ;
                                 AV21Lb_fechar = GXutil.nullDate() ;
                                 AV56NEntradas = (byte)(0) ;
                                 /* Using cursor P06XK4 */
                                 pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV14Fechaeni, AV15Fechaenf, AV19Fechari, AV20Fecharf});
                                 while ( (pr_default.getStatus(2) != 101) )
                                 {
                                    A5563Lb_FechaR = P06XK4_A5563Lb_FechaR[0] ;
                                    A5567Lb_FechaEn = P06XK4_A5567Lb_FechaEn[0] ;
                                    A6461Lb_FecNoa1 = P06XK4_A6461Lb_FecNoa1[0] ;
                                    A5555Lb_opcion = P06XK4_A5555Lb_opcion[0] ;
                                    if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
                                    {
                                       AV17Lb_fechaen = A5567Lb_FechaEn ;
                                    }
                                    if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
                                    {
                                       AV21Lb_fechar = A5563Lb_FechaR ;
                                    }
                                    AV56NEntradas = (byte)(AV56NEntradas+1) ;
                                    pr_default.readNext(2);
                                 }
                                 pr_default.close(2);
                                 AV18Dias_e = (short)(0) ;
                                 if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17Lb_fechaen)) )
                                 {
                                    GXv_char4[0] = A396EmprCod ;
                                    GXv_date5[0] = A5541Lb_FechaE ;
                                    GXv_date6[0] = AV17Lb_fechaen ;
                                    GXv_int7[0] = AV18Dias_e ;
                                    new app.pdiaslab(remoteHandle, context).execute( GXv_char4, GXv_date5, GXv_date6, GXv_int7) ;
                                    rens025_impl.this.A396EmprCod = GXv_char4[0] ;
                                    rens025_impl.this.A5541Lb_FechaE = GXv_date5[0] ;
                                    rens025_impl.this.AV17Lb_fechaen = GXv_date6[0] ;
                                    rens025_impl.this.AV18Dias_e = GXv_int7[0] ;
                                    if ( AV18Dias_e == 0 )
                                    {
                                       AV18Dias_e = (short)(GXutil.ddiff(AV17Lb_fechaen,A5541Lb_FechaE)) ;
                                    }
                                 }
                                 AV22Dias_a = (short)(0) ;
                                 if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Lb_fechar)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17Lb_fechaen)) )
                                 {
                                    GXv_char4[0] = A396EmprCod ;
                                    GXv_date6[0] = AV17Lb_fechaen ;
                                    GXv_date5[0] = AV21Lb_fechar ;
                                    GXv_int7[0] = AV22Dias_a ;
                                    new app.pdiaslab(remoteHandle, context).execute( GXv_char4, GXv_date6, GXv_date5, GXv_int7) ;
                                    rens025_impl.this.A396EmprCod = GXv_char4[0] ;
                                    rens025_impl.this.AV17Lb_fechaen = GXv_date6[0] ;
                                    rens025_impl.this.AV21Lb_fechar = GXv_date5[0] ;
                                    rens025_impl.this.AV22Dias_a = GXv_int7[0] ;
                                    if ( AV22Dias_a == 0 )
                                    {
                                       AV22Dias_a = (short)(GXutil.ddiff(AV21Lb_fechar,AV17Lb_fechaen)) ;
                                    }
                                 }
                                 AV50Dias_t = (short)(0) ;
                                 if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Lb_fechar)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5541Lb_FechaE)) )
                                 {
                                    GXv_char4[0] = A396EmprCod ;
                                    GXv_date6[0] = A5541Lb_FechaE ;
                                    GXv_date5[0] = AV21Lb_fechar ;
                                    GXv_int7[0] = AV50Dias_t ;
                                    new app.pdiaslab(remoteHandle, context).execute( GXv_char4, GXv_date6, GXv_date5, GXv_int7) ;
                                    rens025_impl.this.A396EmprCod = GXv_char4[0] ;
                                    rens025_impl.this.A5541Lb_FechaE = GXv_date6[0] ;
                                    rens025_impl.this.AV21Lb_fechar = GXv_date5[0] ;
                                    rens025_impl.this.AV50Dias_t = GXv_int7[0] ;
                                    if ( AV50Dias_t == 0 )
                                    {
                                       AV50Dias_t = (short)(GXutil.ddiff(AV21Lb_fechar,A5541Lb_FechaE)) ;
                                    }
                                 }
                                 if ( AV64WEns017 == 1 )
                                 {
                                    AV22Dias_a = (short)(0) ;
                                    AV18Dias_e = (short)(0) ;
                                    AV50Dias_t = (short)(0) ;
                                    AV63Dias_cal = (short)(0) ;
                                    /* Using cursor P06XK5 */
                                    pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV14Fechaeni, AV15Fechaenf, AV19Fechari, AV20Fecharf});
                                    while ( (pr_default.getStatus(3) != 101) )
                                    {
                                       brk6XK7 = false ;
                                       A5567Lb_FechaEn = P06XK5_A5567Lb_FechaEn[0] ;
                                       A5563Lb_FechaR = P06XK5_A5563Lb_FechaR[0] ;
                                       A6461Lb_FecNoa1 = P06XK5_A6461Lb_FecNoa1[0] ;
                                       A6460Lb_FecEnt1 = P06XK5_A6460Lb_FecEnt1[0] ;
                                       A5555Lb_opcion = P06XK5_A5555Lb_opcion[0] ;
                                       AV62LB_FECENT1 = GXutil.nullDate() ;
                                       if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6460Lb_FecEnt1)) )
                                       {
                                          AV62LB_FECENT1 = A6460Lb_FecEnt1 ;
                                       }
                                       while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P06XK5_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P06XK5_A6460Lb_FecEnt1[0]), GXutil.resetTime(A6460Lb_FecEnt1)) )
                                       {
                                          brk6XK7 = false ;
                                          A5567Lb_FechaEn = P06XK5_A5567Lb_FechaEn[0] ;
                                          A5563Lb_FechaR = P06XK5_A5563Lb_FechaR[0] ;
                                          A6461Lb_FecNoa1 = P06XK5_A6461Lb_FecNoa1[0] ;
                                          A5555Lb_opcion = P06XK5_A5555Lb_opcion[0] ;
                                          if ( P06XK5_A5532Lb_numero[0] == A5532Lb_numero )
                                          {
                                             if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
                                             {
                                                AV17Lb_fechaen = A5567Lb_FechaEn ;
                                             }
                                             if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
                                             {
                                                AV21Lb_fechar = A5563Lb_FechaR ;
                                             }
                                          }
                                          brk6XK7 = true ;
                                          pr_default.readNext(3);
                                       }
                                       if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62LB_FECENT1)) )
                                       {
                                          GXv_char4[0] = A396EmprCod ;
                                          GXv_date6[0] = AV62LB_FECENT1 ;
                                          GXv_date5[0] = AV17Lb_fechaen ;
                                          GXv_int7[0] = AV63Dias_cal ;
                                          new app.pdiaslab(remoteHandle, context).execute( GXv_char4, GXv_date6, GXv_date5, GXv_int7) ;
                                          rens025_impl.this.A396EmprCod = GXv_char4[0] ;
                                          rens025_impl.this.AV62LB_FECENT1 = GXv_date6[0] ;
                                          rens025_impl.this.AV17Lb_fechaen = GXv_date5[0] ;
                                          rens025_impl.this.AV63Dias_cal = GXv_int7[0] ;
                                          if ( AV63Dias_cal == 0 )
                                          {
                                             AV18Dias_e = (short)(AV18Dias_e+((GXutil.ddiff(AV17Lb_fechaen,AV62LB_FECENT1)))) ;
                                          }
                                          else
                                          {
                                             AV18Dias_e = (short)(AV18Dias_e+AV63Dias_cal) ;
                                          }
                                       }
                                       if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Lb_fechar)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17Lb_fechaen)) )
                                       {
                                          GXv_char4[0] = A396EmprCod ;
                                          GXv_date6[0] = AV17Lb_fechaen ;
                                          GXv_date5[0] = AV21Lb_fechar ;
                                          GXv_int7[0] = AV63Dias_cal ;
                                          new app.pdiaslab(remoteHandle, context).execute( GXv_char4, GXv_date6, GXv_date5, GXv_int7) ;
                                          rens025_impl.this.A396EmprCod = GXv_char4[0] ;
                                          rens025_impl.this.AV17Lb_fechaen = GXv_date6[0] ;
                                          rens025_impl.this.AV21Lb_fechar = GXv_date5[0] ;
                                          rens025_impl.this.AV63Dias_cal = GXv_int7[0] ;
                                          if ( AV63Dias_cal == 0 )
                                          {
                                             AV22Dias_a = (short)(AV22Dias_a+(GXutil.ddiff(AV21Lb_fechar,AV17Lb_fechaen))) ;
                                          }
                                          else
                                          {
                                             AV22Dias_a = (short)(AV22Dias_a+AV63Dias_cal) ;
                                          }
                                       }
                                       if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Lb_fechar)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62LB_FECENT1)) )
                                       {
                                          GXv_char4[0] = A396EmprCod ;
                                          GXv_date6[0] = AV62LB_FECENT1 ;
                                          GXv_date5[0] = AV21Lb_fechar ;
                                          GXv_int7[0] = AV63Dias_cal ;
                                          new app.pdiaslab(remoteHandle, context).execute( GXv_char4, GXv_date6, GXv_date5, GXv_int7) ;
                                          rens025_impl.this.A396EmprCod = GXv_char4[0] ;
                                          rens025_impl.this.AV62LB_FECENT1 = GXv_date6[0] ;
                                          rens025_impl.this.AV21Lb_fechar = GXv_date5[0] ;
                                          rens025_impl.this.AV63Dias_cal = GXv_int7[0] ;
                                          if ( AV63Dias_cal == 0 )
                                          {
                                             AV50Dias_t = (short)(AV50Dias_t+(GXutil.ddiff(AV21Lb_fechar,A5541Lb_FechaE))) ;
                                          }
                                          else
                                          {
                                             AV50Dias_t = (short)(AV50Dias_t+AV63Dias_cal) ;
                                          }
                                       }
                                       if ( ! brk6XK7 )
                                       {
                                          brk6XK7 = true ;
                                          pr_default.readNext(3);
                                       }
                                    }
                                    pr_default.close(3);
                                 }
                                 AV48Lb_ColNomC = A5538Lb_ColNomC ;
                                 if ( (GXutil.strcmp("", AV48Lb_ColNomC)==0) )
                                 {
                                    AV48Lb_ColNomC = A5536Lb_ColNom ;
                                 }
                                 if ( AV65Carvema == 1 )
                                 {
                                    AV48Lb_ColNomC = A5536Lb_ColNom ;
                                 }
                                 AV66FechaR = localUtil.dtoc( AV62LB_FECENT1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                 if ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV62LB_FECENT1)) )
                                 {
                                    AV66FechaR = " " ;
                                 }
                                 if ( AV56NEntradas > 0 )
                                 {
                                    h6XK0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 6, Gx_line+0, 51, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 56, Gx_line+0, 276, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 280, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lb_ColNomC, "")), 469, Gx_line+0, 565, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 571, Gx_line+0, 718, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 726, Gx_line+0, 785, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( AV17Lb_fechaen, "99/99/99"), 797, Gx_line+0, 856, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Dias_e), "ZZZ9")), 860, Gx_line+0, 890, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(localUtil.format( AV21Lb_fechar, "99/99/99"), 900, Gx_line+0, 959, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22Dias_a), "ZZZ9")), 968, Gx_line+0, 998, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 345, Gx_line+0, 463, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50Dias_t), "ZZZ9")), 1002, Gx_line+0, 1032, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56NEntradas), "Z9")), 1036, Gx_line+0, 1052, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5570Lb_Tipo, "")), 1055, Gx_line+0, 1063, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66FechaR, "")), 1073, Gx_line+0, 1132, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                    AV37Num_da = (int)(AV37Num_da+AV22Dias_a) ;
                                    AV38Num_de = (int)(AV38Num_de+AV18Dias_e) ;
                                    AV51Num_dt = (int)(AV51Num_dt+AV50Dias_t) ;
                                    AV44Num_dat = (int)(AV44Num_dat+AV22Dias_a) ;
                                    AV45Num_det = (int)(AV45Num_det+AV18Dias_e) ;
                                    AV52Num_dtt = (int)(AV52Num_dtt+AV50Dias_t) ;
                                    if ( AV22Dias_a > 0 )
                                    {
                                       AV36Num_ra = (int)(AV36Num_ra+1) ;
                                       AV42Num_rat = (int)(AV42Num_rat+1) ;
                                    }
                                    if ( AV18Dias_e > 0 )
                                    {
                                       AV39Num_re = (int)(AV39Num_re+1) ;
                                       AV43Num_ret = (int)(AV43Num_ret+1) ;
                                    }
                                    if ( AV50Dias_t > 0 )
                                    {
                                       AV53Num_rt = (int)(AV53Num_rt+1) ;
                                       AV54Num_rtt = (int)(AV54Num_rtt+1) ;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               brk6XK4 = true ;
               pr_default.readNext(1);
            }
            AV40Med_a = DecimalUtil.doubleToDec(0) ;
            if ( AV36Num_ra > 0 )
            {
               AV40Med_a = DecimalUtil.doubleToDec(AV37Num_da/ (double) (AV36Num_ra)) ;
            }
            AV41Med_e = DecimalUtil.doubleToDec(0) ;
            if ( AV39Num_re > 0 )
            {
               AV41Med_e = DecimalUtil.doubleToDec(AV38Num_de/ (double) (AV39Num_re)) ;
            }
            AV55Med_t = DecimalUtil.doubleToDec(0) ;
            if ( AV53Num_rt > 0 )
            {
               AV55Med_t = DecimalUtil.doubleToDec(AV51Num_dt/ (double) (AV53Num_rt)) ;
            }
            if ( ( AV40Med_a.doubleValue() != 0 ) || ( AV41Med_e.doubleValue() != 0 ) || ( AV55Med_t.doubleValue() != 0 ) )
            {
               h6XK0( false, 27) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40Med_a, "ZZ9.99")), 953, Gx_line+6, 998, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41Med_e, "ZZ9.99")), 846, Gx_line+6, 891, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(846, Gx_line+3, 890, Gx_line+3, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(953, Gx_line+3, 997, Gx_line+3, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55Med_t, "ZZ9.99")), 1001, Gx_line+7, 1046, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1000, Gx_line+3, 1044, Gx_line+3, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
            }
            if ( ! brk6XK4 )
            {
               brk6XK4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         AV40Med_a = DecimalUtil.doubleToDec(0) ;
         if ( AV42Num_rat > 0 )
         {
            AV40Med_a = DecimalUtil.doubleToDec(AV44Num_dat/ (double) (AV42Num_rat)) ;
         }
         AV41Med_e = DecimalUtil.doubleToDec(0) ;
         if ( AV43Num_ret > 0 )
         {
            AV41Med_e = DecimalUtil.doubleToDec(AV45Num_det/ (double) (AV43Num_ret)) ;
         }
         AV55Med_t = DecimalUtil.doubleToDec(0) ;
         if ( AV54Num_rtt > 0 )
         {
            AV55Med_t = DecimalUtil.doubleToDec(AV52Num_dtt/ (double) (AV54Num_rtt)) ;
         }
         if ( ( AV40Med_a.doubleValue() != 0 ) || ( AV41Med_e.doubleValue() != 0 ) || ( AV55Med_t.doubleValue() != 0 ) )
         {
            h6XK0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41Med_e, "ZZ9.99")), 846, Gx_line+6, 891, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40Med_a, "ZZ9.99")), 953, Gx_line+6, 998, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(846, Gx_line+2, 890, Gx_line+2, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(953, Gx_line+2, 997, Gx_line+2, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55Med_t, "ZZ9.99")), 1001, Gx_line+6, 1046, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(1002, Gx_line+2, 1046, Gx_line+2, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6XK0( true, 0) ;
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

   public void h6XK0( boolean bFoot ,
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
            getPrinter().GxDrawLine(6, Gx_line+67, 1104, Gx_line+67, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+109, 267, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(280, Gx_line+110, 338, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(469, Gx_line+110, 564, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(571, Gx_line+110, 717, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(897, Gx_line+110, 962, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(797, Gx_line+110, 855, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(863, Gx_line+110, 890, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(969, Gx_line+110, 996, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(721, Gx_line+110, 790, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "B-A", ""), 865, Gx_line+74, 886, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C-B", ""), 971, Gx_line+74, 992, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16EmprNom, "")), 13, Gx_line+4, 233, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 957, Gx_line+5, 1016, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1030, Gx_line+5, 1089, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 1020, Gx_line+5, 1025, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1027, Gx_line+44, 1072, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit4, "")), 13, Gx_line+39, 347, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit3, "")), 864, Gx_line+5, 942, Gx_line+21, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit5, "")), 957, Gx_line+44, 1021, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit6, "")), 6, Gx_line+93, 70, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit7, "")), 280, Gx_line+93, 338, Gx_line+107, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit9, "")), 571, Gx_line+93, 717, Gx_line+107, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit8, "")), 469, Gx_line+93, 564, Gx_line+107, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit10, "")), 720, Gx_line+75, 758, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(A)", ""), 770, Gx_line+74, 788, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit10, "")), 796, Gx_line+75, 834, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(B)", ""), 836, Gx_line+74, 853, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit11, "")), 721, Gx_line+93, 790, Gx_line+107, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit12, "")), 797, Gx_line+93, 855, Gx_line+107, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit10, "")), 900, Gx_line+75, 938, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(C)", ""), 941, Gx_line+74, 959, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit13, "")), 897, Gx_line+92, 961, Gx_line+109, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Pgmname, "")), 650, Gx_line+5, 807, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit14, "")), 345, Gx_line+93, 409, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+110, 462, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1004, Gx_line+110, 1031, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "C-A", ""), 1007, Gx_line+74, 1029, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(1034, Gx_line+110, 1051, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1055, Gx_line+110, 1080, Gx_line+110, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit15, "")), 863, Gx_line+92, 889, Gx_line+108, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit15, "")), 969, Gx_line+92, 995, Gx_line+108, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit15, "")), 1004, Gx_line+92, 1030, Gx_line+108, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit16, "")), 1034, Gx_line+92, 1051, Gx_line+108, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit17, "")), 1056, Gx_line+92, 1081, Gx_line+108, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV12Fechaei, "99/99/99"), 357, Gx_line+41, 416, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV13Fechaef, "99/99/99"), 421, Gx_line+41, 480, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV14Fechaeni, "99/99/99"), 498, Gx_line+41, 557, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV15Fechaenf, "99/99/99"), 561, Gx_line+41, 620, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV19Fechari, "99/99/99"), 641, Gx_line+41, 700, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV20Fecharf, "99/99/99"), 704, Gx_line+41, 763, Gx_line+58, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+115) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
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
      AV10Cartazi = "" ;
      AV11Cartazf = "" ;
      AV46ArtCodi = "" ;
      AV47ArtCodf = "" ;
      AV12Fechaei = GXutil.nullDate() ;
      AV13Fechaef = GXutil.nullDate() ;
      AV14Fechaeni = GXutil.nullDate() ;
      AV15Fechaenf = GXutil.nullDate() ;
      AV19Fechari = GXutil.nullDate() ;
      AV20Fecharf = GXutil.nullDate() ;
      AV60PTipo = "" ;
      AV61UTipo = "" ;
      AV34Lit1 = "" ;
      AV35Lit2 = "" ;
      AV24Lit3 = "" ;
      AV23Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      AV30Lit10 = "" ;
      AV31Lit11 = "" ;
      AV32Lit12 = "" ;
      AV33Lit13 = "" ;
      AV49Lit14 = "" ;
      AV57Lit15 = "" ;
      AV58Lit16 = "" ;
      AV59Lit17 = "" ;
      GXt_char3 = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P06XK2_A396EmprCod = new String[] {""} ;
      P06XK2_A407EmprNom = new String[] {""} ;
      P06XK2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV16EmprNom = "" ;
      P06XK3_A396EmprCod = new String[] {""} ;
      P06XK3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P06XK3_A5570Lb_Tipo = new String[] {""} ;
      P06XK3_A5540Lb_Cartaz = new String[] {""} ;
      P06XK3_A5533Lb_ArtCod = new String[] {""} ;
      P06XK3_A252CliCod = new int[1] ;
      P06XK3_A5538Lb_ColNomC = new String[] {""} ;
      P06XK3_A5536Lb_ColNom = new String[] {""} ;
      P06XK3_A5532Lb_numero = new int[1] ;
      P06XK3_A279CliNom = new String[] {""} ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5570Lb_Tipo = "" ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      AV17Lb_fechaen = GXutil.nullDate() ;
      AV21Lb_fechar = GXutil.nullDate() ;
      P06XK4_A396EmprCod = new String[] {""} ;
      P06XK4_A5532Lb_numero = new int[1] ;
      P06XK4_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P06XK4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P06XK4_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P06XK4_A5555Lb_opcion = new String[] {""} ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      P06XK5_A396EmprCod = new String[] {""} ;
      P06XK5_A5532Lb_numero = new int[1] ;
      P06XK5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P06XK5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P06XK5_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P06XK5_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      P06XK5_A5555Lb_opcion = new String[] {""} ;
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      AV62LB_FECENT1 = GXutil.nullDate() ;
      GXv_char4 = new String[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_int7 = new short[1] ;
      AV48Lb_ColNomC = "" ;
      AV66FechaR = "" ;
      AV40Med_a = DecimalUtil.ZERO ;
      AV41Med_e = DecimalUtil.ZERO ;
      AV55Med_t = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV73Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.rens025__default(),
         new Object[] {
             new Object[] {
            P06XK2_A396EmprCod, P06XK2_A407EmprNom, P06XK2_n407EmprNom
            }
            , new Object[] {
            P06XK3_A396EmprCod, P06XK3_A5541Lb_FechaE, P06XK3_A5570Lb_Tipo, P06XK3_A5540Lb_Cartaz, P06XK3_A5533Lb_ArtCod, P06XK3_A252CliCod, P06XK3_A5538Lb_ColNomC, P06XK3_A5536Lb_ColNom, P06XK3_A5532Lb_numero, P06XK3_A279CliNom
            }
            , new Object[] {
            P06XK4_A396EmprCod, P06XK4_A5532Lb_numero, P06XK4_A5563Lb_FechaR, P06XK4_A5567Lb_FechaEn, P06XK4_A6461Lb_FecNoa1, P06XK4_A5555Lb_opcion
            }
            , new Object[] {
            P06XK5_A396EmprCod, P06XK5_A5532Lb_numero, P06XK5_A5567Lb_FechaEn, P06XK5_A5563Lb_FechaR, P06XK5_A6461Lb_FecNoa1, P06XK5_A6460Lb_FecEnt1, P06XK5_A5555Lb_opcion
            }
         }
      );
      AV73Pgmname = "GestionLaboratorio.RENS025" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV73Pgmname = "GestionLaboratorio.RENS025" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV64WEns017 ;
   private byte AV65Carvema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV56NEntradas ;
   private short gxcookieaux ;
   private short AV18Dias_e ;
   private short AV22Dias_a ;
   private short AV50Dias_t ;
   private short AV63Dias_cal ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV8PCliCod ;
   private int AV9UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV42Num_rat ;
   private int AV43Num_ret ;
   private int AV54Num_rtt ;
   private int AV44Num_dat ;
   private int AV45Num_det ;
   private int AV52Num_dtt ;
   private int A252CliCod ;
   private int A5532Lb_numero ;
   private int AV36Num_ra ;
   private int AV39Num_re ;
   private int AV53Num_rt ;
   private int AV37Num_da ;
   private int AV38Num_de ;
   private int AV51Num_dt ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV40Med_a ;
   private java.math.BigDecimal AV41Med_e ;
   private java.math.BigDecimal AV55Med_t ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV10Cartazi ;
   private String AV11Cartazf ;
   private String AV46ArtCodi ;
   private String AV47ArtCodf ;
   private String AV60PTipo ;
   private String AV61UTipo ;
   private String AV34Lit1 ;
   private String AV35Lit2 ;
   private String AV24Lit3 ;
   private String AV23Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String AV30Lit10 ;
   private String AV31Lit11 ;
   private String AV32Lit12 ;
   private String AV33Lit13 ;
   private String AV49Lit14 ;
   private String AV57Lit15 ;
   private String AV58Lit16 ;
   private String AV59Lit17 ;
   private String GXt_char3 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV16EmprNom ;
   private String A5570Lb_Tipo ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5555Lb_opcion ;
   private String GXv_char4[] ;
   private String AV48Lb_ColNomC ;
   private String AV66FechaR ;
   private String Gx_time ;
   private String AV73Pgmname ;
   private java.util.Date AV12Fechaei ;
   private java.util.Date AV13Fechaef ;
   private java.util.Date AV14Fechaeni ;
   private java.util.Date AV15Fechaenf ;
   private java.util.Date AV19Fechari ;
   private java.util.Date AV20Fecharf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV17Lb_fechaen ;
   private java.util.Date AV21Lb_fechar ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private java.util.Date AV62LB_FECENT1 ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6XK4 ;
   private boolean brk6XK7 ;
   private IDataStoreProvider pr_default ;
   private String[] P06XK2_A396EmprCod ;
   private String[] P06XK2_A407EmprNom ;
   private boolean[] P06XK2_n407EmprNom ;
   private String[] P06XK3_A396EmprCod ;
   private java.util.Date[] P06XK3_A5541Lb_FechaE ;
   private String[] P06XK3_A5570Lb_Tipo ;
   private String[] P06XK3_A5540Lb_Cartaz ;
   private String[] P06XK3_A5533Lb_ArtCod ;
   private int[] P06XK3_A252CliCod ;
   private String[] P06XK3_A5538Lb_ColNomC ;
   private String[] P06XK3_A5536Lb_ColNom ;
   private int[] P06XK3_A5532Lb_numero ;
   private String[] P06XK3_A279CliNom ;
   private String[] P06XK4_A396EmprCod ;
   private int[] P06XK4_A5532Lb_numero ;
   private java.util.Date[] P06XK4_A5563Lb_FechaR ;
   private java.util.Date[] P06XK4_A5567Lb_FechaEn ;
   private java.util.Date[] P06XK4_A6461Lb_FecNoa1 ;
   private String[] P06XK4_A5555Lb_opcion ;
   private String[] P06XK5_A396EmprCod ;
   private int[] P06XK5_A5532Lb_numero ;
   private java.util.Date[] P06XK5_A5567Lb_FechaEn ;
   private java.util.Date[] P06XK5_A5563Lb_FechaR ;
   private java.util.Date[] P06XK5_A6461Lb_FecNoa1 ;
   private java.util.Date[] P06XK5_A6460Lb_FecEnt1 ;
   private String[] P06XK5_A5555Lb_opcion ;
}

final  class rens025__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06XK2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06XK3", "SELECT T1.EmprCod, T1.Lb_FechaE, T1.Lb_Tipo, T1.Lb_Cartaz, T1.Lb_ArtCod, T1.CliCod, T1.Lb_ColNomC, T1.Lb_ColNom, T1.Lb_numero, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.Lb_Cartaz >= ?) AND (T1.Lb_ArtCod >= ? and T1.Lb_ArtCod <= ?) AND (T1.Lb_Tipo >= ? and T1.Lb_Tipo <= ?) AND (T1.Lb_FechaE >= ? and T1.Lb_FechaE <= ?) AND (T1.Lb_Cartaz <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.Lb_Cartaz ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XK4", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_FechaEn, Lb_FecNoa1, Lb_opcion FROM TXPENS002 WHERE (EmprCod = ? and Lb_numero = ?) AND (Lb_FechaEn >= ? and Lb_FechaEn <= ?) AND (Lb_FechaR >= ? and Lb_FechaR <= ?) ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XK5", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_FechaR, Lb_FecNoa1, Lb_FecEnt1, Lb_opcion FROM TXPENS002 WHERE (EmprCod = ?) AND (Lb_numero = ?) AND (Lb_FechaEn >= ? and Lb_FechaEn <= ?) AND (Lb_FechaR >= ? and Lb_FechaR <= ?) ORDER BY EmprCod, Lb_FecEnt1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setString(3, (String)parms[2], 20);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setString(10, (String)parms[9], 20);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
      }
   }

}

