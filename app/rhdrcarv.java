package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrcarv extends GXReport
{
   public rhdrcarv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrcarv.class ), "" );
   }

   public rhdrcarv( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String[] aP6 )
   {
      rhdrcarv.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      rhdrcarv.this.AV84PathFile = aP0;
      rhdrcarv.this.A396EmprCod = aP1;
      rhdrcarv.this.A129BarCod = aP2;
      rhdrcarv.this.A132BarCodReo = aP3;
      rhdrcarv.this.A130BarCodPar = aP4;
      rhdrcarv.this.AV15ImpCod = aP5;
      rhdrcarv.this.Gx_out = aP6[0];
      this.aP6 = aP6;
      rhdrcarv.this.AV80TextoCopia = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 2 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV84PathFile) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV74ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRCARV", ""), GXv_char1) ;
         rhdrcarv.this.AV74ContDsc = GXv_char1[0] ;
         AV16Termin = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P06UV2 */
         pr_default.execute(0, new Object[] {AV16Termin, Boolean.valueOf(n396EmprCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A942TermCod = P06UV2_A942TermCod[0] ;
            A1189TermUsu = P06UV2_A1189TermUsu[0] ;
            n1189TermUsu = P06UV2_n1189TermUsu[0] ;
            AV17TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06UV4 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P06UV4_A833TipDefCod[0] ;
            n833TipDefCod = P06UV4_n833TipDefCod[0] ;
            A218BarTipCol = P06UV4_A218BarTipCol[0] ;
            A361DisCod = P06UV4_A361DisCod[0] ;
            A148BarEstReo = P06UV4_A148BarEstReo[0] ;
            A834TipDefDsc = P06UV4_A834TipDefDsc[0] ;
            n834TipDefDsc = P06UV4_n834TipDefDsc[0] ;
            A252CliCod = P06UV4_A252CliCod[0] ;
            n252CliCod = P06UV4_n252CliCod[0] ;
            A212BarSer = P06UV4_A212BarSer[0] ;
            A135BarColNom = P06UV4_A135BarColNom[0] ;
            A136BarColNum = P06UV4_A136BarColNum[0] ;
            A213BarSit = P06UV4_A213BarSit[0] ;
            A3644CliNom1 = P06UV4_A3644CliNom1[0] ;
            A279CliNom = P06UV4_A279CliNom[0] ;
            A155BarFecCli = P06UV4_A155BarFecCli[0] ;
            A1503BarPart = P06UV4_A1503BarPart[0] ;
            A1235BarNumCli = P06UV4_A1235BarNumCli[0] ;
            A1234BarNomCli = P06UV4_A1234BarNomCli[0] ;
            A143BarDisNum = P06UV4_A143BarDisNum[0] ;
            A217BarTipArt = P06UV4_A217BarTipArt[0] ;
            n217BarTipArt = P06UV4_n217BarTipArt[0] ;
            A180BarMaqCod = P06UV4_A180BarMaqCod[0] ;
            A1909BarGraAca = P06UV4_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P06UV4_A3137BarGraAca2[0] ;
            A125BarAncAca1 = P06UV4_A125BarAncAca1[0] ;
            A126BarAncAca2 = P06UV4_A126BarAncAca2[0] ;
            A1224BarEncAnh = P06UV4_A1224BarEncAnh[0] ;
            A1223BarEncCom = P06UV4_A1223BarEncCom[0] ;
            A1431BarLocDis = P06UV4_A1431BarLocDis[0] ;
            A5351BarObsGrm = P06UV4_A5351BarObsGrm[0] ;
            A5352BarObsAnc = P06UV4_A5352BarObsAnc[0] ;
            A2454BarGirar = P06UV4_A2454BarGirar[0] ;
            A1652BarSerDsc = P06UV4_A1652BarSerDsc[0] ;
            A234BarUrdP3 = P06UV4_A234BarUrdP3[0] ;
            A233BarUrdP2 = P06UV4_A233BarUrdP2[0] ;
            A232BarUrdP1 = P06UV4_A232BarUrdP1[0] ;
            A226BarTraP3 = P06UV4_A226BarTraP3[0] ;
            A225BarTraP2 = P06UV4_A225BarTraP2[0] ;
            A224BarTraP1 = P06UV4_A224BarTraP1[0] ;
            A231BarUrd3 = P06UV4_A231BarUrd3[0] ;
            A230BarUrd2 = P06UV4_A230BarUrd2[0] ;
            A229BarUrd1 = P06UV4_A229BarUrd1[0] ;
            A223BarTra3 = P06UV4_A223BarTra3[0] ;
            A222BarTra2 = P06UV4_A222BarTra2[0] ;
            A221BarTra1 = P06UV4_A221BarTra1[0] ;
            A4466BarAcaAnh = P06UV4_A4466BarAcaAnh[0] ;
            A158BarFecFpr = P06UV4_A158BarFecFpr[0] ;
            A166BarKgm = P06UV4_A166BarKgm[0] ;
            A199BarPie1 = P06UV4_A199BarPie1[0] ;
            A365DisDes = P06UV4_A365DisDes[0] ;
            A898BarPieNDes = P06UV4_A898BarPieNDes[0] ;
            A834TipDefDsc = P06UV4_A834TipDefDsc[0] ;
            n834TipDefDsc = P06UV4_n834TipDefDsc[0] ;
            A3644CliNom1 = P06UV4_A3644CliNom1[0] ;
            A279CliNom = P06UV4_A279CliNom[0] ;
            A166BarKgm = P06UV4_A166BarKgm[0] ;
            A199BarPie1 = P06UV4_A199BarPie1[0] ;
            A898BarPieNDes = P06UV4_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV82DistraID = "" ;
            /* Using cursor P06UV5 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13376DisTraID = P06UV5_A13376DisTraID[0] ;
               AV82DistraID = A13376DisTraID ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV83Normas = "" ;
            /* Using cursor P06UV6 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A13213DisNormID = P06UV6_A13213DisNormID[0] ;
               if ( GXutil.strcmp(AV83Normas, "") == 0 )
               {
                  AV83Normas = GXutil.trim( A13213DisNormID) ;
               }
               else
               {
                  AV83Normas += "/" + GXutil.trim( A13213DisNormID) ;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV67MacCod = 0 ;
            GXv_int2[0] = AV67MacCod ;
            new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int2) ;
            rhdrcarv.this.AV67MacCod = GXv_int2[0] ;
            AV77TotKgs = A166BarKgm ;
            AV31EmprCod = A396EmprCod ;
            AV45DetPzas = (short)(A898BarPieNDes) ;
            AV59Ceros8 = "00000000" ;
            AV60HdrAlfa = GXutil.ltrim( GXutil.rtrim( AV60HdrAlfa)) ;
            AV61LenVar = (byte)(GXutil.len( AV60HdrAlfa)) ;
            AV61LenVar = (byte)(8-AV61LenVar) ;
            AV60HdrAlfa = GXutil.substring( AV59Ceros8, 1, AV61LenVar) + AV60HdrAlfa ;
            if ( GXutil.strcmp(A130BarCodPar, " ") == 0 )
            {
               AV35HojRut = "*" + AV60HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + "*" ;
            }
            else
            {
               AV35HojRut = "*" + AV60HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            }
            AV35HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            AV49Remonta = "" ;
            AV78Texto = GXutil.space( (short)(20)) ;
            if ( A148BarEstReo == 2 )
            {
               AV49Remonta = httpContext.getMessage( "Dev. ", "") + GXutil.substring( A834TipDefDsc, 1, 30) ;
               AV78Texto = httpContext.getMessage( "REM. EXT.", "") ;
            }
            if ( A148BarEstReo == 1 )
            {
               AV49Remonta = GXutil.substring( A834TipDefDsc, 1, 30) ;
               AV78Texto = httpContext.getMessage( "REM. INT.", "") ;
            }
            /* Using cursor P06UV7 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Byte.valueOf(A218BarTipCol)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A831TipColCod = P06UV7_A831TipColCod[0] ;
               AV27TipColDsc = A832TipColDsc ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            AV36CliCod = A252CliCod ;
            AV37ArtCod = A212BarSer ;
            AV41BarColNom = A135BarColNom ;
            AV42BarColNum = A136BarColNum ;
            AV43BarTipCol = A218BarTipCol ;
            /* Execute user subroutine: 'BUSCOL' */
            S121 ();
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
            AV70Sit = " " ;
            if ( A213BarSit == 2 )
            {
               AV70Sit = httpContext.getMessage( "(LAB)", "") ;
            }
            AV54DisCod = A361DisCod ;
            if ( (GXutil.strcmp("", AV53ALbRLoc)==0) )
            {
               /* Execute user subroutine: 'EMPESA' */
               S131 ();
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
            }
            AV79vCliNom = A279CliNom + GXutil.substring( A3644CliNom1, 1, 10) ;
            h6UV0( false, 61) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Doc. Cliente:", ""), 56, Gx_line+33, 165, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 173, Gx_line+33, 241, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 55, Gx_line+10, 123, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 131, Gx_line+10, 188, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "V/Refª Cor:", ""), 488, Gx_line+33, 581, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 589, Gx_line+33, 698, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), 704, Gx_line+33, 755, Gx_line+51, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(49, Gx_line+4, 764, Gx_line+55, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79vCliNom, "")), 191, Gx_line+10, 609, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PARTIDA:", ""), 630, Gx_line+10, 698, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9")), 721, Gx_line+10, 755, Gx_line+28, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data Enc.:", ""), 257, Gx_line+33, 341, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 344, Gx_line+33, 412, Gx_line+51, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+61) ;
            AV62TipArtCod = A217BarTipArt ;
            /* Execute user subroutine: 'TIPART' */
            S141 ();
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
            AV32MaqCod = A180BarMaqCod ;
            /* Execute user subroutine: 'DSCMAQ' */
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
            AV57BarGraAca = "" ;
            AV76BarGraAca2 = "" ;
            if ( (0==A1909BarGraAca) )
            {
               AV57BarGraAca = "??" ;
            }
            else
            {
               AV57BarGraAca = GXutil.str( A1909BarGraAca, 4, 0) ;
            }
            if ( (0==A3137BarGraAca2) )
            {
               AV76BarGraAca2 = "??" ;
            }
            else
            {
               AV76BarGraAca2 = GXutil.str( A3137BarGraAca2, 4, 0) ;
            }
            if ( ! (0==A1909BarGraAca) && (0==A3137BarGraAca2) )
            {
               AV76BarGraAca2 = " " ;
            }
            AV58BarAncAca1 = "" ;
            AV75BarAncAca2 = "" ;
            if ( (0==A125BarAncAca1) )
            {
               AV58BarAncAca1 = "??" ;
            }
            else
            {
               AV58BarAncAca1 = GXutil.str( A125BarAncAca1, 4, 0) ;
            }
            if ( (0==A126BarAncAca2) )
            {
               AV75BarAncAca2 = "??" ;
            }
            else
            {
               AV75BarAncAca2 = GXutil.str( A126BarAncAca2, 4, 0) ;
            }
            if ( ! (0==A125BarAncAca1) && (0==A126BarAncAca2) )
            {
               AV75BarAncAca2 = " " ;
            }
            AV71BarEncAnh = "" ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1224BarEncAnh)==0) )
            {
               AV71BarEncAnh = "??" ;
            }
            else
            {
               AV71BarEncAnh = GXutil.str( A1224BarEncAnh, 6, 2) ;
            }
            AV72BarEncCom = "" ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1223BarEncCom)==0) )
            {
               AV72BarEncCom = "??" ;
            }
            else
            {
               AV72BarEncCom = GXutil.str( A1223BarEncCom, 6, 2) ;
            }
            h6UV0( false, 198) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composição:", ""), 55, Gx_line+159, 148, Gx_line+177, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A221BarTra1, "")), 151, Gx_line+157, 185, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A222BarTra2, "")), 180, Gx_line+157, 214, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A223BarTra3, "")), 209, Gx_line+157, 243, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A229BarUrd1, "")), 239, Gx_line+157, 273, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A230BarUrd2, "")), 275, Gx_line+157, 309, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A231BarUrd3, "")), 311, Gx_line+157, 345, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gramagem (g/m2)", ""), 519, Gx_line+32, 645, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A224BarTraP1), "ZZ9")), 151, Gx_line+177, 177, Gx_line+195, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A225BarTraP2), "ZZ9")), 180, Gx_line+177, 206, Gx_line+195, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A226BarTraP3), "ZZ9")), 209, Gx_line+177, 235, Gx_line+195, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A232BarUrdP1), "ZZ9")), 247, Gx_line+177, 273, Gx_line+195, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A233BarUrdP2), "ZZ9")), 283, Gx_line+177, 309, Gx_line+195, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A234BarUrdP3), "ZZ9")), 320, Gx_line+177, 346, Gx_line+195, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Largura (cm)", ""), 361, Gx_line+32, 462, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71BarEncAnh, "")), 647, Gx_line+57, 698, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72BarEncCom, "")), 704, Gx_line+57, 755, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58BarAncAca1, "")), 383, Gx_line+57, 409, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57BarGraAca, "")), 520, Gx_line+57, 554, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor/Serviço:", ""), 55, Gx_line+8, 156, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 161, Gx_line+7, 297, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 125, Gx_line+73, 189, Gx_line+93, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 259, Gx_line+73, 281, Gx_line+93, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 55, Gx_line+118, 114, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 124, Gx_line+118, 258, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 125, Gx_line+136, 397, Gx_line+156, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(49, Gx_line+3, 764, Gx_line+198, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(341, Gx_line+6, 759, Gx_line+96, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quantidade Entrada", ""), 449, Gx_line+109, 600, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(418, Gx_line+110, 631, Gx_line+184, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(Kg)", ""), 459, Gx_line+134, 489, Gx_line+149, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 428, Gx_line+156, 523, Gx_line+176, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 553, Gx_line+155, 617, Gx_line+175, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 555, Gx_line+134, 592, Gx_line+149, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(528, Gx_line+130, 528, Gx_line+184, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Parametros de Acabamento", ""), 450, Gx_line+9, 651, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Enc.", ""), 656, Gx_line+31, 690, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(342, Gx_line+28, 758, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Torção", ""), 704, Gx_line+31, 755, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(342, Gx_line+51, 758, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(495, Gx_line+28, 495, Gx_line+96, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(645, Gx_line+28, 645, Gx_line+96, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(699, Gx_line+28, 699, Gx_line+96, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(418, Gx_line+130, 631, Gx_line+130, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(418, Gx_line+151, 631, Gx_line+151, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localização", ""), 658, Gx_line+97, 751, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53ALbRLoc, "")), 652, Gx_line+128, 757, Gx_line+148, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Numero:", ""), 55, Gx_line+74, 114, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tc:", ""), 226, Gx_line+74, 252, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 675, Gx_line+109, 734, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75BarAncAca2, "")), 425, Gx_line+57, 451, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76BarGraAca2, "")), 565, Gx_line+57, 599, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV52ALbRfen, "99/99/99"), 661, Gx_line+168, 745, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data Entrada", ""), 651, Gx_line+149, 752, Gx_line+166, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cartaz:", ""), 55, Gx_line+50, 114, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2454BarGirar, "")), 125, Gx_line+49, 334, Gx_line+69, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5352BarObsAnc, "")), 345, Gx_line+77, 492, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5351BarObsGrm, "")), 498, Gx_line+79, 645, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1431BarLocDis, "")), 152, Gx_line+96, 257, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Ensaio:", ""), 55, Gx_line+97, 139, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82DistraID, "")), 298, Gx_line+7, 341, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Certificação:", ""), 55, Gx_line+29, 164, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Normas, "")), 165, Gx_line+28, 270, Gx_line+48, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+198) ;
            h6UV0( false, 33) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 63, Gx_line+17, 156, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+11, 764, Gx_line+11, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+13, 49, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+11, 763, Gx_line+33, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            /* Using cursor P06UV8 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A187BarNotDsc = P06UV8_A187BarNotDsc[0] ;
               A188BarNotLin = P06UV8_A188BarNotLin[0] ;
               h6UV0( false, 17) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A187BarNotDsc, "")), 170, Gx_line+0, 713, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            h6UV0( false, 17) ;
            getPrinter().GxDrawLine(49, Gx_line+6, 764, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+7, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( A4466BarAcaAnh > 0 )
            {
               GXv_char1[0] = A396EmprCod ;
               GXv_int3[0] = A4466BarAcaAnh ;
               GXv_char4[0] = AV81Tb1_dsc ;
               new app.pptable1(remoteHandle, context).execute( GXv_char1, GXv_int3, GXv_char4) ;
               rhdrcarv.this.A396EmprCod = GXv_char1[0] ;
               rhdrcarv.this.A4466BarAcaAnh = GXv_int3[0] ;
               rhdrcarv.this.AV81Tb1_dsc = GXv_char4[0] ;
               h6UV0( false, 28) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Tb1_dsc, "")), 113, Gx_line+6, 697, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(47, Gx_line+2, 762, Gx_line+26, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
            }
            h6UV0( false, 25) ;
            getPrinter().GxDrawRect(49, Gx_line+0, 764, Gx_line+19, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PROCESSOS PRODUÇAO", ""), 313, Gx_line+0, 502, Gx_line+19, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+25) ;
            /* Using cursor P06UV9 */
            pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A761ProFasLin = P06UV9_A761ProFasLin[0] ;
               n761ProFasLin = P06UV9_n761ProFasLin[0] ;
               A759ProDsc = P06UV9_A759ProDsc[0] ;
               A758ProCod = P06UV9_A758ProCod[0] ;
               A759ProDsc = P06UV9_A759ProDsc[0] ;
               h6UV0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 67, Gx_line+0, 126, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 133, Gx_line+0, 426, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            h6UV0( false, 6) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+6) ;
            h6UV0( false, 44) ;
            getPrinter().GxDrawRect(49, Gx_line+1, 764, Gx_line+20, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FASES DE PRODUÇÃO", ""), 317, Gx_line+1, 495, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+19, 49, Gx_line+44, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+19, 763, Gx_line+44, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 661, Gx_line+25, 690, Gx_line+39, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+44) ;
            /* Using cursor P06UV10 */
            pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A603MaqCodBis = P06UV10_A603MaqCodBis[0] ;
               A460FasDsc = P06UV10_A460FasDsc[0] ;
               A457FasCod = P06UV10_A457FasCod[0] ;
               A194BarOrdLin = P06UV10_A194BarOrdLin[0] ;
               A758ProCod = P06UV10_A758ProCod[0] ;
               A460FasDsc = P06UV10_A460FasDsc[0] ;
               AV32MaqCod = A603MaqCodBis ;
               /* Execute user subroutine: 'DSCMAQ' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
                  pr_default.close(7);
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
               h6UV0( false, 18) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 69, Gx_line+0, 137, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 160, Gx_line+0, 394, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(594, Gx_line+16, 759, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), 463, Gx_line+0, 514, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV66ContLin = (byte)(AV66ContLin+1) ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            h6UV0( false, 17) ;
            getPrinter().GxDrawLine(49, Gx_line+9, 764, Gx_line+9, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+9, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+10, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV66ContLin = (byte)(AV66ContLin+1) ;
            AV33Contador = (byte)(1) ;
            /* Using cursor P06UV11 */
            pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV67MacCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A1199MacCod = P06UV11_A1199MacCod[0] ;
               A1205MacBarPar = P06UV11_A1205MacBarPar[0] ;
               A1204MacBarReo = P06UV11_A1204MacBarReo[0] ;
               A1203MacBarCod = P06UV11_A1203MacBarCod[0] ;
               A1201MacLin = P06UV11_A1201MacLin[0] ;
               if ( ( A129BarCod == A1203MacBarCod ) && ( A132BarCodReo == A1204MacBarReo ) && ( GXutil.strcmp(A1205MacBarPar, A130BarCodPar) == 0 ) )
               {
               }
               else
               {
                  GXv_decimal5[0] = AV68KgmAgr ;
                  GXv_char4[0] = AV65ArtDscAGr ;
                  GXv_char1[0] = AV64ObsTxt ;
                  GXv_int2[0] = AV73Pecas ;
                  new app.pobsagr(remoteHandle, context).execute( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, GXv_decimal5, GXv_char4, GXv_char1, GXv_int2) ;
                  rhdrcarv.this.AV68KgmAgr = GXv_decimal5[0] ;
                  rhdrcarv.this.AV65ArtDscAGr = GXv_char4[0] ;
                  rhdrcarv.this.AV64ObsTxt = GXv_char1[0] ;
                  rhdrcarv.this.AV73Pecas = (short)((short)(GXv_int2[0])) ;
                  AV77TotKgs = AV77TotKgs.add(AV68KgmAgr) ;
                  if ( AV33Contador == 1 )
                  {
                     AV33Contador = (byte)(2) ;
                     h6UV0( false, 34) ;
                     getPrinter().GxDrawRect(49, Gx_line+0, 764, Gx_line+24, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ACESSÓRIOS", ""), 359, Gx_line+3, 464, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Macro =", ""), 643, Gx_line+4, 695, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67MacCod), "ZZZZZZZ9")), 696, Gx_line+4, 755, Gx_line+21, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(49, Gx_line+26, 49, Gx_line+34, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(763, Gx_line+26, 763, Gx_line+34, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+34) ;
                     AV66ContLin = (byte)(AV66ContLin+3) ;
                  }
                  h6UV0( false, 20) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64ObsTxt, "")), 539, Gx_line+2, 759, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65ArtDscAGr, "")), 168, Gx_line+3, 336, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1203MacBarCod), "ZZZZZZZ9")), 53, Gx_line+2, 121, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1205MacBarPar, "")), 154, Gx_line+2, 163, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1204MacBarReo), "9")), 140, Gx_line+2, 149, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("-", 125, Gx_line+2, 134, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68KgmAgr, "ZZZZZ9.99")), 414, Gx_line+2, 481, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73Pecas), "ZZZ9")), 341, Gx_line+2, 371, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "peça c/", ""), 376, Gx_line+4, 413, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 485, Gx_line+4, 502, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Obs.", ""), 515, Gx_line+4, 537, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+20, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+20, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
                  AV66ContLin = (byte)(AV66ContLin+1) ;
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
            if ( AV33Contador == 2 )
            {
               h6UV0( false, 13) ;
               getPrinter().GxDrawLine(49, Gx_line+7, 764, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+8, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+8, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+13) ;
               AV66ContLin = (byte)(AV66ContLin+1) ;
            }
            if ( AV33Contador == 2 )
            {
               h6UV0( false, 21) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77TotKgs, "ZZZZZ9.99")), 351, Gx_line+2, 446, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Partida", ""), 264, Gx_line+4, 341, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6UV0( true, 0) ;
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
      /* 'DSCMAQ' Routine */
      returnInSub = false ;
      AV30MaqDsc = "" ;
      /* Using cursor P06UV12 */
      pr_default.execute(9, new Object[] {AV31EmprCod, AV32MaqCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A602MaqCod = P06UV12_A602MaqCod[0] ;
         A606MaqDsc = P06UV12_A606MaqDsc[0] ;
         n606MaqDsc = P06UV12_n606MaqDsc[0] ;
         AV30MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BUSCOL' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int2[0] = AV36CliCod ;
      GXv_char1[0] = AV37ArtCod ;
      GXv_char6[0] = AV41BarColNom ;
      GXv_int7[0] = AV42BarColNum ;
      GXv_int8[0] = A218BarTipCol ;
      GXv_int9[0] = AV28IntCod ;
      GXv_char10[0] = AV29IntDsc ;
      GXv_char11[0] = AV39ForColNom ;
      GXv_int12[0] = AV40ForColNum ;
      new app.pbusint(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_char1, GXv_char6, GXv_int7, GXv_int8, GXv_int9, GXv_char10, GXv_char11, GXv_int12) ;
      rhdrcarv.this.A396EmprCod = GXv_char4[0] ;
      rhdrcarv.this.AV36CliCod = GXv_int2[0] ;
      rhdrcarv.this.AV37ArtCod = GXv_char1[0] ;
      rhdrcarv.this.AV41BarColNom = GXv_char6[0] ;
      rhdrcarv.this.AV42BarColNum = GXv_int7[0] ;
      rhdrcarv.this.A218BarTipCol = GXv_int8[0] ;
      rhdrcarv.this.AV28IntCod = GXv_int9[0] ;
      rhdrcarv.this.AV29IntDsc = GXv_char10[0] ;
      rhdrcarv.this.AV39ForColNom = GXv_char11[0] ;
      rhdrcarv.this.AV40ForColNum = GXv_int12[0] ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'EMPESA' Routine */
      returnInSub = false ;
      AV50AlbREnt = "" ;
      AV52ALbRfen = GXutil.nullDate() ;
      AV53ALbRLoc = "" ;
      AV51ProceNom = "" ;
      /* Using cursor P06UV13 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV54DisCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A970ProceCod = P06UV13_A970ProceCod[0] ;
         n970ProceCod = P06UV13_n970ProceCod[0] ;
         A361DisCod = P06UV13_A361DisCod[0] ;
         A46AlbREnt = P06UV13_A46AlbREnt[0] ;
         A49AlbRFen = P06UV13_A49AlbRFen[0] ;
         A50AlbRLoc = P06UV13_A50AlbRLoc[0] ;
         A971ProceNom = P06UV13_A971ProceNom[0] ;
         n971ProceNom = P06UV13_n971ProceNom[0] ;
         A44AlbRecCod = P06UV13_A44AlbRecCod[0] ;
         A970ProceCod = P06UV13_A970ProceCod[0] ;
         n970ProceCod = P06UV13_n970ProceCod[0] ;
         A46AlbREnt = P06UV13_A46AlbREnt[0] ;
         A49AlbRFen = P06UV13_A49AlbRFen[0] ;
         A50AlbRLoc = P06UV13_A50AlbRLoc[0] ;
         A971ProceNom = P06UV13_A971ProceNom[0] ;
         n971ProceNom = P06UV13_n971ProceNom[0] ;
         AV50AlbREnt = A46AlbREnt ;
         AV52ALbRfen = A49AlbRFen ;
         AV53ALbRLoc = A50AlbRLoc ;
         AV51ProceNom = A971ProceNom ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV63TipARtDsc = "" ;
      /* Using cursor P06UV14 */
      pr_default.execute(11, new Object[] {AV31EmprCod, Short.valueOf(AV62TipArtCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A829TipArtCod = P06UV14_A829TipArtCod[0] ;
         A830TipArtDsc = P06UV14_A830TipArtDsc[0] ;
         n830TipArtDsc = P06UV14_n830TipArtDsc[0] ;
         AV63TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void h6UV0( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "Hora Emissão:", ""), 365, Gx_line+0, 461, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 468, Gx_line+0, 527, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Utilizador:", ""), 578, Gx_line+0, 659, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TermUsu, "@!")), 679, Gx_line+0, 738, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74ContDsc, "")), 49, Gx_line+0, 133, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
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
               getPrinter().GxAttris("Microsoft Sans Serif", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35HojRut, "")), 536, Gx_line+84, 700, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço:", ""), 238, Gx_line+84, 356, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 364, Gx_line+84, 457, Gx_line+108, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 486, Gx_line+84, 498, Gx_line+108, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 509, Gx_line+84, 521, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Entrega:", ""), 238, Gx_line+109, 355, Gx_line+126, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A158BarFecFpr, "99/99/99"), 364, Gx_line+109, 448, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("-", 464, Gx_line+84, 475, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(234, Gx_line+74, 764, Gx_line+135, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Texto, "")), 234, Gx_line+13, 506, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Remonta, "")), 234, Gx_line+45, 600, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 693, Gx_line+56, 752, Gx_line+73, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("(", 680, Gx_line+57, 685, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(")", 759, Gx_line+57, 764, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Carvema Têxtil, Lda.", ""), 49, Gx_line+107, 219, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TextoCopia, "")), 671, Gx_line+16, 766, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(49, Gx_line+31, 210, Gx_line+90, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Kg)", ""), 73, Gx_line+16, 98, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(153, Gx_line+31, 153, Gx_line+90, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 160, Gx_line+16, 197, Gx_line+30, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+141) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP6[0] = rhdrcarv.this.Gx_out;
      this.aP7[0] = rhdrcarv.this.AV80TextoCopia;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV74ContDsc = "" ;
      AV16Termin = "" ;
      scmdbuf = "" ;
      P06UV2_A396EmprCod = new String[] {""} ;
      P06UV2_n396EmprCod = new boolean[] {false} ;
      P06UV2_A942TermCod = new String[] {""} ;
      P06UV2_A1189TermUsu = new String[] {""} ;
      P06UV2_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV17TermUsu = "" ;
      P06UV4_A833TipDefCod = new short[1] ;
      P06UV4_n833TipDefCod = new boolean[] {false} ;
      P06UV4_A396EmprCod = new String[] {""} ;
      P06UV4_n396EmprCod = new boolean[] {false} ;
      P06UV4_A129BarCod = new int[1] ;
      P06UV4_A132BarCodReo = new byte[1] ;
      P06UV4_A130BarCodPar = new String[] {""} ;
      P06UV4_A218BarTipCol = new byte[1] ;
      P06UV4_A361DisCod = new int[1] ;
      P06UV4_A148BarEstReo = new byte[1] ;
      P06UV4_A834TipDefDsc = new String[] {""} ;
      P06UV4_n834TipDefDsc = new boolean[] {false} ;
      P06UV4_A252CliCod = new int[1] ;
      P06UV4_n252CliCod = new boolean[] {false} ;
      P06UV4_A212BarSer = new String[] {""} ;
      P06UV4_A135BarColNom = new String[] {""} ;
      P06UV4_A136BarColNum = new int[1] ;
      P06UV4_A213BarSit = new byte[1] ;
      P06UV4_A3644CliNom1 = new String[] {""} ;
      P06UV4_A279CliNom = new String[] {""} ;
      P06UV4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P06UV4_A1503BarPart = new short[1] ;
      P06UV4_A1235BarNumCli = new int[1] ;
      P06UV4_A1234BarNomCli = new String[] {""} ;
      P06UV4_A143BarDisNum = new String[] {""} ;
      P06UV4_A217BarTipArt = new short[1] ;
      P06UV4_n217BarTipArt = new boolean[] {false} ;
      P06UV4_A180BarMaqCod = new String[] {""} ;
      P06UV4_A1909BarGraAca = new short[1] ;
      P06UV4_A3137BarGraAca2 = new short[1] ;
      P06UV4_A125BarAncAca1 = new short[1] ;
      P06UV4_A126BarAncAca2 = new short[1] ;
      P06UV4_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06UV4_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06UV4_A1431BarLocDis = new String[] {""} ;
      P06UV4_A5351BarObsGrm = new String[] {""} ;
      P06UV4_A5352BarObsAnc = new String[] {""} ;
      P06UV4_A2454BarGirar = new String[] {""} ;
      P06UV4_A1652BarSerDsc = new String[] {""} ;
      P06UV4_A234BarUrdP3 = new short[1] ;
      P06UV4_A233BarUrdP2 = new short[1] ;
      P06UV4_A232BarUrdP1 = new short[1] ;
      P06UV4_A226BarTraP3 = new short[1] ;
      P06UV4_A225BarTraP2 = new short[1] ;
      P06UV4_A224BarTraP1 = new short[1] ;
      P06UV4_A231BarUrd3 = new String[] {""} ;
      P06UV4_A230BarUrd2 = new String[] {""} ;
      P06UV4_A229BarUrd1 = new String[] {""} ;
      P06UV4_A223BarTra3 = new String[] {""} ;
      P06UV4_A222BarTra2 = new String[] {""} ;
      P06UV4_A221BarTra1 = new String[] {""} ;
      P06UV4_A4466BarAcaAnh = new short[1] ;
      P06UV4_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P06UV4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06UV4_A199BarPie1 = new short[1] ;
      P06UV4_A365DisDes = new String[] {""} ;
      P06UV4_A898BarPieNDes = new int[1] ;
      A834TipDefDsc = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      A180BarMaqCod = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1431BarLocDis = "" ;
      A5351BarObsGrm = "" ;
      A5352BarObsAnc = "" ;
      A2454BarGirar = "" ;
      A1652BarSerDsc = "" ;
      A231BarUrd3 = "" ;
      A230BarUrd2 = "" ;
      A229BarUrd1 = "" ;
      A223BarTra3 = "" ;
      A222BarTra2 = "" ;
      A221BarTra1 = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV82DistraID = "" ;
      P06UV5_A396EmprCod = new String[] {""} ;
      P06UV5_n396EmprCod = new boolean[] {false} ;
      P06UV5_A361DisCod = new int[1] ;
      P06UV5_A13376DisTraID = new String[] {""} ;
      A13376DisTraID = "" ;
      AV83Normas = "" ;
      P06UV6_A396EmprCod = new String[] {""} ;
      P06UV6_n396EmprCod = new boolean[] {false} ;
      P06UV6_A361DisCod = new int[1] ;
      P06UV6_A13213DisNormID = new String[] {""} ;
      A13213DisNormID = "" ;
      AV77TotKgs = DecimalUtil.ZERO ;
      AV31EmprCod = "" ;
      AV59Ceros8 = "" ;
      AV60HdrAlfa = "" ;
      AV35HojRut = "" ;
      AV49Remonta = "" ;
      AV78Texto = "" ;
      P06UV7_A396EmprCod = new String[] {""} ;
      P06UV7_n396EmprCod = new boolean[] {false} ;
      P06UV7_A831TipColCod = new byte[1] ;
      AV27TipColDsc = "" ;
      A832TipColDsc = "" ;
      AV37ArtCod = "" ;
      AV41BarColNom = "" ;
      AV70Sit = "" ;
      AV53ALbRLoc = "" ;
      AV79vCliNom = "" ;
      AV32MaqCod = "" ;
      AV57BarGraAca = "" ;
      AV76BarGraAca2 = "" ;
      AV58BarAncAca1 = "" ;
      AV75BarAncAca2 = "" ;
      AV71BarEncAnh = "" ;
      AV72BarEncCom = "" ;
      AV52ALbRfen = GXutil.nullDate() ;
      P06UV8_A396EmprCod = new String[] {""} ;
      P06UV8_n396EmprCod = new boolean[] {false} ;
      P06UV8_A129BarCod = new int[1] ;
      P06UV8_A132BarCodReo = new byte[1] ;
      P06UV8_A130BarCodPar = new String[] {""} ;
      P06UV8_A187BarNotDsc = new String[] {""} ;
      P06UV8_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      GXv_int3 = new short[1] ;
      AV81Tb1_dsc = "" ;
      P06UV9_A396EmprCod = new String[] {""} ;
      P06UV9_n396EmprCod = new boolean[] {false} ;
      P06UV9_A129BarCod = new int[1] ;
      P06UV9_A132BarCodReo = new byte[1] ;
      P06UV9_A130BarCodPar = new String[] {""} ;
      P06UV9_A761ProFasLin = new short[1] ;
      P06UV9_n761ProFasLin = new boolean[] {false} ;
      P06UV9_A759ProDsc = new String[] {""} ;
      P06UV9_A758ProCod = new String[] {""} ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      P06UV10_A396EmprCod = new String[] {""} ;
      P06UV10_n396EmprCod = new boolean[] {false} ;
      P06UV10_A129BarCod = new int[1] ;
      P06UV10_A132BarCodReo = new byte[1] ;
      P06UV10_A130BarCodPar = new String[] {""} ;
      P06UV10_A603MaqCodBis = new String[] {""} ;
      P06UV10_A460FasDsc = new String[] {""} ;
      P06UV10_A457FasCod = new String[] {""} ;
      P06UV10_A194BarOrdLin = new short[1] ;
      P06UV10_A758ProCod = new String[] {""} ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      P06UV11_A396EmprCod = new String[] {""} ;
      P06UV11_n396EmprCod = new boolean[] {false} ;
      P06UV11_A1199MacCod = new int[1] ;
      P06UV11_A1205MacBarPar = new String[] {""} ;
      P06UV11_A1204MacBarReo = new byte[1] ;
      P06UV11_A1203MacBarCod = new int[1] ;
      P06UV11_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV68KgmAgr = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV65ArtDscAGr = "" ;
      AV64ObsTxt = "" ;
      AV30MaqDsc = "" ;
      P06UV12_A602MaqCod = new String[] {""} ;
      P06UV12_A396EmprCod = new String[] {""} ;
      P06UV12_n396EmprCod = new boolean[] {false} ;
      P06UV12_A606MaqDsc = new String[] {""} ;
      P06UV12_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      AV29IntDsc = "" ;
      GXv_char10 = new String[1] ;
      AV39ForColNom = "" ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      AV50AlbREnt = "" ;
      AV51ProceNom = "" ;
      P06UV13_A970ProceCod = new short[1] ;
      P06UV13_n970ProceCod = new boolean[] {false} ;
      P06UV13_A396EmprCod = new String[] {""} ;
      P06UV13_n396EmprCod = new boolean[] {false} ;
      P06UV13_A361DisCod = new int[1] ;
      P06UV13_A46AlbREnt = new String[] {""} ;
      P06UV13_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06UV13_A50AlbRLoc = new String[] {""} ;
      P06UV13_A971ProceNom = new String[] {""} ;
      P06UV13_n971ProceNom = new boolean[] {false} ;
      P06UV13_A44AlbRecCod = new int[1] ;
      A46AlbREnt = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A50AlbRLoc = "" ;
      A971ProceNom = "" ;
      AV63TipARtDsc = "" ;
      P06UV14_A829TipArtCod = new short[1] ;
      P06UV14_A396EmprCod = new String[] {""} ;
      P06UV14_n396EmprCod = new boolean[] {false} ;
      P06UV14_A830TipArtDsc = new String[] {""} ;
      P06UV14_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrcarv__default(),
         new Object[] {
             new Object[] {
            P06UV2_A396EmprCod, P06UV2_n396EmprCod, P06UV2_A942TermCod, P06UV2_A1189TermUsu, P06UV2_n1189TermUsu
            }
            , new Object[] {
            P06UV4_A833TipDefCod, P06UV4_n833TipDefCod, P06UV4_A396EmprCod, P06UV4_A129BarCod, P06UV4_A132BarCodReo, P06UV4_A130BarCodPar, P06UV4_A218BarTipCol, P06UV4_A361DisCod, P06UV4_A148BarEstReo, P06UV4_A834TipDefDsc,
            P06UV4_n834TipDefDsc, P06UV4_A252CliCod, P06UV4_n252CliCod, P06UV4_A212BarSer, P06UV4_A135BarColNom, P06UV4_A136BarColNum, P06UV4_A213BarSit, P06UV4_A3644CliNom1, P06UV4_A279CliNom, P06UV4_A155BarFecCli,
            P06UV4_A1503BarPart, P06UV4_A1235BarNumCli, P06UV4_A1234BarNomCli, P06UV4_A143BarDisNum, P06UV4_A217BarTipArt, P06UV4_n217BarTipArt, P06UV4_A180BarMaqCod, P06UV4_A1909BarGraAca, P06UV4_A3137BarGraAca2, P06UV4_A125BarAncAca1,
            P06UV4_A126BarAncAca2, P06UV4_A1224BarEncAnh, P06UV4_A1223BarEncCom, P06UV4_A1431BarLocDis, P06UV4_A5351BarObsGrm, P06UV4_A5352BarObsAnc, P06UV4_A2454BarGirar, P06UV4_A1652BarSerDsc, P06UV4_A234BarUrdP3, P06UV4_A233BarUrdP2,
            P06UV4_A232BarUrdP1, P06UV4_A226BarTraP3, P06UV4_A225BarTraP2, P06UV4_A224BarTraP1, P06UV4_A231BarUrd3, P06UV4_A230BarUrd2, P06UV4_A229BarUrd1, P06UV4_A223BarTra3, P06UV4_A222BarTra2, P06UV4_A221BarTra1,
            P06UV4_A4466BarAcaAnh, P06UV4_A158BarFecFpr, P06UV4_A166BarKgm, P06UV4_A199BarPie1, P06UV4_A365DisDes, P06UV4_A898BarPieNDes
            }
            , new Object[] {
            P06UV5_A396EmprCod, P06UV5_A361DisCod, P06UV5_A13376DisTraID
            }
            , new Object[] {
            P06UV6_A396EmprCod, P06UV6_A361DisCod, P06UV6_A13213DisNormID
            }
            , new Object[] {
            P06UV7_A396EmprCod, P06UV7_A831TipColCod
            }
            , new Object[] {
            P06UV8_A396EmprCod, P06UV8_A129BarCod, P06UV8_A132BarCodReo, P06UV8_A130BarCodPar, P06UV8_A187BarNotDsc, P06UV8_A188BarNotLin
            }
            , new Object[] {
            P06UV9_A396EmprCod, P06UV9_A129BarCod, P06UV9_A132BarCodReo, P06UV9_A130BarCodPar, P06UV9_A761ProFasLin, P06UV9_n761ProFasLin, P06UV9_A759ProDsc, P06UV9_A758ProCod
            }
            , new Object[] {
            P06UV10_A396EmprCod, P06UV10_A129BarCod, P06UV10_A132BarCodReo, P06UV10_A130BarCodPar, P06UV10_A603MaqCodBis, P06UV10_A460FasDsc, P06UV10_A457FasCod, P06UV10_A194BarOrdLin, P06UV10_A758ProCod
            }
            , new Object[] {
            P06UV11_A396EmprCod, P06UV11_A1199MacCod, P06UV11_A1205MacBarPar, P06UV11_A1204MacBarReo, P06UV11_A1203MacBarCod, P06UV11_A1201MacLin
            }
            , new Object[] {
            P06UV12_A602MaqCod, P06UV12_A396EmprCod, P06UV12_A606MaqDsc, P06UV12_n606MaqDsc
            }
            , new Object[] {
            P06UV13_A970ProceCod, P06UV13_n970ProceCod, P06UV13_A396EmprCod, P06UV13_A361DisCod, P06UV13_A46AlbREnt, P06UV13_A49AlbRFen, P06UV13_A50AlbRLoc, P06UV13_A971ProceNom, P06UV13_n971ProceNom, P06UV13_A44AlbRecCod
            }
            , new Object[] {
            P06UV14_A829TipArtCod, P06UV14_A396EmprCod, P06UV14_A830TipArtDsc, P06UV14_n830TipArtDsc
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte A213BarSit ;
   private byte AV61LenVar ;
   private byte A831TipColCod ;
   private byte AV43BarTipCol ;
   private byte A188BarNotLin ;
   private byte AV66ContLin ;
   private byte AV33Contador ;
   private byte A1204MacBarReo ;
   private byte GXv_int8[] ;
   private byte AV28IntCod ;
   private byte GXv_int9[] ;
   private short A833TipDefCod ;
   private short A1503BarPart ;
   private short A217BarTipArt ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A234BarUrdP3 ;
   private short A233BarUrdP2 ;
   private short A232BarUrdP1 ;
   private short A226BarTraP3 ;
   private short A225BarTraP2 ;
   private short A224BarTraP1 ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short AV45DetPzas ;
   private short AV62TipArtCod ;
   private short GXv_int3[] ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A1201MacLin ;
   private short AV73Pecas ;
   private short A970ProceCod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV67MacCod ;
   private int AV36CliCod ;
   private int AV42BarColNum ;
   private int AV54DisCod ;
   private int Gx_OldLine ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int GXv_int2[] ;
   private int GXv_int7[] ;
   private int AV40ForColNum ;
   private int GXv_int12[] ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV77TotKgs ;
   private java.math.BigDecimal AV68KgmAgr ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15ImpCod ;
   private String Gx_out ;
   private String AV80TextoCopia ;
   private String AV74ContDsc ;
   private String AV16Termin ;
   private String scmdbuf ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV17TermUsu ;
   private String A834TipDefDsc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A3644CliNom1 ;
   private String A279CliNom ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A180BarMaqCod ;
   private String A1431BarLocDis ;
   private String A5351BarObsGrm ;
   private String A5352BarObsAnc ;
   private String A2454BarGirar ;
   private String A1652BarSerDsc ;
   private String A231BarUrd3 ;
   private String A230BarUrd2 ;
   private String A229BarUrd1 ;
   private String A223BarTra3 ;
   private String A222BarTra2 ;
   private String A221BarTra1 ;
   private String A365DisDes ;
   private String AV82DistraID ;
   private String A13376DisTraID ;
   private String AV83Normas ;
   private String A13213DisNormID ;
   private String AV31EmprCod ;
   private String AV59Ceros8 ;
   private String AV60HdrAlfa ;
   private String AV35HojRut ;
   private String AV49Remonta ;
   private String AV78Texto ;
   private String AV27TipColDsc ;
   private String A832TipColDsc ;
   private String AV37ArtCod ;
   private String AV41BarColNom ;
   private String AV70Sit ;
   private String AV53ALbRLoc ;
   private String AV79vCliNom ;
   private String AV32MaqCod ;
   private String AV57BarGraAca ;
   private String AV76BarGraAca2 ;
   private String AV58BarAncAca1 ;
   private String AV75BarAncAca2 ;
   private String AV71BarEncAnh ;
   private String AV72BarEncCom ;
   private String A187BarNotDsc ;
   private String AV81Tb1_dsc ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A1205MacBarPar ;
   private String AV65ArtDscAGr ;
   private String AV64ObsTxt ;
   private String AV30MaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String AV29IntDsc ;
   private String GXv_char10[] ;
   private String AV39ForColNom ;
   private String GXv_char11[] ;
   private String AV50AlbREnt ;
   private String AV51ProceNom ;
   private String A46AlbREnt ;
   private String A50AlbRLoc ;
   private String A971ProceNom ;
   private String AV63TipARtDsc ;
   private String A830TipArtDsc ;
   private String Gx_time ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV52ALbRfen ;
   private java.util.Date A49AlbRFen ;
   private boolean n396EmprCod ;
   private boolean n1189TermUsu ;
   private boolean GxHdr3 ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n606MaqDsc ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n830TipArtDsc ;
   private String AV84PathFile ;
   private String[] aP7 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P06UV2_A396EmprCod ;
   private boolean[] P06UV2_n396EmprCod ;
   private String[] P06UV2_A942TermCod ;
   private String[] P06UV2_A1189TermUsu ;
   private boolean[] P06UV2_n1189TermUsu ;
   private short[] P06UV4_A833TipDefCod ;
   private boolean[] P06UV4_n833TipDefCod ;
   private String[] P06UV4_A396EmprCod ;
   private boolean[] P06UV4_n396EmprCod ;
   private int[] P06UV4_A129BarCod ;
   private byte[] P06UV4_A132BarCodReo ;
   private String[] P06UV4_A130BarCodPar ;
   private byte[] P06UV4_A218BarTipCol ;
   private int[] P06UV4_A361DisCod ;
   private byte[] P06UV4_A148BarEstReo ;
   private String[] P06UV4_A834TipDefDsc ;
   private boolean[] P06UV4_n834TipDefDsc ;
   private int[] P06UV4_A252CliCod ;
   private boolean[] P06UV4_n252CliCod ;
   private String[] P06UV4_A212BarSer ;
   private String[] P06UV4_A135BarColNom ;
   private int[] P06UV4_A136BarColNum ;
   private byte[] P06UV4_A213BarSit ;
   private String[] P06UV4_A3644CliNom1 ;
   private String[] P06UV4_A279CliNom ;
   private java.util.Date[] P06UV4_A155BarFecCli ;
   private short[] P06UV4_A1503BarPart ;
   private int[] P06UV4_A1235BarNumCli ;
   private String[] P06UV4_A1234BarNomCli ;
   private String[] P06UV4_A143BarDisNum ;
   private short[] P06UV4_A217BarTipArt ;
   private boolean[] P06UV4_n217BarTipArt ;
   private String[] P06UV4_A180BarMaqCod ;
   private short[] P06UV4_A1909BarGraAca ;
   private short[] P06UV4_A3137BarGraAca2 ;
   private short[] P06UV4_A125BarAncAca1 ;
   private short[] P06UV4_A126BarAncAca2 ;
   private java.math.BigDecimal[] P06UV4_A1224BarEncAnh ;
   private java.math.BigDecimal[] P06UV4_A1223BarEncCom ;
   private String[] P06UV4_A1431BarLocDis ;
   private String[] P06UV4_A5351BarObsGrm ;
   private String[] P06UV4_A5352BarObsAnc ;
   private String[] P06UV4_A2454BarGirar ;
   private String[] P06UV4_A1652BarSerDsc ;
   private short[] P06UV4_A234BarUrdP3 ;
   private short[] P06UV4_A233BarUrdP2 ;
   private short[] P06UV4_A232BarUrdP1 ;
   private short[] P06UV4_A226BarTraP3 ;
   private short[] P06UV4_A225BarTraP2 ;
   private short[] P06UV4_A224BarTraP1 ;
   private String[] P06UV4_A231BarUrd3 ;
   private String[] P06UV4_A230BarUrd2 ;
   private String[] P06UV4_A229BarUrd1 ;
   private String[] P06UV4_A223BarTra3 ;
   private String[] P06UV4_A222BarTra2 ;
   private String[] P06UV4_A221BarTra1 ;
   private short[] P06UV4_A4466BarAcaAnh ;
   private java.util.Date[] P06UV4_A158BarFecFpr ;
   private java.math.BigDecimal[] P06UV4_A166BarKgm ;
   private short[] P06UV4_A199BarPie1 ;
   private String[] P06UV4_A365DisDes ;
   private int[] P06UV4_A898BarPieNDes ;
   private String[] P06UV5_A396EmprCod ;
   private boolean[] P06UV5_n396EmprCod ;
   private int[] P06UV5_A361DisCod ;
   private String[] P06UV5_A13376DisTraID ;
   private String[] P06UV6_A396EmprCod ;
   private boolean[] P06UV6_n396EmprCod ;
   private int[] P06UV6_A361DisCod ;
   private String[] P06UV6_A13213DisNormID ;
   private String[] P06UV7_A396EmprCod ;
   private boolean[] P06UV7_n396EmprCod ;
   private byte[] P06UV7_A831TipColCod ;
   private String[] P06UV8_A396EmprCod ;
   private boolean[] P06UV8_n396EmprCod ;
   private int[] P06UV8_A129BarCod ;
   private byte[] P06UV8_A132BarCodReo ;
   private String[] P06UV8_A130BarCodPar ;
   private String[] P06UV8_A187BarNotDsc ;
   private byte[] P06UV8_A188BarNotLin ;
   private String[] P06UV9_A396EmprCod ;
   private boolean[] P06UV9_n396EmprCod ;
   private int[] P06UV9_A129BarCod ;
   private byte[] P06UV9_A132BarCodReo ;
   private String[] P06UV9_A130BarCodPar ;
   private short[] P06UV9_A761ProFasLin ;
   private boolean[] P06UV9_n761ProFasLin ;
   private String[] P06UV9_A759ProDsc ;
   private String[] P06UV9_A758ProCod ;
   private String[] P06UV10_A396EmprCod ;
   private boolean[] P06UV10_n396EmprCod ;
   private int[] P06UV10_A129BarCod ;
   private byte[] P06UV10_A132BarCodReo ;
   private String[] P06UV10_A130BarCodPar ;
   private String[] P06UV10_A603MaqCodBis ;
   private String[] P06UV10_A460FasDsc ;
   private String[] P06UV10_A457FasCod ;
   private short[] P06UV10_A194BarOrdLin ;
   private String[] P06UV10_A758ProCod ;
   private String[] P06UV11_A396EmprCod ;
   private boolean[] P06UV11_n396EmprCod ;
   private int[] P06UV11_A1199MacCod ;
   private String[] P06UV11_A1205MacBarPar ;
   private byte[] P06UV11_A1204MacBarReo ;
   private int[] P06UV11_A1203MacBarCod ;
   private short[] P06UV11_A1201MacLin ;
   private String[] P06UV12_A602MaqCod ;
   private String[] P06UV12_A396EmprCod ;
   private boolean[] P06UV12_n396EmprCod ;
   private String[] P06UV12_A606MaqDsc ;
   private boolean[] P06UV12_n606MaqDsc ;
   private short[] P06UV13_A970ProceCod ;
   private boolean[] P06UV13_n970ProceCod ;
   private String[] P06UV13_A396EmprCod ;
   private boolean[] P06UV13_n396EmprCod ;
   private int[] P06UV13_A361DisCod ;
   private String[] P06UV13_A46AlbREnt ;
   private java.util.Date[] P06UV13_A49AlbRFen ;
   private String[] P06UV13_A50AlbRLoc ;
   private String[] P06UV13_A971ProceNom ;
   private boolean[] P06UV13_n971ProceNom ;
   private int[] P06UV13_A44AlbRecCod ;
   private short[] P06UV14_A829TipArtCod ;
   private String[] P06UV14_A396EmprCod ;
   private boolean[] P06UV14_n396EmprCod ;
   private String[] P06UV14_A830TipArtDsc ;
   private boolean[] P06UV14_n830TipArtDsc ;
}

final  class rhdrcarv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06UV2", "SELECT EmprCod, TermCod, TermUsu FROM TXPTERMIN WHERE (TermCod = ?) AND (EmprCod = ?) ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06UV4", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTipCol, T1.DisCod, T1.BarEstReo, T2.TipDefDsc, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarSit, T3.CliNom1, T3.CliNom, T1.BarFecCli, T1.BarPart, T1.BarNumCli, T1.BarNomCli, T1.BarDisNum, T1.BarTipArt, T1.BarMaqCod, T1.BarGraAca, T1.BarGraAca2, T1.BarAncAca1, T1.BarAncAca2, T1.BarEncAnh, T1.BarEncCom, T1.BarLocDis, T1.BarObsGrm, T1.BarObsAnc, T1.BarGirar, T1.BarSerDsc, T1.BarUrdP3, T1.BarUrdP2, T1.BarUrdP1, T1.BarTraP3, T1.BarTraP2, T1.BarTraP1, T1.BarUrd3, T1.BarUrd2, T1.BarUrd1, T1.BarTra3, T1.BarTra2, T1.BarTra1, T1.BarAcaAnh, T1.BarFecFpr, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06UV5", "SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UV6", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UV7", "SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06UV8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UV9", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProFasLin, T2.ProDsc, T1.ProCod FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UV10", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UV11", "SELECT EmprCod, MacCod, MacBarPar, MacBarReo, MacBarCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UV12", "SELECT MaqCod, EmprCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06UV13", "SELECT T2.ProceCod, T1.EmprCod, T1.DisCod, T2.AlbREnt, T2.AlbRFen, T2.AlbRLoc, T3.ProceNom, T1.AlbRecCod FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06UV14", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 13);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((String[]) buf[18])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(17);
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 13);
               ((String[]) buf[23])[0] = rslt.getString(21, 8);
               ((short[]) buf[24])[0] = rslt.getShort(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 6);
               ((short[]) buf[27])[0] = rslt.getShort(24);
               ((short[]) buf[28])[0] = rslt.getShort(25);
               ((short[]) buf[29])[0] = rslt.getShort(26);
               ((short[]) buf[30])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(29,2);
               ((String[]) buf[33])[0] = rslt.getString(30, 10);
               ((String[]) buf[34])[0] = rslt.getString(31, 20);
               ((String[]) buf[35])[0] = rslt.getString(32, 20);
               ((String[]) buf[36])[0] = rslt.getString(33, 20);
               ((String[]) buf[37])[0] = rslt.getString(34, 26);
               ((short[]) buf[38])[0] = rslt.getShort(35);
               ((short[]) buf[39])[0] = rslt.getShort(36);
               ((short[]) buf[40])[0] = rslt.getShort(37);
               ((short[]) buf[41])[0] = rslt.getShort(38);
               ((short[]) buf[42])[0] = rslt.getShort(39);
               ((short[]) buf[43])[0] = rslt.getShort(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 4);
               ((String[]) buf[45])[0] = rslt.getString(42, 4);
               ((String[]) buf[46])[0] = rslt.getString(43, 4);
               ((String[]) buf[47])[0] = rslt.getString(44, 4);
               ((String[]) buf[48])[0] = rslt.getString(45, 4);
               ((String[]) buf[49])[0] = rslt.getString(46, 4);
               ((short[]) buf[50])[0] = rslt.getShort(47);
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(48);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(49,2);
               ((short[]) buf[53])[0] = rslt.getShort(50);
               ((String[]) buf[54])[0] = rslt.getString(51, 1);
               ((int[]) buf[55])[0] = rslt.getInt(52);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 3);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

