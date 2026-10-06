package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rminvstk_impl extends GXWebReport
{
   public rminvstk_impl( com.genexus.internet.HttpContext context )
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
            A9398MISCod = (int)(GXutil.lval( httpContext.GetPar( "MISCod"))) ;
            AV15Tipo = httpContext.GetPar( "Tipo") ;
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
         AV8Lit0 = AV19Pgmdesc ;
         GXt_char1 = AV9Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rminvstk_impl.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit1 = GXt_char1 ;
         GXt_char1 = AV10Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rminvstk_impl.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit2 = GXt_char1 ;
         GXt_char1 = AV11Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rminvstk_impl.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit3 = GXt_char1 ;
         /* Using cursor P07I72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07I72_A407EmprNom[0] ;
            n407EmprNom = P07I72_n407EmprNom[0] ;
            A9402MISEst = P07I72_A9402MISEst[0] ;
            n9402MISEst = P07I72_n9402MISEst[0] ;
            A9399MISFch = P07I72_A9399MISFch[0] ;
            n9399MISFch = P07I72_n9399MISFch[0] ;
            A407EmprNom = P07I72_A407EmprNom[0] ;
            n407EmprNom = P07I72_n407EmprNom[0] ;
            AV12NomEmp = A407EmprNom ;
            AV16MISEst = A9402MISEst ;
            AV13MISEstDsc = ((GXutil.strcmp(A9402MISEst, httpContext.getMessage( "E", ""))==0) ? httpContext.getMessage( "En ingreso", "") : ((GXutil.strcmp(A9402MISEst, httpContext.getMessage( "A", ""))==0) ? httpContext.getMessage( "Aplicado", "") : ((GXutil.strcmp(A9402MISEst, httpContext.getMessage( "C", ""))==0) ? httpContext.getMessage( "Cancelado", "") : httpContext.getMessage( "Desconocido", "")))) ;
            AV14MISFch = A9399MISFch ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07I73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9403MISRCod = P07I73_A9403MISRCod[0] ;
            A9406MISRStkTeo = P07I73_A9406MISRStkTeo[0] ;
            A9407MISRStkRea = P07I73_A9407MISRStkRea[0] ;
            A9408MISRStkDif = P07I73_A9408MISRStkDif[0] ;
            A9404MISRNom = P07I73_A9404MISRNom[0] ;
            n9404MISRNom = P07I73_n9404MISRNom[0] ;
            A9404MISRNom = P07I73_A9404MISRNom[0] ;
            n9404MISRNom = P07I73_n9404MISRNom[0] ;
            if ( GXutil.strcmp(AV16MISEst, httpContext.getMessage( "A", "")) == 0 )
            {
               h7I70( false, 26) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9404MISRNom, "")), 114, Gx_line+10, 844, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9408MISRStkDif, "ZZZZZ9.999")), 596, Gx_line+10, 670, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9407MISRStkRea, "ZZZZZ9.999")), 506, Gx_line+10, 580, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9406MISRStkTeo, "ZZZZZZZ9.999")), 376, Gx_line+10, 465, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9403MISRCod), "ZZZZZZZ9")), 13, Gx_line+10, 72, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(376, Gx_line+25, 464, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(596, Gx_line+25, 669, Gx_line+25, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+26) ;
            }
            else
            {
               if ( GXutil.strcmp(AV15Tipo, httpContext.getMessage( "C", "")) == 0 )
               {
                  h7I70( false, 26) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9403MISRCod), "ZZZZZZZ9")), 13, Gx_line+10, 72, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9404MISRNom, "")), 114, Gx_line+10, 844, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+26) ;
               }
               else
               {
                  h7I70( false, 26) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9406MISRStkTeo, "ZZZZZZZ9.999")), 376, Gx_line+10, 465, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9403MISRCod), "ZZZZZZZ9")), 13, Gx_line+10, 72, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(376, Gx_line+25, 464, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9404MISRNom, "")), 114, Gx_line+10, 844, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+26) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7I70( true, 0) ;
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

   public void h7I70( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lit0, "")), 14, Gx_line+48, 307, Gx_line+68, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit1, "")), 528, Gx_line+10, 592, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 596, Gx_line+10, 647, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit2, "")), 650, Gx_line+10, 701, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 704, Gx_line+10, 797, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit3, "")), 636, Gx_line+52, 712, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 718, Gx_line+52, 745, Gx_line+68, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12NomEmp, "")), 14, Gx_line+9, 234, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Pgmname, "")), 528, Gx_line+52, 685, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(4, Gx_line+77, 803, Gx_line+77, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 749, Gx_line+52, 756, Gx_line+68, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 760, Gx_line+52, 787, Gx_line+68, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial Black", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13MISEstDsc, "")), 323, Gx_line+44, 418, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV14MISFch, "99/99/99"), 433, Gx_line+44, 511, Gx_line+69, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+82) ;
            if ( GXutil.strcmp(AV16MISEst, httpContext.getMessage( "A", "")) == 0 )
            {
               getPrinter().GxDrawLine(376, Gx_line+25, 464, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(596, Gx_line+25, 669, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+25, 71, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(114, Gx_line+25, 333, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 114, Gx_line+13, 333, Gx_line+27, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Teórico", ""), 376, Gx_line+13, 464, Gx_line+27, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Real", ""), 495, Gx_line+13, 579, Gx_line+27, 1, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Diferencia", ""), 596, Gx_line+13, 669, Gx_line+27, 1, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+26) ;
            }
            else
            {
               if ( GXutil.strcmp(AV15Tipo, httpContext.getMessage( "C", "")) == 0 )
               {
                  getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(13, Gx_line+25, 71, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(114, Gx_line+25, 333, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Real", ""), 495, Gx_line+13, 579, Gx_line+27, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 114, Gx_line+13, 333, Gx_line+27, 1, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+26) ;
               }
               else
               {
                  getPrinter().GxDrawLine(376, Gx_line+25, 464, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(495, Gx_line+25, 579, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(13, Gx_line+25, 71, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(114, Gx_line+25, 333, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Teórico", ""), 376, Gx_line+13, 464, Gx_line+27, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Real", ""), 495, Gx_line+13, 579, Gx_line+27, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 114, Gx_line+13, 333, Gx_line+27, 1, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+26) ;
               }
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
      add_metrics2( ) ;
      add_metrics3( ) ;
      add_metrics4( ) ;
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

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial Black", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV15Tipo = "" ;
      AV8Lit0 = "" ;
      AV19Pgmdesc = "" ;
      AV9Lit1 = "" ;
      AV10Lit2 = "" ;
      AV11Lit3 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P07I72_A396EmprCod = new String[] {""} ;
      P07I72_A9398MISCod = new int[1] ;
      P07I72_A407EmprNom = new String[] {""} ;
      P07I72_n407EmprNom = new boolean[] {false} ;
      P07I72_A9402MISEst = new String[] {""} ;
      P07I72_n9402MISEst = new boolean[] {false} ;
      P07I72_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      P07I72_n9399MISFch = new boolean[] {false} ;
      A407EmprNom = "" ;
      A9402MISEst = "" ;
      A9399MISFch = GXutil.nullDate() ;
      AV12NomEmp = "" ;
      AV16MISEst = "" ;
      AV13MISEstDsc = "" ;
      AV14MISFch = GXutil.nullDate() ;
      P07I73_A396EmprCod = new String[] {""} ;
      P07I73_A9398MISCod = new int[1] ;
      P07I73_A9403MISRCod = new int[1] ;
      P07I73_A9406MISRStkTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I73_A9407MISRStkRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I73_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07I73_A9404MISRNom = new String[] {""} ;
      P07I73_n9404MISRNom = new boolean[] {false} ;
      A9406MISRStkTeo = DecimalUtil.ZERO ;
      A9407MISRStkRea = DecimalUtil.ZERO ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      A9404MISRNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV24Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.rminvstk__default(),
         new Object[] {
             new Object[] {
            P07I72_A396EmprCod, P07I72_A9398MISCod, P07I72_A407EmprNom, P07I72_n407EmprNom, P07I72_A9402MISEst, P07I72_n9402MISEst, P07I72_A9399MISFch, P07I72_n9399MISFch
            }
            , new Object[] {
            P07I73_A396EmprCod, P07I73_A9398MISCod, P07I73_A9403MISRCod, P07I73_A9406MISRStkTeo, P07I73_A9407MISRStkRea, P07I73_A9408MISRStkDif, P07I73_A9404MISRNom, P07I73_n9404MISRNom
            }
         }
      );
      AV24Pgmname = "MantenimientoMaquina.RMInvStk" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV19Pgmdesc = httpContext.getMessage( "Inventario", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV24Pgmname = "MantenimientoMaquina.RMInvStk" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV19Pgmdesc = httpContext.getMessage( "Inventario", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int A9398MISCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9403MISRCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A9406MISRStkTeo ;
   private java.math.BigDecimal A9407MISRStkRea ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15Tipo ;
   private String AV8Lit0 ;
   private String AV19Pgmdesc ;
   private String AV9Lit1 ;
   private String AV10Lit2 ;
   private String AV11Lit3 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A9402MISEst ;
   private String AV12NomEmp ;
   private String AV16MISEst ;
   private String AV13MISEstDsc ;
   private String A9404MISRNom ;
   private String Gx_time ;
   private String AV24Pgmname ;
   private java.util.Date A9399MISFch ;
   private java.util.Date AV14MISFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n9402MISEst ;
   private boolean n9399MISFch ;
   private boolean n9404MISRNom ;
   private IDataStoreProvider pr_default ;
   private String[] P07I72_A396EmprCod ;
   private int[] P07I72_A9398MISCod ;
   private String[] P07I72_A407EmprNom ;
   private boolean[] P07I72_n407EmprNom ;
   private String[] P07I72_A9402MISEst ;
   private boolean[] P07I72_n9402MISEst ;
   private java.util.Date[] P07I72_A9399MISFch ;
   private boolean[] P07I72_n9399MISFch ;
   private String[] P07I73_A396EmprCod ;
   private int[] P07I73_A9398MISCod ;
   private int[] P07I73_A9403MISRCod ;
   private java.math.BigDecimal[] P07I73_A9406MISRStkTeo ;
   private java.math.BigDecimal[] P07I73_A9407MISRStkRea ;
   private java.math.BigDecimal[] P07I73_A9408MISRStkDif ;
   private String[] P07I73_A9404MISRNom ;
   private boolean[] P07I73_n9404MISRNom ;
}

final  class rminvstk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07I72", "SELECT T1.EmprCod, T1.MISCod, T2.EmprNom, T1.MISEst, T1.MISFch FROM (TXPMINVST T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.MISCod = ? ORDER BY T1.EmprCod, T1.MISCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07I73", "SELECT T1.EmprCod, T1.MISCod, T1.MISRCod AS MISRCod, T1.MISRStkTeo, T1.MISRStkRea, T1.MISRStkDif, T2.MRNom AS MISRNom FROM (TXPMInSRe T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MISRCod) WHERE T1.EmprCod = ? and T1.MISCod = ? ORDER BY T1.EmprCod, T1.MISCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

