package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa00101_impl extends GXWebReport
{
   public rfa00101_impl( com.genexus.internet.HttpContext context )
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
            AV15PCLI = (int)(GXutil.lval( httpContext.GetPar( "PCLI"))) ;
            AV16UCLI = (int)(GXutil.lval( httpContext.GetPar( "UCLI"))) ;
            AV17Any = (short)(GXutil.lval( httpContext.GetPar( "Any"))) ;
            AV18PRIO = httpContext.GetPar( "PRIO") ;
            AV19ImpCod = httpContext.GetPar( "ImpCod") ;
            AV20SerieF = (byte)(GXutil.lval( httpContext.GetPar( "SerieF"))) ;
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
         GXt_char1 = AV35Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV85Pgmdesc, (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit0 = GXt_char1 ;
         GXt_char1 = AV36Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit1 = GXt_char1 ;
         GXt_char1 = AV37Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit2 = GXt_char1 ;
         GXt_char1 = AV38Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit3 = GXt_char1 ;
         GXt_char1 = AV39Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN735_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit4 = GXt_char1 ;
         GXt_char1 = AV40Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit5 = GXt_char1 ;
         GXt_char1 = AV41Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2124_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit6 = GXt_char1 ;
         GXt_char1 = AV42Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2164_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit7 = GXt_char1 ;
         GXt_char1 = AV43Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2280_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit8 = GXt_char1 ;
         GXt_char1 = AV44Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2002_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit9 = GXt_char1 ;
         GXt_char1 = AV45Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2286_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit10 = GXt_char1 ;
         GXt_char1 = AV46Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2210_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit11 = GXt_char1 ;
         GXt_char1 = AV47Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2208_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit12 = GXt_char1 ;
         GXt_char1 = AV48Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2009_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit13 = GXt_char1 ;
         GXt_char1 = AV49Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2425_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit14 = GXt_char1 ;
         GXt_char1 = AV50Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2330_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit15 = GXt_char1 ;
         GXt_char1 = AV51Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2323_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit16 = GXt_char1 ;
         GXt_char1 = AV52Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2108_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit17 = GXt_char1 ;
         GXt_char1 = AV53Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN723_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit18 = GXt_char1 ;
         GXt_char1 = AV54Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2447_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit19 = GXt_char1 ;
         GXt_char1 = AV55Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2447_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit20 = GXt_char1 ;
         GXt_char1 = AV56Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2485_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit21 = GXt_char1 ;
         GXt_char1 = AV58Lit22 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit22 = GXt_char1 ;
         GXt_char1 = AV60Lit23 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV60Lit23 = GXt_char1 ;
         GXt_char1 = AV79Lit24 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL065_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV79Lit24 = GXt_char1 ;
         GXt_char1 = AV80Lit25 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1198_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV80Lit25 = GXt_char1 ;
         GXt_char1 = AV81Lit26 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN227_", ""), (byte)(99), GXv_char2) ;
         rfa00101_impl.this.GXt_char1 = GXv_char2[0] ;
         AV81Lit26 = GXt_char1 ;
         if ( GXutil.strcmp(AV79Lit24, httpContext.getMessage( "WCFL065_", "")) == 0 )
         {
            AV79Lit24 = "€" ;
         }
         if ( GXutil.strcmp(AV35Lit0, httpContext.getMessage( "RFA00101", "")) == 0 )
         {
            AV35Lit0 = httpContext.getMessage( "FACTURACION ANUAL POR IMPORTE", "") ;
         }
         GXv_int3[0] = AV64FlagPor ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int3) ;
         rfa00101_impl.this.AV64FlagPor = GXv_int3[0] ;
         AV74FacKyM = (byte)(0) ;
         GXv_int3[0] = AV74FacKyM ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACKYM", ""), GXv_int3) ;
         rfa00101_impl.this.AV74FacKyM = GXv_int3[0] ;
         AV63Cont = (byte)(1) ;
         AV25Anyo = AV17Any ;
         AV65Day = (byte)(1) ;
         while ( AV63Cont <= 12 )
         {
            AV66Meses[AV63Cont-1] = AV63Cont ;
            AV63Cont = (byte)(AV63Cont+1) ;
         }
         AV63Cont = (byte)(1) ;
         while ( AV63Cont <= 12 )
         {
            AV67Fecha = localUtil.ymdtod( AV25Anyo, AV66Meses[AV63Cont-1], AV65Day) ;
            if ( (0==AV64FlagPor) )
            {
               AV62NomMes[AV63Cont-1] = GXutil.substring( localUtil.cmonth( AV67Fecha, httpContext.getMessage( "spa", "")), 1, 10) ;
            }
            else
            {
               AV62NomMes[AV63Cont-1] = GXutil.substring( localUtil.cmonth( AV67Fecha, httpContext.getMessage( "por", "")), 1, 10) ;
            }
            AV63Cont = (byte)(AV63Cont+1) ;
         }
         /* Using cursor P07AD2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07AD2_A407EmprNom[0] ;
            n407EmprNom = P07AD2_n407EmprNom[0] ;
            A963Ser1 = P07AD2_A963Ser1[0] ;
            n963Ser1 = P07AD2_n963Ser1[0] ;
            A2387Ser2 = P07AD2_A2387Ser2[0] ;
            n2387Ser2 = P07AD2_n2387Ser2[0] ;
            A2389Ser3 = P07AD2_A2389Ser3[0] ;
            n2389Ser3 = P07AD2_n2389Ser3[0] ;
            A4215Ser4 = P07AD2_A4215Ser4[0] ;
            n4215Ser4 = P07AD2_n4215Ser4[0] ;
            A4217Ser5 = P07AD2_A4217Ser5[0] ;
            n4217Ser5 = P07AD2_n4217Ser5[0] ;
            A4219Ser6 = P07AD2_A4219Ser6[0] ;
            n4219Ser6 = P07AD2_n4219Ser6[0] ;
            A4221Ser7 = P07AD2_A4221Ser7[0] ;
            n4221Ser7 = P07AD2_n4221Ser7[0] ;
            AV23NomEmp = A407EmprNom ;
            if ( AV20SerieF == 1 )
            {
               AV57EstSerFac = A963Ser1 ;
            }
            else
            {
               if ( AV20SerieF == 2 )
               {
                  AV57EstSerFac = A2387Ser2 ;
               }
               else
               {
                  if ( AV20SerieF == 3 )
                  {
                     AV57EstSerFac = A2389Ser3 ;
                  }
                  else
                  {
                     if ( AV20SerieF == 4 )
                     {
                        AV57EstSerFac = A4215Ser4 ;
                     }
                     else
                     {
                        if ( AV20SerieF == 5 )
                        {
                           AV57EstSerFac = A4217Ser5 ;
                        }
                        else
                        {
                           if ( AV20SerieF == 6 )
                           {
                              AV57EstSerFac = A4219Ser6 ;
                           }
                           else
                           {
                              if ( AV20SerieF == 7 )
                              {
                                 AV57EstSerFac = A4221Ser7 ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char2[0] = A396EmprCod ;
         GXv_int4[0] = AV15PCLI ;
         GXv_int5[0] = AV16UCLI ;
         GXv_int6[0] = AV25Anyo ;
         GXv_char7[0] = AV18PRIO ;
         GXv_decimal8[0] = AV82TotCom ;
         GXv_char9[0] = AV57EstSerFac ;
         new app.facturacion.pordcli(remoteHandle, context).execute( GXv_char2, GXv_int4, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8, GXv_char9) ;
         rfa00101_impl.this.A396EmprCod = GXv_char2[0] ;
         rfa00101_impl.this.AV15PCLI = GXv_int4[0] ;
         rfa00101_impl.this.AV16UCLI = GXv_int5[0] ;
         rfa00101_impl.this.AV25Anyo = GXv_int6[0] ;
         rfa00101_impl.this.AV18PRIO = GXv_char7[0] ;
         rfa00101_impl.this.AV82TotCom = GXv_decimal8[0] ;
         rfa00101_impl.this.AV57EstSerFac = GXv_char9[0] ;
         AV25Anyo = AV17Any ;
         if ( GXutil.strcmp(AV18PRIO, "2") == 0 )
         {
            AV33Prio2 = "0" ;
         }
         else
         {
            AV33Prio2 = AV18PRIO ;
         }
         AV26I = (byte)(1) ;
         while ( AV26I <= 12 )
         {
            AV29TotCprTot[AV26I-1] = DecimalUtil.doubleToDec(0) ;
            AV26I = (byte)(AV26I+1) ;
         }
         AV31TotValTot = DecimalUtil.doubleToDec(0) ;
         if ( ( GXutil.strcmp(AV18PRIO, "0") == 0 ) || ( GXutil.strcmp(AV18PRIO, "1") == 0 ) )
         {
            AV61TotGeral = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P07AD3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15PCLI), Integer.valueOf(AV16UCLI), Short.valueOf(AV25Anyo), AV57EstSerFac});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A425EstAny = P07AD3_A425EstAny[0] ;
               A2755EstSerFac = P07AD3_A2755EstSerFac[0] ;
               A252CliCod = P07AD3_A252CliCod[0] ;
               A1439ImpCli0 = P07AD3_A1439ImpCli0[0] ;
               n1439ImpCli0 = P07AD3_n1439ImpCli0[0] ;
               A1440ImpCli1 = P07AD3_A1440ImpCli1[0] ;
               n1440ImpCli1 = P07AD3_n1440ImpCli1[0] ;
               A902AcuOrd0 = P07AD3_A902AcuOrd0[0] ;
               n902AcuOrd0 = P07AD3_n902AcuOrd0[0] ;
               A426EstMes = P07AD3_A426EstMes[0] ;
               A902AcuOrd0 = P07AD3_A902AcuOrd0[0] ;
               n902AcuOrd0 = P07AD3_n902AcuOrd0[0] ;
               if ( GXutil.strcmp(AV18PRIO, "0") == 0 )
               {
                  AV61TotGeral = AV61TotGeral.add(A1439ImpCli0) ;
               }
               else
               {
                  AV61TotGeral = AV61TotGeral.add(A1440ImpCli1) ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV26I = (byte)(1) ;
            while ( AV26I <= 12 )
            {
               AV28TotCprMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
               AV69TotKgsMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
               AV75TotMtsMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
               AV26I = (byte)(AV26I+1) ;
            }
            AV30TotValCpr = DecimalUtil.doubleToDec(0) ;
            AV72TotMesKgs = DecimalUtil.doubleToDec(0) ;
            AV78TotMesMts = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P07AD5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV15PCLI), Integer.valueOf(AV16UCLI), Short.valueOf(AV25Anyo), AV57EstSerFac});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A425EstAny = P07AD5_A425EstAny[0] ;
               A2755EstSerFac = P07AD5_A2755EstSerFac[0] ;
               A252CliCod = P07AD5_A252CliCod[0] ;
               A279CliNom = P07AD5_A279CliNom[0] ;
               A902AcuOrd0 = P07AD5_A902AcuOrd0[0] ;
               n902AcuOrd0 = P07AD5_n902AcuOrd0[0] ;
               A1432AcuCli0 = P07AD5_A1432AcuCli0[0] ;
               A1433AcuCli1 = P07AD5_A1433AcuCli1[0] ;
               A279CliNom = P07AD5_A279CliNom[0] ;
               A1432AcuCli0 = P07AD5_A1432AcuCli0[0] ;
               A1433AcuCli1 = P07AD5_A1433AcuCli1[0] ;
               AV59CliNom = GXutil.substring( A279CliNom, 1, 25) ;
               AV32TotValCli = DecimalUtil.doubleToDec(0) ;
               AV70TotKgsCli = DecimalUtil.doubleToDec(0) ;
               AV77TotMtsCli = DecimalUtil.doubleToDec(0) ;
               AV26I = (byte)(1) ;
               while ( AV26I <= 12 )
               {
                  AV27ValCprMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
                  AV71KgsMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
                  AV76MtsMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
                  /* Using cursor P07AD6 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(AV26I)});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A426EstMes = P07AD6_A426EstMes[0] ;
                     A1439ImpCli0 = P07AD6_A1439ImpCli0[0] ;
                     n1439ImpCli0 = P07AD6_n1439ImpCli0[0] ;
                     A1367FacKg0 = P07AD6_A1367FacKg0[0] ;
                     n1367FacKg0 = P07AD6_n1367FacKg0[0] ;
                     A1365FacMt0 = P07AD6_A1365FacMt0[0] ;
                     n1365FacMt0 = P07AD6_n1365FacMt0[0] ;
                     A1440ImpCli1 = P07AD6_A1440ImpCli1[0] ;
                     n1440ImpCli1 = P07AD6_n1440ImpCli1[0] ;
                     A1368FacKg1 = P07AD6_A1368FacKg1[0] ;
                     n1368FacKg1 = P07AD6_n1368FacKg1[0] ;
                     A1366FacMt1 = P07AD6_A1366FacMt1[0] ;
                     n1366FacMt1 = P07AD6_n1366FacMt1[0] ;
                     if ( GXutil.strcmp(AV18PRIO, "0") == 0 )
                     {
                        AV27ValCprMes[AV26I-1] = A1439ImpCli0 ;
                        AV32TotValCli = AV32TotValCli.add(A1439ImpCli0) ;
                        AV28TotCprMes[AV26I-1] = AV28TotCprMes[AV26I-1].add(A1439ImpCli0) ;
                        AV69TotKgsMes[AV26I-1] = AV69TotKgsMes[AV26I-1].add(A1367FacKg0) ;
                        AV70TotKgsCli = AV70TotKgsCli.add(A1367FacKg0) ;
                        AV71KgsMes[AV26I-1] = A1367FacKg0 ;
                        AV75TotMtsMes[AV26I-1] = AV75TotMtsMes[AV26I-1].add(A1365FacMt0) ;
                        AV77TotMtsCli = AV77TotMtsCli.add(A1365FacMt0) ;
                        AV76MtsMes[AV26I-1] = A1365FacMt0 ;
                     }
                     else
                     {
                        AV27ValCprMes[AV26I-1] = A1440ImpCli1 ;
                        AV32TotValCli = AV32TotValCli.add(A1440ImpCli1) ;
                        AV28TotCprMes[AV26I-1] = AV28TotCprMes[AV26I-1].add(A1440ImpCli1) ;
                        AV69TotKgsMes[AV26I-1] = AV69TotKgsMes[AV26I-1].add(A1368FacKg1) ;
                        AV70TotKgsCli = AV70TotKgsCli.add(A1368FacKg1) ;
                        AV71KgsMes[AV26I-1] = A1368FacKg1 ;
                        AV75TotMtsMes[AV26I-1] = AV75TotMtsMes[AV26I-1].add(A1366FacMt1) ;
                        AV77TotMtsCli = AV77TotMtsCli.add(A1366FacMt1) ;
                        AV76MtsMes[AV26I-1] = A1366FacMt1 ;
                     }
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(3);
                  AV26I = (byte)(AV26I+1) ;
               }
               AV26I = (byte)(1) ;
               while ( AV26I <= 12 )
               {
                  AV72TotMesKgs = AV72TotMesKgs.add(AV71KgsMes[AV26I-1]) ;
                  AV78TotMesMts = AV78TotMesMts.add(AV76MtsMes[AV26I-1]) ;
                  AV26I = (byte)(AV26I+1) ;
               }
               if ( GXutil.strcmp(AV18PRIO, "0") == 0 )
               {
                  AV30TotValCpr = AV30TotValCpr.add(A1432AcuCli0) ;
                  AV34AcuImpr = A1432AcuCli0 ;
               }
               else
               {
                  AV30TotValCpr = AV30TotValCpr.add(A1433AcuCli1) ;
                  AV34AcuImpr = A1433AcuCli1 ;
               }
               AV68Por = (short)(0) ;
               if ( AV61TotGeral.doubleValue() > 0 )
               {
                  AV68Por = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( ((AV32TotValCli.divide(AV61TotGeral, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))), 0))) ;
               }
               h7AD0( false, 32) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[1-1], "ZZZZZZZZ9.99")), 140, Gx_line+0, 204, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[2-1], "ZZZZZZZZ9.99")), 206, Gx_line+0, 270, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[3-1], "ZZZZZZZZ9.99")), 272, Gx_line+0, 336, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[4-1], "ZZZZZZZZ9.99")), 338, Gx_line+0, 402, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[5-1], "ZZZZZZZZ9.99")), 403, Gx_line+0, 467, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[6-1], "ZZZZZZZZ9.99")), 471, Gx_line+0, 535, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[7-1], "ZZZZZZZZ9.99")), 538, Gx_line+0, 602, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[8-1], "ZZZZZZZZ9.99")), 603, Gx_line+0, 667, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[10-1], "ZZZZZZZZ9.99")), 735, Gx_line+0, 799, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[11-1], "ZZZZZZZZ9.99")), 803, Gx_line+0, 867, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[12-1], "ZZZZZZZZ9.99")), 870, Gx_line+0, 934, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TotValCli, "ZZZZZZZZ9.99")), 959, Gx_line+0, 1023, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59CliNom, "")), 6, Gx_line+0, 137, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV68Por), "ZZ9")), 1028, Gx_line+0, 1045, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[1-1], "Z,ZZZ,ZZ9.9")), 145, Gx_line+17, 203, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[2-1], "Z,ZZZ,ZZ9.9")), 211, Gx_line+17, 269, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[3-1], "Z,ZZZ,ZZ9.9")), 277, Gx_line+17, 335, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[4-1], "Z,ZZZ,ZZ9.9")), 343, Gx_line+17, 401, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[5-1], "Z,ZZZ,ZZ9.9")), 408, Gx_line+17, 466, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[6-1], "Z,ZZZ,ZZ9.9")), 476, Gx_line+17, 534, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[7-1], "Z,ZZZ,ZZ9.9")), 543, Gx_line+17, 601, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[8-1], "Z,ZZZ,ZZ9.9")), 608, Gx_line+17, 666, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[9-1], "Z,ZZZ,ZZ9.9")), 675, Gx_line+17, 733, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[10-1], "Z,ZZZ,ZZ9.9")), 741, Gx_line+17, 799, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[11-1], "Z,ZZZ,ZZ9.9")), 808, Gx_line+17, 866, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[12-1], "Z,ZZZ,ZZ9.9")), 875, Gx_line+17, 933, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70TotKgsCli, "Z,ZZZ,ZZ9.9")), 965, Gx_line+17, 1023, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[9-1], "ZZZZZZZZ9.99")), 670, Gx_line+0, 734, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Lit24, "")), 938, Gx_line+0, 955, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Lit25, "")), 938, Gx_line+18, 955, Gx_line+32, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+32) ;
               if ( AV74FacKyM == 1 )
               {
                  h7AD0( false, 40) ;
                  getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[11-1], "ZZZZZZZ9.99")), 808, Gx_line+4, 866, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[10-1], "ZZZZZZZ9.99")), 741, Gx_line+4, 799, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[9-1], "ZZZZZZZ9.99")), 675, Gx_line+4, 733, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[8-1], "ZZZZZZZ9.99")), 608, Gx_line+4, 666, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[7-1], "ZZZZZZZ9.99")), 543, Gx_line+4, 601, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[6-1], "ZZZZZZZ9.99")), 476, Gx_line+4, 534, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[5-1], "ZZZZZZZ9.99")), 408, Gx_line+4, 466, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[4-1], "ZZZZZZZ9.99")), 343, Gx_line+4, 401, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[3-1], "ZZZZZZZ9.99")), 277, Gx_line+4, 335, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[2-1], "ZZZZZZZ9.99")), 211, Gx_line+4, 269, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[1-1], "ZZZZZZZ9.99")), 145, Gx_line+4, 203, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[12-1], "ZZZZZZZ9.99")), 875, Gx_line+4, 933, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77TotMtsCli, "ZZZZZZZ9.99")), 965, Gx_line+4, 1023, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit26, "")), 938, Gx_line+4, 955, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+40) ;
               }
               else
               {
                  h7AD0( false, 20) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h7AD0( false, 46) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "* *   T O T A L", ""), 17, Gx_line+13, 96, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[1-1], "ZZZZZZZZ9.99")), 140, Gx_line+13, 204, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[2-1], "ZZZZZZZZ9.99")), 206, Gx_line+13, 270, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[3-1], "ZZZZZZZZ9.99")), 272, Gx_line+13, 336, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[4-1], "ZZZZZZZZ9.99")), 338, Gx_line+13, 402, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[5-1], "ZZZZZZZZ9.99")), 403, Gx_line+13, 467, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[6-1], "ZZZZZZZZ9.99")), 471, Gx_line+13, 535, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[7-1], "ZZZZZZZZ9.99")), 538, Gx_line+13, 602, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[8-1], "ZZZZZZZZ9.99")), 603, Gx_line+13, 667, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[9-1], "ZZZZZZZZ9.99")), 670, Gx_line+13, 734, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[10-1], "ZZZZZZZZ9.99")), 735, Gx_line+13, 799, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[11-1], "ZZZZZZZZ9.99")), 803, Gx_line+13, 867, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[12-1], "ZZZZZZZZ9.99")), 870, Gx_line+13, 934, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TotValCpr, "ZZZZZZZZ9.99")), 959, Gx_line+13, 1023, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[1-1], "Z,ZZZ,ZZ9.9")), 145, Gx_line+29, 203, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[2-1], "Z,ZZZ,ZZ9.9")), 211, Gx_line+29, 269, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[3-1], "Z,ZZZ,ZZ9.9")), 277, Gx_line+29, 335, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[4-1], "Z,ZZZ,ZZ9.9")), 343, Gx_line+29, 401, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[5-1], "Z,ZZZ,ZZ9.9")), 408, Gx_line+29, 466, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[6-1], "Z,ZZZ,ZZ9.9")), 476, Gx_line+29, 534, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[7-1], "Z,ZZZ,ZZ9.9")), 543, Gx_line+29, 601, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[8-1], "Z,ZZZ,ZZ9.9")), 608, Gx_line+29, 666, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[9-1], "Z,ZZZ,ZZ9.9")), 675, Gx_line+29, 733, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[10-1], "Z,ZZZ,ZZ9.9")), 741, Gx_line+29, 799, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[11-1], "Z,ZZZ,ZZ9.9")), 808, Gx_line+29, 866, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[12-1], "Z,ZZZ,ZZ9.9")), 875, Gx_line+29, 933, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV72TotMesKgs, "Z,ZZZ,ZZ9.9")), 965, Gx_line+29, 1023, Gx_line+43, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(134, Gx_line+4, 1081, Gx_line+4, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Lit24, "")), 938, Gx_line+13, 955, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Lit25, "")), 938, Gx_line+29, 955, Gx_line+43, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+46) ;
            if ( AV74FacKyM == 1 )
            {
               h7AD0( false, 20) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[1-1], "ZZZZZZZ9.99")), 145, Gx_line+0, 203, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[2-1], "ZZZZZZZ9.99")), 211, Gx_line+0, 269, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[3-1], "ZZZZZZZ9.99")), 277, Gx_line+0, 335, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[4-1], "ZZZZZZZ9.99")), 343, Gx_line+0, 401, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[5-1], "ZZZZZZZ9.99")), 408, Gx_line+0, 466, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[6-1], "ZZZZZZZ9.99")), 476, Gx_line+0, 534, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[7-1], "ZZZZZZZ9.99")), 543, Gx_line+0, 601, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[8-1], "ZZZZZZZ9.99")), 608, Gx_line+0, 666, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[9-1], "ZZZZZZZ9.99")), 675, Gx_line+0, 733, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[10-1], "ZZZZZZZ9.99")), 741, Gx_line+0, 799, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[11-1], "ZZZZZZZ9.99")), 808, Gx_line+0, 866, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[12-1], "ZZZZZZZ9.99")), 875, Gx_line+0, 933, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV78TotMesMts, "ZZZZZZZ9.99")), 965, Gx_line+0, 1023, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit26, "")), 938, Gx_line+0, 955, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
            else
            {
               h7AD0( false, 14) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+14) ;
            }
            AV26I = (byte)(1) ;
            while ( AV26I <= 12 )
            {
               AV29TotCprTot[AV26I-1] = AV29TotCprTot[AV26I-1].add(AV28TotCprMes[AV26I-1]) ;
               AV26I = (byte)(AV26I+1) ;
            }
            AV31TotValTot = AV31TotValTot.add(AV30TotValCpr) ;
            if ( GXutil.strcmp(AV18PRIO, "2") == 0 )
            {
               AV33Prio2 = "1" ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
         }
         if ( GXutil.strcmp(AV18PRIO, "2") == 0 )
         {
            AV26I = (byte)(1) ;
            while ( AV26I <= 12 )
            {
               AV28TotCprMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
               AV69TotKgsMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
               AV75TotMtsMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
               AV26I = (byte)(AV26I+1) ;
            }
            AV61TotGeral = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P07AD7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV15PCLI), Integer.valueOf(AV16UCLI), Short.valueOf(AV25Anyo), AV57EstSerFac});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A425EstAny = P07AD7_A425EstAny[0] ;
               A2755EstSerFac = P07AD7_A2755EstSerFac[0] ;
               A252CliCod = P07AD7_A252CliCod[0] ;
               A1440ImpCli1 = P07AD7_A1440ImpCli1[0] ;
               n1440ImpCli1 = P07AD7_n1440ImpCli1[0] ;
               A1439ImpCli0 = P07AD7_A1439ImpCli0[0] ;
               n1439ImpCli0 = P07AD7_n1439ImpCli0[0] ;
               A902AcuOrd0 = P07AD7_A902AcuOrd0[0] ;
               n902AcuOrd0 = P07AD7_n902AcuOrd0[0] ;
               A426EstMes = P07AD7_A426EstMes[0] ;
               A902AcuOrd0 = P07AD7_A902AcuOrd0[0] ;
               n902AcuOrd0 = P07AD7_n902AcuOrd0[0] ;
               AV61TotGeral = AV61TotGeral.add(A1439ImpCli0).add(A1440ImpCli1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV30TotValCpr = DecimalUtil.doubleToDec(0) ;
            AV72TotMesKgs = DecimalUtil.doubleToDec(0) ;
            AV78TotMesMts = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P07AD9 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV15PCLI), Integer.valueOf(AV16UCLI), Short.valueOf(AV25Anyo), AV57EstSerFac});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A425EstAny = P07AD9_A425EstAny[0] ;
               A2755EstSerFac = P07AD9_A2755EstSerFac[0] ;
               A252CliCod = P07AD9_A252CliCod[0] ;
               A279CliNom = P07AD9_A279CliNom[0] ;
               A902AcuOrd0 = P07AD9_A902AcuOrd0[0] ;
               n902AcuOrd0 = P07AD9_n902AcuOrd0[0] ;
               A1433AcuCli1 = P07AD9_A1433AcuCli1[0] ;
               A1432AcuCli0 = P07AD9_A1432AcuCli0[0] ;
               A279CliNom = P07AD9_A279CliNom[0] ;
               A1433AcuCli1 = P07AD9_A1433AcuCli1[0] ;
               A1432AcuCli0 = P07AD9_A1432AcuCli0[0] ;
               AV59CliNom = GXutil.substring( A279CliNom, 1, 25) ;
               AV32TotValCli = DecimalUtil.doubleToDec(0) ;
               AV70TotKgsCli = DecimalUtil.doubleToDec(0) ;
               AV26I = (byte)(1) ;
               while ( AV26I <= 12 )
               {
                  AV27ValCprMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
                  AV71KgsMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
                  AV76MtsMes[AV26I-1] = DecimalUtil.doubleToDec(0) ;
                  /* Using cursor P07AD10 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac, Byte.valueOf(AV26I)});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A426EstMes = P07AD10_A426EstMes[0] ;
                     A1440ImpCli1 = P07AD10_A1440ImpCli1[0] ;
                     n1440ImpCli1 = P07AD10_n1440ImpCli1[0] ;
                     A1439ImpCli0 = P07AD10_A1439ImpCli0[0] ;
                     n1439ImpCli0 = P07AD10_n1439ImpCli0[0] ;
                     A1367FacKg0 = P07AD10_A1367FacKg0[0] ;
                     n1367FacKg0 = P07AD10_n1367FacKg0[0] ;
                     A1368FacKg1 = P07AD10_A1368FacKg1[0] ;
                     n1368FacKg1 = P07AD10_n1368FacKg1[0] ;
                     A1365FacMt0 = P07AD10_A1365FacMt0[0] ;
                     n1365FacMt0 = P07AD10_n1365FacMt0[0] ;
                     A1366FacMt1 = P07AD10_A1366FacMt1[0] ;
                     n1366FacMt1 = P07AD10_n1366FacMt1[0] ;
                     AV27ValCprMes[AV26I-1] = A1439ImpCli0.add(A1440ImpCli1) ;
                     AV32TotValCli = AV32TotValCli.add(A1439ImpCli0).add(A1440ImpCli1) ;
                     AV28TotCprMes[AV26I-1] = AV28TotCprMes[AV26I-1].add(A1439ImpCli0).add(A1440ImpCli1) ;
                     AV69TotKgsMes[AV26I-1] = AV69TotKgsMes[AV26I-1].add(A1368FacKg1).add(A1367FacKg0) ;
                     AV70TotKgsCli = AV70TotKgsCli.add(A1368FacKg1).add(A1367FacKg0) ;
                     AV71KgsMes[AV26I-1] = A1368FacKg1.add(A1367FacKg0) ;
                     AV75TotMtsMes[AV26I-1] = AV75TotMtsMes[AV26I-1].add(A1366FacMt1).add(A1365FacMt0) ;
                     AV77TotMtsCli = AV77TotMtsCli.add(A1366FacMt1).add(A1365FacMt0) ;
                     AV76MtsMes[AV26I-1] = A1366FacMt1.add(A1365FacMt0) ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(6);
                  AV26I = (byte)(AV26I+1) ;
               }
               AV26I = (byte)(1) ;
               while ( AV26I <= 12 )
               {
                  AV72TotMesKgs = AV72TotMesKgs.add(AV71KgsMes[AV26I-1]) ;
                  AV78TotMesMts = AV78TotMesMts.add(AV76MtsMes[AV26I-1]) ;
                  AV26I = (byte)(AV26I+1) ;
               }
               AV30TotValCpr = AV30TotValCpr.add(A1432AcuCli0).add(A1433AcuCli1) ;
               AV34AcuImpr = A1432AcuCli0.add(A1433AcuCli1) ;
               AV68Por = (short)(0) ;
               if ( AV61TotGeral.doubleValue() > 0 )
               {
                  AV68Por = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( ((AV32TotValCli.divide(AV61TotGeral, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))), 0))) ;
               }
               h7AD0( false, 31) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[1-1], "ZZZZZZZZ9.99")), 140, Gx_line+0, 204, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[2-1], "ZZZZZZZZ9.99")), 206, Gx_line+0, 270, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[3-1], "ZZZZZZZZ9.99")), 272, Gx_line+0, 336, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[4-1], "ZZZZZZZZ9.99")), 338, Gx_line+0, 402, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[5-1], "ZZZZZZZZ9.99")), 403, Gx_line+0, 467, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[6-1], "ZZZZZZZZ9.99")), 471, Gx_line+0, 535, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[7-1], "ZZZZZZZZ9.99")), 538, Gx_line+0, 602, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[8-1], "ZZZZZZZZ9.99")), 603, Gx_line+0, 667, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[9-1], "ZZZZZZZZ9.99")), 670, Gx_line+0, 734, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[10-1], "ZZZZZZZZ9.99")), 735, Gx_line+0, 799, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[11-1], "ZZZZZZZZ9.99")), 803, Gx_line+0, 867, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValCprMes[12-1], "ZZZZZZZZ9.99")), 870, Gx_line+0, 934, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TotValCli, "ZZZZZZZZ9.99")), 959, Gx_line+0, 1023, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59CliNom, "")), 6, Gx_line+0, 137, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV68Por), "ZZ9")), 1030, Gx_line+0, 1047, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[1-1], "Z,ZZZ,ZZ9.9")), 145, Gx_line+17, 203, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[2-1], "Z,ZZZ,ZZ9.9")), 211, Gx_line+17, 269, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[3-1], "Z,ZZZ,ZZ9.9")), 277, Gx_line+17, 335, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[4-1], "Z,ZZZ,ZZ9.9")), 343, Gx_line+17, 401, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[5-1], "Z,ZZZ,ZZ9.9")), 408, Gx_line+17, 466, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[6-1], "Z,ZZZ,ZZ9.9")), 476, Gx_line+17, 534, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[7-1], "Z,ZZZ,ZZ9.9")), 543, Gx_line+17, 601, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[8-1], "Z,ZZZ,ZZ9.9")), 608, Gx_line+17, 666, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[9-1], "Z,ZZZ,ZZ9.9")), 675, Gx_line+17, 733, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[10-1], "Z,ZZZ,ZZ9.9")), 741, Gx_line+17, 799, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[11-1], "Z,ZZZ,ZZ9.9")), 808, Gx_line+17, 866, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71KgsMes[12-1], "Z,ZZZ,ZZ9.9")), 875, Gx_line+17, 933, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70TotKgsCli, "Z,ZZZ,ZZ9.9")), 965, Gx_line+17, 1023, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Lit24, "")), 938, Gx_line+0, 955, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Lit25, "")), 938, Gx_line+17, 955, Gx_line+31, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
               if ( AV74FacKyM == 1 )
               {
                  h7AD0( false, 40) ;
                  getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[11-1], "ZZZZZZZ9.99")), 808, Gx_line+4, 866, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[10-1], "ZZZZZZZ9.99")), 741, Gx_line+4, 799, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[9-1], "ZZZZZZZ9.99")), 675, Gx_line+4, 733, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[8-1], "ZZZZZZZ9.99")), 608, Gx_line+4, 666, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[7-1], "ZZZZZZZ9.99")), 543, Gx_line+4, 601, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[6-1], "ZZZZZZZ9.99")), 476, Gx_line+4, 534, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[5-1], "ZZZZZZZ9.99")), 408, Gx_line+4, 466, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[4-1], "ZZZZZZZ9.99")), 343, Gx_line+4, 401, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[3-1], "ZZZZZZZ9.99")), 277, Gx_line+4, 335, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[2-1], "ZZZZZZZ9.99")), 211, Gx_line+4, 269, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[1-1], "ZZZZZZZ9.99")), 145, Gx_line+4, 203, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV76MtsMes[12-1], "ZZZZZZZ9.99")), 875, Gx_line+4, 933, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77TotMtsCli, "ZZZZZZZ9.99")), 965, Gx_line+4, 1023, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit26, "")), 938, Gx_line+4, 955, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+40) ;
               }
               else
               {
                  h7AD0( false, 20) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            h7AD0( false, 46) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "* *   T O T A L", ""), 14, Gx_line+11, 93, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[1-1], "ZZZZZZZZ9.99")), 140, Gx_line+11, 204, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[2-1], "ZZZZZZZZ9.99")), 206, Gx_line+11, 270, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[3-1], "ZZZZZZZZ9.99")), 272, Gx_line+11, 336, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[4-1], "ZZZZZZZZ9.99")), 338, Gx_line+11, 402, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[5-1], "ZZZZZZZZ9.99")), 403, Gx_line+11, 467, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[6-1], "ZZZZZZZZ9.99")), 471, Gx_line+11, 535, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[7-1], "ZZZZZZZZ9.99")), 538, Gx_line+11, 602, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[8-1], "ZZZZZZZZ9.99")), 603, Gx_line+11, 667, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[9-1], "ZZZZZZZZ9.99")), 670, Gx_line+11, 734, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[10-1], "ZZZZZZZZ9.99")), 735, Gx_line+11, 799, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[11-1], "ZZZZZZZZ9.99")), 803, Gx_line+11, 867, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotCprMes[12-1], "ZZZZZZZZ9.99")), 870, Gx_line+11, 934, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TotValCpr, "ZZZZZZZZ9.99")), 959, Gx_line+11, 1023, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[1-1], "Z,ZZZ,ZZ9.9")), 145, Gx_line+28, 203, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[2-1], "Z,ZZZ,ZZ9.9")), 211, Gx_line+28, 269, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[3-1], "Z,ZZZ,ZZ9.9")), 277, Gx_line+28, 335, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[4-1], "Z,ZZZ,ZZ9.9")), 343, Gx_line+28, 401, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[5-1], "Z,ZZZ,ZZ9.9")), 408, Gx_line+28, 466, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[6-1], "Z,ZZZ,ZZ9.9")), 476, Gx_line+28, 534, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[7-1], "Z,ZZZ,ZZ9.9")), 543, Gx_line+28, 601, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[8-1], "Z,ZZZ,ZZ9.9")), 608, Gx_line+28, 666, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[9-1], "Z,ZZZ,ZZ9.9")), 675, Gx_line+28, 733, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[10-1], "Z,ZZZ,ZZ9.9")), 741, Gx_line+28, 799, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[11-1], "Z,ZZZ,ZZ9.9")), 808, Gx_line+28, 866, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TotKgsMes[12-1], "Z,ZZZ,ZZ9.9")), 875, Gx_line+28, 933, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV72TotMesKgs, "Z,ZZZ,ZZ9.9")), 965, Gx_line+28, 1023, Gx_line+42, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(134, Gx_line+5, 1081, Gx_line+5, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Lit24, "")), 938, Gx_line+11, 955, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Lit25, "")), 938, Gx_line+28, 955, Gx_line+42, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+46) ;
            if ( AV74FacKyM == 1 )
            {
               h7AD0( false, 19) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[1-1], "ZZZZZZZ9.99")), 145, Gx_line+0, 203, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[2-1], "ZZZZZZZ9.99")), 211, Gx_line+0, 269, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[3-1], "ZZZZZZZ9.99")), 277, Gx_line+0, 335, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[4-1], "ZZZZZZZ9.99")), 343, Gx_line+0, 401, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[5-1], "ZZZZZZZ9.99")), 408, Gx_line+0, 466, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[6-1], "ZZZZZZZ9.99")), 476, Gx_line+0, 534, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[7-1], "ZZZZZZZ9.99")), 543, Gx_line+0, 601, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[8-1], "ZZZZZZZ9.99")), 608, Gx_line+0, 666, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[9-1], "ZZZZZZZ9.99")), 675, Gx_line+0, 733, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[10-1], "ZZZZZZZ9.99")), 741, Gx_line+0, 799, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[11-1], "ZZZZZZZ9.99")), 808, Gx_line+0, 866, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV75TotMtsMes[12-1], "ZZZZZZZ9.99")), 875, Gx_line+0, 933, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV78TotMesMts, "ZZZZZZZ9.99")), 965, Gx_line+0, 1023, Gx_line+14, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit26, "")), 938, Gx_line+0, 955, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               h7AD0( false, 14) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+14) ;
            }
            AV26I = (byte)(1) ;
            while ( AV26I <= 12 )
            {
               AV29TotCprTot[AV26I-1] = AV29TotCprTot[AV26I-1].add(AV28TotCprMes[AV26I-1]) ;
               AV26I = (byte)(AV26I+1) ;
            }
            AV31TotValTot = AV31TotValTot.add(AV30TotValCpr) ;
         }
         if ( GXutil.strcmp(AV18PRIO, "2") == 0 )
         {
            h7AD0( false, 28) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TOTAL FINAL ...........", ""), 14, Gx_line+10, 135, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[1-1], "ZZZZZZZZ9.99")), 140, Gx_line+9, 204, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[2-1], "ZZZZZZZZ9.99")), 206, Gx_line+9, 270, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[3-1], "ZZZZZZZZ9.99")), 272, Gx_line+9, 336, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[4-1], "ZZZZZZZZ9.99")), 338, Gx_line+9, 402, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[5-1], "ZZZZZZZZ9.99")), 403, Gx_line+9, 467, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[6-1], "ZZZZZZZZ9.99")), 471, Gx_line+9, 535, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[7-1], "ZZZZZZZZ9.99")), 538, Gx_line+9, 602, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[8-1], "ZZZZZZZZ9.99")), 603, Gx_line+9, 667, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[9-1], "ZZZZZZZZ9.99")), 670, Gx_line+9, 734, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[10-1], "ZZZZZZZZ9.99")), 735, Gx_line+9, 799, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[11-1], "ZZZZZZZZ9.99")), 803, Gx_line+9, 867, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotCprTot[12-1], "ZZZZZZZZ9.99")), 870, Gx_line+9, 934, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotValTot, "ZZZZZZZZZ9.99")), 954, Gx_line+9, 1023, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+4, 1081, Gx_line+4, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(134, Gx_line+25, 1081, Gx_line+25, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Lit24, "")), 938, Gx_line+9, 955, Gx_line+23, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+28) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7AD0( true, 0) ;
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

   public void h7AD0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23NomEmp, "")), 6, Gx_line+17, 163, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 879, Gx_line+17, 922, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 989, Gx_line+17, 1032, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 993, Gx_line+50, 1025, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 6, Gx_line+83, 43, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Prio2, "")), 299, Gx_line+50, 305, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17Any), "ZZZ9")), 350, Gx_line+50, 372, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit22, "")), 416, Gx_line+50, 448, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57EstSerFac, "")), 481, Gx_line+50, 498, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 467, Gx_line+50, 473, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Pgmname, "")), 650, Gx_line+50, 807, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 982, Gx_line+83, 1009, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit23, "")), 314, Gx_line+50, 336, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit0, "")), 6, Gx_line+50, 215, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 1025, Gx_line+83, 1031, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[1-1], "")), 150, Gx_line+84, 203, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[2-1], "")), 217, Gx_line+84, 270, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[3-1], "")), 282, Gx_line+84, 335, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[4-1], "")), 348, Gx_line+84, 401, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[5-1], "")), 414, Gx_line+84, 467, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[6-1], "")), 481, Gx_line+84, 534, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[7-1], "")), 548, Gx_line+84, 601, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[8-1], "")), 614, Gx_line+84, 667, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[9-1], "")), 680, Gx_line+84, 733, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[10-1], "")), 746, Gx_line+84, 799, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[11-1], "")), 814, Gx_line+84, 867, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62NomMes[12-1], "")), 880, Gx_line+84, 933, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit1, "")), 835, Gx_line+17, 862, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit2, "")), 952, Gx_line+17, 974, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit3, "")), 942, Gx_line+50, 974, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(4, Gx_line+71, 1081, Gx_line+71, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+102, 1081, Gx_line+102, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+111) ;
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
      AV18PRIO = "" ;
      AV19ImpCod = "" ;
      AV35Lit0 = "" ;
      AV85Pgmdesc = "" ;
      AV36Lit1 = "" ;
      AV37Lit2 = "" ;
      AV38Lit3 = "" ;
      AV39Lit4 = "" ;
      AV40Lit5 = "" ;
      AV41Lit6 = "" ;
      AV42Lit7 = "" ;
      AV43Lit8 = "" ;
      AV44Lit9 = "" ;
      AV45Lit10 = "" ;
      AV46Lit11 = "" ;
      AV47Lit12 = "" ;
      AV48Lit13 = "" ;
      AV49Lit14 = "" ;
      AV50Lit15 = "" ;
      AV51Lit16 = "" ;
      AV52Lit17 = "" ;
      AV53Lit18 = "" ;
      AV54Lit19 = "" ;
      AV55Lit20 = "" ;
      AV56Lit21 = "" ;
      AV58Lit22 = "" ;
      AV60Lit23 = "" ;
      AV79Lit24 = "" ;
      AV80Lit25 = "" ;
      AV81Lit26 = "" ;
      GXt_char1 = "" ;
      GXv_int3 = new byte[1] ;
      AV66Meses = new byte[12] ;
      AV67Fecha = GXutil.nullDate() ;
      AV62NomMes = new String[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV62NomMes[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P07AD2_A396EmprCod = new String[] {""} ;
      P07AD2_A407EmprNom = new String[] {""} ;
      P07AD2_n407EmprNom = new boolean[] {false} ;
      P07AD2_A963Ser1 = new String[] {""} ;
      P07AD2_n963Ser1 = new boolean[] {false} ;
      P07AD2_A2387Ser2 = new String[] {""} ;
      P07AD2_n2387Ser2 = new boolean[] {false} ;
      P07AD2_A2389Ser3 = new String[] {""} ;
      P07AD2_n2389Ser3 = new boolean[] {false} ;
      P07AD2_A4215Ser4 = new String[] {""} ;
      P07AD2_n4215Ser4 = new boolean[] {false} ;
      P07AD2_A4217Ser5 = new String[] {""} ;
      P07AD2_n4217Ser5 = new boolean[] {false} ;
      P07AD2_A4219Ser6 = new String[] {""} ;
      P07AD2_n4219Ser6 = new boolean[] {false} ;
      P07AD2_A4221Ser7 = new String[] {""} ;
      P07AD2_n4221Ser7 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      A4215Ser4 = "" ;
      A4217Ser5 = "" ;
      A4219Ser6 = "" ;
      A4221Ser7 = "" ;
      AV23NomEmp = "" ;
      AV57EstSerFac = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new short[1] ;
      GXv_char7 = new String[1] ;
      AV82TotCom = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char9 = new String[1] ;
      AV33Prio2 = "" ;
      AV29TotCprTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV29TotCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV31TotValTot = DecimalUtil.ZERO ;
      AV61TotGeral = DecimalUtil.ZERO ;
      P07AD3_A396EmprCod = new String[] {""} ;
      P07AD3_A425EstAny = new short[1] ;
      P07AD3_A2755EstSerFac = new String[] {""} ;
      P07AD3_A252CliCod = new int[1] ;
      P07AD3_A1439ImpCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD3_n1439ImpCli0 = new boolean[] {false} ;
      P07AD3_A1440ImpCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD3_n1440ImpCli1 = new boolean[] {false} ;
      P07AD3_A902AcuOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD3_n902AcuOrd0 = new boolean[] {false} ;
      P07AD3_A426EstMes = new byte[1] ;
      A2755EstSerFac = "" ;
      A1439ImpCli0 = DecimalUtil.ZERO ;
      A1440ImpCli1 = DecimalUtil.ZERO ;
      A902AcuOrd0 = DecimalUtil.ZERO ;
      AV28TotCprMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV28TotCprMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV69TotKgsMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV69TotKgsMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV75TotMtsMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV75TotMtsMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV30TotValCpr = DecimalUtil.ZERO ;
      AV72TotMesKgs = DecimalUtil.ZERO ;
      AV78TotMesMts = DecimalUtil.ZERO ;
      P07AD5_A396EmprCod = new String[] {""} ;
      P07AD5_A425EstAny = new short[1] ;
      P07AD5_A2755EstSerFac = new String[] {""} ;
      P07AD5_A252CliCod = new int[1] ;
      P07AD5_A279CliNom = new String[] {""} ;
      P07AD5_A902AcuOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD5_n902AcuOrd0 = new boolean[] {false} ;
      P07AD5_A1432AcuCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD5_A1433AcuCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A279CliNom = "" ;
      A1432AcuCli0 = DecimalUtil.ZERO ;
      A1433AcuCli1 = DecimalUtil.ZERO ;
      AV59CliNom = "" ;
      AV32TotValCli = DecimalUtil.ZERO ;
      AV70TotKgsCli = DecimalUtil.ZERO ;
      AV77TotMtsCli = DecimalUtil.ZERO ;
      AV27ValCprMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV27ValCprMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV71KgsMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV71KgsMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV76MtsMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV76MtsMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P07AD6_A396EmprCod = new String[] {""} ;
      P07AD6_A252CliCod = new int[1] ;
      P07AD6_A425EstAny = new short[1] ;
      P07AD6_A2755EstSerFac = new String[] {""} ;
      P07AD6_A426EstMes = new byte[1] ;
      P07AD6_A1439ImpCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD6_n1439ImpCli0 = new boolean[] {false} ;
      P07AD6_A1367FacKg0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD6_n1367FacKg0 = new boolean[] {false} ;
      P07AD6_A1365FacMt0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD6_n1365FacMt0 = new boolean[] {false} ;
      P07AD6_A1440ImpCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD6_n1440ImpCli1 = new boolean[] {false} ;
      P07AD6_A1368FacKg1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD6_n1368FacKg1 = new boolean[] {false} ;
      P07AD6_A1366FacMt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD6_n1366FacMt1 = new boolean[] {false} ;
      A1367FacKg0 = DecimalUtil.ZERO ;
      A1365FacMt0 = DecimalUtil.ZERO ;
      A1368FacKg1 = DecimalUtil.ZERO ;
      A1366FacMt1 = DecimalUtil.ZERO ;
      AV34AcuImpr = DecimalUtil.ZERO ;
      P07AD7_A396EmprCod = new String[] {""} ;
      P07AD7_A425EstAny = new short[1] ;
      P07AD7_A2755EstSerFac = new String[] {""} ;
      P07AD7_A252CliCod = new int[1] ;
      P07AD7_A1440ImpCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD7_n1440ImpCli1 = new boolean[] {false} ;
      P07AD7_A1439ImpCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD7_n1439ImpCli0 = new boolean[] {false} ;
      P07AD7_A902AcuOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD7_n902AcuOrd0 = new boolean[] {false} ;
      P07AD7_A426EstMes = new byte[1] ;
      P07AD9_A396EmprCod = new String[] {""} ;
      P07AD9_A425EstAny = new short[1] ;
      P07AD9_A2755EstSerFac = new String[] {""} ;
      P07AD9_A252CliCod = new int[1] ;
      P07AD9_A279CliNom = new String[] {""} ;
      P07AD9_A902AcuOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD9_n902AcuOrd0 = new boolean[] {false} ;
      P07AD9_A1433AcuCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD9_A1432AcuCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD10_A396EmprCod = new String[] {""} ;
      P07AD10_A252CliCod = new int[1] ;
      P07AD10_A425EstAny = new short[1] ;
      P07AD10_A2755EstSerFac = new String[] {""} ;
      P07AD10_A426EstMes = new byte[1] ;
      P07AD10_A1440ImpCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD10_n1440ImpCli1 = new boolean[] {false} ;
      P07AD10_A1439ImpCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD10_n1439ImpCli0 = new boolean[] {false} ;
      P07AD10_A1367FacKg0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD10_n1367FacKg0 = new boolean[] {false} ;
      P07AD10_A1368FacKg1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD10_n1368FacKg1 = new boolean[] {false} ;
      P07AD10_A1365FacMt0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD10_n1365FacMt0 = new boolean[] {false} ;
      P07AD10_A1366FacMt1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07AD10_n1366FacMt1 = new boolean[] {false} ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV90Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa00101__default(),
         new Object[] {
             new Object[] {
            P07AD2_A396EmprCod, P07AD2_A407EmprNom, P07AD2_n407EmprNom, P07AD2_A963Ser1, P07AD2_n963Ser1, P07AD2_A2387Ser2, P07AD2_n2387Ser2, P07AD2_A2389Ser3, P07AD2_n2389Ser3, P07AD2_A4215Ser4,
            P07AD2_n4215Ser4, P07AD2_A4217Ser5, P07AD2_n4217Ser5, P07AD2_A4219Ser6, P07AD2_n4219Ser6, P07AD2_A4221Ser7, P07AD2_n4221Ser7
            }
            , new Object[] {
            P07AD3_A396EmprCod, P07AD3_A425EstAny, P07AD3_A2755EstSerFac, P07AD3_A252CliCod, P07AD3_A1439ImpCli0, P07AD3_n1439ImpCli0, P07AD3_A1440ImpCli1, P07AD3_n1440ImpCli1, P07AD3_A902AcuOrd0, P07AD3_n902AcuOrd0,
            P07AD3_A426EstMes
            }
            , new Object[] {
            P07AD5_A396EmprCod, P07AD5_A425EstAny, P07AD5_A2755EstSerFac, P07AD5_A252CliCod, P07AD5_A279CliNom, P07AD5_A902AcuOrd0, P07AD5_n902AcuOrd0, P07AD5_A1432AcuCli0, P07AD5_A1433AcuCli1
            }
            , new Object[] {
            P07AD6_A396EmprCod, P07AD6_A252CliCod, P07AD6_A425EstAny, P07AD6_A2755EstSerFac, P07AD6_A426EstMes, P07AD6_A1439ImpCli0, P07AD6_n1439ImpCli0, P07AD6_A1367FacKg0, P07AD6_n1367FacKg0, P07AD6_A1365FacMt0,
            P07AD6_n1365FacMt0, P07AD6_A1440ImpCli1, P07AD6_n1440ImpCli1, P07AD6_A1368FacKg1, P07AD6_n1368FacKg1, P07AD6_A1366FacMt1, P07AD6_n1366FacMt1
            }
            , new Object[] {
            P07AD7_A396EmprCod, P07AD7_A425EstAny, P07AD7_A2755EstSerFac, P07AD7_A252CliCod, P07AD7_A1440ImpCli1, P07AD7_n1440ImpCli1, P07AD7_A1439ImpCli0, P07AD7_n1439ImpCli0, P07AD7_A902AcuOrd0, P07AD7_n902AcuOrd0,
            P07AD7_A426EstMes
            }
            , new Object[] {
            P07AD9_A396EmprCod, P07AD9_A425EstAny, P07AD9_A2755EstSerFac, P07AD9_A252CliCod, P07AD9_A279CliNom, P07AD9_A902AcuOrd0, P07AD9_n902AcuOrd0, P07AD9_A1433AcuCli1, P07AD9_A1432AcuCli0
            }
            , new Object[] {
            P07AD10_A396EmprCod, P07AD10_A252CliCod, P07AD10_A425EstAny, P07AD10_A2755EstSerFac, P07AD10_A426EstMes, P07AD10_A1440ImpCli1, P07AD10_n1440ImpCli1, P07AD10_A1439ImpCli0, P07AD10_n1439ImpCli0, P07AD10_A1367FacKg0,
            P07AD10_n1367FacKg0, P07AD10_A1368FacKg1, P07AD10_n1368FacKg1, P07AD10_A1365FacMt0, P07AD10_n1365FacMt0, P07AD10_A1366FacMt1, P07AD10_n1366FacMt1
            }
         }
      );
      AV90Pgmname = "Facturacion.RFA00101" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV85Pgmdesc = httpContext.getMessage( "FACTURADO ANUAL POR IMPORTE", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV90Pgmname = "Facturacion.RFA00101" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV85Pgmdesc = httpContext.getMessage( "FACTURADO ANUAL POR IMPORTE", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV20SerieF ;
   private byte AV64FlagPor ;
   private byte AV74FacKyM ;
   private byte GXv_int3[] ;
   private byte AV63Cont ;
   private byte AV65Day ;
   private byte AV66Meses[] ;
   private byte AV26I ;
   private byte A426EstMes ;
   private short gxcookieaux ;
   private short AV17Any ;
   private short AV25Anyo ;
   private short GXv_int6[] ;
   private short A425EstAny ;
   private short AV68Por ;
   private short Gx_err ;
   private int AV15PCLI ;
   private int AV16UCLI ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private int GX_I ;
   private java.math.BigDecimal AV82TotCom ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV29TotCprTot[] ;
   private java.math.BigDecimal AV31TotValTot ;
   private java.math.BigDecimal AV61TotGeral ;
   private java.math.BigDecimal A1439ImpCli0 ;
   private java.math.BigDecimal A1440ImpCli1 ;
   private java.math.BigDecimal A902AcuOrd0 ;
   private java.math.BigDecimal AV28TotCprMes[] ;
   private java.math.BigDecimal AV69TotKgsMes[] ;
   private java.math.BigDecimal AV75TotMtsMes[] ;
   private java.math.BigDecimal AV30TotValCpr ;
   private java.math.BigDecimal AV72TotMesKgs ;
   private java.math.BigDecimal AV78TotMesMts ;
   private java.math.BigDecimal A1432AcuCli0 ;
   private java.math.BigDecimal A1433AcuCli1 ;
   private java.math.BigDecimal AV32TotValCli ;
   private java.math.BigDecimal AV70TotKgsCli ;
   private java.math.BigDecimal AV77TotMtsCli ;
   private java.math.BigDecimal AV27ValCprMes[] ;
   private java.math.BigDecimal AV71KgsMes[] ;
   private java.math.BigDecimal AV76MtsMes[] ;
   private java.math.BigDecimal A1367FacKg0 ;
   private java.math.BigDecimal A1365FacMt0 ;
   private java.math.BigDecimal A1368FacKg1 ;
   private java.math.BigDecimal A1366FacMt1 ;
   private java.math.BigDecimal AV34AcuImpr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV18PRIO ;
   private String AV19ImpCod ;
   private String AV35Lit0 ;
   private String AV85Pgmdesc ;
   private String AV36Lit1 ;
   private String AV37Lit2 ;
   private String AV38Lit3 ;
   private String AV39Lit4 ;
   private String AV40Lit5 ;
   private String AV41Lit6 ;
   private String AV42Lit7 ;
   private String AV43Lit8 ;
   private String AV44Lit9 ;
   private String AV45Lit10 ;
   private String AV46Lit11 ;
   private String AV47Lit12 ;
   private String AV48Lit13 ;
   private String AV49Lit14 ;
   private String AV50Lit15 ;
   private String AV51Lit16 ;
   private String AV52Lit17 ;
   private String AV53Lit18 ;
   private String AV54Lit19 ;
   private String AV55Lit20 ;
   private String AV56Lit21 ;
   private String AV58Lit22 ;
   private String AV60Lit23 ;
   private String AV79Lit24 ;
   private String AV80Lit25 ;
   private String AV81Lit26 ;
   private String GXt_char1 ;
   private String AV62NomMes[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String A4215Ser4 ;
   private String A4217Ser5 ;
   private String A4219Ser6 ;
   private String A4221Ser7 ;
   private String AV23NomEmp ;
   private String AV57EstSerFac ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char9[] ;
   private String AV33Prio2 ;
   private String A2755EstSerFac ;
   private String A279CliNom ;
   private String AV59CliNom ;
   private String Gx_time ;
   private String AV90Pgmname ;
   private java.util.Date AV67Fecha ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n963Ser1 ;
   private boolean n2387Ser2 ;
   private boolean n2389Ser3 ;
   private boolean n4215Ser4 ;
   private boolean n4217Ser5 ;
   private boolean n4219Ser6 ;
   private boolean n4221Ser7 ;
   private boolean n1439ImpCli0 ;
   private boolean n1440ImpCli1 ;
   private boolean n902AcuOrd0 ;
   private boolean n1367FacKg0 ;
   private boolean n1365FacMt0 ;
   private boolean n1368FacKg1 ;
   private boolean n1366FacMt1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07AD2_A396EmprCod ;
   private String[] P07AD2_A407EmprNom ;
   private boolean[] P07AD2_n407EmprNom ;
   private String[] P07AD2_A963Ser1 ;
   private boolean[] P07AD2_n963Ser1 ;
   private String[] P07AD2_A2387Ser2 ;
   private boolean[] P07AD2_n2387Ser2 ;
   private String[] P07AD2_A2389Ser3 ;
   private boolean[] P07AD2_n2389Ser3 ;
   private String[] P07AD2_A4215Ser4 ;
   private boolean[] P07AD2_n4215Ser4 ;
   private String[] P07AD2_A4217Ser5 ;
   private boolean[] P07AD2_n4217Ser5 ;
   private String[] P07AD2_A4219Ser6 ;
   private boolean[] P07AD2_n4219Ser6 ;
   private String[] P07AD2_A4221Ser7 ;
   private boolean[] P07AD2_n4221Ser7 ;
   private String[] P07AD3_A396EmprCod ;
   private short[] P07AD3_A425EstAny ;
   private String[] P07AD3_A2755EstSerFac ;
   private int[] P07AD3_A252CliCod ;
   private java.math.BigDecimal[] P07AD3_A1439ImpCli0 ;
   private boolean[] P07AD3_n1439ImpCli0 ;
   private java.math.BigDecimal[] P07AD3_A1440ImpCli1 ;
   private boolean[] P07AD3_n1440ImpCli1 ;
   private java.math.BigDecimal[] P07AD3_A902AcuOrd0 ;
   private boolean[] P07AD3_n902AcuOrd0 ;
   private byte[] P07AD3_A426EstMes ;
   private String[] P07AD5_A396EmprCod ;
   private short[] P07AD5_A425EstAny ;
   private String[] P07AD5_A2755EstSerFac ;
   private int[] P07AD5_A252CliCod ;
   private String[] P07AD5_A279CliNom ;
   private java.math.BigDecimal[] P07AD5_A902AcuOrd0 ;
   private boolean[] P07AD5_n902AcuOrd0 ;
   private java.math.BigDecimal[] P07AD5_A1432AcuCli0 ;
   private java.math.BigDecimal[] P07AD5_A1433AcuCli1 ;
   private String[] P07AD6_A396EmprCod ;
   private int[] P07AD6_A252CliCod ;
   private short[] P07AD6_A425EstAny ;
   private String[] P07AD6_A2755EstSerFac ;
   private byte[] P07AD6_A426EstMes ;
   private java.math.BigDecimal[] P07AD6_A1439ImpCli0 ;
   private boolean[] P07AD6_n1439ImpCli0 ;
   private java.math.BigDecimal[] P07AD6_A1367FacKg0 ;
   private boolean[] P07AD6_n1367FacKg0 ;
   private java.math.BigDecimal[] P07AD6_A1365FacMt0 ;
   private boolean[] P07AD6_n1365FacMt0 ;
   private java.math.BigDecimal[] P07AD6_A1440ImpCli1 ;
   private boolean[] P07AD6_n1440ImpCli1 ;
   private java.math.BigDecimal[] P07AD6_A1368FacKg1 ;
   private boolean[] P07AD6_n1368FacKg1 ;
   private java.math.BigDecimal[] P07AD6_A1366FacMt1 ;
   private boolean[] P07AD6_n1366FacMt1 ;
   private String[] P07AD7_A396EmprCod ;
   private short[] P07AD7_A425EstAny ;
   private String[] P07AD7_A2755EstSerFac ;
   private int[] P07AD7_A252CliCod ;
   private java.math.BigDecimal[] P07AD7_A1440ImpCli1 ;
   private boolean[] P07AD7_n1440ImpCli1 ;
   private java.math.BigDecimal[] P07AD7_A1439ImpCli0 ;
   private boolean[] P07AD7_n1439ImpCli0 ;
   private java.math.BigDecimal[] P07AD7_A902AcuOrd0 ;
   private boolean[] P07AD7_n902AcuOrd0 ;
   private byte[] P07AD7_A426EstMes ;
   private String[] P07AD9_A396EmprCod ;
   private short[] P07AD9_A425EstAny ;
   private String[] P07AD9_A2755EstSerFac ;
   private int[] P07AD9_A252CliCod ;
   private String[] P07AD9_A279CliNom ;
   private java.math.BigDecimal[] P07AD9_A902AcuOrd0 ;
   private boolean[] P07AD9_n902AcuOrd0 ;
   private java.math.BigDecimal[] P07AD9_A1433AcuCli1 ;
   private java.math.BigDecimal[] P07AD9_A1432AcuCli0 ;
   private String[] P07AD10_A396EmprCod ;
   private int[] P07AD10_A252CliCod ;
   private short[] P07AD10_A425EstAny ;
   private String[] P07AD10_A2755EstSerFac ;
   private byte[] P07AD10_A426EstMes ;
   private java.math.BigDecimal[] P07AD10_A1440ImpCli1 ;
   private boolean[] P07AD10_n1440ImpCli1 ;
   private java.math.BigDecimal[] P07AD10_A1439ImpCli0 ;
   private boolean[] P07AD10_n1439ImpCli0 ;
   private java.math.BigDecimal[] P07AD10_A1367FacKg0 ;
   private boolean[] P07AD10_n1367FacKg0 ;
   private java.math.BigDecimal[] P07AD10_A1368FacKg1 ;
   private boolean[] P07AD10_n1368FacKg1 ;
   private java.math.BigDecimal[] P07AD10_A1365FacMt0 ;
   private boolean[] P07AD10_n1365FacMt0 ;
   private java.math.BigDecimal[] P07AD10_A1366FacMt1 ;
   private boolean[] P07AD10_n1366FacMt1 ;
}

final  class rfa00101__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07AD2", "SELECT EmprCod, EmprNom, Ser1, Ser2, Ser3, Ser4, Ser5, Ser6, Ser7 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07AD3", "SELECT T1.EmprCod, T1.EstAny, T1.EstSerFac, T1.CliCod, T1.ImpCli0, T1.ImpCli1, T2.AcuOrd0, T1.EstMes FROM (TXPLESCLI T1 INNER JOIN TXPCESCLI T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.EstAny = T1.EstAny AND T2.EstSerFac = T1.EstSerFac) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ? and T1.CliCod <= ?) AND (T1.EstAny = ?) AND (T1.EstSerFac = ?) ORDER BY T2.AcuOrd0 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07AD5", "SELECT T1.EmprCod, T1.EstAny, T1.EstSerFac, T1.CliCod, T2.CliNom, T1.AcuOrd0, COALESCE( T3.AcuCli0, 0) AS AcuCli0, COALESCE( T3.AcuCli1, 0) AS AcuCli1 FROM ((TXPCESCLI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(ImpCli0) AS AcuCli0, EmprCod, CliCod, EstAny, EstSerFac, SUM(ImpCli1) AS AcuCli1 FROM TXPLESCLI GROUP BY EmprCod, CliCod, EstAny, EstSerFac ) T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.EstAny = T1.EstAny AND T3.EstSerFac = T1.EstSerFac) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ? and T1.CliCod <= ?) AND (T1.EstAny = ?) AND (T1.EstSerFac = ?) ORDER BY T1.AcuOrd0 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07AD6", "SELECT EmprCod, CliCod, EstAny, EstSerFac, EstMes, ImpCli0, FacKg0, FacMt0, ImpCli1, FacKg1, FacMt1 FROM TXPLESCLI WHERE EmprCod = ? and CliCod = ? and EstAny = ? and EstSerFac = ? and EstMes = ? ORDER BY EmprCod, CliCod, EstAny, EstSerFac, EstMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07AD7", "SELECT T1.EmprCod, T1.EstAny, T1.EstSerFac, T1.CliCod, T1.ImpCli1, T1.ImpCli0, T2.AcuOrd0, T1.EstMes FROM (TXPLESCLI T1 INNER JOIN TXPCESCLI T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.EstAny = T1.EstAny AND T2.EstSerFac = T1.EstSerFac) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ? and T1.CliCod <= ?) AND (T1.EstAny = ?) AND (T1.EstSerFac = ?) ORDER BY T2.AcuOrd0 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07AD9", "SELECT T1.EmprCod, T1.EstAny, T1.EstSerFac, T1.CliCod, T2.CliNom, T1.AcuOrd0, COALESCE( T3.AcuCli1, 0) AS AcuCli1, COALESCE( T3.AcuCli0, 0) AS AcuCli0 FROM ((TXPCESCLI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(ImpCli1) AS AcuCli1, EmprCod, CliCod, EstAny, EstSerFac, SUM(ImpCli0) AS AcuCli0 FROM TXPLESCLI GROUP BY EmprCod, CliCod, EstAny, EstSerFac ) T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.EstAny = T1.EstAny AND T3.EstSerFac = T1.EstSerFac) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ? and T1.CliCod <= ?) AND (T1.EstAny = ?) AND (T1.EstSerFac = ?) ORDER BY T1.AcuOrd0 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07AD10", "SELECT EmprCod, CliCod, EstAny, EstSerFac, EstMes, ImpCli1, ImpCli0, FacKg0, FacKg1, FacMt0, FacMt1 FROM TXPLESCLI WHERE EmprCod = ? and CliCod = ? and EstAny = ? and EstSerFac = ? and EstMes = ? ORDER BY EmprCod, CliCod, EstAny, EstSerFac, EstMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

