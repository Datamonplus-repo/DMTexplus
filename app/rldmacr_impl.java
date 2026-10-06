package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rldmacr_impl extends GXWebReport
{
   public rldmacr_impl( com.genexus.internet.HttpContext context )
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
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV16PProc = httpContext.GetPar( "PProc") ;
            AV17UProc = httpContext.GetPar( "UProc") ;
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
         GXt_char1 = AV19Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN090_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit0 = GXt_char1 ;
         GXt_char1 = AV20Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit1 = GXt_char1 ;
         GXt_char1 = AV21Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit2 = GXt_char1 ;
         GXt_char1 = AV22Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit3 = GXt_char1 ;
         GXt_char1 = AV23Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV41Pgmname, (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit4 = GXt_char1 ;
         GXt_char1 = AV24Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2454_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit5 = GXt_char1 ;
         GXt_char1 = AV25Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2462_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit6 = GXt_char1 ;
         GXt_char1 = AV26Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2283_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit7 = GXt_char1 ;
         GXt_char1 = AV27Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2310_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit8 = GXt_char1 ;
         GXt_char1 = AV28Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN185_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit9 = GXt_char1 ;
         GXt_char1 = AV29Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2095_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit10 = GXt_char1 ;
         GXt_char1 = AV30Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2525_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit11 = GXt_char1 ;
         GXt_char1 = AV31Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN188_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit12 = GXt_char1 ;
         GXt_char1 = AV32Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN368_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit13 = GXt_char1 ;
         GXt_char1 = AV33Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit20 = GXt_char1 ;
         GXt_char1 = AV34Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT118_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit21 = GXt_char1 ;
         GXt_char1 = AV35Lit22 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
         rldmacr_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit22 = GXutil.trim( GXt_char1) + httpContext.getMessage( "s", "") ;
         GXt_int3 = AV36Ftlins ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FTLINS", ""), GXv_int4) ;
         rldmacr_impl.this.GXt_int3 = GXv_int4[0] ;
         AV36Ftlins = GXt_int3 ;
         /* Using cursor P067C2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P067C2_A407EmprNom[0] ;
            n407EmprNom = P067C2_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P067C3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PProc, AV17UProc});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1514MacProCod = P067C3_A1514MacProCod[0] ;
            A6096MacNumPrg = P067C3_A6096MacNumPrg[0] ;
            A1515MacProDsc = P067C3_A1515MacProDsc[0] ;
            h67C0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1514MacProCod, "")), 9, Gx_line+0, 54, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), 61, Gx_line+0, 208, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6096MacNumPrg), "ZZZZ9")), 278, Gx_line+0, 315, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            /* Using cursor P067C4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A1514MacProCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A7787MacPrgNum = P067C4_A7787MacPrgNum[0] ;
               A766ProForDsc = P067C4_A766ProForDsc[0] ;
               A764ProForCod = P067C4_A764ProForCod[0] ;
               A1517MacProLin = P067C4_A1517MacProLin[0] ;
               A766ProForDsc = P067C4_A766ProForDsc[0] ;
               h67C0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 393, Gx_line+0, 438, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 454, Gx_line+0, 674, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7787MacPrgNum), "ZZ9")), 656, Gx_line+1, 679, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               if ( AV36Ftlins == 1 )
               {
                  AV37Proforcod = A764ProForCod ;
                  /* Execute user subroutine: 'LPROFO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(1);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  h67C0( false, 17) ;
                  getPrinter().GxDrawLine(328, Gx_line+10, 741, Gx_line+10, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h67C0( false, 19) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+19) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h67C0( true, 0) ;
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
      /* 'LPROFO' Routine */
      returnInSub = false ;
      /* Using cursor P067C5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV37Proforcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A490ForPrdUMe = P067C5_A490ForPrdUMe[0] ;
         A764ProForCod = P067C5_A764ProForCod[0] ;
         A762ProForCan = P067C5_A762ProForCan[0] ;
         A488ForPrdDsc = P067C5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P067C5_n488ForPrdDsc[0] ;
         A765ProForDes = P067C5_A765ProForDes[0] ;
         A770ProForPrd = P067C5_A770ProForPrd[0] ;
         A767ProForLin = P067C5_A767ProForLin[0] ;
         A488ForPrdDsc = P067C5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P067C5_n488ForPrdDsc[0] ;
         AV38Proforcan = A762ProForCan ;
         h67C0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 328, Gx_line+0, 373, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 381, Gx_line+0, 572, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38Proforcan, "ZZZZZZ.ZZZ")), 577, Gx_line+0, 666, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 670, Gx_line+0, 707, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h67C0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 7, Gx_line+9, 196, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 295, Gx_line+9, 359, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 378, Gx_line+9, 437, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit2, "")), 516, Gx_line+9, 567, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 606, Gx_line+9, 665, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 516, Gx_line+38, 592, Gx_line+55, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 621, Gx_line+38, 666, Gx_line+55, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+0, 685, Gx_line+0, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+59, 744, Gx_line+59, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Pgmname, "")), 357, Gx_line+38, 577, Gx_line+55, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+109, 223, Gx_line+109, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(393, Gx_line+109, 611, Gx_line+109, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(230, Gx_line+109, 355, Gx_line+109, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit20, "")), 9, Gx_line+88, 73, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit21, "")), 230, Gx_line+88, 356, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit22, "")), 393, Gx_line+88, 488, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit4, "")), 7, Gx_line+36, 258, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Prog", ""), 642, Gx_line+88, 687, Gx_line+104, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(642, Gx_line+108, 686, Gx_line+108, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+114) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV15ImpCod = "" ;
      AV16PProc = "" ;
      AV17UProc = "" ;
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV41Pgmname = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV29Lit10 = "" ;
      AV30Lit11 = "" ;
      AV31Lit12 = "" ;
      AV32Lit13 = "" ;
      AV33Lit20 = "" ;
      AV34Lit21 = "" ;
      AV35Lit22 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P067C2_A396EmprCod = new String[] {""} ;
      P067C2_A407EmprNom = new String[] {""} ;
      P067C2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      P067C3_A396EmprCod = new String[] {""} ;
      P067C3_A1514MacProCod = new String[] {""} ;
      P067C3_A6096MacNumPrg = new int[1] ;
      P067C3_A1515MacProDsc = new String[] {""} ;
      A1514MacProCod = "" ;
      A1515MacProDsc = "" ;
      P067C4_A396EmprCod = new String[] {""} ;
      P067C4_A1514MacProCod = new String[] {""} ;
      P067C4_A7787MacPrgNum = new short[1] ;
      P067C4_A766ProForDsc = new String[] {""} ;
      P067C4_A764ProForCod = new String[] {""} ;
      P067C4_A1517MacProLin = new short[1] ;
      A766ProForDsc = "" ;
      A764ProForCod = "" ;
      AV37Proforcod = "" ;
      P067C5_A490ForPrdUMe = new byte[1] ;
      P067C5_A396EmprCod = new String[] {""} ;
      P067C5_A764ProForCod = new String[] {""} ;
      P067C5_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P067C5_A488ForPrdDsc = new String[] {""} ;
      P067C5_n488ForPrdDsc = new boolean[] {false} ;
      P067C5_A765ProForDes = new String[] {""} ;
      P067C5_A770ProForPrd = new String[] {""} ;
      P067C5_A767ProForLin = new short[1] ;
      A762ProForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A765ProForDes = "" ;
      A770ProForPrd = "" ;
      AV38Proforcan = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rldmacr__default(),
         new Object[] {
             new Object[] {
            P067C2_A396EmprCod, P067C2_A407EmprNom, P067C2_n407EmprNom
            }
            , new Object[] {
            P067C3_A396EmprCod, P067C3_A1514MacProCod, P067C3_A6096MacNumPrg, P067C3_A1515MacProDsc
            }
            , new Object[] {
            P067C4_A396EmprCod, P067C4_A1514MacProCod, P067C4_A7787MacPrgNum, P067C4_A766ProForDsc, P067C4_A764ProForCod, P067C4_A1517MacProLin
            }
            , new Object[] {
            P067C5_A490ForPrdUMe, P067C5_A396EmprCod, P067C5_A764ProForCod, P067C5_A762ProForCan, P067C5_A488ForPrdDsc, P067C5_n488ForPrdDsc, P067C5_A765ProForDes, P067C5_A770ProForPrd, P067C5_A767ProForLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV41Pgmname = "RLDMACR" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV41Pgmname = "RLDMACR" ;
      Gx_err = (short)(0) ;
   }

   private byte AV36Ftlins ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short A7787MacPrgNum ;
   private short A1517MacProLin ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A6096MacNumPrg ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV38Proforcan ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PProc ;
   private String AV17UProc ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV41Pgmname ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV29Lit10 ;
   private String AV30Lit11 ;
   private String AV31Lit12 ;
   private String AV32Lit13 ;
   private String AV33Lit20 ;
   private String AV34Lit21 ;
   private String AV35Lit22 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A1514MacProCod ;
   private String A1515MacProDsc ;
   private String A766ProForDsc ;
   private String A764ProForCod ;
   private String AV37Proforcod ;
   private String A488ForPrdDsc ;
   private String A765ProForDes ;
   private String A770ProForPrd ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P067C2_A396EmprCod ;
   private String[] P067C2_A407EmprNom ;
   private boolean[] P067C2_n407EmprNom ;
   private String[] P067C3_A396EmprCod ;
   private String[] P067C3_A1514MacProCod ;
   private int[] P067C3_A6096MacNumPrg ;
   private String[] P067C3_A1515MacProDsc ;
   private String[] P067C4_A396EmprCod ;
   private String[] P067C4_A1514MacProCod ;
   private short[] P067C4_A7787MacPrgNum ;
   private String[] P067C4_A766ProForDsc ;
   private String[] P067C4_A764ProForCod ;
   private short[] P067C4_A1517MacProLin ;
   private byte[] P067C5_A490ForPrdUMe ;
   private String[] P067C5_A396EmprCod ;
   private String[] P067C5_A764ProForCod ;
   private java.math.BigDecimal[] P067C5_A762ProForCan ;
   private String[] P067C5_A488ForPrdDsc ;
   private boolean[] P067C5_n488ForPrdDsc ;
   private String[] P067C5_A765ProForDes ;
   private String[] P067C5_A770ProForPrd ;
   private short[] P067C5_A767ProForLin ;
}

final  class rldmacr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P067C2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P067C3", "SELECT EmprCod, MacProCod, MacNumPrg, MacProDsc FROM TXPCMACPR WHERE (EmprCod = ? and MacProCod >= ?) AND (MacProCod <= ?) ORDER BY EmprCod, MacProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P067C4", "SELECT T1.EmprCod, T1.MacProCod, T1.MacPrgNum, T2.ProForDsc, T1.ProForCod, T1.MacProLin FROM (TXPLMACPR T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.MacProCod = ? ORDER BY T1.EmprCod, T1.MacProCod, T1.MacProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P067C5", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForCan, T2.ForPrdDsc, T1.ProForDes, T1.ProForPrd, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

