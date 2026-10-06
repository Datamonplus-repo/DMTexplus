package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partdisl extends GXProcedure
{
   public partdisl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partdisl.class ), "" );
   }

   public partdisl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
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
                           String[] aP14 ,
                           String[] aP15 ,
                           short[] aP16 ,
                           short[] aP17 ,
                           short[] aP18 ,
                           java.math.BigDecimal[] aP19 ,
                           byte[] aP20 ,
                           String[] aP21 ,
                           String[] aP22 ,
                           String[] aP23 ,
                           short[] aP24 ,
                           short[] aP25 ,
                           short[] aP26 ,
                           short[] aP27 ,
                           short[] aP28 ,
                           short[] aP29 ,
                           short[] aP30 ,
                           short[] aP31 ,
                           short[] aP32 ,
                           short[] aP33 ,
                           short[] aP34 ,
                           short[] aP35 ,
                           short[] aP36 ,
                           short[] aP37 ,
                           short[] aP38 ,
                           short[] aP39 ,
                           short[] aP40 ,
                           short[] aP41 ,
                           java.math.BigDecimal[] aP42 ,
                           java.math.BigDecimal[] aP43 ,
                           byte[] aP44 )
   {
      partdisl.this.aP45 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45);
      return aP45[0];
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
                        String[] aP14 ,
                        String[] aP15 ,
                        short[] aP16 ,
                        short[] aP17 ,
                        short[] aP18 ,
                        java.math.BigDecimal[] aP19 ,
                        byte[] aP20 ,
                        String[] aP21 ,
                        String[] aP22 ,
                        String[] aP23 ,
                        short[] aP24 ,
                        short[] aP25 ,
                        short[] aP26 ,
                        short[] aP27 ,
                        short[] aP28 ,
                        short[] aP29 ,
                        short[] aP30 ,
                        short[] aP31 ,
                        short[] aP32 ,
                        short[] aP33 ,
                        short[] aP34 ,
                        short[] aP35 ,
                        short[] aP36 ,
                        short[] aP37 ,
                        short[] aP38 ,
                        short[] aP39 ,
                        short[] aP40 ,
                        short[] aP41 ,
                        java.math.BigDecimal[] aP42 ,
                        java.math.BigDecimal[] aP43 ,
                        byte[] aP44 ,
                        byte[] aP45 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45);
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
                             String[] aP14 ,
                             String[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             short[] aP18 ,
                             java.math.BigDecimal[] aP19 ,
                             byte[] aP20 ,
                             String[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 ,
                             short[] aP24 ,
                             short[] aP25 ,
                             short[] aP26 ,
                             short[] aP27 ,
                             short[] aP28 ,
                             short[] aP29 ,
                             short[] aP30 ,
                             short[] aP31 ,
                             short[] aP32 ,
                             short[] aP33 ,
                             short[] aP34 ,
                             short[] aP35 ,
                             short[] aP36 ,
                             short[] aP37 ,
                             short[] aP38 ,
                             short[] aP39 ,
                             short[] aP40 ,
                             short[] aP41 ,
                             java.math.BigDecimal[] aP42 ,
                             java.math.BigDecimal[] aP43 ,
                             byte[] aP44 ,
                             byte[] aP45 )
   {
      partdisl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partdisl.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      partdisl.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      partdisl.this.AV17DisArtDsc = aP3[0];
      this.aP3 = aP3;
      partdisl.this.AV15DisArtMat = aP4[0];
      this.aP4 = aP4;
      partdisl.this.AV47DisPle2 = aP5[0];
      this.aP5 = aP5;
      partdisl.this.AV21DisArtLar = aP6[0];
      this.aP6 = aP6;
      partdisl.this.AV24DisArtSua = aP7[0];
      this.aP7 = aP7;
      partdisl.this.AV25DisArtAca = aP8[0];
      this.aP8 = aP8;
      partdisl.this.AV20DisArtPle = aP9[0];
      this.aP9 = aP9;
      partdisl.this.AV16DisArtTip = aP10[0];
      this.aP10 = aP10;
      partdisl.this.AV23DisArtEnc = aP11[0];
      this.aP11 = aP11;
      partdisl.this.AV22DisArtCor = aP12[0];
      this.aP12 = aP12;
      partdisl.this.AV27DisArtTr1 = aP13[0];
      this.aP13 = aP13;
      partdisl.this.AV28DisArtTr2 = aP14[0];
      this.aP14 = aP14;
      partdisl.this.AV29DisArtTr3 = aP15[0];
      this.aP15 = aP15;
      partdisl.this.AV30DisArtPt1 = aP16[0];
      this.aP16 = aP16;
      partdisl.this.AV31DisArtPt2 = aP17[0];
      this.aP17 = aP17;
      partdisl.this.AV32DisArtPt3 = aP18[0];
      this.aP18 = aP18;
      partdisl.this.AV19DisArtRdt = aP19[0];
      this.aP19 = aP19;
      partdisl.this.AV26DisArtUrg = aP20[0];
      this.aP20 = aP20;
      partdisl.this.AV33DisArtUr1 = aP21[0];
      this.aP21 = aP21;
      partdisl.this.AV34DisArtUr2 = aP22[0];
      this.aP22 = aP22;
      partdisl.this.AV35DisArtUr3 = aP23[0];
      this.aP23 = aP23;
      partdisl.this.AV36DisArtPu1 = aP24[0];
      this.aP24 = aP24;
      partdisl.this.AV37DisArtPu2 = aP25[0];
      this.aP25 = aP25;
      partdisl.this.AV38DisArtPu3 = aP26[0];
      this.aP26 = aP26;
      partdisl.this.AV18DisArtPes = aP27[0];
      this.aP27 = aP27;
      partdisl.this.AV39DisGraCru = aP28[0];
      this.aP28 = aP28;
      partdisl.this.AV40DisArtAnh = aP29[0];
      this.aP29 = aP29;
      partdisl.this.AV41DisArtAn1 = aP30[0];
      this.aP30 = aP30;
      partdisl.this.AV42DisArtAcb = aP31[0];
      this.aP31 = aP31;
      partdisl.this.AV43DisArtAc2 = aP32[0];
      this.aP32 = aP32;
      partdisl.this.AV44DisEncCom = aP33[0];
      this.aP33 = aP33;
      partdisl.this.AV45DisEncAnh = aP34[0];
      this.aP34 = aP34;
      partdisl.this.AV48DisNumCor = aP35[0];
      this.aP35 = aP35;
      partdisl.this.AV49DisAncSal1 = aP36[0];
      this.aP36 = aP36;
      partdisl.this.AV50DisAncSal2 = aP37[0];
      this.aP37 = aP37;
      partdisl.this.AV51DisAncSal3 = aP38[0];
      this.aP38 = aP38;
      partdisl.this.AV52DisGraAca2 = aP39[0];
      this.aP39 = aP39;
      partdisl.this.AV53DisGraCru2 = aP40[0];
      this.aP40 = aP40;
      partdisl.this.AV54DisGraAca = aP41[0];
      this.aP41 = aP41;
      partdisl.this.AV55DisRdoA = aP42[0];
      this.aP42 = aP42;
      partdisl.this.AV56DisRdoN = aP43[0];
      this.aP43 = aP43;
      partdisl.this.AV57TP_COD = aP44[0];
      this.aP44 = aP44;
      partdisl.this.AV46Flag = aP45[0];
      this.aP45 = aP45;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV46Flag = (byte)(0) ;
      AV15DisArtMat = "" ;
      AV16DisArtTip = (short)(0) ;
      AV17DisArtDsc = "" ;
      AV18DisArtPes = (short)(0) ;
      AV40DisArtAnh = (short)(0) ;
      AV41DisArtAn1 = (short)(0) ;
      AV42DisArtAcb = (short)(0) ;
      AV43DisArtAc2 = (short)(0) ;
      AV19DisArtRdt = DecimalUtil.doubleToDec(0) ;
      AV20DisArtPle = "" ;
      AV21DisArtLar = "" ;
      AV22DisArtCor = "" ;
      AV23DisArtEnc = "" ;
      AV24DisArtSua = "" ;
      AV25DisArtAca = "" ;
      AV26DisArtUrg = (byte)(9) ;
      AV27DisArtTr1 = "" ;
      AV28DisArtTr2 = "" ;
      AV29DisArtTr3 = "" ;
      AV30DisArtPt1 = (short)(0) ;
      AV31DisArtPt2 = (short)(0) ;
      AV32DisArtPt3 = (short)(0) ;
      AV33DisArtUr1 = "" ;
      AV34DisArtUr2 = "" ;
      AV35DisArtUr3 = "" ;
      AV36DisArtPu1 = (short)(0) ;
      AV37DisArtPu2 = (short)(0) ;
      AV38DisArtPu3 = (short)(0) ;
      AV39DisGraCru = (short)(0) ;
      AV44DisEncCom = (short)(0) ;
      AV45DisEncAnh = (short)(0) ;
      AV47DisPle2 = "" ;
      AV49DisAncSal1 = (short)(0) ;
      AV50DisAncSal2 = (short)(0) ;
      AV51DisAncSal3 = (short)(0) ;
      AV52DisGraAca2 = (short)(0) ;
      AV53DisGraCru2 = (short)(0) ;
      AV48DisNumCor = (short)(0) ;
      AV54DisGraAca = (short)(0) ;
      AV55DisRdoA = DecimalUtil.doubleToDec(0) ;
      AV56DisRdoN = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P035U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4295ClasCod = P035U2_A4295ClasCod[0] ;
         n4295ClasCod = P035U2_n4295ClasCod[0] ;
         A87ArtMat = P035U2_A87ArtMat[0] ;
         n87ArtMat = P035U2_n87ArtMat[0] ;
         A829TipArtCod = P035U2_A829TipArtCod[0] ;
         A69ArtDsc = P035U2_A69ArtDsc[0] ;
         n69ArtDsc = P035U2_n69ArtDsc[0] ;
         A1148ArtPml = P035U2_A1148ArtPml[0] ;
         n1148ArtPml = P035U2_n1148ArtPml[0] ;
         A63ArtAcaMin = P035U2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P035U2_n63ArtAcaMin[0] ;
         A62ArtAcaMax = P035U2_A62ArtAcaMax[0] ;
         n62ArtAcaMax = P035U2_n62ArtAcaMax[0] ;
         A68ArtCruMin = P035U2_A68ArtCruMin[0] ;
         n68ArtCruMin = P035U2_n68ArtCruMin[0] ;
         A67ArtCruMax = P035U2_A67ArtCruMax[0] ;
         n67ArtCruMax = P035U2_n67ArtCruMax[0] ;
         A95ArtRen = P035U2_A95ArtRen[0] ;
         n95ArtRen = P035U2_n95ArtRen[0] ;
         A101ArtTipPle = P035U2_A101ArtTipPle[0] ;
         n101ArtTipPle = P035U2_n101ArtTipPle[0] ;
         A100ArtTipLar = P035U2_A100ArtTipLar[0] ;
         n100ArtTipLar = P035U2_n100ArtTipLar[0] ;
         A66ArtCorOri = P035U2_A66ArtCorOri[0] ;
         n66ArtCorOri = P035U2_n66ArtCorOri[0] ;
         A70ArtEncOri = P035U2_A70ArtEncOri[0] ;
         n70ArtEncOri = P035U2_n70ArtEncOri[0] ;
         A96ArtSua = P035U2_A96ArtSua[0] ;
         n96ArtSua = P035U2_n96ArtSua[0] ;
         A64ArtAcaQui = P035U2_A64ArtAcaQui[0] ;
         n64ArtAcaQui = P035U2_n64ArtAcaQui[0] ;
         A117ArtUrg = P035U2_A117ArtUrg[0] ;
         n117ArtUrg = P035U2_n117ArtUrg[0] ;
         A105ArtTra1 = P035U2_A105ArtTra1[0] ;
         n105ArtTra1 = P035U2_n105ArtTra1[0] ;
         A106ArtTra2 = P035U2_A106ArtTra2[0] ;
         n106ArtTra2 = P035U2_n106ArtTra2[0] ;
         A107ArtTra3 = P035U2_A107ArtTra3[0] ;
         n107ArtTra3 = P035U2_n107ArtTra3[0] ;
         A108ArtTraP1 = P035U2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P035U2_n108ArtTraP1[0] ;
         A109ArtTraP2 = P035U2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P035U2_n109ArtTraP2[0] ;
         A110ArtTraP3 = P035U2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P035U2_n110ArtTraP3[0] ;
         A111ArtUrd1 = P035U2_A111ArtUrd1[0] ;
         n111ArtUrd1 = P035U2_n111ArtUrd1[0] ;
         A112ArtUrd2 = P035U2_A112ArtUrd2[0] ;
         n112ArtUrd2 = P035U2_n112ArtUrd2[0] ;
         A113ArtUrd3 = P035U2_A113ArtUrd3[0] ;
         n113ArtUrd3 = P035U2_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P035U2_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P035U2_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P035U2_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P035U2_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P035U2_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P035U2_n116ArtUrdP3[0] ;
         A78ArtGraCru = P035U2_A78ArtGraCru[0] ;
         n78ArtGraCru = P035U2_n78ArtGraCru[0] ;
         A1229ArtEncCom = P035U2_A1229ArtEncCom[0] ;
         n1229ArtEncCom = P035U2_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = P035U2_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = P035U2_n1230ArtEncAnh[0] ;
         A2834ArtPle2 = P035U2_A2834ArtPle2[0] ;
         n2834ArtPle2 = P035U2_n2834ArtPle2[0] ;
         A3122ArtAncSal1 = P035U2_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = P035U2_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = P035U2_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = P035U2_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = P035U2_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = P035U2_n3124ArtAncSal3[0] ;
         A3125ArtGraAca2 = P035U2_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = P035U2_n3125ArtGraAca2[0] ;
         A3126ArtGraCru2 = P035U2_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = P035U2_n3126ArtGraCru2[0] ;
         A3121ArtNumCor = P035U2_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P035U2_n3121ArtNumCor[0] ;
         A1903ArtGraAca = P035U2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P035U2_n1903ArtGraAca[0] ;
         A1905ArtRdoA = P035U2_A1905ArtRdoA[0] ;
         n1905ArtRdoA = P035U2_n1905ArtRdoA[0] ;
         A1904ArtRdoN = P035U2_A1904ArtRdoN[0] ;
         n1904ArtRdoN = P035U2_n1904ArtRdoN[0] ;
         A8339Tp_Cod = P035U2_A8339Tp_Cod[0] ;
         n8339Tp_Cod = P035U2_n8339Tp_Cod[0] ;
         A8339Tp_Cod = P035U2_A8339Tp_Cod[0] ;
         n8339Tp_Cod = P035U2_n8339Tp_Cod[0] ;
         AV15DisArtMat = A87ArtMat ;
         AV16DisArtTip = A829TipArtCod ;
         AV17DisArtDsc = A69ArtDsc ;
         AV18DisArtPes = A1148ArtPml ;
         AV40DisArtAnh = A63ArtAcaMin ;
         AV41DisArtAn1 = A62ArtAcaMax ;
         AV42DisArtAcb = A68ArtCruMin ;
         AV43DisArtAc2 = A67ArtCruMax ;
         AV19DisArtRdt = A95ArtRen ;
         AV20DisArtPle = A101ArtTipPle ;
         AV21DisArtLar = A100ArtTipLar ;
         AV22DisArtCor = A66ArtCorOri ;
         AV23DisArtEnc = A70ArtEncOri ;
         AV24DisArtSua = A96ArtSua ;
         AV25DisArtAca = A64ArtAcaQui ;
         AV26DisArtUrg = A117ArtUrg ;
         AV27DisArtTr1 = A105ArtTra1 ;
         AV28DisArtTr2 = A106ArtTra2 ;
         AV29DisArtTr3 = A107ArtTra3 ;
         AV30DisArtPt1 = A108ArtTraP1 ;
         AV31DisArtPt2 = A109ArtTraP2 ;
         AV32DisArtPt3 = A110ArtTraP3 ;
         AV33DisArtUr1 = A111ArtUrd1 ;
         AV34DisArtUr2 = A112ArtUrd2 ;
         AV35DisArtUr3 = A113ArtUrd3 ;
         AV36DisArtPu1 = A114ArtUrdP1 ;
         AV37DisArtPu2 = A115ArtUrdP2 ;
         AV38DisArtPu3 = A116ArtUrdP3 ;
         AV39DisGraCru = A78ArtGraCru ;
         AV44DisEncCom = A1229ArtEncCom ;
         AV45DisEncAnh = A1230ArtEncAnh ;
         AV47DisPle2 = A2834ArtPle2 ;
         AV49DisAncSal1 = A3122ArtAncSal1 ;
         AV50DisAncSal2 = A3123ArtAncSal2 ;
         AV51DisAncSal3 = A3124ArtAncSal3 ;
         AV52DisGraAca2 = A3125ArtGraAca2 ;
         AV53DisGraCru2 = A3126ArtGraCru2 ;
         AV48DisNumCor = A3121ArtNumCor ;
         AV54DisGraAca = A1903ArtGraAca ;
         AV55DisRdoA = A1905ArtRdoA ;
         AV56DisRdoN = A1904ArtRdoN ;
         AV46Flag = (byte)(1) ;
         AV57TP_COD = A8339Tp_Cod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partdisl.this.A396EmprCod;
      this.aP1[0] = partdisl.this.A252CliCod;
      this.aP2[0] = partdisl.this.A65ArtCod;
      this.aP3[0] = partdisl.this.AV17DisArtDsc;
      this.aP4[0] = partdisl.this.AV15DisArtMat;
      this.aP5[0] = partdisl.this.AV47DisPle2;
      this.aP6[0] = partdisl.this.AV21DisArtLar;
      this.aP7[0] = partdisl.this.AV24DisArtSua;
      this.aP8[0] = partdisl.this.AV25DisArtAca;
      this.aP9[0] = partdisl.this.AV20DisArtPle;
      this.aP10[0] = partdisl.this.AV16DisArtTip;
      this.aP11[0] = partdisl.this.AV23DisArtEnc;
      this.aP12[0] = partdisl.this.AV22DisArtCor;
      this.aP13[0] = partdisl.this.AV27DisArtTr1;
      this.aP14[0] = partdisl.this.AV28DisArtTr2;
      this.aP15[0] = partdisl.this.AV29DisArtTr3;
      this.aP16[0] = partdisl.this.AV30DisArtPt1;
      this.aP17[0] = partdisl.this.AV31DisArtPt2;
      this.aP18[0] = partdisl.this.AV32DisArtPt3;
      this.aP19[0] = partdisl.this.AV19DisArtRdt;
      this.aP20[0] = partdisl.this.AV26DisArtUrg;
      this.aP21[0] = partdisl.this.AV33DisArtUr1;
      this.aP22[0] = partdisl.this.AV34DisArtUr2;
      this.aP23[0] = partdisl.this.AV35DisArtUr3;
      this.aP24[0] = partdisl.this.AV36DisArtPu1;
      this.aP25[0] = partdisl.this.AV37DisArtPu2;
      this.aP26[0] = partdisl.this.AV38DisArtPu3;
      this.aP27[0] = partdisl.this.AV18DisArtPes;
      this.aP28[0] = partdisl.this.AV39DisGraCru;
      this.aP29[0] = partdisl.this.AV40DisArtAnh;
      this.aP30[0] = partdisl.this.AV41DisArtAn1;
      this.aP31[0] = partdisl.this.AV42DisArtAcb;
      this.aP32[0] = partdisl.this.AV43DisArtAc2;
      this.aP33[0] = partdisl.this.AV44DisEncCom;
      this.aP34[0] = partdisl.this.AV45DisEncAnh;
      this.aP35[0] = partdisl.this.AV48DisNumCor;
      this.aP36[0] = partdisl.this.AV49DisAncSal1;
      this.aP37[0] = partdisl.this.AV50DisAncSal2;
      this.aP38[0] = partdisl.this.AV51DisAncSal3;
      this.aP39[0] = partdisl.this.AV52DisGraAca2;
      this.aP40[0] = partdisl.this.AV53DisGraCru2;
      this.aP41[0] = partdisl.this.AV54DisGraAca;
      this.aP42[0] = partdisl.this.AV55DisRdoA;
      this.aP43[0] = partdisl.this.AV56DisRdoN;
      this.aP44[0] = partdisl.this.AV57TP_COD;
      this.aP45[0] = partdisl.this.AV46Flag;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P035U2_A4295ClasCod = new short[1] ;
      P035U2_n4295ClasCod = new boolean[] {false} ;
      P035U2_A396EmprCod = new String[] {""} ;
      P035U2_A252CliCod = new int[1] ;
      P035U2_A65ArtCod = new String[] {""} ;
      P035U2_A87ArtMat = new String[] {""} ;
      P035U2_n87ArtMat = new boolean[] {false} ;
      P035U2_A829TipArtCod = new short[1] ;
      P035U2_A69ArtDsc = new String[] {""} ;
      P035U2_n69ArtDsc = new boolean[] {false} ;
      P035U2_A1148ArtPml = new short[1] ;
      P035U2_n1148ArtPml = new boolean[] {false} ;
      P035U2_A63ArtAcaMin = new short[1] ;
      P035U2_n63ArtAcaMin = new boolean[] {false} ;
      P035U2_A62ArtAcaMax = new short[1] ;
      P035U2_n62ArtAcaMax = new boolean[] {false} ;
      P035U2_A68ArtCruMin = new short[1] ;
      P035U2_n68ArtCruMin = new boolean[] {false} ;
      P035U2_A67ArtCruMax = new short[1] ;
      P035U2_n67ArtCruMax = new boolean[] {false} ;
      P035U2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035U2_n95ArtRen = new boolean[] {false} ;
      P035U2_A101ArtTipPle = new String[] {""} ;
      P035U2_n101ArtTipPle = new boolean[] {false} ;
      P035U2_A100ArtTipLar = new String[] {""} ;
      P035U2_n100ArtTipLar = new boolean[] {false} ;
      P035U2_A66ArtCorOri = new String[] {""} ;
      P035U2_n66ArtCorOri = new boolean[] {false} ;
      P035U2_A70ArtEncOri = new String[] {""} ;
      P035U2_n70ArtEncOri = new boolean[] {false} ;
      P035U2_A96ArtSua = new String[] {""} ;
      P035U2_n96ArtSua = new boolean[] {false} ;
      P035U2_A64ArtAcaQui = new String[] {""} ;
      P035U2_n64ArtAcaQui = new boolean[] {false} ;
      P035U2_A117ArtUrg = new byte[1] ;
      P035U2_n117ArtUrg = new boolean[] {false} ;
      P035U2_A105ArtTra1 = new String[] {""} ;
      P035U2_n105ArtTra1 = new boolean[] {false} ;
      P035U2_A106ArtTra2 = new String[] {""} ;
      P035U2_n106ArtTra2 = new boolean[] {false} ;
      P035U2_A107ArtTra3 = new String[] {""} ;
      P035U2_n107ArtTra3 = new boolean[] {false} ;
      P035U2_A108ArtTraP1 = new short[1] ;
      P035U2_n108ArtTraP1 = new boolean[] {false} ;
      P035U2_A109ArtTraP2 = new short[1] ;
      P035U2_n109ArtTraP2 = new boolean[] {false} ;
      P035U2_A110ArtTraP3 = new short[1] ;
      P035U2_n110ArtTraP3 = new boolean[] {false} ;
      P035U2_A111ArtUrd1 = new String[] {""} ;
      P035U2_n111ArtUrd1 = new boolean[] {false} ;
      P035U2_A112ArtUrd2 = new String[] {""} ;
      P035U2_n112ArtUrd2 = new boolean[] {false} ;
      P035U2_A113ArtUrd3 = new String[] {""} ;
      P035U2_n113ArtUrd3 = new boolean[] {false} ;
      P035U2_A114ArtUrdP1 = new short[1] ;
      P035U2_n114ArtUrdP1 = new boolean[] {false} ;
      P035U2_A115ArtUrdP2 = new short[1] ;
      P035U2_n115ArtUrdP2 = new boolean[] {false} ;
      P035U2_A116ArtUrdP3 = new short[1] ;
      P035U2_n116ArtUrdP3 = new boolean[] {false} ;
      P035U2_A78ArtGraCru = new short[1] ;
      P035U2_n78ArtGraCru = new boolean[] {false} ;
      P035U2_A1229ArtEncCom = new short[1] ;
      P035U2_n1229ArtEncCom = new boolean[] {false} ;
      P035U2_A1230ArtEncAnh = new short[1] ;
      P035U2_n1230ArtEncAnh = new boolean[] {false} ;
      P035U2_A2834ArtPle2 = new String[] {""} ;
      P035U2_n2834ArtPle2 = new boolean[] {false} ;
      P035U2_A3122ArtAncSal1 = new short[1] ;
      P035U2_n3122ArtAncSal1 = new boolean[] {false} ;
      P035U2_A3123ArtAncSal2 = new short[1] ;
      P035U2_n3123ArtAncSal2 = new boolean[] {false} ;
      P035U2_A3124ArtAncSal3 = new short[1] ;
      P035U2_n3124ArtAncSal3 = new boolean[] {false} ;
      P035U2_A3125ArtGraAca2 = new short[1] ;
      P035U2_n3125ArtGraAca2 = new boolean[] {false} ;
      P035U2_A3126ArtGraCru2 = new short[1] ;
      P035U2_n3126ArtGraCru2 = new boolean[] {false} ;
      P035U2_A3121ArtNumCor = new short[1] ;
      P035U2_n3121ArtNumCor = new boolean[] {false} ;
      P035U2_A1903ArtGraAca = new short[1] ;
      P035U2_n1903ArtGraAca = new boolean[] {false} ;
      P035U2_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035U2_n1905ArtRdoA = new boolean[] {false} ;
      P035U2_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035U2_n1904ArtRdoN = new boolean[] {false} ;
      P035U2_A8339Tp_Cod = new byte[1] ;
      P035U2_n8339Tp_Cod = new boolean[] {false} ;
      A87ArtMat = "" ;
      A69ArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A101ArtTipPle = "" ;
      A100ArtTipLar = "" ;
      A66ArtCorOri = "" ;
      A70ArtEncOri = "" ;
      A96ArtSua = "" ;
      A64ArtAcaQui = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A2834ArtPle2 = "" ;
      A1905ArtRdoA = DecimalUtil.ZERO ;
      A1904ArtRdoN = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partdisl__default(),
         new Object[] {
             new Object[] {
            P035U2_A4295ClasCod, P035U2_n4295ClasCod, P035U2_A396EmprCod, P035U2_A252CliCod, P035U2_A65ArtCod, P035U2_A87ArtMat, P035U2_n87ArtMat, P035U2_A829TipArtCod, P035U2_A69ArtDsc, P035U2_n69ArtDsc,
            P035U2_A1148ArtPml, P035U2_n1148ArtPml, P035U2_A63ArtAcaMin, P035U2_n63ArtAcaMin, P035U2_A62ArtAcaMax, P035U2_n62ArtAcaMax, P035U2_A68ArtCruMin, P035U2_n68ArtCruMin, P035U2_A67ArtCruMax, P035U2_n67ArtCruMax,
            P035U2_A95ArtRen, P035U2_n95ArtRen, P035U2_A101ArtTipPle, P035U2_n101ArtTipPle, P035U2_A100ArtTipLar, P035U2_n100ArtTipLar, P035U2_A66ArtCorOri, P035U2_n66ArtCorOri, P035U2_A70ArtEncOri, P035U2_n70ArtEncOri,
            P035U2_A96ArtSua, P035U2_n96ArtSua, P035U2_A64ArtAcaQui, P035U2_n64ArtAcaQui, P035U2_A117ArtUrg, P035U2_n117ArtUrg, P035U2_A105ArtTra1, P035U2_n105ArtTra1, P035U2_A106ArtTra2, P035U2_n106ArtTra2,
            P035U2_A107ArtTra3, P035U2_n107ArtTra3, P035U2_A108ArtTraP1, P035U2_n108ArtTraP1, P035U2_A109ArtTraP2, P035U2_n109ArtTraP2, P035U2_A110ArtTraP3, P035U2_n110ArtTraP3, P035U2_A111ArtUrd1, P035U2_n111ArtUrd1,
            P035U2_A112ArtUrd2, P035U2_n112ArtUrd2, P035U2_A113ArtUrd3, P035U2_n113ArtUrd3, P035U2_A114ArtUrdP1, P035U2_n114ArtUrdP1, P035U2_A115ArtUrdP2, P035U2_n115ArtUrdP2, P035U2_A116ArtUrdP3, P035U2_n116ArtUrdP3,
            P035U2_A78ArtGraCru, P035U2_n78ArtGraCru, P035U2_A1229ArtEncCom, P035U2_n1229ArtEncCom, P035U2_A1230ArtEncAnh, P035U2_n1230ArtEncAnh, P035U2_A2834ArtPle2, P035U2_n2834ArtPle2, P035U2_A3122ArtAncSal1, P035U2_n3122ArtAncSal1,
            P035U2_A3123ArtAncSal2, P035U2_n3123ArtAncSal2, P035U2_A3124ArtAncSal3, P035U2_n3124ArtAncSal3, P035U2_A3125ArtGraAca2, P035U2_n3125ArtGraAca2, P035U2_A3126ArtGraCru2, P035U2_n3126ArtGraCru2, P035U2_A3121ArtNumCor, P035U2_n3121ArtNumCor,
            P035U2_A1903ArtGraAca, P035U2_n1903ArtGraAca, P035U2_A1905ArtRdoA, P035U2_n1905ArtRdoA, P035U2_A1904ArtRdoN, P035U2_n1904ArtRdoN, P035U2_A8339Tp_Cod, P035U2_n8339Tp_Cod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26DisArtUrg ;
   private byte AV57TP_COD ;
   private byte AV46Flag ;
   private byte A117ArtUrg ;
   private byte A8339Tp_Cod ;
   private short AV16DisArtTip ;
   private short AV30DisArtPt1 ;
   private short AV31DisArtPt2 ;
   private short AV32DisArtPt3 ;
   private short AV36DisArtPu1 ;
   private short AV37DisArtPu2 ;
   private short AV38DisArtPu3 ;
   private short AV18DisArtPes ;
   private short AV39DisGraCru ;
   private short AV40DisArtAnh ;
   private short AV41DisArtAn1 ;
   private short AV42DisArtAcb ;
   private short AV43DisArtAc2 ;
   private short AV44DisEncCom ;
   private short AV45DisEncAnh ;
   private short AV48DisNumCor ;
   private short AV49DisAncSal1 ;
   private short AV50DisAncSal2 ;
   private short AV51DisAncSal3 ;
   private short AV52DisGraAca2 ;
   private short AV53DisGraCru2 ;
   private short AV54DisGraAca ;
   private short A4295ClasCod ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A63ArtAcaMin ;
   private short A62ArtAcaMax ;
   private short A68ArtCruMin ;
   private short A67ArtCruMax ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short A78ArtGraCru ;
   private short A1229ArtEncCom ;
   private short A1230ArtEncAnh ;
   private short A3122ArtAncSal1 ;
   private short A3123ArtAncSal2 ;
   private short A3124ArtAncSal3 ;
   private short A3125ArtGraAca2 ;
   private short A3126ArtGraCru2 ;
   private short A3121ArtNumCor ;
   private short A1903ArtGraAca ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV19DisArtRdt ;
   private java.math.BigDecimal AV55DisRdoA ;
   private java.math.BigDecimal AV56DisRdoN ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal A1904ArtRdoN ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV17DisArtDsc ;
   private String AV15DisArtMat ;
   private String AV47DisPle2 ;
   private String AV21DisArtLar ;
   private String AV24DisArtSua ;
   private String AV25DisArtAca ;
   private String AV20DisArtPle ;
   private String AV23DisArtEnc ;
   private String AV22DisArtCor ;
   private String AV27DisArtTr1 ;
   private String AV28DisArtTr2 ;
   private String AV29DisArtTr3 ;
   private String AV33DisArtUr1 ;
   private String AV34DisArtUr2 ;
   private String AV35DisArtUr3 ;
   private String scmdbuf ;
   private String A87ArtMat ;
   private String A69ArtDsc ;
   private String A101ArtTipPle ;
   private String A100ArtTipLar ;
   private String A66ArtCorOri ;
   private String A70ArtEncOri ;
   private String A96ArtSua ;
   private String A64ArtAcaQui ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private String A2834ArtPle2 ;
   private boolean n4295ClasCod ;
   private boolean n87ArtMat ;
   private boolean n69ArtDsc ;
   private boolean n1148ArtPml ;
   private boolean n63ArtAcaMin ;
   private boolean n62ArtAcaMax ;
   private boolean n68ArtCruMin ;
   private boolean n67ArtCruMax ;
   private boolean n95ArtRen ;
   private boolean n101ArtTipPle ;
   private boolean n100ArtTipLar ;
   private boolean n66ArtCorOri ;
   private boolean n70ArtEncOri ;
   private boolean n96ArtSua ;
   private boolean n64ArtAcaQui ;
   private boolean n117ArtUrg ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n112ArtUrd2 ;
   private boolean n113ArtUrd3 ;
   private boolean n114ArtUrdP1 ;
   private boolean n115ArtUrdP2 ;
   private boolean n116ArtUrdP3 ;
   private boolean n78ArtGraCru ;
   private boolean n1229ArtEncCom ;
   private boolean n1230ArtEncAnh ;
   private boolean n2834ArtPle2 ;
   private boolean n3122ArtAncSal1 ;
   private boolean n3123ArtAncSal2 ;
   private boolean n3124ArtAncSal3 ;
   private boolean n3125ArtGraAca2 ;
   private boolean n3126ArtGraCru2 ;
   private boolean n3121ArtNumCor ;
   private boolean n1903ArtGraAca ;
   private boolean n1905ArtRdoA ;
   private boolean n1904ArtRdoN ;
   private boolean n8339Tp_Cod ;
   private byte[] aP45 ;
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
   private String[] aP14 ;
   private String[] aP15 ;
   private short[] aP16 ;
   private short[] aP17 ;
   private short[] aP18 ;
   private java.math.BigDecimal[] aP19 ;
   private byte[] aP20 ;
   private String[] aP21 ;
   private String[] aP22 ;
   private String[] aP23 ;
   private short[] aP24 ;
   private short[] aP25 ;
   private short[] aP26 ;
   private short[] aP27 ;
   private short[] aP28 ;
   private short[] aP29 ;
   private short[] aP30 ;
   private short[] aP31 ;
   private short[] aP32 ;
   private short[] aP33 ;
   private short[] aP34 ;
   private short[] aP35 ;
   private short[] aP36 ;
   private short[] aP37 ;
   private short[] aP38 ;
   private short[] aP39 ;
   private short[] aP40 ;
   private short[] aP41 ;
   private java.math.BigDecimal[] aP42 ;
   private java.math.BigDecimal[] aP43 ;
   private byte[] aP44 ;
   private IDataStoreProvider pr_default ;
   private short[] P035U2_A4295ClasCod ;
   private boolean[] P035U2_n4295ClasCod ;
   private String[] P035U2_A396EmprCod ;
   private int[] P035U2_A252CliCod ;
   private String[] P035U2_A65ArtCod ;
   private String[] P035U2_A87ArtMat ;
   private boolean[] P035U2_n87ArtMat ;
   private short[] P035U2_A829TipArtCod ;
   private String[] P035U2_A69ArtDsc ;
   private boolean[] P035U2_n69ArtDsc ;
   private short[] P035U2_A1148ArtPml ;
   private boolean[] P035U2_n1148ArtPml ;
   private short[] P035U2_A63ArtAcaMin ;
   private boolean[] P035U2_n63ArtAcaMin ;
   private short[] P035U2_A62ArtAcaMax ;
   private boolean[] P035U2_n62ArtAcaMax ;
   private short[] P035U2_A68ArtCruMin ;
   private boolean[] P035U2_n68ArtCruMin ;
   private short[] P035U2_A67ArtCruMax ;
   private boolean[] P035U2_n67ArtCruMax ;
   private java.math.BigDecimal[] P035U2_A95ArtRen ;
   private boolean[] P035U2_n95ArtRen ;
   private String[] P035U2_A101ArtTipPle ;
   private boolean[] P035U2_n101ArtTipPle ;
   private String[] P035U2_A100ArtTipLar ;
   private boolean[] P035U2_n100ArtTipLar ;
   private String[] P035U2_A66ArtCorOri ;
   private boolean[] P035U2_n66ArtCorOri ;
   private String[] P035U2_A70ArtEncOri ;
   private boolean[] P035U2_n70ArtEncOri ;
   private String[] P035U2_A96ArtSua ;
   private boolean[] P035U2_n96ArtSua ;
   private String[] P035U2_A64ArtAcaQui ;
   private boolean[] P035U2_n64ArtAcaQui ;
   private byte[] P035U2_A117ArtUrg ;
   private boolean[] P035U2_n117ArtUrg ;
   private String[] P035U2_A105ArtTra1 ;
   private boolean[] P035U2_n105ArtTra1 ;
   private String[] P035U2_A106ArtTra2 ;
   private boolean[] P035U2_n106ArtTra2 ;
   private String[] P035U2_A107ArtTra3 ;
   private boolean[] P035U2_n107ArtTra3 ;
   private short[] P035U2_A108ArtTraP1 ;
   private boolean[] P035U2_n108ArtTraP1 ;
   private short[] P035U2_A109ArtTraP2 ;
   private boolean[] P035U2_n109ArtTraP2 ;
   private short[] P035U2_A110ArtTraP3 ;
   private boolean[] P035U2_n110ArtTraP3 ;
   private String[] P035U2_A111ArtUrd1 ;
   private boolean[] P035U2_n111ArtUrd1 ;
   private String[] P035U2_A112ArtUrd2 ;
   private boolean[] P035U2_n112ArtUrd2 ;
   private String[] P035U2_A113ArtUrd3 ;
   private boolean[] P035U2_n113ArtUrd3 ;
   private short[] P035U2_A114ArtUrdP1 ;
   private boolean[] P035U2_n114ArtUrdP1 ;
   private short[] P035U2_A115ArtUrdP2 ;
   private boolean[] P035U2_n115ArtUrdP2 ;
   private short[] P035U2_A116ArtUrdP3 ;
   private boolean[] P035U2_n116ArtUrdP3 ;
   private short[] P035U2_A78ArtGraCru ;
   private boolean[] P035U2_n78ArtGraCru ;
   private short[] P035U2_A1229ArtEncCom ;
   private boolean[] P035U2_n1229ArtEncCom ;
   private short[] P035U2_A1230ArtEncAnh ;
   private boolean[] P035U2_n1230ArtEncAnh ;
   private String[] P035U2_A2834ArtPle2 ;
   private boolean[] P035U2_n2834ArtPle2 ;
   private short[] P035U2_A3122ArtAncSal1 ;
   private boolean[] P035U2_n3122ArtAncSal1 ;
   private short[] P035U2_A3123ArtAncSal2 ;
   private boolean[] P035U2_n3123ArtAncSal2 ;
   private short[] P035U2_A3124ArtAncSal3 ;
   private boolean[] P035U2_n3124ArtAncSal3 ;
   private short[] P035U2_A3125ArtGraAca2 ;
   private boolean[] P035U2_n3125ArtGraAca2 ;
   private short[] P035U2_A3126ArtGraCru2 ;
   private boolean[] P035U2_n3126ArtGraCru2 ;
   private short[] P035U2_A3121ArtNumCor ;
   private boolean[] P035U2_n3121ArtNumCor ;
   private short[] P035U2_A1903ArtGraAca ;
   private boolean[] P035U2_n1903ArtGraAca ;
   private java.math.BigDecimal[] P035U2_A1905ArtRdoA ;
   private boolean[] P035U2_n1905ArtRdoA ;
   private java.math.BigDecimal[] P035U2_A1904ArtRdoN ;
   private boolean[] P035U2_n1904ArtRdoN ;
   private byte[] P035U2_A8339Tp_Cod ;
   private boolean[] P035U2_n8339Tp_Cod ;
}

final  class partdisl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P035U2", "SELECT T1.ClasCod, T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ArtMat, T1.TipArtCod, T1.ArtDsc, T1.ArtPml, T1.ArtAcaMin, T1.ArtAcaMax, T1.ArtCruMin, T1.ArtCruMax, T1.ArtRen, T1.ArtTipPle, T1.ArtTipLar, T1.ArtCorOri, T1.ArtEncOri, T1.ArtSua, T1.ArtAcaQui, T1.ArtUrg, T1.ArtTra1, T1.ArtTra2, T1.ArtTra3, T1.ArtTraP1, T1.ArtTraP2, T1.ArtTraP3, T1.ArtUrd1, T1.ArtUrd2, T1.ArtUrd3, T1.ArtUrdP1, T1.ArtUrdP2, T1.ArtUrdP3, T1.ArtGraCru, T1.ArtEncCom, T1.ArtEncAnh, T1.ArtPle2, T1.ArtAncSal1, T1.ArtAncSal2, T1.ArtAncSal3, T1.ArtGraAca2, T1.ArtGraCru2, T1.ArtNumCor, T1.ArtGraAca, T1.ArtRdoA, T1.ArtRdoN, T2.Tp_Cod FROM (TXPARTICU T1 LEFT JOIN TXPCLAPEN T2 ON T2.EmprCod = T1.EmprCod AND T2.ClasCod = T1.ClasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((byte[]) buf[34])[0] = rslt.getByte(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 4);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 4);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 4);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 4);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 4);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((short[]) buf[54])[0] = rslt.getShort(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(32);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(36, 30);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(37);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(38);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(39);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((short[]) buf[76])[0] = rslt.getShort(41);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((short[]) buf[80])[0] = rslt.getShort(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((byte[]) buf[86])[0] = rslt.getByte(46);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

