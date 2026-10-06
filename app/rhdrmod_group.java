package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrmod_group extends GXReport
{
   public rhdrmod_group( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrmod_group.class ), "" );
   }

   public rhdrmod_group( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 ,
                          String aP4 ,
                          int[] aP5 )
   {
      rhdrmod_group.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int[] aP5 ,
                        IReportHandler reportHandler )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int[] aP5 ,
                             IReportHandler reportHandler )
   {
      rhdrmod_group.this.A396EmprCod = aP0;
      rhdrmod_group.this.A129BarCod = aP1;
      rhdrmod_group.this.A132BarCodReo = aP2;
      rhdrmod_group.this.A130BarCodPar = aP3;
      rhdrmod_group.this.AV8ImpCod = aP4;
      rhdrmod_group.this.Gx_line = aP5[0];
      this.aP5 = aP5;
      this.reportHandler = reportHandler;
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
      try
      {
         setPrinter(reportHandler);
         P_lines = getPrinter().getPageLines();
         lineHeight = getPrinter().getLineHeight();
         M_top = getPrinter().getM_top();
         M_bot = getPrinter().getM_bot();
         Gx_page = getPrinter().getPage();
         loadReportMetadata("RHDRMOD_GROUP") ;
         GXt_char1 = AV67ContDsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRMOD", ""), GXv_char2) ;
         rhdrmod_group.this.GXt_char1 = GXv_char2[0] ;
         AV67ContDsc = GXt_char1 ;
         GXt_char1 = AV9Termin ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         rhdrmod_group.this.GXt_char1 = GXv_char2[0] ;
         AV9Termin = GXt_char1 ;
         /* Using cursor P0ACX2 */
         pr_default.execute(0, new Object[] {AV9Termin, Boolean.valueOf(n396EmprCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A942TermCod = P0ACX2_A942TermCod[0] ;
            A1189TermUsu = P0ACX2_A1189TermUsu[0] ;
            n1189TermUsu = P0ACX2_n1189TermUsu[0] ;
            AV10TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P0ACX4 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P0ACX4_A833TipDefCod[0] ;
            n833TipDefCod = P0ACX4_n833TipDefCod[0] ;
            A361DisCod = P0ACX4_A361DisCod[0] ;
            A2829BarProPer = P0ACX4_A2829BarProPer[0] ;
            A13908BarIdtx2 = P0ACX4_A13908BarIdtx2[0] ;
            n13908BarIdtx2 = P0ACX4_n13908BarIdtx2[0] ;
            A9775BarItem1 = P0ACX4_A9775BarItem1[0] ;
            A9776barItem2 = P0ACX4_A9776barItem2[0] ;
            A221BarTra1 = P0ACX4_A221BarTra1[0] ;
            A224BarTraP1 = P0ACX4_A224BarTraP1[0] ;
            A222BarTra2 = P0ACX4_A222BarTra2[0] ;
            A225BarTraP2 = P0ACX4_A225BarTraP2[0] ;
            A223BarTra3 = P0ACX4_A223BarTra3[0] ;
            A226BarTraP3 = P0ACX4_A226BarTraP3[0] ;
            A229BarUrd1 = P0ACX4_A229BarUrd1[0] ;
            A232BarUrdP1 = P0ACX4_A232BarUrdP1[0] ;
            A230BarUrd2 = P0ACX4_A230BarUrd2[0] ;
            A233BarUrdP2 = P0ACX4_A233BarUrdP2[0] ;
            A2010BarTipDis = P0ACX4_A2010BarTipDis[0] ;
            A181BarMaqPro = P0ACX4_A181BarMaqPro[0] ;
            A148BarEstReo = P0ACX4_A148BarEstReo[0] ;
            A834TipDefDsc = P0ACX4_A834TipDefDsc[0] ;
            n834TipDefDsc = P0ACX4_n834TipDefDsc[0] ;
            A1503BarPart = P0ACX4_A1503BarPart[0] ;
            A159BarFecGen = P0ACX4_A159BarFecGen[0] ;
            A218BarTipCol = P0ACX4_A218BarTipCol[0] ;
            A252CliCod = P0ACX4_A252CliCod[0] ;
            n252CliCod = P0ACX4_n252CliCod[0] ;
            A212BarSer = P0ACX4_A212BarSer[0] ;
            A135BarColNom = P0ACX4_A135BarColNom[0] ;
            A136BarColNum = P0ACX4_A136BarColNum[0] ;
            A213BarSit = P0ACX4_A213BarSit[0] ;
            A1431BarLocDis = P0ACX4_A1431BarLocDis[0] ;
            A3644CliNom1 = P0ACX4_A3644CliNom1[0] ;
            A279CliNom = P0ACX4_A279CliNom[0] ;
            A155BarFecCli = P0ACX4_A155BarFecCli[0] ;
            A1235BarNumCli = P0ACX4_A1235BarNumCli[0] ;
            A1234BarNomCli = P0ACX4_A1234BarNomCli[0] ;
            A143BarDisNum = P0ACX4_A143BarDisNum[0] ;
            A217BarTipArt = P0ACX4_A217BarTipArt[0] ;
            n217BarTipArt = P0ACX4_n217BarTipArt[0] ;
            A180BarMaqCod = P0ACX4_A180BarMaqCod[0] ;
            A1909BarGraAca = P0ACX4_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P0ACX4_A3137BarGraAca2[0] ;
            A125BarAncAca1 = P0ACX4_A125BarAncAca1[0] ;
            A126BarAncAca2 = P0ACX4_A126BarAncAca2[0] ;
            A1224BarEncAnh = P0ACX4_A1224BarEncAnh[0] ;
            A1223BarEncCom = P0ACX4_A1223BarEncCom[0] ;
            A2454BarGirar = P0ACX4_A2454BarGirar[0] ;
            A3311BarManCod1 = P0ACX4_A3311BarManCod1[0] ;
            A11662BarOrdComp = P0ACX4_A11662BarOrdComp[0] ;
            A206BarPle = P0ACX4_A206BarPle[0] ;
            A1652BarSerDsc = P0ACX4_A1652BarSerDsc[0] ;
            A166BarKgm = P0ACX4_A166BarKgm[0] ;
            A199BarPie1 = P0ACX4_A199BarPie1[0] ;
            A365DisDes = P0ACX4_A365DisDes[0] ;
            A898BarPieNDes = P0ACX4_A898BarPieNDes[0] ;
            A834TipDefDsc = P0ACX4_A834TipDefDsc[0] ;
            n834TipDefDsc = P0ACX4_n834TipDefDsc[0] ;
            A3644CliNom1 = P0ACX4_A3644CliNom1[0] ;
            A279CliNom = P0ACX4_A279CliNom[0] ;
            A166BarKgm = P0ACX4_A166BarKgm[0] ;
            A199BarPie1 = P0ACX4_A199BarPie1[0] ;
            A898BarPieNDes = P0ACX4_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV105Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S171 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV106BarIdtx2 = A13908BarIdtx2 ;
            /* Execute user subroutine: 'INDITEX2' */
            S181 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV108procesoidtx = ((GXutil.strcmp("", AV106BarIdtx2)==0) ? " " : httpContext.getMessage( "PROCESSO", "")) ;
            AV73barCod = A129BarCod ;
            AV75BarCodreo = A132BarCodReo ;
            AV74BarCodPar = A130BarCodPar ;
            AV99Baritem1 = GXutil.substring( A9775BarItem1, 1, 10) ;
            AV100BarItem2 = GXutil.substring( A9776barItem2, 1, 10) ;
            AV102Comp = " " ;
            if ( GXutil.strcmp(A221BarTra1, "") != 0 )
            {
               AV102Comp = GXutil.trim( A221BarTra1) + " " + GXutil.str( A224BarTraP1, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A222BarTra2, "") != 0 )
            {
               AV102Comp += " " + GXutil.trim( A222BarTra2) + " " + GXutil.str( A225BarTraP2, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A223BarTra3, "") != 0 )
            {
               AV102Comp += " " + GXutil.trim( A223BarTra3) + " " + GXutil.str( A226BarTraP3, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A229BarUrd1, "") != 0 )
            {
               AV102Comp += " " + GXutil.trim( A229BarUrd1) + " " + GXutil.str( A232BarUrdP1, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A230BarUrd2, "") != 0 )
            {
               AV102Comp += " " + GXutil.trim( A230BarUrd2) + " " + GXutil.str( A233BarUrdP2, 3, 0) + "%" ;
            }
            GXv_char2[0] = AV103tipdisdsc ;
            GXv_int3[0] = (byte)(0) ;
            new app.pbustdi(remoteHandle, context).execute( A396EmprCod, A2010BarTipDis, GXv_char2, GXv_int3) ;
            rhdrmod_group.this.AV103tipdisdsc = GXv_char2[0] ;
            /* Execute user subroutine: 'ALBBAR' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV60MacCod = 0 ;
            GXv_int4[0] = AV60MacCod ;
            new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int4) ;
            rhdrmod_group.this.AV60MacCod = GXv_int4[0] ;
            GXv_char2[0] = AV101Marcadsc ;
            new app.pmarcacliente(remoteHandle, context).execute( A396EmprCod, A181BarMaqPro, GXv_char2) ;
            rhdrmod_group.this.AV101Marcadsc = GXv_char2[0] ;
            AV101Marcadsc = GXutil.substring( AV101Marcadsc, 1, 30) ;
            AV70TotKgs = A166BarKgm ;
            AV24EmprCod = A396EmprCod ;
            AV38DetPzas = (short)(A898BarPieNDes) ;
            AV52Ceros8 = "00000000" ;
            AV53HdrAlfa = GXutil.str( A129BarCod, 8, 0) ;
            AV53HdrAlfa = GXutil.ltrim( GXutil.rtrim( AV53HdrAlfa)) ;
            AV54LenVar = (byte)(GXutil.len( AV53HdrAlfa)) ;
            AV54LenVar = (byte)(8-AV54LenVar) ;
            AV53HdrAlfa = GXutil.substring( AV52Ceros8, 1, AV54LenVar) + AV53HdrAlfa ;
            if ( GXutil.strcmp(A130BarCodPar, " ") == 0 )
            {
               AV28HojRut = "*" + AV53HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + "*" ;
            }
            else
            {
               AV28HojRut = "*" + AV53HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            }
            AV28HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            AV42Remonta = "" ;
            AV71Texto = GXutil.space( (short)(20)) ;
            if ( A148BarEstReo == 2 )
            {
               AV42Remonta = httpContext.getMessage( "Dev. ", "") + GXutil.substring( A834TipDefDsc, 1, 15) ;
               AV71Texto = httpContext.getMessage( "REM. EXT.", "") ;
            }
            if ( A148BarEstReo == 1 )
            {
               AV42Remonta = GXutil.substring( A834TipDefDsc, 1, 15) ;
               AV71Texto = httpContext.getMessage( "REM. INT.", "") ;
            }
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV79Tab_loc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV80Tab_kgs[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV82Tab_fe[1-1] = GXutil.nullDate() ;
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV83Tab_pz[GX_I-1] = 0 ;
               GX_I = (int)(GX_I+1) ;
            }
            AV81i = (byte)(1) ;
            /* Using cursor P0ACX5 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P0ACX5_A44AlbRecCod[0] ;
               A203BarPieKil = P0ACX5_A203BarPieKil[0] ;
               A50AlbRLoc = P0ACX5_A50AlbRLoc[0] ;
               A49AlbRFen = P0ACX5_A49AlbRFen[0] ;
               A1501BarPiePie = P0ACX5_A1501BarPiePie[0] ;
               A200BarPieCod = P0ACX5_A200BarPieCod[0] ;
               A50AlbRLoc = P0ACX5_A50AlbRLoc[0] ;
               A49AlbRFen = P0ACX5_A49AlbRFen[0] ;
               if ( AV81i > 5 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV80Tab_kgs[AV81i-1] = A203BarPieKil ;
               AV79Tab_loc[AV81i-1] = A50AlbRLoc ;
               AV82Tab_fe[AV81i-1] = A49AlbRFen ;
               AV83Tab_pz[AV81i-1] = A1501BarPiePie ;
               AV81i = (byte)(AV81i+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            hACX0( false, GxDrawDynamicGetPrintBlockHeight(1)) ;
            GxDrawDynamicText(94, 2, GXutil.rtrim( localUtil.format( AV28HojRut, "")), Gx_line) ;
            GxDrawDynamicText(94, 3, httpContext.getMessage( "Ordem Serviço:", ""), Gx_line) ;
            GxDrawDynamicText(94, 4, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), Gx_line) ;
            GxDrawDynamicText(94, 5, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), Gx_line) ;
            GxDrawDynamicText(94, 6, GXutil.rtrim( localUtil.format( A130BarCodPar, "")), Gx_line) ;
            GxDrawDynamicText(94, 7, httpContext.getMessage( "Data Emissão:", ""), Gx_line) ;
            GxDrawDynamicText(94, 8, localUtil.format( A159BarFecGen, "99/99/99"), Gx_line) ;
            GxDrawDynamicText(94, 9, Gx_line) ;
            GxDrawDynamicRect(94, 10, Gx_line) ;
            GxDrawDynamicText(94, 11, GXutil.rtrim( localUtil.format( AV67ContDsc, "")), Gx_line) ;
            GxDrawDynamicBitMap(94, 12, context.getHttpContext().getImagePath( "3c99144a-8aa9-43d5-8fce-801099ee2ac5", "", context.getHttpContext().getTheme( )), Gx_line) ;
            GxDrawDynamicText(94, 13, GXutil.rtrim( localUtil.format( AV71Texto, "")), Gx_line) ;
            GxDrawDynamicText(94, 14, GXutil.rtrim( localUtil.format( AV42Remonta, "")), Gx_line) ;
            GxDrawDynamicText(94, 15, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), Gx_line) ;
            GxDrawDynamicText(94, 16, Gx_line) ;
            GxDrawDynamicText(94, 17, Gx_line) ;
            GxDrawDynamicText(94, 18, httpContext.getMessage( "PARTIDA:", ""), Gx_line) ;
            GxDrawDynamicText(94, 19, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9")), Gx_line) ;
            GxDrawDynamicText(94, 20, GXutil.rtrim( localUtil.format( AV107baridtxdc2, "")), Gx_line) ;
            GxDrawDynamicText(94, 21, GXutil.rtrim( localUtil.format( AV108procesoidtx, "")), Gx_line) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(1)) ;
            GXt_char1 = AV20TipColDsc ;
            GXv_char2[0] = GXt_char1 ;
            new app.ptipcoldsc(remoteHandle, context).execute( A396EmprCod, A218BarTipCol, GXv_char2) ;
            rhdrmod_group.this.GXt_char1 = GXv_char2[0] ;
            AV20TipColDsc = GXt_char1 ;
            AV29CliCod = A252CliCod ;
            AV30ArtCod = A212BarSer ;
            AV34BarColNom = A135BarColNom ;
            AV35BarColNum = A136BarColNum ;
            AV36BarTipCol = A218BarTipCol ;
            /* Execute user subroutine: 'BUSCOL' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV63Sit = " " ;
            if ( A213BarSit == 2 )
            {
               AV63Sit = httpContext.getMessage( "(LAB)", "") ;
            }
            AV47DisCod = A361DisCod ;
            AV46ALbRLoc = A1431BarLocDis ;
            if ( (GXutil.strcmp("", AV46ALbRLoc)==0) )
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
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV72vCliNom = A279CliNom + GXutil.substring( A3644CliNom1, 1, 10) ;
            hACX0( false, GxDrawDynamicGetPrintBlockHeight(22)) ;
            GxDrawDynamicText(118, 23, httpContext.getMessage( "Doc. Cliente:", ""), Gx_line) ;
            GxDrawDynamicText(118, 24, GXutil.rtrim( localUtil.format( A143BarDisNum, "")), Gx_line) ;
            GxDrawDynamicText(118, 25, httpContext.getMessage( "Cliente:", ""), Gx_line) ;
            GxDrawDynamicText(118, 26, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), Gx_line) ;
            GxDrawDynamicText(118, 27, httpContext.getMessage( "V/Refª Cor:", ""), Gx_line) ;
            GxDrawDynamicText(118, 28, GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), Gx_line) ;
            GxDrawDynamicText(118, 29, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), Gx_line) ;
            GxDrawDynamicRect(118, 30, Gx_line) ;
            GxDrawDynamicText(118, 31, GXutil.rtrim( localUtil.format( AV72vCliNom, "")), Gx_line) ;
            GxDrawDynamicText(118, 32, httpContext.getMessage( "Data Enc.:", ""), Gx_line) ;
            GxDrawDynamicText(118, 33, localUtil.format( A155BarFecCli, "99/99/99"), Gx_line) ;
            GxDrawDynamicText(118, 34, GXutil.rtrim( localUtil.format( AV103tipdisdsc, "")), Gx_line) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(22)) ;
            AV55TipArtCod = A217BarTipArt ;
            /* Execute user subroutine: 'TIPART' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV25MaqCod = A180BarMaqCod ;
            /* Execute user subroutine: 'DSCMAQ' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV50BarGraAca = "" ;
            AV69BarGraAca2 = "" ;
            if ( (0==A1909BarGraAca) )
            {
               AV50BarGraAca = "??" ;
            }
            else
            {
               AV50BarGraAca = GXutil.str( A1909BarGraAca, 4, 0) ;
            }
            if ( (0==A3137BarGraAca2) )
            {
               AV69BarGraAca2 = "??" ;
            }
            else
            {
               AV69BarGraAca2 = GXutil.str( A3137BarGraAca2, 4, 0) ;
            }
            if ( ! (0==A1909BarGraAca) && (0==A3137BarGraAca2) )
            {
               AV69BarGraAca2 = " " ;
            }
            AV51BarAncAca1 = "" ;
            AV68BarAncAca2 = "" ;
            if ( (0==A125BarAncAca1) )
            {
               AV51BarAncAca1 = "??" ;
            }
            else
            {
               AV51BarAncAca1 = GXutil.str( A125BarAncAca1, 4, 0) ;
            }
            if ( (0==A126BarAncAca2) )
            {
               AV68BarAncAca2 = "??" ;
            }
            else
            {
               AV68BarAncAca2 = GXutil.str( A126BarAncAca2, 4, 0) ;
            }
            if ( ! (0==A125BarAncAca1) && (0==A126BarAncAca2) )
            {
               AV68BarAncAca2 = " " ;
            }
            AV64BarEncAnh = "" ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1224BarEncAnh)==0) )
            {
               AV64BarEncAnh = "??" ;
            }
            else
            {
               AV64BarEncAnh = GXutil.str( A1224BarEncAnh, 6, 2) ;
            }
            AV65BarEncCom = "" ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1223BarEncCom)==0) )
            {
               AV65BarEncCom = "??" ;
            }
            else
            {
               AV65BarEncCom = GXutil.str( A1223BarEncCom, 6, 2) ;
            }
            AV86Cartaz = GXutil.substring( A2454BarGirar, 1, 10) ;
            AV88NPrgTing = A3311BarManCod1 ;
            /* Execute user subroutine: 'PRG_TING' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            hACX0( false, GxDrawDynamicGetPrintBlockHeight(35)) ;
            GxDrawDynamicText(174, 36, httpContext.getMessage( "Composição:", ""), Gx_line) ;
            GxDrawDynamicText(174, 37, httpContext.getMessage( "Gram.", ""), Gx_line) ;
            GxDrawDynamicText(174, 38, httpContext.getMessage( "Medida", ""), Gx_line) ;
            GxDrawDynamicText(174, 39, GXutil.rtrim( localUtil.format( AV64BarEncAnh, "")), Gx_line) ;
            GxDrawDynamicText(174, 40, GXutil.rtrim( localUtil.format( AV65BarEncCom, "")), Gx_line) ;
            GxDrawDynamicText(174, 41, GXutil.rtrim( localUtil.format( AV51BarAncAca1, "")), Gx_line) ;
            GxDrawDynamicText(174, 42, GXutil.rtrim( localUtil.format( AV50BarGraAca, "")), Gx_line) ;
            GxDrawDynamicText(174, 43, httpContext.getMessage( "Cor/Serviço:", ""), Gx_line) ;
            GxDrawDynamicText(174, 44, GXutil.rtrim( localUtil.format( A135BarColNom, "")), Gx_line) ;
            GxDrawDynamicText(174, 45, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), Gx_line) ;
            GxDrawDynamicText(174, 46, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), Gx_line) ;
            GxDrawDynamicText(174, 47, httpContext.getMessage( "Artigo:", ""), Gx_line) ;
            GxDrawDynamicText(174, 48, GXutil.rtrim( localUtil.format( A212BarSer, "")), Gx_line) ;
            GxDrawDynamicText(174, 49, GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), Gx_line) ;
            GxDrawDynamicRect(174, 50, Gx_line) ;
            GxDrawDynamicRect(174, 51, Gx_line) ;
            GxDrawDynamicText(174, 52, httpContext.getMessage( "Parametros de Acabamento", ""), Gx_line) ;
            GxDrawDynamicText(174, 53, httpContext.getMessage( "(g/m2)", ""), Gx_line) ;
            GxDrawDynamicText(174, 54, httpContext.getMessage( "Enc.", ""), Gx_line) ;
            GxDrawDynamicText(174, 55, Gx_line) ;
            GxDrawDynamicLine(174, 56, Gx_line) ;
            GxDrawDynamicText(174, 57, httpContext.getMessage( "Torção", ""), Gx_line) ;
            GxDrawDynamicText(174, 58, Gx_line) ;
            GxDrawDynamicLine(174, 59, Gx_line) ;
            GxDrawDynamicText(174, 60, httpContext.getMessage( "(cm)", ""), Gx_line) ;
            GxDrawDynamicLine(174, 61, Gx_line) ;
            GxDrawDynamicLine(174, 62, Gx_line) ;
            GxDrawDynamicLine(174, 63, Gx_line) ;
            GxDrawDynamicText(174, 64, GXutil.rtrim( localUtil.format( A206BarPle, "")), Gx_line) ;
            GxDrawDynamicText(174, 65, httpContext.getMessage( "Apresentação", ""), Gx_line) ;
            GxDrawDynamicLine(174, 66, Gx_line) ;
            GxDrawDynamicText(174, 67, httpContext.getMessage( "Numero:", ""), Gx_line) ;
            GxDrawDynamicText(174, 68, httpContext.getMessage( "Tc:", ""), Gx_line) ;
            GxDrawDynamicText(174, 69, GXutil.rtrim( localUtil.format( AV68BarAncAca2, "")), Gx_line) ;
            GxDrawDynamicText(174, 70, GXutil.rtrim( localUtil.format( AV69BarGraAca2, "")), Gx_line) ;
            GxDrawDynamicText(174, 71, httpContext.getMessage( "Cartaz Nº:", ""), Gx_line) ;
            GxDrawDynamicText(174, 72, GXutil.rtrim( localUtil.format( AV86Cartaz, "")), Gx_line) ;
            GxDrawDynamicText(174, 73, httpContext.getMessage( "Programa:", ""), Gx_line) ;
            GxDrawDynamicText(174, 74, GXutil.rtrim( localUtil.format( AV87PrgTing, "")), Gx_line) ;
            GxDrawDynamicText(174, 75, httpContext.getMessage( "Intensid:", ""), Gx_line) ;
            GxDrawDynamicText(174, 76, GXutil.rtrim( localUtil.format( AV22IntDsc, "")), Gx_line) ;
            GxDrawDynamicText(174, 77, httpContext.getMessage( "Marca Cliente:", ""), Gx_line) ;
            GxDrawDynamicText(174, 78, GXutil.rtrim( localUtil.format( AV101Marcadsc, "")), Gx_line) ;
            GxDrawDynamicText(174, 79, GXutil.rtrim( localUtil.format( A11662BarOrdComp, "")), Gx_line) ;
            GxDrawDynamicText(174, 80, httpContext.getMessage( "PO:", ""), Gx_line) ;
            GxDrawDynamicText(174, 81, GXutil.rtrim( localUtil.format( AV102Comp, "")), Gx_line) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(35)) ;
            AV97Primeravez = (byte)(0) ;
            /* Using cursor P0ACX6 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A44AlbRecCod = P0ACX6_A44AlbRecCod[0] ;
               A8028AlbNumB = P0ACX6_A8028AlbNumB[0] ;
               A6463AlbRLote = P0ACX6_A6463AlbRLote[0] ;
               A6465AlbRLu = P0ACX6_A6465AlbRLu[0] ;
               A4602AlbRMdlCod = P0ACX6_A4602AlbRMdlCod[0] ;
               A6464AlbRTelar = P0ACX6_A6464AlbRTelar[0] ;
               A8035AlbMaqTej = P0ACX6_A8035AlbMaqTej[0] ;
               A6470AlbRTara = P0ACX6_A6470AlbRTara[0] ;
               A49AlbRFen = P0ACX6_A49AlbRFen[0] ;
               A50AlbRLoc = P0ACX6_A50AlbRLoc[0] ;
               A1501BarPiePie = P0ACX6_A1501BarPiePie[0] ;
               A203BarPieKil = P0ACX6_A203BarPieKil[0] ;
               A200BarPieCod = P0ACX6_A200BarPieCod[0] ;
               A8028AlbNumB = P0ACX6_A8028AlbNumB[0] ;
               A6463AlbRLote = P0ACX6_A6463AlbRLote[0] ;
               A6465AlbRLu = P0ACX6_A6465AlbRLu[0] ;
               A4602AlbRMdlCod = P0ACX6_A4602AlbRMdlCod[0] ;
               A6464AlbRTelar = P0ACX6_A6464AlbRTelar[0] ;
               A8035AlbMaqTej = P0ACX6_A8035AlbMaqTej[0] ;
               A6470AlbRTara = P0ACX6_A6470AlbRTara[0] ;
               A49AlbRFen = P0ACX6_A49AlbRFen[0] ;
               A50AlbRLoc = P0ACX6_A50AlbRLoc[0] ;
               AV98AlbNumb = A8028AlbNumB ;
               if ( AV97Primeravez == 0 )
               {
                  AV97Primeravez = (byte)(1) ;
                  hACX0( false, GxDrawDynamicGetPrintBlockHeight(82)) ;
                  GxDrawDynamicText(181, 83, httpContext.getMessage( "Entrada", ""), Gx_line) ;
                  GxDrawDynamicRect(181, 84, Gx_line) ;
                  GxDrawDynamicText(181, 85, httpContext.getMessage( "(Kg)", ""), Gx_line) ;
                  GxDrawDynamicText(181, 86, httpContext.getMessage( "Peças", ""), Gx_line) ;
                  GxDrawDynamicLine(181, 87, Gx_line) ;
                  GxDrawDynamicLine(181, 88, Gx_line) ;
                  GxDrawDynamicLine(181, 89, Gx_line) ;
                  GxDrawDynamicLine(181, 90, Gx_line) ;
                  GxDrawDynamicText(181, 91, httpContext.getMessage( "Localização", ""), Gx_line) ;
                  GxDrawDynamicText(181, 92, httpContext.getMessage( "Data", ""), Gx_line) ;
                  GxDrawDynamicLine(181, 93, Gx_line) ;
                  GxDrawDynamicLine(181, 94, Gx_line) ;
                  GxDrawDynamicText(181, 95, GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), Gx_line) ;
                  GxDrawDynamicText(181, 96, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), Gx_line) ;
                  GxDrawDynamicText(181, 97, httpContext.getMessage( "Total", ""), Gx_line) ;
                  GxDrawDynamicLine(181, 98, Gx_line) ;
                  GxDrawDynamicText(181, 99, httpContext.getMessage( "Lote", ""), Gx_line) ;
                  GxDrawDynamicText(181, 100, httpContext.getMessage( "Jogo", ""), Gx_line) ;
                  GxDrawDynamicText(181, 101, httpContext.getMessage( "Fio", ""), Gx_line) ;
                  GxDrawDynamicText(181, 102, Gx_line) ;
                  GxDrawDynamicText(181, 103, httpContext.getMessage( "Maquina", ""), Gx_line) ;
                  GxDrawDynamicText(181, 104, httpContext.getMessage( "LFA", ""), Gx_line) ;
                  GxDrawDynamicLine(181, 105, Gx_line) ;
                  GxDrawDynamicLine(181, 106, Gx_line) ;
                  GxDrawDynamicLine(181, 107, Gx_line) ;
                  GxDrawDynamicLine(181, 108, Gx_line) ;
                  GxDrawDynamicLine(181, 109, Gx_line) ;
                  GxDrawDynamicLine(181, 110, Gx_line) ;
                  GxDrawDynamicLine(181, 111, Gx_line) ;
                  GxDrawDynamicText(181, 112, GXutil.rtrim( localUtil.format( AV104Dsc_Idtx, "")), Gx_line) ;
                  GxDrawDynamicLine(181, 113, Gx_line) ;
                  GxDrawDynamicText(181, 114, GXutil.rtrim( localUtil.format( AV98AlbNumb, "")), Gx_line) ;
                  GxDrawDynamicText(181, 115, httpContext.getMessage( "R. Composiçao:", ""), Gx_line) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(82)) ;
               }
               AV95AlbrLote = A6463AlbRLote ;
               AV118AlbRLu_trunc = (int)(DecimalUtil.decToDouble(GXutil.truncDecimal( A6465AlbRLu, 0))) ;
               AV96Pgadas = ((AV118AlbRLu_trunc>99) ? "**" : GXutil.trim( GXutil.str( AV118AlbRLu_trunc, 6, 0))) ;
               AV91Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
               AV92Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
               AV94Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
               hACX0( false, GxDrawDynamicGetPrintBlockHeight(116)) ;
               GxDrawDynamicText(190, 117, GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), Gx_line) ;
               GxDrawDynamicText(190, 118, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), Gx_line) ;
               GxDrawDynamicText(190, 119, GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), Gx_line) ;
               GxDrawDynamicText(190, 120, localUtil.format( A49AlbRFen, "99/99/99"), Gx_line) ;
               GxDrawDynamicText(190, 121, GXutil.rtrim( localUtil.format( AV95AlbrLote, "")), Gx_line) ;
               GxDrawDynamicText(190, 122, GXutil.rtrim( localUtil.format( AV91Jogo3, "")), Gx_line) ;
               GxDrawDynamicText(190, 123, GXutil.rtrim( localUtil.format( AV96Pgadas, "")), Gx_line) ;
               GxDrawDynamicText(190, 124, GXutil.rtrim( localUtil.format( AV94Maq6, "")), Gx_line) ;
               GxDrawDynamicText(190, 125, GXutil.ltrim( localUtil.format( A6470AlbRTara, "ZZ9.99")), Gx_line) ;
               GxDrawDynamicText(190, 126, GXutil.rtrim( localUtil.format( AV92Fio5, "")), Gx_line) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(116)) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            hACX0( false, GxDrawDynamicGetPrintBlockHeight(127)) ;
            GxDrawDynamicText(195, 128, httpContext.getMessage( "Observações", ""), Gx_line) ;
            GxDrawDynamicLine(195, 129, Gx_line) ;
            GxDrawDynamicLine(195, 130, Gx_line) ;
            GxDrawDynamicLine(195, 131, Gx_line) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(127)) ;
            /* Using cursor P0ACX7 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A377DisObsTxt = P0ACX7_A377DisObsTxt[0] ;
               A376DisObsLin = P0ACX7_A376DisObsLin[0] ;
               hACX0( false, GxDrawDynamicGetPrintBlockHeight(132)) ;
               GxDrawDynamicText(197, 133, GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), Gx_line) ;
               GxDrawDynamicLine(197, 134, Gx_line) ;
               GxDrawDynamicLine(197, 135, Gx_line) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(132)) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            hACX0( false, GxDrawDynamicGetPrintBlockHeight(136)) ;
            GxDrawDynamicLine(199, 137, Gx_line) ;
            GxDrawDynamicLine(199, 138, Gx_line) ;
            GxDrawDynamicLine(199, 139, Gx_line) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(136)) ;
            hACX0( false, GxDrawDynamicGetPrintBlockHeight(140)) ;
            GxDrawDynamicRect(200, 141, Gx_line) ;
            GxDrawDynamicText(200, 142, httpContext.getMessage( "FASES DE PRODUÇÃO", ""), Gx_line) ;
            GxDrawDynamicLine(200, 143, Gx_line) ;
            GxDrawDynamicLine(200, 144, Gx_line) ;
            GxDrawDynamicText(200, 145, httpContext.getMessage( "Operario", ""), Gx_line) ;
            GxDrawDynamicText(200, 146, httpContext.getMessage( "Data", ""), Gx_line) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(140)) ;
            /* Using cursor P0ACX8 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A603MaqCodBis = P0ACX8_A603MaqCodBis[0] ;
               A460FasDsc = P0ACX8_A460FasDsc[0] ;
               A457FasCod = P0ACX8_A457FasCod[0] ;
               A194BarOrdLin = P0ACX8_A194BarOrdLin[0] ;
               A758ProCod = P0ACX8_A758ProCod[0] ;
               A460FasDsc = P0ACX8_A460FasDsc[0] ;
               AV25MaqCod = A603MaqCodBis ;
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
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               hACX0( false, GxDrawDynamicGetPrintBlockHeight(147)) ;
               GxDrawDynamicText(205, 148, GXutil.rtrim( localUtil.format( A457FasCod, "@!")), Gx_line) ;
               GxDrawDynamicText(205, 149, GXutil.rtrim( localUtil.format( A460FasDsc, "")), Gx_line) ;
               GxDrawDynamicLine(205, 150, Gx_line) ;
               GxDrawDynamicLine(205, 151, Gx_line) ;
               GxDrawDynamicLine(205, 152, Gx_line) ;
               GxDrawDynamicLine(205, 153, Gx_line) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(147)) ;
               AV59ContLin = (byte)(AV59ContLin+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            hACX0( false, GxDrawDynamicGetPrintBlockHeight(154)) ;
            GxDrawDynamicLine(208, 155, Gx_line) ;
            GxDrawDynamicLine(208, 156, Gx_line) ;
            GxDrawDynamicLine(208, 157, Gx_line) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(154)) ;
            AV59ContLin = (byte)(AV59ContLin+1) ;
            AV26Contador = (byte)(1) ;
            /* Using cursor P0ACX9 */
            pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV60MacCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1199MacCod = P0ACX9_A1199MacCod[0] ;
               A1205MacBarPar = P0ACX9_A1205MacBarPar[0] ;
               A1204MacBarReo = P0ACX9_A1204MacBarReo[0] ;
               A1203MacBarCod = P0ACX9_A1203MacBarCod[0] ;
               A1201MacLin = P0ACX9_A1201MacLin[0] ;
               if ( ( A129BarCod == A1203MacBarCod ) && ( A132BarCodReo == A1204MacBarReo ) && ( GXutil.strcmp(A1205MacBarPar, A130BarCodPar) == 0 ) )
               {
               }
               else
               {
                  GXv_decimal5[0] = AV61KgmAgr ;
                  GXv_char2[0] = AV58ArtDscAGr ;
                  GXv_char6[0] = AV57ObsTxt ;
                  GXv_int4[0] = AV66Pecas ;
                  new app.pobsagr(remoteHandle, context).execute( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, GXv_decimal5, GXv_char2, GXv_char6, GXv_int4) ;
                  rhdrmod_group.this.AV61KgmAgr = GXv_decimal5[0] ;
                  rhdrmod_group.this.AV58ArtDscAGr = GXv_char2[0] ;
                  rhdrmod_group.this.AV57ObsTxt = GXv_char6[0] ;
                  rhdrmod_group.this.AV66Pecas = (short)((short)(GXv_int4[0])) ;
                  AV70TotKgs = AV70TotKgs.add(AV61KgmAgr) ;
                  if ( AV26Contador == 1 )
                  {
                     AV26Contador = (byte)(2) ;
                     hACX0( false, GxDrawDynamicGetPrintBlockHeight(158)) ;
                     GxDrawDynamicRect(222, 159, Gx_line) ;
                     GxDrawDynamicText(222, 160, httpContext.getMessage( "ACESSÓRIOS", ""), Gx_line) ;
                     GxDrawDynamicText(222, 161, httpContext.getMessage( "Macro =", ""), Gx_line) ;
                     GxDrawDynamicText(222, 162, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV60MacCod), "ZZZZZZZ9")), Gx_line) ;
                     GxDrawDynamicLine(222, 163, Gx_line) ;
                     GxDrawDynamicLine(222, 164, Gx_line) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(158)) ;
                     AV59ContLin = (byte)(AV59ContLin+3) ;
                  }
                  hACX0( false, GxDrawDynamicGetPrintBlockHeight(165)) ;
                  GxDrawDynamicText(225, 166, GXutil.rtrim( localUtil.format( AV57ObsTxt, "")), Gx_line) ;
                  GxDrawDynamicText(225, 167, GXutil.rtrim( localUtil.format( AV58ArtDscAGr, "")), Gx_line) ;
                  GxDrawDynamicText(225, 168, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1203MacBarCod), "ZZZZZZZ9")), Gx_line) ;
                  GxDrawDynamicText(225, 169, GXutil.rtrim( localUtil.format( A1205MacBarPar, "")), Gx_line) ;
                  GxDrawDynamicText(225, 170, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1204MacBarReo), "9")), Gx_line) ;
                  GxDrawDynamicText(225, 171, Gx_line) ;
                  GxDrawDynamicText(225, 172, GXutil.ltrim( localUtil.format( AV61KgmAgr, "ZZZZZ9.99")), Gx_line) ;
                  GxDrawDynamicText(225, 173, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV66Pecas), "ZZZ9")), Gx_line) ;
                  GxDrawDynamicText(225, 174, httpContext.getMessage( "peça c/", ""), Gx_line) ;
                  GxDrawDynamicText(225, 175, httpContext.getMessage( "Kgs", ""), Gx_line) ;
                  GxDrawDynamicText(225, 176, httpContext.getMessage( "Obs.", ""), Gx_line) ;
                  GxDrawDynamicLine(225, 177, Gx_line) ;
                  GxDrawDynamicLine(225, 178, Gx_line) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(165)) ;
                  AV59ContLin = (byte)(AV59ContLin+1) ;
               }
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( AV26Contador == 2 )
            {
               hACX0( false, GxDrawDynamicGetPrintBlockHeight(179)) ;
               GxDrawDynamicLine(231, 180, Gx_line) ;
               GxDrawDynamicLine(231, 181, Gx_line) ;
               GxDrawDynamicLine(231, 182, Gx_line) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(179)) ;
               AV59ContLin = (byte)(AV59ContLin+1) ;
            }
            if ( AV26Contador == 2 )
            {
               hACX0( false, GxDrawDynamicGetPrintBlockHeight(183)) ;
               GxDrawDynamicText(236, 184, GXutil.ltrim( localUtil.format( AV70TotKgs, "ZZZZZ9.99")), Gx_line) ;
               GxDrawDynamicText(236, 185, httpContext.getMessage( "Total Partida", ""), Gx_line) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(183)) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV116L = (short)(Gx_line) ;
         AV117To = (short)(AV116L+10) ;
         hACX0( false, GxDrawDynamicGetPrintBlockHeight(186)) ;
         GxDrawDynamicText(249, 187, httpContext.getMessage( "Hora /Data Emissão:", ""), Gx_line) ;
         GxDrawDynamicText(249, 188, GXutil.rtrim( localUtil.format( Gx_time, "")), Gx_line) ;
         GxDrawDynamicText(249, 189, httpContext.getMessage( "Utilizador:", ""), Gx_line) ;
         GxDrawDynamicText(249, 190, GXutil.rtrim( localUtil.format( AV10TermUsu, "@!")), Gx_line) ;
         GxDrawDynamicRect(249, 191, Gx_line) ;
         GxDrawDynamicText(249, 192, httpContext.getMessage( "Observações (Manuais)", ""), Gx_line) ;
         GxDrawDynamicText(249, 193, httpContext.getMessage( "SAIDA", ""), Gx_line) ;
         GxDrawDynamicRect(249, 194, Gx_line) ;
         GxDrawDynamicText(249, 195, httpContext.getMessage( "DATA", ""), Gx_line) ;
         GxDrawDynamicLine(249, 196, Gx_line) ;
         GxDrawDynamicText(249, 197, httpContext.getMessage( "Quantidade", ""), Gx_line) ;
         GxDrawDynamicText(249, 198, httpContext.getMessage( "(Kg)", ""), Gx_line) ;
         GxDrawDynamicText(249, 199, httpContext.getMessage( "(M)", ""), Gx_line) ;
         GxDrawDynamicLine(249, 200, Gx_line) ;
         GxDrawDynamicLine(249, 201, Gx_line) ;
         GxDrawDynamicLine(249, 202, Gx_line) ;
         GxDrawDynamicText(249, 203, httpContext.getMessage( "Rúbrica", ""), Gx_line) ;
         GxDrawDynamicLine(249, 204, Gx_line) ;
         GxDrawDynamicLine(249, 205, Gx_line) ;
         GxDrawDynamicText(249, 206, httpContext.getMessage( "Peças", ""), Gx_line) ;
         GxDrawDynamicText(249, 207, localUtil.format( Gx_date, "99/99/99"), Gx_line) ;
         GxDrawDynamicLine(249, 208, Gx_line) ;
         GxDrawDynamicLine(249, 209, Gx_line) ;
         GxDrawDynamicText(249, 210, httpContext.getMessage( "Largura", ""), Gx_line) ;
         GxDrawDynamicText(249, 211, httpContext.getMessage( "Gramagem", ""), Gx_line) ;
         GxDrawDynamicText(249, 212, GXutil.ltrim( localUtil.format( AV76Kgs_s, "ZZZZZZ.ZZ")), Gx_line) ;
         GxDrawDynamicText(249, 213, GXutil.ltrim( localUtil.format( AV77Mts_s, "ZZZZZZ.ZZ")), Gx_line) ;
         GxDrawDynamicText(249, 214, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78Pzs_s), "ZZZZ")), Gx_line) ;
         GxDrawDynamicText(249, 215, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84AlbHdrAnc), "ZZZ9")), Gx_line) ;
         GxDrawDynamicText(249, 216, GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV85AlbHdrGm2), "ZZZ9")), Gx_line) ;
         GxDrawDynamicText(249, 217, localUtil.format( AV89Albprofch, "99/99/99"), Gx_line) ;
         GxDrawDynamicLine(249, 218, Gx_line) ;
         GxDrawDynamicText(249, 219, GXutil.rtrim( localUtil.format( AV99Baritem1, "")), Gx_line) ;
         GxDrawDynamicText(249, 220, GXutil.rtrim( localUtil.format( AV100BarItem2, "")), Gx_line) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+GxDrawDynamicGetPrintBlockHeight(186)) ;
         /* Force skipping of lines */
         hACX0( false, GxDrawDynamicGetPrintBlockHeight(1)) ;
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
      AV23MaqDsc = "" ;
      /* Using cursor P0ACX10 */
      pr_default.execute(7, new Object[] {AV24EmprCod, AV25MaqCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A602MaqCod = P0ACX10_A602MaqCod[0] ;
         A606MaqDsc = P0ACX10_A606MaqDsc[0] ;
         n606MaqDsc = P0ACX10_n606MaqDsc[0] ;
         AV23MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BUSCOL' Routine */
      returnInSub = false ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int4[0] = AV29CliCod ;
      GXv_char2[0] = AV30ArtCod ;
      GXv_char7[0] = AV34BarColNom ;
      GXv_int8[0] = AV35BarColNum ;
      GXv_int3[0] = A218BarTipCol ;
      GXv_int9[0] = AV21IntCod ;
      GXv_char10[0] = AV22IntDsc ;
      GXv_char11[0] = AV32ForColNom ;
      GXv_int12[0] = AV33ForColNum ;
      new app.pbusint(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char2, GXv_char7, GXv_int8, GXv_int3, GXv_int9, GXv_char10, GXv_char11, GXv_int12) ;
      rhdrmod_group.this.A396EmprCod = GXv_char6[0] ;
      rhdrmod_group.this.AV29CliCod = GXv_int4[0] ;
      rhdrmod_group.this.AV30ArtCod = GXv_char2[0] ;
      rhdrmod_group.this.AV34BarColNom = GXv_char7[0] ;
      rhdrmod_group.this.AV35BarColNum = GXv_int8[0] ;
      rhdrmod_group.this.A218BarTipCol = GXv_int3[0] ;
      rhdrmod_group.this.AV21IntCod = GXv_int9[0] ;
      rhdrmod_group.this.AV22IntDsc = GXv_char10[0] ;
      rhdrmod_group.this.AV32ForColNom = GXv_char11[0] ;
      rhdrmod_group.this.AV33ForColNum = GXv_int12[0] ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'EMPESA' Routine */
      returnInSub = false ;
      AV43AlbREnt = "" ;
      AV45ALbRfen = GXutil.nullDate() ;
      AV46ALbRLoc = "" ;
      AV44ProceNom = "" ;
      /* Using cursor P0ACX11 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV47DisCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A970ProceCod = P0ACX11_A970ProceCod[0] ;
         n970ProceCod = P0ACX11_n970ProceCod[0] ;
         A361DisCod = P0ACX11_A361DisCod[0] ;
         A46AlbREnt = P0ACX11_A46AlbREnt[0] ;
         A49AlbRFen = P0ACX11_A49AlbRFen[0] ;
         A50AlbRLoc = P0ACX11_A50AlbRLoc[0] ;
         A971ProceNom = P0ACX11_A971ProceNom[0] ;
         n971ProceNom = P0ACX11_n971ProceNom[0] ;
         A44AlbRecCod = P0ACX11_A44AlbRecCod[0] ;
         A970ProceCod = P0ACX11_A970ProceCod[0] ;
         n970ProceCod = P0ACX11_n970ProceCod[0] ;
         A46AlbREnt = P0ACX11_A46AlbREnt[0] ;
         A49AlbRFen = P0ACX11_A49AlbRFen[0] ;
         A50AlbRLoc = P0ACX11_A50AlbRLoc[0] ;
         A971ProceNom = P0ACX11_A971ProceNom[0] ;
         n971ProceNom = P0ACX11_n971ProceNom[0] ;
         AV43AlbREnt = A46AlbREnt ;
         AV45ALbRfen = A49AlbRFen ;
         AV46ALbRLoc = A50AlbRLoc ;
         AV44ProceNom = A971ProceNom ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV56TipARtDsc = "" ;
      /* Using cursor P0ACX12 */
      pr_default.execute(9, new Object[] {AV24EmprCod, Short.valueOf(AV55TipArtCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A829TipArtCod = P0ACX12_A829TipArtCod[0] ;
         A830TipArtDsc = P0ACX12_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ACX12_n830TipArtDsc[0] ;
         AV56TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV76Kgs_s = DecimalUtil.doubleToDec(0) ;
      AV77Mts_s = DecimalUtil.doubleToDec(0) ;
      AV78Pzs_s = (short)(0) ;
      AV89Albprofch = GXutil.nullDate() ;
      /* Using cursor P0ACX13 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV73barCod), Byte.valueOf(AV75BarCodreo), AV74BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A30AlbProCod = P0ACX13_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P0ACX13_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P0ACX13_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P0ACX13_A1265BarAlbPie[0] ;
         A3271AlbHdrAnc = P0ACX13_A3271AlbHdrAnc[0] ;
         A5019AlbHdrgm2 = P0ACX13_A5019AlbHdrgm2[0] ;
         A34AlbProfch = P0ACX13_A34AlbProfch[0] ;
         A34AlbProfch = P0ACX13_A34AlbProfch[0] ;
         AV76Kgs_s = AV76Kgs_s.add(A1261BarAlbKgmE) ;
         AV77Mts_s = AV77Mts_s.add(A1263BarAlbMtrE) ;
         AV78Pzs_s = (short)(AV78Pzs_s+A1265BarAlbPie) ;
         AV84AlbHdrAnc = A3271AlbHdrAnc ;
         AV85AlbHdrGm2 = A5019AlbHdrgm2 ;
         AV89Albprofch = A34AlbProfch ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'PRG_TING' Routine */
      returnInSub = false ;
      AV87PrgTing = "" ;
      /* Using cursor P0ACX14 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV29CliCod), Short.valueOf(AV88NPrgTing)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A8391PMDCod = P0ACX14_A8391PMDCod[0] ;
         A252CliCod = P0ACX14_A252CliCod[0] ;
         n252CliCod = P0ACX14_n252CliCod[0] ;
         A8392PMDDsc = P0ACX14_A8392PMDDsc[0] ;
         n8392PMDDsc = P0ACX14_n8392PMDDsc[0] ;
         AV87PrgTing = A8392PMDDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P0ACX15 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, AV105Cod_Idtx});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A10887Cod_Idtx = P0ACX15_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0ACX15_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0ACX15_n10888Dsc_Idtx[0] ;
         AV104Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'INDITEX2' Routine */
      returnInSub = false ;
      /* Using cursor P0ACX16 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, AV106BarIdtx2});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A10887Cod_Idtx = P0ACX16_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0ACX16_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0ACX16_n10888Dsc_Idtx[0] ;
         AV107baridtxdc2 = GXutil.trim( GXutil.substring( A10888Dsc_Idtx, 1, 20)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void hACX0( boolean bFoot ,
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
      this.aP5[0] = rhdrmod_group.this.Gx_line;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV67ContDsc = "" ;
      AV9Termin = "" ;
      scmdbuf = "" ;
      P0ACX2_A396EmprCod = new String[] {""} ;
      P0ACX2_n396EmprCod = new boolean[] {false} ;
      P0ACX2_A942TermCod = new String[] {""} ;
      P0ACX2_A1189TermUsu = new String[] {""} ;
      P0ACX2_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV10TermUsu = "" ;
      P0ACX4_A833TipDefCod = new short[1] ;
      P0ACX4_n833TipDefCod = new boolean[] {false} ;
      P0ACX4_A396EmprCod = new String[] {""} ;
      P0ACX4_n396EmprCod = new boolean[] {false} ;
      P0ACX4_A129BarCod = new int[1] ;
      P0ACX4_A132BarCodReo = new byte[1] ;
      P0ACX4_A130BarCodPar = new String[] {""} ;
      P0ACX4_A361DisCod = new int[1] ;
      P0ACX4_A2829BarProPer = new String[] {""} ;
      P0ACX4_A13908BarIdtx2 = new String[] {""} ;
      P0ACX4_n13908BarIdtx2 = new boolean[] {false} ;
      P0ACX4_A9775BarItem1 = new String[] {""} ;
      P0ACX4_A9776barItem2 = new String[] {""} ;
      P0ACX4_A221BarTra1 = new String[] {""} ;
      P0ACX4_A224BarTraP1 = new short[1] ;
      P0ACX4_A222BarTra2 = new String[] {""} ;
      P0ACX4_A225BarTraP2 = new short[1] ;
      P0ACX4_A223BarTra3 = new String[] {""} ;
      P0ACX4_A226BarTraP3 = new short[1] ;
      P0ACX4_A229BarUrd1 = new String[] {""} ;
      P0ACX4_A232BarUrdP1 = new short[1] ;
      P0ACX4_A230BarUrd2 = new String[] {""} ;
      P0ACX4_A233BarUrdP2 = new short[1] ;
      P0ACX4_A2010BarTipDis = new String[] {""} ;
      P0ACX4_A181BarMaqPro = new String[] {""} ;
      P0ACX4_A148BarEstReo = new byte[1] ;
      P0ACX4_A834TipDefDsc = new String[] {""} ;
      P0ACX4_n834TipDefDsc = new boolean[] {false} ;
      P0ACX4_A1503BarPart = new short[1] ;
      P0ACX4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACX4_A218BarTipCol = new byte[1] ;
      P0ACX4_A252CliCod = new int[1] ;
      P0ACX4_n252CliCod = new boolean[] {false} ;
      P0ACX4_A212BarSer = new String[] {""} ;
      P0ACX4_A135BarColNom = new String[] {""} ;
      P0ACX4_A136BarColNum = new int[1] ;
      P0ACX4_A213BarSit = new byte[1] ;
      P0ACX4_A1431BarLocDis = new String[] {""} ;
      P0ACX4_A3644CliNom1 = new String[] {""} ;
      P0ACX4_A279CliNom = new String[] {""} ;
      P0ACX4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACX4_A1235BarNumCli = new int[1] ;
      P0ACX4_A1234BarNomCli = new String[] {""} ;
      P0ACX4_A143BarDisNum = new String[] {""} ;
      P0ACX4_A217BarTipArt = new short[1] ;
      P0ACX4_n217BarTipArt = new boolean[] {false} ;
      P0ACX4_A180BarMaqCod = new String[] {""} ;
      P0ACX4_A1909BarGraAca = new short[1] ;
      P0ACX4_A3137BarGraAca2 = new short[1] ;
      P0ACX4_A125BarAncAca1 = new short[1] ;
      P0ACX4_A126BarAncAca2 = new short[1] ;
      P0ACX4_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX4_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX4_A2454BarGirar = new String[] {""} ;
      P0ACX4_A3311BarManCod1 = new short[1] ;
      P0ACX4_A11662BarOrdComp = new String[] {""} ;
      P0ACX4_A206BarPle = new String[] {""} ;
      P0ACX4_A1652BarSerDsc = new String[] {""} ;
      P0ACX4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX4_A199BarPie1 = new short[1] ;
      P0ACX4_A365DisDes = new String[] {""} ;
      P0ACX4_A898BarPieNDes = new int[1] ;
      A2829BarProPer = "" ;
      A13908BarIdtx2 = "" ;
      A9775BarItem1 = "" ;
      A9776barItem2 = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A2010BarTipDis = "" ;
      A181BarMaqPro = "" ;
      A834TipDefDsc = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1431BarLocDis = "" ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      A180BarMaqCod = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A2454BarGirar = "" ;
      A11662BarOrdComp = "" ;
      A206BarPle = "" ;
      A1652BarSerDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV105Cod_Idtx = "" ;
      AV106BarIdtx2 = "" ;
      AV108procesoidtx = "" ;
      AV74BarCodPar = "" ;
      AV99Baritem1 = "" ;
      AV100BarItem2 = "" ;
      AV102Comp = "" ;
      AV103tipdisdsc = "" ;
      AV101Marcadsc = "" ;
      AV70TotKgs = DecimalUtil.ZERO ;
      AV24EmprCod = "" ;
      AV52Ceros8 = "" ;
      AV53HdrAlfa = "" ;
      AV28HojRut = "" ;
      AV42Remonta = "" ;
      AV71Texto = "" ;
      AV79Tab_loc = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV79Tab_loc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV80Tab_kgs = new java.math.BigDecimal[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV80Tab_kgs[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV82Tab_fe = new java.util.Date[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV82Tab_fe[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      AV83Tab_pz = new int[5] ;
      P0ACX5_A44AlbRecCod = new int[1] ;
      P0ACX5_A396EmprCod = new String[] {""} ;
      P0ACX5_n396EmprCod = new boolean[] {false} ;
      P0ACX5_A129BarCod = new int[1] ;
      P0ACX5_A132BarCodReo = new byte[1] ;
      P0ACX5_A130BarCodPar = new String[] {""} ;
      P0ACX5_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX5_A50AlbRLoc = new String[] {""} ;
      P0ACX5_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACX5_A1501BarPiePie = new int[1] ;
      P0ACX5_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      AV107baridtxdc2 = "" ;
      AV20TipColDsc = "" ;
      GXt_char1 = "" ;
      AV30ArtCod = "" ;
      AV34BarColNom = "" ;
      AV63Sit = "" ;
      AV46ALbRLoc = "" ;
      AV72vCliNom = "" ;
      AV25MaqCod = "" ;
      AV50BarGraAca = "" ;
      AV69BarGraAca2 = "" ;
      AV51BarAncAca1 = "" ;
      AV68BarAncAca2 = "" ;
      AV64BarEncAnh = "" ;
      AV65BarEncCom = "" ;
      AV86Cartaz = "" ;
      AV87PrgTing = "" ;
      AV22IntDsc = "" ;
      P0ACX6_A44AlbRecCod = new int[1] ;
      P0ACX6_A396EmprCod = new String[] {""} ;
      P0ACX6_n396EmprCod = new boolean[] {false} ;
      P0ACX6_A129BarCod = new int[1] ;
      P0ACX6_A132BarCodReo = new byte[1] ;
      P0ACX6_A130BarCodPar = new String[] {""} ;
      P0ACX6_A8028AlbNumB = new String[] {""} ;
      P0ACX6_A6463AlbRLote = new String[] {""} ;
      P0ACX6_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX6_A4602AlbRMdlCod = new String[] {""} ;
      P0ACX6_A6464AlbRTelar = new String[] {""} ;
      P0ACX6_A8035AlbMaqTej = new String[] {""} ;
      P0ACX6_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX6_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACX6_A50AlbRLoc = new String[] {""} ;
      P0ACX6_A1501BarPiePie = new int[1] ;
      P0ACX6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX6_A200BarPieCod = new String[] {""} ;
      A8028AlbNumB = "" ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      AV98AlbNumb = "" ;
      AV104Dsc_Idtx = "" ;
      AV95AlbrLote = "" ;
      AV96Pgadas = "" ;
      AV91Jogo3 = "" ;
      AV92Fio5 = "" ;
      AV94Maq6 = "" ;
      P0ACX7_A396EmprCod = new String[] {""} ;
      P0ACX7_n396EmprCod = new boolean[] {false} ;
      P0ACX7_A361DisCod = new int[1] ;
      P0ACX7_A377DisObsTxt = new String[] {""} ;
      P0ACX7_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P0ACX8_A396EmprCod = new String[] {""} ;
      P0ACX8_n396EmprCod = new boolean[] {false} ;
      P0ACX8_A129BarCod = new int[1] ;
      P0ACX8_A132BarCodReo = new byte[1] ;
      P0ACX8_A130BarCodPar = new String[] {""} ;
      P0ACX8_A603MaqCodBis = new String[] {""} ;
      P0ACX8_A460FasDsc = new String[] {""} ;
      P0ACX8_A457FasCod = new String[] {""} ;
      P0ACX8_A194BarOrdLin = new short[1] ;
      P0ACX8_A758ProCod = new String[] {""} ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P0ACX9_A396EmprCod = new String[] {""} ;
      P0ACX9_n396EmprCod = new boolean[] {false} ;
      P0ACX9_A1199MacCod = new int[1] ;
      P0ACX9_A1205MacBarPar = new String[] {""} ;
      P0ACX9_A1204MacBarReo = new byte[1] ;
      P0ACX9_A1203MacBarCod = new int[1] ;
      P0ACX9_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV61KgmAgr = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV58ArtDscAGr = "" ;
      AV57ObsTxt = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV76Kgs_s = DecimalUtil.ZERO ;
      AV77Mts_s = DecimalUtil.ZERO ;
      AV89Albprofch = GXutil.nullDate() ;
      AV23MaqDsc = "" ;
      P0ACX10_A602MaqCod = new String[] {""} ;
      P0ACX10_A396EmprCod = new String[] {""} ;
      P0ACX10_n396EmprCod = new boolean[] {false} ;
      P0ACX10_A606MaqDsc = new String[] {""} ;
      P0ACX10_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      GXv_char6 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char10 = new String[1] ;
      AV32ForColNom = "" ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      AV43AlbREnt = "" ;
      AV45ALbRfen = GXutil.nullDate() ;
      AV44ProceNom = "" ;
      P0ACX11_A970ProceCod = new short[1] ;
      P0ACX11_n970ProceCod = new boolean[] {false} ;
      P0ACX11_A396EmprCod = new String[] {""} ;
      P0ACX11_n396EmprCod = new boolean[] {false} ;
      P0ACX11_A361DisCod = new int[1] ;
      P0ACX11_A46AlbREnt = new String[] {""} ;
      P0ACX11_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACX11_A50AlbRLoc = new String[] {""} ;
      P0ACX11_A971ProceNom = new String[] {""} ;
      P0ACX11_n971ProceNom = new boolean[] {false} ;
      P0ACX11_A44AlbRecCod = new int[1] ;
      A46AlbREnt = "" ;
      A971ProceNom = "" ;
      AV56TipARtDsc = "" ;
      P0ACX12_A829TipArtCod = new short[1] ;
      P0ACX12_A396EmprCod = new String[] {""} ;
      P0ACX12_n396EmprCod = new boolean[] {false} ;
      P0ACX12_A830TipArtDsc = new String[] {""} ;
      P0ACX12_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P0ACX13_A30AlbProCod = new long[1] ;
      P0ACX13_A396EmprCod = new String[] {""} ;
      P0ACX13_n396EmprCod = new boolean[] {false} ;
      P0ACX13_A130BarCodPar = new String[] {""} ;
      P0ACX13_A132BarCodReo = new byte[1] ;
      P0ACX13_A129BarCod = new int[1] ;
      P0ACX13_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX13_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACX13_A1265BarAlbPie = new int[1] ;
      P0ACX13_A3271AlbHdrAnc = new short[1] ;
      P0ACX13_A5019AlbHdrgm2 = new short[1] ;
      P0ACX13_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A34AlbProfch = GXutil.nullDate() ;
      P0ACX14_A396EmprCod = new String[] {""} ;
      P0ACX14_n396EmprCod = new boolean[] {false} ;
      P0ACX14_A8391PMDCod = new short[1] ;
      P0ACX14_A252CliCod = new int[1] ;
      P0ACX14_n252CliCod = new boolean[] {false} ;
      P0ACX14_A8392PMDDsc = new String[] {""} ;
      P0ACX14_n8392PMDDsc = new boolean[] {false} ;
      A8392PMDDsc = "" ;
      P0ACX15_A396EmprCod = new String[] {""} ;
      P0ACX15_n396EmprCod = new boolean[] {false} ;
      P0ACX15_A10887Cod_Idtx = new String[] {""} ;
      P0ACX15_A10888Dsc_Idtx = new String[] {""} ;
      P0ACX15_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      P0ACX16_A396EmprCod = new String[] {""} ;
      P0ACX16_n396EmprCod = new boolean[] {false} ;
      P0ACX16_A10887Cod_Idtx = new String[] {""} ;
      P0ACX16_A10888Dsc_Idtx = new String[] {""} ;
      P0ACX16_n10888Dsc_Idtx = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrmod_group__default(),
         new Object[] {
             new Object[] {
            P0ACX2_A396EmprCod, P0ACX2_n396EmprCod, P0ACX2_A942TermCod, P0ACX2_A1189TermUsu, P0ACX2_n1189TermUsu
            }
            , new Object[] {
            P0ACX4_A833TipDefCod, P0ACX4_n833TipDefCod, P0ACX4_A396EmprCod, P0ACX4_A129BarCod, P0ACX4_A132BarCodReo, P0ACX4_A130BarCodPar, P0ACX4_A361DisCod, P0ACX4_A2829BarProPer, P0ACX4_A13908BarIdtx2, P0ACX4_n13908BarIdtx2,
            P0ACX4_A9775BarItem1, P0ACX4_A9776barItem2, P0ACX4_A221BarTra1, P0ACX4_A224BarTraP1, P0ACX4_A222BarTra2, P0ACX4_A225BarTraP2, P0ACX4_A223BarTra3, P0ACX4_A226BarTraP3, P0ACX4_A229BarUrd1, P0ACX4_A232BarUrdP1,
            P0ACX4_A230BarUrd2, P0ACX4_A233BarUrdP2, P0ACX4_A2010BarTipDis, P0ACX4_A181BarMaqPro, P0ACX4_A148BarEstReo, P0ACX4_A834TipDefDsc, P0ACX4_n834TipDefDsc, P0ACX4_A1503BarPart, P0ACX4_A159BarFecGen, P0ACX4_A218BarTipCol,
            P0ACX4_A252CliCod, P0ACX4_n252CliCod, P0ACX4_A212BarSer, P0ACX4_A135BarColNom, P0ACX4_A136BarColNum, P0ACX4_A213BarSit, P0ACX4_A1431BarLocDis, P0ACX4_A3644CliNom1, P0ACX4_A279CliNom, P0ACX4_A155BarFecCli,
            P0ACX4_A1235BarNumCli, P0ACX4_A1234BarNomCli, P0ACX4_A143BarDisNum, P0ACX4_A217BarTipArt, P0ACX4_n217BarTipArt, P0ACX4_A180BarMaqCod, P0ACX4_A1909BarGraAca, P0ACX4_A3137BarGraAca2, P0ACX4_A125BarAncAca1, P0ACX4_A126BarAncAca2,
            P0ACX4_A1224BarEncAnh, P0ACX4_A1223BarEncCom, P0ACX4_A2454BarGirar, P0ACX4_A3311BarManCod1, P0ACX4_A11662BarOrdComp, P0ACX4_A206BarPle, P0ACX4_A1652BarSerDsc, P0ACX4_A166BarKgm, P0ACX4_A199BarPie1, P0ACX4_A365DisDes,
            P0ACX4_A898BarPieNDes
            }
            , new Object[] {
            P0ACX5_A44AlbRecCod, P0ACX5_A396EmprCod, P0ACX5_A129BarCod, P0ACX5_A132BarCodReo, P0ACX5_A130BarCodPar, P0ACX5_A203BarPieKil, P0ACX5_A50AlbRLoc, P0ACX5_A49AlbRFen, P0ACX5_A1501BarPiePie, P0ACX5_A200BarPieCod
            }
            , new Object[] {
            P0ACX6_A44AlbRecCod, P0ACX6_A396EmprCod, P0ACX6_A129BarCod, P0ACX6_A132BarCodReo, P0ACX6_A130BarCodPar, P0ACX6_A8028AlbNumB, P0ACX6_A6463AlbRLote, P0ACX6_A6465AlbRLu, P0ACX6_A4602AlbRMdlCod, P0ACX6_A6464AlbRTelar,
            P0ACX6_A8035AlbMaqTej, P0ACX6_A6470AlbRTara, P0ACX6_A49AlbRFen, P0ACX6_A50AlbRLoc, P0ACX6_A1501BarPiePie, P0ACX6_A203BarPieKil, P0ACX6_A200BarPieCod
            }
            , new Object[] {
            P0ACX7_A396EmprCod, P0ACX7_A361DisCod, P0ACX7_A377DisObsTxt, P0ACX7_A376DisObsLin
            }
            , new Object[] {
            P0ACX8_A396EmprCod, P0ACX8_A129BarCod, P0ACX8_A132BarCodReo, P0ACX8_A130BarCodPar, P0ACX8_A603MaqCodBis, P0ACX8_A460FasDsc, P0ACX8_A457FasCod, P0ACX8_A194BarOrdLin, P0ACX8_A758ProCod
            }
            , new Object[] {
            P0ACX9_A396EmprCod, P0ACX9_A1199MacCod, P0ACX9_A1205MacBarPar, P0ACX9_A1204MacBarReo, P0ACX9_A1203MacBarCod, P0ACX9_A1201MacLin
            }
            , new Object[] {
            P0ACX10_A602MaqCod, P0ACX10_A396EmprCod, P0ACX10_A606MaqDsc, P0ACX10_n606MaqDsc
            }
            , new Object[] {
            P0ACX11_A970ProceCod, P0ACX11_n970ProceCod, P0ACX11_A396EmprCod, P0ACX11_A361DisCod, P0ACX11_A46AlbREnt, P0ACX11_A49AlbRFen, P0ACX11_A50AlbRLoc, P0ACX11_A971ProceNom, P0ACX11_n971ProceNom, P0ACX11_A44AlbRecCod
            }
            , new Object[] {
            P0ACX12_A829TipArtCod, P0ACX12_A396EmprCod, P0ACX12_A830TipArtDsc, P0ACX12_n830TipArtDsc
            }
            , new Object[] {
            P0ACX13_A30AlbProCod, P0ACX13_A396EmprCod, P0ACX13_A130BarCodPar, P0ACX13_A132BarCodReo, P0ACX13_A129BarCod, P0ACX13_A1261BarAlbKgmE, P0ACX13_A1263BarAlbMtrE, P0ACX13_A1265BarAlbPie, P0ACX13_A3271AlbHdrAnc, P0ACX13_A5019AlbHdrgm2,
            P0ACX13_A34AlbProfch
            }
            , new Object[] {
            P0ACX14_A396EmprCod, P0ACX14_A8391PMDCod, P0ACX14_A252CliCod, P0ACX14_A8392PMDDsc, P0ACX14_n8392PMDDsc
            }
            , new Object[] {
            P0ACX15_A396EmprCod, P0ACX15_A10887Cod_Idtx, P0ACX15_A10888Dsc_Idtx, P0ACX15_n10888Dsc_Idtx
            }
            , new Object[] {
            P0ACX16_A396EmprCod, P0ACX16_A10887Cod_Idtx, P0ACX16_A10888Dsc_Idtx, P0ACX16_n10888Dsc_Idtx
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte AV75BarCodreo ;
   private byte AV54LenVar ;
   private byte AV81i ;
   private byte AV36BarTipCol ;
   private byte AV97Primeravez ;
   private byte A376DisObsLin ;
   private byte AV59ContLin ;
   private byte AV26Contador ;
   private byte A1204MacBarReo ;
   private byte GXv_int3[] ;
   private byte AV21IntCod ;
   private byte GXv_int9[] ;
   private short A833TipDefCod ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A1503BarPart ;
   private short A217BarTipArt ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A3311BarManCod1 ;
   private short A199BarPie1 ;
   private short AV38DetPzas ;
   private short AV55TipArtCod ;
   private short AV88NPrgTing ;
   private short A194BarOrdLin ;
   private short A1201MacLin ;
   private short AV66Pecas ;
   private short AV116L ;
   private short AV117To ;
   private short AV78Pzs_s ;
   private short AV84AlbHdrAnc ;
   private short AV85AlbHdrGm2 ;
   private short A970ProceCod ;
   private short A829TipArtCod ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int Gx_line ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV73barCod ;
   private int AV60MacCod ;
   private int GX_I ;
   private int AV83Tab_pz[] ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int Gx_OldLine ;
   private int AV29CliCod ;
   private int AV35BarColNum ;
   private int AV47DisCod ;
   private int AV118AlbRLu_trunc ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int GXv_int4[] ;
   private int GXv_int8[] ;
   private int AV33ForColNum ;
   private int GXv_int12[] ;
   private int A1265BarAlbPie ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV70TotKgs ;
   private java.math.BigDecimal AV80Tab_kgs[] ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal AV61KgmAgr ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV76Kgs_s ;
   private java.math.BigDecimal AV77Mts_s ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8ImpCod ;
   private String AV67ContDsc ;
   private String AV9Termin ;
   private String scmdbuf ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV10TermUsu ;
   private String A2829BarProPer ;
   private String A13908BarIdtx2 ;
   private String A9775BarItem1 ;
   private String A9776barItem2 ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A2010BarTipDis ;
   private String A181BarMaqPro ;
   private String A834TipDefDsc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1431BarLocDis ;
   private String A3644CliNom1 ;
   private String A279CliNom ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A180BarMaqCod ;
   private String A2454BarGirar ;
   private String A206BarPle ;
   private String A1652BarSerDsc ;
   private String A365DisDes ;
   private String AV105Cod_Idtx ;
   private String AV106BarIdtx2 ;
   private String AV108procesoidtx ;
   private String AV74BarCodPar ;
   private String AV99Baritem1 ;
   private String AV100BarItem2 ;
   private String AV102Comp ;
   private String AV103tipdisdsc ;
   private String AV101Marcadsc ;
   private String AV24EmprCod ;
   private String AV52Ceros8 ;
   private String AV53HdrAlfa ;
   private String AV28HojRut ;
   private String AV42Remonta ;
   private String AV71Texto ;
   private String AV79Tab_loc[] ;
   private String A50AlbRLoc ;
   private String A200BarPieCod ;
   private String AV107baridtxdc2 ;
   private String AV20TipColDsc ;
   private String GXt_char1 ;
   private String AV30ArtCod ;
   private String AV34BarColNom ;
   private String AV63Sit ;
   private String AV46ALbRLoc ;
   private String AV72vCliNom ;
   private String AV25MaqCod ;
   private String AV50BarGraAca ;
   private String AV69BarGraAca2 ;
   private String AV51BarAncAca1 ;
   private String AV68BarAncAca2 ;
   private String AV64BarEncAnh ;
   private String AV65BarEncCom ;
   private String AV86Cartaz ;
   private String AV87PrgTing ;
   private String AV22IntDsc ;
   private String A8028AlbNumB ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String AV98AlbNumb ;
   private String AV104Dsc_Idtx ;
   private String AV95AlbrLote ;
   private String AV96Pgadas ;
   private String AV91Jogo3 ;
   private String AV92Fio5 ;
   private String AV94Maq6 ;
   private String A377DisObsTxt ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A1205MacBarPar ;
   private String AV58ArtDscAGr ;
   private String AV57ObsTxt ;
   private String Gx_time ;
   private String AV23MaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXv_char6[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char10[] ;
   private String AV32ForColNom ;
   private String GXv_char11[] ;
   private String AV43AlbREnt ;
   private String AV44ProceNom ;
   private String A46AlbREnt ;
   private String A971ProceNom ;
   private String AV56TipARtDsc ;
   private String A830TipArtDsc ;
   private String A8392PMDDsc ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date AV82Tab_fe[] ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date Gx_date ;
   private java.util.Date AV89Albprofch ;
   private java.util.Date AV45ALbRfen ;
   private java.util.Date A34AlbProfch ;
   private boolean n396EmprCod ;
   private boolean n1189TermUsu ;
   private boolean n833TipDefCod ;
   private boolean n13908BarIdtx2 ;
   private boolean n834TipDefDsc ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n830TipArtDsc ;
   private boolean n8392PMDDsc ;
   private boolean n10888Dsc_Idtx ;
   private String A11662BarOrdComp ;
   private IReportHandler reportHandler ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACX2_A396EmprCod ;
   private boolean[] P0ACX2_n396EmprCod ;
   private String[] P0ACX2_A942TermCod ;
   private String[] P0ACX2_A1189TermUsu ;
   private boolean[] P0ACX2_n1189TermUsu ;
   private short[] P0ACX4_A833TipDefCod ;
   private boolean[] P0ACX4_n833TipDefCod ;
   private String[] P0ACX4_A396EmprCod ;
   private boolean[] P0ACX4_n396EmprCod ;
   private int[] P0ACX4_A129BarCod ;
   private byte[] P0ACX4_A132BarCodReo ;
   private String[] P0ACX4_A130BarCodPar ;
   private int[] P0ACX4_A361DisCod ;
   private String[] P0ACX4_A2829BarProPer ;
   private String[] P0ACX4_A13908BarIdtx2 ;
   private boolean[] P0ACX4_n13908BarIdtx2 ;
   private String[] P0ACX4_A9775BarItem1 ;
   private String[] P0ACX4_A9776barItem2 ;
   private String[] P0ACX4_A221BarTra1 ;
   private short[] P0ACX4_A224BarTraP1 ;
   private String[] P0ACX4_A222BarTra2 ;
   private short[] P0ACX4_A225BarTraP2 ;
   private String[] P0ACX4_A223BarTra3 ;
   private short[] P0ACX4_A226BarTraP3 ;
   private String[] P0ACX4_A229BarUrd1 ;
   private short[] P0ACX4_A232BarUrdP1 ;
   private String[] P0ACX4_A230BarUrd2 ;
   private short[] P0ACX4_A233BarUrdP2 ;
   private String[] P0ACX4_A2010BarTipDis ;
   private String[] P0ACX4_A181BarMaqPro ;
   private byte[] P0ACX4_A148BarEstReo ;
   private String[] P0ACX4_A834TipDefDsc ;
   private boolean[] P0ACX4_n834TipDefDsc ;
   private short[] P0ACX4_A1503BarPart ;
   private java.util.Date[] P0ACX4_A159BarFecGen ;
   private byte[] P0ACX4_A218BarTipCol ;
   private int[] P0ACX4_A252CliCod ;
   private boolean[] P0ACX4_n252CliCod ;
   private String[] P0ACX4_A212BarSer ;
   private String[] P0ACX4_A135BarColNom ;
   private int[] P0ACX4_A136BarColNum ;
   private byte[] P0ACX4_A213BarSit ;
   private String[] P0ACX4_A1431BarLocDis ;
   private String[] P0ACX4_A3644CliNom1 ;
   private String[] P0ACX4_A279CliNom ;
   private java.util.Date[] P0ACX4_A155BarFecCli ;
   private int[] P0ACX4_A1235BarNumCli ;
   private String[] P0ACX4_A1234BarNomCli ;
   private String[] P0ACX4_A143BarDisNum ;
   private short[] P0ACX4_A217BarTipArt ;
   private boolean[] P0ACX4_n217BarTipArt ;
   private String[] P0ACX4_A180BarMaqCod ;
   private short[] P0ACX4_A1909BarGraAca ;
   private short[] P0ACX4_A3137BarGraAca2 ;
   private short[] P0ACX4_A125BarAncAca1 ;
   private short[] P0ACX4_A126BarAncAca2 ;
   private java.math.BigDecimal[] P0ACX4_A1224BarEncAnh ;
   private java.math.BigDecimal[] P0ACX4_A1223BarEncCom ;
   private String[] P0ACX4_A2454BarGirar ;
   private short[] P0ACX4_A3311BarManCod1 ;
   private String[] P0ACX4_A11662BarOrdComp ;
   private String[] P0ACX4_A206BarPle ;
   private String[] P0ACX4_A1652BarSerDsc ;
   private java.math.BigDecimal[] P0ACX4_A166BarKgm ;
   private short[] P0ACX4_A199BarPie1 ;
   private String[] P0ACX4_A365DisDes ;
   private int[] P0ACX4_A898BarPieNDes ;
   private int[] P0ACX5_A44AlbRecCod ;
   private String[] P0ACX5_A396EmprCod ;
   private boolean[] P0ACX5_n396EmprCod ;
   private int[] P0ACX5_A129BarCod ;
   private byte[] P0ACX5_A132BarCodReo ;
   private String[] P0ACX5_A130BarCodPar ;
   private java.math.BigDecimal[] P0ACX5_A203BarPieKil ;
   private String[] P0ACX5_A50AlbRLoc ;
   private java.util.Date[] P0ACX5_A49AlbRFen ;
   private int[] P0ACX5_A1501BarPiePie ;
   private String[] P0ACX5_A200BarPieCod ;
   private int[] P0ACX6_A44AlbRecCod ;
   private String[] P0ACX6_A396EmprCod ;
   private boolean[] P0ACX6_n396EmprCod ;
   private int[] P0ACX6_A129BarCod ;
   private byte[] P0ACX6_A132BarCodReo ;
   private String[] P0ACX6_A130BarCodPar ;
   private String[] P0ACX6_A8028AlbNumB ;
   private String[] P0ACX6_A6463AlbRLote ;
   private java.math.BigDecimal[] P0ACX6_A6465AlbRLu ;
   private String[] P0ACX6_A4602AlbRMdlCod ;
   private String[] P0ACX6_A6464AlbRTelar ;
   private String[] P0ACX6_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0ACX6_A6470AlbRTara ;
   private java.util.Date[] P0ACX6_A49AlbRFen ;
   private String[] P0ACX6_A50AlbRLoc ;
   private int[] P0ACX6_A1501BarPiePie ;
   private java.math.BigDecimal[] P0ACX6_A203BarPieKil ;
   private String[] P0ACX6_A200BarPieCod ;
   private String[] P0ACX7_A396EmprCod ;
   private boolean[] P0ACX7_n396EmprCod ;
   private int[] P0ACX7_A361DisCod ;
   private String[] P0ACX7_A377DisObsTxt ;
   private byte[] P0ACX7_A376DisObsLin ;
   private String[] P0ACX8_A396EmprCod ;
   private boolean[] P0ACX8_n396EmprCod ;
   private int[] P0ACX8_A129BarCod ;
   private byte[] P0ACX8_A132BarCodReo ;
   private String[] P0ACX8_A130BarCodPar ;
   private String[] P0ACX8_A603MaqCodBis ;
   private String[] P0ACX8_A460FasDsc ;
   private String[] P0ACX8_A457FasCod ;
   private short[] P0ACX8_A194BarOrdLin ;
   private String[] P0ACX8_A758ProCod ;
   private String[] P0ACX9_A396EmprCod ;
   private boolean[] P0ACX9_n396EmprCod ;
   private int[] P0ACX9_A1199MacCod ;
   private String[] P0ACX9_A1205MacBarPar ;
   private byte[] P0ACX9_A1204MacBarReo ;
   private int[] P0ACX9_A1203MacBarCod ;
   private short[] P0ACX9_A1201MacLin ;
   private String[] P0ACX10_A602MaqCod ;
   private String[] P0ACX10_A396EmprCod ;
   private boolean[] P0ACX10_n396EmprCod ;
   private String[] P0ACX10_A606MaqDsc ;
   private boolean[] P0ACX10_n606MaqDsc ;
   private short[] P0ACX11_A970ProceCod ;
   private boolean[] P0ACX11_n970ProceCod ;
   private String[] P0ACX11_A396EmprCod ;
   private boolean[] P0ACX11_n396EmprCod ;
   private int[] P0ACX11_A361DisCod ;
   private String[] P0ACX11_A46AlbREnt ;
   private java.util.Date[] P0ACX11_A49AlbRFen ;
   private String[] P0ACX11_A50AlbRLoc ;
   private String[] P0ACX11_A971ProceNom ;
   private boolean[] P0ACX11_n971ProceNom ;
   private int[] P0ACX11_A44AlbRecCod ;
   private short[] P0ACX12_A829TipArtCod ;
   private String[] P0ACX12_A396EmprCod ;
   private boolean[] P0ACX12_n396EmprCod ;
   private String[] P0ACX12_A830TipArtDsc ;
   private boolean[] P0ACX12_n830TipArtDsc ;
   private long[] P0ACX13_A30AlbProCod ;
   private String[] P0ACX13_A396EmprCod ;
   private boolean[] P0ACX13_n396EmprCod ;
   private String[] P0ACX13_A130BarCodPar ;
   private byte[] P0ACX13_A132BarCodReo ;
   private int[] P0ACX13_A129BarCod ;
   private java.math.BigDecimal[] P0ACX13_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0ACX13_A1263BarAlbMtrE ;
   private int[] P0ACX13_A1265BarAlbPie ;
   private short[] P0ACX13_A3271AlbHdrAnc ;
   private short[] P0ACX13_A5019AlbHdrgm2 ;
   private java.util.Date[] P0ACX13_A34AlbProfch ;
   private String[] P0ACX14_A396EmprCod ;
   private boolean[] P0ACX14_n396EmprCod ;
   private short[] P0ACX14_A8391PMDCod ;
   private int[] P0ACX14_A252CliCod ;
   private boolean[] P0ACX14_n252CliCod ;
   private String[] P0ACX14_A8392PMDDsc ;
   private boolean[] P0ACX14_n8392PMDDsc ;
   private String[] P0ACX15_A396EmprCod ;
   private boolean[] P0ACX15_n396EmprCod ;
   private String[] P0ACX15_A10887Cod_Idtx ;
   private String[] P0ACX15_A10888Dsc_Idtx ;
   private boolean[] P0ACX15_n10888Dsc_Idtx ;
   private String[] P0ACX16_A396EmprCod ;
   private boolean[] P0ACX16_n396EmprCod ;
   private String[] P0ACX16_A10887Cod_Idtx ;
   private String[] P0ACX16_A10888Dsc_Idtx ;
   private boolean[] P0ACX16_n10888Dsc_Idtx ;
}

final  class rhdrmod_group__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACX2", "SELECT EmprCod, TermCod, TermUsu FROM TXPTERMIN WHERE (TermCod = ?) AND (EmprCod = ?) ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACX4", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarProPer, T1.BarIdtx2, T1.BarItem1, T1.barItem2, T1.BarTra1, T1.BarTraP1, T1.BarTra2, T1.BarTraP2, T1.BarTra3, T1.BarTraP3, T1.BarUrd1, T1.BarUrdP1, T1.BarUrd2, T1.BarUrdP2, T1.BarTipDis, T1.BarMaqPro, T1.BarEstReo, T2.TipDefDsc, T1.BarPart, T1.BarFecGen, T1.BarTipCol, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarSit, T1.BarLocDis, T3.CliNom1, T3.CliNom, T1.BarFecCli, T1.BarNumCli, T1.BarNomCli, T1.BarDisNum, T1.BarTipArt, T1.BarMaqCod, T1.BarGraAca, T1.BarGraAca2, T1.BarAncAca1, T1.BarAncAca2, T1.BarEncAnh, T1.BarEncCom, T1.BarGirar, T1.BarManCod1, T1.BarOrdComp, T1.BarPle, T1.BarSerDsc, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACX5", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieKil, T2.AlbRLoc, T2.AlbRFen, T1.BarPiePie, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACX6", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbNumB, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRFen, T2.AlbRLoc, T1.BarPiePie, T1.BarPieKil, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACX7", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACX8", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACX9", "SELECT EmprCod, MacCod, MacBarPar, MacBarReo, MacBarCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACX10", "SELECT MaqCod, EmprCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACX11", "SELECT T2.ProceCod, T1.EmprCod, T1.DisCod, T2.AlbREnt, T2.AlbRFen, T2.AlbRLoc, T3.ProceNom, T1.AlbRecCod FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACX12", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACX13", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.AlbHdrAnc, T1.AlbHdrgm2, T2.AlbProfch FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACX14", "SELECT EmprCod, PMDCod, CliCod, PMDDsc FROM TXPProMD WHERE EmprCod = ? and CliCod = ? and PMDCod = ? ORDER BY EmprCod, CliCod, PMDCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACX15", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACX16", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getString(11, 4);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 4);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 4);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 4);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 4);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((String[]) buf[23])[0] = rslt.getString(22, 6);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((String[]) buf[25])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(26);
               ((byte[]) buf[29])[0] = rslt.getByte(27);
               ((int[]) buf[30])[0] = rslt.getInt(28);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(29, 16);
               ((String[]) buf[33])[0] = rslt.getString(30, 13);
               ((int[]) buf[34])[0] = rslt.getInt(31);
               ((byte[]) buf[35])[0] = rslt.getByte(32);
               ((String[]) buf[36])[0] = rslt.getString(33, 10);
               ((String[]) buf[37])[0] = rslt.getString(34, 30);
               ((String[]) buf[38])[0] = rslt.getString(35, 30);
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(36);
               ((int[]) buf[40])[0] = rslt.getInt(37);
               ((String[]) buf[41])[0] = rslt.getString(38, 13);
               ((String[]) buf[42])[0] = rslt.getString(39, 8);
               ((short[]) buf[43])[0] = rslt.getShort(40);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(41, 6);
               ((short[]) buf[46])[0] = rslt.getShort(42);
               ((short[]) buf[47])[0] = rslt.getShort(43);
               ((short[]) buf[48])[0] = rslt.getShort(44);
               ((short[]) buf[49])[0] = rslt.getShort(45);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[52])[0] = rslt.getString(48, 20);
               ((short[]) buf[53])[0] = rslt.getShort(49);
               ((String[]) buf[54])[0] = rslt.getVarchar(50);
               ((String[]) buf[55])[0] = rslt.getString(51, 10);
               ((String[]) buf[56])[0] = rslt.getString(52, 26);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(53,2);
               ((short[]) buf[58])[0] = rslt.getShort(54);
               ((String[]) buf[59])[0] = rslt.getString(55, 1);
               ((int[]) buf[60])[0] = rslt.getInt(56);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 10);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 9);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
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
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
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
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 4);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 4);
               return;
      }
   }

}

