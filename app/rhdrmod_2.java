package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrmod_2 extends GXReport
{
   public rhdrmod_2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrmod_2.class ), "" );
   }

   public rhdrmod_2( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 )
   {
      rhdrmod_2.this.AV110ReportInPut = aP0;
      rhdrmod_2.this.A396EmprCod = aP1;
      rhdrmod_2.this.A129BarCod = aP2;
      rhdrmod_2.this.A132BarCodReo = aP3;
      rhdrmod_2.this.A130BarCodPar = aP4;
      rhdrmod_2.this.AV63ImpCod = aP5;
      rhdrmod_2.this.Gx_out = aP6;
      initialize();
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
      getPrinter().GxSetDocName(AV110ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 12326, 0, 1, 1, 0, 1, 1) )
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
         GXv_char1[0] = AV47ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HDRMOD", ""), GXv_char1) ;
         rhdrmod_2.this.AV47ContDsc = GXv_char1[0] ;
         GXt_char2 = AV99Termin ;
         GXv_char1[0] = GXt_char2 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
         rhdrmod_2.this.GXt_char2 = GXv_char1[0] ;
         AV99Termin = GXt_char2 ;
         /* Using cursor P0AJ82 */
         pr_default.execute(0, new Object[] {AV99Termin, Boolean.valueOf(n396EmprCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A942TermCod = P0AJ82_A942TermCod[0] ;
            A1189TermUsu = P0AJ82_A1189TermUsu[0] ;
            n1189TermUsu = P0AJ82_n1189TermUsu[0] ;
            AV100TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P0AJ84 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P0AJ84_A833TipDefCod[0] ;
            n833TipDefCod = P0AJ84_n833TipDefCod[0] ;
            A361DisCod = P0AJ84_A361DisCod[0] ;
            A2829BarProPer = P0AJ84_A2829BarProPer[0] ;
            A13908BarIdtx2 = P0AJ84_A13908BarIdtx2[0] ;
            n13908BarIdtx2 = P0AJ84_n13908BarIdtx2[0] ;
            A9775BarItem1 = P0AJ84_A9775BarItem1[0] ;
            A9776barItem2 = P0AJ84_A9776barItem2[0] ;
            A221BarTra1 = P0AJ84_A221BarTra1[0] ;
            A224BarTraP1 = P0AJ84_A224BarTraP1[0] ;
            A222BarTra2 = P0AJ84_A222BarTra2[0] ;
            A225BarTraP2 = P0AJ84_A225BarTraP2[0] ;
            A223BarTra3 = P0AJ84_A223BarTra3[0] ;
            A226BarTraP3 = P0AJ84_A226BarTraP3[0] ;
            A229BarUrd1 = P0AJ84_A229BarUrd1[0] ;
            A232BarUrdP1 = P0AJ84_A232BarUrdP1[0] ;
            A230BarUrd2 = P0AJ84_A230BarUrd2[0] ;
            A233BarUrdP2 = P0AJ84_A233BarUrdP2[0] ;
            A2010BarTipDis = P0AJ84_A2010BarTipDis[0] ;
            A181BarMaqPro = P0AJ84_A181BarMaqPro[0] ;
            A148BarEstReo = P0AJ84_A148BarEstReo[0] ;
            A834TipDefDsc = P0AJ84_A834TipDefDsc[0] ;
            n834TipDefDsc = P0AJ84_n834TipDefDsc[0] ;
            A218BarTipCol = P0AJ84_A218BarTipCol[0] ;
            A252CliCod = P0AJ84_A252CliCod[0] ;
            n252CliCod = P0AJ84_n252CliCod[0] ;
            A212BarSer = P0AJ84_A212BarSer[0] ;
            A135BarColNom = P0AJ84_A135BarColNom[0] ;
            A136BarColNum = P0AJ84_A136BarColNum[0] ;
            A213BarSit = P0AJ84_A213BarSit[0] ;
            A1431BarLocDis = P0AJ84_A1431BarLocDis[0] ;
            A3644CliNom1 = P0AJ84_A3644CliNom1[0] ;
            A279CliNom = P0AJ84_A279CliNom[0] ;
            A155BarFecCli = P0AJ84_A155BarFecCli[0] ;
            A1235BarNumCli = P0AJ84_A1235BarNumCli[0] ;
            A1234BarNomCli = P0AJ84_A1234BarNomCli[0] ;
            A143BarDisNum = P0AJ84_A143BarDisNum[0] ;
            A217BarTipArt = P0AJ84_A217BarTipArt[0] ;
            n217BarTipArt = P0AJ84_n217BarTipArt[0] ;
            A180BarMaqCod = P0AJ84_A180BarMaqCod[0] ;
            A1909BarGraAca = P0AJ84_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P0AJ84_A3137BarGraAca2[0] ;
            A125BarAncAca1 = P0AJ84_A125BarAncAca1[0] ;
            A126BarAncAca2 = P0AJ84_A126BarAncAca2[0] ;
            A1224BarEncAnh = P0AJ84_A1224BarEncAnh[0] ;
            A1223BarEncCom = P0AJ84_A1223BarEncCom[0] ;
            A2454BarGirar = P0AJ84_A2454BarGirar[0] ;
            A3311BarManCod1 = P0AJ84_A3311BarManCod1[0] ;
            A11662BarOrdComp = P0AJ84_A11662BarOrdComp[0] ;
            A206BarPle = P0AJ84_A206BarPle[0] ;
            A1652BarSerDsc = P0AJ84_A1652BarSerDsc[0] ;
            A1503BarPart = P0AJ84_A1503BarPart[0] ;
            A159BarFecGen = P0AJ84_A159BarFecGen[0] ;
            A166BarKgm = P0AJ84_A166BarKgm[0] ;
            A199BarPie1 = P0AJ84_A199BarPie1[0] ;
            A365DisDes = P0AJ84_A365DisDes[0] ;
            A898BarPieNDes = P0AJ84_A898BarPieNDes[0] ;
            A834TipDefDsc = P0AJ84_A834TipDefDsc[0] ;
            n834TipDefDsc = P0AJ84_n834TipDefDsc[0] ;
            A3644CliNom1 = P0AJ84_A3644CliNom1[0] ;
            A279CliNom = P0AJ84_A279CliNom[0] ;
            A166BarKgm = P0AJ84_A166BarKgm[0] ;
            A199BarPie1 = P0AJ84_A199BarPie1[0] ;
            A898BarPieNDes = P0AJ84_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV44Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S171 ();
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
            AV35BarIdtx2 = A13908BarIdtx2 ;
            /* Execute user subroutine: 'INDITEX2' */
            S181 ();
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
            AV90procesoidtx = ((GXutil.strcmp("", AV35BarIdtx2)==0) ? " " : httpContext.getMessage( "PROCESSO", "")) ;
            AV26barCod = A129BarCod ;
            AV28BarCodreo = A132BarCodReo ;
            AV27BarCodPar = A130BarCodPar ;
            AV37Baritem1 = GXutil.substring( A9775BarItem1, 1, 10) ;
            AV38BarItem2 = GXutil.substring( A9776barItem2, 1, 10) ;
            AV45Comp = " " ;
            if ( GXutil.strcmp(A221BarTra1, "") != 0 )
            {
               AV45Comp = GXutil.trim( A221BarTra1) + " " + GXutil.str( A224BarTraP1, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A222BarTra2, "") != 0 )
            {
               AV45Comp += " " + GXutil.trim( A222BarTra2) + " " + GXutil.str( A225BarTraP2, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A223BarTra3, "") != 0 )
            {
               AV45Comp += " " + GXutil.trim( A223BarTra3) + " " + GXutil.str( A226BarTraP3, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A229BarUrd1, "") != 0 )
            {
               AV45Comp += " " + GXutil.trim( A229BarUrd1) + " " + GXutil.str( A232BarUrdP1, 3, 0) + "%" ;
            }
            if ( GXutil.strcmp(A230BarUrd2, "") != 0 )
            {
               AV45Comp += " " + GXutil.trim( A230BarUrd2) + " " + GXutil.str( A233BarUrdP2, 3, 0) + "%" ;
            }
            GXv_char1[0] = AV105tipdisdsc ;
            GXv_int3[0] = (byte)(0) ;
            new app.pbustdi(remoteHandle, context).execute( A396EmprCod, A2010BarTipDis, GXv_char1, GXv_int3) ;
            rhdrmod_2.this.AV105tipdisdsc = GXv_char1[0] ;
            /* Execute user subroutine: 'ALBBAR' */
            S151 ();
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
            AV72MacCod = 0 ;
            GXv_int4[0] = AV72MacCod ;
            new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int4) ;
            rhdrmod_2.this.AV72MacCod = GXv_int4[0] ;
            GXv_char1[0] = AV76Marcadsc ;
            new app.pmarcacliente(remoteHandle, context).execute( A396EmprCod, A181BarMaqPro, GXv_char1) ;
            rhdrmod_2.this.AV76Marcadsc = GXv_char1[0] ;
            AV76Marcadsc = GXutil.substring( AV76Marcadsc, 1, 30) ;
            AV106TotKgs = A166BarKgm ;
            AV54EmprCod = A396EmprCod ;
            AV51DetPzas = (short)(A898BarPieNDes) ;
            AV42Ceros8 = "00000000" ;
            AV60HdrAlfa = GXutil.str( A129BarCod, 8, 0) ;
            AV60HdrAlfa = GXutil.ltrim( GXutil.rtrim( AV60HdrAlfa)) ;
            AV70LenVar = (byte)(GXutil.len( AV60HdrAlfa)) ;
            AV70LenVar = (byte)(8-AV70LenVar) ;
            AV60HdrAlfa = GXutil.substring( AV42Ceros8, 1, AV70LenVar) + AV60HdrAlfa ;
            if ( GXutil.strcmp(A130BarCodPar, " ") == 0 )
            {
               AV61HojRut = "*" + AV60HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + "*" ;
            }
            else
            {
               AV61HojRut = "*" + AV60HdrAlfa + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            }
            AV61HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            AV93Remonta = "" ;
            AV101Texto = GXutil.space( (short)(20)) ;
            if ( A148BarEstReo == 2 )
            {
               AV93Remonta = httpContext.getMessage( "Dev. ", "") + GXutil.substring( A834TipDefDsc, 1, 15) ;
               AV101Texto = httpContext.getMessage( "REM. EXT.", "") ;
            }
            if ( A148BarEstReo == 1 )
            {
               AV93Remonta = GXutil.substring( A834TipDefDsc, 1, 15) ;
               AV101Texto = httpContext.getMessage( "REM. INT.", "") ;
            }
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV97Tab_loc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV96Tab_kgs[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV95Tab_fe[1-1] = GXutil.nullDate() ;
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV98Tab_pz[GX_I-1] = 0 ;
               GX_I = (int)(GX_I+1) ;
            }
            AV62i = (byte)(1) ;
            /* Using cursor P0AJ85 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P0AJ85_A44AlbRecCod[0] ;
               A203BarPieKil = P0AJ85_A203BarPieKil[0] ;
               A50AlbRLoc = P0AJ85_A50AlbRLoc[0] ;
               A49AlbRFen = P0AJ85_A49AlbRFen[0] ;
               A1501BarPiePie = P0AJ85_A1501BarPiePie[0] ;
               A200BarPieCod = P0AJ85_A200BarPieCod[0] ;
               A50AlbRLoc = P0AJ85_A50AlbRLoc[0] ;
               A49AlbRFen = P0AJ85_A49AlbRFen[0] ;
               if ( AV62i > 5 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV96Tab_kgs[AV62i-1] = A203BarPieKil ;
               AV97Tab_loc[AV62i-1] = A50AlbRLoc ;
               AV95Tab_fe[AV62i-1] = A49AlbRFen ;
               AV98Tab_pz[AV62i-1] = A1501BarPiePie ;
               AV62i = (byte)(AV62i+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GXt_char2 = AV104TipColDsc ;
            GXv_char1[0] = GXt_char2 ;
            new app.ptipcoldsc(remoteHandle, context).execute( A396EmprCod, A218BarTipCol, GXv_char1) ;
            rhdrmod_2.this.GXt_char2 = GXv_char1[0] ;
            AV104TipColDsc = GXt_char2 ;
            AV43CliCod = A252CliCod ;
            AV19ArtCod = A212BarSer ;
            AV29BarColNom = A135BarColNom ;
            AV30BarColNum = A136BarColNum ;
            AV40BarTipCol = A218BarTipCol ;
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
            AV94Sit = " " ;
            if ( A213BarSit == 2 )
            {
               AV94Sit = httpContext.getMessage( "(LAB)", "") ;
            }
            AV52DisCod = A361DisCod ;
            AV14ALbRLoc = A1431BarLocDis ;
            if ( (GXutil.strcmp("", AV14ALbRLoc)==0) )
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
            AV109vCliNom = A279CliNom + GXutil.substring( A3644CliNom1, 1, 10) ;
            hAJ80( false, 58) ;
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
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 589, Gx_line+33, 698, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), 704, Gx_line+33, 755, Gx_line+51, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(49, Gx_line+4, 764, Gx_line+55, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109vCliNom, "")), 191, Gx_line+10, 609, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data Enc.:", ""), 257, Gx_line+33, 341, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 344, Gx_line+33, 412, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105tipdisdsc, "")), 544, Gx_line+11, 753, Gx_line+31, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+58) ;
            AV102TipArtCod = A217BarTipArt ;
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
            AV74MaqCod = A180BarMaqCod ;
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
            AV33BarGraAca = "" ;
            AV34BarGraAca2 = "" ;
            if ( (0==A1909BarGraAca) )
            {
               AV33BarGraAca = "??" ;
            }
            else
            {
               AV33BarGraAca = GXutil.str( A1909BarGraAca, 4, 0) ;
            }
            if ( (0==A3137BarGraAca2) )
            {
               AV34BarGraAca2 = "??" ;
            }
            else
            {
               AV34BarGraAca2 = GXutil.str( A3137BarGraAca2, 4, 0) ;
            }
            if ( ! (0==A1909BarGraAca) && (0==A3137BarGraAca2) )
            {
               AV34BarGraAca2 = " " ;
            }
            AV23BarAncAca1 = "" ;
            AV24BarAncAca2 = "" ;
            if ( (0==A125BarAncAca1) )
            {
               AV23BarAncAca1 = "??" ;
            }
            else
            {
               AV23BarAncAca1 = GXutil.str( A125BarAncAca1, 4, 0) ;
            }
            if ( (0==A126BarAncAca2) )
            {
               AV24BarAncAca2 = "??" ;
            }
            else
            {
               AV24BarAncAca2 = GXutil.str( A126BarAncAca2, 4, 0) ;
            }
            if ( ! (0==A125BarAncAca1) && (0==A126BarAncAca2) )
            {
               AV24BarAncAca2 = " " ;
            }
            AV31BarEncAnh = "" ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1224BarEncAnh)==0) )
            {
               AV31BarEncAnh = "??" ;
            }
            else
            {
               AV31BarEncAnh = GXutil.str( A1224BarEncAnh, 6, 2) ;
            }
            AV32BarEncCom = "" ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1223BarEncCom)==0) )
            {
               AV32BarEncCom = "??" ;
            }
            else
            {
               AV32BarEncCom = GXutil.str( A1223BarEncCom, 6, 2) ;
            }
            AV41Cartaz = GXutil.substring( A2454BarGirar, 1, 10) ;
            AV79NPrgTing = A3311BarManCod1 ;
            /* Execute user subroutine: 'PRG_TING' */
            S161 ();
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
            hAJ80( false, 156) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composição:", ""), 411, Gx_line+94, 504, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gram.", ""), 521, Gx_line+29, 564, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Medida", ""), 427, Gx_line+29, 478, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31BarEncAnh, "")), 619, Gx_line+54, 670, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32BarEncCom, "")), 694, Gx_line+54, 745, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23BarAncAca1, "")), 427, Gx_line+54, 453, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33BarGraAca, "")), 522, Gx_line+54, 556, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor/Serviço:", ""), 56, Gx_line+10, 157, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 163, Gx_line+10, 299, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 122, Gx_line+33, 186, Gx_line+53, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 84, Gx_line+55, 106, Gx_line+75, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 58, Gx_line+118, 117, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 125, Gx_line+118, 259, Gx_line+136, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 265, Gx_line+118, 537, Gx_line+138, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(52, Gx_line+0, 766, Gx_line+156, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(315, Gx_line+6, 761, Gx_line+74, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Parametros de Acabamento", ""), 438, Gx_line+8, 639, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(g/m2)", ""), 558, Gx_line+29, 603, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Enc.", ""), 609, Gx_line+29, 643, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(%)", 646, Gx_line+29, 669, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(315, Gx_line+25, 760, Gx_line+25, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Torção", ""), 679, Gx_line+28, 730, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(%)", 734, Gx_line+28, 757, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(315, Gx_line+48, 761, Gx_line+48, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "(cm)", ""), 480, Gx_line+29, 510, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(511, Gx_line+25, 511, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(605, Gx_line+25, 605, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(673, Gx_line+25, 673, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A206BarPle, "")), 330, Gx_line+54, 414, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Apresentação", ""), 317, Gx_line+29, 418, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(419, Gx_line+25, 419, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Numero:", ""), 56, Gx_line+33, 115, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tc:", ""), 56, Gx_line+56, 82, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24BarAncAca2, "")), 469, Gx_line+54, 495, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34BarGraAca2, "")), 567, Gx_line+54, 601, Gx_line+72, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cartaz Nº:", ""), 150, Gx_line+56, 234, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Cartaz, "")), 238, Gx_line+56, 312, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Programa:", ""), 58, Gx_line+94, 134, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87PrgTing, "")), 140, Gx_line+94, 391, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Intensid:", ""), 58, Gx_line+75, 134, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65IntDsc, "")), 140, Gx_line+75, 360, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Marca Cliente:", ""), 386, Gx_line+75, 504, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Marcadsc, "")), 507, Gx_line+75, 727, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11662BarOrdComp, "")), 90, Gx_line+135, 762, Gx_line+152, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PO:", ""), 59, Gx_line+135, 85, Gx_line+153, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Comp, "")), 507, Gx_line+94, 716, Gx_line+112, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+156) ;
            AV88Primeravez = (byte)(0) ;
            /* Using cursor P0AJ86 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A44AlbRecCod = P0AJ86_A44AlbRecCod[0] ;
               A8028AlbNumB = P0AJ86_A8028AlbNumB[0] ;
               A6463AlbRLote = P0AJ86_A6463AlbRLote[0] ;
               A6465AlbRLu = P0AJ86_A6465AlbRLu[0] ;
               A4602AlbRMdlCod = P0AJ86_A4602AlbRMdlCod[0] ;
               A6464AlbRTelar = P0AJ86_A6464AlbRTelar[0] ;
               A8035AlbMaqTej = P0AJ86_A8035AlbMaqTej[0] ;
               A6470AlbRTara = P0AJ86_A6470AlbRTara[0] ;
               A49AlbRFen = P0AJ86_A49AlbRFen[0] ;
               A50AlbRLoc = P0AJ86_A50AlbRLoc[0] ;
               A1501BarPiePie = P0AJ86_A1501BarPiePie[0] ;
               A203BarPieKil = P0AJ86_A203BarPieKil[0] ;
               A200BarPieCod = P0AJ86_A200BarPieCod[0] ;
               A8028AlbNumB = P0AJ86_A8028AlbNumB[0] ;
               A6463AlbRLote = P0AJ86_A6463AlbRLote[0] ;
               A6465AlbRLu = P0AJ86_A6465AlbRLu[0] ;
               A4602AlbRMdlCod = P0AJ86_A4602AlbRMdlCod[0] ;
               A6464AlbRTelar = P0AJ86_A6464AlbRTelar[0] ;
               A8035AlbMaqTej = P0AJ86_A8035AlbMaqTej[0] ;
               A6470AlbRTara = P0AJ86_A6470AlbRTara[0] ;
               A49AlbRFen = P0AJ86_A49AlbRFen[0] ;
               A50AlbRLoc = P0AJ86_A50AlbRLoc[0] ;
               AV10AlbNumb = A8028AlbNumB ;
               if ( AV88Primeravez == 0 )
               {
                  AV88Primeravez = (byte)(1) ;
                  hAJ80( false, 49) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 59, Gx_line+5, 118, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(51, Gx_line+0, 474, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "(Kg)", ""), 73, Gx_line+31, 103, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 143, Gx_line+31, 180, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(131, Gx_line+26, 131, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(51, Gx_line+26, 759, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(51, Gx_line+47, 759, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(190, Gx_line+26, 190, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Localização", ""), 197, Gx_line+31, 278, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 303, Gx_line+31, 333, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(284, Gx_line+26, 284, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(134, Gx_line+0, 134, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 185, Gx_line+4, 280, Gx_line+24, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 283, Gx_line+4, 347, Gx_line+24, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 141, Gx_line+5, 184, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(351, Gx_line+0, 351, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 418, Gx_line+31, 448, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Jogo", ""), 573, Gx_line+31, 603, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fio", ""), 526, Gx_line+31, 549, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("\"", 620, Gx_line+31, 628, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 700, Gx_line+31, 752, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LFA", ""), 652, Gx_line+31, 675, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(350, Gx_line+26, 350, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(510, Gx_line+26, 510, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(563, Gx_line+26, 563, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(609, Gx_line+26, 609, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(634, Gx_line+26, 634, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(693, Gx_line+26, 693, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(758, Gx_line+26, 758, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Dsc_Idtx, "")), 356, Gx_line+4, 461, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(51, Gx_line+26, 51, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10AlbNumb, "")), 580, Gx_line+5, 748, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "R. Composiçao:", ""), 478, Gx_line+6, 581, Gx_line+21, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+49) ;
               }
               AV15AlbrLote = A6463AlbRLote ;
               AV17AlbRLu_trunc = (int)(DecimalUtil.decToDouble(GXutil.truncDecimal( A6465AlbRLu, 0))) ;
               AV82Pgadas = ((AV17AlbRLu_trunc>99) ? "**" : GXutil.trim( GXutil.str( AV17AlbRLu_trunc, 6, 0))) ;
               AV66Jogo3 = GXutil.substring( A4602AlbRMdlCod, 1, 3) ;
               AV55Fio5 = GXutil.substring( A6464AlbRTelar, 1, 5) ;
               AV73Maq6 = GXutil.substring( A8035AlbMaqTej, 1, 6) ;
               hAJ80( false, 18) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")), 54, Gx_line+0, 121, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")), 140, Gx_line+0, 185, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 201, Gx_line+0, 275, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 289, Gx_line+0, 348, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15AlbrLote, "")), 359, Gx_line+0, 506, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Jogo3, "")), 576, Gx_line+0, 599, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Pgadas, "")), 617, Gx_line+0, 633, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Maq6, "")), 700, Gx_line+0, 745, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6470AlbRTara, "ZZ9.99")), 642, Gx_line+0, 687, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Fio5, "")), 519, Gx_line+0, 556, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            hAJ80( false, 35) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 63, Gx_line+17, 156, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+11, 764, Gx_line+11, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+13, 49, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+11, 763, Gx_line+33, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+35) ;
            /* Using cursor P0AJ87 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A377DisObsTxt = P0AJ87_A377DisObsTxt[0] ;
               A376DisObsLin = P0AJ87_A376DisObsLin[0] ;
               hAJ80( false, 18) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 170, Gx_line+0, 671, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            hAJ80( false, 17) ;
            getPrinter().GxDrawLine(49, Gx_line+6, 764, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+7, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            hAJ80( false, 44) ;
            getPrinter().GxDrawRect(49, Gx_line+1, 764, Gx_line+20, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FASES DE PRODUÇÃO", ""), 317, Gx_line+1, 495, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+19, 49, Gx_line+44, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+19, 763, Gx_line+44, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 461, Gx_line+27, 512, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 661, Gx_line+25, 690, Gx_line+39, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+44) ;
            /* Using cursor P0AJ88 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A603MaqCodBis = P0AJ88_A603MaqCodBis[0] ;
               A460FasDsc = P0AJ88_A460FasDsc[0] ;
               A457FasCod = P0AJ88_A457FasCod[0] ;
               A194BarOrdLin = P0AJ88_A194BarOrdLin[0] ;
               A758ProCod = P0AJ88_A758ProCod[0] ;
               A460FasDsc = P0AJ88_A460FasDsc[0] ;
               AV74MaqCod = A603MaqCodBis ;
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
               hAJ80( false, 19) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 69, Gx_line+0, 137, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 160, Gx_line+0, 394, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(405, Gx_line+16, 570, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(594, Gx_line+16, 759, Gx_line+16, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               AV49ContLin = (byte)(AV49ContLin+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            hAJ80( false, 17) ;
            getPrinter().GxDrawLine(49, Gx_line+9, 764, Gx_line+9, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+9, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+10, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV49ContLin = (byte)(AV49ContLin+1) ;
            AV46Contador = (byte)(1) ;
            /* Using cursor P0AJ89 */
            pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV72MacCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1199MacCod = P0AJ89_A1199MacCod[0] ;
               A1205MacBarPar = P0AJ89_A1205MacBarPar[0] ;
               A1204MacBarReo = P0AJ89_A1204MacBarReo[0] ;
               A1203MacBarCod = P0AJ89_A1203MacBarCod[0] ;
               A1201MacLin = P0AJ89_A1201MacLin[0] ;
               if ( ( A129BarCod == A1203MacBarCod ) && ( A132BarCodReo == A1204MacBarReo ) && ( GXutil.strcmp(A1205MacBarPar, A130BarCodPar) == 0 ) )
               {
               }
               else
               {
                  GXv_decimal5[0] = AV67KgmAgr ;
                  GXv_char1[0] = AV21ArtDscAGr ;
                  GXv_char6[0] = AV80ObsTxt ;
                  GXv_int4[0] = AV81Pecas ;
                  new app.pobsagr(remoteHandle, context).execute( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, GXv_decimal5, GXv_char1, GXv_char6, GXv_int4) ;
                  rhdrmod_2.this.AV67KgmAgr = GXv_decimal5[0] ;
                  rhdrmod_2.this.AV21ArtDscAGr = GXv_char1[0] ;
                  rhdrmod_2.this.AV80ObsTxt = GXv_char6[0] ;
                  rhdrmod_2.this.AV81Pecas = (short)((short)(GXv_int4[0])) ;
                  AV106TotKgs = AV106TotKgs.add(AV67KgmAgr) ;
                  if ( AV46Contador == 1 )
                  {
                     AV46Contador = (byte)(2) ;
                     hAJ80( false, 34) ;
                     getPrinter().GxDrawRect(49, Gx_line+0, 764, Gx_line+24, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ACESSÓRIOS", ""), 359, Gx_line+3, 464, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Macro =", ""), 643, Gx_line+4, 695, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72MacCod), "ZZZZZZZ9")), 696, Gx_line+4, 755, Gx_line+21, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(49, Gx_line+26, 49, Gx_line+34, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(763, Gx_line+26, 763, Gx_line+34, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+34) ;
                     AV49ContLin = (byte)(AV49ContLin+3) ;
                  }
                  hAJ80( false, 20) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80ObsTxt, "")), 539, Gx_line+2, 759, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21ArtDscAGr, "")), 168, Gx_line+2, 336, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1203MacBarCod), "ZZZZZZZ9")), 53, Gx_line+2, 121, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1205MacBarPar, "")), 154, Gx_line+2, 163, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1204MacBarReo), "9")), 140, Gx_line+2, 149, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("-", 125, Gx_line+2, 134, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67KgmAgr, "ZZZZZ9.99")), 414, Gx_line+2, 481, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81Pecas), "ZZZ9")), 341, Gx_line+2, 371, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "peça c/", ""), 376, Gx_line+4, 413, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 485, Gx_line+4, 502, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Obs.", ""), 515, Gx_line+4, 537, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+20, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+20, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
                  AV49ContLin = (byte)(AV49ContLin+1) ;
               }
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( AV46Contador == 2 )
            {
               hAJ80( false, 13) ;
               getPrinter().GxDrawLine(49, Gx_line+7, 764, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+8, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+8, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+13) ;
               AV49ContLin = (byte)(AV49ContLin+1) ;
            }
            if ( AV46Contador == 2 )
            {
               hAJ80( false, 22) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106TotKgs, "ZZZZZ9.99")), 351, Gx_line+2, 446, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Partida", ""), 264, Gx_line+4, 341, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAJ80( true, 0) ;
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
      AV75MaqDsc = "" ;
      /* Using cursor P0AJ810 */
      pr_default.execute(7, new Object[] {AV54EmprCod, AV74MaqCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A602MaqCod = P0AJ810_A602MaqCod[0] ;
         A606MaqDsc = P0AJ810_A606MaqDsc[0] ;
         n606MaqDsc = P0AJ810_n606MaqDsc[0] ;
         AV75MaqDsc = A606MaqDsc ;
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
      GXv_int4[0] = AV43CliCod ;
      GXv_char1[0] = AV19ArtCod ;
      GXv_char7[0] = AV29BarColNom ;
      GXv_int8[0] = AV30BarColNum ;
      GXv_int3[0] = A218BarTipCol ;
      GXv_int9[0] = AV64IntCod ;
      GXv_char10[0] = AV65IntDsc ;
      GXv_char11[0] = AV57ForColNom ;
      GXv_int12[0] = AV58ForColNum ;
      new app.pbusint(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char1, GXv_char7, GXv_int8, GXv_int3, GXv_int9, GXv_char10, GXv_char11, GXv_int12) ;
      rhdrmod_2.this.A396EmprCod = GXv_char6[0] ;
      rhdrmod_2.this.AV43CliCod = GXv_int4[0] ;
      rhdrmod_2.this.AV19ArtCod = GXv_char1[0] ;
      rhdrmod_2.this.AV29BarColNom = GXv_char7[0] ;
      rhdrmod_2.this.AV30BarColNum = GXv_int8[0] ;
      rhdrmod_2.this.A218BarTipCol = GXv_int3[0] ;
      rhdrmod_2.this.AV64IntCod = GXv_int9[0] ;
      rhdrmod_2.this.AV65IntDsc = GXv_char10[0] ;
      rhdrmod_2.this.AV57ForColNom = GXv_char11[0] ;
      rhdrmod_2.this.AV58ForColNum = GXv_int12[0] ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'EMPESA' Routine */
      returnInSub = false ;
      AV12AlbREnt = "" ;
      AV13ALbRfen = GXutil.nullDate() ;
      AV14ALbRLoc = "" ;
      AV89ProceNom = "" ;
      /* Using cursor P0AJ811 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV52DisCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A970ProceCod = P0AJ811_A970ProceCod[0] ;
         n970ProceCod = P0AJ811_n970ProceCod[0] ;
         A361DisCod = P0AJ811_A361DisCod[0] ;
         A46AlbREnt = P0AJ811_A46AlbREnt[0] ;
         A49AlbRFen = P0AJ811_A49AlbRFen[0] ;
         A50AlbRLoc = P0AJ811_A50AlbRLoc[0] ;
         A971ProceNom = P0AJ811_A971ProceNom[0] ;
         n971ProceNom = P0AJ811_n971ProceNom[0] ;
         A44AlbRecCod = P0AJ811_A44AlbRecCod[0] ;
         A970ProceCod = P0AJ811_A970ProceCod[0] ;
         n970ProceCod = P0AJ811_n970ProceCod[0] ;
         A46AlbREnt = P0AJ811_A46AlbREnt[0] ;
         A49AlbRFen = P0AJ811_A49AlbRFen[0] ;
         A50AlbRLoc = P0AJ811_A50AlbRLoc[0] ;
         A971ProceNom = P0AJ811_A971ProceNom[0] ;
         n971ProceNom = P0AJ811_n971ProceNom[0] ;
         AV12AlbREnt = A46AlbREnt ;
         AV13ALbRfen = A49AlbRFen ;
         AV14ALbRLoc = A50AlbRLoc ;
         AV89ProceNom = A971ProceNom ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV103TipARtDsc = "" ;
      /* Using cursor P0AJ812 */
      pr_default.execute(9, new Object[] {AV54EmprCod, Short.valueOf(AV102TipArtCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A829TipArtCod = P0AJ812_A829TipArtCod[0] ;
         A830TipArtDsc = P0AJ812_A830TipArtDsc[0] ;
         n830TipArtDsc = P0AJ812_n830TipArtDsc[0] ;
         AV103TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV68Kgs_s = DecimalUtil.doubleToDec(0) ;
      AV77Mts_s = DecimalUtil.doubleToDec(0) ;
      AV91Pzs_s = (short)(0) ;
      AV11Albprofch = GXutil.nullDate() ;
      /* Using cursor P0AJ813 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV26barCod), Byte.valueOf(AV28BarCodreo), AV27BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A30AlbProCod = P0AJ813_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P0AJ813_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P0AJ813_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P0AJ813_A1265BarAlbPie[0] ;
         A3271AlbHdrAnc = P0AJ813_A3271AlbHdrAnc[0] ;
         A5019AlbHdrgm2 = P0AJ813_A5019AlbHdrgm2[0] ;
         A34AlbProfch = P0AJ813_A34AlbProfch[0] ;
         A34AlbProfch = P0AJ813_A34AlbProfch[0] ;
         AV68Kgs_s = AV68Kgs_s.add(A1261BarAlbKgmE) ;
         AV77Mts_s = AV77Mts_s.add(A1263BarAlbMtrE) ;
         AV91Pzs_s = (short)(AV91Pzs_s+A1265BarAlbPie) ;
         AV8AlbHdrAnc = A3271AlbHdrAnc ;
         AV9AlbHdrGm2 = A5019AlbHdrgm2 ;
         AV11Albprofch = A34AlbProfch ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'PRG_TING' Routine */
      returnInSub = false ;
      AV87PrgTing = "" ;
      /* Using cursor P0AJ814 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV43CliCod), Short.valueOf(AV79NPrgTing)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A8391PMDCod = P0AJ814_A8391PMDCod[0] ;
         A252CliCod = P0AJ814_A252CliCod[0] ;
         n252CliCod = P0AJ814_n252CliCod[0] ;
         A8392PMDDsc = P0AJ814_A8392PMDDsc[0] ;
         n8392PMDDsc = P0AJ814_n8392PMDDsc[0] ;
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
      /* Using cursor P0AJ815 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, AV44Cod_Idtx});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A10887Cod_Idtx = P0AJ815_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0AJ815_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0AJ815_n10888Dsc_Idtx[0] ;
         AV53Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'INDITEX2' Routine */
      returnInSub = false ;
      /* Using cursor P0AJ816 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, AV35BarIdtx2});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A10887Cod_Idtx = P0AJ816_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0AJ816_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0AJ816_n10888Dsc_Idtx[0] ;
         AV36baridtxdc2 = GXutil.trim( GXutil.substring( A10888Dsc_Idtx, 1, 20)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void hAJ80( boolean bFoot ,
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
               getPrinter().GxDrawText(httpContext.getMessage( "Hora /Data Emissão:", ""), 48, Gx_line+207, 188, Gx_line+222, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 194, Gx_line+207, 253, Gx_line+223, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Utilizador:", ""), 586, Gx_line+207, 667, Gx_line+222, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100TermUsu, "@!")), 688, Gx_line+207, 747, Gx_line+223, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(48, Gx_line+122, 763, Gx_line+202, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observações (Manuais)", ""), 60, Gx_line+129, 200, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SAIDA", ""), 71, Gx_line+3, 111, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(48, Gx_line+20, 764, Gx_line+114, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 55, Gx_line+40, 90, Gx_line+54, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(114, Gx_line+21, 114, Gx_line+113, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 139, Gx_line+24, 208, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(Kg)", ""), 134, Gx_line+43, 159, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "(M)", ""), 196, Gx_line+43, 216, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+64, 763, Gx_line+64, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(188, Gx_line+41, 188, Gx_line+113, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(261, Gx_line+18, 261, Gx_line+111, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rúbrica", ""), 548, Gx_line+43, 595, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(48, Gx_line+89, 763, Gx_line+89, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(340, Gx_line+20, 340, Gx_line+112, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 428, Gx_line+43, 465, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 259, Gx_line+207, 318, Gx_line+223, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(473, Gx_line+20, 473, Gx_line+112, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(423, Gx_line+20, 423, Gx_line+112, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Largura", ""), 273, Gx_line+43, 319, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gramagem", ""), 349, Gx_line+43, 411, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68Kgs_s, "ZZZZZZ.ZZ")), 116, Gx_line+70, 183, Gx_line+87, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77Mts_s, "ZZZZZZ.ZZ")), 190, Gx_line+70, 257, Gx_line+87, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV91Pzs_s), "ZZZZ")), 431, Gx_line+70, 461, Gx_line+87, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8AlbHdrAnc), "ZZZ9")), 282, Gx_line+70, 312, Gx_line+87, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9AlbHdrGm2), "ZZZ9")), 364, Gx_line+70, 394, Gx_line+87, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV11Albprofch, "99/99/99"), 51, Gx_line+70, 110, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+20, 668, Gx_line+112, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Baritem1, "")), 676, Gx_line+43, 740, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38BarItem2, "")), 676, Gx_line+70, 740, Gx_line+85, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+225) ;
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
               getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61HojRut, "")), 535, Gx_line+90, 749, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço:", ""), 222, Gx_line+90, 340, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 348, Gx_line+90, 441, Gx_line+114, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 471, Gx_line+90, 483, Gx_line+114, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 494, Gx_line+90, 506, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Emissão:", ""), 222, Gx_line+115, 339, Gx_line+132, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 356, Gx_line+115, 440, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("-", 448, Gx_line+90, 459, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(216, Gx_line+84, 764, Gx_line+138, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47ContDsc, "")), 618, Gx_line+13, 764, Gx_line+28, 2, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3c99144a-8aa9-43d5-8fce-801099ee2ac5", "", context.getHttpContext().getTheme( )), 49, Gx_line+7, 205, Gx_line+80) ;
               getPrinter().GxAttris("Courier New", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Texto, "")), 216, Gx_line+7, 470, Gx_line+31, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Remonta, "")), 216, Gx_line+59, 425, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 697, Gx_line+32, 756, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("(", 688, Gx_line+33, 693, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(")", 758, Gx_line+33, 763, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PARTIDA:", ""), 632, Gx_line+116, 700, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9")), 723, Gx_line+116, 757, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 18, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36baridtxdc2, "")), 471, Gx_line+54, 764, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90procesoidtx, "")), 471, Gx_line+25, 618, Gx_line+54, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+143) ;
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
      getPrinter().setMetrics("3 of 9 Barcode", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47ContDsc = "" ;
      AV99Termin = "" ;
      scmdbuf = "" ;
      P0AJ82_A396EmprCod = new String[] {""} ;
      P0AJ82_n396EmprCod = new boolean[] {false} ;
      P0AJ82_A942TermCod = new String[] {""} ;
      P0AJ82_A1189TermUsu = new String[] {""} ;
      P0AJ82_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV100TermUsu = "" ;
      P0AJ84_A833TipDefCod = new short[1] ;
      P0AJ84_n833TipDefCod = new boolean[] {false} ;
      P0AJ84_A396EmprCod = new String[] {""} ;
      P0AJ84_n396EmprCod = new boolean[] {false} ;
      P0AJ84_A129BarCod = new int[1] ;
      P0AJ84_A132BarCodReo = new byte[1] ;
      P0AJ84_A130BarCodPar = new String[] {""} ;
      P0AJ84_A361DisCod = new int[1] ;
      P0AJ84_A2829BarProPer = new String[] {""} ;
      P0AJ84_A13908BarIdtx2 = new String[] {""} ;
      P0AJ84_n13908BarIdtx2 = new boolean[] {false} ;
      P0AJ84_A9775BarItem1 = new String[] {""} ;
      P0AJ84_A9776barItem2 = new String[] {""} ;
      P0AJ84_A221BarTra1 = new String[] {""} ;
      P0AJ84_A224BarTraP1 = new short[1] ;
      P0AJ84_A222BarTra2 = new String[] {""} ;
      P0AJ84_A225BarTraP2 = new short[1] ;
      P0AJ84_A223BarTra3 = new String[] {""} ;
      P0AJ84_A226BarTraP3 = new short[1] ;
      P0AJ84_A229BarUrd1 = new String[] {""} ;
      P0AJ84_A232BarUrdP1 = new short[1] ;
      P0AJ84_A230BarUrd2 = new String[] {""} ;
      P0AJ84_A233BarUrdP2 = new short[1] ;
      P0AJ84_A2010BarTipDis = new String[] {""} ;
      P0AJ84_A181BarMaqPro = new String[] {""} ;
      P0AJ84_A148BarEstReo = new byte[1] ;
      P0AJ84_A834TipDefDsc = new String[] {""} ;
      P0AJ84_n834TipDefDsc = new boolean[] {false} ;
      P0AJ84_A218BarTipCol = new byte[1] ;
      P0AJ84_A252CliCod = new int[1] ;
      P0AJ84_n252CliCod = new boolean[] {false} ;
      P0AJ84_A212BarSer = new String[] {""} ;
      P0AJ84_A135BarColNom = new String[] {""} ;
      P0AJ84_A136BarColNum = new int[1] ;
      P0AJ84_A213BarSit = new byte[1] ;
      P0AJ84_A1431BarLocDis = new String[] {""} ;
      P0AJ84_A3644CliNom1 = new String[] {""} ;
      P0AJ84_A279CliNom = new String[] {""} ;
      P0AJ84_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJ84_A1235BarNumCli = new int[1] ;
      P0AJ84_A1234BarNomCli = new String[] {""} ;
      P0AJ84_A143BarDisNum = new String[] {""} ;
      P0AJ84_A217BarTipArt = new short[1] ;
      P0AJ84_n217BarTipArt = new boolean[] {false} ;
      P0AJ84_A180BarMaqCod = new String[] {""} ;
      P0AJ84_A1909BarGraAca = new short[1] ;
      P0AJ84_A3137BarGraAca2 = new short[1] ;
      P0AJ84_A125BarAncAca1 = new short[1] ;
      P0AJ84_A126BarAncAca2 = new short[1] ;
      P0AJ84_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ84_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ84_A2454BarGirar = new String[] {""} ;
      P0AJ84_A3311BarManCod1 = new short[1] ;
      P0AJ84_A11662BarOrdComp = new String[] {""} ;
      P0AJ84_A206BarPle = new String[] {""} ;
      P0AJ84_A1652BarSerDsc = new String[] {""} ;
      P0AJ84_A1503BarPart = new short[1] ;
      P0AJ84_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJ84_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ84_A199BarPie1 = new short[1] ;
      P0AJ84_A365DisDes = new String[] {""} ;
      P0AJ84_A898BarPieNDes = new int[1] ;
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
      A159BarFecGen = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV44Cod_Idtx = "" ;
      AV35BarIdtx2 = "" ;
      AV90procesoidtx = "" ;
      AV27BarCodPar = "" ;
      AV37Baritem1 = "" ;
      AV38BarItem2 = "" ;
      AV45Comp = "" ;
      AV105tipdisdsc = "" ;
      AV76Marcadsc = "" ;
      AV106TotKgs = DecimalUtil.ZERO ;
      AV54EmprCod = "" ;
      AV42Ceros8 = "" ;
      AV60HdrAlfa = "" ;
      AV61HojRut = "" ;
      AV93Remonta = "" ;
      AV101Texto = "" ;
      AV97Tab_loc = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV97Tab_loc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV96Tab_kgs = new java.math.BigDecimal[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV96Tab_kgs[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV95Tab_fe = new java.util.Date[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV95Tab_fe[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      AV98Tab_pz = new int[5] ;
      P0AJ85_A44AlbRecCod = new int[1] ;
      P0AJ85_A396EmprCod = new String[] {""} ;
      P0AJ85_n396EmprCod = new boolean[] {false} ;
      P0AJ85_A129BarCod = new int[1] ;
      P0AJ85_A132BarCodReo = new byte[1] ;
      P0AJ85_A130BarCodPar = new String[] {""} ;
      P0AJ85_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ85_A50AlbRLoc = new String[] {""} ;
      P0AJ85_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJ85_A1501BarPiePie = new int[1] ;
      P0AJ85_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      AV104TipColDsc = "" ;
      GXt_char2 = "" ;
      AV19ArtCod = "" ;
      AV29BarColNom = "" ;
      AV94Sit = "" ;
      AV14ALbRLoc = "" ;
      AV109vCliNom = "" ;
      AV74MaqCod = "" ;
      AV33BarGraAca = "" ;
      AV34BarGraAca2 = "" ;
      AV23BarAncAca1 = "" ;
      AV24BarAncAca2 = "" ;
      AV31BarEncAnh = "" ;
      AV32BarEncCom = "" ;
      AV41Cartaz = "" ;
      AV87PrgTing = "" ;
      AV65IntDsc = "" ;
      P0AJ86_A44AlbRecCod = new int[1] ;
      P0AJ86_A396EmprCod = new String[] {""} ;
      P0AJ86_n396EmprCod = new boolean[] {false} ;
      P0AJ86_A129BarCod = new int[1] ;
      P0AJ86_A132BarCodReo = new byte[1] ;
      P0AJ86_A130BarCodPar = new String[] {""} ;
      P0AJ86_A8028AlbNumB = new String[] {""} ;
      P0AJ86_A6463AlbRLote = new String[] {""} ;
      P0AJ86_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ86_A4602AlbRMdlCod = new String[] {""} ;
      P0AJ86_A6464AlbRTelar = new String[] {""} ;
      P0AJ86_A8035AlbMaqTej = new String[] {""} ;
      P0AJ86_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ86_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJ86_A50AlbRLoc = new String[] {""} ;
      P0AJ86_A1501BarPiePie = new int[1] ;
      P0AJ86_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ86_A200BarPieCod = new String[] {""} ;
      A8028AlbNumB = "" ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A8035AlbMaqTej = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      AV10AlbNumb = "" ;
      AV53Dsc_Idtx = "" ;
      AV15AlbrLote = "" ;
      AV82Pgadas = "" ;
      AV66Jogo3 = "" ;
      AV55Fio5 = "" ;
      AV73Maq6 = "" ;
      P0AJ87_A396EmprCod = new String[] {""} ;
      P0AJ87_n396EmprCod = new boolean[] {false} ;
      P0AJ87_A361DisCod = new int[1] ;
      P0AJ87_A377DisObsTxt = new String[] {""} ;
      P0AJ87_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P0AJ88_A396EmprCod = new String[] {""} ;
      P0AJ88_n396EmprCod = new boolean[] {false} ;
      P0AJ88_A129BarCod = new int[1] ;
      P0AJ88_A132BarCodReo = new byte[1] ;
      P0AJ88_A130BarCodPar = new String[] {""} ;
      P0AJ88_A603MaqCodBis = new String[] {""} ;
      P0AJ88_A460FasDsc = new String[] {""} ;
      P0AJ88_A457FasCod = new String[] {""} ;
      P0AJ88_A194BarOrdLin = new short[1] ;
      P0AJ88_A758ProCod = new String[] {""} ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P0AJ89_A396EmprCod = new String[] {""} ;
      P0AJ89_n396EmprCod = new boolean[] {false} ;
      P0AJ89_A1199MacCod = new int[1] ;
      P0AJ89_A1205MacBarPar = new String[] {""} ;
      P0AJ89_A1204MacBarReo = new byte[1] ;
      P0AJ89_A1203MacBarCod = new int[1] ;
      P0AJ89_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV67KgmAgr = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV21ArtDscAGr = "" ;
      AV80ObsTxt = "" ;
      AV75MaqDsc = "" ;
      P0AJ810_A602MaqCod = new String[] {""} ;
      P0AJ810_A396EmprCod = new String[] {""} ;
      P0AJ810_n396EmprCod = new boolean[] {false} ;
      P0AJ810_A606MaqDsc = new String[] {""} ;
      P0AJ810_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      GXv_char6 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char10 = new String[1] ;
      AV57ForColNom = "" ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      AV12AlbREnt = "" ;
      AV13ALbRfen = GXutil.nullDate() ;
      AV89ProceNom = "" ;
      P0AJ811_A970ProceCod = new short[1] ;
      P0AJ811_n970ProceCod = new boolean[] {false} ;
      P0AJ811_A396EmprCod = new String[] {""} ;
      P0AJ811_n396EmprCod = new boolean[] {false} ;
      P0AJ811_A361DisCod = new int[1] ;
      P0AJ811_A46AlbREnt = new String[] {""} ;
      P0AJ811_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJ811_A50AlbRLoc = new String[] {""} ;
      P0AJ811_A971ProceNom = new String[] {""} ;
      P0AJ811_n971ProceNom = new boolean[] {false} ;
      P0AJ811_A44AlbRecCod = new int[1] ;
      A46AlbREnt = "" ;
      A971ProceNom = "" ;
      AV103TipARtDsc = "" ;
      P0AJ812_A829TipArtCod = new short[1] ;
      P0AJ812_A396EmprCod = new String[] {""} ;
      P0AJ812_n396EmprCod = new boolean[] {false} ;
      P0AJ812_A830TipArtDsc = new String[] {""} ;
      P0AJ812_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      AV68Kgs_s = DecimalUtil.ZERO ;
      AV77Mts_s = DecimalUtil.ZERO ;
      AV11Albprofch = GXutil.nullDate() ;
      P0AJ813_A30AlbProCod = new long[1] ;
      P0AJ813_A396EmprCod = new String[] {""} ;
      P0AJ813_n396EmprCod = new boolean[] {false} ;
      P0AJ813_A130BarCodPar = new String[] {""} ;
      P0AJ813_A132BarCodReo = new byte[1] ;
      P0AJ813_A129BarCod = new int[1] ;
      P0AJ813_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ813_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ813_A1265BarAlbPie = new int[1] ;
      P0AJ813_A3271AlbHdrAnc = new short[1] ;
      P0AJ813_A5019AlbHdrgm2 = new short[1] ;
      P0AJ813_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A34AlbProfch = GXutil.nullDate() ;
      P0AJ814_A396EmprCod = new String[] {""} ;
      P0AJ814_n396EmprCod = new boolean[] {false} ;
      P0AJ814_A8391PMDCod = new short[1] ;
      P0AJ814_A252CliCod = new int[1] ;
      P0AJ814_n252CliCod = new boolean[] {false} ;
      P0AJ814_A8392PMDDsc = new String[] {""} ;
      P0AJ814_n8392PMDDsc = new boolean[] {false} ;
      A8392PMDDsc = "" ;
      P0AJ815_A396EmprCod = new String[] {""} ;
      P0AJ815_n396EmprCod = new boolean[] {false} ;
      P0AJ815_A10887Cod_Idtx = new String[] {""} ;
      P0AJ815_A10888Dsc_Idtx = new String[] {""} ;
      P0AJ815_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      P0AJ816_A396EmprCod = new String[] {""} ;
      P0AJ816_n396EmprCod = new boolean[] {false} ;
      P0AJ816_A10887Cod_Idtx = new String[] {""} ;
      P0AJ816_A10888Dsc_Idtx = new String[] {""} ;
      P0AJ816_n10888Dsc_Idtx = new boolean[] {false} ;
      AV36baridtxdc2 = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrmod_2__default(),
         new Object[] {
             new Object[] {
            P0AJ82_A396EmprCod, P0AJ82_n396EmprCod, P0AJ82_A942TermCod, P0AJ82_A1189TermUsu, P0AJ82_n1189TermUsu
            }
            , new Object[] {
            P0AJ84_A833TipDefCod, P0AJ84_n833TipDefCod, P0AJ84_A396EmprCod, P0AJ84_A129BarCod, P0AJ84_A132BarCodReo, P0AJ84_A130BarCodPar, P0AJ84_A361DisCod, P0AJ84_A2829BarProPer, P0AJ84_A13908BarIdtx2, P0AJ84_n13908BarIdtx2,
            P0AJ84_A9775BarItem1, P0AJ84_A9776barItem2, P0AJ84_A221BarTra1, P0AJ84_A224BarTraP1, P0AJ84_A222BarTra2, P0AJ84_A225BarTraP2, P0AJ84_A223BarTra3, P0AJ84_A226BarTraP3, P0AJ84_A229BarUrd1, P0AJ84_A232BarUrdP1,
            P0AJ84_A230BarUrd2, P0AJ84_A233BarUrdP2, P0AJ84_A2010BarTipDis, P0AJ84_A181BarMaqPro, P0AJ84_A148BarEstReo, P0AJ84_A834TipDefDsc, P0AJ84_n834TipDefDsc, P0AJ84_A218BarTipCol, P0AJ84_A252CliCod, P0AJ84_n252CliCod,
            P0AJ84_A212BarSer, P0AJ84_A135BarColNom, P0AJ84_A136BarColNum, P0AJ84_A213BarSit, P0AJ84_A1431BarLocDis, P0AJ84_A3644CliNom1, P0AJ84_A279CliNom, P0AJ84_A155BarFecCli, P0AJ84_A1235BarNumCli, P0AJ84_A1234BarNomCli,
            P0AJ84_A143BarDisNum, P0AJ84_A217BarTipArt, P0AJ84_n217BarTipArt, P0AJ84_A180BarMaqCod, P0AJ84_A1909BarGraAca, P0AJ84_A3137BarGraAca2, P0AJ84_A125BarAncAca1, P0AJ84_A126BarAncAca2, P0AJ84_A1224BarEncAnh, P0AJ84_A1223BarEncCom,
            P0AJ84_A2454BarGirar, P0AJ84_A3311BarManCod1, P0AJ84_A11662BarOrdComp, P0AJ84_A206BarPle, P0AJ84_A1652BarSerDsc, P0AJ84_A1503BarPart, P0AJ84_A159BarFecGen, P0AJ84_A166BarKgm, P0AJ84_A199BarPie1, P0AJ84_A365DisDes,
            P0AJ84_A898BarPieNDes
            }
            , new Object[] {
            P0AJ85_A44AlbRecCod, P0AJ85_A396EmprCod, P0AJ85_A129BarCod, P0AJ85_A132BarCodReo, P0AJ85_A130BarCodPar, P0AJ85_A203BarPieKil, P0AJ85_A50AlbRLoc, P0AJ85_A49AlbRFen, P0AJ85_A1501BarPiePie, P0AJ85_A200BarPieCod
            }
            , new Object[] {
            P0AJ86_A44AlbRecCod, P0AJ86_A396EmprCod, P0AJ86_A129BarCod, P0AJ86_A132BarCodReo, P0AJ86_A130BarCodPar, P0AJ86_A8028AlbNumB, P0AJ86_A6463AlbRLote, P0AJ86_A6465AlbRLu, P0AJ86_A4602AlbRMdlCod, P0AJ86_A6464AlbRTelar,
            P0AJ86_A8035AlbMaqTej, P0AJ86_A6470AlbRTara, P0AJ86_A49AlbRFen, P0AJ86_A50AlbRLoc, P0AJ86_A1501BarPiePie, P0AJ86_A203BarPieKil, P0AJ86_A200BarPieCod
            }
            , new Object[] {
            P0AJ87_A396EmprCod, P0AJ87_A361DisCod, P0AJ87_A377DisObsTxt, P0AJ87_A376DisObsLin
            }
            , new Object[] {
            P0AJ88_A396EmprCod, P0AJ88_A129BarCod, P0AJ88_A132BarCodReo, P0AJ88_A130BarCodPar, P0AJ88_A603MaqCodBis, P0AJ88_A460FasDsc, P0AJ88_A457FasCod, P0AJ88_A194BarOrdLin, P0AJ88_A758ProCod
            }
            , new Object[] {
            P0AJ89_A396EmprCod, P0AJ89_A1199MacCod, P0AJ89_A1205MacBarPar, P0AJ89_A1204MacBarReo, P0AJ89_A1203MacBarCod, P0AJ89_A1201MacLin
            }
            , new Object[] {
            P0AJ810_A602MaqCod, P0AJ810_A396EmprCod, P0AJ810_A606MaqDsc, P0AJ810_n606MaqDsc
            }
            , new Object[] {
            P0AJ811_A970ProceCod, P0AJ811_n970ProceCod, P0AJ811_A396EmprCod, P0AJ811_A361DisCod, P0AJ811_A46AlbREnt, P0AJ811_A49AlbRFen, P0AJ811_A50AlbRLoc, P0AJ811_A971ProceNom, P0AJ811_n971ProceNom, P0AJ811_A44AlbRecCod
            }
            , new Object[] {
            P0AJ812_A829TipArtCod, P0AJ812_A396EmprCod, P0AJ812_A830TipArtDsc, P0AJ812_n830TipArtDsc
            }
            , new Object[] {
            P0AJ813_A30AlbProCod, P0AJ813_A396EmprCod, P0AJ813_A130BarCodPar, P0AJ813_A132BarCodReo, P0AJ813_A129BarCod, P0AJ813_A1261BarAlbKgmE, P0AJ813_A1263BarAlbMtrE, P0AJ813_A1265BarAlbPie, P0AJ813_A3271AlbHdrAnc, P0AJ813_A5019AlbHdrgm2,
            P0AJ813_A34AlbProfch
            }
            , new Object[] {
            P0AJ814_A396EmprCod, P0AJ814_A8391PMDCod, P0AJ814_A252CliCod, P0AJ814_A8392PMDDsc, P0AJ814_n8392PMDDsc
            }
            , new Object[] {
            P0AJ815_A396EmprCod, P0AJ815_A10887Cod_Idtx, P0AJ815_A10888Dsc_Idtx, P0AJ815_n10888Dsc_Idtx
            }
            , new Object[] {
            P0AJ816_A396EmprCod, P0AJ816_A10887Cod_Idtx, P0AJ816_A10888Dsc_Idtx, P0AJ816_n10888Dsc_Idtx
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte AV28BarCodreo ;
   private byte AV70LenVar ;
   private byte AV62i ;
   private byte AV40BarTipCol ;
   private byte AV88Primeravez ;
   private byte A376DisObsLin ;
   private byte AV49ContLin ;
   private byte AV46Contador ;
   private byte A1204MacBarReo ;
   private byte GXv_int3[] ;
   private byte AV64IntCod ;
   private byte GXv_int9[] ;
   private short A833TipDefCod ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A217BarTipArt ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A3311BarManCod1 ;
   private short A1503BarPart ;
   private short A199BarPie1 ;
   private short AV51DetPzas ;
   private short AV102TipArtCod ;
   private short AV79NPrgTing ;
   private short A194BarOrdLin ;
   private short A1201MacLin ;
   private short AV81Pecas ;
   private short A970ProceCod ;
   private short A829TipArtCod ;
   private short AV91Pzs_s ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short AV8AlbHdrAnc ;
   private short AV9AlbHdrGm2 ;
   private short A8391PMDCod ;
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
   private int AV26barCod ;
   private int AV72MacCod ;
   private int GX_I ;
   private int AV98Tab_pz[] ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int AV43CliCod ;
   private int AV30BarColNum ;
   private int AV52DisCod ;
   private int Gx_OldLine ;
   private int AV17AlbRLu_trunc ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int GXv_int4[] ;
   private int GXv_int8[] ;
   private int AV58ForColNum ;
   private int GXv_int12[] ;
   private int A1265BarAlbPie ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV106TotKgs ;
   private java.math.BigDecimal AV96Tab_kgs[] ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal AV67KgmAgr ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV68Kgs_s ;
   private java.math.BigDecimal AV77Mts_s ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV63ImpCod ;
   private String Gx_out ;
   private String AV47ContDsc ;
   private String AV99Termin ;
   private String scmdbuf ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV100TermUsu ;
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
   private String AV44Cod_Idtx ;
   private String AV35BarIdtx2 ;
   private String AV90procesoidtx ;
   private String AV27BarCodPar ;
   private String AV37Baritem1 ;
   private String AV38BarItem2 ;
   private String AV45Comp ;
   private String AV105tipdisdsc ;
   private String AV76Marcadsc ;
   private String AV54EmprCod ;
   private String AV42Ceros8 ;
   private String AV60HdrAlfa ;
   private String AV61HojRut ;
   private String AV93Remonta ;
   private String AV101Texto ;
   private String AV97Tab_loc[] ;
   private String A50AlbRLoc ;
   private String A200BarPieCod ;
   private String AV104TipColDsc ;
   private String GXt_char2 ;
   private String AV19ArtCod ;
   private String AV29BarColNom ;
   private String AV94Sit ;
   private String AV14ALbRLoc ;
   private String AV109vCliNom ;
   private String AV74MaqCod ;
   private String AV33BarGraAca ;
   private String AV34BarGraAca2 ;
   private String AV23BarAncAca1 ;
   private String AV24BarAncAca2 ;
   private String AV31BarEncAnh ;
   private String AV32BarEncCom ;
   private String AV41Cartaz ;
   private String AV87PrgTing ;
   private String AV65IntDsc ;
   private String A8028AlbNumB ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A8035AlbMaqTej ;
   private String AV10AlbNumb ;
   private String AV53Dsc_Idtx ;
   private String AV15AlbrLote ;
   private String AV82Pgadas ;
   private String AV66Jogo3 ;
   private String AV55Fio5 ;
   private String AV73Maq6 ;
   private String A377DisObsTxt ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A1205MacBarPar ;
   private String AV21ArtDscAGr ;
   private String AV80ObsTxt ;
   private String AV75MaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXv_char6[] ;
   private String GXv_char1[] ;
   private String GXv_char7[] ;
   private String GXv_char10[] ;
   private String AV57ForColNom ;
   private String GXv_char11[] ;
   private String AV12AlbREnt ;
   private String AV89ProceNom ;
   private String A46AlbREnt ;
   private String A971ProceNom ;
   private String AV103TipARtDsc ;
   private String A830TipArtDsc ;
   private String A8392PMDDsc ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV36baridtxdc2 ;
   private String Gx_time ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV95Tab_fe[] ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV13ALbRfen ;
   private java.util.Date AV11Albprofch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean n396EmprCod ;
   private boolean n1189TermUsu ;
   private boolean GxHdr3 ;
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
   private String AV110ReportInPut ;
   private String A11662BarOrdComp ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJ82_A396EmprCod ;
   private boolean[] P0AJ82_n396EmprCod ;
   private String[] P0AJ82_A942TermCod ;
   private String[] P0AJ82_A1189TermUsu ;
   private boolean[] P0AJ82_n1189TermUsu ;
   private short[] P0AJ84_A833TipDefCod ;
   private boolean[] P0AJ84_n833TipDefCod ;
   private String[] P0AJ84_A396EmprCod ;
   private boolean[] P0AJ84_n396EmprCod ;
   private int[] P0AJ84_A129BarCod ;
   private byte[] P0AJ84_A132BarCodReo ;
   private String[] P0AJ84_A130BarCodPar ;
   private int[] P0AJ84_A361DisCod ;
   private String[] P0AJ84_A2829BarProPer ;
   private String[] P0AJ84_A13908BarIdtx2 ;
   private boolean[] P0AJ84_n13908BarIdtx2 ;
   private String[] P0AJ84_A9775BarItem1 ;
   private String[] P0AJ84_A9776barItem2 ;
   private String[] P0AJ84_A221BarTra1 ;
   private short[] P0AJ84_A224BarTraP1 ;
   private String[] P0AJ84_A222BarTra2 ;
   private short[] P0AJ84_A225BarTraP2 ;
   private String[] P0AJ84_A223BarTra3 ;
   private short[] P0AJ84_A226BarTraP3 ;
   private String[] P0AJ84_A229BarUrd1 ;
   private short[] P0AJ84_A232BarUrdP1 ;
   private String[] P0AJ84_A230BarUrd2 ;
   private short[] P0AJ84_A233BarUrdP2 ;
   private String[] P0AJ84_A2010BarTipDis ;
   private String[] P0AJ84_A181BarMaqPro ;
   private byte[] P0AJ84_A148BarEstReo ;
   private String[] P0AJ84_A834TipDefDsc ;
   private boolean[] P0AJ84_n834TipDefDsc ;
   private byte[] P0AJ84_A218BarTipCol ;
   private int[] P0AJ84_A252CliCod ;
   private boolean[] P0AJ84_n252CliCod ;
   private String[] P0AJ84_A212BarSer ;
   private String[] P0AJ84_A135BarColNom ;
   private int[] P0AJ84_A136BarColNum ;
   private byte[] P0AJ84_A213BarSit ;
   private String[] P0AJ84_A1431BarLocDis ;
   private String[] P0AJ84_A3644CliNom1 ;
   private String[] P0AJ84_A279CliNom ;
   private java.util.Date[] P0AJ84_A155BarFecCli ;
   private int[] P0AJ84_A1235BarNumCli ;
   private String[] P0AJ84_A1234BarNomCli ;
   private String[] P0AJ84_A143BarDisNum ;
   private short[] P0AJ84_A217BarTipArt ;
   private boolean[] P0AJ84_n217BarTipArt ;
   private String[] P0AJ84_A180BarMaqCod ;
   private short[] P0AJ84_A1909BarGraAca ;
   private short[] P0AJ84_A3137BarGraAca2 ;
   private short[] P0AJ84_A125BarAncAca1 ;
   private short[] P0AJ84_A126BarAncAca2 ;
   private java.math.BigDecimal[] P0AJ84_A1224BarEncAnh ;
   private java.math.BigDecimal[] P0AJ84_A1223BarEncCom ;
   private String[] P0AJ84_A2454BarGirar ;
   private short[] P0AJ84_A3311BarManCod1 ;
   private String[] P0AJ84_A11662BarOrdComp ;
   private String[] P0AJ84_A206BarPle ;
   private String[] P0AJ84_A1652BarSerDsc ;
   private short[] P0AJ84_A1503BarPart ;
   private java.util.Date[] P0AJ84_A159BarFecGen ;
   private java.math.BigDecimal[] P0AJ84_A166BarKgm ;
   private short[] P0AJ84_A199BarPie1 ;
   private String[] P0AJ84_A365DisDes ;
   private int[] P0AJ84_A898BarPieNDes ;
   private int[] P0AJ85_A44AlbRecCod ;
   private String[] P0AJ85_A396EmprCod ;
   private boolean[] P0AJ85_n396EmprCod ;
   private int[] P0AJ85_A129BarCod ;
   private byte[] P0AJ85_A132BarCodReo ;
   private String[] P0AJ85_A130BarCodPar ;
   private java.math.BigDecimal[] P0AJ85_A203BarPieKil ;
   private String[] P0AJ85_A50AlbRLoc ;
   private java.util.Date[] P0AJ85_A49AlbRFen ;
   private int[] P0AJ85_A1501BarPiePie ;
   private String[] P0AJ85_A200BarPieCod ;
   private int[] P0AJ86_A44AlbRecCod ;
   private String[] P0AJ86_A396EmprCod ;
   private boolean[] P0AJ86_n396EmprCod ;
   private int[] P0AJ86_A129BarCod ;
   private byte[] P0AJ86_A132BarCodReo ;
   private String[] P0AJ86_A130BarCodPar ;
   private String[] P0AJ86_A8028AlbNumB ;
   private String[] P0AJ86_A6463AlbRLote ;
   private java.math.BigDecimal[] P0AJ86_A6465AlbRLu ;
   private String[] P0AJ86_A4602AlbRMdlCod ;
   private String[] P0AJ86_A6464AlbRTelar ;
   private String[] P0AJ86_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AJ86_A6470AlbRTara ;
   private java.util.Date[] P0AJ86_A49AlbRFen ;
   private String[] P0AJ86_A50AlbRLoc ;
   private int[] P0AJ86_A1501BarPiePie ;
   private java.math.BigDecimal[] P0AJ86_A203BarPieKil ;
   private String[] P0AJ86_A200BarPieCod ;
   private String[] P0AJ87_A396EmprCod ;
   private boolean[] P0AJ87_n396EmprCod ;
   private int[] P0AJ87_A361DisCod ;
   private String[] P0AJ87_A377DisObsTxt ;
   private byte[] P0AJ87_A376DisObsLin ;
   private String[] P0AJ88_A396EmprCod ;
   private boolean[] P0AJ88_n396EmprCod ;
   private int[] P0AJ88_A129BarCod ;
   private byte[] P0AJ88_A132BarCodReo ;
   private String[] P0AJ88_A130BarCodPar ;
   private String[] P0AJ88_A603MaqCodBis ;
   private String[] P0AJ88_A460FasDsc ;
   private String[] P0AJ88_A457FasCod ;
   private short[] P0AJ88_A194BarOrdLin ;
   private String[] P0AJ88_A758ProCod ;
   private String[] P0AJ89_A396EmprCod ;
   private boolean[] P0AJ89_n396EmprCod ;
   private int[] P0AJ89_A1199MacCod ;
   private String[] P0AJ89_A1205MacBarPar ;
   private byte[] P0AJ89_A1204MacBarReo ;
   private int[] P0AJ89_A1203MacBarCod ;
   private short[] P0AJ89_A1201MacLin ;
   private String[] P0AJ810_A602MaqCod ;
   private String[] P0AJ810_A396EmprCod ;
   private boolean[] P0AJ810_n396EmprCod ;
   private String[] P0AJ810_A606MaqDsc ;
   private boolean[] P0AJ810_n606MaqDsc ;
   private short[] P0AJ811_A970ProceCod ;
   private boolean[] P0AJ811_n970ProceCod ;
   private String[] P0AJ811_A396EmprCod ;
   private boolean[] P0AJ811_n396EmprCod ;
   private int[] P0AJ811_A361DisCod ;
   private String[] P0AJ811_A46AlbREnt ;
   private java.util.Date[] P0AJ811_A49AlbRFen ;
   private String[] P0AJ811_A50AlbRLoc ;
   private String[] P0AJ811_A971ProceNom ;
   private boolean[] P0AJ811_n971ProceNom ;
   private int[] P0AJ811_A44AlbRecCod ;
   private short[] P0AJ812_A829TipArtCod ;
   private String[] P0AJ812_A396EmprCod ;
   private boolean[] P0AJ812_n396EmprCod ;
   private String[] P0AJ812_A830TipArtDsc ;
   private boolean[] P0AJ812_n830TipArtDsc ;
   private long[] P0AJ813_A30AlbProCod ;
   private String[] P0AJ813_A396EmprCod ;
   private boolean[] P0AJ813_n396EmprCod ;
   private String[] P0AJ813_A130BarCodPar ;
   private byte[] P0AJ813_A132BarCodReo ;
   private int[] P0AJ813_A129BarCod ;
   private java.math.BigDecimal[] P0AJ813_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AJ813_A1263BarAlbMtrE ;
   private int[] P0AJ813_A1265BarAlbPie ;
   private short[] P0AJ813_A3271AlbHdrAnc ;
   private short[] P0AJ813_A5019AlbHdrgm2 ;
   private java.util.Date[] P0AJ813_A34AlbProfch ;
   private String[] P0AJ814_A396EmprCod ;
   private boolean[] P0AJ814_n396EmprCod ;
   private short[] P0AJ814_A8391PMDCod ;
   private int[] P0AJ814_A252CliCod ;
   private boolean[] P0AJ814_n252CliCod ;
   private String[] P0AJ814_A8392PMDDsc ;
   private boolean[] P0AJ814_n8392PMDDsc ;
   private String[] P0AJ815_A396EmprCod ;
   private boolean[] P0AJ815_n396EmprCod ;
   private String[] P0AJ815_A10887Cod_Idtx ;
   private String[] P0AJ815_A10888Dsc_Idtx ;
   private boolean[] P0AJ815_n10888Dsc_Idtx ;
   private String[] P0AJ816_A396EmprCod ;
   private boolean[] P0AJ816_n396EmprCod ;
   private String[] P0AJ816_A10887Cod_Idtx ;
   private String[] P0AJ816_A10888Dsc_Idtx ;
   private boolean[] P0AJ816_n10888Dsc_Idtx ;
}

final  class rhdrmod_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJ82", "SELECT EmprCod, TermCod, TermUsu FROM TXPTERMIN WHERE (TermCod = ?) AND (EmprCod = ?) ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ84", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarProPer, T1.BarIdtx2, T1.BarItem1, T1.barItem2, T1.BarTra1, T1.BarTraP1, T1.BarTra2, T1.BarTraP2, T1.BarTra3, T1.BarTraP3, T1.BarUrd1, T1.BarUrdP1, T1.BarUrd2, T1.BarUrdP2, T1.BarTipDis, T1.BarMaqPro, T1.BarEstReo, T2.TipDefDsc, T1.BarTipCol, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarSit, T1.BarLocDis, T3.CliNom1, T3.CliNom, T1.BarFecCli, T1.BarNumCli, T1.BarNomCli, T1.BarDisNum, T1.BarTipArt, T1.BarMaqCod, T1.BarGraAca, T1.BarGraAca2, T1.BarAncAca1, T1.BarAncAca2, T1.BarEncAnh, T1.BarEncCom, T1.BarGirar, T1.BarManCod1, T1.BarOrdComp, T1.BarPle, T1.BarSerDsc, T1.BarPart, T1.BarFecGen, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ85", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieKil, T2.AlbRLoc, T2.AlbRFen, T1.BarPiePie, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJ86", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbNumB, T2.AlbRLote, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRFen, T2.AlbRLoc, T1.BarPiePie, T1.BarPieKil, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJ87", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJ88", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJ89", "SELECT EmprCod, MacCod, MacBarPar, MacBarReo, MacBarCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJ810", "SELECT MaqCod, EmprCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ811", "SELECT T2.ProceCod, T1.EmprCod, T1.DisCod, T2.AlbREnt, T2.AlbRFen, T2.AlbRLoc, T3.ProceNom, T1.AlbRecCod FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJ812", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ813", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.AlbHdrAnc, T1.AlbHdrgm2, T2.AlbProfch FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJ814", "SELECT EmprCod, PMDCod, CliCod, PMDDsc FROM TXPProMD WHERE EmprCod = ? and CliCod = ? and PMDCod = ? ORDER BY EmprCod, CliCod, PMDCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ815", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ816", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[27])[0] = rslt.getByte(25);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 16);
               ((String[]) buf[31])[0] = rslt.getString(28, 13);
               ((int[]) buf[32])[0] = rslt.getInt(29);
               ((byte[]) buf[33])[0] = rslt.getByte(30);
               ((String[]) buf[34])[0] = rslt.getString(31, 10);
               ((String[]) buf[35])[0] = rslt.getString(32, 30);
               ((String[]) buf[36])[0] = rslt.getString(33, 30);
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(34);
               ((int[]) buf[38])[0] = rslt.getInt(35);
               ((String[]) buf[39])[0] = rslt.getString(36, 13);
               ((String[]) buf[40])[0] = rslt.getString(37, 8);
               ((short[]) buf[41])[0] = rslt.getShort(38);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(39, 6);
               ((short[]) buf[44])[0] = rslt.getShort(40);
               ((short[]) buf[45])[0] = rslt.getShort(41);
               ((short[]) buf[46])[0] = rslt.getShort(42);
               ((short[]) buf[47])[0] = rslt.getShort(43);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(45,2);
               ((String[]) buf[50])[0] = rslt.getString(46, 20);
               ((short[]) buf[51])[0] = rslt.getShort(47);
               ((String[]) buf[52])[0] = rslt.getVarchar(48);
               ((String[]) buf[53])[0] = rslt.getString(49, 10);
               ((String[]) buf[54])[0] = rslt.getString(50, 26);
               ((short[]) buf[55])[0] = rslt.getShort(51);
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(52);
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

