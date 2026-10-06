package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rco0004n_impl extends GXWebReport
{
   public rco0004n_impl( com.genexus.internet.HttpContext context )
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
            AV24Any = (short)(GXutil.lval( httpContext.GetPar( "Any"))) ;
            AV21Font = (byte)(GXutil.lval( httpContext.GetPar( "Font"))) ;
            AV52TipoPor = (byte)(GXutil.lval( httpContext.GetPar( "TipoPor"))) ;
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
         GXt_char1 = AV30Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2265_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit0 = GXt_char1 ;
         GXt_char1 = AV31Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit1 = GXt_char1 ;
         GXt_char1 = AV32Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit2 = GXt_char1 ;
         GXt_char1 = AV33Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit3 = GXt_char1 ;
         GXt_char1 = AV34Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit4 = GXt_char1 ;
         GXt_char1 = AV35Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2125_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit5 = GXt_char1 ;
         GXt_char1 = AV36Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2165_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit6 = GXt_char1 ;
         GXt_char1 = AV37Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2281_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit7 = GXt_char1 ;
         GXt_char1 = AV38Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2003_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit8 = GXt_char1 ;
         GXt_char1 = AV39Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2287_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit9 = GXt_char1 ;
         GXt_char1 = AV40Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2211_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit10 = GXt_char1 ;
         GXt_char1 = AV41Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2209_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit11 = GXt_char1 ;
         GXt_char1 = AV42Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2010_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit12 = GXt_char1 ;
         GXt_char1 = AV43Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2426_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit13 = GXt_char1 ;
         GXt_char1 = AV44Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2331_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit14 = GXt_char1 ;
         GXt_char1 = AV45Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2325_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit15 = GXt_char1 ;
         GXt_char1 = AV46Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2109_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit16 = GXt_char1 ;
         GXt_char1 = AV50Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT419_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit19 = GXt_char1 ;
         GXt_char1 = AV58Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit20 = GXt_char1 ;
         if ( AV52TipoPor == 2 )
         {
            GXt_char1 = AV58Lit20 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
            rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
            AV58Lit20 = GXt_char1 ;
         }
         GXt_char1 = AV59Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN149_", ""), (byte)(99), GXv_char2) ;
         rco0004n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit21 = GXt_char1 ;
         /* Using cursor P07ET2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07ET2_A407EmprNom[0] ;
            n407EmprNom = P07ET2_n407EmprNom[0] ;
            AV23NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV48Total1 = DecimalUtil.doubleToDec(0) ;
         AV49Total2 = DecimalUtil.doubleToDec(0) ;
         AV51Ok_linea = (byte)(0) ;
         /* Execute user subroutine: 'TOTALES_MES' */
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
         /* Using cursor P07ET4 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PProd, Short.valueOf(AV24Any), Integer.valueOf(AV18PProv), Integer.valueOf(AV19UProv), AV17UProd});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A8360PrdProv = P07ET4_A8360PrdProv[0] ;
            A719PrdNum = P07ET4_A719PrdNum[0] ;
            A8366PrdAnyo = P07ET4_A8366PrdAnyo[0] ;
            A718PrdNom = P07ET4_A718PrdNom[0] ;
            A8361PrdUndCpA = P07ET4_A8361PrdUndCpA[0] ;
            n8361PrdUndCpA = P07ET4_n8361PrdUndCpA[0] ;
            A718PrdNom = P07ET4_A718PrdNom[0] ;
            A8361PrdUndCpA = P07ET4_A8361PrdUndCpA[0] ;
            n8361PrdUndCpA = P07ET4_n8361PrdUndCpA[0] ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A8360PrdProv ;
            GXv_char4[0] = AV61PrvNom ;
            new app.pprvnom(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            rco0004n_impl.this.A396EmprCod = GXv_char2[0] ;
            rco0004n_impl.this.A8360PrdProv = GXv_int3[0] ;
            rco0004n_impl.this.AV61PrvNom = GXv_char4[0] ;
            h7ET0( false, 35) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 45, Gx_line+9, 95, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 106, Gx_line+9, 323, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8360PrdProv), "ZZZZZ9")), 411, Gx_line+9, 456, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61PrvNom, "")), 473, Gx_line+9, 662, Gx_line+27, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+35) ;
            AV28I = (byte)(1) ;
            while ( AV28I <= 12 )
            {
               AV25Unidades[AV28I-1] = DecimalUtil.doubleToDec(0) ;
               AV26Valores[AV28I-1] = DecimalUtil.doubleToDec(0) ;
               AV27Porcen[AV28I-1] = DecimalUtil.doubleToDec(0) ;
               AV28I = (byte)(AV28I+1) ;
            }
            AV29UniAny = 0 ;
            /* Using cursor P07ET5 */
            pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(AV24Any), Integer.valueOf(A8360PrdProv)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A8366PrdAnyo = P07ET5_A8366PrdAnyo[0] ;
               A8364PrdUndCpM = P07ET5_A8364PrdUndCpM[0] ;
               A8363PrdMesL = P07ET5_A8363PrdMesL[0] ;
               A8365PrdUndCnM = P07ET5_A8365PrdUndCnM[0] ;
               AV25Unidades[A8363PrdMesL-1] = A8364PrdUndCpM ;
               AV26Valores[A8363PrdMesL-1] = A8365PrdUndCnM ;
               AV48Total1 = AV48Total1.add(A8364PrdUndCpM) ;
               AV49Total2 = AV49Total2.add(A8365PrdUndCnM) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV57Porcen_T = DecimalUtil.doubleToDec(0) ;
            AV28I = (byte)(1) ;
            if ( AV52TipoPor == 1 )
            {
               while ( AV28I <= 12 )
               {
                  if ( AV49Total2.doubleValue() != 0 )
                  {
                     AV27Porcen[AV28I-1] = (AV26Valores[AV28I-1].divide(AV49Total2, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
                  }
                  else
                  {
                     AV27Porcen[AV28I-1] = DecimalUtil.doubleToDec(0) ;
                  }
                  AV28I = (byte)(AV28I+1) ;
               }
            }
            else
            {
               while ( AV28I <= 12 )
               {
                  if ( AV56Val_Mes[AV28I-1].doubleValue() != 0 )
                  {
                     AV27Porcen[AV28I-1] = (AV26Valores[AV28I-1].divide(AV56Val_Mes[AV28I-1], 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
                  }
                  else
                  {
                     AV27Porcen[AV28I-1] = DecimalUtil.doubleToDec(0) ;
                  }
                  AV28I = (byte)(AV28I+1) ;
               }
               if ( AV55Val_Any.doubleValue() != 0 )
               {
                  AV57Porcen_T = ((AV49Total2.divide(AV55Val_Any, 18, java.math.RoundingMode.DOWN))).multiply(DecimalUtil.doubleToDec(100)) ;
               }
            }
            h7ET0( false, 53) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[1-1], "ZZZZZZ9.99")), 29, Gx_line+3, 82, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[2-1], "ZZZZZZ9.99")), 100, Gx_line+3, 153, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[3-1], "ZZZZZZ9.99")), 174, Gx_line+4, 227, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[4-1], "ZZZZZZ9.99")), 251, Gx_line+3, 304, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[5-1], "ZZZZZZ9.99")), 321, Gx_line+3, 374, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[6-1], "ZZZZZZ9.99")), 393, Gx_line+3, 446, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[7-1], "ZZZZZZ9.99")), 468, Gx_line+3, 521, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[8-1], "ZZZZZZ9.99")), 545, Gx_line+3, 598, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[9-1], "ZZZZZZ9.99")), 625, Gx_line+3, 678, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[10-1], "ZZZZZZ9.99")), 703, Gx_line+3, 756, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[11-1], "ZZZZZZ9.99")), 782, Gx_line+3, 835, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25Unidades[12-1], "ZZZZZZ9.99")), 869, Gx_line+3, 922, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[1-1], "ZZZZZZZZ9.99")), 19, Gx_line+20, 83, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[2-1], "ZZZZZZZZ9.99")), 90, Gx_line+20, 154, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[3-1], "ZZZZZZZZ9.99")), 164, Gx_line+21, 228, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[4-1], "ZZZZZZZZ9.99")), 241, Gx_line+20, 305, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+20, 374, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[6-1], "ZZZZZZZZ9.99")), 382, Gx_line+20, 446, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[7-1], "ZZZZZZZZ9.99")), 457, Gx_line+20, 521, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[8-1], "ZZZZZZZZ9.99")), 534, Gx_line+20, 598, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[9-1], "ZZZZZZZZ9.99")), 615, Gx_line+20, 679, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[10-1], "ZZZZZZZZ9.99")), 693, Gx_line+20, 757, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[11-1], "ZZZZZZZZ9.99")), 772, Gx_line+20, 836, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26Valores[12-1], "ZZZZZZZZ9.99")), 858, Gx_line+20, 922, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[1-1], "ZZ9.99")), 50, Gx_line+36, 82, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[2-1], "ZZ9.99")), 121, Gx_line+36, 153, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[3-1], "ZZ9.99")), 195, Gx_line+38, 227, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[4-1], "ZZ9.99")), 272, Gx_line+36, 304, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[5-1], "ZZ9.99")), 342, Gx_line+36, 374, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[6-1], "ZZ9.99")), 414, Gx_line+36, 446, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[7-1], "ZZ9.99")), 489, Gx_line+36, 521, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[8-1], "ZZ9.99")), 566, Gx_line+36, 598, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[9-1], "ZZ9.99")), 646, Gx_line+36, 678, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[10-1], "ZZ9.99")), 724, Gx_line+36, 756, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[11-1], "ZZ9.99")), 803, Gx_line+36, 835, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Porcen[12-1], "ZZ9.99")), 890, Gx_line+36, 922, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48Total1, "ZZ,ZZZ,ZZ9.99")), 933, Gx_line+3, 1002, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49Total2, "ZZZZZZZZ9.99")), 939, Gx_line+20, 1003, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+52, 1032, Gx_line+52, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57Porcen_T, "ZZZ.ZZ")), 970, Gx_line+36, 1002, Gx_line+50, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+53) ;
            AV48Total1 = DecimalUtil.doubleToDec(0) ;
            AV49Total2 = DecimalUtil.doubleToDec(0) ;
            AV51Ok_linea = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV51Ok_linea == 0 )
         {
            h7ET0( false, 1) ;
            getPrinter().GxDrawLine(0, Gx_line+0, 1032, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
         }
         else
         {
            h7ET0( false, 54) ;
            getPrinter().GxDrawLine(0, Gx_line+0, 1032, Gx_line+0, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54Unid_Any, "ZZZZZZZZ9.99")), 939, Gx_line+22, 1003, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[1-1], "ZZZZZZZZ9.99")), 19, Gx_line+22, 82, Gx_line+35, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55Val_Any, "ZZZZZZZZ9.99")), 939, Gx_line+38, 1003, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[1-1], "ZZZZZZZZ9.99")), 19, Gx_line+38, 82, Gx_line+51, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+53, 1032, Gx_line+53, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[2-1], "ZZZZZZZZ9.99")), 90, Gx_line+22, 154, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[2-1], "ZZZZZZZZ9.99")), 90, Gx_line+38, 154, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[3-1], "ZZZZZZZZ9.99")), 164, Gx_line+22, 228, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[3-1], "ZZZZZZZZ9.99")), 164, Gx_line+38, 228, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[4-1], "ZZZZZZZZ9.99")), 241, Gx_line+22, 305, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[4-1], "ZZZZZZZZ9.99")), 241, Gx_line+38, 305, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+22, 374, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[5-1], "ZZZZZZZZ9.99")), 310, Gx_line+38, 374, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[6-1], "ZZZZZZZZ9.99")), 382, Gx_line+22, 446, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[6-1], "ZZZZZZZZ9.99")), 382, Gx_line+38, 446, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[7-1], "ZZZZZZZZ9.99")), 457, Gx_line+22, 521, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[7-1], "ZZZZZZZZ9.99")), 457, Gx_line+38, 521, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[8-1], "ZZZZZZZZ9.99")), 534, Gx_line+22, 598, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[8-1], "ZZZZZZZZ9.99")), 534, Gx_line+38, 598, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[9-1], "ZZZZZZZZ9.99")), 615, Gx_line+22, 679, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[9-1], "ZZZZZZZZ9.99")), 615, Gx_line+38, 679, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[10-1], "ZZZZZZZZ9.99")), 693, Gx_line+22, 757, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[10-1], "ZZZZZZZZ9.99")), 693, Gx_line+38, 757, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[11-1], "ZZZZZZZZ9.99")), 772, Gx_line+22, 836, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[11-1], "ZZZZZZZZ9.99")), 772, Gx_line+38, 836, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53Unid_Mes[12-1], "ZZZZZZZZ9.99")), 858, Gx_line+22, 922, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Val_Mes[12-1], "ZZZZZZZZ9.99")), 858, Gx_line+38, 922, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit21, "")), 19, Gx_line+3, 128, Gx_line+21, 1+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+54) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7ET0( true, 0) ;
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
      /* 'TOTALES_MES' Routine */
      returnInSub = false ;
      AV28I = (byte)(1) ;
      while ( AV28I <= 12 )
      {
         AV53Unid_Mes[AV28I-1] = DecimalUtil.doubleToDec(0) ;
         AV56Val_Mes[AV28I-1] = DecimalUtil.doubleToDec(0) ;
         AV28I = (byte)(AV28I+1) ;
      }
      AV54Unid_Any = DecimalUtil.doubleToDec(0) ;
      AV55Val_Any = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P07ET6 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV16PProd, Short.valueOf(AV24Any), Integer.valueOf(AV18PProv), Integer.valueOf(AV19UProv), AV17UProd});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A8360PrdProv = P07ET6_A8360PrdProv[0] ;
         A8366PrdAnyo = P07ET6_A8366PrdAnyo[0] ;
         A719PrdNum = P07ET6_A719PrdNum[0] ;
         /* Using cursor P07ET7 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A8364PrdUndCpM = P07ET7_A8364PrdUndCpM[0] ;
            A8365PrdUndCnM = P07ET7_A8365PrdUndCnM[0] ;
            A8363PrdMesL = P07ET7_A8363PrdMesL[0] ;
            AV53Unid_Mes[A8363PrdMesL-1] = AV53Unid_Mes[A8363PrdMesL-1].add(A8364PrdUndCpM) ;
            AV56Val_Mes[A8363PrdMesL-1] = AV56Val_Mes[A8363PrdMesL-1].add(A8365PrdUndCnM) ;
            AV54Unid_Any = AV54Unid_Any.add(A8364PrdUndCpM) ;
            AV55Val_Any = AV55Val_Any.add(A8365PrdUndCnM) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void h7ET0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23NomEmp, "")), 9, Gx_line+5, 229, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit1, "")), 685, Gx_line+8, 723, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 754, Gx_line+7, 805, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit2, "")), 856, Gx_line+8, 899, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 913, Gx_line+7, 1014, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit0, "")), 9, Gx_line+32, 294, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit3, "")), 856, Gx_line+35, 904, Gx_line+50, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 913, Gx_line+34, 958, Gx_line+51, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "- Unidades", ""), 816, Gx_line+70, 877, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "- Valor", ""), 816, Gx_line+86, 853, Gx_line+101, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "- % Sobre Total Compra", ""), 816, Gx_line+103, 950, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit4, "")), 42, Gx_line+78, 74, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24Any), "ZZZ9")), 92, Gx_line+77, 122, Gx_line+94, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit5, "")), 34, Gx_line+129, 82, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit6, "")), 86, Gx_line+129, 153, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit7, "")), 179, Gx_line+129, 227, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit8, "")), 256, Gx_line+129, 304, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit9, "")), 335, Gx_line+129, 374, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit10, "")), 398, Gx_line+129, 446, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit11, "")), 473, Gx_line+129, 521, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit12, "")), 541, Gx_line+129, 598, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit13, "")), 611, Gx_line+129, 678, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit14, "")), 690, Gx_line+129, 757, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit15, "")), 769, Gx_line+129, 836, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit16, "")), 842, Gx_line+129, 919, Gx_line+142, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+59, 1032, Gx_line+59, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+146, 1032, Gx_line+146, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(30, Gx_line+70, 133, Gx_line+100, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit19, "")), 952, Gx_line+129, 1000, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Pgmname, "")), 685, Gx_line+35, 842, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit20, "")), 958, Gx_line+103, 1025, Gx_line+118, 0, 0, 0, 0) ;
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
      AV16PProd = "" ;
      AV17UProd = "" ;
      AV30Lit0 = "" ;
      AV31Lit1 = "" ;
      AV32Lit2 = "" ;
      AV33Lit3 = "" ;
      AV34Lit4 = "" ;
      AV35Lit5 = "" ;
      AV36Lit6 = "" ;
      AV37Lit7 = "" ;
      AV38Lit8 = "" ;
      AV39Lit9 = "" ;
      AV40Lit10 = "" ;
      AV41Lit11 = "" ;
      AV42Lit12 = "" ;
      AV43Lit13 = "" ;
      AV44Lit14 = "" ;
      AV45Lit15 = "" ;
      AV46Lit16 = "" ;
      AV50Lit19 = "" ;
      AV58Lit20 = "" ;
      AV59Lit21 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P07ET2_A396EmprCod = new String[] {""} ;
      P07ET2_A407EmprNom = new String[] {""} ;
      P07ET2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV23NomEmp = "" ;
      AV48Total1 = DecimalUtil.ZERO ;
      AV49Total2 = DecimalUtil.ZERO ;
      P07ET4_A396EmprCod = new String[] {""} ;
      P07ET4_A8360PrdProv = new int[1] ;
      P07ET4_A719PrdNum = new String[] {""} ;
      P07ET4_A8366PrdAnyo = new short[1] ;
      P07ET4_A718PrdNom = new String[] {""} ;
      P07ET4_A8361PrdUndCpA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ET4_n8361PrdUndCpA = new boolean[] {false} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A8361PrdUndCpA = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      AV61PrvNom = "" ;
      GXv_char4 = new String[1] ;
      AV25Unidades = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV25Unidades[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV26Valores = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV26Valores[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27Porcen = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV27Porcen[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P07ET5_A396EmprCod = new String[] {""} ;
      P07ET5_A719PrdNum = new String[] {""} ;
      P07ET5_A8360PrdProv = new int[1] ;
      P07ET5_A8366PrdAnyo = new short[1] ;
      P07ET5_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ET5_A8363PrdMesL = new byte[1] ;
      P07ET5_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A8364PrdUndCpM = DecimalUtil.ZERO ;
      A8365PrdUndCnM = DecimalUtil.ZERO ;
      AV57Porcen_T = DecimalUtil.ZERO ;
      AV56Val_Mes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV56Val_Mes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV55Val_Any = DecimalUtil.ZERO ;
      AV54Unid_Any = DecimalUtil.ZERO ;
      AV53Unid_Mes = new java.math.BigDecimal[12] ;
      GX_I = 1 ;
      while ( GX_I <= 12 )
      {
         AV53Unid_Mes[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P07ET6_A396EmprCod = new String[] {""} ;
      P07ET6_A8360PrdProv = new int[1] ;
      P07ET6_A8366PrdAnyo = new short[1] ;
      P07ET6_A719PrdNum = new String[] {""} ;
      P07ET7_A396EmprCod = new String[] {""} ;
      P07ET7_A719PrdNum = new String[] {""} ;
      P07ET7_A8366PrdAnyo = new short[1] ;
      P07ET7_A8360PrdProv = new int[1] ;
      P07ET7_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ET7_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ET7_A8363PrdMesL = new byte[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV68Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rco0004n__default(),
         new Object[] {
             new Object[] {
            P07ET2_A396EmprCod, P07ET2_A407EmprNom, P07ET2_n407EmprNom
            }
            , new Object[] {
            P07ET4_A396EmprCod, P07ET4_A8360PrdProv, P07ET4_A719PrdNum, P07ET4_A8366PrdAnyo, P07ET4_A718PrdNom, P07ET4_A8361PrdUndCpA, P07ET4_n8361PrdUndCpA
            }
            , new Object[] {
            P07ET5_A396EmprCod, P07ET5_A719PrdNum, P07ET5_A8360PrdProv, P07ET5_A8366PrdAnyo, P07ET5_A8364PrdUndCpM, P07ET5_A8363PrdMesL, P07ET5_A8365PrdUndCnM
            }
            , new Object[] {
            P07ET6_A396EmprCod, P07ET6_A8360PrdProv, P07ET6_A8366PrdAnyo, P07ET6_A719PrdNum
            }
            , new Object[] {
            P07ET7_A396EmprCod, P07ET7_A719PrdNum, P07ET7_A8366PrdAnyo, P07ET7_A8360PrdProv, P07ET7_A8364PrdUndCpM, P07ET7_A8365PrdUndCnM, P07ET7_A8363PrdMesL
            }
         }
      );
      AV68Pgmname = "RCO0004n" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV68Pgmname = "RCO0004n" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV21Font ;
   private byte AV52TipoPor ;
   private byte AV51Ok_linea ;
   private byte AV28I ;
   private byte A8363PrdMesL ;
   private short gxcookieaux ;
   private short AV24Any ;
   private short A8366PrdAnyo ;
   private short Gx_err ;
   private int AV18PProv ;
   private int AV19UProv ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A8360PrdProv ;
   private int GXv_int3[] ;
   private int Gx_OldLine ;
   private int AV29UniAny ;
   private int GX_I ;
   private java.math.BigDecimal AV48Total1 ;
   private java.math.BigDecimal AV49Total2 ;
   private java.math.BigDecimal A8361PrdUndCpA ;
   private java.math.BigDecimal AV25Unidades[] ;
   private java.math.BigDecimal AV26Valores[] ;
   private java.math.BigDecimal AV27Porcen[] ;
   private java.math.BigDecimal A8364PrdUndCpM ;
   private java.math.BigDecimal A8365PrdUndCnM ;
   private java.math.BigDecimal AV57Porcen_T ;
   private java.math.BigDecimal AV56Val_Mes[] ;
   private java.math.BigDecimal AV55Val_Any ;
   private java.math.BigDecimal AV54Unid_Any ;
   private java.math.BigDecimal AV53Unid_Mes[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PProd ;
   private String AV17UProd ;
   private String AV30Lit0 ;
   private String AV31Lit1 ;
   private String AV32Lit2 ;
   private String AV33Lit3 ;
   private String AV34Lit4 ;
   private String AV35Lit5 ;
   private String AV36Lit6 ;
   private String AV37Lit7 ;
   private String AV38Lit8 ;
   private String AV39Lit9 ;
   private String AV40Lit10 ;
   private String AV41Lit11 ;
   private String AV42Lit12 ;
   private String AV43Lit13 ;
   private String AV44Lit14 ;
   private String AV45Lit15 ;
   private String AV46Lit16 ;
   private String AV50Lit19 ;
   private String AV58Lit20 ;
   private String AV59Lit21 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV23NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String GXv_char2[] ;
   private String AV61PrvNom ;
   private String GXv_char4[] ;
   private String Gx_time ;
   private String AV68Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n8361PrdUndCpA ;
   private IDataStoreProvider pr_default ;
   private String[] P07ET2_A396EmprCod ;
   private String[] P07ET2_A407EmprNom ;
   private boolean[] P07ET2_n407EmprNom ;
   private String[] P07ET4_A396EmprCod ;
   private int[] P07ET4_A8360PrdProv ;
   private String[] P07ET4_A719PrdNum ;
   private short[] P07ET4_A8366PrdAnyo ;
   private String[] P07ET4_A718PrdNom ;
   private java.math.BigDecimal[] P07ET4_A8361PrdUndCpA ;
   private boolean[] P07ET4_n8361PrdUndCpA ;
   private String[] P07ET5_A396EmprCod ;
   private String[] P07ET5_A719PrdNum ;
   private int[] P07ET5_A8360PrdProv ;
   private short[] P07ET5_A8366PrdAnyo ;
   private java.math.BigDecimal[] P07ET5_A8364PrdUndCpM ;
   private byte[] P07ET5_A8363PrdMesL ;
   private java.math.BigDecimal[] P07ET5_A8365PrdUndCnM ;
   private String[] P07ET6_A396EmprCod ;
   private int[] P07ET6_A8360PrdProv ;
   private short[] P07ET6_A8366PrdAnyo ;
   private String[] P07ET6_A719PrdNum ;
   private String[] P07ET7_A396EmprCod ;
   private String[] P07ET7_A719PrdNum ;
   private short[] P07ET7_A8366PrdAnyo ;
   private int[] P07ET7_A8360PrdProv ;
   private java.math.BigDecimal[] P07ET7_A8364PrdUndCpM ;
   private java.math.BigDecimal[] P07ET7_A8365PrdUndCnM ;
   private byte[] P07ET7_A8363PrdMesL ;
}

final  class rco0004n__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ET2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07ET4", "SELECT T1.EmprCod, T1.PrdProv, T1.PrdNum, T1.PrdAnyo, T2.PrdNom, COALESCE( T3.PrdUndCpA, 0) AS PrdUndCpA FROM ((TXPINSEST T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN (SELECT SUM(PrdUndCpM) AS PrdUndCpA, EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSES1 GROUP BY EmprCod, PrdNum, PrdAnyo, PrdProv ) T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum AND T3.PrdAnyo = T1.PrdAnyo AND T3.PrdProv = T1.PrdProv) WHERE (T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAnyo = ? and T1.PrdProv >= ?) AND (T1.PrdProv <= ?) AND (Not (COALESCE( T3.PrdUndCpA, 0) = 0)) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAnyo, T1.PrdProv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ET5", "SELECT EmprCod, PrdNum, PrdProv, PrdAnyo, PrdUndCpM, PrdMesL, PrdUndCnM FROM TXPINSES1 WHERE EmprCod = ? and PrdNum = ? and PrdAnyo = ? and PrdProv = ? ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ET6", "SELECT EmprCod, PrdProv, PrdAnyo, PrdNum FROM TXPINSEST WHERE (EmprCod = ? and PrdNum >= ? and PrdAnyo = ? and PrdProv >= ?) AND (PrdProv <= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ET7", "SELECT EmprCod, PrdNum, PrdAnyo, PrdProv, PrdUndCpM, PrdUndCnM, PrdMesL FROM TXPINSES1 WHERE EmprCod = ? and PrdNum = ? and PrdAnyo = ? and PrdProv = ? ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

