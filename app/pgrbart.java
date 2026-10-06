package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgrbart extends GXProcedure
{
   public pgrbart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrbart.class ), "" );
   }

   public pgrbart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 ,
                            short[] aP10 ,
                            String[] aP11 ,
                            String[] aP12 ,
                            String[] aP13 ,
                            short[] aP14 ,
                            String[] aP15 ,
                            short[] aP16 ,
                            String[] aP17 ,
                            short[] aP18 ,
                            byte[] aP19 ,
                            String[] aP20 ,
                            short[] aP21 ,
                            String[] aP22 ,
                            short[] aP23 ,
                            String[] aP24 ,
                            short[] aP25 ,
                            short[] aP26 ,
                            short[] aP27 ,
                            short[] aP28 ,
                            short[] aP29 ,
                            short[] aP30 ,
                            short[] aP31 ,
                            java.math.BigDecimal[] aP32 ,
                            java.math.BigDecimal[] aP33 ,
                            short[] aP34 ,
                            short[] aP35 ,
                            short[] aP36 ,
                            short[] aP37 ,
                            short[] aP38 ,
                            short[] aP39 ,
                            java.math.BigDecimal[] aP40 ,
                            java.math.BigDecimal[] aP41 ,
                            java.math.BigDecimal[] aP42 )
   {
      pgrbart.this.aP43 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43);
      return aP43[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        String[] aP15 ,
                        short[] aP16 ,
                        String[] aP17 ,
                        short[] aP18 ,
                        byte[] aP19 ,
                        String[] aP20 ,
                        short[] aP21 ,
                        String[] aP22 ,
                        short[] aP23 ,
                        String[] aP24 ,
                        short[] aP25 ,
                        short[] aP26 ,
                        short[] aP27 ,
                        short[] aP28 ,
                        short[] aP29 ,
                        short[] aP30 ,
                        short[] aP31 ,
                        java.math.BigDecimal[] aP32 ,
                        java.math.BigDecimal[] aP33 ,
                        short[] aP34 ,
                        short[] aP35 ,
                        short[] aP36 ,
                        short[] aP37 ,
                        short[] aP38 ,
                        short[] aP39 ,
                        java.math.BigDecimal[] aP40 ,
                        java.math.BigDecimal[] aP41 ,
                        java.math.BigDecimal[] aP42 ,
                        short[] aP43 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             String[] aP15 ,
                             short[] aP16 ,
                             String[] aP17 ,
                             short[] aP18 ,
                             byte[] aP19 ,
                             String[] aP20 ,
                             short[] aP21 ,
                             String[] aP22 ,
                             short[] aP23 ,
                             String[] aP24 ,
                             short[] aP25 ,
                             short[] aP26 ,
                             short[] aP27 ,
                             short[] aP28 ,
                             short[] aP29 ,
                             short[] aP30 ,
                             short[] aP31 ,
                             java.math.BigDecimal[] aP32 ,
                             java.math.BigDecimal[] aP33 ,
                             short[] aP34 ,
                             short[] aP35 ,
                             short[] aP36 ,
                             short[] aP37 ,
                             short[] aP38 ,
                             short[] aP39 ,
                             java.math.BigDecimal[] aP40 ,
                             java.math.BigDecimal[] aP41 ,
                             java.math.BigDecimal[] aP42 ,
                             short[] aP43 )
   {
      pgrbart.this.AV45EmprCod = aP0[0];
      this.aP0 = aP0;
      pgrbart.this.AV46CliCod = aP1[0];
      this.aP1 = aP1;
      pgrbart.this.AV47ArtCod = aP2[0];
      this.aP2 = aP2;
      pgrbart.this.AV15ArtDsc = aP3[0];
      this.aP3 = aP3;
      pgrbart.this.AV16ArtMat = aP4[0];
      this.aP4 = aP4;
      pgrbart.this.AV48ArtPle2 = aP5[0];
      this.aP5 = aP5;
      pgrbart.this.AV17ArtLar = aP6[0];
      this.aP6 = aP6;
      pgrbart.this.AV18ArtSua = aP7[0];
      this.aP7 = aP7;
      pgrbart.this.AV44ArtAcaQui = aP8[0];
      this.aP8 = aP8;
      pgrbart.this.AV37ArtPle = aP9[0];
      this.aP9 = aP9;
      pgrbart.this.AV38ArtTip = aP10[0];
      this.aP10 = aP10;
      pgrbart.this.AV39ArtEnc = aP11[0];
      this.aP11 = aP11;
      pgrbart.this.AV40ArtCor = aP12[0];
      this.aP12 = aP12;
      pgrbart.this.AV19ArtTr1 = aP13[0];
      this.aP13 = aP13;
      pgrbart.this.AV20ArtPt1 = aP14[0];
      this.aP14 = aP14;
      pgrbart.this.AV21ArtTr2 = aP15[0];
      this.aP15 = aP15;
      pgrbart.this.AV22ArtPt2 = aP16[0];
      this.aP16 = aP16;
      pgrbart.this.AV23ArtTr3 = aP17[0];
      this.aP17 = aP17;
      pgrbart.this.AV24ArtPt3 = aP18[0];
      this.aP18 = aP18;
      pgrbart.this.AV25ArtUrg = aP19[0];
      this.aP19 = aP19;
      pgrbart.this.AV26ArtUr1 = aP20[0];
      this.aP20 = aP20;
      pgrbart.this.AV27ArtPu1 = aP21[0];
      this.aP21 = aP21;
      pgrbart.this.AV28ArtUr2 = aP22[0];
      this.aP22 = aP22;
      pgrbart.this.AV29ArtPu2 = aP23[0];
      this.aP23 = aP23;
      pgrbart.this.AV30ArtUr3 = aP24[0];
      this.aP24 = aP24;
      pgrbart.this.AV31ArtPu3 = aP25[0];
      this.aP25 = aP25;
      pgrbart.this.AV32ArtPes = aP26[0];
      this.aP26 = aP26;
      pgrbart.this.AV41DisGraCru = aP27[0];
      this.aP27 = aP27;
      pgrbart.this.AV33ArtAnh = aP28[0];
      this.aP28 = aP28;
      pgrbart.this.AV34ArtAnhMax = aP29[0];
      this.aP29 = aP29;
      pgrbart.this.AV35ArtAca = aP30[0];
      this.aP30 = aP30;
      pgrbart.this.AV36ArtAcaMax = aP31[0];
      this.aP31 = aP31;
      pgrbart.this.AV42DisEncCom = aP32[0];
      this.aP32 = aP32;
      pgrbart.this.AV43DisEncAnh = aP33[0];
      this.aP33 = aP33;
      pgrbart.this.AV49DisNumCor = aP34[0];
      this.aP34 = aP34;
      pgrbart.this.AV50ArtAncSal1 = aP35[0];
      this.aP35 = aP35;
      pgrbart.this.AV51ArtAncSal2 = aP36[0];
      this.aP36 = aP36;
      pgrbart.this.AV52ArtAncSal3 = aP37[0];
      this.aP37 = aP37;
      pgrbart.this.AV53ArtGraAca2 = aP38[0];
      this.aP38 = aP38;
      pgrbart.this.AV54ArtGraCru2 = aP39[0];
      this.aP39 = aP39;
      pgrbart.this.AV55ArtRen = aP40[0];
      this.aP40 = aP40;
      pgrbart.this.AV56ArtRdoA = aP41[0];
      this.aP41 = aP41;
      pgrbart.this.AV57ArtRdoN = aP42[0];
      this.aP42 = aP42;
      pgrbart.this.AV58ArtGraAca = aP43[0];
      this.aP43 = aP43;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPARTICU

      */
      A396EmprCod = AV45EmprCod ;
      A252CliCod = AV46CliCod ;
      A65ArtCod = AV47ArtCod ;
      A69ArtDsc = AV15ArtDsc ;
      n69ArtDsc = false ;
      A87ArtMat = AV16ArtMat ;
      n87ArtMat = false ;
      A100ArtTipLar = AV17ArtLar ;
      n100ArtTipLar = false ;
      A96ArtSua = AV18ArtSua ;
      n96ArtSua = false ;
      A64ArtAcaQui = AV44ArtAcaQui ;
      n64ArtAcaQui = false ;
      A101ArtTipPle = AV37ArtPle ;
      n101ArtTipPle = false ;
      A829TipArtCod = AV38ArtTip ;
      A70ArtEncOri = AV39ArtEnc ;
      n70ArtEncOri = false ;
      A66ArtCorOri = AV40ArtCor ;
      n66ArtCorOri = false ;
      A105ArtTra1 = AV19ArtTr1 ;
      n105ArtTra1 = false ;
      A108ArtTraP1 = AV20ArtPt1 ;
      n108ArtTraP1 = false ;
      A106ArtTra2 = AV21ArtTr2 ;
      n106ArtTra2 = false ;
      A109ArtTraP2 = AV22ArtPt2 ;
      n109ArtTraP2 = false ;
      A107ArtTra3 = AV23ArtTr3 ;
      n107ArtTra3 = false ;
      A110ArtTraP3 = AV24ArtPt3 ;
      n110ArtTraP3 = false ;
      A117ArtUrg = AV25ArtUrg ;
      n117ArtUrg = false ;
      A111ArtUrd1 = AV26ArtUr1 ;
      n111ArtUrd1 = false ;
      A114ArtUrdP1 = AV27ArtPu1 ;
      n114ArtUrdP1 = false ;
      A112ArtUrd2 = AV28ArtUr2 ;
      n112ArtUrd2 = false ;
      A115ArtUrdP2 = AV29ArtPu2 ;
      n115ArtUrdP2 = false ;
      A113ArtUrd3 = AV30ArtUr3 ;
      n113ArtUrd3 = false ;
      A116ArtUrdP3 = AV31ArtPu3 ;
      n116ArtUrdP3 = false ;
      A1148ArtPml = AV32ArtPes ;
      n1148ArtPml = false ;
      A78ArtGraCru = AV41DisGraCru ;
      n78ArtGraCru = false ;
      A63ArtAcaMin = AV35ArtAca ;
      n63ArtAcaMin = false ;
      A62ArtAcaMax = AV36ArtAcaMax ;
      n62ArtAcaMax = false ;
      A68ArtCruMin = AV33ArtAnh ;
      n68ArtCruMin = false ;
      A67ArtCruMax = AV34ArtAnhMax ;
      n67ArtCruMax = false ;
      A1229ArtEncCom = (short)(DecimalUtil.decToDouble(AV42DisEncCom)) ;
      n1229ArtEncCom = false ;
      A1230ArtEncAnh = (short)(DecimalUtil.decToDouble(AV43DisEncAnh)) ;
      n1230ArtEncAnh = false ;
      A2834ArtPle2 = AV48ArtPle2 ;
      n2834ArtPle2 = false ;
      A3121ArtNumCor = AV49DisNumCor ;
      n3121ArtNumCor = false ;
      A3122ArtAncSal1 = AV50ArtAncSal1 ;
      n3122ArtAncSal1 = false ;
      A3123ArtAncSal2 = AV51ArtAncSal2 ;
      n3123ArtAncSal2 = false ;
      A3124ArtAncSal3 = AV52ArtAncSal3 ;
      n3124ArtAncSal3 = false ;
      A3125ArtGraAca2 = AV53ArtGraAca2 ;
      n3125ArtGraAca2 = false ;
      A3126ArtGraCru2 = AV54ArtGraCru2 ;
      n3126ArtGraCru2 = false ;
      A95ArtRen = AV55ArtRen ;
      n95ArtRen = false ;
      A1905ArtRdoA = AV56ArtRdoA ;
      n1905ArtRdoA = false ;
      A1904ArtRdoN = AV57ArtRdoN ;
      n1904ArtRdoN = false ;
      A1903ArtGraAca = AV58ArtGraAca ;
      n1903ArtGraAca = false ;
      A73ArtEti = httpContext.getMessage( "N", "") ;
      n73ArtEti = false ;
      /* Using cursor P000I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Boolean.valueOf(n87ArtMat), A87ArtMat, Short.valueOf(A829TipArtCod), Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n1903ArtGraAca = false ;
         n1904ArtRdoN = false ;
         n1905ArtRdoA = false ;
         n95ArtRen = false ;
         n3126ArtGraCru2 = false ;
         n3125ArtGraAca2 = false ;
         n3124ArtAncSal3 = false ;
         n3123ArtAncSal2 = false ;
         n3122ArtAncSal1 = false ;
         n3121ArtNumCor = false ;
         n2834ArtPle2 = false ;
         n1230ArtEncAnh = false ;
         n1229ArtEncCom = false ;
         n67ArtCruMax = false ;
         n68ArtCruMin = false ;
         n62ArtAcaMax = false ;
         n63ArtAcaMin = false ;
         n78ArtGraCru = false ;
         n1148ArtPml = false ;
         n116ArtUrdP3 = false ;
         n113ArtUrd3 = false ;
         n115ArtUrdP2 = false ;
         n112ArtUrd2 = false ;
         n114ArtUrdP1 = false ;
         n111ArtUrd1 = false ;
         n117ArtUrg = false ;
         n110ArtTraP3 = false ;
         n107ArtTra3 = false ;
         n109ArtTraP2 = false ;
         n106ArtTra2 = false ;
         n108ArtTraP1 = false ;
         n105ArtTra1 = false ;
         n66ArtCorOri = false ;
         n70ArtEncOri = false ;
         n101ArtTipPle = false ;
         n64ArtAcaQui = false ;
         n96ArtSua = false ;
         n100ArtTipLar = false ;
         n87ArtMat = false ;
         n69ArtDsc = false ;
         /* Optimized UPDATE. */
         /* Using cursor P000I3 */
         short AV43DisEncAnh1230Aux;
         AV43DisEncAnh1230Aux = (short)(DecimalUtil.decToDouble(AV43DisEncAnh)) ;
         short AV42DisEncCom1229Aux;
         AV42DisEncCom1229Aux = (short)(DecimalUtil.decToDouble(AV42DisEncCom)) ;
         pr_default.execute(1, new Object[] {Boolean.valueOf(n1903ArtGraAca), Short.valueOf(AV58ArtGraAca), Boolean.valueOf(n1904ArtRdoN), AV57ArtRdoN, Boolean.valueOf(n1905ArtRdoA), AV56ArtRdoA, Boolean.valueOf(n95ArtRen), AV55ArtRen, Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(AV54ArtGraCru2), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(AV53ArtGraAca2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(AV52ArtAncSal3), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(AV51ArtAncSal2), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(AV50ArtAncSal1), Boolean.valueOf(n3121ArtNumCor), Short.valueOf(AV49DisNumCor), Boolean.valueOf(n2834ArtPle2), AV48ArtPle2, Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(AV43DisEncAnh1230Aux), Boolean.valueOf(n1229ArtEncCom), Short.valueOf(AV42DisEncCom1229Aux), Boolean.valueOf(n67ArtCruMax), Short.valueOf(AV34ArtAnhMax), Boolean.valueOf(n68ArtCruMin), Short.valueOf(AV33ArtAnh), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(AV36ArtAcaMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(AV35ArtAca), Boolean.valueOf(n78ArtGraCru), Short.valueOf(AV41DisGraCru), Boolean.valueOf(n1148ArtPml), Short.valueOf(AV32ArtPes), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(AV31ArtPu3), Boolean.valueOf(n113ArtUrd3), AV30ArtUr3, Boolean.valueOf(n115ArtUrdP2), Short.valueOf(AV29ArtPu2), Boolean.valueOf(n112ArtUrd2), AV28ArtUr2, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(AV27ArtPu1), Boolean.valueOf(n111ArtUrd1), AV26ArtUr1, Boolean.valueOf(n117ArtUrg), Byte.valueOf(AV25ArtUrg), Boolean.valueOf(n110ArtTraP3), Short.valueOf(AV24ArtPt3), Boolean.valueOf(n107ArtTra3), AV23ArtTr3, Boolean.valueOf(n109ArtTraP2), Short.valueOf(AV22ArtPt2), Boolean.valueOf(n106ArtTra2), AV21ArtTr2, Boolean.valueOf(n108ArtTraP1), Short.valueOf(AV20ArtPt1), Boolean.valueOf(n105ArtTra1), AV19ArtTr1, Boolean.valueOf(n66ArtCorOri), AV40ArtCor, Boolean.valueOf(n70ArtEncOri), AV39ArtEnc, Short.valueOf(AV38ArtTip), Boolean.valueOf(n101ArtTipPle), AV37ArtPle, Boolean.valueOf(n64ArtAcaQui), AV44ArtAcaQui, Boolean.valueOf(n96ArtSua), AV18ArtSua, Boolean.valueOf(n100ArtTipLar), AV17ArtLar, Boolean.valueOf(n87ArtMat), AV16ArtMat, Boolean.valueOf(n69ArtDsc), AV15ArtDsc, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgrbart.this.AV45EmprCod;
      this.aP1[0] = pgrbart.this.AV46CliCod;
      this.aP2[0] = pgrbart.this.AV47ArtCod;
      this.aP3[0] = pgrbart.this.AV15ArtDsc;
      this.aP4[0] = pgrbart.this.AV16ArtMat;
      this.aP5[0] = pgrbart.this.AV48ArtPle2;
      this.aP6[0] = pgrbart.this.AV17ArtLar;
      this.aP7[0] = pgrbart.this.AV18ArtSua;
      this.aP8[0] = pgrbart.this.AV44ArtAcaQui;
      this.aP9[0] = pgrbart.this.AV37ArtPle;
      this.aP10[0] = pgrbart.this.AV38ArtTip;
      this.aP11[0] = pgrbart.this.AV39ArtEnc;
      this.aP12[0] = pgrbart.this.AV40ArtCor;
      this.aP13[0] = pgrbart.this.AV19ArtTr1;
      this.aP14[0] = pgrbart.this.AV20ArtPt1;
      this.aP15[0] = pgrbart.this.AV21ArtTr2;
      this.aP16[0] = pgrbart.this.AV22ArtPt2;
      this.aP17[0] = pgrbart.this.AV23ArtTr3;
      this.aP18[0] = pgrbart.this.AV24ArtPt3;
      this.aP19[0] = pgrbart.this.AV25ArtUrg;
      this.aP20[0] = pgrbart.this.AV26ArtUr1;
      this.aP21[0] = pgrbart.this.AV27ArtPu1;
      this.aP22[0] = pgrbart.this.AV28ArtUr2;
      this.aP23[0] = pgrbart.this.AV29ArtPu2;
      this.aP24[0] = pgrbart.this.AV30ArtUr3;
      this.aP25[0] = pgrbart.this.AV31ArtPu3;
      this.aP26[0] = pgrbart.this.AV32ArtPes;
      this.aP27[0] = pgrbart.this.AV41DisGraCru;
      this.aP28[0] = pgrbart.this.AV33ArtAnh;
      this.aP29[0] = pgrbart.this.AV34ArtAnhMax;
      this.aP30[0] = pgrbart.this.AV35ArtAca;
      this.aP31[0] = pgrbart.this.AV36ArtAcaMax;
      this.aP32[0] = pgrbart.this.AV42DisEncCom;
      this.aP33[0] = pgrbart.this.AV43DisEncAnh;
      this.aP34[0] = pgrbart.this.AV49DisNumCor;
      this.aP35[0] = pgrbart.this.AV50ArtAncSal1;
      this.aP36[0] = pgrbart.this.AV51ArtAncSal2;
      this.aP37[0] = pgrbart.this.AV52ArtAncSal3;
      this.aP38[0] = pgrbart.this.AV53ArtGraAca2;
      this.aP39[0] = pgrbart.this.AV54ArtGraCru2;
      this.aP40[0] = pgrbart.this.AV55ArtRen;
      this.aP41[0] = pgrbart.this.AV56ArtRdoA;
      this.aP42[0] = pgrbart.this.AV57ArtRdoN;
      this.aP43[0] = pgrbart.this.AV58ArtGraAca;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgrbart");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A87ArtMat = "" ;
      A100ArtTipLar = "" ;
      A96ArtSua = "" ;
      A64ArtAcaQui = "" ;
      A101ArtTipPle = "" ;
      A70ArtEncOri = "" ;
      A66ArtCorOri = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A2834ArtPle2 = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A1905ArtRdoA = DecimalUtil.ZERO ;
      A1904ArtRdoN = DecimalUtil.ZERO ;
      A73ArtEti = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgrbart__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25ArtUrg ;
   private byte A117ArtUrg ;
   private short AV38ArtTip ;
   private short AV20ArtPt1 ;
   private short AV22ArtPt2 ;
   private short AV24ArtPt3 ;
   private short AV27ArtPu1 ;
   private short AV29ArtPu2 ;
   private short AV31ArtPu3 ;
   private short AV32ArtPes ;
   private short AV41DisGraCru ;
   private short AV33ArtAnh ;
   private short AV34ArtAnhMax ;
   private short AV35ArtAca ;
   private short AV36ArtAcaMax ;
   private short AV49DisNumCor ;
   private short AV50ArtAncSal1 ;
   private short AV51ArtAncSal2 ;
   private short AV52ArtAncSal3 ;
   private short AV53ArtGraAca2 ;
   private short AV54ArtGraCru2 ;
   private short AV58ArtGraAca ;
   private short A829TipArtCod ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short A1148ArtPml ;
   private short A78ArtGraCru ;
   private short A63ArtAcaMin ;
   private short A62ArtAcaMax ;
   private short A68ArtCruMin ;
   private short A67ArtCruMax ;
   private short A1229ArtEncCom ;
   private short A1230ArtEncAnh ;
   private short A3121ArtNumCor ;
   private short A3122ArtAncSal1 ;
   private short A3123ArtAncSal2 ;
   private short A3124ArtAncSal3 ;
   private short A3125ArtGraAca2 ;
   private short A3126ArtGraCru2 ;
   private short A1903ArtGraAca ;
   private short Gx_err ;
   private int AV46CliCod ;
   private int GX_INS10 ;
   private int A252CliCod ;
   private java.math.BigDecimal AV42DisEncCom ;
   private java.math.BigDecimal AV43DisEncAnh ;
   private java.math.BigDecimal AV55ArtRen ;
   private java.math.BigDecimal AV56ArtRdoA ;
   private java.math.BigDecimal AV57ArtRdoN ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal A1904ArtRdoN ;
   private String AV45EmprCod ;
   private String AV47ArtCod ;
   private String AV15ArtDsc ;
   private String AV16ArtMat ;
   private String AV48ArtPle2 ;
   private String AV17ArtLar ;
   private String AV18ArtSua ;
   private String AV44ArtAcaQui ;
   private String AV37ArtPle ;
   private String AV39ArtEnc ;
   private String AV40ArtCor ;
   private String AV19ArtTr1 ;
   private String AV21ArtTr2 ;
   private String AV23ArtTr3 ;
   private String AV26ArtUr1 ;
   private String AV28ArtUr2 ;
   private String AV30ArtUr3 ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A87ArtMat ;
   private String A100ArtTipLar ;
   private String A96ArtSua ;
   private String A64ArtAcaQui ;
   private String A101ArtTipPle ;
   private String A70ArtEncOri ;
   private String A66ArtCorOri ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private String A2834ArtPle2 ;
   private String A73ArtEti ;
   private String Gx_emsg ;
   private boolean n69ArtDsc ;
   private boolean n87ArtMat ;
   private boolean n100ArtTipLar ;
   private boolean n96ArtSua ;
   private boolean n64ArtAcaQui ;
   private boolean n101ArtTipPle ;
   private boolean n70ArtEncOri ;
   private boolean n66ArtCorOri ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n117ArtUrg ;
   private boolean n111ArtUrd1 ;
   private boolean n114ArtUrdP1 ;
   private boolean n112ArtUrd2 ;
   private boolean n115ArtUrdP2 ;
   private boolean n113ArtUrd3 ;
   private boolean n116ArtUrdP3 ;
   private boolean n1148ArtPml ;
   private boolean n78ArtGraCru ;
   private boolean n63ArtAcaMin ;
   private boolean n62ArtAcaMax ;
   private boolean n68ArtCruMin ;
   private boolean n67ArtCruMax ;
   private boolean n1229ArtEncCom ;
   private boolean n1230ArtEncAnh ;
   private boolean n2834ArtPle2 ;
   private boolean n3121ArtNumCor ;
   private boolean n3122ArtAncSal1 ;
   private boolean n3123ArtAncSal2 ;
   private boolean n3124ArtAncSal3 ;
   private boolean n3125ArtGraAca2 ;
   private boolean n3126ArtGraCru2 ;
   private boolean n95ArtRen ;
   private boolean n1905ArtRdoA ;
   private boolean n1904ArtRdoN ;
   private boolean n1903ArtGraAca ;
   private boolean n73ArtEti ;
   private short[] aP43 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private String[] aP15 ;
   private short[] aP16 ;
   private String[] aP17 ;
   private short[] aP18 ;
   private byte[] aP19 ;
   private String[] aP20 ;
   private short[] aP21 ;
   private String[] aP22 ;
   private short[] aP23 ;
   private String[] aP24 ;
   private short[] aP25 ;
   private short[] aP26 ;
   private short[] aP27 ;
   private short[] aP28 ;
   private short[] aP29 ;
   private short[] aP30 ;
   private short[] aP31 ;
   private java.math.BigDecimal[] aP32 ;
   private java.math.BigDecimal[] aP33 ;
   private short[] aP34 ;
   private short[] aP35 ;
   private short[] aP36 ;
   private short[] aP37 ;
   private short[] aP38 ;
   private short[] aP39 ;
   private java.math.BigDecimal[] aP40 ;
   private java.math.BigDecimal[] aP41 ;
   private java.math.BigDecimal[] aP42 ;
   private IDataStoreProvider pr_default ;
}

final  class pgrbart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P000I2", "INSERT INTO TXPARTICU(EmprCod, CliCod, ArtCod, ArtMat, TipArtCod, ArtDsc, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtMer, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtObsLon, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new UpdateCursor("P000I3", "UPDATE TXPARTICU SET ArtGraAca=?, ArtRdoN=?, ArtRdoA=?, ArtRen=?, ArtGraCru2=?, ArtGraAca2=?, ArtAncSal3=?, ArtAncSal2=?, ArtAncSal1=?, ArtNumCor=?, ArtPle2=?, ArtEncAnh=?, ArtEncCom=?, ArtCruMax=?, ArtCruMin=?, ArtAcaMax=?, ArtAcaMin=?, ArtGraCru=?, ArtPml=?, ArtUrdP3=?, ArtUrd3=?, ArtUrdP2=?, ArtUrd2=?, ArtUrdP1=?, ArtUrd1=?, ArtUrg=?, ArtTraP3=?, ArtTra3=?, ArtTraP2=?, ArtTra2=?, ArtTraP1=?, ArtTra1=?, ArtCorOri=?, ArtEncOri=?, TipArtCod=?, ArtTipPle=?, ArtAcaQui=?, ArtSua=?, ArtTipLar=?, ArtMat=?, ArtDsc=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
               }
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 26);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 6);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 6);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[37], 4);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 4);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 4);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[45]).shortValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[49], 4);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[51], 4);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[53], 4);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[73], 30);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[75]).shortValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[77]).shortValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[81]).shortValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[85]).shortValue());
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 30);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 4);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 4);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 4);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[51]).byteValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 4);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 4);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 4);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 1);
               }
               stmt.setShort(35, ((Number) parms[68]).shortValue());
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[70], 10);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[72], 6);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[74], 6);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[76], 10);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[78], 16);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[80], 26);
               }
               stmt.setString(42, (String)parms[81], 3);
               stmt.setInt(43, ((Number) parms[82]).intValue());
               stmt.setString(44, (String)parms[83], 16);
               return;
      }
   }

}

