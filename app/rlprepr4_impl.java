package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rlprepr4_impl extends GXWebReport
{
   public rlprepr4_impl( com.genexus.internet.HttpContext context )
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
         GXt_char1 = AV23Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2257_", ""), (byte)(99), GXv_char2) ;
         rlprepr4_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit0 = GXt_char1 ;
         GXt_char1 = AV24Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlprepr4_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit1 = GXt_char1 ;
         GXt_char1 = AV25Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rlprepr4_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit2 = GXt_char1 ;
         GXt_char1 = AV26Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rlprepr4_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit3 = GXt_char1 ;
         GXt_char1 = AV27Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rlprepr4_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit4 = GXt_char1 ;
         GXt_char1 = AV28Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT667_", ""), (byte)(99), GXv_char2) ;
         rlprepr4_impl.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV28Lit5 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1061_", ""), (byte)(99), GXv_char4) ;
         rlprepr4_impl.this.GXt_char3 = GXv_char4[0] ;
         AV28Lit5 = GXt_char1 + GXt_char3 ;
         GXt_char3 = AV29Lit6 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rlprepr4_impl.this.GXt_char3 = GXv_char4[0] ;
         AV29Lit6 = GXt_char3 ;
         GXt_char3 = AV30Lit7 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char4) ;
         rlprepr4_impl.this.GXt_char3 = GXv_char4[0] ;
         AV30Lit7 = GXt_char3 ;
         GXt_char3 = AV31Lit8 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char4) ;
         rlprepr4_impl.this.GXt_char3 = GXv_char4[0] ;
         AV31Lit8 = GXt_char3 ;
         GXt_char3 = AV32Lit9 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char4) ;
         rlprepr4_impl.this.GXt_char3 = GXv_char4[0] ;
         AV32Lit9 = GXt_char3 ;
         /* Using cursor P06YV2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06YV2_A407EmprNom[0] ;
            n407EmprNom = P06YV2_n407EmprNom[0] ;
            AV21NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06YV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PProv), Integer.valueOf(AV17UProv1)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A795PrvNum = P06YV3_A795PrvNum[0] ;
            A794PrvNom = P06YV3_A794PrvNom[0] ;
            n794PrvNom = P06YV3_n794PrvNom[0] ;
            h6YV0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 180, Gx_line+5, 400, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit8, "")), 26, Gx_line+5, 92, Gx_line+21, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 93, Gx_line+5, 97, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 124, Gx_line+5, 169, Gx_line+22, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
            /* Using cursor P06YV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, AV18PProduc, Integer.valueOf(A795PrvNum), AV19UProduc1});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A719PrdNum = P06YV4_A719PrdNum[0] ;
               A724PrdPreAct = P06YV4_A724PrdPreAct[0] ;
               A709PrdFecPre = P06YV4_A709PrdFecPre[0] ;
               A721PrdNumUco = P06YV4_A721PrdNumUco[0] ;
               A718PrdNom = P06YV4_A718PrdNom[0] ;
               h6YV0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 19, Gx_line+0, 64, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 80, Gx_line+0, 271, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A721PrdNumUco, "ZZZ9.99")), 310, Gx_line+0, 362, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A709PrdFecPre, "99/99/99"), 396, Gx_line+0, 455, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 493, Gx_line+0, 596, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6YV0( false, 16) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+16) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6YV0( true, 0) ;
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

   public void h6YV0( boolean bFoot ,
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
            getPrinter().GxDrawText(":", 428, Gx_line+14, 432, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 589, Gx_line+14, 593, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21NomEmp, "")), 15, Gx_line+16, 234, Gx_line+32, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit1, "")), 384, Gx_line+14, 420, Gx_line+30, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 443, Gx_line+14, 502, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit2, "")), 539, Gx_line+14, 568, Gx_line+30, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 620, Gx_line+14, 679, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 589, Gx_line+40, 593, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit0, "")), 15, Gx_line+42, 370, Gx_line+58, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit3, "")), 539, Gx_line+40, 583, Gx_line+56, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 634, Gx_line+40, 679, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit9, "")), 19, Gx_line+84, 133, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit5, "")), 297, Gx_line+84, 362, Gx_line+100, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit6, "")), 396, Gx_line+84, 454, Gx_line+100, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit7, "")), 515, Gx_line+84, 595, Gx_line+100, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+6, 695, Gx_line+6, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+65, 695, Gx_line+65, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(19, Gx_line+103, 270, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+103, 362, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(396, Gx_line+103, 454, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(493, Gx_line+103, 595, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Pgmname, "")), 384, Gx_line+40, 604, Gx_line+57, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+107) ;
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
      AV15ImpCod = "" ;
      AV18PProduc = "" ;
      AV19UProduc1 = "" ;
      AV23Lit0 = "" ;
      AV24Lit1 = "" ;
      AV25Lit2 = "" ;
      AV26Lit3 = "" ;
      AV27Lit4 = "" ;
      AV28Lit5 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV29Lit6 = "" ;
      AV30Lit7 = "" ;
      AV31Lit8 = "" ;
      AV32Lit9 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P06YV2_A396EmprCod = new String[] {""} ;
      P06YV2_A407EmprNom = new String[] {""} ;
      P06YV2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV21NomEmp = "" ;
      P06YV3_A396EmprCod = new String[] {""} ;
      P06YV3_A795PrvNum = new int[1] ;
      P06YV3_A794PrvNom = new String[] {""} ;
      P06YV3_n794PrvNom = new boolean[] {false} ;
      A794PrvNom = "" ;
      P06YV4_A396EmprCod = new String[] {""} ;
      P06YV4_A795PrvNum = new int[1] ;
      P06YV4_A719PrdNum = new String[] {""} ;
      P06YV4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06YV4_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P06YV4_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06YV4_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV40Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlprepr4__default(),
         new Object[] {
             new Object[] {
            P06YV2_A396EmprCod, P06YV2_A407EmprNom, P06YV2_n407EmprNom
            }
            , new Object[] {
            P06YV3_A396EmprCod, P06YV3_A795PrvNum, P06YV3_A794PrvNom, P06YV3_n794PrvNom
            }
            , new Object[] {
            P06YV4_A396EmprCod, P06YV4_A795PrvNum, P06YV4_A719PrdNum, P06YV4_A724PrdPreAct, P06YV4_A709PrdFecPre, P06YV4_A721PrdNumUco, P06YV4_A718PrdNom
            }
         }
      );
      AV40Pgmname = "RLPREPR4" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV40Pgmname = "RLPREPR4" ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV29Lit6 ;
   private String AV30Lit7 ;
   private String AV31Lit8 ;
   private String AV32Lit9 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV21NomEmp ;
   private String A794PrvNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String Gx_time ;
   private String AV40Pgmname ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06YV2_A396EmprCod ;
   private String[] P06YV2_A407EmprNom ;
   private boolean[] P06YV2_n407EmprNom ;
   private String[] P06YV3_A396EmprCod ;
   private int[] P06YV3_A795PrvNum ;
   private String[] P06YV3_A794PrvNom ;
   private boolean[] P06YV3_n794PrvNom ;
   private String[] P06YV4_A396EmprCod ;
   private int[] P06YV4_A795PrvNum ;
   private String[] P06YV4_A719PrdNum ;
   private java.math.BigDecimal[] P06YV4_A724PrdPreAct ;
   private java.util.Date[] P06YV4_A709PrdFecPre ;
   private java.math.BigDecimal[] P06YV4_A721PrdNumUco ;
   private String[] P06YV4_A718PrdNom ;
}

final  class rlprepr4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06YV2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06YV3", "SELECT EmprCod, PrvNum, PrvNom FROM TXPPRVGEN WHERE (EmprCod = ? and PrvNum >= ?) AND (PrvNum <= ?) ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06YV4", "SELECT EmprCod, PrvNum, PrdNum, PrdPreAct, PrdFecPre, PrdNumUco, PrdNom FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (PrvNum = ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

