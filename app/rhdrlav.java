package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrlav extends GXReport
{
   public rhdrlav( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrlav.class ), "" );
   }

   public rhdrlav( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      rhdrlav.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      rhdrlav.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rhdrlav.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rhdrlav.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rhdrlav.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rhdrlav.this.AV15ImpCod = aP4[0];
      this.aP4 = aP4;
      rhdrlav.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 256, 11909, 8942, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("ORDEM DE SERVIÇO LAVANDERIA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV74ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRLAV", ""), GXv_char1) ;
         rhdrlav.this.AV74ContDsc = GXv_char1[0] ;
         AV16Termin = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P06QG2 */
         pr_default.execute(0, new Object[] {AV16Termin, Boolean.valueOf(n396EmprCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A942TermCod = P06QG2_A942TermCod[0] ;
            A1189TermUsu = P06QG2_A1189TermUsu[0] ;
            n1189TermUsu = P06QG2_n1189TermUsu[0] ;
            AV17TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06QG4 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P06QG4_A833TipDefCod[0] ;
            n833TipDefCod = P06QG4_n833TipDefCod[0] ;
            A361DisCod = P06QG4_A361DisCod[0] ;
            A218BarTipCol = P06QG4_A218BarTipCol[0] ;
            A834TipDefDsc = P06QG4_A834TipDefDsc[0] ;
            n834TipDefDsc = P06QG4_n834TipDefDsc[0] ;
            A212BarSer = P06QG4_A212BarSer[0] ;
            A135BarColNom = P06QG4_A135BarColNom[0] ;
            A136BarColNum = P06QG4_A136BarColNum[0] ;
            A213BarSit = P06QG4_A213BarSit[0] ;
            A1431BarLocDis = P06QG4_A1431BarLocDis[0] ;
            A3644CliNom1 = P06QG4_A3644CliNom1[0] ;
            A279CliNom = P06QG4_A279CliNom[0] ;
            A217BarTipArt = P06QG4_A217BarTipArt[0] ;
            n217BarTipArt = P06QG4_n217BarTipArt[0] ;
            A180BarMaqCod = P06QG4_A180BarMaqCod[0] ;
            A1909BarGraAca = P06QG4_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P06QG4_A3137BarGraAca2[0] ;
            A125BarAncAca1 = P06QG4_A125BarAncAca1[0] ;
            A126BarAncAca2 = P06QG4_A126BarAncAca2[0] ;
            A1224BarEncAnh = P06QG4_A1224BarEncAnh[0] ;
            A1223BarEncCom = P06QG4_A1223BarEncCom[0] ;
            A1234BarNomCli = P06QG4_A1234BarNomCli[0] ;
            A1652BarSerDsc = P06QG4_A1652BarSerDsc[0] ;
            A157BarFecEnt = P06QG4_A157BarFecEnt[0] ;
            A4611BarHorEnt = P06QG4_A4611BarHorEnt[0] ;
            n4611BarHorEnt = P06QG4_n4611BarHorEnt[0] ;
            A158BarFecFpr = P06QG4_A158BarFecFpr[0] ;
            A4613BarHorReg = P06QG4_A4613BarHorReg[0] ;
            n4613BarHorReg = P06QG4_n4613BarHorReg[0] ;
            A159BarFecGen = P06QG4_A159BarFecGen[0] ;
            A155BarFecCli = P06QG4_A155BarFecCli[0] ;
            A143BarDisNum = P06QG4_A143BarDisNum[0] ;
            A252CliCod = P06QG4_A252CliCod[0] ;
            n252CliCod = P06QG4_n252CliCod[0] ;
            A148BarEstReo = P06QG4_A148BarEstReo[0] ;
            A898BarPieNDes = P06QG4_A898BarPieNDes[0] ;
            n898BarPieNDes = P06QG4_n898BarPieNDes[0] ;
            A834TipDefDsc = P06QG4_A834TipDefDsc[0] ;
            n834TipDefDsc = P06QG4_n834TipDefDsc[0] ;
            A3644CliNom1 = P06QG4_A3644CliNom1[0] ;
            A279CliNom = P06QG4_A279CliNom[0] ;
            A898BarPieNDes = P06QG4_A898BarPieNDes[0] ;
            n898BarPieNDes = P06QG4_n898BarPieNDes[0] ;
            AV31EmprCod = A396EmprCod ;
            AV45DetPzas = (short)(A898BarPieNDes) ;
            AV91Barcod = A129BarCod ;
            AV92BarCodReo = A132BarCodReo ;
            AV93BarCodPar = A130BarCodPar ;
            AV59Ceros8 = "00000000" ;
            AV60HdrAlfa = GXutil.str( A129BarCod, 8, 0) ;
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
               AV49Remonta = httpContext.getMessage( "Dev. ", "") + GXutil.substring( A834TipDefDsc, 1, 15) ;
               AV78Texto = httpContext.getMessage( "REM. EXT.", "") ;
            }
            AV94dsccausa = "" ;
            if ( A148BarEstReo == 1 )
            {
               AV49Remonta = GXutil.substring( A834TipDefDsc, 1, 15) ;
               AV78Texto = httpContext.getMessage( "REM. INT.", "") ;
            }
            /* Using cursor P06QG5 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Byte.valueOf(A218BarTipCol)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A831TipColCod = P06QG5_A831TipColCod[0] ;
               AV27TipColDsc = A832TipColDsc ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            AV36CliCod = A252CliCod ;
            AV37ArtCod = A212BarSer ;
            AV41BarColNom = A135BarColNom ;
            AV42BarColNum = A136BarColNum ;
            AV43BarTipCol = A218BarTipCol ;
            /* Execute user subroutine: 'BUSCOL' */
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
            AV70Sit = " " ;
            if ( A213BarSit == 2 )
            {
               AV70Sit = httpContext.getMessage( "(LAB)", "") ;
            }
            AV54DisCod = A361DisCod ;
            AV53ALbRLoc = A1431BarLocDis ;
            AV79vCliNom = A279CliNom + GXutil.substring( A3644CliNom1, 1, 10) ;
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
            AV87vtexto = GXutil.space( (short)(20)) ;
            AV86Tipdefdsc = GXutil.space( (short)(30)) ;
            if ( A148BarEstReo == 1 )
            {
               AV87vtexto = httpContext.getMessage( "Reprocessado Interno", "") ;
               AV86Tipdefdsc = A834TipDefDsc ;
            }
            h6QG0( false, 41) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Relaçao Entradas Armazem", ""), 17, Gx_line+0, 203, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipos Peças", ""), 40, Gx_line+16, 122, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Modelo", ""), 169, Gx_line+16, 220, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tam.", ""), 249, Gx_line+16, 283, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 304, Gx_line+16, 348, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 370, Gx_line+16, 412, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pçs Estim", ""), 415, Gx_line+17, 482, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recepçao", ""), 482, Gx_line+18, 550, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(16, Gx_line+16, 549, Gx_line+34, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(138, Gx_line+17, 138, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(244, Gx_line+17, 244, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(284, Gx_line+17, 284, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(366, Gx_line+17, 366, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(413, Gx_line+17, 413, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(480, Gx_line+17, 480, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(16, Gx_line+32, 16, Gx_line+40, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(548, Gx_line+32, 548, Gx_line+40, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+41) ;
            AV77TotKgs = DecimalUtil.doubleToDec(0) ;
            AV44TotPzas = 0 ;
            AV81TotPzasEst = 0 ;
            /* Using cursor P06QG6 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4295ClasCod = P06QG6_A4295ClasCod[0] ;
               n4295ClasCod = P06QG6_n4295ClasCod[0] ;
               A4296ClasDsc = P06QG6_A4296ClasDsc[0] ;
               n4296ClasDsc = P06QG6_n4296ClasDsc[0] ;
               A203BarPieKil = P06QG6_A203BarPieKil[0] ;
               A44AlbRecCod = P06QG6_A44AlbRecCod[0] ;
               A1501BarPiePie = P06QG6_A1501BarPiePie[0] ;
               A4601AlbRTam = P06QG6_A4601AlbRTam[0] ;
               A4602AlbRMdlCod = P06QG6_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P06QG6_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P06QG6_A58AlbRUniEnt[0] ;
               A200BarPieCod = P06QG6_A200BarPieCod[0] ;
               A4295ClasCod = P06QG6_A4295ClasCod[0] ;
               n4295ClasCod = P06QG6_n4295ClasCod[0] ;
               A4601AlbRTam = P06QG6_A4601AlbRTam[0] ;
               A4602AlbRMdlCod = P06QG6_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P06QG6_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P06QG6_A58AlbRUniEnt[0] ;
               A4296ClasDsc = P06QG6_A4296ClasDsc[0] ;
               n4296ClasDsc = P06QG6_n4296ClasDsc[0] ;
               if ( A4290AlbPmPPza.doubleValue() > 0 )
               {
                  A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
               }
               else
               {
                  A4291AlbPzaEst = 0 ;
               }
               AV80PzasEstim = A4291AlbPzaEst ;
               AV83ClasDsc = GXutil.substring( A4296ClasDsc, 1, 15) ;
               h6QG0( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), 143, Gx_line+1, 239, Gx_line+18, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83ClasDsc, "")), 22, Gx_line+1, 132, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4601AlbRTam, "")), 249, Gx_line+1, 279, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 378, Gx_line+2, 423, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 483, Gx_line+1, 542, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 289, Gx_line+1, 356, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80PzasEstim), "ZZZZZ9")), 417, Gx_line+1, 468, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(138, Gx_line+0, 138, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(244, Gx_line+0, 244, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(284, Gx_line+0, 284, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(413, Gx_line+0, 413, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(366, Gx_line+0, 366, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(480, Gx_line+0, 480, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(548, Gx_line+0, 548, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+0, 16, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+17, 549, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+16, 16, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(548, Gx_line+16, 548, Gx_line+20, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               AV77TotKgs = AV77TotKgs.add(A203BarPieKil) ;
               AV44TotPzas = (int)(AV44TotPzas+A1501BarPiePie) ;
               AV81TotPzasEst = (int)(AV81TotPzasEst+AV80PzasEstim) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            h6QG0( false, 4) ;
            getPrinter().GxDrawLine(16, Gx_line+0, 549, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+4) ;
            h6QG0( false, 33) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77TotKgs, "ZZZ,ZZ9.99")), 177, Gx_line+6, 282, Gx_line+26, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TotPzas), "ZZZZZ9")), 327, Gx_line+6, 391, Gx_line+26, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81TotPzasEst), "ZZZZZ9")), 432, Gx_line+6, 496, Gx_line+26, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Totales", ""), 88, Gx_line+6, 162, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(69, Gx_line+2, 549, Gx_line+29, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(321, Gx_line+2, 321, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(168, Gx_line+2, 168, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(426, Gx_line+2, 426, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 291, Gx_line+7, 317, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pçs", ""), 398, Gx_line+7, 424, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pçs", ""), 501, Gx_line+7, 527, Gx_line+24, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            h6QG0( false, 50) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Côr:", ""), 22, Gx_line+6, 56, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 122, Gx_line+6, 258, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 21, Gx_line+26, 80, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 121, Gx_line+26, 255, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 261, Gx_line+26, 479, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(16, Gx_line+2, 549, Gx_line+48, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Côr Cliente:", ""), 272, Gx_line+6, 373, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 380, Gx_line+6, 516, Gx_line+26, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
            h6QG0( false, 25) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 21, Gx_line+8, 119, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+3, 536, Gx_line+3, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+3, 15, Gx_line+24, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(535, Gx_line+3, 535, Gx_line+25, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+25) ;
            /* Using cursor P06QG7 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A377DisObsTxt = P06QG7_A377DisObsTxt[0] ;
               A376DisObsLin = P06QG7_A376DisObsLin[0] ;
               h6QG0( false, 17) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 20, Gx_line+0, 521, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+0, 15, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(535, Gx_line+0, 535, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h6QG0( false, 9) ;
            getPrinter().GxDrawLine(16, Gx_line+6, 537, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+0, 15, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(535, Gx_line+0, 535, Gx_line+7, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+9) ;
            h6QG0( false, 51) ;
            getPrinter().GxDrawRect(16, Gx_line+1, 560, Gx_line+20, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fases de Produçao", ""), 206, Gx_line+0, 368, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 106, Gx_line+25, 181, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pdas", ""), 260, Gx_line+25, 299, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quilos p/partida", ""), 357, Gx_line+25, 474, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(258, Gx_line+20, 258, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(300, Gx_line+20, 300, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(16, Gx_line+20, 560, Gx_line+46, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(16, Gx_line+40, 16, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(558, Gx_line+40, 558, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(316, Gx_line+20, 316, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "A", ""), 301, Gx_line+25, 312, Gx_line+43, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+51) ;
            /* Using cursor P06QG8 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A457FasCod = P06QG8_A457FasCod[0] ;
               A194BarOrdLin = P06QG8_A194BarOrdLin[0] ;
               A758ProCod = P06QG8_A758ProCod[0] ;
               A603MaqCodBis = P06QG8_A603MaqCodBis[0] ;
               A460FasDsc = P06QG8_A460FasDsc[0] ;
               A460FasDsc = P06QG8_A460FasDsc[0] ;
               AV82Num_Pdas = (short)(0) ;
               AV88Kgs_ppda = GXutil.space( (short)(45)) ;
               AV90Kgs_pdaT = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P06QG9 */
               pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A4643BarFasLot = P06QG9_A4643BarFasLot[0] ;
                  A4645BarFasKgs = P06QG9_A4645BarFasKgs[0] ;
                  n4645BarFasKgs = P06QG9_n4645BarFasKgs[0] ;
                  AV89Kgspda = A4645BarFasKgs ;
                  if ( AV82Num_Pdas == 0 )
                  {
                     AV88Kgs_ppda = GXutil.trim( GXutil.str( AV89Kgspda, 6, 2)) ;
                  }
                  else
                  {
                     AV88Kgs_ppda = GXutil.concat( AV88Kgs_ppda, GXutil.trim( GXutil.str( AV89Kgspda, 6, 2)), "/") ;
                  }
                  AV82Num_Pdas = (short)(AV82Num_Pdas+1) ;
                  AV90Kgs_pdaT = AV90Kgs_pdaT.add(A4645BarFasKgs) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               AV32MaqCod = A603MaqCodBis ;
               /* Execute user subroutine: 'DSCMAQ' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
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
               AV84Flag_agr = (byte)(0) ;
               /* Optimized group. */
               /* Using cursor P06QG10 */
               pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               cV84Flag_agr = P06QG10_AV84Flag_agr[0] ;
               pr_default.close(7);
               AV84Flag_agr = (byte)(AV84Flag_agr+cV84Flag_agr*1) ;
               /* End optimized group. */
               AV85Agr_txt = GXutil.space( (short)(1)) ;
               if ( AV84Flag_agr > 1 )
               {
                  AV85Agr_txt = httpContext.getMessage( "S", "") ;
               }
               h6QG0( false, 22) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 20, Gx_line+0, 253, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+0, 16, Gx_line+22, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(258, Gx_line+0, 258, Gx_line+22, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(300, Gx_line+0, 300, Gx_line+22, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(558, Gx_line+0, 558, Gx_line+22, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+17, 560, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV82Num_Pdas), "ZZZ9")), 264, Gx_line+0, 296, Gx_line+16, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(316, Gx_line+0, 316, Gx_line+22, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Agr_txt, "")), 304, Gx_line+0, 313, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Kgs_ppda, "")), 319, Gx_line+1, 491, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90Kgs_pdaT, "ZZZZZ9.99")), 493, Gx_line+1, 560, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
               AV66ContLin = (byte)(AV66ContLin+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            h6QG0( false, 3) ;
            getPrinter().GxDrawLine(16, Gx_line+0, 560, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+3) ;
            AV66ContLin = (byte)(AV66ContLin+1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6QG0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'DSCMAQ' Routine */
      returnInSub = false ;
      AV30MaqDsc = "" ;
      /* Using cursor P06QG11 */
      pr_default.execute(8, new Object[] {AV31EmprCod, AV32MaqCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A602MaqCod = P06QG11_A602MaqCod[0] ;
         A606MaqDsc = P06QG11_A606MaqDsc[0] ;
         n606MaqDsc = P06QG11_n606MaqDsc[0] ;
         AV30MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'BUSCOL' Routine */
      returnInSub = false ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV36CliCod ;
      GXv_char3[0] = AV37ArtCod ;
      GXv_char4[0] = AV41BarColNom ;
      GXv_int5[0] = AV42BarColNum ;
      GXv_int6[0] = A218BarTipCol ;
      GXv_int7[0] = AV28IntCod ;
      GXv_char8[0] = AV29IntDsc ;
      GXv_char9[0] = AV39ForColNom ;
      GXv_int10[0] = AV40ForColNum ;
      new app.pbusint(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char8, GXv_char9, GXv_int10) ;
      rhdrlav.this.A396EmprCod = GXv_char1[0] ;
      rhdrlav.this.AV36CliCod = GXv_int2[0] ;
      rhdrlav.this.AV37ArtCod = GXv_char3[0] ;
      rhdrlav.this.AV41BarColNom = GXv_char4[0] ;
      rhdrlav.this.AV42BarColNum = GXv_int5[0] ;
      rhdrlav.this.A218BarTipCol = GXv_int6[0] ;
      rhdrlav.this.AV28IntCod = GXv_int7[0] ;
      rhdrlav.this.AV29IntDsc = GXv_char8[0] ;
      rhdrlav.this.AV39ForColNom = GXv_char9[0] ;
      rhdrlav.this.AV40ForColNum = GXv_int10[0] ;
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV63TipARtDsc = "" ;
      /* Using cursor P06QG12 */
      pr_default.execute(9, new Object[] {AV31EmprCod, Short.valueOf(AV62TipArtCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A829TipArtCod = P06QG12_A829TipArtCod[0] ;
         A830TipArtDsc = P06QG12_A830TipArtDsc[0] ;
         n830TipArtDsc = P06QG12_n830TipArtDsc[0] ;
         AV63TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S115( ) throws ProcessInterruptedException
   {
      /* 'HLREOP' Routine */
      returnInSub = false ;
      AV94dsccausa = "" ;
      /* Using cursor P06QG13 */
      pr_default.execute(10, new Object[] {AV31EmprCod, Integer.valueOf(AV91Barcod), Byte.valueOf(AV92BarCodReo), AV93BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A5085CodCausa = P06QG13_A5085CodCausa[0] ;
         n5085CodCausa = P06QG13_n5085CodCausa[0] ;
         A5061Hl_hdrp = P06QG13_A5061Hl_hdrp[0] ;
         A5060Hl_hdrr = P06QG13_A5060Hl_hdrr[0] ;
         A5059Hl_hdr = P06QG13_A5059Hl_hdr[0] ;
         A5086DscCausa = P06QG13_A5086DscCausa[0] ;
         n5086DscCausa = P06QG13_n5086DscCausa[0] ;
         A5086DscCausa = P06QG13_A5086DscCausa[0] ;
         n5086DscCausa = P06QG13_n5086DscCausa[0] ;
         AV94dsccausa = A5086DscCausa ;
         h6QG0( false, 96) ;
         getPrinter().GxDrawRect(18, Gx_line+0, 548, Gx_line+93, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94dsccausa, "")), 21, Gx_line+41, 522, Gx_line+59, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reprocessado Interno. Ordens Serviço Origem:", ""), 21, Gx_line+63, 294, Gx_line+78, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ordem S.", ""), 21, Gx_line+76, 75, Gx_line+91, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 148, Gx_line+76, 184, Gx_line+91, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 273, Gx_line+74, 295, Gx_line+89, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 447, Gx_line+74, 470, Gx_line+89, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 486, Gx_line+74, 521, Gx_line+89, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(21, Gx_line+89, 79, Gx_line+89, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(148, Gx_line+89, 265, Gx_line+89, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(273, Gx_line+89, 368, Gx_line+89, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(403, Gx_line+89, 469, Gx_line+89, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(486, Gx_line+89, 520, Gx_line+89, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc Int", ""), 86, Gx_line+76, 139, Gx_line+91, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(86, Gx_line+89, 138, Gx_line+89, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87vtexto, "")), 21, Gx_line+3, 272, Gx_line+21, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Tipdefdsc, "")), 21, Gx_line+22, 272, Gx_line+40, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(18, Gx_line+63, 548, Gx_line+63, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+96) ;
         /* Using cursor P06QG14 */
         pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A5073Hl_pzs_r = P06QG14_A5073Hl_pzs_r[0] ;
            n5073Hl_pzs_r = P06QG14_n5073Hl_pzs_r[0] ;
            A5072Hl_kgs_r = P06QG14_A5072Hl_kgs_r[0] ;
            n5072Hl_kgs_r = P06QG14_n5072Hl_kgs_r[0] ;
            A5069Hl_hdrp_o = P06QG14_A5069Hl_hdrp_o[0] ;
            A5068Hl_hdrr_o = P06QG14_A5068Hl_hdrr_o[0] ;
            A5067Hl_hdr_o = P06QG14_A5067Hl_hdr_o[0] ;
            GXv_char9[0] = A396EmprCod ;
            GXv_int10[0] = A5067Hl_hdr_o ;
            GXv_int7[0] = A5068Hl_hdrr_o ;
            GXv_char8[0] = A5069Hl_hdrp_o ;
            GXv_int5[0] = (int)(DecimalUtil.decToDouble(AV116Clicod_a)) ;
            GXv_char4[0] = AV96CliNom_a ;
            GXv_char3[0] = AV97BarSer_a ;
            GXv_char1[0] = AV98ColNom_a ;
            GXv_int2[0] = 0 ;
            GXv_int11[0] = AV99DisCod_a ;
            new app.phrag06(remoteHandle, context).execute( GXv_char9, GXv_int10, GXv_int7, GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_char1, GXv_int2, GXv_int11) ;
            rhdrlav.this.A396EmprCod = GXv_char9[0] ;
            rhdrlav.this.A5067Hl_hdr_o = GXv_int10[0] ;
            rhdrlav.this.A5068Hl_hdrr_o = GXv_int7[0] ;
            rhdrlav.this.A5069Hl_hdrp_o = GXv_char8[0] ;
            rhdrlav.this.AV116Clicod_a = DecimalUtil.doubleToDec(GXv_int5[0]) ;
            rhdrlav.this.AV96CliNom_a = GXv_char4[0] ;
            rhdrlav.this.AV97BarSer_a = GXv_char3[0] ;
            rhdrlav.this.AV98ColNom_a = GXv_char1[0] ;
            rhdrlav.this.AV99DisCod_a = GXv_int11[0] ;
            h6QG0( false, 18) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97BarSer_a, "")), 148, Gx_line+3, 232, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98ColNom_a, "")), 273, Gx_line+3, 342, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV99DisCod_a), "ZZZZZZZ9")), 86, Gx_line+3, 137, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5072Hl_kgs_r, "ZZZZZ9.99")), 413, Gx_line+3, 470, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5073Hl_pzs_r), "ZZZ9")), 496, Gx_line+3, 522, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5067Hl_hdr_o), "ZZZZZZZ9")), 21, Gx_line+3, 72, Gx_line+19, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            pr_default.readNext(11);
         }
         pr_default.close(11);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void h6QG0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço:", ""), 22, Gx_line+18, 140, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 148, Gx_line+15, 241, Gx_line+39, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 271, Gx_line+15, 283, Gx_line+39, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("-", 248, Gx_line+17, 259, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 294, Gx_line+15, 306, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Emissão:", ""), 22, Gx_line+46, 139, Gx_line+63, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 148, Gx_line+45, 232, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35HojRut, "")), 322, Gx_line+16, 536, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 22, Gx_line+74, 90, Gx_line+91, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 96, Gx_line+73, 153, Gx_line+92, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79vCliNom, "")), 156, Gx_line+74, 490, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Encomenda Cliente:", ""), 22, Gx_line+101, 173, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Encomenda Interna:", ""), 22, Gx_line+121, 173, Gx_line+138, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 182, Gx_line+101, 250, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 182, Gx_line+121, 250, Gx_line+139, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Encomenda:", ""), 302, Gx_line+101, 428, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 430, Gx_line+101, 498, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Registro:", ""), 302, Gx_line+122, 420, Gx_line+139, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 430, Gx_line+122, 498, Gx_line+140, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora Registro:", ""), 302, Gx_line+144, 420, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A4613BarHorReg, "99:99:99"), 430, Gx_line+144, 498, Gx_line+162, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Entrega Pretendida:", ""), 21, Gx_line+169, 222, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A158BarFecFpr, "99/99/99"), 227, Gx_line+169, 295, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora Entrega:", ""), 302, Gx_line+169, 411, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A4611BarHorEnt, "99:99:99"), 430, Gx_line+169, 498, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Entrega Prevista:", ""), 21, Gx_line+191, 205, Gx_line+208, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A157BarFecEnt, "99/99/99"), 227, Gx_line+191, 295, Gx_line+209, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(16, Gx_line+67, 549, Gx_line+212, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+214) ;
               if ( A148BarEstReo == 1 )
               {
                  /* Execute user subroutine: 'HLREOP' */
                  S115 ();
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

   protected void cleanup( )
   {
      this.aP0[0] = rhdrlav.this.A396EmprCod;
      this.aP1[0] = rhdrlav.this.A129BarCod;
      this.aP2[0] = rhdrlav.this.A132BarCodReo;
      this.aP3[0] = rhdrlav.this.A130BarCodPar;
      this.aP4[0] = rhdrlav.this.AV15ImpCod;
      this.aP5[0] = rhdrlav.this.Gx_out;
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
      P06QG2_A396EmprCod = new String[] {""} ;
      P06QG2_n396EmprCod = new boolean[] {false} ;
      P06QG2_A942TermCod = new String[] {""} ;
      P06QG2_A1189TermUsu = new String[] {""} ;
      P06QG2_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV17TermUsu = "" ;
      P06QG4_A833TipDefCod = new short[1] ;
      P06QG4_n833TipDefCod = new boolean[] {false} ;
      P06QG4_A396EmprCod = new String[] {""} ;
      P06QG4_n396EmprCod = new boolean[] {false} ;
      P06QG4_A129BarCod = new int[1] ;
      P06QG4_A132BarCodReo = new byte[1] ;
      P06QG4_A130BarCodPar = new String[] {""} ;
      P06QG4_A361DisCod = new int[1] ;
      P06QG4_A218BarTipCol = new byte[1] ;
      P06QG4_A834TipDefDsc = new String[] {""} ;
      P06QG4_n834TipDefDsc = new boolean[] {false} ;
      P06QG4_A212BarSer = new String[] {""} ;
      P06QG4_A135BarColNom = new String[] {""} ;
      P06QG4_A136BarColNum = new int[1] ;
      P06QG4_A213BarSit = new byte[1] ;
      P06QG4_A1431BarLocDis = new String[] {""} ;
      P06QG4_A3644CliNom1 = new String[] {""} ;
      P06QG4_A279CliNom = new String[] {""} ;
      P06QG4_A217BarTipArt = new short[1] ;
      P06QG4_n217BarTipArt = new boolean[] {false} ;
      P06QG4_A180BarMaqCod = new String[] {""} ;
      P06QG4_A1909BarGraAca = new short[1] ;
      P06QG4_A3137BarGraAca2 = new short[1] ;
      P06QG4_A125BarAncAca1 = new short[1] ;
      P06QG4_A126BarAncAca2 = new short[1] ;
      P06QG4_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QG4_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QG4_A1234BarNomCli = new String[] {""} ;
      P06QG4_A1652BarSerDsc = new String[] {""} ;
      P06QG4_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P06QG4_A4611BarHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P06QG4_n4611BarHorEnt = new boolean[] {false} ;
      P06QG4_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P06QG4_A4613BarHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P06QG4_n4613BarHorReg = new boolean[] {false} ;
      P06QG4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P06QG4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P06QG4_A143BarDisNum = new String[] {""} ;
      P06QG4_A252CliCod = new int[1] ;
      P06QG4_n252CliCod = new boolean[] {false} ;
      P06QG4_A148BarEstReo = new byte[1] ;
      P06QG4_A898BarPieNDes = new int[1] ;
      P06QG4_n898BarPieNDes = new boolean[] {false} ;
      A834TipDefDsc = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1431BarLocDis = "" ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A180BarMaqCod = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A157BarFecEnt = GXutil.nullDate() ;
      A4611BarHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A158BarFecFpr = GXutil.nullDate() ;
      A4613BarHorReg = GXutil.resetTime( GXutil.nullDate() );
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A143BarDisNum = "" ;
      AV31EmprCod = "" ;
      AV93BarCodPar = "" ;
      AV59Ceros8 = "" ;
      AV60HdrAlfa = "" ;
      AV35HojRut = "" ;
      AV49Remonta = "" ;
      AV78Texto = "" ;
      AV94dsccausa = "" ;
      P06QG5_A396EmprCod = new String[] {""} ;
      P06QG5_n396EmprCod = new boolean[] {false} ;
      P06QG5_A831TipColCod = new byte[1] ;
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
      AV87vtexto = "" ;
      AV86Tipdefdsc = "" ;
      AV77TotKgs = DecimalUtil.ZERO ;
      P06QG6_A4295ClasCod = new short[1] ;
      P06QG6_n4295ClasCod = new boolean[] {false} ;
      P06QG6_A396EmprCod = new String[] {""} ;
      P06QG6_n396EmprCod = new boolean[] {false} ;
      P06QG6_A129BarCod = new int[1] ;
      P06QG6_A132BarCodReo = new byte[1] ;
      P06QG6_A130BarCodPar = new String[] {""} ;
      P06QG6_A4296ClasDsc = new String[] {""} ;
      P06QG6_n4296ClasDsc = new boolean[] {false} ;
      P06QG6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QG6_A44AlbRecCod = new int[1] ;
      P06QG6_A1501BarPiePie = new int[1] ;
      P06QG6_A4601AlbRTam = new String[] {""} ;
      P06QG6_A4602AlbRMdlCod = new String[] {""} ;
      P06QG6_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QG6_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QG6_A200BarPieCod = new String[] {""} ;
      A4296ClasDsc = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A4601AlbRTam = "" ;
      A4602AlbRMdlCod = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV83ClasDsc = "" ;
      P06QG7_A396EmprCod = new String[] {""} ;
      P06QG7_n396EmprCod = new boolean[] {false} ;
      P06QG7_A361DisCod = new int[1] ;
      P06QG7_A377DisObsTxt = new String[] {""} ;
      P06QG7_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P06QG8_A457FasCod = new String[] {""} ;
      P06QG8_A396EmprCod = new String[] {""} ;
      P06QG8_n396EmprCod = new boolean[] {false} ;
      P06QG8_A129BarCod = new int[1] ;
      P06QG8_A132BarCodReo = new byte[1] ;
      P06QG8_A130BarCodPar = new String[] {""} ;
      P06QG8_A194BarOrdLin = new short[1] ;
      P06QG8_A758ProCod = new String[] {""} ;
      P06QG8_A603MaqCodBis = new String[] {""} ;
      P06QG8_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      AV88Kgs_ppda = "" ;
      AV90Kgs_pdaT = DecimalUtil.ZERO ;
      P06QG9_A396EmprCod = new String[] {""} ;
      P06QG9_n396EmprCod = new boolean[] {false} ;
      P06QG9_A129BarCod = new int[1] ;
      P06QG9_A132BarCodReo = new byte[1] ;
      P06QG9_A130BarCodPar = new String[] {""} ;
      P06QG9_A758ProCod = new String[] {""} ;
      P06QG9_A194BarOrdLin = new short[1] ;
      P06QG9_A4643BarFasLot = new int[1] ;
      P06QG9_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QG9_n4645BarFasKgs = new boolean[] {false} ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      AV89Kgspda = DecimalUtil.ZERO ;
      P06QG10_AV84Flag_agr = new byte[1] ;
      AV85Agr_txt = "" ;
      AV30MaqDsc = "" ;
      P06QG11_A602MaqCod = new String[] {""} ;
      P06QG11_A396EmprCod = new String[] {""} ;
      P06QG11_n396EmprCod = new boolean[] {false} ;
      P06QG11_A606MaqDsc = new String[] {""} ;
      P06QG11_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      GXv_int6 = new byte[1] ;
      AV29IntDsc = "" ;
      AV39ForColNom = "" ;
      AV63TipARtDsc = "" ;
      P06QG12_A829TipArtCod = new short[1] ;
      P06QG12_A396EmprCod = new String[] {""} ;
      P06QG12_n396EmprCod = new boolean[] {false} ;
      P06QG12_A830TipArtDsc = new String[] {""} ;
      P06QG12_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P06QG13_A5085CodCausa = new short[1] ;
      P06QG13_n5085CodCausa = new boolean[] {false} ;
      P06QG13_A5061Hl_hdrp = new String[] {""} ;
      P06QG13_A5060Hl_hdrr = new byte[1] ;
      P06QG13_A5059Hl_hdr = new int[1] ;
      P06QG13_A396EmprCod = new String[] {""} ;
      P06QG13_n396EmprCod = new boolean[] {false} ;
      P06QG13_A5086DscCausa = new String[] {""} ;
      P06QG13_n5086DscCausa = new boolean[] {false} ;
      A5061Hl_hdrp = "" ;
      A5086DscCausa = "" ;
      P06QG14_A396EmprCod = new String[] {""} ;
      P06QG14_n396EmprCod = new boolean[] {false} ;
      P06QG14_A5059Hl_hdr = new int[1] ;
      P06QG14_A5060Hl_hdrr = new byte[1] ;
      P06QG14_A5061Hl_hdrp = new String[] {""} ;
      P06QG14_A5073Hl_pzs_r = new short[1] ;
      P06QG14_n5073Hl_pzs_r = new boolean[] {false} ;
      P06QG14_A5072Hl_kgs_r = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06QG14_n5072Hl_kgs_r = new boolean[] {false} ;
      P06QG14_A5069Hl_hdrp_o = new String[] {""} ;
      P06QG14_A5068Hl_hdrr_o = new byte[1] ;
      P06QG14_A5067Hl_hdr_o = new int[1] ;
      A5072Hl_kgs_r = DecimalUtil.ZERO ;
      A5069Hl_hdrp_o = "" ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      AV116Clicod_a = DecimalUtil.ZERO ;
      GXv_int5 = new int[1] ;
      AV96CliNom_a = "" ;
      GXv_char4 = new String[1] ;
      AV97BarSer_a = "" ;
      GXv_char3 = new String[1] ;
      AV98ColNom_a = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int11 = new int[1] ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrlav__default(),
         new Object[] {
             new Object[] {
            P06QG2_A396EmprCod, P06QG2_n396EmprCod, P06QG2_A942TermCod, P06QG2_A1189TermUsu, P06QG2_n1189TermUsu
            }
            , new Object[] {
            P06QG4_A833TipDefCod, P06QG4_n833TipDefCod, P06QG4_A396EmprCod, P06QG4_A129BarCod, P06QG4_A132BarCodReo, P06QG4_A130BarCodPar, P06QG4_A361DisCod, P06QG4_A218BarTipCol, P06QG4_A834TipDefDsc, P06QG4_n834TipDefDsc,
            P06QG4_A212BarSer, P06QG4_A135BarColNom, P06QG4_A136BarColNum, P06QG4_A213BarSit, P06QG4_A1431BarLocDis, P06QG4_A3644CliNom1, P06QG4_A279CliNom, P06QG4_A217BarTipArt, P06QG4_n217BarTipArt, P06QG4_A180BarMaqCod,
            P06QG4_A1909BarGraAca, P06QG4_A3137BarGraAca2, P06QG4_A125BarAncAca1, P06QG4_A126BarAncAca2, P06QG4_A1224BarEncAnh, P06QG4_A1223BarEncCom, P06QG4_A1234BarNomCli, P06QG4_A1652BarSerDsc, P06QG4_A157BarFecEnt, P06QG4_A4611BarHorEnt,
            P06QG4_n4611BarHorEnt, P06QG4_A158BarFecFpr, P06QG4_A4613BarHorReg, P06QG4_n4613BarHorReg, P06QG4_A159BarFecGen, P06QG4_A155BarFecCli, P06QG4_A143BarDisNum, P06QG4_A252CliCod, P06QG4_n252CliCod, P06QG4_A148BarEstReo,
            P06QG4_A898BarPieNDes, P06QG4_n898BarPieNDes
            }
            , new Object[] {
            P06QG5_A396EmprCod, P06QG5_A831TipColCod
            }
            , new Object[] {
            P06QG6_A4295ClasCod, P06QG6_n4295ClasCod, P06QG6_A396EmprCod, P06QG6_A129BarCod, P06QG6_A132BarCodReo, P06QG6_A130BarCodPar, P06QG6_A4296ClasDsc, P06QG6_n4296ClasDsc, P06QG6_A203BarPieKil, P06QG6_A44AlbRecCod,
            P06QG6_A1501BarPiePie, P06QG6_A4601AlbRTam, P06QG6_A4602AlbRMdlCod, P06QG6_A4290AlbPmPPza, P06QG6_A58AlbRUniEnt, P06QG6_A200BarPieCod
            }
            , new Object[] {
            P06QG7_A396EmprCod, P06QG7_A361DisCod, P06QG7_A377DisObsTxt, P06QG7_A376DisObsLin
            }
            , new Object[] {
            P06QG8_A457FasCod, P06QG8_A396EmprCod, P06QG8_A129BarCod, P06QG8_A132BarCodReo, P06QG8_A130BarCodPar, P06QG8_A194BarOrdLin, P06QG8_A758ProCod, P06QG8_A603MaqCodBis, P06QG8_A460FasDsc
            }
            , new Object[] {
            P06QG9_A396EmprCod, P06QG9_A129BarCod, P06QG9_A132BarCodReo, P06QG9_A130BarCodPar, P06QG9_A758ProCod, P06QG9_A194BarOrdLin, P06QG9_A4643BarFasLot, P06QG9_A4645BarFasKgs, P06QG9_n4645BarFasKgs
            }
            , new Object[] {
            P06QG10_AV84Flag_agr
            }
            , new Object[] {
            P06QG11_A602MaqCod, P06QG11_A396EmprCod, P06QG11_A606MaqDsc, P06QG11_n606MaqDsc
            }
            , new Object[] {
            P06QG12_A829TipArtCod, P06QG12_A396EmprCod, P06QG12_A830TipArtDsc, P06QG12_n830TipArtDsc
            }
            , new Object[] {
            P06QG13_A5085CodCausa, P06QG13_n5085CodCausa, P06QG13_A5061Hl_hdrp, P06QG13_A5060Hl_hdrr, P06QG13_A5059Hl_hdr, P06QG13_A396EmprCod, P06QG13_A5086DscCausa, P06QG13_n5086DscCausa
            }
            , new Object[] {
            P06QG14_A396EmprCod, P06QG14_A5059Hl_hdr, P06QG14_A5060Hl_hdrr, P06QG14_A5061Hl_hdrp, P06QG14_A5073Hl_pzs_r, P06QG14_n5073Hl_pzs_r, P06QG14_A5072Hl_kgs_r, P06QG14_n5072Hl_kgs_r, P06QG14_A5069Hl_hdrp_o, P06QG14_A5068Hl_hdrr_o,
            P06QG14_A5067Hl_hdr_o
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A148BarEstReo ;
   private byte AV92BarCodReo ;
   private byte AV61LenVar ;
   private byte A831TipColCod ;
   private byte AV43BarTipCol ;
   private byte A376DisObsLin ;
   private byte AV84Flag_agr ;
   private byte cV84Flag_agr ;
   private byte AV66ContLin ;
   private byte GXv_int6[] ;
   private byte AV28IntCod ;
   private byte A5060Hl_hdrr ;
   private byte A5068Hl_hdrr_o ;
   private byte GXv_int7[] ;
   private short A833TipDefCod ;
   private short A217BarTipArt ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short AV45DetPzas ;
   private short AV62TipArtCod ;
   private short A4295ClasCod ;
   private short A194BarOrdLin ;
   private short AV82Num_Pdas ;
   private short A829TipArtCod ;
   private short A5085CodCausa ;
   private short A5073Hl_pzs_r ;
   private short Gx_err ;
   private int A129BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int AV91Barcod ;
   private int AV36CliCod ;
   private int AV42BarColNum ;
   private int AV54DisCod ;
   private int Gx_OldLine ;
   private int AV44TotPzas ;
   private int AV81TotPzasEst ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int A4291AlbPzaEst ;
   private int AV80PzasEstim ;
   private int A4643BarFasLot ;
   private int AV40ForColNum ;
   private int A5059Hl_hdr ;
   private int A5067Hl_hdr_o ;
   private int GXv_int10[] ;
   private int GXv_int5[] ;
   private int GXv_int2[] ;
   private int AV99DisCod_a ;
   private int GXv_int11[] ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal AV77TotKgs ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV90Kgs_pdaT ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private java.math.BigDecimal AV89Kgspda ;
   private java.math.BigDecimal A5072Hl_kgs_r ;
   private java.math.BigDecimal AV116Clicod_a ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15ImpCod ;
   private String Gx_out ;
   private String AV74ContDsc ;
   private String AV16Termin ;
   private String scmdbuf ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV17TermUsu ;
   private String A834TipDefDsc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1431BarLocDis ;
   private String A3644CliNom1 ;
   private String A279CliNom ;
   private String A180BarMaqCod ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A143BarDisNum ;
   private String AV31EmprCod ;
   private String AV93BarCodPar ;
   private String AV59Ceros8 ;
   private String AV60HdrAlfa ;
   private String AV35HojRut ;
   private String AV49Remonta ;
   private String AV78Texto ;
   private String AV94dsccausa ;
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
   private String AV87vtexto ;
   private String AV86Tipdefdsc ;
   private String A4296ClasDsc ;
   private String A4601AlbRTam ;
   private String A4602AlbRMdlCod ;
   private String A200BarPieCod ;
   private String AV83ClasDsc ;
   private String A377DisObsTxt ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String AV88Kgs_ppda ;
   private String AV85Agr_txt ;
   private String AV30MaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV29IntDsc ;
   private String AV39ForColNom ;
   private String AV63TipARtDsc ;
   private String A830TipArtDsc ;
   private String A5061Hl_hdrp ;
   private String A5086DscCausa ;
   private String A5069Hl_hdrp_o ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String AV96CliNom_a ;
   private String GXv_char4[] ;
   private String AV97BarSer_a ;
   private String GXv_char3[] ;
   private String AV98ColNom_a ;
   private String GXv_char1[] ;
   private java.util.Date A4611BarHorEnt ;
   private java.util.Date A4613BarHorReg ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date Gx_date ;
   private boolean n396EmprCod ;
   private boolean n1189TermUsu ;
   private boolean GxHdr3 ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean n217BarTipArt ;
   private boolean n4611BarHorEnt ;
   private boolean n4613BarHorReg ;
   private boolean n252CliCod ;
   private boolean n898BarPieNDes ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n4645BarFasKgs ;
   private boolean n606MaqDsc ;
   private boolean n830TipArtDsc ;
   private boolean n5085CodCausa ;
   private boolean n5086DscCausa ;
   private boolean n5073Hl_pzs_r ;
   private boolean n5072Hl_kgs_r ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P06QG2_A396EmprCod ;
   private boolean[] P06QG2_n396EmprCod ;
   private String[] P06QG2_A942TermCod ;
   private String[] P06QG2_A1189TermUsu ;
   private boolean[] P06QG2_n1189TermUsu ;
   private short[] P06QG4_A833TipDefCod ;
   private boolean[] P06QG4_n833TipDefCod ;
   private String[] P06QG4_A396EmprCod ;
   private boolean[] P06QG4_n396EmprCod ;
   private int[] P06QG4_A129BarCod ;
   private byte[] P06QG4_A132BarCodReo ;
   private String[] P06QG4_A130BarCodPar ;
   private int[] P06QG4_A361DisCod ;
   private byte[] P06QG4_A218BarTipCol ;
   private String[] P06QG4_A834TipDefDsc ;
   private boolean[] P06QG4_n834TipDefDsc ;
   private String[] P06QG4_A212BarSer ;
   private String[] P06QG4_A135BarColNom ;
   private int[] P06QG4_A136BarColNum ;
   private byte[] P06QG4_A213BarSit ;
   private String[] P06QG4_A1431BarLocDis ;
   private String[] P06QG4_A3644CliNom1 ;
   private String[] P06QG4_A279CliNom ;
   private short[] P06QG4_A217BarTipArt ;
   private boolean[] P06QG4_n217BarTipArt ;
   private String[] P06QG4_A180BarMaqCod ;
   private short[] P06QG4_A1909BarGraAca ;
   private short[] P06QG4_A3137BarGraAca2 ;
   private short[] P06QG4_A125BarAncAca1 ;
   private short[] P06QG4_A126BarAncAca2 ;
   private java.math.BigDecimal[] P06QG4_A1224BarEncAnh ;
   private java.math.BigDecimal[] P06QG4_A1223BarEncCom ;
   private String[] P06QG4_A1234BarNomCli ;
   private String[] P06QG4_A1652BarSerDsc ;
   private java.util.Date[] P06QG4_A157BarFecEnt ;
   private java.util.Date[] P06QG4_A4611BarHorEnt ;
   private boolean[] P06QG4_n4611BarHorEnt ;
   private java.util.Date[] P06QG4_A158BarFecFpr ;
   private java.util.Date[] P06QG4_A4613BarHorReg ;
   private boolean[] P06QG4_n4613BarHorReg ;
   private java.util.Date[] P06QG4_A159BarFecGen ;
   private java.util.Date[] P06QG4_A155BarFecCli ;
   private String[] P06QG4_A143BarDisNum ;
   private int[] P06QG4_A252CliCod ;
   private boolean[] P06QG4_n252CliCod ;
   private byte[] P06QG4_A148BarEstReo ;
   private int[] P06QG4_A898BarPieNDes ;
   private boolean[] P06QG4_n898BarPieNDes ;
   private String[] P06QG5_A396EmprCod ;
   private boolean[] P06QG5_n396EmprCod ;
   private byte[] P06QG5_A831TipColCod ;
   private short[] P06QG6_A4295ClasCod ;
   private boolean[] P06QG6_n4295ClasCod ;
   private String[] P06QG6_A396EmprCod ;
   private boolean[] P06QG6_n396EmprCod ;
   private int[] P06QG6_A129BarCod ;
   private byte[] P06QG6_A132BarCodReo ;
   private String[] P06QG6_A130BarCodPar ;
   private String[] P06QG6_A4296ClasDsc ;
   private boolean[] P06QG6_n4296ClasDsc ;
   private java.math.BigDecimal[] P06QG6_A203BarPieKil ;
   private int[] P06QG6_A44AlbRecCod ;
   private int[] P06QG6_A1501BarPiePie ;
   private String[] P06QG6_A4601AlbRTam ;
   private String[] P06QG6_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P06QG6_A4290AlbPmPPza ;
   private java.math.BigDecimal[] P06QG6_A58AlbRUniEnt ;
   private String[] P06QG6_A200BarPieCod ;
   private String[] P06QG7_A396EmprCod ;
   private boolean[] P06QG7_n396EmprCod ;
   private int[] P06QG7_A361DisCod ;
   private String[] P06QG7_A377DisObsTxt ;
   private byte[] P06QG7_A376DisObsLin ;
   private String[] P06QG8_A457FasCod ;
   private String[] P06QG8_A396EmprCod ;
   private boolean[] P06QG8_n396EmprCod ;
   private int[] P06QG8_A129BarCod ;
   private byte[] P06QG8_A132BarCodReo ;
   private String[] P06QG8_A130BarCodPar ;
   private short[] P06QG8_A194BarOrdLin ;
   private String[] P06QG8_A758ProCod ;
   private String[] P06QG8_A603MaqCodBis ;
   private String[] P06QG8_A460FasDsc ;
   private String[] P06QG9_A396EmprCod ;
   private boolean[] P06QG9_n396EmprCod ;
   private int[] P06QG9_A129BarCod ;
   private byte[] P06QG9_A132BarCodReo ;
   private String[] P06QG9_A130BarCodPar ;
   private String[] P06QG9_A758ProCod ;
   private short[] P06QG9_A194BarOrdLin ;
   private int[] P06QG9_A4643BarFasLot ;
   private java.math.BigDecimal[] P06QG9_A4645BarFasKgs ;
   private boolean[] P06QG9_n4645BarFasKgs ;
   private byte[] P06QG10_AV84Flag_agr ;
   private String[] P06QG11_A602MaqCod ;
   private String[] P06QG11_A396EmprCod ;
   private boolean[] P06QG11_n396EmprCod ;
   private String[] P06QG11_A606MaqDsc ;
   private boolean[] P06QG11_n606MaqDsc ;
   private short[] P06QG12_A829TipArtCod ;
   private String[] P06QG12_A396EmprCod ;
   private boolean[] P06QG12_n396EmprCod ;
   private String[] P06QG12_A830TipArtDsc ;
   private boolean[] P06QG12_n830TipArtDsc ;
   private short[] P06QG13_A5085CodCausa ;
   private boolean[] P06QG13_n5085CodCausa ;
   private String[] P06QG13_A5061Hl_hdrp ;
   private byte[] P06QG13_A5060Hl_hdrr ;
   private int[] P06QG13_A5059Hl_hdr ;
   private String[] P06QG13_A396EmprCod ;
   private boolean[] P06QG13_n396EmprCod ;
   private String[] P06QG13_A5086DscCausa ;
   private boolean[] P06QG13_n5086DscCausa ;
   private String[] P06QG14_A396EmprCod ;
   private boolean[] P06QG14_n396EmprCod ;
   private int[] P06QG14_A5059Hl_hdr ;
   private byte[] P06QG14_A5060Hl_hdrr ;
   private String[] P06QG14_A5061Hl_hdrp ;
   private short[] P06QG14_A5073Hl_pzs_r ;
   private boolean[] P06QG14_n5073Hl_pzs_r ;
   private java.math.BigDecimal[] P06QG14_A5072Hl_kgs_r ;
   private boolean[] P06QG14_n5072Hl_kgs_r ;
   private String[] P06QG14_A5069Hl_hdrp_o ;
   private byte[] P06QG14_A5068Hl_hdrr_o ;
   private int[] P06QG14_A5067Hl_hdr_o ;
}

final  class rhdrlav__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06QG2", "SELECT EmprCod, TermCod, TermUsu FROM TXPTERMIN WHERE (TermCod = ?) AND (EmprCod = ?) ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QG4", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarTipCol, T2.TipDefDsc, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarSit, T1.BarLocDis, T3.CliNom1, T3.CliNom, T1.BarTipArt, T1.BarMaqCod, T1.BarGraAca, T1.BarGraAca2, T1.BarAncAca1, T1.BarAncAca2, T1.BarEncAnh, T1.BarEncCom, T1.BarNomCli, T1.BarSerDsc, T1.BarFecEnt, T1.BarHorEnt, T1.BarFecFpr, T1.BarHorReg, T1.BarFecGen, T1.BarFecCli, T1.BarDisNum, T1.CliCod, T1.BarEstReo, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QG5", "SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QG6", "SELECT T2.ClasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ClasDsc, T1.BarPieKil, T1.AlbRecCod, T1.BarPiePie, T2.AlbRTam, T2.AlbRMdlCod, T2.AlbPmPPza, T2.AlbRUniEnt, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QG7", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QG8", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.ProCod, T1.MaqCodBis, T2.FasDsc FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QG9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarFasKgs FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QG10", "SELECT COUNT(*) FROM TXPAGRHDF WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06QG11", "SELECT MaqCod, EmprCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QG12", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QG13", "SELECT T1.CodCausa, T1.Hl_hdrp, T1.Hl_hdrr, T1.Hl_hdr, T1.EmprCod, T2.DscCausa FROM (TXPHLREOP T1 LEFT JOIN TXPTIPCAU T2 ON T2.EmprCod = T1.EmprCod AND T2.CodCausa = T1.CodCausa) WHERE T1.EmprCod = ? and T1.Hl_hdr = ? and T1.Hl_hdrr = ? and T1.Hl_hdrp = ? ORDER BY T1.EmprCod, T1.Hl_hdr, T1.Hl_hdrr, T1.Hl_hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06QG14", "SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp, Hl_pzs_r, Hl_kgs_r, Hl_hdrp_o, Hl_hdrr_o, Hl_hdr_o FROM TXPHLREO1 WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ? ORDER BY EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp, Hl_hdr_o, Hl_hdrr_o, Hl_hdrp_o ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 10);
               ((String[]) buf[15])[0] = rslt.getString(14, 30);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 6);
               ((short[]) buf[20])[0] = rslt.getShort(18);
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((short[]) buf[23])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[26])[0] = rslt.getString(24, 13);
               ((String[]) buf[27])[0] = rslt.getString(25, 26);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(26);
               ((java.util.Date[]) buf[29])[0] = GXutil.resetDate(rslt.getGXDateTime(27));
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(28);
               ((java.util.Date[]) buf[32])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(30);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(31);
               ((String[]) buf[36])[0] = rslt.getString(32, 8);
               ((int[]) buf[37])[0] = rslt.getInt(33);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(34);
               ((int[]) buf[40])[0] = rslt.getInt(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 4);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[15])[0] = rslt.getString(14, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
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
               stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
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
               stmt.setString(5, (String)parms[5], 8);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
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
               stmt.setString(5, (String)parms[5], 8);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
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
      }
   }

}

