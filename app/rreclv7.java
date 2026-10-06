package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rreclv7 extends GXReport
{
   public rreclv7( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rreclv7.class ), "" );
   }

   public rreclv7( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      rreclv7.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      rreclv7.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rreclv7.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rreclv7.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rreclv7.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rreclv7.this.AV66BarFasLot = aP4[0];
      this.aP4 = aP4;
      rreclv7.this.AV58Grupo_l = aP5[0];
      this.aP5 = aP5;
      rreclv7.this.Gx_out = aP6[0];
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
         getPrinter().GxSetDocName("Documento Lector p/partida") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV29FlagImp ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100000", GXv_int1) ;
         rreclv7.this.AV29FlagImp = GXv_int1[0] ;
         GXt_int2 = AV115Ibatex ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IBATEX", ""), GXv_int1) ;
         rreclv7.this.GXt_int2 = GXv_int1[0] ;
         AV115Ibatex = GXt_int2 ;
         AV69DisObstxt = GXutil.space( (short)(60)) ;
         /* Using cursor P06TG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A833TipDefCod = P06TG2_A833TipDefCod[0] ;
            n833TipDefCod = P06TG2_n833TipDefCod[0] ;
            A361DisCod = P06TG2_A361DisCod[0] ;
            A2010BarTipDis = P06TG2_A2010BarTipDis[0] ;
            A3030BarPlf = P06TG2_A3030BarPlf[0] ;
            A252CliCod = P06TG2_A252CliCod[0] ;
            n252CliCod = P06TG2_n252CliCod[0] ;
            A212BarSer = P06TG2_A212BarSer[0] ;
            A177BarLar = P06TG2_A177BarLar[0] ;
            A182BarMat = P06TG2_A182BarMat[0] ;
            A4812BarEncCli = P06TG2_A4812BarEncCli[0] ;
            A143BarDisNum = P06TG2_A143BarDisNum[0] ;
            A135BarColNom = P06TG2_A135BarColNom[0] ;
            A136BarColNum = P06TG2_A136BarColNum[0] ;
            A218BarTipCol = P06TG2_A218BarTipCol[0] ;
            A4465BarAcaBak = P06TG2_A4465BarAcaBak[0] ;
            n4465BarAcaBak = P06TG2_n4465BarAcaBak[0] ;
            A148BarEstReo = P06TG2_A148BarEstReo[0] ;
            A834TipDefDsc = P06TG2_A834TipDefDsc[0] ;
            n834TipDefDsc = P06TG2_n834TipDefDsc[0] ;
            A834TipDefDsc = P06TG2_A834TipDefDsc[0] ;
            n834TipDefDsc = P06TG2_n834TipDefDsc[0] ;
            AV44BarCod = A129BarCod ;
            AV45BarCodReo = A132BarCodReo ;
            AV46BarCodPar = A130BarCodPar ;
            AV114BarTipDis = A2010BarTipDis ;
            AV109Muestras = "" ;
            if ( GXutil.strcmp(A3030BarPlf, httpContext.getMessage( "S", "")) == 0 )
            {
               AV109Muestras = httpContext.getMessage( "M", "") ;
            }
            AV33CliCod = A252CliCod ;
            AV94DisCod = A361DisCod ;
            AV37BarSer = A212BarSer ;
            AV121BarLar = A177BarLar ;
            AV120Barmat = A182BarMat ;
            AV119Barenccli = A4812BarEncCli ;
            AV118BarDisNum = A143BarDisNum ;
            AV74BarColNom = A135BarColNom ;
            AV79barColNum = A136BarColNum ;
            AV80BarTipCol = A218BarTipCol ;
            AV111Texto_c = "" ;
            if ( GXutil.strcmp(A4465BarAcaBak, httpContext.getMessage( "C", "")) == 0 )
            {
               AV111Texto_c = httpContext.getMessage( "QUALQUER COR", "") ;
            }
            /* Execute user subroutine: 'OBSERF' */
            S191 ();
            if ( returnInSub )
            {
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
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = AV33CliCod ;
            GXv_char5[0] = AV37BarSer ;
            GXv_char6[0] = AV74BarColNom ;
            GXv_int7[0] = AV79barColNum ;
            GXv_int1[0] = AV80BarTipCol ;
            GXv_int8[0] = AV77ForCon ;
            GXv_int9[0] = AV78F_okcolor ;
            GXv_char10[0] = AV110INTDSCF ;
            new app.pforcon(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int1, GXv_int8, GXv_int9, GXv_char10) ;
            rreclv7.this.A396EmprCod = GXv_char3[0] ;
            rreclv7.this.AV33CliCod = GXv_int4[0] ;
            rreclv7.this.AV37BarSer = GXv_char5[0] ;
            rreclv7.this.AV74BarColNom = GXv_char6[0] ;
            rreclv7.this.AV79barColNum = GXv_int7[0] ;
            rreclv7.this.AV80BarTipCol = GXv_int1[0] ;
            rreclv7.this.AV77ForCon = GXv_int8[0] ;
            rreclv7.this.AV78F_okcolor = GXv_int9[0] ;
            rreclv7.this.AV110INTDSCF = GXv_char10[0] ;
            if ( A148BarEstReo == 1 )
            {
               /* Execute user subroutine: 'HLREOP' */
               S201 ();
               if ( returnInSub )
               {
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
               AV11TipDefDsc = A834TipDefDsc ;
               AV68v_Texto = httpContext.getMessage( "Reprocessado Interno", "") ;
            }
            if ( A148BarEstReo == 2 )
            {
               AV11TipDefDsc = A834TipDefDsc ;
               AV68v_Texto = httpContext.getMessage( "Reprocessado EXTERNO", "") ;
            }
            AV100i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 9 )
            {
               AV101Tab_obs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV102F_obs = (byte)(0) ;
            /* Using cursor P06TG3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A377DisObsTxt = P06TG3_A377DisObsTxt[0] ;
               A376DisObsLin = P06TG3_A376DisObsLin[0] ;
               AV101Tab_obs[AV100i-1] = A377DisObsTxt ;
               AV100i = (byte)(AV100i+1) ;
               AV102F_obs = (byte)(1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV70ProDsc2 = GXutil.space( (short)(80)) ;
            /* Using cursor P06TG4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A758ProCod = P06TG4_A758ProCod[0] ;
               A761ProFasLin = P06TG4_A761ProFasLin[0] ;
               n761ProFasLin = P06TG4_n761ProFasLin[0] ;
               A4628ProDsc2 = P06TG4_A4628ProDsc2[0] ;
               A4628ProDsc2 = P06TG4_A4628ProDsc2[0] ;
               AV70ProDsc2 = GXutil.substring( A4628ProDsc2, 1, 80) ;
               AV71Fases_l = GXutil.space( (short)(80)) ;
               /* Using cursor P06TG5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A457FasCod = P06TG5_A457FasCod[0] ;
                  A153BarFasEst = P06TG5_A153BarFasEst[0] ;
                  A460FasDsc = P06TG5_A460FasDsc[0] ;
                  A194BarOrdLin = P06TG5_A194BarOrdLin[0] ;
                  A460FasDsc = P06TG5_A460FasDsc[0] ;
                  if ( (GXutil.strcmp("", AV71Fases_l)==0) )
                  {
                     AV71Fases_l = GXutil.trim( A460FasDsc) ;
                  }
                  else
                  {
                     AV71Fases_l = GXutil.concat( AV71Fases_l, GXutil.trim( A460FasDsc), "-") ;
                  }
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV99Tipo_pzas = "" ;
            /* Using cursor P06TG6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A44AlbRecCod = P06TG6_A44AlbRecCod[0] ;
               A4295ClasCod = P06TG6_A4295ClasCod[0] ;
               n4295ClasCod = P06TG6_n4295ClasCod[0] ;
               A200BarPieCod = P06TG6_A200BarPieCod[0] ;
               A4296ClasDsc = P06TG6_A4296ClasDsc[0] ;
               n4296ClasDsc = P06TG6_n4296ClasDsc[0] ;
               A4295ClasCod = P06TG6_A4295ClasCod[0] ;
               n4295ClasCod = P06TG6_n4295ClasCod[0] ;
               A4296ClasDsc = P06TG6_A4296ClasDsc[0] ;
               n4296ClasDsc = P06TG6_n4296ClasDsc[0] ;
               if ( (GXutil.strcmp("", AV99Tipo_pzas)==0) )
               {
                  AV99Tipo_pzas = GXutil.trim( A4296ClasDsc) ;
               }
               else
               {
                  AV99Tipo_pzas = GXutil.concat( AV99Tipo_pzas, GXutil.trim( A4296ClasDsc), "-") ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV13Last_NumPd = 0 ;
         /* Using cursor P06TG8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV58Grupo_l});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A4314BarFasBot1 = P06TG8_A4314BarFasBot1[0] ;
            n4314BarFasBot1 = P06TG8_n4314BarFasBot1[0] ;
            A758ProCod = P06TG8_A758ProCod[0] ;
            A4315BarNumBot1 = P06TG8_A4315BarNumBot1[0] ;
            n4315BarNumBot1 = P06TG8_n4315BarNumBot1[0] ;
            A4648BarFasRecu = P06TG8_A4648BarFasRecu[0] ;
            n4648BarFasRecu = P06TG8_n4648BarFasRecu[0] ;
            A135BarColNom = P06TG8_A135BarColNom[0] ;
            A150BarFacTin = P06TG8_A150BarFacTin[0] ;
            A1234BarNomCli = P06TG8_A1234BarNomCli[0] ;
            A148BarEstReo = P06TG8_A148BarEstReo[0] ;
            A252CliCod = P06TG8_A252CliCod[0] ;
            n252CliCod = P06TG8_n252CliCod[0] ;
            A279CliNom = P06TG8_A279CliNom[0] ;
            A4609BarMdlCod = P06TG8_A4609BarMdlCod[0] ;
            A212BarSer = P06TG8_A212BarSer[0] ;
            A1652BarSerDsc = P06TG8_A1652BarSerDsc[0] ;
            A159BarFecGen = P06TG8_A159BarFecGen[0] ;
            A4613BarHorReg = P06TG8_A4613BarHorReg[0] ;
            n4613BarHorReg = P06TG8_n4613BarHorReg[0] ;
            A603MaqCodBis = P06TG8_A603MaqCodBis[0] ;
            A4645BarFasKgs = P06TG8_A4645BarFasKgs[0] ;
            n4645BarFasKgs = P06TG8_n4645BarFasKgs[0] ;
            A4644BarFasNPrd = P06TG8_A4644BarFasNPrd[0] ;
            n4644BarFasNPrd = P06TG8_n4644BarFasNPrd[0] ;
            A457FasCod = P06TG8_A457FasCod[0] ;
            A4287BarFasFor = P06TG8_A4287BarFasFor[0] ;
            A194BarOrdLin = P06TG8_A194BarOrdLin[0] ;
            A4643BarFasLot = P06TG8_A4643BarFasLot[0] ;
            A166BarKgm = P06TG8_A166BarKgm[0] ;
            A199BarPie1 = P06TG8_A199BarPie1[0] ;
            A365DisDes = P06TG8_A365DisDes[0] ;
            A898BarPieNDes = P06TG8_A898BarPieNDes[0] ;
            A135BarColNom = P06TG8_A135BarColNom[0] ;
            A1234BarNomCli = P06TG8_A1234BarNomCli[0] ;
            A148BarEstReo = P06TG8_A148BarEstReo[0] ;
            A252CliCod = P06TG8_A252CliCod[0] ;
            n252CliCod = P06TG8_n252CliCod[0] ;
            A4609BarMdlCod = P06TG8_A4609BarMdlCod[0] ;
            A212BarSer = P06TG8_A212BarSer[0] ;
            A1652BarSerDsc = P06TG8_A1652BarSerDsc[0] ;
            A159BarFecGen = P06TG8_A159BarFecGen[0] ;
            A4613BarHorReg = P06TG8_A4613BarHorReg[0] ;
            n4613BarHorReg = P06TG8_n4613BarHorReg[0] ;
            A365DisDes = P06TG8_A365DisDes[0] ;
            A279CliNom = P06TG8_A279CliNom[0] ;
            A150BarFacTin = P06TG8_A150BarFacTin[0] ;
            A603MaqCodBis = P06TG8_A603MaqCodBis[0] ;
            A457FasCod = P06TG8_A457FasCod[0] ;
            A4287BarFasFor = P06TG8_A4287BarFasFor[0] ;
            A166BarKgm = P06TG8_A166BarKgm[0] ;
            A199BarPie1 = P06TG8_A199BarPie1[0] ;
            A898BarPieNDes = P06TG8_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            GXv_char10[0] = A396EmprCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int9[0] = A132BarCodReo ;
            GXv_char6[0] = A130BarCodPar ;
            GXv_char5[0] = A758ProCod ;
            GXv_int11[0] = A194BarOrdLin ;
            GXv_char3[0] = A4314BarFasBot1 ;
            GXv_int4[0] = AV64Total_pdas ;
            new app.ppfnpds(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int9, GXv_char6, GXv_char5, GXv_int11, GXv_char3, GXv_int4) ;
            rreclv7.this.A396EmprCod = GXv_char10[0] ;
            rreclv7.this.A129BarCod = GXv_int7[0] ;
            rreclv7.this.A132BarCodReo = GXv_int9[0] ;
            rreclv7.this.A130BarCodPar = GXv_char6[0] ;
            rreclv7.this.A758ProCod = GXv_char5[0] ;
            rreclv7.this.A194BarOrdLin = GXv_int11[0] ;
            rreclv7.this.A4314BarFasBot1 = GXv_char3[0] ;
            rreclv7.this.AV64Total_pdas = GXv_int4[0] ;
            if ( ( AV13Last_NumPd != A4643BarFasLot ) && ( AV13Last_NumPd > 0 ) )
            {
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            AV93Num_remon = A4315BarNumBot1 ;
            AV87ProCod = A758ProCod ;
            AV65BarFasRecu = A4648BarFasRecu ;
            AV44BarCod = A129BarCod ;
            AV45BarCodReo = A132BarCodReo ;
            AV46BarCodPar = A130BarCodPar ;
            AV66BarFasLot = A4643BarFasLot ;
            AV67BarOrdLin = A194BarOrdLin ;
            AV74BarColNom = A135BarColNom ;
            AV81BarFacTin = A150BarFacTin ;
            AV82BarNomCli = A1234BarNomCli ;
            if ( A148BarEstReo == 0 )
            {
               /* Execute user subroutine: 'RECUPERACIONES' */
               S181 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV8Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
            AV63EmprCod = A396EmprCod ;
            AV33CliCod = A252CliCod ;
            AV34CliNom = A279CliNom ;
            AV35BarMdlCod = A4609BarMdlCod ;
            AV37BarSer = A212BarSer ;
            AV38BarSerDsc = A1652BarSerDsc ;
            AV39BarKgm = A166BarKgm ;
            AV40BarPie = A198BarPie ;
            AV72BarFecGen = A159BarFecGen ;
            AV73BarHorReg = A4613BarHorReg ;
            AV42RecNroPar = A4643BarFasLot ;
            AV43RecOrdLin = A194BarOrdLin ;
            AV44BarCod = A129BarCod ;
            AV45BarCodReo = A132BarCodReo ;
            AV46BarCodPar = A130BarCodPar ;
            AV47MaqCod = A603MaqCodBis ;
            GXv_char10[0] = A396EmprCod ;
            GXv_char6[0] = AV47MaqCod ;
            GXv_char5[0] = AV48MaqDsc ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char10, GXv_char6, GXv_char5) ;
            rreclv7.this.A396EmprCod = GXv_char10[0] ;
            rreclv7.this.AV47MaqCod = GXv_char6[0] ;
            rreclv7.this.AV48MaqDsc = GXv_char5[0] ;
            /* Execute user subroutine: 'MAQUIN' */
            S139 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               pr_default.close(5);
               pr_default.close(5);
               pr_default.close(5);
               pr_default.close(5);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV17RecMaqKgs = A4645BarFasKgs ;
            AV23RecMaqPrd = A4644BarFasNPrd ;
            AV18FasCod = A457FasCod ;
            GXv_char10[0] = AV22FasDsc ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A457FasCod, GXv_char10) ;
            rreclv7.this.AV22FasDsc = GXv_char10[0] ;
            AV55Ceros8 = "00000000" ;
            AV50BarCod_a = GXutil.str( A129BarCod, 8, 0) ;
            AV50BarCod_a = GXutil.ltrim( GXutil.rtrim( AV50BarCod_a)) ;
            AV52LenVar = (byte)(GXutil.len( AV50BarCod_a)) ;
            AV52LenVar = (byte)(8-AV52LenVar) ;
            AV50BarCod_a = GXutil.substring( AV55Ceros8, 1, AV52LenVar) + AV50BarCod_a ;
            AV95Npda_3 = (short)(AV42RecNroPar) ;
            AV96Npda_a3 = GXutil.str( AV95Npda_3, 3, 0) ;
            AV96Npda_a3 = GXutil.ltrim( GXutil.rtrim( AV96Npda_a3)) ;
            AV52LenVar = (byte)(GXutil.len( AV96Npda_a3)) ;
            AV52LenVar = (byte)(3-AV52LenVar) ;
            AV96Npda_a3 = GXutil.substring( AV55Ceros8, 1, AV52LenVar) + AV96Npda_a3 ;
            AV56Orden_a = GXutil.str( A194BarOrdLin, 4, 0) ;
            AV56Orden_a = GXutil.ltrim( GXutil.rtrim( AV56Orden_a)) ;
            AV52LenVar = (byte)(GXutil.len( AV56Orden_a)) ;
            AV52LenVar = (byte)(4-AV52LenVar) ;
            AV56Orden_a = GXutil.substring( AV55Ceros8, 1, AV52LenVar) + AV56Orden_a ;
            AV51Reo_a = "0" ;
            if ( AV45BarCodReo > 0 )
            {
               AV51Reo_a = GXutil.str( AV45BarCodReo, 1, 0) ;
            }
            AV9HdrPart = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "/" + AV96Npda_a3 + "*" ;
            AV10HdrPda = AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "-" + AV96Npda_a3 ;
            AV116Hdrcdb = "*" + AV50BarCod_a + "*" ;
            AV41FasCod_cb = "*" + AV18FasCod + AV56Orden_a + "*" ;
            AV57FasCod_cb2 = AV41FasCod_cb ;
            if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'RECETA' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               AV9HdrPart = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "/" + AV96Npda_a3 + "/" + "000" + "/" + A396EmprCod + "*" ;
               AV10HdrPda += "-" + "000" + "-" + A396EmprCod ;
               /* Execute user subroutine: 'NO_RECETA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  pr_default.close(5);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV13Last_NumPd = A4643BarFasLot ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6TG0( true, 0) ;
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
      /* 'NO_RECETA' Routine */
      returnInSub = false ;
      h6TG0( false, 140) ;
      getPrinter().GxDrawRect(569, Gx_line+79, 785, Gx_line+137, 1, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(22, Gx_line+0, 395, Gx_line+64, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 45, Gx_line+9, 97, Gx_line+26, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47MaqCod, "")), 128, Gx_line+9, 210, Gx_line+27, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48MaqDsc, "")), 208, Gx_line+9, 309, Gx_line+27, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Total Qgs", ""), 45, Gx_line+33, 103, Gx_line+50, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17RecMaqKgs, "ZZZZZZ9.99")), 125, Gx_line+33, 199, Gx_line+51, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23RecMaqPrd), "ZZZZ9")), 336, Gx_line+33, 373, Gx_line+51, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Peças Estimadas", ""), 213, Gx_line+33, 321, Gx_line+50, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Partida", ""), 594, Gx_line+65, 653, Gx_line+81, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42RecNroPar), "ZZZZZ9")), 674, Gx_line+65, 719, Gx_line+82, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9HdrPart, "")), 26, Gx_line+79, 502, Gx_line+105, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10HdrPda, "")), 26, Gx_line+65, 140, Gx_line+82, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("3 of 9 Barcode", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41FasCod_cb, "")), 457, Gx_line+19, 750, Gx_line+47, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22FasDsc, "")), 457, Gx_line+0, 608, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57FasCod_cb2, "")), 457, Gx_line+47, 546, Gx_line+65, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64Total_pdas), "ZZZZZ9")), 731, Gx_line+65, 776, Gx_line+82, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("/", 723, Gx_line+65, 727, Gx_line+81, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11TipDefDsc, "")), 573, Gx_line+96, 730, Gx_line+114, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68v_Texto, "")), 573, Gx_line+81, 631, Gx_line+97, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117dsccausa, "")), 573, Gx_line+113, 730, Gx_line+131, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+140) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'RECETA' Routine */
      returnInSub = false ;
      /* Using cursor P06TG10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, Integer.valueOf(AV42RecNroPar), Short.valueOf(AV43RecOrdLin)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A2804RecLinMaq = P06TG10_A2804RecLinMaq[0] ;
         A4268RecOrdLin = P06TG10_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P06TG10_n4268RecOrdLin[0] ;
         A4654RecNroPar = P06TG10_A4654RecNroPar[0] ;
         n4654RecNroPar = P06TG10_n4654RecNroPar[0] ;
         A4258RecMaqFas = P06TG10_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P06TG10_n4258RecMaqFas[0] ;
         A602MaqCod = P06TG10_A602MaqCod[0] ;
         A4402RecUsrCod = P06TG10_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P06TG10_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P06TG10_n4866RecFecAlt[0] ;
         A606MaqDsc = P06TG10_A606MaqDsc[0] ;
         n606MaqDsc = P06TG10_n606MaqDsc[0] ;
         A148BarEstReo = P06TG10_A148BarEstReo[0] ;
         A4273RecFagPrd = P06TG10_A4273RecFagPrd[0] ;
         A4261RecTotPrd = P06TG10_A4261RecTotPrd[0] ;
         n4261RecTotPrd = P06TG10_n4261RecTotPrd[0] ;
         A4271RecFagKgs = P06TG10_A4271RecFagKgs[0] ;
         A4259RecTotKgs = P06TG10_A4259RecTotKgs[0] ;
         A606MaqDsc = P06TG10_A606MaqDsc[0] ;
         n606MaqDsc = P06TG10_n606MaqDsc[0] ;
         A148BarEstReo = P06TG10_A148BarEstReo[0] ;
         A4273RecFagPrd = P06TG10_A4273RecFagPrd[0] ;
         A4271RecFagKgs = P06TG10_A4271RecFagKgs[0] ;
         A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
         A4318RecMaqPrd = (int)(A4261RecTotPrd+A4273RecFagPrd) ;
         AV97Nactx_3 = A2804RecLinMaq ;
         AV98Nactx_3a = GXutil.str( AV97Nactx_3, 3, 0) ;
         AV98Nactx_3a = GXutil.ltrim( GXutil.rtrim( AV98Nactx_3a)) ;
         AV52LenVar = (byte)(GXutil.len( AV98Nactx_3a)) ;
         AV52LenVar = (byte)(3-AV52LenVar) ;
         AV98Nactx_3a = GXutil.substring( AV55Ceros8, 1, AV52LenVar) + AV98Nactx_3a ;
         AV9HdrPart = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "/" + AV96Npda_a3 + "/" + AV98Nactx_3a + "/" + A396EmprCod + "*" ;
         AV10HdrPda += "-" + AV98Nactx_3a + "-" + A396EmprCod ;
         AV17RecMaqKgs = A4316RecMaqKgs ;
         AV23RecMaqPrd = A4318RecMaqPrd ;
         AV18FasCod = A4258RecMaqFas ;
         GXv_char10[0] = AV22FasDsc ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, AV18FasCod, GXv_char10) ;
         rreclv7.this.AV22FasDsc = GXv_char10[0] ;
         AV47MaqCod = A602MaqCod ;
         /* Execute user subroutine: 'MAQUIN' */
         S139 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            pr_default.close(6);
            pr_default.close(6);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h6TG0( false, 135) ;
         getPrinter().GxDrawRect(569, Gx_line+80, 785, Gx_line+134, 1, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(21, Gx_line+0, 394, Gx_line+63, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 44, Gx_line+9, 96, Gx_line+26, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 127, Gx_line+9, 209, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 207, Gx_line+9, 308, Gx_line+27, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Qgs", ""), 44, Gx_line+33, 102, Gx_line+50, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17RecMaqKgs, "ZZZZZZ9.99")), 124, Gx_line+33, 198, Gx_line+51, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23RecMaqPrd), "ZZZZ9")), 335, Gx_line+33, 372, Gx_line+51, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Peças Estimadas", ""), 211, Gx_line+33, 319, Gx_line+50, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Partida", ""), 594, Gx_line+65, 653, Gx_line+81, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4654RecNroPar), "ZZZZZ9")), 674, Gx_line+65, 719, Gx_line+82, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Acatex", ""), 493, Gx_line+65, 551, Gx_line+81, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")), 555, Gx_line+65, 585, Gx_line+82, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9HdrPart, "")), 26, Gx_line+85, 502, Gx_line+111, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10HdrPda, "")), 26, Gx_line+65, 140, Gx_line+82, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("3 of 9 Barcode", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41FasCod_cb, "")), 457, Gx_line+19, 750, Gx_line+47, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22FasDsc, "")), 457, Gx_line+0, 608, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57FasCod_cb2, "")), 457, Gx_line+48, 546, Gx_line+66, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("/", 723, Gx_line+65, 727, Gx_line+81, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64Total_pdas), "ZZZZZ9")), 731, Gx_line+65, 776, Gx_line+82, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11TipDefDsc, "")), 573, Gx_line+97, 704, Gx_line+114, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68v_Texto, "")), 573, Gx_line+81, 631, Gx_line+97, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 343, Gx_line+65, 467, Gx_line+81, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 304, Gx_line+65, 332, Gx_line+81, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 173, Gx_line+65, 281, Gx_line+81, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117dsccausa, "")), 573, Gx_line+116, 730, Gx_line+134, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+135) ;
         if ( AV93Num_remon > 0 )
         {
            h6TG0( false, 23) ;
            getPrinter().GxDrawRect(616, Gx_line+2, 785, Gx_line+21, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº de Remontas", ""), 621, Gx_line+3, 727, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV93Num_remon), "ZZZZZ9")), 729, Gx_line+3, 774, Gx_line+21, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
         }
         AV75C_cab_p = (byte)(0) ;
         AV113Ctrl_m = (byte)(0) ;
         if ( GXutil.strcmp(AV114BarTipDis, httpContext.getMessage( "T", "")) == 0 )
         {
            /* Execute user subroutine: 'AGRHDFP' */
            S149 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'AGRHDF' */
            S159 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         if ( A148BarEstReo == 1 )
         {
            /* Execute user subroutine: 'HLREO1' */
            S169 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         /* Using cursor P06TG11 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A4695RecVolPrf = P06TG11_A4695RecVolPrf[0] ;
            A1273RecLinPro = P06TG11_A1273RecLinPro[0] ;
            A4696RecTiempo = P06TG11_A4696RecTiempo[0] ;
            n4696RecTiempo = P06TG11_n4696RecTiempo[0] ;
            A4697RecNroPrg = P06TG11_A4697RecNroPrg[0] ;
            A764ProForCod = P06TG11_A764ProForCod[0] ;
            A766ProForDsc = P06TG11_A766ProForDsc[0] ;
            A5523ProForTip = P06TG11_A5523ProForTip[0] ;
            A766ProForDsc = P06TG11_A766ProForDsc[0] ;
            A5523ProForTip = P06TG11_A5523ProForTip[0] ;
            AV14ProForTie = A4696RecTiempo ;
            AV15ProNumPro = A4697RecNroPrg ;
            AV19ProForCod = A764ProForCod ;
            AV16vRb = (short)(0) ;
            if ( AV17RecMaqKgs.doubleValue() > 0 )
            {
               AV16vRb = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A4695RecVolPrf).divide(AV17RecMaqKgs, 18, java.math.RoundingMode.DOWN)), 0))) ;
            }
            if ( AV75C_cab_p == 1 )
            {
               if ( ( ( GXutil.strcmp(GXutil.substring( A764ProForCod, 1, 2), httpContext.getMessage( "VM", "")) == 0 ) && ( AV113Ctrl_m == 0 ) ) || ( ( GXutil.strcmp(GXutil.substring( A766ProForDsc, 1, 2), httpContext.getMessage( "VM", "")) == 0 ) && ( AV113Ctrl_m == 0 ) && ( AV115Ibatex == 1 ) ) )
               {
                  /* Execute user subroutine: 'CTRL_AMOSTRA' */
                  S1710 ();
                  if ( returnInSub )
                  {
                     pr_default.close(7);
                     pr_default.close(7);
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(6);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     if (true) return;
                  }
               }
               if ( ( ( GXutil.strcmp(GXutil.substring( A764ProForCod, 1, 2), httpContext.getMessage( "AM", "")) == 0 ) && ( AV113Ctrl_m == 0 ) ) || ( ( GXutil.strcmp(GXutil.substring( A766ProForDsc, 1, 2), httpContext.getMessage( "AM", "")) == 0 ) && ( AV113Ctrl_m == 0 ) && ( AV115Ibatex == 1 ) ) )
               {
                  /* Execute user subroutine: 'CTRL_AMOSTRA' */
                  S1710 ();
                  if ( returnInSub )
                  {
                     pr_default.close(7);
                     pr_default.close(7);
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(6);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     if (true) return;
                  }
               }
            }
            if ( AV75C_cab_p == 0 )
            {
               AV75C_cab_p = (byte)(1) ;
               h6TG0( false, 46) ;
               getPrinter().GxDrawRect(21, Gx_line+0, 787, Gx_line+22, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 124, Gx_line+2, 313, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 34, Gx_line+1, 116, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tempo Pausa", ""), 322, Gx_line+1, 405, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14ProForTie), "ZZZ9")), 419, Gx_line+1, 449, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m", ""), 457, Gx_line+1, 469, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NºProgr.", ""), 478, Gx_line+1, 529, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15ProNumPro), "ZZZZ9")), 545, Gx_line+1, 582, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Volume", ""), 576, Gx_line+1, 622, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9")), 632, Gx_line+1, 669, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lt", ""), 678, Gx_line+1, 690, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 707, Gx_line+1, 725, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16vRb), "ZZZ9")), 734, Gx_line+1, 764, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 59, Gx_line+24, 102, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Produto-Descrição", ""), 238, Gx_line+24, 360, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 474, Gx_line+24, 490, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 509, Gx_line+24, 587, Gx_line+41, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(21, Gx_line+21, 787, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(168, Gx_line+21, 168, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(467, Gx_line+21, 467, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(496, Gx_line+21, 496, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(656, Gx_line+21, 656, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(21, Gx_line+42, 21, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(785, Gx_line+42, 785, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "%SM", ""), 623, Gx_line+26, 651, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(616, Gx_line+21, 616, Gx_line+46, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Volume", ""), 671, Gx_line+26, 716, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(721, Gx_line+21, 721, Gx_line+46, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+46) ;
            }
            else
            {
               h6TG0( false, 24) ;
               getPrinter().GxDrawRect(21, Gx_line+0, 787, Gx_line+22, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 128, Gx_line+2, 317, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 39, Gx_line+1, 121, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tempo Pausa", ""), 326, Gx_line+1, 409, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14ProForTie), "ZZZ9")), 423, Gx_line+1, 453, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m", ""), 461, Gx_line+1, 473, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NºProgr.", ""), 482, Gx_line+1, 533, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15ProNumPro), "ZZZZ9")), 549, Gx_line+1, 586, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Volume", ""), 580, Gx_line+1, 626, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9")), 636, Gx_line+1, 673, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lt", ""), 682, Gx_line+1, 694, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 711, Gx_line+1, 729, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16vRb), "ZZZ9")), 739, Gx_line+1, 769, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(168, Gx_line+20, 168, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(467, Gx_line+20, 467, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(496, Gx_line+20, 496, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(656, Gx_line+20, 656, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(21, Gx_line+20, 21, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(785, Gx_line+20, 785, Gx_line+24, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
            }
            /* Using cursor P06TG12 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A719PrdNum = P06TG12_A719PrdNum[0] ;
               n719PrdNum = P06TG12_n719PrdNum[0] ;
               A872RecPrdNum = P06TG12_A872RecPrdNum[0] ;
               A490ForPrdUMe = P06TG12_A490ForPrdUMe[0] ;
               n490ForPrdUMe = P06TG12_n490ForPrdUMe[0] ;
               A431FacCon = P06TG12_A431FacCon[0] ;
               A743PrdUniCon = P06TG12_A743PrdUniCon[0] ;
               A686PrdCant = P06TG12_A686PrdCant[0] ;
               A5422RecSalMP = P06TG12_A5422RecSalMP[0] ;
               A5467RecSalVol = P06TG12_A5467RecSalVol[0] ;
               A2394RecForNro = P06TG12_A2394RecForNro[0] ;
               A875RecPrdDsc = P06TG12_A875RecPrdDsc[0] ;
               A707PrdFacCon = P06TG12_A707PrdFacCon[0] ;
               A724PrdPreAct = P06TG12_A724PrdPreAct[0] ;
               A811RecLin = P06TG12_A811RecLin[0] ;
               A743PrdUniCon = P06TG12_A743PrdUniCon[0] ;
               A707PrdFacCon = P06TG12_A707PrdFacCon[0] ;
               A724PrdPreAct = P06TG12_A724PrdPreAct[0] ;
               AV108PrdNumi = A872RecPrdNum + "" ;
               if ( ( GXutil.strcmp(AV112Maqdosifp, httpContext.getMessage( "N", "")) == 0 ) && ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 ) || ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") == 0 ) || ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "9") == 0 ) ) )
               {
                  AV108PrdNumi = A872RecPrdNum + httpContext.getMessage( "M", "") ;
               }
               AV122Quant_aux = DecimalUtil.doubleToDec(0) ;
               if ( A490ForPrdUMe == 1 )
               {
                  AV31var2 = httpContext.getMessage( "Gr/L", "") ;
                  AV122Quant_aux = A431FacCon.multiply(DecimalUtil.doubleToDec(A4695RecVolPrf)) ;
               }
               if ( A490ForPrdUMe == 2 )
               {
                  AV31var2 = httpContext.getMessage( "Cc/L", "") ;
                  AV122Quant_aux = A431FacCon.multiply(DecimalUtil.doubleToDec(A4695RecVolPrf)) ;
               }
               if ( A490ForPrdUMe == 3 )
               {
                  AV31var2 = "%" ;
                  AV122Quant_aux = A431FacCon.multiply(AV17RecMaqKgs).multiply(DecimalUtil.doubleToDec(10)) ;
               }
               if ( A490ForPrdUMe == 2 )
               {
                  AV28Unidades = httpContext.getMessage( "Cc", "") ;
               }
               else
               {
                  if ( A490ForPrdUMe == 3 )
                  {
                     if ( A743PrdUniCon == 3 )
                     {
                        AV28Unidades = httpContext.getMessage( "Cc", "") ;
                     }
                     else
                     {
                        AV28Unidades = httpContext.getMessage( "Gr", "") ;
                     }
                  }
                  else
                  {
                     AV28Unidades = httpContext.getMessage( "Gr", "") ;
                     if ( A743PrdUniCon == 3 )
                     {
                        AV28Unidades = httpContext.getMessage( "Cc", "") ;
                     }
                  }
               }
               if ( ( ! (GXutil.strcmp("", A872RecPrdNum)==0) ) && ( ( GXutil.strcmp(GXutil.str( A686PrdCant, 11, 3), GXutil.str( AV122Quant_aux, 11, 3)) != 0 ) ) )
               {
                  AV123Msg_aux = httpContext.getMessage( "Erro nos calculos do produto : ", "") + AV108PrdNumi + GXutil.newLine( ) + httpContext.getMessage( "Valor na BD: ", "") + GXutil.str( A686PrdCant, 11, 3) + httpContext.getMessage( " valor calculado:", "") + GXutil.str( AV122Quant_aux, 11, 3) ;
                  httpContext.GX_msglist.addItem(AV123Msg_aux);
               }
               AV25Var1 = GXutil.str( A431FacCon, 11, 5) + " " + AV31var2 ;
               AV84Cant_Unid = GXutil.str( A686PrdCant, 11, 3) + " " + GXutil.trim( AV28Unidades) ;
               AV85RecSalmp = "" ;
               AV86RecSalVol = "" ;
               if ( A5422RecSalMP > 0 )
               {
                  AV85RecSalmp = GXutil.str( A5422RecSalMP, 3, 0) ;
               }
               if ( A5467RecSalVol > 0 )
               {
                  AV86RecSalVol = GXutil.str( A5467RecSalVol, 5, 0) ;
               }
               if ( (0==A2394RecForNro) )
               {
                  AV26RecForNro = "  " ;
               }
               else
               {
                  AV26RecForNro = GXutil.str( A2394RecForNro, 2, 0) ;
               }
               if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
               {
                  if ( GXutil.strcmp(A875RecPrdDsc, ".") == 0 )
                  {
                  }
                  else
                  {
                     AV24PrdDsc = A875RecPrdDsc ;
                     h6TG0( false, 17) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24PrdDsc, "")), 222, Gx_line+1, 358, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(168, Gx_line+0, 168, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(467, Gx_line+0, 467, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(656, Gx_line+0, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(496, Gx_line+0, 496, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(21, Gx_line+0, 21, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(616, Gx_line+0, 616, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(721, Gx_line+0, 721, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
               }
               else
               {
                  if ( ( GXutil.strcmp(AV112Maqdosifp, httpContext.getMessage( "N", "")) == 0 ) && ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 ) || ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") == 0 ) || ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "9") == 0 ) ) )
                  {
                     AV108PrdNumi = A872RecPrdNum + httpContext.getMessage( "M", "") ;
                  }
                  AV32CodPrd = GXutil.substring( A872RecPrdNum, 1, 1) ;
                  if ( A490ForPrdUMe == 2 )
                  {
                     AV28Unidades = httpContext.getMessage( "Cc", "") ;
                  }
                  else
                  {
                     if ( A490ForPrdUMe == 3 )
                     {
                        if ( A743PrdUniCon == 3 )
                        {
                           AV28Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                        else
                        {
                           AV28Unidades = httpContext.getMessage( "Gr", "") ;
                        }
                     }
                     else
                     {
                        AV28Unidades = httpContext.getMessage( "Gr", "") ;
                        if ( A743PrdUniCon == 3 )
                        {
                           AV28Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                     }
                  }
                  if ( AV29FlagImp == 1 )
                  {
                     if ( ( A686PrdCant.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV32CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV32CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV32CodPrd, "9") == 0 ) ) )
                     {
                        AV27Cantidad = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                        if ( A490ForPrdUMe == 2 )
                        {
                           AV28Unidades = httpContext.getMessage( "Lt", "") ;
                        }
                        else
                        {
                           if ( A490ForPrdUMe == 3 )
                           {
                              if ( A743PrdUniCon == 3 )
                              {
                                 AV28Unidades = httpContext.getMessage( "Lt", "") ;
                              }
                              else
                              {
                                 AV28Unidades = httpContext.getMessage( "Kg", "") ;
                              }
                           }
                           else
                           {
                              AV28Unidades = httpContext.getMessage( "Kg", "") ;
                              if ( A743PrdUniCon == 3 )
                              {
                                 AV28Unidades = httpContext.getMessage( "Lt", "") ;
                              }
                           }
                        }
                     }
                     else
                     {
                        AV27Cantidad = A686PrdCant ;
                        if ( A490ForPrdUMe == 2 )
                        {
                           AV28Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                        else
                        {
                           if ( A490ForPrdUMe == 3 )
                           {
                              if ( A743PrdUniCon == 3 )
                              {
                                 AV28Unidades = httpContext.getMessage( "Cc", "") ;
                              }
                              else
                              {
                                 AV28Unidades = httpContext.getMessage( "Gr", "") ;
                              }
                           }
                           else
                           {
                              AV28Unidades = httpContext.getMessage( "Gr", "") ;
                              if ( A743PrdUniCon == 3 )
                              {
                                 AV28Unidades = httpContext.getMessage( "Cc", "") ;
                              }
                           }
                        }
                     }
                  }
                  else
                  {
                     AV27Cantidad = A686PrdCant ;
                  }
                  if ( ( GXutil.strcmp(AV32CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV32CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV32CodPrd, "0") == 0 ) )
                  {
                     h6TG0( false, 17) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Var1, "")), 29, Gx_line+1, 113, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26RecForNro, "")), 471, Gx_line+1, 493, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(168, Gx_line+0, 168, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(467, Gx_line+0, 467, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(721, Gx_line+0, 721, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(656, Gx_line+0, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(496, Gx_line+0, 496, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(21, Gx_line+0, 21, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Cant_Unid, "")), 508, Gx_line+1, 587, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85RecSalmp, "")), 619, Gx_line+0, 651, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(616, Gx_line+0, 616, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86RecSalVol, "")), 673, Gx_line+0, 716, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108PrdNumi, "@!")), 178, Gx_line+1, 252, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 276, Gx_line+1, 412, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     h6TG0( false, 17) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Var1, "")), 29, Gx_line+1, 113, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 276, Gx_line+1, 412, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26RecForNro, "")), 471, Gx_line+1, 493, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(168, Gx_line+0, 168, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(467, Gx_line+0, 467, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(721, Gx_line+0, 721, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(656, Gx_line+0, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(496, Gx_line+0, 496, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(21, Gx_line+0, 21, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Cant_Unid, "")), 508, Gx_line+0, 587, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85RecSalmp, "")), 619, Gx_line+0, 651, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(616, Gx_line+0, 616, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108PrdNumi, "@!")), 173, Gx_line+1, 247, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
               }
               AV30Coste = AV30Coste.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            AV104ProForTip = A5523ProForTip ;
            h6TG0( false, 1) ;
            getPrinter().GxDrawLine(21, Gx_line+0, 787, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'RECUPERACIONES' Routine */
      returnInSub = false ;
      AV11TipDefDsc = GXutil.space( (short)(30)) ;
      AV68v_Texto = GXutil.space( (short)(10)) ;
      /* Using cursor P06TG13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, Integer.valueOf(AV66BarFasLot), Short.valueOf(AV67BarOrdLin), Integer.valueOf(AV65BarFasRecu)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A833TipDefCod = P06TG13_A833TipDefCod[0] ;
         n833TipDefCod = P06TG13_n833TipDefCod[0] ;
         A4667HisLavCon = P06TG13_A4667HisLavCon[0] ;
         A4665HisLavOrd = P06TG13_A4665HisLavOrd[0] ;
         A4664HisLavNpd = P06TG13_A4664HisLavNpd[0] ;
         A4663HisLavPar = P06TG13_A4663HisLavPar[0] ;
         A4662HisLavReo = P06TG13_A4662HisLavReo[0] ;
         A4661HisLavCod = P06TG13_A4661HisLavCod[0] ;
         A834TipDefDsc = P06TG13_A834TipDefDsc[0] ;
         n834TipDefDsc = P06TG13_n834TipDefDsc[0] ;
         A834TipDefDsc = P06TG13_A834TipDefDsc[0] ;
         n834TipDefDsc = P06TG13_n834TipDefDsc[0] ;
         AV11TipDefDsc = A834TipDefDsc ;
         AV68v_Texto = httpContext.getMessage( "RECUPERAÇAO", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S1710( ) throws ProcessInterruptedException
   {
      /* 'CTRL_AMOSTRA' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV81BarFacTin, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( AV78F_okcolor == 1 )
         {
            if ( AV77ForCon == 0 )
            {
               AV76Msg_r = httpContext.getMessage( "Retirar AMOSTRA", "") ;
               AV113Ctrl_m = (byte)(1) ;
               h6TG0( false, 33) ;
               getPrinter().GxAttris("Arial", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Msg_r, "")), 113, Gx_line+5, 697, Gx_line+29, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(101, Gx_line+2, 707, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
               if ( ! (GXutil.strcmp("", AV105Tab_obsf[1-1])==0) )
               {
                  h6TG0( false, 20) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes", ""), 118, Gx_line+2, 203, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Tab_obsf[1-1], "")), 213, Gx_line+1, 402, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
               AV106i_obs = (short)(2) ;
               while ( ! (GXutil.strcmp("", AV105Tab_obsf[AV106i_obs-1])==0) )
               {
                  AV107ObsForTxt = AV105Tab_obsf[AV106i_obs-1] ;
                  h6TG0( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107ObsForTxt, "")), 213, Gx_line+1, 402, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  AV106i_obs = (short)(AV106i_obs+1) ;
               }
            }
         }
      }
   }

   public void S169( ) throws ProcessInterruptedException
   {
      /* 'HLREO1' Routine */
      returnInSub = false ;
      AV88F_vez = (byte)(0) ;
      /* Using cursor P06TG14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A5061Hl_hdrp = P06TG14_A5061Hl_hdrp[0] ;
         A5060Hl_hdrr = P06TG14_A5060Hl_hdrr[0] ;
         A5059Hl_hdr = P06TG14_A5059Hl_hdr[0] ;
         A5067Hl_hdr_o = P06TG14_A5067Hl_hdr_o[0] ;
         A5068Hl_hdrr_o = P06TG14_A5068Hl_hdrr_o[0] ;
         A5069Hl_hdrp_o = P06TG14_A5069Hl_hdrp_o[0] ;
         A5073Hl_pzs_r = P06TG14_A5073Hl_pzs_r[0] ;
         n5073Hl_pzs_r = P06TG14_n5073Hl_pzs_r[0] ;
         A5072Hl_kgs_r = P06TG14_A5072Hl_kgs_r[0] ;
         n5072Hl_kgs_r = P06TG14_n5072Hl_kgs_r[0] ;
         if ( AV88F_vez == 0 )
         {
            AV88F_vez = (byte)(1) ;
            h6TG0( false, 32) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reprocessado Interno. Ordens Serviço Origem:", ""), 34, Gx_line+2, 307, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem S.", ""), 34, Gx_line+16, 88, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 171, Gx_line+16, 213, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 402, Gx_line+16, 438, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 540, Gx_line+14, 562, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 698, Gx_line+14, 721, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 738, Gx_line+14, 773, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(34, Gx_line+28, 92, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(171, Gx_line+28, 390, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(402, Gx_line+28, 519, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(540, Gx_line+28, 635, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(654, Gx_line+28, 720, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(738, Gx_line+28, 772, Gx_line+28, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc Int", ""), 100, Gx_line+16, 153, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(100, Gx_line+28, 152, Gx_line+28, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+32) ;
         }
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = A5067Hl_hdr_o ;
         GXv_int9[0] = A5068Hl_hdrr_o ;
         GXv_char6[0] = A5069Hl_hdrp_o ;
         GXv_int4[0] = AV92CliCod_a ;
         GXv_char5[0] = AV89CliNom_a ;
         GXv_char3[0] = AV90BarSer_a ;
         GXv_char12[0] = AV91ColNom_a ;
         GXv_int13[0] = 0 ;
         GXv_int14[0] = AV103DisCod_a ;
         new app.phrag06(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int9, GXv_char6, GXv_int4, GXv_char5, GXv_char3, GXv_char12, GXv_int13, GXv_int14) ;
         rreclv7.this.A396EmprCod = GXv_char10[0] ;
         rreclv7.this.A5067Hl_hdr_o = GXv_int7[0] ;
         rreclv7.this.A5068Hl_hdrr_o = GXv_int9[0] ;
         rreclv7.this.A5069Hl_hdrp_o = GXv_char6[0] ;
         rreclv7.this.AV92CliCod_a = GXv_int4[0] ;
         rreclv7.this.AV89CliNom_a = GXv_char5[0] ;
         rreclv7.this.AV90BarSer_a = GXv_char3[0] ;
         rreclv7.this.AV91ColNom_a = GXv_char12[0] ;
         rreclv7.this.AV103DisCod_a = GXv_int14[0] ;
         h6TG0( false, 17) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89CliNom_a, "")), 171, Gx_line+0, 328, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90BarSer_a, "")), 402, Gx_line+0, 486, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91ColNom_a, "")), 540, Gx_line+0, 609, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV103DisCod_a), "ZZZZZZZ9")), 100, Gx_line+0, 151, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5072Hl_kgs_r, "ZZZZZ9.99")), 664, Gx_line+0, 721, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5073Hl_pzs_r), "ZZZ9")), 747, Gx_line+0, 773, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5067Hl_hdr_o), "ZZZZZZZ9")), 34, Gx_line+0, 85, Gx_line+16, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S149( ) throws ProcessInterruptedException
   {
      /* 'AGRHDFP' Routine */
      returnInSub = false ;
      AV88F_vez = (byte)(0) ;
      /* Using cursor P06TG15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, AV87ProCod, Short.valueOf(AV67BarOrdLin), Integer.valueOf(AV42RecNroPar)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A4643BarFasLot = P06TG15_A4643BarFasLot[0] ;
         A194BarOrdLin = P06TG15_A194BarOrdLin[0] ;
         A758ProCod = P06TG15_A758ProCod[0] ;
         A5954Ap_Barcod = P06TG15_A5954Ap_Barcod[0] ;
         A5955Ap_BarReo = P06TG15_A5955Ap_BarReo[0] ;
         A5956Ap_BarPar = P06TG15_A5956Ap_BarPar[0] ;
         A5960Ap_Piezas = P06TG15_A5960Ap_Piezas[0] ;
         n5960Ap_Piezas = P06TG15_n5960Ap_Piezas[0] ;
         A5959Ap_Kilos = P06TG15_A5959Ap_Kilos[0] ;
         n5959Ap_Kilos = P06TG15_n5959Ap_Kilos[0] ;
         A5957Ap_ProCod = P06TG15_A5957Ap_ProCod[0] ;
         A5958Ap_BarOrd = P06TG15_A5958Ap_BarOrd[0] ;
         if ( AV88F_vez == 0 )
         {
            AV88F_vez = (byte)(1) ;
            h6TG0( false, 40) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Agrupado com:", ""), 34, Gx_line+8, 123, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem S.", ""), 34, Gx_line+22, 88, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 171, Gx_line+22, 213, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 402, Gx_line+22, 438, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 540, Gx_line+20, 562, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 698, Gx_line+20, 721, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 738, Gx_line+20, 773, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(31, Gx_line+34, 89, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(171, Gx_line+34, 390, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(402, Gx_line+34, 519, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(540, Gx_line+34, 635, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(654, Gx_line+34, 720, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(738, Gx_line+34, 772, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc Int", ""), 100, Gx_line+22, 153, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(100, Gx_line+34, 152, Gx_line+34, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+40) ;
         }
         GXv_char12[0] = A396EmprCod ;
         GXv_int14[0] = A5954Ap_Barcod ;
         GXv_int9[0] = A5955Ap_BarReo ;
         GXv_char10[0] = A5956Ap_BarPar ;
         GXv_int13[0] = AV92CliCod_a ;
         GXv_char6[0] = AV89CliNom_a ;
         GXv_char5[0] = AV90BarSer_a ;
         GXv_char3[0] = AV91ColNom_a ;
         GXv_int7[0] = 0 ;
         GXv_int4[0] = AV103DisCod_a ;
         new app.phrag06(remoteHandle, context).execute( GXv_char12, GXv_int14, GXv_int9, GXv_char10, GXv_int13, GXv_char6, GXv_char5, GXv_char3, GXv_int7, GXv_int4) ;
         rreclv7.this.A396EmprCod = GXv_char12[0] ;
         rreclv7.this.A5954Ap_Barcod = GXv_int14[0] ;
         rreclv7.this.A5955Ap_BarReo = GXv_int9[0] ;
         rreclv7.this.A5956Ap_BarPar = GXv_char10[0] ;
         rreclv7.this.AV92CliCod_a = GXv_int13[0] ;
         rreclv7.this.AV89CliNom_a = GXv_char6[0] ;
         rreclv7.this.AV90BarSer_a = GXv_char5[0] ;
         rreclv7.this.AV91ColNom_a = GXv_char3[0] ;
         rreclv7.this.AV103DisCod_a = GXv_int4[0] ;
         h6TG0( false, 16) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5954Ap_Barcod), "ZZZZZZZ9")), 34, Gx_line+0, 85, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5959Ap_Kilos, "ZZZZZ9.99")), 664, Gx_line+0, 721, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5960Ap_Piezas), "ZZZ9")), 747, Gx_line+0, 773, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89CliNom_a, "")), 171, Gx_line+0, 328, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90BarSer_a, "")), 402, Gx_line+0, 486, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91ColNom_a, "")), 540, Gx_line+0, 609, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV103DisCod_a), "ZZZZZZZ9")), 100, Gx_line+0, 151, Gx_line+16, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+16) ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S159( ) throws ProcessInterruptedException
   {
      /* 'AGRHDF' Routine */
      returnInSub = false ;
      AV88F_vez = (byte)(0) ;
      /* Using cursor P06TG16 */
      pr_default.execute(12, new Object[] {AV63EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, AV87ProCod, Short.valueOf(AV67BarOrdLin)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A194BarOrdLin = P06TG16_A194BarOrdLin[0] ;
         A758ProCod = P06TG16_A758ProCod[0] ;
         A4940A_Barcod = P06TG16_A4940A_Barcod[0] ;
         A4941A_BarReo = P06TG16_A4941A_BarReo[0] ;
         A4942A_BarPar = P06TG16_A4942A_BarPar[0] ;
         A4947A_Piezas = P06TG16_A4947A_Piezas[0] ;
         n4947A_Piezas = P06TG16_n4947A_Piezas[0] ;
         A4946A_Kilos = P06TG16_A4946A_Kilos[0] ;
         n4946A_Kilos = P06TG16_n4946A_Kilos[0] ;
         A4943A_ProCod = P06TG16_A4943A_ProCod[0] ;
         A4944A_BarOrd = P06TG16_A4944A_BarOrd[0] ;
         if ( AV88F_vez == 0 )
         {
            AV88F_vez = (byte)(1) ;
            h6TG0( false, 30) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Agrupado com:", ""), 34, Gx_line+0, 123, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ordem S.", ""), 34, Gx_line+14, 88, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 171, Gx_line+14, 213, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 402, Gx_line+14, 438, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 540, Gx_line+11, 562, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 698, Gx_line+11, 721, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 738, Gx_line+11, 773, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(34, Gx_line+26, 92, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(171, Gx_line+26, 390, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(402, Gx_line+26, 519, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(540, Gx_line+26, 635, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(654, Gx_line+26, 720, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(738, Gx_line+26, 772, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc Int", ""), 100, Gx_line+14, 153, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(100, Gx_line+26, 152, Gx_line+26, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+30) ;
         }
         GXv_char12[0] = A396EmprCod ;
         GXv_int14[0] = A4940A_Barcod ;
         GXv_int9[0] = A4941A_BarReo ;
         GXv_char10[0] = A4942A_BarPar ;
         GXv_int13[0] = AV92CliCod_a ;
         GXv_char6[0] = AV89CliNom_a ;
         GXv_char5[0] = AV90BarSer_a ;
         GXv_char3[0] = AV91ColNom_a ;
         GXv_int7[0] = 0 ;
         GXv_int4[0] = AV103DisCod_a ;
         new app.phrag06(remoteHandle, context).execute( GXv_char12, GXv_int14, GXv_int9, GXv_char10, GXv_int13, GXv_char6, GXv_char5, GXv_char3, GXv_int7, GXv_int4) ;
         rreclv7.this.A396EmprCod = GXv_char12[0] ;
         rreclv7.this.A4940A_Barcod = GXv_int14[0] ;
         rreclv7.this.A4941A_BarReo = GXv_int9[0] ;
         rreclv7.this.A4942A_BarPar = GXv_char10[0] ;
         rreclv7.this.AV92CliCod_a = GXv_int13[0] ;
         rreclv7.this.AV89CliNom_a = GXv_char6[0] ;
         rreclv7.this.AV90BarSer_a = GXv_char5[0] ;
         rreclv7.this.AV91ColNom_a = GXv_char3[0] ;
         rreclv7.this.AV103DisCod_a = GXv_int4[0] ;
         h6TG0( false, 15) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4940A_Barcod), "ZZZZZZZ9")), 34, Gx_line+0, 85, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4946A_Kilos, "ZZZZZ9.99")), 664, Gx_line+0, 721, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4947A_Piezas), "ZZZ9")), 747, Gx_line+0, 773, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89CliNom_a, "")), 171, Gx_line+0, 328, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90BarSer_a, "")), 402, Gx_line+0, 486, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91ColNom_a, "")), 540, Gx_line+0, 609, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV103DisCod_a), "ZZZZZZZ9")), 100, Gx_line+0, 151, Gx_line+16, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+15) ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S191( ) throws ProcessInterruptedException
   {
      /* 'OBSERF' Routine */
      returnInSub = false ;
      AV106i_obs = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV105Tab_obsf[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P06TG17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV33CliCod), AV37BarSer, AV74BarColNom, Integer.valueOf(AV79barColNum), Byte.valueOf(AV80BarTipCol)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A831TipColCod = P06TG17_A831TipColCod[0] ;
         A483ForColNum = P06TG17_A483ForColNum[0] ;
         A482ForColNom = P06TG17_A482ForColNom[0] ;
         A494ForSer = P06TG17_A494ForSer[0] ;
         A252CliCod = P06TG17_A252CliCod[0] ;
         n252CliCod = P06TG17_n252CliCod[0] ;
         A649ObsForTxt = P06TG17_A649ObsForTxt[0] ;
         A650ObsLin = P06TG17_A650ObsLin[0] ;
         if ( AV106i_obs > 10 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV105Tab_obsf[AV106i_obs-1] = A649ObsForTxt ;
         AV106i_obs = (short)(AV106i_obs+1) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S139( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV112Maqdosifp = "" ;
      /* Using cursor P06TG18 */
      pr_default.execute(14, new Object[] {A396EmprCod, AV47MaqCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A602MaqCod = P06TG18_A602MaqCod[0] ;
         A5949MaqDosifP = P06TG18_A5949MaqDosifP[0] ;
         n5949MaqDosifP = P06TG18_n5949MaqDosifP[0] ;
         AV112Maqdosifp = A5949MaqDosifP ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S201( ) throws ProcessInterruptedException
   {
      /* 'HLREOP' Routine */
      returnInSub = false ;
      AV117dsccausa = "" ;
      /* Using cursor P06TG19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A5085CodCausa = P06TG19_A5085CodCausa[0] ;
         n5085CodCausa = P06TG19_n5085CodCausa[0] ;
         A5061Hl_hdrp = P06TG19_A5061Hl_hdrp[0] ;
         A5060Hl_hdrr = P06TG19_A5060Hl_hdrr[0] ;
         A5059Hl_hdr = P06TG19_A5059Hl_hdr[0] ;
         A5086DscCausa = P06TG19_A5086DscCausa[0] ;
         n5086DscCausa = P06TG19_n5086DscCausa[0] ;
         A5086DscCausa = P06TG19_A5086DscCausa[0] ;
         n5086DscCausa = P06TG19_n5086DscCausa[0] ;
         AV117dsccausa = GXutil.substring( A5086DscCausa, 1, 25) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void h6TG0( boolean bFoot ,
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
            if ( AV102F_obs == 1 )
            {
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 28, Gx_line+48, 71, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33CliCod), "ZZZZZ9")), 117, Gx_line+48, 167, Gx_line+65, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34CliNom, "")), 185, Gx_line+48, 374, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 28, Gx_line+69, 64, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37BarSer, "")), 117, Gx_line+69, 250, Gx_line+86, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38BarSerDsc, "")), 272, Gx_line+69, 436, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(22, Gx_line+45, 788, Gx_line+230, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes", ""), 28, Gx_line+154, 107, Gx_line+171, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Tab_obs[1-1], "")), 116, Gx_line+154, 492, Gx_line+172, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processo", ""), 28, Gx_line+114, 86, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70ProDsc2, "")), 116, Gx_line+114, 783, Gx_line+131, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fases", ""), 28, Gx_line+134, 67, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Fases_l, "")), 116, Gx_line+134, 534, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Côr Cliente", ""), 609, Gx_line+48, 677, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82BarNomCli, "")), 689, Gx_line+48, 771, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Modelo", ""), 501, Gx_line+69, 546, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35BarMdlCod, "")), 553, Gx_line+69, 635, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tamanho", ""), 652, Gx_line+69, 707, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36BarTam, "")), 725, Gx_line+69, 780, Gx_line+87, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Tab_obs[2-1], "")), 116, Gx_line+173, 492, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Tab_obs[3-1], "")), 116, Gx_line+193, 492, Gx_line+211, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo Peças", ""), 28, Gx_line+211, 97, Gx_line+228, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Tipo_pzas, "")), 116, Gx_line+213, 534, Gx_line+229, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 433, Gx_line+48, 455, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74BarColNom, "")), 458, Gx_line+48, 554, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110INTDSCF, "")), 568, Gx_line+48, 607, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem de Serviço", ""), 556, Gx_line+3, 664, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Hdr, "")), 672, Gx_line+1, 765, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Qgs", ""), 339, Gx_line+3, 414, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39BarKgm, "ZZZZZ9.99")), 420, Gx_line+3, 495, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc. Int.", ""), 174, Gx_line+27, 245, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV94DisCod), "ZZZZZZZ9")), 265, Gx_line+27, 324, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Texto_c, "")), 23, Gx_line+27, 149, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("3 of 9 Barcode", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Hdrcdb, "")), 672, Gx_line+28, 788, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Peças", ""), 181, Gx_line+3, 273, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40BarPie), "ZZZZZ9")), 281, Gx_line+3, 314, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 357, Gx_line+27, 388, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV72BarFecGen, "99/99/99"), 398, Gx_line+27, 465, Gx_line+44, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV73BarHorReg, "99:99:99"), 474, Gx_line+27, 541, Gx_line+44, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("-", 467, Gx_line+27, 472, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 67, Gx_line+1, 112, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 24, Gx_line+1, 55, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Enc. Cliente", ""), 28, Gx_line+92, 103, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118BarDisNum, "")), 115, Gx_line+92, 224, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OP", ""), 243, Gx_line+92, 264, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Barenccli, "")), 268, Gx_line+92, 394, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lavagem", ""), 442, Gx_line+92, 496, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Barmat, "")), 498, Gx_line+92, 599, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121BarLar, "")), 696, Gx_line+92, 760, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lacre", ""), 655, Gx_line+92, 689, Gx_line+109, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+230) ;
            }
            else
            {
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 28, Gx_line+47, 71, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33CliCod), "ZZZZZ9")), 117, Gx_line+47, 167, Gx_line+64, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34CliNom, "")), 176, Gx_line+47, 365, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 28, Gx_line+68, 64, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37BarSer, "")), 117, Gx_line+68, 250, Gx_line+85, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38BarSerDsc, "")), 263, Gx_line+68, 427, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Modelo", ""), 486, Gx_line+68, 531, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35BarMdlCod, "")), 539, Gx_line+68, 621, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tamanho", ""), 638, Gx_line+68, 693, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36BarTam, "")), 710, Gx_line+68, 765, Gx_line+86, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processo", ""), 28, Gx_line+110, 86, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70ProDsc2, "")), 117, Gx_line+110, 784, Gx_line+127, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fases", ""), 28, Gx_line+131, 67, Gx_line+148, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Fases_l, "")), 117, Gx_line+131, 535, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Côr Cliente", ""), 595, Gx_line+47, 663, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82BarNomCli, "")), 674, Gx_line+47, 756, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(22, Gx_line+44, 788, Gx_line+170, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo Peças", ""), 28, Gx_line+148, 97, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Tipo_pzas, "")), 117, Gx_line+150, 535, Gx_line+166, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 422, Gx_line+47, 444, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74BarColNom, "")), 447, Gx_line+47, 543, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110INTDSCF, "")), 556, Gx_line+47, 595, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem de Serviço", ""), 555, Gx_line+2, 663, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Hdr, "")), 671, Gx_line+0, 764, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Qgs", ""), 338, Gx_line+2, 413, Gx_line+19, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39BarKgm, "ZZZZZ9.99")), 419, Gx_line+2, 494, Gx_line+19, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc. Int.", ""), 173, Gx_line+21, 244, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV94DisCod), "ZZZZZZZ9")), 264, Gx_line+21, 323, Gx_line+39, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Texto_c, "")), 22, Gx_line+21, 148, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("3 of 9 Barcode", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Hdrcdb, "")), 673, Gx_line+22, 789, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Peças", ""), 180, Gx_line+2, 272, Gx_line+19, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40BarPie), "ZZZZZ9")), 280, Gx_line+2, 313, Gx_line+19, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 356, Gx_line+21, 387, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV72BarFecGen, "99/99/99"), 397, Gx_line+21, 464, Gx_line+38, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV73BarHorReg, "99:99:99"), 473, Gx_line+21, 540, Gx_line+38, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("-", 466, Gx_line+21, 471, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 66, Gx_line+2, 111, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 23, Gx_line+2, 54, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Enc. Cliente", ""), 28, Gx_line+88, 103, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118BarDisNum, "")), 117, Gx_line+88, 226, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OP", ""), 244, Gx_line+88, 265, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Barenccli, "")), 269, Gx_line+88, 395, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lavagem", ""), 443, Gx_line+88, 497, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Barmat, "")), 499, Gx_line+88, 600, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121BarLar, "")), 697, Gx_line+88, 761, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lacre", ""), 656, Gx_line+88, 690, Gx_line+105, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+171) ;
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
      this.aP0[0] = rreclv7.this.A396EmprCod;
      this.aP1[0] = rreclv7.this.A129BarCod;
      this.aP2[0] = rreclv7.this.A132BarCodReo;
      this.aP3[0] = rreclv7.this.A130BarCodPar;
      this.aP4[0] = rreclv7.this.AV66BarFasLot;
      this.aP5[0] = rreclv7.this.AV58Grupo_l;
      this.aP6[0] = rreclv7.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV69DisObstxt = "" ;
      scmdbuf = "" ;
      P06TG2_A833TipDefCod = new short[1] ;
      P06TG2_n833TipDefCod = new boolean[] {false} ;
      P06TG2_A396EmprCod = new String[] {""} ;
      P06TG2_A129BarCod = new int[1] ;
      P06TG2_A132BarCodReo = new byte[1] ;
      P06TG2_A130BarCodPar = new String[] {""} ;
      P06TG2_A361DisCod = new int[1] ;
      P06TG2_A2010BarTipDis = new String[] {""} ;
      P06TG2_A3030BarPlf = new String[] {""} ;
      P06TG2_A252CliCod = new int[1] ;
      P06TG2_n252CliCod = new boolean[] {false} ;
      P06TG2_A212BarSer = new String[] {""} ;
      P06TG2_A177BarLar = new String[] {""} ;
      P06TG2_A182BarMat = new String[] {""} ;
      P06TG2_A4812BarEncCli = new String[] {""} ;
      P06TG2_A143BarDisNum = new String[] {""} ;
      P06TG2_A135BarColNom = new String[] {""} ;
      P06TG2_A136BarColNum = new int[1] ;
      P06TG2_A218BarTipCol = new byte[1] ;
      P06TG2_A4465BarAcaBak = new String[] {""} ;
      P06TG2_n4465BarAcaBak = new boolean[] {false} ;
      P06TG2_A148BarEstReo = new byte[1] ;
      P06TG2_A834TipDefDsc = new String[] {""} ;
      P06TG2_n834TipDefDsc = new boolean[] {false} ;
      A2010BarTipDis = "" ;
      A3030BarPlf = "" ;
      A212BarSer = "" ;
      A177BarLar = "" ;
      A182BarMat = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      A4465BarAcaBak = "" ;
      A834TipDefDsc = "" ;
      AV46BarCodPar = "" ;
      AV114BarTipDis = "" ;
      AV109Muestras = "" ;
      AV37BarSer = "" ;
      AV121BarLar = "" ;
      AV120Barmat = "" ;
      AV119Barenccli = "" ;
      AV118BarDisNum = "" ;
      AV74BarColNom = "" ;
      AV111Texto_c = "" ;
      GXv_int1 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      AV110INTDSCF = "" ;
      AV11TipDefDsc = "" ;
      AV68v_Texto = "" ;
      AV101Tab_obs = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV101Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06TG3_A396EmprCod = new String[] {""} ;
      P06TG3_A361DisCod = new int[1] ;
      P06TG3_A377DisObsTxt = new String[] {""} ;
      P06TG3_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV70ProDsc2 = "" ;
      P06TG4_A396EmprCod = new String[] {""} ;
      P06TG4_A129BarCod = new int[1] ;
      P06TG4_A132BarCodReo = new byte[1] ;
      P06TG4_A130BarCodPar = new String[] {""} ;
      P06TG4_A758ProCod = new String[] {""} ;
      P06TG4_A761ProFasLin = new short[1] ;
      P06TG4_n761ProFasLin = new boolean[] {false} ;
      P06TG4_A4628ProDsc2 = new String[] {""} ;
      A758ProCod = "" ;
      A4628ProDsc2 = "" ;
      AV71Fases_l = "" ;
      P06TG5_A457FasCod = new String[] {""} ;
      P06TG5_A396EmprCod = new String[] {""} ;
      P06TG5_A129BarCod = new int[1] ;
      P06TG5_A132BarCodReo = new byte[1] ;
      P06TG5_A130BarCodPar = new String[] {""} ;
      P06TG5_A758ProCod = new String[] {""} ;
      P06TG5_A153BarFasEst = new byte[1] ;
      P06TG5_A460FasDsc = new String[] {""} ;
      P06TG5_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV99Tipo_pzas = "" ;
      P06TG6_A44AlbRecCod = new int[1] ;
      P06TG6_A4295ClasCod = new short[1] ;
      P06TG6_n4295ClasCod = new boolean[] {false} ;
      P06TG6_A396EmprCod = new String[] {""} ;
      P06TG6_A129BarCod = new int[1] ;
      P06TG6_A132BarCodReo = new byte[1] ;
      P06TG6_A130BarCodPar = new String[] {""} ;
      P06TG6_A200BarPieCod = new String[] {""} ;
      P06TG6_A4296ClasDsc = new String[] {""} ;
      P06TG6_n4296ClasDsc = new boolean[] {false} ;
      A200BarPieCod = "" ;
      A4296ClasDsc = "" ;
      P06TG8_A396EmprCod = new String[] {""} ;
      P06TG8_A129BarCod = new int[1] ;
      P06TG8_A132BarCodReo = new byte[1] ;
      P06TG8_A130BarCodPar = new String[] {""} ;
      P06TG8_A4314BarFasBot1 = new String[] {""} ;
      P06TG8_n4314BarFasBot1 = new boolean[] {false} ;
      P06TG8_A758ProCod = new String[] {""} ;
      P06TG8_A4315BarNumBot1 = new int[1] ;
      P06TG8_n4315BarNumBot1 = new boolean[] {false} ;
      P06TG8_A4648BarFasRecu = new int[1] ;
      P06TG8_n4648BarFasRecu = new boolean[] {false} ;
      P06TG8_A135BarColNom = new String[] {""} ;
      P06TG8_A150BarFacTin = new String[] {""} ;
      P06TG8_A1234BarNomCli = new String[] {""} ;
      P06TG8_A148BarEstReo = new byte[1] ;
      P06TG8_A252CliCod = new int[1] ;
      P06TG8_n252CliCod = new boolean[] {false} ;
      P06TG8_A279CliNom = new String[] {""} ;
      P06TG8_A4609BarMdlCod = new String[] {""} ;
      P06TG8_A212BarSer = new String[] {""} ;
      P06TG8_A1652BarSerDsc = new String[] {""} ;
      P06TG8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P06TG8_A4613BarHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P06TG8_n4613BarHorReg = new boolean[] {false} ;
      P06TG8_A603MaqCodBis = new String[] {""} ;
      P06TG8_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG8_n4645BarFasKgs = new boolean[] {false} ;
      P06TG8_A4644BarFasNPrd = new short[1] ;
      P06TG8_n4644BarFasNPrd = new boolean[] {false} ;
      P06TG8_A457FasCod = new String[] {""} ;
      P06TG8_A4287BarFasFor = new String[] {""} ;
      P06TG8_A194BarOrdLin = new short[1] ;
      P06TG8_A4643BarFasLot = new int[1] ;
      P06TG8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG8_A199BarPie1 = new short[1] ;
      P06TG8_A365DisDes = new String[] {""} ;
      P06TG8_A898BarPieNDes = new int[1] ;
      A4314BarFasBot1 = "" ;
      A150BarFacTin = "" ;
      A1234BarNomCli = "" ;
      A279CliNom = "" ;
      A4609BarMdlCod = "" ;
      A1652BarSerDsc = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A4613BarHorReg = GXutil.resetTime( GXutil.nullDate() );
      A603MaqCodBis = "" ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      A4287BarFasFor = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      GXv_int11 = new short[1] ;
      AV87ProCod = "" ;
      AV81BarFacTin = "" ;
      AV82BarNomCli = "" ;
      AV8Hdr = "" ;
      AV63EmprCod = "" ;
      AV34CliNom = "" ;
      AV35BarMdlCod = "" ;
      AV38BarSerDsc = "" ;
      AV39BarKgm = DecimalUtil.ZERO ;
      AV72BarFecGen = GXutil.nullDate() ;
      AV73BarHorReg = GXutil.resetTime( GXutil.nullDate() );
      AV47MaqCod = "" ;
      AV48MaqDsc = "" ;
      AV17RecMaqKgs = DecimalUtil.ZERO ;
      AV18FasCod = "" ;
      AV22FasDsc = "" ;
      AV55Ceros8 = "" ;
      AV50BarCod_a = "" ;
      AV96Npda_a3 = "" ;
      AV56Orden_a = "" ;
      AV51Reo_a = "" ;
      AV9HdrPart = "" ;
      AV10HdrPda = "" ;
      AV116Hdrcdb = "" ;
      AV41FasCod_cb = "" ;
      AV57FasCod_cb2 = "" ;
      AV117dsccausa = "" ;
      P06TG10_A396EmprCod = new String[] {""} ;
      P06TG10_A2804RecLinMaq = new short[1] ;
      P06TG10_A130BarCodPar = new String[] {""} ;
      P06TG10_A132BarCodReo = new byte[1] ;
      P06TG10_A129BarCod = new int[1] ;
      P06TG10_A4268RecOrdLin = new short[1] ;
      P06TG10_n4268RecOrdLin = new boolean[] {false} ;
      P06TG10_A4654RecNroPar = new int[1] ;
      P06TG10_n4654RecNroPar = new boolean[] {false} ;
      P06TG10_A4258RecMaqFas = new String[] {""} ;
      P06TG10_n4258RecMaqFas = new boolean[] {false} ;
      P06TG10_A602MaqCod = new String[] {""} ;
      P06TG10_A4402RecUsrCod = new String[] {""} ;
      P06TG10_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P06TG10_n4866RecFecAlt = new boolean[] {false} ;
      P06TG10_A606MaqDsc = new String[] {""} ;
      P06TG10_n606MaqDsc = new boolean[] {false} ;
      P06TG10_A148BarEstReo = new byte[1] ;
      P06TG10_A4273RecFagPrd = new int[1] ;
      P06TG10_A4261RecTotPrd = new int[1] ;
      P06TG10_n4261RecTotPrd = new boolean[] {false} ;
      P06TG10_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG10_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4258RecMaqFas = "" ;
      A602MaqCod = "" ;
      A4402RecUsrCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A606MaqDsc = "" ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      AV98Nactx_3a = "" ;
      P06TG11_A396EmprCod = new String[] {""} ;
      P06TG11_A129BarCod = new int[1] ;
      P06TG11_A132BarCodReo = new byte[1] ;
      P06TG11_A130BarCodPar = new String[] {""} ;
      P06TG11_A2804RecLinMaq = new short[1] ;
      P06TG11_A4695RecVolPrf = new int[1] ;
      P06TG11_A1273RecLinPro = new byte[1] ;
      P06TG11_A4696RecTiempo = new short[1] ;
      P06TG11_n4696RecTiempo = new boolean[] {false} ;
      P06TG11_A4697RecNroPrg = new int[1] ;
      P06TG11_A764ProForCod = new String[] {""} ;
      P06TG11_A766ProForDsc = new String[] {""} ;
      P06TG11_A5523ProForTip = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A5523ProForTip = "" ;
      AV19ProForCod = "" ;
      P06TG12_A719PrdNum = new String[] {""} ;
      P06TG12_n719PrdNum = new boolean[] {false} ;
      P06TG12_A396EmprCod = new String[] {""} ;
      P06TG12_A129BarCod = new int[1] ;
      P06TG12_A132BarCodReo = new byte[1] ;
      P06TG12_A130BarCodPar = new String[] {""} ;
      P06TG12_A2804RecLinMaq = new short[1] ;
      P06TG12_A1273RecLinPro = new byte[1] ;
      P06TG12_A872RecPrdNum = new String[] {""} ;
      P06TG12_A490ForPrdUMe = new byte[1] ;
      P06TG12_n490ForPrdUMe = new boolean[] {false} ;
      P06TG12_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG12_A743PrdUniCon = new byte[1] ;
      P06TG12_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG12_A5422RecSalMP = new short[1] ;
      P06TG12_A5467RecSalVol = new int[1] ;
      P06TG12_A2394RecForNro = new byte[1] ;
      P06TG12_A875RecPrdDsc = new String[] {""} ;
      P06TG12_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG12_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG12_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A872RecPrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A875RecPrdDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV108PrdNumi = "" ;
      AV112Maqdosifp = "" ;
      AV122Quant_aux = DecimalUtil.ZERO ;
      AV31var2 = "" ;
      AV28Unidades = "" ;
      AV123Msg_aux = "" ;
      AV25Var1 = "" ;
      AV84Cant_Unid = "" ;
      AV85RecSalmp = "" ;
      AV86RecSalVol = "" ;
      AV26RecForNro = "" ;
      AV24PrdDsc = "" ;
      AV32CodPrd = "" ;
      AV27Cantidad = DecimalUtil.ZERO ;
      AV30Coste = DecimalUtil.ZERO ;
      AV104ProForTip = "" ;
      P06TG13_A833TipDefCod = new short[1] ;
      P06TG13_n833TipDefCod = new boolean[] {false} ;
      P06TG13_A396EmprCod = new String[] {""} ;
      P06TG13_A4667HisLavCon = new int[1] ;
      P06TG13_A4665HisLavOrd = new short[1] ;
      P06TG13_A4664HisLavNpd = new int[1] ;
      P06TG13_A4663HisLavPar = new String[] {""} ;
      P06TG13_A4662HisLavReo = new byte[1] ;
      P06TG13_A4661HisLavCod = new int[1] ;
      P06TG13_A834TipDefDsc = new String[] {""} ;
      P06TG13_n834TipDefDsc = new boolean[] {false} ;
      A4663HisLavPar = "" ;
      AV76Msg_r = "" ;
      AV105Tab_obsf = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV105Tab_obsf[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV107ObsForTxt = "" ;
      P06TG14_A396EmprCod = new String[] {""} ;
      P06TG14_A5061Hl_hdrp = new String[] {""} ;
      P06TG14_A5060Hl_hdrr = new byte[1] ;
      P06TG14_A5059Hl_hdr = new int[1] ;
      P06TG14_A5067Hl_hdr_o = new int[1] ;
      P06TG14_A5068Hl_hdrr_o = new byte[1] ;
      P06TG14_A5069Hl_hdrp_o = new String[] {""} ;
      P06TG14_A5073Hl_pzs_r = new short[1] ;
      P06TG14_n5073Hl_pzs_r = new boolean[] {false} ;
      P06TG14_A5072Hl_kgs_r = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG14_n5072Hl_kgs_r = new boolean[] {false} ;
      A5061Hl_hdrp = "" ;
      A5069Hl_hdrp_o = "" ;
      A5072Hl_kgs_r = DecimalUtil.ZERO ;
      AV89CliNom_a = "" ;
      AV90BarSer_a = "" ;
      AV91ColNom_a = "" ;
      P06TG15_A396EmprCod = new String[] {""} ;
      P06TG15_A4643BarFasLot = new int[1] ;
      P06TG15_A194BarOrdLin = new short[1] ;
      P06TG15_A758ProCod = new String[] {""} ;
      P06TG15_A130BarCodPar = new String[] {""} ;
      P06TG15_A132BarCodReo = new byte[1] ;
      P06TG15_A129BarCod = new int[1] ;
      P06TG15_A5954Ap_Barcod = new int[1] ;
      P06TG15_A5955Ap_BarReo = new byte[1] ;
      P06TG15_A5956Ap_BarPar = new String[] {""} ;
      P06TG15_A5960Ap_Piezas = new short[1] ;
      P06TG15_n5960Ap_Piezas = new boolean[] {false} ;
      P06TG15_A5959Ap_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG15_n5959Ap_Kilos = new boolean[] {false} ;
      P06TG15_A5957Ap_ProCod = new String[] {""} ;
      P06TG15_A5958Ap_BarOrd = new short[1] ;
      A5956Ap_BarPar = "" ;
      A5959Ap_Kilos = DecimalUtil.ZERO ;
      A5957Ap_ProCod = "" ;
      P06TG16_A194BarOrdLin = new short[1] ;
      P06TG16_A758ProCod = new String[] {""} ;
      P06TG16_A130BarCodPar = new String[] {""} ;
      P06TG16_A132BarCodReo = new byte[1] ;
      P06TG16_A129BarCod = new int[1] ;
      P06TG16_A396EmprCod = new String[] {""} ;
      P06TG16_A4940A_Barcod = new int[1] ;
      P06TG16_A4941A_BarReo = new byte[1] ;
      P06TG16_A4942A_BarPar = new String[] {""} ;
      P06TG16_A4947A_Piezas = new short[1] ;
      P06TG16_n4947A_Piezas = new boolean[] {false} ;
      P06TG16_A4946A_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TG16_n4946A_Kilos = new boolean[] {false} ;
      P06TG16_A4943A_ProCod = new String[] {""} ;
      P06TG16_A4944A_BarOrd = new short[1] ;
      A4942A_BarPar = "" ;
      A4946A_Kilos = DecimalUtil.ZERO ;
      A4943A_ProCod = "" ;
      GXv_char12 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int4 = new int[1] ;
      P06TG17_A396EmprCod = new String[] {""} ;
      P06TG17_A831TipColCod = new byte[1] ;
      P06TG17_A483ForColNum = new int[1] ;
      P06TG17_A482ForColNom = new String[] {""} ;
      P06TG17_A494ForSer = new String[] {""} ;
      P06TG17_A252CliCod = new int[1] ;
      P06TG17_n252CliCod = new boolean[] {false} ;
      P06TG17_A649ObsForTxt = new String[] {""} ;
      P06TG17_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A649ObsForTxt = "" ;
      P06TG18_A396EmprCod = new String[] {""} ;
      P06TG18_A602MaqCod = new String[] {""} ;
      P06TG18_A5949MaqDosifP = new String[] {""} ;
      P06TG18_n5949MaqDosifP = new boolean[] {false} ;
      A5949MaqDosifP = "" ;
      P06TG19_A5085CodCausa = new short[1] ;
      P06TG19_n5085CodCausa = new boolean[] {false} ;
      P06TG19_A396EmprCod = new String[] {""} ;
      P06TG19_A5061Hl_hdrp = new String[] {""} ;
      P06TG19_A5060Hl_hdrr = new byte[1] ;
      P06TG19_A5059Hl_hdr = new int[1] ;
      P06TG19_A5086DscCausa = new String[] {""} ;
      P06TG19_n5086DscCausa = new boolean[] {false} ;
      A5086DscCausa = "" ;
      AV36BarTam = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rreclv7__default(),
         new Object[] {
             new Object[] {
            P06TG2_A833TipDefCod, P06TG2_n833TipDefCod, P06TG2_A396EmprCod, P06TG2_A129BarCod, P06TG2_A132BarCodReo, P06TG2_A130BarCodPar, P06TG2_A361DisCod, P06TG2_A2010BarTipDis, P06TG2_A3030BarPlf, P06TG2_A252CliCod,
            P06TG2_n252CliCod, P06TG2_A212BarSer, P06TG2_A177BarLar, P06TG2_A182BarMat, P06TG2_A4812BarEncCli, P06TG2_A143BarDisNum, P06TG2_A135BarColNom, P06TG2_A136BarColNum, P06TG2_A218BarTipCol, P06TG2_A4465BarAcaBak,
            P06TG2_n4465BarAcaBak, P06TG2_A148BarEstReo, P06TG2_A834TipDefDsc, P06TG2_n834TipDefDsc
            }
            , new Object[] {
            P06TG3_A396EmprCod, P06TG3_A361DisCod, P06TG3_A377DisObsTxt, P06TG3_A376DisObsLin
            }
            , new Object[] {
            P06TG4_A396EmprCod, P06TG4_A129BarCod, P06TG4_A132BarCodReo, P06TG4_A130BarCodPar, P06TG4_A758ProCod, P06TG4_A761ProFasLin, P06TG4_n761ProFasLin, P06TG4_A4628ProDsc2
            }
            , new Object[] {
            P06TG5_A457FasCod, P06TG5_A396EmprCod, P06TG5_A129BarCod, P06TG5_A132BarCodReo, P06TG5_A130BarCodPar, P06TG5_A758ProCod, P06TG5_A153BarFasEst, P06TG5_A460FasDsc, P06TG5_A194BarOrdLin
            }
            , new Object[] {
            P06TG6_A44AlbRecCod, P06TG6_A4295ClasCod, P06TG6_n4295ClasCod, P06TG6_A396EmprCod, P06TG6_A129BarCod, P06TG6_A132BarCodReo, P06TG6_A130BarCodPar, P06TG6_A200BarPieCod, P06TG6_A4296ClasDsc, P06TG6_n4296ClasDsc
            }
            , new Object[] {
            P06TG8_A396EmprCod, P06TG8_A129BarCod, P06TG8_A132BarCodReo, P06TG8_A130BarCodPar, P06TG8_A4314BarFasBot1, P06TG8_n4314BarFasBot1, P06TG8_A758ProCod, P06TG8_A4315BarNumBot1, P06TG8_n4315BarNumBot1, P06TG8_A4648BarFasRecu,
            P06TG8_n4648BarFasRecu, P06TG8_A135BarColNom, P06TG8_A150BarFacTin, P06TG8_A1234BarNomCli, P06TG8_A148BarEstReo, P06TG8_A252CliCod, P06TG8_n252CliCod, P06TG8_A279CliNom, P06TG8_A4609BarMdlCod, P06TG8_A212BarSer,
            P06TG8_A1652BarSerDsc, P06TG8_A159BarFecGen, P06TG8_A4613BarHorReg, P06TG8_n4613BarHorReg, P06TG8_A603MaqCodBis, P06TG8_A4645BarFasKgs, P06TG8_n4645BarFasKgs, P06TG8_A4644BarFasNPrd, P06TG8_n4644BarFasNPrd, P06TG8_A457FasCod,
            P06TG8_A4287BarFasFor, P06TG8_A194BarOrdLin, P06TG8_A4643BarFasLot, P06TG8_A166BarKgm, P06TG8_A199BarPie1, P06TG8_A365DisDes, P06TG8_A898BarPieNDes
            }
            , new Object[] {
            P06TG10_A396EmprCod, P06TG10_A2804RecLinMaq, P06TG10_A130BarCodPar, P06TG10_A132BarCodReo, P06TG10_A129BarCod, P06TG10_A4268RecOrdLin, P06TG10_n4268RecOrdLin, P06TG10_A4654RecNroPar, P06TG10_n4654RecNroPar, P06TG10_A4258RecMaqFas,
            P06TG10_n4258RecMaqFas, P06TG10_A602MaqCod, P06TG10_A4402RecUsrCod, P06TG10_A4866RecFecAlt, P06TG10_n4866RecFecAlt, P06TG10_A606MaqDsc, P06TG10_n606MaqDsc, P06TG10_A148BarEstReo, P06TG10_A4273RecFagPrd, P06TG10_A4261RecTotPrd,
            P06TG10_n4261RecTotPrd, P06TG10_A4271RecFagKgs, P06TG10_A4259RecTotKgs
            }
            , new Object[] {
            P06TG11_A396EmprCod, P06TG11_A129BarCod, P06TG11_A132BarCodReo, P06TG11_A130BarCodPar, P06TG11_A2804RecLinMaq, P06TG11_A4695RecVolPrf, P06TG11_A1273RecLinPro, P06TG11_A4696RecTiempo, P06TG11_n4696RecTiempo, P06TG11_A4697RecNroPrg,
            P06TG11_A764ProForCod, P06TG11_A766ProForDsc, P06TG11_A5523ProForTip
            }
            , new Object[] {
            P06TG12_A719PrdNum, P06TG12_n719PrdNum, P06TG12_A396EmprCod, P06TG12_A129BarCod, P06TG12_A132BarCodReo, P06TG12_A130BarCodPar, P06TG12_A2804RecLinMaq, P06TG12_A1273RecLinPro, P06TG12_A872RecPrdNum, P06TG12_A490ForPrdUMe,
            P06TG12_n490ForPrdUMe, P06TG12_A431FacCon, P06TG12_A743PrdUniCon, P06TG12_A686PrdCant, P06TG12_A5422RecSalMP, P06TG12_A5467RecSalVol, P06TG12_A2394RecForNro, P06TG12_A875RecPrdDsc, P06TG12_A707PrdFacCon, P06TG12_A724PrdPreAct,
            P06TG12_A811RecLin
            }
            , new Object[] {
            P06TG13_A833TipDefCod, P06TG13_n833TipDefCod, P06TG13_A396EmprCod, P06TG13_A4667HisLavCon, P06TG13_A4665HisLavOrd, P06TG13_A4664HisLavNpd, P06TG13_A4663HisLavPar, P06TG13_A4662HisLavReo, P06TG13_A4661HisLavCod, P06TG13_A834TipDefDsc,
            P06TG13_n834TipDefDsc
            }
            , new Object[] {
            P06TG14_A396EmprCod, P06TG14_A5061Hl_hdrp, P06TG14_A5060Hl_hdrr, P06TG14_A5059Hl_hdr, P06TG14_A5067Hl_hdr_o, P06TG14_A5068Hl_hdrr_o, P06TG14_A5069Hl_hdrp_o, P06TG14_A5073Hl_pzs_r, P06TG14_n5073Hl_pzs_r, P06TG14_A5072Hl_kgs_r,
            P06TG14_n5072Hl_kgs_r
            }
            , new Object[] {
            P06TG15_A396EmprCod, P06TG15_A4643BarFasLot, P06TG15_A194BarOrdLin, P06TG15_A758ProCod, P06TG15_A130BarCodPar, P06TG15_A132BarCodReo, P06TG15_A129BarCod, P06TG15_A5954Ap_Barcod, P06TG15_A5955Ap_BarReo, P06TG15_A5956Ap_BarPar,
            P06TG15_A5960Ap_Piezas, P06TG15_n5960Ap_Piezas, P06TG15_A5959Ap_Kilos, P06TG15_n5959Ap_Kilos, P06TG15_A5957Ap_ProCod, P06TG15_A5958Ap_BarOrd
            }
            , new Object[] {
            P06TG16_A194BarOrdLin, P06TG16_A758ProCod, P06TG16_A130BarCodPar, P06TG16_A132BarCodReo, P06TG16_A129BarCod, P06TG16_A396EmprCod, P06TG16_A4940A_Barcod, P06TG16_A4941A_BarReo, P06TG16_A4942A_BarPar, P06TG16_A4947A_Piezas,
            P06TG16_n4947A_Piezas, P06TG16_A4946A_Kilos, P06TG16_n4946A_Kilos, P06TG16_A4943A_ProCod, P06TG16_A4944A_BarOrd
            }
            , new Object[] {
            P06TG17_A396EmprCod, P06TG17_A831TipColCod, P06TG17_A483ForColNum, P06TG17_A482ForColNom, P06TG17_A494ForSer, P06TG17_A252CliCod, P06TG17_A649ObsForTxt, P06TG17_A650ObsLin
            }
            , new Object[] {
            P06TG18_A396EmprCod, P06TG18_A602MaqCod, P06TG18_A5949MaqDosifP, P06TG18_n5949MaqDosifP
            }
            , new Object[] {
            P06TG19_A5085CodCausa, P06TG19_n5085CodCausa, P06TG19_A396EmprCod, P06TG19_A5061Hl_hdrp, P06TG19_A5060Hl_hdrr, P06TG19_A5059Hl_hdr, P06TG19_A5086DscCausa, P06TG19_n5086DscCausa
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV29FlagImp ;
   private byte AV115Ibatex ;
   private byte GXt_int2 ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte AV45BarCodReo ;
   private byte AV80BarTipCol ;
   private byte GXv_int1[] ;
   private byte AV77ForCon ;
   private byte GXv_int8[] ;
   private byte AV78F_okcolor ;
   private byte AV100i ;
   private byte AV102F_obs ;
   private byte A376DisObsLin ;
   private byte A153BarFasEst ;
   private byte AV52LenVar ;
   private byte AV75C_cab_p ;
   private byte AV113Ctrl_m ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private byte A2394RecForNro ;
   private byte A4662HisLavReo ;
   private byte AV88F_vez ;
   private byte A5060Hl_hdrr ;
   private byte A5068Hl_hdrr_o ;
   private byte A5955Ap_BarReo ;
   private byte A4941A_BarReo ;
   private byte GXv_int9[] ;
   private byte A831TipColCod ;
   private short A833TipDefCod ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A4295ClasCod ;
   private short A4644BarFasNPrd ;
   private short A199BarPie1 ;
   private short GXv_int11[] ;
   private short AV67BarOrdLin ;
   private short AV43RecOrdLin ;
   private short AV95Npda_3 ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV97Nactx_3 ;
   private short A4696RecTiempo ;
   private short AV14ProForTie ;
   private short AV16vRb ;
   private short A5422RecSalMP ;
   private short A811RecLin ;
   private short A4665HisLavOrd ;
   private short AV106i_obs ;
   private short A5073Hl_pzs_r ;
   private short A5960Ap_Piezas ;
   private short A5958Ap_BarOrd ;
   private short A4947A_Piezas ;
   private short A4944A_BarOrd ;
   private short A650ObsLin ;
   private short A5085CodCausa ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV66BarFasLot ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV44BarCod ;
   private int AV33CliCod ;
   private int AV94DisCod ;
   private int AV79barColNum ;
   private int GX_I ;
   private int A44AlbRecCod ;
   private int AV13Last_NumPd ;
   private int A4315BarNumBot1 ;
   private int A4648BarFasRecu ;
   private int A4643BarFasLot ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV64Total_pdas ;
   private int Gx_OldLine ;
   private int AV93Num_remon ;
   private int AV65BarFasRecu ;
   private int AV40BarPie ;
   private int AV42RecNroPar ;
   private int AV23RecMaqPrd ;
   private int A4654RecNroPar ;
   private int A4273RecFagPrd ;
   private int A4261RecTotPrd ;
   private int A4318RecMaqPrd ;
   private int A4695RecVolPrf ;
   private int A4697RecNroPrg ;
   private int AV15ProNumPro ;
   private int A5467RecSalVol ;
   private int A4667HisLavCon ;
   private int A4664HisLavNpd ;
   private int A4661HisLavCod ;
   private int A5059Hl_hdr ;
   private int A5067Hl_hdr_o ;
   private int AV92CliCod_a ;
   private int AV103DisCod_a ;
   private int A5954Ap_Barcod ;
   private int A4940A_Barcod ;
   private int GXv_int14[] ;
   private int GXv_int13[] ;
   private int GXv_int7[] ;
   private int GXv_int4[] ;
   private int A483ForColNum ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV39BarKgm ;
   private java.math.BigDecimal AV17RecMaqKgs ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV122Quant_aux ;
   private java.math.BigDecimal AV27Cantidad ;
   private java.math.BigDecimal AV30Coste ;
   private java.math.BigDecimal A5072Hl_kgs_r ;
   private java.math.BigDecimal A5959Ap_Kilos ;
   private java.math.BigDecimal A4946A_Kilos ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV58Grupo_l ;
   private String Gx_out ;
   private String AV69DisObstxt ;
   private String scmdbuf ;
   private String A2010BarTipDis ;
   private String A3030BarPlf ;
   private String A212BarSer ;
   private String A177BarLar ;
   private String A182BarMat ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A4465BarAcaBak ;
   private String A834TipDefDsc ;
   private String AV46BarCodPar ;
   private String AV114BarTipDis ;
   private String AV109Muestras ;
   private String AV37BarSer ;
   private String AV121BarLar ;
   private String AV120Barmat ;
   private String AV119Barenccli ;
   private String AV118BarDisNum ;
   private String AV74BarColNom ;
   private String AV111Texto_c ;
   private String AV110INTDSCF ;
   private String AV11TipDefDsc ;
   private String AV68v_Texto ;
   private String AV101Tab_obs[] ;
   private String A377DisObsTxt ;
   private String AV70ProDsc2 ;
   private String A758ProCod ;
   private String A4628ProDsc2 ;
   private String AV71Fases_l ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV99Tipo_pzas ;
   private String A200BarPieCod ;
   private String A4296ClasDsc ;
   private String A4314BarFasBot1 ;
   private String A150BarFacTin ;
   private String A1234BarNomCli ;
   private String A279CliNom ;
   private String A4609BarMdlCod ;
   private String A1652BarSerDsc ;
   private String A603MaqCodBis ;
   private String A4287BarFasFor ;
   private String A365DisDes ;
   private String AV87ProCod ;
   private String AV81BarFacTin ;
   private String AV82BarNomCli ;
   private String AV8Hdr ;
   private String AV63EmprCod ;
   private String AV34CliNom ;
   private String AV35BarMdlCod ;
   private String AV38BarSerDsc ;
   private String AV47MaqCod ;
   private String AV48MaqDsc ;
   private String AV18FasCod ;
   private String AV22FasDsc ;
   private String AV55Ceros8 ;
   private String AV50BarCod_a ;
   private String AV96Npda_a3 ;
   private String AV56Orden_a ;
   private String AV51Reo_a ;
   private String AV9HdrPart ;
   private String AV10HdrPda ;
   private String AV116Hdrcdb ;
   private String AV41FasCod_cb ;
   private String AV57FasCod_cb2 ;
   private String AV117dsccausa ;
   private String A4258RecMaqFas ;
   private String A602MaqCod ;
   private String A4402RecUsrCod ;
   private String A606MaqDsc ;
   private String AV98Nactx_3a ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A5523ProForTip ;
   private String AV19ProForCod ;
   private String A719PrdNum ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String AV108PrdNumi ;
   private String AV112Maqdosifp ;
   private String AV31var2 ;
   private String AV28Unidades ;
   private String AV123Msg_aux ;
   private String AV25Var1 ;
   private String AV84Cant_Unid ;
   private String AV85RecSalmp ;
   private String AV86RecSalVol ;
   private String AV26RecForNro ;
   private String AV24PrdDsc ;
   private String AV32CodPrd ;
   private String AV104ProForTip ;
   private String A4663HisLavPar ;
   private String AV76Msg_r ;
   private String AV105Tab_obsf[] ;
   private String AV107ObsForTxt ;
   private String A5061Hl_hdrp ;
   private String A5069Hl_hdrp_o ;
   private String AV89CliNom_a ;
   private String AV90BarSer_a ;
   private String AV91ColNom_a ;
   private String A5956Ap_BarPar ;
   private String A5957Ap_ProCod ;
   private String A4942A_BarPar ;
   private String A4943A_ProCod ;
   private String GXv_char12[] ;
   private String GXv_char10[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A649ObsForTxt ;
   private String A5949MaqDosifP ;
   private String A5086DscCausa ;
   private String AV36BarTam ;
   private java.util.Date A4613BarHorReg ;
   private java.util.Date AV73BarHorReg ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV72BarFecGen ;
   private boolean n833TipDefCod ;
   private boolean n252CliCod ;
   private boolean n4465BarAcaBak ;
   private boolean n834TipDefDsc ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n4314BarFasBot1 ;
   private boolean n4315BarNumBot1 ;
   private boolean n4648BarFasRecu ;
   private boolean n4613BarHorReg ;
   private boolean n4645BarFasKgs ;
   private boolean n4644BarFasNPrd ;
   private boolean n4268RecOrdLin ;
   private boolean n4654RecNroPar ;
   private boolean n4258RecMaqFas ;
   private boolean n4866RecFecAlt ;
   private boolean n606MaqDsc ;
   private boolean n4261RecTotPrd ;
   private boolean n4696RecTiempo ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n5073Hl_pzs_r ;
   private boolean n5072Hl_kgs_r ;
   private boolean n5960Ap_Piezas ;
   private boolean n5959Ap_Kilos ;
   private boolean n4947A_Piezas ;
   private boolean n4946A_Kilos ;
   private boolean n5949MaqDosifP ;
   private boolean n5085CodCausa ;
   private boolean n5086DscCausa ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P06TG2_A833TipDefCod ;
   private boolean[] P06TG2_n833TipDefCod ;
   private String[] P06TG2_A396EmprCod ;
   private int[] P06TG2_A129BarCod ;
   private byte[] P06TG2_A132BarCodReo ;
   private String[] P06TG2_A130BarCodPar ;
   private int[] P06TG2_A361DisCod ;
   private String[] P06TG2_A2010BarTipDis ;
   private String[] P06TG2_A3030BarPlf ;
   private int[] P06TG2_A252CliCod ;
   private boolean[] P06TG2_n252CliCod ;
   private String[] P06TG2_A212BarSer ;
   private String[] P06TG2_A177BarLar ;
   private String[] P06TG2_A182BarMat ;
   private String[] P06TG2_A4812BarEncCli ;
   private String[] P06TG2_A143BarDisNum ;
   private String[] P06TG2_A135BarColNom ;
   private int[] P06TG2_A136BarColNum ;
   private byte[] P06TG2_A218BarTipCol ;
   private String[] P06TG2_A4465BarAcaBak ;
   private boolean[] P06TG2_n4465BarAcaBak ;
   private byte[] P06TG2_A148BarEstReo ;
   private String[] P06TG2_A834TipDefDsc ;
   private boolean[] P06TG2_n834TipDefDsc ;
   private String[] P06TG3_A396EmprCod ;
   private int[] P06TG3_A361DisCod ;
   private String[] P06TG3_A377DisObsTxt ;
   private byte[] P06TG3_A376DisObsLin ;
   private String[] P06TG4_A396EmprCod ;
   private int[] P06TG4_A129BarCod ;
   private byte[] P06TG4_A132BarCodReo ;
   private String[] P06TG4_A130BarCodPar ;
   private String[] P06TG4_A758ProCod ;
   private short[] P06TG4_A761ProFasLin ;
   private boolean[] P06TG4_n761ProFasLin ;
   private String[] P06TG4_A4628ProDsc2 ;
   private String[] P06TG5_A457FasCod ;
   private String[] P06TG5_A396EmprCod ;
   private int[] P06TG5_A129BarCod ;
   private byte[] P06TG5_A132BarCodReo ;
   private String[] P06TG5_A130BarCodPar ;
   private String[] P06TG5_A758ProCod ;
   private byte[] P06TG5_A153BarFasEst ;
   private String[] P06TG5_A460FasDsc ;
   private short[] P06TG5_A194BarOrdLin ;
   private int[] P06TG6_A44AlbRecCod ;
   private short[] P06TG6_A4295ClasCod ;
   private boolean[] P06TG6_n4295ClasCod ;
   private String[] P06TG6_A396EmprCod ;
   private int[] P06TG6_A129BarCod ;
   private byte[] P06TG6_A132BarCodReo ;
   private String[] P06TG6_A130BarCodPar ;
   private String[] P06TG6_A200BarPieCod ;
   private String[] P06TG6_A4296ClasDsc ;
   private boolean[] P06TG6_n4296ClasDsc ;
   private String[] P06TG8_A396EmprCod ;
   private int[] P06TG8_A129BarCod ;
   private byte[] P06TG8_A132BarCodReo ;
   private String[] P06TG8_A130BarCodPar ;
   private String[] P06TG8_A4314BarFasBot1 ;
   private boolean[] P06TG8_n4314BarFasBot1 ;
   private String[] P06TG8_A758ProCod ;
   private int[] P06TG8_A4315BarNumBot1 ;
   private boolean[] P06TG8_n4315BarNumBot1 ;
   private int[] P06TG8_A4648BarFasRecu ;
   private boolean[] P06TG8_n4648BarFasRecu ;
   private String[] P06TG8_A135BarColNom ;
   private String[] P06TG8_A150BarFacTin ;
   private String[] P06TG8_A1234BarNomCli ;
   private byte[] P06TG8_A148BarEstReo ;
   private int[] P06TG8_A252CliCod ;
   private boolean[] P06TG8_n252CliCod ;
   private String[] P06TG8_A279CliNom ;
   private String[] P06TG8_A4609BarMdlCod ;
   private String[] P06TG8_A212BarSer ;
   private String[] P06TG8_A1652BarSerDsc ;
   private java.util.Date[] P06TG8_A159BarFecGen ;
   private java.util.Date[] P06TG8_A4613BarHorReg ;
   private boolean[] P06TG8_n4613BarHorReg ;
   private String[] P06TG8_A603MaqCodBis ;
   private java.math.BigDecimal[] P06TG8_A4645BarFasKgs ;
   private boolean[] P06TG8_n4645BarFasKgs ;
   private short[] P06TG8_A4644BarFasNPrd ;
   private boolean[] P06TG8_n4644BarFasNPrd ;
   private String[] P06TG8_A457FasCod ;
   private String[] P06TG8_A4287BarFasFor ;
   private short[] P06TG8_A194BarOrdLin ;
   private int[] P06TG8_A4643BarFasLot ;
   private java.math.BigDecimal[] P06TG8_A166BarKgm ;
   private short[] P06TG8_A199BarPie1 ;
   private String[] P06TG8_A365DisDes ;
   private int[] P06TG8_A898BarPieNDes ;
   private String[] P06TG10_A396EmprCod ;
   private short[] P06TG10_A2804RecLinMaq ;
   private String[] P06TG10_A130BarCodPar ;
   private byte[] P06TG10_A132BarCodReo ;
   private int[] P06TG10_A129BarCod ;
   private short[] P06TG10_A4268RecOrdLin ;
   private boolean[] P06TG10_n4268RecOrdLin ;
   private int[] P06TG10_A4654RecNroPar ;
   private boolean[] P06TG10_n4654RecNroPar ;
   private String[] P06TG10_A4258RecMaqFas ;
   private boolean[] P06TG10_n4258RecMaqFas ;
   private String[] P06TG10_A602MaqCod ;
   private String[] P06TG10_A4402RecUsrCod ;
   private java.util.Date[] P06TG10_A4866RecFecAlt ;
   private boolean[] P06TG10_n4866RecFecAlt ;
   private String[] P06TG10_A606MaqDsc ;
   private boolean[] P06TG10_n606MaqDsc ;
   private byte[] P06TG10_A148BarEstReo ;
   private int[] P06TG10_A4273RecFagPrd ;
   private int[] P06TG10_A4261RecTotPrd ;
   private boolean[] P06TG10_n4261RecTotPrd ;
   private java.math.BigDecimal[] P06TG10_A4271RecFagKgs ;
   private java.math.BigDecimal[] P06TG10_A4259RecTotKgs ;
   private String[] P06TG11_A396EmprCod ;
   private int[] P06TG11_A129BarCod ;
   private byte[] P06TG11_A132BarCodReo ;
   private String[] P06TG11_A130BarCodPar ;
   private short[] P06TG11_A2804RecLinMaq ;
   private int[] P06TG11_A4695RecVolPrf ;
   private byte[] P06TG11_A1273RecLinPro ;
   private short[] P06TG11_A4696RecTiempo ;
   private boolean[] P06TG11_n4696RecTiempo ;
   private int[] P06TG11_A4697RecNroPrg ;
   private String[] P06TG11_A764ProForCod ;
   private String[] P06TG11_A766ProForDsc ;
   private String[] P06TG11_A5523ProForTip ;
   private String[] P06TG12_A719PrdNum ;
   private boolean[] P06TG12_n719PrdNum ;
   private String[] P06TG12_A396EmprCod ;
   private int[] P06TG12_A129BarCod ;
   private byte[] P06TG12_A132BarCodReo ;
   private String[] P06TG12_A130BarCodPar ;
   private short[] P06TG12_A2804RecLinMaq ;
   private byte[] P06TG12_A1273RecLinPro ;
   private String[] P06TG12_A872RecPrdNum ;
   private byte[] P06TG12_A490ForPrdUMe ;
   private boolean[] P06TG12_n490ForPrdUMe ;
   private java.math.BigDecimal[] P06TG12_A431FacCon ;
   private byte[] P06TG12_A743PrdUniCon ;
   private java.math.BigDecimal[] P06TG12_A686PrdCant ;
   private short[] P06TG12_A5422RecSalMP ;
   private int[] P06TG12_A5467RecSalVol ;
   private byte[] P06TG12_A2394RecForNro ;
   private String[] P06TG12_A875RecPrdDsc ;
   private java.math.BigDecimal[] P06TG12_A707PrdFacCon ;
   private java.math.BigDecimal[] P06TG12_A724PrdPreAct ;
   private short[] P06TG12_A811RecLin ;
   private short[] P06TG13_A833TipDefCod ;
   private boolean[] P06TG13_n833TipDefCod ;
   private String[] P06TG13_A396EmprCod ;
   private int[] P06TG13_A4667HisLavCon ;
   private short[] P06TG13_A4665HisLavOrd ;
   private int[] P06TG13_A4664HisLavNpd ;
   private String[] P06TG13_A4663HisLavPar ;
   private byte[] P06TG13_A4662HisLavReo ;
   private int[] P06TG13_A4661HisLavCod ;
   private String[] P06TG13_A834TipDefDsc ;
   private boolean[] P06TG13_n834TipDefDsc ;
   private String[] P06TG14_A396EmprCod ;
   private String[] P06TG14_A5061Hl_hdrp ;
   private byte[] P06TG14_A5060Hl_hdrr ;
   private int[] P06TG14_A5059Hl_hdr ;
   private int[] P06TG14_A5067Hl_hdr_o ;
   private byte[] P06TG14_A5068Hl_hdrr_o ;
   private String[] P06TG14_A5069Hl_hdrp_o ;
   private short[] P06TG14_A5073Hl_pzs_r ;
   private boolean[] P06TG14_n5073Hl_pzs_r ;
   private java.math.BigDecimal[] P06TG14_A5072Hl_kgs_r ;
   private boolean[] P06TG14_n5072Hl_kgs_r ;
   private String[] P06TG15_A396EmprCod ;
   private int[] P06TG15_A4643BarFasLot ;
   private short[] P06TG15_A194BarOrdLin ;
   private String[] P06TG15_A758ProCod ;
   private String[] P06TG15_A130BarCodPar ;
   private byte[] P06TG15_A132BarCodReo ;
   private int[] P06TG15_A129BarCod ;
   private int[] P06TG15_A5954Ap_Barcod ;
   private byte[] P06TG15_A5955Ap_BarReo ;
   private String[] P06TG15_A5956Ap_BarPar ;
   private short[] P06TG15_A5960Ap_Piezas ;
   private boolean[] P06TG15_n5960Ap_Piezas ;
   private java.math.BigDecimal[] P06TG15_A5959Ap_Kilos ;
   private boolean[] P06TG15_n5959Ap_Kilos ;
   private String[] P06TG15_A5957Ap_ProCod ;
   private short[] P06TG15_A5958Ap_BarOrd ;
   private short[] P06TG16_A194BarOrdLin ;
   private String[] P06TG16_A758ProCod ;
   private String[] P06TG16_A130BarCodPar ;
   private byte[] P06TG16_A132BarCodReo ;
   private int[] P06TG16_A129BarCod ;
   private String[] P06TG16_A396EmprCod ;
   private int[] P06TG16_A4940A_Barcod ;
   private byte[] P06TG16_A4941A_BarReo ;
   private String[] P06TG16_A4942A_BarPar ;
   private short[] P06TG16_A4947A_Piezas ;
   private boolean[] P06TG16_n4947A_Piezas ;
   private java.math.BigDecimal[] P06TG16_A4946A_Kilos ;
   private boolean[] P06TG16_n4946A_Kilos ;
   private String[] P06TG16_A4943A_ProCod ;
   private short[] P06TG16_A4944A_BarOrd ;
   private String[] P06TG17_A396EmprCod ;
   private byte[] P06TG17_A831TipColCod ;
   private int[] P06TG17_A483ForColNum ;
   private String[] P06TG17_A482ForColNom ;
   private String[] P06TG17_A494ForSer ;
   private int[] P06TG17_A252CliCod ;
   private boolean[] P06TG17_n252CliCod ;
   private String[] P06TG17_A649ObsForTxt ;
   private short[] P06TG17_A650ObsLin ;
   private String[] P06TG18_A396EmprCod ;
   private String[] P06TG18_A602MaqCod ;
   private String[] P06TG18_A5949MaqDosifP ;
   private boolean[] P06TG18_n5949MaqDosifP ;
   private short[] P06TG19_A5085CodCausa ;
   private boolean[] P06TG19_n5085CodCausa ;
   private String[] P06TG19_A396EmprCod ;
   private String[] P06TG19_A5061Hl_hdrp ;
   private byte[] P06TG19_A5060Hl_hdrr ;
   private int[] P06TG19_A5059Hl_hdr ;
   private String[] P06TG19_A5086DscCausa ;
   private boolean[] P06TG19_n5086DscCausa ;
}

final  class rreclv7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06TG2", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarTipDis, T1.BarPlf, T1.CliCod, T1.BarSer, T1.BarLar, T1.BarMat, T1.BarEncCli, T1.BarDisNum, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarAcaBak, T1.BarEstReo, T2.TipDefDsc FROM (TXPBARCAD T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06TG3", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG4", "SELECT * FROM (SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.ProFasLin, T2.ProDsc2 FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06TG5", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarFasEst, T2.FasDsc, T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG6", "SELECT T1.AlbRecCod, T2.ClasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T3.ClasDsc FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG8", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasBot1, T1.ProCod, T1.BarNumBot1, T1.BarFasRecu, T2.BarColNom, T4.BarFacTin, T2.BarNomCli, T2.BarEstReo, T2.CliCod, T3.CliNom, T2.BarMdlCod, T2.BarSer, T2.BarSerDsc, T2.BarFecGen, T2.BarHorReg, T4.MaqCodBis, T1.BarFasKgs, T1.BarFasNPrd, T4.FasCod, T4.BarFasFor, T1.BarOrdLin, T1.BarFasLot, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes FROM ((((TXPFASMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPBARFAS T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.ProCod = T1.ProCod AND T4.BarOrdLin = T1.BarOrdLin) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarFasBot1 = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasLot, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG10", "SELECT T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecOrdLin, T1.RecNroPar, T1.RecMaqFas, T1.MaqCod, T1.RecUsrCod, T1.RecFecAlt, T2.MaqDsc, T3.BarEstReo, COALESCE( T4.RecFagPrd, 0) AS RecFagPrd, T1.RecTotPrd, COALESCE( T4.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs FROM (((TXPRECMAQ T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(RecAgrKgs) AS RecFagKgs, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, SUM(RecAgrPrd) AS RecFagPrd FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.RecNroPar = ?) AND (T1.RecOrdLin = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG11", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecVolPrf, T1.RecLinPro, T1.RecTiempo, T1.RecNroPrg, T1.ProForCod, T2.ProForDsc, T2.ProForTip FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG12", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecPrdNum, T1.ForPrdUMe, T1.FacCon, T2.PrdUniCon, T1.PrdCant, T1.RecSalMP, T1.RecSalVol, T1.RecForNro, T1.RecPrdDsc, T2.PrdFacCon, T2.PrdPreAct, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG13", "SELECT T1.TipDefCod, T1.EmprCod, T1.HisLavCon, T1.HisLavOrd, T1.HisLavNpd, T1.HisLavPar, T1.HisLavReo, T1.HisLavCod, T2.TipDefDsc FROM (TXPHISRE1 T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.HisLavCod = ? and T1.HisLavReo = ? and T1.HisLavPar = ? and T1.HisLavNpd = ? and T1.HisLavOrd = ? and T1.HisLavCon = ? ORDER BY T1.EmprCod, T1.HisLavCod, T1.HisLavReo, T1.HisLavPar, T1.HisLavNpd, T1.HisLavOrd, T1.HisLavCon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06TG14", "SELECT EmprCod, Hl_hdrp, Hl_hdrr, Hl_hdr, Hl_hdr_o, Hl_hdrr_o, Hl_hdrp_o, Hl_pzs_r, Hl_kgs_r FROM TXPHLREO1 WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ? ORDER BY EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG15", "SELECT EmprCod, BarFasLot, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_Piezas, Ap_Kilos, Ap_ProCod, Ap_BarOrd FROM TXPAGHDFP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG16", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, A_Barcod, A_BarReo, A_BarPar, A_Piezas, A_Kilos, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG17", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TG18", "SELECT EmprCod, MaqCod, MaqDosifP FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06TG19", "SELECT T1.CodCausa, T1.EmprCod, T1.Hl_hdrp, T1.Hl_hdrr, T1.Hl_hdr, T2.DscCausa FROM (TXPHLREOP T1 LEFT JOIN TXPTIPCAU T2 ON T2.EmprCod = T1.EmprCod AND T2.CodCausa = T1.CodCausa) WHERE T1.EmprCod = ? and T1.Hl_hdr = ? and T1.Hl_hdrr = ? and T1.Hl_hdrp = ? ORDER BY T1.EmprCod, T1.Hl_hdr, T1.Hl_hdrr, T1.Hl_hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((String[]) buf[12])[0] = rslt.getString(11, 10);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((String[]) buf[15])[0] = rslt.getString(14, 8);
               ((String[]) buf[16])[0] = rslt.getString(15, 13);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 100);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((String[]) buf[13])[0] = rslt.getString(11, 13);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((String[]) buf[18])[0] = rslt.getString(15, 13);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((String[]) buf[20])[0] = rslt.getString(17, 26);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(18);
               ((java.util.Date[]) buf[22])[0] = GXutil.resetDate(rslt.getGXDateTime(19));
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(20, 6);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(22);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(23, 8);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
               ((short[]) buf[31])[0] = rslt.getShort(25);
               ((int[]) buf[32])[0] = rslt.getInt(26);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(27,2);
               ((short[]) buf[34])[0] = rslt.getShort(28);
               ((String[]) buf[35])[0] = rslt.getString(29, 1);
               ((int[]) buf[36])[0] = rslt.getInt(30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((String[]) buf[12])[0] = rslt.getString(10, 8);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,4);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,5);
               ((short[]) buf[20])[0] = rslt.getShort(19);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 8);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

