package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pmod0113 extends GXReport
{
   public pmod0113( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmod0113.class ), "" );
   }

   public pmod0113( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pmod0113.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pmod0113.this.AV66ReportInPut = aP0;
      pmod0113.this.A396EmprCod = aP1;
      pmod0113.this.A2253SalExtAlb = aP2;
      pmod0113.this.AV48ImpCod = aP3[0];
      this.aP3 = aP3;
      pmod0113.this.AV74TextoCopia = aP4[0];
      this.aP4 = aP4;
      pmod0113.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      initialize();
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
      getPrinter().GxSetDocName(AV66ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11923, 0, 1, 1, 0, 1, 1) )
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
         GXv_char1[0] = AV24ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD000", ""), GXv_char1) ;
         pmod0113.this.AV24ContDsc = GXv_char1[0] ;
         GXt_char2 = AV44FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pmod0113.this.A396EmprCod = GXv_char1[0] ;
         pmod0113.this.GXt_char2 = GXv_char4[0] ;
         AV44FirmaD = GXt_char2 ;
         GXt_int5 = AV64PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pmod0113.this.GXt_int5 = GXv_int6[0] ;
         AV64PQrcode = GXt_int5 ;
         /* Using cursor P0ALO2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0ALO2_A407EmprNom[0] ;
            n407EmprNom = P0ALO2_n407EmprNom[0] ;
            A8335EmpItm2 = P0ALO2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0ALO2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0ALO2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0ALO2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0ALO2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0ALO2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0ALO2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0ALO2_n8336EmpItm3[0] ;
            A395EmprCif = P0ALO2_A395EmprCif[0] ;
            n395EmprCif = P0ALO2_n395EmprCif[0] ;
            AV36EmprNom = A407EmprNom ;
            AV71Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV72Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV31EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P0ALO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3554SalExtObs = P0ALO3_A3554SalExtObs[0] ;
            A14348SalExtATCU = P0ALO3_A14348SalExtATCU[0] ;
            A10080SalSts = P0ALO3_A10080SalSts[0] ;
            A2256SalExtFec = P0ALO3_A2256SalExtFec[0] ;
            A10077SalFmd = P0ALO3_A10077SalFmd[0] ;
            A10743ManCp2 = P0ALO3_A10743ManCp2[0] ;
            n10743ManCp2 = P0ALO3_n10743ManCp2[0] ;
            A2252ManCpo = P0ALO3_A2252ManCpo[0] ;
            n2252ManCpo = P0ALO3_n2252ManCpo[0] ;
            A14349SalExtSerA = P0ALO3_A14349SalExtSerA[0] ;
            A14350SalExtTipA = P0ALO3_A14350SalExtTipA[0] ;
            A14398SalFecSal = P0ALO3_A14398SalFecSal[0] ;
            A10742SalCodeID = P0ALO3_A10742SalCodeID[0] ;
            A2258SalExtLis = P0ALO3_A2258SalExtLis[0] ;
            A10741SalEnvAT = P0ALO3_A10741SalEnvAT[0] ;
            A6396SalExtHor = P0ALO3_A6396SalExtHor[0] ;
            A6397SalExtMat = P0ALO3_A6397SalExtMat[0] ;
            A2248ManCod = P0ALO3_A2248ManCod[0] ;
            A3302ManNif = P0ALO3_A3302ManNif[0] ;
            n3302ManNif = P0ALO3_n3302ManNif[0] ;
            A2251ManPob = P0ALO3_A2251ManPob[0] ;
            n2251ManPob = P0ALO3_n2251ManPob[0] ;
            A2250ManDom = P0ALO3_A2250ManDom[0] ;
            n2250ManDom = P0ALO3_n2250ManDom[0] ;
            A2249ManNom = P0ALO3_A2249ManNom[0] ;
            n2249ManNom = P0ALO3_n2249ManNom[0] ;
            A10743ManCp2 = P0ALO3_A10743ManCp2[0] ;
            n10743ManCp2 = P0ALO3_n10743ManCp2[0] ;
            A2252ManCpo = P0ALO3_A2252ManCpo[0] ;
            n2252ManCpo = P0ALO3_n2252ManCpo[0] ;
            A3302ManNif = P0ALO3_A3302ManNif[0] ;
            n3302ManNif = P0ALO3_n3302ManNif[0] ;
            A2251ManPob = P0ALO3_A2251ManPob[0] ;
            n2251ManPob = P0ALO3_n2251ManPob[0] ;
            A2250ManDom = P0ALO3_A2250ManDom[0] ;
            n2250ManDom = P0ALO3_n2250ManDom[0] ;
            A2249ManNom = P0ALO3_A2249ManNom[0] ;
            n2249ManNom = P0ALO3_n2249ManNom[0] ;
            AV90Clicod = A2248ManCod ;
            AV23codValidacaoSerie = A14348SalExtATCU ;
            AV12atcud = ((GXutil.strcmp("", AV23codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV23codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0))) ;
            AV87TextoAnulado = ((GXutil.strcmp(A10080SalSts, "A")==0) ? httpContext.getMessage( "ANULADO", "") : " ") ;
            AV41FechaAlb = GXutil.str( GXutil.day( A2256SalExtFec), 2, 0) + httpContext.getMessage( " de ", "") + localUtil.cmonth( A2256SalExtFec, httpContext.getMessage( "por", "")) + httpContext.getMessage( " de ", "") + GXutil.str( GXutil.year( A2256SalExtFec), 4, 0) ;
            AV73Texto_fd = " " ;
            if ( GXutil.strcmp(A10077SalFmd, " ") != 0 )
            {
               AV43Firma4dig = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
               AV73Texto_fd = AV43Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV44FirmaD) ;
            }
            else
            {
               AV73Texto_fd = httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            AV22codigopostal = GXutil.trim( A2252ManCpo) + "-" + GXutil.trim( A10743ManCp2) ;
            AV29documento = GXutil.trim( A14350SalExtTipA) + " " + GXutil.trim( A14349SalExtSerA) + "/" + GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0)) ;
            AV11Anyo = (short)(GXutil.year( A14398SalFecSal)) ;
            AV56Mes = (byte)(GXutil.month( A14398SalFecSal)) ;
            AV26Dia = (byte)(GXutil.day( A14398SalFecSal)) ;
            AV27DiaCargaalfa = GXutil.str( AV11Anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV56Mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV26Dia, 2, 0)), (short)(2), "0") ;
            AV8DevCruFec = A2256SalExtFec ;
            AV11Anyo = (short)(GXutil.year( A2256SalExtFec)) ;
            AV56Mes = (byte)(GXutil.month( A2256SalExtFec)) ;
            AV26Dia = (byte)(GXutil.day( A2256SalExtFec)) ;
            AV25DevCruFecalfa = GXutil.str( AV11Anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV56Mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV26Dia, 2, 0)), (short)(2), "0") ;
            AV75TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV31EmprCif) + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A3302ManNif) + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "D:", "") + GXutil.trim( A14350SalExtTipA) + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV11Anyo = (short)(GXutil.year( A2256SalExtFec)) ;
            AV56Mes = (byte)(GXutil.month( A2256SalExtFec)) ;
            AV26Dia = (byte)(GXutil.day( A2256SalExtFec)) ;
            AV75TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV11Anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV56Mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV26Dia, 2, 0)), (short)(2), "0") + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "G:", "") + GXutil.trim( A14350SalExtTipA) + " " + GXutil.trim( A14349SalExtSerA) + "/" + GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0)) + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "H:", "") + GXutil.trim( A14348SalExtATCU) + "-" + GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0)) + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "Q:", "") + AV43Firma4dig + "*" ;
            AV75TextoGenerar += httpContext.getMessage( "R:", "") + "1208" ;
            AV30Dpi = (short)(300) ;
            AV19Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV62Pixel = (short)(DecimalUtil.decToDouble(AV19Centimetos.multiply(DecimalUtil.doubleToDec(AV30Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV83Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV75TextoGenerar, AV62Pixel, AV62Pixel, GXv_char4) ;
            pmod0113.this.GXt_char2 = GXv_char4[0] ;
            AV83Url = GXt_char2 ;
            AV47Imagen = AV83Url ;
            AV96Imagen_GXI = GXDbFile.pathToUrl( AV83Url, context.getHttpContext()) ;
            AV13AtId = " " ;
            if ( GXutil.strcmp(A10742SalCodeID, " ") != 0 )
            {
               AV13AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A10742SalCodeID, 1, 12)) ;
            }
            AV68SalExtObs = A3554SalExtObs ;
            AV18Cantidad = (short)(0) ;
            AV79Tot_k = DecimalUtil.doubleToDec(0) ;
            AV80Tot_mt = DecimalUtil.doubleToDec(0) ;
            AV51Lasthdr = " " ;
            /* Using cursor P0ALO4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               brkALO5 = false ;
               A6558FasCodn = P0ALO4_A6558FasCodn[0] ;
               A130BarCodPar = P0ALO4_A130BarCodPar[0] ;
               A132BarCodReo = P0ALO4_A132BarCodReo[0] ;
               A129BarCod = P0ALO4_A129BarCod[0] ;
               A361DisCod = P0ALO4_A361DisCod[0] ;
               A11662BarOrdComp = P0ALO4_A11662BarOrdComp[0] ;
               A181BarMaqPro = P0ALO4_A181BarMaqPro[0] ;
               A136BarColNum = P0ALO4_A136BarColNum[0] ;
               A135BarColNom = P0ALO4_A135BarColNom[0] ;
               A6257SalExCoE = P0ALO4_A6257SalExCoE[0] ;
               A6256SalExKgE = P0ALO4_A6256SalExKgE[0] ;
               A1652BarSerDsc = P0ALO4_A1652BarSerDsc[0] ;
               A1909BarGraAca = P0ALO4_A1909BarGraAca[0] ;
               A125BarAncAca1 = P0ALO4_A125BarAncAca1[0] ;
               A2829BarProPer = P0ALO4_A2829BarProPer[0] ;
               A143BarDisNum = P0ALO4_A143BarDisNum[0] ;
               A6248SalExNln = P0ALO4_A6248SalExNln[0] ;
               A361DisCod = P0ALO4_A361DisCod[0] ;
               A11662BarOrdComp = P0ALO4_A11662BarOrdComp[0] ;
               A181BarMaqPro = P0ALO4_A181BarMaqPro[0] ;
               A136BarColNum = P0ALO4_A136BarColNum[0] ;
               A135BarColNom = P0ALO4_A135BarColNom[0] ;
               A1652BarSerDsc = P0ALO4_A1652BarSerDsc[0] ;
               A1909BarGraAca = P0ALO4_A1909BarGraAca[0] ;
               A125BarAncAca1 = P0ALO4_A125BarAncAca1[0] ;
               A2829BarProPer = P0ALO4_A2829BarProPer[0] ;
               A143BarDisNum = P0ALO4_A143BarDisNum[0] ;
               GX_I = 1 ;
               while ( GX_I <= 100 )
               {
                  AV69Tab_fs[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               AV46i = (short)(1) ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ALO4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ALO4_A2253SalExtAlb[0] == A2253SalExtAlb ) && ( P0ALO4_A129BarCod[0] == A129BarCod ) && ( P0ALO4_A132BarCodReo[0] == A132BarCodReo ) )
               {
                  if ( ! ( ( GXutil.strcmp(P0ALO4_A130BarCodPar[0], A130BarCodPar) == 0 ) ) )
                  {
                     if (true) break;
                  }
                  brkALO5 = false ;
                  A6558FasCodn = P0ALO4_A6558FasCodn[0] ;
                  A6248SalExNln = P0ALO4_A6248SalExNln[0] ;
                  GXt_char2 = AV40FasDsc ;
                  GXv_char4[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A6558FasCodn, GXv_char4) ;
                  pmod0113.this.GXt_char2 = GXv_char4[0] ;
                  AV40FasDsc = GXt_char2 ;
                  AV69Tab_fs[AV46i-1] = GXutil.substring( AV40FasDsc, 1, 20) ;
                  AV46i = (short)(AV46i+1) ;
                  brkALO5 = true ;
                  pr_default.readNext(2);
               }
               AV14BarCod = A129BarCod ;
               AV16BarCodReo = A132BarCodReo ;
               AV15BarCodPar = A130BarCodPar ;
               AV28Discod = A361DisCod ;
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
               AV63PO = GXutil.substring( A11662BarOrdComp, 1, 20) ;
               GXv_char4[0] = AV55Marcadsc ;
               new app.pmarcacliente(remoteHandle, context).execute( A396EmprCod, A181BarMaqPro, GXv_char4) ;
               pmod0113.this.AV55Marcadsc = GXv_char4[0] ;
               AV84vColor = A135BarColNom + GXutil.str( A136BarColNum, 6, 0) ;
               AV45HojaRuta = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               AV65Pzs = (short)(A6257SalExCoE) ;
               AV50kgs = A6256SalExKgE ;
               hALO0( false, 19) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45HojaRuta, "")), 11, Gx_line+1, 92, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 100, Gx_line+1, 291, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50kgs, "ZZZ9.99")), 294, Gx_line+0, 346, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV65Pzs), "ZZZ9")), 365, Gx_line+0, 395, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_fs[1-1], "")), 403, Gx_line+1, 508, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Tab_obs[1-1], "")), 516, Gx_line+3, 777, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 350, Gx_line+0, 366, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               hALO0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84vColor, "")), 34, Gx_line+0, 160, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 11, Gx_line+0, 29, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_fs[2-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Tab_obs[2-1], "")), 516, Gx_line+1, 777, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hALO0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Acabamento Largura:", ""), 11, Gx_line+1, 117, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 120, Gx_line+1, 140, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gram:", ""), 146, Gx_line+1, 177, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 182, Gx_line+1, 208, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_fs[3-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Tab_obs[3-1], "")), 516, Gx_line+3, 777, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hALO0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FIO:", ""), 11, Gx_line+0, 31, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Fio5, "")), 31, Gx_line+0, 84, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_fs[4-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Jogo3, "")), 120, Gx_line+0, 152, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "JOGO:", ""), 89, Gx_line+0, 119, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("\"", 172, Gx_line+0, 177, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61Pgadas), "Z9")), 156, Gx_line+0, 170, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Maq6, "")), 220, Gx_line+0, 263, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MAQ:", ""), 188, Gx_line+0, 215, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10AlbrLote, "")), 303, Gx_line+0, 398, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote:", ""), 271, Gx_line+0, 297, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Tab_obs[4-1], "")), 516, Gx_line+0, 777, Gx_line+13, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hALO0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R.comp:", ""), 11, Gx_line+0, 52, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9AlbNumb, "")), 52, Gx_line+0, 178, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2829BarProPer, "")), 203, Gx_line+0, 287, Gx_line+15, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Tab_fs[5-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hALO0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Po:", ""), 11, Gx_line+0, 28, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63PO, "")), 52, Gx_line+0, 178, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hALO0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 11, Gx_line+0, 46, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Marcadsc, "")), 52, Gx_line+0, 241, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hALO0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Doc Cliente:", ""), 11, Gx_line+1, 71, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 73, Gx_line+0, 157, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hALO0( false, 7) ;
               getPrinter().GxDrawLine(4, Gx_line+4, 779, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+7) ;
               if ( ! brkALO5 )
               {
                  brkALO5 = true ;
                  pr_default.readNext(2);
               }
            }
            pr_default.close(2);
            if ( A2258SalExtLis == 0 )
            {
               A2258SalExtLis = (byte)(1) ;
            }
            /* Using cursor P0ALO5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A2258SalExtLis), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         AV89WEBSession.setValue(httpContext.getMessage( "PMOD0112_Clicod", ""), localUtil.format( DecimalUtil.doubleToDec(AV90Clicod), "ZZZZZ9"));
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hALO0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      /* Using cursor P0ALO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV16BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A44AlbRecCod = P0ALO6_A44AlbRecCod[0] ;
         A130BarCodPar = P0ALO6_A130BarCodPar[0] ;
         A132BarCodReo = P0ALO6_A132BarCodReo[0] ;
         A129BarCod = P0ALO6_A129BarCod[0] ;
         A8028AlbNumB = P0ALO6_A8028AlbNumB[0] ;
         A6463AlbRLote = P0ALO6_A6463AlbRLote[0] ;
         A6465AlbRLu = P0ALO6_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0ALO6_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0ALO6_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0ALO6_A8035AlbMaqTej[0] ;
         A200BarPieCod = P0ALO6_A200BarPieCod[0] ;
         A8028AlbNumB = P0ALO6_A8028AlbNumB[0] ;
         A6463AlbRLote = P0ALO6_A6463AlbRLote[0] ;
         A6465AlbRLu = P0ALO6_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0ALO6_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0ALO6_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0ALO6_A8035AlbMaqTej[0] ;
         AV9AlbNumb = A8028AlbNumB ;
         AV10AlbrLote = A6463AlbRLote ;
         AV61Pgadas = (byte)(DecimalUtil.decToDouble(A6465AlbRLu)) ;
         AV49Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
         AV42Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
         AV53Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV70Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV46i = (short)(1) ;
      AV102GXLvl183 = (byte)(0) ;
      /* Using cursor P0ALO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(AV14BarCod), Byte.valueOf(AV16BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = P0ALO7_A130BarCodPar[0] ;
         A132BarCodReo = P0ALO7_A132BarCodReo[0] ;
         A129BarCod = P0ALO7_A129BarCod[0] ;
         A6249SalExObs = P0ALO7_A6249SalExObs[0] ;
         A6248SalExNln = P0ALO7_A6248SalExNln[0] ;
         AV102GXLvl183 = (byte)(1) ;
         AV70Tab_obs[AV46i-1] = GXutil.trim( A6249SalExObs) ;
         AV46i = (short)(AV46i+1) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( AV102GXLvl183 == 0 )
      {
         System.out.println( httpContext.getMessage( "Not found obs ", "") );
      }
   }

   public void hALO0( boolean bFoot ,
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
               getPrinter().GxDrawLine(16, Gx_line+66, 789, Gx_line+66, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ContDsc, "")), 726, Gx_line+53, 790, Gx_line+66, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Texto_1, "")), 68, Gx_line+82, 736, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Texto_2, "")), 89, Gx_line+100, 715, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 40, Gx_line+5, 125, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(AV68SalExtObs, 132, Gx_line+5, 753, Gx_line+44, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Este documento não serve de fatura", ""), 313, Gx_line+69, 491, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76textoNOAT, "")), 439, Gx_line+53, 716, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13AtId, "")), 298, Gx_line+53, 429, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Texto_fd, "")), 16, Gx_line+53, 288, Gx_line+66, 0+256, 0, 0, 0) ;
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
               AV67RutaImagenMarcaAgua = "" ;
               AV76textoNOAT = "" ;
               if ( (0==A10741SalEnvAT) )
               {
                  AV76textoNOAT = httpContext.getMessage( "Este documento não serve de documento de transporte", "") ;
               }
               if ( A10741SalEnvAT == 0 )
               {
                  AV54MarcaAguaImagen = context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )) ;
                  AV97Marcaaguaimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
                  sImgUrl = ((GXutil.strcmp("", AV54MarcaAguaImagen)==0) ? AV97Marcaaguaimagen_GXI : AV54MarcaAguaImagen) ;
                  getPrinter().GxDrawBitMap(sImgUrl, 14, Gx_line+1, 815, Gx_line+1052) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1068) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               else
               {
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1052) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia de Transporte Nº", ""), 392, Gx_line+190, 567, Gx_line+210, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(398, Gx_line+244, 765, Gx_line+335, 1, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2249ManNom, "")), 422, Gx_line+250, 611, Gx_line+268, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2250ManDom, "")), 422, Gx_line+282, 636, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2251ManPob, "")), 517, Gx_line+317, 706, Gx_line+335, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3302ManNif, "@!")), 570, Gx_line+350, 675, Gx_line+367, 0+256, 0, 0, 0) ;
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TextoCopia, "")), 680, Gx_line+219, 759, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 22, Gx_line+5, 779, Gx_line+91) ;
               getPrinter().GxDrawRect(4, Gx_line+344, 779, Gx_line+424, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 29, Gx_line+353, 90, Gx_line+369, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 29, Gx_line+371, 121, Gx_line+387, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 29, Gx_line+389, 130, Gx_line+405, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 29, Gx_line+405, 99, Gx_line+421, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Contibuinte:", ""), 442, Gx_line+350, 525, Gx_line+366, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 442, Gx_line+368, 554, Gx_line+384, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 442, Gx_line+402, 497, Gx_line+418, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")), 142, Gx_line+353, 172, Gx_line+370, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 142, Gx_line+371, 225, Gx_line+387, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalaçoes", ""), 570, Gx_line+368, 651, Gx_line+384, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6397SalExtMat, "")), 511, Gx_line+402, 616, Gx_line+419, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6396SalExtHor, "")), 300, Gx_line+405, 393, Gx_line+422, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 265, Gx_line+405, 297, Gx_line+421, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV47Imagen)==0) ? AV96Imagen_GXI : AV47Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 217, Gx_line+167, 350, Gx_line+305) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12atcud, "")), 205, Gx_line+148, 362, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29documento, "")), 592, Gx_line+190, 760, Gx_line+211, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22codigopostal, "")), 425, Gx_line+317, 489, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina:", ""), 625, Gx_line+402, 662, Gx_line+417, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 667, Gx_line+402, 706, Gx_line+418, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 714, Gx_line+402, 718, Gx_line+417, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 726, Gx_line+402, 775, Gx_line+417, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25DevCruFecalfa, "")), 142, Gx_line+389, 247, Gx_line+406, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27DiaCargaalfa, "")), 142, Gx_line+405, 247, Gx_line+422, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87TextoAnulado, "")), 417, Gx_line+117, 731, Gx_line+157, 0+256, 0, 0, 0) ;
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
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP3[0] = pmod0113.this.AV48ImpCod;
      this.aP4[0] = pmod0113.this.AV74TextoCopia;
      this.aP5[0] = pmod0113.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.pmod0113");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24ContDsc = "" ;
      AV44FirmaD = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P0ALO2_A396EmprCod = new String[] {""} ;
      P0ALO2_A407EmprNom = new String[] {""} ;
      P0ALO2_n407EmprNom = new boolean[] {false} ;
      P0ALO2_A8335EmpItm2 = new String[] {""} ;
      P0ALO2_n8335EmpItm2 = new boolean[] {false} ;
      P0ALO2_A8334EmpItm1 = new String[] {""} ;
      P0ALO2_n8334EmpItm1 = new boolean[] {false} ;
      P0ALO2_A8337EmpItm4 = new String[] {""} ;
      P0ALO2_n8337EmpItm4 = new boolean[] {false} ;
      P0ALO2_A8336EmpItm3 = new String[] {""} ;
      P0ALO2_n8336EmpItm3 = new boolean[] {false} ;
      P0ALO2_A395EmprCif = new String[] {""} ;
      P0ALO2_n395EmprCif = new boolean[] {false} ;
      A407EmprNom = "" ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV36EmprNom = "" ;
      AV71Texto_1 = "" ;
      AV72Texto_2 = "" ;
      AV31EmprCif = "" ;
      P0ALO3_A3554SalExtObs = new String[] {""} ;
      P0ALO3_A396EmprCod = new String[] {""} ;
      P0ALO3_A2253SalExtAlb = new int[1] ;
      P0ALO3_A14348SalExtATCU = new String[] {""} ;
      P0ALO3_A10080SalSts = new String[] {""} ;
      P0ALO3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ALO3_A10077SalFmd = new String[] {""} ;
      P0ALO3_A10743ManCp2 = new String[] {""} ;
      P0ALO3_n10743ManCp2 = new boolean[] {false} ;
      P0ALO3_A2252ManCpo = new String[] {""} ;
      P0ALO3_n2252ManCpo = new boolean[] {false} ;
      P0ALO3_A14349SalExtSerA = new String[] {""} ;
      P0ALO3_A14350SalExtTipA = new String[] {""} ;
      P0ALO3_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ALO3_A10742SalCodeID = new String[] {""} ;
      P0ALO3_A2258SalExtLis = new byte[1] ;
      P0ALO3_A10741SalEnvAT = new byte[1] ;
      P0ALO3_A6396SalExtHor = new String[] {""} ;
      P0ALO3_A6397SalExtMat = new String[] {""} ;
      P0ALO3_A2248ManCod = new short[1] ;
      P0ALO3_A3302ManNif = new String[] {""} ;
      P0ALO3_n3302ManNif = new boolean[] {false} ;
      P0ALO3_A2251ManPob = new String[] {""} ;
      P0ALO3_n2251ManPob = new boolean[] {false} ;
      P0ALO3_A2250ManDom = new String[] {""} ;
      P0ALO3_n2250ManDom = new boolean[] {false} ;
      P0ALO3_A2249ManNom = new String[] {""} ;
      P0ALO3_n2249ManNom = new boolean[] {false} ;
      A3554SalExtObs = "" ;
      A14348SalExtATCU = "" ;
      A10080SalSts = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10077SalFmd = "" ;
      A10743ManCp2 = "" ;
      A2252ManCpo = "" ;
      A14349SalExtSerA = "" ;
      A14350SalExtTipA = "" ;
      A14398SalFecSal = GXutil.nullDate() ;
      A10742SalCodeID = "" ;
      A6396SalExtHor = "" ;
      A6397SalExtMat = "" ;
      A3302ManNif = "" ;
      A2251ManPob = "" ;
      A2250ManDom = "" ;
      A2249ManNom = "" ;
      AV23codValidacaoSerie = "" ;
      AV12atcud = "" ;
      AV87TextoAnulado = "" ;
      AV41FechaAlb = "" ;
      AV73Texto_fd = "" ;
      AV43Firma4dig = "" ;
      AV22codigopostal = "" ;
      AV29documento = "" ;
      AV27DiaCargaalfa = "" ;
      AV8DevCruFec = GXutil.nullDate() ;
      AV25DevCruFecalfa = "" ;
      AV75TextoGenerar = "" ;
      AV19Centimetos = DecimalUtil.ZERO ;
      AV83Url = "" ;
      AV47Imagen = "" ;
      AV96Imagen_GXI = "" ;
      AV13AtId = "" ;
      AV68SalExtObs = "" ;
      AV79Tot_k = DecimalUtil.ZERO ;
      AV80Tot_mt = DecimalUtil.ZERO ;
      AV51Lasthdr = "" ;
      P0ALO4_A396EmprCod = new String[] {""} ;
      P0ALO4_A2253SalExtAlb = new int[1] ;
      P0ALO4_A6558FasCodn = new String[] {""} ;
      P0ALO4_A130BarCodPar = new String[] {""} ;
      P0ALO4_A132BarCodReo = new byte[1] ;
      P0ALO4_A129BarCod = new int[1] ;
      P0ALO4_A361DisCod = new int[1] ;
      P0ALO4_A11662BarOrdComp = new String[] {""} ;
      P0ALO4_A181BarMaqPro = new String[] {""} ;
      P0ALO4_A136BarColNum = new int[1] ;
      P0ALO4_A135BarColNom = new String[] {""} ;
      P0ALO4_A6257SalExCoE = new int[1] ;
      P0ALO4_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALO4_A1652BarSerDsc = new String[] {""} ;
      P0ALO4_A1909BarGraAca = new short[1] ;
      P0ALO4_A125BarAncAca1 = new short[1] ;
      P0ALO4_A2829BarProPer = new String[] {""} ;
      P0ALO4_A143BarDisNum = new String[] {""} ;
      P0ALO4_A6248SalExNln = new short[1] ;
      A6558FasCodn = "" ;
      A130BarCodPar = "" ;
      A11662BarOrdComp = "" ;
      A181BarMaqPro = "" ;
      A135BarColNom = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A2829BarProPer = "" ;
      A143BarDisNum = "" ;
      AV69Tab_fs = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV69Tab_fs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV40FasDsc = "" ;
      GXt_char2 = "" ;
      AV15BarCodPar = "" ;
      AV63PO = "" ;
      AV55Marcadsc = "" ;
      GXv_char4 = new String[1] ;
      AV84vColor = "" ;
      AV45HojaRuta = "" ;
      AV50kgs = DecimalUtil.ZERO ;
      AV70Tab_obs = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV70Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV42Fio5 = "" ;
      AV49Jogo3 = "" ;
      AV53Maq6 = "" ;
      AV10AlbrLote = "" ;
      AV9AlbNumb = "" ;
      AV89WEBSession = httpContext.getWebSession();
      A6249SalExObs = "" ;
      P0ALO6_A44AlbRecCod = new int[1] ;
      P0ALO6_A396EmprCod = new String[] {""} ;
      P0ALO6_A130BarCodPar = new String[] {""} ;
      P0ALO6_A132BarCodReo = new byte[1] ;
      P0ALO6_A129BarCod = new int[1] ;
      P0ALO6_A8028AlbNumB = new String[] {""} ;
      P0ALO6_A6463AlbRLote = new String[] {""} ;
      P0ALO6_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALO6_A4602AlbRMdlCod = new String[] {""} ;
      P0ALO6_A6464AlbRTelar = new String[] {""} ;
      P0ALO6_A8035AlbMaqTej = new String[] {""} ;
      P0ALO6_A200BarPieCod = new String[] {""} ;
      A8028AlbNumB = "" ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A200BarPieCod = "" ;
      P0ALO7_A396EmprCod = new String[] {""} ;
      P0ALO7_A2253SalExtAlb = new int[1] ;
      P0ALO7_A130BarCodPar = new String[] {""} ;
      P0ALO7_A132BarCodReo = new byte[1] ;
      P0ALO7_A129BarCod = new int[1] ;
      P0ALO7_A6249SalExObs = new String[] {""} ;
      P0ALO7_A6248SalExNln = new short[1] ;
      AV76textoNOAT = "" ;
      AV67RutaImagenMarcaAgua = "" ;
      AV54MarcaAguaImagen = "" ;
      AV97Marcaaguaimagen_GXI = "" ;
      AV54MarcaAguaImagen = "" ;
      sImgUrl = "" ;
      AV47Imagen = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pmod0113__default(),
         new Object[] {
             new Object[] {
            P0ALO2_A396EmprCod, P0ALO2_A407EmprNom, P0ALO2_n407EmprNom, P0ALO2_A8335EmpItm2, P0ALO2_n8335EmpItm2, P0ALO2_A8334EmpItm1, P0ALO2_n8334EmpItm1, P0ALO2_A8337EmpItm4, P0ALO2_n8337EmpItm4, P0ALO2_A8336EmpItm3,
            P0ALO2_n8336EmpItm3, P0ALO2_A395EmprCif, P0ALO2_n395EmprCif
            }
            , new Object[] {
            P0ALO3_A3554SalExtObs, P0ALO3_A396EmprCod, P0ALO3_A2253SalExtAlb, P0ALO3_A14348SalExtATCU, P0ALO3_A10080SalSts, P0ALO3_A2256SalExtFec, P0ALO3_A10077SalFmd, P0ALO3_A10743ManCp2, P0ALO3_n10743ManCp2, P0ALO3_A2252ManCpo,
            P0ALO3_n2252ManCpo, P0ALO3_A14349SalExtSerA, P0ALO3_A14350SalExtTipA, P0ALO3_A14398SalFecSal, P0ALO3_A10742SalCodeID, P0ALO3_A2258SalExtLis, P0ALO3_A10741SalEnvAT, P0ALO3_A6396SalExtHor, P0ALO3_A6397SalExtMat, P0ALO3_A2248ManCod,
            P0ALO3_A3302ManNif, P0ALO3_n3302ManNif, P0ALO3_A2251ManPob, P0ALO3_n2251ManPob, P0ALO3_A2250ManDom, P0ALO3_n2250ManDom, P0ALO3_A2249ManNom, P0ALO3_n2249ManNom
            }
            , new Object[] {
            P0ALO4_A396EmprCod, P0ALO4_A2253SalExtAlb, P0ALO4_A6558FasCodn, P0ALO4_A130BarCodPar, P0ALO4_A132BarCodReo, P0ALO4_A129BarCod, P0ALO4_A361DisCod, P0ALO4_A11662BarOrdComp, P0ALO4_A181BarMaqPro, P0ALO4_A136BarColNum,
            P0ALO4_A135BarColNom, P0ALO4_A6257SalExCoE, P0ALO4_A6256SalExKgE, P0ALO4_A1652BarSerDsc, P0ALO4_A1909BarGraAca, P0ALO4_A125BarAncAca1, P0ALO4_A2829BarProPer, P0ALO4_A143BarDisNum, P0ALO4_A6248SalExNln
            }
            , new Object[] {
            }
            , new Object[] {
            P0ALO6_A44AlbRecCod, P0ALO6_A396EmprCod, P0ALO6_A130BarCodPar, P0ALO6_A132BarCodReo, P0ALO6_A129BarCod, P0ALO6_A8028AlbNumB, P0ALO6_A6463AlbRLote, P0ALO6_A6465AlbRLu, P0ALO6_A4602AlbRMdlCod, P0ALO6_A6464AlbRTelar,
            P0ALO6_A8035AlbMaqTej, P0ALO6_A200BarPieCod
            }
            , new Object[] {
            P0ALO7_A396EmprCod, P0ALO7_A2253SalExtAlb, P0ALO7_A130BarCodPar, P0ALO7_A132BarCodReo, P0ALO7_A129BarCod, P0ALO7_A6249SalExObs, P0ALO7_A6248SalExNln
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV64PQrcode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A2258SalExtLis ;
   private byte A10741SalEnvAT ;
   private byte AV56Mes ;
   private byte AV26Dia ;
   private byte A132BarCodReo ;
   private byte AV16BarCodReo ;
   private byte AV61Pgadas ;
   private byte AV102GXLvl183 ;
   private short A2248ManCod ;
   private short AV11Anyo ;
   private short AV30Dpi ;
   private short AV62Pixel ;
   private short AV18Cantidad ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A6248SalExNln ;
   private short AV46i ;
   private short AV65Pzs ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV90Clicod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A6257SalExCoE ;
   private int GX_I ;
   private int AV14BarCod ;
   private int AV28Discod ;
   private int Gx_OldLine ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV19Centimetos ;
   private java.math.BigDecimal AV79Tot_k ;
   private java.math.BigDecimal AV80Tot_mt ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal AV50kgs ;
   private java.math.BigDecimal A6465AlbRLu ;
   private String A396EmprCod ;
   private String AV48ImpCod ;
   private String AV74TextoCopia ;
   private String Gx_out ;
   private String AV24ContDsc ;
   private String AV44FirmaD ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV36EmprNom ;
   private String AV71Texto_1 ;
   private String AV72Texto_2 ;
   private String AV31EmprCif ;
   private String A14348SalExtATCU ;
   private String A10080SalSts ;
   private String A10077SalFmd ;
   private String A10743ManCp2 ;
   private String A2252ManCpo ;
   private String A14349SalExtSerA ;
   private String A14350SalExtTipA ;
   private String A10742SalCodeID ;
   private String A6396SalExtHor ;
   private String A6397SalExtMat ;
   private String A3302ManNif ;
   private String A2251ManPob ;
   private String A2250ManDom ;
   private String A2249ManNom ;
   private String AV23codValidacaoSerie ;
   private String AV12atcud ;
   private String AV87TextoAnulado ;
   private String AV41FechaAlb ;
   private String AV73Texto_fd ;
   private String AV43Firma4dig ;
   private String AV22codigopostal ;
   private String AV29documento ;
   private String AV27DiaCargaalfa ;
   private String AV25DevCruFecalfa ;
   private String AV13AtId ;
   private String AV51Lasthdr ;
   private String A6558FasCodn ;
   private String A130BarCodPar ;
   private String A181BarMaqPro ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A2829BarProPer ;
   private String A143BarDisNum ;
   private String AV69Tab_fs[] ;
   private String AV40FasDsc ;
   private String GXt_char2 ;
   private String AV15BarCodPar ;
   private String AV63PO ;
   private String AV55Marcadsc ;
   private String GXv_char4[] ;
   private String AV84vColor ;
   private String AV45HojaRuta ;
   private String AV70Tab_obs[] ;
   private String AV42Fio5 ;
   private String AV49Jogo3 ;
   private String AV53Maq6 ;
   private String AV10AlbrLote ;
   private String AV9AlbNumb ;
   private String A6249SalExObs ;
   private String A8028AlbNumB ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String A200BarPieCod ;
   private String AV76textoNOAT ;
   private String sImgUrl ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A14398SalFecSal ;
   private java.util.Date AV8DevCruFec ;
   private boolean n407EmprNom ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean GxHdr3 ;
   private boolean n10743ManCp2 ;
   private boolean n2252ManCpo ;
   private boolean n3302ManNif ;
   private boolean n2251ManPob ;
   private boolean n2250ManDom ;
   private boolean n2249ManNom ;
   private boolean brkALO5 ;
   private boolean returnInSub ;
   private String A3554SalExtObs ;
   private String AV68SalExtObs ;
   private String AV66ReportInPut ;
   private String AV75TextoGenerar ;
   private String AV83Url ;
   private String AV96Imagen_GXI ;
   private String A11662BarOrdComp ;
   private String AV67RutaImagenMarcaAgua ;
   private String AV97Marcaaguaimagen_GXI ;
   private String AV47Imagen ;
   private String AV54MarcaAguaImagen ;
   private String Marcaaguaimagen ;
   private String Imagen ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALO2_A396EmprCod ;
   private String[] P0ALO2_A407EmprNom ;
   private boolean[] P0ALO2_n407EmprNom ;
   private String[] P0ALO2_A8335EmpItm2 ;
   private boolean[] P0ALO2_n8335EmpItm2 ;
   private String[] P0ALO2_A8334EmpItm1 ;
   private boolean[] P0ALO2_n8334EmpItm1 ;
   private String[] P0ALO2_A8337EmpItm4 ;
   private boolean[] P0ALO2_n8337EmpItm4 ;
   private String[] P0ALO2_A8336EmpItm3 ;
   private boolean[] P0ALO2_n8336EmpItm3 ;
   private String[] P0ALO2_A395EmprCif ;
   private boolean[] P0ALO2_n395EmprCif ;
   private String[] P0ALO3_A3554SalExtObs ;
   private String[] P0ALO3_A396EmprCod ;
   private int[] P0ALO3_A2253SalExtAlb ;
   private String[] P0ALO3_A14348SalExtATCU ;
   private String[] P0ALO3_A10080SalSts ;
   private java.util.Date[] P0ALO3_A2256SalExtFec ;
   private String[] P0ALO3_A10077SalFmd ;
   private String[] P0ALO3_A10743ManCp2 ;
   private boolean[] P0ALO3_n10743ManCp2 ;
   private String[] P0ALO3_A2252ManCpo ;
   private boolean[] P0ALO3_n2252ManCpo ;
   private String[] P0ALO3_A14349SalExtSerA ;
   private String[] P0ALO3_A14350SalExtTipA ;
   private java.util.Date[] P0ALO3_A14398SalFecSal ;
   private String[] P0ALO3_A10742SalCodeID ;
   private byte[] P0ALO3_A2258SalExtLis ;
   private byte[] P0ALO3_A10741SalEnvAT ;
   private String[] P0ALO3_A6396SalExtHor ;
   private String[] P0ALO3_A6397SalExtMat ;
   private short[] P0ALO3_A2248ManCod ;
   private String[] P0ALO3_A3302ManNif ;
   private boolean[] P0ALO3_n3302ManNif ;
   private String[] P0ALO3_A2251ManPob ;
   private boolean[] P0ALO3_n2251ManPob ;
   private String[] P0ALO3_A2250ManDom ;
   private boolean[] P0ALO3_n2250ManDom ;
   private String[] P0ALO3_A2249ManNom ;
   private boolean[] P0ALO3_n2249ManNom ;
   private String[] P0ALO4_A396EmprCod ;
   private int[] P0ALO4_A2253SalExtAlb ;
   private String[] P0ALO4_A6558FasCodn ;
   private String[] P0ALO4_A130BarCodPar ;
   private byte[] P0ALO4_A132BarCodReo ;
   private int[] P0ALO4_A129BarCod ;
   private int[] P0ALO4_A361DisCod ;
   private String[] P0ALO4_A11662BarOrdComp ;
   private String[] P0ALO4_A181BarMaqPro ;
   private int[] P0ALO4_A136BarColNum ;
   private String[] P0ALO4_A135BarColNom ;
   private int[] P0ALO4_A6257SalExCoE ;
   private java.math.BigDecimal[] P0ALO4_A6256SalExKgE ;
   private String[] P0ALO4_A1652BarSerDsc ;
   private short[] P0ALO4_A1909BarGraAca ;
   private short[] P0ALO4_A125BarAncAca1 ;
   private String[] P0ALO4_A2829BarProPer ;
   private String[] P0ALO4_A143BarDisNum ;
   private short[] P0ALO4_A6248SalExNln ;
   private int[] P0ALO6_A44AlbRecCod ;
   private String[] P0ALO6_A396EmprCod ;
   private String[] P0ALO6_A130BarCodPar ;
   private byte[] P0ALO6_A132BarCodReo ;
   private int[] P0ALO6_A129BarCod ;
   private String[] P0ALO6_A8028AlbNumB ;
   private String[] P0ALO6_A6463AlbRLote ;
   private java.math.BigDecimal[] P0ALO6_A6465AlbRLu ;
   private String[] P0ALO6_A4602AlbRMdlCod ;
   private String[] P0ALO6_A6464AlbRTelar ;
   private String[] P0ALO6_A8035AlbMaqTej ;
   private String[] P0ALO6_A200BarPieCod ;
   private String[] P0ALO7_A396EmprCod ;
   private int[] P0ALO7_A2253SalExtAlb ;
   private String[] P0ALO7_A130BarCodPar ;
   private byte[] P0ALO7_A132BarCodReo ;
   private int[] P0ALO7_A129BarCod ;
   private String[] P0ALO7_A6249SalExObs ;
   private short[] P0ALO7_A6248SalExNln ;
   private com.genexus.webpanels.WebSession AV89WEBSession ;
}

final  class pmod0113__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALO2", "SELECT EmprCod, EmprNom, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ALO3", "SELECT T1.SalExtObs, T1.EmprCod, T1.SalExtAlb, T1.SalExtATCU, T1.SalSts, T1.SalExtFec, T1.SalFmd, T2.ManCp2, T2.ManCpo, T1.SalExtSerA, T1.SalExtTipA, T1.SalFecSal, T1.SalCodeID, T1.SalExtLis, T1.SalEnvAT, T1.SalExtHor, T1.SalExtMat, T1.ManCod, T2.ManNif, T2.ManPob, T2.ManDom, T2.ManNom FROM (TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb  FOR UPDATE OF T1.SalExtLis NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ALO4", "SELECT T1.EmprCod, T1.SalExtAlb, T1.FasCodn, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisCod, T2.BarOrdComp, T2.BarMaqPro, T2.BarColNum, T2.BarColNom, T1.SalExCoE, T1.SalExKgE, T2.BarSerDsc, T2.BarGraAca, T2.BarAncAca1, T2.BarProPer, T2.BarDisNum, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0ALO5", "UPDATE TXPCEXTSA SET SalExtLis=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new ForEachCursor("P0ALO6", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbNumB, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ALO7", "SELECT EmprCod, SalExtAlb, BarCodPar, BarCodReo, BarCod, SalExObs, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 200);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getString(11, 4);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 34);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

