package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pgrmodv_header_group extends GXReport
{
   public pgrmodv_header_group( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrmodv_header_group.class ), "" );
   }

   public pgrmodv_header_group( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          long aP1 ,
                          String aP2 ,
                          String aP3 ,
                          int[] aP4 ,
                          int[] aP5 )
   {
      pgrmodv_header_group.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        IReportHandler reportHandler )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, reportHandler);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             IReportHandler reportHandler )
   {
      pgrmodv_header_group.this.A396EmprCod = aP0;
      pgrmodv_header_group.this.A30AlbProCod = aP1;
      pgrmodv_header_group.this.AV8ImpCod = aP2;
      pgrmodv_header_group.this.AV44TextoCopia = aP3;
      pgrmodv_header_group.this.Gx_page = aP4[0];
      this.aP4 = aP4;
      pgrmodv_header_group.this.Gx_line = aP5[0];
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
         GXv_char1[0] = AV55ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRMODA", ""), GXv_char1) ;
         pgrmodv_header_group.this.AV55ContDsc = GXv_char1[0] ;
         GXt_char2 = AV65Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pgrmodv_header_group.this.A396EmprCod = GXv_char1[0] ;
         pgrmodv_header_group.this.GXt_char2 = GXv_char4[0] ;
         AV65Firmad = GXt_char2 ;
         /* Using cursor P0AGT2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0AGT2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AGT2_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0AGT2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AGT2_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0AGT2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AGT2_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AGT2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AGT2_n8336EmpItm3[0] ;
            AV62Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV63Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P0AGT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1259AlbDomEnv = P0AGT3_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P0AGT3_n1259AlbDomEnv[0] ;
            A39AlbProPri = P0AGT3_A39AlbProPri[0] ;
            A10017AlbFmd = P0AGT3_A10017AlbFmd[0] ;
            n10017AlbFmd = P0AGT3_n10017AlbFmd[0] ;
            A7101AlbLic = P0AGT3_A7101AlbLic[0] ;
            A407EmprNom = P0AGT3_A407EmprNom[0] ;
            n407EmprNom = P0AGT3_n407EmprNom[0] ;
            A5140AlbMarca = P0AGT3_A5140AlbMarca[0] ;
            A1879AlbProEnt = P0AGT3_A1879AlbProEnt[0] ;
            n1879AlbProEnt = P0AGT3_n1879AlbProEnt[0] ;
            A33AlbProEst = P0AGT3_A33AlbProEst[0] ;
            A1782AlbProEso = P0AGT3_A1782AlbProEso[0] ;
            A3865AlbHorSal = P0AGT3_A3865AlbHorSal[0] ;
            A3868AlbMat = P0AGT3_A3868AlbMat[0] ;
            A34AlbProfch = P0AGT3_A34AlbProfch[0] ;
            A1243GuiRemCli = P0AGT3_A1243GuiRemCli[0] ;
            A407EmprNom = P0AGT3_A407EmprNom[0] ;
            n407EmprNom = P0AGT3_n407EmprNom[0] ;
            AV9CliCod = A1243GuiRemCli ;
            AV15CliEnvDom = A1259AlbDomEnv ;
            AV22Prioridad = A39AlbProPri ;
            /* Execute user subroutine: 'CLIENTE' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV64Texto_fd = " " ;
            if ( GXutil.strcmp(A10017AlbFmd, " ") != 0 )
            {
               AV66Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
               AV64Texto_fd = AV66Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV65Firmad) ;
            }
            else
            {
               AV64Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV67AtId = " " ;
            if ( GXutil.strcmp(A7101AlbLic, " ") != 0 )
            {
               AV67AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A7101AlbLic, 1, 12)) ;
            }
            AV14EmprNom = A407EmprNom ;
            AV50VDoc = httpContext.getMessage( "Guia de Remessa Nº", "") ;
            if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
            {
               AV50VDoc = httpContext.getMessage( "Guia de Transito Nº", "") ;
            }
            if ( AV42Copias == 1 )
            {
               AV39vCopia = httpContext.getMessage( "DUPLICADO", "") ;
            }
            AV51i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV52vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Using cursor P0AGT4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A916AlbPObs = P0AGT4_A916AlbPObs[0] ;
                  A915AlbPObsLin = P0AGT4_A915AlbPObsLin[0] ;
                  if ( AV51i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV52vObs[AV51i-1] = A916AlbPObs ;
                  AV51i = (byte)(AV51i+1) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            else
            {
               /* Using cursor P0AGT5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A12184DltObs = P0AGT5_A12184DltObs[0] ;
                  n12184DltObs = P0AGT5_n12184DltObs[0] ;
                  A12185DltLinObs = P0AGT5_A12185DltLinObs[0] ;
                  if ( AV51i > 4 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV52vObs[AV51i-1] = A12184DltObs ;
                  AV51i = (byte)(AV51i+1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            AV68TxtAnulado = "" ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
            {
               AV68TxtAnulado = httpContext.getMessage( "ANULADO", "") ;
            }
            AV41ContLine = (byte)(0) ;
            AV45Matricula = GXutil.substring( A1879AlbProEnt, 1, 10) ;
            AV74Albprocod = A30AlbProCod ;
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
            {
               /* Execute user subroutine: 'ALBBAR' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /* Execute user subroutine: 'DLT001' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            if ( A33AlbProEst == 0 )
            {
               A33AlbProEst = (byte)(1) ;
               A1782AlbProEso = (byte)(1) ;
            }
            /* Using cursor P0AGT6 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Force skipping of lines */
         hAGT0( false, 0) ;
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV47TotKgs = DecimalUtil.doubleToDec(0) ;
      AV46TotPzas = 0 ;
      AV54TotVal = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AGT8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(AV74Albprocod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = P0AGT8_A130BarCodPar[0] ;
         A132BarCodReo = P0AGT8_A132BarCodReo[0] ;
         A129BarCod = P0AGT8_A129BarCod[0] ;
         A136BarColNum = P0AGT8_A136BarColNum[0] ;
         A252CliCod = P0AGT8_A252CliCod[0] ;
         n252CliCod = P0AGT8_n252CliCod[0] ;
         A143BarDisNum = P0AGT8_A143BarDisNum[0] ;
         A1234BarNomCli = P0AGT8_A1234BarNomCli[0] ;
         A135BarColNom = P0AGT8_A135BarColNom[0] ;
         A1261BarAlbKgmE = P0AGT8_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P0AGT8_A1265BarAlbPie[0] ;
         A1652BarSerDsc = P0AGT8_A1652BarSerDsc[0] ;
         A2243BarKgsCli = P0AGT8_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P0AGT8_n2243BarKgsCli[0] ;
         A1262BarPreKgm = P0AGT8_A1262BarPreKgm[0] ;
         A166BarKgm = P0AGT8_A166BarKgm[0] ;
         n166BarKgm = P0AGT8_n166BarKgm[0] ;
         A136BarColNum = P0AGT8_A136BarColNum[0] ;
         A252CliCod = P0AGT8_A252CliCod[0] ;
         n252CliCod = P0AGT8_n252CliCod[0] ;
         A143BarDisNum = P0AGT8_A143BarDisNum[0] ;
         A1234BarNomCli = P0AGT8_A1234BarNomCli[0] ;
         A135BarColNom = P0AGT8_A135BarColNom[0] ;
         A1652BarSerDsc = P0AGT8_A1652BarSerDsc[0] ;
         A166BarKgm = P0AGT8_A166BarKgm[0] ;
         n166BarKgm = P0AGT8_n166BarKgm[0] ;
         AV43barcolnum = A136BarColNum ;
         AV48Hdr = ((GXutil.strcmp(AV76CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A129BarCod, 8, 0) : ((A132BarCodReo>0) ? GXutil.str( A129BarCod, 8, 0)+" "+GXutil.str( A132BarCodReo, 1, 0) : GXutil.str( A129BarCod, 8, 0))) ;
         AV77Barcod = A129BarCod ;
         AV78Barcodreo = A132BarCodReo ;
         AV79Barcodpar = A130BarCodPar ;
         AV9CliCod = A252CliCod ;
         AV69Bardisnum = A143BarDisNum ;
         AV71BarNomCli = A1234BarNomCli ;
         AV72Barcolnom = A135BarColNom ;
         AV49KgsE = A166BarKgm ;
         AV59KgsS = A1261BarAlbKgmE ;
         AV73BarALbPie = (short)(A1265BarAlbPie) ;
         AV70BarSerDsc = A1652BarSerDsc ;
         if ( A2243BarKgsCli.doubleValue() != 0 )
         {
            AV59KgsS = A2243BarKgsCli ;
         }
         AV53vValor = A1262BarPreKgm ;
         AV41ContLine = (byte)(AV41ContLine+1) ;
         AV46TotPzas = (int)(AV46TotPzas+A1265BarAlbPie) ;
         AV47TotKgs = AV47TotKgs.add(AV59KgsS) ;
         AV54TotVal = AV54TotVal.add(AV53vValor) ;
         /* Using cursor P0AGT9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A1276FasMtr = P0AGT9_A1276FasMtr[0] ;
            A1242GuiFasPMt = P0AGT9_A1242GuiFasPMt[0] ;
            A8195GuiFasPBM = P0AGT9_A8195GuiFasPBM[0] ;
            n8195GuiFasPBM = P0AGT9_n8195GuiFasPBM[0] ;
            A1241GuiFasPKg = P0AGT9_A1241GuiFasPKg[0] ;
            A1275FasKgm = P0AGT9_A1275FasKgm[0] ;
            A8194GuiFasPBK = P0AGT9_A8194GuiFasPBK[0] ;
            n8194GuiFasPBK = P0AGT9_n8194GuiFasPBK[0] ;
            A1240GuiFasLin = P0AGT9_A1240GuiFasLin[0] ;
            AV58Uni = "" ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1242GuiFasPMt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) )
            {
               AV53vValor = A1242GuiFasPMt ;
               AV58Uni = httpContext.getMessage( "M", "") ;
               AV61FasMtr = A1276FasMtr ;
               if ( A8195GuiFasPBM.doubleValue() != 0 )
               {
                  AV61FasMtr = A8195GuiFasPBM ;
               }
            }
            else
            {
               AV53vValor = A1241GuiFasPKg ;
               AV58Uni = httpContext.getMessage( "K", "") ;
               AV60KgsFasS = A1275FasKgm ;
               if ( A8194GuiFasPBK.doubleValue() != 0 )
               {
                  AV60KgsFasS = A8194GuiFasPBK ;
               }
            }
            AV41ContLine = (byte)(AV41ContLine+1) ;
            AV54TotVal = AV54TotVal.add(AV53vValor) ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'DLT001' Routine */
      returnInSub = false ;
      AV47TotKgs = DecimalUtil.doubleToDec(0) ;
      AV46TotPzas = 0 ;
      AV54TotVal = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AGT10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(AV74Albprocod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A12178DltP = P0AGT10_A12178DltP[0] ;
         A12177DltR = P0AGT10_A12177DltR[0] ;
         A12176DltHdr = P0AGT10_A12176DltHdr[0] ;
         A12153DltColNum = P0AGT10_A12153DltColNum[0] ;
         n12153DltColNum = P0AGT10_n12153DltColNum[0] ;
         A12145DltKgs = P0AGT10_A12145DltKgs[0] ;
         n12145DltKgs = P0AGT10_n12145DltKgs[0] ;
         A12147DltPzs = P0AGT10_A12147DltPzs[0] ;
         n12147DltPzs = P0AGT10_n12147DltPzs[0] ;
         A12151DltArtDsc = P0AGT10_A12151DltArtDsc[0] ;
         n12151DltArtDsc = P0AGT10_n12151DltArtDsc[0] ;
         A12186DltKgsCli = P0AGT10_A12186DltKgsCli[0] ;
         n12186DltKgsCli = P0AGT10_n12186DltKgsCli[0] ;
         A12163DltPreKg = P0AGT10_A12163DltPreKg[0] ;
         n12163DltPreKg = P0AGT10_n12163DltPreKg[0] ;
         AV43barcolnum = A12153DltColNum ;
         AV48Hdr = ((GXutil.strcmp(AV76CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A12176DltHdr, 8, 0) : ((A12177DltR>0) ? GXutil.str( A12176DltHdr, 8, 0)+" "+GXutil.str( A12177DltR, 1, 0) : GXutil.str( A12176DltHdr, 8, 0))) ;
         AV77Barcod = A12176DltHdr ;
         AV78Barcodreo = A12177DltR ;
         AV79Barcodpar = A12178DltP ;
         /* Execute user subroutine: 'BARCAD' */
         S139 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            getPrinter().GxEndPage() ;
            returnInSub = true;
            if (true) return;
         }
         AV49KgsE = AV75BarKgm ;
         AV59KgsS = A12145DltKgs ;
         AV73BarALbPie = (short)(A12147DltPzs) ;
         AV70BarSerDsc = A12151DltArtDsc ;
         if ( A12186DltKgsCli.doubleValue() != 0 )
         {
            AV59KgsS = A12186DltKgsCli ;
         }
         AV53vValor = A12163DltPreKg ;
         AV41ContLine = (byte)(AV41ContLine+1) ;
         AV46TotPzas = (int)(AV46TotPzas+A12147DltPzs) ;
         AV47TotKgs = AV47TotKgs.add(AV59KgsS) ;
         AV54TotVal = AV54TotVal.add(AV53vValor) ;
         /* Using cursor P0AGT11 */
         pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A12175DltMtsFs = P0AGT11_A12175DltMtsFs[0] ;
            n12175DltMtsFs = P0AGT11_n12175DltMtsFs[0] ;
            A12190DltPrMFs = P0AGT11_A12190DltPrMFs[0] ;
            n12190DltPrMFs = P0AGT11_n12190DltPrMFs[0] ;
            A12192DltPrMBFs = P0AGT11_A12192DltPrMBFs[0] ;
            n12192DltPrMBFs = P0AGT11_n12192DltPrMBFs[0] ;
            A12189DltPrKFs = P0AGT11_A12189DltPrKFs[0] ;
            n12189DltPrKFs = P0AGT11_n12189DltPrKFs[0] ;
            A12174DltKgsFs = P0AGT11_A12174DltKgsFs[0] ;
            n12174DltKgsFs = P0AGT11_n12174DltKgsFs[0] ;
            A12191DltPrKBFs = P0AGT11_A12191DltPrKBFs[0] ;
            n12191DltPrKBFs = P0AGT11_n12191DltPrKBFs[0] ;
            A12182DltLin = P0AGT11_A12182DltLin[0] ;
            AV58Uni = "" ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12190DltPrMFs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A12175DltMtsFs)==0) )
            {
               AV53vValor = A12190DltPrMFs ;
               AV58Uni = httpContext.getMessage( "M", "") ;
               AV61FasMtr = A12175DltMtsFs ;
               if ( A12192DltPrMBFs.doubleValue() != 0 )
               {
                  AV61FasMtr = A12192DltPrMBFs ;
               }
            }
            else
            {
               AV53vValor = A12189DltPrKFs ;
               AV58Uni = httpContext.getMessage( "K", "") ;
               AV60KgsFasS = A12174DltKgsFs ;
               if ( A12191DltPrKBFs.doubleValue() != 0 )
               {
                  AV60KgsFasS = A12191DltPrKBFs ;
               }
            }
            AV41ContLine = (byte)(AV41ContLine+1) ;
            AV54TotVal = AV54TotVal.add(AV53vValor) ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S139( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P0AGT13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV77Barcod), Byte.valueOf(AV78Barcodreo), AV79Barcodpar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A130BarCodPar = P0AGT13_A130BarCodPar[0] ;
         A132BarCodReo = P0AGT13_A132BarCodReo[0] ;
         A129BarCod = P0AGT13_A129BarCod[0] ;
         A252CliCod = P0AGT13_A252CliCod[0] ;
         n252CliCod = P0AGT13_n252CliCod[0] ;
         A143BarDisNum = P0AGT13_A143BarDisNum[0] ;
         A1234BarNomCli = P0AGT13_A1234BarNomCli[0] ;
         A135BarColNom = P0AGT13_A135BarColNom[0] ;
         A166BarKgm = P0AGT13_A166BarKgm[0] ;
         n166BarKgm = P0AGT13_n166BarKgm[0] ;
         A166BarKgm = P0AGT13_A166BarKgm[0] ;
         n166BarKgm = P0AGT13_n166BarKgm[0] ;
         AV9CliCod = A252CliCod ;
         AV75BarKgm = A166BarKgm ;
         AV69Bardisnum = A143BarDisNum ;
         AV71BarNomCli = A1234BarNomCli ;
         AV72Barcolnom = A135BarColNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV10CliNom = "" ;
      AV11CliDom = "" ;
      AV12Clicp = "" ;
      AV13CliPob = "" ;
      AV40CliNif = "" ;
      AV16CliENom = "" ;
      AV17CliEDom = "" ;
      AV18CliEcp = "" ;
      AV19CliEPob = "" ;
      AV76CliImpReop = httpContext.getMessage( "N", "") ;
      /* Using cursor P0AGT14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A252CliCod = P0AGT14_A252CliCod[0] ;
         n252CliCod = P0AGT14_n252CliCod[0] ;
         A279CliNom = P0AGT14_A279CliNom[0] ;
         A260CliDom = P0AGT14_A260CliDom[0] ;
         A256CliCp = P0AGT14_A256CliCp[0] ;
         A295CliPob = P0AGT14_A295CliPob[0] ;
         A278CliNif = P0AGT14_A278CliNif[0] ;
         A13012CliImpReop = P0AGT14_A13012CliImpReop[0] ;
         AV10CliNom = A279CliNom ;
         AV11CliDom = A260CliDom ;
         AV12Clicp = A256CliCp ;
         AV13CliPob = A295CliPob ;
         AV40CliNif = A278CliNif ;
         AV76CliImpReop = A13012CliImpReop ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      /* Execute user subroutine: 'ENVIO' */
      S151 ();
      if (returnInSub) return;
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P0AGT15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), Byte.valueOf(AV15CliEnvDom)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A266CliEnvLin = P0AGT15_A266CliEnvLin[0] ;
         A252CliCod = P0AGT15_A252CliCod[0] ;
         n252CliCod = P0AGT15_n252CliCod[0] ;
         A267CliEnvNom = P0AGT15_A267CliEnvNom[0] ;
         A265CliEnvDom = P0AGT15_A265CliEnvDom[0] ;
         A264CliEnvCp = P0AGT15_A264CliEnvCp[0] ;
         A268CliEnvPob = P0AGT15_A268CliEnvPob[0] ;
         AV16CliENom = A267CliEnvNom ;
         AV17CliEDom = A265CliEnvDom ;
         AV18CliEcp = A264CliEnvCp ;
         AV19CliEPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void hAGT0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OS.", ""), 100, Gx_line+376, 122, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Descriçao", ""), 183, Gx_line+376, 277, Gx_line+392, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 594, Gx_line+378, 631, Gx_line+394, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qui./Mtr.", ""), 643, Gx_line+370, 689, Gx_line+386, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(6, Gx_line+275, 780, Gx_line+364, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(6, Gx_line+368, 780, Gx_line+402, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 30, Gx_line+284, 91, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 30, Gx_line+302, 122, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 30, Gx_line+320, 61, Gx_line+336, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora de Carga:", ""), 30, Gx_line+336, 119, Gx_line+352, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Contibuinte:", ""), 535, Gx_line+284, 621, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 535, Gx_line+302, 647, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 535, Gx_line+336, 590, Gx_line+352, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Cor", ""), 467, Gx_line+376, 501, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(154, Gx_line+368, 154, Gx_line+401, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(344, Gx_line+369, 344, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Refª", ""), 549, Gx_line+377, 590, Gx_line+393, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+369, 592, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(548, Gx_line+369, 548, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), 130, Gx_line+284, 175, Gx_line+301, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 130, Gx_line+320, 181, Gx_line+337, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 130, Gx_line+302, 213, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40CliNif, "@!")), 664, Gx_line+284, 769, Gx_line+301, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalaçoes", ""), 664, Gx_line+302, 745, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Encom.", ""), 13, Gx_line+376, 68, Gx_line+392, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(66, Gx_line+369, 66, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3868AlbMat, "")), 605, Gx_line+336, 710, Gx_line+353, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), 130, Gx_line+336, 223, Gx_line+353, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(633, Gx_line+369, 633, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 646, Gx_line+385, 688, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(702, Gx_line+369, 702, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 733, Gx_line+370, 762, Gx_line+386, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Unitario", ""), 725, Gx_line+385, 771, Gx_line+401, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Cor", ""), 379, Gx_line+378, 411, Gx_line+394, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(444, Gx_line+369, 444, Gx_line+402, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10CliNom, "")), 467, Gx_line+188, 656, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11CliDom, "")), 467, Gx_line+207, 681, Gx_line+225, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13CliPob, "")), 467, Gx_line+240, 656, Gx_line+258, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TextoCopia, "")), 686, Gx_line+147, 781, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 686, Gx_line+121, 781, Gx_line+142, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50VDoc, "")), 467, Gx_line+121, 635, Gx_line+142, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(446, Gx_line+177, 780, Gx_line+267, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 6, Gx_line+15, 763, Gx_line+101) ;
               getPrinter().GxAttris("Arial", 28, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TxtAnulado, "")), 31, Gx_line+143, 407, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "95455c83-4215-4a0c-83f2-f37dd13189ec", "", context.getHttpContext().getTheme( )), 6, Gx_line+229, 431, Gx_line+265) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+409) ;
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
      this.aP4[0] = pgrmodv_header_group.this.Gx_page;
      this.aP5[0] = pgrmodv_header_group.this.Gx_line;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV55ContDsc = "" ;
      AV65Firmad = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P0AGT2_A396EmprCod = new String[] {""} ;
      P0AGT2_A8335EmpItm2 = new String[] {""} ;
      P0AGT2_n8335EmpItm2 = new boolean[] {false} ;
      P0AGT2_A8334EmpItm1 = new String[] {""} ;
      P0AGT2_n8334EmpItm1 = new boolean[] {false} ;
      P0AGT2_A8337EmpItm4 = new String[] {""} ;
      P0AGT2_n8337EmpItm4 = new boolean[] {false} ;
      P0AGT2_A8336EmpItm3 = new String[] {""} ;
      P0AGT2_n8336EmpItm3 = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      AV62Texto_1 = "" ;
      AV63Texto_2 = "" ;
      P0AGT3_A396EmprCod = new String[] {""} ;
      P0AGT3_A30AlbProCod = new long[1] ;
      P0AGT3_A1259AlbDomEnv = new byte[1] ;
      P0AGT3_n1259AlbDomEnv = new boolean[] {false} ;
      P0AGT3_A39AlbProPri = new String[] {""} ;
      P0AGT3_A10017AlbFmd = new String[] {""} ;
      P0AGT3_n10017AlbFmd = new boolean[] {false} ;
      P0AGT3_A7101AlbLic = new String[] {""} ;
      P0AGT3_A407EmprNom = new String[] {""} ;
      P0AGT3_n407EmprNom = new boolean[] {false} ;
      P0AGT3_A5140AlbMarca = new String[] {""} ;
      P0AGT3_A1879AlbProEnt = new String[] {""} ;
      P0AGT3_n1879AlbProEnt = new boolean[] {false} ;
      P0AGT3_A33AlbProEst = new byte[1] ;
      P0AGT3_A1782AlbProEso = new byte[1] ;
      P0AGT3_A3865AlbHorSal = new String[] {""} ;
      P0AGT3_A3868AlbMat = new String[] {""} ;
      P0AGT3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGT3_A1243GuiRemCli = new int[1] ;
      A39AlbProPri = "" ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      A407EmprNom = "" ;
      A5140AlbMarca = "" ;
      A1879AlbProEnt = "" ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV22Prioridad = "" ;
      AV64Texto_fd = "" ;
      AV66Firma4dig = "" ;
      AV67AtId = "" ;
      AV14EmprNom = "" ;
      AV50VDoc = "" ;
      AV39vCopia = "" ;
      AV52vObs = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV52vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AGT4_A396EmprCod = new String[] {""} ;
      P0AGT4_A30AlbProCod = new long[1] ;
      P0AGT4_A916AlbPObs = new String[] {""} ;
      P0AGT4_A915AlbPObsLin = new byte[1] ;
      A916AlbPObs = "" ;
      P0AGT5_A396EmprCod = new String[] {""} ;
      P0AGT5_A30AlbProCod = new long[1] ;
      P0AGT5_A12184DltObs = new String[] {""} ;
      P0AGT5_n12184DltObs = new boolean[] {false} ;
      P0AGT5_A12185DltLinObs = new byte[1] ;
      A12184DltObs = "" ;
      AV68TxtAnulado = "" ;
      AV45Matricula = "" ;
      AV47TotKgs = DecimalUtil.ZERO ;
      AV54TotVal = DecimalUtil.ZERO ;
      P0AGT8_A396EmprCod = new String[] {""} ;
      P0AGT8_A130BarCodPar = new String[] {""} ;
      P0AGT8_A132BarCodReo = new byte[1] ;
      P0AGT8_A129BarCod = new int[1] ;
      P0AGT8_A30AlbProCod = new long[1] ;
      P0AGT8_A136BarColNum = new int[1] ;
      P0AGT8_A252CliCod = new int[1] ;
      P0AGT8_n252CliCod = new boolean[] {false} ;
      P0AGT8_A143BarDisNum = new String[] {""} ;
      P0AGT8_A1234BarNomCli = new String[] {""} ;
      P0AGT8_A135BarColNom = new String[] {""} ;
      P0AGT8_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT8_A1265BarAlbPie = new int[1] ;
      P0AGT8_A1652BarSerDsc = new String[] {""} ;
      P0AGT8_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT8_n2243BarKgsCli = new boolean[] {false} ;
      P0AGT8_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT8_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV48Hdr = "" ;
      AV76CliImpReop = "" ;
      AV79Barcodpar = "" ;
      AV69Bardisnum = "" ;
      AV71BarNomCli = "" ;
      AV72Barcolnom = "" ;
      AV49KgsE = DecimalUtil.ZERO ;
      AV59KgsS = DecimalUtil.ZERO ;
      AV70BarSerDsc = "" ;
      AV53vValor = DecimalUtil.ZERO ;
      P0AGT9_A396EmprCod = new String[] {""} ;
      P0AGT9_A30AlbProCod = new long[1] ;
      P0AGT9_A129BarCod = new int[1] ;
      P0AGT9_A132BarCodReo = new byte[1] ;
      P0AGT9_A130BarCodPar = new String[] {""} ;
      P0AGT9_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT9_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT9_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT9_n8195GuiFasPBM = new boolean[] {false} ;
      P0AGT9_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT9_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT9_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT9_n8194GuiFasPBK = new boolean[] {false} ;
      P0AGT9_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      AV58Uni = "" ;
      AV61FasMtr = DecimalUtil.ZERO ;
      AV60KgsFasS = DecimalUtil.ZERO ;
      P0AGT10_A396EmprCod = new String[] {""} ;
      P0AGT10_A12178DltP = new String[] {""} ;
      P0AGT10_A12177DltR = new byte[1] ;
      P0AGT10_A12176DltHdr = new int[1] ;
      P0AGT10_A30AlbProCod = new long[1] ;
      P0AGT10_A12153DltColNum = new int[1] ;
      P0AGT10_n12153DltColNum = new boolean[] {false} ;
      P0AGT10_A12145DltKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT10_n12145DltKgs = new boolean[] {false} ;
      P0AGT10_A12147DltPzs = new int[1] ;
      P0AGT10_n12147DltPzs = new boolean[] {false} ;
      P0AGT10_A12151DltArtDsc = new String[] {""} ;
      P0AGT10_n12151DltArtDsc = new boolean[] {false} ;
      P0AGT10_A12186DltKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT10_n12186DltKgsCli = new boolean[] {false} ;
      P0AGT10_A12163DltPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT10_n12163DltPreKg = new boolean[] {false} ;
      A12178DltP = "" ;
      A12145DltKgs = DecimalUtil.ZERO ;
      A12151DltArtDsc = "" ;
      A12186DltKgsCli = DecimalUtil.ZERO ;
      A12163DltPreKg = DecimalUtil.ZERO ;
      AV75BarKgm = DecimalUtil.ZERO ;
      P0AGT11_A396EmprCod = new String[] {""} ;
      P0AGT11_A30AlbProCod = new long[1] ;
      P0AGT11_A12176DltHdr = new int[1] ;
      P0AGT11_A12177DltR = new byte[1] ;
      P0AGT11_A12178DltP = new String[] {""} ;
      P0AGT11_A12175DltMtsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT11_n12175DltMtsFs = new boolean[] {false} ;
      P0AGT11_A12190DltPrMFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT11_n12190DltPrMFs = new boolean[] {false} ;
      P0AGT11_A12192DltPrMBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT11_n12192DltPrMBFs = new boolean[] {false} ;
      P0AGT11_A12189DltPrKFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT11_n12189DltPrKFs = new boolean[] {false} ;
      P0AGT11_A12174DltKgsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT11_n12174DltKgsFs = new boolean[] {false} ;
      P0AGT11_A12191DltPrKBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT11_n12191DltPrKBFs = new boolean[] {false} ;
      P0AGT11_A12182DltLin = new short[1] ;
      A12175DltMtsFs = DecimalUtil.ZERO ;
      A12190DltPrMFs = DecimalUtil.ZERO ;
      A12192DltPrMBFs = DecimalUtil.ZERO ;
      A12189DltPrKFs = DecimalUtil.ZERO ;
      A12174DltKgsFs = DecimalUtil.ZERO ;
      A12191DltPrKBFs = DecimalUtil.ZERO ;
      P0AGT13_A396EmprCod = new String[] {""} ;
      P0AGT13_A130BarCodPar = new String[] {""} ;
      P0AGT13_A132BarCodReo = new byte[1] ;
      P0AGT13_A129BarCod = new int[1] ;
      P0AGT13_A252CliCod = new int[1] ;
      P0AGT13_n252CliCod = new boolean[] {false} ;
      P0AGT13_A143BarDisNum = new String[] {""} ;
      P0AGT13_A1234BarNomCli = new String[] {""} ;
      P0AGT13_A135BarColNom = new String[] {""} ;
      P0AGT13_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGT13_n166BarKgm = new boolean[] {false} ;
      AV10CliNom = "" ;
      AV11CliDom = "" ;
      AV12Clicp = "" ;
      AV13CliPob = "" ;
      AV40CliNif = "" ;
      AV16CliENom = "" ;
      AV17CliEDom = "" ;
      AV18CliEcp = "" ;
      AV19CliEPob = "" ;
      P0AGT14_A396EmprCod = new String[] {""} ;
      P0AGT14_A252CliCod = new int[1] ;
      P0AGT14_n252CliCod = new boolean[] {false} ;
      P0AGT14_A279CliNom = new String[] {""} ;
      P0AGT14_A260CliDom = new String[] {""} ;
      P0AGT14_A256CliCp = new String[] {""} ;
      P0AGT14_A295CliPob = new String[] {""} ;
      P0AGT14_A278CliNif = new String[] {""} ;
      P0AGT14_A13012CliImpReop = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A13012CliImpReop = "" ;
      P0AGT15_A396EmprCod = new String[] {""} ;
      P0AGT15_A266CliEnvLin = new byte[1] ;
      P0AGT15_A252CliCod = new int[1] ;
      P0AGT15_n252CliCod = new boolean[] {false} ;
      P0AGT15_A267CliEnvNom = new String[] {""} ;
      P0AGT15_A265CliEnvDom = new String[] {""} ;
      P0AGT15_A264CliEnvCp = new String[] {""} ;
      P0AGT15_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.pgrmodv_header_group__default(),
         new Object[] {
             new Object[] {
            P0AGT2_A396EmprCod, P0AGT2_A8335EmpItm2, P0AGT2_n8335EmpItm2, P0AGT2_A8334EmpItm1, P0AGT2_n8334EmpItm1, P0AGT2_A8337EmpItm4, P0AGT2_n8337EmpItm4, P0AGT2_A8336EmpItm3, P0AGT2_n8336EmpItm3
            }
            , new Object[] {
            P0AGT3_A396EmprCod, P0AGT3_A30AlbProCod, P0AGT3_A1259AlbDomEnv, P0AGT3_n1259AlbDomEnv, P0AGT3_A39AlbProPri, P0AGT3_A10017AlbFmd, P0AGT3_n10017AlbFmd, P0AGT3_A7101AlbLic, P0AGT3_A407EmprNom, P0AGT3_n407EmprNom,
            P0AGT3_A5140AlbMarca, P0AGT3_A1879AlbProEnt, P0AGT3_n1879AlbProEnt, P0AGT3_A33AlbProEst, P0AGT3_A1782AlbProEso, P0AGT3_A3865AlbHorSal, P0AGT3_A3868AlbMat, P0AGT3_A34AlbProfch, P0AGT3_A1243GuiRemCli
            }
            , new Object[] {
            P0AGT4_A396EmprCod, P0AGT4_A30AlbProCod, P0AGT4_A916AlbPObs, P0AGT4_A915AlbPObsLin
            }
            , new Object[] {
            P0AGT5_A396EmprCod, P0AGT5_A30AlbProCod, P0AGT5_A12184DltObs, P0AGT5_n12184DltObs, P0AGT5_A12185DltLinObs
            }
            , new Object[] {
            }
            , new Object[] {
            P0AGT8_A396EmprCod, P0AGT8_A130BarCodPar, P0AGT8_A132BarCodReo, P0AGT8_A129BarCod, P0AGT8_A30AlbProCod, P0AGT8_A136BarColNum, P0AGT8_A252CliCod, P0AGT8_n252CliCod, P0AGT8_A143BarDisNum, P0AGT8_A1234BarNomCli,
            P0AGT8_A135BarColNom, P0AGT8_A1261BarAlbKgmE, P0AGT8_A1265BarAlbPie, P0AGT8_A1652BarSerDsc, P0AGT8_A2243BarKgsCli, P0AGT8_n2243BarKgsCli, P0AGT8_A1262BarPreKgm, P0AGT8_A166BarKgm, P0AGT8_n166BarKgm
            }
            , new Object[] {
            P0AGT9_A396EmprCod, P0AGT9_A30AlbProCod, P0AGT9_A129BarCod, P0AGT9_A132BarCodReo, P0AGT9_A130BarCodPar, P0AGT9_A1276FasMtr, P0AGT9_A1242GuiFasPMt, P0AGT9_A8195GuiFasPBM, P0AGT9_n8195GuiFasPBM, P0AGT9_A1241GuiFasPKg,
            P0AGT9_A1275FasKgm, P0AGT9_A8194GuiFasPBK, P0AGT9_n8194GuiFasPBK, P0AGT9_A1240GuiFasLin
            }
            , new Object[] {
            P0AGT10_A396EmprCod, P0AGT10_A12178DltP, P0AGT10_A12177DltR, P0AGT10_A12176DltHdr, P0AGT10_A30AlbProCod, P0AGT10_A12153DltColNum, P0AGT10_n12153DltColNum, P0AGT10_A12145DltKgs, P0AGT10_n12145DltKgs, P0AGT10_A12147DltPzs,
            P0AGT10_n12147DltPzs, P0AGT10_A12151DltArtDsc, P0AGT10_n12151DltArtDsc, P0AGT10_A12186DltKgsCli, P0AGT10_n12186DltKgsCli, P0AGT10_A12163DltPreKg, P0AGT10_n12163DltPreKg
            }
            , new Object[] {
            P0AGT11_A396EmprCod, P0AGT11_A30AlbProCod, P0AGT11_A12176DltHdr, P0AGT11_A12177DltR, P0AGT11_A12178DltP, P0AGT11_A12175DltMtsFs, P0AGT11_n12175DltMtsFs, P0AGT11_A12190DltPrMFs, P0AGT11_n12190DltPrMFs, P0AGT11_A12192DltPrMBFs,
            P0AGT11_n12192DltPrMBFs, P0AGT11_A12189DltPrKFs, P0AGT11_n12189DltPrKFs, P0AGT11_A12174DltKgsFs, P0AGT11_n12174DltKgsFs, P0AGT11_A12191DltPrKBFs, P0AGT11_n12191DltPrKBFs, P0AGT11_A12182DltLin
            }
            , new Object[] {
            P0AGT13_A396EmprCod, P0AGT13_A130BarCodPar, P0AGT13_A132BarCodReo, P0AGT13_A129BarCod, P0AGT13_A252CliCod, P0AGT13_n252CliCod, P0AGT13_A143BarDisNum, P0AGT13_A1234BarNomCli, P0AGT13_A135BarColNom, P0AGT13_A166BarKgm,
            P0AGT13_n166BarKgm
            }
            , new Object[] {
            P0AGT14_A396EmprCod, P0AGT14_A252CliCod, P0AGT14_A279CliNom, P0AGT14_A260CliDom, P0AGT14_A256CliCp, P0AGT14_A295CliPob, P0AGT14_A278CliNif, P0AGT14_A13012CliImpReop
            }
            , new Object[] {
            P0AGT15_A396EmprCod, P0AGT15_A266CliEnvLin, P0AGT15_A252CliCod, P0AGT15_A267CliEnvNom, P0AGT15_A265CliEnvDom, P0AGT15_A264CliEnvCp, P0AGT15_A268CliEnvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1259AlbDomEnv ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte AV15CliEnvDom ;
   private byte AV42Copias ;
   private byte AV51i ;
   private byte A915AlbPObsLin ;
   private byte A12185DltLinObs ;
   private byte AV41ContLine ;
   private byte A132BarCodReo ;
   private byte AV78Barcodreo ;
   private byte A12177DltR ;
   private byte A266CliEnvLin ;
   private short AV73BarALbPie ;
   private short A1240GuiFasLin ;
   private short A12182DltLin ;
   private short Gx_err ;
   private int Gx_page ;
   private int Gx_line ;
   private int M_top ;
   private int M_bot ;
   private int P_lines ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A1243GuiRemCli ;
   private int AV9CliCod ;
   private int GX_I ;
   private int AV46TotPzas ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1265BarAlbPie ;
   private int AV43barcolnum ;
   private int AV77Barcod ;
   private int A12176DltHdr ;
   private int A12153DltColNum ;
   private int A12147DltPzs ;
   private int Gx_OldLine ;
   private long A30AlbProCod ;
   private long AV74Albprocod ;
   private java.math.BigDecimal AV47TotKgs ;
   private java.math.BigDecimal AV54TotVal ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV49KgsE ;
   private java.math.BigDecimal AV59KgsS ;
   private java.math.BigDecimal AV53vValor ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal AV61FasMtr ;
   private java.math.BigDecimal AV60KgsFasS ;
   private java.math.BigDecimal A12145DltKgs ;
   private java.math.BigDecimal A12186DltKgsCli ;
   private java.math.BigDecimal A12163DltPreKg ;
   private java.math.BigDecimal AV75BarKgm ;
   private java.math.BigDecimal A12175DltMtsFs ;
   private java.math.BigDecimal A12190DltPrMFs ;
   private java.math.BigDecimal A12192DltPrMBFs ;
   private java.math.BigDecimal A12189DltPrKFs ;
   private java.math.BigDecimal A12174DltKgsFs ;
   private java.math.BigDecimal A12191DltPrKBFs ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV44TextoCopia ;
   private String AV55ContDsc ;
   private String AV65Firmad ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String AV62Texto_1 ;
   private String AV63Texto_2 ;
   private String A39AlbProPri ;
   private String A7101AlbLic ;
   private String A407EmprNom ;
   private String A5140AlbMarca ;
   private String A1879AlbProEnt ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String AV22Prioridad ;
   private String AV64Texto_fd ;
   private String AV66Firma4dig ;
   private String AV67AtId ;
   private String AV14EmprNom ;
   private String AV50VDoc ;
   private String AV39vCopia ;
   private String AV52vObs[] ;
   private String A916AlbPObs ;
   private String A12184DltObs ;
   private String AV68TxtAnulado ;
   private String AV45Matricula ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String AV48Hdr ;
   private String AV76CliImpReop ;
   private String AV79Barcodpar ;
   private String AV69Bardisnum ;
   private String AV71BarNomCli ;
   private String AV72Barcolnom ;
   private String AV70BarSerDsc ;
   private String AV58Uni ;
   private String A12178DltP ;
   private String A12151DltArtDsc ;
   private String AV10CliNom ;
   private String AV11CliDom ;
   private String AV12Clicp ;
   private String AV13CliPob ;
   private String AV40CliNif ;
   private String AV16CliENom ;
   private String AV17CliEDom ;
   private String AV18CliEcp ;
   private String AV19CliEPob ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A13012CliImpReop ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date A34AlbProfch ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean GxHdr3 ;
   private boolean n1259AlbDomEnv ;
   private boolean n10017AlbFmd ;
   private boolean n407EmprNom ;
   private boolean n1879AlbProEnt ;
   private boolean returnInSub ;
   private boolean n12184DltObs ;
   private boolean n252CliCod ;
   private boolean n2243BarKgsCli ;
   private boolean n166BarKgm ;
   private boolean n8195GuiFasPBM ;
   private boolean n8194GuiFasPBK ;
   private boolean n12153DltColNum ;
   private boolean n12145DltKgs ;
   private boolean n12147DltPzs ;
   private boolean n12151DltArtDsc ;
   private boolean n12186DltKgsCli ;
   private boolean n12163DltPreKg ;
   private boolean n12175DltMtsFs ;
   private boolean n12190DltPrMFs ;
   private boolean n12192DltPrMBFs ;
   private boolean n12189DltPrKFs ;
   private boolean n12174DltKgsFs ;
   private boolean n12191DltPrKBFs ;
   private String A10017AlbFmd ;
   private IReportHandler reportHandler ;
   private int[] aP5 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGT2_A396EmprCod ;
   private String[] P0AGT2_A8335EmpItm2 ;
   private boolean[] P0AGT2_n8335EmpItm2 ;
   private String[] P0AGT2_A8334EmpItm1 ;
   private boolean[] P0AGT2_n8334EmpItm1 ;
   private String[] P0AGT2_A8337EmpItm4 ;
   private boolean[] P0AGT2_n8337EmpItm4 ;
   private String[] P0AGT2_A8336EmpItm3 ;
   private boolean[] P0AGT2_n8336EmpItm3 ;
   private String[] P0AGT3_A396EmprCod ;
   private long[] P0AGT3_A30AlbProCod ;
   private byte[] P0AGT3_A1259AlbDomEnv ;
   private boolean[] P0AGT3_n1259AlbDomEnv ;
   private String[] P0AGT3_A39AlbProPri ;
   private String[] P0AGT3_A10017AlbFmd ;
   private boolean[] P0AGT3_n10017AlbFmd ;
   private String[] P0AGT3_A7101AlbLic ;
   private String[] P0AGT3_A407EmprNom ;
   private boolean[] P0AGT3_n407EmprNom ;
   private String[] P0AGT3_A5140AlbMarca ;
   private String[] P0AGT3_A1879AlbProEnt ;
   private boolean[] P0AGT3_n1879AlbProEnt ;
   private byte[] P0AGT3_A33AlbProEst ;
   private byte[] P0AGT3_A1782AlbProEso ;
   private String[] P0AGT3_A3865AlbHorSal ;
   private String[] P0AGT3_A3868AlbMat ;
   private java.util.Date[] P0AGT3_A34AlbProfch ;
   private int[] P0AGT3_A1243GuiRemCli ;
   private String[] P0AGT4_A396EmprCod ;
   private long[] P0AGT4_A30AlbProCod ;
   private String[] P0AGT4_A916AlbPObs ;
   private byte[] P0AGT4_A915AlbPObsLin ;
   private String[] P0AGT5_A396EmprCod ;
   private long[] P0AGT5_A30AlbProCod ;
   private String[] P0AGT5_A12184DltObs ;
   private boolean[] P0AGT5_n12184DltObs ;
   private byte[] P0AGT5_A12185DltLinObs ;
   private String[] P0AGT8_A396EmprCod ;
   private String[] P0AGT8_A130BarCodPar ;
   private byte[] P0AGT8_A132BarCodReo ;
   private int[] P0AGT8_A129BarCod ;
   private long[] P0AGT8_A30AlbProCod ;
   private int[] P0AGT8_A136BarColNum ;
   private int[] P0AGT8_A252CliCod ;
   private boolean[] P0AGT8_n252CliCod ;
   private String[] P0AGT8_A143BarDisNum ;
   private String[] P0AGT8_A1234BarNomCli ;
   private String[] P0AGT8_A135BarColNom ;
   private java.math.BigDecimal[] P0AGT8_A1261BarAlbKgmE ;
   private int[] P0AGT8_A1265BarAlbPie ;
   private String[] P0AGT8_A1652BarSerDsc ;
   private java.math.BigDecimal[] P0AGT8_A2243BarKgsCli ;
   private boolean[] P0AGT8_n2243BarKgsCli ;
   private java.math.BigDecimal[] P0AGT8_A1262BarPreKgm ;
   private java.math.BigDecimal[] P0AGT8_A166BarKgm ;
   private boolean[] P0AGT8_n166BarKgm ;
   private String[] P0AGT9_A396EmprCod ;
   private long[] P0AGT9_A30AlbProCod ;
   private int[] P0AGT9_A129BarCod ;
   private byte[] P0AGT9_A132BarCodReo ;
   private String[] P0AGT9_A130BarCodPar ;
   private java.math.BigDecimal[] P0AGT9_A1276FasMtr ;
   private java.math.BigDecimal[] P0AGT9_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0AGT9_A8195GuiFasPBM ;
   private boolean[] P0AGT9_n8195GuiFasPBM ;
   private java.math.BigDecimal[] P0AGT9_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P0AGT9_A1275FasKgm ;
   private java.math.BigDecimal[] P0AGT9_A8194GuiFasPBK ;
   private boolean[] P0AGT9_n8194GuiFasPBK ;
   private short[] P0AGT9_A1240GuiFasLin ;
   private String[] P0AGT10_A396EmprCod ;
   private String[] P0AGT10_A12178DltP ;
   private byte[] P0AGT10_A12177DltR ;
   private int[] P0AGT10_A12176DltHdr ;
   private long[] P0AGT10_A30AlbProCod ;
   private int[] P0AGT10_A12153DltColNum ;
   private boolean[] P0AGT10_n12153DltColNum ;
   private java.math.BigDecimal[] P0AGT10_A12145DltKgs ;
   private boolean[] P0AGT10_n12145DltKgs ;
   private int[] P0AGT10_A12147DltPzs ;
   private boolean[] P0AGT10_n12147DltPzs ;
   private String[] P0AGT10_A12151DltArtDsc ;
   private boolean[] P0AGT10_n12151DltArtDsc ;
   private java.math.BigDecimal[] P0AGT10_A12186DltKgsCli ;
   private boolean[] P0AGT10_n12186DltKgsCli ;
   private java.math.BigDecimal[] P0AGT10_A12163DltPreKg ;
   private boolean[] P0AGT10_n12163DltPreKg ;
   private String[] P0AGT11_A396EmprCod ;
   private long[] P0AGT11_A30AlbProCod ;
   private int[] P0AGT11_A12176DltHdr ;
   private byte[] P0AGT11_A12177DltR ;
   private String[] P0AGT11_A12178DltP ;
   private java.math.BigDecimal[] P0AGT11_A12175DltMtsFs ;
   private boolean[] P0AGT11_n12175DltMtsFs ;
   private java.math.BigDecimal[] P0AGT11_A12190DltPrMFs ;
   private boolean[] P0AGT11_n12190DltPrMFs ;
   private java.math.BigDecimal[] P0AGT11_A12192DltPrMBFs ;
   private boolean[] P0AGT11_n12192DltPrMBFs ;
   private java.math.BigDecimal[] P0AGT11_A12189DltPrKFs ;
   private boolean[] P0AGT11_n12189DltPrKFs ;
   private java.math.BigDecimal[] P0AGT11_A12174DltKgsFs ;
   private boolean[] P0AGT11_n12174DltKgsFs ;
   private java.math.BigDecimal[] P0AGT11_A12191DltPrKBFs ;
   private boolean[] P0AGT11_n12191DltPrKBFs ;
   private short[] P0AGT11_A12182DltLin ;
   private String[] P0AGT13_A396EmprCod ;
   private String[] P0AGT13_A130BarCodPar ;
   private byte[] P0AGT13_A132BarCodReo ;
   private int[] P0AGT13_A129BarCod ;
   private int[] P0AGT13_A252CliCod ;
   private boolean[] P0AGT13_n252CliCod ;
   private String[] P0AGT13_A143BarDisNum ;
   private String[] P0AGT13_A1234BarNomCli ;
   private String[] P0AGT13_A135BarColNom ;
   private java.math.BigDecimal[] P0AGT13_A166BarKgm ;
   private boolean[] P0AGT13_n166BarKgm ;
   private String[] P0AGT14_A396EmprCod ;
   private int[] P0AGT14_A252CliCod ;
   private boolean[] P0AGT14_n252CliCod ;
   private String[] P0AGT14_A279CliNom ;
   private String[] P0AGT14_A260CliDom ;
   private String[] P0AGT14_A256CliCp ;
   private String[] P0AGT14_A295CliPob ;
   private String[] P0AGT14_A278CliNif ;
   private String[] P0AGT14_A13012CliImpReop ;
   private String[] P0AGT15_A396EmprCod ;
   private byte[] P0AGT15_A266CliEnvLin ;
   private int[] P0AGT15_A252CliCod ;
   private boolean[] P0AGT15_n252CliCod ;
   private String[] P0AGT15_A267CliEnvNom ;
   private String[] P0AGT15_A265CliEnvDom ;
   private String[] P0AGT15_A264CliEnvCp ;
   private String[] P0AGT15_A268CliEnvPob ;
}

final  class pgrmodv_header_group__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGT2", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGT3", "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbDomEnv, T1.AlbProPri, T1.AlbFmd, T1.AlbLic, T2.EmprNom, T1.AlbMarca, T1.AlbProEnt, T1.AlbProEst, T1.AlbProEso, T1.AlbHorSal, T1.AlbMat, T1.AlbProfch, T1.GuiRemCli FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod  FOR UPDATE OF T1.AlbProEst, T1.AlbProEso NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGT4", "SELECT EmprCod, AlbProCod, AlbPObs, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGT5", "SELECT EmprCod, AlbProCod, DltObs, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AGT6", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P0AGT8", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.BarColNum, T2.CliCod, T2.BarDisNum, T2.BarNomCli, T2.BarColNom, T1.BarAlbKgmE, T1.BarAlbPie, T2.BarSerDsc, T1.BarKgsCli, T1.BarPreKgm, COALESCE( T4.BarKgm, 0) AS BarKgm FROM (((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGT9", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasMtr, GuiFasPMt, GuiFasPBM, GuiFasPKg, FasKgm, GuiFasPBK, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGT10", "SELECT EmprCod, DltP, DltR, DltHdr, AlbProCod, DltColNum, DltKgs, DltPzs, DltArtDsc, DltKgsCli, DltPreKg FROM TXPDLT001 WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGT11", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltMtsFs, DltPrMFs, DltPrMBFs, DltPrKFs, DltKgsFs, DltPrKBFs, DltLin FROM TXPDLT004 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGT13", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarDisNum, T1.BarNomCli, T1.BarColNom, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGT14", "SELECT EmprCod, CliCod, CliNom, CliDom, CliCp, CliPob, CliNif, CliImpReop FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGT15", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 8);
               ((String[]) buf[16])[0] = rslt.getString(13, 20);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((int[]) buf[18])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 11 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

