package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rco0008_impl extends GXWebReport
{
   public rco0008_impl( com.genexus.internet.HttpContext context )
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
            AV16PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV17UProv = (int)(GXutil.lval( httpContext.GetPar( "UProv"))) ;
            AV42Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
            AV43Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
            AV41LinSdo0 = httpContext.GetPar( "LinSdo0") ;
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
         GXt_char1 = AV22Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2267_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit0 = GXt_char1 ;
         GXt_char1 = AV23Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit1 = GXt_char1 ;
         GXt_char1 = AV24Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit2 = GXt_char1 ;
         GXt_char1 = AV25Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit3 = GXt_char1 ;
         GXt_char1 = AV26Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN228_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit4 = GXt_char1 ;
         GXt_char1 = AV27Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2177_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit5 = GXt_char1 ;
         GXt_char1 = AV28Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2173_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit6 = GXt_char1 ;
         GXt_char1 = AV29Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN185_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit7 = GXt_char1 ;
         GXt_char1 = AV30Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2404_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit8 = GXt_char1 ;
         GXt_char1 = AV31Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit9 = GXt_char1 ;
         GXt_char1 = AV32Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2516_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit10 = GXt_char1 ;
         GXt_char1 = AV33Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2521_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit11 = GXt_char1 ;
         GXt_char1 = AV34Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2355_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit12 = GXt_char1 ;
         GXt_char1 = AV35Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN370_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit13 = GXt_char1 ;
         GXt_char1 = AV36Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2537_", ""), (byte)(99), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit14 = GXt_char1 ;
         GXt_char1 = AV37Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(10), GXv_char2) ;
         rco0008_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit15 = GXt_char1 ;
         /* Using cursor P06NT2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06NT2_A407EmprNom[0] ;
            n407EmprNom = P06NT2_n407EmprNom[0] ;
            AV19NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06NT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PProv), Integer.valueOf(AV17UProv)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A795PrvNum = P06NT3_A795PrvNum[0] ;
            A794PrvNom = P06NT3_A794PrvNom[0] ;
            n794PrvNom = P06NT3_n794PrvNom[0] ;
            AV38LisPrv = (byte)(0) ;
            /* Using cursor P06NT4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), AV42Fec1, AV43Fec2, Integer.valueOf(AV16PProv), Integer.valueOf(AV17UProv)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A658PedCod = P06NT4_A658PedCod[0] ;
               A3915EmpNumDec = P06NT4_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P06NT4_n3915EmpNumDec[0] ;
               A667PedSit = P06NT4_A667PedSit[0] ;
               A661PedFec = P06NT4_A661PedFec[0] ;
               A662PedFecEnt = P06NT4_A662PedFecEnt[0] ;
               A3915EmpNumDec = P06NT4_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P06NT4_n3915EmpNumDec[0] ;
               if ( AV38LisPrv == 0 )
               {
                  h6NT0( false, 33) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 88, Gx_line+0, 133, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 139, Gx_line+0, 359, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit15, "")), 7, Gx_line+0, 81, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+33) ;
                  AV38LisPrv = (byte)(1) ;
               }
               h6NT0( false, 67) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 131, Gx_line+0, 139, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 292, Gx_line+0, 300, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 503, Gx_line+0, 511, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit4, "")), 88, Gx_line+0, 133, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 146, Gx_line+0, 205, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit5, "")), 226, Gx_line+0, 293, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A661PedFec, "99/99/99"), 306, Gx_line+0, 365, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit6, "")), 394, Gx_line+0, 504, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A662PedFecEnt, "99/99/99"), 518, Gx_line+0, 577, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("------ -------------- -------------------------- --------- --------- ---------  ------------ -----------", 146, Gx_line+50, 905, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit7, "")), 146, Gx_line+33, 191, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit8, "")), 197, Gx_line+33, 271, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit9, "")), 306, Gx_line+33, 387, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit10, "")), 518, Gx_line+33, 570, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit11, "")), 591, Gx_line+33, 643, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit12, "")), 656, Gx_line+33, 715, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit13, "")), 773, Gx_line+33, 818, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit14, "")), 846, Gx_line+33, 898, Gx_line+50, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+67) ;
               AV39LisPrd = (byte)(0) ;
               /* Using cursor P06NT5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A657PedCanEnt = P06NT5_A657PedCanEnt[0] ;
                  A669PedUni = P06NT5_A669PedUni[0] ;
                  A665PedPre = P06NT5_A665PedPre[0] ;
                  A659PedCum = P06NT5_A659PedCum[0] ;
                  A718PrdNom = P06NT5_A718PrdNom[0] ;
                  A728PrdRefPrv = P06NT5_A728PrdRefPrv[0] ;
                  A719PrdNum = P06NT5_A719PrdNum[0] ;
                  A718PrdNom = P06NT5_A718PrdNom[0] ;
                  A728PrdRefPrv = P06NT5_A728PrdRefPrv[0] ;
                  AV20UniPend = A669PedUni.subtract(A657PedCanEnt) ;
                  if ( A3915EmpNumDec == 0 )
                  {
                     AV21VPend = AV20UniPend.multiply(A665PedPre) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        AV21VPend = GXutil.roundDecimal( AV20UniPend.multiply(A665PedPre), 2) ;
                     }
                  }
                  if ( ( ( GXutil.strcmp(AV41LinSdo0, httpContext.getMessage( "I", "")) == 0 ) ) || ( ( GXutil.strcmp(AV41LinSdo0, httpContext.getMessage( "E", "")) == 0 ) && ( AV20UniPend.doubleValue() != 0 ) && ( GXutil.strcmp(A659PedCum, httpContext.getMessage( "S", "")) != 0 ) ) )
                  {
                     h6NT0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 146, Gx_line+0, 191, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), 197, Gx_line+0, 417, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 306, Gx_line+0, 497, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A669PedUni, "ZZZZZ9.99")), 503, Gx_line+0, 570, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A657PedCanEnt, "ZZZZZ9.99")), 576, Gx_line+0, 643, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20UniPend, "ZZZZZ9.99")), 649, Gx_line+0, 716, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A665PedPre, "ZZZZZZZ9.999")), 729, Gx_line+0, 832, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21VPend, "ZZZZZZZ9.99")), 824, Gx_line+0, 905, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     AV39LisPrd = (byte)(1) ;
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               if ( AV39LisPrd == 1 )
               {
                  h6NT0( false, 17) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV38LisPrv == 1 )
            {
               h6NT0( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6NT0( true, 0) ;
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

   public void h6NT0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 700, Gx_line+17, 708, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 853, Gx_line+17, 861, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19NomEmp, "")), 15, Gx_line+17, 235, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit1, "")), 656, Gx_line+17, 693, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 715, Gx_line+17, 774, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit2, "")), 809, Gx_line+17, 839, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 875, Gx_line+17, 934, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 853, Gx_line+50, 861, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit0, "")), 15, Gx_line+50, 308, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit3, "")), 809, Gx_line+50, 854, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 875, Gx_line+50, 920, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Pgmname, "")), 656, Gx_line+50, 876, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("===================================================================================================================================", 0, Gx_line+0, 956, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("===================================================================================================================================", 0, Gx_line+67, 956, Gx_line+83, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+82) ;
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
   }

   public void add_metrics0( )
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
      AV42Fec1 = GXutil.nullDate() ;
      AV43Fec2 = GXutil.nullDate() ;
      AV41LinSdo0 = "" ;
      AV22Lit0 = "" ;
      AV23Lit1 = "" ;
      AV24Lit2 = "" ;
      AV25Lit3 = "" ;
      AV26Lit4 = "" ;
      AV27Lit5 = "" ;
      AV28Lit6 = "" ;
      AV29Lit7 = "" ;
      AV30Lit8 = "" ;
      AV31Lit9 = "" ;
      AV32Lit10 = "" ;
      AV33Lit11 = "" ;
      AV34Lit12 = "" ;
      AV35Lit13 = "" ;
      AV36Lit14 = "" ;
      AV37Lit15 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06NT2_A396EmprCod = new String[] {""} ;
      P06NT2_A407EmprNom = new String[] {""} ;
      P06NT2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV19NomEmp = "" ;
      P06NT3_A396EmprCod = new String[] {""} ;
      P06NT3_A795PrvNum = new int[1] ;
      P06NT3_A794PrvNom = new String[] {""} ;
      P06NT3_n794PrvNom = new boolean[] {false} ;
      A794PrvNom = "" ;
      P06NT4_A396EmprCod = new String[] {""} ;
      P06NT4_A795PrvNum = new int[1] ;
      P06NT4_A658PedCod = new int[1] ;
      P06NT4_A3915EmpNumDec = new byte[1] ;
      P06NT4_n3915EmpNumDec = new boolean[] {false} ;
      P06NT4_A667PedSit = new String[] {""} ;
      P06NT4_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06NT4_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      A667PedSit = "" ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      P06NT5_A396EmprCod = new String[] {""} ;
      P06NT5_A658PedCod = new int[1] ;
      P06NT5_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NT5_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NT5_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NT5_A659PedCum = new String[] {""} ;
      P06NT5_A718PrdNom = new String[] {""} ;
      P06NT5_A728PrdRefPrv = new String[] {""} ;
      P06NT5_A719PrdNum = new String[] {""} ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      A718PrdNom = "" ;
      A728PrdRefPrv = "" ;
      A719PrdNum = "" ;
      AV20UniPend = DecimalUtil.ZERO ;
      AV21VPend = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV50Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rco0008__default(),
         new Object[] {
             new Object[] {
            P06NT2_A396EmprCod, P06NT2_A407EmprNom, P06NT2_n407EmprNom
            }
            , new Object[] {
            P06NT3_A396EmprCod, P06NT3_A795PrvNum, P06NT3_A794PrvNom, P06NT3_n794PrvNom
            }
            , new Object[] {
            P06NT4_A396EmprCod, P06NT4_A795PrvNum, P06NT4_A658PedCod, P06NT4_A3915EmpNumDec, P06NT4_n3915EmpNumDec, P06NT4_A667PedSit, P06NT4_A661PedFec, P06NT4_A662PedFecEnt
            }
            , new Object[] {
            P06NT5_A396EmprCod, P06NT5_A658PedCod, P06NT5_A657PedCanEnt, P06NT5_A669PedUni, P06NT5_A665PedPre, P06NT5_A659PedCum, P06NT5_A718PrdNom, P06NT5_A728PrdRefPrv, P06NT5_A719PrdNum
            }
         }
      );
      AV50Pgmname = "RCO0008" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV50Pgmname = "RCO0008" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV38LisPrv ;
   private byte A3915EmpNumDec ;
   private byte AV39LisPrd ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV16PProv ;
   private int AV17UProv ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int A658PedCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal AV20UniPend ;
   private java.math.BigDecimal AV21VPend ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV41LinSdo0 ;
   private String AV22Lit0 ;
   private String AV23Lit1 ;
   private String AV24Lit2 ;
   private String AV25Lit3 ;
   private String AV26Lit4 ;
   private String AV27Lit5 ;
   private String AV28Lit6 ;
   private String AV29Lit7 ;
   private String AV30Lit8 ;
   private String AV31Lit9 ;
   private String AV32Lit10 ;
   private String AV33Lit11 ;
   private String AV34Lit12 ;
   private String AV35Lit13 ;
   private String AV36Lit14 ;
   private String AV37Lit15 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV19NomEmp ;
   private String A794PrvNom ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String A718PrdNom ;
   private String A728PrdRefPrv ;
   private String A719PrdNum ;
   private String Gx_time ;
   private String AV50Pgmname ;
   private java.util.Date AV42Fec1 ;
   private java.util.Date AV43Fec2 ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean n3915EmpNumDec ;
   private IDataStoreProvider pr_default ;
   private String[] P06NT2_A396EmprCod ;
   private String[] P06NT2_A407EmprNom ;
   private boolean[] P06NT2_n407EmprNom ;
   private String[] P06NT3_A396EmprCod ;
   private int[] P06NT3_A795PrvNum ;
   private String[] P06NT3_A794PrvNom ;
   private boolean[] P06NT3_n794PrvNom ;
   private String[] P06NT4_A396EmprCod ;
   private int[] P06NT4_A795PrvNum ;
   private int[] P06NT4_A658PedCod ;
   private byte[] P06NT4_A3915EmpNumDec ;
   private boolean[] P06NT4_n3915EmpNumDec ;
   private String[] P06NT4_A667PedSit ;
   private java.util.Date[] P06NT4_A661PedFec ;
   private java.util.Date[] P06NT4_A662PedFecEnt ;
   private String[] P06NT5_A396EmprCod ;
   private int[] P06NT5_A658PedCod ;
   private java.math.BigDecimal[] P06NT5_A657PedCanEnt ;
   private java.math.BigDecimal[] P06NT5_A669PedUni ;
   private java.math.BigDecimal[] P06NT5_A665PedPre ;
   private String[] P06NT5_A659PedCum ;
   private String[] P06NT5_A718PrdNom ;
   private String[] P06NT5_A728PrdRefPrv ;
   private String[] P06NT5_A719PrdNum ;
}

final  class rco0008__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06NT2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06NT3", "SELECT EmprCod, PrvNum, PrvNom FROM TXPPRVGEN WHERE (EmprCod = ? and PrvNum >= ?) AND (PrvNum <= ?) ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NT4", "SELECT T1.EmprCod, T1.PrvNum, T1.PedCod, T2.EmpNumDec, T1.PedSit, T1.PedFec, T1.PedFecEnt FROM (TXPCPEDID T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE (T1.EmprCod = ? and T1.PrvNum = ?) AND (T1.PedFec >= ?) AND (T1.PedFec <= ?) AND (T1.PrvNum >= ? and T1.PrvNum <= ?) AND (T1.PedSit = 'N') ORDER BY T1.EmprCod, T1.PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NT5", "SELECT T1.EmprCod, T1.PedCod, T1.PedCanEnt, T1.PedUni, T1.PedPre, T1.PedCum, T2.PrdNom, T2.PrdRefPrv, T1.PrdNum FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PedCod = ? ORDER BY T1.EmprCod, T1.PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

