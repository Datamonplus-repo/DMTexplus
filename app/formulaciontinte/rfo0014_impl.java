package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfo0014_impl extends GXWebReport
{
   public rfo0014_impl( com.genexus.internet.HttpContext context )
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
            AV16PProc = httpContext.GetPar( "PProc") ;
            AV17UProc = httpContext.GetPar( "UProc") ;
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV35ProForAct = httpContext.GetPar( "ProForAct") ;
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
         Gx_out = "SCR" ;
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
         GXt_int1 = AV34Tintutex ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int2) ;
         rfo0014_impl.this.GXt_int1 = GXv_int2[0] ;
         AV34Tintutex = GXt_int1 ;
         GXt_char3 = AV19Lit0 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN090_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV19Lit0 = GXt_char3 ;
         GXt_char3 = AV20Lit1 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV20Lit1 = GXt_char3 ;
         GXt_char3 = AV21Lit2 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV21Lit2 = GXt_char3 ;
         GXt_char3 = AV22Lit3 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV22Lit3 = GXt_char3 ;
         GXt_char3 = AV23Lit4 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV23Lit4 = GXt_char3 ;
         GXt_char3 = AV24Lit5 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2283_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV24Lit5 = GXt_char3 ;
         GXt_char3 = AV25Lit6 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2468_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV25Lit6 = GXt_char3 ;
         GXt_char3 = AV26Lit7 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1370_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV26Lit7 = GXt_char3 ;
         GXt_char3 = AV27Lit8 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT118_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV27Lit8 = GXt_char3 ;
         GXt_char3 = AV28Lit9 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT119_", ""), (byte)(99), GXv_char4) ;
         rfo0014_impl.this.GXt_char3 = GXv_char4[0] ;
         AV28Lit9 = GXt_char3 ;
         /* Using cursor P06N22 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06N22_A407EmprNom[0] ;
            n407EmprNom = P06N22_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV16PProc ,
                                              AV17UProc ,
                                              A764ProForCod ,
                                              A13133ProForAct ,
                                              AV35ProForAct ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06N23 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV35ProForAct, AV16PProc, AV17UProc});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13133ProForAct = P06N23_A13133ProForAct[0] ;
            A764ProForCod = P06N23_A764ProForCod[0] ;
            A769ProForMat = P06N23_A769ProForMat[0] ;
            A771ProForTie = P06N23_A771ProForTie[0] ;
            A772ProForTmx = P06N23_A772ProForTmx[0] ;
            A2392ProNumPro = P06N23_A2392ProNumPro[0] ;
            A2393ProNumRec = P06N23_A2393ProNumRec[0] ;
            A766ProForDsc = P06N23_A766ProForDsc[0] ;
            A4715ProForDsc2 = P06N23_A4715ProForDsc2[0] ;
            if ( AV34Tintutex == 0 )
            {
               h6N20( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 14, Gx_line+0, 59, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 65, Gx_line+0, 285, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9")), 689, Gx_line+0, 726, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9")), 584, Gx_line+0, 621, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9")), 469, Gx_line+0, 499, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")), 380, Gx_line+0, 410, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A769ProForMat, "")), 229, Gx_line+0, 347, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               if ( GXutil.strcmp(A4715ProForDsc2, " ") != 0 )
               {
                  h6N20( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), 65, Gx_line+2, 358, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
            }
            else
            {
               h6N20( false, 21) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 14, Gx_line+0, 78, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 95, Gx_line+0, 409, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), 355, Gx_line+0, 773, Gx_line+20, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6N20( true, 0) ;
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

   public void h6N20( boolean bFoot ,
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
               if ( AV34Tintutex == 0 )
               {
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 7, Gx_line+17, 227, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 408, Gx_line+17, 445, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 459, Gx_line+17, 518, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit2, "")), 636, Gx_line+17, 666, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 673, Gx_line+17, 732, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit0, "")), 7, Gx_line+44, 147, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 636, Gx_line+44, 681, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 688, Gx_line+44, 733, Gx_line+61, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit4, "")), 14, Gx_line+82, 88, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit5, "")), 229, Gx_line+82, 310, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit6, "")), 366, Gx_line+82, 425, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit7, "")), 443, Gx_line+82, 523, Gx_line+98, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit8, "")), 541, Gx_line+82, 651, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit9, "")), 659, Gx_line+82, 755, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Pgmname, "")), 408, Gx_line+44, 628, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(0, Gx_line+70, 772, Gx_line+70, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(14, Gx_line+102, 211, Gx_line+102, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(0, Gx_line+5, 772, Gx_line+5, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(229, Gx_line+102, 346, Gx_line+102, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(366, Gx_line+102, 424, Gx_line+102, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(443, Gx_line+102, 523, Gx_line+102, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(541, Gx_line+102, 650, Gx_line+102, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(659, Gx_line+102, 754, Gx_line+102, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+104) ;
               }
               else
               {
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 7, Gx_line+11, 227, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 408, Gx_line+11, 445, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 459, Gx_line+11, 518, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit2, "")), 636, Gx_line+11, 666, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 673, Gx_line+11, 732, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit0, "")), 7, Gx_line+39, 147, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 636, Gx_line+39, 681, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 688, Gx_line+39, 733, Gx_line+56, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit4, "")), 14, Gx_line+77, 88, Gx_line+94, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Pgmname, "")), 408, Gx_line+39, 628, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(0, Gx_line+65, 772, Gx_line+65, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(14, Gx_line+97, 736, Gx_line+97, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(0, Gx_line+0, 772, Gx_line+0, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+117) ;
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
      AV16PProc = "" ;
      AV17UProc = "" ;
      AV15ImpCod = "" ;
      AV35ProForAct = "" ;
      GXv_int2 = new byte[1] ;
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P06N22_A396EmprCod = new String[] {""} ;
      P06N22_A407EmprNom = new String[] {""} ;
      P06N22_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      A764ProForCod = "" ;
      A13133ProForAct = "" ;
      P06N23_A396EmprCod = new String[] {""} ;
      P06N23_A13133ProForAct = new String[] {""} ;
      P06N23_A764ProForCod = new String[] {""} ;
      P06N23_A769ProForMat = new String[] {""} ;
      P06N23_A771ProForTie = new short[1] ;
      P06N23_A772ProForTmx = new short[1] ;
      P06N23_A2392ProNumPro = new int[1] ;
      P06N23_A2393ProNumRec = new int[1] ;
      P06N23_A766ProForDsc = new String[] {""} ;
      P06N23_A4715ProForDsc2 = new String[] {""} ;
      A769ProForMat = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV43Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.rfo0014__default(),
         new Object[] {
             new Object[] {
            P06N22_A396EmprCod, P06N22_A407EmprNom, P06N22_n407EmprNom
            }
            , new Object[] {
            P06N23_A396EmprCod, P06N23_A13133ProForAct, P06N23_A764ProForCod, P06N23_A769ProForMat, P06N23_A771ProForTie, P06N23_A772ProForTmx, P06N23_A2392ProNumPro, P06N23_A2393ProNumRec, P06N23_A766ProForDsc, P06N23_A4715ProForDsc2
            }
         }
      );
      AV43Pgmname = "FormulacionTinte.RFO0014" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV43Pgmname = "FormulacionTinte.RFO0014" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV34Tintutex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short gxcookieaux ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A2392ProNumPro ;
   private int A2393ProNumRec ;
   private int Gx_OldLine ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV16PProc ;
   private String AV17UProc ;
   private String AV15ImpCod ;
   private String AV35ProForAct ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A764ProForCod ;
   private String A13133ProForAct ;
   private String A769ProForMat ;
   private String A766ProForDsc ;
   private String A4715ProForDsc2 ;
   private String Gx_time ;
   private String AV43Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private IDataStoreProvider pr_default ;
   private String[] P06N22_A396EmprCod ;
   private String[] P06N22_A407EmprNom ;
   private boolean[] P06N22_n407EmprNom ;
   private String[] P06N23_A396EmprCod ;
   private String[] P06N23_A13133ProForAct ;
   private String[] P06N23_A764ProForCod ;
   private String[] P06N23_A769ProForMat ;
   private short[] P06N23_A771ProForTie ;
   private short[] P06N23_A772ProForTmx ;
   private int[] P06N23_A2392ProNumPro ;
   private int[] P06N23_A2393ProNumRec ;
   private String[] P06N23_A766ProForDsc ;
   private String[] P06N23_A4715ProForDsc2 ;
}

final  class rfo0014__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06N23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV16PProc ,
                                          String AV17UProc ,
                                          String A764ProForCod ,
                                          String A13133ProForAct ,
                                          String AV35ProForAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[4];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, ProForAct, ProForCod, ProForMat, ProForTie, ProForTmx, ProNumPro, ProNumRec, ProForDsc, ProForDsc2 FROM TXPCPROFO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ProForAct = ?)");
      if ( ! (GXutil.strcmp("", AV16PProc)==0) )
      {
         addWhere(sWhereString, "(ProForCod >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17UProc)==0) )
      {
         addWhere(sWhereString, "(ProForCod <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, ProForCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P06N23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06N22", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06N23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               return;
      }
   }

}

