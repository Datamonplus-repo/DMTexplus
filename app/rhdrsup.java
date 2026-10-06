package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrsup extends GXReport
{
   public rhdrsup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrsup.class ), "" );
   }

   public rhdrsup( int remoteHandle ,
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
      rhdrsup.this.aP5 = new String[] {""};
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
      rhdrsup.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rhdrsup.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rhdrsup.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rhdrsup.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rhdrsup.this.AV15ImpCod = aP4[0];
      this.aP4 = aP4;
      rhdrsup.this.Gx_out = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("OP") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV74ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRSUP", ""), GXv_char1) ;
         rhdrsup.this.AV74ContDsc = GXv_char1[0] ;
         AV16Termin = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P077X2 */
         pr_default.execute(0, new Object[] {AV16Termin, Boolean.valueOf(n396EmprCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A942TermCod = P077X2_A942TermCod[0] ;
            A1189TermUsu = P077X2_A1189TermUsu[0] ;
            n1189TermUsu = P077X2_n1189TermUsu[0] ;
            AV17TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P077X4 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P077X4_A833TipDefCod[0] ;
            n833TipDefCod = P077X4_n833TipDefCod[0] ;
            A361DisCod = P077X4_A361DisCod[0] ;
            A218BarTipCol = P077X4_A218BarTipCol[0] ;
            A148BarEstReo = P077X4_A148BarEstReo[0] ;
            A834TipDefDsc = P077X4_A834TipDefDsc[0] ;
            n834TipDefDsc = P077X4_n834TipDefDsc[0] ;
            A135BarColNom = P077X4_A135BarColNom[0] ;
            A136BarColNum = P077X4_A136BarColNum[0] ;
            A213BarSit = P077X4_A213BarSit[0] ;
            A1431BarLocDis = P077X4_A1431BarLocDis[0] ;
            A3644CliNom1 = P077X4_A3644CliNom1[0] ;
            A279CliNom = P077X4_A279CliNom[0] ;
            A217BarTipArt = P077X4_A217BarTipArt[0] ;
            n217BarTipArt = P077X4_n217BarTipArt[0] ;
            A180BarMaqCod = P077X4_A180BarMaqCod[0] ;
            A1909BarGraAca = P077X4_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P077X4_A3137BarGraAca2[0] ;
            A125BarAncAca1 = P077X4_A125BarAncAca1[0] ;
            A126BarAncAca2 = P077X4_A126BarAncAca2[0] ;
            A1224BarEncAnh = P077X4_A1224BarEncAnh[0] ;
            A1223BarEncCom = P077X4_A1223BarEncCom[0] ;
            A3030BarPlf = P077X4_A3030BarPlf[0] ;
            A1652BarSerDsc = P077X4_A1652BarSerDsc[0] ;
            A212BarSer = P077X4_A212BarSer[0] ;
            A4609BarMdlCod = P077X4_A4609BarMdlCod[0] ;
            A4812BarEncCli = P077X4_A4812BarEncCli[0] ;
            A158BarFecFpr = P077X4_A158BarFecFpr[0] ;
            A159BarFecGen = P077X4_A159BarFecGen[0] ;
            A155BarFecCli = P077X4_A155BarFecCli[0] ;
            A252CliCod = P077X4_A252CliCod[0] ;
            n252CliCod = P077X4_n252CliCod[0] ;
            A898BarPieNDes = P077X4_A898BarPieNDes[0] ;
            n898BarPieNDes = P077X4_n898BarPieNDes[0] ;
            A834TipDefDsc = P077X4_A834TipDefDsc[0] ;
            n834TipDefDsc = P077X4_n834TipDefDsc[0] ;
            A3644CliNom1 = P077X4_A3644CliNom1[0] ;
            A279CliNom = P077X4_A279CliNom[0] ;
            A898BarPieNDes = P077X4_A898BarPieNDes[0] ;
            n898BarPieNDes = P077X4_n898BarPieNDes[0] ;
            AV31EmprCod = A396EmprCod ;
            AV45DetPzas = (short)(A898BarPieNDes) ;
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
            if ( A148BarEstReo == 1 )
            {
               AV49Remonta = GXutil.substring( A834TipDefDsc, 1, 15) ;
               AV78Texto = httpContext.getMessage( "REM. INT.", "") ;
            }
            /* Using cursor P077X5 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Byte.valueOf(A218BarTipCol)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A831TipColCod = P077X5_A831TipColCod[0] ;
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
            AV53ALbRLoc = A1431BarLocDis ;
            AV79vCliNom = A279CliNom + GXutil.substring( A3644CliNom1, 1, 10) ;
            AV62TipArtCod = A217BarTipArt ;
            /* Execute user subroutine: 'TIPART' */
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
            AV87vtexto = GXutil.space( (short)(20)) ;
            AV86Tipdefdsc = GXutil.space( (short)(30)) ;
            if ( A148BarEstReo == 1 )
            {
               AV87vtexto = httpContext.getMessage( "REOPERADO INTERNO", "") ;
               AV86Tipdefdsc = A834TipDefDsc ;
            }
            if ( A148BarEstReo == 2 )
            {
               AV87vtexto = httpContext.getMessage( "DEVOLUCION CLIENTE", "") ;
               AV86Tipdefdsc = A834TipDefDsc ;
            }
            AV94Muestras_i = "" ;
            if ( GXutil.strcmp(A3030BarPlf, httpContext.getMessage( "S", "")) == 0 )
            {
               AV94Muestras_i = httpContext.getMessage( "MUESTRAS", "") ;
            }
            h77X0( false, 65) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Relacion Entradas Almacen:", ""), 16, Gx_line+3, 206, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Prenda", ""), 76, Gx_line+40, 158, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 226, Gx_line+40, 311, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Modelo", ""), 339, Gx_line+40, 390, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Talla", ""), 429, Gx_line+40, 463, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 501, Gx_line+40, 535, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 652, Gx_line+22, 698, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 576, Gx_line+40, 622, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estimadas", ""), 641, Gx_line+41, 712, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recepcion", ""), 710, Gx_line+42, 782, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 733, Gx_line+22, 750, Gx_line+38, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(16, Gx_line+17, 781, Gx_line+58, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(215, Gx_line+18, 215, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(313, Gx_line+18, 313, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(411, Gx_line+18, 411, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(477, Gx_line+18, 477, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(556, Gx_line+18, 556, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(633, Gx_line+18, 633, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(706, Gx_line+18, 706, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(16, Gx_line+56, 16, Gx_line+64, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(779, Gx_line+56, 779, Gx_line+64, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+65) ;
            AV77TotKgs = DecimalUtil.doubleToDec(0) ;
            AV44TotPzas = 0 ;
            AV81TotPzasEst = 0 ;
            /* Using cursor P077X6 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4295ClasCod = P077X6_A4295ClasCod[0] ;
               n4295ClasCod = P077X6_n4295ClasCod[0] ;
               A4296ClasDsc = P077X6_A4296ClasDsc[0] ;
               n4296ClasDsc = P077X6_n4296ClasDsc[0] ;
               A203BarPieKil = P077X6_A203BarPieKil[0] ;
               A44AlbRecCod = P077X6_A44AlbRecCod[0] ;
               A1501BarPiePie = P077X6_A1501BarPiePie[0] ;
               A4601AlbRTam = P077X6_A4601AlbRTam[0] ;
               A50AlbRLoc = P077X6_A50AlbRLoc[0] ;
               A4602AlbRMdlCod = P077X6_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P077X6_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P077X6_A58AlbRUniEnt[0] ;
               A200BarPieCod = P077X6_A200BarPieCod[0] ;
               A4295ClasCod = P077X6_A4295ClasCod[0] ;
               n4295ClasCod = P077X6_n4295ClasCod[0] ;
               A4601AlbRTam = P077X6_A4601AlbRTam[0] ;
               A50AlbRLoc = P077X6_A50AlbRLoc[0] ;
               A4602AlbRMdlCod = P077X6_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P077X6_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P077X6_A58AlbRUniEnt[0] ;
               A4296ClasDsc = P077X6_A4296ClasDsc[0] ;
               n4296ClasDsc = P077X6_n4296ClasDsc[0] ;
               if ( A4290AlbPmPPza.doubleValue() > 0 )
               {
                  A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
               }
               else
               {
                  A4291AlbPzaEst = 0 ;
               }
               AV80PzasEstim = A4291AlbPzaEst ;
               AV83ClasDsc = GXutil.substring( A4296ClasDsc, 1, 20) ;
               h77X0( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), 316, Gx_line+1, 412, Gx_line+18, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 228, Gx_line+1, 302, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83ClasDsc, "")), 22, Gx_line+1, 169, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4601AlbRTam, "")), 430, Gx_line+1, 460, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 579, Gx_line+2, 624, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 713, Gx_line+1, 772, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 486, Gx_line+2, 553, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80PzasEstim), "ZZZZZ9")), 644, Gx_line+1, 695, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(215, Gx_line+0, 215, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(411, Gx_line+0, 411, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(477, Gx_line+0, 477, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(313, Gx_line+0, 313, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(633, Gx_line+0, 633, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(556, Gx_line+0, 556, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(706, Gx_line+0, 706, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(779, Gx_line+0, 779, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+0, 16, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+17, 781, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+16, 16, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(779, Gx_line+16, 779, Gx_line+20, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               AV77TotKgs = AV77TotKgs.add(A203BarPieKil) ;
               AV44TotPzas = (int)(AV44TotPzas+A1501BarPiePie) ;
               AV81TotPzasEst = (int)(AV81TotPzasEst+AV80PzasEstim) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            h77X0( false, 4) ;
            getPrinter().GxDrawLine(16, Gx_line+0, 781, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+4) ;
            h77X0( false, 33) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77TotKgs, "ZZZ,ZZ9.99")), 465, Gx_line+5, 570, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TotPzas), "ZZZZZ9")), 579, Gx_line+5, 643, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81TotPzasEst), "ZZZZZ9")), 655, Gx_line+5, 719, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Totales...", ""), 332, Gx_line+6, 437, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(318, Gx_line+2, 725, Gx_line+29, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(574, Gx_line+3, 574, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(454, Gx_line+3, 454, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(653, Gx_line+2, 653, Gx_line+29, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            h77X0( false, 55) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color:", ""), 23, Gx_line+6, 74, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 139, Gx_line+5, 275, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cod. Suprema:", ""), 22, Gx_line+28, 131, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 138, Gx_line+28, 272, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 278, Gx_line+28, 496, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(16, Gx_line+2, 780, Gx_line+52, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TipARtDsc, "")), 506, Gx_line+28, 715, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 283, Gx_line+5, 347, Gx_line+25, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 353, Gx_line+5, 375, Gx_line+25, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+55) ;
            h77X0( false, 33) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones:", ""), 22, Gx_line+17, 137, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(16, Gx_line+11, 781, Gx_line+11, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(16, Gx_line+13, 16, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(779, Gx_line+11, 779, Gx_line+33, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            /* Using cursor P077X7 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A377DisObsTxt = P077X7_A377DisObsTxt[0] ;
               A376DisObsLin = P077X7_A376DisObsLin[0] ;
               h77X0( false, 17) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 115, Gx_line+0, 616, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+0, 16, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(779, Gx_line+0, 779, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h77X0( false, 17) ;
            getPrinter().GxDrawLine(16, Gx_line+6, 781, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(16, Gx_line+0, 16, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(779, Gx_line+0, 779, Gx_line+7, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            h77X0( false, 51) ;
            getPrinter().GxDrawRect(16, Gx_line+1, 780, Gx_line+20, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fases de Produccion", ""), 325, Gx_line+1, 501, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 23, Gx_line+25, 76, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 179, Gx_line+25, 266, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pdas", ""), 332, Gx_line+25, 371, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos-Piezas p/Partida", ""), 491, Gx_line+25, 652, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(89, Gx_line+20, 89, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(330, Gx_line+20, 330, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(372, Gx_line+20, 372, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(16, Gx_line+20, 780, Gx_line+46, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(16, Gx_line+40, 16, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(16, Gx_line+40, 16, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(388, Gx_line+20, 388, Gx_line+51, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "A", ""), 375, Gx_line+25, 386, Gx_line+43, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+51) ;
            /* Using cursor P077X8 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A194BarOrdLin = P077X8_A194BarOrdLin[0] ;
               A758ProCod = P077X8_A758ProCod[0] ;
               A603MaqCodBis = P077X8_A603MaqCodBis[0] ;
               A5045BarFasAgr = P077X8_A5045BarFasAgr[0] ;
               n5045BarFasAgr = P077X8_n5045BarFasAgr[0] ;
               A460FasDsc = P077X8_A460FasDsc[0] ;
               A457FasCod = P077X8_A457FasCod[0] ;
               A460FasDsc = P077X8_A460FasDsc[0] ;
               AV82Num_Pdas = (short)(0) ;
               AV88Kgs_ppda = GXutil.space( (short)(45)) ;
               AV92Pzs_ppda = GXutil.space( (short)(45)) ;
               AV90Kgs_pdaT = DecimalUtil.doubleToDec(0) ;
               AV93Pzs_fase = (short)(0) ;
               /* Using cursor P077X9 */
               pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A4643BarFasLot = P077X9_A4643BarFasLot[0] ;
                  A4645BarFasKgs = P077X9_A4645BarFasKgs[0] ;
                  n4645BarFasKgs = P077X9_n4645BarFasKgs[0] ;
                  A4644BarFasNPrd = P077X9_A4644BarFasNPrd[0] ;
                  n4644BarFasNPrd = P077X9_n4644BarFasNPrd[0] ;
                  AV89Kgspda = A4645BarFasKgs ;
                  if ( AV82Num_Pdas == 0 )
                  {
                     AV88Kgs_ppda = GXutil.trim( GXutil.str( AV89Kgspda, 6, 2)) ;
                     AV92Pzs_ppda = GXutil.trim( GXutil.str( A4644BarFasNPrd, 4, 0)) ;
                  }
                  else
                  {
                     AV88Kgs_ppda = GXutil.concat( AV88Kgs_ppda, GXutil.trim( GXutil.str( AV89Kgspda, 6, 2)), "/") ;
                     AV92Pzs_ppda = GXutil.concat( AV92Pzs_ppda, GXutil.trim( GXutil.str( A4644BarFasNPrd, 4, 0)), "/") ;
                  }
                  AV82Num_Pdas = (short)(AV82Num_Pdas+1) ;
                  AV90Kgs_pdaT = AV90Kgs_pdaT.add(A4645BarFasKgs) ;
                  AV93Pzs_fase = (short)(AV93Pzs_fase+A4644BarFasNPrd) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               AV32MaqCod = A603MaqCodBis ;
               /* Execute user subroutine: 'DSCMAQ' */
               S111 ();
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
               AV85Agr_txt = A5045BarFasAgr ;
               AV91FasDsc = GXutil.substring( A460FasDsc, 1, 20) ;
               h77X0( false, 39) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 17, Gx_line+0, 85, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 93, Gx_line+0, 326, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+0, 16, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(89, Gx_line+0, 89, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(330, Gx_line+0, 330, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(372, Gx_line+0, 372, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+17, 780, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV82Num_Pdas), "ZZZ9")), 335, Gx_line+0, 367, Gx_line+16, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(388, Gx_line+0, 388, Gx_line+39, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Agr_txt, "")), 376, Gx_line+0, 385, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Kgs_ppda, "")), 391, Gx_line+1, 684, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90Kgs_pdaT, "ZZZZZ9.99")), 690, Gx_line+1, 757, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Pzs_ppda, "")), 391, Gx_line+19, 684, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV93Pzs_fase), "ZZZ9")), 726, Gx_line+19, 756, Gx_line+35, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(388, Gx_line+33, 779, Gx_line+33, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+39) ;
               AV66ContLin = (byte)(AV66ContLin+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            h77X0( false, 3) ;
            getPrinter().GxDrawLine(16, Gx_line+0, 780, Gx_line+0, 1, 0, 0, 0, 0) ;
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
         h77X0( true, 0) ;
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
      /* Using cursor P077X10 */
      pr_default.execute(7, new Object[] {AV31EmprCod, AV32MaqCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A602MaqCod = P077X10_A602MaqCod[0] ;
         A606MaqDsc = P077X10_A606MaqDsc[0] ;
         n606MaqDsc = P077X10_n606MaqDsc[0] ;
         AV30MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S121( ) throws ProcessInterruptedException
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
      rhdrsup.this.A396EmprCod = GXv_char1[0] ;
      rhdrsup.this.AV36CliCod = GXv_int2[0] ;
      rhdrsup.this.AV37ArtCod = GXv_char3[0] ;
      rhdrsup.this.AV41BarColNom = GXv_char4[0] ;
      rhdrsup.this.AV42BarColNum = GXv_int5[0] ;
      rhdrsup.this.A218BarTipCol = GXv_int6[0] ;
      rhdrsup.this.AV28IntCod = GXv_int7[0] ;
      rhdrsup.this.AV29IntDsc = GXv_char8[0] ;
      rhdrsup.this.AV39ForColNom = GXv_char9[0] ;
      rhdrsup.this.AV40ForColNum = GXv_int10[0] ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV63TipARtDsc = "" ;
      /* Using cursor P077X11 */
      pr_default.execute(8, new Object[] {AV31EmprCod, Short.valueOf(AV62TipArtCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A829TipArtCod = P077X11_A829TipArtCod[0] ;
         A830TipArtDsc = P077X11_A830TipArtDsc[0] ;
         n830TipArtDsc = P077X11_n830TipArtDsc[0] ;
         AV63TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void h77X0( boolean bFoot ,
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
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.P.:", ""), 22, Gx_line+18, 65, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 148, Gx_line+15, 241, Gx_line+39, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha Edicion:", ""), 22, Gx_line+46, 139, Gx_line+63, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 148, Gx_line+45, 232, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 22, Gx_line+89, 90, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 166, Gx_line+88, 223, Gx_line+107, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79vCliNom, "")), 227, Gx_line+89, 561, Gx_line+107, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Pedido Int.:", ""), 277, Gx_line+18, 403, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 408, Gx_line+18, 476, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha Definicion:", ""), 528, Gx_line+118, 671, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 706, Gx_line+118, 774, Gx_line+136, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha Ingreso:", ""), 553, Gx_line+140, 671, Gx_line+157, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 706, Gx_line+140, 774, Gx_line+158, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FDP:", ""), 636, Gx_line+158, 670, Gx_line+175, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A158BarFecFpr, "99/99/99"), 709, Gx_line+158, 777, Gx_line+176, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87vtexto, "")), 530, Gx_line+49, 781, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Tipdefdsc, "")), 530, Gx_line+67, 781, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94Muestras_i, "")), 530, Gx_line+18, 656, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Contrato/Ref.:", ""), 22, Gx_line+140, 140, Gx_line+157, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 166, Gx_line+140, 334, Gx_line+158, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "E.D.P.:", ""), 22, Gx_line+158, 81, Gx_line+175, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4609BarMdlCod, "")), 166, Gx_line+158, 275, Gx_line+176, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cod. Suprema:", ""), 22, Gx_line+118, 131, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 166, Gx_line+118, 300, Gx_line+136, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 305, Gx_line+118, 523, Gx_line+136, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+177) ;
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
      this.aP0[0] = rhdrsup.this.A396EmprCod;
      this.aP1[0] = rhdrsup.this.A129BarCod;
      this.aP2[0] = rhdrsup.this.A132BarCodReo;
      this.aP3[0] = rhdrsup.this.A130BarCodPar;
      this.aP4[0] = rhdrsup.this.AV15ImpCod;
      this.aP5[0] = rhdrsup.this.Gx_out;
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
      P077X2_A396EmprCod = new String[] {""} ;
      P077X2_n396EmprCod = new boolean[] {false} ;
      P077X2_A942TermCod = new String[] {""} ;
      P077X2_A1189TermUsu = new String[] {""} ;
      P077X2_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV17TermUsu = "" ;
      P077X4_A833TipDefCod = new short[1] ;
      P077X4_n833TipDefCod = new boolean[] {false} ;
      P077X4_A396EmprCod = new String[] {""} ;
      P077X4_n396EmprCod = new boolean[] {false} ;
      P077X4_A129BarCod = new int[1] ;
      P077X4_A132BarCodReo = new byte[1] ;
      P077X4_A130BarCodPar = new String[] {""} ;
      P077X4_A361DisCod = new int[1] ;
      P077X4_A218BarTipCol = new byte[1] ;
      P077X4_A148BarEstReo = new byte[1] ;
      P077X4_A834TipDefDsc = new String[] {""} ;
      P077X4_n834TipDefDsc = new boolean[] {false} ;
      P077X4_A135BarColNom = new String[] {""} ;
      P077X4_A136BarColNum = new int[1] ;
      P077X4_A213BarSit = new byte[1] ;
      P077X4_A1431BarLocDis = new String[] {""} ;
      P077X4_A3644CliNom1 = new String[] {""} ;
      P077X4_A279CliNom = new String[] {""} ;
      P077X4_A217BarTipArt = new short[1] ;
      P077X4_n217BarTipArt = new boolean[] {false} ;
      P077X4_A180BarMaqCod = new String[] {""} ;
      P077X4_A1909BarGraAca = new short[1] ;
      P077X4_A3137BarGraAca2 = new short[1] ;
      P077X4_A125BarAncAca1 = new short[1] ;
      P077X4_A126BarAncAca2 = new short[1] ;
      P077X4_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077X4_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077X4_A3030BarPlf = new String[] {""} ;
      P077X4_A1652BarSerDsc = new String[] {""} ;
      P077X4_A212BarSer = new String[] {""} ;
      P077X4_A4609BarMdlCod = new String[] {""} ;
      P077X4_A4812BarEncCli = new String[] {""} ;
      P077X4_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P077X4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P077X4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P077X4_A252CliCod = new int[1] ;
      P077X4_n252CliCod = new boolean[] {false} ;
      P077X4_A898BarPieNDes = new int[1] ;
      P077X4_n898BarPieNDes = new boolean[] {false} ;
      A834TipDefDsc = "" ;
      A135BarColNom = "" ;
      A1431BarLocDis = "" ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A180BarMaqCod = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A3030BarPlf = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A4609BarMdlCod = "" ;
      A4812BarEncCli = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      AV31EmprCod = "" ;
      AV59Ceros8 = "" ;
      AV60HdrAlfa = "" ;
      AV35HojRut = "" ;
      AV49Remonta = "" ;
      AV78Texto = "" ;
      P077X5_A396EmprCod = new String[] {""} ;
      P077X5_n396EmprCod = new boolean[] {false} ;
      P077X5_A831TipColCod = new byte[1] ;
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
      AV94Muestras_i = "" ;
      AV77TotKgs = DecimalUtil.ZERO ;
      P077X6_A4295ClasCod = new short[1] ;
      P077X6_n4295ClasCod = new boolean[] {false} ;
      P077X6_A396EmprCod = new String[] {""} ;
      P077X6_n396EmprCod = new boolean[] {false} ;
      P077X6_A129BarCod = new int[1] ;
      P077X6_A132BarCodReo = new byte[1] ;
      P077X6_A130BarCodPar = new String[] {""} ;
      P077X6_A4296ClasDsc = new String[] {""} ;
      P077X6_n4296ClasDsc = new boolean[] {false} ;
      P077X6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077X6_A44AlbRecCod = new int[1] ;
      P077X6_A1501BarPiePie = new int[1] ;
      P077X6_A4601AlbRTam = new String[] {""} ;
      P077X6_A50AlbRLoc = new String[] {""} ;
      P077X6_A4602AlbRMdlCod = new String[] {""} ;
      P077X6_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077X6_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077X6_A200BarPieCod = new String[] {""} ;
      A4296ClasDsc = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A4601AlbRTam = "" ;
      A50AlbRLoc = "" ;
      A4602AlbRMdlCod = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV83ClasDsc = "" ;
      AV63TipARtDsc = "" ;
      P077X7_A396EmprCod = new String[] {""} ;
      P077X7_n396EmprCod = new boolean[] {false} ;
      P077X7_A361DisCod = new int[1] ;
      P077X7_A377DisObsTxt = new String[] {""} ;
      P077X7_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P077X8_A396EmprCod = new String[] {""} ;
      P077X8_n396EmprCod = new boolean[] {false} ;
      P077X8_A129BarCod = new int[1] ;
      P077X8_A132BarCodReo = new byte[1] ;
      P077X8_A130BarCodPar = new String[] {""} ;
      P077X8_A194BarOrdLin = new short[1] ;
      P077X8_A758ProCod = new String[] {""} ;
      P077X8_A603MaqCodBis = new String[] {""} ;
      P077X8_A5045BarFasAgr = new String[] {""} ;
      P077X8_n5045BarFasAgr = new boolean[] {false} ;
      P077X8_A460FasDsc = new String[] {""} ;
      P077X8_A457FasCod = new String[] {""} ;
      A758ProCod = "" ;
      A603MaqCodBis = "" ;
      A5045BarFasAgr = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      AV88Kgs_ppda = "" ;
      AV92Pzs_ppda = "" ;
      AV90Kgs_pdaT = DecimalUtil.ZERO ;
      P077X9_A396EmprCod = new String[] {""} ;
      P077X9_n396EmprCod = new boolean[] {false} ;
      P077X9_A129BarCod = new int[1] ;
      P077X9_A132BarCodReo = new byte[1] ;
      P077X9_A130BarCodPar = new String[] {""} ;
      P077X9_A758ProCod = new String[] {""} ;
      P077X9_A194BarOrdLin = new short[1] ;
      P077X9_A4643BarFasLot = new int[1] ;
      P077X9_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077X9_n4645BarFasKgs = new boolean[] {false} ;
      P077X9_A4644BarFasNPrd = new short[1] ;
      P077X9_n4644BarFasNPrd = new boolean[] {false} ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      AV89Kgspda = DecimalUtil.ZERO ;
      AV85Agr_txt = "" ;
      AV91FasDsc = "" ;
      AV30MaqDsc = "" ;
      P077X10_A602MaqCod = new String[] {""} ;
      P077X10_A396EmprCod = new String[] {""} ;
      P077X10_n396EmprCod = new boolean[] {false} ;
      P077X10_A606MaqDsc = new String[] {""} ;
      P077X10_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      AV29IntDsc = "" ;
      GXv_char8 = new String[1] ;
      AV39ForColNom = "" ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      P077X11_A829TipArtCod = new short[1] ;
      P077X11_A396EmprCod = new String[] {""} ;
      P077X11_n396EmprCod = new boolean[] {false} ;
      P077X11_A830TipArtDsc = new String[] {""} ;
      P077X11_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrsup__default(),
         new Object[] {
             new Object[] {
            P077X2_A396EmprCod, P077X2_n396EmprCod, P077X2_A942TermCod, P077X2_A1189TermUsu, P077X2_n1189TermUsu
            }
            , new Object[] {
            P077X4_A833TipDefCod, P077X4_n833TipDefCod, P077X4_A396EmprCod, P077X4_A129BarCod, P077X4_A132BarCodReo, P077X4_A130BarCodPar, P077X4_A361DisCod, P077X4_A218BarTipCol, P077X4_A148BarEstReo, P077X4_A834TipDefDsc,
            P077X4_n834TipDefDsc, P077X4_A135BarColNom, P077X4_A136BarColNum, P077X4_A213BarSit, P077X4_A1431BarLocDis, P077X4_A3644CliNom1, P077X4_A279CliNom, P077X4_A217BarTipArt, P077X4_n217BarTipArt, P077X4_A180BarMaqCod,
            P077X4_A1909BarGraAca, P077X4_A3137BarGraAca2, P077X4_A125BarAncAca1, P077X4_A126BarAncAca2, P077X4_A1224BarEncAnh, P077X4_A1223BarEncCom, P077X4_A3030BarPlf, P077X4_A1652BarSerDsc, P077X4_A212BarSer, P077X4_A4609BarMdlCod,
            P077X4_A4812BarEncCli, P077X4_A158BarFecFpr, P077X4_A159BarFecGen, P077X4_A155BarFecCli, P077X4_A252CliCod, P077X4_n252CliCod, P077X4_A898BarPieNDes, P077X4_n898BarPieNDes
            }
            , new Object[] {
            P077X5_A396EmprCod, P077X5_A831TipColCod
            }
            , new Object[] {
            P077X6_A4295ClasCod, P077X6_n4295ClasCod, P077X6_A396EmprCod, P077X6_A129BarCod, P077X6_A132BarCodReo, P077X6_A130BarCodPar, P077X6_A4296ClasDsc, P077X6_n4296ClasDsc, P077X6_A203BarPieKil, P077X6_A44AlbRecCod,
            P077X6_A1501BarPiePie, P077X6_A4601AlbRTam, P077X6_A50AlbRLoc, P077X6_A4602AlbRMdlCod, P077X6_A4290AlbPmPPza, P077X6_A58AlbRUniEnt, P077X6_A200BarPieCod
            }
            , new Object[] {
            P077X7_A396EmprCod, P077X7_A361DisCod, P077X7_A377DisObsTxt, P077X7_A376DisObsLin
            }
            , new Object[] {
            P077X8_A396EmprCod, P077X8_A129BarCod, P077X8_A132BarCodReo, P077X8_A130BarCodPar, P077X8_A194BarOrdLin, P077X8_A758ProCod, P077X8_A603MaqCodBis, P077X8_A5045BarFasAgr, P077X8_n5045BarFasAgr, P077X8_A460FasDsc,
            P077X8_A457FasCod
            }
            , new Object[] {
            P077X9_A396EmprCod, P077X9_A129BarCod, P077X9_A132BarCodReo, P077X9_A130BarCodPar, P077X9_A758ProCod, P077X9_A194BarOrdLin, P077X9_A4643BarFasLot, P077X9_A4645BarFasKgs, P077X9_n4645BarFasKgs, P077X9_A4644BarFasNPrd,
            P077X9_n4644BarFasNPrd
            }
            , new Object[] {
            P077X10_A602MaqCod, P077X10_A396EmprCod, P077X10_A606MaqDsc, P077X10_n606MaqDsc
            }
            , new Object[] {
            P077X11_A829TipArtCod, P077X11_A396EmprCod, P077X11_A830TipArtDsc, P077X11_n830TipArtDsc
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
   private byte A148BarEstReo ;
   private byte A213BarSit ;
   private byte AV61LenVar ;
   private byte A831TipColCod ;
   private byte AV43BarTipCol ;
   private byte A376DisObsLin ;
   private byte AV66ContLin ;
   private byte GXv_int6[] ;
   private byte AV28IntCod ;
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
   private short AV93Pzs_fase ;
   private short A4644BarFasNPrd ;
   private short A829TipArtCod ;
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
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int AV40ForColNum ;
   private int GXv_int10[] ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal AV77TotKgs ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV90Kgs_pdaT ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private java.math.BigDecimal AV89Kgspda ;
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
   private String A135BarColNom ;
   private String A1431BarLocDis ;
   private String A3644CliNom1 ;
   private String A279CliNom ;
   private String A180BarMaqCod ;
   private String A3030BarPlf ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A4609BarMdlCod ;
   private String A4812BarEncCli ;
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
   private String AV87vtexto ;
   private String AV86Tipdefdsc ;
   private String AV94Muestras_i ;
   private String A4296ClasDsc ;
   private String A4601AlbRTam ;
   private String A50AlbRLoc ;
   private String A4602AlbRMdlCod ;
   private String A200BarPieCod ;
   private String AV83ClasDsc ;
   private String AV63TipARtDsc ;
   private String A377DisObsTxt ;
   private String A758ProCod ;
   private String A603MaqCodBis ;
   private String A5045BarFasAgr ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV88Kgs_ppda ;
   private String AV92Pzs_ppda ;
   private String AV85Agr_txt ;
   private String AV91FasDsc ;
   private String AV30MaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV29IntDsc ;
   private String GXv_char8[] ;
   private String AV39ForColNom ;
   private String GXv_char9[] ;
   private String A830TipArtDsc ;
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
   private boolean n252CliCod ;
   private boolean n898BarPieNDes ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n5045BarFasAgr ;
   private boolean n4645BarFasKgs ;
   private boolean n4644BarFasNPrd ;
   private boolean n606MaqDsc ;
   private boolean n830TipArtDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P077X2_A396EmprCod ;
   private boolean[] P077X2_n396EmprCod ;
   private String[] P077X2_A942TermCod ;
   private String[] P077X2_A1189TermUsu ;
   private boolean[] P077X2_n1189TermUsu ;
   private short[] P077X4_A833TipDefCod ;
   private boolean[] P077X4_n833TipDefCod ;
   private String[] P077X4_A396EmprCod ;
   private boolean[] P077X4_n396EmprCod ;
   private int[] P077X4_A129BarCod ;
   private byte[] P077X4_A132BarCodReo ;
   private String[] P077X4_A130BarCodPar ;
   private int[] P077X4_A361DisCod ;
   private byte[] P077X4_A218BarTipCol ;
   private byte[] P077X4_A148BarEstReo ;
   private String[] P077X4_A834TipDefDsc ;
   private boolean[] P077X4_n834TipDefDsc ;
   private String[] P077X4_A135BarColNom ;
   private int[] P077X4_A136BarColNum ;
   private byte[] P077X4_A213BarSit ;
   private String[] P077X4_A1431BarLocDis ;
   private String[] P077X4_A3644CliNom1 ;
   private String[] P077X4_A279CliNom ;
   private short[] P077X4_A217BarTipArt ;
   private boolean[] P077X4_n217BarTipArt ;
   private String[] P077X4_A180BarMaqCod ;
   private short[] P077X4_A1909BarGraAca ;
   private short[] P077X4_A3137BarGraAca2 ;
   private short[] P077X4_A125BarAncAca1 ;
   private short[] P077X4_A126BarAncAca2 ;
   private java.math.BigDecimal[] P077X4_A1224BarEncAnh ;
   private java.math.BigDecimal[] P077X4_A1223BarEncCom ;
   private String[] P077X4_A3030BarPlf ;
   private String[] P077X4_A1652BarSerDsc ;
   private String[] P077X4_A212BarSer ;
   private String[] P077X4_A4609BarMdlCod ;
   private String[] P077X4_A4812BarEncCli ;
   private java.util.Date[] P077X4_A158BarFecFpr ;
   private java.util.Date[] P077X4_A159BarFecGen ;
   private java.util.Date[] P077X4_A155BarFecCli ;
   private int[] P077X4_A252CliCod ;
   private boolean[] P077X4_n252CliCod ;
   private int[] P077X4_A898BarPieNDes ;
   private boolean[] P077X4_n898BarPieNDes ;
   private String[] P077X5_A396EmprCod ;
   private boolean[] P077X5_n396EmprCod ;
   private byte[] P077X5_A831TipColCod ;
   private short[] P077X6_A4295ClasCod ;
   private boolean[] P077X6_n4295ClasCod ;
   private String[] P077X6_A396EmprCod ;
   private boolean[] P077X6_n396EmprCod ;
   private int[] P077X6_A129BarCod ;
   private byte[] P077X6_A132BarCodReo ;
   private String[] P077X6_A130BarCodPar ;
   private String[] P077X6_A4296ClasDsc ;
   private boolean[] P077X6_n4296ClasDsc ;
   private java.math.BigDecimal[] P077X6_A203BarPieKil ;
   private int[] P077X6_A44AlbRecCod ;
   private int[] P077X6_A1501BarPiePie ;
   private String[] P077X6_A4601AlbRTam ;
   private String[] P077X6_A50AlbRLoc ;
   private String[] P077X6_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P077X6_A4290AlbPmPPza ;
   private java.math.BigDecimal[] P077X6_A58AlbRUniEnt ;
   private String[] P077X6_A200BarPieCod ;
   private String[] P077X7_A396EmprCod ;
   private boolean[] P077X7_n396EmprCod ;
   private int[] P077X7_A361DisCod ;
   private String[] P077X7_A377DisObsTxt ;
   private byte[] P077X7_A376DisObsLin ;
   private String[] P077X8_A396EmprCod ;
   private boolean[] P077X8_n396EmprCod ;
   private int[] P077X8_A129BarCod ;
   private byte[] P077X8_A132BarCodReo ;
   private String[] P077X8_A130BarCodPar ;
   private short[] P077X8_A194BarOrdLin ;
   private String[] P077X8_A758ProCod ;
   private String[] P077X8_A603MaqCodBis ;
   private String[] P077X8_A5045BarFasAgr ;
   private boolean[] P077X8_n5045BarFasAgr ;
   private String[] P077X8_A460FasDsc ;
   private String[] P077X8_A457FasCod ;
   private String[] P077X9_A396EmprCod ;
   private boolean[] P077X9_n396EmprCod ;
   private int[] P077X9_A129BarCod ;
   private byte[] P077X9_A132BarCodReo ;
   private String[] P077X9_A130BarCodPar ;
   private String[] P077X9_A758ProCod ;
   private short[] P077X9_A194BarOrdLin ;
   private int[] P077X9_A4643BarFasLot ;
   private java.math.BigDecimal[] P077X9_A4645BarFasKgs ;
   private boolean[] P077X9_n4645BarFasKgs ;
   private short[] P077X9_A4644BarFasNPrd ;
   private boolean[] P077X9_n4644BarFasNPrd ;
   private String[] P077X10_A602MaqCod ;
   private String[] P077X10_A396EmprCod ;
   private boolean[] P077X10_n396EmprCod ;
   private String[] P077X10_A606MaqDsc ;
   private boolean[] P077X10_n606MaqDsc ;
   private short[] P077X11_A829TipArtCod ;
   private String[] P077X11_A396EmprCod ;
   private boolean[] P077X11_n396EmprCod ;
   private String[] P077X11_A830TipArtDsc ;
   private boolean[] P077X11_n830TipArtDsc ;
}

final  class rhdrsup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P077X2", "SELECT EmprCod, TermCod, TermUsu FROM TXPTERMIN WHERE (TermCod = ?) AND (EmprCod = ?) ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077X4", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarTipCol, T1.BarEstReo, T2.TipDefDsc, T1.BarColNom, T1.BarColNum, T1.BarSit, T1.BarLocDis, T3.CliNom1, T3.CliNom, T1.BarTipArt, T1.BarMaqCod, T1.BarGraAca, T1.BarGraAca2, T1.BarAncAca1, T1.BarAncAca2, T1.BarEncAnh, T1.BarEncCom, T1.BarPlf, T1.BarSerDsc, T1.BarSer, T1.BarMdlCod, T1.BarEncCli, T1.BarFecFpr, T1.BarFecGen, T1.BarFecCli, T1.CliCod, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077X5", "SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077X6", "SELECT T2.ClasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ClasDsc, T1.BarPieKil, T1.AlbRecCod, T1.BarPiePie, T2.AlbRTam, T2.AlbRLoc, T2.AlbRMdlCod, T2.AlbPmPPza, T2.AlbRUniEnt, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077X7", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077X8", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.ProCod, T1.MaqCodBis, T1.BarFasAgr, T2.FasDsc, T1.FasCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077X9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarFasKgs, BarFasNPrd FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077X10", "SELECT MaqCod, EmprCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077X11", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((String[]) buf[27])[0] = rslt.getString(25, 26);
               ((String[]) buf[28])[0] = rslt.getString(26, 16);
               ((String[]) buf[29])[0] = rslt.getString(27, 13);
               ((String[]) buf[30])[0] = rslt.getString(28, 20);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(29);
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(30);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(31);
               ((int[]) buf[34])[0] = rslt.getInt(32);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(33);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
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
               ((String[]) buf[12])[0] = rslt.getString(11, 10);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[16])[0] = rslt.getString(15, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 28);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
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
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

