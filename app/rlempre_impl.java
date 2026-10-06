package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rlempre_impl extends GXWebReport
{
   public rlempre_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "PEmpCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV15PEmpCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV16UEmpCod = httpContext.GetPar( "UEmpCod") ;
            AV17ImpCod = httpContext.GetPar( "ImpCod") ;
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
         GXt_char1 = AV19Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rlempre_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit1 = GXt_char1 ;
         GXt_char1 = AV20Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rlempre_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit2 = GXt_char1 ;
         GXt_char1 = AV21Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rlempre_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit3 = GXt_char1 ;
         /* Using cursor P06682 */
         pr_default.execute(0, new Object[] {AV15PEmpCod, AV16UEmpCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P06682_A396EmprCod[0] ;
            A407EmprNom = P06682_A407EmprNom[0] ;
            n407EmprNom = P06682_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P06683 */
         pr_default.execute(1, new Object[] {AV15PEmpCod, AV16UEmpCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P06683_A396EmprCod[0] ;
            A407EmprNom = P06683_A407EmprNom[0] ;
            n407EmprNom = P06683_n407EmprNom[0] ;
            h6680( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 7, Gx_line+0, 30, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 44, Gx_line+0, 264, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            /* Using cursor P06684 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1147ContVal2 = P06684_A1147ContVal2[0] ;
               A316ContVal = P06684_A316ContVal[0] ;
               A314ContDsc = P06684_A314ContDsc[0] ;
               A313ContCod = P06684_A313ContCod[0] ;
               h6680( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A313ContCod, "@!")), 294, Gx_line+0, 339, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A314ContDsc, "")), 345, Gx_line+0, 492, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A316ContVal), "ZZZZZZZ9")), 544, Gx_line+0, 603, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1147ContVal2), "ZZZZZZZZZ9")), 608, Gx_line+0, 682, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6680( false, 17) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6680( true, 0) ;
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

   public void h6680( boolean bFoot ,
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
            getPrinter().GxDrawText(":", 364, Gx_line+9, 368, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 592, Gx_line+9, 596, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LISTADO DE EMPRESAS", ""), 7, Gx_line+38, 148, Gx_line+54, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 7, Gx_line+9, 196, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit1, "")), 295, Gx_line+9, 359, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 378, Gx_line+9, 437, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit2, "")), 516, Gx_line+9, 567, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 606, Gx_line+9, 665, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 592, Gx_line+38, 596, Gx_line+54, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit3, "")), 516, Gx_line+38, 592, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 621, Gx_line+38, 666, Gx_line+55, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "EMPRESA", ""), 7, Gx_line+94, 66, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+0, 685, Gx_line+0, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+59, 685, Gx_line+59, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CONTADOR", ""), 294, Gx_line+94, 362, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "VALOR", ""), 560, Gx_line+94, 602, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Pgmname, "")), 295, Gx_line+38, 515, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+113, 264, Gx_line+113, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(294, Gx_line+113, 511, Gx_line+113, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(544, Gx_line+113, 602, Gx_line+113, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "VALOR II", ""), 630, Gx_line+94, 681, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(608, Gx_line+113, 681, Gx_line+113, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+117) ;
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
      AV15PEmpCod = "" ;
      AV16UEmpCod = "" ;
      AV17ImpCod = "" ;
      AV19Lit1 = "" ;
      AV20Lit2 = "" ;
      AV21Lit3 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06682_A396EmprCod = new String[] {""} ;
      P06682_A407EmprNom = new String[] {""} ;
      P06682_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      P06683_A396EmprCod = new String[] {""} ;
      P06683_A407EmprNom = new String[] {""} ;
      P06683_n407EmprNom = new boolean[] {false} ;
      P06684_A396EmprCod = new String[] {""} ;
      P06684_A1147ContVal2 = new long[1] ;
      P06684_A316ContVal = new int[1] ;
      P06684_A314ContDsc = new String[] {""} ;
      P06684_A313ContCod = new String[] {""} ;
      A314ContDsc = "" ;
      A313ContCod = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV28Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rlempre__default(),
         new Object[] {
             new Object[] {
            P06682_A396EmprCod, P06682_A407EmprNom, P06682_n407EmprNom
            }
            , new Object[] {
            P06683_A396EmprCod, P06683_A407EmprNom, P06683_n407EmprNom
            }
            , new Object[] {
            P06684_A396EmprCod, P06684_A1147ContVal2, P06684_A316ContVal, P06684_A314ContDsc, P06684_A313ContCod
            }
         }
      );
      AV28Pgmname = "RLEMPRE" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV28Pgmname = "RLEMPRE" ;
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
   private int A316ContVal ;
   private long A1147ContVal2 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV15PEmpCod ;
   private String AV16UEmpCod ;
   private String AV17ImpCod ;
   private String AV19Lit1 ;
   private String AV20Lit2 ;
   private String AV21Lit3 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A314ContDsc ;
   private String A313ContCod ;
   private String Gx_time ;
   private String AV28Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06682_A396EmprCod ;
   private String[] P06682_A407EmprNom ;
   private boolean[] P06682_n407EmprNom ;
   private String[] P06683_A396EmprCod ;
   private String[] P06683_A407EmprNom ;
   private boolean[] P06683_n407EmprNom ;
   private String[] P06684_A396EmprCod ;
   private long[] P06684_A1147ContVal2 ;
   private int[] P06684_A316ContVal ;
   private String[] P06684_A314ContDsc ;
   private String[] P06684_A313ContCod ;
}

final  class rlempre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06682", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE (EmprCod >= ?) AND (EmprCod <= ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06683", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE (EmprCod >= ?) AND (EmprCod <= ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06684", "SELECT EmprCod, ContVal2, ContVal, ContDsc, ContCod FROM TXPEMPLIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
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
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

