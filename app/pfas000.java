package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfas000 extends GXProcedure
{
   public pfas000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfas000.class ), "" );
   }

   public pfas000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            short[] aP5 )
   {
      pfas000.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 )
   {
      pfas000.this.AV16Emprcod = aP0[0];
      this.aP0 = aP0;
      pfas000.this.AV17Barcod = aP1[0];
      this.aP1 = aP1;
      pfas000.this.AV18Barcodreo = aP2[0];
      this.aP2 = aP2;
      pfas000.this.AV19Barcodpar = aP3[0];
      this.aP3 = aP3;
      pfas000.this.AV20Codpro = aP4[0];
      this.aP4 = aP4;
      pfas000.this.AV21Ordlin = aP5[0];
      this.aP5 = aP5;
      pfas000.this.AV22RenOrdlin = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "&BarCod=", "") + GXutil.str( AV17Barcod, 8, 0) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "&BarCodreo=", "") + GXutil.str( AV18Barcodreo, 1, 0) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "&BarCodpar=", "") + AV19Barcodpar + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "&CodPro=", "") + AV20Codpro + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "&RenOrdLin=", "") + GXutil.str( AV22RenOrdlin, 4, 0) + GXutil.chr( (short)(13)) ;
      /* Using cursor P04432 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV17Barcod), Byte.valueOf(AV18Barcodreo), AV19Barcodpar, AV20Codpro, Short.valueOf(AV22RenOrdlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12671BarParVl2 = P04432_A12671BarParVl2[0] ;
         A194BarOrdLin = P04432_A194BarOrdLin[0] ;
         A758ProCod = P04432_A758ProCod[0] ;
         A130BarCodPar = P04432_A130BarCodPar[0] ;
         A132BarCodReo = P04432_A132BarCodReo[0] ;
         A129BarCod = P04432_A129BarCod[0] ;
         A396EmprCod = P04432_A396EmprCod[0] ;
         A14079BarParPLC = P04432_A14079BarParPLC[0] ;
         A13992BarParVMx = P04432_A13992BarParVMx[0] ;
         A13991BarParVMn = P04432_A13991BarParVMn[0] ;
         A10257Itm_ord5 = P04432_A10257Itm_ord5[0] ;
         A9737BarValPar = P04432_A9737BarValPar[0] ;
         A3693BarParTxt = P04432_A3693BarParTxt[0] ;
         n3693BarParTxt = P04432_n3693BarParTxt[0] ;
         A3296BarParObs = P04432_A3296BarParObs[0] ;
         A3295BarParVal = P04432_A3295BarParVal[0] ;
         A1664ParFasCod = P04432_A1664ParFasCod[0] ;
         if ( GXutil.strcmp(A396EmprCod, httpContext.getMessage( "XYZ", "")) == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPBarPar

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            W1664ParFasCod = A1664ParFasCod ;
            W3295BarParVal = A3295BarParVal ;
            W9737BarValPar = A9737BarValPar ;
            W10257Itm_ord5 = A10257Itm_ord5 ;
            W12671BarParVl2 = A12671BarParVl2 ;
            A396EmprCod = AV16Emprcod ;
            A129BarCod = AV17Barcod ;
            A132BarCodReo = AV18Barcodreo ;
            A130BarCodPar = AV19Barcodpar ;
            A758ProCod = AV20Codpro ;
            A194BarOrdLin = AV21Ordlin ;
            A12671BarParVl2 = A12670ParFasVl2 ;
            /* Using cursor P04433 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod), A3295BarParVal, A3296BarParObs, Boolean.valueOf(n3693BarParTxt), A3693BarParTxt, A9737BarValPar, Short.valueOf(A10257Itm_ord5), A12671BarParVl2, A13991BarParVMn, A13992BarParVMx, A14079BarParPLC});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            A1664ParFasCod = W1664ParFasCod ;
            A3295BarParVal = W3295BarParVal ;
            A9737BarValPar = W9737BarValPar ;
            A10257Itm_ord5 = W10257Itm_ord5 ;
            A12671BarParVl2 = W12671BarParVl2 ;
            /* End Insert */
            /* Using cursor P04434 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04435 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV17Barcod), Byte.valueOf(AV18Barcodreo), AV19Barcodpar, AV20Codpro, Short.valueOf(AV22RenOrdlin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A194BarOrdLin = P04435_A194BarOrdLin[0] ;
         A758ProCod = P04435_A758ProCod[0] ;
         A130BarCodPar = P04435_A130BarCodPar[0] ;
         A132BarCodReo = P04435_A132BarCodReo[0] ;
         A129BarCod = P04435_A129BarCod[0] ;
         A396EmprCod = P04435_A396EmprCod[0] ;
         A577Zep_st = P04435_A577Zep_st[0] ;
         n577Zep_st = P04435_n577Zep_st[0] ;
         A578Zep_und = P04435_A578Zep_und[0] ;
         n578Zep_und = P04435_n578Zep_und[0] ;
         A579Zep_cant = P04435_A579Zep_cant[0] ;
         n579Zep_cant = P04435_n579Zep_cant[0] ;
         A719PrdNum = P04435_A719PrdNum[0] ;
         if ( GXutil.strcmp(A396EmprCod, httpContext.getMessage( "XYZ", "")) == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPZEPHYR

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            W719PrdNum = A719PrdNum ;
            W579Zep_cant = A579Zep_cant ;
            n579Zep_cant = false ;
            W577Zep_st = A577Zep_st ;
            n577Zep_st = false ;
            W578Zep_und = A578Zep_und ;
            n578Zep_und = false ;
            A396EmprCod = AV16Emprcod ;
            A129BarCod = AV17Barcod ;
            A132BarCodReo = AV18Barcodreo ;
            A130BarCodPar = AV19Barcodpar ;
            A758ProCod = AV20Codpro ;
            A194BarOrdLin = AV21Ordlin ;
            n579Zep_cant = false ;
            n577Zep_st = false ;
            n578Zep_und = false ;
            /* Using cursor P04436 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A719PrdNum, Boolean.valueOf(n579Zep_cant), A579Zep_cant, Boolean.valueOf(n578Zep_und), Byte.valueOf(A578Zep_und), Boolean.valueOf(n577Zep_st), Byte.valueOf(A577Zep_st)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPZEPHYR");
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            A719PrdNum = W719PrdNum ;
            A579Zep_cant = W579Zep_cant ;
            n579Zep_cant = false ;
            A577Zep_st = W577Zep_st ;
            n577Zep_st = false ;
            A578Zep_und = W578Zep_und ;
            n578Zep_und = false ;
            /* End Insert */
            /* Using cursor P04437 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPZEPHYR");
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P04438 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV17Barcod), Byte.valueOf(AV18Barcodreo), AV19Barcodpar, AV20Codpro, Short.valueOf(AV22RenOrdlin)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A194BarOrdLin = P04438_A194BarOrdLin[0] ;
         A758ProCod = P04438_A758ProCod[0] ;
         A130BarCodPar = P04438_A130BarCodPar[0] ;
         A132BarCodReo = P04438_A132BarCodReo[0] ;
         A129BarCod = P04438_A129BarCod[0] ;
         A396EmprCod = P04438_A396EmprCod[0] ;
         A6662BarEstPec = P04438_A6662BarEstPec[0] ;
         n6662BarEstPec = P04438_n6662BarEstPec[0] ;
         A4939BarFasInc1 = P04438_A4939BarFasInc1[0] ;
         n4939BarFasInc1 = P04438_n4939BarFasInc1[0] ;
         A4928BarFasDtf1 = P04438_A4928BarFasDtf1[0] ;
         n4928BarFasDtf1 = P04438_n4928BarFasDtf1[0] ;
         A4927BarFasDti1 = P04438_A4927BarFasDti1[0] ;
         n4927BarFasDti1 = P04438_n4927BarFasDti1[0] ;
         A4648BarFasRecu = P04438_A4648BarFasRecu[0] ;
         n4648BarFasRecu = P04438_n4648BarFasRecu[0] ;
         A4315BarNumBot1 = P04438_A4315BarNumBot1[0] ;
         n4315BarNumBot1 = P04438_n4315BarNumBot1[0] ;
         A4314BarFasBot1 = P04438_A4314BarFasBot1[0] ;
         n4314BarFasBot1 = P04438_n4314BarFasBot1[0] ;
         A4313BarFasPri1 = P04438_A4313BarFasPri1[0] ;
         n4313BarFasPri1 = P04438_n4313BarFasPri1[0] ;
         A4647BarFasNPr1 = P04438_A4647BarFasNPr1[0] ;
         n4647BarFasNPr1 = P04438_n4647BarFasNPr1[0] ;
         A4312BarFasKgm1 = P04438_A4312BarFasKgm1[0] ;
         n4312BarFasKgm1 = P04438_n4312BarFasKgm1[0] ;
         A4311BarFasMtr1 = P04438_A4311BarFasMtr1[0] ;
         n4311BarFasMtr1 = P04438_n4311BarFasMtr1[0] ;
         A4310BarTieRea1 = P04438_A4310BarTieRea1[0] ;
         n4310BarTieRea1 = P04438_n4310BarTieRea1[0] ;
         A4309BarHorFin1 = P04438_A4309BarHorFin1[0] ;
         n4309BarHorFin1 = P04438_n4309BarHorFin1[0] ;
         A4308BarHorIni1 = P04438_A4308BarHorIni1[0] ;
         n4308BarHorIni1 = P04438_n4308BarHorIni1[0] ;
         A4307BarUni1 = P04438_A4307BarUni1[0] ;
         n4307BarUni1 = P04438_n4307BarUni1[0] ;
         A4306BarTieTeo1 = P04438_A4306BarTieTeo1[0] ;
         n4306BarTieTeo1 = P04438_n4306BarTieTeo1[0] ;
         A4305BarFecRea1 = P04438_A4305BarFecRea1[0] ;
         n4305BarFecRea1 = P04438_n4305BarFecRea1[0] ;
         A4304BarFecRIn1 = P04438_A4304BarFecRIn1[0] ;
         n4304BarFecRIn1 = P04438_n4304BarFecRIn1[0] ;
         A4303BarFasEst1 = P04438_A4303BarFasEst1[0] ;
         n4303BarFasEst1 = P04438_n4303BarFasEst1[0] ;
         A4302BarMaqFas1 = P04438_A4302BarMaqFas1[0] ;
         n4302BarMaqFas1 = P04438_n4302BarMaqFas1[0] ;
         A4646BarFasMts = P04438_A4646BarFasMts[0] ;
         n4646BarFasMts = P04438_n4646BarFasMts[0] ;
         A4645BarFasKgs = P04438_A4645BarFasKgs[0] ;
         n4645BarFasKgs = P04438_n4645BarFasKgs[0] ;
         A4644BarFasNPrd = P04438_A4644BarFasNPrd[0] ;
         n4644BarFasNPrd = P04438_n4644BarFasNPrd[0] ;
         A4643BarFasLot = P04438_A4643BarFasLot[0] ;
         if ( GXutil.strcmp(A396EmprCod, httpContext.getMessage( "XYZ", "")) == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPFASMAQ

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            W4643BarFasLot = A4643BarFasLot ;
            W4644BarFasNPrd = A4644BarFasNPrd ;
            n4644BarFasNPrd = false ;
            A396EmprCod = AV16Emprcod ;
            A129BarCod = AV17Barcod ;
            A132BarCodReo = AV18Barcodreo ;
            A130BarCodPar = AV19Barcodpar ;
            A758ProCod = AV20Codpro ;
            A194BarOrdLin = AV21Ordlin ;
            n4644BarFasNPrd = false ;
            /* Using cursor P04439 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Boolean.valueOf(n4644BarFasNPrd), Short.valueOf(A4644BarFasNPrd), Boolean.valueOf(n4645BarFasKgs), A4645BarFasKgs, Boolean.valueOf(n4646BarFasMts), A4646BarFasMts, Boolean.valueOf(n4302BarMaqFas1), A4302BarMaqFas1, Boolean.valueOf(n4303BarFasEst1), Byte.valueOf(A4303BarFasEst1), Boolean.valueOf(n4304BarFecRIn1), A4304BarFecRIn1, Boolean.valueOf(n4305BarFecRea1), A4305BarFecRea1, Boolean.valueOf(n4306BarTieTeo1), A4306BarTieTeo1, Boolean.valueOf(n4307BarUni1), A4307BarUni1, Boolean.valueOf(n4308BarHorIni1), Short.valueOf(A4308BarHorIni1), Boolean.valueOf(n4309BarHorFin1), Short.valueOf(A4309BarHorFin1), Boolean.valueOf(n4310BarTieRea1), A4310BarTieRea1, Boolean.valueOf(n4311BarFasMtr1), A4311BarFasMtr1, Boolean.valueOf(n4312BarFasKgm1), A4312BarFasKgm1, Boolean.valueOf(n4647BarFasNPr1), Short.valueOf(A4647BarFasNPr1), Boolean.valueOf(n4313BarFasPri1), Byte.valueOf(A4313BarFasPri1), Boolean.valueOf(n4314BarFasBot1), A4314BarFasBot1, Boolean.valueOf(n4315BarNumBot1), Integer.valueOf(A4315BarNumBot1), Boolean.valueOf(n4648BarFasRecu), Integer.valueOf(A4648BarFasRecu), Boolean.valueOf(n4927BarFasDti1), A4927BarFasDti1, Boolean.valueOf(n4928BarFasDtf1), A4928BarFasDtf1, Boolean.valueOf(n4939BarFasInc1), Byte.valueOf(A4939BarFasInc1), Boolean.valueOf(n6662BarEstPec), A6662BarEstPec});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
            if ( (pr_default.getStatus(7) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            A4643BarFasLot = W4643BarFasLot ;
            A4644BarFasNPrd = W4644BarFasNPrd ;
            n4644BarFasNPrd = false ;
            /* End Insert */
            /* Using cursor P044310 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P044311 */
      pr_default.execute(9, new Object[] {Integer.valueOf(AV17Barcod), Byte.valueOf(AV18Barcodreo), AV19Barcodpar, AV20Codpro, Short.valueOf(AV22RenOrdlin)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A194BarOrdLin = P044311_A194BarOrdLin[0] ;
         A758ProCod = P044311_A758ProCod[0] ;
         A130BarCodPar = P044311_A130BarCodPar[0] ;
         A132BarCodReo = P044311_A132BarCodReo[0] ;
         A129BarCod = P044311_A129BarCod[0] ;
         A396EmprCod = P044311_A396EmprCod[0] ;
         A10258Itm_ord3 = P044311_A10258Itm_ord3[0] ;
         n10258Itm_ord3 = P044311_n10258Itm_ord3[0] ;
         A10089BarPFVin = P044311_A10089BarPFVin[0] ;
         n10089BarPFVin = P044311_n10089BarPFVin[0] ;
         A10088BarPFTxt = P044311_A10088BarPFTxt[0] ;
         n10088BarPFTxt = P044311_n10088BarPFTxt[0] ;
         A10087BarPFob1 = P044311_A10087BarPFob1[0] ;
         n10087BarPFob1 = P044311_n10087BarPFob1[0] ;
         A10086BarPFVal = P044311_A10086BarPFVal[0] ;
         n10086BarPFVal = P044311_n10086BarPFVal[0] ;
         A10084BarPFcod = P044311_A10084BarPFcod[0] ;
         A4643BarFasLot = P044311_A4643BarFasLot[0] ;
         if ( GXutil.strcmp(A396EmprCod, httpContext.getMessage( "XYZ", "")) == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPFASPFA

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            W4643BarFasLot = A4643BarFasLot ;
            W10084BarPFcod = A10084BarPFcod ;
            W10258Itm_ord3 = A10258Itm_ord3 ;
            n10258Itm_ord3 = false ;
            A396EmprCod = AV16Emprcod ;
            A129BarCod = AV17Barcod ;
            A132BarCodReo = AV18Barcodreo ;
            A130BarCodPar = AV19Barcodpar ;
            A758ProCod = AV20Codpro ;
            A194BarOrdLin = AV21Ordlin ;
            n10258Itm_ord3 = false ;
            /* Using cursor P044312 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Short.valueOf(A10084BarPFcod), Boolean.valueOf(n10086BarPFVal), A10086BarPFVal, Boolean.valueOf(n10087BarPFob1), A10087BarPFob1, Boolean.valueOf(n10088BarPFTxt), A10088BarPFTxt, Boolean.valueOf(n10089BarPFVin), A10089BarPFVin, Boolean.valueOf(n10258Itm_ord3), Short.valueOf(A10258Itm_ord3)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPFA");
            if ( (pr_default.getStatus(10) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            A4643BarFasLot = W4643BarFasLot ;
            A10084BarPFcod = W10084BarPFcod ;
            A10258Itm_ord3 = W10258Itm_ord3 ;
            n10258Itm_ord3 = false ;
            /* End Insert */
            /* Using cursor P044313 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Short.valueOf(A10084BarPFcod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPFA");
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /* Using cursor P044314 */
      pr_default.execute(12, new Object[] {Integer.valueOf(AV17Barcod), Byte.valueOf(AV18Barcodreo), AV19Barcodpar, AV20Codpro, Short.valueOf(AV22RenOrdlin)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A194BarOrdLin = P044314_A194BarOrdLin[0] ;
         A758ProCod = P044314_A758ProCod[0] ;
         A130BarCodPar = P044314_A130BarCodPar[0] ;
         A132BarCodReo = P044314_A132BarCodReo[0] ;
         A129BarCod = P044314_A129BarCod[0] ;
         A396EmprCod = P044314_A396EmprCod[0] ;
         A10789BarFasNbO = P044314_A10789BarFasNbO[0] ;
         n10789BarFasNbO = P044314_n10789BarFasNbO[0] ;
         A10781BarFasNb = P044314_A10781BarFasNb[0] ;
         if ( GXutil.strcmp(A396EmprCod, httpContext.getMessage( "XYZ", "")) == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPFASBOT

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            W10781BarFasNb = A10781BarFasNb ;
            W10789BarFasNbO = A10789BarFasNbO ;
            n10789BarFasNbO = false ;
            A396EmprCod = AV16Emprcod ;
            A129BarCod = AV17Barcod ;
            A132BarCodReo = AV18Barcodreo ;
            A130BarCodPar = AV19Barcodpar ;
            A758ProCod = AV20Codpro ;
            A194BarOrdLin = AV21Ordlin ;
            n10789BarFasNbO = false ;
            /* Using cursor P044315 */
            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A10781BarFasNb), Boolean.valueOf(n10789BarFasNbO), A10789BarFasNbO});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASBOT");
            if ( (pr_default.getStatus(13) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            A10781BarFasNb = W10781BarFasNb ;
            A10789BarFasNbO = W10789BarFasNbO ;
            n10789BarFasNbO = false ;
            /* End Insert */
            /* Using cursor P044316 */
            pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A10781BarFasNb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASBOT");
         }
         pr_default.readNext(12);
      }
      pr_default.close(12);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfas000.this.AV16Emprcod;
      this.aP1[0] = pfas000.this.AV17Barcod;
      this.aP2[0] = pfas000.this.AV18Barcodreo;
      this.aP3[0] = pfas000.this.AV19Barcodpar;
      this.aP4[0] = pfas000.this.AV20Codpro;
      this.aP5[0] = pfas000.this.AV21Ordlin;
      this.aP6[0] = pfas000.this.AV22RenOrdlin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P04432_A12671BarParVl2 = new String[] {""} ;
      P04432_A194BarOrdLin = new short[1] ;
      P04432_A758ProCod = new String[] {""} ;
      P04432_A130BarCodPar = new String[] {""} ;
      P04432_A132BarCodReo = new byte[1] ;
      P04432_A129BarCod = new int[1] ;
      P04432_A396EmprCod = new String[] {""} ;
      P04432_A14079BarParPLC = new String[] {""} ;
      P04432_A13992BarParVMx = new String[] {""} ;
      P04432_A13991BarParVMn = new String[] {""} ;
      P04432_A10257Itm_ord5 = new short[1] ;
      P04432_A9737BarValPar = new String[] {""} ;
      P04432_A3693BarParTxt = new String[] {""} ;
      P04432_n3693BarParTxt = new boolean[] {false} ;
      P04432_A3296BarParObs = new String[] {""} ;
      P04432_A3295BarParVal = new String[] {""} ;
      P04432_A1664ParFasCod = new short[1] ;
      A12671BarParVl2 = "" ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A14079BarParPLC = "" ;
      A13992BarParVMx = "" ;
      A13991BarParVMn = "" ;
      A9737BarValPar = "" ;
      A3693BarParTxt = "" ;
      A3296BarParObs = "" ;
      A3295BarParVal = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      W3295BarParVal = "" ;
      W9737BarValPar = "" ;
      W12671BarParVl2 = "" ;
      A12670ParFasVl2 = "" ;
      Gx_emsg = "" ;
      P04435_A194BarOrdLin = new short[1] ;
      P04435_A758ProCod = new String[] {""} ;
      P04435_A130BarCodPar = new String[] {""} ;
      P04435_A132BarCodReo = new byte[1] ;
      P04435_A129BarCod = new int[1] ;
      P04435_A396EmprCod = new String[] {""} ;
      P04435_A577Zep_st = new byte[1] ;
      P04435_n577Zep_st = new boolean[] {false} ;
      P04435_A578Zep_und = new byte[1] ;
      P04435_n578Zep_und = new boolean[] {false} ;
      P04435_A579Zep_cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04435_n579Zep_cant = new boolean[] {false} ;
      P04435_A719PrdNum = new String[] {""} ;
      A579Zep_cant = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      W719PrdNum = "" ;
      W579Zep_cant = DecimalUtil.ZERO ;
      P04438_A194BarOrdLin = new short[1] ;
      P04438_A758ProCod = new String[] {""} ;
      P04438_A130BarCodPar = new String[] {""} ;
      P04438_A132BarCodReo = new byte[1] ;
      P04438_A129BarCod = new int[1] ;
      P04438_A396EmprCod = new String[] {""} ;
      P04438_A6662BarEstPec = new String[] {""} ;
      P04438_n6662BarEstPec = new boolean[] {false} ;
      P04438_A4939BarFasInc1 = new byte[1] ;
      P04438_n4939BarFasInc1 = new boolean[] {false} ;
      P04438_A4928BarFasDtf1 = new java.util.Date[] {GXutil.nullDate()} ;
      P04438_n4928BarFasDtf1 = new boolean[] {false} ;
      P04438_A4927BarFasDti1 = new java.util.Date[] {GXutil.nullDate()} ;
      P04438_n4927BarFasDti1 = new boolean[] {false} ;
      P04438_A4648BarFasRecu = new int[1] ;
      P04438_n4648BarFasRecu = new boolean[] {false} ;
      P04438_A4315BarNumBot1 = new int[1] ;
      P04438_n4315BarNumBot1 = new boolean[] {false} ;
      P04438_A4314BarFasBot1 = new String[] {""} ;
      P04438_n4314BarFasBot1 = new boolean[] {false} ;
      P04438_A4313BarFasPri1 = new byte[1] ;
      P04438_n4313BarFasPri1 = new boolean[] {false} ;
      P04438_A4647BarFasNPr1 = new short[1] ;
      P04438_n4647BarFasNPr1 = new boolean[] {false} ;
      P04438_A4312BarFasKgm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04438_n4312BarFasKgm1 = new boolean[] {false} ;
      P04438_A4311BarFasMtr1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04438_n4311BarFasMtr1 = new boolean[] {false} ;
      P04438_A4310BarTieRea1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04438_n4310BarTieRea1 = new boolean[] {false} ;
      P04438_A4309BarHorFin1 = new short[1] ;
      P04438_n4309BarHorFin1 = new boolean[] {false} ;
      P04438_A4308BarHorIni1 = new short[1] ;
      P04438_n4308BarHorIni1 = new boolean[] {false} ;
      P04438_A4307BarUni1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04438_n4307BarUni1 = new boolean[] {false} ;
      P04438_A4306BarTieTeo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04438_n4306BarTieTeo1 = new boolean[] {false} ;
      P04438_A4305BarFecRea1 = new java.util.Date[] {GXutil.nullDate()} ;
      P04438_n4305BarFecRea1 = new boolean[] {false} ;
      P04438_A4304BarFecRIn1 = new java.util.Date[] {GXutil.nullDate()} ;
      P04438_n4304BarFecRIn1 = new boolean[] {false} ;
      P04438_A4303BarFasEst1 = new byte[1] ;
      P04438_n4303BarFasEst1 = new boolean[] {false} ;
      P04438_A4302BarMaqFas1 = new String[] {""} ;
      P04438_n4302BarMaqFas1 = new boolean[] {false} ;
      P04438_A4646BarFasMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04438_n4646BarFasMts = new boolean[] {false} ;
      P04438_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04438_n4645BarFasKgs = new boolean[] {false} ;
      P04438_A4644BarFasNPrd = new short[1] ;
      P04438_n4644BarFasNPrd = new boolean[] {false} ;
      P04438_A4643BarFasLot = new int[1] ;
      A6662BarEstPec = "" ;
      A4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
      A4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
      A4314BarFasBot1 = "" ;
      A4312BarFasKgm1 = DecimalUtil.ZERO ;
      A4311BarFasMtr1 = DecimalUtil.ZERO ;
      A4310BarTieRea1 = DecimalUtil.ZERO ;
      A4307BarUni1 = DecimalUtil.ZERO ;
      A4306BarTieTeo1 = DecimalUtil.ZERO ;
      A4305BarFecRea1 = GXutil.nullDate() ;
      A4304BarFecRIn1 = GXutil.nullDate() ;
      A4302BarMaqFas1 = "" ;
      A4646BarFasMts = DecimalUtil.ZERO ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      P044311_A194BarOrdLin = new short[1] ;
      P044311_A758ProCod = new String[] {""} ;
      P044311_A130BarCodPar = new String[] {""} ;
      P044311_A132BarCodReo = new byte[1] ;
      P044311_A129BarCod = new int[1] ;
      P044311_A396EmprCod = new String[] {""} ;
      P044311_A10258Itm_ord3 = new short[1] ;
      P044311_n10258Itm_ord3 = new boolean[] {false} ;
      P044311_A10089BarPFVin = new String[] {""} ;
      P044311_n10089BarPFVin = new boolean[] {false} ;
      P044311_A10088BarPFTxt = new String[] {""} ;
      P044311_n10088BarPFTxt = new boolean[] {false} ;
      P044311_A10087BarPFob1 = new String[] {""} ;
      P044311_n10087BarPFob1 = new boolean[] {false} ;
      P044311_A10086BarPFVal = new String[] {""} ;
      P044311_n10086BarPFVal = new boolean[] {false} ;
      P044311_A10084BarPFcod = new short[1] ;
      P044311_A4643BarFasLot = new int[1] ;
      A10089BarPFVin = "" ;
      A10088BarPFTxt = "" ;
      A10087BarPFob1 = "" ;
      A10086BarPFVal = "" ;
      P044314_A194BarOrdLin = new short[1] ;
      P044314_A758ProCod = new String[] {""} ;
      P044314_A130BarCodPar = new String[] {""} ;
      P044314_A132BarCodReo = new byte[1] ;
      P044314_A129BarCod = new int[1] ;
      P044314_A396EmprCod = new String[] {""} ;
      P044314_A10789BarFasNbO = new String[] {""} ;
      P044314_n10789BarFasNbO = new boolean[] {false} ;
      P044314_A10781BarFasNb = new int[1] ;
      A10789BarFasNbO = "" ;
      W10789BarFasNbO = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfas000__default(),
         new Object[] {
             new Object[] {
            P04432_A12671BarParVl2, P04432_A194BarOrdLin, P04432_A758ProCod, P04432_A130BarCodPar, P04432_A132BarCodReo, P04432_A129BarCod, P04432_A396EmprCod, P04432_A14079BarParPLC, P04432_A13992BarParVMx, P04432_A13991BarParVMn,
            P04432_A10257Itm_ord5, P04432_A9737BarValPar, P04432_A3693BarParTxt, P04432_n3693BarParTxt, P04432_A3296BarParObs, P04432_A3295BarParVal, P04432_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04435_A194BarOrdLin, P04435_A758ProCod, P04435_A130BarCodPar, P04435_A132BarCodReo, P04435_A129BarCod, P04435_A396EmprCod, P04435_A577Zep_st, P04435_n577Zep_st, P04435_A578Zep_und, P04435_n578Zep_und,
            P04435_A579Zep_cant, P04435_n579Zep_cant, P04435_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04438_A194BarOrdLin, P04438_A758ProCod, P04438_A130BarCodPar, P04438_A132BarCodReo, P04438_A129BarCod, P04438_A396EmprCod, P04438_A6662BarEstPec, P04438_n6662BarEstPec, P04438_A4939BarFasInc1, P04438_n4939BarFasInc1,
            P04438_A4928BarFasDtf1, P04438_n4928BarFasDtf1, P04438_A4927BarFasDti1, P04438_n4927BarFasDti1, P04438_A4648BarFasRecu, P04438_n4648BarFasRecu, P04438_A4315BarNumBot1, P04438_n4315BarNumBot1, P04438_A4314BarFasBot1, P04438_n4314BarFasBot1,
            P04438_A4313BarFasPri1, P04438_n4313BarFasPri1, P04438_A4647BarFasNPr1, P04438_n4647BarFasNPr1, P04438_A4312BarFasKgm1, P04438_n4312BarFasKgm1, P04438_A4311BarFasMtr1, P04438_n4311BarFasMtr1, P04438_A4310BarTieRea1, P04438_n4310BarTieRea1,
            P04438_A4309BarHorFin1, P04438_n4309BarHorFin1, P04438_A4308BarHorIni1, P04438_n4308BarHorIni1, P04438_A4307BarUni1, P04438_n4307BarUni1, P04438_A4306BarTieTeo1, P04438_n4306BarTieTeo1, P04438_A4305BarFecRea1, P04438_n4305BarFecRea1,
            P04438_A4304BarFecRIn1, P04438_n4304BarFecRIn1, P04438_A4303BarFasEst1, P04438_n4303BarFasEst1, P04438_A4302BarMaqFas1, P04438_n4302BarMaqFas1, P04438_A4646BarFasMts, P04438_n4646BarFasMts, P04438_A4645BarFasKgs, P04438_n4645BarFasKgs,
            P04438_A4644BarFasNPrd, P04438_n4644BarFasNPrd, P04438_A4643BarFasLot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P044311_A194BarOrdLin, P044311_A758ProCod, P044311_A130BarCodPar, P044311_A132BarCodReo, P044311_A129BarCod, P044311_A396EmprCod, P044311_A10258Itm_ord3, P044311_n10258Itm_ord3, P044311_A10089BarPFVin, P044311_n10089BarPFVin,
            P044311_A10088BarPFTxt, P044311_n10088BarPFTxt, P044311_A10087BarPFob1, P044311_n10087BarPFob1, P044311_A10086BarPFVal, P044311_n10086BarPFVal, P044311_A10084BarPFcod, P044311_A4643BarFasLot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P044314_A194BarOrdLin, P044314_A758ProCod, P044314_A130BarCodPar, P044314_A132BarCodReo, P044314_A129BarCod, P044314_A396EmprCod, P044314_A10789BarFasNbO, P044314_n10789BarFasNbO, P044314_A10781BarFasNb
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Barcodreo ;
   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private byte A577Zep_st ;
   private byte A578Zep_und ;
   private byte W577Zep_st ;
   private byte W578Zep_und ;
   private byte A4939BarFasInc1 ;
   private byte A4313BarFasPri1 ;
   private byte A4303BarFasEst1 ;
   private short AV21Ordlin ;
   private short AV22RenOrdlin ;
   private short A194BarOrdLin ;
   private short A10257Itm_ord5 ;
   private short A1664ParFasCod ;
   private short W194BarOrdLin ;
   private short W1664ParFasCod ;
   private short W10257Itm_ord5 ;
   private short Gx_err ;
   private short A4647BarFasNPr1 ;
   private short A4309BarHorFin1 ;
   private short A4308BarHorIni1 ;
   private short A4644BarFasNPrd ;
   private short W4644BarFasNPrd ;
   private short A10258Itm_ord3 ;
   private short A10084BarPFcod ;
   private short W10084BarPFcod ;
   private short W10258Itm_ord3 ;
   private int AV17Barcod ;
   private int A129BarCod ;
   private int GX_INS475 ;
   private int W129BarCod ;
   private int GX_INS1330 ;
   private int A4648BarFasRecu ;
   private int A4315BarNumBot1 ;
   private int A4643BarFasLot ;
   private int GX_INS688 ;
   private int W4643BarFasLot ;
   private int GX_INS1368 ;
   private int A10781BarFasNb ;
   private int GX_INS1432 ;
   private int W10781BarFasNb ;
   private java.math.BigDecimal A579Zep_cant ;
   private java.math.BigDecimal W579Zep_cant ;
   private java.math.BigDecimal A4312BarFasKgm1 ;
   private java.math.BigDecimal A4311BarFasMtr1 ;
   private java.math.BigDecimal A4310BarTieRea1 ;
   private java.math.BigDecimal A4307BarUni1 ;
   private java.math.BigDecimal A4306BarTieTeo1 ;
   private java.math.BigDecimal A4646BarFasMts ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private String AV16Emprcod ;
   private String AV19Barcodpar ;
   private String AV20Codpro ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A12671BarParVl2 ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A14079BarParPLC ;
   private String A13992BarParVMx ;
   private String A13991BarParVMn ;
   private String A9737BarValPar ;
   private String A3296BarParObs ;
   private String A3295BarParVal ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String W3295BarParVal ;
   private String W9737BarValPar ;
   private String W12671BarParVl2 ;
   private String A12670ParFasVl2 ;
   private String Gx_emsg ;
   private String A719PrdNum ;
   private String W719PrdNum ;
   private String A6662BarEstPec ;
   private String A4314BarFasBot1 ;
   private String A4302BarMaqFas1 ;
   private String A10089BarPFVin ;
   private String A10087BarPFob1 ;
   private String A10086BarPFVal ;
   private String A10789BarFasNbO ;
   private String W10789BarFasNbO ;
   private java.util.Date A4928BarFasDtf1 ;
   private java.util.Date A4927BarFasDti1 ;
   private java.util.Date A4305BarFecRea1 ;
   private java.util.Date A4304BarFecRIn1 ;
   private boolean n3693BarParTxt ;
   private boolean n577Zep_st ;
   private boolean n578Zep_und ;
   private boolean n579Zep_cant ;
   private boolean n6662BarEstPec ;
   private boolean n4939BarFasInc1 ;
   private boolean n4928BarFasDtf1 ;
   private boolean n4927BarFasDti1 ;
   private boolean n4648BarFasRecu ;
   private boolean n4315BarNumBot1 ;
   private boolean n4314BarFasBot1 ;
   private boolean n4313BarFasPri1 ;
   private boolean n4647BarFasNPr1 ;
   private boolean n4312BarFasKgm1 ;
   private boolean n4311BarFasMtr1 ;
   private boolean n4310BarTieRea1 ;
   private boolean n4309BarHorFin1 ;
   private boolean n4308BarHorIni1 ;
   private boolean n4307BarUni1 ;
   private boolean n4306BarTieTeo1 ;
   private boolean n4305BarFecRea1 ;
   private boolean n4304BarFecRIn1 ;
   private boolean n4303BarFasEst1 ;
   private boolean n4302BarMaqFas1 ;
   private boolean n4646BarFasMts ;
   private boolean n4645BarFasKgs ;
   private boolean n4644BarFasNPrd ;
   private boolean n10258Itm_ord3 ;
   private boolean n10089BarPFVin ;
   private boolean n10088BarPFTxt ;
   private boolean n10087BarPFob1 ;
   private boolean n10086BarPFVal ;
   private boolean n10789BarFasNbO ;
   private String A3693BarParTxt ;
   private String A10088BarPFTxt ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04432_A12671BarParVl2 ;
   private short[] P04432_A194BarOrdLin ;
   private String[] P04432_A758ProCod ;
   private String[] P04432_A130BarCodPar ;
   private byte[] P04432_A132BarCodReo ;
   private int[] P04432_A129BarCod ;
   private String[] P04432_A396EmprCod ;
   private String[] P04432_A14079BarParPLC ;
   private String[] P04432_A13992BarParVMx ;
   private String[] P04432_A13991BarParVMn ;
   private short[] P04432_A10257Itm_ord5 ;
   private String[] P04432_A9737BarValPar ;
   private String[] P04432_A3693BarParTxt ;
   private boolean[] P04432_n3693BarParTxt ;
   private String[] P04432_A3296BarParObs ;
   private String[] P04432_A3295BarParVal ;
   private short[] P04432_A1664ParFasCod ;
   private short[] P04435_A194BarOrdLin ;
   private String[] P04435_A758ProCod ;
   private String[] P04435_A130BarCodPar ;
   private byte[] P04435_A132BarCodReo ;
   private int[] P04435_A129BarCod ;
   private String[] P04435_A396EmprCod ;
   private byte[] P04435_A577Zep_st ;
   private boolean[] P04435_n577Zep_st ;
   private byte[] P04435_A578Zep_und ;
   private boolean[] P04435_n578Zep_und ;
   private java.math.BigDecimal[] P04435_A579Zep_cant ;
   private boolean[] P04435_n579Zep_cant ;
   private String[] P04435_A719PrdNum ;
   private short[] P04438_A194BarOrdLin ;
   private String[] P04438_A758ProCod ;
   private String[] P04438_A130BarCodPar ;
   private byte[] P04438_A132BarCodReo ;
   private int[] P04438_A129BarCod ;
   private String[] P04438_A396EmprCod ;
   private String[] P04438_A6662BarEstPec ;
   private boolean[] P04438_n6662BarEstPec ;
   private byte[] P04438_A4939BarFasInc1 ;
   private boolean[] P04438_n4939BarFasInc1 ;
   private java.util.Date[] P04438_A4928BarFasDtf1 ;
   private boolean[] P04438_n4928BarFasDtf1 ;
   private java.util.Date[] P04438_A4927BarFasDti1 ;
   private boolean[] P04438_n4927BarFasDti1 ;
   private int[] P04438_A4648BarFasRecu ;
   private boolean[] P04438_n4648BarFasRecu ;
   private int[] P04438_A4315BarNumBot1 ;
   private boolean[] P04438_n4315BarNumBot1 ;
   private String[] P04438_A4314BarFasBot1 ;
   private boolean[] P04438_n4314BarFasBot1 ;
   private byte[] P04438_A4313BarFasPri1 ;
   private boolean[] P04438_n4313BarFasPri1 ;
   private short[] P04438_A4647BarFasNPr1 ;
   private boolean[] P04438_n4647BarFasNPr1 ;
   private java.math.BigDecimal[] P04438_A4312BarFasKgm1 ;
   private boolean[] P04438_n4312BarFasKgm1 ;
   private java.math.BigDecimal[] P04438_A4311BarFasMtr1 ;
   private boolean[] P04438_n4311BarFasMtr1 ;
   private java.math.BigDecimal[] P04438_A4310BarTieRea1 ;
   private boolean[] P04438_n4310BarTieRea1 ;
   private short[] P04438_A4309BarHorFin1 ;
   private boolean[] P04438_n4309BarHorFin1 ;
   private short[] P04438_A4308BarHorIni1 ;
   private boolean[] P04438_n4308BarHorIni1 ;
   private java.math.BigDecimal[] P04438_A4307BarUni1 ;
   private boolean[] P04438_n4307BarUni1 ;
   private java.math.BigDecimal[] P04438_A4306BarTieTeo1 ;
   private boolean[] P04438_n4306BarTieTeo1 ;
   private java.util.Date[] P04438_A4305BarFecRea1 ;
   private boolean[] P04438_n4305BarFecRea1 ;
   private java.util.Date[] P04438_A4304BarFecRIn1 ;
   private boolean[] P04438_n4304BarFecRIn1 ;
   private byte[] P04438_A4303BarFasEst1 ;
   private boolean[] P04438_n4303BarFasEst1 ;
   private String[] P04438_A4302BarMaqFas1 ;
   private boolean[] P04438_n4302BarMaqFas1 ;
   private java.math.BigDecimal[] P04438_A4646BarFasMts ;
   private boolean[] P04438_n4646BarFasMts ;
   private java.math.BigDecimal[] P04438_A4645BarFasKgs ;
   private boolean[] P04438_n4645BarFasKgs ;
   private short[] P04438_A4644BarFasNPrd ;
   private boolean[] P04438_n4644BarFasNPrd ;
   private int[] P04438_A4643BarFasLot ;
   private short[] P044311_A194BarOrdLin ;
   private String[] P044311_A758ProCod ;
   private String[] P044311_A130BarCodPar ;
   private byte[] P044311_A132BarCodReo ;
   private int[] P044311_A129BarCod ;
   private String[] P044311_A396EmprCod ;
   private short[] P044311_A10258Itm_ord3 ;
   private boolean[] P044311_n10258Itm_ord3 ;
   private String[] P044311_A10089BarPFVin ;
   private boolean[] P044311_n10089BarPFVin ;
   private String[] P044311_A10088BarPFTxt ;
   private boolean[] P044311_n10088BarPFTxt ;
   private String[] P044311_A10087BarPFob1 ;
   private boolean[] P044311_n10087BarPFob1 ;
   private String[] P044311_A10086BarPFVal ;
   private boolean[] P044311_n10086BarPFVal ;
   private short[] P044311_A10084BarPFcod ;
   private int[] P044311_A4643BarFasLot ;
   private short[] P044314_A194BarOrdLin ;
   private String[] P044314_A758ProCod ;
   private String[] P044314_A130BarCodPar ;
   private byte[] P044314_A132BarCodReo ;
   private int[] P044314_A129BarCod ;
   private String[] P044314_A396EmprCod ;
   private String[] P044314_A10789BarFasNbO ;
   private boolean[] P044314_n10789BarFasNbO ;
   private int[] P044314_A10781BarFasNb ;
}

final  class pfas000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04432", "SELECT BarParVl2, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarParPLC, BarParVMx, BarParVMn, Itm_ord5, BarValPar, BarParTxt, BarParObs, BarParVal, ParFasCod FROM TXPBarPar WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04433", "INSERT INTO TXPBarPar(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarParObs, BarParTxt, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new UpdateCursor("P04434", "DELETE FROM TXPBarPar  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND ParFasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P04435", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, Zep_st, Zep_und, Zep_cant, PrdNum FROM TXPZEPHYR WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04436", "INSERT INTO TXPZEPHYR(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum, Zep_cant, Zep_und, Zep_st) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPZEPHYR")
         ,new UpdateCursor("P04437", "DELETE FROM TXPZEPHYR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPZEPHYR")
         ,new ForEachCursor("P04438", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarEstPec, BarFasInc1, BarFasDtf1, BarFasDti1, BarFasRecu, BarNumBot1, BarFasBot1, BarFasPri1, BarFasNPr1, BarFasKgm1, BarFasMtr1, BarTieRea1, BarHorFin1, BarHorIni1, BarUni1, BarTieTeo1, BarFecRea1, BarFecRIn1, BarFasEst1, BarMaqFas1, BarFasMts, BarFasKgs, BarFasNPrd, BarFasLot FROM TXPFASMAQ WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04439", "INSERT INTO TXPFASMAQ(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new UpdateCursor("P044310", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new ForEachCursor("P044311", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, Itm_ord3, BarPFVin, BarPFTxt, BarPFob1, BarPFVal, BarPFcod, BarFasLot FROM TXPFASPFA WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P044312", "INSERT INTO TXPFASPFA(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod, BarPFVal, BarPFob1, BarPFTxt, BarPFVin, Itm_ord3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPFA")
         ,new UpdateCursor("P044313", "DELETE FROM TXPFASPFA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? AND BarPFcod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPFA")
         ,new ForEachCursor("P044314", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasNbO, BarFasNb FROM TXPFASBOT WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (ProCod = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P044315", "INSERT INTO TXPFASBOT(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb, BarFasNbO) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASBOT")
         ,new UpdateCursor("P044316", "DELETE FROM TXPFASBOT  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasNb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASBOT")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 100);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 60);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(24);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(29);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((int[]) buf[52])[0] = rslt.getInt(30);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 60);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 60);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[10], 400);
               }
               stmt.setString(11, (String)parms[11], 8);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setString(13, (String)parms[13], 12);
               stmt.setString(14, (String)parms[14], 12);
               stmt.setString(15, (String)parms[15], 12);
               stmt.setString(16, (String)parms[16], 100);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 3);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[12]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 6);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[38]).byteValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[44]).intValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[46], false);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(28, (java.util.Date)parms[48], false);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[50]).byteValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[52], 1);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 60);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[13], 400);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 8);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[17]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 100);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

