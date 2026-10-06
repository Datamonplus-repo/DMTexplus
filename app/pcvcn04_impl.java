package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pcvcn04_impl extends GXWebReport
{
   public pcvcn04_impl( com.genexus.internet.HttpContext context )
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
            AV8Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
            AV9Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
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
      M_bot = 0 ;
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
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P092W2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P092W2_A407EmprNom[0] ;
            n407EmprNom = P092W2_n407EmprNom[0] ;
            AV36Emprcod = A396EmprCod ;
            AV10EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV16kgst = DecimalUtil.doubleToDec(0) ;
         AV20mtst = DecimalUtil.doubleToDec(0) ;
         AV18Kgsst = DecimalUtil.doubleToDec(0) ;
         AV17Mtsst = DecimalUtil.doubleToDec(0) ;
         AV21Kilos = DecimalUtil.doubleToDec(0) ;
         AV22Metros = DecimalUtil.doubleToDec(0) ;
         AV25Piezas = 0 ;
         AV12Pzss = 0 ;
         AV19pzsst = 0 ;
         AV15pzst = 0 ;
         AV27x = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 1000 )
         {
            AV28Tab_clientes[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 1000 )
         {
            AV29Tab_kilose[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 1000 )
         {
            AV32Tab_kiloss[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 1000 )
         {
            AV30Tab_Metrose[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 1000 )
         {
            AV33Tab_Metross[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 1000 )
         {
            AV31Tab_piezase[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 1000 )
         {
            AV34Tab_piezass[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P092W4 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV8Fec1, AV9Fec2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk92W4 = false ;
            A129BarCod = P092W4_A129BarCod[0] ;
            A132BarCodReo = P092W4_A132BarCodReo[0] ;
            A130BarCodPar = P092W4_A130BarCodPar[0] ;
            A159BarFecGen = P092W4_A159BarFecGen[0] ;
            A252CliCod = P092W4_A252CliCod[0] ;
            n252CliCod = P092W4_n252CliCod[0] ;
            A166BarKgm = P092W4_A166BarKgm[0] ;
            A184BarMtr = P092W4_A184BarMtr[0] ;
            A199BarPie1 = P092W4_A199BarPie1[0] ;
            A365DisDes = P092W4_A365DisDes[0] ;
            A898BarPieNDes = P092W4_A898BarPieNDes[0] ;
            A166BarKgm = P092W4_A166BarKgm[0] ;
            A184BarMtr = P092W4_A184BarMtr[0] ;
            A199BarPie1 = P092W4_A199BarPie1[0] ;
            A898BarPieNDes = P092W4_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV21Kilos = DecimalUtil.doubleToDec(0) ;
            AV22Metros = DecimalUtil.doubleToDec(0) ;
            AV25Piezas = 0 ;
            AV12Pzss = 0 ;
            AV14Mtss = DecimalUtil.doubleToDec(0) ;
            AV13kgss = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P092W4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P092W4_A252CliCod[0] == A252CliCod ) )
            {
               brk92W4 = false ;
               A129BarCod = P092W4_A129BarCod[0] ;
               A132BarCodReo = P092W4_A132BarCodReo[0] ;
               A130BarCodPar = P092W4_A130BarCodPar[0] ;
               A159BarFecGen = P092W4_A159BarFecGen[0] ;
               A365DisDes = P092W4_A365DisDes[0] ;
               if ( (( GXutil.resetTime(A159BarFecGen).after( GXutil.resetTime( AV8Fec1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A159BarFecGen), GXutil.resetTime(AV8Fec1)) )) )
               {
                  if ( (( GXutil.resetTime(A159BarFecGen).before( GXutil.resetTime( AV9Fec2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A159BarFecGen), GXutil.resetTime(AV9Fec2)) )) )
                  {
                     /* Using cursor P092W6 */
                     pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     if ( (pr_default.getStatus(2) != 101) )
                     {
                        A166BarKgm = P092W6_A166BarKgm[0] ;
                        A184BarMtr = P092W6_A184BarMtr[0] ;
                        A199BarPie1 = P092W6_A199BarPie1[0] ;
                        A898BarPieNDes = P092W6_A898BarPieNDes[0] ;
                     }
                     else
                     {
                        A166BarKgm = DecimalUtil.doubleToDec(0) ;
                        A184BarMtr = DecimalUtil.doubleToDec(0) ;
                        A898BarPieNDes = 0 ;
                        A199BarPie1 = (short)(0) ;
                     }
                     pr_default.close(2);
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     AV23clicod = A252CliCod ;
                     AV21Kilos = AV21Kilos.add(A166BarKgm) ;
                     AV22Metros = AV22Metros.add(A184BarMtr) ;
                     AV25Piezas = (int)(AV25Piezas+A198BarPie) ;
                  }
               }
               brk92W4 = true ;
               pr_default.readNext(1);
            }
            /* Execute user subroutine: 'CONTROLTABLA' */
            S111 ();
            if ( returnInSub )
            {
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
            if ( ! brk92W4 )
            {
               brk92W4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         /* Using cursor P092W7 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV8Fec1, AV9Fec2});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A30AlbProCod = P092W7_A30AlbProCod[0] ;
            A34AlbProfch = P092W7_A34AlbProfch[0] ;
            A1243GuiRemCli = P092W7_A1243GuiRemCli[0] ;
            AV21Kilos = DecimalUtil.doubleToDec(0) ;
            AV22Metros = DecimalUtil.doubleToDec(0) ;
            AV25Piezas = 0 ;
            AV12Pzss = 0 ;
            AV14Mtss = DecimalUtil.doubleToDec(0) ;
            AV13kgss = DecimalUtil.doubleToDec(0) ;
            /* Optimized group. */
            /* Using cursor P092W8 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            c1263BarAlbMtrE = P092W8_A1263BarAlbMtrE[0] ;
            c1261BarAlbKgmE = P092W8_A1261BarAlbKgmE[0] ;
            c1265BarAlbPie = P092W8_A1265BarAlbPie[0] ;
            pr_default.close(4);
            AV14Mtss = AV14Mtss.add(c1263BarAlbMtrE) ;
            AV13kgss = AV13kgss.add(c1261BarAlbKgmE) ;
            AV12Pzss = (int)(AV12Pzss+c1265BarAlbPie) ;
            /* End optimized group. */
            AV23clicod = A1243GuiRemCli ;
            /* Execute user subroutine: 'CONTROLTABLA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV26i = (short)(1) ;
         while ( AV26i <= 100 )
         {
            if ( AV28Tab_clientes[AV26i-1] == 0 )
            {
               if (true) break;
            }
            AV23clicod = AV28Tab_clientes[AV26i-1] ;
            GXt_char1 = AV24CliNom ;
            GXv_char2[0] = GXt_char1 ;
            new app.pclinom(remoteHandle, context).execute( A396EmprCod, AV23clicod, GXv_char2) ;
            pcvcn04_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24CliNom = GXt_char1 ;
            AV21Kilos = AV29Tab_kilose[AV26i-1] ;
            AV22Metros = AV30Tab_Metrose[AV26i-1] ;
            AV25Piezas = AV31Tab_piezase[AV26i-1] ;
            AV14Mtss = AV33Tab_Metross[AV26i-1] ;
            AV13kgss = AV32Tab_kiloss[AV26i-1] ;
            AV12Pzss = AV34Tab_piezass[AV26i-1] ;
            AV16kgst = AV16kgst.add(AV21Kilos) ;
            AV20mtst = AV20mtst.add(AV22Metros) ;
            AV18Kgsst = AV18Kgsst.add(AV13kgss) ;
            AV17Mtsst = AV17Mtsst.add(AV14Mtss) ;
            AV15pzst = (int)(AV15pzst+AV25Piezas) ;
            AV19pzsst = (int)(AV19pzsst+AV12Pzss) ;
            h92W0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23clicod), "ZZZZZ9")), 15, Gx_line+0, 60, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24CliNom, "")), 66, Gx_line+0, 286, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Kilos, "ZZZZZZZZ9.99")), 299, Gx_line+0, 388, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22Metros, "ZZZZZZZZ9.99")), 394, Gx_line+0, 483, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13kgss, "ZZZZZZZZ9.99")), 554, Gx_line+0, 643, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14Mtss, "ZZZZZZZZ9.99")), 649, Gx_line+0, 738, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25Piezas), "ZZZZZ9")), 489, Gx_line+0, 534, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Pzss), "ZZZZZ9")), 744, Gx_line+0, 789, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV26i = (short)(AV26i+1) ;
         }
         h92W0( false, 33) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20mtst, "ZZZZZZZZ9.99")), 394, Gx_line+17, 483, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16kgst, "ZZZZZZZZ9.99")), 299, Gx_line+17, 388, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 255, Gx_line+17, 292, Gx_line+34, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Kgsst, "ZZZZZZZZ9.99")), 554, Gx_line+17, 643, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Mtsst, "ZZZZZZZZ9.99")), 649, Gx_line+17, 738, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15pzst), "ZZZZZ9")), 489, Gx_line+17, 534, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19pzsst), "ZZZZZ9")), 744, Gx_line+17, 789, Gx_line+34, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h92W0( true, 0) ;
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
      /* 'CONTROLTABLA' Routine */
      returnInSub = false ;
      AV26i = (short)(1) ;
      AV35alta = (byte)(0) ;
      while ( AV26i <= 1000 )
      {
         if ( AV28Tab_clientes[AV26i-1] == 0 )
         {
            AV35alta = (byte)(1) ;
            if (true) break;
         }
         if ( AV28Tab_clientes[AV26i-1] == AV23clicod )
         {
            AV29Tab_kilose[AV26i-1] = AV29Tab_kilose[AV26i-1].add(AV21Kilos) ;
            AV30Tab_Metrose[AV26i-1] = AV30Tab_Metrose[AV26i-1].add(AV22Metros) ;
            AV31Tab_piezase[AV26i-1] = (int)(AV31Tab_piezase[AV26i-1]+AV25Piezas) ;
            AV32Tab_kiloss[AV26i-1] = AV32Tab_kiloss[AV26i-1].add(AV13kgss) ;
            AV33Tab_Metross[AV26i-1] = AV33Tab_Metross[AV26i-1].add(AV14Mtss) ;
            AV34Tab_piezass[AV26i-1] = (int)(AV34Tab_piezass[AV26i-1]+AV12Pzss) ;
            if (true) break;
         }
         AV26i = (short)(AV26i+1) ;
      }
      if ( AV35alta == 1 )
      {
         AV28Tab_clientes[AV27x-1] = AV23clicod ;
         AV29Tab_kilose[AV27x-1] = AV21Kilos ;
         AV30Tab_Metrose[AV27x-1] = AV22Metros ;
         AV31Tab_piezase[AV27x-1] = AV25Piezas ;
         AV32Tab_kiloss[AV27x-1] = AV13kgss ;
         AV33Tab_Metross[AV27x-1] = AV14Mtss ;
         AV34Tab_piezass[AV27x-1] = AV12Pzss ;
         AV27x = (short)(AV27x+1) ;
      }
   }

   public void h92W0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 15, Gx_line+17, 235, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Pgmdesc, "")), 15, Gx_line+50, 235, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 715, Gx_line+17, 774, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 649, Gx_line+17, 708, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia", ""), 620, Gx_line+17, 643, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 649, Gx_line+50, 694, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 700, Gx_line+50, 767, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 598, Gx_line+50, 643, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 693, Gx_line+50, 701, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+83, 796, Gx_line+83, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV8Fec1, "99/99/99"), 401, Gx_line+50, 460, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV9Fec2, "99/99/99"), 467, Gx_line+50, 526, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Periodo", ""), 343, Gx_line+50, 395, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 15, Gx_line+117, 67, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 365, Gx_line+117, 388, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 445, Gx_line+117, 490, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+133, 286, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(299, Gx_line+133, 387, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(394, Gx_line+133, 482, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entradas", ""), 391, Gx_line+100, 450, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 613, Gx_line+117, 636, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 693, Gx_line+117, 738, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(547, Gx_line+133, 635, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(649, Gx_line+133, 737, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Saidas", ""), 645, Gx_line+100, 690, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(299, Gx_line+107, 358, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(474, Gx_line+107, 532, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(547, Gx_line+107, 592, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(743, Gx_line+107, 788, Gx_line+107, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rolos", ""), 496, Gx_line+117, 533, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(489, Gx_line+133, 533, Gx_line+133, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rolos", ""), 751, Gx_line+117, 788, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(744, Gx_line+133, 788, Gx_line+133, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+139) ;
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
      AV8Fec1 = GXutil.nullDate() ;
      AV9Fec2 = GXutil.nullDate() ;
      scmdbuf = "" ;
      P092W2_A396EmprCod = new String[] {""} ;
      P092W2_A407EmprNom = new String[] {""} ;
      P092W2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV36Emprcod = "" ;
      AV10EmprNom = "" ;
      AV16kgst = DecimalUtil.ZERO ;
      AV20mtst = DecimalUtil.ZERO ;
      AV18Kgsst = DecimalUtil.ZERO ;
      AV17Mtsst = DecimalUtil.ZERO ;
      AV21Kilos = DecimalUtil.ZERO ;
      AV22Metros = DecimalUtil.ZERO ;
      AV28Tab_clientes = new int[1000] ;
      AV29Tab_kilose = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV29Tab_kilose[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV32Tab_kiloss = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV32Tab_kiloss[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV30Tab_Metrose = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV30Tab_Metrose[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV33Tab_Metross = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV33Tab_Metross[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV31Tab_piezase = new int[1000] ;
      AV34Tab_piezass = new int[1000] ;
      P092W4_A129BarCod = new int[1] ;
      P092W4_A132BarCodReo = new byte[1] ;
      P092W4_A130BarCodPar = new String[] {""} ;
      P092W4_A396EmprCod = new String[] {""} ;
      P092W4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P092W4_A252CliCod = new int[1] ;
      P092W4_n252CliCod = new boolean[] {false} ;
      P092W4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092W4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092W4_A199BarPie1 = new short[1] ;
      P092W4_A365DisDes = new String[] {""} ;
      P092W4_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV14Mtss = DecimalUtil.ZERO ;
      AV13kgss = DecimalUtil.ZERO ;
      P092W6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092W6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092W6_A199BarPie1 = new short[1] ;
      P092W6_A898BarPieNDes = new int[1] ;
      P092W7_A396EmprCod = new String[] {""} ;
      P092W7_A30AlbProCod = new long[1] ;
      P092W7_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P092W7_A1243GuiRemCli = new int[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      c1263BarAlbMtrE = DecimalUtil.ZERO ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      P092W8_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092W8_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P092W8_A1265BarAlbPie = new int[1] ;
      AV24CliNom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV41Pgmdesc = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcvcn04__default(),
         new Object[] {
             new Object[] {
            P092W2_A396EmprCod, P092W2_A407EmprNom, P092W2_n407EmprNom
            }
            , new Object[] {
            P092W4_A129BarCod, P092W4_A132BarCodReo, P092W4_A130BarCodPar, P092W4_A396EmprCod, P092W4_A159BarFecGen, P092W4_A252CliCod, P092W4_n252CliCod, P092W4_A166BarKgm, P092W4_A184BarMtr, P092W4_A199BarPie1,
            P092W4_A365DisDes, P092W4_A898BarPieNDes
            }
            , new Object[] {
            P092W6_A166BarKgm, P092W6_A184BarMtr, P092W6_A199BarPie1, P092W6_A898BarPieNDes
            }
            , new Object[] {
            P092W7_A396EmprCod, P092W7_A30AlbProCod, P092W7_A34AlbProfch, P092W7_A1243GuiRemCli
            }
            , new Object[] {
            P092W8_A1263BarAlbMtrE, P092W8_A1261BarAlbKgmE, P092W8_A1265BarAlbPie
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV41Pgmdesc = httpContext.getMessage( "Resumen Entradas/Salidas", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV41Pgmdesc = httpContext.getMessage( "Resumen Entradas/Salidas", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV35alta ;
   private short gxcookieaux ;
   private short AV27x ;
   private short A199BarPie1 ;
   private short AV26i ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV25Piezas ;
   private int AV12Pzss ;
   private int AV19pzsst ;
   private int AV15pzst ;
   private int GX_I ;
   private int AV28Tab_clientes[] ;
   private int AV31Tab_piezase[] ;
   private int AV34Tab_piezass[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV23clicod ;
   private int A1243GuiRemCli ;
   private int c1265BarAlbPie ;
   private int Gx_OldLine ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV16kgst ;
   private java.math.BigDecimal AV20mtst ;
   private java.math.BigDecimal AV18Kgsst ;
   private java.math.BigDecimal AV17Mtsst ;
   private java.math.BigDecimal AV21Kilos ;
   private java.math.BigDecimal AV22Metros ;
   private java.math.BigDecimal AV29Tab_kilose[] ;
   private java.math.BigDecimal AV32Tab_kiloss[] ;
   private java.math.BigDecimal AV30Tab_Metrose[] ;
   private java.math.BigDecimal AV33Tab_Metross[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV14Mtss ;
   private java.math.BigDecimal AV13kgss ;
   private java.math.BigDecimal c1263BarAlbMtrE ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV36Emprcod ;
   private String AV10EmprNom ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String AV24CliNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV41Pgmdesc ;
   private String Gx_time ;
   private java.util.Date AV8Fec1 ;
   private java.util.Date AV9Fec2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk92W4 ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P092W2_A396EmprCod ;
   private String[] P092W2_A407EmprNom ;
   private boolean[] P092W2_n407EmprNom ;
   private int[] P092W4_A129BarCod ;
   private byte[] P092W4_A132BarCodReo ;
   private String[] P092W4_A130BarCodPar ;
   private String[] P092W4_A396EmprCod ;
   private java.util.Date[] P092W4_A159BarFecGen ;
   private int[] P092W4_A252CliCod ;
   private boolean[] P092W4_n252CliCod ;
   private java.math.BigDecimal[] P092W4_A166BarKgm ;
   private java.math.BigDecimal[] P092W4_A184BarMtr ;
   private short[] P092W4_A199BarPie1 ;
   private String[] P092W4_A365DisDes ;
   private int[] P092W4_A898BarPieNDes ;
   private java.math.BigDecimal[] P092W6_A166BarKgm ;
   private java.math.BigDecimal[] P092W6_A184BarMtr ;
   private short[] P092W6_A199BarPie1 ;
   private int[] P092W6_A898BarPieNDes ;
   private String[] P092W7_A396EmprCod ;
   private long[] P092W7_A30AlbProCod ;
   private java.util.Date[] P092W7_A34AlbProfch ;
   private int[] P092W7_A1243GuiRemCli ;
   private java.math.BigDecimal[] P092W8_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P092W8_A1261BarAlbKgmE ;
   private int[] P092W8_A1265BarAlbPie ;
}

final  class pcvcn04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P092W2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P092W4", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.BarFecGen, T1.CliCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarFecGen >= ?) AND (T1.BarFecGen <= ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092W6", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092W7", "SELECT EmprCod, AlbProCod, AlbProfch, GuiRemCli FROM TXPCALPRD WHERE (EmprCod = ?) AND (AlbProfch >= ?) AND (AlbProfch <= ?) ORDER BY EmprCod, GuiRemCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P092W8", "SELECT SUM(BarAlbMtrE), SUM(BarAlbKgmE), SUM(BarAlbPie) FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

