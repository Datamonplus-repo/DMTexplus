package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pcolhdre_impl extends GXWebReport
{
   public pcolhdre_impl( com.genexus.internet.HttpContext context )
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
            AV8Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
            AV9Forser = httpContext.GetPar( "Forser") ;
            AV10Forcolnom = httpContext.GetPar( "Forcolnom") ;
            AV11Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
            AV12Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
            AV13Num_hdrs = (int)(GXutil.lval( httpContext.GetPar( "Num_hdrs"))) ;
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
         Gx_out = "SCR" ;
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
         AV13Num_hdrs = 0 ;
         GxHdr2 = true ;
         /* Using cursor P03F93 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Forser, AV10Forcolnom, Integer.valueOf(AV11Forcolnum), Byte.valueOf(AV12Tipcolcod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A218BarTipCol = P03F93_A218BarTipCol[0] ;
            A136BarColNum = P03F93_A136BarColNum[0] ;
            A135BarColNom = P03F93_A135BarColNom[0] ;
            A212BarSer = P03F93_A212BarSer[0] ;
            A252CliCod = P03F93_A252CliCod[0] ;
            n252CliCod = P03F93_n252CliCod[0] ;
            A4700RecEnvio = P03F93_A4700RecEnvio[0] ;
            A129BarCod = P03F93_A129BarCod[0] ;
            A132BarCodReo = P03F93_A132BarCodReo[0] ;
            A130BarCodPar = P03F93_A130BarCodPar[0] ;
            A166BarKgm = P03F93_A166BarKgm[0] ;
            n166BarKgm = P03F93_n166BarKgm[0] ;
            A2804RecLinMaq = P03F93_A2804RecLinMaq[0] ;
            A218BarTipCol = P03F93_A218BarTipCol[0] ;
            A136BarColNum = P03F93_A136BarColNum[0] ;
            A135BarColNom = P03F93_A135BarColNom[0] ;
            A212BarSer = P03F93_A212BarSer[0] ;
            A252CliCod = P03F93_A252CliCod[0] ;
            n252CliCod = P03F93_n252CliCod[0] ;
            A166BarKgm = P03F93_A166BarKgm[0] ;
            n166BarKgm = P03F93_n166BarKgm[0] ;
            AV14Barcad = (byte)(0) ;
            AV15Barcod = A129BarCod ;
            AV16Barcodreo = A132BarCodReo ;
            AV17Barcodpar = A130BarCodPar ;
            AV18Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            h3F90( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Hdr, "")), 8, Gx_line+0, 89, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 167, Gx_line+0, 234, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h3F90( true, 0) ;
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

   public void h3F90( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color:", ""), 7, Gx_line+5, 42, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Clicod), "ZZZZZ9")), 145, Gx_line+4, 190, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Forser, "")), 202, Gx_line+4, 320, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Forcolnom, "")), 326, Gx_line+4, 422, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11Forcolnum), "ZZZZZ9")), 428, Gx_line+4, 473, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Tipcolcod), "Z9")), 479, Gx_line+4, 495, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 8, Gx_line+27, 37, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+41, 88, Gx_line+41, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 606, Gx_line+4, 665, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 539, Gx_line+4, 598, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 739, Gx_line+5, 784, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+23, 782, Gx_line+23, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 697, Gx_line+5, 725, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 167, Gx_line+27, 196, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(167, Gx_line+41, 234, Gx_line+41, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+47) ;
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
      AV9Forser = "" ;
      AV10Forcolnom = "" ;
      scmdbuf = "" ;
      P03F93_A396EmprCod = new String[] {""} ;
      P03F93_A218BarTipCol = new byte[1] ;
      P03F93_A136BarColNum = new int[1] ;
      P03F93_A135BarColNom = new String[] {""} ;
      P03F93_A212BarSer = new String[] {""} ;
      P03F93_A252CliCod = new int[1] ;
      P03F93_n252CliCod = new boolean[] {false} ;
      P03F93_A4700RecEnvio = new byte[1] ;
      P03F93_A129BarCod = new int[1] ;
      P03F93_A132BarCodReo = new byte[1] ;
      P03F93_A130BarCodPar = new String[] {""} ;
      P03F93_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03F93_n166BarKgm = new boolean[] {false} ;
      P03F93_A2804RecLinMaq = new short[1] ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV17Barcodpar = "" ;
      AV18Hdr = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pcolhdre__default(),
         new Object[] {
             new Object[] {
            P03F93_A396EmprCod, P03F93_A218BarTipCol, P03F93_A136BarColNum, P03F93_A135BarColNom, P03F93_A212BarSer, P03F93_A252CliCod, P03F93_n252CliCod, P03F93_A4700RecEnvio, P03F93_A129BarCod, P03F93_A132BarCodReo,
            P03F93_A130BarCodPar, P03F93_A166BarKgm, P03F93_n166BarKgm, P03F93_A2804RecLinMaq
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

   private byte AV12Tipcolcod ;
   private byte A218BarTipCol ;
   private byte A4700RecEnvio ;
   private byte A132BarCodReo ;
   private byte AV14Barcad ;
   private byte AV16Barcodreo ;
   private short gxcookieaux ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV11Forcolnum ;
   private int AV13Num_hdrs ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV15Barcod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A166BarKgm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV9Forser ;
   private String AV10Forcolnom ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String AV17Barcodpar ;
   private String AV18Hdr ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private IDataStoreProvider pr_default ;
   private String[] P03F93_A396EmprCod ;
   private byte[] P03F93_A218BarTipCol ;
   private int[] P03F93_A136BarColNum ;
   private String[] P03F93_A135BarColNom ;
   private String[] P03F93_A212BarSer ;
   private int[] P03F93_A252CliCod ;
   private boolean[] P03F93_n252CliCod ;
   private byte[] P03F93_A4700RecEnvio ;
   private int[] P03F93_A129BarCod ;
   private byte[] P03F93_A132BarCodReo ;
   private String[] P03F93_A130BarCodPar ;
   private java.math.BigDecimal[] P03F93_A166BarKgm ;
   private boolean[] P03F93_n166BarKgm ;
   private short[] P03F93_A2804RecLinMaq ;
}

final  class pcolhdre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03F93", "SELECT T1.EmprCod, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSer, T2.CliCod, T1.RecEnvio, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.RecLinMaq FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.RecEnvio >= 0) AND (T2.CliCod = ?) AND (T2.BarSer = ?) AND (T2.BarColNom = ?) AND (T2.BarColNum = ?) AND (T2.BarTipCol = ?) ORDER BY T1.EmprCod, T1.RecEnvio ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

