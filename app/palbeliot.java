package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class palbeliot extends GXReport
{
   public palbeliot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbeliot.class ), "" );
   }

   public palbeliot( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      palbeliot.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      palbeliot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbeliot.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbeliot.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      palbeliot.this.AV51TextoCopia = aP3[0];
      this.aP3 = aP3;
      palbeliot.this.Gx_out = aP4[0];
      this.aP4 = aP4;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Despacho") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV60ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBSUP", ""), GXv_char1) ;
         palbeliot.this.AV60ContDsc = GXv_char1[0] ;
         /* Using cursor P04XD2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P04XD2_A407EmprNom[0] ;
            n407EmprNom = P04XD2_n407EmprNom[0] ;
            A404EmprDir = P04XD2_A404EmprDir[0] ;
            n404EmprDir = P04XD2_n404EmprDir[0] ;
            A408EmprPob = P04XD2_A408EmprPob[0] ;
            n408EmprPob = P04XD2_n408EmprPob[0] ;
            A409EmprTel = P04XD2_A409EmprTel[0] ;
            n409EmprTel = P04XD2_n409EmprTel[0] ;
            A405EmprFax = P04XD2_A405EmprFax[0] ;
            n405EmprFax = P04XD2_n405EmprFax[0] ;
            A395EmprCif = P04XD2_A395EmprCif[0] ;
            n395EmprCif = P04XD2_n395EmprCif[0] ;
            AV21EmprNom = A407EmprNom ;
            AV103EmprDir = A404EmprDir ;
            AV104EmprPob = A408EmprPob ;
            AV105EmprTel = A409EmprTel ;
            AV106EmprFax = A405EmprFax ;
            AV107EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV122bARalBbUL = (short)(0) ;
         AV124BarAlbPlas = (short)(0) ;
         AV123BarALbTub = 0 ;
         AV68Flag_tubos = (byte)(0) ;
         GxHdr3 = true ;
         /* Using cursor P04XD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1253EmprGuiRem = P04XD3_A1253EmprGuiRem[0] ;
            A840TrnCod = P04XD3_A840TrnCod[0] ;
            A1243GuiRemCli = P04XD3_A1243GuiRemCli[0] ;
            A1259AlbDomEnv = P04XD3_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P04XD3_n1259AlbDomEnv[0] ;
            A39AlbProPri = P04XD3_A39AlbProPri[0] ;
            A3868AlbMat = P04XD3_A3868AlbMat[0] ;
            A2242AlbSec = P04XD3_A2242AlbSec[0] ;
            A7098AlbUsu = P04XD3_A7098AlbUsu[0] ;
            A7162AlbDesp = P04XD3_A7162AlbDesp[0] ;
            A1879AlbProEnt = P04XD3_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P04XD3_n1879AlbProEnt[0] ;
            A33AlbProEst = P04XD3_A33AlbProEst[0] ;
            A1782AlbProEso = P04XD3_A1782AlbProEso[0] ;
            A3865AlbHorSal = P04XD3_A3865AlbHorSal[0] ;
            A34AlbProfch = P04XD3_A34AlbProfch[0] ;
            /* Using cursor P04XD4 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A953IvaCod = P04XD4_A953IvaCod[0] ;
            n953IvaCod = P04XD4_n953IvaCod[0] ;
            /* Using cursor P04XD5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
            A588IvaPor = P04XD5_A588IvaPor[0] ;
            n588IvaPor = P04XD5_n588IvaPor[0] ;
            /* Using cursor P04XD6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
            A841TrnNom = P04XD6_A841TrnNom[0] ;
            n841TrnNom = P04XD6_n841TrnNom[0] ;
            /* Using cursor P04XD7 */
            pr_default.execute(5, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
            A4828CliCp2 = P04XD7_A4828CliCp2[0] ;
            n4828CliCp2 = P04XD7_n4828CliCp2[0] ;
            A256CliCp = P04XD7_A256CliCp[0] ;
            n256CliCp = P04XD7_n256CliCp[0] ;
            AV16CliCod = A1243GuiRemCli ;
            AV22CliEnvDom = A1259AlbDomEnv ;
            AV29Prioridad = A39AlbProPri ;
            AV73CliPagLin = (byte)(GXutil.lval( A39AlbProPri)) ;
            AV64IvaPor = A588IvaPor ;
            AV65AlbMat = A3868AlbMat ;
            AV66AlbHorSal = A3865AlbHorSal ;
            AV100TrnNom = A841TrnNom ;
            AV69Cp_1_2 = GXutil.trim( A256CliCp) + "-" + GXutil.trim( GXutil.substring( A4828CliCp2, 1, 4)) ;
            AV78AlbSec = A2242AlbSec ;
            AV93AlbUsu = A7098AlbUsu ;
            /* Using cursor P04XD8 */
            pr_default.execute(6, new Object[] {AV93AlbUsu});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A850UsurCod = P04XD8_A850UsurCod[0] ;
               A854UsurNom = P04XD8_A854UsurNom[0] ;
               n854UsurNom = P04XD8_n854UsurNom[0] ;
               AV98usurnom = A854UsurNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
            AV94AlbDesp = A7162AlbDesp ;
            AV95Openom = " " ;
            /* Using cursor P04XD9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV94AlbDesp)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A652OpeCod = P04XD9_A652OpeCod[0] ;
               A653OpeNom = P04XD9_A653OpeNom[0] ;
               n653OpeNom = P04XD9_n653OpeNom[0] ;
               AV95Openom = A653OpeNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(7);
            /* Execute user subroutine: 'CLIENTE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(5);
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
            AV58i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV59vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P04XD10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A916AlbPObs = P04XD10_A916AlbPObs[0] ;
               A915AlbPObsLin = P04XD10_A915AlbPObsLin[0] ;
               if ( AV58i > 5 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV59vObs[AV58i-1] = A916AlbPObs ;
               AV58i = (byte)(AV58i+1) ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            AV89Despacho = "*" + GXutil.str( A30AlbProCod, 10, 0) + "*" ;
            AV48ContLine = (byte)(0) ;
            AV52Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            AV81BarFasExt = "" ;
            AV54TotKgs = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P04XD11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A130BarCodPar = P04XD11_A130BarCodPar[0] ;
               A132BarCodReo = P04XD11_A132BarCodReo[0] ;
               A129BarCod = P04XD11_A129BarCod[0] ;
               A361DisCod = P04XD11_A361DisCod[0] ;
               A136BarColNum = P04XD11_A136BarColNum[0] ;
               A1261BarAlbKgmE = P04XD11_A1261BarAlbKgmE[0] ;
               A1235BarNumCli = P04XD11_A1235BarNumCli[0] ;
               A1234BarNomCli = P04XD11_A1234BarNomCli[0] ;
               A1652BarSerDsc = P04XD11_A1652BarSerDsc[0] ;
               A135BarColNom = P04XD11_A135BarColNom[0] ;
               A5293BarCodBan = P04XD11_A5293BarCodBan[0] ;
               A4812BarEncCli = P04XD11_A4812BarEncCli[0] ;
               A212BarSer = P04XD11_A212BarSer[0] ;
               A4609BarMdlCod = P04XD11_A4609BarMdlCod[0] ;
               A1265BarAlbPie = P04XD11_A1265BarAlbPie[0] ;
               A1264BarPreMtr = P04XD11_A1264BarPreMtr[0] ;
               A182BarMat = P04XD11_A182BarMat[0] ;
               A4459BarCruEnr = P04XD11_A4459BarCruEnr[0] ;
               A217BarTipArt = P04XD11_A217BarTipArt[0] ;
               n217BarTipArt = P04XD11_n217BarTipArt[0] ;
               A339DisArtLar = P04XD11_A339DisArtLar[0] ;
               A1458BarAlbBul = P04XD11_A1458BarAlbBul[0] ;
               A6467BarAlbPlas = P04XD11_A6467BarAlbPlas[0] ;
               A1266BarAlbTub = P04XD11_A1266BarAlbTub[0] ;
               A361DisCod = P04XD11_A361DisCod[0] ;
               A136BarColNum = P04XD11_A136BarColNum[0] ;
               A1235BarNumCli = P04XD11_A1235BarNumCli[0] ;
               A1234BarNomCli = P04XD11_A1234BarNomCli[0] ;
               A1652BarSerDsc = P04XD11_A1652BarSerDsc[0] ;
               A135BarColNom = P04XD11_A135BarColNom[0] ;
               A5293BarCodBan = P04XD11_A5293BarCodBan[0] ;
               A4812BarEncCli = P04XD11_A4812BarEncCli[0] ;
               A212BarSer = P04XD11_A212BarSer[0] ;
               A4609BarMdlCod = P04XD11_A4609BarMdlCod[0] ;
               A182BarMat = P04XD11_A182BarMat[0] ;
               A4459BarCruEnr = P04XD11_A4459BarCruEnr[0] ;
               A217BarTipArt = P04XD11_A217BarTipArt[0] ;
               n217BarTipArt = P04XD11_n217BarTipArt[0] ;
               A339DisArtLar = P04XD11_A339DisArtLar[0] ;
               AV37DisCod = A361DisCod ;
               /* Execute user subroutine: 'DISALB' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(9);
                  pr_default.close(9);
                  pr_default.close(9);
                  pr_default.close(5);
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
               AV50barcolnum = A136BarColNum ;
               AV55Hdr = httpContext.getMessage( "O/S ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               if ( A132BarCodReo == 0 )
               {
                  AV55Hdr = httpContext.getMessage( "O/S ", "") + GXutil.str( A129BarCod, 8, 0) + " " + " " + A130BarCodPar ;
               }
               AV56KgsE = A1261BarAlbKgmE ;
               if ( A1235BarNumCli == 0 )
               {
                  AV62Color_cli = A1234BarNomCli ;
               }
               AV63SerDsc_1 = GXutil.substring( A1652BarSerDsc, 1, 20) ;
               AV118Col8 = GXutil.substring( A135BarColNom, 1, 8) ;
               AV85ProDsc = "" ;
               /* Using cursor P04XD12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A761ProFasLin = P04XD12_A761ProFasLin[0] ;
                  n761ProFasLin = P04XD12_n761ProFasLin[0] ;
                  A4628ProDsc2 = P04XD12_A4628ProDsc2[0] ;
                  A758ProCod = P04XD12_A758ProCod[0] ;
                  A4628ProDsc2 = P04XD12_A4628ProDsc2[0] ;
                  AV97Procod = A758ProCod ;
                  AV85ProDsc = GXutil.substring( A4628ProDsc2, 1, 40) ;
                  pr_default.readNext(10);
               }
               pr_default.close(10);
               if ( GXutil.strcmp(A5293BarCodBan, " ") != 0 )
               {
                  AV97Procod = GXutil.substring( A5293BarCodBan, 1, 8) ;
               }
               AV76Flag_tp = (byte)(0) ;
               AV77v_linea = GXutil.space( (short)(103)) ;
               AV90Barenccli = GXutil.substring( A4812BarEncCli, 1, 10) ;
               AV91Barser = GXutil.substring( A212BarSer, 1, 10) ;
               AV92BarSerdsc = GXutil.substring( A1652BarSerDsc, 1, 20) ;
               AV96barmdlcod = GXutil.substring( A4609BarMdlCod, 1, 5) ;
               AV99Kgs = A1261BarAlbKgmE ;
               AV101Tot_u = (int)(AV101Tot_u+A1265BarAlbPie) ;
               AV54TotKgs = AV54TotKgs.add(A1261BarAlbKgmE) ;
               AV109PrecioUn = (int)(DecimalUtil.decToDouble(A1264BarPreMtr)) ;
               AV110Imp = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( A1264BarPreMtr.multiply(DecimalUtil.doubleToDec(A1265BarAlbPie)), 0))) ;
               AV111Ref = GXutil.substring( A182BarMat, 1, 10) ;
               AV112Mf = A4459BarCruEnr ;
               GXv_char1[0] = AV120Tipartdsc ;
               new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char1) ;
               palbeliot.this.AV120Tipartdsc = GXv_char1[0] ;
               AV119Tprda = GXutil.substring( AV120Tipartdsc, 1, 10) ;
               /* Using cursor P04XD13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(11) != 101) )
               {
                  A203BarPieKil = P04XD13_A203BarPieKil[0] ;
                  A44AlbRecCod = P04XD13_A44AlbRecCod[0] ;
                  A200BarPieCod = P04XD13_A200BarPieCod[0] ;
                  AV44AlbRecCod = A44AlbRecCod ;
                  pr_default.readNext(11);
               }
               pr_default.close(11);
               h4XD0( false, 16) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Tprda, "")), 94, Gx_line+0, 168, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Col8, "")), 177, Gx_line+1, 236, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Procod, "")), 240, Gx_line+0, 299, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 302, Gx_line+0, 361, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A339DisArtLar, "")), 365, Gx_line+0, 439, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Ref, "")), 464, Gx_line+0, 538, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Barenccli, "")), 547, Gx_line+0, 621, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112Mf, "")), 644, Gx_line+0, 655, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 674, Gx_line+0, 719, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")), 734, Gx_line+0, 801, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91Barser, "")), 10, Gx_line+0, 84, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               AV114TotV = (long)(AV114TotV+AV110Imp) ;
               if ( GXutil.strcmp(AV112Mf, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV121Totmf = (short)(AV121Totmf+1) ;
               }
               AV122bARalBbUL = (short)(AV122bARalBbUL+A1458BarAlbBul) ;
               AV124BarAlbPlas = (short)(AV124BarAlbPlas+A6467BarAlbPlas) ;
               AV123BarALbTub = (int)(AV123BarALbTub+A1266BarAlbTub) ;
               pr_default.readNext(9);
            }
            pr_default.close(9);
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            h4XD0( false, 16) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV101Tot_u), "ZZZZZ9")), 674, Gx_line+0, 719, Gx_line+16, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 609, Gx_line+1, 648, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54TotKgs, "ZZZ,ZZ9.99")), 727, Gx_line+0, 801, Gx_line+16, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+16) ;
            if ( AV121Totmf > 0 )
            {
               AV121Totmf = (short)(AV121Totmf+AV101Tot_u) ;
               h4XD0( false, 16) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total + Muestras Físicas", ""), 509, Gx_line+0, 648, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV121Totmf), "ZZZ9")), 689, Gx_line+0, 719, Gx_line+16, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
            }
            h4XD0( false, 233) ;
            getPrinter().GxDrawRect(10, Gx_line+102, 798, Gx_line+205, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones:", ""), 21, Gx_line+117, 102, Gx_line+132, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[1-1], "")), 104, Gx_line+117, 365, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[2-1], "")), 104, Gx_line+131, 365, Gx_line+147, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Despachado por:", ""), 21, Gx_line+175, 108, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98usurnom, "")), 109, Gx_line+175, 292, Gx_line+191, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 318, Gx_line+175, 353, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recibido por:", ""), 458, Gx_line+175, 525, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 682, Gx_line+175, 717, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(10, Gx_line+160, 798, Gx_line+205, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(313, Gx_line+160, 313, Gx_line+205, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(453, Gx_line+160, 453, Gx_line+205, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(646, Gx_line+160, 646, Gx_line+205, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página", ""), 708, Gx_line+218, 742, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 754, Gx_line+218, 793, Gx_line+234, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Después de 24 horas de entregada la producción no se aceptan reclamos.", ""), 146, Gx_line+219, 586, Gx_line+235, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CAJAS:", ""), 21, Gx_line+29, 64, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CONTENEDORES:", ""), 21, Gx_line+44, 113, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "BOLSAS:", ""), 21, Gx_line+58, 71, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV122bARalBbUL), "ZZZ9")), 132, Gx_line+29, 158, Gx_line+45, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV123BarALbTub), "ZZZ9")), 120, Gx_line+44, 159, Gx_line+60, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV124BarAlbPlas), "ZZZ9")), 132, Gx_line+58, 158, Gx_line+74, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(10, Gx_line+15, 235, Gx_line+89, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TextoCopia, "")), 673, Gx_line+73, 799, Gx_line+94, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+233) ;
            /* Using cursor P04XD14 */
            pr_default.execute(12, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.close(5);
         pr_default.close(2);
         pr_default.close(3);
         pr_default.close(4);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h4XD0( true, 0) ;
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
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      /* Using cursor P04XD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A781PrvCod = P04XD15_A781PrvCod[0] ;
         A252CliCod = P04XD15_A252CliCod[0] ;
         A279CliNom = P04XD15_A279CliNom[0] ;
         A260CliDom = P04XD15_A260CliDom[0] ;
         A256CliCp = P04XD15_A256CliCp[0] ;
         n256CliCp = P04XD15_n256CliCp[0] ;
         A295CliPob = P04XD15_A295CliPob[0] ;
         A278CliNif = P04XD15_A278CliNif[0] ;
         A303CliTel1 = P04XD15_A303CliTel1[0] ;
         A787PrvDsc = P04XD15_A787PrvDsc[0] ;
         n787PrvDsc = P04XD15_n787PrvDsc[0] ;
         A787PrvDsc = P04XD15_A787PrvDsc[0] ;
         n787PrvDsc = P04XD15_n787PrvDsc[0] ;
         AV17CliNom = A279CliNom ;
         AV18CliDom = A260CliDom ;
         AV19Clicp = A256CliCp ;
         AV20CliPob = A295CliPob ;
         AV47CliNif = A278CliNif ;
         AV113Clitel1 = A303CliTel1 ;
         AV23CliENom = A279CliNom ;
         AV24CliEDom = A260CliDom ;
         AV25CliEcp = A256CliCp ;
         AV26CliEPob = A295CliPob ;
         AV70PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
      AV30FpgDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P04XD16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV29Prioridad});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A497FpgCod = P04XD16_A497FpgCod[0] ;
         A297CliPri = P04XD16_A297CliPri[0] ;
         A252CliCod = P04XD16_A252CliCod[0] ;
         A498FpgDsc = P04XD16_A498FpgDsc[0] ;
         n498FpgDsc = P04XD16_n498FpgDsc[0] ;
         A498FpgDsc = P04XD16_A498FpgDsc[0] ;
         n498FpgDsc = P04XD16_n498FpgDsc[0] ;
         AV30FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
      /* Execute user subroutine: 'ENVIO' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P04XD17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV22CliEnvDom)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A266CliEnvLin = P04XD17_A266CliEnvLin[0] ;
         A252CliCod = P04XD17_A252CliCod[0] ;
         A267CliEnvNom = P04XD17_A267CliEnvNom[0] ;
         A265CliEnvDom = P04XD17_A265CliEnvDom[0] ;
         A264CliEnvCp = P04XD17_A264CliEnvCp[0] ;
         A268CliEnvPob = P04XD17_A268CliEnvPob[0] ;
         A270CliEnvPrv = P04XD17_A270CliEnvPrv[0] ;
         AV23CliENom = A267CliEnvNom ;
         AV24CliEDom = A265CliEnvDom ;
         AV25CliEcp = A264CliEnvCp ;
         AV26CliEPob = A268CliEnvPob ;
         AV71CodPrv = A270CliEnvPrv ;
         /* Execute user subroutine: 'PROVIN' */
         S1313 ();
         if ( returnInSub )
         {
            pr_default.close(15);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S1313( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P04XD18 */
      pr_default.execute(16, new Object[] {Short.valueOf(AV71CodPrv)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A781PrvCod = P04XD18_A781PrvCod[0] ;
         A787PrvDsc = P04XD18_A787PrvDsc[0] ;
         n787PrvDsc = P04XD18_n787PrvDsc[0] ;
         AV70PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'DISALB' Routine */
      returnInSub = false ;
      AV42Procenom = " " ;
      AV116Procedom = " " ;
      AV117Procetel1 = " " ;
      /* Using cursor P04XD19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(AV37DisCod)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A970ProceCod = P04XD19_A970ProceCod[0] ;
         n970ProceCod = P04XD19_n970ProceCod[0] ;
         A361DisCod = P04XD19_A361DisCod[0] ;
         A971ProceNom = P04XD19_A971ProceNom[0] ;
         n971ProceNom = P04XD19_n971ProceNom[0] ;
         A994ProceDom = P04XD19_A994ProceDom[0] ;
         n994ProceDom = P04XD19_n994ProceDom[0] ;
         A990ProceTel1 = P04XD19_A990ProceTel1[0] ;
         n990ProceTel1 = P04XD19_n990ProceTel1[0] ;
         A44AlbRecCod = P04XD19_A44AlbRecCod[0] ;
         A970ProceCod = P04XD19_A970ProceCod[0] ;
         n970ProceCod = P04XD19_n970ProceCod[0] ;
         A971ProceNom = P04XD19_A971ProceNom[0] ;
         n971ProceNom = P04XD19_n971ProceNom[0] ;
         A994ProceDom = P04XD19_A994ProceDom[0] ;
         n994ProceDom = P04XD19_n994ProceDom[0] ;
         A990ProceTel1 = P04XD19_A990ProceTel1[0] ;
         n990ProceTel1 = P04XD19_n990ProceTel1[0] ;
         AV42Procenom = A971ProceNom ;
         AV116Procedom = A994ProceDom ;
         AV117Procetel1 = A990ProceTel1 ;
         pr_default.readNext(17);
      }
      pr_default.close(17);
   }

   public void h4XD0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17CliNom, "")), 20, Gx_line+136, 209, Gx_line+154, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 540, Gx_line+160, 593, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 57, Gx_line+190, 183, Gx_line+208, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 541, Gx_line+138, 615, Gx_line+156, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA:", ""), 474, Gx_line+161, 524, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIT:", ""), 20, Gx_line+190, 46, Gx_line+207, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIT.", ""), 21, Gx_line+29, 57, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 18, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Despacho, "")), 578, Gx_line+51, 717, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+103, 798, Gx_line+103, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REMISION DE MERCANCIA", ""), 475, Gx_line+109, 732, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº:", ""), 475, Gx_line+134, 506, Gx_line+159, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HORA:", ""), 474, Gx_line+180, 518, Gx_line+197, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), 540, Gx_line+180, 649, Gx_line+198, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESPACHADO A:", ""), 20, Gx_line+113, 131, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CONFECCIONISTA:", ""), 20, Gx_line+209, 144, Gx_line+226, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Procenom, "")), 153, Gx_line+209, 342, Gx_line+227, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TRANSPORTADOR:", ""), 475, Gx_line+209, 601, Gx_line+226, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MATRICULA:", ""), 475, Gx_line+229, 558, Gx_line+246, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65AlbMat, "")), 606, Gx_line+229, 732, Gx_line+247, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100TrnNom, "")), 606, Gx_line+209, 795, Gx_line+227, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107EmprCif, "")), 64, Gx_line+29, 190, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21EmprNom, "")), 21, Gx_line+0, 307, Gx_line+23, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PBX:", ""), 319, Gx_line+21, 344, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FAX:", ""), 319, Gx_line+38, 344, Gx_line+53, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103EmprDir, "")), 319, Gx_line+5, 502, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104EmprPob, "")), 319, Gx_line+54, 516, Gx_line+69, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105EmprTel, "")), 346, Gx_line+21, 425, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106EmprFax, "")), 347, Gx_line+38, 426, Gx_line+54, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CliDom, "")), 20, Gx_line+154, 234, Gx_line+172, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Clitel1, "")), 57, Gx_line+172, 152, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PBX:", ""), 20, Gx_line+172, 53, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Procedom, "")), 153, Gx_line+227, 367, Gx_line+245, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Procetel1, "")), 153, Gx_line+244, 276, Gx_line+262, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "T. Prenda", ""), 10, Gx_line+306, 64, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Genero", ""), 94, Gx_line+306, 138, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 177, Gx_line+306, 209, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 240, Gx_line+306, 289, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.P.", ""), 302, Gx_line+306, 324, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Ensayo/Corte", ""), 365, Gx_line+306, 457, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precinto", ""), 464, Gx_line+306, 513, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 547, Gx_line+306, 609, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MF", ""), 641, Gx_line+306, 659, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "UND", ""), 674, Gx_line+306, 697, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 771, Gx_line+306, 801, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+321, 83, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(94, Gx_line+321, 167, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(177, Gx_line+321, 235, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(240, Gx_line+321, 298, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(302, Gx_line+321, 360, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(365, Gx_line+321, 456, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(464, Gx_line+321, 537, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+321, 620, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(641, Gx_line+321, 651, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(674, Gx_line+321, 718, Gx_line+321, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(734, Gx_line+321, 800, Gx_line+321, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+326) ;
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
      this.aP0[0] = palbeliot.this.A396EmprCod;
      this.aP1[0] = palbeliot.this.A30AlbProCod;
      this.aP2[0] = palbeliot.this.AV15ImpCod;
      this.aP3[0] = palbeliot.this.AV51TextoCopia;
      this.aP4[0] = palbeliot.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbeliot");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60ContDsc = "" ;
      scmdbuf = "" ;
      P04XD2_A396EmprCod = new String[] {""} ;
      P04XD2_A407EmprNom = new String[] {""} ;
      P04XD2_n407EmprNom = new boolean[] {false} ;
      P04XD2_A404EmprDir = new String[] {""} ;
      P04XD2_n404EmprDir = new boolean[] {false} ;
      P04XD2_A408EmprPob = new String[] {""} ;
      P04XD2_n408EmprPob = new boolean[] {false} ;
      P04XD2_A409EmprTel = new String[] {""} ;
      P04XD2_n409EmprTel = new boolean[] {false} ;
      P04XD2_A405EmprFax = new String[] {""} ;
      P04XD2_n405EmprFax = new boolean[] {false} ;
      P04XD2_A395EmprCif = new String[] {""} ;
      P04XD2_n395EmprCif = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A395EmprCif = "" ;
      AV21EmprNom = "" ;
      AV103EmprDir = "" ;
      AV104EmprPob = "" ;
      AV105EmprTel = "" ;
      AV106EmprFax = "" ;
      AV107EmprCif = "" ;
      P04XD3_A1253EmprGuiRem = new String[] {""} ;
      P04XD3_A840TrnCod = new short[1] ;
      P04XD3_A396EmprCod = new String[] {""} ;
      P04XD3_A30AlbProCod = new long[1] ;
      P04XD3_A1243GuiRemCli = new int[1] ;
      P04XD3_A1259AlbDomEnv = new byte[1] ;
      P04XD3_n1259AlbDomEnv = new boolean[] {false} ;
      P04XD3_A39AlbProPri = new String[] {""} ;
      P04XD3_A3868AlbMat = new String[] {""} ;
      P04XD3_A2242AlbSec = new String[] {""} ;
      P04XD3_A7098AlbUsu = new String[] {""} ;
      P04XD3_A7162AlbDesp = new int[1] ;
      P04XD3_A1879AlbProEnt = new String[] {""} ;
      P04XD3_n1879AlbProEnt = new boolean[] {false} ;
      P04XD3_A33AlbProEst = new byte[1] ;
      P04XD3_A1782AlbProEso = new byte[1] ;
      P04XD3_A3865AlbHorSal = new String[] {""} ;
      P04XD3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A3868AlbMat = "" ;
      A2242AlbSec = "" ;
      A7098AlbUsu = "" ;
      A1879AlbProEnt = "" ;
      A3865AlbHorSal = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P04XD4_A953IvaCod = new String[] {""} ;
      P04XD4_n953IvaCod = new boolean[] {false} ;
      A953IvaCod = "" ;
      P04XD5_A588IvaPor = new byte[1] ;
      P04XD5_n588IvaPor = new boolean[] {false} ;
      P04XD6_A841TrnNom = new String[] {""} ;
      P04XD6_n841TrnNom = new boolean[] {false} ;
      A841TrnNom = "" ;
      P04XD7_A4828CliCp2 = new String[] {""} ;
      P04XD7_n4828CliCp2 = new boolean[] {false} ;
      P04XD7_A256CliCp = new String[] {""} ;
      P04XD7_n256CliCp = new boolean[] {false} ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      AV29Prioridad = "" ;
      AV65AlbMat = "" ;
      AV66AlbHorSal = "" ;
      AV100TrnNom = "" ;
      AV69Cp_1_2 = "" ;
      AV78AlbSec = "" ;
      AV93AlbUsu = "" ;
      P04XD8_A850UsurCod = new String[] {""} ;
      P04XD8_A854UsurNom = new String[] {""} ;
      P04XD8_n854UsurNom = new boolean[] {false} ;
      A850UsurCod = "" ;
      A854UsurNom = "" ;
      AV98usurnom = "" ;
      AV95Openom = "" ;
      P04XD9_A396EmprCod = new String[] {""} ;
      P04XD9_A652OpeCod = new int[1] ;
      P04XD9_A653OpeNom = new String[] {""} ;
      P04XD9_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV59vObs = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV59vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P04XD10_A396EmprCod = new String[] {""} ;
      P04XD10_A30AlbProCod = new long[1] ;
      P04XD10_A916AlbPObs = new String[] {""} ;
      P04XD10_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      AV89Despacho = "" ;
      AV52Matricula = "" ;
      AV81BarFasExt = "" ;
      AV54TotKgs = DecimalUtil.ZERO ;
      P04XD11_A396EmprCod = new String[] {""} ;
      P04XD11_A30AlbProCod = new long[1] ;
      P04XD11_A130BarCodPar = new String[] {""} ;
      P04XD11_A132BarCodReo = new byte[1] ;
      P04XD11_A129BarCod = new int[1] ;
      P04XD11_A361DisCod = new int[1] ;
      P04XD11_A136BarColNum = new int[1] ;
      P04XD11_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XD11_A1235BarNumCli = new int[1] ;
      P04XD11_A1234BarNomCli = new String[] {""} ;
      P04XD11_A1652BarSerDsc = new String[] {""} ;
      P04XD11_A135BarColNom = new String[] {""} ;
      P04XD11_A5293BarCodBan = new String[] {""} ;
      P04XD11_A4812BarEncCli = new String[] {""} ;
      P04XD11_A212BarSer = new String[] {""} ;
      P04XD11_A4609BarMdlCod = new String[] {""} ;
      P04XD11_A1265BarAlbPie = new int[1] ;
      P04XD11_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XD11_A182BarMat = new String[] {""} ;
      P04XD11_A4459BarCruEnr = new String[] {""} ;
      P04XD11_A217BarTipArt = new short[1] ;
      P04XD11_n217BarTipArt = new boolean[] {false} ;
      P04XD11_A339DisArtLar = new String[] {""} ;
      P04XD11_A1458BarAlbBul = new short[1] ;
      P04XD11_A6467BarAlbPlas = new short[1] ;
      P04XD11_A1266BarAlbTub = new int[1] ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A5293BarCodBan = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A4609BarMdlCod = "" ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A182BarMat = "" ;
      A4459BarCruEnr = "" ;
      A339DisArtLar = "" ;
      AV55Hdr = "" ;
      AV56KgsE = DecimalUtil.ZERO ;
      AV62Color_cli = "" ;
      AV63SerDsc_1 = "" ;
      AV118Col8 = "" ;
      AV85ProDsc = "" ;
      P04XD12_A396EmprCod = new String[] {""} ;
      P04XD12_A129BarCod = new int[1] ;
      P04XD12_A132BarCodReo = new byte[1] ;
      P04XD12_A130BarCodPar = new String[] {""} ;
      P04XD12_A761ProFasLin = new short[1] ;
      P04XD12_n761ProFasLin = new boolean[] {false} ;
      P04XD12_A4628ProDsc2 = new String[] {""} ;
      P04XD12_A758ProCod = new String[] {""} ;
      A4628ProDsc2 = "" ;
      A758ProCod = "" ;
      AV97Procod = "" ;
      AV77v_linea = "" ;
      AV90Barenccli = "" ;
      AV91Barser = "" ;
      AV92BarSerdsc = "" ;
      AV96barmdlcod = "" ;
      AV99Kgs = DecimalUtil.ZERO ;
      AV111Ref = "" ;
      AV112Mf = "" ;
      AV120Tipartdsc = "" ;
      GXv_char1 = new String[1] ;
      AV119Tprda = "" ;
      P04XD13_A396EmprCod = new String[] {""} ;
      P04XD13_A129BarCod = new int[1] ;
      P04XD13_A132BarCodReo = new byte[1] ;
      P04XD13_A130BarCodPar = new String[] {""} ;
      P04XD13_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XD13_A44AlbRecCod = new int[1] ;
      P04XD13_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      P04XD15_A781PrvCod = new short[1] ;
      P04XD15_A396EmprCod = new String[] {""} ;
      P04XD15_A252CliCod = new int[1] ;
      P04XD15_A279CliNom = new String[] {""} ;
      P04XD15_A260CliDom = new String[] {""} ;
      P04XD15_A256CliCp = new String[] {""} ;
      P04XD15_n256CliCp = new boolean[] {false} ;
      P04XD15_A295CliPob = new String[] {""} ;
      P04XD15_A278CliNif = new String[] {""} ;
      P04XD15_A303CliTel1 = new String[] {""} ;
      P04XD15_A787PrvDsc = new String[] {""} ;
      P04XD15_n787PrvDsc = new boolean[] {false} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A303CliTel1 = "" ;
      A787PrvDsc = "" ;
      AV113Clitel1 = "" ;
      AV70PrvDsc = "" ;
      AV30FpgDsc = "" ;
      P04XD16_A497FpgCod = new String[] {""} ;
      P04XD16_A396EmprCod = new String[] {""} ;
      P04XD16_A297CliPri = new String[] {""} ;
      P04XD16_A252CliCod = new int[1] ;
      P04XD16_A498FpgDsc = new String[] {""} ;
      P04XD16_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A297CliPri = "" ;
      A498FpgDsc = "" ;
      P04XD17_A396EmprCod = new String[] {""} ;
      P04XD17_A266CliEnvLin = new byte[1] ;
      P04XD17_A252CliCod = new int[1] ;
      P04XD17_A267CliEnvNom = new String[] {""} ;
      P04XD17_A265CliEnvDom = new String[] {""} ;
      P04XD17_A264CliEnvCp = new String[] {""} ;
      P04XD17_A268CliEnvPob = new String[] {""} ;
      P04XD17_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P04XD18_A781PrvCod = new short[1] ;
      P04XD18_A787PrvDsc = new String[] {""} ;
      P04XD18_n787PrvDsc = new boolean[] {false} ;
      AV42Procenom = "" ;
      AV116Procedom = "" ;
      AV117Procetel1 = "" ;
      P04XD19_A970ProceCod = new short[1] ;
      P04XD19_n970ProceCod = new boolean[] {false} ;
      P04XD19_A396EmprCod = new String[] {""} ;
      P04XD19_A361DisCod = new int[1] ;
      P04XD19_A971ProceNom = new String[] {""} ;
      P04XD19_n971ProceNom = new boolean[] {false} ;
      P04XD19_A994ProceDom = new String[] {""} ;
      P04XD19_n994ProceDom = new boolean[] {false} ;
      P04XD19_A990ProceTel1 = new String[] {""} ;
      P04XD19_n990ProceTel1 = new boolean[] {false} ;
      P04XD19_A44AlbRecCod = new int[1] ;
      A971ProceNom = "" ;
      A994ProceDom = "" ;
      A990ProceTel1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbeliot__default(),
         new Object[] {
             new Object[] {
            P04XD2_A396EmprCod, P04XD2_A407EmprNom, P04XD2_n407EmprNom, P04XD2_A404EmprDir, P04XD2_n404EmprDir, P04XD2_A408EmprPob, P04XD2_n408EmprPob, P04XD2_A409EmprTel, P04XD2_n409EmprTel, P04XD2_A405EmprFax,
            P04XD2_n405EmprFax, P04XD2_A395EmprCif, P04XD2_n395EmprCif
            }
            , new Object[] {
            P04XD3_A1253EmprGuiRem, P04XD3_A840TrnCod, P04XD3_A396EmprCod, P04XD3_A30AlbProCod, P04XD3_A1243GuiRemCli, P04XD3_A1259AlbDomEnv, P04XD3_n1259AlbDomEnv, P04XD3_A39AlbProPri, P04XD3_A3868AlbMat, P04XD3_A2242AlbSec,
            P04XD3_A7098AlbUsu, P04XD3_A7162AlbDesp, P04XD3_A1879AlbProEnt, P04XD3_n1879AlbProEnt, P04XD3_A33AlbProEst, P04XD3_A1782AlbProEso, P04XD3_A3865AlbHorSal, P04XD3_A34AlbProfch
            }
            , new Object[] {
            P04XD4_A953IvaCod, P04XD4_n953IvaCod
            }
            , new Object[] {
            P04XD5_A588IvaPor, P04XD5_n588IvaPor
            }
            , new Object[] {
            P04XD6_A841TrnNom, P04XD6_n841TrnNom
            }
            , new Object[] {
            P04XD7_A4828CliCp2, P04XD7_n4828CliCp2, P04XD7_A256CliCp, P04XD7_n256CliCp
            }
            , new Object[] {
            P04XD8_A850UsurCod, P04XD8_A854UsurNom, P04XD8_n854UsurNom
            }
            , new Object[] {
            P04XD9_A396EmprCod, P04XD9_A652OpeCod, P04XD9_A653OpeNom, P04XD9_n653OpeNom
            }
            , new Object[] {
            P04XD10_A396EmprCod, P04XD10_A30AlbProCod, P04XD10_A916AlbPObs, P04XD10_A915AlbPObsLin
            }
            , new Object[] {
            P04XD11_A396EmprCod, P04XD11_A30AlbProCod, P04XD11_A130BarCodPar, P04XD11_A132BarCodReo, P04XD11_A129BarCod, P04XD11_A361DisCod, P04XD11_A136BarColNum, P04XD11_A1261BarAlbKgmE, P04XD11_A1235BarNumCli, P04XD11_A1234BarNomCli,
            P04XD11_A1652BarSerDsc, P04XD11_A135BarColNom, P04XD11_A5293BarCodBan, P04XD11_A4812BarEncCli, P04XD11_A212BarSer, P04XD11_A4609BarMdlCod, P04XD11_A1265BarAlbPie, P04XD11_A1264BarPreMtr, P04XD11_A182BarMat, P04XD11_A4459BarCruEnr,
            P04XD11_A217BarTipArt, P04XD11_n217BarTipArt, P04XD11_A339DisArtLar, P04XD11_A1458BarAlbBul, P04XD11_A6467BarAlbPlas, P04XD11_A1266BarAlbTub
            }
            , new Object[] {
            P04XD12_A396EmprCod, P04XD12_A129BarCod, P04XD12_A132BarCodReo, P04XD12_A130BarCodPar, P04XD12_A761ProFasLin, P04XD12_n761ProFasLin, P04XD12_A4628ProDsc2, P04XD12_A758ProCod
            }
            , new Object[] {
            P04XD13_A396EmprCod, P04XD13_A129BarCod, P04XD13_A132BarCodReo, P04XD13_A130BarCodPar, P04XD13_A203BarPieKil, P04XD13_A44AlbRecCod, P04XD13_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04XD15_A781PrvCod, P04XD15_A396EmprCod, P04XD15_A252CliCod, P04XD15_A279CliNom, P04XD15_A260CliDom, P04XD15_A256CliCp, P04XD15_A295CliPob, P04XD15_A278CliNif, P04XD15_A303CliTel1, P04XD15_A787PrvDsc,
            P04XD15_n787PrvDsc
            }
            , new Object[] {
            P04XD16_A497FpgCod, P04XD16_A396EmprCod, P04XD16_A297CliPri, P04XD16_A252CliCod, P04XD16_A498FpgDsc, P04XD16_n498FpgDsc
            }
            , new Object[] {
            P04XD17_A396EmprCod, P04XD17_A266CliEnvLin, P04XD17_A252CliCod, P04XD17_A267CliEnvNom, P04XD17_A265CliEnvDom, P04XD17_A264CliEnvCp, P04XD17_A268CliEnvPob, P04XD17_A270CliEnvPrv
            }
            , new Object[] {
            P04XD18_A781PrvCod, P04XD18_A787PrvDsc, P04XD18_n787PrvDsc
            }
            , new Object[] {
            P04XD19_A970ProceCod, P04XD19_n970ProceCod, P04XD19_A396EmprCod, P04XD19_A361DisCod, P04XD19_A971ProceNom, P04XD19_n971ProceNom, P04XD19_A994ProceDom, P04XD19_n994ProceDom, P04XD19_A990ProceTel1, P04XD19_n990ProceTel1,
            P04XD19_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV68Flag_tubos ;
   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte A588IvaPor ;
   private byte AV22CliEnvDom ;
   private byte AV73CliPagLin ;
   private byte AV64IvaPor ;
   private byte AV58i ;
   private byte A915AlbPObsLin ;
   private byte AV48ContLine ;
   private byte A132BarCodReo ;
   private byte AV76Flag_tp ;
   private byte A266CliEnvLin ;
   private short AV122bARalBbUL ;
   private short AV124BarAlbPlas ;
   private short A840TrnCod ;
   private short A217BarTipArt ;
   private short A1458BarAlbBul ;
   private short A6467BarAlbPlas ;
   private short A761ProFasLin ;
   private short AV121Totmf ;
   private short A781PrvCod ;
   private short A270CliEnvPrv ;
   private short AV71CodPrv ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV123BarALbTub ;
   private int A1243GuiRemCli ;
   private int A7162AlbDesp ;
   private int AV16CliCod ;
   private int AV94AlbDesp ;
   private int A652OpeCod ;
   private int GX_I ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int AV37DisCod ;
   private int AV50barcolnum ;
   private int AV101Tot_u ;
   private int AV109PrecioUn ;
   private int A44AlbRecCod ;
   private int AV44AlbRecCod ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private long AV110Imp ;
   private long AV114TotV ;
   private java.math.BigDecimal AV54TotKgs ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal AV56KgsE ;
   private java.math.BigDecimal AV99Kgs ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV51TextoCopia ;
   private String Gx_out ;
   private String AV60ContDsc ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A395EmprCif ;
   private String AV21EmprNom ;
   private String AV103EmprDir ;
   private String AV104EmprPob ;
   private String AV105EmprTel ;
   private String AV106EmprFax ;
   private String AV107EmprCif ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A3868AlbMat ;
   private String A2242AlbSec ;
   private String A7098AlbUsu ;
   private String A1879AlbProEnt ;
   private String A3865AlbHorSal ;
   private String A953IvaCod ;
   private String A841TrnNom ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String AV29Prioridad ;
   private String AV65AlbMat ;
   private String AV66AlbHorSal ;
   private String AV100TrnNom ;
   private String AV69Cp_1_2 ;
   private String AV78AlbSec ;
   private String AV93AlbUsu ;
   private String A850UsurCod ;
   private String A854UsurNom ;
   private String AV98usurnom ;
   private String AV95Openom ;
   private String A653OpeNom ;
   private String AV59vObs[] ;
   private String A916AlbPObs ;
   private String AV89Despacho ;
   private String AV52Matricula ;
   private String AV81BarFasExt ;
   private String A130BarCodPar ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A5293BarCodBan ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A4609BarMdlCod ;
   private String A182BarMat ;
   private String A4459BarCruEnr ;
   private String A339DisArtLar ;
   private String AV55Hdr ;
   private String AV62Color_cli ;
   private String AV63SerDsc_1 ;
   private String AV118Col8 ;
   private String AV85ProDsc ;
   private String A4628ProDsc2 ;
   private String A758ProCod ;
   private String AV97Procod ;
   private String AV77v_linea ;
   private String AV90Barenccli ;
   private String AV91Barser ;
   private String AV92BarSerdsc ;
   private String AV96barmdlcod ;
   private String AV111Ref ;
   private String AV112Mf ;
   private String AV120Tipartdsc ;
   private String GXv_char1[] ;
   private String AV119Tprda ;
   private String A200BarPieCod ;
   private String AV17CliNom ;
   private String AV18CliDom ;
   private String AV19Clicp ;
   private String AV20CliPob ;
   private String AV47CliNif ;
   private String AV23CliENom ;
   private String AV24CliEDom ;
   private String AV25CliEcp ;
   private String AV26CliEPob ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A303CliTel1 ;
   private String A787PrvDsc ;
   private String AV113Clitel1 ;
   private String AV70PrvDsc ;
   private String AV30FpgDsc ;
   private String A497FpgCod ;
   private String A297CliPri ;
   private String A498FpgDsc ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String AV42Procenom ;
   private String AV116Procedom ;
   private String AV117Procetel1 ;
   private String A971ProceNom ;
   private String A994ProceDom ;
   private String A990ProceTel1 ;
   private java.util.Date A34AlbProfch ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n395EmprCif ;
   private boolean GxHdr3 ;
   private boolean n1259AlbDomEnv ;
   private boolean n1879AlbProEnt ;
   private boolean n953IvaCod ;
   private boolean n588IvaPor ;
   private boolean n841TrnNom ;
   private boolean n4828CliCp2 ;
   private boolean n256CliCp ;
   private boolean n854UsurNom ;
   private boolean n653OpeNom ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n761ProFasLin ;
   private boolean n787PrvDsc ;
   private boolean n498FpgDsc ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n994ProceDom ;
   private boolean n990ProceTel1 ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04XD2_A396EmprCod ;
   private String[] P04XD2_A407EmprNom ;
   private boolean[] P04XD2_n407EmprNom ;
   private String[] P04XD2_A404EmprDir ;
   private boolean[] P04XD2_n404EmprDir ;
   private String[] P04XD2_A408EmprPob ;
   private boolean[] P04XD2_n408EmprPob ;
   private String[] P04XD2_A409EmprTel ;
   private boolean[] P04XD2_n409EmprTel ;
   private String[] P04XD2_A405EmprFax ;
   private boolean[] P04XD2_n405EmprFax ;
   private String[] P04XD2_A395EmprCif ;
   private boolean[] P04XD2_n395EmprCif ;
   private String[] P04XD3_A1253EmprGuiRem ;
   private short[] P04XD3_A840TrnCod ;
   private String[] P04XD3_A396EmprCod ;
   private long[] P04XD3_A30AlbProCod ;
   private int[] P04XD3_A1243GuiRemCli ;
   private byte[] P04XD3_A1259AlbDomEnv ;
   private boolean[] P04XD3_n1259AlbDomEnv ;
   private String[] P04XD3_A39AlbProPri ;
   private String[] P04XD3_A3868AlbMat ;
   private String[] P04XD3_A2242AlbSec ;
   private String[] P04XD3_A7098AlbUsu ;
   private int[] P04XD3_A7162AlbDesp ;
   private String[] P04XD3_A1879AlbProEnt ;
   private boolean[] P04XD3_n1879AlbProEnt ;
   private byte[] P04XD3_A33AlbProEst ;
   private byte[] P04XD3_A1782AlbProEso ;
   private String[] P04XD3_A3865AlbHorSal ;
   private java.util.Date[] P04XD3_A34AlbProfch ;
   private String[] P04XD4_A953IvaCod ;
   private boolean[] P04XD4_n953IvaCod ;
   private byte[] P04XD5_A588IvaPor ;
   private boolean[] P04XD5_n588IvaPor ;
   private String[] P04XD6_A841TrnNom ;
   private boolean[] P04XD6_n841TrnNom ;
   private String[] P04XD7_A4828CliCp2 ;
   private boolean[] P04XD7_n4828CliCp2 ;
   private String[] P04XD7_A256CliCp ;
   private boolean[] P04XD7_n256CliCp ;
   private String[] P04XD8_A850UsurCod ;
   private String[] P04XD8_A854UsurNom ;
   private boolean[] P04XD8_n854UsurNom ;
   private String[] P04XD9_A396EmprCod ;
   private int[] P04XD9_A652OpeCod ;
   private String[] P04XD9_A653OpeNom ;
   private boolean[] P04XD9_n653OpeNom ;
   private String[] P04XD10_A396EmprCod ;
   private long[] P04XD10_A30AlbProCod ;
   private String[] P04XD10_A916AlbPObs ;
   private byte[] P04XD10_A915AlbPObsLin ;
   private String[] P04XD11_A396EmprCod ;
   private long[] P04XD11_A30AlbProCod ;
   private String[] P04XD11_A130BarCodPar ;
   private byte[] P04XD11_A132BarCodReo ;
   private int[] P04XD11_A129BarCod ;
   private int[] P04XD11_A361DisCod ;
   private int[] P04XD11_A136BarColNum ;
   private java.math.BigDecimal[] P04XD11_A1261BarAlbKgmE ;
   private int[] P04XD11_A1235BarNumCli ;
   private String[] P04XD11_A1234BarNomCli ;
   private String[] P04XD11_A1652BarSerDsc ;
   private String[] P04XD11_A135BarColNom ;
   private String[] P04XD11_A5293BarCodBan ;
   private String[] P04XD11_A4812BarEncCli ;
   private String[] P04XD11_A212BarSer ;
   private String[] P04XD11_A4609BarMdlCod ;
   private int[] P04XD11_A1265BarAlbPie ;
   private java.math.BigDecimal[] P04XD11_A1264BarPreMtr ;
   private String[] P04XD11_A182BarMat ;
   private String[] P04XD11_A4459BarCruEnr ;
   private short[] P04XD11_A217BarTipArt ;
   private boolean[] P04XD11_n217BarTipArt ;
   private String[] P04XD11_A339DisArtLar ;
   private short[] P04XD11_A1458BarAlbBul ;
   private short[] P04XD11_A6467BarAlbPlas ;
   private int[] P04XD11_A1266BarAlbTub ;
   private String[] P04XD12_A396EmprCod ;
   private int[] P04XD12_A129BarCod ;
   private byte[] P04XD12_A132BarCodReo ;
   private String[] P04XD12_A130BarCodPar ;
   private short[] P04XD12_A761ProFasLin ;
   private boolean[] P04XD12_n761ProFasLin ;
   private String[] P04XD12_A4628ProDsc2 ;
   private String[] P04XD12_A758ProCod ;
   private String[] P04XD13_A396EmprCod ;
   private int[] P04XD13_A129BarCod ;
   private byte[] P04XD13_A132BarCodReo ;
   private String[] P04XD13_A130BarCodPar ;
   private java.math.BigDecimal[] P04XD13_A203BarPieKil ;
   private int[] P04XD13_A44AlbRecCod ;
   private String[] P04XD13_A200BarPieCod ;
   private short[] P04XD15_A781PrvCod ;
   private String[] P04XD15_A396EmprCod ;
   private int[] P04XD15_A252CliCod ;
   private String[] P04XD15_A279CliNom ;
   private String[] P04XD15_A260CliDom ;
   private String[] P04XD15_A256CliCp ;
   private boolean[] P04XD15_n256CliCp ;
   private String[] P04XD15_A295CliPob ;
   private String[] P04XD15_A278CliNif ;
   private String[] P04XD15_A303CliTel1 ;
   private String[] P04XD15_A787PrvDsc ;
   private boolean[] P04XD15_n787PrvDsc ;
   private String[] P04XD16_A497FpgCod ;
   private String[] P04XD16_A396EmprCod ;
   private String[] P04XD16_A297CliPri ;
   private int[] P04XD16_A252CliCod ;
   private String[] P04XD16_A498FpgDsc ;
   private boolean[] P04XD16_n498FpgDsc ;
   private String[] P04XD17_A396EmprCod ;
   private byte[] P04XD17_A266CliEnvLin ;
   private int[] P04XD17_A252CliCod ;
   private String[] P04XD17_A267CliEnvNom ;
   private String[] P04XD17_A265CliEnvDom ;
   private String[] P04XD17_A264CliEnvCp ;
   private String[] P04XD17_A268CliEnvPob ;
   private short[] P04XD17_A270CliEnvPrv ;
   private short[] P04XD18_A781PrvCod ;
   private String[] P04XD18_A787PrvDsc ;
   private boolean[] P04XD18_n787PrvDsc ;
   private short[] P04XD19_A970ProceCod ;
   private boolean[] P04XD19_n970ProceCod ;
   private String[] P04XD19_A396EmprCod ;
   private int[] P04XD19_A361DisCod ;
   private String[] P04XD19_A971ProceNom ;
   private boolean[] P04XD19_n971ProceNom ;
   private String[] P04XD19_A994ProceDom ;
   private boolean[] P04XD19_n994ProceDom ;
   private String[] P04XD19_A990ProceTel1 ;
   private boolean[] P04XD19_n990ProceTel1 ;
   private int[] P04XD19_A44AlbRecCod ;
}

final  class palbeliot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04XD2", "SELECT EmprCod, EmprNom, EmprDir, EmprPob, EmprTel, EmprFax, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD3", "SELECT EmprGuiRem, TrnCod, EmprCod, AlbProCod, GuiRemCli, AlbDomEnv, AlbProPri, AlbMat, AlbSec, AlbUsu, AlbDesp, AlbProEnt, AlbProEst, AlbProEso, AlbHorSal, AlbProfch FROM TXPCALPRD WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?)  FOR UPDATE OF AlbProEst, AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD4", "SELECT IvaCod FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD5", "SELECT IvaPor FROM TXPTIPIVA WHERE IvaCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD6", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD7", "SELECT CliCp2, CliCp FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD8", "SELECT UsurCod, UsurNom FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD9", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD10", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04XD11", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisCod, T2.BarColNum, T1.BarAlbKgmE, T2.BarNumCli, T2.BarNomCli, T2.BarSerDsc, T2.BarColNom, T2.BarCodBan, T2.BarEncCli, T2.BarSer, T2.BarMdlCod, T1.BarAlbPie, T1.BarPreMtr, T2.BarMat, T2.BarCruEnr, T2.BarTipArt, T3.DisArtLar, T1.BarAlbBul, T1.BarAlbPlas, T1.BarAlbTub FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04XD12", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProFasLin, T2.ProDsc2, T1.ProCod FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04XD13", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04XD14", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P04XD15", "SELECT T1.PrvCod, T1.EmprCod, T1.CliCod, T1.CliNom, T1.CliDom, T1.CliCp, T1.CliPob, T1.CliNif, T1.CliTel1, T2.PrvDsc FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD16", "SELECT T1.FpgCod, T1.EmprCod, T1.CliPri, T1.CliCod, T2.FpgDsc FROM (TXPCLIFPG T1 INNER JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod = T1.FpgCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliPri = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD17", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD18", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XD19", "SELECT T2.ProceCod, T1.EmprCod, T1.DisCod, T3.ProceNom, T3.ProceDom, T3.ProceTel1, T1.AlbRecCod FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 8);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 15);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getString(16, 13);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((String[]) buf[18])[0] = rslt.getString(19, 16);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(22, 10);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((short[]) buf[24])[0] = rslt.getShort(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 100);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 15);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 34);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

