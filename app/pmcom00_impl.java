package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pmcom00_impl extends GXWebReport
{
   public pmcom00_impl( com.genexus.internet.HttpContext context )
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
            A11055MComCod = GXutil.lval( httpContext.GetPar( "MComCod")) ;
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
         GXt_char1 = AV8Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2299_", ""), (byte)(99), GXv_char2) ;
         pmcom00_impl.this.GXt_char1 = GXv_char2[0] ;
         AV8Lit3 = GXt_char1 ;
         GXt_char1 = AV9Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2011_", ""), (byte)(99), GXv_char2) ;
         pmcom00_impl.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit4 = GXt_char1 ;
         GXt_char1 = AV10Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2352_", ""), (byte)(99), GXv_char2) ;
         pmcom00_impl.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit5 = GXt_char1 ;
         GXt_char1 = AV13Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2032_", ""), (byte)(99), GXv_char2) ;
         pmcom00_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit17 = GXt_char1 ;
         /* Using cursor P052Z2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P052Z2_A407EmprNom[0] ;
            n407EmprNom = P052Z2_n407EmprNom[0] ;
            AV14NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV11Val = 0 ;
         AV12Valtot = 0 ;
         GxHdr3 = true ;
         /* Using cursor P052Z3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A782PrvCpo = P052Z3_A782PrvCpo[0] ;
            n782PrvCpo = P052Z3_n782PrvCpo[0] ;
            A799PrvPob = P052Z3_A799PrvPob[0] ;
            n799PrvPob = P052Z3_n799PrvPob[0] ;
            A786PrvDir = P052Z3_A786PrvDir[0] ;
            n786PrvDir = P052Z3_n786PrvDir[0] ;
            A794PrvNom = P052Z3_A794PrvNom[0] ;
            n794PrvNom = P052Z3_n794PrvNom[0] ;
            A795PrvNum = P052Z3_A795PrvNum[0] ;
            n795PrvNum = P052Z3_n795PrvNum[0] ;
            A11046MComFch = P052Z3_A11046MComFch[0] ;
            A782PrvCpo = P052Z3_A782PrvCpo[0] ;
            n782PrvCpo = P052Z3_n782PrvCpo[0] ;
            A799PrvPob = P052Z3_A799PrvPob[0] ;
            n799PrvPob = P052Z3_n799PrvPob[0] ;
            A786PrvDir = P052Z3_A786PrvDir[0] ;
            n786PrvDir = P052Z3_n786PrvDir[0] ;
            A794PrvNom = P052Z3_A794PrvNom[0] ;
            n794PrvNom = P052Z3_n794PrvNom[0] ;
            /* Using cursor P052Z4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A11052MComSolPre = P052Z4_A11052MComSolPre[0] ;
               A11051MComSolCnt = P052Z4_A11051MComSolCnt[0] ;
               A9493MRNom = P052Z4_A9493MRNom[0] ;
               n9493MRNom = P052Z4_n9493MRNom[0] ;
               A9492MRCod = P052Z4_A9492MRCod[0] ;
               A9493MRNom = P052Z4_A9493MRNom[0] ;
               n9493MRNom = P052Z4_n9493MRNom[0] ;
               AV11Val = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( A11051MComSolCnt.multiply(A11052MComSolPre), 0))) ;
               AV12Valtot = (long)(AV12Valtot+AV11Val) ;
               h52Z0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9")), 22, Gx_line+0, 81, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9493MRNom, "")), 88, Gx_line+0, 818, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11051MComSolCnt, "ZZZZZ9.99")), 321, Gx_line+0, 388, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11052MComSolPre, "ZZZZZZZ9.999")), 430, Gx_line+0, 519, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11Val), "ZZZZZZZZZZZ9")), 547, Gx_line+0, 636, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h52Z0( false, 33) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Valtot), "ZZZZZZZZZZZ9")), 547, Gx_line+17, 636, Gx_line+34, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h52Z0( true, 0) ;
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

   public void h52Z0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit17, "")), 420, Gx_line+16, 621, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14NomEmp, "")), 420, Gx_line+50, 671, Gx_line+68, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+100) ;
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
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 15, Gx_line+17, 52, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A11046MComFch, "99/99/99"), 88, Gx_line+17, 147, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pedido", ""), 15, Gx_line+33, 60, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11055MComCod), "ZZZZZZZZZ9")), 88, Gx_line+33, 162, Gx_line+51, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 15, Gx_line+50, 82, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 88, Gx_line+50, 133, Gx_line+68, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 372, Gx_line+50, 625, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A786PrvDir, "")), 372, Gx_line+69, 625, Gx_line+86, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A799PrvPob, "")), 431, Gx_line+88, 684, Gx_line+105, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A782PrvCpo, "")), 372, Gx_line+88, 427, Gx_line+105, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lit3, "")), 22, Gx_line+149, 206, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit4, "")), 108, Gx_line+178, 619, Gx_line+195, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit5, "")), 22, Gx_line+200, 490, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 22, Gx_line+233, 67, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 88, Gx_line+233, 169, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 321, Gx_line+233, 380, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 430, Gx_line+233, 475, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 598, Gx_line+233, 635, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(22, Gx_line+255, 80, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(88, Gx_line+255, 307, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(321, Gx_line+255, 387, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(430, Gx_line+255, 518, Gx_line+255, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+255, 635, Gx_line+255, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+258) ;
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
      AV8Lit3 = "" ;
      AV9Lit4 = "" ;
      AV10Lit5 = "" ;
      AV13Lit17 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P052Z2_A396EmprCod = new String[] {""} ;
      P052Z2_A407EmprNom = new String[] {""} ;
      P052Z2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV14NomEmp = "" ;
      P052Z3_A396EmprCod = new String[] {""} ;
      P052Z3_A11055MComCod = new long[1] ;
      P052Z3_A782PrvCpo = new String[] {""} ;
      P052Z3_n782PrvCpo = new boolean[] {false} ;
      P052Z3_A799PrvPob = new String[] {""} ;
      P052Z3_n799PrvPob = new boolean[] {false} ;
      P052Z3_A786PrvDir = new String[] {""} ;
      P052Z3_n786PrvDir = new boolean[] {false} ;
      P052Z3_A794PrvNom = new String[] {""} ;
      P052Z3_n794PrvNom = new boolean[] {false} ;
      P052Z3_A795PrvNum = new int[1] ;
      P052Z3_n795PrvNum = new boolean[] {false} ;
      P052Z3_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A786PrvDir = "" ;
      A794PrvNom = "" ;
      A11046MComFch = GXutil.nullDate() ;
      P052Z4_A396EmprCod = new String[] {""} ;
      P052Z4_A11055MComCod = new long[1] ;
      P052Z4_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052Z4_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052Z4_A9493MRNom = new String[] {""} ;
      P052Z4_n9493MRNom = new boolean[] {false} ;
      P052Z4_A9492MRCod = new int[1] ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A9493MRNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmcom00__default(),
         new Object[] {
             new Object[] {
            P052Z2_A396EmprCod, P052Z2_A407EmprNom, P052Z2_n407EmprNom
            }
            , new Object[] {
            P052Z3_A396EmprCod, P052Z3_A11055MComCod, P052Z3_A782PrvCpo, P052Z3_n782PrvCpo, P052Z3_A799PrvPob, P052Z3_n799PrvPob, P052Z3_A786PrvDir, P052Z3_n786PrvDir, P052Z3_A794PrvNom, P052Z3_n794PrvNom,
            P052Z3_A795PrvNum, P052Z3_n795PrvNum, P052Z3_A11046MComFch
            }
            , new Object[] {
            P052Z4_A396EmprCod, P052Z4_A11055MComCod, P052Z4_A11052MComSolPre, P052Z4_A11051MComSolCnt, P052Z4_A9493MRNom, P052Z4_n9493MRNom, P052Z4_A9492MRCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int A9492MRCod ;
   private int Gx_OldLine ;
   private long A11055MComCod ;
   private long AV11Val ;
   private long AV12Valtot ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8Lit3 ;
   private String AV9Lit4 ;
   private String AV10Lit5 ;
   private String AV13Lit17 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV14NomEmp ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A786PrvDir ;
   private String A794PrvNom ;
   private String A9493MRNom ;
   private java.util.Date A11046MComFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n795PrvNum ;
   private boolean n9493MRNom ;
   private IDataStoreProvider pr_default ;
   private String[] P052Z2_A396EmprCod ;
   private String[] P052Z2_A407EmprNom ;
   private boolean[] P052Z2_n407EmprNom ;
   private String[] P052Z3_A396EmprCod ;
   private long[] P052Z3_A11055MComCod ;
   private String[] P052Z3_A782PrvCpo ;
   private boolean[] P052Z3_n782PrvCpo ;
   private String[] P052Z3_A799PrvPob ;
   private boolean[] P052Z3_n799PrvPob ;
   private String[] P052Z3_A786PrvDir ;
   private boolean[] P052Z3_n786PrvDir ;
   private String[] P052Z3_A794PrvNom ;
   private boolean[] P052Z3_n794PrvNom ;
   private int[] P052Z3_A795PrvNum ;
   private boolean[] P052Z3_n795PrvNum ;
   private java.util.Date[] P052Z3_A11046MComFch ;
   private String[] P052Z4_A396EmprCod ;
   private long[] P052Z4_A11055MComCod ;
   private java.math.BigDecimal[] P052Z4_A11052MComSolPre ;
   private java.math.BigDecimal[] P052Z4_A11051MComSolCnt ;
   private String[] P052Z4_A9493MRNom ;
   private boolean[] P052Z4_n9493MRNom ;
   private int[] P052Z4_A9492MRCod ;
}

final  class pmcom00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P052Z2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P052Z3", "SELECT T1.EmprCod, T1.MComCod, T2.PrvCpo, T2.PrvPob, T2.PrvDir, T2.PrvNom, T1.PrvNum, T1.MComFch FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE T1.EmprCod = ? and T1.MComCod = ? ORDER BY T1.EmprCod, T1.MComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P052Z4", "SELECT T1.EmprCod, T1.MComCod, T1.MComSolPre, T1.MComSolCnt, T2.MRNom, T1.MRCod FROM (TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) WHERE T1.EmprCod = ? and T1.MComCod = ? ORDER BY T1.EmprCod, T1.MComCod, T1.MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

