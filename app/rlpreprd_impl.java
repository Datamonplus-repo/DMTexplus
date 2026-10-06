package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rlpreprd_impl extends GXWebReport
{
   public rlpreprd_impl( com.genexus.internet.HttpContext context )
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
            AV17UProv = (int)(GXutil.lval( httpContext.GetPar( "UProv"))) ;
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
         GXt_char1 = AV20Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN110_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit0 = GXt_char1 ;
         GXt_char1 = AV21Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit1 = GXt_char1 ;
         GXt_char1 = AV22Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit2 = GXt_char1 ;
         GXt_char1 = AV23Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit3 = GXt_char1 ;
         GXt_char1 = AV24Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN185_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit4 = GXt_char1 ;
         GXt_char1 = AV25Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit5 = GXt_char1 ;
         GXt_char1 = AV26Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2514_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit6 = GXt_char1 ;
         GXt_char1 = AV27Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN370_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit7 = GXt_char1 ;
         GXt_char1 = AV28Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2536_", ""), (byte)(99), GXv_char2) ;
         rlpreprd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit8 = GXt_char1 ;
         /* Using cursor P06422 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06422_A407EmprNom[0] ;
            n407EmprNom = P06422_n407EmprNom[0] ;
            AV19NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06423 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PProv), Integer.valueOf(AV17UProv)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6424 = false ;
            A856ValCod = P06423_A856ValCod[0] ;
            A857ValDsc = P06423_A857ValDsc[0] ;
            n857ValDsc = P06423_n857ValDsc[0] ;
            A724PrdPreAct = P06423_A724PrdPreAct[0] ;
            A718PrdNom = P06423_A718PrdNom[0] ;
            A719PrdNum = P06423_A719PrdNum[0] ;
            A795PrvNum = P06423_A795PrvNum[0] ;
            A794PrvNom = P06423_A794PrvNom[0] ;
            n794PrvNom = P06423_n794PrvNom[0] ;
            A794PrvNom = P06423_A794PrvNom[0] ;
            n794PrvNom = P06423_n794PrvNom[0] ;
            A857ValDsc = P06423_A857ValDsc[0] ;
            n857ValDsc = P06423_n857ValDsc[0] ;
            h6420( false, 33) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 22, Gx_line+0, 67, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 73, Gx_line+0, 293, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            h6420( false, 33) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("------  -------------------------- -------------- ----------------", 22, Gx_line+17, 504, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit4, "")), 22, Gx_line+0, 67, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit5, "")), 80, Gx_line+0, 161, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit7, "")), 335, Gx_line+0, 380, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit8, "")), 408, Gx_line+0, 504, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06423_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06423_A795PrvNum[0] == A795PrvNum ) )
            {
               brk6424 = false ;
               A856ValCod = P06423_A856ValCod[0] ;
               A857ValDsc = P06423_A857ValDsc[0] ;
               n857ValDsc = P06423_n857ValDsc[0] ;
               A724PrdPreAct = P06423_A724PrdPreAct[0] ;
               A718PrdNom = P06423_A718PrdNom[0] ;
               A719PrdNum = P06423_A719PrdNum[0] ;
               A857ValDsc = P06423_A857ValDsc[0] ;
               n857ValDsc = P06423_n857ValDsc[0] ;
               h6420( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 22, Gx_line+0, 67, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 80, Gx_line+0, 271, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 277, Gx_line+0, 380, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A857ValDsc, "")), 386, Gx_line+0, 504, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               brk6424 = true ;
               pr_default.readNext(1);
            }
            h6420( false, 33) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            if ( ! brk6424 )
            {
               brk6424 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6420( true, 0) ;
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

   public void h6420( boolean bFoot ,
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
            getPrinter().GxDrawText("-------------------------------------------------------------------------------", 0, Gx_line+0, 577, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 233, Gx_line+17, 241, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 365, Gx_line+17, 373, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 503, Gx_line+17, 511, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19NomEmp, "")), 15, Gx_line+17, 235, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit1, "")), 321, Gx_line+17, 358, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 379, Gx_line+17, 438, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit2, "")), 459, Gx_line+17, 489, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 518, Gx_line+17, 577, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 503, Gx_line+50, 511, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("-------------------------------------------------------------------------------", 0, Gx_line+67, 577, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit0, "")), 15, Gx_line+50, 147, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit3, "")), 459, Gx_line+50, 504, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 518, Gx_line+50, 563, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Pgmname, "")), 321, Gx_line+50, 541, Gx_line+67, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+100) ;
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
      AV20Lit0 = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV28Lit8 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06422_A396EmprCod = new String[] {""} ;
      P06422_A407EmprNom = new String[] {""} ;
      P06422_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV19NomEmp = "" ;
      P06423_A856ValCod = new byte[1] ;
      P06423_A396EmprCod = new String[] {""} ;
      P06423_A857ValDsc = new String[] {""} ;
      P06423_n857ValDsc = new boolean[] {false} ;
      P06423_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06423_A718PrdNom = new String[] {""} ;
      P06423_A719PrdNum = new String[] {""} ;
      P06423_A795PrvNum = new int[1] ;
      P06423_A794PrvNom = new String[] {""} ;
      P06423_n794PrvNom = new boolean[] {false} ;
      A857ValDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A794PrvNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV36Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlpreprd__default(),
         new Object[] {
             new Object[] {
            P06422_A396EmprCod, P06422_A407EmprNom, P06422_n407EmprNom
            }
            , new Object[] {
            P06423_A856ValCod, P06423_A396EmprCod, P06423_A857ValDsc, P06423_n857ValDsc, P06423_A724PrdPreAct, P06423_A718PrdNom, P06423_A719PrdNum, P06423_A795PrvNum, P06423_A794PrvNom, P06423_n794PrvNom
            }
         }
      );
      AV36Pgmname = "RLPREPRD" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV36Pgmname = "RLPREPRD" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV16PProv ;
   private int AV17UProv ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV20Lit0 ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV28Lit8 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV19NomEmp ;
   private String A857ValDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A794PrvNom ;
   private String Gx_time ;
   private String AV36Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6424 ;
   private boolean n857ValDsc ;
   private boolean n794PrvNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06422_A396EmprCod ;
   private String[] P06422_A407EmprNom ;
   private boolean[] P06422_n407EmprNom ;
   private byte[] P06423_A856ValCod ;
   private String[] P06423_A396EmprCod ;
   private String[] P06423_A857ValDsc ;
   private boolean[] P06423_n857ValDsc ;
   private java.math.BigDecimal[] P06423_A724PrdPreAct ;
   private String[] P06423_A718PrdNom ;
   private String[] P06423_A719PrdNum ;
   private int[] P06423_A795PrvNum ;
   private String[] P06423_A794PrvNom ;
   private boolean[] P06423_n794PrvNom ;
}

final  class rlpreprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06422", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06423", "SELECT T1.ValCod, T1.EmprCod, T3.ValDsc, T1.PrdPreAct, T1.PrdNom, T1.PrdNum, T1.PrvNum, T2.PrvNom FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod = T1.ValCod) WHERE (T1.EmprCod = ? and T1.PrvNum >= ?) AND (T1.PrvNum <= ?) ORDER BY T1.EmprCod, T1.PrvNum, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

