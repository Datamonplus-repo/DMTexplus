package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0a15_impl extends GXWebReport
{
   public rst0a15_impl( com.genexus.internet.HttpContext context )
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            n719PrdNum = false ;
            AV22Tipo = (byte)(GXutil.lval( httpContext.GetPar( "Tipo"))) ;
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
         Gx_out = "FIL" ;
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
         GXt_char1 = AV23EmprNom ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = GXt_char1 ;
         new app.pemprnom(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
         rst0a15_impl.this.A396EmprCod = GXv_char2[0] ;
         rst0a15_impl.this.GXt_char1 = GXv_char3[0] ;
         AV23EmprNom = GXt_char1 ;
         /* Using cursor P07BV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A718PrdNom = P07BV2_A718PrdNom[0] ;
            AV21PrdNom = A718PrdNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV22Tipo == 6 )
         {
            /* Using cursor P07BV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2535ForPrdLin = P07BV3_A2535ForPrdLin[0] ;
               A584IntDsc = P07BV3_A584IntDsc[0] ;
               n584IntDsc = P07BV3_n584IntDsc[0] ;
               A583IntCod = P07BV3_A583IntCod[0] ;
               n583IntCod = P07BV3_n583IntCod[0] ;
               A2078ColFon = P07BV3_A2078ColFon[0] ;
               A2074ColCom = P07BV3_A2074ColCom[0] ;
               A1014DibInt = P07BV3_A1014DibInt[0] ;
               A1013DibCli = P07BV3_A1013DibCli[0] ;
               A2141SerEst = P07BV3_A2141SerEst[0] ;
               A252CliCod = P07BV3_A252CliCod[0] ;
               A2098MolCod = P07BV3_A2098MolCod[0] ;
               A583IntCod = P07BV3_A583IntCod[0] ;
               n583IntCod = P07BV3_n583IntCod[0] ;
               A584IntDsc = P07BV3_A584IntDsc[0] ;
               n584IntDsc = P07BV3_n584IntDsc[0] ;
               h7BV0( false, 22) ;
               getPrinter().GxDrawLine(0, Gx_line+19, 821, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 9, Gx_line+0, 54, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2141SerEst, "")), 58, Gx_line+0, 176, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1013DibCli, "")), 178, Gx_line+0, 296, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9")), 299, Gx_line+0, 358, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2074ColCom, "")), 360, Gx_line+0, 449, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2078ColFon, "")), 454, Gx_line+0, 543, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 547, Gx_line+0, 563, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 569, Gx_line+0, 789, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         else if ( AV22Tipo == 7 )
         {
            /* Using cursor P07BV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2144UniEstCod = P07BV4_A2144UniEstCod[0] ;
               n2144UniEstCod = P07BV4_n2144UniEstCod[0] ;
               A2656PasTotRes = P07BV4_A2656PasTotRes[0] ;
               n2656PasTotRes = P07BV4_n2656PasTotRes[0] ;
               A2657PasTotStk = P07BV4_A2657PasTotStk[0] ;
               n2657PasTotStk = P07BV4_n2657PasTotStk[0] ;
               A2108PasDsc = P07BV4_A2108PasDsc[0] ;
               n2108PasDsc = P07BV4_n2108PasDsc[0] ;
               A2107PasCod = P07BV4_A2107PasCod[0] ;
               A2656PasTotRes = P07BV4_A2656PasTotRes[0] ;
               n2656PasTotRes = P07BV4_n2656PasTotRes[0] ;
               A2657PasTotStk = P07BV4_A2657PasTotStk[0] ;
               n2657PasTotStk = P07BV4_n2657PasTotStk[0] ;
               A2108PasDsc = P07BV4_A2108PasDsc[0] ;
               n2108PasDsc = P07BV4_n2108PasDsc[0] ;
               h7BV0( false, 20) ;
               getPrinter().GxDrawLine(0, Gx_line+19, 821, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2107PasCod, "")), 9, Gx_line+1, 54, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2108PasDsc, "")), 58, Gx_line+1, 249, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2657PasTotStk, "ZZZZZZZ9.99")), 254, Gx_line+1, 335, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2656PasTotRes, "ZZZZZZZ9.99")), 319, Gx_line+2, 400, Gx_line+19, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         else if ( AV22Tipo == 8 )
         {
            /* Using cursor P07BV5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4416EstColLin = P07BV5_A4416EstColLin[0] ;
               A279CliNom = P07BV5_A279CliNom[0] ;
               A252CliCod = P07BV5_A252CliCod[0] ;
               A6848EstColDsc = P07BV5_A6848EstColDsc[0] ;
               n6848EstColDsc = P07BV5_n6848EstColDsc[0] ;
               A4415EstCol = P07BV5_A4415EstCol[0] ;
               A279CliNom = P07BV5_A279CliNom[0] ;
               A6848EstColDsc = P07BV5_A6848EstColDsc[0] ;
               n6848EstColDsc = P07BV5_n6848EstColDsc[0] ;
               h7BV0( false, 22) ;
               getPrinter().GxDrawLine(0, Gx_line+20, 821, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4415EstCol, "")), 9, Gx_line+1, 156, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6848EstColDsc, "")), 160, Gx_line+1, 380, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 385, Gx_line+1, 430, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 436, Gx_line+1, 656, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7BV0( true, 0) ;
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

   public void h7BV0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "INFORMACIÓN PRODUCTO", ""), 299, Gx_line+22, 520, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23EmprNom, "")), 4, Gx_line+15, 193, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 760, Gx_line+17, 817, Gx_line+33, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 759, Gx_line+0, 817, Gx_line+16, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Pgmname, "")), 734, Gx_line+32, 891, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha :", ""), 695, Gx_line+1, 736, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora :", ""), 695, Gx_line+18, 728, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PGM :", ""), 695, Gx_line+32, 728, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(0, Gx_line+46, 330, Gx_line+69, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 10, Gx_line+49, 64, Gx_line+63, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(67, Gx_line+46, 67, Gx_line+69, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(124, Gx_line+46, 124, Gx_line+69, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 74, Gx_line+50, 119, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21PrdNom, "")), 131, Gx_line+50, 322, Gx_line+67, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+77) ;
            if ( AV22Tipo == 6 )
            {
               getPrinter().GxDrawLine(3, Gx_line+15, 824, Gx_line+15, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 9, Gx_line+0, 51, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 58, Gx_line+0, 89, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dibujo", ""), 178, Gx_line+0, 217, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Combinación", ""), 360, Gx_line+0, 436, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fondo", ""), 454, Gx_line+0, 491, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 547, Gx_line+0, 609, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            else if ( AV22Tipo == 7 )
            {
               getPrinter().GxDrawLine(3, Gx_line+16, 824, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pasta", ""), 9, Gx_line+3, 43, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Stock ", ""), 273, Gx_line+3, 313, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Reserva", ""), 327, Gx_line+3, 377, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else if ( AV22Tipo == 8 )
            {
               getPrinter().GxDrawLine(3, Gx_line+16, 824, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 9, Gx_line+3, 40, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 385, Gx_line+3, 427, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
      A719PrdNum = "" ;
      AV23EmprNom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P07BV2_A396EmprCod = new String[] {""} ;
      P07BV2_A719PrdNum = new String[] {""} ;
      P07BV2_n719PrdNum = new boolean[] {false} ;
      P07BV2_A718PrdNom = new String[] {""} ;
      A718PrdNom = "" ;
      AV21PrdNom = "" ;
      P07BV3_A396EmprCod = new String[] {""} ;
      P07BV3_A719PrdNum = new String[] {""} ;
      P07BV3_n719PrdNum = new boolean[] {false} ;
      P07BV3_A2535ForPrdLin = new short[1] ;
      P07BV3_A584IntDsc = new String[] {""} ;
      P07BV3_n584IntDsc = new boolean[] {false} ;
      P07BV3_A583IntCod = new byte[1] ;
      P07BV3_n583IntCod = new boolean[] {false} ;
      P07BV3_A2078ColFon = new String[] {""} ;
      P07BV3_A2074ColCom = new String[] {""} ;
      P07BV3_A1014DibInt = new int[1] ;
      P07BV3_A1013DibCli = new String[] {""} ;
      P07BV3_A2141SerEst = new String[] {""} ;
      P07BV3_A252CliCod = new int[1] ;
      P07BV3_A2098MolCod = new byte[1] ;
      A584IntDsc = "" ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      P07BV4_A396EmprCod = new String[] {""} ;
      P07BV4_A719PrdNum = new String[] {""} ;
      P07BV4_n719PrdNum = new boolean[] {false} ;
      P07BV4_A2144UniEstCod = new String[] {""} ;
      P07BV4_n2144UniEstCod = new boolean[] {false} ;
      P07BV4_A2656PasTotRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07BV4_n2656PasTotRes = new boolean[] {false} ;
      P07BV4_A2657PasTotStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07BV4_n2657PasTotStk = new boolean[] {false} ;
      P07BV4_A2108PasDsc = new String[] {""} ;
      P07BV4_n2108PasDsc = new boolean[] {false} ;
      P07BV4_A2107PasCod = new String[] {""} ;
      A2144UniEstCod = "" ;
      A2656PasTotRes = DecimalUtil.ZERO ;
      A2657PasTotStk = DecimalUtil.ZERO ;
      A2108PasDsc = "" ;
      A2107PasCod = "" ;
      P07BV5_A396EmprCod = new String[] {""} ;
      P07BV5_A719PrdNum = new String[] {""} ;
      P07BV5_n719PrdNum = new boolean[] {false} ;
      P07BV5_A4416EstColLin = new short[1] ;
      P07BV5_A279CliNom = new String[] {""} ;
      P07BV5_A252CliCod = new int[1] ;
      P07BV5_A6848EstColDsc = new String[] {""} ;
      P07BV5_n6848EstColDsc = new boolean[] {false} ;
      P07BV5_A4415EstCol = new String[] {""} ;
      A279CliNom = "" ;
      A6848EstColDsc = "" ;
      A4415EstCol = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV29Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0a15__default(),
         new Object[] {
             new Object[] {
            P07BV2_A396EmprCod, P07BV2_A719PrdNum, P07BV2_A718PrdNom
            }
            , new Object[] {
            P07BV3_A396EmprCod, P07BV3_A719PrdNum, P07BV3_n719PrdNum, P07BV3_A2535ForPrdLin, P07BV3_A584IntDsc, P07BV3_n584IntDsc, P07BV3_A583IntCod, P07BV3_n583IntCod, P07BV3_A2078ColFon, P07BV3_A2074ColCom,
            P07BV3_A1014DibInt, P07BV3_A1013DibCli, P07BV3_A2141SerEst, P07BV3_A252CliCod, P07BV3_A2098MolCod
            }
            , new Object[] {
            P07BV4_A396EmprCod, P07BV4_A719PrdNum, P07BV4_A2144UniEstCod, P07BV4_n2144UniEstCod, P07BV4_A2656PasTotRes, P07BV4_n2656PasTotRes, P07BV4_A2657PasTotStk, P07BV4_n2657PasTotStk, P07BV4_A2108PasDsc, P07BV4_n2108PasDsc,
            P07BV4_A2107PasCod
            }
            , new Object[] {
            P07BV5_A396EmprCod, P07BV5_A719PrdNum, P07BV5_A4416EstColLin, P07BV5_A279CliNom, P07BV5_A252CliCod, P07BV5_A6848EstColDsc, P07BV5_n6848EstColDsc, P07BV5_A4415EstCol
            }
         }
      );
      AV29Pgmname = "RST0A15" ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV29Pgmname = "RST0A15" ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV22Tipo ;
   private byte A583IntCod ;
   private byte A2098MolCod ;
   private short gxcookieaux ;
   private short A2535ForPrdLin ;
   private short A4416EstColLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A2656PasTotRes ;
   private java.math.BigDecimal A2657PasTotStk ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV23EmprNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String AV21PrdNom ;
   private String A584IntDsc ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private String A2144UniEstCod ;
   private String A2108PasDsc ;
   private String A2107PasCod ;
   private String A279CliNom ;
   private String A6848EstColDsc ;
   private String A4415EstCol ;
   private String Gx_time ;
   private String AV29Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n584IntDsc ;
   private boolean n583IntCod ;
   private boolean n2144UniEstCod ;
   private boolean n2656PasTotRes ;
   private boolean n2657PasTotStk ;
   private boolean n2108PasDsc ;
   private boolean n6848EstColDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P07BV2_A396EmprCod ;
   private String[] P07BV2_A719PrdNum ;
   private boolean[] P07BV2_n719PrdNum ;
   private String[] P07BV2_A718PrdNom ;
   private String[] P07BV3_A396EmprCod ;
   private String[] P07BV3_A719PrdNum ;
   private boolean[] P07BV3_n719PrdNum ;
   private short[] P07BV3_A2535ForPrdLin ;
   private String[] P07BV3_A584IntDsc ;
   private boolean[] P07BV3_n584IntDsc ;
   private byte[] P07BV3_A583IntCod ;
   private boolean[] P07BV3_n583IntCod ;
   private String[] P07BV3_A2078ColFon ;
   private String[] P07BV3_A2074ColCom ;
   private int[] P07BV3_A1014DibInt ;
   private String[] P07BV3_A1013DibCli ;
   private String[] P07BV3_A2141SerEst ;
   private int[] P07BV3_A252CliCod ;
   private byte[] P07BV3_A2098MolCod ;
   private String[] P07BV4_A396EmprCod ;
   private String[] P07BV4_A719PrdNum ;
   private boolean[] P07BV4_n719PrdNum ;
   private String[] P07BV4_A2144UniEstCod ;
   private boolean[] P07BV4_n2144UniEstCod ;
   private java.math.BigDecimal[] P07BV4_A2656PasTotRes ;
   private boolean[] P07BV4_n2656PasTotRes ;
   private java.math.BigDecimal[] P07BV4_A2657PasTotStk ;
   private boolean[] P07BV4_n2657PasTotStk ;
   private String[] P07BV4_A2108PasDsc ;
   private boolean[] P07BV4_n2108PasDsc ;
   private String[] P07BV4_A2107PasCod ;
   private String[] P07BV5_A396EmprCod ;
   private String[] P07BV5_A719PrdNum ;
   private boolean[] P07BV5_n719PrdNum ;
   private short[] P07BV5_A4416EstColLin ;
   private String[] P07BV5_A279CliNom ;
   private int[] P07BV5_A252CliCod ;
   private String[] P07BV5_A6848EstColDsc ;
   private boolean[] P07BV5_n6848EstColDsc ;
   private String[] P07BV5_A4415EstCol ;
}

final  class rst0a15__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07BV2", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07BV3", "SELECT T1.EmprCod, T1.PrdNum, T1.ForPrdLin, T3.IntDsc, T2.IntCod, T1.ColFon, T1.ColCom, T1.DibInt, T1.DibCli, T1.SerEst, T1.CliCod, T1.MolCod FROM ((TXPRECPR2 T1 INNER JOIN TXPCFORES T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.SerEst = T1.SerEst AND T2.DibCli = T1.DibCli AND T2.DibInt = T1.DibInt AND T2.ColCom = T1.ColCom AND T2.ColFon = T1.ColFon) LEFT JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T2.IntCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07BV4", "SELECT T1.EmprCod, T1.PrdNum, T1.UniEstCod, T2.PasTotRes, T2.PasTotStk, T2.PasDsc, T1.PasCod FROM (TXPLPASTA T1 INNER JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07BV5", "SELECT T1.EmprCod, T1.PrdNum, T1.EstColLin, T2.CliNom, T1.CliCod, T3.EstColDsc, T1.EstCol FROM ((TXPLEstCo T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCEstCo T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.EstCol = T1.EstCol) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 12);
               ((String[]) buf[9])[0] = rslt.getString(7, 12);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

