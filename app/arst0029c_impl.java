package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class arst0029c_impl extends GXWebReport
{
   public arst0029c_impl( com.genexus.internet.HttpContext context )
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
            AV16UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV72Prdnum1 = httpContext.GetPar( "Prdnum1") ;
            AV73Prdnum2 = httpContext.GetPar( "Prdnum2") ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         AV66FlagDifN = (byte)(0) ;
         GXv_int1[0] = AV66FlagDifN ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIFNEG", ""), GXv_int1) ;
         arst0029c_impl.this.AV66FlagDifN = GXv_int1[0] ;
         AV67FlagPreMed = (byte)(0) ;
         GXv_int1[0] = AV67FlagPreMed ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int1) ;
         arst0029c_impl.this.AV67FlagPreMed = GXv_int1[0] ;
         GXv_int1[0] = AV71DifInv ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIFINV", ""), GXv_int1) ;
         arst0029c_impl.this.AV71DifInv = GXv_int1[0] ;
         /* Using cursor P06TR2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06TR2_A407EmprNom[0] ;
            n407EmprNom = P06TR2_n407EmprNom[0] ;
            AV20NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV58ValAlmCol = DecimalUtil.ZERO ;
         AV57ValAlmTot = DecimalUtil.ZERO ;
         AV59ValCCCol = DecimalUtil.ZERO ;
         AV60ValCCTot = DecimalUtil.ZERO ;
         AV70Ok = (byte)(0) ;
         /* Using cursor P06TR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16UFecha, AV72Prdnum1, AV73Prdnum2});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P06TR3_A719PrdNum[0] ;
            A810RecFec = P06TR3_A810RecFec[0] ;
            A807RecExiRea = P06TR3_A807RecExiRea[0] ;
            A809RecExiTeo = P06TR3_A809RecExiTeo[0] ;
            A724PrdPreAct = P06TR3_A724PrdPreAct[0] ;
            A726PrdPreMed = P06TR3_A726PrdPreMed[0] ;
            A3915EmpNumDec = P06TR3_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06TR3_n3915EmpNumDec[0] ;
            A806RecExiRcc = P06TR3_A806RecExiRcc[0] ;
            A808RecExiTcc = P06TR3_A808RecExiTcc[0] ;
            A718PrdNom = P06TR3_A718PrdNom[0] ;
            A3915EmpNumDec = P06TR3_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06TR3_n3915EmpNumDec[0] ;
            A724PrdPreAct = P06TR3_A724PrdPreAct[0] ;
            A726PrdPreMed = P06TR3_A726PrdPreMed[0] ;
            A718PrdNom = P06TR3_A718PrdNom[0] ;
            AV21DifAlm = A809RecExiTeo.subtract(A807RecExiRea) ;
            if ( AV71DifInv == 1 )
            {
               AV21DifAlm = A807RecExiRea.subtract(A809RecExiTeo) ;
               AV26DifAlm2 = AV21DifAlm ;
            }
            else
            {
               if ( ( AV21DifAlm.doubleValue() < 0 ) && (0==AV66FlagDifN) )
               {
                  AV26DifAlm2 = AV21DifAlm.negate() ;
               }
               else
               {
                  AV26DifAlm2 = AV21DifAlm ;
               }
            }
            if ( A809RecExiTeo.doubleValue() != 0 )
            {
               AV22DifAlmPor = AV26DifAlm2.multiply(DecimalUtil.doubleToDec(100)).divide(A809RecExiTeo, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV22DifAlmPor = DecimalUtil.doubleToDec(0) ;
            }
            AV68PreProd = A724PrdPreAct ;
            if ( AV67FlagPreMed == 1 )
            {
               AV68PreProd = A726PrdPreMed ;
            }
            if ( A3915EmpNumDec == 0 )
            {
               AV27ValAlm = GXutil.roundDecimal( AV26DifAlm2.multiply(AV68PreProd), 1) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV27ValAlm = GXutil.roundDecimal( AV26DifAlm2.multiply(AV68PreProd), 2) ;
               }
            }
            if ( ( GXutil.strcmp(AV61TipCol, GXutil.substring( A719PrdNum, 1, 1)) != 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") == 0 ) && ! (GXutil.strcmp("", AV61TipCol)==0) )
            {
               GXt_char2 = AV63Lit29 ;
               GXv_char3[0] = GXt_char2 ;
               new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1051_", ""), (byte)(99), GXv_char3) ;
               arst0029c_impl.this.GXt_char2 = GXv_char3[0] ;
               AV63Lit29 = GXt_char2 ;
               AV64Lit30 = "" ;
               /* Execute user subroutine: 'TOTAL' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV58ValAlmCol = DecimalUtil.doubleToDec(0) ;
               AV57ValAlmTot = DecimalUtil.doubleToDec(0) ;
            }
            AV58ValAlmCol = AV58ValAlmCol.add(AV27ValAlm) ;
            AV57ValAlmTot = AV57ValAlmTot.add(AV27ValAlm) ;
            AV24DifCC = A808RecExiTcc.subtract(A806RecExiRcc) ;
            if ( AV71DifInv == 1 )
            {
               AV24DifCC = A806RecExiRcc.subtract(A808RecExiTcc) ;
               AV25DifCC2 = AV24DifCC ;
            }
            else
            {
               if ( ( AV24DifCC.doubleValue() < 0 ) && (0==AV66FlagDifN) )
               {
                  AV25DifCC2 = AV24DifCC.negate() ;
               }
               else
               {
                  AV25DifCC2 = AV24DifCC ;
               }
            }
            if ( A808RecExiTcc.doubleValue() != 0 )
            {
               AV23DifCCPor = AV25DifCC2.multiply(DecimalUtil.doubleToDec(100)).divide(A808RecExiTcc, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV23DifCCPor = DecimalUtil.doubleToDec(0) ;
            }
            if ( A3915EmpNumDec == 0 )
            {
               AV28ValCC = GXutil.roundDecimal( AV25DifCC2.multiply(A724PrdPreAct), 1) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV28ValCC = GXutil.roundDecimal( AV25DifCC2.multiply(A724PrdPreAct), 2) ;
               }
            }
            AV59ValCCCol = AV59ValCCCol.add(AV28ValCC) ;
            AV60ValCCTot = AV60ValCCTot.add(AV28ValCC) ;
            h6TR0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 4, Gx_line+1, 49, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 52, Gx_line+1, 243, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")), 249, Gx_line+1, 338, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")), 344, Gx_line+1, 433, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21DifAlm, "ZZZZ9.9999")), 435, Gx_line+1, 509, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22DifAlmPor, "ZZZ9.99")), 513, Gx_line+1, 565, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A810RecFec, "99/99/99"), 1049, Gx_line+1, 1108, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A806RecExiRcc, "ZZZZZZ9.9999")), 746, Gx_line+1, 835, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24DifCC, "ZZZZ9.9999")), 841, Gx_line+1, 915, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28ValCC, "ZZZZZZ9.99")), 967, Gx_line+1, 1041, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")), 654, Gx_line+1, 743, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27ValAlm, "ZZZZZZ9.99")), 569, Gx_line+1, 643, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23DifCCPor, "ZZ9.99")), 918, Gx_line+1, 963, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV61TipCol = GXutil.substring( A719PrdNum, 1, 1) ;
            AV70Ok = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV70Ok == 1 )
         {
            /* Execute user subroutine: 'TOTAL' */
            S111 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            h6TR0( false, 28) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57ValAlmTot, "ZZZZZZZZZZ.ZZ")), 547, Gx_line+6, 643, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit28, "")), 482, Gx_line+6, 534, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(945, Gx_line+0, 1040, Gx_line+0, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60ValCCTot, "ZZZZZZZZZZ.ZZ")), 945, Gx_line+5, 1041, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(547, Gx_line+0, 642, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+28) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6TR0( true, 0) ;
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
      /* 'TOTAL' Routine */
      returnInSub = false ;
      h6TR0( false, 28) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58ValAlmCol, "ZZZZZZZZZZ.ZZ")), 547, Gx_line+5, 643, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit28, "")), 315, Gx_line+4, 367, Gx_line+22, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit29, "")), 373, Gx_line+4, 447, Gx_line+22, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit30, "")), 453, Gx_line+4, 527, Gx_line+22, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(547, Gx_line+0, 642, Gx_line+0, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59ValCCCol, "ZZZZZZZZZZ.ZZ")), 945, Gx_line+4, 1041, Gx_line+21, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(945, Gx_line+0, 1040, Gx_line+0, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+28) ;
      AV58ValAlmCol = DecimalUtil.ZERO ;
      AV59ValCCCol = DecimalUtil.ZERO ;
      GXt_char2 = AV63Lit29 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN759_", ""), (byte)(99), GXv_char3) ;
      arst0029c_impl.this.GXt_char2 = GXv_char3[0] ;
      AV63Lit29 = GXt_char2 ;
      GXt_char2 = AV64Lit30 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN760_", ""), (byte)(99), GXv_char3) ;
      arst0029c_impl.this.GXt_char2 = GXv_char3[0] ;
      AV64Lit30 = GXt_char2 ;
   }

   public void h6TR0( boolean bFoot ,
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
            getPrinter().GxDrawText(":", 885, Gx_line+14, 893, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 1049, Gx_line+14, 1057, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20NomEmp, "")), 5, Gx_line+14, 225, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit1, "")), 849, Gx_line+14, 886, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 900, Gx_line+14, 959, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit2, "")), 1005, Gx_line+14, 1035, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1064, Gx_line+14, 1123, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 1049, Gx_line+47, 1057, Gx_line+63, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit0, "")), 5, Gx_line+47, 254, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit3, "")), 1005, Gx_line+47, 1050, Gx_line+65, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1064, Gx_line+47, 1109, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit15, "")), 377, Gx_line+78, 517, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 526, Gx_line+99, 534, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit4, "")), 6, Gx_line+99, 51, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit6, "")), 285, Gx_line+99, 337, Gx_line+117, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit7, "")), 380, Gx_line+99, 432, Gx_line+117, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit8, "")), 450, Gx_line+99, 509, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit9, "")), 534, Gx_line+99, 564, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit10, "")), 569, Gx_line+99, 643, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit25, "")), 1049, Gx_line+100, 1108, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV16UFecha, "99/99/99"), 282, Gx_line+47, 341, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+6, 1152, Gx_line+6, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+72, 1152, Gx_line+72, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+119, 242, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(249, Gx_line+119, 337, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(344, Gx_line+119, 432, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(435, Gx_line+119, 508, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(569, Gx_line+119, 642, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(513, Gx_line+119, 564, Gx_line+119, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1049, Gx_line+120, 1107, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(530, Gx_line+93, 641, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(249, Gx_line+93, 360, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Pgmname, "")), 849, Gx_line+47, 1069, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit16, "")), 775, Gx_line+78, 922, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 924, Gx_line+101, 932, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit11, "")), 691, Gx_line+100, 743, Gx_line+118, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit12, "")), 782, Gx_line+100, 834, Gx_line+118, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit13, "")), 855, Gx_line+100, 914, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit14, "")), 932, Gx_line+100, 962, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit26, "")), 967, Gx_line+100, 1041, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(654, Gx_line+120, 742, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(746, Gx_line+120, 834, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(841, Gx_line+120, 914, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(967, Gx_line+120, 1040, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(918, Gx_line+120, 962, Gx_line+120, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(934, Gx_line+93, 1039, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(654, Gx_line+93, 759, Gx_line+93, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+123) ;
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
      AV16UFecha = GXutil.nullDate() ;
      AV72Prdnum1 = "" ;
      AV73Prdnum2 = "" ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P06TR2_A396EmprCod = new String[] {""} ;
      P06TR2_A407EmprNom = new String[] {""} ;
      P06TR2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV20NomEmp = "" ;
      AV58ValAlmCol = DecimalUtil.ZERO ;
      AV57ValAlmTot = DecimalUtil.ZERO ;
      AV59ValCCCol = DecimalUtil.ZERO ;
      AV60ValCCTot = DecimalUtil.ZERO ;
      P06TR3_A396EmprCod = new String[] {""} ;
      P06TR3_A719PrdNum = new String[] {""} ;
      P06TR3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06TR3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TR3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TR3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TR3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TR3_A3915EmpNumDec = new byte[1] ;
      P06TR3_n3915EmpNumDec = new boolean[] {false} ;
      P06TR3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TR3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TR3_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A810RecFec = GXutil.nullDate() ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV21DifAlm = DecimalUtil.ZERO ;
      AV26DifAlm2 = DecimalUtil.ZERO ;
      AV22DifAlmPor = DecimalUtil.ZERO ;
      AV68PreProd = DecimalUtil.ZERO ;
      AV27ValAlm = DecimalUtil.ZERO ;
      AV61TipCol = "" ;
      AV63Lit29 = "" ;
      AV64Lit30 = "" ;
      AV24DifCC = DecimalUtil.ZERO ;
      AV25DifCC2 = DecimalUtil.ZERO ;
      AV23DifCCPor = DecimalUtil.ZERO ;
      AV28ValCC = DecimalUtil.ZERO ;
      AV62Lit28 = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV30Lit1 = "" ;
      Gx_date = GXutil.nullDate() ;
      AV31Lit2 = "" ;
      Gx_time = "" ;
      AV29Lit0 = "" ;
      AV32Lit3 = "" ;
      AV44Lit15 = "" ;
      AV33Lit4 = "" ;
      AV35Lit6 = "" ;
      AV36Lit7 = "" ;
      AV37Lit8 = "" ;
      AV38Lit9 = "" ;
      AV39Lit10 = "" ;
      AV54Lit25 = "" ;
      AV80Pgmname = "" ;
      AV45Lit16 = "" ;
      AV40Lit11 = "" ;
      AV41Lit12 = "" ;
      AV42Lit13 = "" ;
      AV43Lit14 = "" ;
      AV55Lit26 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.arst0029c__default(),
         new Object[] {
             new Object[] {
            P06TR2_A396EmprCod, P06TR2_A407EmprNom, P06TR2_n407EmprNom
            }
            , new Object[] {
            P06TR3_A396EmprCod, P06TR3_A719PrdNum, P06TR3_A810RecFec, P06TR3_A807RecExiRea, P06TR3_A809RecExiTeo, P06TR3_A724PrdPreAct, P06TR3_A726PrdPreMed, P06TR3_A3915EmpNumDec, P06TR3_n3915EmpNumDec, P06TR3_A806RecExiRcc,
            P06TR3_A808RecExiTcc, P06TR3_A718PrdNom
            }
         }
      );
      AV80Pgmname = "ARST0029C" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV80Pgmname = "ARST0029C" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV66FlagDifN ;
   private byte AV67FlagPreMed ;
   private byte AV71DifInv ;
   private byte GXv_int1[] ;
   private byte AV70Ok ;
   private byte A3915EmpNumDec ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV58ValAlmCol ;
   private java.math.BigDecimal AV57ValAlmTot ;
   private java.math.BigDecimal AV59ValCCCol ;
   private java.math.BigDecimal AV60ValCCTot ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal AV21DifAlm ;
   private java.math.BigDecimal AV26DifAlm2 ;
   private java.math.BigDecimal AV22DifAlmPor ;
   private java.math.BigDecimal AV68PreProd ;
   private java.math.BigDecimal AV27ValAlm ;
   private java.math.BigDecimal AV24DifCC ;
   private java.math.BigDecimal AV25DifCC2 ;
   private java.math.BigDecimal AV23DifCCPor ;
   private java.math.BigDecimal AV28ValCC ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV72Prdnum1 ;
   private String AV73Prdnum2 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV20NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV61TipCol ;
   private String AV63Lit29 ;
   private String AV64Lit30 ;
   private String AV62Lit28 ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV30Lit1 ;
   private String AV31Lit2 ;
   private String Gx_time ;
   private String AV29Lit0 ;
   private String AV32Lit3 ;
   private String AV44Lit15 ;
   private String AV33Lit4 ;
   private String AV35Lit6 ;
   private String AV36Lit7 ;
   private String AV37Lit8 ;
   private String AV38Lit9 ;
   private String AV39Lit10 ;
   private String AV54Lit25 ;
   private String AV80Pgmname ;
   private String AV45Lit16 ;
   private String AV40Lit11 ;
   private String AV41Lit12 ;
   private String AV42Lit13 ;
   private String AV43Lit14 ;
   private String AV55Lit26 ;
   private java.util.Date AV16UFecha ;
   private java.util.Date A810RecFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P06TR2_A396EmprCod ;
   private String[] P06TR2_A407EmprNom ;
   private boolean[] P06TR2_n407EmprNom ;
   private String[] P06TR3_A396EmprCod ;
   private String[] P06TR3_A719PrdNum ;
   private java.util.Date[] P06TR3_A810RecFec ;
   private java.math.BigDecimal[] P06TR3_A807RecExiRea ;
   private java.math.BigDecimal[] P06TR3_A809RecExiTeo ;
   private java.math.BigDecimal[] P06TR3_A724PrdPreAct ;
   private java.math.BigDecimal[] P06TR3_A726PrdPreMed ;
   private byte[] P06TR3_A3915EmpNumDec ;
   private boolean[] P06TR3_n3915EmpNumDec ;
   private java.math.BigDecimal[] P06TR3_A806RecExiRcc ;
   private java.math.BigDecimal[] P06TR3_A808RecExiTcc ;
   private String[] P06TR3_A718PrdNom ;
}

final  class arst0029c__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06TR2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06TR3", "SELECT T1.EmprCod, T1.PrdNum, T1.RecFec, T1.RecExiRea, T1.RecExiTeo, T3.PrdPreAct, T3.PrdPreMed, T2.EmpNumDec, T1.RecExiRcc, T1.RecExiTcc, T3.PrdNom FROM ((TXPRECUEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.RecFec = ? and T1.PrdNum >= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.RecFec, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

