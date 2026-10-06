package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rinfent_impl extends GXWebReport
{
   public rinfent_impl( com.genexus.internet.HttpContext context )
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
            AV10PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
            AV8EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         /* Using cursor P06X42 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06X42_A407EmprNom[0] ;
            n407EmprNom = P06X42_n407EmprNom[0] ;
            AV9EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06X43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10PedCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A658PedCod = P06X43_A658PedCod[0] ;
            n658PedCod = P06X43_n658PedCod[0] ;
            A661PedFec = P06X43_A661PedFec[0] ;
            A795PrvNum = P06X43_A795PrvNum[0] ;
            A794PrvNom = P06X43_A794PrvNom[0] ;
            n794PrvNom = P06X43_n794PrvNom[0] ;
            A794PrvNom = P06X43_A794PrvNom[0] ;
            n794PrvNom = P06X43_n794PrvNom[0] ;
            AV11PrvNum = A795PrvNum ;
            AV12PrvNom = A794PrvNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P06X44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV10PedCod), AV8EntFecEnt, AV8EntFecEnt});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A415EntFecEnt = P06X44_A415EntFecEnt[0] ;
            A658PedCod = P06X44_A658PedCod[0] ;
            n658PedCod = P06X44_n658PedCod[0] ;
            A418EntUniEnt = P06X44_A418EntUniEnt[0] ;
            A11Albaran = P06X44_A11Albaran[0] ;
            A718PrdNom = P06X44_A718PrdNom[0] ;
            A719PrdNum = P06X44_A719PrdNum[0] ;
            A597LinEnt = P06X44_A597LinEnt[0] ;
            A718PrdNom = P06X44_A718PrdNom[0] ;
            h6X40( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 14, Gx_line+0, 59, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 66, Gx_line+0, 257, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11Albaran, "")), 292, Gx_line+1, 366, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A415EntFecEnt, "99/99/99"), 424, Gx_line+1, 483, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")), 543, Gx_line+0, 610, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6X40( true, 0) ;
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

   public void h6X40( boolean bFoot ,
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
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem de Compra Nº", ""), 16, Gx_line+79, 141, Gx_line+95, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9EmprNom, "")), 14, Gx_line+14, 234, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 151, Gx_line+79, 210, Gx_line+96, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fornecedor", ""), 16, Gx_line+103, 85, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11PrvNum), "ZZZZZ9")), 99, Gx_line+103, 144, Gx_line+120, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12PrvNom, "")), 153, Gx_line+103, 310, Gx_line+120, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Compras de Produtos - Entradas em Stock", ""), 14, Gx_line+47, 267, Gx_line+63, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 15, Gx_line+155, 63, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Documento", ""), 293, Gx_line+155, 362, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 441, Gx_line+155, 469, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entregue (Kgs)", ""), 522, Gx_line+155, 611, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+175, 264, Gx_line+175, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(293, Gx_line+175, 366, Gx_line+175, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(425, Gx_line+174, 483, Gx_line+174, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(522, Gx_line+174, 610, Gx_line+174, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data-Hora", ""), 557, Gx_line+15, 617, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 624, Gx_line+15, 675, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 685, Gx_line+15, 778, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(11, Gx_line+68, 783, Gx_line+68, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 557, Gx_line+47, 599, Gx_line+63, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 623, Gx_line+47, 668, Gx_line+64, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+179) ;
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
      AV8EntFecEnt = GXutil.nullDate() ;
      scmdbuf = "" ;
      P06X42_A396EmprCod = new String[] {""} ;
      P06X42_A407EmprNom = new String[] {""} ;
      P06X42_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV9EmprNom = "" ;
      P06X43_A396EmprCod = new String[] {""} ;
      P06X43_A658PedCod = new int[1] ;
      P06X43_n658PedCod = new boolean[] {false} ;
      P06X43_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06X43_A795PrvNum = new int[1] ;
      P06X43_A794PrvNom = new String[] {""} ;
      P06X43_n794PrvNom = new boolean[] {false} ;
      A661PedFec = GXutil.nullDate() ;
      A794PrvNom = "" ;
      AV12PrvNom = "" ;
      P06X44_A396EmprCod = new String[] {""} ;
      P06X44_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P06X44_A658PedCod = new int[1] ;
      P06X44_n658PedCod = new boolean[] {false} ;
      P06X44_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06X44_A11Albaran = new String[] {""} ;
      P06X44_A718PrdNom = new String[] {""} ;
      P06X44_A719PrdNum = new String[] {""} ;
      P06X44_A597LinEnt = new short[1] ;
      A415EntFecEnt = GXutil.nullDate() ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A11Albaran = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rinfent__default(),
         new Object[] {
             new Object[] {
            P06X42_A396EmprCod, P06X42_A407EmprNom, P06X42_n407EmprNom
            }
            , new Object[] {
            P06X43_A396EmprCod, P06X43_A658PedCod, P06X43_A661PedFec, P06X43_A795PrvNum, P06X43_A794PrvNom, P06X43_n794PrvNom
            }
            , new Object[] {
            P06X44_A396EmprCod, P06X44_A415EntFecEnt, P06X44_A658PedCod, P06X44_n658PedCod, P06X44_A418EntUniEnt, P06X44_A11Albaran, P06X44_A718PrdNom, P06X44_A719PrdNum, P06X44_A597LinEnt
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV10PedCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int AV11PrvNum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A418EntUniEnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV9EmprNom ;
   private String A794PrvNom ;
   private String AV12PrvNom ;
   private String A11Albaran ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private java.util.Date AV8EntFecEnt ;
   private java.util.Date A661PedFec ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n658PedCod ;
   private boolean n794PrvNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06X42_A396EmprCod ;
   private String[] P06X42_A407EmprNom ;
   private boolean[] P06X42_n407EmprNom ;
   private String[] P06X43_A396EmprCod ;
   private int[] P06X43_A658PedCod ;
   private boolean[] P06X43_n658PedCod ;
   private java.util.Date[] P06X43_A661PedFec ;
   private int[] P06X43_A795PrvNum ;
   private String[] P06X43_A794PrvNom ;
   private boolean[] P06X43_n794PrvNom ;
   private String[] P06X44_A396EmprCod ;
   private java.util.Date[] P06X44_A415EntFecEnt ;
   private int[] P06X44_A658PedCod ;
   private boolean[] P06X44_n658PedCod ;
   private java.math.BigDecimal[] P06X44_A418EntUniEnt ;
   private String[] P06X44_A11Albaran ;
   private String[] P06X44_A718PrdNom ;
   private String[] P06X44_A719PrdNum ;
   private short[] P06X44_A597LinEnt ;
}

final  class rinfent__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06X42", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06X43", "SELECT T1.EmprCod, T1.PedCod, T1.PedFec, T1.PrvNum, T2.PrvNom FROM (TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06X44", "SELECT T1.EmprCod, T1.EntFecEnt, T1.PedCod, T1.EntUniEnt, T1.Albaran, T2.PrdNom, T1.PrdNum, T1.LinEnt FROM (TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.PedCod = ?) AND (T1.EntFecEnt = ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
      }
   }

}

