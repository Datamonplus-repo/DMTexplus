package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pedtxguia extends GXReport
{
   public pedtxguia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedtxguia.class ), "" );
   }

   public pedtxguia( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pedtxguia.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      pedtxguia.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pedtxguia.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pedtxguia.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      pedtxguia.this.AV32Puerto = aP3[0];
      this.aP3 = aP3;
      pedtxguia.this.AV100TCopia = aP4[0];
      this.aP4 = aP4;
      pedtxguia.this.AV102N_copia = aP5[0];
      this.aP5 = aP5;
      pedtxguia.this.Gx_out = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Guia") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV60ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRMETX", ""), GXv_char1) ;
         pedtxguia.this.AV60ContDsc = GXv_char1[0] ;
         GXt_char2 = AV109Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pedtxguia.this.A396EmprCod = GXv_char1[0] ;
         pedtxguia.this.GXt_char2 = GXv_char4[0] ;
         AV109Firmad = GXt_char2 ;
         AV68Flag_tubos = (byte)(0) ;
         GxHdr2 = true ;
         /* Using cursor P05AR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1253EmprGuiRem = P05AR2_A1253EmprGuiRem[0] ;
            A840TrnCod = P05AR2_A840TrnCod[0] ;
            A1243GuiRemCli = P05AR2_A1243GuiRemCli[0] ;
            A1259AlbDomEnv = P05AR2_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P05AR2_n1259AlbDomEnv[0] ;
            A39AlbProPri = P05AR2_A39AlbProPri[0] ;
            A3868AlbMat = P05AR2_A3868AlbMat[0] ;
            A3865AlbHorSal = P05AR2_A3865AlbHorSal[0] ;
            A34AlbProfch = P05AR2_A34AlbProfch[0] ;
            A10017AlbFmd = P05AR2_A10017AlbFmd[0] ;
            n10017AlbFmd = P05AR2_n10017AlbFmd[0] ;
            A7101AlbLic = P05AR2_A7101AlbLic[0] ;
            A4023AlbFecSal = P05AR2_A4023AlbFecSal[0] ;
            A2242AlbSec = P05AR2_A2242AlbSec[0] ;
            A1879AlbProEnt = P05AR2_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P05AR2_n1879AlbProEnt[0] ;
            A33AlbProEst = P05AR2_A33AlbProEst[0] ;
            A1782AlbProEso = P05AR2_A1782AlbProEso[0] ;
            A5140AlbMarca = P05AR2_A5140AlbMarca[0] ;
            /* Using cursor P05AR3 */
            pr_default.execute(1, new Object[] {A396EmprCod});
            A953IvaCod = P05AR3_A953IvaCod[0] ;
            n953IvaCod = P05AR3_n953IvaCod[0] ;
            A407EmprNom = P05AR3_A407EmprNom[0] ;
            n407EmprNom = P05AR3_n407EmprNom[0] ;
            /* Using cursor P05AR4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
            A588IvaPor = P05AR4_A588IvaPor[0] ;
            n588IvaPor = P05AR4_n588IvaPor[0] ;
            /* Using cursor P05AR5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
            A841TrnNom = P05AR5_A841TrnNom[0] ;
            n841TrnNom = P05AR5_n841TrnNom[0] ;
            /* Using cursor P05AR6 */
            pr_default.execute(4, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
            A2748CliAlias = P05AR6_A2748CliAlias[0] ;
            n2748CliAlias = P05AR6_n2748CliAlias[0] ;
            A4828CliCp2 = P05AR6_A4828CliCp2[0] ;
            n4828CliCp2 = P05AR6_n4828CliCp2[0] ;
            A256CliCp = P05AR6_A256CliCp[0] ;
            n256CliCp = P05AR6_n256CliCp[0] ;
            AV16CliCod = A1243GuiRemCli ;
            /* Execute user subroutine: 'CLIAS4' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV22CliEnvDom = A1259AlbDomEnv ;
            AV29Prioridad = A39AlbProPri ;
            AV64IvaPor = A588IvaPor ;
            AV65AlbMat = A3868AlbMat ;
            AV66AlbHorSal = GXutil.substring( A3865AlbHorSal, 1, 5) ;
            AV75AlbProFch = A34AlbProfch ;
            AV107Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV108Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV107Texto_fd = AV108Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV109Firmad) ;
            }
            else
            {
               AV107Texto_fd = httpContext.getMessage( "Atenção Documento sem assinatura digital. ", "") + httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            if ( GXutil.strcmp(A7101AlbLic, " ") > 0 )
            {
               AV112AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            AV79Ceros10 = "0000000000" ;
            AV80DiaF = (byte)(GXutil.day( A34AlbProfch)) ;
            AV81DiaA = GXutil.str( AV80DiaF, 2, 0) ;
            AV81DiaA = GXutil.ltrim( GXutil.rtrim( AV81DiaA)) ;
            AV82LenVar = (byte)(GXutil.len( AV81DiaA)) ;
            AV82LenVar = (byte)(2-AV82LenVar) ;
            AV81DiaA = GXutil.substring( AV79Ceros10, 1, AV82LenVar) + AV81DiaA ;
            AV83MesF = (byte)(GXutil.month( A34AlbProfch)) ;
            AV84MesA = GXutil.str( AV83MesF, 2, 0) ;
            AV84MesA = GXutil.ltrim( GXutil.rtrim( AV84MesA)) ;
            AV82LenVar = (byte)(GXutil.len( AV84MesA)) ;
            AV82LenVar = (byte)(2-AV82LenVar) ;
            AV84MesA = GXutil.substring( AV79Ceros10, 1, AV82LenVar) + AV84MesA ;
            AV85AnyF = (short)(GXutil.year( A34AlbProfch)) ;
            AV87VarAlb = GXutil.str( A30AlbProCod, 10, 0) ;
            AV87VarAlb = GXutil.ltrim( GXutil.rtrim( AV87VarAlb)) ;
            AV82LenVar = (byte)(GXutil.len( AV87VarAlb)) ;
            AV82LenVar = (byte)(10-AV82LenVar) ;
            AV87VarAlb = GXutil.substring( AV79Ceros10, 1, AV82LenVar) + AV87VarAlb ;
            AV88NumAlb = GXutil.substring( AV87VarAlb, 5, 6) ;
            AV88NumAlb = GXutil.padl( GXutil.trim( GXutil.str( A30AlbProCod, 8, 0)), (short)(8), "0") ;
            AV86Fecha_a = GXutil.str( AV85AnyF, 4, 0) + "/" + AV84MesA + "/" + AV81DiaA ;
            AV111Albfecsal = A4023AlbFecSal ;
            AV66AlbHorSal = A3865AlbHorSal ;
            AV69Cp_1_2 = GXutil.trim( A256CliCp) + "-" + GXutil.trim( GXutil.substring( A4828CliCp2, 1, 4)) ;
            /* Execute user subroutine: 'CLIENTE' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV21EmprNom = A407EmprNom ;
            AV57VDoc = httpContext.getMessage( "Guia de Remessa", "") ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV57VDoc = httpContext.getMessage( "Guia de Transito", "") ;
               if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "B", "")) == 0 )
               {
                  AV103Codigo = "04-" ;
                  AV57VDoc = httpContext.getMessage( "Guia de Remessa", "") ;
               }
               if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "C", "")) == 0 )
               {
                  AV103Codigo = "96-" ;
               }
               if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "D", "")) == 0 )
               {
                  AV103Codigo = "97-" ;
               }
            }
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               AV103Codigo = "03-" ;
            }
            if ( AV49Copias == 1 )
            {
               AV46vCopia = httpContext.getMessage( "DUPLICADO", "") ;
            }
            AV58i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV59vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05AR7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A916AlbPObs = P05AR7_A916AlbPObs[0] ;
               A915AlbPObsLin = P05AR7_A915AlbPObsLin[0] ;
               if ( AV58i > 2 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV59vObs[AV58i-1] = A916AlbPObs ;
               AV58i = (byte)(AV58i+1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV48ContLine = (byte)(0) ;
            AV52Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            AV77VReoExt_2 = GXutil.space( (short)(14)) ;
            /* Using cursor P05AR9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1206TubCod = P05AR9_A1206TubCod[0] ;
               n1206TubCod = P05AR9_n1206TubCod[0] ;
               A224BarTraP1 = P05AR9_A224BarTraP1[0] ;
               A225BarTraP2 = P05AR9_A225BarTraP2[0] ;
               A226BarTraP3 = P05AR9_A226BarTraP3[0] ;
               A136BarColNum = P05AR9_A136BarColNum[0] ;
               A1207TubNom = P05AR9_A1207TubNom[0] ;
               n1207TubNom = P05AR9_n1207TubNom[0] ;
               A1235BarNumCli = P05AR9_A1235BarNumCli[0] ;
               A1234BarNomCli = P05AR9_A1234BarNomCli[0] ;
               A1652BarSerDsc = P05AR9_A1652BarSerDsc[0] ;
               A3271AlbHdrAnc = P05AR9_A3271AlbHdrAnc[0] ;
               A2827BarKgsLot = P05AR9_A2827BarKgsLot[0] ;
               A148BarEstReo = P05AR9_A148BarEstReo[0] ;
               A1261BarAlbKgmE = P05AR9_A1261BarAlbKgmE[0] ;
               A1263BarAlbMtrE = P05AR9_A1263BarAlbMtrE[0] ;
               A5019AlbHdrgm2 = P05AR9_A5019AlbHdrgm2[0] ;
               A217BarTipArt = P05AR9_A217BarTipArt[0] ;
               n217BarTipArt = P05AR9_n217BarTipArt[0] ;
               A4812BarEncCli = P05AR9_A4812BarEncCli[0] ;
               A361DisCod = P05AR9_A361DisCod[0] ;
               A1266BarAlbTub = P05AR9_A1266BarAlbTub[0] ;
               A130BarCodPar = P05AR9_A130BarCodPar[0] ;
               A132BarCodReo = P05AR9_A132BarCodReo[0] ;
               A129BarCod = P05AR9_A129BarCod[0] ;
               A4815AlbEncCli = P05AR9_A4815AlbEncCli[0] ;
               A166BarKgm = P05AR9_A166BarKgm[0] ;
               n166BarKgm = P05AR9_n166BarKgm[0] ;
               A1207TubNom = P05AR9_A1207TubNom[0] ;
               n1207TubNom = P05AR9_n1207TubNom[0] ;
               A224BarTraP1 = P05AR9_A224BarTraP1[0] ;
               A225BarTraP2 = P05AR9_A225BarTraP2[0] ;
               A226BarTraP3 = P05AR9_A226BarTraP3[0] ;
               A136BarColNum = P05AR9_A136BarColNum[0] ;
               A1235BarNumCli = P05AR9_A1235BarNumCli[0] ;
               A1234BarNomCli = P05AR9_A1234BarNomCli[0] ;
               A1652BarSerDsc = P05AR9_A1652BarSerDsc[0] ;
               A2827BarKgsLot = P05AR9_A2827BarKgsLot[0] ;
               A148BarEstReo = P05AR9_A148BarEstReo[0] ;
               A217BarTipArt = P05AR9_A217BarTipArt[0] ;
               n217BarTipArt = P05AR9_n217BarTipArt[0] ;
               A4812BarEncCli = P05AR9_A4812BarEncCli[0] ;
               A361DisCod = P05AR9_A361DisCod[0] ;
               A166BarKgm = P05AR9_A166BarKgm[0] ;
               n166BarKgm = P05AR9_n166BarKgm[0] ;
               if ( A224BarTraP1 > 0 )
               {
                  AV115vCompo = GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" ;
                  if ( A225BarTraP2 > 0 )
                  {
                     AV115vCompo += GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" ;
                  }
                  if ( A226BarTraP3 > 0 )
                  {
                     AV115vCompo += GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
                  }
               }
               AV50barcolnum = A136BarColNum ;
               AV55Hdr = httpContext.getMessage( "O/S ", "") + GXutil.str( A129BarCod, 8, 0) + A130BarCodPar ;
               AV56KgsE = A166BarKgm ;
               AV61TubNom_1 = GXutil.trim( GXutil.substring( A1207TubNom, 1, 5)) ;
               AV116Space = (byte)(6) ;
               AV98BarNumCli = ((A1235BarNumCli>0) ? GXutil.padr( GXutil.trim( GXutil.str( A1235BarNumCli, 6, 0)), 6, " ") : "      ") ;
               AV99ColNum_a = ((A136BarColNum>0) ? GXutil.padr( GXutil.trim( GXutil.str( A136BarColNum, 6, 0)), 6, " ") : "      ") ;
               AV50barcolnum = A136BarColNum ;
               AV82LenVar = (byte)(GXutil.len( GXutil.trim( A1234BarNomCli))) ;
               AV117SpaceCalculado = (byte)(13-AV82LenVar) ;
               AV118color13 = ((AV117SpaceCalculado<=0) ? A1234BarNomCli : A1234BarNomCli+GXutil.space( AV117SpaceCalculado)) ;
               AV62Color_cli = AV118color13 + " " + GXutil.padr( GXutil.trim( AV98BarNumCli), 6, " ") + " " + GXutil.padr( GXutil.trim( AV99ColNum_a), 6, " ") ;
               AV62Color_cli = AV118color13 ;
               if ( A1235BarNumCli > 0 )
               {
                  AV62Color_cli += GXutil.str( A1235BarNumCli, 6, 0) ;
               }
               else
               {
                  AV62Color_cli += "      " ;
               }
               if ( A136BarColNum > 0 )
               {
                  AV62Color_cli += GXutil.str( A136BarColNum, 6, 0) ;
               }
               else
               {
                  AV62Color_cli += "      " ;
               }
               AV63SerDsc_1 = GXutil.substring( A1652BarSerDsc, 1, 12) ;
               AV67Ancho_s = A3271AlbHdrAnc ;
               AV72Kilos_Ini = A2827BarKgsLot ;
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2827BarKgsLot)==0) )
               {
                  AV73Var_kgs = "(" + GXutil.str( AV72Kilos_Ini, 7, 2) + ")" ;
               }
               else
               {
                  AV73Var_kgs = GXutil.space( (short)(13)) ;
               }
               if ( AV48ContLine >= 20 )
               {
                  /* Execute user subroutine: 'PIE' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(4);
                     pr_default.close(3);
                     pr_default.close(2);
                     pr_default.close(1);
                     pr_default.close(0);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV76vReoExt = GXutil.space( (short)(2)) ;
               if ( A148BarEstReo == 2 )
               {
                  AV76vReoExt = httpContext.getMessage( "a)", "") ;
                  AV77VReoExt_2 = httpContext.getMessage( "a) Devoluçao", "") ;
               }
               AV91Kgs = A1261BarAlbKgmE ;
               AV92Mts = A1263BarAlbMtrE ;
               if ( A1263BarAlbMtrE.doubleValue() > 0 )
               {
                  AV73Var_kgs = GXutil.str( AV92Mts, 7, 2) + httpContext.getMessage( " MT", "") ;
               }
               if ( A5019AlbHdrgm2 > 0 )
               {
                  AV94Grm2_3 = A5019AlbHdrgm2 ;
                  AV93Grm2 = GXutil.str( AV94Grm2_3, 3, 0) + httpContext.getMessage( "G", "") ;
               }
               else
               {
                  AV93Grm2 = GXutil.space( (short)(4)) ;
               }
               AV95BarTipARt = A217BarTipArt ;
               /* Execute user subroutine: 'TIPART' */
               S161 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(4);
                  pr_default.close(3);
                  pr_default.close(2);
                  pr_default.close(1);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV96Texto_f = GXutil.trim( AV63SerDsc_1) + " " + GXutil.trim( AV90TipArtDsc) + " " + GXutil.trim( AV115vCompo) ;
               AV104Enccli = GXutil.substring( A4812BarEncCli, 1, 16) ;
               AV105DisPreKgm = DecimalUtil.doubleToDec(0) ;
               AV106Dispremtr = DecimalUtil.doubleToDec(0) ;
               if ( GXutil.strcmp(AV100TCopia, httpContext.getMessage( "Quadriplicado", "")) == 0 )
               {
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int5[0] = A361DisCod ;
                  GXv_decimal6[0] = AV105DisPreKgm ;
                  GXv_decimal7[0] = AV106Dispremtr ;
                  new app.ppreuni(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_decimal6, GXv_decimal7) ;
                  pedtxguia.this.A396EmprCod = GXv_char4[0] ;
                  pedtxguia.this.A361DisCod = GXv_int5[0] ;
                  pedtxguia.this.AV105DisPreKgm = GXv_decimal6[0] ;
                  pedtxguia.this.AV106Dispremtr = GXv_decimal7[0] ;
               }
               AV113CantTub = (short)(A1266BarAlbTub) ;
               if ( (GXutil.strcmp("", A2748CliAlias)==0) )
               {
                  h5AR0( false, 15) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Hdr, "")), 382, Gx_line+0, 471, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91Kgs, "ZZZ9.99")), 672, Gx_line+0, 717, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Enccli, "")), 14, Gx_line+0, 115, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TubNom_1, "")), 122, Gx_line+0, 175, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV113CantTub), "ZZZ9")), 158, Gx_line+0, 184, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67Ancho_s), "ZZZ")), 650, Gx_line+0, 670, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "KG", ""), 720, Gx_line+0, 735, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Texto_f, "")), 196, Gx_line+0, 378, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Var_kgs, "")), 738, Gx_line+1, 805, Gx_line+12, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 475, Gx_line+0, 557, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50barcolnum), "ZZZZZZ")), 563, Gx_line+0, 602, Gx_line+15, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
                  AV48ContLine = (byte)(AV48ContLine+1) ;
                  if ( ! (GXutil.strcmp("", AV76vReoExt)==0) )
                  {
                     h5AR0( false, 15) ;
                     getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76vReoExt, "")), 738, Gx_line+0, 760, Gx_line+15, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+15) ;
                     AV48ContLine = (byte)(AV48ContLine+1) ;
                  }
                  if ( ( GXutil.strcmp(AV100TCopia, httpContext.getMessage( "Quadriplicado", "")) == 0 ) && ( AV105DisPreKgm.doubleValue() > 0 ) )
                  {
                     h5AR0( false, 17) ;
                     getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV105DisPreKgm, "ZZ.ZZ")), 738, Gx_line+0, 770, Gx_line+15, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     AV48ContLine = (byte)(AV48ContLine+1) ;
                  }
               }
               else
               {
                  h5AR0( false, 14) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Hdr, "")), 382, Gx_line+0, 471, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV92Mts, "ZZZ9.99")), 672, Gx_line+0, 717, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TubNom_1, "")), 122, Gx_line+0, 175, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV113CantTub), "ZZZ9")), 158, Gx_line+0, 184, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67Ancho_s), "ZZZ")), 650, Gx_line+0, 670, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "MT", ""), 718, Gx_line+0, 735, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76vReoExt, "")), 738, Gx_line+0, 760, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Texto_f, "")), 196, Gx_line+0, 378, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Enccli, "")), 14, Gx_line+0, 115, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 475, Gx_line+0, 557, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50barcolnum), "ZZZZZZ")), 563, Gx_line+0, 602, Gx_line+15, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+14) ;
                  AV48ContLine = (byte)(AV48ContLine+1) ;
               }
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV68Flag_tubos = (byte)(1) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A30AlbProCod ;
            GXv_char3[0] = Gx_msg ;
            new app.ptubetx(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
            pedtxguia.this.A396EmprCod = GXv_char4[0] ;
            pedtxguia.this.A30AlbProCod = GXv_int8[0] ;
            pedtxguia.this.Gx_msg = GXv_char3[0] ;
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            /* Execute user subroutine: 'PIE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P05AR10 */
            pr_default.execute(7, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.close(4);
         pr_default.close(1);
         pr_default.close(2);
         pr_default.close(3);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5AR0( true, 0) ;
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
      /* 'PIE' Routine */
      returnInSub = false ;
      while ( AV48ContLine <= 22 )
      {
         h5AR0( false, 15) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+15) ;
         AV48ContLine = (byte)(AV48ContLine+1) ;
      }
      AV48ContLine = (byte)(0) ;
      if ( AV102N_copia <= 3 )
      {
         AV101vLey = " " ;
      }
      else
      {
         AV101vLey = httpContext.getMessage( "Copia de documento nao valida para os fins previstos no Regime Tributario Complementar dos Bens em Circulacao", "") ;
      }
      if ( (GXutil.strcmp("", A5140AlbMarca)==0) )
      {
         h5AR0( false, 321) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes:", ""), 29, Gx_line+115, 94, Gx_line+129, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[1-1], "")), 124, Gx_line+115, 438, Gx_line+130, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[2-1], "")), 124, Gx_line+131, 438, Gx_line+146, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60ContDsc, "")), 24, Gx_line+267, 150, Gx_line+282, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 28, Gx_line+153, 100, Gx_line+167, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "VILAR", ""), 145, Gx_line+153, 175, Gx_line+167, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "S. JOAO DAS CALDAS", ""), 145, Gx_line+170, 245, Gx_line+184, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Partida:", ""), 517, Gx_line+153, 554, Gx_line+167, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66AlbHorSal, "")), 679, Gx_line+151, 763, Gx_line+166, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 715, Gx_line+195, 742, Gx_line+209, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Matricula:", ""), 517, Gx_line+170, 568, Gx_line+184, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65AlbMat, "")), 590, Gx_line+170, 716, Gx_line+185, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 29, Gx_line+195, 118, Gx_line+209, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24CliEDom, "")), 146, Gx_line+195, 360, Gx_line+210, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26CliEPob, "")), 146, Gx_line+211, 335, Gx_line+226, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25CliEcp, "")), 146, Gx_line+228, 210, Gx_line+243, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Chegada:     /     /", ""), 518, Gx_line+195, 594, Gx_line+209, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 635, Gx_line+151, 662, Gx_line+165, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "RECEBIDO POR", ""), 583, Gx_line+211, 653, Gx_line+225, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(532, Gx_line+245, 737, Gx_line+245, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70PrvDsc, "@!")), 211, Gx_line+228, 400, Gx_line+243, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Embalagens:", ""), 22, Gx_line+81, 82, Gx_line+95, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_msg, "")), 109, Gx_line+81, 548, Gx_line+96, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77VReoExt_2, "")), 682, Gx_line+81, 771, Gx_line+96, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101vLey, "")), 24, Gx_line+250, 775, Gx_line+265, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Texto_fd, "")), 164, Gx_line+268, 540, Gx_line+283, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( AV111Albfecsal, "99/99/99"), 575, Gx_line+153, 622, Gx_line+168, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112AtId, "")), 553, Gx_line+269, 742, Gx_line+284, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(13, Gx_line+101, 789, Gx_line+321, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "“Garantimos serviço de tingimento e acabamento ao abrigo de um dos nossos certificados STANDARD 100 by OEKO-TEX® nº548 classe I ou 6029CIT classe II, anexo 4, ", ""), 22, Gx_line+293, 769, Gx_line+307, 1+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "apenas quando solicitado por escrito pelo cliente.” ", ""), 284, Gx_line+306, 505, Gx_line+320, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+321) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
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
      /* Using cursor P05AR11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A781PrvCod = P05AR11_A781PrvCod[0] ;
         A252CliCod = P05AR11_A252CliCod[0] ;
         A279CliNom = P05AR11_A279CliNom[0] ;
         A3644CliNom1 = P05AR11_A3644CliNom1[0] ;
         A260CliDom = P05AR11_A260CliDom[0] ;
         A256CliCp = P05AR11_A256CliCp[0] ;
         n256CliCp = P05AR11_n256CliCp[0] ;
         A295CliPob = P05AR11_A295CliPob[0] ;
         A278CliNif = P05AR11_A278CliNif[0] ;
         A787PrvDsc = P05AR11_A787PrvDsc[0] ;
         n787PrvDsc = P05AR11_n787PrvDsc[0] ;
         A787PrvDsc = P05AR11_A787PrvDsc[0] ;
         n787PrvDsc = P05AR11_n787PrvDsc[0] ;
         AV17CliNom = A279CliNom ;
         AV97CliNom12 = GXutil.trim( A279CliNom) + " " + GXutil.trim( A3644CliNom1) ;
         AV18CliDom = A260CliDom ;
         AV19Clicp = A256CliCp ;
         AV20CliPob = A295CliPob ;
         AV47CliNif = A278CliNif ;
         AV23CliENom = A279CliNom ;
         AV24CliEDom = A260CliDom ;
         AV25CliEcp = A256CliCp ;
         AV26CliEPob = A295CliPob ;
         AV110Prvdsc1 = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      /* Execute user subroutine: 'ENVIO' */
      S131 ();
      if (returnInSub) return;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P05AR12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV22CliEnvDom)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A266CliEnvLin = P05AR12_A266CliEnvLin[0] ;
         A252CliCod = P05AR12_A252CliCod[0] ;
         A267CliEnvNom = P05AR12_A267CliEnvNom[0] ;
         A265CliEnvDom = P05AR12_A265CliEnvDom[0] ;
         A264CliEnvCp = P05AR12_A264CliEnvCp[0] ;
         A268CliEnvPob = P05AR12_A268CliEnvPob[0] ;
         A270CliEnvPrv = P05AR12_A270CliEnvPrv[0] ;
         AV23CliENom = A267CliEnvNom ;
         AV24CliEDom = A265CliEnvDom ;
         AV25CliEcp = A264CliEnvCp ;
         AV26CliEPob = A268CliEnvPob ;
         AV71CodPrv = A270CliEnvPrv ;
         /* Execute user subroutine: 'PROVIN' */
         S147 ();
         if ( returnInSub )
         {
            pr_default.close(9);
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
      pr_default.close(9);
   }

   public void S147( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P05AR13 */
      pr_default.execute(10, new Object[] {Short.valueOf(AV71CodPrv)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A781PrvCod = P05AR13_A781PrvCod[0] ;
         A787PrvDsc = P05AR13_A787PrvDsc[0] ;
         n787PrvDsc = P05AR13_n787PrvDsc[0] ;
         AV70PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'CLIAS4' Routine */
      returnInSub = false ;
      AV89CliAlfa = GXutil.space( (short)(6)) ;
      AV129GXLvl320 = (byte)(0) ;
      /* Using cursor P05AR14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A252CliCod = P05AR14_A252CliCod[0] ;
         A257CliCue = P05AR14_A257CliCue[0] ;
         AV129GXLvl320 = (byte)(1) ;
         AV89CliAlfa = GXutil.substring( A257CliCue, 1, 6) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      if ( AV129GXLvl320 == 0 )
      {
         AV89CliAlfa = GXutil.str( A252CliCod, 6, 0) ;
      }
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV90TipArtDsc = "             " ;
      /* Using cursor P05AR15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(AV95BarTipARt)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A829TipArtCod = P05AR15_A829TipArtCod[0] ;
         A830TipArtDsc = P05AR15_A830TipArtDsc[0] ;
         n830TipArtDsc = P05AR15_n830TipArtDsc[0] ;
         AV90TipArtDsc = GXutil.substring( A830TipArtDsc, 1, 10) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void h5AR0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               if ( (GXutil.strcmp("", A5140AlbMarca)==0) )
               {
                  getPrinter().GxDrawRect(2, Gx_line+392, 790, Gx_line+423, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97CliNom12, "")), 413, Gx_line+203, 789, Gx_line+218, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CliDom, "")), 413, Gx_line+220, 627, Gx_line+235, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliPob, "")), 413, Gx_line+236, 602, Gx_line+251, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE NR", ""), 23, Gx_line+250, 77, Gx_line+264, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE NR", ""), 23, Gx_line+267, 109, Gx_line+281, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89CliAlfa, "")), 176, Gx_line+250, 240, Gx_line+265, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Fecha_a, "")), 681, Gx_line+30, 745, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 176, Gx_line+267, 302, Gx_line+282, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88NumAlb, "")), 714, Gx_line+47, 798, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "NUM:", ""), 648, Gx_line+47, 677, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 648, Gx_line+30, 674, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VIA EXPEDICAO", ""), 23, Gx_line+300, 98, Gx_line+314, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VENDEDOR", ""), 23, Gx_line+317, 77, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/ENC.", ""), 14, Gx_line+399, 48, Gx_line+413, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "EMBALAGEM", ""), 122, Gx_line+399, 188, Gx_line+413, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DESCRIÇAO", ""), 196, Gx_line+399, 251, Gx_line+413, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "COR", ""), 475, Gx_line+399, 496, Gx_line+413, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LARG", ""), 646, Gx_line+399, 673, Gx_line+413, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "QTD", ""), 695, Gx_line+399, 717, Gx_line+413, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Taxa IVA -", ""), 688, Gx_line+366, 733, Gx_line+380, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64IvaPor), "Z9")), 740, Gx_line+366, 754, Gx_line+381, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Cp_1_2, "")), 413, Gx_line+253, 483, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Prvdsc1, "@!")), 507, Gx_line+253, 696, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 176, Gx_line+300, 365, Gx_line+315, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TAM - MERC.INTERNO", ""), 176, Gx_line+317, 279, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("%", 761, Gx_line+366, 770, Gx_line+380, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100TCopia, "")), 644, Gx_line+80, 739, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103Codigo, "")), 681, Gx_line+47, 713, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 648, Gx_line+14, 774, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "969bc018-2e69-44a8-9a51-2bdb92ccce51", "", context.getHttpContext().getTheme( )), 23, Gx_line+25, 230, Gx_line+193) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3d88a1e5-db8d-4ccb-ac97-daf19afc12cf", "", context.getHttpContext().getTheme( )), 321, Gx_line+27, 464, Gx_line+102) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "ee7f8233-fb56-4a66-a0c7-5f5540cb294f", "", context.getHttpContext().getTheme( )), 471, Gx_line+27, 614, Gx_line+102) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "974ddd4b-3538-4bab-bef4-14b0c4134dba", "", context.getHttpContext().getTheme( )), 245, Gx_line+34, 314, Gx_line+101) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54fd2961-d848-4c83-9bb8-3008dba60df6", "", context.getHttpContext().getTheme( )), 403, Gx_line+108, 469, Gx_line+188) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "4524f958-2522-4fc5-bdf8-941692cffd3c", "", context.getHttpContext().getTheme( )), 492, Gx_line+108, 591, Gx_line+175) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "fc2c1d60-082e-420a-bad3-0d4e101c83dc", "", context.getHttpContext().getTheme( )), 245, Gx_line+108, 380, Gx_line+186) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+433) ;
               }
               else
               {
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97CliNom12, "")), 425, Gx_line+203, 801, Gx_line+218, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CliDom, "")), 425, Gx_line+220, 639, Gx_line+235, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliPob, "")), 425, Gx_line+236, 614, Gx_line+251, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE NR", ""), 29, Gx_line+250, 83, Gx_line+264, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE NR", ""), 29, Gx_line+267, 115, Gx_line+281, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89CliAlfa, "")), 190, Gx_line+250, 254, Gx_line+265, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 190, Gx_line+267, 316, Gx_line+282, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VIA EXPEDICAO", ""), 29, Gx_line+300, 104, Gx_line+314, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VENDEDOR", ""), 29, Gx_line+317, 83, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Cp_1_2, "")), 425, Gx_line+253, 495, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110Prvdsc1, "@!")), 527, Gx_line+253, 716, Gx_line+268, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 190, Gx_line+300, 379, Gx_line+315, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TAM - MERC.INTERNO", ""), 190, Gx_line+317, 293, Gx_line+331, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "**   G U I A   A N U L A D A   **", ""), 357, Gx_line+404, 490, Gx_line+418, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Texto_fd, "")), 29, Gx_line+367, 405, Gx_line+382, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Fecha_a, "")), 681, Gx_line+30, 745, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88NumAlb, "")), 714, Gx_line+47, 798, Gx_line+62, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "NUM:", ""), 648, Gx_line+47, 677, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 648, Gx_line+30, 674, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103Codigo, "")), 679, Gx_line+47, 711, Gx_line+62, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 648, Gx_line+14, 774, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112AtId, "")), 481, Gx_line+367, 670, Gx_line+382, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(2, Gx_line+396, 790, Gx_line+429, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "969bc018-2e69-44a8-9a51-2bdb92ccce51", "", context.getHttpContext().getTheme( )), 29, Gx_line+14, 236, Gx_line+182) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3d88a1e5-db8d-4ccb-ac97-daf19afc12cf", "", context.getHttpContext().getTheme( )), 321, Gx_line+16, 464, Gx_line+91) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "ee7f8233-fb56-4a66-a0c7-5f5540cb294f", "", context.getHttpContext().getTheme( )), 471, Gx_line+16, 614, Gx_line+91) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "974ddd4b-3538-4bab-bef4-14b0c4134dba", "", context.getHttpContext().getTheme( )), 246, Gx_line+23, 315, Gx_line+90) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "fc2c1d60-082e-420a-bad3-0d4e101c83dc", "", context.getHttpContext().getTheme( )), 245, Gx_line+104, 380, Gx_line+182) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54fd2961-d848-4c83-9bb8-3008dba60df6", "", context.getHttpContext().getTheme( )), 403, Gx_line+104, 469, Gx_line+184) ;
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "4524f958-2522-4fc5-bdf8-941692cffd3c", "", context.getHttpContext().getTheme( )), 492, Gx_line+104, 591, Gx_line+171) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+433) ;
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
      this.aP0[0] = pedtxguia.this.A396EmprCod;
      this.aP1[0] = pedtxguia.this.A30AlbProCod;
      this.aP2[0] = pedtxguia.this.AV15ImpCod;
      this.aP3[0] = pedtxguia.this.AV32Puerto;
      this.aP4[0] = pedtxguia.this.AV100TCopia;
      this.aP5[0] = pedtxguia.this.AV102N_copia;
      this.aP6[0] = pedtxguia.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pedtxguia");
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
      AV109Firmad = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P05AR2_A1253EmprGuiRem = new String[] {""} ;
      P05AR2_A840TrnCod = new short[1] ;
      P05AR2_A396EmprCod = new String[] {""} ;
      P05AR2_A30AlbProCod = new long[1] ;
      P05AR2_A1243GuiRemCli = new int[1] ;
      P05AR2_A1259AlbDomEnv = new byte[1] ;
      P05AR2_n1259AlbDomEnv = new boolean[] {false} ;
      P05AR2_A39AlbProPri = new String[] {""} ;
      P05AR2_A3868AlbMat = new String[] {""} ;
      P05AR2_A3865AlbHorSal = new String[] {""} ;
      P05AR2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P05AR2_A10017AlbFmd = new String[] {""} ;
      P05AR2_n10017AlbFmd = new boolean[] {false} ;
      P05AR2_A7101AlbLic = new String[] {""} ;
      P05AR2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P05AR2_A2242AlbSec = new String[] {""} ;
      P05AR2_A1879AlbProEnt = new String[] {""} ;
      P05AR2_n1879AlbProEnt = new boolean[] {false} ;
      P05AR2_A33AlbProEst = new byte[1] ;
      P05AR2_A1782AlbProEso = new byte[1] ;
      P05AR2_A5140AlbMarca = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A3868AlbMat = "" ;
      A3865AlbHorSal = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A2242AlbSec = "" ;
      A1879AlbProEnt = "" ;
      A5140AlbMarca = "" ;
      P05AR3_A953IvaCod = new String[] {""} ;
      P05AR3_n953IvaCod = new boolean[] {false} ;
      P05AR3_A407EmprNom = new String[] {""} ;
      P05AR3_n407EmprNom = new boolean[] {false} ;
      A953IvaCod = "" ;
      A407EmprNom = "" ;
      P05AR4_A588IvaPor = new byte[1] ;
      P05AR4_n588IvaPor = new boolean[] {false} ;
      P05AR5_A841TrnNom = new String[] {""} ;
      P05AR5_n841TrnNom = new boolean[] {false} ;
      A841TrnNom = "" ;
      P05AR6_A2748CliAlias = new String[] {""} ;
      P05AR6_n2748CliAlias = new boolean[] {false} ;
      P05AR6_A4828CliCp2 = new String[] {""} ;
      P05AR6_n4828CliCp2 = new boolean[] {false} ;
      P05AR6_A256CliCp = new String[] {""} ;
      P05AR6_n256CliCp = new boolean[] {false} ;
      A2748CliAlias = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      AV29Prioridad = "" ;
      AV65AlbMat = "" ;
      AV66AlbHorSal = "" ;
      AV75AlbProFch = GXutil.nullDate() ;
      AV107Texto_fd = "" ;
      AV108Firma4dig = "" ;
      AV112AtId = "" ;
      AV79Ceros10 = "" ;
      AV81DiaA = "" ;
      AV84MesA = "" ;
      AV87VarAlb = "" ;
      AV88NumAlb = "" ;
      AV86Fecha_a = "" ;
      AV111Albfecsal = GXutil.nullDate() ;
      AV69Cp_1_2 = "" ;
      AV21EmprNom = "" ;
      AV57VDoc = "" ;
      AV103Codigo = "" ;
      AV46vCopia = "" ;
      AV59vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV59vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05AR7_A396EmprCod = new String[] {""} ;
      P05AR7_A30AlbProCod = new long[1] ;
      P05AR7_A916AlbPObs = new String[] {""} ;
      P05AR7_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      AV52Matricula = "" ;
      AV77VReoExt_2 = "" ;
      P05AR9_A1206TubCod = new short[1] ;
      P05AR9_n1206TubCod = new boolean[] {false} ;
      P05AR9_A396EmprCod = new String[] {""} ;
      P05AR9_A30AlbProCod = new long[1] ;
      P05AR9_A224BarTraP1 = new short[1] ;
      P05AR9_A225BarTraP2 = new short[1] ;
      P05AR9_A226BarTraP3 = new short[1] ;
      P05AR9_A136BarColNum = new int[1] ;
      P05AR9_A1207TubNom = new String[] {""} ;
      P05AR9_n1207TubNom = new boolean[] {false} ;
      P05AR9_A1235BarNumCli = new int[1] ;
      P05AR9_A1234BarNomCli = new String[] {""} ;
      P05AR9_A1652BarSerDsc = new String[] {""} ;
      P05AR9_A3271AlbHdrAnc = new short[1] ;
      P05AR9_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AR9_A148BarEstReo = new byte[1] ;
      P05AR9_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AR9_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AR9_A5019AlbHdrgm2 = new short[1] ;
      P05AR9_A217BarTipArt = new short[1] ;
      P05AR9_n217BarTipArt = new boolean[] {false} ;
      P05AR9_A4812BarEncCli = new String[] {""} ;
      P05AR9_A361DisCod = new int[1] ;
      P05AR9_A1266BarAlbTub = new int[1] ;
      P05AR9_A130BarCodPar = new String[] {""} ;
      P05AR9_A132BarCodReo = new byte[1] ;
      P05AR9_A129BarCod = new int[1] ;
      P05AR9_A4815AlbEncCli = new String[] {""} ;
      P05AR9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05AR9_n166BarKgm = new boolean[] {false} ;
      A1207TubNom = "" ;
      A1234BarNomCli = "" ;
      A1652BarSerDsc = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A130BarCodPar = "" ;
      A4815AlbEncCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV115vCompo = "" ;
      AV55Hdr = "" ;
      AV56KgsE = DecimalUtil.ZERO ;
      AV61TubNom_1 = "" ;
      AV98BarNumCli = "" ;
      AV99ColNum_a = "" ;
      AV118color13 = "" ;
      AV62Color_cli = "" ;
      AV63SerDsc_1 = "" ;
      AV72Kilos_Ini = DecimalUtil.ZERO ;
      AV73Var_kgs = "" ;
      AV76vReoExt = "" ;
      AV91Kgs = DecimalUtil.ZERO ;
      AV92Mts = DecimalUtil.ZERO ;
      AV93Grm2 = "" ;
      AV96Texto_f = "" ;
      AV90TipArtDsc = "" ;
      AV104Enccli = "" ;
      AV105DisPreKgm = DecimalUtil.ZERO ;
      AV106Dispremtr = DecimalUtil.ZERO ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new long[1] ;
      Gx_msg = "" ;
      GXv_char3 = new String[1] ;
      AV101vLey = "" ;
      AV24CliEDom = "" ;
      AV26CliEPob = "" ;
      AV25CliEcp = "" ;
      AV70PrvDsc = "" ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      P05AR11_A781PrvCod = new short[1] ;
      P05AR11_A396EmprCod = new String[] {""} ;
      P05AR11_A252CliCod = new int[1] ;
      P05AR11_A279CliNom = new String[] {""} ;
      P05AR11_A3644CliNom1 = new String[] {""} ;
      P05AR11_A260CliDom = new String[] {""} ;
      P05AR11_A256CliCp = new String[] {""} ;
      P05AR11_n256CliCp = new boolean[] {false} ;
      P05AR11_A295CliPob = new String[] {""} ;
      P05AR11_A278CliNif = new String[] {""} ;
      P05AR11_A787PrvDsc = new String[] {""} ;
      P05AR11_n787PrvDsc = new boolean[] {false} ;
      A279CliNom = "" ;
      A3644CliNom1 = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A787PrvDsc = "" ;
      AV97CliNom12 = "" ;
      AV110Prvdsc1 = "" ;
      P05AR12_A396EmprCod = new String[] {""} ;
      P05AR12_A266CliEnvLin = new byte[1] ;
      P05AR12_A252CliCod = new int[1] ;
      P05AR12_A267CliEnvNom = new String[] {""} ;
      P05AR12_A265CliEnvDom = new String[] {""} ;
      P05AR12_A264CliEnvCp = new String[] {""} ;
      P05AR12_A268CliEnvPob = new String[] {""} ;
      P05AR12_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P05AR13_A781PrvCod = new short[1] ;
      P05AR13_A787PrvDsc = new String[] {""} ;
      P05AR13_n787PrvDsc = new boolean[] {false} ;
      A257CliCue = "" ;
      AV89CliAlfa = "" ;
      P05AR14_A396EmprCod = new String[] {""} ;
      P05AR14_A252CliCod = new int[1] ;
      P05AR14_A257CliCue = new String[] {""} ;
      P05AR15_A396EmprCod = new String[] {""} ;
      P05AR15_A829TipArtCod = new short[1] ;
      P05AR15_A830TipArtDsc = new String[] {""} ;
      P05AR15_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedtxguia__default(),
         new Object[] {
             new Object[] {
            P05AR2_A1253EmprGuiRem, P05AR2_A840TrnCod, P05AR2_A396EmprCod, P05AR2_A30AlbProCod, P05AR2_A1243GuiRemCli, P05AR2_A1259AlbDomEnv, P05AR2_n1259AlbDomEnv, P05AR2_A39AlbProPri, P05AR2_A3868AlbMat, P05AR2_A3865AlbHorSal,
            P05AR2_A34AlbProfch, P05AR2_A10017AlbFmd, P05AR2_n10017AlbFmd, P05AR2_A7101AlbLic, P05AR2_A4023AlbFecSal, P05AR2_A2242AlbSec, P05AR2_A1879AlbProEnt, P05AR2_n1879AlbProEnt, P05AR2_A33AlbProEst, P05AR2_A1782AlbProEso,
            P05AR2_A5140AlbMarca
            }
            , new Object[] {
            P05AR3_A953IvaCod, P05AR3_n953IvaCod, P05AR3_A407EmprNom, P05AR3_n407EmprNom
            }
            , new Object[] {
            P05AR4_A588IvaPor, P05AR4_n588IvaPor
            }
            , new Object[] {
            P05AR5_A841TrnNom, P05AR5_n841TrnNom
            }
            , new Object[] {
            P05AR6_A2748CliAlias, P05AR6_n2748CliAlias, P05AR6_A4828CliCp2, P05AR6_n4828CliCp2, P05AR6_A256CliCp, P05AR6_n256CliCp
            }
            , new Object[] {
            P05AR7_A396EmprCod, P05AR7_A30AlbProCod, P05AR7_A916AlbPObs, P05AR7_A915AlbPObsLin
            }
            , new Object[] {
            P05AR9_A1206TubCod, P05AR9_n1206TubCod, P05AR9_A396EmprCod, P05AR9_A30AlbProCod, P05AR9_A224BarTraP1, P05AR9_A225BarTraP2, P05AR9_A226BarTraP3, P05AR9_A136BarColNum, P05AR9_A1207TubNom, P05AR9_n1207TubNom,
            P05AR9_A1235BarNumCli, P05AR9_A1234BarNomCli, P05AR9_A1652BarSerDsc, P05AR9_A3271AlbHdrAnc, P05AR9_A2827BarKgsLot, P05AR9_A148BarEstReo, P05AR9_A1261BarAlbKgmE, P05AR9_A1263BarAlbMtrE, P05AR9_A5019AlbHdrgm2, P05AR9_A217BarTipArt,
            P05AR9_n217BarTipArt, P05AR9_A4812BarEncCli, P05AR9_A361DisCod, P05AR9_A1266BarAlbTub, P05AR9_A130BarCodPar, P05AR9_A132BarCodReo, P05AR9_A129BarCod, P05AR9_A4815AlbEncCli, P05AR9_A166BarKgm, P05AR9_n166BarKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P05AR11_A781PrvCod, P05AR11_A396EmprCod, P05AR11_A252CliCod, P05AR11_A279CliNom, P05AR11_A3644CliNom1, P05AR11_A260CliDom, P05AR11_A256CliCp, P05AR11_A295CliPob, P05AR11_A278CliNif, P05AR11_A787PrvDsc,
            P05AR11_n787PrvDsc
            }
            , new Object[] {
            P05AR12_A396EmprCod, P05AR12_A266CliEnvLin, P05AR12_A252CliCod, P05AR12_A267CliEnvNom, P05AR12_A265CliEnvDom, P05AR12_A264CliEnvCp, P05AR12_A268CliEnvPob, P05AR12_A270CliEnvPrv
            }
            , new Object[] {
            P05AR13_A781PrvCod, P05AR13_A787PrvDsc, P05AR13_n787PrvDsc
            }
            , new Object[] {
            P05AR14_A396EmprCod, P05AR14_A252CliCod, P05AR14_A257CliCue
            }
            , new Object[] {
            P05AR15_A396EmprCod, P05AR15_A829TipArtCod, P05AR15_A830TipArtDsc, P05AR15_n830TipArtDsc
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
   private byte AV64IvaPor ;
   private byte AV80DiaF ;
   private byte AV82LenVar ;
   private byte AV83MesF ;
   private byte AV49Copias ;
   private byte AV58i ;
   private byte A915AlbPObsLin ;
   private byte AV48ContLine ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV116Space ;
   private byte AV117SpaceCalculado ;
   private byte A266CliEnvLin ;
   private byte AV129GXLvl320 ;
   private short AV102N_copia ;
   private short A840TrnCod ;
   private short AV85AnyF ;
   private short A1206TubCod ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A217BarTipArt ;
   private short AV67Ancho_s ;
   private short AV94Grm2_3 ;
   private short AV95BarTipARt ;
   private short AV113CantTub ;
   private short A781PrvCod ;
   private short A270CliEnvPrv ;
   private short AV71CodPrv ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV16CliCod ;
   private int GX_I ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A361DisCod ;
   private int A1266BarAlbTub ;
   private int A129BarCod ;
   private int AV50barcolnum ;
   private int Gx_OldLine ;
   private int GXv_int5[] ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private long GXv_int8[] ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV56KgsE ;
   private java.math.BigDecimal AV72Kilos_Ini ;
   private java.math.BigDecimal AV91Kgs ;
   private java.math.BigDecimal AV92Mts ;
   private java.math.BigDecimal AV105DisPreKgm ;
   private java.math.BigDecimal AV106Dispremtr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV32Puerto ;
   private String AV100TCopia ;
   private String Gx_out ;
   private String AV60ContDsc ;
   private String AV109Firmad ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A3868AlbMat ;
   private String A3865AlbHorSal ;
   private String A7101AlbLic ;
   private String A2242AlbSec ;
   private String A1879AlbProEnt ;
   private String A5140AlbMarca ;
   private String A953IvaCod ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A2748CliAlias ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String AV29Prioridad ;
   private String AV65AlbMat ;
   private String AV66AlbHorSal ;
   private String AV107Texto_fd ;
   private String AV108Firma4dig ;
   private String AV112AtId ;
   private String AV79Ceros10 ;
   private String AV81DiaA ;
   private String AV84MesA ;
   private String AV87VarAlb ;
   private String AV88NumAlb ;
   private String AV86Fecha_a ;
   private String AV69Cp_1_2 ;
   private String AV21EmprNom ;
   private String AV57VDoc ;
   private String AV103Codigo ;
   private String AV46vCopia ;
   private String AV59vObs[] ;
   private String A916AlbPObs ;
   private String AV52Matricula ;
   private String AV77VReoExt_2 ;
   private String A1207TubNom ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A4812BarEncCli ;
   private String A130BarCodPar ;
   private String A4815AlbEncCli ;
   private String AV115vCompo ;
   private String AV55Hdr ;
   private String AV61TubNom_1 ;
   private String AV98BarNumCli ;
   private String AV99ColNum_a ;
   private String AV118color13 ;
   private String AV62Color_cli ;
   private String AV63SerDsc_1 ;
   private String AV73Var_kgs ;
   private String AV76vReoExt ;
   private String AV93Grm2 ;
   private String AV96Texto_f ;
   private String AV90TipArtDsc ;
   private String AV104Enccli ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String GXv_char3[] ;
   private String AV101vLey ;
   private String AV24CliEDom ;
   private String AV26CliEPob ;
   private String AV25CliEcp ;
   private String AV70PrvDsc ;
   private String AV17CliNom ;
   private String AV18CliDom ;
   private String AV19Clicp ;
   private String AV20CliPob ;
   private String AV47CliNif ;
   private String AV23CliENom ;
   private String A279CliNom ;
   private String A3644CliNom1 ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A787PrvDsc ;
   private String AV97CliNom12 ;
   private String AV110Prvdsc1 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String A257CliCue ;
   private String AV89CliAlfa ;
   private String A830TipArtDsc ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV75AlbProFch ;
   private java.util.Date AV111Albfecsal ;
   private boolean GxHdr2 ;
   private boolean n1259AlbDomEnv ;
   private boolean n10017AlbFmd ;
   private boolean n1879AlbProEnt ;
   private boolean n953IvaCod ;
   private boolean n407EmprNom ;
   private boolean n588IvaPor ;
   private boolean n841TrnNom ;
   private boolean n2748CliAlias ;
   private boolean n4828CliCp2 ;
   private boolean n256CliCp ;
   private boolean returnInSub ;
   private boolean n1206TubCod ;
   private boolean n1207TubNom ;
   private boolean n217BarTipArt ;
   private boolean n166BarKgm ;
   private boolean n787PrvDsc ;
   private boolean n830TipArtDsc ;
   private String A10017AlbFmd ;
   private String[] aP6 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05AR2_A1253EmprGuiRem ;
   private short[] P05AR2_A840TrnCod ;
   private String[] P05AR2_A396EmprCod ;
   private long[] P05AR2_A30AlbProCod ;
   private int[] P05AR2_A1243GuiRemCli ;
   private byte[] P05AR2_A1259AlbDomEnv ;
   private boolean[] P05AR2_n1259AlbDomEnv ;
   private String[] P05AR2_A39AlbProPri ;
   private String[] P05AR2_A3868AlbMat ;
   private String[] P05AR2_A3865AlbHorSal ;
   private java.util.Date[] P05AR2_A34AlbProfch ;
   private String[] P05AR2_A10017AlbFmd ;
   private boolean[] P05AR2_n10017AlbFmd ;
   private String[] P05AR2_A7101AlbLic ;
   private java.util.Date[] P05AR2_A4023AlbFecSal ;
   private String[] P05AR2_A2242AlbSec ;
   private String[] P05AR2_A1879AlbProEnt ;
   private boolean[] P05AR2_n1879AlbProEnt ;
   private byte[] P05AR2_A33AlbProEst ;
   private byte[] P05AR2_A1782AlbProEso ;
   private String[] P05AR2_A5140AlbMarca ;
   private String[] P05AR3_A953IvaCod ;
   private boolean[] P05AR3_n953IvaCod ;
   private String[] P05AR3_A407EmprNom ;
   private boolean[] P05AR3_n407EmprNom ;
   private byte[] P05AR4_A588IvaPor ;
   private boolean[] P05AR4_n588IvaPor ;
   private String[] P05AR5_A841TrnNom ;
   private boolean[] P05AR5_n841TrnNom ;
   private String[] P05AR6_A2748CliAlias ;
   private boolean[] P05AR6_n2748CliAlias ;
   private String[] P05AR6_A4828CliCp2 ;
   private boolean[] P05AR6_n4828CliCp2 ;
   private String[] P05AR6_A256CliCp ;
   private boolean[] P05AR6_n256CliCp ;
   private String[] P05AR7_A396EmprCod ;
   private long[] P05AR7_A30AlbProCod ;
   private String[] P05AR7_A916AlbPObs ;
   private byte[] P05AR7_A915AlbPObsLin ;
   private short[] P05AR9_A1206TubCod ;
   private boolean[] P05AR9_n1206TubCod ;
   private String[] P05AR9_A396EmprCod ;
   private long[] P05AR9_A30AlbProCod ;
   private short[] P05AR9_A224BarTraP1 ;
   private short[] P05AR9_A225BarTraP2 ;
   private short[] P05AR9_A226BarTraP3 ;
   private int[] P05AR9_A136BarColNum ;
   private String[] P05AR9_A1207TubNom ;
   private boolean[] P05AR9_n1207TubNom ;
   private int[] P05AR9_A1235BarNumCli ;
   private String[] P05AR9_A1234BarNomCli ;
   private String[] P05AR9_A1652BarSerDsc ;
   private short[] P05AR9_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P05AR9_A2827BarKgsLot ;
   private byte[] P05AR9_A148BarEstReo ;
   private java.math.BigDecimal[] P05AR9_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P05AR9_A1263BarAlbMtrE ;
   private short[] P05AR9_A5019AlbHdrgm2 ;
   private short[] P05AR9_A217BarTipArt ;
   private boolean[] P05AR9_n217BarTipArt ;
   private String[] P05AR9_A4812BarEncCli ;
   private int[] P05AR9_A361DisCod ;
   private int[] P05AR9_A1266BarAlbTub ;
   private String[] P05AR9_A130BarCodPar ;
   private byte[] P05AR9_A132BarCodReo ;
   private int[] P05AR9_A129BarCod ;
   private String[] P05AR9_A4815AlbEncCli ;
   private java.math.BigDecimal[] P05AR9_A166BarKgm ;
   private boolean[] P05AR9_n166BarKgm ;
   private short[] P05AR11_A781PrvCod ;
   private String[] P05AR11_A396EmprCod ;
   private int[] P05AR11_A252CliCod ;
   private String[] P05AR11_A279CliNom ;
   private String[] P05AR11_A3644CliNom1 ;
   private String[] P05AR11_A260CliDom ;
   private String[] P05AR11_A256CliCp ;
   private boolean[] P05AR11_n256CliCp ;
   private String[] P05AR11_A295CliPob ;
   private String[] P05AR11_A278CliNif ;
   private String[] P05AR11_A787PrvDsc ;
   private boolean[] P05AR11_n787PrvDsc ;
   private String[] P05AR12_A396EmprCod ;
   private byte[] P05AR12_A266CliEnvLin ;
   private int[] P05AR12_A252CliCod ;
   private String[] P05AR12_A267CliEnvNom ;
   private String[] P05AR12_A265CliEnvDom ;
   private String[] P05AR12_A264CliEnvCp ;
   private String[] P05AR12_A268CliEnvPob ;
   private short[] P05AR12_A270CliEnvPrv ;
   private short[] P05AR13_A781PrvCod ;
   private String[] P05AR13_A787PrvDsc ;
   private boolean[] P05AR13_n787PrvDsc ;
   private String[] P05AR14_A396EmprCod ;
   private int[] P05AR14_A252CliCod ;
   private String[] P05AR14_A257CliCue ;
   private String[] P05AR15_A396EmprCod ;
   private short[] P05AR15_A829TipArtCod ;
   private String[] P05AR15_A830TipArtDsc ;
   private boolean[] P05AR15_n830TipArtDsc ;
}

final  class pedtxguia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05AR2", "SELECT EmprGuiRem, TrnCod, EmprCod, AlbProCod, GuiRemCli, AlbDomEnv, AlbProPri, AlbMat, AlbHorSal, AlbProfch, AlbFmd, AlbLic, AlbFecSal, AlbSec, AlbProEnt, AlbProEst, AlbProEso, AlbMarca FROM TXPCALPRD WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?)  FOR UPDATE OF AlbProEst, AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR3", "SELECT IvaCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR4", "SELECT IvaPor FROM TXPTIPIVA WHERE IvaCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR5", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR6", "SELECT CliAlias, CliCp2, CliCp FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR7", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AR9", "SELECT T1.TubCod, T1.EmprCod, T1.AlbProCod, T3.BarTraP1, T3.BarTraP2, T3.BarTraP3, T3.BarColNum, T2.TubNom, T3.BarNumCli, T3.BarNomCli, T3.BarSerDsc, T1.AlbHdrAnc, T3.BarKgsLot, T3.BarEstReo, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.AlbHdrgm2, T3.BarTipArt, T3.BarEncCli, T3.DisCod, T1.BarAlbTub, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbEncCli, COALESCE( T4.BarKgm, 0) AS BarKgm FROM (((TXPALBBAR T1 LEFT JOIN TXPTUBOS T2 ON T2.EmprCod = T1.EmprCod AND T2.TubCod = T1.TubCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.AlbProCod = ?) ORDER BY T1.AlbEncCli, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05AR10", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P05AR11", "SELECT T1.PrvCod, T1.EmprCod, T1.CliCod, T1.CliNom, T1.CliNom1, T1.CliDom, T1.CliCp, T1.CliPob, T1.CliNif, T2.PrvDsc FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR12", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR13", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR14", "SELECT EmprCod, CliCod, CliCue FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05AR15", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 20);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((String[]) buf[16])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((String[]) buf[20])[0] = rslt.getString(18, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 20);
               ((int[]) buf[22])[0] = rslt.getInt(20);
               ((int[]) buf[23])[0] = rslt.getInt(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 20);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

