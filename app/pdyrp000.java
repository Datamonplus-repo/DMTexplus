package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp000 extends GXProcedure
{
   public pdyrp000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp000.class ), "" );
   }

   public pdyrp000( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal aP7 ,
                        int aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String aP11 ,
                        String aP12 ,
                        String aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 ,
                             int aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             String aP12 ,
                             String aP13 )
   {
      pdyrp000.this.AV58Emprcod = aP0;
      pdyrp000.this.AV25Barcod = aP1;
      pdyrp000.this.AV27Barcodreo = aP2;
      pdyrp000.this.AV26Barcodpar = aP3;
      pdyrp000.this.AV155RecLinMaq = aP4;
      pdyrp000.this.AV151RecFA = aP5;
      pdyrp000.this.AV160RecTotKgs = aP6;
      pdyrp000.this.AV161RecTotMts = aP7;
      pdyrp000.this.AV39BarVol = aP8;
      pdyrp000.this.AV33BarMaqCod = aP9;
      pdyrp000.this.AV186BarMacpro = aP10;
      pdyrp000.this.AV150RecetasTinteProcesosQuimicosToJson = aP11;
      pdyrp000.this.AV175TermiCod = aP12;
      pdyrp000.this.Gx_mode = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV179ValCos ;
      GXv_char2[0] = AV58Emprcod ;
      GXv_char3[0] = "030100" ;
      GXv_int4[0] = GXt_int1 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pdyrp000.this.AV58Emprcod = GXv_char2[0] ;
      pdyrp000.this.GXt_int1 = GXv_int4[0] ;
      AV179ValCos = GXt_int1 ;
      GXt_int5 = AV49CdpPor ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV58Emprcod, httpContext.getMessage( "%CDP", ""), GXv_int6) ;
      pdyrp000.this.GXt_int5 = GXv_int6[0] ;
      AV49CdpPor = GXt_int5 ;
      GXt_int5 = AV176TnqPro ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV58Emprcod, httpContext.getMessage( "TNQPRO", ""), GXv_int6) ;
      pdyrp000.this.GXt_int5 = GXv_int6[0] ;
      AV176TnqPro = GXt_int5 ;
      AV177TotKil = AV160RecTotKgs ;
      AV178TotMet = AV161RecTotMts ;
      AV185RecetasTinteProcesosQuimicos_SDTs.fromJSonString(AV150RecetasTinteProcesosQuimicosToJson, null);
      /* Using cursor P098O2 */
      pr_default.execute(0, new Object[] {AV58Emprcod, Integer.valueOf(AV25Barcod), Byte.valueOf(AV27Barcodreo), AV26Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P098O2_A120BarAgrEst[0] ;
         A5053BarBp12 = P098O2_A5053BarBp12[0] ;
         n5053BarBp12 = P098O2_n5053BarBp12[0] ;
         A5054BarBp13 = P098O2_A5054BarBp13[0] ;
         n5054BarBp13 = P098O2_n5054BarBp13[0] ;
         A5055BarBp14 = P098O2_A5055BarBp14[0] ;
         n5055BarBp14 = P098O2_n5055BarBp14[0] ;
         A5056BarBp15 = P098O2_A5056BarBp15[0] ;
         n5056BarBp15 = P098O2_n5056BarBp15[0] ;
         A5057BarFacAbs = P098O2_A5057BarFacAbs[0] ;
         n5057BarFacAbs = P098O2_n5057BarFacAbs[0] ;
         A3594BarPriTin = P098O2_A3594BarPriTin[0] ;
         A130BarCodPar = P098O2_A130BarCodPar[0] ;
         A132BarCodReo = P098O2_A132BarCodReo[0] ;
         A129BarCod = P098O2_A129BarCod[0] ;
         A396EmprCod = P098O2_A396EmprCod[0] ;
         A252CliCod = P098O2_A252CliCod[0] ;
         n252CliCod = P098O2_n252CliCod[0] ;
         A212BarSer = P098O2_A212BarSer[0] ;
         A135BarColNom = P098O2_A135BarColNom[0] ;
         A136BarColNum = P098O2_A136BarColNum[0] ;
         A218BarTipCol = P098O2_A218BarTipCol[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_char2[0] = httpContext.getMessage( "NUMINR", "") ;
            GXv_int4[0] = AV157RecNumInt ;
            new app.pnuminr(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
            pdyrp000.this.A396EmprCod = GXv_char3[0] ;
            pdyrp000.this.AV157RecNumInt = GXv_int4[0] ;
         }
         /*
            INSERT RECORD ON TABLE TXPRECMAQ

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W602MaqCod = A602MaqCod ;
         A396EmprCod = AV58Emprcod ;
         A129BarCod = AV25Barcod ;
         A132BarCodReo = AV27Barcodreo ;
         A130BarCodPar = AV26Barcodpar ;
         A2804RecLinMaq = AV155RecLinMaq ;
         A602MaqCod = AV33BarMaqCod ;
         A2805RecVolPrd = AV39BarVol ;
         A2806RecFA = AV151RecFA ;
         A1272UltLinPro = (byte)(0) ;
         A4258RecMaqFas = "" ;
         n4258RecMaqFas = false ;
         A4259RecTotKgs = AV177TotKil ;
         A4260RecTotMts = AV178TotMet ;
         n4260RecTotMts = false ;
         A4261RecTotPrd = 0 ;
         n4261RecTotPrd = false ;
         A4262RecBarCod = 0 ;
         n4262RecBarCod = false ;
         A4263RecBarReo = (byte)(0) ;
         n4263RecBarReo = false ;
         A4264RecBarPar = "" ;
         n4264RecBarPar = false ;
         A4268RecOrdLin = (short)(0) ;
         n4268RecOrdLin = false ;
         A4281RecAgrEst = A120BarAgrEst ;
         n4281RecAgrEst = false ;
         A4298RecRecLan = "" ;
         n4298RecRecLan = false ;
         A4402RecUsrCod = AV162RecUsrCod ;
         A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
         A4575RecMaqPes = (byte)(0) ;
         A4654RecNroPar = 0 ;
         n4654RecNroPar = false ;
         A4700RecEnvio = (byte)(1) ;
         A4701RecRecep = (byte)(0) ;
         A4866RecFecAlt = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n4866RecFecAlt = false ;
         A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
         n4867RecFecMod = false ;
         A4868RecUsrMod = "" ;
         n4868RecUsrMod = false ;
         A5109RecNumInt = AV157RecNumInt ;
         A5110RecNumPrg = AV186BarMacpro ;
         A5111RecBp12 = A5053BarBp12 ;
         A5112RecBp13 = A5054BarBp13 ;
         A5113RecBp14 = (short)(DecimalUtil.decToDouble(A5055BarBp14)) ;
         A5114RecBp15 = A5056BarBp15 ;
         A5115RecAbsFac = A5057BarFacAbs ;
         A5256RecUltObs = (short)(0) ;
         n5256RecUltObs = false ;
         A5407RecUltLCo = (short)(0) ;
         n5407RecUltLCo = false ;
         A5412RecIntCol = (byte)(0) ;
         n5412RecIntCol = false ;
         A5413RecMatCol = (short)(0) ;
         n5413RecMatCol = false ;
         A5430RecFecPla = GXutil.nullDate() ;
         n5430RecFecPla = false ;
         A5431RecPriPla = (byte)(((A3594BarPriTin==0) ? 80 : A3594BarPriTin)) ;
         n5431RecPriPla = false ;
         A6039RecAcab = httpContext.getMessage( "N", "") ;
         n6039RecAcab = false ;
         A6269RecPrg2 = "" ;
         A6270RecPrg3 = "" ;
         A7764RecMaqNh = (short)(0) ;
         A7765RecMaqVX = (byte)(0) ;
         A7766RecMaqBL = (byte)(0) ;
         A7767RecMaqFlow = (byte)(0) ;
         A7768RecMaqRPM = (short)(0) ;
         A7769RecMaqMol = (short)(0) ;
         A7770RecMaqTor = (short)(0) ;
         A7771RecMaqCla = "" ;
         A7772RecMaqTej = (byte)(0) ;
         A7773RecMaqDel = (byte)(0) ;
         A7774RecMaqPML = (short)(0) ;
         A8353RecMaqObs = "" ;
         A8367RecPriAca = (short)(0) ;
         n8367RecPriAca = false ;
         A9764RecLtsSR = 0 ;
         n9764RecLtsSR = false ;
         A9765RecLtsDf = 0 ;
         n9765RecLtsDf = false ;
         A9811RecAbs2 = DecimalUtil.ZERO ;
         n9811RecAbs2 = false ;
         A9812RecHdrLts = "" ;
         n9812RecHdrLts = false ;
         A9996RecObsq = "" ;
         n9996RecObsq = false ;
         A9997Recgrm = (short)(0) ;
         n9997Recgrm = false ;
         A9998RecAnc = (short)(0) ;
         n9998RecAnc = false ;
         A10124Rsedo1 = DecimalUtil.ZERO ;
         A10125Rsedo2 = DecimalUtil.ZERO ;
         A10126Rsedo3 = (short)(0) ;
         A10127Rsedo4 = DecimalUtil.ZERO ;
         A10128Rsedo5 = (byte)(0) ;
         A10129Rsedo6 = (byte)(0) ;
         A10385RecCAut = (byte)(0) ;
         A11507RecAva = "" ;
         n11507RecAva = false ;
         A12128RecAs = "" ;
         n12128RecAs = false ;
         A12129RecAi = "" ;
         n12129RecAi = false ;
         A12270Rsedo7 = DecimalUtil.ZERO ;
         A12271Rsedo8 = DecimalUtil.ZERO ;
         A12272Rsedo9 = (short)(0) ;
         A12273Rsedo10 = (short)(0) ;
         A12274Rsedo11 = (short)(0) ;
         A12900Rsedo12 = (short)(0) ;
         A12901Rsedo13 = (short)(0) ;
         A12902Rsedo14 = 0 ;
         /* Using cursor P098O3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), A602MaqCod, Integer.valueOf(A2805RecVolPrd), A2806RecFA, Byte.valueOf(A1272UltLinPro), Boolean.valueOf(n4258RecMaqFas), A4258RecMaqFas, A4259RecTotKgs, Boolean.valueOf(n4260RecTotMts), A4260RecTotMts, Boolean.valueOf(n4261RecTotPrd), Integer.valueOf(A4261RecTotPrd), Boolean.valueOf(n4262RecBarCod), Integer.valueOf(A4262RecBarCod), Boolean.valueOf(n4263RecBarReo), Byte.valueOf(A4263RecBarReo), Boolean.valueOf(n4264RecBarPar), A4264RecBarPar, Boolean.valueOf(n4268RecOrdLin), Short.valueOf(A4268RecOrdLin), Boolean.valueOf(n4281RecAgrEst), A4281RecAgrEst, Boolean.valueOf(n4298RecRecLan), A4298RecRecLan, A4402RecUsrCod, A4574RecFecPes, Byte.valueOf(A4575RecMaqPes), Boolean.valueOf(n4654RecNroPar), Integer.valueOf(A4654RecNroPar), Byte.valueOf(A4700RecEnvio), Byte.valueOf(A4701RecRecep), Boolean.valueOf(n4866RecFecAlt), A4866RecFecAlt, Boolean.valueOf(n4867RecFecMod), A4867RecFecMod, Boolean.valueOf(n4868RecUsrMod), A4868RecUsrMod, Integer.valueOf(A5109RecNumInt), A5110RecNumPrg, Short.valueOf(A5111RecBp12), Short.valueOf(A5112RecBp13), Short.valueOf(A5113RecBp14), Short.valueOf(A5114RecBp15), A5115RecAbsFac, Boolean.valueOf(n5256RecUltObs), Short.valueOf(A5256RecUltObs), Boolean.valueOf(n5407RecUltLCo), Short.valueOf(A5407RecUltLCo), Boolean.valueOf(n5412RecIntCol), Byte.valueOf(A5412RecIntCol), Boolean.valueOf(n5413RecMatCol), Short.valueOf(A5413RecMatCol), Boolean.valueOf(n5430RecFecPla), A5430RecFecPla, Boolean.valueOf(n5431RecPriPla), Byte.valueOf(A5431RecPriPla), Boolean.valueOf(n6039RecAcab), A6039RecAcab, A6269RecPrg2, A6270RecPrg3, Short.valueOf(A7764RecMaqNh), Byte.valueOf(A7765RecMaqVX), Byte.valueOf(A7766RecMaqBL), Byte.valueOf(A7767RecMaqFlow), Short.valueOf(A7768RecMaqRPM), Short.valueOf(A7769RecMaqMol), Short.valueOf(A7770RecMaqTor), A7771RecMaqCla, Byte.valueOf(A7772RecMaqTej), Byte.valueOf(A7773RecMaqDel), Short.valueOf(A7774RecMaqPML), A8353RecMaqObs, Boolean.valueOf(n8367RecPriAca), Short.valueOf(A8367RecPriAca), Boolean.valueOf(n9764RecLtsSR), Integer.valueOf(A9764RecLtsSR), Boolean.valueOf(n9765RecLtsDf), Integer.valueOf(A9765RecLtsDf), Boolean.valueOf(n9811RecAbs2), A9811RecAbs2, Boolean.valueOf(n9812RecHdrLts), A9812RecHdrLts, Boolean.valueOf(n9996RecObsq), A9996RecObsq, Boolean.valueOf(n9997Recgrm), Short.valueOf(A9997Recgrm), Boolean.valueOf(n9998RecAnc), Short.valueOf(A9998RecAnc), A10124Rsedo1, A10125Rsedo2, Short.valueOf(A10126Rsedo3), A10127Rsedo4, Byte.valueOf(A10128Rsedo5), Byte.valueOf(A10129Rsedo6), Byte.valueOf(A10385RecCAut), Boolean.valueOf(n11507RecAva), A11507RecAva, Boolean.valueOf(n12128RecAs), A12128RecAs, Boolean.valueOf(n12129RecAi), A12129RecAi, A12270Rsedo7, A12271Rsedo8, Short.valueOf(A12272Rsedo9), Short.valueOf(A12273Rsedo10), Short.valueOf(A12274Rsedo11), Short.valueOf(A12900Rsedo12), Short.valueOf(A12901Rsedo13), Integer.valueOf(A12902Rsedo14)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
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
         A602MaqCod = W602MaqCod ;
         /* End Insert */
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char2[0] = A212BarSer ;
         GXv_char7[0] = A135BarColNom ;
         GXv_int8[0] = A136BarColNum ;
         GXv_int6[0] = A218BarTipCol ;
         GXv_int9[0] = AV87ForCon ;
         GXv_int10[0] = AV129NumColFor ;
         GXv_char11[0] = AV35BarNumTon ;
         new app.pdyrp029(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_char7, GXv_int8, GXv_int6, GXv_int9, GXv_int10, GXv_char11) ;
         pdyrp000.this.A396EmprCod = GXv_char3[0] ;
         pdyrp000.this.A252CliCod = GXv_int4[0] ;
         pdyrp000.this.A212BarSer = GXv_char2[0] ;
         pdyrp000.this.A135BarColNom = GXv_char7[0] ;
         pdyrp000.this.A136BarColNum = GXv_int8[0] ;
         pdyrp000.this.A218BarTipCol = GXv_int6[0] ;
         pdyrp000.this.AV87ForCon = GXv_int9[0] ;
         pdyrp000.this.AV129NumColFor = GXv_int10[0] ;
         pdyrp000.this.AV35BarNumTon = GXv_char11[0] ;
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV94i = (short)(1) ;
      AV156RecLinPro = (byte)(0) ;
      AV153RecLin = (short)(0) ;
      AV154RecLinIni = (short)(0) ;
      AV191GXV1 = 1 ;
      while ( AV191GXV1 <= AV185RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         AV184RecetasTinteProcesosQuimicos_SDT = (app.SdtRecetasTinteProcesosQuimicos_SDT)((app.SdtRecetasTinteProcesosQuimicos_SDT)AV185RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV191GXV1));
         AV144Proforcod = AV184RecetasTinteProcesosQuimicos_SDT.getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod() ;
         AV164RecVolPrf = AV39BarVol ;
         AV158RecRb = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV177TotKil)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( DecimalUtil.doubleToDec(AV39BarVol).divide(AV177TotKil, 18, java.math.RoundingMode.DOWN), 1)) ;
         AV109Linea = (byte)(AV109Linea+5) ;
         /* Using cursor P098O4 */
         pr_default.execute(2, new Object[] {AV58Emprcod, AV144Proforcod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4586ProForObs = P098O4_A4586ProForObs[0] ;
            n4586ProForObs = P098O4_n4586ProForObs[0] ;
            A2392ProNumPro = P098O4_A2392ProNumPro[0] ;
            A2393ProNumRec = P098O4_A2393ProNumRec[0] ;
            A10547ProH2O = P098O4_A10547ProH2O[0] ;
            A771ProForTie = P098O4_A771ProForTie[0] ;
            A764ProForCod = P098O4_A764ProForCod[0] ;
            A396EmprCod = P098O4_A396EmprCod[0] ;
            W396EmprCod = A396EmprCod ;
            W764ProForCod = A764ProForCod ;
            /*
               INSERT RECORD ON TABLE TXPCRECET

            */
            W396EmprCod = A396EmprCod ;
            W764ProForCod = A764ProForCod ;
            A396EmprCod = AV58Emprcod ;
            A129BarCod = AV25Barcod ;
            A132BarCodReo = AV27Barcodreo ;
            A130BarCodPar = AV26Barcodpar ;
            A2804RecLinMaq = AV155RecLinMaq ;
            A1273RecLinPro = AV109Linea ;
            A764ProForCod = AV144Proforcod ;
            A4587ProRecObs = A4586ProForObs ;
            A4697RecNroPrg = A2392ProNumPro ;
            A4695RecVolPrf = AV164RecVolPrf ;
            A7257RecRb = AV158RecRb ;
            n7257RecRb = false ;
            A1251RecNumRec = A2393ProNumRec ;
            A10544RecNH2O = A10547ProH2O ;
            A4696RecTiempo = A771ProForTie ;
            n4696RecTiempo = false ;
            /* Using cursor P098O5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, A4587ProRecObs, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg), Boolean.valueOf(n7257RecRb), A7257RecRb, Integer.valueOf(A1251RecNumRec), Short.valueOf(A10544RecNH2O)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
            if ( (pr_default.getStatus(3) == 1) )
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
            A764ProForCod = W764ProForCod ;
            /* End Insert */
            AV72FlagComp = (byte)(0) ;
            AV32BarLinMaq = AV155RecLinMaq ;
            AV156RecLinPro = AV109Linea ;
            AV39BarVol = AV164RecVolPrf ;
            /* Using cursor P098O6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A764ProForCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A6062ProForCPo = P098O6_A6062ProForCPo[0] ;
               A1645ProForNro = P098O6_A1645ProForNro[0] ;
               A765ProForDes = P098O6_A765ProForDes[0] ;
               A770ProForPrd = P098O6_A770ProForPrd[0] ;
               A3379ProForTnq = P098O6_A3379ProForTnq[0] ;
               A5358ProForClv = P098O6_A5358ProForClv[0] ;
               A763ProForCla = P098O6_A763ProForCla[0] ;
               A762ProForCan = P098O6_A762ProForCan[0] ;
               A490ForPrdUMe = P098O6_A490ForPrdUMe[0] ;
               A767ProForLin = P098O6_A767ProForLin[0] ;
               AV145ProForCpo = A6062ProForCPo ;
               AV152RecForNro = A1645ProForNro ;
               AV146ProForDes = A765ProForDes ;
               AV148ProForPrd = A770ProForPrd ;
               AV148ProForPrd = A770ProForPrd ;
               AV174TanqueN = (byte)(((AV176TnqPro==1) ? A3379ProForTnq : 0)) ;
               if ( (GXutil.strcmp("", A770ProForPrd)==0) )
               {
                  GXv_char11[0] = AV58Emprcod ;
                  GXv_int10[0] = AV25Barcod ;
                  GXv_int9[0] = AV27Barcodreo ;
                  GXv_char7[0] = AV26Barcodpar ;
                  GXv_int12[0] = AV112LinRec ;
                  GXv_char3[0] = AV146ProForDes ;
                  GXv_char2[0] = AV148ProForPrd ;
                  GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int6[0] = AV109Linea ;
                  GXv_int14[0] = AV155RecLinMaq ;
                  GXv_int15[0] = AV154RecLinIni ;
                  new app.pdyrp001(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int9, GXv_char7, GXv_int12, GXv_char3, GXv_char2, GXv_decimal13, GXv_int6, GXv_int14, GXv_int15) ;
                  pdyrp000.this.AV58Emprcod = GXv_char11[0] ;
                  pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                  pdyrp000.this.AV27Barcodreo = GXv_int9[0] ;
                  pdyrp000.this.AV26Barcodpar = GXv_char7[0] ;
                  pdyrp000.this.AV112LinRec = GXv_int12[0] ;
                  pdyrp000.this.AV146ProForDes = GXv_char3[0] ;
                  pdyrp000.this.AV148ProForPrd = GXv_char2[0] ;
                  pdyrp000.this.AV109Linea = GXv_int6[0] ;
                  pdyrp000.this.AV155RecLinMaq = GXv_int14[0] ;
                  pdyrp000.this.AV154RecLinIni = GXv_int15[0] ;
               }
               if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
               {
                  AV132NumOrd = (short)(GXutil.lval( GXutil.substring( A770ProForPrd, 2, 4))) ;
                  AV141Producto = "" ;
                  AV91ForPrdUMe = (byte)(0) ;
                  /* Execute user subroutine: 'CTRL_PE' */
                  S131 ();
                  if ( returnInSub )
                  {
                     pr_default.close(4);
                     pr_default.close(2);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV137PrdVal = (byte)(0) ;
                  AV114llamo_pe = httpContext.getMessage( "S", "") ;
                  AV55Dosi_pp = (byte)(0) ;
                  if ( ( ! (GXutil.strcmp("", A763ProForCla)==0) && ( AV63Existe_p == 1 ) ) || ( ! (GXutil.strcmp("", A5358ProForClv)==0) && ( AV63Existe_p == 1 ) ) )
                  {
                     AV136PrdDesc = A765ProForDes ;
                     AV141Producto = A770ProForPrd ;
                     if ( GXutil.strcmp(A5358ProForClv, " ") == 0 )
                     {
                        AV114llamo_pe = httpContext.getMessage( "S", "") ;
                        GXv_char11[0] = A396EmprCod ;
                        GXv_char7[0] = AV141Producto ;
                        GXv_char3[0] = A763ProForCla ;
                        GXv_int9[0] = AV137PrdVal ;
                        GXv_int10[0] = AV25Barcod ;
                        GXv_int6[0] = AV27Barcodreo ;
                        GXv_char2[0] = AV26Barcodpar ;
                        GXv_decimal13[0] = AV177TotKil ;
                        GXv_char16[0] = AV136PrdDesc ;
                        GXv_char17[0] = AV24Accion ;
                        GXv_int15[0] = AV32BarLinMaq ;
                        new app.pdyrp004(remoteHandle, context).execute( GXv_char11, GXv_char7, GXv_char3, GXv_int9, GXv_int10, GXv_int6, GXv_char2, GXv_decimal13, GXv_char16, GXv_char17, GXv_int15) ;
                        pdyrp000.this.A396EmprCod = GXv_char11[0] ;
                        pdyrp000.this.AV141Producto = GXv_char7[0] ;
                        pdyrp000.this.A763ProForCla = GXv_char3[0] ;
                        pdyrp000.this.AV137PrdVal = GXv_int9[0] ;
                        pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                        pdyrp000.this.AV27Barcodreo = GXv_int6[0] ;
                        pdyrp000.this.AV26Barcodpar = GXv_char2[0] ;
                        pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
                        pdyrp000.this.AV136PrdDesc = GXv_char16[0] ;
                        pdyrp000.this.AV24Accion = GXv_char17[0] ;
                        pdyrp000.this.AV32BarLinMaq = GXv_int15[0] ;
                     }
                     if ( ! (GXutil.strcmp("", A5358ProForClv)==0) )
                     {
                        AV114llamo_pe = httpContext.getMessage( "N", "") ;
                        GXv_char17[0] = A396EmprCod ;
                        GXv_char16[0] = AV141Producto ;
                        GXv_char11[0] = A5358ProForClv ;
                        GXv_int9[0] = AV137PrdVal ;
                        GXv_int10[0] = AV25Barcod ;
                        GXv_int6[0] = AV27Barcodreo ;
                        GXv_char7[0] = AV26Barcodpar ;
                        GXv_decimal13[0] = AV177TotKil ;
                        GXv_char3[0] = AV136PrdDesc ;
                        GXv_char2[0] = AV24Accion ;
                        GXv_int15[0] = AV32BarLinMaq ;
                        GXv_decimal18[0] = AV135Porc_p ;
                        new app.pdyrp010(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_char11, GXv_int9, GXv_int10, GXv_int6, GXv_char7, GXv_decimal13, GXv_char3, GXv_char2, GXv_int15, GXv_decimal18) ;
                        pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                        pdyrp000.this.AV141Producto = GXv_char16[0] ;
                        pdyrp000.this.A5358ProForClv = GXv_char11[0] ;
                        pdyrp000.this.AV137PrdVal = GXv_int9[0] ;
                        pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                        pdyrp000.this.AV27Barcodreo = GXv_int6[0] ;
                        pdyrp000.this.AV26Barcodpar = GXv_char7[0] ;
                        pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
                        pdyrp000.this.AV136PrdDesc = GXv_char3[0] ;
                        pdyrp000.this.AV24Accion = GXv_char2[0] ;
                        pdyrp000.this.AV32BarLinMaq = GXv_int15[0] ;
                        pdyrp000.this.AV135Porc_p = GXv_decimal18[0] ;
                        if ( AV137PrdVal == 1 )
                        {
                           AV55Dosi_pp = (byte)(1) ;
                           AV114llamo_pe = httpContext.getMessage( "S", "") ;
                        }
                        else
                        {
                           AV114llamo_pe = httpContext.getMessage( "N", "") ;
                        }
                     }
                     if ( AV137PrdVal == 1 )
                     {
                        if ( GXutil.strcmp(A5358ProForClv, " ") == 0 )
                        {
                           if ( ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "M", "")) == 0 ) || ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) == 0 ) )
                           {
                              GXv_char17[0] = A396EmprCod ;
                              GXv_int10[0] = AV25Barcod ;
                              GXv_int9[0] = AV27Barcodreo ;
                              GXv_char16[0] = AV26Barcodpar ;
                              GXv_int15[0] = AV112LinRec ;
                              GXv_int14[0] = AV154RecLinIni ;
                              GXv_int12[0] = AV155RecLinMaq ;
                              GXv_int6[0] = AV156RecLinPro ;
                              new app.pdyrp003(remoteHandle, context).execute( GXv_char17, GXv_int10, GXv_int9, GXv_char16, GXv_int15, GXv_int14, GXv_int12, GXv_int6) ;
                              pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                              pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                              pdyrp000.this.AV27Barcodreo = GXv_int9[0] ;
                              pdyrp000.this.AV26Barcodpar = GXv_char16[0] ;
                              pdyrp000.this.AV112LinRec = GXv_int15[0] ;
                              pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
                              pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
                              pdyrp000.this.AV156RecLinPro = GXv_int6[0] ;
                              AV152RecForNro = A1645ProForNro ;
                           }
                        }
                     }
                  }
                  if ( ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) ) || ( ! (GXutil.strcmp("", A763ProForCla)==0) && ( AV137PrdVal == 1 ) ) || ( ! (GXutil.strcmp("", A5358ProForClv)==0) && ( AV137PrdVal == 1 ) ) )
                  {
                     AV134Por_can = A762ProForCan ;
                     if ( GXutil.strcmp(AV114llamo_pe, httpContext.getMessage( "S", "")) == 0 )
                     {
                        /* Execute user subroutine: 'PRODUCTOSESPECIALES' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(4);
                           pr_default.close(2);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                  }
               }
               else
               {
                  AV140Produc = GXutil.substring( A770ProForPrd, 3, 1) ;
                  if ( GXutil.strcmp(AV140Produc, " ") == 0 )
                  {
                     if ( A762ProForCan.doubleValue() == 0 )
                     {
                        AV46Cantidad = DecimalUtil.doubleToDec(1) ;
                     }
                     else
                     {
                        AV46Cantidad = A762ProForCan ;
                     }
                     AV140Produc = GXutil.substring( A770ProForPrd, 2, 1) ;
                     if ( GXutil.strcmp(AV140Produc, "") == 0 )
                     {
                        AV123Ncar = (byte)(1) ;
                     }
                     else
                     {
                        AV123Ncar = (byte)(2) ;
                     }
                     AV148ProForPrd = A770ProForPrd ;
                     if ( (GXutil.strcmp("", A763ProForCla)==0) )
                     {
                        /* Execute user subroutine: 'COLORANTES' */
                        S151 ();
                        if ( returnInSub )
                        {
                           pr_default.close(4);
                           pr_default.close(2);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                     else
                     {
                        AV41Calve = A763ProForCla ;
                        AV137PrdVal = (byte)(0) ;
                        AV136PrdDesc = A765ProForDes ;
                        AV141Producto = A770ProForPrd ;
                        GXv_char17[0] = A396EmprCod ;
                        GXv_char16[0] = AV141Producto ;
                        GXv_char11[0] = A763ProForCla ;
                        GXv_int9[0] = AV137PrdVal ;
                        GXv_int10[0] = AV25Barcod ;
                        GXv_int6[0] = AV27Barcodreo ;
                        GXv_char7[0] = AV26Barcodpar ;
                        GXv_decimal18[0] = AV177TotKil ;
                        GXv_char3[0] = AV136PrdDesc ;
                        GXv_char2[0] = AV24Accion ;
                        GXv_int15[0] = AV32BarLinMaq ;
                        new app.pdyrp004(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_char11, GXv_int9, GXv_int10, GXv_int6, GXv_char7, GXv_decimal18, GXv_char3, GXv_char2, GXv_int15) ;
                        pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                        pdyrp000.this.AV141Producto = GXv_char16[0] ;
                        pdyrp000.this.A763ProForCla = GXv_char11[0] ;
                        pdyrp000.this.AV137PrdVal = GXv_int9[0] ;
                        pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                        pdyrp000.this.AV27Barcodreo = GXv_int6[0] ;
                        pdyrp000.this.AV26Barcodpar = GXv_char7[0] ;
                        pdyrp000.this.AV177TotKil = GXv_decimal18[0] ;
                        pdyrp000.this.AV136PrdDesc = GXv_char3[0] ;
                        pdyrp000.this.AV24Accion = GXv_char2[0] ;
                        pdyrp000.this.AV32BarLinMaq = GXv_int15[0] ;
                        if ( AV137PrdVal == 1 )
                        {
                           if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) == 0 )
                           {
                              httpContext.GX_msglist.addItem(httpContext.getMessage( "No permitido Clave Tipo \"E\" en colorantes", ""));
                           }
                           if ( ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "M", "")) == 0 ) )
                           {
                              /* Execute user subroutine: 'COLORANTES' */
                              S151 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(4);
                                 pr_default.close(2);
                                 returnInSub = true;
                                 cleanup();
                                 if (true) return;
                              }
                           }
                        }
                     }
                  }
                  else
                  {
                     if ( (GXutil.strcmp("", A763ProForCla)==0) && (GXutil.strcmp("", A5358ProForClv)==0) )
                     {
                        if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                        {
                           AV141Producto = A770ProForPrd ;
                           AV46Cantidad = A762ProForCan ;
                           AV91ForPrdUMe = A490ForPrdUMe ;
                           AV72FlagComp = (byte)(0) ;
                           AV146ProForDes = A765ProForDes ;
                           if ( AV77FlagLw == 1 )
                           {
                              AV174TanqueN = (byte)(1) ;
                           }
                           if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                           {
                              AV117MaqTipprd = httpContext.getMessage( "C", "") ;
                           }
                           else
                           {
                              AV117MaqTipprd = httpContext.getMessage( "P", "") ;
                           }
                           /* Execute user subroutine: 'MAQTNQ' */
                           S1211 ();
                           if ( returnInSub )
                           {
                              pr_default.close(4);
                              pr_default.close(2);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                           if ( AV118MaqTqn > 0 )
                           {
                              AV174TanqueN = AV118MaqTqn ;
                           }
                           AV45Canfor = A762ProForCan ;
                           if ( ( AV49CdpPor == 1 ) && ( AV145ProForCpo.doubleValue() > 0 ) && ( AV145ProForCpo.doubleValue() <= 100 ) )
                           {
                              AV45Canfor = (AV45Canfor.multiply(AV145ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                           }
                           GXv_char17[0] = A396EmprCod ;
                           GXv_char16[0] = A770ProForPrd ;
                           GXv_decimal18[0] = AV45Canfor ;
                           GXv_int9[0] = A490ForPrdUMe ;
                           GXv_decimal13[0] = AV177TotKil ;
                           GXv_int10[0] = AV39BarVol ;
                           GXv_int8[0] = AV179ValCos ;
                           GXv_int15[0] = AV112LinRec ;
                           GXv_int4[0] = AV25Barcod ;
                           GXv_int6[0] = AV27Barcodreo ;
                           GXv_char11[0] = AV26Barcodpar ;
                           GXv_int19[0] = AV67Flag1 ;
                           GXv_int20[0] = AV68Flag2 ;
                           GXv_int14[0] = AV154RecLinIni ;
                           GXv_int21[0] = AV109Linea ;
                           GXv_int22[0] = AV61ExiCon ;
                           GXv_int23[0] = AV72FlagComp ;
                           GXv_int24[0] = AV152RecForNro ;
                           GXv_int12[0] = AV155RecLinMaq ;
                           GXv_int25[0] = AV174TanqueN ;
                           GXv_char7[0] = AV146ProForDes ;
                           new app.pdyrp02(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_decimal18, GXv_int9, GXv_decimal13, GXv_int10, GXv_int8, GXv_int15, GXv_int4, GXv_int6, GXv_char11, GXv_int19, GXv_int20, GXv_int14, GXv_int21, GXv_int22, GXv_int23, GXv_int24, GXv_int12, GXv_int25, GXv_char7) ;
                           pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                           pdyrp000.this.A770ProForPrd = GXv_char16[0] ;
                           pdyrp000.this.AV45Canfor = GXv_decimal18[0] ;
                           pdyrp000.this.A490ForPrdUMe = GXv_int9[0] ;
                           pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
                           pdyrp000.this.AV39BarVol = GXv_int10[0] ;
                           pdyrp000.this.AV179ValCos = GXv_int8[0] ;
                           pdyrp000.this.AV112LinRec = GXv_int15[0] ;
                           pdyrp000.this.AV25Barcod = GXv_int4[0] ;
                           pdyrp000.this.AV27Barcodreo = GXv_int6[0] ;
                           pdyrp000.this.AV26Barcodpar = GXv_char11[0] ;
                           pdyrp000.this.AV67Flag1 = GXv_int19[0] ;
                           pdyrp000.this.AV68Flag2 = GXv_int20[0] ;
                           pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
                           pdyrp000.this.AV109Linea = GXv_int21[0] ;
                           pdyrp000.this.AV61ExiCon = GXv_int22[0] ;
                           pdyrp000.this.AV72FlagComp = GXv_int23[0] ;
                           pdyrp000.this.AV152RecForNro = GXv_int24[0] ;
                           pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
                           pdyrp000.this.AV174TanqueN = GXv_int25[0] ;
                           pdyrp000.this.AV146ProForDes = GXv_char7[0] ;
                           if ( AV73FlagExiPro == 0 )
                           {
                              /* Execute user subroutine: 'COMPUESTOS' */
                              S141 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(4);
                                 pr_default.close(2);
                                 returnInSub = true;
                                 cleanup();
                                 if (true) return;
                              }
                           }
                           AV72FlagComp = (byte)(0) ;
                        }
                        else
                        {
                           AV146ProForDes = A765ProForDes ;
                           if ( AV77FlagLw == 1 )
                           {
                              AV174TanqueN = (byte)(1) ;
                           }
                           if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                           {
                              AV117MaqTipprd = httpContext.getMessage( "C", "") ;
                           }
                           else
                           {
                              AV117MaqTipprd = httpContext.getMessage( "P", "") ;
                           }
                           /* Execute user subroutine: 'MAQTNQ' */
                           S1211 ();
                           if ( returnInSub )
                           {
                              pr_default.close(4);
                              pr_default.close(2);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                           if ( AV118MaqTqn > 0 )
                           {
                              AV174TanqueN = AV118MaqTqn ;
                           }
                           AV45Canfor = A762ProForCan ;
                           if ( ( AV49CdpPor == 1 ) && ( AV145ProForCpo.doubleValue() > 0 ) && ( AV145ProForCpo.doubleValue() <= 100 ) )
                           {
                              AV45Canfor = (AV45Canfor.multiply(AV145ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                           }
                           GXv_char17[0] = A396EmprCod ;
                           GXv_char16[0] = A770ProForPrd ;
                           GXv_decimal18[0] = AV45Canfor ;
                           GXv_int25[0] = A490ForPrdUMe ;
                           GXv_decimal13[0] = AV177TotKil ;
                           GXv_int10[0] = AV39BarVol ;
                           GXv_int8[0] = AV179ValCos ;
                           GXv_int15[0] = AV112LinRec ;
                           GXv_int4[0] = AV25Barcod ;
                           GXv_int24[0] = AV27Barcodreo ;
                           GXv_char11[0] = AV26Barcodpar ;
                           GXv_int23[0] = AV67Flag1 ;
                           GXv_int22[0] = AV68Flag2 ;
                           GXv_int14[0] = AV154RecLinIni ;
                           GXv_int21[0] = AV109Linea ;
                           GXv_int20[0] = AV61ExiCon ;
                           GXv_int19[0] = AV72FlagComp ;
                           GXv_int9[0] = AV152RecForNro ;
                           GXv_int12[0] = AV155RecLinMaq ;
                           GXv_int6[0] = AV174TanqueN ;
                           GXv_char7[0] = AV146ProForDes ;
                           new app.pdyrp02(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_decimal18, GXv_int25, GXv_decimal13, GXv_int10, GXv_int8, GXv_int15, GXv_int4, GXv_int24, GXv_char11, GXv_int23, GXv_int22, GXv_int14, GXv_int21, GXv_int20, GXv_int19, GXv_int9, GXv_int12, GXv_int6, GXv_char7) ;
                           pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                           pdyrp000.this.A770ProForPrd = GXv_char16[0] ;
                           pdyrp000.this.AV45Canfor = GXv_decimal18[0] ;
                           pdyrp000.this.A490ForPrdUMe = GXv_int25[0] ;
                           pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
                           pdyrp000.this.AV39BarVol = GXv_int10[0] ;
                           pdyrp000.this.AV179ValCos = GXv_int8[0] ;
                           pdyrp000.this.AV112LinRec = GXv_int15[0] ;
                           pdyrp000.this.AV25Barcod = GXv_int4[0] ;
                           pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
                           pdyrp000.this.AV26Barcodpar = GXv_char11[0] ;
                           pdyrp000.this.AV67Flag1 = GXv_int23[0] ;
                           pdyrp000.this.AV68Flag2 = GXv_int22[0] ;
                           pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
                           pdyrp000.this.AV109Linea = GXv_int21[0] ;
                           pdyrp000.this.AV61ExiCon = GXv_int20[0] ;
                           pdyrp000.this.AV72FlagComp = GXv_int19[0] ;
                           pdyrp000.this.AV152RecForNro = GXv_int9[0] ;
                           pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
                           pdyrp000.this.AV174TanqueN = GXv_int6[0] ;
                           pdyrp000.this.AV146ProForDes = GXv_char7[0] ;
                        }
                     }
                     else
                     {
                        AV41Calve = A763ProForCla ;
                        AV137PrdVal = (byte)(0) ;
                        AV136PrdDesc = A765ProForDes ;
                        AV141Producto = A770ProForPrd ;
                        if ( ( GXutil.strcmp(A5358ProForClv, " ") != 0 ) && ( ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CX", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CF", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "DA", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A5358ProForClv, 1, 2), httpContext.getMessage( "CP", "")) == 0 ) ) )
                        {
                           AV136PrdDesc = A765ProForDes ;
                           AV141Producto = A770ProForPrd ;
                           GXv_char17[0] = A396EmprCod ;
                           GXv_char16[0] = AV141Producto ;
                           GXv_char11[0] = A5358ProForClv ;
                           GXv_int25[0] = AV137PrdVal ;
                           GXv_int10[0] = AV25Barcod ;
                           GXv_int24[0] = AV27Barcodreo ;
                           GXv_char7[0] = AV26Barcodpar ;
                           GXv_decimal18[0] = AV177TotKil ;
                           GXv_char3[0] = AV136PrdDesc ;
                           GXv_char2[0] = AV24Accion ;
                           GXv_int15[0] = AV32BarLinMaq ;
                           GXv_decimal13[0] = AV135Porc_p ;
                           new app.pdyrp012(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_char11, GXv_int25, GXv_int10, GXv_int24, GXv_char7, GXv_decimal18, GXv_char3, GXv_char2, GXv_int15, GXv_decimal13) ;
                           pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                           pdyrp000.this.AV141Producto = GXv_char16[0] ;
                           pdyrp000.this.A5358ProForClv = GXv_char11[0] ;
                           pdyrp000.this.AV137PrdVal = GXv_int25[0] ;
                           pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                           pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
                           pdyrp000.this.AV26Barcodpar = GXv_char7[0] ;
                           pdyrp000.this.AV177TotKil = GXv_decimal18[0] ;
                           pdyrp000.this.AV136PrdDesc = GXv_char3[0] ;
                           pdyrp000.this.AV24Accion = GXv_char2[0] ;
                           pdyrp000.this.AV32BarLinMaq = GXv_int15[0] ;
                           pdyrp000.this.AV135Porc_p = GXv_decimal13[0] ;
                        }
                        else
                        {
                           GXv_char17[0] = A396EmprCod ;
                           GXv_char16[0] = AV141Producto ;
                           GXv_char11[0] = A763ProForCla ;
                           GXv_int25[0] = AV137PrdVal ;
                           GXv_int10[0] = AV25Barcod ;
                           GXv_int24[0] = AV27Barcodreo ;
                           GXv_char7[0] = AV26Barcodpar ;
                           GXv_decimal18[0] = AV177TotKil ;
                           GXv_char3[0] = AV136PrdDesc ;
                           GXv_char2[0] = AV24Accion ;
                           GXv_int15[0] = AV32BarLinMaq ;
                           new app.pdyrp004(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_char11, GXv_int25, GXv_int10, GXv_int24, GXv_char7, GXv_decimal18, GXv_char3, GXv_char2, GXv_int15) ;
                           pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                           pdyrp000.this.AV141Producto = GXv_char16[0] ;
                           pdyrp000.this.A763ProForCla = GXv_char11[0] ;
                           pdyrp000.this.AV137PrdVal = GXv_int25[0] ;
                           pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                           pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
                           pdyrp000.this.AV26Barcodpar = GXv_char7[0] ;
                           pdyrp000.this.AV177TotKil = GXv_decimal18[0] ;
                           pdyrp000.this.AV136PrdDesc = GXv_char3[0] ;
                           pdyrp000.this.AV24Accion = GXv_char2[0] ;
                           pdyrp000.this.AV32BarLinMaq = GXv_int15[0] ;
                        }
                        if ( AV137PrdVal == 1 )
                        {
                           if ( ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "M", "")) == 0 ) )
                           {
                              AV113LinRecAnt = AV112LinRec ;
                              GXv_char17[0] = A396EmprCod ;
                              GXv_int10[0] = AV25Barcod ;
                              GXv_int25[0] = AV27Barcodreo ;
                              GXv_char16[0] = AV26Barcodpar ;
                              GXv_int15[0] = AV112LinRec ;
                              GXv_int14[0] = AV154RecLinIni ;
                              GXv_int12[0] = AV155RecLinMaq ;
                              GXv_int24[0] = AV156RecLinPro ;
                              new app.pdyrp003(remoteHandle, context).execute( GXv_char17, GXv_int10, GXv_int25, GXv_char16, GXv_int15, GXv_int14, GXv_int12, GXv_int24) ;
                              pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                              pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                              pdyrp000.this.AV27Barcodreo = GXv_int25[0] ;
                              pdyrp000.this.AV26Barcodpar = GXv_char16[0] ;
                              pdyrp000.this.AV112LinRec = GXv_int15[0] ;
                              pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
                              pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
                              pdyrp000.this.AV156RecLinPro = GXv_int24[0] ;
                           }
                           if ( ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "M", "")) == 0 ) && ( ( AV180vFlagMB == 0 ) || ( AV113LinRecAnt != AV112LinRec ) ) )
                           {
                              if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                              {
                                 AV141Producto = A770ProForPrd ;
                                 AV46Cantidad = A762ProForCan ;
                                 AV91ForPrdUMe = A490ForPrdUMe ;
                                 AV72FlagComp = (byte)(0) ;
                                 AV146ProForDes = A765ProForDes ;
                                 if ( AV77FlagLw == 1 )
                                 {
                                    AV174TanqueN = (byte)(1) ;
                                 }
                                 if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                                 {
                                    AV117MaqTipprd = httpContext.getMessage( "C", "") ;
                                 }
                                 else
                                 {
                                    AV117MaqTipprd = httpContext.getMessage( "P", "") ;
                                 }
                                 /* Execute user subroutine: 'MAQTNQ' */
                                 S1211 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(4);
                                    pr_default.close(2);
                                    returnInSub = true;
                                    cleanup();
                                    if (true) return;
                                 }
                                 if ( AV118MaqTqn > 0 )
                                 {
                                    AV174TanqueN = AV118MaqTqn ;
                                 }
                                 AV45Canfor = A762ProForCan ;
                                 if ( ( AV49CdpPor == 1 ) && ( AV145ProForCpo.doubleValue() > 0 ) && ( AV145ProForCpo.doubleValue() <= 100 ) )
                                 {
                                    AV45Canfor = (AV45Canfor.multiply(AV145ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                 }
                                 GXv_char17[0] = A396EmprCod ;
                                 GXv_char16[0] = A770ProForPrd ;
                                 GXv_decimal18[0] = AV45Canfor ;
                                 GXv_int25[0] = A490ForPrdUMe ;
                                 GXv_decimal13[0] = AV177TotKil ;
                                 GXv_int10[0] = AV39BarVol ;
                                 GXv_int8[0] = AV179ValCos ;
                                 GXv_int15[0] = AV112LinRec ;
                                 GXv_int4[0] = AV25Barcod ;
                                 GXv_int24[0] = AV27Barcodreo ;
                                 GXv_char11[0] = AV26Barcodpar ;
                                 GXv_int23[0] = AV67Flag1 ;
                                 GXv_int22[0] = AV68Flag2 ;
                                 GXv_int14[0] = AV154RecLinIni ;
                                 GXv_int21[0] = AV109Linea ;
                                 GXv_int20[0] = AV61ExiCon ;
                                 GXv_int19[0] = AV72FlagComp ;
                                 GXv_int9[0] = AV152RecForNro ;
                                 GXv_int12[0] = AV155RecLinMaq ;
                                 GXv_int6[0] = AV174TanqueN ;
                                 GXv_char7[0] = AV146ProForDes ;
                                 new app.pdyrp02(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_decimal18, GXv_int25, GXv_decimal13, GXv_int10, GXv_int8, GXv_int15, GXv_int4, GXv_int24, GXv_char11, GXv_int23, GXv_int22, GXv_int14, GXv_int21, GXv_int20, GXv_int19, GXv_int9, GXv_int12, GXv_int6, GXv_char7) ;
                                 pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                                 pdyrp000.this.A770ProForPrd = GXv_char16[0] ;
                                 pdyrp000.this.AV45Canfor = GXv_decimal18[0] ;
                                 pdyrp000.this.A490ForPrdUMe = GXv_int25[0] ;
                                 pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
                                 pdyrp000.this.AV39BarVol = GXv_int10[0] ;
                                 pdyrp000.this.AV179ValCos = GXv_int8[0] ;
                                 pdyrp000.this.AV112LinRec = GXv_int15[0] ;
                                 pdyrp000.this.AV25Barcod = GXv_int4[0] ;
                                 pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
                                 pdyrp000.this.AV26Barcodpar = GXv_char11[0] ;
                                 pdyrp000.this.AV67Flag1 = GXv_int23[0] ;
                                 pdyrp000.this.AV68Flag2 = GXv_int22[0] ;
                                 pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
                                 pdyrp000.this.AV109Linea = GXv_int21[0] ;
                                 pdyrp000.this.AV61ExiCon = GXv_int20[0] ;
                                 pdyrp000.this.AV72FlagComp = GXv_int19[0] ;
                                 pdyrp000.this.AV152RecForNro = GXv_int9[0] ;
                                 pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
                                 pdyrp000.this.AV174TanqueN = GXv_int6[0] ;
                                 pdyrp000.this.AV146ProForDes = GXv_char7[0] ;
                                 if ( AV73FlagExiPro == 0 )
                                 {
                                    /* Execute user subroutine: 'COMPUESTOS' */
                                    S141 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(4);
                                       pr_default.close(2);
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                 }
                                 AV72FlagComp = (byte)(0) ;
                              }
                              else
                              {
                                 AV146ProForDes = A765ProForDes ;
                                 if ( AV77FlagLw == 1 )
                                 {
                                    AV174TanqueN = (byte)(1) ;
                                 }
                                 if ( ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "7") <= 0 ) )
                                 {
                                    AV117MaqTipprd = httpContext.getMessage( "C", "") ;
                                 }
                                 else
                                 {
                                    AV117MaqTipprd = httpContext.getMessage( "P", "") ;
                                 }
                                 /* Execute user subroutine: 'MAQTNQ' */
                                 S1211 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(4);
                                    pr_default.close(2);
                                    returnInSub = true;
                                    cleanup();
                                    if (true) return;
                                 }
                                 if ( AV118MaqTqn > 0 )
                                 {
                                    AV174TanqueN = AV118MaqTqn ;
                                 }
                                 AV141Producto = A770ProForPrd ;
                                 AV110LineaRec = GXutil.str( AV112LinRec, 4, 0) ;
                                 AV45Canfor = A762ProForCan ;
                                 if ( ( AV49CdpPor == 1 ) && ( AV145ProForCpo.doubleValue() > 0 ) && ( AV145ProForCpo.doubleValue() <= 100 ) )
                                 {
                                    AV45Canfor = (AV45Canfor.multiply(AV145ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                                 }
                                 GXv_char17[0] = A396EmprCod ;
                                 GXv_char16[0] = A770ProForPrd ;
                                 GXv_decimal18[0] = AV45Canfor ;
                                 GXv_int25[0] = A490ForPrdUMe ;
                                 GXv_decimal13[0] = AV177TotKil ;
                                 GXv_int10[0] = AV39BarVol ;
                                 GXv_int8[0] = AV179ValCos ;
                                 GXv_int15[0] = AV112LinRec ;
                                 GXv_int4[0] = AV25Barcod ;
                                 GXv_int24[0] = AV27Barcodreo ;
                                 GXv_char11[0] = AV26Barcodpar ;
                                 GXv_int23[0] = AV67Flag1 ;
                                 GXv_int22[0] = AV68Flag2 ;
                                 GXv_int14[0] = AV154RecLinIni ;
                                 GXv_int21[0] = AV109Linea ;
                                 GXv_int20[0] = AV61ExiCon ;
                                 GXv_int19[0] = AV72FlagComp ;
                                 GXv_int9[0] = AV152RecForNro ;
                                 GXv_int12[0] = AV155RecLinMaq ;
                                 GXv_int6[0] = AV174TanqueN ;
                                 GXv_char7[0] = AV146ProForDes ;
                                 new app.pdyrp02(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_decimal18, GXv_int25, GXv_decimal13, GXv_int10, GXv_int8, GXv_int15, GXv_int4, GXv_int24, GXv_char11, GXv_int23, GXv_int22, GXv_int14, GXv_int21, GXv_int20, GXv_int19, GXv_int9, GXv_int12, GXv_int6, GXv_char7) ;
                                 pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                                 pdyrp000.this.A770ProForPrd = GXv_char16[0] ;
                                 pdyrp000.this.AV45Canfor = GXv_decimal18[0] ;
                                 pdyrp000.this.A490ForPrdUMe = GXv_int25[0] ;
                                 pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
                                 pdyrp000.this.AV39BarVol = GXv_int10[0] ;
                                 pdyrp000.this.AV179ValCos = GXv_int8[0] ;
                                 pdyrp000.this.AV112LinRec = GXv_int15[0] ;
                                 pdyrp000.this.AV25Barcod = GXv_int4[0] ;
                                 pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
                                 pdyrp000.this.AV26Barcodpar = GXv_char11[0] ;
                                 pdyrp000.this.AV67Flag1 = GXv_int23[0] ;
                                 pdyrp000.this.AV68Flag2 = GXv_int22[0] ;
                                 pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
                                 pdyrp000.this.AV109Linea = GXv_int21[0] ;
                                 pdyrp000.this.AV61ExiCon = GXv_int20[0] ;
                                 pdyrp000.this.AV72FlagComp = GXv_int19[0] ;
                                 pdyrp000.this.AV152RecForNro = GXv_int9[0] ;
                                 pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
                                 pdyrp000.this.AV174TanqueN = GXv_int6[0] ;
                                 pdyrp000.this.AV146ProForDes = GXv_char7[0] ;
                              }
                           }
                        }
                     }
                  }
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            A396EmprCod = W396EmprCod ;
            A764ProForCod = W764ProForCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV191GXV1 = (int)(AV191GXV1+1) ;
      }
      /*
         INSERT RECORD ON TABLE TXPBARMAQ

      */
      A396EmprCod = AV58Emprcod ;
      A2792TermiCod = AV175TermiCod ;
      A129BarCod = AV25Barcod ;
      A132BarCodReo = AV27Barcodreo ;
      A130BarCodPar = AV26Barcodpar ;
      A2794BarLinMaq = AV155RecLinMaq ;
      A2796BarMaqVol = AV39BarVol ;
      n2796BarMaqVol = false ;
      A2795BarMaqPrf = AV33BarMaqCod ;
      n2795BarMaqPrf = false ;
      A2797BarMaqFA = AV151RecFA ;
      n2797BarMaqFA = false ;
      A5116BarMaqB12 = (short)(0) ;
      n5116BarMaqB12 = false ;
      A5117BarMaqB13 = (short)(0) ;
      n5117BarMaqB13 = false ;
      A5118BarMaqB14 = (short)(0) ;
      n5118BarMaqB14 = false ;
      A5119BarMaqB15 = (short)(0) ;
      n5119BarMaqB15 = false ;
      A5120BarMaqNpr = "" ;
      n5120BarMaqNpr = false ;
      A5121BarMaqInt = 0 ;
      n5121BarMaqInt = false ;
      A8935BarSalM = httpContext.getMessage( "N", "") ;
      n8935BarSalM = false ;
      /* Using cursor P098O7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Boolean.valueOf(n2795BarMaqPrf), A2795BarMaqPrf, Boolean.valueOf(n2796BarMaqVol), Integer.valueOf(A2796BarMaqVol), Boolean.valueOf(n2797BarMaqFA), A2797BarMaqFA, Boolean.valueOf(n5116BarMaqB12), Short.valueOf(A5116BarMaqB12), Boolean.valueOf(n5117BarMaqB13), Short.valueOf(A5117BarMaqB13), Boolean.valueOf(n5118BarMaqB14), Short.valueOf(A5118BarMaqB14), Boolean.valueOf(n5119BarMaqB15), Short.valueOf(A5119BarMaqB15), Boolean.valueOf(n5120BarMaqNpr), A5120BarMaqNpr, Boolean.valueOf(n5121BarMaqInt), Integer.valueOf(A5121BarMaqInt), Boolean.valueOf(n8935BarSalM), A8935BarSalM});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
      if ( (pr_default.getStatus(5) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPBARTER

      */
      A396EmprCod = AV58Emprcod ;
      A2792TermiCod = AV175TermiCod ;
      A129BarCod = AV25Barcod ;
      A132BarCodReo = AV27Barcodreo ;
      A130BarCodPar = AV26Barcodpar ;
      /* Using cursor P098O8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTER");
      if ( (pr_default.getStatus(6) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      AV94i = (short)(1) ;
      AV109Linea = (byte)(0) ;
      while ( AV94i <= 100 )
      {
         if ( GXutil.strcmp(AV171Tab_procesos[AV94i-1], "") == 0 )
         {
            if (true) break;
         }
         AV144Proforcod = AV171Tab_procesos[AV94i-1] ;
         AV164RecVolPrf = AV173Tab_volumen[AV94i-1] ;
         AV158RecRb = AV172Tab_rb[AV94i-1] ;
         AV109Linea = (byte)(AV109Linea+5) ;
         /* Using cursor P098O9 */
         pr_default.execute(7, new Object[] {AV58Emprcod, AV144Proforcod});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A2392ProNumPro = P098O9_A2392ProNumPro[0] ;
            A12109ProNh2o = P098O9_A12109ProNh2o[0] ;
            n12109ProNh2o = P098O9_n12109ProNh2o[0] ;
            A764ProForCod = P098O9_A764ProForCod[0] ;
            A396EmprCod = P098O9_A396EmprCod[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPBARPR2

            */
            W396EmprCod = A396EmprCod ;
            A396EmprCod = AV58Emprcod ;
            A2792TermiCod = AV175TermiCod ;
            A129BarCod = AV25Barcod ;
            A132BarCodReo = AV27Barcodreo ;
            A130BarCodPar = AV26Barcodpar ;
            A2794BarLinMaq = AV155RecLinMaq ;
            A1255BarPrfLin = AV109Linea ;
            A207BarPrfCod = AV144Proforcod ;
            n207BarPrfCod = false ;
            A4871BarPrfPrg = A2392ProNumPro ;
            n4871BarPrfPrg = false ;
            A7254BarPrfRb = AV158RecRb ;
            n7254BarPrfRb = false ;
            A4869BarPrfVol = AV164RecVolPrf ;
            n4869BarPrfVol = false ;
            A10543BarPrfH2O = A12109ProNh2o ;
            n10543BarPrfH2O = false ;
            /* Using cursor P098O10 */
            pr_default.execute(8, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin), Boolean.valueOf(n207BarPrfCod), A207BarPrfCod, Boolean.valueOf(n4869BarPrfVol), Integer.valueOf(A4869BarPrfVol), Boolean.valueOf(n4871BarPrfPrg), Integer.valueOf(A4871BarPrfPrg), Boolean.valueOf(n7254BarPrfRb), A7254BarPrfRb, Boolean.valueOf(n10543BarPrfH2O), Short.valueOf(A10543BarPrfH2O)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
            if ( (pr_default.getStatus(8) == 1) )
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
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
         AV94i = (short)(AV94i+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PRODUCTOSESPECIALES' Routine */
      returnInSub = false ;
      /* Using cursor P098O11 */
      pr_default.execute(9, new Object[] {AV58Emprcod, Integer.valueOf(AV129NumColFor), Short.valueOf(AV132NumOrd)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A489ForPrdNor = P098O11_A489ForPrdNor[0] ;
         A486ForNumCol = P098O11_A486ForNumCol[0] ;
         A396EmprCod = P098O11_A396EmprCod[0] ;
         A719PrdNum = P098O11_A719PrdNum[0] ;
         A487ForPrdCan = P098O11_A487ForPrdCan[0] ;
         A490ForPrdUMe = P098O11_A490ForPrdUMe[0] ;
         A715PrdLin = P098O11_A715PrdLin[0] ;
         AV141Producto = A719PrdNum ;
         AV90ForPrdCan = A487ForPrdCan ;
         AV91ForPrdUMe = A490ForPrdUMe ;
         if ( AV55Dosi_pp == 1 )
         {
            AV90ForPrdCan = (AV90ForPrdCan.multiply(AV135Porc_p).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         }
         else
         {
            if ( ( AV49CdpPor == 1 ) && ( AV145ProForCpo.doubleValue() > 0 ) && ( AV145ProForCpo.doubleValue() <= 100 ) )
            {
               AV90ForPrdCan = (AV90ForPrdCan.multiply(AV145ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
            if ( AV134Por_can.doubleValue() > 0 )
            {
               AV90ForPrdCan = (AV90ForPrdCan.multiply(AV134Por_can)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            }
         }
         AV117MaqTipprd = ((GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1")>=0)&&(GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7")<=0) ? httpContext.getMessage( "C", "") : httpContext.getMessage( "P", "")) ;
         /* Execute user subroutine: 'MAQTNQ' */
         S1211 ();
         if ( returnInSub )
         {
            pr_default.close(9);
            returnInSub = true;
            if (true) return;
         }
         AV174TanqueN = ((AV118MaqTqn>0) ? AV118MaqTqn : AV174TanqueN) ;
         if ( ! (GXutil.strcmp("", AV141Producto)==0) )
         {
            GXv_char17[0] = A396EmprCod ;
            GXv_char16[0] = AV141Producto ;
            GXv_decimal18[0] = AV90ForPrdCan ;
            GXv_int25[0] = AV91ForPrdUMe ;
            GXv_decimal13[0] = AV177TotKil ;
            GXv_int10[0] = AV39BarVol ;
            GXv_int8[0] = AV179ValCos ;
            GXv_int15[0] = AV112LinRec ;
            GXv_int4[0] = AV25Barcod ;
            GXv_int24[0] = AV27Barcodreo ;
            GXv_char11[0] = AV26Barcodpar ;
            GXv_int23[0] = AV67Flag1 ;
            GXv_int22[0] = AV68Flag2 ;
            GXv_int14[0] = AV154RecLinIni ;
            GXv_int21[0] = AV109Linea ;
            GXv_int20[0] = AV61ExiCon ;
            GXv_int19[0] = AV72FlagComp ;
            GXv_int9[0] = AV152RecForNro ;
            GXv_int12[0] = AV155RecLinMaq ;
            GXv_int6[0] = AV174TanqueN ;
            GXv_char7[0] = AV146ProForDes ;
            new app.pdyrp02(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_decimal18, GXv_int25, GXv_decimal13, GXv_int10, GXv_int8, GXv_int15, GXv_int4, GXv_int24, GXv_char11, GXv_int23, GXv_int22, GXv_int14, GXv_int21, GXv_int20, GXv_int19, GXv_int9, GXv_int12, GXv_int6, GXv_char7) ;
            pdyrp000.this.A396EmprCod = GXv_char17[0] ;
            pdyrp000.this.AV141Producto = GXv_char16[0] ;
            pdyrp000.this.AV90ForPrdCan = GXv_decimal18[0] ;
            pdyrp000.this.AV91ForPrdUMe = GXv_int25[0] ;
            pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
            pdyrp000.this.AV39BarVol = GXv_int10[0] ;
            pdyrp000.this.AV179ValCos = GXv_int8[0] ;
            pdyrp000.this.AV112LinRec = GXv_int15[0] ;
            pdyrp000.this.AV25Barcod = GXv_int4[0] ;
            pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
            pdyrp000.this.AV26Barcodpar = GXv_char11[0] ;
            pdyrp000.this.AV67Flag1 = GXv_int23[0] ;
            pdyrp000.this.AV68Flag2 = GXv_int22[0] ;
            pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
            pdyrp000.this.AV109Linea = GXv_int21[0] ;
            pdyrp000.this.AV61ExiCon = GXv_int20[0] ;
            pdyrp000.this.AV72FlagComp = GXv_int19[0] ;
            pdyrp000.this.AV152RecForNro = GXv_int9[0] ;
            pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
            pdyrp000.this.AV174TanqueN = GXv_int6[0] ;
            pdyrp000.this.AV146ProForDes = GXv_char7[0] ;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S131( )
   {
      /* 'CTRL_PE' Routine */
      returnInSub = false ;
      AV63Existe_p = (byte)(0) ;
      /* Using cursor P098O12 */
      pr_default.execute(10, new Object[] {AV58Emprcod, Integer.valueOf(AV129NumColFor), Short.valueOf(AV132NumOrd)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A396EmprCod = P098O12_A396EmprCod[0] ;
         A486ForNumCol = P098O12_A486ForNumCol[0] ;
         A489ForPrdNor = P098O12_A489ForPrdNor[0] ;
         A715PrdLin = P098O12_A715PrdLin[0] ;
         AV63Existe_p = (byte)(1) ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S141( )
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
      /* Using cursor P098O13 */
      pr_default.execute(11, new Object[] {AV58Emprcod, AV141Producto});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A688PrdComCod = P098O13_A688PrdComCod[0] ;
         A396EmprCod = P098O13_A396EmprCod[0] ;
         A690PrdComFN = P098O13_A690PrdComFN[0] ;
         A719PrdNum = P098O13_A719PrdNum[0] ;
         AV142ProForCan = AV46Cantidad.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV72FlagComp = (byte)(1) ;
         AV146ProForDes = "" ;
         if ( AV91ForPrdUMe == 3 )
         {
            AV142ProForCan = AV142ProForCan.multiply(AV177TotKil).multiply(DecimalUtil.doubleToDec(AV179ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV142ProForCan = AV142ProForCan.multiply(DecimalUtil.doubleToDec(AV39BarVol)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         GXv_char17[0] = A396EmprCod ;
         GXv_char16[0] = A719PrdNum ;
         GXv_decimal18[0] = AV142ProForCan ;
         new app.pdyrp05(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_decimal18) ;
         pdyrp000.this.A396EmprCod = GXv_char17[0] ;
         pdyrp000.this.A719PrdNum = GXv_char16[0] ;
         pdyrp000.this.AV142ProForCan = GXv_decimal18[0] ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S1211( )
   {
      /* 'MAQTNQ' Routine */
      returnInSub = false ;
      AV118MaqTqn = (byte)(0) ;
      /* Using cursor P098O14 */
      pr_default.execute(12, new Object[] {AV58Emprcod, AV33BarMaqCod, AV117MaqTipprd});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A396EmprCod = P098O14_A396EmprCod[0] ;
         A602MaqCod = P098O14_A602MaqCod[0] ;
         A6261MaqTipPrd = P098O14_A6261MaqTipPrd[0] ;
         n6261MaqTipPrd = P098O14_n6261MaqTipPrd[0] ;
         A6260MaqTqn = P098O14_A6260MaqTqn[0] ;
         AV118MaqTqn = A6260MaqTqn ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S151( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      /* Using cursor P098O15 */
      pr_default.execute(13, new Object[] {AV58Emprcod, Integer.valueOf(AV129NumColFor), Byte.valueOf(AV123Ncar), AV148ProForPrd, Byte.valueOf(AV123Ncar)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A719PrdNum = P098O15_A719PrdNum[0] ;
         A486ForNumCol = P098O15_A486ForNumCol[0] ;
         A396EmprCod = P098O15_A396EmprCod[0] ;
         A481ForCan = P098O15_A481ForCan[0] ;
         A6193ForClaCol = P098O15_A6193ForClaCol[0] ;
         A718PrdNom = P098O15_A718PrdNom[0] ;
         A490ForPrdUMe = P098O15_A490ForPrdUMe[0] ;
         A309ColLin = P098O15_A309ColLin[0] ;
         A718PrdNom = P098O15_A718PrdNom[0] ;
         if ( AV77FlagLw == 1 )
         {
            if ( AV127NroTanN == 2 )
            {
               AV174TanqueN = (byte)(2) ;
            }
            else
            {
               AV174TanqueN = (byte)(1) ;
            }
         }
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
         {
            AV117MaqTipprd = httpContext.getMessage( "C", "") ;
         }
         else
         {
            AV117MaqTipprd = httpContext.getMessage( "P", "") ;
         }
         /* Execute user subroutine: 'MAQTNQ' */
         S1211 ();
         if ( returnInSub )
         {
            pr_default.close(13);
            pr_default.close(13);
            returnInSub = true;
            if (true) return;
         }
         if ( AV118MaqTqn > 0 )
         {
            AV174TanqueN = AV118MaqTqn ;
         }
         AV86ForCan = A481ForCan ;
         if ( AV83FlagTintto == 1 )
         {
            AV86ForCan = A481ForCan.multiply(AV46Cantidad) ;
         }
         if ( AV166Rontaltex.doubleValue() == 1 )
         {
            AV86ForCan = AV86ForCan.add(AV86ForCan.multiply(AV133PartCoef).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         }
         if ( ( AV49CdpPor == 1 ) && ( AV145ProForCpo.doubleValue() > 0 ) && ( AV145ProForCpo.doubleValue() <= 100 ) )
         {
            AV86ForCan = (AV86ForCan.multiply(AV145ProForCpo)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         }
         if ( ( AV51ClaveColor == 1 ) && ! (GXutil.strcmp("", A6193ForClaCol)==0) )
         {
            AV137PrdVal = (byte)(0) ;
            AV136PrdDesc = A718PrdNom ;
            AV141Producto = A719PrdNum ;
            GXv_char17[0] = A396EmprCod ;
            GXv_char16[0] = AV141Producto ;
            GXv_char11[0] = A6193ForClaCol ;
            GXv_int25[0] = AV137PrdVal ;
            GXv_int10[0] = AV25Barcod ;
            GXv_int24[0] = AV27Barcodreo ;
            GXv_char7[0] = AV26Barcodpar ;
            GXv_decimal18[0] = AV177TotKil ;
            GXv_char3[0] = AV136PrdDesc ;
            GXv_char2[0] = AV24Accion ;
            GXv_int15[0] = AV32BarLinMaq ;
            new app.pdyrp004(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_char11, GXv_int25, GXv_int10, GXv_int24, GXv_char7, GXv_decimal18, GXv_char3, GXv_char2, GXv_int15) ;
            pdyrp000.this.A396EmprCod = GXv_char17[0] ;
            pdyrp000.this.AV141Producto = GXv_char16[0] ;
            pdyrp000.this.A6193ForClaCol = GXv_char11[0] ;
            pdyrp000.this.AV137PrdVal = GXv_int25[0] ;
            pdyrp000.this.AV25Barcod = GXv_int10[0] ;
            pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
            pdyrp000.this.AV26Barcodpar = GXv_char7[0] ;
            pdyrp000.this.AV177TotKil = GXv_decimal18[0] ;
            pdyrp000.this.AV136PrdDesc = GXv_char3[0] ;
            pdyrp000.this.AV24Accion = GXv_char2[0] ;
            pdyrp000.this.AV32BarLinMaq = GXv_int15[0] ;
            if ( AV137PrdVal == 1 )
            {
               if ( ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "M", "")) == 0 ) )
               {
                  GXv_char17[0] = A396EmprCod ;
                  GXv_int10[0] = AV25Barcod ;
                  GXv_int25[0] = AV27Barcodreo ;
                  GXv_char16[0] = AV26Barcodpar ;
                  GXv_int15[0] = AV112LinRec ;
                  GXv_int14[0] = AV154RecLinIni ;
                  GXv_int12[0] = AV155RecLinMaq ;
                  GXv_int24[0] = AV156RecLinPro ;
                  new app.pdyrp003(remoteHandle, context).execute( GXv_char17, GXv_int10, GXv_int25, GXv_char16, GXv_int15, GXv_int14, GXv_int12, GXv_int24) ;
                  pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                  pdyrp000.this.AV25Barcod = GXv_int10[0] ;
                  pdyrp000.this.AV27Barcodreo = GXv_int25[0] ;
                  pdyrp000.this.AV26Barcodpar = GXv_char16[0] ;
                  pdyrp000.this.AV112LinRec = GXv_int15[0] ;
                  pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
                  pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
                  pdyrp000.this.AV156RecLinPro = GXv_int24[0] ;
               }
               if ( ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "M", "")) == 0 ) )
               {
                  AV146ProForDes = A718PrdNom ;
                  if ( AV77FlagLw == 1 )
                  {
                     AV174TanqueN = (byte)(1) ;
                  }
                  AV141Producto = A719PrdNum ;
                  AV110LineaRec = GXutil.str( AV112LinRec, 4, 0) ;
                  GXv_char17[0] = A396EmprCod ;
                  GXv_char16[0] = AV141Producto ;
                  GXv_decimal18[0] = AV86ForCan ;
                  GXv_int25[0] = A490ForPrdUMe ;
                  GXv_decimal13[0] = AV177TotKil ;
                  GXv_int10[0] = AV39BarVol ;
                  GXv_int8[0] = AV179ValCos ;
                  GXv_int15[0] = AV112LinRec ;
                  GXv_int4[0] = AV25Barcod ;
                  GXv_int24[0] = AV27Barcodreo ;
                  GXv_char11[0] = AV26Barcodpar ;
                  GXv_int23[0] = AV67Flag1 ;
                  GXv_int22[0] = AV68Flag2 ;
                  GXv_int14[0] = AV154RecLinIni ;
                  GXv_int21[0] = AV109Linea ;
                  GXv_int20[0] = AV61ExiCon ;
                  GXv_int19[0] = AV72FlagComp ;
                  GXv_int9[0] = AV152RecForNro ;
                  GXv_int12[0] = AV155RecLinMaq ;
                  GXv_int6[0] = AV174TanqueN ;
                  GXv_char7[0] = AV146ProForDes ;
                  new app.pdyrp02(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_decimal18, GXv_int25, GXv_decimal13, GXv_int10, GXv_int8, GXv_int15, GXv_int4, GXv_int24, GXv_char11, GXv_int23, GXv_int22, GXv_int14, GXv_int21, GXv_int20, GXv_int19, GXv_int9, GXv_int12, GXv_int6, GXv_char7) ;
                  pdyrp000.this.A396EmprCod = GXv_char17[0] ;
                  pdyrp000.this.AV141Producto = GXv_char16[0] ;
                  pdyrp000.this.AV86ForCan = GXv_decimal18[0] ;
                  pdyrp000.this.A490ForPrdUMe = GXv_int25[0] ;
                  pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
                  pdyrp000.this.AV39BarVol = GXv_int10[0] ;
                  pdyrp000.this.AV179ValCos = GXv_int8[0] ;
                  pdyrp000.this.AV112LinRec = GXv_int15[0] ;
                  pdyrp000.this.AV25Barcod = GXv_int4[0] ;
                  pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
                  pdyrp000.this.AV26Barcodpar = GXv_char11[0] ;
                  pdyrp000.this.AV67Flag1 = GXv_int23[0] ;
                  pdyrp000.this.AV68Flag2 = GXv_int22[0] ;
                  pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
                  pdyrp000.this.AV109Linea = GXv_int21[0] ;
                  pdyrp000.this.AV61ExiCon = GXv_int20[0] ;
                  pdyrp000.this.AV72FlagComp = GXv_int19[0] ;
                  pdyrp000.this.AV152RecForNro = GXv_int9[0] ;
                  pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
                  pdyrp000.this.AV174TanqueN = GXv_int6[0] ;
                  pdyrp000.this.AV146ProForDes = GXv_char7[0] ;
               }
            }
         }
         else
         {
            GXv_char17[0] = A396EmprCod ;
            GXv_char16[0] = A719PrdNum ;
            GXv_decimal18[0] = AV86ForCan ;
            GXv_int25[0] = A490ForPrdUMe ;
            GXv_decimal13[0] = AV177TotKil ;
            GXv_int10[0] = AV39BarVol ;
            GXv_int8[0] = AV179ValCos ;
            GXv_int15[0] = AV112LinRec ;
            GXv_int4[0] = AV25Barcod ;
            GXv_int24[0] = AV27Barcodreo ;
            GXv_char11[0] = AV26Barcodpar ;
            GXv_int23[0] = AV67Flag1 ;
            GXv_int22[0] = AV68Flag2 ;
            GXv_int14[0] = AV154RecLinIni ;
            GXv_int21[0] = AV109Linea ;
            GXv_int20[0] = AV61ExiCon ;
            GXv_int19[0] = AV72FlagComp ;
            GXv_int9[0] = AV152RecForNro ;
            GXv_int12[0] = AV155RecLinMaq ;
            GXv_int6[0] = AV174TanqueN ;
            GXv_char7[0] = AV146ProForDes ;
            new app.pdyrp02(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_decimal18, GXv_int25, GXv_decimal13, GXv_int10, GXv_int8, GXv_int15, GXv_int4, GXv_int24, GXv_char11, GXv_int23, GXv_int22, GXv_int14, GXv_int21, GXv_int20, GXv_int19, GXv_int9, GXv_int12, GXv_int6, GXv_char7) ;
            pdyrp000.this.A396EmprCod = GXv_char17[0] ;
            pdyrp000.this.A719PrdNum = GXv_char16[0] ;
            pdyrp000.this.AV86ForCan = GXv_decimal18[0] ;
            pdyrp000.this.A490ForPrdUMe = GXv_int25[0] ;
            pdyrp000.this.AV177TotKil = GXv_decimal13[0] ;
            pdyrp000.this.AV39BarVol = GXv_int10[0] ;
            pdyrp000.this.AV179ValCos = GXv_int8[0] ;
            pdyrp000.this.AV112LinRec = GXv_int15[0] ;
            pdyrp000.this.AV25Barcod = GXv_int4[0] ;
            pdyrp000.this.AV27Barcodreo = GXv_int24[0] ;
            pdyrp000.this.AV26Barcodpar = GXv_char11[0] ;
            pdyrp000.this.AV67Flag1 = GXv_int23[0] ;
            pdyrp000.this.AV68Flag2 = GXv_int22[0] ;
            pdyrp000.this.AV154RecLinIni = GXv_int14[0] ;
            pdyrp000.this.AV109Linea = GXv_int21[0] ;
            pdyrp000.this.AV61ExiCon = GXv_int20[0] ;
            pdyrp000.this.AV72FlagComp = GXv_int19[0] ;
            pdyrp000.this.AV152RecForNro = GXv_int9[0] ;
            pdyrp000.this.AV155RecLinMaq = GXv_int12[0] ;
            pdyrp000.this.AV174TanqueN = GXv_int6[0] ;
            pdyrp000.this.AV146ProForDes = GXv_char7[0] ;
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp000");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV177TotKil = DecimalUtil.ZERO ;
      AV178TotMet = DecimalUtil.ZERO ;
      AV185RecetasTinteProcesosQuimicos_SDTs = new GXBaseCollection<app.SdtRecetasTinteProcesosQuimicos_SDT>(app.SdtRecetasTinteProcesosQuimicos_SDT.class, "RecetasTinteProcesosQuimicos_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P098O2_A120BarAgrEst = new String[] {""} ;
      P098O2_A5053BarBp12 = new short[1] ;
      P098O2_n5053BarBp12 = new boolean[] {false} ;
      P098O2_A5054BarBp13 = new short[1] ;
      P098O2_n5054BarBp13 = new boolean[] {false} ;
      P098O2_A5055BarBp14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098O2_n5055BarBp14 = new boolean[] {false} ;
      P098O2_A5056BarBp15 = new short[1] ;
      P098O2_n5056BarBp15 = new boolean[] {false} ;
      P098O2_A5057BarFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098O2_n5057BarFacAbs = new boolean[] {false} ;
      P098O2_A3594BarPriTin = new byte[1] ;
      P098O2_A130BarCodPar = new String[] {""} ;
      P098O2_A132BarCodReo = new byte[1] ;
      P098O2_A129BarCod = new int[1] ;
      P098O2_A396EmprCod = new String[] {""} ;
      P098O2_A252CliCod = new int[1] ;
      P098O2_n252CliCod = new boolean[] {false} ;
      P098O2_A212BarSer = new String[] {""} ;
      P098O2_A135BarColNom = new String[] {""} ;
      P098O2_A136BarColNum = new int[1] ;
      P098O2_A218BarTipCol = new byte[1] ;
      A120BarAgrEst = "" ;
      A5055BarBp14 = DecimalUtil.ZERO ;
      A5057BarFacAbs = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W602MaqCod = "" ;
      A602MaqCod = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A4258RecMaqFas = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A4264RecBarPar = "" ;
      A4281RecAgrEst = "" ;
      A4298RecRecLan = "" ;
      A4402RecUsrCod = "" ;
      AV162RecUsrCod = "" ;
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      A5110RecNumPrg = "" ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A5430RecFecPla = GXutil.nullDate() ;
      A6039RecAcab = "" ;
      A6269RecPrg2 = "" ;
      A6270RecPrg3 = "" ;
      A7771RecMaqCla = "" ;
      A8353RecMaqObs = "" ;
      A9811RecAbs2 = DecimalUtil.ZERO ;
      A9812RecHdrLts = "" ;
      A9996RecObsq = "" ;
      A10124Rsedo1 = DecimalUtil.ZERO ;
      A10125Rsedo2 = DecimalUtil.ZERO ;
      A10127Rsedo4 = DecimalUtil.ZERO ;
      A11507RecAva = "" ;
      A12128RecAs = "" ;
      A12129RecAi = "" ;
      A12270Rsedo7 = DecimalUtil.ZERO ;
      A12271Rsedo8 = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV35BarNumTon = "" ;
      AV184RecetasTinteProcesosQuimicos_SDT = new app.SdtRecetasTinteProcesosQuimicos_SDT(remoteHandle, context);
      AV144Proforcod = "" ;
      AV158RecRb = DecimalUtil.ZERO ;
      P098O4_A4586ProForObs = new String[] {""} ;
      P098O4_n4586ProForObs = new boolean[] {false} ;
      P098O4_A2392ProNumPro = new int[1] ;
      P098O4_A2393ProNumRec = new int[1] ;
      P098O4_A10547ProH2O = new short[1] ;
      P098O4_A771ProForTie = new short[1] ;
      P098O4_A764ProForCod = new String[] {""} ;
      P098O4_A396EmprCod = new String[] {""} ;
      A4586ProForObs = "" ;
      A764ProForCod = "" ;
      W764ProForCod = "" ;
      A4587ProRecObs = "" ;
      A7257RecRb = DecimalUtil.ZERO ;
      P098O6_A396EmprCod = new String[] {""} ;
      P098O6_A764ProForCod = new String[] {""} ;
      P098O6_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098O6_A1645ProForNro = new byte[1] ;
      P098O6_A765ProForDes = new String[] {""} ;
      P098O6_A770ProForPrd = new String[] {""} ;
      P098O6_A3379ProForTnq = new byte[1] ;
      P098O6_A5358ProForClv = new String[] {""} ;
      P098O6_A763ProForCla = new String[] {""} ;
      P098O6_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098O6_A490ForPrdUMe = new byte[1] ;
      P098O6_A767ProForLin = new short[1] ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A765ProForDes = "" ;
      A770ProForPrd = "" ;
      A5358ProForClv = "" ;
      A763ProForCla = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      AV145ProForCpo = DecimalUtil.ZERO ;
      AV146ProForDes = "" ;
      AV148ProForPrd = "" ;
      AV141Producto = "" ;
      AV114llamo_pe = "" ;
      AV136PrdDesc = "" ;
      AV24Accion = "" ;
      AV135Porc_p = DecimalUtil.ZERO ;
      AV134Por_can = DecimalUtil.ZERO ;
      AV140Produc = "" ;
      AV46Cantidad = DecimalUtil.ZERO ;
      AV41Calve = "" ;
      AV117MaqTipprd = "" ;
      AV45Canfor = DecimalUtil.ZERO ;
      AV110LineaRec = "" ;
      A2792TermiCod = "" ;
      A2795BarMaqPrf = "" ;
      A2797BarMaqFA = DecimalUtil.ZERO ;
      A5120BarMaqNpr = "" ;
      A8935BarSalM = "" ;
      AV171Tab_procesos = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV171Tab_procesos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV173Tab_volumen = new int[100] ;
      AV172Tab_rb = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV172Tab_rb[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P098O9_A2392ProNumPro = new int[1] ;
      P098O9_A12109ProNh2o = new short[1] ;
      P098O9_n12109ProNh2o = new boolean[] {false} ;
      P098O9_A764ProForCod = new String[] {""} ;
      P098O9_A396EmprCod = new String[] {""} ;
      A207BarPrfCod = "" ;
      A7254BarPrfRb = DecimalUtil.ZERO ;
      P098O11_A489ForPrdNor = new short[1] ;
      P098O11_A486ForNumCol = new int[1] ;
      P098O11_A396EmprCod = new String[] {""} ;
      P098O11_A719PrdNum = new String[] {""} ;
      P098O11_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098O11_A490ForPrdUMe = new byte[1] ;
      P098O11_A715PrdLin = new short[1] ;
      A719PrdNum = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      AV90ForPrdCan = DecimalUtil.ZERO ;
      P098O12_A396EmprCod = new String[] {""} ;
      P098O12_A486ForNumCol = new int[1] ;
      P098O12_A489ForPrdNor = new short[1] ;
      P098O12_A715PrdLin = new short[1] ;
      P098O13_A688PrdComCod = new String[] {""} ;
      P098O13_A396EmprCod = new String[] {""} ;
      P098O13_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098O13_A719PrdNum = new String[] {""} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      AV142ProForCan = DecimalUtil.ZERO ;
      P098O14_A396EmprCod = new String[] {""} ;
      P098O14_A602MaqCod = new String[] {""} ;
      P098O14_A6261MaqTipPrd = new String[] {""} ;
      P098O14_n6261MaqTipPrd = new boolean[] {false} ;
      P098O14_A6260MaqTqn = new byte[1] ;
      A6261MaqTipPrd = "" ;
      P098O15_A719PrdNum = new String[] {""} ;
      P098O15_A486ForNumCol = new int[1] ;
      P098O15_A396EmprCod = new String[] {""} ;
      P098O15_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098O15_A6193ForClaCol = new String[] {""} ;
      P098O15_A718PrdNom = new String[] {""} ;
      P098O15_A490ForPrdUMe = new byte[1] ;
      P098O15_A309ColLin = new short[1] ;
      A481ForCan = DecimalUtil.ZERO ;
      A6193ForClaCol = "" ;
      A718PrdNom = "" ;
      AV86ForCan = DecimalUtil.ZERO ;
      AV166Rontaltex = DecimalUtil.ZERO ;
      AV133PartCoef = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_int25 = new byte[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int15 = new short[1] ;
      GXv_int4 = new int[1] ;
      GXv_int24 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int23 = new byte[1] ;
      GXv_int22 = new byte[1] ;
      GXv_int14 = new short[1] ;
      GXv_int21 = new byte[1] ;
      GXv_int20 = new byte[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int12 = new short[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp000__default(),
         new Object[] {
             new Object[] {
            P098O2_A120BarAgrEst, P098O2_A5053BarBp12, P098O2_n5053BarBp12, P098O2_A5054BarBp13, P098O2_n5054BarBp13, P098O2_A5055BarBp14, P098O2_n5055BarBp14, P098O2_A5056BarBp15, P098O2_n5056BarBp15, P098O2_A5057BarFacAbs,
            P098O2_n5057BarFacAbs, P098O2_A3594BarPriTin, P098O2_A130BarCodPar, P098O2_A132BarCodReo, P098O2_A129BarCod, P098O2_A396EmprCod, P098O2_A252CliCod, P098O2_n252CliCod, P098O2_A212BarSer, P098O2_A135BarColNom,
            P098O2_A136BarColNum, P098O2_A218BarTipCol
            }
            , new Object[] {
            }
            , new Object[] {
            P098O4_A4586ProForObs, P098O4_n4586ProForObs, P098O4_A2392ProNumPro, P098O4_A2393ProNumRec, P098O4_A10547ProH2O, P098O4_A771ProForTie, P098O4_A764ProForCod, P098O4_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P098O6_A396EmprCod, P098O6_A764ProForCod, P098O6_A6062ProForCPo, P098O6_A1645ProForNro, P098O6_A765ProForDes, P098O6_A770ProForPrd, P098O6_A3379ProForTnq, P098O6_A5358ProForClv, P098O6_A763ProForCla, P098O6_A762ProForCan,
            P098O6_A490ForPrdUMe, P098O6_A767ProForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P098O9_A2392ProNumPro, P098O9_A12109ProNh2o, P098O9_n12109ProNh2o, P098O9_A764ProForCod, P098O9_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P098O11_A489ForPrdNor, P098O11_A486ForNumCol, P098O11_A396EmprCod, P098O11_A719PrdNum, P098O11_A487ForPrdCan, P098O11_A490ForPrdUMe, P098O11_A715PrdLin
            }
            , new Object[] {
            P098O12_A396EmprCod, P098O12_A486ForNumCol, P098O12_A489ForPrdNor, P098O12_A715PrdLin
            }
            , new Object[] {
            P098O13_A688PrdComCod, P098O13_A396EmprCod, P098O13_A690PrdComFN, P098O13_A719PrdNum
            }
            , new Object[] {
            P098O14_A396EmprCod, P098O14_A602MaqCod, P098O14_A6261MaqTipPrd, P098O14_n6261MaqTipPrd, P098O14_A6260MaqTqn
            }
            , new Object[] {
            P098O15_A719PrdNum, P098O15_A486ForNumCol, P098O15_A396EmprCod, P098O15_A481ForCan, P098O15_A6193ForClaCol, P098O15_A718PrdNom, P098O15_A490ForPrdUMe, P098O15_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27Barcodreo ;
   private byte AV49CdpPor ;
   private byte AV176TnqPro ;
   private byte GXt_int5 ;
   private byte A3594BarPriTin ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte W132BarCodReo ;
   private byte A1272UltLinPro ;
   private byte A4263RecBarReo ;
   private byte A4575RecMaqPes ;
   private byte A4700RecEnvio ;
   private byte A4701RecRecep ;
   private byte A5412RecIntCol ;
   private byte A5431RecPriPla ;
   private byte A7765RecMaqVX ;
   private byte A7766RecMaqBL ;
   private byte A7767RecMaqFlow ;
   private byte A7772RecMaqTej ;
   private byte A7773RecMaqDel ;
   private byte A10128Rsedo5 ;
   private byte A10129Rsedo6 ;
   private byte A10385RecCAut ;
   private byte AV87ForCon ;
   private byte AV156RecLinPro ;
   private byte AV109Linea ;
   private byte A1273RecLinPro ;
   private byte AV72FlagComp ;
   private byte A1645ProForNro ;
   private byte A3379ProForTnq ;
   private byte A490ForPrdUMe ;
   private byte AV152RecForNro ;
   private byte AV174TanqueN ;
   private byte AV91ForPrdUMe ;
   private byte AV137PrdVal ;
   private byte AV55Dosi_pp ;
   private byte AV63Existe_p ;
   private byte AV123Ncar ;
   private byte AV77FlagLw ;
   private byte AV118MaqTqn ;
   private byte AV67Flag1 ;
   private byte AV68Flag2 ;
   private byte AV61ExiCon ;
   private byte AV73FlagExiPro ;
   private byte AV180vFlagMB ;
   private byte A6260MaqTqn ;
   private byte AV127NroTanN ;
   private byte AV83FlagTintto ;
   private byte AV51ClaveColor ;
   private byte GXv_int25[] ;
   private byte GXv_int24[] ;
   private byte GXv_int23[] ;
   private byte GXv_int22[] ;
   private byte GXv_int21[] ;
   private byte GXv_int20[] ;
   private byte GXv_int19[] ;
   private byte GXv_int9[] ;
   private byte GXv_int6[] ;
   private short AV155RecLinMaq ;
   private short A5053BarBp12 ;
   private short A5054BarBp13 ;
   private short A5056BarBp15 ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short A5111RecBp12 ;
   private short A5112RecBp13 ;
   private short A5113RecBp14 ;
   private short A5114RecBp15 ;
   private short A5256RecUltObs ;
   private short A5407RecUltLCo ;
   private short A5413RecMatCol ;
   private short A7764RecMaqNh ;
   private short A7768RecMaqRPM ;
   private short A7769RecMaqMol ;
   private short A7770RecMaqTor ;
   private short A7774RecMaqPML ;
   private short A8367RecPriAca ;
   private short A9997Recgrm ;
   private short A9998RecAnc ;
   private short A10126Rsedo3 ;
   private short A12272Rsedo9 ;
   private short A12273Rsedo10 ;
   private short A12274Rsedo11 ;
   private short A12900Rsedo12 ;
   private short A12901Rsedo13 ;
   private short Gx_err ;
   private short AV94i ;
   private short AV153RecLin ;
   private short AV154RecLinIni ;
   private short A10547ProH2O ;
   private short A771ProForTie ;
   private short A10544RecNH2O ;
   private short A4696RecTiempo ;
   private short AV32BarLinMaq ;
   private short A767ProForLin ;
   private short AV112LinRec ;
   private short AV132NumOrd ;
   private short AV113LinRecAnt ;
   private short A2794BarLinMaq ;
   private short A5116BarMaqB12 ;
   private short A5117BarMaqB13 ;
   private short A5118BarMaqB14 ;
   private short A5119BarMaqB15 ;
   private short A12109ProNh2o ;
   private short A1255BarPrfLin ;
   private short A10543BarPrfH2O ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short A309ColLin ;
   private short GXv_int15[] ;
   private short GXv_int14[] ;
   private short GXv_int12[] ;
   private int AV25Barcod ;
   private int AV39BarVol ;
   private int AV179ValCos ;
   private int GXt_int1 ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int W129BarCod ;
   private int AV157RecNumInt ;
   private int GX_INS408 ;
   private int A2805RecVolPrd ;
   private int A4261RecTotPrd ;
   private int A4262RecBarCod ;
   private int A4654RecNroPar ;
   private int A5109RecNumInt ;
   private int A9764RecLtsSR ;
   private int A9765RecLtsDf ;
   private int A12902Rsedo14 ;
   private int AV129NumColFor ;
   private int AV191GXV1 ;
   private int AV164RecVolPrf ;
   private int A2392ProNumPro ;
   private int A2393ProNumRec ;
   private int GX_INS409 ;
   private int A4697RecNroPrg ;
   private int A4695RecVolPrf ;
   private int A1251RecNumRec ;
   private int GX_INS406 ;
   private int A2796BarMaqVol ;
   private int A5121BarMaqInt ;
   private int GX_INS405 ;
   private int AV173Tab_volumen[] ;
   private int GX_INS407 ;
   private int A4871BarPrfPrg ;
   private int A4869BarPrfVol ;
   private int A486ForNumCol ;
   private int GXv_int10[] ;
   private int GXv_int8[] ;
   private int GXv_int4[] ;
   private int GX_I ;
   private java.math.BigDecimal AV151RecFA ;
   private java.math.BigDecimal AV160RecTotKgs ;
   private java.math.BigDecimal AV161RecTotMts ;
   private java.math.BigDecimal AV177TotKil ;
   private java.math.BigDecimal AV178TotMet ;
   private java.math.BigDecimal A5055BarBp14 ;
   private java.math.BigDecimal A5057BarFacAbs ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal A9811RecAbs2 ;
   private java.math.BigDecimal A10124Rsedo1 ;
   private java.math.BigDecimal A10125Rsedo2 ;
   private java.math.BigDecimal A10127Rsedo4 ;
   private java.math.BigDecimal A12270Rsedo7 ;
   private java.math.BigDecimal A12271Rsedo8 ;
   private java.math.BigDecimal AV158RecRb ;
   private java.math.BigDecimal A7257RecRb ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV145ProForCpo ;
   private java.math.BigDecimal AV135Porc_p ;
   private java.math.BigDecimal AV134Por_can ;
   private java.math.BigDecimal AV46Cantidad ;
   private java.math.BigDecimal AV45Canfor ;
   private java.math.BigDecimal A2797BarMaqFA ;
   private java.math.BigDecimal AV172Tab_rb[] ;
   private java.math.BigDecimal A7254BarPrfRb ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV90ForPrdCan ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV142ProForCan ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV86ForCan ;
   private java.math.BigDecimal AV166Rontaltex ;
   private java.math.BigDecimal AV133PartCoef ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String AV58Emprcod ;
   private String AV26Barcodpar ;
   private String AV33BarMaqCod ;
   private String AV186BarMacpro ;
   private String AV175TermiCod ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W602MaqCod ;
   private String A602MaqCod ;
   private String A4258RecMaqFas ;
   private String A4264RecBarPar ;
   private String A4281RecAgrEst ;
   private String A4298RecRecLan ;
   private String A4402RecUsrCod ;
   private String AV162RecUsrCod ;
   private String A4868RecUsrMod ;
   private String A5110RecNumPrg ;
   private String A6039RecAcab ;
   private String A6269RecPrg2 ;
   private String A6270RecPrg3 ;
   private String A7771RecMaqCla ;
   private String A9812RecHdrLts ;
   private String A11507RecAva ;
   private String A12128RecAs ;
   private String A12129RecAi ;
   private String Gx_emsg ;
   private String AV35BarNumTon ;
   private String AV144Proforcod ;
   private String A764ProForCod ;
   private String W764ProForCod ;
   private String A765ProForDes ;
   private String A770ProForPrd ;
   private String A5358ProForClv ;
   private String A763ProForCla ;
   private String AV146ProForDes ;
   private String AV148ProForPrd ;
   private String AV141Producto ;
   private String AV114llamo_pe ;
   private String AV136PrdDesc ;
   private String AV24Accion ;
   private String AV140Produc ;
   private String AV41Calve ;
   private String AV117MaqTipprd ;
   private String AV110LineaRec ;
   private String A2792TermiCod ;
   private String A2795BarMaqPrf ;
   private String A5120BarMaqNpr ;
   private String A8935BarSalM ;
   private String AV171Tab_procesos[] ;
   private String A207BarPrfCod ;
   private String A719PrdNum ;
   private String A688PrdComCod ;
   private String A6261MaqTipPrd ;
   private String A6193ForClaCol ;
   private String A718PrdNom ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char11[] ;
   private String GXv_char7[] ;
   private java.util.Date A4574RecFecPes ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date A5430RecFecPla ;
   private boolean n5053BarBp12 ;
   private boolean n5054BarBp13 ;
   private boolean n5055BarBp14 ;
   private boolean n5056BarBp15 ;
   private boolean n5057BarFacAbs ;
   private boolean n252CliCod ;
   private boolean n4258RecMaqFas ;
   private boolean n4260RecTotMts ;
   private boolean n4261RecTotPrd ;
   private boolean n4262RecBarCod ;
   private boolean n4263RecBarReo ;
   private boolean n4264RecBarPar ;
   private boolean n4268RecOrdLin ;
   private boolean n4281RecAgrEst ;
   private boolean n4298RecRecLan ;
   private boolean n4654RecNroPar ;
   private boolean n4866RecFecAlt ;
   private boolean n4867RecFecMod ;
   private boolean n4868RecUsrMod ;
   private boolean n5256RecUltObs ;
   private boolean n5407RecUltLCo ;
   private boolean n5412RecIntCol ;
   private boolean n5413RecMatCol ;
   private boolean n5430RecFecPla ;
   private boolean n5431RecPriPla ;
   private boolean n6039RecAcab ;
   private boolean n8367RecPriAca ;
   private boolean n9764RecLtsSR ;
   private boolean n9765RecLtsDf ;
   private boolean n9811RecAbs2 ;
   private boolean n9812RecHdrLts ;
   private boolean n9996RecObsq ;
   private boolean n9997Recgrm ;
   private boolean n9998RecAnc ;
   private boolean n11507RecAva ;
   private boolean n12128RecAs ;
   private boolean n12129RecAi ;
   private boolean n4586ProForObs ;
   private boolean n7257RecRb ;
   private boolean n4696RecTiempo ;
   private boolean returnInSub ;
   private boolean n2796BarMaqVol ;
   private boolean n2795BarMaqPrf ;
   private boolean n2797BarMaqFA ;
   private boolean n5116BarMaqB12 ;
   private boolean n5117BarMaqB13 ;
   private boolean n5118BarMaqB14 ;
   private boolean n5119BarMaqB15 ;
   private boolean n5120BarMaqNpr ;
   private boolean n5121BarMaqInt ;
   private boolean n8935BarSalM ;
   private boolean n12109ProNh2o ;
   private boolean n207BarPrfCod ;
   private boolean n4871BarPrfPrg ;
   private boolean n7254BarPrfRb ;
   private boolean n4869BarPrfVol ;
   private boolean n10543BarPrfH2O ;
   private boolean n6261MaqTipPrd ;
   private String A8353RecMaqObs ;
   private String A4587ProRecObs ;
   private String AV150RecetasTinteProcesosQuimicosToJson ;
   private String A9996RecObsq ;
   private String A4586ProForObs ;
   private IDataStoreProvider pr_default ;
   private String[] P098O2_A120BarAgrEst ;
   private short[] P098O2_A5053BarBp12 ;
   private boolean[] P098O2_n5053BarBp12 ;
   private short[] P098O2_A5054BarBp13 ;
   private boolean[] P098O2_n5054BarBp13 ;
   private java.math.BigDecimal[] P098O2_A5055BarBp14 ;
   private boolean[] P098O2_n5055BarBp14 ;
   private short[] P098O2_A5056BarBp15 ;
   private boolean[] P098O2_n5056BarBp15 ;
   private java.math.BigDecimal[] P098O2_A5057BarFacAbs ;
   private boolean[] P098O2_n5057BarFacAbs ;
   private byte[] P098O2_A3594BarPriTin ;
   private String[] P098O2_A130BarCodPar ;
   private byte[] P098O2_A132BarCodReo ;
   private int[] P098O2_A129BarCod ;
   private String[] P098O2_A396EmprCod ;
   private int[] P098O2_A252CliCod ;
   private boolean[] P098O2_n252CliCod ;
   private String[] P098O2_A212BarSer ;
   private String[] P098O2_A135BarColNom ;
   private int[] P098O2_A136BarColNum ;
   private byte[] P098O2_A218BarTipCol ;
   private String[] P098O4_A4586ProForObs ;
   private boolean[] P098O4_n4586ProForObs ;
   private int[] P098O4_A2392ProNumPro ;
   private int[] P098O4_A2393ProNumRec ;
   private short[] P098O4_A10547ProH2O ;
   private short[] P098O4_A771ProForTie ;
   private String[] P098O4_A764ProForCod ;
   private String[] P098O4_A396EmprCod ;
   private String[] P098O6_A396EmprCod ;
   private String[] P098O6_A764ProForCod ;
   private java.math.BigDecimal[] P098O6_A6062ProForCPo ;
   private byte[] P098O6_A1645ProForNro ;
   private String[] P098O6_A765ProForDes ;
   private String[] P098O6_A770ProForPrd ;
   private byte[] P098O6_A3379ProForTnq ;
   private String[] P098O6_A5358ProForClv ;
   private String[] P098O6_A763ProForCla ;
   private java.math.BigDecimal[] P098O6_A762ProForCan ;
   private byte[] P098O6_A490ForPrdUMe ;
   private short[] P098O6_A767ProForLin ;
   private int[] P098O9_A2392ProNumPro ;
   private short[] P098O9_A12109ProNh2o ;
   private boolean[] P098O9_n12109ProNh2o ;
   private String[] P098O9_A764ProForCod ;
   private String[] P098O9_A396EmprCod ;
   private short[] P098O11_A489ForPrdNor ;
   private int[] P098O11_A486ForNumCol ;
   private String[] P098O11_A396EmprCod ;
   private String[] P098O11_A719PrdNum ;
   private java.math.BigDecimal[] P098O11_A487ForPrdCan ;
   private byte[] P098O11_A490ForPrdUMe ;
   private short[] P098O11_A715PrdLin ;
   private String[] P098O12_A396EmprCod ;
   private int[] P098O12_A486ForNumCol ;
   private short[] P098O12_A489ForPrdNor ;
   private short[] P098O12_A715PrdLin ;
   private String[] P098O13_A688PrdComCod ;
   private String[] P098O13_A396EmprCod ;
   private java.math.BigDecimal[] P098O13_A690PrdComFN ;
   private String[] P098O13_A719PrdNum ;
   private String[] P098O14_A396EmprCod ;
   private String[] P098O14_A602MaqCod ;
   private String[] P098O14_A6261MaqTipPrd ;
   private boolean[] P098O14_n6261MaqTipPrd ;
   private byte[] P098O14_A6260MaqTqn ;
   private String[] P098O15_A719PrdNum ;
   private int[] P098O15_A486ForNumCol ;
   private String[] P098O15_A396EmprCod ;
   private java.math.BigDecimal[] P098O15_A481ForCan ;
   private String[] P098O15_A6193ForClaCol ;
   private String[] P098O15_A718PrdNom ;
   private byte[] P098O15_A490ForPrdUMe ;
   private short[] P098O15_A309ColLin ;
   private GXBaseCollection<app.SdtRecetasTinteProcesosQuimicos_SDT> AV185RecetasTinteProcesosQuimicos_SDTs ;
   private app.SdtRecetasTinteProcesosQuimicos_SDT AV184RecetasTinteProcesosQuimicos_SDT ;
}

final  class pdyrp000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098O2", "SELECT BarAgrEst, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarPriTin, BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P098O3", "INSERT INTO TXPRECMAQ(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod, RecVolPrd, RecFA, UltLinPro, RecMaqFas, RecTotKgs, RecTotMts, RecTotPrd, RecBarCod, RecBarReo, RecBarPar, RecOrdLin, RecAgrEst, RecRecLan, RecUsrCod, RecFecPes, RecMaqPes, RecNroPar, RecEnvio, RecRecep, RecFecAlt, RecFecMod, RecUsrMod, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecUltObs, RecUltLCo, RecIntCol, RecMatCol, RecFecPla, RecPriPla, RecAcab, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecMaqObs, RecPriAca, RecLtsSR, RecLtsDf, RecAbs2, RecHdrLts, RecObsq, Recgrm, RecAnc, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecCAut, RecAva, RecAs, RecAi, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P098O4", "SELECT ProForObs, ProNumPro, ProNumRec, ProH2O, ProForTie, ProForCod, EmprCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P098O5", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, ProRecObs, RecVolPrf, RecTiempo, RecNroPrg, RecRb, RecNumRec, RecNH2O, RecTemp, RecPhMx, RecPhMn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new ForEachCursor("P098O6", "SELECT EmprCod, ProForCod, ProForCPo, ProForNro, ProForDes, ProForPrd, ProForTnq, ProForClv, ProForCla, ProForCan, ForPrdUMe, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P098O7", "INSERT INTO TXPBARMAQ(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarMaqPrf, BarMaqVol, BarMaqFA, BarMaqB12, BarMaqB13, BarMaqB14, BarMaqB15, BarMaqNpr, BarMaqInt, BarSalM, BarMaqVR, BarMaqRep, BarPrfULi2, BarMaqPr2, BarMaqPr3, BarMaqOrd, BarMaqFas, BarMaqNh, BarMaqVX, BarMaqBL, BarMaqFlow, BarMaqRPM, BarMaqMol, BarMaqTor, BarMaqCla, BarMaqTej, BarMaqDel, BarMaqPML, BarMaqObs, MSedo1, MSedo2, MSedo3, MSedo4, MSedo5, MSedo6, Msedo7, Msedo8, Msedo9, Msedo10, Msedo11) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
         ,new UpdateCursor("P098O8", "INSERT INTO TXPBARTER(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarULinMaq, BarPrfULin, BarMacPro1) VALUES(?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTER")
         ,new ForEachCursor("P098O9", "SELECT ProNumPro, ProNh2o, ProForCod, EmprCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P098O10", "INSERT INTO TXPBARPR2(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin, BarPrfCod, BarPrfVol, BarPrfPrg, BarPrfRb, BarPrfH2O, BarPrfTie, BarPrfTmp, BarPrfPhx, BarPrfPhm, BarPrfRec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new ForEachCursor("P098O11", "SELECT ForPrdNor, ForNumCol, EmprCod, PrdNum, ForPrdCan, ForPrdUMe, PrdLin FROM TXPLPRFOR WHERE (EmprCod = ? and ForNumCol = ?) AND (ForPrdNor = ?) ORDER BY EmprCod, ForNumCol, PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098O12", "SELECT EmprCod, ForNumCol, ForPrdNor, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? and ForPrdNor = ? ORDER BY EmprCod, ForNumCol, ForPrdNor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098O13", "SELECT PrdComCod, EmprCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE (EmprCod = ?) AND (PrdComCod = ?) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098O14", "SELECT EmprCod, MaqCod, MaqTipPrd, MaqTqn FROM TXPMAQTNQ WHERE EmprCod = ? and MaqCod = ? and MaqTipPrd = ? ORDER BY EmprCod, MaqCod, MaqTipPrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098O15", "SELECT T1.PrdNum, T1.ForNumCol, T1.EmprCod, T1.ForCan, T1.ForClaCol, T2.PrdNom, T1.ForPrdUMe, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (SUBSTR(T1.PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((String[]) buf[19])[0] = rslt.getString(14, 13);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((byte[]) buf[21])[0] = rslt.getByte(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 8);
               }
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[27], 1);
               }
               stmt.setString(20, (String)parms[28], 8);
               stmt.setDateTime(21, (java.util.Date)parms[29], false);
               stmt.setByte(22, ((Number) parms[30]).byteValue());
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[32]).intValue());
               }
               stmt.setByte(24, ((Number) parms[33]).byteValue());
               stmt.setByte(25, ((Number) parms[34]).byteValue());
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[36], false);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[38], false);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[40], 8);
               }
               stmt.setInt(29, ((Number) parms[41]).intValue());
               stmt.setString(30, (String)parms[42], 6);
               stmt.setShort(31, ((Number) parms[43]).shortValue());
               stmt.setShort(32, ((Number) parms[44]).shortValue());
               stmt.setShort(33, ((Number) parms[45]).shortValue());
               stmt.setShort(34, ((Number) parms[46]).shortValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[47], 2);
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(38, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(39, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DATE );
               }
               else
               {
                  stmt.setDate(40, (java.util.Date)parms[57]);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(41, ((Number) parms[59]).byteValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[61], 1);
               }
               stmt.setString(43, (String)parms[62], 6);
               stmt.setString(44, (String)parms[63], 6);
               stmt.setShort(45, ((Number) parms[64]).shortValue());
               stmt.setByte(46, ((Number) parms[65]).byteValue());
               stmt.setByte(47, ((Number) parms[66]).byteValue());
               stmt.setByte(48, ((Number) parms[67]).byteValue());
               stmt.setShort(49, ((Number) parms[68]).shortValue());
               stmt.setShort(50, ((Number) parms[69]).shortValue());
               stmt.setShort(51, ((Number) parms[70]).shortValue());
               stmt.setString(52, (String)parms[71], 10);
               stmt.setByte(53, ((Number) parms[72]).byteValue());
               stmt.setByte(54, ((Number) parms[73]).byteValue());
               stmt.setShort(55, ((Number) parms[74]).shortValue());
               stmt.setLongVarchar(56, (String)parms[75], false);
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[77]).shortValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(58, ((Number) parms[79]).intValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(59, ((Number) parms[81]).intValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(60, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[85], 12);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(62, (String)parms[87], 800);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[91]).shortValue());
               }
               stmt.setBigDecimal(65, (java.math.BigDecimal)parms[92], 1);
               stmt.setBigDecimal(66, (java.math.BigDecimal)parms[93], 1);
               stmt.setShort(67, ((Number) parms[94]).shortValue());
               stmt.setBigDecimal(68, (java.math.BigDecimal)parms[95], 2);
               stmt.setByte(69, ((Number) parms[96]).byteValue());
               stmt.setByte(70, ((Number) parms[97]).byteValue());
               stmt.setByte(71, ((Number) parms[98]).byteValue());
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[100], 4);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[102], 3);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[104], 3);
               }
               stmt.setBigDecimal(75, (java.math.BigDecimal)parms[105], 1);
               stmt.setBigDecimal(76, (java.math.BigDecimal)parms[106], 1);
               stmt.setShort(77, ((Number) parms[107]).shortValue());
               stmt.setShort(78, ((Number) parms[108]).shortValue());
               stmt.setShort(79, ((Number) parms[109]).shortValue());
               stmt.setShort(80, ((Number) parms[110]).shortValue());
               stmt.setShort(81, ((Number) parms[111]).shortValue());
               stmt.setInt(82, ((Number) parms[112]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setLongVarchar(8, (String)parms[7], false);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[10]).shortValue());
               }
               stmt.setInt(11, ((Number) parms[11]).intValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 2);
               }
               stmt.setInt(13, ((Number) parms[14]).intValue());
               stmt.setShort(14, ((Number) parms[15]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[21], 6);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[25], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[16]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

