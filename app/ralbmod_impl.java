package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ralbmod_impl extends GXWebReport
{
   public ralbmod_impl( com.genexus.internet.HttpContext context )
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
            AV12AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            AV8Paletes = (byte)(GXutil.lval( httpContext.GetPar( "Paletes"))) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         GXv_char1[0] = AV17ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBMOD", ""), GXv_char1) ;
         ralbmod_impl.this.AV17ContDsc = GXv_char1[0] ;
         AV9ContPal = AV8Paletes ;
         /* Using cursor P06LK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A840TrnCod = P06LK2_A840TrnCod[0] ;
            n840TrnCod = P06LK2_n840TrnCod[0] ;
            A970ProceCod = P06LK2_A970ProceCod[0] ;
            n970ProceCod = P06LK2_n970ProceCod[0] ;
            A44AlbRecCod = P06LK2_A44AlbRecCod[0] ;
            A252CliCod = P06LK2_A252CliCod[0] ;
            A45AlbRef = P06LK2_A45AlbRef[0] ;
            A50AlbRLoc = P06LK2_A50AlbRLoc[0] ;
            A1291AlbRDes = P06LK2_A1291AlbRDes[0] ;
            A279CliNom = P06LK2_A279CliNom[0] ;
            A49AlbRFen = P06LK2_A49AlbRFen[0] ;
            A52AlbRPieEnt = P06LK2_A52AlbRPieEnt[0] ;
            A58AlbRUniEnt = P06LK2_A58AlbRUniEnt[0] ;
            A971ProceNom = P06LK2_A971ProceNom[0] ;
            n971ProceNom = P06LK2_n971ProceNom[0] ;
            A841TrnNom = P06LK2_A841TrnNom[0] ;
            n841TrnNom = P06LK2_n841TrnNom[0] ;
            A55AlbRReo = P06LK2_A55AlbRReo[0] ;
            A46AlbREnt = P06LK2_A46AlbREnt[0] ;
            A279CliNom = P06LK2_A279CliNom[0] ;
            A841TrnNom = P06LK2_A841TrnNom[0] ;
            n841TrnNom = P06LK2_n841TrnNom[0] ;
            A971ProceNom = P06LK2_A971ProceNom[0] ;
            n971ProceNom = P06LK2_n971ProceNom[0] ;
            AV14CliCod = A252CliCod ;
            AV11ArtCod = A45AlbRef ;
            /* Execute user subroutine: 'BUSART' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV16AlbRLoc = GXutil.rtrim( GXutil.substring( A50AlbRLoc, 1, 3)) ;
            while ( AV9ContPal > 0 )
            {
               h6LK0( false, 123) ;
               getPrinter().GxDrawRect(5, Gx_line+5, 781, Gx_line+115, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "LOTE", ""), 524, Gx_line+25, 581, Gx_line+51, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 36, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 524, Gx_line+49, 765, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3c99144a-8aa9-43d5-8fce-801099ee2ac5", "", context.getHttpContext().getTheme( )), 34, Gx_line+16, 127, Gx_line+108) ;
               getPrinter().GxDrawLine(514, Gx_line+7, 514, Gx_line+117, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17ContDsc, "")), 675, Gx_line+11, 759, Gx_line+24, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+123) ;
               h6LK0( false, 340) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 602, Gx_line+18, 695, Gx_line+42, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 108, Gx_line+57, 217, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 453, Gx_line+56, 571, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ArtDsc, "")), 575, Gx_line+56, 766, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")), 102, Gx_line+94, 126, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13TipArtDsc, "")), 424, Gx_line+94, 613, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 86, Gx_line+185, 275, Gx_line+203, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 86, Gx_line+234, 275, Gx_line+252, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia de Recepção", ""), 460, Gx_line+21, 583, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Doc. Entrega", ""), 17, Gx_line+57, 102, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 408, Gx_line+57, 449, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fam:", ""), 377, Gx_line+94, 416, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 669, Gx_line+170, 745, Gx_line+189, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 614, Gx_line+170, 665, Gx_line+189, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(3, Gx_line+6, 779, Gx_line+335, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(3, Gx_line+119, 779, Gx_line+119, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(371, Gx_line+119, 371, Gx_line+335, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Doct. ", ""), 11, Gx_line+147, 76, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Transp.  ", ""), 11, Gx_line+185, 62, Gx_line+201, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proced.  ", ""), 11, Gx_line+234, 64, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(371, Gx_line+193, 779, Gx_line+193, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL :", ""), 378, Gx_line+170, 428, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data  ", ""), 440, Gx_line+123, 474, Gx_line+139, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 619, Gx_line+123, 656, Gx_line+139, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs.", ""), 698, Gx_line+123, 725, Gx_line+139, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(371, Gx_line+146, 779, Gx_line+146, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ent.:", ""), 380, Gx_line+205, 412, Gx_line+223, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Util.:", ""), 380, Gx_line+230, 410, Gx_line+248, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("__________", 514, Gx_line+234, 588, Gx_line+248, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("__________", 514, Gx_line+261, 588, Gx_line+275, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("__________", 514, Gx_line+288, 588, Gx_line+302, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("__________", 514, Gx_line+314, 588, Gx_line+328, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________", 609, Gx_line+234, 668, Gx_line+248, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________", 609, Gx_line+261, 668, Gx_line+275, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________", 609, Gx_line+288, 668, Gx_line+302, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________", 609, Gx_line+314, 668, Gx_line+328, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________.__", 684, Gx_line+234, 762, Gx_line+248, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________.__", 684, Gx_line+261, 762, Gx_line+275, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________.__", 684, Gx_line+288, 762, Gx_line+302, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________.__", 684, Gx_line+314, 762, Gx_line+328, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Anomalia ", ""), 17, Gx_line+94, 91, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 436, Gx_line+170, 495, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 436, Gx_line+205, 495, Gx_line+224, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("________", 609, Gx_line+211, 668, Gx_line+225, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("________.__", 684, Gx_line+211, 762, Gx_line+225, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 86, Gx_line+147, 137, Gx_line+164, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 83, Gx_line+21, 128, Gx_line+39, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 139, Gx_line+21, 328, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 17, Gx_line+21, 65, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Destino", ""), 11, Gx_line+281, 57, Gx_line+297, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 86, Gx_line+281, 212, Gx_line+299, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+340) ;
               AV15Flag = (byte)(0) ;
               /* Using cursor P06LK3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A1300AlbRObs = P06LK3_A1300AlbRObs[0] ;
                  A1299AlbRLin = P06LK3_A1299AlbRLin[0] ;
                  if ( AV15Flag == 0 )
                  {
                     h6LK0( false, 20) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "O b s :", ""), 18, Gx_line+1, 55, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 91, Gx_line+1, 530, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("-", 78, Gx_line+1, 84, Gx_line+20, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(5, Gx_line+0, 5, Gx_line+20, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(780, Gx_line+0, 780, Gx_line+20, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+20) ;
                     AV15Flag = (byte)(1) ;
                  }
                  else
                  {
                     h6LK0( false, 19) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 91, Gx_line+0, 530, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("-", 78, Gx_line+0, 84, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(5, Gx_line+0, 5, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(780, Gx_line+0, 780, Gx_line+17, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                  }
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               h6LK0( false, 17) ;
               getPrinter().GxDrawLine(5, Gx_line+0, 5, Gx_line+11, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(780, Gx_line+0, 780, Gx_line+11, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(5, Gx_line+10, 781, Gx_line+10, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV9ContPal = (byte)(AV9ContPal-1) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6LK0( true, 0) ;
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

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'BUSART' Routine */
      returnInSub = false ;
      /* Using cursor P06LK4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV11ArtCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A829TipArtCod = P06LK4_A829TipArtCod[0] ;
         A65ArtCod = P06LK4_A65ArtCod[0] ;
         A252CliCod = P06LK4_A252CliCod[0] ;
         A69ArtDsc = P06LK4_A69ArtDsc[0] ;
         n69ArtDsc = P06LK4_n69ArtDsc[0] ;
         A830TipArtDsc = P06LK4_A830TipArtDsc[0] ;
         n830TipArtDsc = P06LK4_n830TipArtDsc[0] ;
         A830TipArtDsc = P06LK4_A830TipArtDsc[0] ;
         n830TipArtDsc = P06LK4_n830TipArtDsc[0] ;
         AV10ArtDsc = A69ArtDsc ;
         AV13TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h6LK0( boolean bFoot ,
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
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
      AV17ContDsc = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P06LK2_A840TrnCod = new short[1] ;
      P06LK2_n840TrnCod = new boolean[] {false} ;
      P06LK2_A970ProceCod = new short[1] ;
      P06LK2_n970ProceCod = new boolean[] {false} ;
      P06LK2_A396EmprCod = new String[] {""} ;
      P06LK2_A44AlbRecCod = new int[1] ;
      P06LK2_A252CliCod = new int[1] ;
      P06LK2_A45AlbRef = new String[] {""} ;
      P06LK2_A50AlbRLoc = new String[] {""} ;
      P06LK2_A1291AlbRDes = new String[] {""} ;
      P06LK2_A279CliNom = new String[] {""} ;
      P06LK2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06LK2_A52AlbRPieEnt = new int[1] ;
      P06LK2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06LK2_A971ProceNom = new String[] {""} ;
      P06LK2_n971ProceNom = new boolean[] {false} ;
      P06LK2_A841TrnNom = new String[] {""} ;
      P06LK2_n841TrnNom = new boolean[] {false} ;
      P06LK2_A55AlbRReo = new String[] {""} ;
      P06LK2_A46AlbREnt = new String[] {""} ;
      A45AlbRef = "" ;
      A50AlbRLoc = "" ;
      A1291AlbRDes = "" ;
      A279CliNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A55AlbRReo = "" ;
      A46AlbREnt = "" ;
      AV11ArtCod = "" ;
      AV16AlbRLoc = "" ;
      AV10ArtDsc = "" ;
      AV13TipArtDsc = "" ;
      P06LK3_A396EmprCod = new String[] {""} ;
      P06LK3_A44AlbRecCod = new int[1] ;
      P06LK3_A1300AlbRObs = new String[] {""} ;
      P06LK3_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      P06LK4_A829TipArtCod = new short[1] ;
      P06LK4_A396EmprCod = new String[] {""} ;
      P06LK4_A65ArtCod = new String[] {""} ;
      P06LK4_A252CliCod = new int[1] ;
      P06LK4_A69ArtDsc = new String[] {""} ;
      P06LK4_n69ArtDsc = new boolean[] {false} ;
      P06LK4_A830TipArtDsc = new String[] {""} ;
      P06LK4_n830TipArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ralbmod__default(),
         new Object[] {
             new Object[] {
            P06LK2_A840TrnCod, P06LK2_n840TrnCod, P06LK2_A970ProceCod, P06LK2_n970ProceCod, P06LK2_A396EmprCod, P06LK2_A44AlbRecCod, P06LK2_A252CliCod, P06LK2_A45AlbRef, P06LK2_A50AlbRLoc, P06LK2_A1291AlbRDes,
            P06LK2_A279CliNom, P06LK2_A49AlbRFen, P06LK2_A52AlbRPieEnt, P06LK2_A58AlbRUniEnt, P06LK2_A971ProceNom, P06LK2_n971ProceNom, P06LK2_A841TrnNom, P06LK2_n841TrnNom, P06LK2_A55AlbRReo, P06LK2_A46AlbREnt
            }
            , new Object[] {
            P06LK3_A396EmprCod, P06LK3_A44AlbRecCod, P06LK3_A1300AlbRObs, P06LK3_A1299AlbRLin
            }
            , new Object[] {
            P06LK4_A829TipArtCod, P06LK4_A396EmprCod, P06LK4_A65ArtCod, P06LK4_A252CliCod, P06LK4_A69ArtDsc, P06LK4_n69ArtDsc, P06LK4_A830TipArtDsc, P06LK4_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV8Paletes ;
   private byte AV9ContPal ;
   private byte AV15Flag ;
   private byte A1299AlbRLin ;
   private short gxcookieaux ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV12AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int AV14CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV17ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A45AlbRef ;
   private String A50AlbRLoc ;
   private String A1291AlbRDes ;
   private String A279CliNom ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A55AlbRReo ;
   private String A46AlbREnt ;
   private String AV11ArtCod ;
   private String AV16AlbRLoc ;
   private String AV10ArtDsc ;
   private String AV13TipArtDsc ;
   private String A1300AlbRObs ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private java.util.Date A49AlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean n69ArtDsc ;
   private boolean n830TipArtDsc ;
   private IDataStoreProvider pr_default ;
   private short[] P06LK2_A840TrnCod ;
   private boolean[] P06LK2_n840TrnCod ;
   private short[] P06LK2_A970ProceCod ;
   private boolean[] P06LK2_n970ProceCod ;
   private String[] P06LK2_A396EmprCod ;
   private int[] P06LK2_A44AlbRecCod ;
   private int[] P06LK2_A252CliCod ;
   private String[] P06LK2_A45AlbRef ;
   private String[] P06LK2_A50AlbRLoc ;
   private String[] P06LK2_A1291AlbRDes ;
   private String[] P06LK2_A279CliNom ;
   private java.util.Date[] P06LK2_A49AlbRFen ;
   private int[] P06LK2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P06LK2_A58AlbRUniEnt ;
   private String[] P06LK2_A971ProceNom ;
   private boolean[] P06LK2_n971ProceNom ;
   private String[] P06LK2_A841TrnNom ;
   private boolean[] P06LK2_n841TrnNom ;
   private String[] P06LK2_A55AlbRReo ;
   private String[] P06LK2_A46AlbREnt ;
   private String[] P06LK3_A396EmprCod ;
   private int[] P06LK3_A44AlbRecCod ;
   private String[] P06LK3_A1300AlbRObs ;
   private byte[] P06LK3_A1299AlbRLin ;
   private short[] P06LK4_A829TipArtCod ;
   private String[] P06LK4_A396EmprCod ;
   private String[] P06LK4_A65ArtCod ;
   private int[] P06LK4_A252CliCod ;
   private String[] P06LK4_A69ArtDsc ;
   private boolean[] P06LK4_n69ArtDsc ;
   private String[] P06LK4_A830TipArtDsc ;
   private boolean[] P06LK4_n830TipArtDsc ;
}

final  class ralbmod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06LK2", "SELECT T1.TrnCod, T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T1.CliCod, T1.AlbRef, T1.AlbRLoc, T1.AlbRDes, T2.CliNom, T1.AlbRFen, T1.AlbRPieEnt, T1.AlbRUniEnt, T4.ProceNom, T3.TrnNom, T1.AlbRReo, T1.AlbREnt FROM (((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06LK3", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06LK4", "SELECT T1.TipArtCod, T1.EmprCod, T1.ArtCod, T1.CliCod, T1.ArtDsc, T2.TipArtDsc FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 2);
               ((String[]) buf[19])[0] = rslt.getString(16, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

