package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rens054_impl extends GXWebReport
{
   public rens054_impl( com.genexus.internet.HttpContext context )
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
            A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
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
         /* Using cursor P074T2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P074T2_A407EmprNom[0] ;
            n407EmprNom = P074T2_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_char1 = AV13Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rens054_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit1 = GXt_char1 ;
         GXt_char1 = AV14Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rens054_impl.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit2 = GXt_char1 ;
         AV10Lit3 = GXutil.trim( AV13Lit1) + " - " + GXutil.trim( AV14Lit2) ;
         GXt_char1 = AV9Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV18Pgmname, (byte)(99), GXv_char2) ;
         rens054_impl.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit4 = GXt_char1 ;
         /* Using cursor P074T3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A6310Lb_TaAuxC});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6313lb_TaAuxL = P074T3_A6313lb_TaAuxL[0] ;
            A6311Lb_TaAuxD = P074T3_A6311Lb_TaAuxD[0] ;
            A6315Lb_TaAuxCf = P074T3_A6315Lb_TaAuxCf[0] ;
            A6314Lb_TaAuxCi = P074T3_A6314Lb_TaAuxCi[0] ;
            A6311Lb_TaAuxD = P074T3_A6311Lb_TaAuxD[0] ;
            AV12Lb_TaAuxD = GXutil.substring( A6311Lb_TaAuxD, 1, 30) ;
            h74T0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6310Lb_TaAuxC, "")), 17, Gx_line+0, 47, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6313lb_TaAuxL), "ZZZ9")), 351, Gx_line+0, 381, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6314Lb_TaAuxCi, "ZZZZ9.99999")), 397, Gx_line+0, 478, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6315Lb_TaAuxCf, "ZZZZ9.99999")), 486, Gx_line+0, 567, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lb_TaAuxD, "")), 52, Gx_line+1, 272, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            /* Using cursor P074T4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A490ForPrdUMe = P074T4_A490ForPrdUMe[0] ;
               A6317Lb_TauxOrd = P074T4_A6317Lb_TauxOrd[0] ;
               A488ForPrdDsc = P074T4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P074T4_n488ForPrdDsc[0] ;
               A6316Lb_TaAuxCt = P074T4_A6316Lb_TaAuxCt[0] ;
               A718PrdNom = P074T4_A718PrdNom[0] ;
               A719PrdNum = P074T4_A719PrdNum[0] ;
               A6378Lb_TauxLP = P074T4_A6378Lb_TauxLP[0] ;
               A718PrdNom = P074T4_A718PrdNom[0] ;
               A488ForPrdDsc = P074T4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P074T4_n488ForPrdDsc[0] ;
               h74T0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 581, Gx_line+1, 626, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 635, Gx_line+0, 826, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6316Lb_TaAuxCt, "ZZZZ9.99999")), 830, Gx_line+0, 911, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 917, Gx_line+0, 954, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6317Lb_TauxOrd), "ZZZ9")), 960, Gx_line+0, 990, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h74T0( false, 17) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h74T0( true, 0) ;
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

   public void h74T0( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 17, Gx_line+100, 59, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Linha", ""), 351, Gx_line+100, 384, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Corantes", ""), 465, Gx_line+77, 518, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 441, Gx_line+100, 477, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 538, Gx_line+100, 567, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 581, Gx_line+100, 628, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 635, Gx_line+100, 695, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 842, Gx_line+100, 911, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("#", 970, Gx_line+100, 979, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(351, Gx_line+117, 384, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(397, Gx_line+117, 477, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(486, Gx_line+117, 566, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(397, Gx_line+83, 462, Gx_line+83, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(521, Gx_line+84, 567, Gx_line+84, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(581, Gx_line+117, 625, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(635, Gx_line+117, 825, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(830, Gx_line+117, 910, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(917, Gx_line+117, 953, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(960, Gx_line+117, 989, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+61, 1006, Gx_line+61, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 6, Gx_line+4, 226, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 805, Gx_line+5, 864, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 883, Gx_line+5, 942, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("-", 871, Gx_line+5, 876, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 886, Gx_line+35, 931, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit4, "")), 6, Gx_line+30, 340, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit3, "")), 715, Gx_line+5, 793, Gx_line+21, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit5, "")), 811, Gx_line+35, 875, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Pgmname, "")), 715, Gx_line+36, 872, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(17, Gx_line+117, 59, Gx_line+117, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(52, Gx_line+117, 271, Gx_line+117, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+125) ;
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
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
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
      A6310Lb_TaAuxC = "" ;
      scmdbuf = "" ;
      P074T2_A396EmprCod = new String[] {""} ;
      P074T2_A407EmprNom = new String[] {""} ;
      P074T2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8EmprNom = "" ;
      AV13Lit1 = "" ;
      AV14Lit2 = "" ;
      AV10Lit3 = "" ;
      AV9Lit4 = "" ;
      GXt_char1 = "" ;
      AV18Pgmname = "" ;
      GXv_char2 = new String[1] ;
      P074T3_A396EmprCod = new String[] {""} ;
      P074T3_A6310Lb_TaAuxC = new String[] {""} ;
      P074T3_A6313lb_TaAuxL = new short[1] ;
      P074T3_A6311Lb_TaAuxD = new String[] {""} ;
      P074T3_A6315Lb_TaAuxCf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P074T3_A6314Lb_TaAuxCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A6311Lb_TaAuxD = "" ;
      A6315Lb_TaAuxCf = DecimalUtil.ZERO ;
      A6314Lb_TaAuxCi = DecimalUtil.ZERO ;
      AV12Lb_TaAuxD = "" ;
      P074T4_A490ForPrdUMe = new byte[1] ;
      P074T4_A396EmprCod = new String[] {""} ;
      P074T4_A6310Lb_TaAuxC = new String[] {""} ;
      P074T4_A6313lb_TaAuxL = new short[1] ;
      P074T4_A6317Lb_TauxOrd = new short[1] ;
      P074T4_A488ForPrdDsc = new String[] {""} ;
      P074T4_n488ForPrdDsc = new boolean[] {false} ;
      P074T4_A6316Lb_TaAuxCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P074T4_A718PrdNom = new String[] {""} ;
      P074T4_A719PrdNum = new String[] {""} ;
      P074T4_A6378Lb_TauxLP = new short[1] ;
      A488ForPrdDsc = "" ;
      A6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV11Lit5 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rens054__default(),
         new Object[] {
             new Object[] {
            P074T2_A396EmprCod, P074T2_A407EmprNom, P074T2_n407EmprNom
            }
            , new Object[] {
            P074T3_A396EmprCod, P074T3_A6310Lb_TaAuxC, P074T3_A6313lb_TaAuxL, P074T3_A6311Lb_TaAuxD, P074T3_A6315Lb_TaAuxCf, P074T3_A6314Lb_TaAuxCi
            }
            , new Object[] {
            P074T4_A490ForPrdUMe, P074T4_A396EmprCod, P074T4_A6310Lb_TaAuxC, P074T4_A6313lb_TaAuxL, P074T4_A6317Lb_TauxOrd, P074T4_A488ForPrdDsc, P074T4_n488ForPrdDsc, P074T4_A6316Lb_TaAuxCt, P074T4_A718PrdNom, P074T4_A719PrdNum,
            P074T4_A6378Lb_TauxLP
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV18Pgmname = "RENS054" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV18Pgmname = "RENS054" ;
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short A6313lb_TaAuxL ;
   private short A6317Lb_TauxOrd ;
   private short A6378Lb_TauxLP ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A6315Lb_TaAuxCf ;
   private java.math.BigDecimal A6314Lb_TaAuxCi ;
   private java.math.BigDecimal A6316Lb_TaAuxCt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8EmprNom ;
   private String AV13Lit1 ;
   private String AV14Lit2 ;
   private String AV10Lit3 ;
   private String AV9Lit4 ;
   private String GXt_char1 ;
   private String AV18Pgmname ;
   private String GXv_char2[] ;
   private String A6311Lb_TaAuxD ;
   private String AV12Lb_TaAuxD ;
   private String A488ForPrdDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private String AV11Lit5 ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P074T2_A396EmprCod ;
   private String[] P074T2_A407EmprNom ;
   private boolean[] P074T2_n407EmprNom ;
   private String[] P074T3_A396EmprCod ;
   private String[] P074T3_A6310Lb_TaAuxC ;
   private short[] P074T3_A6313lb_TaAuxL ;
   private String[] P074T3_A6311Lb_TaAuxD ;
   private java.math.BigDecimal[] P074T3_A6315Lb_TaAuxCf ;
   private java.math.BigDecimal[] P074T3_A6314Lb_TaAuxCi ;
   private byte[] P074T4_A490ForPrdUMe ;
   private String[] P074T4_A396EmprCod ;
   private String[] P074T4_A6310Lb_TaAuxC ;
   private short[] P074T4_A6313lb_TaAuxL ;
   private short[] P074T4_A6317Lb_TauxOrd ;
   private String[] P074T4_A488ForPrdDsc ;
   private boolean[] P074T4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P074T4_A6316Lb_TaAuxCt ;
   private String[] P074T4_A718PrdNom ;
   private String[] P074T4_A719PrdNum ;
   private short[] P074T4_A6378Lb_TauxLP ;
}

final  class rens054__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P074T2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P074T3", "SELECT T1.EmprCod, T1.Lb_TaAuxC, T1.lb_TaAuxL, T2.Lb_TaAuxD, T1.Lb_TaAuxCf, T1.Lb_TaAuxCi FROM (TXPENS008 T1 INNER JOIN TXPENS005 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_TaAuxC = T1.Lb_TaAuxC) WHERE T1.EmprCod = ? and T1.Lb_TaAuxC = ? ORDER BY T1.EmprCod, T1.Lb_TaAuxC, T1.lb_TaAuxL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P074T4", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_TaAuxC, T1.lb_TaAuxL, T1.Lb_TauxOrd, T3.ForPrdDsc, T1.Lb_TaAuxCt, T2.PrdNom, T1.PrdNum, T1.Lb_TauxLP FROM ((TXPENS007 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_TaAuxC = ? and T1.lb_TaAuxL = ? ORDER BY T1.EmprCod, T1.Lb_TaAuxC, T1.lb_TaAuxL, T1.Lb_TauxLP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((short[]) buf[10])[0] = rslt.getShort(10);
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
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

