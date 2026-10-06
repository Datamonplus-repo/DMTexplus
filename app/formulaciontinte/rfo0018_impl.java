package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfo0018_impl extends GXWebReport
{
   public rfo0018_impl( com.genexus.internet.HttpContext context )
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
            AV61Fabs = CommonUtil.decimalVal( httpContext.GetPar( "Fabs"), ".") ;
            AV69Op = httpContext.GetPar( "Op") ;
            AV68proforact = httpContext.GetPar( "proforact") ;
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
         GXt_char1 = AV19Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT563_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit0 = GXt_char1 ;
         GXt_char1 = AV20Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit1 = GXt_char1 ;
         GXt_char1 = AV21Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit2 = GXt_char1 ;
         GXt_char1 = AV22Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit3 = GXt_char1 ;
         GXt_char1 = AV23Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit4 = GXt_char1 ;
         GXt_char1 = AV24Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2454_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit5 = GXt_char1 ;
         GXt_char1 = AV25Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2462_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit6 = GXt_char1 ;
         GXt_char1 = AV26Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2283_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit7 = GXt_char1 ;
         GXt_char1 = AV27Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2310_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit8 = GXt_char1 ;
         GXt_char1 = AV28Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN502_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit9 = GXt_char1 ;
         GXt_char1 = AV29Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT482_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit10 = GXt_char1 ;
         GXt_char1 = AV30Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2525_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit11 = GXt_char1 ;
         GXt_char1 = AV31Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN188_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit12 = GXt_char1 ;
         GXt_char1 = AV32Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN368_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit13 = GXt_char1 ;
         GXt_char1 = AV33Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3003_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit14 = GXt_char1 ;
         GXt_char1 = AV34Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3004_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit15 = GXt_char1 ;
         AV38Lit16 = " " ;
         GXt_char1 = AV44Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL064_", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit17 = GXt_char1 ;
         AV46Lit18 = "" ;
         GXt_char1 = AV50Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN286", ""), (byte)(99), GXv_char2) ;
         rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit19 = GXutil.trim( GXt_char1) ;
         AV54Lit20 = " " ;
         AV39FlagHss = (byte)(0) ;
         GXv_int3[0] = AV39FlagHss ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int3) ;
         rfo0018_impl.this.AV39FlagHss = GXv_int3[0] ;
         AV42ProTnq = (byte)(0) ;
         GXv_int3[0] = AV42ProTnq ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TNQPRO", ""), GXv_int3) ;
         rfo0018_impl.this.AV42ProTnq = GXv_int3[0] ;
         AV45ObsPrf = (byte)(0) ;
         GXv_int3[0] = AV45ObsPrf ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "OBSPRF", ""), GXv_int3) ;
         rfo0018_impl.this.AV45ObsPrf = GXv_int3[0] ;
         AV53Ensayos = (byte)(0) ;
         GXv_int3[0] = AV53Ensayos ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS000", ""), GXv_int3) ;
         rfo0018_impl.this.AV53Ensayos = GXv_int3[0] ;
         GXt_int4 = AV67moda21 ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
         rfo0018_impl.this.GXt_int4 = GXv_int3[0] ;
         AV67moda21 = GXt_int4 ;
         if ( AV53Ensayos == 1 )
         {
            GXt_char1 = AV54Lit20 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN407_", ""), (byte)(99), GXv_char2) ;
            rfo0018_impl.this.GXt_char1 = GXv_char2[0] ;
            AV54Lit20 = GXutil.trim( AV23Lit4) + " " + GXt_char1 ;
         }
         GXt_int4 = AV51CdpPor ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "%CDP", ""), GXv_int3) ;
         rfo0018_impl.this.GXt_int4 = GXv_int3[0] ;
         AV51CdpPor = GXt_int4 ;
         if ( AV51CdpPor == 0 )
         {
         }
         else
         {
         }
         if ( AV42ProTnq == 0 )
         {
            AV44Lit17 = " " ;
         }
         /* Using cursor P06NY2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06NY2_A407EmprNom[0] ;
            n407EmprNom = P06NY2_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06NY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PProc, AV68proforact, AV17UProc});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P06NY3_A764ProForCod[0] ;
            A13133ProForAct = P06NY3_A13133ProForAct[0] ;
            A4586ProForObs = P06NY3_A4586ProForObs[0] ;
            n4586ProForObs = P06NY3_n4586ProForObs[0] ;
            A6061ProForLab = P06NY3_A6061ProForLab[0] ;
            A2393ProNumRec = P06NY3_A2393ProNumRec[0] ;
            A2392ProNumPro = P06NY3_A2392ProNumPro[0] ;
            A769ProForMat = P06NY3_A769ProForMat[0] ;
            A772ProForTmx = P06NY3_A772ProForTmx[0] ;
            A771ProForTie = P06NY3_A771ProForTie[0] ;
            A766ProForDsc = P06NY3_A766ProForDsc[0] ;
            AV40ProForCCi = "" ;
            AV41ProForDCi = "" ;
            AV64LastProforFT = "" ;
            /* Using cursor P06NY4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A490ForPrdUMe = P06NY4_A490ForPrdUMe[0] ;
               A13178ProForFT = P06NY4_A13178ProForFT[0] ;
               A762ProForCan = P06NY4_A762ProForCan[0] ;
               A1645ProForNro = P06NY4_A1645ProForNro[0] ;
               A3379ProForTnq = P06NY4_A3379ProForTnq[0] ;
               A6062ProForCPo = P06NY4_A6062ProForCPo[0] ;
               A763ProForCla = P06NY4_A763ProForCla[0] ;
               A5358ProForClv = P06NY4_A5358ProForClv[0] ;
               A488ForPrdDsc = P06NY4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06NY4_n488ForPrdDsc[0] ;
               A765ProForDes = P06NY4_A765ProForDes[0] ;
               A770ProForPrd = P06NY4_A770ProForPrd[0] ;
               A767ProForLin = P06NY4_A767ProForLin[0] ;
               A488ForPrdDsc = P06NY4_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P06NY4_n488ForPrdDsc[0] ;
               if ( ( AV67moda21 == 1 ) && ( GXutil.strcmp(A13178ProForFT, AV64LastProforFT) != 0 ) && ( GXutil.strcmp(A13178ProForFT, " ") != 0 ) )
               {
                  AV65Proforcod = A13178ProForFT ;
                  GXt_char1 = AV66Profordsc ;
                  GXv_char2[0] = A396EmprCod ;
                  GXv_char5[0] = A13178ProForFT ;
                  GXv_char6[0] = GXt_char1 ;
                  new app.ppreqd1(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_char6) ;
                  rfo0018_impl.this.A396EmprCod = GXv_char2[0] ;
                  rfo0018_impl.this.A13178ProForFT = GXv_char5[0] ;
                  rfo0018_impl.this.GXt_char1 = GXv_char6[0] ;
                  AV66Profordsc = GXt_char1 ;
                  h6NY0( false, 31) ;
                  getPrinter().GxDrawRect(15, Gx_line+1, 774, Gx_line+25, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Proforcod, "")), 36, Gx_line+5, 81, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Profordsc, "")), 88, Gx_line+5, 308, Gx_line+22, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+31) ;
               }
               AV37ProForCan = A762ProForCan ;
               if ( (0==A1645ProForNro) )
               {
                  AV35ProForNro = " " ;
               }
               else
               {
                  AV35ProForNro = GXutil.str( A1645ProForNro, 2, 0) ;
               }
               AV43ProForTnq = "  " ;
               if ( AV42ProTnq == 1 )
               {
                  if ( ! (0==A3379ProForTnq) )
                  {
                     AV43ProForTnq = GXutil.str( A3379ProForTnq, 2, 0) ;
                  }
               }
               AV52ProForCPo = DecimalUtil.doubleToDec(0) ;
               if ( AV51CdpPor == 1 )
               {
                  AV52ProForCPo = A6062ProForCPo ;
               }
               AV55Proforclv = A763ProForCla ;
               if ( ! (GXutil.strcmp("", A5358ProForClv)==0) )
               {
                  AV55Proforclv = A5358ProForClv ;
               }
               if ( GXutil.strcmp(AV69Op, " ") == 0 )
               {
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A762ProForCan)==0) )
                  {
                     h6NY0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")), 32, Gx_line+0, 62, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 76, Gx_line+0, 121, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 125, Gx_line+0, 316, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37ProForCan, "ZZZZZ9.99999")), 373, Gx_line+1, 462, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35ProForNro, "")), 524, Gx_line+0, 540, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Proforclv, "")), 577, Gx_line+0, 797, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43ProForTnq, "")), 555, Gx_line+0, 571, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52ProForCPo, "ZZZ.ZZ")), 320, Gx_line+1, 365, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 466, Gx_line+1, 503, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     h6NY0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")), 32, Gx_line+0, 62, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 76, Gx_line+0, 121, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 125, Gx_line+0, 316, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35ProForNro, "")), 524, Gx_line+0, 540, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Proforclv, "")), 577, Gx_line+0, 797, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43ProForTnq, "")), 555, Gx_line+0, 571, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52ProForCPo, "ZZZ.ZZ")), 320, Gx_line+0, 365, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
               }
               else
               {
                  if ( A762ProForCan.doubleValue() > 0 )
                  {
                     AV56Prdnum = A770ProForPrd ;
                     /* Execute user subroutine: 'PRODUC' */
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
                     if ( GXutil.strcmp(A488ForPrdDsc, httpContext.getMessage( "%-G/K", "")) == 0 )
                     {
                        AV59Coste = ((DecimalUtil.doubleToDec(100).multiply(AV37ProForCan).multiply(AV58PrdFaccon).multiply(AV57PrdPreact)).divide(AV61Fabs, 18, java.math.RoundingMode.DOWN)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                     }
                     else
                     {
                        AV59Coste = AV37ProForCan.multiply(AV58PrdFaccon).multiply(AV57PrdPreact).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                     }
                     h6NY0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A767ProForLin), "ZZZ9")), 22, Gx_line+0, 52, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 73, Gx_line+0, 118, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 146, Gx_line+0, 337, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37ProForCan, "ZZZZZ9.99999")), 350, Gx_line+0, 439, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 445, Gx_line+0, 482, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV59Coste, "ZZZZ9.9999")), 693, Gx_line+0, 767, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV58PrdFaccon, "Z9.9999")), 510, Gx_line+0, 562, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57PrdPreact, "ZZZZZZZ9.999")), 576, Gx_line+0, 679, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     AV60CosteT = AV60CosteT.add(AV59Coste) ;
                  }
               }
               AV64LastProforFT = A13178ProForFT ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( ( GXutil.strcmp(AV69Op, " ") != 0 ) && ( AV60CosteT.doubleValue() > 0 ) )
            {
               AV63Fab = AV61Fabs.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               AV60CosteT = AV60CosteT.multiply(AV63Fab) ;
               AV62Text_c = httpContext.getMessage( "Total Coste Proceso Quimico, 1 Kg / 1 Lt ", "") + httpContext.getMessage( " F.Abs = ", "") + GXutil.trim( GXutil.str( AV61Fabs, 6, 2)) + " %" ;
               h6NY0( false, 31) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60CosteT, "ZZZZ9.9999")), 693, Gx_line+14, 767, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Text_c, "")), 95, Gx_line+16, 534, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Lucida Console", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "€/Kg", ""), 767, Gx_line+16, 797, Gx_line+29, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            if ( AV45ObsPrf == 1 )
            {
               h6NY0( false, 13) ;
               getPrinter().GxDrawLine(27, Gx_line+6, 762, Gx_line+6, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+13) ;
               AV47Nlin = (short)(GXutil.gxmlines( A4586ProForObs, (short)(42))) ;
               GXt_char1 = AV46Lit18 ;
               GXv_char6[0] = GXt_char1 ;
               new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char6) ;
               rfo0018_impl.this.GXt_char1 = GXv_char6[0] ;
               AV46Lit18 = GXt_char1 ;
               AV48I = (short)(1) ;
               while ( AV48I <= AV47Nlin )
               {
                  AV49ObsFor = GXutil.gxgetmli( A4586ProForObs, AV48I, (short)(42)) ;
                  h6NY0( false, 18) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit18, "")), 33, Gx_line+0, 128, Gx_line+16, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49ObsFor, "")), 170, Gx_line+1, 477, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  AV46Lit18 = "" ;
                  AV48I = (short)(AV48I+1) ;
               }
            }
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6NY0( true, 0) ;
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
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV57PrdPreact = DecimalUtil.doubleToDec(0) ;
      AV58PrdFaccon = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P06NY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV56Prdnum});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P06NY5_A719PrdNum[0] ;
         A724PrdPreAct = P06NY5_A724PrdPreAct[0] ;
         A707PrdFacCon = P06NY5_A707PrdFacCon[0] ;
         AV57PrdPreact = A724PrdPreAct ;
         AV58PrdFaccon = A707PrdFacCon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void h6NY0( boolean bFoot ,
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
               if ( GXutil.strcmp(AV69Op, GXutil.space( (short)(1))) == 0 )
               {
                  getPrinter().GxAttris("Lucida Console", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 510, Gx_line+13, 518, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 664, Gx_line+13, 672, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 38, Gx_line+10, 227, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 454, Gx_line+10, 508, Gx_line+26, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 522, Gx_line+10, 581, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit2, "")), 610, Gx_line+10, 661, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 685, Gx_line+10, 744, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 610, Gx_line+40, 666, Gx_line+56, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 700, Gx_line+40, 745, Gx_line+57, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit4, "")), 32, Gx_line+76, 121, Gx_line+93, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 132, Gx_line+76, 176, Gx_line+92, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 183, Gx_line+76, 398, Gx_line+92, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit5, "")), 32, Gx_line+99, 102, Gx_line+116, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")), 131, Gx_line+99, 160, Gx_line+115, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit6, "")), 190, Gx_line+99, 290, Gx_line+115, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9")), 270, Gx_line+99, 299, Gx_line+115, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit7, "")), 335, Gx_line+99, 423, Gx_line+115, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A769ProForMat, "")), 408, Gx_line+99, 525, Gx_line+115, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit14, "")), 32, Gx_line+123, 120, Gx_line+139, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9")), 132, Gx_line+123, 154, Gx_line+139, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit15, "")), 191, Gx_line+123, 291, Gx_line+139, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9")), 271, Gx_line+123, 308, Gx_line+140, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Pgmname, "")), 375, Gx_line+40, 595, Gx_line+56, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit0, "")), 36, Gx_line+40, 245, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(27, Gx_line+0, 762, Gx_line+0, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(27, Gx_line+65, 762, Gx_line+65, 2, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit16, "")), 525, Gx_line+99, 569, Gx_line+115, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40ProForCCi, "")), 582, Gx_line+99, 655, Gx_line+115, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41ProForDCi, "")), 667, Gx_line+100, 784, Gx_line+116, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Lucida Console", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 670, Gx_line+42, 678, Gx_line+55, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit20, "")), 415, Gx_line+75, 537, Gx_line+91, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6061ProForLab, "")), 548, Gx_line+75, 593, Gx_line+92, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Lucida Console", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Activos?", ""), 275, Gx_line+40, 334, Gx_line+53, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68proforact, "")), 344, Gx_line+40, 352, Gx_line+57, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+140) ;
               }
               else
               {
                  AV19Lit0 = httpContext.getMessage( "Coste Proceso Quimico", "") ;
                  getPrinter().GxAttris("Lucida Console", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 495, Gx_line+18, 503, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(":", 648, Gx_line+18, 656, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 22, Gx_line+16, 211, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 439, Gx_line+16, 493, Gx_line+32, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 506, Gx_line+16, 565, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit2, "")), 595, Gx_line+16, 646, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 670, Gx_line+16, 729, Gx_line+33, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 598, Gx_line+47, 654, Gx_line+63, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 688, Gx_line+47, 733, Gx_line+64, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Pgmname, "")), 342, Gx_line+47, 562, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(15, Gx_line+72, 774, Gx_line+72, 2, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Lucida Console", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(":", 657, Gx_line+49, 665, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 22, Gx_line+78, 59, Gx_line+91, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(22, Gx_line+94, 58, Gx_line+94, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 73, Gx_line+78, 132, Gx_line+91, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 146, Gx_line+78, 227, Gx_line+91, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(73, Gx_line+94, 131, Gx_line+94, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(146, Gx_line+94, 336, Gx_line+94, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 379, Gx_line+78, 438, Gx_line+91, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(350, Gx_line+94, 438, Gx_line+94, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 22, Gx_line+47, 66, Gx_line+63, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 73, Gx_line+47, 288, Gx_line+63, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Lucida Console", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Densidad", ""), 503, Gx_line+78, 562, Gx_line+91, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(503, Gx_line+94, 561, Gx_line+94, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 634, Gx_line+78, 679, Gx_line+91, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(576, Gx_line+94, 678, Gx_line+94, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Coste", ""), 729, Gx_line+78, 766, Gx_line+91, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(693, Gx_line+94, 766, Gx_line+94, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+109) ;
               }
               if ( GXutil.strcmp(AV69Op, " ") == 0 )
               {
                  if ( AV51CdpPor == 1 )
                  {
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 580, Gx_line+15, 594, Gx_line+31, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit8, "")), 32, Gx_line+15, 96, Gx_line+32, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit9, "")), 96, Gx_line+15, 171, Gx_line+31, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit10, "")), 175, Gx_line+15, 307, Gx_line+32, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit12, "")), 475, Gx_line+15, 557, Gx_line+31, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit13, "")), 643, Gx_line+15, 707, Gx_line+32, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit17, "")), 602, Gx_line+15, 625, Gx_line+31, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(32, Gx_line+36, 68, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(96, Gx_line+36, 366, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(375, Gx_line+36, 419, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(428, Gx_line+36, 558, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(579, Gx_line+36, 594, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(602, Gx_line+36, 625, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(643, Gx_line+36, 760, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit19, "")), 372, Gx_line+17, 423, Gx_line+34, 1+256, 0, 0, 0) ;
                     getPrinter().GxDrawText("%", 388, Gx_line+0, 398, Gx_line+16, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+44) ;
                  }
                  else
                  {
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 526, Gx_line+15, 540, Gx_line+31, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit8, "")), 32, Gx_line+15, 96, Gx_line+32, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit9, "")), 76, Gx_line+15, 151, Gx_line+31, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit10, "")), 155, Gx_line+15, 287, Gx_line+32, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit12, "")), 420, Gx_line+15, 502, Gx_line+31, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit13, "")), 577, Gx_line+15, 641, Gx_line+32, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit17, "")), 547, Gx_line+15, 570, Gx_line+31, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(32, Gx_line+36, 68, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(76, Gx_line+36, 364, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(372, Gx_line+36, 502, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(524, Gx_line+36, 539, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(547, Gx_line+36, 570, Gx_line+36, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(577, Gx_line+36, 796, Gx_line+36, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+44) ;
                  }
               }
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
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Lucida Console", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV15ImpCod = "" ;
      AV16PProc = "" ;
      AV17UProc = "" ;
      AV61Fabs = DecimalUtil.ZERO ;
      AV69Op = "" ;
      AV68proforact = "" ;
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV29Lit10 = "" ;
      AV30Lit11 = "" ;
      AV31Lit12 = "" ;
      AV32Lit13 = "" ;
      AV33Lit14 = "" ;
      AV34Lit15 = "" ;
      AV38Lit16 = "" ;
      AV44Lit17 = "" ;
      AV46Lit18 = "" ;
      AV50Lit19 = "" ;
      AV54Lit20 = "" ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P06NY2_A396EmprCod = new String[] {""} ;
      P06NY2_A407EmprNom = new String[] {""} ;
      P06NY2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      P06NY3_A396EmprCod = new String[] {""} ;
      P06NY3_A764ProForCod = new String[] {""} ;
      P06NY3_A13133ProForAct = new String[] {""} ;
      P06NY3_A4586ProForObs = new String[] {""} ;
      P06NY3_n4586ProForObs = new boolean[] {false} ;
      P06NY3_A6061ProForLab = new String[] {""} ;
      P06NY3_A2393ProNumRec = new int[1] ;
      P06NY3_A2392ProNumPro = new int[1] ;
      P06NY3_A769ProForMat = new String[] {""} ;
      P06NY3_A772ProForTmx = new short[1] ;
      P06NY3_A771ProForTie = new short[1] ;
      P06NY3_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A13133ProForAct = "" ;
      A4586ProForObs = "" ;
      A6061ProForLab = "" ;
      A769ProForMat = "" ;
      A766ProForDsc = "" ;
      AV40ProForCCi = "" ;
      AV41ProForDCi = "" ;
      AV64LastProforFT = "" ;
      P06NY4_A490ForPrdUMe = new byte[1] ;
      P06NY4_A396EmprCod = new String[] {""} ;
      P06NY4_A764ProForCod = new String[] {""} ;
      P06NY4_A13178ProForFT = new String[] {""} ;
      P06NY4_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NY4_A1645ProForNro = new byte[1] ;
      P06NY4_A3379ProForTnq = new byte[1] ;
      P06NY4_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NY4_A763ProForCla = new String[] {""} ;
      P06NY4_A5358ProForClv = new String[] {""} ;
      P06NY4_A488ForPrdDsc = new String[] {""} ;
      P06NY4_n488ForPrdDsc = new boolean[] {false} ;
      P06NY4_A765ProForDes = new String[] {""} ;
      P06NY4_A770ProForPrd = new String[] {""} ;
      P06NY4_A767ProForLin = new short[1] ;
      A13178ProForFT = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A5358ProForClv = "" ;
      A488ForPrdDsc = "" ;
      A765ProForDes = "" ;
      A770ProForPrd = "" ;
      AV65Proforcod = "" ;
      AV66Profordsc = "" ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      AV37ProForCan = DecimalUtil.ZERO ;
      AV35ProForNro = "" ;
      AV43ProForTnq = "" ;
      AV52ProForCPo = DecimalUtil.ZERO ;
      AV55Proforclv = "" ;
      AV56Prdnum = "" ;
      AV59Coste = DecimalUtil.ZERO ;
      AV58PrdFaccon = DecimalUtil.ZERO ;
      AV57PrdPreact = DecimalUtil.ZERO ;
      AV60CosteT = DecimalUtil.ZERO ;
      AV63Fab = DecimalUtil.ZERO ;
      AV62Text_c = "" ;
      GXt_char1 = "" ;
      GXv_char6 = new String[1] ;
      AV49ObsFor = "" ;
      P06NY5_A396EmprCod = new String[] {""} ;
      P06NY5_A719PrdNum = new String[] {""} ;
      P06NY5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NY5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV77Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.rfo0018__default(),
         new Object[] {
             new Object[] {
            P06NY2_A396EmprCod, P06NY2_A407EmprNom, P06NY2_n407EmprNom
            }
            , new Object[] {
            P06NY3_A396EmprCod, P06NY3_A764ProForCod, P06NY3_A13133ProForAct, P06NY3_A4586ProForObs, P06NY3_n4586ProForObs, P06NY3_A6061ProForLab, P06NY3_A2393ProNumRec, P06NY3_A2392ProNumPro, P06NY3_A769ProForMat, P06NY3_A772ProForTmx,
            P06NY3_A771ProForTie, P06NY3_A766ProForDsc
            }
            , new Object[] {
            P06NY4_A490ForPrdUMe, P06NY4_A396EmprCod, P06NY4_A764ProForCod, P06NY4_A13178ProForFT, P06NY4_A762ProForCan, P06NY4_A1645ProForNro, P06NY4_A3379ProForTnq, P06NY4_A6062ProForCPo, P06NY4_A763ProForCla, P06NY4_A5358ProForClv,
            P06NY4_A488ForPrdDsc, P06NY4_n488ForPrdDsc, P06NY4_A765ProForDes, P06NY4_A770ProForPrd, P06NY4_A767ProForLin
            }
            , new Object[] {
            P06NY5_A396EmprCod, P06NY5_A719PrdNum, P06NY5_A724PrdPreAct, P06NY5_A707PrdFacCon
            }
         }
      );
      AV77Pgmname = "FormulacionTinte.RFO0018" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV77Pgmname = "FormulacionTinte.RFO0018" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV39FlagHss ;
   private byte AV42ProTnq ;
   private byte AV45ObsPrf ;
   private byte AV53Ensayos ;
   private byte AV67moda21 ;
   private byte AV51CdpPor ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte A490ForPrdUMe ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private short gxcookieaux ;
   private short A772ProForTmx ;
   private short A771ProForTie ;
   private short A767ProForLin ;
   private short AV47Nlin ;
   private short AV48I ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A2393ProNumRec ;
   private int A2392ProNumPro ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV61Fabs ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal AV37ProForCan ;
   private java.math.BigDecimal AV52ProForCPo ;
   private java.math.BigDecimal AV59Coste ;
   private java.math.BigDecimal AV58PrdFaccon ;
   private java.math.BigDecimal AV57PrdPreact ;
   private java.math.BigDecimal AV60CosteT ;
   private java.math.BigDecimal AV63Fab ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A707PrdFacCon ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PProc ;
   private String AV17UProc ;
   private String AV69Op ;
   private String AV68proforact ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV29Lit10 ;
   private String AV30Lit11 ;
   private String AV31Lit12 ;
   private String AV32Lit13 ;
   private String AV33Lit14 ;
   private String AV34Lit15 ;
   private String AV38Lit16 ;
   private String AV44Lit17 ;
   private String AV46Lit18 ;
   private String AV50Lit19 ;
   private String AV54Lit20 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A764ProForCod ;
   private String A13133ProForAct ;
   private String A6061ProForLab ;
   private String A769ProForMat ;
   private String A766ProForDsc ;
   private String AV40ProForCCi ;
   private String AV41ProForDCi ;
   private String AV64LastProforFT ;
   private String A13178ProForFT ;
   private String A763ProForCla ;
   private String A5358ProForClv ;
   private String A488ForPrdDsc ;
   private String A765ProForDes ;
   private String A770ProForPrd ;
   private String AV65Proforcod ;
   private String AV66Profordsc ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String AV35ProForNro ;
   private String AV43ProForTnq ;
   private String AV55Proforclv ;
   private String AV56Prdnum ;
   private String AV62Text_c ;
   private String GXt_char1 ;
   private String GXv_char6[] ;
   private String AV49ObsFor ;
   private String A719PrdNum ;
   private String Gx_time ;
   private String AV77Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n4586ProForObs ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private String A4586ProForObs ;
   private IDataStoreProvider pr_default ;
   private String[] P06NY2_A396EmprCod ;
   private String[] P06NY2_A407EmprNom ;
   private boolean[] P06NY2_n407EmprNom ;
   private String[] P06NY3_A396EmprCod ;
   private String[] P06NY3_A764ProForCod ;
   private String[] P06NY3_A13133ProForAct ;
   private String[] P06NY3_A4586ProForObs ;
   private boolean[] P06NY3_n4586ProForObs ;
   private String[] P06NY3_A6061ProForLab ;
   private int[] P06NY3_A2393ProNumRec ;
   private int[] P06NY3_A2392ProNumPro ;
   private String[] P06NY3_A769ProForMat ;
   private short[] P06NY3_A772ProForTmx ;
   private short[] P06NY3_A771ProForTie ;
   private String[] P06NY3_A766ProForDsc ;
   private byte[] P06NY4_A490ForPrdUMe ;
   private String[] P06NY4_A396EmprCod ;
   private String[] P06NY4_A764ProForCod ;
   private String[] P06NY4_A13178ProForFT ;
   private java.math.BigDecimal[] P06NY4_A762ProForCan ;
   private byte[] P06NY4_A1645ProForNro ;
   private byte[] P06NY4_A3379ProForTnq ;
   private java.math.BigDecimal[] P06NY4_A6062ProForCPo ;
   private String[] P06NY4_A763ProForCla ;
   private String[] P06NY4_A5358ProForClv ;
   private String[] P06NY4_A488ForPrdDsc ;
   private boolean[] P06NY4_n488ForPrdDsc ;
   private String[] P06NY4_A765ProForDes ;
   private String[] P06NY4_A770ProForPrd ;
   private short[] P06NY4_A767ProForLin ;
   private String[] P06NY5_A396EmprCod ;
   private String[] P06NY5_A719PrdNum ;
   private java.math.BigDecimal[] P06NY5_A724PrdPreAct ;
   private java.math.BigDecimal[] P06NY5_A707PrdFacCon ;
}

final  class rfo0018__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06NY2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06NY3", "SELECT EmprCod, ProForCod, ProForAct, ProForObs, ProForLab, ProNumRec, ProNumPro, ProForMat, ProForTmx, ProForTie, ProForDsc FROM TXPCPROFO WHERE (EmprCod = ? and ProForCod >= ?) AND (ProForAct = ?) AND (ProForCod <= ?) ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NY4", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForFT, T1.ProForCan, T1.ProForNro, T1.ProForTnq, T1.ProForCPo, T1.ProForCla, T1.ProForClv, T2.ForPrdDsc, T1.ProForDes, T1.ProForPrd, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NY5", "SELECT EmprCod, PrdNum, PrdPreAct, PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 6);
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

