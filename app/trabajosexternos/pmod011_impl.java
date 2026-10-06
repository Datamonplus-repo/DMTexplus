package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pmod011_impl extends GXWebReport
{
   public pmod011_impl( com.genexus.internet.HttpContext context )
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
            A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV47TextoCopia = httpContext.GetPar( "TextoCopia") ;
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
      M_bot = 10 ;
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
         P_lines = (int)(gxYPage-(lineHeight*10)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV45ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD000", ""), GXv_char1) ;
         pmod011_impl.this.AV45ContDsc = GXv_char1[0] ;
         GXt_char2 = AV49FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pmod011_impl.this.A396EmprCod = GXv_char1[0] ;
         pmod011_impl.this.GXt_char2 = GXv_char4[0] ;
         AV49FirmaD = GXt_char2 ;
         GXt_int5 = AV71PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pmod011_impl.this.GXt_int5 = GXv_int6[0] ;
         AV71PQrcode = GXt_int5 ;
         /* Using cursor P056D2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P056D2_A407EmprNom[0] ;
            n407EmprNom = P056D2_n407EmprNom[0] ;
            A8335EmpItm2 = P056D2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P056D2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P056D2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P056D2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P056D2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P056D2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P056D2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P056D2_n8336EmpItm3[0] ;
            A395EmprCif = P056D2_A395EmprCif[0] ;
            n395EmprCif = P056D2_n395EmprCif[0] ;
            AV31EmprNom = A407EmprNom ;
            AV51Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV52Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV77EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P056D3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3554SalExtObs = P056D3_A3554SalExtObs[0] ;
            A14348SalExtATCU = P056D3_A14348SalExtATCU[0] ;
            A10077SalFmd = P056D3_A10077SalFmd[0] ;
            A10742SalCodeID = P056D3_A10742SalCodeID[0] ;
            A2258SalExtLis = P056D3_A2258SalExtLis[0] ;
            A6396SalExtHor = P056D3_A6396SalExtHor[0] ;
            A6397SalExtMat = P056D3_A6397SalExtMat[0] ;
            A2256SalExtFec = P056D3_A2256SalExtFec[0] ;
            A2248ManCod = P056D3_A2248ManCod[0] ;
            A3302ManNif = P056D3_A3302ManNif[0] ;
            n3302ManNif = P056D3_n3302ManNif[0] ;
            A2251ManPob = P056D3_A2251ManPob[0] ;
            n2251ManPob = P056D3_n2251ManPob[0] ;
            A2250ManDom = P056D3_A2250ManDom[0] ;
            n2250ManDom = P056D3_n2250ManDom[0] ;
            A2249ManNom = P056D3_A2249ManNom[0] ;
            n2249ManNom = P056D3_n2249ManNom[0] ;
            A3302ManNif = P056D3_A3302ManNif[0] ;
            n3302ManNif = P056D3_n3302ManNif[0] ;
            A2251ManPob = P056D3_A2251ManPob[0] ;
            n2251ManPob = P056D3_n2251ManPob[0] ;
            A2250ManDom = P056D3_A2250ManDom[0] ;
            n2250ManDom = P056D3_n2250ManDom[0] ;
            A2249ManNom = P056D3_A2249ManNom[0] ;
            n2249ManNom = P056D3_n2249ManNom[0] ;
            AV78codValidacaoSerie = A14348SalExtATCU ;
            AV79atcud = ((GXutil.strcmp("", AV78codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV78codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0))) ;
            AV38FechaAlb = GXutil.str( GXutil.day( A2256SalExtFec), 2, 0) + httpContext.getMessage( " de ", "") + localUtil.cmonth( A2256SalExtFec, httpContext.getMessage( "por", "")) + httpContext.getMessage( " de ", "") + GXutil.str( GXutil.year( A2256SalExtFec), 4, 0) ;
            AV48Texto_fd = " " ;
            if ( GXutil.strcmp(A10077SalFmd, " ") != 0 )
            {
               AV50Firma4dig = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
               AV48Texto_fd = AV50Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV49FirmaD) ;
            }
            else
            {
               AV48Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV76TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV77EmprCif) + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A3302ManNif) + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "D:", "") + httpContext.getMessage( "GT", "") + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV24Anyo = (short)(GXutil.year( A2256SalExtFec)) ;
            AV23Mes = (byte)(GXutil.month( A2256SalExtFec)) ;
            AV22Dia = (byte)(GXutil.day( A2256SalExtFec)) ;
            AV76TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV24Anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV23Mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV22Dia, 2, 0)), (short)(2), "0") + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "G:", "") + httpContext.getMessage( "GT 5/", "") + GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0)) + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "H:", "") + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "Q:", "") + AV50Firma4dig + "*" ;
            AV76TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV49FirmaD) + "*" ;
            AV81Dpi = (short)(300) ;
            AV82Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV83Pixel = (short)(DecimalUtil.decToDouble(AV82Centimetos.multiply(DecimalUtil.doubleToDec(AV81Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV80Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV76TextoGenerar, AV83Pixel, AV83Pixel, GXv_char4) ;
            pmod011_impl.this.GXt_char2 = GXv_char4[0] ;
            AV80Url = GXt_char2 ;
            AV75Imagen = AV80Url ;
            AV91Imagen_GXI = GXDbFile.pathToUrl( AV80Url, context.getHttpContext()) ;
            AV54AtId = " " ;
            if ( GXutil.strcmp(A10742SalCodeID, " ") != 0 )
            {
               AV54AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A10742SalCodeID, 1, 12)) ;
            }
            AV53SalExtObs = A3554SalExtObs ;
            AV29Cantidad = (short)(0) ;
            AV55Tot_k = DecimalUtil.doubleToDec(0) ;
            AV56Tot_mt = DecimalUtil.doubleToDec(0) ;
            AV58Lasthdr = " " ;
            /* Using cursor P056D4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               brk56D5 = false ;
               A6558FasCodn = P056D4_A6558FasCodn[0] ;
               A130BarCodPar = P056D4_A130BarCodPar[0] ;
               A132BarCodReo = P056D4_A132BarCodReo[0] ;
               A129BarCod = P056D4_A129BarCod[0] ;
               A361DisCod = P056D4_A361DisCod[0] ;
               A11662BarOrdComp = P056D4_A11662BarOrdComp[0] ;
               A181BarMaqPro = P056D4_A181BarMaqPro[0] ;
               A136BarColNum = P056D4_A136BarColNum[0] ;
               A135BarColNom = P056D4_A135BarColNom[0] ;
               A6257SalExCoE = P056D4_A6257SalExCoE[0] ;
               A6256SalExKgE = P056D4_A6256SalExKgE[0] ;
               A1652BarSerDsc = P056D4_A1652BarSerDsc[0] ;
               A1909BarGraAca = P056D4_A1909BarGraAca[0] ;
               A125BarAncAca1 = P056D4_A125BarAncAca1[0] ;
               A2829BarProPer = P056D4_A2829BarProPer[0] ;
               A143BarDisNum = P056D4_A143BarDisNum[0] ;
               A6248SalExNln = P056D4_A6248SalExNln[0] ;
               A361DisCod = P056D4_A361DisCod[0] ;
               A11662BarOrdComp = P056D4_A11662BarOrdComp[0] ;
               A181BarMaqPro = P056D4_A181BarMaqPro[0] ;
               A136BarColNum = P056D4_A136BarColNum[0] ;
               A135BarColNom = P056D4_A135BarColNom[0] ;
               A1652BarSerDsc = P056D4_A1652BarSerDsc[0] ;
               A1909BarGraAca = P056D4_A1909BarGraAca[0] ;
               A125BarAncAca1 = P056D4_A125BarAncAca1[0] ;
               A2829BarProPer = P056D4_A2829BarProPer[0] ;
               A143BarDisNum = P056D4_A143BarDisNum[0] ;
               GX_I = 1 ;
               while ( GX_I <= 100 )
               {
                  AV59Tab_fs[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               AV60i = (short)(1) ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P056D4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P056D4_A2253SalExtAlb[0] == A2253SalExtAlb ) && ( P056D4_A129BarCod[0] == A129BarCod ) && ( P056D4_A132BarCodReo[0] == A132BarCodReo ) )
               {
                  if ( ! ( ( GXutil.strcmp(P056D4_A130BarCodPar[0], A130BarCodPar) == 0 ) ) )
                  {
                     if (true) break;
                  }
                  brk56D5 = false ;
                  A6558FasCodn = P056D4_A6558FasCodn[0] ;
                  A6248SalExNln = P056D4_A6248SalExNln[0] ;
                  GXt_char2 = AV27FasDsc ;
                  GXv_char4[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A6558FasCodn, GXv_char4) ;
                  pmod011_impl.this.GXt_char2 = GXv_char4[0] ;
                  AV27FasDsc = GXt_char2 ;
                  AV59Tab_fs[AV60i-1] = GXutil.substring( AV27FasDsc, 1, 20) ;
                  AV60i = (short)(AV60i+1) ;
                  brk56D5 = true ;
                  pr_default.readNext(2);
               }
               AV17BarCod = A129BarCod ;
               AV18BarCodReo = A132BarCodReo ;
               AV19BarCodPar = A130BarCodPar ;
               AV70Discod = A361DisCod ;
               /* Execute user subroutine: 'BARPIE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
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
               AV68PO = GXutil.substring( A11662BarOrdComp, 1, 20) ;
               GXv_char4[0] = AV67Marcadsc ;
               new app.pmarcacliente(remoteHandle, context).execute( A396EmprCod, A181BarMaqPro, GXv_char4) ;
               pmod011_impl.this.AV67Marcadsc = GXv_char4[0] ;
               AV46vColor = A135BarColNom + GXutil.str( A136BarColNum, 6, 0) ;
               AV21HojaRuta = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               AV57Pzs = (short)(A6257SalExCoE) ;
               AV85kgs = A6256SalExKgE ;
               h56D0( false, 19) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21HojaRuta, "")), 11, Gx_line+1, 92, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 100, Gx_line+1, 291, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85kgs, "ZZZ9.99")), 294, Gx_line+0, 346, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57Pzs), "ZZZ9")), 365, Gx_line+0, 395, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Tab_fs[1-1], "")), 403, Gx_line+1, 508, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_obs[1-1], "")), 516, Gx_line+3, 777, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 350, Gx_line+0, 366, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               h56D0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46vColor, "")), 34, Gx_line+0, 160, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 11, Gx_line+0, 29, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Tab_fs[2-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_obs[2-1], "")), 516, Gx_line+1, 777, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h56D0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Acabamento Largura:", ""), 11, Gx_line+1, 117, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 120, Gx_line+1, 140, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gram:", ""), 146, Gx_line+1, 177, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 182, Gx_line+1, 208, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Tab_fs[3-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_obs[3-1], "")), 516, Gx_line+3, 777, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h56D0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FIO:", ""), 11, Gx_line+0, 31, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Fio5, "")), 31, Gx_line+0, 84, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Tab_fs[4-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Jogo3, "")), 120, Gx_line+0, 152, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "JOGO:", ""), 89, Gx_line+0, 119, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("\"", 172, Gx_line+0, 177, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64Pgadas), "Z9")), 156, Gx_line+0, 170, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Maq6, "")), 220, Gx_line+0, 263, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MAQ:", ""), 188, Gx_line+0, 215, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62AlbrLote, "")), 303, Gx_line+0, 398, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote:", ""), 271, Gx_line+0, 297, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_obs[4-1], "")), 516, Gx_line+0, 777, Gx_line+13, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h56D0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R.comp:", ""), 11, Gx_line+0, 52, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66AlbNumb, "")), 52, Gx_line+0, 178, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2829BarProPer, "")), 203, Gx_line+0, 287, Gx_line+15, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Tab_fs[5-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h56D0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Po:", ""), 11, Gx_line+0, 28, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68PO, "")), 52, Gx_line+0, 178, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h56D0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 11, Gx_line+0, 46, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Marcadsc, "")), 52, Gx_line+0, 241, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h56D0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Doc Cliente:", ""), 11, Gx_line+1, 71, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 73, Gx_line+0, 157, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               h56D0( false, 7) ;
               getPrinter().GxDrawLine(4, Gx_line+4, 779, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+7) ;
               if ( ! brk56D5 )
               {
                  brk56D5 = true ;
                  pr_default.readNext(2);
               }
            }
            pr_default.close(2);
            if ( AV71PQrcode == 1 )
            {
               h56D0( false, 20) ;
               getPrinter().GxAttris("Arial", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TextoGenerar, "")), 16, Gx_line+0, 784, Gx_line+19, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
            if ( A2258SalExtLis == 0 )
            {
               A2258SalExtLis = (byte)(1) ;
            }
            /* Using cursor P056D5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A2258SalExtLis), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h56D0( true, 0) ;
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
      /* 'BARPIE' Routine */
      returnInSub = false ;
      /* Using cursor P056D6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A44AlbRecCod = P056D6_A44AlbRecCod[0] ;
         A130BarCodPar = P056D6_A130BarCodPar[0] ;
         A132BarCodReo = P056D6_A132BarCodReo[0] ;
         A129BarCod = P056D6_A129BarCod[0] ;
         A8028AlbNumB = P056D6_A8028AlbNumB[0] ;
         A6463AlbRLote = P056D6_A6463AlbRLote[0] ;
         A6465AlbRLu = P056D6_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P056D6_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P056D6_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P056D6_A8035AlbMaqTej[0] ;
         A200BarPieCod = P056D6_A200BarPieCod[0] ;
         A8028AlbNumB = P056D6_A8028AlbNumB[0] ;
         A6463AlbRLote = P056D6_A6463AlbRLote[0] ;
         A6465AlbRLu = P056D6_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P056D6_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P056D6_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P056D6_A8035AlbMaqTej[0] ;
         AV66AlbNumb = A8028AlbNumB ;
         AV62AlbrLote = A6463AlbRLote ;
         AV64Pgadas = (byte)(DecimalUtil.decToDouble(A6465AlbRLu)) ;
         AV63Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
         AV61Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
         AV65Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV69Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV60i = (short)(1) ;
      /* Using cursor P056D7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV70Discod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A361DisCod = P056D7_A361DisCod[0] ;
         A377DisObsTxt = P056D7_A377DisObsTxt[0] ;
         A376DisObsLin = P056D7_A376DisObsLin[0] ;
         AV69Tab_obs[AV60i-1] = A377DisObsTxt ;
         AV60i = (short)(AV60i+1) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void h56D0( boolean bFoot ,
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
               getPrinter().GxDrawLine(36, Gx_line+78, 765, Gx_line+78, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45ContDsc, "")), 680, Gx_line+63, 764, Gx_line+77, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Texto_fd, "")), 36, Gx_line+63, 350, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Texto_1, "")), 68, Gx_line+81, 736, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Texto_2, "")), 89, Gx_line+100, 715, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 41, Gx_line+14, 126, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(AV53SalExtObs, 133, Gx_line+14, 754, Gx_line+53, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54AtId, "")), 373, Gx_line+63, 499, Gx_line+76, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+121) ;
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
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia de Transporte (TE) Nº", ""), 443, Gx_line+156, 654, Gx_line+176, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(398, Gx_line+244, 765, Gx_line+335, 1, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2249ManNom, "")), 422, Gx_line+250, 611, Gx_line+268, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2250ManDom, "")), 422, Gx_line+282, 636, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2251ManPob, "")), 422, Gx_line+313, 611, Gx_line+331, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3302ManNif, "@!")), 625, Gx_line+353, 730, Gx_line+370, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")), 668, Gx_line+153, 761, Gx_line+177, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(4, Gx_line+427, 779, Gx_line+461, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 41, Gx_line+438, 64, Gx_line+453, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 100, Gx_line+439, 157, Gx_line+454, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 293, Gx_line+438, 359, Gx_line+453, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pç", ""), 372, Gx_line+436, 387, Gx_line+451, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Operação", ""), 429, Gx_line+438, 484, Gx_line+453, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 591, Gx_line+436, 668, Gx_line+451, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(94, Gx_line+427, 94, Gx_line+461, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(289, Gx_line+427, 289, Gx_line+461, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(363, Gx_line+427, 363, Gx_line+461, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(393, Gx_line+427, 393, Gx_line+461, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(513, Gx_line+427, 513, Gx_line+461, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 205, Gx_line+438, 227, Gx_line+453, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 197, Gx_line+438, 201, Gx_line+453, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TextoCopia, "")), 681, Gx_line+203, 760, Gx_line+220, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 22, Gx_line+5, 779, Gx_line+91) ;
               getPrinter().GxDrawRect(4, Gx_line+344, 779, Gx_line+424, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 29, Gx_line+353, 90, Gx_line+369, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 29, Gx_line+371, 121, Gx_line+387, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 29, Gx_line+389, 130, Gx_line+405, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 29, Gx_line+405, 99, Gx_line+421, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Contibuinte:", ""), 497, Gx_line+353, 580, Gx_line+369, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 497, Gx_line+371, 609, Gx_line+387, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 497, Gx_line+405, 552, Gx_line+421, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")), 129, Gx_line+353, 159, Gx_line+370, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A2256SalExtFec, "99/99/99"), 129, Gx_line+389, 180, Gx_line+406, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 129, Gx_line+371, 212, Gx_line+387, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalaçoes", ""), 625, Gx_line+371, 706, Gx_line+387, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6397SalExtMat, "")), 567, Gx_line+405, 672, Gx_line+422, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6396SalExtHor, "")), 227, Gx_line+405, 320, Gx_line+422, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A2256SalExtFec, "99/99/99"), 129, Gx_line+405, 180, Gx_line+422, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 192, Gx_line+405, 224, Gx_line+421, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV75Imagen)==0) ? AV91Imagen_GXI : AV75Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 217, Gx_line+167, 350, Gx_line+305) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79atcud, "")), 210, Gx_line+131, 367, Gx_line+148, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+463) ;
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
      add_metrics4( ) ;
      add_metrics5( ) ;
      add_metrics6( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.pmod011");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.pmod011");
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
      AV47TextoCopia = "" ;
      AV45ContDsc = "" ;
      AV49FirmaD = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P056D2_A396EmprCod = new String[] {""} ;
      P056D2_A407EmprNom = new String[] {""} ;
      P056D2_n407EmprNom = new boolean[] {false} ;
      P056D2_A8335EmpItm2 = new String[] {""} ;
      P056D2_n8335EmpItm2 = new boolean[] {false} ;
      P056D2_A8334EmpItm1 = new String[] {""} ;
      P056D2_n8334EmpItm1 = new boolean[] {false} ;
      P056D2_A8337EmpItm4 = new String[] {""} ;
      P056D2_n8337EmpItm4 = new boolean[] {false} ;
      P056D2_A8336EmpItm3 = new String[] {""} ;
      P056D2_n8336EmpItm3 = new boolean[] {false} ;
      P056D2_A395EmprCif = new String[] {""} ;
      P056D2_n395EmprCif = new boolean[] {false} ;
      A407EmprNom = "" ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV31EmprNom = "" ;
      AV51Texto_1 = "" ;
      AV52Texto_2 = "" ;
      AV77EmprCif = "" ;
      P056D3_A3554SalExtObs = new String[] {""} ;
      P056D3_A396EmprCod = new String[] {""} ;
      P056D3_A2253SalExtAlb = new int[1] ;
      P056D3_A14348SalExtATCU = new String[] {""} ;
      P056D3_A10077SalFmd = new String[] {""} ;
      P056D3_A10742SalCodeID = new String[] {""} ;
      P056D3_A2258SalExtLis = new byte[1] ;
      P056D3_A6396SalExtHor = new String[] {""} ;
      P056D3_A6397SalExtMat = new String[] {""} ;
      P056D3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P056D3_A2248ManCod = new short[1] ;
      P056D3_A3302ManNif = new String[] {""} ;
      P056D3_n3302ManNif = new boolean[] {false} ;
      P056D3_A2251ManPob = new String[] {""} ;
      P056D3_n2251ManPob = new boolean[] {false} ;
      P056D3_A2250ManDom = new String[] {""} ;
      P056D3_n2250ManDom = new boolean[] {false} ;
      P056D3_A2249ManNom = new String[] {""} ;
      P056D3_n2249ManNom = new boolean[] {false} ;
      A3554SalExtObs = "" ;
      A14348SalExtATCU = "" ;
      A10077SalFmd = "" ;
      A10742SalCodeID = "" ;
      A6396SalExtHor = "" ;
      A6397SalExtMat = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A3302ManNif = "" ;
      A2251ManPob = "" ;
      A2250ManDom = "" ;
      A2249ManNom = "" ;
      AV78codValidacaoSerie = "" ;
      AV79atcud = "" ;
      AV38FechaAlb = "" ;
      AV48Texto_fd = "" ;
      AV50Firma4dig = "" ;
      AV76TextoGenerar = "" ;
      AV82Centimetos = DecimalUtil.ZERO ;
      AV80Url = "" ;
      AV75Imagen = "" ;
      AV91Imagen_GXI = "" ;
      AV54AtId = "" ;
      AV53SalExtObs = "" ;
      AV55Tot_k = DecimalUtil.ZERO ;
      AV56Tot_mt = DecimalUtil.ZERO ;
      AV58Lasthdr = "" ;
      P056D4_A396EmprCod = new String[] {""} ;
      P056D4_A2253SalExtAlb = new int[1] ;
      P056D4_A6558FasCodn = new String[] {""} ;
      P056D4_A130BarCodPar = new String[] {""} ;
      P056D4_A132BarCodReo = new byte[1] ;
      P056D4_A129BarCod = new int[1] ;
      P056D4_A361DisCod = new int[1] ;
      P056D4_A11662BarOrdComp = new String[] {""} ;
      P056D4_A181BarMaqPro = new String[] {""} ;
      P056D4_A136BarColNum = new int[1] ;
      P056D4_A135BarColNom = new String[] {""} ;
      P056D4_A6257SalExCoE = new int[1] ;
      P056D4_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056D4_A1652BarSerDsc = new String[] {""} ;
      P056D4_A1909BarGraAca = new short[1] ;
      P056D4_A125BarAncAca1 = new short[1] ;
      P056D4_A2829BarProPer = new String[] {""} ;
      P056D4_A143BarDisNum = new String[] {""} ;
      P056D4_A6248SalExNln = new short[1] ;
      A6558FasCodn = "" ;
      A130BarCodPar = "" ;
      A11662BarOrdComp = "" ;
      A181BarMaqPro = "" ;
      A135BarColNom = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A2829BarProPer = "" ;
      A143BarDisNum = "" ;
      AV59Tab_fs = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV59Tab_fs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27FasDsc = "" ;
      GXt_char2 = "" ;
      AV19BarCodPar = "" ;
      AV68PO = "" ;
      AV67Marcadsc = "" ;
      GXv_char4 = new String[1] ;
      AV46vColor = "" ;
      AV21HojaRuta = "" ;
      AV85kgs = DecimalUtil.ZERO ;
      AV69Tab_obs = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV69Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV61Fio5 = "" ;
      AV63Jogo3 = "" ;
      AV65Maq6 = "" ;
      AV62AlbrLote = "" ;
      AV66AlbNumb = "" ;
      P056D6_A44AlbRecCod = new int[1] ;
      P056D6_A396EmprCod = new String[] {""} ;
      P056D6_A130BarCodPar = new String[] {""} ;
      P056D6_A132BarCodReo = new byte[1] ;
      P056D6_A129BarCod = new int[1] ;
      P056D6_A8028AlbNumB = new String[] {""} ;
      P056D6_A6463AlbRLote = new String[] {""} ;
      P056D6_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056D6_A4602AlbRMdlCod = new String[] {""} ;
      P056D6_A6464AlbRTelar = new String[] {""} ;
      P056D6_A8035AlbMaqTej = new String[] {""} ;
      P056D6_A200BarPieCod = new String[] {""} ;
      A8028AlbNumB = "" ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A200BarPieCod = "" ;
      P056D7_A396EmprCod = new String[] {""} ;
      P056D7_A361DisCod = new int[1] ;
      P056D7_A377DisObsTxt = new String[] {""} ;
      P056D7_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV75Imagen = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pmod011__default(),
         new Object[] {
             new Object[] {
            P056D2_A396EmprCod, P056D2_A407EmprNom, P056D2_n407EmprNom, P056D2_A8335EmpItm2, P056D2_n8335EmpItm2, P056D2_A8334EmpItm1, P056D2_n8334EmpItm1, P056D2_A8337EmpItm4, P056D2_n8337EmpItm4, P056D2_A8336EmpItm3,
            P056D2_n8336EmpItm3, P056D2_A395EmprCif, P056D2_n395EmprCif
            }
            , new Object[] {
            P056D3_A3554SalExtObs, P056D3_A396EmprCod, P056D3_A2253SalExtAlb, P056D3_A14348SalExtATCU, P056D3_A10077SalFmd, P056D3_A10742SalCodeID, P056D3_A2258SalExtLis, P056D3_A6396SalExtHor, P056D3_A6397SalExtMat, P056D3_A2256SalExtFec,
            P056D3_A2248ManCod, P056D3_A3302ManNif, P056D3_n3302ManNif, P056D3_A2251ManPob, P056D3_n2251ManPob, P056D3_A2250ManDom, P056D3_n2250ManDom, P056D3_A2249ManNom, P056D3_n2249ManNom
            }
            , new Object[] {
            P056D4_A396EmprCod, P056D4_A2253SalExtAlb, P056D4_A6558FasCodn, P056D4_A130BarCodPar, P056D4_A132BarCodReo, P056D4_A129BarCod, P056D4_A361DisCod, P056D4_A11662BarOrdComp, P056D4_A181BarMaqPro, P056D4_A136BarColNum,
            P056D4_A135BarColNom, P056D4_A6257SalExCoE, P056D4_A6256SalExKgE, P056D4_A1652BarSerDsc, P056D4_A1909BarGraAca, P056D4_A125BarAncAca1, P056D4_A2829BarProPer, P056D4_A143BarDisNum, P056D4_A6248SalExNln
            }
            , new Object[] {
            }
            , new Object[] {
            P056D6_A44AlbRecCod, P056D6_A396EmprCod, P056D6_A130BarCodPar, P056D6_A132BarCodReo, P056D6_A129BarCod, P056D6_A8028AlbNumB, P056D6_A6463AlbRLote, P056D6_A6465AlbRLu, P056D6_A4602AlbRMdlCod, P056D6_A6464AlbRTelar,
            P056D6_A8035AlbMaqTej, P056D6_A200BarPieCod
            }
            , new Object[] {
            P056D7_A396EmprCod, P056D7_A361DisCod, P056D7_A377DisObsTxt, P056D7_A376DisObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV71PQrcode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A2258SalExtLis ;
   private byte AV23Mes ;
   private byte AV22Dia ;
   private byte A132BarCodReo ;
   private byte AV18BarCodReo ;
   private byte AV64Pgadas ;
   private byte A376DisObsLin ;
   private short gxcookieaux ;
   private short A2248ManCod ;
   private short AV24Anyo ;
   private short AV81Dpi ;
   private short AV83Pixel ;
   private short AV29Cantidad ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A6248SalExNln ;
   private short AV60i ;
   private short AV57Pzs ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A6257SalExCoE ;
   private int GX_I ;
   private int AV17BarCod ;
   private int AV70Discod ;
   private int Gx_OldLine ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV82Centimetos ;
   private java.math.BigDecimal AV55Tot_k ;
   private java.math.BigDecimal AV56Tot_mt ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal AV85kgs ;
   private java.math.BigDecimal A6465AlbRLu ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV47TextoCopia ;
   private String AV45ContDsc ;
   private String AV49FirmaD ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV31EmprNom ;
   private String AV51Texto_1 ;
   private String AV52Texto_2 ;
   private String AV77EmprCif ;
   private String A14348SalExtATCU ;
   private String A10077SalFmd ;
   private String A10742SalCodeID ;
   private String A6396SalExtHor ;
   private String A6397SalExtMat ;
   private String A3302ManNif ;
   private String A2251ManPob ;
   private String A2250ManDom ;
   private String A2249ManNom ;
   private String AV78codValidacaoSerie ;
   private String AV79atcud ;
   private String AV38FechaAlb ;
   private String AV48Texto_fd ;
   private String AV50Firma4dig ;
   private String AV54AtId ;
   private String AV58Lasthdr ;
   private String A6558FasCodn ;
   private String A130BarCodPar ;
   private String A181BarMaqPro ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A2829BarProPer ;
   private String A143BarDisNum ;
   private String AV59Tab_fs[] ;
   private String AV27FasDsc ;
   private String GXt_char2 ;
   private String AV19BarCodPar ;
   private String AV68PO ;
   private String AV67Marcadsc ;
   private String GXv_char4[] ;
   private String AV46vColor ;
   private String AV21HojaRuta ;
   private String AV69Tab_obs[] ;
   private String AV61Fio5 ;
   private String AV63Jogo3 ;
   private String AV65Maq6 ;
   private String AV62AlbrLote ;
   private String AV66AlbNumb ;
   private String A8028AlbNumB ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String A200BarPieCod ;
   private String A377DisObsTxt ;
   private String sImgUrl ;
   private java.util.Date A2256SalExtFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean GxHdr3 ;
   private boolean n3302ManNif ;
   private boolean n2251ManPob ;
   private boolean n2250ManDom ;
   private boolean n2249ManNom ;
   private boolean brk56D5 ;
   private boolean returnInSub ;
   private String A3554SalExtObs ;
   private String AV53SalExtObs ;
   private String AV76TextoGenerar ;
   private String AV80Url ;
   private String AV91Imagen_GXI ;
   private String A11662BarOrdComp ;
   private String AV75Imagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P056D2_A396EmprCod ;
   private String[] P056D2_A407EmprNom ;
   private boolean[] P056D2_n407EmprNom ;
   private String[] P056D2_A8335EmpItm2 ;
   private boolean[] P056D2_n8335EmpItm2 ;
   private String[] P056D2_A8334EmpItm1 ;
   private boolean[] P056D2_n8334EmpItm1 ;
   private String[] P056D2_A8337EmpItm4 ;
   private boolean[] P056D2_n8337EmpItm4 ;
   private String[] P056D2_A8336EmpItm3 ;
   private boolean[] P056D2_n8336EmpItm3 ;
   private String[] P056D2_A395EmprCif ;
   private boolean[] P056D2_n395EmprCif ;
   private String[] P056D3_A3554SalExtObs ;
   private String[] P056D3_A396EmprCod ;
   private int[] P056D3_A2253SalExtAlb ;
   private String[] P056D3_A14348SalExtATCU ;
   private String[] P056D3_A10077SalFmd ;
   private String[] P056D3_A10742SalCodeID ;
   private byte[] P056D3_A2258SalExtLis ;
   private String[] P056D3_A6396SalExtHor ;
   private String[] P056D3_A6397SalExtMat ;
   private java.util.Date[] P056D3_A2256SalExtFec ;
   private short[] P056D3_A2248ManCod ;
   private String[] P056D3_A3302ManNif ;
   private boolean[] P056D3_n3302ManNif ;
   private String[] P056D3_A2251ManPob ;
   private boolean[] P056D3_n2251ManPob ;
   private String[] P056D3_A2250ManDom ;
   private boolean[] P056D3_n2250ManDom ;
   private String[] P056D3_A2249ManNom ;
   private boolean[] P056D3_n2249ManNom ;
   private String[] P056D4_A396EmprCod ;
   private int[] P056D4_A2253SalExtAlb ;
   private String[] P056D4_A6558FasCodn ;
   private String[] P056D4_A130BarCodPar ;
   private byte[] P056D4_A132BarCodReo ;
   private int[] P056D4_A129BarCod ;
   private int[] P056D4_A361DisCod ;
   private String[] P056D4_A11662BarOrdComp ;
   private String[] P056D4_A181BarMaqPro ;
   private int[] P056D4_A136BarColNum ;
   private String[] P056D4_A135BarColNom ;
   private int[] P056D4_A6257SalExCoE ;
   private java.math.BigDecimal[] P056D4_A6256SalExKgE ;
   private String[] P056D4_A1652BarSerDsc ;
   private short[] P056D4_A1909BarGraAca ;
   private short[] P056D4_A125BarAncAca1 ;
   private String[] P056D4_A2829BarProPer ;
   private String[] P056D4_A143BarDisNum ;
   private short[] P056D4_A6248SalExNln ;
   private int[] P056D6_A44AlbRecCod ;
   private String[] P056D6_A396EmprCod ;
   private String[] P056D6_A130BarCodPar ;
   private byte[] P056D6_A132BarCodReo ;
   private int[] P056D6_A129BarCod ;
   private String[] P056D6_A8028AlbNumB ;
   private String[] P056D6_A6463AlbRLote ;
   private java.math.BigDecimal[] P056D6_A6465AlbRLu ;
   private String[] P056D6_A4602AlbRMdlCod ;
   private String[] P056D6_A6464AlbRTelar ;
   private String[] P056D6_A8035AlbMaqTej ;
   private String[] P056D6_A200BarPieCod ;
   private String[] P056D7_A396EmprCod ;
   private int[] P056D7_A361DisCod ;
   private String[] P056D7_A377DisObsTxt ;
   private byte[] P056D7_A376DisObsLin ;
}

final  class pmod011__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P056D2", "SELECT EmprCod, EmprNom, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056D3", "SELECT T1.SalExtObs, T1.EmprCod, T1.SalExtAlb, T1.SalExtATCU, T1.SalFmd, T1.SalCodeID, T1.SalExtLis, T1.SalExtHor, T1.SalExtMat, T1.SalExtFec, T1.ManCod, T2.ManNif, T2.ManPob, T2.ManDom, T2.ManNom FROM (TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb  FOR UPDATE OF T1.SalExtLis NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056D4", "SELECT T1.EmprCod, T1.SalExtAlb, T1.FasCodn, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisCod, T2.BarOrdComp, T2.BarMaqPro, T2.BarColNum, T2.BarColNom, T1.SalExCoE, T1.SalExKgE, T2.BarSerDsc, T2.BarGraAca, T2.BarAncAca1, T2.BarProPer, T2.BarDisNum, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P056D5", "UPDATE TXPCEXTSA SET SalExtLis=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new ForEachCursor("P056D6", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbNumB, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056D7", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 34);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 26);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((String[]) buf[11])[0] = rslt.getString(12, 9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

