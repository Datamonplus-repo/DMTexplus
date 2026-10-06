package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rdevals_impl extends GXWebReport
{
   public rdevals_impl( com.genexus.internet.HttpContext context )
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
            AV10NumALb = httpContext.GetPar( "NumALb") ;
            AV24TextoCopia = httpContext.GetPar( "TextoCopia") ;
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
         Gx_out = "SCR" ;
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
         GXv_char1[0] = AV12ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVALM", ""), GXv_char1) ;
         rdevals_impl.this.AV12ContDsc = GXv_char1[0] ;
         /* Using cursor P06RA2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06RA2_A407EmprNom[0] ;
            n407EmprNom = P06RA2_n407EmprNom[0] ;
            A403EmprCpo = P06RA2_A403EmprCpo[0] ;
            n403EmprCpo = P06RA2_n403EmprCpo[0] ;
            A404EmprDir = P06RA2_A404EmprDir[0] ;
            n404EmprDir = P06RA2_n404EmprDir[0] ;
            A405EmprFax = P06RA2_A405EmprFax[0] ;
            n405EmprFax = P06RA2_n405EmprFax[0] ;
            A408EmprPob = P06RA2_A408EmprPob[0] ;
            n408EmprPob = P06RA2_n408EmprPob[0] ;
            A409EmprTel = P06RA2_A409EmprTel[0] ;
            n409EmprTel = P06RA2_n409EmprTel[0] ;
            AV18EmprNom = A407EmprNom ;
            AV20EmprCpo = A403EmprCpo ;
            AV19EmprDir = A404EmprDir ;
            AV23EmprFax = A405EmprFax ;
            AV21EmprPob = A408EmprPob ;
            AV22EmprTel = A409EmprTel ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06RA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV10NumALb});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A742PrdUniCom = P06RA3_A742PrdUniCom[0] ;
            A3345TipMovCc = P06RA3_A3345TipMovCc[0] ;
            A3354CCStkAlb = P06RA3_A3354CCStkAlb[0] ;
            A3357CCStkDsc = P06RA3_A3357CCStkDsc[0] ;
            A3348CCStkFec = P06RA3_A3348CCStkFec[0] ;
            A795PrvNum = P06RA3_A795PrvNum[0] ;
            A737PrdUcpDsc = P06RA3_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = P06RA3_n737PrdUcpDsc[0] ;
            A3349CCStkPre = P06RA3_A3349CCStkPre[0] ;
            A718PrdNom = P06RA3_A718PrdNom[0] ;
            A3344CCStkCanS = P06RA3_A3344CCStkCanS[0] ;
            A719PrdNum = P06RA3_A719PrdNum[0] ;
            A3342CCStkLin = P06RA3_A3342CCStkLin[0] ;
            A742PrdUniCom = P06RA3_A742PrdUniCom[0] ;
            A795PrvNum = P06RA3_A795PrvNum[0] ;
            A718PrdNom = P06RA3_A718PrdNom[0] ;
            A737PrdUcpDsc = P06RA3_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = P06RA3_n737PrdUcpDsc[0] ;
            if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", "")) == 0 )
            {
               AV25CCStkDsc = A3357CCStkDsc ;
               AV11FechaAlb = GXutil.str( GXutil.day( A3348CCStkFec), 2, 0) + httpContext.getMessage( " de ", "") + localUtil.cmonth( A3348CCStkFec, httpContext.getMessage( "spa", "")) + httpContext.getMessage( " de ", "") + GXutil.str( GXutil.year( A3348CCStkFec), 4, 0) ;
               AV13PrvNum = A795PrvNum ;
               AV26UndC = GXutil.substring( A737PrdUcpDsc, 1, 5) ;
               /* Execute user subroutine: 'PRVGEN' */
               S111 ();
               if ( returnInSub )
               {
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
               h6RA0( false, 21) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999")), 605, Gx_line+2, 706, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 203, Gx_line+2, 421, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 26, Gx_line+2, 77, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(165, Gx_line+0, 165, Gx_line+21, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(452, Gx_line+0, 452, Gx_line+21, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(747, Gx_line+0, 747, Gx_line+21, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(4, Gx_line+0, 4, Gx_line+21, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3349CCStkPre, "ZZZZZZZ9.999")), 467, Gx_line+2, 585, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(598, Gx_line+0, 598, Gx_line+21, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26UndC, "")), 707, Gx_line+3, 744, Gx_line+19, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         h6RA0( false, 38) ;
         getPrinter().GxDrawLine(4, Gx_line+0, 748, Gx_line+0, 2, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Observacion: ", ""), 27, Gx_line+8, 119, Gx_line+25, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25CCStkDsc, "")), 131, Gx_line+7, 351, Gx_line+24, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+38) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6RA0( true, 0) ;
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
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      /* Using cursor P06RA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV13PrvNum)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A795PrvNum = P06RA4_A795PrvNum[0] ;
         A794PrvNom = P06RA4_A794PrvNom[0] ;
         n794PrvNom = P06RA4_n794PrvNom[0] ;
         A786PrvDir = P06RA4_A786PrvDir[0] ;
         n786PrvDir = P06RA4_n786PrvDir[0] ;
         A782PrvCpo = P06RA4_A782PrvCpo[0] ;
         n782PrvCpo = P06RA4_n782PrvCpo[0] ;
         A799PrvPob = P06RA4_A799PrvPob[0] ;
         n799PrvPob = P06RA4_n799PrvPob[0] ;
         AV14PrvNom = A794PrvNom ;
         AV15PrvDir = A786PrvDir ;
         AV16PrvCpo = A782PrvCpo ;
         AV17PrvPob = A799PrvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h6RA0( boolean bFoot ,
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
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 549, Gx_line+102, 569, Gx_line+122, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10NumALb, "")), 586, Gx_line+102, 670, Gx_line+123, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+152, 751, Gx_line+152, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13PrvNum), "ZZZZZ9")), 434, Gx_line+177, 485, Gx_line+195, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14PrvNom, "")), 434, Gx_line+197, 685, Gx_line+215, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15PrvDir, "")), 434, Gx_line+218, 685, Gx_line+236, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16PrvCpo, "")), 434, Gx_line+239, 485, Gx_line+257, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17PrvPob, "")), 489, Gx_line+239, 740, Gx_line+257, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PRODUCTO", ""), 25, Gx_line+334, 118, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DESCRIPCION", ""), 202, Gx_line+334, 312, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CANTIDAD", ""), 630, Gx_line+334, 710, Gx_line+353, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(4, Gx_line+355, 748, Gx_line+355, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11FechaAlb, "")), 25, Gx_line+300, 214, Gx_line+318, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12ContDsc, "")), 643, Gx_line+9, 727, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(16, Gx_line+13, 396, Gx_line+130, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18EmprNom, "")), 26, Gx_line+30, 246, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19EmprDir, "")), 26, Gx_line+51, 282, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20EmprCpo, "")), 26, Gx_line+71, 122, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21EmprPob, "")), 89, Gx_line+70, 345, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23EmprFax, "")), 268, Gx_line+96, 378, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22EmprTel, "")), 68, Gx_line+96, 178, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tel.", ""), 26, Gx_line+96, 54, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fax.", ""), 224, Gx_line+96, 255, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(484, Gx_line+36, 740, Gx_line+90, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DEVOLUCION PRODUCTO", ""), 505, Gx_line+53, 720, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PRECIO", ""), 495, Gx_line+334, 556, Gx_line+353, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+356) ;
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV10NumALb = "" ;
      AV24TextoCopia = "" ;
      AV12ContDsc = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P06RA2_A396EmprCod = new String[] {""} ;
      P06RA2_A407EmprNom = new String[] {""} ;
      P06RA2_n407EmprNom = new boolean[] {false} ;
      P06RA2_A403EmprCpo = new String[] {""} ;
      P06RA2_n403EmprCpo = new boolean[] {false} ;
      P06RA2_A404EmprDir = new String[] {""} ;
      P06RA2_n404EmprDir = new boolean[] {false} ;
      P06RA2_A405EmprFax = new String[] {""} ;
      P06RA2_n405EmprFax = new boolean[] {false} ;
      P06RA2_A408EmprPob = new String[] {""} ;
      P06RA2_n408EmprPob = new boolean[] {false} ;
      P06RA2_A409EmprTel = new String[] {""} ;
      P06RA2_n409EmprTel = new boolean[] {false} ;
      A407EmprNom = "" ;
      A403EmprCpo = "" ;
      A404EmprDir = "" ;
      A405EmprFax = "" ;
      A408EmprPob = "" ;
      A409EmprTel = "" ;
      AV18EmprNom = "" ;
      AV20EmprCpo = "" ;
      AV19EmprDir = "" ;
      AV23EmprFax = "" ;
      AV21EmprPob = "" ;
      AV22EmprTel = "" ;
      P06RA3_A742PrdUniCom = new byte[1] ;
      P06RA3_A396EmprCod = new String[] {""} ;
      P06RA3_A3345TipMovCc = new String[] {""} ;
      P06RA3_A3354CCStkAlb = new String[] {""} ;
      P06RA3_A3357CCStkDsc = new String[] {""} ;
      P06RA3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06RA3_A795PrvNum = new int[1] ;
      P06RA3_A737PrdUcpDsc = new String[] {""} ;
      P06RA3_n737PrdUcpDsc = new boolean[] {false} ;
      P06RA3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RA3_A718PrdNom = new String[] {""} ;
      P06RA3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RA3_A719PrdNum = new String[] {""} ;
      P06RA3_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3354CCStkAlb = "" ;
      A3357CCStkDsc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A737PrdUcpDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV25CCStkDsc = "" ;
      AV11FechaAlb = "" ;
      AV26UndC = "" ;
      P06RA4_A396EmprCod = new String[] {""} ;
      P06RA4_A795PrvNum = new int[1] ;
      P06RA4_A794PrvNom = new String[] {""} ;
      P06RA4_n794PrvNom = new boolean[] {false} ;
      P06RA4_A786PrvDir = new String[] {""} ;
      P06RA4_n786PrvDir = new boolean[] {false} ;
      P06RA4_A782PrvCpo = new String[] {""} ;
      P06RA4_n782PrvCpo = new boolean[] {false} ;
      P06RA4_A799PrvPob = new String[] {""} ;
      P06RA4_n799PrvPob = new boolean[] {false} ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      AV14PrvNom = "" ;
      AV15PrvDir = "" ;
      AV16PrvCpo = "" ;
      AV17PrvPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevals__default(),
         new Object[] {
             new Object[] {
            P06RA2_A396EmprCod, P06RA2_A407EmprNom, P06RA2_n407EmprNom, P06RA2_A403EmprCpo, P06RA2_n403EmprCpo, P06RA2_A404EmprDir, P06RA2_n404EmprDir, P06RA2_A405EmprFax, P06RA2_n405EmprFax, P06RA2_A408EmprPob,
            P06RA2_n408EmprPob, P06RA2_A409EmprTel, P06RA2_n409EmprTel
            }
            , new Object[] {
            P06RA3_A742PrdUniCom, P06RA3_A396EmprCod, P06RA3_A3345TipMovCc, P06RA3_A3354CCStkAlb, P06RA3_A3357CCStkDsc, P06RA3_A3348CCStkFec, P06RA3_A795PrvNum, P06RA3_A737PrdUcpDsc, P06RA3_n737PrdUcpDsc, P06RA3_A3349CCStkPre,
            P06RA3_A718PrdNom, P06RA3_A3344CCStkCanS, P06RA3_A719PrdNum, P06RA3_A3342CCStkLin
            }
            , new Object[] {
            P06RA4_A396EmprCod, P06RA4_A795PrvNum, P06RA4_A794PrvNom, P06RA4_n794PrvNom, P06RA4_A786PrvDir, P06RA4_n786PrvDir, P06RA4_A782PrvCpo, P06RA4_n782PrvCpo, P06RA4_A799PrvPob, P06RA4_n799PrvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A742PrdUniCom ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int AV13PrvNum ;
   private int Gx_OldLine ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV10NumALb ;
   private String AV24TextoCopia ;
   private String AV12ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A403EmprCpo ;
   private String A404EmprDir ;
   private String A405EmprFax ;
   private String A408EmprPob ;
   private String A409EmprTel ;
   private String AV18EmprNom ;
   private String AV20EmprCpo ;
   private String AV19EmprDir ;
   private String AV23EmprFax ;
   private String AV21EmprPob ;
   private String AV22EmprTel ;
   private String A3345TipMovCc ;
   private String A3354CCStkAlb ;
   private String A3357CCStkDsc ;
   private String A737PrdUcpDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV25CCStkDsc ;
   private String AV11FechaAlb ;
   private String AV26UndC ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String AV14PrvNom ;
   private String AV15PrvDir ;
   private String AV16PrvCpo ;
   private String AV17PrvPob ;
   private java.util.Date A3348CCStkFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n405EmprFax ;
   private boolean n408EmprPob ;
   private boolean n409EmprTel ;
   private boolean n737PrdUcpDsc ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private IDataStoreProvider pr_default ;
   private String[] P06RA2_A396EmprCod ;
   private String[] P06RA2_A407EmprNom ;
   private boolean[] P06RA2_n407EmprNom ;
   private String[] P06RA2_A403EmprCpo ;
   private boolean[] P06RA2_n403EmprCpo ;
   private String[] P06RA2_A404EmprDir ;
   private boolean[] P06RA2_n404EmprDir ;
   private String[] P06RA2_A405EmprFax ;
   private boolean[] P06RA2_n405EmprFax ;
   private String[] P06RA2_A408EmprPob ;
   private boolean[] P06RA2_n408EmprPob ;
   private String[] P06RA2_A409EmprTel ;
   private boolean[] P06RA2_n409EmprTel ;
   private byte[] P06RA3_A742PrdUniCom ;
   private String[] P06RA3_A396EmprCod ;
   private String[] P06RA3_A3345TipMovCc ;
   private String[] P06RA3_A3354CCStkAlb ;
   private String[] P06RA3_A3357CCStkDsc ;
   private java.util.Date[] P06RA3_A3348CCStkFec ;
   private int[] P06RA3_A795PrvNum ;
   private String[] P06RA3_A737PrdUcpDsc ;
   private boolean[] P06RA3_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P06RA3_A3349CCStkPre ;
   private String[] P06RA3_A718PrdNom ;
   private java.math.BigDecimal[] P06RA3_A3344CCStkCanS ;
   private String[] P06RA3_A719PrdNum ;
   private long[] P06RA3_A3342CCStkLin ;
   private String[] P06RA4_A396EmprCod ;
   private int[] P06RA4_A795PrvNum ;
   private String[] P06RA4_A794PrvNom ;
   private boolean[] P06RA4_n794PrvNom ;
   private String[] P06RA4_A786PrvDir ;
   private boolean[] P06RA4_n786PrvDir ;
   private String[] P06RA4_A782PrvCpo ;
   private boolean[] P06RA4_n782PrvCpo ;
   private String[] P06RA4_A799PrvPob ;
   private boolean[] P06RA4_n799PrvPob ;
}

final  class rdevals__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06RA2", "SELECT EmprCod, EmprNom, EmprCpo, EmprDir, EmprFax, EmprPob, EmprTel FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06RA3", "SELECT T2.PrdUniCom AS PrdUniCom, T1.EmprCod, T1.TipMovCc, T1.CCStkAlb, T1.CCStkDsc, T1.CCStkFec, T2.PrvNum, T3.UniDsc AS PrdUcpDsc, T1.CCStkPre, T2.PrdNom, T1.CCStkCanS, T1.PrdNum, T1.CCStkLin FROM ((TXPCCSTKS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T2.PrdUniCom) WHERE (T1.EmprCod = ?) AND (T1.CCStkAlb = ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06RA4", "SELECT EmprCod, PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 7);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 35);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((long[]) buf[13])[0] = rslt.getLong(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

