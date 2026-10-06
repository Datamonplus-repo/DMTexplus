package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rco0003_impl extends GXWebReport
{
   public rco0003_impl( com.genexus.internet.HttpContext context )
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
            AV16PProd = httpContext.GetPar( "PProd") ;
            AV17UProd = httpContext.GetPar( "UProd") ;
            AV18PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV19UProv = (int)(GXutil.lval( httpContext.GetPar( "UProv"))) ;
            AV25Any = (short)(GXutil.lval( httpContext.GetPar( "Any"))) ;
            AV21Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
            AV22Font = (byte)(GXutil.lval( httpContext.GetPar( "Font"))) ;
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
         GXt_char1 = AV47Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2247_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit0 = GXt_char1 ;
         GXt_char1 = AV48Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit1 = GXt_char1 ;
         GXt_char1 = AV49Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit2 = GXt_char1 ;
         GXt_char1 = AV50Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit3 = GXt_char1 ;
         GXt_char1 = AV51Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit4 = GXt_char1 ;
         GXt_char1 = AV52Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit5 = GXt_char1 ;
         GXt_char1 = AV53Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN185_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit6 = GXt_char1 ;
         GXt_char1 = AV54Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit7 = GXt_char1 ;
         GXt_char1 = AV55Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2055_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit8 = GXt_char1 ;
         GXt_char1 = AV56Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2538_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit9 = GXt_char1 ;
         GXt_char1 = AV57Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2054_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit10 = GXt_char1 ;
         GXt_char1 = AV58Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2538_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit11 = GXt_char1 ;
         GXt_char1 = AV59Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rco0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit12 = GXt_char1 ;
         GXt_int3 = AV66F_carvema ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int4) ;
         rco0003_impl.this.GXt_int3 = GXv_int4[0] ;
         AV66F_carvema = GXt_int3 ;
         /* Using cursor P06FQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06FQ2_A407EmprNom[0] ;
            n407EmprNom = P06FQ2_n407EmprNom[0] ;
            AV24NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Optimized group. */
         /* Using cursor P06FQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PProd, Short.valueOf(AV25Any), Byte.valueOf(AV21Mes), Integer.valueOf(AV18PProv), Integer.valueOf(AV19UProv), AV17UProd});
         c745PrdUniCprM = P06FQ3_A745PrdUniCprM[0] ;
         c749PrdValCprM = P06FQ3_A749PrdValCprM[0] ;
         pr_default.close(1);
         AV31CompAc = AV31CompAc.add(c745PrdUniCprM) ;
         AV33ValCom = AV33ValCom.add(c749PrdValCprM) ;
         /* End optimized group. */
         /* Optimized group. */
         /* Using cursor P06FQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV16PProd, Short.valueOf(AV25Any), Integer.valueOf(AV18PProv), Integer.valueOf(AV19UProv), Byte.valueOf(AV21Mes), AV17UProd});
         c745PrdUniCprM = P06FQ4_A745PrdUniCprM[0] ;
         c749PrdValCprM = P06FQ4_A749PrdValCprM[0] ;
         pr_default.close(2);
         AV35ComAcAn = AV35ComAcAn.add(c745PrdUniCprM) ;
         AV36ComVAcAn = AV36ComVAcAn.add(c749PrdValCprM) ;
         /* End optimized group. */
         AV60PrdNumi = "" ;
         /* Using cursor P06FQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV16PProd, Short.valueOf(AV25Any), Integer.valueOf(AV18PProv), Integer.valueOf(AV19UProv), Byte.valueOf(AV21Mes), AV17UProd});
         while ( (pr_default.getStatus(3) != 101) )
         {
            brk6FQ6 = false ;
            A720PrdNumMes = P06FQ5_A720PrdNumMes[0] ;
            A681PrdAny = P06FQ5_A681PrdAny[0] ;
            A795PrvNum = P06FQ5_A795PrvNum[0] ;
            A719PrdNum = P06FQ5_A719PrdNum[0] ;
            A745PrdUniCprM = P06FQ5_A745PrdUniCprM[0] ;
            A749PrdValCprM = P06FQ5_A749PrdValCprM[0] ;
            A718PrdNom = P06FQ5_A718PrdNom[0] ;
            A795PrvNum = P06FQ5_A795PrvNum[0] ;
            A718PrdNom = P06FQ5_A718PrdNom[0] ;
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), GXutil.substring( AV60PrdNumi, 1, 1)) != 0 ) && ! (GXutil.strcmp("", AV60PrdNumi)==0) && ( AV66F_carvema == 1 ) )
            {
               /* Execute user subroutine: 'FAMILIA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV61UniCprmP = AV45UniCprM ;
               AV62ValCprMP = AV46ValCprM ;
               AV63Ca1P = AV38CA1 ;
               AV64Vca1P = AV39VCA1 ;
            }
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), GXutil.substring( AV60PrdNumi, 1, 1)) == 0 ) || (GXutil.strcmp("", AV60PrdNumi)==0) )
            {
               AV61UniCprmP = AV61UniCprmP.add(AV45UniCprM) ;
               AV62ValCprMP = AV62ValCprMP.add(AV46ValCprM) ;
               AV63Ca1P = AV63Ca1P.add(AV38CA1) ;
               AV64Vca1P = AV64Vca1P.add(AV39VCA1) ;
            }
            AV38CA1 = DecimalUtil.doubleToDec(0) ;
            AV39VCA1 = DecimalUtil.doubleToDec(0) ;
            AV60PrdNumi = A719PrdNum ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P06FQ5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06FQ5_A719PrdNum[0], A719PrdNum) == 0 ) && ( P06FQ5_A681PrdAny[0] == AV25Any ) )
            {
               brk6FQ6 = false ;
               A720PrdNumMes = P06FQ5_A720PrdNumMes[0] ;
               A681PrdAny = P06FQ5_A681PrdAny[0] ;
               A795PrvNum = P06FQ5_A795PrvNum[0] ;
               A745PrdUniCprM = P06FQ5_A745PrdUniCprM[0] ;
               A749PrdValCprM = P06FQ5_A749PrdValCprM[0] ;
               A795PrvNum = P06FQ5_A795PrvNum[0] ;
               if ( A720PrdNumMes <= AV21Mes )
               {
                  if ( ( GXutil.strcmp(A719PrdNum, AV16PProd) >= 0 ) && ( GXutil.strcmp(A719PrdNum, AV17UProd) <= 0 ) )
                  {
                     if ( ( A795PrvNum >= AV18PProv ) && ( A795PrvNum <= AV19UProv ) )
                     {
                        AV38CA1 = AV38CA1.add(A745PrdUniCprM) ;
                        AV39VCA1 = AV39VCA1.add(A749PrdValCprM) ;
                        AV45UniCprM = DecimalUtil.doubleToDec(0) ;
                        AV46ValCprM = DecimalUtil.doubleToDec(0) ;
                        if ( A720PrdNumMes == AV21Mes )
                        {
                           AV45UniCprM = A745PrdUniCprM ;
                           AV46ValCprM = A749PrdValCprM ;
                        }
                     }
                  }
               }
               brk6FQ6 = true ;
               pr_default.readNext(3);
            }
            if ( AV35ComAcAn.doubleValue() != 0 )
            {
               AV37PUniAcu = AV38CA1.multiply(DecimalUtil.doubleToDec(100)).divide(AV35ComAcAn, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV37PUniAcu = DecimalUtil.doubleToDec(0) ;
            }
            if ( AV36ComVAcAn.doubleValue() != 0 )
            {
               AV40PValAcu = AV39VCA1.multiply(DecimalUtil.doubleToDec(100)).divide(AV36ComVAcAn, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV40PValAcu = DecimalUtil.doubleToDec(0) ;
            }
            if ( AV31CompAc.doubleValue() != 0 )
            {
               AV32PorcCom = AV45UniCprM.multiply(DecimalUtil.doubleToDec(100)).divide(AV31CompAc, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV32PorcCom = DecimalUtil.doubleToDec(0) ;
            }
            if ( AV33ValCom.doubleValue() != 0 )
            {
               AV34PValCom = AV46ValCprM.multiply(DecimalUtil.doubleToDec(100)).divide(AV33ValCom, 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV34PValCom = DecimalUtil.doubleToDec(0) ;
            }
            AV44TotPVal = AV44TotPVal.add(AV34PValCom) ;
            AV43TotVal = AV43TotVal.add(AV46ValCprM) ;
            AV42TotPAcu = AV42TotPAcu.add(AV40PValAcu) ;
            AV41TotVCA1 = AV41TotVCA1.add(AV39VCA1) ;
            AV67Tot_com = AV67Tot_com.add(AV45UniCprM) ;
            AV68Tot_com_a = AV68Tot_com_a.add(AV38CA1) ;
            if ( ( AV45UniCprM.doubleValue() == 0 ) && ( AV38CA1.doubleValue() == 0 ) )
            {
            }
            else
            {
               h6FQ0( false, 16) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 13, Gx_line+2, 45, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 50, Gx_line+1, 241, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45UniCprM, "ZZZZZZ9.99")), 248, Gx_line+0, 322, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32PorcCom, "ZZ9.99")), 328, Gx_line+1, 360, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46ValCprM, "ZZZZZZZZ9.99")), 372, Gx_line+0, 461, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34PValCom, "ZZ9.99")), 467, Gx_line+1, 499, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38CA1, "ZZZZZZ9.99")), 520, Gx_line+0, 594, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37PUniAcu, "ZZ9.99")), 596, Gx_line+1, 628, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39VCA1, "ZZZZZZZZ9.99")), 630, Gx_line+0, 719, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40PValAcu, "ZZ9.99")), 726, Gx_line+1, 758, Gx_line+15, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
            }
            if ( ! brk6FQ6 )
            {
               brk6FQ6 = true ;
               pr_default.readNext(3);
            }
         }
         pr_default.close(3);
         /* Execute user subroutine: 'FAMILIA' */
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
         h6FQ0( false, 39) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit12, "")), 168, Gx_line+13, 205, Gx_line+30, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43TotVal, "ZZZ,ZZZ,ZZZ.99")), 357, Gx_line+14, 460, Gx_line+30, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TotPVal, "ZZ9.99")), 467, Gx_line+15, 499, Gx_line+29, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TotVCA1, "Z,ZZZ,ZZ9.99")), 630, Gx_line+14, 719, Gx_line+30, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42TotPAcu, "ZZ9.99")), 726, Gx_line+15, 758, Gx_line+29, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(93, Gx_line+8, 770, Gx_line+33, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67Tot_com, "Z,ZZZ,ZZ9.99")), 233, Gx_line+14, 322, Gx_line+30, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68Tot_com_a, "Z,ZZZ,ZZ9.99")), 505, Gx_line+14, 594, Gx_line+30, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+39) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6FQ0( true, 0) ;
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
      /* 'FAMILIA' Routine */
      returnInSub = false ;
      if ( AV66F_carvema == 1 )
      {
         AV65GRPFAMDSC = "" ;
         /* Using cursor P06FQ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV60PrdNumi});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A499GrpFamCod = P06FQ6_A499GrpFamCod[0] ;
            A500GrpFamDsc = P06FQ6_A500GrpFamDsc[0] ;
            n500GrpFamDsc = P06FQ6_n500GrpFamDsc[0] ;
            AV65GRPFAMDSC = GXutil.substring( A500GrpFamDsc, 1, 20) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         h6FQ0( false, 34) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61UniCprmP, "ZZZZZZ9.99")), 248, Gx_line+8, 322, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62ValCprMP, "ZZZZZZZZ9.99")), 372, Gx_line+8, 461, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63Ca1P, "ZZZZZZ9.99")), 505, Gx_line+8, 579, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64Vca1P, "ZZZZZZZZ9.99")), 630, Gx_line+8, 719, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65GRPFAMDSC, "")), 50, Gx_line+7, 197, Gx_line+24, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+34) ;
      }
   }

   public void h6FQ0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 15, Gx_line+17, 235, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit1, "")), 417, Gx_line+18, 454, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 483, Gx_line+18, 534, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit2, "")), 592, Gx_line+18, 622, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 627, Gx_line+18, 728, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit0, "")), 15, Gx_line+50, 382, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit3, "")), 569, Gx_line+51, 614, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 651, Gx_line+51, 696, Gx_line+68, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit4, "")), 28, Gx_line+94, 51, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25Any), "ZZZ9")), 74, Gx_line+94, 104, Gx_line+111, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit5, "")), 116, Gx_line+94, 139, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21Mes), "Z9")), 146, Gx_line+94, 162, Gx_line+111, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 339, Gx_line+133, 349, Gx_line+147, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 488, Gx_line+133, 498, Gx_line+147, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 604, Gx_line+133, 614, Gx_line+147, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 747, Gx_line+133, 757, Gx_line+147, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit6, "")), 13, Gx_line+133, 77, Gx_line+149, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit7, "")), 78, Gx_line+133, 136, Gx_line+149, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit8, "")), 263, Gx_line+133, 322, Gx_line+149, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit9, "")), 401, Gx_line+133, 460, Gx_line+149, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit10, "")), 542, Gx_line+133, 594, Gx_line+149, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit11, "")), 659, Gx_line+133, 718, Gx_line+149, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(8, Gx_line+78, 759, Gx_line+78, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(24, Gx_line+89, 177, Gx_line+117, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(8, Gx_line+153, 759, Gx_line+153, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(WCO0003)", ""), 399, Gx_line+52, 459, Gx_line+67, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+167) ;
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
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      A396EmprCod = "" ;
      AV15ImpCod = "" ;
      AV16PProd = "" ;
      AV17UProd = "" ;
      AV47Lit0 = "" ;
      AV48Lit1 = "" ;
      AV49Lit2 = "" ;
      AV50Lit3 = "" ;
      AV51Lit4 = "" ;
      AV52Lit5 = "" ;
      AV53Lit6 = "" ;
      AV54Lit7 = "" ;
      AV55Lit8 = "" ;
      AV56Lit9 = "" ;
      AV57Lit10 = "" ;
      AV58Lit11 = "" ;
      AV59Lit12 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P06FQ2_A396EmprCod = new String[] {""} ;
      P06FQ2_A407EmprNom = new String[] {""} ;
      P06FQ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24NomEmp = "" ;
      c745PrdUniCprM = DecimalUtil.ZERO ;
      c749PrdValCprM = DecimalUtil.ZERO ;
      P06FQ3_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FQ3_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV31CompAc = DecimalUtil.ZERO ;
      AV33ValCom = DecimalUtil.ZERO ;
      P06FQ4_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FQ4_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV35ComAcAn = DecimalUtil.ZERO ;
      AV36ComVAcAn = DecimalUtil.ZERO ;
      AV60PrdNumi = "" ;
      P06FQ5_A396EmprCod = new String[] {""} ;
      P06FQ5_A720PrdNumMes = new byte[1] ;
      P06FQ5_A681PrdAny = new short[1] ;
      P06FQ5_A795PrvNum = new int[1] ;
      P06FQ5_A719PrdNum = new String[] {""} ;
      P06FQ5_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FQ5_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FQ5_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV61UniCprmP = DecimalUtil.ZERO ;
      AV45UniCprM = DecimalUtil.ZERO ;
      AV62ValCprMP = DecimalUtil.ZERO ;
      AV46ValCprM = DecimalUtil.ZERO ;
      AV63Ca1P = DecimalUtil.ZERO ;
      AV38CA1 = DecimalUtil.ZERO ;
      AV64Vca1P = DecimalUtil.ZERO ;
      AV39VCA1 = DecimalUtil.ZERO ;
      AV37PUniAcu = DecimalUtil.ZERO ;
      AV40PValAcu = DecimalUtil.ZERO ;
      AV32PorcCom = DecimalUtil.ZERO ;
      AV34PValCom = DecimalUtil.ZERO ;
      AV44TotPVal = DecimalUtil.ZERO ;
      AV43TotVal = DecimalUtil.ZERO ;
      AV42TotPAcu = DecimalUtil.ZERO ;
      AV41TotVCA1 = DecimalUtil.ZERO ;
      AV67Tot_com = DecimalUtil.ZERO ;
      AV68Tot_com_a = DecimalUtil.ZERO ;
      AV65GRPFAMDSC = "" ;
      P06FQ6_A396EmprCod = new String[] {""} ;
      P06FQ6_A499GrpFamCod = new byte[1] ;
      P06FQ6_A500GrpFamDsc = new String[] {""} ;
      P06FQ6_n500GrpFamDsc = new boolean[] {false} ;
      A500GrpFamDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rco0003__default(),
         new Object[] {
             new Object[] {
            P06FQ2_A396EmprCod, P06FQ2_A407EmprNom, P06FQ2_n407EmprNom
            }
            , new Object[] {
            P06FQ3_A745PrdUniCprM, P06FQ3_A749PrdValCprM
            }
            , new Object[] {
            P06FQ4_A745PrdUniCprM, P06FQ4_A749PrdValCprM
            }
            , new Object[] {
            P06FQ5_A396EmprCod, P06FQ5_A720PrdNumMes, P06FQ5_A681PrdAny, P06FQ5_A795PrvNum, P06FQ5_A719PrdNum, P06FQ5_A745PrdUniCprM, P06FQ5_A749PrdValCprM, P06FQ5_A718PrdNom
            }
            , new Object[] {
            P06FQ6_A396EmprCod, P06FQ6_A499GrpFamCod, P06FQ6_A500GrpFamDsc, P06FQ6_n500GrpFamDsc
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

   private byte AV21Mes ;
   private byte AV22Font ;
   private byte AV66F_carvema ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A720PrdNumMes ;
   private byte A499GrpFamCod ;
   private short gxcookieaux ;
   private short AV25Any ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int AV18PProv ;
   private int AV19UProv ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal c745PrdUniCprM ;
   private java.math.BigDecimal c749PrdValCprM ;
   private java.math.BigDecimal AV31CompAc ;
   private java.math.BigDecimal AV33ValCom ;
   private java.math.BigDecimal AV35ComAcAn ;
   private java.math.BigDecimal AV36ComVAcAn ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal AV61UniCprmP ;
   private java.math.BigDecimal AV45UniCprM ;
   private java.math.BigDecimal AV62ValCprMP ;
   private java.math.BigDecimal AV46ValCprM ;
   private java.math.BigDecimal AV63Ca1P ;
   private java.math.BigDecimal AV38CA1 ;
   private java.math.BigDecimal AV64Vca1P ;
   private java.math.BigDecimal AV39VCA1 ;
   private java.math.BigDecimal AV37PUniAcu ;
   private java.math.BigDecimal AV40PValAcu ;
   private java.math.BigDecimal AV32PorcCom ;
   private java.math.BigDecimal AV34PValCom ;
   private java.math.BigDecimal AV44TotPVal ;
   private java.math.BigDecimal AV43TotVal ;
   private java.math.BigDecimal AV42TotPAcu ;
   private java.math.BigDecimal AV41TotVCA1 ;
   private java.math.BigDecimal AV67Tot_com ;
   private java.math.BigDecimal AV68Tot_com_a ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PProd ;
   private String AV17UProd ;
   private String AV47Lit0 ;
   private String AV48Lit1 ;
   private String AV49Lit2 ;
   private String AV50Lit3 ;
   private String AV51Lit4 ;
   private String AV52Lit5 ;
   private String AV53Lit6 ;
   private String AV54Lit7 ;
   private String AV55Lit8 ;
   private String AV56Lit9 ;
   private String AV57Lit10 ;
   private String AV58Lit11 ;
   private String AV59Lit12 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24NomEmp ;
   private String AV60PrdNumi ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV65GRPFAMDSC ;
   private String A500GrpFamDsc ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6FQ6 ;
   private boolean returnInSub ;
   private boolean n500GrpFamDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P06FQ2_A396EmprCod ;
   private String[] P06FQ2_A407EmprNom ;
   private boolean[] P06FQ2_n407EmprNom ;
   private java.math.BigDecimal[] P06FQ3_A745PrdUniCprM ;
   private java.math.BigDecimal[] P06FQ3_A749PrdValCprM ;
   private java.math.BigDecimal[] P06FQ4_A745PrdUniCprM ;
   private java.math.BigDecimal[] P06FQ4_A749PrdValCprM ;
   private String[] P06FQ5_A396EmprCod ;
   private byte[] P06FQ5_A720PrdNumMes ;
   private short[] P06FQ5_A681PrdAny ;
   private int[] P06FQ5_A795PrvNum ;
   private String[] P06FQ5_A719PrdNum ;
   private java.math.BigDecimal[] P06FQ5_A745PrdUniCprM ;
   private java.math.BigDecimal[] P06FQ5_A749PrdValCprM ;
   private String[] P06FQ5_A718PrdNom ;
   private String[] P06FQ6_A396EmprCod ;
   private byte[] P06FQ6_A499GrpFamCod ;
   private String[] P06FQ6_A500GrpFamDsc ;
   private boolean[] P06FQ6_n500GrpFamDsc ;
}

final  class rco0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06FQ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06FQ3", "SELECT SUM(T1.PrdUniCprM), SUM(T1.PrdValCprM) FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAny = ? and T1.PrdNumMes = ?) AND (T2.PrvNum >= ? and T2.PrvNum <= ?) AND (T1.PrdNum <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FQ4", "SELECT SUM(T1.PrdUniCprM), SUM(T1.PrdValCprM) FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAny = ?) AND (T2.PrvNum >= ? and T2.PrvNum <= ?) AND (T1.PrdNumMes <= ?) AND (T1.PrdNum <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FQ5", "SELECT T1.EmprCod, T1.PrdNumMes, T1.PrdAny, T2.PrvNum, T1.PrdNum, T1.PrdUniCprM, T1.PrdValCprM, T2.PrdNom FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAny = ?) AND (T2.PrvNum >= ? and T2.PrvNum <= ?) AND (T1.PrdNumMes <= ?) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FQ6", "SELECT EmprCod, GrpFamCod, GrpFamDsc FROM TXPGRUFAM WHERE (EmprCod = ?) AND (TO_NUMBER(NVL(TRIM(SUBSTR(?, 1, 1)), '0')) = GrpFamCod) ORDER BY EmprCod, GrpFamCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

