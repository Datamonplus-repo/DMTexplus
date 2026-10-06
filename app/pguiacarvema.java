package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pguiacarvema extends GXReport
{
   public pguiacarvema( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pguiacarvema.class ), "" );
   }

   public pguiacarvema( int remoteHandle ,
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
      pguiacarvema.this.aP4 = new String[] {""};
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
      pguiacarvema.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pguiacarvema.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pguiacarvema.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      pguiacarvema.this.AV51TextoCopia = aP3[0];
      this.aP3 = aP3;
      pguiacarvema.this.Gx_out = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 12 ;
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
         getPrinter().GxSetDocName("Guia Carvema") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*12)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV60ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRCARV", ""), GXv_char1) ;
         pguiacarvema.this.AV60ContDsc = GXv_char1[0] ;
         GXt_char2 = AV71FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pguiacarvema.this.A396EmprCod = GXv_char1[0] ;
         pguiacarvema.this.GXt_char2 = GXv_char4[0] ;
         AV71FirmaD = GXt_char2 ;
         GxHdr2 = true ;
         /* Using cursor P052M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1253EmprGuiRem = P052M2_A1253EmprGuiRem[0] ;
            A840TrnCod = P052M2_A840TrnCod[0] ;
            A1243GuiRemCli = P052M2_A1243GuiRemCli[0] ;
            A1259AlbDomEnv = P052M2_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P052M2_n1259AlbDomEnv[0] ;
            A39AlbProPri = P052M2_A39AlbProPri[0] ;
            A841TrnNom = P052M2_A841TrnNom[0] ;
            n841TrnNom = P052M2_n841TrnNom[0] ;
            A3865AlbHorSal = P052M2_A3865AlbHorSal[0] ;
            A3868AlbMat = P052M2_A3868AlbMat[0] ;
            A10017AlbFmd = P052M2_A10017AlbFmd[0] ;
            n10017AlbFmd = P052M2_n10017AlbFmd[0] ;
            A7101AlbLic = P052M2_A7101AlbLic[0] ;
            A34AlbProfch = P052M2_A34AlbProfch[0] ;
            A407EmprNom = P052M2_A407EmprNom[0] ;
            n407EmprNom = P052M2_n407EmprNom[0] ;
            A1879AlbProEnt = P052M2_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P052M2_n1879AlbProEnt[0] ;
            A33AlbProEst = P052M2_A33AlbProEst[0] ;
            A1782AlbProEso = P052M2_A1782AlbProEso[0] ;
            A5649CliDom2 = P052M2_A5649CliDom2[0] ;
            n5649CliDom2 = P052M2_n5649CliDom2[0] ;
            A295CliPob = P052M2_A295CliPob[0] ;
            n295CliPob = P052M2_n295CliPob[0] ;
            A260CliDom = P052M2_A260CliDom[0] ;
            n260CliDom = P052M2_n260CliDom[0] ;
            A5649CliDom2 = P052M2_A5649CliDom2[0] ;
            n5649CliDom2 = P052M2_n5649CliDom2[0] ;
            A295CliPob = P052M2_A295CliPob[0] ;
            n295CliPob = P052M2_n295CliPob[0] ;
            A260CliDom = P052M2_A260CliDom[0] ;
            n260CliDom = P052M2_n260CliDom[0] ;
            A407EmprNom = P052M2_A407EmprNom[0] ;
            n407EmprNom = P052M2_n407EmprNom[0] ;
            A841TrnNom = P052M2_A841TrnNom[0] ;
            n841TrnNom = P052M2_n841TrnNom[0] ;
            AV16CliCod = A1243GuiRemCli ;
            AV22CliEnvDom = A1259AlbDomEnv ;
            AV29Prioridad = A39AlbProPri ;
            AV83TransNom = A841TrnNom ;
            AV84AlbHorSal = A3865AlbHorSal ;
            AV85Albmat = A3868AlbMat ;
            AV70Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV69Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV70Texto_fd = AV69Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV71FirmaD) ;
            }
            else
            {
               AV70Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            if ( GXutil.strcmp(A7101AlbLic, " ") > 0 )
            {
               AV72AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            /* Execute user subroutine: 'PAGO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'CLIENTE' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV80FechaAlb = GXutil.str( GXutil.day( A34AlbProfch), 2, 0) + " " + localUtil.cmonth( A34AlbProfch, httpContext.getMessage( "por", "")) + " " + GXutil.str( GXutil.year( A34AlbProfch), 4, 0) ;
            AV21EmprNom = A407EmprNom ;
            AV57VDoc = httpContext.getMessage( "Guia de Remessa Nº", "") ;
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
            /* Using cursor P052M3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A916AlbPObs = P052M3_A916AlbPObs[0] ;
               A915AlbPObsLin = P052M3_A915AlbPObsLin[0] ;
               if ( AV58i > 2 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV59vObs[AV58i-1] = A916AlbPObs ;
               AV58i = (byte)(AV58i+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV48ContLine = (byte)(0) ;
            AV52Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            /* Using cursor P052M4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A130BarCodPar = P052M4_A130BarCodPar[0] ;
               A132BarCodReo = P052M4_A132BarCodReo[0] ;
               A129BarCod = P052M4_A129BarCod[0] ;
               A361DisCod = P052M4_A361DisCod[0] ;
               A136BarColNum = P052M4_A136BarColNum[0] ;
               A1261BarAlbKgmE = P052M4_A1261BarAlbKgmE[0] ;
               A1263BarAlbMtrE = P052M4_A1263BarAlbMtrE[0] ;
               A1262BarPreKgm = P052M4_A1262BarPreKgm[0] ;
               A1264BarPreMtr = P052M4_A1264BarPreMtr[0] ;
               A212BarSer = P052M4_A212BarSer[0] ;
               A135BarColNom = P052M4_A135BarColNom[0] ;
               A1265BarAlbPie = P052M4_A1265BarAlbPie[0] ;
               A1234BarNomCli = P052M4_A1234BarNomCli[0] ;
               A252CliCod = P052M4_A252CliCod[0] ;
               n252CliCod = P052M4_n252CliCod[0] ;
               A143BarDisNum = P052M4_A143BarDisNum[0] ;
               A361DisCod = P052M4_A361DisCod[0] ;
               A136BarColNum = P052M4_A136BarColNum[0] ;
               A212BarSer = P052M4_A212BarSer[0] ;
               A135BarColNom = P052M4_A135BarColNom[0] ;
               A1234BarNomCli = P052M4_A1234BarNomCli[0] ;
               A252CliCod = P052M4_A252CliCod[0] ;
               n252CliCod = P052M4_n252CliCod[0] ;
               A143BarDisNum = P052M4_A143BarDisNum[0] ;
               AV87Norm = "" ;
               /* Using cursor P052M5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A13213DisNormID = P052M5_A13213DisNormID[0] ;
                  if ( GXutil.strcmp(AV87Norm, "") == 0 )
                  {
                     AV87Norm = GXutil.trim( A13213DisNormID) ;
                  }
                  else
                  {
                     AV87Norm += "/" + GXutil.trim( A13213DisNormID) ;
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               AV50barcolnum = A136BarColNum ;
               AV55Hdr = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               AV56KgsE = A1261BarAlbKgmE ;
               AV63BarAlbMtre = A1263BarAlbMtrE ;
               AV62BarPreKgm = A1262BarPreKgm ;
               AV64BarPreMtr = A1264BarPreMtr ;
               h52M0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Hdr, "")), 133, Gx_line+0, 214, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")), 476, Gx_line+0, 521, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 373, Gx_line+0, 469, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 220, Gx_line+0, 338, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 70, Gx_line+0, 129, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56KgsE, "ZZZ9.99")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62BarPreKgm, "Z9.99")), 593, Gx_line+0, 638, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Norm, "")), 340, Gx_line+1, 370, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               if ( ( ( A252CliCod == 211331 ) || ( A252CliCod == 211335 ) ) && ( GXutil.strcmp(A1234BarNomCli, " ") != 0 ) )
               {
                  h52M0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 373, Gx_line+1, 469, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  AV48ContLine = (byte)(AV48ContLine+1) ;
               }
               AV48ContLine = (byte)(AV48ContLine+1) ;
               AV53TotPzas = (int)(AV53TotPzas+A1265BarAlbPie) ;
               AV54TotKgs = AV54TotKgs.add(A1261BarAlbKgmE) ;
               /* Using cursor P052M6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A457FasCod = P052M6_A457FasCod[0] ;
                  A460FasDsc = P052M6_A460FasDsc[0] ;
                  A1241GuiFasPKg = P052M6_A1241GuiFasPKg[0] ;
                  A1242GuiFasPMt = P052M6_A1242GuiFasPMt[0] ;
                  A1276FasMtr = P052M6_A1276FasMtr[0] ;
                  A1275FasKgm = P052M6_A1275FasKgm[0] ;
                  A1240GuiFasLin = P052M6_A1240GuiFasLin[0] ;
                  A460FasDsc = P052M6_A460FasDsc[0] ;
                  AV61FasDsc = A460FasDsc ;
                  AV65GuiFasPkg = A1241GuiFasPKg ;
                  AV66GuiFasPMt = A1242GuiFasPMt ;
                  AV67FasMtr_1 = A1276FasMtr ;
                  AV68FasKgm_1 = A1275FasKgm ;
                  if ( ( A1275FasKgm.doubleValue() == 0 ) && ( A1276FasMtr.doubleValue() == 0 ) )
                  {
                     h52M0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61FasDsc, "")), 220, Gx_line+0, 367, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68FasKgm_1, "ZZZZ.ZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65GuiFasPkg, "ZZ.ZZ")), 593, Gx_line+1, 638, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     if ( A1275FasKgm.doubleValue() > 0 )
                     {
                        h52M0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61FasDsc, "")), 220, Gx_line+0, 367, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68FasKgm_1, "ZZZZ.ZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65GuiFasPkg, "ZZ.ZZ")), 593, Gx_line+1, 638, Gx_line+18, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     if ( A1276FasMtr.doubleValue() > 0 )
                     {
                        h52M0( false, 18) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61FasDsc, "")), 220, Gx_line+0, 367, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67FasMtr_1, "ZZZZ.ZZ")), 651, Gx_line+0, 703, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66GuiFasPMt, "ZZ.ZZ")), 717, Gx_line+1, 762, Gx_line+18, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+18) ;
                     }
                  }
                  AV48ContLine = (byte)(AV48ContLine+1) ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            /* Using cursor P052M7 */
            pr_default.execute(5, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h52M0( true, 0) ;
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
      /* 'PAGO' Routine */
      returnInSub = false ;
      /* Using cursor P052M8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), AV29Prioridad});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A497FpgCod = P052M8_A497FpgCod[0] ;
         A297CliPri = P052M8_A297CliPri[0] ;
         A252CliCod = P052M8_A252CliCod[0] ;
         n252CliCod = P052M8_n252CliCod[0] ;
         A498FpgDsc = P052M8_A498FpgDsc[0] ;
         n498FpgDsc = P052M8_n498FpgDsc[0] ;
         A498FpgDsc = P052M8_A498FpgDsc[0] ;
         n498FpgDsc = P052M8_n498FpgDsc[0] ;
         AV30FpgDsc = A498FpgDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
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
      /* Using cursor P052M9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A252CliCod = P052M9_A252CliCod[0] ;
         n252CliCod = P052M9_n252CliCod[0] ;
         A3630CliPort = P052M9_A3630CliPort[0] ;
         A279CliNom = P052M9_A279CliNom[0] ;
         A3644CliNom1 = P052M9_A3644CliNom1[0] ;
         A5649CliDom2 = P052M9_A5649CliDom2[0] ;
         n5649CliDom2 = P052M9_n5649CliDom2[0] ;
         A260CliDom = P052M9_A260CliDom[0] ;
         n260CliDom = P052M9_n260CliDom[0] ;
         A4828CliCp2 = P052M9_A4828CliCp2[0] ;
         A256CliCp = P052M9_A256CliCp[0] ;
         A295CliPob = P052M9_A295CliPob[0] ;
         n295CliPob = P052M9_n295CliPob[0] ;
         A278CliNif = P052M9_A278CliNif[0] ;
         AV86CliPort = A3630CliPort ;
         AV17CliNom = A279CliNom ;
         AV75CliNom1 = A3644CliNom1 ;
         AV73CliNom3 = GXutil.trim( A279CliNom) + GXutil.trim( AV75CliNom1) ;
         AV76Clidom50 = GXutil.trim( A260CliDom) + GXutil.trim( A5649CliDom2) ;
         AV74Cpostal = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV20CliPob = A295CliPob ;
         AV47CliNif = A278CliNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      /* Execute user subroutine: 'ENVIO' */
      S131 ();
      if (returnInSub) return;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P052M10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV16CliCod), Byte.valueOf(AV22CliEnvDom)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A266CliEnvLin = P052M10_A266CliEnvLin[0] ;
         A252CliCod = P052M10_A252CliCod[0] ;
         n252CliCod = P052M10_n252CliCod[0] ;
         A267CliEnvNom = P052M10_A267CliEnvNom[0] ;
         A265CliEnvDom = P052M10_A265CliEnvDom[0] ;
         A264CliEnvCp = P052M10_A264CliEnvCp[0] ;
         A268CliEnvPob = P052M10_A268CliEnvPob[0] ;
         AV23CliENom = A267CliEnvNom ;
         AV24CliEDom = A265CliEnvDom ;
         AV25CliEcp = A264CliEnvCp ;
         AV26CliEPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void h52M0( boolean bFoot ,
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
               getPrinter().GxAttris("Calibri", 7, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Só se aceitam reclamações no prazo de 15 dias.Atenção para verificarem a qualidade do tingimento, visto que não aceitamos reclamações depois da malha utilizada.", ""), 89, Gx_line+6, 738, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Carga", ""), 71, Gx_line+31, 105, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NOSSA MORADA", ""), 164, Gx_line+30, 254, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descarga", ""), 71, Gx_line+45, 125, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MORADA DO CLIENTE", ""), 164, Gx_line+46, 275, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Obs", ""), 71, Gx_line+69, 95, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[1-1], "")), 164, Gx_line+69, 425, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59vObs[2-1], "")), 164, Gx_line+86, 425, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Viatura", ""), 556, Gx_line+31, 598, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TransNom, "")), 625, Gx_line+30, 730, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(55, Gx_line+20, 769, Gx_line+104, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Texto_fd, "")), 55, Gx_line+107, 342, Gx_line+123, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72AtId, "")), 613, Gx_line+108, 770, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(55, Gx_line+126, 769, Gx_line+126, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 556, Gx_line+47, 609, Gx_line+62, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Albmat, "")), 625, Gx_line+46, 730, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Jer - Jersey; Rib - Ribe; Co - Algodão; Ly - Lycra; Pes - Polyester; Arg - Argola;Int - Interlock; Vis - Viscose; Piq - Piquet; Mal - Malha; Pa - Poliamida;Mod - Modal; Tec - Tecido; ", ""), 55, Gx_line+129, 717, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PGM - Penteado;Gazado e Mercerizado; Gol - Golas; Tir - Tiras; Lin - Linho; Bam - Bambu;Pac - Acrílico; PG - Penteado e Gazado; Red - Rede; Sed - Seda; Cor - Cordão;", ""), 55, Gx_line+142, 697, Gx_line+156, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lyo - Lyocell; Ten - Tencel; Tul - Tule;Ray - Rayon; Ren - Renda; PP - Polipropileno;Lu - Lurex; Ela - Elastano.", ""), 55, Gx_line+155, 464, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60ContDsc, "")), 55, Gx_line+173, 160, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(55, Gx_line+170, 769, Gx_line+170, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(55, Gx_line+64, 769, Gx_line+64, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+189) ;
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
               if ( GXutil.strcmp(A5649CliDom2, " ") == 0 )
               {
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Exmo.(s) Sr.(s)", ""), 409, Gx_line+200, 494, Gx_line+216, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73CliNom3, "")), 409, Gx_line+234, 723, Gx_line+252, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliPob, "")), 494, Gx_line+273, 683, Gx_line+291, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Clidom50, "")), 409, Gx_line+254, 723, Gx_line+272, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Cpostal, "")), 409, Gx_line+273, 491, Gx_line+291, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 641, Gx_line+367, 736, Gx_line+387, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(55, Gx_line+390, 769, Gx_line+416, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data de Emissão", ""), 84, Gx_line+394, 184, Gx_line+410, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/Nº Contribuinte", ""), 544, Gx_line+394, 644, Gx_line+410, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 531, Gx_line+419, 657, Gx_line+437, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80FechaAlb, "")), 84, Gx_line+419, 241, Gx_line+437, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(768, Gx_line+415, 768, Gx_line+440, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(55, Gx_line+414, 55, Gx_line+440, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(55, Gx_line+439, 769, Gx_line+439, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TextoCopia, "")), 139, Gx_line+368, 234, Gx_line+386, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 448, Gx_line+367, 616, Gx_line+387, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 55, Gx_line+368, 78, Gx_line+383, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 84, Gx_line+368, 129, Gx_line+385, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9")), 704, Gx_line+419, 749, Gx_line+437, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Carvema Têxtil, Lda.", ""), 55, Gx_line+33, 384, Gx_line+72, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rua António Carvalho, 2", ""), 55, Gx_line+77, 171, Gx_line+90, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Perelhal - BARCELOS", ""), 55, Gx_line+91, 157, Gx_line+104, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "4750 - 625 Perelhal - PORTUGAL", ""), 55, Gx_line+103, 205, Gx_line+116, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TEL.: 351 253 860 030", ""), 55, Gx_line+116, 155, Gx_line+129, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FAX.: 351 253 860 039", ""), 55, Gx_line+127, 155, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "email: carvema@carvema.pt", ""), 55, Gx_line+140, 186, Gx_line+153, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "www.carvema.pt", ""), 55, Gx_line+153, 132, Gx_line+166, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE Nº PT 500 057 095 - SOCIEDADE POR QUOTAS", ""), 55, Gx_line+173, 345, Gx_line+186, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "MATRICULADA NA CONS. R. C. DE BARCELOS SOB. O Nº 319", ""), 55, Gx_line+183, 341, Gx_line+196, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CAPITAL SOCIAL € 2.000.000,00 REALIZADO", ""), 55, Gx_line+195, 257, Gx_line+208, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hora de Carga", ""), 324, Gx_line+394, 409, Gx_line+410, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84AlbHorSal, "")), 313, Gx_line+419, 422, Gx_line+437, 1+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+445) ;
               }
               else
               {
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Exmo.(s) Sr.(s)", ""), 407, Gx_line+209, 492, Gx_line+225, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73CliNom3, "")), 407, Gx_line+244, 721, Gx_line+262, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliPob, "")), 486, Gx_line+300, 675, Gx_line+318, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 407, Gx_line+264, 621, Gx_line+282, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Cpostal, "")), 407, Gx_line+300, 489, Gx_line+318, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 639, Gx_line+376, 734, Gx_line+396, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(55, Gx_line+399, 769, Gx_line+425, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data de Emissão", ""), 82, Gx_line+403, 182, Gx_line+419, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "V/Nº Contribuinte", ""), 542, Gx_line+403, 642, Gx_line+419, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47CliNif, "@!")), 529, Gx_line+428, 655, Gx_line+446, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80FechaAlb, "")), 82, Gx_line+428, 239, Gx_line+446, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(768, Gx_line+428, 768, Gx_line+453, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(55, Gx_line+423, 55, Gx_line+449, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(55, Gx_line+448, 769, Gx_line+448, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TextoCopia, "")), 136, Gx_line+377, 231, Gx_line+395, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57VDoc, "")), 446, Gx_line+376, 614, Gx_line+396, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 53, Gx_line+377, 76, Gx_line+392, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 82, Gx_line+377, 127, Gx_line+394, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9")), 702, Gx_line+428, 747, Gx_line+446, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Carvema Têxtil, Lda.", ""), 55, Gx_line+43, 384, Gx_line+82, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rua António Carvalho, 2", ""), 55, Gx_line+86, 171, Gx_line+99, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Perelhal - BARCELOS", ""), 55, Gx_line+100, 157, Gx_line+113, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "4750 - 625 Perelhal - PORTUGAL", ""), 55, Gx_line+113, 205, Gx_line+126, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TEL.: 351 253 860 030", ""), 55, Gx_line+125, 155, Gx_line+138, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FAX.: 351 253 860 039", ""), 55, Gx_line+136, 155, Gx_line+149, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "email: carvema@carvema.pt", ""), 55, Gx_line+149, 186, Gx_line+162, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "www.carvema.pt", ""), 55, Gx_line+163, 132, Gx_line+176, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CONTRIBUINTE Nº PT 500 057 095 - SOCIEDADE POR QUOTAS", ""), 55, Gx_line+182, 345, Gx_line+195, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "MATRICULADA NA CONS. R. C. DE BARCELOS SOB. O Nº 319", ""), 55, Gx_line+193, 341, Gx_line+206, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "CAPITAL SOCIAL € 2.000.000,00 REALIZADO", ""), 55, Gx_line+204, 257, Gx_line+217, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 407, Gx_line+282, 596, Gx_line+300, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hora de Carga", ""), 319, Gx_line+403, 404, Gx_line+419, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84AlbHorSal, "")), 307, Gx_line+427, 416, Gx_line+445, 1+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+455) ;
               }
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Doc", ""), 81, Gx_line+6, 116, Gx_line+22, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 165, Gx_line+6, 184, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 228, Gx_line+6, 328, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 410, Gx_line+6, 432, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 482, Gx_line+6, 521, Gx_line+22, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 539, Gx_line+6, 578, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "P.Uni", ""), 601, Gx_line+6, 630, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 660, Gx_line+6, 703, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "P.Uni", ""), 730, Gx_line+6, 759, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(55, Gx_line+2, 769, Gx_line+26, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+29) ;
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
      this.aP0[0] = pguiacarvema.this.A396EmprCod;
      this.aP1[0] = pguiacarvema.this.A30AlbProCod;
      this.aP2[0] = pguiacarvema.this.AV15ImpCod;
      this.aP3[0] = pguiacarvema.this.AV51TextoCopia;
      this.aP4[0] = pguiacarvema.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pguiacarvema");
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
      AV71FirmaD = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P052M2_A1253EmprGuiRem = new String[] {""} ;
      P052M2_A840TrnCod = new short[1] ;
      P052M2_A396EmprCod = new String[] {""} ;
      P052M2_A30AlbProCod = new long[1] ;
      P052M2_A1243GuiRemCli = new int[1] ;
      P052M2_A1259AlbDomEnv = new byte[1] ;
      P052M2_n1259AlbDomEnv = new boolean[] {false} ;
      P052M2_A39AlbProPri = new String[] {""} ;
      P052M2_A841TrnNom = new String[] {""} ;
      P052M2_n841TrnNom = new boolean[] {false} ;
      P052M2_A3865AlbHorSal = new String[] {""} ;
      P052M2_A3868AlbMat = new String[] {""} ;
      P052M2_A10017AlbFmd = new String[] {""} ;
      P052M2_n10017AlbFmd = new boolean[] {false} ;
      P052M2_A7101AlbLic = new String[] {""} ;
      P052M2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P052M2_A407EmprNom = new String[] {""} ;
      P052M2_n407EmprNom = new boolean[] {false} ;
      P052M2_A1879AlbProEnt = new String[] {""} ;
      P052M2_n1879AlbProEnt = new boolean[] {false} ;
      P052M2_A33AlbProEst = new byte[1] ;
      P052M2_A1782AlbProEso = new byte[1] ;
      P052M2_A5649CliDom2 = new String[] {""} ;
      P052M2_n5649CliDom2 = new boolean[] {false} ;
      P052M2_A295CliPob = new String[] {""} ;
      P052M2_n295CliPob = new boolean[] {false} ;
      P052M2_A260CliDom = new String[] {""} ;
      P052M2_n260CliDom = new boolean[] {false} ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A841TrnNom = "" ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A407EmprNom = "" ;
      A1879AlbProEnt = "" ;
      A5649CliDom2 = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      AV29Prioridad = "" ;
      AV83TransNom = "" ;
      AV84AlbHorSal = "" ;
      AV85Albmat = "" ;
      AV70Texto_fd = "" ;
      AV69Firma4dig = "" ;
      AV72AtId = "" ;
      AV80FechaAlb = "" ;
      AV21EmprNom = "" ;
      AV57VDoc = "" ;
      AV46vCopia = "" ;
      AV59vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV59vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P052M3_A396EmprCod = new String[] {""} ;
      P052M3_A30AlbProCod = new long[1] ;
      P052M3_A916AlbPObs = new String[] {""} ;
      P052M3_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      AV52Matricula = "" ;
      P052M4_A396EmprCod = new String[] {""} ;
      P052M4_A30AlbProCod = new long[1] ;
      P052M4_A130BarCodPar = new String[] {""} ;
      P052M4_A132BarCodReo = new byte[1] ;
      P052M4_A129BarCod = new int[1] ;
      P052M4_A361DisCod = new int[1] ;
      P052M4_A136BarColNum = new int[1] ;
      P052M4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052M4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052M4_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052M4_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052M4_A212BarSer = new String[] {""} ;
      P052M4_A135BarColNom = new String[] {""} ;
      P052M4_A1265BarAlbPie = new int[1] ;
      P052M4_A1234BarNomCli = new String[] {""} ;
      P052M4_A252CliCod = new int[1] ;
      P052M4_n252CliCod = new boolean[] {false} ;
      P052M4_A143BarDisNum = new String[] {""} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      AV87Norm = "" ;
      P052M5_A396EmprCod = new String[] {""} ;
      P052M5_A361DisCod = new int[1] ;
      P052M5_A13213DisNormID = new String[] {""} ;
      A13213DisNormID = "" ;
      AV55Hdr = "" ;
      AV56KgsE = DecimalUtil.ZERO ;
      AV63BarAlbMtre = DecimalUtil.ZERO ;
      AV62BarPreKgm = DecimalUtil.ZERO ;
      AV64BarPreMtr = DecimalUtil.ZERO ;
      AV54TotKgs = DecimalUtil.ZERO ;
      P052M6_A457FasCod = new String[] {""} ;
      P052M6_A396EmprCod = new String[] {""} ;
      P052M6_A30AlbProCod = new long[1] ;
      P052M6_A129BarCod = new int[1] ;
      P052M6_A132BarCodReo = new byte[1] ;
      P052M6_A130BarCodPar = new String[] {""} ;
      P052M6_A460FasDsc = new String[] {""} ;
      P052M6_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052M6_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052M6_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052M6_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P052M6_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      AV61FasDsc = "" ;
      AV65GuiFasPkg = DecimalUtil.ZERO ;
      AV66GuiFasPMt = DecimalUtil.ZERO ;
      AV67FasMtr_1 = DecimalUtil.ZERO ;
      AV68FasKgm_1 = DecimalUtil.ZERO ;
      P052M8_A497FpgCod = new String[] {""} ;
      P052M8_A396EmprCod = new String[] {""} ;
      P052M8_A297CliPri = new String[] {""} ;
      P052M8_A252CliCod = new int[1] ;
      P052M8_n252CliCod = new boolean[] {false} ;
      P052M8_A498FpgDsc = new String[] {""} ;
      P052M8_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A297CliPri = "" ;
      A498FpgDsc = "" ;
      AV30FpgDsc = "" ;
      AV17CliNom = "" ;
      AV18CliDom = "" ;
      AV19Clicp = "" ;
      AV20CliPob = "" ;
      AV47CliNif = "" ;
      AV23CliENom = "" ;
      AV24CliEDom = "" ;
      AV25CliEcp = "" ;
      AV26CliEPob = "" ;
      P052M9_A396EmprCod = new String[] {""} ;
      P052M9_A252CliCod = new int[1] ;
      P052M9_n252CliCod = new boolean[] {false} ;
      P052M9_A3630CliPort = new String[] {""} ;
      P052M9_A279CliNom = new String[] {""} ;
      P052M9_A3644CliNom1 = new String[] {""} ;
      P052M9_A5649CliDom2 = new String[] {""} ;
      P052M9_n5649CliDom2 = new boolean[] {false} ;
      P052M9_A260CliDom = new String[] {""} ;
      P052M9_n260CliDom = new boolean[] {false} ;
      P052M9_A4828CliCp2 = new String[] {""} ;
      P052M9_A256CliCp = new String[] {""} ;
      P052M9_A295CliPob = new String[] {""} ;
      P052M9_n295CliPob = new boolean[] {false} ;
      P052M9_A278CliNif = new String[] {""} ;
      A3630CliPort = "" ;
      A279CliNom = "" ;
      A3644CliNom1 = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      AV86CliPort = "" ;
      AV75CliNom1 = "" ;
      AV73CliNom3 = "" ;
      AV76Clidom50 = "" ;
      AV74Cpostal = "" ;
      P052M10_A396EmprCod = new String[] {""} ;
      P052M10_A266CliEnvLin = new byte[1] ;
      P052M10_A252CliCod = new int[1] ;
      P052M10_n252CliCod = new boolean[] {false} ;
      P052M10_A267CliEnvNom = new String[] {""} ;
      P052M10_A265CliEnvDom = new String[] {""} ;
      P052M10_A264CliEnvCp = new String[] {""} ;
      P052M10_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pguiacarvema__default(),
         new Object[] {
             new Object[] {
            P052M2_A1253EmprGuiRem, P052M2_A840TrnCod, P052M2_A396EmprCod, P052M2_A30AlbProCod, P052M2_A1243GuiRemCli, P052M2_A1259AlbDomEnv, P052M2_n1259AlbDomEnv, P052M2_A39AlbProPri, P052M2_A841TrnNom, P052M2_n841TrnNom,
            P052M2_A3865AlbHorSal, P052M2_A3868AlbMat, P052M2_A10017AlbFmd, P052M2_n10017AlbFmd, P052M2_A7101AlbLic, P052M2_A34AlbProfch, P052M2_A407EmprNom, P052M2_n407EmprNom, P052M2_A1879AlbProEnt, P052M2_n1879AlbProEnt,
            P052M2_A33AlbProEst, P052M2_A1782AlbProEso, P052M2_A5649CliDom2, P052M2_n5649CliDom2, P052M2_A295CliPob, P052M2_n295CliPob, P052M2_A260CliDom, P052M2_n260CliDom
            }
            , new Object[] {
            P052M3_A396EmprCod, P052M3_A30AlbProCod, P052M3_A916AlbPObs, P052M3_A915AlbPObsLin
            }
            , new Object[] {
            P052M4_A396EmprCod, P052M4_A30AlbProCod, P052M4_A130BarCodPar, P052M4_A132BarCodReo, P052M4_A129BarCod, P052M4_A361DisCod, P052M4_A136BarColNum, P052M4_A1261BarAlbKgmE, P052M4_A1263BarAlbMtrE, P052M4_A1262BarPreKgm,
            P052M4_A1264BarPreMtr, P052M4_A212BarSer, P052M4_A135BarColNom, P052M4_A1265BarAlbPie, P052M4_A1234BarNomCli, P052M4_A252CliCod, P052M4_n252CliCod, P052M4_A143BarDisNum
            }
            , new Object[] {
            P052M5_A396EmprCod, P052M5_A361DisCod, P052M5_A13213DisNormID
            }
            , new Object[] {
            P052M6_A457FasCod, P052M6_A396EmprCod, P052M6_A30AlbProCod, P052M6_A129BarCod, P052M6_A132BarCodReo, P052M6_A130BarCodPar, P052M6_A460FasDsc, P052M6_A1241GuiFasPKg, P052M6_A1242GuiFasPMt, P052M6_A1276FasMtr,
            P052M6_A1275FasKgm, P052M6_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P052M8_A497FpgCod, P052M8_A396EmprCod, P052M8_A297CliPri, P052M8_A252CliCod, P052M8_A498FpgDsc, P052M8_n498FpgDsc
            }
            , new Object[] {
            P052M9_A396EmprCod, P052M9_A252CliCod, P052M9_A3630CliPort, P052M9_A279CliNom, P052M9_A3644CliNom1, P052M9_A5649CliDom2, P052M9_A260CliDom, P052M9_A4828CliCp2, P052M9_A256CliCp, P052M9_A295CliPob,
            P052M9_A278CliNif
            }
            , new Object[] {
            P052M10_A396EmprCod, P052M10_A266CliEnvLin, P052M10_A252CliCod, P052M10_A267CliEnvNom, P052M10_A265CliEnvDom, P052M10_A264CliEnvCp, P052M10_A268CliEnvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte AV22CliEnvDom ;
   private byte AV49Copias ;
   private byte AV58i ;
   private byte A915AlbPObsLin ;
   private byte AV48ContLine ;
   private byte A132BarCodReo ;
   private byte A266CliEnvLin ;
   private short A840TrnCod ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV16CliCod ;
   private int GX_I ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int A252CliCod ;
   private int AV50barcolnum ;
   private int Gx_OldLine ;
   private int AV53TotPzas ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal AV56KgsE ;
   private java.math.BigDecimal AV63BarAlbMtre ;
   private java.math.BigDecimal AV62BarPreKgm ;
   private java.math.BigDecimal AV64BarPreMtr ;
   private java.math.BigDecimal AV54TotKgs ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal AV65GuiFasPkg ;
   private java.math.BigDecimal AV66GuiFasPMt ;
   private java.math.BigDecimal AV67FasMtr_1 ;
   private java.math.BigDecimal AV68FasKgm_1 ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV51TextoCopia ;
   private String Gx_out ;
   private String AV60ContDsc ;
   private String AV71FirmaD ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A841TrnNom ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String A7101AlbLic ;
   private String A407EmprNom ;
   private String A1879AlbProEnt ;
   private String A5649CliDom2 ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String AV29Prioridad ;
   private String AV83TransNom ;
   private String AV84AlbHorSal ;
   private String AV85Albmat ;
   private String AV70Texto_fd ;
   private String AV69Firma4dig ;
   private String AV72AtId ;
   private String AV80FechaAlb ;
   private String AV21EmprNom ;
   private String AV57VDoc ;
   private String AV46vCopia ;
   private String AV59vObs[] ;
   private String A916AlbPObs ;
   private String AV52Matricula ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String AV87Norm ;
   private String A13213DisNormID ;
   private String AV55Hdr ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV61FasDsc ;
   private String A497FpgCod ;
   private String A297CliPri ;
   private String A498FpgDsc ;
   private String AV30FpgDsc ;
   private String AV17CliNom ;
   private String AV18CliDom ;
   private String AV19Clicp ;
   private String AV20CliPob ;
   private String AV47CliNif ;
   private String AV23CliENom ;
   private String AV24CliEDom ;
   private String AV25CliEcp ;
   private String AV26CliEPob ;
   private String A3630CliPort ;
   private String A279CliNom ;
   private String A3644CliNom1 ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private String AV86CliPort ;
   private String AV75CliNom1 ;
   private String AV73CliNom3 ;
   private String AV76Clidom50 ;
   private String AV74Cpostal ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date A34AlbProfch ;
   private boolean GxHdr2 ;
   private boolean n1259AlbDomEnv ;
   private boolean n841TrnNom ;
   private boolean n10017AlbFmd ;
   private boolean n407EmprNom ;
   private boolean n1879AlbProEnt ;
   private boolean n5649CliDom2 ;
   private boolean n295CliPob ;
   private boolean n260CliDom ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n498FpgDsc ;
   private String A10017AlbFmd ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P052M2_A1253EmprGuiRem ;
   private short[] P052M2_A840TrnCod ;
   private String[] P052M2_A396EmprCod ;
   private long[] P052M2_A30AlbProCod ;
   private int[] P052M2_A1243GuiRemCli ;
   private byte[] P052M2_A1259AlbDomEnv ;
   private boolean[] P052M2_n1259AlbDomEnv ;
   private String[] P052M2_A39AlbProPri ;
   private String[] P052M2_A841TrnNom ;
   private boolean[] P052M2_n841TrnNom ;
   private String[] P052M2_A3865AlbHorSal ;
   private String[] P052M2_A3868AlbMat ;
   private String[] P052M2_A10017AlbFmd ;
   private boolean[] P052M2_n10017AlbFmd ;
   private String[] P052M2_A7101AlbLic ;
   private java.util.Date[] P052M2_A34AlbProfch ;
   private String[] P052M2_A407EmprNom ;
   private boolean[] P052M2_n407EmprNom ;
   private String[] P052M2_A1879AlbProEnt ;
   private boolean[] P052M2_n1879AlbProEnt ;
   private byte[] P052M2_A33AlbProEst ;
   private byte[] P052M2_A1782AlbProEso ;
   private String[] P052M2_A5649CliDom2 ;
   private boolean[] P052M2_n5649CliDom2 ;
   private String[] P052M2_A295CliPob ;
   private boolean[] P052M2_n295CliPob ;
   private String[] P052M2_A260CliDom ;
   private boolean[] P052M2_n260CliDom ;
   private String[] P052M3_A396EmprCod ;
   private long[] P052M3_A30AlbProCod ;
   private String[] P052M3_A916AlbPObs ;
   private byte[] P052M3_A915AlbPObsLin ;
   private String[] P052M4_A396EmprCod ;
   private long[] P052M4_A30AlbProCod ;
   private String[] P052M4_A130BarCodPar ;
   private byte[] P052M4_A132BarCodReo ;
   private int[] P052M4_A129BarCod ;
   private int[] P052M4_A361DisCod ;
   private int[] P052M4_A136BarColNum ;
   private java.math.BigDecimal[] P052M4_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P052M4_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P052M4_A1262BarPreKgm ;
   private java.math.BigDecimal[] P052M4_A1264BarPreMtr ;
   private String[] P052M4_A212BarSer ;
   private String[] P052M4_A135BarColNom ;
   private int[] P052M4_A1265BarAlbPie ;
   private String[] P052M4_A1234BarNomCli ;
   private int[] P052M4_A252CliCod ;
   private boolean[] P052M4_n252CliCod ;
   private String[] P052M4_A143BarDisNum ;
   private String[] P052M5_A396EmprCod ;
   private int[] P052M5_A361DisCod ;
   private String[] P052M5_A13213DisNormID ;
   private String[] P052M6_A457FasCod ;
   private String[] P052M6_A396EmprCod ;
   private long[] P052M6_A30AlbProCod ;
   private int[] P052M6_A129BarCod ;
   private byte[] P052M6_A132BarCodReo ;
   private String[] P052M6_A130BarCodPar ;
   private String[] P052M6_A460FasDsc ;
   private java.math.BigDecimal[] P052M6_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P052M6_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P052M6_A1276FasMtr ;
   private java.math.BigDecimal[] P052M6_A1275FasKgm ;
   private short[] P052M6_A1240GuiFasLin ;
   private String[] P052M8_A497FpgCod ;
   private String[] P052M8_A396EmprCod ;
   private String[] P052M8_A297CliPri ;
   private int[] P052M8_A252CliCod ;
   private boolean[] P052M8_n252CliCod ;
   private String[] P052M8_A498FpgDsc ;
   private boolean[] P052M8_n498FpgDsc ;
   private String[] P052M9_A396EmprCod ;
   private int[] P052M9_A252CliCod ;
   private boolean[] P052M9_n252CliCod ;
   private String[] P052M9_A3630CliPort ;
   private String[] P052M9_A279CliNom ;
   private String[] P052M9_A3644CliNom1 ;
   private String[] P052M9_A5649CliDom2 ;
   private boolean[] P052M9_n5649CliDom2 ;
   private String[] P052M9_A260CliDom ;
   private boolean[] P052M9_n260CliDom ;
   private String[] P052M9_A4828CliCp2 ;
   private String[] P052M9_A256CliCp ;
   private String[] P052M9_A295CliPob ;
   private boolean[] P052M9_n295CliPob ;
   private String[] P052M9_A278CliNif ;
   private String[] P052M10_A396EmprCod ;
   private byte[] P052M10_A266CliEnvLin ;
   private int[] P052M10_A252CliCod ;
   private boolean[] P052M10_n252CliCod ;
   private String[] P052M10_A267CliEnvNom ;
   private String[] P052M10_A265CliEnvDom ;
   private String[] P052M10_A264CliEnvCp ;
   private String[] P052M10_A268CliEnvPob ;
}

final  class pguiacarvema__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P052M2", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.TrnCod, T1.EmprCod, T1.AlbProCod, T1.GuiRemCli AS GuiRemCli, T1.AlbDomEnv, T1.AlbProPri, T4.TrnNom, T1.AlbHorSal, T1.AlbMat, T1.AlbFmd, T1.AlbLic, T1.AlbProfch, T3.EmprNom, T1.AlbProEnt, T1.AlbProEst, T1.AlbProEso, T2.CliDom2, T2.CliPob, T2.CliDom FROM (((TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) INNER JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod  FOR UPDATE OF T1.AlbProEst, T1.AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P052M3", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P052M4", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.DisCod, T2.BarColNum, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarPreKgm, T1.BarPreMtr, T2.BarSer, T2.BarColNom, T1.BarAlbPie, T2.BarNomCli, T2.CliCod, T2.BarDisNum FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.AlbProCod = ?) ORDER BY T1.EmprCod, T2.BarDisNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P052M5", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P052M6", "SELECT T1.FasCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.GuiFasPKg, T1.GuiFasPMt, T1.FasMtr, T1.FasKgm, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P052M7", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P052M8", "SELECT T1.FpgCod, T1.EmprCod, T1.CliPri, T1.CliCod, T2.FpgDsc FROM (TXPCLIFPG T1 INNER JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod = T1.FpgCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliPri = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P052M9", "SELECT EmprCod, CliCod, CliPort, CliNom, CliNom1, CliDom2, CliDom, CliCp2, CliCp, CliPob, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P052M10", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(20, 34);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 34);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

