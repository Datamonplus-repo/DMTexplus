package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0005_impl extends GXWebReport
{
   public rfa0005_impl( com.genexus.internet.HttpContext context )
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
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV16PCli = (int)(GXutil.lval( httpContext.GetPar( "PCli"))) ;
            AV17UCli = (int)(GXutil.lval( httpContext.GetPar( "UCli"))) ;
            AV18Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
            AV19Any = (short)(GXutil.lval( httpContext.GetPar( "Any"))) ;
            AV20Prio = httpContext.GetPar( "Prio") ;
            AV21SerieF = (byte)(GXutil.lval( httpContext.GetPar( "SerieF"))) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV37Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit0 = GXt_char1 ;
         GXt_char1 = AV38Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit1 = GXt_char1 ;
         GXt_char1 = AV39Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2234_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit2 = GXt_char1 ;
         GXt_char1 = AV40Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit3 = GXt_char1 ;
         GXt_char1 = AV41Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1438_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit4 = GXt_char1 ;
         GXt_char1 = AV42Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2048_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit5 = GXt_char1 ;
         GXt_char1 = AV43Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2300_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit6 = GXt_char1 ;
         GXt_char1 = AV44Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2157_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit7 = GXt_char1 ;
         GXt_char1 = AV45Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2156_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit8 = GXt_char1 ;
         GXt_char1 = AV46Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2473_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit9 = GXt_char1 ;
         GXt_char1 = AV47Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit10 = GXt_char1 ;
         GXt_char1 = AV48Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit11 = GXt_char1 ;
         GXt_char1 = AV49Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit12 = GXt_char1 ;
         GXt_char1 = AV50Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit13 = GXt_char1 ;
         GXt_char1 = AV52Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit15 = GXt_char1 ;
         GXt_char1 = AV53Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit16 = GXt_char1 ;
         GXt_char1 = AV55Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2483_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit17 = GXt_char1 ;
         GXt_char1 = AV56Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2483_", ""), (byte)(99), GXv_char2) ;
         rfa0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit18 = GXt_char1 ;
         AV22Anyo = AV19Any ;
         /* Using cursor P06M02 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06M02_A407EmprNom[0] ;
            n407EmprNom = P06M02_n407EmprNom[0] ;
            A963Ser1 = P06M02_A963Ser1[0] ;
            n963Ser1 = P06M02_n963Ser1[0] ;
            A2387Ser2 = P06M02_A2387Ser2[0] ;
            n2387Ser2 = P06M02_n2387Ser2[0] ;
            A2389Ser3 = P06M02_A2389Ser3[0] ;
            n2389Ser3 = P06M02_n2389Ser3[0] ;
            A4215Ser4 = P06M02_A4215Ser4[0] ;
            n4215Ser4 = P06M02_n4215Ser4[0] ;
            A4217Ser5 = P06M02_A4217Ser5[0] ;
            n4217Ser5 = P06M02_n4217Ser5[0] ;
            A4219Ser6 = P06M02_A4219Ser6[0] ;
            n4219Ser6 = P06M02_n4219Ser6[0] ;
            A4221Ser7 = P06M02_A4221Ser7[0] ;
            n4221Ser7 = P06M02_n4221Ser7[0] ;
            AV23NomEmp = A407EmprNom ;
            if ( AV21SerieF == 1 )
            {
               AV25EstSerFac = A963Ser1 ;
            }
            else
            {
               if ( AV21SerieF == 2 )
               {
                  AV25EstSerFac = A2387Ser2 ;
               }
               else
               {
                  if ( AV21SerieF == 3 )
                  {
                     AV25EstSerFac = A2389Ser3 ;
                  }
                  else
                  {
                     if ( AV21SerieF == 4 )
                     {
                        AV25EstSerFac = A4215Ser4 ;
                     }
                     else
                     {
                        if ( AV21SerieF == 5 )
                        {
                           AV25EstSerFac = A4217Ser5 ;
                        }
                        else
                        {
                           if ( AV21SerieF == 6 )
                           {
                              AV25EstSerFac = A4219Ser6 ;
                           }
                           else
                           {
                              if ( AV21SerieF == 7 )
                              {
                                 AV25EstSerFac = A4221Ser7 ;
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
         GXv_int3[0] = AV16PCli ;
         GXv_int4[0] = AV17UCli ;
         GXv_int5[0] = AV22Anyo ;
         GXv_char6[0] = AV20Prio ;
         GXv_decimal7[0] = AV24TotCom ;
         GXv_char8[0] = AV25EstSerFac ;
         new app.facturacion.pordcli(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_int5, GXv_char6, GXv_decimal7, GXv_char8) ;
         rfa0005_impl.this.A396EmprCod = GXv_char2[0] ;
         rfa0005_impl.this.AV16PCli = GXv_int3[0] ;
         rfa0005_impl.this.AV17UCli = GXv_int4[0] ;
         rfa0005_impl.this.AV22Anyo = GXv_int5[0] ;
         rfa0005_impl.this.AV20Prio = GXv_char6[0] ;
         rfa0005_impl.this.AV24TotCom = GXv_decimal7[0] ;
         rfa0005_impl.this.AV25EstSerFac = GXv_char8[0] ;
         AV26Porcen = DecimalUtil.doubleToDec(0) ;
         AV27PorAcu = DecimalUtil.doubleToDec(0) ;
         AV28PorcGrp = DecimalUtil.doubleToDec(0) ;
         AV29TotGrp = DecimalUtil.doubleToDec(0) ;
         AV30TotInf = DecimalUtil.doubleToDec(0) ;
         AV32Flag = (byte)(1) ;
         AV33ComAcu = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06M04 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PCli), Integer.valueOf(AV17UCli), Short.valueOf(AV22Anyo), AV25EstSerFac});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A425EstAny = P06M04_A425EstAny[0] ;
            A2755EstSerFac = P06M04_A2755EstSerFac[0] ;
            A252CliCod = P06M04_A252CliCod[0] ;
            A279CliNom = P06M04_A279CliNom[0] ;
            A902AcuOrd0 = P06M04_A902AcuOrd0[0] ;
            n902AcuOrd0 = P06M04_n902AcuOrd0[0] ;
            A1433AcuCli1 = P06M04_A1433AcuCli1[0] ;
            A1432AcuCli0 = P06M04_A1432AcuCli0[0] ;
            A279CliNom = P06M04_A279CliNom[0] ;
            A1433AcuCli1 = P06M04_A1433AcuCli1[0] ;
            A1432AcuCli0 = P06M04_A1432AcuCli0[0] ;
            if ( GXutil.strcmp(AV20Prio, "2") == 0 )
            {
               AV33ComAcu = A1432AcuCli0.add(A1433AcuCli1) ;
            }
            else
            {
               if ( GXutil.strcmp(AV20Prio, "0") == 0 )
               {
                  AV33ComAcu = A1432AcuCli0 ;
               }
               if ( GXutil.strcmp(AV20Prio, "1") == 0 )
               {
                  AV33ComAcu = A1433AcuCli1 ;
               }
            }
            AV34ComPer = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P06M05 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), AV25EstSerFac, Byte.valueOf(AV18Mes)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2755EstSerFac = P06M05_A2755EstSerFac[0] ;
               A426EstMes = P06M05_A426EstMes[0] ;
               A1440ImpCli1 = P06M05_A1440ImpCli1[0] ;
               n1440ImpCli1 = P06M05_n1440ImpCli1[0] ;
               A1439ImpCli0 = P06M05_A1439ImpCli0[0] ;
               n1439ImpCli0 = P06M05_n1439ImpCli0[0] ;
               if ( GXutil.strcmp(AV20Prio, "2") == 0 )
               {
                  AV34ComPer = A1439ImpCli0.add(A1440ImpCli1) ;
               }
               else
               {
                  if ( GXutil.strcmp(AV20Prio, "0") == 0 )
                  {
                     AV34ComPer = A1439ImpCli0 ;
                  }
                  if ( GXutil.strcmp(AV20Prio, "1") == 0 )
                  {
                     AV34ComPer = A1440ImpCli1 ;
                  }
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            if ( AV32Flag == 3 )
            {
               AV32Flag = (byte)(4) ;
            }
            if ( AV24TotCom.doubleValue() != 0 )
            {
               AV26Porcen = AV33ComAcu.multiply(DecimalUtil.doubleToDec(100)).divide(AV24TotCom, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV26Porcen = DecimalUtil.doubleToDec(0) ;
            }
            AV27PorAcu = AV27PorAcu.add(AV26Porcen) ;
            AV35TotPer = AV35TotPer.add(AV34ComPer) ;
            AV30TotInf = AV30TotInf.add(AV33ComAcu) ;
            AV28PorcGrp = AV28PorcGrp.add(AV26Porcen) ;
            AV29TotGrp = AV29TotGrp.add(AV33ComAcu) ;
            AV36TotGrpPer = AV36TotGrpPer.add(AV34ComPer) ;
            if ( ( AV34ComPer.doubleValue() != 0 ) || ( AV33ComAcu.doubleValue() != 0 ) )
            {
               h6M00( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 7, Gx_line+0, 52, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 58, Gx_line+0, 278, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34ComPer, "ZZZ,ZZZ,ZZ9.99")), 367, Gx_line+0, 470, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33ComAcu, "ZZZ,ZZZ,ZZ9.99")), 549, Gx_line+0, 652, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Porcen, "ZZ9.99")), 702, Gx_line+0, 747, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            if ( ( AV27PorAcu.doubleValue() >= 80 ) && ( AV32Flag == 1 ) )
            {
               h6M00( false, 50) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit10, "")), 124, Gx_line+17, 206, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotGrpPer, "ZZZ,ZZZ,ZZ9.99")), 367, Gx_line+17, 470, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotGrp, "ZZZ,ZZZ,ZZ9.99")), 549, Gx_line+17, 652, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PorcGrp, "ZZ9.99")), 702, Gx_line+17, 747, Gx_line+34, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+50) ;
               AV28PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV29TotGrp = DecimalUtil.doubleToDec(0) ;
               AV36TotGrpPer = DecimalUtil.doubleToDec(0) ;
               AV32Flag = (byte)(2) ;
            }
            if ( ( ( AV27PorAcu.doubleValue() >= 95 ) ) && ( AV32Flag == 2 ) && ( AV29TotGrp.doubleValue() != 0 ) )
            {
               h6M00( false, 50) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit11, "")), 124, Gx_line+17, 206, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotGrpPer, "ZZZ,ZZZ,ZZ9.99")), 367, Gx_line+17, 470, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotGrp, "ZZZ,ZZZ,ZZ9.99")), 549, Gx_line+17, 652, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PorcGrp, "ZZ9.99")), 702, Gx_line+17, 747, Gx_line+34, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+50) ;
               AV28PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV29TotGrp = DecimalUtil.doubleToDec(0) ;
               AV36TotGrpPer = DecimalUtil.doubleToDec(0) ;
               AV32Flag = (byte)(3) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV32Flag == 4 )
         {
            h6M00( false, 50) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit12, "")), 124, Gx_line+17, 206, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotGrpPer, "ZZZ,ZZZ,ZZ9.99")), 367, Gx_line+17, 470, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotGrp, "ZZZ,ZZZ,ZZ9.99")), 549, Gx_line+17, 652, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PorcGrp, "ZZ9.99")), 702, Gx_line+17, 747, Gx_line+34, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
         }
         h6M00( false, 33) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit13, "")), 124, Gx_line+17, 206, Gx_line+34, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TotPer, "ZZ,ZZZ,ZZZ,ZZ9.99")), 345, Gx_line+17, 470, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TotInf, "ZZZ,ZZZ,ZZ9.99")), 549, Gx_line+17, 652, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27PorAcu, "ZZ9.99")), 702, Gx_line+17, 747, Gx_line+34, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6M00( true, 0) ;
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

   public void h6M00( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23NomEmp, "")), 13, Gx_line+1, 264, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit0, "")), 465, Gx_line+0, 529, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 538, Gx_line+0, 597, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit1, "")), 625, Gx_line+0, 676, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 698, Gx_line+0, 757, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit2, "")), 13, Gx_line+34, 256, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit3, "")), 600, Gx_line+35, 676, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 698, Gx_line+34, 743, Gx_line+51, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Prio, "")), 392, Gx_line+34, 400, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25EstSerFac, "")), 355, Gx_line+34, 378, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit5, "")), 13, Gx_line+118, 63, Gx_line+135, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit6, "")), 64, Gx_line+118, 144, Gx_line+135, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Mes), "Z9")), 454, Gx_line+118, 470, Gx_line+135, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22Anyo), "ZZZ9")), 622, Gx_line+118, 652, Gx_line+135, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 708, Gx_line+118, 739, Gx_line+132, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit15, "")), 365, Gx_line+118, 399, Gx_line+135, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit16, "")), 545, Gx_line+118, 596, Gx_line+135, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+67, 769, Gx_line+67, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+140, 769, Gx_line+140, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 719, Gx_line+101, 729, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit17, "")), 363, Gx_line+94, 470, Gx_line+111, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit18, "")), 545, Gx_line+94, 652, Gx_line+111, 1+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+144) ;
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
      AV15ImpCod = "" ;
      AV20Prio = "" ;
      AV37Lit0 = "" ;
      AV38Lit1 = "" ;
      AV39Lit2 = "" ;
      AV40Lit3 = "" ;
      AV41Lit4 = "" ;
      AV42Lit5 = "" ;
      AV43Lit6 = "" ;
      AV44Lit7 = "" ;
      AV45Lit8 = "" ;
      AV46Lit9 = "" ;
      AV47Lit10 = "" ;
      AV48Lit11 = "" ;
      AV49Lit12 = "" ;
      AV50Lit13 = "" ;
      AV52Lit15 = "" ;
      AV53Lit16 = "" ;
      AV55Lit17 = "" ;
      AV56Lit18 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P06M02_A396EmprCod = new String[] {""} ;
      P06M02_A407EmprNom = new String[] {""} ;
      P06M02_n407EmprNom = new boolean[] {false} ;
      P06M02_A963Ser1 = new String[] {""} ;
      P06M02_n963Ser1 = new boolean[] {false} ;
      P06M02_A2387Ser2 = new String[] {""} ;
      P06M02_n2387Ser2 = new boolean[] {false} ;
      P06M02_A2389Ser3 = new String[] {""} ;
      P06M02_n2389Ser3 = new boolean[] {false} ;
      P06M02_A4215Ser4 = new String[] {""} ;
      P06M02_n4215Ser4 = new boolean[] {false} ;
      P06M02_A4217Ser5 = new String[] {""} ;
      P06M02_n4217Ser5 = new boolean[] {false} ;
      P06M02_A4219Ser6 = new String[] {""} ;
      P06M02_n4219Ser6 = new boolean[] {false} ;
      P06M02_A4221Ser7 = new String[] {""} ;
      P06M02_n4221Ser7 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      A4215Ser4 = "" ;
      A4217Ser5 = "" ;
      A4219Ser6 = "" ;
      A4221Ser7 = "" ;
      AV23NomEmp = "" ;
      AV25EstSerFac = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new short[1] ;
      GXv_char6 = new String[1] ;
      AV24TotCom = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      AV26Porcen = DecimalUtil.ZERO ;
      AV27PorAcu = DecimalUtil.ZERO ;
      AV28PorcGrp = DecimalUtil.ZERO ;
      AV29TotGrp = DecimalUtil.ZERO ;
      AV30TotInf = DecimalUtil.ZERO ;
      AV33ComAcu = DecimalUtil.ZERO ;
      P06M04_A396EmprCod = new String[] {""} ;
      P06M04_A425EstAny = new short[1] ;
      P06M04_A2755EstSerFac = new String[] {""} ;
      P06M04_A252CliCod = new int[1] ;
      P06M04_A279CliNom = new String[] {""} ;
      P06M04_A902AcuOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M04_n902AcuOrd0 = new boolean[] {false} ;
      P06M04_A1433AcuCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M04_A1432AcuCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2755EstSerFac = "" ;
      A279CliNom = "" ;
      A902AcuOrd0 = DecimalUtil.ZERO ;
      A1433AcuCli1 = DecimalUtil.ZERO ;
      A1432AcuCli0 = DecimalUtil.ZERO ;
      AV34ComPer = DecimalUtil.ZERO ;
      P06M05_A396EmprCod = new String[] {""} ;
      P06M05_A252CliCod = new int[1] ;
      P06M05_A425EstAny = new short[1] ;
      P06M05_A2755EstSerFac = new String[] {""} ;
      P06M05_A426EstMes = new byte[1] ;
      P06M05_A1440ImpCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M05_n1440ImpCli1 = new boolean[] {false} ;
      P06M05_A1439ImpCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M05_n1439ImpCli0 = new boolean[] {false} ;
      A1440ImpCli1 = DecimalUtil.ZERO ;
      A1439ImpCli0 = DecimalUtil.ZERO ;
      AV35TotPer = DecimalUtil.ZERO ;
      AV36TotGrpPer = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa0005__default(),
         new Object[] {
             new Object[] {
            P06M02_A396EmprCod, P06M02_A407EmprNom, P06M02_n407EmprNom, P06M02_A963Ser1, P06M02_n963Ser1, P06M02_A2387Ser2, P06M02_n2387Ser2, P06M02_A2389Ser3, P06M02_n2389Ser3, P06M02_A4215Ser4,
            P06M02_n4215Ser4, P06M02_A4217Ser5, P06M02_n4217Ser5, P06M02_A4219Ser6, P06M02_n4219Ser6, P06M02_A4221Ser7, P06M02_n4221Ser7
            }
            , new Object[] {
            P06M04_A396EmprCod, P06M04_A425EstAny, P06M04_A2755EstSerFac, P06M04_A252CliCod, P06M04_A279CliNom, P06M04_A902AcuOrd0, P06M04_n902AcuOrd0, P06M04_A1433AcuCli1, P06M04_A1432AcuCli0
            }
            , new Object[] {
            P06M05_A396EmprCod, P06M05_A252CliCod, P06M05_A425EstAny, P06M05_A2755EstSerFac, P06M05_A426EstMes, P06M05_A1440ImpCli1, P06M05_n1440ImpCli1, P06M05_A1439ImpCli0, P06M05_n1439ImpCli0
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

   private byte AV18Mes ;
   private byte AV21SerieF ;
   private byte AV32Flag ;
   private byte A426EstMes ;
   private short gxcookieaux ;
   private short AV19Any ;
   private short AV22Anyo ;
   private short GXv_int5[] ;
   private short A425EstAny ;
   private short Gx_err ;
   private int AV16PCli ;
   private int AV17UCli ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXv_int3[] ;
   private int GXv_int4[] ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV24TotCom ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV26Porcen ;
   private java.math.BigDecimal AV27PorAcu ;
   private java.math.BigDecimal AV28PorcGrp ;
   private java.math.BigDecimal AV29TotGrp ;
   private java.math.BigDecimal AV30TotInf ;
   private java.math.BigDecimal AV33ComAcu ;
   private java.math.BigDecimal A902AcuOrd0 ;
   private java.math.BigDecimal A1433AcuCli1 ;
   private java.math.BigDecimal A1432AcuCli0 ;
   private java.math.BigDecimal AV34ComPer ;
   private java.math.BigDecimal A1440ImpCli1 ;
   private java.math.BigDecimal A1439ImpCli0 ;
   private java.math.BigDecimal AV35TotPer ;
   private java.math.BigDecimal AV36TotGrpPer ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV20Prio ;
   private String AV37Lit0 ;
   private String AV38Lit1 ;
   private String AV39Lit2 ;
   private String AV40Lit3 ;
   private String AV41Lit4 ;
   private String AV42Lit5 ;
   private String AV43Lit6 ;
   private String AV44Lit7 ;
   private String AV45Lit8 ;
   private String AV46Lit9 ;
   private String AV47Lit10 ;
   private String AV48Lit11 ;
   private String AV49Lit12 ;
   private String AV50Lit13 ;
   private String AV52Lit15 ;
   private String AV53Lit16 ;
   private String AV55Lit17 ;
   private String AV56Lit18 ;
   private String GXt_char1 ;
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
   private String AV25EstSerFac ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String A2755EstSerFac ;
   private String A279CliNom ;
   private String Gx_time ;
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
   private boolean n902AcuOrd0 ;
   private boolean n1440ImpCli1 ;
   private boolean n1439ImpCli0 ;
   private IDataStoreProvider pr_default ;
   private String[] P06M02_A396EmprCod ;
   private String[] P06M02_A407EmprNom ;
   private boolean[] P06M02_n407EmprNom ;
   private String[] P06M02_A963Ser1 ;
   private boolean[] P06M02_n963Ser1 ;
   private String[] P06M02_A2387Ser2 ;
   private boolean[] P06M02_n2387Ser2 ;
   private String[] P06M02_A2389Ser3 ;
   private boolean[] P06M02_n2389Ser3 ;
   private String[] P06M02_A4215Ser4 ;
   private boolean[] P06M02_n4215Ser4 ;
   private String[] P06M02_A4217Ser5 ;
   private boolean[] P06M02_n4217Ser5 ;
   private String[] P06M02_A4219Ser6 ;
   private boolean[] P06M02_n4219Ser6 ;
   private String[] P06M02_A4221Ser7 ;
   private boolean[] P06M02_n4221Ser7 ;
   private String[] P06M04_A396EmprCod ;
   private short[] P06M04_A425EstAny ;
   private String[] P06M04_A2755EstSerFac ;
   private int[] P06M04_A252CliCod ;
   private String[] P06M04_A279CliNom ;
   private java.math.BigDecimal[] P06M04_A902AcuOrd0 ;
   private boolean[] P06M04_n902AcuOrd0 ;
   private java.math.BigDecimal[] P06M04_A1433AcuCli1 ;
   private java.math.BigDecimal[] P06M04_A1432AcuCli0 ;
   private String[] P06M05_A396EmprCod ;
   private int[] P06M05_A252CliCod ;
   private short[] P06M05_A425EstAny ;
   private String[] P06M05_A2755EstSerFac ;
   private byte[] P06M05_A426EstMes ;
   private java.math.BigDecimal[] P06M05_A1440ImpCli1 ;
   private boolean[] P06M05_n1440ImpCli1 ;
   private java.math.BigDecimal[] P06M05_A1439ImpCli0 ;
   private boolean[] P06M05_n1439ImpCli0 ;
}

final  class rfa0005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06M02", "SELECT EmprCod, EmprNom, Ser1, Ser2, Ser3, Ser4, Ser5, Ser6, Ser7 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06M04", "SELECT T1.EmprCod, T1.EstAny, T1.EstSerFac, T1.CliCod, T2.CliNom, T1.AcuOrd0, COALESCE( T3.AcuCli1, 0) AS AcuCli1, COALESCE( T3.AcuCli0, 0) AS AcuCli0 FROM ((TXPCESCLI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(ImpCli1) AS AcuCli1, EmprCod, CliCod, EstAny, EstSerFac, SUM(ImpCli0) AS AcuCli0 FROM TXPLESCLI GROUP BY EmprCod, CliCod, EstAny, EstSerFac ) T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.EstAny = T1.EstAny AND T3.EstSerFac = T1.EstSerFac) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ? and T1.CliCod <= ?) AND (T1.EstAny = ?) AND (T1.EstSerFac = ?) ORDER BY T1.AcuOrd0 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06M05", "SELECT EmprCod, CliCod, EstAny, EstSerFac, EstMes, ImpCli1, ImpCli0 FROM TXPLESCLI WHERE EmprCod = ? and CliCod = ? and EstAny = ? and EstSerFac = ? and EstMes = ? ORDER BY EmprCod, CliCod, EstAny, EstSerFac, EstMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

