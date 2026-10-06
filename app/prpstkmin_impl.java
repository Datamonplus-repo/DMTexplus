package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class prpstkmin_impl extends GXWebReport
{
   public prpstkmin_impl( com.genexus.internet.HttpContext context )
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
            AV8Mrcod1 = (int)(GXutil.lval( httpContext.GetPar( "Mrcod1"))) ;
            AV9Mrcod2 = (int)(GXutil.lval( httpContext.GetPar( "Mrcod2"))) ;
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
         /* Using cursor P05KI2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05KI2_A407EmprNom[0] ;
            n407EmprNom = P05KI2_n407EmprNom[0] ;
            AV10EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P05KI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8Mrcod1), Integer.valueOf(AV9Mrcod2)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9492MRCod = P05KI3_A9492MRCod[0] ;
            A11458MRCodPrv = P05KI3_A11458MRCodPrv[0] ;
            n11458MRCodPrv = P05KI3_n11458MRCodPrv[0] ;
            A9497MRStkMin = P05KI3_A9497MRStkMin[0] ;
            n9497MRStkMin = P05KI3_n9497MRStkMin[0] ;
            A9495MRStkAct = P05KI3_A9495MRStkAct[0] ;
            n9495MRStkAct = P05KI3_n9495MRStkAct[0] ;
            A9493MRNom = P05KI3_A9493MRNom[0] ;
            n9493MRNom = P05KI3_n9493MRNom[0] ;
            AV13PrvNum = (int)(GXutil.lval( GXutil.substring( A11458MRCodPrv, 1, 6))) ;
            GXt_char1 = AV11PrvNom ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = AV13PrvNum ;
            GXv_char4[0] = GXt_char1 ;
            new app.pprvnom(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            prpstkmin_impl.this.A396EmprCod = GXv_char2[0] ;
            prpstkmin_impl.this.AV13PrvNum = GXv_int3[0] ;
            prpstkmin_impl.this.GXt_char1 = GXv_char4[0] ;
            AV11PrvNom = GXt_char1 ;
            if ( ( DecimalUtil.compareTo(A9495MRStkAct, A9497MRStkMin) < 0 ) && ( A9497MRStkMin.doubleValue() > 0 ) )
            {
               h5KI0( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9")), 14, Gx_line+0, 73, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9493MRNom, "")), 81, Gx_line+0, 811, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9495MRStkAct, "Z,ZZZ,ZZZ9.999")), 310, Gx_line+0, 413, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9497MRStkMin, "Z,ZZZ,ZZZ9.999")), 419, Gx_line+0, 522, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11PrvNom, "")), 527, Gx_line+0, 750, Gx_line+17, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5KI0( true, 0) ;
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

   public void h5KI0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 14, Gx_line+14, 234, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 691, Gx_line+14, 750, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 623, Gx_line+14, 682, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora", ""), 555, Gx_line+14, 614, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 623, Gx_line+40, 668, Gx_line+57, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 677, Gx_line+41, 744, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 555, Gx_line+41, 600, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Pgmdesc, "")), 14, Gx_line+41, 265, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+68, 752, Gx_line+68, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 14, Gx_line+81, 73, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 81, Gx_line+81, 162, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Almacen", ""), 361, Gx_line+81, 413, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Stk Minimo", ""), 448, Gx_line+81, 522, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 527, Gx_line+81, 594, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+95, 72, Gx_line+95, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(81, Gx_line+95, 300, Gx_line+95, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(310, Gx_line+95, 412, Gx_line+95, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(419, Gx_line+95, 521, Gx_line+95, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(527, Gx_line+95, 746, Gx_line+95, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 669, Gx_line+41, 677, Gx_line+56, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+101) ;
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
      scmdbuf = "" ;
      P05KI2_A396EmprCod = new String[] {""} ;
      P05KI2_A407EmprNom = new String[] {""} ;
      P05KI2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      P05KI3_A396EmprCod = new String[] {""} ;
      P05KI3_A9492MRCod = new int[1] ;
      P05KI3_A11458MRCodPrv = new String[] {""} ;
      P05KI3_n11458MRCodPrv = new boolean[] {false} ;
      P05KI3_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KI3_n9497MRStkMin = new boolean[] {false} ;
      P05KI3_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05KI3_n9495MRStkAct = new boolean[] {false} ;
      P05KI3_A9493MRNom = new String[] {""} ;
      P05KI3_n9493MRNom = new boolean[] {false} ;
      A11458MRCodPrv = "" ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9493MRNom = "" ;
      AV11PrvNom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV22Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prpstkmin__default(),
         new Object[] {
             new Object[] {
            P05KI2_A396EmprCod, P05KI2_A407EmprNom, P05KI2_n407EmprNom
            }
            , new Object[] {
            P05KI3_A396EmprCod, P05KI3_A9492MRCod, P05KI3_A11458MRCodPrv, P05KI3_n11458MRCodPrv, P05KI3_A9497MRStkMin, P05KI3_n9497MRStkMin, P05KI3_A9495MRStkAct, P05KI3_n9495MRStkAct, P05KI3_A9493MRNom, P05KI3_n9493MRNom
            }
         }
      );
      AV22Pgmdesc = httpContext.getMessage( "Repuestos Stocks Bajo Minimos", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV22Pgmdesc = httpContext.getMessage( "Repuestos Stocks Bajo Minimos", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV8Mrcod1 ;
   private int AV9Mrcod2 ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9492MRCod ;
   private int AV13PrvNum ;
   private int GXv_int3[] ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9495MRStkAct ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String A11458MRCodPrv ;
   private String A9493MRNom ;
   private String AV11PrvNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Gx_time ;
   private String AV22Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n11458MRCodPrv ;
   private boolean n9497MRStkMin ;
   private boolean n9495MRStkAct ;
   private boolean n9493MRNom ;
   private IDataStoreProvider pr_default ;
   private String[] P05KI2_A396EmprCod ;
   private String[] P05KI2_A407EmprNom ;
   private boolean[] P05KI2_n407EmprNom ;
   private String[] P05KI3_A396EmprCod ;
   private int[] P05KI3_A9492MRCod ;
   private String[] P05KI3_A11458MRCodPrv ;
   private boolean[] P05KI3_n11458MRCodPrv ;
   private java.math.BigDecimal[] P05KI3_A9497MRStkMin ;
   private boolean[] P05KI3_n9497MRStkMin ;
   private java.math.BigDecimal[] P05KI3_A9495MRStkAct ;
   private boolean[] P05KI3_n9495MRStkAct ;
   private String[] P05KI3_A9493MRNom ;
   private boolean[] P05KI3_n9493MRNom ;
}

final  class prpstkmin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05KI2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05KI3", "SELECT EmprCod, MRCod, MRCodPrv, MRStkMin, MRStkAct, MRNom FROM TXPMREPUE WHERE (EmprCod = ? and MRCod >= ?) AND (MRCod <= ?) ORDER BY EmprCod, MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 100);
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

