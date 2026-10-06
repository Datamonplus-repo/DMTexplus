package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0009_impl extends GXWebReport
{
   public rst0009_impl( com.genexus.internet.HttpContext context )
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
            AV16PPrd = httpContext.GetPar( "PPrd") ;
            AV17UPrd = httpContext.GetPar( "UPrd") ;
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
         GXt_char1 = AV27Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit0 = GXt_char1 ;
         GXt_char1 = AV28Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit1 = GXt_char1 ;
         GXt_char1 = AV29Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2001_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit2 = GXt_char1 ;
         GXt_char1 = AV30Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit3 = GXt_char1 ;
         GXt_char1 = AV31Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2341_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit4 = GXt_char1 ;
         GXt_char1 = AV32Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2441_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit5 = GXt_char1 ;
         GXt_char1 = AV33Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2541_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit6 = GXt_char1 ;
         GXt_char1 = AV34Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2445_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit7 = GXt_char1 ;
         GXt_char1 = AV35Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit8 = GXt_char1 ;
         GXt_char1 = AV36Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit9 = GXt_char1 ;
         GXt_char1 = AV37Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit10 = GXt_char1 ;
         GXt_char1 = AV38Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rst0009_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit11 = GXt_char1 ;
         AV39FlagPreMed = (byte)(0) ;
         GXv_int3[0] = AV39FlagPreMed ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int3) ;
         rst0009_impl.this.AV39FlagPreMed = GXv_int3[0] ;
         GXt_int4 = AV43Induyco ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int3) ;
         rst0009_impl.this.GXt_int4 = GXv_int3[0] ;
         AV43Induyco = GXt_int4 ;
         GXv_char2[0] = A396EmprCod ;
         new app.pordstk(remoteHandle, context).execute( GXv_char2) ;
         rst0009_impl.this.A396EmprCod = GXv_char2[0] ;
         /* Using cursor P06HH2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06HH2_A407EmprNom[0] ;
            n407EmprNom = P06HH2_n407EmprNom[0] ;
            AV19NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV20TotValInf = DecimalUtil.doubleToDec(0) ;
         AV24PorcTot = DecimalUtil.doubleToDec(0) ;
         AV26Flag = (byte)(1) ;
         AV21TotExi = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06HH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PPrd, AV17UPrd});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P06HH3_A719PrdNum[0] ;
            A724PrdPreAct = P06HH3_A724PrdPreAct[0] ;
            A704PrdExiAlm = P06HH3_A704PrdExiAlm[0] ;
            A332DifValStk = P06HH3_A332DifValStk[0] ;
            if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( (A704PrdExiAlm.multiply(A724PrdPreAct)).doubleValue() != 0 ) )
            {
               AV21TotExi = AV21TotExi.add((A704PrdExiAlm.multiply(A724PrdPreAct))) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P06HH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV16PPrd, AV17UPrd});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P06HH4_A719PrdNum[0] ;
            A724PrdPreAct = P06HH4_A724PrdPreAct[0] ;
            A704PrdExiAlm = P06HH4_A704PrdExiAlm[0] ;
            A718PrdNom = P06HH4_A718PrdNom[0] ;
            A4693PrdNum2 = P06HH4_A4693PrdNum2[0] ;
            A332DifValStk = P06HH4_A332DifValStk[0] ;
            if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( (A704PrdExiAlm.multiply(A724PrdPreAct)).doubleValue() != 0 ) )
            {
               if ( AV26Flag == 3 )
               {
                  AV26Flag = (byte)(4) ;
               }
               AV42PrdValstk = A704PrdExiAlm.multiply(A724PrdPreAct) ;
               AV22PorcSub = AV42PrdValstk.multiply(DecimalUtil.doubleToDec(100)).divide(AV21TotExi, 18, java.math.RoundingMode.DOWN) ;
               AV23PorcGrp = AV23PorcGrp.add(AV22PorcSub) ;
               AV24PorcTot = AV24PorcTot.add(AV22PorcSub) ;
               AV25TotGrp = AV25TotGrp.add(AV42PrdValstk) ;
               AV20TotValInf = AV20TotValInf.add(AV42PrdValstk) ;
               AV40TotExis = AV40TotExis.add(A704PrdExiAlm) ;
               AV41PrdExiAlm = A704PrdExiAlm ;
               AV42PrdValstk = A704PrdExiAlm.multiply(A724PrdPreAct) ;
               h6HH0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 27, Gx_line+0, 72, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 78, Gx_line+0, 269, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41PrdExiAlm, "Z,ZZZ,ZZ9.9999")), 304, Gx_line+0, 407, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42PrdValstk, "ZZZ,ZZZ,ZZ9.99")), 510, Gx_line+0, 613, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22PorcSub, "ZZ9.99")), 651, Gx_line+0, 696, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               if ( ( AV43Induyco == 1 ) && ! (GXutil.strcmp("", A4693PrdNum2)==0) )
               {
                  h6HH0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4693PrdNum2, "")), 27, Gx_line+0, 145, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               if ( ( AV24PorcTot.doubleValue() >= 80 ) && ( AV26Flag == 1 ) )
               {
                  h6HH0( false, 34) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit8, "")), 124, Gx_line+8, 233, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TotGrp, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), 459, Gx_line+8, 613, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23PorcGrp, "ZZ9.99")), 651, Gx_line+8, 696, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(14, Gx_line+2, 731, Gx_line+31, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotExis, "Z,ZZZ,ZZ9.9999")), 304, Gx_line+8, 407, Gx_line+26, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+34) ;
                  AV23PorcGrp = DecimalUtil.doubleToDec(0) ;
                  AV25TotGrp = DecimalUtil.doubleToDec(0) ;
                  AV40TotExis = DecimalUtil.doubleToDec(0) ;
                  AV26Flag = (byte)(2) ;
               }
               if ( ( AV24PorcTot.doubleValue() >= 95 ) && ( AV26Flag == 2 ) && ( AV25TotGrp.doubleValue() != 0 ) )
               {
                  h6HH0( false, 33) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit9, "")), 124, Gx_line+8, 233, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TotGrp, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), 459, Gx_line+8, 613, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23PorcGrp, "ZZ9.99")), 651, Gx_line+8, 696, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(14, Gx_line+2, 731, Gx_line+31, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotExis, "Z,ZZZ,ZZ9.9999")), 304, Gx_line+8, 407, Gx_line+26, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+33) ;
                  AV23PorcGrp = DecimalUtil.doubleToDec(0) ;
                  AV25TotGrp = DecimalUtil.doubleToDec(0) ;
                  AV40TotExis = DecimalUtil.doubleToDec(0) ;
                  AV26Flag = (byte)(3) ;
               }
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( ( AV26Flag == 4 ) && ( AV25TotGrp.doubleValue() != 0 ) )
         {
            h6HH0( false, 33) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit10, "")), 123, Gx_line+9, 232, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TotGrp, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), 459, Gx_line+9, 613, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23PorcGrp, "ZZ9.99")), 651, Gx_line+9, 696, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+3, 731, Gx_line+32, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotExis, "Z,ZZZ,ZZ9.9999")), 304, Gx_line+9, 407, Gx_line+27, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            AV23PorcGrp = DecimalUtil.doubleToDec(0) ;
            AV25TotGrp = DecimalUtil.doubleToDec(0) ;
            AV40TotExis = DecimalUtil.doubleToDec(0) ;
         }
         h6HH0( false, 36) ;
         getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit11, "")), 124, Gx_line+9, 233, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20TotValInf, "ZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), 459, Gx_line+9, 613, Gx_line+27, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24PorcTot, "ZZ9.99")), 651, Gx_line+9, 696, Gx_line+27, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(14, Gx_line+3, 731, Gx_line+32, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6HH0( true, 0) ;
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

   public void h6HH0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19NomEmp, "")), 15, Gx_line+17, 266, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit0, "")), 417, Gx_line+17, 454, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 475, Gx_line+17, 534, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit1, "")), 555, Gx_line+17, 585, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 614, Gx_line+17, 673, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit2, "")), 15, Gx_line+50, 329, Gx_line+70, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit3, "")), 573, Gx_line+50, 618, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 624, Gx_line+50, 669, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 698, Gx_line+85, 706, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit4, "")), 27, Gx_line+84, 137, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit5, "")), 297, Gx_line+84, 407, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit6, "")), 532, Gx_line+84, 613, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit7, "")), 649, Gx_line+84, 694, Gx_line+102, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(WST0009)", ""), 365, Gx_line+50, 432, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(9, Gx_line+73, 737, Gx_line+73, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+104, 738, Gx_line+104, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+106) ;
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
      AV15ImpCod = "" ;
      AV16PPrd = "" ;
      AV17UPrd = "" ;
      AV27Lit0 = "" ;
      AV28Lit1 = "" ;
      AV29Lit2 = "" ;
      AV30Lit3 = "" ;
      AV31Lit4 = "" ;
      AV32Lit5 = "" ;
      AV33Lit6 = "" ;
      AV34Lit7 = "" ;
      AV35Lit8 = "" ;
      AV36Lit9 = "" ;
      AV37Lit10 = "" ;
      AV38Lit11 = "" ;
      GXt_char1 = "" ;
      GXv_int3 = new byte[1] ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06HH2_A396EmprCod = new String[] {""} ;
      P06HH2_A407EmprNom = new String[] {""} ;
      P06HH2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV19NomEmp = "" ;
      AV20TotValInf = DecimalUtil.ZERO ;
      AV24PorcTot = DecimalUtil.ZERO ;
      AV21TotExi = DecimalUtil.ZERO ;
      P06HH3_A396EmprCod = new String[] {""} ;
      P06HH3_A719PrdNum = new String[] {""} ;
      P06HH3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HH3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HH3_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      P06HH4_A396EmprCod = new String[] {""} ;
      P06HH4_A719PrdNum = new String[] {""} ;
      P06HH4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HH4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06HH4_A718PrdNom = new String[] {""} ;
      P06HH4_A4693PrdNum2 = new String[] {""} ;
      P06HH4_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A718PrdNom = "" ;
      A4693PrdNum2 = "" ;
      AV42PrdValstk = DecimalUtil.ZERO ;
      AV22PorcSub = DecimalUtil.ZERO ;
      AV23PorcGrp = DecimalUtil.ZERO ;
      AV25TotGrp = DecimalUtil.ZERO ;
      AV40TotExis = DecimalUtil.ZERO ;
      AV41PrdExiAlm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0009__default(),
         new Object[] {
             new Object[] {
            P06HH2_A396EmprCod, P06HH2_A407EmprNom, P06HH2_n407EmprNom
            }
            , new Object[] {
            P06HH3_A396EmprCod, P06HH3_A719PrdNum, P06HH3_A724PrdPreAct, P06HH3_A704PrdExiAlm, P06HH3_A332DifValStk
            }
            , new Object[] {
            P06HH4_A396EmprCod, P06HH4_A719PrdNum, P06HH4_A724PrdPreAct, P06HH4_A704PrdExiAlm, P06HH4_A718PrdNom, P06HH4_A4693PrdNum2, P06HH4_A332DifValStk
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

   private byte AV39FlagPreMed ;
   private byte AV43Induyco ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte AV26Flag ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV20TotValInf ;
   private java.math.BigDecimal AV24PorcTot ;
   private java.math.BigDecimal AV21TotExi ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal AV42PrdValstk ;
   private java.math.BigDecimal AV22PorcSub ;
   private java.math.BigDecimal AV23PorcGrp ;
   private java.math.BigDecimal AV25TotGrp ;
   private java.math.BigDecimal AV40TotExis ;
   private java.math.BigDecimal AV41PrdExiAlm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PPrd ;
   private String AV17UPrd ;
   private String AV27Lit0 ;
   private String AV28Lit1 ;
   private String AV29Lit2 ;
   private String AV30Lit3 ;
   private String AV31Lit4 ;
   private String AV32Lit5 ;
   private String AV33Lit6 ;
   private String AV34Lit7 ;
   private String AV35Lit8 ;
   private String AV36Lit9 ;
   private String AV37Lit10 ;
   private String AV38Lit11 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV19NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A4693PrdNum2 ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06HH2_A396EmprCod ;
   private String[] P06HH2_A407EmprNom ;
   private boolean[] P06HH2_n407EmprNom ;
   private String[] P06HH3_A396EmprCod ;
   private String[] P06HH3_A719PrdNum ;
   private java.math.BigDecimal[] P06HH3_A724PrdPreAct ;
   private java.math.BigDecimal[] P06HH3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P06HH3_A332DifValStk ;
   private String[] P06HH4_A396EmprCod ;
   private String[] P06HH4_A719PrdNum ;
   private java.math.BigDecimal[] P06HH4_A724PrdPreAct ;
   private java.math.BigDecimal[] P06HH4_A704PrdExiAlm ;
   private String[] P06HH4_A718PrdNom ;
   private String[] P06HH4_A4693PrdNum2 ;
   private java.math.BigDecimal[] P06HH4_A332DifValStk ;
}

final  class rst0009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06HH2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06HH3", "SELECT EmprCod, PrdNum, PrdPreAct, PrdExiAlm, DifValStk FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum >= ? and PrdNum <= ?) ORDER BY DifValStk ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06HH4", "SELECT EmprCod, PrdNum, PrdPreAct, PrdExiAlm, PrdNom, PrdNum2, DifValStk FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum >= ? and PrdNum <= ?) ORDER BY DifValStk ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

