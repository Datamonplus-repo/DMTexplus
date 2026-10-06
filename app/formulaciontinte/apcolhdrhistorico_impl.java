package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class apcolhdrhistorico_impl extends GXWebReport
{
   public apcolhdrhistorico_impl( com.genexus.internet.HttpContext context )
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
         AV19EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV8Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
            AV9Forser = httpContext.GetPar( "Forser") ;
            AV10Forcolnom = httpContext.GetPar( "Forcolnom") ;
            AV11Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
            AV12Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
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
         GxHdr2 = true ;
         /* Using cursor P09XB2 */
         pr_default.execute(0, new Object[] {AV19EmprCod, Integer.valueOf(AV8Clicod), AV9Forser, AV10Forcolnom, Integer.valueOf(AV11Forcolnum), Byte.valueOf(AV12Tipcolcod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P09XB2_A396EmprCod[0] ;
            A252CliCod = P09XB2_A252CliCod[0] ;
            n252CliCod = P09XB2_n252CliCod[0] ;
            A4517HreBarSer = P09XB2_A4517HreBarSer[0] ;
            n4517HreBarSer = P09XB2_n4517HreBarSer[0] ;
            A4521HreColNom = P09XB2_A4521HreColNom[0] ;
            n4521HreColNom = P09XB2_n4521HreColNom[0] ;
            A4522HreColNum = P09XB2_A4522HreColNum[0] ;
            n4522HreColNum = P09XB2_n4522HreColNum[0] ;
            A4525HreTipCol = P09XB2_A4525HreTipCol[0] ;
            n4525HreTipCol = P09XB2_n4525HreTipCol[0] ;
            A4494HreBarPar = P09XB2_A4494HreBarPar[0] ;
            A4493HreBarReo = P09XB2_A4493HreBarReo[0] ;
            A4492HreBarCod = P09XB2_A4492HreBarCod[0] ;
            A4532HreBarKgm = P09XB2_A4532HreBarKgm[0] ;
            n4532HreBarKgm = P09XB2_n4532HreBarKgm[0] ;
            A4495HreNumCie = P09XB2_A4495HreNumCie[0] ;
            AV18Hdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
            h9XB0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Hdr, "")), 8, Gx_line+0, 89, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4532HreBarKgm, "ZZZZZ9.99")), 158, Gx_line+0, 225, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h9XB0( true, 0) ;
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

   public void h9XB0( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "Color:", ""), 8, Gx_line+29, 43, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Clicod), "ZZZZZ9")), 145, Gx_line+28, 190, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Forser, "")), 202, Gx_line+28, 320, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Forcolnom, "")), 326, Gx_line+28, 422, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11Forcolnum), "ZZZZZ9")), 428, Gx_line+28, 473, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Tipcolcod), "Z9")), 479, Gx_line+28, 495, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 8, Gx_line+51, 37, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+65, 87, Gx_line+65, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 606, Gx_line+28, 665, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 539, Gx_line+28, 598, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 739, Gx_line+29, 784, Gx_line+46, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(5, Gx_line+47, 781, Gx_line+47, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 697, Gx_line+29, 725, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Historico", ""), 8, Gx_line+6, 61, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 158, Gx_line+51, 187, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(158, Gx_line+67, 225, Gx_line+67, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+73) ;
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
      AV19EmprCod = "" ;
      AV9Forser = "" ;
      AV10Forcolnom = "" ;
      scmdbuf = "" ;
      P09XB2_A396EmprCod = new String[] {""} ;
      P09XB2_A252CliCod = new int[1] ;
      P09XB2_n252CliCod = new boolean[] {false} ;
      P09XB2_A4517HreBarSer = new String[] {""} ;
      P09XB2_n4517HreBarSer = new boolean[] {false} ;
      P09XB2_A4521HreColNom = new String[] {""} ;
      P09XB2_n4521HreColNom = new boolean[] {false} ;
      P09XB2_A4522HreColNum = new int[1] ;
      P09XB2_n4522HreColNum = new boolean[] {false} ;
      P09XB2_A4525HreTipCol = new byte[1] ;
      P09XB2_n4525HreTipCol = new boolean[] {false} ;
      P09XB2_A4494HreBarPar = new String[] {""} ;
      P09XB2_A4493HreBarReo = new byte[1] ;
      P09XB2_A4492HreBarCod = new int[1] ;
      P09XB2_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09XB2_n4532HreBarKgm = new boolean[] {false} ;
      P09XB2_A4495HreNumCie = new byte[1] ;
      A396EmprCod = "" ;
      A4517HreBarSer = "" ;
      A4521HreColNom = "" ;
      A4494HreBarPar = "" ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      AV18Hdr = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.apcolhdrhistorico__default(),
         new Object[] {
             new Object[] {
            P09XB2_A396EmprCod, P09XB2_A252CliCod, P09XB2_n252CliCod, P09XB2_A4517HreBarSer, P09XB2_n4517HreBarSer, P09XB2_A4521HreColNom, P09XB2_n4521HreColNom, P09XB2_A4522HreColNum, P09XB2_n4522HreColNum, P09XB2_A4525HreTipCol,
            P09XB2_n4525HreTipCol, P09XB2_A4494HreBarPar, P09XB2_A4493HreBarReo, P09XB2_A4492HreBarCod, P09XB2_A4532HreBarKgm, P09XB2_n4532HreBarKgm, P09XB2_A4495HreNumCie
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
   private byte A4525HreTipCol ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV11Forcolnum ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A4522HreColNum ;
   private int A4492HreBarCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19EmprCod ;
   private String AV9Forser ;
   private String AV10Forcolnom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4517HreBarSer ;
   private String A4521HreColNom ;
   private String A4494HreBarPar ;
   private String AV18Hdr ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean n252CliCod ;
   private boolean n4517HreBarSer ;
   private boolean n4521HreColNom ;
   private boolean n4522HreColNum ;
   private boolean n4525HreTipCol ;
   private boolean n4532HreBarKgm ;
   private IDataStoreProvider pr_default ;
   private String[] P09XB2_A396EmprCod ;
   private int[] P09XB2_A252CliCod ;
   private boolean[] P09XB2_n252CliCod ;
   private String[] P09XB2_A4517HreBarSer ;
   private boolean[] P09XB2_n4517HreBarSer ;
   private String[] P09XB2_A4521HreColNom ;
   private boolean[] P09XB2_n4521HreColNom ;
   private int[] P09XB2_A4522HreColNum ;
   private boolean[] P09XB2_n4522HreColNum ;
   private byte[] P09XB2_A4525HreTipCol ;
   private boolean[] P09XB2_n4525HreTipCol ;
   private String[] P09XB2_A4494HreBarPar ;
   private byte[] P09XB2_A4493HreBarReo ;
   private int[] P09XB2_A4492HreBarCod ;
   private java.math.BigDecimal[] P09XB2_A4532HreBarKgm ;
   private boolean[] P09XB2_n4532HreBarKgm ;
   private byte[] P09XB2_A4495HreNumCie ;
}

final  class apcolhdrhistorico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XB2", "SELECT EmprCod, CliCod, HreBarSer, HreColNom, HreColNum, HreTipCol, HreBarPar, HreBarReo, HreBarCod, HreBarKgm, HreNumCie FROM TXPHISREH WHERE EmprCod = ? and CliCod = ? and HreBarSer = ? and HreColNom = ? and HreColNum = ? and HreTipCol = ? ORDER BY EmprCod, CliCod, HreBarSer, HreColNom, HreColNum, HreTipCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
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

