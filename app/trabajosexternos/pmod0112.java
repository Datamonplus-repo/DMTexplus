package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pmod0112 extends GXReport
{
   public pmod0112( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmod0112.class ), "" );
   }

   public pmod0112( int remoteHandle ,
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
      pmod0112.this.aP5 = new String[] {""};
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
      pmod0112.this.AV77ReportInPut = aP0;
      pmod0112.this.A396EmprCod = aP1;
      pmod0112.this.A2253SalExtAlb = aP2;
      pmod0112.this.AV8ImpCod = aP3[0];
      this.aP3 = aP3;
      pmod0112.this.AV40TextoCopia = aP4[0];
      this.aP4 = aP4;
      pmod0112.this.Gx_out = aP5[0];
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
      getPrinter().GxSetDocName(AV77ReportInPut) ;
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
         GXv_char1[0] = AV38ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD000", ""), GXv_char1) ;
         pmod0112.this.AV38ContDsc = GXv_char1[0] ;
         GXt_char2 = AV42FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pmod0112.this.A396EmprCod = GXv_char1[0] ;
         pmod0112.this.GXt_char2 = GXv_char4[0] ;
         AV42FirmaD = GXt_char2 ;
         GXt_int5 = AV64PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pmod0112.this.GXt_int5 = GXv_int6[0] ;
         AV64PQrcode = GXt_int5 ;
         /* Using cursor P0AHP2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0AHP2_A407EmprNom[0] ;
            n407EmprNom = P0AHP2_n407EmprNom[0] ;
            A8335EmpItm2 = P0AHP2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AHP2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0AHP2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AHP2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0AHP2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AHP2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AHP2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AHP2_n8336EmpItm3[0] ;
            A395EmprCif = P0AHP2_A395EmprCif[0] ;
            n395EmprCif = P0AHP2_n395EmprCif[0] ;
            AV24EmprNom = A407EmprNom ;
            AV44Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV45Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            AV70EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P0AHP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3554SalExtObs = P0AHP3_A3554SalExtObs[0] ;
            A14348SalExtATCU = P0AHP3_A14348SalExtATCU[0] ;
            A10080SalSts = P0AHP3_A10080SalSts[0] ;
            A2256SalExtFec = P0AHP3_A2256SalExtFec[0] ;
            A10077SalFmd = P0AHP3_A10077SalFmd[0] ;
            A10743ManCp2 = P0AHP3_A10743ManCp2[0] ;
            n10743ManCp2 = P0AHP3_n10743ManCp2[0] ;
            A2252ManCpo = P0AHP3_A2252ManCpo[0] ;
            n2252ManCpo = P0AHP3_n2252ManCpo[0] ;
            A14349SalExtSerA = P0AHP3_A14349SalExtSerA[0] ;
            A14350SalExtTipA = P0AHP3_A14350SalExtTipA[0] ;
            A14398SalFecSal = P0AHP3_A14398SalFecSal[0] ;
            A10742SalCodeID = P0AHP3_A10742SalCodeID[0] ;
            A2258SalExtLis = P0AHP3_A2258SalExtLis[0] ;
            A10741SalEnvAT = P0AHP3_A10741SalEnvAT[0] ;
            A6396SalExtHor = P0AHP3_A6396SalExtHor[0] ;
            A6397SalExtMat = P0AHP3_A6397SalExtMat[0] ;
            A2248ManCod = P0AHP3_A2248ManCod[0] ;
            A3302ManNif = P0AHP3_A3302ManNif[0] ;
            n3302ManNif = P0AHP3_n3302ManNif[0] ;
            A2251ManPob = P0AHP3_A2251ManPob[0] ;
            n2251ManPob = P0AHP3_n2251ManPob[0] ;
            A2250ManDom = P0AHP3_A2250ManDom[0] ;
            n2250ManDom = P0AHP3_n2250ManDom[0] ;
            A2249ManNom = P0AHP3_A2249ManNom[0] ;
            n2249ManNom = P0AHP3_n2249ManNom[0] ;
            A10743ManCp2 = P0AHP3_A10743ManCp2[0] ;
            n10743ManCp2 = P0AHP3_n10743ManCp2[0] ;
            A2252ManCpo = P0AHP3_A2252ManCpo[0] ;
            n2252ManCpo = P0AHP3_n2252ManCpo[0] ;
            A3302ManNif = P0AHP3_A3302ManNif[0] ;
            n3302ManNif = P0AHP3_n3302ManNif[0] ;
            A2251ManPob = P0AHP3_A2251ManPob[0] ;
            n2251ManPob = P0AHP3_n2251ManPob[0] ;
            A2250ManDom = P0AHP3_A2250ManDom[0] ;
            n2250ManDom = P0AHP3_n2250ManDom[0] ;
            A2249ManNom = P0AHP3_A2249ManNom[0] ;
            n2249ManNom = P0AHP3_n2249ManNom[0] ;
            AV97Clicod = A2248ManCod ;
            AV71codValidacaoSerie = A14348SalExtATCU ;
            AV72atcud = ((GXutil.strcmp("", AV71codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV71codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0))) ;
            AV94TextoAnulado = ((GXutil.strcmp(A10080SalSts, "A")==0) ? httpContext.getMessage( "ANULADO", "") : " ") ;
            AV31FechaAlb = GXutil.str( GXutil.day( A2256SalExtFec), 2, 0) + httpContext.getMessage( " de ", "") + localUtil.cmonth( A2256SalExtFec, httpContext.getMessage( "por", "")) + httpContext.getMessage( " de ", "") + GXutil.str( GXutil.year( A2256SalExtFec), 4, 0) ;
            AV41Texto_fd = " " ;
            if ( GXutil.strcmp(A10077SalFmd, " ") != 0 )
            {
               AV43Firma4dig = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
               AV41Texto_fd = AV43Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV42FirmaD) ;
            }
            else
            {
               AV41Texto_fd = httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            AV87codigopostal = GXutil.trim( A2252ManCpo) + "-" + GXutil.trim( A10743ManCp2) ;
            AV90documento = GXutil.trim( A14350SalExtTipA) + " " + GXutil.trim( A14349SalExtSerA) + "/" + GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0)) ;
            AV17Anyo = (short)(GXutil.year( A14398SalFecSal)) ;
            AV16Mes = (byte)(GXutil.month( A14398SalFecSal)) ;
            AV15Dia = (byte)(GXutil.day( A14398SalFecSal)) ;
            AV89DiaCargaalfa = GXutil.str( AV17Anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV16Mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV15Dia, 2, 0)), (short)(2), "0") ;
            AV86DevCruFec = A2256SalExtFec ;
            AV17Anyo = (short)(GXutil.year( A2256SalExtFec)) ;
            AV16Mes = (byte)(GXutil.month( A2256SalExtFec)) ;
            AV15Dia = (byte)(GXutil.day( A2256SalExtFec)) ;
            AV88DevCruFecalfa = GXutil.str( AV17Anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV16Mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV15Dia, 2, 0)), (short)(2), "0") ;
            AV69TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV70EmprCif) + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A3302ManNif) + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "D:", "") + GXutil.trim( A14350SalExtTipA) + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV17Anyo = (short)(GXutil.year( A2256SalExtFec)) ;
            AV16Mes = (byte)(GXutil.month( A2256SalExtFec)) ;
            AV15Dia = (byte)(GXutil.day( A2256SalExtFec)) ;
            AV69TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV17Anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV16Mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV15Dia, 2, 0)), (short)(2), "0") + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "G:", "") + GXutil.trim( A14350SalExtTipA) + " " + GXutil.trim( A14349SalExtSerA) + "/" + GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0)) + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "H:", "") + GXutil.trim( A14348SalExtATCU) + "-" + GXutil.trim( GXutil.str( A2253SalExtAlb, 8, 0)) + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "Q:", "") + AV43Firma4dig + "*" ;
            AV69TextoGenerar += httpContext.getMessage( "R:", "") + "1208" ;
            AV74Dpi = (short)(300) ;
            AV75Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV76Pixel = (short)(DecimalUtil.decToDouble(AV75Centimetos.multiply(DecimalUtil.doubleToDec(AV74Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV73Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV69TextoGenerar, AV76Pixel, AV76Pixel, GXv_char4) ;
            pmod0112.this.GXt_char2 = GXv_char4[0] ;
            AV73Url = GXt_char2 ;
            AV68Imagen = AV73Url ;
            AV104Imagen_GXI = GXDbFile.pathToUrl( AV73Url, context.getHttpContext()) ;
            AV47AtId = " " ;
            if ( GXutil.strcmp(A10742SalCodeID, " ") != 0 )
            {
               AV47AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A10742SalCodeID, 1, 12)) ;
            }
            AV46SalExtObs = A3554SalExtObs ;
            AV22Cantidad = (short)(0) ;
            AV48Tot_k = DecimalUtil.doubleToDec(0) ;
            AV49Tot_mt = DecimalUtil.doubleToDec(0) ;
            AV51Lasthdr = " " ;
            /* Using cursor P0AHP4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               brkAHP5 = false ;
               A6558FasCodn = P0AHP4_A6558FasCodn[0] ;
               A14410FasDscMn = P0AHP4_A14410FasDscMn[0] ;
               A6249SalExObs = P0AHP4_A6249SalExObs[0] ;
               A130BarCodPar = P0AHP4_A130BarCodPar[0] ;
               A132BarCodReo = P0AHP4_A132BarCodReo[0] ;
               A129BarCod = P0AHP4_A129BarCod[0] ;
               A361DisCod = P0AHP4_A361DisCod[0] ;
               A11662BarOrdComp = P0AHP4_A11662BarOrdComp[0] ;
               A181BarMaqPro = P0AHP4_A181BarMaqPro[0] ;
               A136BarColNum = P0AHP4_A136BarColNum[0] ;
               A135BarColNom = P0AHP4_A135BarColNom[0] ;
               A6257SalExCoE = P0AHP4_A6257SalExCoE[0] ;
               A6256SalExKgE = P0AHP4_A6256SalExKgE[0] ;
               A1652BarSerDsc = P0AHP4_A1652BarSerDsc[0] ;
               A1909BarGraAca = P0AHP4_A1909BarGraAca[0] ;
               A125BarAncAca1 = P0AHP4_A125BarAncAca1[0] ;
               A2829BarProPer = P0AHP4_A2829BarProPer[0] ;
               A143BarDisNum = P0AHP4_A143BarDisNum[0] ;
               A6248SalExNln = P0AHP4_A6248SalExNln[0] ;
               A361DisCod = P0AHP4_A361DisCod[0] ;
               A11662BarOrdComp = P0AHP4_A11662BarOrdComp[0] ;
               A181BarMaqPro = P0AHP4_A181BarMaqPro[0] ;
               A136BarColNum = P0AHP4_A136BarColNum[0] ;
               A135BarColNom = P0AHP4_A135BarColNom[0] ;
               A1652BarSerDsc = P0AHP4_A1652BarSerDsc[0] ;
               A1909BarGraAca = P0AHP4_A1909BarGraAca[0] ;
               A125BarAncAca1 = P0AHP4_A125BarAncAca1[0] ;
               A2829BarProPer = P0AHP4_A2829BarProPer[0] ;
               A143BarDisNum = P0AHP4_A143BarDisNum[0] ;
               GX_I = 1 ;
               while ( GX_I <= 100 )
               {
                  AV52Tab_fs[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               GX_I = 1 ;
               while ( GX_I <= 9 )
               {
                  AV98Tab_obslinea[GX_I-1] = " " ;
                  GX_I = (int)(GX_I+1) ;
               }
               AV53i = (short)(1) ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AHP4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AHP4_A2253SalExtAlb[0] == A2253SalExtAlb ) && ( P0AHP4_A129BarCod[0] == A129BarCod ) && ( P0AHP4_A132BarCodReo[0] == A132BarCodReo ) )
               {
                  if ( ! ( ( GXutil.strcmp(P0AHP4_A130BarCodPar[0], A130BarCodPar) == 0 ) ) )
                  {
                     if (true) break;
                  }
                  brkAHP5 = false ;
                  A6558FasCodn = P0AHP4_A6558FasCodn[0] ;
                  A14410FasDscMn = P0AHP4_A14410FasDscMn[0] ;
                  A6249SalExObs = P0AHP4_A6249SalExObs[0] ;
                  A6248SalExNln = P0AHP4_A6248SalExNln[0] ;
                  GXt_char2 = AV20FasDsc ;
                  GXv_char4[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A6558FasCodn, GXv_char4) ;
                  pmod0112.this.GXt_char2 = GXv_char4[0] ;
                  AV20FasDsc = GXt_char2 ;
                  AV52Tab_fs[AV53i-1] = GXutil.substring( A14410FasDscMn, 1, 20) ;
                  AV98Tab_obslinea[AV53i-1] = A6249SalExObs ;
                  AV53i = (short)(AV53i+1) ;
                  brkAHP5 = true ;
                  pr_default.readNext(2);
               }
               AV10BarCod = A129BarCod ;
               AV11BarCodReo = A132BarCodReo ;
               AV12BarCodPar = A130BarCodPar ;
               AV63Discod = A361DisCod ;
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
               AV61PO = GXutil.substring( A11662BarOrdComp, 1, 20) ;
               GXv_char4[0] = AV60Marcadsc ;
               new app.pmarcacliente(remoteHandle, context).execute( A396EmprCod, A181BarMaqPro, GXv_char4) ;
               pmod0112.this.AV60Marcadsc = GXv_char4[0] ;
               AV39vColor = A135BarColNom + GXutil.str( A136BarColNum, 6, 0) ;
               AV14HojaRuta = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               AV50Pzs = (short)(A6257SalExCoE) ;
               AV85kgs = A6256SalExKgE ;
               hAHP0( false, 19) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14HojaRuta, "")), 11, Gx_line+1, 92, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 100, Gx_line+1, 291, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85kgs, "ZZZ9.99")), 294, Gx_line+0, 346, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50Pzs), "ZZZ9")), 365, Gx_line+0, 395, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_fs[1-1], "")), 403, Gx_line+1, 508, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kg", ""), 350, Gx_line+0, 366, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Tab_obslinea[1-1], "")), 517, Gx_line+0, 726, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               hAHP0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39vColor, "")), 34, Gx_line+0, 160, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 11, Gx_line+0, 29, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_fs[2-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Tab_obslinea[2-1], "")), 517, Gx_line+0, 726, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hAHP0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Acabamento Largura:", ""), 11, Gx_line+1, 117, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 120, Gx_line+1, 140, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gram:", ""), 146, Gx_line+1, 177, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 182, Gx_line+1, 208, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_fs[3-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Tab_obslinea[3-1], "")), 517, Gx_line+0, 726, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hAHP0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FIO:", ""), 11, Gx_line+0, 31, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Fio5, "")), 31, Gx_line+0, 84, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_fs[4-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Jogo3, "")), 120, Gx_line+0, 152, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "JOGO:", ""), 89, Gx_line+0, 119, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("\"", 172, Gx_line+0, 177, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57Pgadas), "Z9")), 156, Gx_line+0, 170, Gx_line+15, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Maq6, "")), 220, Gx_line+0, 263, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MAQ:", ""), 188, Gx_line+0, 215, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55AlbrLote, "")), 303, Gx_line+0, 398, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote:", ""), 271, Gx_line+0, 297, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Tab_obslinea[4-1], "")), 517, Gx_line+0, 726, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hAHP0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "R.comp:", ""), 11, Gx_line+0, 52, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59AlbNumb, "")), 52, Gx_line+0, 178, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2829BarProPer, "")), 203, Gx_line+0, 287, Gx_line+15, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Tab_fs[5-1], "")), 403, Gx_line+0, 508, Gx_line+13, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Tab_obslinea[5-1], "")), 517, Gx_line+0, 726, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hAHP0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Po:", ""), 11, Gx_line+0, 28, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61PO, "")), 52, Gx_line+0, 178, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hAHP0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Marca:", ""), 11, Gx_line+0, 46, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Marcadsc, "")), 52, Gx_line+0, 241, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hAHP0( false, 17) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Doc Cliente:", ""), 11, Gx_line+1, 71, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 73, Gx_line+0, 157, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               hAHP0( false, 7) ;
               getPrinter().GxDrawLine(4, Gx_line+4, 779, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+7) ;
               if ( ! brkAHP5 )
               {
                  brkAHP5 = true ;
                  pr_default.readNext(2);
               }
            }
            pr_default.close(2);
            if ( A2258SalExtLis == 0 )
            {
               A2258SalExtLis = (byte)(1) ;
            }
            /* Using cursor P0AHP5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A2258SalExtLis), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         AV96WEBSession.setValue(httpContext.getMessage( "PMOD0112_Clicod", ""), localUtil.format( DecimalUtil.doubleToDec(AV97Clicod), "ZZZZZ9"));
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAHP0( true, 0) ;
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
      /* Using cursor P0AHP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A44AlbRecCod = P0AHP6_A44AlbRecCod[0] ;
         A130BarCodPar = P0AHP6_A130BarCodPar[0] ;
         A132BarCodReo = P0AHP6_A132BarCodReo[0] ;
         A129BarCod = P0AHP6_A129BarCod[0] ;
         A8028AlbNumB = P0AHP6_A8028AlbNumB[0] ;
         A6463AlbRLote = P0AHP6_A6463AlbRLote[0] ;
         A6465AlbRLu = P0AHP6_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0AHP6_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0AHP6_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AHP6_A8035AlbMaqTej[0] ;
         A200BarPieCod = P0AHP6_A200BarPieCod[0] ;
         A8028AlbNumB = P0AHP6_A8028AlbNumB[0] ;
         A6463AlbRLote = P0AHP6_A6463AlbRLote[0] ;
         A6465AlbRLu = P0AHP6_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P0AHP6_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P0AHP6_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AHP6_A8035AlbMaqTej[0] ;
         AV59AlbNumb = A8028AlbNumB ;
         AV55AlbrLote = A6463AlbRLote ;
         AV57Pgadas = (byte)(DecimalUtil.decToDouble(A6465AlbRLu)) ;
         AV56Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
         AV54Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
         AV58Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV62Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV53i = (short)(1) ;
      /* Using cursor P0AHP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV63Discod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A361DisCod = P0AHP7_A361DisCod[0] ;
         A377DisObsTxt = P0AHP7_A377DisObsTxt[0] ;
         A376DisObsLin = P0AHP7_A376DisObsLin[0] ;
         AV62Tab_obs[AV53i-1] = A377DisObsTxt ;
         AV53i = (short)(AV53i+1) ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void hAHP0( boolean bFoot ,
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38ContDsc, "")), 726, Gx_line+53, 790, Gx_line+66, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Texto_1, "")), 68, Gx_line+82, 736, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Texto_2, "")), 89, Gx_line+100, 715, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 40, Gx_line+5, 125, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(AV46SalExtObs, 132, Gx_line+5, 753, Gx_line+44, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Este documento não serve de fatura", ""), 313, Gx_line+69, 491, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93textoNOAT, "")), 439, Gx_line+53, 716, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47AtId, "")), 298, Gx_line+53, 429, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Texto_fd, "")), 16, Gx_line+53, 288, Gx_line+66, 0+256, 0, 0, 0) ;
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
               AV92RutaImagenMarcaAgua = "" ;
               AV93textoNOAT = "" ;
               if ( (0==A10741SalEnvAT) )
               {
                  AV93textoNOAT = httpContext.getMessage( "Este documento não serve de documento de transporte", "") ;
               }
               if ( A10741SalEnvAT == 0 )
               {
                  AV91MarcaAguaImagen = context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )) ;
                  AV105Marcaaguaimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
                  sImgUrl = ((GXutil.strcmp("", AV91MarcaAguaImagen)==0) ? AV105Marcaaguaimagen_GXI : AV91MarcaAguaImagen) ;
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TextoCopia, "")), 680, Gx_line+219, 759, Gx_line+236, 0+256, 0, 0, 0) ;
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
               sImgUrl = ((GXutil.strcmp("", AV68Imagen)==0) ? AV104Imagen_GXI : AV68Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 217, Gx_line+167, 350, Gx_line+305) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72atcud, "")), 205, Gx_line+148, 362, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90documento, "")), 592, Gx_line+190, 760, Gx_line+211, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87codigopostal, "")), 425, Gx_line+317, 489, Gx_line+334, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina:", ""), 625, Gx_line+402, 662, Gx_line+417, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 667, Gx_line+402, 706, Gx_line+418, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 714, Gx_line+402, 718, Gx_line+417, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 726, Gx_line+402, 775, Gx_line+417, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88DevCruFecalfa, "")), 142, Gx_line+389, 247, Gx_line+406, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89DiaCargaalfa, "")), 142, Gx_line+405, 247, Gx_line+422, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94TextoAnulado, "")), 417, Gx_line+117, 731, Gx_line+157, 0+256, 0, 0, 0) ;
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
      this.aP3[0] = pmod0112.this.AV8ImpCod;
      this.aP4[0] = pmod0112.this.AV40TextoCopia;
      this.aP5[0] = pmod0112.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.pmod0112");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38ContDsc = "" ;
      AV42FirmaD = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P0AHP2_A396EmprCod = new String[] {""} ;
      P0AHP2_A407EmprNom = new String[] {""} ;
      P0AHP2_n407EmprNom = new boolean[] {false} ;
      P0AHP2_A8335EmpItm2 = new String[] {""} ;
      P0AHP2_n8335EmpItm2 = new boolean[] {false} ;
      P0AHP2_A8334EmpItm1 = new String[] {""} ;
      P0AHP2_n8334EmpItm1 = new boolean[] {false} ;
      P0AHP2_A8337EmpItm4 = new String[] {""} ;
      P0AHP2_n8337EmpItm4 = new boolean[] {false} ;
      P0AHP2_A8336EmpItm3 = new String[] {""} ;
      P0AHP2_n8336EmpItm3 = new boolean[] {false} ;
      P0AHP2_A395EmprCif = new String[] {""} ;
      P0AHP2_n395EmprCif = new boolean[] {false} ;
      A407EmprNom = "" ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      A395EmprCif = "" ;
      AV24EmprNom = "" ;
      AV44Texto_1 = "" ;
      AV45Texto_2 = "" ;
      AV70EmprCif = "" ;
      P0AHP3_A3554SalExtObs = new String[] {""} ;
      P0AHP3_A396EmprCod = new String[] {""} ;
      P0AHP3_A2253SalExtAlb = new int[1] ;
      P0AHP3_A14348SalExtATCU = new String[] {""} ;
      P0AHP3_A10080SalSts = new String[] {""} ;
      P0AHP3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHP3_A10077SalFmd = new String[] {""} ;
      P0AHP3_A10743ManCp2 = new String[] {""} ;
      P0AHP3_n10743ManCp2 = new boolean[] {false} ;
      P0AHP3_A2252ManCpo = new String[] {""} ;
      P0AHP3_n2252ManCpo = new boolean[] {false} ;
      P0AHP3_A14349SalExtSerA = new String[] {""} ;
      P0AHP3_A14350SalExtTipA = new String[] {""} ;
      P0AHP3_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHP3_A10742SalCodeID = new String[] {""} ;
      P0AHP3_A2258SalExtLis = new byte[1] ;
      P0AHP3_A10741SalEnvAT = new byte[1] ;
      P0AHP3_A6396SalExtHor = new String[] {""} ;
      P0AHP3_A6397SalExtMat = new String[] {""} ;
      P0AHP3_A2248ManCod = new short[1] ;
      P0AHP3_A3302ManNif = new String[] {""} ;
      P0AHP3_n3302ManNif = new boolean[] {false} ;
      P0AHP3_A2251ManPob = new String[] {""} ;
      P0AHP3_n2251ManPob = new boolean[] {false} ;
      P0AHP3_A2250ManDom = new String[] {""} ;
      P0AHP3_n2250ManDom = new boolean[] {false} ;
      P0AHP3_A2249ManNom = new String[] {""} ;
      P0AHP3_n2249ManNom = new boolean[] {false} ;
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
      AV71codValidacaoSerie = "" ;
      AV72atcud = "" ;
      AV94TextoAnulado = "" ;
      AV31FechaAlb = "" ;
      AV41Texto_fd = "" ;
      AV43Firma4dig = "" ;
      AV87codigopostal = "" ;
      AV90documento = "" ;
      AV89DiaCargaalfa = "" ;
      AV86DevCruFec = GXutil.nullDate() ;
      AV88DevCruFecalfa = "" ;
      AV69TextoGenerar = "" ;
      AV75Centimetos = DecimalUtil.ZERO ;
      AV73Url = "" ;
      AV68Imagen = "" ;
      AV104Imagen_GXI = "" ;
      AV47AtId = "" ;
      AV46SalExtObs = "" ;
      AV48Tot_k = DecimalUtil.ZERO ;
      AV49Tot_mt = DecimalUtil.ZERO ;
      AV51Lasthdr = "" ;
      P0AHP4_A396EmprCod = new String[] {""} ;
      P0AHP4_A2253SalExtAlb = new int[1] ;
      P0AHP4_A6558FasCodn = new String[] {""} ;
      P0AHP4_A14410FasDscMn = new String[] {""} ;
      P0AHP4_A6249SalExObs = new String[] {""} ;
      P0AHP4_A130BarCodPar = new String[] {""} ;
      P0AHP4_A132BarCodReo = new byte[1] ;
      P0AHP4_A129BarCod = new int[1] ;
      P0AHP4_A361DisCod = new int[1] ;
      P0AHP4_A11662BarOrdComp = new String[] {""} ;
      P0AHP4_A181BarMaqPro = new String[] {""} ;
      P0AHP4_A136BarColNum = new int[1] ;
      P0AHP4_A135BarColNom = new String[] {""} ;
      P0AHP4_A6257SalExCoE = new int[1] ;
      P0AHP4_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHP4_A1652BarSerDsc = new String[] {""} ;
      P0AHP4_A1909BarGraAca = new short[1] ;
      P0AHP4_A125BarAncAca1 = new short[1] ;
      P0AHP4_A2829BarProPer = new String[] {""} ;
      P0AHP4_A143BarDisNum = new String[] {""} ;
      P0AHP4_A6248SalExNln = new short[1] ;
      A6558FasCodn = "" ;
      A14410FasDscMn = "" ;
      A6249SalExObs = "" ;
      A130BarCodPar = "" ;
      A11662BarOrdComp = "" ;
      A181BarMaqPro = "" ;
      A135BarColNom = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A2829BarProPer = "" ;
      A143BarDisNum = "" ;
      AV52Tab_fs = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV52Tab_fs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV98Tab_obslinea = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV98Tab_obslinea[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV20FasDsc = "" ;
      GXt_char2 = "" ;
      AV12BarCodPar = "" ;
      AV61PO = "" ;
      AV60Marcadsc = "" ;
      GXv_char4 = new String[1] ;
      AV39vColor = "" ;
      AV14HojaRuta = "" ;
      AV85kgs = DecimalUtil.ZERO ;
      AV54Fio5 = "" ;
      AV56Jogo3 = "" ;
      AV58Maq6 = "" ;
      AV55AlbrLote = "" ;
      AV59AlbNumb = "" ;
      AV96WEBSession = httpContext.getWebSession();
      P0AHP6_A44AlbRecCod = new int[1] ;
      P0AHP6_A396EmprCod = new String[] {""} ;
      P0AHP6_A130BarCodPar = new String[] {""} ;
      P0AHP6_A132BarCodReo = new byte[1] ;
      P0AHP6_A129BarCod = new int[1] ;
      P0AHP6_A8028AlbNumB = new String[] {""} ;
      P0AHP6_A6463AlbRLote = new String[] {""} ;
      P0AHP6_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHP6_A4602AlbRMdlCod = new String[] {""} ;
      P0AHP6_A6464AlbRTelar = new String[] {""} ;
      P0AHP6_A8035AlbMaqTej = new String[] {""} ;
      P0AHP6_A200BarPieCod = new String[] {""} ;
      A8028AlbNumB = "" ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A200BarPieCod = "" ;
      AV62Tab_obs = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV62Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AHP7_A396EmprCod = new String[] {""} ;
      P0AHP7_A361DisCod = new int[1] ;
      P0AHP7_A377DisObsTxt = new String[] {""} ;
      P0AHP7_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV93textoNOAT = "" ;
      AV92RutaImagenMarcaAgua = "" ;
      AV91MarcaAguaImagen = "" ;
      AV105Marcaaguaimagen_GXI = "" ;
      AV91MarcaAguaImagen = "" ;
      sImgUrl = "" ;
      AV68Imagen = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pmod0112__default(),
         new Object[] {
             new Object[] {
            P0AHP2_A396EmprCod, P0AHP2_A407EmprNom, P0AHP2_n407EmprNom, P0AHP2_A8335EmpItm2, P0AHP2_n8335EmpItm2, P0AHP2_A8334EmpItm1, P0AHP2_n8334EmpItm1, P0AHP2_A8337EmpItm4, P0AHP2_n8337EmpItm4, P0AHP2_A8336EmpItm3,
            P0AHP2_n8336EmpItm3, P0AHP2_A395EmprCif, P0AHP2_n395EmprCif
            }
            , new Object[] {
            P0AHP3_A3554SalExtObs, P0AHP3_A396EmprCod, P0AHP3_A2253SalExtAlb, P0AHP3_A14348SalExtATCU, P0AHP3_A10080SalSts, P0AHP3_A2256SalExtFec, P0AHP3_A10077SalFmd, P0AHP3_A10743ManCp2, P0AHP3_n10743ManCp2, P0AHP3_A2252ManCpo,
            P0AHP3_n2252ManCpo, P0AHP3_A14349SalExtSerA, P0AHP3_A14350SalExtTipA, P0AHP3_A14398SalFecSal, P0AHP3_A10742SalCodeID, P0AHP3_A2258SalExtLis, P0AHP3_A10741SalEnvAT, P0AHP3_A6396SalExtHor, P0AHP3_A6397SalExtMat, P0AHP3_A2248ManCod,
            P0AHP3_A3302ManNif, P0AHP3_n3302ManNif, P0AHP3_A2251ManPob, P0AHP3_n2251ManPob, P0AHP3_A2250ManDom, P0AHP3_n2250ManDom, P0AHP3_A2249ManNom, P0AHP3_n2249ManNom
            }
            , new Object[] {
            P0AHP4_A396EmprCod, P0AHP4_A2253SalExtAlb, P0AHP4_A6558FasCodn, P0AHP4_A14410FasDscMn, P0AHP4_A6249SalExObs, P0AHP4_A130BarCodPar, P0AHP4_A132BarCodReo, P0AHP4_A129BarCod, P0AHP4_A361DisCod, P0AHP4_A11662BarOrdComp,
            P0AHP4_A181BarMaqPro, P0AHP4_A136BarColNum, P0AHP4_A135BarColNom, P0AHP4_A6257SalExCoE, P0AHP4_A6256SalExKgE, P0AHP4_A1652BarSerDsc, P0AHP4_A1909BarGraAca, P0AHP4_A125BarAncAca1, P0AHP4_A2829BarProPer, P0AHP4_A143BarDisNum,
            P0AHP4_A6248SalExNln
            }
            , new Object[] {
            }
            , new Object[] {
            P0AHP6_A44AlbRecCod, P0AHP6_A396EmprCod, P0AHP6_A130BarCodPar, P0AHP6_A132BarCodReo, P0AHP6_A129BarCod, P0AHP6_A8028AlbNumB, P0AHP6_A6463AlbRLote, P0AHP6_A6465AlbRLu, P0AHP6_A4602AlbRMdlCod, P0AHP6_A6464AlbRTelar,
            P0AHP6_A8035AlbMaqTej, P0AHP6_A200BarPieCod
            }
            , new Object[] {
            P0AHP7_A396EmprCod, P0AHP7_A361DisCod, P0AHP7_A377DisObsTxt, P0AHP7_A376DisObsLin
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
   private byte AV16Mes ;
   private byte AV15Dia ;
   private byte A132BarCodReo ;
   private byte AV11BarCodReo ;
   private byte AV57Pgadas ;
   private byte A376DisObsLin ;
   private short A2248ManCod ;
   private short AV17Anyo ;
   private short AV74Dpi ;
   private short AV76Pixel ;
   private short AV22Cantidad ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A6248SalExNln ;
   private short AV53i ;
   private short AV50Pzs ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV97Clicod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A6257SalExCoE ;
   private int GX_I ;
   private int AV10BarCod ;
   private int AV63Discod ;
   private int Gx_OldLine ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV75Centimetos ;
   private java.math.BigDecimal AV48Tot_k ;
   private java.math.BigDecimal AV49Tot_mt ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal AV85kgs ;
   private java.math.BigDecimal A6465AlbRLu ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV40TextoCopia ;
   private String Gx_out ;
   private String AV38ContDsc ;
   private String AV42FirmaD ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String A395EmprCif ;
   private String AV24EmprNom ;
   private String AV44Texto_1 ;
   private String AV45Texto_2 ;
   private String AV70EmprCif ;
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
   private String AV71codValidacaoSerie ;
   private String AV72atcud ;
   private String AV94TextoAnulado ;
   private String AV31FechaAlb ;
   private String AV41Texto_fd ;
   private String AV43Firma4dig ;
   private String AV87codigopostal ;
   private String AV90documento ;
   private String AV89DiaCargaalfa ;
   private String AV88DevCruFecalfa ;
   private String AV47AtId ;
   private String AV51Lasthdr ;
   private String A6558FasCodn ;
   private String A14410FasDscMn ;
   private String A6249SalExObs ;
   private String A130BarCodPar ;
   private String A181BarMaqPro ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A2829BarProPer ;
   private String A143BarDisNum ;
   private String AV52Tab_fs[] ;
   private String AV98Tab_obslinea[] ;
   private String AV20FasDsc ;
   private String GXt_char2 ;
   private String AV12BarCodPar ;
   private String AV61PO ;
   private String AV60Marcadsc ;
   private String GXv_char4[] ;
   private String AV39vColor ;
   private String AV14HojaRuta ;
   private String AV54Fio5 ;
   private String AV56Jogo3 ;
   private String AV58Maq6 ;
   private String AV55AlbrLote ;
   private String AV59AlbNumb ;
   private String A8028AlbNumB ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String A200BarPieCod ;
   private String AV62Tab_obs[] ;
   private String A377DisObsTxt ;
   private String AV93textoNOAT ;
   private String sImgUrl ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A14398SalFecSal ;
   private java.util.Date AV86DevCruFec ;
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
   private boolean brkAHP5 ;
   private boolean returnInSub ;
   private String A3554SalExtObs ;
   private String AV46SalExtObs ;
   private String AV77ReportInPut ;
   private String AV69TextoGenerar ;
   private String AV73Url ;
   private String AV104Imagen_GXI ;
   private String A11662BarOrdComp ;
   private String AV92RutaImagenMarcaAgua ;
   private String AV105Marcaaguaimagen_GXI ;
   private String AV68Imagen ;
   private String AV91MarcaAguaImagen ;
   private String Marcaaguaimagen ;
   private String Imagen ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHP2_A396EmprCod ;
   private String[] P0AHP2_A407EmprNom ;
   private boolean[] P0AHP2_n407EmprNom ;
   private String[] P0AHP2_A8335EmpItm2 ;
   private boolean[] P0AHP2_n8335EmpItm2 ;
   private String[] P0AHP2_A8334EmpItm1 ;
   private boolean[] P0AHP2_n8334EmpItm1 ;
   private String[] P0AHP2_A8337EmpItm4 ;
   private boolean[] P0AHP2_n8337EmpItm4 ;
   private String[] P0AHP2_A8336EmpItm3 ;
   private boolean[] P0AHP2_n8336EmpItm3 ;
   private String[] P0AHP2_A395EmprCif ;
   private boolean[] P0AHP2_n395EmprCif ;
   private String[] P0AHP3_A3554SalExtObs ;
   private String[] P0AHP3_A396EmprCod ;
   private int[] P0AHP3_A2253SalExtAlb ;
   private String[] P0AHP3_A14348SalExtATCU ;
   private String[] P0AHP3_A10080SalSts ;
   private java.util.Date[] P0AHP3_A2256SalExtFec ;
   private String[] P0AHP3_A10077SalFmd ;
   private String[] P0AHP3_A10743ManCp2 ;
   private boolean[] P0AHP3_n10743ManCp2 ;
   private String[] P0AHP3_A2252ManCpo ;
   private boolean[] P0AHP3_n2252ManCpo ;
   private String[] P0AHP3_A14349SalExtSerA ;
   private String[] P0AHP3_A14350SalExtTipA ;
   private java.util.Date[] P0AHP3_A14398SalFecSal ;
   private String[] P0AHP3_A10742SalCodeID ;
   private byte[] P0AHP3_A2258SalExtLis ;
   private byte[] P0AHP3_A10741SalEnvAT ;
   private String[] P0AHP3_A6396SalExtHor ;
   private String[] P0AHP3_A6397SalExtMat ;
   private short[] P0AHP3_A2248ManCod ;
   private String[] P0AHP3_A3302ManNif ;
   private boolean[] P0AHP3_n3302ManNif ;
   private String[] P0AHP3_A2251ManPob ;
   private boolean[] P0AHP3_n2251ManPob ;
   private String[] P0AHP3_A2250ManDom ;
   private boolean[] P0AHP3_n2250ManDom ;
   private String[] P0AHP3_A2249ManNom ;
   private boolean[] P0AHP3_n2249ManNom ;
   private String[] P0AHP4_A396EmprCod ;
   private int[] P0AHP4_A2253SalExtAlb ;
   private String[] P0AHP4_A6558FasCodn ;
   private String[] P0AHP4_A14410FasDscMn ;
   private String[] P0AHP4_A6249SalExObs ;
   private String[] P0AHP4_A130BarCodPar ;
   private byte[] P0AHP4_A132BarCodReo ;
   private int[] P0AHP4_A129BarCod ;
   private int[] P0AHP4_A361DisCod ;
   private String[] P0AHP4_A11662BarOrdComp ;
   private String[] P0AHP4_A181BarMaqPro ;
   private int[] P0AHP4_A136BarColNum ;
   private String[] P0AHP4_A135BarColNom ;
   private int[] P0AHP4_A6257SalExCoE ;
   private java.math.BigDecimal[] P0AHP4_A6256SalExKgE ;
   private String[] P0AHP4_A1652BarSerDsc ;
   private short[] P0AHP4_A1909BarGraAca ;
   private short[] P0AHP4_A125BarAncAca1 ;
   private String[] P0AHP4_A2829BarProPer ;
   private String[] P0AHP4_A143BarDisNum ;
   private short[] P0AHP4_A6248SalExNln ;
   private int[] P0AHP6_A44AlbRecCod ;
   private String[] P0AHP6_A396EmprCod ;
   private String[] P0AHP6_A130BarCodPar ;
   private byte[] P0AHP6_A132BarCodReo ;
   private int[] P0AHP6_A129BarCod ;
   private String[] P0AHP6_A8028AlbNumB ;
   private String[] P0AHP6_A6463AlbRLote ;
   private java.math.BigDecimal[] P0AHP6_A6465AlbRLu ;
   private String[] P0AHP6_A4602AlbRMdlCod ;
   private String[] P0AHP6_A6464AlbRTelar ;
   private String[] P0AHP6_A8035AlbMaqTej ;
   private String[] P0AHP6_A200BarPieCod ;
   private String[] P0AHP7_A396EmprCod ;
   private int[] P0AHP7_A361DisCod ;
   private String[] P0AHP7_A377DisObsTxt ;
   private byte[] P0AHP7_A376DisObsLin ;
   private com.genexus.webpanels.WebSession AV96WEBSession ;
}

final  class pmod0112__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHP2", "SELECT EmprCod, EmprNom, EmpItm2, EmpItm1, EmpItm4, EmpItm3, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AHP3", "SELECT T1.SalExtObs, T1.EmprCod, T1.SalExtAlb, T1.SalExtATCU, T1.SalSts, T1.SalExtFec, T1.SalFmd, T2.ManCp2, T2.ManCpo, T1.SalExtSerA, T1.SalExtTipA, T1.SalFecSal, T1.SalCodeID, T1.SalExtLis, T1.SalEnvAT, T1.SalExtHor, T1.SalExtMat, T1.ManCod, T2.ManNif, T2.ManPob, T2.ManDom, T2.ManNom FROM (TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb  FOR UPDATE OF T1.SalExtLis NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AHP4", "SELECT T1.EmprCod, T1.SalExtAlb, T1.FasCodn, T1.FasDscMn, T1.SalExObs, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisCod, T2.BarOrdComp, T2.BarMaqPro, T2.BarColNum, T2.BarColNom, T1.SalExCoE, T1.SalExKgE, T2.BarSerDsc, T2.BarGraAca, T2.BarAncAca1, T2.BarProPer, T2.BarDisNum, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AHP5", "UPDATE TXPCEXTSA SET SalExtLis=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
         ,new ForEachCursor("P0AHP6", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbNumB, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHP7", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 26);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 8);
               ((short[]) buf[20])[0] = rslt.getShort(21);
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

