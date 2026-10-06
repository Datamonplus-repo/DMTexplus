package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0002_impl extends GXWebReport
{
   public rfa0002_impl( com.genexus.internet.HttpContext context )
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
            AV15PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV16UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV17PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV18UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV19PRIO = httpContext.GetPar( "PRIO") ;
            AV20ImpCod = httpContext.GetPar( "ImpCod") ;
            AV21SerieF = (byte)(GXutil.lval( httpContext.GetPar( "SerieF"))) ;
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
      M_bot = 4 ;
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
         P_lines = (int)(gxYPage-(lineHeight*4)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV42Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV82Pgmname, (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit0 = GXt_char1 ;
         GXt_char1 = AV43Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit1 = GXt_char1 ;
         GXt_char1 = AV44Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit2 = GXt_char1 ;
         GXt_char1 = AV45Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit3 = GXt_char1 ;
         GXt_char1 = AV46Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit4 = GXt_char1 ;
         GXt_char1 = AV47Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2300_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit5 = GXt_char1 ;
         GXt_char1 = AV48Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN602_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit6 = GXt_char1 ;
         GXt_char1 = AV49Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2119_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit7 = GXt_char1 ;
         GXt_char1 = AV50Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2120_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit8 = GXt_char1 ;
         GXt_char1 = AV51Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2036_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit9 = GXt_char1 ;
         GXt_char1 = AV52Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2194_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit10 = GXt_char1 ;
         GXt_char1 = AV53Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit11 = GXt_char1 ;
         GXt_char1 = AV54Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2160_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit12 = GXt_char1 ;
         GXt_char1 = AV55Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2482_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit13 = GXt_char1 ;
         GXt_char1 = AV56Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit14 = GXt_char1 ;
         GXt_char1 = AV57Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2158_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit15 = GXt_char1 ;
         GXt_char1 = AV58Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN601_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit16 = GXt_char1 ;
         GXt_char1 = AV61Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rfa0002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit17 = GXt_char1 ;
         GXt_int3 = AV73Torient ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int4) ;
         rfa0002_impl.this.GXt_int3 = GXv_int4[0] ;
         AV73Torient = GXt_int3 ;
         GXt_int3 = AV76Tintutex ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int4) ;
         rfa0002_impl.this.GXt_int3 = GXv_int4[0] ;
         AV76Tintutex = GXt_int3 ;
         GXt_int3 = AV77Carvema ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int4) ;
         rfa0002_impl.this.GXt_int3 = GXv_int4[0] ;
         AV77Carvema = GXt_int3 ;
         /* Using cursor P06KY2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06KY2_A407EmprNom[0] ;
            n407EmprNom = P06KY2_n407EmprNom[0] ;
            A963Ser1 = P06KY2_A963Ser1[0] ;
            n963Ser1 = P06KY2_n963Ser1[0] ;
            A2387Ser2 = P06KY2_A2387Ser2[0] ;
            n2387Ser2 = P06KY2_n2387Ser2[0] ;
            A2389Ser3 = P06KY2_A2389Ser3[0] ;
            n2389Ser3 = P06KY2_n2389Ser3[0] ;
            AV59EmprNom = A407EmprNom ;
            if ( AV21SerieF == 1 )
            {
               AV60FacSerNum = A963Ser1 ;
            }
            else
            {
               if ( AV21SerieF == 2 )
               {
                  AV60FacSerNum = A2387Ser2 ;
               }
               else
               {
                  if ( AV21SerieF == 3 )
                  {
                     AV60FacSerNum = A2389Ser3 ;
                  }
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV76Tintutex == 1 )
         {
            AV60FacSerNum = "XXX" ;
         }
         AV24TotImp = DecimalUtil.doubleToDec(0) ;
         AV25TotDtoGen = DecimalUtil.doubleToDec(0) ;
         AV26TotDtoPP = DecimalUtil.doubleToDec(0) ;
         AV27TotBasImp = DecimalUtil.doubleToDec(0) ;
         AV28TotIVAImp = DecimalUtil.doubleToDec(0) ;
         AV29TotFac = DecimalUtil.doubleToDec(0) ;
         AV65Kgs_Fra = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06KY4 */
         pr_default.execute(1, new Object[] {AV17PFecha, A396EmprCod, Integer.valueOf(AV15PCliCod), Integer.valueOf(AV16UCliCod), AV60FacSerNum, AV60FacSerNum, AV60FacSerNum, AV19PRIO, AV18UFecha});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A450FacPri = P06KY4_A450FacPri[0] ;
            A430FacCod = P06KY4_A430FacCod[0] ;
            A1153FacTipFac = P06KY4_A1153FacTipFac[0] ;
            A2739FacSerNum = P06KY4_A2739FacSerNum[0] ;
            A252CliCod = P06KY4_A252CliCod[0] ;
            A436FacFch = P06KY4_A436FacFch[0] ;
            A279CliNom = P06KY4_A279CliNom[0] ;
            A11513FacRecIca = P06KY4_A11513FacRecIca[0] ;
            A8346FacRecI = P06KY4_A8346FacRecI[0] ;
            n8346FacRecI = P06KY4_n8346FacRecI[0] ;
            A7212FacRect = P06KY4_A7212FacRect[0] ;
            A453FacRECPor = P06KY4_A453FacRECPor[0] ;
            A14224FacCostFac = P06KY4_A14224FacCostFac[0] ;
            A14223FacCostKgs = P06KY4_A14223FacCostKgs[0] ;
            A14222FacCostMts = P06KY4_A14222FacCostMts[0] ;
            A434FacDtoPP = P06KY4_A434FacDtoPP[0] ;
            A433FacDtoGen = P06KY4_A433FacDtoGen[0] ;
            A14219FacEnergia = P06KY4_A14219FacEnergia[0] ;
            A3918FacImpTot1 = P06KY4_A3918FacImpTot1[0] ;
            A443FacIVAPor = P06KY4_A443FacIVAPor[0] ;
            A7209Colombia = P06KY4_A7209Colombia[0] ;
            n7209Colombia = P06KY4_n7209Colombia[0] ;
            A7209Colombia = P06KY4_A7209Colombia[0] ;
            n7209Colombia = P06KY4_n7209Colombia[0] ;
            A3918FacImpTot1 = P06KY4_A3918FacImpTot1[0] ;
            A279CliNom = P06KY4_A279CliNom[0] ;
            A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
            A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               }
               else
               {
                  A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
               }
               else
               {
                  A440FacImpPP = DecimalUtil.doubleToDec(0) ;
               }
            }
            A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
            A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
            A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
            A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
            A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
               }
               else
               {
                  A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
               }
               else
               {
                  A452FacRecImp = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
               }
               else
               {
                  A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
               }
            }
            A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
               }
               else
               {
                  A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
               }
            }
            A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
            AV40TotIVAImpC = A442FacIVAImp ;
            AV63FacTot = A455FacTot ;
            AV62FacImpTot = A441FacImpTot ;
            AV64FacImpPP = A440FacImpPP ;
            AV74Facimpgen = A439FacImpGen ;
            AV69FacCod = A430FacCod ;
            /* Execute user subroutine: 'ACUM_KGS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
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
            AV71Pre_m = ((AV65Kgs_Fra.doubleValue()>0) ? GXutil.roundDecimal( AV62FacImpTot.divide(AV65Kgs_Fra, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
            AV72CliNom = GXutil.substring( A279CliNom, 1, 20) ;
            h6KY0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 144, Gx_line+1, 189, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72CliNom, "")), 198, Gx_line+1, 345, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 7, Gx_line+1, 66, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 75, Gx_line+1, 134, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62FacImpTot, "ZZZ,ZZZ,ZZ9.99")), 355, Gx_line+1, 458, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotIVAImpC, "ZZZ,ZZZ,ZZ9.99")), 579, Gx_line+1, 682, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63FacTot, "ZZZ,ZZZ,ZZ9.99")), 686, Gx_line+1, 789, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64FacImpPP, "ZZZ,ZZZ,ZZ9.99")), 466, Gx_line+1, 569, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(70, Gx_line+0, 70, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(139, Gx_line+0, 139, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(352, Gx_line+0, 352, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(459, Gx_line+0, 459, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(574, Gx_line+0, 574, Gx_line+18, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(684, Gx_line+0, 684, Gx_line+18, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            if ( AV74Facimpgen.doubleValue() > 0 )
            {
               h6KY0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV74Facimpgen, "ZZZ,ZZZ,ZZ9.99")), 466, Gx_line+0, 569, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            if ( AV73Torient == 1 )
            {
               /* Using cursor P06KY5 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A957FacVtoFch = P06KY5_A957FacVtoFch[0] ;
                  n957FacVtoFch = P06KY5_n957FacVtoFch[0] ;
                  A956FacVtoLin = P06KY5_A956FacVtoLin[0] ;
                  h6KY0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A957FacVtoFch, "99/99/99"), 75, Gx_line+0, 134, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(70, Gx_line+0, 70, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(139, Gx_line+0, 139, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(352, Gx_line+0, 352, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(459, Gx_line+0, 459, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(574, Gx_line+0, 574, Gx_line+18, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(684, Gx_line+0, 684, Gx_line+18, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            if ( AV73Torient == 0 )
            {
               h6KY0( false, 25) ;
               getPrinter().GxDrawLine(684, Gx_line+0, 684, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(574, Gx_line+0, 574, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(459, Gx_line+0, 459, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(352, Gx_line+0, 352, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(139, Gx_line+0, 139, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(70, Gx_line+0, 70, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65Kgs_Fra, "ZZ,ZZZ,ZZ9.99")), 363, Gx_line+4, 459, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos Facturados Tint..", ""), 197, Gx_line+5, 318, Gx_line+19, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+25) ;
               if ( AV78Kgs_otros.doubleValue() > 0 )
               {
                  h6KY0( false, 25) ;
                  getPrinter().GxDrawLine(684, Gx_line+0, 684, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(574, Gx_line+0, 574, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(459, Gx_line+0, 459, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(352, Gx_line+0, 352, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(139, Gx_line+0, 139, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(70, Gx_line+0, 70, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV78Kgs_otros, "ZZ,ZZZ,ZZ9.99")), 363, Gx_line+4, 459, Gx_line+21, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quilos Sem Preço Tint..", ""), 197, Gx_line+5, 314, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+25) ;
               }
            }
            if ( ( AV71Pre_m.doubleValue() > 0 ) && ( AV73Torient == 0 ) )
            {
               h6KY0( false, 25) ;
               getPrinter().GxDrawLine(139, Gx_line+0, 139, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(70, Gx_line+0, 70, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preço Medio /Kg..", ""), 228, Gx_line+5, 318, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(684, Gx_line+0, 684, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(574, Gx_line+0, 574, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(459, Gx_line+0, 459, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(352, Gx_line+0, 352, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71Pre_m, "ZZZZ9.999")), 368, Gx_line+4, 449, Gx_line+21, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+25) ;
            }
            AV24TotImp = AV24TotImp.add(A441FacImpTot) ;
            AV25TotDtoGen = AV25TotDtoGen.add(A439FacImpGen) ;
            AV26TotDtoPP = AV26TotDtoPP.add(A440FacImpPP) ;
            AV27TotBasImp = AV27TotBasImp.add(A429FacBasImp) ;
            AV28TotIVAImp = AV28TotIVAImp.add(AV40TotIVAImpC) ;
            AV29TotFac = AV29TotFac.add(A455FacTot) ;
            AV70Tot_Kgs = AV70Tot_Kgs.add(AV65Kgs_Fra) ;
            AV79Kgst_otros = AV79Kgst_otros.add(AV78Kgs_otros) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         h6KY0( false, 20) ;
         getPrinter().GxDrawLine(684, Gx_line+0, 684, Gx_line+18, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(574, Gx_line+0, 574, Gx_line+18, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(459, Gx_line+0, 459, Gx_line+18, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(352, Gx_line+0, 352, Gx_line+18, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(139, Gx_line+0, 139, Gx_line+18, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(70, Gx_line+0, 70, Gx_line+18, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(0, Gx_line+19, 790, Gx_line+19, 2, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV71Pre_m = DecimalUtil.doubleToDec(0) ;
         if ( AV70Tot_Kgs.doubleValue() > 0 )
         {
            AV71Pre_m = GXutil.roundDecimal( AV24TotImp.divide(AV70Tot_Kgs, 18, java.math.RoundingMode.DOWN), 2) ;
         }
         if ( AV73Torient == 0 )
         {
            h6KY0( false, 81) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit14, "")), 175, Gx_line+10, 284, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotImp, "ZZZ,ZZZ,ZZ9.99")), 355, Gx_line+10, 458, Gx_line+28, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotIVAImp, "ZZZ,ZZZ,ZZ9.99")), 579, Gx_line+10, 682, Gx_line+28, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotFac, "ZZZ,ZZZ,ZZ9.99")), 686, Gx_line+10, 789, Gx_line+28, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(113, Gx_line+1, 790, Gx_line+78, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotDtoPP, "ZZZ,ZZZ,ZZ9.99")), 466, Gx_line+10, 569, Gx_line+28, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total Qgs Facturados Tint", ""), 176, Gx_line+41, 306, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70Tot_Kgs, "ZZZ,ZZZ,ZZ9.99")), 355, Gx_line+40, 458, Gx_line+58, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Preço Medio /Kg..", ""), 176, Gx_line+61, 266, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV71Pre_m, "ZZZZ9.999")), 377, Gx_line+60, 458, Gx_line+77, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TotDtoGen, "ZZZ,ZZZ,ZZ9.99")), 466, Gx_line+33, 569, Gx_line+50, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+81) ;
            if ( AV79Kgst_otros.doubleValue() > 0 )
            {
               h6KY0( false, 23) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79Kgst_otros, "Z,ZZZ,ZZZ,ZZ9.99")), 341, Gx_line+2, 459, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Qgs Sem Preço Tint", ""), 176, Gx_line+3, 302, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+23) ;
            }
         }
         else
         {
            h6KY0( false, 38) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit14, "")), 175, Gx_line+9, 284, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotImp, "ZZZ,ZZZ,ZZ9.99")), 355, Gx_line+9, 458, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotIVAImp, "ZZZ,ZZZ,ZZ9.99")), 579, Gx_line+9, 682, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotFac, "ZZZ,ZZZ,ZZ9.99")), 686, Gx_line+9, 789, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(113, Gx_line+4, 790, Gx_line+34, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotDtoPP, "ZZZ,ZZZ,ZZ9.99")), 466, Gx_line+9, 569, Gx_line+27, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+38) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6KY0( true, 0) ;
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
      /* 'ACUM_KGS' Routine */
      returnInSub = false ;
      GXv_decimal5[0] = AV78Kgs_otros ;
      GXv_decimal6[0] = DecimalUtil.doubleToDec(AV77Carvema) ;
      new app.facturacion.pacumkgs(remoteHandle, context).execute( A396EmprCod, A430FacCod, (byte)(DecimalUtil.decToDouble(AV65Kgs_Fra)), GXv_decimal5, GXv_decimal6) ;
      rfa0002_impl.this.AV78Kgs_otros = GXv_decimal5[0] ;
      rfa0002_impl.this.AV77Carvema = (byte)(DecimalUtil.decToDouble(GXv_decimal6[0])) ;
   }

   public void h6KY0( boolean bFoot ,
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
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59EmprNom, "")), 7, Gx_line+17, 258, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit1, "")), 506, Gx_line+17, 543, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 557, Gx_line+17, 616, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit2, "")), 638, Gx_line+17, 668, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 703, Gx_line+17, 762, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit0, "")), 7, Gx_line+50, 341, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit3, "")), 645, Gx_line+50, 690, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 718, Gx_line+50, 763, Gx_line+67, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit4, "")), 144, Gx_line+79, 203, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit15, "")), 7, Gx_line+79, 66, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit16, "")), 75, Gx_line+79, 118, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit6, "")), 366, Gx_line+79, 447, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit10, "")), 608, Gx_line+79, 653, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit11, "")), 723, Gx_line+79, 790, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+74, 790, Gx_line+74, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+103, 790, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "De:", ""), 358, Gx_line+50, 381, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV17PFecha, "99/99/99"), 395, Gx_line+50, 454, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "a", ""), 468, Gx_line+50, 476, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV18UFecha, "99/99/99"), 490, Gx_line+50, 549, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit8, "")), 491, Gx_line+79, 543, Gx_line+97, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(70, Gx_line+74, 70, Gx_line+108, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(139, Gx_line+74, 139, Gx_line+108, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(459, Gx_line+74, 459, Gx_line+108, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(574, Gx_line+74, 574, Gx_line+108, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(684, Gx_line+74, 684, Gx_line+108, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(352, Gx_line+74, 352, Gx_line+108, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+108) ;
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
      getPrinter().setMetrics("Tahoma", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
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
      AV17PFecha = GXutil.nullDate() ;
      AV18UFecha = GXutil.nullDate() ;
      AV19PRIO = "" ;
      AV20ImpCod = "" ;
      AV42Lit0 = "" ;
      AV82Pgmname = "" ;
      AV43Lit1 = "" ;
      AV44Lit2 = "" ;
      AV45Lit3 = "" ;
      AV46Lit4 = "" ;
      AV47Lit5 = "" ;
      AV48Lit6 = "" ;
      AV49Lit7 = "" ;
      AV50Lit8 = "" ;
      AV51Lit9 = "" ;
      AV52Lit10 = "" ;
      AV53Lit11 = "" ;
      AV54Lit12 = "" ;
      AV55Lit13 = "" ;
      AV56Lit14 = "" ;
      AV57Lit15 = "" ;
      AV58Lit16 = "" ;
      AV61Lit17 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P06KY2_A396EmprCod = new String[] {""} ;
      P06KY2_A407EmprNom = new String[] {""} ;
      P06KY2_n407EmprNom = new boolean[] {false} ;
      P06KY2_A963Ser1 = new String[] {""} ;
      P06KY2_n963Ser1 = new boolean[] {false} ;
      P06KY2_A2387Ser2 = new String[] {""} ;
      P06KY2_n2387Ser2 = new boolean[] {false} ;
      P06KY2_A2389Ser3 = new String[] {""} ;
      P06KY2_n2389Ser3 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      AV59EmprNom = "" ;
      AV60FacSerNum = "" ;
      AV24TotImp = DecimalUtil.ZERO ;
      AV25TotDtoGen = DecimalUtil.ZERO ;
      AV26TotDtoPP = DecimalUtil.ZERO ;
      AV27TotBasImp = DecimalUtil.ZERO ;
      AV28TotIVAImp = DecimalUtil.ZERO ;
      AV29TotFac = DecimalUtil.ZERO ;
      AV65Kgs_Fra = DecimalUtil.ZERO ;
      P06KY4_A396EmprCod = new String[] {""} ;
      P06KY4_A450FacPri = new String[] {""} ;
      P06KY4_A430FacCod = new int[1] ;
      P06KY4_A1153FacTipFac = new byte[1] ;
      P06KY4_A2739FacSerNum = new String[] {""} ;
      P06KY4_A252CliCod = new int[1] ;
      P06KY4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06KY4_A279CliNom = new String[] {""} ;
      P06KY4_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_n8346FacRecI = new boolean[] {false} ;
      P06KY4_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KY4_A443FacIVAPor = new byte[1] ;
      P06KY4_A7209Colombia = new byte[1] ;
      P06KY4_n7209Colombia = new boolean[] {false} ;
      A450FacPri = "" ;
      A2739FacSerNum = "" ;
      A436FacFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV40TotIVAImpC = DecimalUtil.ZERO ;
      AV63FacTot = DecimalUtil.ZERO ;
      AV62FacImpTot = DecimalUtil.ZERO ;
      AV64FacImpPP = DecimalUtil.ZERO ;
      AV74Facimpgen = DecimalUtil.ZERO ;
      AV71Pre_m = DecimalUtil.ZERO ;
      AV72CliNom = "" ;
      P06KY5_A396EmprCod = new String[] {""} ;
      P06KY5_A430FacCod = new int[1] ;
      P06KY5_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06KY5_n957FacVtoFch = new boolean[] {false} ;
      P06KY5_A956FacVtoLin = new byte[1] ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV78Kgs_otros = DecimalUtil.ZERO ;
      AV70Tot_Kgs = DecimalUtil.ZERO ;
      AV79Kgst_otros = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa0002__default(),
         new Object[] {
             new Object[] {
            P06KY2_A396EmprCod, P06KY2_A407EmprNom, P06KY2_n407EmprNom, P06KY2_A963Ser1, P06KY2_n963Ser1, P06KY2_A2387Ser2, P06KY2_n2387Ser2, P06KY2_A2389Ser3, P06KY2_n2389Ser3
            }
            , new Object[] {
            P06KY4_A396EmprCod, P06KY4_A450FacPri, P06KY4_A430FacCod, P06KY4_A1153FacTipFac, P06KY4_A2739FacSerNum, P06KY4_A252CliCod, P06KY4_A436FacFch, P06KY4_A279CliNom, P06KY4_A11513FacRecIca, P06KY4_A8346FacRecI,
            P06KY4_n8346FacRecI, P06KY4_A7212FacRect, P06KY4_A453FacRECPor, P06KY4_A14224FacCostFac, P06KY4_A14223FacCostKgs, P06KY4_A14222FacCostMts, P06KY4_A434FacDtoPP, P06KY4_A433FacDtoGen, P06KY4_A14219FacEnergia, P06KY4_A3918FacImpTot1,
            P06KY4_A443FacIVAPor, P06KY4_A7209Colombia, P06KY4_n7209Colombia
            }
            , new Object[] {
            P06KY5_A396EmprCod, P06KY5_A430FacCod, P06KY5_A957FacVtoFch, P06KY5_n957FacVtoFch, P06KY5_A956FacVtoLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV82Pgmname = "Facturacion.RFA0002" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV82Pgmname = "Facturacion.RFA0002" ;
      Gx_err = (short)(0) ;
   }

   private byte AV21SerieF ;
   private byte AV73Torient ;
   private byte AV76Tintutex ;
   private byte AV77Carvema ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte A956FacVtoLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV15PCliCod ;
   private int AV16UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV69FacCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV24TotImp ;
   private java.math.BigDecimal AV25TotDtoGen ;
   private java.math.BigDecimal AV26TotDtoPP ;
   private java.math.BigDecimal AV27TotBasImp ;
   private java.math.BigDecimal AV28TotIVAImp ;
   private java.math.BigDecimal AV29TotFac ;
   private java.math.BigDecimal AV65Kgs_Fra ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV40TotIVAImpC ;
   private java.math.BigDecimal AV63FacTot ;
   private java.math.BigDecimal AV62FacImpTot ;
   private java.math.BigDecimal AV64FacImpPP ;
   private java.math.BigDecimal AV74Facimpgen ;
   private java.math.BigDecimal AV71Pre_m ;
   private java.math.BigDecimal AV78Kgs_otros ;
   private java.math.BigDecimal AV70Tot_Kgs ;
   private java.math.BigDecimal AV79Kgst_otros ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV19PRIO ;
   private String AV20ImpCod ;
   private String AV42Lit0 ;
   private String AV82Pgmname ;
   private String AV43Lit1 ;
   private String AV44Lit2 ;
   private String AV45Lit3 ;
   private String AV46Lit4 ;
   private String AV47Lit5 ;
   private String AV48Lit6 ;
   private String AV49Lit7 ;
   private String AV50Lit8 ;
   private String AV51Lit9 ;
   private String AV52Lit10 ;
   private String AV53Lit11 ;
   private String AV54Lit12 ;
   private String AV55Lit13 ;
   private String AV56Lit14 ;
   private String AV57Lit15 ;
   private String AV58Lit16 ;
   private String AV61Lit17 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String AV59EmprNom ;
   private String AV60FacSerNum ;
   private String A450FacPri ;
   private String A2739FacSerNum ;
   private String A279CliNom ;
   private String AV72CliNom ;
   private String Gx_time ;
   private java.util.Date AV17PFecha ;
   private java.util.Date AV18UFecha ;
   private java.util.Date A436FacFch ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n963Ser1 ;
   private boolean n2387Ser2 ;
   private boolean n2389Ser3 ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private IDataStoreProvider pr_default ;
   private String[] P06KY2_A396EmprCod ;
   private String[] P06KY2_A407EmprNom ;
   private boolean[] P06KY2_n407EmprNom ;
   private String[] P06KY2_A963Ser1 ;
   private boolean[] P06KY2_n963Ser1 ;
   private String[] P06KY2_A2387Ser2 ;
   private boolean[] P06KY2_n2387Ser2 ;
   private String[] P06KY2_A2389Ser3 ;
   private boolean[] P06KY2_n2389Ser3 ;
   private String[] P06KY4_A396EmprCod ;
   private String[] P06KY4_A450FacPri ;
   private int[] P06KY4_A430FacCod ;
   private byte[] P06KY4_A1153FacTipFac ;
   private String[] P06KY4_A2739FacSerNum ;
   private int[] P06KY4_A252CliCod ;
   private java.util.Date[] P06KY4_A436FacFch ;
   private String[] P06KY4_A279CliNom ;
   private java.math.BigDecimal[] P06KY4_A11513FacRecIca ;
   private java.math.BigDecimal[] P06KY4_A8346FacRecI ;
   private boolean[] P06KY4_n8346FacRecI ;
   private java.math.BigDecimal[] P06KY4_A7212FacRect ;
   private java.math.BigDecimal[] P06KY4_A453FacRECPor ;
   private java.math.BigDecimal[] P06KY4_A14224FacCostFac ;
   private java.math.BigDecimal[] P06KY4_A14223FacCostKgs ;
   private java.math.BigDecimal[] P06KY4_A14222FacCostMts ;
   private java.math.BigDecimal[] P06KY4_A434FacDtoPP ;
   private java.math.BigDecimal[] P06KY4_A433FacDtoGen ;
   private java.math.BigDecimal[] P06KY4_A14219FacEnergia ;
   private java.math.BigDecimal[] P06KY4_A3918FacImpTot1 ;
   private byte[] P06KY4_A443FacIVAPor ;
   private byte[] P06KY4_A7209Colombia ;
   private boolean[] P06KY4_n7209Colombia ;
   private String[] P06KY5_A396EmprCod ;
   private int[] P06KY5_A430FacCod ;
   private java.util.Date[] P06KY5_A957FacVtoFch ;
   private boolean[] P06KY5_n957FacVtoFch ;
   private byte[] P06KY5_A956FacVtoLin ;
}

final  class rfa0002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06KY2", "SELECT EmprCod, EmprNom, Ser1, Ser2, Ser3 FROM TEXPLUSNET.TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06KY4", "SELECT T1.EmprCod, T1.FacPri, T1.FacCod, T1.FacTipFac, T1.FacSerNum, T1.CliCod, T1.FacFch, T4.CliNom, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T1.FacEnergia, COALESCE( T3.FacImpTot1, 0) AS FacImpTot1, T1.FacIVAPor, T2.Colombia FROM (((TEXPLUSNET.TXPCFAVEN T1 INNER JOIN TEXPLUSNET.TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) THEN 0 WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TEXPLUSNET.TXPLFAVEN GROUP BY EmprCod, FacCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.FacCod = T1.FacCod) INNER JOIN TEXPLUSNET.TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE (T1.FacFch >= ?) AND (T1.EmprCod = ?) AND (T1.CliCod >= ? and T1.CliCod <= ?) AND (( T1.FacSerNum = ?) or ? = 'XXX') AND (T1.FacTipFac = 0 or ? = 'XXX') AND (T1.FacPri = ?) AND (T1.FacFch <= ?) ORDER BY T1.FacFch, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06KY5", "SELECT EmprCod, FacCod, FacVtoFch, FacVtoLin FROM TEXPLUSNET.TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setDate(9, (java.util.Date)parms[8]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

