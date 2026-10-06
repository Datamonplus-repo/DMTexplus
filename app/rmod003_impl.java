package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmod003_impl extends GXWebReport
{
   public rmod003_impl( com.genexus.internet.HttpContext context )
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
            AV8PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV9UProv = (int)(GXutil.lval( httpContext.GetPar( "UProv"))) ;
            AV21Pfecha = localUtil.parseDateParm( httpContext.GetPar( "Pfecha")) ;
            AV22Ufecha = localUtil.parseDateParm( httpContext.GetPar( "Ufecha")) ;
            AV25Prdnum1 = httpContext.GetPar( "Prdnum1") ;
            AV26Prdnum2 = httpContext.GetPar( "Prdnum2") ;
            AV19Producto = httpContext.GetPar( "Producto") ;
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
         /* Using cursor P06P62 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06P62_A407EmprNom[0] ;
            n407EmprNom = P06P62_n407EmprNom[0] ;
            AV24NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV14TotG = DecimalUtil.doubleToDec(0) ;
         AV16TotVG = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06P63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8PProv), Integer.valueOf(AV9UProv)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A795PrvNum = P06P63_A795PrvNum[0] ;
            A794PrvNom = P06P63_A794PrvNom[0] ;
            n794PrvNom = P06P63_n794PrvNom[0] ;
            A783PrvCta = P06P63_A783PrvCta[0] ;
            n783PrvCta = P06P63_n783PrvCta[0] ;
            AV10PrvNum = A795PrvNum ;
            AV12PrvNom = A794PrvNom ;
            AV23Cuenta = GXutil.str( A795PrvNum, 6, 0) ;
            if ( GXutil.strcmp(AV19Producto, httpContext.getMessage( "B", "")) == 0 )
            {
               AV23Cuenta = GXutil.substring( A783PrvCta, 1, 9) ;
            }
            AV11FlagProv = (byte)(0) ;
            AV17TotCP = DecimalUtil.doubleToDec(0) ;
            AV18TotVP = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P06P64 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV10PrvNum), AV25Prdnum1, AV26Prdnum2});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A3915EmpNumDec = P06P64_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P06P64_n3915EmpNumDec[0] ;
               A719PrdNum = P06P64_A719PrdNum[0] ;
               A795PrvNum = P06P64_A795PrvNum[0] ;
               A704PrdExiAlm = P06P64_A704PrdExiAlm[0] ;
               A718PrdNom = P06P64_A718PrdNom[0] ;
               A728PrdRefPrv = P06P64_A728PrdRefPrv[0] ;
               A3915EmpNumDec = P06P64_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P06P64_n3915EmpNumDec[0] ;
               AV13TotCant = DecimalUtil.doubleToDec(0) ;
               AV15TotVal = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P06P65 */
               pr_default.execute(3, new Object[] {A396EmprCod, AV25Prdnum1, AV21Pfecha, AV22Ufecha, AV26Prdnum2});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A3344CCStkCanS = P06P65_A3344CCStkCanS[0] ;
                  A3348CCStkFec = P06P65_A3348CCStkFec[0] ;
                  A719PrdNum = P06P65_A719PrdNum[0] ;
                  A3349CCStkPre = P06P65_A3349CCStkPre[0] ;
                  A3342CCStkLin = P06P65_A3342CCStkLin[0] ;
                  AV13TotCant = AV13TotCant.add(A3344CCStkCanS) ;
                  if ( A3915EmpNumDec == 0 )
                  {
                     AV15TotVal = AV15TotVal.add((A3344CCStkCanS.multiply(A3349CCStkPre))) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        AV15TotVal = AV15TotVal.add(GXutil.roundDecimal( (A3344CCStkCanS.multiply(A3349CCStkPre)), 2)) ;
                     }
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               if ( ( AV11FlagProv == 0 ) && ( AV13TotCant.doubleValue() > 0 ) )
               {
                  AV11FlagProv = (byte)(1) ;
                  h6P60( false, 38) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fornecedor:", ""), 57, Gx_line+11, 129, Gx_line+25, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12PrvNom, "")), 213, Gx_line+10, 433, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Cuenta, "")), 136, Gx_line+10, 203, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+38) ;
               }
               AV20PrdNum = A719PrdNum ;
               AV27Prdnom = A718PrdNom ;
               if ( GXutil.strcmp(AV19Producto, httpContext.getMessage( "B", "")) == 0 )
               {
                  AV20PrdNum = GXutil.substring( A728PrdRefPrv, 1, 6) ;
               }
               if ( AV13TotCant.doubleValue() > 0 )
               {
                  h6P60( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20PrdNum, "")), 20, Gx_line+0, 65, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Prdnom, "")), 77, Gx_line+1, 268, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13TotCant, "ZZ,ZZZ,ZZ9.9999")), 346, Gx_line+0, 456, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15TotVal, "ZZ,ZZZ,ZZ9.99")), 574, Gx_line+1, 670, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               AV17TotCP = AV17TotCP.add(AV13TotCant) ;
               AV18TotVP = AV18TotVP.add(AV15TotVal) ;
               AV14TotG = AV14TotG.add(AV13TotCant) ;
               AV16TotVG = AV16TotVG.add(AV15TotVal) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV17TotCP.doubleValue() > 0 )
            {
               h6P60( false, 36) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SUB TOTAL", ""), 115, Gx_line+14, 188, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17TotCP, "ZZ,ZZZ,ZZ9.9999")), 346, Gx_line+13, 456, Gx_line+30, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18TotVP, "ZZ,ZZZ,ZZ9.99")), 574, Gx_line+13, 670, Gx_line+30, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+36) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV14TotG.doubleValue() > 0 )
         {
            h6P60( false, 33) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 145, Gx_line+16, 188, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14TotG, "ZZ,ZZZ,ZZ9.9999")), 346, Gx_line+15, 456, Gx_line+32, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16TotVG, "ZZ,ZZZ,ZZ9.99")), 574, Gx_line+15, 670, Gx_line+32, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6P60( true, 0) ;
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

   public void h6P60( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SAIDA DE PRODUTOS DE STOCK VALORADA", ""), 24, Gx_line+50, 267, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DATA:", ""), 576, Gx_line+14, 616, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 628, Gx_line+13, 687, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+76, 749, Gx_line+76, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 20, Gx_line+91, 67, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 77, Gx_line+91, 137, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 386, Gx_line+91, 455, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+104, 746, Gx_line+104, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 638, Gx_line+89, 669, Gx_line+103, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 15, Gx_line+14, 204, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PAGINA:", ""), 561, Gx_line+50, 614, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 623, Gx_line+50, 668, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 690, Gx_line+50, 726, Gx_line+67, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 675, Gx_line+50, 682, Gx_line+64, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+113) ;
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
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV21Pfecha = GXutil.nullDate() ;
      AV22Ufecha = GXutil.nullDate() ;
      AV25Prdnum1 = "" ;
      AV26Prdnum2 = "" ;
      AV19Producto = "" ;
      scmdbuf = "" ;
      P06P62_A396EmprCod = new String[] {""} ;
      P06P62_A407EmprNom = new String[] {""} ;
      P06P62_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24NomEmp = "" ;
      AV14TotG = DecimalUtil.ZERO ;
      AV16TotVG = DecimalUtil.ZERO ;
      P06P63_A396EmprCod = new String[] {""} ;
      P06P63_A795PrvNum = new int[1] ;
      P06P63_A794PrvNom = new String[] {""} ;
      P06P63_n794PrvNom = new boolean[] {false} ;
      P06P63_A783PrvCta = new String[] {""} ;
      P06P63_n783PrvCta = new boolean[] {false} ;
      A794PrvNom = "" ;
      A783PrvCta = "" ;
      AV12PrvNom = "" ;
      AV23Cuenta = "" ;
      AV17TotCP = DecimalUtil.ZERO ;
      AV18TotVP = DecimalUtil.ZERO ;
      P06P64_A396EmprCod = new String[] {""} ;
      P06P64_A3915EmpNumDec = new byte[1] ;
      P06P64_n3915EmpNumDec = new boolean[] {false} ;
      P06P64_A719PrdNum = new String[] {""} ;
      P06P64_A795PrvNum = new int[1] ;
      P06P64_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P64_A718PrdNom = new String[] {""} ;
      P06P64_A728PrdRefPrv = new String[] {""} ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A728PrdRefPrv = "" ;
      AV13TotCant = DecimalUtil.ZERO ;
      AV15TotVal = DecimalUtil.ZERO ;
      P06P65_A396EmprCod = new String[] {""} ;
      P06P65_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P65_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06P65_A719PrdNum = new String[] {""} ;
      P06P65_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06P65_A3342CCStkLin = new long[1] ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      AV20PrdNum = "" ;
      AV27Prdnom = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rmod003__default(),
         new Object[] {
             new Object[] {
            P06P62_A396EmprCod, P06P62_A407EmprNom, P06P62_n407EmprNom
            }
            , new Object[] {
            P06P63_A396EmprCod, P06P63_A795PrvNum, P06P63_A794PrvNom, P06P63_n794PrvNom, P06P63_A783PrvCta, P06P63_n783PrvCta
            }
            , new Object[] {
            P06P64_A396EmprCod, P06P64_A3915EmpNumDec, P06P64_n3915EmpNumDec, P06P64_A719PrdNum, P06P64_A795PrvNum, P06P64_A704PrdExiAlm, P06P64_A718PrdNom, P06P64_A728PrdRefPrv
            }
            , new Object[] {
            P06P65_A396EmprCod, P06P65_A3344CCStkCanS, P06P65_A3348CCStkFec, P06P65_A719PrdNum, P06P65_A3349CCStkPre, P06P65_A3342CCStkLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV11FlagProv ;
   private byte A3915EmpNumDec ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV8PProv ;
   private int AV9UProv ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int AV10PrvNum ;
   private int Gx_OldLine ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV14TotG ;
   private java.math.BigDecimal AV16TotVG ;
   private java.math.BigDecimal AV17TotCP ;
   private java.math.BigDecimal AV18TotVP ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV13TotCant ;
   private java.math.BigDecimal AV15TotVal ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV25Prdnum1 ;
   private String AV26Prdnum2 ;
   private String AV19Producto ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24NomEmp ;
   private String A794PrvNom ;
   private String A783PrvCta ;
   private String AV12PrvNom ;
   private String AV23Cuenta ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A728PrdRefPrv ;
   private String AV20PrdNum ;
   private String AV27Prdnom ;
   private java.util.Date AV21Pfecha ;
   private java.util.Date AV22Ufecha ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean n783PrvCta ;
   private boolean n3915EmpNumDec ;
   private IDataStoreProvider pr_default ;
   private String[] P06P62_A396EmprCod ;
   private String[] P06P62_A407EmprNom ;
   private boolean[] P06P62_n407EmprNom ;
   private String[] P06P63_A396EmprCod ;
   private int[] P06P63_A795PrvNum ;
   private String[] P06P63_A794PrvNom ;
   private boolean[] P06P63_n794PrvNom ;
   private String[] P06P63_A783PrvCta ;
   private boolean[] P06P63_n783PrvCta ;
   private String[] P06P64_A396EmprCod ;
   private byte[] P06P64_A3915EmpNumDec ;
   private boolean[] P06P64_n3915EmpNumDec ;
   private String[] P06P64_A719PrdNum ;
   private int[] P06P64_A795PrvNum ;
   private java.math.BigDecimal[] P06P64_A704PrdExiAlm ;
   private String[] P06P64_A718PrdNom ;
   private String[] P06P64_A728PrdRefPrv ;
   private String[] P06P65_A396EmprCod ;
   private java.math.BigDecimal[] P06P65_A3344CCStkCanS ;
   private java.util.Date[] P06P65_A3348CCStkFec ;
   private String[] P06P65_A719PrdNum ;
   private java.math.BigDecimal[] P06P65_A3349CCStkPre ;
   private long[] P06P65_A3342CCStkLin ;
}

final  class rmod003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06P62", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06P63", "SELECT EmprCod, PrvNum, PrvNom, PrvCta FROM TXPPRVGEN WHERE (EmprCod = ? and PrvNum >= ?) AND (PrvNum <= ?) ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P64", "SELECT T1.EmprCod, T2.EmpNumDec, T1.PrdNum, T1.PrvNum, T1.PrdExiAlm, T1.PrdNom, T1.PrdRefPrv FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE (T1.EmprCod = ? and T1.PrvNum = ?) AND (T1.PrdNum >= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06P65", "SELECT EmprCod, CCStkCanS, CCStkFec, PrdNum, CCStkPre, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum >= ?) AND (CCStkFec >= ? and CCStkFec <= ?) AND (CCStkCanS > 0) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

