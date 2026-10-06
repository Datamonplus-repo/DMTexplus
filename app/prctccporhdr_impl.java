package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class prctccporhdr_impl extends GXWebReport
{
   public prctccporhdr_impl( com.genexus.internet.HttpContext context )
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
            AV20Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
            AV21Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
            AV22Barcodpar = httpContext.GetPar( "Barcodpar") ;
            AV49Reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "Reclinmaq"))) ;
            AV27HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
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
         /* Using cursor P08Y62 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P08Y62_A407EmprNom[0] ;
            n407EmprNom = P08Y62_n407EmprNom[0] ;
            AV17Emprnom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV61Volumen = 0 ;
         AV62totkilos = DecimalUtil.ZERO ;
         if ( AV27HreNumCie > 0 )
         {
            /* Using cursor P08Y63 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV20Barcod), Byte.valueOf(AV21Barcodreo), AV22Barcodpar, Byte.valueOf(AV27HreNumCie), Short.valueOf(AV49Reclinmaq)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4495HreNumCie = P08Y63_A4495HreNumCie[0] ;
               A4545HreLinMaq = P08Y63_A4545HreLinMaq[0] ;
               A4494HreBarPar = P08Y63_A4494HreBarPar[0] ;
               A4493HreBarReo = P08Y63_A4493HreBarReo[0] ;
               A4492HreBarCod = P08Y63_A4492HreBarCod[0] ;
               A4547HreVolPrd = P08Y63_A4547HreVolPrd[0] ;
               n4547HreVolPrd = P08Y63_n4547HreVolPrd[0] ;
               A4968HreTotKgs = P08Y63_A4968HreTotKgs[0] ;
               n4968HreTotKgs = P08Y63_n4968HreTotKgs[0] ;
               AV61Volumen = A4547HreVolPrd ;
               AV62totkilos = A4968HreTotKgs ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
         GxHdr4 = true ;
         /* Using cursor P08Y66 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV20Barcod), Byte.valueOf(AV21Barcodreo), AV22Barcodpar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P08Y66_A130BarCodPar[0] ;
            A132BarCodReo = P08Y66_A132BarCodReo[0] ;
            A129BarCod = P08Y66_A129BarCod[0] ;
            A236BarVolMaq = P08Y66_A236BarVolMaq[0] ;
            A4466BarAcaAnh = P08Y66_A4466BarAcaAnh[0] ;
            A11662BarOrdComp = P08Y66_A11662BarOrdComp[0] ;
            A9777BarItem3 = P08Y66_A9777BarItem3[0] ;
            A4812BarEncCli = P08Y66_A4812BarEncCli[0] ;
            A1234BarNomCli = P08Y66_A1234BarNomCli[0] ;
            A135BarColNom = P08Y66_A135BarColNom[0] ;
            A1652BarSerDsc = P08Y66_A1652BarSerDsc[0] ;
            A212BarSer = P08Y66_A212BarSer[0] ;
            A279CliNom = P08Y66_A279CliNom[0] ;
            A252CliCod = P08Y66_A252CliCod[0] ;
            n252CliCod = P08Y66_n252CliCod[0] ;
            A166BarKgm = P08Y66_A166BarKgm[0] ;
            n166BarKgm = P08Y66_n166BarKgm[0] ;
            A219BarTotAgr = P08Y66_A219BarTotAgr[0] ;
            n219BarTotAgr = P08Y66_n219BarTotAgr[0] ;
            A279CliNom = P08Y66_A279CliNom[0] ;
            A219BarTotAgr = P08Y66_A219BarTotAgr[0] ;
            n219BarTotAgr = P08Y66_n219BarTotAgr[0] ;
            A166BarKgm = P08Y66_A166BarKgm[0] ;
            n166BarKgm = P08Y66_n166BarKgm[0] ;
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            AV62totkilos = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62totkilos)==0) ? A812RecTotKgm : AV62totkilos) ;
            AV61Volumen = ((0==AV61Volumen) ? A236BarVolMaq : AV61Volumen) ;
            AV63Rb = ((AV62totkilos.doubleValue()>0) ? DecimalUtil.doubleToDec(AV61Volumen).divide(AV62totkilos, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV32Hdralfa = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_int3[0] = A4466BarAcaAnh ;
            GXv_char4[0] = AV18Tb1_dscfb ;
            new app.pptable2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
            prctccporhdr_impl.this.A396EmprCod = GXv_char1[0] ;
            prctccporhdr_impl.this.A252CliCod = GXv_int2[0] ;
            prctccporhdr_impl.this.A4466BarAcaAnh = GXv_int3[0] ;
            prctccporhdr_impl.this.AV18Tb1_dscfb = GXv_char4[0] ;
            AV19DisEnt = GXutil.substring( AV18Tb1_dscfb, 1, 30) ;
            AV34HdrAgr = "" ;
            /* Using cursor P08Y67 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A119BarAgrCod = P08Y67_A119BarAgrCod[0] ;
               A124BarAgrReo = P08Y67_A124BarAgrReo[0] ;
               A122BarAgrPar = P08Y67_A122BarAgrPar[0] ;
               GXv_char4[0] = A396EmprCod ;
               GXv_int2[0] = A119BarAgrCod ;
               GXv_int5[0] = A124BarAgrReo ;
               GXv_char1[0] = A122BarAgrPar ;
               GXv_decimal6[0] = AV54BarKgmagr ;
               GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int8[0] = 0 ;
               GXv_char9[0] = AV51BarserAgr ;
               GXv_char10[0] = AV52Barcolnomagr ;
               GXv_int11[0] = 0 ;
               GXv_int12[0] = (byte)(0) ;
               GXv_char13[0] = "" ;
               GXv_date14[0] = AV56fec1 ;
               GXv_int15[0] = (byte)(0) ;
               GXv_char16[0] = "" ;
               GXv_char17[0] = "" ;
               GXv_int18[0] = 0 ;
               GXv_date19[0] = AV57fec2 ;
               GXv_char20[0] = "" ;
               GXv_char21[0] = AV55barserdscAgr ;
               GXv_int22[0] = 0 ;
               GXv_date23[0] = AV58fec3 ;
               GXv_char24[0] = AV53BarNomcliagr ;
               GXv_char25[0] = AV59BarOrdCompagr ;
               GXv_char26[0] = AV60Baritem3agr ;
               new app.pagrinf(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int5, GXv_char1, GXv_decimal6, GXv_decimal7, GXv_int8, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_char13, GXv_date14, GXv_int15, GXv_char16, GXv_char17, GXv_int18, GXv_date19, GXv_char20, GXv_char21, GXv_int22, GXv_date23, GXv_char24, GXv_char25, GXv_char26) ;
               prctccporhdr_impl.this.A396EmprCod = GXv_char4[0] ;
               prctccporhdr_impl.this.A119BarAgrCod = GXv_int2[0] ;
               prctccporhdr_impl.this.A124BarAgrReo = GXv_int5[0] ;
               prctccporhdr_impl.this.A122BarAgrPar = GXv_char1[0] ;
               prctccporhdr_impl.this.AV54BarKgmagr = GXv_decimal6[0] ;
               prctccporhdr_impl.this.AV51BarserAgr = GXv_char9[0] ;
               prctccporhdr_impl.this.AV52Barcolnomagr = GXv_char10[0] ;
               prctccporhdr_impl.this.AV56fec1 = GXv_date14[0] ;
               prctccporhdr_impl.this.AV57fec2 = GXv_date19[0] ;
               prctccporhdr_impl.this.AV55barserdscAgr = GXv_char21[0] ;
               prctccporhdr_impl.this.AV58fec3 = GXv_date23[0] ;
               prctccporhdr_impl.this.AV53BarNomcliagr = GXv_char24[0] ;
               prctccporhdr_impl.this.AV59BarOrdCompagr = GXv_char25[0] ;
               prctccporhdr_impl.this.AV60Baritem3agr = GXv_char26[0] ;
               AV50hdrag = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
               if ( (GXutil.strcmp("", AV34HdrAgr)==0) )
               {
                  AV34HdrAgr = "." ;
                  h8Y60( false, 22) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 20, Gx_line+0, 50, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 100, Gx_line+0, 145, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 222, Gx_line+0, 245, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 321, Gx_line+0, 395, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(15, Gx_line+17, 95, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(100, Gx_line+17, 217, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(222, Gx_line+17, 317, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(321, Gx_line+17, 416, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 671, Gx_line+0, 716, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(671, Gx_line+17, 737, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Enc.", ""), 421, Gx_line+0, 451, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "P.O.", ""), 525, Gx_line+0, 555, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(421, Gx_line+17, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(521, Gx_line+17, 667, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+22) ;
               }
               h8Y60( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50hdrag, "")), 15, Gx_line+0, 96, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51BarserAgr, "")), 100, Gx_line+0, 218, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Barcolnomagr, "")), 222, Gx_line+0, 318, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53BarNomcliagr, "")), 321, Gx_line+0, 417, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54BarKgmagr, "ZZZZZ9.99")), 671, Gx_line+0, 738, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Baritem3agr, "")), 421, Gx_line+0, 516, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59BarOrdCompagr, "")), 521, Gx_line+0, 667, Gx_line+16, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            h8Y60( false, 37) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 365, Gx_line+17, 417, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(365, Gx_line+33, 610, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 666, Gx_line+17, 711, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(620, Gx_line+33, 751, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "THELIST", ""), 22, Gx_line+17, 74, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 80, Gx_line+17, 110, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OKOTEX", ""), 117, Gx_line+17, 162, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ZDHC", ""), 168, Gx_line+17, 198, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+33, 73, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(80, Gx_line+33, 109, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(117, Gx_line+33, 161, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(168, Gx_line+33, 204, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 240, Gx_line+17, 270, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(242, Gx_line+33, 359, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GRS", ""), 207, Gx_line+17, 230, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(207, Gx_line+33, 231, Gx_line+33, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+37) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GxHdr4 = false ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV36Tab_thelist[GX_I-1] = (short)(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV42Tab_productos[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         AV23Lrecet = (byte)(0) ;
         AV39t = (short)(1) ;
         AV44x = (short)(1) ;
         if ( AV27HreNumCie == 0 )
         {
            /* Using cursor P08Y68 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV20Barcod), Byte.valueOf(AV21Barcodreo), AV22Barcodpar, Short.valueOf(AV49Reclinmaq)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A490ForPrdUMe = P08Y68_A490ForPrdUMe[0] ;
               n490ForPrdUMe = P08Y68_n490ForPrdUMe[0] ;
               A719PrdNum = P08Y68_A719PrdNum[0] ;
               n719PrdNum = P08Y68_n719PrdNum[0] ;
               A2804RecLinMaq = P08Y68_A2804RecLinMaq[0] ;
               A130BarCodPar = P08Y68_A130BarCodPar[0] ;
               A132BarCodReo = P08Y68_A132BarCodReo[0] ;
               A129BarCod = P08Y68_A129BarCod[0] ;
               A431FacCon = P08Y68_A431FacCon[0] ;
               A11363PrdGots = P08Y68_A11363PrdGots[0] ;
               A13974PrdGRS = P08Y68_A13974PrdGRS[0] ;
               n13974PrdGRS = P08Y68_n13974PrdGRS[0] ;
               A5725RecLote = P08Y68_A5725RecLote[0] ;
               A13301PrdZDHC = P08Y68_A13301PrdZDHC[0] ;
               A5888PrdOkotex = P08Y68_A5888PrdOkotex[0] ;
               A13302PrdTHELIST = P08Y68_A13302PrdTHELIST[0] ;
               n13302PrdTHELIST = P08Y68_n13302PrdTHELIST[0] ;
               A488ForPrdDsc = P08Y68_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P08Y68_n488ForPrdDsc[0] ;
               A718PrdNom = P08Y68_A718PrdNom[0] ;
               A811RecLin = P08Y68_A811RecLin[0] ;
               A1273RecLinPro = P08Y68_A1273RecLinPro[0] ;
               A11363PrdGots = P08Y68_A11363PrdGots[0] ;
               A13974PrdGRS = P08Y68_A13974PrdGRS[0] ;
               n13974PrdGRS = P08Y68_n13974PrdGRS[0] ;
               A13301PrdZDHC = P08Y68_A13301PrdZDHC[0] ;
               A5888PrdOkotex = P08Y68_A5888PrdOkotex[0] ;
               A13302PrdTHELIST = P08Y68_A13302PrdTHELIST[0] ;
               n13302PrdTHELIST = P08Y68_n13302PrdTHELIST[0] ;
               A718PrdNom = P08Y68_A718PrdNom[0] ;
               A488ForPrdDsc = P08Y68_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P08Y68_n488ForPrdDsc[0] ;
               AV14Factor = GXutil.trim( GXutil.str( A431FacCon, 11, 5)) ;
               AV48Prdgots = ((GXutil.strcmp(A11363PrdGots, httpContext.getMessage( "Z", ""))==0) ? " " : A11363PrdGots) ;
               h8Y60( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 365, Gx_line+0, 410, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 423, Gx_line+0, 614, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Factor, "")), 620, Gx_line+0, 709, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 715, Gx_line+0, 752, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")), 33, Gx_line+2, 63, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Prdgots, "")), 91, Gx_line+2, 99, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5888PrdOkotex, "")), 134, Gx_line+0, 142, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13301PrdZDHC, "@!")), 179, Gx_line+0, 187, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 240, Gx_line+0, 357, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13974PrdGRS, "")), 220, Gx_line+0, 228, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV23Lrecet = (byte)(1) ;
               AV43Prdnum = A719PrdNum ;
               AV35PrdTHELIST = A13302PrdTHELIST ;
               /* Using cursor P08Y69 */
               pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, AV35PrdTHELIST});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A13586TheList = P08Y69_A13586TheList[0] ;
                  A13576SUSAlarma = P08Y69_A13576SUSAlarma[0] ;
                  n13576SUSAlarma = P08Y69_n13576SUSAlarma[0] ;
                  A13574SUSCatID = P08Y69_A13574SUSCatID[0] ;
                  if ( GXutil.strcmp(A13576SUSAlarma, httpContext.getMessage( "S", "")) == 0 )
                  {
                     AV40SUSCatID = A13574SUSCatID ;
                     /* Execute user subroutine: 'ALERTAS' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(4);
                        pr_default.close(4);
                        pr_default.close(4);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         else
         {
            /* Using cursor P08Y610 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV20Barcod), Byte.valueOf(AV21Barcodreo), AV22Barcodpar, Byte.valueOf(AV27HreNumCie), Short.valueOf(AV49Reclinmaq)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A719PrdNum = P08Y610_A719PrdNum[0] ;
               n719PrdNum = P08Y610_n719PrdNum[0] ;
               A4495HreNumCie = P08Y610_A4495HreNumCie[0] ;
               A4545HreLinMaq = P08Y610_A4545HreLinMaq[0] ;
               A4494HreBarPar = P08Y610_A4494HreBarPar[0] ;
               A4493HreBarReo = P08Y610_A4493HreBarReo[0] ;
               A4492HreBarCod = P08Y610_A4492HreBarCod[0] ;
               A4562HreFacCon = P08Y610_A4562HreFacCon[0] ;
               n4562HreFacCon = P08Y610_n4562HreFacCon[0] ;
               A11363PrdGots = P08Y610_A11363PrdGots[0] ;
               A13302PrdTHELIST = P08Y610_A13302PrdTHELIST[0] ;
               n13302PrdTHELIST = P08Y610_n13302PrdTHELIST[0] ;
               A13974PrdGRS = P08Y610_A13974PrdGRS[0] ;
               n13974PrdGRS = P08Y610_n13974PrdGRS[0] ;
               A5726HreLote = P08Y610_A5726HreLote[0] ;
               n5726HreLote = P08Y610_n5726HreLote[0] ;
               A13301PrdZDHC = P08Y610_A13301PrdZDHC[0] ;
               A5888PrdOkotex = P08Y610_A5888PrdOkotex[0] ;
               A4561HrePrdUDs = P08Y610_A4561HrePrdUDs[0] ;
               n4561HrePrdUDs = P08Y610_n4561HrePrdUDs[0] ;
               A4559HrePrdDsc = P08Y610_A4559HrePrdDsc[0] ;
               n4559HrePrdDsc = P08Y610_n4559HrePrdDsc[0] ;
               A4558HrePrdNum = P08Y610_A4558HrePrdNum[0] ;
               n4558HrePrdNum = P08Y610_n4558HrePrdNum[0] ;
               A4557HreRecLin = P08Y610_A4557HreRecLin[0] ;
               A4550HreLinPro = P08Y610_A4550HreLinPro[0] ;
               A11363PrdGots = P08Y610_A11363PrdGots[0] ;
               A13302PrdTHELIST = P08Y610_A13302PrdTHELIST[0] ;
               n13302PrdTHELIST = P08Y610_n13302PrdTHELIST[0] ;
               A13974PrdGRS = P08Y610_A13974PrdGRS[0] ;
               n13974PrdGRS = P08Y610_n13974PrdGRS[0] ;
               A13301PrdZDHC = P08Y610_A13301PrdZDHC[0] ;
               A5888PrdOkotex = P08Y610_A5888PrdOkotex[0] ;
               AV14Factor = GXutil.trim( GXutil.str( A4562HreFacCon, 11, 5)) ;
               AV48Prdgots = ((GXutil.strcmp(A11363PrdGots, httpContext.getMessage( "Z", ""))==0) ? " " : A11363PrdGots) ;
               AV43Prdnum = A719PrdNum ;
               AV35PrdTHELIST = A13302PrdTHELIST ;
               /* Using cursor P08Y611 */
               pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, AV35PrdTHELIST});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A13586TheList = P08Y611_A13586TheList[0] ;
                  A13576SUSAlarma = P08Y611_A13576SUSAlarma[0] ;
                  n13576SUSAlarma = P08Y611_n13576SUSAlarma[0] ;
                  A13574SUSCatID = P08Y611_A13574SUSCatID[0] ;
                  if ( GXutil.strcmp(A13576SUSAlarma, httpContext.getMessage( "S", "")) == 0 )
                  {
                     AV40SUSCatID = A13574SUSCatID ;
                     /* Execute user subroutine: 'ALERTAS' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(7);
                        pr_default.close(6);
                        pr_default.close(6);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               h8Y60( false, 28) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 365, Gx_line+0, 410, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 425, Gx_line+0, 616, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Factor, "")), 623, Gx_line+0, 712, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4561HrePrdUDs, "")), 715, Gx_line+0, 752, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")), 33, Gx_line+2, 63, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Prdgots, "")), 91, Gx_line+2, 99, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5888PrdOkotex, "")), 134, Gx_line+0, 142, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13301PrdZDHC, "@!")), 179, Gx_line+0, 187, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5726HreLote, "")), 240, Gx_line+0, 357, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(H)", ""), 15, Gx_line+4, 32, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13974PrdGRS, "")), 213, Gx_line+0, 221, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
         }
         AV37i = (short)(1) ;
         while ( AV37i <= 100 )
         {
            if ( GXutil.strcmp(AV42Tab_productos[AV37i-1], " ") == 0 )
            {
               if (true) break;
            }
            if ( AV37i == 1 )
            {
               h8Y60( false, 33) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Testar:", ""), 30, Gx_line+11, 82, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+10, 730, Gx_line+10, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
            }
            AV43Prdnum = AV42Tab_productos[AV37i-1] ;
            GXv_char26[0] = A396EmprCod ;
            GXv_char25[0] = AV43Prdnum ;
            GXv_char24[0] = AV45PrdNom ;
            new app.pprddsc(remoteHandle, context).execute( GXv_char26, GXv_char25, GXv_char24) ;
            prctccporhdr_impl.this.A396EmprCod = GXv_char26[0] ;
            prctccporhdr_impl.this.AV43Prdnum = GXv_char25[0] ;
            prctccporhdr_impl.this.AV45PrdNom = GXv_char24[0] ;
            AV41SUSCatDs = " " ;
            h8Y60( false, 19) ;
            getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Prdnum, "")), 81, Gx_line+2, 126, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45PrdNom, "")), 131, Gx_line+1, 322, Gx_line+19, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+19) ;
            /* Using cursor P08Y612 */
            pr_default.execute(8, new Object[] {A396EmprCod, AV43Prdnum});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A719PrdNum = P08Y612_A719PrdNum[0] ;
               n719PrdNum = P08Y612_n719PrdNum[0] ;
               A13575SUSCatDs = P08Y612_A13575SUSCatDs[0] ;
               n13575SUSCatDs = P08Y612_n13575SUSCatDs[0] ;
               A13574SUSCatID = P08Y612_A13574SUSCatID[0] ;
               A13586TheList = P08Y612_A13586TheList[0] ;
               A13575SUSCatDs = P08Y612_A13575SUSCatDs[0] ;
               n13575SUSCatDs = P08Y612_n13575SUSCatDs[0] ;
               AV41SUSCatDs = A13575SUSCatDs ;
               h8Y60( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41SUSCatDs, "")), 81, Gx_line+1, 447, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            AV37i = (short)(AV37i+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h8Y60( true, 0) ;
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
      /* 'ALERTAS' Routine */
      returnInSub = false ;
      AV37i = (short)(1) ;
      AV38alta = (byte)(0) ;
      while ( AV37i <= 100 )
      {
         if ( AV36Tab_thelist[AV37i-1] == 0 )
         {
            AV38alta = (byte)(1) ;
            if (true) break;
         }
         if ( AV36Tab_thelist[AV37i-1] == AV40SUSCatID )
         {
            if (true) break;
         }
         AV37i = (short)(AV37i+1) ;
      }
      if ( AV38alta == 1 )
      {
         AV36Tab_thelist[AV39t-1] = AV40SUSCatID ;
         AV39t = (short)(AV39t+1) ;
      }
      AV37i = (short)(1) ;
      AV38alta = (byte)(0) ;
      while ( AV37i <= 100 )
      {
         if ( GXutil.strcmp(AV42Tab_productos[AV37i-1], "") == 0 )
         {
            AV38alta = (byte)(1) ;
            if (true) break;
         }
         if ( GXutil.strcmp(AV42Tab_productos[AV37i-1], AV43Prdnum) == 0 )
         {
            if (true) break;
         }
         AV37i = (short)(AV37i+1) ;
      }
      if ( AV38alta == 1 )
      {
         AV42Tab_productos[AV44x-1] = AV43Prdnum ;
         AV44x = (short)(AV44x+1) ;
      }
   }

   public void h8Y60( boolean bFoot ,
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
            if ( GxHdr4 )
            {
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Emprnom, "")), 15, Gx_line+17, 235, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 649, Gx_line+17, 708, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 583, Gx_line+17, 642, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora:", ""), 510, Gx_line+17, 577, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 642, Gx_line+50, 709, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 583, Gx_line+50, 628, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina:", ""), 525, Gx_line+50, 577, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 631, Gx_line+50, 639, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+83, 745, Gx_line+83, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Pgmdesc, "")), 15, Gx_line+50, 235, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 22, Gx_line+100, 74, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 101, Gx_line+100, 146, Gx_line+117, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 157, Gx_line+100, 377, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 22, Gx_line+117, 67, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 101, Gx_line+117, 219, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 225, Gx_line+117, 416, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 22, Gx_line+133, 45, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 102, Gx_line+133, 198, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 22, Gx_line+150, 96, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 102, Gx_line+150, 198, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+232, 730, Gx_line+232, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Marca", ""), 22, Gx_line+167, 59, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19DisEnt, "")), 102, Gx_line+167, 395, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Talao", ""), 481, Gx_line+100, 518, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 542, Gx_line+100, 689, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Enc.", ""), 481, Gx_line+117, 511, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9777BarItem3, "")), 542, Gx_line+117, 689, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "P.O.", ""), 481, Gx_line+133, 511, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11662BarOrdComp, "")), 542, Gx_line+133, 688, Gx_line+149, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 51, Gx_line+200, 81, Gx_line+217, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Hdralfa, "")), 88, Gx_line+200, 169, Gx_line+217, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49Reclinmaq), "ZZZ9")), 372, Gx_line+50, 402, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27HreNumCie), "Z9")), 410, Gx_line+50, 426, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 481, Gx_line+150, 526, Gx_line+164, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 542, Gx_line+150, 609, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Volume", ""), 481, Gx_line+167, 526, Gx_line+180, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RB", ""), 481, Gx_line+187, 497, Gx_line+204, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61Volumen), "ZZZZ9")), 542, Gx_line+167, 579, Gx_line+184, 0+256, 0, 0, 1) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63Rb, "ZZ9.99")), 542, Gx_line+187, 587, Gx_line+204, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62totkilos, "ZZZZZZ9.99")), 627, Gx_line+150, 701, Gx_line+168, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+233) ;
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
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
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
      AV22Barcodpar = "" ;
      scmdbuf = "" ;
      P08Y62_A396EmprCod = new String[] {""} ;
      P08Y62_A407EmprNom = new String[] {""} ;
      P08Y62_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV17Emprnom = "" ;
      AV62totkilos = DecimalUtil.ZERO ;
      P08Y63_A396EmprCod = new String[] {""} ;
      P08Y63_A4495HreNumCie = new byte[1] ;
      P08Y63_A4545HreLinMaq = new short[1] ;
      P08Y63_A4494HreBarPar = new String[] {""} ;
      P08Y63_A4493HreBarReo = new byte[1] ;
      P08Y63_A4492HreBarCod = new int[1] ;
      P08Y63_A4547HreVolPrd = new int[1] ;
      P08Y63_n4547HreVolPrd = new boolean[] {false} ;
      P08Y63_A4968HreTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Y63_n4968HreTotKgs = new boolean[] {false} ;
      A4494HreBarPar = "" ;
      A4968HreTotKgs = DecimalUtil.ZERO ;
      P08Y66_A396EmprCod = new String[] {""} ;
      P08Y66_A130BarCodPar = new String[] {""} ;
      P08Y66_A132BarCodReo = new byte[1] ;
      P08Y66_A129BarCod = new int[1] ;
      P08Y66_A236BarVolMaq = new int[1] ;
      P08Y66_A4466BarAcaAnh = new short[1] ;
      P08Y66_A11662BarOrdComp = new String[] {""} ;
      P08Y66_A9777BarItem3 = new String[] {""} ;
      P08Y66_A4812BarEncCli = new String[] {""} ;
      P08Y66_A1234BarNomCli = new String[] {""} ;
      P08Y66_A135BarColNom = new String[] {""} ;
      P08Y66_A1652BarSerDsc = new String[] {""} ;
      P08Y66_A212BarSer = new String[] {""} ;
      P08Y66_A279CliNom = new String[] {""} ;
      P08Y66_A252CliCod = new int[1] ;
      P08Y66_n252CliCod = new boolean[] {false} ;
      P08Y66_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Y66_n166BarKgm = new boolean[] {false} ;
      P08Y66_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Y66_n219BarTotAgr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A11662BarOrdComp = "" ;
      A9777BarItem3 = "" ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A279CliNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV63Rb = DecimalUtil.ZERO ;
      AV32Hdralfa = "" ;
      GXv_int3 = new short[1] ;
      AV18Tb1_dscfb = "" ;
      AV19DisEnt = "" ;
      AV34HdrAgr = "" ;
      P08Y67_A396EmprCod = new String[] {""} ;
      P08Y67_A129BarCod = new int[1] ;
      P08Y67_A132BarCodReo = new byte[1] ;
      P08Y67_A130BarCodPar = new String[] {""} ;
      P08Y67_A119BarAgrCod = new int[1] ;
      P08Y67_A124BarAgrReo = new byte[1] ;
      P08Y67_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char1 = new String[1] ;
      AV54BarKgmagr = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      AV51BarserAgr = "" ;
      GXv_char9 = new String[1] ;
      AV52Barcolnomagr = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char13 = new String[1] ;
      AV56fec1 = GXutil.nullDate() ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_int15 = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int18 = new int[1] ;
      AV57fec2 = GXutil.nullDate() ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_char20 = new String[1] ;
      AV55barserdscAgr = "" ;
      GXv_char21 = new String[1] ;
      GXv_int22 = new int[1] ;
      AV58fec3 = GXutil.nullDate() ;
      GXv_date23 = new java.util.Date[1] ;
      AV53BarNomcliagr = "" ;
      AV59BarOrdCompagr = "" ;
      AV60Baritem3agr = "" ;
      AV50hdrag = "" ;
      AV36Tab_thelist = new short[100] ;
      AV42Tab_productos = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV42Tab_productos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P08Y68_A490ForPrdUMe = new byte[1] ;
      P08Y68_n490ForPrdUMe = new boolean[] {false} ;
      P08Y68_A396EmprCod = new String[] {""} ;
      P08Y68_A719PrdNum = new String[] {""} ;
      P08Y68_n719PrdNum = new boolean[] {false} ;
      P08Y68_A2804RecLinMaq = new short[1] ;
      P08Y68_A130BarCodPar = new String[] {""} ;
      P08Y68_A132BarCodReo = new byte[1] ;
      P08Y68_A129BarCod = new int[1] ;
      P08Y68_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Y68_A11363PrdGots = new String[] {""} ;
      P08Y68_A13974PrdGRS = new String[] {""} ;
      P08Y68_n13974PrdGRS = new boolean[] {false} ;
      P08Y68_A5725RecLote = new String[] {""} ;
      P08Y68_A13301PrdZDHC = new String[] {""} ;
      P08Y68_A5888PrdOkotex = new String[] {""} ;
      P08Y68_A13302PrdTHELIST = new String[] {""} ;
      P08Y68_n13302PrdTHELIST = new boolean[] {false} ;
      P08Y68_A488ForPrdDsc = new String[] {""} ;
      P08Y68_n488ForPrdDsc = new boolean[] {false} ;
      P08Y68_A718PrdNom = new String[] {""} ;
      P08Y68_A811RecLin = new short[1] ;
      P08Y68_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A13974PrdGRS = "" ;
      A5725RecLote = "" ;
      A13301PrdZDHC = "" ;
      A5888PrdOkotex = "" ;
      A13302PrdTHELIST = "" ;
      A488ForPrdDsc = "" ;
      A718PrdNom = "" ;
      AV14Factor = "" ;
      AV48Prdgots = "" ;
      AV43Prdnum = "" ;
      AV35PrdTHELIST = "" ;
      P08Y69_A396EmprCod = new String[] {""} ;
      P08Y69_A719PrdNum = new String[] {""} ;
      P08Y69_n719PrdNum = new boolean[] {false} ;
      P08Y69_A13586TheList = new String[] {""} ;
      P08Y69_A13576SUSAlarma = new String[] {""} ;
      P08Y69_n13576SUSAlarma = new boolean[] {false} ;
      P08Y69_A13574SUSCatID = new short[1] ;
      A13586TheList = "" ;
      A13576SUSAlarma = "" ;
      P08Y610_A396EmprCod = new String[] {""} ;
      P08Y610_A719PrdNum = new String[] {""} ;
      P08Y610_n719PrdNum = new boolean[] {false} ;
      P08Y610_A4495HreNumCie = new byte[1] ;
      P08Y610_A4545HreLinMaq = new short[1] ;
      P08Y610_A4494HreBarPar = new String[] {""} ;
      P08Y610_A4493HreBarReo = new byte[1] ;
      P08Y610_A4492HreBarCod = new int[1] ;
      P08Y610_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Y610_n4562HreFacCon = new boolean[] {false} ;
      P08Y610_A11363PrdGots = new String[] {""} ;
      P08Y610_A13302PrdTHELIST = new String[] {""} ;
      P08Y610_n13302PrdTHELIST = new boolean[] {false} ;
      P08Y610_A13974PrdGRS = new String[] {""} ;
      P08Y610_n13974PrdGRS = new boolean[] {false} ;
      P08Y610_A5726HreLote = new String[] {""} ;
      P08Y610_n5726HreLote = new boolean[] {false} ;
      P08Y610_A13301PrdZDHC = new String[] {""} ;
      P08Y610_A5888PrdOkotex = new String[] {""} ;
      P08Y610_A4561HrePrdUDs = new String[] {""} ;
      P08Y610_n4561HrePrdUDs = new boolean[] {false} ;
      P08Y610_A4559HrePrdDsc = new String[] {""} ;
      P08Y610_n4559HrePrdDsc = new boolean[] {false} ;
      P08Y610_A4558HrePrdNum = new String[] {""} ;
      P08Y610_n4558HrePrdNum = new boolean[] {false} ;
      P08Y610_A4557HreRecLin = new short[1] ;
      P08Y610_A4550HreLinPro = new byte[1] ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A5726HreLote = "" ;
      A4561HrePrdUDs = "" ;
      A4559HrePrdDsc = "" ;
      A4558HrePrdNum = "" ;
      P08Y611_A396EmprCod = new String[] {""} ;
      P08Y611_A719PrdNum = new String[] {""} ;
      P08Y611_n719PrdNum = new boolean[] {false} ;
      P08Y611_A13586TheList = new String[] {""} ;
      P08Y611_A13576SUSAlarma = new String[] {""} ;
      P08Y611_n13576SUSAlarma = new boolean[] {false} ;
      P08Y611_A13574SUSCatID = new short[1] ;
      GXv_char26 = new String[1] ;
      GXv_char25 = new String[1] ;
      AV45PrdNom = "" ;
      GXv_char24 = new String[1] ;
      AV41SUSCatDs = "" ;
      P08Y612_A396EmprCod = new String[] {""} ;
      P08Y612_A719PrdNum = new String[] {""} ;
      P08Y612_n719PrdNum = new boolean[] {false} ;
      P08Y612_A13575SUSCatDs = new String[] {""} ;
      P08Y612_n13575SUSCatDs = new boolean[] {false} ;
      P08Y612_A13574SUSCatID = new short[1] ;
      P08Y612_A13586TheList = new String[] {""} ;
      A13575SUSCatDs = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV72Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prctccporhdr__default(),
         new Object[] {
             new Object[] {
            P08Y62_A396EmprCod, P08Y62_A407EmprNom, P08Y62_n407EmprNom
            }
            , new Object[] {
            P08Y63_A396EmprCod, P08Y63_A4495HreNumCie, P08Y63_A4545HreLinMaq, P08Y63_A4494HreBarPar, P08Y63_A4493HreBarReo, P08Y63_A4492HreBarCod, P08Y63_A4547HreVolPrd, P08Y63_n4547HreVolPrd, P08Y63_A4968HreTotKgs, P08Y63_n4968HreTotKgs
            }
            , new Object[] {
            P08Y66_A396EmprCod, P08Y66_A130BarCodPar, P08Y66_A132BarCodReo, P08Y66_A129BarCod, P08Y66_A236BarVolMaq, P08Y66_A4466BarAcaAnh, P08Y66_A11662BarOrdComp, P08Y66_A9777BarItem3, P08Y66_A4812BarEncCli, P08Y66_A1234BarNomCli,
            P08Y66_A135BarColNom, P08Y66_A1652BarSerDsc, P08Y66_A212BarSer, P08Y66_A279CliNom, P08Y66_A252CliCod, P08Y66_n252CliCod, P08Y66_A166BarKgm, P08Y66_n166BarKgm, P08Y66_A219BarTotAgr, P08Y66_n219BarTotAgr
            }
            , new Object[] {
            P08Y67_A396EmprCod, P08Y67_A129BarCod, P08Y67_A132BarCodReo, P08Y67_A130BarCodPar, P08Y67_A119BarAgrCod, P08Y67_A124BarAgrReo, P08Y67_A122BarAgrPar
            }
            , new Object[] {
            P08Y68_A490ForPrdUMe, P08Y68_n490ForPrdUMe, P08Y68_A396EmprCod, P08Y68_A719PrdNum, P08Y68_n719PrdNum, P08Y68_A2804RecLinMaq, P08Y68_A130BarCodPar, P08Y68_A132BarCodReo, P08Y68_A129BarCod, P08Y68_A431FacCon,
            P08Y68_A11363PrdGots, P08Y68_A13974PrdGRS, P08Y68_n13974PrdGRS, P08Y68_A5725RecLote, P08Y68_A13301PrdZDHC, P08Y68_A5888PrdOkotex, P08Y68_A13302PrdTHELIST, P08Y68_n13302PrdTHELIST, P08Y68_A488ForPrdDsc, P08Y68_n488ForPrdDsc,
            P08Y68_A718PrdNom, P08Y68_A811RecLin, P08Y68_A1273RecLinPro
            }
            , new Object[] {
            P08Y69_A396EmprCod, P08Y69_A719PrdNum, P08Y69_A13586TheList, P08Y69_A13576SUSAlarma, P08Y69_n13576SUSAlarma, P08Y69_A13574SUSCatID
            }
            , new Object[] {
            P08Y610_A396EmprCod, P08Y610_A719PrdNum, P08Y610_n719PrdNum, P08Y610_A4495HreNumCie, P08Y610_A4545HreLinMaq, P08Y610_A4494HreBarPar, P08Y610_A4493HreBarReo, P08Y610_A4492HreBarCod, P08Y610_A4562HreFacCon, P08Y610_n4562HreFacCon,
            P08Y610_A11363PrdGots, P08Y610_A13302PrdTHELIST, P08Y610_n13302PrdTHELIST, P08Y610_A13974PrdGRS, P08Y610_n13974PrdGRS, P08Y610_A5726HreLote, P08Y610_n5726HreLote, P08Y610_A13301PrdZDHC, P08Y610_A5888PrdOkotex, P08Y610_A4561HrePrdUDs,
            P08Y610_n4561HrePrdUDs, P08Y610_A4559HrePrdDsc, P08Y610_n4559HrePrdDsc, P08Y610_A4558HrePrdNum, P08Y610_n4558HrePrdNum, P08Y610_A4557HreRecLin, P08Y610_A4550HreLinPro
            }
            , new Object[] {
            P08Y611_A396EmprCod, P08Y611_A719PrdNum, P08Y611_A13586TheList, P08Y611_A13576SUSAlarma, P08Y611_n13576SUSAlarma, P08Y611_A13574SUSCatID
            }
            , new Object[] {
            P08Y612_A396EmprCod, P08Y612_A719PrdNum, P08Y612_A13575SUSCatDs, P08Y612_n13575SUSCatDs, P08Y612_A13574SUSCatID, P08Y612_A13586TheList
            }
         }
      );
      AV72Pgmdesc = httpContext.getMessage( "Informe Receita", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV72Pgmdesc = httpContext.getMessage( "Informe Receita", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV21Barcodreo ;
   private byte AV27HreNumCie ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int5[] ;
   private byte GXv_int12[] ;
   private byte GXv_int15[] ;
   private byte AV23Lrecet ;
   private byte A490ForPrdUMe ;
   private byte A1273RecLinPro ;
   private byte A4550HreLinPro ;
   private byte AV38alta ;
   private short gxcookieaux ;
   private short AV49Reclinmaq ;
   private short A4545HreLinMaq ;
   private short A4466BarAcaAnh ;
   private short GXv_int3[] ;
   private short AV36Tab_thelist[] ;
   private short AV39t ;
   private short AV44x ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A13574SUSCatID ;
   private short AV40SUSCatID ;
   private short A4557HreRecLin ;
   private short AV37i ;
   private short Gx_err ;
   private int AV20Barcod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV61Volumen ;
   private int A4492HreBarCod ;
   private int A4547HreVolPrd ;
   private int A129BarCod ;
   private int A236BarVolMaq ;
   private int A252CliCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXv_int18[] ;
   private int GXv_int22[] ;
   private int Gx_OldLine ;
   private int GX_I ;
   private java.math.BigDecimal AV62totkilos ;
   private java.math.BigDecimal A4968HreTotKgs ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV63Rb ;
   private java.math.BigDecimal AV54BarKgmagr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A4562HreFacCon ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV22Barcodpar ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV17Emprnom ;
   private String A4494HreBarPar ;
   private String A130BarCodPar ;
   private String A9777BarItem3 ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A279CliNom ;
   private String AV32Hdralfa ;
   private String AV18Tb1_dscfb ;
   private String AV19DisEnt ;
   private String AV34HdrAgr ;
   private String A122BarAgrPar ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String AV51BarserAgr ;
   private String GXv_char9[] ;
   private String AV52Barcolnomagr ;
   private String GXv_char10[] ;
   private String GXv_char13[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String GXv_char20[] ;
   private String AV55barserdscAgr ;
   private String GXv_char21[] ;
   private String AV53BarNomcliagr ;
   private String AV60Baritem3agr ;
   private String AV50hdrag ;
   private String AV42Tab_productos[] ;
   private String A719PrdNum ;
   private String A11363PrdGots ;
   private String A13974PrdGRS ;
   private String A5725RecLote ;
   private String A13301PrdZDHC ;
   private String A5888PrdOkotex ;
   private String A13302PrdTHELIST ;
   private String A488ForPrdDsc ;
   private String A718PrdNom ;
   private String AV14Factor ;
   private String AV48Prdgots ;
   private String AV43Prdnum ;
   private String AV35PrdTHELIST ;
   private String A13586TheList ;
   private String A13576SUSAlarma ;
   private String A5726HreLote ;
   private String A4561HrePrdUDs ;
   private String A4559HrePrdDsc ;
   private String A4558HrePrdNum ;
   private String GXv_char26[] ;
   private String GXv_char25[] ;
   private String AV45PrdNom ;
   private String GXv_char24[] ;
   private String AV41SUSCatDs ;
   private String A13575SUSCatDs ;
   private String Gx_time ;
   private String AV72Pgmdesc ;
   private java.util.Date AV56fec1 ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date AV57fec2 ;
   private java.util.Date GXv_date19[] ;
   private java.util.Date AV58fec3 ;
   private java.util.Date GXv_date23[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n4547HreVolPrd ;
   private boolean n4968HreTotKgs ;
   private boolean GxHdr4 ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private boolean n490ForPrdUMe ;
   private boolean n719PrdNum ;
   private boolean n13974PrdGRS ;
   private boolean n13302PrdTHELIST ;
   private boolean n488ForPrdDsc ;
   private boolean n13576SUSAlarma ;
   private boolean returnInSub ;
   private boolean n4562HreFacCon ;
   private boolean n5726HreLote ;
   private boolean n4561HrePrdUDs ;
   private boolean n4559HrePrdDsc ;
   private boolean n4558HrePrdNum ;
   private boolean n13575SUSCatDs ;
   private String A11662BarOrdComp ;
   private String AV59BarOrdCompagr ;
   private IDataStoreProvider pr_default ;
   private String[] P08Y62_A396EmprCod ;
   private String[] P08Y62_A407EmprNom ;
   private boolean[] P08Y62_n407EmprNom ;
   private String[] P08Y63_A396EmprCod ;
   private byte[] P08Y63_A4495HreNumCie ;
   private short[] P08Y63_A4545HreLinMaq ;
   private String[] P08Y63_A4494HreBarPar ;
   private byte[] P08Y63_A4493HreBarReo ;
   private int[] P08Y63_A4492HreBarCod ;
   private int[] P08Y63_A4547HreVolPrd ;
   private boolean[] P08Y63_n4547HreVolPrd ;
   private java.math.BigDecimal[] P08Y63_A4968HreTotKgs ;
   private boolean[] P08Y63_n4968HreTotKgs ;
   private String[] P08Y66_A396EmprCod ;
   private String[] P08Y66_A130BarCodPar ;
   private byte[] P08Y66_A132BarCodReo ;
   private int[] P08Y66_A129BarCod ;
   private int[] P08Y66_A236BarVolMaq ;
   private short[] P08Y66_A4466BarAcaAnh ;
   private String[] P08Y66_A11662BarOrdComp ;
   private String[] P08Y66_A9777BarItem3 ;
   private String[] P08Y66_A4812BarEncCli ;
   private String[] P08Y66_A1234BarNomCli ;
   private String[] P08Y66_A135BarColNom ;
   private String[] P08Y66_A1652BarSerDsc ;
   private String[] P08Y66_A212BarSer ;
   private String[] P08Y66_A279CliNom ;
   private int[] P08Y66_A252CliCod ;
   private boolean[] P08Y66_n252CliCod ;
   private java.math.BigDecimal[] P08Y66_A166BarKgm ;
   private boolean[] P08Y66_n166BarKgm ;
   private java.math.BigDecimal[] P08Y66_A219BarTotAgr ;
   private boolean[] P08Y66_n219BarTotAgr ;
   private String[] P08Y67_A396EmprCod ;
   private int[] P08Y67_A129BarCod ;
   private byte[] P08Y67_A132BarCodReo ;
   private String[] P08Y67_A130BarCodPar ;
   private int[] P08Y67_A119BarAgrCod ;
   private byte[] P08Y67_A124BarAgrReo ;
   private String[] P08Y67_A122BarAgrPar ;
   private byte[] P08Y68_A490ForPrdUMe ;
   private boolean[] P08Y68_n490ForPrdUMe ;
   private String[] P08Y68_A396EmprCod ;
   private String[] P08Y68_A719PrdNum ;
   private boolean[] P08Y68_n719PrdNum ;
   private short[] P08Y68_A2804RecLinMaq ;
   private String[] P08Y68_A130BarCodPar ;
   private byte[] P08Y68_A132BarCodReo ;
   private int[] P08Y68_A129BarCod ;
   private java.math.BigDecimal[] P08Y68_A431FacCon ;
   private String[] P08Y68_A11363PrdGots ;
   private String[] P08Y68_A13974PrdGRS ;
   private boolean[] P08Y68_n13974PrdGRS ;
   private String[] P08Y68_A5725RecLote ;
   private String[] P08Y68_A13301PrdZDHC ;
   private String[] P08Y68_A5888PrdOkotex ;
   private String[] P08Y68_A13302PrdTHELIST ;
   private boolean[] P08Y68_n13302PrdTHELIST ;
   private String[] P08Y68_A488ForPrdDsc ;
   private boolean[] P08Y68_n488ForPrdDsc ;
   private String[] P08Y68_A718PrdNom ;
   private short[] P08Y68_A811RecLin ;
   private byte[] P08Y68_A1273RecLinPro ;
   private String[] P08Y69_A396EmprCod ;
   private String[] P08Y69_A719PrdNum ;
   private boolean[] P08Y69_n719PrdNum ;
   private String[] P08Y69_A13586TheList ;
   private String[] P08Y69_A13576SUSAlarma ;
   private boolean[] P08Y69_n13576SUSAlarma ;
   private short[] P08Y69_A13574SUSCatID ;
   private String[] P08Y610_A396EmprCod ;
   private String[] P08Y610_A719PrdNum ;
   private boolean[] P08Y610_n719PrdNum ;
   private byte[] P08Y610_A4495HreNumCie ;
   private short[] P08Y610_A4545HreLinMaq ;
   private String[] P08Y610_A4494HreBarPar ;
   private byte[] P08Y610_A4493HreBarReo ;
   private int[] P08Y610_A4492HreBarCod ;
   private java.math.BigDecimal[] P08Y610_A4562HreFacCon ;
   private boolean[] P08Y610_n4562HreFacCon ;
   private String[] P08Y610_A11363PrdGots ;
   private String[] P08Y610_A13302PrdTHELIST ;
   private boolean[] P08Y610_n13302PrdTHELIST ;
   private String[] P08Y610_A13974PrdGRS ;
   private boolean[] P08Y610_n13974PrdGRS ;
   private String[] P08Y610_A5726HreLote ;
   private boolean[] P08Y610_n5726HreLote ;
   private String[] P08Y610_A13301PrdZDHC ;
   private String[] P08Y610_A5888PrdOkotex ;
   private String[] P08Y610_A4561HrePrdUDs ;
   private boolean[] P08Y610_n4561HrePrdUDs ;
   private String[] P08Y610_A4559HrePrdDsc ;
   private boolean[] P08Y610_n4559HrePrdDsc ;
   private String[] P08Y610_A4558HrePrdNum ;
   private boolean[] P08Y610_n4558HrePrdNum ;
   private short[] P08Y610_A4557HreRecLin ;
   private byte[] P08Y610_A4550HreLinPro ;
   private String[] P08Y611_A396EmprCod ;
   private String[] P08Y611_A719PrdNum ;
   private boolean[] P08Y611_n719PrdNum ;
   private String[] P08Y611_A13586TheList ;
   private String[] P08Y611_A13576SUSAlarma ;
   private boolean[] P08Y611_n13576SUSAlarma ;
   private short[] P08Y611_A13574SUSCatID ;
   private String[] P08Y612_A396EmprCod ;
   private String[] P08Y612_A719PrdNum ;
   private boolean[] P08Y612_n719PrdNum ;
   private String[] P08Y612_A13575SUSCatDs ;
   private boolean[] P08Y612_n13575SUSCatDs ;
   private short[] P08Y612_A13574SUSCatID ;
   private String[] P08Y612_A13586TheList ;
}

final  class prctccporhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Y62", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08Y63", "SELECT EmprCod, HreNumCie, HreLinMaq, HreBarPar, HreBarReo, HreBarCod, HreVolPrd, HreTotKgs FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08Y66", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarVolMaq, T1.BarAcaAnh, T1.BarOrdComp, T1.BarItem3, T1.BarEncCli, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr FROM (((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08Y67", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Y68", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.PrdNum, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.FacCon, T2.PrdGots, T2.PrdGRS, T1.RecLote, T2.PrdZDHC, T2.PrdOkotex, T2.PrdTHELIST, T3.ForPrdDsc, T2.PrdNom, T1.RecLin, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (T1.PrdNum >= '000000' and T1.PrdNum <= '999999') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Y69", "SELECT EmprCod, PrdNum, TheList, SUSAlarma, SUSCatID FROM TXPCATSU1 WHERE EmprCod = ? and PrdNum = ? and TheList = ? ORDER BY EmprCod, PrdNum, TheList ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Y610", "SELECT T1.EmprCod, T1.PrdNum, T1.HreNumCie, T1.HreLinMaq, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreFacCon, T2.PrdGots, T2.PrdTHELIST, T2.PrdGRS, T1.HreLote, T2.PrdZDHC, T2.PrdOkotex, T1.HrePrdUDs, T1.HrePrdDsc, T1.HrePrdNum, T1.HreRecLin, T1.HreLinPro FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ?) AND (T1.PrdNum >= '000000' and T1.PrdNum <= '999999') ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HreLinPro, T1.HreRecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Y611", "SELECT EmprCod, PrdNum, TheList, SUSAlarma, SUSCatID FROM TXPCATSU1 WHERE EmprCod = ? and PrdNum = ? and TheList = ? ORDER BY EmprCod, PrdNum, TheList ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Y612", "SELECT T1.EmprCod, T1.PrdNum, T2.SUSCatDs, T1.SUSCatID, T1.TheList FROM (TXPCATSU1 T1 INNER JOIN TXPSUSTAN T2 ON T2.EmprCod = T1.EmprCod AND T2.SUSCatID = T1.SUSCatID) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.SUSCatID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((String[]) buf[16])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(16, 26);
               ((short[]) buf[21])[0] = rslt.getShort(17);
               ((byte[]) buf[22])[0] = rslt.getByte(18);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 1);
               ((String[]) buf[18])[0] = rslt.getString(14, 1);
               ((String[]) buf[19])[0] = rslt.getString(15, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(18);
               ((byte[]) buf[26])[0] = rslt.getByte(19);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 4);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 4);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

