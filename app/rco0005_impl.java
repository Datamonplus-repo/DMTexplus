package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rco0005_impl extends GXWebReport
{
   public rco0005_impl( com.genexus.internet.HttpContext context )
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
            AV16PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV17UProv = (int)(GXutil.lval( httpContext.GetPar( "UProv"))) ;
            AV18Any = (short)(GXutil.lval( httpContext.GetPar( "Any"))) ;
            AV19Prioridad = (byte)(GXutil.lval( httpContext.GetPar( "Prioridad"))) ;
            AV20Font = (byte)(GXutil.lval( httpContext.GetPar( "Font"))) ;
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
         GXt_char1 = AV28Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit0 = GXt_char1 ;
         GXt_char1 = AV29Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit1 = GXt_char1 ;
         GXt_char1 = AV30Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2136_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit2 = GXt_char1 ;
         GXt_char1 = AV31Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit3 = GXt_char1 ;
         GXt_char1 = AV32Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN735_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit4 = GXt_char1 ;
         GXt_char1 = AV33Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1542_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit5 = GXt_char1 ;
         GXt_char1 = AV34Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN363_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit6 = GXt_char1 ;
         GXt_char1 = AV35Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2124_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit7 = GXt_char1 ;
         GXt_char1 = AV36Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2164_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit8 = GXt_char1 ;
         GXt_char1 = AV37Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2280_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit9 = GXt_char1 ;
         GXt_char1 = AV38Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2002_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit10 = GXt_char1 ;
         GXt_char1 = AV39Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2286_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit11 = GXt_char1 ;
         GXt_char1 = AV40Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2210_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit12 = GXt_char1 ;
         GXt_char1 = AV41Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2208_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit13 = GXt_char1 ;
         GXt_char1 = AV42Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2009_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit14 = GXt_char1 ;
         GXt_char1 = AV43Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2425_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit15 = GXt_char1 ;
         GXt_char1 = AV44Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2330_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit16 = GXt_char1 ;
         GXt_char1 = AV45Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2324_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit17 = GXt_char1 ;
         GXt_char1 = AV46Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2110_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit18 = GXt_char1 ;
         GXt_char1 = AV47Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN723_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit19 = GXt_char1 ;
         GXt_char1 = AV48Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2029_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit20 = GXt_char1 ;
         GXt_char1 = AV49Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1359_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit21 = GXt_char1 ;
         GXt_char1 = AV50Lit22 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN366_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit22 = GXt_char1 ;
         GXt_char1 = AV51Lit23 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1189_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit23 = GXt_char1 ;
         GXt_char1 = AV52Lit24 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2182_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit24 = GXt_char1 ;
         GXt_char1 = AV53Lit25 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN395_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit25 = GXt_char1 ;
         GXt_char1 = AV54Lit26 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2527_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit26 = GXt_char1 ;
         GXt_char1 = AV55Lit27 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2200_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit27 = GXt_char1 ;
         GXt_char1 = AV56Lit28 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2526_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit28 = GXt_char1 ;
         GXt_char1 = AV57Lit29 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2201_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit29 = GXt_char1 ;
         GXt_char1 = AV58Lit30 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit30 = GXt_char1 ;
         GXt_char1 = AV59Lit31 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN149_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit31 = GXt_char1 ;
         GXt_char1 = AV60Lit32 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1123_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV60Lit32 = GXt_char1 ;
         GXt_char1 = AV61Lit33 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
         rco0005_impl.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit33 = GXt_char1 ;
         /* Using cursor P06FS2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06FS2_A407EmprNom[0] ;
            n407EmprNom = P06FS2_n407EmprNom[0] ;
            AV21NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV26TotGen = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06FS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16PProv), Integer.valueOf(AV17UProv)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A795PrvNum = P06FS3_A795PrvNum[0] ;
            A794PrvNom = P06FS3_A794PrvNom[0] ;
            n794PrvNom = P06FS3_n794PrvNom[0] ;
            AV25TotUniCpr = DecimalUtil.doubleToDec(0) ;
            GX_I = 1 ;
            while ( GX_I <= 12 )
            {
               AV22UniCprMes[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV24I = (byte)(1) ;
            while ( AV24I <= 12 )
            {
               AV22UniCprMes[AV24I-1] = DecimalUtil.doubleToDec(0) ;
               AV24I = (byte)(AV24I+1) ;
            }
            /* Using cursor P06FS4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(AV18Any)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A779PrvAny = P06FS4_A779PrvAny[0] ;
               A796PrvNumLin = P06FS4_A796PrvNumLin[0] ;
               A791PrvEstCm1 = P06FS4_A791PrvEstCm1[0] ;
               n791PrvEstCm1 = P06FS4_n791PrvEstCm1[0] ;
               A790PrvEstCm0 = P06FS4_A790PrvEstCm0[0] ;
               n790PrvEstCm0 = P06FS4_n790PrvEstCm0[0] ;
               AV24I = A796PrvNumLin ;
               if ( AV19Prioridad == 1 )
               {
                  AV22UniCprMes[AV24I-1] = A791PrvEstCm1 ;
                  AV25TotUniCpr = AV25TotUniCpr.add(A791PrvEstCm1) ;
               }
               if ( AV19Prioridad == 0 )
               {
                  AV22UniCprMes[AV24I-1] = A790PrvEstCm0 ;
                  AV25TotUniCpr = AV25TotUniCpr.add(A790PrvEstCm0) ;
               }
               if ( AV19Prioridad == 2 )
               {
                  AV22UniCprMes[AV24I-1] = A791PrvEstCm1.add(A790PrvEstCm0) ;
                  AV25TotUniCpr = AV25TotUniCpr.add(A791PrvEstCm1).add(A790PrvEstCm0) ;
               }
               if ( AV19Prioridad == 1 )
               {
                  AV27UniCprTot[AV24I-1] = AV27UniCprTot[AV24I-1].add(A791PrvEstCm1) ;
               }
               if ( AV19Prioridad == 0 )
               {
                  AV27UniCprTot[AV24I-1] = AV27UniCprTot[AV24I-1].add(A790PrvEstCm0) ;
               }
               if ( AV19Prioridad == 2 )
               {
                  AV27UniCprTot[AV24I-1] = AV27UniCprTot[AV24I-1].add(A791PrvEstCm1).add(A790PrvEstCm0) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h6FS0( false, 48) ;
            getPrinter().GxAttris("Arial", 7, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 143, Gx_line+6, 269, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[1-1], "ZZZZZZZZ9.99")), 14, Gx_line+25, 78, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[2-1], "ZZZZZZZZ9.99")), 99, Gx_line+25, 163, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[3-1], "ZZZZZZZZ9.99")), 179, Gx_line+25, 243, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[4-1], "ZZZZZZZZ9.99")), 256, Gx_line+25, 320, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[5-1], "ZZZZZZZZ9.99")), 333, Gx_line+25, 397, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[6-1], "ZZZZZZZZ9.99")), 414, Gx_line+25, 478, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[7-1], "ZZZZZZZZ9.99")), 505, Gx_line+25, 569, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[8-1], "ZZZZZZZZ9.99")), 582, Gx_line+25, 646, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[9-1], "ZZZZZZZZ9.99")), 664, Gx_line+25, 728, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[10-1], "ZZZZZZZZ9.99")), 766, Gx_line+25, 830, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[11-1], "ZZZZZZZZ9.99")), 873, Gx_line+25, 937, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22UniCprMes[12-1], "ZZZZZZZZ9.99")), 971, Gx_line+25, 1035, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TotUniCpr, "ZZZ,ZZZ,ZZ9.99")), 1042, Gx_line+25, 1116, Gx_line+38, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 107, Gx_line+6, 139, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit33, "")), 50, Gx_line+6, 103, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+43, 1151, Gx_line+43, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+48) ;
            AV26TotGen = AV26TotGen.add(AV25TotUniCpr) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         h6FS0( false, 32) ;
         getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[1-1], "ZZZ,ZZZ,ZZ9.99")), 3, Gx_line+11, 77, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[2-1], "ZZZ,ZZZ,ZZ9.99")), 89, Gx_line+11, 163, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[3-1], "ZZZ,ZZZ,ZZ9.99")), 169, Gx_line+11, 243, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[4-1], "ZZZ,ZZZ,ZZ9.99")), 248, Gx_line+11, 322, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[5-1], "ZZZ,ZZZ,ZZ9.99")), 323, Gx_line+11, 397, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[6-1], "ZZZ,ZZZ,ZZ9.99")), 403, Gx_line+11, 477, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[7-1], "ZZZ,ZZZ,ZZ9.99")), 495, Gx_line+11, 569, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[8-1], "ZZZ,ZZZ,ZZ9.99")), 572, Gx_line+11, 646, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[9-1], "ZZZ,ZZZ,ZZ9.99")), 653, Gx_line+11, 727, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[10-1], "ZZZ,ZZZ,ZZ9.99")), 755, Gx_line+11, 829, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[11-1], "ZZZ,ZZZ,ZZ9.99")), 863, Gx_line+11, 937, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27UniCprTot[12-1], "ZZZ,ZZZ,ZZ9.99")), 960, Gx_line+11, 1034, Gx_line+25, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotGen, "ZZZ,ZZZ,ZZ9.99")), 1042, Gx_line+11, 1116, Gx_line+24, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(2, Gx_line+4, 1160, Gx_line+4, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(2, Gx_line+28, 1160, Gx_line+28, 2, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+32) ;
         if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV63WebSession.getValue("Proceso_CO0005"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
         {
            AV63WebSession.remove("Proceso_CO0005");
            AV62ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
            AV62ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
            AV62ProgressIndicator.hide();
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6FS0( true, 0) ;
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

   public void h6FS0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21NomEmp, "")), 21, Gx_line+17, 241, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit0, "")), 828, Gx_line+18, 855, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 903, Gx_line+18, 954, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit1, "")), 978, Gx_line+18, 1000, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 1049, Gx_line+18, 1150, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit3, "")), 955, Gx_line+48, 987, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1049, Gx_line+48, 1094, Gx_line+65, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 127, Gx_line+93, 132, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 144, Gx_line+93, 149, Gx_line+109, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit4, "")), 20, Gx_line+93, 37, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Any), "ZZZ9")), 76, Gx_line+93, 106, Gx_line+110, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19Prioridad), "9")), 134, Gx_line+95, 140, Gx_line+109, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit7, "")), 21, Gx_line+142, 69, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit8, "")), 97, Gx_line+142, 164, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit9, "")), 186, Gx_line+142, 234, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit10, "")), 264, Gx_line+142, 312, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit11, "")), 346, Gx_line+142, 385, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit12, "")), 417, Gx_line+142, 474, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit13, "")), 508, Gx_line+142, 565, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit14, "")), 585, Gx_line+142, 642, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit15, "")), 689, Gx_line+142, 728, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit16, "")), 763, Gx_line+142, 830, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit17, "")), 851, Gx_line+142, 936, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit18, "")), 959, Gx_line+142, 1044, Gx_line+156, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit19, "")), 1063, Gx_line+141, 1116, Gx_line+157, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit32, "")), 21, Gx_line+47, 266, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+74, 1151, Gx_line+74, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+157, 1151, Gx_line+157, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+85, 174, Gx_line+118, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(WCO0005)", ""), 322, Gx_line+47, 382, Gx_line+62, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+161) ;
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
      AV15ImpCod = "" ;
      AV28Lit0 = "" ;
      AV29Lit1 = "" ;
      AV30Lit2 = "" ;
      AV31Lit3 = "" ;
      AV32Lit4 = "" ;
      AV33Lit5 = "" ;
      AV34Lit6 = "" ;
      AV35Lit7 = "" ;
      AV36Lit8 = "" ;
      AV37Lit9 = "" ;
      AV38Lit10 = "" ;
      AV39Lit11 = "" ;
      AV40Lit12 = "" ;
      AV41Lit13 = "" ;
      AV42Lit14 = "" ;
      AV43Lit15 = "" ;
      AV44Lit16 = "" ;
      AV45Lit17 = "" ;
      AV46Lit18 = "" ;
      AV47Lit19 = "" ;
      AV48Lit20 = "" ;
      AV49Lit21 = "" ;
      AV50Lit22 = "" ;
      AV51Lit23 = "" ;
      AV52Lit24 = "" ;
      AV53Lit25 = "" ;
      AV54Lit26 = "" ;
      AV55Lit27 = "" ;
      AV56Lit28 = "" ;
      AV57Lit29 = "" ;
      AV58Lit30 = "" ;
      AV59Lit31 = "" ;
      AV60Lit32 = "" ;
      AV61Lit33 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06FS2_A396EmprCod = new String[] {""} ;
      P06FS2_A407EmprNom = new String[] {""} ;
      P06FS2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV21NomEmp = "" ;
      AV26TotGen = DecimalUtil.ZERO ;
      P06FS3_A396EmprCod = new String[] {""} ;
      P06FS3_A795PrvNum = new int[1] ;
      P06FS3_A794PrvNom = new String[] {""} ;
      P06FS3_n794PrvNom = new boolean[] {false} ;
      A794PrvNom = "" ;
      AV25TotUniCpr = DecimalUtil.ZERO ;
      AV22UniCprMes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV22UniCprMes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P06FS4_A396EmprCod = new String[] {""} ;
      P06FS4_A795PrvNum = new int[1] ;
      P06FS4_A779PrvAny = new short[1] ;
      P06FS4_A796PrvNumLin = new byte[1] ;
      P06FS4_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FS4_n791PrvEstCm1 = new boolean[] {false} ;
      P06FS4_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06FS4_n790PrvEstCm0 = new boolean[] {false} ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      AV27UniCprTot = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV27UniCprTot[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV63WebSession = httpContext.getWebSession();
      AV62ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rco0005__default(),
         new Object[] {
             new Object[] {
            P06FS2_A396EmprCod, P06FS2_A407EmprNom, P06FS2_n407EmprNom
            }
            , new Object[] {
            P06FS3_A396EmprCod, P06FS3_A795PrvNum, P06FS3_A794PrvNom, P06FS3_n794PrvNom
            }
            , new Object[] {
            P06FS4_A396EmprCod, P06FS4_A795PrvNum, P06FS4_A779PrvAny, P06FS4_A796PrvNumLin, P06FS4_A791PrvEstCm1, P06FS4_n791PrvEstCm1, P06FS4_A790PrvEstCm0, P06FS4_n790PrvEstCm0
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

   private byte AV19Prioridad ;
   private byte AV20Font ;
   private byte AV24I ;
   private byte A796PrvNumLin ;
   private short gxcookieaux ;
   private short AV18Any ;
   private short A779PrvAny ;
   private short Gx_err ;
   private int AV16PProv ;
   private int AV17UProv ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int GX_I ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV26TotGen ;
   private java.math.BigDecimal AV25TotUniCpr ;
   private java.math.BigDecimal AV22UniCprMes[] ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal AV27UniCprTot[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV28Lit0 ;
   private String AV29Lit1 ;
   private String AV30Lit2 ;
   private String AV31Lit3 ;
   private String AV32Lit4 ;
   private String AV33Lit5 ;
   private String AV34Lit6 ;
   private String AV35Lit7 ;
   private String AV36Lit8 ;
   private String AV37Lit9 ;
   private String AV38Lit10 ;
   private String AV39Lit11 ;
   private String AV40Lit12 ;
   private String AV41Lit13 ;
   private String AV42Lit14 ;
   private String AV43Lit15 ;
   private String AV44Lit16 ;
   private String AV45Lit17 ;
   private String AV46Lit18 ;
   private String AV47Lit19 ;
   private String AV48Lit20 ;
   private String AV49Lit21 ;
   private String AV50Lit22 ;
   private String AV51Lit23 ;
   private String AV52Lit24 ;
   private String AV53Lit25 ;
   private String AV54Lit26 ;
   private String AV55Lit27 ;
   private String AV56Lit28 ;
   private String AV57Lit29 ;
   private String AV58Lit30 ;
   private String AV59Lit31 ;
   private String AV60Lit32 ;
   private String AV61Lit33 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV21NomEmp ;
   private String A794PrvNom ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean n791PrvEstCm1 ;
   private boolean n790PrvEstCm0 ;
   private com.genexus.webpanels.WebSession AV63WebSession ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV62ProgressIndicator ;
   private IDataStoreProvider pr_default ;
   private String[] P06FS2_A396EmprCod ;
   private String[] P06FS2_A407EmprNom ;
   private boolean[] P06FS2_n407EmprNom ;
   private String[] P06FS3_A396EmprCod ;
   private int[] P06FS3_A795PrvNum ;
   private String[] P06FS3_A794PrvNom ;
   private boolean[] P06FS3_n794PrvNom ;
   private String[] P06FS4_A396EmprCod ;
   private int[] P06FS4_A795PrvNum ;
   private short[] P06FS4_A779PrvAny ;
   private byte[] P06FS4_A796PrvNumLin ;
   private java.math.BigDecimal[] P06FS4_A791PrvEstCm1 ;
   private boolean[] P06FS4_n791PrvEstCm1 ;
   private java.math.BigDecimal[] P06FS4_A790PrvEstCm0 ;
   private boolean[] P06FS4_n790PrvEstCm0 ;
}

final  class rco0005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06FS2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06FS3", "SELECT EmprCod, PrvNum, PrvNom FROM TXPPRVGEN WHERE (EmprCod = ? and PrvNum >= ?) AND (PrvNum <= ?) ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06FS4", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm1, PrvEstCm0 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? ORDER BY EmprCod, PrvNum, PrvAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

