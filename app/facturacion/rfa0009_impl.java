package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0009_impl extends GXWebReport
{
   public rfa0009_impl( com.genexus.internet.HttpContext context )
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
            AV16Prio = httpContext.GetPar( "Prio") ;
            AV17Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
            AV18Any1 = (short)(GXutil.lval( httpContext.GetPar( "Any1"))) ;
            AV19PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV20UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV21PSerie = httpContext.GetPar( "PSerie") ;
            AV22USerie = httpContext.GetPar( "USerie") ;
            AV23SerieF = (byte)(GXutil.lval( httpContext.GetPar( "SerieF"))) ;
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
         GXt_char1 = AV42Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN606_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit0 = GXt_char1 ;
         GXt_char1 = AV43Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit1 = GXt_char1 ;
         GXt_char1 = AV44Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN606_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit2 = GXt_char1 ;
         GXt_char1 = AV45Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit3 = GXt_char1 ;
         GXt_char1 = AV46Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2031_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit4 = GXt_char1 ;
         GXt_char1 = AV47Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN363_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit5 = GXt_char1 ;
         GXt_char1 = AV48Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN357_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit6 = GXt_char1 ;
         GXt_char1 = AV49Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN879_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit7 = GXt_char1 ;
         GXt_char1 = AV50Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit8 = GXt_char1 ;
         GXt_char1 = AV51Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2227_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit9 = GXt_char1 ;
         GXt_char1 = AV52Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2225_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit10 = GXt_char1 ;
         GXt_char1 = AV53Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2226_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit11 = GXt_char1 ;
         GXt_char1 = AV54Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2224_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit12 = GXt_char1 ;
         GXt_char1 = AV55Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit13 = GXt_char1 ;
         GXt_char1 = AV56Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit14 = GXt_char1 ;
         GXt_char1 = AV57Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit15 = GXt_char1 ;
         GXt_char1 = AV58Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit16 = GXt_char1 ;
         GXt_char1 = AV59Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2450_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit17 = GXt_char1 ;
         GXt_char1 = AV63Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rfa0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV63Lit18 = GXt_char1 ;
         /* Using cursor P06M42 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06M42_A407EmprNom[0] ;
            n407EmprNom = P06M42_n407EmprNom[0] ;
            A963Ser1 = P06M42_A963Ser1[0] ;
            n963Ser1 = P06M42_n963Ser1[0] ;
            A2387Ser2 = P06M42_A2387Ser2[0] ;
            n2387Ser2 = P06M42_n2387Ser2[0] ;
            A2389Ser3 = P06M42_A2389Ser3[0] ;
            n2389Ser3 = P06M42_n2389Ser3[0] ;
            A4215Ser4 = P06M42_A4215Ser4[0] ;
            n4215Ser4 = P06M42_n4215Ser4[0] ;
            A4217Ser5 = P06M42_A4217Ser5[0] ;
            n4217Ser5 = P06M42_n4217Ser5[0] ;
            A4219Ser6 = P06M42_A4219Ser6[0] ;
            n4219Ser6 = P06M42_n4219Ser6[0] ;
            A4221Ser7 = P06M42_A4221Ser7[0] ;
            n4221Ser7 = P06M42_n4221Ser7[0] ;
            AV24NomEmp = A407EmprNom ;
            if ( AV23SerieF == 1 )
            {
               AV27ArtEstSer = A963Ser1 ;
            }
            else
            {
               if ( AV23SerieF == 2 )
               {
                  AV27ArtEstSer = A2387Ser2 ;
               }
               else
               {
                  if ( AV23SerieF == 3 )
                  {
                     AV27ArtEstSer = A2389Ser3 ;
                  }
                  else
                  {
                     if ( AV23SerieF == 4 )
                     {
                        AV27ArtEstSer = A4215Ser4 ;
                     }
                     else
                     {
                        if ( AV23SerieF == 5 )
                        {
                           AV27ArtEstSer = A4217Ser5 ;
                        }
                        else
                        {
                           if ( AV23SerieF == 6 )
                           {
                              AV27ArtEstSer = A4219Ser6 ;
                           }
                           else
                           {
                              if ( AV23SerieF == 7 )
                              {
                                 AV27ArtEstSer = A4221Ser7 ;
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
         AV25Any = AV18Any1 ;
         if ( GXutil.strcmp(AV16Prio, "2") == 0 )
         {
            AV34Prio2 = "0" ;
         }
         else
         {
            AV34Prio2 = AV16Prio ;
         }
         AV35TotInfAny = DecimalUtil.doubleToDec(0) ;
         AV36TotInfAnyG = DecimalUtil.doubleToDec(0) ;
         AV37TotInfMes = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06M44 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV19PCliCod), AV21PSerie, Short.valueOf(AV25Any), AV27ArtEstSer, AV22USerie, Integer.valueOf(AV20UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2756ArtEstSer = P06M44_A2756ArtEstSer[0] ;
            A71ArtEstAny = P06M44_A71ArtEstAny[0] ;
            A65ArtCod = P06M44_A65ArtCod[0] ;
            A252CliCod = P06M44_A252CliCod[0] ;
            A1435AcuImp1 = P06M44_A1435AcuImp1[0] ;
            n1435AcuImp1 = P06M44_n1435AcuImp1[0] ;
            A1434AcuImp0 = P06M44_A1434AcuImp0[0] ;
            n1434AcuImp0 = P06M44_n1434AcuImp0[0] ;
            A1435AcuImp1 = P06M44_A1435AcuImp1[0] ;
            n1435AcuImp1 = P06M44_n1435AcuImp1[0] ;
            A1434AcuImp0 = P06M44_A1434AcuImp0[0] ;
            n1434AcuImp0 = P06M44_n1434AcuImp0[0] ;
            if ( GXutil.strcmp(AV16Prio, "2") == 0 )
            {
               AV35TotInfAny = AV35TotInfAny.add(A1434AcuImp0).add(A1435AcuImp1) ;
            }
            else
            {
               if ( GXutil.strcmp(AV16Prio, "0") == 0 )
               {
                  AV35TotInfAny = AV35TotInfAny.add(A1434AcuImp0) ;
               }
               if ( GXutil.strcmp(AV16Prio, "1") == 0 )
               {
                  AV35TotInfAny = AV35TotInfAny.add(A1435AcuImp1) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( GXutil.strcmp(AV16Prio, "0") == 0 ) || ( GXutil.strcmp(AV16Prio, "2") == 0 ) )
         {
            AV38TotPriMes = DecimalUtil.doubleToDec(0) ;
            AV39TotPriAny = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P06M46 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV19PCliCod), Short.valueOf(AV25Any), AV27ArtEstSer, Integer.valueOf(AV20UCliCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               brk6M45 = false ;
               A2756ArtEstSer = P06M46_A2756ArtEstSer[0] ;
               A71ArtEstAny = P06M46_A71ArtEstAny[0] ;
               A65ArtCod = P06M46_A65ArtCod[0] ;
               A252CliCod = P06M46_A252CliCod[0] ;
               A94ArtRdto = P06M46_A94ArtRdto[0] ;
               n94ArtRdto = P06M46_n94ArtRdto[0] ;
               A279CliNom = P06M46_A279CliNom[0] ;
               A1434AcuImp0 = P06M46_A1434AcuImp0[0] ;
               n1434AcuImp0 = P06M46_n1434AcuImp0[0] ;
               A279CliNom = P06M46_A279CliNom[0] ;
               A1434AcuImp0 = P06M46_A1434AcuImp0[0] ;
               n1434AcuImp0 = P06M46_n1434AcuImp0[0] ;
               AV40TotCliMes = DecimalUtil.doubleToDec(0) ;
               AV41TotCliAny = DecimalUtil.doubleToDec(0) ;
               AV61EmprCod = A396EmprCod ;
               AV62CliCod = A252CliCod ;
               /* Execute user subroutine: 'CALTO0' */
               S121 ();
               if ( returnInSub )
               {
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
               h6M40( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 7, Gx_line+0, 52, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 58, Gx_line+0, 278, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P06M46_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06M46_A252CliCod[0] == A252CliCod ) )
               {
                  brk6M45 = false ;
                  A2756ArtEstSer = P06M46_A2756ArtEstSer[0] ;
                  A71ArtEstAny = P06M46_A71ArtEstAny[0] ;
                  A65ArtCod = P06M46_A65ArtCod[0] ;
                  A1434AcuImp0 = P06M46_A1434AcuImp0[0] ;
                  n1434AcuImp0 = P06M46_n1434AcuImp0[0] ;
                  A1434AcuImp0 = P06M46_A1434AcuImp0[0] ;
                  n1434AcuImp0 = P06M46_n1434AcuImp0[0] ;
                  if ( GXutil.strcmp(A65ArtCod, AV22USerie) <= 0 )
                  {
                     if ( GXutil.strcmp(A65ArtCod, AV21PSerie) >= 0 )
                     {
                        if ( A71ArtEstAny == AV25Any )
                        {
                           if ( GXutil.strcmp(A2756ArtEstSer, AV27ArtEstSer) == 0 )
                           {
                              AV26FacMes = DecimalUtil.doubleToDec(0) ;
                              AV60ArtFac = DecimalUtil.doubleToDec(0) ;
                              /* Using cursor P06M47 */
                              pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), AV27ArtEstSer, Byte.valueOf(AV17Mes)});
                              while ( (pr_default.getStatus(3) != 101) )
                              {
                                 A2756ArtEstSer = P06M47_A2756ArtEstSer[0] ;
                                 A72ArtEstMes = P06M47_A72ArtEstMes[0] ;
                                 A1436ArtImp0 = P06M47_A1436ArtImp0[0] ;
                                 n1436ArtImp0 = P06M47_n1436ArtImp0[0] ;
                                 AV26FacMes = A1436ArtImp0 ;
                                 AV40TotCliMes = AV40TotCliMes.add(A1436ArtImp0) ;
                                 /* Exiting from a For First loop. */
                                 if (true) break;
                              }
                              pr_default.close(3);
                              AV28PorCli = (A1434AcuImp0).divide(AV41TotCliAny, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
                              AV29PorTot = (A1434AcuImp0).divide(AV35TotInfAny, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
                              AV60ArtFac = A1434AcuImp0 ;
                              h6M40( false, 17) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 284, Gx_line+0, 402, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26FacMes, "ZZZZZZZZZ9.99")), 424, Gx_line+0, 520, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60ArtFac, "ZZZZZZ9.99")), 554, Gx_line+0, 628, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PorCli, "ZZ9.99")), 645, Gx_line+0, 690, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29PorTot, "ZZ9.99")), 703, Gx_line+0, 748, Gx_line+17, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                        }
                     }
                  }
                  brk6M45 = true ;
                  pr_default.readNext(2);
               }
               AV30PorCliCli = DecimalUtil.doubleToDec(100) ;
               AV31PorTotCli = AV41TotCliAny.divide(AV35TotInfAny, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
               h6M40( false, 33) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "* TOTAL", ""), 89, Gx_line+13, 141, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 147, Gx_line+13, 367, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotCliMes, "ZZZZZZZZZZ9.99")), 417, Gx_line+13, 520, Gx_line+30, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TotCliAny, "ZZZZZZZZZZ9.99")), 525, Gx_line+13, 628, Gx_line+30, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30PorCliCli, "ZZ9.99")), 646, Gx_line+13, 691, Gx_line+30, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31PorTotCli, "ZZ9.99")), 704, Gx_line+13, 749, Gx_line+30, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(406, Gx_line+6, 750, Gx_line+6, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
               AV38TotPriMes = AV38TotPriMes.add(AV40TotCliMes) ;
               AV39TotPriAny = AV39TotPriAny.add(AV41TotCliAny) ;
               if ( ! brk6M45 )
               {
                  brk6M45 = true ;
                  pr_default.readNext(2);
               }
            }
            pr_default.close(2);
            AV32PorTotPri = AV39TotPriAny.divide(AV35TotInfAny, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
            AV37TotInfMes = AV37TotInfMes.add(AV38TotPriMes) ;
            AV36TotInfAnyG = AV36TotInfAnyG.add(AV39TotPriAny) ;
            if ( GXutil.strcmp(AV16Prio, "2") == 0 )
            {
               h6M40( false, 33) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "* *                TOTAL", ""), 88, Gx_line+11, 264, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TotPriMes, "ZZZZZZZZZZ9.99")), 417, Gx_line+11, 520, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotInfAnyG, "ZZZZZZZZZZ9.99")), 525, Gx_line+11, 628, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32PorTotPri, "ZZ9.99")), 703, Gx_line+11, 748, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(406, Gx_line+5, 750, Gx_line+5, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
               AV34Prio2 = "1" ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
         }
         if ( ( GXutil.strcmp(AV16Prio, "1") == 0 ) || ( GXutil.strcmp(AV16Prio, "2") == 0 ) )
         {
            AV38TotPriMes = DecimalUtil.doubleToDec(0) ;
            AV39TotPriAny = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P06M49 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV19PCliCod), Short.valueOf(AV25Any), AV27ArtEstSer, Integer.valueOf(AV20UCliCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               brk6M48 = false ;
               A2756ArtEstSer = P06M49_A2756ArtEstSer[0] ;
               A71ArtEstAny = P06M49_A71ArtEstAny[0] ;
               A65ArtCod = P06M49_A65ArtCod[0] ;
               A252CliCod = P06M49_A252CliCod[0] ;
               A94ArtRdto = P06M49_A94ArtRdto[0] ;
               n94ArtRdto = P06M49_n94ArtRdto[0] ;
               A279CliNom = P06M49_A279CliNom[0] ;
               A1435AcuImp1 = P06M49_A1435AcuImp1[0] ;
               n1435AcuImp1 = P06M49_n1435AcuImp1[0] ;
               A279CliNom = P06M49_A279CliNom[0] ;
               A1435AcuImp1 = P06M49_A1435AcuImp1[0] ;
               n1435AcuImp1 = P06M49_n1435AcuImp1[0] ;
               AV40TotCliMes = DecimalUtil.doubleToDec(0) ;
               AV41TotCliAny = DecimalUtil.doubleToDec(0) ;
               AV61EmprCod = A396EmprCod ;
               AV62CliCod = A252CliCod ;
               /* Execute user subroutine: 'CALTOT' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               h6M40( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 7, Gx_line+0, 52, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 58, Gx_line+0, 278, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               /* Noskip command */
               Gx_line = Gx_OldLine ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P06M49_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06M49_A252CliCod[0] == A252CliCod ) )
               {
                  brk6M48 = false ;
                  A2756ArtEstSer = P06M49_A2756ArtEstSer[0] ;
                  A71ArtEstAny = P06M49_A71ArtEstAny[0] ;
                  A65ArtCod = P06M49_A65ArtCod[0] ;
                  A1435AcuImp1 = P06M49_A1435AcuImp1[0] ;
                  n1435AcuImp1 = P06M49_n1435AcuImp1[0] ;
                  A1435AcuImp1 = P06M49_A1435AcuImp1[0] ;
                  n1435AcuImp1 = P06M49_n1435AcuImp1[0] ;
                  if ( GXutil.strcmp(A65ArtCod, AV22USerie) <= 0 )
                  {
                     if ( GXutil.strcmp(A65ArtCod, AV21PSerie) >= 0 )
                     {
                        if ( A71ArtEstAny == AV25Any )
                        {
                           if ( GXutil.strcmp(A2756ArtEstSer, AV27ArtEstSer) == 0 )
                           {
                              AV26FacMes = DecimalUtil.doubleToDec(0) ;
                              AV60ArtFac = DecimalUtil.doubleToDec(0) ;
                              /* Using cursor P06M410 */
                              pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A71ArtEstAny), AV27ArtEstSer, Byte.valueOf(AV17Mes)});
                              while ( (pr_default.getStatus(5) != 101) )
                              {
                                 A2756ArtEstSer = P06M410_A2756ArtEstSer[0] ;
                                 A72ArtEstMes = P06M410_A72ArtEstMes[0] ;
                                 A1437ArtImp1 = P06M410_A1437ArtImp1[0] ;
                                 n1437ArtImp1 = P06M410_n1437ArtImp1[0] ;
                                 AV26FacMes = A1437ArtImp1 ;
                                 AV40TotCliMes = AV40TotCliMes.add(A1437ArtImp1) ;
                                 /* Exiting from a For First loop. */
                                 if (true) break;
                              }
                              pr_default.close(5);
                              AV28PorCli = (A1435AcuImp1).divide(AV41TotCliAny, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
                              AV29PorTot = (A1435AcuImp1).divide(AV35TotInfAny, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
                              AV60ArtFac = A1435AcuImp1 ;
                              h6M40( false, 17) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 284, Gx_line+0, 402, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26FacMes, "ZZZZZZZZZ9.99")), 424, Gx_line+0, 520, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60ArtFac, "ZZZZZZ9.99")), 554, Gx_line+0, 628, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28PorCli, "ZZ9.99")), 645, Gx_line+0, 690, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29PorTot, "ZZ9.99")), 703, Gx_line+0, 748, Gx_line+17, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                        }
                     }
                  }
                  brk6M48 = true ;
                  pr_default.readNext(4);
               }
               AV30PorCliCli = DecimalUtil.doubleToDec(100) ;
               AV31PorTotCli = AV41TotCliAny.divide(AV35TotInfAny, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
               h6M40( false, 33) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "* TOTAL", ""), 88, Gx_line+10, 140, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 146, Gx_line+10, 366, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotCliMes, "ZZZZZZZZZZ9.99")), 417, Gx_line+10, 520, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TotCliAny, "ZZZZZZZZZZ9.99")), 525, Gx_line+10, 628, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30PorCliCli, "ZZ9.99")), 645, Gx_line+10, 690, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31PorTotCli, "ZZ9.99")), 703, Gx_line+10, 748, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(406, Gx_line+6, 750, Gx_line+6, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
               AV38TotPriMes = AV38TotPriMes.add(AV40TotCliMes) ;
               AV39TotPriAny = AV39TotPriAny.add(AV41TotCliAny) ;
               if ( ! brk6M48 )
               {
                  brk6M48 = true ;
                  pr_default.readNext(4);
               }
            }
            pr_default.close(4);
            AV32PorTotPri = AV39TotPriAny.divide(AV35TotInfAny, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
            AV37TotInfMes = AV37TotInfMes.add(AV38TotPriMes) ;
            AV36TotInfAnyG = AV36TotInfAnyG.add(AV39TotPriAny) ;
            if ( GXutil.strcmp(AV16Prio, "2") == 0 )
            {
               h6M40( false, 33) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "*  *               TOTAL", ""), 88, Gx_line+10, 264, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TotPriMes, "ZZZZZZZZZZ9.99")), 417, Gx_line+10, 520, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39TotPriAny, "ZZZZZZZZZZ9.99")), 525, Gx_line+10, 628, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32PorTotPri, "ZZ9.99")), 703, Gx_line+10, 748, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(406, Gx_line+5, 750, Gx_line+5, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
            }
         }
         h6M40( false, 50) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "*  *  *    T O T A L     G E N E R A L", ""), 89, Gx_line+19, 367, Gx_line+36, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TotInfMes, "ZZZZZZZZZZ9.99")), 417, Gx_line+19, 520, Gx_line+36, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotInfAnyG, "ZZZZZZZZZZ9.99")), 525, Gx_line+19, 628, Gx_line+36, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33PorTotTot, "ZZ9.99")), 701, Gx_line+19, 746, Gx_line+36, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(406, Gx_line+13, 750, Gx_line+13, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+50) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6M40( true, 0) ;
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
      /* 'CALTOT' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P06M411 */
      pr_default.execute(6, new Object[] {AV61EmprCod, Integer.valueOf(AV62CliCod), AV21PSerie, Short.valueOf(AV25Any), AV27ArtEstSer, AV22USerie});
      c1437ArtImp1 = P06M411_A1437ArtImp1[0] ;
      n1437ArtImp1 = P06M411_n1437ArtImp1[0] ;
      pr_default.close(6);
      AV41TotCliAny = AV41TotCliAny.add(c1437ArtImp1) ;
      /* End optimized group. */
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CALTO0' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P06M412 */
      pr_default.execute(7, new Object[] {AV61EmprCod, Integer.valueOf(AV62CliCod), AV21PSerie, Short.valueOf(AV25Any), AV27ArtEstSer, AV22USerie});
      c1436ArtImp0 = P06M412_A1436ArtImp0[0] ;
      n1436ArtImp0 = P06M412_n1436ArtImp0[0] ;
      pr_default.close(7);
      AV41TotCliAny = AV41TotCliAny.add(c1436ArtImp0) ;
      /* End optimized group. */
   }

   public void h6M40( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha :", ""), 480, Gx_line+8, 532, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora   :", ""), 619, Gx_line+8, 678, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 6, Gx_line+9, 226, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 539, Gx_line+9, 598, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 698, Gx_line+9, 757, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 698, Gx_line+44, 743, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Facturacion", ""), 439, Gx_line+84, 520, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Prio2, "")), 7, Gx_line+74, 15, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit18, "")), 80, Gx_line+74, 125, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27ArtEstSer, "")), 131, Gx_line+74, 154, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente ", ""), 7, Gx_line+101, 66, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Año", ""), 558, Gx_line+101, 581, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Clien.  Total", ""), 645, Gx_line+101, 741, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17Mes), "Z9")), 483, Gx_line+102, 499, Gx_line+119, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Any1), "ZZZ9")), 588, Gx_line+102, 618, Gx_line+119, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+64, 798, Gx_line+64, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+123, 802, Gx_line+123, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Facturacion", ""), 547, Gx_line+84, 628, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mes", ""), 454, Gx_line+101, 477, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 284, Gx_line+101, 321, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(" %       %", 649, Gx_line+84, 723, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Pgmname, "")), 350, Gx_line+44, 570, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página :", ""), 619, Gx_line+43, 678, Gx_line+60, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit2, "")), 6, Gx_line+44, 299, Gx_line+61, 0+256, 0, 0, 0) ;
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
      AV15ImpCod = "" ;
      AV16Prio = "" ;
      AV21PSerie = "" ;
      AV22USerie = "" ;
      AV42Lit0 = "" ;
      AV43Lit1 = "" ;
      AV44Lit2 = "" ;
      AV45Lit3 = "" ;
      AV46Lit4 = "" ;
      AV47Lit5 = "" ;
      AV48Lit6 = "" ;
      AV49Lit7 = "" ;
      AV50Lit8 = "" ;
      AV51Lit9 = "" ;
      AV52Lit10 = "" ;
      AV53Lit11 = "" ;
      AV54Lit12 = "" ;
      AV55Lit13 = "" ;
      AV56Lit14 = "" ;
      AV57Lit15 = "" ;
      AV58Lit16 = "" ;
      AV59Lit17 = "" ;
      AV63Lit18 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06M42_A396EmprCod = new String[] {""} ;
      P06M42_A407EmprNom = new String[] {""} ;
      P06M42_n407EmprNom = new boolean[] {false} ;
      P06M42_A963Ser1 = new String[] {""} ;
      P06M42_n963Ser1 = new boolean[] {false} ;
      P06M42_A2387Ser2 = new String[] {""} ;
      P06M42_n2387Ser2 = new boolean[] {false} ;
      P06M42_A2389Ser3 = new String[] {""} ;
      P06M42_n2389Ser3 = new boolean[] {false} ;
      P06M42_A4215Ser4 = new String[] {""} ;
      P06M42_n4215Ser4 = new boolean[] {false} ;
      P06M42_A4217Ser5 = new String[] {""} ;
      P06M42_n4217Ser5 = new boolean[] {false} ;
      P06M42_A4219Ser6 = new String[] {""} ;
      P06M42_n4219Ser6 = new boolean[] {false} ;
      P06M42_A4221Ser7 = new String[] {""} ;
      P06M42_n4221Ser7 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      A4215Ser4 = "" ;
      A4217Ser5 = "" ;
      A4219Ser6 = "" ;
      A4221Ser7 = "" ;
      AV24NomEmp = "" ;
      AV27ArtEstSer = "" ;
      AV34Prio2 = "" ;
      AV35TotInfAny = DecimalUtil.ZERO ;
      AV36TotInfAnyG = DecimalUtil.ZERO ;
      AV37TotInfMes = DecimalUtil.ZERO ;
      P06M44_A396EmprCod = new String[] {""} ;
      P06M44_A2756ArtEstSer = new String[] {""} ;
      P06M44_A71ArtEstAny = new short[1] ;
      P06M44_A65ArtCod = new String[] {""} ;
      P06M44_A252CliCod = new int[1] ;
      P06M44_A1435AcuImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M44_n1435AcuImp1 = new boolean[] {false} ;
      P06M44_A1434AcuImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M44_n1434AcuImp0 = new boolean[] {false} ;
      A2756ArtEstSer = "" ;
      A65ArtCod = "" ;
      A1435AcuImp1 = DecimalUtil.ZERO ;
      A1434AcuImp0 = DecimalUtil.ZERO ;
      AV38TotPriMes = DecimalUtil.ZERO ;
      AV39TotPriAny = DecimalUtil.ZERO ;
      P06M46_A396EmprCod = new String[] {""} ;
      P06M46_A2756ArtEstSer = new String[] {""} ;
      P06M46_A71ArtEstAny = new short[1] ;
      P06M46_A65ArtCod = new String[] {""} ;
      P06M46_A252CliCod = new int[1] ;
      P06M46_A94ArtRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M46_n94ArtRdto = new boolean[] {false} ;
      P06M46_A279CliNom = new String[] {""} ;
      P06M46_A1434AcuImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M46_n1434AcuImp0 = new boolean[] {false} ;
      A94ArtRdto = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV40TotCliMes = DecimalUtil.ZERO ;
      AV41TotCliAny = DecimalUtil.ZERO ;
      AV61EmprCod = "" ;
      AV26FacMes = DecimalUtil.ZERO ;
      AV60ArtFac = DecimalUtil.ZERO ;
      P06M47_A396EmprCod = new String[] {""} ;
      P06M47_A252CliCod = new int[1] ;
      P06M47_A65ArtCod = new String[] {""} ;
      P06M47_A71ArtEstAny = new short[1] ;
      P06M47_A2756ArtEstSer = new String[] {""} ;
      P06M47_A72ArtEstMes = new byte[1] ;
      P06M47_A1436ArtImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M47_n1436ArtImp0 = new boolean[] {false} ;
      A1436ArtImp0 = DecimalUtil.ZERO ;
      AV28PorCli = DecimalUtil.ZERO ;
      AV29PorTot = DecimalUtil.ZERO ;
      AV30PorCliCli = DecimalUtil.ZERO ;
      AV31PorTotCli = DecimalUtil.ZERO ;
      AV32PorTotPri = DecimalUtil.ZERO ;
      P06M49_A396EmprCod = new String[] {""} ;
      P06M49_A2756ArtEstSer = new String[] {""} ;
      P06M49_A71ArtEstAny = new short[1] ;
      P06M49_A65ArtCod = new String[] {""} ;
      P06M49_A252CliCod = new int[1] ;
      P06M49_A94ArtRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M49_n94ArtRdto = new boolean[] {false} ;
      P06M49_A279CliNom = new String[] {""} ;
      P06M49_A1435AcuImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M49_n1435AcuImp1 = new boolean[] {false} ;
      P06M410_A396EmprCod = new String[] {""} ;
      P06M410_A252CliCod = new int[1] ;
      P06M410_A65ArtCod = new String[] {""} ;
      P06M410_A71ArtEstAny = new short[1] ;
      P06M410_A2756ArtEstSer = new String[] {""} ;
      P06M410_A72ArtEstMes = new byte[1] ;
      P06M410_A1437ArtImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M410_n1437ArtImp1 = new boolean[] {false} ;
      A1437ArtImp1 = DecimalUtil.ZERO ;
      AV33PorTotTot = DecimalUtil.ZERO ;
      c1437ArtImp1 = DecimalUtil.ZERO ;
      P06M411_A1437ArtImp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M411_n1437ArtImp1 = new boolean[] {false} ;
      c1436ArtImp0 = DecimalUtil.ZERO ;
      P06M412_A1436ArtImp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M412_n1436ArtImp0 = new boolean[] {false} ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV71Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa0009__default(),
         new Object[] {
             new Object[] {
            P06M42_A396EmprCod, P06M42_A407EmprNom, P06M42_n407EmprNom, P06M42_A963Ser1, P06M42_n963Ser1, P06M42_A2387Ser2, P06M42_n2387Ser2, P06M42_A2389Ser3, P06M42_n2389Ser3, P06M42_A4215Ser4,
            P06M42_n4215Ser4, P06M42_A4217Ser5, P06M42_n4217Ser5, P06M42_A4219Ser6, P06M42_n4219Ser6, P06M42_A4221Ser7, P06M42_n4221Ser7
            }
            , new Object[] {
            P06M44_A396EmprCod, P06M44_A2756ArtEstSer, P06M44_A71ArtEstAny, P06M44_A65ArtCod, P06M44_A252CliCod, P06M44_A1435AcuImp1, P06M44_A1434AcuImp0
            }
            , new Object[] {
            P06M46_A396EmprCod, P06M46_A2756ArtEstSer, P06M46_A71ArtEstAny, P06M46_A65ArtCod, P06M46_A252CliCod, P06M46_A94ArtRdto, P06M46_n94ArtRdto, P06M46_A279CliNom, P06M46_A1434AcuImp0, P06M46_n1434AcuImp0
            }
            , new Object[] {
            P06M47_A396EmprCod, P06M47_A252CliCod, P06M47_A65ArtCod, P06M47_A71ArtEstAny, P06M47_A2756ArtEstSer, P06M47_A72ArtEstMes, P06M47_A1436ArtImp0, P06M47_n1436ArtImp0
            }
            , new Object[] {
            P06M49_A396EmprCod, P06M49_A2756ArtEstSer, P06M49_A71ArtEstAny, P06M49_A65ArtCod, P06M49_A252CliCod, P06M49_A94ArtRdto, P06M49_n94ArtRdto, P06M49_A279CliNom, P06M49_A1435AcuImp1, P06M49_n1435AcuImp1
            }
            , new Object[] {
            P06M410_A396EmprCod, P06M410_A252CliCod, P06M410_A65ArtCod, P06M410_A71ArtEstAny, P06M410_A2756ArtEstSer, P06M410_A72ArtEstMes, P06M410_A1437ArtImp1, P06M410_n1437ArtImp1
            }
            , new Object[] {
            P06M411_A1437ArtImp1, P06M411_n1437ArtImp1
            }
            , new Object[] {
            P06M412_A1436ArtImp0, P06M412_n1436ArtImp0
            }
         }
      );
      AV71Pgmname = "Facturacion.RFA0009" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV71Pgmname = "Facturacion.RFA0009" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17Mes ;
   private byte AV23SerieF ;
   private byte A72ArtEstMes ;
   private short gxcookieaux ;
   private short AV18Any1 ;
   private short AV25Any ;
   private short A71ArtEstAny ;
   private short Gx_err ;
   private int AV19PCliCod ;
   private int AV20UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV62CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV35TotInfAny ;
   private java.math.BigDecimal AV36TotInfAnyG ;
   private java.math.BigDecimal AV37TotInfMes ;
   private java.math.BigDecimal A1435AcuImp1 ;
   private java.math.BigDecimal A1434AcuImp0 ;
   private java.math.BigDecimal AV38TotPriMes ;
   private java.math.BigDecimal AV39TotPriAny ;
   private java.math.BigDecimal A94ArtRdto ;
   private java.math.BigDecimal AV40TotCliMes ;
   private java.math.BigDecimal AV41TotCliAny ;
   private java.math.BigDecimal AV26FacMes ;
   private java.math.BigDecimal AV60ArtFac ;
   private java.math.BigDecimal A1436ArtImp0 ;
   private java.math.BigDecimal AV28PorCli ;
   private java.math.BigDecimal AV29PorTot ;
   private java.math.BigDecimal AV30PorCliCli ;
   private java.math.BigDecimal AV31PorTotCli ;
   private java.math.BigDecimal AV32PorTotPri ;
   private java.math.BigDecimal A1437ArtImp1 ;
   private java.math.BigDecimal AV33PorTotTot ;
   private java.math.BigDecimal c1437ArtImp1 ;
   private java.math.BigDecimal c1436ArtImp0 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16Prio ;
   private String AV21PSerie ;
   private String AV22USerie ;
   private String AV42Lit0 ;
   private String AV43Lit1 ;
   private String AV44Lit2 ;
   private String AV45Lit3 ;
   private String AV46Lit4 ;
   private String AV47Lit5 ;
   private String AV48Lit6 ;
   private String AV49Lit7 ;
   private String AV50Lit8 ;
   private String AV51Lit9 ;
   private String AV52Lit10 ;
   private String AV53Lit11 ;
   private String AV54Lit12 ;
   private String AV55Lit13 ;
   private String AV56Lit14 ;
   private String AV57Lit15 ;
   private String AV58Lit16 ;
   private String AV59Lit17 ;
   private String AV63Lit18 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String A4215Ser4 ;
   private String A4217Ser5 ;
   private String A4219Ser6 ;
   private String A4221Ser7 ;
   private String AV24NomEmp ;
   private String AV27ArtEstSer ;
   private String AV34Prio2 ;
   private String A2756ArtEstSer ;
   private String A65ArtCod ;
   private String A279CliNom ;
   private String AV61EmprCod ;
   private String Gx_time ;
   private String AV71Pgmname ;
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
   private boolean n1435AcuImp1 ;
   private boolean n1434AcuImp0 ;
   private boolean brk6M45 ;
   private boolean n94ArtRdto ;
   private boolean returnInSub ;
   private boolean n1436ArtImp0 ;
   private boolean brk6M48 ;
   private boolean n1437ArtImp1 ;
   private IDataStoreProvider pr_default ;
   private String[] P06M42_A396EmprCod ;
   private String[] P06M42_A407EmprNom ;
   private boolean[] P06M42_n407EmprNom ;
   private String[] P06M42_A963Ser1 ;
   private boolean[] P06M42_n963Ser1 ;
   private String[] P06M42_A2387Ser2 ;
   private boolean[] P06M42_n2387Ser2 ;
   private String[] P06M42_A2389Ser3 ;
   private boolean[] P06M42_n2389Ser3 ;
   private String[] P06M42_A4215Ser4 ;
   private boolean[] P06M42_n4215Ser4 ;
   private String[] P06M42_A4217Ser5 ;
   private boolean[] P06M42_n4217Ser5 ;
   private String[] P06M42_A4219Ser6 ;
   private boolean[] P06M42_n4219Ser6 ;
   private String[] P06M42_A4221Ser7 ;
   private boolean[] P06M42_n4221Ser7 ;
   private String[] P06M44_A396EmprCod ;
   private String[] P06M44_A2756ArtEstSer ;
   private short[] P06M44_A71ArtEstAny ;
   private String[] P06M44_A65ArtCod ;
   private int[] P06M44_A252CliCod ;
   private java.math.BigDecimal[] P06M44_A1435AcuImp1 ;
   private boolean[] P06M44_n1435AcuImp1 ;
   private java.math.BigDecimal[] P06M44_A1434AcuImp0 ;
   private boolean[] P06M44_n1434AcuImp0 ;
   private String[] P06M46_A396EmprCod ;
   private String[] P06M46_A2756ArtEstSer ;
   private short[] P06M46_A71ArtEstAny ;
   private String[] P06M46_A65ArtCod ;
   private int[] P06M46_A252CliCod ;
   private java.math.BigDecimal[] P06M46_A94ArtRdto ;
   private boolean[] P06M46_n94ArtRdto ;
   private String[] P06M46_A279CliNom ;
   private java.math.BigDecimal[] P06M46_A1434AcuImp0 ;
   private boolean[] P06M46_n1434AcuImp0 ;
   private String[] P06M47_A396EmprCod ;
   private int[] P06M47_A252CliCod ;
   private String[] P06M47_A65ArtCod ;
   private short[] P06M47_A71ArtEstAny ;
   private String[] P06M47_A2756ArtEstSer ;
   private byte[] P06M47_A72ArtEstMes ;
   private java.math.BigDecimal[] P06M47_A1436ArtImp0 ;
   private boolean[] P06M47_n1436ArtImp0 ;
   private String[] P06M49_A396EmprCod ;
   private String[] P06M49_A2756ArtEstSer ;
   private short[] P06M49_A71ArtEstAny ;
   private String[] P06M49_A65ArtCod ;
   private int[] P06M49_A252CliCod ;
   private java.math.BigDecimal[] P06M49_A94ArtRdto ;
   private boolean[] P06M49_n94ArtRdto ;
   private String[] P06M49_A279CliNom ;
   private java.math.BigDecimal[] P06M49_A1435AcuImp1 ;
   private boolean[] P06M49_n1435AcuImp1 ;
   private String[] P06M410_A396EmprCod ;
   private int[] P06M410_A252CliCod ;
   private String[] P06M410_A65ArtCod ;
   private short[] P06M410_A71ArtEstAny ;
   private String[] P06M410_A2756ArtEstSer ;
   private byte[] P06M410_A72ArtEstMes ;
   private java.math.BigDecimal[] P06M410_A1437ArtImp1 ;
   private boolean[] P06M410_n1437ArtImp1 ;
   private java.math.BigDecimal[] P06M411_A1437ArtImp1 ;
   private boolean[] P06M411_n1437ArtImp1 ;
   private java.math.BigDecimal[] P06M412_A1436ArtImp0 ;
   private boolean[] P06M412_n1436ArtImp0 ;
}

final  class rfa0009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06M42", "SELECT EmprCod, EmprNom, Ser1, Ser2, Ser3, Ser4, Ser5, Ser6, Ser7 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06M44", "SELECT T1.EmprCod, T1.ArtEstSer, T1.ArtEstAny, T1.ArtCod, T1.CliCod, COALESCE( T2.AcuImp1, 0) AS AcuImp1, COALESCE( T2.AcuImp0, 0) AS AcuImp0 FROM (TXPCESART T1 LEFT JOIN (SELECT SUM(ArtImp1) AS AcuImp1, EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, SUM(ArtImp0) AS AcuImp0 FROM TXPLESART GROUP BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod AND T2.ArtEstAny = T1.ArtEstAny AND T2.ArtEstSer = T1.ArtEstSer) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.ArtCod >= ? and T1.ArtEstAny = ? and T1.ArtEstSer = ?) AND (T1.ArtCod <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ArtEstAny, T1.ArtEstSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06M46", "SELECT T1.EmprCod, T1.ArtEstSer, T1.ArtEstAny, T1.ArtCod, T1.CliCod, T1.ArtRdto, T2.CliNom, COALESCE( T3.AcuImp0, 0) AS AcuImp0 FROM ((TXPCESART T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(ArtImp0) AS AcuImp0, EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPLESART GROUP BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer ) T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod AND T3.ArtEstAny = T1.ArtEstAny AND T3.ArtEstSer = T1.ArtEstSer) WHERE (T1.EmprCod = ? and T1.CliCod >= ?) AND (T1.ArtEstAny = ?) AND (T1.ArtEstSer = ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ArtEstAny, T1.ArtEstSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06M47", "SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes, ArtImp0 FROM TXPLESART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtEstAny = ? and ArtEstSer = ? and ArtEstMes = ? ORDER BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06M49", "SELECT T1.EmprCod, T1.ArtEstSer, T1.ArtEstAny, T1.ArtCod, T1.CliCod, T1.ArtRdto, T2.CliNom, COALESCE( T3.AcuImp1, 0) AS AcuImp1 FROM ((TXPCESART T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(ArtImp1) AS AcuImp1, EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPLESART GROUP BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer ) T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod AND T3.ArtEstAny = T1.ArtEstAny AND T3.ArtEstSer = T1.ArtEstSer) WHERE (T1.EmprCod = ? and T1.CliCod >= ?) AND (T1.ArtEstAny = ?) AND (T1.ArtEstSer = ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ArtEstAny, T1.ArtEstSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06M410", "SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes, ArtImp1 FROM TXPLESART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ArtEstAny = ? and ArtEstSer = ? and ArtEstMes = ? ORDER BY EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer, ArtEstMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06M411", "SELECT SUM(ArtImp1) AS AcuImp1 FROM TXPLESART WHERE (EmprCod = ? and CliCod = ? and ArtCod >= ? and ArtEstAny = ? and ArtEstSer = ?) AND (ArtCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06M412", "SELECT SUM(ArtImp0) AS AcuImp0 FROM TXPLESART WHERE (EmprCod = ? and CliCod = ? and ArtCod >= ? and ArtEstAny = ? and ArtEstSer = ?) AND (ArtCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               return;
      }
   }

}

