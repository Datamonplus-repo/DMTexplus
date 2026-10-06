package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rco0002_impl extends GXWebReport
{
   public rco0002_impl( com.genexus.internet.HttpContext context )
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
            AV19Anyo = (short)(GXutil.lval( httpContext.GetPar( "Anyo"))) ;
            AV16Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
            AV17ImpCod = httpContext.GetPar( "ImpCod") ;
            AV18TotCom = CommonUtil.decimalVal( httpContext.GetPar( "TotCom"), ".") ;
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
         GXt_char1 = AV32Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit0 = GXt_char1 ;
         GXt_char1 = AV33Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit1 = GXt_char1 ;
         GXt_char1 = AV34Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2239_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit2 = GXt_char1 ;
         GXt_char1 = AV35Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit3 = GXt_char1 ;
         GXt_char1 = AV36Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit4 = GXt_char1 ;
         GXt_char1 = AV37Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit5 = GXt_char1 ;
         GXt_char1 = AV38Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2358_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit6 = GXt_char1 ;
         GXt_char1 = AV39Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2007_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit7 = GXt_char1 ;
         GXt_char1 = AV40Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit8 = GXt_char1 ;
         GXt_char1 = AV41Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit9 = GXt_char1 ;
         GXt_char1 = AV42Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit10 = GXt_char1 ;
         GXt_char1 = AV43Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit11 = GXt_char1 ;
         GXt_char1 = AV44Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit12 = GXt_char1 ;
         GXt_char1 = AV45Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit13 = GXt_char1 ;
         GXt_char1 = AV46Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
         rco0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit14 = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV19Anyo ;
         new app.pordprv(remoteHandle, context).execute( GXv_char2, GXv_int3) ;
         rco0002_impl.this.A396EmprCod = GXv_char2[0] ;
         rco0002_impl.this.AV19Anyo = GXv_int3[0] ;
         /* Using cursor P06FP2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06FP2_A407EmprNom[0] ;
            n407EmprNom = P06FP2_n407EmprNom[0] ;
            AV20NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV21Porcen = DecimalUtil.doubleToDec(0) ;
         AV22PorAcu = DecimalUtil.doubleToDec(0) ;
         AV23PorcGrp = DecimalUtil.doubleToDec(0) ;
         AV24TotGrp = DecimalUtil.doubleToDec(0) ;
         AV25TotInf = DecimalUtil.doubleToDec(0) ;
         AV27Flag = (byte)(1) ;
         AV50Sin_c = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06FP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV19Anyo)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A794PrvNom = P06FP3_A794PrvNom[0] ;
            n794PrvNom = P06FP3_n794PrvNom[0] ;
            A779PrvAny = P06FP3_A779PrvAny[0] ;
            A795PrvNum = P06FP3_A795PrvNum[0] ;
            A330DifEstCa1 = P06FP3_A330DifEstCa1[0] ;
            n330DifEstCa1 = P06FP3_n330DifEstCa1[0] ;
            A794PrvNom = P06FP3_A794PrvNom[0] ;
            n794PrvNom = P06FP3_n794PrvNom[0] ;
            AV28ComAcu = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P06FP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(AV16Mes)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A796PrvNumLin = P06FP4_A796PrvNumLin[0] ;
               A791PrvEstCm1 = P06FP4_A791PrvEstCm1[0] ;
               n791PrvEstCm1 = P06FP4_n791PrvEstCm1[0] ;
               A790PrvEstCm0 = P06FP4_A790PrvEstCm0[0] ;
               n790PrvEstCm0 = P06FP4_n790PrvEstCm0[0] ;
               AV28ComAcu = AV28ComAcu.add(A790PrvEstCm0).add(A791PrvEstCm1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV47PrvNum = A795PrvNum ;
            AV48PrvNom = A794PrvNom ;
            AV49Si_prov = (byte)(0) ;
            /* Using cursor P06FP5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(AV16Mes)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A796PrvNumLin = P06FP5_A796PrvNumLin[0] ;
               A790PrvEstCm0 = P06FP5_A790PrvEstCm0[0] ;
               n790PrvEstCm0 = P06FP5_n790PrvEstCm0[0] ;
               A791PrvEstCm1 = P06FP5_A791PrvEstCm1[0] ;
               n791PrvEstCm1 = P06FP5_n791PrvEstCm1[0] ;
               AV49Si_prov = (byte)(1) ;
               AV29ComPer = A791PrvEstCm1.add(A790PrvEstCm0) ;
               if ( AV18TotCom.doubleValue() != 0 )
               {
                  AV21Porcen = GXutil.roundDecimal( AV28ComAcu.multiply(DecimalUtil.doubleToDec(100)).divide(AV18TotCom, 18, java.math.RoundingMode.DOWN), 1) ;
               }
               else
               {
                  AV21Porcen = DecimalUtil.doubleToDec(0) ;
               }
               AV22PorAcu = AV22PorAcu.add(AV21Porcen) ;
               AV30TotPer = AV30TotPer.add(AV29ComPer) ;
               AV25TotInf = AV25TotInf.add(AV28ComAcu) ;
               if ( AV27Flag == 3 )
               {
                  AV27Flag = (byte)(4) ;
               }
               h6FP0( false, 17) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 15, Gx_line+0, 60, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 71, Gx_line+0, 260, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29ComPer, "ZZ,ZZZ,ZZZ,ZZ9.99")), 272, Gx_line+0, 397, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28ComAcu, "ZZ,ZZZ,ZZZ,ZZ9.99")), 436, Gx_line+0, 561, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Porcen, "ZZ9.99")), 601, Gx_line+0, 646, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV23PorcGrp = AV23PorcGrp.add(AV21Porcen) ;
               AV24TotGrp = AV24TotGrp.add(AV28ComAcu) ;
               AV31TotGrpPer = AV31TotGrpPer.add(AV29ComPer) ;
               if ( ( AV22PorAcu.doubleValue() >= 80 ) && ( AV27Flag == 1 ) )
               {
                  h6FP0( false, 33) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit9, "")), 124, Gx_line+8, 193, Gx_line+25, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotGrpPer, "ZZ,ZZZ,ZZZ,ZZ9.99")), 272, Gx_line+8, 397, Gx_line+25, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotGrp, "ZZ,ZZZ,ZZZ,ZZ9.99")), 436, Gx_line+8, 561, Gx_line+25, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23PorcGrp, "ZZ9.99")), 601, Gx_line+8, 646, Gx_line+25, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(117, Gx_line+4, 656, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+33) ;
                  AV23PorcGrp = DecimalUtil.doubleToDec(0) ;
                  AV24TotGrp = DecimalUtil.doubleToDec(0) ;
                  AV31TotGrpPer = DecimalUtil.doubleToDec(0) ;
                  AV27Flag = (byte)(2) ;
               }
               if ( ( ( AV22PorAcu.doubleValue() >= 95 ) ) && ( AV27Flag == 2 ) && ( AV24TotGrp.doubleValue() != 0 ) )
               {
                  h6FP0( false, 35) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit10, "")), 123, Gx_line+13, 192, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotGrpPer, "ZZ,ZZZ,ZZZ,ZZ9.99")), 272, Gx_line+13, 397, Gx_line+30, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotGrp, "ZZ,ZZZ,ZZZ,ZZ9.99")), 436, Gx_line+13, 561, Gx_line+30, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23PorcGrp, "ZZ9.99")), 600, Gx_line+13, 645, Gx_line+30, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(116, Gx_line+3, 655, Gx_line+32, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+35) ;
                  AV23PorcGrp = DecimalUtil.doubleToDec(0) ;
                  AV24TotGrp = DecimalUtil.doubleToDec(0) ;
                  AV31TotGrpPer = DecimalUtil.doubleToDec(0) ;
                  AV27Flag = (byte)(3) ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            if ( AV49Si_prov == 0 )
            {
               h6FP0( false, 17) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48PrvNom, "")), 71, Gx_line+1, 260, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28ComAcu, "ZZ,ZZZ,ZZZ,ZZ9.99")), 436, Gx_line+1, 561, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47PrvNum), "ZZZZZ9")), 15, Gx_line+1, 60, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV50Sin_c = AV50Sin_c.add(AV28ComAcu) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV27Flag == 4 )
         {
            h6FP0( false, 35) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit11, "")), 123, Gx_line+10, 192, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotGrpPer, "ZZ,ZZZ,ZZZ,ZZ9.99")), 272, Gx_line+10, 397, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotGrp, "ZZ,ZZZ,ZZZ,ZZ9.99")), 436, Gx_line+10, 561, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23PorcGrp, "ZZ9.99")), 600, Gx_line+10, 645, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(115, Gx_line+4, 654, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+35) ;
         }
         if ( AV50Sin_c.doubleValue() > 0 )
         {
            AV25TotInf = AV25TotInf.add(AV50Sin_c) ;
         }
         h6FP0( false, 36) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit12, "")), 123, Gx_line+11, 192, Gx_line+28, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TotPer, "ZZ,ZZZ,ZZZ,ZZ9.99")), 272, Gx_line+11, 397, Gx_line+28, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TotInf, "ZZ,ZZZ,ZZZ,ZZ9.99")), 436, Gx_line+11, 561, Gx_line+28, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22PorAcu, "ZZ9.99")), 600, Gx_line+11, 645, Gx_line+28, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(115, Gx_line+6, 654, Gx_line+33, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         if ( AV50Sin_c.doubleValue() > 0 )
         {
            AV25TotInf = AV25TotInf.add(AV50Sin_c) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6FP0( true, 0) ;
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

   public void h6FP0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20NomEmp, "")), 15, Gx_line+17, 235, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit0, "")), 442, Gx_line+17, 500, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 503, Gx_line+17, 554, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit1, "")), 573, Gx_line+17, 620, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 630, Gx_line+17, 731, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit2, "")), 15, Gx_line+47, 260, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Mes), "Z9")), 59, Gx_line+84, 75, Gx_line+101, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19Anyo), "ZZZ9")), 165, Gx_line+84, 195, Gx_line+101, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit3, "")), 549, Gx_line+47, 619, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 629, Gx_line+47, 674, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 613, Gx_line+105, 623, Gx_line+121, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit4, "")), 15, Gx_line+125, 85, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit5, "")), 84, Gx_line+125, 142, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit6, "")), 316, Gx_line+125, 397, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit7, "")), 457, Gx_line+125, 561, Gx_line+142, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit8, "")), 588, Gx_line+126, 646, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit13, "")), 15, Gx_line+84, 50, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit14, "")), 114, Gx_line+84, 161, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+70, 750, Gx_line+70, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(10, Gx_line+144, 750, Gx_line+144, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(11, Gx_line+79, 205, Gx_line+106, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(WCO0002)", ""), 284, Gx_line+47, 344, Gx_line+62, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+150) ;
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
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
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
      AV17ImpCod = "" ;
      AV18TotCom = DecimalUtil.ZERO ;
      AV32Lit0 = "" ;
      AV33Lit1 = "" ;
      AV34Lit2 = "" ;
      AV35Lit3 = "" ;
      AV36Lit4 = "" ;
      AV37Lit5 = "" ;
      AV38Lit6 = "" ;
      AV39Lit7 = "" ;
      AV40Lit8 = "" ;
      AV41Lit9 = "" ;
      AV42Lit10 = "" ;
      AV43Lit11 = "" ;
      AV44Lit12 = "" ;
      AV45Lit13 = "" ;
      AV46Lit14 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      scmdbuf = "" ;
      P06FP2_A396EmprCod = new String[] {""} ;
      P06FP2_A407EmprNom = new String[] {""} ;
      P06FP2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV20NomEmp = "" ;
      AV21Porcen = DecimalUtil.ZERO ;
      AV22PorAcu = DecimalUtil.ZERO ;
      AV23PorcGrp = DecimalUtil.ZERO ;
      AV24TotGrp = DecimalUtil.ZERO ;
      AV25TotInf = DecimalUtil.ZERO ;
      AV50Sin_c = DecimalUtil.ZERO ;
      P06FP3_A396EmprCod = new String[] {""} ;
      P06FP3_A794PrvNom = new String[] {""} ;
      P06FP3_n794PrvNom = new boolean[] {false} ;
      P06FP3_A779PrvAny = new short[1] ;
      P06FP3_A795PrvNum = new int[1] ;
      P06FP3_A330DifEstCa1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FP3_n330DifEstCa1 = new boolean[] {false} ;
      A794PrvNom = "" ;
      A330DifEstCa1 = DecimalUtil.ZERO ;
      AV28ComAcu = DecimalUtil.ZERO ;
      P06FP4_A396EmprCod = new String[] {""} ;
      P06FP4_A795PrvNum = new int[1] ;
      P06FP4_A779PrvAny = new short[1] ;
      P06FP4_A796PrvNumLin = new byte[1] ;
      P06FP4_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FP4_n791PrvEstCm1 = new boolean[] {false} ;
      P06FP4_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FP4_n790PrvEstCm0 = new boolean[] {false} ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      AV48PrvNom = "" ;
      P06FP5_A396EmprCod = new String[] {""} ;
      P06FP5_A795PrvNum = new int[1] ;
      P06FP5_A779PrvAny = new short[1] ;
      P06FP5_A796PrvNumLin = new byte[1] ;
      P06FP5_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FP5_n790PrvEstCm0 = new boolean[] {false} ;
      P06FP5_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FP5_n791PrvEstCm1 = new boolean[] {false} ;
      AV29ComPer = DecimalUtil.ZERO ;
      AV30TotPer = DecimalUtil.ZERO ;
      AV31TotGrpPer = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rco0002__default(),
         new Object[] {
             new Object[] {
            P06FP2_A396EmprCod, P06FP2_A407EmprNom, P06FP2_n407EmprNom
            }
            , new Object[] {
            P06FP3_A396EmprCod, P06FP3_A794PrvNom, P06FP3_n794PrvNom, P06FP3_A779PrvAny, P06FP3_A795PrvNum, P06FP3_A330DifEstCa1, P06FP3_n330DifEstCa1
            }
            , new Object[] {
            P06FP4_A396EmprCod, P06FP4_A795PrvNum, P06FP4_A779PrvAny, P06FP4_A796PrvNumLin, P06FP4_A791PrvEstCm1, P06FP4_n791PrvEstCm1, P06FP4_A790PrvEstCm0, P06FP4_n790PrvEstCm0
            }
            , new Object[] {
            P06FP5_A396EmprCod, P06FP5_A795PrvNum, P06FP5_A779PrvAny, P06FP5_A796PrvNumLin, P06FP5_A790PrvEstCm0, P06FP5_n790PrvEstCm0, P06FP5_A791PrvEstCm1, P06FP5_n791PrvEstCm1
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

   private byte AV16Mes ;
   private byte AV27Flag ;
   private byte A796PrvNumLin ;
   private byte AV49Si_prov ;
   private short gxcookieaux ;
   private short AV19Anyo ;
   private short GXv_int3[] ;
   private short A779PrvAny ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int AV47PrvNum ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV18TotCom ;
   private java.math.BigDecimal AV21Porcen ;
   private java.math.BigDecimal AV22PorAcu ;
   private java.math.BigDecimal AV23PorcGrp ;
   private java.math.BigDecimal AV24TotGrp ;
   private java.math.BigDecimal AV25TotInf ;
   private java.math.BigDecimal AV50Sin_c ;
   private java.math.BigDecimal A330DifEstCa1 ;
   private java.math.BigDecimal AV28ComAcu ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal AV29ComPer ;
   private java.math.BigDecimal AV30TotPer ;
   private java.math.BigDecimal AV31TotGrpPer ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV17ImpCod ;
   private String AV32Lit0 ;
   private String AV33Lit1 ;
   private String AV34Lit2 ;
   private String AV35Lit3 ;
   private String AV36Lit4 ;
   private String AV37Lit5 ;
   private String AV38Lit6 ;
   private String AV39Lit7 ;
   private String AV40Lit8 ;
   private String AV41Lit9 ;
   private String AV42Lit10 ;
   private String AV43Lit11 ;
   private String AV44Lit12 ;
   private String AV45Lit13 ;
   private String AV46Lit14 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV20NomEmp ;
   private String A794PrvNom ;
   private String AV48PrvNom ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean n330DifEstCa1 ;
   private boolean n791PrvEstCm1 ;
   private boolean n790PrvEstCm0 ;
   private IDataStoreProvider pr_default ;
   private String[] P06FP2_A396EmprCod ;
   private String[] P06FP2_A407EmprNom ;
   private boolean[] P06FP2_n407EmprNom ;
   private String[] P06FP3_A396EmprCod ;
   private String[] P06FP3_A794PrvNom ;
   private boolean[] P06FP3_n794PrvNom ;
   private short[] P06FP3_A779PrvAny ;
   private int[] P06FP3_A795PrvNum ;
   private java.math.BigDecimal[] P06FP3_A330DifEstCa1 ;
   private boolean[] P06FP3_n330DifEstCa1 ;
   private String[] P06FP4_A396EmprCod ;
   private int[] P06FP4_A795PrvNum ;
   private short[] P06FP4_A779PrvAny ;
   private byte[] P06FP4_A796PrvNumLin ;
   private java.math.BigDecimal[] P06FP4_A791PrvEstCm1 ;
   private boolean[] P06FP4_n791PrvEstCm1 ;
   private java.math.BigDecimal[] P06FP4_A790PrvEstCm0 ;
   private boolean[] P06FP4_n790PrvEstCm0 ;
   private String[] P06FP5_A396EmprCod ;
   private int[] P06FP5_A795PrvNum ;
   private short[] P06FP5_A779PrvAny ;
   private byte[] P06FP5_A796PrvNumLin ;
   private java.math.BigDecimal[] P06FP5_A790PrvEstCm0 ;
   private boolean[] P06FP5_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P06FP5_A791PrvEstCm1 ;
   private boolean[] P06FP5_n791PrvEstCm1 ;
}

final  class rco0002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06FP2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06FP3", "SELECT T1.EmprCod, T2.PrvNom, T1.PrvAny, T1.PrvNum, T1.DifEstCa1 FROM (TXPCPRVES T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE (T1.EmprCod = ?) AND (T1.PrvAny = ?) ORDER BY T1.EmprCod, T1.DifEstCa1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FP4", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm1, PrvEstCm0 FROM TXPLPRVES WHERE (EmprCod = ? and PrvNum = ? and PrvAny = ?) AND (PrvNumLin <= ?) ORDER BY EmprCod, PrvNum, PrvAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FP5", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

