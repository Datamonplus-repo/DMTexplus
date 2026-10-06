package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pcprfases_impl extends GXWebReport
{
   public pcprfases_impl( com.genexus.internet.HttpContext context )
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
            AV14ImpCod = httpContext.GetPar( "ImpCod") ;
            AV20PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV22UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV15ImprimirFase = httpContext.GetPar( "ImprimirFase") ;
            AV25ClienteActivo = httpContext.GetPar( "ClienteActivo") ;
            AV26Fases = httpContext.GetPar( "Fases") ;
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
         /* Using cursor P0ANK2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0ANK2_A407EmprNom[0] ;
            n407EmprNom = P0ANK2_n407EmprNom[0] ;
            AV10EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV24lastcliente = 0 ;
         /* Using cursor P0ANK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV20PCliCod), AV25ClienteActivo, AV25ClienteActivo, AV26Fases, AV26Fases, Integer.valueOf(AV22UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14042FasActiva = P0ANK3_A14042FasActiva[0] ;
            A10045CliAct = P0ANK3_A10045CliAct[0] ;
            A252CliCod = P0ANK3_A252CliCod[0] ;
            A279CliNom = P0ANK3_A279CliNom[0] ;
            A467FasPreMtr = P0ANK3_A467FasPreMtr[0] ;
            n467FasPreMtr = P0ANK3_n467FasPreMtr[0] ;
            A466FasPreKgm = P0ANK3_A466FasPreKgm[0] ;
            n466FasPreKgm = P0ANK3_n466FasPreKgm[0] ;
            A460FasDsc = P0ANK3_A460FasDsc[0] ;
            A457FasCod = P0ANK3_A457FasCod[0] ;
            A10045CliAct = P0ANK3_A10045CliAct[0] ;
            A279CliNom = P0ANK3_A279CliNom[0] ;
            A14042FasActiva = P0ANK3_A14042FasActiva[0] ;
            A460FasDsc = P0ANK3_A460FasDsc[0] ;
            if ( ( AV24lastcliente != A252CliCod ) && ( AV24lastcliente > 0 ) )
            {
               hANK0( false, 64) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 147, Gx_line+8, 199, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 200, Gx_line+9, 245, Gx_line+25, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 249, Gx_line+9, 469, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 81, Gx_line+39, 111, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 149, Gx_line+39, 230, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio Kg", ""), 422, Gx_line+39, 489, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio Mt", ""), 528, Gx_line+39, 595, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 676, Gx_line+39, 692, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(81, Gx_line+54, 139, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(149, Gx_line+54, 353, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(393, Gx_line+54, 488, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(499, Gx_line+54, 594, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(676, Gx_line+54, 691, Gx_line+54, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+64) ;
            }
            hANK0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 81, Gx_line+0, 140, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 149, Gx_line+0, 354, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A466FasPreKgm, "ZZZZZZ9.999")), 393, Gx_line+0, 489, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A467FasPreMtr, "ZZZZZZ9.999")), 499, Gx_line+0, 595, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14042FasActiva, "")), 677, Gx_line+0, 685, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV24lastcliente = A252CliCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hANK0( true, 0) ;
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

   public void hANK0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 27, Gx_line+14, 309, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit1, "")), 542, Gx_line+14, 579, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 586, Gx_line+14, 645, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit2, "")), 677, Gx_line+14, 707, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 725, Gx_line+14, 784, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 655, Gx_line+49, 700, Gx_line+66, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit3, "")), 601, Gx_line+49, 646, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+70, 786, Gx_line+70, 3, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 714, Gx_line+49, 781, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 702, Gx_line+49, 710, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Pgmdesc, "")), 27, Gx_line+49, 247, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 81, Gx_line+107, 111, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 149, Gx_line+107, 230, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Precio Kg", ""), 422, Gx_line+107, 489, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Precio Mt", ""), 528, Gx_line+107, 595, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 676, Gx_line+107, 692, Gx_line+124, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(81, Gx_line+123, 139, Gx_line+123, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(149, Gx_line+123, 353, Gx_line+123, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(393, Gx_line+123, 488, Gx_line+123, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(499, Gx_line+123, 594, Gx_line+123, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(676, Gx_line+123, 691, Gx_line+123, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 250, Gx_line+81, 470, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 201, Gx_line+81, 246, Gx_line+97, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 147, Gx_line+80, 199, Gx_line+97, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+130) ;
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
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV14ImpCod = "" ;
      AV15ImprimirFase = "" ;
      AV25ClienteActivo = "" ;
      AV26Fases = "" ;
      scmdbuf = "" ;
      P0ANK2_A396EmprCod = new String[] {""} ;
      P0ANK2_A407EmprNom = new String[] {""} ;
      P0ANK2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      P0ANK3_A396EmprCod = new String[] {""} ;
      P0ANK3_A14042FasActiva = new String[] {""} ;
      P0ANK3_A10045CliAct = new String[] {""} ;
      P0ANK3_A252CliCod = new int[1] ;
      P0ANK3_A279CliNom = new String[] {""} ;
      P0ANK3_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANK3_n467FasPreMtr = new boolean[] {false} ;
      P0ANK3_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ANK3_n466FasPreKgm = new boolean[] {false} ;
      P0ANK3_A460FasDsc = new String[] {""} ;
      P0ANK3_A457FasCod = new String[] {""} ;
      A14042FasActiva = "" ;
      A10045CliAct = "" ;
      A279CliNom = "" ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      AV17Lit1 = "" ;
      Gx_date = GXutil.nullDate() ;
      AV18Lit2 = "" ;
      Gx_time = "" ;
      AV19Lit3 = "" ;
      AV33Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pcprfases__default(),
         new Object[] {
             new Object[] {
            P0ANK2_A396EmprCod, P0ANK2_A407EmprNom, P0ANK2_n407EmprNom
            }
            , new Object[] {
            P0ANK3_A396EmprCod, P0ANK3_A14042FasActiva, P0ANK3_A10045CliAct, P0ANK3_A252CliCod, P0ANK3_A279CliNom, P0ANK3_A467FasPreMtr, P0ANK3_n467FasPreMtr, P0ANK3_A466FasPreKgm, P0ANK3_n466FasPreKgm, P0ANK3_A460FasDsc,
            P0ANK3_A457FasCod
            }
         }
      );
      AV33Pgmdesc = httpContext.getMessage( "Listado Precios por Fase", "") ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV33Pgmdesc = httpContext.getMessage( "Listado Precios por Fase", "") ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV20PCliCod ;
   private int AV22UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV24lastcliente ;
   private int A252CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV14ImpCod ;
   private String AV15ImprimirFase ;
   private String AV25ClienteActivo ;
   private String AV26Fases ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String A14042FasActiva ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String Gx_time ;
   private String AV19Lit3 ;
   private String AV33Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n467FasPreMtr ;
   private boolean n466FasPreKgm ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANK2_A396EmprCod ;
   private String[] P0ANK2_A407EmprNom ;
   private boolean[] P0ANK2_n407EmprNom ;
   private String[] P0ANK3_A396EmprCod ;
   private String[] P0ANK3_A14042FasActiva ;
   private String[] P0ANK3_A10045CliAct ;
   private int[] P0ANK3_A252CliCod ;
   private String[] P0ANK3_A279CliNom ;
   private java.math.BigDecimal[] P0ANK3_A467FasPreMtr ;
   private boolean[] P0ANK3_n467FasPreMtr ;
   private java.math.BigDecimal[] P0ANK3_A466FasPreKgm ;
   private boolean[] P0ANK3_n466FasPreKgm ;
   private String[] P0ANK3_A460FasDsc ;
   private String[] P0ANK3_A457FasCod ;
}

final  class pcprfases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANK2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ANK3", "SELECT T1.EmprCod, T3.FasActiva, T2.CliAct, T1.CliCod, T2.CliNom, T1.FasPreMtr, T1.FasPreKgm, T3.FasDsc, T1.FasCod FROM ((TXPPREFAS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ?) AND (T2.CliAct = ? or ? = 'T') AND (T3.FasActiva = ? or ? = 'T') AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 28);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
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
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

