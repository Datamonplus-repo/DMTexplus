package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rens024_impl extends GXWebReport
{
   public rens024_impl( com.genexus.internet.HttpContext context )
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
            AV51PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV52UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV53Cartazi = httpContext.GetPar( "Cartazi") ;
            AV54Cartazf = httpContext.GetPar( "Cartazf") ;
            AV86ArtCodi = httpContext.GetPar( "ArtCodi") ;
            AV87ArtCodf = httpContext.GetPar( "ArtCodf") ;
            AV55Fechaei = localUtil.parseDateParm( httpContext.GetPar( "Fechaei")) ;
            AV56Fechaef = localUtil.parseDateParm( httpContext.GetPar( "Fechaef")) ;
            AV57Fechaeni = localUtil.parseDateParm( httpContext.GetPar( "Fechaeni")) ;
            AV58Fechaenf = localUtil.parseDateParm( httpContext.GetPar( "Fechaenf")) ;
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
         Gx_out = "FIL" ;
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
         GXt_int1 = AV90WEns017 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS017", ""), GXv_int2) ;
         rens024_impl.this.GXt_int1 = GXv_int2[0] ;
         AV90WEns017 = GXt_int1 ;
         GXt_char3 = AV65Lit1 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV65Lit1 = GXt_char3 ;
         GXt_char3 = AV66Lit2 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV66Lit2 = GXt_char3 ;
         AV63Lit3 = GXutil.trim( AV65Lit1) + " - " + GXutil.trim( AV66Lit2) ;
         GXt_char3 = AV62Lit4 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "RENS024", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV62Lit4 = GXt_char3 ;
         GXt_char3 = AV64Lit5 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV64Lit5 = GXt_char3 ;
         GXt_char3 = AV67Lit6 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV67Lit6 = GXt_char3 ;
         GXt_char3 = AV68Lit7 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV68Lit7 = GXt_char3 ;
         GXt_char3 = AV70Lit8 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT40_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV70Lit8 = GXt_char3 ;
         GXt_char3 = AV69Lit9 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV69Lit9 = GXt_char3 ;
         if ( GXutil.strcmp(AV69Lit9, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char3 = AV69Lit9 ;
            GXv_char4[0] = GXt_char3 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char4) ;
            rens024_impl.this.GXt_char3 = GXv_char4[0] ;
            AV69Lit9 = GXt_char3 ;
         }
         GXt_char3 = AV71Lit10 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV71Lit10 = GXt_char3 ;
         GXt_char3 = AV72Lit11 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN407_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV72Lit11 = GXt_char3 ;
         GXt_char3 = AV73Lit12 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1607_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV73Lit12 = GXt_char3 ;
         GXt_char3 = AV88Lit13 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char4) ;
         rens024_impl.this.GXt_char3 = GXv_char4[0] ;
         AV88Lit13 = GXt_char3 ;
         GXt_int1 = AV95Carvema ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
         rens024_impl.this.GXt_int1 = GXv_int2[0] ;
         AV95Carvema = GXt_int1 ;
         GXt_int1 = AV104Moda21 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
         rens024_impl.this.GXt_int1 = GXv_int2[0] ;
         AV104Moda21 = GXt_int1 ;
         /* Using cursor P06XJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06XJ2_A407EmprNom[0] ;
            n407EmprNom = P06XJ2_n407EmprNom[0] ;
            AV59EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV79Num_rat = 0 ;
         AV81Num_ret = 0 ;
         AV75Num_dat = 0 ;
         AV77Num_det = 0 ;
         /* Using cursor P06XJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV51PCliCod), AV86ArtCodi, AV87ArtCodf, Integer.valueOf(AV52UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6XJ4 = false ;
            A5533Lb_ArtCod = P06XJ3_A5533Lb_ArtCod[0] ;
            A5541Lb_FechaE = P06XJ3_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = P06XJ3_A5540Lb_Cartaz[0] ;
            A5538Lb_ColNomC = P06XJ3_A5538Lb_ColNomC[0] ;
            A5536Lb_ColNom = P06XJ3_A5536Lb_ColNom[0] ;
            A5542Lb_HoraE = P06XJ3_A5542Lb_HoraE[0] ;
            A5532Lb_numero = P06XJ3_A5532Lb_numero[0] ;
            A279CliNom = P06XJ3_A279CliNom[0] ;
            A252CliCod = P06XJ3_A252CliCod[0] ;
            A279CliNom = P06XJ3_A279CliNom[0] ;
            AV78Num_ra = 0 ;
            AV80Num_re = 0 ;
            AV74Num_da = 0 ;
            AV76Num_de = 0 ;
            AV89Imp_l = (byte)(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06XJ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06XJ3_A252CliCod[0] == A252CliCod ) )
            {
               brk6XJ4 = false ;
               A5533Lb_ArtCod = P06XJ3_A5533Lb_ArtCod[0] ;
               A5541Lb_FechaE = P06XJ3_A5541Lb_FechaE[0] ;
               A5540Lb_Cartaz = P06XJ3_A5540Lb_Cartaz[0] ;
               A5538Lb_ColNomC = P06XJ3_A5538Lb_ColNomC[0] ;
               A5536Lb_ColNom = P06XJ3_A5536Lb_ColNom[0] ;
               A5542Lb_HoraE = P06XJ3_A5542Lb_HoraE[0] ;
               A5532Lb_numero = P06XJ3_A5532Lb_numero[0] ;
               A279CliNom = P06XJ3_A279CliNom[0] ;
               A279CliNom = P06XJ3_A279CliNom[0] ;
               if ( GXutil.strcmp(A5540Lb_Cartaz, AV54Cartazf) <= 0 )
               {
                  if ( GXutil.strcmp(A5540Lb_Cartaz, AV53Cartazi) >= 0 )
                  {
                     if ( (( GXutil.resetTime(A5541Lb_FechaE).after( GXutil.resetTime( AV55Fechaei )) ) || ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV55Fechaei)) )) && (( GXutil.resetTime(A5541Lb_FechaE).before( GXutil.resetTime( AV56Fechaef )) ) || ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV56Fechaef)) )) )
                     {
                        if ( ( GXutil.strcmp(A5533Lb_ArtCod, AV86ArtCodi) >= 0 ) && ( GXutil.strcmp(A5533Lb_ArtCod, AV87ArtCodf) <= 0 ) )
                        {
                           AV93Num_op = 0 ;
                           AV94Num_op3 = 0 ;
                           /* Using cursor P06XJ4 */
                           pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV57Fechaeni, AV58Fechaenf});
                           while ( (pr_default.getStatus(2) != 101) )
                           {
                              A5567Lb_FechaEn = P06XJ4_A5567Lb_FechaEn[0] ;
                              A5566Lb_Estado = P06XJ4_A5566Lb_Estado[0] ;
                              A5555Lb_opcion = P06XJ4_A5555Lb_opcion[0] ;
                              if ( A5566Lb_Estado == 3 )
                              {
                                 AV94Num_op3 = (int)(AV94Num_op3+1) ;
                              }
                              AV93Num_op = (int)(AV93Num_op+1) ;
                              pr_default.readNext(2);
                           }
                           pr_default.close(2);
                           if ( ( AV93Num_op > 0 ) && ( AV94Num_op3 == AV93Num_op ) )
                           {
                           }
                           else
                           {
                              AV60Lb_fechaen = GXutil.nullDate() ;
                              AV102Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
                              /* Using cursor P06XJ5 */
                              pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV57Fechaeni, AV58Fechaenf});
                              while ( (pr_default.getStatus(3) != 101) )
                              {
                                 A5567Lb_FechaEn = P06XJ5_A5567Lb_FechaEn[0] ;
                                 A5568Lb_HoraEn = P06XJ5_A5568Lb_HoraEn[0] ;
                                 A5555Lb_opcion = P06XJ5_A5555Lb_opcion[0] ;
                                 AV60Lb_fechaen = A5567Lb_FechaEn ;
                                 AV102Lb_HoraEn = A5568Lb_HoraEn ;
                                 pr_default.readNext(3);
                              }
                              pr_default.close(3);
                              AV61Dias_e = (short)(0) ;
                              if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Lb_fechaen)) )
                              {
                                 GXv_char4[0] = A396EmprCod ;
                                 GXv_date5[0] = A5541Lb_FechaE ;
                                 GXv_date6[0] = AV60Lb_fechaen ;
                                 GXv_int7[0] = AV61Dias_e ;
                                 GXv_int8[0] = AV97Dias_f ;
                                 new app.gestionlaboratorio.pdialbd(remoteHandle, context).execute( GXv_char4, GXv_date5, GXv_date6, GXv_int7, GXv_int8) ;
                                 rens024_impl.this.A396EmprCod = GXv_char4[0] ;
                                 rens024_impl.this.A5541Lb_FechaE = GXv_date5[0] ;
                                 rens024_impl.this.AV60Lb_fechaen = GXv_date6[0] ;
                                 rens024_impl.this.AV61Dias_e = GXv_int7[0] ;
                                 rens024_impl.this.AV97Dias_f = GXv_int8[0] ;
                                 if ( AV61Dias_e <= 0 )
                                 {
                                    AV61Dias_e = (short)(GXutil.ddiff(AV60Lb_fechaen,A5541Lb_FechaE)) ;
                                 }
                              }
                              AV85Lb_ColNomC = A5538Lb_ColNomC ;
                              if ( (GXutil.strcmp("", A5538Lb_ColNomC)==0) )
                              {
                                 AV85Lb_ColNomC = A5536Lb_ColNom ;
                              }
                              if ( AV95Carvema == 1 )
                              {
                                 AV85Lb_ColNomC = A5536Lb_ColNom ;
                              }
                              AV89Imp_l = (byte)(1) ;
                              if ( AV61Dias_e <= 0 )
                              {
                                 AV61Dias_e = (short)(1) ;
                              }
                              AV99Var1 = localUtil.dtoc( A5541Lb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                              AV100Var2 = localUtil.ttoc( A5542Lb_HoraE, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                              AV101Var3 = AV99Var1 + " " + AV100Var2 ;
                              AV98Data1 = localUtil.ctot( AV101Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                              AV99Var1 = localUtil.dtoc( AV60Lb_fechaen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                              AV100Var2 = localUtil.ttoc( AV102Lb_HoraEn, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                              AV101Var3 = AV99Var1 + " " + AV100Var2 ;
                              AV103Data2 = localUtil.ctot( AV101Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                              if ( ( AV90WEns017 == 1 ) && ( AV104Moda21 == 0 ) )
                              {
                                 AV61Dias_e = (short)(0) ;
                                 AV91Dias_cal = (short)(0) ;
                                 AV60Lb_fechaen = GXutil.nullDate() ;
                                 /* Using cursor P06XJ6 */
                                 pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV57Fechaeni, AV58Fechaenf});
                                 while ( (pr_default.getStatus(4) != 101) )
                                 {
                                    brk6XJ8 = false ;
                                    A5567Lb_FechaEn = P06XJ6_A5567Lb_FechaEn[0] ;
                                    A5568Lb_HoraEn = P06XJ6_A5568Lb_HoraEn[0] ;
                                    A6460Lb_FecEnt1 = P06XJ6_A6460Lb_FecEnt1[0] ;
                                    A5555Lb_opcion = P06XJ6_A5555Lb_opcion[0] ;
                                    AV92LB_FECENT1 = GXutil.nullDate() ;
                                    if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6460Lb_FecEnt1)) )
                                    {
                                       AV92LB_FECENT1 = A6460Lb_FecEnt1 ;
                                    }
                                    AV60Lb_fechaen = GXutil.nullDate() ;
                                    AV102Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
                                    while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P06XJ6_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P06XJ6_A6460Lb_FecEnt1[0]), GXutil.resetTime(A6460Lb_FecEnt1)) )
                                    {
                                       brk6XJ8 = false ;
                                       A5567Lb_FechaEn = P06XJ6_A5567Lb_FechaEn[0] ;
                                       A5568Lb_HoraEn = P06XJ6_A5568Lb_HoraEn[0] ;
                                       A5555Lb_opcion = P06XJ6_A5555Lb_opcion[0] ;
                                       if ( P06XJ6_A5532Lb_numero[0] == A5532Lb_numero )
                                       {
                                          AV60Lb_fechaen = A5567Lb_FechaEn ;
                                          AV102Lb_HoraEn = A5568Lb_HoraEn ;
                                       }
                                       brk6XJ8 = true ;
                                       pr_default.readNext(4);
                                    }
                                    if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92LB_FECENT1)) )
                                    {
                                       GXv_char4[0] = A396EmprCod ;
                                       GXv_date6[0] = AV92LB_FECENT1 ;
                                       GXv_date5[0] = AV60Lb_fechaen ;
                                       GXv_int8[0] = AV91Dias_cal ;
                                       GXv_int7[0] = AV97Dias_f ;
                                       new app.gestionlaboratorio.pdialbd(remoteHandle, context).execute( GXv_char4, GXv_date6, GXv_date5, GXv_int8, GXv_int7) ;
                                       rens024_impl.this.A396EmprCod = GXv_char4[0] ;
                                       rens024_impl.this.AV92LB_FECENT1 = GXv_date6[0] ;
                                       rens024_impl.this.AV60Lb_fechaen = GXv_date5[0] ;
                                       rens024_impl.this.AV91Dias_cal = GXv_int8[0] ;
                                       rens024_impl.this.AV97Dias_f = GXv_int7[0] ;
                                       Gx_msg = httpContext.getMessage( "&LB_FECENT1=", "") + localUtil.dtoc( AV92LB_FECENT1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
                                       Gx_msg += httpContext.getMessage( "&Lb_fechaen=", "") + localUtil.dtoc( AV60Lb_fechaen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
                                       Gx_msg += httpContext.getMessage( "&Dias_cal  =", "") + GXutil.str( AV91Dias_cal, 4, 0) + GXutil.chr( (short)(13)) ;
                                       System.out.println( Gx_msg );
                                       if ( AV91Dias_cal == 0 )
                                       {
                                          AV61Dias_e = (short)(AV61Dias_e+((GXutil.ddiff(AV60Lb_fechaen,AV92LB_FECENT1)))) ;
                                       }
                                       else
                                       {
                                          AV61Dias_e = (short)(AV61Dias_e+AV91Dias_cal) ;
                                       }
                                    }
                                    if ( ! brk6XJ8 )
                                    {
                                       brk6XJ8 = true ;
                                       pr_default.readNext(4);
                                    }
                                 }
                                 pr_default.close(4);
                                 if ( AV61Dias_e <= 0 )
                                 {
                                    AV61Dias_e = (short)(1) ;
                                 }
                              }
                              if ( GXutil.dateCompare(GXutil.resetTime(A5541Lb_FechaE), GXutil.resetTime(AV92LB_FECENT1)) )
                              {
                                 AV96FechaR = " " ;
                              }
                              else
                              {
                                 AV96FechaR = localUtil.dtoc( AV92LB_FECENT1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                              }
                              if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Lb_fechaen)) )
                              {
                                 AV61Dias_e = (short)(0) ;
                              }
                              h6XJ0( false, 18) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 20, Gx_line+0, 65, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 70, Gx_line+0, 290, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 299, Gx_line+0, 358, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Lb_ColNomC, "")), 489, Gx_line+1, 585, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 593, Gx_line+1, 740, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 750, Gx_line+1, 809, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(localUtil.format( AV60Lb_fechaen, "99/99/99"), 830, Gx_line+1, 889, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61Dias_e), "ZZZ9")), 900, Gx_line+1, 930, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 365, Gx_line+1, 483, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96FechaR, "")), 945, Gx_line+0, 1019, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+18) ;
                              AV76Num_de = (int)(AV76Num_de+AV61Dias_e) ;
                              AV77Num_det = (int)(AV77Num_det+AV61Dias_e) ;
                              if ( AV61Dias_e > 0 )
                              {
                                 AV80Num_re = (int)(AV80Num_re+1) ;
                                 AV81Num_ret = (int)(AV81Num_ret+1) ;
                              }
                           }
                        }
                     }
                  }
               }
               brk6XJ4 = true ;
               pr_default.readNext(1);
            }
            AV82Med_e = DecimalUtil.doubleToDec(0) ;
            if ( AV80Num_re > 0 )
            {
               AV82Med_e = DecimalUtil.doubleToDec(AV76Num_de/ (double) (AV80Num_re)) ;
            }
            if ( AV89Imp_l > 0 )
            {
               h6XJ0( false, 33) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82Med_e, "ZZ9.99")), 885, Gx_line+10, 930, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(885, Gx_line+5, 929, Gx_line+5, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
            }
            if ( ! brk6XJ4 )
            {
               brk6XJ4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         AV84Med_a = DecimalUtil.doubleToDec(0) ;
         if ( AV79Num_rat > 0 )
         {
            AV84Med_a = DecimalUtil.doubleToDec(AV75Num_dat/ (double) (AV79Num_rat)) ;
         }
         AV82Med_e = DecimalUtil.doubleToDec(0) ;
         if ( AV81Num_ret > 0 )
         {
            AV82Med_e = DecimalUtil.doubleToDec(AV77Num_det/ (double) (AV81Num_ret)) ;
         }
         h6XJ0( false, 25) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82Med_e, "ZZ9.99")), 885, Gx_line+6, 930, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(885, Gx_line+2, 929, Gx_line+2, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+25) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6XJ0( true, 0) ;
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

   public void h6XJ0( boolean bFoot ,
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
            getPrinter().GxDrawLine(10, Gx_line+61, 952, Gx_line+61, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59EmprNom, "")), 13, Gx_line+4, 233, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 811, Gx_line+5, 870, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 890, Gx_line+5, 949, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 877, Gx_line+5, 882, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 893, Gx_line+35, 938, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit4, "")), 13, Gx_line+30, 347, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit3, "")), 721, Gx_line+5, 799, Gx_line+21, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit5, "")), 818, Gx_line+35, 882, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dias", ""), 902, Gx_line+92, 929, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(25, Gx_line+108, 286, Gx_line+108, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(299, Gx_line+109, 357, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(489, Gx_line+109, 584, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(593, Gx_line+109, 739, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(830, Gx_line+109, 888, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(902, Gx_line+109, 929, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(750, Gx_line+109, 819, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "B-A", ""), 904, Gx_line+74, 925, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit6, "")), 25, Gx_line+92, 88, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit7, "")), 299, Gx_line+92, 357, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit9, "")), 593, Gx_line+92, 739, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit8, "")), 489, Gx_line+92, 584, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit10, "")), 750, Gx_line+74, 788, Gx_line+88, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(A)", ""), 799, Gx_line+74, 817, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit10, "")), 830, Gx_line+74, 868, Gx_line+88, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(B)", ""), 875, Gx_line+74, 892, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit11, "")), 750, Gx_line+92, 819, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit12, "")), 830, Gx_line+92, 888, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Lit13, "")), 365, Gx_line+92, 428, Gx_line+106, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(365, Gx_line+109, 482, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Pgmname, "")), 417, Gx_line+33, 637, Gx_line+50, 0+256, 0, 0, 0) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
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
      AV53Cartazi = "" ;
      AV54Cartazf = "" ;
      AV86ArtCodi = "" ;
      AV87ArtCodf = "" ;
      AV55Fechaei = GXutil.nullDate() ;
      AV56Fechaef = GXutil.nullDate() ;
      AV57Fechaeni = GXutil.nullDate() ;
      AV58Fechaenf = GXutil.nullDate() ;
      AV65Lit1 = "" ;
      AV66Lit2 = "" ;
      AV63Lit3 = "" ;
      AV62Lit4 = "" ;
      AV64Lit5 = "" ;
      AV67Lit6 = "" ;
      AV68Lit7 = "" ;
      AV70Lit8 = "" ;
      AV69Lit9 = "" ;
      AV71Lit10 = "" ;
      AV72Lit11 = "" ;
      AV73Lit12 = "" ;
      AV88Lit13 = "" ;
      GXt_char3 = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P06XJ2_A396EmprCod = new String[] {""} ;
      P06XJ2_A407EmprNom = new String[] {""} ;
      P06XJ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV59EmprNom = "" ;
      P06XJ3_A396EmprCod = new String[] {""} ;
      P06XJ3_A5533Lb_ArtCod = new String[] {""} ;
      P06XJ3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P06XJ3_A5540Lb_Cartaz = new String[] {""} ;
      P06XJ3_A5538Lb_ColNomC = new String[] {""} ;
      P06XJ3_A5536Lb_ColNom = new String[] {""} ;
      P06XJ3_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P06XJ3_A5532Lb_numero = new int[1] ;
      P06XJ3_A279CliNom = new String[] {""} ;
      P06XJ3_A252CliCod = new int[1] ;
      A5533Lb_ArtCod = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      P06XJ4_A396EmprCod = new String[] {""} ;
      P06XJ4_A5532Lb_numero = new int[1] ;
      P06XJ4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P06XJ4_A5566Lb_Estado = new byte[1] ;
      P06XJ4_A5555Lb_opcion = new String[] {""} ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV60Lb_fechaen = GXutil.nullDate() ;
      AV102Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      P06XJ5_A396EmprCod = new String[] {""} ;
      P06XJ5_A5532Lb_numero = new int[1] ;
      P06XJ5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P06XJ5_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P06XJ5_A5555Lb_opcion = new String[] {""} ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV85Lb_ColNomC = "" ;
      AV99Var1 = "" ;
      AV100Var2 = "" ;
      AV101Var3 = "" ;
      AV98Data1 = GXutil.resetTime( GXutil.nullDate() );
      AV103Data2 = GXutil.resetTime( GXutil.nullDate() );
      P06XJ6_A396EmprCod = new String[] {""} ;
      P06XJ6_A5532Lb_numero = new int[1] ;
      P06XJ6_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P06XJ6_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      P06XJ6_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      P06XJ6_A5555Lb_opcion = new String[] {""} ;
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      AV92LB_FECENT1 = GXutil.nullDate() ;
      GXv_char4 = new String[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_int8 = new short[1] ;
      GXv_int7 = new short[1] ;
      Gx_msg = "" ;
      AV96FechaR = "" ;
      AV82Med_e = DecimalUtil.ZERO ;
      AV84Med_a = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV111Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.rens024__default(),
         new Object[] {
             new Object[] {
            P06XJ2_A396EmprCod, P06XJ2_A407EmprNom, P06XJ2_n407EmprNom
            }
            , new Object[] {
            P06XJ3_A396EmprCod, P06XJ3_A5533Lb_ArtCod, P06XJ3_A5541Lb_FechaE, P06XJ3_A5540Lb_Cartaz, P06XJ3_A5538Lb_ColNomC, P06XJ3_A5536Lb_ColNom, P06XJ3_A5542Lb_HoraE, P06XJ3_A5532Lb_numero, P06XJ3_A279CliNom, P06XJ3_A252CliCod
            }
            , new Object[] {
            P06XJ4_A396EmprCod, P06XJ4_A5532Lb_numero, P06XJ4_A5567Lb_FechaEn, P06XJ4_A5566Lb_Estado, P06XJ4_A5555Lb_opcion
            }
            , new Object[] {
            P06XJ5_A396EmprCod, P06XJ5_A5532Lb_numero, P06XJ5_A5567Lb_FechaEn, P06XJ5_A5568Lb_HoraEn, P06XJ5_A5555Lb_opcion
            }
            , new Object[] {
            P06XJ6_A396EmprCod, P06XJ6_A5532Lb_numero, P06XJ6_A5567Lb_FechaEn, P06XJ6_A5568Lb_HoraEn, P06XJ6_A6460Lb_FecEnt1, P06XJ6_A5555Lb_opcion
            }
         }
      );
      AV111Pgmname = "GestionLaboratorio.RENS024" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV111Pgmname = "GestionLaboratorio.RENS024" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV90WEns017 ;
   private byte AV95Carvema ;
   private byte AV104Moda21 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV89Imp_l ;
   private byte A5566Lb_Estado ;
   private short gxcookieaux ;
   private short AV61Dias_e ;
   private short AV97Dias_f ;
   private short AV91Dias_cal ;
   private short GXv_int8[] ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV51PCliCod ;
   private int AV52UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV79Num_rat ;
   private int AV81Num_ret ;
   private int AV75Num_dat ;
   private int AV77Num_det ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int AV78Num_ra ;
   private int AV80Num_re ;
   private int AV74Num_da ;
   private int AV76Num_de ;
   private int AV93Num_op ;
   private int AV94Num_op3 ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV82Med_e ;
   private java.math.BigDecimal AV84Med_a ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV53Cartazi ;
   private String AV54Cartazf ;
   private String AV86ArtCodi ;
   private String AV87ArtCodf ;
   private String AV65Lit1 ;
   private String AV66Lit2 ;
   private String AV63Lit3 ;
   private String AV62Lit4 ;
   private String AV64Lit5 ;
   private String AV67Lit6 ;
   private String AV68Lit7 ;
   private String AV70Lit8 ;
   private String AV69Lit9 ;
   private String AV71Lit10 ;
   private String AV72Lit11 ;
   private String AV73Lit12 ;
   private String AV88Lit13 ;
   private String GXt_char3 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV59EmprNom ;
   private String A5533Lb_ArtCod ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5555Lb_opcion ;
   private String AV85Lb_ColNomC ;
   private String AV99Var1 ;
   private String AV100Var2 ;
   private String AV101Var3 ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String AV96FechaR ;
   private String Gx_time ;
   private String AV111Pgmname ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date AV102Lb_HoraEn ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date AV98Data1 ;
   private java.util.Date AV103Data2 ;
   private java.util.Date AV55Fechaei ;
   private java.util.Date AV56Fechaef ;
   private java.util.Date AV57Fechaeni ;
   private java.util.Date AV58Fechaenf ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV60Lb_fechaen ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private java.util.Date AV92LB_FECENT1 ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6XJ4 ;
   private boolean brk6XJ8 ;
   private IDataStoreProvider pr_default ;
   private String[] P06XJ2_A396EmprCod ;
   private String[] P06XJ2_A407EmprNom ;
   private boolean[] P06XJ2_n407EmprNom ;
   private String[] P06XJ3_A396EmprCod ;
   private String[] P06XJ3_A5533Lb_ArtCod ;
   private java.util.Date[] P06XJ3_A5541Lb_FechaE ;
   private String[] P06XJ3_A5540Lb_Cartaz ;
   private String[] P06XJ3_A5538Lb_ColNomC ;
   private String[] P06XJ3_A5536Lb_ColNom ;
   private java.util.Date[] P06XJ3_A5542Lb_HoraE ;
   private int[] P06XJ3_A5532Lb_numero ;
   private String[] P06XJ3_A279CliNom ;
   private int[] P06XJ3_A252CliCod ;
   private String[] P06XJ4_A396EmprCod ;
   private int[] P06XJ4_A5532Lb_numero ;
   private java.util.Date[] P06XJ4_A5567Lb_FechaEn ;
   private byte[] P06XJ4_A5566Lb_Estado ;
   private String[] P06XJ4_A5555Lb_opcion ;
   private String[] P06XJ5_A396EmprCod ;
   private int[] P06XJ5_A5532Lb_numero ;
   private java.util.Date[] P06XJ5_A5567Lb_FechaEn ;
   private java.util.Date[] P06XJ5_A5568Lb_HoraEn ;
   private String[] P06XJ5_A5555Lb_opcion ;
   private String[] P06XJ6_A396EmprCod ;
   private int[] P06XJ6_A5532Lb_numero ;
   private java.util.Date[] P06XJ6_A5567Lb_FechaEn ;
   private java.util.Date[] P06XJ6_A5568Lb_HoraEn ;
   private java.util.Date[] P06XJ6_A6460Lb_FecEnt1 ;
   private String[] P06XJ6_A5555Lb_opcion ;
}

final  class rens024__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06XJ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06XJ3", "SELECT T1.EmprCod, T1.Lb_ArtCod, T1.Lb_FechaE, T1.Lb_Cartaz, T1.Lb_ColNomC, T1.Lb_ColNom, T1.Lb_HoraE, T1.Lb_numero, T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ?) AND (T1.Lb_ArtCod >= ? and T1.Lb_ArtCod <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.Lb_Cartaz ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XJ4", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_Estado, Lb_opcion FROM TXPENS002 WHERE (EmprCod = ? and Lb_numero = ?) AND (Lb_FechaEn >= ? and Lb_FechaEn <= ?) ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XJ5", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_HoraEn, Lb_opcion FROM TXPENS002 WHERE (EmprCod = ? and Lb_numero = ?) AND (Lb_FechaEn >= ? and Lb_FechaEn <= ?) ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XJ6", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_HoraEn, Lb_FecEnt1, Lb_opcion FROM TXPENS002 WHERE (EmprCod = ?) AND (Lb_numero = ?) AND (Lb_FechaEn >= ? and Lb_FechaEn <= ?) ORDER BY EmprCod, Lb_FecEnt1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
      }
   }

}

