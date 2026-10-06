package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class palbsup extends GXReport
{
   public palbsup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbsup.class ), "" );
   }

   public palbsup( int remoteHandle ,
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
      palbsup.this.aP4 = new String[] {""};
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
      palbsup.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbsup.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbsup.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      palbsup.this.AV51TextoCopia = aP3[0];
      this.aP3 = aP3;
      palbsup.this.Gx_out = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 10 ;
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
         getPrinter().GxSetDocName("DESPACHO SUPREMA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*10)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV60ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBSUP", ""), GXv_char1) ;
         palbsup.this.AV60ContDsc = GXv_char1[0] ;
         GXt_int2 = AV108Activo_p ;
         GXv_int3[0] = GXt_int2 ;
         new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPPAR", ""), GXv_int3) ;
         palbsup.this.GXt_int2 = GXv_int3[0] ;
         AV108Activo_p = (byte)(GXt_int2) ;
         AV21EmprNom = httpContext.getMessage( "INVERSIONES S&F S.A.", "") ;
         AV103EmprDir = httpContext.getMessage( "CALLE 28 No. 44-53", "") ;
         AV104EmprPob = httpContext.getMessage( "MEDELLIN-COLOMBIA", "") ;
         AV105EmprTel = "2618800" ;
         AV106EmprFax = "2323378" ;
         AV107EmprCif = "800.247.649-2" ;
         if ( AV108Activo_p == 1 )
         {
            /* Using cursor P02R12 */
            pr_default.execute(0, new Object[] {A396EmprCod});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A407EmprNom = P02R12_A407EmprNom[0] ;
               n407EmprNom = P02R12_n407EmprNom[0] ;
               A404EmprDir = P02R12_A404EmprDir[0] ;
               n404EmprDir = P02R12_n404EmprDir[0] ;
               A408EmprPob = P02R12_A408EmprPob[0] ;
               n408EmprPob = P02R12_n408EmprPob[0] ;
               A409EmprTel = P02R12_A409EmprTel[0] ;
               n409EmprTel = P02R12_n409EmprTel[0] ;
               A405EmprFax = P02R12_A405EmprFax[0] ;
               n405EmprFax = P02R12_n405EmprFax[0] ;
               A395EmprCif = P02R12_A395EmprCif[0] ;
               n395EmprCif = P02R12_n395EmprCif[0] ;
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
         }
         AV68Flag_tubos = (byte)(0) ;
         GxHdr3 = true ;
         /* Using cursor P02R13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1253EmprGuiRem = P02R13_A1253EmprGuiRem[0] ;
            A840TrnCod = P02R13_A840TrnCod[0] ;
            A1243GuiRemCli = P02R13_A1243GuiRemCli[0] ;
            A1259AlbDomEnv = P02R13_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P02R13_n1259AlbDomEnv[0] ;
            A39AlbProPri = P02R13_A39AlbProPri[0] ;
            A3868AlbMat = P02R13_A3868AlbMat[0] ;
            A2242AlbSec = P02R13_A2242AlbSec[0] ;
            A7098AlbUsu = P02R13_A7098AlbUsu[0] ;
            A7162AlbDesp = P02R13_A7162AlbDesp[0] ;
            A1879AlbProEnt = P02R13_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P02R13_n1879AlbProEnt[0] ;
            A33AlbProEst = P02R13_A33AlbProEst[0] ;
            A1782AlbProEso = P02R13_A1782AlbProEso[0] ;
            A3865AlbHorSal = P02R13_A3865AlbHorSal[0] ;
            A34AlbProfch = P02R13_A34AlbProfch[0] ;
            /* Using cursor P02R14 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A953IvaCod = P02R14_A953IvaCod[0] ;
            n953IvaCod = P02R14_n953IvaCod[0] ;
            /* Using cursor P02R15 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
            A588IvaPor = P02R15_A588IvaPor[0] ;
            n588IvaPor = P02R15_n588IvaPor[0] ;
            /* Using cursor P02R16 */
            pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
            A841TrnNom = P02R16_A841TrnNom[0] ;
            n841TrnNom = P02R16_n841TrnNom[0] ;
            /* Using cursor P02R17 */
            pr_default.execute(5, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
            A4828CliCp2 = P02R17_A4828CliCp2[0] ;
            n4828CliCp2 = P02R17_n4828CliCp2[0] ;
            A256CliCp = P02R17_A256CliCp[0] ;
            n256CliCp = P02R17_n256CliCp[0] ;
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
            /* Using cursor P02R18 */
            pr_default.execute(6, new Object[] {AV93AlbUsu});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A850UsurCod = P02R18_A850UsurCod[0] ;
               A854UsurNom = P02R18_A854UsurNom[0] ;
               n854UsurNom = P02R18_n854UsurNom[0] ;
               AV98usurnom = A854UsurNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
            AV94AlbDesp = A7162AlbDesp ;
            AV95Openom = " " ;
            /* Using cursor P02R19 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV94AlbDesp)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A652OpeCod = P02R19_A652OpeCod[0] ;
               A653OpeNom = P02R19_A653OpeNom[0] ;
               n653OpeNom = P02R19_n653OpeNom[0] ;
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
            /* Using cursor P02R110 */
            pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A916AlbPObs = P02R110_A916AlbPObs[0] ;
               A915AlbPObsLin = P02R110_A915AlbPObsLin[0] ;
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
            /* Using cursor P02R111 */
            pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A339DisArtLar = P02R111_A339DisArtLar[0] ;
               A143BarDisNum = P02R111_A143BarDisNum[0] ;
               A118BarAcaQui = P02R111_A118BarAcaQui[0] ;
               A130BarCodPar = P02R111_A130BarCodPar[0] ;
               A132BarCodReo = P02R111_A132BarCodReo[0] ;
               A129BarCod = P02R111_A129BarCod[0] ;
               A361DisCod = P02R111_A361DisCod[0] ;
               A136BarColNum = P02R111_A136BarColNum[0] ;
               A1261BarAlbKgmE = P02R111_A1261BarAlbKgmE[0] ;
               A1235BarNumCli = P02R111_A1235BarNumCli[0] ;
               A1234BarNomCli = P02R111_A1234BarNomCli[0] ;
               A1652BarSerDsc = P02R111_A1652BarSerDsc[0] ;
               A2441AlbHdrObs = P02R111_A2441AlbHdrObs[0] ;
               A5293BarCodBan = P02R111_A5293BarCodBan[0] ;
               A4812BarEncCli = P02R111_A4812BarEncCli[0] ;
               A2836BarPle2 = P02R111_A2836BarPle2[0] ;
               A212BarSer = P02R111_A212BarSer[0] ;
               A4609BarMdlCod = P02R111_A4609BarMdlCod[0] ;
               A1265BarAlbPie = P02R111_A1265BarAlbPie[0] ;
               A135BarColNom = P02R111_A135BarColNom[0] ;
               A143BarDisNum = P02R111_A143BarDisNum[0] ;
               A118BarAcaQui = P02R111_A118BarAcaQui[0] ;
               A361DisCod = P02R111_A361DisCod[0] ;
               A136BarColNum = P02R111_A136BarColNum[0] ;
               A1235BarNumCli = P02R111_A1235BarNumCli[0] ;
               A1234BarNomCli = P02R111_A1234BarNomCli[0] ;
               A1652BarSerDsc = P02R111_A1652BarSerDsc[0] ;
               A5293BarCodBan = P02R111_A5293BarCodBan[0] ;
               A4812BarEncCli = P02R111_A4812BarEncCli[0] ;
               A2836BarPle2 = P02R111_A2836BarPle2[0] ;
               A212BarSer = P02R111_A212BarSer[0] ;
               A4609BarMdlCod = P02R111_A4609BarMdlCod[0] ;
               A135BarColNom = P02R111_A135BarColNom[0] ;
               A339DisArtLar = P02R111_A339DisArtLar[0] ;
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
                  pr_default.close(9);
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
               AV85ProDsc = "" ;
               /* Using cursor P02R112 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A4628ProDsc2 = P02R112_A4628ProDsc2[0] ;
                  A758ProCod = P02R112_A758ProCod[0] ;
                  n758ProCod = P02R112_n758ProCod[0] ;
                  A1468AlbPrdLin = P02R112_A1468AlbPrdLin[0] ;
                  A4628ProDsc2 = P02R112_A4628ProDsc2[0] ;
                  AV97Procod = A758ProCod ;
                  AV85ProDsc = GXutil.substring( A4628ProDsc2, 1, 40) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(10);
               }
               pr_default.close(10);
               if ( GXutil.strcmp(A2441AlbHdrObs, " ") != 0 )
               {
                  AV97Procod = GXutil.substring( A2441AlbHdrObs, 1, 8) ;
               }
               if ( GXutil.strcmp(A5293BarCodBan, " ") != 0 )
               {
                  AV97Procod = GXutil.substring( A5293BarCodBan, 1, 8) ;
               }
               AV76Flag_tp = (byte)(0) ;
               AV77v_linea = GXutil.space( (short)(103)) ;
               if ( GXutil.strcmp(A4812BarEncCli, "") == 0 )
               {
                  AV90Barenccli = GXutil.substring( A2836BarPle2, 1, 20) ;
               }
               else
               {
                  AV90Barenccli = GXutil.substring( A4812BarEncCli, 1, 12) ;
               }
               AV91Barser = GXutil.substring( A212BarSer, 1, 10) ;
               AV92BarSerdsc = GXutil.substring( A1652BarSerDsc, 1, 20) ;
               AV96barmdlcod = GXutil.substring( A4609BarMdlCod, 1, 5) ;
               AV99Kgs = A1261BarAlbKgmE ;
               AV101Tot_u = (int)(AV101Tot_u+A1265BarAlbPie) ;
               h2R10( false, 16) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 10, Gx_line+0, 69, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV99Kgs, "ZZ9.99")), 126, Gx_line+0, 171, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 74, Gx_line+0, 119, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 178, Gx_line+0, 274, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Barenccli, "")), 282, Gx_line+0, 422, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96barmdlcod, "")), 569, Gx_line+0, 606, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Procod, "")), 423, Gx_line+0, 482, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92BarSerdsc, "")), 486, Gx_line+0, 560, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A118BarAcaQui, "")), 611, Gx_line+0, 656, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 664, Gx_line+0, 723, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A339DisArtLar, "")), 729, Gx_line+0, 803, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               /* Using cursor P02R113 */
               pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(11) != 101) )
               {
                  A457FasCod = P02R113_A457FasCod[0] ;
                  A1276FasMtr = P02R113_A1276FasMtr[0] ;
                  A1275FasKgm = P02R113_A1275FasKgm[0] ;
                  A460FasDsc = P02R113_A460FasDsc[0] ;
                  A1240GuiFasLin = P02R113_A1240GuiFasLin[0] ;
                  A460FasDsc = P02R113_A460FasDsc[0] ;
                  AV102FasMtr = (int)(DecimalUtil.decToDouble(A1276FasMtr)) ;
                  AV99Kgs = A1275FasKgm ;
                  h2R10( false, 16) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 10, Gx_line+0, 69, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV99Kgs, "ZZ9.99")), 126, Gx_line+0, 171, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV102FasMtr), "ZZZZZ9")), 74, Gx_line+0, 119, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A118BarAcaQui, "")), 611, Gx_line+1, 656, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 664, Gx_line+1, 723, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A339DisArtLar, "")), 729, Gx_line+1, 803, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 281, Gx_line+0, 486, Gx_line+16, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
                  pr_default.readNext(11);
               }
               pr_default.close(11);
               pr_default.readNext(9);
            }
            pr_default.close(9);
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            h2R10( false, 196) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones:", ""), 44, Gx_line+66, 125, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[1-1], "")), 128, Gx_line+66, 389, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[2-1], "")), 128, Gx_line+82, 389, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(35, Gx_line+59, 745, Gx_line+170, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TextoCopia, "")), 35, Gx_line+175, 114, Gx_line+191, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página", ""), 663, Gx_line+175, 697, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 708, Gx_line+175, 747, Gx_line+191, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ELABORADO", ""), 45, Gx_line+153, 114, Gx_line+168, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DESPACHO", ""), 449, Gx_line+153, 507, Gx_line+168, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98usurnom, "")), 124, Gx_line+153, 307, Gx_line+169, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95Openom, "")), 519, Gx_line+153, 676, Gx_line+169, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[3-1], "")), 128, Gx_line+99, 389, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[4-1], "")), 128, Gx_line+116, 389, Gx_line+132, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[5-1], "")), 128, Gx_line+132, 389, Gx_line+148, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV101Tot_u), "ZZZZZ9")), 74, Gx_line+15, 119, Gx_line+31, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 33, Gx_line+15, 61, Gx_line+30, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+196) ;
            /* Using cursor P02R114 */
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
         h2R10( true, 0) ;
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
      /* Using cursor P02R115 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A781PrvCod = P02R115_A781PrvCod[0] ;
         A252CliCod = P02R115_A252CliCod[0] ;
         A279CliNom = P02R115_A279CliNom[0] ;
         A260CliDom = P02R115_A260CliDom[0] ;
         A256CliCp = P02R115_A256CliCp[0] ;
         n256CliCp = P02R115_n256CliCp[0] ;
         A295CliPob = P02R115_A295CliPob[0] ;
         A278CliNif = P02R115_A278CliNif[0] ;
         A787PrvDsc = P02R115_A787PrvDsc[0] ;
         n787PrvDsc = P02R115_n787PrvDsc[0] ;
         A787PrvDsc = P02R115_A787PrvDsc[0] ;
         n787PrvDsc = P02R115_n787PrvDsc[0] ;
         AV17CliNom = A279CliNom ;
         AV18CliDom = A260CliDom ;
         AV19Clicp = A256CliCp ;
         AV20CliPob = A295CliPob ;
         AV47CliNif = A278CliNif ;
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
      /* Using cursor P02R116 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV29Prioridad});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A497FpgCod = P02R116_A497FpgCod[0] ;
         A297CliPri = P02R116_A297CliPri[0] ;
         A252CliCod = P02R116_A252CliCod[0] ;
         A498FpgDsc = P02R116_A498FpgDsc[0] ;
         n498FpgDsc = P02R116_n498FpgDsc[0] ;
         A498FpgDsc = P02R116_A498FpgDsc[0] ;
         n498FpgDsc = P02R116_n498FpgDsc[0] ;
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
      /* Using cursor P02R117 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV22CliEnvDom)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A266CliEnvLin = P02R117_A266CliEnvLin[0] ;
         A252CliCod = P02R117_A252CliCod[0] ;
         A267CliEnvNom = P02R117_A267CliEnvNom[0] ;
         A265CliEnvDom = P02R117_A265CliEnvDom[0] ;
         A264CliEnvCp = P02R117_A264CliEnvCp[0] ;
         A268CliEnvPob = P02R117_A268CliEnvPob[0] ;
         A270CliEnvPrv = P02R117_A270CliEnvPrv[0] ;
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
      /* Using cursor P02R118 */
      pr_default.execute(16, new Object[] {Short.valueOf(AV71CodPrv)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A781PrvCod = P02R118_A781PrvCod[0] ;
         A787PrvDsc = P02R118_A787PrvDsc[0] ;
         n787PrvDsc = P02R118_n787PrvDsc[0] ;
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
      /* Using cursor P02R119 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(AV37DisCod)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A970ProceCod = P02R119_A970ProceCod[0] ;
         n970ProceCod = P02R119_n970ProceCod[0] ;
         A361DisCod = P02R119_A361DisCod[0] ;
         A971ProceNom = P02R119_A971ProceNom[0] ;
         n971ProceNom = P02R119_n971ProceNom[0] ;
         A44AlbRecCod = P02R119_A44AlbRecCod[0] ;
         A970ProceCod = P02R119_A970ProceCod[0] ;
         n970ProceCod = P02R119_n970ProceCod[0] ;
         A971ProceNom = P02R119_A971ProceNom[0] ;
         n971ProceNom = P02R119_n971ProceNom[0] ;
         AV42Procenom = A971ProceNom ;
         pr_default.readNext(17);
      }
      pr_default.close(17);
   }

   public void h2R10( boolean bFoot ,
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 20, Gx_line+136, 209, Gx_line+154, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 541, Gx_line+160, 594, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 64, Gx_line+159, 190, Gx_line+177, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 541, Gx_line+138, 615, Gx_line+156, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA:", ""), 475, Gx_line+161, 525, Gx_line+178, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIT:", ""), 20, Gx_line+161, 51, Gx_line+179, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIT.", ""), 25, Gx_line+53, 61, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "52e9855d-9423-4e91-b69e-371d54b49a28", "", context.getHttpContext().getTheme( )), 589, Gx_line+30, 758, Gx_line+66) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 18, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Despacho, "")), 582, Gx_line+75, 721, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(20, Gx_line+103, 758, Gx_line+103, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REMISION DE MERCANCIA", ""), 475, Gx_line+109, 732, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº:", ""), 475, Gx_line+134, 506, Gx_line+159, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "HORA:", ""), 475, Gx_line+180, 519, Gx_line+197, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), 541, Gx_line+180, 650, Gx_line+198, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESPACHADO A:", ""), 20, Gx_line+113, 131, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CONFECCIONISTA:", ""), 20, Gx_line+179, 144, Gx_line+196, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.P.", ""), 10, Gx_line+250, 32, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "UND", ""), 81, Gx_line+250, 104, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "KILOS", ""), 136, Gx_line+250, 170, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COLOR", ""), 178, Gx_line+250, 219, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CONTRATO/REF.", ""), 281, Gx_line+250, 368, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO", ""), 423, Gx_line+250, 481, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "E.D.P.", ""), 569, Gx_line+250, 599, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(10, Gx_line+263, 68, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(74, Gx_line+263, 118, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(126, Gx_line+263, 170, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(178, Gx_line+263, 273, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(282, Gx_line+263, 421, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(423, Gx_line+263, 481, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(569, Gx_line+263, 605, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PRENDA", ""), 486, Gx_line+250, 531, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(486, Gx_line+263, 559, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ESTILO", ""), 616, Gx_line+250, 657, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(616, Gx_line+263, 656, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REM.CLI.", ""), 664, Gx_line+250, 714, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(664, Gx_line+263, 722, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OP CLIENTE", ""), 729, Gx_line+250, 795, Gx_line+265, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(729, Gx_line+263, 802, Gx_line+263, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Procenom, "")), 153, Gx_line+179, 342, Gx_line+197, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TRANSPORTADOR:", ""), 20, Gx_line+198, 146, Gx_line+215, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MATRICULA:", ""), 20, Gx_line+217, 103, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65AlbMat, "")), 153, Gx_line+217, 279, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100TrnNom, "")), 153, Gx_line+198, 342, Gx_line+216, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9")), 281, Gx_line+136, 326, Gx_line+154, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107EmprCif, "")), 68, Gx_line+53, 194, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21EmprNom, "")), 25, Gx_line+24, 311, Gx_line+47, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PBX:", ""), 323, Gx_line+45, 348, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FAX:", ""), 323, Gx_line+61, 348, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103EmprDir, "")), 323, Gx_line+29, 506, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104EmprPob, "")), 323, Gx_line+78, 520, Gx_line+93, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105EmprTel, "")), 350, Gx_line+45, 429, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106EmprFax, "")), 351, Gx_line+61, 430, Gx_line+77, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+267) ;
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
      this.aP0[0] = palbsup.this.A396EmprCod;
      this.aP1[0] = palbsup.this.A30AlbProCod;
      this.aP2[0] = palbsup.this.AV15ImpCod;
      this.aP3[0] = palbsup.this.AV51TextoCopia;
      this.aP4[0] = palbsup.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbsup");
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
      GXv_char1 = new String[1] ;
      GXv_int3 = new int[1] ;
      AV21EmprNom = "" ;
      AV103EmprDir = "" ;
      AV104EmprPob = "" ;
      AV105EmprTel = "" ;
      AV106EmprFax = "" ;
      AV107EmprCif = "" ;
      scmdbuf = "" ;
      P02R12_A396EmprCod = new String[] {""} ;
      P02R12_A407EmprNom = new String[] {""} ;
      P02R12_n407EmprNom = new boolean[] {false} ;
      P02R12_A404EmprDir = new String[] {""} ;
      P02R12_n404EmprDir = new boolean[] {false} ;
      P02R12_A408EmprPob = new String[] {""} ;
      P02R12_n408EmprPob = new boolean[] {false} ;
      P02R12_A409EmprTel = new String[] {""} ;
      P02R12_n409EmprTel = new boolean[] {false} ;
      P02R12_A405EmprFax = new String[] {""} ;
      P02R12_n405EmprFax = new boolean[] {false} ;
      P02R12_A395EmprCif = new String[] {""} ;
      P02R12_n395EmprCif = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A395EmprCif = "" ;
      P02R13_A1253EmprGuiRem = new String[] {""} ;
      P02R13_A840TrnCod = new short[1] ;
      P02R13_A396EmprCod = new String[] {""} ;
      P02R13_A30AlbProCod = new long[1] ;
      P02R13_A1243GuiRemCli = new int[1] ;
      P02R13_A1259AlbDomEnv = new byte[1] ;
      P02R13_n1259AlbDomEnv = new boolean[] {false} ;
      P02R13_A39AlbProPri = new String[] {""} ;
      P02R13_A3868AlbMat = new String[] {""} ;
      P02R13_A2242AlbSec = new String[] {""} ;
      P02R13_A7098AlbUsu = new String[] {""} ;
      P02R13_A7162AlbDesp = new int[1] ;
      P02R13_A1879AlbProEnt = new String[] {""} ;
      P02R13_n1879AlbProEnt = new boolean[] {false} ;
      P02R13_A33AlbProEst = new byte[1] ;
      P02R13_A1782AlbProEso = new byte[1] ;
      P02R13_A3865AlbHorSal = new String[] {""} ;
      P02R13_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A3868AlbMat = "" ;
      A2242AlbSec = "" ;
      A7098AlbUsu = "" ;
      A1879AlbProEnt = "" ;
      A3865AlbHorSal = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P02R14_A953IvaCod = new String[] {""} ;
      P02R14_n953IvaCod = new boolean[] {false} ;
      A953IvaCod = "" ;
      P02R15_A588IvaPor = new byte[1] ;
      P02R15_n588IvaPor = new boolean[] {false} ;
      P02R16_A841TrnNom = new String[] {""} ;
      P02R16_n841TrnNom = new boolean[] {false} ;
      A841TrnNom = "" ;
      P02R17_A4828CliCp2 = new String[] {""} ;
      P02R17_n4828CliCp2 = new boolean[] {false} ;
      P02R17_A256CliCp = new String[] {""} ;
      P02R17_n256CliCp = new boolean[] {false} ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      AV29Prioridad = "" ;
      AV65AlbMat = "" ;
      AV66AlbHorSal = "" ;
      AV100TrnNom = "" ;
      AV69Cp_1_2 = "" ;
      AV78AlbSec = "" ;
      AV93AlbUsu = "" ;
      P02R18_A850UsurCod = new String[] {""} ;
      P02R18_A854UsurNom = new String[] {""} ;
      P02R18_n854UsurNom = new boolean[] {false} ;
      A850UsurCod = "" ;
      A854UsurNom = "" ;
      AV98usurnom = "" ;
      AV95Openom = "" ;
      P02R19_A396EmprCod = new String[] {""} ;
      P02R19_A652OpeCod = new int[1] ;
      P02R19_A653OpeNom = new String[] {""} ;
      P02R19_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV59vObs = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV59vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P02R110_A396EmprCod = new String[] {""} ;
      P02R110_A30AlbProCod = new long[1] ;
      P02R110_A916AlbPObs = new String[] {""} ;
      P02R110_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      AV89Despacho = "" ;
      AV52Matricula = "" ;
      AV81BarFasExt = "" ;
      P02R111_A396EmprCod = new String[] {""} ;
      P02R111_A30AlbProCod = new long[1] ;
      P02R111_A339DisArtLar = new String[] {""} ;
      P02R111_A143BarDisNum = new String[] {""} ;
      P02R111_A118BarAcaQui = new String[] {""} ;
      P02R111_A130BarCodPar = new String[] {""} ;
      P02R111_A132BarCodReo = new byte[1] ;
      P02R111_A129BarCod = new int[1] ;
      P02R111_A361DisCod = new int[1] ;
      P02R111_A136BarColNum = new int[1] ;
      P02R111_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02R111_A1235BarNumCli = new int[1] ;
      P02R111_A1234BarNomCli = new String[] {""} ;
      P02R111_A1652BarSerDsc = new String[] {""} ;
      P02R111_A2441AlbHdrObs = new String[] {""} ;
      P02R111_A5293BarCodBan = new String[] {""} ;
      P02R111_A4812BarEncCli = new String[] {""} ;
      P02R111_A2836BarPle2 = new String[] {""} ;
      P02R111_A212BarSer = new String[] {""} ;
      P02R111_A4609BarMdlCod = new String[] {""} ;
      P02R111_A1265BarAlbPie = new int[1] ;
      P02R111_A135BarColNom = new String[] {""} ;
      A339DisArtLar = "" ;
      A143BarDisNum = "" ;
      A118BarAcaQui = "" ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A2441AlbHdrObs = "" ;
      A5293BarCodBan = "" ;
      A4812BarEncCli = "" ;
      A2836BarPle2 = "" ;
      A212BarSer = "" ;
      A4609BarMdlCod = "" ;
      A135BarColNom = "" ;
      AV55Hdr = "" ;
      AV56KgsE = DecimalUtil.ZERO ;
      AV62Color_cli = "" ;
      AV63SerDsc_1 = "" ;
      AV85ProDsc = "" ;
      P02R112_A396EmprCod = new String[] {""} ;
      P02R112_A30AlbProCod = new long[1] ;
      P02R112_A129BarCod = new int[1] ;
      P02R112_A132BarCodReo = new byte[1] ;
      P02R112_A130BarCodPar = new String[] {""} ;
      P02R112_A4628ProDsc2 = new String[] {""} ;
      P02R112_A758ProCod = new String[] {""} ;
      P02R112_n758ProCod = new boolean[] {false} ;
      P02R112_A1468AlbPrdLin = new short[1] ;
      A4628ProDsc2 = "" ;
      A758ProCod = "" ;
      AV97Procod = "" ;
      AV77v_linea = "" ;
      AV90Barenccli = "" ;
      AV91Barser = "" ;
      AV92BarSerdsc = "" ;
      AV96barmdlcod = "" ;
      AV99Kgs = DecimalUtil.ZERO ;
      P02R113_A457FasCod = new String[] {""} ;
      P02R113_A396EmprCod = new String[] {""} ;
      P02R113_A30AlbProCod = new long[1] ;
      P02R113_A129BarCod = new int[1] ;
      P02R113_A132BarCodReo = new byte[1] ;
      P02R113_A130BarCodPar = new String[] {""} ;
      P02R113_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02R113_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02R113_A460FasDsc = new String[] {""} ;
      P02R113_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      P02R115_A781PrvCod = new short[1] ;
      P02R115_A396EmprCod = new String[] {""} ;
      P02R115_A252CliCod = new int[1] ;
      P02R115_A279CliNom = new String[] {""} ;
      P02R115_A260CliDom = new String[] {""} ;
      P02R115_A256CliCp = new String[] {""} ;
      P02R115_n256CliCp = new boolean[] {false} ;
      P02R115_A295CliPob = new String[] {""} ;
      P02R115_A278CliNif = new String[] {""} ;
      P02R115_A787PrvDsc = new String[] {""} ;
      P02R115_n787PrvDsc = new boolean[] {false} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A787PrvDsc = "" ;
      AV70PrvDsc = "" ;
      AV30FpgDsc = "" ;
      P02R116_A497FpgCod = new String[] {""} ;
      P02R116_A396EmprCod = new String[] {""} ;
      P02R116_A297CliPri = new String[] {""} ;
      P02R116_A252CliCod = new int[1] ;
      P02R116_A498FpgDsc = new String[] {""} ;
      P02R116_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A297CliPri = "" ;
      A498FpgDsc = "" ;
      P02R117_A396EmprCod = new String[] {""} ;
      P02R117_A266CliEnvLin = new byte[1] ;
      P02R117_A252CliCod = new int[1] ;
      P02R117_A267CliEnvNom = new String[] {""} ;
      P02R117_A265CliEnvDom = new String[] {""} ;
      P02R117_A264CliEnvCp = new String[] {""} ;
      P02R117_A268CliEnvPob = new String[] {""} ;
      P02R117_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P02R118_A781PrvCod = new short[1] ;
      P02R118_A787PrvDsc = new String[] {""} ;
      P02R118_n787PrvDsc = new boolean[] {false} ;
      AV42Procenom = "" ;
      P02R119_A970ProceCod = new short[1] ;
      P02R119_n970ProceCod = new boolean[] {false} ;
      P02R119_A396EmprCod = new String[] {""} ;
      P02R119_A361DisCod = new int[1] ;
      P02R119_A971ProceNom = new String[] {""} ;
      P02R119_n971ProceNom = new boolean[] {false} ;
      P02R119_A44AlbRecCod = new int[1] ;
      A971ProceNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbsup__default(),
         new Object[] {
             new Object[] {
            P02R12_A396EmprCod, P02R12_A407EmprNom, P02R12_n407EmprNom, P02R12_A404EmprDir, P02R12_n404EmprDir, P02R12_A408EmprPob, P02R12_n408EmprPob, P02R12_A409EmprTel, P02R12_n409EmprTel, P02R12_A405EmprFax,
            P02R12_n405EmprFax, P02R12_A395EmprCif, P02R12_n395EmprCif
            }
            , new Object[] {
            P02R13_A1253EmprGuiRem, P02R13_A840TrnCod, P02R13_A396EmprCod, P02R13_A30AlbProCod, P02R13_A1243GuiRemCli, P02R13_A1259AlbDomEnv, P02R13_n1259AlbDomEnv, P02R13_A39AlbProPri, P02R13_A3868AlbMat, P02R13_A2242AlbSec,
            P02R13_A7098AlbUsu, P02R13_A7162AlbDesp, P02R13_A1879AlbProEnt, P02R13_n1879AlbProEnt, P02R13_A33AlbProEst, P02R13_A1782AlbProEso, P02R13_A3865AlbHorSal, P02R13_A34AlbProfch
            }
            , new Object[] {
            P02R14_A953IvaCod, P02R14_n953IvaCod
            }
            , new Object[] {
            P02R15_A588IvaPor, P02R15_n588IvaPor
            }
            , new Object[] {
            P02R16_A841TrnNom, P02R16_n841TrnNom
            }
            , new Object[] {
            P02R17_A4828CliCp2, P02R17_n4828CliCp2, P02R17_A256CliCp, P02R17_n256CliCp
            }
            , new Object[] {
            P02R18_A850UsurCod, P02R18_A854UsurNom, P02R18_n854UsurNom
            }
            , new Object[] {
            P02R19_A396EmprCod, P02R19_A652OpeCod, P02R19_A653OpeNom, P02R19_n653OpeNom
            }
            , new Object[] {
            P02R110_A396EmprCod, P02R110_A30AlbProCod, P02R110_A916AlbPObs, P02R110_A915AlbPObsLin
            }
            , new Object[] {
            P02R111_A396EmprCod, P02R111_A30AlbProCod, P02R111_A339DisArtLar, P02R111_A143BarDisNum, P02R111_A118BarAcaQui, P02R111_A130BarCodPar, P02R111_A132BarCodReo, P02R111_A129BarCod, P02R111_A361DisCod, P02R111_A136BarColNum,
            P02R111_A1261BarAlbKgmE, P02R111_A1235BarNumCli, P02R111_A1234BarNomCli, P02R111_A1652BarSerDsc, P02R111_A2441AlbHdrObs, P02R111_A5293BarCodBan, P02R111_A4812BarEncCli, P02R111_A2836BarPle2, P02R111_A212BarSer, P02R111_A4609BarMdlCod,
            P02R111_A1265BarAlbPie, P02R111_A135BarColNom
            }
            , new Object[] {
            P02R112_A396EmprCod, P02R112_A30AlbProCod, P02R112_A129BarCod, P02R112_A132BarCodReo, P02R112_A130BarCodPar, P02R112_A4628ProDsc2, P02R112_A758ProCod, P02R112_n758ProCod, P02R112_A1468AlbPrdLin
            }
            , new Object[] {
            P02R113_A457FasCod, P02R113_A396EmprCod, P02R113_A30AlbProCod, P02R113_A129BarCod, P02R113_A132BarCodReo, P02R113_A130BarCodPar, P02R113_A1276FasMtr, P02R113_A1275FasKgm, P02R113_A460FasDsc, P02R113_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02R115_A781PrvCod, P02R115_A396EmprCod, P02R115_A252CliCod, P02R115_A279CliNom, P02R115_A260CliDom, P02R115_A256CliCp, P02R115_A295CliPob, P02R115_A278CliNif, P02R115_A787PrvDsc, P02R115_n787PrvDsc
            }
            , new Object[] {
            P02R116_A497FpgCod, P02R116_A396EmprCod, P02R116_A297CliPri, P02R116_A252CliCod, P02R116_A498FpgDsc, P02R116_n498FpgDsc
            }
            , new Object[] {
            P02R117_A396EmprCod, P02R117_A266CliEnvLin, P02R117_A252CliCod, P02R117_A267CliEnvNom, P02R117_A265CliEnvDom, P02R117_A264CliEnvCp, P02R117_A268CliEnvPob, P02R117_A270CliEnvPrv
            }
            , new Object[] {
            P02R118_A781PrvCod, P02R118_A787PrvDsc, P02R118_n787PrvDsc
            }
            , new Object[] {
            P02R119_A970ProceCod, P02R119_n970ProceCod, P02R119_A396EmprCod, P02R119_A361DisCod, P02R119_A971ProceNom, P02R119_n971ProceNom, P02R119_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV108Activo_p ;
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
   private short A840TrnCod ;
   private short A1468AlbPrdLin ;
   private short A1240GuiFasLin ;
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
   private int GXt_int2 ;
   private int GXv_int3[] ;
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
   private int AV37DisCod ;
   private int AV50barcolnum ;
   private int AV101Tot_u ;
   private int Gx_OldLine ;
   private int AV102FasMtr ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV56KgsE ;
   private java.math.BigDecimal AV99Kgs ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV51TextoCopia ;
   private String Gx_out ;
   private String AV60ContDsc ;
   private String GXv_char1[] ;
   private String AV21EmprNom ;
   private String AV103EmprDir ;
   private String AV104EmprPob ;
   private String AV105EmprTel ;
   private String AV106EmprFax ;
   private String AV107EmprCif ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A395EmprCif ;
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
   private String A339DisArtLar ;
   private String A143BarDisNum ;
   private String A118BarAcaQui ;
   private String A130BarCodPar ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A2441AlbHdrObs ;
   private String A5293BarCodBan ;
   private String A4812BarEncCli ;
   private String A2836BarPle2 ;
   private String A212BarSer ;
   private String A4609BarMdlCod ;
   private String A135BarColNom ;
   private String AV55Hdr ;
   private String AV62Color_cli ;
   private String AV63SerDsc_1 ;
   private String AV85ProDsc ;
   private String A4628ProDsc2 ;
   private String A758ProCod ;
   private String AV97Procod ;
   private String AV77v_linea ;
   private String AV90Barenccli ;
   private String AV91Barser ;
   private String AV92BarSerdsc ;
   private String AV96barmdlcod ;
   private String A457FasCod ;
   private String A460FasDsc ;
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
   private String A787PrvDsc ;
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
   private String A971ProceNom ;
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
   private boolean n758ProCod ;
   private boolean n787PrvDsc ;
   private boolean n498FpgDsc ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02R12_A396EmprCod ;
   private String[] P02R12_A407EmprNom ;
   private boolean[] P02R12_n407EmprNom ;
   private String[] P02R12_A404EmprDir ;
   private boolean[] P02R12_n404EmprDir ;
   private String[] P02R12_A408EmprPob ;
   private boolean[] P02R12_n408EmprPob ;
   private String[] P02R12_A409EmprTel ;
   private boolean[] P02R12_n409EmprTel ;
   private String[] P02R12_A405EmprFax ;
   private boolean[] P02R12_n405EmprFax ;
   private String[] P02R12_A395EmprCif ;
   private boolean[] P02R12_n395EmprCif ;
   private String[] P02R13_A1253EmprGuiRem ;
   private short[] P02R13_A840TrnCod ;
   private String[] P02R13_A396EmprCod ;
   private long[] P02R13_A30AlbProCod ;
   private int[] P02R13_A1243GuiRemCli ;
   private byte[] P02R13_A1259AlbDomEnv ;
   private boolean[] P02R13_n1259AlbDomEnv ;
   private String[] P02R13_A39AlbProPri ;
   private String[] P02R13_A3868AlbMat ;
   private String[] P02R13_A2242AlbSec ;
   private String[] P02R13_A7098AlbUsu ;
   private int[] P02R13_A7162AlbDesp ;
   private String[] P02R13_A1879AlbProEnt ;
   private boolean[] P02R13_n1879AlbProEnt ;
   private byte[] P02R13_A33AlbProEst ;
   private byte[] P02R13_A1782AlbProEso ;
   private String[] P02R13_A3865AlbHorSal ;
   private java.util.Date[] P02R13_A34AlbProfch ;
   private String[] P02R14_A953IvaCod ;
   private boolean[] P02R14_n953IvaCod ;
   private byte[] P02R15_A588IvaPor ;
   private boolean[] P02R15_n588IvaPor ;
   private String[] P02R16_A841TrnNom ;
   private boolean[] P02R16_n841TrnNom ;
   private String[] P02R17_A4828CliCp2 ;
   private boolean[] P02R17_n4828CliCp2 ;
   private String[] P02R17_A256CliCp ;
   private boolean[] P02R17_n256CliCp ;
   private String[] P02R18_A850UsurCod ;
   private String[] P02R18_A854UsurNom ;
   private boolean[] P02R18_n854UsurNom ;
   private String[] P02R19_A396EmprCod ;
   private int[] P02R19_A652OpeCod ;
   private String[] P02R19_A653OpeNom ;
   private boolean[] P02R19_n653OpeNom ;
   private String[] P02R110_A396EmprCod ;
   private long[] P02R110_A30AlbProCod ;
   private String[] P02R110_A916AlbPObs ;
   private byte[] P02R110_A915AlbPObsLin ;
   private String[] P02R111_A396EmprCod ;
   private long[] P02R111_A30AlbProCod ;
   private String[] P02R111_A339DisArtLar ;
   private String[] P02R111_A143BarDisNum ;
   private String[] P02R111_A118BarAcaQui ;
   private String[] P02R111_A130BarCodPar ;
   private byte[] P02R111_A132BarCodReo ;
   private int[] P02R111_A129BarCod ;
   private int[] P02R111_A361DisCod ;
   private int[] P02R111_A136BarColNum ;
   private java.math.BigDecimal[] P02R111_A1261BarAlbKgmE ;
   private int[] P02R111_A1235BarNumCli ;
   private String[] P02R111_A1234BarNomCli ;
   private String[] P02R111_A1652BarSerDsc ;
   private String[] P02R111_A2441AlbHdrObs ;
   private String[] P02R111_A5293BarCodBan ;
   private String[] P02R111_A4812BarEncCli ;
   private String[] P02R111_A2836BarPle2 ;
   private String[] P02R111_A212BarSer ;
   private String[] P02R111_A4609BarMdlCod ;
   private int[] P02R111_A1265BarAlbPie ;
   private String[] P02R111_A135BarColNom ;
   private String[] P02R112_A396EmprCod ;
   private long[] P02R112_A30AlbProCod ;
   private int[] P02R112_A129BarCod ;
   private byte[] P02R112_A132BarCodReo ;
   private String[] P02R112_A130BarCodPar ;
   private String[] P02R112_A4628ProDsc2 ;
   private String[] P02R112_A758ProCod ;
   private boolean[] P02R112_n758ProCod ;
   private short[] P02R112_A1468AlbPrdLin ;
   private String[] P02R113_A457FasCod ;
   private String[] P02R113_A396EmprCod ;
   private long[] P02R113_A30AlbProCod ;
   private int[] P02R113_A129BarCod ;
   private byte[] P02R113_A132BarCodReo ;
   private String[] P02R113_A130BarCodPar ;
   private java.math.BigDecimal[] P02R113_A1276FasMtr ;
   private java.math.BigDecimal[] P02R113_A1275FasKgm ;
   private String[] P02R113_A460FasDsc ;
   private short[] P02R113_A1240GuiFasLin ;
   private short[] P02R115_A781PrvCod ;
   private String[] P02R115_A396EmprCod ;
   private int[] P02R115_A252CliCod ;
   private String[] P02R115_A279CliNom ;
   private String[] P02R115_A260CliDom ;
   private String[] P02R115_A256CliCp ;
   private boolean[] P02R115_n256CliCp ;
   private String[] P02R115_A295CliPob ;
   private String[] P02R115_A278CliNif ;
   private String[] P02R115_A787PrvDsc ;
   private boolean[] P02R115_n787PrvDsc ;
   private String[] P02R116_A497FpgCod ;
   private String[] P02R116_A396EmprCod ;
   private String[] P02R116_A297CliPri ;
   private int[] P02R116_A252CliCod ;
   private String[] P02R116_A498FpgDsc ;
   private boolean[] P02R116_n498FpgDsc ;
   private String[] P02R117_A396EmprCod ;
   private byte[] P02R117_A266CliEnvLin ;
   private int[] P02R117_A252CliCod ;
   private String[] P02R117_A267CliEnvNom ;
   private String[] P02R117_A265CliEnvDom ;
   private String[] P02R117_A264CliEnvCp ;
   private String[] P02R117_A268CliEnvPob ;
   private short[] P02R117_A270CliEnvPrv ;
   private short[] P02R118_A781PrvCod ;
   private String[] P02R118_A787PrvDsc ;
   private boolean[] P02R118_n787PrvDsc ;
   private short[] P02R119_A970ProceCod ;
   private boolean[] P02R119_n970ProceCod ;
   private String[] P02R119_A396EmprCod ;
   private int[] P02R119_A361DisCod ;
   private String[] P02R119_A971ProceNom ;
   private boolean[] P02R119_n971ProceNom ;
   private int[] P02R119_A44AlbRecCod ;
}

final  class palbsup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02R12", "SELECT EmprCod, EmprNom, EmprDir, EmprPob, EmprTel, EmprFax, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R13", "SELECT EmprGuiRem, TrnCod, EmprCod, AlbProCod, GuiRemCli, AlbDomEnv, AlbProPri, AlbMat, AlbSec, AlbUsu, AlbDesp, AlbProEnt, AlbProEst, AlbProEso, AlbHorSal, AlbProfch FROM TXPCALPRD WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?)  FOR UPDATE OF AlbProEst, AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R14", "SELECT IvaCod FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R15", "SELECT IvaPor FROM TXPTIPIVA WHERE IvaCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R16", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R17", "SELECT CliCp2, CliCp FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R18", "SELECT UsurCod, UsurNom FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R19", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R110", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02R111", "SELECT T1.EmprCod, T1.AlbProCod, T3.DisArtLar, T2.BarDisNum, T2.BarAcaQui, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisCod, T2.BarColNum, T1.BarAlbKgmE, T2.BarNumCli, T2.BarNomCli, T2.BarSerDsc, T1.AlbHdrObs, T2.BarCodBan, T2.BarEncCli, T2.BarPle2, T2.BarSer, T2.BarMdlCod, T1.BarAlbPie, T2.BarColNom FROM (((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) INNER JOIN TXPCALPRD T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02R112", "SELECT * FROM (SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ProDsc2, T1.ProCod, T1.AlbPrdLin FROM (TXPALBPRD T1 LEFT JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.AlbProCod = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R113", "SELECT T1.FasCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasMtr, T1.FasKgm, T2.FasDsc, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02R114", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P02R115", "SELECT T1.PrvCod, T1.EmprCod, T1.CliCod, T1.CliNom, T1.CliDom, T1.CliCp, T1.CliPob, T1.CliNif, T2.PrvDsc FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R116", "SELECT T1.FpgCod, T1.EmprCod, T1.CliPri, T1.CliCod, T2.FpgDsc FROM (TXPCLIFPG T1 INNER JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod = T1.FpgCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliPri = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R117", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R118", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R119", "SELECT T2.ProceCod, T1.EmprCod, T1.DisCod, T3.ProceNom, T1.AlbRecCod FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 26);
               ((String[]) buf[14])[0] = rslt.getString(15, 60);
               ((String[]) buf[15])[0] = rslt.getString(16, 15);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((String[]) buf[17])[0] = rslt.getString(18, 30);
               ((String[]) buf[18])[0] = rslt.getString(19, 16);
               ((String[]) buf[19])[0] = rslt.getString(20, 13);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 13);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               ((int[]) buf[6])[0] = rslt.getInt(5);
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
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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

