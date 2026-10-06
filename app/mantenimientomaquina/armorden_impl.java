package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class armorden_impl extends GXWebReport
{
   public armorden_impl( com.genexus.internet.HttpContext context )
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
         AV8EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV23OMCodCollectionJSon = httpContext.GetPar( "OMCodCollectionJSon") ;
            AV12Tipo = httpContext.GetPar( "Tipo") ;
            AV10Tot = (short)(GXutil.lval( httpContext.GetPar( "Tot"))) ;
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
         AV22OMCodCollection.fromJSonString(AV23OMCodCollectionJSon, null);
         AV30GXV1 = 1 ;
         while ( AV30GXV1 <= AV22OMCodCollection.size() )
         {
            AV25ItemOMCod = ((Number) AV22OMCodCollection.elementAt(-1+AV30GXV1)).intValue() ;
            AV11i = (short)(AV11i+1) ;
            if ( AV11i == 1 )
            {
               AV21OMCod1 = AV25ItemOMCod ;
            }
            AV9OMCod[AV11i-1] = AV25ItemOMCod ;
            AV30GXV1 = (int)(AV30GXV1+1) ;
         }
         AV15Lit0 = AV31Pgmdesc ;
         GXt_char1 = AV16Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         armorden_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit1 = GXt_char1 ;
         GXt_char1 = AV17Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         armorden_impl.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit2 = GXt_char1 ;
         GXt_char1 = AV18Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         armorden_impl.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit3 = GXt_char1 ;
         /* Using cursor P07I82 */
         pr_default.execute(0, new Object[] {AV8EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P07I82_A396EmprCod[0] ;
            A407EmprNom = P07I82_A407EmprNom[0] ;
            n407EmprNom = P07I82_n407EmprNom[0] ;
            AV19NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV12Tipo, httpContext.getMessage( "D", "")) == 0 )
         {
            /* Using cursor P07I83 */
            pr_default.execute(1, new Object[] {AV8EmprCod, Integer.valueOf(AV21OMCod1)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A9425OMCod = P07I83_A9425OMCod[0] ;
               A396EmprCod = P07I83_A396EmprCod[0] ;
               A9445OMEst = P07I83_A9445OMEst[0] ;
               A9429PMCod = P07I83_A9429PMCod[0] ;
               n9429PMCod = P07I83_n9429PMCod[0] ;
               AV20OMEstDsc = ((GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", ""))==0) ? httpContext.getMessage( "Pendiente", "") : httpContext.getMessage( "Realizado", "")) ;
               AV26tipoorden = ((A9429PMCod>0) ? httpContext.getMessage( "Preventivo", "") : httpContext.getMessage( "Correctivo", "")) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
         if ( AV10Tot == 1 )
         {
            AV14BarCode1 = httpContext.getMessage( "M", "") + GXutil.trim( GXutil.str( AV21OMCod1, 8, 0)) ;
            h7I80( false, 58) ;
            getPrinter().GxAttris("3 of 9 Barcode", 36, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14BarCode1, "")), 173, Gx_line+0, 612, Gx_line+39, 1+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+58) ;
         }
         h7I80( false, 82) ;
         getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit0, "")), 14, Gx_line+50, 307, Gx_line+70, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit1, "")), 528, Gx_line+10, 592, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 596, Gx_line+10, 647, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit2, "")), 650, Gx_line+10, 701, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 704, Gx_line+10, 797, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit3, "")), 636, Gx_line+52, 712, Gx_line+69, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 718, Gx_line+52, 745, Gx_line+68, 2, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19NomEmp, "")), 14, Gx_line+9, 234, Gx_line+29, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Pgmname, "")), 492, Gx_line+52, 618, Gx_line+63, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(13, Gx_line+81, 812, Gx_line+81, 2, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("/", 749, Gx_line+52, 756, Gx_line+68, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 760, Gx_line+52, 787, Gx_line+68, 2, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20OMEstDsc, "")), 356, Gx_line+40, 472, Gx_line+71, 1+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26tipoorden, "")), 275, Gx_line+0, 505, Gx_line+31, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+82) ;
         AV11i = (short)(0) ;
         while ( AV11i < AV10Tot )
         {
            AV11i = (short)(AV11i+1) ;
            h7I80( false, 0) ;
            GXv_char2[0] = AV8EmprCod ;
            GXv_int3[0] = AV9OMCod[AV11i-1] ;
            GXv_char4[0] = AV12Tipo ;
            GXv_char5[0] = Gx_out ;
            GXv_int6[0] = Gx_page ;
            GXv_int7[0] = Gx_line ;
            new app.mantenimientomaquina.rmordenes_bck(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, getPrinter()) ;
            armorden_impl.this.AV8EmprCod = GXv_char2[0] ;
            armorden_impl.this.AV9OMCod[AV11i-1] = GXv_int3[0] ;
            armorden_impl.this.AV12Tipo = GXv_char4[0] ;
            armorden_impl.this.Gx_out = GXv_char5[0] ;
            armorden_impl.this.Gx_page = GXv_int6[0] ;
            armorden_impl.this.Gx_line = GXv_int7[0] ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7I80( true, 0) ;
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

   public void h7I80( boolean bFoot ,
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
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("3 of 9 Barcode", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
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
      AV8EmprCod = "" ;
      AV23OMCodCollectionJSon = "" ;
      AV12Tipo = "" ;
      AV22OMCodCollection = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV9OMCod = new int[9999] ;
      AV15Lit0 = "" ;
      AV31Pgmdesc = "" ;
      AV16Lit1 = "" ;
      AV17Lit2 = "" ;
      AV18Lit3 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P07I82_A396EmprCod = new String[] {""} ;
      P07I82_A407EmprNom = new String[] {""} ;
      P07I82_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV19NomEmp = "" ;
      P07I83_A9425OMCod = new int[1] ;
      P07I83_A396EmprCod = new String[] {""} ;
      P07I83_A9445OMEst = new String[] {""} ;
      P07I83_A9429PMCod = new int[1] ;
      P07I83_n9429PMCod = new boolean[] {false} ;
      A9445OMEst = "" ;
      AV20OMEstDsc = "" ;
      AV26tipoorden = "" ;
      AV14BarCode1 = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV27Pgmname = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.armorden__default(),
         new Object[] {
             new Object[] {
            P07I82_A396EmprCod, P07I82_A407EmprNom, P07I82_n407EmprNom
            }
            , new Object[] {
            P07I83_A9425OMCod, P07I83_A396EmprCod, P07I83_A9445OMEst, P07I83_A9429PMCod, P07I83_n9429PMCod
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV31Pgmdesc = httpContext.getMessage( "Orden de Mantenimiento", "") ;
      AV27Pgmname = "MantenimientoMaquina.ARMOrden" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV31Pgmdesc = httpContext.getMessage( "Orden de Mantenimiento", "") ;
      Gx_err = (short)(0) ;
      AV27Pgmname = "MantenimientoMaquina.ARMOrden" ;
   }

   private short gxcookieaux ;
   private short AV10Tot ;
   private short AV11i ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV30GXV1 ;
   private int AV25ItemOMCod ;
   private int AV21OMCod1 ;
   private int AV9OMCod[] ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int Gx_OldLine ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV8EmprCod ;
   private String AV12Tipo ;
   private String AV15Lit0 ;
   private String AV31Pgmdesc ;
   private String AV16Lit1 ;
   private String AV17Lit2 ;
   private String AV18Lit3 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV19NomEmp ;
   private String A9445OMEst ;
   private String AV20OMEstDsc ;
   private String AV26tipoorden ;
   private String AV14BarCode1 ;
   private String Gx_time ;
   private String AV27Pgmname ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n9429PMCod ;
   private String AV23OMCodCollectionJSon ;
   private GXSimpleCollection<Integer> AV22OMCodCollection ;
   private IDataStoreProvider pr_default ;
   private String[] P07I82_A396EmprCod ;
   private String[] P07I82_A407EmprNom ;
   private boolean[] P07I82_n407EmprNom ;
   private int[] P07I83_A9425OMCod ;
   private String[] P07I83_A396EmprCod ;
   private String[] P07I83_A9445OMEst ;
   private int[] P07I83_A9429PMCod ;
   private boolean[] P07I83_n9429PMCod ;
}

final  class armorden__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07I82", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07I83", "SELECT OMCod, EmprCod, OMEst, PMCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
      }
   }

}

