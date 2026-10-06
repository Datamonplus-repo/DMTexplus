package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ppdfinvproductos_impl extends GXWebReport
{
   public ppdfinvproductos_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV8Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV18Prdnum1 = httpContext.GetPar( "Prdnum1") ;
            AV19Prdnum2 = httpContext.GetPar( "Prdnum2") ;
            AV9RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
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
      M_bot = 2 ;
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
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P062G2 */
         pr_default.execute(0, new Object[] {AV8Emprcod, AV9RecFec, AV18Prdnum1, AV19Prdnum2, AV19Prdnum2});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P062G2_A719PrdNum[0] ;
            A810RecFec = P062G2_A810RecFec[0] ;
            A396EmprCod = P062G2_A396EmprCod[0] ;
            A13455Rechora = P062G2_A13455Rechora[0] ;
            A809RecExiTeo = P062G2_A809RecExiTeo[0] ;
            A6573RecPreRec = P062G2_A6573RecPreRec[0] ;
            A807RecExiRea = P062G2_A807RecExiRea[0] ;
            A718PrdNom = P062G2_A718PrdNom[0] ;
            A718PrdNom = P062G2_A718PrdNom[0] ;
            AV25RecHora = A13455Rechora ;
            AV10ExisInicial = A809RecExiTeo ;
            AV11valorInicial = GXutil.roundDecimal( (A809RecExiTeo.multiply(A6573RecPreRec)), 2) ;
            AV13ExisActual = A807RecExiRea ;
            AV12valorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
            h62G0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10ExisInicial, "ZZZZZZ9.9999")), 271, Gx_line+0, 360, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11valorInicial, "ZZZZZZZ9.99")), 366, Gx_line+0, 447, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13ExisActual, "ZZZZZZ9.9999")), 460, Gx_line+0, 549, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV12valorActual, "ZZZZZZZ9.99")), 555, Gx_line+0, 636, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 14, Gx_line+0, 59, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 68, Gx_line+0, 259, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV21TotExisInicial = AV21TotExisInicial.add(A809RecExiTeo) ;
            AV22TotValExisInicial = AV22TotValExisInicial.add(AV11valorInicial) ;
            AV23TotExisActual = AV23TotExisActual.add(A807RecExiRea) ;
            AV24TotValExisActual = AV24TotValExisActual.add(AV12valorActual) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         h62G0( false, 41) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21TotExisInicial, "ZZZZZZ9.9999")), 271, Gx_line+14, 360, Gx_line+31, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotValExisActual, "ZZZZZZZ9.99")), 555, Gx_line+14, 636, Gx_line+31, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotValExisInicial, "ZZZZZZZ9.99")), 366, Gx_line+14, 447, Gx_line+31, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23TotExisActual, "ZZZZZZ9.9999")), 460, Gx_line+14, 549, Gx_line+31, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 203, Gx_line+14, 240, Gx_line+31, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+41) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h62G0( true, 0) ;
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

   public void h62G0( boolean bFoot ,
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
            getPrinter().GxDrawText(httpContext.getMessage( "Inventario de Productos a:", ""), 41, Gx_line+27, 232, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 664, Gx_line+27, 709, Gx_line+44, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 718, Gx_line+27, 785, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 596, Gx_line+27, 641, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 708, Gx_line+27, 716, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 718, Gx_line+14, 777, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 650, Gx_line+14, 709, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia", ""), 596, Gx_line+14, 619, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+47, 800, Gx_line+47, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV25RecHora, "99/99/99 99:99"), 242, Gx_line+27, 345, Gx_line+44, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+54) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Existencia", ""), 278, Gx_line+27, 352, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 289, Gx_line+41, 341, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 388, Gx_line+14, 425, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Existencia", ""), 370, Gx_line+27, 444, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 380, Gx_line+41, 432, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Stock", ""), 485, Gx_line+27, 522, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Actual", ""), 482, Gx_line+41, 527, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 577, Gx_line+14, 614, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Stock", ""), 577, Gx_line+27, 614, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Actual", ""), 574, Gx_line+41, 619, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(271, Gx_line+68, 359, Gx_line+68, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(366, Gx_line+68, 446, Gx_line+68, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(460, Gx_line+68, 548, Gx_line+68, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+68, 635, Gx_line+68, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 14, Gx_line+41, 73, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+68, 259, Gx_line+68, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+76) ;
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
      AV8Emprcod = "" ;
      AV18Prdnum1 = "" ;
      AV19Prdnum2 = "" ;
      AV9RecFec = GXutil.nullDate() ;
      scmdbuf = "" ;
      P062G2_A719PrdNum = new String[] {""} ;
      P062G2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P062G2_A396EmprCod = new String[] {""} ;
      P062G2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P062G2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P062G2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P062G2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P062G2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A810RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A809RecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV25RecHora = GXutil.resetTime( GXutil.nullDate() );
      AV10ExisInicial = DecimalUtil.ZERO ;
      AV11valorInicial = DecimalUtil.ZERO ;
      AV13ExisActual = DecimalUtil.ZERO ;
      AV12valorActual = DecimalUtil.ZERO ;
      AV21TotExisInicial = DecimalUtil.ZERO ;
      AV22TotValExisInicial = DecimalUtil.ZERO ;
      AV23TotExisActual = DecimalUtil.ZERO ;
      AV24TotValExisActual = DecimalUtil.ZERO ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppdfinvproductos__default(),
         new Object[] {
             new Object[] {
            P062G2_A719PrdNum, P062G2_A810RecFec, P062G2_A396EmprCod, P062G2_A13455Rechora, P062G2_A809RecExiTeo, P062G2_A6573RecPreRec, P062G2_A807RecExiRea, P062G2_A718PrdNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
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
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV10ExisInicial ;
   private java.math.BigDecimal AV11valorInicial ;
   private java.math.BigDecimal AV13ExisActual ;
   private java.math.BigDecimal AV12valorActual ;
   private java.math.BigDecimal AV21TotExisInicial ;
   private java.math.BigDecimal AV22TotValExisInicial ;
   private java.math.BigDecimal AV23TotExisActual ;
   private java.math.BigDecimal AV24TotValExisActual ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV8Emprcod ;
   private String AV18Prdnum1 ;
   private String AV19Prdnum2 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String Gx_time ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV25RecHora ;
   private java.util.Date AV9RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private IDataStoreProvider pr_default ;
   private String[] P062G2_A719PrdNum ;
   private java.util.Date[] P062G2_A810RecFec ;
   private String[] P062G2_A396EmprCod ;
   private java.util.Date[] P062G2_A13455Rechora ;
   private java.math.BigDecimal[] P062G2_A809RecExiTeo ;
   private java.math.BigDecimal[] P062G2_A6573RecPreRec ;
   private java.math.BigDecimal[] P062G2_A807RecExiRea ;
   private String[] P062G2_A718PrdNom ;
}

final  class ppdfinvproductos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P062G2", "SELECT T1.PrdNum, T1.RecFec, T1.EmprCod, T1.Rechora, T1.RecExiTeo, T1.RecPreRec, T1.RecExiRea, T2.PrdNom FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.RecFec = ? and T1.PrdNum >= ?) AND (T1.PrdNum <= ? or (rtrim(?) IS NULL)) ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

