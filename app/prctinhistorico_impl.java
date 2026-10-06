package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class prctinhistorico_impl extends GXWebReport
{
   public prctinhistorico_impl( com.genexus.internet.HttpContext context )
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
         AV17EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV8HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
            AV9HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
            AV10HreBarPar = httpContext.GetPar( "HreBarPar") ;
            AV11HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
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
      M_bot = 3 ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV26Divpor1000 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( AV17EmprCod, "100000", GXv_int2) ;
         prctinhistorico_impl.this.GXt_int1 = GXv_int2[0] ;
         AV26Divpor1000 = GXt_int1 ;
         GxHdr2 = true ;
         /* Using cursor P08LJ2 */
         pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV8HreBarCod), Byte.valueOf(AV9HreBarReo), AV10HreBarPar, Byte.valueOf(AV11HreNumCie)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4545HreLinMaq = P08LJ2_A4545HreLinMaq[0] ;
            A4495HreNumCie = P08LJ2_A4495HreNumCie[0] ;
            A4494HreBarPar = P08LJ2_A4494HreBarPar[0] ;
            A4493HreBarReo = P08LJ2_A4493HreBarReo[0] ;
            A4492HreBarCod = P08LJ2_A4492HreBarCod[0] ;
            A396EmprCod = P08LJ2_A396EmprCod[0] ;
            A13763HreUser = P08LJ2_A13763HreUser[0] ;
            A13764HreDiaHora = P08LJ2_A13764HreDiaHora[0] ;
            A4863HreUsrCod = P08LJ2_A4863HreUsrCod[0] ;
            n4863HreUsrCod = P08LJ2_n4863HreUsrCod[0] ;
            A4960HreFecAlt = P08LJ2_A4960HreFecAlt[0] ;
            n4960HreFecAlt = P08LJ2_n4960HreFecAlt[0] ;
            A4961HreUsrMod = P08LJ2_A4961HreUsrMod[0] ;
            n4961HreUsrMod = P08LJ2_n4961HreUsrMod[0] ;
            A4962HreFecMod = P08LJ2_A4962HreFecMod[0] ;
            n4962HreFecMod = P08LJ2_n4962HreFecMod[0] ;
            A13766HreCtw = P08LJ2_A13766HreCtw[0] ;
            A4534HreBarPie = P08LJ2_A4534HreBarPie[0] ;
            n4534HreBarPie = P08LJ2_n4534HreBarPie[0] ;
            A4533HreBarMtr = P08LJ2_A4533HreBarMtr[0] ;
            n4533HreBarMtr = P08LJ2_n4533HreBarMtr[0] ;
            A4532HreBarKgm = P08LJ2_A4532HreBarKgm[0] ;
            n4532HreBarKgm = P08LJ2_n4532HreBarKgm[0] ;
            A4544HreTotPie = P08LJ2_A4544HreTotPie[0] ;
            n4544HreTotPie = P08LJ2_n4544HreTotPie[0] ;
            A4526HreTipColN = P08LJ2_A4526HreTipColN[0] ;
            n4526HreTipColN = P08LJ2_n4526HreTipColN[0] ;
            A4525HreTipCol = P08LJ2_A4525HreTipCol[0] ;
            n4525HreTipCol = P08LJ2_n4525HreTipCol[0] ;
            A4540HreIntDsc = P08LJ2_A4540HreIntDsc[0] ;
            n4540HreIntDsc = P08LJ2_n4540HreIntDsc[0] ;
            A1094HreNPrg = P08LJ2_A1094HreNPrg[0] ;
            n1094HreNPrg = P08LJ2_n1094HreNPrg[0] ;
            A4547HreVolPrd = P08LJ2_A4547HreVolPrd[0] ;
            n4547HreVolPrd = P08LJ2_n4547HreVolPrd[0] ;
            A4543HreTotMtr = P08LJ2_A4543HreTotMtr[0] ;
            n4543HreTotMtr = P08LJ2_n4543HreTotMtr[0] ;
            A4542HreTotKgm = P08LJ2_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P08LJ2_n4542HreTotKgm[0] ;
            A4546HreMaqCod = P08LJ2_A4546HreMaqCod[0] ;
            n4546HreMaqCod = P08LJ2_n4546HreMaqCod[0] ;
            A4524HreColNumC = P08LJ2_A4524HreColNumC[0] ;
            n4524HreColNumC = P08LJ2_n4524HreColNumC[0] ;
            A4523HreColNomC = P08LJ2_A4523HreColNomC[0] ;
            n4523HreColNomC = P08LJ2_n4523HreColNomC[0] ;
            A4522HreColNum = P08LJ2_A4522HreColNum[0] ;
            n4522HreColNum = P08LJ2_n4522HreColNum[0] ;
            A4521HreColNom = P08LJ2_A4521HreColNom[0] ;
            n4521HreColNom = P08LJ2_n4521HreColNom[0] ;
            A4518HreBarDsc = P08LJ2_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P08LJ2_n4518HreBarDsc[0] ;
            A4517HreBarSer = P08LJ2_A4517HreBarSer[0] ;
            n4517HreBarSer = P08LJ2_n4517HreBarSer[0] ;
            A279CliNom = P08LJ2_A279CliNom[0] ;
            A252CliCod = P08LJ2_A252CliCod[0] ;
            n252CliCod = P08LJ2_n252CliCod[0] ;
            A13763HreUser = P08LJ2_A13763HreUser[0] ;
            A13764HreDiaHora = P08LJ2_A13764HreDiaHora[0] ;
            A13766HreCtw = P08LJ2_A13766HreCtw[0] ;
            A4534HreBarPie = P08LJ2_A4534HreBarPie[0] ;
            n4534HreBarPie = P08LJ2_n4534HreBarPie[0] ;
            A4533HreBarMtr = P08LJ2_A4533HreBarMtr[0] ;
            n4533HreBarMtr = P08LJ2_n4533HreBarMtr[0] ;
            A4532HreBarKgm = P08LJ2_A4532HreBarKgm[0] ;
            n4532HreBarKgm = P08LJ2_n4532HreBarKgm[0] ;
            A4544HreTotPie = P08LJ2_A4544HreTotPie[0] ;
            n4544HreTotPie = P08LJ2_n4544HreTotPie[0] ;
            A4526HreTipColN = P08LJ2_A4526HreTipColN[0] ;
            n4526HreTipColN = P08LJ2_n4526HreTipColN[0] ;
            A4525HreTipCol = P08LJ2_A4525HreTipCol[0] ;
            n4525HreTipCol = P08LJ2_n4525HreTipCol[0] ;
            A4540HreIntDsc = P08LJ2_A4540HreIntDsc[0] ;
            n4540HreIntDsc = P08LJ2_n4540HreIntDsc[0] ;
            A4543HreTotMtr = P08LJ2_A4543HreTotMtr[0] ;
            n4543HreTotMtr = P08LJ2_n4543HreTotMtr[0] ;
            A4542HreTotKgm = P08LJ2_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P08LJ2_n4542HreTotKgm[0] ;
            A4524HreColNumC = P08LJ2_A4524HreColNumC[0] ;
            n4524HreColNumC = P08LJ2_n4524HreColNumC[0] ;
            A4523HreColNomC = P08LJ2_A4523HreColNomC[0] ;
            n4523HreColNomC = P08LJ2_n4523HreColNomC[0] ;
            A4522HreColNum = P08LJ2_A4522HreColNum[0] ;
            n4522HreColNum = P08LJ2_n4522HreColNum[0] ;
            A4521HreColNom = P08LJ2_A4521HreColNom[0] ;
            n4521HreColNom = P08LJ2_n4521HreColNom[0] ;
            A4518HreBarDsc = P08LJ2_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P08LJ2_n4518HreBarDsc[0] ;
            A4517HreBarSer = P08LJ2_A4517HreBarSer[0] ;
            n4517HreBarSer = P08LJ2_n4517HreBarSer[0] ;
            A252CliCod = P08LJ2_A252CliCod[0] ;
            n252CliCod = P08LJ2_n252CliCod[0] ;
            A279CliNom = P08LJ2_A279CliNom[0] ;
            AV21RelBany = GXutil.roundDecimal( (DecimalUtil.doubleToDec(A4547HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)), 2) ;
            AV28HreUser = A13763HreUser ;
            AV29HreDiaHora = A13764HreDiaHora ;
            AV30HreUsrCod = A4863HreUsrCod ;
            AV31HreFecAlt = A4960HreFecAlt ;
            AV32HreUsrMod = A4961HreUsrMod ;
            AV33HreFecMod = A4962HreFecMod ;
            AV37Cod_Idtx = A13766HreCtw ;
            /* Execute user subroutine: 'INDITEX' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            GXv_char3[0] = AV39PO ;
            new app.barordcomp(remoteHandle, context).execute( A396EmprCod, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, GXv_char3) ;
            prctinhistorico_impl.this.AV39PO = GXv_char3[0] ;
            AV36SiAgrupacion = (byte)(0) ;
            AV22Inicio = (byte)(0) ;
            /* Using cursor P08LJ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4499HreAgrPar = P08LJ3_A4499HreAgrPar[0] ;
               A4498HreAgrReo = P08LJ3_A4498HreAgrReo[0] ;
               A4497HreAgrCod = P08LJ3_A4497HreAgrCod[0] ;
               AV36SiAgrupacion = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV36SiAgrupacion == 1 )
            {
               h8LJ0( false, 50) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 15, Gx_line+29, 38, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 109, Gx_line+29, 168, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 241, Gx_line+29, 322, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 570, Gx_line+29, 607, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 653, Gx_line+29, 698, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 708, Gx_line+29, 753, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Agrupacion de Hdrs:", ""), 19, Gx_line+0, 159, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+45, 93, Gx_line+45, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(109, Gx_line+46, 226, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(239, Gx_line+45, 429, Gx_line+45, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(541, Gx_line+45, 607, Gx_line+45, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(632, Gx_line+44, 698, Gx_line+44, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(709, Gx_line+46, 753, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(19, Gx_line+18, 148, Gx_line+18, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PO", ""), 454, Gx_line+29, 470, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(453, Gx_line+45, 527, Gx_line+45, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+50) ;
               h8LJ0( false, 21) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9")), 15, Gx_line+0, 74, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9")), 76, Gx_line+0, 84, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), 88, Gx_line+0, 96, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4517HreBarSer, "")), 109, Gx_line+0, 227, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4518HreBarDsc, "")), 239, Gx_line+0, 430, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4532HreBarKgm, "ZZZZZ9.99")), 540, Gx_line+0, 607, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4533HreBarMtr, "ZZZZZ9.99")), 631, Gx_line+0, 698, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4534HreBarPie), "ZZZ9")), 708, Gx_line+0, 753, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39PO, "")), 448, Gx_line+0, 522, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
            }
            /* Using cursor P08LJ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4501HreAgrMtr = P08LJ4_A4501HreAgrMtr[0] ;
               A4505HreAgrDsc = P08LJ4_A4505HreAgrDsc[0] ;
               A4502HreAgrPie = P08LJ4_A4502HreAgrPie[0] ;
               A4500HreAgrKgm = P08LJ4_A4500HreAgrKgm[0] ;
               A4504HreAgrSer = P08LJ4_A4504HreAgrSer[0] ;
               A4499HreAgrPar = P08LJ4_A4499HreAgrPar[0] ;
               A4498HreAgrReo = P08LJ4_A4498HreAgrReo[0] ;
               A4497HreAgrCod = P08LJ4_A4497HreAgrCod[0] ;
               GXv_char3[0] = AV39PO ;
               new app.barordcomp(remoteHandle, context).execute( A396EmprCod, A4497HreAgrCod, A4498HreAgrReo, A4499HreAgrPar, GXv_char3) ;
               prctinhistorico_impl.this.AV39PO = GXv_char3[0] ;
               h8LJ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4497HreAgrCod), "ZZZZZZZ9")), 15, Gx_line+1, 74, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4498HreAgrReo), "9")), 76, Gx_line+1, 84, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4499HreAgrPar, "")), 88, Gx_line+1, 96, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4504HreAgrSer, "")), 109, Gx_line+1, 227, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4500HreAgrKgm, "ZZZZZ9.99")), 540, Gx_line+0, 607, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4502HreAgrPie), "ZZZ9")), 708, Gx_line+0, 738, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4505HreAgrDsc, "")), 239, Gx_line+0, 430, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4501HreAgrMtr, "ZZZZZ9.99")), 631, Gx_line+0, 698, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39PO, "")), 448, Gx_line+0, 522, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV22Inicio == 1 )
            {
               h8LJ0( false, 16) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
            }
            /* Using cursor P08LJ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4550HreLinPro = P08LJ5_A4550HreLinPro[0] ;
               A4552HreProDsc = P08LJ5_A4552HreProDsc[0] ;
               A4551HreProCod = P08LJ5_A4551HreProCod[0] ;
               h8LJ0( false, 30) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 32, Gx_line+9, 84, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4551HreProCod, "")), 91, Gx_line+9, 136, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4552HreProDsc, "")), 142, Gx_line+9, 362, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+4, 782, Gx_line+28, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+30) ;
               AV22Inicio = (byte)(0) ;
               /* Using cursor P08LJ6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A4559HrePrdDsc = P08LJ6_A4559HrePrdDsc[0] ;
                  n4559HrePrdDsc = P08LJ6_n4559HrePrdDsc[0] ;
                  A4562HreFacCon = P08LJ6_A4562HreFacCon[0] ;
                  n4562HreFacCon = P08LJ6_n4562HreFacCon[0] ;
                  A4566HreForNro = P08LJ6_A4566HreForNro[0] ;
                  n4566HreForNro = P08LJ6_n4566HreForNro[0] ;
                  A5726HreLote = P08LJ6_A5726HreLote[0] ;
                  n5726HreLote = P08LJ6_n5726HreLote[0] ;
                  A719PrdNum = P08LJ6_A719PrdNum[0] ;
                  n719PrdNum = P08LJ6_n719PrdNum[0] ;
                  A4561HrePrdUDs = P08LJ6_A4561HrePrdUDs[0] ;
                  n4561HrePrdUDs = P08LJ6_n4561HrePrdUDs[0] ;
                  A4560HrePrdUMe = P08LJ6_A4560HrePrdUMe[0] ;
                  n4560HrePrdUMe = P08LJ6_n4560HrePrdUMe[0] ;
                  A4563HrePrdCant = P08LJ6_A4563HrePrdCant[0] ;
                  n4563HrePrdCant = P08LJ6_n4563HrePrdCant[0] ;
                  A4565HreCanAny = P08LJ6_A4565HreCanAny[0] ;
                  n4565HreCanAny = P08LJ6_n4565HreCanAny[0] ;
                  A4558HrePrdNum = P08LJ6_A4558HrePrdNum[0] ;
                  n4558HrePrdNum = P08LJ6_n4558HrePrdNum[0] ;
                  A4557HreRecLin = P08LJ6_A4557HreRecLin[0] ;
                  if ( AV22Inicio == 0 )
                  {
                     h8LJ0( false, 41) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 21, Gx_line+16, 80, Gx_line+31, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 442, Gx_line+0, 501, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 561, Gx_line+0, 620, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 445, Gx_line+16, 497, Gx_line+31, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Adicionada", ""), 554, Gx_line+16, 628, Gx_line+31, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(23, Gx_line+33, 261, Gx_line+33, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 288, Gx_line+18, 333, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(269, Gx_line+33, 372, Gx_line+33, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(416, Gx_line+33, 525, Gx_line+33, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(535, Gx_line+33, 644, Gx_line+33, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 390, Gx_line+16, 406, Gx_line+31, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(390, Gx_line+33, 405, Gx_line+33, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 663, Gx_line+16, 693, Gx_line+31, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(661, Gx_line+33, 770, Gx_line+33, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+41) ;
                     AV22Inicio = (byte)(1) ;
                  }
                  AV34HreFacCon = A4562HreFacCon ;
                  AV24HreForNro = A4566HreForNro ;
                  AV16Lote10 = GXutil.trim( A5726HreLote) ;
                  AV27PrdNum = A719PrdNum ;
                  AV23PrdCFin = DecimalUtil.doubleToDec(0) ;
                  AV24HreForNro = A4566HreForNro ;
                  AV25Hrelinmaq = A4545HreLinMaq ;
                  /* Execute user subroutine: 'HISREA' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(4);
                     pr_default.close(3);
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV12Und = GXutil.substring( A4561HrePrdUDs, 1, 3) ;
                  AV14Unidades = A4561HrePrdUDs ;
                  if ( AV26Divpor1000 == 0 )
                  {
                     AV14Unidades = ((A4560HrePrdUMe==3) ? httpContext.getMessage( "g", "") : ((A4560HrePrdUMe==2) ? httpContext.getMessage( "cc", "") : httpContext.getMessage( "g", ""))) ;
                  }
                  else
                  {
                     AV14Unidades = ((A4560HrePrdUMe==1)||(A4560HrePrdUMe==3) ? httpContext.getMessage( "kg", "") : httpContext.getMessage( "lt", "")) ;
                  }
                  AV13PrdCant = ((AV26Divpor1000==0) ? A4563HrePrdCant : A4563HrePrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV15PrdCanAny = ((A4565HreCanAny.doubleValue()>0) ? (A4565HreCanAny.add(AV23PrdCFin)) : ((AV23PrdCFin.doubleValue()>0) ? (AV23PrdCFin) : DecimalUtil.doubleToDec(0))) ;
                  AV15PrdCanAny = ((AV26Divpor1000==0) ? AV15PrdCanAny : AV15PrdCanAny.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV12Und = ((AV13PrdCant.doubleValue()==0) ? "" : AV12Und) ;
                  AV14Unidades = ((AV13PrdCant.doubleValue()==0) ? "" : AV14Unidades) ;
                  AV35Unidades2 = (((A4565HreCanAny.add(AV23PrdCFin)).doubleValue()==0) ? "" : AV35Unidades2) ;
                  h8LJ0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 21, Gx_line+0, 66, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 72, Gx_line+0, 263, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34HreFacCon, "ZZZZZ.ZZZZZ")), 269, Gx_line+0, 350, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Und, "")), 356, Gx_line+0, 379, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13PrdCant, "ZZZZZZ.ZZZZ")), 416, Gx_line+0, 497, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Unidades, "")), 499, Gx_line+0, 529, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15PrdCanAny, "ZZZZZZ.ZZZZ")), 535, Gx_line+0, 616, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Unidades2, "")), 622, Gx_line+0, 652, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lote10, "")), 661, Gx_line+0, 771, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24HreForNro), "ZZ")), 390, Gx_line+1, 406, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               pr_default.readNext(3);
            }
            pr_default.close(3);
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h8LJ0( true, 0) ;
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
      /* 'HISREA' Routine */
      returnInSub = false ;
      AV23PrdCFin = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P08LJ7 */
      pr_default.execute(5, new Object[] {AV17EmprCod, Integer.valueOf(AV8HreBarCod), Byte.valueOf(AV9HreBarReo), AV10HreBarPar, Byte.valueOf(AV11HreNumCie), Short.valueOf(AV25Hrelinmaq), AV27PrdNum});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P08LJ7_A396EmprCod[0] ;
         A4492HreBarCod = P08LJ7_A4492HreBarCod[0] ;
         A4493HreBarReo = P08LJ7_A4493HreBarReo[0] ;
         A4494HreBarPar = P08LJ7_A4494HreBarPar[0] ;
         A4495HreNumCie = P08LJ7_A4495HreNumCie[0] ;
         A4508HreLinMAL = P08LJ7_A4508HreLinMAL[0] ;
         A719PrdNum = P08LJ7_A719PrdNum[0] ;
         n719PrdNum = P08LJ7_n719PrdNum[0] ;
         A4514HreLanyNro = P08LJ7_A4514HreLanyNro[0] ;
         n4514HreLanyNro = P08LJ7_n4514HreLanyNro[0] ;
         A4511HrePrdCFin = P08LJ7_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P08LJ7_n4511HrePrdCFin[0] ;
         A4509HreNumAny = P08LJ7_A4509HreNumAny[0] ;
         if ( A4514HreLanyNro == AV24HreForNro )
         {
            AV23PrdCFin = AV23PrdCFin.add(A4511HrePrdCFin) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P08LJ8 */
      pr_default.execute(6, new Object[] {AV37Cod_Idtx});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A10887Cod_Idtx = P08LJ8_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P08LJ8_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P08LJ8_n10888Dsc_Idtx[0] ;
         A396EmprCod = P08LJ8_A396EmprCod[0] ;
         AV38Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void h8LJ0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Alta", ""), 107, Gx_line+4, 137, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28HreUser, "")), 19, Gx_line+19, 93, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV31HreFecAlt, "99/99/99 99:99:99"), 99, Gx_line+19, 224, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Modificacion", ""), 319, Gx_line+4, 408, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32HreUsrMod, "")), 267, Gx_line+19, 326, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV33HreFecMod, "99/99/99 99:99:99"), 332, Gx_line+19, 457, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28HreUser, "")), 544, Gx_line+19, 618, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV29HreDiaHora, "99/99/99 99:99"), 631, Gx_line+19, 734, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cierre", ""), 621, Gx_line+4, 666, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(19, Gx_line+19, 224, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(267, Gx_line+19, 458, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(544, Gx_line+19, 735, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+0, 782, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+36) ;
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 22, Gx_line+44, 74, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 88, Gx_line+44, 133, Gx_line+60, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 139, Gx_line+44, 359, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 22, Gx_line+59, 81, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4517HreBarSer, "")), 88, Gx_line+59, 206, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4518HreBarDsc, "")), 220, Gx_line+59, 411, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 22, Gx_line+86, 59, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4521HreColNom, "")), 88, Gx_line+86, 184, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9")), 190, Gx_line+86, 235, Gx_line+102, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color Cl", ""), 22, Gx_line+101, 81, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4523HreColNomC, "")), 88, Gx_line+101, 184, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4524HreColNumC), "ZZZZZ9")), 190, Gx_line+101, 235, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 634, Gx_line+15, 686, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4546HreMaqCod, "")), 715, Gx_line+15, 760, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 634, Gx_line+44, 671, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4542HreTotKgm, "ZZZZZ9.99")), 693, Gx_line+44, 760, Gx_line+60, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 634, Gx_line+58, 679, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4543HreTotMtr, "ZZZZZ9.99")), 693, Gx_line+58, 760, Gx_line+74, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Volumen", ""), 634, Gx_line+88, 686, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9")), 722, Gx_line+88, 759, Gx_line+104, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21RelBany, "ZZ9.99")), 715, Gx_line+102, 760, Gx_line+118, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 671, Gx_line+102, 687, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Programa", ""), 445, Gx_line+131, 526, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1094HreNPrg, "")), 554, Gx_line+131, 599, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 22, Gx_line+130, 96, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4540HreIntDsc, "")), 109, Gx_line+130, 329, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(17, Gx_line+168, 784, Gx_line+168, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 693, Gx_line+131, 738, Gx_line+147, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 750, Gx_line+131, 768, Gx_line+145, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 741, Gx_line+130, 746, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.:", ""), 649, Gx_line+131, 686, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hoja de Ruta Nº", ""), 22, Gx_line+15, 132, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9")), 139, Gx_line+15, 198, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9")), 204, Gx_line+15, 212, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), 219, Gx_line+15, 227, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9")), 328, Gx_line+15, 344, Gx_line+31, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cierre", ""), 255, Gx_line+15, 322, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Receta en HISTORICO)", ""), 408, Gx_line+15, 562, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(408, Gx_line+29, 561, Gx_line+29, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+13, 359, Gx_line+35, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo C", ""), 22, Gx_line+116, 67, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4525HreTipCol), "Z9")), 88, Gx_line+116, 104, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4526HreTipColN, "")), 106, Gx_line+116, 297, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 634, Gx_line+73, 679, Gx_line+88, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4544HreTotPie), "ZZZ9")), 715, Gx_line+73, 760, Gx_line+89, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Dsc_Idtx, "")), 371, Gx_line+101, 596, Gx_line+116, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PO", ""), 25, Gx_line+150, 41, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39PO, "")), 109, Gx_line+150, 183, Gx_line+166, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+175) ;
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
      AV17EmprCod = "" ;
      AV10HreBarPar = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P08LJ2_A4545HreLinMaq = new short[1] ;
      P08LJ2_A4495HreNumCie = new byte[1] ;
      P08LJ2_A4494HreBarPar = new String[] {""} ;
      P08LJ2_A4493HreBarReo = new byte[1] ;
      P08LJ2_A4492HreBarCod = new int[1] ;
      P08LJ2_A396EmprCod = new String[] {""} ;
      P08LJ2_A13763HreUser = new String[] {""} ;
      P08LJ2_A13764HreDiaHora = new java.util.Date[] {GXutil.nullDate()} ;
      P08LJ2_A4863HreUsrCod = new String[] {""} ;
      P08LJ2_n4863HreUsrCod = new boolean[] {false} ;
      P08LJ2_A4960HreFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08LJ2_n4960HreFecAlt = new boolean[] {false} ;
      P08LJ2_A4961HreUsrMod = new String[] {""} ;
      P08LJ2_n4961HreUsrMod = new boolean[] {false} ;
      P08LJ2_A4962HreFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P08LJ2_n4962HreFecMod = new boolean[] {false} ;
      P08LJ2_A13766HreCtw = new String[] {""} ;
      P08LJ2_A4534HreBarPie = new int[1] ;
      P08LJ2_n4534HreBarPie = new boolean[] {false} ;
      P08LJ2_A4533HreBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ2_n4533HreBarMtr = new boolean[] {false} ;
      P08LJ2_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ2_n4532HreBarKgm = new boolean[] {false} ;
      P08LJ2_A4544HreTotPie = new int[1] ;
      P08LJ2_n4544HreTotPie = new boolean[] {false} ;
      P08LJ2_A4526HreTipColN = new String[] {""} ;
      P08LJ2_n4526HreTipColN = new boolean[] {false} ;
      P08LJ2_A4525HreTipCol = new byte[1] ;
      P08LJ2_n4525HreTipCol = new boolean[] {false} ;
      P08LJ2_A4540HreIntDsc = new String[] {""} ;
      P08LJ2_n4540HreIntDsc = new boolean[] {false} ;
      P08LJ2_A1094HreNPrg = new String[] {""} ;
      P08LJ2_n1094HreNPrg = new boolean[] {false} ;
      P08LJ2_A4547HreVolPrd = new int[1] ;
      P08LJ2_n4547HreVolPrd = new boolean[] {false} ;
      P08LJ2_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ2_n4543HreTotMtr = new boolean[] {false} ;
      P08LJ2_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ2_n4542HreTotKgm = new boolean[] {false} ;
      P08LJ2_A4546HreMaqCod = new String[] {""} ;
      P08LJ2_n4546HreMaqCod = new boolean[] {false} ;
      P08LJ2_A4524HreColNumC = new int[1] ;
      P08LJ2_n4524HreColNumC = new boolean[] {false} ;
      P08LJ2_A4523HreColNomC = new String[] {""} ;
      P08LJ2_n4523HreColNomC = new boolean[] {false} ;
      P08LJ2_A4522HreColNum = new int[1] ;
      P08LJ2_n4522HreColNum = new boolean[] {false} ;
      P08LJ2_A4521HreColNom = new String[] {""} ;
      P08LJ2_n4521HreColNom = new boolean[] {false} ;
      P08LJ2_A4518HreBarDsc = new String[] {""} ;
      P08LJ2_n4518HreBarDsc = new boolean[] {false} ;
      P08LJ2_A4517HreBarSer = new String[] {""} ;
      P08LJ2_n4517HreBarSer = new boolean[] {false} ;
      P08LJ2_A279CliNom = new String[] {""} ;
      P08LJ2_A252CliCod = new int[1] ;
      P08LJ2_n252CliCod = new boolean[] {false} ;
      A4494HreBarPar = "" ;
      A396EmprCod = "" ;
      A13763HreUser = "" ;
      A13764HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      A4863HreUsrCod = "" ;
      A4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4961HreUsrMod = "" ;
      A4962HreFecMod = GXutil.resetTime( GXutil.nullDate() );
      A13766HreCtw = "" ;
      A4533HreBarMtr = DecimalUtil.ZERO ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4526HreTipColN = "" ;
      A4540HreIntDsc = "" ;
      A1094HreNPrg = "" ;
      A4543HreTotMtr = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4546HreMaqCod = "" ;
      A4523HreColNomC = "" ;
      A4521HreColNom = "" ;
      A4518HreBarDsc = "" ;
      A4517HreBarSer = "" ;
      A279CliNom = "" ;
      AV21RelBany = DecimalUtil.ZERO ;
      AV28HreUser = "" ;
      AV29HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      AV30HreUsrCod = "" ;
      AV31HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV32HreUsrMod = "" ;
      AV33HreFecMod = GXutil.resetTime( GXutil.nullDate() );
      AV37Cod_Idtx = "" ;
      AV39PO = "" ;
      P08LJ3_A396EmprCod = new String[] {""} ;
      P08LJ3_A4492HreBarCod = new int[1] ;
      P08LJ3_A4493HreBarReo = new byte[1] ;
      P08LJ3_A4494HreBarPar = new String[] {""} ;
      P08LJ3_A4495HreNumCie = new byte[1] ;
      P08LJ3_A4499HreAgrPar = new String[] {""} ;
      P08LJ3_A4498HreAgrReo = new byte[1] ;
      P08LJ3_A4497HreAgrCod = new int[1] ;
      A4499HreAgrPar = "" ;
      P08LJ4_A396EmprCod = new String[] {""} ;
      P08LJ4_A4492HreBarCod = new int[1] ;
      P08LJ4_A4493HreBarReo = new byte[1] ;
      P08LJ4_A4494HreBarPar = new String[] {""} ;
      P08LJ4_A4495HreNumCie = new byte[1] ;
      P08LJ4_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ4_A4505HreAgrDsc = new String[] {""} ;
      P08LJ4_A4502HreAgrPie = new short[1] ;
      P08LJ4_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ4_A4504HreAgrSer = new String[] {""} ;
      P08LJ4_A4499HreAgrPar = new String[] {""} ;
      P08LJ4_A4498HreAgrReo = new byte[1] ;
      P08LJ4_A4497HreAgrCod = new int[1] ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4505HreAgrDsc = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      GXv_char3 = new String[1] ;
      P08LJ5_A396EmprCod = new String[] {""} ;
      P08LJ5_A4492HreBarCod = new int[1] ;
      P08LJ5_A4493HreBarReo = new byte[1] ;
      P08LJ5_A4494HreBarPar = new String[] {""} ;
      P08LJ5_A4495HreNumCie = new byte[1] ;
      P08LJ5_A4545HreLinMaq = new short[1] ;
      P08LJ5_A4550HreLinPro = new byte[1] ;
      P08LJ5_A4552HreProDsc = new String[] {""} ;
      P08LJ5_A4551HreProCod = new String[] {""} ;
      A4552HreProDsc = "" ;
      A4551HreProCod = "" ;
      P08LJ6_A396EmprCod = new String[] {""} ;
      P08LJ6_A4492HreBarCod = new int[1] ;
      P08LJ6_A4493HreBarReo = new byte[1] ;
      P08LJ6_A4494HreBarPar = new String[] {""} ;
      P08LJ6_A4495HreNumCie = new byte[1] ;
      P08LJ6_A4545HreLinMaq = new short[1] ;
      P08LJ6_A4550HreLinPro = new byte[1] ;
      P08LJ6_A4559HrePrdDsc = new String[] {""} ;
      P08LJ6_n4559HrePrdDsc = new boolean[] {false} ;
      P08LJ6_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ6_n4562HreFacCon = new boolean[] {false} ;
      P08LJ6_A4566HreForNro = new byte[1] ;
      P08LJ6_n4566HreForNro = new boolean[] {false} ;
      P08LJ6_A5726HreLote = new String[] {""} ;
      P08LJ6_n5726HreLote = new boolean[] {false} ;
      P08LJ6_A719PrdNum = new String[] {""} ;
      P08LJ6_n719PrdNum = new boolean[] {false} ;
      P08LJ6_A4561HrePrdUDs = new String[] {""} ;
      P08LJ6_n4561HrePrdUDs = new boolean[] {false} ;
      P08LJ6_A4560HrePrdUMe = new byte[1] ;
      P08LJ6_n4560HrePrdUMe = new boolean[] {false} ;
      P08LJ6_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ6_n4563HrePrdCant = new boolean[] {false} ;
      P08LJ6_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ6_n4565HreCanAny = new boolean[] {false} ;
      P08LJ6_A4558HrePrdNum = new String[] {""} ;
      P08LJ6_n4558HrePrdNum = new boolean[] {false} ;
      P08LJ6_A4557HreRecLin = new short[1] ;
      A4559HrePrdDsc = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A5726HreLote = "" ;
      A719PrdNum = "" ;
      A4561HrePrdUDs = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4558HrePrdNum = "" ;
      AV34HreFacCon = DecimalUtil.ZERO ;
      AV16Lote10 = "" ;
      AV27PrdNum = "" ;
      AV23PrdCFin = DecimalUtil.ZERO ;
      AV12Und = "" ;
      AV14Unidades = "" ;
      AV13PrdCant = DecimalUtil.ZERO ;
      AV15PrdCanAny = DecimalUtil.ZERO ;
      AV35Unidades2 = "" ;
      P08LJ7_A396EmprCod = new String[] {""} ;
      P08LJ7_A4492HreBarCod = new int[1] ;
      P08LJ7_A4493HreBarReo = new byte[1] ;
      P08LJ7_A4494HreBarPar = new String[] {""} ;
      P08LJ7_A4495HreNumCie = new byte[1] ;
      P08LJ7_A4508HreLinMAL = new short[1] ;
      P08LJ7_A719PrdNum = new String[] {""} ;
      P08LJ7_n719PrdNum = new boolean[] {false} ;
      P08LJ7_A4514HreLanyNro = new byte[1] ;
      P08LJ7_n4514HreLanyNro = new boolean[] {false} ;
      P08LJ7_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LJ7_n4511HrePrdCFin = new boolean[] {false} ;
      P08LJ7_A4509HreNumAny = new byte[1] ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      P08LJ8_A10887Cod_Idtx = new String[] {""} ;
      P08LJ8_A10888Dsc_Idtx = new String[] {""} ;
      P08LJ8_n10888Dsc_Idtx = new boolean[] {false} ;
      P08LJ8_A396EmprCod = new String[] {""} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV38Dsc_Idtx = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prctinhistorico__default(),
         new Object[] {
             new Object[] {
            P08LJ2_A4545HreLinMaq, P08LJ2_A4495HreNumCie, P08LJ2_A4494HreBarPar, P08LJ2_A4493HreBarReo, P08LJ2_A4492HreBarCod, P08LJ2_A396EmprCod, P08LJ2_A13763HreUser, P08LJ2_A13764HreDiaHora, P08LJ2_A4863HreUsrCod, P08LJ2_n4863HreUsrCod,
            P08LJ2_A4960HreFecAlt, P08LJ2_n4960HreFecAlt, P08LJ2_A4961HreUsrMod, P08LJ2_n4961HreUsrMod, P08LJ2_A4962HreFecMod, P08LJ2_n4962HreFecMod, P08LJ2_A13766HreCtw, P08LJ2_A4534HreBarPie, P08LJ2_n4534HreBarPie, P08LJ2_A4533HreBarMtr,
            P08LJ2_n4533HreBarMtr, P08LJ2_A4532HreBarKgm, P08LJ2_n4532HreBarKgm, P08LJ2_A4544HreTotPie, P08LJ2_n4544HreTotPie, P08LJ2_A4526HreTipColN, P08LJ2_n4526HreTipColN, P08LJ2_A4525HreTipCol, P08LJ2_n4525HreTipCol, P08LJ2_A4540HreIntDsc,
            P08LJ2_n4540HreIntDsc, P08LJ2_A1094HreNPrg, P08LJ2_n1094HreNPrg, P08LJ2_A4547HreVolPrd, P08LJ2_n4547HreVolPrd, P08LJ2_A4543HreTotMtr, P08LJ2_n4543HreTotMtr, P08LJ2_A4542HreTotKgm, P08LJ2_n4542HreTotKgm, P08LJ2_A4546HreMaqCod,
            P08LJ2_n4546HreMaqCod, P08LJ2_A4524HreColNumC, P08LJ2_n4524HreColNumC, P08LJ2_A4523HreColNomC, P08LJ2_n4523HreColNomC, P08LJ2_A4522HreColNum, P08LJ2_n4522HreColNum, P08LJ2_A4521HreColNom, P08LJ2_n4521HreColNom, P08LJ2_A4518HreBarDsc,
            P08LJ2_n4518HreBarDsc, P08LJ2_A4517HreBarSer, P08LJ2_n4517HreBarSer, P08LJ2_A279CliNom, P08LJ2_A252CliCod, P08LJ2_n252CliCod
            }
            , new Object[] {
            P08LJ3_A396EmprCod, P08LJ3_A4492HreBarCod, P08LJ3_A4493HreBarReo, P08LJ3_A4494HreBarPar, P08LJ3_A4495HreNumCie, P08LJ3_A4499HreAgrPar, P08LJ3_A4498HreAgrReo, P08LJ3_A4497HreAgrCod
            }
            , new Object[] {
            P08LJ4_A396EmprCod, P08LJ4_A4492HreBarCod, P08LJ4_A4493HreBarReo, P08LJ4_A4494HreBarPar, P08LJ4_A4495HreNumCie, P08LJ4_A4501HreAgrMtr, P08LJ4_A4505HreAgrDsc, P08LJ4_A4502HreAgrPie, P08LJ4_A4500HreAgrKgm, P08LJ4_A4504HreAgrSer,
            P08LJ4_A4499HreAgrPar, P08LJ4_A4498HreAgrReo, P08LJ4_A4497HreAgrCod
            }
            , new Object[] {
            P08LJ5_A396EmprCod, P08LJ5_A4492HreBarCod, P08LJ5_A4493HreBarReo, P08LJ5_A4494HreBarPar, P08LJ5_A4495HreNumCie, P08LJ5_A4545HreLinMaq, P08LJ5_A4550HreLinPro, P08LJ5_A4552HreProDsc, P08LJ5_A4551HreProCod
            }
            , new Object[] {
            P08LJ6_A396EmprCod, P08LJ6_A4492HreBarCod, P08LJ6_A4493HreBarReo, P08LJ6_A4494HreBarPar, P08LJ6_A4495HreNumCie, P08LJ6_A4545HreLinMaq, P08LJ6_A4550HreLinPro, P08LJ6_A4559HrePrdDsc, P08LJ6_n4559HrePrdDsc, P08LJ6_A4562HreFacCon,
            P08LJ6_n4562HreFacCon, P08LJ6_A4566HreForNro, P08LJ6_n4566HreForNro, P08LJ6_A5726HreLote, P08LJ6_n5726HreLote, P08LJ6_A719PrdNum, P08LJ6_n719PrdNum, P08LJ6_A4561HrePrdUDs, P08LJ6_n4561HrePrdUDs, P08LJ6_A4560HrePrdUMe,
            P08LJ6_n4560HrePrdUMe, P08LJ6_A4563HrePrdCant, P08LJ6_n4563HrePrdCant, P08LJ6_A4565HreCanAny, P08LJ6_n4565HreCanAny, P08LJ6_A4558HrePrdNum, P08LJ6_n4558HrePrdNum, P08LJ6_A4557HreRecLin
            }
            , new Object[] {
            P08LJ7_A396EmprCod, P08LJ7_A4492HreBarCod, P08LJ7_A4493HreBarReo, P08LJ7_A4494HreBarPar, P08LJ7_A4495HreNumCie, P08LJ7_A4508HreLinMAL, P08LJ7_A719PrdNum, P08LJ7_A4514HreLanyNro, P08LJ7_n4514HreLanyNro, P08LJ7_A4511HrePrdCFin,
            P08LJ7_n4511HrePrdCFin, P08LJ7_A4509HreNumAny
            }
            , new Object[] {
            P08LJ8_A10887Cod_Idtx, P08LJ8_A10888Dsc_Idtx, P08LJ8_n10888Dsc_Idtx, P08LJ8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV9HreBarReo ;
   private byte AV11HreNumCie ;
   private byte AV26Divpor1000 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4525HreTipCol ;
   private byte AV36SiAgrupacion ;
   private byte AV22Inicio ;
   private byte A4498HreAgrReo ;
   private byte A4550HreLinPro ;
   private byte A4566HreForNro ;
   private byte A4560HrePrdUMe ;
   private byte AV24HreForNro ;
   private byte A4514HreLanyNro ;
   private byte A4509HreNumAny ;
   private short gxcookieaux ;
   private short A4545HreLinMaq ;
   private short A4502HreAgrPie ;
   private short A4557HreRecLin ;
   private short AV25Hrelinmaq ;
   private short A4508HreLinMAL ;
   private short Gx_err ;
   private int AV8HreBarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A4492HreBarCod ;
   private int A4534HreBarPie ;
   private int A4544HreTotPie ;
   private int A4547HreVolPrd ;
   private int A4524HreColNumC ;
   private int A4522HreColNum ;
   private int A252CliCod ;
   private int A4497HreAgrCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A4533HreBarMtr ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4543HreTotMtr ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal AV21RelBany ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal AV34HreFacCon ;
   private java.math.BigDecimal AV23PrdCFin ;
   private java.math.BigDecimal AV13PrdCant ;
   private java.math.BigDecimal AV15PrdCanAny ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV17EmprCod ;
   private String AV10HreBarPar ;
   private String scmdbuf ;
   private String A4494HreBarPar ;
   private String A396EmprCod ;
   private String A13763HreUser ;
   private String A4863HreUsrCod ;
   private String A4961HreUsrMod ;
   private String A13766HreCtw ;
   private String A4526HreTipColN ;
   private String A4540HreIntDsc ;
   private String A1094HreNPrg ;
   private String A4546HreMaqCod ;
   private String A4523HreColNomC ;
   private String A4521HreColNom ;
   private String A4518HreBarDsc ;
   private String A4517HreBarSer ;
   private String A279CliNom ;
   private String AV28HreUser ;
   private String AV30HreUsrCod ;
   private String AV32HreUsrMod ;
   private String AV37Cod_Idtx ;
   private String AV39PO ;
   private String A4499HreAgrPar ;
   private String A4505HreAgrDsc ;
   private String A4504HreAgrSer ;
   private String GXv_char3[] ;
   private String A4552HreProDsc ;
   private String A4551HreProCod ;
   private String A4559HrePrdDsc ;
   private String A5726HreLote ;
   private String A719PrdNum ;
   private String A4561HrePrdUDs ;
   private String A4558HrePrdNum ;
   private String AV16Lote10 ;
   private String AV27PrdNum ;
   private String AV12Und ;
   private String AV14Unidades ;
   private String AV35Unidades2 ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV38Dsc_Idtx ;
   private java.util.Date A13764HreDiaHora ;
   private java.util.Date A4960HreFecAlt ;
   private java.util.Date A4962HreFecMod ;
   private java.util.Date AV29HreDiaHora ;
   private java.util.Date AV31HreFecAlt ;
   private java.util.Date AV33HreFecMod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean n4863HreUsrCod ;
   private boolean n4960HreFecAlt ;
   private boolean n4961HreUsrMod ;
   private boolean n4962HreFecMod ;
   private boolean n4534HreBarPie ;
   private boolean n4533HreBarMtr ;
   private boolean n4532HreBarKgm ;
   private boolean n4544HreTotPie ;
   private boolean n4526HreTipColN ;
   private boolean n4525HreTipCol ;
   private boolean n4540HreIntDsc ;
   private boolean n1094HreNPrg ;
   private boolean n4547HreVolPrd ;
   private boolean n4543HreTotMtr ;
   private boolean n4542HreTotKgm ;
   private boolean n4546HreMaqCod ;
   private boolean n4524HreColNumC ;
   private boolean n4523HreColNomC ;
   private boolean n4522HreColNum ;
   private boolean n4521HreColNom ;
   private boolean n4518HreBarDsc ;
   private boolean n4517HreBarSer ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n4559HrePrdDsc ;
   private boolean n4562HreFacCon ;
   private boolean n4566HreForNro ;
   private boolean n5726HreLote ;
   private boolean n719PrdNum ;
   private boolean n4561HrePrdUDs ;
   private boolean n4560HrePrdUMe ;
   private boolean n4563HrePrdCant ;
   private boolean n4565HreCanAny ;
   private boolean n4558HrePrdNum ;
   private boolean n4514HreLanyNro ;
   private boolean n4511HrePrdCFin ;
   private boolean n10888Dsc_Idtx ;
   private IDataStoreProvider pr_default ;
   private short[] P08LJ2_A4545HreLinMaq ;
   private byte[] P08LJ2_A4495HreNumCie ;
   private String[] P08LJ2_A4494HreBarPar ;
   private byte[] P08LJ2_A4493HreBarReo ;
   private int[] P08LJ2_A4492HreBarCod ;
   private String[] P08LJ2_A396EmprCod ;
   private String[] P08LJ2_A13763HreUser ;
   private java.util.Date[] P08LJ2_A13764HreDiaHora ;
   private String[] P08LJ2_A4863HreUsrCod ;
   private boolean[] P08LJ2_n4863HreUsrCod ;
   private java.util.Date[] P08LJ2_A4960HreFecAlt ;
   private boolean[] P08LJ2_n4960HreFecAlt ;
   private String[] P08LJ2_A4961HreUsrMod ;
   private boolean[] P08LJ2_n4961HreUsrMod ;
   private java.util.Date[] P08LJ2_A4962HreFecMod ;
   private boolean[] P08LJ2_n4962HreFecMod ;
   private String[] P08LJ2_A13766HreCtw ;
   private int[] P08LJ2_A4534HreBarPie ;
   private boolean[] P08LJ2_n4534HreBarPie ;
   private java.math.BigDecimal[] P08LJ2_A4533HreBarMtr ;
   private boolean[] P08LJ2_n4533HreBarMtr ;
   private java.math.BigDecimal[] P08LJ2_A4532HreBarKgm ;
   private boolean[] P08LJ2_n4532HreBarKgm ;
   private int[] P08LJ2_A4544HreTotPie ;
   private boolean[] P08LJ2_n4544HreTotPie ;
   private String[] P08LJ2_A4526HreTipColN ;
   private boolean[] P08LJ2_n4526HreTipColN ;
   private byte[] P08LJ2_A4525HreTipCol ;
   private boolean[] P08LJ2_n4525HreTipCol ;
   private String[] P08LJ2_A4540HreIntDsc ;
   private boolean[] P08LJ2_n4540HreIntDsc ;
   private String[] P08LJ2_A1094HreNPrg ;
   private boolean[] P08LJ2_n1094HreNPrg ;
   private int[] P08LJ2_A4547HreVolPrd ;
   private boolean[] P08LJ2_n4547HreVolPrd ;
   private java.math.BigDecimal[] P08LJ2_A4543HreTotMtr ;
   private boolean[] P08LJ2_n4543HreTotMtr ;
   private java.math.BigDecimal[] P08LJ2_A4542HreTotKgm ;
   private boolean[] P08LJ2_n4542HreTotKgm ;
   private String[] P08LJ2_A4546HreMaqCod ;
   private boolean[] P08LJ2_n4546HreMaqCod ;
   private int[] P08LJ2_A4524HreColNumC ;
   private boolean[] P08LJ2_n4524HreColNumC ;
   private String[] P08LJ2_A4523HreColNomC ;
   private boolean[] P08LJ2_n4523HreColNomC ;
   private int[] P08LJ2_A4522HreColNum ;
   private boolean[] P08LJ2_n4522HreColNum ;
   private String[] P08LJ2_A4521HreColNom ;
   private boolean[] P08LJ2_n4521HreColNom ;
   private String[] P08LJ2_A4518HreBarDsc ;
   private boolean[] P08LJ2_n4518HreBarDsc ;
   private String[] P08LJ2_A4517HreBarSer ;
   private boolean[] P08LJ2_n4517HreBarSer ;
   private String[] P08LJ2_A279CliNom ;
   private int[] P08LJ2_A252CliCod ;
   private boolean[] P08LJ2_n252CliCod ;
   private String[] P08LJ3_A396EmprCod ;
   private int[] P08LJ3_A4492HreBarCod ;
   private byte[] P08LJ3_A4493HreBarReo ;
   private String[] P08LJ3_A4494HreBarPar ;
   private byte[] P08LJ3_A4495HreNumCie ;
   private String[] P08LJ3_A4499HreAgrPar ;
   private byte[] P08LJ3_A4498HreAgrReo ;
   private int[] P08LJ3_A4497HreAgrCod ;
   private String[] P08LJ4_A396EmprCod ;
   private int[] P08LJ4_A4492HreBarCod ;
   private byte[] P08LJ4_A4493HreBarReo ;
   private String[] P08LJ4_A4494HreBarPar ;
   private byte[] P08LJ4_A4495HreNumCie ;
   private java.math.BigDecimal[] P08LJ4_A4501HreAgrMtr ;
   private String[] P08LJ4_A4505HreAgrDsc ;
   private short[] P08LJ4_A4502HreAgrPie ;
   private java.math.BigDecimal[] P08LJ4_A4500HreAgrKgm ;
   private String[] P08LJ4_A4504HreAgrSer ;
   private String[] P08LJ4_A4499HreAgrPar ;
   private byte[] P08LJ4_A4498HreAgrReo ;
   private int[] P08LJ4_A4497HreAgrCod ;
   private String[] P08LJ5_A396EmprCod ;
   private int[] P08LJ5_A4492HreBarCod ;
   private byte[] P08LJ5_A4493HreBarReo ;
   private String[] P08LJ5_A4494HreBarPar ;
   private byte[] P08LJ5_A4495HreNumCie ;
   private short[] P08LJ5_A4545HreLinMaq ;
   private byte[] P08LJ5_A4550HreLinPro ;
   private String[] P08LJ5_A4552HreProDsc ;
   private String[] P08LJ5_A4551HreProCod ;
   private String[] P08LJ6_A396EmprCod ;
   private int[] P08LJ6_A4492HreBarCod ;
   private byte[] P08LJ6_A4493HreBarReo ;
   private String[] P08LJ6_A4494HreBarPar ;
   private byte[] P08LJ6_A4495HreNumCie ;
   private short[] P08LJ6_A4545HreLinMaq ;
   private byte[] P08LJ6_A4550HreLinPro ;
   private String[] P08LJ6_A4559HrePrdDsc ;
   private boolean[] P08LJ6_n4559HrePrdDsc ;
   private java.math.BigDecimal[] P08LJ6_A4562HreFacCon ;
   private boolean[] P08LJ6_n4562HreFacCon ;
   private byte[] P08LJ6_A4566HreForNro ;
   private boolean[] P08LJ6_n4566HreForNro ;
   private String[] P08LJ6_A5726HreLote ;
   private boolean[] P08LJ6_n5726HreLote ;
   private String[] P08LJ6_A719PrdNum ;
   private boolean[] P08LJ6_n719PrdNum ;
   private String[] P08LJ6_A4561HrePrdUDs ;
   private boolean[] P08LJ6_n4561HrePrdUDs ;
   private byte[] P08LJ6_A4560HrePrdUMe ;
   private boolean[] P08LJ6_n4560HrePrdUMe ;
   private java.math.BigDecimal[] P08LJ6_A4563HrePrdCant ;
   private boolean[] P08LJ6_n4563HrePrdCant ;
   private java.math.BigDecimal[] P08LJ6_A4565HreCanAny ;
   private boolean[] P08LJ6_n4565HreCanAny ;
   private String[] P08LJ6_A4558HrePrdNum ;
   private boolean[] P08LJ6_n4558HrePrdNum ;
   private short[] P08LJ6_A4557HreRecLin ;
   private String[] P08LJ7_A396EmprCod ;
   private int[] P08LJ7_A4492HreBarCod ;
   private byte[] P08LJ7_A4493HreBarReo ;
   private String[] P08LJ7_A4494HreBarPar ;
   private byte[] P08LJ7_A4495HreNumCie ;
   private short[] P08LJ7_A4508HreLinMAL ;
   private String[] P08LJ7_A719PrdNum ;
   private boolean[] P08LJ7_n719PrdNum ;
   private byte[] P08LJ7_A4514HreLanyNro ;
   private boolean[] P08LJ7_n4514HreLanyNro ;
   private java.math.BigDecimal[] P08LJ7_A4511HrePrdCFin ;
   private boolean[] P08LJ7_n4511HrePrdCFin ;
   private byte[] P08LJ7_A4509HreNumAny ;
   private String[] P08LJ8_A10887Cod_Idtx ;
   private String[] P08LJ8_A10888Dsc_Idtx ;
   private boolean[] P08LJ8_n10888Dsc_Idtx ;
   private String[] P08LJ8_A396EmprCod ;
}

final  class prctinhistorico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LJ2", "SELECT T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.HreUser, T2.HreDiaHora, T1.HreUsrCod, T1.HreFecAlt, T1.HreUsrMod, T1.HreFecMod, T2.HreCtw, T2.HreBarPie, T2.HreBarMtr, T2.HreBarKgm, T2.HreTotPie, T2.HreTipColN, T2.HreTipCol, T2.HreIntDsc, T1.HreNPrg, T1.HreVolPrd, T2.HreTotMtr, T2.HreTotKgm, T1.HreMaqCod, T2.HreColNumC, T2.HreColNomC, T2.HreColNum, T2.HreColNom, T2.HreBarDsc, T2.HreBarSer, T3.CliNom, T2.CliCod FROM ((TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LJ3", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrPar, HreAgrReo, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08LJ4", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrMtr, HreAgrDsc, HreAgrPie, HreAgrKgm, HreAgrSer, HreAgrPar, HreAgrReo, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LJ5", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProDsc, HreProCod FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LJ6", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HrePrdDsc, HreFacCon, HreForNro, HreLote, PrdNum, HrePrdUDs, HrePrdUMe, HrePrdCant, HreCanAny, HrePrdNum, HreRecLin FROM TXPHISLRE WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ?) AND (HrePrdDsc <> ' ') ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LJ7", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum, HreLanyNro, HrePrdCFin, HreNumAny FROM TXPHISREA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ? and PrdNum = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LJ8", "SELECT Cod_Idtx, Dsc_Idtx, EmprCod FROM TXPINDITE WHERE Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 4);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(22);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(26);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(27, 13);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(28);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(29, 13);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(30, 26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(31, 16);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(32, 30);
               ((int[]) buf[54])[0] = rslt.getInt(33);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(18);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 4);
               return;
      }
   }

}

