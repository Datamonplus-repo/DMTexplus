package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pcvcn01_impl extends GXWebReport
{
   public pcvcn01_impl( com.genexus.internet.HttpContext context )
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         /* Using cursor P060Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P060Y2_A407EmprNom[0] ;
            n407EmprNom = P060Y2_n407EmprNom[0] ;
            AV10EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P060Y4 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV8Fec1, AV9Fec2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P060Y4_A130BarCodPar[0] ;
            A132BarCodReo = P060Y4_A132BarCodReo[0] ;
            A129BarCod = P060Y4_A129BarCod[0] ;
            A159BarFecGen = P060Y4_A159BarFecGen[0] ;
            A212BarSer = P060Y4_A212BarSer[0] ;
            A135BarColNom = P060Y4_A135BarColNom[0] ;
            A1234BarNomCli = P060Y4_A1234BarNomCli[0] ;
            A158BarFecFpr = P060Y4_A158BarFecFpr[0] ;
            A4812BarEncCli = P060Y4_A4812BarEncCli[0] ;
            A252CliCod = P060Y4_A252CliCod[0] ;
            n252CliCod = P060Y4_n252CliCod[0] ;
            A184BarMtr = P060Y4_A184BarMtr[0] ;
            A166BarKgm = P060Y4_A166BarKgm[0] ;
            A199BarPie1 = P060Y4_A199BarPie1[0] ;
            A365DisDes = P060Y4_A365DisDes[0] ;
            A898BarPieNDes = P060Y4_A898BarPieNDes[0] ;
            A184BarMtr = P060Y4_A184BarMtr[0] ;
            A166BarKgm = P060Y4_A166BarKgm[0] ;
            A199BarPie1 = P060Y4_A199BarPie1[0] ;
            A898BarPieNDes = P060Y4_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            if ( ( A166BarKgm.doubleValue() == 0 ) && ( A184BarMtr.doubleValue() == 0 ) )
            {
            }
            else
            {
               AV11Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               AV12Pzss = (short)(0) ;
               AV14Mtss = DecimalUtil.doubleToDec(0) ;
               AV13kgss = DecimalUtil.doubleToDec(0) ;
               /* Optimized group. */
               /* Using cursor P060Y5 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               c1265BarAlbPie = (short)((short)(P060Y5_A1265BarAlbPie[0])) ;
               c1263BarAlbMtrE = P060Y5_A1263BarAlbMtrE[0] ;
               c1261BarAlbKgmE = P060Y5_A1261BarAlbKgmE[0] ;
               pr_default.close(2);
               AV12Pzss = (short)(AV12Pzss+c1265BarAlbPie) ;
               AV14Mtss = AV14Mtss.add(c1263BarAlbMtrE) ;
               AV13kgss = AV13kgss.add(c1261BarAlbKgmE) ;
               /* End optimized group. */
               h60Y0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Hdr, "")), 15, Gx_line+0, 96, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 102, Gx_line+0, 161, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 168, Gx_line+0, 213, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 226, Gx_line+0, 306, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A158BarFecFpr, "99/99/99"), 314, Gx_line+0, 373, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 379, Gx_line+0, 475, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 474, Gx_line+0, 570, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 576, Gx_line+0, 694, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 700, Gx_line+0, 745, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 758, Gx_line+0, 825, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")), 839, Gx_line+0, 906, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Pzss), "ZZZ9")), 926, Gx_line+0, 956, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13kgss, "ZZZZZ9.99")), 970, Gx_line+0, 1037, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14Mtss, "ZZZZZ9.99")), 1050, Gx_line+0, 1117, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV15pzst = (int)(AV15pzst+A198BarPie) ;
               AV16kgst = AV16kgst.add(A166BarKgm) ;
               AV20mtst = AV20mtst.add(A184BarMtr) ;
               AV17Mtsst = AV17Mtsst.add(AV14Mtss) ;
               AV18Kgsst = AV18Kgsst.add(AV13kgss) ;
               AV19pzsst = (int)(AV19pzsst+AV12Pzss) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         if ( AV15pzst > 0 )
         {
            h60Y0( false, 33) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19pzsst), "ZZZZZ9")), 911, Gx_line+17, 956, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Kgsst, "ZZZZZZ9.99")), 963, Gx_line+17, 1037, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Mtsst, "ZZZZZZ9.99")), 1043, Gx_line+17, 1117, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15pzst), "ZZZZZ9")), 700, Gx_line+17, 745, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16kgst, "ZZZZZZ9.99")), 751, Gx_line+17, 825, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20mtst, "ZZZZZZ9.99")), 831, Gx_line+17, 905, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 649, Gx_line+17, 686, Gx_line+34, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h60Y0( true, 0) ;
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

   public void h60Y0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 15, Gx_line+17, 235, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Pgmdesc, "")), 15, Gx_line+50, 235, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 992, Gx_line+17, 1051, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 926, Gx_line+17, 985, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dia", ""), 897, Gx_line+17, 920, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 926, Gx_line+50, 971, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 977, Gx_line+50, 1044, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 875, Gx_line+50, 920, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 970, Gx_line+50, 978, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+83, 1124, Gx_line+83, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 22, Gx_line+117, 52, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+133, 95, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 117, Gx_line+117, 147, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(102, Gx_line+133, 160, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 168, Gx_line+117, 220, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Encomenda", ""), 226, Gx_line+117, 293, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 321, Gx_line+100, 351, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pedida", ""), 314, Gx_line+117, 359, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 379, Gx_line+117, 453, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 474, Gx_line+117, 497, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 576, Gx_line+117, 621, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pçs", ""), 700, Gx_line+117, 723, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 802, Gx_line+117, 825, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 860, Gx_line+117, 905, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saida", ""), 1006, Gx_line+100, 1043, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pçs", ""), 933, Gx_line+117, 956, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 984, Gx_line+117, 1007, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 1072, Gx_line+117, 1117, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 117, Gx_line+100, 147, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(168, Gx_line+133, 212, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(226, Gx_line+133, 306, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(314, Gx_line+133, 372, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(379, Gx_line+133, 474, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(474, Gx_line+133, 569, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(576, Gx_line+133, 693, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(700, Gx_line+133, 744, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(758, Gx_line+133, 824, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(839, Gx_line+133, 905, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(911, Gx_line+133, 955, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(970, Gx_line+133, 1036, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1050, Gx_line+133, 1116, Gx_line+133, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(911, Gx_line+107, 992, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1056, Gx_line+107, 1115, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV8Fec1, "99/99/99"), 401, Gx_line+50, 460, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV9Fec2, "99/99/99"), 467, Gx_line+50, 526, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Periodo", ""), 343, Gx_line+50, 395, Gx_line+67, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+150) ;
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
      P060Y2_A396EmprCod = new String[] {""} ;
      P060Y2_A407EmprNom = new String[] {""} ;
      P060Y2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      P060Y4_A396EmprCod = new String[] {""} ;
      P060Y4_A130BarCodPar = new String[] {""} ;
      P060Y4_A132BarCodReo = new byte[1] ;
      P060Y4_A129BarCod = new int[1] ;
      P060Y4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P060Y4_A212BarSer = new String[] {""} ;
      P060Y4_A135BarColNom = new String[] {""} ;
      P060Y4_A1234BarNomCli = new String[] {""} ;
      P060Y4_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P060Y4_A4812BarEncCli = new String[] {""} ;
      P060Y4_A252CliCod = new int[1] ;
      P060Y4_n252CliCod = new boolean[] {false} ;
      P060Y4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P060Y4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P060Y4_A199BarPie1 = new short[1] ;
      P060Y4_A365DisDes = new String[] {""} ;
      P060Y4_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A4812BarEncCli = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV11Hdr = "" ;
      AV14Mtss = DecimalUtil.ZERO ;
      AV13kgss = DecimalUtil.ZERO ;
      c1263BarAlbMtrE = DecimalUtil.ZERO ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      P060Y5_A1265BarAlbPie = new int[1] ;
      P060Y5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P060Y5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV16kgst = DecimalUtil.ZERO ;
      AV20mtst = DecimalUtil.ZERO ;
      AV17Mtsst = DecimalUtil.ZERO ;
      AV18Kgsst = DecimalUtil.ZERO ;
      AV25Pgmdesc = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcvcn01__default(),
         new Object[] {
             new Object[] {
            P060Y2_A396EmprCod, P060Y2_A407EmprNom, P060Y2_n407EmprNom
            }
            , new Object[] {
            P060Y4_A396EmprCod, P060Y4_A130BarCodPar, P060Y4_A132BarCodReo, P060Y4_A129BarCod, P060Y4_A159BarFecGen, P060Y4_A212BarSer, P060Y4_A135BarColNom, P060Y4_A1234BarNomCli, P060Y4_A158BarFecFpr, P060Y4_A4812BarEncCli,
            P060Y4_A252CliCod, P060Y4_n252CliCod, P060Y4_A184BarMtr, P060Y4_A166BarKgm, P060Y4_A199BarPie1, P060Y4_A365DisDes, P060Y4_A898BarPieNDes
            }
            , new Object[] {
            P060Y5_A1265BarAlbPie, P060Y5_A1263BarAlbMtrE, P060Y5_A1261BarAlbKgmE
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV25Pgmdesc = httpContext.getMessage( "Informe de OSs", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV25Pgmdesc = httpContext.getMessage( "Informe de OSs", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A199BarPie1 ;
   private short AV12Pzss ;
   private short c1265BarAlbPie ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int Gx_OldLine ;
   private int AV15pzst ;
   private int AV19pzsst ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV14Mtss ;
   private java.math.BigDecimal AV13kgss ;
   private java.math.BigDecimal c1263BarAlbMtrE ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private java.math.BigDecimal AV16kgst ;
   private java.math.BigDecimal AV20mtst ;
   private java.math.BigDecimal AV17Mtsst ;
   private java.math.BigDecimal AV18Kgsst ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A4812BarEncCli ;
   private String A365DisDes ;
   private String AV11Hdr ;
   private String AV25Pgmdesc ;
   private String Gx_time ;
   private java.util.Date AV8Fec1 ;
   private java.util.Date AV9Fec2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n252CliCod ;
   private IDataStoreProvider pr_default ;
   private String[] P060Y2_A396EmprCod ;
   private String[] P060Y2_A407EmprNom ;
   private boolean[] P060Y2_n407EmprNom ;
   private String[] P060Y4_A396EmprCod ;
   private String[] P060Y4_A130BarCodPar ;
   private byte[] P060Y4_A132BarCodReo ;
   private int[] P060Y4_A129BarCod ;
   private java.util.Date[] P060Y4_A159BarFecGen ;
   private String[] P060Y4_A212BarSer ;
   private String[] P060Y4_A135BarColNom ;
   private String[] P060Y4_A1234BarNomCli ;
   private java.util.Date[] P060Y4_A158BarFecFpr ;
   private String[] P060Y4_A4812BarEncCli ;
   private int[] P060Y4_A252CliCod ;
   private boolean[] P060Y4_n252CliCod ;
   private java.math.BigDecimal[] P060Y4_A184BarMtr ;
   private java.math.BigDecimal[] P060Y4_A166BarKgm ;
   private short[] P060Y4_A199BarPie1 ;
   private String[] P060Y4_A365DisDes ;
   private int[] P060Y4_A898BarPieNDes ;
   private int[] P060Y5_A1265BarAlbPie ;
   private java.math.BigDecimal[] P060Y5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P060Y5_A1261BarAlbKgmE ;
}

final  class pcvcn01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P060Y2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P060Y4", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFecGen, T1.BarSer, T1.BarColNom, T1.BarNomCli, T1.BarFecFpr, T1.BarEncCli, T1.CliCod, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarFecGen >= ?) AND (T1.BarFecGen <= ?) ORDER BY T1.EmprCod, T1.BarFecGen, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P060Y5", "SELECT SUM(BarAlbPie), SUM(BarAlbMtrE), SUM(BarAlbKgmE) FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
      }
   }

}

