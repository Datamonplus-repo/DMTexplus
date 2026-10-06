package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rhdrtin3 extends GXReport
{
   public rhdrtin3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhdrtin3.class ), "" );
   }

   public rhdrtin3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      rhdrtin3.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      rhdrtin3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rhdrtin3.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      rhdrtin3.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      rhdrtin3.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      rhdrtin3.this.AV15ImpCod = aP4[0];
      this.aP4 = aP4;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Ver Ordem Serviço") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV16Termin = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P06N92 */
         pr_default.execute(0, new Object[] {AV16Termin, Boolean.valueOf(n396EmprCod), A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A942TermCod = P06N92_A942TermCod[0] ;
            A1189TermUsu = P06N92_A1189TermUsu[0] ;
            n1189TermUsu = P06N92_n1189TermUsu[0] ;
            AV17TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06N94 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A361DisCod = P06N94_A361DisCod[0] ;
            A218BarTipCol = P06N94_A218BarTipCol[0] ;
            A148BarEstReo = P06N94_A148BarEstReo[0] ;
            A217BarTipArt = P06N94_A217BarTipArt[0] ;
            n217BarTipArt = P06N94_n217BarTipArt[0] ;
            A180BarMaqCod = P06N94_A180BarMaqCod[0] ;
            A1909BarGraAca = P06N94_A1909BarGraAca[0] ;
            A125BarAncAca1 = P06N94_A125BarAncAca1[0] ;
            A127BarAncCru1 = P06N94_A127BarAncCru1[0] ;
            A1226BarGraCru = P06N94_A1226BarGraCru[0] ;
            A1224BarEncAnh = P06N94_A1224BarEncAnh[0] ;
            A1223BarEncCom = P06N94_A1223BarEncCom[0] ;
            A834TipDefDsc = P06N94_A834TipDefDsc[0] ;
            n834TipDefDsc = P06N94_n834TipDefDsc[0] ;
            A833TipDefCod = P06N94_A833TipDefCod[0] ;
            n833TipDefCod = P06N94_n833TipDefCod[0] ;
            A757PriCod = P06N94_A757PriCod[0] ;
            A159BarFecGen = P06N94_A159BarFecGen[0] ;
            A212BarSer = P06N94_A212BarSer[0] ;
            A279CliNom = P06N94_A279CliNom[0] ;
            A155BarFecCli = P06N94_A155BarFecCli[0] ;
            A1652BarSerDsc = P06N94_A1652BarSerDsc[0] ;
            A136BarColNum = P06N94_A136BarColNum[0] ;
            A135BarColNom = P06N94_A135BarColNom[0] ;
            A226BarTraP3 = P06N94_A226BarTraP3[0] ;
            A225BarTraP2 = P06N94_A225BarTraP2[0] ;
            A224BarTraP1 = P06N94_A224BarTraP1[0] ;
            A223BarTra3 = P06N94_A223BarTra3[0] ;
            A222BarTra2 = P06N94_A222BarTra2[0] ;
            A221BarTra1 = P06N94_A221BarTra1[0] ;
            A1235BarNumCli = P06N94_A1235BarNumCli[0] ;
            A1234BarNomCli = P06N94_A1234BarNomCli[0] ;
            A252CliCod = P06N94_A252CliCod[0] ;
            n252CliCod = P06N94_n252CliCod[0] ;
            A143BarDisNum = P06N94_A143BarDisNum[0] ;
            A168BarKgmLan = P06N94_A168BarKgmLan[0] ;
            A166BarKgm = P06N94_A166BarKgm[0] ;
            A199BarPie1 = P06N94_A199BarPie1[0] ;
            A365DisDes = P06N94_A365DisDes[0] ;
            A898BarPieNDes = P06N94_A898BarPieNDes[0] ;
            A757PriCod = P06N94_A757PriCod[0] ;
            A834TipDefDsc = P06N94_A834TipDefDsc[0] ;
            n834TipDefDsc = P06N94_n834TipDefDsc[0] ;
            A279CliNom = P06N94_A279CliNom[0] ;
            A168BarKgmLan = P06N94_A168BarKgmLan[0] ;
            A166BarKgm = P06N94_A166BarKgm[0] ;
            A199BarPie1 = P06N94_A199BarPie1[0] ;
            A898BarPieNDes = P06N94_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV67MacCod = 0 ;
            GXv_int1[0] = AV67MacCod ;
            new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int1) ;
            rhdrtin3.this.AV67MacCod = GXv_int1[0] ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV26Barcada[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV47ContHr = (byte)(1) ;
            /* Using cursor P06N95 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV67MacCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1199MacCod = P06N95_A1199MacCod[0] ;
               A1205MacBarPar = P06N95_A1205MacBarPar[0] ;
               A1204MacBarReo = P06N95_A1204MacBarReo[0] ;
               A1203MacBarCod = P06N95_A1203MacBarCod[0] ;
               A1201MacLin = P06N95_A1201MacLin[0] ;
               if ( ( A129BarCod == A1203MacBarCod ) && ( A132BarCodReo == A1204MacBarReo ) && ( GXutil.strcmp(A1205MacBarPar, A130BarCodPar) == 0 ) )
               {
               }
               else
               {
                  AV26Barcada[AV47ContHr-1] = GXutil.str( A1203MacBarCod, 8, 0) + "-" + GXutil.str( A1204MacBarReo, 1, 0) + A1205MacBarPar ;
                  AV47ContHr = (byte)(AV47ContHr+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
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
            if ( A148BarEstReo == 1 )
            {
               AV49Remonta = httpContext.getMessage( "REMONTA", "") ;
            }
            /* Using cursor P06N96 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Byte.valueOf(A218BarTipCol)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A831TipColCod = P06N96_A831TipColCod[0] ;
               AV27TipColDsc = A832TipColDsc ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
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
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV54DisCod = A361DisCod ;
            /* Execute user subroutine: 'EMPESA' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(1);
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
            AV62TipArtCod = A217BarTipArt ;
            /* Execute user subroutine: 'TIPART' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(1);
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
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV97SolFriNor = " " ;
            AV98SolFriMaS = " " ;
            AV99SolFriMah = " " ;
            /* Using cursor P06N97 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A3213SolFriNor = P06N97_A3213SolFriNor[0] ;
               n3213SolFriNor = P06N97_n3213SolFriNor[0] ;
               A3211SolFriMaS = P06N97_A3211SolFriMaS[0] ;
               n3211SolFriMaS = P06N97_n3211SolFriMaS[0] ;
               A3212SolFriMaH = P06N97_A3212SolFriMaH[0] ;
               n3212SolFriMaH = P06N97_n3212SolFriMaH[0] ;
               A3196SolFriCod = P06N97_A3196SolFriCod[0] ;
               AV97SolFriNor = A3213SolFriNor ;
               AV98SolFriMaS = A3211SolFriMaS ;
               AV99SolFriMah = A3212SolFriMaH ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV89SolColNor = " " ;
            AV90SolColTac = " " ;
            AV91SolColCo = " " ;
            AV92SolColPa6 = " " ;
            AV93SolColPes = " " ;
            AV94SolColPac = " " ;
            AV95SolColWo = " " ;
            AV96SolColAlt = " " ;
            AV89SolColNor = " " ;
            /* Using cursor P06N98 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A3187SolColNor = P06N98_A3187SolColNor[0] ;
               n3187SolColNor = P06N98_n3187SolColNor[0] ;
               A3189SolColTac = P06N98_A3189SolColTac[0] ;
               n3189SolColTac = P06N98_n3189SolColTac[0] ;
               A3190SolColCo = P06N98_A3190SolColCo[0] ;
               n3190SolColCo = P06N98_n3190SolColCo[0] ;
               A3191SolColPa6 = P06N98_A3191SolColPa6[0] ;
               n3191SolColPa6 = P06N98_n3191SolColPa6[0] ;
               A3192SolColPes = P06N98_A3192SolColPes[0] ;
               n3192SolColPes = P06N98_n3192SolColPes[0] ;
               A3193SolColPac = P06N98_A3193SolColPac[0] ;
               n3193SolColPac = P06N98_n3193SolColPac[0] ;
               A3194SolColWo = P06N98_A3194SolColWo[0] ;
               n3194SolColWo = P06N98_n3194SolColWo[0] ;
               A1345SolColAlt = P06N98_A1345SolColAlt[0] ;
               n1345SolColAlt = P06N98_n1345SolColAlt[0] ;
               A1348SolColCod = P06N98_A1348SolColCod[0] ;
               AV89SolColNor = A3187SolColNor ;
               AV90SolColTac = A3189SolColTac ;
               AV91SolColCo = A3190SolColCo ;
               AV92SolColPa6 = A3191SolColPa6 ;
               AV93SolColPes = A3192SolColPes ;
               AV94SolColPac = A3193SolColPac ;
               AV95SolColWo = A3194SolColWo ;
               AV96SolColAlt = A1345SolColAlt ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            AV101EstDimA = (short)(0) ;
            AV100EstDimGr = (short)(0) ;
            /* Using cursor P06N99 */
            pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1332EstDimAnc = P06N99_A1332EstDimAnc[0] ;
               n1332EstDimAnc = P06N99_n1332EstDimAnc[0] ;
               A1338EstDimGrm2 = P06N99_A1338EstDimGrm2[0] ;
               n1338EstDimGrm2 = P06N99_n1338EstDimGrm2[0] ;
               A3874EstCalEA = P06N99_A3874EstCalEA[0] ;
               n3874EstCalEA = P06N99_n3874EstCalEA[0] ;
               A3875EstCalEL = P06N99_A3875EstCalEL[0] ;
               n3875EstCalEL = P06N99_n3875EstCalEL[0] ;
               A3876EstRamEA = P06N99_A3876EstRamEA[0] ;
               n3876EstRamEA = P06N99_n3876EstRamEA[0] ;
               A3877EstRamEL = P06N99_A3877EstRamEL[0] ;
               n3877EstRamEL = P06N99_n3877EstRamEL[0] ;
               A3872EstSanfEA = P06N99_A3872EstSanfEA[0] ;
               n3872EstSanfEA = P06N99_n3872EstSanfEA[0] ;
               A3873EstSanfEL = P06N99_A3873EstSanfEL[0] ;
               n3873EstSanfEL = P06N99_n3873EstSanfEL[0] ;
               A1333EstDimCod = P06N99_A1333EstDimCod[0] ;
               AV101EstDimA = A1332EstDimAnc ;
               AV100EstDimGr = A1338EstDimGrm2 ;
               AV104CalandraC = A3874EstCalEA ;
               AV105CalandraL = A3875EstCalEL ;
               AV106RamulaC = A3876EstRamEA ;
               AV107RamulaL = A3877EstRamEL ;
               AV108SanforC = A3872EstSanfEA ;
               AV109SanforL = A3873EstSanfEL ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV74Vanc1 = httpContext.getMessage( "cm", "") ;
            AV75Vgrm1 = httpContext.getMessage( "grm2", "") ;
            AV76Vanc2 = httpContext.getMessage( "cm", "") ;
            AV77Vgrm2 = httpContext.getMessage( "grm2", "") ;
            AV102Vanc3 = httpContext.getMessage( "cm", "") ;
            AV103Vgrm3 = httpContext.getMessage( "grm2", "") ;
            if ( (0==AV101EstDimA) )
            {
               AV102Vanc3 = " " ;
            }
            if ( (0==AV100EstDimGr) )
            {
               AV103Vgrm3 = " " ;
            }
            AV57BarGraAca = (short)(0) ;
            if ( (0==A1909BarGraAca) )
            {
               AV57BarGraAca = (short)(0) ;
               AV77Vgrm2 = " " ;
            }
            else
            {
               AV57BarGraAca = A1909BarGraAca ;
            }
            AV58BarAncAca1 = (short)(0) ;
            if ( (0==A125BarAncAca1) )
            {
               AV58BarAncAca1 = (short)(0) ;
               AV76Vanc2 = " " ;
            }
            else
            {
               AV58BarAncAca1 = A125BarAncAca1 ;
            }
            AV70AnchoC1 = (short)(0) ;
            if ( (0==A127BarAncCru1) )
            {
               AV70AnchoC1 = (short)(0) ;
               AV74Vanc1 = " " ;
            }
            else
            {
               AV70AnchoC1 = A127BarAncCru1 ;
            }
            AV71GraCru1 = (short)(0) ;
            if ( (0==A1226BarGraCru) )
            {
               AV71GraCru1 = (short)(0) ;
               AV75Vgrm1 = " " ;
            }
            else
            {
               AV71GraCru1 = A1226BarGraCru ;
            }
            AV72ELargura = "" ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1224BarEncAnh)==0) )
            {
               AV72ELargura = "" ;
            }
            else
            {
               AV72ELargura = GXutil.str( A1224BarEncAnh, 6, 2) ;
            }
            AV73Ecomp = "" ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1223BarEncCom)==0) )
            {
               AV73Ecomp = "" ;
            }
            else
            {
               AV73Ecomp = GXutil.str( A1223BarEncCom, 6, 2) ;
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A168BarKgmLan)==0) )
            {
               AV78DifKgs = A168BarKgmLan.subtract(A166BarKgm) ;
            }
            else
            {
               AV78DifKgs = DecimalUtil.ZERO ;
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A166BarKgm)==0) )
            {
               AV79PorKgs = ((AV78DifKgs.divide(A166BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
            }
            else
            {
               AV79PorKgs = DecimalUtil.ZERO ;
            }
            AV81vDefe = " " ;
            if ( A148BarEstReo > 0 )
            {
               if ( A148BarEstReo == 1 )
               {
                  AV81vDefe = httpContext.getMessage( "REPROCESSO:", "") + GXutil.ltrim( GXutil.str( A833TipDefCod, 4, 0)) + " " + GXutil.ltrim( A834TipDefDsc) ;
               }
               if ( A148BarEstReo == 2 )
               {
                  AV81vDefe = httpContext.getMessage( "BENEF.:", "") + GXutil.ltrim( GXutil.str( A833TipDefCod, 4, 0)) + " " + GXutil.ltrim( A834TipDefDsc) ;
               }
            }
            AV85BarKgmLan = " " ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A168BarKgmLan)==0) )
            {
               AV85BarKgmLan = GXutil.str( A168BarKgmLan, 9, 2) ;
            }
            AV86PorKgsA = " " ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79PorKgs)==0) )
            {
               AV86PorKgsA = GXutil.str( AV79PorKgs, 6, 2) ;
            }
            h6N90( false, 33) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observacões", ""), 63, Gx_line+17, 156, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+11, 764, Gx_line+11, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+13, 49, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+11, 763, Gx_line+33, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
            /* Using cursor P06N910 */
            pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A377DisObsTxt = P06N910_A377DisObsTxt[0] ;
               A376DisObsLin = P06N910_A376DisObsLin[0] ;
               h6N90( false, 17) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 170, Gx_line+0, 671, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            h6N90( false, 8) ;
            getPrinter().GxDrawLine(49, Gx_line+6, 764, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+6, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+7, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+8) ;
            h6N90( false, 38) ;
            getPrinter().GxDrawRect(49, Gx_line+2, 764, Gx_line+27, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FASES DE PRODUÇÃO", ""), 318, Gx_line+6, 496, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+30, 764, Gx_line+30, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(49, Gx_line+30, 49, Gx_line+37, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(763, Gx_line+30, 763, Gx_line+37, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+38) ;
            /* Using cursor P06N911 */
            pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A761ProFasLin = P06N911_A761ProFasLin[0] ;
               n761ProFasLin = P06N911_n761ProFasLin[0] ;
               A759ProDsc = P06N911_A759ProDsc[0] ;
               A758ProCod = P06N911_A758ProCod[0] ;
               A759ProDsc = P06N911_A759ProDsc[0] ;
               h6N90( false, 28) ;
               getPrinter().GxAttris("Courier New", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 65, Gx_line+1, 158, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 185, Gx_line+1, 644, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+25, 764, Gx_line+25, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
               AV66ContLin = (byte)(AV66ContLin+2) ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            AV66ContLin = (byte)(AV66ContLin+2) ;
            /* Using cursor P06N912 */
            pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A194BarOrdLin = P06N912_A194BarOrdLin[0] ;
               A758ProCod = P06N912_A758ProCod[0] ;
               A603MaqCodBis = P06N912_A603MaqCodBis[0] ;
               A460FasDsc = P06N912_A460FasDsc[0] ;
               A457FasCod = P06N912_A457FasCod[0] ;
               A460FasDsc = P06N912_A460FasDsc[0] ;
               /* Using cursor P06N913 */
               pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A3296BarParObs = P06N913_A3296BarParObs[0] ;
                  A1664ParFasCod = P06N913_A1664ParFasCod[0] ;
                  AV80BarParObs = A3296BarParObs ;
                  pr_default.readNext(10);
               }
               pr_default.close(10);
               if ( (GXutil.strcmp("", AV80BarParObs)==0) )
               {
                  AV80BarParObs = "......................................." ;
               }
               AV32MaqCod = A603MaqCodBis ;
               /* Execute user subroutine: 'DSCMAQ' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(9);
                  pr_default.close(9);
                  pr_default.close(1);
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
               h6N90( false, 20) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 65, Gx_line+0, 133, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 156, Gx_line+0, 390, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+18, 764, Gx_line+18, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               AV66ContLin = (byte)(AV66ContLin+1) ;
               pr_default.readNext(9);
            }
            pr_default.close(9);
            AV33Contador = (byte)(1) ;
            /* Using cursor P06N914 */
            pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV67MacCod)});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A1199MacCod = P06N914_A1199MacCod[0] ;
               A1205MacBarPar = P06N914_A1205MacBarPar[0] ;
               A1204MacBarReo = P06N914_A1204MacBarReo[0] ;
               A1203MacBarCod = P06N914_A1203MacBarCod[0] ;
               A1201MacLin = P06N914_A1201MacLin[0] ;
               if ( ( A129BarCod == A1203MacBarCod ) && ( A132BarCodReo == A1204MacBarReo ) && ( GXutil.strcmp(A1205MacBarPar, A130BarCodPar) == 0 ) )
               {
               }
               else
               {
                  GXv_decimal2[0] = AV68KgmAgr ;
                  GXv_char3[0] = AV65ArtDscAGr ;
                  GXv_char4[0] = AV64ObsTxt ;
                  GXv_int1[0] = AV83BarPie ;
                  new app.pobsagr(remoteHandle, context).execute( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, GXv_decimal2, GXv_char3, GXv_char4, GXv_int1) ;
                  rhdrtin3.this.AV68KgmAgr = GXv_decimal2[0] ;
                  rhdrtin3.this.AV65ArtDscAGr = GXv_char3[0] ;
                  rhdrtin3.this.AV64ObsTxt = GXv_char4[0] ;
                  rhdrtin3.this.AV83BarPie = GXv_int1[0] ;
                  AV84Pecas = (byte)(AV83BarPie) ;
                  if ( AV33Contador == 1 )
                  {
                     AV33Contador = (byte)(2) ;
                     h6N90( false, 35) ;
                     getPrinter().GxDrawRect(49, Gx_line+1, 764, Gx_line+25, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ACESSÓRIOS", ""), 354, Gx_line+4, 459, Gx_line+23, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Macro =", ""), 649, Gx_line+5, 701, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67MacCod), "ZZZZZZZ9")), 702, Gx_line+5, 761, Gx_line+22, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(49, Gx_line+27, 764, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(49, Gx_line+27, 49, Gx_line+35, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(763, Gx_line+27, 763, Gx_line+35, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+35) ;
                     AV66ContLin = (byte)(AV66ContLin+3) ;
                  }
                  h6N90( false, 20) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64ObsTxt, "")), 518, Gx_line+2, 760, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65ArtDscAGr, "")), 173, Gx_line+2, 341, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1203MacBarCod), "ZZZZZZZ9")), 65, Gx_line+2, 133, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1205MacBarPar, "")), 156, Gx_line+2, 165, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1204MacBarReo), "9")), 145, Gx_line+2, 154, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("-", 134, Gx_line+2, 143, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68KgmAgr, "ZZZZZ9.99")), 406, Gx_line+2, 473, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84Pecas), "Z9")), 345, Gx_line+2, 361, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "peça c/", ""), 365, Gx_line+4, 402, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 477, Gx_line+4, 494, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Obs.", ""), 498, Gx_line+4, 520, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+20, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+20, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
                  AV66ContLin = (byte)(AV66ContLin+1) ;
               }
               pr_default.readNext(11);
            }
            pr_default.close(11);
            if ( AV33Contador > 1 )
            {
               h6N90( false, 9) ;
               getPrinter().GxDrawLine(49, Gx_line+7, 764, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(49, Gx_line+0, 49, Gx_line+8, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(763, Gx_line+0, 763, Gx_line+8, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+9) ;
               AV66ContLin = (byte)(AV66ContLin+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         while ( AV66ContLin < 20 )
         {
            h6N90( false, 18) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV66ContLin = (byte)(AV66ContLin+1) ;
         }
         h6N90( false, 93) ;
         getPrinter().GxDrawRect(48, Gx_line+4, 763, Gx_line+27, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(48, Gx_line+31, 763, Gx_line+89, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "CONTROLO DE QUALIDADE", ""), 296, Gx_line+7, 516, Gx_line+26, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Notas:", ""), 55, Gx_line+34, 100, Gx_line+49, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+93) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6N90( true, 0) ;
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
      /* Using cursor P06N915 */
      pr_default.execute(12, new Object[] {AV31EmprCod, AV32MaqCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A602MaqCod = P06N915_A602MaqCod[0] ;
         A606MaqDsc = P06N915_A606MaqDsc[0] ;
         n606MaqDsc = P06N915_n606MaqDsc[0] ;
         AV30MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BUSCOL' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int1[0] = AV36CliCod ;
      GXv_char3[0] = AV37ArtCod ;
      GXv_char5[0] = AV41BarColNom ;
      GXv_int6[0] = AV42BarColNum ;
      GXv_int7[0] = A218BarTipCol ;
      GXv_int8[0] = AV28IntCod ;
      GXv_char9[0] = AV29IntDsc ;
      GXv_char10[0] = AV39ForColNom ;
      GXv_int11[0] = AV40ForColNum ;
      new app.pbusint(remoteHandle, context).execute( GXv_char4, GXv_int1, GXv_char3, GXv_char5, GXv_int6, GXv_int7, GXv_int8, GXv_char9, GXv_char10, GXv_int11) ;
      rhdrtin3.this.A396EmprCod = GXv_char4[0] ;
      rhdrtin3.this.AV36CliCod = GXv_int1[0] ;
      rhdrtin3.this.AV37ArtCod = GXv_char3[0] ;
      rhdrtin3.this.AV41BarColNom = GXv_char5[0] ;
      rhdrtin3.this.AV42BarColNum = GXv_int6[0] ;
      rhdrtin3.this.A218BarTipCol = GXv_int7[0] ;
      rhdrtin3.this.AV28IntCod = GXv_int8[0] ;
      rhdrtin3.this.AV29IntDsc = GXv_char9[0] ;
      rhdrtin3.this.AV39ForColNom = GXv_char10[0] ;
      rhdrtin3.this.AV40ForColNum = GXv_int11[0] ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'EMPESA' Routine */
      returnInSub = false ;
      AV50AlbREnt = "" ;
      AV52ALbRfen = GXutil.nullDate() ;
      AV53ALbRLoc = "" ;
      AV51ProceNom = "" ;
      AV87Local = "" ;
      /* Using cursor P06N916 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(AV54DisCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A970ProceCod = P06N916_A970ProceCod[0] ;
         n970ProceCod = P06N916_n970ProceCod[0] ;
         A361DisCod = P06N916_A361DisCod[0] ;
         A46AlbREnt = P06N916_A46AlbREnt[0] ;
         A49AlbRFen = P06N916_A49AlbRFen[0] ;
         A50AlbRLoc = P06N916_A50AlbRLoc[0] ;
         A971ProceNom = P06N916_A971ProceNom[0] ;
         n971ProceNom = P06N916_n971ProceNom[0] ;
         A44AlbRecCod = P06N916_A44AlbRecCod[0] ;
         A970ProceCod = P06N916_A970ProceCod[0] ;
         n970ProceCod = P06N916_n970ProceCod[0] ;
         A46AlbREnt = P06N916_A46AlbREnt[0] ;
         A49AlbRFen = P06N916_A49AlbRFen[0] ;
         A50AlbRLoc = P06N916_A50AlbRLoc[0] ;
         A971ProceNom = P06N916_A971ProceNom[0] ;
         n971ProceNom = P06N916_n971ProceNom[0] ;
         AV50AlbREnt = A46AlbREnt ;
         AV52ALbRfen = A49AlbRFen ;
         AV53ALbRLoc = A50AlbRLoc ;
         AV51ProceNom = A971ProceNom ;
         AV82AlbRecCod = A44AlbRecCod ;
         AV87Local = A50AlbRLoc ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV63TipARtDsc = "" ;
      /* Using cursor P06N917 */
      pr_default.execute(14, new Object[] {AV31EmprCod, Short.valueOf(AV62TipArtCod)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A829TipArtCod = P06N917_A829TipArtCod[0] ;
         A830TipArtDsc = P06N917_A830TipArtDsc[0] ;
         n830TipArtDsc = P06N917_n830TipArtDsc[0] ;
         AV63TipARtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void h6N90( boolean bFoot ,
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
               if ( GXutil.strcmp(A757PriCod, "1") == 0 )
               {
                  if ( (GXutil.strcmp("", AV26Barcada[1-1])==0) )
                  {
                     getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35HojRut, "")), 507, Gx_line+47, 721, Gx_line+71, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço:", ""), 154, Gx_line+23, 272, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 283, Gx_line+15, 417, Gx_line+48, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 452, Gx_line+15, 470, Gx_line+48, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 477, Gx_line+15, 495, Gx_line+48, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Emitida:", ""), 155, Gx_line+50, 272, Gx_line+67, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 227, Gx_line+49, 311, Gx_line+69, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("-", 429, Gx_line+22, 440, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TermUsu, "@!")), 382, Gx_line+51, 441, Gx_line+67, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "83e2dd36-d80c-4601-b713-f362776f2d8c", "", context.getHttpContext().getTheme( )), 49, Gx_line+13, 142, Gx_line+117) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81vDefe, "")), 207, Gx_line+102, 729, Gx_line+122, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 318, Gx_line+51, 377, Gx_line+67, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+122) ;
                  }
                  else
                  {
                     getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "83e2dd36-d80c-4601-b713-f362776f2d8c", "", context.getHttpContext().getTheme( )), 53, Gx_line+13, 146, Gx_line+117) ;
                     getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35HojRut, "")), 513, Gx_line+69, 727, Gx_line+93, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço:", ""), 160, Gx_line+24, 278, Gx_line+42, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 286, Gx_line+16, 420, Gx_line+49, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 452, Gx_line+16, 470, Gx_line+49, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 477, Gx_line+16, 495, Gx_line+49, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Emitida:", ""), 161, Gx_line+72, 229, Gx_line+90, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 236, Gx_line+71, 320, Gx_line+91, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("-", 429, Gx_line+23, 440, Gx_line+42, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TermUsu, "@!")), 391, Gx_line+73, 450, Gx_line+89, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81vDefe, "")), 213, Gx_line+101, 735, Gx_line+121, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Aces.:", ""), 502, Gx_line+22, 547, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Barcada[1-1], "")), 548, Gx_line+22, 629, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Barcada[2-1], "")), 632, Gx_line+22, 713, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Barcada[3-1], "")), 548, Gx_line+40, 629, Gx_line+57, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Barcada[4-1], "")), 632, Gx_line+40, 713, Gx_line+57, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(499, Gx_line+19, 725, Gx_line+59, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 326, Gx_line+73, 385, Gx_line+89, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+121) ;
                  }
               }
               else
               {
                  if ( (GXutil.strcmp("", AV26Barcada[1-1])==0) )
                  {
                     getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35HojRut, "")), 511, Gx_line+45, 725, Gx_line+69, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço:", ""), 139, Gx_line+21, 257, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 286, Gx_line+13, 420, Gx_line+46, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 455, Gx_line+13, 473, Gx_line+46, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 480, Gx_line+13, 498, Gx_line+46, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Emitida:", ""), 139, Gx_line+48, 207, Gx_line+66, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 214, Gx_line+47, 298, Gx_line+67, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("-", 429, Gx_line+20, 440, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TermUsu, "@!")), 368, Gx_line+49, 427, Gx_line+65, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81vDefe, "")), 207, Gx_line+99, 729, Gx_line+119, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 304, Gx_line+49, 363, Gx_line+65, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+120) ;
                  }
                  else
                  {
                     getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35HojRut, "")), 511, Gx_line+73, 725, Gx_line+97, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Ordem Serviço:", ""), 139, Gx_line+18, 257, Gx_line+36, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 265, Gx_line+9, 399, Gx_line+42, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 439, Gx_line+9, 457, Gx_line+42, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 464, Gx_line+9, 482, Gx_line+42, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Emitida:", ""), 140, Gx_line+76, 208, Gx_line+94, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( A159BarFecGen, "99/99/99"), 216, Gx_line+75, 300, Gx_line+95, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("-", 413, Gx_line+17, 424, Gx_line+36, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TermUsu, "@!")), 370, Gx_line+77, 429, Gx_line+93, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81vDefe, "")), 209, Gx_line+110, 731, Gx_line+130, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Aces.:", ""), 500, Gx_line+18, 545, Gx_line+35, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Barcada[1-1], "")), 548, Gx_line+18, 629, Gx_line+35, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Barcada[2-1], "")), 631, Gx_line+18, 712, Gx_line+35, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Barcada[3-1], "")), 548, Gx_line+35, 629, Gx_line+52, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Barcada[4-1], "")), 631, Gx_line+35, 712, Gx_line+52, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(496, Gx_line+15, 723, Gx_line+57, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 306, Gx_line+77, 365, Gx_line+93, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+131) ;
                  }
               }
               AV88barser6 = GXutil.substring( A212BarSer, 1, 6) ;
               getPrinter().GxDrawRect(49, Gx_line+300, 764, Gx_line+324, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(49, Gx_line+108, 764, Gx_line+132, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia T.", ""), 55, Gx_line+65, 114, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Encomenda", ""), 55, Gx_line+83, 131, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50AlbREnt, "")), 154, Gx_line+65, 222, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 154, Gx_line+83, 222, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 55, Gx_line+10, 114, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 154, Gx_line+9, 211, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor Cliente", ""), 433, Gx_line+10, 526, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 544, Gx_line+10, 653, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), 670, Gx_line+10, 721, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs entr.", ""), 583, Gx_line+151, 659, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 683, Gx_line+151, 759, Gx_line+169, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 471, Gx_line+151, 514, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")), 528, Gx_line+151, 579, Gx_line+169, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Kgs Saída", ""), 583, Gx_line+174, 659, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quebra", ""), 463, Gx_line+174, 514, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Composição", ""), 55, Gx_line+175, 139, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A221BarTra1, "")), 195, Gx_line+175, 229, Gx_line+193, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A222BarTra2, "")), 279, Gx_line+176, 313, Gx_line+194, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A223BarTra3, "")), 364, Gx_line+174, 398, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A224BarTraP1), "ZZ9")), 157, Gx_line+175, 183, Gx_line+193, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A225BarTraP2), "ZZ9")), 242, Gx_line+175, 268, Gx_line+193, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A226BarTraP3), "ZZ9")), 326, Gx_line+174, 352, Gx_line+192, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Referênc.", ""), 433, Gx_line+35, 526, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 544, Gx_line+33, 667, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 672, Gx_line+33, 729, Gx_line+52, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 741, Gx_line+33, 761, Gx_line+52, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 55, Gx_line+150, 106, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88barser6, "")), 154, Gx_line+150, 211, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 219, Gx_line+150, 464, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 188, Gx_line+175, 196, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("%", 272, Gx_line+175, 280, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("%", 355, Gx_line+174, 363, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(49, Gx_line+6, 764, Gx_line+106, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 140, Gx_line+10, 149, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 140, Gx_line+65, 149, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 140, Gx_line+83, 149, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 140, Gx_line+150, 149, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 140, Gx_line+175, 149, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 526, Gx_line+10, 535, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 663, Gx_line+151, 672, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 517, Gx_line+151, 526, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 663, Gx_line+174, 672, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 517, Gx_line+174, 526, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85BarKgmLan, "")), 675, Gx_line+174, 759, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86PorKgsA, "")), 529, Gx_line+174, 580, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 268, Gx_line+83, 336, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrada Nº", ""), 433, Gx_line+65, 517, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV82AlbRecCod), "ZZZZZZZ9")), 544, Gx_line+65, 612, Gx_line+83, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 241, Gx_line+83, 257, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 526, Gx_line+35, 535, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 526, Gx_line+65, 535, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Localização", ""), 433, Gx_line+83, 526, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 526, Gx_line+83, 535, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Local, "")), 543, Gx_line+83, 627, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESCRIÇÃO DO ARTIGO", ""), 307, Gx_line+113, 506, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(50, Gx_line+201, 764, Gx_line+201, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Solidez á Lavagem", ""), 55, Gx_line+209, 198, Gx_line+226, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89SolColNor, "")), 58, Gx_line+226, 168, Gx_line+243, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90SolColTac, "")), 220, Gx_line+226, 243, Gx_line+243, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91SolColCo, "")), 255, Gx_line+226, 278, Gx_line+243, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92SolColPa6, "")), 290, Gx_line+226, 313, Gx_line+243, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93SolColPes, "")), 324, Gx_line+226, 347, Gx_line+243, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94SolColPac, "")), 358, Gx_line+226, 381, Gx_line+243, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95SolColWo, "")), 393, Gx_line+226, 416, Gx_line+243, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96SolColAlt, "")), 438, Gx_line+226, 468, Gx_line+243, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TAC", ""), 220, Gx_line+210, 243, Gx_line+225, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CO", ""), 259, Gx_line+210, 275, Gx_line+225, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PA ", ""), 290, Gx_line+210, 313, Gx_line+225, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PES", ""), 324, Gx_line+210, 347, Gx_line+225, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PAC", ""), 358, Gx_line+210, 381, Gx_line+225, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "WO", ""), 397, Gx_line+210, 413, Gx_line+225, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ALT.COR", ""), 426, Gx_line+210, 478, Gx_line+225, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Solidez à Fricção", ""), 55, Gx_line+251, 198, Gx_line+268, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97SolFriNor, "")), 58, Gx_line+267, 168, Gx_line+284, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Molhado", ""), 219, Gx_line+251, 278, Gx_line+268, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Seco", ""), 327, Gx_line+251, 361, Gx_line+268, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98SolFriMaS, "")), 331, Gx_line+267, 354, Gx_line+284, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99SolFriMah, "")), 235, Gx_line+267, 258, Gx_line+284, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(485, Gx_line+201, 485, Gx_line+295, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "APROVAÇÃO DA COR", ""), 563, Gx_line+209, 681, Gx_line+226, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV52ALbRfen, "99/99/99"), 268, Gx_line+65, 336, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 242, Gx_line+65, 258, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72ELargura, "")), 610, Gx_line+343, 661, Gx_line+361, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Ecomp, "")), 668, Gx_line+343, 719, Gx_line+361, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58BarAncAca1), "ZZZ")), 184, Gx_line+385, 216, Gx_line+405, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57BarGraAca), "ZZZZ")), 274, Gx_line+385, 317, Gx_line+405, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gramagem", ""), 270, Gx_line+343, 338, Gx_line+360, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV70AnchoC1), "ZZZ")), 184, Gx_line+365, 216, Gx_line+385, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV71GraCru1), "ZZZZ")), 274, Gx_line+365, 317, Gx_line+385, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ACABAMENTOS", ""), 351, Gx_line+302, 467, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Em Crú", ""), 55, Gx_line+366, 106, Gx_line+383, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Medida", ""), 185, Gx_line+343, 236, Gx_line+360, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pretendido", ""), 55, Gx_line+386, 139, Gx_line+403, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Encolhimento Pretendido:", ""), 406, Gx_line+343, 607, Gx_line+360, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Largura", ""), 406, Gx_line+406, 465, Gx_line+423, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Comprimento", ""), 406, Gx_line+385, 499, Gx_line+402, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 509, Gx_line+406, 518, Gx_line+423, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 140, Gx_line+386, 149, Gx_line+403, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 140, Gx_line+366, 149, Gx_line+383, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 509, Gx_line+385, 518, Gx_line+402, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Vanc1, "")), 226, Gx_line+365, 242, Gx_line+382, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Vanc2, "")), 226, Gx_line+385, 242, Gx_line+402, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Vgrm1, "")), 327, Gx_line+365, 357, Gx_line+382, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Vgrm2, "")), 327, Gx_line+385, 357, Gx_line+402, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Obtida", ""), 55, Gx_line+407, 106, Gx_line+424, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 140, Gx_line+407, 149, Gx_line+424, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV100EstDimGr), "ZZZZ")), 274, Gx_line+406, 317, Gx_line+426, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV101EstDimA), "ZZZ")), 184, Gx_line+406, 216, Gx_line+426, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Vanc3, "")), 226, Gx_line+407, 242, Gx_line+424, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103Vgrm3, "")), 327, Gx_line+407, 357, Gx_line+424, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Calandra", ""), 525, Gx_line+364, 593, Gx_line+381, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ramula", ""), 611, Gx_line+364, 662, Gx_line+381, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Sanford", ""), 679, Gx_line+364, 738, Gx_line+381, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV104CalandraC, "ZZZ.ZZ")), 536, Gx_line+385, 581, Gx_line+402, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV105CalandraL, "ZZZ.ZZ")), 536, Gx_line+406, 581, Gx_line+423, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106RamulaC, "ZZZ.ZZ")), 615, Gx_line+385, 660, Gx_line+402, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV107RamulaL, "ZZZ.ZZ")), 615, Gx_line+406, 660, Gx_line+423, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV108SanforC, "ZZZ.ZZ")), 686, Gx_line+385, 731, Gx_line+402, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV109SanforL, "ZZZ.ZZ")), 686, Gx_line+406, 731, Gx_line+423, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Resultados", ""), 406, Gx_line+364, 490, Gx_line+381, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(49, Gx_line+134, 764, Gx_line+295, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(49, Gx_line+328, 763, Gx_line+432, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 509, Gx_line+364, 518, Gx_line+381, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 154, Gx_line+35, 405, Gx_line+53, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+435) ;
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
      this.aP0[0] = rhdrtin3.this.A396EmprCod;
      this.aP1[0] = rhdrtin3.this.A129BarCod;
      this.aP2[0] = rhdrtin3.this.A132BarCodReo;
      this.aP3[0] = rhdrtin3.this.A130BarCodPar;
      this.aP4[0] = rhdrtin3.this.AV15ImpCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Termin = "" ;
      scmdbuf = "" ;
      P06N92_A396EmprCod = new String[] {""} ;
      P06N92_n396EmprCod = new boolean[] {false} ;
      P06N92_A942TermCod = new String[] {""} ;
      P06N92_A1189TermUsu = new String[] {""} ;
      P06N92_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV17TermUsu = "" ;
      P06N94_A396EmprCod = new String[] {""} ;
      P06N94_n396EmprCod = new boolean[] {false} ;
      P06N94_A129BarCod = new int[1] ;
      P06N94_n129BarCod = new boolean[] {false} ;
      P06N94_A132BarCodReo = new byte[1] ;
      P06N94_n132BarCodReo = new boolean[] {false} ;
      P06N94_A130BarCodPar = new String[] {""} ;
      P06N94_n130BarCodPar = new boolean[] {false} ;
      P06N94_A361DisCod = new int[1] ;
      P06N94_A218BarTipCol = new byte[1] ;
      P06N94_A148BarEstReo = new byte[1] ;
      P06N94_A217BarTipArt = new short[1] ;
      P06N94_n217BarTipArt = new boolean[] {false} ;
      P06N94_A180BarMaqCod = new String[] {""} ;
      P06N94_A1909BarGraAca = new short[1] ;
      P06N94_A125BarAncAca1 = new short[1] ;
      P06N94_A127BarAncCru1 = new short[1] ;
      P06N94_A1226BarGraCru = new short[1] ;
      P06N94_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N94_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N94_A834TipDefDsc = new String[] {""} ;
      P06N94_n834TipDefDsc = new boolean[] {false} ;
      P06N94_A833TipDefCod = new short[1] ;
      P06N94_n833TipDefCod = new boolean[] {false} ;
      P06N94_A757PriCod = new String[] {""} ;
      P06N94_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P06N94_A212BarSer = new String[] {""} ;
      P06N94_A279CliNom = new String[] {""} ;
      P06N94_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P06N94_A1652BarSerDsc = new String[] {""} ;
      P06N94_A136BarColNum = new int[1] ;
      P06N94_A135BarColNom = new String[] {""} ;
      P06N94_A226BarTraP3 = new short[1] ;
      P06N94_A225BarTraP2 = new short[1] ;
      P06N94_A224BarTraP1 = new short[1] ;
      P06N94_A223BarTra3 = new String[] {""} ;
      P06N94_A222BarTra2 = new String[] {""} ;
      P06N94_A221BarTra1 = new String[] {""} ;
      P06N94_A1235BarNumCli = new int[1] ;
      P06N94_A1234BarNomCli = new String[] {""} ;
      P06N94_A252CliCod = new int[1] ;
      P06N94_n252CliCod = new boolean[] {false} ;
      P06N94_A143BarDisNum = new String[] {""} ;
      P06N94_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N94_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N94_A199BarPie1 = new short[1] ;
      P06N94_A365DisDes = new String[] {""} ;
      P06N94_A898BarPieNDes = new int[1] ;
      A180BarMaqCod = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A834TipDefDsc = "" ;
      A757PriCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A279CliNom = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A223BarTra3 = "" ;
      A222BarTra2 = "" ;
      A221BarTra1 = "" ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV26Barcada = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV26Barcada[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06N95_A396EmprCod = new String[] {""} ;
      P06N95_n396EmprCod = new boolean[] {false} ;
      P06N95_A1199MacCod = new int[1] ;
      P06N95_A1205MacBarPar = new String[] {""} ;
      P06N95_A1204MacBarReo = new byte[1] ;
      P06N95_A1203MacBarCod = new int[1] ;
      P06N95_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV31EmprCod = "" ;
      AV59Ceros8 = "" ;
      AV60HdrAlfa = "" ;
      AV35HojRut = "" ;
      AV49Remonta = "" ;
      P06N96_A396EmprCod = new String[] {""} ;
      P06N96_n396EmprCod = new boolean[] {false} ;
      P06N96_A831TipColCod = new byte[1] ;
      AV27TipColDsc = "" ;
      A832TipColDsc = "" ;
      AV37ArtCod = "" ;
      AV41BarColNom = "" ;
      AV32MaqCod = "" ;
      AV97SolFriNor = "" ;
      AV98SolFriMaS = "" ;
      AV99SolFriMah = "" ;
      P06N97_A396EmprCod = new String[] {""} ;
      P06N97_n396EmprCod = new boolean[] {false} ;
      P06N97_A129BarCod = new int[1] ;
      P06N97_n129BarCod = new boolean[] {false} ;
      P06N97_A132BarCodReo = new byte[1] ;
      P06N97_n132BarCodReo = new boolean[] {false} ;
      P06N97_A130BarCodPar = new String[] {""} ;
      P06N97_n130BarCodPar = new boolean[] {false} ;
      P06N97_A3213SolFriNor = new String[] {""} ;
      P06N97_n3213SolFriNor = new boolean[] {false} ;
      P06N97_A3211SolFriMaS = new String[] {""} ;
      P06N97_n3211SolFriMaS = new boolean[] {false} ;
      P06N97_A3212SolFriMaH = new String[] {""} ;
      P06N97_n3212SolFriMaH = new boolean[] {false} ;
      P06N97_A3196SolFriCod = new int[1] ;
      A3213SolFriNor = "" ;
      A3211SolFriMaS = "" ;
      A3212SolFriMaH = "" ;
      AV89SolColNor = "" ;
      AV90SolColTac = "" ;
      AV91SolColCo = "" ;
      AV92SolColPa6 = "" ;
      AV93SolColPes = "" ;
      AV94SolColPac = "" ;
      AV95SolColWo = "" ;
      AV96SolColAlt = "" ;
      P06N98_A396EmprCod = new String[] {""} ;
      P06N98_n396EmprCod = new boolean[] {false} ;
      P06N98_A129BarCod = new int[1] ;
      P06N98_n129BarCod = new boolean[] {false} ;
      P06N98_A132BarCodReo = new byte[1] ;
      P06N98_n132BarCodReo = new boolean[] {false} ;
      P06N98_A130BarCodPar = new String[] {""} ;
      P06N98_n130BarCodPar = new boolean[] {false} ;
      P06N98_A3187SolColNor = new String[] {""} ;
      P06N98_n3187SolColNor = new boolean[] {false} ;
      P06N98_A3189SolColTac = new String[] {""} ;
      P06N98_n3189SolColTac = new boolean[] {false} ;
      P06N98_A3190SolColCo = new String[] {""} ;
      P06N98_n3190SolColCo = new boolean[] {false} ;
      P06N98_A3191SolColPa6 = new String[] {""} ;
      P06N98_n3191SolColPa6 = new boolean[] {false} ;
      P06N98_A3192SolColPes = new String[] {""} ;
      P06N98_n3192SolColPes = new boolean[] {false} ;
      P06N98_A3193SolColPac = new String[] {""} ;
      P06N98_n3193SolColPac = new boolean[] {false} ;
      P06N98_A3194SolColWo = new String[] {""} ;
      P06N98_n3194SolColWo = new boolean[] {false} ;
      P06N98_A1345SolColAlt = new String[] {""} ;
      P06N98_n1345SolColAlt = new boolean[] {false} ;
      P06N98_A1348SolColCod = new int[1] ;
      A3187SolColNor = "" ;
      A3189SolColTac = "" ;
      A3190SolColCo = "" ;
      A3191SolColPa6 = "" ;
      A3192SolColPes = "" ;
      A3193SolColPac = "" ;
      A3194SolColWo = "" ;
      A1345SolColAlt = "" ;
      P06N99_A396EmprCod = new String[] {""} ;
      P06N99_n396EmprCod = new boolean[] {false} ;
      P06N99_A129BarCod = new int[1] ;
      P06N99_n129BarCod = new boolean[] {false} ;
      P06N99_A132BarCodReo = new byte[1] ;
      P06N99_n132BarCodReo = new boolean[] {false} ;
      P06N99_A130BarCodPar = new String[] {""} ;
      P06N99_n130BarCodPar = new boolean[] {false} ;
      P06N99_A1332EstDimAnc = new short[1] ;
      P06N99_n1332EstDimAnc = new boolean[] {false} ;
      P06N99_A1338EstDimGrm2 = new short[1] ;
      P06N99_n1338EstDimGrm2 = new boolean[] {false} ;
      P06N99_A3874EstCalEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N99_n3874EstCalEA = new boolean[] {false} ;
      P06N99_A3875EstCalEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N99_n3875EstCalEL = new boolean[] {false} ;
      P06N99_A3876EstRamEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N99_n3876EstRamEA = new boolean[] {false} ;
      P06N99_A3877EstRamEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N99_n3877EstRamEL = new boolean[] {false} ;
      P06N99_A3872EstSanfEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N99_n3872EstSanfEA = new boolean[] {false} ;
      P06N99_A3873EstSanfEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06N99_n3873EstSanfEL = new boolean[] {false} ;
      P06N99_A1333EstDimCod = new int[1] ;
      A3874EstCalEA = DecimalUtil.ZERO ;
      A3875EstCalEL = DecimalUtil.ZERO ;
      A3876EstRamEA = DecimalUtil.ZERO ;
      A3877EstRamEL = DecimalUtil.ZERO ;
      A3872EstSanfEA = DecimalUtil.ZERO ;
      A3873EstSanfEL = DecimalUtil.ZERO ;
      AV104CalandraC = DecimalUtil.ZERO ;
      AV105CalandraL = DecimalUtil.ZERO ;
      AV106RamulaC = DecimalUtil.ZERO ;
      AV107RamulaL = DecimalUtil.ZERO ;
      AV108SanforC = DecimalUtil.ZERO ;
      AV109SanforL = DecimalUtil.ZERO ;
      AV74Vanc1 = "" ;
      AV75Vgrm1 = "" ;
      AV76Vanc2 = "" ;
      AV77Vgrm2 = "" ;
      AV102Vanc3 = "" ;
      AV103Vgrm3 = "" ;
      AV72ELargura = "" ;
      AV73Ecomp = "" ;
      AV78DifKgs = DecimalUtil.ZERO ;
      AV79PorKgs = DecimalUtil.ZERO ;
      AV81vDefe = "" ;
      AV85BarKgmLan = "" ;
      AV86PorKgsA = "" ;
      P06N910_A396EmprCod = new String[] {""} ;
      P06N910_n396EmprCod = new boolean[] {false} ;
      P06N910_A361DisCod = new int[1] ;
      P06N910_A377DisObsTxt = new String[] {""} ;
      P06N910_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P06N911_A396EmprCod = new String[] {""} ;
      P06N911_n396EmprCod = new boolean[] {false} ;
      P06N911_A129BarCod = new int[1] ;
      P06N911_n129BarCod = new boolean[] {false} ;
      P06N911_A132BarCodReo = new byte[1] ;
      P06N911_n132BarCodReo = new boolean[] {false} ;
      P06N911_A130BarCodPar = new String[] {""} ;
      P06N911_n130BarCodPar = new boolean[] {false} ;
      P06N911_A761ProFasLin = new short[1] ;
      P06N911_n761ProFasLin = new boolean[] {false} ;
      P06N911_A759ProDsc = new String[] {""} ;
      P06N911_A758ProCod = new String[] {""} ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      P06N912_A396EmprCod = new String[] {""} ;
      P06N912_n396EmprCod = new boolean[] {false} ;
      P06N912_A129BarCod = new int[1] ;
      P06N912_n129BarCod = new boolean[] {false} ;
      P06N912_A132BarCodReo = new byte[1] ;
      P06N912_n132BarCodReo = new boolean[] {false} ;
      P06N912_A130BarCodPar = new String[] {""} ;
      P06N912_n130BarCodPar = new boolean[] {false} ;
      P06N912_A194BarOrdLin = new short[1] ;
      P06N912_A758ProCod = new String[] {""} ;
      P06N912_A603MaqCodBis = new String[] {""} ;
      P06N912_A460FasDsc = new String[] {""} ;
      P06N912_A457FasCod = new String[] {""} ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      P06N913_A396EmprCod = new String[] {""} ;
      P06N913_n396EmprCod = new boolean[] {false} ;
      P06N913_A129BarCod = new int[1] ;
      P06N913_n129BarCod = new boolean[] {false} ;
      P06N913_A132BarCodReo = new byte[1] ;
      P06N913_n132BarCodReo = new boolean[] {false} ;
      P06N913_A130BarCodPar = new String[] {""} ;
      P06N913_n130BarCodPar = new boolean[] {false} ;
      P06N913_A758ProCod = new String[] {""} ;
      P06N913_A194BarOrdLin = new short[1] ;
      P06N913_A3296BarParObs = new String[] {""} ;
      P06N913_A1664ParFasCod = new short[1] ;
      A3296BarParObs = "" ;
      AV80BarParObs = "" ;
      P06N914_A396EmprCod = new String[] {""} ;
      P06N914_n396EmprCod = new boolean[] {false} ;
      P06N914_A1199MacCod = new int[1] ;
      P06N914_A1205MacBarPar = new String[] {""} ;
      P06N914_A1204MacBarReo = new byte[1] ;
      P06N914_A1203MacBarCod = new int[1] ;
      P06N914_A1201MacLin = new short[1] ;
      AV68KgmAgr = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      AV65ArtDscAGr = "" ;
      AV64ObsTxt = "" ;
      AV30MaqDsc = "" ;
      P06N915_A602MaqCod = new String[] {""} ;
      P06N915_A396EmprCod = new String[] {""} ;
      P06N915_n396EmprCod = new boolean[] {false} ;
      P06N915_A606MaqDsc = new String[] {""} ;
      P06N915_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      GXv_char4 = new String[1] ;
      GXv_int1 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      AV29IntDsc = "" ;
      GXv_char9 = new String[1] ;
      AV39ForColNom = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      AV50AlbREnt = "" ;
      AV52ALbRfen = GXutil.nullDate() ;
      AV53ALbRLoc = "" ;
      AV51ProceNom = "" ;
      AV87Local = "" ;
      P06N916_A970ProceCod = new short[1] ;
      P06N916_n970ProceCod = new boolean[] {false} ;
      P06N916_A396EmprCod = new String[] {""} ;
      P06N916_n396EmprCod = new boolean[] {false} ;
      P06N916_A361DisCod = new int[1] ;
      P06N916_A46AlbREnt = new String[] {""} ;
      P06N916_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06N916_A50AlbRLoc = new String[] {""} ;
      P06N916_A971ProceNom = new String[] {""} ;
      P06N916_n971ProceNom = new boolean[] {false} ;
      P06N916_A44AlbRecCod = new int[1] ;
      A46AlbREnt = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A50AlbRLoc = "" ;
      A971ProceNom = "" ;
      AV63TipARtDsc = "" ;
      P06N917_A829TipArtCod = new short[1] ;
      P06N917_A396EmprCod = new String[] {""} ;
      P06N917_n396EmprCod = new boolean[] {false} ;
      P06N917_A830TipArtDsc = new String[] {""} ;
      P06N917_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      Gx_time = "" ;
      AV88barser6 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhdrtin3__default(),
         new Object[] {
             new Object[] {
            P06N92_A396EmprCod, P06N92_n396EmprCod, P06N92_A942TermCod, P06N92_A1189TermUsu, P06N92_n1189TermUsu
            }
            , new Object[] {
            P06N94_A396EmprCod, P06N94_A129BarCod, P06N94_A132BarCodReo, P06N94_A130BarCodPar, P06N94_A361DisCod, P06N94_A218BarTipCol, P06N94_A148BarEstReo, P06N94_A217BarTipArt, P06N94_n217BarTipArt, P06N94_A180BarMaqCod,
            P06N94_A1909BarGraAca, P06N94_A125BarAncAca1, P06N94_A127BarAncCru1, P06N94_A1226BarGraCru, P06N94_A1224BarEncAnh, P06N94_A1223BarEncCom, P06N94_A834TipDefDsc, P06N94_n834TipDefDsc, P06N94_A833TipDefCod, P06N94_n833TipDefCod,
            P06N94_A757PriCod, P06N94_A159BarFecGen, P06N94_A212BarSer, P06N94_A279CliNom, P06N94_A155BarFecCli, P06N94_A1652BarSerDsc, P06N94_A136BarColNum, P06N94_A135BarColNom, P06N94_A226BarTraP3, P06N94_A225BarTraP2,
            P06N94_A224BarTraP1, P06N94_A223BarTra3, P06N94_A222BarTra2, P06N94_A221BarTra1, P06N94_A1235BarNumCli, P06N94_A1234BarNomCli, P06N94_A252CliCod, P06N94_n252CliCod, P06N94_A143BarDisNum, P06N94_A168BarKgmLan,
            P06N94_A166BarKgm, P06N94_A199BarPie1, P06N94_A365DisDes, P06N94_A898BarPieNDes
            }
            , new Object[] {
            P06N95_A396EmprCod, P06N95_A1199MacCod, P06N95_A1205MacBarPar, P06N95_A1204MacBarReo, P06N95_A1203MacBarCod, P06N95_A1201MacLin
            }
            , new Object[] {
            P06N96_A396EmprCod, P06N96_A831TipColCod
            }
            , new Object[] {
            P06N97_A396EmprCod, P06N97_A129BarCod, P06N97_n129BarCod, P06N97_A132BarCodReo, P06N97_n132BarCodReo, P06N97_A130BarCodPar, P06N97_n130BarCodPar, P06N97_A3213SolFriNor, P06N97_n3213SolFriNor, P06N97_A3211SolFriMaS,
            P06N97_n3211SolFriMaS, P06N97_A3212SolFriMaH, P06N97_n3212SolFriMaH, P06N97_A3196SolFriCod
            }
            , new Object[] {
            P06N98_A396EmprCod, P06N98_A129BarCod, P06N98_n129BarCod, P06N98_A132BarCodReo, P06N98_n132BarCodReo, P06N98_A130BarCodPar, P06N98_n130BarCodPar, P06N98_A3187SolColNor, P06N98_n3187SolColNor, P06N98_A3189SolColTac,
            P06N98_n3189SolColTac, P06N98_A3190SolColCo, P06N98_n3190SolColCo, P06N98_A3191SolColPa6, P06N98_n3191SolColPa6, P06N98_A3192SolColPes, P06N98_n3192SolColPes, P06N98_A3193SolColPac, P06N98_n3193SolColPac, P06N98_A3194SolColWo,
            P06N98_n3194SolColWo, P06N98_A1345SolColAlt, P06N98_n1345SolColAlt, P06N98_A1348SolColCod
            }
            , new Object[] {
            P06N99_A396EmprCod, P06N99_A129BarCod, P06N99_n129BarCod, P06N99_A132BarCodReo, P06N99_n132BarCodReo, P06N99_A130BarCodPar, P06N99_n130BarCodPar, P06N99_A1332EstDimAnc, P06N99_n1332EstDimAnc, P06N99_A1338EstDimGrm2,
            P06N99_n1338EstDimGrm2, P06N99_A3874EstCalEA, P06N99_n3874EstCalEA, P06N99_A3875EstCalEL, P06N99_n3875EstCalEL, P06N99_A3876EstRamEA, P06N99_n3876EstRamEA, P06N99_A3877EstRamEL, P06N99_n3877EstRamEL, P06N99_A3872EstSanfEA,
            P06N99_n3872EstSanfEA, P06N99_A3873EstSanfEL, P06N99_n3873EstSanfEL, P06N99_A1333EstDimCod
            }
            , new Object[] {
            P06N910_A396EmprCod, P06N910_A361DisCod, P06N910_A377DisObsTxt, P06N910_A376DisObsLin
            }
            , new Object[] {
            P06N911_A396EmprCod, P06N911_A129BarCod, P06N911_A132BarCodReo, P06N911_A130BarCodPar, P06N911_A761ProFasLin, P06N911_n761ProFasLin, P06N911_A759ProDsc, P06N911_A758ProCod
            }
            , new Object[] {
            P06N912_A396EmprCod, P06N912_A129BarCod, P06N912_A132BarCodReo, P06N912_A130BarCodPar, P06N912_A194BarOrdLin, P06N912_A758ProCod, P06N912_A603MaqCodBis, P06N912_A460FasDsc, P06N912_A457FasCod
            }
            , new Object[] {
            P06N913_A396EmprCod, P06N913_A129BarCod, P06N913_A132BarCodReo, P06N913_A130BarCodPar, P06N913_A758ProCod, P06N913_A194BarOrdLin, P06N913_A3296BarParObs, P06N913_A1664ParFasCod
            }
            , new Object[] {
            P06N914_A396EmprCod, P06N914_A1199MacCod, P06N914_A1205MacBarPar, P06N914_A1204MacBarReo, P06N914_A1203MacBarCod, P06N914_A1201MacLin
            }
            , new Object[] {
            P06N915_A602MaqCod, P06N915_A396EmprCod, P06N915_A606MaqDsc, P06N915_n606MaqDsc
            }
            , new Object[] {
            P06N916_A970ProceCod, P06N916_n970ProceCod, P06N916_A396EmprCod, P06N916_A361DisCod, P06N916_A46AlbREnt, P06N916_A49AlbRFen, P06N916_A50AlbRLoc, P06N916_A971ProceNom, P06N916_n971ProceNom, P06N916_A44AlbRecCod
            }
            , new Object[] {
            P06N917_A829TipArtCod, P06N917_A396EmprCod, P06N917_A830TipArtDsc, P06N917_n830TipArtDsc
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte AV47ContHr ;
   private byte A1204MacBarReo ;
   private byte AV61LenVar ;
   private byte A831TipColCod ;
   private byte AV43BarTipCol ;
   private byte A376DisObsLin ;
   private byte AV66ContLin ;
   private byte AV33Contador ;
   private byte AV84Pecas ;
   private byte GXv_int7[] ;
   private byte AV28IntCod ;
   private byte GXv_int8[] ;
   private short A217BarTipArt ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A127BarAncCru1 ;
   private short A1226BarGraCru ;
   private short A833TipDefCod ;
   private short A226BarTraP3 ;
   private short A225BarTraP2 ;
   private short A224BarTraP1 ;
   private short A199BarPie1 ;
   private short A1201MacLin ;
   private short AV45DetPzas ;
   private short AV62TipArtCod ;
   private short AV101EstDimA ;
   private short AV100EstDimGr ;
   private short A1332EstDimAnc ;
   private short A1338EstDimGrm2 ;
   private short AV57BarGraAca ;
   private short AV58BarAncAca1 ;
   private short AV70AnchoC1 ;
   private short AV71GraCru1 ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A1664ParFasCod ;
   private short A970ProceCod ;
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
   private int A1235BarNumCli ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV67MacCod ;
   private int GX_I ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int AV36CliCod ;
   private int AV42BarColNum ;
   private int AV54DisCod ;
   private int A3196SolFriCod ;
   private int A1348SolColCod ;
   private int A1333EstDimCod ;
   private int Gx_OldLine ;
   private int AV83BarPie ;
   private int GXv_int1[] ;
   private int GXv_int6[] ;
   private int AV40ForColNum ;
   private int GXv_int11[] ;
   private int A44AlbRecCod ;
   private int AV82AlbRecCod ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A3874EstCalEA ;
   private java.math.BigDecimal A3875EstCalEL ;
   private java.math.BigDecimal A3876EstRamEA ;
   private java.math.BigDecimal A3877EstRamEL ;
   private java.math.BigDecimal A3872EstSanfEA ;
   private java.math.BigDecimal A3873EstSanfEL ;
   private java.math.BigDecimal AV104CalandraC ;
   private java.math.BigDecimal AV105CalandraL ;
   private java.math.BigDecimal AV106RamulaC ;
   private java.math.BigDecimal AV107RamulaL ;
   private java.math.BigDecimal AV108SanforC ;
   private java.math.BigDecimal AV109SanforL ;
   private java.math.BigDecimal AV78DifKgs ;
   private java.math.BigDecimal AV79PorKgs ;
   private java.math.BigDecimal AV68KgmAgr ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15ImpCod ;
   private String AV16Termin ;
   private String scmdbuf ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV17TermUsu ;
   private String A180BarMaqCod ;
   private String A834TipDefDsc ;
   private String A757PriCod ;
   private String A212BarSer ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A223BarTra3 ;
   private String A222BarTra2 ;
   private String A221BarTra1 ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
   private String AV26Barcada[] ;
   private String A1205MacBarPar ;
   private String AV31EmprCod ;
   private String AV59Ceros8 ;
   private String AV60HdrAlfa ;
   private String AV35HojRut ;
   private String AV49Remonta ;
   private String AV27TipColDsc ;
   private String A832TipColDsc ;
   private String AV37ArtCod ;
   private String AV41BarColNom ;
   private String AV32MaqCod ;
   private String AV97SolFriNor ;
   private String AV98SolFriMaS ;
   private String AV99SolFriMah ;
   private String A3213SolFriNor ;
   private String A3211SolFriMaS ;
   private String A3212SolFriMaH ;
   private String AV89SolColNor ;
   private String AV90SolColTac ;
   private String AV91SolColCo ;
   private String AV92SolColPa6 ;
   private String AV93SolColPes ;
   private String AV94SolColPac ;
   private String AV95SolColWo ;
   private String AV96SolColAlt ;
   private String A3187SolColNor ;
   private String A3189SolColTac ;
   private String A3190SolColCo ;
   private String A3191SolColPa6 ;
   private String A3192SolColPes ;
   private String A3193SolColPac ;
   private String A3194SolColWo ;
   private String A1345SolColAlt ;
   private String AV74Vanc1 ;
   private String AV75Vgrm1 ;
   private String AV76Vanc2 ;
   private String AV77Vgrm2 ;
   private String AV102Vanc3 ;
   private String AV103Vgrm3 ;
   private String AV72ELargura ;
   private String AV73Ecomp ;
   private String AV81vDefe ;
   private String AV85BarKgmLan ;
   private String AV86PorKgsA ;
   private String A377DisObsTxt ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A3296BarParObs ;
   private String AV80BarParObs ;
   private String AV65ArtDscAGr ;
   private String AV64ObsTxt ;
   private String AV30MaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV29IntDsc ;
   private String GXv_char9[] ;
   private String AV39ForColNom ;
   private String GXv_char10[] ;
   private String AV50AlbREnt ;
   private String AV53ALbRLoc ;
   private String AV51ProceNom ;
   private String AV87Local ;
   private String A46AlbREnt ;
   private String A50AlbRLoc ;
   private String A971ProceNom ;
   private String AV63TipARtDsc ;
   private String A830TipArtDsc ;
   private String Gx_time ;
   private String AV88barser6 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date AV52ALbRfen ;
   private java.util.Date A49AlbRFen ;
   private boolean n396EmprCod ;
   private boolean n1189TermUsu ;
   private boolean GxHdr3 ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n217BarTipArt ;
   private boolean n834TipDefDsc ;
   private boolean n833TipDefCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n3213SolFriNor ;
   private boolean n3211SolFriMaS ;
   private boolean n3212SolFriMaH ;
   private boolean n3187SolColNor ;
   private boolean n3189SolColTac ;
   private boolean n3190SolColCo ;
   private boolean n3191SolColPa6 ;
   private boolean n3192SolColPes ;
   private boolean n3193SolColPac ;
   private boolean n3194SolColWo ;
   private boolean n1345SolColAlt ;
   private boolean n1332EstDimAnc ;
   private boolean n1338EstDimGrm2 ;
   private boolean n3874EstCalEA ;
   private boolean n3875EstCalEL ;
   private boolean n3876EstRamEA ;
   private boolean n3877EstRamEL ;
   private boolean n3872EstSanfEA ;
   private boolean n3873EstSanfEL ;
   private boolean n761ProFasLin ;
   private boolean n606MaqDsc ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n830TipArtDsc ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P06N92_A396EmprCod ;
   private boolean[] P06N92_n396EmprCod ;
   private String[] P06N92_A942TermCod ;
   private String[] P06N92_A1189TermUsu ;
   private boolean[] P06N92_n1189TermUsu ;
   private String[] P06N94_A396EmprCod ;
   private boolean[] P06N94_n396EmprCod ;
   private int[] P06N94_A129BarCod ;
   private boolean[] P06N94_n129BarCod ;
   private byte[] P06N94_A132BarCodReo ;
   private boolean[] P06N94_n132BarCodReo ;
   private String[] P06N94_A130BarCodPar ;
   private boolean[] P06N94_n130BarCodPar ;
   private int[] P06N94_A361DisCod ;
   private byte[] P06N94_A218BarTipCol ;
   private byte[] P06N94_A148BarEstReo ;
   private short[] P06N94_A217BarTipArt ;
   private boolean[] P06N94_n217BarTipArt ;
   private String[] P06N94_A180BarMaqCod ;
   private short[] P06N94_A1909BarGraAca ;
   private short[] P06N94_A125BarAncAca1 ;
   private short[] P06N94_A127BarAncCru1 ;
   private short[] P06N94_A1226BarGraCru ;
   private java.math.BigDecimal[] P06N94_A1224BarEncAnh ;
   private java.math.BigDecimal[] P06N94_A1223BarEncCom ;
   private String[] P06N94_A834TipDefDsc ;
   private boolean[] P06N94_n834TipDefDsc ;
   private short[] P06N94_A833TipDefCod ;
   private boolean[] P06N94_n833TipDefCod ;
   private String[] P06N94_A757PriCod ;
   private java.util.Date[] P06N94_A159BarFecGen ;
   private String[] P06N94_A212BarSer ;
   private String[] P06N94_A279CliNom ;
   private java.util.Date[] P06N94_A155BarFecCli ;
   private String[] P06N94_A1652BarSerDsc ;
   private int[] P06N94_A136BarColNum ;
   private String[] P06N94_A135BarColNom ;
   private short[] P06N94_A226BarTraP3 ;
   private short[] P06N94_A225BarTraP2 ;
   private short[] P06N94_A224BarTraP1 ;
   private String[] P06N94_A223BarTra3 ;
   private String[] P06N94_A222BarTra2 ;
   private String[] P06N94_A221BarTra1 ;
   private int[] P06N94_A1235BarNumCli ;
   private String[] P06N94_A1234BarNomCli ;
   private int[] P06N94_A252CliCod ;
   private boolean[] P06N94_n252CliCod ;
   private String[] P06N94_A143BarDisNum ;
   private java.math.BigDecimal[] P06N94_A168BarKgmLan ;
   private java.math.BigDecimal[] P06N94_A166BarKgm ;
   private short[] P06N94_A199BarPie1 ;
   private String[] P06N94_A365DisDes ;
   private int[] P06N94_A898BarPieNDes ;
   private String[] P06N95_A396EmprCod ;
   private boolean[] P06N95_n396EmprCod ;
   private int[] P06N95_A1199MacCod ;
   private String[] P06N95_A1205MacBarPar ;
   private byte[] P06N95_A1204MacBarReo ;
   private int[] P06N95_A1203MacBarCod ;
   private short[] P06N95_A1201MacLin ;
   private String[] P06N96_A396EmprCod ;
   private boolean[] P06N96_n396EmprCod ;
   private byte[] P06N96_A831TipColCod ;
   private String[] P06N97_A396EmprCod ;
   private boolean[] P06N97_n396EmprCod ;
   private int[] P06N97_A129BarCod ;
   private boolean[] P06N97_n129BarCod ;
   private byte[] P06N97_A132BarCodReo ;
   private boolean[] P06N97_n132BarCodReo ;
   private String[] P06N97_A130BarCodPar ;
   private boolean[] P06N97_n130BarCodPar ;
   private String[] P06N97_A3213SolFriNor ;
   private boolean[] P06N97_n3213SolFriNor ;
   private String[] P06N97_A3211SolFriMaS ;
   private boolean[] P06N97_n3211SolFriMaS ;
   private String[] P06N97_A3212SolFriMaH ;
   private boolean[] P06N97_n3212SolFriMaH ;
   private int[] P06N97_A3196SolFriCod ;
   private String[] P06N98_A396EmprCod ;
   private boolean[] P06N98_n396EmprCod ;
   private int[] P06N98_A129BarCod ;
   private boolean[] P06N98_n129BarCod ;
   private byte[] P06N98_A132BarCodReo ;
   private boolean[] P06N98_n132BarCodReo ;
   private String[] P06N98_A130BarCodPar ;
   private boolean[] P06N98_n130BarCodPar ;
   private String[] P06N98_A3187SolColNor ;
   private boolean[] P06N98_n3187SolColNor ;
   private String[] P06N98_A3189SolColTac ;
   private boolean[] P06N98_n3189SolColTac ;
   private String[] P06N98_A3190SolColCo ;
   private boolean[] P06N98_n3190SolColCo ;
   private String[] P06N98_A3191SolColPa6 ;
   private boolean[] P06N98_n3191SolColPa6 ;
   private String[] P06N98_A3192SolColPes ;
   private boolean[] P06N98_n3192SolColPes ;
   private String[] P06N98_A3193SolColPac ;
   private boolean[] P06N98_n3193SolColPac ;
   private String[] P06N98_A3194SolColWo ;
   private boolean[] P06N98_n3194SolColWo ;
   private String[] P06N98_A1345SolColAlt ;
   private boolean[] P06N98_n1345SolColAlt ;
   private int[] P06N98_A1348SolColCod ;
   private String[] P06N99_A396EmprCod ;
   private boolean[] P06N99_n396EmprCod ;
   private int[] P06N99_A129BarCod ;
   private boolean[] P06N99_n129BarCod ;
   private byte[] P06N99_A132BarCodReo ;
   private boolean[] P06N99_n132BarCodReo ;
   private String[] P06N99_A130BarCodPar ;
   private boolean[] P06N99_n130BarCodPar ;
   private short[] P06N99_A1332EstDimAnc ;
   private boolean[] P06N99_n1332EstDimAnc ;
   private short[] P06N99_A1338EstDimGrm2 ;
   private boolean[] P06N99_n1338EstDimGrm2 ;
   private java.math.BigDecimal[] P06N99_A3874EstCalEA ;
   private boolean[] P06N99_n3874EstCalEA ;
   private java.math.BigDecimal[] P06N99_A3875EstCalEL ;
   private boolean[] P06N99_n3875EstCalEL ;
   private java.math.BigDecimal[] P06N99_A3876EstRamEA ;
   private boolean[] P06N99_n3876EstRamEA ;
   private java.math.BigDecimal[] P06N99_A3877EstRamEL ;
   private boolean[] P06N99_n3877EstRamEL ;
   private java.math.BigDecimal[] P06N99_A3872EstSanfEA ;
   private boolean[] P06N99_n3872EstSanfEA ;
   private java.math.BigDecimal[] P06N99_A3873EstSanfEL ;
   private boolean[] P06N99_n3873EstSanfEL ;
   private int[] P06N99_A1333EstDimCod ;
   private String[] P06N910_A396EmprCod ;
   private boolean[] P06N910_n396EmprCod ;
   private int[] P06N910_A361DisCod ;
   private String[] P06N910_A377DisObsTxt ;
   private byte[] P06N910_A376DisObsLin ;
   private String[] P06N911_A396EmprCod ;
   private boolean[] P06N911_n396EmprCod ;
   private int[] P06N911_A129BarCod ;
   private boolean[] P06N911_n129BarCod ;
   private byte[] P06N911_A132BarCodReo ;
   private boolean[] P06N911_n132BarCodReo ;
   private String[] P06N911_A130BarCodPar ;
   private boolean[] P06N911_n130BarCodPar ;
   private short[] P06N911_A761ProFasLin ;
   private boolean[] P06N911_n761ProFasLin ;
   private String[] P06N911_A759ProDsc ;
   private String[] P06N911_A758ProCod ;
   private String[] P06N912_A396EmprCod ;
   private boolean[] P06N912_n396EmprCod ;
   private int[] P06N912_A129BarCod ;
   private boolean[] P06N912_n129BarCod ;
   private byte[] P06N912_A132BarCodReo ;
   private boolean[] P06N912_n132BarCodReo ;
   private String[] P06N912_A130BarCodPar ;
   private boolean[] P06N912_n130BarCodPar ;
   private short[] P06N912_A194BarOrdLin ;
   private String[] P06N912_A758ProCod ;
   private String[] P06N912_A603MaqCodBis ;
   private String[] P06N912_A460FasDsc ;
   private String[] P06N912_A457FasCod ;
   private String[] P06N913_A396EmprCod ;
   private boolean[] P06N913_n396EmprCod ;
   private int[] P06N913_A129BarCod ;
   private boolean[] P06N913_n129BarCod ;
   private byte[] P06N913_A132BarCodReo ;
   private boolean[] P06N913_n132BarCodReo ;
   private String[] P06N913_A130BarCodPar ;
   private boolean[] P06N913_n130BarCodPar ;
   private String[] P06N913_A758ProCod ;
   private short[] P06N913_A194BarOrdLin ;
   private String[] P06N913_A3296BarParObs ;
   private short[] P06N913_A1664ParFasCod ;
   private String[] P06N914_A396EmprCod ;
   private boolean[] P06N914_n396EmprCod ;
   private int[] P06N914_A1199MacCod ;
   private String[] P06N914_A1205MacBarPar ;
   private byte[] P06N914_A1204MacBarReo ;
   private int[] P06N914_A1203MacBarCod ;
   private short[] P06N914_A1201MacLin ;
   private String[] P06N915_A602MaqCod ;
   private String[] P06N915_A396EmprCod ;
   private boolean[] P06N915_n396EmprCod ;
   private String[] P06N915_A606MaqDsc ;
   private boolean[] P06N915_n606MaqDsc ;
   private short[] P06N916_A970ProceCod ;
   private boolean[] P06N916_n970ProceCod ;
   private String[] P06N916_A396EmprCod ;
   private boolean[] P06N916_n396EmprCod ;
   private int[] P06N916_A361DisCod ;
   private String[] P06N916_A46AlbREnt ;
   private java.util.Date[] P06N916_A49AlbRFen ;
   private String[] P06N916_A50AlbRLoc ;
   private String[] P06N916_A971ProceNom ;
   private boolean[] P06N916_n971ProceNom ;
   private int[] P06N916_A44AlbRecCod ;
   private short[] P06N917_A829TipArtCod ;
   private String[] P06N917_A396EmprCod ;
   private boolean[] P06N917_n396EmprCod ;
   private String[] P06N917_A830TipArtDsc ;
   private boolean[] P06N917_n830TipArtDsc ;
}

final  class rhdrtin3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06N92", "SELECT EmprCod, TermCod, TermUsu FROM TXPTERMIN WHERE (TermCod = ?) AND (EmprCod = ?) ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06N94", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarTipCol, T1.BarEstReo, T1.BarTipArt, T1.BarMaqCod, T1.BarGraAca, T1.BarAncAca1, T1.BarAncCru1, T1.BarGraCru, T1.BarEncAnh, T1.BarEncCom, T3.TipDefDsc, T1.TipDefCod, T2.PriCod, T1.BarFecGen, T1.BarSer, T4.CliNom, T1.BarFecCli, T1.BarSerDsc, T1.BarColNum, T1.BarColNom, T1.BarTraP3, T1.BarTraP2, T1.BarTraP1, T1.BarTra3, T1.BarTra2, T1.BarTra1, T1.BarNumCli, T1.BarNomCli, T1.CliCod, T1.BarDisNum, COALESCE( T5.BarKgmLan, 0) AS BarKgmLan, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T5.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes FROM ((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKgmLan, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06N95", "SELECT EmprCod, MacCod, MacBarPar, MacBarReo, MacBarCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N96", "SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06N97", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SolFriNor, SolFriMaS, SolFriMaH, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N98", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SolColNor, SolColTac, SolColCo, SolColPa6, SolColPes, SolColPac, SolColWo, SolColAlt, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N99", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EstDimAnc, EstDimGrm2, EstCalEA, EstCalEL, EstRamEA, EstRamEL, EstSanfEA, EstSanfEL, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N910", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N911", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProFasLin, T2.ProDsc, T1.ProCod FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N912", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.ProCod, T1.MaqCodBis, T2.FasDsc, T1.FasCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N913", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarParObs, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N914", "SELECT EmprCod, MacCod, MacBarPar, MacBarReo, MacBarCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N915", "SELECT MaqCod, EmprCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06N916", "SELECT T2.ProceCod, T1.EmprCod, T1.DisCod, T2.AlbREnt, T2.AlbRFen, T2.AlbRLoc, T3.ProceNom, T1.AlbRecCod FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06N917", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 1);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 30);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(22);
               ((String[]) buf[25])[0] = rslt.getString(23, 26);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 13);
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 4);
               ((String[]) buf[32])[0] = rslt.getString(30, 4);
               ((String[]) buf[33])[0] = rslt.getString(31, 4);
               ((int[]) buf[34])[0] = rslt.getInt(32);
               ((String[]) buf[35])[0] = rslt.getString(33, 13);
               ((int[]) buf[36])[0] = rslt.getInt(34);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(35, 8);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(37,2);
               ((short[]) buf[41])[0] = rslt.getShort(38);
               ((String[]) buf[42])[0] = rslt.getString(39, 1);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
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
            case 14 :
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
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
               stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 8);
               stmt.setShort(6, ((Number) parms[9]).shortValue());
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
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

