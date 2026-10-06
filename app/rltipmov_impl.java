package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rltipmov_impl extends GXWebReport
{
   public rltipmov_impl( com.genexus.internet.HttpContext context )
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
         GXt_char1 = AV24Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rltipmov_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit1 = GXt_char1 ;
         GXt_char1 = AV22Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rltipmov_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit2 = GXt_char1 ;
         GXt_char1 = AV23Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rltipmov_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit3 = GXt_char1 ;
         GXt_char1 = AV25Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
         rltipmov_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit4 = GXt_char1 ;
         GXt_char1 = AV26Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rltipmov_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit5 = GXt_char1 ;
         GXt_char1 = AV30Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "TTIPMOV", ""), (byte)(99), GXv_char2) ;
         rltipmov_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit0 = GXutil.trim( GXt_char1) ;
         /* Using cursor P07A12 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07A12_A407EmprNom[0] ;
            n407EmprNom = P07A12_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07A13 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3346TipMovCn = P07A13_A3346TipMovCn[0] ;
            n3346TipMovCn = P07A13_n3346TipMovCn[0] ;
            A3345TipMovCc = P07A13_A3345TipMovCc[0] ;
            h7A10( false, 19) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3345TipMovCc, "")), 32, Gx_line+2, 48, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3346TipMovCn, "")), 172, Gx_line+2, 392, Gx_line+19, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+19) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7A10( true, 0) ;
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

   public void h7A10( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 6, Gx_line+18, 226, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 440, Gx_line+19, 491, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit2, "")), 519, Gx_line+19, 547, Gx_line+35, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 582, Gx_line+19, 675, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 601, Gx_line+42, 646, Gx_line+59, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit3, "")), 519, Gx_line+42, 560, Gx_line+58, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+68, 680, Gx_line+68, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+102, 680, Gx_line+102, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Pgmname, "")), 369, Gx_line+43, 526, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit1, "")), 370, Gx_line+19, 405, Gx_line+35, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 411, Gx_line+19, 415, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 565, Gx_line+42, 569, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 566, Gx_line+19, 570, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit4, "")), 8, Gx_line+84, 72, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit5, "")), 172, Gx_line+84, 236, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit0, "")), 5, Gx_line+43, 243, Gx_line+59, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+8, 680, Gx_line+8, 2, 0, 0, 0, 0) ;
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
      AV24Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV25Lit4 = "" ;
      AV26Lit5 = "" ;
      AV30Lit0 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P07A12_A396EmprCod = new String[] {""} ;
      P07A12_A407EmprNom = new String[] {""} ;
      P07A12_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV8EmprNom = "" ;
      P07A13_A396EmprCod = new String[] {""} ;
      P07A13_A3346TipMovCn = new String[] {""} ;
      P07A13_n3346TipMovCn = new boolean[] {false} ;
      P07A13_A3345TipMovCc = new String[] {""} ;
      A3346TipMovCn = "" ;
      A3345TipMovCc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV37Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rltipmov__default(),
         new Object[] {
             new Object[] {
            P07A12_A396EmprCod, P07A12_A407EmprNom, P07A12_n407EmprNom
            }
            , new Object[] {
            P07A13_A396EmprCod, P07A13_A3346TipMovCn, P07A13_n3346TipMovCn, P07A13_A3345TipMovCc
            }
         }
      );
      AV37Pgmname = "RLTIPMOV" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV37Pgmname = "RLTIPMOV" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV24Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV25Lit4 ;
   private String AV26Lit5 ;
   private String AV30Lit0 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV8EmprNom ;
   private String A3346TipMovCn ;
   private String A3345TipMovCc ;
   private String Gx_time ;
   private String AV37Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3346TipMovCn ;
   private IDataStoreProvider pr_default ;
   private String[] P07A12_A396EmprCod ;
   private String[] P07A12_A407EmprNom ;
   private boolean[] P07A12_n407EmprNom ;
   private String[] P07A13_A396EmprCod ;
   private String[] P07A13_A3346TipMovCn ;
   private boolean[] P07A13_n3346TipMovCn ;
   private String[] P07A13_A3345TipMovCc ;
}

final  class rltipmov__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07A12", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07A13", "SELECT EmprCod, TipMovCn, TipMovCc FROM TXPTIPMOV WHERE EmprCod = ? ORDER BY EmprCod, TipMovCc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
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
               return;
      }
   }

}

