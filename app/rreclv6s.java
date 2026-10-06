package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rreclv6s extends GXReport
{
   public rreclv6s( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rreclv6s.class ), "" );
   }

   public rreclv6s( int remoteHandle ,
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
      rreclv6s.this.aP5 = new String[] {""};
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
      rreclv6s.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rreclv6s.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rreclv6s.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rreclv6s.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rreclv6s.this.AV58Grupo_l = aP4[0];
      this.aP4 = aP4;
      rreclv6s.this.Gx_out = aP5[0];
      this.aP5 = aP5;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Formula General") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV29FlagImp ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100000", GXv_int1) ;
         rreclv6s.this.AV29FlagImp = GXv_int1[0] ;
         GXt_int2 = AV120Ibatex ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IBATEX", ""), GXv_int1) ;
         rreclv6s.this.GXt_int2 = GXv_int1[0] ;
         AV120Ibatex = GXt_int2 ;
         GXt_int2 = AV151Pack ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PACK", ""), GXv_int1) ;
         rreclv6s.this.GXt_int2 = GXv_int1[0] ;
         AV151Pack = GXt_int2 ;
         GXt_int2 = AV155Eliot ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOTL", ""), GXv_int1) ;
         rreclv6s.this.GXt_int2 = GXv_int1[0] ;
         AV155Eliot = GXt_int2 ;
         GXt_char3 = AV153Lit10 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ENCLAV03", ""), (byte)(99), GXv_char4) ;
         rreclv6s.this.GXt_char3 = GXv_char4[0] ;
         AV153Lit10 = GXt_char3 ;
         AV150Station = context.getWorkstationId( remoteHandle) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char5[0] = AV149Emprnom ;
         GXv_char6[0] = AV148usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV150Station, GXv_char4, GXv_char5, GXv_char6) ;
         rreclv6s.this.A396EmprCod = GXv_char4[0] ;
         rreclv6s.this.AV149Emprnom = GXv_char5[0] ;
         rreclv6s.this.AV148usurcod = GXv_char6[0] ;
         AV69DisObstxt = GXutil.space( (short)(60)) ;
         /* Using cursor P078C2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A833TipDefCod = P078C2_A833TipDefCod[0] ;
            n833TipDefCod = P078C2_n833TipDefCod[0] ;
            A361DisCod = P078C2_A361DisCod[0] ;
            A2010BarTipDis = P078C2_A2010BarTipDis[0] ;
            A4465BarAcaBak = P078C2_A4465BarAcaBak[0] ;
            n4465BarAcaBak = P078C2_n4465BarAcaBak[0] ;
            A3030BarPlf = P078C2_A3030BarPlf[0] ;
            A2454BarGirar = P078C2_A2454BarGirar[0] ;
            A148BarEstReo = P078C2_A148BarEstReo[0] ;
            A834TipDefDsc = P078C2_A834TipDefDsc[0] ;
            n834TipDefDsc = P078C2_n834TipDefDsc[0] ;
            A252CliCod = P078C2_A252CliCod[0] ;
            n252CliCod = P078C2_n252CliCod[0] ;
            A212BarSer = P078C2_A212BarSer[0] ;
            A177BarLar = P078C2_A177BarLar[0] ;
            A182BarMat = P078C2_A182BarMat[0] ;
            A4812BarEncCli = P078C2_A4812BarEncCli[0] ;
            A143BarDisNum = P078C2_A143BarDisNum[0] ;
            A135BarColNom = P078C2_A135BarColNom[0] ;
            A136BarColNum = P078C2_A136BarColNum[0] ;
            A218BarTipCol = P078C2_A218BarTipCol[0] ;
            A217BarTipArt = P078C2_A217BarTipArt[0] ;
            n217BarTipArt = P078C2_n217BarTipArt[0] ;
            A834TipDefDsc = P078C2_A834TipDefDsc[0] ;
            n834TipDefDsc = P078C2_n834TipDefDsc[0] ;
            AV44BarCod = A129BarCod ;
            AV45BarCodReo = A132BarCodReo ;
            AV46BarCodPar = A130BarCodPar ;
            AV119BarTipDis = A2010BarTipDis ;
            AV116Texto_c = "" ;
            if ( GXutil.strcmp(A4465BarAcaBak, httpContext.getMessage( "C", "")) == 0 )
            {
               AV116Texto_c = httpContext.getMessage( "QUALQUER COR", "") ;
            }
            AV106Tipo_pzas = "" ;
            AV113Muestras = "" ;
            if ( GXutil.strcmp(A3030BarPlf, httpContext.getMessage( "S", "")) == 0 )
            {
               AV113Muestras = A3030BarPlf ;
            }
            AV154BarGirar = A2454BarGirar ;
            /* Using cursor P078C3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A44AlbRecCod = P078C3_A44AlbRecCod[0] ;
               A4295ClasCod = P078C3_A4295ClasCod[0] ;
               n4295ClasCod = P078C3_n4295ClasCod[0] ;
               A200BarPieCod = P078C3_A200BarPieCod[0] ;
               A4296ClasDsc = P078C3_A4296ClasDsc[0] ;
               n4296ClasDsc = P078C3_n4296ClasDsc[0] ;
               A50AlbRLoc = P078C3_A50AlbRLoc[0] ;
               A4295ClasCod = P078C3_A4295ClasCod[0] ;
               n4295ClasCod = P078C3_n4295ClasCod[0] ;
               A50AlbRLoc = P078C3_A50AlbRLoc[0] ;
               A4296ClasDsc = P078C3_A4296ClasDsc[0] ;
               n4296ClasDsc = P078C3_n4296ClasDsc[0] ;
               if ( (GXutil.strcmp("", AV106Tipo_pzas)==0) )
               {
                  AV106Tipo_pzas = GXutil.trim( A4296ClasDsc) ;
               }
               else
               {
                  AV106Tipo_pzas = GXutil.concat( AV106Tipo_pzas, GXutil.trim( A4296ClasDsc), "-") ;
               }
               AV157AlbrLoc = A50AlbRLoc ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV123dsccausa = "" ;
            if ( A148BarEstReo == 1 )
            {
               /* Execute user subroutine: 'HLREOP' */
               S211 ();
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
               AV68v_Texto = httpContext.getMessage( "Reprocessado INTERNO", "") ;
            }
            if ( A148BarEstReo == 2 )
            {
               AV11TipDefDsc = A834TipDefDsc ;
               AV68v_Texto = httpContext.getMessage( "Reprocessado EXTERNO", "") ;
            }
            AV33CliCod = A252CliCod ;
            AV37BarSer = A212BarSer ;
            AV127BarLar = A177BarLar ;
            AV126Barmat = A182BarMat ;
            AV125Barenccli = A4812BarEncCli ;
            AV124BarDisNum = A143BarDisNum ;
            AV74BarColNom = A135BarColNom ;
            AV152Color = GXutil.trim( A135BarColNom) + " " + GXutil.trim( GXutil.str( A136BarColNum, 6, 0)) ;
            AV75BarColNum = A136BarColNum ;
            AV76BarTipCol = A218BarTipCol ;
            AV98DisCod = A361DisCod ;
            AV154BarGirar = A2454BarGirar ;
            GXt_char3 = AV156TipArtdsc ;
            GXv_char6[0] = GXt_char3 ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char6) ;
            rreclv6s.this.GXt_char3 = GXv_char6[0] ;
            AV156TipArtdsc = GXt_char3 ;
            /* Execute user subroutine: 'ARTICU' */
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
            GXv_char6[0] = A396EmprCod ;
            GXv_int7[0] = AV33CliCod ;
            GXv_char5[0] = AV37BarSer ;
            GXv_char4[0] = AV74BarColNom ;
            GXv_int8[0] = AV75BarColNum ;
            GXv_int1[0] = AV76BarTipCol ;
            GXv_int9[0] = AV77ForCon ;
            GXv_int10[0] = AV78F_okcolor ;
            GXv_char11[0] = AV115INTDSCF ;
            new app.pforcon(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5, GXv_char4, GXv_int8, GXv_int1, GXv_int9, GXv_int10, GXv_char11) ;
            rreclv6s.this.A396EmprCod = GXv_char6[0] ;
            rreclv6s.this.AV33CliCod = GXv_int7[0] ;
            rreclv6s.this.AV37BarSer = GXv_char5[0] ;
            rreclv6s.this.AV74BarColNom = GXv_char4[0] ;
            rreclv6s.this.AV75BarColNum = GXv_int8[0] ;
            rreclv6s.this.AV76BarTipCol = GXv_int1[0] ;
            rreclv6s.this.AV77ForCon = GXv_int9[0] ;
            rreclv6s.this.AV78F_okcolor = GXv_int10[0] ;
            rreclv6s.this.AV115INTDSCF = GXv_char11[0] ;
            AV105i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 9 )
            {
               AV104Tab_obs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV107F_obs = (byte)(0) ;
            /* Using cursor P078C4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A377DisObsTxt = P078C4_A377DisObsTxt[0] ;
               A376DisObsLin = P078C4_A376DisObsLin[0] ;
               AV104Tab_obs[AV105i-1] = A377DisObsTxt ;
               AV105i = (byte)(AV105i+1) ;
               AV107F_obs = (byte)(1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV70ProDsc2 = GXutil.space( (short)(80)) ;
            /* Using cursor P078C5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A758ProCod = P078C5_A758ProCod[0] ;
               A761ProFasLin = P078C5_A761ProFasLin[0] ;
               n761ProFasLin = P078C5_n761ProFasLin[0] ;
               A4628ProDsc2 = P078C5_A4628ProDsc2[0] ;
               A4628ProDsc2 = P078C5_A4628ProDsc2[0] ;
               AV70ProDsc2 = GXutil.substring( A4628ProDsc2, 1, 80) ;
               AV71Fases_l = GXutil.space( (short)(80)) ;
               /* Using cursor P078C6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A457FasCod = P078C6_A457FasCod[0] ;
                  A153BarFasEst = P078C6_A153BarFasEst[0] ;
                  A460FasDsc = P078C6_A460FasDsc[0] ;
                  A194BarOrdLin = P078C6_A194BarOrdLin[0] ;
                  A460FasDsc = P078C6_A460FasDsc[0] ;
                  if ( (GXutil.strcmp("", AV71Fases_l)==0) )
                  {
                     AV71Fases_l = GXutil.trim( A460FasDsc) ;
                  }
                  else
                  {
                     AV71Fases_l = GXutil.concat( AV71Fases_l, GXutil.trim( A460FasDsc), "-") ;
                  }
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV151Pack == 0 )
            {
               AV137Articulo_t = GXutil.trim( AV136Artnmtr) + GXutil.trim( AV37BarSer) ;
            }
            else
            {
               AV137Articulo_t = GXutil.trim( AV37BarSer) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV13Last_NumPd = 0 ;
         /* Using cursor P078C8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV58Grupo_l});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A4314BarFasBot1 = P078C8_A4314BarFasBot1[0] ;
            n4314BarFasBot1 = P078C8_n4314BarFasBot1[0] ;
            A457FasCod = P078C8_A457FasCod[0] ;
            A758ProCod = P078C8_A758ProCod[0] ;
            A7913BarfasUnpL = P078C8_A7913BarfasUnpL[0] ;
            n7913BarfasUnpL = P078C8_n7913BarfasUnpL[0] ;
            A6881FasUnpLt = P078C8_A6881FasUnpLt[0] ;
            n6881FasUnpLt = P078C8_n6881FasUnpLt[0] ;
            A4315BarNumBot1 = P078C8_A4315BarNumBot1[0] ;
            n4315BarNumBot1 = P078C8_n4315BarNumBot1[0] ;
            A4648BarFasRecu = P078C8_A4648BarFasRecu[0] ;
            n4648BarFasRecu = P078C8_n4648BarFasRecu[0] ;
            A135BarColNom = P078C8_A135BarColNom[0] ;
            A1234BarNomCli = P078C8_A1234BarNomCli[0] ;
            A162BarFecTeo = P078C8_A162BarFecTeo[0] ;
            A150BarFacTin = P078C8_A150BarFacTin[0] ;
            A148BarEstReo = P078C8_A148BarEstReo[0] ;
            A252CliCod = P078C8_A252CliCod[0] ;
            n252CliCod = P078C8_n252CliCod[0] ;
            A279CliNom = P078C8_A279CliNom[0] ;
            A4609BarMdlCod = P078C8_A4609BarMdlCod[0] ;
            A212BarSer = P078C8_A212BarSer[0] ;
            A1652BarSerDsc = P078C8_A1652BarSerDsc[0] ;
            A159BarFecGen = P078C8_A159BarFecGen[0] ;
            A4613BarHorReg = P078C8_A4613BarHorReg[0] ;
            n4613BarHorReg = P078C8_n4613BarHorReg[0] ;
            A603MaqCodBis = P078C8_A603MaqCodBis[0] ;
            A4302BarMaqFas1 = P078C8_A4302BarMaqFas1[0] ;
            n4302BarMaqFas1 = P078C8_n4302BarMaqFas1[0] ;
            A4645BarFasKgs = P078C8_A4645BarFasKgs[0] ;
            n4645BarFasKgs = P078C8_n4645BarFasKgs[0] ;
            A4644BarFasNPrd = P078C8_A4644BarFasNPrd[0] ;
            n4644BarFasNPrd = P078C8_n4644BarFasNPrd[0] ;
            A4287BarFasFor = P078C8_A4287BarFasFor[0] ;
            A194BarOrdLin = P078C8_A194BarOrdLin[0] ;
            A4643BarFasLot = P078C8_A4643BarFasLot[0] ;
            A166BarKgm = P078C8_A166BarKgm[0] ;
            A199BarPie1 = P078C8_A199BarPie1[0] ;
            A365DisDes = P078C8_A365DisDes[0] ;
            A898BarPieNDes = P078C8_A898BarPieNDes[0] ;
            A135BarColNom = P078C8_A135BarColNom[0] ;
            A1234BarNomCli = P078C8_A1234BarNomCli[0] ;
            A148BarEstReo = P078C8_A148BarEstReo[0] ;
            A252CliCod = P078C8_A252CliCod[0] ;
            n252CliCod = P078C8_n252CliCod[0] ;
            A4609BarMdlCod = P078C8_A4609BarMdlCod[0] ;
            A212BarSer = P078C8_A212BarSer[0] ;
            A1652BarSerDsc = P078C8_A1652BarSerDsc[0] ;
            A159BarFecGen = P078C8_A159BarFecGen[0] ;
            A4613BarHorReg = P078C8_A4613BarHorReg[0] ;
            n4613BarHorReg = P078C8_n4613BarHorReg[0] ;
            A365DisDes = P078C8_A365DisDes[0] ;
            A279CliNom = P078C8_A279CliNom[0] ;
            A457FasCod = P078C8_A457FasCod[0] ;
            A7913BarfasUnpL = P078C8_A7913BarfasUnpL[0] ;
            n7913BarfasUnpL = P078C8_n7913BarfasUnpL[0] ;
            A162BarFecTeo = P078C8_A162BarFecTeo[0] ;
            A150BarFacTin = P078C8_A150BarFacTin[0] ;
            A603MaqCodBis = P078C8_A603MaqCodBis[0] ;
            A4287BarFasFor = P078C8_A4287BarFasFor[0] ;
            A6881FasUnpLt = P078C8_A6881FasUnpLt[0] ;
            n6881FasUnpLt = P078C8_n6881FasUnpLt[0] ;
            A166BarKgm = P078C8_A166BarKgm[0] ;
            A199BarPie1 = P078C8_A199BarPie1[0] ;
            A898BarPieNDes = P078C8_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            GXv_char11[0] = A396EmprCod ;
            GXv_int8[0] = A129BarCod ;
            GXv_int10[0] = A132BarCodReo ;
            GXv_char6[0] = A130BarCodPar ;
            GXv_char5[0] = A758ProCod ;
            GXv_int12[0] = A194BarOrdLin ;
            GXv_char4[0] = A4314BarFasBot1 ;
            GXv_int7[0] = AV64Total_pdas ;
            new app.ppfnpds(remoteHandle, context).execute( GXv_char11, GXv_int8, GXv_int10, GXv_char6, GXv_char5, GXv_int12, GXv_char4, GXv_int7) ;
            rreclv6s.this.A396EmprCod = GXv_char11[0] ;
            rreclv6s.this.A129BarCod = GXv_int8[0] ;
            rreclv6s.this.A132BarCodReo = GXv_int10[0] ;
            rreclv6s.this.A130BarCodPar = GXv_char6[0] ;
            rreclv6s.this.A758ProCod = GXv_char5[0] ;
            rreclv6s.this.A194BarOrdLin = GXv_int12[0] ;
            rreclv6s.this.A4314BarFasBot1 = GXv_char4[0] ;
            rreclv6s.this.AV64Total_pdas = GXv_int7[0] ;
            AV147BarfasUnpL = A7913BarfasUnpL ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7913BarfasUnpL)==0) )
            {
               AV135FasUnPlt = AV147BarfasUnpL ;
            }
            else
            {
               AV135FasUnPlt = A6881FasUnpLt ;
            }
            if ( ( AV13Last_NumPd != A4643BarFasLot ) && ( AV13Last_NumPd > 0 ) )
            {
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            AV92ProCod = A758ProCod ;
            AV142pronumlin = A194BarOrdLin ;
            /* Execute user subroutine: 'PROLIN' */
            S221 ();
            if ( returnInSub )
            {
               pr_default.close(5);
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
            AV91FASOBS = "" ;
            /* Using cursor P078C9 */
            pr_default.execute(6, new Object[] {A396EmprCod, A457FasCod});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A465FasObs = P078C9_A465FasObs[0] ;
               A463FasNumLin = P078C9_A463FasNumLin[0] ;
               AV91FASOBS = A465FasObs ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV99Num_remon = A4315BarNumBot1 ;
            AV65BarFasRecu = A4648BarFasRecu ;
            AV92ProCod = A758ProCod ;
            AV44BarCod = A129BarCod ;
            AV45BarCodReo = A132BarCodReo ;
            AV46BarCodPar = A130BarCodPar ;
            AV66BarFasLot = A4643BarFasLot ;
            AV67BarOrdLin = A194BarOrdLin ;
            AV74BarColNom = A135BarColNom ;
            AV82BarNomCli = A1234BarNomCli ;
            AV141BarFecTeo = A162BarFecTeo ;
            AV80BarFacTin = A150BarFacTin ;
            if ( GXutil.strcmp(AV91FASOBS, "") == 0 )
            {
               /* Execute user subroutine: 'BARPAR' */
               S231 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
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
            AV47MaqCod = A4302BarMaqFas1 ;
            GXv_char11[0] = A396EmprCod ;
            GXv_char6[0] = AV47MaqCod ;
            GXv_char5[0] = AV48MaqDsc ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char11, GXv_char6, GXv_char5) ;
            rreclv6s.this.A396EmprCod = GXv_char11[0] ;
            rreclv6s.this.AV47MaqCod = GXv_char6[0] ;
            rreclv6s.this.AV48MaqDsc = GXv_char5[0] ;
            /* Execute user subroutine: 'MAQUIN' */
            S1410 ();
            if ( returnInSub )
            {
               pr_default.close(5);
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
            GXv_char11[0] = AV22FasDsc ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A457FasCod, GXv_char11) ;
            rreclv6s.this.AV22FasDsc = GXv_char11[0] ;
            GXv_char11[0] = A396EmprCod ;
            GXv_char6[0] = A457FasCod ;
            GXv_char5[0] = AV130fasDsc2 ;
            new app.pfasdsc2(remoteHandle, context).execute( GXv_char11, GXv_char6, GXv_char5) ;
            rreclv6s.this.A396EmprCod = GXv_char11[0] ;
            rreclv6s.this.A457FasCod = GXv_char6[0] ;
            rreclv6s.this.AV130fasDsc2 = GXv_char5[0] ;
            AV131FasDsc_t = GXutil.trim( AV22FasDsc) + " " + GXutil.trim( AV130fasDsc2) ;
            AV55Ceros8 = "00000000" ;
            AV50BarCod_a = GXutil.str( A129BarCod, 8, 0) ;
            AV50BarCod_a = GXutil.ltrim( GXutil.rtrim( AV50BarCod_a)) ;
            AV52LenVar = (short)(GXutil.len( AV50BarCod_a)) ;
            AV52LenVar = (short)(8-AV52LenVar) ;
            AV50BarCod_a = GXutil.substring( AV55Ceros8, 1, AV52LenVar) + AV50BarCod_a ;
            AV100Npda_3 = (short)(AV42RecNroPar) ;
            AV101Npda_a3 = GXutil.str( AV100Npda_3, 3, 0) ;
            AV101Npda_a3 = GXutil.ltrim( GXutil.rtrim( AV101Npda_a3)) ;
            AV52LenVar = (short)(GXutil.len( AV101Npda_a3)) ;
            AV52LenVar = (short)(3-AV52LenVar) ;
            AV101Npda_a3 = GXutil.substring( AV55Ceros8, 1, AV52LenVar) + AV101Npda_a3 ;
            AV56Orden_a = GXutil.str( A194BarOrdLin, 4, 0) ;
            AV56Orden_a = GXutil.ltrim( GXutil.rtrim( AV56Orden_a)) ;
            AV52LenVar = (short)(GXutil.len( AV56Orden_a)) ;
            AV52LenVar = (short)(4-AV52LenVar) ;
            AV56Orden_a = GXutil.substring( AV55Ceros8, 1, AV52LenVar) + AV56Orden_a ;
            AV51Reo_a = "0" ;
            if ( AV45BarCodReo > 0 )
            {
               AV51Reo_a = GXutil.str( AV45BarCodReo, 1, 0) ;
            }
            AV9HdrPart = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "/" + AV101Npda_a3 + "*" ;
            AV10HdrPda = AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "-" + AV101Npda_a3 ;
            AV41FasCod_cb = "*" + AV18FasCod + AV56Orden_a + "*" ;
            AV57FasCod_cb2 = AV41FasCod_cb ;
            AV83Hdr_pda1 = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "/" + A396EmprCod + "*" ;
            AV84Hdr_pda2 = AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "-" + A396EmprCod ;
            AV122Hdrcdb = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "*" ;
            if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'RECETA' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
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
               AV85Hdr_pda3 = "*" + AV101Npda_a3 + "/" + "00" + "*" ;
               AV86Hdr_pda4 = AV101Npda_a3 + "-" + "00" ;
               AV9HdrPart = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "/" + AV101Npda_a3 + "/" + "000" + "/" + A396EmprCod + "*" ;
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
         h78C0( false, 31) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Impresion", ""), 30, Gx_line+8, 129, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 142, Gx_line+8, 201, Gx_line+25, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario Impresion", ""), 590, Gx_line+8, 699, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV148usurcod, "@!")), 719, Gx_line+8, 778, Gx_line+25, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(21, Gx_line+4, 787, Gx_line+29, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+31) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h78C0( true, 0) ;
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
      h78C0( false, 164) ;
      getPrinter().GxDrawRect(569, Gx_line+109, 785, Gx_line+162, 1, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(22, Gx_line+3, 395, Gx_line+67, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 50, Gx_line+13, 102, Gx_line+30, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47MaqCod, "")), 133, Gx_line+13, 215, Gx_line+31, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48MaqDsc, "")), 214, Gx_line+13, 315, Gx_line+31, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Total Kgs", ""), 50, Gx_line+36, 107, Gx_line+53, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17RecMaqKgs, "ZZZZZZ9.99")), 130, Gx_line+36, 204, Gx_line+54, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23RecMaqPrd), "ZZZZ9")), 342, Gx_line+36, 379, Gx_line+54, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Prendas", ""), 218, Gx_line+36, 269, Gx_line+53, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Bache", ""), 600, Gx_line+91, 654, Gx_line+107, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42RecNroPar), "ZZZZZ9")), 680, Gx_line+91, 725, Gx_line+108, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("3 of 9 Barcode", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9HdrPart, "")), 27, Gx_line+113, 328, Gx_line+131, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10HdrPda, "")), 27, Gx_line+91, 141, Gx_line+108, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("3 of 9 Barcode", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41FasCod_cb, "")), 457, Gx_line+22, 750, Gx_line+50, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57FasCod_cb2, "")), 457, Gx_line+51, 546, Gx_line+69, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64Total_pdas), "ZZZZZ9")), 738, Gx_line+91, 783, Gx_line+108, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("/", 729, Gx_line+91, 733, Gx_line+107, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11TipDefDsc, "")), 573, Gx_line+126, 730, Gx_line+144, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68v_Texto, "")), 573, Gx_line+111, 631, Gx_line+127, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91FASOBS, "")), 349, Gx_line+70, 788, Gx_line+88, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123dsccausa, "")), 573, Gx_line+143, 730, Gx_line+161, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131FasDsc_t, "")), 457, Gx_line+3, 708, Gx_line+21, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrega", ""), 598, Gx_line+51, 695, Gx_line+68, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(localUtil.format( AV141BarFecTeo, "99/99/99"), 697, Gx_line+51, 750, Gx_line+69, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+164) ;
      /* Execute user subroutine: 'OBSFASES' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'OBSFASES' Routine */
      returnInSub = false ;
      AV144x = (short)(1) ;
      while ( AV144x <= 4 )
      {
         if ( GXutil.strcmp(AV145Tab_of[AV144x-1], " ") == 0 )
         {
            if (true) break;
         }
         AV146Obs_f = AV145Tab_of[AV144x-1] ;
         if ( AV144x == 1 )
         {
            h78C0( false, 21) ;
            getPrinter().GxDrawRect(22, Gx_line+0, 788, Gx_line+20, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones Fase Proceso Produccion", ""), 271, Gx_line+2, 541, Gx_line+19, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+21) ;
         }
         h78C0( false, 18) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV146Obs_f, "")), 22, Gx_line+0, 648, Gx_line+17, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         AV144x = (short)(AV144x+1) ;
      }
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'RECETA' Routine */
      returnInSub = false ;
      /* Using cursor P078C11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, Integer.valueOf(AV42RecNroPar), Short.valueOf(AV43RecOrdLin)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A2804RecLinMaq = P078C11_A2804RecLinMaq[0] ;
         A4268RecOrdLin = P078C11_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P078C11_n4268RecOrdLin[0] ;
         A4654RecNroPar = P078C11_A4654RecNroPar[0] ;
         n4654RecNroPar = P078C11_n4654RecNroPar[0] ;
         A4258RecMaqFas = P078C11_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P078C11_n4258RecMaqFas[0] ;
         A602MaqCod = P078C11_A602MaqCod[0] ;
         A4402RecUsrCod = P078C11_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P078C11_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P078C11_n4866RecFecAlt[0] ;
         A606MaqDsc = P078C11_A606MaqDsc[0] ;
         n606MaqDsc = P078C11_n606MaqDsc[0] ;
         A148BarEstReo = P078C11_A148BarEstReo[0] ;
         A4273RecFagPrd = P078C11_A4273RecFagPrd[0] ;
         A4261RecTotPrd = P078C11_A4261RecTotPrd[0] ;
         n4261RecTotPrd = P078C11_n4261RecTotPrd[0] ;
         A4271RecFagKgs = P078C11_A4271RecFagKgs[0] ;
         A4259RecTotKgs = P078C11_A4259RecTotKgs[0] ;
         A606MaqDsc = P078C11_A606MaqDsc[0] ;
         n606MaqDsc = P078C11_n606MaqDsc[0] ;
         A148BarEstReo = P078C11_A148BarEstReo[0] ;
         A4273RecFagPrd = P078C11_A4273RecFagPrd[0] ;
         A4271RecFagKgs = P078C11_A4271RecFagKgs[0] ;
         A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
         A4318RecMaqPrd = (int)(A4261RecTotPrd+A4273RecFagPrd) ;
         AV102Nactx_3 = A2804RecLinMaq ;
         AV103Nactx_3a = GXutil.str( AV102Nactx_3, 3, 0) ;
         AV103Nactx_3a = GXutil.ltrim( GXutil.rtrim( AV103Nactx_3a)) ;
         AV52LenVar = (short)(GXutil.len( AV103Nactx_3a)) ;
         AV52LenVar = (short)(3-AV52LenVar) ;
         AV103Nactx_3a = GXutil.substring( AV55Ceros8, 1, AV52LenVar) + AV103Nactx_3a ;
         AV9HdrPart = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "/" + AV101Npda_a3 + "/" + AV103Nactx_3a + "/" + A396EmprCod + "*" ;
         AV83Hdr_pda1 = "*" + AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "/" + A396EmprCod + "*" ;
         AV85Hdr_pda3 = "*" + AV101Npda_a3 + "/" + AV103Nactx_3a + "*" ;
         AV10HdrPda += "-" + AV103Nactx_3a + "-" + A396EmprCod ;
         AV84Hdr_pda2 = AV50BarCod_a + AV51Reo_a + AV46BarCodPar + "-" + A396EmprCod ;
         AV86Hdr_pda4 = AV101Npda_a3 + "-" + AV103Nactx_3a ;
         AV17RecMaqKgs = A4316RecMaqKgs ;
         AV23RecMaqPrd = A4318RecMaqPrd ;
         AV18FasCod = A4258RecMaqFas ;
         GXv_char11[0] = AV22FasDsc ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, AV18FasCod, GXv_char11) ;
         rreclv6s.this.AV22FasDsc = GXv_char11[0] ;
         AV47MaqCod = A602MaqCod ;
         /* Execute user subroutine: 'MAQUIN' */
         S1410 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(7);
            pr_default.close(7);
            pr_default.close(7);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h78C0( false, 175) ;
         getPrinter().GxDrawRect(569, Gx_line+117, 785, Gx_line+171, 1, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(22, Gx_line+4, 395, Gx_line+68, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 50, Gx_line+14, 102, Gx_line+31, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 133, Gx_line+14, 215, Gx_line+32, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 214, Gx_line+14, 315, Gx_line+32, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Kgs", ""), 50, Gx_line+38, 107, Gx_line+55, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17RecMaqKgs, "ZZZZZZ9.99")), 130, Gx_line+38, 204, Gx_line+56, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23RecMaqPrd), "ZZZZ9")), 342, Gx_line+38, 379, Gx_line+56, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Prendas", ""), 218, Gx_line+38, 269, Gx_line+55, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Bache", ""), 601, Gx_line+96, 655, Gx_line+112, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4654RecNroPar), "ZZZZZ9")), 681, Gx_line+96, 726, Gx_line+113, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Acatex", ""), 500, Gx_line+96, 558, Gx_line+112, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")), 563, Gx_line+96, 593, Gx_line+113, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("3 of 9 Barcode", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9HdrPart, "")), 26, Gx_line+117, 327, Gx_line+135, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10HdrPda, "")), 27, Gx_line+96, 141, Gx_line+113, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("3 of 9 Barcode", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41FasCod_cb, "")), 457, Gx_line+24, 750, Gx_line+52, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22FasDsc, "")), 457, Gx_line+2, 608, Gx_line+20, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57FasCod_cb2, "")), 457, Gx_line+53, 546, Gx_line+71, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("/", 730, Gx_line+96, 734, Gx_line+112, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64Total_pdas), "ZZZZZ9")), 739, Gx_line+96, 784, Gx_line+113, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11TipDefDsc, "")), 573, Gx_line+133, 704, Gx_line+150, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68v_Texto, "")), 573, Gx_line+118, 631, Gx_line+134, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 349, Gx_line+96, 473, Gx_line+112, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 306, Gx_line+96, 342, Gx_line+112, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91FASOBS, "")), 349, Gx_line+73, 788, Gx_line+91, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 191, Gx_line+95, 299, Gx_line+111, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123dsccausa, "")), 573, Gx_line+151, 730, Gx_line+169, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV141BarFecTeo, "99/99/99"), 698, Gx_line+53, 751, Gx_line+71, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrega", ""), 596, Gx_line+53, 693, Gx_line+70, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+175) ;
         /* Execute user subroutine: 'OBSFASES' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(7);
            pr_default.close(7);
            pr_default.close(7);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         if ( AV99Num_remon > 0 )
         {
            h78C0( false, 23) ;
            getPrinter().GxDrawRect(616, Gx_line+1, 785, Gx_line+20, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº de Remontas", ""), 624, Gx_line+2, 730, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV99Num_remon), "ZZZZZ9")), 732, Gx_line+2, 777, Gx_line+20, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
         }
         if ( GXutil.strcmp(AV119BarTipDis, httpContext.getMessage( "T", "")) == 0 )
         {
            /* Execute user subroutine: 'AGRHDFP' */
            S1510 ();
            if ( returnInSub )
            {
               pr_default.close(7);
               pr_default.close(7);
               pr_default.close(7);
               pr_default.close(7);
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
            S1610 ();
            if ( returnInSub )
            {
               pr_default.close(7);
               pr_default.close(7);
               pr_default.close(7);
               pr_default.close(7);
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
            S1710 ();
            if ( returnInSub )
            {
               pr_default.close(7);
               pr_default.close(7);
               pr_default.close(7);
               pr_default.close(7);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         AV81C_cab_p = (byte)(0) ;
         AV118Ctrl_m = (byte)(0) ;
         /* Using cursor P078C12 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A4695RecVolPrf = P078C12_A4695RecVolPrf[0] ;
            A1273RecLinPro = P078C12_A1273RecLinPro[0] ;
            A4696RecTiempo = P078C12_A4696RecTiempo[0] ;
            n4696RecTiempo = P078C12_n4696RecTiempo[0] ;
            A771ProForTie = P078C12_A771ProForTie[0] ;
            A7228RecTemp = P078C12_A7228RecTemp[0] ;
            n7228RecTemp = P078C12_n7228RecTemp[0] ;
            A772ProForTmx = P078C12_A772ProForTmx[0] ;
            A7230RecPhMn = P078C12_A7230RecPhMn[0] ;
            n7230RecPhMn = P078C12_n7230RecPhMn[0] ;
            A6877ProForPhn = P078C12_A6877ProForPhn[0] ;
            n6877ProForPhn = P078C12_n6877ProForPhn[0] ;
            A7229RecPhMx = P078C12_A7229RecPhMx[0] ;
            n7229RecPhMx = P078C12_n7229RecPhMx[0] ;
            A6876ProForPhx = P078C12_A6876ProForPhx[0] ;
            n6876ProForPhx = P078C12_n6876ProForPhx[0] ;
            A4697RecNroPrg = P078C12_A4697RecNroPrg[0] ;
            A764ProForCod = P078C12_A764ProForCod[0] ;
            A766ProForDsc = P078C12_A766ProForDsc[0] ;
            A6018ProForFab = P078C12_A6018ProForFab[0] ;
            n6018ProForFab = P078C12_n6018ProForFab[0] ;
            A4706ProForRb = P078C12_A4706ProForRb[0] ;
            A7257RecRb = P078C12_A7257RecRb[0] ;
            n7257RecRb = P078C12_n7257RecRb[0] ;
            A5523ProForTip = P078C12_A5523ProForTip[0] ;
            A771ProForTie = P078C12_A771ProForTie[0] ;
            A772ProForTmx = P078C12_A772ProForTmx[0] ;
            A6877ProForPhn = P078C12_A6877ProForPhn[0] ;
            n6877ProForPhn = P078C12_n6877ProForPhn[0] ;
            A6876ProForPhx = P078C12_A6876ProForPhx[0] ;
            n6876ProForPhx = P078C12_n6876ProForPhx[0] ;
            A766ProForDsc = P078C12_A766ProForDsc[0] ;
            A6018ProForFab = P078C12_A6018ProForFab[0] ;
            n6018ProForFab = P078C12_n6018ProForFab[0] ;
            A4706ProForRb = P078C12_A4706ProForRb[0] ;
            A5523ProForTip = P078C12_A5523ProForTip[0] ;
            if ( A4696RecTiempo > 0 )
            {
               AV14ProForTie = A4696RecTiempo ;
            }
            else
            {
               AV14ProForTie = A771ProForTie ;
            }
            if ( A7228RecTemp > 0 )
            {
               AV138Profortmx = A7228RecTemp ;
            }
            else
            {
               AV138Profortmx = A772ProForTmx ;
            }
            if ( A7230RecPhMn.doubleValue() > 0 )
            {
               AV139Proforphn = A7230RecPhMn ;
            }
            else
            {
               AV139Proforphn = A6877ProForPhn ;
            }
            if ( A7229RecPhMx.doubleValue() > 0 )
            {
               AV140Proforphx = A7229RecPhMx ;
            }
            else
            {
               AV140Proforphx = A6876ProForPhx ;
            }
            AV15ProNumPro = A4697RecNroPrg ;
            AV19ProForCod = A764ProForCod ;
            AV121Profordsc = A766ProForDsc ;
            AV132Proforfab = A6018ProForFab ;
            AV16vRb = DecimalUtil.doubleToDec(A4706ProForRb) ;
            if ( A7257RecRb.doubleValue() > 0 )
            {
               AV16vRb = A7257RecRb ;
            }
            else
            {
               AV16vRb = DecimalUtil.doubleToDec(A4706ProForRb) ;
            }
            if ( AV81C_cab_p == 0 )
            {
               AV81C_cab_p = (byte)(1) ;
               if ( GXutil.strcmp(AV132Proforfab, "*") == 0 )
               {
                  h78C0( false, 47) ;
                  getPrinter().GxDrawRect(21, Gx_line+1, 787, Gx_line+23, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 128, Gx_line+3, 317, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 39, Gx_line+2, 121, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 64, Gx_line+25, 107, Gx_line+42, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 238, Gx_line+25, 298, Gx_line+42, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 504, Gx_line+25, 564, Gx_line+42, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(21, Gx_line+22, 787, Gx_line+45, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(168, Gx_line+22, 168, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(21, Gx_line+43, 21, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(785, Gx_line+43, 785, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(620, Gx_line+22, 620, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Constante", ""), 333, Gx_line+4, 400, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135FasUnPlt, "ZZZ9.99")), 410, Gx_line+4, 462, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(496, Gx_line+22, 496, Gx_line+47, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+47) ;
               }
               else
               {
                  h78C0( false, 46) ;
                  getPrinter().GxDrawRect(21, Gx_line+0, 787, Gx_line+22, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 124, Gx_line+1, 313, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 34, Gx_line+1, 116, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Volumem", ""), 582, Gx_line+1, 639, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9")), 646, Gx_line+1, 683, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lt", ""), 694, Gx_line+1, 706, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 716, Gx_line+1, 734, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16vRb, "Z9.99")), 741, Gx_line+1, 778, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 59, Gx_line+24, 102, Gx_line+41, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 238, Gx_line+24, 298, Gx_line+41, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 504, Gx_line+24, 564, Gx_line+41, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(21, Gx_line+21, 787, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(168, Gx_line+21, 168, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(496, Gx_line+21, 496, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(21, Gx_line+42, 21, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(785, Gx_line+42, 785, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(620, Gx_line+21, 620, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 300, Gx_line+1, 345, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14ProForTie), "ZZZ9")), 350, Gx_line+1, 380, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PH", ""), 455, Gx_line+1, 475, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV138Profortmx), "ZZZ9")), 409, Gx_line+1, 439, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV139Proforphn, "Z9.99")), 519, Gx_line+1, 556, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV140Proforphx, "Z9.99")), 479, Gx_line+1, 516, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TºC", ""), 385, Gx_line+1, 408, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(298, Gx_line+0, 298, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(383, Gx_line+0, 383, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(449, Gx_line+0, 449, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(569, Gx_line+0, 569, Gx_line+22, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+46) ;
               }
            }
            else
            {
               if ( GXutil.strcmp(AV132Proforfab, "*") == 0 )
               {
                  h78C0( false, 47) ;
                  getPrinter().GxDrawRect(21, Gx_line+1, 787, Gx_line+23, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 128, Gx_line+3, 317, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 39, Gx_line+2, 121, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 64, Gx_line+25, 107, Gx_line+42, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 238, Gx_line+25, 298, Gx_line+42, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 504, Gx_line+25, 564, Gx_line+42, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(21, Gx_line+22, 787, Gx_line+45, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(168, Gx_line+22, 168, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(21, Gx_line+43, 21, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(785, Gx_line+43, 785, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(620, Gx_line+22, 620, Gx_line+47, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Constante", ""), 333, Gx_line+4, 400, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135FasUnPlt, "ZZZ9.99")), 410, Gx_line+4, 462, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(496, Gx_line+22, 496, Gx_line+47, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+47) ;
               }
               else
               {
                  h78C0( false, 46) ;
                  getPrinter().GxDrawRect(21, Gx_line+0, 787, Gx_line+22, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 124, Gx_line+1, 313, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 34, Gx_line+1, 116, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Volumem", ""), 582, Gx_line+1, 639, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9")), 646, Gx_line+1, 683, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lt", ""), 694, Gx_line+1, 706, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 716, Gx_line+1, 734, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16vRb, "Z9.99")), 741, Gx_line+1, 778, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 59, Gx_line+24, 102, Gx_line+41, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 238, Gx_line+24, 298, Gx_line+41, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 504, Gx_line+24, 564, Gx_line+41, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(21, Gx_line+21, 787, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(168, Gx_line+21, 168, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(496, Gx_line+21, 496, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(21, Gx_line+42, 21, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(785, Gx_line+42, 785, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(620, Gx_line+21, 620, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tiempo", ""), 300, Gx_line+1, 345, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14ProForTie), "ZZZ9")), 350, Gx_line+1, 380, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PH", ""), 455, Gx_line+1, 475, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV138Profortmx), "ZZZ9")), 409, Gx_line+1, 439, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV139Proforphn, "Z9.99")), 519, Gx_line+1, 556, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV140Proforphx, "Z9.99")), 479, Gx_line+1, 516, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "TºC", ""), 385, Gx_line+1, 408, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(298, Gx_line+0, 298, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(383, Gx_line+0, 383, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(449, Gx_line+0, 449, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(569, Gx_line+0, 569, Gx_line+22, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+46) ;
               }
            }
            /* Using cursor P078C13 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A719PrdNum = P078C13_A719PrdNum[0] ;
               n719PrdNum = P078C13_n719PrdNum[0] ;
               A872RecPrdNum = P078C13_A872RecPrdNum[0] ;
               A4338PrdUMeFo = P078C13_A4338PrdUMeFo[0] ;
               A490ForPrdUMe = P078C13_A490ForPrdUMe[0] ;
               n490ForPrdUMe = P078C13_n490ForPrdUMe[0] ;
               A431FacCon = P078C13_A431FacCon[0] ;
               A2394RecForNro = P078C13_A2394RecForNro[0] ;
               A875RecPrdDsc = P078C13_A875RecPrdDsc[0] ;
               A743PrdUniCon = P078C13_A743PrdUniCon[0] ;
               A686PrdCant = P078C13_A686PrdCant[0] ;
               A5422RecSalMP = P078C13_A5422RecSalMP[0] ;
               A5467RecSalVol = P078C13_A5467RecSalVol[0] ;
               A4692PrdNom2 = P078C13_A4692PrdNom2[0] ;
               A707PrdFacCon = P078C13_A707PrdFacCon[0] ;
               A724PrdPreAct = P078C13_A724PrdPreAct[0] ;
               A811RecLin = P078C13_A811RecLin[0] ;
               A4338PrdUMeFo = P078C13_A4338PrdUMeFo[0] ;
               A743PrdUniCon = P078C13_A743PrdUniCon[0] ;
               A4692PrdNom2 = P078C13_A4692PrdNom2[0] ;
               A707PrdFacCon = P078C13_A707PrdFacCon[0] ;
               A724PrdPreAct = P078C13_A724PrdPreAct[0] ;
               AV114PrdNumi = A872RecPrdNum + "" ;
               AV133PrdUmefo = A4338PrdUMeFo ;
               AV129Quant_aux = DecimalUtil.doubleToDec(0) ;
               if ( A490ForPrdUMe == 1 )
               {
                  AV31var2 = httpContext.getMessage( "Gr/L", "") ;
                  AV129Quant_aux = A431FacCon.multiply(DecimalUtil.doubleToDec(A4695RecVolPrf)) ;
               }
               if ( A490ForPrdUMe == 2 )
               {
                  AV31var2 = httpContext.getMessage( "Cc/L", "") ;
                  AV129Quant_aux = A431FacCon.multiply(DecimalUtil.doubleToDec(A4695RecVolPrf)) ;
               }
               if ( A490ForPrdUMe == 3 )
               {
                  AV31var2 = "%" ;
                  AV129Quant_aux = A431FacCon.multiply(AV17RecMaqKgs).multiply(DecimalUtil.doubleToDec(10)) ;
               }
               AV25Var1 = GXutil.str( A431FacCon, 11, 5) + " " + AV31var2 ;
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
                     h78C0( false, 17) ;
                     getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24PrdDsc, "")), 222, Gx_line+1, 358, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(168, Gx_line+0, 168, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(496, Gx_line+0, 496, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(21, Gx_line+0, 21, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(620, Gx_line+0, 620, Gx_line+17, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
               }
               else
               {
                  AV114PrdNumi = A872RecPrdNum + "" ;
                  AV32CodPrd = GXutil.substring( A872RecPrdNum, 1, 1) ;
                  if ( GXutil.strcmp(AV132Proforfab, "*") == 0 )
                  {
                     if ( AV133PrdUmefo == 1 )
                     {
                        AV28Unidades = httpContext.getMessage( "Gr", "") ;
                     }
                     if ( AV133PrdUmefo == 2 )
                     {
                        AV28Unidades = httpContext.getMessage( "Cc", "") ;
                     }
                  }
                  else
                  {
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
                  if ( AV29FlagImp == 1 )
                  {
                     if ( ( A686PrdCant.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV32CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV32CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV32CodPrd, "9") == 0 ) ) )
                     {
                        AV27Cantidad = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                        if ( GXutil.strcmp(AV132Proforfab, "*") == 0 )
                        {
                           if ( AV133PrdUmefo == 1 )
                           {
                              AV28Unidades = httpContext.getMessage( "Lt", "") ;
                           }
                           if ( AV133PrdUmefo == 2 )
                           {
                              AV28Unidades = httpContext.getMessage( "Lt", "") ;
                           }
                        }
                        else
                        {
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
                     }
                     else
                     {
                        AV27Cantidad = A686PrdCant ;
                        if ( GXutil.strcmp(AV132Proforfab, "*") == 0 )
                        {
                           if ( AV133PrdUmefo == 1 )
                           {
                              AV28Unidades = httpContext.getMessage( "Gr", "") ;
                           }
                           if ( AV133PrdUmefo == 2 )
                           {
                              AV28Unidades = httpContext.getMessage( "Cc", "") ;
                           }
                        }
                        else
                        {
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
                  }
                  else
                  {
                     AV27Cantidad = A686PrdCant ;
                  }
                  AV88Cant_Unid = GXutil.str( AV27Cantidad, 11, 3) + " " + AV28Unidades ;
                  AV89RecSalmp = "" ;
                  AV90RecSalVol = "" ;
                  if ( A5422RecSalMP > 0 )
                  {
                     AV89RecSalmp = GXutil.str( A5422RecSalMP, 3, 0) ;
                  }
                  if ( A5467RecSalVol > 0 )
                  {
                     AV90RecSalVol = GXutil.str( A5467RecSalVol, 5, 0) ;
                  }
                  if ( ( GXutil.strcmp(AV32CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV32CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV32CodPrd, "0") == 0 ) )
                  {
                     AV24PrdDsc = A875RecPrdDsc ;
                     if ( ( GXutil.strcmp(A4692PrdNom2, " ") != 0 ) && ( AV155Eliot == 0 ) )
                     {
                        AV24PrdDsc = GXutil.substring( A4692PrdNom2, 1, 26) ;
                     }
                     h78C0( false, 17) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Var1, "")), 29, Gx_line+1, 113, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114PrdNumi, "@!")), 173, Gx_line+1, 247, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24PrdDsc, "")), 271, Gx_line+1, 407, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Cant_Unid, "")), 503, Gx_line+1, 582, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(168, Gx_line+0, 168, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(496, Gx_line+0, 496, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(21, Gx_line+0, 21, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(620, Gx_line+0, 620, Gx_line+17, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     AV24PrdDsc = A875RecPrdDsc ;
                     if ( ( GXutil.strcmp(A4692PrdNom2, " ") != 0 ) && ( AV155Eliot == 0 ) )
                     {
                        AV24PrdDsc = GXutil.substring( A4692PrdNom2, 1, 26) ;
                     }
                     h78C0( false, 17) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Var1, "")), 29, Gx_line+1, 113, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24PrdDsc, "")), 271, Gx_line+1, 407, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(168, Gx_line+0, 168, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(496, Gx_line+0, 496, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(785, Gx_line+0, 785, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(21, Gx_line+0, 21, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Cant_Unid, "")), 503, Gx_line+1, 582, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(620, Gx_line+0, 620, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114PrdNumi, "@!")), 173, Gx_line+1, 247, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
               }
               AV30Coste = AV30Coste.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
               pr_default.readNext(9);
            }
            pr_default.close(9);
            AV109PROFORTIP = A5523ProForTip ;
            h78C0( false, 1) ;
            getPrinter().GxDrawLine(21, Gx_line+0, 787, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'RECUPERACIONES' Routine */
      returnInSub = false ;
      AV11TipDefDsc = GXutil.space( (short)(30)) ;
      AV68v_Texto = GXutil.space( (short)(10)) ;
      /* Using cursor P078C14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, Integer.valueOf(AV66BarFasLot), Short.valueOf(AV67BarOrdLin), Integer.valueOf(AV65BarFasRecu)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A833TipDefCod = P078C14_A833TipDefCod[0] ;
         n833TipDefCod = P078C14_n833TipDefCod[0] ;
         A4667HisLavCon = P078C14_A4667HisLavCon[0] ;
         A4665HisLavOrd = P078C14_A4665HisLavOrd[0] ;
         A4664HisLavNpd = P078C14_A4664HisLavNpd[0] ;
         A4663HisLavPar = P078C14_A4663HisLavPar[0] ;
         A4662HisLavReo = P078C14_A4662HisLavReo[0] ;
         A4661HisLavCod = P078C14_A4661HisLavCod[0] ;
         A834TipDefDsc = P078C14_A834TipDefDsc[0] ;
         n834TipDefDsc = P078C14_n834TipDefDsc[0] ;
         A834TipDefDsc = P078C14_A834TipDefDsc[0] ;
         n834TipDefDsc = P078C14_n834TipDefDsc[0] ;
         AV11TipDefDsc = A834TipDefDsc ;
         AV68v_Texto = httpContext.getMessage( "RECUPERAÇAO", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S1710( ) throws ProcessInterruptedException
   {
      /* 'HLREO1' Routine */
      returnInSub = false ;
      AV93F_vez = (byte)(0) ;
      /* Using cursor P078C15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A5061Hl_hdrp = P078C15_A5061Hl_hdrp[0] ;
         A5060Hl_hdrr = P078C15_A5060Hl_hdrr[0] ;
         A5059Hl_hdr = P078C15_A5059Hl_hdr[0] ;
         A5067Hl_hdr_o = P078C15_A5067Hl_hdr_o[0] ;
         A5068Hl_hdrr_o = P078C15_A5068Hl_hdrr_o[0] ;
         A5069Hl_hdrp_o = P078C15_A5069Hl_hdrp_o[0] ;
         A5071Hl_pzs_o = P078C15_A5071Hl_pzs_o[0] ;
         n5071Hl_pzs_o = P078C15_n5071Hl_pzs_o[0] ;
         A5070Hl_kgs_o = P078C15_A5070Hl_kgs_o[0] ;
         n5070Hl_kgs_o = P078C15_n5070Hl_kgs_o[0] ;
         if ( AV93F_vez == 0 )
         {
            AV93F_vez = (byte)(1) ;
            h78C0( false, 30) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reoperado Interno. Hojas Ruta Origen:", ""), 34, Gx_line+0, 253, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 34, Gx_line+14, 55, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 176, Gx_line+14, 218, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 407, Gx_line+14, 453, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 545, Gx_line+11, 577, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 703, Gx_line+11, 726, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Prendas", ""), 743, Gx_line+11, 792, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(34, Gx_line+26, 92, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(176, Gx_line+26, 395, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(407, Gx_line+26, 524, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(545, Gx_line+26, 640, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(659, Gx_line+26, 725, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(743, Gx_line+26, 791, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Ped Int", ""), 104, Gx_line+14, 159, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(104, Gx_line+26, 156, Gx_line+26, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+30) ;
         }
         GXv_char11[0] = A396EmprCod ;
         GXv_int8[0] = A5067Hl_hdr_o ;
         GXv_int10[0] = A5068Hl_hdrr_o ;
         GXv_char6[0] = A5069Hl_hdrp_o ;
         GXv_int7[0] = AV97CliCod_a ;
         GXv_char5[0] = AV94CliNom_a ;
         GXv_char4[0] = AV95BarSer_a ;
         GXv_char13[0] = AV96ColNom_a ;
         GXv_int14[0] = 0 ;
         GXv_int15[0] = AV108Discod_a ;
         new app.phrag06(remoteHandle, context).execute( GXv_char11, GXv_int8, GXv_int10, GXv_char6, GXv_int7, GXv_char5, GXv_char4, GXv_char13, GXv_int14, GXv_int15) ;
         rreclv6s.this.A396EmprCod = GXv_char11[0] ;
         rreclv6s.this.A5067Hl_hdr_o = GXv_int8[0] ;
         rreclv6s.this.A5068Hl_hdrr_o = GXv_int10[0] ;
         rreclv6s.this.A5069Hl_hdrp_o = GXv_char6[0] ;
         rreclv6s.this.AV97CliCod_a = GXv_int7[0] ;
         rreclv6s.this.AV94CliNom_a = GXv_char5[0] ;
         rreclv6s.this.AV95BarSer_a = GXv_char4[0] ;
         rreclv6s.this.AV96ColNom_a = GXv_char13[0] ;
         rreclv6s.this.AV108Discod_a = GXv_int15[0] ;
         h78C0( false, 15) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94CliNom_a, "")), 176, Gx_line+0, 333, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95BarSer_a, "")), 407, Gx_line+0, 491, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96ColNom_a, "")), 545, Gx_line+0, 614, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV108Discod_a), "ZZZZZZZ9")), 104, Gx_line+0, 155, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5070Hl_kgs_o, "ZZZZZ9.99")), 669, Gx_line+0, 726, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5071Hl_pzs_o), "ZZZ9")), 752, Gx_line+0, 778, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5067Hl_hdr_o), "ZZZZZZZ9")), 34, Gx_line+0, 85, Gx_line+16, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+15) ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S1510( ) throws ProcessInterruptedException
   {
      /* 'AGRHDFP' Routine */
      returnInSub = false ;
      AV93F_vez = (byte)(0) ;
      /* Using cursor P078C16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, AV92ProCod, Short.valueOf(AV67BarOrdLin), Integer.valueOf(AV42RecNroPar)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A4643BarFasLot = P078C16_A4643BarFasLot[0] ;
         A194BarOrdLin = P078C16_A194BarOrdLin[0] ;
         A758ProCod = P078C16_A758ProCod[0] ;
         A5954Ap_Barcod = P078C16_A5954Ap_Barcod[0] ;
         A5955Ap_BarReo = P078C16_A5955Ap_BarReo[0] ;
         A5956Ap_BarPar = P078C16_A5956Ap_BarPar[0] ;
         A5960Ap_Piezas = P078C16_A5960Ap_Piezas[0] ;
         n5960Ap_Piezas = P078C16_n5960Ap_Piezas[0] ;
         A5959Ap_Kilos = P078C16_A5959Ap_Kilos[0] ;
         n5959Ap_Kilos = P078C16_n5959Ap_Kilos[0] ;
         A5957Ap_ProCod = P078C16_A5957Ap_ProCod[0] ;
         A5958Ap_BarOrd = P078C16_A5958Ap_BarOrd[0] ;
         if ( AV93F_vez == 0 )
         {
            AV93F_vez = (byte)(1) ;
            h78C0( false, 43) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Agrupado con:", ""), 34, Gx_line+11, 118, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 34, Gx_line+26, 55, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 176, Gx_line+26, 218, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 407, Gx_line+26, 453, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 545, Gx_line+24, 577, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 703, Gx_line+24, 726, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Prendas", ""), 743, Gx_line+24, 792, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(36, Gx_line+39, 94, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(176, Gx_line+39, 395, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(407, Gx_line+39, 524, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(545, Gx_line+39, 640, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(659, Gx_line+39, 725, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(743, Gx_line+39, 791, Gx_line+39, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Ped Int", ""), 104, Gx_line+26, 159, Gx_line+41, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(104, Gx_line+39, 156, Gx_line+39, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+43) ;
         }
         GXv_char13[0] = A396EmprCod ;
         GXv_int15[0] = A5954Ap_Barcod ;
         GXv_int10[0] = A5955Ap_BarReo ;
         GXv_char11[0] = A5956Ap_BarPar ;
         GXv_int14[0] = AV97CliCod_a ;
         GXv_char6[0] = AV94CliNom_a ;
         GXv_char5[0] = AV95BarSer_a ;
         GXv_char4[0] = AV96ColNom_a ;
         GXv_int8[0] = 0 ;
         GXv_int7[0] = AV108Discod_a ;
         new app.phrag06(remoteHandle, context).execute( GXv_char13, GXv_int15, GXv_int10, GXv_char11, GXv_int14, GXv_char6, GXv_char5, GXv_char4, GXv_int8, GXv_int7) ;
         rreclv6s.this.A396EmprCod = GXv_char13[0] ;
         rreclv6s.this.A5954Ap_Barcod = GXv_int15[0] ;
         rreclv6s.this.A5955Ap_BarReo = GXv_int10[0] ;
         rreclv6s.this.A5956Ap_BarPar = GXv_char11[0] ;
         rreclv6s.this.AV97CliCod_a = GXv_int14[0] ;
         rreclv6s.this.AV94CliNom_a = GXv_char6[0] ;
         rreclv6s.this.AV95BarSer_a = GXv_char5[0] ;
         rreclv6s.this.AV96ColNom_a = GXv_char4[0] ;
         rreclv6s.this.AV108Discod_a = GXv_int7[0] ;
         h78C0( false, 16) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5954Ap_Barcod), "ZZZZZZZ9")), 34, Gx_line+0, 85, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5959Ap_Kilos, "ZZZZZ9.99")), 669, Gx_line+0, 726, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5960Ap_Piezas), "ZZZ9")), 752, Gx_line+1, 778, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94CliNom_a, "")), 176, Gx_line+0, 333, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95BarSer_a, "")), 407, Gx_line+0, 491, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96ColNom_a, "")), 545, Gx_line+0, 614, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV108Discod_a), "ZZZZZZZ9")), 104, Gx_line+0, 155, Gx_line+16, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+16) ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S1610( ) throws ProcessInterruptedException
   {
      /* 'AGRHDF' Routine */
      returnInSub = false ;
      AV93F_vez = (byte)(0) ;
      /* Using cursor P078C17 */
      pr_default.execute(13, new Object[] {AV63EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, AV92ProCod, Short.valueOf(AV67BarOrdLin)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A194BarOrdLin = P078C17_A194BarOrdLin[0] ;
         A758ProCod = P078C17_A758ProCod[0] ;
         A4940A_Barcod = P078C17_A4940A_Barcod[0] ;
         A4941A_BarReo = P078C17_A4941A_BarReo[0] ;
         A4942A_BarPar = P078C17_A4942A_BarPar[0] ;
         A4947A_Piezas = P078C17_A4947A_Piezas[0] ;
         n4947A_Piezas = P078C17_n4947A_Piezas[0] ;
         A4946A_Kilos = P078C17_A4946A_Kilos[0] ;
         n4946A_Kilos = P078C17_n4946A_Kilos[0] ;
         A4943A_ProCod = P078C17_A4943A_ProCod[0] ;
         A4944A_BarOrd = P078C17_A4944A_BarOrd[0] ;
         if ( AV93F_vez == 0 )
         {
            AV93F_vez = (byte)(1) ;
            h78C0( false, 31) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Agrupado con:", ""), 34, Gx_line+0, 118, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 34, Gx_line+15, 55, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 176, Gx_line+15, 218, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 407, Gx_line+15, 453, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 545, Gx_line+13, 577, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 703, Gx_line+13, 726, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Prendas", ""), 743, Gx_line+13, 792, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(36, Gx_line+27, 94, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(176, Gx_line+27, 395, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(407, Gx_line+27, 524, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(545, Gx_line+27, 640, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(659, Gx_line+27, 725, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(743, Gx_line+27, 791, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Ped Int", ""), 104, Gx_line+15, 159, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(104, Gx_line+27, 156, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+31) ;
         }
         GXv_char13[0] = A396EmprCod ;
         GXv_int15[0] = A4940A_Barcod ;
         GXv_int10[0] = A4941A_BarReo ;
         GXv_char11[0] = A4942A_BarPar ;
         GXv_int14[0] = AV97CliCod_a ;
         GXv_char6[0] = AV94CliNom_a ;
         GXv_char5[0] = AV95BarSer_a ;
         GXv_char4[0] = AV96ColNom_a ;
         GXv_int8[0] = 0 ;
         GXv_int7[0] = AV108Discod_a ;
         new app.phrag06(remoteHandle, context).execute( GXv_char13, GXv_int15, GXv_int10, GXv_char11, GXv_int14, GXv_char6, GXv_char5, GXv_char4, GXv_int8, GXv_int7) ;
         rreclv6s.this.A396EmprCod = GXv_char13[0] ;
         rreclv6s.this.A4940A_Barcod = GXv_int15[0] ;
         rreclv6s.this.A4941A_BarReo = GXv_int10[0] ;
         rreclv6s.this.A4942A_BarPar = GXv_char11[0] ;
         rreclv6s.this.AV97CliCod_a = GXv_int14[0] ;
         rreclv6s.this.AV94CliNom_a = GXv_char6[0] ;
         rreclv6s.this.AV95BarSer_a = GXv_char5[0] ;
         rreclv6s.this.AV96ColNom_a = GXv_char4[0] ;
         rreclv6s.this.AV108Discod_a = GXv_int7[0] ;
         h78C0( false, 16) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4940A_Barcod), "ZZZZZZZ9")), 34, Gx_line+0, 85, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4946A_Kilos, "ZZZZZ9.99")), 669, Gx_line+0, 726, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4947A_Piezas), "ZZZ9")), 752, Gx_line+1, 778, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94CliNom_a, "")), 176, Gx_line+0, 333, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95BarSer_a, "")), 407, Gx_line+0, 491, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96ColNom_a, "")), 545, Gx_line+0, 614, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV108Discod_a), "ZZZZZZZ9")), 104, Gx_line+0, 155, Gx_line+16, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+16) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S191( ) throws ProcessInterruptedException
   {
      /* 'OBSERF' Routine */
      returnInSub = false ;
      AV111i_obs = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV110Tab_obsf[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P078C18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV33CliCod), AV37BarSer, AV74BarColNom, Integer.valueOf(AV75BarColNum), Byte.valueOf(AV76BarTipCol)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A831TipColCod = P078C18_A831TipColCod[0] ;
         A483ForColNum = P078C18_A483ForColNum[0] ;
         A482ForColNom = P078C18_A482ForColNom[0] ;
         A494ForSer = P078C18_A494ForSer[0] ;
         A252CliCod = P078C18_A252CliCod[0] ;
         n252CliCod = P078C18_n252CliCod[0] ;
         A649ObsForTxt = P078C18_A649ObsForTxt[0] ;
         A650ObsLin = P078C18_A650ObsLin[0] ;
         if ( AV111i_obs > 10 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV110Tab_obsf[AV111i_obs-1] = A649ObsForTxt ;
         AV111i_obs = (short)(AV111i_obs+1) ;
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S1410( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV117Maqdosifp = "" ;
      /* Using cursor P078C19 */
      pr_default.execute(15, new Object[] {A396EmprCod, AV47MaqCod});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A602MaqCod = P078C19_A602MaqCod[0] ;
         A5949MaqDosifP = P078C19_A5949MaqDosifP[0] ;
         n5949MaqDosifP = P078C19_n5949MaqDosifP[0] ;
         AV117Maqdosifp = A5949MaqDosifP ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S201( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV136Artnmtr = " " ;
      /* Using cursor P078C20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV33CliCod), AV37BarSer});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A65ArtCod = P078C20_A65ArtCod[0] ;
         A252CliCod = P078C20_A252CliCod[0] ;
         n252CliCod = P078C20_n252CliCod[0] ;
         A967ArtNMtr = P078C20_A967ArtNMtr[0] ;
         n967ArtNMtr = P078C20_n967ArtNMtr[0] ;
         AV136Artnmtr = A967ArtNMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   public void S211( ) throws ProcessInterruptedException
   {
      /* 'HLREOP' Routine */
      returnInSub = false ;
      AV123dsccausa = "" ;
      /* Using cursor P078C21 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A5085CodCausa = P078C21_A5085CodCausa[0] ;
         n5085CodCausa = P078C21_n5085CodCausa[0] ;
         A5061Hl_hdrp = P078C21_A5061Hl_hdrp[0] ;
         A5060Hl_hdrr = P078C21_A5060Hl_hdrr[0] ;
         A5059Hl_hdr = P078C21_A5059Hl_hdr[0] ;
         A5086DscCausa = P078C21_A5086DscCausa[0] ;
         n5086DscCausa = P078C21_n5086DscCausa[0] ;
         A5086DscCausa = P078C21_A5086DscCausa[0] ;
         n5086DscCausa = P078C21_n5086DscCausa[0] ;
         AV123dsccausa = GXutil.substring( A5086DscCausa, 1, 25) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   public void S221( ) throws ProcessInterruptedException
   {
      /* 'PROLIN' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV145Tab_of[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P078C22 */
      pr_default.execute(18, new Object[] {A396EmprCod, AV92ProCod, Short.valueOf(AV142pronumlin)});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A774ProNumLin = P078C22_A774ProNumLin[0] ;
         A758ProCod = P078C22_A758ProCod[0] ;
         A5735ProFasNot = P078C22_A5735ProFasNot[0] ;
         n5735ProFasNot = P078C22_n5735ProFasNot[0] ;
         AV143Nlin = (short)(GXutil.gxmlines( A5735ProFasNot, (short)(100))) ;
         AV144x = (short)(1) ;
         while ( AV144x <= AV143Nlin )
         {
            if ( AV144x > 4 )
            {
               if (true) break;
            }
            AV145Tab_of[AV144x-1] = GXutil.gxgetmli( A5735ProFasNot, AV144x, (short)(100)) ;
            AV144x = (short)(AV144x+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
   }

   public void S231( ) throws ProcessInterruptedException
   {
      /* 'BARPAR' Routine */
      returnInSub = false ;
      /* Using cursor P078C23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46BarCodPar, AV92ProCod, Short.valueOf(AV67BarOrdLin)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A1664ParFasCod = P078C23_A1664ParFasCod[0] ;
         A194BarOrdLin = P078C23_A194BarOrdLin[0] ;
         A758ProCod = P078C23_A758ProCod[0] ;
         A3693BarParTxt = P078C23_A3693BarParTxt[0] ;
         n3693BarParTxt = P078C23_n3693BarParTxt[0] ;
         AV143Nlin = (short)(GXutil.gxmlines( A3693BarParTxt, (short)(70))) ;
         AV91FASOBS = GXutil.gxgetmli( A3693BarParTxt, (short)(1), (short)(70)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
   }

   public void h78C0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 21, Gx_line+16, 52, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 64, Gx_line+16, 109, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 122, Gx_line+16, 162, Gx_line+33, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 27, Gx_line+49, 69, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV72BarFecGen, "99/99/99"), 78, Gx_line+49, 145, Gx_line+66, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV73BarHorReg, "99:99:99"), 154, Gx_line+49, 221, Gx_line+66, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 246, Gx_line+49, 289, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33CliCod), "ZZZZZ9")), 296, Gx_line+49, 346, Gx_line+66, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34CliNom, "")), 359, Gx_line+49, 548, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Remi. Cli.", ""), 565, Gx_line+49, 625, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124BarDisNum, "")), 627, Gx_line+49, 736, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 601, Gx_line+76, 633, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74BarColNom, "")), 646, Gx_line+76, 742, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(598, Gx_line+70, 779, Gx_line+100, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Ped. Int.", ""), 27, Gx_line+76, 98, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV98DisCod), "ZZZZZZZ9")), 114, Gx_line+76, 173, Gx_line+94, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observ.", ""), 27, Gx_line+126, 73, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Tab_obs[1-1], "")), 85, Gx_line+126, 461, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Tab_obs[2-1], "")), 85, Gx_line+146, 461, Gx_line+164, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Tab_obs[3-1], "")), 85, Gx_line+165, 461, Gx_line+183, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Prendas", ""), 223, Gx_line+76, 303, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37BarSer, "")), 310, Gx_line+76, 411, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Genero", ""), 423, Gx_line+76, 468, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156TipArtdsc, "")), 473, Gx_line+76, 568, Gx_line+94, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127BarLar, "")), 657, Gx_line+124, 721, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126Barmat, "")), 657, Gx_line+141, 758, Gx_line+159, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40BarPie), "ZZZZZ9")), 657, Gx_line+175, 690, Gx_line+192, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39BarKgm, "ZZZZZ9.99")), 657, Gx_line+192, 732, Gx_line+209, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso (Kgs)", ""), 577, Gx_line+192, 646, Gx_line+209, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 577, Gx_line+175, 634, Gx_line+192, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Precinto", ""), 577, Gx_line+141, 628, Gx_line+158, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Ens/Corte", ""), 577, Gx_line+124, 652, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(564, Gx_line+124, 787, Gx_line+212, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+46, 791, Gx_line+215, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 27, Gx_line+99, 78, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92ProCod, "")), 85, Gx_line+99, 194, Gx_line+117, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Marquilla", ""), 224, Gx_line+98, 279, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV154BarGirar, "")), 291, Gx_line+98, 417, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV157AlbrLoc, "")), 489, Gx_line+156, 553, Gx_line+174, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(469, Gx_line+124, 565, Gx_line+212, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "UBICACION", ""), 483, Gx_line+129, 557, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(22, Gx_line+124, 470, Gx_line+212, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("3 of 9 Barcode", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Hdrcdb, "")), 631, Gx_line+28, 747, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Hdr, "")), 647, Gx_line+4, 748, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.P.", ""), 615, Gx_line+6, 642, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(589, Gx_line+2, 788, Gx_line+45, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 113, Gx_line+16, 117, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Refer.:", ""), 577, Gx_line+157, 630, Gx_line+174, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV125Barenccli, "")), 657, Gx_line+157, 783, Gx_line+175, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+216) ;
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
      this.aP0[0] = rreclv6s.this.A396EmprCod;
      this.aP1[0] = rreclv6s.this.A129BarCod;
      this.aP2[0] = rreclv6s.this.A132BarCodReo;
      this.aP3[0] = rreclv6s.this.A130BarCodPar;
      this.aP4[0] = rreclv6s.this.AV58Grupo_l;
      this.aP5[0] = rreclv6s.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV153Lit10 = "" ;
      AV150Station = "" ;
      AV149Emprnom = "" ;
      AV148usurcod = "" ;
      AV69DisObstxt = "" ;
      scmdbuf = "" ;
      P078C2_A833TipDefCod = new short[1] ;
      P078C2_n833TipDefCod = new boolean[] {false} ;
      P078C2_A396EmprCod = new String[] {""} ;
      P078C2_A129BarCod = new int[1] ;
      P078C2_A132BarCodReo = new byte[1] ;
      P078C2_A130BarCodPar = new String[] {""} ;
      P078C2_A361DisCod = new int[1] ;
      P078C2_A2010BarTipDis = new String[] {""} ;
      P078C2_A4465BarAcaBak = new String[] {""} ;
      P078C2_n4465BarAcaBak = new boolean[] {false} ;
      P078C2_A3030BarPlf = new String[] {""} ;
      P078C2_A2454BarGirar = new String[] {""} ;
      P078C2_A148BarEstReo = new byte[1] ;
      P078C2_A834TipDefDsc = new String[] {""} ;
      P078C2_n834TipDefDsc = new boolean[] {false} ;
      P078C2_A252CliCod = new int[1] ;
      P078C2_n252CliCod = new boolean[] {false} ;
      P078C2_A212BarSer = new String[] {""} ;
      P078C2_A177BarLar = new String[] {""} ;
      P078C2_A182BarMat = new String[] {""} ;
      P078C2_A4812BarEncCli = new String[] {""} ;
      P078C2_A143BarDisNum = new String[] {""} ;
      P078C2_A135BarColNom = new String[] {""} ;
      P078C2_A136BarColNum = new int[1] ;
      P078C2_A218BarTipCol = new byte[1] ;
      P078C2_A217BarTipArt = new short[1] ;
      P078C2_n217BarTipArt = new boolean[] {false} ;
      A2010BarTipDis = "" ;
      A4465BarAcaBak = "" ;
      A3030BarPlf = "" ;
      A2454BarGirar = "" ;
      A834TipDefDsc = "" ;
      A212BarSer = "" ;
      A177BarLar = "" ;
      A182BarMat = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      AV46BarCodPar = "" ;
      AV119BarTipDis = "" ;
      AV116Texto_c = "" ;
      AV106Tipo_pzas = "" ;
      AV113Muestras = "" ;
      AV154BarGirar = "" ;
      P078C3_A44AlbRecCod = new int[1] ;
      P078C3_A4295ClasCod = new short[1] ;
      P078C3_n4295ClasCod = new boolean[] {false} ;
      P078C3_A396EmprCod = new String[] {""} ;
      P078C3_A129BarCod = new int[1] ;
      P078C3_A132BarCodReo = new byte[1] ;
      P078C3_A130BarCodPar = new String[] {""} ;
      P078C3_A200BarPieCod = new String[] {""} ;
      P078C3_A4296ClasDsc = new String[] {""} ;
      P078C3_n4296ClasDsc = new boolean[] {false} ;
      P078C3_A50AlbRLoc = new String[] {""} ;
      A200BarPieCod = "" ;
      A4296ClasDsc = "" ;
      A50AlbRLoc = "" ;
      AV157AlbrLoc = "" ;
      AV123dsccausa = "" ;
      AV11TipDefDsc = "" ;
      AV68v_Texto = "" ;
      AV37BarSer = "" ;
      AV127BarLar = "" ;
      AV126Barmat = "" ;
      AV125Barenccli = "" ;
      AV124BarDisNum = "" ;
      AV74BarColNom = "" ;
      AV152Color = "" ;
      AV156TipArtdsc = "" ;
      GXt_char3 = "" ;
      GXv_int1 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      AV115INTDSCF = "" ;
      AV104Tab_obs = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV104Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P078C4_A396EmprCod = new String[] {""} ;
      P078C4_A361DisCod = new int[1] ;
      P078C4_A377DisObsTxt = new String[] {""} ;
      P078C4_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV70ProDsc2 = "" ;
      P078C5_A396EmprCod = new String[] {""} ;
      P078C5_A129BarCod = new int[1] ;
      P078C5_A132BarCodReo = new byte[1] ;
      P078C5_A130BarCodPar = new String[] {""} ;
      P078C5_A758ProCod = new String[] {""} ;
      P078C5_A761ProFasLin = new short[1] ;
      P078C5_n761ProFasLin = new boolean[] {false} ;
      P078C5_A4628ProDsc2 = new String[] {""} ;
      A758ProCod = "" ;
      A4628ProDsc2 = "" ;
      AV71Fases_l = "" ;
      P078C6_A457FasCod = new String[] {""} ;
      P078C6_A396EmprCod = new String[] {""} ;
      P078C6_A129BarCod = new int[1] ;
      P078C6_A132BarCodReo = new byte[1] ;
      P078C6_A130BarCodPar = new String[] {""} ;
      P078C6_A758ProCod = new String[] {""} ;
      P078C6_A153BarFasEst = new byte[1] ;
      P078C6_A460FasDsc = new String[] {""} ;
      P078C6_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV137Articulo_t = "" ;
      AV136Artnmtr = "" ;
      P078C8_A396EmprCod = new String[] {""} ;
      P078C8_A129BarCod = new int[1] ;
      P078C8_A132BarCodReo = new byte[1] ;
      P078C8_A130BarCodPar = new String[] {""} ;
      P078C8_A4314BarFasBot1 = new String[] {""} ;
      P078C8_n4314BarFasBot1 = new boolean[] {false} ;
      P078C8_A457FasCod = new String[] {""} ;
      P078C8_A758ProCod = new String[] {""} ;
      P078C8_A7913BarfasUnpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C8_n7913BarfasUnpL = new boolean[] {false} ;
      P078C8_A6881FasUnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C8_n6881FasUnpLt = new boolean[] {false} ;
      P078C8_A4315BarNumBot1 = new int[1] ;
      P078C8_n4315BarNumBot1 = new boolean[] {false} ;
      P078C8_A4648BarFasRecu = new int[1] ;
      P078C8_n4648BarFasRecu = new boolean[] {false} ;
      P078C8_A135BarColNom = new String[] {""} ;
      P078C8_A1234BarNomCli = new String[] {""} ;
      P078C8_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P078C8_A150BarFacTin = new String[] {""} ;
      P078C8_A148BarEstReo = new byte[1] ;
      P078C8_A252CliCod = new int[1] ;
      P078C8_n252CliCod = new boolean[] {false} ;
      P078C8_A279CliNom = new String[] {""} ;
      P078C8_A4609BarMdlCod = new String[] {""} ;
      P078C8_A212BarSer = new String[] {""} ;
      P078C8_A1652BarSerDsc = new String[] {""} ;
      P078C8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P078C8_A4613BarHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P078C8_n4613BarHorReg = new boolean[] {false} ;
      P078C8_A603MaqCodBis = new String[] {""} ;
      P078C8_A4302BarMaqFas1 = new String[] {""} ;
      P078C8_n4302BarMaqFas1 = new boolean[] {false} ;
      P078C8_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C8_n4645BarFasKgs = new boolean[] {false} ;
      P078C8_A4644BarFasNPrd = new short[1] ;
      P078C8_n4644BarFasNPrd = new boolean[] {false} ;
      P078C8_A4287BarFasFor = new String[] {""} ;
      P078C8_A194BarOrdLin = new short[1] ;
      P078C8_A4643BarFasLot = new int[1] ;
      P078C8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C8_A199BarPie1 = new short[1] ;
      P078C8_A365DisDes = new String[] {""} ;
      P078C8_A898BarPieNDes = new int[1] ;
      A4314BarFasBot1 = "" ;
      A7913BarfasUnpL = DecimalUtil.ZERO ;
      A6881FasUnpLt = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A150BarFacTin = "" ;
      A279CliNom = "" ;
      A4609BarMdlCod = "" ;
      A1652BarSerDsc = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A4613BarHorReg = GXutil.resetTime( GXutil.nullDate() );
      A603MaqCodBis = "" ;
      A4302BarMaqFas1 = "" ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      A4287BarFasFor = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      GXv_int12 = new short[1] ;
      AV147BarfasUnpL = DecimalUtil.ZERO ;
      AV135FasUnPlt = DecimalUtil.ZERO ;
      AV92ProCod = "" ;
      AV91FASOBS = "" ;
      P078C9_A396EmprCod = new String[] {""} ;
      P078C9_A457FasCod = new String[] {""} ;
      P078C9_A465FasObs = new String[] {""} ;
      P078C9_A463FasNumLin = new byte[1] ;
      A465FasObs = "" ;
      AV82BarNomCli = "" ;
      AV141BarFecTeo = GXutil.nullDate() ;
      AV80BarFacTin = "" ;
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
      AV130fasDsc2 = "" ;
      AV131FasDsc_t = "" ;
      AV55Ceros8 = "" ;
      AV50BarCod_a = "" ;
      AV101Npda_a3 = "" ;
      AV56Orden_a = "" ;
      AV51Reo_a = "" ;
      AV9HdrPart = "" ;
      AV10HdrPda = "" ;
      AV41FasCod_cb = "" ;
      AV57FasCod_cb2 = "" ;
      AV83Hdr_pda1 = "" ;
      AV84Hdr_pda2 = "" ;
      AV122Hdrcdb = "" ;
      AV85Hdr_pda3 = "" ;
      AV86Hdr_pda4 = "" ;
      Gx_date = GXutil.nullDate() ;
      AV145Tab_of = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV145Tab_of[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV146Obs_f = "" ;
      P078C11_A396EmprCod = new String[] {""} ;
      P078C11_A2804RecLinMaq = new short[1] ;
      P078C11_A130BarCodPar = new String[] {""} ;
      P078C11_A132BarCodReo = new byte[1] ;
      P078C11_A129BarCod = new int[1] ;
      P078C11_A4268RecOrdLin = new short[1] ;
      P078C11_n4268RecOrdLin = new boolean[] {false} ;
      P078C11_A4654RecNroPar = new int[1] ;
      P078C11_n4654RecNroPar = new boolean[] {false} ;
      P078C11_A4258RecMaqFas = new String[] {""} ;
      P078C11_n4258RecMaqFas = new boolean[] {false} ;
      P078C11_A602MaqCod = new String[] {""} ;
      P078C11_A4402RecUsrCod = new String[] {""} ;
      P078C11_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P078C11_n4866RecFecAlt = new boolean[] {false} ;
      P078C11_A606MaqDsc = new String[] {""} ;
      P078C11_n606MaqDsc = new boolean[] {false} ;
      P078C11_A148BarEstReo = new byte[1] ;
      P078C11_A4273RecFagPrd = new int[1] ;
      P078C11_A4261RecTotPrd = new int[1] ;
      P078C11_n4261RecTotPrd = new boolean[] {false} ;
      P078C11_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C11_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4258RecMaqFas = "" ;
      A602MaqCod = "" ;
      A4402RecUsrCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A606MaqDsc = "" ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      AV103Nactx_3a = "" ;
      P078C12_A396EmprCod = new String[] {""} ;
      P078C12_A129BarCod = new int[1] ;
      P078C12_A132BarCodReo = new byte[1] ;
      P078C12_A130BarCodPar = new String[] {""} ;
      P078C12_A2804RecLinMaq = new short[1] ;
      P078C12_A4695RecVolPrf = new int[1] ;
      P078C12_A1273RecLinPro = new byte[1] ;
      P078C12_A4696RecTiempo = new short[1] ;
      P078C12_n4696RecTiempo = new boolean[] {false} ;
      P078C12_A771ProForTie = new short[1] ;
      P078C12_A7228RecTemp = new short[1] ;
      P078C12_n7228RecTemp = new boolean[] {false} ;
      P078C12_A772ProForTmx = new short[1] ;
      P078C12_A7230RecPhMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C12_n7230RecPhMn = new boolean[] {false} ;
      P078C12_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C12_n6877ProForPhn = new boolean[] {false} ;
      P078C12_A7229RecPhMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C12_n7229RecPhMx = new boolean[] {false} ;
      P078C12_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C12_n6876ProForPhx = new boolean[] {false} ;
      P078C12_A4697RecNroPrg = new int[1] ;
      P078C12_A764ProForCod = new String[] {""} ;
      P078C12_A766ProForDsc = new String[] {""} ;
      P078C12_A6018ProForFab = new String[] {""} ;
      P078C12_n6018ProForFab = new boolean[] {false} ;
      P078C12_A4706ProForRb = new short[1] ;
      P078C12_A7257RecRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C12_n7257RecRb = new boolean[] {false} ;
      P078C12_A5523ProForTip = new String[] {""} ;
      A7230RecPhMn = DecimalUtil.ZERO ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      A7229RecPhMx = DecimalUtil.ZERO ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A6018ProForFab = "" ;
      A7257RecRb = DecimalUtil.ZERO ;
      A5523ProForTip = "" ;
      AV139Proforphn = DecimalUtil.ZERO ;
      AV140Proforphx = DecimalUtil.ZERO ;
      AV19ProForCod = "" ;
      AV121Profordsc = "" ;
      AV132Proforfab = "" ;
      AV16vRb = DecimalUtil.ZERO ;
      P078C13_A719PrdNum = new String[] {""} ;
      P078C13_n719PrdNum = new boolean[] {false} ;
      P078C13_A396EmprCod = new String[] {""} ;
      P078C13_A129BarCod = new int[1] ;
      P078C13_A132BarCodReo = new byte[1] ;
      P078C13_A130BarCodPar = new String[] {""} ;
      P078C13_A2804RecLinMaq = new short[1] ;
      P078C13_A1273RecLinPro = new byte[1] ;
      P078C13_A872RecPrdNum = new String[] {""} ;
      P078C13_A4338PrdUMeFo = new byte[1] ;
      P078C13_A490ForPrdUMe = new byte[1] ;
      P078C13_n490ForPrdUMe = new boolean[] {false} ;
      P078C13_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C13_A2394RecForNro = new byte[1] ;
      P078C13_A875RecPrdDsc = new String[] {""} ;
      P078C13_A743PrdUniCon = new byte[1] ;
      P078C13_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C13_A5422RecSalMP = new short[1] ;
      P078C13_A5467RecSalVol = new int[1] ;
      P078C13_A4692PrdNom2 = new String[] {""} ;
      P078C13_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C13_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C13_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A872RecPrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A4692PrdNom2 = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV114PrdNumi = "" ;
      AV129Quant_aux = DecimalUtil.ZERO ;
      AV31var2 = "" ;
      AV25Var1 = "" ;
      AV26RecForNro = "" ;
      AV24PrdDsc = "" ;
      AV32CodPrd = "" ;
      AV28Unidades = "" ;
      AV27Cantidad = DecimalUtil.ZERO ;
      AV88Cant_Unid = "" ;
      AV89RecSalmp = "" ;
      AV90RecSalVol = "" ;
      AV30Coste = DecimalUtil.ZERO ;
      AV109PROFORTIP = "" ;
      P078C14_A833TipDefCod = new short[1] ;
      P078C14_n833TipDefCod = new boolean[] {false} ;
      P078C14_A396EmprCod = new String[] {""} ;
      P078C14_A4667HisLavCon = new int[1] ;
      P078C14_A4665HisLavOrd = new short[1] ;
      P078C14_A4664HisLavNpd = new int[1] ;
      P078C14_A4663HisLavPar = new String[] {""} ;
      P078C14_A4662HisLavReo = new byte[1] ;
      P078C14_A4661HisLavCod = new int[1] ;
      P078C14_A834TipDefDsc = new String[] {""} ;
      P078C14_n834TipDefDsc = new boolean[] {false} ;
      A4663HisLavPar = "" ;
      P078C15_A396EmprCod = new String[] {""} ;
      P078C15_A5061Hl_hdrp = new String[] {""} ;
      P078C15_A5060Hl_hdrr = new byte[1] ;
      P078C15_A5059Hl_hdr = new int[1] ;
      P078C15_A5067Hl_hdr_o = new int[1] ;
      P078C15_A5068Hl_hdrr_o = new byte[1] ;
      P078C15_A5069Hl_hdrp_o = new String[] {""} ;
      P078C15_A5071Hl_pzs_o = new short[1] ;
      P078C15_n5071Hl_pzs_o = new boolean[] {false} ;
      P078C15_A5070Hl_kgs_o = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C15_n5070Hl_kgs_o = new boolean[] {false} ;
      A5061Hl_hdrp = "" ;
      A5069Hl_hdrp_o = "" ;
      A5070Hl_kgs_o = DecimalUtil.ZERO ;
      AV94CliNom_a = "" ;
      AV95BarSer_a = "" ;
      AV96ColNom_a = "" ;
      P078C16_A396EmprCod = new String[] {""} ;
      P078C16_A4643BarFasLot = new int[1] ;
      P078C16_A194BarOrdLin = new short[1] ;
      P078C16_A758ProCod = new String[] {""} ;
      P078C16_A130BarCodPar = new String[] {""} ;
      P078C16_A132BarCodReo = new byte[1] ;
      P078C16_A129BarCod = new int[1] ;
      P078C16_A5954Ap_Barcod = new int[1] ;
      P078C16_A5955Ap_BarReo = new byte[1] ;
      P078C16_A5956Ap_BarPar = new String[] {""} ;
      P078C16_A5960Ap_Piezas = new short[1] ;
      P078C16_n5960Ap_Piezas = new boolean[] {false} ;
      P078C16_A5959Ap_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C16_n5959Ap_Kilos = new boolean[] {false} ;
      P078C16_A5957Ap_ProCod = new String[] {""} ;
      P078C16_A5958Ap_BarOrd = new short[1] ;
      A5956Ap_BarPar = "" ;
      A5959Ap_Kilos = DecimalUtil.ZERO ;
      A5957Ap_ProCod = "" ;
      P078C17_A194BarOrdLin = new short[1] ;
      P078C17_A758ProCod = new String[] {""} ;
      P078C17_A130BarCodPar = new String[] {""} ;
      P078C17_A132BarCodReo = new byte[1] ;
      P078C17_A129BarCod = new int[1] ;
      P078C17_A396EmprCod = new String[] {""} ;
      P078C17_A4940A_Barcod = new int[1] ;
      P078C17_A4941A_BarReo = new byte[1] ;
      P078C17_A4942A_BarPar = new String[] {""} ;
      P078C17_A4947A_Piezas = new short[1] ;
      P078C17_n4947A_Piezas = new boolean[] {false} ;
      P078C17_A4946A_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078C17_n4946A_Kilos = new boolean[] {false} ;
      P078C17_A4943A_ProCod = new String[] {""} ;
      P078C17_A4944A_BarOrd = new short[1] ;
      A4942A_BarPar = "" ;
      A4946A_Kilos = DecimalUtil.ZERO ;
      A4943A_ProCod = "" ;
      GXv_char13 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new int[1] ;
      AV110Tab_obsf = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV110Tab_obsf[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P078C18_A396EmprCod = new String[] {""} ;
      P078C18_A831TipColCod = new byte[1] ;
      P078C18_A483ForColNum = new int[1] ;
      P078C18_A482ForColNom = new String[] {""} ;
      P078C18_A494ForSer = new String[] {""} ;
      P078C18_A252CliCod = new int[1] ;
      P078C18_n252CliCod = new boolean[] {false} ;
      P078C18_A649ObsForTxt = new String[] {""} ;
      P078C18_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A649ObsForTxt = "" ;
      AV117Maqdosifp = "" ;
      P078C19_A396EmprCod = new String[] {""} ;
      P078C19_A602MaqCod = new String[] {""} ;
      P078C19_A5949MaqDosifP = new String[] {""} ;
      P078C19_n5949MaqDosifP = new boolean[] {false} ;
      A5949MaqDosifP = "" ;
      P078C20_A396EmprCod = new String[] {""} ;
      P078C20_A65ArtCod = new String[] {""} ;
      P078C20_A252CliCod = new int[1] ;
      P078C20_n252CliCod = new boolean[] {false} ;
      P078C20_A967ArtNMtr = new String[] {""} ;
      P078C20_n967ArtNMtr = new boolean[] {false} ;
      A65ArtCod = "" ;
      A967ArtNMtr = "" ;
      P078C21_A5085CodCausa = new short[1] ;
      P078C21_n5085CodCausa = new boolean[] {false} ;
      P078C21_A396EmprCod = new String[] {""} ;
      P078C21_A5061Hl_hdrp = new String[] {""} ;
      P078C21_A5060Hl_hdrr = new byte[1] ;
      P078C21_A5059Hl_hdr = new int[1] ;
      P078C21_A5086DscCausa = new String[] {""} ;
      P078C21_n5086DscCausa = new boolean[] {false} ;
      A5086DscCausa = "" ;
      P078C22_A396EmprCod = new String[] {""} ;
      P078C22_A774ProNumLin = new short[1] ;
      P078C22_A758ProCod = new String[] {""} ;
      P078C22_A5735ProFasNot = new String[] {""} ;
      P078C22_n5735ProFasNot = new boolean[] {false} ;
      A5735ProFasNot = "" ;
      P078C23_A396EmprCod = new String[] {""} ;
      P078C23_A1664ParFasCod = new short[1] ;
      P078C23_A194BarOrdLin = new short[1] ;
      P078C23_A758ProCod = new String[] {""} ;
      P078C23_A130BarCodPar = new String[] {""} ;
      P078C23_A132BarCodReo = new byte[1] ;
      P078C23_A129BarCod = new int[1] ;
      P078C23_A3693BarParTxt = new String[] {""} ;
      P078C23_n3693BarParTxt = new boolean[] {false} ;
      A3693BarParTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rreclv6s__default(),
         new Object[] {
             new Object[] {
            P078C2_A833TipDefCod, P078C2_n833TipDefCod, P078C2_A396EmprCod, P078C2_A129BarCod, P078C2_A132BarCodReo, P078C2_A130BarCodPar, P078C2_A361DisCod, P078C2_A2010BarTipDis, P078C2_A4465BarAcaBak, P078C2_n4465BarAcaBak,
            P078C2_A3030BarPlf, P078C2_A2454BarGirar, P078C2_A148BarEstReo, P078C2_A834TipDefDsc, P078C2_n834TipDefDsc, P078C2_A252CliCod, P078C2_n252CliCod, P078C2_A212BarSer, P078C2_A177BarLar, P078C2_A182BarMat,
            P078C2_A4812BarEncCli, P078C2_A143BarDisNum, P078C2_A135BarColNom, P078C2_A136BarColNum, P078C2_A218BarTipCol, P078C2_A217BarTipArt, P078C2_n217BarTipArt
            }
            , new Object[] {
            P078C3_A44AlbRecCod, P078C3_A4295ClasCod, P078C3_n4295ClasCod, P078C3_A396EmprCod, P078C3_A129BarCod, P078C3_A132BarCodReo, P078C3_A130BarCodPar, P078C3_A200BarPieCod, P078C3_A4296ClasDsc, P078C3_n4296ClasDsc,
            P078C3_A50AlbRLoc
            }
            , new Object[] {
            P078C4_A396EmprCod, P078C4_A361DisCod, P078C4_A377DisObsTxt, P078C4_A376DisObsLin
            }
            , new Object[] {
            P078C5_A396EmprCod, P078C5_A129BarCod, P078C5_A132BarCodReo, P078C5_A130BarCodPar, P078C5_A758ProCod, P078C5_A761ProFasLin, P078C5_n761ProFasLin, P078C5_A4628ProDsc2
            }
            , new Object[] {
            P078C6_A457FasCod, P078C6_A396EmprCod, P078C6_A129BarCod, P078C6_A132BarCodReo, P078C6_A130BarCodPar, P078C6_A758ProCod, P078C6_A153BarFasEst, P078C6_A460FasDsc, P078C6_A194BarOrdLin
            }
            , new Object[] {
            P078C8_A396EmprCod, P078C8_A129BarCod, P078C8_A132BarCodReo, P078C8_A130BarCodPar, P078C8_A4314BarFasBot1, P078C8_n4314BarFasBot1, P078C8_A457FasCod, P078C8_A758ProCod, P078C8_A7913BarfasUnpL, P078C8_n7913BarfasUnpL,
            P078C8_A6881FasUnpLt, P078C8_n6881FasUnpLt, P078C8_A4315BarNumBot1, P078C8_n4315BarNumBot1, P078C8_A4648BarFasRecu, P078C8_n4648BarFasRecu, P078C8_A135BarColNom, P078C8_A1234BarNomCli, P078C8_A162BarFecTeo, P078C8_A150BarFacTin,
            P078C8_A148BarEstReo, P078C8_A252CliCod, P078C8_n252CliCod, P078C8_A279CliNom, P078C8_A4609BarMdlCod, P078C8_A212BarSer, P078C8_A1652BarSerDsc, P078C8_A159BarFecGen, P078C8_A4613BarHorReg, P078C8_n4613BarHorReg,
            P078C8_A603MaqCodBis, P078C8_A4302BarMaqFas1, P078C8_n4302BarMaqFas1, P078C8_A4645BarFasKgs, P078C8_n4645BarFasKgs, P078C8_A4644BarFasNPrd, P078C8_n4644BarFasNPrd, P078C8_A4287BarFasFor, P078C8_A194BarOrdLin, P078C8_A4643BarFasLot,
            P078C8_A166BarKgm, P078C8_A199BarPie1, P078C8_A365DisDes, P078C8_A898BarPieNDes
            }
            , new Object[] {
            P078C9_A396EmprCod, P078C9_A457FasCod, P078C9_A465FasObs, P078C9_A463FasNumLin
            }
            , new Object[] {
            P078C11_A396EmprCod, P078C11_A2804RecLinMaq, P078C11_A130BarCodPar, P078C11_A132BarCodReo, P078C11_A129BarCod, P078C11_A4268RecOrdLin, P078C11_n4268RecOrdLin, P078C11_A4654RecNroPar, P078C11_n4654RecNroPar, P078C11_A4258RecMaqFas,
            P078C11_n4258RecMaqFas, P078C11_A602MaqCod, P078C11_A4402RecUsrCod, P078C11_A4866RecFecAlt, P078C11_n4866RecFecAlt, P078C11_A606MaqDsc, P078C11_n606MaqDsc, P078C11_A148BarEstReo, P078C11_A4273RecFagPrd, P078C11_A4261RecTotPrd,
            P078C11_n4261RecTotPrd, P078C11_A4271RecFagKgs, P078C11_A4259RecTotKgs
            }
            , new Object[] {
            P078C12_A396EmprCod, P078C12_A129BarCod, P078C12_A132BarCodReo, P078C12_A130BarCodPar, P078C12_A2804RecLinMaq, P078C12_A4695RecVolPrf, P078C12_A1273RecLinPro, P078C12_A4696RecTiempo, P078C12_n4696RecTiempo, P078C12_A771ProForTie,
            P078C12_A7228RecTemp, P078C12_n7228RecTemp, P078C12_A772ProForTmx, P078C12_A7230RecPhMn, P078C12_n7230RecPhMn, P078C12_A6877ProForPhn, P078C12_n6877ProForPhn, P078C12_A7229RecPhMx, P078C12_n7229RecPhMx, P078C12_A6876ProForPhx,
            P078C12_n6876ProForPhx, P078C12_A4697RecNroPrg, P078C12_A764ProForCod, P078C12_A766ProForDsc, P078C12_A6018ProForFab, P078C12_n6018ProForFab, P078C12_A4706ProForRb, P078C12_A7257RecRb, P078C12_n7257RecRb, P078C12_A5523ProForTip
            }
            , new Object[] {
            P078C13_A719PrdNum, P078C13_n719PrdNum, P078C13_A396EmprCod, P078C13_A129BarCod, P078C13_A132BarCodReo, P078C13_A130BarCodPar, P078C13_A2804RecLinMaq, P078C13_A1273RecLinPro, P078C13_A872RecPrdNum, P078C13_A4338PrdUMeFo,
            P078C13_A490ForPrdUMe, P078C13_n490ForPrdUMe, P078C13_A431FacCon, P078C13_A2394RecForNro, P078C13_A875RecPrdDsc, P078C13_A743PrdUniCon, P078C13_A686PrdCant, P078C13_A5422RecSalMP, P078C13_A5467RecSalVol, P078C13_A4692PrdNom2,
            P078C13_A707PrdFacCon, P078C13_A724PrdPreAct, P078C13_A811RecLin
            }
            , new Object[] {
            P078C14_A833TipDefCod, P078C14_n833TipDefCod, P078C14_A396EmprCod, P078C14_A4667HisLavCon, P078C14_A4665HisLavOrd, P078C14_A4664HisLavNpd, P078C14_A4663HisLavPar, P078C14_A4662HisLavReo, P078C14_A4661HisLavCod, P078C14_A834TipDefDsc,
            P078C14_n834TipDefDsc
            }
            , new Object[] {
            P078C15_A396EmprCod, P078C15_A5061Hl_hdrp, P078C15_A5060Hl_hdrr, P078C15_A5059Hl_hdr, P078C15_A5067Hl_hdr_o, P078C15_A5068Hl_hdrr_o, P078C15_A5069Hl_hdrp_o, P078C15_A5071Hl_pzs_o, P078C15_n5071Hl_pzs_o, P078C15_A5070Hl_kgs_o,
            P078C15_n5070Hl_kgs_o
            }
            , new Object[] {
            P078C16_A396EmprCod, P078C16_A4643BarFasLot, P078C16_A194BarOrdLin, P078C16_A758ProCod, P078C16_A130BarCodPar, P078C16_A132BarCodReo, P078C16_A129BarCod, P078C16_A5954Ap_Barcod, P078C16_A5955Ap_BarReo, P078C16_A5956Ap_BarPar,
            P078C16_A5960Ap_Piezas, P078C16_n5960Ap_Piezas, P078C16_A5959Ap_Kilos, P078C16_n5959Ap_Kilos, P078C16_A5957Ap_ProCod, P078C16_A5958Ap_BarOrd
            }
            , new Object[] {
            P078C17_A194BarOrdLin, P078C17_A758ProCod, P078C17_A130BarCodPar, P078C17_A132BarCodReo, P078C17_A129BarCod, P078C17_A396EmprCod, P078C17_A4940A_Barcod, P078C17_A4941A_BarReo, P078C17_A4942A_BarPar, P078C17_A4947A_Piezas,
            P078C17_n4947A_Piezas, P078C17_A4946A_Kilos, P078C17_n4946A_Kilos, P078C17_A4943A_ProCod, P078C17_A4944A_BarOrd
            }
            , new Object[] {
            P078C18_A396EmprCod, P078C18_A831TipColCod, P078C18_A483ForColNum, P078C18_A482ForColNom, P078C18_A494ForSer, P078C18_A252CliCod, P078C18_A649ObsForTxt, P078C18_A650ObsLin
            }
            , new Object[] {
            P078C19_A396EmprCod, P078C19_A602MaqCod, P078C19_A5949MaqDosifP, P078C19_n5949MaqDosifP
            }
            , new Object[] {
            P078C20_A396EmprCod, P078C20_A65ArtCod, P078C20_A252CliCod, P078C20_A967ArtNMtr, P078C20_n967ArtNMtr
            }
            , new Object[] {
            P078C21_A5085CodCausa, P078C21_n5085CodCausa, P078C21_A396EmprCod, P078C21_A5061Hl_hdrp, P078C21_A5060Hl_hdrr, P078C21_A5059Hl_hdr, P078C21_A5086DscCausa, P078C21_n5086DscCausa
            }
            , new Object[] {
            P078C22_A396EmprCod, P078C22_A774ProNumLin, P078C22_A758ProCod, P078C22_A5735ProFasNot, P078C22_n5735ProFasNot
            }
            , new Object[] {
            P078C23_A396EmprCod, P078C23_A1664ParFasCod, P078C23_A194BarOrdLin, P078C23_A758ProCod, P078C23_A130BarCodPar, P078C23_A132BarCodReo, P078C23_A129BarCod, P078C23_A3693BarParTxt, P078C23_n3693BarParTxt
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
   private byte AV29FlagImp ;
   private byte AV120Ibatex ;
   private byte AV151Pack ;
   private byte AV155Eliot ;
   private byte GXt_int2 ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte AV45BarCodReo ;
   private byte AV76BarTipCol ;
   private byte GXv_int1[] ;
   private byte AV77ForCon ;
   private byte GXv_int9[] ;
   private byte AV78F_okcolor ;
   private byte AV105i ;
   private byte AV107F_obs ;
   private byte A376DisObsLin ;
   private byte A153BarFasEst ;
   private byte A463FasNumLin ;
   private byte AV81C_cab_p ;
   private byte AV118Ctrl_m ;
   private byte A1273RecLinPro ;
   private byte A4338PrdUMeFo ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A743PrdUniCon ;
   private byte AV133PrdUmefo ;
   private byte A4662HisLavReo ;
   private byte AV93F_vez ;
   private byte A5060Hl_hdrr ;
   private byte A5068Hl_hdrr_o ;
   private byte A5955Ap_BarReo ;
   private byte A4941A_BarReo ;
   private byte GXv_int10[] ;
   private byte A831TipColCod ;
   private short A833TipDefCod ;
   private short A217BarTipArt ;
   private short A4295ClasCod ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A4644BarFasNPrd ;
   private short A199BarPie1 ;
   private short GXv_int12[] ;
   private short AV142pronumlin ;
   private short AV67BarOrdLin ;
   private short AV43RecOrdLin ;
   private short AV52LenVar ;
   private short AV100Npda_3 ;
   private short AV144x ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV102Nactx_3 ;
   private short A4696RecTiempo ;
   private short A771ProForTie ;
   private short A7228RecTemp ;
   private short A772ProForTmx ;
   private short A4706ProForRb ;
   private short AV14ProForTie ;
   private short AV138Profortmx ;
   private short A5422RecSalMP ;
   private short A811RecLin ;
   private short A4665HisLavOrd ;
   private short A5071Hl_pzs_o ;
   private short A5960Ap_Piezas ;
   private short A5958Ap_BarOrd ;
   private short A4947A_Piezas ;
   private short A4944A_BarOrd ;
   private short AV111i_obs ;
   private short A650ObsLin ;
   private short A5085CodCausa ;
   private short A774ProNumLin ;
   private short AV143Nlin ;
   private short A1664ParFasCod ;
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
   private int AV44BarCod ;
   private int A44AlbRecCod ;
   private int AV33CliCod ;
   private int AV75BarColNum ;
   private int AV98DisCod ;
   private int GX_I ;
   private int AV13Last_NumPd ;
   private int A4315BarNumBot1 ;
   private int A4648BarFasRecu ;
   private int A4643BarFasLot ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV64Total_pdas ;
   private int Gx_OldLine ;
   private int AV99Num_remon ;
   private int AV65BarFasRecu ;
   private int AV66BarFasLot ;
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
   private int AV97CliCod_a ;
   private int AV108Discod_a ;
   private int A5954Ap_Barcod ;
   private int A4940A_Barcod ;
   private int GXv_int15[] ;
   private int GXv_int14[] ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private int A483ForColNum ;
   private java.math.BigDecimal A7913BarfasUnpL ;
   private java.math.BigDecimal A6881FasUnpLt ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV147BarfasUnpL ;
   private java.math.BigDecimal AV135FasUnPlt ;
   private java.math.BigDecimal AV39BarKgm ;
   private java.math.BigDecimal AV17RecMaqKgs ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private java.math.BigDecimal A7230RecPhMn ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A7229RecPhMx ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A7257RecRb ;
   private java.math.BigDecimal AV139Proforphn ;
   private java.math.BigDecimal AV140Proforphx ;
   private java.math.BigDecimal AV16vRb ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV129Quant_aux ;
   private java.math.BigDecimal AV27Cantidad ;
   private java.math.BigDecimal AV30Coste ;
   private java.math.BigDecimal A5070Hl_kgs_o ;
   private java.math.BigDecimal A5959Ap_Kilos ;
   private java.math.BigDecimal A4946A_Kilos ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV58Grupo_l ;
   private String Gx_out ;
   private String AV153Lit10 ;
   private String AV150Station ;
   private String AV149Emprnom ;
   private String AV148usurcod ;
   private String AV69DisObstxt ;
   private String scmdbuf ;
   private String A2010BarTipDis ;
   private String A4465BarAcaBak ;
   private String A3030BarPlf ;
   private String A2454BarGirar ;
   private String A834TipDefDsc ;
   private String A212BarSer ;
   private String A177BarLar ;
   private String A182BarMat ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String AV46BarCodPar ;
   private String AV119BarTipDis ;
   private String AV116Texto_c ;
   private String AV106Tipo_pzas ;
   private String AV113Muestras ;
   private String AV154BarGirar ;
   private String A200BarPieCod ;
   private String A4296ClasDsc ;
   private String A50AlbRLoc ;
   private String AV157AlbrLoc ;
   private String AV123dsccausa ;
   private String AV11TipDefDsc ;
   private String AV68v_Texto ;
   private String AV37BarSer ;
   private String AV127BarLar ;
   private String AV126Barmat ;
   private String AV125Barenccli ;
   private String AV124BarDisNum ;
   private String AV74BarColNom ;
   private String AV152Color ;
   private String AV156TipArtdsc ;
   private String GXt_char3 ;
   private String AV115INTDSCF ;
   private String AV104Tab_obs[] ;
   private String A377DisObsTxt ;
   private String AV70ProDsc2 ;
   private String A758ProCod ;
   private String A4628ProDsc2 ;
   private String AV71Fases_l ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV137Articulo_t ;
   private String AV136Artnmtr ;
   private String A4314BarFasBot1 ;
   private String A1234BarNomCli ;
   private String A150BarFacTin ;
   private String A279CliNom ;
   private String A4609BarMdlCod ;
   private String A1652BarSerDsc ;
   private String A603MaqCodBis ;
   private String A4302BarMaqFas1 ;
   private String A4287BarFasFor ;
   private String A365DisDes ;
   private String AV92ProCod ;
   private String AV91FASOBS ;
   private String A465FasObs ;
   private String AV82BarNomCli ;
   private String AV80BarFacTin ;
   private String AV8Hdr ;
   private String AV63EmprCod ;
   private String AV34CliNom ;
   private String AV35BarMdlCod ;
   private String AV38BarSerDsc ;
   private String AV47MaqCod ;
   private String AV48MaqDsc ;
   private String AV18FasCod ;
   private String AV22FasDsc ;
   private String AV130fasDsc2 ;
   private String AV131FasDsc_t ;
   private String AV55Ceros8 ;
   private String AV50BarCod_a ;
   private String AV101Npda_a3 ;
   private String AV56Orden_a ;
   private String AV51Reo_a ;
   private String AV9HdrPart ;
   private String AV10HdrPda ;
   private String AV41FasCod_cb ;
   private String AV57FasCod_cb2 ;
   private String AV83Hdr_pda1 ;
   private String AV84Hdr_pda2 ;
   private String AV122Hdrcdb ;
   private String AV85Hdr_pda3 ;
   private String AV86Hdr_pda4 ;
   private String AV145Tab_of[] ;
   private String AV146Obs_f ;
   private String A4258RecMaqFas ;
   private String A602MaqCod ;
   private String A4402RecUsrCod ;
   private String A606MaqDsc ;
   private String AV103Nactx_3a ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A6018ProForFab ;
   private String A5523ProForTip ;
   private String AV19ProForCod ;
   private String AV121Profordsc ;
   private String AV132Proforfab ;
   private String A719PrdNum ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A4692PrdNom2 ;
   private String AV114PrdNumi ;
   private String AV31var2 ;
   private String AV25Var1 ;
   private String AV26RecForNro ;
   private String AV24PrdDsc ;
   private String AV32CodPrd ;
   private String AV28Unidades ;
   private String AV88Cant_Unid ;
   private String AV89RecSalmp ;
   private String AV90RecSalVol ;
   private String AV109PROFORTIP ;
   private String A4663HisLavPar ;
   private String A5061Hl_hdrp ;
   private String A5069Hl_hdrp_o ;
   private String AV94CliNom_a ;
   private String AV95BarSer_a ;
   private String AV96ColNom_a ;
   private String A5956Ap_BarPar ;
   private String A5957Ap_ProCod ;
   private String A4942A_BarPar ;
   private String A4943A_ProCod ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV110Tab_obsf[] ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A649ObsForTxt ;
   private String AV117Maqdosifp ;
   private String A5949MaqDosifP ;
   private String A65ArtCod ;
   private String A967ArtNMtr ;
   private String A5086DscCausa ;
   private java.util.Date A4613BarHorReg ;
   private java.util.Date AV73BarHorReg ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV141BarFecTeo ;
   private java.util.Date AV72BarFecGen ;
   private java.util.Date Gx_date ;
   private boolean n833TipDefCod ;
   private boolean n4465BarAcaBak ;
   private boolean n834TipDefDsc ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n4314BarFasBot1 ;
   private boolean n7913BarfasUnpL ;
   private boolean n6881FasUnpLt ;
   private boolean n4315BarNumBot1 ;
   private boolean n4648BarFasRecu ;
   private boolean n4613BarHorReg ;
   private boolean n4302BarMaqFas1 ;
   private boolean n4645BarFasKgs ;
   private boolean n4644BarFasNPrd ;
   private boolean n4268RecOrdLin ;
   private boolean n4654RecNroPar ;
   private boolean n4258RecMaqFas ;
   private boolean n4866RecFecAlt ;
   private boolean n606MaqDsc ;
   private boolean n4261RecTotPrd ;
   private boolean n4696RecTiempo ;
   private boolean n7228RecTemp ;
   private boolean n7230RecPhMn ;
   private boolean n6877ProForPhn ;
   private boolean n7229RecPhMx ;
   private boolean n6876ProForPhx ;
   private boolean n6018ProForFab ;
   private boolean n7257RecRb ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n5071Hl_pzs_o ;
   private boolean n5070Hl_kgs_o ;
   private boolean n5960Ap_Piezas ;
   private boolean n5959Ap_Kilos ;
   private boolean n4947A_Piezas ;
   private boolean n4946A_Kilos ;
   private boolean n5949MaqDosifP ;
   private boolean n967ArtNMtr ;
   private boolean n5085CodCausa ;
   private boolean n5086DscCausa ;
   private boolean n5735ProFasNot ;
   private boolean n3693BarParTxt ;
   private String A5735ProFasNot ;
   private String A3693BarParTxt ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P078C2_A833TipDefCod ;
   private boolean[] P078C2_n833TipDefCod ;
   private String[] P078C2_A396EmprCod ;
   private int[] P078C2_A129BarCod ;
   private byte[] P078C2_A132BarCodReo ;
   private String[] P078C2_A130BarCodPar ;
   private int[] P078C2_A361DisCod ;
   private String[] P078C2_A2010BarTipDis ;
   private String[] P078C2_A4465BarAcaBak ;
   private boolean[] P078C2_n4465BarAcaBak ;
   private String[] P078C2_A3030BarPlf ;
   private String[] P078C2_A2454BarGirar ;
   private byte[] P078C2_A148BarEstReo ;
   private String[] P078C2_A834TipDefDsc ;
   private boolean[] P078C2_n834TipDefDsc ;
   private int[] P078C2_A252CliCod ;
   private boolean[] P078C2_n252CliCod ;
   private String[] P078C2_A212BarSer ;
   private String[] P078C2_A177BarLar ;
   private String[] P078C2_A182BarMat ;
   private String[] P078C2_A4812BarEncCli ;
   private String[] P078C2_A143BarDisNum ;
   private String[] P078C2_A135BarColNom ;
   private int[] P078C2_A136BarColNum ;
   private byte[] P078C2_A218BarTipCol ;
   private short[] P078C2_A217BarTipArt ;
   private boolean[] P078C2_n217BarTipArt ;
   private int[] P078C3_A44AlbRecCod ;
   private short[] P078C3_A4295ClasCod ;
   private boolean[] P078C3_n4295ClasCod ;
   private String[] P078C3_A396EmprCod ;
   private int[] P078C3_A129BarCod ;
   private byte[] P078C3_A132BarCodReo ;
   private String[] P078C3_A130BarCodPar ;
   private String[] P078C3_A200BarPieCod ;
   private String[] P078C3_A4296ClasDsc ;
   private boolean[] P078C3_n4296ClasDsc ;
   private String[] P078C3_A50AlbRLoc ;
   private String[] P078C4_A396EmprCod ;
   private int[] P078C4_A361DisCod ;
   private String[] P078C4_A377DisObsTxt ;
   private byte[] P078C4_A376DisObsLin ;
   private String[] P078C5_A396EmprCod ;
   private int[] P078C5_A129BarCod ;
   private byte[] P078C5_A132BarCodReo ;
   private String[] P078C5_A130BarCodPar ;
   private String[] P078C5_A758ProCod ;
   private short[] P078C5_A761ProFasLin ;
   private boolean[] P078C5_n761ProFasLin ;
   private String[] P078C5_A4628ProDsc2 ;
   private String[] P078C6_A457FasCod ;
   private String[] P078C6_A396EmprCod ;
   private int[] P078C6_A129BarCod ;
   private byte[] P078C6_A132BarCodReo ;
   private String[] P078C6_A130BarCodPar ;
   private String[] P078C6_A758ProCod ;
   private byte[] P078C6_A153BarFasEst ;
   private String[] P078C6_A460FasDsc ;
   private short[] P078C6_A194BarOrdLin ;
   private String[] P078C8_A396EmprCod ;
   private int[] P078C8_A129BarCod ;
   private byte[] P078C8_A132BarCodReo ;
   private String[] P078C8_A130BarCodPar ;
   private String[] P078C8_A4314BarFasBot1 ;
   private boolean[] P078C8_n4314BarFasBot1 ;
   private String[] P078C8_A457FasCod ;
   private String[] P078C8_A758ProCod ;
   private java.math.BigDecimal[] P078C8_A7913BarfasUnpL ;
   private boolean[] P078C8_n7913BarfasUnpL ;
   private java.math.BigDecimal[] P078C8_A6881FasUnpLt ;
   private boolean[] P078C8_n6881FasUnpLt ;
   private int[] P078C8_A4315BarNumBot1 ;
   private boolean[] P078C8_n4315BarNumBot1 ;
   private int[] P078C8_A4648BarFasRecu ;
   private boolean[] P078C8_n4648BarFasRecu ;
   private String[] P078C8_A135BarColNom ;
   private String[] P078C8_A1234BarNomCli ;
   private java.util.Date[] P078C8_A162BarFecTeo ;
   private String[] P078C8_A150BarFacTin ;
   private byte[] P078C8_A148BarEstReo ;
   private int[] P078C8_A252CliCod ;
   private boolean[] P078C8_n252CliCod ;
   private String[] P078C8_A279CliNom ;
   private String[] P078C8_A4609BarMdlCod ;
   private String[] P078C8_A212BarSer ;
   private String[] P078C8_A1652BarSerDsc ;
   private java.util.Date[] P078C8_A159BarFecGen ;
   private java.util.Date[] P078C8_A4613BarHorReg ;
   private boolean[] P078C8_n4613BarHorReg ;
   private String[] P078C8_A603MaqCodBis ;
   private String[] P078C8_A4302BarMaqFas1 ;
   private boolean[] P078C8_n4302BarMaqFas1 ;
   private java.math.BigDecimal[] P078C8_A4645BarFasKgs ;
   private boolean[] P078C8_n4645BarFasKgs ;
   private short[] P078C8_A4644BarFasNPrd ;
   private boolean[] P078C8_n4644BarFasNPrd ;
   private String[] P078C8_A4287BarFasFor ;
   private short[] P078C8_A194BarOrdLin ;
   private int[] P078C8_A4643BarFasLot ;
   private java.math.BigDecimal[] P078C8_A166BarKgm ;
   private short[] P078C8_A199BarPie1 ;
   private String[] P078C8_A365DisDes ;
   private int[] P078C8_A898BarPieNDes ;
   private String[] P078C9_A396EmprCod ;
   private String[] P078C9_A457FasCod ;
   private String[] P078C9_A465FasObs ;
   private byte[] P078C9_A463FasNumLin ;
   private String[] P078C11_A396EmprCod ;
   private short[] P078C11_A2804RecLinMaq ;
   private String[] P078C11_A130BarCodPar ;
   private byte[] P078C11_A132BarCodReo ;
   private int[] P078C11_A129BarCod ;
   private short[] P078C11_A4268RecOrdLin ;
   private boolean[] P078C11_n4268RecOrdLin ;
   private int[] P078C11_A4654RecNroPar ;
   private boolean[] P078C11_n4654RecNroPar ;
   private String[] P078C11_A4258RecMaqFas ;
   private boolean[] P078C11_n4258RecMaqFas ;
   private String[] P078C11_A602MaqCod ;
   private String[] P078C11_A4402RecUsrCod ;
   private java.util.Date[] P078C11_A4866RecFecAlt ;
   private boolean[] P078C11_n4866RecFecAlt ;
   private String[] P078C11_A606MaqDsc ;
   private boolean[] P078C11_n606MaqDsc ;
   private byte[] P078C11_A148BarEstReo ;
   private int[] P078C11_A4273RecFagPrd ;
   private int[] P078C11_A4261RecTotPrd ;
   private boolean[] P078C11_n4261RecTotPrd ;
   private java.math.BigDecimal[] P078C11_A4271RecFagKgs ;
   private java.math.BigDecimal[] P078C11_A4259RecTotKgs ;
   private String[] P078C12_A396EmprCod ;
   private int[] P078C12_A129BarCod ;
   private byte[] P078C12_A132BarCodReo ;
   private String[] P078C12_A130BarCodPar ;
   private short[] P078C12_A2804RecLinMaq ;
   private int[] P078C12_A4695RecVolPrf ;
   private byte[] P078C12_A1273RecLinPro ;
   private short[] P078C12_A4696RecTiempo ;
   private boolean[] P078C12_n4696RecTiempo ;
   private short[] P078C12_A771ProForTie ;
   private short[] P078C12_A7228RecTemp ;
   private boolean[] P078C12_n7228RecTemp ;
   private short[] P078C12_A772ProForTmx ;
   private java.math.BigDecimal[] P078C12_A7230RecPhMn ;
   private boolean[] P078C12_n7230RecPhMn ;
   private java.math.BigDecimal[] P078C12_A6877ProForPhn ;
   private boolean[] P078C12_n6877ProForPhn ;
   private java.math.BigDecimal[] P078C12_A7229RecPhMx ;
   private boolean[] P078C12_n7229RecPhMx ;
   private java.math.BigDecimal[] P078C12_A6876ProForPhx ;
   private boolean[] P078C12_n6876ProForPhx ;
   private int[] P078C12_A4697RecNroPrg ;
   private String[] P078C12_A764ProForCod ;
   private String[] P078C12_A766ProForDsc ;
   private String[] P078C12_A6018ProForFab ;
   private boolean[] P078C12_n6018ProForFab ;
   private short[] P078C12_A4706ProForRb ;
   private java.math.BigDecimal[] P078C12_A7257RecRb ;
   private boolean[] P078C12_n7257RecRb ;
   private String[] P078C12_A5523ProForTip ;
   private String[] P078C13_A719PrdNum ;
   private boolean[] P078C13_n719PrdNum ;
   private String[] P078C13_A396EmprCod ;
   private int[] P078C13_A129BarCod ;
   private byte[] P078C13_A132BarCodReo ;
   private String[] P078C13_A130BarCodPar ;
   private short[] P078C13_A2804RecLinMaq ;
   private byte[] P078C13_A1273RecLinPro ;
   private String[] P078C13_A872RecPrdNum ;
   private byte[] P078C13_A4338PrdUMeFo ;
   private byte[] P078C13_A490ForPrdUMe ;
   private boolean[] P078C13_n490ForPrdUMe ;
   private java.math.BigDecimal[] P078C13_A431FacCon ;
   private byte[] P078C13_A2394RecForNro ;
   private String[] P078C13_A875RecPrdDsc ;
   private byte[] P078C13_A743PrdUniCon ;
   private java.math.BigDecimal[] P078C13_A686PrdCant ;
   private short[] P078C13_A5422RecSalMP ;
   private int[] P078C13_A5467RecSalVol ;
   private String[] P078C13_A4692PrdNom2 ;
   private java.math.BigDecimal[] P078C13_A707PrdFacCon ;
   private java.math.BigDecimal[] P078C13_A724PrdPreAct ;
   private short[] P078C13_A811RecLin ;
   private short[] P078C14_A833TipDefCod ;
   private boolean[] P078C14_n833TipDefCod ;
   private String[] P078C14_A396EmprCod ;
   private int[] P078C14_A4667HisLavCon ;
   private short[] P078C14_A4665HisLavOrd ;
   private int[] P078C14_A4664HisLavNpd ;
   private String[] P078C14_A4663HisLavPar ;
   private byte[] P078C14_A4662HisLavReo ;
   private int[] P078C14_A4661HisLavCod ;
   private String[] P078C14_A834TipDefDsc ;
   private boolean[] P078C14_n834TipDefDsc ;
   private String[] P078C15_A396EmprCod ;
   private String[] P078C15_A5061Hl_hdrp ;
   private byte[] P078C15_A5060Hl_hdrr ;
   private int[] P078C15_A5059Hl_hdr ;
   private int[] P078C15_A5067Hl_hdr_o ;
   private byte[] P078C15_A5068Hl_hdrr_o ;
   private String[] P078C15_A5069Hl_hdrp_o ;
   private short[] P078C15_A5071Hl_pzs_o ;
   private boolean[] P078C15_n5071Hl_pzs_o ;
   private java.math.BigDecimal[] P078C15_A5070Hl_kgs_o ;
   private boolean[] P078C15_n5070Hl_kgs_o ;
   private String[] P078C16_A396EmprCod ;
   private int[] P078C16_A4643BarFasLot ;
   private short[] P078C16_A194BarOrdLin ;
   private String[] P078C16_A758ProCod ;
   private String[] P078C16_A130BarCodPar ;
   private byte[] P078C16_A132BarCodReo ;
   private int[] P078C16_A129BarCod ;
   private int[] P078C16_A5954Ap_Barcod ;
   private byte[] P078C16_A5955Ap_BarReo ;
   private String[] P078C16_A5956Ap_BarPar ;
   private short[] P078C16_A5960Ap_Piezas ;
   private boolean[] P078C16_n5960Ap_Piezas ;
   private java.math.BigDecimal[] P078C16_A5959Ap_Kilos ;
   private boolean[] P078C16_n5959Ap_Kilos ;
   private String[] P078C16_A5957Ap_ProCod ;
   private short[] P078C16_A5958Ap_BarOrd ;
   private short[] P078C17_A194BarOrdLin ;
   private String[] P078C17_A758ProCod ;
   private String[] P078C17_A130BarCodPar ;
   private byte[] P078C17_A132BarCodReo ;
   private int[] P078C17_A129BarCod ;
   private String[] P078C17_A396EmprCod ;
   private int[] P078C17_A4940A_Barcod ;
   private byte[] P078C17_A4941A_BarReo ;
   private String[] P078C17_A4942A_BarPar ;
   private short[] P078C17_A4947A_Piezas ;
   private boolean[] P078C17_n4947A_Piezas ;
   private java.math.BigDecimal[] P078C17_A4946A_Kilos ;
   private boolean[] P078C17_n4946A_Kilos ;
   private String[] P078C17_A4943A_ProCod ;
   private short[] P078C17_A4944A_BarOrd ;
   private String[] P078C18_A396EmprCod ;
   private byte[] P078C18_A831TipColCod ;
   private int[] P078C18_A483ForColNum ;
   private String[] P078C18_A482ForColNom ;
   private String[] P078C18_A494ForSer ;
   private int[] P078C18_A252CliCod ;
   private boolean[] P078C18_n252CliCod ;
   private String[] P078C18_A649ObsForTxt ;
   private short[] P078C18_A650ObsLin ;
   private String[] P078C19_A396EmprCod ;
   private String[] P078C19_A602MaqCod ;
   private String[] P078C19_A5949MaqDosifP ;
   private boolean[] P078C19_n5949MaqDosifP ;
   private String[] P078C20_A396EmprCod ;
   private String[] P078C20_A65ArtCod ;
   private int[] P078C20_A252CliCod ;
   private boolean[] P078C20_n252CliCod ;
   private String[] P078C20_A967ArtNMtr ;
   private boolean[] P078C20_n967ArtNMtr ;
   private short[] P078C21_A5085CodCausa ;
   private boolean[] P078C21_n5085CodCausa ;
   private String[] P078C21_A396EmprCod ;
   private String[] P078C21_A5061Hl_hdrp ;
   private byte[] P078C21_A5060Hl_hdrr ;
   private int[] P078C21_A5059Hl_hdr ;
   private String[] P078C21_A5086DscCausa ;
   private boolean[] P078C21_n5086DscCausa ;
   private String[] P078C22_A396EmprCod ;
   private short[] P078C22_A774ProNumLin ;
   private String[] P078C22_A758ProCod ;
   private String[] P078C22_A5735ProFasNot ;
   private boolean[] P078C22_n5735ProFasNot ;
   private String[] P078C23_A396EmprCod ;
   private short[] P078C23_A1664ParFasCod ;
   private short[] P078C23_A194BarOrdLin ;
   private String[] P078C23_A758ProCod ;
   private String[] P078C23_A130BarCodPar ;
   private byte[] P078C23_A132BarCodReo ;
   private int[] P078C23_A129BarCod ;
   private String[] P078C23_A3693BarParTxt ;
   private boolean[] P078C23_n3693BarParTxt ;
}

final  class rreclv6s__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P078C2", "SELECT T1.TipDefCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarTipDis, T1.BarAcaBak, T1.BarPlf, T1.BarGirar, T1.BarEstReo, T2.TipDefDsc, T1.CliCod, T1.BarSer, T1.BarLar, T1.BarMat, T1.BarEncCli, T1.BarDisNum, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipArt FROM (TXPBARCAD T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078C3", "SELECT T1.AlbRecCod, T2.ClasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T3.ClasDsc, T2.AlbRLoc FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C4", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C5", "SELECT * FROM (SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.ProFasLin, T2.ProDsc2 FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078C6", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarFasEst, T2.FasDsc, T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C8", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasBot1, T4.FasCod, T1.ProCod, T4.BarfasUnpL, T5.FasUnpLt, T1.BarNumBot1, T1.BarFasRecu, T2.BarColNom, T2.BarNomCli, T4.BarFecTeo, T4.BarFacTin, T2.BarEstReo, T2.CliCod, T3.CliNom, T2.BarMdlCod, T2.BarSer, T2.BarSerDsc, T2.BarFecGen, T2.BarHorReg, T4.MaqCodBis, T1.BarMaqFas1, T1.BarFasKgs, T1.BarFasNPrd, T4.BarFasFor, T1.BarOrdLin, T1.BarFasLot, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T6.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T6.BarPieNDes, 0) AS BarPieNDes FROM (((((TXPFASMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPBARFAS T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.ProCod = T1.ProCod AND T4.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T5 ON T5.EmprCod = T1.EmprCod AND T5.FasCod = T4.FasCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarFasBot1 = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasLot, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C9", "SELECT * FROM (SELECT EmprCod, FasCod, FasObs, FasNumLin FROM TXPFASLIN WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasNumLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078C11", "SELECT T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecOrdLin, T1.RecNroPar, T1.RecMaqFas, T1.MaqCod, T1.RecUsrCod, T1.RecFecAlt, T2.MaqDsc, T3.BarEstReo, COALESCE( T4.RecFagPrd, 0) AS RecFagPrd, T1.RecTotPrd, COALESCE( T4.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs FROM (((TXPRECMAQ T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(RecAgrKgs) AS RecFagKgs, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, SUM(RecAgrPrd) AS RecFagPrd FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.RecNroPar = ?) AND (T1.RecOrdLin = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C12", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecVolPrf, T1.RecLinPro, T1.RecTiempo, T2.ProForTie, T1.RecTemp, T2.ProForTmx, T1.RecPhMn, T2.ProForPhn, T1.RecPhMx, T2.ProForPhx, T1.RecNroPrg, T1.ProForCod, T2.ProForDsc, T2.ProForFab, T2.ProForRb, T1.RecRb, T2.ProForTip FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C13", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecPrdNum, T2.PrdUMeFo, T1.ForPrdUMe, T1.FacCon, T1.RecForNro, T1.RecPrdDsc, T2.PrdUniCon, T1.PrdCant, T1.RecSalMP, T1.RecSalVol, T2.PrdNom2, T2.PrdFacCon, T2.PrdPreAct, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C14", "SELECT T1.TipDefCod, T1.EmprCod, T1.HisLavCon, T1.HisLavOrd, T1.HisLavNpd, T1.HisLavPar, T1.HisLavReo, T1.HisLavCod, T2.TipDefDsc FROM (TXPHISRE1 T1 LEFT JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.HisLavCod = ? and T1.HisLavReo = ? and T1.HisLavPar = ? and T1.HisLavNpd = ? and T1.HisLavOrd = ? and T1.HisLavCon = ? ORDER BY T1.EmprCod, T1.HisLavCod, T1.HisLavReo, T1.HisLavPar, T1.HisLavNpd, T1.HisLavOrd, T1.HisLavCon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078C15", "SELECT EmprCod, Hl_hdrp, Hl_hdrr, Hl_hdr, Hl_hdr_o, Hl_hdrr_o, Hl_hdrp_o, Hl_pzs_o, Hl_kgs_o FROM TXPHLREO1 WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ? ORDER BY EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C16", "SELECT EmprCod, BarFasLot, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_Piezas, Ap_Kilos, Ap_ProCod, Ap_BarOrd FROM TXPAGHDFP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C17", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, A_Barcod, A_BarReo, A_BarPar, A_Piezas, A_Kilos, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C18", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078C19", "SELECT EmprCod, MaqCod, MaqDosifP FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078C20", "SELECT EmprCod, ArtCod, CliCod, ArtNMtr FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078C21", "SELECT T1.CodCausa, T1.EmprCod, T1.Hl_hdrp, T1.Hl_hdrr, T1.Hl_hdr, T2.DscCausa FROM (TXPHLREOP T1 LEFT JOIN TXPTIPCAU T2 ON T2.EmprCod = T1.EmprCod AND T2.CodCausa = T1.CodCausa) WHERE T1.EmprCod = ? and T1.Hl_hdr = ? and T1.Hl_hdrr = ? and T1.Hl_hdrp = ? ORDER BY T1.EmprCod, T1.Hl_hdr, T1.Hl_hdrr, T1.Hl_hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078C22", "SELECT EmprCod, ProNumLin, ProCod, ProFasNot FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078C23", "SELECT EmprCod, ParFasCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, BarParTxt FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and ParFasCod = 9999 ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 10);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((String[]) buf[20])[0] = rslt.getString(17, 20);
               ((String[]) buf[21])[0] = rslt.getString(18, 8);
               ((String[]) buf[22])[0] = rslt.getString(19, 13);
               ((int[]) buf[23])[0] = rslt.getInt(20);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((short[]) buf[25])[0] = rslt.getShort(22);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
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
               ((String[]) buf[10])[0] = rslt.getString(9, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 100);
               return;
            case 4 :
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
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 13);
               ((String[]) buf[17])[0] = rslt.getString(13, 13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(18, 30);
               ((String[]) buf[24])[0] = rslt.getString(19, 13);
               ((String[]) buf[25])[0] = rslt.getString(20, 16);
               ((String[]) buf[26])[0] = rslt.getString(21, 26);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(22);
               ((java.util.Date[]) buf[28])[0] = GXutil.resetDate(rslt.getGXDateTime(23));
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(24, 6);
               ((String[]) buf[31])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(27);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(28, 1);
               ((short[]) buf[38])[0] = rslt.getShort(29);
               ((int[]) buf[39])[0] = rslt.getInt(30);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(31,2);
               ((short[]) buf[41])[0] = rslt.getShort(32);
               ((String[]) buf[42])[0] = rslt.getString(33, 1);
               ((int[]) buf[43])[0] = rslt.getInt(34);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 70);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 7 :
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
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((String[]) buf[22])[0] = rslt.getString(17, 6);
               ((String[]) buf[23])[0] = rslt.getString(18, 30);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               return;
            case 9 :
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
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,3);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 40);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,4);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,5);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               return;
            case 10 :
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
            case 11 :
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
            case 12 :
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
            case 13 :
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
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

