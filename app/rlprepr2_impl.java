package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rlprepr2_impl extends GXWebReport
{
   public rlprepr2_impl( com.genexus.internet.HttpContext context )
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
            AV16PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV17UProv1 = (int)(GXutil.lval( httpContext.GetPar( "UProv1"))) ;
            AV18PProduc = httpContext.GetPar( "PProduc") ;
            AV19UProduc1 = httpContext.GetPar( "UProduc1") ;
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
         GXt_char1 = AV23Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2255_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit0 = GXt_char1 ;
         GXt_char1 = AV24Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit1 = GXt_char1 ;
         GXt_char1 = AV25Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit2 = GXt_char1 ;
         GXt_char1 = AV26Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit3 = GXt_char1 ;
         GXt_char1 = AV27Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit4 = GXt_char1 ;
         GXt_char1 = AV28Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit5 = GXt_char1 ;
         GXt_char1 = AV29Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit6 = GXt_char1 ;
         GXt_char1 = AV30Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2320_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit7 = GXt_char1 ;
         GXt_char1 = AV31Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2402_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV31Lit8 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char4) ;
         rlprepr2_impl.this.GXt_char3 = GXv_char4[0] ;
         AV31Lit8 = GXt_char1 + "." + GXt_char3 ;
         GXt_char3 = AV32Lit9 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT667_", ""), (byte)(99), GXv_char4) ;
         rlprepr2_impl.this.GXt_char3 = GXv_char4[0] ;
         GXt_char1 = AV32Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1061_", ""), (byte)(99), GXv_char2) ;
         rlprepr2_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit9 = GXt_char3 + GXt_char1 ;
         GXt_char3 = AV33Lit10 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rlprepr2_impl.this.GXt_char3 = GXv_char4[0] ;
         AV33Lit10 = GXt_char3 ;
         GXt_char3 = AV34Lit11 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char4) ;
         rlprepr2_impl.this.GXt_char3 = GXv_char4[0] ;
         AV34Lit11 = GXt_char3 ;
         /* Using cursor P06YT2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06YT2_A407EmprNom[0] ;
            n407EmprNom = P06YT2_n407EmprNom[0] ;
            AV21NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06YT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV18PProduc, Integer.valueOf(AV16PProv), Integer.valueOf(AV17UProv1), AV19UProduc1});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P06YT3_A719PrdNum[0] ;
            A795PrvNum = P06YT3_A795PrvNum[0] ;
            A724PrdPreAct = P06YT3_A724PrdPreAct[0] ;
            A709PrdFecPre = P06YT3_A709PrdFecPre[0] ;
            A721PrdNumUco = P06YT3_A721PrdNumUco[0] ;
            A728PrdRefPrv = P06YT3_A728PrdRefPrv[0] ;
            A794PrvNom = P06YT3_A794PrvNom[0] ;
            n794PrvNom = P06YT3_n794PrvNom[0] ;
            A718PrdNom = P06YT3_A718PrdNom[0] ;
            A794PrvNom = P06YT3_A794PrvNom[0] ;
            n794PrvNom = P06YT3_n794PrvNom[0] ;
            h6YT0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 19, Gx_line+0, 64, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 77, Gx_line+0, 268, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 285, Gx_line+0, 330, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 336, Gx_line+0, 556, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), 571, Gx_line+0, 791, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A721PrdNumUco, "ZZZ9.99")), 695, Gx_line+0, 747, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A709PrdFecPre, "99/99/99"), 760, Gx_line+0, 819, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 825, Gx_line+0, 928, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6YT0( true, 0) ;
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

   public void h6YT0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 613, Gx_line+17, 617, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 773, Gx_line+17, 777, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21NomEmp, "")), 15, Gx_line+17, 234, Gx_line+33, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit1, "")), 569, Gx_line+17, 605, Gx_line+33, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 627, Gx_line+17, 686, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit2, "")), 723, Gx_line+17, 752, Gx_line+33, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 808, Gx_line+17, 867, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 773, Gx_line+43, 777, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit0, "")), 15, Gx_line+43, 314, Gx_line+59, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit3, "")), 723, Gx_line+43, 767, Gx_line+59, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 823, Gx_line+43, 868, Gx_line+60, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit4, "")), 19, Gx_line+85, 89, Gx_line+101, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit6, "")), 285, Gx_line+85, 367, Gx_line+101, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit8, "")), 571, Gx_line+85, 673, Gx_line+101, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit9, "")), 681, Gx_line+85, 746, Gx_line+101, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit10, "")), 760, Gx_line+85, 818, Gx_line+101, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit11, "")), 851, Gx_line+85, 927, Gx_line+101, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+7, 939, Gx_line+7, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+66, 939, Gx_line+66, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(19, Gx_line+105, 270, Gx_line+105, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(285, Gx_line+105, 553, Gx_line+105, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(571, Gx_line+105, 673, Gx_line+105, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(681, Gx_line+105, 746, Gx_line+105, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(760, Gx_line+105, 818, Gx_line+105, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(825, Gx_line+105, 927, Gx_line+105, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Pgmname, "")), 569, Gx_line+43, 789, Gx_line+60, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+108) ;
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
      AV15ImpCod = "" ;
      AV18PProduc = "" ;
      AV19UProduc1 = "" ;
      AV23Lit0 = "" ;
      AV24Lit1 = "" ;
      AV25Lit2 = "" ;
      AV26Lit3 = "" ;
      AV27Lit4 = "" ;
      AV28Lit5 = "" ;
      AV29Lit6 = "" ;
      AV30Lit7 = "" ;
      AV31Lit8 = "" ;
      AV32Lit9 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV33Lit10 = "" ;
      AV34Lit11 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P06YT2_A396EmprCod = new String[] {""} ;
      P06YT2_A407EmprNom = new String[] {""} ;
      P06YT2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV21NomEmp = "" ;
      P06YT3_A396EmprCod = new String[] {""} ;
      P06YT3_A719PrdNum = new String[] {""} ;
      P06YT3_A795PrvNum = new int[1] ;
      P06YT3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06YT3_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P06YT3_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06YT3_A728PrdRefPrv = new String[] {""} ;
      P06YT3_A794PrvNom = new String[] {""} ;
      P06YT3_n794PrvNom = new boolean[] {false} ;
      P06YT3_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A728PrdRefPrv = "" ;
      A794PrvNom = "" ;
      A718PrdNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV42Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlprepr2__default(),
         new Object[] {
             new Object[] {
            P06YT2_A396EmprCod, P06YT2_A407EmprNom, P06YT2_n407EmprNom
            }
            , new Object[] {
            P06YT3_A396EmprCod, P06YT3_A719PrdNum, P06YT3_A795PrvNum, P06YT3_A724PrdPreAct, P06YT3_A709PrdFecPre, P06YT3_A721PrdNumUco, P06YT3_A728PrdRefPrv, P06YT3_A794PrvNom, P06YT3_n794PrvNom, P06YT3_A718PrdNom
            }
         }
      );
      AV42Pgmname = "RLPREPR2" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV42Pgmname = "RLPREPR2" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV16PProv ;
   private int AV17UProv1 ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A721PrdNumUco ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV18PProduc ;
   private String AV19UProduc1 ;
   private String AV23Lit0 ;
   private String AV24Lit1 ;
   private String AV25Lit2 ;
   private String AV26Lit3 ;
   private String AV27Lit4 ;
   private String AV28Lit5 ;
   private String AV29Lit6 ;
   private String AV30Lit7 ;
   private String AV31Lit8 ;
   private String AV32Lit9 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV33Lit10 ;
   private String AV34Lit11 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV21NomEmp ;
   private String A719PrdNum ;
   private String A728PrdRefPrv ;
   private String A794PrvNom ;
   private String A718PrdNom ;
   private String Gx_time ;
   private String AV42Pgmname ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06YT2_A396EmprCod ;
   private String[] P06YT2_A407EmprNom ;
   private boolean[] P06YT2_n407EmprNom ;
   private String[] P06YT3_A396EmprCod ;
   private String[] P06YT3_A719PrdNum ;
   private int[] P06YT3_A795PrvNum ;
   private java.math.BigDecimal[] P06YT3_A724PrdPreAct ;
   private java.util.Date[] P06YT3_A709PrdFecPre ;
   private java.math.BigDecimal[] P06YT3_A721PrdNumUco ;
   private String[] P06YT3_A728PrdRefPrv ;
   private String[] P06YT3_A794PrvNom ;
   private boolean[] P06YT3_n794PrvNom ;
   private String[] P06YT3_A718PrdNom ;
}

final  class rlprepr2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06YT2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06YT3", "SELECT T1.EmprCod, T1.PrdNum, T1.PrvNum, T1.PrdPreAct, T1.PrdFecPre, T1.PrdNumUco, T1.PrdRefPrv, T2.PrvNom, T1.PrdNom FROM (TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE (T1.EmprCod = ? and T1.PrdNum >= ?) AND (T1.PrvNum >= ? and T1.PrvNum <= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

