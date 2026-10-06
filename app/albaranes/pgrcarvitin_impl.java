package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pgrcarvitin_impl extends GXWebReport
{
   public pgrcarvitin_impl( com.genexus.internet.HttpContext context )
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            AV8ImpCod = httpContext.GetPar( "ImpCod") ;
            AV9TextoCopia = httpContext.GetPar( "TextoCopia") ;
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
      M_bot = 15 ;
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
         P_lines = (int)(gxYPage-(lineHeight*15)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV32ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRTINA", ""), GXv_char1) ;
         pgrcarvitin_impl.this.AV32ContDsc = GXv_char1[0] ;
         GXt_char2 = AV35FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pgrcarvitin_impl.this.A396EmprCod = GXv_char1[0] ;
         pgrcarvitin_impl.this.GXt_char2 = GXv_char4[0] ;
         AV35FirmaD = GXt_char2 ;
         GXt_int5 = AV33existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pgrcarvitin_impl.this.GXt_int5 = GXv_int6[0] ;
         AV33existefirmad = GXt_int5 ;
         /* Using cursor P05MW2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A588IvaPor = P05MW2_A588IvaPor[0] ;
            n588IvaPor = P05MW2_n588IvaPor[0] ;
            A953IvaCod = P05MW2_A953IvaCod[0] ;
            AV25IvaPor = A588IvaPor ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P05MW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1253EmprGuiRem = P05MW3_A1253EmprGuiRem[0] ;
            A10017AlbFmd = P05MW3_A10017AlbFmd[0] ;
            n10017AlbFmd = P05MW3_n10017AlbFmd[0] ;
            A7101AlbLic = P05MW3_A7101AlbLic[0] ;
            A3865AlbHorSal = P05MW3_A3865AlbHorSal[0] ;
            A4023AlbFecSal = P05MW3_A4023AlbFecSal[0] ;
            A3868AlbMat = P05MW3_A3868AlbMat[0] ;
            A1243GuiRemCli = P05MW3_A1243GuiRemCli[0] ;
            A39AlbProPri = P05MW3_A39AlbProPri[0] ;
            A33AlbProEst = P05MW3_A33AlbProEst[0] ;
            A1782AlbProEso = P05MW3_A1782AlbProEso[0] ;
            A34AlbProfch = P05MW3_A34AlbProfch[0] ;
            /* Using cursor P05MW4 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A407EmprNom = P05MW4_A407EmprNom[0] ;
            n407EmprNom = P05MW4_n407EmprNom[0] ;
            /* Using cursor P05MW5 */
            pr_default.execute(3, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
            A781PrvCod = P05MW5_A781PrvCod[0] ;
            n781PrvCod = P05MW5_n781PrvCod[0] ;
            A295CliPob = P05MW5_A295CliPob[0] ;
            n295CliPob = P05MW5_n295CliPob[0] ;
            A260CliDom = P05MW5_A260CliDom[0] ;
            n260CliDom = P05MW5_n260CliDom[0] ;
            A278CliNif = P05MW5_A278CliNif[0] ;
            n278CliNif = P05MW5_n278CliNif[0] ;
            /* Using cursor P05MW6 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
            A787PrvDsc = P05MW6_A787PrvDsc[0] ;
            n787PrvDsc = P05MW6_n787PrvDsc[0] ;
            AV17Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV34Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV17Texto_fd = AV34Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV35FirmaD) ;
            }
            else
            {
               AV17Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            if ( GXutil.strcmp(A7101AlbLic, " ") > 0 )
            {
               AV16AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            AV52AlbHorSal = A3865AlbHorSal ;
            AV55ALbFecsal = A4023AlbFecSal ;
            AV53AlbMat = A3868AlbMat ;
            AV38CliCod = A1243GuiRemCli ;
            /* Execute user subroutine: 'CLIENTE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(3);
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
            AV61Descarga = ((GXutil.strcmp("", AV41CliEDom)==0) ? httpContext.getMessage( "DESTINATARIO", "") : AV41CliEDom) ;
            AV62Descarga2 = ((GXutil.strcmp("", AV41CliEDom)==0) ? "" : GXutil.trim( AV13Cpostal)+" "+GXutil.trim( AV44CliEPob)) ;
            AV34Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
            AV60TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV63EmprCif) + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( AV18CliNif) + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV60TextoGenerar += ((GXutil.strcmp(A39AlbProPri, "1")==0) ? httpContext.getMessage( "D:", "")+httpContext.getMessage( "GR", "")+"*" : httpContext.getMessage( "D:", "")+httpContext.getMessage( "GT", "")+"*") ;
            AV60TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV64anyo = (short)(GXutil.year( A34AlbProfch)) ;
            AV65mes = (byte)(GXutil.month( A34AlbProfch)) ;
            AV66dia = (byte)(GXutil.day( A34AlbProfch)) ;
            AV60TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV64anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV65mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV66dia, 2, 0)), (short)(2), "0") + "*" ;
            AV60TextoGenerar += ((GXutil.strcmp(A39AlbProPri, "1")==0) ? httpContext.getMessage( "G:", "")+httpContext.getMessage( "GR 1/", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+"*" : httpContext.getMessage( "G:", "")+httpContext.getMessage( "GT 2/", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+"*") ;
            AV60TextoGenerar += httpContext.getMessage( "H:", "") + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "Q:", "") + AV34Firma4dig + "*" ;
            AV60TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV35FirmaD) + "*" ;
            GXt_char2 = AV68Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV60TextoGenerar, (short)(200), (short)(200), GXv_char4) ;
            pgrcarvitin_impl.this.GXt_char2 = GXv_char4[0] ;
            AV68Url = GXt_char2 ;
            AV58QrCode = AV68Url ;
            AV73Qrcode_GXI = GXDbFile.pathToUrl( AV68Url, context.getHttpContext()) ;
            AV48EmprNom = A407EmprNom ;
            AV28VDoc = ((GXutil.strcmp(A39AlbProPri, "0")==0) ? httpContext.getMessage( "Guia de Transito", "") : httpContext.getMessage( "Guia de Remessa", "")) ;
            AV37vCopia = ((AV47Copias==1) ? httpContext.getMessage( "DUPLICADO", "") : "") ;
            AV36i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV29vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05MW7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A916AlbPObs = P05MW7_A916AlbPObs[0] ;
               A915AlbPObsLin = P05MW7_A915AlbPObsLin[0] ;
               if ( AV36i > 2 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV29vObs[AV36i-1] = A916AlbPObs ;
               AV36i = (byte)(AV36i+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV49Num_lineas = (short)(0) ;
            AV51valorIva = DecimalUtil.doubleToDec(0) ;
            AV50FacImp = DecimalUtil.doubleToDec(0) ;
            AV54FacTot = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P05MW8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A130BarCodPar = P05MW8_A130BarCodPar[0] ;
               A132BarCodReo = P05MW8_A132BarCodReo[0] ;
               A129BarCod = P05MW8_A129BarCod[0] ;
               A1261BarAlbKgmE = P05MW8_A1261BarAlbKgmE[0] ;
               A1263BarAlbMtrE = P05MW8_A1263BarAlbMtrE[0] ;
               A1265BarAlbPie = P05MW8_A1265BarAlbPie[0] ;
               A1262BarPreKgm = P05MW8_A1262BarPreKgm[0] ;
               A1234BarNomCli = P05MW8_A1234BarNomCli[0] ;
               A1652BarSerDsc = P05MW8_A1652BarSerDsc[0] ;
               A4815AlbEncCli = P05MW8_A4815AlbEncCli[0] ;
               A1234BarNomCli = P05MW8_A1234BarNomCli[0] ;
               A1652BarSerDsc = P05MW8_A1652BarSerDsc[0] ;
               AV31Bardisnum = GXutil.trim( A4815AlbEncCli) ;
               AV20Kgs = A1261BarAlbKgmE ;
               AV24Mts = A1263BarAlbMtrE ;
               AV23Pzas = (short)(A1265BarAlbPie) ;
               AV21Pkg = A1262BarPreKgm ;
               AV22Valor = GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 2) ;
               AV50FacImp = AV50FacImp.add(AV22Valor) ;
               AV49Num_lineas = (short)(AV49Num_lineas+1) ;
               if ( ( AV49Num_lineas + 2 ) >= 31 )
               {
                  h5MW0( false, 23) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças Totais:", ""), 54, Gx_line+4, 132, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26Totpzs), "ZZZZZ9")), 134, Gx_line+4, 179, Gx_line+21, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs Totais:", ""), 433, Gx_line+4, 498, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Totkgs, "ZZZZZ9.99")), 523, Gx_line+4, 590, Gx_line+21, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+23) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV49Num_lineas = (short)(1) ;
                  AV27Totkgs = DecimalUtil.doubleToDec(0) ;
                  AV26Totpzs = 0 ;
               }
               AV27Totkgs = AV27Totkgs.add(AV20Kgs) ;
               AV26Totpzs = (int)(AV26Totpzs+AV23Pzas) ;
               h5MW0( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 13, Gx_line+0, 72, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Bardisnum, "")), 81, Gx_line+0, 140, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 244, Gx_line+0, 435, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20Kgs, "ZZZ9.99")), 539, Gx_line+0, 591, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Pkg, "Z9.99")), 634, Gx_line+0, 671, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22Valor, "ZZZ9.99")), 706, Gx_line+0, 758, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23Pzas), "ZZZ9")), 149, Gx_line+0, 179, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24Mts, "ZZZ9.99")), 185, Gx_line+0, 237, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25IvaPor), "Z9")), 683, Gx_line+0, 699, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "kg", ""), 597, Gx_line+1, 613, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 440, Gx_line+0, 536, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               /* Using cursor P05MW9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A457FasCod = P05MW9_A457FasCod[0] ;
                  A460FasDsc = P05MW9_A460FasDsc[0] ;
                  A1275FasKgm = P05MW9_A1275FasKgm[0] ;
                  A1276FasMtr = P05MW9_A1276FasMtr[0] ;
                  A1241GuiFasPKg = P05MW9_A1241GuiFasPKg[0] ;
                  A1242GuiFasPMt = P05MW9_A1242GuiFasPMt[0] ;
                  A1240GuiFasLin = P05MW9_A1240GuiFasLin[0] ;
                  A460FasDsc = P05MW9_A460FasDsc[0] ;
                  AV19fasDsc = A460FasDsc ;
                  AV20Kgs = A1275FasKgm ;
                  AV24Mts = A1276FasMtr ;
                  AV21Pkg = A1241GuiFasPKg ;
                  AV56Pmt = A1242GuiFasPMt ;
                  AV22Valor = GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)) ;
                  AV50FacImp = AV50FacImp.add(AV22Valor) ;
                  AV49Num_lineas = (short)(AV49Num_lineas+1) ;
                  if ( ( AV49Num_lineas + 2 ) >= 31 )
                  {
                     h5MW0( false, 23) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Peças Totais:", ""), 54, Gx_line+4, 132, Gx_line+20, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26Totpzs), "ZZZZZ9")), 134, Gx_line+4, 179, Gx_line+21, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Kgs Totais:", ""), 433, Gx_line+4, 498, Gx_line+20, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Totkgs, "ZZZZZ9.99")), 523, Gx_line+4, 590, Gx_line+21, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+23) ;
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                     AV49Num_lineas = (short)(1) ;
                     AV27Totkgs = DecimalUtil.doubleToDec(0) ;
                     AV26Totpzs = 0 ;
                  }
                  if ( A1242GuiFasPMt.doubleValue() > 0 )
                  {
                     h5MW0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19fasDsc, "")), 244, Gx_line+0, 449, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24Mts, "ZZZ9.99")), 539, Gx_line+0, 591, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "mt", ""), 597, Gx_line+0, 613, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56Pmt, "Z9.99")), 634, Gx_line+0, 671, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25IvaPor), "Z9")), 682, Gx_line+0, 698, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22Valor, "ZZZ9.99")), 705, Gx_line+0, 757, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     h5MW0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19fasDsc, "")), 244, Gx_line+0, 449, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20Kgs, "ZZZ9.99")), 539, Gx_line+0, 591, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Pkg, "Z9.99")), 634, Gx_line+0, 671, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25IvaPor), "Z9")), 682, Gx_line+0, 698, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22Valor, "ZZZ9.99")), 705, Gx_line+0, 757, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "kg", ""), 597, Gx_line+0, 613, Gx_line+16, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               pr_default.readNext(6);
            }
            pr_default.close(6);
            h5MW0( false, 23) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças Totais:", ""), 54, Gx_line+4, 132, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26Totpzs), "ZZZZZ9")), 134, Gx_line+4, 179, Gx_line+21, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs Totais:", ""), 433, Gx_line+4, 498, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Totkgs, "ZZZZZ9.99")), 523, Gx_line+4, 590, Gx_line+21, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
            AV51valorIva = GXutil.roundDecimal( (AV50FacImp.multiply(DecimalUtil.doubleToDec(AV25IvaPor))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
            AV54FacTot = AV50FacImp.add(AV51valorIva) ;
            if ( ( AV33existefirmad == 1 ) && (GXutil.strcmp("", A10017AlbFmd)==0) )
            {
               h5MW0( false, 30) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 183, Gx_line+4, 602, Gx_line+27, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+30) ;
            }
            A33AlbProEst = (byte)(((A33AlbProEst==0) ? 1 : A33AlbProEst)) ;
            A1782AlbProEso = (byte)(((A33AlbProEst==0) ? 1 : A1782AlbProEso)) ;
            /* Using cursor P05MW10 */
            pr_default.execute(8, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(4);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5MW0( true, 0) ;
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
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV11CliNom = "" ;
      AV12CliDom = "" ;
      AV39Clicp = "" ;
      AV46CliPob = "" ;
      AV18CliNif = "" ;
      AV42CliENom = "" ;
      AV41CliEDom = "" ;
      AV40CliEcp = "" ;
      AV44CliEPob = "" ;
      AV13Cpostal = "" ;
      /* Using cursor P05MW11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV38CliCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A252CliCod = P05MW11_A252CliCod[0] ;
         A279CliNom = P05MW11_A279CliNom[0] ;
         A3644CliNom1 = P05MW11_A3644CliNom1[0] ;
         A260CliDom = P05MW11_A260CliDom[0] ;
         n260CliDom = P05MW11_n260CliDom[0] ;
         A4828CliCp2 = P05MW11_A4828CliCp2[0] ;
         A256CliCp = P05MW11_A256CliCp[0] ;
         A295CliPob = P05MW11_A295CliPob[0] ;
         n295CliPob = P05MW11_n295CliPob[0] ;
         A278CliNif = P05MW11_A278CliNif[0] ;
         n278CliNif = P05MW11_n278CliNif[0] ;
         AV11CliNom = A279CliNom ;
         AV45CliNom1 = A3644CliNom1 ;
         AV30CliNom3 = GXutil.trim( A279CliNom) + " " + GXutil.trim( AV45CliNom1) ;
         AV12CliDom = A260CliDom ;
         AV13Cpostal = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV46CliPob = A295CliPob ;
         AV18CliNif = A278CliNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      /* Execute user subroutine: 'ENVIO' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P05MW12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV38CliCod), Byte.valueOf(AV43CliEnvDom)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A266CliEnvLin = P05MW12_A266CliEnvLin[0] ;
         A252CliCod = P05MW12_A252CliCod[0] ;
         A267CliEnvNom = P05MW12_A267CliEnvNom[0] ;
         A265CliEnvDom = P05MW12_A265CliEnvDom[0] ;
         A10775CliEnvCp2 = P05MW12_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P05MW12_A264CliEnvCp[0] ;
         A268CliEnvPob = P05MW12_A268CliEnvPob[0] ;
         AV42CliENom = A267CliEnvNom ;
         AV41CliEDom = A265CliEnvDom ;
         AV13Cpostal = GXutil.trim( A264CliEnvCp) + "-" + GXutil.trim( A10775CliEnvCp2) ;
         AV44CliEPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void h5MW0( boolean bFoot ,
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
               if ( AV54FacTot.doubleValue() == 0 )
               {
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+98) ;
               }
               else
               {
                  getPrinter().GxDrawRect(497, Gx_line+6, 665, Gx_line+91, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(14, Gx_line+6, 249, Gx_line+37, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Incidencia", ""), 24, Gx_line+15, 83, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 114, Gx_line+15, 141, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 185, Gx_line+15, 214, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50FacImp, "ZZZZZZ9.99")), 17, Gx_line+39, 91, Gx_line+56, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25IvaPor), "Z9")), 120, Gx_line+39, 136, Gx_line+56, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51valorIva, "ZZZZZZ9.99")), 164, Gx_line+39, 238, Gx_line+56, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(14, Gx_line+38, 249, Gx_line+95, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Carga:", ""), 264, Gx_line+6, 304, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N/MORADA", ""), 356, Gx_line+6, 422, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Descarga:", ""), 264, Gx_line+27, 324, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Viatura:", ""), 264, Gx_line+66, 308, Gx_line+82, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 264, Gx_line+85, 296, Gx_line+101, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52AlbHorSal, "")), 330, Gx_line+85, 423, Gx_line+102, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53AlbMat, "")), 330, Gx_line+66, 435, Gx_line+83, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(661, Gx_line+6, 772, Gx_line+91, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50FacImp, "ZZZZZZ9.99")), 692, Gx_line+17, 766, Gx_line+34, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51valorIva, "ZZZZZZ9.99")), 692, Gx_line+47, 766, Gx_line+64, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54FacTot, "ZZZZZZ9.99")), 692, Gx_line+68, 766, Gx_line+85, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor Mercadoria:", ""), 503, Gx_line+17, 602, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Valor IVA:", ""), 503, Gx_line+47, 555, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total Documento:", ""), 503, Gx_line+68, 604, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Descarga, "")), 330, Gx_line+27, 487, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Descarga2, "")), 330, Gx_line+47, 487, Gx_line+64, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+103) ;
               }
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EM TODAS AS MALHAS PARA TINTO EM PEÇA, SERA NECESSARIO UM TRATAMENTO PREVIO ANTES DE TINGIR", ""), 106, Gx_line+5, 755, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(14, Gx_line+0, 773, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+29) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OBS.:", ""), 41, Gx_line+0, 74, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29vObs[1-1], "")), 83, Gx_line+2, 449, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29vObs[2-1], "")), 83, Gx_line+21, 449, Gx_line+38, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+41) ;
               getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Notas: 1 -A CARVITIN não aceita reclamações apos 8 dias da entrega da encomenda", ""), 41, Gx_line+0, 412, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "          2 -A CARVITIN não aceita reclamações de material ja cortado.", ""), 41, Gx_line+13, 342, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "          3 -A CARVITIN so se responsabiliza pelos resultados dos ensaios que são efectuados internamente.", ""), 41, Gx_line+25, 506, Gx_line+41, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+41) ;
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
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Soc. por quotas-Capital Social 200.000.00 Euros Reg na", ""), 14, Gx_line+81, 356, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "C.R.C. Braga Sob o nº 507975170 Parque Ind. Padim", ""), 14, Gx_line+100, 357, Gx_line+117, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "da Graça Lote 16 4700 - 670 PADIM DA GRAÇA (BRG)", ""), 14, Gx_line+118, 358, Gx_line+135, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tel. 253 300090 / Fax. 253 622428 IVA PT 50797510", ""), 14, Gx_line+135, 338, Gx_line+152, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmos. Srs.", ""), 425, Gx_line+145, 502, Gx_line+162, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 664, Gx_line+27, 738, Gx_line+44, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Dsc_pais, "")), 425, Gx_line+245, 634, Gx_line+262, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28VDoc, "")), 569, Gx_line+27, 653, Gx_line+44, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30CliNom3, "")), 425, Gx_line+161, 739, Gx_line+179, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 425, Gx_line+195, 639, Gx_line+213, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 425, Gx_line+211, 614, Gx_line+229, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Cpostal, "")), 425, Gx_line+228, 489, Gx_line+245, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 492, Gx_line+228, 649, Gx_line+245, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV58QrCode)==0) ? AV73Qrcode_GXI : AV58QrCode) ;
               getPrinter().GxDrawBitMap(sImgUrl, 608, Gx_line+56, 708, Gx_line+156) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "904f7e1f-51d9-4a89-8bbb-36abc59e138c", "", context.getHttpContext().getTheme( )), 17, Gx_line+17, 243, Gx_line+77) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+265) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16AtId, "")), 26, Gx_line+13, 215, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Texto_fd, "")), 343, Gx_line+39, 719, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9TextoCopia, "")), 26, Gx_line+39, 152, Gx_line+57, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+66) ;
               getPrinter().GxDrawRect(13, Gx_line+3, 772, Gx_line+45, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Nº Contribuinte", ""), 40, Gx_line+17, 149, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dat do Documento", ""), 283, Gx_line+17, 397, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 622, Gx_line+17, 665, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 47, Gx_line+51, 152, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 320, Gx_line+52, 371, Gx_line+69, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 598, Gx_line+53, 643, Gx_line+70, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 658, Gx_line+53, 713, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 649, Gx_line+53, 653, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(13, Gx_line+44, 772, Gx_line+78, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+80) ;
               getPrinter().GxDrawRect(14, Gx_line+14, 773, Gx_line+42, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Ref.", ""), 27, Gx_line+20, 63, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Doc.", ""), 94, Gx_line+20, 131, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pçs", ""), 154, Gx_line+20, 177, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 195, Gx_line+20, 235, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 315, Gx_line+20, 374, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qtd", ""), 558, Gx_line+20, 579, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Un", ""), 596, Gx_line+20, 614, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Preço/un", ""), 618, Gx_line+20, 670, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "%IVA", ""), 677, Gx_line+20, 706, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 717, Gx_line+20, 746, Gx_line+36, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+54) ;
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial Narrow", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "albaranes.pgrcarvitin");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "albaranes.pgrcarvitin");
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
      AV8ImpCod = "" ;
      AV9TextoCopia = "" ;
      AV32ContDsc = "" ;
      AV35FirmaD = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P05MW2_A588IvaPor = new byte[1] ;
      P05MW2_n588IvaPor = new boolean[] {false} ;
      P05MW2_A953IvaCod = new String[] {""} ;
      A953IvaCod = "" ;
      P05MW3_A1253EmprGuiRem = new String[] {""} ;
      P05MW3_A396EmprCod = new String[] {""} ;
      P05MW3_A30AlbProCod = new long[1] ;
      P05MW3_A10017AlbFmd = new String[] {""} ;
      P05MW3_n10017AlbFmd = new boolean[] {false} ;
      P05MW3_A7101AlbLic = new String[] {""} ;
      P05MW3_A3865AlbHorSal = new String[] {""} ;
      P05MW3_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P05MW3_A3868AlbMat = new String[] {""} ;
      P05MW3_A1243GuiRemCli = new int[1] ;
      P05MW3_A39AlbProPri = new String[] {""} ;
      P05MW3_A33AlbProEst = new byte[1] ;
      P05MW3_A1782AlbProEso = new byte[1] ;
      P05MW3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1253EmprGuiRem = "" ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      A3865AlbHorSal = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3868AlbMat = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P05MW4_A407EmprNom = new String[] {""} ;
      P05MW4_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      P05MW5_A781PrvCod = new short[1] ;
      P05MW5_n781PrvCod = new boolean[] {false} ;
      P05MW5_A295CliPob = new String[] {""} ;
      P05MW5_n295CliPob = new boolean[] {false} ;
      P05MW5_A260CliDom = new String[] {""} ;
      P05MW5_n260CliDom = new boolean[] {false} ;
      P05MW5_A278CliNif = new String[] {""} ;
      P05MW5_n278CliNif = new boolean[] {false} ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A278CliNif = "" ;
      P05MW6_A787PrvDsc = new String[] {""} ;
      P05MW6_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      AV17Texto_fd = "" ;
      AV34Firma4dig = "" ;
      AV16AtId = "" ;
      AV52AlbHorSal = "" ;
      AV55ALbFecsal = GXutil.nullDate() ;
      AV53AlbMat = "" ;
      AV61Descarga = "" ;
      AV41CliEDom = "" ;
      AV62Descarga2 = "" ;
      AV13Cpostal = "" ;
      AV44CliEPob = "" ;
      AV60TextoGenerar = "" ;
      AV63EmprCif = "" ;
      AV18CliNif = "" ;
      AV68Url = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV58QrCode = "" ;
      AV73Qrcode_GXI = "" ;
      AV48EmprNom = "" ;
      AV28VDoc = "" ;
      AV37vCopia = "" ;
      AV29vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV29vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05MW7_A396EmprCod = new String[] {""} ;
      P05MW7_A30AlbProCod = new long[1] ;
      P05MW7_A916AlbPObs = new String[] {""} ;
      P05MW7_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      AV51valorIva = DecimalUtil.ZERO ;
      AV50FacImp = DecimalUtil.ZERO ;
      AV54FacTot = DecimalUtil.ZERO ;
      P05MW8_A396EmprCod = new String[] {""} ;
      P05MW8_A30AlbProCod = new long[1] ;
      P05MW8_A130BarCodPar = new String[] {""} ;
      P05MW8_A132BarCodReo = new byte[1] ;
      P05MW8_A129BarCod = new int[1] ;
      P05MW8_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MW8_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MW8_A1265BarAlbPie = new int[1] ;
      P05MW8_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MW8_A1234BarNomCli = new String[] {""} ;
      P05MW8_A1652BarSerDsc = new String[] {""} ;
      P05MW8_A4815AlbEncCli = new String[] {""} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A4815AlbEncCli = "" ;
      AV31Bardisnum = "" ;
      AV20Kgs = DecimalUtil.ZERO ;
      AV24Mts = DecimalUtil.ZERO ;
      AV21Pkg = DecimalUtil.ZERO ;
      AV22Valor = DecimalUtil.ZERO ;
      AV27Totkgs = DecimalUtil.ZERO ;
      P05MW9_A457FasCod = new String[] {""} ;
      P05MW9_A396EmprCod = new String[] {""} ;
      P05MW9_A30AlbProCod = new long[1] ;
      P05MW9_A129BarCod = new int[1] ;
      P05MW9_A132BarCodReo = new byte[1] ;
      P05MW9_A130BarCodPar = new String[] {""} ;
      P05MW9_A460FasDsc = new String[] {""} ;
      P05MW9_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MW9_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MW9_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MW9_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05MW9_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      AV19fasDsc = "" ;
      AV56Pmt = DecimalUtil.ZERO ;
      AV11CliNom = "" ;
      AV12CliDom = "" ;
      AV39Clicp = "" ;
      AV46CliPob = "" ;
      AV42CliENom = "" ;
      AV40CliEcp = "" ;
      P05MW11_A396EmprCod = new String[] {""} ;
      P05MW11_A252CliCod = new int[1] ;
      P05MW11_A279CliNom = new String[] {""} ;
      P05MW11_A3644CliNom1 = new String[] {""} ;
      P05MW11_A260CliDom = new String[] {""} ;
      P05MW11_n260CliDom = new boolean[] {false} ;
      P05MW11_A4828CliCp2 = new String[] {""} ;
      P05MW11_A256CliCp = new String[] {""} ;
      P05MW11_A295CliPob = new String[] {""} ;
      P05MW11_n295CliPob = new boolean[] {false} ;
      P05MW11_A278CliNif = new String[] {""} ;
      P05MW11_n278CliNif = new boolean[] {false} ;
      A279CliNom = "" ;
      A3644CliNom1 = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      AV45CliNom1 = "" ;
      AV30CliNom3 = "" ;
      P05MW12_A396EmprCod = new String[] {""} ;
      P05MW12_A266CliEnvLin = new byte[1] ;
      P05MW12_A252CliCod = new int[1] ;
      P05MW12_A267CliEnvNom = new String[] {""} ;
      P05MW12_A265CliEnvDom = new String[] {""} ;
      P05MW12_A10775CliEnvCp2 = new String[] {""} ;
      P05MW12_A264CliEnvCp = new String[] {""} ;
      P05MW12_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A10775CliEnvCp2 = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      AV15Dsc_pais = "" ;
      AV58QrCode = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.pgrcarvitin__default(),
         new Object[] {
             new Object[] {
            P05MW2_A588IvaPor, P05MW2_n588IvaPor, P05MW2_A953IvaCod
            }
            , new Object[] {
            P05MW3_A1253EmprGuiRem, P05MW3_A396EmprCod, P05MW3_A30AlbProCod, P05MW3_A10017AlbFmd, P05MW3_n10017AlbFmd, P05MW3_A7101AlbLic, P05MW3_A3865AlbHorSal, P05MW3_A4023AlbFecSal, P05MW3_A3868AlbMat, P05MW3_A1243GuiRemCli,
            P05MW3_A39AlbProPri, P05MW3_A33AlbProEst, P05MW3_A1782AlbProEso, P05MW3_A34AlbProfch
            }
            , new Object[] {
            P05MW4_A407EmprNom, P05MW4_n407EmprNom
            }
            , new Object[] {
            P05MW5_A781PrvCod, P05MW5_n781PrvCod, P05MW5_A295CliPob, P05MW5_n295CliPob, P05MW5_A260CliDom, P05MW5_n260CliDom, P05MW5_A278CliNif, P05MW5_n278CliNif
            }
            , new Object[] {
            P05MW6_A787PrvDsc, P05MW6_n787PrvDsc
            }
            , new Object[] {
            P05MW7_A396EmprCod, P05MW7_A30AlbProCod, P05MW7_A916AlbPObs, P05MW7_A915AlbPObsLin
            }
            , new Object[] {
            P05MW8_A396EmprCod, P05MW8_A30AlbProCod, P05MW8_A130BarCodPar, P05MW8_A132BarCodReo, P05MW8_A129BarCod, P05MW8_A1261BarAlbKgmE, P05MW8_A1263BarAlbMtrE, P05MW8_A1265BarAlbPie, P05MW8_A1262BarPreKgm, P05MW8_A1234BarNomCli,
            P05MW8_A1652BarSerDsc, P05MW8_A4815AlbEncCli
            }
            , new Object[] {
            P05MW9_A457FasCod, P05MW9_A396EmprCod, P05MW9_A30AlbProCod, P05MW9_A129BarCod, P05MW9_A132BarCodReo, P05MW9_A130BarCodPar, P05MW9_A460FasDsc, P05MW9_A1275FasKgm, P05MW9_A1276FasMtr, P05MW9_A1241GuiFasPKg,
            P05MW9_A1242GuiFasPMt, P05MW9_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P05MW11_A396EmprCod, P05MW11_A252CliCod, P05MW11_A279CliNom, P05MW11_A3644CliNom1, P05MW11_A260CliDom, P05MW11_A4828CliCp2, P05MW11_A256CliCp, P05MW11_A295CliPob, P05MW11_A278CliNif
            }
            , new Object[] {
            P05MW12_A396EmprCod, P05MW12_A266CliEnvLin, P05MW12_A252CliCod, P05MW12_A267CliEnvNom, P05MW12_A265CliEnvDom, P05MW12_A10775CliEnvCp2, P05MW12_A264CliEnvCp, P05MW12_A268CliEnvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV33existefirmad ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A588IvaPor ;
   private byte AV25IvaPor ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte AV65mes ;
   private byte AV66dia ;
   private byte AV47Copias ;
   private byte AV36i ;
   private byte A915AlbPObsLin ;
   private byte A132BarCodReo ;
   private byte AV43CliEnvDom ;
   private byte A266CliEnvLin ;
   private short gxcookieaux ;
   private short A781PrvCod ;
   private short AV64anyo ;
   private short AV49Num_lineas ;
   private short AV23Pzas ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV38CliCod ;
   private int GX_I ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV26Totpzs ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV51valorIva ;
   private java.math.BigDecimal AV50FacImp ;
   private java.math.BigDecimal AV54FacTot ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal AV20Kgs ;
   private java.math.BigDecimal AV24Mts ;
   private java.math.BigDecimal AV21Pkg ;
   private java.math.BigDecimal AV22Valor ;
   private java.math.BigDecimal AV27Totkgs ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV56Pmt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV9TextoCopia ;
   private String AV32ContDsc ;
   private String AV35FirmaD ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A953IvaCod ;
   private String A1253EmprGuiRem ;
   private String A7101AlbLic ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String A39AlbProPri ;
   private String A407EmprNom ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A278CliNif ;
   private String A787PrvDsc ;
   private String AV17Texto_fd ;
   private String AV34Firma4dig ;
   private String AV16AtId ;
   private String AV52AlbHorSal ;
   private String AV53AlbMat ;
   private String AV61Descarga ;
   private String AV41CliEDom ;
   private String AV62Descarga2 ;
   private String AV13Cpostal ;
   private String AV44CliEPob ;
   private String AV63EmprCif ;
   private String AV18CliNif ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV48EmprNom ;
   private String AV28VDoc ;
   private String AV37vCopia ;
   private String AV29vObs[] ;
   private String A916AlbPObs ;
   private String A130BarCodPar ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A4815AlbEncCli ;
   private String AV31Bardisnum ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV19fasDsc ;
   private String AV11CliNom ;
   private String AV12CliDom ;
   private String AV39Clicp ;
   private String AV46CliPob ;
   private String AV42CliENom ;
   private String AV40CliEcp ;
   private String A279CliNom ;
   private String A3644CliNom1 ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String AV45CliNom1 ;
   private String AV30CliNom3 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A10775CliEnvCp2 ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String AV15Dsc_pais ;
   private String sImgUrl ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV55ALbFecsal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n588IvaPor ;
   private boolean GxHdr3 ;
   private boolean n10017AlbFmd ;
   private boolean n407EmprNom ;
   private boolean n781PrvCod ;
   private boolean n295CliPob ;
   private boolean n260CliDom ;
   private boolean n278CliNif ;
   private boolean n787PrvDsc ;
   private boolean returnInSub ;
   private String A10017AlbFmd ;
   private String AV60TextoGenerar ;
   private String AV68Url ;
   private String AV73Qrcode_GXI ;
   private String AV58QrCode ;
   private String Qrcode ;
   private IDataStoreProvider pr_default ;
   private byte[] P05MW2_A588IvaPor ;
   private boolean[] P05MW2_n588IvaPor ;
   private String[] P05MW2_A953IvaCod ;
   private String[] P05MW3_A1253EmprGuiRem ;
   private String[] P05MW3_A396EmprCod ;
   private long[] P05MW3_A30AlbProCod ;
   private String[] P05MW3_A10017AlbFmd ;
   private boolean[] P05MW3_n10017AlbFmd ;
   private String[] P05MW3_A7101AlbLic ;
   private String[] P05MW3_A3865AlbHorSal ;
   private java.util.Date[] P05MW3_A4023AlbFecSal ;
   private String[] P05MW3_A3868AlbMat ;
   private int[] P05MW3_A1243GuiRemCli ;
   private String[] P05MW3_A39AlbProPri ;
   private byte[] P05MW3_A33AlbProEst ;
   private byte[] P05MW3_A1782AlbProEso ;
   private java.util.Date[] P05MW3_A34AlbProfch ;
   private String[] P05MW4_A407EmprNom ;
   private boolean[] P05MW4_n407EmprNom ;
   private short[] P05MW5_A781PrvCod ;
   private boolean[] P05MW5_n781PrvCod ;
   private String[] P05MW5_A295CliPob ;
   private boolean[] P05MW5_n295CliPob ;
   private String[] P05MW5_A260CliDom ;
   private boolean[] P05MW5_n260CliDom ;
   private String[] P05MW5_A278CliNif ;
   private boolean[] P05MW5_n278CliNif ;
   private String[] P05MW6_A787PrvDsc ;
   private boolean[] P05MW6_n787PrvDsc ;
   private String[] P05MW7_A396EmprCod ;
   private long[] P05MW7_A30AlbProCod ;
   private String[] P05MW7_A916AlbPObs ;
   private byte[] P05MW7_A915AlbPObsLin ;
   private String[] P05MW8_A396EmprCod ;
   private long[] P05MW8_A30AlbProCod ;
   private String[] P05MW8_A130BarCodPar ;
   private byte[] P05MW8_A132BarCodReo ;
   private int[] P05MW8_A129BarCod ;
   private java.math.BigDecimal[] P05MW8_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P05MW8_A1263BarAlbMtrE ;
   private int[] P05MW8_A1265BarAlbPie ;
   private java.math.BigDecimal[] P05MW8_A1262BarPreKgm ;
   private String[] P05MW8_A1234BarNomCli ;
   private String[] P05MW8_A1652BarSerDsc ;
   private String[] P05MW8_A4815AlbEncCli ;
   private String[] P05MW9_A457FasCod ;
   private String[] P05MW9_A396EmprCod ;
   private long[] P05MW9_A30AlbProCod ;
   private int[] P05MW9_A129BarCod ;
   private byte[] P05MW9_A132BarCodReo ;
   private String[] P05MW9_A130BarCodPar ;
   private String[] P05MW9_A460FasDsc ;
   private java.math.BigDecimal[] P05MW9_A1275FasKgm ;
   private java.math.BigDecimal[] P05MW9_A1276FasMtr ;
   private java.math.BigDecimal[] P05MW9_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P05MW9_A1242GuiFasPMt ;
   private short[] P05MW9_A1240GuiFasLin ;
   private String[] P05MW11_A396EmprCod ;
   private int[] P05MW11_A252CliCod ;
   private String[] P05MW11_A279CliNom ;
   private String[] P05MW11_A3644CliNom1 ;
   private String[] P05MW11_A260CliDom ;
   private boolean[] P05MW11_n260CliDom ;
   private String[] P05MW11_A4828CliCp2 ;
   private String[] P05MW11_A256CliCp ;
   private String[] P05MW11_A295CliPob ;
   private boolean[] P05MW11_n295CliPob ;
   private String[] P05MW11_A278CliNif ;
   private boolean[] P05MW11_n278CliNif ;
   private String[] P05MW12_A396EmprCod ;
   private byte[] P05MW12_A266CliEnvLin ;
   private int[] P05MW12_A252CliCod ;
   private String[] P05MW12_A267CliEnvNom ;
   private String[] P05MW12_A265CliEnvDom ;
   private String[] P05MW12_A10775CliEnvCp2 ;
   private String[] P05MW12_A264CliEnvCp ;
   private String[] P05MW12_A268CliEnvPob ;
}

final  class pgrcarvitin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05MW2", "SELECT IvaPor, IvaCod FROM TXPTIPIVA ORDER BY IvaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MW3", "SELECT EmprGuiRem, EmprCod, AlbProCod, AlbFmd, AlbLic, AlbHorSal, AlbFecSal, AlbMat, GuiRemCli, AlbProPri, AlbProEst, AlbProEso, AlbProfch FROM TXPCALPRD WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?)  FOR UPDATE OF AlbProEst, AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MW4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MW5", "SELECT PrvCod, CliPob, CliDom, CliNif FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MW6", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MW7", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MW8", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.BarPreKgm, T3.BarNomCli, T3.BarSerDsc, T1.AlbEncCli FROM ((TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.AlbProCod = ?) ORDER BY T1.AlbEncCli, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05MW9", "SELECT T1.FasCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.FasKgm, T1.FasMtr, T1.GuiFasPKg, T1.GuiFasPMt, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05MW10", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P05MW11", "SELECT EmprCod, CliCod, CliNom, CliNom1, CliDom, CliCp2, CliCp, CliPob, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05MW12", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp2, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 34);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

