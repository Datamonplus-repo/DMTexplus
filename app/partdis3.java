package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partdis3 extends GXProcedure
{
   public partdis3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partdis3.class ), "" );
   }

   public partdis3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 ,
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
                           String[] aP44 ,
                           String[] aP45 ,
                           String[] aP46 ,
                           String[] aP47 ,
                           java.math.BigDecimal[] aP48 )
   {
      partdis3.this.aP49 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49);
      return aP49[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
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
                        String[] aP44 ,
                        String[] aP45 ,
                        String[] aP46 ,
                        String[] aP47 ,
                        java.math.BigDecimal[] aP48 ,
                        byte[] aP49 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
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
                             String[] aP44 ,
                             String[] aP45 ,
                             String[] aP46 ,
                             String[] aP47 ,
                             java.math.BigDecimal[] aP48 ,
                             byte[] aP49 )
   {
      partdis3.this.AV66EmprCod = aP0;
      partdis3.this.AV67CliCod = aP1;
      partdis3.this.AV68ArtCod = aP2;
      partdis3.this.aP3 = aP3;
      partdis3.this.aP4 = aP4;
      partdis3.this.aP5 = aP5;
      partdis3.this.aP6 = aP6;
      partdis3.this.aP7 = aP7;
      partdis3.this.aP8 = aP8;
      partdis3.this.aP9 = aP9;
      partdis3.this.aP10 = aP10;
      partdis3.this.aP11 = aP11;
      partdis3.this.aP12 = aP12;
      partdis3.this.aP13 = aP13;
      partdis3.this.aP14 = aP14;
      partdis3.this.aP15 = aP15;
      partdis3.this.aP16 = aP16;
      partdis3.this.aP17 = aP17;
      partdis3.this.aP18 = aP18;
      partdis3.this.aP19 = aP19;
      partdis3.this.aP20 = aP20;
      partdis3.this.aP21 = aP21;
      partdis3.this.aP22 = aP22;
      partdis3.this.aP23 = aP23;
      partdis3.this.aP24 = aP24;
      partdis3.this.aP25 = aP25;
      partdis3.this.aP26 = aP26;
      partdis3.this.aP27 = aP27;
      partdis3.this.aP28 = aP28;
      partdis3.this.aP29 = aP29;
      partdis3.this.aP30 = aP30;
      partdis3.this.aP31 = aP31;
      partdis3.this.aP32 = aP32;
      partdis3.this.aP33 = aP33;
      partdis3.this.aP34 = aP34;
      partdis3.this.aP35 = aP35;
      partdis3.this.aP36 = aP36;
      partdis3.this.aP37 = aP37;
      partdis3.this.aP38 = aP38;
      partdis3.this.aP39 = aP39;
      partdis3.this.aP40 = aP40;
      partdis3.this.aP41 = aP41;
      partdis3.this.aP42 = aP42;
      partdis3.this.aP43 = aP43;
      partdis3.this.aP44 = aP44;
      partdis3.this.aP45 = aP45;
      partdis3.this.aP46 = aP46;
      partdis3.this.aP47 = aP47;
      partdis3.this.aP48 = aP48;
      partdis3.this.aP49 = aP49;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV46Flag = (byte)(0) ;
      GXt_int1 = AV61FlagKgs ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV66EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int2) ;
      partdis3.this.GXt_int1 = GXv_int2[0] ;
      AV61FlagKgs = GXt_int1 ;
      GXt_int1 = AV62FlagMts ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV66EmprCod, httpContext.getMessage( "METROS", ""), GXv_int2) ;
      partdis3.this.GXt_int1 = GXv_int2[0] ;
      AV62FlagMts = GXt_int1 ;
      GXt_int1 = AV63DatosCrudo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV66EmprCod, httpContext.getMessage( "CRUPML", ""), GXv_int2) ;
      partdis3.this.GXt_int1 = GXv_int2[0] ;
      AV63DatosCrudo = GXt_int1 ;
      GXt_int1 = AV65Moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV66EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      partdis3.this.GXt_int1 = GXv_int2[0] ;
      AV65Moda21 = GXt_int1 ;
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
      AV22DisArtCor = "N" ;
      AV23DisArtEnc = "N" ;
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
      AV59dISITEM5 = " " ;
      AV64DisArtMer = DecimalUtil.doubleToDec(0) ;
      AV71GXLvl51 = (byte)(0) ;
      /* Using cursor P03YN2 */
      pr_default.execute(0, new Object[] {AV66EmprCod, Integer.valueOf(AV67CliCod), AV68ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P03YN2_A65ArtCod[0] ;
         A252CliCod = P03YN2_A252CliCod[0] ;
         A396EmprCod = P03YN2_A396EmprCod[0] ;
         A87ArtMat = P03YN2_A87ArtMat[0] ;
         n87ArtMat = P03YN2_n87ArtMat[0] ;
         A829TipArtCod = P03YN2_A829TipArtCod[0] ;
         A69ArtDsc = P03YN2_A69ArtDsc[0] ;
         n69ArtDsc = P03YN2_n69ArtDsc[0] ;
         A7415ArtPmlCru = P03YN2_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P03YN2_n7415ArtPmlCru[0] ;
         A1148ArtPml = P03YN2_A1148ArtPml[0] ;
         n1148ArtPml = P03YN2_n1148ArtPml[0] ;
         A63ArtAcaMin = P03YN2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P03YN2_n63ArtAcaMin[0] ;
         A62ArtAcaMax = P03YN2_A62ArtAcaMax[0] ;
         n62ArtAcaMax = P03YN2_n62ArtAcaMax[0] ;
         A68ArtCruMin = P03YN2_A68ArtCruMin[0] ;
         n68ArtCruMin = P03YN2_n68ArtCruMin[0] ;
         A67ArtCruMax = P03YN2_A67ArtCruMax[0] ;
         n67ArtCruMax = P03YN2_n67ArtCruMax[0] ;
         A95ArtRen = P03YN2_A95ArtRen[0] ;
         n95ArtRen = P03YN2_n95ArtRen[0] ;
         A101ArtTipPle = P03YN2_A101ArtTipPle[0] ;
         n101ArtTipPle = P03YN2_n101ArtTipPle[0] ;
         A100ArtTipLar = P03YN2_A100ArtTipLar[0] ;
         n100ArtTipLar = P03YN2_n100ArtTipLar[0] ;
         A66ArtCorOri = P03YN2_A66ArtCorOri[0] ;
         n66ArtCorOri = P03YN2_n66ArtCorOri[0] ;
         A70ArtEncOri = P03YN2_A70ArtEncOri[0] ;
         n70ArtEncOri = P03YN2_n70ArtEncOri[0] ;
         A96ArtSua = P03YN2_A96ArtSua[0] ;
         n96ArtSua = P03YN2_n96ArtSua[0] ;
         A64ArtAcaQui = P03YN2_A64ArtAcaQui[0] ;
         n64ArtAcaQui = P03YN2_n64ArtAcaQui[0] ;
         A117ArtUrg = P03YN2_A117ArtUrg[0] ;
         n117ArtUrg = P03YN2_n117ArtUrg[0] ;
         A105ArtTra1 = P03YN2_A105ArtTra1[0] ;
         n105ArtTra1 = P03YN2_n105ArtTra1[0] ;
         A106ArtTra2 = P03YN2_A106ArtTra2[0] ;
         n106ArtTra2 = P03YN2_n106ArtTra2[0] ;
         A107ArtTra3 = P03YN2_A107ArtTra3[0] ;
         n107ArtTra3 = P03YN2_n107ArtTra3[0] ;
         A108ArtTraP1 = P03YN2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P03YN2_n108ArtTraP1[0] ;
         A109ArtTraP2 = P03YN2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P03YN2_n109ArtTraP2[0] ;
         A110ArtTraP3 = P03YN2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P03YN2_n110ArtTraP3[0] ;
         A111ArtUrd1 = P03YN2_A111ArtUrd1[0] ;
         n111ArtUrd1 = P03YN2_n111ArtUrd1[0] ;
         A112ArtUrd2 = P03YN2_A112ArtUrd2[0] ;
         n112ArtUrd2 = P03YN2_n112ArtUrd2[0] ;
         A113ArtUrd3 = P03YN2_A113ArtUrd3[0] ;
         n113ArtUrd3 = P03YN2_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P03YN2_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P03YN2_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P03YN2_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P03YN2_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P03YN2_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P03YN2_n116ArtUrdP3[0] ;
         A78ArtGraCru = P03YN2_A78ArtGraCru[0] ;
         n78ArtGraCru = P03YN2_n78ArtGraCru[0] ;
         A1229ArtEncCom = P03YN2_A1229ArtEncCom[0] ;
         n1229ArtEncCom = P03YN2_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = P03YN2_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = P03YN2_n1230ArtEncAnh[0] ;
         A2834ArtPle2 = P03YN2_A2834ArtPle2[0] ;
         n2834ArtPle2 = P03YN2_n2834ArtPle2[0] ;
         A3122ArtAncSal1 = P03YN2_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = P03YN2_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = P03YN2_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = P03YN2_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = P03YN2_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = P03YN2_n3124ArtAncSal3[0] ;
         A3126ArtGraCru2 = P03YN2_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = P03YN2_n3126ArtGraCru2[0] ;
         A3121ArtNumCor = P03YN2_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P03YN2_n3121ArtNumCor[0] ;
         A3125ArtGraAca2 = P03YN2_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = P03YN2_n3125ArtGraAca2[0] ;
         A1903ArtGraAca = P03YN2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P03YN2_n1903ArtGraAca[0] ;
         A1905ArtRdoA = P03YN2_A1905ArtRdoA[0] ;
         n1905ArtRdoA = P03YN2_n1905ArtRdoA[0] ;
         A1904ArtRdoN = P03YN2_A1904ArtRdoN[0] ;
         n1904ArtRdoN = P03YN2_n1904ArtRdoN[0] ;
         A398ArtObsAnc = P03YN2_A398ArtObsAnc[0] ;
         n398ArtObsAnc = P03YN2_n398ArtObsAnc[0] ;
         A397ArtObsGrm = P03YN2_A397ArtObsGrm[0] ;
         n397ArtObsGrm = P03YN2_n397ArtObsGrm[0] ;
         A4980ArtCdb = P03YN2_A4980ArtCdb[0] ;
         n4980ArtCdb = P03YN2_n4980ArtCdb[0] ;
         A7778ArtUnd = P03YN2_A7778ArtUnd[0] ;
         n7778ArtUnd = P03YN2_n7778ArtUnd[0] ;
         A88ArtMer = P03YN2_A88ArtMer[0] ;
         n88ArtMer = P03YN2_n88ArtMer[0] ;
         AV71GXLvl51 = (byte)(1) ;
         AV15DisArtMat = A87ArtMat ;
         AV16DisArtTip = A829TipArtCod ;
         AV17DisArtDsc = A69ArtDsc ;
         AV18DisArtPes = ((AV63DatosCrudo==0) ? A1148ArtPml : A7415ArtPmlCru) ;
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
         AV53DisGraCru2 = A3126ArtGraCru2 ;
         AV48DisNumCor = A3121ArtNumCor ;
         AV52DisGraAca2 = (short)(((AV65Moda21==1) ? 0 : A3125ArtGraAca2)) ;
         AV54DisGraAca = (short)(((AV65Moda21==1) ? 0 : A1903ArtGraAca)) ;
         AV55DisRdoA = A1905ArtRdoA ;
         AV56DisRdoN = A1904ArtRdoN ;
         AV57DisObsanc = A398ArtObsAnc ;
         AV58DisObsgrm = A397ArtObsGrm ;
         AV59dISITEM5 = A4980ArtCdb ;
         if ( ( ( GXutil.strcmp(A7778ArtUnd, " ") == 0 ) ) || ( GXutil.strcmp(A7778ArtUnd, "*") == 0 ) )
         {
            AV60DisUniMed = " " ;
            if ( AV61FlagKgs == 1 )
            {
               AV60DisUniMed = httpContext.getMessage( "K", "") ;
            }
            if ( AV62FlagMts == 1 )
            {
               AV60DisUniMed = httpContext.getMessage( "M", "") ;
            }
         }
         else
         {
            AV60DisUniMed = A7778ArtUnd ;
         }
         AV46Flag = (byte)(1) ;
         AV64DisArtMer = A88ArtMer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV71GXLvl51 == 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = partdis3.this.AV17DisArtDsc;
      this.aP4[0] = partdis3.this.AV15DisArtMat;
      this.aP5[0] = partdis3.this.AV47DisPle2;
      this.aP6[0] = partdis3.this.AV21DisArtLar;
      this.aP7[0] = partdis3.this.AV24DisArtSua;
      this.aP8[0] = partdis3.this.AV25DisArtAca;
      this.aP9[0] = partdis3.this.AV20DisArtPle;
      this.aP10[0] = partdis3.this.AV16DisArtTip;
      this.aP11[0] = partdis3.this.AV23DisArtEnc;
      this.aP12[0] = partdis3.this.AV22DisArtCor;
      this.aP13[0] = partdis3.this.AV27DisArtTr1;
      this.aP14[0] = partdis3.this.AV28DisArtTr2;
      this.aP15[0] = partdis3.this.AV29DisArtTr3;
      this.aP16[0] = partdis3.this.AV30DisArtPt1;
      this.aP17[0] = partdis3.this.AV31DisArtPt2;
      this.aP18[0] = partdis3.this.AV32DisArtPt3;
      this.aP19[0] = partdis3.this.AV19DisArtRdt;
      this.aP20[0] = partdis3.this.AV26DisArtUrg;
      this.aP21[0] = partdis3.this.AV33DisArtUr1;
      this.aP22[0] = partdis3.this.AV34DisArtUr2;
      this.aP23[0] = partdis3.this.AV35DisArtUr3;
      this.aP24[0] = partdis3.this.AV36DisArtPu1;
      this.aP25[0] = partdis3.this.AV37DisArtPu2;
      this.aP26[0] = partdis3.this.AV38DisArtPu3;
      this.aP27[0] = partdis3.this.AV18DisArtPes;
      this.aP28[0] = partdis3.this.AV39DisGraCru;
      this.aP29[0] = partdis3.this.AV40DisArtAnh;
      this.aP30[0] = partdis3.this.AV41DisArtAn1;
      this.aP31[0] = partdis3.this.AV42DisArtAcb;
      this.aP32[0] = partdis3.this.AV43DisArtAc2;
      this.aP33[0] = partdis3.this.AV44DisEncCom;
      this.aP34[0] = partdis3.this.AV45DisEncAnh;
      this.aP35[0] = partdis3.this.AV48DisNumCor;
      this.aP36[0] = partdis3.this.AV49DisAncSal1;
      this.aP37[0] = partdis3.this.AV50DisAncSal2;
      this.aP38[0] = partdis3.this.AV51DisAncSal3;
      this.aP39[0] = partdis3.this.AV52DisGraAca2;
      this.aP40[0] = partdis3.this.AV53DisGraCru2;
      this.aP41[0] = partdis3.this.AV54DisGraAca;
      this.aP42[0] = partdis3.this.AV55DisRdoA;
      this.aP43[0] = partdis3.this.AV56DisRdoN;
      this.aP44[0] = partdis3.this.AV58DisObsgrm;
      this.aP45[0] = partdis3.this.AV57DisObsanc;
      this.aP46[0] = partdis3.this.AV59dISITEM5;
      this.aP47[0] = partdis3.this.AV60DisUniMed;
      this.aP48[0] = partdis3.this.AV64DisArtMer;
      this.aP49[0] = partdis3.this.AV46Flag;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17DisArtDsc = "" ;
      AV15DisArtMat = "" ;
      AV47DisPle2 = "" ;
      AV21DisArtLar = "" ;
      AV24DisArtSua = "" ;
      AV25DisArtAca = "" ;
      AV20DisArtPle = "" ;
      AV23DisArtEnc = "" ;
      AV22DisArtCor = "" ;
      AV27DisArtTr1 = "" ;
      AV28DisArtTr2 = "" ;
      AV29DisArtTr3 = "" ;
      AV19DisArtRdt = DecimalUtil.ZERO ;
      AV33DisArtUr1 = "" ;
      AV34DisArtUr2 = "" ;
      AV35DisArtUr3 = "" ;
      AV55DisRdoA = DecimalUtil.ZERO ;
      AV56DisRdoN = DecimalUtil.ZERO ;
      AV58DisObsgrm = "" ;
      AV57DisObsanc = "" ;
      AV59dISITEM5 = "" ;
      AV60DisUniMed = "" ;
      AV64DisArtMer = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P03YN2_A65ArtCod = new String[] {""} ;
      P03YN2_A252CliCod = new int[1] ;
      P03YN2_A396EmprCod = new String[] {""} ;
      P03YN2_A87ArtMat = new String[] {""} ;
      P03YN2_n87ArtMat = new boolean[] {false} ;
      P03YN2_A829TipArtCod = new short[1] ;
      P03YN2_A69ArtDsc = new String[] {""} ;
      P03YN2_n69ArtDsc = new boolean[] {false} ;
      P03YN2_A7415ArtPmlCru = new short[1] ;
      P03YN2_n7415ArtPmlCru = new boolean[] {false} ;
      P03YN2_A1148ArtPml = new short[1] ;
      P03YN2_n1148ArtPml = new boolean[] {false} ;
      P03YN2_A63ArtAcaMin = new short[1] ;
      P03YN2_n63ArtAcaMin = new boolean[] {false} ;
      P03YN2_A62ArtAcaMax = new short[1] ;
      P03YN2_n62ArtAcaMax = new boolean[] {false} ;
      P03YN2_A68ArtCruMin = new short[1] ;
      P03YN2_n68ArtCruMin = new boolean[] {false} ;
      P03YN2_A67ArtCruMax = new short[1] ;
      P03YN2_n67ArtCruMax = new boolean[] {false} ;
      P03YN2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03YN2_n95ArtRen = new boolean[] {false} ;
      P03YN2_A101ArtTipPle = new String[] {""} ;
      P03YN2_n101ArtTipPle = new boolean[] {false} ;
      P03YN2_A100ArtTipLar = new String[] {""} ;
      P03YN2_n100ArtTipLar = new boolean[] {false} ;
      P03YN2_A66ArtCorOri = new String[] {""} ;
      P03YN2_n66ArtCorOri = new boolean[] {false} ;
      P03YN2_A70ArtEncOri = new String[] {""} ;
      P03YN2_n70ArtEncOri = new boolean[] {false} ;
      P03YN2_A96ArtSua = new String[] {""} ;
      P03YN2_n96ArtSua = new boolean[] {false} ;
      P03YN2_A64ArtAcaQui = new String[] {""} ;
      P03YN2_n64ArtAcaQui = new boolean[] {false} ;
      P03YN2_A117ArtUrg = new byte[1] ;
      P03YN2_n117ArtUrg = new boolean[] {false} ;
      P03YN2_A105ArtTra1 = new String[] {""} ;
      P03YN2_n105ArtTra1 = new boolean[] {false} ;
      P03YN2_A106ArtTra2 = new String[] {""} ;
      P03YN2_n106ArtTra2 = new boolean[] {false} ;
      P03YN2_A107ArtTra3 = new String[] {""} ;
      P03YN2_n107ArtTra3 = new boolean[] {false} ;
      P03YN2_A108ArtTraP1 = new short[1] ;
      P03YN2_n108ArtTraP1 = new boolean[] {false} ;
      P03YN2_A109ArtTraP2 = new short[1] ;
      P03YN2_n109ArtTraP2 = new boolean[] {false} ;
      P03YN2_A110ArtTraP3 = new short[1] ;
      P03YN2_n110ArtTraP3 = new boolean[] {false} ;
      P03YN2_A111ArtUrd1 = new String[] {""} ;
      P03YN2_n111ArtUrd1 = new boolean[] {false} ;
      P03YN2_A112ArtUrd2 = new String[] {""} ;
      P03YN2_n112ArtUrd2 = new boolean[] {false} ;
      P03YN2_A113ArtUrd3 = new String[] {""} ;
      P03YN2_n113ArtUrd3 = new boolean[] {false} ;
      P03YN2_A114ArtUrdP1 = new short[1] ;
      P03YN2_n114ArtUrdP1 = new boolean[] {false} ;
      P03YN2_A115ArtUrdP2 = new short[1] ;
      P03YN2_n115ArtUrdP2 = new boolean[] {false} ;
      P03YN2_A116ArtUrdP3 = new short[1] ;
      P03YN2_n116ArtUrdP3 = new boolean[] {false} ;
      P03YN2_A78ArtGraCru = new short[1] ;
      P03YN2_n78ArtGraCru = new boolean[] {false} ;
      P03YN2_A1229ArtEncCom = new short[1] ;
      P03YN2_n1229ArtEncCom = new boolean[] {false} ;
      P03YN2_A1230ArtEncAnh = new short[1] ;
      P03YN2_n1230ArtEncAnh = new boolean[] {false} ;
      P03YN2_A2834ArtPle2 = new String[] {""} ;
      P03YN2_n2834ArtPle2 = new boolean[] {false} ;
      P03YN2_A3122ArtAncSal1 = new short[1] ;
      P03YN2_n3122ArtAncSal1 = new boolean[] {false} ;
      P03YN2_A3123ArtAncSal2 = new short[1] ;
      P03YN2_n3123ArtAncSal2 = new boolean[] {false} ;
      P03YN2_A3124ArtAncSal3 = new short[1] ;
      P03YN2_n3124ArtAncSal3 = new boolean[] {false} ;
      P03YN2_A3126ArtGraCru2 = new short[1] ;
      P03YN2_n3126ArtGraCru2 = new boolean[] {false} ;
      P03YN2_A3121ArtNumCor = new short[1] ;
      P03YN2_n3121ArtNumCor = new boolean[] {false} ;
      P03YN2_A3125ArtGraAca2 = new short[1] ;
      P03YN2_n3125ArtGraAca2 = new boolean[] {false} ;
      P03YN2_A1903ArtGraAca = new short[1] ;
      P03YN2_n1903ArtGraAca = new boolean[] {false} ;
      P03YN2_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03YN2_n1905ArtRdoA = new boolean[] {false} ;
      P03YN2_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03YN2_n1904ArtRdoN = new boolean[] {false} ;
      P03YN2_A398ArtObsAnc = new String[] {""} ;
      P03YN2_n398ArtObsAnc = new boolean[] {false} ;
      P03YN2_A397ArtObsGrm = new String[] {""} ;
      P03YN2_n397ArtObsGrm = new boolean[] {false} ;
      P03YN2_A4980ArtCdb = new String[] {""} ;
      P03YN2_n4980ArtCdb = new boolean[] {false} ;
      P03YN2_A7778ArtUnd = new String[] {""} ;
      P03YN2_n7778ArtUnd = new boolean[] {false} ;
      P03YN2_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03YN2_n88ArtMer = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
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
      A398ArtObsAnc = "" ;
      A397ArtObsGrm = "" ;
      A4980ArtCdb = "" ;
      A7778ArtUnd = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partdis3__default(),
         new Object[] {
             new Object[] {
            P03YN2_A65ArtCod, P03YN2_A252CliCod, P03YN2_A396EmprCod, P03YN2_A87ArtMat, P03YN2_n87ArtMat, P03YN2_A829TipArtCod, P03YN2_A69ArtDsc, P03YN2_n69ArtDsc, P03YN2_A7415ArtPmlCru, P03YN2_n7415ArtPmlCru,
            P03YN2_A1148ArtPml, P03YN2_n1148ArtPml, P03YN2_A63ArtAcaMin, P03YN2_n63ArtAcaMin, P03YN2_A62ArtAcaMax, P03YN2_n62ArtAcaMax, P03YN2_A68ArtCruMin, P03YN2_n68ArtCruMin, P03YN2_A67ArtCruMax, P03YN2_n67ArtCruMax,
            P03YN2_A95ArtRen, P03YN2_n95ArtRen, P03YN2_A101ArtTipPle, P03YN2_n101ArtTipPle, P03YN2_A100ArtTipLar, P03YN2_n100ArtTipLar, P03YN2_A66ArtCorOri, P03YN2_n66ArtCorOri, P03YN2_A70ArtEncOri, P03YN2_n70ArtEncOri,
            P03YN2_A96ArtSua, P03YN2_n96ArtSua, P03YN2_A64ArtAcaQui, P03YN2_n64ArtAcaQui, P03YN2_A117ArtUrg, P03YN2_n117ArtUrg, P03YN2_A105ArtTra1, P03YN2_n105ArtTra1, P03YN2_A106ArtTra2, P03YN2_n106ArtTra2,
            P03YN2_A107ArtTra3, P03YN2_n107ArtTra3, P03YN2_A108ArtTraP1, P03YN2_n108ArtTraP1, P03YN2_A109ArtTraP2, P03YN2_n109ArtTraP2, P03YN2_A110ArtTraP3, P03YN2_n110ArtTraP3, P03YN2_A111ArtUrd1, P03YN2_n111ArtUrd1,
            P03YN2_A112ArtUrd2, P03YN2_n112ArtUrd2, P03YN2_A113ArtUrd3, P03YN2_n113ArtUrd3, P03YN2_A114ArtUrdP1, P03YN2_n114ArtUrdP1, P03YN2_A115ArtUrdP2, P03YN2_n115ArtUrdP2, P03YN2_A116ArtUrdP3, P03YN2_n116ArtUrdP3,
            P03YN2_A78ArtGraCru, P03YN2_n78ArtGraCru, P03YN2_A1229ArtEncCom, P03YN2_n1229ArtEncCom, P03YN2_A1230ArtEncAnh, P03YN2_n1230ArtEncAnh, P03YN2_A2834ArtPle2, P03YN2_n2834ArtPle2, P03YN2_A3122ArtAncSal1, P03YN2_n3122ArtAncSal1,
            P03YN2_A3123ArtAncSal2, P03YN2_n3123ArtAncSal2, P03YN2_A3124ArtAncSal3, P03YN2_n3124ArtAncSal3, P03YN2_A3126ArtGraCru2, P03YN2_n3126ArtGraCru2, P03YN2_A3121ArtNumCor, P03YN2_n3121ArtNumCor, P03YN2_A3125ArtGraAca2, P03YN2_n3125ArtGraAca2,
            P03YN2_A1903ArtGraAca, P03YN2_n1903ArtGraAca, P03YN2_A1905ArtRdoA, P03YN2_n1905ArtRdoA, P03YN2_A1904ArtRdoN, P03YN2_n1904ArtRdoN, P03YN2_A398ArtObsAnc, P03YN2_n398ArtObsAnc, P03YN2_A397ArtObsGrm, P03YN2_n397ArtObsGrm,
            P03YN2_A4980ArtCdb, P03YN2_n4980ArtCdb, P03YN2_A7778ArtUnd, P03YN2_n7778ArtUnd, P03YN2_A88ArtMer, P03YN2_n88ArtMer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26DisArtUrg ;
   private byte AV46Flag ;
   private byte AV61FlagKgs ;
   private byte AV62FlagMts ;
   private byte AV63DatosCrudo ;
   private byte AV65Moda21 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV71GXLvl51 ;
   private byte A117ArtUrg ;
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
   private short A829TipArtCod ;
   private short A7415ArtPmlCru ;
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
   private short A3126ArtGraCru2 ;
   private short A3121ArtNumCor ;
   private short A3125ArtGraAca2 ;
   private short A1903ArtGraAca ;
   private short Gx_err ;
   private int AV67CliCod ;
   private int A252CliCod ;
   private java.math.BigDecimal AV19DisArtRdt ;
   private java.math.BigDecimal AV55DisRdoA ;
   private java.math.BigDecimal AV56DisRdoN ;
   private java.math.BigDecimal AV64DisArtMer ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal A1904ArtRdoN ;
   private java.math.BigDecimal A88ArtMer ;
   private String AV66EmprCod ;
   private String AV68ArtCod ;
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
   private String AV58DisObsgrm ;
   private String AV57DisObsanc ;
   private String AV59dISITEM5 ;
   private String AV60DisUniMed ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
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
   private String A398ArtObsAnc ;
   private String A397ArtObsGrm ;
   private String A4980ArtCdb ;
   private String A7778ArtUnd ;
   private boolean n87ArtMat ;
   private boolean n69ArtDsc ;
   private boolean n7415ArtPmlCru ;
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
   private boolean n3126ArtGraCru2 ;
   private boolean n3121ArtNumCor ;
   private boolean n3125ArtGraAca2 ;
   private boolean n1903ArtGraAca ;
   private boolean n1905ArtRdoA ;
   private boolean n1904ArtRdoN ;
   private boolean n398ArtObsAnc ;
   private boolean n397ArtObsGrm ;
   private boolean n4980ArtCdb ;
   private boolean n7778ArtUnd ;
   private boolean n88ArtMer ;
   private byte[] aP49 ;
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
   private String[] aP44 ;
   private String[] aP45 ;
   private String[] aP46 ;
   private String[] aP47 ;
   private java.math.BigDecimal[] aP48 ;
   private IDataStoreProvider pr_default ;
   private String[] P03YN2_A65ArtCod ;
   private int[] P03YN2_A252CliCod ;
   private String[] P03YN2_A396EmprCod ;
   private String[] P03YN2_A87ArtMat ;
   private boolean[] P03YN2_n87ArtMat ;
   private short[] P03YN2_A829TipArtCod ;
   private String[] P03YN2_A69ArtDsc ;
   private boolean[] P03YN2_n69ArtDsc ;
   private short[] P03YN2_A7415ArtPmlCru ;
   private boolean[] P03YN2_n7415ArtPmlCru ;
   private short[] P03YN2_A1148ArtPml ;
   private boolean[] P03YN2_n1148ArtPml ;
   private short[] P03YN2_A63ArtAcaMin ;
   private boolean[] P03YN2_n63ArtAcaMin ;
   private short[] P03YN2_A62ArtAcaMax ;
   private boolean[] P03YN2_n62ArtAcaMax ;
   private short[] P03YN2_A68ArtCruMin ;
   private boolean[] P03YN2_n68ArtCruMin ;
   private short[] P03YN2_A67ArtCruMax ;
   private boolean[] P03YN2_n67ArtCruMax ;
   private java.math.BigDecimal[] P03YN2_A95ArtRen ;
   private boolean[] P03YN2_n95ArtRen ;
   private String[] P03YN2_A101ArtTipPle ;
   private boolean[] P03YN2_n101ArtTipPle ;
   private String[] P03YN2_A100ArtTipLar ;
   private boolean[] P03YN2_n100ArtTipLar ;
   private String[] P03YN2_A66ArtCorOri ;
   private boolean[] P03YN2_n66ArtCorOri ;
   private String[] P03YN2_A70ArtEncOri ;
   private boolean[] P03YN2_n70ArtEncOri ;
   private String[] P03YN2_A96ArtSua ;
   private boolean[] P03YN2_n96ArtSua ;
   private String[] P03YN2_A64ArtAcaQui ;
   private boolean[] P03YN2_n64ArtAcaQui ;
   private byte[] P03YN2_A117ArtUrg ;
   private boolean[] P03YN2_n117ArtUrg ;
   private String[] P03YN2_A105ArtTra1 ;
   private boolean[] P03YN2_n105ArtTra1 ;
   private String[] P03YN2_A106ArtTra2 ;
   private boolean[] P03YN2_n106ArtTra2 ;
   private String[] P03YN2_A107ArtTra3 ;
   private boolean[] P03YN2_n107ArtTra3 ;
   private short[] P03YN2_A108ArtTraP1 ;
   private boolean[] P03YN2_n108ArtTraP1 ;
   private short[] P03YN2_A109ArtTraP2 ;
   private boolean[] P03YN2_n109ArtTraP2 ;
   private short[] P03YN2_A110ArtTraP3 ;
   private boolean[] P03YN2_n110ArtTraP3 ;
   private String[] P03YN2_A111ArtUrd1 ;
   private boolean[] P03YN2_n111ArtUrd1 ;
   private String[] P03YN2_A112ArtUrd2 ;
   private boolean[] P03YN2_n112ArtUrd2 ;
   private String[] P03YN2_A113ArtUrd3 ;
   private boolean[] P03YN2_n113ArtUrd3 ;
   private short[] P03YN2_A114ArtUrdP1 ;
   private boolean[] P03YN2_n114ArtUrdP1 ;
   private short[] P03YN2_A115ArtUrdP2 ;
   private boolean[] P03YN2_n115ArtUrdP2 ;
   private short[] P03YN2_A116ArtUrdP3 ;
   private boolean[] P03YN2_n116ArtUrdP3 ;
   private short[] P03YN2_A78ArtGraCru ;
   private boolean[] P03YN2_n78ArtGraCru ;
   private short[] P03YN2_A1229ArtEncCom ;
   private boolean[] P03YN2_n1229ArtEncCom ;
   private short[] P03YN2_A1230ArtEncAnh ;
   private boolean[] P03YN2_n1230ArtEncAnh ;
   private String[] P03YN2_A2834ArtPle2 ;
   private boolean[] P03YN2_n2834ArtPle2 ;
   private short[] P03YN2_A3122ArtAncSal1 ;
   private boolean[] P03YN2_n3122ArtAncSal1 ;
   private short[] P03YN2_A3123ArtAncSal2 ;
   private boolean[] P03YN2_n3123ArtAncSal2 ;
   private short[] P03YN2_A3124ArtAncSal3 ;
   private boolean[] P03YN2_n3124ArtAncSal3 ;
   private short[] P03YN2_A3126ArtGraCru2 ;
   private boolean[] P03YN2_n3126ArtGraCru2 ;
   private short[] P03YN2_A3121ArtNumCor ;
   private boolean[] P03YN2_n3121ArtNumCor ;
   private short[] P03YN2_A3125ArtGraAca2 ;
   private boolean[] P03YN2_n3125ArtGraAca2 ;
   private short[] P03YN2_A1903ArtGraAca ;
   private boolean[] P03YN2_n1903ArtGraAca ;
   private java.math.BigDecimal[] P03YN2_A1905ArtRdoA ;
   private boolean[] P03YN2_n1905ArtRdoA ;
   private java.math.BigDecimal[] P03YN2_A1904ArtRdoN ;
   private boolean[] P03YN2_n1904ArtRdoN ;
   private String[] P03YN2_A398ArtObsAnc ;
   private boolean[] P03YN2_n398ArtObsAnc ;
   private String[] P03YN2_A397ArtObsGrm ;
   private boolean[] P03YN2_n397ArtObsGrm ;
   private String[] P03YN2_A4980ArtCdb ;
   private boolean[] P03YN2_n4980ArtCdb ;
   private String[] P03YN2_A7778ArtUnd ;
   private boolean[] P03YN2_n7778ArtUnd ;
   private java.math.BigDecimal[] P03YN2_A88ArtMer ;
   private boolean[] P03YN2_n88ArtMer ;
}

final  class partdis3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03YN2", "SELECT ArtCod, CliCod, EmprCod, ArtMat, TipArtCod, ArtDsc, ArtPmlCru, ArtPml, ArtAcaMin, ArtAcaMax, ArtCruMin, ArtCruMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtUrg, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtGraCru, ArtEncCom, ArtEncAnh, ArtPle2, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraCru2, ArtNumCor, ArtGraAca2, ArtGraAca, ArtRdoA, ArtRdoN, ArtObsAnc, ArtObsGrm, ArtCdb, ArtUnd, ArtMer FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
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
               ((String[]) buf[86])[0] = rslt.getString(46, 20);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(47, 20);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(48, 20);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
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

